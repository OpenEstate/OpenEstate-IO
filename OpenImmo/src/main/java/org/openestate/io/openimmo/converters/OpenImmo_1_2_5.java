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
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
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

/**
 * Converter for version 1.2.5.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
@SuppressWarnings({"SpellCheckingInspection", "WeakerAccess"})
public class OpenImmo_1_2_5 extends XmlConverter<OpenImmoDocument<?>, OpenImmoVersion> {
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
    public void downgradeToPreviousVersion(OpenImmoDocument<?> doc) {
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

            //noinspection DuplicatedCode
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
    public void upgradeFromPreviousVersion(OpenImmoDocument<?> doc) {
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
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeBebaubarNachElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:bebaubar_nach[@bebaubar_attr]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final String value = StringUtils.trimToNull(element.getAttribute("bebaubar_attr"));

            if ("BAULAND_OHNE_B_PLAN".equalsIgnoreCase(value))
                element.removeAttribute("bebaubar_attr");
        });
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
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeEnergiepassElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final Element parent = (Element) element.getParentNode();
            final List<String> options = new ArrayList<>();

            // create a <user_defined_simplefield> for <hwbwert> elements
            XmlUtils.xPathElementsProcess(XmlUtils.xPath("io:hwbwert", doc, "io"), element, (childElement) -> {
                if (!options.contains("hwbwertPassed")) {
                    String value = StringUtils.trimToNull(childElement.getTextContent());
                    if (value != null) {
                        parent.appendChild(OpenImmoUtils.createUserDefinedSimplefield(doc, "epass_hwbwert", value));
                        options.add("hwbwertPassed");
                    }
                }
                element.removeChild(childElement);
            });

            // create a <user_defined_simplefield> for <hwbklasse> elements
            XmlUtils.xPathElementsProcess(XmlUtils.xPath("io:hwbklasse", doc, "io"), element, (childElement) -> {
                if (!options.contains("hwbklassePassed")) {
                    String value = StringUtils.trimToNull(childElement.getTextContent());
                    if (value != null) {
                        parent.appendChild(OpenImmoUtils.createUserDefinedSimplefield(doc, "epass_hwbklasse", value));
                        options.add("hwbklassePassed");
                    }
                }
                element.removeChild(childElement);
            });

            // create a <user_defined_simplefield> for <fgeewert> elements
            XmlUtils.xPathElementsProcess(XmlUtils.xPath("io:fgeewert", doc, "io"), element, (childElement) -> {
                if (!options.contains("fgeewertPassed")) {
                    String value = StringUtils.trimToNull(childElement.getTextContent());
                    if (value != null) {
                        parent.appendChild(OpenImmoUtils.createUserDefinedSimplefield(doc, "epass_fgeewert", value));
                        options.add("fgeewertPassed");
                    }
                }
                element.removeChild(childElement);
            });

            // create a <user_defined_simplefield> for <baujahr> elements
            XmlUtils.xPathElementsProcess(XmlUtils.xPath("io:fgeeklasse", doc, "io"), element, (childElement) -> {
                if (!options.contains("fgeeklassePassed")) {
                    String value = StringUtils.trimToNull(childElement.getTextContent());
                    if (value != null) {
                        parent.appendChild(OpenImmoUtils.createUserDefinedSimplefield(doc, "epass_fgeeklasse", value));
                        options.add("fgeeklassePassed");
                    }
                }
                element.removeChild(childElement);
            });
        });
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
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeErschliessungElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:erschliessung[@erschl_attr]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final String value = StringUtils.trimToNull(element.getAttribute("erschl_attr"));

            if ("ORTSUEBLICHERSCHLOSSEN".equalsIgnoreCase(value))
                element.removeAttribute("erschl_attr");
        });
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
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeHausElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:haus[@haustyp]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final String value = StringUtils.trimToNull(element.getAttribute("haustyp"));

            if ("FERTIGHAUS".equalsIgnoreCase(value))
                element.setAttribute("haustyp", "KEINE_ANGABE");
        });
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
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeWohnungElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:wohnung[@wohnungtyp]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final String value = StringUtils.trimToNull(element.getAttribute("wohnungtyp"));

            if ("ATTIKAWOHNUNG".equalsIgnoreCase(value))
                element.setAttribute("wohnungtyp", "KEINE_ANGABE");
        });
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
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeZustandElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:zustand[@zustand_art]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final String value = StringUtils.trimToNull(element.getAttribute("zustand_art"));

            if ("TEIL_SANIERT".equalsIgnoreCase(value))
                element.setAttribute("zustand_art", "TEIL_VOLLSANIERT");
            else if ("VOLL_SANIERT".equalsIgnoreCase(value))
                element.setAttribute("zustand_art", "TEIL_VOLLSANIERT");
            else if ("SANIERUNGSBEDUERFTIG".equalsIgnoreCase(value))
                element.removeAttribute("zustand_art");
        });
    }

    /**
     * Remove &lt;anzahl_logia&gt; elements.
     * <p>
     * OpenImmo 1.2.4 does not support &lt;anzahl_logia&gt; elements.
     *
     * @param doc OpenImmo document in version 1.2.5
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void removeAnzahlLogiaElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:flaechen/io:anzahl_logia";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc,
                (element) -> element.getParentNode().removeChild(element));
    }

    /**
     * Remove &lt;erschliessung_umfang&gt; elements.
     * <p>
     * OpenImmo 1.2.4 does not support &lt;erschliessung_umfang&gt; elements.
     *
     * @param doc OpenImmo document in version 1.2.5
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void removeErschliessungUmfangElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:erschliessung_umfang";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc,
                (element) -> element.getParentNode().removeChild(element));
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
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void removeFeedbackObjektChildElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo_feedback/io:objekt/io:land |" +
                "/io:openimmo_feedback/io:objekt/io:stadtbezirk |" +
                "/io:openimmo_feedback/io:objekt/io:anzahl_zimmer |" +
                "/io:openimmo_feedback/io:objekt/io:flaeche";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc,
                (element) -> element.getParentNode().removeChild(element));
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
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void removeKontaktpersonChildElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:kontaktperson/io:position |" +
                "/io:openimmo/io:anbieter/io:immobilie/io:kontaktperson/io:immobilientreuhaenderid |" +
                "/io:openimmo/io:anbieter/io:immobilie/io:kontaktperson/io:foto";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc,
                (element) -> element.getParentNode().removeChild(element));
    }

    /**
     * Remove &lt;mwst_gesamt&gt; elements.
     * <p>
     * OpenImmo 1.2.4 does not support &lt;mwst_gesamt&gt; elements.
     *
     * @param doc OpenImmo document in version 1.2.5
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void removeMwstGesamtElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:mwst_gesamt";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc,
                (element) -> element.getParentNode().removeChild(element));
    }

    /**
     * Remove &lt;verkehrswert&gt; elements.
     * <p>
     * OpenImmo 1.2.4 does not support &lt;verkehrswert&gt; elements.
     *
     * @param doc OpenImmo document in version 1.2.5
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void removeVerkehrswertElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:versteigerung/io:verkehrswert";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc,
                (element) -> element.getParentNode().removeChild(element));
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
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void removeVerwaltungTechnChildElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:verwaltung_techn/io:gruppen_kennung |" +
                "/io:openimmo/io:anbieter/io:immobilie/io:verwaltung_techn/io:master |" +
                "/io:openimmo/io:anbieter/io:immobilie/io:verwaltung_techn/io:sprache";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc,
                (element) -> element.getParentNode().removeChild(element));
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
     * @throws XPathExpressionException if xpath evaluation failed
     */
    @SuppressWarnings("Duplicates")
    protected void upgradeEnergiepassElements(Document doc) throws XPathExpressionException {
        final Map<String, String> fields = new HashMap<>();
        fields.put("hwbwert", "user_defined_simplefield[@feldname='epass_hwbwert']");
        fields.put("hwbklasse", "user_defined_simplefield[@feldname='epass_hwbklasse']");
        fields.put("fgeewert", "user_defined_simplefield[@feldname='epass_fgeewert']");
        fields.put("fgeeklasse", "user_defined_simplefield[@feldname='epass_fgeeklasse']");

        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final List<String> options = new ArrayList<>();
            final Element energiepassNode = ObjectUtils.defaultIfNull(
                    XmlUtils.xPathElement(XmlUtils.xPath("io:energiepass", doc, "io"), element),
                    doc.createElementNS(StringUtils.EMPTY, "energiepass")
            );

            for (Map.Entry<String, String> entry : fields.entrySet()) {
                final String fieldName = entry.getKey();
                final String fieldPath = entry.getValue();

                XmlUtils.xPathElementsProcess(XmlUtils.xPath(fieldPath, doc, "io"), element, (childElement) -> {
                    if (!options.contains(fieldName)) {
                        final String value = StringUtils.trimToNull(childElement.getTextContent());
                        if (value != null) {
                            final Element newElement = doc.createElementNS(StringUtils.EMPTY, entry.getKey());
                            newElement.setTextContent(value);
                            energiepassNode.appendChild(newElement);
                            options.add(fieldName);
                        }
                    }
                    element.removeChild(childElement);
                });
            }

            if (energiepassNode.getParentNode() == null && energiepassNode.hasChildNodes()) {
                element.appendChild(energiepassNode);
            }
        });
    }
}