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
package org.openestate.io.openimmo.converters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.xpath.XPathExpressionException;
import org.apache.commons.lang3.StringUtils;
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

/**
 * Converter for version 1.2.1.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
@SuppressWarnings({"SpellCheckingInspection", "WeakerAccess"})
public class OpenImmo_1_2_1 extends XmlConverter<OpenImmoDocument<?>, OpenImmoVersion> {
    @SuppressWarnings("unused")
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
    public void downgradeToPreviousVersion(OpenImmoDocument<?> doc) {
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
    @SuppressWarnings("Duplicates")
    public void upgradeFromPreviousVersion(OpenImmoDocument<?> doc) {
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
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeEnergiepassElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (parentNode) -> {
            final List<String> options = new ArrayList<>();
            final String artValue = XmlUtils.xPathString(
                    XmlUtils.xPath("io:art/text()", doc, "io"), parentNode);

            XmlUtils.xPathElementsProcess(
                    XmlUtils.xPath("io:mitwarmwasser", doc, "io"), parentNode,
                    (element) -> element.getParentNode().removeChild(element)
            );

            XmlUtils.xPathElementsProcess(
                    XmlUtils.xPath("io:energieverbrauchkennwert", doc, "io"), parentNode,
                    (childNode) -> {
                        final String childValue = StringUtils.trimToNull(childNode.getTextContent());

                        if (!options.contains("skalaProcessed") && "VERBRAUCH".equalsIgnoreCase(artValue) && childValue != null) {
                            options.add("skalaProcessed");

                            final Element skalaNode = doc.createElementNS(OpenImmoUtils.OLD_NAMESPACE, "skala");
                            skalaNode.setAttribute("type", "ZAHL");
                            skalaNode.setTextContent(childValue);
                            parentNode.appendChild(skalaNode);
                        }
                        childNode.getParentNode().removeChild(childNode);
                    }
            );

            XmlUtils.xPathElementsProcess(
                    XmlUtils.xPath("io:endenergiebedarf", doc, "io"), parentNode,
                    (childNode) -> {
                        final String childValue = StringUtils.trimToNull(childNode.getTextContent());

                        if (!options.contains("skalaProcessed") && "BEDARF".equalsIgnoreCase(artValue) && childValue != null) {
                            options.add("skalaProcessed");

                            final Element skalaElement = doc.createElementNS(OpenImmoUtils.OLD_NAMESPACE, "skala");
                            skalaElement.setAttribute("type", "ZAHL");
                            skalaElement.setTextContent(childValue);
                            parentNode.appendChild(skalaElement);

                            final Element newElement = doc.createElementNS(OpenImmoUtils.OLD_NAMESPACE, "energiebedarf");
                            newElement.setTextContent(childValue);
                            parentNode.appendChild(newElement);
                        }

                        childNode.getParentNode().removeChild(childNode);
                    }
            );
        });
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
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeHausElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:haus[@haustyp]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final String value = StringUtils.trimToNull(element.getAttribute("haustyp"));

            if ("BUNGALOW".equalsIgnoreCase(value))
                element.removeAttribute("haustyp");
        });
    }

    /**
     * Downgrade XML namespace for OpenImmo 1.2.0.
     * <p>
     * OpenImmo 1.2.0 uses the namespace URI "http://www.openimmo.de".
     *
     * @param doc OpenImmo document in version 1.2.1
     */
    protected void downgradeXmlNamespace(Document doc) {
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
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void removeObjektartZusatzElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:objektart_zusatz";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc,
                (element) -> element.getParentNode().removeChild(element));
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
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void upgradeEnergiepassElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (parentNode) -> {
            final Map<String,String> values = new HashMap<>();
            values.put("energiebedarf", null);
            values.put("skala", null);

            final Element artNode = XmlUtils.xPathElement(
                    XmlUtils.xPath("io:art", doc, "io"), parentNode);
            final String artValue = (artNode != null) ?
                    StringUtils.trimToNull(artNode.getTextContent()) : null;

            XmlUtils.xPathElementsProcess(
                    XmlUtils.xPath("io:heizwert", doc, "io"), parentNode,
                    (childNode) -> childNode.getParentNode().removeChild(childNode)
            );

            XmlUtils.xPathElementsProcess(
                    XmlUtils.xPath("io:energiebedarf", doc, "io"), parentNode,
                    (childNode) -> {
                        if (values.get("energiebedarf") == null)
                            values.put("energiebedarf", StringUtils.trimToNull(childNode.getTextContent()));
                        childNode.getParentNode().removeChild(childNode);
                    }
            );

            XmlUtils.xPathElementsProcess(
                    XmlUtils.xPath("io:skala", doc, "io"), parentNode,
                    (childNode) -> {
                        if (values.get("skala") == null && "ZAHL".equalsIgnoreCase(childNode.getAttribute("type")))
                            values.put("skala", StringUtils.trimToNull(childNode.getTextContent()));
                        childNode.getParentNode().removeChild(childNode);
                    }
            );

            final String skalaValue = values.get("skala");
            final String energiebedarfValue = values.get("energiebedarf");

            if (artNode != null && "VERBRAUCH".equalsIgnoreCase(artValue)) {
                artNode.setTextContent("VERBRAUCH");
                if (skalaValue != null) {
                    final Element newElement = doc.createElementNS(StringUtils.EMPTY, "energieverbrauchkennwert");
                    newElement.setTextContent(skalaValue);
                    parentNode.appendChild(newElement);
                }
            } else if (artNode != null && "BEDARF".equalsIgnoreCase(artValue)) {
                artNode.setTextContent("BEDARF");
                final String value = (energiebedarfValue != null) ? energiebedarfValue : skalaValue;
                if (value != null) {
                    final Element newElement = doc.createElementNS(StringUtils.EMPTY, "endenergiebedarf");
                    newElement.setTextContent(value);
                    parentNode.appendChild(newElement);
                }
            }
        });
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