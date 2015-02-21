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

package org.openestate.io.is24_xml;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import org.openestate.io.core.BaseDocument;
import org.openestate.io.core.DocumentUtils;
import org.openestate.io.is24_xml.xml.IS24ImmobilienTransfer;
import org.openestate.io.is24_xml.xml.ImmobilienTransferTyp;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * Is24XmlDocument.
 *
 * @author Andreas Rudolph
 */
public class Is24XmlDocument extends BaseDocument<ImmobilienTransferTyp>
{
  //private final static Logger LOGGER = LoggerFactory.getLogger( WisItDocument.class );

  public Is24XmlDocument( Document document )
  {
    super( document );
    if (!isTransferDocument( document ))
      throw new IllegalArgumentException( "The provided document is invalid!" );
  }

  public static boolean isTransferDocument( Document doc )
  {
    Element root = DocumentUtils.getRootElement( doc );
    return "IS24ImmobilienTransfer".equals( root.getTagName() );
  }

  public static Is24XmlDocument newDocument() throws ParserConfigurationException, JAXBException
  {
    return newDocument( Is24XmlUtils.getFactory().createImmobilienTransferTyp() );
  }

  public static Is24XmlDocument newDocument( ImmobilienTransferTyp transfer ) throws ParserConfigurationException, JAXBException
  {
    return newDocument( Is24XmlUtils.getFactory().createIS24ImmobilienTransfer( transfer ) );
  }

  public static Is24XmlDocument newDocument( IS24ImmobilienTransfer transfer ) throws ParserConfigurationException, JAXBException
  {
    Document document = DocumentUtils.newDocument();
    Is24XmlUtils.createMarshaller( "UTF-8", true ).marshal( transfer, document );
    return new Is24XmlDocument( document );
  }

  @Override
  public ImmobilienTransferTyp toObject() throws JAXBException
  {
    return ((IS24ImmobilienTransfer) Is24XmlUtils.createUnmarshaller().unmarshal( this.getDocument() )).getValue();
  }
}