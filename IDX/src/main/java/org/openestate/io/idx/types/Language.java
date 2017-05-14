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
package org.openestate.io.idx.types;

import org.apache.commons.lang3.StringUtils;

/**
 * Language.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public enum Language
{
  GERMAN( 1 ), FRENCH( 2 ), ITALIAN( 3 ), ENGLISH( 4 );

  private final int value;

  private Language( int value )
  {
    this.value = value;
  }

  public static Language parse( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;

    for (Language l : Language.values())
    {
      if (String.valueOf( l.value ).equalsIgnoreCase( value )) return l;
    }
    return null;
  }

  public String print()
  {
    return String.valueOf( this.value );
  }
}