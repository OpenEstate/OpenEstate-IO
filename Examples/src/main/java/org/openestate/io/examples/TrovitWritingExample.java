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
import java.io.OutputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.io.output.NullWriter;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openestate.io.examples.utils.RandomStringUtils;
import org.openestate.io.trovit.TrovitDocument;
import org.openestate.io.trovit.TrovitUtils;
import org.openestate.io.trovit.xml.Ad;
import org.openestate.io.trovit.xml.ObjectFactory;
import org.openestate.io.trovit.xml.Picture;
import org.openestate.io.trovit.xml.Trovit;
import org.openestate.io.trovit.xml.TypeNew;
import org.openestate.io.trovit.xml.types.Action;
import org.openestate.io.trovit.xml.types.IntBool;
import org.openestate.io.trovit.xml.types.PriceInterval;
import org.openestate.io.trovit.xml.types.Unit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Example for writing Trovit XML feeds.
 * <p>
 * This example illustrates the programatic creation of Trovit documents and how
 * they are written into XML.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public class TrovitWritingExample
{
  private final static Logger LOGGER = LoggerFactory.getLogger( TrovitWritingExample.class );
  private final static String PACKAGE = "/org/openestate/io/examples";
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
    // init logging
    PropertyConfigurator.configure(
      TrovitWritingExample.class.getResource( PACKAGE + "/log4j.properties" ) );

    // create a Trovit object with some example data
    // this object corresponds to the <trovit> element in XML
    Trovit trovit = FACTORY.createTrovit();

    // append some example ads to the transfer
    trovit.getAd().add( createAd() );
    trovit.getAd().add( createAd() );
    trovit.getAd().add( createAd() );

    // convert the Trovit object into a XML document
    TrovitDocument doc = null;
    try
    {
      doc = TrovitDocument.newDocument( trovit );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Can't create XML document!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      System.exit( 1 );
    }

    // write XML document into a java.io.File
    try
    {
      write( doc, File.createTempFile( "output-", ".xml" ) );
    }
    catch (IOException ex)
    {
      LOGGER.error( "Can't create temporary file!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      System.exit( 1 );
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
   * created example object
   */
  protected static Ad createAd()
  {
    // create an example real estate
    Ad ad = FACTORY.createAd();
    ad.setAddress( "object address" );
    ad.setAgency( "name of the agency" );
    ad.setBathrooms( BigDecimal.valueOf( RandomUtils.nextDouble( 0, 5 ) ) );
    ad.setCity( "name of the city" );
    ad.setCityArea( "name of the district" );
    ad.setCondition( "some notes about the condition" );
    ad.setContent( "some more descriptions" );
    ad.setDate( Calendar.getInstance() );
    ad.setExpirationDate( Calendar.getInstance() );
    ad.setFloorNumber( "number of floors" );
    ad.setForeclosure( "notes about foreclosure" );
    ad.setId( RandomStringUtils.random( 5 ) );
    ad.setIsFurnished( new IntBool( RandomUtils.nextInt( 0, 2 )==1 ) );
    ad.setIsNew( TypeNew.NEW );
    ad.setLatitude( BigDecimal.valueOf( RandomUtils.nextDouble( 0, 90 ) ) );
    ad.setLongitude( BigDecimal.valueOf( RandomUtils.nextDouble( 0, 90 ) ) );
    ad.setMlsDatabase( "notes about mls database" );
    ad.setOrientation( "notes about orientation" );
    ad.setParking( new IntBool( RandomUtils.nextInt( 0, 2 )==1 ) );
    ad.setPlotArea( BigInteger.valueOf( RandomUtils.nextInt( 100, 5000 ) ) );
    ad.setPostcode( "postcode" );
    ad.setPropertyType( "notes about the property type" );
    ad.setRegion( "notes about the region" );
    ad.setRooms( BigDecimal.valueOf( RandomUtils.nextDouble( 1, 10 ) ) );
    ad.setTime( Calendar.getInstance() );
    ad.setTitle( "title of the object" );
    ad.setType( Action.FOR_RENT );
    ad.setUrl( "http://mywebsite.org/" );
    ad.setVirtualTour( "notes about virtual tour" );
    ad.setYear( RandomUtils.nextInt( 1990, 2010 ) );

    ad.setFloorArea( FACTORY.createFloorArea() );
    ad.getFloorArea().setUnit( Unit.METERS );
    ad.getFloorArea().setValue( BigInteger.valueOf( RandomUtils.nextInt( 10, 10000 ) ) );

    ad.setPictures( FACTORY.createPictures() );
    ad.getPictures().getPicture().add( createPicture() );
    ad.getPictures().getPicture().add( createPicture() );
    ad.getPictures().getPicture().add( createPicture() );

    ad.setPrice( FACTORY.createPrice() );
    ad.getPrice().setPeriod( PriceInterval.MONTHLY );
    ad.getPrice().setValue( BigDecimal.valueOf( RandomUtils.nextDouble( 100, 2000 ) ) );

    return ad;
  }

  /**
   * Create an {@link Picture} with some example data.
   *
   * @return
   * created example object
   */
  protected static Picture createPicture()
  {
    Picture pic = FACTORY.createPicture();
    pic.setPictureTitle( "some descriptive title" );
    pic.setPictureUrl( "http://mywebsite.org/image" + RandomStringUtils.randomNumeric( 5 ) + ".jpg" );
    return pic;
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
    LOGGER.info( "writing document" );
    try
    {
      doc.toXml( file, PRETTY_PRINT );
      LOGGER.info( "> written to: " + file.getAbsolutePath() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Can't write document into a file!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      System.exit( 1 );
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
    LOGGER.info( "writing document" );
    try
    {
      doc.toXml( output, PRETTY_PRINT );
      LOGGER.info( "> written to a java.io.OutputStream" );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Can't write document into an OutputStream!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      System.exit( 1 );
    }
  }

  /**
   * Write a {@link TrovitDocument} into a {@link Writer}.
   *
   * @param doc
   * the document to write
   *
   * @param output
   * the writer, where the document is written to
   */
  protected static void write( TrovitDocument doc, Writer output )
  {
    LOGGER.info( "writing document" );
    try
    {
      doc.toXml( output, PRETTY_PRINT );
      LOGGER.info( "> written to a java.io.Writer" );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Can't write document into an OutputStream!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      System.exit( 1 );
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
    LOGGER.info( "writing document" );
    try
    {
      String xml = doc.toXmlString( PRETTY_PRINT );
      LOGGER.info( StringUtils.repeat( "-", 50 )
        + System.lineSeparator() + xml );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Can't write document into a string!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      System.exit( 1 );
    }
  }
}