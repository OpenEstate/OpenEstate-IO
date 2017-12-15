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
import java.math.RoundingMode;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Calendar;
import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.io.output.NullWriter;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openestate.io.examples.utils.RandomStringUtils;
import org.openestate.io.immobar_it.ImmobarItDocument;
import org.openestate.io.immobar_it.ImmobarItUtils;
import org.openestate.io.immobar_it.xml.CompanyType;
import org.openestate.io.immobar_it.xml.ObjectFactory;
import org.openestate.io.immobar_it.xml.PropertyType;
import org.openestate.io.immobar_it.xml.Realestate;
import org.openestate.io.immobar_it.xml.types.ImmotypeValue;
import org.openestate.io.immobar_it.xml.types.RevenuetypeValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Example for writing XML feeds of immobar.it.
 * <p>
 * This example illustrates the programatic creation of immobar.it documents and
 * how they are written into XML.
 *
 * @since 1.4
 * @author Andreas Rudolph
 */
public class ImmobarItWritingExample
{
  private final static Logger LOGGER = LoggerFactory.getLogger( ImmobarItWritingExample.class );
  private final static String PACKAGE = "/org/openestate/io/examples";
  private final static ObjectFactory FACTORY = ImmobarItUtils.getFactory();
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
    PropertyConfigurator.configure( ImmobarItWritingExample.class.getResource( PACKAGE + "/log4j.properties" ) );

    // create a Realestate object with some example data
    // this object corresponds to the <realestate> element in XML
    Realestate realestate = FACTORY.createRealestate();

    // append some example companies to the transfer
    realestate.getCompany().add( createCompany() );
    realestate.getCompany().add( createCompany() );

