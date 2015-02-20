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
import org.openestate.io.core.DocumentUtils;
import org.openestate.io.kyero.xml.ObjectFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 * KyeroUtils.
 *
 * @author Andreas Rudolph
 */
public class KyeroUtils
{
  private final static Logger LOGGER = LoggerFactory.getLogger( KyeroUtils.class );
  public final static String PACKAGE = "org.openestate.io.kyero.xml";
  public final static KyeroVersion VERSION = KyeroVersion.V3;
  public final static String NAMESPACE = StringUtils.EMPTY;
  private final static ObjectFactory FACTORY = new ObjectFactory();
  private static JAXBContext JAXB = null;

  private KyeroUtils()
  {
  }

  public static KyeroDocument createDocument( InputStream input ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument( DocumentUtils.newDocument( input, true ) );
  }

  public static KyeroDocument createDocument( File xmlFile ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument( DocumentUtils.newDocument( xmlFile, true ) );
  }

  public static KyeroDocument createDocument( String xmlString ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument( DocumentUtils.newDocument( xmlString, true ) );
  }

  public static KyeroDocument createDocument( Document doc )
  {
    if (KyeroDocument.isTransferDocument( doc ))
      return new KyeroDocument( doc );
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

  public static DateFormat getDateFormat()
  {
    return new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
  }

  public static DateFormat getDateFormatAlternative()
  {
    return new SimpleDateFormat( "yyyy-MM-dd" );
  }

  public synchronized static ObjectFactory getFactory()
  {
    return FACTORY;
  }

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
    if (!"http".equals( value.getProtocol() ))
      return false;
    if (value.toString().length()>255)
      return false;
    return true;
  }

  public static Boolean parseBoolType( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseBoolean( value ): null;
  }

  public static Calendar parseDateType( String value )
  {
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
        LOGGER.warn( "Can't parse date!" );
        LOGGER.warn( "> value: " + value );
        LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
        return null;
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
    return value;
  }

  public static String parseIdType( String value )
  {
    return value;
  }

  public static Integer parseImageAttributeType( String value )
  {
    try
    {
      return Integer.valueOf( value );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't parse image-attribute!" );
      LOGGER.warn( "> value: " + value );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public static URL parseImageUrlType( String value )
  {
    try
    {
      return new URL( value );
    }
    catch (MalformedURLException ex)
    {
      LOGGER.warn( "Can't parse image-url!" );
      LOGGER.warn( "> value: " + value );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public static Long parseInteger( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseLong( value ): null;
  }

  public static String parseLocationType( String value )
  {
    return value;
  }

  public static Long parsePriceType( String value )
  {
    if ("x".equalsIgnoreCase( value )) return null;
    try
    {
      return Long.valueOf( value );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't parse price!" );
      LOGGER.warn( "> value: " + value );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public static String parseRefType( String value )
  {
    return value;
  }

  public static String parseRequiredType( String value )
  {
    return value;
  }

  public static String parseTypeDataType( String value )
  {
    return value;
  }

  public static URL parseUrlDataType( String value )
  {
    try
    {
      return new URL( value );
    }
    catch (MalformedURLException ex)
    {
      LOGGER.warn( "Can't parse url!" );
      LOGGER.warn( "> value: " + value );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public static String printBoolType( Boolean value )
  {
    if (Boolean.TRUE.equals( value ))
      return "1";
    else if (Boolean.FALSE.equals( value ))
      return "0";
    else
      return StringUtils.EMPTY;
  }

  public static String printDateType( Calendar value )
  {
    if (value!=null) return getDateFormat().format( value.getTime() );
    throw new IllegalArgumentException( "Empty date value!" );
  }

  public static String printDecimal( Double value )
  {
    return (value!=null && value>=0)? DatatypeConverter.printDouble( value ): null;
  }

  public static String printFeedVersionType( String value )
  {
    if (isValidFeedVersionType( value )) return value;
    throw new IllegalArgumentException( "Invalid feed-version value: " + value );
  }

  public static String printIdType( String value )
  {
    if (isValidIdType( value )) return StringUtils.abbreviate( value, 50 );
    throw new IllegalArgumentException( "Invalid id value: " + value );
  }

  public static String printImageAttributeType( Integer value )
  {
    if (isValidImageAttributeType( value )) return DatatypeConverter.printInt( value );
    throw new IllegalArgumentException( "Invalid image-attribute value: " + value );
  }

  public static String printImageUrlType( URL value )
  {
    if (isValidImageUrlType( value )) return value.toString();
    throw new IllegalArgumentException( "Invalid image-url value: " + value );
  }

  public static String printInteger( Long value )
  {
    return (value!=null)? DatatypeConverter.printLong( value ): null;
  }

  public static String printLocationType( String value )
  {
    if (value!=null) return StringUtils.abbreviate( value, 50 );
    throw new IllegalArgumentException( "Empty location value!" );
  }

  public static String printNonNegativeInteger( Long value )
  {
    return (value!=null && value>=0)? DatatypeConverter.printLong( value ): null;
  }

  public static String printPriceType( Long value )
  {
    if (value!=null)
      return DatatypeConverter.printLong( value );
    else
      return "x";
  }

  public static String printRefType( String value )
  {
    if (isValidRefType( value )) return StringUtils.abbreviate( value, 15 );
    throw new IllegalArgumentException( "Invalid ref value: " + value );
  }

  public static String printRequiredType( String value )
  {
    if (isValidRequiredType( value )) return value;
    throw new IllegalArgumentException( "Invalid required value: " + value );
  }

  public static String printTypeDataType( String value )
  {
    if (isValidTypeDataType( value )) return value;
    throw new IllegalArgumentException( "Invalid type-data value: " + value );
  }

  public static String printUrlDataType( URL value )
  {
    if (isValidUrlDataType( value )) return value.toString();
    throw new IllegalArgumentException( "Invalid url value: " + value );
  }
}