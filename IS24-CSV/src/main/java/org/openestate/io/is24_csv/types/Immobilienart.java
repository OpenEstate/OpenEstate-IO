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
package org.openestate.io.is24_csv.types;

import org.apache.commons.lang3.StringUtils;

/**
 * Immobilienart.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public enum Immobilienart
{
  WOHNUNG_MIETE( 0 ),
  HAUS_MIETE( 1 ),
  WOHNUNG_KAUF( 2 ),
  HAUS_KAUF( 3 ),
  WOHNEN_AUF_ZEIT( 4 ),
  GRUNDSTUECKE( 5 ),
  GEWERBE_BUERO_PRAXEN( 7 ),
  GEWERBE_EINZELHANDEL( 8 ),
  GEWERBE_GASTRONOMIE_HOTEL( 9 ),
  GEWERBE_HALLE_PRODUKTION( 10 ),
  GEWERBE_SONSTIGES( 11 ),
  ANLAGE( 12 ),
  STELLPLATZ_KAUF( 17 ),
  STELLPLATZ_MIETE( 18 );

  private final int value;

  private Immobilienart( int value )
  {
    this.value = value;
  }

  public static Immobilienart parse( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;

    for (Immobilienart s : Immobilienart.values())
    {
      if (String.valueOf( s.value ).equalsIgnoreCase( value )) return s;
    }
    return null;
  }

  public String print()
  {
    return String.valueOf( this.value );
  }
}