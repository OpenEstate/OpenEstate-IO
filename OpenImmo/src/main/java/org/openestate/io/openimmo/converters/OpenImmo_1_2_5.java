/*
 * Copyright 2015-2019 OpenEstate.org.
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
import org.openestate.io.openimmo.OpenImmoFeedbackDocument;
import org.openestate.io.openimmo.OpenImmoTransferDocument;
import org.openestate.io.openimmo.OpenImmoUtils;
import org.openestate.io.openimmo.OpenImmoVersion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * Converter for version 1.2.5.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
@SuppressWarnings({"SpellCheckingInspection", "WeakerAccess"})
public class OpenImmo_1_2_5 extends XmlConverter<OpenImmoDocument, OpenImmoVersion> {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(OpenImmo_1_2_5.class);

    @Override
    public OpenImmoVersion getVersion() {
        return OpenImmoVersion.V1_2_5;
    }

    /**
     * Downgrade an OpenImmo document from version 1.2.5 to 1.2.4.
     *
     * @param doc OpenImmo document in version 1.2.5
     */
    @Override
    public void downgradeToPreviousVersion(OpenImmoDocument doc) {
        doc.setDocumentVersion(OpenImmoVersion.V1_2_4);

        // downgrade a feedback document
        if (doc instanceof OpenImmoFeedbackDocument) {
            try {
                this.removeFeedbackObjektChildElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove unsupported children of <objekt> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }
        }

        // downgrade a transfer document
        else if (doc instanceof OpenImmoTransferDocument) {
            try {
                this.removeKontaktpersonChildElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove unsupported children of <kontaktperson> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.removeMwstGesamtElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove unsupported <mwst_gesamt> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.removeVerkehrswertElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove unsupported <verkehrswert> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.removeAnzahlLogiaElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove unsupported <anzahl_logia> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.removeErschliessungUmfangElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove unsupported <erschliessung_umfang> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.removeVerwaltungTechnChildElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove unsupported children of <verwaltung_techn> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeZustandElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <zustand> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeBebaubarNachElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <bebaubar_nach> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeErschliessungElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <erschliessung> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeWohnungElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <wohnung> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeHausElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <haus> elements!");
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
     * Upgrade an OpenImmo document from version 1.2.4 to 1.2.5.
     *
     * @param doc OpenImmo document in version 1.2.4
     */
    @Override
    @SuppressWarnings("Duplicates")
    public void upgradeFromPreviousVersion(OpenImmoDocument doc) {
        doc.setDocumentVersion(OpenImmoVersion.V1_2_5);

        if (doc instanceof OpenImmoTransferDocument) {
            try {
                this.upgradeEnergiepassElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't upgrade <energiepass> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }
        }
    }

    /**
     * Downgrade &lt;bebaubar_nach&gt; elements to OpenImmo 1.2.4.
     * <p>
     * The option "BAULAND_OHNE_B_PLAN" for the "bebaubar_attr" attribute of
     * &lt;bebaubar_nach&gt; elements is not available in version 1.2.4.
     * <p>
     * Any occurences of these values are removed.
     *
     * @param doc OpenImmo document in version 1.2.5
     * @throws JaxenException if xpath evaluation failed
     */
    protected void downgradeBebaubarNachElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:bebaubar_nach[@bebaubar_attr]",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            String value = StringUtils.trimToNull(node.getAttribute("bebaubar_attr"));
            if ("BAULAND_OHNE_B_PLAN".equalsIgnoreCase(value))
                node.removeAttribute("bebaubar_attr");
        }
    }

    /**
     * Downgrade &lt;energiepass&gt; elements to OpenImmo 1.2.4.
     * <p>
     * The child elements &lt;hwbwert&gt;, &lt;hwbklasse&gt;,
     * &lt;fgeewert&gt;, &lt;fgeeklasse&gt; are copied into separate
     * &lt;user_defined_simplefield&gt; elements as it was
     * suggested by OpenImmo e.V..
     *
     * @param doc OpenImmo document in version 1.2.5
     * @throws JaxenException if xpath evaluation failed
     */
    protected void downgradeEnergiepassElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            Element parentNode = (Element) node.getParentNode();
            boolean hwbwertPassed = false;
            boolean hwbklassePassed = false;
            boolean fgeewertPassed = false;
            boolean fgeeklassePassed = false;
            List childNodes;

            // create a <user_defined_simplefield> for <hwbwert> elements
            childNodes = XmlUtils.newXPath("io:hwbwert", doc)
                    .selectNodes(node);
            for (Object childItem : childNodes) {
                Node childNode = (Node) childItem;
                if (!hwbwertPassed) {
                    String value = StringUtils.trimToNull(childNode.getTextContent());
                    if (value != null) {
                        parentNode.appendChild(OpenImmoUtils.createUserDefinedSimplefield(doc, "epass_hwbwert", value));
                        hwbwertPassed = true;
                    }
                }
                node.removeChild(childNode);
            }

            // create a <user_defined_simplefield> for <hwbklasse> elements
            childNodes = XmlUtils.newXPath("io:hwbklasse", doc)
                    .selectNodes(node);
            for (Object childItem : childNodes) {
                Node childNode = (Node) childItem;
                if (!hwbklassePassed) {
                    String value = StringUtils.trimToNull(childNode.getTextContent());
                    if (value != null) {
                        parentNode.appendChild(OpenImmoUtils.createUserDefinedSimplefield(doc, "epass_hwbklasse", value));
                        hwbklassePassed = true;
                    }
                }
                node.removeChild(childNode);
            }

            // create a <user_defined_simplefield> for <fgeewert> elements
            childNodes = XmlUtils.newXPath("io:fgeewert", doc)
                    .selectNodes(node);
            for (Object childItem : childNodes) {
                Node childNode = (Node) childItem;
                if (!fgeewertPassed) {
                    String value = StringUtils.trimToNull(childNode.getTextContent());
                    if (value != null) {
                        parentNode.appendChild(OpenImmoUtils.createUserDefinedSimplefield(doc, "epass_fgeewert", value));
                        fgeewertPassed = true;
                    }
                }
                node.removeChild(childNode);
            }

            // create a <user_defined_simplefield> for <baujahr> elements
            childNodes = XmlUtils.newXPath("io:fgeeklasse", doc)
                    .selectNodes(node);
            for (Object childItem : childNodes) {
                Node childNode = (Node) childItem;
                if (!fgeeklassePassed) {
                    String value = StringUtils.trimToNull(childNode.getTextContent());
                    if (value != null) {
                        parentNode.appendChild(OpenImmoUtils.createUserDefinedSimplefield(doc, "epass_fgeeklasse", value));
                        fgeeklassePassed = true;
                    }
                }
                node.removeChild(childNode);
            }
        }
    }

    /**
     * Downgrade &lt;erschliessung&gt; elements to OpenImmo 1.2.4.
     * <p>
     * The option "ORTSUEBLICHERSCHLOSSEN" for the "erschl_attr" attribute of
     * &lt;erschliessung&gt; elements is not available in version 1.2.4.
     * <p>
     * Any occurence of these values are removed.
     *
     * @param doc OpenImmo document in version 1.2.5
     * @throws JaxenException if xpath evaluation failed
     */
    protected void downgradeErschliessungElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:erschliessung[@erschl_attr]",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            String value = StringUtils.trimToNull(node.getAttribute("erschl_attr"));
            if ("ORTSUEBLICHERSCHLOSSEN".equalsIgnoreCase(value))
                node.removeAttribute("erschl_attr");
        }
    }

    /**
     * Downgrade &lt;haus&gt; elements to OpenImmo 1.2.4.
     * <p>
     * The option "FERTIGHAUS" for the "haustyp" attribute of &lt;haus&gt;
     * elements is not available in version 1.2.4.
     * <p>
     * Any occurence of these values is replaced by the "KEINE_ANGABE" value.
     *
     * @param doc OpenImmo document in version 1.2.5
     * @throws JaxenException if xpath evaluation failed
     */
    protected void downgradeHausElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:haus[@haustyp]",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            String value = StringUtils.trimToNull(node.getAttribute("haustyp"));
            if ("FERTIGHAUS".equalsIgnoreCase(value))
                node.setAttribute("haustyp", "KEINE_ANGABE");
        }
    }

    /**
     * Downgrade &lt;wohnung&gt; elements to OpenImmo 1.2.4.
     * <p>
     * The option "ATTIKAWOHNUNG" for the "wohnungtyp" attribute of
     * &lt;wohnung&gt; elements is not available in version 1.2.4.
     * <p>
     * Any occurence of these values is replaced by the "KEINE_ANGABE" value.
     *
     * @param doc OpenImmo document in version 1.2.5
     * @throws JaxenException if xpath evaluation failed
     */
    protected void downgradeWohnungElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:wohnung[@wohnungtyp]",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            String value = StringUtils.trimToNull(node.getAttribute("wohnungtyp"));
            if ("ATTIKAWOHNUNG".equalsIgnoreCase(value))
                node.setAttribute("wohnungtyp", "KEINE_ANGABE");
        }
    }

    /**
     * Downgrade &lt;zustand&gt; elements to OpenImmo 1.2.4.
     * <p>
     * The options "TEIL_SANIERT", "VOLL_SANIERT", "SANIERUNGSBEDUERFTIG" for the
     * "zustand_art" attribute of &lt;zustand&gt; elements are not available in
     * version 1.2.4.
     * <p>
     * Any occurence of the "TEIL_SANIERT" value is replaced by the
     * "TEIL_VOLLSANIERT" value.
     * <p>
     * Any occurence of the "VOLL_SANIERT" value is replaced by the
     * "TEIL_VOLLSANIERT" value.
     * <p>
     * Any occurence of the "SANIERUNGSBEDUERFTIG" value is removed.
     *
     * @param doc OpenImmo document in version 1.2.5
     * @throws JaxenException if xpath evaluation failed
     */
    protected void downgradeZustandElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:zustand[@zustand_art]",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            String value = StringUtils.trimToNull(node.getAttribute("zustand_art"));
            if ("TEIL_SANIERT".equalsIgnoreCase(value))
                node.setAttribute("zustand_art", "TEIL_VOLLSANIERT");
            else if ("VOLL_SANIERT".equalsIgnoreCase(value))
                node.setAttribute("zustand_art", "TEIL_VOLLSANIERT");
            else if ("SANIERUNGSBEDUERFTIG".equalsIgnoreCase(value))
                node.removeAttribute("zustand_art");
        }
    }

    /**
     * Remove &lt;anzahl_logia&gt; elements.
     * <p>
     * OpenImmo 1.2.4 does not support &lt;anzahl_logia&gt; elements.
     *
     * @param doc OpenImmo document in version 1.2.5
     * @throws JaxenException if xpath evaluation failed
     */
    protected void removeAnzahlLogiaElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:flaechen/io:anzahl_logia",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            Element parentNode = (Element) node.getParentNode();
            parentNode.removeChild(node);
        }
    }

    /**
     * Remove &lt;erschliessung_umfang&gt; elements.
     * <p>
     * OpenImmo 1.2.4 does not support &lt;erschliessung_umfang&gt; elements.
     *
     * @param doc OpenImmo document in version 1.2.5
     * @throws JaxenException if xpath evaluation failed
     */
    protected void removeErschliessungUmfangElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:erschliessung_umfang",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            Element parentNode = (Element) node.getParentNode();
            parentNode.removeChild(node);
        }
    }

    /**
     * Remove unsupported children from all &lt;objekt&gt; elements in feedback
     * XML.
     * <p>
     * OpenImmo 1.2.4 does not support the following children in feedback XML's
     * for &lt;objekt&gt; elements: &lt;land&gt;, &lt;stadtbezirk&gt;,
     * &lt;anzahl_zimmer&gt;, &lt;flaeche&gt;
     * <p>
     * These elements are removed by this function.
     *
     * @param doc OpenImmo document in version 1.2.5
     * @throws JaxenException if xpath evaluation failed
     */
    protected void removeFeedbackObjektChildElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo_feedback/io:objekt/io:land |" +
                        "/io:openimmo_feedback/io:objekt/io:stadtbezirk |" +
                        "/io:openimmo_feedback/io:objekt/io:anzahl_zimmer |" +
                        "/io:openimmo_feedback/io:objekt/io:flaeche",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            Element parentNode = (Element) node.getParentNode();
            parentNode.removeChild(node);
        }
    }

    /**
     * Remove unsupported children from all &lt;kontaktperson&gt; elements.
     * <p>
     * OpenImmo 1.2.4 does not support the following children for
     * &lt;kontaktperson&gt; elements: &lt;position&gt;,
     * &lt;immobilientreuhaenderid&gt;, &lt;foto&gt;
     * <p>
     * These elements are removed by this function.
     *
     * @param doc OpenImmo document in version 1.2.5
     * @throws JaxenException if xpath evaluation failed
     */
    protected void removeKontaktpersonChildElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:kontaktperson/io:position |" +
                        "/io:openimmo/io:anbieter/io:immobilie/io:kontaktperson/io:immobilientreuhaenderid |" +
                        "/io:openimmo/io:anbieter/io:immobilie/io:kontaktperson/io:foto",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            Element parentNode = (Element) node.getParentNode();
            parentNode.removeChild(node);
        }
    }

    /**
     * Remove &lt;mwst_gesamt&gt; elements.
     * <p>
     * OpenImmo 1.2.4 does not support &lt;mwst_gesamt&gt; elements.
     *
     * @param doc OpenImmo document in version 1.2.5
     * @throws JaxenException if xpath evaluation failed
     */
    protected void removeMwstGesamtElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:mwst_gesamt",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            Element parentNode = (Element) node.getParentNode();
            parentNode.removeChild(node);
        }
    }

    /**
     * Remove &lt;verkehrswert&gt; elements.
     * <p>
     * OpenImmo 1.2.4 does not support &lt;verkehrswert&gt; elements.
     *
     * @param doc OpenImmo document in version 1.2.5
     * @throws JaxenException if xpath evaluation failed
     */
    protected void removeVerkehrswertElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:versteigerung/io:verkehrswert",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            Element parentNode = (Element) node.getParentNode();
            parentNode.removeChild(node);
        }
    }

    /**
     * Remove unsupported children from all &lt;verwaltung_techn&gt; elements.
     * <p>
     * OpenImmo 1.2.4 does not support the following children for
     * &lt;verwaltung_techn&gt; elements: &lt;gruppen_kennung&gt;, &lt;master&gt;,
     * &lt;sprache&gt;
     * <p>
     * These elements are removed by this function.
     *
     * @param doc OpenImmo document in version 1.2.5
     * @throws JaxenException if xpath evaluation failed
     */
    protected void removeVerwaltungTechnChildElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:verwaltung_techn/io:gruppen_kennung |" +
                        "/io:openimmo/io:anbieter/io:immobilie/io:verwaltung_techn/io:master |" +
                        "/io:openimmo/io:anbieter/io:immobilie/io:verwaltung_techn/io:sprache",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            Element parentNode = (Element) node.getParentNode();
            parentNode.removeChild(node);
        }
    }

    /**
     * Upgrade &lt;energiepass&gt; elements to OpenImmo 1.2.5.
     * <p>
     * The &lt;user_defined_simplefield&gt; elements for Austria, that were
     * suggested by OpenImmo e.V., are explicitly supported in OpenImmo 1.2.5 as
     * child elements of &lt;energiepass&gt;. Any matching
     * &lt;user_defined_simplefield&gt; elements are moved into the
     * &lt;energiepass&gt; element.
     *
     * @param doc OpenImmo document in version 1.2.4
     * @throws JaxenException if xpath evaluation failed
     */
    @SuppressWarnings("Duplicates")
    protected void upgradeEnergiepassElements(Document doc) throws JaxenException {
        Map<String, String> fields = new HashMap<>();
        fields.put("hwbwert", "user_defined_simplefield[@feldname='epass_hwbwert']");
        fields.put("hwbklasse", "user_defined_simplefield[@feldname='epass_hwbklasse']");
        fields.put("fgeewert", "user_defined_simplefield[@feldname='epass_fgeewert']");
        fields.put("fgeeklasse", "user_defined_simplefield[@feldname='epass_fgeeklasse']");

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
}