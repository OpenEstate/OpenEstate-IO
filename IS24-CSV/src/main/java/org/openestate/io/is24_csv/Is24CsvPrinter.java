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

package org.openestate.io.is24_csv;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.lang3.StringUtils;
import org.openestate.io.core.CsvPrinter;

/**
 * Is24CsvPrinter.
 *
 * @author Andreas Rudolph
 */
public class Is24CsvPrinter extends CsvPrinter<Is24CsvRecord>
{
  protected Is24CsvPrinter( CSVPrinter printer )
  {
    super( printer );
  }

  public static Is24CsvPrinter create( StringBuffer csvString ) throws IOException
  {
    return new Is24CsvFormat().print( csvString );
  }

  public static Is24CsvPrinter create( StringBuilder csvString ) throws IOException
  {
    return new Is24CsvFormat().print( csvString );
  }

  public static Is24CsvPrinter create( File csvFile ) throws IOException
  {
    return new Is24CsvFormat().print( csvFile );
  }

  public static Is24CsvPrinter create( OutputStream output ) throws IOException
  {
    return new Is24CsvFormat().print( output );
  }

  public static Is24CsvPrinter create( Writer output ) throws IOException
  {
    return new Is24CsvFormat().print( output );
  }

  @Override
  protected void print( String value ) throws IOException
  {
    value = StringUtils.trimToNull( value );

    // IS24-CSV does not support escaping of the field separator. Therefore the
    // field separator '|' is replaced with '/' from the value before it is
    // written to CSV.
    value = StringUtils.replace( value, "|", "/" );

    // Replace any line breaks from the value with <br>
    value = CsvPrinter.serializeValue( value, "<br>" );

    super.print( value );
  }
}