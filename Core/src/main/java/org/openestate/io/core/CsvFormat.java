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

/**
 * CsvFormat.
 *
 * @param <Parser>
 * ...
 *
 * @param <Printer>
 * ...
 *
 * @author Andreas Rudolph
 */
public abstract class CsvFormat<Parser extends CsvParser, Printer extends CsvPrinter>
{
  private final CSVFormat format;

  protected CsvFormat( CSVFormat format )
  {
    this.format = format;
  }

  public abstract String getEncoding();

  public final CSVFormat getFormat()
  {
    return this.format;
  }

  protected abstract Parser newParser( CSVParser parser );

  protected abstract Printer newPrinter( CSVPrinter printer );

  public final Parser parse( String csvString ) throws IOException
  {
    return this.parse( new StringReader( csvString ) );
  }

  public final Parser parse( File csvFile ) throws IOException
  {
    return this.parse( new FileInputStream( csvFile ) );
  }

  public final Parser parse( InputStream input ) throws IOException
  {
    return this.parse( new InputStreamReader( input, this.getEncoding() ) );
  }

  public Parser parse( Reader input ) throws IOException
  {
    return this.newParser( new CSVParser( input, this.getFormat() ) );
  }

  public final Printer print( StringBuffer csvString ) throws IOException
  {
    return print( (Appendable) csvString );
  }

  public final Printer print( StringBuilder csvString ) throws IOException
  {
    return print( (Appendable) csvString );
  }

  public final Printer print( File csvFile ) throws IOException
  {
    return print( new FileOutputStream( csvFile ) );
  }

  public final Printer print( OutputStream output ) throws IOException
  {
    return print( new OutputStreamWriter( output, this.getEncoding() ) );
  }

  public final Printer print( Writer output ) throws IOException
  {
    return print( (Appendable) output );
  }

  protected Printer print( Appendable output ) throws IOException
  {
    return newPrinter( new CSVPrinter( output, this.getFormat() ) );
  }
}