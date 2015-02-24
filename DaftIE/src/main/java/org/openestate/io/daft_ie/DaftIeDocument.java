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

package org.openestate.io.daft_ie;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.lang3.StringUtils;
import org.jaxen.JaxenException;
import org.openestate.io.core.ConvertableDocument;
import org.openestate.io.core.DocumentUtils;
import org.openestate.io.daft_ie.xml.Daft;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author Andreas Rudolph
 */
public class DaftIeDocument extends ConvertableDocument<Daft, DaftIeVersion>
{
  private final static Logger LOGGER = LoggerFactory.getLogger( DaftIeDocument.class );

  public DaftIeDocument( Document document )
  {
    super( document );
    if (!isTransferDocument( document ))
      throw new IllegalArgumentException( "The provided document is invalid!" );
  }

  @Override
  public DaftIeVersion getDocumentVersion()
  {
    String version = null;
    try
    {
      Document doc = this.getDocument();
      version = StringUtils.trimToNull( DocumentUtils
        .newXPath( "/oi:daft/@version", doc )
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

    DaftIeVersion v = DaftIeVersion.detectFromString( version );
    if (v!=null) return v;

    LOGGER.warn( "The provided version (" + version + ") is not supported!" );
    return null;
  }

  @Override
  public DaftIeVersion getLatestVersion()
  {
    return DaftIeUtils.VERSION;
  }

  public static boolean isTransferDocument( Document doc )
  {
    Element root = DocumentUtils.getRootElement( doc );
    return "daft".equals( root.getTagName() );
  }

  public static DaftIeDocument newDocument() throws ParserConfigurationException, JAXBException
  {
    return newDocument(DaftIeUtils.getFactory().createDaft());
  }

  public static DaftIeDocument newDocument( Daft daft ) throws ParserConfigurationException, JAXBException
  {
    if (StringUtils.isBlank( daft.getVersion() ))
      daft.setVersion(DaftIeUtils.VERSION.toReadableVersion() );

    Document document = DocumentUtils.newDocument();
    DaftIeUtils.createMarshaller( "UTF-8", true ).marshal( daft, document );
    return new DaftIeDocument( document );
  }

  @Override
  public void setDocumentVersion( DaftIeVersion version )
  {
    try
    {
      Document doc = this.getDocument();

      Element node = (Element) DocumentUtils
        .newXPath( "/oi:daft", doc )
        .selectSingleNode( doc );
      if (node==null)
      {
        LOGGER.warn( "Can't find an <daft> element in the document!" );
        return;
      }

      node.setAttribute( "version", version.toReadableVersion() );
    }
    catch (JaxenException ex)
    {
      LOGGER.error( "Can't evaluate XPath expression!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
    }
  }

  @Override
  public Daft toObject() throws JAXBException
  {
    this.upgradeToLatestVersion();
    return (Daft) DaftIeUtils.createUnmarshaller().unmarshal( this.getDocument() );
  }
}