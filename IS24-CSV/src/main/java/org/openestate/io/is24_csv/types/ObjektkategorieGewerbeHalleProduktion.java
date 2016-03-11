/*
 * Copyright 2015-2016 OpenEstate.org.
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
 * ObjektkategorieGewerbeBueroPraxen.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public enum ObjektkategorieGewerbeHalleProduktion
{
  KEINE_ANGABE( 0 ),
  AUSSTELLUNGSFLAECHE( 69 ),
  HALLE( 88 ),
  HOCHREGALLAGER( 89 ),
  INDUSTRIEHALLE( 90 ),
  INDUSTRIEHALLE_MIT_FREIFLAECHE( 91 ),
  KUEHLHAUS( 92 ),
  KUEHLREGALLAGER( 93 ),
  LAGER_MIT_FREIFLAECHE( 94 ),
  LAGERFLAECHE( 95 ),
  LAGERHALLE( 96 ),
  SERVICEFLAECHE( 97 ),
  SPEDITIONSLAGER( 98 ),
  WERKSTATT( 99 );

  private final int value;

  private ObjektkategorieGewerbeHalleProduktion( int value )
  {
    this.value = value;
  }

  public static ObjektkategorieGewerbeHalleProduktion parse( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;
    for (ObjektkategorieGewerbeHalleProduktion s : ObjektkategorieGewerbeHalleProduktion.values())
    {
      if (String.valueOf( s.value ).equalsIgnoreCase( value )) return s;
    }
    return KEINE_ANGABE;
  }

  public String print()
  {
    return String.valueOf( this.value );
  }
}