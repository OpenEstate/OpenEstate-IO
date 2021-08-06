/*
 * Copyright 2015-2021 OpenEstate.org.
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
package org.openestate.io.immobar_it;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
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
import org.openestate.io.immobar_it.xml.ObjectFactory;
import org.openestate.io.immobar_it.xml.types.ImmotypeValue;
import org.openestate.io.immobar_it.xml.types.RevenuetypeValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 * Some helper functions for the XML format of
 * <a href="https://www.immobar.it">immobar.it</a>.
 *
 * @author Andreas Rudolph
 * @since 1.5
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public class ImmobarItUtils {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(ImmobarItUtils.class);
    private static JAXBContext JAXB = null;

    /**
     * the latest implemented version of this format
     */
    @SuppressWarnings("unused")
    public final static String VERSION = "2015-04-21";

    /**
     * the XML target namespace of this format
     */
    @SuppressWarnings("unused")
    public final static String NAMESPACE = StringUtils.EMPTY;

    /**
     * the package, where generated JAXB classes are located
     */
    public final static String PACKAGE = "org.openestate.io.immobar_it.xml";

    /**
     * the factory for creation of JAXB objects
     */
    public final static ObjectFactory FACTORY = new ObjectFactory();

    private ImmobarItUtils() {
    }

    /**
     * Creates a {@link ImmobarItDocument} from an {@link InputStream}.
     *
     * @param input XML input
     * @return created document or null, of the document is not supported by this format
     * @throws SAXException                 if XML is invalid
     * @throws IOException                  if reading failed
     * @throws ParserConfigurationException if the parser is not properly configured
     */
    public static ImmobarItDocument createDocument(InputStream input) throws SAXException, IOException, ParserConfigurationException {
        return createDocument(XmlUtils.newDocument(input, true));
    }

    /**
     * Creates a {@link ImmobarItDocument} from a {@link File}.
     *
     * @param xmlFile XML file
     * @return created document or null, of the document is not supported by this format
     * @throws SAXException                 if XML is invalid
     * @throws IOException                  if reading failed
     * @throws ParserConfigurationException if the parser is not properly configured
     */
    public static ImmobarItDocument createDocument(File xmlFile) throws SAXException, IOException, ParserConfigurationException {
        return createDocument(XmlUtils.newDocument(xmlFile, true));
    }

    /**
     * Creates a {@link ImmobarItDocument} from a {@link String}.
     *
     * @param xmlString XML string
     * @return created document or null, of the document is not supported by this format
     * @throws SAXException                 if XML is invalid
     * @throws IOException                  if reading failed
     * @throws ParserConfigurationException if the parser is not properly configured
     */
    public static ImmobarItDocument createDocument(String xmlString) throws SAXException, IOException, ParserConfigurationException {
        return createDocument(XmlUtils.newDocument(xmlString, true));
    }

    /**
     * Creates a {@link ImmobarItDocument} from a {@link Document}.
     *
     * @param doc XML document
     * @return created document or null, of the document is not supported by this format
     */
    public static ImmobarItDocument createDocument(Document doc) {
        if (ImmobarItDocument.isReadable(doc))
            return new ImmobarItDocument(doc);
        else
            return null;
    }

    /**
     * Creates a {@link Marshaller} to write JAXB objects into XML.
     *
     * @return created marshaller
     * @throws JAXBException if a problem with JAXB occurred
     */
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
     * Returns the {@link ObjectFactory} for this format.
     *
     * @return object factory
     */
    public synchronized static ObjectFactory getFactory() {
        return FACTORY;
    }

    /**
     * Intializes the {@link JAXBContext} for this format.
     *
     * @param classloader the classloader to load the generated JAXB classes with
     * @throws JAXBException if a problem with JAXB occurred
     */
    public synchronized static void initContext(ClassLoader classloader) throws JAXBException {
        JAXB = JAXBContext.newInstance(PACKAGE, classloader);
    }

    /**
     * Read a {@link Calendar} value from XML.
     *
     * @param value XML string
     * @return parsed value or null, if the value is invalid
     */
    public static Calendar parseDateValue(String value) {
        value = StringUtils.trimToNull(value);
        if (value == null) return null;

        return DatatypeConverter.parseDate(value);
    }

    /**
     * Read a {@link BigDecimal} value from XML
     * with a valid latitude range.
     *
     * @param value XML string
     * @return parsed value or null, if the value is invalid
     */
    public static BigDecimal parseDecimalValue(String value) {
        try {
            value = StringUtils.trimToNull(value);
            return (value != null) ? DatatypeConverter.parseDecimal(value) : null;
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Can't parse decimal value '" + value + "'!", ex);
        }
    }

    /**
     * Read a {@link ImmotypeValue} value from XML.
     *
     * @param value XML string
     * @return parsed value or null, if the value is invalid
     */
    public static ImmotypeValue parseImmotypeValue(String value) {
        value = StringUtils.trimToNull(value);
        if (value == null) return null;

        final ImmotypeValue type = ImmotypeValue.fromXmlValue(value);
        if (type != null) return type;

        throw new IllegalArgumentException("Can't parse immotype value '" + value + "'!");
    }

    /**
     * Read a {@link RevenuetypeValue} value from XML.
     *
     * @param value XML string
     * @return parsed value or null, if the value is invalid
     */
    public static RevenuetypeValue parseRevenuetypeValue(String value) {
        value = StringUtils.trimToNull(value);
        if (value == null) return null;

        final RevenuetypeValue type = RevenuetypeValue.fromXmlValue(value);
        if (type != null) return type;

        throw new IllegalArgumentException("Can't parse revenuetype value '" + value + "'!");
    }

    /**
     * Read an {@link URI} value from XML.
     *
     * @param value XML string
     * @return parsed value or null, if the value is invalid
     */
    public static URI parseUriValue(String value) {
        value = StringUtils.trimToNull(value);

        if (value != null && !StringUtils.startsWithIgnoreCase(value, "http://") && !StringUtils.startsWithIgnoreCase(value, "https://"))
            value = "http://" + value;

        try {
            return (value != null) ? new URI(value) : null;
        } catch (URISyntaxException ex) {
            throw new IllegalArgumentException("Can't parse URI '" + value + "'!", ex);
        }
    }

    /**
     * Write a {@link Calendar} value into XML output.
     *
     * @param value value to write
     * @return XML string
     * @throws IllegalArgumentException if a validation error occurred
     */
    public static String printDateValue(Calendar value) {
        if (value == null)
            throw new IllegalArgumentException("Can't print empty date value!");

        return new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH)
                .format(value.getTime());
    }

    /**
     * Write a {@link BigDecimal} value into XML output
     * with maximal two decimal digits.
     *
     * @param value value to write
     * @return XML string
     * @throws IllegalArgumentException if a validation error occurred
     */
    public static String printDecimalValue(BigDecimal value) {
        if (value == null)
            throw new IllegalArgumentException("Can't print empty decimal value!");

        value = value.setScale(2, BigDecimal.ROUND_HALF_UP);
        return DatatypeConverter.printDecimal(value);
    }

    /**
     * Write a {@link ImmotypeValue} value into XML output.
     *
     * @param value value to write
     * @return XML string
     * @throws IllegalArgumentException if a validation error occurred
     */
    public static String printImmotypeValue(ImmotypeValue value) {
        if (value == null)
            throw new IllegalArgumentException("Can't print empty immotype value!");

        return value.write();
    }

    /**
     * Write a {@link BigDecimal} value into XML output
     * with a valid latitude range.
     *
     * @param value value to write
     * @return XML string
     * @throws IllegalArgumentException if a validation error occurred
     */
    public static String printLatitudeValue(BigDecimal value) {
        if (value == null)
            throw new IllegalArgumentException("Can't print empty latitude value!");
        if (value.compareTo(new BigDecimal("-90")) < 0)
            throw new IllegalArgumentException("Can't print latitude value '" + value + "' because it is below -90!");
        if (value.compareTo(new BigDecimal("90")) > 0)
            throw new IllegalArgumentException("Can't print latitude value '" + value + "' because it is above 90!");

        value = value.setScale(10, BigDecimal.ROUND_HALF_UP);
        return DatatypeConverter.printDecimal(value);
    }

    /**
     * Write a {@link BigDecimal} value into XML output
     * with a valid longitude range.
     *
     * @param value value to write
     * @return XML string
     * @throws IllegalArgumentException if a validation error occurred
     */
    public static String printLongitudeValue(BigDecimal value) {
        if (value == null)
            throw new IllegalArgumentException("Can't print empty longitude value!");
        if (value.compareTo(new BigDecimal("-180")) < 0)
            throw new IllegalArgumentException("Can't print longitude value '" + value + "' because it is below -180!");
        if (value.compareTo(new BigDecimal("180")) > 0)
            throw new IllegalArgumentException("Can't print longitude value '" + value + "' because it is above 180!");

        value = value.setScale(10, BigDecimal.ROUND_HALF_UP);
        return DatatypeConverter.printDecimal(value);
    }

    /**
     * Write a {@link RevenuetypeValue} value into XML output.
     *
     * @param value value to write
     * @return XML string
     * @throws IllegalArgumentException if a validation error occurred
     */
    public static String printRevenuetypeValue(RevenuetypeValue value) {
        if (value == null)
            throw new IllegalArgumentException("Can't print empty revenuetype value!");

        return value.write();
    }

    /**
     * Write an {@link URI} value into XML output.
     *
     * @param value value to write
     * @return XML string
     * @throws IllegalArgumentException if a validation error occurred
     */
    public static String printUriValue(URI value) {
        if (value == null)
            throw new IllegalArgumentException("Can't print empty URI value!");
        if ("http".equalsIgnoreCase(value.getScheme()))
            return value.toString();
        if ("https".equalsIgnoreCase(value.getScheme()))
            return value.toString();

        throw new IllegalArgumentException("Can't print URI '" + value + "' because of an unsupported scheme!");
    }
}