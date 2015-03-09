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

package org.openestate.io.trovit.xml.types;

import org.apache.commons.lang3.StringUtils;

/**
 * Action.
 *
 * @author Andreas Rudolph
 */
public enum Action
{
  FOR_RENT( new String[]{ "FOR RENT", "ALQUILER" } ),
  FOR_SALE( new String[]{ "FOR SALE", "VENTA" } );

  private final String[] aliases;

  private Action( String[] aliases )
  {
    this.aliases = aliases;
  }

  public static Action fromXmlValue( String name )
  {
    name = StringUtils.trimToNull( name );
    if (name==null) return null;
    for (Action value : Action.values())
    {
      if (value.name().equalsIgnoreCase( name )) return value;
      for (String alias : value.aliases)
      {
        if (alias.equalsIgnoreCase( name )) return value;
      }
    }
    return null;
  }

  public String write()
  {
    return this.aliases[0];
  }
}