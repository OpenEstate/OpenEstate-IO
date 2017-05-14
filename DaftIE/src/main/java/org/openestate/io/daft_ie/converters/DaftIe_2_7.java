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
package org.openestate.io.daft_ie.converters;

import org.apache.commons.lang3.NotImplementedException;
import org.openestate.io.core.XmlConverter;
import org.openestate.io.daft_ie.DaftIeDocument;
import org.openestate.io.daft_ie.DaftIeVersion;

/**
 * Converter for version 2.7.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public class DaftIe_2_7 extends XmlConverter<DaftIeDocument, DaftIeVersion>
{
  //private final static Logger LOGGER = LoggerFactory.getLogger( OpenImmo_1_1.class );

  @Override
  public DaftIeVersion getVersion()
  {
    return DaftIeVersion.V2_7;
  }

  /**
   * Downgrade an OpenImmo document from version 1.1.
   * <p>
   * Versions before 1.1 are not supported. Therefore this method always throws
   * a {@link NotImplementedException}.
   *
   * @param doc OpenImmo document in version 1.1
   */
  @Override
  public void downgradeToPreviousVersion( DaftIeDocument doc )
  {
    throw new NotImplementedException(
      "Daft-XML versions before 2.7 are not supported!" );
  }

  /**
   * Downgrade an OpenImmo document to version 1.1.
   * <p>
   * Versions before 1.1 are not supported. Therefore this method always throws
   * a {@link NotImplementedException}.
   *
   * @param doc OpenImmo document
   */
  @Override
  public void upgradeFromPreviousVersion( DaftIeDocument doc )
  {
    throw new NotImplementedException(
      "Daft-XML versions before 2.7 are not supported!" );
  }
}