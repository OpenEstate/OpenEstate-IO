/*
 * Copyright 2015 OpenEstate.org.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openestate.io.openimmo;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.lang3.StringUtils;
import org.jaxen.JaxenException;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.openimmo.xml.Openimmo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * OpenImmo-XML document with a &lt;openimmo&gt; root element.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public class OpenImmoTransferDocument extends OpenImmoDocument<Openimmo>
{
  private final static Logger LOGGER = LoggerFactory.getLogger( OpenImmoTransferDocument.class );

  /**
   * Create from a {@link Document}.
   *
   * @param document
   * the document to create from
   */
  public OpenImmoTransferDocument( Document document )
  {
    super( document );
    if (!isReadable( document ))
      throw new IllegalArgumentException( "The provided document is invalid!" );
  }

  @Override
  public OpenImmoVersion getDocumentVersion()
  {
    String version;
    try
    {
      Document doc = this.getDocument();
      version = StringUtils.trimToNull(XmlUtils
        .newXPath( "/io:openimmo/io:uebertragung/@version", doc )
        .stringValueOf( doc ) );
      if (version==null)
      {
        LOGGER.warn( "Can't find version informations in the XML document!" );
        //System.out.println( "----------------------------" );
        //try
        //{
        //  DocumentUtils.write( doc, System.out );
        //}
        //catch (Exception ex)
        //{
        //  LOGGER.error( "Can't write XML document!" );
        //  LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
        //}
        //System.out.println( "----------------------------" );
        return null;
      }
    }
    catch (JaxenException ex)
    {
      LOGGER.error( "Can't evaluate XPath expression!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }

    OpenImmoVersion v = OpenImmoVersion.detectFromString( version );
    if (v!=null) return v;

    LOGGER.warn( "The provided version (" + version + ") is not supported!" );
    return null;
  }

  /**
   * Checks, if a {@link Document} is readable as a
   * {@link OpenImmoTransferDocument}.
   *
   * @param doc
   * document to check
   *
   * @return
   * true, if the document is usable, otherwise false
   */
  public static boolean isReadable( Document doc )
  {
    Element root = XmlUtils.getRootElement( doc );
    return "openimmo".equals( root.getTagName() );
  }

  /**
   * Creates an empty {@link OpenImmoTransferDocument}.
   *
   * @return
   * created document
   *
   * @throws ParserConfigurationException
   * if the parser is not properly configured
   *
   * @throws JAXBException
   * if a problem with JAXB occured
   */
  public static OpenImmoTransferDocument newDocument() throws ParserConfigurationException, JAXBException
  {
    return newDocument( OpenImmoUtils.getFactory().createOpenimmo() );
  }

  /**
   * Creates a {@link OpenImmoTransferDocument} from a {@link Openimmo} object.
   *
   * @param openimmo
   * Java object, that represents the &lt;openimmo&gt; root element
   *
   * @return
   * created document
   *
   * @throws ParserConfigurationException
   * if the parser is not properly configured
   *
   * @throws JAXBException
   * if a problem with JAXB occured
   */
  public static OpenImmoTransferDocument newDocument( Openimmo openimmo ) throws ParserConfigurationException, JAXBException
  {
    if (openimmo.getUebertragung()==null)
      openimmo.setUebertragung( OpenImmoUtils.getFactory().createUebertragung() );
    if (StringUtils.isBlank( openimmo.getUebertragung().getVersion() ))
      openimmo.getUebertragung().setVersion( OpenImmoUtils.VERSION.toReadableVersion() );

    Document document = XmlUtils.newDocument();
    OpenImmoUtils.createMarshaller( "UTF-8", true ).marshal( openimmo, document );
    return new OpenImmoTransferDocument( document );
  }

  @Override
  public void setDocumentVersion( OpenImmoVersion version )
  {
    try
    {
      Document doc = this.getDocument();

      String currentVersion = StringUtils.trimToEmpty(XmlUtils
        .newXPath( "/io:openimmo/io:uebertragung/@version", doc )
        .stringValueOf( doc ) );
      String[] ver = StringUtils.split( currentVersion, "/", 2 );

      Element node = (Element) XmlUtils
        .newXPath( "/io:openimmo/io:uebertragung", doc )
        .selectSingleNode( doc );
      if (node==null)
      {
        Element parentNode = (Element) XmlUtils
          .newXPath( "/io:openimmo", doc )
          .selectSingleNode( doc );
        if (parentNode==null)
        {
          LOGGER.warn( "Can't find an <openimmo> element in the document!" );
          return;
        }
        node = doc.createElement( "uebertragung" );
        parentNode.insertBefore( node, parentNode.getFirstChild() );
      }

      String newVersion = version.toReadableVersion();
      if (ver.length>1) newVersion += "/" + ver[1];
      node.setAttribute( "version", newVersion );
    }
    catch (JaxenException ex)
    {
      LOGGER.error( "Can't evaluate XPath expression!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
    }
  }

  /**
   * Creates a {@link Openimmo} object from the contained {@link Document}.
   *
   * @return
   * created object, that represents the &lt;openimmo&gt; root element
   *
   * @throws JAXBException
   * if a problem with JAXB occured
   */
  @Override
  public Openimmo toObject() throws JAXBException
  {
    this.upgradeToLatestVersion();
    return (Openimmo) OpenImmoUtils.createUnmarshaller().unmarshal( this.getDocument() );
  }
}