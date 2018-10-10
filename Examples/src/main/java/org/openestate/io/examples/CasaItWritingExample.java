/*
 * Copyright 2015-2018 OpenEstate.org.
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
import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.io.output.NullWriter;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openestate.io.casa_it.CasaItDocument;
import org.openestate.io.casa_it.CasaItUtils;
import org.openestate.io.casa_it.xml.Container;
import org.openestate.io.casa_it.xml.Container.Realestateitems.Realestate;
import org.openestate.io.casa_it.xml.Container.Realestateitems.Realestate.Images.Advertismentimage;
import org.openestate.io.casa_it.xml.ObjectFactory;
import org.openestate.io.examples.utils.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Example for writing XML files for <a href="http://casa.it">casa.it</a>.
 * <p>
 * This example illustrates the programatic creation of documents for
 * <a href="http://casa.it">casa.it</a> and how they are written into XML.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public class CasaItWritingExample
{
  private final static Logger LOGGER = LoggerFactory.getLogger( CasaItWritingExample.class );
  private final static String PACKAGE = "/org/openestate/io/examples";
  private final static ObjectFactory FACTORY = CasaItUtils.getFactory();
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
      CasaItWritingExample.class.getResource( PACKAGE + "/log4j.properties" ) );

    // create a Container object with some example data
    // this object corresponds to the <container> root element in XML
    Container container = FACTORY.createContainer();
    container.setRealestateitems( FACTORY.createContainerRealestateitems() );

    // append some example objects to the Container object
    container.getRealestateitems().getRealestate().add( createRealestate() );
    container.getRealestateitems().getRealestate().add( createRealestate() );
    container.getRealestateitems().getRealestate().add( createRealestate() );

    // convert the Container object into a XML document
    CasaItDocument doc = null;
    try
    {
      doc = CasaItDocument.newDocument( container );
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
   * Create a {@link Realestate} with some example data.
   *
   * @return
   * created example object
   */
  protected static Realestate createRealestate()
  {
    // create an example real estate
    Realestate obj = FACTORY.createContainerRealestateitemsRealestate();
    obj.setAction( BigInteger.ONE );
    obj.setAgencycode( 0 );
    obj.setBathrooms( BigInteger.valueOf( RandomUtils.nextLong( 1, 5 ) ) );
    obj.setCondition( BigInteger.ONE );
    obj.setContracttype( BigInteger.ONE );
    obj.setFloor( BigInteger.valueOf( RandomUtils.nextLong( 1, 5 ) ) );
    obj.setHasbalcony( RandomUtils.nextInt( 0, 2 )==1 );
    obj.setHasterrace( RandomUtils.nextInt( 0, 2 )==1 );
    obj.setHeatingtype( BigInteger.ONE );
    obj.setHousetypology( BigInteger.ONE );
    obj.setOccupationstate( BigInteger.ONE );
    obj.setRealestatetype( BigInteger.ONE );
    obj.setReference( RandomStringUtils.random( 5 ) );
    obj.setReferenceID( RandomUtils.nextInt( 1, 1000 ) );
    obj.setRooms( BigInteger.valueOf( RandomUtils.nextLong( 1, 10 ) ) );
    obj.setSize( BigInteger.valueOf( RandomUtils.nextLong( 50, 5000 ) ));

    obj.setAddress( FACTORY.createContainerRealestateitemsRealestateAddress() );
    obj.getAddress().setCity( "Berlin" );
    obj.getAddress().setNumber( "123" );
    obj.getAddress().setStreet( "example street" );
    obj.getAddress().setZip( "12345" );
    obj.getAddress().setZone( "Berlin" );

    obj.setBox( FACTORY.createContainerRealestateitemsRealestateBox() );
    obj.getBox().setSize( BigInteger.valueOf( RandomUtils.nextLong( 50, 1000 ) ) );
    obj.getBox().setType( BigInteger.ONE );

    obj.setBuilding( FACTORY.createContainerRealestateitemsRealestateBuilding() );
    obj.getBuilding().setAge( BigInteger.valueOf( RandomUtils.nextLong( 5, 50 ) ) );
    obj.getBuilding().setExpenses( BigDecimal.valueOf( RandomUtils.nextDouble( 1000, 1000000 ) ) );
    obj.getBuilding().setHaslift( RandomUtils.nextInt( 0, 2 )==1 );
    obj.getBuilding().setTotalfloors( BigInteger.valueOf( RandomUtils.nextLong( 1, 5 ) ) );
    obj.getBuilding().setUnits( BigInteger.ONE );

    obj.setConfiguration( FACTORY.createContainerRealestateitemsRealestateConfiguration() );
    obj.getConfiguration().setIsaddressvisibleonsite( RandomUtils.nextInt( 0, 2 )==1 );
    obj.getConfiguration().setIsmapvisible( RandomUtils.nextInt( 0, 2 )==1 );
    obj.getConfiguration().setIsrealestatevisibleonmap( RandomUtils.nextInt( 0, 2 )==1 );

    obj.setDescription( FACTORY.createContainerRealestateitemsRealestateDescription() );
    obj.getDescription().setValue( "a nice little description for the object" );

    obj.setGarden( FACTORY.createContainerRealestateitemsRealestateGarden() );
    obj.getGarden().setSize( BigInteger.valueOf( RandomUtils.nextLong( 10, 100 ) ) );
    obj.getGarden().setType( BigInteger.ONE );

    obj.setGooglemapcoordinate( FACTORY.createContainerRealestateitemsRealestateGooglemapcoordinate() );
    obj.getGooglemapcoordinate().setLatitude( BigDecimal.valueOf( RandomUtils.nextDouble( 0, 90 ) ) );
    obj.getGooglemapcoordinate().setLatitudemapcenter( BigDecimal.valueOf( RandomUtils.nextDouble( 0, 90 ) ) );
    obj.getGooglemapcoordinate().setLongitude( BigDecimal.valueOf( RandomUtils.nextDouble( 0, 90 ) ) );
    obj.getGooglemapcoordinate().setLongitudemapcenter( BigDecimal.valueOf( RandomUtils.nextDouble( 0, 90 ) ) );
    obj.getGooglemapcoordinate().setMapzoom( 10 );

    obj.setImages( FACTORY.createContainerRealestateitemsRealestateImages() );
    obj.getImages().getAdvertismentimage().add( createAdvertismentimage() );
    obj.getImages().getAdvertismentimage().add( createAdvertismentimage() );
    obj.getImages().getAdvertismentimage().add( createAdvertismentimage() );

    obj.setPrice( FACTORY.createContainerRealestateitemsRealestatePrice() );
    obj.getPrice().setMax( BigDecimal.valueOf( RandomUtils.nextDouble( 1000, 1000000 ) ) );
    obj.getPrice().setMin( BigDecimal.valueOf( RandomUtils.nextDouble( 1000, 1000000 ) ) );
    obj.getPrice().setValue( BigDecimal.valueOf( RandomUtils.nextDouble( 1000, 1000000 ) ) );

    return obj;
  }

  /**
   * Create an {@link Advertismentimage} with some example data.
   *
   * @return
   * created example object
   */
  protected static Advertismentimage createAdvertismentimage()
  {
    Advertismentimage img = FACTORY.createContainerRealestateitemsRealestateImagesAdvertismentimage();
    img.setImagetype( "image/jpeg" );
    img.setPath( "image-" + RandomStringUtils.randomNumeric( 3 ) + ".jpg" );
    return img;
  }

  /**
   * Write a {@link CasaItDocument} into a {@link File}.
   *
   * @param doc
   * the document to write
   *
   * @param file
   * the file, where the document is written to
   */
  protected static void write( CasaItDocument doc, File file )
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
   * Write a {@link CasaItDocument} into an {@link OutputStream}.
   *
   * @param doc
   * the document to write
   *
   * @param output
   * the stream, where the document is written to
   */
  protected static void write( CasaItDocument doc, OutputStream output )
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
   * Write a {@link CasaItDocument} into a {@link Writer}.
   *
   * @param doc
   * the document to write
   *
   * @param output
   * the writer, where the document is written to
   */
  protected static void write( CasaItDocument doc, Writer output )
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
   * Write a {@link CasaItDocument} into a {@link String} and print the
   * results to the console.
   *
   * @param doc
   * the document to write
   */
  protected static void writeToConsole( CasaItDocument doc )
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