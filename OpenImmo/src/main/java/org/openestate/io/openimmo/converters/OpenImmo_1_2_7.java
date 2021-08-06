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

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * Converter for version 1.2.7.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
@SuppressWarnings({"SpellCheckingInspection", "WeakerAccess"})
public class OpenImmo_1_2_7 extends XmlConverter<OpenImmoDocument, OpenImmoVersion> {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(OpenImmo_1_2_7.class);

    @Override
    public OpenImmoVersion getVersion() {
        return OpenImmoVersion.V1_2_7;
    }

    /**
     * Downgrade an OpenImmo document from version 1.2.7 to 1.2.6.
     *
     * @param doc OpenImmo document in version 1.2.7
     */
    @Override
    public void downgradeToPreviousVersion(OpenImmoDocument doc) {
        doc.setDocumentVersion(OpenImmoVersion.V1_2_6);

        if (doc instanceof OpenImmoTransferDocument) {
            try {
                this.removeMultipleEnergiepassElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove odd <energiepass> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.removeObjektTextElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove unsupported <objekt_text> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeSummemietenettoElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <summemietenetto> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeBefeuerungElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <befeuerung> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeAnhangElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <anhang> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeAktionElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <aktion> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeEnergiepassElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <energiepass> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }
        }
    }

    /**
     * Upgrade an OpenImmo document from version 1.2.6 to 1.2.7.
     *
     * @param doc OpenImmo document in version 1.2.6
     */
    @Override
    public void upgradeFromPreviousVersion(OpenImmoDocument doc) {
        doc.setDocumentVersion(OpenImmoVersion.V1_2_7);

        if (doc instanceof OpenImmoTransferDocument) {
            try {
                this.upgradeSummemietenettoElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't upgrade <summemietenetto> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.upgradeEnergiepassElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't upgrade <energiepass> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }
        }
    }

