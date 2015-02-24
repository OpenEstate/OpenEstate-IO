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

package org.openestate.io.is24_csv;

import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import org.openestate.io.core.CsvRecord;
import org.openestate.io.is24_csv.types.Datei;
import org.openestate.io.is24_csv.types.DateiSuffix;
import org.openestate.io.is24_csv.types.DateiTyp;
import org.openestate.io.is24_csv.types.Immobilienart;
import org.openestate.io.is24_csv.types.Importmodus;
import org.openestate.io.is24_csv.types.Objektdarstellung;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Is24CsvRecord
 *
 * @author Andreas Rudolph
 */
public abstract class Is24CsvRecord extends CsvRecord
{
  private final static Logger LOGGER = LoggerFactory.getLogger( Is24CsvRecord.class );
  protected final static int LENGTH = 182;


  /**
   * general fields
   */

  /** Importmodus, Text 1 */
  public final static int FIELD_MODUS = 0;

  /** Status, Zahl 1 */
  public final static int FIELD_STATUS = 1;

  /** Immobilienart, Zahl 2 */
  public final static int FIELD_IMMOBILIENART = 2;

  /** Scout Objekt ID, Text 20 */
  public final static int FIELD_SCOUT_OBJEKT_ID = 3;

  /** Terms-Region, Text 50 */
  public final static int FIELD_TERMS_REGION = 4;

  /** Terms-Stadt, Text 50 */
  public final static int FIELD_TERMS_STADT = 5;

  /** Terms-Stadtteil, Text 50 */
  public final static int FIELD_TERMS_STADTTEIL = 6;

  /** Anbieter Objekt-Identifikation, Text 50 */
  public final static int FIELD_ANBIETER_OBJEKT_ID = 7;

  /** Gruppierungs-ID, Zahl MAX_INT */
  public final static int FIELD_GRUPPIERUNG_ID = 8;

  /** Mehrstufige Objektdarstellung, Zahl 2 */
  public final static int FIELD_OBJEKTDARSTELLUNG = 9;

  /** Gruppen-ID’s (Semikolon-Separierte Liste von Gruppen-, Verbands- & Börsen-ID’s.) */
  public final static int FIELD_OBJEKTDARSTELLUNG_GRUPPEN = 10;

  /** API-Suchfeld 1, Text 10 */
  public final static int FIELD_API_SUCHFELD1 = 11;

  /** API-Suchfeld 2, Text 10 */
  public final static int FIELD_API_SUCHFELD2 = 12;

  /** API-Suchfeld 3, Text 10 */
  public final static int FIELD_API_SUCHFELD3 = 13;


  /**
   * fields for customer identification
   */

  /** Scout-Kunden-ID, Text 15 */
  public final static int FIELD_SCOUT_KUNDEN_ID = 15;

  /** Kontaktperson Anrede, Text 20 */
  public final static int FIELD_KONTAKT_ANREDE = 16;

  /** Kontaktperson Vorname, Text 30 */
  public final static int FIELD_KONTAKT_VORNAME = 17;

  /** Kontaktperson Nachname, Text 50 */
  public final static int FIELD_KONTAKT_NACHNAME = 18;

  /** Kontaktperson Straße, Text 100 */
  public final static int FIELD_KONTAKT_STRASSE = 19;

  /** Kontaktperson Hausnummer, Text 30 */
  public final static int FIELD_KONTAKT_HAUSNR = 20;

  /** Kontaktperson Postleitzahl, Text 20 */
  public final static int FIELD_KONTAKT_PLZ = 21;

  /** Kontaktperson Ort, Text 50 */
  public final static int FIELD_KONTAKT_ORT = 22;

  /** Länderkennzeichen, Text 3 (Dreistellige ISO-Norm) */
  public final static int FIELD_KONTAKT_LAND = 23;

  /** Telefon, Text 40 */
  public final static int FIELD_KONTAKT_TELEFON = 24;

  /** Mobiltelefon, Text 40 */
  public final static int FIELD_KONTAKT_MOBILTELEFON = 25;

  /** Telefax, Text 40 */
  public final static int FIELD_KONTAKT_TELEFAX = 26;

  /** Email, Text 150 */
  public final static int FIELD_KONTAKT_EMAIL = 27;

  /** Homepage, Text 300 */
  public final static int FIELD_KONTAKT_WEBSEITE = 28;


  /**
   * fields for publishing details
   */

  /** Adreßdruck, Text 1 */
  public final static int FIELD_ADRESSDRUCK = 35;

  /** Überschrift, Text 100 */
  public final static int FIELD_UEBERSCHRIFT = 36;

  /** Provision, Text 50 */
  public final static int FIELD_PROVISION = 37;

  /** Währung, Text 3 */
  public final static int FIELD_WAEHRUNG = 38;

