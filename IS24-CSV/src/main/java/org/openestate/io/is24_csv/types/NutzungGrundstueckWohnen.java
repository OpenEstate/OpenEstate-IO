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

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * NutzungGrundstueckWohnen.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public enum NutzungGrundstueckWohnen
{
  BAUERWARTUNGSLAND( 2 ),
  DOPPELHAUSHAELFTE( 6 ),
  EINFAMILIENHAUS( 7 ),
  GARAGEN( 10 ),
  GARTEN( 11 ),
  KEINE_BEBAUUNG( 16 ),
  MEHRFAMILIENHAUS( 19 ),
  OBSTPFLANZUNG( 20 ),
  REIHENHAUS( 23 ),
  STELLPLAETZE( 24 ),
  VILLA( 25 ),
  WALD( 26 );

  private final static Logger LOGGER = LoggerFactory.getLogger( NutzungGrundstueckWohnen.class );
  private final int value;

  private NutzungGrundstueckWohnen( int value )
  {
    this.value = value;
  }

  public static NutzungGrundstueckWohnen parse( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;
    for (NutzungGrundstueckWohnen s : NutzungGrundstueckWohnen.values())
    {
      if (String.valueOf( s.value ).equalsIgnoreCase( value )) return s;
    }
    return null;
  }

  public static NutzungGrundstueckWohnen[] parseMultiple( String valueList )
  {
    String[] values = StringUtils.split( valueList, ";" );
    if (values==null) return new NutzungGrundstueckWohnen[]{};
    List<NutzungGrundstueckWohnen> nutzungen = new ArrayList<>();
    for (String value : values)
    {
      NutzungGrundstueckWohnen nutzung = NutzungGrundstueckWohnen.parse( value );
      if (nutzung!=null && !nutzungen.contains( nutzung ))
        nutzungen.add( nutzung );
    }
    return nutzungen.toArray( new NutzungGrundstueckWohnen[nutzungen.size()] );
  }

  public String print()
  {
    return String.valueOf( this.value );
  }

  public static String printMultiple( Iterable<NutzungGrundstueckWohnen> arten )
  {
    if (arten==null) return null;
    List<String> values = new ArrayList<>();
    for (NutzungGrundstueckWohnen art : arten)
    {
      String value = art.print();
      if (!values.contains( value )) values.add( value );
    }
    return StringUtils.trimToNull( StringUtils.join( values, ";" ) );
  }
}