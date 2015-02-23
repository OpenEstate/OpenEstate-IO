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
 * DateiSuffix.
 *
 * @author Andreas Rudolph
 */
public enum DateiSuffix
{
  BMP( ".BMP" ),
  GIF( ".GIF" ),
  PNG( ".PNG" ),
  JPG( ".JPG" ),
  WBMP( ".WBMP" ),
  JPEG( ".JPEG" ),
  MOV( ".MOV" ),
  QT( ".QT" ),
  RM( ".RM" ),
  RV( ".RV" ),
  MPE( ".MPE" ),
  MPG( ".MPG" ),
  MPEG( ".MPEG" ),
  MP4( ".MP4" ),
  WMV( ".WMV" ),
  AVI( ".AVI" ),
  PDF( ".PDF" );

  private final String value;

  private DateiSuffix( String value )
  {
    this.value = value;
  }

  public static DateiSuffix parse( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;

    for (DateiSuffix t : DateiSuffix.values())
    {
      if (t.value.equalsIgnoreCase( value ) || t.name().equalsIgnoreCase( value ))
      {
        return t;
      }
    }
    return null;
  }

  public String print()
  {
    return this.value;
  }
}