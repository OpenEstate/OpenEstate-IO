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

package org.openestate.io.immobiliare_it;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.openestate.io.core.Converter;
import org.openestate.io.core.Version;
import org.openestate.io.immobiliare_it.converters.ImmobiliareIt_2_5;

/**
 * DaftIEVersion.
 *
 * @author Andreas Rudolph
 */
public enum ImmobiliareItVersion implements Version
{
  /**
   * Immobiliare-XML 2.5
   */
  V2_5( "2.5", new ImmobiliareIt_2_5() );

  private final String readableVersion;
  private final Converter converter;

  private ImmobiliareItVersion( String readableVersion, Converter converter )
  {
    this.readableVersion = readableVersion;
    this.converter = converter;
  }

  public static ImmobiliareItVersion detectFromString( String version )
  {
    if (version!=null)
    {
      String[] values = StringUtils.split( version, "/" );
      for (ImmobiliareItVersion v : ImmobiliareItVersion.values())
      {
        if (v.toReadableVersion().equalsIgnoreCase( values[0] ))
        {
          return v;
        }
      }
    }
    return null;
  }

  @Override
  public Converter getConverter()
  {
    return this.converter;
  }

  @Override
  public ImmobiliareItVersion getNextVersion()
  {
    ImmobiliareItVersion[] versions = ImmobiliareItVersion.values();
    int pos = ArrayUtils.indexOf( versions, this );
    pos++;
    return (versions.length>pos)? versions[pos]: null;
  }

  @Override
  public ImmobiliareItVersion getPreviousVersion()
  {
    ImmobiliareItVersion[] versions = ImmobiliareItVersion.values();
    int pos = ArrayUtils.indexOf( versions, this );
    pos--;
    return (pos>=0)? versions[pos]: null;
  }

  @Override
  public boolean isLatestVersion()
  {
    return ImmobiliareItUtils.VERSION.equals( this );
  }

  @Override
  public boolean isNewerThen( Version v )
  {
    ImmobiliareItVersion[] versions = ImmobiliareItVersion.values();
    return ArrayUtils.indexOf( versions, this ) > ArrayUtils.indexOf( versions, v );
  }

  @Override
  public boolean isOlderThen( Version v )
  {
    ImmobiliareItVersion[] versions = ImmobiliareItVersion.values();
    return ArrayUtils.indexOf( versions, this ) < ArrayUtils.indexOf( versions, v );
  }

  @Override
  public String toReadableVersion()
  {
    return this.readableVersion;
  }
}