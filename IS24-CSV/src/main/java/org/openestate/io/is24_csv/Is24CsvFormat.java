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

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.lang3.StringUtils;
import org.openestate.io.core.CsvFormat;

/**
 * Is24CsvFormat.
 *
 * @author Andreas Rudolph
 */
public class Is24CsvFormat extends CsvFormat<Is24CsvParser, Is24CsvPrinter>
{
  public final static String ENCODING = "CP1252";
  public final static String VERSION = "1.4.0.4";

  public Is24CsvFormat()
  {
    super( CSVFormat.newFormat( '|' ).withRecordSeparator( "\\r\\n" ).withNullString( "" ) );
  }

  private static DateFormat getDateFormat()
  {
    return new SimpleDateFormat( "dd.MM.yyyy" );
  }

  /*private static NumberFormat getNumberFormat( int integerDigits, int fractionDigits )
  {
    NumberFormat format = NumberFormat.getNumberInstance( Locale.GERMANY );
    format.setMaximumIntegerDigits( integerDigits );
    format.setMaximumFractionDigits( fractionDigits );
    format.setMinimumFractionDigits( 0 );
    format.setGroupingUsed( false );
    return format;
  }*/

  @Override
  public String getEncoding()
  {
    return ENCODING;
  }

  @Override
  protected Is24CsvParser newParser( CSVParser parser )
  {
    return new Is24CsvParser( parser );
  }

  @Override
  protected Is24CsvPrinter newPrinter( CSVPrinter printer )
  {
    return new Is24CsvPrinter( printer );
  }

  public static Boolean parseBoolean( String value )
  {
    value = StringUtils.trimToNull( value );
    if ("J".equalsIgnoreCase( value ))
      return true;
    else if ("N".equalsIgnoreCase( value ))
      return false;
    else
      return null;
  }

  public static Date parseDate( String value ) throws ParseException
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? getDateFormat().parse( value ): null;
  }

  public static Calendar parseDateAsCalendar( String value ) throws ParseException
  {
    Date date = parseDate( value );
    if (date==null) return null;
    Calendar cal = Calendar.getInstance();
    cal.setTime( date );
    return cal;
  }

  public static Number parseNumber( String value ) throws ParseException
  {
    return parseNumber( value, false );
  }

  public static Number parseNumber( String value, boolean integerOnly ) throws ParseException
  {
    try
    {
      NumberFormat format = NumberFormat.getNumberInstance( Locale.GERMANY );
      format.setMinimumFractionDigits( 0 );
      format.setGroupingUsed( false );
      format.setParseIntegerOnly( integerOnly );
      return format.parse( value );
    }
    catch (ParseException ex)
    {
      NumberFormat format = NumberFormat.getNumberInstance( Locale.ENGLISH );
      format.setMinimumFractionDigits( 0 );
      format.setGroupingUsed( false );
      format.setParseIntegerOnly( integerOnly );
      return format.parse( value );
    }
  }

  public static String printBoolean( Boolean value )
  {
    if (Boolean.TRUE.equals( value ))
      return "J";
    else if (Boolean.FALSE.equals( value ))
      return "N";
    else
      return StringUtils.EMPTY;
  }

  public static String printDate( Calendar value )
  {
    return printDate( (value!=null)? value.getTime(): null );
  }

  public static String printDate( Date value )
  {
    return (value!=null)? getDateFormat().format( value ): null;
  }

  public static String printNumber( Number value, int integerDigits )
  {
    return printNumber( value, integerDigits, 0 );
  }

  public static String printNumber( Number value, int integerDigits, int fractionDigits )
  {
    if (value==null) return null;
    NumberFormat format = NumberFormat.getNumberInstance( Locale.GERMANY );
    format.setMaximumIntegerDigits( integerDigits );
    format.setMaximumFractionDigits( fractionDigits );
    format.setMinimumFractionDigits( 0 );
    format.setGroupingUsed( false );
    return format.format( value );
  }
}