  /** Provisionspflichtig, Text 1 */
  public final static int FIELD_PROVISIONPFLICHTIG = 39;

    /** Provisionshinweis, Text 200 */
  public final static int FIELD_PROVISIONSHINWEIS = 40;


  /**
   * fields for object address
   */

  /** Straße, Text 100 */
  public final static int FIELD_OBJEKT_STRASSE = 50;

  /** Hausnummer, Text 30 */
  public final static int FIELD_OBJEKT_HAUSNR = 51;

  /** Postleitzahl, Text 20 */
  public final static int FIELD_OBJEKT_PLZ = 52;

  /** Ort, Text 50 */
  public final static int FIELD_OBJEKT_ORT = 53;

  /** Länderkennzeichen, Text 3 (Dreistellige ISO- Angabe) */
  public final static int FIELD_OBJEKT_LAND = 54;

  /** Internationale Region, Text 100 (nur für Objekte im Ausland) */
  public final static int FIELD_OBJEKT_INTERNATIONALE_REGION = 55;


  /**
   * fields for object description
   */

  /** Lage, Text 2000 */
  public final static int FIELD_BESCHREIBUNG_LAGE = 99;

  /** Ausstattung, Text 2000 (Nicht für die Immobilienart Grundstücke (5)) */
  public final static int FIELD_BESCHREIBUNG_AUSSTATTUNG = 100;

  /** Objektbeschreibung, Text 2000 */
  public final static int FIELD_BESCHREIBUNG_OBJEKT = 101;

  /** Sonstige Angaben zum Objekt, Text 2000 */
  public final static int FIELD_BESCHREIBUNG_SONSTIGES = 102;


  /**
   * fields for attachments
   */

  /** Dateiname 1, Text 255 */
  public final static int FIELD_DATEI1_NAME = 107;

  /** Dateityp 1, Text 4 */
  public final static int FIELD_DATEI1_SUFFIX = 108;

  /** Dateityp 1, Text 4 */
  public final static int FIELD_DATEI1_TYP = 109;

  /** Abspieldauer 1 in Sekunden, Zahl 5 (Für Video/Audio) */
  public final static int FIELD_DATEI1_DAUER = 110;

  /** Text 1, Text 30 */
  public final static int FIELD_DATEI1_TEXT = 111;


  /** Dateiname 2, Text 255 */
  public final static int FIELD_DATEI2_NAME = 112;

  /** Dateityp 2, Text 4 */
  public final static int FIELD_DATEI2_SUFFIX = 113;

  /** Dateityp 2, Text 4 */
  public final static int FIELD_DATEI2_TYP = 114;

  /** Abspieldauer 2 in Sekunden, Zahl 5 (Für Video/Audio) */
  public final static int FIELD_DATEI2_DAUER = 115;

  /** Text 2, Text 30 */
  public final static int FIELD_DATEI2_TEXT = 116;


  /** Dateiname 3, Text 255 */
  public final static int FIELD_DATEI3_NAME = 117;

  /** Dateityp 3, Text 4 */
  public final static int FIELD_DATEI3_SUFFIX = 118;

  /** Dateityp 3, Text 4 */
  public final static int FIELD_DATEI3_TYP = 119;

  /** Abspieldauer 3 in Sekunden, Zahl 5 (Für Video/Audio) */
  public final static int FIELD_DATEI3_DAUER = 120;

  /** Text 3, Text 30 */
  public final static int FIELD_DATEI3_TEXT = 121;


  /** Dateiname 4, Text 255 */
  public final static int FIELD_DATEI4_NAME = 122;

  /** Dateityp 4, Text 4 */
  public final static int FIELD_DATEI4_SUFFIX = 123;

  /** Dateityp 4, Text 4 */
  public final static int FIELD_DATEI4_TYP = 124;

  /** Abspieldauer 4 in Sekunden, Zahl 5 (Für Video/Audio) */
  public final static int FIELD_DATEI4_DAUER = 125;

  /** Text 4, Text 30 */
  public final static int FIELD_DATEI4_TEXT = 126;


  /** Dateiname 5, Text 255 */
  public final static int FIELD_DATEI5_NAME = 127;

  /** Dateityp 5, Text 4 */
  public final static int FIELD_DATEI5_SUFFIX = 128;

  /** Dateityp 5, Text 4 */
  public final static int FIELD_DATEI5_TYP = 129;

  /** Abspieldauer 5 in Sekunden, Zahl 5 (Für Video/Audio) */
  public final static int FIELD_DATEI5_DAUER = 130;

  /** Text 5, Text 30 */
  public final static int FIELD_DATEI5_TEXT = 131;


  /** Dateiname 6, Text 255 */
  public final static int FIELD_DATEI6_NAME = 132;

