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
import java.util.Calendar;
import java.util.Locale;
import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.io.output.NullWriter;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openestate.io.openimmo.OpenImmoTransferDocument;
import org.openestate.io.openimmo.OpenImmoUtils;
import org.openestate.io.openimmo.OpenImmoVersion;
import org.openestate.io.openimmo.xml.Aktion;
import org.openestate.io.openimmo.xml.Anbieter;
import org.openestate.io.openimmo.xml.Haus;
import org.openestate.io.openimmo.xml.Immobilie;
import org.openestate.io.openimmo.xml.ObjectFactory;
import org.openestate.io.openimmo.xml.Openimmo;
import org.openestate.io.openimmo.xml.Uebertragung;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Example for writing OpenImmo files.
 * <p>
 * This example illustrates the programatic creation of OpenImmo documents, how
 * they are written into XML and how they are downgraded to earlier versions.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public class OpenImmoWritingExample
{
  private final static Logger LOGGER = LoggerFactory.getLogger( OpenImmoWritingExample.class );
  private final static String PACKAGE = "/org/openestate/io/examples";
  private final static ObjectFactory FACTORY = OpenImmoUtils.getFactory();
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
      OpenImmoWritingExample.class.getResource( PACKAGE + "/log4j.properties" ) );

    // create an Openimmo object with some example data
    // this object corresponds to the <openimmo> root element in XML
    Openimmo openimmo = FACTORY.createOpenimmo();
    openimmo.setUebertragung( createUebertragung() );
    openimmo.getAnbieter().add( createAnbieter() );

    // convert the Openimmo object into a XML document
    OpenImmoTransferDocument doc = null;
    try
    {
      doc = OpenImmoTransferDocument.newDocument( openimmo );
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

    // downgrade XML document to an earlier version
    // and write it to the console
    doc.downgrade( OpenImmoVersion.V1_2_3 );
    writeToConsole( doc );

    // downgrade XML document to the first version
    // and write it to the console
    doc.downgrade( OpenImmoVersion.V1_1 );
    writeToConsole( doc );
  }

  /**
   * Create an {@link Anbieter} with some example data.
   *
   * @return
   * created example object
   */
  protected static Anbieter createAnbieter()
  {
    // create an example agency
    Anbieter anbieter = FACTORY.createAnbieter();
    anbieter.setAnbieternr( "123456" );
    anbieter.setFirma( "Agency Name" );
    anbieter.setOpenimmoAnid( "123456");

    // add some real estates to the agency
    anbieter.getImmobilie().add( createImmobilie() );
    anbieter.getImmobilie().add( createImmobilie() );

    return anbieter;
  }

  /**
   * Create an {@link Immobilie} with some example data.
   *
   * @return
   * created example object
   */
  protected static Immobilie createImmobilie()
  {
    // create an example real estate
    Immobilie immobilie = FACTORY.createImmobilie();

    // add some administrative informations
    immobilie.setVerwaltungTechn( FACTORY.createVerwaltungTechn() );
    immobilie.getVerwaltungTechn().setAktion( FACTORY.createAktion() );
    immobilie.getVerwaltungTechn().getAktion().setAktionart( Aktion.AktionArt.CHANGE );
    immobilie.getVerwaltungTechn().setObjektnrIntern( RandomStringUtils.randomNumeric( 10 ) );

    // set categorization
    immobilie.setObjektkategorie( FACTORY.createObjektkategorie() );
    immobilie.getObjektkategorie().setNutzungsart( FACTORY.createNutzungsart() );
    immobilie.getObjektkategorie().getNutzungsart().setANLAGE( RandomUtils.nextInt( 0, 2 )==1 );
    immobilie.getObjektkategorie().getNutzungsart().setGEWERBE( RandomUtils.nextInt( 0, 2 )==1 );
    immobilie.getObjektkategorie().getNutzungsart().setWAZ( RandomUtils.nextInt( 0, 2 )==1 );
    immobilie.getObjektkategorie().getNutzungsart().setWOHNEN( RandomUtils.nextInt( 0, 2 )==1 );
    immobilie.getObjektkategorie().setVermarktungsart( FACTORY.createVermarktungsart() );
    immobilie.getObjektkategorie().getVermarktungsart().setKAUF( true );
    immobilie.getObjektkategorie().setObjektart( FACTORY.createObjektart() );

    Haus singleFamilyHouse = FACTORY.createHaus();
    singleFamilyHouse.setHaustyp( Haus.Haustyp.EINFAMILIENHAUS );
    immobilie.getObjektkategorie().getObjektart().getHaus().add( singleFamilyHouse );

    // add some informations about the location
    immobilie.setGeo( FACTORY.createGeo() );
    immobilie.getGeo().setPlz( RandomStringUtils.randomNumeric( 5 ) );
    immobilie.getGeo().setOrt( "Berlin" );
    immobilie.getGeo().setLand( FACTORY.createLand() );
    immobilie.getGeo().getLand().setIsoLand( Locale.GERMANY.getISO3Country() );

    // add some informations about prices
    immobilie.setPreise( FACTORY.createPreise() );
    immobilie.getPreise().setHeizkosten( 456.0 );
    immobilie.getPreise().setKaufpreis( FACTORY.createKaufpreis() );
    immobilie.getPreise().getKaufpreis().setAufAnfrage( false );
    immobilie.getPreise().getKaufpreis().setValue( 123456.79 );

    // add some informations about features
    immobilie.setAusstattung( FACTORY.createAusstattung() );
    immobilie.getAusstattung().setGaestewc( true );
    immobilie.getAusstattung().setGartennutzung( true );
    immobilie.getAusstattung().setHeizungsart( FACTORY.createHeizungsart() );
    immobilie.getAusstattung().getHeizungsart().setZENTRAL( true );
    immobilie.getAusstattung().getHeizungsart().setFUSSBODEN( true );

    // add some descriptions
    immobilie.setFreitexte( FACTORY.createFreitexte() );
    immobilie.getFreitexte().setObjekttitel( "A title for the property." );
    immobilie.getFreitexte().setObjektbeschreibung( "Some longer descriptive text about the property." );

    // set the contact person
    immobilie.setKontaktperson( FACTORY.createKontaktperson() );
    immobilie.getKontaktperson().setName( "Max Mustermann" );
    immobilie.getKontaktperson().setEmailFeedback( "max@mustermann.org" );
    immobilie.getKontaktperson().setTelDurchw( "030/123456789" );
    immobilie.getKontaktperson().setPlz( RandomStringUtils.randomNumeric( 5 ) );
    immobilie.getKontaktperson().setOrt( "Berlin" );
    immobilie.getKontaktperson().setLand( FACTORY.createLand() );
    immobilie.getKontaktperson().getLand().setIsoLand( Locale.GERMANY.getISO3Country() );

    return immobilie;
  }

  /**
   * Create an {@link Uebertragung} with some example data.
   *
   * @return
   * created example object
   */
  protected static Uebertragung createUebertragung()
  {
    // create an example transfer
    Uebertragung uebertragung = FACTORY.createUebertragung();
    uebertragung.setArt( Uebertragung.Art.OFFLINE );
    uebertragung.setModus( Uebertragung.Modus.NEW );
    uebertragung.setSendersoftware( "OpenEstate.org" );
    uebertragung.setSenderversion( "1.0-SNAPSHOT" );
    uebertragung.setTechnEmail( "info@openestate.org" );
    uebertragung.setTimestamp( Calendar.getInstance() );
    uebertragung.setUmfang( Uebertragung.Umfang.VOLL );
    return uebertragung;
  }

  /**
   * Write an {@link OpenImmoTransferDocument} into a {@link File}.
   *
   * @param doc
   * the document to write
   *
   * @param file
   * the file, where the document is written to
   */
  protected static void write( OpenImmoTransferDocument doc, File file )
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
   * Write an {@link OpenImmoTransferDocument} into an {@link OutputStream}.
   *
   * @param doc
   * the document to write
   *
   * @param output
   * the stream, where the document is written to
   */
  protected static void write( OpenImmoTransferDocument doc, OutputStream output )
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
   * Write an {@link OpenImmoTransferDocument} into a {@link Writer}.
   *
   * @param doc
   * the document to write
   *
   * @param output
   * the writer, where the document is written to
   */
  protected static void write( OpenImmoTransferDocument doc, Writer output )
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
   * Write an {@link OpenImmoTransferDocument} into a {@link String} and print the
   * results to the console.
   *
   * @param doc
   * the document to write
   */
  protected static void writeToConsole( OpenImmoTransferDocument doc )
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