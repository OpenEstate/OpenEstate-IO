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

package org.openestate.io.trovit;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import org.openestate.io.core.BaseDocument;
import org.openestate.io.core.DocumentUtils;
import org.openestate.io.trovit.xml.Trovit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author Andreas Rudolph
 */
public class TrovitDocument extends BaseDocument<Trovit>
{
  private final static Logger LOGGER = LoggerFactory.getLogger(TrovitDocument.class );

  public TrovitDocument( Document document )
  {
    super( document );
    if (!isTransferDocument( document ))
      throw new IllegalArgumentException( "The provided document is invalid!" );
    this.setTextWrittenAsCDATA( true );
  }

  public static boolean isTransferDocument( Document doc )
  {
    Element root = DocumentUtils.getRootElement( doc );
    return "trovit".equals( root.getTagName() );
  }

  public static TrovitDocument newDocument() throws ParserConfigurationException, JAXBException
  {
    return newDocument( TrovitUtils.getFactory().createTrovit());
  }

  public static TrovitDocument newDocument( Trovit trovit ) throws ParserConfigurationException, JAXBException
  {
    Document document = DocumentUtils.newDocument();
    TrovitUtils.createMarshaller( "UTF-8", true ).marshal( trovit, document );
    return new TrovitDocument( document );
  }

  @Override
  public Trovit toObject() throws JAXBException
  {
    return (Trovit) TrovitUtils.createUnmarshaller().unmarshal( this.getDocument() );
  }
}