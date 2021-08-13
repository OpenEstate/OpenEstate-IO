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
package org.openestate.io.immobiliare_it;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.lang3.StringUtils;
import org.jaxen.JaxenException;
import org.openestate.io.core.XmlConvertableDocument;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.immobiliare_it.xml.Feed;
import org.openestate.io.immobiliare_it.xml.Version;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * XML document from <a href="http://immobiliare.it/">immobiliare.it</a> with a
 * &lt;feed&gt; root element.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
@SuppressWarnings("WeakerAccess")
public class ImmobiliareItDocument extends XmlConvertableDocument<Feed, ImmobiliareItVersion> {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(ImmobiliareItDocument.class);

    /**
     * Create from a {@link Document}.
     *
     * @param document the document to create from
     */
    public ImmobiliareItDocument(Document document) {
        super(document);
        if (!isReadable(document))
            throw new IllegalArgumentException("The provided document is invalid!");
    }

    @Override
    public ImmobiliareItVersion getDocumentVersion() {
        String version;
        try {
            Document doc = this.getDocument();
            version = StringUtils.trimToNull(XmlUtils
                    .newXPath("/io:feed/io:version/text()", doc)
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

        ImmobiliareItVersion v = ImmobiliareItVersion.detectFromString(version);
        if (v != null) return v;

        LOGGER.warn("The provided version (" + version + ") is not supported!");
        return null;
    }

    @Override
    public ImmobiliareItVersion getLatestVersion() {
        return ImmobiliareItUtils.VERSION;
    }

    /**
     * Checks, if a {@link Document} is readable as a
     * {@link ImmobiliareItDocument}.
     *
     * @param doc document to check
     * @return true, if the document is usable, otherwise false
     */
    public static boolean isReadable(Document doc) {
        Element root = XmlUtils.getRootElement(doc);
        return "feed".equals(root.getLocalName());
    }

    /**
     * Creates an empty {@link ImmobiliareItDocument}.
     *
     * @return created document
     * @throws ParserConfigurationException if the parser is not properly configured
     * @throws JAXBException                if a problem with JAXB occurred
     */
    public static ImmobiliareItDocument newDocument() throws ParserConfigurationException, JAXBException {
        return newDocument(ImmobiliareItUtils.getFactory().createFeed());
    }

    /**
     * Creates a {@link ImmobiliareItDocument} from a {@link Feed} object.
     *
     * @param feed Java object, that represents the &lt;feed&gt; root element
     * @return created document
     * @throws ParserConfigurationException if the parser is not properly configured
     * @throws JAXBException                if a problem with JAXB occurred
     */
    public static ImmobiliareItDocument newDocument(Feed feed) throws ParserConfigurationException, JAXBException {
        return newDocument(feed, null);
    }

    /**
     * Creates a {@link ImmobiliareItDocument} from a {@link Feed} object.
     *
     * @param feed    Java object, that represents the &lt;feed&gt; root element
     * @param context JAXB context for marshalling
     * @return created document
     * @throws ParserConfigurationException if the parser is not properly configured
     * @throws JAXBException                if a problem with JAXB occurred
     */
    public static ImmobiliareItDocument newDocument(Feed feed, JAXBContext context) throws ParserConfigurationException, JAXBException {
        if (feed.getVersion() == null)
            feed.setVersion(Version.V2_5);

        Document document = XmlUtils.newDocument();
        ImmobiliareItUtils.createMarshaller("UTF-8", true, context).marshal(feed, document);
        return new ImmobiliareItDocument(document);
    }

    @Override
    public void setDocumentVersion(ImmobiliareItVersion version) {
        try {
            Document doc = this.getDocument();

            Element node = (Element) XmlUtils
                    .newXPath("/io:feed/io:version", doc)
                    .selectSingleNode(doc);
            if (node == null) {
                Element parentNode = (Element) XmlUtils
                        .newXPath("/io:feed", doc)
                        .selectSingleNode(doc);
                if (parentNode == null) {
                    LOGGER.warn("Can't find a <feed> element in the document!");
                    return;
                }
                node = doc.createElement("version");
                parentNode.insertBefore(node, parentNode.getFirstChild());
            }

            node.setTextContent(version.toReadableVersion());
        } catch (JaxenException ex) {
            LOGGER.error("Can't evaluate XPath expression!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
        }
    }

    /**
     * Creates a {@link Feed} object from the contained {@link Document}.
     *
     * @param context JAXB context for unmarshalling
     * @return created object, that represents the &lt;feed&gt; root element
     * @throws JAXBException if a problem with JAXB occurred
     */
    @Override
    public Feed toObject(JAXBContext context) throws JAXBException {
        this.upgradeToLatestVersion();
        return (Feed) ImmobiliareItUtils.createUnmarshaller(context).unmarshal(this.getDocument());
    }
}