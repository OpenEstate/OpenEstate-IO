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

package org.openestate.io.idx;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.lang3.StringUtils;
import org.openestate.io.core.CsvRecord;
import org.openestate.io.idx.types.GrossPremium;
import org.openestate.io.idx.types.Language;
import org.openestate.io.idx.types.Media;
import org.openestate.io.idx.types.ObjectCategory;
import org.openestate.io.idx.types.ObjectType;
import org.openestate.io.idx.types.OfferType;
import org.openestate.io.idx.types.PriceUnit;
import org.openestate.io.idx.types.Salutation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * IdxRecord
 *
 * @author Andreas Rudolph
 */
public class IdxRecord extends CsvRecord
{
  private final static Logger LOGGER = LoggerFactory.getLogger( IdxRecord.class );
  protected final static String VERSION = "IDX" + IdxFormat.VERSION;
  protected final static int LENGTH = 183;


  /**
   * general fields
   */

  /** Version, str(50) */
  protected final static int FIELD_VERSION = 0;

  /** Software-Kennung, str(50) */
  protected final static int FIELD_SENDER_ID = 1;

  /** letzte Änderung, datetime(DD.MM.YYYY HH:mm:ss) */
  protected final static int FIELD_LAST_MODIFIED = 177;

  /** vom Portal vergebene ID, str(200) */
  protected final static int FIELD_ADVERTISEMENT_ID = 178;

  /** Platzhalter 1 */
  protected final static int FIELD_SPAREFIELD_1 = 179;

  /** Platzhalter 2 */
  protected final static int FIELD_SPAREFIELD_2 = 180;

  /** Platzhalter 3 */
  protected final static int FIELD_SPAREFIELD_3 = 181;

  /** Platzhalter 4 */
  protected final static int FIELD_SPAREFIELD_4 = 182;


  /**
   * fields for the property
   */

  /** Objekt-Kategorie, str(25) */
  protected final static int FIELD_OBJECT_CATEGORY = 2;

  /** Objekt-Typ, int(3) */
  protected final static int FIELD_OBJECT_TYPE = 3;

  /** Objekt-Vermarktung, str(200) */
  protected final static int FIELD_OFFER_TYPE = 4;

  /** Liegenschaftsreferenz, str(80) */
  protected final static int FIELD_REF_PROPERTY = 5;

  /** Hausreferenz, str(80) */
  protected final static int FIELD_REF_HOUSE = 6;

  /** Objektreferenz, str(80) */
  protected final static int FIELD_REF_OBJECT = 7;

  /** Straße, str(200) */
  protected final static int FIELD_OBJECT_STREET = 8;

  /** PLZ, str(10) */
  protected final static int FIELD_OBJECT_ZIP = 9;

  /** Ort, str(200) */
  protected final static int FIELD_OBJECT_CITY = 10;

  /** Bundesland/Kanton, str(2) */
  protected final static int FIELD_OBJECT_STATE = 11;

  /** Land, str(2) */
  protected final static int FIELD_OBJECT_COUNTRY = 12;

  /** Region, str(200) */
  //protected final static int FIELD_REGION = 13;

  /** Anmerkung zur Lage / Situationsbeschrieb, str(50) */
  protected final static int FIELD_OBJECT_SITUATION = 14;

  /** Verfügbar ab, date(DD.MM.YYYY) */
  protected final static int FIELD_AVAILABLE_FROM = 15;

  /** Objekt-Titel, str(70) */
  protected final static int FIELD_OBJECT_TITLE = 16;

  /** Objekt-Beschreibung, str(4000) */
  protected final static int FIELD_OBJECT_DESCRIPTION = 17;

  /** Kaufpreis / Gesamtmiete, int(10) (aufgerundet) */
  protected final static int FIELD_SELLING_PRICE = 18;

  /** Pauschalmiete, int(10) (aufgerundet) */
  protected final static int FIELD_RENT_NET = 19;

  /** Nebenkosten, int(10) (aufgerundet) */
  protected final static int FIELD_RENT_EXTRA = 20;

  /** Preiseinheit, str(10) */
  protected final static int FIELD_PRICE_UNIT = 21;

  /** Währung, str(3) */
  protected final static int FIELD_CURRENCY = 22;

  /** Bruttorendite, str(19) (offer_type=SALE & Category=HOUSE & Type=7 only) */
  protected final static int FIELD_GROSS_PREMIUM = 23;

  /** Etage, int(6) */
  protected final static int FIELD_FLOOR = 24;

  /** Zimmerzahl, int(5,1) */
  protected final static int FIELD_NUMBER_OF_ROOMS = 25;

  /** Wohnungszahl, int(5,1) */
  protected final static int FIELD_NUMBER_OF_APARTMENTS = 26;

  /** Wohnfläche, int(10) */
  protected final static int FIELD_SURFACE_LIVING = 27;

  /** Gesamt / Grundstücksfläche, int(10) */
  protected final static int FIELD_SURFACE_PROPERTY = 28;

  /** Nutzfläche, int(10) */
  protected final static int FIELD_SURFACE_USABLE = 29;

  /** Volumen, int(10) */
  protected final static int FIELD_VOLUME = 30;

  /** Baujahr, int(4) */
  protected final static int FIELD_YEAR_BUILT = 31;

  /** Aussicht ???, str(1) */
  protected final static int FIELD_VIEW = 32;

  /** Kamin/Feuerstelle, str(1) */
  protected final static int FIELD_FIREPLACE = 33;

  /** Kabel-TV, str(1) */
  protected final static int FIELD_CABLETV = 34;

  /** Fahrstuhl, str(1) */
  protected final static int FIELD_ELEVATOR = 35;

  /** kinderfeundlich, str(1) */
  protected final static int FIELD_CHILD_FRIENDLY = 36;

  /** Parkmöglichkeit, str(1) */
  protected final static int FIELD_PARKING = 37;

  /** Garage, str(1) */
  protected final static int FIELD_GARAGE = 38;

  /** Balkon, str(1) */
  protected final static int FIELD_BALCONY = 39;

  /** Dachboden, str(1) */
  //protected final static int FIELD_ROOF_FLOOR = 40;

  /** Distanz zum ÖPNV in Meter, int(5) (1min = 50meter) */
  protected final static int FIELD_DISTANCE_PUBLIC_TRANSPORT = 41;

  /** Distanz zur Einkaufsmöglichkeit in Meter, int(5) (1min = 50meter) */
  protected final static int FIELD_DISTANCE_SHOP = 42;

  /** Distanz zum Kindergarten in Meter, int(5) (1min = 50meter) */
  protected final static int FIELD_DISTANCE_KINDERGARTEN = 43;

  /** Distanz zur Primarschule in Meter, int(5) (1min = 50meter) */
  protected final static int FIELD_DISTANCE_SCHOOL1 = 44;

  /** Distanz zur Oberstufe in Meter, int(5) (1min = 50meter) */
  protected final static int FIELD_DISTANCE_SCHOOL2 = 45;

  /** URL, str(200) */
  protected final static int FIELD_URL = 67;

  /** Veröffentlichung bis, date(DD.MM.YYYY) */
  //protected final static int FIELD_PUBLISH_UNTIL = 85;

  /** ???, str(200) */
  //protected final static int FIELD_DESTINATION = 86;

  /** Distanz zur Autobahn in Meter, int(5) (1min = 50meter) */
  protected final static int FIELD_DISTANCE_MOTORWAY = 108;

  /** Deckenhöhe in Meter, int(10,2) */
  protected final static int FIELD_CEILING_HEIGHT = 109;

  /** Hallenhöhe in Meter, int(10,2) */
  protected final static int FIELD_HALL_HEIGHT = 110;

  /** max. Bodenlast in kg/m², int(10,1) */
  protected final static int FIELD_MAXIMAL_FLOOR_LOADING = 111;

  /** max. Kranlast in kg, int(10,1) */
  protected final static int FIELD_CARRYING_CAPACITY_CRANE = 112;

  /** max. Fahrstuhllast in kg, int(10,1) */
  protected final static int FIELD_CARRYING_CAPACITY_ELEVATOR = 113;

  /** ISDN-Anschluss, str(1) */
  protected final static int FIELD_ISDN = 114;

  /** Rollstuhl geeignet, str(1) */
  protected final static int FIELD_WHEELCHAIR_ACCESSIBLE = 115;

  /** Tiere erlaubt, str(1) */
  protected final static int FIELD_ANIMAL_ALLOWED = 116;

  /** Rampe, str(1) */
  protected final static int FIELD_RAMP = 117;

  /** Hebebühne, str(1) */
  protected final static int FIELD_LIFTING_PLATFORM = 118;

  /** Bahn-Anschluss, str(1) */
  protected final static int FIELD_RAILWAY_TERMINAL = 119;

  /** Toilette, str(1) */
  protected final static int FIELD_RESTROOMS = 120;

  /** Wasseranschluss, str(1) */
  protected final static int FIELD_WATER_SUPPLY = 121;

  /** Abwasseranschluss, str(1) */
  protected final static int FIELD_SEWAGE_SUPPLY = 122;

  /** Stromanschluss, str(1) */
  protected final static int FIELD_POWER_SUPPLY = 123;

