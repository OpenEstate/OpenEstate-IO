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

package org.openestate.io.is24_csv.types;

import org.apache.commons.lang3.StringUtils;

/**
 * Objektdarstellung.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public enum Objektdarstellung
{
  IS24_HOMEPAGE_ALLEGRUPPEN( 0 ),
  VBM_ALLEGRUPPEN( 1 ),
  IS24_VBM_HOMEPAGE_ALLEGRUPPEN( 2 ),
  HOMEPAGE_ALLEGRUPPEN( 3 ),
  IS24( 4 ),
  VBM_HOMEPAGE_ALLEGRUPPEN( 5 ),
  IS24_VBM_ALLEGRUPPEN( 6 ),
  IS24_WAHLGRUPPEN( 7 ),
  HOMEPAGE_WAHLGRUPPEN( 8 ),
  IS24_HOMEPAGE_WAHLGRUPPEN( 9 ),
  WAHLGRUPPEN( 10 );

  private final int value;

  private Objektdarstellung( int value )
  {
    this.value = value;
  }

  public static Objektdarstellung parse( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;

    for (Objektdarstellung s : Objektdarstellung.values())
    {
      if (String.valueOf( s.value ).equalsIgnoreCase( value )) return s;
    }
    return IS24_HOMEPAGE_ALLEGRUPPEN;
  }

  public String print()
  {
    return String.valueOf( this.value );
  }
}