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
package org.openestate.io.core;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A general CSV printer, that is bound to a {@link CsvFormat} and writes CSV
 * data from {@link CsvRecord} objects.
 *
 * @param <Record>
 * the class used for a record, that is printed to a CSV file
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public abstract class CsvPrinter<Record extends CsvRecord> implements Closeable, Flushable
{
  private final static Logger LOGGER = LoggerFactory.getLogger( CsvPrinter.class );
  private final static Pattern LINES = Pattern.compile( "^(.*)$", Pattern.MULTILINE );
  private final CSVPrinter printer;

  /**
   * Create with specifications of a {@link CSVPrinter}.
   *
   * @param printer
   * the CSV printer from
   * <a href="http://commons.apache.org/proper/commons-csv/">commons-csv</a>
   */
  protected CsvPrinter( CSVPrinter printer )
  {
    this.printer = printer;
  }

  /**
   * Closes the printer instance.
   *
   * @throws IOException
   * if closing failed
   */
  @Override
  public void close() throws IOException
  {
    this.printer.close();
  }

  /**
   * Flushes the printer instance.
   *
   * @throws IOException
   * if flushing failed
   */
  @Override
  public void flush() throws IOException
  {
    this.printer.flush();
  }

  /**
   * Prints a single CSV value.
   *
   * @param value
   * CSV value to print
   *
   * @throws IOException
   * if printing failed
   */
  protected void print( String value ) throws IOException
  {
    this.printer.print( value );
  }

  /**
   * Prints a record separator (line break).
   *
   * @throws IOException
   * if printing failed
   */
  protected void println() throws IOException
  {
    this.printer.println();
  }

  /**
   * Prints a comment.
   *
   * @param comment
   * comment to print
   *
   * @throws IOException
   * if printing failed
   */
  protected void printComment( String comment ) throws IOException
  {
    this.printer.printComment( comment );
  }

  /**
   * Print a {@link CsvRecord} followed by a record separator (line break).
   *
   * @param record
   * record to print
   *
   * @throws IOException
   * if printing failed
   */
  public void printRecord( Record record ) throws IOException
  {
    for (String value : record.print())
    {
      this.print( value );
    }
    this.println();
  }

  /**
   * Print multiple {@link CsvRecord} objects.
   *
   * @param records
   * records to print
   *
   * @throws IOException
   * if printing failed
   */
  public void printRecords( Iterable<Record> records ) throws IOException
  {
    for (Record record : records)
    {
      this.printRecord( record );
    }
    this.flush();
  }

  /**
   * Helper function to replace line breaks in a string with &lt;br/&gt; before
   * printing.
   * <p>
   * This method may be used by inheriting classes, if the particular format
   * does not support line breaks.
   *
   * @param value
   * value to replace
   *
   * @return
   * value with replaced line breaks
   */
  protected static String replaceLineBreaks( String value )
  {
    return replaceLineBreaks( value, null );
  }

  /**
   * Helper function to replace line breaks in a string with a custom value
   * before printing.
   * <p>
   * This method may be used by inheriting classes, if the particular format
   * does not support line breaks.
   *
   * @param value
   * value to replace
   *
   * @param lineBreak
   * value, that is used for replacement of line breaks - if null, &lt;br/&gt;
   * is used
   *
   * @return
   * value with replaced line breaks
   */
  protected static String replaceLineBreaks( String value, String lineBreak )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;
    if (lineBreak==null) lineBreak = "<br/>";
    Matcher m = LINES.matcher( value );
    StringBuilder out = new StringBuilder();
    while (m.find())
    {
      out.append( StringUtils.trimToEmpty( m.group() ) );
      if (!m.hitEnd()) out.append( lineBreak );
    }
    return out.toString();
  }
}