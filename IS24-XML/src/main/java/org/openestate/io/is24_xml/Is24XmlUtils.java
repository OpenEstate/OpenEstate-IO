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

package org.openestate.io.is24_xml;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import javax.xml.bind.DatatypeConverter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.lang3.StringUtils;
import org.openestate.io.core.DocumentUtils;
import org.openestate.io.core.SilentValidationHandler;
import org.openestate.io.is24_xml.xml.ObjectFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 * Is24XmlUtils.
 *
 * @author Andreas Rudolph
 */
public class Is24XmlUtils
{
  private final static Logger LOGGER = LoggerFactory.getLogger( Is24XmlUtils.class );
  public final static String PACKAGE = "org.openestate.io.is24_xml.xml";
  public final static String NAMESPACE = "http://www.immobilienscout24.de/immobilientransfer";
  public final static String VERSION = "rev189438";
  private final static ObjectFactory FACTORY = new ObjectFactory();
  private static JAXBContext JAXB = null;

  private Is24XmlUtils()
  {
  }

  public static Is24XmlDocument createDocument( InputStream input ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument( DocumentUtils.newDocument( input, true ) );
  }

  public static Is24XmlDocument createDocument( File xmlFile ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument( DocumentUtils.newDocument( xmlFile, true ) );
  }

  public static Is24XmlDocument createDocument( String xmlString ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument( DocumentUtils.newDocument( xmlString, true ) );
  }

