/*
 * Copyright 2015-2017 OpenEstate.org.
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
import org.openestate.io.is24_csv.Is24CsvRecord;
import org.openestate.io.is24_csv.types.ObjektkategorieGrundstueck;
import org.openestate.io.is24_csv.types.Vermarktungsart;

/**
 * General record from the IS24-CSV format for plots.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public abstract class Grundstueck extends Is24CsvRecord
{
  /** Vermarktungsart, Text 1 */
  protected final static int FIELD_VERMARKTUNGSART = 60;

  /** Objektkategorie 2, Zahl 3 */
  protected final static int FIELD_OBJEKTKATEGORIE = 61;

  public ObjektkategorieGrundstueck getObjektkategorie()
  {
    return ObjektkategorieGrundstueck.parse(
      this.get( FIELD_OBJEKTKATEGORIE ) );
  }

  public static ObjektkategorieGrundstueck getObjektkategorie( CSVRecord record )
  {
    return ObjektkategorieGrundstueck.parse(
      record.get( FIELD_OBJEKTKATEGORIE ) );
  }

  public Vermarktungsart getVermarktungsart()
  {
    return Vermarktungsart.parse(
      this.get( FIELD_VERMARKTUNGSART ) );
  }

  public void setObjektkategorie( ObjektkategorieGrundstueck value )
  {
    this.set( FIELD_OBJEKTKATEGORIE,
      (value!=null)? value.print(): null );
  }

  public void setVermarktungsart( Vermarktungsart value )
  {
    this.set( FIELD_VERMARKTUNGSART,
      (value!=null)? value.print(): null );
  }
}