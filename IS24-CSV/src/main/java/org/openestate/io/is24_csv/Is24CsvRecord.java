/*
 * Copyright 2015-2017 OpenEstate.org.
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

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.csv.CSVRecord;
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
 * A general Record from the IS24-CSV format.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public abstract class Is24CsvRecord extends CsvRecord
{
  private final static Logger LOGGER = LoggerFactory.getLogger( Is24CsvRecord.class );
  private final static Pattern LINEBREAK = Pattern.compile( "<br\\s*/?>", Pattern.CASE_INSENSITIVE );
  public final static int LENGTH = 182;
  public final static int FILE_LIMIT = 10;


  /**
   * general fields
   */

  /** Importmodus, Text 1 */
  protected final static int FIELD_MODUS = 0;

  /** Status, Zahl 1 */
  protected final static int FIELD_STATUS = 1;

  /** Immobilienart, Zahl 2 */
  protected final static int FIELD_IMMOBILIENART = 2;

  /** Scout Objekt ID, Text 20 */
  protected final static int FIELD_SCOUT_OBJEKT_ID = 3;

  /** Terms-Region, Text 50 */
  protected final static int FIELD_TERMS_REGION = 4;

  /** Terms-Stadt, Text 50 */
  protected final static int FIELD_TERMS_STADT = 5;

  /** Terms-Stadtteil, Text 50 */
  protected final static int FIELD_TERMS_STADTTEIL = 6;

  /** Anbieter Objekt-Identifikation, Text 50 */
  protected final static int FIELD_ANBIETER_OBJEKT_ID = 7;

  /** Gruppierungs-ID, Zahl MAX_INT */
  protected final static int FIELD_GRUPPIERUNG_ID = 8;

  /** Mehrstufige Objektdarstellung, Zahl 2 */
  protected final static int FIELD_OBJEKTDARSTELLUNG = 9;

  /** Gruppen-ID’s (Semikolon-Separierte Liste von Gruppen-, Verbands- & Börsen-ID’s.) */
  protected final static int FIELD_OBJEKTDARSTELLUNG_GRUPPEN = 10;

  /** API-Suchfeld 1, Text 10 */
  protected final static int FIELD_API_SUCHFELD1 = 11;

  /** API-Suchfeld 2, Text 10 */
  protected final static int FIELD_API_SUCHFELD2 = 12;

  /** API-Suchfeld 3, Text 10 */
  protected final static int FIELD_API_SUCHFELD3 = 13;


  /**
   * fields for customer identification
   */

  /** Scout-Kunden-ID, Text 15 */
  protected final static int FIELD_SCOUT_KUNDEN_ID = 15;

  /** Kontaktperson Anrede, Text 20 */
  protected final static int FIELD_KONTAKT_ANREDE = 16;

  /** Kontaktperson Vorname, Text 30 */
  protected final static int FIELD_KONTAKT_VORNAME = 17;

  /** Kontaktperson Nachname, Text 50 */
  protected final static int FIELD_KONTAKT_NACHNAME = 18;

  /** Kontaktperson Straße, Text 100 */
  protected final static int FIELD_KONTAKT_STRASSE = 19;

  /** Kontaktperson Hausnummer, Text 30 */
  protected final static int FIELD_KONTAKT_HAUSNR = 20;

  /** Kontaktperson Postleitzahl, Text 20 */
  protected final static int FIELD_KONTAKT_PLZ = 21;

  /** Kontaktperson Ort, Text 50 */
  protected final static int FIELD_KONTAKT_ORT = 22;

  /** Länderkennzeichen, Text 3 (Dreistellige ISO-Norm) */
  protected final static int FIELD_KONTAKT_LAND = 23;

  /** Telefon, Text 40 */
  protected final static int FIELD_KONTAKT_TELEFON = 24;

  /** Mobiltelefon, Text 40 */
  protected final static int FIELD_KONTAKT_MOBILTELEFON = 25;

  /** Telefax, Text 40 */
  protected final static int FIELD_KONTAKT_TELEFAX = 26;

  /** Email, Text 150 */
  protected final static int FIELD_KONTAKT_EMAIL = 27;

  /** Homepage, Text 300 */
  protected final static int FIELD_KONTAKT_WEBSEITE = 28;


  /**
   * fields for publishing details
   */

  /** Adreßdruck, Text 1 */
  protected final static int FIELD_ADRESSDRUCK = 35;

  /** Überschrift, Text 100 */
  protected final static int FIELD_UEBERSCHRIFT = 36;

  /** Provision, Text 50 */
  protected final static int FIELD_PROVISION = 37;

  /** Währung, Text 3 */
  protected final static int FIELD_WAEHRUNG = 38;

  /** Provisionspflichtig, Text 1 */
  protected final static int FIELD_PROVISIONPFLICHTIG = 39;

    /** Provisionshinweis, Text 200 */
  protected final static int FIELD_PROVISIONSHINWEIS = 40;


  /**
   * fields for object address
   */

  /** Straße, Text 100 */
  protected final static int FIELD_OBJEKT_STRASSE = 50;

  /** Hausnummer, Text 30 */
  protected final static int FIELD_OBJEKT_HAUSNR = 51;

  /** Postleitzahl, Text 20 */
  protected final static int FIELD_OBJEKT_PLZ = 52;

  /** Ort, Text 50 */
  protected final static int FIELD_OBJEKT_ORT = 53;

  /** Länderkennzeichen, Text 3 (Dreistellige ISO- Angabe) */
  protected final static int FIELD_OBJEKT_LAND = 54;

  /** Internationale Region, Text 100 (nur für Objekte im Ausland) */
  protected final static int FIELD_OBJEKT_INTERNATIONALE_REGION = 55;


  /**
   * fields for object description
   */

  /** Lage, Text 2000 */
  protected final static int FIELD_BESCHREIBUNG_LAGE = 99;

  /** Ausstattung, Text 2000 (Nicht für die Immobilienart Grundstücke (5)) */
  protected final static int FIELD_BESCHREIBUNG_AUSSTATTUNG = 100;

  /** Objektbeschreibung, Text 2000 */
  protected final static int FIELD_BESCHREIBUNG_OBJEKT = 101;

  /** Sonstige Angaben zum Objekt, Text 2000 */
  protected final static int FIELD_BESCHREIBUNG_SONSTIGES = 102;


  /**
   * fields for attachments
   */

  /** Dateiname 1, Text 255 */
  protected final static int FIELD_DATEI1_NAME = 107;

  /** Dateityp 1, Text 4 */
  protected final static int FIELD_DATEI1_SUFFIX = 108;

  /** Dateityp 1, Text 4 */
  protected final static int FIELD_DATEI1_TYP = 109;

  /** Abspieldauer 1 in Sekunden, Zahl 5 (Für Video/Audio) */
  protected final static int FIELD_DATEI1_DAUER = 110;

  /** Text 1, Text 30 */
  protected final static int FIELD_DATEI1_TEXT = 111;


  /** Dateiname 2, Text 255 */
  protected final static int FIELD_DATEI2_NAME = 112;

  /** Dateityp 2, Text 4 */
  protected final static int FIELD_DATEI2_SUFFIX = 113;

  /** Dateityp 2, Text 4 */
  protected final static int FIELD_DATEI2_TYP = 114;

  /** Abspieldauer 2 in Sekunden, Zahl 5 (Für Video/Audio) */
  protected final static int FIELD_DATEI2_DAUER = 115;

  /** Text 2, Text 30 */
  protected final static int FIELD_DATEI2_TEXT = 116;


  /** Dateiname 3, Text 255 */
  protected final static int FIELD_DATEI3_NAME = 117;

  /** Dateityp 3, Text 4 */
  protected final static int FIELD_DATEI3_SUFFIX = 118;

  /** Dateityp 3, Text 4 */
  protected final static int FIELD_DATEI3_TYP = 119;

  /** Abspieldauer 3 in Sekunden, Zahl 5 (Für Video/Audio) */
  protected final static int FIELD_DATEI3_DAUER = 120;

  /** Text 3, Text 30 */
  protected final static int FIELD_DATEI3_TEXT = 121;


  /** Dateiname 4, Text 255 */
  protected final static int FIELD_DATEI4_NAME = 122;

  /** Dateityp 4, Text 4 */
  protected final static int FIELD_DATEI4_SUFFIX = 123;

  /** Dateityp 4, Text 4 */
  protected final static int FIELD_DATEI4_TYP = 124;

  /** Abspieldauer 4 in Sekunden, Zahl 5 (Für Video/Audio) */
  protected final static int FIELD_DATEI4_DAUER = 125;

  /** Text 4, Text 30 */
  protected final static int FIELD_DATEI4_TEXT = 126;


  /** Dateiname 5, Text 255 */
  protected final static int FIELD_DATEI5_NAME = 127;

  /** Dateityp 5, Text 4 */
  protected final static int FIELD_DATEI5_SUFFIX = 128;

  /** Dateityp 5, Text 4 */
  protected final static int FIELD_DATEI5_TYP = 129;

  /** Abspieldauer 5 in Sekunden, Zahl 5 (Für Video/Audio) */
  protected final static int FIELD_DATEI5_DAUER = 130;

  /** Text 5, Text 30 */
  protected final static int FIELD_DATEI5_TEXT = 131;


  /** Dateiname 6, Text 255 */
  protected final static int FIELD_DATEI6_NAME = 132;

  /** Dateityp 6, Text 4 */
  protected final static int FIELD_DATEI6_SUFFIX = 133;

  /** Dateityp 6, Text 4 */
  protected final static int FIELD_DATEI6_TYP = 134;

  /** Abspieldauer 6 in Sekunden, Zahl 5 (Für Video/Audio) */
  protected final static int FIELD_DATEI6_DAUER = 135;

  /** Text 6, Text 30 */
  protected final static int FIELD_DATEI6_TEXT = 136;


  /** Dateiname 7, Text 255 */
  protected final static int FIELD_DATEI7_NAME = 137;

  /** Dateityp 7, Text 4 */
  protected final static int FIELD_DATEI7_SUFFIX = 138;

  /** Dateityp 7, Text 4 */
  protected final static int FIELD_DATEI7_TYP = 139;

  /** Abspieldauer 7 in Sekunden, Zahl 5 (Für Video/Audio) */
  protected final static int FIELD_DATEI7_DAUER = 140;

  /** Text 7, Text 30 */
  protected final static int FIELD_DATEI7_TEXT = 141;


  /** Dateiname 8, Text 255 */
  protected final static int FIELD_DATEI8_NAME = 142;

  /** Dateityp 8, Text 4 */
  protected final static int FIELD_DATEI8_SUFFIX = 143;

  /** Dateityp 8, Text 4 */
  protected final static int FIELD_DATEI8_TYP = 144;

  /** Abspieldauer 8 in Sekunden, Zahl 5 (Für Video/Audio) */
  protected final static int FIELD_DATEI8_DAUER = 145;

  /** Text 8, Text 30 */
  protected final static int FIELD_DATEI8_TEXT = 146;


  /** Dateiname 9, Text 255 */
  protected final static int FIELD_DATEI9_NAME = 147;

  /** Dateityp 9, Text 4 */
  protected final static int FIELD_DATEI9_SUFFIX = 148;

  /** Dateityp 9, Text 4 */
  protected final static int FIELD_DATEI9_TYP = 149;

  /** Abspieldauer 9 in Sekunden, Zahl 5 (Für Video/Audio) */
  protected final static int FIELD_DATEI9_DAUER = 150;

  /** Text 9, Text 30 */
  protected final static int FIELD_DATEI9_TEXT = 151;


  /** Dateiname 10, Text 255 */
  protected final static int FIELD_DATEI10_NAME = 152;

  /** Dateityp 10, Text 4 */
  protected final static int FIELD_DATEI10_SUFFIX = 153;

  /** Dateityp 10, Text 4 */
  protected final static int FIELD_DATEI10_TYP = 154;

  /** Abspieldauer 10 in Sekunden, Zahl 5 (Für Video/Audio) */
  protected final static int FIELD_DATEI10_DAUER = 155;

  /** Text 10, Text 30 */
  protected final static int FIELD_DATEI10_TEXT = 156;


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

  public Datei getDatei( int i )
  {
    switch (i)
    {
      case 1:
        return this.getDatei1();
      case 2:
        return this.getDatei2();
      case 3:
        return this.getDatei3();
      case 4:
        return this.getDatei4();
      case 5:
        return this.getDatei5();
      case 6:
        return this.getDatei6();
      case 7:
        return this.getDatei7();
      case 8:
        return this.getDatei8();
      case 9:
        return this.getDatei9();
      case 10:
        return this.getDatei10();
      default:
        throw new IllegalArgumentException( "Unsupported file position " + i + "!" );
    }
  }

  public Datei getDatei1()
  {
    String file = this.get( FIELD_DATEI1_NAME );
    if (file==null) return null;

    Integer dauer = null;
    try
    {
      dauer = Is24CsvFormat.parseInteger(
        this.get( FIELD_DATEI1_DAUER ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read duration for file 1!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
    }

    return new Datei( file,
      DateiTyp.parse( this.get( FIELD_DATEI1_TYP ) ),
      DateiSuffix.parse( this.get( FIELD_DATEI1_SUFFIX ) ),
      this.get( FIELD_DATEI1_TEXT ),
      (dauer!=null)? dauer: 0
    );
  }

  public Datei getDatei2()
  {
    String file = this.get( FIELD_DATEI2_NAME );
    if (file==null) return null;

    Integer dauer = null;
    try
    {
      dauer = Is24CsvFormat.parseInteger(
        this.get( FIELD_DATEI2_DAUER ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read duration for file 2!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
    }

    return new Datei( file,
      DateiTyp.parse( this.get( FIELD_DATEI2_TYP ) ),
      DateiSuffix.parse( this.get( FIELD_DATEI2_SUFFIX ) ),
      this.get( FIELD_DATEI2_TEXT ),
      (dauer!=null)? dauer: 0
    );
  }

  public Datei getDatei3()
  {
    String file = this.get( FIELD_DATEI3_NAME );
    if (file==null) return null;

    Integer dauer = null;
    try
    {
      dauer = Is24CsvFormat.parseInteger(
        this.get( FIELD_DATEI3_DAUER ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read duration for file 3!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
    }

    return new Datei( file,
      DateiTyp.parse( this.get( FIELD_DATEI3_TYP ) ),
      DateiSuffix.parse( this.get( FIELD_DATEI3_SUFFIX ) ),
      this.get( FIELD_DATEI3_TEXT ),
      (dauer!=null)? dauer: 0
    );
  }

  public Datei getDatei4()
  {
    String file = this.get( FIELD_DATEI4_NAME );
    if (file==null) return null;

    Integer dauer = null;
    try
    {
      dauer = Is24CsvFormat.parseInteger(
        this.get( FIELD_DATEI4_DAUER ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read duration for file 4!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
    }

    return new Datei( file,
      DateiTyp.parse( this.get( FIELD_DATEI4_TYP ) ),
      DateiSuffix.parse( this.get( FIELD_DATEI4_SUFFIX ) ),
      this.get( FIELD_DATEI4_TEXT ),
      (dauer!=null)? dauer: 0
    );
  }

  public Datei getDatei5()
  {
    String file = this.get( FIELD_DATEI5_NAME );
    if (file==null) return null;

    Integer dauer = null;
    try
    {
      dauer = Is24CsvFormat.parseInteger(
        this.get( FIELD_DATEI5_DAUER ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read duration for file 5!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
    }

    return new Datei( file,
      DateiTyp.parse( this.get( FIELD_DATEI5_TYP ) ),
      DateiSuffix.parse( this.get( FIELD_DATEI5_SUFFIX ) ),
      this.get( FIELD_DATEI5_TEXT ),
      (dauer!=null)? dauer: 0
    );
  }

  public Datei getDatei6()
  {
    String file = this.get( FIELD_DATEI6_NAME );
    if (file==null) return null;

    Integer dauer = null;
    try
    {
      dauer = Is24CsvFormat.parseInteger(
        this.get( FIELD_DATEI6_DAUER ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read duration for file 6!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
    }

    return new Datei( file,
      DateiTyp.parse( this.get( FIELD_DATEI6_TYP ) ),
      DateiSuffix.parse( this.get( FIELD_DATEI6_SUFFIX ) ),
      this.get( FIELD_DATEI6_TEXT ),
      (dauer!=null)? dauer: 0
    );
  }

  public Datei getDatei7()
  {
    String file = this.get( FIELD_DATEI7_NAME );
    if (file==null) return null;

    Integer dauer = null;
    try
    {
      dauer = Is24CsvFormat.parseInteger(
        this.get( FIELD_DATEI7_DAUER ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read duration for file 7!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
    }

    return new Datei( file,
      DateiTyp.parse( this.get( FIELD_DATEI7_TYP ) ),
      DateiSuffix.parse( this.get( FIELD_DATEI7_SUFFIX ) ),
      this.get( FIELD_DATEI7_TEXT ),
      (dauer!=null)? dauer: 0
    );
  }

  public Datei getDatei8()
  {
    String file = this.get( FIELD_DATEI8_NAME );
    if (file==null) return null;

    Integer dauer = null;
    try
    {
      dauer = Is24CsvFormat.parseInteger(
        this.get( FIELD_DATEI8_DAUER ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read duration for file 8!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
    }

    return new Datei( file,
      DateiTyp.parse( this.get( FIELD_DATEI8_TYP ) ),
      DateiSuffix.parse( this.get( FIELD_DATEI8_SUFFIX ) ),
      this.get( FIELD_DATEI8_TEXT ),
      (dauer!=null)? dauer: 0
    );
  }

  public Datei getDatei9()
  {
    String file = this.get( FIELD_DATEI9_NAME );
    if (file==null) return null;

    Integer dauer = null;
    try
    {
      dauer = Is24CsvFormat.parseInteger(
        this.get( FIELD_DATEI9_DAUER ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read duration for file 9!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
    }

    return new Datei( file,
      DateiTyp.parse( this.get( FIELD_DATEI9_TYP ) ),
      DateiSuffix.parse( this.get( FIELD_DATEI9_SUFFIX ) ),
      this.get( FIELD_DATEI9_TEXT ),
      (dauer!=null)? dauer: 0
    );
  }

  public Datei getDatei10()
  {
    String file = this.get( FIELD_DATEI10_NAME );
    if (file==null) return null;

    Integer dauer = null;
    try
    {
      dauer = Is24CsvFormat.parseInteger(
        this.get( FIELD_DATEI10_DAUER ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read duration for file 10!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
    }

    return new Datei( file,
      DateiTyp.parse( this.get( FIELD_DATEI10_TYP ) ),
      DateiSuffix.parse( this.get( FIELD_DATEI10_SUFFIX ) ),
      this.get( FIELD_DATEI10_TEXT ),
      (dauer!=null)? dauer: 0
    );
  }

  public Datei[] getDateien()
  {
    List<Datei> dateien = new ArrayList<>();
    for (int i=1; i<=FILE_LIMIT; i++)
    {
      Datei datei = this.getDatei( i );
      if (datei!=null) dateien.add( datei );
    }
    return dateien.toArray( new Datei[dateien.size()] );
  }

  public Integer getGruppierungId()
  {
    try
    {
      return Is24CsvFormat.parseInteger(
        this.get( FIELD_GRUPPIERUNG_ID ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Gruppierung ID'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public Immobilienart getImmobilienart()
  {
    return Immobilienart.parse(
      this.get( FIELD_IMMOBILIENART ) );
  }

  public static Immobilienart getImmobilienart( CSVRecord record )
  {
    return Immobilienart.parse(
      record.get( FIELD_IMMOBILIENART ) );
  }

  public Importmodus getImportmodus()
  {
    return Importmodus.parse(
      this.get( FIELD_MODUS ) );
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
    return Objektdarstellung.parse(
      this.get( FIELD_OBJEKTDARSTELLUNG ) );
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
      LOGGER.warn( "Can't read currency '" + value + "'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return Currency.getInstance( "EUR" );
    }
  }

  public boolean isAdressdruck()
  {
    return Boolean.TRUE.equals( Is24CsvFormat.parseBoolean(
      this.get( FIELD_ADRESSDRUCK ) ) );
  }

  public boolean isAktiv()
  {
    String value = this.get( FIELD_STATUS );
    return !"0".equals( value );
  }

  public boolean isProvisionspflichtig()
  {
    return Boolean.TRUE.equals( Is24CsvFormat.parseBoolean(
      this.get( FIELD_PROVISIONPFLICHTIG ) ) );
  }

  @Override
  protected String parse( String value )
  {
    // replace <br> elements with native line separator in any parsed value
    value = StringUtils.trimToNull( value );
    if (value==null) return null;
    Matcher m = LINEBREAK.matcher( value );
    return (m.find())? m.replaceAll( System.lineSeparator() ): value;
  }

  public void setAdressdruck( boolean value )
  {
    this.setAdressdruck( Boolean.valueOf( value ) );
  }

  public void setAdressdruck( Boolean value )
  {
    this.set( FIELD_ADRESSDRUCK,
      Is24CsvFormat.printBoolean( (value!=null)? value: false ) );
  }

  public void setAktiv( boolean value )
  {
    this.setAktiv( Boolean.valueOf( value ) );
  }

  public void setAktiv( Boolean value )
  {
    this.set( FIELD_STATUS,
      (value || value==null)? "1": "0" );
  }

  public void setAnbieterObjektId( String value )
  {
    this.set( FIELD_ANBIETER_OBJEKT_ID,
      Is24CsvFormat.printString( value, 50 ) );
  }

  public void setApiSuchfeld1( String value )
  {
    this.set( FIELD_API_SUCHFELD1,
      Is24CsvFormat.printString( value, 10 ) );
  }

  public void setApiSuchfeld2( String value )
  {
    this.set( FIELD_API_SUCHFELD2,
      Is24CsvFormat.printString( value, 10 ) );
  }

  public void setApiSuchfeld3( String value )
  {
    this.set( FIELD_API_SUCHFELD3,
      Is24CsvFormat.printString( value, 10 ) );
  }

  public void setBeschreibungAusstattung( String value )
  {
    this.set( FIELD_BESCHREIBUNG_AUSSTATTUNG,
      Is24CsvFormat.printString( value, 2000 ) );
  }

  public void setBeschreibungLage( String value )
  {
    this.set( FIELD_BESCHREIBUNG_LAGE,
      Is24CsvFormat.printString( value, 2000 ) );
  }

  public void setBeschreibungObjekt( String value )
  {
    this.set( FIELD_BESCHREIBUNG_OBJEKT,
      Is24CsvFormat.printString( value, 2000 ) );
  }

  public void setBeschreibungSonstiges( String value )
  {
    this.set( FIELD_BESCHREIBUNG_SONSTIGES,
      Is24CsvFormat.printString( value, 2000 ) );
  }

  public void setDatei( Datei value, int i )
  {
    switch (i)
    {
      case 1:
        this.setDatei1( value );
        break;
      case 2:
        this.setDatei2( value );
        break;
      case 3:
        this.setDatei3( value );
        break;
      case 4:
        this.setDatei4( value );
        break;
      case 5:
        this.setDatei5( value );
        break;
      case 6:
        this.setDatei6( value );
        break;
      case 7:
        this.setDatei7( value );
        break;
      case 8:
        this.setDatei8( value );
        break;
      case 9:
        this.setDatei9( value );
        break;
      case 10:
        this.setDatei10( value );
        break;
      default:
        throw new IllegalArgumentException( "Unsupported file position " + i + "!" );
    }
  }

  public void setDatei1( Datei value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getName() ): null;
    this.set( FIELD_DATEI1_NAME, file );
    this.set( FIELD_DATEI1_TEXT, (value!=null && file!=null)?
      Is24CsvFormat.printString( value.getText(), 30 ): null );
    this.set( FIELD_DATEI1_TYP, (value!=null && value.getTyp()!=null && file!=null)?
      value.getTyp().print(): null );
    this.set( FIELD_DATEI1_SUFFIX, (value!=null && value.getSuffix()!=null && file!=null)?
      value.getSuffix().print(): null );
    this.set( FIELD_DATEI1_DAUER, (value!=null && file!=null)?
      Is24CsvFormat.printNumber( value.getAbspieldauer(), 5 ): null );
  }

  public void setDatei2( Datei value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getName() ): null;
    this.set( FIELD_DATEI2_NAME, file );
    this.set( FIELD_DATEI2_TEXT, (value!=null && file!=null)?
      Is24CsvFormat.printString( value.getText(), 30 ): null );
    this.set( FIELD_DATEI2_TYP, (value!=null && value.getTyp()!=null && file!=null)?
      value.getTyp().print(): null );
    this.set( FIELD_DATEI2_SUFFIX, (value!=null && value.getSuffix()!=null && file!=null)?
      value.getSuffix().print(): null );
    this.set( FIELD_DATEI2_DAUER, (value!=null && file!=null)?
      Is24CsvFormat.printNumber( value.getAbspieldauer(), 5 ): null );
  }

  public void setDatei3( Datei value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getName() ): null;
    this.set( FIELD_DATEI3_NAME, file );
    this.set( FIELD_DATEI3_TEXT, (value!=null && file!=null)?
      Is24CsvFormat.printString( value.getText(), 30 ): null );
    this.set( FIELD_DATEI3_TYP, (value!=null && value.getTyp()!=null && file!=null)?
      value.getTyp().print(): null );
    this.set( FIELD_DATEI3_SUFFIX, (value!=null && value.getSuffix()!=null && file!=null)?
      value.getSuffix().print(): null );
    this.set( FIELD_DATEI3_DAUER, (value!=null && file!=null)?
      Is24CsvFormat.printNumber( value.getAbspieldauer(), 5 ): null );
  }

  public void setDatei4( Datei value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getName() ): null;
    this.set( FIELD_DATEI4_NAME, file );
    this.set( FIELD_DATEI4_TEXT, (value!=null && file!=null)?
      Is24CsvFormat.printString( value.getText(), 30 ): null );
    this.set( FIELD_DATEI4_TYP, (value!=null && value.getTyp()!=null && file!=null)?
      value.getTyp().print(): null );
    this.set( FIELD_DATEI4_SUFFIX, (value!=null && value.getSuffix()!=null && file!=null)?
      value.getSuffix().print(): null );
    this.set( FIELD_DATEI4_DAUER, (value!=null && file!=null)?
      Is24CsvFormat.printNumber( value.getAbspieldauer(), 5 ): null );
  }

  public void setDatei5( Datei value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getName() ): null;
    this.set( FIELD_DATEI5_NAME, file );
    this.set( FIELD_DATEI5_TEXT, (value!=null && file!=null)?
      Is24CsvFormat.printString( value.getText(), 30 ): null );
    this.set( FIELD_DATEI5_TYP, (value!=null && value.getTyp()!=null && file!=null)?
      value.getTyp().print(): null );
    this.set( FIELD_DATEI5_SUFFIX, (value!=null && value.getSuffix()!=null && file!=null)?
      value.getSuffix().print(): null );
    this.set( FIELD_DATEI5_DAUER, (value!=null && file!=null)?
      Is24CsvFormat.printNumber( value.getAbspieldauer(), 5 ): null );
  }

  public void setDatei6( Datei value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getName() ): null;
    this.set( FIELD_DATEI6_NAME, file );
    this.set( FIELD_DATEI6_TEXT, (value!=null && file!=null)?
      Is24CsvFormat.printString( value.getText(), 30 ): null );
    this.set( FIELD_DATEI6_TYP, (value!=null && value.getTyp()!=null && file!=null)?
      value.getTyp().print(): null );
    this.set( FIELD_DATEI6_SUFFIX, (value!=null && value.getSuffix()!=null && file!=null)?
      value.getSuffix().print(): null );
    this.set( FIELD_DATEI6_DAUER, (value!=null && file!=null)?
      Is24CsvFormat.printNumber( value.getAbspieldauer(), 5 ): null );
  }

  public void setDatei7( Datei value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getName() ): null;
    this.set( FIELD_DATEI7_NAME, file );
    this.set( FIELD_DATEI7_TEXT, (value!=null && file!=null)?
      Is24CsvFormat.printString( value.getText(), 30 ): null );
    this.set( FIELD_DATEI7_TYP, (value!=null && value.getTyp()!=null && file!=null)?
      value.getTyp().print(): null );
    this.set( FIELD_DATEI7_SUFFIX, (value!=null && value.getSuffix()!=null && file!=null)?
      value.getSuffix().print(): null );
    this.set( FIELD_DATEI7_DAUER, (value!=null && file!=null)?
      Is24CsvFormat.printNumber( value.getAbspieldauer(), 5 ): null );
  }

  public void setDatei8( Datei value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getName() ): null;
    this.set( FIELD_DATEI8_NAME, file );
    this.set( FIELD_DATEI8_TEXT, (value!=null && file!=null)?
      Is24CsvFormat.printString( value.getText(), 30 ): null );
    this.set( FIELD_DATEI8_TYP, (value!=null && value.getTyp()!=null && file!=null)?
      value.getTyp().print(): null );
    this.set( FIELD_DATEI8_SUFFIX, (value!=null && value.getSuffix()!=null && file!=null)?
      value.getSuffix().print(): null );
    this.set( FIELD_DATEI8_DAUER, (value!=null && file!=null)?
      Is24CsvFormat.printNumber( value.getAbspieldauer(), 5 ): null );
  }

  public void setDatei9( Datei value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getName() ): null;
    this.set( FIELD_DATEI9_NAME, file );
    this.set( FIELD_DATEI9_TEXT, (value!=null && file!=null)?
      Is24CsvFormat.printString( value.getText(), 30 ): null );
    this.set( FIELD_DATEI9_TYP, (value!=null && value.getTyp()!=null && file!=null)?
      value.getTyp().print(): null );
    this.set( FIELD_DATEI9_SUFFIX, (value!=null && value.getSuffix()!=null && file!=null)?
      value.getSuffix().print(): null );
    this.set( FIELD_DATEI9_DAUER, (value!=null && file!=null)?
      Is24CsvFormat.printNumber( value.getAbspieldauer(), 5 ): null );
  }

  public void setDatei10( Datei value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getName() ): null;
    this.set( FIELD_DATEI10_NAME, file );
    this.set( FIELD_DATEI10_TEXT, (value!=null && file!=null)?
      Is24CsvFormat.printString( value.getText(), 30 ): null );
    this.set( FIELD_DATEI10_TYP, (value!=null && value.getTyp()!=null && file!=null)?
      value.getTyp().print(): null );
    this.set( FIELD_DATEI10_SUFFIX, (value!=null && value.getSuffix()!=null && file!=null)?
      value.getSuffix().print(): null );
    this.set( FIELD_DATEI10_DAUER, (value!=null && file!=null)?
      Is24CsvFormat.printNumber( value.getAbspieldauer(), 5 ): null );
  }

  public void setDateien( Iterable<Datei> values )
  {
    int pos = 1;
    if (values!=null)
    {
      for (Datei value : values)
      {
        this.setDatei( value, pos );
        pos++;
        if (pos>FILE_LIMIT) break;
      }
    }
    for (int i=pos; i<=FILE_LIMIT; i++)
    {
      this.setDatei( null, i );
    }
  }

  public void setGruppierungId( Number value )
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
      Is24CsvFormat.printString( value, 20 ) );
  }

  public void setKontaktEmail( String value )
  {
    this.set( FIELD_KONTAKT_EMAIL,
      Is24CsvFormat.printString( value, 150 ) );
  }

  public void setKontaktHausNr( String value )
  {
    this.set( FIELD_KONTAKT_HAUSNR,
      Is24CsvFormat.printString( value, 30 ) );
  }

  public void setKontaktLand( String value )
  {
    this.set( FIELD_KONTAKT_LAND,
      StringUtils.defaultIfBlank( Is24CsvFormat.getCountryCode( value ), Locale.GERMANY.getISO3Country() ) );
  }

  public void setKontaktMobiltelefon( String value )
  {
    this.set( FIELD_KONTAKT_MOBILTELEFON,
      Is24CsvFormat.printString( value, 40 ) );
  }

  public void setKontaktNachname( String value )
  {
    this.set( FIELD_KONTAKT_NACHNAME,
      Is24CsvFormat.printString( value, 50 ) );
  }

  public void setKontaktOrt( String value )
  {
    this.set( FIELD_KONTAKT_ORT,
      Is24CsvFormat.printString( value, 50 ) );
  }

  public void setKontaktPlz( String value )
  {
    this.set( FIELD_KONTAKT_PLZ,
      Is24CsvFormat.printString( value, 20 ) );
  }

  public void setKontaktStrasse( String value )
  {
    this.set( FIELD_KONTAKT_STRASSE,
      Is24CsvFormat.printString( value, 100 ) );
  }

  public void setKontaktTelefax( String value )
  {
    this.set( FIELD_KONTAKT_TELEFAX,
      Is24CsvFormat.printString( value, 40 ) );
  }

  public void setKontaktTelefon( String value )
  {
    this.set( FIELD_KONTAKT_TELEFON,
      Is24CsvFormat.printString( value, 40 ) );
  }

  public void setKontaktVorname( String value )
  {
    this.set( FIELD_KONTAKT_VORNAME,
      Is24CsvFormat.printString( value, 30 ) );
  }

  public void setKontaktWebseite( String value )
  {
    this.set( FIELD_KONTAKT_WEBSEITE,
      Is24CsvFormat.printString( value, 300 ) );
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
      Is24CsvFormat.printString( value, 30 ) );
  }

  public void setInternationaleRegion( String value )
  {
    this.set( FIELD_OBJEKT_INTERNATIONALE_REGION,
      Is24CsvFormat.printString( value, 100 ) );
  }

  public void setObjektLand( String value )
  {
    this.set( FIELD_OBJEKT_LAND,
      StringUtils.defaultIfBlank( Is24CsvFormat.getCountryCode( value ), Locale.GERMANY.getISO3Country() ) );
  }

  public void setObjektOrt( String value )
  {
    this.set( FIELD_OBJEKT_ORT,
      Is24CsvFormat.printString( value, 50 ) );
  }

  public void setObjektPlz( String value )
  {
    this.set( FIELD_OBJEKT_PLZ,
      Is24CsvFormat.printString( value, 20 ) );
  }

  public void setObjektStrasse( String value )
  {
    this.set( FIELD_OBJEKT_STRASSE,
      Is24CsvFormat.printString( value, 100 ) );
  }

  public void setProvision( String value )
  {
    this.set( FIELD_PROVISION,
      Is24CsvFormat.printString( value, 50 ) );
  }

  public void setProvisionpflichtig( boolean value )
  {
    this.setProvisionpflichtig( Boolean.valueOf( value ) );
  }

  public void setProvisionpflichtig( Boolean value )
  {
    this.set( FIELD_PROVISIONPFLICHTIG,
      Is24CsvFormat.printBoolean( (value!=null)? value: false ) );
  }

  public void setProvisionshinweis( String value )
  {
    this.set( FIELD_PROVISIONSHINWEIS,
      Is24CsvFormat.printString( value, 200 ) );
  }

  public void setScoutKundenId( String value )
  {
    this.set( FIELD_SCOUT_KUNDEN_ID,
      Is24CsvFormat.printString( value, 15 ) );
  }

  public void setScoutObjektId( String value )
  {
    this.set( FIELD_SCOUT_OBJEKT_ID,
      Is24CsvFormat.printString( value, 20 ) );
  }

  public void setTermsRegion( String value )
  {
    this.set( FIELD_TERMS_REGION,
      Is24CsvFormat.printString( value, 50 ) );
  }

  public void setTermsStadt( String value )
  {
    this.set( FIELD_TERMS_STADT,
      Is24CsvFormat.printString( value, 50 ) );
  }

  public void setTermsStadtteil( String value )
  {
    this.set( FIELD_TERMS_STADTTEIL,
      Is24CsvFormat.printString( value, 50 ) );
  }

  public void setUeberschrift( String value )
  {
    this.set( FIELD_UEBERSCHRIFT,
      Is24CsvFormat.printString( value, 100 ) );
  }

  public void setWaehrung( Currency value )
  {
    this.set( FIELD_WAEHRUNG,
      (value!=null)? value.getCurrencyCode(): "EUR" );
  }
}