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

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.openestate.io.idealista.json.AbstractFeatures;
import org.openestate.io.idealista.json.Address;
import org.openestate.io.idealista.json.BuildingFeatures;
import org.openestate.io.idealista.json.Description;
import org.openestate.io.idealista.json.GarageFeatures;
import org.openestate.io.idealista.json.HomeFeatures;
import org.openestate.io.idealista.json.LandFeatures;
import org.openestate.io.idealista.json.OfficeFeatures;
import org.openestate.io.idealista.json.PremiseFeatures;
import org.openestate.io.idealista.json.StorageFeatures;
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

    /**
     * map property feature classes to their types
     */
    private final static Map<Class<? extends AbstractFeatures>, Class<? extends Enum>> TYPES;

    static {
        TYPES = new HashMap<>();
        TYPES.put(BuildingFeatures.class, BuildingFeatures.Type.class);
        TYPES.put(GarageFeatures.class, GarageFeatures.Type.class);
        TYPES.put(HomeFeatures.class, HomeFeatures.Type.class);
        TYPES.put(LandFeatures.class, LandFeatures.Type.class);
        TYPES.put(OfficeFeatures.class, OfficeFeatures.Type.class);
        TYPES.put(PremiseFeatures.class, PremiseFeatures.Type.class);
        TYPES.put(StorageFeatures.class, StorageFeatures.Type.class);
    }

    private IdealistaUtils() {
        super();
    }

    /**
     * Create an object mapper instance.
     *
     * @return object mapper
     */
    public static ObjectMapper createObjectMapper() {
        final ObjectMapper mapper = new ObjectMapper();

        final SimpleModule module = new SimpleModule();
        module.addDeserializer(AbstractFeatures.class, new FeaturesDeserializer());
        for (Class<? extends AbstractFeatures> t : TYPES.keySet()) {
            module.addDeserializer(t, null);
        }
        mapper.registerModule(module);

        return mapper;
    }

    /**
     * Get address country for an ISO country code.
     *
     * @param code ISO country code
     * @return address country or <code>null</code>, if not supported
     */
    public static Address.Country getAddressCountry(String code) {
        code = StringUtils.trimToNull(code);

        if (StringUtils.equalsAnyIgnoreCase(code, "AD", "AND", "020"))
            return Address.Country.ANDORRA;

        if (StringUtils.equalsAnyIgnoreCase(code, "FR", "FRA", "250"))
            return Address.Country.FRANCE;

        if (StringUtils.equalsAnyIgnoreCase(code, "IT", "ITA", "380"))
            return Address.Country.ITALY;

        if (StringUtils.equalsAnyIgnoreCase(code, "PT", "PRT", "620"))
            return Address.Country.PORTUGAL;

        if (StringUtils.equalsAnyIgnoreCase(code, "SM", "SMR", "674"))
            return Address.Country.SAN_MARINO;

        if (StringUtils.equalsAnyIgnoreCase(code, "ES", "ESP", "724"))
            return Address.Country.SPAIN;

        if (StringUtils.equalsAnyIgnoreCase(code, "CH", "CHE", "756"))
            return Address.Country.SWITZERLAND;

        return null;
    }

    /**
     * Get description language for a supported locale.
     *
     * @param locale locale
     * @return description language or <code>null</code>, if not supported
     */
    public static Description.Language getDescriptionLanguage(Locale locale) {
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
    public static Description.Language getDescriptionLanguage(String code) {
        code = StringUtils.trimToNull(code);

        if (StringUtils.equalsAnyIgnoreCase(code, "ca", "cat"))
            return Description.Language.CATALAN;
        if (StringUtils.equalsAnyIgnoreCase(code, "zh", "zho", "chi"))
            return Description.Language.CHINESE;
        if (StringUtils.equalsAnyIgnoreCase(code, "da", "dan"))
            return Description.Language.DANISH;
        if (StringUtils.equalsAnyIgnoreCase(code, "nl", "nld", "dut"))
            return Description.Language.DUTCH;
        if (StringUtils.equalsAnyIgnoreCase(code, "en", "eng"))
            return Description.Language.ENGLISH;
        if (StringUtils.equalsAnyIgnoreCase(code, "fi", "fin"))
            return Description.Language.FINNISH;
        if (StringUtils.equalsAnyIgnoreCase(code, "fr", "fra", "fre"))
            return Description.Language.FRENCH;
        if (StringUtils.equalsAnyIgnoreCase(code, "de", "deu", "ger"))
            return Description.Language.GERMAN;
        if (StringUtils.equalsAnyIgnoreCase(code, "it", "ita"))
            return Description.Language.ITALIAN;
        if (StringUtils.equalsAnyIgnoreCase(code, "pl", "pol"))
            return Description.Language.POLISH;
        if (StringUtils.equalsAnyIgnoreCase(code, "pt", "por"))
            return Description.Language.PORTUGUESE;
        if (StringUtils.equalsAnyIgnoreCase(code, "ro", "ron", "rum"))
            return Description.Language.ROMANIAN;
        if (StringUtils.equalsAnyIgnoreCase(code, "ru", "rus"))
            return Description.Language.RUSSIAN;
        if (StringUtils.equalsAnyIgnoreCase(code, "es", "spa"))
            return Description.Language.SPANISH;
        if (StringUtils.equalsAnyIgnoreCase(code, "sv", "swe"))
            return Description.Language.SWEDISH;

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

    /**
     * Parse Idealista JSON from a {@link String}.
     *
     * @param json JSON code to read
     * @return Java object containing the JSON data
     * @throws IOException if the object is not readable
     */
    public static IdealistaCustomer read(String json) throws IOException {
        return new IdealistaCustomer(json);
    }

    /**
     * Parse Idealista JSON from a {@link Reader}.
     *
     * @param json JSON code to read
     * @return Java object containing the JSON data
     * @throws IOException if the object is not readable
     */
    public static IdealistaCustomer read(Reader json) throws IOException {
        return new IdealistaCustomer(json);
    }

    /**
     * Parse Idealista JSON from an {@link InputStream}.
     *
     * @param json JSON code to read
     * @return Java object containing the JSON data
     * @throws IOException if the object is not readable
     */
    public static IdealistaCustomer read(InputStream json) throws IOException {
        try (Reader r = new InputStreamReader(json, CHARSET)) {
            return new IdealistaCustomer(r);
        }
    }

    /**
     * Parse Idealista JSON from a {@link File}.
     *
     * @param json JSON code to read
     * @return Java object containing the JSON data
     * @throws IOException if the object is not readable
     */
    public static IdealistaCustomer read(File json) throws IOException {
        try (Reader r = new InputStreamReader(new FileInputStream(json), CHARSET)) {
            return new IdealistaCustomer(r);
        }
    }

    public static class FeaturesDeserializer extends StdDeserializer<AbstractFeatures> {
        private final BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(new DeserializerFactoryConfig());

        public FeaturesDeserializer() {
            this(null);
        }

        public FeaturesDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public AbstractFeatures deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            final JsonNode node = jp.getCodec().readTree(jp);
            final String featuresType = (node.has("featuresType")) ?
                    node.get("featuresType").asText() :
                    null;

            if (featuresType == null) {
                //LOGGER.debug("No featuresType attribute was specified!");
                //return null;
                throw new IOException("No featuresType attribute was specified!");
            }

            //LOGGER.debug("Deserializing {} features...", featuresType);
            for (Map.Entry<Class<? extends AbstractFeatures>, Class<? extends Enum>> type : TYPES.entrySet()) {
                try {
                    final Enum typeEnum = (Enum) type.getValue()
                            .getMethod("fromValue", String.class)
                            .invoke(null, featuresType);

                    if (typeEnum != null) {
                        final JsonParser p = node.traverse(jp.getCodec());
                        p.nextToken();
                        return ctxt.readValue(p, type.getKey());
                    }

                } catch (InvocationTargetException ex) {
                    //LOGGER.debug("{} is not land.", type);
                } catch (NoSuchMethodException | IllegalAccessException ex) {
                    throw new IOException("Can't fetch property type!", ex);
                }
            }

            throw new IOException("Unsupported property type '" + featuresType + "'!");
        }
    }
}
