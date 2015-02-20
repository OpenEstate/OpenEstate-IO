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

package org.openestate.io.examples;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.io.output.NullWriter;
import org.apache.commons.lang3.StringUtils;
import org.openestate.io.trovit.TrovitDocument;
import org.openestate.io.trovit.TrovitUtils;
import org.openestate.io.trovit.xml.Ad;
import org.openestate.io.trovit.xml.ObjectFactory;
import org.openestate.io.trovit.xml.Trovit;

/**
 * Example for XML writing.
 * <p>
 * This example illustrates the programatic creation of an Trovit document,
 * and how the document is written into XML.
 *
 * @author Andreas Rudolph
 */
public class TrovitWritingExample
{
  private final static ObjectFactory FACTORY = TrovitUtils.getFactory();
  private final static boolean PRETTY_PRINT = true;

  /**
   * Start the example application.
   *
   * @param args
   * command line arguments
   */
  public static void main( String[] args )
  {
    // create an Trovit object with some example data
    Trovit trovit = FACTORY.createTrovit();

    // append some example ads to the transfer
    trovit.getAd().add( createAd() );
    trovit.getAd().add( createAd() );
    trovit.getAd().add( createAd() );

    // convert Trovit object into a XML document
    TrovitDocument doc = null;
    try
    {
      doc = TrovitDocument.newDocument( trovit );
    }
    catch (Exception ex)
    {
      System.err.println( "Can't create XML document!" );
      ex.printStackTrace( System.err );
      System.exit( 1 );
    }

    // write XML document into a java.io.File
    try
    {
      write( doc, File.createTempFile( "trovit-", ".xml" ) );
    }
    catch (IOException ex)
    {
      System.err.println( "Can't create temporary file!" );
      ex.printStackTrace( System.err );
      System.exit( 2 );
    }

    // write XML document into a java.io.OutputStream
    write( doc, new NullOutputStream() );

    // write XML document into a java.io.Writer
    write( doc, new NullWriter() );

    // write XML document into a string and send it to the console
    writeToConsole( doc );
  }

  /**
   * Create an {@link Ad} with some example data.
   *
   * @return
   * an example {@link Ad} object
   */
  protected static Ad createAd()
  {
    // create an example real estate
    Ad ad = FACTORY.createAd();
    ad.setAddress( null );
    ad.setAgency( null );
    ad.setBathrooms( null );
    ad.setCity( null );
    ad.setCityArea( null );
    ad.setCondition( null );
    ad.setContent( null );
    ad.setDate( null );
    ad.setExpirationDate( null );
    ad.setFloorArea( null );
    ad.setFloorNumber( null );
    ad.setForeclosure( null );
    ad.setId( null );
    ad.setIsFurnished( null );
    ad.setIsNew( null );
    ad.setLatitude( null );
    ad.setLongitude( null );
    ad.setMlsDatabase( null );
    ad.setOrientation( null );
    ad.setParking( null );
    ad.setPictures( null );
    ad.setPlotArea( null );
    ad.setPostcode( null );
    ad.setPrice( null );
    ad.setPropertyType( null );
    ad.setRegion( null );
    ad.setRooms( null );
    ad.setTime( null );
    ad.setTitle( null );
    ad.setType( null );
    ad.setUrl( null );
    ad.setVirtualTour( null );
    ad.setYear( null );
    return ad;
  }

  /**
   * Write a {@link TrovitDocument} into a {@link File}.
   *
   * @param doc
   * the document to write
   *
   * @param file
   * the file, where the document is written to
   */
  protected static void write( TrovitDocument doc, File file )
  {
    System.out.println( "writing document" );
    try
    {
      doc.toXml( file, PRETTY_PRINT );
      System.out.println( "> written to: " + file.getAbsolutePath() );
    }
    catch (Exception ex)
    {
      System.err.println( "Can't write document into a file!" );
      ex.printStackTrace( System.err );
      System.exit( 2 );
    }
  }

  /**
   * Write a {@link TrovitDocument} into an {@link OutputStream}.
   *
   * @param doc
   * the document to write
   *
   * @param output
   * the stream, where the document is written to
   */
  protected static void write( TrovitDocument doc, OutputStream output )
  {
    System.out.println( "writing document" );
    try
    {
      doc.toXml( output, PRETTY_PRINT );
      System.out.println( "> written to a java.io.OutputStream" );
    }
    catch (Exception ex)
    {
      System.err.println( "Can't write document into an OutputStream!" );
      ex.printStackTrace( System.err );
      System.exit( 2 );
    }
  }

  /**
   * Write a {@link TrovitDocument} into an {@link Writer}.
   *
   * @param doc
   * the document to write
   *
   * @param output
   * the writer, where the document is written to
   */
  protected static void write( TrovitDocument doc, Writer output )
  {
    System.out.println( "writing document" );
    try
    {
      doc.toXml( output, PRETTY_PRINT );
      System.out.println( "> written to a java.io.Writer" );
    }
    catch (Exception ex)
    {
      System.err.println( "Can't write document into an OutputStream!" );
      ex.printStackTrace( System.err );
      System.exit( 2 );
    }
  }

  /**
   * Write a {@link TrovitDocument} into a {@link String} and print the
   * results to the console.
   *
   * @param doc
   * the document to write
   */
  protected static void writeToConsole( TrovitDocument doc )
  {
    System.out.println( "writing document" );
    try
    {
      String xml = doc.toXmlString( PRETTY_PRINT );
      System.out.println( StringUtils.repeat( "-", 50 ) );
      System.out.println( xml );
      System.out.println( StringUtils.repeat( "-", 50 ) );
    }
    catch (Exception ex)
    {
      System.err.println( "Can't write document into a string!" );
      ex.printStackTrace( System.err );
      System.exit( 2 );
    }
  }
}