/*
 * Copyright 2015-2018 OpenEstate.org.
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ObjektkategorieGewerbeEinzelhandel.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public enum ObjektkategorieGewerbeEinzelhandel
{
  KEINE_ANGABE( 0 ),
  AUSSTELLUNGSFLAECHE( 69 ),
  EINKAUFSZENTRUM( 70 ),
  FACTORY_OUTLET( 71 ),
  KAUFHAUS( 72 ),
  KIOSK( 73 ),
  LADEN( 74 ),
  SB_MARKT( 75 ),
  VERKAUFSFLAECHE( 76 ),
  VERKAUFSHALLE( 77 );

  private final static Logger LOGGER = LoggerFactory.getLogger( ObjektkategorieGewerbeEinzelhandel.class );
  private final int value;

  private ObjektkategorieGewerbeEinzelhandel( int value )
  {
    this.value = value;
  }

  public static ObjektkategorieGewerbeEinzelhandel parse( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;
    for (ObjektkategorieGewerbeEinzelhandel s : ObjektkategorieGewerbeEinzelhandel.values())
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