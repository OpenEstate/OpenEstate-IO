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
 * Supported langauges by Kyero-XML.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public enum KyeroLanguage
{
  /**
   * Arabic
   */
  AR,

  /**
   * Bulgarian
   */
  BG,

  /**
   * Catalan
   */
  CA,

  /**
   * Czech
   */
  CS,

  /**
   * Danish
   */
  DA,

  /**
   * German
   */
  DE,

  /**
   * Greek
   */
  EL,

  /**
   * English
   */
  EN,

  /**
   * Spanish
   */
  ES,

  /**
   * Estonian
   */
  ET,

  /**
   * Farsi
   */
  FA,

  /**
   * Finnish
   */
  FI,

  /**
   * French
   */
  FR,

  /**
   * Hebrew
   */
  HE,

  /**
   * Hindi
   */
  HI,

  /**
   * Hungarian
   */
  HU,

  /**
   * Indonesian
   */
  ID,

  /**
   * Italian
   */
  IT,

  /**
   * Japanese
   */
  JA,

  /**
   * Korean
   */
  KO,

  /**
   * Lithuanian
   */
  LT,

  /**
   * Latvian
   */
  LV,

  /**
   * Dutch
   */
  NL,

  /**
   * Norwegian
   */
  NO,

  /**
   * Polish
   */
  PL,

  /**
   * Portuguese
   */
  PT,

  /**
   * Romanian
   */
  RO,

  /**
   * Russian
   */
  RU,

  /**
   * Slovak
   */
  SK,

  /**
   * Slovenian
   */
  SL,

  /**
   * Swedish
   */
  SV,

  /**
   * Thai
   */
  TH,

  /**
   * Turkish
   */
  TR,

  /**
   * Ukranian
   */
  UK,

  /**
   * Vietnamese
   */
  VI,

  /**
   * Simplified Chinese
   */
  ZH;

  private final static Logger LOGGER = LoggerFactory.getLogger( KyeroLanguage.class );

  /**
   * Removes all translations from a {@link LangType} object.
   *
   * @param container
   * container, where translations are removed from
   */
  public static void clear( LangType container )
  {
    for (KyeroLanguage language : KyeroLanguage.values())
    {
      language.setText( container, null );
    }
  }

  /**
   * Returns the {@link KyeroLanguage} for a certain language code.
   *
   * @param languageCode
   * the language code
   *
   * @return
   * language according to the provided code or null, if the language is not
   * supported
   */
  public static KyeroLanguage fromLanguageCode( String languageCode )
  {
    languageCode = StringUtils.trimToNull( languageCode );
    if (languageCode==null) return null;
    for (KyeroLanguage l : KyeroLanguage.values())
    {
      if (l.name().equalsIgnoreCase( languageCode )) return l;
    }
    return null;
  }

  /**
   * Returns the {@link KyeroLanguage} for a certain {@link Locale} object.
   *
   * @param locale
   * the locale
   *
   * @return
   * language according to the provided locale or null, if the language is not
   * supported
   */
  public static KyeroLanguage fromLocale( Locale locale )
  {
    return (locale!=null)?
      KyeroLanguage.fromLanguageCode( locale.getLanguage() ): null;
  }

  /**
   * Returns languages, that have a translation in a {@link LangType} container.
   *
   * @param container
   * container to lookup
   *
   * @return
   * languages with translations in the container
   */
  public static KyeroLanguage[] getLanguages( LangType container )
  {
    List<KyeroLanguage> languages = new ArrayList<KyeroLanguage>();

    if (StringUtils.isNotBlank( container.getAr() ))
      languages.add( AR );

    if (StringUtils.isNotBlank( container.getBg() ))
      languages.add( BG );

    if (StringUtils.isNotBlank( container.getCa() ))
      languages.add( CA );

    if (StringUtils.isNotBlank( container.getCs() ))
      languages.add( CS );

    if (StringUtils.isNotBlank( container.getDa() ))
      languages.add( DA );

    if (StringUtils.isNotBlank( container.getDe() ))
      languages.add( DE );

    if (StringUtils.isNotBlank( container.getEl() ))
      languages.add( EL );

    if (StringUtils.isNotBlank( container.getEn() ))
      languages.add( EN );

    if (StringUtils.isNotBlank( container.getEs() ))
      languages.add( ES );

    if (StringUtils.isNotBlank( container.getEt() ))
      languages.add( ET );

    if (StringUtils.isNotBlank( container.getFa() ))
      languages.add( FA );

    if (StringUtils.isNotBlank( container.getFi() ))
      languages.add( FI );

    if (StringUtils.isNotBlank( container.getFr() ))
      languages.add( FR );

    if (StringUtils.isNotBlank( container.getHe() ))
      languages.add( HE );

    if (StringUtils.isNotBlank( container.getHi() ))
      languages.add( HI );

    if (StringUtils.isNotBlank( container.getHu() ))
      languages.add( HU );

    if (StringUtils.isNotBlank( container.getId() ))
      languages.add( ID );

    if (StringUtils.isNotBlank( container.getIt() ))
      languages.add( IT );

    if (StringUtils.isNotBlank( container.getJa() ))
      languages.add( JA );

    if (StringUtils.isNotBlank( container.getKo() ))
      languages.add( KO );

    if (StringUtils.isNotBlank( container.getLt() ))
      languages.add( LT );

    if (StringUtils.isNotBlank( container.getLv() ))
      languages.add( LV );

    if (StringUtils.isNotBlank( container.getNl() ))
      languages.add( NL );

    if (StringUtils.isNotBlank( container.getNo() ))
      languages.add( NO );

    if (StringUtils.isNotBlank( container.getPl() ))
      languages.add( PL );

    if (StringUtils.isNotBlank( container.getPt() ))
      languages.add( PT );

    if (StringUtils.isNotBlank( container.getRo() ))
      languages.add( RO );

    if (StringUtils.isNotBlank( container.getRu() ))
      languages.add( RU );

    if (StringUtils.isNotBlank( container.getSk() ))
      languages.add( SK );

    if (StringUtils.isNotBlank( container.getSl() ))
      languages.add( SL );

    if (StringUtils.isNotBlank( container.getSv() ))
      languages.add( SV );

    if (StringUtils.isNotBlank( container.getTh() ))
      languages.add( TH );

    if (StringUtils.isNotBlank( container.getTr() ))
      languages.add( TR );

    if (StringUtils.isNotBlank( container.getUk() ))
      languages.add( UK );

    if (StringUtils.isNotBlank( container.getVi() ))
      languages.add( VI );

    if (StringUtils.isNotBlank( container.getZh() ))
      languages.add( ZH );

    return languages.toArray(new KyeroLanguage[languages.size()] );
  }

  /**
   * Returns the translation from a {@link LangType} container for this
   * language.
   *
   * @param container
   * container to lookup
   *
   * @return
   * translation for this language
   */
  public String getText( LangType container )
  {
    if (container==null) return null;
    switch (this)
    {
      case AR:
        return StringUtils.trimToNull( container.getAr() );

      case BG:
        return StringUtils.trimToNull( container.getBg() );

      case CA:
        return StringUtils.trimToNull( container.getCa() );

      case CS:
        return StringUtils.trimToNull( container.getCs() );

      case DA:
        return StringUtils.trimToNull( container.getDa() );

      case DE:
        return StringUtils.trimToNull( container.getDe() );

      case EL:
        return StringUtils.trimToNull( container.getEl() );

      case EN:
        return StringUtils.trimToNull( container.getEn() );

      case ES:
        return StringUtils.trimToNull( container.getEs() );

      case ET:
        return StringUtils.trimToNull( container.getEt() );

      case FA:
        return StringUtils.trimToNull( container.getFa() );

      case FI:
        return StringUtils.trimToNull( container.getFi() );

      case FR:
        return StringUtils.trimToNull( container.getFr() );

      case HE:
        return StringUtils.trimToNull( container.getHe() );

      case HI:
        return StringUtils.trimToNull( container.getHi() );

      case HU:
        return StringUtils.trimToNull( container.getHu() );

      case ID:
        return StringUtils.trimToNull( container.getId() );

      case IT:
        return StringUtils.trimToNull( container.getIt() );

      case JA:
        return StringUtils.trimToNull( container.getJa() );

      case KO:
        return StringUtils.trimToNull( container.getKo() );

      case LT:
        return StringUtils.trimToNull( container.getLt() );

      case LV:
        return StringUtils.trimToNull( container.getLv() );

      case NL:
        return StringUtils.trimToNull( container.getNl() );

      case NO:
        return StringUtils.trimToNull( container.getNo() );

      case PL:
        return StringUtils.trimToNull( container.getPl() );

      case PT:
        return StringUtils.trimToNull( container.getPt() );

      case RO:
        return StringUtils.trimToNull( container.getRo() );

      case RU:
        return StringUtils.trimToNull( container.getRu() );

      case SK:
        return StringUtils.trimToNull( container.getSk() );

      case SL:
        return StringUtils.trimToNull( container.getSl() );

      case SV:
        return StringUtils.trimToNull( container.getSv() );

      case TH:
        return StringUtils.trimToNull( container.getTh() );

      case TR:
        return StringUtils.trimToNull( container.getTr() );

      case UK:
        return StringUtils.trimToNull( container.getUk() );

      case VI:
        return StringUtils.trimToNull( container.getVi() );

      case ZH:
        return StringUtils.trimToNull( container.getZh() );

      default:
        LOGGER.warn( "unsupported language: " + this );
        return null;
    }
  }

  /**
   * Returns the translation from a {@link LangType} container for a language.
   *
   * @param container
   * container to lookup
   *
   * @param language
   * language to lookup
   *
   * @return
   * translation for this language
   */
  public static String getText( LangType container, KyeroLanguage language )
  {
    return (language!=null)? language.getText( container ): null;
  }

  /**
   * Sets the translation for this language in a {@link LangType} container.
   *
   * @param container
   * container to modify
   *
   * @param txt
   * translation to set
   */
  public void setText( LangType container, String txt )
  {
    if (container==null) return;
    switch (this)
    {
      case AR:
        container.setAr( StringUtils.trimToNull( txt ) );
        break;

      case BG:
        container.setBg( StringUtils.trimToNull( txt ) );
        break;

      case CA:
        container.setCa( StringUtils.trimToNull( txt ) );
        break;

      case CS:
        container.setCs( StringUtils.trimToNull( txt ) );
        break;

      case DA:
        container.setDa( StringUtils.trimToNull( txt ) );
        break;

      case DE:
        container.setDe( StringUtils.trimToNull( txt ) );
        break;

      case EL:
        container.setEl( StringUtils.trimToNull( txt ) );
        break;

      case EN:
        container.setEn( StringUtils.trimToNull( txt ) );
        break;

      case ES:
        container.setEs( StringUtils.trimToNull( txt ) );
        break;

      case ET:
        container.setEt( StringUtils.trimToNull( txt ) );
        break;

      case FA:
        container.setFa( StringUtils.trimToNull( txt ) );
        break;

      case FI:
        container.setFi( StringUtils.trimToNull( txt ) );
        break;

      case FR:
        container.setFr( StringUtils.trimToNull( txt ) );
        break;

      case HE:
        container.setHe( StringUtils.trimToNull( txt ) );
        break;

      case HI:
        container.setHi( StringUtils.trimToNull( txt ) );
        break;

      case HU:
        container.setHu( StringUtils.trimToNull( txt ) );
        break;

      case ID:
        container.setId( StringUtils.trimToNull( txt ) );
        break;

      case IT:
        container.setIt( StringUtils.trimToNull( txt ) );
        break;

      case JA:
        container.setJa( StringUtils.trimToNull( txt ) );
        break;

      case KO:
        container.setKo( StringUtils.trimToNull( txt ) );
        break;

      case LT:
        container.setLt( StringUtils.trimToNull( txt ) );
        break;

      case LV:
        container.setLv( StringUtils.trimToNull( txt ) );
        break;

      case NL:
        container.setNl( StringUtils.trimToNull( txt ) );
        break;

      case NO:
        container.setNo( StringUtils.trimToNull( txt ) );
        break;

      case PL:
        container.setPl( StringUtils.trimToNull( txt ) );
        break;

      case PT:
        container.setPt( StringUtils.trimToNull( txt ) );
        break;

      case RO:
        container.setRo( StringUtils.trimToNull( txt ) );
        break;

      case RU:
        container.setRu( StringUtils.trimToNull( txt ) );
        break;

      case SK:
        container.setSk( StringUtils.trimToNull( txt ) );
        break;

      case SL:
        container.setSl( StringUtils.trimToNull( txt ) );
        break;

      case SV:
        container.setSv( StringUtils.trimToNull( txt ) );
        break;

      case TH:
        container.setTh( StringUtils.trimToNull( txt ) );
        break;

      case TR:
        container.setTr( StringUtils.trimToNull( txt ) );
        break;

      case UK:
        container.setUk( StringUtils.trimToNull( txt ) );
        break;

      case VI:
        container.setVi( StringUtils.trimToNull( txt ) );
        break;

      case ZH:
        container.setZh( StringUtils.trimToNull( txt ) );
        break;

      default:
        LOGGER.warn( "unsupported language: " + this );
    }
  }

  /**
   * Sets the translation for a language in a {@link LangType} container.
   *
   * @param container
   * container to modify
   *
   * @param txt
   * translation to set
   *
   * @param language
   * language to set
   */
  public static void setText( LangType container, String txt, KyeroLanguage language )
  {
    if (language!=null) language.setText( container, txt );
  }

  /**
   * Returns the language code for this language.
   *
   * @return
   * language code
   */
  public String toLanguageCode()
  {
    return this.name().toLowerCase();
  }

  /**
   * Returns the {@link Locale} for this language.
   *
   * @return
   * locale
   */
  public Locale toLocale()
  {
    return LocaleUtils.toLocale( this.toLanguageCode() );
  }
}