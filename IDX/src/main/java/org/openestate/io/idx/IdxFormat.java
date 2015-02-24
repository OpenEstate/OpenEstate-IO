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
    super( CSVFormat.newFormat( '#' )
      .withRecordSeparator( "\r\n" )
      .withNullString( StringUtils.EMPTY ) );
  }

  private static DateFormat getDateFormat()
  {
    return new SimpleDateFormat( "dd.MM.yyyy" );
  }

  private static DateFormat getDateTimeFormat()
  {
    return new SimpleDateFormat( "dd.MM.yyyy HH:mm:ss" );
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

  public static Boolean parseBoolean( String value )
  {
    value = StringUtils.trimToNull( value );
    if ("1".equalsIgnoreCase( value ) || "Y".equalsIgnoreCase( value ))
      return true;
    else if ("0".equalsIgnoreCase( value ) || "N".equalsIgnoreCase( value ))
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

  public static Date parseDateTime( String value ) throws ParseException
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? getDateTimeFormat().parse( value ): null;
  }

  public static Calendar parseDateTimeAsCalendar( String value ) throws ParseException
  {
    Date date = parseDateTime( value );
    if (date==null) return null;
    Calendar cal = Calendar.getInstance();
    cal.setTime( date );
    return cal;
  }

  public static Double parseDouble( String value ) throws NumberFormatException
  {
    Number number = parseNumber( value, false );
    return (number!=null)? number.doubleValue(): null;
  }

  public static Integer parseInteger( String value ) throws NumberFormatException
  {
    Number number = parseNumber( value, false );
    return (number!=null)? number.intValue(): null;
  }

  public static Long parseLong( String value ) throws NumberFormatException
  {
    Number number = parseNumber( value, false );
    return (number!=null)? number.longValue(): null;
  }

  public static Number parseNumber( String value ) throws NumberFormatException
  {
    return parseNumber( value, false );
  }

  public static Number parseNumber( String value, boolean integerOnly ) throws NumberFormatException
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;
    try
    {
      NumberFormat format = NumberFormat.getNumberInstance( Locale.ENGLISH );
      format.setMinimumFractionDigits( 0 );
      format.setGroupingUsed( false );
      format.setParseIntegerOnly( integerOnly );
      return format.parse( value );
    }
    catch (ParseException ex)
    {
      try
      {
        NumberFormat format = NumberFormat.getNumberInstance( Locale.GERMANY );
        format.setMinimumFractionDigits( 0 );
        format.setGroupingUsed( false );
        format.setParseIntegerOnly( integerOnly );
        return format.parse( value );
      }
      catch (ParseException ex2)
      {
        throw new NumberFormatException( "Can't parse '" + value + "' as number!" );
      }
    }
  }

  public static String printBoolean( Boolean value )
  {
    if (Boolean.TRUE.equals( value ))
      return "1";
    else if (Boolean.FALSE.equals( value ))
      return "0";
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

  public static String printDateTime( Calendar value )
  {
    return printDateTime( (value!=null)? value.getTime(): null );
  }

  public static String printDateTime( Date value )
  {
    return (value!=null)? getDateTimeFormat().format( value ): null;
  }

  public static String printNumber( Number value, int integerDigits )
  {
    return printNumber( value, integerDigits, 0 );
  }

  public static String printNumber( Number value, int integerDigits, int fractionDigits )
  {
    if (value==null) return null;
    NumberFormat format = NumberFormat.getNumberInstance( Locale.ENGLISH );
    format.setMaximumIntegerDigits( integerDigits );
    format.setMaximumFractionDigits( fractionDigits );
    format.setMinimumFractionDigits( 0 );
    format.setGroupingUsed( false );
    return format.format( value );
  }

  public static String printString( String value )
  {
    return printString( value, 0 );
  }

  public static String printString( String value, int maxLength )
  {
    value = StringUtils.trimToNull( value );
    if (maxLength<1)
      return value;
    else if (maxLength<4)
      return StringUtils.left( value, maxLength );
    else
      return StringUtils.abbreviate( value, maxLength );
  }
}