  /** Dateityp 6, Text 4 */
  public final static int FIELD_DATEI6_SUFFIX = 133;

  /** Dateityp 6, Text 4 */
  public final static int FIELD_DATEI6_TYP = 134;

  /** Abspieldauer 6 in Sekunden, Zahl 5 (Für Video/Audio) */
  public final static int FIELD_DATEI6_DAUER = 135;

  /** Text 6, Text 30 */
  public final static int FIELD_DATEI6_TEXT = 136;


  /** Dateiname 7, Text 255 */
  public final static int FIELD_DATEI7_NAME = 137;

  /** Dateityp 7, Text 4 */
  public final static int FIELD_DATEI7_SUFFIX = 138;

  /** Dateityp 7, Text 4 */
  public final static int FIELD_DATEI7_TYP = 139;

  /** Abspieldauer 7 in Sekunden, Zahl 5 (Für Video/Audio) */
  public final static int FIELD_DATEI7_DAUER = 140;

  /** Text 7, Text 30 */
  public final static int FIELD_DATEI7_TEXT = 141;


  /** Dateiname 8, Text 255 */
  public final static int FIELD_DATEI8_NAME = 142;

  /** Dateityp 8, Text 4 */
  public final static int FIELD_DATEI8_SUFFIX = 143;

  /** Dateityp 8, Text 4 */
  public final static int FIELD_DATEI8_TYP = 144;

  /** Abspieldauer 8 in Sekunden, Zahl 5 (Für Video/Audio) */
  public final static int FIELD_DATEI8_DAUER = 145;

  /** Text 8, Text 30 */
  public final static int FIELD_DATEI8_TEXT = 146;


  /** Dateiname 9, Text 255 */
  public final static int FIELD_DATEI9_NAME = 147;

  /** Dateityp 9, Text 4 */
  public final static int FIELD_DATEI9_SUFFIX = 148;

  /** Dateityp 9, Text 4 */
  public final static int FIELD_DATEI9_TYP = 149;

  /** Abspieldauer 9 in Sekunden, Zahl 5 (Für Video/Audio) */
  public final static int FIELD_DATEI9_DAUER = 150;

  /** Text 9, Text 30 */
  public final static int FIELD_DATEI9_TEXT = 151;


  /** Dateiname 10, Text 255 */
  public final static int FIELD_DATEI10_NAME = 152;

  /** Dateityp 10, Text 4 */
  public final static int FIELD_DATEI10_SUFFIX = 153;

  /** Dateityp 10, Text 4 */
  public final static int FIELD_DATEI10_TYP = 154;

  /** Abspieldauer 10 in Sekunden, Zahl 5 (Für Video/Audio) */
  public final static int FIELD_DATEI10_DAUER = 155;

  /** Text 10, Text 30 */
  public final static int FIELD_DATEI10_TEXT = 156;


  public Is24CsvRecord()
  {
    super();
  }

  public String getAnbieterObjektId()
  {
    return this.get( FIELD_ANBIETER_OBJEKT_ID );
  }

  public String getApiSuchfeld1()
  {
    return this.get( FIELD_API_SUCHFELD1 );
  }

  public String getApiSuchfeld2()
  {
    return this.get( FIELD_API_SUCHFELD2 );
  }

  public String getApiSuchfeld3()
  {
    return this.get( FIELD_API_SUCHFELD3 );
  }

  @Override
  protected Boolean getAsBoolean( int pos, Boolean defaultValue )
  {
    String value = this.get( pos );
    return (value!=null)? Is24CsvFormat.parseBoolean( value ): defaultValue;
  }

  @Override
  protected Double getAsDouble( int pos, Double defaultValue ) throws NumberFormatException
  {
    String value = this.get( pos );
    try
    {
      return (value!=null)?
        Is24CsvFormat.parseNumber( value, false ).doubleValue(): defaultValue;
    }
    catch (ParseException ex)
    {
      throw new NumberFormatException( "Can't read value '" + value + "' as double!" );
    }
  }

  @Override
  protected Float getAsFloat( int pos, Float defaultValue ) throws NumberFormatException
  {
    String value = this.get( pos );
    try
    {
      return (value!=null)?
        Is24CsvFormat.parseNumber( value, false ).floatValue(): defaultValue;
    }
    catch (ParseException ex)
    {
      throw new NumberFormatException( "Can't read value '" + value + "' as float!" );
    }
  }

  @Override
  protected Integer getAsInteger( int pos, Integer defaultValue ) throws NumberFormatException
  {
    String value = this.get( pos );
    try
    {
      return (value!=null)?
        Is24CsvFormat.parseNumber( value, true ).intValue(): defaultValue;
    }
    catch (ParseException ex)
    {
      throw new NumberFormatException( "Can't read value '" + value + "' as integer!" );
    }
  }

