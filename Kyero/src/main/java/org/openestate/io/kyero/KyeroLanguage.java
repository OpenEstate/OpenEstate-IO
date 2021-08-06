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
package org.openestate.io.kyero;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.commons.lang3.LocaleUtils;
import org.apache.commons.lang3.StringUtils;
import org.openestate.io.kyero.xml.LangType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Supported languages by Kyero-XML.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public enum KyeroLanguage {
    /**
     * Catalan
     */
    CA,

    /**
     * Danish
     */
    DA,

    /**
     * German
     */
    DE,

    /**
     * English
     */
    EN,

    /**
     * Spanish
     */
    ES,

    /**
     * Finnish
     */
    FI,

    /**
     * French
     */
    FR,

    /**
     * Italian
     */
    IT,

    /**
     * Dutch
     */
    NL,

    /**
     * Norwegian
     */
    NO,

    /**
     * Portuguese
     */
    PT,

    /**
     * Russian
     */
    RU,

    /**
     * Swedish
     */
    SV;

    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(KyeroLanguage.class);

    /**
     * Removes all translations from a {@link LangType} object.
     *
     * @param container container, where translations are removed from
     */
    @SuppressWarnings("unused")
    public static void clear(LangType container) {
        for (KyeroLanguage language : KyeroLanguage.values()) {
            language.setText(container, null);
        }
    }

    /**
     * Returns the {@link KyeroLanguage} for a certain language code.
     *
     * @param languageCode the language code
     * @return language according to the provided code or null, if the language is not
     * supported
     */
    public static KyeroLanguage fromLanguageCode(String languageCode) {
        languageCode = StringUtils.trimToNull(languageCode);
        if (languageCode == null) return null;
        for (KyeroLanguage l : KyeroLanguage.values()) {
            if (l.name().equalsIgnoreCase(languageCode)) return l;
        }
        return null;
    }

    /**
     * Returns the {@link KyeroLanguage} for a certain {@link Locale} object.
     *
     * @param locale the locale
     * @return language according to the provided locale or null, if the language is not
     * supported
     */
    @SuppressWarnings("unused")
    public static KyeroLanguage fromLocale(Locale locale) {
        return (locale != null) ?
                KyeroLanguage.fromLanguageCode(locale.getLanguage()) : null;
    }

    /**
     * Returns languages, that have a translation in a {@link LangType} container.
     *
     * @param container container to lookup
     * @return languages with translations in the container
     */
    @SuppressWarnings("unused")
    public static KyeroLanguage[] getLanguages(LangType container) {
        List<KyeroLanguage> languages = new ArrayList<>();

        if (StringUtils.isNotBlank(container.getCa()))
            languages.add(CA);

        if (StringUtils.isNotBlank(container.getDa()))
            languages.add(DA);

        if (StringUtils.isNotBlank(container.getDe()))
            languages.add(DE);

        if (StringUtils.isNotBlank(container.getEn()))
            languages.add(EN);

        if (StringUtils.isNotBlank(container.getEs()))
            languages.add(ES);

        if (StringUtils.isNotBlank(container.getFi()))
            languages.add(FI);

        if (StringUtils.isNotBlank(container.getFr()))
            languages.add(FR);

        if (StringUtils.isNotBlank(container.getIt()))
            languages.add(IT);

        if (StringUtils.isNotBlank(container.getNl()))
            languages.add(NL);

        if (StringUtils.isNotBlank(container.getNo()))
            languages.add(NO);

        if (StringUtils.isNotBlank(container.getPt()))
            languages.add(PT);

        if (StringUtils.isNotBlank(container.getRu()))
            languages.add(RU);

        if (StringUtils.isNotBlank(container.getSv()))
            languages.add(SV);

        return languages.toArray(new KyeroLanguage[0]);
    }

    /**
     * Returns the translation from a {@link LangType} container for this
     * language.
     *
     * @param container container to lookup
     * @return translation for this language
     */
    public String getText(LangType container) {
        if (container == null) return null;
        switch (this) {
            case CA:
                return StringUtils.trimToNull(container.getCa());

            case DA:
                return StringUtils.trimToNull(container.getDa());

            case DE:
                return StringUtils.trimToNull(container.getDe());

            case EN:
                return StringUtils.trimToNull(container.getEn());

            case ES:
                return StringUtils.trimToNull(container.getEs());

            case FI:
                return StringUtils.trimToNull(container.getFi());

            case FR:
                return StringUtils.trimToNull(container.getFr());

            case IT:
                return StringUtils.trimToNull(container.getIt());

            case NL:
                return StringUtils.trimToNull(container.getNl());

            case NO:
                return StringUtils.trimToNull(container.getNo());

            case PT:
                return StringUtils.trimToNull(container.getPt());

            case RU:
                return StringUtils.trimToNull(container.getRu());

            case SV:
                return StringUtils.trimToNull(container.getSv());

            default:
                LOGGER.warn("unsupported language: " + this);
                return null;
        }
    }

    /**
     * Returns the translation from a {@link LangType} container for a language.
     *
     * @param container container to lookup
     * @param language  language to lookup
     * @return translation for this language
     */
    @SuppressWarnings("unused")
    public static String getText(LangType container, KyeroLanguage language) {
        return (language != null) ? language.getText(container) : null;
    }

    /**
     * Sets the translation for this language in a {@link LangType} container.
     *
     * @param container container to modify
     * @param txt       translation to set
     */
    public void setText(LangType container, String txt) {
        if (container == null) return;
        switch (this) {
            case CA:
                container.setCa(StringUtils.trimToNull(txt));
                break;

            case DA:
                container.setDa(StringUtils.trimToNull(txt));
                break;

            case DE:
                container.setDe(StringUtils.trimToNull(txt));
                break;

            case EN:
                container.setEn(StringUtils.trimToNull(txt));
                break;

            case ES:
                container.setEs(StringUtils.trimToNull(txt));
                break;

            case FI:
                container.setFi(StringUtils.trimToNull(txt));
                break;

            case FR:
                container.setFr(StringUtils.trimToNull(txt));
                break;

            case IT:
                container.setIt(StringUtils.trimToNull(txt));
                break;

            case NL:
                container.setNl(StringUtils.trimToNull(txt));
                break;

            case NO:
                container.setNo(StringUtils.trimToNull(txt));
                break;

            case PT:
                container.setPt(StringUtils.trimToNull(txt));
                break;

            case RU:
                container.setRu(StringUtils.trimToNull(txt));
                break;

            case SV:
                container.setSv(StringUtils.trimToNull(txt));
                break;

            default:
                LOGGER.warn("unsupported language: " + this);
        }
    }

    /**
     * Sets the translation for a language in a {@link LangType} container.
     *
     * @param container container to modify
     * @param txt       translation to set
     * @param language  language to set
     */
    @SuppressWarnings("unused")
    public static void setText(LangType container, String txt, KyeroLanguage language) {
        if (language != null) language.setText(container, txt);
    }

    /**
     * Returns the language code for this language.
     *
     * @return language code
     */
    public String toLanguageCode() {
        return this.name().toLowerCase();
    }

    /**
     * Returns the {@link Locale} for this language.
     *
     * @return locale
     */
    @SuppressWarnings("unused")
    public Locale toLocale() {
        return LocaleUtils.toLocale(this.toLanguageCode());
    }
}