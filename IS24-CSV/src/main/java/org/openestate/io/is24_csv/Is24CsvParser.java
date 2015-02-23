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

package org.openestate.io.is24_csv;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.openestate.io.core.CsvParser;
import org.openestate.io.is24_csv.records.Anlageobjekt;
import org.openestate.io.is24_csv.records.GewerbeBueroPraxis;
import org.openestate.io.is24_csv.records.GewerbeEinzelhandel;
import org.openestate.io.is24_csv.records.GewerbeGastronomieHotel;
import org.openestate.io.is24_csv.records.GewerbeHalleProduktion;
import org.openestate.io.is24_csv.records.GewerbeSonstiges;
import org.openestate.io.is24_csv.records.Grundstueck;
import org.openestate.io.is24_csv.records.GrundstueckGewerbe;
import org.openestate.io.is24_csv.records.GrundstueckWohnen;
import org.openestate.io.is24_csv.records.HausKauf;
import org.openestate.io.is24_csv.records.HausMiete;
import org.openestate.io.is24_csv.records.StellplatzKauf;
import org.openestate.io.is24_csv.records.StellplatzMiete;
import org.openestate.io.is24_csv.records.WohnenAufZeit;
import org.openestate.io.is24_csv.records.WohnungKauf;
import org.openestate.io.is24_csv.records.WohnungMiete;
import org.openestate.io.is24_csv.types.Immobilienart;
import org.openestate.io.is24_csv.types.ObjektkategorieGrundstueck;
import org.openestate.io.is24_csv.types.Vermarktungsart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Is24CsvParser.
 *
 * @author Andreas Rudolph
 */
public class Is24CsvParser extends CsvParser<Is24CsvRecord>
{
  private final static Logger LOGGER = LoggerFactory.getLogger( Is24CsvParser.class );

  protected Is24CsvParser( CSVParser parser )
  {
    super( parser );
  }

  public static Is24CsvParser create( String csvString ) throws IOException
  {
    return new Is24CsvFormat().parse( csvString );
  }

  public static Is24CsvParser create( File csvFile ) throws IOException
  {
    return new Is24CsvFormat().parse( csvFile );
  }

  public static Is24CsvParser create( InputStream input ) throws IOException
  {
    return new Is24CsvFormat().parse( input );
  }

  public static Is24CsvParser create( Reader input ) throws IOException
  {
    return new Is24CsvFormat().parse( input );
  }

  @Override
  protected Is24CsvRecord newRecord( CSVRecord record )
  {
    String value = record.get( Is24CsvRecord.FIELD_IMMOBILIENART );
    Immobilienart art = Immobilienart.parse( value );

    if (Immobilienart.ANLAGE.equals( art ))
      return new Anlageobjekt();

    else if (Immobilienart.GEWERBE_BUERO_PRAXEN.equals( art ))
      return new GewerbeBueroPraxis();

    else if (Immobilienart.GEWERBE_EINZELHANDEL.equals( art ))
      return new GewerbeEinzelhandel();

    else if (Immobilienart.GEWERBE_GASTRONOMIE_HOTEL.equals( art ))
      return new GewerbeGastronomieHotel();

    else if (Immobilienart.GEWERBE_HALLE_PRODUKTION.equals( art ))
      return new GewerbeHalleProduktion();

    else if (Immobilienart.GEWERBE_SONSTIGES.equals( art ))
      return new GewerbeSonstiges();

    else if (Immobilienart.HAUS_KAUF.equals( art ))
      return new HausKauf();

    else if (Immobilienart.HAUS_MIETE.equals( art ))
      return new HausMiete();

    else if (Immobilienart.STELLPLATZ_KAUF.equals( art ))
      return new StellplatzKauf();

    else if (Immobilienart.STELLPLATZ_MIETE.equals( art ))
      return new StellplatzMiete();

    else if (Immobilienart.WOHNEN_AUF_ZEIT.equals( art ))
      return new WohnenAufZeit();

    else if (Immobilienart.WOHNUNG_KAUF.equals( art ))
      return new WohnungKauf();

    else if (Immobilienart.WOHNUNG_MIETE.equals( art ))
      return new WohnungMiete();

    // Immobilienart für Grundstücke wird abhängig zur Objektkategorie erzeugt
    else if (Immobilienart.GRUNDSTUECKE.equals( art ))
    {
      String catValue = record.get( Grundstueck.FIELD_OBJEKTKATEGORIE );
      ObjektkategorieGrundstueck cat = ObjektkategorieGrundstueck.parse( catValue );
      if (ObjektkategorieGrundstueck.WOHNEN.equals( cat ))
        return new GrundstueckWohnen();
      else
        return new GrundstueckGewerbe();
    }

    LOGGER.warn( "Unsupported 'Immobilienart' value: " + value );
    return null;
  }
}