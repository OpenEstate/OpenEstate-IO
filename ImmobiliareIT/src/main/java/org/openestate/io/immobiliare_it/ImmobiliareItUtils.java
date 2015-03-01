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

package org.openestate.io.immobiliare_it;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Currency;
import java.util.Locale;
import javax.xml.bind.DatatypeConverter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.lang3.StringUtils;
import org.openestate.io.core.DocumentUtils;
import org.openestate.io.core.LocaleUtils;
import org.openestate.io.core.SilentValidationHandler;
import org.openestate.io.immobiliare_it.xml.ObjectFactory;
import org.openestate.io.immobiliare_it.xml.types.Category;
import org.openestate.io.immobiliare_it.xml.types.EnergyUnit;
import org.openestate.io.immobiliare_it.xml.types.LandSizeUnit;
import org.openestate.io.immobiliare_it.xml.types.SizeUnit;
import org.openestate.io.immobiliare_it.xml.types.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 * ImmobiliareItUtils.
 *
 * @author Andreas Rudolph
 */
public class ImmobiliareItUtils
{
  private final static Logger LOGGER = LoggerFactory.getLogger( ImmobiliareItUtils.class );
  public final static String PACKAGE = "org.openestate.io.immobiliare_it.xml";
  public final static String NAMESPACE = "http://feed.immobiliare.it";
  public final static ImmobiliareItVersion VERSION = ImmobiliareItVersion.V2_5;
  public final static Locale DEFAULT_LOCALE = Locale.ENGLISH;
  private final static ObjectFactory FACTORY = new ObjectFactory();
  private static JAXBContext JAXB = null;

  private ImmobiliareItUtils()
  {
  }

  public static ImmobiliareItDocument createDocument( InputStream input ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument( DocumentUtils.newDocument( input, true ) );
  }

  public static ImmobiliareItDocument createDocument( File xmlFile ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument( DocumentUtils.newDocument( xmlFile, true ) );
  }

  public static ImmobiliareItDocument createDocument( String xmlString ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument( DocumentUtils.newDocument( xmlString, true ) );
  }

  public static ImmobiliareItDocument createDocument( Document doc )
  {
    if (ImmobiliareItDocument.isTransferDocument( doc ))
      return new ImmobiliareItDocument( doc );
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
    m.setEventHandler( new SilentValidationHandler() );
    return m;
  }

