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
package org.openestate.io.openimmo;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.lang3.StringUtils;
import org.jaxen.JaxenException;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.openimmo.xml.OpenimmoFeedback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * OpenImmo-XML document with a &lt;openimmo_feedback&gt; root element.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
@SuppressWarnings("WeakerAccess")
public class OpenImmoFeedbackDocument extends OpenImmoDocument<OpenimmoFeedback> {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(OpenImmoFeedbackDocument.class);

    /**
     * Create from a {@link Document}.
     *
     * @param document the document to create from
     */
    public OpenImmoFeedbackDocument(Document document) {
        super(document);
        if (!isReadable(document))
            throw new IllegalArgumentException("The provided document is invalid!");
    }

    @Override
    public OpenImmoVersion getDocumentVersion() {
        String version;
        try {
            Document doc = this.getDocument();

            Element node = (Element) XmlUtils
                    .newXPath("/io:openimmo_feedback/io:version", doc)
                    .selectSingleNode(doc);

            // versions older then 1.2.4 do not support the <version> element
            // - version 1.2.3 is assumed, when no <version> element is present and
            //   an empty namespace is used
            // - version 1.2.0 is assumed, when no <version> element is present and
            //   the old namespace is used
            if (node == null) {
                Element root = XmlUtils.getRootElement(doc);
                return (OpenImmoUtils.OLD_NAMESPACE.equalsIgnoreCase(root.getNamespaceURI())) ?
                        OpenImmoVersion.V1_2_0 : OpenImmoVersion.V1_2_3;
            }

            version = StringUtils.trimToNull(node.getTextContent());
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

        OpenImmoVersion v = OpenImmoVersion.detectFromString(version);
        if (v != null) return v;

        LOGGER.warn("The provided version (" + version + ") is not supported!");
        return null;
    }

    /**
     * Checks, if a {@link Document} is readable as a
     * {@link OpenImmoFeedbackDocument}.
     *
     * @param doc document to check
     * @return true, if the document is usable, otherwise false
     */
    public static boolean isReadable(Document doc) {
        Element root = XmlUtils.getRootElement(doc);
        return "openimmo_feedback".equals(root.getLocalName());
    }

    /**
     * Creates an empty {@link OpenImmoFeedbackDocument}.
     *
     * @return created document
     * @throws ParserConfigurationException if the parser is not properly configured
     * @throws JAXBException                if a problem with JAXB occurred
     */
    public static OpenImmoFeedbackDocument newDocument() throws ParserConfigurationException, JAXBException {
        return newDocument(OpenImmoUtils.getFactory().createOpenimmoFeedback());
    }

    /**
     * Creates a {@link OpenImmoFeedbackDocument} from a
     * {@link OpenimmoFeedback} object.
     *
     * @param feedback Java object, that represents the &lt;openimmo_feedback&gt; root element
     * @return created document
     * @throws ParserConfigurationException if the parser is not properly configured
     * @throws JAXBException                if a problem with JAXB occurred
     */
    public static OpenImmoFeedbackDocument newDocument(OpenimmoFeedback feedback) throws ParserConfigurationException, JAXBException {
        if (StringUtils.isBlank(feedback.getVersion()))
            feedback.setVersion(OpenImmoUtils.VERSION.toReadableVersion());

        Document document = XmlUtils.newDocument();
        OpenImmoUtils.createMarshaller("UTF-8", true).marshal(feedback, document);
        return new OpenImmoFeedbackDocument(document);
    }

    @Override
    public void setDocumentVersion(OpenImmoVersion version) {
        try {
            Document doc = this.getDocument();

            String currentVersion = StringUtils.trimToEmpty(XmlUtils
                    .newXPath("/io:openimmo/io:uebertragung/@version", doc)
                    .stringValueOf(doc));
            String[] ver = StringUtils.split(currentVersion, "/", 2);

            Element node = (Element) XmlUtils
                    .newXPath("/io:openimmo_feedback/io:version", doc)
                    .selectSingleNode(doc);

            // versions older then 1.2.4 do not support the <version> element
            if (OpenImmoVersion.V1_2_4.isNewerThen(version)) {
                if (node != null) {
                    Element root = XmlUtils.getRootElement(doc);
                    root.removeChild(node);
                }
                return;
            }

            if (node == null) {
                Element parentNode = (Element) XmlUtils
                        .newXPath("/io:openimmo_feedback", doc)
                        .selectSingleNode(doc);
                if (parentNode == null) {
                    LOGGER.warn("Can't find an <openimmo_feedback> element in the document!");
                    return;
                }
                node = doc.createElement("version");
                parentNode.insertBefore(node, parentNode.getFirstChild());
            }

            String newVersion = version.toReadableVersion();
            if (ver.length > 1) newVersion += "/" + ver[1];
            node.setTextContent(newVersion);
        } catch (JaxenException ex) {
            LOGGER.error("Can't evaluate XPath expression!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
        }
    }

    /**
     * Creates a {@link OpenimmoFeedback} object from the contained
     * {@link Document}.
     *
     * @return created object, that represents the &lt;openimmo_feedback&gt; root element
     * @throws JAXBException if a problem with JAXB occurred
     */
    @Override
    public OpenimmoFeedback toObject() throws JAXBException {
        this.upgradeToLatestVersion();
        return (OpenimmoFeedback) OpenImmoUtils.createUnmarshaller().unmarshal(this.getDocument());
    }
}