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

package org.openestate.io.trovit;

import org.openestate.io.trovit.xml.types.IntBool;
import org.openestate.io.trovit.xml.types.Unit;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.xml.bind.DatatypeConverter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.openestate.io.core.DocumentUtils;
import org.openestate.io.trovit.xml.types.Action;
import org.openestate.io.trovit.xml.types.PriceInterval;
import org.openestate.io.trovit.xml.ObjectFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 * TrovitUtils.
 *
 * @author Andreas Rudolph
 */
public class TrovitUtils
{
  //private final static Logger LOGGER = LoggerFactory.getLogger( TrovitUtils.class );
  public final static String PACKAGE = "org.openestate.io.trovit.xml";
  private final static ObjectFactory FACTORY = new ObjectFactory();
  private static JAXBContext JAXB = null;

  private TrovitUtils()
  {
  }

  public static TrovitDocument createDocument( InputStream input ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument( DocumentUtils.newDocument( input, true ) );
  }

  public static TrovitDocument createDocument( File xmlFile ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument( DocumentUtils.newDocument( xmlFile, true ) );
  }

  public static TrovitDocument createDocument( String xmlString ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument( DocumentUtils.newDocument( xmlString, true ) );
  }

  public static TrovitDocument createDocument( Document doc )
  {
    if (TrovitDocument.isTransferDocument( doc ))
      return new TrovitDocument( doc );
    else
      return null;
  }

  public static Marshaller createMarshaller() throws JAXBException
  {
    return createMarshaller( Charset.defaultCharset().name(), true );
  }