  @Override
  protected Long getAsLong( int pos, Long defaultValue ) throws NumberFormatException
  {
    String value = this.get( pos );
    try
    {
      return (value!=null)?
        Is24CsvFormat.parseNumber( value, true ).longValue(): defaultValue;
    }
    catch (ParseException ex)
    {
      throw new NumberFormatException( "Can't read value '" + value + "' as long!" );
    }
  }

  public String getBeschreibungAusstattung()
  {
    return this.get( FIELD_BESCHREIBUNG_AUSSTATTUNG );
  }

  public String getBeschreibungLage()
  {
    return this.get( FIELD_BESCHREIBUNG_LAGE );
  }

  public String getBeschreibungObjekt()
  {
    return this.get( FIELD_BESCHREIBUNG_OBJEKT );
  }

  public String getBeschreibungSonstiges()
  {
    return this.get( FIELD_BESCHREIBUNG_SONSTIGES );
  }

  public Datei getDatei1()
  {
    String file = this.get( FIELD_DATEI1_NAME );
    return (file!=null)? new Datei( file,
      DateiTyp.parse( this.get( FIELD_DATEI1_TYP ) ),
      DateiSuffix.parse( this.get( FIELD_DATEI1_SUFFIX ) ),
      this.get( FIELD_DATEI1_TEXT ),
      this.getAsInteger( FIELD_DATEI1_DAUER, 0 )
    ): null;
  }

  public Datei getDatei2()
  {
    String file = this.get( FIELD_DATEI2_NAME );
    return (file!=null)? new Datei( file,
      DateiTyp.parse( this.get( FIELD_DATEI2_TYP ) ),
      DateiSuffix.parse( this.get( FIELD_DATEI2_SUFFIX ) ),
      this.get( FIELD_DATEI2_TEXT ),
      this.getAsInteger( FIELD_DATEI2_DAUER, 0 )
    ): null;
  }

  public Datei getDatei3()
  {
    String file = this.get( FIELD_DATEI3_NAME );
    return (file!=null)? new Datei( file,
      DateiTyp.parse( this.get( FIELD_DATEI3_TYP ) ),
      DateiSuffix.parse( this.get( FIELD_DATEI3_SUFFIX ) ),
      this.get( FIELD_DATEI3_TEXT ),
      this.getAsInteger( FIELD_DATEI3_DAUER, 0 )
    ): null;
  }

  public Datei getDatei4()
  {
    String file = this.get( FIELD_DATEI4_NAME );
    return (file!=null)? new Datei( file,
      DateiTyp.parse( this.get( FIELD_DATEI4_TYP ) ),
      DateiSuffix.parse( this.get( FIELD_DATEI4_SUFFIX ) ),
      this.get( FIELD_DATEI4_TEXT ),
      this.getAsInteger( FIELD_DATEI4_DAUER, 0 )
    ): null;
  }

  public Datei getDatei5()
  {
    String file = this.get( FIELD_DATEI5_NAME );
    return (file!=null)? new Datei( file,
      DateiTyp.parse( this.get( FIELD_DATEI5_TYP ) ),
      DateiSuffix.parse( this.get( FIELD_DATEI5_SUFFIX ) ),
      this.get( FIELD_DATEI5_TEXT ),
      this.getAsInteger( FIELD_DATEI5_DAUER, 0 )
    ): null;
  }

  public Datei getDatei6()
  {
    String file = this.get( FIELD_DATEI6_NAME );
    return (file!=null)? new Datei( file,
      DateiTyp.parse( this.get( FIELD_DATEI6_TYP ) ),
      DateiSuffix.parse( this.get( FIELD_DATEI6_SUFFIX ) ),
      this.get( FIELD_DATEI6_TEXT ),
      this.getAsInteger( FIELD_DATEI6_DAUER, 0 )
    ): null;
  }

  public Datei getDatei7()
  {
    String file = this.get( FIELD_DATEI7_NAME );
    return (file!=null)? new Datei( file,
      DateiTyp.parse( this.get( FIELD_DATEI7_TYP ) ),
      DateiSuffix.parse( this.get( FIELD_DATEI7_SUFFIX ) ),
      this.get( FIELD_DATEI7_TEXT ),
      this.getAsInteger( FIELD_DATEI7_DAUER, 0 )
    ): null;
  }

  public Datei getDatei8()
  {
    String file = this.get( FIELD_DATEI8_NAME );
    return (file!=null)? new Datei( file,
      DateiTyp.parse( this.get( FIELD_DATEI8_TYP ) ),
      DateiSuffix.parse( this.get( FIELD_DATEI8_SUFFIX ) ),
      this.get( FIELD_DATEI8_TEXT ),
      this.getAsInteger( FIELD_DATEI8_DAUER, 0 )
    ): null;
  }

