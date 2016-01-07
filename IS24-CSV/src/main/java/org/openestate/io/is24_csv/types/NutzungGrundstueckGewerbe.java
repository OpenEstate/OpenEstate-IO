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

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 * NutzungGrundstueckGewerbe.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public enum NutzungGrundstueckGewerbe
{
  ACKERLAND( 1 ),
  BAUERWARTUNGSLAND( 2 ),
  BOOTSSTAENDE( 3 ),
  BUERO( 4 ),
  CAMPING( 5 ),
  EINZELHANDEL_GROSS( 8 ),
  EINZELHANDEL_KLEIN( 9 ),
  GARAGEN( 10 ),
  GARTEN( 11 ),
  GASTRONOMIE( 12 ),
  GEWERBE( 13 ),
  HOTEL( 14 ),
  INDUSTRIE( 15 ),
  KEINE_BEBAUUNG( 16 ),
  KLEINGEWERBE( 17 ),
  LAGER( 18 ),
  OBSTPFLANZUNG( 20 ),
  PARKHAUS( 21 ),
  PRODUKTION( 22 ),
  STELLPLAETZE( 24 ),
  WALD( 26 );

  private final int value;

  private NutzungGrundstueckGewerbe( int value )
  {
    this.value = value;
  }

  public static NutzungGrundstueckGewerbe parse( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;
    for (NutzungGrundstueckGewerbe s : NutzungGrundstueckGewerbe.values())
    {
      if (String.valueOf( s.value ).equalsIgnoreCase( value )) return s;
    }
    return null;
  }

  public static NutzungGrundstueckGewerbe[] parseMultiple( String valueList )
  {
    String[] values = StringUtils.split( valueList, ";" );
    if (values==null) return new NutzungGrundstueckGewerbe[]{};
    List<NutzungGrundstueckGewerbe> nutzungen = new ArrayList<NutzungGrundstueckGewerbe>();
    for (String value : values)
    {
      NutzungGrundstueckGewerbe nutzung = NutzungGrundstueckGewerbe.parse( value );
      if (nutzung!=null && !nutzungen.contains( nutzung ))
        nutzungen.add( nutzung );
    }
    return nutzungen.toArray( new NutzungGrundstueckGewerbe[nutzungen.size()] );
  }

  public String print()
  {
    return String.valueOf( this.value );
  }

  public static String printMultiple( Iterable<NutzungGrundstueckGewerbe> arten )
  {
    if (arten==null) return null;
    List<String> values = new ArrayList<String>();
    for (NutzungGrundstueckGewerbe art : arten)
    {
      String value = art.print();
      if (!values.contains( value )) values.add( value );
    }
    return StringUtils.trimToNull( StringUtils.join( values, ";" ) );
  }
}