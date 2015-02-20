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

package org.openestate.io.wis_it;

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
import org.openestate.io.wis_it.xml.ObjectFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 * WisItUtils.
 *
 * @author Andreas Rudolph
 */
public class WisItUtils
{
  //private final static Logger LOGGER = LoggerFactory.getLogger( WisItUtils.class );
  public final static String PACKAGE = "org.openestate.io.wis_it.xml";
  private final static ObjectFactory FACTORY = new ObjectFactory();
  private static JAXBContext JAXB = null;

  private WisItUtils()
  {
  }

  public static WisItDocument createDocument( InputStream input ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument( DocumentUtils.newDocument( input, true ) );
  }

  public static WisItDocument createDocument( File xmlFile ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument( DocumentUtils.newDocument( xmlFile, true ) );
  }

  public static WisItDocument createDocument( String xmlString ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument( DocumentUtils.newDocument( xmlString, true ) );
  }

  public static WisItDocument createDocument( Document doc )
  {
    if (WisItDocument.isTransferDocument( doc ))
      return new WisItDocument( doc );
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
      //LOGGER.warn( "Can't parse value '" + value + "' as date!" );
      //LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
    }
    throw new IllegalArgumentException( "Can't parse date value '"+value+"'!" );
  }

  public static Double parseDecimal( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseDouble( value ): null;
  }

  public static Integer parseInteger( String value )
  {
    value = StringUtils.trimToNull( value );
    return (value!=null)? DatatypeConverter.parseInt( value ): null;
  }

  public static Boolean parseYesNo( String value )
  {
    value = StringUtils.trimToNull( value );
    if ("ja".equalsIgnoreCase( value ))
      return Boolean.TRUE;
    else if ("nein".equalsIgnoreCase( value ))
      return Boolean.TRUE;
    else
      return (value!=null)? DatatypeConverter.parseBoolean( value ): null;
  }

  public static String printDateTime( Calendar value )
  {
    if (value==null) return null;
    return new SimpleDateFormat( "yyyy-MM-dd mm:hh:ss" ).format( value.getTime() );
  }

  public static String printDecimal( Double value )
  {
    NumberFormat formatter = NumberFormat.getInstance( Locale.ENGLISH );
    formatter.setGroupingUsed( false );
    formatter.setMaximumFractionDigits( 2 );
    return (value!=null)? formatter.format( value ): null;
  }

  public static String printNonNegativeInteger( Integer value )
  {
    return (value!=null && value>=0)? DatatypeConverter.printInt( value ): null;
  }

  public static String printPositiveInteger( Integer value )
  {
    return (value!=null && value>0)? DatatypeConverter.printInt( value ): null;
  }

  public static String printYesNo( Boolean value )
  {
    if (Boolean.TRUE.equals( value ))
      return "ja";
    else if (Boolean.FALSE.equals( value ))
      return "nein";
    else
      return null;
  }
}