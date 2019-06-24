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
package org.openestate.io.core;

import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * NumberUtils.
 *
 * @author Andreas Rudolph
 * @since 1.1
 */
public final class NumberUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(NumberUtils.class);

    /**
     * Test, if a string contains a parsable number.
     *
     * @param value  the value to check
     * @param locale the locale, against which the value is checked
     *               (checks locale specific decimal and grouping separators)
     * @return true, if the provided value contains of numbers
     */
    public static boolean isNumeric(String value, Locale locale) {
        if (value == null) return false;
        int start = 0;

        final DecimalFormatSymbols symbols = (locale != null) ?
                DecimalFormatSymbols.getInstance(locale) :
                DecimalFormatSymbols.getInstance();

        if (value.startsWith("+") || value.startsWith("-")) start++;
        boolean fraction = false;
        for (int i = start; i < value.length(); i++) {
            final char c = value.charAt(i);
            if (c == symbols.getDecimalSeparator() && !fraction) {
                fraction = true;
                continue;
            }
            if (c == symbols.getGroupingSeparator() && !fraction) {
                continue;
            }
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Convert a string value into a number.
     *
     * @param value the string value to convert
     * @return numeric value for the string
     * @throws NumberFormatException if the string is not a valid number
     */
    public static Number parseNumber(String value) throws NumberFormatException {
        return parseNumber(value, false);
    }

    /**
     * Convert a string value into a number.
     *
     * @param value   the string value to convert
     * @param locales locales, against which the value is parsed
     * @return numeric value for the string
     * @throws NumberFormatException if the string is not a valid number
     */
    public static Number parseNumber(String value, Locale... locales) throws NumberFormatException {
        return parseNumber(value, false, locales);
    }

    /**
     * Convert a string value into a number.
     *
     * @param value       the string value to convert
     * @param integerOnly wether only the integer part of the value is parsed
     * @param locales     locales, against which the value is parsed
     * @return numeric value for the string
     * @throws NumberFormatException if the string is not a valid number
     */
    public static Number parseNumber(String value, boolean integerOnly, Locale... locales) throws NumberFormatException {
        value = StringUtils.trimToNull(value);
        if (value == null) return null;

        // ignore leading plus sign
        if (value.startsWith("+"))
            value = StringUtils.trimToNull(value.substring(1));

        // remove any spaces
        value = StringUtils.replace(value, StringUtils.SPACE, StringUtils.EMPTY);

        if (ArrayUtils.isEmpty(locales))
            locales = new Locale[]{Locale.getDefault()};

        for (Locale locale : locales) {
            // check, if the value is completely numeric for the locale
            if (!isNumeric(value, locale)) continue;
            NumberFormat format = NumberFormat.getNumberInstance(locale);
            try {
                format.setMinimumFractionDigits(0);
                format.setParseIntegerOnly(integerOnly);
                format.setGroupingUsed(value.indexOf(DecimalFormatSymbols.getInstance(locale).getGroupingSeparator()) > -1);
                return format.parse(value);
            } catch (ParseException ex) {
            }
        }
        throw new NumberFormatException("The provided value '" + value + "' is not numeric!");
    }

    /**
     * Write a number into a string value.
     *
     * @param value          the number to write
     * @param integerDigits  maximal number of integer digits
     * @param fractionDigits maximal number of fraction digits
     * @return the formatted number
     */
    public static String printNumber(Number value, int integerDigits, int fractionDigits) {
        return printNumber(value, integerDigits, fractionDigits, null);
    }

    /**
     * Write a number into a string value.
     *
     * @param value          the number to write
     * @param integerDigits  maximal number of integer digits
     * @param fractionDigits maximal number of fraction digits
     * @param locale         locale for decimal separator (using {@link Locale#ENGLISH} if null)
     * @return the formatted number
     */
    public static String printNumber(Number value, int integerDigits, int fractionDigits, Locale locale) {
        if (value == null) return null;
        NumberFormat format = NumberFormat.getNumberInstance((locale != null) ? locale : Locale.ENGLISH);
        format.setMaximumIntegerDigits(integerDigits);
        format.setMaximumFractionDigits(fractionDigits);
        format.setMinimumFractionDigits(0);
        format.setGroupingUsed(false);
        return format.format(value);
    }
}