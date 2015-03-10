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
import org.openestate.io.core.XmlConverter;
import org.openestate.io.core.XmlVersion;
import org.openestate.io.kyero.converters.Kyero_2_1;
import org.openestate.io.kyero.converters.Kyero_3;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implemented versions of the Kyero-XML format.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public enum KyeroVersion implements XmlVersion
{
  /**
   * Version v2.1
   */
  V2_1( Kyero_2_1.class, "2_1", "2.1" ),

  /**
   * Version v3
   */
  V3( Kyero_3.class, "3", "3", "3.0", "3.1" );

  private final static Logger LOGGER = LoggerFactory.getLogger( KyeroVersion.class );
  private final Class converterClass;
  private final String xmlVersion;
  private final String readableVersion;
  private final String[] alias;

  private KyeroVersion( Class converterClass, String xmlVersion, String readableVersion, String...alias )
  {
    this.converterClass = converterClass;
    this.xmlVersion = xmlVersion;
    this.readableVersion = readableVersion;
    this.alias = alias;
  }

  public static KyeroVersion detectFromString( String version )
  {
    if (version!=null)
    {
      for (KyeroVersion v : KyeroVersion.values())
      {
        if (v.toXmlVersion().equalsIgnoreCase( version )) return v;
        if (v.toReadableVersion().equalsIgnoreCase( version )) return v;
        if (v.alias!=null)
        {
          for (String a : v.alias)
          {
            if (a.equalsIgnoreCase( version )) return v;
          }
        }
      }
    }
    return null;
  }

  @Override
  public XmlConverter getConverter()
  {
    try
    {
      return (XmlConverter) this.converterClass.newInstance();
    }
    catch (Exception ex)
    {
      LOGGER.error( "Can't create converter!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      return null;
    }
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
  public boolean isNewerThen( XmlVersion v )
  {
    KyeroVersion[] versions = KyeroVersion.values();
    return ArrayUtils.indexOf( versions, this ) > ArrayUtils.indexOf( versions, v );
  }

  @Override
  public boolean isOlderThen( XmlVersion v )
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