    // convert the Realestate object into a XML document
    ImmobarItDocument doc = null;
    try
    {
      doc = ImmobarItDocument.newDocument( realestate );
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
   * Create a {@link CompanyType} with some example data.
   *
   * @return
   * created example object
   */
  protected static CompanyType createCompany()
  {
    // create an example company
    CompanyType company = FACTORY.createCompanyType();

    company.setCompanyNameDe( "Name Agentur/Firma deutsch" );
    company.setCompanyAddressDe( "Adresse deutsch" );
    company.setCompanyLocationDe( "Ort und Fraktion deutsch" );

    company.setCompanyNameIt( "Nome agenzia/ditta italiano" );
    company.setCompanyAddressIt( "Indirizzo italiano" );
    company.setCompanyLocationIt( "Localita e frazione italiano" );

    company.setCompanyPostalcode( "39100" );
    company.setCompanyProvince( "BZ" );
    company.setCompanyCountry( "IT" );

    company.setCompanyEmail( "office@domain.com" );
    company.setCompanyPhone( "+39 123 1234567" );
    company.setCompanyMobile( "+39 123 1234567" );
    company.setCompanyFax( "+39 123 1234567" );

    company.setCompanyISTAT( "037011" );

    try
    {
      company.setCompanyWebsite( new URI( "http://www.domain.com" ) );
    }
    catch (URISyntaxException ex)
    {
    }

    // append some example properties to the company
    company.getProperty().add( createProperty() );
    company.getProperty().add( createProperty() );
    company.getProperty().add( createProperty() );

    return company;
  }

  /**
   * Create an {@link PropertyType} with some example data.
   *
   * @return
   * created example object
   */
  protected static PropertyType createProperty()
  {
    // create an example real estate
    PropertyType property = FACTORY.createPropertyType();

    property.setId( RandomStringUtils.random( 5 ) );
    property.setReferencenumber( RandomStringUtils.random( 5 ) );
    property.setISTATcode( RandomStringUtils.randomNumeric( 5 ) );

    property.setAddressDe( "Hauptstr. 5" );
    property.setLocationDe( "Bruneck" );
    property.setDistrictDe( "Dietenheim" );

    property.setAddressIt( "via Centale 5" );
    property.setLocationIt( "Brunico" );
    property.setDistrictIt( "Teodone" );

    property.setPostalcode( RandomStringUtils.randomNumeric( 5 ) );
    property.setProvince( "BZ" );
    property.setCountry( "IT" );

    property.setLatitude( BigDecimal.valueOf( RandomUtils.nextDouble( 0, 180 ) - 90 ) );
    property.setLongitude( BigDecimal.valueOf( RandomUtils.nextDouble( 0, 360 ) - 180 ) );

    property.setTitleDe( "Titel deutsch" );
    property.setDescriptionDe( "Beschreibung..." );
    property.setHeatingDe( "Fernwärme..." );
    property.setKitchentypeDe( "Wohnküche, Kochnische..." );
    property.setParkinglottypeDe( "Parkplatz/Stellplatz überdacht, nicht überdacht, im Freien..." );

    property.setTitleIt( "Titolo italiano" );
    property.setDescriptionIt( "Descrizione..." );
    property.setHeatingIt( "Teleriscaldamento..." );
    property.setKitchentypeIt( "Cucina abitabile, angolo cottura..." );
    property.setParkinglottypeIt( "Parcheggio al coperto, in casa, fuori..." );

    property.setCellar( RandomUtils.nextInt( 0, 2 )==1 );
    property.setCommission( RandomUtils.nextInt( 0, 2 )==1 );
    property.setContactpersonname( "Franz Mair" );
    property.setConvention( RandomUtils.nextInt( 0, 2 )==1 );
    property.setCountbathrooms( BigInteger.valueOf( RandomUtils.nextLong( 0, 10 ) ) );
    property.setCountgarage( BigInteger.valueOf( RandomUtils.nextLong( 0, 10 ) ) );
    property.setCountparkinglot( BigInteger.valueOf( RandomUtils.nextLong( 0, 10 ) ) );
    property.setCountrooms( BigInteger.valueOf( RandomUtils.nextLong( 0, 10 ) ) );
    property.setCountterrace( BigInteger.valueOf( RandomUtils.nextLong( 0, 10 ) ) );
    property.setCreationdate( Calendar.getInstance() );
    property.setDuplex( RandomUtils.nextInt( 0, 2 )==1 );
    property.setElevator( RandomUtils.nextInt( 0, 2 )==1 );
    property.setEnergyclass( "A" );
    property.setFloor( BigInteger.valueOf( RandomUtils.nextLong( 0, 10 ) ) );
    property.setFloorisground( RandomUtils.nextInt( 0, 2 )==1 );
    property.setFlooristop( RandomUtils.nextInt( 0, 2 )==1 );
    property.setFurnished( RandomUtils.nextInt( 0, 2 )==1 );
    property.setGarden( RandomUtils.nextInt( 0, 2 )==1 );
    property.setImmotype( ImmotypeValue.values()[RandomUtils.nextInt( 0, ImmotypeValue.values().length )] );
    property.setIpe( BigDecimal.valueOf( RandomUtils.nextDouble( 0, 1000 ) ).setScale( 2, RoundingMode.HALF_EVEN ) );
    property.setLastmoddate( Calendar.getInstance() );
    property.setPriceNet( BigDecimal.valueOf( RandomUtils.nextDouble( 0, 10000 ) ).setScale( 2, RoundingMode.HALF_EVEN ) );
    property.setPriceOnRequest( RandomUtils.nextInt( 0, 2 )==1 );
    property.setRevenuetype( RevenuetypeValue.values()[RandomUtils.nextInt( 0, RevenuetypeValue.values().length )] );
    property.setSqmCellar( BigDecimal.valueOf( RandomUtils.nextDouble( 0, 100 ) ).setScale( 2, RoundingMode.HALF_EVEN ) );
    property.setSqmGarden( BigDecimal.valueOf( RandomUtils.nextDouble( 0, 100 ) ).setScale( 2, RoundingMode.HALF_EVEN ) );
    property.setSqmGross( BigDecimal.valueOf( RandomUtils.nextDouble( 0, 100 ) ).setScale( 2, RoundingMode.HALF_EVEN ) );
    property.setSqmNet( BigDecimal.valueOf( RandomUtils.nextDouble( 0, 100 ) ).setScale( 2, RoundingMode.HALF_EVEN ) );
    property.setSqmSale( BigDecimal.valueOf( RandomUtils.nextDouble( 0, 100 ) ).setScale( 2, RoundingMode.HALF_EVEN ) );
    property.setUsed( RandomUtils.nextInt( 0, 2 )==1 );
    property.setUtilities( BigDecimal.valueOf( RandomUtils.nextDouble( 0, 100 ) ).setScale( 2, RoundingMode.HALF_EVEN ) );

    try
    {
      for (int i=0; i<8; i++)
      {
        property.getImage().add(
          new URI( "http://www.domain.com/" + property.getId() + "/image" + (i+1) + ".jpg" ) );
      }
      for (int i=0; i<2; i++)
      {
        property.getPlanimetry().add(
          new URI( "http://www.domain.com/" + property.getId() + "/plan" + (i+1) + ".jpg" ));
      }
    }
    catch (URISyntaxException ex)
    {
    }

    return property;
  }

  /**
   * Write a {@link ImmobarItDocument} into a {@link File}.
   *
   * @param doc
   * the document to write
   *
   * @param file
   * the file, where the document is written to
   */
  protected static void write( ImmobarItDocument doc, File file )
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
   * Write a {@link ImmobarItDocument} into an {@link OutputStream}.
   *
   * @param doc
   * the document to write
   *
   * @param output
   * the stream, where the document is written to
   */
  protected static void write( ImmobarItDocument doc, OutputStream output )
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
   * Write a {@link ImmobarItDocument} into a {@link Writer}.
   *
   * @param doc
   * the document to write
   *
   * @param output
   * the writer, where the document is written to
   */
  protected static void write( ImmobarItDocument doc, Writer output )
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
   * Write a {@link ImmobarItDocument} into a {@link String} and print the
   * results to the console.
   *
   * @param doc
   * the document to write
   */
  protected static void writeToConsole( ImmobarItDocument doc )
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