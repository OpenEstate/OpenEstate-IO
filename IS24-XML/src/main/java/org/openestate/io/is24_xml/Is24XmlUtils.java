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
package org.openestate.io.is24_xml;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.xml.bind.DatatypeConverter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.lang3.StringUtils;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.core.XmlValidationHandler;
import org.openestate.io.is24_xml.xml.ObjectFactory;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 * Some helper functions for the IS24-XML format.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public class Is24XmlUtils
{
  //private final static Logger LOGGER = LoggerFactory.getLogger( Is24XmlUtils.class );
  private static JAXBContext JAXB = null;

  /**
   * the latest implemented version of this format
   */
  public final static String VERSION = "rev189438";

  /**
   * the XML target namespace of this format
   */
  public final static String NAMESPACE = "http://www.immobilienscout24.de/immobilientransfer";

  /**
   * the package, where generated JAXB classes are located
   */
  public final static String PACKAGE = "org.openestate.io.is24_xml.xml";

  /**
   * the factory for creation of JAXB objects
   */
  public final static ObjectFactory FACTORY = new ObjectFactory();


  private Is24XmlUtils()
  {
  }

  /**
   * Creates a {@link Is24XmlDocument} from an {@link InputStream}.
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
  public static Is24XmlDocument createDocument( InputStream input ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument( XmlUtils.newDocument( input, true ) );
  }

  /**
   * Creates a {@link Is24XmlDocument} from a {@link File}.
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
  public static Is24XmlDocument createDocument( File xmlFile ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument( XmlUtils.newDocument( xmlFile, true ) );
  }

  /**
   * Creates a {@link Is24XmlDocument} from a {@link String}.
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
  public static Is24XmlDocument createDocument( String xmlString ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument( XmlUtils.newDocument( xmlString, true ) );
  }

  /**
   * Creates a {@link Is24XmlDocument} from a {@link Document}.
   *
   * @param doc
   * XML document
   *
   * @return
   * created document or null, of the document is not supported by this format
   */
  public static Is24XmlDocument createDocument( Document doc )
  {
    if (Is24XmlDocument.isReadable( doc ))
      return new Is24XmlDocument( doc );
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
    return new SimpleDateFormat( "yyyy-MM-dd" );
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

  public static Calendar parseDate( String value )
  {
    return XmlUtils.parseDate( value );
  }

  public static BigDecimal parsePreisAufAnfrage( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseDecimal( value ): null;
  }

  public static String parseEmail( String value )
  {
    //value = StringUtils.trimToNull( value );
    //if (value==null)
    //  return null;
    //else if (value.matches( ".*@.*\\..*" ))
    //  return value;
    //else
    //  throw new IllegalArgumentException( "Can't parse e-mail value '" + value + "'!" );
    return StringUtils.trimToNull( value );
  }

  private static String parseText( String value, int length )
  {
    return StringUtils.trimToNull( value );
  }

  public static String parseText4( String value )
  {
    return parseText( value, 4 );
  }

  public static String parseText15( String value )
  {
    return parseText( value, 15 );
  }

  public static String parseText20( String value )
  {
    return parseText( value, 20 );
  }

  public static String parseText30( String value )
  {
    return parseText( value, 30 );
  }

  public static String parseText40( String value )
  {
    return parseText( value, 40 );
  }

  public static String parseText50( String value )
  {
    return parseText( value, 50 );
  }

  public static String parseText80( String value )
  {
    return parseText( value, 80 );
  }

  public static String parseText100( String value )
  {
    return parseText( value, 100 );
  }

  public static String parseText150( String value )
  {
    return parseText( value, 150 );
  }

  public static String parseText200( String value )
  {
    return parseText( value, 200 );
  }

  public static String parseText255( String value )
  {
    return parseText( value, 255 );
  }

  public static String parseText300( String value )
  {
    return parseText( value, 300 );
  }

  public static String parseText500( String value )
  {
    return parseText( value, 500 );
  }

  public static String parseText2000( String value )
  {
    return parseText( value, 2000 );
  }

  public static URL parseWebUrl( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;
    try
    {
      if (!StringUtils.startsWithIgnoreCase( value, "http://" ) && !StringUtils.startsWithIgnoreCase( value, "https://" ))
        return new URL( "http://" + value );
      else
        return new URL( value );
    }
    catch (MalformedURLException ex)
    {
      throw new IllegalArgumentException( "Can't parse URL value '" + value + "'!", ex );
    }
  }

  public static Long parseZahl2( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseLong( value ): null;
  }

  public static Long parseZahl3( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseLong( value ): null;
  }

  public static Long parseZahl4( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseLong( value ): null;
  }

  public static Long parseZahl5( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseLong( value ): null;
  }

  public static Long parseZahl8( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseLong( value ): null;
  }

  public static Long parseZahl10( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseLong( value ): null;
  }

  public static BigInteger parseZahl20( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseInteger( value ): null;
  }

  public static BigDecimal parseZahl31( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseDecimal( value ): null;
  }

  public static BigDecimal parseZahl32( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseDecimal( value ): null;
  }

  public static BigDecimal parseZahl42( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseDecimal( value ): null;
  }

  public static BigDecimal parseZahl52( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseDecimal( value ): null;
  }

  public static BigDecimal parseZahl62( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseDecimal( value ): null;
  }

  public static BigDecimal parseZahl72( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseDecimal( value ): null;
  }

  public static BigDecimal parseZahl102( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseDecimal( value ): null;
  }

  public static BigDecimal parseZahl152( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseDecimal( value ): null;
  }

  public static BigDecimal parseZimmeranzahl( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseDecimal( value ): null;
  }

  public static String printDate( Calendar value )
  {
    if (value==null)
      throw new IllegalArgumentException( "Can't print date value '" + value + "'!" );
    else
      return getDateFormat().format( value.getTime() );
  }

  public static String printEmail( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null || value.length()>150 || !value.matches( ".*@.*\\..*" ))
      throw new IllegalArgumentException( "Can't print email value '" + value + "'!" );
    else
      return value;
  }

  public static String printPreisAufAnfrage( BigDecimal value )
  {
    if (value==null || value.compareTo( BigDecimal.ZERO )==-1 || value.compareTo( BigDecimal.TEN.pow( 13 ) )!=-1)
      throw new IllegalArgumentException( "Can't print decimal value '" + value + "'!" );
    else if (value.compareTo( BigDecimal.ZERO )==0)
      return "0";
    else
      return DatatypeConverter.printDecimal( value.setScale( 2, BigDecimal.ROUND_HALF_UP ) );
  }

  private static String printText( String value, int maxLength )
  {
    value = StringUtils.trimToEmpty( value );
    int length = value.length();
    if (length<=0)
      return StringUtils.EMPTY;
    else if (length<=maxLength)
      return value;
    else if (maxLength>3)
      return StringUtils.abbreviate( value, maxLength );
    else
      return value.substring( 0, maxLength );
  }

  public static String printText4( String value )
  {
    return printText( value, 4 );
  }

  public static String printText15( String value )
  {
    return printText( value, 15 );
  }

  public static String printText20( String value )
  {
    return printText( value, 20 );
  }

  public static String printText30( String value )
  {
    return printText( value, 30 );
  }

  public static String printText40( String value )
  {
    return printText( value, 40 );
  }

  public static String printText50( String value )
  {
    return printText( value, 50 );
  }

  public static String printText80( String value )
  {
    return printText( value, 80 );
  }

  public static String printText100( String value )
  {
    return printText( value, 100 );
  }

  public static String printText150( String value )
  {
    return printText( value, 150 );
  }

  public static String printText200( String value )
  {
    return printText( value, 200 );
  }

  public static String printText255( String value )
  {
    return printText( value, 255 );
  }

  public static String printText300( String value )
  {
    return printText( value, 300 );
  }

  public static String printText500( String value )
  {
    return printText( value, 500 );
  }

  public static String printText2000( String value )
  {
    return printText( value, 2000 );
  }

  public static String printWebUrl( URL value )
  {
    if (value==null || StringUtils.isBlank( value.getHost() ))
      throw new IllegalArgumentException( "Can't print URL value '" + value + "'!" );
    else
      return value.toExternalForm();
  }

  public static String printZahl2( Long value )
  {
    if (value==null || value<=0)
      throw new IllegalArgumentException( "Can't print integer value '" + value + "'!" );
    String val = DatatypeConverter.printLong( value );
    if (val.length()>2)
      throw new IllegalArgumentException( "Can't print integer value '" + value + "'! The value exceeds maximal length of 2 digits." );
    return val;
  }

  public static String printZahl2Including0( Long value )
  {
    if (value==null || value<0)
      throw new IllegalArgumentException( "Can't print integer value '" + value + "'!" );
    String val = DatatypeConverter.printLong( value );
    if (val.length()>2)
      throw new IllegalArgumentException( "Can't print integer value '" + value + "'! The value exceeds maximal length of 2 digits." );
    return val;
  }

  public static String printZahl3( Long value )
  {
    if (value==null || value<=0)
      throw new IllegalArgumentException( "Can't print integer value '" + value + "'!" );
    String val = DatatypeConverter.printLong( value );
    if (val.length()>3)
      throw new IllegalArgumentException( "Can't print integer value '" + value + "'! The value exceeds maximal length of 3 digits." );
    return val;
  }

  public static String printZahl3Including0( Long value )
  {
    if (value==null || value<0)
      throw new IllegalArgumentException( "Can't print integer value '" + value + "'!" );
    String val = DatatypeConverter.printLong( value );
    if (val.length()>3)
      throw new IllegalArgumentException( "Can't print integer value '" + value + "'! The value exceeds maximal length of 3 digits." );
    return val;
  }

  public static String printZahl4( Long value )
  {
    if (value==null || value<=0)
      throw new IllegalArgumentException( "Can't print integer value '" + value + "'!" );
    String val = DatatypeConverter.printLong( value );
    if (val.length()>4)
      throw new IllegalArgumentException( "Can't print integer value '" + value + "'! The value exceeds maximal length of 4 digits." );
    return val;
  }

  public static String printZahl5( Long value )
  {
    if (value==null || value<=0)
      throw new IllegalArgumentException( "Can't print integer value '" + value + "'!" );
    String val = DatatypeConverter.printLong( value );
    if (val.length()>5)
      throw new IllegalArgumentException( "Can't print integer value '" + value + "'! The value exceeds maximal length of 5 digits." );
    return val;
  }

  public static String printZahl8( Long value )
  {
    if (value==null || value<=0)
      throw new IllegalArgumentException( "Can't print integer value '" + value + "'!" );
    String val = DatatypeConverter.printLong( value );
    if (val.length()>8)
      throw new IllegalArgumentException( "Can't print integer value '" + value + "'! The value exceeds maximal length of 8 digits." );
    return val;
  }

  public static String printZahl10( Long value )
  {
    if (value==null || value<=0)
      throw new IllegalArgumentException( "Can't print integer value '" + value + "'!" );
    String val = DatatypeConverter.printLong( value );
    if (val.length()>10)
      throw new IllegalArgumentException( "Can't print integer value '" + value + "'! The value exceeds maximal length of 10 digits." );
    return val;
  }

  public static String printZahl20( BigInteger value )
  {
    if (value==null || value.compareTo( BigInteger.ZERO )!=1)
      throw new IllegalArgumentException( "Can't print integer value '" + value + "'!" );
    String val = DatatypeConverter.printInteger( value );
    if (val.length()>20)
      throw new IllegalArgumentException( "Can't print integer value '" + value + "'! The value exceeds maximal length of 20 digits." );
    return val;
  }

  public static String printZahl31( BigDecimal value )
  {
    if (value==null || value.compareTo( BigDecimal.ZERO )!=1 || value.compareTo( BigDecimal.TEN.pow( 2 ) )!=-1)
      throw new IllegalArgumentException( "Can't print decimal value '" + value + "'!" );
    else
      return DatatypeConverter.printDecimal( value.setScale( 1, BigDecimal.ROUND_HALF_UP ) );
  }

  public static String printZahl32( BigDecimal value )
  {
    if (value==null || value.compareTo( BigDecimal.ZERO )!=1 || value.compareTo( BigDecimal.TEN.pow( 1 ) )!=-1)
      throw new IllegalArgumentException( "Can't print decimal value '" + value + "'!" );
    else
      return DatatypeConverter.printDecimal( value.setScale( 2, BigDecimal.ROUND_HALF_UP ) );
  }

  public static String printZahl42( BigDecimal value )
  {
    if (value==null || value.compareTo( BigDecimal.ZERO )!=1 || value.compareTo( BigDecimal.TEN.pow( 2 ) )!=-1)
      throw new IllegalArgumentException( "Can't print decimal value '" + value + "'!" );
    else
      return DatatypeConverter.printDecimal( value.setScale( 2, BigDecimal.ROUND_HALF_UP ) );
  }

  public static String printZahl52( BigDecimal value )
  {
    if (value==null || value.compareTo( BigDecimal.ZERO )!=1 || value.compareTo( BigDecimal.TEN.pow( 3 ) )!=-1)
      throw new IllegalArgumentException( "Can't print decimal value '" + value + "'!" );
    else
      return DatatypeConverter.printDecimal( value.setScale( 2, BigDecimal.ROUND_HALF_UP ) );
  }

  public static String printZahl62( BigDecimal value )
  {
    if (value==null || value.compareTo( BigDecimal.ZERO )!=1 || value.compareTo( BigDecimal.TEN.pow( 4 ) )!=-1)
      throw new IllegalArgumentException( "Can't print decimal value '" + value + "'!" );
    else
      return DatatypeConverter.printDecimal( value.setScale( 2, BigDecimal.ROUND_HALF_UP ) );
  }

  public static String printZahl72( BigDecimal value )
  {
    if (value==null || value.compareTo( BigDecimal.ZERO )!=1 || value.compareTo( BigDecimal.TEN.pow( 5 ) )!=-1)
      throw new IllegalArgumentException( "Can't print decimal value '" + value + "'!" );
    else
      return DatatypeConverter.printDecimal( value.setScale( 2, BigDecimal.ROUND_HALF_UP ) );
  }

  public static String printZahl102( BigDecimal value )
  {
    if (value==null || value.compareTo( BigDecimal.ZERO )!=1 || value.compareTo( BigDecimal.TEN.pow( 8 ) )!=-1)
      throw new IllegalArgumentException( "Can't print decimal value '" + value + "'!" );
    else
      return DatatypeConverter.printDecimal( value.setScale( 2, BigDecimal.ROUND_HALF_UP ) );
  }

  public static String printZahl152( BigDecimal value )
  {
    if (value==null || value.compareTo( BigDecimal.ZERO )!=1 || value.compareTo( BigDecimal.TEN.pow( 13 ) )!=-1)
      throw new IllegalArgumentException( "Can't print decimal value '" + value + "'!" );
    else
      return DatatypeConverter.printDecimal( value.setScale( 2, BigDecimal.ROUND_HALF_UP ) );
  }

  public static String printZimmeranzahl( BigDecimal value )
  {
    BigDecimal min = new BigDecimal( "0.5" );
    BigDecimal max = new BigDecimal( "9999" );
    if (value==null || value.compareTo( min )==-1 || value.compareTo( max )==1)
      throw new IllegalArgumentException( "Can't print decimal value '" + value + "'!" );
    else
      return printZahl62( value );
  }
}