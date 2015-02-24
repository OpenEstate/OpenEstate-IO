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

package org.openestate.io.idx;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.lang3.StringUtils;
import org.openestate.io.core.CsvPrinter;

/**
 * IdxPrinter.
 *
 * @author Andreas Rudolph
 */
public class IdxPrinter extends CsvPrinter<IdxRecord>
{
  protected IdxPrinter( CSVPrinter printer )
  {
    super( printer );
  }

  public static IdxPrinter create( StringBuffer csvString ) throws IOException
  {
    return new IdxFormat().print( csvString );
  }

  public static IdxPrinter create( StringBuilder csvString ) throws IOException
  {
    return new IdxFormat().print( csvString );
  }

  public static IdxPrinter create( File csvFile ) throws IOException
  {
    return new IdxFormat().print( csvFile );
  }

  public static IdxPrinter create( OutputStream output ) throws IOException
  {
    return new IdxFormat().print( output );
  }

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