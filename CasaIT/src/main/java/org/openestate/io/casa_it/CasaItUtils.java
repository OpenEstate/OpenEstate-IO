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
package org.openestate.io.casa_it;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.DatatypeConverter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.lang3.StringUtils;
import org.openestate.io.casa_it.xml.ObjectFactory;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.core.XmlValidationHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 * Some helper functions for the XML format of <a href="https://www.casa.it/">casa.it</a>.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public class CasaItUtils {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(CasaItUtils.class);
    private static JAXBContext DEFAULT_CONTEXT = null;

    /*
     * the latest implemented version of this format
     *
     * public final static String VERSION = "1.0";
     */

    /**
     * the XML target namespace of this format
     */
    @SuppressWarnings("unused")
    public final static String NAMESPACE = StringUtils.EMPTY;

    /**
     * the package, where generated JAXB classes are located
     */
    public final static String PACKAGE = "org.openestate.io.casa_it.xml";

    /**
     * the factory for creation of JAXB objects
     */
    public final static ObjectFactory FACTORY = new ObjectFactory();

    private CasaItUtils() {
    }

    /**
     * Creates a {@link JAXBContext} for this format.
     *
     * @return created JAXB context
     * @throws JAXBException if a problem with JAXB occurred
     */
    @SuppressWarnings("unused")
    public static JAXBContext createContext() throws JAXBException {
        return createContext(null, null);
    }

    /**
     * Creates a {@link JAXBContext} for this format.
     *
     * @param additionalJaxbPackages additional package with custom JAXB classes
     * @return created JAXB context
     * @throws JAXBException if a problem with JAXB occurred
     */
    @SuppressWarnings("unused")
    public static JAXBContext createContext(List<String> additionalJaxbPackages) throws JAXBException {
        return createContext(additionalJaxbPackages, null);
    }

    /**
     * Creates a {@link JAXBContext} for this format.
     *
     * @param classloader the classloader to load the generated JAXB classes with
     * @return created JAXB context
     * @throws JAXBException if a problem with JAXB occurred
     */
    public static JAXBContext createContext(ClassLoader classloader) throws JAXBException {
        return createContext(null, classloader);
    }

    /**
     * Creates a {@link JAXBContext} for this format.
     *
     * @param additionalJaxbPackages additional package with custom JAXB classes
     * @param classloader            the classloader to load the generated JAXB classes with
     * @return created JAXB context
     * @throws JAXBException if a problem with JAXB occurred
     */
    public static JAXBContext createContext(List<String> additionalJaxbPackages, ClassLoader classloader) throws JAXBException {
        final List<String> packages = new ArrayList<>();
        packages.add(PACKAGE);
        if (additionalJaxbPackages != null && !additionalJaxbPackages.isEmpty())
            packages.addAll(additionalJaxbPackages);

        return JAXBContext.newInstance(
                StringUtils.join(packages, ":"),
                (classloader != null) ? classloader : Thread.currentThread().getContextClassLoader()
        );
    }

    /**
     * Creates a {@link CasaItDocument} from an {@link InputStream}.
     *
     * @param input XML input
     * @return created document or null, of the document is not supported by this format
     * @throws SAXException                 if XML is invalid
     * @throws IOException                  if reading failed
     * @throws ParserConfigurationException if the parser is not properly configured
     */
    public static CasaItDocument createDocument(InputStream input) throws SAXException, IOException, ParserConfigurationException {
        return createDocument(XmlUtils.newDocument(input, true));
    }

    /**
     * Creates a {@link CasaItDocument} from a {@link File}.
     *
     * @param xmlFile XML file
     * @return created document or null, of the document is not supported by this format
     * @throws SAXException                 if XML is invalid
     * @throws IOException                  if reading failed
     * @throws ParserConfigurationException if the parser is not properly configured
     */
    public static CasaItDocument createDocument(File xmlFile) throws SAXException, IOException, ParserConfigurationException {
        return createDocument(XmlUtils.newDocument(xmlFile, true));
    }

    /**
     * Creates a {@link CasaItDocument} from a {@link String}.
     *
     * @param xmlString XML string
     * @return created document or null, of the document is not supported by this format
     * @throws SAXException                 if XML is invalid
     * @throws IOException                  if reading failed
     * @throws ParserConfigurationException if the parser is not properly configured
     */
    public static CasaItDocument createDocument(String xmlString) throws SAXException, IOException, ParserConfigurationException {
        return createDocument(XmlUtils.newDocument(xmlString, true));
    }

    /**
     * Creates a {@link CasaItDocument} from a {@link Document}.
     *
     * @param doc XML document
     * @return created document or null, of the document is not supported by this format
     */
    public static CasaItDocument createDocument(Document doc) {
        if (CasaItDocument.isReadable(doc))
            return new CasaItDocument(doc);
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
        return createMarshaller(null, true, null);
    }

    /**
     * Creates a {@link Marshaller} to write JAXB objects into XML.
     *
     * @param context context to create the marshaller on
     * @return created marshaller
     * @throws JAXBException if a problem with JAXB occurred
     */
    @SuppressWarnings("unused")
    public static Marshaller createMarshaller(JAXBContext context) throws JAXBException {
        return createMarshaller(null, true, context);
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
        return createMarshaller(encoding, formatted, null);
    }

    /**
     * Creates a {@link Marshaller} to write JAXB objects into XML.
     *
     * @param encoding  encoding of written XML
     * @param formatted if written XML is pretty printed
     * @param context   context to create the marshaller on
     * @return created marshaller
     * @throws JAXBException if a problem with JAXB occurred
     */
    public static Marshaller createMarshaller(String encoding, boolean formatted, JAXBContext context) throws JAXBException {
        final Marshaller m = (context != null) ?
                context.createMarshaller() :
                getContext().createMarshaller();

        m.setProperty(Marshaller.JAXB_ENCODING, StringUtils.defaultIfBlank(encoding, Charset.defaultCharset().name()));
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, formatted);
        m.setEventHandler(new XmlValidationHandler());
        return m;
    }

    /**
     * Creates an {@link Unmarshaller} to read JAXB objects from XML.
     *
     * @return created unmarshaller
     * @throws JAXBException if a problem with JAXB occurred
     */
    public static Unmarshaller createUnmarshaller() throws JAXBException {
        return createUnmarshaller(null);
    }

    /**
     * Creates an {@link Unmarshaller} to read JAXB objects from XML.
     *
     * @param context context to create the unmarshaller on
     * @return created unmarshaller
     * @throws JAXBException if a problem with JAXB occurred
     */
    public static Unmarshaller createUnmarshaller(JAXBContext context) throws JAXBException {
        final Unmarshaller m = (context != null) ?
                context.createUnmarshaller() :
                getContext().createUnmarshaller();

        m.setEventHandler(new XmlValidationHandler());
        return m;
    }

    /**
     * Returns the default {@link JAXBContext} for this format.
     *
     * @return context
     * @throws JAXBException if a problem with JAXB occurred
     */
    public synchronized static JAXBContext getContext() throws JAXBException {
        if (DEFAULT_CONTEXT == null) initContext(null);
        return DEFAULT_CONTEXT;
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
     * Initializes the default {@link JAXBContext} for this format.
     *
     * @param classloader the classloader to load the generated JAXB classes with
     * @throws JAXBException if a problem with JAXB occurred
     */
    public synchronized static void initContext(ClassLoader classloader) throws JAXBException {
        DEFAULT_CONTEXT = createContext(classloader);
    }

    public static BigDecimal parseDouble(String value) {
        value = StringUtils.trimToNull(value);
        return (value != null) ? DatatypeConverter.parseDecimal(value) : null;
    }

    public static String printDouble(BigDecimal value) {
        if (value == null)
            throw new IllegalArgumentException("Can't print decimal value!");
        else
            return DatatypeConverter.printDecimal(value);
    }
}