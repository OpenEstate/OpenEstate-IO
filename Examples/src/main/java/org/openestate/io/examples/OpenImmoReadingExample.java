/*
 * Copyright 2015-2017 OpenEstate.org.
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
package org.openestate.io.examples;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openestate.io.openimmo.OpenImmoDocument;
import org.openestate.io.openimmo.OpenImmoFeedbackDocument;
import org.openestate.io.openimmo.OpenImmoTransferDocument;
import org.openestate.io.openimmo.OpenImmoUtils;
import org.openestate.io.openimmo.xml.Anbieter;
import org.openestate.io.openimmo.xml.Immobilie;
import org.openestate.io.openimmo.xml.Objekt;
import org.openestate.io.openimmo.xml.Openimmo;
import org.openestate.io.openimmo.xml.OpenimmoFeedback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

/**
 * Example for reading OpenImmo files.
 * <p>
 * This example illustrates how to read OpenImmo files.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public class OpenImmoReadingExample
{
  private final static Logger LOGGER = LoggerFactory.getLogger( OpenImmoReadingExample.class );
  private final static String PACKAGE = "/org/openestate/io/examples";

  /**
   * Start the example application.
   *
   * @param args
   * command line arguments
   */
  public static void main( String[] args )
  {
    // init logging
    PropertyConfigurator.configure(
      OpenImmoReadingExample.class.getResource( PACKAGE + "/log4j.properties" ) );

    // read example files, if no files were specified as command line arguments
    if (args.length<1)
    {
      try
      {
        read( OpenImmoReadingExample.class.getResourceAsStream( PACKAGE + "/openimmo.xml" ) );
      }
      catch (Exception ex)
      {
        LOGGER.error( "Can't read example transfer file!" );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
        System.exit( 2 );
      }

      try
      {
        read( OpenImmoReadingExample.class.getResourceAsStream( PACKAGE + "/openimmo-feedback.xml" ) );
      }
      catch (Exception ex)
      {
        LOGGER.error( "Can't read example feedback file!" );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
        System.exit( 2 );
      }
    }

    // read files, that were specified as command line arguments
    else
    {
      for (String arg : args)
      {
        try
        {
          read( new File( arg ) );
        }
        catch (Exception ex)
        {
          LOGGER.error( "Can't read file '" + arg + "'!" );
          LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
          System.exit( 2 );
        }
      }
    }
  }

  /**
   * Read a {@link File} into an {@link OpenImmoTransferDocument} or
   * {@link OpenImmoFeedbackDocument} and print some of their content to
   * console.
   *
   * @param xmlFile
   * the file to read
   *
   * @throws SAXException
   * if the file is not readable by the XML parser
   *
   * @throws IOException
   * if the file is not readable
   *
   * @throws ParserConfigurationException
   * if the XML parser is improperly configured
   *
   * @throws JAXBException
   * if XML conversion into Java objects failed
   */
  protected static void read( File xmlFile ) throws SAXException, IOException, ParserConfigurationException, JAXBException
  {
    LOGGER.info( "process file: " + xmlFile.getAbsolutePath() );
    if (!xmlFile.isFile())
    {
      LOGGER.warn( "> provided file is invalid" );
      return;
    }
    OpenImmoDocument doc = OpenImmoUtils.createDocument( xmlFile );
    if (doc==null)
    {
      LOGGER.warn( "> provided XML is not supported" );
    }
    else if (doc.isFeedback())
    {
      printToConsole( (OpenImmoFeedbackDocument) doc );
    }
    else if (doc.isTransfer())
    {
      printToConsole( (OpenImmoTransferDocument) doc );
    }
    else
    {
      LOGGER.warn( "> unsupported type of document: "
        + doc.getClass().getName() );
    }
  }

  /**
   * Read a {@link InputStream} into an {@link OpenImmoTransferDocument} or
   * {@link OpenImmoFeedbackDocument} and print some of their content to
   * console.
   *
   * @param xmlInputStream
   * the input stream to read
   *
   * @throws SAXException
   * if the file is not readable by the XML parser
   *
   * @throws IOException
   * if the file is not readable
   *
   * @throws ParserConfigurationException
   * if the XML parser is improperly configured
   *
   * @throws JAXBException
   * if XML conversion into Java objects failed
   */
  protected static void read( InputStream xmlInputStream ) throws SAXException, IOException, ParserConfigurationException, JAXBException
  {
    LOGGER.info( "process example file" );
    OpenImmoDocument doc = OpenImmoUtils.createDocument( xmlInputStream );
    if (doc==null)
    {
      LOGGER.warn( "> provided XML is not supported" );
    }
    else if (doc.isFeedback())
    {
      printToConsole( (OpenImmoFeedbackDocument) doc );
    }
    else if (doc.isTransfer())
    {
      printToConsole( (OpenImmoTransferDocument) doc );
    }
    else
    {
      LOGGER.warn( "> unsupported type of document: "
        + doc.getClass().getName() );
    }
  }

  /**
   * Print some content of an {@link OpenImmoFeedbackDocument} to console.
   *
   * @param doc
   * the document to process
   *
   * @throws JAXBException
   * if XML conversion into Java objects failed
   */
  protected static void printToConsole( OpenImmoFeedbackDocument doc ) throws JAXBException
  {
    LOGGER.info( "> process feedback document in version "
      + doc.getDocumentVersion() );

    OpenimmoFeedback feedback = doc.toObject();
    for (Objekt objekt : feedback.getObjekt())
    {
      // get object nr
      String objectNr = (!StringUtils.isBlank( objekt.getOobjId() ))?
        objekt.getOobjId().trim(): "???";

      // get object title
      String objectTitle = (!StringUtils.isBlank( objekt.getBezeichnung() ))?
        objekt.getBezeichnung().trim(): "???";

      LOGGER.info( ">> feedback for object '" + objectNr + "' "
        + "with title '" + objectTitle + "'" );
    }
  }

  /**
   * Print some content of an {@link OpenImmoTransferDocument} to console.
   *
   * @param doc
   * the document to process
   *
   * @throws JAXBException
   * if XML conversion into Java objects failed
   */
  protected static void printToConsole( OpenImmoTransferDocument doc ) throws JAXBException
  {
    LOGGER.info( "> process transfer document in version "
      + doc.getDocumentVersion() );

    Openimmo openimmo = doc.toObject();

    // process agencies in the document
    for (Anbieter anbieter : openimmo.getAnbieter())
    {
      LOGGER.info( ">> found agency '" + anbieter.getAnbieternr() + "'" );

      // process real estates of the agency
      for (Immobilie immobilie : anbieter.getImmobilie())
      {
        // get object nr
        String objectNr = (immobilie.getVerwaltungTechn()!=null)?
          immobilie.getVerwaltungTechn().getObjektnrIntern(): "???";

        // get object title
        String objectTitle = (immobilie.getFreitexte()!=null)?
          immobilie.getFreitexte().getObjekttitel(): "???";

        // print object informations to console
        LOGGER.info( ">>> found object '" + objectNr + "' "
          + "with title '" + objectTitle + "'" );
      }
    }
  }
}