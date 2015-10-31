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
import org.openestate.io.is24_csv.types.Befeuerungsart;
import org.openestate.io.is24_csv.types.Bodenbelag;
import org.openestate.io.is24_csv.types.EnergieausweisTyp;
import org.openestate.io.is24_csv.types.Heizungsart;
import org.openestate.io.is24_csv.types.Immobilienart;
import org.openestate.io.is24_csv.types.KaltmietePro;
import org.openestate.io.is24_csv.types.ObjektkategorieGewerbeHalleProduktion;
import org.openestate.io.is24_csv.types.Objektzustand;
import org.openestate.io.is24_csv.types.VermarktungsartGewerbe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Record from the IS24-CSV format for storage / production objects.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public class GewerbeHalleProduktion extends Is24CsvRecord
{
  private final static Logger LOGGER = LoggerFactory.getLogger( GewerbeHalleProduktion.class );

  /** Vermarktungsart, Text 1 */
  protected final static int FIELD_VERMARKTUNGSART = 60;

  /** Objektkategorie 2, Zahl 3 */
  protected final static int FIELD_OBJEKTKATEGORIE = 61;

  /** Lager-/Produktionsfläche (gewerbliche Hauptnutzungsfläche), Zahl 10,2 */
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

  /** Hebebühne, Text 1 */
  protected final static int FIELD_HEBEBUEHNE = 72;

  /** Hallenhöhe, Zahl 5,2 */
  protected final static int FIELD_HALLENHOEHE = 73;

  /** Rampe, Text 1 */
  protected final static int FIELD_RAMPE = 74;

  /** Bodenbelastung, Zahl 7,2 */
  protected final static int FIELD_BODENBELASTUNG = 75;

  /** Lastenaufzug, Text 1 */
  protected final static int FIELD_LASTENAUFZUG = 76;

  /** Lastenaufzug Tragkraft in KG, Zahl 7,2 */
  protected final static int FIELD_LASTENAUFZUG_TRAGKRAFT = 77;

  /** Kranbahn, Text 1 */
  protected final static int FIELD_KRANBAHN = 78;

  /** Kranbahn-Traglast in Tonnen, Zahl 7,2 */
  protected final static int FIELD_KRANBAHN_TRAGKRAFT = 79;

  /** Grundstücksfläche, Zahl 10,2 */
  protected final static int FIELD_GRUNDSTUECKSFLAECHE = 80;

  /** Stromanschlusswert (KVA), Zahl 5 */
  protected final static int FIELD_STROMANSCHLUSSWERT = 81;

  /** Fussweg zu öffentlichen Verkehrsmitteln (in Min.), Zahl 2 */
  protected final static int FIELD_FUSSWEG_NAHVERKEHR = 82;

  /** Fahrzeit zum nächsten Hauptbahnhof (in Min.), Zahl 2 */
  protected final static int FIELD_FAHRTWEG_HAUPTBAHNHOF = 83;

  /** Fahrzeit zum nächsten BAB (in Min.), Zahl 3 */
  protected final static int FIELD_FAHRTWEG_AUTOBAHN = 84;

  /** Fahrzeit zum nächsten Flughafen (in Min.), Zahl 3 */
  protected final static int FIELD_FAHRTWEG_FLUGHAFEN = 85;

  /** Frei ab/Verfügbar ab/Antrittstermin, Text 50 */
  protected final static int FIELD_VERFUEGBAR_AB = 87;

  /** Heizungsart, Zahl 10 */
  protected final static int FIELD_HEIZUNGSART = 87;

  /** Jahr letzte Modernisierung/ Sanierung, Zahl 4 */
  protected final static int FIELD_SANIERUNGSJAHR = 88;

  /** Befeuerungsart, Zahl 2 (Mehrfachauswahl möglich, wenn Eingaben durch Semikolon getrennt werden. Jeder mögliche Wert darf max. einmal erscheinen.) */
  protected final static int FIELD_BEFEUERUNG = 89;

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

  /** Energieausweistyp, Zahl 1 */
  protected final static int FIELD_ENERGIEAUSWEIS_TYP = 96;

  /** Kennwert in kWh/(m²*a), Zahl 5,2 */
  protected final static int FIELD_ENERGIEAUSWEIS_KENNWERT = 97;

  /** Energieverbrauch für Warmwasser enthalten, Text 1 (Nur relevant falls Energieausweistyp=VERBRAUCH. In allen anderen Fällen darf das Feld nicht gesetzt sein.) */
  protected final static int FIELD_ENERGIEAUSWEIS_INKL_WARMWASSER = 98;

  public GewerbeHalleProduktion()
  {
    super();
    this.setImmobilienart( Immobilienart.GEWERBE_HALLE_PRODUKTION );
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

  public BigDecimal getBodenbelastung()
  {
    try
    {
      return Is24CsvFormat.parseDecimal(
        this.get( FIELD_BODENBELASTUNG ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Bodenbelastung'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
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

  public BigDecimal getGrundstuecksflaeche()
  {
    try
    {
      return Is24CsvFormat.parseDecimal(
        this.get( FIELD_GRUNDSTUECKSFLAECHE ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Grundstuecksflaeche'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public BigDecimal getHallenhoehe()
  {
    try
    {
      return Is24CsvFormat.parseDecimal(
        this.get( FIELD_HALLENHOEHE ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Hallenhoehe'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public Boolean getHebebuehne()
  {
    return Is24CsvFormat.parseBoolean(
      this.get( FIELD_HEBEBUEHNE ) );
  }

  public Heizungsart getHeizungsart()
  {
    return Heizungsart.parse(
      this.get( FIELD_HEIZUNGSART ) );
  }

  public BigDecimal getKaltmiete()
  {
    try
    {
      return Is24CsvFormat.parseDecimal(
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

  public BigDecimal getKaufpreis()
  {
    try
    {
      return Is24CsvFormat.parseDecimal(
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

  public Boolean getKranbahn()
  {
    return Is24CsvFormat.parseBoolean(
      this.get( FIELD_KRANBAHN ) );
  }

  public BigDecimal getKranbahnTragkraft()
  {
    try
    {
      return Is24CsvFormat.parseDecimal(
        this.get( FIELD_KRANBAHN_TRAGKRAFT ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Kranbahn Tragkraft'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public Boolean getLastenaufzug()
  {
    return Is24CsvFormat.parseBoolean(
      this.get( FIELD_LASTENAUFZUG ) );
  }

  public BigDecimal getLastenaufzugTragkraft()
  {
    try
    {
      return Is24CsvFormat.parseDecimal(
        this.get( FIELD_LASTENAUFZUG_TRAGKRAFT ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Lastenaufzug Tragkraft'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
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

  public ObjektkategorieGewerbeHalleProduktion getObjektkategorie()
  {
    return ObjektkategorieGewerbeHalleProduktion.parse(
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

  public Integer getStromanschlusswert()
  {
    try
    {
      return Is24CsvFormat.parseInteger(
        this.get( FIELD_STROMANSCHLUSSWERT ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Stromanschlusswert'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public BigDecimal getTeilbarAb()
  {
    try
    {
      return Is24CsvFormat.parseDecimal(
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

  public static GewerbeHalleProduktion newRecord( CSVRecord record )
  {
    GewerbeHalleProduktion is24Record = new GewerbeHalleProduktion();
    is24Record.parse( record );
    return is24Record;
  }

  @Override
  protected Iterable<String> print()
  {
    this.setImmobilienart( Immobilienart.GEWERBE_HALLE_PRODUKTION );
    return super.print();
  }

  public void setAnzahlParkflaechen( Number value )
  {
    this.set( FIELD_ANZAHL_PARKFLAECHEN,
      Is24CsvFormat.printNumber( value, 5 ) );
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

  public void setBodenbelastung( Number value )
  {
    this.set( FIELD_BODENBELASTUNG,
      Is24CsvFormat.printNumber( value, 7, 2 ) );
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

  public void setGrundstuecksflaeche( Number value )
  {
    this.set( FIELD_GRUNDSTUECKSFLAECHE,
      Is24CsvFormat.printNumber( value, 10, 2 ) );
  }

  public void setHallenhoehe( Number value )
  {
    this.set( FIELD_HALLENHOEHE,
      Is24CsvFormat.printNumber( value, 5, 2 ) );
  }

  public void setHebebuehne( Boolean value )
  {
    this.set( FIELD_HEBEBUEHNE,
      Is24CsvFormat.printBoolean( value ) );
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

  public void setKranbahn( Boolean value )
  {
    this.set( FIELD_KRANBAHN,
      Is24CsvFormat.printBoolean( value ) );
  }

  public void setKranbahnTragkraft( Number value )
  {
    this.set( FIELD_KRANBAHN_TRAGKRAFT,
      Is24CsvFormat.printNumber( value, 7, 2 ) );
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
      Is24CsvFormat.printNumber( value, 10, 2 ) );
  }

  public void setObjektkategorie( ObjektkategorieGewerbeHalleProduktion value )
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

  public void setStromanschlusswert( Number value )
  {
    this.set( FIELD_STROMANSCHLUSSWERT,
      Is24CsvFormat.printNumber( value, 5 ) );
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
}