  public static Is24XmlDocument createDocument( Document doc )
  {
    if (Is24XmlDocument.isTransferDocument( doc ))
      return new Is24XmlDocument( doc );
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

  public synchronized static ObjectFactory getFactory()
  {
    return FACTORY;
  }

  public synchronized static void initContext( ClassLoader classloader ) throws JAXBException
  {
    JAXB = JAXBContext.newInstance( PACKAGE, classloader );
  }

  public static Calendar parseDate( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseDate( value ): null;
  }

  public static Double parsePreisAufAnfrage( String value )
  {
    return parseZahl( value, 15, 2, -0.01d, 10000000000000d );
  }

  public static String parseEmail( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null && value.matches( ".*@.*\\..*" ))? value: null;
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
      return (!value.toLowerCase().startsWith( "http://" ) && !value.toLowerCase().startsWith( "https://" ))?
        new URL( "http://" + value ) : new URL( value );
    }
    catch (Exception ex)
    {
      LOGGER.warn( ex.getLocalizedMessage() );
      return null;
    }
  }

  private static Long parseZahl( String value, int totalDigits )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;
    NumberFormat format = NumberFormat.getNumberInstance( Locale.ENGLISH );
    //DecimalFormat format = new DecimalFormat();
    //format.getDecimalFormatSymbols().setDecimalSeparator( '.' );
    format.setGroupingUsed( false );
    format.setMaximumFractionDigits( 0 );
    format.setMaximumIntegerDigits( totalDigits );
    try
    {
      Number zahl = format.parse( value );
      if (zahl.longValue()<0)
        return null;
      else
        return zahl.longValue();
    }
    catch (Exception ex)
    {
      LOGGER.warn( ex.getLocalizedMessage() );
      return null;
    }
  }

  private static Double parseZahl( String value, int totalDigits, int fractionDigits, Double min, Double max )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;
    NumberFormat format = NumberFormat.getNumberInstance( Locale.ENGLISH );
    //DecimalFormat format = new DecimalFormat();
    //format.getDecimalFormatSymbols().setDecimalSeparator( '.' );
    format.setGroupingUsed( false );
    format.setMaximumFractionDigits( fractionDigits );
    format.setMaximumIntegerDigits( totalDigits-fractionDigits );
    try
    {
      Number zahl = format.parse( value );
      if (min!=null && zahl.doubleValue()<=min)
        return null;
      else if (max!=null && zahl.doubleValue()>=max)
        return null;
      else
        return zahl.doubleValue();
    }
    catch (Exception ex)
    {
      LOGGER.warn( ex.getLocalizedMessage() );
      return null;
    }
  }

  public static Long parseZahl2( String value )
  {
    return parseZahl( value, 2 );
  }

  public static Long parseZahl3( String value )
  {
    return parseZahl( value, 3 );
  }

  public static Long parseZahl4( String value )
  {
    return parseZahl( value, 4 );
  }

  public static Long parseZahl5( String value )
  {
    return parseZahl( value, 5 );
  }

  public static Long parseZahl8( String value )
  {
    return parseZahl( value, 8 );
  }

  public static Long parseZahl10( String value )
  {
    return parseZahl( value, 10 );
  }

  public static Long parseZahl20( String value )
  {
    return parseZahl( value, 20 );
  }

  public static Double parseZahl31( String value )
  {
    return parseZahl( value, 3, 1, 0d, 100d );
  }

  public static Double parseZahl32( String value )
  {
    return parseZahl( value, 3, 2, 0d, 10d );
  }

  public static Double parseZahl42( String value )
  {
    return parseZahl( value, 4, 2, 0d, 100d );
  }

  public static Double parseZahl52( String value )
  {
    return parseZahl( value, 5, 2, 0d, 1000d );
  }

  public static Double parseZahl62( String value )
  {
    return parseZahl( value, 6, 2, 0d, 10000d );
  }

  public static Double parseZahl72( String value )
  {
    return parseZahl( value, 7, 2, 0d, 100000d );
  }

  public static Double parseZahl102( String value )
  {
    return parseZahl( value, 10, 2, 0d, 100000000d );
  }

  public static Double parseZahl152( String value )
  {
    return parseZahl( value, 15, 2, 0d, 10000000000000d );
  }

  public static Double parseZimmeranzahl( String value )
  {
    Double num = parseZahl62( value );
    if (num!=null && num>=0.5 && num<=9999 ) return num;
    else return null;
  }

  public static String printDate( Calendar value )
  {
    return (value!=null)? new SimpleDateFormat( "yyyy-MM-dd" ).format( value.getTime() ): null;
  }

  public static String printEmail( String value )
  {
    return (value!=null && value.length()<=150 && value.matches( ".*@.*\\..*" ))? value: null;
  }

  public static String printPreisAufAnfrage( Double value )
  {
    return printZahl( value, 15, 2, -0.01d, 10000000000000d );
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
    return (value!=null && value.getHost()!=null && value.getHost().length()>0)? value.toString(): null;
  }

  private static String printZahl( Long value, int totalDigits )
  {
    if (value==null) return null;
    double max = Math.pow( 10, value );
    if (value>=max) return null;
    NumberFormat format = NumberFormat.getNumberInstance( Locale.ENGLISH );
    //DecimalFormat format = new DecimalFormat();
    //format.getDecimalFormatSymbols().setDecimalSeparator( '.' );
    format.setGroupingUsed( false );
    format.setMaximumFractionDigits( 0 );
    format.setMaximumIntegerDigits( totalDigits );
    try
    {
      return format.format( value.longValue() );
    }
    catch (Exception ex)
    {
      LOGGER.warn( ex.getLocalizedMessage() );
      return null;
    }
  }

  private static String printZahl( Double value, int totalDigits, int fractionDigits, Double min, Double max )
  {
    if (value==null) return null;
    NumberFormat format = NumberFormat.getNumberInstance( Locale.ENGLISH );
    //DecimalFormat format = new DecimalFormat();
    //format.getDecimalFormatSymbols().setDecimalSeparator( '.' );
    format.setGroupingUsed( false );
    format.setMaximumFractionDigits( fractionDigits );
    format.setMaximumIntegerDigits( totalDigits-fractionDigits );
    try
    {
      if (min!=null && value<=min) return null;
      else if (max!=null && value>max) return null;
      else return format.format( value );
    }
    catch (Exception ex)
    {
      LOGGER.warn( ex.getLocalizedMessage() );
      return null;
    }
  }

  public static String printZahl2( Long value )
  {
    if (value==null || value<=0) return null;
    return printZahl( value, 2 );
  }

  public static String printZahl2Including0( Long value )
  {
    if (value==null || value<0) return null;
    return printZahl( value, 2 );
  }

  public static String printZahl3( Long value )
  {
    if (value==null || value<=0) return null;
    return printZahl( value, 3 );
  }

  public static String printZahl3Including0( Long value )
  {
    if (value==null || value<0) return null;
    return printZahl( value, 3 );
  }

  public static String printZahl4( Long value )
  {
    if (value==null || value<=0) return null;
    return printZahl( value, 4 );
  }

  public static String printZahl5( Long value )
  {
    if (value==null || value<=0) return null;
    return printZahl( value, 5 );
  }

  public static String printZahl8( Long value )
  {
    if (value==null || value<=0) return null;
    return printZahl( value, 8 );
  }

  public static String printZahl10( Long value )
  {
    if (value==null || value<=0) return null;
    return printZahl( value, 10 );
  }

  public static String printZahl20( Long value )
  {
    if (value==null || value<=0) return null;
    return printZahl( value, 20 );
  }

  public static String printZahl31( Double value )
  {
    if (value==null || value<=0) return null;
    return printZahl( value, 3, 1, 0d, 100d );
  }

  public static String printZahl32( Double value )
  {
    if (value==null || value<=0) return null;
    return printZahl( value, 3, 2, 0d, 10d );
  }

  public static String printZahl42( Double value )
  {
    if (value==null || value<=0) return null;
    return printZahl( value, 4, 2, 0d, 100d );
  }

  public static String printZahl52( Double value )
  {
    if (value==null || value<=0) return null;
    return printZahl( value, 5, 2, 0d, 1000d );
  }

  public static String printZahl62( Double value )
  {
    if (value==null || value<=0) return null;
    return printZahl( value, 6, 2, 0d, 10000d );
  }

  public static String printZahl72( Double value )
  {
    if (value==null || value<=0) return null;
    return printZahl( value, 7, 2, 0d, 100000d );
  }

  public static String printZahl102( Double value )
  {
    if (value==null || value<=0) return null;
    return printZahl( value, 10, 2, 0d, 100000000d );
  }

  public static String printZahl152( Double value )
  {
    if (value==null || value<=0) return null;
    return printZahl( value, 15, 2, 0d, 10000000000000d );
  }

  public static String printZimmeranzahl( Double value )
  {
    return (value!=null && value>=0.5 && value<=9999 )? printZahl62( value ): null;
  }
}