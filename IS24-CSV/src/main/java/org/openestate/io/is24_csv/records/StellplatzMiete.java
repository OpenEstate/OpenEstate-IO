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
import org.openestate.io.is24_csv.Is24CsvFormat;
import org.openestate.io.is24_csv.Is24CsvRecord;
import org.openestate.io.is24_csv.types.Immobilienart;
import org.openestate.io.is24_csv.types.ObjektkategorieStellplatz;
import org.openestate.io.is24_csv.types.Objektzustand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * StellplatzMiete.
 *
 * @author Andreas Rudolph
 */
public class StellplatzMiete extends Is24CsvRecord
{
  private final static Logger LOGGER = LoggerFactory.getLogger( StellplatzMiete.class );

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

  /** Verfügbar ab (TT.MM.JJJJ), Datum 10 */
  protected final static int FIELD_FREI_AB = 65;

  /** Verfügbar bis (TT.MM.JJJJ), Datum 10 */
  protected final static int FIELD_FREI_BIS = 66;

  /** Jahr letzte Modernisierung/ Sanierung, Zahl 4 */
  protected final static int FIELD_SANIERUNGSJAHR = 67;

  /** Baujahr, Zahl 4 */
  protected final static int FIELD_BAUJAHR = 68;

  /** Objektzustand, Zahl 10 */
  protected final static int FIELD_OBJEKTZUSTAND = 69;

  /** Preis (Miete), Zahl 6,2 */
  protected final static int FIELD_MIETE = 90;


  public StellplatzMiete()
  {
    super();
    this.setImmobilienart( Immobilienart.STELLPLATZ_MIETE );
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

  public Double getBreite()
  {
    try
    {
      return this.getAsDouble( FIELD_BREITE );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Breite' "
        + "from '" + this.get( FIELD_BREITE ) + "'!" );
      return null;
    }
  }

  public Double getFlaeche()
  {
    try
    {
      return this.getAsDouble( FIELD_FLAECHE );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Flaeche' "
        + "from '" + this.get( FIELD_FLAECHE ) + "'!" );
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

  public Double getHoehe()
  {
    try
    {
      return this.getAsDouble( FIELD_HOEHE );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Hoehe' "
        + "from '" + this.get( FIELD_HOEHE ) + "'!" );
      return null;
    }
  }

  public Double getLaenge()
  {
    try
    {
      return this.getAsDouble( FIELD_LAENGE );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Laenge' "
        + "from '" + this.get( FIELD_LAENGE ) + "'!" );
      return null;
    }
  }

  public Double getMiete()
  {
    try
    {
      return this.getAsDouble( FIELD_MIETE );
    }
    catch (NumberFormatException ex)
    {
      LOGGER.warn( "Can't read 'Miete' "
        + "from '" + this.get( FIELD_MIETE ) + "'!" );
      return null;
    }
  }

  public ObjektkategorieStellplatz getObjektkategorie()
  {
    return ObjektkategorieStellplatz.parse( this.get( FIELD_OBJEKTKATEGORIE ) );
  }

  public Objektzustand getObjektzustand()
  {
    return Objektzustand.parse( this.get( FIELD_OBJEKTZUSTAND ) );
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

  @Override
  protected Iterable<String> print()
  {
    this.setImmobilienart( Immobilienart.STELLPLATZ_MIETE );
    return super.print();
  }

  public void setBaujahr( Integer value )
  {
    this.set( FIELD_BAUJAHR,
      Is24CsvFormat.printNumber( value, 4 ) );
  }

  public void setBreite( Double value )
  {
    this.set( FIELD_BREITE,
      Is24CsvFormat.printNumber( value, 5, 2 ) );
  }

  public void setFlaeche( Double value )
  {
    this.set( FIELD_FLAECHE,
      Is24CsvFormat.printNumber( value, 10, 2 ) );
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

  public void setHoehe( Double value )
  {
    this.set( FIELD_HOEHE,
      Is24CsvFormat.printNumber( value, 5, 2 ) );
  }

  public void setLaenge( Double value )
  {
    this.set( FIELD_LAENGE,
      Is24CsvFormat.printNumber( value, 5, 2 ) );
  }

  public void setMiete( Double value )
  {
    this.set( FIELD_MIETE,
      Is24CsvFormat.printNumber( value, 6, 2 ) );
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

  public void setSanierungsjahr( Integer value )
  {
    this.set( FIELD_SANIERUNGSJAHR,
      Is24CsvFormat.printNumber( value, 4 ) );
  }
}