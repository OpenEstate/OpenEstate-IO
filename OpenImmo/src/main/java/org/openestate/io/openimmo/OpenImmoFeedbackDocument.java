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
import org.openestate.io.core.DocumentUtils;
import org.openestate.io.openimmo.xml.OpenimmoFeedback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author Andreas Rudolph
 */
public class OpenImmoFeedbackDocument extends OpenImmoDocument<OpenimmoFeedback>
{
  private final static Logger LOGGER = LoggerFactory.getLogger(OpenImmoFeedbackDocument.class );

  public OpenImmoFeedbackDocument( Document document )
  {
    super( document );
    if (!isFeedbackDocument( document ))
      throw new IllegalArgumentException( "The provided document is invalid!" );
  }

  @Override
  public OpenImmoVersion getDocumentVersion()
  {
    String version = null;
    try
    {
      Document doc = this.getDocument();

      Element node = (Element) DocumentUtils
        .newXPath( "/oi:openimmo_feedback/oi:version", doc )
        .selectSingleNode( doc );

      // versions older then 1.2.4 do not support the <version> element
      // - version 1.2.3 is assumed, when no <version> element is present and
      //   an empty namespace is used
      // - version 1.2.0 is assumed, when no <version> element is present and
      //   the old namespace is used
      if (node==null)
      {
        Element root = DocumentUtils.getRootElement( doc );
        return (OpenImmoUtils.OLD_NAMESPACE.equalsIgnoreCase( root.getNamespaceURI() ))?
          OpenImmoVersion.V1_2_0: OpenImmoVersion.V1_2_3;
      }

      version = StringUtils.trimToNull( node.getTextContent() );
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

  public static boolean isFeedbackDocument( Document doc )
  {
    Element root = DocumentUtils.getRootElement( doc );
    return "openimmo_feedback".equals( root.getTagName() );
  }

  public static OpenImmoFeedbackDocument newDocument() throws ParserConfigurationException, JAXBException
  {
    return newDocument( OpenImmoUtils.getFactory().createOpenimmoFeedback() );
  }

  public static OpenImmoFeedbackDocument newDocument( OpenimmoFeedback feedback ) throws ParserConfigurationException, JAXBException
  {
    if (StringUtils.isBlank( feedback.getVersion() ))
      feedback.setVersion( OpenImmoUtils.VERSION.toReadableVersion() );

    Document document = DocumentUtils.newDocument();
    OpenImmoUtils.createMarshaller( "UTF-8", true ).marshal( feedback, document );
    return new OpenImmoFeedbackDocument( document );
  }

  @Override
  public void setDocumentVersion( OpenImmoVersion version )
  {
    try
    {
      Document doc = this.getDocument();

      String currentVersion = StringUtils.trimToEmpty( DocumentUtils
        .newXPath( "/oi:openimmo/oi:uebertragung/@version", doc )
        .stringValueOf( doc ) );
      String[] ver = StringUtils.split( currentVersion, "/", 2 );

      Element node = (Element) DocumentUtils
        .newXPath( "/oi:openimmo_feedback/oi:version", doc )
        .selectSingleNode( doc );

      // versions older then 1.2.4 do not support the <version> element
      if (OpenImmoVersion.V1_2_4.isNewerThen( version ))
      {
        if (node!=null)
        {
          Element root = DocumentUtils.getRootElement( doc );
          root.removeChild( node );
        }
        return;
      }

      if (node==null)
      {
        Element parentNode = (Element) DocumentUtils
          .newXPath( "/oi:openimmo_feedback", doc )
          .selectSingleNode( doc );
        if (parentNode==null)
        {
          LOGGER.warn( "Can't find an <openimmo_feedback> element in the document!" );
          return;
        }
        node = doc.createElement( "version" );
        parentNode.insertBefore( node, parentNode.getFirstChild() );
      }

      String newVersion = version.toReadableVersion();
      if (ver.length>1) newVersion += "/" + ver[1];
      node.setTextContent( newVersion );
    }
    catch (JaxenException ex)
    {
      LOGGER.error( "Can't evaluate XPath expression!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
    }
  }

  @Override
  public OpenimmoFeedback toObject() throws JAXBException
  {
    this.upgradeToLatestVersion();
    return (OpenimmoFeedback) OpenImmoUtils.createUnmarshaller().unmarshal( this.getDocument() );
  }
}