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

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import org.apache.commons.lang3.StringUtils;
import org.openestate.io.is24_csv.Is24CsvFormat;
import org.openestate.io.is24_csv.Is24CsvRecord;
import org.openestate.io.is24_csv.types.Auswahl;
import org.openestate.io.is24_csv.types.Befeuerungsart;
import org.openestate.io.is24_csv.types.Energieausweistyp;
import org.openestate.io.is24_csv.types.Geschlecht;
import org.openestate.io.is24_csv.types.HeizungsartWohnenAufZeit;
import org.openestate.io.is24_csv.types.Immobilienart;
import org.openestate.io.is24_csv.types.ObjektkategorieWohnenAufZeit;
import org.openestate.io.is24_csv.types.Objektzustand;
import org.openestate.io.is24_csv.types.PauschalmietePro;
import org.openestate.io.is24_csv.types.Rauchen;
import org.openestate.io.is24_csv.types.Stellplatz;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * WohnenAufZeit.
 *
 * @author Andreas Rudolph
 */
public class WohnenAufZeit extends Is24CsvRecord
{
  private final static Logger LOGGER = LoggerFactory.getLogger( WohnenAufZeit.class );

  /** Objektkategorie 2, Zahl 3 */
  protected final static int FIELD_OBJEKTKATEGORIE = 60;

  /** Wohnfläche, Zahl 7,2 */
  protected final static int FIELD_WOHNFLAECHE = 61;

  /** Zimmer, Zahl 2,1 */
  protected final static int FIELD_ZIMMER = 62;

  /** Frei bis, Datum 10 (TT.MM.JJJJ) */
  protected final static int FIELD_FREI_BIS = 63;

  /** Mindestmietdauer in Monaten, Zahl 5,2 */
  protected final static int FIELD_MIETDAUER_MINIMUM = 64;

  /** max. Mietdauer in Monaten, Zahl 5,2 */
  protected final static int FIELD_MIETDAUER_MAXIMUM = 65;

  /** Etage, Zahl 3 */
  protected final static int FIELD_ETAGE = 66;

  /** Etagenzahl, Zahl 2 */
  protected final static int FIELD_ETAGENZAHL = 67;

  /** Objektzustand, Zahl 10 */
  protected final static int FIELD_OBJEKTZUSTAND = 68;

  /** Heizungsart, Zahl 10 */
  protected final static int FIELD_HEIZUNGSART = 69;

  /** Aufzug, Text 1 */
  protected final static int FIELD_AUFZUG = 70;

  /** Haustiere, Text 1 */
  protected final static int FIELD_HAUSTIERE = 71;

  /** Balkon/Terrasse, Text 1 */
  protected final static int FIELD_BALKON_TERRASSE = 72;

  /** Garten/-mitbenutzung, Text 1 */
  protected final static int FIELD_GARTENNUTZUNG = 73;

  /** Mobiliar, Text 1 */
  protected final static int FIELD_MOBILIAR = 74;

  /** Raucher/Nichtraucher, Zahl 1 */
  protected final static int FIELD_RAUCHEN = 75;

  /** Geschlecht (gesucht), Zahl 1 */
  protected final static int FIELD_GESCHLECHT = 76;

  /** Anzahl Personen, Zahl 2 */
  protected final static int FIELD_ANZAHL_PERSONEN = 77;

  /** Frei ab/Verfügbar ab/Antrittstermin, Datum 10 (TT.MM.JJJJ) */
  protected final static int FIELD_FREI_AB = 78;

  /** Parkplatz/Stellplatz, Text 1 */
  protected final static int FIELD_STELLPLATZ = 79;

  /** Rollstuhlgerecht, Text 1 */
  protected final static int FIELD_ROLLSTUHLGERECHT = 80;

  /** Anzahl Garage/Stellplatz, Zahl 2 */
  protected final static int FIELD_ANZAHL_GARAGE_STELLPLATZ = 81;

  /** Barrierefrei, Text 1 */
  protected final static int FIELD_BARRIEREFREI = 82;

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

  /** Keller, Text 1 */
  protected final static int FIELD_KELLER = 89;

  /** Miete Pauschal, Zahl 15,2 */
  protected final static int FIELD_PAUSCHALMIETE = 90;

  /** Miete pauschal pro, Zahl 15,2 */
  protected final static int FIELD_PAUSCHALMIETE_PRO = 91;

  /** Kaltmiete, Zahl 15,2 */
  protected final static int FIELD_KALTMIETE = 92;

  /** Nebenkosten, Zahl 15,2 */
  protected final static int FIELD_NEBENKOSTEN = 93;

  /** Kaution, Text 50 */
  protected final static int FIELD_KAUTION = 94;

  /** Parkplatz-/Stellplatzmiete, Zahl 15,2 */
  protected final static int FIELD_STELLPLATZMIETE = 95;

