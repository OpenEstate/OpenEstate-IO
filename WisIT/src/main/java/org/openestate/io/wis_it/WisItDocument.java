/*
 * Copyright 2015-2016 OpenEstate.org.
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

import java.math.BigInteger;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import org.openestate.io.core.XmlDocument;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.wis_it.xml.WIS;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * XML document from
 * <a href="http://wohnen-in-suedtirol.it/">wohnen-in-suedtirol.it</a> with a
 * &lt;WIS&gt; root element.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public class WisItDocument extends XmlDocument<WIS>
{
  //private final static Logger LOGGER = LoggerFactory.getLogger( WisItDocument.class );

  /**
   * Create from a {@link Document}.
   *
   * @param document
   * the document to create from
   */
  public WisItDocument( Document document )
  {
    super( document );
    if (!isReadable( document ))
      throw new IllegalArgumentException( "The provided document is invalid!" );
    setTextWrittenAsCDATA( true );
  }

  /**
   * Checks, if a {@link Document} is readable as a {@link WisItDocument}.
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
    return "WIS".equals( root.getLocalName() );
  }

  /**
   * Creates an empty {@link WisItDocument}.
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
  public static WisItDocument newDocument() throws ParserConfigurationException, JAXBException
  {
    return newDocument( WisItUtils.getFactory().createWIS() );
  }

  /**
   * Creates a {@link WisItDocument} from a {@link WIS} object.
   *
   * @param wis
   * Java object, that represents the &lt;WIS&gt; root element
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
  public static WisItDocument newDocument( WIS wis ) throws ParserConfigurationException, JAXBException
  {
    if (wis.getOBJEKTE()==null)
      wis.setOBJEKTE( WisItUtils.getFactory().createWISOBJEKTE() );
    wis.getOBJEKTE().setANZAHL( BigInteger.valueOf( wis.getOBJEKTE().getOBJEKT().size() ) );

    Document document = XmlUtils.newDocument();
    WisItUtils.createMarshaller( "UTF-8", true ).marshal( wis, document );
    return new WisItDocument( document );
  }

  /**
   * Creates a {@link WIS} object from the contained {@link Document}.
   *
   * @return
   * created object, that represents the &lt;WIS&gt; root element
   *
   * @throws JAXBException
   * if a problem with JAXB occured
   */
  @Override
  public WIS toObject() throws JAXBException
  {
    return (WIS) WisItUtils.createUnmarshaller().unmarshal( this.getDocument() );
  }
}