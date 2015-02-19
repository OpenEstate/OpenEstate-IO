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

package org.openestate.io.immoxml;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.openestate.io.core.Converter;
import org.openestate.io.core.Version;
import org.openestate.io.immoxml.converters.ImmoXML_1_1;

/**
 * ImmoXmlVersion.
 *
 * @author Andreas Rudolph
 */
public enum ImmoXmlVersion implements Version
{
  /**
   * ImmoXML 1.1
   */
  V1_1( "1.1", new ImmoXML_1_1() );

  private final String readableVersion;
  private final Converter converter;

  private ImmoXmlVersion( String readableVersion, Converter converter )
  {
    this.readableVersion = readableVersion;
    this.converter = converter;
  }

  public static ImmoXmlVersion detectFromString( String version )
  {
    if (version!=null)
    {
      String[] values = StringUtils.split( version, "/" );
      for (ImmoXmlVersion v : ImmoXmlVersion.values())
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
  public ImmoXmlVersion getNextVersion()
  {
    ImmoXmlVersion[] versions = ImmoXmlVersion.values();
    int pos = ArrayUtils.indexOf( versions, this );
    pos++;
    return (versions.length>pos)? versions[pos]: null;
  }

  @Override
  public ImmoXmlVersion getPreviousVersion()
  {
    ImmoXmlVersion[] versions = ImmoXmlVersion.values();
    int pos = ArrayUtils.indexOf( versions, this );
    pos--;
    return (pos>=0)? versions[pos]: null;
  }

  @Override
  public boolean isLatestVersion()
  {
    return ImmoXmlUtils.VERSION.equals( this );
  }

  @Override
  public boolean isNewerThen( Version v )
  {
    ImmoXmlVersion[] versions = ImmoXmlVersion.values();
    return ArrayUtils.indexOf( versions, this ) > ArrayUtils.indexOf( versions, v );
  }

  @Override
  public boolean isOlderThen( Version v )
  {
    ImmoXmlVersion[] versions = ImmoXmlVersion.values();
    return ArrayUtils.indexOf( versions, this ) < ArrayUtils.indexOf( versions, v );
  }

  @Override
  public String toReadableVersion()
  {
    return this.readableVersion;
  }
}