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

import org.apache.commons.csv.CSVRecord;
import org.openestate.io.is24_csv.Is24CsvFormat;
import org.openestate.io.is24_csv.Is24CsvRecord;
import org.openestate.io.is24_csv.types.Ausstattung;
import org.openestate.io.is24_csv.types.Befeuerungsart;
import org.openestate.io.is24_csv.types.Bodenbelag;
import org.openestate.io.is24_csv.types.Energieausweistyp;
import org.openestate.io.is24_csv.types.Heizungsart;
import org.openestate.io.is24_csv.types.Immobilienart;
import org.openestate.io.is24_csv.types.KaltmietePro;
import org.openestate.io.is24_csv.types.Lage;
import org.openestate.io.is24_csv.types.ObjektkategorieGewerbeEinzelhandel;
import org.openestate.io.is24_csv.types.Objektzustand;
import org.openestate.io.is24_csv.types.VermarktungsartGewerbe;
import org.openestate.io.is24_csv.types.Zulieferung;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * GewerbeEinzelhandel.
 *
 * @author Andreas Rudolph
 */
public class GewerbeEinzelhandel extends Is24CsvRecord
{
  private final static Logger LOGGER = LoggerFactory.getLogger( GewerbeEinzelhandel.class );

  /** Vermarktungsart, Text 1 */
  protected final static int FIELD_VERMARKTUNGSART = 60;

  /** Objektkategorie 2, Zahl 3 */
  protected final static int FIELD_OBJEKTKATEGORIE = 61;

  /** Verkaufsfläche (gewerbliche Hauptnutzungsfläche), Zahl 10,2 */
  protected final static int FIELD_GEWERBEFLAECHE = 62;

  /** Nebenfläche, Zahl 10,2 */
  protected final static int FIELD_NEBENFLAECHE = 63;

  /** Gesamtfläche, Zahl 10,2 */
  protected final static int FIELD_GESAMTFLAECHE = 64;

  /** Fläche teilbar ab (in m²), Zahl 10,2 */
  protected final static int FIELD_TEILBAR_AB = 65;

  /** Anzahl Parkflächen, Zahl 5 */
  protected final static int FIELD_ANZAHL_PARKFLAECHEN = 66;

  /** Etage(n), Text 50 */
  protected final static int FIELD_ETAGEN = 67;

  /** Baujahr, Zahl 4 */
  protected final static int FIELD_BAUJAHR = 68;

  /** Objektzustand, Zahl 10 */
  protected final static int FIELD_OBJEKTZUSTAND = 69;

  /** Bodenbelag, Zahl 2 */
  protected final static int FIELD_BODENBELAG = 70;

  /** Personenaufzug, Text 1 */
  protected final static int FIELD_PERSONENAUFZUG = 71;

  /** Schaufensterfront (Meter), Zahl 5,2 */
  protected final static int FIELD_SCHAUFENSTERFRONT = 72;

  /** Lageart, Zahl 1 */
  protected final static int FIELD_LAGE = 73;

  /** Rampe, Text 1 */
  protected final static int FIELD_RAMPE = 74;

  /** Zulieferung, Zahl 1 */
  protected final static int FIELD_ZULIEFERUNG = 75;

  /** Lastenaufzug, Text 1 */
  protected final static int FIELD_LASTENAUFZUG = 76;

  /** Lastenaufzug Tragkraft in KG, Zahl 7,2 */
  protected final static int FIELD_LASTENAUFZUG_TRAGKRAFT = 77;

  /** Fussweg zu öffentlichen Verkehrsmitteln (in Min.), Zahl 2 */
  protected final static int FIELD_FUSSWEG_NAHVERKEHR = 78;

  /** Fahrzeit zum nächsten Hauptbahnhof (in Min.), Zahl 2 */
  protected final static int FIELD_FAHRTWEG_HAUPTBAHNHOF = 79;

  /** Fahrzeit zum nächsten BAB (in Min.), Zahl 3 */
  protected final static int FIELD_FAHRTWEG_AUTOBAHN = 80;