  public WohnenAufZeit()
  {
    super();
    this.setImmobilienart( Immobilienart.WOHNEN_AUF_ZEIT );
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

  public Integer getAnzahlPersonen()
  {
    try
    {
      return this.getAsInteger( FIELD_ANZAHL_PERSONEN );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Anzahl Personen' "
        + "from '" + this.get( FIELD_ANZAHL_PERSONEN ) + "'!" );
      return null;
    }
  }

  public Boolean getAufzug()
  {
    return this.getAsBoolean( FIELD_AUFZUG );
  }

  public Boolean getBalkonTerrasse()
  {
    return this.getAsBoolean( FIELD_BALKON_TERRASSE );
  }

  public Boolean getBarrierefrei()
  {
    return this.getAsBoolean( FIELD_BARRIEREFREI );
  }

  public Befeuerungsart[] getBefeuerungsart()
  {
    return Befeuerungsart.parseList( this.get( FIELD_BEFEUERUNG ) );
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

  public Integer getEtage()
  {
    try
    {
      return this.getAsInteger( FIELD_ETAGE );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Etage' "
        + "from '" + this.get( FIELD_ETAGE ) + "'!" );
      return null;
    }
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

  public Calendar getFreiAb()
  {
    try
    {
      return Is24CsvFormat.parseDateAsCalendar( this.get( FIELD_FREI_AB ) );
    }
    catch (ParseException ex)
    {
      LOGGER.warn( "Can't read 'frei ab' "
        + "from '" + this.get( FIELD_FREI_AB )  + "'!" );
      return null;
    }
  }

  public Calendar getFreiBis()
  {
    try
    {
      return Is24CsvFormat.parseDateAsCalendar( this.get( FIELD_FREI_BIS ) );
    }
    catch (ParseException ex)
    {
      LOGGER.warn( "Can't read 'frei bis' "
        + "from '" + this.get( FIELD_FREI_BIS ) + "'!" );
      return null;
    }
  }

  public Boolean getGaesteWc()
  {
    return this.getAsBoolean( FIELD_GAESTE_WC );
  }

  public Boolean getGartennutzung()
  {
    return this.getAsBoolean( FIELD_GARTENNUTZUNG );
  }

  public Geschlecht getGeschlecht()
  {
    return Geschlecht.parse( this.get( FIELD_GESCHLECHT ) );
  }

  public Auswahl getHaustiere()
  {
    return Auswahl.parse( this.get( FIELD_HAUSTIERE ) );
  }

  public HeizungsartWohnenAufZeit getHeizungsart()
  {
    return HeizungsartWohnenAufZeit.parse( this.get( FIELD_HEIZUNGSART ) );
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

  public Double getMietdauerMaximum()
  {
    try
    {
      return this.getAsDouble( FIELD_MIETDAUER_MAXIMUM );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Maximalmietdauer' "
        + "from '" + this.get( FIELD_MIETDAUER_MAXIMUM ) + "'!" );
      return null;
    }
  }

  public Double getMietdauerMinimum()
  {
    try
    {
      return this.getAsDouble( FIELD_MIETDAUER_MINIMUM );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Mindestmietdauer' "
        + "from '" + this.get( FIELD_MIETDAUER_MINIMUM ) + "'!" );
      return null;
    }
  }

  public Boolean getMobiliar()
  {
    return this.getAsBoolean( FIELD_MOBILIAR );
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

  public ObjektkategorieWohnenAufZeit getObjektkategorie()
  {
    return ObjektkategorieWohnenAufZeit.parse( this.get( FIELD_OBJEKTKATEGORIE ) );
  }

  public Objektzustand getObjektzustand()
  {
    return Objektzustand.parse( this.get( FIELD_OBJEKTZUSTAND ) );
  }

  public Double getPauschalmiete()
  {
    try
    {
      return this.getAsDouble( FIELD_PAUSCHALMIETE );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Pauschalmiete' "
        + "from '" + this.get( FIELD_PAUSCHALMIETE ) + "'!" );
      return null;
    }
  }

  public PauschalmietePro getPauschalmietePro()
  {
    return PauschalmietePro.parse( this.get( FIELD_PAUSCHALMIETE_PRO ) );
  }

  public Rauchen getRauchen()
  {
    return Rauchen.parse( this.get( FIELD_RAUCHEN ) );
  }

  @Deprecated
  public Boolean getRollstuhlgerecht()
  {
    return this.getAsBoolean( FIELD_ROLLSTUHLGERECHT );
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
    this.setImmobilienart( Immobilienart.WOHNEN_AUF_ZEIT );
    return super.print();
  }

  public void setAnzahlGarageStellplatz( Integer value )
  {
    this.set( FIELD_ANZAHL_GARAGE_STELLPLATZ,
      Is24CsvFormat.printNumber( value, 2 ) );
  }

  public void setAnzahlPersonen( Integer value )
  {
    this.set( FIELD_ANZAHL_PERSONEN,
      Is24CsvFormat.printNumber( value, 2 ) );
  }

