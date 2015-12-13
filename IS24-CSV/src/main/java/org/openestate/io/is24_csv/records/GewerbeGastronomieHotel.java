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

package org.openestate.io.is24_csv.records;

import java.math.BigDecimal;
import org.apache.commons.csv.CSVRecord;
import org.openestate.io.is24_csv.Is24CsvFormat;
import org.openestate.io.is24_csv.Is24CsvRecord;
import org.openestate.io.is24_csv.types.Ausstattung;
import org.openestate.io.is24_csv.types.Befeuerungsart;
import org.openestate.io.is24_csv.types.EnergieausweisTyp;
import org.openestate.io.is24_csv.types.Heizungsart;
import org.openestate.io.is24_csv.types.Immobilienart;
import org.openestate.io.is24_csv.types.ObjektkategorieGewerbeGastronomieHotel;
import org.openestate.io.is24_csv.types.Objektzustand;
import org.openestate.io.is24_csv.types.VermarktungsartGewerbe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Record from the IS24-CSV format for gastronomy objects.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public class GewerbeGastronomieHotel extends Is24CsvRecord
{
  private final static Logger LOGGER = LoggerFactory.getLogger( GewerbeGastronomieHotel.class );

  /** Vermarktungsart, Text 1 */
  protected final static int FIELD_VERMARKTUNGSART = 60;

  /** Objektkategorie 2, Zahl 3 */
  protected final static int FIELD_OBJEKTKATEGORIE = 61;

  /** Gastraumfläche (gewerbliche Hauptnutzungsfläche), Zahl 10,2 */
  protected final static int FIELD_GEWERBEFLAECHE = 62;

  /** Nebenfläche, Zahl 10,2 */
  protected final static int FIELD_NEBENFLAECHE = 63;

  /** Gesamtfläche, Zahl 10,2 */
  protected final static int FIELD_GESAMTFLAECHE = 64;

  /** Anzahl Parkflächen, Zahl 5 */
  protected final static int FIELD_ANZAHL_PARKFLAECHEN = 65;

  /** Etage(n), Text 50 */
  protected final static int FIELD_ETAGEN = 66;

  /** Baujahr, Zahl 4 */
  protected final static int FIELD_BAUJAHR = 67;

  /** Objektzustand, Zahl 10 */
  protected final static int FIELD_OBJEKTZUSTAND = 68;

  /** Personenaufzug, Text 1 */
  protected final static int FIELD_PERSONENAUFZUG = 69;

  /** Anzahl Plätze Gastraum, Zahl 5 */
  protected final static int FIELD_ANZAHL_GASTRAUMPLAETZE = 70;

  /** Anzahl Betten, Zahl 5 */
  protected final static int FIELD_ANZAHL_BETTEN = 71;

  /** Gastterrasse, Text 1 */
  protected final static int FIELD_GASTTERRASSE = 72;

  /** Fussweg zu öffentlichen Verkehrsmitteln (in Min.), Zahl 2 */
  protected final static int FIELD_FUSSWEG_NAHVERKEHR = 73;

  /** Fahrzeit zum nächsten Hauptbahnhof (in Min.), Zahl 2 */
  protected final static int FIELD_FAHRTWEG_HAUPTBAHNHOF = 74;

  /** Fahrzeit zum nächsten BAB (in Min.), Zahl 3 */
  protected final static int FIELD_FAHRTWEG_AUTOBAHN = 75;

  /** Fahrzeit zum nächsten Flughafen (in Min.), Zahl 3 */
  protected final static int FIELD_FAHRTWEG_FLUGHAFEN = 76;

  /** Frei ab/Verfügbar ab/Antrittstermin, Text 50 */
  protected final static int FIELD_VERFUEGBAR_AB = 77;

  /** Jahr letzte Modernisierung/ Sanierung, Zahl 4 */
  protected final static int FIELD_SANIERUNGSJAHR = 80;

  /** Qualität der Ausstattung, Zahl 1 */
  protected final static int FIELD_AUSSTATTUNG = 81;

  /** Befeuerungsart, Zahl 2 (Mehrfachauswahl möglich, wenn Eingaben durch Semikolon getrennt werden. Jeder mögliche Wert darf max. einmal erscheinen.) */
  protected final static int FIELD_BEFEUERUNG = 83;

  /** Energieausweistyp, Zahl 1 */
  protected final static int FIELD_ENERGIEAUSWEIS_TYP = 84;

  /** Kennwert in kWh/(m²*a), Zahl 5,2 */
  protected final static int FIELD_ENERGIEAUSWEIS_KENNWERT = 85;

  /** Energieverbrauch für Warmwasser enthalten, Text 1 (Nur relevant falls Energieausweistyp=VERBRAUCH. In allen anderen Fällen darf das Feld nicht gesetzt sein.) */
  protected final static int FIELD_ENERGIEAUSWEIS_INKL_WARMWASSER = 86;

  /** Heizungsart, Zahl 10 */
  protected final static int FIELD_HEIZUNGSART = 87;

  /** Denkmalschutzobjekt, Text 1 */
  protected final static int FIELD_DENKMALSCHUTZ = 88;

  /** Keller, Text 1 */
  protected final static int FIELD_KELLER = 89;

  /** Preis (Monatsmiete oder Kaufpreis), Zahl 15,2 */
  protected final static int FIELD_PREIS = 90;

  /** Nebenkosten, Zahl 15,2 */
  protected final static int FIELD_NEBENKOSTEN = 91;

  /** Preis pro Parkfläche, Zahl 15,2 */
  protected final static int FIELD_PREIS_PRO_PARKFLAECHE = 92;

  /** Kaution, Text 50 */
  protected final static int FIELD_KAUTION = 93;

  public GewerbeGastronomieHotel()
  {
    super();
    this.setImmobilienart( Immobilienart.GEWERBE_GASTRONOMIE_HOTEL );
  }

  public Integer getAnzahlBetten()
  {
    try
    {
      return Is24CsvFormat.parseInteger(
        this.get( FIELD_ANZAHL_BETTEN ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Anzahl Betten'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public Integer getAnzahlGastraumplaetze()
  {
    try
    {
      return Is24CsvFormat.parseInteger(
        this.get( FIELD_ANZAHL_GASTRAUMPLAETZE ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Anzahl Gastraumplaetze'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public Integer getAnzahlParkflaechen()
  {
    try
    {
      return Is24CsvFormat.parseInteger(
        this.get( FIELD_ANZAHL_PARKFLAECHEN ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Anzahl Parkflaechen'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public Ausstattung getAusstattung()
  {
    return Ausstattung.parse(
      this.get( FIELD_AUSSTATTUNG ) );
  }

  public Integer getBaujahr()
  {
    try
    {
      return Is24CsvFormat.parseInteger(
        this.get( FIELD_BAUJAHR ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Baujahr'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public Befeuerungsart[] getBefeuerungsart()
  {
    return Befeuerungsart.parseMultiple(
      this.get( FIELD_BEFEUERUNG ) );
  }

  public Boolean getDenkmalschutz()
  {
    return Is24CsvFormat.parseBoolean(
      this.get( FIELD_DENKMALSCHUTZ ) );
  }

  public Boolean getEnergieausweisInklWarmwasser()
  {
    return Is24CsvFormat.parseBoolean(
      this.get( FIELD_ENERGIEAUSWEIS_INKL_WARMWASSER ) );
  }

  public BigDecimal getEnergieausweisKennwert()
  {
    try
    {
      return Is24CsvFormat.parseDecimal(
        this.get( FIELD_ENERGIEAUSWEIS_KENNWERT ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Energieausweis-Kennwert'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public EnergieausweisTyp getEnergieausweisTyp()
  {
    return EnergieausweisTyp.parse(
      this.get( FIELD_ENERGIEAUSWEIS_TYP ) );
  }

  public String getEtagen()
  {
    return this.get( FIELD_ETAGEN );
  }

  public Integer getFahrtwegAutobahn()
  {
    try
    {
      return Is24CsvFormat.parseInteger(
        this.get( FIELD_FAHRTWEG_AUTOBAHN ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Fahrtweg zur Autobahn'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public Integer getFahrtwegFlughafen()
  {
    try
    {
      return Is24CsvFormat.parseInteger(
        this.get( FIELD_FAHRTWEG_FLUGHAFEN ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Fahrtweg zum Flughafen'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public Integer getFahrtwegHauptbahnhof()
  {
    try
    {
      return Is24CsvFormat.parseInteger(
        this.get( FIELD_FAHRTWEG_HAUPTBAHNHOF ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Fahrtweg zum Hauptbahnhof'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public Integer getFusswegNahverkehr()
  {
    try
    {
      return Is24CsvFormat.parseInteger(
        this.get( FIELD_FUSSWEG_NAHVERKEHR ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Fussweg zum Nahverkehr'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public Boolean getGastterrasse()
  {
    return Is24CsvFormat.parseBoolean(
      this.get( FIELD_GASTTERRASSE ) );
  }

  public BigDecimal getGesamtflaeche()
  {
    try
    {
      return Is24CsvFormat.parseDecimal(
        this.get( FIELD_GESAMTFLAECHE ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Gesamtflaeche'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public BigDecimal getGewerbeflaeche()
  {
    try
    {
      return Is24CsvFormat.parseDecimal(
        this.get( FIELD_GEWERBEFLAECHE ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Gewerbeflaeche'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public Heizungsart getHeizungsart()
  {
    return Heizungsart.parse(
      this.get( FIELD_HEIZUNGSART ) );
  }

  public String getKaution()
  {
    return this.get( FIELD_KAUTION );
  }

  public Boolean getKeller()
  {
    return Is24CsvFormat.parseBoolean(
      this.get( FIELD_KELLER ) );
  }

  public BigDecimal getNebenflaeche()
  {
    try
    {
      return Is24CsvFormat.parseDecimal(
        this.get( FIELD_NEBENFLAECHE ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Nebenflaeche'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public BigDecimal getNebenkosten()
  {
    try
    {
      return Is24CsvFormat.parseDecimal(
        this.get( FIELD_NEBENKOSTEN ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Nebenkosten'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public ObjektkategorieGewerbeGastronomieHotel getObjektkategorie()
  {
    return ObjektkategorieGewerbeGastronomieHotel.parse(
      this.get( FIELD_OBJEKTKATEGORIE ) );
  }

  public Objektzustand getObjektzustand()
  {
    return Objektzustand.parse(
      this.get( FIELD_OBJEKTZUSTAND ) );
  }

  public Boolean getPersonenaufzug()
  {
    return Is24CsvFormat.parseBoolean(
      this.get( FIELD_PERSONENAUFZUG ) );
  }

  public BigDecimal getPreis()
  {
    try
    {
      return Is24CsvFormat.parseDecimal(
        this.get( FIELD_PREIS ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Preis'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public BigDecimal getPreisProParkflaeche()
  {
    try
    {
      return Is24CsvFormat.parseDecimal(
        this.get( FIELD_PREIS_PRO_PARKFLAECHE ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Preis pro Parkflaeche'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public Integer getSanierungsjahr()
  {
    try
    {
      return Is24CsvFormat.parseInteger(
        this.get( FIELD_SANIERUNGSJAHR ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Sanierungsjahr'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public String getVerfuegbarAb()
  {
    return this.get( FIELD_VERFUEGBAR_AB );
  }

  public VermarktungsartGewerbe getVermarktungsart()
  {
    return VermarktungsartGewerbe.parse(
      this.get( FIELD_VERMARKTUNGSART ) );
  }

  public static GewerbeGastronomieHotel newRecord( CSVRecord record )
  {
    GewerbeGastronomieHotel is24Record = new GewerbeGastronomieHotel();
    is24Record.parse( record );
    return is24Record;
  }

  @Override
  protected Iterable<String> print()
  {
    this.setImmobilienart( Immobilienart.GEWERBE_GASTRONOMIE_HOTEL );
    return super.print();
  }

  public void setAnzahlBetten( Number value )
  {
    this.set( FIELD_ANZAHL_BETTEN,
      Is24CsvFormat.printNumber( value, 5 ) );
  }

  public void setAnzahlGastraumplaetze( Number value )
  {
    this.set( FIELD_ANZAHL_GASTRAUMPLAETZE,
      Is24CsvFormat.printNumber( value, 5 ) );
  }

  public void setAnzahlParkflaechen( Number value )
  {
    this.set( FIELD_ANZAHL_PARKFLAECHEN,
      Is24CsvFormat.printNumber( value, 5 ) );
  }

  public void setAusstattung( Ausstattung value )
  {
    this.set( FIELD_AUSSTATTUNG,
      (value!=null)? value.print(): null );
  }

  public void setBaujahr( Number value )
  {
    this.set( FIELD_BAUJAHR,
      Is24CsvFormat.printNumber( value, 4 ) );
  }

  public void setBefeuerungsart( Befeuerungsart value )
  {
    this.set( FIELD_BEFEUERUNG,
      (value!=null)? value.print(): null );
  }

  public void setBefeuerungsart( Iterable<Befeuerungsart> values )
  {
    this.set( FIELD_BEFEUERUNG,
      Befeuerungsart.printMultiple( values ) );
  }

  public void setDenkmalschutz( Boolean value )
  {
    this.set( FIELD_DENKMALSCHUTZ,
      Is24CsvFormat.printBoolean( value ) );
  }

  public void setEnergieausweisInklWarmwasser( Boolean value )
  {
    this.set( FIELD_ENERGIEAUSWEIS_INKL_WARMWASSER,
      Is24CsvFormat.printBoolean( value ) );
  }

  public void setEnergieausweisKennwert( Number value )
  {
    this.set( FIELD_ENERGIEAUSWEIS_KENNWERT,
      Is24CsvFormat.printNumber( value, 5, 2 ) );
  }

  public void setEnergieausweisTyp( EnergieausweisTyp value )
  {
    this.set( FIELD_ENERGIEAUSWEIS_TYP,
      (value!=null)? value.print(): null );
  }

  public void setEtagen( String value )
  {
    this.set( FIELD_ETAGEN,
      Is24CsvFormat.printString( value, 50 ) );
  }

  public void setFahrtwegAutobahn( Number value )
  {
    this.set( FIELD_FAHRTWEG_AUTOBAHN,
      Is24CsvFormat.printNumber( value, 3 ) );
  }

  public void setFahrtwegFlughafen( Number value )
  {
    this.set( FIELD_FAHRTWEG_FLUGHAFEN,
      Is24CsvFormat.printNumber( value, 3 ) );
  }

  public void setFahrtwegHauptbahnhof( Number value )
  {
    this.set( FIELD_FAHRTWEG_HAUPTBAHNHOF,
      Is24CsvFormat.printNumber( value, 2 ) );
  }

  public void setFusswegNahverkehr( Number value )
  {
    this.set( FIELD_FUSSWEG_NAHVERKEHR,
      Is24CsvFormat.printNumber( value, 2 ) );
  }

  public void setGastterrasse( Boolean value )
  {
    this.set( FIELD_GASTTERRASSE,
      Is24CsvFormat.printBoolean( value ) );
  }

  public void setGesamtflaeche( Number value )
  {
    this.set( FIELD_GESAMTFLAECHE,
      Is24CsvFormat.printNumber( value, 10, 2 ) );
  }

  public void setGewerbeflaeche( Number value )
  {
    this.set( FIELD_GEWERBEFLAECHE,
      Is24CsvFormat.printNumber( value, 10, 2 ) );
  }

  public void setHeizungsart( Heizungsart value )
  {
    this.set( FIELD_HEIZUNGSART,
      (value!=null)? value.print(): null );
  }

  public void setKaution( String value )
  {
    this.set( FIELD_KAUTION,
      Is24CsvFormat.printString( value, 50 ) );
  }

  public void setKeller( Boolean value )
  {
    this.set( FIELD_KELLER,
      Is24CsvFormat.printBoolean( value ) );
  }

  public void setNebenflaeche( Number value )
  {
    this.set( FIELD_NEBENFLAECHE,
      Is24CsvFormat.printNumber( value, 10, 2 ) );
  }

  public void setNebenkosten( Number value )
  {
    this.set( FIELD_NEBENKOSTEN,
      Is24CsvFormat.printNumber( value, 15, 2 ) );
  }

  public void setObjektkategorie( ObjektkategorieGewerbeGastronomieHotel value )
  {
    this.set( FIELD_OBJEKTKATEGORIE,
      (value!=null)? value.print(): null );
  }

  public void setObjektzustand( Objektzustand value )
  {
    this.set( FIELD_OBJEKTZUSTAND,
      (value!=null)? value.print(): null );
  }

  public void setPersonenaufzug( Boolean value )
  {
    this.set( FIELD_PERSONENAUFZUG,
      Is24CsvFormat.printBoolean( value ) );
  }

  public void setPreis( Number value )
  {
    this.set( FIELD_PREIS,
      Is24CsvFormat.printNumber( value, 15, 2 ) );
  }

  public void setPreisProParkflaeche( Number value )
  {
    this.set( FIELD_PREIS_PRO_PARKFLAECHE,
      Is24CsvFormat.printNumber( value, 15, 2 ) );
  }

  public void setSanierungsjahr( Number value )
  {
    this.set( FIELD_SANIERUNGSJAHR,
      Is24CsvFormat.printNumber( value, 4 ) );
  }

  public void setVerfuegbarAb( String value )
  {
    this.set( FIELD_VERFUEGBAR_AB,
      Is24CsvFormat.printString( value, 50 ) );
  }

  public void setVermarktungsart( VermarktungsartGewerbe value )
  {
    this.set( FIELD_VERMARKTUNGSART,
      (value!=null)? value.print(): null );
  }
}