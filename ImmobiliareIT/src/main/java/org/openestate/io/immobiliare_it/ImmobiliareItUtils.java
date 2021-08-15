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
package org.openestate.io.immobiliare_it;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Currency;
import java.util.List;
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
import org.openestate.io.immobiliare_it.xml.ObjectFactory;
import org.openestate.io.immobiliare_it.xml.types.Breadcrumb;
import org.openestate.io.immobiliare_it.xml.types.CategoryType;
import org.openestate.io.immobiliare_it.xml.types.EnergyScaleType;
import org.openestate.io.immobiliare_it.xml.types.GenderType;
import org.openestate.io.immobiliare_it.xml.types.LandSizeUnitType;
import org.openestate.io.immobiliare_it.xml.types.MapType;
import org.openestate.io.immobiliare_it.xml.types.SizeUnitType;
import org.openestate.io.immobiliare_it.xml.types.TransactionType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 * Some helper functions for the XML format of <a href="https://www.immobiliare.it/">immobiliare.it</a>.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public class ImmobiliareItUtils {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(ImmobiliareItUtils.class);
    private static JAXBContext DEFAULT_CONTEXT = null;

    /**
     * the latest implemented version of this format
     */
    public final static ImmobiliareItVersion VERSION = ImmobiliareItVersion.V2_8;

    /**
     * the XML target namespace of this format
     */
    @SuppressWarnings("HttpUrlsUsage")
    public final static String NAMESPACE = "http://feed.immobiliare.it";

    /**
     * the default locale of this format
     */
    @SuppressWarnings("unused")
    public final static Locale DEFAULT_LOCALE = Locale.ENGLISH;

    /**
     * the package, where generated JAXB classes are located
     */
    public final static String PACKAGE = "org.openestate.io.immobiliare_it.xml";

    /**
     * the factory for creation of JAXB objects
     */
    public final static ObjectFactory FACTORY = new ObjectFactory();

    private ImmobiliareItUtils() {
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
     * Creates a {@link ImmobiliareItDocument} from an {@link InputStream}.
     *
     * @param input XML input
     * @return created document or null, of the document is not supported by this format
     * @throws SAXException                 if XML is invalid
     * @throws IOException                  if reading failed
     * @throws ParserConfigurationException if the parser is not properly configured
     */
    public static ImmobiliareItDocument createDocument(InputStream input) throws SAXException, IOException, ParserConfigurationException {
        return createDocument(XmlUtils.newDocument(input, true));
    }

    /**
     * Creates a {@link ImmobiliareItDocument} from a {@link File}.
     *
     * @param xmlFile XML file
     * @return created document or null, of the document is not supported by this format
     * @throws SAXException                 if XML is invalid
     * @throws IOException                  if reading failed
     * @throws ParserConfigurationException if the parser is not properly configured
     */
    public static ImmobiliareItDocument createDocument(File xmlFile) throws SAXException, IOException, ParserConfigurationException {
        return createDocument(XmlUtils.newDocument(xmlFile, true));
    }

    /**
     * Creates a {@link ImmobiliareItDocument} from a {@link String}.
     *
     * @param xmlString XML string
     * @return created document or null, of the document is not supported by this format
     * @throws SAXException                 if XML is invalid
     * @throws IOException                  if reading failed
     * @throws ParserConfigurationException if the parser is not properly configured
     */
    public static ImmobiliareItDocument createDocument(String xmlString) throws SAXException, IOException, ParserConfigurationException {
        return createDocument(XmlUtils.newDocument(xmlString, true));
    }

    /**
     * Creates a {@link ImmobiliareItDocument} from a {@link Document}.
     *
     * @param doc XML document
     * @return created document or null, of the document is not supported by this format
     */
    public static ImmobiliareItDocument createDocument(Document doc) {
        if (ImmobiliareItDocument.isReadable(doc))
            return new ImmobiliareItDocument(doc);
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
    @SuppressWarnings("unused")
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
    @SuppressWarnings("unused")
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
     * Returns a country code, as it is preferred by this format.
     *
     * @param country country name to convert
     * @return converted country code or null, if no matching country was found
     */
    public static String getCountryCode(String country) {
        return LocaleUtils.getCountryISO2(country);
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

    public static boolean isValidDateUpdatedType(Calendar value) {
        final Calendar min = DatatypeConverter.parseDateTime("2000-12-31T00:00:00");
        return value != null && !value.before(min);
    }

    public static boolean isValidEmailType(String value) {
        //noinspection RegExpRedundantEscape
        return value != null && value.matches("[^@]+@[^\\.]+\\..+");
    }

    public static boolean isValidLatitude(BigDecimal value) {
        //return value!=null && isValidLatitude( value.doubleValue() );
        BigDecimal min = new BigDecimal("27.2");
        BigDecimal max = new BigDecimal("71.1");
        return value != null && value.compareTo(min) >= 0 && value.compareTo(max) <= 0;
    }

    public static boolean isValidLongitude(BigDecimal value) {
        BigDecimal min = new BigDecimal("-31.2");
        BigDecimal max = new BigDecimal("38.9");
        return value != null && value.compareTo(min) >= 0 && value.compareTo(max) <= 0;
    }

    public static boolean isValidRatio(BigDecimal value) {
        BigDecimal min = BigDecimal.ZERO;
        BigDecimal max = new BigDecimal("100");
        return value != null && value.compareTo(min) >= 0 && value.compareTo(max) <= 0;
    }

    public static boolean isValidYear(Integer value) {
        return value != null && value >= 1000 && value <= 2050;
    }

    public static Breadcrumb parseBreadcrumb(String value) {
        return Breadcrumb.read(value);
    }

    /**
     * @deprecated defined in schema but currently not used
     */
    @Deprecated
    public static CategoryType parseCategory(String value) {
        value = StringUtils.trimToNull(value);
        if (value == null) return null;

        CategoryType cat = CategoryType.fromXmlValue(value);
        if (cat == null)
            throw new IllegalArgumentException("Can't parse category value '" + value + "'!");

        return cat;
    }

    public static String parseCountry(String value) {
        return StringUtils.trimToNull(value);
    }

    public static Currency parseCurrency(String value) {
        value = StringUtils.trimToNull(value);
        if (value == null) return null;
        try {
            if (value.trim().length() != 3)
                throw new Exception("Currency code must contain of 3 characters.");

            return Currency.getInstance(value.trim().toUpperCase());
        } catch (Exception ex) {
            throw new IllegalArgumentException("Can't parse currency value '" + value + "'!", ex);
        }
    }

    public static Calendar parseDateUpdatedType(String value) {
        try {
            return XmlUtils.parseDateTime(value);
        } catch (Exception ex) {
            throw new IllegalArgumentException("Can't parse date-updated value '" + value + "'!", ex);
        }
    }

    public static String parseEmailType(String value) {
        //value = StringUtils.trimToNull( value );
        //if (value==null)
        //  return null;
        //else if (value.matches( "[^@]+@[^\\.]+\\..+" ))
        //  return value;
        //else
        //  throw new IllegalArgumentException( "Can't parse e-mail value '" + value + "'!" );
        return StringUtils.trimToNull(value);
    }

    public static EnergyScaleType parseEnergyScale(String value) {
        value = StringUtils.trimToNull(value);
        if (value == null) return null;

        EnergyScaleType scale = EnergyScaleType.fromXmlValue(value);
        if (scale == null)
            throw new IllegalArgumentException("Can't parse energy scale value '" + value + "'!");

        return scale;
    }

    public static GenderType parseGender(String value) {
        value = StringUtils.trimToNull(value);
        if (value == null) return null;

        GenderType gender = GenderType.fromXmlValue(value);
        if (gender == null)
            throw new IllegalArgumentException("Can't parse gender value '" + value + "'!");

        return gender;
    }

    public static LandSizeUnitType parseLandSizeUnit(String value) {
        value = StringUtils.trimToNull(value);
        if (value == null) return null;

        LandSizeUnitType unit = LandSizeUnitType.fromXmlValue(value);
        if (unit == null)
            throw new IllegalArgumentException("Can't parse land-size-unit value '" + value + "'!");

        return unit;
    }

    public static BigDecimal parseLatitude(String value) {
        value = StringUtils.trimToNull(value);
        return (value != null) ? DatatypeConverter.parseDecimal(value) : null;
    }

    public static BigDecimal parseLongitude(String value) {
        value = StringUtils.trimToNull(value);
        return (value != null) ? DatatypeConverter.parseDecimal(value) : null;
    }

    public static MapType parseMap(String value) {
        value = StringUtils.trimToNull(value);
        if (value == null) return null;

        MapType map = MapType.fromXmlValue(value);
        if (map == null)
            throw new IllegalArgumentException("Can't parse map type value '" + value + "'!");

        return map;
    }

    public static Calendar parseNullDateTime(String value) {
        value = StringUtils.trimToNull(value);
        return (value != null) ? DatatypeConverter.parseDateTime(value) : null;
    }

    public static BigInteger parseNullInteger(String value) {
        value = StringUtils.trimToNull(value);
        return (value != null) ? DatatypeConverter.parseInteger(value) : null;
    }

    public static BigInteger parsePositiveInteger(String value) {
        value = StringUtils.trimToNull(value);
        return (value != null) ? DatatypeConverter.parseInteger(value) : null;
    }

    public static BigDecimal parseRatio(String value) {
        value = StringUtils.trimToNull(value);
        return (value != null) ? DatatypeConverter.parseDecimal(value) : null;
    }

    public static SizeUnitType parseSizeUnit(String value) {
        value = StringUtils.trimToNull(value);
        if (value == null) return null;

        SizeUnitType unit = SizeUnitType.fromXmlValue(value);
        if (unit == null)
            throw new IllegalArgumentException("Can't parse size-unit value '" + value + "'!");

        return unit;
    }

    /**
     * @deprecated defined in schema but currently not used
     */
    @Deprecated
    public static TransactionType parseTransaction(String value) {
        value = StringUtils.trimToNull(value);
        if (value == null) return null;

        TransactionType trans = TransactionType.fromXmlValue(value);
        if (trans == null)
            throw new IllegalArgumentException("Can't parse transaction value '" + value + "'!");

        return trans;
    }

    public static Integer parseYear(String value) {
        value = StringUtils.trimToNull(value);
        return (value != null) ? DatatypeConverter.parseInt(value) : null;
    }

    public static Boolean parseYesNo(String value) {
        value = StringUtils.trimToEmpty(value);
        if ("yes".equalsIgnoreCase(value))
            return Boolean.TRUE;
        else if ("no".equalsIgnoreCase(value))
            return Boolean.FALSE;
        else
            throw new IllegalArgumentException("Can't parse yes-no value '" + value + "'!");
    }

    public static Boolean parseYesOnly(String value) {
        value = StringUtils.trimToEmpty(value);
        if ("yes".equalsIgnoreCase(value))
            return Boolean.TRUE;
        else
            return null;
    }

    public static String printBreadcrumb(Breadcrumb value) {
        return (value != null) ? value.write() : null;
    }

    /**
     * @deprecated defined in schema but currently not used
     */
    @Deprecated
    public static String printCategory(CategoryType value) {
        if (value == null)
            throw new IllegalArgumentException("Can't print category value!");
        else
            return value.getXmlValue();
    }

    public static String printCountry(String value) {
        value = StringUtils.trimToNull(value);
        if (value == null)
            throw new IllegalArgumentException("Can't print country value!");

        String iso2 = StringUtils.trimToNull(ImmobiliareItUtils.getCountryCode(value));
        if (iso2 == null)
            throw new IllegalArgumentException("Can't convert country '" + value + "' to its ISO2 code!");
        else
            return iso2;
    }

    public static String printCurrency(Currency value) {
        if (value == null)
            throw new IllegalArgumentException("Can't print currency value!");
        else
            return value.getCurrencyCode();
    }

    public static String printDateUpdatedType(Calendar value) {
        if (value == null || !isValidDateUpdatedType(value))
            throw new IllegalArgumentException("Can't print date-updated value!");
        else
            return DatatypeConverter.printDateTime(value);
    }

    public static String printEmailType(String value) {
        if (!isValidEmailType(value))
            throw new IllegalArgumentException("Can't print email value!");
        else
            return value;
    }

    public static String printEnergyScale(EnergyScaleType value) {
        if (value == null)
            throw new IllegalArgumentException("Can't print energy scale value!");
        else
            return value.getXmlValue();
    }

    public static String printGender(GenderType value) {
        if (value == null)
            throw new IllegalArgumentException("Can't print gender value!");
        else
            return value.getXmlValue();
    }

    public static String printLandSizeUnit(LandSizeUnitType value) {
        if (value == null)
            throw new IllegalArgumentException("Can't print land-size-unit value!");
        else
            return value.getXmlValue();
    }

    public static String printLatitude(BigDecimal value) {
        if (value == null || !isValidLatitude(value))
            throw new IllegalArgumentException("Can't print latitude value!");
        else
            return DatatypeConverter.printDecimal(value);
    }

    public static String printLongitude(BigDecimal value) {
        if (value == null || !isValidLongitude(value))
            throw new IllegalArgumentException("Can't print longitude value!");
        else
            return DatatypeConverter.printDecimal(value);
    }

    public static String printMap(MapType value) {
        if (value == null)
            throw new IllegalArgumentException("Can't print map type value!");
        else
            return value.getXmlValue();
    }

    public static String printNullDateTime(Calendar value) {
        return (value != null) ?
                DatatypeConverter.printDateTime(value) :
                StringUtils.EMPTY;
    }

    public static String printNullInteger(BigInteger value) {
        return (value != null) ?
                DatatypeConverter.printInteger(value) :
                StringUtils.EMPTY;
    }

    public static String printPositiveInteger(BigInteger value) {
        if (value == null || BigInteger.ZERO.compareTo(value) < 0)
            throw new IllegalArgumentException("Can't print positive integer value!");

        return DatatypeConverter.printInteger(value);
    }

    public static String printRatio(BigDecimal value) {
        if (value == null || !isValidRatio(value))
            throw new IllegalArgumentException("Can't print ratio value!");
        else
            return DatatypeConverter.printDecimal(value);
    }

    public static String printSizeUnit(SizeUnitType value) {
        if (value == null)
            throw new IllegalArgumentException("Can't print size-unit value!");
        else
            return value.getXmlValue();
    }

    /**
     * @deprecated defined in schema but currently not used
     */
    @Deprecated
    public static String printTransaction(TransactionType value) {
        if (value == null)
            throw new IllegalArgumentException("Can't print transaction value!");
        else
            return value.getXmlValue();
    }

    public static String printYear(Integer value) {
        if (!isValidYear(value))
            throw new IllegalArgumentException("Can't print year value!");
        else
            return DatatypeConverter.printInt(value);
    }

    public static String printYesNo(Boolean value) {
        if (Boolean.TRUE.equals(value))
            return "yes";
        else if (Boolean.FALSE.equals(value))
            return "no";
        else
            throw new IllegalArgumentException("Can't print yes-no value!");
    }

    public static String printYesOnly(Boolean value) {
        if (Boolean.TRUE.equals(value))
            return "yes";
        else
            return null;
    }
}