  /** Fahrzeit zum nächsten Flughafen (in Min.), Zahl 3 */
  protected final static int FIELD_FAHRTWEG_FLUGHAFEN = 81;

  /** Frei ab/Verfügbar ab/Antrittstermin, Text 50 */
  protected final static int FIELD_VERFUEGBAR_AB = 82;

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

  /** Kaltmiete, Zahl 15,2 */
  protected final static int FIELD_KALTMIETE = 90;

  /** Nebenkosten, Zahl 15,2 */
  protected final static int FIELD_NEBENKOSTEN = 91;

  /** Kaltmiete pro Einheit, Text 2 */
  protected final static int FIELD_KALTMIETE_PRO = 92;

  /** Kaufpreis, Zahl 15,2 */
  protected final static int FIELD_KAUFPREIS = 93;

  /** Preis pro Parkfläche, Zahl 15,2 */
  protected final static int FIELD_PREIS_PRO_PARKFLAECHE = 94;

  /** Kaution, Text 50 */
  protected final static int FIELD_KAUTION = 95;

  /** Qualität der Ausstattung, Zahl 1 */
  protected final static int FIELD_AUSSTATTUNG = 96;

  /** Jahr letzte Modernisierung/ Sanierung, Zahl 4 */
  protected final static int FIELD_SANIERUNGSJAHR = 97;

  /** Deckenlast In kg/m², Zahl 5,2 */
  protected final static int FIELD_DECKENLAST = 98;

