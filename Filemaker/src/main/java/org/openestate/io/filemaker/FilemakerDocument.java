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
package org.openestate.io.filemaker;

import org.openestate.io.core.XmlDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

/**
 * A general Filemaker-XML document.
 *
 * @param <JavaType>
 * the class of a (via JAXB generated) Java object, that the contained
 * {@link Document} is mapped to
 *
 * @since 1.0
 * @author Andreas Rudolph<andy@openindex.de>
 */
public abstract class FilemakerDocument<JavaType> extends XmlDocument<JavaType>
{
  private final static Logger LOGGER = LoggerFactory.getLogger( FilemakerDocument.class );

  /**
   * Create from a {@link Document}.
   *
   * @param document
   * the document to create from
   */
  protected FilemakerDocument( Document document )
  {
    super( document );
  }

  /**
   * Checks, if the current document is a {@link FilemakerLayoutDocument}.
   *
   * @return
   * true, if the current document is a {@link FilemakerLayoutDocument}
   */
  public boolean isLayout()
  {
    return this instanceof FilemakerLayoutDocument;
  }

  /**
   * Checks, if the current document is a {@link FilemakerResultDocument}.
   *
   * @return
   * true, if the current document is a {@link FilemakerResultDocument}
   */
  public boolean isResult()
  {
    return this instanceof FilemakerResultDocument;
  }
}