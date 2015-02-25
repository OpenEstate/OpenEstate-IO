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
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.io.output.NullWriter;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openestate.io.daft_ie.DaftIeDocument;
import org.openestate.io.daft_ie.DaftIeUtils;
import org.openestate.io.daft_ie.xml.CommercialType;
import org.openestate.io.daft_ie.xml.Daft;
import org.openestate.io.daft_ie.xml.HouseType;
import org.openestate.io.daft_ie.xml.ObjectFactory;
import org.openestate.io.daft_ie.xml.OverseasRentalAdType;
import org.openestate.io.daft_ie.xml.OverseasSaleAdType;
import org.openestate.io.daft_ie.xml.PropertyType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Example for writing XML files for <a href="http://daft.ie">daft.ie</a>.
 * <p>
 * This example illustrates the programatic creation of documents for
 * <a href="http://daft.ie">daft.ie</a> and how they are written into XML.
 *
 * @author Andreas Rudolph
 */
public class DaftIeWritingExample
{
  private final static Logger LOGGER = LoggerFactory.getLogger( DaftIeWritingExample.class );
  private final static String PACKAGE = "/org/openestate/io/examples";
  private final static ObjectFactory FACTORY = DaftIeUtils.getFactory();
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
      DaftIeWritingExample.class.getResource( PACKAGE + "/log4j.properties" ) );

    // create a Daft object with some example data
    // this object corresponds to the <daft> root element in XML
    Daft daft = FACTORY.createDaft();

    // append some example objectss for rent to the Daft object
    daft.setOverseasRental( FACTORY.createDaftOverseasRental() );
    daft.getOverseasRental().getOverseasRentalAd().add( createAdForRent() );
    daft.getOverseasRental().getOverseasRentalAd().add( createAdForRent() );

    // append some example objectss for sale to the Daft object
    daft.setOverseasSales( FACTORY.createDaftOverseasSales() );
    daft.getOverseasSales().getOverseasSaleAd().add( createAdForSale() );
    daft.getOverseasSales().getOverseasSaleAd().add( createAdForSale() );
    daft.getOverseasSales().getOverseasSaleAd().add( createAdForSale() );

    // convert the Daft object into a XML document
    DaftIeDocument doc = null;
    try
    {
      doc = DaftIeDocument.newDocument( daft );
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
   * Create an {@link OverseasRentalAdType} with some example data.
   *
   * @return
   * created example object
   */
  protected static OverseasRentalAdType createAdForRent()
  {
    // create an example real estate for rent
    OverseasRentalAdType ad = FACTORY.createOverseasRentalAdType();
    ad.setAddress( "Beispielstraße 123");
    ad.setAgentId( "123" );
    ad.setArea( "Berlin" );
    ad.setAvailableFrom( Calendar.getInstance() );
    ad.setBathroomNumber( RandomUtils.nextInt( 0, 5 ) );
    ad.setBedroomNumber( RandomUtils.nextInt( 0, 5 ) );
    ad.setCableTelevision( RandomUtils.nextInt( 0, 2 )==1 );
    ad.setCcEmail( "test@openestate.org" );
    ad.setCommercialType( CommercialType.LAND );
    ad.setContactName( "Max Mustermann" );
    ad.setCountry( "DE" );
    ad.setDescription( "A description about the property." );
    ad.setDishwasher( RandomUtils.nextInt( 0, 2 )==1 );
    ad.setDoubleBeds( RandomUtils.nextInt( 0, 5 ) );
    ad.setDryer( RandomUtils.nextInt( 0, 2 )==1 );
    ad.setExternalId( String.valueOf( RandomUtils.nextInt( 1, 1000 ) ) );
    ad.setFurnished( OverseasRentalAdType.Furnished.FURNISHED );
    ad.setHouseType( HouseType.TOWNHOUSE );
    ad.setLease( RandomUtils.nextInt( 100, 1000 ) );
    ad.setMainEmail( "test@openstate.org" );
    ad.setMicrowave( RandomUtils.nextInt( 0, 2 )==1 );
    ad.setNumberPeople( RandomUtils.nextInt( 0, 5 ) );
    ad.setPhone1( "030/123456" );
    ad.setPhone2( "030/123457" );
    ad.setPhoneInfo( "Some information about contacts via phone." );
    ad.setPropertyType( PropertyType.HOUSE );
    ad.setRegion( "Berlin" );
    ad.setRent( RandomUtils.nextInt( 100, 1000 ) );
    ad.setRentCollectionPeriod( OverseasRentalAdType.RentPeriod.MONTHLY );
    ad.setSingleBeds( RandomUtils.nextInt( 0, 5 ) );
    ad.setTwinBeds( RandomUtils.nextInt( 0, 5 ) );
    ad.setWashingMachine( RandomUtils.nextInt( 0, 2 )==1 );

    // add some features
    ad.setFeatures( FACTORY.createFeaturesType() );
    ad.getFeatures().getFeature().add( "another feature" );
    ad.getFeatures().getFeature().add( "some more feature" );

    // add some photos
    ad.setPhotos( FACTORY.createPhotosType() );
    try
    {
      ad.getPhotos().getPhoto().add( new URL( "http://www.mywebsite.org/image1.jpg" ) );
      ad.getPhotos().getPhoto().add( new URL( "http://www.mywebsite.org/image2.jpg" ) );
      ad.getPhotos().getPhoto().add( new URL( "http://www.mywebsite.org/image3.jpg" ) );
    }
    catch (MalformedURLException ex)
    {
    }

    return ad;
  }

  /**
   * Create an {@link OverseasRentalAdType} with some example data.
   *
   * @return
   * created example object
   */
  protected static OverseasSaleAdType createAdForSale()
  {
    // create an example real estate for sale
    OverseasSaleAdType ad = FACTORY.createOverseasSaleAdType();
    ad.setAcres( RandomUtils.nextDouble( 10, 1000 ) );
    ad.setAddress( "Beispielstraße 123");
    ad.setAgentId( "123" );
    ad.setArea( "Berlin" );
    ad.setBathroomNumber( RandomUtils.nextInt( 0, 5 ) );
    ad.setBedroomNumber( RandomUtils.nextInt( 0, 5 ) );
    ad.setCcEmail( "test@openestate.org" );
    ad.setCo2Rating( "some notes about CO2 rating" );
    ad.setCommercialType( CommercialType.SHOP );
    ad.setContactName( "Max Mustermann" );
    ad.setCountry( "DE" );
    ad.setDescription( "A description about the property." );
    ad.setDirections( "some notes about directions" );
    ad.setEnergyRating( "some notes about energy rating" );
    ad.setExternalId( String.valueOf( RandomUtils.nextInt( 1, 1000 ) ) );
    ad.setHouseType( HouseType.DETACHED );
    ad.setIsNewDevelopment( RandomUtils.nextInt( 0, 2 )==1 );
    ad.setMainEmail( "test@openstate.org" );
    ad.setNewDevelopmentAvailability( "some notes about development" );
    ad.setPhone1( "030/123456" );
    ad.setPhone2( "030/123457" );
    ad.setPhoneInfo( "Some information about contacts via phone." );
    ad.setPrice( RandomUtils.nextInt( 100, 1000000 ) );
    ad.setPriceType( OverseasSaleAdType.PriceType.REGION );
    ad.setPropertyStatus( OverseasSaleAdType.PropertyStatus.FOR_SALE );
    ad.setPropertyType( PropertyType.HOUSE );
    ad.setRegion( "Berlin" );
    ad.setSquareMetres( RandomUtils.nextDouble( 10, 1000 ) );
    ad.setUnitsAvailable( RandomUtils.nextInt( 1, 50 ) );
    ad.setViewingDetails( "some notes about viewing details" );

    // add some features
    ad.setFeatures( FACTORY.createFeaturesType() );
    ad.getFeatures().getFeature().add( "another feature" );
    ad.getFeatures().getFeature().add( "some more feature" );

    // add some pdf documents
    ad.setPdfs( FACTORY.createPdfsType() );
    try
    {
      ad.getPdfs().getPdf().add( new URL( "http://www.mywebsite.org/document1.pdf" ) );
      ad.getPdfs().getPdf().add( new URL( "http://www.mywebsite.org/document2.pdf" ) );
    }
    catch (MalformedURLException ex)
    {
    }

    // add some photos
    ad.setPhotos( FACTORY.createPhotosType() );
    try
    {
      ad.getPhotos().getPhoto().add( new URL( "http://www.mywebsite.org/image1.jpg" ) );
      ad.getPhotos().getPhoto().add( new URL( "http://www.mywebsite.org/image2.jpg" ) );
      ad.getPhotos().getPhoto().add( new URL( "http://www.mywebsite.org/image3.jpg" ) );
    }
    catch (MalformedURLException ex)
    {
    }

    return ad;
  }

  /**
   * Write a {@link DaftIeDocument} into a {@link File}.
   *
   * @param doc
   * the document to write
   *
   * @param file
   * the file, where the document is written to
   */
  protected static void write( DaftIeDocument doc, File file )
  {
    LOGGER.info( "writing document with version " + doc.getDocumentVersion() );
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
   * Write a {@link DaftIeDocument} into an {@link OutputStream}.
   *
   * @param doc
   * the document to write
   *
   * @param output
   * the stream, where the document is written to
   */
  protected static void write( DaftIeDocument doc, OutputStream output )
  {
    LOGGER.info( "writing document with version " + doc.getDocumentVersion() );
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
   * Write a {@link DaftIeDocument} into a {@link Writer}.
   *
   * @param doc
   * the document to write
   *
   * @param output
   * the writer, where the document is written to
   */
  protected static void write( DaftIeDocument doc, Writer output )
  {
    LOGGER.info( "writing document with version " + doc.getDocumentVersion() );
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
   * Write a {@link DaftIeDocument} into a {@link String} and print the
   * results to the console.
   *
   * @param doc
   * the document to write
   */
  protected static void writeToConsole( DaftIeDocument doc )
  {
    LOGGER.info( "writing document with version " + doc.getDocumentVersion() );
    try
    {
      String xml = doc.toXmlString( PRETTY_PRINT );
      LOGGER.info( StringUtils.repeat( "-", 50 )
        + SystemUtils.LINE_SEPARATOR + xml );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Can't write document into a string!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      System.exit( 1 );
    }
  }
}