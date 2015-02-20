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

package org.openestate.io.casa_it;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import org.openestate.io.casa_it.xml.Container;
import org.openestate.io.core.BaseDocument;
import org.openestate.io.core.DocumentUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author Andreas Rudolph
 */
public class CasaItDocument extends BaseDocument<Container>
{
  //private final static Logger LOGGER = LoggerFactory.getLogger(CasaItDocument.class );

  public CasaItDocument( Document document )
  {
    super( document );
    if (!isTransferDocument( document ))
      throw new IllegalArgumentException( "The provided document is invalid!" );
  }

  public static boolean isTransferDocument( Document doc )
  {
    Element root = DocumentUtils.getRootElement( doc );
    return "container".equals( root.getTagName() );
  }

  public static CasaItDocument newDocument() throws ParserConfigurationException, JAXBException
  {
    return newDocument( CasaItUtils.getFactory().createContainer() );
  }

  public static CasaItDocument newDocument( Container container ) throws ParserConfigurationException, JAXBException
  {
    Document document = DocumentUtils.newDocument();
    CasaItUtils.createMarshaller( "UTF-8", true ).marshal( container, document );
    return new CasaItDocument( document );
  }

  @Override
  public Container toObject() throws JAXBException
  {
    return (Container) CasaItUtils.createUnmarshaller().unmarshal( this.getDocument() );
  }
}