  /** Gasanschluss, str(1) */
  protected final static int FIELD_GAS_SUPPLY = 124;

  /** Informationen zur Gemeinde, str(1) */
  //protected final static int FIELD_MUNICIPAL_INFO = 125;

  /** Homegate-URL, str(100) */
  protected final static int FIELD_OWN_OBJECT_URL = 126;

  /** Veröffentlichungs-ID ???, int(10) */
  protected final static int FIELD_PUBLISHING_ID = 140;

  /** Weiterleitungs-ID ???, int(10) */
  protected final static int FIELD_DELIVERY_ID = 141;

  /** Gemeinschaftsgeschäft, Provisionsteilung, int(1) */
  //protected final static int FIELD_COMMISSION_SHARING = 158;

  /** Gemeinschaftsgeschäft, Eigenanteil der Provision, str(10) */
  //protected final static int FIELD_COMMISSION_OWN = 159;

  /** Gemeinschaftsgeschäft, Partner, str(10) */
  //protected final static int FIELD_COMMISSION_PARTNER = 160;

  /** Etagenzahl, int(2) */
  protected final static int FIELD_NUMBER_OF_FLOORS = 162;

  /** Renovierungsjahr, int(4) */
  protected final static int FIELD_YEAR_RENOVATED = 163;

  /** WG, str(1) */
  protected final static int FIELD_FLAT_SHARING_COMMUNITY = 164;

  /** Eckhaus, str(1) */
  protected final static int FIELD_CORNER_HOUSE = 165;

  /** Mittelhaus, str(1) */
  protected final static int FIELD_MIDDLE_HOUSE = 166;

  /** Bauland erschlossen, str(1) */
  protected final static int FIELD_BUILDING_LAND_CONNECTED = 167;

  /** inkl. Gartenhaus, str(1) */
  protected final static int FIELD_GARDENHOUSE = 168;

  /** Hochparterre, str(1) */
  protected final static int FIELD_RAISED_GROUND_FLOOR = 169;

  /** Neubau, str(1) */
  protected final static int FIELD_NEW_BUILDING = 170;

  /** Altbau, str(1) */
  protected final static int FIELD_OLD_BUILDING = 171;

  /** Im Baurecht, str(1) */
  protected final static int FIELD_UNDER_BUILDING_LAWS = 172;

  /** überdacht, str(1) */
  protected final static int FIELD_UNDER_ROOF = 173;

  /** Swimmingpool, str(1) */
  protected final static int FIELD_SWIMMINGPOOL = 174;

  /** Energiehaus-Bauweise, str(1) */
  protected final static int FIELD_MINENERGY_GENERAL = 175;

  /** zertifiziertes Energiehaus, str(1) */
  protected final static int FIELD_MINENERGY_CERTIFIED = 176;


  /**
   * fields for the agency
   */

  /** Anbieter-ID, str(10) */
  protected final static int FIELD_AGENCY_ID = 68;

  /** Anbieter-Name, str(200) */
  protected final static int FIELD_AGENCY_NAME = 69;

  /** Anbieter-Name 2, str(255) */
  protected final static int FIELD_AGENCY_NAME2 = 70;

  /** Anbieter-Kontaktperson ???, str(200) */
  protected final static int FIELD_AGENCY_REFERENCE = 71;

  /** Anbieter-Straße, str(200) */
  protected final static int FIELD_AGENCY_STREET = 72;

  /** Anbieter-PLZ ???, str(200) */
  protected final static int FIELD_AGENCY_ZIP = 73;

  /** Anbieter-Ort, str(200) */
  protected final static int FIELD_AGENCY_CITY = 74;

  /** Anbieter-Land, str(2) */
  protected final static int FIELD_AGENCY_COUNTRY = 75;

  /** Anbieter-Telefon, str(200) */
  protected final static int FIELD_AGENCY_PHONE = 76;

  /** Anbieter-Mobiltelefon, str(200) */
  //protected final static int FIELD_AGENCY_MOBILE = 77;

  /** Anbieter-Fax, str(200) */
  protected final static int FIELD_AGENCY_FAX = 78;

  /** Anbieter-Mail, str(200) */
  protected final static int FIELD_AGENCY_EMAIL = 79;

  /** Anbieter-Logo, str(200) */
  //protected final static int FIELD_AGENCY_LOGO = 80;

  /** Anbieter-Logo 2, str(200) */
  //protected final static int FIELD_AGENCY_LOGO2 = 161;


  /**
   * fields for the contact person
   */

  /** Besucherkontakt-Name, str(200) */
  protected final static int FIELD_VISIT_NAME = 81;

  /** Besucherkontakt-Telefon, str(200) */
  protected final static int FIELD_VISIT_PHONE = 82;

  /** Besucherkontakt-Mail, str(200) */
  //protected final static int FIELD_VISIT_EMAIL = 83;

  /** Besucherkontakt-Notiz, str(200) */
  protected final static int FIELD_VISIT_REMARK = 84;


  /**
   * fields for attachments
   */

  /** Bild 1, Datei, str(200) (*.jpg, *.jpeg, *.gif) */
  protected final static int FIELD_PICTURE_1_FILE = 46;

  /** Bild 1, Titel, str(200) */
  protected final static int FIELD_PICTURE_1_TITLE = 51;

  /** Bild 1, Beschreibung, str(1800) */
  protected final static int FIELD_PICTURE_1_TEXT = 56;

  /** Bild 1, URL, str(200) */
  protected final static int FIELD_PICTURE_1_URL = 99;

  /** Bild 2, Datei, str(200) (*.jpg, *.jpeg, *.gif) */
  protected final static int FIELD_PICTURE_2_FILE = 47;

  /** Bild 2, Titel, str(200) */
  protected final static int FIELD_PICTURE_2_TITLE = 52;

  /** Bild 2, Beschreibung, str(1800) */
  protected final static int FIELD_PICTURE_2_TEXT = 57;

  /** Bild 2, URL, str(200) */
  protected final static int FIELD_PICTURE_2_URL = 100;

  /** Bild 3, Datei, str(200) (*.jpg, *.jpeg, *.gif) */
  protected final static int FIELD_PICTURE_3_FILE = 48;

  /** Bild 3, Titel, str(200) */
  protected final static int FIELD_PICTURE_3_TITLE = 53;

  /** Bild 3, Beschreibung, str(1800) */
  protected final static int FIELD_PICTURE_3_TEXT = 58;

  /** Bild 3, URL, str(200) */
  protected final static int FIELD_PICTURE_3_URL = 101;

  /** Bild 4, Datei, str(200) (*.jpg, *.jpeg, *.gif) */
  protected final static int FIELD_PICTURE_4_FILE = 49;

  /** Bild 4, Titel, str(200) */
  protected final static int FIELD_PICTURE_4_TITLE = 54;

  /** Bild 4, Beschreibung, str(1800) */
  protected final static int FIELD_PICTURE_4_TEXT = 59;

  /** Bild 4, URL, str(200) */
  protected final static int FIELD_PICTURE_4_URL = 102;

  /** Bild 5, Datei, str(200) (*.jpg, *.jpeg, *.gif) */
  protected final static int FIELD_PICTURE_5_FILE = 50;

  /** Bild 5, Titel, str(200) */
  protected final static int FIELD_PICTURE_5_TITLE = 55;

  /** Bild 5, Beschreibung, str(1800) */
  protected final static int FIELD_PICTURE_5_TEXT = 60;

  /** Bild 5, URL, str(200) */
  protected final static int FIELD_PICTURE_5_URL = 103;

  /** Bild 6, Datei, str(200) (*.jpg, *.jpeg, *.gif) */
  protected final static int FIELD_PICTURE_6_FILE = 87;

  /** Bild 6, Titel, str(200) */
  protected final static int FIELD_PICTURE_6_TITLE = 91;

  /** Bild 6, Beschreibung, str(1800) */
  protected final static int FIELD_PICTURE_6_TEXT = 95;

  /** Bild 6, URL, str(200) */
  protected final static int FIELD_PICTURE_6_URL = 104;

  /** Bild 7, Datei, str(200) (*.jpg, *.jpeg, *.gif) */
  protected final static int FIELD_PICTURE_7_FILE = 88;

  /** Bild 7, Titel, str(200) */
  protected final static int FIELD_PICTURE_7_TITLE = 92;

  /** Bild 7, Beschreibung, str(1800) */
  protected final static int FIELD_PICTURE_7_TEXT = 96;

  /** Bild 7, URL, str(200) */
  protected final static int FIELD_PICTURE_7_URL = 105;

  /** Bild 8, Datei, str(200) (*.jpg, *.jpeg, *.gif) */
  protected final static int FIELD_PICTURE_8_FILE = 89;

  /** Bild 8, Titel, str(200) */
  protected final static int FIELD_PICTURE_8_TITLE = 93;

  /** Bild 8, Beschreibung, str(1800) */
  protected final static int FIELD_PICTURE_8_TEXT = 97;

  /** Bild 8, URL, str(200) */
  protected final static int FIELD_PICTURE_8_URL = 106;

  /** Bild 9, Datei, str(200) (*.jpg, *.jpeg, *.gif) */
  protected final static int FIELD_PICTURE_9_FILE = 90;

