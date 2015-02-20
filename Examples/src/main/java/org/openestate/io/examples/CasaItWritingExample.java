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
import org.openestate.io.casa_it.CasaItDocument;
import org.openestate.io.casa_it.CasaItUtils;
import org.openestate.io.casa_it.xml.Container;
import org.openestate.io.casa_it.xml.Container.Realestateitems.Realestate;
import org.openestate.io.casa_it.xml.ObjectFactory;

/**
 * Example for XML writing.
 * <p>
 * This example illustrates the programatic creation of an casa.it document,
 * and how the document is written into XML.
 *
 * @author Andreas Rudolph
 */
public class CasaItWritingExample
{
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
    // create an casa.it object with some example data
    Container container = FACTORY.createContainer();
    container.setRealestateitems( FACTORY.createContainerRealestateitems() );

    // append some example ads to the transfer
    container.getRealestateitems().getRealestate().add( createRealestate() );
    container.getRealestateitems().getRealestate().add( createRealestate() );
    container.getRealestateitems().getRealestate().add( createRealestate() );

    // convert casa.it object into a XML document
    CasaItDocument doc = null;
    try
    {
      doc = CasaItDocument.newDocument( container );
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
      write( doc, File.createTempFile( "casa-it-", ".xml" ) );
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
  protected static Realestate createRealestate()
  {
    // create an example real estate
    Realestate obj = FACTORY.createContainerRealestateitemsRealestate();
    obj.setAction( null );
    obj.setAddress( null );
    obj.setAgencycode( 0 );
    obj.setBathrooms( null );
    obj.setBox( null );
    obj.setBuilding( null );
    obj.setCondition( null );
    obj.setConfiguration( null );
    obj.setContracttype( null );
    obj.setDescription( null );
    obj.setFloor( null );
    obj.setGarden( null );
    obj.setGooglemapcoordinate( null );
    obj.setHasbalcony( null );
    obj.setHasterrace( null );
    obj.setHeatingtype( null );
    obj.setHousetypology( null );
    obj.setImages( null );
    obj.setOccupationstate( null );
    obj.setPrice( null );
    obj.setRealestatetype( null );
    obj.setReference( null );
    obj.setReferenceID( null );
    obj.setRooms( null );
    obj.setSize( null );
    return obj;
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
   * Write a {@link CasaItDocument} into an {@link Writer}.
   *
   * @param doc
   * the document to write
   *
   * @param output
   * the writer, where the document is written to
   */
  protected static void write( CasaItDocument doc, Writer output )
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
   * Write a {@link CasaItDocument} into a {@link String} and print the
   * results to the console.
   *
   * @param doc
   * the document to write
   */
  protected static void writeToConsole( CasaItDocument doc )
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