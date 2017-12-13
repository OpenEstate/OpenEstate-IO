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
package org.openestate.io.immobar_it;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import org.openestate.io.core.XmlDocument;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.immobar_it.xml.Realestate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * XML document from <a href="https://www.immobar.it">immobar.it</a> with a
 * &lt;realestate&gt; root element.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public class ImmobarItDocument extends XmlDocument<Realestate>
{
  private final static Logger LOGGER = LoggerFactory.getLogger(ImmobarItDocument.class );

  /**
   * Create from a {@link Document}.
   *
   * @param document
   * the document to create from
   */
  public ImmobarItDocument( Document document )
  {
    super( document );
    if (!isReadable( document ))
      throw new IllegalArgumentException( "The provided document is invalid!" );
  }

  /**
   * Checks, if a {@link Document} is readable as a {@link ImmobarItDocument}.
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
    return "realestate".equals( root.getLocalName() );
  }

  /**
   * Creates an empty {@link ImmobarItDocument}.
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
  public static ImmobarItDocument newDocument() throws ParserConfigurationException, JAXBException
  {
    return newDocument( ImmobarItUtils.getFactory().createRealestate() );
  }

  /**
   * Creates a {@link ImmobarItDocument} from a {@link Realestate} object.
   *
   * @param realestate
   * Java object, that represents the &lt;realestate&gt; root element
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
  public static ImmobarItDocument newDocument( Realestate realestate ) throws ParserConfigurationException, JAXBException
  {
    Document document = XmlUtils.newDocument();
    ImmobarItUtils.createMarshaller( "UTF-8", true ).marshal( realestate, document );
    return new ImmobarItDocument( document );
  }

  /**
   * Creates a {@link Realestate} object from the contained {@link Document}.
   *
   * @return
   * created object, that represents the &lt;realestate&gt; root element
   *
   * @throws JAXBException
   * if a problem with JAXB occured
   */
  @Override
  public Realestate toObject() throws JAXBException
  {
    return (Realestate) ImmobarItUtils.createUnmarshaller().unmarshal( this.getDocument() );
  }
}