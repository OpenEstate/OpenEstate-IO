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

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Befeuerungsart.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public enum Befeuerungsart
{
  KEINE_ANGABE( 1 ),
  ERDWAERME( 2 ),
  SOLARHEIZUNG( 3 ),
  PELLETHEIZUNG( 4 ),
  GAS( 5 ),
  OEL( 6 ),
  FERNWAERME( 7 ),
  STROM( 8 ),
  KOHLE( 9 );

  private final static Logger LOGGER = LoggerFactory.getLogger( Befeuerungsart.class );
  private final int value;

  private Befeuerungsart( int value )
  {
    this.value = value;
  }

  public static Befeuerungsart parse( String value )
  {
    value = StringUtils.trimToNull( value );
    if (value==null) return null;
    for (Befeuerungsart s : Befeuerungsart.values())
    {
      if (String.valueOf( s.value ).equalsIgnoreCase( value )) return s;
    }
    return KEINE_ANGABE;
  }

  public static Befeuerungsart[] parseMultiple( String valueList )
  {
    String[] values = StringUtils.split( valueList, ";" );
    if (values==null) return new Befeuerungsart[]{};
    List<Befeuerungsart> arten = new ArrayList<>();
    for (String value : values)
    {
      Befeuerungsart art = Befeuerungsart.parse( value );
      if (art!=null && !Befeuerungsart.KEINE_ANGABE.equals( art ) && !arten.contains( art ))
        arten.add( art );
    }
    return arten.toArray( new Befeuerungsart[arten.size()] );
  }

  public String print()
  {
    return String.valueOf( this.value );
  }

  public static String printMultiple( Iterable<Befeuerungsart> arten )
  {
    if (arten==null) return null;
    List<String> values = new ArrayList<>();
    for (Befeuerungsart art : arten)
    {
      if (Befeuerungsart.KEINE_ANGABE.equals( art )) continue;
      String value = art.print();
      if (!values.contains( value )) values.add( value );
    }
    return StringUtils.trimToNull( StringUtils.join( values, ";" ) );
  }
}