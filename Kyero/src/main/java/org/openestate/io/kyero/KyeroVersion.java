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

package org.openestate.io.kyero;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.openestate.io.core.Converter;
import org.openestate.io.core.Version;
import org.openestate.io.kyero.converters.Kyero_2_1;
import org.openestate.io.kyero.converters.Kyero_3;

/**
 * KyeroVersion.
 *
 * @author Andreas Rudolph
 */
public enum KyeroVersion implements Version
{
  /**
   * Kyero v2.1
   */
  V2_1( "2.1", "2_1", new Kyero_2_1() ),

  /**
   * Kyero v3
   */
  V3( "3", "3", new Kyero_3() );

  private final String readableVersion;
  private final String xmlVersion;
  private final Converter converter;

  private KyeroVersion( String readableVersion, String xmlVersion, Converter converter )
  {
    this.readableVersion = readableVersion;
    this.xmlVersion = xmlVersion;
    this.converter = converter;
  }

  public static KyeroVersion detectFromString( String version )
  {
    if (version!=null)
    {
      for (KyeroVersion v : KyeroVersion.values())
      {
        if (v.toXmlVersion().equalsIgnoreCase( version ) || v.toReadableVersion().equalsIgnoreCase( version ))
        {
          return v;
        }
      }
      for (KyeroVersion v : KyeroVersion.values())
      {
        if (StringUtils.startsWithIgnoreCase( version, v.toXmlVersion() + "_" ))
        {
          return v;
        }
        else if (StringUtils.startsWithIgnoreCase( version, v.toReadableVersion()+ "." ))
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
  public KyeroVersion getNextVersion()
  {
    KyeroVersion[] versions = KyeroVersion.values();
    int pos = ArrayUtils.indexOf( versions, this );
    pos++;
    return (versions.length>pos)? versions[pos]: null;
  }

  @Override
  public KyeroVersion getPreviousVersion()
  {
    KyeroVersion[] versions = KyeroVersion.values();
    int pos = ArrayUtils.indexOf( versions, this );
    pos--;
    return (pos>=0)? versions[pos]: null;
  }

  @Override
  public boolean isLatestVersion()
  {
    return KyeroUtils.VERSION.equals( this );
  }

  @Override
  public boolean isNewerThen( Version v )
  {
    KyeroVersion[] versions = KyeroVersion.values();
    return ArrayUtils.indexOf( versions, this ) > ArrayUtils.indexOf( versions, v );
  }

  @Override
  public boolean isOlderThen( Version v )
  {
    KyeroVersion[] versions = KyeroVersion.values();
    return ArrayUtils.indexOf( versions, this ) < ArrayUtils.indexOf( versions, v );
  }

  @Override
  public String toReadableVersion()
  {
    return this.readableVersion;
  }

  public String toXmlVersion()
  {
    return this.xmlVersion;
  }
}