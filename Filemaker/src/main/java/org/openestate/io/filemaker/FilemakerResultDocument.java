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
package org.openestate.io.filemaker;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.filemaker.xml.result.FMPXMLRESULT;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * XML document from <a href="http://www.filemaker.com/">Filemaker</a> with a
 * &lt;FMPXMLRESULT&gt; root element.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public class FilemakerResultDocument extends FilemakerDocument<FMPXMLRESULT> {
    private final static Logger LOGGER = LoggerFactory.getLogger(FilemakerResultDocument.class);

    /**
     * Create from a {@link Document}.
     *
     * @param document the document to create from
     */
    public FilemakerResultDocument(Document document) {
        super(document);
        if (!isReadable(document))
            throw new IllegalArgumentException("The provided document is invalid!");
    }

    /**
     * Checks, if a {@link Document} is readable as a {@link FilemakerResultDocument}.
     *
     * @param doc document to check
     * @return true, if the document is usable, otherwise false
     */
    public static boolean isReadable(Document doc) {
        Element root = XmlUtils.getRootElement(doc);
        return "FMPXMLRESULT".equals(root.getLocalName());
    }

    /**
     * Creates an empty {@link FilemakerResultDocument}.
     *
     * @return created document
     * @throws ParserConfigurationException if the parser is not properly configured
     * @throws JAXBException                if a problem with JAXB occured
     */
    public static FilemakerResultDocument newDocument() throws ParserConfigurationException, JAXBException {
        return newDocument(FilemakerUtils.getFactoryForResult().createFMPXMLRESULT());
    }

    /**
     * Creates a {@link FilemakerResultDocument} from a {@link FMPXMLRESULT} object.
     *
     * @param xmlResult Java object, that represents the &lt;FMPXMLRESULT&gt; root element
     * @return created document
     * @throws ParserConfigurationException if the parser is not properly configured
     * @throws JAXBException                if a problem with JAXB occured
     */
    public static FilemakerResultDocument newDocument(FMPXMLRESULT xmlResult) throws ParserConfigurationException, JAXBException {
        Document document = XmlUtils.newDocument();
        FilemakerUtils.createMarshaller("UTF-8", true).marshal(xmlResult, document);
        return new FilemakerResultDocument(document);
    }

    /**
     * Creates a {@link FilemakerResultMapping} object from the contained {@link Document}.
     *
     * @return created mapping, that contains the values from the {@link FMPXMLRESULT}
     * @throws JAXBException if a problem with JAXB occured
     */
    public FilemakerResultMapping toMapping() throws JAXBException {
        return new FilemakerResultMapping(this.toObject());
    }

    /**
     * Creates a {@link FMPXMLRESULT} object from the contained {@link Document}.
     *
     * @return created object, that represents the &lt;FMPXMLRESULT&gt; root element
     * @throws JAXBException if a problem with JAXB occured
     */
    @Override
    public FMPXMLRESULT toObject() throws JAXBException {
        return (FMPXMLRESULT) FilemakerUtils.createUnmarshaller().unmarshal(this.getDocument());
    }
}