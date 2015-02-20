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
import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.io.output.NullWriter;
import org.apache.commons.lang3.StringUtils;
import org.openestate.io.immobiliare_it.ImmobiliareItDocument;
import org.openestate.io.immobiliare_it.ImmobiliareItUtils;
import org.openestate.io.immobiliare_it.xml.BusinessElement;
import org.openestate.io.immobiliare_it.xml.Feed;
import org.openestate.io.immobiliare_it.xml.Feed.Properties.Property;
import org.openestate.io.immobiliare_it.xml.ObjectFactory;
import org.openestate.io.immobiliare_it.xml.Operation;
import org.openestate.io.immobiliare_it.xml.PropertyTypeBusiness;
import org.openestate.io.immobiliare_it.xml.PropertyTypeSimple;
import org.openestate.io.immobiliare_it.xml.Status;
import org.openestate.io.immobiliare_it.xml.TerrainType;
import org.openestate.io.immobiliare_it.xml.types.Category;

/**
 * Example for XML writing.
 * <p>
 * This example illustrates the programatic creation of an Trovit document,
 * and how the document is written into XML.
 *
 * @author Andreas Rudolph
 */
public class ImmobiliareItWritingExample
{
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
    // create an Trovit object with some example data
    Feed feed = FACTORY.createFeed();

    // append some rental ads to the transfer
    feed.setProperties( FACTORY.createFeedProperties() );
    feed.getProperties().getProperty().add( createProperty() );
    feed.getProperties().getProperty().add( createProperty() );

    // convert Trovit object into a XML document
    ImmobiliareItDocument doc = null;
    try
    {
      doc = ImmobiliareItDocument.newDocument( feed );
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
   * Create a {@link Property} with some example data.
   *
   * @return
   * an example {@link OverseasRentalAdType} object
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
    obj.setUniqueId( null );

    obj.setAgent( FACTORY.createFeedPropertiesPropertyAgent() );
    obj.getAgent().setEmail( null );
    obj.getAgent().setOfficeName( null );

    obj.setBlueprints( FACTORY.createFeedPropertiesPropertyBlueprints() );
    obj.getBlueprints().getBlueprint().add( null );

    obj.setBuilding( FACTORY.createBuilding() );
    obj.getBuilding().setCategory( null );
    obj.getBuilding().setClazz( null );
    obj.getBuilding().setDetail( null );
    obj.getBuilding().setStatus( null );
    obj.getBuilding().setType( null );

    obj.setExtraFeatures( FACTORY.createFeedPropertiesPropertyExtraFeatures() );
    obj.getExtraFeatures().setAdditionalCosts( null );
    obj.getExtraFeatures().setAirConditioning( null );
    obj.getExtraFeatures().setBalcony( null );
    obj.getExtraFeatures().setBathrooms( null );
    obj.getExtraFeatures().setBeamHeight( null );
    obj.getExtraFeatures().setBedrooms( null );
    obj.getExtraFeatures().setBuildYear( null );
    obj.getExtraFeatures().setDocDescription( null );
    obj.getExtraFeatures().setDocSpecification( null );
    obj.getExtraFeatures().setElevator( null );
    obj.getExtraFeatures().setExternalArea( null );
    obj.getExtraFeatures().setFloor( null );
    obj.getExtraFeatures().setFloorplannerUrl( null );
    obj.getExtraFeatures().setFreeConditions( null );
    obj.getExtraFeatures().setFurniture( null );
    obj.getExtraFeatures().setGarage( null );
    obj.getExtraFeatures().setGarden( null );
    obj.getExtraFeatures().setHeating( null );
    obj.getExtraFeatures().setKitchen( null );
    obj.getExtraFeatures().setNet( null );
    obj.getExtraFeatures().setNumFloors( null );
    obj.getExtraFeatures().setOfficeSize( null );
    obj.getExtraFeatures().setOverheadCrane( null );
    obj.getExtraFeatures().setReception( null );
    obj.getExtraFeatures().setRentContract( null );
    obj.getExtraFeatures().setSecurityAlarm( null );
    obj.getExtraFeatures().setTerrace( null );
    obj.getExtraFeatures().setVirtualTour( null );

    obj.setFeatures( FACTORY.createFeedPropertiesPropertyFeatures() );
    obj.getFeatures().setEnergyClass( null );
    obj.getFeatures().setEnergyPerformance( null );
    obj.getFeatures().setPrice( null );
    obj.getFeatures().setRooms( null );
    obj.getFeatures().setSize( null );

    obj.setLocation( FACTORY.createLocationStructure() );
    obj.getLocation().setAdministrativeArea( null );
    obj.getLocation().setCity( null );
    obj.getLocation().setCountryCode( null );
    obj.getLocation().setLocality( null );
    obj.getLocation().setSubAdministrativeArea( null );

    obj.setPictures( FACTORY.createFeedPropertiesPropertyPictures() );
    obj.getPictures().getPictureUrlAndPicture().add( null );

    obj.setPropertyType( FACTORY.createProptype() );
    obj.getPropertyType().setBusinessType( FACTORY.createBusinessElement() );
    obj.getPropertyType().getBusinessType().setCategory( BusinessElement.BusinessElementCategory.IMMOBILE );
    obj.getPropertyType().getBusinessType().setValue( PropertyTypeBusiness.ALTRO );
    obj.getPropertyType().setTerrains( FACTORY.createTerrains() );
    obj.getPropertyType().getTerrains().getTerrain().add( TerrainType.SEMINATIVO );
    obj.getPropertyType().setType( PropertyTypeSimple.CASA_INDIPENDENTE );

    obj.setTransactionType( FACTORY.createTransactionType() );
    obj.getTransactionType().setAuction( null );
    obj.getTransactionType().setOwnership( null );
    obj.getTransactionType().setValue( null );

    obj.setVideos( FACTORY.createFeedPropertiesPropertyVideos() );
    obj.getVideos().getVideo().add( null );

    return obj;
  }
  /**
   * Write a {@link ImmobiliareItDocument} into a {@link File}.
   *
   * @param doc
   * the document to write
   *
   * @param file
   * the file, where the document is written to
   */
  protected static void write( ImmobiliareItDocument doc, File file )
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
   * Write a {@link ImmobiliareItDocument} into an {@link OutputStream}.
   *
   * @param doc
   * the document to write
   *
   * @param output
   * the stream, where the document is written to
   */
  protected static void write( ImmobiliareItDocument doc, OutputStream output )
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
   * Write a {@link ImmobiliareItDocument} into an {@link Writer}.
   *
   * @param doc
   * the document to write
   *
   * @param output
   * the writer, where the document is written to
   */
  protected static void write( ImmobiliareItDocument doc, Writer output )
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
   * Write a {@link ImmobiliareItDocument} into a {@link String} and print the
   * results to the console.
   *
   * @param doc
   * the document to write
   */
  protected static void writeToConsole( ImmobiliareItDocument doc )
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