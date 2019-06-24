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
package org.openestate.io.trovit;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.bind.DatatypeConverter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.core.XmlValidationHandler;
import org.openestate.io.trovit.xml.ObjectFactory;
import org.openestate.io.trovit.xml.types.AreaUnitValue;
import org.openestate.io.trovit.xml.types.ForeclosureTypeValue;
import org.openestate.io.trovit.xml.types.OrientationValue;
import org.openestate.io.trovit.xml.types.PricePeriodValue;
import org.openestate.io.trovit.xml.types.TypeValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 * Some helper functions for the Trovit-XML format.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
@SuppressWarnings("WeakerAccess")
public class TrovitUtils {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(TrovitUtils.class);
    private final static Pattern ROOMS_INTERVAL = Pattern.compile("^(\\d+)\\-(\\d+)$");
    private static JAXBContext JAXB = null;

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
    @SuppressWarnings("unused")
    public final static String PACKAGE = "org.openestate.io.trovit.xml";

    /**
     * the factory for creation of JAXB objects
     */
    @SuppressWarnings("unused")
    public final static ObjectFactory FACTORY = new ObjectFactory();

    private TrovitUtils() {
    }

    /**
     * Creates a {@link TrovitDocument} from an {@link InputStream}.
     *
     * @param input XML input
     * @return created document or null, of the document is not supported by this format
     * @throws SAXException                 if XML is invalid
     * @throws IOException                  if reading failed
     * @throws ParserConfigurationException if the parser is not properly configured
     */
    public static TrovitDocument createDocument(InputStream input) throws SAXException, IOException, ParserConfigurationException {
        return createDocument(XmlUtils.newDocument(input, true));
    }

    /**
     * Creates a {@link TrovitDocument} from a {@link File}.
     *
     * @param xmlFile XML file
     * @return created document or null, of the document is not supported by this format
     * @throws SAXException                 if XML is invalid
     * @throws IOException                  if reading failed
     * @throws ParserConfigurationException if the parser is not properly configured
     */
    public static TrovitDocument createDocument(File xmlFile) throws SAXException, IOException, ParserConfigurationException {
        return createDocument(XmlUtils.newDocument(xmlFile, true));
    }

    /**
     * Creates a {@link TrovitDocument} from a {@link String}.
     *
     * @param xmlString XML string
     * @return created document or null, of the document is not supported by this format
     * @throws SAXException                 if XML is invalid
     * @throws IOException                  if reading failed
     * @throws ParserConfigurationException if the parser is not properly configured
     */
    public static TrovitDocument createDocument(String xmlString) throws SAXException, IOException, ParserConfigurationException {
        return createDocument(XmlUtils.newDocument(xmlString, true));
    }