    /**
     * Downgrade &lt;aktion&gt; elements to OpenImmo 1.2.6.
     * <p>
     * The option "REFERENZ" for the "aktionart" attribute of
     * &lt;aktion&gt; elements is not available in version 1.2.6.
     * <p>
     * Any occurence of the "REFERENZ" value is replaced by the "CHANGE" value.
     *
     * @param doc OpenImmo document in version 1.2.7
     * @throws JaxenException if xpath evaluation failed
     */
    protected void downgradeAktionElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:verwaltung_techn/io:aktion[@aktionart]",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            String value = StringUtils.trimToNull(node.getAttribute("aktionart"));
            if ("REFERENZ".equalsIgnoreCase(value))
                node.setAttribute("aktionart", "CHANGE");
        }
    }

    /**
     * Downgrade &lt;anhang&gt; elements to OpenImmo 1.2.6.
     * <p>
     * The options "EPASS-SKALA", "ANBOBJURL" for the "gruppe" attribute of
     * &lt;anhang&gt; elements are not available in version 1.2.6
     *
     * @param doc OpenImmo document in version 1.2.7
     * @throws JaxenException if xpath evaluation failed
     */
    protected void downgradeAnhangElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:anhang[@gruppe] | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:anhaenge/io:anhang[@gruppe]",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            String value = StringUtils.trimToNull(node.getAttribute("gruppe"));
            if ("EPASS-SKALA".equalsIgnoreCase(value))
                node.removeAttribute("gruppe");
            else if ("ANBOBJURL".equalsIgnoreCase(value))
                node.removeAttribute("gruppe");
        }
    }

    /**
     * Downgrade &lt;befeuerung&gt; elements to OpenImmo 1.2.6.
     * <p>
     * The attributes "KOHLE", "HOLZ", "FLUESSIGGAS" of &lt;befeuerung&gt;
     * elements are not available in OpenImmo 1.2.6.
     *
     * @param doc OpenImmo document in version 1.2.7
     * @throws JaxenException if xpath evaluation failed
     */
    protected void downgradeBefeuerungElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:befeuerung[@KOHLE or @HOLZ or @FLUESSIGGAS]",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            node.removeAttribute("KOHLE");
            node.removeAttribute("HOLZ");
            node.removeAttribute("FLUESSIGGAS");
        }
    }

    /**
     * Downgrade &lt;energiepass&gt; elements to OpenImmo 1.2.6.
     * <p>
     * The child elements &lt;stromwert&gt;, &lt;waermewert&gt;,
     * &lt;wertklasse&gt;, &lt;baujahr&gt;, &lt;ausstelldatum&gt;,
     * &lt;jahrgang&gt;, &lt;gebaeudeart&gt; are copied into separate
     * &lt;user_defined_simplefield&gt; elements as it was
     * <a href="http://www.openimmo.de/go.php/p/44/cm_enev2014.htm">suggested by OpenImmo e.V.</a>.
     * <p>
     * The child elements &lt;primaerenergietraeger&gt;, &lt;epasstext&gt;
     * are not available in OpenImmo 1.2.6.
     *
     * @param doc OpenImmo document in version 1.2.7
     * @throws JaxenException if xpath evaluation failed
     */
    protected void downgradeEnergiepassElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            Element parentNode = (Element) node.getParentNode();
            boolean stromwertPassed = false;
            boolean waermewertPassed = false;
            boolean wertklassePassed = false;
            boolean baujahrPassed = false;
            boolean ausstelldatumPassed = false;
            boolean jahrgangPassed = false;
            boolean gebaeudeartPassed = false;
            List childNodes;

            // <primaerenergietraeger> elements are not supported in version 1.2.6
            childNodes = XmlUtils.newXPath("io:primaerenergietraeger", doc)
                    .selectNodes(node);
            for (Object childItem : childNodes) {
                Node childNode = (Node) childItem;
                node.removeChild(childNode);
            }

            // <epasstext> elements are not supported in version 1.2.6
            childNodes = XmlUtils.newXPath("io:epasstext", doc)
                    .selectNodes(node);
            for (Object childItem : childNodes) {
                Node childNode = (Node) childItem;
                node.removeChild(childNode);
            }

            // create a <user_defined_simplefield> for <stromwert> elements
            childNodes = XmlUtils.newXPath("io:stromwert", doc)
                    .selectNodes(node);
            for (Object childItem : childNodes) {
                Node childNode = (Node) childItem;
                if (!stromwertPassed) {
                    String value = StringUtils.trimToNull(childNode.getTextContent());
                    if (value != null) {
                        parentNode.appendChild(OpenImmoUtils.createUserDefinedSimplefield(doc, "epass_stromwert", value));
                        stromwertPassed = true;
                    }
                }
                node.removeChild(childNode);
            }

            // create a <user_defined_simplefield> for <waermewert> elements
            childNodes = XmlUtils.newXPath("io:waermewert", doc)
                    .selectNodes(node);
            for (Object childItem : childNodes) {
                Node childNode = (Node) childItem;
                if (!waermewertPassed) {
                    String value = StringUtils.trimToNull(childNode.getTextContent());
                    if (value != null) {
                        parentNode.appendChild(OpenImmoUtils.createUserDefinedSimplefield(doc, "epass_waermewert", value));
                        waermewertPassed = true;
                    }
                }
                node.removeChild(childNode);
            }

            // create a <user_defined_simplefield> for <wertklasse> elements
            childNodes = XmlUtils.newXPath("io:wertklasse", doc)
                    .selectNodes(node);
            for (Object childItem : childNodes) {
                Node childNode = (Node) childItem;
                if (!wertklassePassed) {
                    String value = StringUtils.trimToNull(childNode.getTextContent());
                    if (value != null) {
                        parentNode.appendChild(OpenImmoUtils.createUserDefinedSimplefield(doc, "epass_wertklasse", value));
                        wertklassePassed = true;
                    }
                }
                node.removeChild(childNode);
            }

            // create a <user_defined_simplefield> for <baujahr> elements
            childNodes = XmlUtils.newXPath("io:baujahr", doc)
                    .selectNodes(node);
            for (Object childItem : childNodes) {
                Node childNode = (Node) childItem;
                if (!baujahrPassed) {
                    String value = StringUtils.trimToNull(childNode.getTextContent());
                    if (value != null) {
                        parentNode.appendChild(OpenImmoUtils.createUserDefinedSimplefield(doc, "epass_baujahr", value));
                        baujahrPassed = true;
                    }
                }
                node.removeChild(childNode);
            }

            // create a <user_defined_simplefield> for <ausstelldatum> elements
            childNodes = XmlUtils.newXPath("io:ausstelldatum", doc)
                    .selectNodes(node);
            for (Object childItem : childNodes) {
                Node childNode = (Node) childItem;
                if (!ausstelldatumPassed) {
                    String value = StringUtils.trimToNull(childNode.getTextContent());
                    if (value != null) {
                        parentNode.appendChild(OpenImmoUtils.createUserDefinedSimplefield(doc, "epass_ausstelldatum", value));
                        ausstelldatumPassed = true;
                    }
                }
                node.removeChild(childNode);
            }

            // create a <user_defined_simplefield> for <jahrgang> elements
            childNodes = XmlUtils.newXPath("io:jahrgang", doc)
                    .selectNodes(node);
            for (Object childItem : childNodes) {
                Node childNode = (Node) childItem;
                if (!jahrgangPassed) {
                    String value = StringUtils.trimToNull(childNode.getTextContent());
                    if ("2008".equalsIgnoreCase(value) || "2014".equalsIgnoreCase(value) || "ohne".equalsIgnoreCase(value)) {
                        parentNode.appendChild(OpenImmoUtils.createUserDefinedSimplefield(doc, "epass_jahrgang", value));
                        jahrgangPassed = true;
                    }
                }
                node.removeChild(childNode);
            }

            // create a <user_defined_simplefield> for <gebaeudeart> elements
            childNodes = XmlUtils.newXPath("io:gebaeudeart", doc)
                    .selectNodes(node);
            for (Object childItem : childNodes) {
                Node childNode = (Node) childItem;
                if (!gebaeudeartPassed) {
                    String value = StringUtils.trimToNull(childNode.getTextContent());
                    if ("wohn".equalsIgnoreCase(value) || "nichtwohn".equalsIgnoreCase(value) || "ohne".equalsIgnoreCase(value)) {
                        parentNode.appendChild(OpenImmoUtils.createUserDefinedSimplefield(doc, "epass_gebaeudeart", value));
                        gebaeudeartPassed = true;
                    }
                }
                node.removeChild(childNode);
            }
        }
    }

    /**
     * Downgrade &lt;summemietenetto&gt; elements to OpenImmo 1.2.6.
     * <p>
     * The attribute "summemieteust" of &lt;summemietenetto&gt; elements are
     * renamed to "sonstigemieteust" in OpenImmo 1.2.6.
     *
     * @param doc OpenImmo document in version 1.2.7
     * @throws JaxenException if xpath evaluation failed
     */
    protected void downgradeSummemietenettoElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:summemietenetto[@summemieteust]",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            String value = StringUtils.trimToNull(node.getAttribute("summemieteust"));
            if (value != null) node.setAttribute("sonstigemieteust", value);
            node.removeAttribute("summemieteust");
        }
    }

    /**
     * Only use one &lt;energiepass&gt; element for each &lt;immobilie&gt;.
     * <p>
     * OpenImmo 1.2.6 does not allow more then one &lt;energiepass&gt; element
     * for each &lt;immobilie&gt; (maxOccurs=1). Odd &lt;energiepass&gt; elements
     * are removed by this function.
     *
     * @param doc OpenImmo document in version 1.2.7
     * @throws JaxenException if xpath evaluation failed
     */
    protected void removeMultipleEnergiepassElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element parentNode = (Element) item;
            List childNodes = XmlUtils.newXPath("io:energiepass", doc)
                    .selectNodes(parentNode);
            if (childNodes.size() < 2) continue;
            for (int j = 1; j < childNodes.size(); j++) {
                parentNode.removeChild((Node) childNodes.get(j));
            }
        }
    }

    /**
     * Remove &lt;objekt_text&gt; elements.
     * <p>
     * OpenImmo 1.2.6 does not support &lt;objekt_text&gt; elements.
     *
     * @param doc OpenImmo document in version 1.2.7
     * @throws JaxenException if xpath evaluation failed
     */
    protected void removeObjektTextElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:freitexte/io:objekt_text",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            Element parentNode = (Element) node.getParentNode();
            parentNode.removeChild(node);
        }
    }

    /**
     * Upgrade &lt;energiepass&gt; elements to OpenImmo 1.2.7.
     * <p>
     * The &lt;user_defined_simplefield&gt; elements for EnEv2014, that were
     * <a href="http://www.openimmo.de/go.php/p/44/cm_enev2014.htm">suggested by OpenImmo e.V.</a>,
     * are explicitly supported in OpenImmo 1.2.7 as child elements of
     * &lt;energiepass&gt;. Any matching &lt;user_defined_simplefield&gt; elements
     * are moved into the &lt;energiepass&gt; element.
     *
     * @param doc OpenImmo document in version 1.2.6
     * @throws JaxenException if xpath evaluation failed
     */
    @SuppressWarnings("Duplicates")
    protected void upgradeEnergiepassElements(Document doc) throws JaxenException {
        Map<String, String> fields = new HashMap<>();
        fields.put("stromwert", "user_defined_simplefield[@feldname='epass_stromwert']");
        fields.put("waermewert", "user_defined_simplefield[@feldname='epass_waermewert']");
        fields.put("wertklasse", "user_defined_simplefield[@feldname='epass_wertklasse']");
        fields.put("baujahr", "user_defined_simplefield[@feldname='epass_baujahr']");
        fields.put("ausstelldatum", "user_defined_simplefield[@feldname='epass_ausstelldatum']");
        fields.put("jahrgang", "user_defined_simplefield[@feldname='epass_jahrgang']");
        fields.put("gebaeudeart", "user_defined_simplefield[@feldname='epass_gebaeudeart']");

        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;

            Element energiepassNode = (Element) XmlUtils.newXPath(
                    "io:energiepass", doc).selectSingleNode(node);
            if (energiepassNode == null) {
                energiepassNode = doc.createElementNS(StringUtils.EMPTY, "energiepass");
            }
            for (Map.Entry<String, String> entry : fields.entrySet()) {
                boolean fieldProcessed = false;
                List childNodes = XmlUtils.newXPath(entry.getValue(), doc)
                        .selectNodes(node);
                for (Object childItem : childNodes) {
                    Node childNode = (Node) childItem;
                    if (!fieldProcessed) {
                        String value = StringUtils.trimToNull(childNode.getTextContent());
                        if (value != null) {
                            Element newElement = doc.createElementNS(StringUtils.EMPTY, entry.getKey());
                            newElement.setTextContent(value);
                            energiepassNode.appendChild(newElement);
                            fieldProcessed = true;
                        }
                    }
                    node.removeChild(childNode);
                }
            }
            if (energiepassNode.getParentNode() == null && energiepassNode.hasChildNodes()) {
                node.appendChild(energiepassNode);
            }
        }
    }

    /**
     * Upgrade &lt;summemietenetto&gt; elements to OpenImmo 1.2.7.
     * <p>
     * The attribute "sonstigemieteust" of &lt;summemietenetto&gt; elements is
     * renamed to "summemieteust" in OpenImmo 1.2.7.
     *
     * @param doc OpenImmo document in version 1.2.6
     * @throws JaxenException if xpath evaluation failed
     */
    protected void upgradeSummemietenettoElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:summemietenetto[@sonstigemieteust]",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            String value = StringUtils.trimToNull(node.getAttribute("sonstigemieteust"));
            if (value != null) node.setAttribute("summemieteust", value);
            node.removeAttribute("sonstigemieteust");
        }
    }
}