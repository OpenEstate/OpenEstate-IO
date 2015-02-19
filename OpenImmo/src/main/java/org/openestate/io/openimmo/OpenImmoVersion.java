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

package org.openestate.io.openimmo;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.openestate.io.core.Converter;
import org.openestate.io.core.Version;
import org.openestate.io.openimmo.converters.OpenImmo_1_1;
import org.openestate.io.openimmo.converters.OpenImmo_1_2_0;
import org.openestate.io.openimmo.converters.OpenImmo_1_2_1;
import org.openestate.io.openimmo.converters.OpenImmo_1_2_2;
import org.openestate.io.openimmo.converters.OpenImmo_1_2_3;
import org.openestate.io.openimmo.converters.OpenImmo_1_2_4;
import org.openestate.io.openimmo.converters.OpenImmo_1_2_5;
import org.openestate.io.openimmo.converters.OpenImmo_1_2_6;
import org.openestate.io.openimmo.converters.OpenImmo_1_2_7;

/**
 * OpenImmoVersion.
 *
 * @author Andreas Rudolph
 */
public enum OpenImmoVersion implements Version
{
  /**
   * OpenImmo 1.1
   */
  V1_1( "1.1", new OpenImmo_1_1() ),

  /**
   * OpenImmo 1.2.0
   */
  V1_2_0( "1.2.0", new OpenImmo_1_2_0() ),

  /**
   * OpenImmo 1.2.1
   */
  V1_2_1( "1.2.1", new OpenImmo_1_2_1() ),

  /**
   * OpenImmo 1.2.2
   */
  V1_2_2( "1.2.2", new OpenImmo_1_2_2() ),

  /**
   * OpenImmo 1.2.3
   */
  V1_2_3( "1.2.3", new OpenImmo_1_2_3() ),

  /**
   * OpenImmo 1.2.4
   */
  V1_2_4( "1.2.4", new OpenImmo_1_2_4() ),

  /**
   * OpenImmo 1.2.5
   */
  V1_2_5( "1.2.5", new OpenImmo_1_2_5() ),

  /**
   * OpenImmo 1.2.6
   */
  V1_2_6( "1.2.6", new OpenImmo_1_2_6() ),

  /**
   * OpenImmo 1.2.7
   */
  V1_2_7( "1.2.7", new OpenImmo_1_2_7() );

  private final String readableVersion;
  private final Converter converter;

  private OpenImmoVersion( String readableVersion, Converter converter )
  {
    this.readableVersion = readableVersion;
    this.converter = converter;
  }

  public static OpenImmoVersion detectFromString( String version )
  {
    if (version!=null)
    {
      String[] values = StringUtils.split( version, "/" );
      for (OpenImmoVersion v : OpenImmoVersion.values())
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
  public OpenImmoVersion getNextVersion()
  {
    OpenImmoVersion[] versions = OpenImmoVersion.values();
    int pos = ArrayUtils.indexOf( versions, this );
    pos++;
    return (versions.length>pos)? versions[pos]: null;
  }

  @Override
  public OpenImmoVersion getPreviousVersion()
  {
    OpenImmoVersion[] versions = OpenImmoVersion.values();
    int pos = ArrayUtils.indexOf( versions, this );
    pos--;
    return (pos>=0)? versions[pos]: null;
  }

  @Override
  public boolean isLatestVersion()
  {
    return OpenImmoUtils.VERSION.equals( this );
  }

  @Override
  public boolean isNewerThen( Version v )
  {
    OpenImmoVersion[] versions = OpenImmoVersion.values();
    return ArrayUtils.indexOf( versions, this ) > ArrayUtils.indexOf( versions, v );
  }

  @Override
  public boolean isOlderThen( Version v )
  {
    OpenImmoVersion[] versions = OpenImmoVersion.values();
    return ArrayUtils.indexOf( versions, this ) < ArrayUtils.indexOf( versions, v );
  }

  @Override
  public String toReadableVersion()
  {
    return this.readableVersion;
  }
}