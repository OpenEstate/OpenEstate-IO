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

package org.openestate.io.immobiliare_it;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.lang3.StringUtils;
import org.jaxen.JaxenException;
import org.openestate.io.core.ConvertableDocument;
import org.openestate.io.core.DocumentUtils;
import org.openestate.io.immobiliare_it.xml.Feed;
import org.openestate.io.immobiliare_it.xml.Version;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author Andreas Rudolph
 */
public class ImmobiliareItDocument extends ConvertableDocument<Feed, ImmobiliareItVersion>
{
  private final static Logger LOGGER = LoggerFactory.getLogger( ImmobiliareItDocument.class );

  public ImmobiliareItDocument( Document document )
  {
    super( document );
    if (!isTransferDocument( document ))
      throw new IllegalArgumentException( "The provided document is invalid!" );
  }

  @Override
  public ImmobiliareItVersion getDocumentVersion()
  {
    String version = null;
    try
    {
      Document doc = this.getDocument();
      version = StringUtils.trimToNull( DocumentUtils
        .newXPath( "/oi:feed/oi:version/text()", doc )
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

    ImmobiliareItVersion v = ImmobiliareItVersion.detectFromString( version );
    if (v!=null) return v;

    LOGGER.warn( "The provided version (" + version + ") is not supported!" );
    return null;
  }

  @Override
  public ImmobiliareItVersion getLatestVersion()
  {
    return ImmobiliareItUtils.VERSION;
  }

  public static boolean isTransferDocument( Document doc )
  {
    Element root = DocumentUtils.getRootElement( doc );
    return "feed".equals( root.getTagName() );
  }

  public static ImmobiliareItDocument newDocument() throws ParserConfigurationException, JAXBException
  {
    return newDocument(ImmobiliareItUtils.getFactory().createFeed());
  }

  public static ImmobiliareItDocument newDocument( Feed feed ) throws ParserConfigurationException, JAXBException
  {
    if (feed.getVersion()==null)
      feed.setVersion( Version.V2_5 );

    Document document = DocumentUtils.newDocument();
    ImmobiliareItUtils.createMarshaller( "UTF-8", true ).marshal( feed, document );
    return new ImmobiliareItDocument( document );
  }

  @Override
  public void setDocumentVersion( ImmobiliareItVersion version )
  {
    try
    {
      Document doc = this.getDocument();

      Element node = (Element) DocumentUtils
        .newXPath( "/oi:feed/oi:version", doc )
        .selectSingleNode( doc );
      if (node==null)
      {
        Element parentNode = (Element) DocumentUtils
          .newXPath( "/oi:feed", doc )
          .selectSingleNode( doc );
        if (parentNode==null)
        {
          LOGGER.warn( "Can't find an <daft> element in the document!" );
          return;
        }
        node = doc.createElement( "version" );
        parentNode.insertBefore( node, parentNode.getFirstChild() );
      }

      node.setTextContent( version.toReadableVersion() );
    }
    catch (JaxenException ex)
    {
      LOGGER.error( "Can't evaluate XPath expression!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
    }
  }

  @Override
  public Feed toObject() throws JAXBException
  {
    this.upgradeToLatestVersion();
    return (Feed) ImmobiliareItUtils.createUnmarshaller().unmarshal( this.getDocument() );
  }
}