  /** Bild 9, Titel, str(200) */
  protected final static int FIELD_PICTURE_9_TITLE = 94;

  /** Bild 9, Beschreibung, str(1800) */
  protected final static int FIELD_PICTURE_9_TEXT = 98;

  /** Bild 9, URL, str(200) */
  protected final static int FIELD_PICTURE_9_URL = 107;

  /** Bild 10, Datei, str(200) (*.jpg, *.jpeg, *.gif) */
  protected final static int FIELD_PICTURE_10_FILE = 142;

  /** Bild 10, Titel, str(200) */
  protected final static int FIELD_PICTURE_10_TITLE = 146;

  /** Bild 10, Beschreibung, str(1800) */
  protected final static int FIELD_PICTURE_10_TEXT = 150;

  /** Bild 10, URL, str(200) */
  protected final static int FIELD_PICTURE_10_URL = 154;

  /** Bild 11, Datei, str(200) (*.jpg, *.jpeg, *.gif) */
  protected final static int FIELD_PICTURE_11_FILE = 143;

  /** Bild 11, Titel, str(200) */
  protected final static int FIELD_PICTURE_11_TITLE = 147;

  /** Bild 11, Beschreibung, str(1800) */
  protected final static int FIELD_PICTURE_11_TEXT = 151;

  /** Bild 11, URL, str(200) */
  protected final static int FIELD_PICTURE_11_URL = 155;

  /** Bild 12, Datei, str(200) (*.jpg, *.jpeg, *.gif) */
  protected final static int FIELD_PICTURE_12_FILE = 144;

  /** Bild 12, Titel, str(200) */
  protected final static int FIELD_PICTURE_12_TITLE = 148;

  /** Bild 12, Beschreibung, str(1800) */
  protected final static int FIELD_PICTURE_12_TEXT = 152;

  /** Bild 12, URL, str(200) */
  protected final static int FIELD_PICTURE_12_URL = 156;

  /** Bild 13, Datei, str(200) (*.jpg, *.jpeg, *.gif) */
  protected final static int FIELD_PICTURE_13_FILE = 145;

  /** Bild 13, Titel, str(200) */
  protected final static int FIELD_PICTURE_13_TITLE = 149;

  /** Bild 13, Beschreibung, str(1800) */
  protected final static int FIELD_PICTURE_13_TEXT = 153;

  /** Bild 13, URL, str(200) */
  protected final static int FIELD_PICTURE_13_URL = 157;

  /** Video, Datei, str(200) (*.mov, *.avi, *.rpm, *.mpeg, *.mpg, *.wmv, *.mp4, *.flv) */
  protected final static int FIELD_MOVIE_FILE = 61;

  /** Video, Titel, str(200) */
  protected final static int FIELD_MOVIE_TITLE = 62;

  /** Video, Beschreibung, str(1800) */
  //protected final static int FIELD_MOVIE_TEXT = 63;

  /** Dokument, Datei, str(200) (*.pdf, *.rtf, *.doc) */
  protected final static int FIELD_DOCUMENT_FILE = 64;

  /** Dokument, Titel, str(200) */
  protected final static int FIELD_DOCUMENT_TITLE = 65;

  /** Dokument, Beschreibung, str(1800) */
  //protected final static int FIELD_DOCUMENT_TEXT = 66;


  /**
   * fields for billing
   */

  /** Rechnungsadresse, Anrede, int(1) */
  protected final static int FIELD_BILLING_SALUTATION = 127;

  /** Rechnungsadresse, Vorname, str(200) */
  protected final static int FIELD_BILLING_FIRST_NAME = 128;

  /** Rechnungsadresse, Nachname, str(200) */
  protected final static int FIELD_BILLING_NAME = 129;

  /** Rechnungsadresse, Firma, str(200) */
  protected final static int FIELD_BILLING_COMPANY = 130;

  /** Rechnungsadresse, Straße, str(200) */
  protected final static int FIELD_BILLING_STREET = 131;

  /** Rechnungsadresse, Straße 2, str(200) */
  protected final static int FIELD_BILLING_POST_BOX = 132;

  /** Rechnungsadresse, PLZ, str(10) */
  protected final static int FIELD_BILLING_ZIP = 133;

  /** Rechnungsadresse, Ort, str(200) */
  protected final static int FIELD_BILLING_PLACE_NAME = 134;

  /** Rechnungsadresse, Land, str(200) */
  protected final static int FIELD_BILLING_COUNTRY = 135;

  /** Rechnungsadresse, Telefon, str(200) */
  protected final static int FIELD_BILLING_PHONE = 136;

  /** Rechnungsadresse, Telefon 2, str(200) */
  protected final static int FIELD_BILLING_PHONE2 = 137;

  /** Rechnungsadresse, Mobiltelefon, str(200) */
  protected final static int FIELD_BILLING_MOBILE = 138;

  /** Rechnungsadresse, Sprache, int(1) */
  protected final static int FIELD_BILLING_LANGUAGE = 139;


  public IdxRecord()
  {
    super();
    this.set( FIELD_VERSION, VERSION );
  }

  public String getAdvertisementId()
  {
    return this.get( FIELD_ADVERTISEMENT_ID );
  }

  public String getAgencyCity()
  {
    return this.get( FIELD_AGENCY_CITY );
  }

  public String getAgencyCountry()
  {
    return this.get( FIELD_AGENCY_COUNTRY );
  }

  public String getAgencyEmail()
  {
    return this.get( FIELD_AGENCY_EMAIL );
  }

  public String getAgencyFax()
  {
    return this.get( FIELD_AGENCY_FAX );
  }

  public String getAgencyId()
  {
    return this.get( FIELD_AGENCY_ID );
  }

  /*public String getAgencyLogo()
  {
    return this.get( FIELD_AGENCY_LOGO );
  }*/

  /*public String getAgencyLogo2()
  {
    return this.get( FIELD_AGENCY_LOGO2 );
  }*/

  /*public String getAgencyMobile()
  {
    return this.get( FIELD_AGENCY_MOBILE );
  }*/

  public String getAgencyName()
  {
    return this.get( FIELD_AGENCY_NAME );
  }

  public String getAgencyName2()
  {
    return this.get( FIELD_AGENCY_NAME2 );
  }

  public String getAgencyPhone()
  {
    return this.get( FIELD_AGENCY_PHONE );
  }

  public String getAgencyReference()
  {
    return this.get( FIELD_AGENCY_REFERENCE );
  }

  public String getAgencyStreet()
  {
    return this.get( FIELD_AGENCY_STREET );
  }

  public String getAgencyZip()
  {
    return this.get( FIELD_AGENCY_ZIP );
  }

  @Override
  protected Boolean getAsBoolean( int pos, Boolean defaultValue )
  {
    String value = this.get( pos );
    return (value!=null)? IdxFormat.parseBoolean( value ): defaultValue;
  }

  @Override
  protected Double getAsDouble( int pos, Double defaultValue ) throws NumberFormatException
  {
    String value = this.get( pos );
    try
    {
      return (value!=null)?
        IdxFormat.parseNumber( value, false ).doubleValue(): defaultValue;
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
        IdxFormat.parseNumber( value, false ).floatValue(): defaultValue;
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
        IdxFormat.parseNumber( value, true ).intValue(): defaultValue;
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
        IdxFormat.parseNumber( value, true ).longValue(): defaultValue;
    }
    catch (ParseException ex)
    {
      throw new NumberFormatException( "Can't read value '" + value + "' as long!" );
    }
  }

  public Calendar getAvailableFrom()
  {
    try
    {
      return IdxFormat.parseDateAsCalendar( this.get( FIELD_AVAILABLE_FROM ) );
    }
    catch (ParseException ex)
    {
      LOGGER.warn( "Can't read availability date "
        + "from '" + this.get( FIELD_AVAILABLE_FROM ) + "'!" );
      return null;
    }
  }

  public String getBillingCompany()
  {
    return this.get( FIELD_BILLING_COMPANY );
  }

  public String getBillingCountry()
  {
    return this.get( FIELD_BILLING_COUNTRY );
  }

  public String getBillingFirstName()
  {
    return this.get( FIELD_BILLING_FIRST_NAME );
  }

  public Language getBillingLanguage()
  {
    return Language.parse( this.get( FIELD_BILLING_LANGUAGE ) );
  }

  public String getBillingMobile()
  {
    return this.get( FIELD_BILLING_MOBILE );
  }

  public String getBillingName()
  {
    return this.get( FIELD_BILLING_NAME );
  }

  public String getBillingPlaceName()
  {
    return this.get( FIELD_BILLING_PLACE_NAME );
  }

  public String getBillingPhone()
  {
    return this.get( FIELD_BILLING_PHONE );
  }

  public String getBillingPhone2()
  {
    return this.get( FIELD_BILLING_PHONE2 );
  }

  public String getBillingPostBox()
  {
    return this.get( FIELD_BILLING_POST_BOX );
  }

  public Salutation getBillingSalutation()
  {
    return Salutation.parse( this.get( FIELD_BILLING_SALUTATION ) );
  }

  public String getBillingStreet()
  {
    return this.get( FIELD_BILLING_STREET );
  }

  public String getBillingZip()
  {
    return this.get( FIELD_BILLING_ZIP );
  }

