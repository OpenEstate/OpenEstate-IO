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
import org.openestate.io.is24_csv.types.Befeuerungsart;
import org.openestate.io.is24_csv.types.Energieausweistyp;
import org.openestate.io.is24_csv.types.Heizungsart;
import org.openestate.io.is24_csv.types.Immobilienart;
import org.openestate.io.is24_csv.types.ObjektkategorieAnlageobjekt;
import org.openestate.io.is24_csv.types.Objektzustand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Anlageobjekt.
 *
 * @author Andreas Rudolph
 */
public class Anlageobjekt extends Is24CsvRecord
{
  private final static Logger LOGGER = LoggerFactory.getLogger( Anlageobjekt.class );

  /** Objektkategorie 2, Zahl 3 */
  protected final static int FIELD_OBJEKTKATEGORIE = 60;

  /** Gesamtfläche (Hauptfläche inkl. Nebenfläche), Zahl 10,2 */
  protected final static int FIELD_GESAMTFLAECHE = 61;

  /** Vermietbare Fläche, Zahl 10,2 */
  protected final static int FIELD_VERMIETBARE_FLAECHE = 62;

  /** Wohnflächen, Zahl 10,2 */
  protected final static int FIELD_WOHNFLAECHE = 63;

  /** Gewerbeflächen, Zahl 10,2 */
  protected final static int FIELD_GEWERBEFLAECHE = 64;

  /** Grundstücksfläche, Zahl 10,2 */
  protected final static int FIELD_GRUNDSTUECKSFLAECHE = 65;

  /** Sonstige Flächen, Zahl 10,2 */
  protected final static int FIELD_SONSTIGE_FLAECHE = 66;

  /** Etage(n), Text 50 */
  protected final static int FIELD_ETAGEN = 67;

  /** Baujahr, Zahl 4 */
  protected final static int FIELD_BAUJAHR = 68;

  /** Objektzustand, Zahl 10 */
  protected final static int FIELD_OBJEKTZUSTAND = 69;

  /** Personenaufzug, Text 1 */
  protected final static int FIELD_PERSONENAUFZUG = 70;

  /** X-fache (KP/Miete p.a.), Zahl 3,1 */
  protected final static int FIELD_X_FACHE = 71;

  /** Mieteinnahmen p.a. (IST) Zahl, 15,2 */
  protected static int FIELD_MIETEINNAHMEN_IST = 72;

  /** Mieteinnahmen p.a. (SOLL) Zahl, 15,2 */
  protected static int FIELD_MIETEINNAHMEN_SOLL = 73;

  /** Anzahl Parkflächen, Zahl 5 */
  protected final static int FIELD_ANZAHL_PARKFLAECHEN = 74;

  /** Fussweg zu öffentlichen Verkehrsmitteln (in Min.), Zahl 2 */
  protected final static int FIELD_FUSSWEG_NAHVERKEHR = 75;

  /** Fahrzeit zum nächsten Hauptbahnhof (in Min.), Zahl 2 */
  protected final static int FIELD_FAHRTWEG_HAUPTBAHNHOF = 76;

  /** Fahrzeit zum nächsten BAB (in Min.), Zahl 3 */
  protected final static int FIELD_FAHRTWEG_AUTOBAHN = 77;

  /** Fahrzeit zum nächsten Flughafen (in Min.), Zahl 3 */
  protected final static int FIELD_FAHRTWEG_FLUGHAFEN = 78;

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

  /** Preis (Kaufpreis), Zahl 15,2 */
  protected final static int FIELD_KAUFPREIS = 90;

  /** Kaufpreis pro m², Zahl 15,2 */
  protected final static int FIELD_KAUFPREIS_PRO_QM = 91;

  /** Betriebskosten umgelegt, Zahl 15,2 */
  protected final static int FIELD_BETRIEBSKOSTEN_UMGELEGT = 92;

  /** Nicht umgelegte Kosten, Zahl 15,2 */
  protected final static int FIELD_NICHT_UMGELEGTE_KOSTEN = 93;

  /** Preis pro Parkfläche, Zahl 15,2 */
  protected final static int FIELD_PREIS_PRO_PARKFLAECHE = 94;


  public Anlageobjekt()
  {
    super();
    this.setImmobilienart( Immobilienart.ANLAGE );
  }

