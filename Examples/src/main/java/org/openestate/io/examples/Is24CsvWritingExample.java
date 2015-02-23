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
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.io.output.NullWriter;
import org.apache.commons.lang3.StringUtils;
import org.openestate.io.is24_csv.Is24CsvPrinter;
import org.openestate.io.is24_csv.Is24CsvRecord;
import org.openestate.io.is24_csv.records.HausKauf;
import org.openestate.io.is24_csv.records.WohnungMiete;

/**
 * Example for CSV writing.
 * <p>
 * This example illustrates the programatic creation of an IS24-CSV document,
 * and how the document is written into CSV.
 *
 * @author Andreas Rudolph
 */
public class Is24CsvWritingExample
{
  /**
   * Start the example application.
   *
   * @param args
   * command line arguments
   */
  public static void main( String[] args )
  {
    // create some CSV records
    List<Is24CsvRecord> records = new ArrayList<Is24CsvRecord>();
    records.add( createHausKaufRecord() );
    records.add( createHausKaufRecord() );
    records.add( createWohnungMieteRecord() );
    records.add( createWohnungMieteRecord() );

    // write CSV records into a java.io.File
    try
    {
      write( records, File.createTempFile( "is24", ".csv" ) );
    }
    catch (IOException ex)
    {
      System.err.println( "Can't create temporary file!" );
      ex.printStackTrace( System.err );
      System.exit( 2 );
    }

    // write CSV records into a java.io.OutputStream
    write( records, new NullOutputStream() );

    // write CSV records into a java.io.Writer
    write( records, new NullWriter() );

    // write CSV records into a string and send it to the console
    writeToConsole( records );
  }

  /**
   * Create an {@link HausKauf} with some example data.
   *
   * @return
   * an example {@link HausKauf} object
   */
  protected static Is24CsvRecord createHausKaufRecord()
  {
    // create an example real estate
    HausKauf obj = new HausKauf();

    // TODO: not implemented yet

    return obj;
  }

  /**
   * Create an {@link WohnungMiete} with some example data.
   *
   * @return
   * an example {@link WohnungMiete} object
   */
  protected static Is24CsvRecord createWohnungMieteRecord()
  {
    // create an example real estate
    WohnungMiete obj = new WohnungMiete();

    // TODO: not implemented yet

    return obj;
  }

  /**
   * Write some {@link Is24CsvRecord} objects into a {@link File}.
   *
   * @param records
   * the CSV records to write
   *
   * @param file
   * the file, where the document is written to
   */
  protected static void write( List<Is24CsvRecord> records, File file )
  {
    System.out.println( "writing document" );
    Is24CsvPrinter printer = null;
    try
    {
      printer = Is24CsvPrinter.create( file );
      printer.printRecords( records );
      System.out.println( "> written to: " + file.getAbsolutePath() );
    }
    catch (Exception ex)
    {
      System.err.println( "Can't write document into a file!" );
      ex.printStackTrace( System.err );
      System.exit( 2 );
    }
    finally
    {
      IOUtils.closeQuietly( printer );
    }
  }

  /**
   * Write some {@link Is24CsvRecord} objects into an {@link OutputStream}.
   *
   * @param records
   * the CSV records to write
   *
   * @param output
   * the stream, where the document is written to
   */
  protected static void write( List<Is24CsvRecord> records, OutputStream output )
  {
    System.out.println( "writing document" );
    try
    {
      Is24CsvPrinter printer = Is24CsvPrinter.create( output );
      printer.printRecords( records );
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
   * Write some {@link Is24CsvRecord} objects into an {@link Writer}.
   *
   * @param records
   * the CSV records to write
   *
   * @param output
   * the writer, where the document is written to
   */
  protected static void write( List<Is24CsvRecord> records, Writer output )
  {
    System.out.println( "writing document" );
    try
    {
      Is24CsvPrinter printer = Is24CsvPrinter.create( output );
      printer.printRecords( records );
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
   * Write some {@link Is24CsvRecord} objects into a {@link String} and print the
   * results to the console.
   *
   * @param records
   * the CSV records to write
   */
  protected static void writeToConsole( List<Is24CsvRecord> records )
  {
    System.out.println( "writing document" );
    Is24CsvPrinter printer = null;
    try
    {
      StringBuilder csv = new StringBuilder();
      printer = Is24CsvPrinter.create( csv );
      printer.printRecords( records );
      System.out.println( StringUtils.repeat( "-", 50 ) );
      System.out.println( csv.toString() );
      System.out.println( StringUtils.repeat( "-", 50 ) );
    }
    catch (Exception ex)
    {
      System.err.println( "Can't write document into a string!" );
      ex.printStackTrace( System.err );
      System.exit( 2 );
    }
    finally
    {
      IOUtils.closeQuietly( printer );
    }
  }
}