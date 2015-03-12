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
import org.openestate.io.core.XmlDocument;
import org.openestate.io.core.XmlUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * XML document from <a href="http://casa.it/">casa.it</a> with a
 * &lt;container&gt; root element.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public class CasaItDocument extends XmlDocument<Container>
{
  //private final static Logger LOGGER = LoggerFactory.getLogger(CasaItDocument.class );

  /**
   * Create from a {@link Document}.
   *
   * @param document
   * the document to create from
   */
  public CasaItDocument( Document document )
  {
    super( document );
    if (!isReadable( document ))
      throw new IllegalArgumentException( "The provided document is invalid!" );
  }

  /**
   * Checks, if a {@link Document} is readable as a {@link CasaItDocument}.
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
    return "container".equals( root.getTagName() );
  }

  /**
   * Creates an empty {@link CasaItDocument}.
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
  public static CasaItDocument newDocument() throws ParserConfigurationException, JAXBException
  {
    return newDocument( CasaItUtils.getFactory().createContainer() );
  }

  /**
   * Creates a {@link CasaItDocument} from a {@link Container} object.
   *
   * @param container
   * Java object, that represents the &lt;container&gt; root element
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
  public static CasaItDocument newDocument( Container container ) throws ParserConfigurationException, JAXBException
  {
    Document document = XmlUtils.newDocument();
    CasaItUtils.createMarshaller( "UTF-8", true ).marshal( container, document );
    return new CasaItDocument( document );
  }

  /**
   * Creates a {@link Container} object from the contained {@link Document}.
   *
   * @return
   * created object, that represents the &lt;container&gt; root element
   *
   * @throws JAXBException
   * if a problem with JAXB occured
   */
  @Override
  public Container toObject() throws JAXBException
  {
    return (Container) CasaItUtils.createUnmarshaller().unmarshal( this.getDocument() );
  }
}