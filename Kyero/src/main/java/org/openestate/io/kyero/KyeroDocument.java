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

package org.openestate.io.kyero;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.lang3.StringUtils;
import org.jaxen.JaxenException;
import org.openestate.io.core.ConvertableDocument;
import org.openestate.io.core.DocumentUtils;
import org.openestate.io.kyero.xml.Root;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author Andreas Rudolph
 */
public class KyeroDocument extends ConvertableDocument<Root, KyeroVersion>
{
  private final static Logger LOGGER = LoggerFactory.getLogger(KyeroDocument.class );

  public KyeroDocument( Document document )
  {
    super( document );
    if (!isTransferDocument( document ))
      throw new IllegalArgumentException( "The provided document is invalid!" );
  }

  @Override
  public KyeroVersion getDocumentVersion()
  {
    String version = null;
    try
    {
      Document doc = this.getDocument();
      version = StringUtils.trimToNull( DocumentUtils
        .newXPath( "/oi:root/oi:kyero/oi:feed_version/text()", doc )
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

    KyeroVersion v = KyeroVersion.detectFromString( version );
    if (v!=null) return v;

    LOGGER.warn( "The provided version (" + version + ") is not supported!" );
    return null;
  }

  @Override
  public KyeroVersion getLatestVersion()
  {
    return KyeroVersion.V3;
  }

  public static boolean isTransferDocument( Document doc )
  {
    Element root = DocumentUtils.getRootElement( doc );
    return "root".equals( root.getTagName() );
  }

  public static KyeroDocument newDocument() throws ParserConfigurationException, JAXBException
  {
    return newDocument(KyeroUtils.getFactory().createRoot());
  }

  public static KyeroDocument newDocument( Root root ) throws ParserConfigurationException, JAXBException
  {
    if (root.getKyero()==null)
      root.setKyero( KyeroUtils.getFactory().createKyeroType() );
    if (StringUtils.isBlank( root.getKyero().getFeedVersion() ))
      root.getKyero().setFeedVersion( KyeroUtils.VERSION.toXmlVersion() );

    Document document = DocumentUtils.newDocument();
    KyeroUtils.createMarshaller( "UTF-8", true ).marshal( root, document );
    return new KyeroDocument( document );
  }

  @Override
  public void setDocumentVersion( KyeroVersion version )
  {
    try
    {
      Document doc = this.getDocument();

      Element node = (Element) DocumentUtils
        .newXPath( "/oi:root/oi:kyero/oi:feed_version", doc )
        .selectSingleNode( doc );
      if (node==null)
      {
        Element parentNode = (Element) DocumentUtils
          .newXPath( "/oi:root/oi:kyero", doc )
          .selectSingleNode( doc );
        if (parentNode==null)
        {
          Element grandParentNode = (Element) DocumentUtils
            .newXPath( "/oi:root", doc )
            .selectSingleNode( doc );
          if (grandParentNode==null)
          {
            LOGGER.warn( "Can't find a <root> element in the document!" );
            return;
          }
          parentNode = doc.createElement( "kyero" );
          grandParentNode.insertBefore( parentNode, grandParentNode.getFirstChild() );
        }
        node = doc.createElement( "feed_version" );
        parentNode.insertBefore( node, parentNode.getFirstChild() );
      }

      String newVersion = version.toXmlVersion();
      node.setTextContent( newVersion );
    }
    catch (JaxenException ex)
    {
      LOGGER.error( "Can't evaluate XPath expression!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
    }
  }

  @Override
  public Root toObject() throws JAXBException
  {
    this.upgradeToLatestVersion();
    return (Root) KyeroUtils.createUnmarshaller().unmarshal( this.getDocument() );
  }
}