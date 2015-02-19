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

package org.openestate.io.openimmo.examples;

import java.io.File;
import java.io.IOException;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import org.openestate.io.openimmo.OpenImmoDocument;
import org.openestate.io.openimmo.OpenImmoFeedbackDocument;
import org.openestate.io.openimmo.OpenImmoTransferDocument;
import org.openestate.io.openimmo.OpenImmoUtils;
import org.openestate.io.openimmo.xml.Anbieter;
import org.openestate.io.openimmo.xml.Immobilie;
import org.openestate.io.openimmo.xml.Objekt;
import org.openestate.io.openimmo.xml.Openimmo;
import org.openestate.io.openimmo.xml.OpenimmoFeedback;
import org.xml.sax.SAXException;

/**
 * Example for XML reading.
 * <p>
 * This example illustrates how to read an OpenImmo document from a file.
 *
 * @author Andreas Rudolph
 */
public class OpenImmoReadingExample
{
  /**
   * Start the example application.
   *
   * @param args
   * command line arguments
   */
  public static void main( String[] args )
  {
    if (args.length<1)
    {
      System.out.println( "Please provide at least one OpenImmo file as argument!" );
      System.exit( 1 );
    }
    for (String arg : args)
    {
      try
      {
        read( new File( arg ) );
      }
      catch (Exception ex)
      {
        System.err.println( "The provided file is invalid!" );
        ex.printStackTrace( System.err );
        System.exit( 2 );
      }
    }
  }

  /**
   * Read an OpenImmo file into a {@link TransferDocument} or
   * {@link FeedbackDocument} and prints some of their content to console.
   *
   * @param xmlFile
   * the XML file to read
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
    System.out.println( "process file: " + xmlFile.getAbsolutePath() );
    if (!xmlFile.isFile())
    {
      System.out.println( "> The provided file is invalid!" );
      return;
    }
    OpenImmoDocument doc = OpenImmoUtils.createDocument( xmlFile );
    if (doc==null)
    {
      System.out.println( "> provided XML is not supported" );
    }
    else if (doc.isFeedback())
    {
      System.out.println( "> is feedback XML in version "
        + doc.getDocumentVersion().toReadableVersion() );
      read( (OpenImmoFeedbackDocument) doc );
    }
    else if (doc.isTransfer())
    {
      System.out.println( "> is transfer XML in version "
        + doc.getDocumentVersion().toReadableVersion() );
      read( (OpenImmoTransferDocument) doc );
    }
    else
    {
      System.out.println( "> unsupported type of XML document: "
        + doc.getClass().getName() );
    }
  }

  /**
   * Print the content of a {@link FeedbackDocument} to console.
   *
   * @param doc
   * the document to process
   *
   * @throws JAXBException
   * if XML conversion into Java objects failed
   */
  protected static void read( OpenImmoFeedbackDocument doc ) throws JAXBException
  {
    OpenimmoFeedback feedback = doc.toObject();
    for (Objekt objekt : feedback.getObjekt())
    {
      System.out.println( "> feedback for object "
        + "'" + objekt.getOobjId() + "' "
        + "with title '" + objekt.getBezeichnung() + "'" );
    }
  }

  /**
   * Print the content of a {@link TransferDocument} to console.
   *
   * @param doc
   * the document to process
   *
   * @throws JAXBException
   * if XML conversion into Java objects failed
   */
  protected static void read( OpenImmoTransferDocument doc ) throws JAXBException
  {
    Openimmo openimmo = doc.toObject();

    // process agencies in the document
    for (Anbieter anbieter : openimmo.getAnbieter())
    {
      System.out.println( "> transfer for agency "
        + "'" + anbieter.getAnbieternr() + "'" );

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
        System.out.println( ">> property '" + objectNr + "' "
          + "with title '" + objectTitle + "'" );
      }
    }
  }
}