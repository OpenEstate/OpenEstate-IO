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
package org.openestate.io.is24_csv;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.lang3.StringUtils;
import org.openestate.io.core.CsvFormat;
import org.openestate.io.core.LocaleUtils;
import org.openestate.io.core.NumberUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Specification of the IS24-CSV format.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
@SuppressWarnings("WeakerAccess")
public class Is24CsvFormat extends CsvFormat<Is24CsvParser, Is24CsvPrinter> {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(Is24CsvFormat.class);

    /**
     * the implemented version of this format
     */
    @SuppressWarnings("unused")
    public final static String VERSION = "1.4.0.4";

    /**
     * the encoding of this format
     */
    @SuppressWarnings("unused")
    public final static String ENCODING = "CP1252";

    /**
     * the record separator of this format
     */
    @SuppressWarnings("unused")
    public final static String RECORD_SEPARATOR = "\r\n";

    /**
     * Create IS24-CSV format.
     */
    public Is24CsvFormat() {
        super(CSVFormat.newFormat('|')
                .withRecordSeparator(RECORD_SEPARATOR)
                .withNullString(StringUtils.EMPTY));
    }

    /**
     * Returns a country code, as it is preferred by this format.
     *
     * @param country country name to convert
     * @return converted country code or null, if no matching country was found
     */
    public static String getCountryCode(String country) {
        return LocaleUtils.getCountryISO3(country);
    }

    /**
     * Returns the preferred date format for this format.
     *
     * @return date format
     */
    private static DateFormat getDateFormat() {
        return new SimpleDateFormat("dd.MM.yyyy");
    }

    @Override
    public String getEncoding() {
        return ENCODING;
    }

    @Override
    protected Is24CsvParser newParser(CSVParser parser) {
        return new Is24CsvParser(parser);
    }

    @Override
    protected Is24CsvPrinter newPrinter(CSVPrinter printer) {
        return new Is24CsvPrinter(printer);
    }

    public static Boolean parseBoolean(String value) {
        value = StringUtils.trimToNull(value);
        if ("J".equalsIgnoreCase(value))
            return true;
        else if ("N".equalsIgnoreCase(value))
            return false;
        else
            return null;
    }

    public static Date parseDate(String value) throws ParseException {
        value = StringUtils.trimToNull(value);
        return (value != null) ? getDateFormat().parse(value) : null;
    }

    @SuppressWarnings("Duplicates")
    public static Calendar parseDateAsCalendar(String value) throws ParseException {
        Date date = parseDate(value);
        if (date == null) return null;
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal;
    }

    public static BigDecimal parseDecimal(String value) throws NumberFormatException {
        Number number = parseNumber(value, false);
        return (number != null) ? BigDecimal.valueOf(number.doubleValue()) : null;
    }

    public static Integer parseInteger(String value) throws NumberFormatException {
        Number number = parseNumber(value, false);
        return (number != null) ? number.intValue() : null;
    }

    public static Long parseLong(String value) throws NumberFormatException {
        Number number = parseNumber(value, false);
        return (number != null) ? number.longValue() : null;
    }

    @SuppressWarnings("unused")
    public static Number parseNumber(String value) throws NumberFormatException {
        return parseNumber(value, false);
    }

    public static Number parseNumber(String value, boolean integerOnly) throws NumberFormatException {
        return NumberUtils.parseNumber(value, integerOnly, Locale.GERMANY, Locale.ENGLISH);
    }

    public static String printBoolean(Boolean value) {
        if (Boolean.TRUE.equals(value))
            return "J";
        else if (Boolean.FALSE.equals(value))
            return "N";
        else
            return StringUtils.EMPTY;
    }

    public static String printDate(Calendar value) {
        return printDate((value != null) ? value.getTime() : null);
    }

    public static String printDate(Date value) {
        return (value != null) ? getDateFormat().format(value) : null;
    }

    public static String printNumber(Number value, int integerDigits) {
        return printNumber(value, integerDigits, 0);
    }

    public static String printNumber(Number value, int integerDigits, int fractionDigits) {
        return NumberUtils.printNumber(value, integerDigits, fractionDigits, Locale.GERMANY);
    }

    public static String printString(String value) {
        return printString(value, 0);
    }

    public static String printString(String value, int maxLength) {
        value = StringUtils.trimToNull(value);
        //noinspection Duplicates
        if (maxLength < 1)
            return value;
        else if (maxLength < 4)
            return StringUtils.left(value, maxLength);
        else
            return StringUtils.abbreviate(value, maxLength);
    }
}