/*
 * Copyright 2015-2021 OpenEstate.org.
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

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.filemaker.xml.layout.FMPXMLLAYOUT;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * XML document from <a href="http://www.filemaker.com/">Filemaker</a> with a
 * &lt;FMPXMLLAYOUT&gt; root element.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
@SuppressWarnings("WeakerAccess")
public class FilemakerLayoutDocument extends FilemakerDocument<FMPXMLLAYOUT> {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(FilemakerLayoutDocument.class);

    /**
     * Create from a {@link Document}.
     *
     * @param document the document to create from
     */
    public FilemakerLayoutDocument(Document document) {
        super(document);
        if (!isReadable(document))
            throw new IllegalArgumentException("The provided document is invalid!");
    }

    /**
     * Checks, if a {@link Document} is readable as a {@link FilemakerLayoutDocument}.
     *
     * @param doc document to check
     * @return true, if the document is usable, otherwise false
     */
    public static boolean isReadable(Document doc) {
        Element root = XmlUtils.getRootElement(doc);
        return "FMPXMLLAYOUT".equals(root.getLocalName());
    }

    /**
     * Creates an empty {@link FilemakerLayoutDocument}.
     *
     * @return created document
     * @throws ParserConfigurationException if the parser is not properly configured
     * @throws JAXBException                if a problem with JAXB occurred
     */
    public static FilemakerLayoutDocument newDocument() throws ParserConfigurationException, JAXBException {
        return newDocument(FilemakerUtils.getFactoryForLayout().createFMPXMLLAYOUT());
    }

    /**
     * Creates a {@link FilemakerLayoutDocument} from a {@link FMPXMLLAYOUT} object.
     *
     * @param xmlLayout Java object, that represents the &lt;FMPXMLLAYOUT&gt; root element
     * @return created document
     * @throws ParserConfigurationException if the parser is not properly configured
     * @throws JAXBException                if a problem with JAXB occurred
     */
    public static FilemakerLayoutDocument newDocument(FMPXMLLAYOUT xmlLayout) throws ParserConfigurationException, JAXBException {
        return newDocument(xmlLayout, null);
    }

    /**
     * Creates a {@link FilemakerLayoutDocument} from a {@link FMPXMLLAYOUT} object.
     *
     * @param xmlLayout Java object, that represents the &lt;FMPXMLLAYOUT&gt; root element
     * @param context   JAXB context for marshalling
     * @return created document
     * @throws ParserConfigurationException if the parser is not properly configured
     * @throws JAXBException                if a problem with JAXB occurred
     */
    public static FilemakerLayoutDocument newDocument(FMPXMLLAYOUT xmlLayout, JAXBContext context) throws ParserConfigurationException, JAXBException {
        Document document = XmlUtils.newDocument();
        FilemakerUtils.createMarshaller("UTF-8", true, context).marshal(xmlLayout, document);
        return new FilemakerLayoutDocument(document);
    }

    /**
     * Creates a {@link FMPXMLLAYOUT} object from the contained {@link Document}.
     *
     * @param context JAXB context for unmarshalling
     * @return created object, that represents the &lt;FMPXMLLAYOUT&gt; root element
     * @throws JAXBException if a problem with JAXB occurred
     */
    @Override
    public FMPXMLLAYOUT toObject(JAXBContext context) throws JAXBException {
        return (FMPXMLLAYOUT) FilemakerUtils.createUnmarshaller(context).unmarshal(this.getDocument());
    }
}