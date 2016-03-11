/*
 * Copyright 2015-2016 OpenEstate.org.
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
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.io.output.NullWriter;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openestate.io.kyero.KyeroDocument;
import org.openestate.io.kyero.KyeroUtils;
import org.openestate.io.kyero.KyeroVersion;
import org.openestate.io.kyero.xml.CurrencyType;
import org.openestate.io.kyero.xml.EnergyRatingMarkType;
import org.openestate.io.kyero.xml.ImagesType.Image;
import org.openestate.io.kyero.xml.KyeroType;
import org.openestate.io.kyero.xml.ObjectFactory;
import org.openestate.io.kyero.xml.PriceFreqType;
import org.openestate.io.kyero.xml.PropertyType;
import org.openestate.io.kyero.xml.Root;
import org.openestate.io.kyero.xml.Root.Agent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Example for writing Kyero XML feeds.
 * <p>
 * This example illustrates the programatic creation of Kyero documents, how
 * they are written into XML and how they are downgraded to earlier versions.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public class KyeroWritingExample
{
  private final static Logger LOGGER = LoggerFactory.getLogger( KyeroWritingExample.class );
  private final static String PACKAGE = "/org/openestate/io/examples";
  private final static ObjectFactory FACTORY = KyeroUtils.getFactory();
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
      KyeroWritingExample.class.getResource( PACKAGE + "/log4j.properties" ) );

    // create a Root object with some example data
    // this object corresponds to the <root> element in XML
    Root root = FACTORY.createRoot();
    root.setKyero( createKyero() );
    root.setAgent( createAgent() );
    root.getProperty().add( createProperty() );
    root.getProperty().add( createProperty() );
    root.getProperty().add( createProperty() );

    // convert the Root object into a XML document
    KyeroDocument doc = null;
    try
    {
      doc = KyeroDocument.newDocument( root );
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
    doc.downgrade( KyeroVersion.V2_1 );
    writeToConsole( doc );
  }

  /**
   * Create an {@link Agent} object with some example data.
   *
   * @return
   * created example object
   */
  protected static Agent createAgent()
  {
    Agent agent = FACTORY.createRootAgent();
    agent.setAddr1( "first address line" );
    agent.setAddr2( "second address line" );
    agent.setCountry( "Germany" );
    agent.setEmail( "test@test.org" );
    agent.setFax( "030/123456" );
    agent.setId( BigInteger.valueOf( RandomUtils.nextLong( 1, 10000 ) ) );
    agent.setMob( "030/123457" );
    agent.setName( "name of the company" );
    agent.setPostcode( "12345" );
    agent.setRegion( "Berlin" );
    agent.setTel( "030/123458" );
    agent.setTown( "Berlin" );
    return agent;
  }

  /**
   * Create a {@link KyeroType} object with some example data.
   *
   * @return
   * created example object
   */
  protected static KyeroType createKyero()
  {
    KyeroType kyero = FACTORY.createKyeroType();
    kyero.setFeedGenerated( Calendar.getInstance() );
    kyero.setFeedVersion( KyeroUtils.VERSION.toXmlVersion() );
    return kyero;
  }

  /**
   * Create a {@link PropertyType} object with some example data.
   *
   * @return
   * created example object
   */
  protected static PropertyType createProperty()
  {
    final String id = RandomStringUtils.randomAlphanumeric( 5 );
    int imageCount = 0;

    // create an example real estate
    PropertyType obj = FACTORY.createPropertyType();
    obj.setBaths( BigInteger.valueOf( RandomUtils.nextLong( 0, 5 ) ) );
    obj.setBeds( BigInteger.valueOf( RandomUtils.nextLong( 0, 5 ) ) );
    obj.setCurrency( CurrencyType.EUR );
    obj.setDate( Calendar.getInstance() );
    obj.setId( id );
    obj.setLeasehold( RandomUtils.nextInt( 0, 2 )==1 );
    obj.setLocationDetail( "some details about the location" );
    obj.setNewBuild( RandomUtils.nextInt( 0, 2 )==1 );
    obj.setNotes( "some notes about the property" );
    obj.setPartOwnership( RandomUtils.nextInt( 0, 2 )==1 );
    obj.setPool( RandomUtils.nextInt( 0, 2 )==1 );
    obj.setPrice( RandomUtils.nextLong( 10000, 9999999 ) );
    obj.setPriceFreq( PriceFreqType.SALE );
    obj.setProvince( "Berlin" );
    obj.setRef( RandomStringUtils.randomAlphanumeric( 5 ) );
    obj.setTown( "Berlin" );
    obj.setType( "house" );

    obj.setDesc( FACTORY.createLangType() );
    obj.getDesc().setAr( "Arabic property description" );
    obj.getDesc().setBg( "Bulgarian property description" );
    obj.getDesc().setCa( "Catalan property description" );
    obj.getDesc().setCs( "Czech property description" );
    obj.getDesc().setDa( "Danish property description" );
    obj.getDesc().setDe( "German property description" );
    obj.getDesc().setEl( "Greek property description" );
    obj.getDesc().setEn( "English property description" );
    obj.getDesc().setEs( "Spanish property description" );
    obj.getDesc().setEt( "Estonian property description" );
    obj.getDesc().setFa( "Farsi property description" );
    obj.getDesc().setFi( "Finnish property description" );
    obj.getDesc().setFr( "French property description" );
    obj.getDesc().setHe( "Hebrew property description" );
    obj.getDesc().setHi( "Hindi property description" );
    obj.getDesc().setHu( "Hungarian property description" );
    obj.getDesc().setId( "Indonesian property description" );
    obj.getDesc().setIt( "Italian property description" );
    obj.getDesc().setJa( "Japanese property description" );
    obj.getDesc().setKo( "Korean property description" );
    obj.getDesc().setLt( "Lithuanian property description" );
    obj.getDesc().setLv( "Latvian property description" );
    obj.getDesc().setNl( "Dutch property description" );
    obj.getDesc().setNo( "Norwegian property description" );
    obj.getDesc().setPl( "Polish property description" );
    obj.getDesc().setPt( "Portuguese property description" );
    obj.getDesc().setRo( "Romanian property description" );
    obj.getDesc().setRu( "Russian property description" );
    obj.getDesc().setSk( "Slovak property description" );
    obj.getDesc().setSl( "Slovenian property description" );
    obj.getDesc().setSv( "Swedish property description" );
    obj.getDesc().setTh( "Thai property description" );
    obj.getDesc().setTr( "Turkish property description" );
    obj.getDesc().setUk( "Ukranian property description" );
    obj.getDesc().setVi( "Vietnamese property description" );
    obj.getDesc().setZh( "Simplified Chinese property description" );

    obj.setEnergyRating( FACTORY.createEnergyRatingType() );
    obj.getEnergyRating().setConsumption( EnergyRatingMarkType.C );
    obj.getEnergyRating().setEmissions( EnergyRatingMarkType.E );

    obj.setFeatures( FACTORY.createFeaturesType() );
    obj.getFeatures().getFeature().add( "name of a feature" );
    obj.getFeatures().getFeature().add( "name of another feature" );

    obj.setImages( FACTORY.createImagesType() );
    obj.getImages().getImage().add( createPropertyImage( id, ++imageCount ) );
    obj.getImages().getImage().add( createPropertyImage( id, ++imageCount ) );
    obj.getImages().getImage().add( createPropertyImage( id, ++imageCount ) );

    obj.setLocation( FACTORY.createGpsLocationType() );
    obj.getLocation().setLatitude( BigDecimal.valueOf( RandomUtils.nextDouble( 0, 90 ) ) );
    obj.getLocation().setLongitude( BigDecimal.valueOf( RandomUtils.nextDouble( 0, 90 ) ) );

    obj.setSurfaceArea( FACTORY.createSurfaceType() );
    obj.getSurfaceArea().setBuilt( BigInteger.valueOf( RandomUtils.nextLong( 50, 250 ) ) );
    obj.getSurfaceArea().setPlot( BigInteger.valueOf( RandomUtils.nextLong( 100, 1500 ) ) );

    obj.setUrl( FACTORY.createUrlType() );
    try
    {
      obj.getUrl().setAr( new URL( "http://arabic.website.com/property/"+id+".htm" ) );
      obj.getUrl().setBg( new URL( "http://bulgarian.website.com/property/"+id+".htm" ) );
      obj.getUrl().setCa( new URL( "http://catalan.website.com/property/"+id+".htm" ) );
      obj.getUrl().setCs( new URL( "http://czech.website.com/property/"+id+".htm" ) );
      obj.getUrl().setDa( new URL( "http://danish.website.com/property/"+id+".htm" ) );
      obj.getUrl().setDe( new URL( "http://german.website.com/property/"+id+".htm" ) );
      obj.getUrl().setEl( new URL( "http://greek.website.com/property/"+id+".htm" ) );
      obj.getUrl().setEn( new URL( "http://english.website.com/property/"+id+".htm" ) );
      obj.getUrl().setEs( new URL( "http://spanish.website.com/property/"+id+".htm" ) );
      obj.getUrl().setEt( new URL( "http://estonian.website.com/property/"+id+".htm" ) );
      obj.getUrl().setFa( new URL( "http://farsi.website.com/property/"+id+".htm" ) );
      obj.getUrl().setFi( new URL( "http://finnish.website.com/property/"+id+".htm" ) );
      obj.getUrl().setFr( new URL( "http://french.website.com/property/"+id+".htm" ) );
      obj.getUrl().setHe( new URL( "http://hebrew.website.com/property/"+id+".htm" ) );
      obj.getUrl().setHi( new URL( "http://hindi.website.com/property/"+id+".htm" ) );
      obj.getUrl().setHu( new URL( "http://hungarian.website.com/property/"+id+".htm" ) );
      obj.getUrl().setId( new URL( "http://indonesian.website.com/property/"+id+".htm" ) );
      obj.getUrl().setIt( new URL( "http://italian.website.com/property/"+id+".htm" ) );
      obj.getUrl().setJa( new URL( "http://japanese.website.com/property/"+id+".htm" ) );
      obj.getUrl().setKo( new URL( "http://korean.website.com/property/"+id+".htm" ) );
      obj.getUrl().setLt( new URL( "http://lithunain.website.com/property/"+id+".htm" ) );
      obj.getUrl().setLv( new URL( "http://latvian.website.com/property/"+id+".htm" ) );
      obj.getUrl().setNl( new URL( "http://dutch.website.com/property/"+id+".htm" ) );
      obj.getUrl().setNo( new URL( "http://norwegian.website.com/property/"+id+".htm" ) );
      obj.getUrl().setPl( new URL( "http://polish.website.com/property/"+id+".htm" ) );
      obj.getUrl().setPt( new URL( "http://portuguese.website.com/property/"+id+".htm" ) );
      obj.getUrl().setRo( new URL( "http://romanian.website.com/property/"+id+".htm" ) );
      obj.getUrl().setRu( new URL( "http://russian.website.com/property/"+id+".htm" ) );
      obj.getUrl().setSk( new URL( "http://slovak.website.com/property/"+id+".htm" ) );
      obj.getUrl().setSl( new URL( "http://slovenian.website.com/property/"+id+".htm" ) );
      obj.getUrl().setSv( new URL( "http://swedish.website.com/property/"+id+".htm" ) );
      obj.getUrl().setTh( new URL( "http://thai.website.com/property/"+id+".htm" ) );
      obj.getUrl().setTr( new URL( "http://turkish.website.com/property/"+id+".htm" ) );
      obj.getUrl().setUk( new URL( "http://ukranian.website.com/property/"+id+".htm" ) );
      obj.getUrl().setVi( new URL( "http://vietnamese.website.com/property/"+id+".htm" ) );
      obj.getUrl().setZh( new URL( "http://chinese_simplified.website.com/property/"+id+".htm" ) );
    }
    catch (MalformedURLException ex)
    {}

    return obj;
  }

  /**
   * Create an {@link Image} object with some example data.
   *
   * @return
   * created example object
   */
  protected static Image createPropertyImage( String id, int pos )
  {
    // create an example image
    Image img = FACTORY.createImagesTypeImage();
    img.setId( pos );
    try
    {
      img.setUrl( new URL( "http://website.com/property/" + id + "/image_" + pos + ".jpg" ) );
    }
    catch (MalformedURLException ex)
    {}

    img.setTitle( FACTORY.createLangType() );
    img.getTitle().setAr( "Arabic image title" );
    img.getTitle().setBg( "Bulgarian image title" );
    img.getTitle().setCa( "Catalan image title" );
    img.getTitle().setCs( "Czech image title" );
    img.getTitle().setDa( "Danish image title" );
    img.getTitle().setDe( "German image title" );
    img.getTitle().setEl( "Greek image title" );
    img.getTitle().setEn( "English image title" );
    img.getTitle().setEs( "Spanish image title" );
    img.getTitle().setEt( "Estonian image title" );
    img.getTitle().setFa( "Farsi image title" );
    img.getTitle().setFi( "Finnish image title" );
    img.getTitle().setFr( "French image title" );
    img.getTitle().setHe( "Hebrew image title" );
    img.getTitle().setHi( "Hindi image title" );
    img.getTitle().setHu( "Hungarian image title" );
    img.getTitle().setId( "Indonesian image title" );
    img.getTitle().setIt( "Italian image title" );
    img.getTitle().setJa( "Japanese image title" );
    img.getTitle().setKo( "Korean image title" );
    img.getTitle().setLt( "Lithuanian image title" );
    img.getTitle().setLv( "Latvian image title" );
    img.getTitle().setNl( "Dutch image title" );
    img.getTitle().setNo( "Norwegian image title" );
    img.getTitle().setPl( "Polish image title" );
    img.getTitle().setPt( "Portuguese image title" );
    img.getTitle().setRo( "Romanian image title" );
    img.getTitle().setRu( "Russian image title" );
    img.getTitle().setSk( "Slovak image title" );
    img.getTitle().setSl( "Slovenian image title" );
    img.getTitle().setSv( "Swedish image title" );
    img.getTitle().setTh( "Thai image title" );
    img.getTitle().setTr( "Turkish image title" );
    img.getTitle().setUk( "Ukranian image title" );
    img.getTitle().setVi( "Vietnamese image title" );
    img.getTitle().setZh( "Simplified Chinese image title" );

    return img;
  }

  /**
   * Write a {@link KyeroDocument} into a {@link File}.
   *
   * @param doc
   * the document to write
   *
   * @param file
   * the file, where the document is written to
   */
  protected static void write( KyeroDocument doc, File file )
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
   * Write a {@link KyeroDocument} into an {@link OutputStream}.
   *
   * @param doc
   * the document to write
   *
   * @param output
   * the stream, where the document is written to
   */
  protected static void write( KyeroDocument doc, OutputStream output )
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
   * Write a {@link KyeroDocument} into a {@link Writer}.
   *
   * @param doc
   * the document to write
   *
   * @param output
   * the writer, where the document is written to
   */
  protected static void write( KyeroDocument doc, Writer output )
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
   * Write a {@link KyeroDocument} into a {@link String} and print the
   * results to the console.
   *
   * @param doc
   * the document to write
   */
  protected static void writeToConsole( KyeroDocument doc )
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