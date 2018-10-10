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
package org.openestate.io.wis_it;

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
import javax.xml.bind.DatatypeConverter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.core.XmlValidationHandler;
import org.openestate.io.wis_it.xml.ObjectFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 * Some helper functions for the XML format of
 * <a href="http://wohnen-in-suedtirol.it/">wohnen-in-suedtirol.it</a>.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public class WisItUtils
{
  private final static Logger LOGGER = LoggerFactory.getLogger( WisItUtils.class );
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
  public final static String PACKAGE = "org.openestate.io.wis_it.xml";

  /**
   * the factory for creation of JAXB objects
   */
  private final static ObjectFactory FACTORY = new ObjectFactory();

  private WisItUtils()
  {
  }

  /**
   * Creates a {@link WisItDocument} from an {@link InputStream}.
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
  public static WisItDocument createDocument( InputStream input ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument(XmlUtils.newDocument( input, true ) );
  }

  /**
   * Creates a {@link WisItDocument} from a {@link File}.
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
  public static WisItDocument createDocument( File xmlFile ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument(XmlUtils.newDocument( xmlFile, true ) );
  }

  /**
   * Creates a {@link WisItDocument} from a {@link String}.
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
  public static WisItDocument createDocument( String xmlString ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument(XmlUtils.newDocument( xmlString, true ) );
  }

  /**
   * Creates a {@link WisItDocument} from a {@link Document}.
   *
   * @param doc
   * XML document
   *
   * @return
   * created document or null, of the document is not supported by this format
   */
  public static WisItDocument createDocument( Document doc )
  {
    if (WisItDocument.isReadable( doc ))
      return new WisItDocument( doc );
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
    m.setEventHandler(new XmlValidationHandler() );
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
    m.setEventHandler(new XmlValidationHandler() );
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
   * Returns the preferred date-time format for this format.
   *
   * @return
   * date format
   */
  public static DateFormat getDateTimeFormat()
  {
    return new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
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

  public static Calendar parseDateTime( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;
    try
    {
      Date date = DateUtils.parseDateStrictly( value, new String[]{
        "yyyy-MM-dd mm:hh:ss", "yyyy-MM-dd mm:hh", "yyyy-MM-dd" } );
      Calendar cal = Calendar.getInstance();
      cal.setTime( date );
      return cal;
    }
    catch (ParseException ex)
    {
      //LOGGER.warn( "Can't parse value '" + value + "' as date-time!" );
      //LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
    }

    // try to parse the value as xsd:dateTime instead
    try
    {
      return XmlUtils.parseDateTime( value );
    }
    catch (IllegalArgumentException ex)
    {
      //LOGGER.warn( "Can't parse value '" + value + "' as date-time!" );
      //LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
    }

    throw new IllegalArgumentException( "Can't parse date-time value '"+value+"'!" );
  }

  public static BigDecimal parseDecimal( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseDecimal( value ): null;
  }

  public static BigDecimal parseDouble( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseDecimal( value ): null;
  }

  public static BigInteger parsePositiveInteger( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseInteger( value ): null;
  }

  public static Boolean parseYesNo( String value )
  {
    value = StringUtils.trimToNull( value );
    if ("ja".equalsIgnoreCase( value ))
      return Boolean.TRUE;
    else if ("nein".equalsIgnoreCase( value ))
      return Boolean.FALSE;
    else if (value!=null)
      return DatatypeConverter.parseBoolean( value );
    else
      throw new IllegalArgumentException( "Can't parse boolean value '" + value + "'!" );
  }

  public static String printDateTime( Calendar value )
  {
    if (value==null)
      throw new IllegalArgumentException( "Can't print date-time value!" );
    else
      return getDateTimeFormat().format( value.getTime() );
  }

  public static String printDecimal( BigDecimal value )
  {
    if (value==null)
      throw new IllegalArgumentException( "Can't print decimal value!" );
    else
      return DatatypeConverter.printDecimal( value.setScale( 2, BigDecimal.ROUND_HALF_UP ) );
  }

  public static String printDouble( BigDecimal value )
  {
    if (value==null)
      throw new IllegalArgumentException( "Can't print double value!" );
    else
      return DatatypeConverter.printDecimal( value );
  }

  public static String printPositiveInteger( BigInteger value )
  {
    if (value==null || value.compareTo( BigInteger.ZERO )<1)
      throw new IllegalArgumentException( "Can't print positive integer value!" );
    else
      return DatatypeConverter.printInteger( value );
  }

  public static String printYesNo( Boolean value )
  {
    if (Boolean.TRUE.equals( value ))
      return "ja";
    else if (Boolean.FALSE.equals( value ))
      return "nein";
    else
      throw new IllegalArgumentException( "Can't print boolean value!" );
  }
}