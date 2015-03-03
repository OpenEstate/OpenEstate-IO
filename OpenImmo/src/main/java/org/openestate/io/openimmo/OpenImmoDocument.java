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

package org.openestate.io.openimmo;

import org.openestate.io.core.ConvertableDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

/**
 * OpenImmoDocument.
 *
 * @param <JavaType>
 * ...
 *
 * @author Andreas Rudolph
 */
public abstract class OpenImmoDocument<JavaType> extends ConvertableDocument<JavaType, OpenImmoVersion>
{
  private final static Logger LOGGER = LoggerFactory.getLogger( OpenImmoDocument.class );

  protected OpenImmoDocument( Document document )
  {
    super( document );
  }

  @Override
  public abstract OpenImmoVersion getDocumentVersion();

  @Override
  public OpenImmoVersion getLatestVersion()
  {
    return OpenImmoUtils.VERSION;
  }

  public boolean isFeedback()
  {
    return this instanceof OpenImmoFeedbackDocument;
  }

  public boolean isTransfer()
  {
    return this instanceof OpenImmoTransferDocument;
  }
}