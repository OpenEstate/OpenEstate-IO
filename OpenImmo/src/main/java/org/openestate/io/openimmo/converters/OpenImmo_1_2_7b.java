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
package org.openestate.io.openimmo.converters;

import org.openestate.io.core.XmlConverter;
import org.openestate.io.openimmo.OpenImmoDocument;
import org.openestate.io.openimmo.OpenImmoVersion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Converter for version 1.2.7b.
 *
 * @since 1.3
 * @author Andreas Rudolph
 */
public class OpenImmo_1_2_7b extends XmlConverter<OpenImmoDocument, OpenImmoVersion>
{
  private final static Logger LOGGER = LoggerFactory.getLogger( OpenImmo_1_2_7b.class );

  @Override
  public OpenImmoVersion getVersion()
  {
    return OpenImmoVersion.V1_2_7B;
  }

  @Override
  public void downgradeToPreviousVersion( OpenImmoDocument doc )
  {
    doc.setDocumentVersion( OpenImmoVersion.V1_2_7 );
  }

  @Override
  public void upgradeFromPreviousVersion( OpenImmoDocument doc )
  {
    doc.setDocumentVersion( OpenImmoVersion.V1_2_7B );
  }
}