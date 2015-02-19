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

package org.openestate.io.immoxml;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.lang3.StringUtils;
import org.jaxen.JaxenException;
import org.openestate.io.core.ConvertableDocument;
import org.openestate.io.core.DocumentUtils;
import org.openestate.io.immoxml.xml.Immoxml;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author Andreas Rudolph
 */
public class ImmoXmlDocument extends ConvertableDocument<Immoxml, ImmoXmlVersion>
{
  private final static Logger LOGGER = LoggerFactory.getLogger(ImmoXmlDocument.class );

  public ImmoXmlDocument( Document document )
  {
    super( document );
    if (!isTransferDocument( document ))
      throw new IllegalArgumentException( "The provided document is invalid!" );
  }

  @Override
  public ImmoXmlVersion getDocumentVersion()
  {
    String version = null;
    try
    {
      Document doc = this.getDocument();
      version = StringUtils.trimToNull( DocumentUtils
        .newXPath( "/oi:immoxml/oi:uebertragung/@version", doc )
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

    ImmoXmlVersion v = ImmoXmlVersion.detectFromString( version );
    if (v!=null) return v;

    LOGGER.warn( "The provided version (" + version + ") is not supported!" );
    return null;
  }

  @Override
  public ImmoXmlVersion getLatestVersion()
  {
    return ImmoXmlVersion.V1_1;
  }

  public static boolean isTransferDocument( Document doc )
  {
    Element root = DocumentUtils.getRootElement( doc );
    return "immoxml".equals( root.getTagName() );
  }

  public static ImmoXmlDocument newDocument() throws ParserConfigurationException, JAXBException
  {
    return newDocument(ImmoXmlUtils.getFactory().createImmoxml());
  }

  public static ImmoXmlDocument newDocument( Immoxml immoxml ) throws ParserConfigurationException, JAXBException
  {
    if (immoxml.getUebertragung()==null)
      immoxml.setUebertragung(ImmoXmlUtils.getFactory().createUebertragung() );
    if (StringUtils.isBlank( immoxml.getUebertragung().getVersion() ))
      immoxml.getUebertragung().setVersion(ImmoXmlUtils.VERSION.toReadableVersion() );

    Document document = DocumentUtils.newDocument();
    ImmoXmlUtils.createMarshaller( "UTF-8", true ).marshal( immoxml, document );
    return new ImmoXmlDocument( document );
  }

  @Override
  public void setDocumentVersion( ImmoXmlVersion version )
  {
    try
    {
      Document doc = this.getDocument();

      String currentVersion = StringUtils.trimToEmpty( DocumentUtils
        .newXPath( "/oi:immoxml/oi:uebertragung/@version", doc )
        .stringValueOf( doc ) );
      String[] ver = StringUtils.split( currentVersion, "/", 2 );

      Element node = (Element) DocumentUtils
        .newXPath( "/oi:immoxml/oi:uebertragung", doc )
        .selectSingleNode( doc );
      if (node==null)
      {
        Element parentNode = (Element) DocumentUtils
          .newXPath( "/oi:immoxml", doc )
          .selectSingleNode( doc );
        if (parentNode==null)
        {
          LOGGER.warn( "Can't find an <immoxml> element in the document!" );
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

  @Override
  public Immoxml toObject() throws JAXBException
  {
    this.upgradeToLatestVersion();
    return (Immoxml) ImmoXmlUtils.createUnmarshaller().unmarshal( this.getDocument() );
  }
}