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
import org.openestate.io.openimmo.OpenImmoVersion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * Converter for version 1.2.3.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
@SuppressWarnings({"SpellCheckingInspection", "WeakerAccess"})
public class OpenImmo_1_2_3 extends XmlConverter<OpenImmoDocument<?>, OpenImmoVersion> {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(OpenImmo_1_2_3.class);

    @Override
    public OpenImmoVersion getVersion() {
        return OpenImmoVersion.V1_2_3;
    }

    /**
     * Downgrade an OpenImmo document from version 1.2.3 to 1.2.2.
     *
     * @param doc OpenImmo document in version 1.2.3
     */
    @Override
    public void downgradeToPreviousVersion(OpenImmoDocument<?> doc) {
        doc.setDocumentVersion(OpenImmoVersion.V1_2_2);

        if (doc instanceof OpenImmoTransferDocument) {
            try {
                this.removeEmailFeedbackElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove unsupported <email_feedback> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.removePreiseChildElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove unsupported children of <preise> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeFlaechenChildElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <flaechen> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.removeAusstattungChildElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove unsupported children of <ausstattung> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.removeZustandAngabenChildElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove unsupported children of <zustand_angaben> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.removeUserDefinedExtendElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove unsupported <user_defined_extend> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeParkenElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <parken> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeBadElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <bad> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeKuecheElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <kueche> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            //noinspection DuplicatedCode
            try {
                this.downgradeBodenElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <boden> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeBefeuerungElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <befeuerung> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeAusrichtBalkonTerrasseElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <ausricht_balkon_terrasse> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeDachformElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <dachform> elements!");
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
                this.downgradeSonstigeElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <sonstige> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeZinshausRenditeobjektElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <zinshaus_renditeobjekt> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }
        }
    }

    /**
     * Upgrade an OpenImmo document from version 1.2.2 to 1.2.3.
     *
     * @param doc OpenImmo document in version 1.2.2
     */
    @Override
    public void upgradeFromPreviousVersion(OpenImmoDocument<?> doc) {
        doc.setDocumentVersion(OpenImmoVersion.V1_2_3);

        if (doc instanceof OpenImmoTransferDocument) {
            try {
                this.upgradeSonstigeElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <sonstige> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.upgradeZinshausRenditeobjektElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <zinshaus_renditeobjekt> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }
        }
    }

    /**
     * Downgrade &lt;ausricht_balkon_terrasse&gt; elements to OpenImmo 1.2.2.
     * <p>
     * The attributes "NORDOST", "NORDWEST", "SUEDOST", "SUEDWEST" for
     * &lt;ausricht_balkon_terrasse&gt; elements are not available in version
     * 1.2.2.
     * <p>
     * Any occurences of these values are replaced by the single components -
     * e.g. "NORDOST" is removed and "NORD" + "OST" is set.
     *
     * @param doc OpenImmo document in version 1.2.3
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeAusrichtBalkonTerrasseElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:ausricht_balkon_terrasse[@NORDOST or @NORDWEST or @SUEDOST or @SUEDWEST]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            if (element.hasAttribute("NORDOST")) {
                String value = StringUtils.trimToEmpty(element.getAttribute("NORDOST")).toLowerCase();
                if (value.equals("1") || value.equals("true")) {
                    element.setAttribute("NORD", "true");
                    element.setAttribute("OST", "true");
                }
                element.removeAttribute("NORDOST");
            }
            if (element.hasAttribute("NORDWEST")) {
                String value = StringUtils.trimToEmpty(element.getAttribute("NORDWEST")).toLowerCase();
                if (value.equals("1") || value.equals("true")) {
                    element.setAttribute("NORD", "true");
                    element.setAttribute("WEST", "true");
                }
                element.removeAttribute("NORDWEST");
            }
            if (element.hasAttribute("SUEDOST")) {
                String value = StringUtils.trimToEmpty(element.getAttribute("SUEDOST")).toLowerCase();
                if (value.equals("1") || value.equals("true")) {
                    element.setAttribute("SUED", "true");
                    element.setAttribute("OST", "true");
                }
                element.removeAttribute("SUEDOST");
            }
            if (element.hasAttribute("SUEDWEST")) {
                String value = StringUtils.trimToEmpty(element.getAttribute("SUEDWEST")).toLowerCase();
                if (value.equals("1") || value.equals("true")) {
                    element.setAttribute("SUED", "true");
                    element.setAttribute("WEST", "true");
                }
                element.removeAttribute("SUEDWEST");
            }
        });
    }

    /**
     * Downgrade &lt;bad&gt; elements to OpenImmo 1.2.2.
     * <p>
     * The attributes "BIDET", "PISSOIR" for &lt;bad&gt; elements are not
     * available in version 1.2.2.
     * <p>
     * Any occurences of these values are removed.
     *
     * @param doc OpenImmo document in version 1.2.3
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeBadElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:bad[@BIDET or @PISSOIR]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            element.removeAttribute("BIDET");
            element.removeAttribute("PISSOIR");
        });
    }

    /**
     * Downgrade &lt;befeuerung&gt; elements to OpenImmo 1.2.2.
     * <p>
     * The attribute "PELLET" for &lt;befeuerung&gt; elements is not available in
     * version 1.2.2.
     * <p>
     * Any occurences of these values are removed.
     *
     * @param doc OpenImmo document in version 1.2.3
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeBefeuerungElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:befeuerung[@PELLET]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc,
                (element) -> element.removeAttribute("PELLET"));
    }

    /**
     * Downgrade &lt;boden&gt; elements to OpenImmo 1.2.2.
     * <p>
     * The attributes "MARMOR", "TERRAKOTTA" for &lt;boden&gt; elements are not
     * available in version 1.2.2.
     * <p>
     * Any occurences of these values are removed.
     *
     * @param doc OpenImmo document in version 1.2.3
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeBodenElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:boden[@MARMOR or @TERRAKOTTA]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            element.removeAttribute("MARMOR");
            element.removeAttribute("TERRAKOTTA");
        });
    }

    /**
     * Downgrade &lt;dachform&gt; elements to OpenImmo 1.2.2.
     * <p>
     * The attributes "FLACHDACH", "PYRAMIDENDACH" for &lt;dachform&gt; elements
     * are not available in version 1.2.2.
     * <p>
     * Any occurences of these values are removed.
     *
     * @param doc OpenImmo document in version 1.2.3
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeDachformElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:dachform[@FLACHDACH or @PYRAMIDENDACH]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            element.removeAttribute("FLACHDACH");
            element.removeAttribute("PYRAMIDENDACH");
        });
    }

    /**
     * Remove unsupported children from all &lt;flaechen&gt; elements.
     * <p>
     * OpenImmo 1.2.2 does not support the following children for
     * &lt;flaechen&gt; elements: &lt;anzahl_balkone&gt;, &lt;anzahl_terrassen&gt;
     * <p>
     * These elements are removed by this function. If
     * &lt;anzahl_balkon_terrassen&gt; is not already specified, the sum values of
     * &lt;anzahl_balkone&gt; and &lt;anzahl_terrassen&gt; are written into
     * &lt;anzahl_balkon_terrassen&gt;.
     *
     * @param doc OpenImmo document in version 1.2.3
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeFlaechenChildElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:flaechen";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (parentElement) -> {
            final List<String> options = new ArrayList<>();
            final Map<String, Object> values = new HashMap<>();
            values.put("sum", 0d);

            XmlUtils.xPathElementsProcess(XmlUtils.xPath("io:anzahl_balkone", doc, "io"), parentElement, (childElement) -> {
                if (!options.contains("passedAnzahlBalkone")) {
                    options.add("passedAnzahlBalkone");

                    final String value = StringUtils.trimToNull(childElement.getTextContent());
                    try {
                        if (value != null) {
                            values.put("sum", ((Double) values.get("sum")) + Double.parseDouble(value));
                        }
                    } catch (NumberFormatException ex) {
                        LOGGER.warn("Can't parse <anzahl_balkone>" + value + "</anzahl_balkone> into a numeric value!");
                        LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
                    }
                }
                parentElement.removeChild(childElement);
            });

            XmlUtils.xPathElementsProcess(XmlUtils.xPath("io:anzahl_terrassen", doc, "io"), parentElement, (childElement) -> {
                if (!options.contains("passedAnzahlTerrassen")) {
                    options.add("passedAnzahlTerrassen");

                    final String value = StringUtils.trimToNull(childElement.getTextContent());
                    try {
                        if (value != null) {
                            values.put("sum", ((Double) values.get("sum")) + Double.parseDouble(value));
                        }
                    } catch (NumberFormatException ex) {
                        LOGGER.warn("Can't parse <anzahl_terrassen>" + value + "</anzahl_terrassen> into a numeric value!");
                        LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
                    }
                }
                parentElement.removeChild(childElement);
            });

            final Double sum = (Double) values.get("sum");
            if (sum > 0) {
                Element element = XmlUtils.xPathElement(
                        XmlUtils.xPath("io:anzahl_balkon_terrassen", doc, "io"), parentElement);

                if (element == null) {
                    element = doc.createElementNS(StringUtils.EMPTY, "anzahl_balkon_terrassen");
                    element.setTextContent(String.valueOf(sum));
                    parentElement.appendChild(element);
                } else if (StringUtils.isBlank(element.getTextContent())) {
                    element.setTextContent(String.valueOf(sum));
                }
            }
        });
    }

    /**
     * Downgrade &lt;haus&gt; elements to OpenImmo 1.2.2.
     * <p>
     * The options "APARTMENTHAUS", "BURG", "HERRENHAUS", "FINCA", "RUSTICO" for
     * the "haustyp" attribute of &lt;haus&gt; elements are not available in
     * version 1.2.2.
     * <p>
     * Any occurence of these values is replaced by the "KEINE_ANGABE" value.
     *
     * @param doc OpenImmo document in version 1.2.3
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeHausElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:haus[@haustyp]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final String value = StringUtils.trimToNull(element.getAttribute("haustyp"));

            if ("APARTMENTHAUS".equalsIgnoreCase(value))
                element.setAttribute("haustyp", "KEINE_ANGABE");
            else if ("BURG".equalsIgnoreCase(value))
                element.setAttribute("haustyp", "KEINE_ANGABE");
            else if ("HERRENHAUS".equalsIgnoreCase(value))
                element.setAttribute("haustyp", "KEINE_ANGABE");
            else if ("FINCA".equalsIgnoreCase(value))
                element.setAttribute("haustyp", "KEINE_ANGABE");
            else if ("RUSTICO".equalsIgnoreCase(value))
                element.setAttribute("haustyp", "KEINE_ANGABE");
        });
    }

    /**
     * Downgrade &lt;kueche&gt; elements to OpenImmo 1.2.2.
     * <p>
     * The attribute "PANTRY" for &lt;kueche&gt; elements is not available in
     * version 1.2.2.
     * <p>
     * Any occurences of these values are removed.
     *
     * @param doc OpenImmo document in version 1.2.3
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeKuecheElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:kueche[@PANTRY]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc,
                (element) -> element.removeAttribute("PANTRY"));
    }

    /**
     * Replace &lt;parken&gt; elements with &lt;sonstige&gt; elements.
     * <p>
     * OpenImmo 1.2.2 does not support &lt;parken&gt; elements. Any occurence is
     * converted into &lt;sonstige&gt; elements.
     *
     * @param doc OpenImmo document in version 1.2.3
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeParkenElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:parken";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final Element parent = (Element) element.getParentNode();
            final Element newElement = doc.createElementNS(StringUtils.EMPTY, "sonstige");

            newElement.setAttribute("sonstige_typ", "PARKFLACHE");
            parent.removeChild(element);
            parent.appendChild(newElement);
        });
    }

    /**
     * Downgrade &lt;sonstige&gt; elements to OpenImmo 1.2.2.
     * <p>
     * The option "KRANKENHAUS" for the "sonstige_typ"
     * attribute of &lt;sonstige&gt; elements is placed in the &lt;haus&gt;
     * element in version 1.2.2.
     *
     * @param doc OpenImmo document in version 1.2.3
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeSonstigeElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:sonstige[@sonstige_typ]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final Element parent = (Element) element.getParentNode();
            final Element newElement = doc.createElementNS(StringUtils.EMPTY, "haus");
            final String value = StringUtils.trimToNull(element.getAttribute("sonstige_typ"));

            if ("KRANKENHAUS".equalsIgnoreCase(value)) {
                newElement.setAttribute("haustyp", "KRANKENHAUS");
                parent.removeChild(element);
                parent.appendChild(newElement);
            }
        });
    }

    /**
     * Downgrade &lt;wohnung&gt; elements to OpenImmo 1.2.2.
     * <p>
     * The options "APARTMENT", "FERIENWOHNUNG", "GALERIE" for the "wohnungtyp"
     * attribute of &lt;wohnung&gt; elements are not available in version 1.2.2.
     * <p>
     * Any occurence of these values is replaced by the "KEINE_ANGABE" value.
     *
     * @param doc OpenImmo document in version 1.2.3
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeWohnungElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:wohnung[@wohnungtyp]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final String value = StringUtils.trimToNull(element.getAttribute("wohnungtyp"));

            if ("APARTMENT".equalsIgnoreCase(value))
                element.setAttribute("wohnungtyp", "KEINE_ANGABE");
            else if ("FERIENWOHNUNG".equalsIgnoreCase(value))
                element.setAttribute("wohnungtyp", "KEINE_ANGABE");
            else if ("GALERIE".equalsIgnoreCase(value))
                element.setAttribute("wohnungtyp", "KEINE_ANGABE");
        });
    }

    /**
     * Downgrade &lt;zinshaus_renditeobjekt&gt; elements to OpenImmo 1.2.2.
     * <p>
     * The options "PFLEGEHEIM", "SANATORIUM", "SENIORENHEIM", "BETREUTES-WOHNEN"
     * for the "zins_typ" attribute of &lt;zinshaus_renditeobjekt&gt; elements are
     * placed in the &lt;haus&gt; element in version 1.2.2.
     *
     * @param doc OpenImmo document in version 1.2.3
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeZinshausRenditeobjektElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:zinshaus_renditeobjekt[@zins_typ]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final Element parent = (Element) element.getParentNode();
            final Element newElement = doc.createElementNS(StringUtils.EMPTY, "haus");
            final String value = StringUtils.trimToNull(element.getAttribute("zins_typ"));

            if ("PFLEGEHEIM".equalsIgnoreCase(value)) {
                newElement.setAttribute("haustyp", "PFLEGEHEIM");
                parent.removeChild(element);
                parent.appendChild(newElement);
            } else if ("SANATORIUM".equalsIgnoreCase(value)) {
                newElement.setAttribute("haustyp", "SANATORIUM");
                parent.removeChild(element);
                parent.appendChild(newElement);
            } else if ("SENIORENHEIM".equalsIgnoreCase(value)) {
                newElement.setAttribute("haustyp", "SENIORENHEIM");
                parent.removeChild(element);
                parent.appendChild(newElement);
            } else if ("BETREUTES-WOHNEN".equalsIgnoreCase(value)) {
                newElement.setAttribute("haustyp", "BETREUTES-WOHNEN");
                parent.removeChild(element);
                parent.appendChild(newElement);
            }
        });
    }

    /**
     * Remove unsupported children from all &lt;ausstattung&gt; elements.
     * <p>
     * OpenImmo 1.2.2 does not support the following children for
     * &lt;ausstattung&gt; elements: &lt;energietyp&gt;, &lt;bibliothek&gt;,
     * &lt;dachboden&gt;, &lt;gaestewc&gt;, &lt;kabelkanaele&gt;,
     * &lt;seniorengerecht&gt;
     * <p>
     * These elements are removed by this function.
     *
     * @param doc OpenImmo document in version 1.2.3
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void removeAusstattungChildElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:energietyp | " +
                "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:bibliothek | " +
                "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:dachboden | " +
                "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:gaestewc | " +
                "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:kabelkanaele | " +
                "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:seniorengerecht";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc,
                (element) -> element.getParentNode().removeChild(element));
    }

    /**
     * Remove &lt;email_feedback&gt; elements.
     * <p>
     * OpenImmo 1.2.2 does not support &lt;email_feedback&gt; elements.
     *
     * @param doc OpenImmo document in version 1.2.3
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void removeEmailFeedbackElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:kontaktperson/io:email_feedback";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc,
                (element) -> element.getParentNode().removeChild(element));
    }

    /**
     * Remove unsupported children from all &lt;preise&gt; elements.
     * <p>
     * OpenImmo 1.2.2 does not support the following children for
     * &lt;preise&gt; elements: &lt;courtage_hinweis&gt;,
     * &lt;nettorendite_soll&gt;, &lt;nettorendite_ist&gt;
     * <p>
     * These elements are removed by this function.
     *
     * @param doc OpenImmo document in version 1.2.3
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void removePreiseChildElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:courtage_hinweis | " +
                "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:nettorendite_soll | " +
                "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:nettorendite_ist";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc,
                (element) -> element.getParentNode().removeChild(element));
    }

    /**
     * Remove &lt;user_defined_extend&gt; elements.
     * <p>
     * OpenImmo 1.2.2 does not support &lt;user_defined_extend&gt; elements in
     * &lt;freitexte&gt; and &lt;anhaenge&gt; elements.
     *
     * @param doc OpenImmo document in version 1.2.3
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void removeUserDefinedExtendElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:freitexte/io:user_defined_extend | " +
                "/io:openimmo/io:anbieter/io:immobilie/io:anhaenge/io:user_defined_extend";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc,
                (element) -> element.getParentNode().removeChild(element));
    }

    /**
     * Remove unsupported children from all &lt;zustand_angaben&gt; elements.
     * <p>
     * OpenImmo 1.2.2 does not support the following children for
     * &lt;zustand_angaben&gt; elements: &lt;letztemodernisierung&gt;,
     * &lt;verkaufstatus&gt;
     * <p>
     * These elements are removed by this function.
     *
     * @param doc OpenImmo document in version 1.2.3
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void removeZustandAngabenChildElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:letztemodernisierung | " +
                "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:verkaufstatus";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc,
                (element) -> element.getParentNode().removeChild(element));
    }

    /**
     * Upgrade &lt;sonstige&gt; elements to OpenImmo 1.2.3.
     * <p>
     * The option "KRANKENHAUS" for the "haustyp" attribute of &lt;haus&gt;
     * elements is placed in the &lt;sonstige&gt; element in version 1.2.3.
     *
     * @param doc OpenImmo document in version 1.2.2
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void upgradeSonstigeElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:haus[@haustyp]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final Element parent = (Element) element.getParentNode();
            final Element newElement = doc.createElementNS(StringUtils.EMPTY, "sonstige");
            final String value = StringUtils.trimToNull(element.getAttribute("haustyp"));

            if ("KRANKENHAUS".equalsIgnoreCase(value)) {
                newElement.setAttribute("sonstige_typ", "KRANKENHAUS");
                parent.removeChild(element);
                parent.appendChild(newElement);
            }
        });
    }

    /**
     * Upgrade &lt;zinshaus_renditeobjekt&gt; elements to OpenImmo 1.2.3.
     * <p>
     * The options "PFLEGEHEIM", "SANATORIUM", "SENIORENHEIM", "BETREUTES-WOHNEN"
     * for the "haustyp" attribute of &lt;haus&gt; elements are placed in the
     * &lt;zinshaus_renditeobjekt&gt; element in version 1.2.3.
     *
     * @param doc OpenImmo document in version 1.2.2
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void upgradeZinshausRenditeobjektElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:haus[@haustyp]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final Element parent = (Element) element.getParentNode();
            final Element newElement = doc.createElementNS(StringUtils.EMPTY, "zinshaus_renditeobjekt");
            final String value = StringUtils.trimToNull(element.getAttribute("haustyp"));

            if ("PFLEGEHEIM".equalsIgnoreCase(value)) {
                newElement.setAttribute("zins_typ", "PFLEGEHEIM");
                parent.removeChild(element);
                parent.appendChild(newElement);
            } else if ("SANATORIUM".equalsIgnoreCase(value)) {
                newElement.setAttribute("zins_typ", "SANATORIUM");
                parent.removeChild(element);
                parent.appendChild(newElement);
            } else if ("SENIORENHEIM".equalsIgnoreCase(value)) {
                newElement.setAttribute("zins_typ", "SENIORENHEIM");
                parent.removeChild(element);
                parent.appendChild(newElement);
            } else if ("BETREUTES-WOHNEN".equalsIgnoreCase(value)) {
                newElement.setAttribute("zins_typ", "BETREUTES-WOHNEN");
                parent.removeChild(element);
                parent.appendChild(newElement);
            }
        });
    }
}