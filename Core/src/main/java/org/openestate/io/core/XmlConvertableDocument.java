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
package org.openestate.io.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

/**
 * An extended {@link XmlDocument} with versioning functionality.
 *
 * @param <JavaType>
 * the class of a (via JAXB generated) Java object, that the contained
 * {@link Document} is mapped to
 *
 * @param <VersionType>
 * the class to determine different versions of the document
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public abstract class XmlConvertableDocument<JavaType, VersionType extends XmlVersion> extends XmlDocument<JavaType>
{
  private final static Logger LOGGER = LoggerFactory.getLogger( XmlConvertableDocument.class );

  public XmlConvertableDocument( Document document )
  {
    super( document );
  }

  /**
   * Downgrades the contained {@link Document} to an earlier version.
   *
   * @param targetVersion
   * the version, that the {@link Document} is downgraded to
   */
  public void downgrade( VersionType targetVersion )
  {
    if (targetVersion==null)
      throw new NullPointerException( "No target version was provided!" );

    XmlVersion currentVersion = this.getDocumentVersion();
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

    XmlVersion v = currentVersion;
    while (true)
    {
      v.getConverter().downgradeToPreviousVersion( this );
      v = v.getPreviousVersion();
      if (v==targetVersion) break;
    }
  }

  /**
   * Returns the current {@link XmlVersion} of the contained {@link Document}.
   *
   * @return
   * current document version
   */
  public abstract VersionType getDocumentVersion();

  /**
   * Returns the newest supported {@link XmlVersion} for the contained
   * {@link Document}.
   *
   * @return
   * latest supported version
   */
  public abstract VersionType getLatestVersion();

  /**
   * Changes the {@link XmlVersion} of the contained {@link Document}.
   * <p>
   * <strong>Warning:</strong>
   * This function only changes the version information. It does not execute an
   * upgrade / downgrade. Use instead
   * {@link XmlConvertableDocument#downgrade(org.openestate.io.core.XmlVersion)},
   * {@link XmlConvertableDocument#upgrade(org.openestate.io.core.XmlVersion)},
   * {@link XmlConvertableDocument#upgradeToLatestVersion()}
   * in order to perform an upgrade / downgrade.
   *
   * @param version
   * new document version
   */
  public abstract void setDocumentVersion( VersionType version );

  /**
   * Upgrades the contained {@link Document} to a newer version.
   *
   * @param targetVersion
   * the version, that the {@link Document} is upgraded to
   */
  public void upgrade( XmlVersion targetVersion )
  {
    if (targetVersion==null)
      throw new NullPointerException( "No target version was provided!" );

    XmlVersion currentVersion = this.getDocumentVersion();
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

    XmlVersion v = currentVersion;
    while (true)
    {
      v = v.getNextVersion();
      v.getConverter().upgradeFromPreviousVersion( this );
      if (v==targetVersion) break;
    }
  }

  /**
   * Upgrades the contained {@link Document} to the newest / latest version.
   */
  public final void upgradeToLatestVersion()
  {
    upgrade( this.getLatestVersion() );
  }
}