  public Datei getDatei9()
  {
    String file = this.get( FIELD_DATEI9_NAME );
    return (file!=null)? new Datei( file,
      DateiTyp.parse( this.get( FIELD_DATEI9_TYP ) ),
      DateiSuffix.parse( this.get( FIELD_DATEI9_SUFFIX ) ),
      this.get( FIELD_DATEI9_TEXT ),
      this.getAsInteger( FIELD_DATEI9_DAUER, 0 )
    ): null;
  }

  public Datei getDatei10()
  {
    String file = this.get( FIELD_DATEI10_NAME );
    return (file!=null)? new Datei( file,
      DateiTyp.parse( this.get( FIELD_DATEI10_TYP ) ),
      DateiSuffix.parse( this.get( FIELD_DATEI10_SUFFIX ) ),
      this.get( FIELD_DATEI10_TEXT ),
      this.getAsInteger( FIELD_DATEI10_DAUER, 0 )
    ): null;
  }

  public Integer getGruppierungId()
  {
    try
    {
      return this.getAsInteger( FIELD_GRUPPIERUNG_ID );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read object group id "
        + "from '" + this.get( FIELD_GRUPPIERUNG_ID ) + "'!" );
      return null;
    }
  }

  public Immobilienart getImmobilienart()
  {
    return Immobilienart.parse( this.get( FIELD_IMMOBILIENART ) );
  }

  public Importmodus getImportmodus()
  {
    return Importmodus.parse( this.get( FIELD_MODUS ) );
  }

  public String getKontaktAnrede()
  {
    return this.get( FIELD_KONTAKT_ANREDE );
  }

  public String getKontaktEmail()
  {
    return this.get( FIELD_KONTAKT_EMAIL );
  }

  public String getKontaktHausNr()
  {
    return this.get( FIELD_KONTAKT_HAUSNR );
  }

  public String getKontaktLand()
  {
    String value = this.get( FIELD_KONTAKT_LAND );
    return (value!=null)? value: Locale.GERMANY.getISO3Country();
  }

  public String getKontaktMobiltelefon()
  {
    return this.get( FIELD_KONTAKT_MOBILTELEFON );
  }

  public String getKontaktNachname()
  {
    return this.get( FIELD_KONTAKT_NACHNAME );
  }

  public String getKontaktOrt()
  {
    return this.get( FIELD_KONTAKT_ORT );
  }

  public String getKontaktPlz()
  {
    return this.get( FIELD_KONTAKT_PLZ );
  }

  public String getKontaktStrasse()
  {
    return this.get( FIELD_KONTAKT_STRASSE );
  }

  public String getKontaktTelefax()
  {
    return this.get( FIELD_KONTAKT_TELEFAX );
  }

  public String getKontaktTelefon()
  {
    return this.get( FIELD_KONTAKT_TELEFON );
  }

  public String getKontaktVorname()
  {
    return this.get( FIELD_KONTAKT_VORNAME );
  }

  public String getKontaktWebseite()
  {
    return this.get( FIELD_KONTAKT_WEBSEITE );
  }

  public Objektdarstellung getObjektdarstellung()
  {
    return Objektdarstellung.parse( this.get( FIELD_OBJEKTDARSTELLUNG ) );
  }

  public String[] getObjektdarstellungGruppen()
  {
    String value = this.get( FIELD_OBJEKTDARSTELLUNG_GRUPPEN );
    return StringUtils.split( value, ";" );
  }

  public String getObjektHausNr()
  {
    return this.get( FIELD_OBJEKT_HAUSNR );
  }

  public String getInternationaleRegion()
  {
    return this.get( FIELD_OBJEKT_INTERNATIONALE_REGION );
  }

  public String getObjektLand()
  {
    String value = this.get( FIELD_OBJEKT_LAND );
    return (value!=null)? value: Locale.GERMANY.getISO3Country();
  }

  public String getObjektOrt()
  {
    return this.get( FIELD_OBJEKT_ORT );
  }

  public String getObjektPlz()
  {
    return this.get( FIELD_OBJEKT_PLZ );
  }

  public String getObjektStrasse()
  {
    return this.get( FIELD_OBJEKT_STRASSE );
  }

  public String getProvision()
  {
    return this.get( FIELD_PROVISION );
  }

  public String getProvisionshinweis()
  {
    return this.get( FIELD_PROVISIONSHINWEIS );
  }

  @Override
  protected int getRecordLenth()
  {
    return LENGTH;
  }

  public String getScoutKundenId()
  {
    return this.get( FIELD_SCOUT_KUNDEN_ID );
  }

  public String getScoutObjektId()
  {
    return this.get( FIELD_SCOUT_OBJEKT_ID );
  }

  public String getTermsRegion()
  {
    return this.get( FIELD_TERMS_REGION );
  }

  public String getTermsStadt()
  {
    return this.get( FIELD_TERMS_STADT );
  }

  public String getTermsStadtteil()
  {
    return this.get( FIELD_TERMS_STADTTEIL );
  }

  public String getUeberschrift()
  {
    return this.get( FIELD_UEBERSCHRIFT );
  }

  public Currency getWaehrung()
  {
    String value = this.get( FIELD_WAEHRUNG );
    try
    {
      return (value!=null)?
        Currency.getInstance( value ):
        Currency.getInstance( "EUR" );
    }
    catch (IllegalArgumentException ex)
    {
      LOGGER.warn( "Can't read currency from '" + value + "'!" );
      return Currency.getInstance( "EUR" );
    }
  }

  public boolean isAdressdruck()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_ADRESSDRUCK ) );
  }

  public boolean isAktiv()
  {
    String value = this.get( FIELD_STATUS );
    return !"0".equals( value );
  }

  public boolean isProvisionspflichtig()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_PROVISIONPFLICHTIG ) );
  }

  public void setAdressdruck( boolean value )
  {
    this.set( FIELD_ADRESSDRUCK, (value)? "J": "N" );
  }

  public void setAktiv( boolean value )
  {
    this.set( FIELD_STATUS, (value)? "1": "0" );
  }

  public void setAnbieterObjektId( String value )
  {
    this.set( FIELD_ANBIETER_OBJEKT_ID,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 50 ) );
  }

  public void setApiSuchfeld1( String value )
  {
    this.set( FIELD_API_SUCHFELD1,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 10 ) );
  }

  public void setApiSuchfeld2( String value )
  {
    this.set( FIELD_API_SUCHFELD2,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 10 ) );
  }

  public void setApiSuchfeld3( String value )
  {
    this.set( FIELD_API_SUCHFELD3,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 10 ) );
  }

  public void setBeschreibungAusstattung( String value )
  {
    this.set( FIELD_BESCHREIBUNG_AUSSTATTUNG,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 2000 ) );
  }

  public void setBeschreibungLage( String value )
  {
    this.set( FIELD_BESCHREIBUNG_LAGE,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 2000 ) );
  }

  public void setBeschreibungObjekt( String value )
  {
    this.set( FIELD_BESCHREIBUNG_OBJEKT,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 2000 ) );
  }

  public void setBeschreibungSonstiges( String value )
  {
    this.set( FIELD_BESCHREIBUNG_SONSTIGES,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 2000 ) );
  }

  public void setDatei1( Datei value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getName() ): null;
    this.set( FIELD_DATEI1_NAME, file );
    this.set( FIELD_DATEI1_TEXT, (value!=null && file!=null)? value.getText(): null );
    this.set( FIELD_DATEI1_TYP, (value!=null && value.getTyp()!=null && file!=null)? value.getTyp().print(): null );
    this.set( FIELD_DATEI1_SUFFIX, (value!=null && value.getSuffix()!=null && file!=null)? value.getSuffix().print(): null );
    this.set( FIELD_DATEI1_DAUER, (value!=null && file!=null)? String.valueOf( value.getAbspieldauer() ): null );
  }

  public void setDatei2( Datei value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getName() ): null;
    this.set( FIELD_DATEI2_NAME, file );
    this.set( FIELD_DATEI2_TEXT, (value!=null && file!=null)? value.getText(): null );
    this.set( FIELD_DATEI2_TYP, (value!=null && value.getTyp()!=null && file!=null)? value.getTyp().print(): null );
    this.set( FIELD_DATEI2_SUFFIX, (value!=null && value.getSuffix()!=null && file!=null)? value.getSuffix().print(): null );
    this.set( FIELD_DATEI2_DAUER, (value!=null && file!=null)? String.valueOf( value.getAbspieldauer() ): null );
  }

  public void setDatei3( Datei value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getName() ): null;
    this.set( FIELD_DATEI3_NAME, file );
    this.set( FIELD_DATEI3_TEXT, (value!=null && file!=null)? value.getText(): null );
    this.set( FIELD_DATEI3_TYP, (value!=null && value.getTyp()!=null && file!=null)? value.getTyp().print(): null );
    this.set( FIELD_DATEI3_SUFFIX, (value!=null && value.getSuffix()!=null && file!=null)? value.getSuffix().print(): null );
    this.set( FIELD_DATEI3_DAUER, (value!=null && file!=null)? String.valueOf( value.getAbspieldauer() ): null );
  }

  public void setDatei4( Datei value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getName() ): null;
    this.set( FIELD_DATEI4_NAME, file );
    this.set( FIELD_DATEI4_TEXT, (value!=null && file!=null)? value.getText(): null );
    this.set( FIELD_DATEI4_TYP, (value!=null && value.getTyp()!=null && file!=null)? value.getTyp().print(): null );
    this.set( FIELD_DATEI4_SUFFIX, (value!=null && value.getSuffix()!=null && file!=null)? value.getSuffix().print(): null );
    this.set( FIELD_DATEI4_DAUER, (value!=null && file!=null)? String.valueOf( value.getAbspieldauer() ): null );
  }

  public void setDatei5( Datei value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getName() ): null;
    this.set( FIELD_DATEI5_NAME, file );
    this.set( FIELD_DATEI5_TEXT, (value!=null && file!=null)? value.getText(): null );
    this.set( FIELD_DATEI5_TYP, (value!=null && value.getTyp()!=null && file!=null)? value.getTyp().print(): null );
    this.set( FIELD_DATEI5_SUFFIX, (value!=null && value.getSuffix()!=null && file!=null)? value.getSuffix().print(): null );
    this.set( FIELD_DATEI5_DAUER, (value!=null && file!=null)? String.valueOf( value.getAbspieldauer() ): null );
  }

  public void setDatei6( Datei value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getName() ): null;
    this.set( FIELD_DATEI6_NAME, file );
    this.set( FIELD_DATEI6_TEXT, (value!=null && file!=null)? value.getText(): null );
    this.set( FIELD_DATEI6_TYP, (value!=null && value.getTyp()!=null && file!=null)? value.getTyp().print(): null );
    this.set( FIELD_DATEI6_SUFFIX, (value!=null && value.getSuffix()!=null && file!=null)? value.getSuffix().print(): null );
    this.set( FIELD_DATEI6_DAUER, (value!=null && file!=null)? String.valueOf( value.getAbspieldauer() ): null );
  }

  public void setDatei7( Datei value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getName() ): null;
    this.set( FIELD_DATEI7_NAME, file );
    this.set( FIELD_DATEI7_TEXT, (value!=null && file!=null)? value.getText(): null );
    this.set( FIELD_DATEI7_TYP, (value!=null && value.getTyp()!=null && file!=null)? value.getTyp().print(): null );
    this.set( FIELD_DATEI7_SUFFIX, (value!=null && value.getSuffix()!=null && file!=null)? value.getSuffix().print(): null );
    this.set( FIELD_DATEI7_DAUER, (value!=null && file!=null)? String.valueOf( value.getAbspieldauer() ): null );
  }

  public void setDatei8( Datei value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getName() ): null;
    this.set( FIELD_DATEI8_NAME, file );
    this.set( FIELD_DATEI8_TEXT, (value!=null && file!=null)? value.getText(): null );
    this.set( FIELD_DATEI8_TYP, (value!=null && value.getTyp()!=null && file!=null)? value.getTyp().print(): null );
    this.set( FIELD_DATEI8_SUFFIX, (value!=null && value.getSuffix()!=null && file!=null)? value.getSuffix().print(): null );
    this.set( FIELD_DATEI8_DAUER, (value!=null && file!=null)? String.valueOf( value.getAbspieldauer() ): null );
  }

  public void setDatei9( Datei value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getName() ): null;
    this.set( FIELD_DATEI9_NAME, file );
    this.set( FIELD_DATEI9_TEXT, (value!=null && file!=null)? value.getText(): null );
    this.set( FIELD_DATEI9_TYP, (value!=null && value.getTyp()!=null && file!=null)? value.getTyp().print(): null );
    this.set( FIELD_DATEI9_SUFFIX, (value!=null && value.getSuffix()!=null && file!=null)? value.getSuffix().print(): null );
    this.set( FIELD_DATEI9_DAUER, (value!=null && file!=null)? String.valueOf( value.getAbspieldauer() ): null );
  }

  public void setDatei10( Datei value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getName() ): null;
    this.set( FIELD_DATEI10_NAME, file );
    this.set( FIELD_DATEI10_TEXT, (value!=null && file!=null)? value.getText(): null );
    this.set( FIELD_DATEI10_TYP, (value!=null && value.getTyp()!=null && file!=null)? value.getTyp().print(): null );
    this.set( FIELD_DATEI10_SUFFIX, (value!=null && value.getSuffix()!=null && file!=null)? value.getSuffix().print(): null );
    this.set( FIELD_DATEI10_DAUER, (value!=null && file!=null)? String.valueOf( value.getAbspieldauer() ): null );
  }

  public void setGruppierungId( Integer value )
  {
    this.set( FIELD_GRUPPIERUNG_ID,
      (value!=null)? String.valueOf( value ): null );
  }

  protected void setImmobilienart( Immobilienart value )
  {
    this.set( FIELD_IMMOBILIENART,
      (value!=null)? value.print(): null );
  }

  public void setImportmodus( Importmodus value )
  {
    this.set( FIELD_MODUS,
      (value!=null)? value.print(): null );
  }

  public void setKontaktAnrede( String value )
  {
    this.set( FIELD_KONTAKT_ANREDE,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 20 ) );
  }

  public void setKontaktEmail( String value )
  {
    this.set( FIELD_KONTAKT_EMAIL,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 150 ) );
  }

  public void setKontaktHausNr( String value )
  {
    this.set( FIELD_KONTAKT_HAUSNR,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 30 ) );
  }

  public void setKontaktLand( String value )
  {
    value = StringUtils.trimToEmpty( value );
    this.set( FIELD_KONTAKT_LAND, (value.length()==3)?
      value.toUpperCase(): Locale.GERMANY.getISO3Country() );
  }

  public void setKontaktMobiltelefon( String value )
  {
    this.set( FIELD_KONTAKT_MOBILTELEFON,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 40 ) );
  }

  public void setKontaktNachname( String value )
  {
    this.set( FIELD_KONTAKT_NACHNAME,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 50 ) );
  }

  public void setKontaktOrt( String value )
  {
    this.set( FIELD_KONTAKT_ORT,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 50 ) );
  }

  public void setKontaktPlz( String value )
  {
    this.set( FIELD_KONTAKT_PLZ,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 20 ) );
  }

  public void setKontaktStrasse( String value )
  {
    this.set( FIELD_KONTAKT_STRASSE,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 100 ) );
  }

  public void setKontaktTelefax( String value )
  {
    this.set( FIELD_KONTAKT_TELEFAX,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 40 ) );
  }

  public void setKontaktTelefon( String value )
  {
    this.set( FIELD_KONTAKT_TELEFON,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 40 ) );
  }

  public void setKontaktVorname( String value )
  {
    this.set( FIELD_KONTAKT_VORNAME,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 30 ) );
  }

  public void setKontaktWebseite( String value )
  {
    this.set( FIELD_KONTAKT_WEBSEITE,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 300 ) );
  }

  public void setObjektdarstellung( Objektdarstellung value )
  {
    this.set( FIELD_OBJEKTDARSTELLUNG,
      (value!=null)? value.print(): null );
  }

  public void setObjektdarstellungGruppen( String[] value )
  {
    this.set( FIELD_OBJEKTDARSTELLUNG_GRUPPEN,
      StringUtils.trimToNull( StringUtils.join( value, ";" ) ) );
  }

  public void setObjektHausNr( String value )
  {
    this.set( FIELD_OBJEKT_HAUSNR,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 30 ) );
  }

  public void setInternationaleRegion( String value )
  {
    this.set( FIELD_OBJEKT_INTERNATIONALE_REGION,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 100 ) );
  }

  public void setObjektLand( String value )
  {
    value = StringUtils.trimToEmpty( value );
    this.set( FIELD_OBJEKT_LAND, (value.length()==3)?
      value.toUpperCase(): Locale.GERMANY.getISO3Country() );
  }

  public void setObjektOrt( String value )
  {
    this.set( FIELD_OBJEKT_ORT,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 50 ) );
  }

  public void setObjektPlz( String value )
  {
    this.set( FIELD_OBJEKT_PLZ,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 20 ) );
  }

  public void setObjektStrasse( String value )
  {
    this.set( FIELD_OBJEKT_STRASSE,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 100 ) );
  }

  public void setProvision( String value )
  {
    this.set( FIELD_PROVISION,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 50 ) );
  }

  public void setProvisionpflichtig( boolean value )
  {
    this.set( FIELD_PROVISIONPFLICHTIG, (value)? "J": "N" );
  }

  public void setProvisionshinweis( String value )
  {
    this.set( FIELD_PROVISIONSHINWEIS,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 200 ) );
  }

  public void setScoutKundenId( String value )
  {
    this.set( FIELD_SCOUT_KUNDEN_ID,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 15 ) );
  }

  public void setScoutObjektId( String value )
  {
    this.set( FIELD_SCOUT_OBJEKT_ID,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 20 ) );
  }

  public void setTermsRegion( String value )
  {
    this.set( FIELD_TERMS_REGION,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 50 ) );
  }

  public void setTermsStadt( String value )
  {
    this.set( FIELD_TERMS_STADT,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 50 ) );
  }

  public void setTermsStadtteil( String value )
  {
    this.set( FIELD_TERMS_STADTTEIL,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 50 ) );
  }

  public void setUeberschrift( String value )
  {
    this.set( FIELD_UEBERSCHRIFT,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 100 ) );
  }

  public void setWaehrung( Currency value )
  {
    this.set( FIELD_WAEHRUNG,
      (value!=null)? value.getCurrencyCode(): "EUR" );
  }
}