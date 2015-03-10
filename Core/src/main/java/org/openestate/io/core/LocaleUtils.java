/*
 * Copyright 2015 OpenEstate.org.
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

import java.util.Locale;
import org.apache.commons.lang3.StringUtils;

/**
 * Some helper functions for localizations.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public class LocaleUtils extends org.apache.commons.lang3.LocaleUtils
{
  /**
   * Return an ISO-2 country code from a country name.
   *
   * @param country
   * country name
   *
   * @return
   * ISO-2 country code or null, if no code was found
   */
  public static String getCountryISO2( String country )
  {
    country = StringUtils.trimToNull( country );
    if (country==null)
      return null;
    if (country.length()==2)
      return country;

    String[] iso2Codes = Locale.getISOCountries();
    if (country.length()==3)
    {
      String iso2Code = LocaleUtils.getCountryISO2FromISO3( country );
      if (iso2Code!=null) return iso2Code;
    }

    for (String iso2Code: iso2Codes)
    {
      Locale countryLocale = new Locale( iso2Code, iso2Code );
      for (Locale translationLocale : LocaleUtils.availableLocaleList())
      {
        String name = StringUtils.trimToNull( countryLocale.getDisplayCountry( translationLocale ) );
        if (name!=null && name.equalsIgnoreCase( country )) return iso2Code;
      }
    }
    return null;
  }

  /**
   * Create an ISO-2 country code from an ISO-3 country code.
   *
   * @param iso3Code
   * ISO-3 country code
   *
   * @return
   * ISO-2 country code or null, if no code was found
   */
  public static String getCountryISO2FromISO3( String iso3Code )
  {
    iso3Code = StringUtils.trimToNull( iso3Code );
    if (iso3Code==null) return null;
    if (iso3Code.length()==3)
    {
      for (String iso2Code: Locale.getISOCountries())
      {
        Locale countryLocale = new Locale( iso2Code, iso2Code );
        String countryISO3 = StringUtils.trimToNull( countryLocale.getISO3Country() );
        if (countryISO3!=null && countryISO3.equalsIgnoreCase( iso3Code ))
        {
          return iso2Code;
        }
      }
    }
    return null;
  }

  /**
   * Return an ISO-3 country code from a country name.
   *
   * @param country
   * country name
   *
   * @return
   * ISO-3 country code or null, if no code was found
   */
  public static String getCountryISO3( String country )
  {
    country = StringUtils.trimToNull( country );
    if (country==null)
      return null;
    if (country.length()==3)
      return country;

    String[] iso2Codes = Locale.getISOCountries();
    if (country.length()==2)
    {
      String iso3code = LocaleUtils.getCountryISO3FromISO2( country );
      if (iso3code!=null) return iso3code;
    }

    for (String iso2Code: iso2Codes)
    {
      Locale countryLocale = new Locale( iso2Code, iso2Code );
      String iso3Code = StringUtils.trimToNull( countryLocale.getISO3Country() );
      if (iso3Code==null) continue;
      for (Locale translationLocale : LocaleUtils.availableLocaleList())
      {
        String name = StringUtils.trimToNull( countryLocale.getDisplayCountry( translationLocale ) );
        if (name!=null && name.equalsIgnoreCase( country )) return iso3Code;
      }
    }
    return null;
  }

  /**
   * Create an ISO-3 country code from an ISO-2 country code.
   *
   * @param iso2Code
   * ISO-2 country code
   *
   * @return
   * ISO-3 country code or null, if no code was found
   */
  public static String getCountryISO3FromISO2( String iso2Code )
  {
    iso2Code = StringUtils.trimToNull( iso2Code );
    if (iso2Code==null) return null;
    if (iso2Code.length()==2)
    {
      Locale countryLocale = new Locale( iso2Code, iso2Code );
      String iso3Code = StringUtils.trimToNull( countryLocale.getISO3Country() );
      if (iso3Code!=null) return iso3Code;
    }
    return null;
  }

  /**
   * Return a country name in another language.
   *
   * @param country
   * country name
   *
   * @param language
   * language to translate
   *
   * @return
   * translated country name or null, if no translation was found
   */
  public static String getCountryName( String country, Locale language )
  {
    country = StringUtils.trimToNull( country );
    if (country==null) return null;

    String iso2Code = LocaleUtils.getCountryISO2( country );
    if (iso2Code!=null)
    {
      String name = StringUtils.trimToNull(
        new Locale( iso2Code, iso2Code ).getDisplayCountry( language ) );
      if (name!=null) return name;
    }
    return null;
  }

  /**
   * Translate a country name into another language.
   *
   * @param country
   * country name
   *
   * @param language
   * language to translate
   *
   * @return
   * translated country name or null, if no translation was found
   */
  public static String translateCountryName( String country, Locale language )
  {
    country = StringUtils.trimToNull( country );
    if (country==null) return null;
    for (String iso2Code: Locale.getISOCountries())
    {
      Locale countryLocale = new Locale( iso2Code, iso2Code );
      for (Locale translationLocale : LocaleUtils.availableLocaleList())
      {
        String name = StringUtils.trimToNull( countryLocale.getDisplayCountry( translationLocale ) );
        if (name!=null && name.equalsIgnoreCase( country ))
        {
          name = StringUtils.trimToNull( countryLocale.getDisplayCountry( language ) );
          if (name!=null) return name;
        }
      }
    }
    return null;
  }
}