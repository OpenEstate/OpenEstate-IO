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

package org.openestate.io.wis_it;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import org.openestate.io.core.BaseDocument;
import org.openestate.io.core.DocumentUtils;
import org.openestate.io.wis_it.xml.WIS;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author Andreas Rudolph
 */
public class WisItDocument extends BaseDocument<WIS>
{
  //private final static Logger LOGGER = LoggerFactory.getLogger( WisItDocument.class );

  public WisItDocument( Document document )
  {
    super( document );
    if (!isTransferDocument( document ))
      throw new IllegalArgumentException( "The provided document is invalid!" );
    setTextWrittenAsCDATA( true );
  }

  public static boolean isTransferDocument( Document doc )
  {
    Element root = DocumentUtils.getRootElement( doc );
    return "WIS".equals( root.getTagName() );
  }

  public static WisItDocument newDocument() throws ParserConfigurationException, JAXBException
  {
    return newDocument(WisItUtils.getFactory().createWIS());
  }

  public static WisItDocument newDocument( WIS trovit ) throws ParserConfigurationException, JAXBException
  {
    Document document = DocumentUtils.newDocument();
    WisItUtils.createMarshaller( "UTF-8", true ).marshal( trovit, document );
    return new WisItDocument( document );
  }

  @Override
  public WIS toObject() throws JAXBException
  {
    return (WIS) WisItUtils.createUnmarshaller().unmarshal( this.getDocument() );
  }
}