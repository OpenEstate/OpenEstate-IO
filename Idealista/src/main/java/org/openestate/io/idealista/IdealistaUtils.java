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
package org.openestate.io.idealista;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import org.openestate.io.idealista.json.Address;
import org.openestate.io.idealista.json.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Some helper functions for the JSON format of
 * <a href="https://www.idealista.com/">idealista.com</a>.
 *
 * @author Andreas Rudolph
 * @since 1.5
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public class IdealistaUtils {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(IdealistaUtils.class);

    /**
     * the implemented version of this format
     */
    @SuppressWarnings("unused")
    public final static String VERSION = "6.0.0";

    /**
     * the preferred charset of this format
     */
    @SuppressWarnings("unused")
    public final static Charset CHARSET = StandardCharsets.UTF_8;

    private IdealistaUtils() {
        super();
    }

    /**
     * Get address country for an ISO country code.
     *
     * @param code ISO country code
     * @return address country or <code>null</code>, if not supported
     */
    public static Address.AddressCountry getAddressCountry(String code) {
        code = StringUtils.trimToNull(code);

        if (StringUtils.equalsAnyIgnoreCase(code, "AD", "AND", "020"))
            return Address.AddressCountry.ANDORRA;

        if (StringUtils.equalsAnyIgnoreCase(code, "FR", "FRA", "250"))
            return Address.AddressCountry.FRANCE;

        if (StringUtils.equalsAnyIgnoreCase(code, "IT", "ITA", "380"))
            return Address.AddressCountry.ITALY;

        if (StringUtils.equalsAnyIgnoreCase(code, "PT", "PRT", "620"))
            return Address.AddressCountry.PORTUGAL;

        if (StringUtils.equalsAnyIgnoreCase(code, "SM", "SMR", "674"))
            return Address.AddressCountry.SAN_MARINO;

        if (StringUtils.equalsAnyIgnoreCase(code, "ES", "ESP", "724"))
            return Address.AddressCountry.SPAIN;

        if (StringUtils.equalsAnyIgnoreCase(code, "CH", "CHE", "756"))
            return Address.AddressCountry.SWITZERLAND;

        return null;
    }

    /**
     * Get description language for a supported locale.
     *
     * @param locale locale
     * @return description language or <code>null</code>, if not supported
     */
    public static Description.DescriptionLanguage getDescriptionLanguage(Locale locale) {
        return (locale != null) ?
                getDescriptionLanguage(locale.getLanguage()) :
                null;
    }

    /**
     * Get description language for an ISO language code.
     *
     * @param code ISO language code
     * @return description language or <code>null</code>, if not supported
     */
    public static Description.DescriptionLanguage getDescriptionLanguage(String code) {
        code = StringUtils.trimToNull(code);

        if (StringUtils.equalsAnyIgnoreCase(code, "ca", "cat"))
            return Description.DescriptionLanguage.CATALAN;
        if (StringUtils.equalsAnyIgnoreCase(code, "zh", "zho", "chi"))
            return Description.DescriptionLanguage.CHINESE;
        if (StringUtils.equalsAnyIgnoreCase(code, "da", "dan"))
            return Description.DescriptionLanguage.DANISH;
        if (StringUtils.equalsAnyIgnoreCase(code, "nl", "nld", "dut"))
            return Description.DescriptionLanguage.DUTCH;
        if (StringUtils.equalsAnyIgnoreCase(code, "en", "eng"))
            return Description.DescriptionLanguage.ENGLISH;
        if (StringUtils.equalsAnyIgnoreCase(code, "fi", "fin"))
            return Description.DescriptionLanguage.FINNISH;
        if (StringUtils.equalsAnyIgnoreCase(code, "fr", "fra", "fre"))
            return Description.DescriptionLanguage.FRENCH;
        if (StringUtils.equalsAnyIgnoreCase(code, "de", "deu", "ger"))
            return Description.DescriptionLanguage.GERMAN;
        if (StringUtils.equalsAnyIgnoreCase(code, "it", "ita"))
            return Description.DescriptionLanguage.ITALIAN;
        if (StringUtils.equalsAnyIgnoreCase(code, "pl", "pol"))
            return Description.DescriptionLanguage.POLISH;
        if (StringUtils.equalsAnyIgnoreCase(code, "pt", "por"))
            return Description.DescriptionLanguage.PORTUGUESE;
        if (StringUtils.equalsAnyIgnoreCase(code, "ro", "ron", "rum"))
            return Description.DescriptionLanguage.ROMANIAN;
        if (StringUtils.equalsAnyIgnoreCase(code, "ru", "rus"))
            return Description.DescriptionLanguage.RUSSIAN;
        if (StringUtils.equalsAnyIgnoreCase(code, "es", "spa"))
            return Description.DescriptionLanguage.SPANISH;
        if (StringUtils.equalsAnyIgnoreCase(code, "sv", "swe"))
            return Description.DescriptionLanguage.SWEDISH;

        return null;
    }

    /**
     * Get supported locales of this format.
     *
     * @return supported locales
     */
    public static Locale[] getLocales() {
        return new Locale[]{
                new Locale("ca"), // catalan
                new Locale("zh"), // chinese
                new Locale("da"), // danish
                new Locale("nl"), // dutch
                new Locale("en"), // english
                new Locale("fi"), // finnish
                new Locale("fr"), // french
                new Locale("de"), // german
                new Locale("it"), // italian
                new Locale("pl"), // polish
                new Locale("pt"), // portuguese
                new Locale("ro"), // romanian
                new Locale("ru"), // russian
                new Locale("es"), // spanish
                new Locale("sv"), // swedish
        };
    }
}