  public GewerbeEinzelhandel()
  {
    super();
    this.setImmobilienart( Immobilienart.GEWERBE_EINZELHANDEL );
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

  public Bodenbelag getBodenbelag()
  {
    return Bodenbelag.parse(
      this.get( FIELD_BODENBELAG ) );
  }

  public Double getDeckenlast()
  {
    try
    {
      return Is24CsvFormat.parseDouble(
        this.get( FIELD_DECKENLAST ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Deckenlast'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
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

  public Double getEnergieausweisKennwert()
  {
    try
    {
      return Is24CsvFormat.parseDouble(
        this.get( FIELD_ENERGIEAUSWEIS_KENNWERT ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Energieausweis-Kennwert'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public Energieausweistyp getEnergieausweisTyp()
  {
    return Energieausweistyp.parse(
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

  public Double getGesamtflaeche()
  {
    try
    {
      return Is24CsvFormat.parseDouble(
        this.get( FIELD_GESAMTFLAECHE ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Gesamtflaeche'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public Double getGewerbeflaeche()
  {
    try
    {
      return Is24CsvFormat.parseDouble(
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

  public Double getKaltmiete()
  {
    try
    {
      return Is24CsvFormat.parseDouble(
        this.get( FIELD_KALTMIETE ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Kaltmiete'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public KaltmietePro getKaltmietePro()
  {
    return KaltmietePro.parse(
      this.get( FIELD_KALTMIETE_PRO ) );
  }

  public Double getKaufpreis()
  {
    try
    {
      return Is24CsvFormat.parseDouble(
        this.get( FIELD_KAUFPREIS ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Kaufpreis'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
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

  public Lage getLage()
  {
    return Lage.parse(
      this.get( FIELD_LAGE ) );
  }

  public Boolean getLastenaufzug()
  {
    return Is24CsvFormat.parseBoolean(
      this.get( FIELD_LASTENAUFZUG ) );
  }

  public Double getLastenaufzugTragkraft()
  {
    try
    {
      return Is24CsvFormat.parseDouble(
        this.get( FIELD_LASTENAUFZUG_TRAGKRAFT ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Lastenaufzug Tragkraft'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public Double getNebenflaeche()
  {
    try
    {
      return Is24CsvFormat.parseDouble(
        this.get( FIELD_NEBENFLAECHE ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Nebenflaeche'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public Double getNebenkosten()
  {
    try
    {
      return Is24CsvFormat.parseDouble(
        this.get( FIELD_NEBENKOSTEN ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Nebenkosten'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public ObjektkategorieGewerbeEinzelhandel getObjektkategorie()
  {
    return ObjektkategorieGewerbeEinzelhandel.parse(
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

  public Double getPreisProParkflaeche()
  {
    try
    {
      return Is24CsvFormat.parseDouble(
        this.get( FIELD_PREIS_PRO_PARKFLAECHE ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Preis pro Parkflaeche'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public Boolean getRampe()
  {
    return Is24CsvFormat.parseBoolean(
      this.get( FIELD_RAMPE ) );
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

  public Double getSchaufensterfront()
  {
    try
    {
      return Is24CsvFormat.parseDouble(
        this.get( FIELD_SCHAUFENSTERFRONT ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Schaufensterfront'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public Double getTeilbarAb()
  {
    try
    {
      return Is24CsvFormat.parseDouble(
        this.get( FIELD_TEILBAR_AB ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'teilbar ab'!" );
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

  public Zulieferung getZulieferung()
  {
    return Zulieferung.parse(
      this.get( FIELD_ZULIEFERUNG ) );
  }

  public static GewerbeEinzelhandel newRecord( CSVRecord record )
  {
    GewerbeEinzelhandel is24Record = new GewerbeEinzelhandel();
    is24Record.parse( record );
    return is24Record;
  }

  @Override
  protected Iterable<String> print()
  {
    this.setImmobilienart( Immobilienart.GEWERBE_EINZELHANDEL );
    return super.print();
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

  public void setBodenbelag( Bodenbelag value )
  {
    this.set( FIELD_BODENBELAG,
      (value!=null)? value.print(): null );
  }

  public void setDeckenlast( Number value )
  {
    this.set( FIELD_DECKENLAST,
      Is24CsvFormat.printNumber( value, 5, 2 ) );
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

  public void setEnergieausweisTyp( Energieausweistyp value )
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

  public void setKaltmiete( Number value )
  {
    this.set( FIELD_KALTMIETE,
      Is24CsvFormat.printNumber( value, 15, 2 ) );
  }

  public void setKaltmietePro( KaltmietePro value )
  {
    this.set( FIELD_KALTMIETE_PRO,
      (value!=null)? value.print(): null );
  }

  public void setKaufpreis( Number value )
  {
    this.set( FIELD_KAUFPREIS,
      Is24CsvFormat.printNumber( value, 15, 2 ) );
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

  public void setLage( Lage value )
  {
    this.set( FIELD_LAGE,
      (value!=null)? value.print(): null );
  }

  public void setLastenaufzug( Boolean value )
  {
    this.set( FIELD_LASTENAUFZUG,
      Is24CsvFormat.printBoolean( value ) );
  }

  public void setLastenaufzugTragkraft( Number value )
  {
    this.set( FIELD_LASTENAUFZUG_TRAGKRAFT,
      Is24CsvFormat.printNumber( value, 7, 2 ) );
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

  public void setObjektkategorie( ObjektkategorieGewerbeEinzelhandel value )
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

  public void setPreisProParkflaeche( Number value )
  {
    this.set( FIELD_PREIS_PRO_PARKFLAECHE,
      Is24CsvFormat.printNumber( value, 15, 2 ) );
  }

  public void setRampe( Boolean value )
  {
    this.set( FIELD_RAMPE,
      Is24CsvFormat.printBoolean( value ) );
  }

  public void setSanierungsjahr( Number value )
  {
    this.set( FIELD_SANIERUNGSJAHR,
      Is24CsvFormat.printNumber( value, 4 ) );
  }

  public void setSchaufensterfront( Number value )
  {
    this.set( FIELD_SCHAUFENSTERFRONT,
      Is24CsvFormat.printNumber( value, 5, 2 ) );
  }

  public void setTeilbarAb( Number value )
  {
    this.set( FIELD_TEILBAR_AB,
      Is24CsvFormat.printNumber( value, 10, 2 ) );
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

  public void setZulieferung( Zulieferung value )
  {
    this.set( FIELD_ZULIEFERUNG,
      (value!=null)? value.print(): null );
  }
}