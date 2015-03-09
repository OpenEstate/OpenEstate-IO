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
    final Calendar min = DatatypeConverter.parseDateTime( "2000-12-31T00:00:00" );
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
    value = StringUtils.trimToNull( value );
    if (value==null) return null;

    Category cat = Category.fromXmlValue( value );
    if (cat==null)
      throw new IllegalArgumentException( "Can't parse category value '" + value + "'!" );

    return cat;
  }

  public static String parseCountry( String value )
  {
    return StringUtils.trimToNull( value );
  }

  public static Currency parseCurrency(String value)
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;
    try
    {
      if (value.trim().length()!=3)
        throw new Exception( "Currency code must contain of 3 characters." );

      return Currency.getInstance( value.trim().toUpperCase() );
    }
    catch (Exception ex)
    {
      throw new IllegalArgumentException( "Can't parse currency value '" + value + "'!", ex );
    }
  }

  public static String parseEmailType(String value)
  {
    //value = StringUtils.trimToNull( value );
    //if (value==null)
    //  return null;
    //else if (value.matches( "[^@]+@[^\\.]+\\..+" ))
    //  return value;
    //else
    //  throw new IllegalArgumentException( "Can't parse e-mail value '" + value + "'!" );
    return StringUtils.trimToNull( value );
  }

  public static EnergyUnit parseEnergyUnit( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;

    EnergyUnit unit = EnergyUnit.fromXmlValue( value );
    if (unit==null)
      throw new IllegalArgumentException( "Can't parse energy-unit value '" + value + "'!" );

    return unit;
  }

  public static Long parseInteger( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseLong( value ): null;
  }

  public static LandSizeUnit parseLandSizeUnit( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;

    LandSizeUnit unit = LandSizeUnit.fromXmlValue( value );
    if (unit==null)
      throw new IllegalArgumentException( "Can't parse land-size-unit value '" + value + "'!" );

    return unit;
  }

  public static Double parseLatitude( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseDouble( value ): null;
  }

  public static Double parseLongitude( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseDouble( value ): null;
  }

  public static Integer parseRooms( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseInt( value ): null;
  }

  public static SizeUnit parseSizeUnit( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;

    SizeUnit unit = SizeUnit.fromXmlValue( value );
    if (unit==null)
      throw new IllegalArgumentException( "Can't parse size-unit value '" + value + "'!" );

    return unit;
  }

  private static String parseText( String value, int length )
  {
    return StringUtils.trimToNull( value );
  }

  public static String parseText3000( String value )
  {
    return parseText( value, 3000 );
  }

  public static Transaction parseTransaction( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;

    Transaction unit = Transaction.fromXmlValue( value );
    if (unit==null)
      throw new IllegalArgumentException( "Can't parse transaction value '" + value + "'!" );

    return unit;
  }

  public static Integer parseYear( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseInt( value ): null;
  }

  public static Boolean parseYesNo( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null)
      return null;
    else if ("yes".equalsIgnoreCase( value ))
      return Boolean.TRUE;
    else if ("no".equalsIgnoreCase( value ))
      return Boolean.FALSE;
    else
      throw new IllegalArgumentException( "Can't parse yes-no value '" + value + "'!" );
  }

  public static Boolean parseYN( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null)
      return null;
    else if ("y".equalsIgnoreCase( value ))
      return Boolean.TRUE;
    else if ("n".equalsIgnoreCase( value ))
      return Boolean.FALSE;
    else
      throw new IllegalArgumentException( "Can't parse y-n value '" + value + "'!" );
  }

  public static String printCategory( Category value )
  {
    if (value==null)
      throw new IllegalArgumentException( "Can't print category value!" );
    else
      return value.getXmlValue();
  }

  public static String printCountry( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null)
      throw new IllegalArgumentException( "Can't print country value!" );

    String iso2 = StringUtils.trimToNull( ImmobiliareItUtils.getCountryCode( value ) );
    if (iso2==null)
      throw new IllegalArgumentException( "Can't convert country '" + value + "' to its ISO2 code!" );
    else
      return iso2;
  }

  public static String printCurrency( Currency value)
  {
    if (value==null)
      throw new IllegalArgumentException( "Can't print currency value!" );
    else
      return value.getCurrencyCode();
  }

  public static String printDateUpdatedType( Calendar value )
  {
    if (value==null || !isValidDateUpdatedType( value ))
      throw new IllegalArgumentException( "Can't print date-updated value!" );
    else
      return DatatypeConverter.printDateTime( value );
  }

  public static String printEmailType( String value)
  {
    if (value==null || !isValidEmailType( value ))
      throw new IllegalArgumentException( "Can't print email value!" );
    else
      return value;
  }

  public static String printEnergyUnit( EnergyUnit value )
  {
    if (value==null)
      throw new IllegalArgumentException( "Can't print energy-unit value!" );
    else
      return value.getXmlValue();
  }

  public static String printInteger( Long value )
  {
    if (value==null)
      throw new IllegalArgumentException( "Can't print integer value!" );
    else
      return DatatypeConverter.printLong( value );
  }

  public static String printLandSizeUnit( LandSizeUnit value )
  {
    if (value==null)
      throw new IllegalArgumentException( "Can't print land-size-unit value!" );
    else
      return value.getXmlValue();
  }

  public static String printLatitude( Double value )
  {
    if (value==null || !isValidLatitude(value))
      throw new IllegalArgumentException( "Can't print latitude value!" );
    else
      return DatatypeConverter.printDouble( value );
  }

  public static String printLongitude( Double value )
  {
    if (value==null || !isValidLongitude(value))
      throw new IllegalArgumentException( "Can't print longitude value!" );
    else
      return DatatypeConverter.printDouble( value );
  }

  public static String printRooms( Integer value )
  {
    if (value==null || !isValidRooms(value))
      throw new IllegalArgumentException( "Can't print rooms value!" );
    else
      return DatatypeConverter.printInt( value );
  }

  public static String printSizeUnit( SizeUnit value )
  {
    if (value==null)
      throw new IllegalArgumentException( "Can't print size-unit value!" );
    else
      return value.getXmlValue();
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

  public static String printText3000( String value )
  {
    return printText( value, 3000 );
  }

  public static String printTransaction( Transaction value )
  {
    if (value==null)
      throw new IllegalArgumentException( "Can't print transaction value!" );
    else
      return value.getXmlValue();
  }

  public static String printYear( Integer value )
  {
    if (value==null || !isValidYear(value))
      throw new IllegalArgumentException( "Can't print year value!" );
    else
      return DatatypeConverter.printInt( value );
  }

  public static String printYesNo( Boolean value )
  {
    if (Boolean.TRUE.equals( value ))
      return "yes";
    else if (Boolean.FALSE.equals( value ))
      return "no";
    else
      throw new IllegalArgumentException( "Can't print yes-no value!" );
  }

  public static String printYN( Boolean value )
  {
    if (Boolean.TRUE.equals( value ))
      return "Y";
    else if (Boolean.FALSE.equals( value ))
      return "N";
    else
      throw new IllegalArgumentException( "Can't print y-n value!" );
  }
}