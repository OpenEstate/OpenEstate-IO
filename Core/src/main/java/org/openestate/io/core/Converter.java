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

/**
 * AbstractConverter.
 *
 * @param <DocumentType>
 * ...
 *
 * @param <VersionType>
 * ...
 *
 * @author Andreas Rudolph
 */
public abstract class Converter<DocumentType extends ConvertableDocument, VersionType extends Version>
{
  //private final static Logger LOGGER = LoggerFactory.getLogger( AbstractConverter.class );

  /**
   * Downgrade a document from the current version to the previous version.
   *
   * @param doc document
   */
  public abstract void downgradeToPreviousVersion( DocumentType doc );

  /**
   * Returns the version of the converter.
   *
   * @return version
   */
  public abstract VersionType getVersion();

  /**
   * Upgrade an OpenImmo document from the previous version to the current
   * version.
   *
   * @param doc OpenImmo document
   */
  public abstract void upgradeFromPreviousVersion( DocumentType doc );
}