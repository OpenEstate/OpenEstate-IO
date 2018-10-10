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
 * ObjektkategorieGrundstueck.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public enum ObjektkategorieGrundstueck
{
  WOHNEN( 56 ),
  GEWERBE( 57 ),
  GEWERBE_LAND_FORSTWIRTSCHAFT( 58 ),
  GEWERBE_FREIZEIT( 59 );

  private final static Logger LOGGER = LoggerFactory.getLogger( ObjektkategorieGrundstueck.class );
  private final int value;

  private ObjektkategorieGrundstueck( int value )
  {
    this.value = value;
  }

  public static ObjektkategorieGrundstueck parse( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;
    for (ObjektkategorieGrundstueck s : ObjektkategorieGrundstueck.values())
    {
      if (String.valueOf( s.value ).equalsIgnoreCase( value )) return s;
    }
    return GEWERBE;
  }

  public String print()
  {
    return String.valueOf( this.value );
  }
}