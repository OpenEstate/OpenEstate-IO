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
package org.openestate.io.immoxml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.apache.commons.lang3.StringUtils;
import org.openestate.io.core.XmlConvertableDocument;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.immoxml.xml.Immoxml;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * ImmoXML document with a &lt;immoxml&gt; root element.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public class ImmoXmlDocument extends XmlConvertableDocument<Immoxml, ImmoXmlVersion> {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(ImmoXmlDocument.class);

    /**
     * Create from a {@link Document}.
     *
     * @param document the document to create from
     */
    public ImmoXmlDocument(Document document) {
        super(document);
        if (!isReadable(document))
            throw new IllegalArgumentException("The provided document is invalid!");
    }

    @Override
    public ImmoXmlVersion getDocumentVersion() {
        String version;
        try {
            Document doc = this.getDocument();
            version = StringUtils.trimToNull(XmlUtils.xPathString(
                    XmlUtils.xPath("/io:immoxml/io:uebertragung/@version", doc, "io"), doc));
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
        } catch (XPathExpressionException ex) {
            LOGGER.error("Can't evaluate XPath expression!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            return null;
        }

        ImmoXmlVersion v = ImmoXmlVersion.detectFromString(version);
        if (v != null) return v;

        LOGGER.warn("The provided version (" + version + ") is not supported!");
        return null;
    }

    @Override
    public ImmoXmlVersion getLatestVersion() {
        return ImmoXmlVersion.V3_0;
    }

    /**
     * Checks, if a {@link Document} is readable as a {@link ImmoXmlDocument}.
     *
     * @param doc document to check
     * @return true, if the document is usable, otherwise false
     */
    public static boolean isReadable(Document doc) {
        Element root = XmlUtils.getRootElement(doc);
        return "immoxml".equals(root.getLocalName());
    }

    /**
     * Creates an empty {@link ImmoXmlDocument}.
     *
     * @return created document
     * @throws ParserConfigurationException if the parser is not properly configured
     * @throws JAXBException                if a problem with JAXB occurred
     */
    public static ImmoXmlDocument newDocument() throws ParserConfigurationException, JAXBException {
        return newDocument(ImmoXmlUtils.getFactory().createImmoxml());
    }

    /**
     * Creates a {@link ImmoXmlDocument} from a {@link Immoxml} object.
     *
     * @param immoxml Java object, that represents the &lt;immoxml&gt; root element
     * @return created document
     * @throws ParserConfigurationException if the parser is not properly configured
     * @throws JAXBException                if a problem with JAXB occurred
     */
    public static ImmoXmlDocument newDocument(Immoxml immoxml) throws ParserConfigurationException, JAXBException {
        return newDocument(immoxml, null);
    }

    /**
     * Creates a {@link ImmoXmlDocument} from a {@link Immoxml} object.
     *
     * @param immoxml Java object, that represents the &lt;immoxml&gt; root element
     * @param context JAXB context for marshalling
     * @return created document
     * @throws ParserConfigurationException if the parser is not properly configured
     * @throws JAXBException                if a problem with JAXB occurred
     */
    public static ImmoXmlDocument newDocument(Immoxml immoxml, JAXBContext context) throws ParserConfigurationException, JAXBException {
        if (immoxml.getUebertragung() == null)
            immoxml.setUebertragung(ImmoXmlUtils.getFactory().createUebertragung());
        if (StringUtils.isBlank(immoxml.getUebertragung().getVersion()))
            immoxml.getUebertragung().setVersion(ImmoXmlUtils.VERSION.toReadableVersion());

        Document document = XmlUtils.newDocument();
        ImmoXmlUtils.createMarshaller("UTF-8", true, context).marshal(immoxml, document);
        return new ImmoXmlDocument(document);
    }

    @Override
    public void setDocumentVersion(ImmoXmlVersion version) {
        try {
            Document doc = this.getDocument();

            String currentVersion = StringUtils.trimToEmpty(XmlUtils.xPathString(
                    XmlUtils.xPath("/io:immoxml/io:uebertragung/@version", doc), doc));
            String[] ver = StringUtils.split(currentVersion, "/", 2);

            Element node = XmlUtils.xPathElement(XmlUtils.xPath("/io:immoxml/io:uebertragung", doc), doc);
            if (node == null) {
                Element parentNode = XmlUtils.xPathElement(XmlUtils.xPath("/io:immoxml", doc), doc);
                if (parentNode == null) {
                    LOGGER.warn("Can't find an <immoxml> element in the document!");
                    return;
                }
                node = doc.createElement("uebertragung");
                parentNode.insertBefore(node, parentNode.getFirstChild());
            }

            String newVersion = version.toReadableVersion();
            if (ver.length > 1) newVersion += "/" + ver[1];
            node.setAttribute("version", newVersion);
        } catch (XPathExpressionException ex) {
            LOGGER.error("Can't evaluate XPath expression!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
        }
    }

    /**
     * Creates a {@link Immoxml} object from the contained {@link Document}.
     *
     * @param context JAXB context for unmarshalling
     * @return created object, that represents the &lt;immoxml&gt; root element
     * @throws JAXBException if a problem with JAXB occurred
     */
    @Override
    public Immoxml toObject(JAXBContext context) throws JAXBException {
        this.upgradeToLatestVersion();
        return (Immoxml) ImmoXmlUtils.createUnmarshaller(context).unmarshal(this.getDocument());
    }
}