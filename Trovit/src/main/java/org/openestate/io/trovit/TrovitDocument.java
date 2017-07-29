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
package org.openestate.io.trovit;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import org.openestate.io.core.XmlDocument;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.trovit.xml.Trovit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * Trovit-XML document with a &lt;trovit&gt; root element.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public class TrovitDocument extends XmlDocument<Trovit>
{
  private final static Logger LOGGER = LoggerFactory.getLogger( TrovitDocument.class );

  /**
   * Create from a {@link Document}.
   *
   * @param document
   * the document to create from
   */
  public TrovitDocument( Document document )
  {
    super( document );
    if (!isReadable( document ))
      throw new IllegalArgumentException( "The provided document is invalid!" );
    this.setTextWrittenAsCDATA( true );
  }

  /**
   * Checks, if a {@link Document} is readable as a {@link TrovitDocument}.
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
    return "trovit".equals( root.getLocalName() );
  }

  /**
   * Creates an empty {@link TrovitDocument}.
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
  public static TrovitDocument newDocument() throws ParserConfigurationException, JAXBException
  {
    return newDocument( TrovitUtils.getFactory().createTrovit());
  }

  /**
   * Creates a {@link TrovitDocument} from a {@link Trovit} object.
   *
   * @param trovit
   * Java object, that represents the &lt;trovit&gt; root element
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
  public static TrovitDocument newDocument( Trovit trovit ) throws ParserConfigurationException, JAXBException
  {
    Document document = XmlUtils.newDocument();
    TrovitUtils.createMarshaller( "UTF-8", true ).marshal( trovit, document );
    return new TrovitDocument( document );
  }

  /**
   * Creates a {@link Trovit} object from the contained {@link Document}.
   *
   * @return
   * created object, that represents the &lt;trovit&gt; root element
   *
   * @throws JAXBException
   * if a problem with JAXB occured
   */
  @Override
  public Trovit toObject() throws JAXBException
  {
    return (Trovit) TrovitUtils.createUnmarshaller().unmarshal( this.getDocument() );
  }
}