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
package org.openestate.io.core;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A general CSV format specification, that supports reading through
 * {@link CsvParser} and writing through {@link CsvPrinter}.
 *
 * @param <Parser>
 * the class used for CSV parsing
 *
 * @param <Printer>
 * the class used for CSV printing
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public abstract class CsvFormat<Parser extends CsvParser, Printer extends CsvPrinter>
{
  private final static Logger LOGGER = LoggerFactory.getLogger( CsvFormat.class );
  private final CSVFormat format;

  /**
   * Create with specifications of a {@link CSVFormat}.
   *
   * @param format
   * the CSV format from
   * <a href="http://commons.apache.org/proper/commons-csv/">commons-csv</a>
   */
  protected CsvFormat( CSVFormat format )
  {
    this.format = format;
  }

  /**
   * Returns the encoding of created CSV data.
   *
   * @return
   * encoding
   */
  public abstract String getEncoding();

  /**
   * Returns the contained {@link CSVFormat}.
   *
   * @return
   * the contained format
   */
  public final CSVFormat getFormat()
  {
    return this.format;
  }

  /**
   * Creates a new {@link CsvParser} for a {@link CSVParser}.
   *
   * @param parser
   * the CSV parser from
   * <a href="http://commons.apache.org/proper/commons-csv/">commons-csv</a>
   *
   * @return
   * created parser
   */
  protected abstract Parser newParser( CSVParser parser );

  /**
   * Creates a new {@link CsvPrinter} for a {@link CSVPrinter}.
   *
   * @param printer
   * the CSV printer from
   * <a href="http://commons.apache.org/proper/commons-csv/">commons-csv</a>
   *
   * @return
   * created printer
   */
  protected abstract Printer newPrinter( CSVPrinter printer );

  /**
   * Creates a {@link CsvParser} from a {@link String} with CSV data.
   *
   * @param csvString
   * CSV string
   *
   * @return
   * created parser
   *
   * @throws IOException
   * if CSV is not readable
   */
  public final Parser parse( String csvString ) throws IOException
  {
    return this.parse( new StringReader( csvString ) );
  }

  /**
   * Creates a {@link CsvParser} from a {@link File} with CSV data.
   *
   * @param csvFile
   * CSV file
   *
   * @return
   * created parser
   *
   * @throws IOException
   * if CSV is not readable
   */
  @SuppressFBWarnings(
    value = "OBL_UNSATISFIED_OBLIGATION",
    justification = "The stream is closed later together with the parser.")
  public final Parser parse( File csvFile ) throws IOException
  {
    return this.parse( new FileInputStream( csvFile ) );
  }

  /**
   * Creates a {@link CsvParser} from an {@link InputStream} with CSV data.
   *
   * @param input
   * CSV input
   *
   * @return
   * created parser
   *
   * @throws IOException
   * if CSV is not readable
   */
  public final Parser parse( InputStream input ) throws IOException
  {
    return this.parse( new InputStreamReader( input, this.getEncoding() ) );
  }

  /**
   * Creates a {@link CsvParser} from a {@link Reader} with CSV data.
   *
   * @param input
   * CSV input
   *
   * @return
   * created parser
   *
   * @throws IOException
   * if CSV is not readable
   */
  public Parser parse( Reader input ) throws IOException
  {
    return this.newParser( new CSVParser( input, this.getFormat() ) );
  }

  /**
   * Creates a {@link CsvPrinter}, that writes CSV data into a
   * {@link StringBuffer}.
   *
   * @param csvString
   * where CSV is written to
   *
   * @return
   * created printer
   *
   * @throws IOException
   * if CSV is not writable
   */
  public final Printer print( StringBuffer csvString ) throws IOException
  {
    return print( (Appendable) csvString );
  }

  /**
   * Creates a {@link CsvPrinter}, that writes CSV data into a
   * {@link StringBuilder}.
   *
   * @param csvString
   * where CSV is written to
   *
   * @return
   * created printer
   *
   * @throws IOException
   * if CSV is not writable
   */
  public final Printer print( StringBuilder csvString ) throws IOException
  {
    return print( (Appendable) csvString );
  }

  /**
   * Creates a {@link CsvPrinter}, that writes CSV data into a {@link File}.
   *
   * @param csvFile
   * where CSV is written to
   *
   * @return
   * created printer
   *
   * @throws IOException
   * if CSV is not writable
   */
  @SuppressFBWarnings(
    value = "OBL_UNSATISFIED_OBLIGATION",
    justification = "The stream is closed later together with the printer.")
  public final Printer print( File csvFile ) throws IOException
  {
    return print( new FileOutputStream( csvFile ) );
  }

  /**
   * Creates a {@link CsvPrinter}, that writes CSV data into an
   * {@link OutputStream}.
   *
   * @param output
   * where CSV is written to
   *
   * @return
   * created printer
   *
   * @throws IOException
   * if CSV is not writable
   */
  public final Printer print( OutputStream output ) throws IOException
  {
    return print( new OutputStreamWriter( output, this.getEncoding() ) );
  }

  /**
   * Creates a {@link CsvPrinter}, that writes CSV data into a {@link Writer}.
   *
   * @param output
   * where CSV is written to
   *
   * @return
   * created printer
   *
   * @throws IOException
   * if CSV is not writable
   */
  public final Printer print( Writer output ) throws IOException
  {
    return print( (Appendable) output );
  }

  /**
   * Creates a {@link CsvPrinter}, that writes CSV data into an
   * {@link Appendable} object.
   * <p>
   * Use this function to, to override the print methods through inheritance.
   *
   * @param output
   * where CSV is written to
   *
   * @return
   * created printer
   *
   * @throws IOException
   * if CSV is not writable
   */
  protected Printer print( Appendable output ) throws IOException
  {
    return newPrinter( new CSVPrinter( output, this.getFormat() ) );
  }
}