  public static Marshaller createMarshaller( String encoding, boolean formatted ) throws JAXBException
  {
    Marshaller m = getContext().createMarshaller();
    m.setProperty( Marshaller.JAXB_ENCODING, encoding );
    m.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, formatted );
    return m;
  }

  public static Unmarshaller createUnmarshaller() throws JAXBException
  {
    return getContext().createUnmarshaller();
  }

  public static Element createUserDefinedSimplefield( Document doc, String name, String value )
  {
    Element root = DocumentUtils.getRootElement( doc );
    Element node = doc.createElementNS( root.getNamespaceURI(), "user_defined_simplefield" );
    node.setAttribute( "feldname", name );
    node.setTextContent( value );
    return node;
  }

  public synchronized static JAXBContext getContext() throws JAXBException
  {
    if (JAXB==null) initContext( Thread.currentThread().getContextClassLoader() );
    return JAXB;
  }

  public synchronized static ObjectFactory getFactory()
  {
    return FACTORY;
  }

  public synchronized static void initContext( ClassLoader classloader ) throws JAXBException
  {
    JAXB = JAXBContext.newInstance( PACKAGE, classloader );
  }

  public static Action parseAction( String value )
  {
    return Action.lookup( value );
  }

  public static Boolean parseBool( String value )
  {
    value = StringUtils.trimToNull( value );
    if ("si".equalsIgnoreCase( value ) || "yes".equalsIgnoreCase( value ))
      return Boolean.TRUE;
    else if ("no".equalsIgnoreCase( value ))
      return Boolean.TRUE;
    else
      return (value!=null)? DatatypeConverter.parseBoolean( value ): null;
  }

  public static Calendar parseDate( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;
    try
    {
      Date date = DateUtils.parseDateStrictly( value, new String[]{
        "dd.MM.yyyy", "dd.MM.yy", "dd/MM/yyyy", "dd/MM/yy", "dd-MM-yyyy",
        "dd-MMM-yyyy", "yyyy-MM-dd", "yyyy/MM/dd", "yyyy-D", "MM/yyyy",
        "MMM yyyy", "MMMMM yyyy", "yyyy" } );
      Calendar cal = Calendar.getInstance();
      cal.setTime( date );
      return cal;
    }
    catch (ParseException ex)
    {
      //LOGGER.warn( "Can't parse value '" + value + "' as date!" );
      //LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
    }
    throw new IllegalArgumentException( "Can't parse date value '"+value+"'!" );
  }

  public static Double parseFloat( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseDouble( value ): null;
  }

  public static Integer parseInt( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseInt( value ): null;
  }

  public static IntBool parseIntBool( String value )
  {
    value = StringUtils.trimToNull( value );

    Boolean boolValue = parseBool( value );
    if (boolValue!=null) return new IntBool( boolValue );

    Integer intValue = parseInt( value );
    if (intValue!=null) return new IntBool( intValue );

    return null;
  }

  public static Long parseLong( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseLong( value ): null;
  }

  public static PriceInterval parsePriceInterval( String value )
  {
    return PriceInterval.lookup( value );
  }

  public static Double parsePriceValue( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;

    try
    {
      NumberFormat formatter = NumberFormat.getNumberInstance( Locale.ENGLISH );
      formatter.setGroupingUsed( false );
      formatter.setMaximumFractionDigits( 2 );
      return formatter.parse( value ).doubleValue();
    }
    catch (Exception ex)
    {
    }

    try
    {
      NumberFormat formatter = NumberFormat.getNumberInstance( Locale.GERMAN );
      formatter.setGroupingUsed( false );
      formatter.setMaximumFractionDigits( 2 );
      return formatter.parse( value ).doubleValue();
    }
    catch (Exception ex)
    {
    }

    return null;
  }

  public static String parseString100( String value )
  {
    return DatatypeConverter.parseString( value );
  }

  public static String parseString255( String value )
  {
    return DatatypeConverter.parseString( value );
  }

  public static Calendar parseTime( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;
    try
    {
      Date date = DateUtils.parseDateStrictly( value, new String[]{
        "HH:mm:ss", "HH:mm" } );
      Calendar cal = Calendar.getInstance();
      cal.setTime( date );
      return cal;
    }
    catch (ParseException ex)
    {
      //LOGGER.warn( "Can't parse value '" + value + "' as date!" );
      //LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
    }
    throw new IllegalArgumentException( "Can't parse time value '"+value+"'!" );
  }

  public static Unit parseUnit( String value )
  {
    return Unit.lookup( value );
  }

  public static Integer parseYear( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseInt( value ): null;
  }

  public static String printAction( Action value )
  {
    return (value!=null)? value.write(): null;
  }

  public static String printBool( Boolean value )
  {
    return (value!=null)? DatatypeConverter.printBoolean( value ): null;
  }

  public static String printDate( Calendar value )
  {
    if (value==null) return null;
    return new SimpleDateFormat( "dd/MM/yyyy" ).format( value.getTime() );
  }

  public static String printFloat( Double value )
  {
    return (value!=null)? DatatypeConverter.printDouble( value ): StringUtils.EMPTY;
  }

  public static String printInt( Integer value )
  {
    return (value!=null)? DatatypeConverter.printInt( value ): StringUtils.EMPTY;
  }

  public static String printLong( Long value )
  {
    return (value!=null)? DatatypeConverter.printLong( value ): StringUtils.EMPTY;
  }

  public static String printIntBool( IntBool value )
  {
    Boolean boolValue = (value!=null)? value.getBoolValue(): null;
    Integer intValue = (value!=null)? value.getIntValue(): null;
    if (boolValue!=null)
      return printBool( boolValue );
    else if (intValue!=null)
      return printInt( intValue );
    else
      return StringUtils.EMPTY;
  }

  public static String printPriceInterval( PriceInterval value )
  {
    return (value!=null)? value.write(): null;
  }

  public static String printPriceValue( Double value )
  {
    if (value==null) return null;
    NumberFormat formatter = NumberFormat.getNumberInstance( Locale.ENGLISH );
    formatter.setGroupingUsed( false );
    formatter.setMaximumFractionDigits( 2 );
    return formatter.format( value );
  }

  public static String printString100( String value )
  {
    return StringUtils.abbreviate( value, 100 );
  }

  public static String printString255( String value )
  {
    return StringUtils.abbreviate( value, 255 );
  }

  public static String printTime( Calendar value )
  {
    if (value==null) return null;
    return new SimpleDateFormat( "HH:mm:ss" ).format( value.getTime() );
  }

  public static String printUnit( Unit value )
  {
    return (value!=null)? value.write(): null;
  }

  public static String printYear( Integer value )
  {
    return (value!=null && value>999 && value<10000)?
      DatatypeConverter.printInt( value ): StringUtils.EMPTY;
  }
}