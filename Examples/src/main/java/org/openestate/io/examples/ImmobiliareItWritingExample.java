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
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Currency;
import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.io.output.NullWriter;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openestate.io.immobiliare_it.ImmobiliareItDocument;
import org.openestate.io.immobiliare_it.ImmobiliareItUtils;
import org.openestate.io.immobiliare_it.xml.Box;
import org.openestate.io.immobiliare_it.xml.BusinessElement;
import org.openestate.io.immobiliare_it.xml.ClassEnergy;
import org.openestate.io.immobiliare_it.xml.Clazz;
import org.openestate.io.immobiliare_it.xml.Feed;
import org.openestate.io.immobiliare_it.xml.Feed.Properties.Property;
import org.openestate.io.immobiliare_it.xml.Floor;
import org.openestate.io.immobiliare_it.xml.Furniture;
import org.openestate.io.immobiliare_it.xml.Garden;
import org.openestate.io.immobiliare_it.xml.Heat;
import org.openestate.io.immobiliare_it.xml.Kitchen;
import org.openestate.io.immobiliare_it.xml.LocationStructure.Locality.Neighbourhood.LocationNeighbourhoodType;
import org.openestate.io.immobiliare_it.xml.ObjectFactory;
import org.openestate.io.immobiliare_it.xml.Operation;
import org.openestate.io.immobiliare_it.xml.OwnershipType;
import org.openestate.io.immobiliare_it.xml.PictureExtended;
import org.openestate.io.immobiliare_it.xml.PictureProject;
import org.openestate.io.immobiliare_it.xml.PropertyType;
import org.openestate.io.immobiliare_it.xml.PropertyTypeBusiness;
import org.openestate.io.immobiliare_it.xml.PropertyTypeSimple;
import org.openestate.io.immobiliare_it.xml.Rental;
import org.openestate.io.immobiliare_it.xml.Status;
import org.openestate.io.immobiliare_it.xml.TerrainType;
import org.openestate.io.immobiliare_it.xml.VideoProject;
import org.openestate.io.immobiliare_it.xml.VideoType;
import org.openestate.io.immobiliare_it.xml.YesNoReady;
import org.openestate.io.immobiliare_it.xml.types.Category;
import org.openestate.io.immobiliare_it.xml.types.EnergyUnit;
import org.openestate.io.immobiliare_it.xml.types.LandSizeUnit;
import org.openestate.io.immobiliare_it.xml.types.SizeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Example for writing XML files for
 * <a href="http://immobiliare.it">immobiliare.it</a>.
 * <p>
 * This example illustrates the programatic creation of documents for
 * <a href="http://immobiliare.it">immobiliare.it</a> and how they are written
 * into XML.
 *
 * @author Andreas Rudolph
 */
