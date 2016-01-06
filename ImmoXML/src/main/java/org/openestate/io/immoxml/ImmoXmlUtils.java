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

package org.openestate.io.immoxml;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
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
import org.openestate.io.core.XmlUtils;
import org.openestate.io.core.XmlValidationHandler;
import org.openestate.io.immoxml.xml.ObjectFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 * Some helper functions for the ImmoXML format.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public class ImmoXmlUtils
{
  //private final static Logger LOGGER = LoggerFactory.getLogger( ImmoXmlUtils.class );
  private static JAXBContext JAXB = null;

  /**
   * the latest implemented version of this format
   */
  public final static ImmoXmlVersion VERSION = ImmoXmlVersion.V3_0;

  /**
   * the XML target namespace of this format
   */
  public final static String NAMESPACE = "http://www.immoxml.de";

  /**
   * the package, where generated JAXB classes are located
   */
  public final static String PACKAGE = "org.openestate.io.immoxml.xml";

  /**
   * the factory for creation of JAXB objects
   */
  public final static ObjectFactory FACTORY = new ObjectFactory();

  private ImmoXmlUtils()
  {
  }

  /**
   * Creates a {@link ImmoXmlDocument} from an {@link InputStream}.
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
  public static ImmoXmlDocument createDocument( InputStream input ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument( XmlUtils.newDocument( input, true ) );
  }

  /**
   * Creates a {@link ImmoXmlDocument} from a {@link File}.
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
  public static ImmoXmlDocument createDocument( File xmlFile ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument( XmlUtils.newDocument( xmlFile, true ) );
  }

  /**
   * Creates a {@link ImmoXmlDocument} from a {@link String}.
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
  public static ImmoXmlDocument createDocument( String xmlString ) throws SAXException, IOException, ParserConfigurationException
  {
    return createDocument( XmlUtils.newDocument( xmlString, true ) );
  }

  /**
   * Creates a {@link ImmoXmlDocument} from a {@link Document}.
   *
   * @param doc
   * XML document
   *
   * @return
   * created document or null, of the document is not supported by this format
   */
  public static ImmoXmlDocument createDocument( Document doc )
  {
    if (ImmoXmlDocument.isReadable( doc ))
      return new ImmoXmlDocument( doc );
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
   * Helper method to create a &lt;user_defined_simplefield&gt; element with a
   * "feldname" attribute and a string value.
   *
   * @param doc
   * document, for which the element is created
   *
   * @param name
   * value of the "feldname" attribute in the created element
   *
   * @param value
   * text value of the created element
   *
   * @return
   * created element
   */
  public static Element createUserDefinedSimplefield( Document doc, String name, String value )
  {
    Element root = XmlUtils.getRootElement( doc );
    Element node = doc.createElementNS( root.getNamespaceURI(), "user_defined_simplefield" );
    node.setAttribute( "feldname", name );
    node.setTextContent( value );
    return node;
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

  public static Calendar parseDateTime( String value )
  {
    return XmlUtils.parseDateTime( value );
  }

  public static BigDecimal parseDecimal( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;
    try
    {
      return DatatypeConverter.parseDecimal( value );
    }
    catch (NumberFormatException ex)
    {
      //LOGGER.warn( "Can't parse value '" + value + "' as decimal!" );
      //LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
    }
    try
    {
      NumberFormat format = NumberFormat.getNumberInstance( Locale.GERMANY );
      return BigDecimal.valueOf( format.parse( value ).doubleValue() );
    }
    catch (NumberFormatException ex)
    {
      //LOGGER.warn( "Can't parse value '" + value + "' as decimal!" );
      //LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
    }
    catch (ParseException ex)
    {
      //LOGGER.warn( "Can't parse value '" + value + "' as decimal!" );
      //LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
    }
    throw new IllegalArgumentException( "Can't parse decimal value '"+value+"'!" );
  }

  public static BigInteger parseInteger( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;
    try
    {
      return DatatypeConverter.parseInteger( value );
    }
    catch (NumberFormatException ex)
    {
      throw new IllegalArgumentException( "Can't parse integer value '"+value+"'! " + ex.getLocalizedMessage() );
    }
  }

  public static BigDecimal parsePositiveDecimal( String value )
  {
    return parseDecimal( value );
  }

  public static BigInteger parsePositiveInteger( String value )
  {
    return parseInteger( value );
  }

  public static String printDate( Calendar value )
  {
    if (value==null)
      throw new IllegalArgumentException( "Can't print date value!" );
    else
      return getDateFormat().format( value.getTime() );
  }

  public static String printDateTime( Calendar value )
  {
    if (value==null)
      throw new IllegalArgumentException( "Can't print date-time value!" );
    else
      return DatatypeConverter.printDateTime( value );
  }

  public static String printDecimal( BigDecimal value )
  {
    if (value==null)
      throw new IllegalArgumentException( "Can't print double value!" );
    else
      return DatatypeConverter.printDecimal( value );
  }

  public static String printInteger( BigInteger value )
  {
    if (value==null)
      throw new IllegalArgumentException( "Can't print integer value!" );
    else
      return DatatypeConverter.printInteger( value );
  }

  public static String printPositiveDecimal( BigDecimal value )
  {
    if (value==null || value.compareTo( BigDecimal.ZERO )<1)
      throw new IllegalArgumentException( "Can't print positive decimal value!" );
    return printDecimal( value.setScale( 2, BigDecimal.ROUND_HALF_UP ) );
  }

  public static String printPositiveInteger( BigInteger value )
  {
    if (value==null || value.compareTo( BigInteger.ZERO )<1)
      throw new IllegalArgumentException( "Can't print positive integer value!" );
    else
      return printInteger( value );
  }
}