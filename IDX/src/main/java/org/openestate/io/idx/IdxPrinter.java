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
package org.openestate.io.idx;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.lang3.StringUtils;
import org.openestate.io.core.CsvPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Printer for the IDX format.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public class IdxPrinter extends CsvPrinter<IdxRecord>
{
  private final static Logger LOGGER = LoggerFactory.getLogger( IdxPrinter.class );

  /**
   * Create with specifications of a {@link CSVPrinter}.
   *
   * @param printer
   * the CSV printer from
   * <a href="http://commons.apache.org/proper/commons-csv/">commons-csv</a>
   */
  protected IdxPrinter( CSVPrinter printer )
  {
    super( printer );
  }

  /**
   * Creates a {@link IdxPrinter}, that writes CSV data into a
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
  public static IdxPrinter create( StringBuffer csvString ) throws IOException
  {
    return new IdxFormat().print( csvString );
  }

  /**
   * Creates a {@link IdxPrinter}, that writes CSV data into a
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
  public static IdxPrinter create( StringBuilder csvString ) throws IOException
  {
    return new IdxFormat().print( csvString );
  }

  /**
   * Creates a {@link IdxPrinter}, that writes CSV data into a {@link File}.
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
  public static IdxPrinter create( File csvFile ) throws IOException
  {
    return new IdxFormat().print( csvFile );
  }

  /**
   * Creates a {@link IdxPrinter}, that writes CSV data into an
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
  public static IdxPrinter create( OutputStream output ) throws IOException
  {
    return new IdxFormat().print( output );
  }

  /**
   * Creates a {@link IdxPrinter}, that writes CSV data into a {@link Writer}.
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
  public static IdxPrinter create( Writer output ) throws IOException
  {
    return new IdxFormat().print( output );
  }

  @Override
  protected void print( String value ) throws IOException
  {
    value = StringUtils.trimToNull( value );

    // We're not sure, if escaping of the separator is supported by IDX.
    // Therefore the separator (#) is removed from the value before it is
    // written to CSV.
    value = StringUtils.replace( value, "#", StringUtils.EMPTY );

    // Replace any line breaks from the value with <br>
    value = CsvPrinter.replaceLineBreaks( value, "<br>" );

    super.print( value );
  }
}