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
package org.openestate.io.openimmo;

import org.openestate.io.core.XmlConvertableDocument;
import org.w3c.dom.Document;

/**
 * A general OpenImmo-XML document.
 *
 * @param <JavaType>
 * the class of a (via JAXB generated) Java object, that the contained
 * {@link Document} is mapped to
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public abstract class OpenImmoDocument<JavaType> extends XmlConvertableDocument<JavaType, OpenImmoVersion>
{
  //private final static Logger LOGGER = LoggerFactory.getLogger( OpenImmoDocument.class );

  /**
   * Create from a {@link Document}.
   *
   * @param document
   * the document to create from
   */
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

  /**
   * Checks, if the current document is a {@link OpenImmoFeedbackDocument}.
   *
   * @return
   * true, if the current document is a {@link OpenImmoFeedbackDocument}
   */
  public boolean isFeedback()
  {
    return this instanceof OpenImmoFeedbackDocument;
  }

  /**
   * Checks, if the current document is a {@link OpenImmoTransferDocument}.
   *
   * @return
   * true, if the current document is a {@link OpenImmoTransferDocument}
   */
  public boolean isTransfer()
  {
    return this instanceof OpenImmoTransferDocument;
  }
}