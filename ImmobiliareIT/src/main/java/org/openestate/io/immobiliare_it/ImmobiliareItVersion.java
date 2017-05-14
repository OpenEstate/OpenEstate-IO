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
package org.openestate.io.immobiliare_it;

import org.apache.commons.lang3.ArrayUtils;
import org.openestate.io.core.XmlConverter;
import org.openestate.io.core.XmlVersion;
import org.openestate.io.immobiliare_it.converters.ImmobiliareIt_2_5;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implemented versions of the XML format by
 * <a href="http://immobiliare.it/">immobiliare.it</a>.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public enum ImmobiliareItVersion implements XmlVersion
{
  /**
   * Version 2.5
   */
  V2_5( ImmobiliareIt_2_5.class, "2.5", "2.5.0" );

  private final static Logger LOGGER = LoggerFactory.getLogger( ImmobiliareItVersion.class );
  private final Class converterClass;
  private final String readableVersion;
  private final String[] alias;

  private ImmobiliareItVersion( Class converterClass, String readableVersion, String...alias )
  {
    this.converterClass = converterClass;
    this.readableVersion = readableVersion;
    this.alias = alias;
  }

  public static ImmobiliareItVersion detectFromString( String version )
  {
    if (version!=null)
    {
      for (ImmobiliareItVersion v : ImmobiliareItVersion.values())
      {
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
  public boolean isNewerThen( XmlVersion v )
  {
    ImmobiliareItVersion[] versions = ImmobiliareItVersion.values();
    return ArrayUtils.indexOf( versions, this ) > ArrayUtils.indexOf( versions, v );
  }

  @Override
  public boolean isOlderThen( XmlVersion v )
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