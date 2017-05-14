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
package org.openestate.io.core;

/**
 * A general interface for versions of XML documents.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public interface XmlVersion
{
  /**
   * Returns the converter for this version.
   *
   * @return
   * the converter for this version
   */
  public XmlConverter getConverter();

  /**
   * Returns the next version relative to this version.
   *
   * @return
   * the next version or null, if no next version is present
   */
  public XmlVersion getNextVersion();

  /**
   * Returns the previous version relative to this version.
   *
   * @return
   * the previous version or null, if no previous version is present
   */
  public XmlVersion getPreviousVersion();

  /**
   * Returns the newest / latest version, that is currently supported.
   *
   * @return
   * the latest version
   */
  public boolean isLatestVersion();

  /**
   * Check, if this version is newer then another version.
   *
   * @param v
   * the other version to compare
   *
   * @return
   * true, if this version is newer then the other version, otherwise false
   */
  public boolean isNewerThen( XmlVersion v );

  /**
   * Check, if this version is older then another version.
   *
   * @param v
   * the other version to compare
   *
   * @return
   * true, if this version is older then the other version, otherwise false
   */
  public boolean isOlderThen( XmlVersion v );

  /**
   * Convert this version to a readable string.
   *
   * @return
   * the readable string for this version
   */
  public String toReadableVersion();
}