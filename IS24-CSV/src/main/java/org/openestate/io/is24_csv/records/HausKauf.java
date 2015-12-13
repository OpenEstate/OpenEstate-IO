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
import org.openestate.io.is24_csv.types.Bauphase;
import org.openestate.io.is24_csv.types.Befeuerungsart;
import org.openestate.io.is24_csv.types.EnergieausweisTyp;
import org.openestate.io.is24_csv.types.Heizungsart;
import org.openestate.io.is24_csv.types.Immobilienart;
import org.openestate.io.is24_csv.types.ObjektkategorieHaus;
import org.openestate.io.is24_csv.types.Objektzustand;
import org.openestate.io.is24_csv.types.Stellplatz;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Record from the IS24-CSV format for houses to purchase.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public class HausKauf extends Is24CsvRecord
{
  private final static Logger LOGGER = LoggerFactory.getLogger( HausKauf.class );

  /** Objektkategorie 2, Zahl 3 */
  protected final static int FIELD_OBJEKTKATEGORIE = 60;

  /** Wohnfläche, Zahl 10,2 */
  protected final static int FIELD_WOHNFLAECHE = 61;

  /** Nutzfläche, Zahl 10,2 */
  protected final static int FIELD_NUTZFLAECHE = 62;

  /** Zimmer, Zahl 6,2 */
  protected final static int FIELD_ZIMMER = 63;

  /** Anzahl Badezimmer, Zahl 2 */
  protected final static int FIELD_ANZAHL_BADEZIMMER = 64;

  /** Grundstücksfläche, Zahl 10,2 */
  protected final static int FIELD_GRUNDSTUECKSFLAECHE = 65;

  /** Etagenzahl, Zahl 3 */
  protected final static int FIELD_ETAGENZAHL = 66;

  /** Baujahr, Zahl 4 */
  protected final static int FIELD_BAUJAHR = 67;

  /** Objektzustand, Zahl 10 */
  protected final static int FIELD_OBJEKTZUSTAND = 68;

  /** Heizungsart, Zahl 10 */
  protected final static int FIELD_HEIZUNGSART = 69;

  /** Als Ferienhaus geeignet, Text 1 */
  protected final static int FIELD_FERIENHAUS = 70;

  /** Vermietet, Text 1 */
  protected final static int FIELD_VERMIETET = 72;

  /** Parkplatz/Stellplatz, Text 1 */
  protected final static int FIELD_STELLPLATZ = 73;

  /** Frei ab/Verfügbar ab/Antrittstermin, Text 50 */
  protected final static int FIELD_VERFUEGBAR_AB = 74;

  /** Rollstuhlgerecht, Text 1 */
  protected final static int FIELD_ROLLSTUHLGERECHT = 75;

  /** Anzahl Schlafzimmer Zahl 2 */
  protected final static int FIELD_ANZAHL_SCHLAFZIMMER = 76;

  /** Mit Einliegerwohnung, Text 1 */
  protected final static int FIELD_EINLIEGERWOHNUNG = 77;

  /** Anzahl Garage/Stellplatz, Zahl 2 */
  protected final static int FIELD_ANZAHL_GARAGE_STELLPLATZ = 78;

  /** Barrierefrei, Text 1 */
  protected final static int FIELD_BARRIEREFREI = 79;

  /** Jahr letzte Modernisierung/ Sanierung, Zahl 4 */
  protected final static int FIELD_SANIERUNGSJAHR = 80;

  /** Qualität der Ausstattung, Zahl 1 */
  protected final static int FIELD_AUSSTATTUNG = 81;

  /** Bauphase, Zahl 1 */
  protected final static int FIELD_BAUPHASE = 82;

  /** Befeuerungsart, Zahl 2 (Mehrfachauswahl möglich, wenn Eingaben durch Semikolon getrennt werden. Jeder mögliche Wert darf max. einmal erscheinen.) */
  protected final static int FIELD_BEFEUERUNG = 83;

  /** Energieausweistyp, Zahl 1 */
  protected final static int FIELD_ENERGIEAUSWEIS_TYP = 84;

  /** Kennwert in kWh/(m²*a), Zahl 5,2 */
  protected final static int FIELD_ENERGIEAUSWEIS_KENNWERT = 85;

  /** Energieverbrauch für Warmwasser enthalten, Text 1 (Nur relevant falls Energieausweistyp=VERBRAUCH. In allen anderen Fällen darf das Feld nicht gesetzt sein.) */
  protected final static int FIELD_ENERGIEAUSWEIS_INKL_WARMWASSER = 86;

  /** Gäste-WC, Text 1 */
  protected final static int FIELD_GAESTE_WC = 87;

  /** Denkmalschutzobjekt, Text 1 */
  protected final static int FIELD_DENKMALSCHUTZ = 88;

  /** Keller, Text 1 */
  protected final static int FIELD_KELLER = 89;

  /** Kaufpreis, Zahl 15,2 */
  protected final static int FIELD_KAUFPREIS = 90;

  /** Parkplatz-/Stellplatz Kaufpreis, Zahl 15,2 */
  protected final static int FIELD_STELLPLATZPREIS = 92;

  /** Mieteinnahmen pro Monat, Zahl 15,2 */
  protected final static int FIELD_MIETEINNAHMEN_PRO_MONAT = 93;

  public HausKauf()
  {
    super();
    this.setImmobilienart( Immobilienart.HAUS_KAUF );
  }

  public Integer getAnzahlBadezimmer()
  {
    try
    {
      return Is24CsvFormat.parseInteger(
        this.get( FIELD_ANZAHL_BADEZIMMER ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Anzahl Badezimmer'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public Integer getAnzahlGarageStellplatz()
  {
    try
    {
      return Is24CsvFormat.parseInteger(
        this.get( FIELD_ANZAHL_GARAGE_STELLPLATZ ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Anzahl Garage / Stellplatz'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public Integer getAnzahlSchlafzimmer()
  {
    try
    {
      return Is24CsvFormat.parseInteger(
        this.get( FIELD_ANZAHL_SCHLAFZIMMER ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Anzahl Schlafzimmer'!" );
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

  public Bauphase getBauphase()
  {
    return Bauphase.parse(
      this.get( FIELD_BAUPHASE ) );
  }

  public Boolean getBarrierefrei()
  {
    return Is24CsvFormat.parseBoolean(
      this.get( FIELD_BARRIEREFREI ) );
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

  public Boolean getEinliegerwohnung()
  {
    return Is24CsvFormat.parseBoolean(
      this.get( FIELD_EINLIEGERWOHNUNG ) );
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

  public Integer getEtagenzahl()
  {
    try
    {
      return Is24CsvFormat.parseInteger(
        this.get( FIELD_ETAGENZAHL ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Etagenzahl'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public Boolean getFerienhaus()
  {
    return Is24CsvFormat.parseBoolean(
      this.get( FIELD_FERIENHAUS ) );
  }

  public Boolean getGaesteWc()
  {
    return Is24CsvFormat.parseBoolean(
      this.get( FIELD_GAESTE_WC ) );
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

  public Heizungsart getHeizungsart()
  {
    return Heizungsart.parse(
      this.get( FIELD_HEIZUNGSART ) );
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

  public Boolean getKeller()
  {
    return Is24CsvFormat.parseBoolean(
      this.get( FIELD_KELLER ) );
  }

  public BigDecimal getMieteinnahmenProMonat()
  {
    try
    {
      return Is24CsvFormat.parseDecimal(
        this.get( FIELD_MIETEINNAHMEN_PRO_MONAT ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Mieteinnahmen pro Monat'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public BigDecimal getNutzflaeche()
  {
    try
    {
      return Is24CsvFormat.parseDecimal(
        this.get( FIELD_NUTZFLAECHE ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Nutzflaeche'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public ObjektkategorieHaus getObjektkategorie()
  {
    return ObjektkategorieHaus.parse(
      this.get( FIELD_OBJEKTKATEGORIE ) );
  }

  public Objektzustand getObjektzustand()
  {
    return Objektzustand.parse(
      this.get( FIELD_OBJEKTZUSTAND ) );
  }

  @Deprecated
  public Boolean getRollstuhlgerecht()
  {
    return Is24CsvFormat.parseBoolean(
      this.get( FIELD_ROLLSTUHLGERECHT ) );
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

  public Stellplatz getStellplatz()
  {
    return Stellplatz.parse(
      this.get( FIELD_STELLPLATZ ) );
  }

  public BigDecimal getStellplatzpreis()
  {
    try
    {
      return Is24CsvFormat.parseDecimal(
        this.get( FIELD_STELLPLATZPREIS ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Stellplatzpreis'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public String getVerfuegbarAb()
  {
    return this.get( FIELD_VERFUEGBAR_AB );
  }

  public Boolean getVermietet()
  {
    return Is24CsvFormat.parseBoolean(
      this.get( FIELD_VERMIETET ) );
  }

  public BigDecimal getWohnflaeche()
  {
    try
    {
      return Is24CsvFormat.parseDecimal(
        this.get( FIELD_WOHNFLAECHE ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Wohnflaeche'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public BigDecimal getZimmer()
  {
    try
    {
      return Is24CsvFormat.parseDecimal(
        this.get( FIELD_ZIMMER ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Zimmer'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public static HausKauf newRecord( CSVRecord record )
  {
    HausKauf is24Record = new HausKauf();
    is24Record.parse( record );
    return is24Record;
  }

  @Override
  protected Iterable<String> print()
  {
    this.setImmobilienart( Immobilienart.HAUS_KAUF );
    return super.print();
  }

  public void setAnzahlBadezimmer( Number value )
  {
    this.set( FIELD_ANZAHL_BADEZIMMER,
      Is24CsvFormat.printNumber( value, 2 ) );
  }

  public void setAnzahlGarageStellplatz( Number value )
  {
    this.set( FIELD_ANZAHL_GARAGE_STELLPLATZ,
      Is24CsvFormat.printNumber( value, 2 ) );
  }

  public void setAnzahlSchlafzimmer( Number value )
  {
    this.set( FIELD_ANZAHL_SCHLAFZIMMER,
      Is24CsvFormat.printNumber( value, 2 ) );
  }

  public void setAusstattung( Ausstattung value )
  {
    this.set( FIELD_AUSSTATTUNG,
      (value!=null)? value.print(): null );
  }

  public void setBarrierefrei( Boolean value )
  {
    this.set( FIELD_BARRIEREFREI,
      Is24CsvFormat.printBoolean( value ) );
  }

  public void setBaujahr( Number value )
  {
    this.set( FIELD_BAUJAHR,
      Is24CsvFormat.printNumber( value, 4 ) );
  }

  public void setBauphase( Bauphase value )
  {
    this.set( FIELD_BAUPHASE,
      (value!=null)? value.print(): null );
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

  public void setEinliegerwohnung( Boolean value )
  {
    this.set( FIELD_EINLIEGERWOHNUNG,
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

  public void setEtagenzahl( Number value )
  {
    this.set( FIELD_ETAGENZAHL,
      Is24CsvFormat.printNumber( value, 3 ) );
  }

  public void setFerienhaus( Boolean value )
  {
    this.set( FIELD_FERIENHAUS,
      Is24CsvFormat.printBoolean( value ) );
  }

  public void setGaesteWc( Boolean value )
  {
    this.set( FIELD_GAESTE_WC,
      Is24CsvFormat.printBoolean( value ) );
  }

  public void setGrundstuecksflaeche( Number value )
  {
    this.set( FIELD_GRUNDSTUECKSFLAECHE,
      Is24CsvFormat.printNumber( value, 10, 2 ) );
  }

  public void setHeizungsart( Heizungsart value )
  {
    this.set( FIELD_HEIZUNGSART,
      (value!=null)? value.print(): null );
  }

  public void setKaufpreis( Number value )
  {
    this.set( FIELD_KAUFPREIS,
      Is24CsvFormat.printNumber( value, 15, 2 ) );
  }

  public void setKeller( Boolean value )
  {
    this.set( FIELD_KELLER,
      Is24CsvFormat.printBoolean( value ) );
  }

  public void setMieteinnahmenProMonat( Number value )
  {
    this.set( FIELD_MIETEINNAHMEN_PRO_MONAT,
      Is24CsvFormat.printNumber( value, 15, 2 ) );
  }

  public void setNutzflaeche( Number value )
  {
    this.set( FIELD_NUTZFLAECHE,
      Is24CsvFormat.printNumber( value, 10, 2 ) );
  }

  public void setObjektkategorie( ObjektkategorieHaus value )
  {
    this.set( FIELD_OBJEKTKATEGORIE,
      (value!=null)? value.print(): null );
  }

  public void setObjektzustand( Objektzustand value )
  {
    this.set( FIELD_OBJEKTZUSTAND,
      (value!=null)? value.print(): null );
  }

  @Deprecated
  public void setRollstuhlgerecht( Boolean value )
  {
    this.set( FIELD_ROLLSTUHLGERECHT,
      Is24CsvFormat.printBoolean( value ) );
  }

  public void setSanierungsjahr( Number value )
  {
    this.set( FIELD_SANIERUNGSJAHR,
      Is24CsvFormat.printNumber( value, 4 ) );
  }

  public void setStellplatz( Stellplatz value )
  {
    this.set( FIELD_STELLPLATZ,
      (value!=null)? value.print(): null );
  }

  public void setStellplatzpreis( Number value )
  {
    this.set( FIELD_STELLPLATZPREIS,
      Is24CsvFormat.printNumber( value, 15, 2 ) );
  }

  public void setVerfuegbarAb( String value )
  {
    this.set( FIELD_VERFUEGBAR_AB,
      Is24CsvFormat.printString( value, 50 ) );
  }

  public void setVermietet( Boolean value )
  {
    this.set( FIELD_VERMIETET,
      Is24CsvFormat.printBoolean( value ) );
  }

  public void setWohnflaeche( Number value )
  {
    this.set( FIELD_WOHNFLAECHE,
      Is24CsvFormat.printNumber( value, 10, 2 ) );
  }

  public void setZimmer( Number value )
  {
    this.set( FIELD_ZIMMER,
      Is24CsvFormat.printNumber( value, 6, 2 ) );
  }
}