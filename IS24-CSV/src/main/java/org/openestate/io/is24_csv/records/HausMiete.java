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

import org.apache.commons.lang3.StringUtils;
import org.openestate.io.is24_csv.Is24CsvFormat;
import org.openestate.io.is24_csv.Is24CsvRecord;
import org.openestate.io.is24_csv.types.Ausstattung;
import org.openestate.io.is24_csv.types.Auswahl;
import org.openestate.io.is24_csv.types.Befeuerungsart;
import org.openestate.io.is24_csv.types.Energieausweistyp;
import org.openestate.io.is24_csv.types.Heizungsart;
import org.openestate.io.is24_csv.types.Immobilienart;
import org.openestate.io.is24_csv.types.ObjektkategorieHaus;
import org.openestate.io.is24_csv.types.Objektzustand;
import org.openestate.io.is24_csv.types.Stellplatz;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * HausMiete.
 *
 * @author Andreas Rudolph
 */
public class HausMiete extends Is24CsvRecord
{
  private final static Logger LOGGER = LoggerFactory.getLogger( HausMiete.class );

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

  /** Haustiere, Text 1 */
  protected final static int FIELD_HAUSTIERE = 70;

  /** Einbauküche, Text 1 */
  protected final static int FIELD_EINBAUKUECHE = 71;

  /** Seniorengerechtes Wohnen, Text 1 */
  protected final static int FIELD_SENIORENGERECHT = 72;

  /** Anzahl Garage/Stellplatz, Zahl 2 */
  protected final static int FIELD_ANZAHL_GARAGE_STELLPLATZ = 73;

  /** Parkplatz/Stellplatz, Text 1 */
  protected final static int FIELD_STELLPLATZ = 74;

  /** Frei ab/Verfügbar ab/Antrittstermin, Text 50 */
  protected final static int FIELD_VERFUEGBAR_AB = 75;

  /** Rollstuhlgerecht, Text 1 */
  protected final static int FIELD_ROLLSTUHLGERECHT = 76;

  /** Anzahl Schlafzimmer Zahl 2 */
  protected final static int FIELD_ANZAHL_SCHLAFZIMMER = 77;

  /** Befeuerungsart, Zahl 2 (Mehrfachauswahl möglich, wenn Eingaben durch Semikolon getrennt werden. Jeder mögliche Wert darf max. einmal erscheinen.) */
  protected final static int FIELD_BEFEUERUNG = 78;

  /** Energieausweistyp, Zahl 1 */
  protected final static int FIELD_ENERGIEAUSWEIS_TYP = 79;

  /** Kennwert in kWh/(m²*a), Zahl 5,2 */
  protected final static int FIELD_ENERGIEAUSWEIS_KENNWERT = 80;

  /** Energieverbrauch für Warmwasser enthalten, Text 1 (Nur relevant falls Energieausweistyp=VERBRAUCH. In allen anderen Fällen darf das Feld nicht gesetzt sein.) */
  protected final static int FIELD_ENERGIEAUSWEIS_INKL_WARMWASSER = 81;

  /** Gäste-WC, Text 1 */
  protected final static int FIELD_GAESTE_WC = 82;

  /** Qualität der Ausstattung, Zahl 1 */
  protected final static int FIELD_AUSSTATTUNG = 83;

  /** Keller, Text 1 */
  protected final static int FIELD_KELLER = 85;

  /** Barrierefrei, Text 1 */
  protected final static int FIELD_BARRIEREFREI = 86;

  /** Jahr letzte Modernisierung/ Sanierung, Zahl 4 */
  protected final static int FIELD_SANIERUNGSJAHR = 88;

  /** Kaltmiete, Zahl 15,2 */
  protected final static int FIELD_KALTMIETE = 90;

  /** Nebenkosten, Zahl 15,2 */
  protected final static int FIELD_NEBENKOSTEN = 91;

  /** Warmmiete, Zahl 15,2 */
  protected final static int FIELD_WARMMIETE = 92;

  /** Parkplatz-/Stellplatzmiete, Zahl 15,2 */
  protected final static int FIELD_STELLPLATZMIETE = 93;

  /** Kaution, Text 50 */
  protected final static int FIELD_KAUTION = 94;

