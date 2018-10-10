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
package org.openestate.io.openimmo.converters;

import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.jaxen.JaxenException;
import org.openestate.io.core.XmlConverter;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.openimmo.OpenImmoDocument;
import org.openestate.io.openimmo.OpenImmoTransferDocument;
import org.openestate.io.openimmo.OpenImmoUtils;
import org.openestate.io.openimmo.OpenImmoVersion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * Converter for version 1.2.1.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public class OpenImmo_1_2_1 extends XmlConverter<OpenImmoDocument, OpenImmoVersion> {
    private final static Logger LOGGER = LoggerFactory.getLogger(OpenImmo_1_2_1.class);

    @Override
    public OpenImmoVersion getVersion() {
        return OpenImmoVersion.V1_2_1;
    }

    /**
     * Downgrade an OpenImmo document from version 1.2.1 to 1.2.0.
     *
     * @param doc OpenImmo document in version 1.2.1
     */
    @Override
    public void downgradeToPreviousVersion(OpenImmoDocument doc) {
        doc.setDocumentVersion(OpenImmoVersion.V1_2_0);

        if (doc instanceof OpenImmoTransferDocument) {
            try {
                this.removeObjektartZusatzElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove <objektart_zusatz> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeEnergiepassElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <energiepass> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeHausElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <haus> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }
        }

        try {
            this.downgradeXmlNamespace(doc.getDocument());
        } catch (Exception ex) {
            LOGGER.error("Can't downgrade the XML namespace!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
        }
    }

    /**
     * Upgrade an OpenImmo document from version 1.2.0 to 1.2.1.
     *
     * @param doc OpenImmo document in version 1.2.0
     */
    @Override
    public void upgradeFromPreviousVersion(OpenImmoDocument doc) {
        doc.setDocumentVersion(OpenImmoVersion.V1_2_1);

        if (doc instanceof OpenImmoTransferDocument) {
            try {
                this.upgradeEnergiepassElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't upgrade <energiepass> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }
        }

        try {
            this.upgradeXmlNamespace(doc.getDocument());
        } catch (Exception ex) {
            LOGGER.error("Can't upgrade the XML namespace!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
        }
    }

    /**
     * Downgrade &lt;energiepass&gt; elements to OpenImmo 1.2.0.
     * <p>
     * The &lt;mitwarmwasser&gt; child element of the &lt;energiepass&gt; element
     * is not available in version 1.2.0.
     * <p>
     * The &lt;energieverbrauchkennwert&gt;, &lt;endenergiebedarf&gt; child
     * elements of the &lt;energiepass&gt; element are moved into
     * &lt;energiebedarf&gt; and &lt;skala&gt; in version 1.2.0.
     *
     * @param doc OpenImmo document in version 1.2.1
     * @throws JaxenException
     */
    protected void downgradeEnergiepassElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element parentNode = (Element) item;
            boolean skalaProcessed = false;
            String artValue = XmlUtils.newXPath("io:art/text()", doc)
                    .stringValueOf(parentNode);

            List childNodes = XmlUtils.newXPath("io:mitwarmwasser", doc)
                    .selectNodes(parentNode);
            for (Object child : childNodes) {
                Node childNode = (Node) child;
                childNode.getParentNode().removeChild(childNode);
            }

            childNodes = XmlUtils.newXPath("io:energieverbrauchkennwert", doc)
                    .selectNodes(parentNode);
            for (Object childItem : childNodes) {
                Node childNode = (Node) childItem;
                String childValue = StringUtils.trimToNull(childNode.getTextContent());
                if (!skalaProcessed && "VERBRAUCH".equalsIgnoreCase(artValue) && childValue != null) {
                    skalaProcessed = true;
                    Element skalaNode = doc.createElementNS(OpenImmoUtils.OLD_NAMESPACE, "skala");
                    skalaNode.setAttribute("type", "ZAHL");
                    skalaNode.setTextContent(childValue);
                    parentNode.appendChild(skalaNode);
                }
                childNode.getParentNode().removeChild(childNode);
            }

            childNodes = XmlUtils.newXPath("io:endenergiebedarf", doc)
                    .selectNodes(parentNode);
            for (Object childItem : childNodes) {
                Node childNode = (Node) childItem;
                String childValue = StringUtils.trimToNull(childNode.getTextContent());
                if (!skalaProcessed && "BEDARF".equalsIgnoreCase(artValue) && childValue != null) {
                    skalaProcessed = true;
                    Element skalaNode = doc.createElementNS(OpenImmoUtils.OLD_NAMESPACE, "skala");
                    skalaNode.setAttribute("type", "ZAHL");
                    skalaNode.setTextContent(childValue);
                    parentNode.appendChild(skalaNode);

                    Element newNode = doc.createElementNS(OpenImmoUtils.OLD_NAMESPACE, "energiebedarf");
                    newNode.setTextContent(childValue);
                    parentNode.appendChild(newNode);
                }
                childNode.getParentNode().removeChild(childNode);
            }
        }
    }

    /**
     * Downgrade &lt;haus&gt; elements to OpenImmo 1.2.0.
     * <p>
     * The option "BUNGALOW" for the "haustyp" attribute of &lt;haus&gt;
     * elements is not available in version 1.2.0.
     * <p>
     * Any occurence of these values is removed.
     *
     * @param doc OpenImmo document in version 1.2.1
     * @throws JaxenException
     */
    protected void downgradeHausElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:haus[@haustyp]",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            String value = StringUtils.trimToNull(node.getAttribute("haustyp"));
            if ("BUNGALOW".equalsIgnoreCase(value))
                node.removeAttribute("haustyp");
        }
    }

    /**
     * Downgrade XML namespace for OpenImmo 1.2.0.
     * <p>
     * OpenImmo 1.2.0 uses the namespace URI "http://www.openimmo.de".
     *
     * @param doc OpenImmo document in version 1.2.1
     * @throws org.jaxen.JaxenException
     */
    protected void downgradeXmlNamespace(Document doc) throws JaxenException {
        //System.out.println( "----------------------------" );
        //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
        //DocumentUtils.write( doc, System.out );
        //System.out.println( "----------------------------" );

        XmlUtils.replaceNamespace(doc, OpenImmoUtils.OLD_NAMESPACE);

        //System.out.println( "----------------------------" );
        //System.out.println( "DOCUMENT AFTER CONVERSION:" );
        //DocumentUtils.write( doc, System.out );
        //System.out.println( "----------------------------" );
    }

    /**
     * Remove &lt;objektart_zusatz&gt; elements.
     * <p>
     * OpenImmo 1.2.0 does not support &lt;objektart_zusatz&gt; elements.
     *
     * @param doc OpenImmo document in version 1.2.1
     * @throws JaxenException
     */
    protected void removeObjektartZusatzElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:objektart_zusatz",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            Element parentNode = (Element) node.getParentNode();
            parentNode.removeChild(node);
        }
    }

    /**
     * Upgrade &lt;energiepass&gt; elements to OpenImmo 1.2.1.
     * <p>
     * Make sure, that a valid value for &lt;art&gt; is used.
     * <p>
     * Remove unsupported &lt;heizwert&gt; element.
     * <p>
     * Replace &lt;energiebedarf&gt;, &lt;skala&gt; with
     * &lt;energieverbrauchkennwert&gt; or &lt;endenergiebedarf&gt; according to
     * the provided &lt;art&gt;.
     *
     * @param doc OpenImmo document in version 1.2.0
     * @throws JaxenException
     */
    protected void upgradeEnergiepassElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element parentNode = (Element) item;
            String energiebedarfValue = null;
            String skalaValue = null;

            Element artNode = (Element) XmlUtils.newXPath("io:art", doc)
                    .selectSingleNode(parentNode);
            String artValue = (artNode != null) ?
                    StringUtils.trimToNull(artNode.getTextContent()) : null;

            List childNodes = XmlUtils.newXPath("io:heizwert", doc)
                    .selectNodes(parentNode);
            for (Object childItem : childNodes) {
                Node childNode = (Node) childItem;
                childNode.getParentNode().removeChild(childNode);
            }

            childNodes = XmlUtils.newXPath("io:energiebedarf", doc)
                    .selectNodes(parentNode);
            for (Object childItem : childNodes) {
                Node childNode = (Node) childItem;
                if (energiebedarfValue == null)
                    energiebedarfValue = StringUtils.trimToNull(childNode.getTextContent());
                childNode.getParentNode().removeChild(childNode);
            }

            childNodes = XmlUtils.newXPath("io:skala", doc)
                    .selectNodes(parentNode);
            for (Object childItem : childNodes) {
                Element childNode = (Element) childItem;
                if (skalaValue == null && "ZAHL".equalsIgnoreCase(childNode.getAttribute("type")))
                    skalaValue = StringUtils.trimToNull(childNode.getTextContent());
                childNode.getParentNode().removeChild(childNode);
            }

            if (artNode != null && "VERBRAUCH".equalsIgnoreCase(artValue)) {
                artNode.setTextContent("VERBRAUCH");
                String value = skalaValue;
                if (value != null) {
                    Element newNode = doc.createElementNS(StringUtils.EMPTY, "energieverbrauchkennwert");
                    newNode.setTextContent(value);
                    parentNode.appendChild(newNode);
                }
            } else if (artNode != null && "BEDARF".equalsIgnoreCase(artValue)) {
                artNode.setTextContent("BEDARF");
                String value = (energiebedarfValue != null) ? energiebedarfValue : skalaValue;
                if (value != null) {
                    Element newNode = doc.createElementNS(StringUtils.EMPTY, "endenergiebedarf");
                    newNode.setTextContent(value);
                    parentNode.appendChild(newNode);
                }
            }
        }
    }

    /**
     * Downgrade XML namespace for OpenImmo 1.2.1.
     * <p>
     * OpenImmo 1.2.1 uses an empty string as namespace URI.
     *
     * @param doc OpenImmo document in version 1.2.0
     */
    protected void upgradeXmlNamespace(Document doc) {
        //System.out.println( "----------------------------" );
        //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
        //DocumentUtils.write( doc, System.out );
        //System.out.println( "----------------------------" );

        XmlUtils.replaceNamespace(doc, StringUtils.EMPTY);

        //System.out.println( "----------------------------" );
        //System.out.println( "DOCUMENT AFTER CONVERSION:" );
        //DocumentUtils.write( doc, System.out );
        //System.out.println( "----------------------------" );
    }
}