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
package org.openestate.io.trovit;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.text.DateFormat;
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
import org.openestate.io.core.NumberUtils;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.core.XmlValidationHandler;
import org.openestate.io.trovit.xml.ObjectFactory;
import org.openestate.io.trovit.xml.types.Action;
import org.openestate.io.trovit.xml.types.IntBool;
import org.openestate.io.trovit.xml.types.PriceInterval;
import org.openestate.io.trovit.xml.types.Unit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 * Some helper functions for the Trovit-XML format.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public class TrovitUtils
{
  private final static Logger LOGGER = LoggerFactory.getLogger( TrovitUtils.class );
  private static JAXBContext JAXB = null;

  /**
   * the latest implemented version of this format
   *
   * public final static String VERSION = "1.0";
   */

  /**
   * the XML target namespace of this format
   */
  public final static String NAMESPACE = StringUtils.EMPTY;

  /**
   * the package, where generated JAXB classes are located
   */
  public final static String PACKAGE = "org.openestate.io.trovit.xml";

  /**
   * the factory for creation of JAXB objects
   */
  public final static ObjectFactory FACTORY = new ObjectFactory();

  private TrovitUtils()
  {
  }

  /**
   * Creates a {@link TrovitDocument} from an {@link InputStream}.
   *
   * @param input
   * XML input
   *
   * @return
   * created document or null, of the document is not supported by this format
   *
   * @throws SAXException
   * if XML is invalid
   *
   * @throws IOException
   * if reading failed
   *
   * @throws ParserConfigurationException
   * if the parser is not properly configured
   */
  public static TrovitDocument createDocument( InputStream input ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument( XmlUtils.newDocument( input, true ) );
  }

  /**
   * Creates a {@link TrovitDocument} from a {@link File}.
   *
   * @param xmlFile
   * XML file
   *
   * @return
   * created document or null, of the document is not supported by this format
   *
   * @throws SAXException
   * if XML is invalid
   *
   * @throws IOException
   * if reading failed
   *
   * @throws ParserConfigurationException
   * if the parser is not properly configured
   */
  public static TrovitDocument createDocument( File xmlFile ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument( XmlUtils.newDocument( xmlFile, true ) );
  }

  /**
   * Creates a {@link TrovitDocument} from a {@link String}.
   *
   * @param xmlString
   * XML string
   *
   * @return
   * created document or null, of the document is not supported by this format
   *
   * @throws SAXException
   * if XML is invalid
   *
   * @throws IOException
   * if reading failed
   *
   * @throws ParserConfigurationException
   * if the parser is not properly configured
   */
  public static TrovitDocument createDocument( String xmlString ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument( XmlUtils.newDocument( xmlString, true ) );
  }

  /**
   * Creates a {@link TrovitDocument} from a {@link Document}.
   *
   * @param doc
   * XML document
   *
   * @return
   * created document or null, of the document is not supported by this format
   */
  public static TrovitDocument createDocument( Document doc )
  {
    if (TrovitDocument.isReadable( doc ))
      return new TrovitDocument( doc );
    else
      return null;
  }

  /**
   * Creates a {@link Marshaller} to write JAXB objects into XML.
   *
   * @return
   * created marshaller
   *
   * @throws JAXBException
   * if a problem with JAXB occured
   */
  public static Marshaller createMarshaller() throws JAXBException
  {
    return createMarshaller( Charset.defaultCharset().name(), true );
  }

  /**
   * Creates a {@link Marshaller} to write JAXB objects into XML.
   *
   * @param encoding
   * encoding of written XML
   *
   * @param formatted
   * if written XML is pretty printed
   *
   * @return
   * created marshaller
   *
   * @throws JAXBException
   * if a problem with JAXB occured
   */
  public static Marshaller createMarshaller( String encoding, boolean formatted ) throws JAXBException
  {
    Marshaller m = getContext().createMarshaller();
    m.setProperty( Marshaller.JAXB_ENCODING, encoding );
    m.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, formatted );
    m.setEventHandler( new XmlValidationHandler() );
    return m;
  }

  /**
   * Creates a {@link Unmarshaller} to read JAXB objects from XML.
   *
   * @return
   * created unmarshaller
   *
   * @throws JAXBException
   * if a problem with JAXB occured
   */
  public static Unmarshaller createUnmarshaller() throws JAXBException
  {
    Unmarshaller m = getContext().createUnmarshaller();
    m.setEventHandler( new XmlValidationHandler() );
    return m;
  }

  /**
   * Returns the {@link JAXBContext} for this format.
   *
   * @return
   * context
   *
   * @throws JAXBException
   * if a problem with JAXB occured
   */
  public synchronized static JAXBContext getContext() throws JAXBException
  {
    if (JAXB==null) initContext( Thread.currentThread().getContextClassLoader() );
    return JAXB;
  }

  /**
   * Returns the preferred date format for this format.
   *
   * @return
   * date format
   */
  public static DateFormat getDateFormat()
  {
    return new SimpleDateFormat( "dd/MM/yyyy" );
  }

  /**
   * Returns the {@link ObjectFactory} for this format.
   *
   * @return
   * object factory
   */
  public synchronized static ObjectFactory getFactory()
  {
    return FACTORY;
  }

  /**
   * Returns the preferred time format for this format.
   *
   * @return
   * date format
   */
  public static DateFormat getTimeFormat()
  {
    return new SimpleDateFormat( "HH:mm:ss" );
  }

  /**
   * Intializes the {@link JAXBContext} for this format.
   *
   * @param classloader
   * the classloader to load the generated JAXB classes with
   *
   * @throws JAXBException
   * if a problem with JAXB occured
   */
  public synchronized static void initContext( ClassLoader classloader ) throws JAXBException
  {
    JAXB = JAXBContext.newInstance( PACKAGE, classloader );
  }

  public static Action parseAction( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;

    Action action = Action.fromXmlValue( value );
    if (action==null)
      throw new IllegalArgumentException( "Can't parse action value '" + value + "'!" );

    return action;
  }

  public static Boolean parseBool( String value )
  {
    value = StringUtils.trimToNull( value );
    if ("si".equalsIgnoreCase( value ) || "yes".equalsIgnoreCase( value ))
      return Boolean.TRUE;
    else if ("no".equalsIgnoreCase( value ))
      return Boolean.FALSE;
    else if (value!=null)
      return DatatypeConverter.parseBoolean( value );
    else
      throw new IllegalArgumentException( "Can't parse boolean value '" + value + "'!" );
  }

  public static Calendar parseDate( String value )
  {
    return XmlUtils.parseDate( value );
  }

  public static BigDecimal parseFloat( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseDecimal( value ): null;
  }

  public static BigInteger parseInt( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseInteger( value ): null;
  }

  public static IntBool parseIntBool( String value )
  {
    value = StringUtils.trimToNull( value );

    if (value==null)
      return null;
    else if ("0".equalsIgnoreCase( value ))
      return new IntBool( BigInteger.ZERO );
    else if ("1".equalsIgnoreCase( value ))
      return new IntBool( BigInteger.ONE );

    try
    {
      Boolean boolValue = parseBool( value );
      if (boolValue!=null) return new IntBool( boolValue );
    }
    catch (Exception ex)
    {
    }

    try
    {
      BigInteger intValue = DatatypeConverter.parseInteger( value );
      if (intValue!=null) return new IntBool( intValue );
    }
    catch (Exception ex)
    {
    }

    throw new IllegalArgumentException( "Can't parse int-bool value '"+value+"'!" );
  }

  public static BigInteger parseLong( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseInteger( value ): null;
  }

  public static PriceInterval parsePriceInterval( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;

    PriceInterval priceInterval = PriceInterval.fromXmlValue( value );
    if (priceInterval==null)
      throw new IllegalArgumentException( "Can't parse price-interval value '" + value + "'!" );

    return priceInterval;
  }

  public static BigDecimal parsePriceValue( String value )
  {
    Number number = NumberUtils.parseNumber( value, Locale.ENGLISH, Locale.GERMANY );
    if (number==null)
      throw new IllegalArgumentException( "Can't parse price value '"+value+"'!" );
    return BigDecimal.valueOf( number.doubleValue() );
  }

  public static String parseString100( String value )
  {
    return StringUtils.trimToNull( value );
  }

  public static String parseString255( String value )
  {
    return StringUtils.trimToNull( value );
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
    value = StringUtils.trimToNull( value );
    if (value==null) return null;

    Unit unit = Unit.fromXmlValue( value );
    if (unit==null)
      throw new IllegalArgumentException( "Can't parse unit value '" + value + "'!" );

    return unit;
  }

  public static Integer parseYear( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseInt( value ): null;
  }

  public static String printAction( Action value )
  {
    if (value==null)
      throw new IllegalArgumentException( "Can't print action value!" );
    else
      return value.write();
  }

  public static String printBool( Boolean value )
  {
    if (value==null)
      throw new IllegalArgumentException( "Can't print boolean value!" );
    else
      return DatatypeConverter.printBoolean( value );
  }

  public static String printDate( Calendar value )
  {
    if (value==null)
      throw new IllegalArgumentException( "Can't print date value!" );
    else
      return getDateFormat().format( value.getTime() );
  }

  public static String printFloat( BigDecimal value )
  {
    if (value==null)
      throw new IllegalArgumentException( "Can't print float value!" );
    else
      return DatatypeConverter.printDecimal( value );
  }

  public static String printInt( BigInteger value )
  {
    if (value==null)
      throw new IllegalArgumentException( "Can't print integer value!" );
    else
      return DatatypeConverter.printInteger( value );
  }

  public static String printIntBool( IntBool value )
  {
    Boolean boolValue = (value!=null)? value.getBoolValue(): null;
    BigInteger intValue = (value!=null)? value.getIntValue(): null;
    if (boolValue!=null)
      return DatatypeConverter.printBoolean( boolValue );
    else if (intValue!=null)
      return DatatypeConverter.printInteger( intValue );
    else
      throw new IllegalArgumentException( "Can't print int-bool value!" );
  }

  public static String printLong( BigInteger value )
  {
    if (value==null)
      throw new IllegalArgumentException( "Can't print long value!" );
    else
      return DatatypeConverter.printInteger( value );
  }

  public static String printPriceInterval( PriceInterval value )
  {
    if (value==null)
      throw new IllegalArgumentException( "Can't print price-interval value!" );
    else
      return value.write();
  }

  public static String printPriceValue( BigDecimal value )
  {
    if (value==null)
      throw new IllegalArgumentException( "Can't print price value!" );
    else
      return DatatypeConverter.printDecimal( value.setScale( 2, BigDecimal.ROUND_HALF_UP ) );
  }

  public static String printString100( String value )
  {
    return StringUtils.abbreviate( StringUtils.trimToEmpty( value ), 100 );
  }

  public static String printString255( String value )
  {
    return StringUtils.abbreviate( StringUtils.trimToEmpty( value ), 255 );
  }

  public static String printTime( Calendar value )
  {
    if (value==null)
      throw new IllegalArgumentException( "Can't print time value!" );
    else
      return getTimeFormat().format( value.getTime() );
  }

  public static String printUnit( Unit value )
  {
    if (value==null)
      throw new IllegalArgumentException( "Can't print unit value!" );
    else
      return value.write();
  }

  public static String printYear( Integer value )
  {
    if (value==null || value<1000 || value>9999)
      throw new IllegalArgumentException( "Can't print year value!" );
    else
      return DatatypeConverter.printInt( value );
  }
}