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

package org.openestate.io.kyero;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.ParseException;
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
import org.openestate.io.kyero.xml.ObjectFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 * Some helper functions for the Kyero-XML format.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public class KyeroUtils
{
  //private final static Logger LOGGER = LoggerFactory.getLogger( KyeroUtils.class );
  private static JAXBContext JAXB = null;

  /**
   * the latest implemented version of this format
   */
  public final static KyeroVersion VERSION = KyeroVersion.V3;

  /**
   * the XML target namespace of this format
   */
  public final static String NAMESPACE = StringUtils.EMPTY;

  /**
   * the package, where generated JAXB classes are located
   */
  public final static String PACKAGE = "org.openestate.io.kyero.xml";

  /**
   * the factory for creation of JAXB objects
   */
  public final static ObjectFactory FACTORY = new ObjectFactory();

  private KyeroUtils()
  {
  }

  /**
   * Creates a {@link KyeroDocument} from an {@link InputStream}.
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
  public static KyeroDocument createDocument( InputStream input ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument( XmlUtils.newDocument( input, true ) );
  }

  /**
   * Creates a {@link KyeroDocument} from a {@link File}.
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
  public static KyeroDocument createDocument( File xmlFile ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument( XmlUtils.newDocument( xmlFile, true ) );
  }

  /**
   * Creates a {@link KyeroDocument} from a {@link String}.
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
  public static KyeroDocument createDocument( String xmlString ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument( XmlUtils.newDocument( xmlString, true ) );
  }

  /**
   * Creates a {@link KyeroDocument} from a {@link Document}.
   *
   * @param doc
   * XML document
   *
   * @return
   * created document or null, of the document is not supported by this format
   */
  public static KyeroDocument createDocument( Document doc )
  {
    if (KyeroDocument.isReadable( doc ))
      return new KyeroDocument( doc );
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
    return new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
  }

  /**
   * Returns the alternative date format for this format.
   *
   * @return
   * date format
   */
  public static DateFormat getDateFormatAlternative()
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

  public static boolean isValidFeedVersionType( String value )
  {
    return value!=null && value.length()>0 && value.length()<=3;
  }

  public static boolean isValidIdType( String value )
  {
    return value!=null && value.length()>0;
  }

  public static boolean isValidImageAttributeType( Integer value )
  {
    return value!=null && value>=0 && value<=100;
  }

  public static boolean isValidImageUrlType( URL value )
  {
    if (value==null)
      return false;
    if (!"http".equals( value.getProtocol() ) && !"ftp".equals( value.getProtocol() ))
      return false;

    String path = StringUtils.trimToEmpty( value.getPath() ).toLowerCase();
    if (!path.endsWith( ".gif" ) && !path.endsWith( ".jpg" ) && !path.endsWith( ".jpeg" ) && !path.endsWith( ".png" ))
      return false;

    return true;
  }

  public static boolean isValidRefType( String value )
  {
    return value!=null && value.length()>0;
  }

  public static boolean isValidRequiredType( String value )
  {
    return value!=null && value.length()>0;
  }

  public static boolean isValidTypeDataType( String value )
  {
    return value!=null && value.matches( "([a-zA-Z&\\s\\(\\)/\\-]+)" );
  }

  public static boolean isValidUrlDataType( URL value )
  {
    if (value==null)
      return false;
    else if (!"http".equals( value.getProtocol() ))
      return false;
    else
      return value.toString().length()<256;
  }

  public static Boolean parseBoolType( String value )
  {
    value = StringUtils.trimToNull( value );
    return DatatypeConverter.parseBoolean( value );
  }

  public static Calendar parseDateType( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;
    try
    {
      Calendar cal = Calendar.getInstance();
      cal.setTime( getDateFormat().parse( value ) );
      return cal;
    }
    catch (ParseException ex)
    {
      try
      {
        Calendar cal = Calendar.getInstance();
        cal.setTime( getDateFormatAlternative().parse( value ) );
        return cal;
      }
      catch (ParseException ex2)
      {
        throw new IllegalArgumentException( "Can't parse date value '"+value+"'!", ex2 );
      }
    }
  }

  public static Double parseDecimal( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseDouble( value ): null;
  }

  public static String parseFeedVersionType( String value )
  {
    return StringUtils.trimToNull( value );
  }

  public static String parseIdType( String value )
  {
    return StringUtils.trimToNull( value );
  }

  public static Integer parseImageAttributeType( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseInt( value ): null;
  }

  public static URL parseImageUrlType( String value )
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

  public static Long parseInteger( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseLong( value ): null;
  }

  public static String parseLocationType( String value )
  {
    return StringUtils.trimToNull( value );
  }

  public static Long parsePriceType( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null && !"x".equalsIgnoreCase( value ))?
      DatatypeConverter.parseLong( value ): null;
  }

  public static String parseRefType( String value )
  {
    return StringUtils.trimToNull( value );
  }

  public static String parseRequiredType( String value )
  {
    return StringUtils.trimToNull( value );
  }

  public static String parseTypeDataType( String value )
  {
    return StringUtils.trimToNull( value );
  }

  public static URL parseUrlDataType( String value )
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

  public static String printBoolType( Boolean value )
  {
    if (Boolean.TRUE.equals( value ))
      return "1";
    else if (Boolean.FALSE.equals( value ))
      return "0";
    else
      throw new IllegalArgumentException( "Can't print boolean value!" );
  }

  public static String printDateType( Calendar value )
  {
    if (value==null)
      throw new IllegalArgumentException( "Can't print date value!" );

    return getDateFormat().format( value.getTime() );
  }

  public static String printDecimal( Double value )
  {
    if (value==null || value<0)
      throw new IllegalArgumentException( "Can't print decimal value!" );
    else
      return DatatypeConverter.printDouble( value );
  }

  public static String printFeedVersionType( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null || !isValidFeedVersionType( value ))
      throw new IllegalArgumentException( "Can't print feed-version value!" );
    else
      return value;
  }

  public static String printIdType( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null || !isValidIdType( value ))
      throw new IllegalArgumentException( "Can't print id value!" );
    else
      return StringUtils.abbreviate( value, 50 );
  }

  public static String printImageAttributeType( Integer value )
  {
    if (value==null || !isValidImageAttributeType( value ))
      throw new IllegalArgumentException( "Can't print image-attribute value!" );
    else
      return DatatypeConverter.printInt( value );
  }

  public static String printImageUrlType( URL value )
  {
    if (value==null || !isValidImageUrlType( value ))
      throw new IllegalArgumentException( "Can't print image-url value!" );
    else
      return value.toString();
  }

  public static String printInteger( Long value )
  {
    if (value==null)
      throw new IllegalArgumentException( "Can't print integer value!" );
    else
      return DatatypeConverter.printLong( value );
  }

  public static String printLocationType( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null)
      throw new IllegalArgumentException( "Can't print location value!" );
    else
      return StringUtils.abbreviate( value, 50 );
  }

  public static String printNonNegativeInteger( Long value )
  {
    if (value==null || value<0)
      throw new IllegalArgumentException( "Can't print integer value!" );
    else
      return DatatypeConverter.printLong( value );
  }

  public static String printPriceType( Long value )
  {
    return (value!=null)?
      DatatypeConverter.printLong( value ): "x";
  }

  public static String printRefType( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null || !isValidRefType( value ))
      throw new IllegalArgumentException( "Can't print ref value!" );
    else
      return StringUtils.abbreviate( value, 15 );
  }

  public static String printRequiredType( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null || !isValidRequiredType( value ))
      throw new IllegalArgumentException( "Can't print required value!" );
    else
      return value;
  }

  public static String printTypeDataType( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null || !isValidTypeDataType( value ))
      throw new IllegalArgumentException( "Can't print type-data value!" );
    else
      return value;
  }

  public static String printUrlDataType( URL value )
  {
    if (value==null || !isValidUrlDataType( value ))
      throw new IllegalArgumentException( "Can't print url-data value!" );
    else
      return value.toString();
  }
}