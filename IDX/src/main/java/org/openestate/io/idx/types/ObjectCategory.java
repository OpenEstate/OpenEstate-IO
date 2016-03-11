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
package org.openestate.io.idx.types;

import org.apache.commons.lang3.StringUtils;

/**
 * ObjectCategory.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public enum ObjectCategory
{
  /** Landwirtschaft / Agriculture */
  AGRI,

  /** Wohnung / Apartment */
  APPT,

  /** Gastronomie / Gastronomy */
  GASTRO,

  /** Haus / House */
  HOUSE,

  /** Gewerbe/Industrie / Industrial Objects */
  INDUS,

  /** Parkplatz / Parking space */
  PARK,

  /** Grundstück / Plot */
  PROP,

  /** Wohnnebenräume / Secondary rooms */
  SECONDARY,

  /** Garten / Garden */
  GARDEN;

  public static ObjectCategory parse( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;
    try
    {
      return ObjectCategory.valueOf( value );
    }
    catch (Exception ex)
    {
      return null;
    }
  }

  public String print()
  {
    return this.name();
  }
}