  public void setAufzug( Boolean value )
  {
    this.set( FIELD_AUFZUG,
      Is24CsvFormat.printBoolean( value ) );
  }

  public void setBalkonTerrasse( Boolean value )
  {
    this.set( FIELD_BALKON_TERRASSE,
      Is24CsvFormat.printBoolean( value ) );
  }

  public void setBarrierefrei( Boolean value )
  {
    this.set( FIELD_BARRIEREFREI,
      Is24CsvFormat.printBoolean( value ) );
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

  public void setEtage( Integer value )
  {
    this.set( FIELD_ETAGE,
      Is24CsvFormat.printNumber( value, 3 ) );
  }

  public void setEtagenzahl( Integer value )
  {
    this.set( FIELD_ETAGENZAHL,
      Is24CsvFormat.printNumber( value, 2 ) );
  }

  public void setFreiAb( Calendar value )
  {
    this.set( FIELD_FREI_AB,
      Is24CsvFormat.printDate( value ) );
  }

  public void setFreiAb( Date value )
  {
    this.set( FIELD_FREI_AB,
      Is24CsvFormat.printDate( value ) );
  }

  public void setFreiBis( Calendar value )
  {
    this.set( FIELD_FREI_BIS,
      Is24CsvFormat.printDate( value ) );
  }

  public void setFreiBis( Date value )
  {
    this.set( FIELD_FREI_BIS,
      Is24CsvFormat.printDate( value ) );
  }

  public void setGaesteWc( Boolean value )
  {
    this.set( FIELD_GAESTE_WC,
      Is24CsvFormat.printBoolean( value ) );
  }

  public void setGartennutzung( Boolean value )
  {
    this.set( FIELD_GARTENNUTZUNG,
      Is24CsvFormat.printBoolean( value ) );
  }

  public void setGeschlecht( Geschlecht value )
  {
    this.set( FIELD_GESCHLECHT,
      (value!=null)? value.print(): null );
  }

  public void setHaustiere( Auswahl value )
  {
    this.set( FIELD_HAUSTIERE,
      (value!=null)? value.print(): null );
  }

  public void setHeizungsart( HeizungsartWohnenAufZeit value )
  {
    this.set( FIELD_HEIZUNGSART,
      (value!=null)? value.print(): null );
  }

  public void setKaltmiete( Double value )
  {
    this.set( FIELD_KALTMIETE,
      Is24CsvFormat.printNumber( value, 15, 2 ) );
  }

  public void setKaution( String value )
  {
    this.set( FIELD_KAUTION,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 50 ) );
  }

  public void setKeller( Boolean value )
  {
    this.set( FIELD_KELLER,
      Is24CsvFormat.printBoolean( value ) );
  }

  public void setMietdauerMaximum( Double value )
  {
    this.set( FIELD_MIETDAUER_MAXIMUM,
      Is24CsvFormat.printNumber( value, 5, 2 ) );
  }

  public void setMietdauerMinimum( Double value )
  {
    this.set( FIELD_MIETDAUER_MINIMUM,
      Is24CsvFormat.printNumber( value, 5, 2 ) );
  }

  public void setMobiliar( Boolean value )
  {
    this.set( FIELD_MOBILIAR,
      Is24CsvFormat.printBoolean( value ) );
  }

  public void setNebenkosten( Double value )
  {
    this.set( FIELD_NEBENKOSTEN,
      Is24CsvFormat.printNumber( value, 15, 2 ) );
  }

  public void setObjektkategorie( ObjektkategorieWohnenAufZeit value )
  {
    this.set( FIELD_OBJEKTKATEGORIE,
      (value!=null)? value.print(): null );
  }

  public void setObjektzustand( Objektzustand value )
  {
    this.set( FIELD_OBJEKTZUSTAND,
      (value!=null)? value.print(): null );
  }

  public void setPauschalmiete( Double value )
  {
    this.set( FIELD_PAUSCHALMIETE,
      Is24CsvFormat.printNumber( value, 15, 2 ) );
  }

  public void setPauschalmietePro( PauschalmietePro value )
  {
    this.set( FIELD_PAUSCHALMIETE_PRO,
      (value!=null)? value.print(): null );
  }

  public void setRauchen( Rauchen value )
  {
    this.set( FIELD_RAUCHEN,
      (value!=null)? value.print(): null );
  }

  @Deprecated
  public void setRollstuhlgerecht( Boolean value )
  {
    this.set( FIELD_ROLLSTUHLGERECHT,
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

  public void setWohnflaeche( Double value )
  {
    this.set( FIELD_WOHNFLAECHE,
      Is24CsvFormat.printNumber( value, 7, 2 ) );
  }

  public void setZimmer( Double value )
  {
    this.set( FIELD_ZIMMER,
      Is24CsvFormat.printNumber( value, 2, 1 ) );
  }
}