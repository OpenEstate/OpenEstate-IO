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

package org.openestate.io.filemaker;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.filemaker.xml.layout.FMPXMLLAYOUT;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * XML document from <a href="http://www.filemaker.com/">Filemaker</a> with a
 * &lt;FMPXMLLAYOUT&gt; root element.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public class FilemakerLayoutDocument extends FilemakerDocument<FMPXMLLAYOUT>
{
  //private final static Logger LOGGER = LoggerFactory.getLogger( FilemakerLayoutDocument.class );

  /**
   * Create from a {@link Document}.
   *
   * @param document
   * the document to create from
   */
  public FilemakerLayoutDocument( Document document )
  {
    super( document );
    if (!isReadable( document ))
      throw new IllegalArgumentException( "The provided document is invalid!" );
  }

  /**
   * Checks, if a {@link Document} is readable as a {@link FilemakerLayoutDocument}.
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
    return "FMPXMLLAYOUT".equals( root.getLocalName() );
  }

  /**
   * Creates an empty {@link FilemakerLayoutDocument}.
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
  public static FilemakerLayoutDocument newDocument() throws ParserConfigurationException, JAXBException
  {
    return newDocument( FilemakerUtils.getFactoryForLayout().createFMPXMLLAYOUT() );
  }

  /**
   * Creates a {@link FilemakerLayoutDocument} from a {@link FMPXMLLAYOUT} object.
   *
   * @param xmlLayout
   * Java object, that represents the &lt;FMPXMLLAYOUT&gt; root element
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
  public static FilemakerLayoutDocument newDocument( FMPXMLLAYOUT xmlLayout ) throws ParserConfigurationException, JAXBException
  {
    Document document = XmlUtils.newDocument();
    FilemakerUtils.createMarshaller( "UTF-8", true ).marshal( xmlLayout, document );
    return new FilemakerLayoutDocument( document );
  }

  /**
   * Creates a {@link FMPXMLLAYOUT} object from the contained {@link Document}.
   *
   * @return
   * created object, that represents the &lt;FMPXMLLAYOUT&gt; root element
   *
   * @throws JAXBException
   * if a problem with JAXB occured
   */
  @Override
  public FMPXMLLAYOUT toObject() throws JAXBException
  {
    return (FMPXMLLAYOUT) FilemakerUtils.createUnmarshaller().unmarshal( this.getDocument() );
  }
}