  /** Heizkosten (Heizung / Warmwasser), Zahl 15,2 */
  protected final static int FIELD_HEIZKOSTEN = 96;

  /** Heizkosten sind in Nebenkosten enthalten, Text 1 */
  protected final static int FIELD_NEBENKOSTEN_INKL_HEIZKOSTEN = 97;

  public HausMiete()
  {
    super();
    this.setImmobilienart( Immobilienart.HAUS_MIETE );
  }

  public Integer getAnzahlBadezimmer()
  {
    try
    {
      return this.getAsInteger( FIELD_ANZAHL_BADEZIMMER );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Anzahl Badezimmer' "
        + "from '" + this.get( FIELD_ANZAHL_BADEZIMMER ) + "'!" );
      return null;
    }
  }

  public Integer getAnzahlGarageStellplatz()
  {
    try
    {
      return this.getAsInteger( FIELD_ANZAHL_GARAGE_STELLPLATZ );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Anzahl Garage / Stellplatz' "
        + "from '" + this.get( FIELD_ANZAHL_GARAGE_STELLPLATZ ) + "'!" );
      return null;
    }
  }

  public Integer getAnzahlSchlafzimmer()
  {
    try
    {
      return this.getAsInteger( FIELD_ANZAHL_SCHLAFZIMMER );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Anzahl Schlafzimmer' "
        + "from '" + this.get( FIELD_ANZAHL_SCHLAFZIMMER ) + "'!" );
      return null;
    }
  }

  public Ausstattung getAusstattung()
  {
    return Ausstattung.parse( this.get( FIELD_AUSSTATTUNG ) );
  }

  public Boolean getBarrierefrei()
  {
    return this.getAsBoolean( FIELD_BARRIEREFREI );
  }

  public Integer getBaujahr()
  {
    try
    {
      return this.getAsInteger( FIELD_BAUJAHR );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Baujahr' "
        + "from '" + this.get( FIELD_BAUJAHR ) + "'!" );
      return null;
    }
  }

  public Befeuerungsart[] getBefeuerungsart()
  {
    return Befeuerungsart.parseList( this.get( FIELD_BEFEUERUNG ) );
  }

  public Boolean getEinbaukueche()
  {
    return this.getAsBoolean( FIELD_EINBAUKUECHE );
  }

  public Boolean getEnergieausweisInklWarmwasser()
  {
    return this.getAsBoolean( FIELD_ENERGIEAUSWEIS_INKL_WARMWASSER );
  }

  public Double getEnergieausweisKennwert()
  {
    try
    {
      return this.getAsDouble( FIELD_ENERGIEAUSWEIS_KENNWERT );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Energieausweis-Kennwert' "
        + "from '" + this.get( FIELD_ENERGIEAUSWEIS_KENNWERT ) + "'!" );
      return null;
    }
  }

  public Energieausweistyp getEnergieausweisTyp()
  {
    return Energieausweistyp.parse( this.get( FIELD_ENERGIEAUSWEIS_TYP ) );
  }

  public Integer getEtagenzahl()
  {
    try
    {
      return this.getAsInteger( FIELD_ETAGENZAHL );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Etagenzahl' "
        + "from '" + this.get( FIELD_ETAGENZAHL ) + "'!" );
      return null;
    }
  }

  public Boolean getGaesteWc()
  {
    return this.getAsBoolean( FIELD_GAESTE_WC );
  }

  public Double getGrundstuecksflaeche()
  {
    try
    {
      return this.getAsDouble( FIELD_GRUNDSTUECKSFLAECHE );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Grundstuecksflaeche' "
        + "from '" + this.get( FIELD_GRUNDSTUECKSFLAECHE ) + "'!" );
      return null;
    }
  }

  public Auswahl getHaustiere()
  {
    return Auswahl.parse( this.get( FIELD_HAUSTIERE ) );
  }

  public Double getHeizkosten()
  {
    try
    {
      return this.getAsDouble( FIELD_HEIZKOSTEN );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Heizkosten' "
        + "from '" + this.get( FIELD_HEIZKOSTEN ) + "'!" );
      return null;
    }
  }

  public Heizungsart getHeizungsart()
  {
    return Heizungsart.parse( this.get( FIELD_HEIZUNGSART ) );
  }

  public Double getKaltmiete()
  {
    try
    {
      return this.getAsDouble( FIELD_KALTMIETE );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Kaltmiete' "
        + "from '" + this.get( FIELD_KALTMIETE ) + "'!" );
      return null;
    }
  }

  public String getKaution()
  {
    return this.get( FIELD_KAUTION );
  }

  public Boolean getKeller()
  {
    return this.getAsBoolean( FIELD_KELLER );
  }

  public Double getNebenkosten()
  {
    try
    {
      return this.getAsDouble( FIELD_NEBENKOSTEN );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Nebenkosten' "
        + "from '" + this.get( FIELD_NEBENKOSTEN ) + "'!" );
      return null;
    }
  }

  public Boolean getNebenkostenInklHeizkosten()
  {
    return this.getAsBoolean( FIELD_NEBENKOSTEN_INKL_HEIZKOSTEN );
  }

  public Double getNutzflaeche()
  {
    try
    {
      return this.getAsDouble( FIELD_NUTZFLAECHE );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Nutzflaeche' "
        + "from '" + this.get( FIELD_NUTZFLAECHE ) + "'!" );
      return null;
    }
  }

  public ObjektkategorieHaus getObjektkategorie()
  {
    return ObjektkategorieHaus.parse( this.get( FIELD_OBJEKTKATEGORIE ) );
  }

  public Objektzustand getObjektzustand()
  {
    return Objektzustand.parse( this.get( FIELD_OBJEKTZUSTAND ) );
  }

  @Deprecated
  public Boolean getRollstuhlgerecht()
  {
    return this.getAsBoolean( FIELD_ROLLSTUHLGERECHT );
  }

  public Integer getSanierungsjahr()
  {
    try
    {
      return this.getAsInteger( FIELD_SANIERUNGSJAHR );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Sanierungsjahr' "
        + "from '" + this.get( FIELD_SANIERUNGSJAHR ) + "'!" );
      return null;
    }
  }

  public Boolean getSeniorengerecht()
  {
    return this.getAsBoolean( FIELD_SENIORENGERECHT );
  }

  public Stellplatz getStellplatz()
  {
    return Stellplatz.parse( this.get( FIELD_STELLPLATZ ) );
  }

  public Double getStellplatzmiete()
  {
    try
    {
      return this.getAsDouble( FIELD_STELLPLATZMIETE );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Stellplatzmiete' "
        + "from '" + this.get( FIELD_STELLPLATZMIETE ) + "'!" );
      return null;
    }
  }

  public String getVerfuegbarAb()
  {
    return this.get( FIELD_VERFUEGBAR_AB );
  }

  public Double getWarmmiete()
  {
    try
    {
      return this.getAsDouble( FIELD_WARMMIETE );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Warmmiete' "
        + "from '" + this.get( FIELD_WARMMIETE ) + "'!" );
      return null;
    }
  }

  public Double getWohnflaeche()
  {
    try
    {
      return this.getAsDouble( FIELD_WOHNFLAECHE );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Wohnflaeche' "
        + "from '" + this.get( FIELD_WOHNFLAECHE ) + "'!" );
      return null;
    }
  }

  public Double getZimmer()
  {
    try
    {
      return this.getAsDouble( FIELD_ZIMMER );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Zimmer' "
        + "from '" + this.get( FIELD_ZIMMER ) + "'!" );
      return null;
    }
  }

  @Override
  protected Iterable<String> print()
  {
    this.setImmobilienart( Immobilienart.HAUS_MIETE );
    return super.print();
  }

  public void setAnzahlBadezimmer( Integer value )
  {
    this.set( FIELD_ANZAHL_BADEZIMMER,
      Is24CsvFormat.printNumber( value, 2 ) );
  }

  public void setAnzahlGarageStellplatz( Integer value )
  {
    this.set( FIELD_ANZAHL_GARAGE_STELLPLATZ,
      Is24CsvFormat.printNumber( value, 2 ) );
  }

  public void setAnzahlSchlafzimmer( Integer value )
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

  public void setBaujahr( Integer value )
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
      Befeuerungsart.print( values ) );
  }

  public void setEinbaukueche( Boolean value )
  {
    this.set( FIELD_EINBAUKUECHE,
      Is24CsvFormat.printBoolean( value ) );
  }

  public void setEnergieausweisInklWarmwasser( Boolean value )
  {
    this.set( FIELD_ENERGIEAUSWEIS_INKL_WARMWASSER,
      Is24CsvFormat.printBoolean( value ) );
  }

  public void setEnergieausweisKennwert( Double value )
  {
    this.set( FIELD_ENERGIEAUSWEIS_KENNWERT,
      Is24CsvFormat.printNumber( value, 5, 2 ) );
  }

  public void setEnergieausweisTyp( Energieausweistyp value )
  {
    this.set( FIELD_ENERGIEAUSWEIS_TYP,
      (value!=null)? value.print(): null );
  }

  public void setEtagenzahl( Integer value )
  {
    this.set( FIELD_ETAGENZAHL,
      Is24CsvFormat.printNumber( value, 3 ) );
  }

  public void setGaesteWc( Boolean value )
  {
    this.set( FIELD_GAESTE_WC,
      Is24CsvFormat.printBoolean( value ) );
  }

  public void setGrundstuecksflaeche( Double value )
  {
    this.set( FIELD_GRUNDSTUECKSFLAECHE,
      Is24CsvFormat.printNumber( value, 10, 2 ) );
  }

  public void setHaustiere( Auswahl value )
  {
    this.set( FIELD_HAUSTIERE,
      (value!=null)? value.print(): null );
  }

  public void setHeizkosten( Double value )
  {
    this.set( FIELD_HEIZKOSTEN,
      Is24CsvFormat.printNumber( value, 15, 2 ) );
  }

  public void setHeizungsart( Heizungsart value )
  {
    this.set( FIELD_HEIZUNGSART,
      (value!=null)? value.print(): null );
  }

  public void setKaution( String value )
  {
    this.set( FIELD_KAUTION,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 50 ) );
  }

  public void setKaltmiete( Double value )
  {
    this.set( FIELD_KALTMIETE,
      Is24CsvFormat.printNumber( value, 15, 2 ) );
  }

  public void setKeller( Boolean value )
  {
    this.set( FIELD_KELLER,
      Is24CsvFormat.printBoolean( value ) );
  }

  public void setNebenkosten( Double value )
  {
    this.set( FIELD_NEBENKOSTEN,
      Is24CsvFormat.printNumber( value, 15, 2 ) );
  }

  public void setNebenkostenInklHeizkosten( Boolean value )
  {
    this.set( FIELD_NEBENKOSTEN_INKL_HEIZKOSTEN,
      Is24CsvFormat.printBoolean( value ) );
  }

  public void setNutzflaeche( Double value )
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

  public void setSanierungsjahr( Integer value )
  {
    this.set( FIELD_SANIERUNGSJAHR,
      Is24CsvFormat.printNumber( value, 4 ) );
  }

  public void setSeniorengerecht( Boolean value )
  {
    this.set( FIELD_SENIORENGERECHT,
      Is24CsvFormat.printBoolean( value ) );
  }

  public void setStellplatz( Stellplatz value )
  {
    this.set( FIELD_STELLPLATZ,
      (value!=null)? value.print(): null );
  }

  public void setStellplatzmiete( Double value )
  {
    this.set( FIELD_STELLPLATZMIETE,
      Is24CsvFormat.printNumber( value, 15, 2 ) );
  }

  public void setVerfuegbarAb( String value )
  {
    this.set( FIELD_VERFUEGBAR_AB,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 50 ) );
  }

  public void setWarmmiete( Double value )
  {
    this.set( FIELD_WARMMIETE,
      Is24CsvFormat.printNumber( value, 15, 2 ) );
  }

  public void setWohnflaeche( Double value )
  {
    this.set( FIELD_WOHNFLAECHE,
      Is24CsvFormat.printNumber( value, 10, 2 ) );
  }

  public void setZimmer( Double value )
  {
    this.set( FIELD_ZIMMER,
      Is24CsvFormat.printNumber( value, 6, 2 ) );
  }
}