public class ImmobiliareItWritingExample
{
  private final static Logger LOGGER = LoggerFactory.getLogger( ImmobiliareItWritingExample.class );
  private final static String PACKAGE = "/org/openestate/io/examples";
  private final static ObjectFactory FACTORY = ImmobiliareItUtils.getFactory();
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
      ImmobiliareItWritingExample.class.getResource( PACKAGE + "/log4j.properties" ) );

    // create a Feed object with some example data
    // this object corresponds to the <feed> root element in XML
    Feed feed = FACTORY.createFeed();

    // append some example objects to the Feed object
    feed.setProperties( FACTORY.createFeedProperties() );
    feed.getProperties().getProperty().add( createProperty() );
    feed.getProperties().getProperty().add( createProperty() );

    // convert the Feed object into a XML document
    ImmobiliareItDocument doc = null;
    try
    {
      doc = ImmobiliareItDocument.newDocument( feed );
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
   * Create a {@link Property} with some example data.
   *
   * @return
   * created example object
   */
  protected static Property createProperty()
  {
    // create an example real estate for rent
    Property obj = FACTORY.createFeedPropertiesProperty();
    obj.setBuildingStatus( Status.ABITABILE );
    obj.setCategory( Category.COMMERCIALE );
    obj.setDateExpiration( Calendar.getInstance() );
    obj.setDateUpdated( Calendar.getInstance() );
    obj.setOperation( Operation.WRITE );
    obj.setUniqueId( RandomStringUtils.randomAlphanumeric( 5 ) );

    obj.setAgent( FACTORY.createFeedPropertiesPropertyAgent() );
    obj.getAgent().setEmail( "agency@test.org" );
    obj.getAgent().setOfficeName( "agency name" );

    obj.setBlueprints( FACTORY.createFeedPropertiesPropertyBlueprints() );
    obj.getBlueprints().getBlueprint().add( createPictureExtended() );
    obj.getBlueprints().getBlueprint().add( createPictureExtended() );
    obj.getBlueprints().getBlueprint().add( createPictureExtended() );

    obj.setBuilding( FACTORY.createBuilding() );
    obj.getBuilding().setCategory( Category.COMMERCIALE );
    obj.getBuilding().setClazz( Clazz.SIGNORILE);
    obj.getBuilding().setDetail( PropertyTypeBusiness.ALBERGO);
    obj.getBuilding().setStatus( Status.DISCRETO );
    obj.getBuilding().setType( PropertyType.BUNGALOW);

    obj.setExtraFeatures( FACTORY.createFeedPropertiesPropertyExtraFeatures() );
    obj.getExtraFeatures().setAirConditioning( RandomUtils.nextInt( 0, 2 )==1 );
    obj.getExtraFeatures().setBalcony( RandomUtils.nextInt( 0, 2 )==1);
    obj.getExtraFeatures().setBathrooms( BigInteger.valueOf( RandomUtils.nextInt( 1, 5 ) ) );
    obj.getExtraFeatures().setBeamHeight( BigInteger.valueOf( RandomUtils.nextInt( 1, 10 ) ) );
    obj.getExtraFeatures().setBedrooms( BigInteger.valueOf( RandomUtils.nextInt( 1, 5 ) ) );
    obj.getExtraFeatures().setBuildYear( RandomUtils.nextInt( 1900, 2000 ) );
    obj.getExtraFeatures().setDocDescription( "some descriptions" );
    obj.getExtraFeatures().setDocSpecification( "some specifications" );
    obj.getExtraFeatures().setElevator( RandomUtils.nextInt( 0, 2 )==1 );
    obj.getExtraFeatures().setFloorplannerUrl( "http://floorplanner-url.it/" );
    obj.getExtraFeatures().setFreeConditions( "free conditions" );
    obj.getExtraFeatures().setFurniture( Furniture.PARZIALMENTE_ARREDATO );
    obj.getExtraFeatures().setGarden( Garden.NESSUNO );
    obj.getExtraFeatures().setHeating( Heat.AUTONOMO );
    obj.getExtraFeatures().setKitchen( Kitchen.SEMI_ABITABILE );
    obj.getExtraFeatures().setNet( RandomUtils.nextInt( 0, 2 )==1 );
    obj.getExtraFeatures().setNumFloors( BigInteger.valueOf( RandomUtils.nextInt( 1, 5 ) ) );
    obj.getExtraFeatures().setOverheadCrane( YesNoReady.READY );
    obj.getExtraFeatures().setReception( RandomUtils.nextInt( 0, 2 )==1 );
    obj.getExtraFeatures().setRentContract( Rental.LIBERO );
    obj.getExtraFeatures().setSecurityAlarm( RandomUtils.nextInt( 0, 2 )==1 );
    obj.getExtraFeatures().setTerrace( RandomUtils.nextInt( 0, 2 )==1 );
    obj.getExtraFeatures().setVirtualTour( "virtual tour" );

    obj.getExtraFeatures().setAdditionalCosts( FACTORY.createAdditionalCostsType() );
    obj.getExtraFeatures().getAdditionalCosts().setCurrency( Currency.getInstance( "EUR" ) );
    obj.getExtraFeatures().getAdditionalCosts().setValue( BigInteger.valueOf( RandomUtils.nextLong( 0, 5000 ) ) );

    obj.getExtraFeatures().setExternalArea( FACTORY.createLandSizeType() );
    obj.getExtraFeatures().getExternalArea().setUnit( LandSizeUnit.M2 );
    obj.getExtraFeatures().getExternalArea().setValue( BigInteger.valueOf( RandomUtils.nextLong( 50, 5000 ) ) );

    obj.getExtraFeatures().setFloor( FACTORY.createFloor() );
    obj.getExtraFeatures().getFloor().setType( Floor.FloorType.INTERMEDIO );
    obj.getExtraFeatures().getFloor().setValue( BigInteger.valueOf( RandomUtils.nextLong( 0, 10 ) ) );

    obj.getExtraFeatures().setGarage( FACTORY.createBox() );
    obj.getExtraFeatures().getGarage().setType( Box.BoxType.POSTO_AUTO );
    obj.getExtraFeatures().getGarage().setValue( BigInteger.valueOf( RandomUtils.nextLong( 0, 10 ) ) );

    obj.getExtraFeatures().setOfficeSize( FACTORY.createSizeType() );
    obj.getExtraFeatures().getOfficeSize().setUnit( SizeUnit.M2 );
    obj.getExtraFeatures().getOfficeSize().setValue( BigInteger.valueOf( RandomUtils.nextLong( 5, 50 ) ) );

    obj.setFeatures( FACTORY.createFeedPropertiesPropertyFeatures() );
    obj.getFeatures().setEnergyClass( ClassEnergy.D );
    obj.getFeatures().setRooms( RandomUtils.nextInt( 1, 5 ) );

    obj.getFeatures().setEnergyPerformance( FACTORY.createClassEnergyPerformance() );
    obj.getFeatures().getEnergyPerformance().setCertified( RandomUtils.nextInt( 0, 2 )==1 );
    obj.getFeatures().getEnergyPerformance().setUnit( EnergyUnit.KWH_M2ANNO );
    obj.getFeatures().getEnergyPerformance().setValue( "energy performance" );

    obj.getFeatures().setPrice( FACTORY.createPriceType() );
    obj.getFeatures().getPrice().setCurrency( Currency.getInstance( "EUR" ) );
    obj.getFeatures().getPrice().setReserved( RandomUtils.nextInt( 0, 2 )==1 );
    obj.getFeatures().getPrice().setValue( BigInteger.valueOf( RandomUtils.nextLong( 500, 5000000 ) ) );

    obj.getFeatures().setSize( FACTORY.createSizeType() );
    obj.getFeatures().getSize().setUnit( SizeUnit.M2 );
    obj.getFeatures().getSize().setValue( BigInteger.valueOf( RandomUtils.nextLong( 50, 5000 ) ) );

    obj.setLocation( FACTORY.createLocationStructure() );
    obj.getLocation().setAdministrativeArea( "administrative area" );
    obj.getLocation().setCountryCode( "DE" );

    obj.getLocation().setCity( FACTORY.createLocationStructureCity() );
    obj.getLocation().getCity().setCode( BigInteger.ZERO );
    obj.getLocation().getCity().setValue( "Berlin" );

    obj.getLocation().setLocality( FACTORY.createLocationStructureLocality() );
    obj.getLocation().getLocality().setLatitude( RandomUtils.nextDouble( 28, 71 ) );
    obj.getLocation().getLocality().setLongitude( RandomUtils.nextDouble( 0, 38 ) );
    obj.getLocation().getLocality().setPostalCode( "13125" );

    obj.getLocation().getLocality().setNeighbourhood( FACTORY.createLocationStructureLocalityNeighbourhood() );
    obj.getLocation().getLocality().getNeighbourhood().setId( BigInteger.ZERO );
    obj.getLocation().getLocality().getNeighbourhood().setType( LocationNeighbourhoodType.DISTRICT );
    obj.getLocation().getLocality().getNeighbourhood().setValue( "about the neighbourhood" );

    obj.getLocation().getLocality().setThoroughfare( FACTORY.createLocationStructureLocalityThoroughfare() );
    obj.getLocation().getLocality().getThoroughfare().setDisplay( RandomUtils.nextInt( 0, 2 )==1 );
    obj.getLocation().getLocality().getThoroughfare().setValue( "about thoroughfare" );

    obj.getLocation().setSubAdministrativeArea( FACTORY.createLocationStructureSubAdministrativeArea() );
    obj.getLocation().getSubAdministrativeArea().setCode( RandomStringUtils.randomAlphanumeric( 5 ) );
    obj.getLocation().getSubAdministrativeArea().setValue( "Berlin" );

    obj.setPictures( FACTORY.createFeedPropertiesPropertyPictures() );
    obj.getPictures().getPictureUrlAndPicture().add( createPicture() );
    obj.getPictures().getPictureUrlAndPicture().add( createPicture() );
    obj.getPictures().getPictureUrlAndPicture().add( createPicture() );

    obj.setPropertyType( FACTORY.createProptype() );
    obj.getPropertyType().setBusinessType( FACTORY.createBusinessElement() );
    obj.getPropertyType().getBusinessType().setCategory( BusinessElement.BusinessElementCategory.IMMOBILE );
    obj.getPropertyType().getBusinessType().setValue( PropertyTypeBusiness.ALTRO );
    obj.getPropertyType().setTerrains( FACTORY.createTerrains() );
    obj.getPropertyType().getTerrains().getTerrain().add( TerrainType.SEMINATIVO );
    obj.getPropertyType().setType( PropertyTypeSimple.CASA_INDIPENDENTE );

    obj.setTransactionType( FACTORY.createTransactionType() );
    obj.getTransactionType().setAuction( RandomUtils.nextInt( 0, 2 )==1 );
    obj.getTransactionType().setOwnership( OwnershipType.PARZIALE );
    obj.getTransactionType().setValue( "notes about transaction" );

    obj.setVideos( FACTORY.createFeedPropertiesPropertyVideos() );
    obj.getVideos().getVideo().add( createVideo() );
    obj.getVideos().getVideo().add( createVideo() );

    return obj;
  }

  /**
   * Create a {@link PictureProject} with some example data.
   *
   * @return
   * created example object
   */
  protected static PictureProject createPicture()
  {
    PictureProject pic = FACTORY.createPictureProject();
    pic.setPosition( BigInteger.valueOf( RandomUtils.nextInt( 0, 100 ) ) );
    pic.setValue( "image-" + RandomUtils.nextInt( 0, 999 ) + ".jpg" );
    return pic;
  }

  /**
   * Create a {@link PictureExtended} with some example data.
   *
   * @return
   * created example object
   */
  protected static PictureExtended createPictureExtended()
  {
    PictureExtended pic = FACTORY.createPictureExtended();
    pic.setPosition( BigInteger.valueOf( RandomUtils.nextInt( 0, 100 ) ) );
    pic.setValue( "image-" + RandomUtils.nextInt( 0, 999 ) + ".jpg" );
    pic.setUrl( "http://mywebsite.org/" + pic.getValue() );
    return pic;
  }

  /**
   * Create a {@link VideoProject} with some example data.
   *
   * @return
   * created example object
   */
  protected static VideoProject createVideo()
  {
    VideoProject video = FACTORY.createVideoProject();
    video.setType( VideoType.LOCAL );
    video.setValue( "video-" + RandomUtils.nextInt( 0, 999 ) + ".mp4" );
    return video;
  }

  /**
   * Write an {@link ImmobiliareItDocument} into a {@link File}.
   *
   * @param doc
   * the document to write
   *
   * @param file
   * the file, where the document is written to
   */
  protected static void write( ImmobiliareItDocument doc, File file )
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
   * Write an {@link ImmobiliareItDocument} into an {@link OutputStream}.
   *
   * @param doc
   * the document to write
   *
   * @param output
   * the stream, where the document is written to
   */
  protected static void write( ImmobiliareItDocument doc, OutputStream output )
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
   * Write an {@link ImmobiliareItDocument} into a {@link Writer}.
   *
   * @param doc
   * the document to write
   *
   * @param output
   * the writer, where the document is written to
   */
  protected static void write( ImmobiliareItDocument doc, Writer output )
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
   * Write an {@link ImmobiliareItDocument} into a {@link String} and print the
   * results to the console.
   *
   * @param doc
   * the document to write
   */
  protected static void writeToConsole( ImmobiliareItDocument doc )
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