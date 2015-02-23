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
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.openestate.io.is24_csv.Is24CsvParser;
import org.openestate.io.is24_csv.Is24CsvRecord;

/**
 * Example for CSV reading.
 * <p>
 * This example illustrates how to read an IS24-CSV document from a file.
 *
 * @author Andreas Rudolph
 */
public class Is24CsvReadingExample
{
  /**
   * Start the example application.
   *
   * @param args
   * command line arguments
   */
  public static void main( String[] args )
  {
    if (args.length<1)
    {
      System.out.println( "Please provide at least one file as argument!" );
      System.exit( 1 );
    }
    for (String arg : args)
    {
      try
      {
        read( new File( arg ) );
      }
      catch (Exception ex)
      {
        System.err.println( "The provided file is invalid!" );
        ex.printStackTrace( System.err );
        System.exit( 2 );
      }
    }
  }

  /**
   * Read an IS24-CSV file into a {@link Is24CsvParser} and prints some of their content
   * to console.
   *
   * @param csvFile
   * the CSV file to read
   *
   * @throws IOException
   * if the file is not readable
   */
  protected static void read( File csvFile ) throws IOException
  {
    System.out.println( "process file: " + csvFile.getAbsolutePath() );
    if (!csvFile.isFile())
    {
      System.out.println( "> The provided file is invalid!" );
      return;
    }
    Is24CsvParser parser = null;
    try
    {
      parser = Is24CsvParser.create( csvFile );
      if (parser==null)
        System.out.println( "> Can't create parser!" );
      else
        read( parser );
    }
    finally
    {
      IOUtils.closeQuietly( parser );
    }
  }

  /**
   * Print the content of a {@link Is24CsvParser} to console.
   *
   * @param parser
   * parser instance
   */
  protected static void read( Is24CsvParser parser )
  {
    // process records
    while (parser.hasNext())
    {
      Is24CsvRecord record = parser.next();

      // get object nr
      String objectNr = StringUtils.trimToNull( record.getAnbieterObjektId() );
      if (objectNr==null) objectNr = "???";

      // get object title
      String objectTitle = record.getUeberschrift();
      if (objectTitle==null) objectTitle = "???";

      // print object informations to console
      System.out.println( "> property '" + objectNr + "' "
        + "with title '" + objectTitle + "'" );
    }
  }
}