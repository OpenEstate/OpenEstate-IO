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
import org.openestate.io.is24_csv.types.Immobilienart;
import org.openestate.io.is24_csv.types.ObjektkategorieStellplatz;
import org.openestate.io.is24_csv.types.Objektzustand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * StellplatzKauf.
 *
 * @author Andreas Rudolph
 */
public class StellplatzKauf extends Is24CsvRecord
{
  private final static Logger LOGGER = LoggerFactory.getLogger( StellplatzKauf.class );

  /** Objektkategorie 2, Zahl 3 */
  protected final static int FIELD_OBJEKTKATEGORIE = 60;

  /** Länge, Zahl 5,2 */
  protected final static int FIELD_LAENGE = 61;

  /** Breite, Zahl 5,2 */
  protected final static int FIELD_BREITE = 62;

  /** Höhe, Zahl 4,2 */
  protected final static int FIELD_HOEHE = 63;

  /** Fläche, Zahl 10,2 */
  protected final static int FIELD_FLAECHE = 64;

  /** Jahr letzte Modernisierung/ Sanierung, Zahl 4 */
  protected final static int FIELD_SANIERUNGSJAHR = 67;

  /** Baujahr, Zahl 4 */
  protected final static int FIELD_BAUJAHR = 68;

  /** Objektzustand, Zahl 10 */
  protected final static int FIELD_OBJEKTZUSTAND = 69;

  /** Preis (Kaufpreis), Zahl 6,2 */
  protected final static int FIELD_KAUFPREIS = 90;

  public StellplatzKauf()
  {
    super();
    this.setImmobilienart( Immobilienart.STELLPLATZ_KAUF );
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

  public Double getBreite()
  {
    try
    {
      return Is24CsvFormat.parseDouble(
        this.get( FIELD_BREITE ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Breite'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public Double getFlaeche()
  {
    try
    {
      return Is24CsvFormat.parseDouble(
        this.get( FIELD_FLAECHE ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Flaeche'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public Double getHoehe()
  {
    try
    {
      return Is24CsvFormat.parseDouble(
        this.get( FIELD_HOEHE ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Hoehe'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
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

  public Double getLaenge()
  {
    try
    {
      return Is24CsvFormat.parseDouble(
        this.get( FIELD_LAENGE ) );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Laenge'!" );
      LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
  }

  public ObjektkategorieStellplatz getObjektkategorie()
  {
    return ObjektkategorieStellplatz.parse(
      this.get( FIELD_OBJEKTKATEGORIE ) );
  }

  public Objektzustand getObjektzustand()
  {
    return Objektzustand.parse(
      this.get( FIELD_OBJEKTZUSTAND ) );
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

  public static StellplatzKauf newRecord( CSVRecord record )
  {
    StellplatzKauf is24Record = new StellplatzKauf();
    is24Record.parse( record );
    return is24Record;
  }

  @Override
  protected Iterable<String> print()
  {
    this.setImmobilienart( Immobilienart.STELLPLATZ_KAUF );
    return super.print();
  }

  public void setBaujahr( Number value )
  {
    this.set( FIELD_BAUJAHR,
      Is24CsvFormat.printNumber( value, 4 ) );
  }

  public void setBreite( Number value )
  {
    this.set( FIELD_BREITE,
      Is24CsvFormat.printNumber( value, 5, 2 ) );
  }

  public void setFlaeche( Number value )
  {
    this.set( FIELD_FLAECHE,
      Is24CsvFormat.printNumber( value, 10, 2 ) );
  }

  public void setHoehe( Number value )
  {
    this.set( FIELD_HOEHE,
      Is24CsvFormat.printNumber( value, 5, 2 ) );
  }

  public void setKaufpreis( Number value )
  {
    this.set( FIELD_KAUFPREIS,
      Is24CsvFormat.printNumber( value, 6, 2 ) );
  }

  public void setLaenge( Number value )
  {
    this.set( FIELD_LAENGE,
      Is24CsvFormat.printNumber( value, 5, 2 ) );
  }

  public void setObjektkategorie( ObjektkategorieStellplatz value )
  {
    this.set( FIELD_OBJEKTKATEGORIE,
      (value!=null)? value.print(): null );
  }

  public void setObjektzustand( Objektzustand value )
  {
    this.set( FIELD_OBJEKTZUSTAND,
      (value!=null)? value.print(): null );
  }

  public void setSanierungsjahr( Number value )
  {
    this.set( FIELD_SANIERUNGSJAHR,
      Is24CsvFormat.printNumber( value, 4 ) );
  }
}