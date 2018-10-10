/*
 * Copyright 2015-2018 OpenEstate.org.
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
import org.openestate.io.core.XmlDocument;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.is24_xml.xml.IS24ImmobilienTransfer;
import org.openestate.io.is24_xml.xml.ImmobilienTransferTyp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * IS24-XML document with a &lt;IS24ImmobilienTransfer&gt; root element.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public class Is24XmlDocument extends XmlDocument<ImmobilienTransferTyp>
{
  private final static Logger LOGGER = LoggerFactory.getLogger( Is24XmlDocument.class );

  /**
   * Create from a {@link Document}.
   *
   * @param document
   * the document to create from
   */
  public Is24XmlDocument( Document document )
  {
    super( document );
    if (!isReadable( document ))
      throw new IllegalArgumentException( "The provided document is invalid!" );
  }

  /**
   * Checks, if a {@link Document} is readable as a {@link Is24XmlDocument}.
   *
   * @param doc
   * document to check
   *
   * @return
   * true, if the document is usable, otherwise false
   */
  public static boolean isReadable( Document doc )
  {
    Element root = XmlUtils.getRootElement( doc );
    return "IS24ImmobilienTransfer".equals( root.getLocalName() );
  }

  /**
   * Creates an empty {@link Is24XmlDocument}.
   *
   * @return
   * created document
   *
   * @throws ParserConfigurationException
   * if the parser is not properly configured
   *
   * @throws JAXBException
   * if a problem with JAXB occured
   */
  public static Is24XmlDocument newDocument() throws ParserConfigurationException, JAXBException
  {
    return newDocument( Is24XmlUtils.getFactory().createImmobilienTransferTyp() );
  }

  /**
   * Creates a {@link Is24XmlDocument} from a {@link ImmobilienTransferTyp}
   * object.
   *
   * @param transfer
   * Java object, that represents the &lt;IS24ImmobilienTransfer&gt; root
   * element
   *
   * @return
   * created document
   *
   * @throws ParserConfigurationException
   * if the parser is not properly configured
   *
   * @throws JAXBException
   * if a problem with JAXB occured
   */
  public static Is24XmlDocument newDocument( ImmobilienTransferTyp transfer ) throws ParserConfigurationException, JAXBException
  {
    return newDocument( Is24XmlUtils.getFactory().createIS24ImmobilienTransfer( transfer ) );
  }

  /**
   * Creates a {@link Is24XmlDocument} from a {@link ImmobilienTransferTyp}
   * object.
   *
   * @param transfer
   * Java object, that represents the &lt;IS24ImmobilienTransfer&gt; root
   * element
   *
   * @return
   * created document
   *
   * @throws ParserConfigurationException
   * if the parser is not properly configured
   *
   * @throws JAXBException
   * if a problem with JAXB occured
   */
  public static Is24XmlDocument newDocument( IS24ImmobilienTransfer transfer ) throws ParserConfigurationException, JAXBException
  {
    Document document = XmlUtils.newDocument();
    Is24XmlUtils.createMarshaller( "UTF-8", true ).marshal( transfer, document );
    return new Is24XmlDocument( document );
  }

  /**
   * Creates a {@link ImmobilienTransferTyp} object from the contained
   * {@link Document}.
   *
   * @return
   * created object, that represents the &lt;IS24ImmobilienTransfer&gt; root
   * element
   *
   * @throws JAXBException
   * if a problem with JAXB occured
   */
  @Override
  public ImmobilienTransferTyp toObject() throws JAXBException
  {
    return ((IS24ImmobilienTransfer) Is24XmlUtils.createUnmarshaller().unmarshal( this.getDocument() )).getValue();
  }
}