  public Double getCarryingCapacityCrane()
  {
    try
    {
      return this.getAsDouble( FIELD_CARRYING_CAPACITY_CRANE );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read carrying capacity for the crane "
        + "from '" + this.get( FIELD_CARRYING_CAPACITY_CRANE ) + "'!" );
      return null;
    }
  }

  public Double getCarryingCapacityElevator()
  {
    try
    {
      return this.getAsDouble( FIELD_CARRYING_CAPACITY_ELEVATOR );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read carrying capacity for the elevator "
        + "from '" + this.get( FIELD_CARRYING_CAPACITY_ELEVATOR ) + "'!" );
      return null;
    }
  }

  public Double getCeilingHeight()
  {
    try
    {
      return this.getAsDouble( FIELD_CEILING_HEIGHT );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read ceiling height "
        + "from '" + this.get( FIELD_CEILING_HEIGHT ) + "'!" );
      return null;
    }
  }

  /*public String getCommissionOwn()
  {
    return this.get( FIELD_COMMISSION_OWN );
  }*/

  /*public String getCommissionPartner()
  {
    return this.get( FIELD_COMMISSION_PARTNER );
  }*/

  public Currency getCurrency()
  {
    String value = this.get( FIELD_CURRENCY );
    try
    {
      return (value!=null)? Currency.getInstance( value ): null;
    }
    catch (IllegalArgumentException ex)
    {
      LOGGER.warn( "Can't read currency from '" + value + "'!" );
      return null;
    }
  }

  public Long getDeliveryId()
  {
    try
    {
      return this.getAsLong( FIELD_DELIVERY_ID );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read delivery id "
        + "from '" + this.get( FIELD_DELIVERY_ID ) + "'!" );
      return null;
    }
  }

  /*public String getDestination()
  {
    return this.get( FIELD_DESTINATION );
  }*/

  public Integer getDistanceKindergarten()
  {
    try
    {
      return this.getAsInteger( FIELD_DISTANCE_KINDERGARTEN );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read distance to kindergarten "
        + "from '" + this.get( FIELD_DISTANCE_KINDERGARTEN ) + "'!" );
      return null;
    }
  }

  public Integer getDistanceMotorway()
  {
    try
    {
      return this.getAsInteger( FIELD_DISTANCE_MOTORWAY );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read distance to motorway "
        + "from '" + this.get( FIELD_DISTANCE_MOTORWAY ) + "'!" );
      return null;
    }
  }

  public Integer getDistancePublicTransport()
  {
    try
    {
      return this.getAsInteger( FIELD_DISTANCE_PUBLIC_TRANSPORT );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read distance to public transport "
        + "from '" + this.get( FIELD_DISTANCE_PUBLIC_TRANSPORT ) + "'!" );
      return null;
    }
  }

  public Integer getDistanceSchool1()
  {
    try
    {
      return this.getAsInteger( FIELD_DISTANCE_SCHOOL1 );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read distance to primary school "
        + "from '" + this.get( FIELD_DISTANCE_SCHOOL1 ) + "'!" );
      return null;
    }
  }

  public Integer getDistanceSchool2()
  {
    try
    {
      return this.getAsInteger( FIELD_DISTANCE_SCHOOL2 );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read distance to secondary school "
        + "from '" + this.get( FIELD_DISTANCE_SCHOOL2 ) + "'!" );
      return null;
    }
  }

  public Integer getDistanceShop()
  {
    try
    {
      return this.getAsInteger( FIELD_DISTANCE_SHOP );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read distance to shopping "
        + "from '" + this.get( FIELD_DISTANCE_SHOP ) + "'!" );
      return null;
    }
  }

  public Media getDocument()
  {
    String file = this.get( FIELD_DOCUMENT_FILE );
    return (file!=null)?
      new Media( file, this.get( FIELD_DOCUMENT_TITLE ) ): null;
    //return (file!=null)?
    //  new MediaElement( file, this.get( FIELD_DOCUMENT_TITLE ), this.get( FIELD_DOCUMENT_TEXT ) ): null;
  }

  public Integer getFloor()
  {
    try
    {
      return this.getAsInteger( FIELD_FLOOR );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read floor "
        + "from '" + this.get( FIELD_FLOOR ) + "'!" );
      return null;
    }
  }

  public GrossPremium getGrossPremium()
  {
    return GrossPremium.parse( this.get( FIELD_GROSS_PREMIUM ) );
  }

  public Double getHallHeight()
  {
    try
    {
      return this.getAsDouble( FIELD_HALL_HEIGHT );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read hall height "
        + "from '" + this.get( FIELD_HALL_HEIGHT ) + "'!" );
      return null;
    }
  }

  public Calendar getLastModified()
  {
    try
    {
      return IdxFormat.parseDateTimeAsCalendar( this.get( FIELD_LAST_MODIFIED ) );
    }
    catch (ParseException ex)
    {
      LOGGER.warn( "Can't read last modification date "
        + "from '" + this.get( FIELD_LAST_MODIFIED ) + "'!" );
      return null;
    }
  }

  public Double getMaximalFloorLoading()
  {
    try
    {
      return this.getAsDouble( FIELD_MAXIMAL_FLOOR_LOADING );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read maximal floor loading "
        + "from '" + this.get( FIELD_MAXIMAL_FLOOR_LOADING ) + "'!" );
      return null;
    }
  }

  public Media getMovie()
  {
    String file = this.get( FIELD_MOVIE_FILE );
    return (file!=null)?
      new Media( file, this.get( FIELD_MOVIE_TITLE ) ): null;
    //return (file!=null)?
    //  new MediaElement( file, this.get( FIELD_MOVIE_TITLE ), this.get( FIELD_MOVIE_TEXT ) ): null;
  }

  public Double getNumberOfApartments()
  {
    try
    {
      return this.getAsDouble( FIELD_NUMBER_OF_APARTMENTS );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read number of apartments "
        + "from '" + this.get( FIELD_NUMBER_OF_APARTMENTS ) + "'!" );
      return null;
    }
  }

  public Integer getNumberOfFloors()
  {
    try
    {
      return this.getAsInteger( FIELD_NUMBER_OF_FLOORS );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read number of floors "
        + "from '" + this.get( FIELD_NUMBER_OF_FLOORS ) + "'!" );
      return null;
    }
  }

  public Double getNumberOfRooms()
  {
    try
    {
      return this.getAsDouble( FIELD_NUMBER_OF_ROOMS );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read number of rooms "
        + "from '" + this.get( FIELD_NUMBER_OF_ROOMS ) + "'!" );
      return null;
    }
  }

  public ObjectCategory getObjectCategory()
  {
    return ObjectCategory.parse( this.get( FIELD_OBJECT_CATEGORY ) );
  }

  public String getObjectCity()
  {
    return this.get( FIELD_OBJECT_CITY );
  }

  public String getObjectCountry()
  {
    return this.get( FIELD_OBJECT_COUNTRY );
  }

  public String getObjectDescription()
  {
    return this.get( FIELD_OBJECT_DESCRIPTION );
  }

  public String getObjectSituation()
  {
    return this.get( FIELD_OBJECT_SITUATION );
  }

  public String getObjectState()
  {
    return this.get( FIELD_OBJECT_STATE );
  }

  public String getObjectStreet()
  {
    return this.get( FIELD_OBJECT_STREET );
  }

  public String getObjectTitle()
  {
    return this.get( FIELD_OBJECT_TITLE );
  }

  public ObjectType getObjectType()
  {
    ObjectCategory cat = this.getObjectCategory();
    return (cat!=null)? ObjectType.parse( cat, this.get( FIELD_OBJECT_TYPE ) ): null;
  }

  public String getObjectZip()
  {
    return this.get( FIELD_OBJECT_ZIP );
  }

  public OfferType getOfferType()
  {
    return OfferType.parse( this.get( FIELD_OFFER_TYPE ) );
  }

  public String getOwnObjectUrl()
  {
    return this.get( FIELD_OWN_OBJECT_URL );
  }

  public Media getPicture1()
  {
    String file = this.get( FIELD_PICTURE_1_FILE );
    return (file!=null)?
      new Media( file, this.get( FIELD_PICTURE_1_TITLE ), this.get( FIELD_PICTURE_1_TEXT ), this.get( FIELD_PICTURE_1_URL ) ): null;
  }

  public Media getPicture2()
  {
    String file = this.get( FIELD_PICTURE_2_FILE );
    return (file!=null)?
      new Media( file, this.get( FIELD_PICTURE_2_TITLE ), this.get( FIELD_PICTURE_2_TEXT ), this.get( FIELD_PICTURE_2_URL ) ): null;
  }

  public Media getPicture3()
  {
    String file = this.get( FIELD_PICTURE_3_FILE );
    return (file!=null)?
      new Media( file, this.get( FIELD_PICTURE_3_TITLE ), this.get( FIELD_PICTURE_3_TEXT ), this.get( FIELD_PICTURE_3_URL ) ): null;
  }

  public Media getPicture4()
  {
    String file = this.get( FIELD_PICTURE_4_FILE );
    return (file!=null)?
      new Media( file, this.get( FIELD_PICTURE_4_TITLE ), this.get( FIELD_PICTURE_4_TEXT ), this.get( FIELD_PICTURE_4_URL ) ): null;
  }

  public Media getPicture5()
  {
    String file = this.get( FIELD_PICTURE_5_FILE );
    return (file!=null)?
      new Media( file, this.get( FIELD_PICTURE_5_TITLE ), this.get( FIELD_PICTURE_5_TEXT ), this.get( FIELD_PICTURE_5_URL ) ): null;
  }

  public Media getPicture6()
  {
    String file = this.get( FIELD_PICTURE_6_FILE );
    return (file!=null)?
      new Media( file, this.get( FIELD_PICTURE_6_TITLE ), this.get( FIELD_PICTURE_6_TEXT ), this.get( FIELD_PICTURE_6_URL ) ): null;
  }

  public Media getPicture7()
  {
    String file = this.get( FIELD_PICTURE_7_FILE );
    return (file!=null)?
      new Media( file, this.get( FIELD_PICTURE_7_TITLE ), this.get( FIELD_PICTURE_7_TEXT ), this.get( FIELD_PICTURE_7_URL ) ): null;
  }

  public Media getPicture8()
  {
    String file = this.get( FIELD_PICTURE_8_FILE );
    return (file!=null)?
      new Media( file, this.get( FIELD_PICTURE_8_TITLE ), this.get( FIELD_PICTURE_8_TEXT ), this.get( FIELD_PICTURE_8_URL ) ): null;
  }

  public Media getPicture9()
  {
    String file = this.get( FIELD_PICTURE_9_FILE );
    return (file!=null)?
      new Media( file, this.get( FIELD_PICTURE_9_TITLE ), this.get( FIELD_PICTURE_9_TEXT ), this.get( FIELD_PICTURE_9_URL ) ): null;
  }

  public Media getPicture10()
  {
    String file = this.get( FIELD_PICTURE_10_FILE );
    return (file!=null)?
      new Media( file, this.get( FIELD_PICTURE_10_TITLE ), this.get( FIELD_PICTURE_10_TEXT ), this.get( FIELD_PICTURE_10_URL ) ): null;
  }

  public Media getPicture11()
  {
    String file = this.get( FIELD_PICTURE_11_FILE );
    return (file!=null)?
      new Media( file, this.get( FIELD_PICTURE_11_TITLE ), this.get( FIELD_PICTURE_11_TEXT ), this.get( FIELD_PICTURE_11_URL ) ): null;
  }

  public Media getPicture12()
  {
    String file = this.get( FIELD_PICTURE_12_FILE );
    return (file!=null)?
      new Media( file, this.get( FIELD_PICTURE_12_TITLE ), this.get( FIELD_PICTURE_12_TEXT ), this.get( FIELD_PICTURE_12_URL ) ): null;
  }

  public Media getPicture13()
  {
    String file = this.get( FIELD_PICTURE_13_FILE );
    return (file!=null)?
      new Media( file, this.get( FIELD_PICTURE_13_TITLE ), this.get( FIELD_PICTURE_13_TEXT ), this.get( FIELD_PICTURE_13_URL ) ): null;
  }

  public PriceUnit getPriceUnit()
  {
    return PriceUnit.parse( this.get( FIELD_PRICE_UNIT ) );
  }

  public Long getPublishingId()
  {
    try
    {
      return this.getAsLong( FIELD_PUBLISHING_ID );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read publishing id "
        + "from '" + this.get( FIELD_PUBLISHING_ID ) + "'!" );
      return null;
    }
  }

  /*public Calendar getPublishUntil()
  {
    try
    {
      return IdxFormat.parseDateAsCalendar( this.get( FIELD_PUBLISH_UNTIL ) );
    }
    catch (ParseException ex)
    {
      LOGGER.warn( "Can't read publish until date "
        + "from '" + this.get( FIELD_PUBLISH_UNTIL ) + "'!" );
      return null;
    }
  }*/

  @Override
  protected int getRecordLenth()
  {
    return LENGTH;
  }

  /*public String getRegion()
  {
    return this.get( FIELD_REGION );
  }*/

  public String getRefHouse()
  {
    return this.get( FIELD_REF_HOUSE );
  }

  public String getRefObject()
  {
    return this.get( FIELD_REF_OBJECT );
  }

  public String getRefProperty()
  {
    return this.get( FIELD_REF_PROPERTY );
  }

  public Long getRentExtra()
  {
    try
    {
      return this.getAsLong( FIELD_RENT_EXTRA );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read extra rent "
        + "from '" + this.get( FIELD_RENT_EXTRA ) + "'!" );
      return null;
    }
  }

  public Long getRentNet()
  {
    try
    {
      return this.getAsLong( FIELD_RENT_NET );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read net rent "
        + "from '" + this.get( FIELD_RENT_NET ) + "'!" );
      return null;
    }
  }

  public Long getSellingPrice()
  {
    try
    {
      return this.getAsLong( FIELD_SELLING_PRICE );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read selling price "
        + "from '" + this.get( FIELD_SELLING_PRICE ) + "'!" );
      return null;
    }
  }

  public String getSenderId()
  {
    return this.get( FIELD_SENDER_ID );
  }

  public String getSparefield1()
  {
    return this.get( FIELD_SPAREFIELD_1 );
  }

  public String getSparefield2()
  {
    return this.get( FIELD_SPAREFIELD_2 );
  }

  public String getSparefield3()
  {
    return this.get( FIELD_SPAREFIELD_3 );
  }

  public String getSparefield4()
  {
    return this.get( FIELD_SPAREFIELD_4 );
  }

  public Long getSurfaceLiving()
  {
    try
    {
      return this.getAsLong( FIELD_SURFACE_LIVING );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read living surface "
        + "from '" + this.get( FIELD_SURFACE_LIVING ) + "'!" );
      return null;
    }
  }

  public Long getSurfaceProperty()
  {
    try
    {
      return this.getAsLong( FIELD_SURFACE_PROPERTY );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read property surface "
        + "from '" + this.get( FIELD_SURFACE_PROPERTY ) + "'!" );
      return null;
    }
  }

  public Long getSurfaceUsable()
  {
    try
    {
      return this.getAsLong( FIELD_SURFACE_USABLE );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read usable surface "
        + "from '" + this.get( FIELD_SURFACE_USABLE ) + "'!" );
      return null;
    }
  }

  public String getUrl()
  {
    return this.get( FIELD_URL );
  }

  public String getVersion()
  {
    return this.get( FIELD_VERSION );
  }

  /*public String getVisitEmail()
  {
    return this.get( FIELD_VISIT_EMAIL );
  }*/

  public String getVisitName()
  {
    return this.get( FIELD_VISIT_NAME );
  }

  public String getVisitPhone()
  {
    return this.get( FIELD_VISIT_PHONE );
  }

  public String getVisitRemark()
  {
    return this.get( FIELD_VISIT_REMARK );
  }

  public Long getVolume()
  {
    try
    {
      return this.getAsLong( FIELD_VOLUME );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read volume "
        + "from '" + this.get( FIELD_VOLUME ) + "'!" );
      return null;
    }
  }

  public Integer getYearBuilt()
  {
    try
    {
      return this.getAsInteger( FIELD_YEAR_BUILT );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read build year "
        + "from '" + this.get( FIELD_YEAR_BUILT ) + "'!" );
      return null;
    }
  }

  public Integer getYearRenovated()
  {
    try
    {
      return this.getAsInteger( FIELD_YEAR_RENOVATED );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read renovation year "
        + "from '" + this.get( FIELD_YEAR_RENOVATED ) + "'!" );
      return null;
    }
  }

  public boolean isAnimalAllowed()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_ANIMAL_ALLOWED ) );
  }

  public boolean isBalcony()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_BALCONY ) );
  }

  public boolean isBuildingLandConnected()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_BUILDING_LAND_CONNECTED ) );
  }

  public boolean isCableTv()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_CABLETV ) );
  }

  public boolean isChildFriendly()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_CHILD_FRIENDLY ) );
  }

  /*public boolean isCommissionSharing()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_COMMISSION_SHARING ) );
  }*/

  public boolean isCornerHouse()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_CORNER_HOUSE ) );
  }

  public boolean isElevator()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_ELEVATOR ) );
  }

  public boolean isFlatSharingCommunity()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_FLAT_SHARING_COMMUNITY ) );
  }

  public boolean isFireplace()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_FIREPLACE ) );
  }

  public boolean isGarage()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_GARAGE ) );
  }

  public boolean isGardenhouse()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_GARDENHOUSE ) );
  }

  public boolean isGasSupply()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_GAS_SUPPLY ) );
  }

  public boolean isIsdn()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_ISDN ) );
  }

  public boolean isLiftingPlatform()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_LIFTING_PLATFORM ) );
  }

  public boolean isMiddleHouse()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_MIDDLE_HOUSE ) );
  }

  public boolean isMinEnergyCertified()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_MINENERGY_CERTIFIED ) );
  }

  public boolean isMinEnergyGeneral()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_MINENERGY_GENERAL ) );
  }

  /*public boolean isMunicipalInfo()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_MUNICIPAL_INFO ) );
  }*/

  public boolean isNewBuilding()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_NEW_BUILDING ) );
  }

  public boolean isOldBuilding()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_OLD_BUILDING ) );
  }

  public boolean isParking()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_PARKING ) );
  }

  public boolean isPowerSupply()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_POWER_SUPPLY ) );
  }

  public boolean isRailwayTerminal()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_RAILWAY_TERMINAL ) );
  }

  public boolean isRaisedGroundFloor()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_RAISED_GROUND_FLOOR ) );
  }

  public boolean isRamp()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_RAMP ) );
  }

  public boolean isRestrooms()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_RESTROOMS ) );
  }

  /*public boolean isRoofFloor()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_ROOF_FLOOR ) );
  }*/

  public boolean isSwimmingpool()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_SWIMMINGPOOL ) );
  }

  public boolean isUnderBuildingLaws()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_UNDER_BUILDING_LAWS ) );
  }

  public boolean isUnderRoof()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_UNDER_ROOF ) );
  }

  public boolean isSewageSupply()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_SEWAGE_SUPPLY ) );
  }

  public boolean isView()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_VIEW ) );
  }

  public boolean isWaterSupply()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_WATER_SUPPLY ) );
  }

  public boolean isWheelchairAccessible()
  {
    return Boolean.TRUE.equals( this.getAsBoolean( FIELD_WHEELCHAIR_ACCESSIBLE ) );
  }

  @Override
  protected void parse( CSVRecord record )
  {
    String version = StringUtils.trimToNull( record.get( FIELD_VERSION ) );
    if (version!=null && !VERSION.equalsIgnoreCase( version ) && !IdxFormat.VERSION.equalsIgnoreCase( version ))
    {
      LOGGER.warn( "IDX version '"+version+"' is not supported. Trying to parse the record anyway." );
    }
    super.parse( record );
  }

  @Override
  protected Iterable<String> print()
  {
    // make sure, that is version is present before printing
    String version = this.getVersion();
    if (version==null) this.setVersion( VERSION );

    return super.print();
  }

  public void setAdvertisementId( String value )
  {
    this.set( FIELD_ADVERTISEMENT_ID,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 200 ) );
  }

  public void setAgencyCity( String value )
  {
    this.set( FIELD_AGENCY_CITY,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 200 ) );
  }

  public void setAgencyCountry( String value )
  {
    value = StringUtils.trimToEmpty( value );
    this.set( FIELD_AGENCY_COUNTRY,
      (value.length()==2)? value.toUpperCase(): null );
  }

  public void setAgencyEmail( String value )
  {
    this.set( FIELD_AGENCY_EMAIL,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 200 ) );
  }

  public void setAgencyFax( String value )
  {
    this.set( FIELD_AGENCY_FAX,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 200 ) );
  }

  public void setAgencyId( String value )
  {
    this.set( FIELD_AGENCY_ID,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 10 ) );
  }

  /*public void setAgencyLogo( String value )
  {
    this.set( FIELD_AGENCY_LOGO,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 200 ) );
  }*/

  /*public void setAgencyLogo2( String value )
  {
    this.set( FIELD_AGENCY_LOGO2,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 200 ) );
  }*/

  /*public void setAgencyMobile( String value )
  {
    this.set( FIELD_AGENCY_MOBILE,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 200 ) );
  }*/

  public void setAgencyName( String value )
  {
    this.set( FIELD_AGENCY_NAME,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 200 ) );
  }

  public void setAgencyName2( String value )
  {
    this.set( FIELD_AGENCY_NAME2,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 255 ) );
  }

  public void setAgencyPhone( String value )
  {
    this.set( FIELD_AGENCY_PHONE,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 200 ) );
  }

  public void setAgencyReference( String value )
  {
    this.set( FIELD_AGENCY_REFERENCE,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 200 ) );
  }

  public void setAgencyStreet( String value )
  {
    this.set( FIELD_AGENCY_STREET,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 200 ) );
  }

  public void setAgencyZip( String value )
  {
    this.set( FIELD_AGENCY_ZIP,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 200 ) );
  }

  public void setAnimalAllowed( boolean value )
  {
    this.set( FIELD_ANIMAL_ALLOWED,
      IdxFormat.printBoolean( value ) );
  }

  public void setAvailableFrom( Calendar value )
  {
    this.set( FIELD_AVAILABLE_FROM,
      IdxFormat.printDate( value ) );
  }

  public void setAvailableFrom( Date value )
  {
    this.set( FIELD_AVAILABLE_FROM,
      IdxFormat.printDate( value ) );
  }

  public void setBalcony( boolean value )
  {
    this.set( FIELD_BALCONY,
      IdxFormat.printBoolean( value ) );
  }

  public void setBillingCompany( String value )
  {
    this.set( FIELD_BILLING_COMPANY,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 200 ) );
  }

  public void setBillingCountry( String value )
  {
    this.set( FIELD_BILLING_COUNTRY,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 200 ) );
  }

  public void setBillingFirstName( String value )
  {
    this.set( FIELD_BILLING_FIRST_NAME,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 200 ) );
  }

  public void setBillingLanguage( Language value )
  {
    this.set( FIELD_BILLING_LANGUAGE,
      (value!=null)? value.print(): null );
  }

  public void setBillingMobile( String value )
  {
    this.set( FIELD_BILLING_MOBILE,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 200 ) );
  }

  public void setBillingName( String value )
  {
    this.set( FIELD_BILLING_NAME,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 200 ) );
  }

  public void setBillingPlaceName( String value )
  {
    this.set( FIELD_BILLING_PLACE_NAME,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 200 ) );
  }

  public void setBillingPhone( String value )
  {
    this.set( FIELD_BILLING_PHONE,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 200 ) );
  }

  public void setBillingPhone2( String value )
  {
    this.set( FIELD_BILLING_PHONE2,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 200 ) );
  }

  public void setBillingPostBox( String value )
  {
    this.set( FIELD_BILLING_POST_BOX,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 200 ) );
  }

  public void setBillingSalutation( Salutation value )
  {
    this.set( FIELD_BILLING_SALUTATION,
      (value!=null)? value.print(): null );
  }

  public void setBillingStreet( String value )
  {
    this.set( FIELD_BILLING_STREET,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 200 ) );
  }

  public void setBillingZip( String value )
  {
    this.set( FIELD_BILLING_ZIP,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 10 ) );
  }

  public void setBuildingLandConnected( boolean value )
  {
    this.set( FIELD_BUILDING_LAND_CONNECTED,
      IdxFormat.printBoolean( value ) );
  }

  public void setCableTv( boolean value )
  {
    this.set( FIELD_CABLETV,
      IdxFormat.printBoolean( value ) );
  }

  public void setCarryingCapacityCrane( Double value )
  {
    this.set( FIELD_CARRYING_CAPACITY_CRANE,
      IdxFormat.printNumber( value, 10, 1 ) );
  }

  public void setCarryingCapacityElevator( Double value )
  {
    this.set( FIELD_CARRYING_CAPACITY_ELEVATOR,
      IdxFormat.printNumber( value, 10, 1 ) );
  }

  public void setCeilingHeight( Double value )
  {
    this.set( FIELD_CEILING_HEIGHT,
      IdxFormat.printNumber( value, 10, 2 ) );
  }

  public void setChildFriendly( boolean value )
  {
    this.set( FIELD_CHILD_FRIENDLY,
      IdxFormat.printBoolean( value ) );
  }

  /*public void setCommissionOwn( String value )
  {
    this.set( FIELD_COMMISSION_OWN,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 10 ) );
  }*/

  /*public void setCommissionPartner( String value )
  {
    this.set( FIELD_COMMISSION_PARTNER,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 10 ) );
  }*/

  /*public void setCommissionSharing( boolean value )
  {
    this.set( FIELD_COMMISSION_SHARING,
      IdxFormat.printBoolean( value ) );
  }*/

  public void setCornerHouse( boolean value )
  {
    this.set( FIELD_CORNER_HOUSE,
      IdxFormat.printBoolean( value ) );
  }

  public void setCurrency( Currency value )
  {
    this.set( FIELD_CURRENCY,
      (value!=null)? value.getCurrencyCode(): null );
  }

  /*public void setDestination( String value )
  {
    this.set( FIELD_DESTINATION,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 200 ) );
  }*/

  public void setDistanceKindergarten( Integer value )
  {
    this.set( FIELD_DISTANCE_KINDERGARTEN,
      IdxFormat.printNumber( value, 5 ) );
  }

  public void setDistanceMotorway( Integer value )
  {
    this.set( FIELD_DISTANCE_MOTORWAY,
      IdxFormat.printNumber( value, 5 ) );
  }

  public void setDistancePublicTransport( Integer value )
  {
    this.set( FIELD_DISTANCE_PUBLIC_TRANSPORT,
      IdxFormat.printNumber( value, 5 ) );
  }

  public void setDistanceSchool1( Integer value )
  {
    this.set( FIELD_DISTANCE_SCHOOL1,
      IdxFormat.printNumber( value, 5 ) );
  }

  public void setDistanceSchool2( Integer value )
  {
    this.set( FIELD_DISTANCE_SCHOOL2,
      IdxFormat.printNumber( value, 5 ) );
  }

  public void setDistanceShop( Integer value )
  {
    this.set( FIELD_DISTANCE_SHOP,
      IdxFormat.printNumber( value, 5 ) );
  }

  public void setDocument( Media value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getFileName() ): null;
    this.set( FIELD_DOCUMENT_FILE, file );
    this.set( FIELD_DOCUMENT_TITLE, (value!=null && file!=null)? value.getTitle(): null );
    //this.set( FIELD_DOCUMENT_TEXT, (value!=null && file!=null)? value.getDescription(): null );
  }

  public void setElevator( boolean value )
  {
    this.set( FIELD_ELEVATOR,
      IdxFormat.printBoolean( value ) );
  }

  public void setFireplace( boolean value )
  {
    this.set( FIELD_FIREPLACE,
      IdxFormat.printBoolean( value ) );
  }

  public void setFlatSharingCommunity( boolean value )
  {
    this.set( FIELD_FLAT_SHARING_COMMUNITY,
      IdxFormat.printBoolean( value ) );
  }

  public void setFloor( Integer value )
  {
    this.set( FIELD_FLOOR,
      IdxFormat.printNumber( value, 6 ) );
  }

  public void setGarage( boolean value )
  {
    this.set( FIELD_GARAGE,
      IdxFormat.printBoolean( value ) );
  }

  public void setGardenhouse( boolean value )
  {
    this.set( FIELD_GARDENHOUSE,
      IdxFormat.printBoolean( value ) );
  }

  public void setGasSupply( boolean value )
  {
    this.set( FIELD_GAS_SUPPLY,
      IdxFormat.printBoolean( value ) );
  }

  public void setGrossPremium( GrossPremium value )
  {
    this.set( FIELD_GROSS_PREMIUM,
      (value!=null)? value.print(): null );
  }

  public void setHallHeight( Double value )
  {
    this.set( FIELD_HALL_HEIGHT,
      IdxFormat.printNumber( value, 10, 2 ) );
  }

  public void setIsdn( boolean value )
  {
    this.set( FIELD_ISDN,
      IdxFormat.printBoolean( value ) );
  }

  public void setLastModified( Calendar value )
  {
    this.set( FIELD_LAST_MODIFIED,
      IdxFormat.printDateTime( value ) );
  }

  public void setLastModified( Date value )
  {
    this.set( FIELD_LAST_MODIFIED,
      IdxFormat.printDateTime( value ) );
  }

  public void setLiftingPlatform( boolean value )
  {
    this.set( FIELD_LIFTING_PLATFORM,
      IdxFormat.printBoolean( value ) );
  }

  public void setMaximalFloorLoading( Double value )
  {
    this.set( FIELD_MAXIMAL_FLOOR_LOADING,
      IdxFormat.printNumber( value, 10, 1 ) );
  }

  public void setMiddleHouse( boolean value )
  {
    this.set( FIELD_MIDDLE_HOUSE,
      IdxFormat.printBoolean( value ) );
  }

  public void setMinEnergyCertified( boolean value )
  {
    this.set( FIELD_MINENERGY_CERTIFIED,
      IdxFormat.printBoolean( value ) );
  }

  public void setMinEnergyGeneral( boolean value )
  {
    this.set( FIELD_MINENERGY_GENERAL,
      IdxFormat.printBoolean( value ) );
  }

  public void setMovie( Media value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getFileName() ): null;
    this.set( FIELD_MOVIE_FILE, file );
    this.set( FIELD_MOVIE_TITLE, (value!=null && file!=null)? value.getTitle(): null );
    //this.set( FIELD_MOVIE_TEXT, (value!=null && file!=null)? value.getDescription(): null );
  }

  /*public void setMunicipalInfo( boolean value )
  {
    this.set( FIELD_MUNICIPAL_INFO,
      IdxFormat.printBoolean( value ) );
  }*/

  public void setNewBuilding( boolean value )
  {
    this.set( FIELD_NEW_BUILDING,
      IdxFormat.printBoolean( value ) );
  }

  public void setNumberOfApartments( Double value )
  {
    this.set( FIELD_NUMBER_OF_APARTMENTS,
      IdxFormat.printNumber( value, 5, 1 ) );
  }

  public void setNumberOfFloors( Integer value )
  {
    this.set( FIELD_NUMBER_OF_FLOORS,
      IdxFormat.printNumber( value, 2 ) );
  }

  public void setNumberOfRooms( Double value )
  {
    this.set( FIELD_NUMBER_OF_ROOMS,
      IdxFormat.printNumber( value, 5, 1 ) );
  }

  /*public void setObjectCategory( ObjectCategory value )
  {
    this.set( FIELD_OBJECT_CATEGORY, (value!=null)? value.print(): null );
  }*/

  public void setObjectCity( String value )
  {
    this.set( FIELD_OBJECT_CITY,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 200 ) );
  }

  public void setObjectCountry( String value )
  {
    value = StringUtils.trimToEmpty( value );
    this.set( FIELD_OBJECT_COUNTRY,
      (value.length()==2)? value.toUpperCase(): null );
  }

  public void setObjectDescription( String value )
  {
    this.set( FIELD_OBJECT_DESCRIPTION,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 4000 ) );
  }

  public void setObjectSituation( String value )
  {
    this.set( FIELD_OBJECT_SITUATION,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 50 ) );
  }

  public void setObjectState( String value )
  {
    value = StringUtils.trimToEmpty( value );
    this.set( FIELD_OBJECT_STATE,
      (value.length()==2)? value.toUpperCase(): null );
  }

  public void setObjectStreet( String value )
  {
    this.set( FIELD_OBJECT_STREET,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 200 ) );
  }

  public void setObjectTitle( String value )
  {
    this.set( FIELD_OBJECT_TITLE,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 70 ) );
  }

  public void setObjectType( ObjectType value )
  {
    this.set( FIELD_OBJECT_CATEGORY,
      (value!=null)? value.getCategory().print(): null );
    this.set( FIELD_OBJECT_TYPE,
      (value!=null)? value.print(): null );
  }

  public void setObjectZip( String value )
  {
    this.set( FIELD_OBJECT_ZIP,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 10 ) );
  }

  public void setOldBuilding( boolean value )
  {
    this.set( FIELD_OLD_BUILDING,
      IdxFormat.printBoolean( value ) );
  }

  public void setOfferType( OfferType value )
  {
    this.set( FIELD_OFFER_TYPE,
      (value!=null)? value.print(): null );
  }

  public void setOwnObjectUrl( String value )
  {
    this.set( FIELD_OWN_OBJECT_URL,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 100 ) );
  }

  public void setParking( boolean value )
  {
    this.set( FIELD_PARKING,
      IdxFormat.printBoolean( value ) );
  }

  public void setPicture1( Media value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getFileName() ): null;
    this.set( FIELD_PICTURE_1_FILE, file );
    this.set( FIELD_PICTURE_1_TITLE, (value!=null && file!=null)? value.getTitle(): null );
    this.set( FIELD_PICTURE_1_TEXT, (value!=null && file!=null)? value.getDescription(): null );
    this.set( FIELD_PICTURE_1_URL, (value!=null && file!=null)? value.getUrl(): null );
  }

  public void setPicture2( Media value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getFileName() ): null;
    this.set( FIELD_PICTURE_2_FILE, file );
    this.set( FIELD_PICTURE_2_TITLE, (value!=null && file!=null)? value.getTitle(): null );
    this.set( FIELD_PICTURE_2_TEXT, (value!=null && file!=null)? value.getDescription(): null );
    this.set( FIELD_PICTURE_2_URL, (value!=null && file!=null)? value.getUrl(): null );
  }

  public void setPicture3( Media value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getFileName() ): null;
    this.set( FIELD_PICTURE_3_FILE, file );
    this.set( FIELD_PICTURE_3_TITLE, (value!=null && file!=null)? value.getTitle(): null );
    this.set( FIELD_PICTURE_3_TEXT, (value!=null && file!=null)? value.getDescription(): null );
    this.set( FIELD_PICTURE_3_URL, (value!=null && file!=null)? value.getUrl(): null );
  }

  public void setPicture4( Media value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getFileName() ): null;
    this.set( FIELD_PICTURE_4_FILE, file );
    this.set( FIELD_PICTURE_4_TITLE, (value!=null && file!=null)? value.getTitle(): null );
    this.set( FIELD_PICTURE_4_TEXT, (value!=null && file!=null)? value.getDescription(): null );
    this.set( FIELD_PICTURE_4_URL, (value!=null && file!=null)? value.getUrl(): null );
  }

  public void setPicture5( Media value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getFileName() ): null;
    this.set( FIELD_PICTURE_5_FILE, file );
    this.set( FIELD_PICTURE_5_TITLE, (value!=null && file!=null)? value.getTitle(): null );
    this.set( FIELD_PICTURE_5_TEXT, (value!=null && file!=null)? value.getDescription(): null );
    this.set( FIELD_PICTURE_5_URL, (value!=null && file!=null)? value.getUrl(): null );
  }

  public void setPicture6( Media value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getFileName() ): null;
    this.set( FIELD_PICTURE_6_FILE, file );
    this.set( FIELD_PICTURE_6_TITLE, (value!=null && file!=null)? value.getTitle(): null );
    this.set( FIELD_PICTURE_6_TEXT, (value!=null && file!=null)? value.getDescription(): null );
    this.set( FIELD_PICTURE_6_URL, (value!=null && file!=null)? value.getUrl(): null );
  }

  public void setPicture7( Media value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getFileName() ): null;
    this.set( FIELD_PICTURE_7_FILE, file );
    this.set( FIELD_PICTURE_7_TITLE, (value!=null && file!=null)? value.getTitle(): null );
    this.set( FIELD_PICTURE_7_TEXT, (value!=null && file!=null)? value.getDescription(): null );
    this.set( FIELD_PICTURE_7_URL, (value!=null && file!=null)? value.getUrl(): null );
  }

  public void setPicture8( Media value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getFileName() ): null;
    this.set( FIELD_PICTURE_8_FILE, file );
    this.set( FIELD_PICTURE_8_TITLE, (value!=null && file!=null)? value.getTitle(): null );
    this.set( FIELD_PICTURE_8_TEXT, (value!=null && file!=null)? value.getDescription(): null );
    this.set( FIELD_PICTURE_8_URL, (value!=null && file!=null)? value.getUrl(): null );
  }

  public void setPicture9( Media value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getFileName() ): null;
    this.set( FIELD_PICTURE_9_FILE, file );
    this.set( FIELD_PICTURE_9_TITLE, (value!=null && file!=null)? value.getTitle(): null );
    this.set( FIELD_PICTURE_9_TEXT, (value!=null && file!=null)? value.getDescription(): null );
    this.set( FIELD_PICTURE_9_URL, (value!=null && file!=null)? value.getUrl(): null );
  }

  public void setPicture10( Media value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getFileName() ): null;
    this.set( FIELD_PICTURE_10_FILE, file );
    this.set( FIELD_PICTURE_10_TITLE, (value!=null && file!=null)? value.getTitle(): null );
    this.set( FIELD_PICTURE_10_TEXT, (value!=null && file!=null)? value.getDescription(): null );
    this.set( FIELD_PICTURE_10_URL, (value!=null && file!=null)? value.getUrl(): null );
  }

  public void setPicture11( Media value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getFileName() ): null;
    this.set( FIELD_PICTURE_11_FILE, file );
    this.set( FIELD_PICTURE_11_TITLE, (value!=null && file!=null)? value.getTitle(): null );
    this.set( FIELD_PICTURE_11_TEXT, (value!=null && file!=null)? value.getDescription(): null );
    this.set( FIELD_PICTURE_11_URL, (value!=null && file!=null)? value.getUrl(): null );
  }

  public void setPicture12( Media value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getFileName() ): null;
    this.set( FIELD_PICTURE_12_FILE, file );
    this.set( FIELD_PICTURE_12_TITLE, (value!=null && file!=null)? value.getTitle(): null );
    this.set( FIELD_PICTURE_12_TEXT, (value!=null && file!=null)? value.getDescription(): null );
    this.set( FIELD_PICTURE_12_URL, (value!=null && file!=null)? value.getUrl(): null );
  }

  public void setPicture13( Media value )
  {
    String file = (value!=null)? StringUtils.trimToNull( value.getFileName() ): null;
    this.set( FIELD_PICTURE_13_FILE, file );
    this.set( FIELD_PICTURE_13_TITLE, (value!=null && file!=null)? value.getTitle(): null );
    this.set( FIELD_PICTURE_13_TEXT, (value!=null && file!=null)? value.getDescription(): null );
    this.set( FIELD_PICTURE_13_URL, (value!=null && file!=null)? value.getUrl(): null );
  }

  public void setPowerSupply( boolean value )
  {
    this.set( FIELD_POWER_SUPPLY,
      IdxFormat.printBoolean( value ) );
  }

  public void setPriceUnit( PriceUnit value )
  {
    this.set( FIELD_PRICE_UNIT,
      (value!=null)? value.print(): null );
  }

  /*public void setPublishUntil( Calendar value )
  {
    this.set( FIELD_PUBLISH_UNTIL,
      IdxFormat.printDate( value ) );
  }*/

  /*public void setPublishUntil( Date value )
  {
    this.set( FIELD_PUBLISH_UNTIL,
      IdxFormat.printDate( value ) );
  }*/

  public void setRailwayTerminal( boolean value )
  {
    this.set( FIELD_RAILWAY_TERMINAL,
      IdxFormat.printBoolean( value ) );
  }

  public void setRaisedGroundFloor( boolean value )
  {
    this.set( FIELD_RAISED_GROUND_FLOOR,
      IdxFormat.printBoolean( value ) );
  }

  public void setRamp( boolean value )
  {
    this.set( FIELD_RAMP,
      IdxFormat.printBoolean( value ) );
  }

  public void setRefHouse( String value )
  {
    this.set( FIELD_REF_HOUSE,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 80 ) );
  }

  public void setRefObject( String value )
  {
    this.set( FIELD_REF_OBJECT,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 80 ) );
  }

  public void setRefProperty( String value )
  {
    this.set( FIELD_REF_PROPERTY,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 80 ) );
  }

  /*public void setRegion( String value )
  {
    this.set( FIELD_REGION,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 200 ) );
  }*/

  public void setRentExtra( Long value )
  {
    this.set( FIELD_RENT_EXTRA,
      IdxFormat.printNumber( value, 10 ) );
  }

  public void setRentNet( Long value )
  {
    this.set( FIELD_RENT_NET,
      IdxFormat.printNumber( value, 10 ) );
  }

  public void setRestrooms( boolean value )
  {
    this.set( FIELD_RESTROOMS,
      IdxFormat.printBoolean( value ) );
  }

  /*public void setRoofFloor( boolean value )
  {
    this.set( FIELD_ROOF_FLOOR,
  IdxFormat.printBoolean( value ) );
  }*/

  public void setSellingPrice( Long value )
  {
    this.set( FIELD_SELLING_PRICE,
      IdxFormat.printNumber( value, 10 ) );
  }

  public void setSenderId( String value )
  {
    this.set( FIELD_SENDER_ID,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 50 ) );
  }

  public void setSewageSupply( boolean value )
  {
    this.set( FIELD_SEWAGE_SUPPLY,
      IdxFormat.printBoolean( value ) );
  }

  public void setSparefield1( String value )
  {
    this.set( FIELD_SPAREFIELD_1,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 255 ) );
  }

  public void setSparefield2( String value )
  {
    this.set( FIELD_SPAREFIELD_2,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 255 ) );
  }

  public void setSparefield3( String value )
  {
    this.set( FIELD_SPAREFIELD_3,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 255 ) );
  }

  public void setSparefield4( String value )
  {
    this.set( FIELD_SPAREFIELD_4,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 255 ) );
  }

  public void setSurfaceLiving( Long value )
  {
    this.set( FIELD_SURFACE_LIVING,
      IdxFormat.printNumber( value, 10 ) );
  }

  public void setSurfaceProperty( Long value )
  {
    this.set( FIELD_SURFACE_PROPERTY,
      IdxFormat.printNumber( value, 10 ) );
  }

  public void setSurfaceUsable( Long value )
  {
    this.set( FIELD_SURFACE_USABLE,
      IdxFormat.printNumber( value, 10 ) );
  }

  public void setSwimmingpool( boolean value )
  {
    this.set( FIELD_SWIMMINGPOOL,
      IdxFormat.printBoolean( value ) );
  }

  public void setUnderBuildingLaws( boolean value )
  {
    this.set( FIELD_UNDER_BUILDING_LAWS,
      IdxFormat.printBoolean( value ) );
  }

  public void setUnderRoof( boolean value )
  {
    this.set( FIELD_UNDER_ROOF,
      IdxFormat.printBoolean( value ) );
  }

  public void setUrl( String value )
  {
    this.set( FIELD_URL,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 200 ) );
  }

  public void setVersion( String value )
  {
    this.set( FIELD_VERSION,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 50 ) );
  }

  public void setView( boolean value )
  {
    this.set( FIELD_VIEW,
      IdxFormat.printBoolean( value ) );
  }

  /*public void setVisitEmail( String value )
  {
    this.set( FIELD_VISIT_EMAIL,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 200 ) );
  }*/

  public void setVisitName( String value )
  {
    this.set( FIELD_VISIT_NAME,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 200 ) );
  }

  public void setVisitPhone( String value )
  {
    this.set( FIELD_VISIT_PHONE,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 200 ) );
  }

  public void setVisitRemark( String value )
  {
    this.set( FIELD_VISIT_REMARK,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 200 ) );
  }

  public void setVolume( Long value )
  {
    this.set( FIELD_VOLUME,
      IdxFormat.printNumber( value, 10 ) );
  }

  public void setWaterSupply( boolean value )
  {
    this.set( FIELD_WATER_SUPPLY,
      IdxFormat.printBoolean( value ) );
  }

  public void setWheelcharAccessible( boolean value )
  {
    this.set( FIELD_WHEELCHAIR_ACCESSIBLE,
      IdxFormat.printBoolean( value ) );
  }

  public void setYearBuilt( Integer value )
  {
    this.set( FIELD_YEAR_BUILT,
      IdxFormat.printNumber( value, 4 ) );
  }

  public void setYearRenovated( Integer value )
  {
    this.set( FIELD_YEAR_RENOVATED,
      IdxFormat.printNumber( value, 4 ) );
  }
}