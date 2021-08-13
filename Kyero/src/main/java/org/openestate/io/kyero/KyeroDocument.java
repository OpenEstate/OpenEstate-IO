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
package org.openestate.io.kyero;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.lang3.StringUtils;
import org.jaxen.JaxenException;
import org.openestate.io.core.XmlConvertableDocument;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.kyero.xml.Root;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * Kyero-XML document with a &lt;root&gt; root element.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
@SuppressWarnings("WeakerAccess")
public class KyeroDocument extends XmlConvertableDocument<Root, KyeroVersion> {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(KyeroDocument.class);

    /**
     * Create from a {@link Document}.
     *
     * @param document the document to create from
     */
    public KyeroDocument(Document document) {
        super(document);
        if (!isReadable(document))
            throw new IllegalArgumentException("The provided document is invalid!");
    }

    @Override
    public KyeroVersion getDocumentVersion() {
        String version;
        try {
            Document doc = this.getDocument();
            version = StringUtils.trimToNull(XmlUtils
                    .newXPath("/io:root/io:kyero/io:feed_version/text()", doc)
                    .stringValueOf(doc));
            if (version == null) {
                LOGGER.warn("Can't find version information in the XML document!");
                //System.out.println( "----------------------------" );
                //try
                //{
                //  DocumentUtils.write( doc, System.out );
                //}
                //catch (Exception ex)
                //{
                //  LOGGER.error( "Can't write XML document!" );
                //  LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
                //}
                //System.out.println( "----------------------------" );
                return null;
            }
        } catch (JaxenException ex) {
            LOGGER.error("Can't evaluate XPath expression!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            return null;
        }

        KyeroVersion v = KyeroVersion.detectFromString(version);
        if (v != null) return v;

        LOGGER.warn("The provided version (" + version + ") is not supported!");
        return null;
    }

    @Override
    public KyeroVersion getLatestVersion() {
        return KyeroVersion.V3;
    }

    /**
     * Checks, if a {@link Document} is readable as a {@link KyeroDocument}.
     *
     * @param doc document to check
     * @return true, if the document is usable, otherwise false
     */
    public static boolean isReadable(Document doc) {
        Element root = XmlUtils.getRootElement(doc);
        return "root".equals(root.getLocalName());
    }

    /**
     * Creates an empty {@link KyeroDocument}.
     *
     * @return created document
     * @throws ParserConfigurationException if the parser is not properly configured
     * @throws JAXBException                if a problem with JAXB occurred
     */
    public static KyeroDocument newDocument() throws ParserConfigurationException, JAXBException {
        return newDocument(KyeroUtils.getFactory().createRoot());
    }

    /**
     * Creates a {@link KyeroDocument} from a {@link Root} object.
     *
     * @param root Java object, that represents the &lt;root&gt; root element
     * @return created document
     * @throws ParserConfigurationException if the parser is not properly configured
     * @throws JAXBException                if a problem with JAXB occurred
     */
    public static KyeroDocument newDocument(Root root) throws ParserConfigurationException, JAXBException {
        return newDocument(root, null);
    }

    /**
     * Creates a {@link KyeroDocument} from a {@link Root} object.
     *
     * @param root    Java object, that represents the &lt;root&gt; root element
     * @param context JAXB context for marshalling
     * @return created document
     * @throws ParserConfigurationException if the parser is not properly configured
     * @throws JAXBException                if a problem with JAXB occurred
     */
    public static KyeroDocument newDocument(Root root, JAXBContext context) throws ParserConfigurationException, JAXBException {
        if (root.getKyero() == null)
            root.setKyero(KyeroUtils.getFactory().createKyeroType());
        if (StringUtils.isBlank(root.getKyero().getFeedVersion()))
            root.getKyero().setFeedVersion(KyeroUtils.VERSION.toXmlVersion());

        Document document = XmlUtils.newDocument();
        KyeroUtils.createMarshaller("UTF-8", true, context).marshal(root, document);
        return new KyeroDocument(document);
    }

    @Override
    public void setDocumentVersion(KyeroVersion version) {
        try {
            Document doc = this.getDocument();

            Element node = (Element) XmlUtils
                    .newXPath("/io:root/io:kyero/io:feed_version", doc)
                    .selectSingleNode(doc);
            if (node == null) {
                Element parentNode = (Element) XmlUtils
                        .newXPath("/io:root/io:kyero", doc)
                        .selectSingleNode(doc);
                if (parentNode == null) {
                    Element grandParentNode = (Element) XmlUtils
                            .newXPath("/io:root", doc)
                            .selectSingleNode(doc);
                    if (grandParentNode == null) {
                        LOGGER.warn("Can't find a <root> element in the document!");
                        return;
                    }
                    parentNode = doc.createElement("kyero");
                    grandParentNode.insertBefore(parentNode, grandParentNode.getFirstChild());
                }
                node = doc.createElement("feed_version");
                parentNode.insertBefore(node, parentNode.getFirstChild());
            }

            String newVersion = version.toXmlVersion();
            node.setTextContent(newVersion);
        } catch (JaxenException ex) {
            LOGGER.error("Can't evaluate XPath expression!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
        }
    }

    /**
     * Creates a {@link Root} object from the contained {@link Document}.
     *
     * @param context JAXB context for unmarshalling
     * @return created object, that represents the &lt;root&gt; root element
     * @throws JAXBException if a problem with JAXB occurred
     */
    @Override
    public Root toObject(JAXBContext context) throws JAXBException {
        this.upgradeToLatestVersion();
        return (Root) KyeroUtils.createUnmarshaller(context).unmarshal(this.getDocument());
    }
}