    /**
     * Creates a {@link TrovitDocument} from a {@link Document}.
     *
     * @param doc XML document
     * @return created document or null, of the document is not supported by this format
     */
    public static TrovitDocument createDocument(Document doc) {
        if (TrovitDocument.isReadable(doc))
            return new TrovitDocument(doc);
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

    /**
     * Read a {@link AreaUnitValue} value from XML.
     *
     * @param value XML string
     * @return parsed value or null, if the value is invalid
     */
    public static AreaUnitValue parseAreaUnitValue(String value) {
        value = StringUtils.trimToNull(value);
        if (value == null) return null;

        final AreaUnitValue unit = AreaUnitValue.fromXmlValue(value);
        if (unit != null) return unit;

        throw new IllegalArgumentException("Can't parse foreclosure type value '" + value + "'!");
    }

    /**
     * Read a {@link Boolean} value from XML.
     *
     * @param value XML string
     * @return parsed value or null, if the value is invalid
     */
    public static Boolean parseBooleanValue(String value) {
        value = StringUtils.lowerCase(StringUtils.trimToEmpty(value), Locale.ENGLISH);
        switch (value) {
            case "true":
            case "yes":
            case "si":
            case "1":
                return Boolean.TRUE;

            case "false":
            case "no":
            case "0":
                return Boolean.FALSE;

            default:
                throw new IllegalArgumentException("Can't parse boolean value '" + value + "'!");
        }
    }

    /**
     * Read a {@link String} value from XML for description.
     *
     * @param value XML string
     * @return parsed value or null, if the value is invalid
     */
    public static String parseContentValue(String value) {
        return StringUtils.trimToNull(value);
    }

    /**
     * Read a {@link String} value from XML for a country code.
     *
     * @param value XML string
     * @return parsed value or null, if the value is invalid
     */
    public static String parseCountryValue(String value) {
        return StringUtils.trimToNull(value);
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

        final String[] patterns = new String[]{
                "dd/MM/yyyy",
                "dd/MM/yyyy hh:mm:ss",
                "dd-MM-yyyy",
                "dd-MM-yyyy hh:mm:ss",
                "yyyy/MM/dd",
                "yyyy/MM/dd hh:mm:ss",
                "yyyy-MM-dd",
                "yyyy-MM-dd hh:mm:ss"
        };

        try {
            Date date = DateUtils.parseDateStrictly(value, Locale.ENGLISH, patterns);
            Calendar cal = Calendar.getInstance(Locale.getDefault());
            cal.setTime(date);
            return cal;
        } catch (ParseException ex) {
            throw new IllegalArgumentException("Can't parse date value '" + value + "'!", ex);
        }
    }

    /**
     * Read a {@link BigInteger} value from XML for a floor area.
     *
     * @param value XML string
     * @return parsed value or null, if the value is invalid
     */
    public static BigInteger parseFloorAreaValue(String value) {
        try {
            value = StringUtils.trimToNull(value);
            return (value != null) ? DatatypeConverter.parseInteger(value) : null;
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Can't parse floor area value '" + value + "'!", ex);
        }
    }

    /**
     * Read a {@link ForeclosureTypeValue} value from XML.
     *
     * @param value XML string
     * @return parsed value or null, if the value is invalid
     */
    public static ForeclosureTypeValue parseForeclosureTypeValue(String value) {
        value = StringUtils.trimToNull(value);
        if (value == null) return null;

        final ForeclosureTypeValue foreclosure = ForeclosureTypeValue.fromXmlValue(value);
        if (foreclosure != null) return foreclosure;

        throw new IllegalArgumentException("Can't parse foreclosure type value '" + value + "'!");
    }

    /**
     * Read a {@link BigDecimal} value from XML
     * with a valid latitude range.
     *
     * @param value XML string
     * @return parsed value or null, if the value is invalid
     */
    public static BigDecimal parseLatitudeValue(String value) {
        try {
            value = StringUtils.trimToNull(value);
            return (value != null) ? DatatypeConverter.parseDecimal(value) : null;
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Can't parse latitude value '" + value + "'!", ex);
        }
    }

    /**
     * Read a {@link BigDecimal} value from XML
     * with a valid longitude range.
     *
     * @param value XML string
     * @return parsed value or null, if the value is invalid
     */
    public static BigDecimal parseLongitudeValue(String value) {
        try {
            value = StringUtils.trimToNull(value);
            return (value != null) ? DatatypeConverter.parseDecimal(value) : null;
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Can't parse longitude value '" + value + "'!", ex);
        }
    }

    /**
     * Read a {@link OrientationValue} value from XML.
     *
     * @param value XML string
     * @return parsed value or null, if the value is invalid
     */
    public static OrientationValue parseOrientationValue(String value) {
        value = StringUtils.trimToNull(value);
        if (value == null) return null;

        final OrientationValue orientation = OrientationValue.fromXmlValue(value);
        if (orientation != null) return orientation;

        throw new IllegalArgumentException("Can't parse orientation value '" + value + "'!");
    }

    /**
     * Read a {@link BigInteger} value from XML for a plot area.
     *
     * @param value XML string
     * @return parsed value or null, if the value is invalid
     */
    public static BigInteger parsePlotAreaValue(String value) {
        try {
            value = StringUtils.trimToNull(value);
            return (value != null) ? DatatypeConverter.parseInteger(value) : null;
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Can't parse plot area value '" + value + "'!", ex);
        }
    }

    /**
     * Read a {@link Currency} value from XML.
     *
     * @param value XML string
     * @return parsed value or null, if the value is invalid
     */
    public static Currency parsePriceCurrencyValue(String value) {
        value = StringUtils.trimToNull(value);
        if (value == null) return null;

        try {
            return Currency.getInstance(value.toUpperCase());
        } catch (IllegalArgumentException ex) {
            throw new IllegalArgumentException("Can't parse price currency value '" + value + "'!", ex);
        }
    }

    /**
     * Read a {@link PricePeriodValue} value from XML.
     *
     * @param value XML string
     * @return parsed value or null, if the value is invalid
     */
    public static PricePeriodValue parsePricePeriodValue(String value) {
        value = StringUtils.trimToNull(value);
        if (value == null) return null;

        final PricePeriodValue period = PricePeriodValue.fromXmlValue(value);
        if (period != null) return period;

        throw new IllegalArgumentException("Can't parse price period value '" + value + "'!");
    }

    /**
     * Read a {@link BigDecimal} value from XML for a price.
     *
     * @param value XML string
     * @return parsed value or null, if the value is invalid
     */
    public static BigDecimal parsePriceValue(String value) {
        value = StringUtils.trimToNull(value);
        if (value == null) return null;
        try {
            return DatatypeConverter.parseDecimal(value);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Can't parse price value '" + value + "'!", ex);
        }
    }

    /**
     * Read a {@link BigDecimal} value from XML for a number of rooms.
     *
     * @param value XML string
     * @return parsed value or null, if the value is invalid
     */
    public static BigDecimal parseRoomsValue(String value) {
        value = StringUtils.trimToNull(value);
        if (value == null) return null;

        final Matcher m = ROOMS_INTERVAL.matcher(value);
        if (m.find()) {
            final int from = Integer.parseInt(m.group(1));
            final int to = Integer.parseInt(m.group(2));
            if ((to - from) != -1) {
                throw new IllegalArgumentException("Can't parse rooms value '" + value + "' because of an invalid interval!");
            }
            return DatatypeConverter.parseDecimal(to + ".5");
        }

        try {
            return DatatypeConverter.parseDecimal(value);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Can't parse rooms value '" + value + "'!", ex);
        }
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
     * Read a {@link TypeValue} value from XML.
     *
     * @param value XML string
     * @return parsed value or null, if the value is invalid
     */
    public static TypeValue parseTypeValue(String value) {
        value = StringUtils.trimToNull(value);
        if (value == null) return null;

        final TypeValue type = TypeValue.fromXmlValue(value);
        if (type != null) return type;

        throw new IllegalArgumentException("Can't parse type value '" + value + "'!");
    }

    /**
     * Read a {@link BigInteger} value from XML for a year number.
     *
     * @param value XML string
     * @return parsed value or null, if the value is invalid
     */
    public static BigInteger parseYearValue(String value) {
        try {
            value = StringUtils.trimToNull(value);
            return (value != null) ? DatatypeConverter.parseInteger(value) : null;
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Can't parse year value '" + value + "'!", ex);
        }
    }

    /**
     * Write a {@link AreaUnitValue} value into XML output.
     *
     * @param value value to write
     * @return XML string
     * @throws IllegalArgumentException if a validation error occurred
     */
    public static String printAreaUnitValue(AreaUnitValue value) {
        if (value == null)
            throw new IllegalArgumentException("Can't print empty area unit value!");

        return value.write();
    }

    /**
     * Write a {@link Boolean} value into XML output.
     *
     * @param value value to write
     * @return XML string
     * @throws IllegalArgumentException if a validation error occurred
     */
    public static String printBooleanValue(Boolean value) {
        if (value == null)
            throw new IllegalArgumentException("Can't print empty boolean value!");

        return DatatypeConverter.printBoolean(value);
    }

    /**
     * Write a {@link String} value for a description into XML output.
     * <p>
     * The description must contain at least 30 characters.
     *
     * @param value value to write
     * @return XML string
     * @throws IllegalArgumentException if a validation error occurred
     */
    public static String printContentValue(String value) {
        value = StringUtils.trimToNull(value);
        if (value == null)
            throw new IllegalArgumentException("Can't print empty content value!");
        if (value.length() < 30)
            throw new IllegalArgumentException("Can't print content value '" + value + "' because it is shorter than 30 characters!");

        return value;
    }

    /**
     * Write a {@link String} value for a country code into XML output.
     * <p>
     * The country has to be represendet by a ISO-Code wirh two or three
     * characters.
     *
     * @param value value to write
     * @return XML string
     * @throws IllegalArgumentException if a validation error occurred
     */
    public static String printCountryValue(String value) {
        value = StringUtils.trimToNull(value);
        if (value == null)
            throw new IllegalArgumentException("Can't print empty country value!");
        if (value.length() != 2 && value.length() != 3)
            throw new IllegalArgumentException("Can't print country value '" + value + "' because it is neither an ISO-2-Code nor an ISO-3-Code!");

        return StringUtils.upperCase(value, Locale.ENGLISH);
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

        return new SimpleDateFormat("dd-MM-yyyy hh:mm:ss", Locale.ENGLISH)
                .format(value.getTime());
    }

    /**
     * Write a {@link BigInteger} value into XML output for a floor area.
     *
     * @param value value to write
     * @return XML string
     * @throws IllegalArgumentException if a validation error occurred
     */
    public static String printFloorAreaValue(BigInteger value) {
        if (value == null)
            throw new IllegalArgumentException("Can't print empty floor area value!");
        if (value.compareTo(BigInteger.valueOf(20L)) < 0)
            throw new IllegalArgumentException("Can't print floor area value '" + value + "' because it is below 20!");
        if (value.compareTo(BigInteger.valueOf(50000L)) > 0)
            throw new IllegalArgumentException("Can't print floor area value '" + value + "' because it is above 50000!");

        return DatatypeConverter.printInteger(value);
    }

    /**
     * Write a {@link ForeclosureTypeValue} value into XML output.
     *
     * @param value value to write
     * @return XML string
     * @throws IllegalArgumentException if a validation error occurred
     */
    public static String printForeclosureTypeValue(ForeclosureTypeValue value) {
        if (value == null)
            throw new IllegalArgumentException("Can't print empty foreclosure type value!");

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
     * Write a {@link OrientationValue} value into XML output.
     *
     * @param value value to write
     * @return XML string
     * @throws IllegalArgumentException if a validation error occurred
     */
    public static String printOrientationValue(OrientationValue value) {
        if (value == null)
            throw new IllegalArgumentException("Can't print empty orientation value!");

        return value.write();
    }

    /**
     * Write a {@link BigInteger} value into XML output for a plot area.
     *
     * @param value value to write
     * @return XML string
     * @throws IllegalArgumentException if a validation error occurred
     */
    public static String printPlotAreaValue(BigInteger value) {
        if (value == null)
            throw new IllegalArgumentException("Can't print empty plot area value!");
        if (value.compareTo(BigInteger.ONE) < 0)
            throw new IllegalArgumentException("Can't print floor plot value '" + value + "' because it is below 1!");
        if (value.compareTo(BigInteger.valueOf(1000000000L)) > 0)
            throw new IllegalArgumentException("Can't print floor plot value '" + value + "' because it is above 1000000000!");

        return DatatypeConverter.printInteger(value);
    }

    /**
     * Write a {@link Currency} value into XML output.
     *
     * @param value value to write
     * @return XML string
     * @throws IllegalArgumentException if a validation error occurred
     */
    public static String printPriceCurrencyValue(Currency value) {
        if (value == null)
            throw new IllegalArgumentException("Can't print empty price currency value!");

        return value.getCurrencyCode();
    }

    /**
     * Write a {@link PricePeriodValue} value into XML output.
     *
     * @param value value to write
     * @return XML string
     * @throws IllegalArgumentException if a validation error occurred
     */
    public static String printPricePeriodValue(PricePeriodValue value) {
        if (value == null)
            throw new IllegalArgumentException("Can't print empty price period value!");

        return value.write();
    }

    /**
     * Write a {@link BigDecimal} value into XML output for a price.
     *
     * @param value value to write
     * @return XML string
     * @throws IllegalArgumentException if a validation error occurred
     */
    public static String printPriceValue(BigDecimal value) {
        if (value == null)
            throw new IllegalArgumentException("Can't print empty price value!");
        if (value.compareTo(BigDecimal.ZERO) < 0)
            throw new IllegalArgumentException("Can't print price value '" + value + "' because it is below 0!");
        if (value.compareTo(new BigDecimal("1000000000")) > 0)
            throw new IllegalArgumentException("Can't print price value '" + value + "' because it is above 1000000000!");

        value = value.setScale(2, BigDecimal.ROUND_HALF_UP);
        return DatatypeConverter.printDecimal(value);
    }

    /**
     * Write a {@link BigDecimal} value into XML output for a room number.
     *
     * @param value value to write
     * @return XML string
     * @throws IllegalArgumentException if a validation error occurred
     */
    public static String printRoomsValue(BigDecimal value) {
        if (value == null)
            throw new IllegalArgumentException("Can't print empty rooms value!");
        if (value.compareTo(BigDecimal.ZERO) < 0)
            throw new IllegalArgumentException("Can't print rooms value '" + value + "' because it is below 0!");
        if (value.compareTo(new BigDecimal("20")) > 0)
            throw new IllegalArgumentException("Can't print rooms value '" + value + "' because it is above 20!");

        value = value.setScale(1, BigDecimal.ROUND_HALF_UP);
        //return DatatypeConverter.printDecimal( value );

        final BigInteger integerPart = value.toBigInteger();
        final BigInteger decimalPart = value.subtract(new BigDecimal(integerPart, 1)).multiply(BigDecimal.TEN).toBigInteger();
        if (decimalPart.compareTo(BigInteger.ZERO) != 0)
            return integerPart.toString() + ".5";

        return DatatypeConverter.printInteger(integerPart);
    }

    /**
     * Write a {@link TypeValue} value into XML output.
     *
     * @param value value to write
     * @return XML string
     * @throws IllegalArgumentException if a validation error occurred
     */
    public static String printTypeValue(TypeValue value) {
        if (value == null)
            throw new IllegalArgumentException("Can't print empty type value!");

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

    /**
     * Write a {@link BigInteger} value into XML output for a year number.
     *
     * @param value value to write
     * @return XML string
     * @throws IllegalArgumentException if a validation error occurred
     */
    public static String printYearValue(BigInteger value) {
        if (value == null)
            throw new IllegalArgumentException("Can't print empty year value!");
        if (value.compareTo(BigInteger.valueOf(1700L)) < 0)
            throw new IllegalArgumentException("Can't print year value '" + value + "' because it is below 1700!");
        if (value.compareTo(BigInteger.valueOf(9999L)) > 0)
            throw new IllegalArgumentException("Can't print year value '" + value + "' because it is above 9999!");

        return DatatypeConverter.printInteger(value);
    }
}