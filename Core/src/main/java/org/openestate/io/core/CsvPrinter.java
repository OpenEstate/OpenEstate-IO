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

package org.openestate.io.core;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * CsvPrinter.
 *
 * @param <Record>
 * ...
 *
 * @author Andreas Rudolph
 */
public abstract class CsvPrinter<Record extends CsvRecord> implements Closeable, Flushable
{
  //private final static Logger LOGGER = LoggerFactory.getLogger( CsvPrinter.class );
  private final static Pattern LINES = Pattern.compile( "^(.*)$", Pattern.MULTILINE );
  private final CSVPrinter printer;

  protected CsvPrinter( CSVPrinter printer )
  {
    this.printer = printer;
  }

  @Override
  public void close() throws IOException
  {
    this.printer.close();
  }

  public final void closeQuietly()
  {
    IOUtils.closeQuietly( this );
  }

  @Override
  public void flush() throws IOException
  {
    this.printer.flush();
  }

  protected void print( String value ) throws IOException
  {
    this.printer.print( value );
  }

  protected void println() throws IOException
  {
    this.printer.println();
  }

  protected void printComment( String comment ) throws IOException
  {
    this.printer.printComment( comment );
  }

  public void printRecord( Record record ) throws IOException
  {
    for (String value : record.print())
    {
      this.print( value );
    }
    this.println();
  }

  public void printRecords( Iterable<Record> records ) throws IOException
  {
    for (Record record : records)
    {
      this.printRecord( record );
    }
    this.flush();
  }

  protected static String replaceLineBreaks( String value )
  {
    return replaceLineBreaks( value, null );
  }

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