  public Integer getAnzahlParkflaechen()
  {
    try
    {
      return this.getAsInteger( FIELD_ANZAHL_PARKFLAECHEN );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Anzahl Parkflaechen' "
        + "from '" + this.get( FIELD_ANZAHL_PARKFLAECHEN ) + "'!" );
      return null;
    }
  }

  public Ausstattung getAusstattung()
  {
    return Ausstattung.parse( this.get( FIELD_AUSSTATTUNG ) );
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

  public Double getBetriebskostenUmgelegt()
  {
    try
    {
      return this.getAsDouble( FIELD_BETRIEBSKOSTEN_UMGELEGT );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Betriebskosten umgelegt' "
        + "from '" + this.get( FIELD_BETRIEBSKOSTEN_UMGELEGT ) + "'!" );
      return null;
    }
  }

  public Boolean getDenkmalschutz()
  {
    return this.getAsBoolean( FIELD_DENKMALSCHUTZ );
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

  public String getEtagen()
  {
    return this.get( FIELD_ETAGEN );
  }

  public Integer getFahrtwegAutobahn()
  {
    try
    {
      return this.getAsInteger( FIELD_FAHRTWEG_AUTOBAHN );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Fahrtweg zur Autobahn' "
        + "from '" + this.get( FIELD_FAHRTWEG_AUTOBAHN ) + "'!" );
      return null;
    }
  }

  public Integer getFahrtwegFlughafen()
  {
    try
    {
      return this.getAsInteger( FIELD_FAHRTWEG_FLUGHAFEN );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Fahrtweg zum Flughafen' "
        + "from '" + this.get( FIELD_FAHRTWEG_FLUGHAFEN ) + "'!" );
      return null;
    }
  }

  public Integer getFahrtwegHauptbahnhof()
  {
    try
    {
      return this.getAsInteger( FIELD_FAHRTWEG_HAUPTBAHNHOF );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Fahrtweg zum Hauptbahnhof' "
        + "from '" + this.get( FIELD_FAHRTWEG_HAUPTBAHNHOF ) + "'!" );
      return null;
    }
  }

  public Integer getFusswegNahverkehr()
  {
    try
    {
      return this.getAsInteger( FIELD_FUSSWEG_NAHVERKEHR );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Fussweg zum Nahverkehr' "
        + "from '" + this.get( FIELD_FUSSWEG_NAHVERKEHR ) + "'!" );
      return null;
    }
  }

  public Double getGesamtflaeche()
  {
    try
    {
      return this.getAsDouble( FIELD_GESAMTFLAECHE );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Gesamtflaeche' "
        + "from '" + this.get( FIELD_GESAMTFLAECHE ) + "'!" );
      return null;
    }
  }

  public Double getGewerbeflaeche()
  {
    try
    {
      return this.getAsDouble( FIELD_GEWERBEFLAECHE );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Gewerbeflaeche' "
        + "from '" + this.get( FIELD_GEWERBEFLAECHE ) + "'!" );
      return null;
    }
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

  public Heizungsart getHeizungsart()
  {
    return Heizungsart.parse( this.get( FIELD_HEIZUNGSART ) );
  }

  public Double getKaufpreis()
  {
    try
    {
      return this.getAsDouble( FIELD_KAUFPREIS );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Kaufpreis' "
        + "from '" + this.get( FIELD_KAUFPREIS ) + "'!" );
      return null;
    }
  }

  public Double getKaufpreisProQm()
  {
    try
    {
      return this.getAsDouble( FIELD_KAUFPREIS_PRO_QM );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Kaufpreis pro qm' "
        + "from '" + this.get( FIELD_KAUFPREIS_PRO_QM ) + "'!" );
      return null;
    }
  }

  public Double getMieteinnahmenIst()
  {
    try
    {
      return this.getAsDouble( FIELD_MIETEINNAHMEN_IST );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'IST-Mieteinnahmen' "
        + "from '" + this.get( FIELD_MIETEINNAHMEN_IST ) + "'!" );
      return null;
    }
  }

  public Double getMieteinnahmenSoll()
  {
    try
    {
      return this.getAsDouble( FIELD_MIETEINNAHMEN_SOLL );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'SOLL-Mieteinnahmen' "
        + "from '" + this.get( FIELD_MIETEINNAHMEN_SOLL ) + "'!" );
      return null;
    }
  }

  public Double getNichtUmgelegteKosten()
  {
    try
    {
      return this.getAsDouble( FIELD_NICHT_UMGELEGTE_KOSTEN );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'nicht umgelegt eKosten' "
        + "from '" + this.get( FIELD_NICHT_UMGELEGTE_KOSTEN ) + "'!" );
      return null;
    }
  }

  public ObjektkategorieAnlageobjekt getObjektkategorie()
  {
    return ObjektkategorieAnlageobjekt.parse( this.get( FIELD_OBJEKTKATEGORIE ) );
  }

  public Objektzustand getObjektzustand()
  {
    return Objektzustand.parse( this.get( FIELD_OBJEKTZUSTAND ) );
  }

  public Boolean getPersonenaufzug()
  {
    return this.getAsBoolean( FIELD_PERSONENAUFZUG );
  }

  public Double getPreisProParkflaeche()
  {
    try
    {
      return this.getAsDouble( FIELD_PREIS_PRO_PARKFLAECHE );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Preis pro Parkflaeche' "
        + "from '" + this.get( FIELD_PREIS_PRO_PARKFLAECHE ) + "'!" );
      return null;
    }
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

  public Double getSonstigeFlaeche()
  {
    try
    {
      return this.getAsDouble( FIELD_SONSTIGE_FLAECHE );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'sonstige Flaeche' "
        + "from '" + this.get( FIELD_SONSTIGE_FLAECHE ) + "'!" );
      return null;
    }
  }

  public Double getVermietbareFlaeche()
  {
    try
    {
      return this.getAsDouble( FIELD_VERMIETBARE_FLAECHE );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'vermietbare Flaeche' "
        + "from '" + this.get( FIELD_VERMIETBARE_FLAECHE ) + "'!" );
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

  public Double getXFache()
  {
    try
    {
      return this.getAsDouble( FIELD_X_FACHE );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'X-fache' "
        + "from '" + this.get( FIELD_X_FACHE ) + "'!" );
      return null;
    }
  }

  @Override
  protected Iterable<String> print()
  {
    this.setImmobilienart( Immobilienart.ANLAGE );
    return super.print();
  }

  public void setAnzahlParkflaechen( Integer value )
  {
    this.set( FIELD_ANZAHL_PARKFLAECHEN,
      Is24CsvFormat.printNumber( value, 5 ) );
  }

  public void setAusstattung( Ausstattung value )
  {
    this.set( FIELD_AUSSTATTUNG,
      (value!=null)? value.print(): null );
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

  public void setBetriebskostenUmgelegt( Double value )
  {
    this.set( FIELD_BETRIEBSKOSTEN_UMGELEGT,
      Is24CsvFormat.printNumber( value, 15, 2 ) );
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

  public void setEtagen( String value )
  {
    this.set( FIELD_ETAGEN,
      StringUtils.abbreviate( StringUtils.trimToNull( value ), 50 ) );
  }

  public void setFahrtwegAutobahn( Integer value )
  {
    this.set( FIELD_FAHRTWEG_AUTOBAHN,
      Is24CsvFormat.printNumber( value, 3 ) );
  }

  public void setFahrtwegFlughafen( Integer value )
  {
    this.set( FIELD_FAHRTWEG_FLUGHAFEN,
      Is24CsvFormat.printNumber( value, 3 ) );
  }

  public void setFahrtwegHauptbahnhof( Integer value )
  {
    this.set( FIELD_FAHRTWEG_HAUPTBAHNHOF,
      Is24CsvFormat.printNumber( value, 2 ) );
  }

  public void setFusswegNahverkehr( Integer value )
  {
    this.set( FIELD_FUSSWEG_NAHVERKEHR,
      Is24CsvFormat.printNumber( value, 2 ) );
  }

  public void setGesamtflaeche( Double value )
  {
    this.set( FIELD_GESAMTFLAECHE,
      Is24CsvFormat.printNumber( value, 10, 2 ) );
  }

  public void setGewerbeflaeche( Double value )
  {
    this.set( FIELD_GEWERBEFLAECHE,
      Is24CsvFormat.printNumber( value, 10, 2 ) );
  }

  public void setGrundstuecksflaeche( Double value )
  {
    this.set( FIELD_GRUNDSTUECKSFLAECHE,
      Is24CsvFormat.printNumber( value, 10, 2 ) );
  }

  public void setHeizungsart( Heizungsart value )
  {
    this.set( FIELD_HEIZUNGSART,
      (value!=null)? value.print(): null );
  }

  public void setKaufpreis( Double value )
  {
    this.set( FIELD_KAUFPREIS,
      Is24CsvFormat.printNumber( value, 15, 2 ) );
  }

  public void setKaufpreisProQm( Double value )
  {
    this.set( FIELD_KAUFPREIS_PRO_QM,
      Is24CsvFormat.printNumber( value, 15, 2 ) );
  }

  public void setMieteinnahmenIst( Double value )
  {
    this.set( FIELD_MIETEINNAHMEN_IST,
      Is24CsvFormat.printNumber( value, 15, 2 ) );
  }

  public void setMieteinnahmenSoll( Double value )
  {
    this.set( FIELD_MIETEINNAHMEN_SOLL,
      Is24CsvFormat.printNumber( value, 15, 2 ) );
  }

  public void setNichtUmgelegteKosten( Double value )
  {
    this.set( FIELD_NICHT_UMGELEGTE_KOSTEN,
      Is24CsvFormat.printNumber( value, 15, 2 ) );
  }

  public void setObjektkategorie( ObjektkategorieAnlageobjekt value )
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

  public void setPreisProParkflaeche( Double value )
  {
    this.set( FIELD_PREIS_PRO_PARKFLAECHE,
      Is24CsvFormat.printNumber( value, 15, 2 ) );
  }

  public void setSanierungsjahr( Integer value )
  {
    this.set( FIELD_SANIERUNGSJAHR,
      Is24CsvFormat.printNumber( value, 4 ) );
  }

  public void setSonstigeFlaeche( Double value )
  {
    this.set( FIELD_SONSTIGE_FLAECHE,
      Is24CsvFormat.printNumber( value, 10, 2 ) );
  }

  public void setVermietbareFlaeche( Double value )
  {
    this.set( FIELD_VERMIETBARE_FLAECHE,
      Is24CsvFormat.printNumber( value, 10, 2 ) );
  }

  public void setWohnflaeche( Double value )
  {
    this.set( FIELD_WOHNFLAECHE,
      Is24CsvFormat.printNumber( value, 10, 2 ) );
  }

  public void setXFache( Double value )
  {
    this.set( FIELD_X_FACHE,
      Is24CsvFormat.printNumber( value, 3, 1 ) );
  }
}