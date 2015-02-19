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

package org.openestate.io.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

/**
 * AbstractConvertableDocument.
 *
 * @param <JavaType>
 * ...
 *
 * @param <VersionType>
 * ...
 *
 * @author Andreas Rudolph
 */
public abstract class ConvertableDocument<JavaType, VersionType extends Version> extends BaseDocument<JavaType>
{
  private final static Logger LOGGER = LoggerFactory.getLogger( ConvertableDocument.class );

  public ConvertableDocument( Document document )
  {
    super( document );
  }

  public void downgrade( VersionType targetVersion )
  {
    if (targetVersion==null)
      throw new NullPointerException( "No target version was provided!" );

    Version currentVersion = this.getDocumentVersion();
    if (currentVersion==null)
    {
      currentVersion = this.getLatestVersion();
      LOGGER.warn( "Can't determine document version! Assuming latest version "
        + currentVersion.toReadableVersion() + "." );
    }
    if (currentVersion==targetVersion) return;

    if (currentVersion.isOlderThen( targetVersion ))
    {
      LOGGER.warn( "The provided target version (" + targetVersion.toReadableVersion() + ") "
        + "is newer then the document version (" + currentVersion.toReadableVersion() + ")." );
      return;
    }

    Version v = currentVersion;
    while (true)
    {
      v.getConverter().downgradeToPreviousVersion( this );
      v = v.getPreviousVersion();
      if (v==targetVersion) break;
    }
  }

  public abstract VersionType getDocumentVersion();

  public abstract VersionType getLatestVersion();

  public abstract void setDocumentVersion( VersionType version );

  public void upgrade( Version targetVersion )
  {
    if (targetVersion==null)
      throw new NullPointerException( "No target version was provided!" );

    Version currentVersion = this.getDocumentVersion();
    if (currentVersion==null)
    {
      currentVersion = this.getLatestVersion();
      LOGGER.warn( "Can't determine document version! Assuming latest version "
        + currentVersion.toReadableVersion() + "." );
    }
    if (currentVersion==targetVersion) return;

    if (currentVersion.isNewerThen( targetVersion ))
    {
      LOGGER.warn( "The provided target version (" + targetVersion.toReadableVersion() + ") "
        + "is older then the document version (" + currentVersion.toReadableVersion() + ")." );
      return;
    }

    Version v = currentVersion;
    while (true)
    {
      v = v.getNextVersion();
      v.getConverter().upgradeFromPreviousVersion( this );
      if (v==targetVersion) break;
    }
  }

  public final void upgradeToLatestVersion()
  {
    upgrade( this.getLatestVersion() );
  }
}