  public static Unmarshaller createUnmarshaller() throws JAXBException
  {
    Unmarshaller m = getContext().createUnmarshaller();
    m.setEventHandler( new SilentValidationHandler() );
    return m;
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

  public static String getCountryCode( String country )
  {
    return LocaleUtils.getCountryISO2( country );
  }

  public synchronized static ObjectFactory getFactory()
  {
    return FACTORY;
  }

  public synchronized static void initContext( ClassLoader classloader ) throws JAXBException
  {
    JAXB = JAXBContext.newInstance( PACKAGE, classloader );
  }

  public static boolean isValidDateUpdatedType( Calendar value )
  {
    final Calendar min = javax.xml.bind.DatatypeConverter.parseDateTime( "2000-12-31T00:00:00" );
    return value!=null && !value.before( min );
  }

  public static boolean isValidEmailType( String value )
  {
    return value!=null && value.matches( "[^@]+@[^\\.]+\\..+" );
  }

  public static boolean isValidLatitude( Double value )
  {
    return value!=null && value>=27.2 && value<=71.1;
  }

  public static boolean isValidLongitude( Double value )
  {
    return value!=null && value>=-31.2 && value<=38.9;
  }

  public static boolean isValidRooms( Integer value )
  {
    return value!=null && value>=1 && value<=100;
  }

  public static boolean isValidYear( Integer value )
  {
    return value!=null && value>=1000 && value<=2020;
  }

  public static Category parseCategory( String value )
  {
    return Category.fromXmlValue( value );
  }

  public static String parseCountry( String value )
  {
    return StringUtils.trimToNull( value );
  }

  public static Currency parseCurrency(String value)
  {
    try
    {
      return (value!=null && value.trim().length()==3)? Currency.getInstance( value.trim().toUpperCase() ): null;
    }
    catch (Exception ex)
    {
      LOGGER.warn( "Can't parse currency: " + value );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public static String parseEmailType(String value)
  {
    if (value==null || value.trim().length()==0) return null;
    return (value.matches( "[^@]+@[^\\.]+\\..+" ))? value: null;
  }

  public static EnergyUnit parseEnergyUnit( String value )
  {
    return EnergyUnit.fromXmlValue( value );
  }

  public static Long parseInteger( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseLong( value ): null;
  }

  public static LandSizeUnit parseLandSizeUnit( String value )
  {
    return LandSizeUnit.fromXmlValue( value );
  }

  public static Double parseLatitude( String value )
  {
    try
    {
      return (value!=null)? Double.valueOf( value ): null;
    }
    catch (Exception ex)
    {
      LOGGER.warn( "Can't parse latitude: " + value );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public static Double parseLongitude( String value )
  {
    try
    {
      return (value!=null)? Double.valueOf( value ): null;
    }
    catch (Exception ex)
    {
      LOGGER.warn( "Can't parse longitude: " + value );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public static Integer parseRooms( String value )
  {
    try
    {
      return (value!=null)? Integer.valueOf( value ): null;
    }
    catch (Exception ex)
    {
      LOGGER.warn( "Can't parse rooms: " + value );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public static SizeUnit parseSizeUnit( String value )
  {
    return SizeUnit.fromXmlValue( value );
  }

  private static String parseText( String value, int length )
  {
    return value;
  }

  public static String parseText3000( String value )
  {
    return parseText( value, 3000 );
  }

  public static Transaction parseTransaction( String value )
  {
    return Transaction.fromXmlValue( value );
  }

  public static Integer parseYear( String value )
  {
    try
    {
      return Integer.valueOf( value );
    }
    catch (Exception ex)
    {
      LOGGER.warn( "Can't parse year: " + value );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  @SuppressFBWarnings(
    value = "NP_BOOLEAN_RETURN_NULL",
    justification = "NULL is an expected return value.")
  public static Boolean parseYesNo( String value )
  {
    if ("yes".equalsIgnoreCase( value )) return true;
    if ("no".equalsIgnoreCase( value )) return false;
    return null;
  }

  @SuppressFBWarnings(
    value = "NP_BOOLEAN_RETURN_NULL",
    justification = "NULL is an expected return value.")
  public static Boolean parseYN( String value )
  {
    if ("y".equalsIgnoreCase( value )) return true;
    if ("n".equalsIgnoreCase( value )) return false;
    return null;
  }

  public static String printCategory( Category value )
  {
    return (value!=null)? value.getXmlValue(): null;
  }

  public static String printCountry( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) throw new IllegalArgumentException( "Empty country!" );
    String country = StringUtils.trimToNull( ImmobiliareItUtils.getCountryCode( value ) );
    if (country==null)
    {
      LOGGER.warn( "Can't convert country '" + value + "' to its ISO2 code!" );
      throw new IllegalArgumentException( "Can't convert country '" + value + "' to its ISO2 code!" );
    }
    return country;
  }

  public static String printCurrency(Currency value)
  {
    if (value==null) throw new IllegalArgumentException( "Empty currency!" );
    return value.getCurrencyCode();
  }

  public static String printDateUpdatedType( Calendar value )
  {
    if (isValidDateUpdatedType( value )) return javax.xml.bind.DatatypeConverter.printDateTime( value );
    throw new IllegalArgumentException( "Invalid date-updated: " + value );
  }

  public static String printEmailType(String value)
  {
    if (isValidEmailType(value)) return value;
    throw new IllegalArgumentException( "Invalid email: " + value );
  }

  public static String printEnergyUnit( EnergyUnit value )
  {
    return (value!=null)? value.getXmlValue(): null;
  }

  public static String printInteger( Long value )
  {
    return (value!=null)? DatatypeConverter.printLong( value ): null;
  }

  public static String printLandSizeUnit( LandSizeUnit value )
  {
    return (value!=null)? value.getXmlValue(): null;
  }

  public static String printLatitude( Double value )
  {
    if (isValidLatitude(value)) return value.toString();
    throw new IllegalArgumentException( "Invalid latitude: " + value );
  }

  public static String printLongitude( Double value )
  {
    if (isValidLongitude(value)) return value.toString();
    throw new IllegalArgumentException( "Invalid longitude: " + value );
  }

  public static String printRooms( Integer value )
  {
    if (isValidRooms(value)) return value.toString();
    throw new IllegalArgumentException( "Invalid rooms: " + value );
  }

  public static String printSizeUnit( SizeUnit value )
  {
    return (value!=null)? value.getXmlValue(): null;
  }

  private static String printText( String value, int maxLength )
  {
    value = StringUtils.trimToEmpty( value );
    int length = value.length();
    if (length<=0) return null;
    if (length<=maxLength) return value;
    //LOGGER.debug( "SHORTENING TEXT WITH " + val.length() + " CHARS TO " + length + " CHARS" );
    //LOGGER.debug( val );
    return value.substring( 0, maxLength );
  }

  public static String printText3000( String value )
  {
    return printText( value, 3000 );
  }

  public static String printTransaction( Transaction value )
  {
    return (value!=null)? value.getXmlValue(): null;
  }

  public static String printYear( Integer value )
  {
    if (isValidYear(value)) return DatatypeConverter.printInt( value );
    throw new IllegalArgumentException( "Invalid year: " + value );
  }

  public static String printYesNo( Boolean value )
  {
    if (Boolean.TRUE.equals( value ))
      return "yes";
    else if (Boolean.FALSE.equals( value ))
      return "no";
    else
      return null;
  }

  public static String printYN( Boolean value )
  {
    if (Boolean.TRUE.equals( value ))
      return "Y";
    else if (Boolean.FALSE.equals( value ))
      return "N";
    else
      return null;
  }
}