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

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.openestate.io.core.CsvFormat;

/**
 * IdxFormat.
 *
 * @author Andreas Rudolph
 */
public class IdxFormat extends CsvFormat<IdxParser, IdxPrinter>
{
  public final static String ENCODING = "ISO-8859-1";
  public final static String VERSION = "3.01";

  public IdxFormat()
  {
    super( CSVFormat.newFormat( '#' ).withRecordSeparator( "\\r\\n" ) );
  }

  public static DateFormat getDateFormat()
  {
    return new SimpleDateFormat( "dd.MM.yyyy" );
  }

  public static DateFormat getDateTimeFormat()
  {
    return new SimpleDateFormat( "dd.MM.yyyy HH:mm:ss" );
  }

  public static NumberFormat getNumberFormat( int integerDigits, int fractionDigits )
  {
    NumberFormat format = NumberFormat.getNumberInstance( Locale.ENGLISH );
    format.setMaximumIntegerDigits( integerDigits );
    format.setMaximumFractionDigits( fractionDigits );
    format.setMinimumFractionDigits( 0 );
    format.setGroupingUsed( false );
    return format;
  }

  @Override
  public String getEncoding()
  {
    return ENCODING;
  }

  @Override
  protected IdxParser newParser( CSVParser parser )
  {
    return new IdxParser( parser );
  }

  @Override
  protected IdxPrinter newPrinter( CSVPrinter printer )
  {
    return new IdxPrinter( printer );
  }
}