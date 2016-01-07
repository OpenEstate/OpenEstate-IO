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
package org.openestate.io.immobiliare_it.xml.types;

/**
 * EnergyUnit.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public enum EnergyUnit
{
  KWH_M2ANNO( "kWh/m2anno" ), KWH_M3ANNO( "kWh/m3anno" );

  private final String xmlValue;

  private EnergyUnit( String xmlValue )
  {
    this.xmlValue = xmlValue;
  }

  public String getXmlValue()
  {
    return xmlValue;
  }

  public static EnergyUnit fromXmlValue( String xmlValue )
  {
    for (EnergyUnit val : EnergyUnit.values())
    {
      if (val.xmlValue.equalsIgnoreCase( xmlValue )) return val;
    }
    return null;
  }
}