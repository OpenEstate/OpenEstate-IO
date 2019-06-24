/*
 * Copyright 2015-2019 OpenEstate.org.
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
package org.openestate.io.daft_ie;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.text.DateFormat;
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
import org.openestate.io.core.LocaleUtils;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.core.XmlValidationHandler;
import org.openestate.io.daft_ie.xml.ObjectFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 * Some helper functions for the XML format of
 * <a href="http://daft.ie/">daft.ie</a>.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
@SuppressWarnings("WeakerAccess")
public class DaftIeUtils {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(DaftIeUtils.class);
    private static JAXBContext JAXB = null;

    /**
     * the latest implemented version of this format
     */
    @SuppressWarnings("unused")
    public final static DaftIeVersion VERSION = DaftIeVersion.V2_7;

    /**
     * the XML target namespace of this format
     */
    @SuppressWarnings("unused")
    public final static String NAMESPACE = StringUtils.EMPTY;

    /**
     * the default locale of this format
     */
    @SuppressWarnings("unused")
    public final static Locale DEFAULT_LOCALE = Locale.ENGLISH;

    /**
     * the package, where generated JAXB classes are located
     */
    @SuppressWarnings("unused")
    public final static String PACKAGE = "org.openestate.io.daft_ie.xml";

    /**
     * the factory for creation of JAXB objects
     */
    @SuppressWarnings("unused")
    public final static ObjectFactory FACTORY = new ObjectFactory();


    private DaftIeUtils() {
    }

    /**
     * Creates a {@link DaftIeDocument} from an {@link InputStream}.
     *
     * @param input XML input
     * @return created document or null, of the document is not supported by this format
     * @throws SAXException                 if XML is invalid
     * @throws IOException                  if reading failed
     * @throws ParserConfigurationException if the parser is not properly configured
     */
    public static DaftIeDocument createDocument(InputStream input) throws SAXException, IOException, ParserConfigurationException {
        return createDocument(XmlUtils.newDocument(input, true));
    }

    /**
     * Creates a {@link DaftIeDocument} from a {@link File}.
     *
     * @param xmlFile XML file
     * @return created document or null, of the document is not supported by this format
     * @throws SAXException                 if XML is invalid
     * @throws IOException                  if reading failed
     * @throws ParserConfigurationException if the parser is not properly configured
     */
    public static DaftIeDocument createDocument(File xmlFile) throws SAXException, IOException, ParserConfigurationException {
        return createDocument(XmlUtils.newDocument(xmlFile, true));
    }

    /**
     * Creates a {@link DaftIeDocument} from a {@link String}.
     *
     * @param xmlString XML string
     * @return created document or null, of the document is not supported by this format
     * @throws SAXException                 if XML is invalid
     * @throws IOException                  if reading failed
     * @throws ParserConfigurationException if the parser is not properly configured
     */
    public static DaftIeDocument createDocument(String xmlString) throws SAXException, IOException, ParserConfigurationException {
        return createDocument(XmlUtils.newDocument(xmlString, true));
    }

    /**
     * Creates a {@link DaftIeDocument} from a {@link Document}.
     *
     * @param doc XML document
     * @return created document or null, of the document is not supported by this format
     */
    public static DaftIeDocument createDocument(Document doc) {
        if (DaftIeDocument.isReadable(doc))
            return new DaftIeDocument(doc);
        else
            return null;
    }

    /**
     * Creates a {@link Marshaller} to write JAXB objects into XML.
     *
     * @return created marshaller
     * @throws JAXBException if a problem with JAXB occurred
     */
    @SuppressWarnings("unused")
    public static Marshaller createMarshaller() throws JAXBException {
        return createMarshaller(Charset.defaultCharset().name(), true);
    }

    /**
     * Creates a {@link Marshaller} to write JAXB objects into XML.
     *
     * @param encoding  encoding of written XML
     * @param formatted if written XML is pretty printed
     * @return created marshaller
     * @throws JAXBException if a problem with JAXB occurred
     */
    @SuppressWarnings("Duplicates")
    public static Marshaller createMarshaller(String encoding, boolean formatted) throws JAXBException {
        Marshaller m = getContext().createMarshaller();
        m.setProperty(Marshaller.JAXB_ENCODING, encoding);
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, formatted);
        m.setEventHandler(new XmlValidationHandler());
        return m;
    }

    /**
     * Creates a {@link Unmarshaller} to read JAXB objects from XML.
     *
     * @return created unmarshaller
     * @throws JAXBException if a problem with JAXB occurred
     */
    public static Unmarshaller createUnmarshaller() throws JAXBException {
        Unmarshaller m = getContext().createUnmarshaller();
        m.setEventHandler(new XmlValidationHandler());
        return m;
    }

    /**
     * Returns the {@link JAXBContext} for this format.
     *
     * @return context
     * @throws JAXBException if a problem with JAXB occurred
     */
    public synchronized static JAXBContext getContext() throws JAXBException {
        if (JAXB == null) initContext(Thread.currentThread().getContextClassLoader());
        return JAXB;
    }

    /**
     * Returns a country name, as it is preferred by this format.
     *
     * @param country country name to convert
     * @return converted country name or null, if no matching country was found
     */
    public static String getCountryName(String country) {
        return LocaleUtils.getCountryName(country, DEFAULT_LOCALE);
    }

    /**
     * Returns the preferred date format for this format.
     *
     * @return date format
     */
    public static DateFormat getDateFormat() {
        return new SimpleDateFormat("yyyy-MM-dd");
    }

    /**
     * Returns the {@link ObjectFactory} for this format.
     *
     * @return object factory
     */
    public synchronized static ObjectFactory getFactory() {
        return FACTORY;
    }

    /**
     * Initializes the {@link JAXBContext} for this format.
     *
     * @param classloader the classloader to load the generated JAXB classes with
     * @throws JAXBException if a problem with JAXB occurred
     */
    public synchronized static void initContext(ClassLoader classloader) throws JAXBException {
        JAXB = JAXBContext.newInstance(PACKAGE, classloader);
    }

    public static Boolean parseBoolean(String value) {
        value = StringUtils.trimToEmpty(value);
        if ("1".equals(value))
            return Boolean.TRUE;
        else if ("0".equals(value))
            return Boolean.FALSE;
        else
            throw new IllegalArgumentException("Can't parse boolean value '" + value + "'!");
    }

    public static String parseCountry(String value) {
        return StringUtils.trimToNull(value);
    }

    public static Calendar parseDate(String value) {
        return XmlUtils.parseDate(value);
    }

    public static Calendar parseDateTime(String value) {
        return XmlUtils.parseDateTime(value);
    }

    public static BigDecimal parsePositiveDecimal(String value) {
        value = StringUtils.trimToNull(value);
        return (value != null) ? DatatypeConverter.parseDecimal(value) : null;
    }

    public static BigInteger parsePositiveInteger(String value) {
        value = StringUtils.trimToNull(value);
        return (value != null) ? DatatypeConverter.parseInteger(value) : null;
    }

    @SuppressWarnings("Duplicates")
    public static URI parseURI(String value) {
        value = StringUtils.trimToNull(value);
        if (value == null) return null;
        try {
            if (StringUtils.startsWithIgnoreCase(value, "http://"))
                return new URI(value);
            else if (StringUtils.startsWithIgnoreCase(value, "https://"))
                return new URI(value);
            else
                return new URI("http://" + value);
        } catch (URISyntaxException ex) {
            throw new IllegalArgumentException("Can't parse URI value '" + value + "'!", ex);
        }
    }

    public static String printBoolean(Boolean value) {
        if (Boolean.TRUE.equals(value))
            return "1";
        else if (Boolean.FALSE.equals(value))
            return "0";
        else
            throw new IllegalArgumentException("Can't print boolean value!");
    }

    public static String printCountry(String value) {
        value = StringUtils.trimToNull(value);
        if (value == null)
            throw new IllegalArgumentException("Can't print country value!");

        String country = StringUtils.trimToNull(DaftIeUtils.getCountryName(value));
        if (country == null) {
            LOGGER.warn("Can't convert country '" + value + "' to its english name!");
            return value;
        } else {
            return country;
        }
    }

    public static String printDate(Calendar value) {
        if (value == null)
            throw new IllegalArgumentException("Can't print date value!");
        else
            return getDateFormat().format(value.getTime());
    }

    public static String printDateTime(Calendar value) {
        if (value == null)
            throw new IllegalArgumentException("Can't print date-time value!");
        else
            return DatatypeConverter.printDateTime(value);
    }

    public static String printPositiveDecimal(BigDecimal value) {
        if (value == null || value.compareTo(BigDecimal.ZERO) < 1)
            throw new IllegalArgumentException("Can't print positive double value!");
        else
            return DatatypeConverter.printDecimal(value);
    }

    public static String printPositiveInteger(BigInteger value) {
        if (value == null || value.compareTo(BigInteger.ZERO) < 1)
            throw new IllegalArgumentException("Can't print positive integer value!");
        else
            return DatatypeConverter.printInteger(value);
    }

    public static String printURI(URI value) {
        if (value == null || StringUtils.isBlank(value.getHost()))
            throw new IllegalArgumentException("Can't print URI value!");
        else
            return value.toString();
    }
}