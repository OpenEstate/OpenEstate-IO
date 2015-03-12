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

package org.openestate.io.kyero.converters;

import org.apache.commons.lang3.NotImplementedException;
import org.openestate.io.core.XmlConverter;
import org.openestate.io.kyero.KyeroDocument;
import org.openestate.io.kyero.KyeroVersion;

/**
 * Converter for version 2.1.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public class Kyero_2_1 extends XmlConverter<KyeroDocument, KyeroVersion>
{
  //private final static Logger LOGGER = LoggerFactory.getLogger( Kyero_2_1.class );

  @Override
  public KyeroVersion getVersion()
  {
    return KyeroVersion.V2_1;
  }

  /**
   * Downgrade an ImmoXML document from version 1.1.
   * <p>
   * Versions before 1.1 are not supported. Therefore this method always throws
   * a {@link NotImplementedException}.
   *
   * @param doc ImmoXML document in version 1.1
   */
  @Override
  public void downgradeToPreviousVersion( KyeroDocument doc )
  {
    throw new NotImplementedException(
      "Kyero versions before 2.1 are not supported!" );
  }

  /**
   * Downgrade an ImmoXML document to version 1.1.
   * <p>
   * Versions before 1.1 are not supported. Therefore this method always throws
   * a {@link NotImplementedException}.
   *
   * @param doc ImmoXML document
   */
  @Override
  public void upgradeFromPreviousVersion( KyeroDocument doc )
  {
    throw new NotImplementedException(
      "Kyero versions before 2.1 are not supported!" );
  }
}