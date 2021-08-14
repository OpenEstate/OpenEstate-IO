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

import javax.xml.bind.DatatypeConverter;
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

/**
 * Converter for version 1.2.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
@SuppressWarnings({"SpellCheckingInspection", "WeakerAccess"})
public class OpenImmo_1_2_0 extends XmlConverter<OpenImmoDocument<?>, OpenImmoVersion> {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(OpenImmo_1_2_0.class);

    @Override
    public OpenImmoVersion getVersion() {
        return OpenImmoVersion.V1_2_0;
    }

    /**
     * Downgrade an OpenImmo document from version 1.2.0 to 1.1.
     *
     * @param doc OpenImmo document in version 1.2.0
     */
    @Override
    public void downgradeToPreviousVersion(OpenImmoDocument<?> doc) {
        doc.setDocumentVersion(OpenImmoVersion.V1_1);

        if (doc instanceof OpenImmoTransferDocument) {
            try {
                this.downgradeUebertragungElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <uebertragung> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.removeUserDefinedExtendElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove <user_defined_extend> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.removeAnbieterChildElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove unsupported children of <anbieter> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.removeBieterverfahrenElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove <bieterverfahren> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.removeBewertungElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove <bewertung> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.removeGeoChildElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove unsupported children of <geo> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.removeHeizkostenEnthaltenElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove <heizkosten_enthalten> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.removeAusstattungChildElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove unsupported children of <ausstattung> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.removeEnergiepassElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove <energiepass> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeMieteinnahmenElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <mieteinnahmen_ist> and <mieteinnahmen_soll> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeBefeuerungElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <befeuerung> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeHausElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <haus> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }
        }
    }

    /**
     * Upgrade an OpenImmo document from version 1.1 to 1.2.0.
     *
     * @param doc OpenImmo document in version 1.1
     */
    @Override
    public void upgradeFromPreviousVersion(OpenImmoDocument<?> doc) {
        doc.setDocumentVersion(OpenImmoVersion.V1_2_0);

        if (doc instanceof OpenImmoTransferDocument) {
            try {
                this.upgradeMieteinnahmenElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't upgrade <mieteinnahmen_ist> and <mieteinnahmen_soll> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }
        }
    }

    /**
     * Downgrade &lt;befeuerung&gt; elements to OpenImmo 1.1.
     * <p>
     * The attributes "FERN", "BLOCK", "WASSER-ELEKTRO" for &lt;befeuerung&gt;
     * elements are not available in version 1.1.
     * <p>
     * Any occurences of these values are removed.
     *
     * @param doc OpenImmo document in version 1.2.0
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeBefeuerungElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:befeuerung[@FERN or @BLOCK or @WASSER-ELEKTRO]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            element.removeAttribute("FERN");
            element.removeAttribute("BLOCK");
            element.removeAttribute("WASSER-ELEKTRO");
        });
    }

    /**
     * Downgrade &lt;haus&gt; elements to OpenImmo 1.1.
     * <p>
     * The options "KRANKENHAUS", "PFLEGEHEIM", "SANATORIUM", "SENIORENHEIM",
     * "BETREUTES-WOHNEN" for the "haustyp" attribute of &lt;haus&gt;
     * elements are not available in version 1.1.
     * <p>
     * Any occurence of these values is removed.
     *
     * @param doc OpenImmo document in version 1.2.0
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeHausElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:haus[@haustyp]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final String value = StringUtils.trimToNull(element.getAttribute("haustyp"));

            if ("KRANKENHAUS".equalsIgnoreCase(value))
                element.removeAttribute("haustyp");
            else if ("PFLEGEHEIM".equalsIgnoreCase(value))
                element.removeAttribute("haustyp");
            else if ("SANATORIUM".equalsIgnoreCase(value))
                element.removeAttribute("haustyp");
            else if ("SENIORENHEIM".equalsIgnoreCase(value))
                element.removeAttribute("haustyp");
            else if ("BETREUTES-WOHNEN".equalsIgnoreCase(value))
                element.removeAttribute("haustyp");
        });
    }

    /**
     * Downgrade &lt;mieteinnahmen_ist&gt;, &lt;mieteinnahmen_soll&gt; elements
     * to OpenImmo 1.1.
     * <p>
     * The "periode" attribute of the &lt;mieteinnahmen_ist&gt; and
     * &lt;mieteinnahmen_soll&gt; elements is not available in version 1.1.
     * <p>
     * Any occurences of these values is removed.
     * <p>
     * The numeric value within the &lt;mieteinnahmen_ist&gt; and
     * &lt;mieteinnahmen_soll&gt; elements is converted according to the value of
     * the "periode" attribute.
     *
     * @param doc OpenImmo document in version 1.2.0
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeMieteinnahmenElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:mieteinnahmen_ist[@periode] |" +
                "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:mieteinnahmen_soll[@periode]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final String value = StringUtils.trimToNull(element.getTextContent());

            Double numericValue = null;
            try {
                numericValue = (value != null) ? DatatypeConverter.parseDouble(value) : null;
            } catch (Exception ex) {
                String tagName = element.getTagName();
                LOGGER.warn("Can't parse <" + tagName + ">" + value + "</" + tagName + "> as number!");
                LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            }

            if (numericValue != null && numericValue > 0) {
                String periode = StringUtils.trimToNull(element.getAttribute("periode"));
                if ("MONAT".equalsIgnoreCase(periode)) {
                    element.setTextContent(DatatypeConverter.printDouble(numericValue * 12));
                } else if ("WOCHE".equalsIgnoreCase(periode)) {
                    element.setTextContent(DatatypeConverter.printDouble(numericValue * 52));
                } else if ("TAG".equalsIgnoreCase(periode)) {
                    element.setTextContent(DatatypeConverter.printDouble(numericValue * 365));
                }
            }

            element.removeAttribute("periode");
        });
    }

    /**
     * Downgrade &lt;uebertragung&gt; elements to OpenImmo 1.1.
     * <p>
     * The attributes "senderversion", "regi_id", "modus" for &lt;uebertragung&gt;
     * elements are not available in version 1.1.
     * <p>
     * Any occurences of these values are removed.
     *
     * @param doc OpenImmo document in version 1.2.0
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeUebertragungElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:uebertragung[@senderversion or @regi_id or @modus]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            element.removeAttribute("senderversion");
            element.removeAttribute("regi_id");
            element.removeAttribute("modus");
        });
    }

    /**
     * Remove unsupported children from all &lt;anbieter&gt; elements.
     * <p>
     * OpenImmo 1.1 does not support the following children for
     * &lt;anbieter&gt; elements: &lt;lizenzkennung&gt;, &lt;impressum_strukt&gt;
     * <p>
     * These elements are removed by this function.
     *
     * @param doc OpenImmo document in version 1.2.0
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void removeAnbieterChildElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:lizenzkennung | " +
                "/io:openimmo/io:anbieter/io:impressum_strukt";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc,
                (element) -> element.getParentNode().removeChild(element));
    }

    /**
     * Remove unsupported children from all &lt;ausstattung&gt; elements.
     * <p>
     * OpenImmo 1.1 does not support the following children for
     * &lt;ausstattung&gt; elements: &lt;dvbt&gt;, &lt;breitband_zugang&gt;,
     * &lt;umts_empfang&gt;, &lt;abstellraum&gt;, &lt;fahrradraum&gt;,
     * &lt;rolladen&gt;
     * <p>
     * These elements are removed by this function.
     *
     * @param doc OpenImmo document in version 1.2.0
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void removeAusstattungChildElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:dvbt | " +
                "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:breitband_zugang | " +
                "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:umts_empfang | " +
                "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:abstellraum | " +
                "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:fahrradraum | " +
                "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:rolladen";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc,
                (element) -> element.getParentNode().removeChild(element));
    }

    /**
     * Remove &lt;bewertung&gt; elements.
     * <p>
     * OpenImmo 1.1 does not support &lt;bewertung&gt; elements.
     * <p>
     * Any occurences of these elements are removed.
     *
     * @param doc OpenImmo document in version 1.2.0
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void removeBewertungElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:bewertung";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc,
                (element) -> element.getParentNode().removeChild(element));
    }

    /**
     * Remove &lt;bieterverfahren&gt; elements.
     * <p>
     * OpenImmo 1.1 does not support &lt;bieterverfahren&gt; elements.
     * <p>
     * Any occurences of these elements are removed.
     *
     * @param doc OpenImmo document in version 1.2.0
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void removeBieterverfahrenElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:bieterverfahren";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc,
                (element) -> element.getParentNode().removeChild(element));
    }

    /**
     * Remove &lt;energiepass&gt; elements.
     * <p>
     * OpenImmo 1.1 does not support &lt;energiepass&gt; elements.
     * <p>
     * Any occurences of these elements are removed.
     *
     * @param doc OpenImmo document in version 1.2.0
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void removeEnergiepassElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc,
                (element) -> element.getParentNode().removeChild(element));
    }

    /**
     * Remove unsupported children from all &lt;geo&gt; elements.
     * <p>
     * OpenImmo 1.1 does not support the following children for
     * &lt;geo&gt; elements: &lt;anzahl_etagen&gt;, &lt;karten_makro&gt;,
     * &lt;karten_mikro&gt;, &lt;virtuelletour&gt;, &lt;luftbildern&gt;
     * <p>
     * These elements are removed by this function.
     *
     * @param doc OpenImmo document in version 1.2.0
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void removeGeoChildElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:geo/io:anzahl_etagen | " +
                "/io:openimmo/io:anbieter/io:immobilie/io:geo/io:karten_makro | " +
                "/io:openimmo/io:anbieter/io:immobilie/io:geo/io:karten_mikro | " +
                "/io:openimmo/io:anbieter/io:immobilie/io:geo/io:virtuelletour | " +
                "/io:openimmo/io:anbieter/io:immobilie/io:geo/io:luftbildern";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc,
                (element) -> element.getParentNode().removeChild(element));
    }

    /**
     * Remove &lt;heizkosten_enthalten&gt; elements.
     * <p>
     * OpenImmo 1.1 does not support &lt;heizkosten_enthalten&gt; elements.
     *
     * @param doc OpenImmo document in version 1.2.0
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void removeHeizkostenEnthaltenElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:heizkosten_enthalten";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc,
                (element) -> element.getParentNode().removeChild(element));
    }

    /**
     * Remove &lt;user_defined_extend&gt; elements.
     * <p>
     * OpenImmo 1.1 does not support &lt;user_defined_extend&gt; elements .
     * <p>
     * Any occurences of these elements are removed.
     *
     * @param doc OpenImmo document in version 1.2.0
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void removeUserDefinedExtendElements(Document doc) throws XPathExpressionException {
        final String xpath = "//io:user_defined_extend";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc,
                (element) -> element.getParentNode().removeChild(element));
    }

    /**
     * Upgrade &lt;mieteinnahmen_ist&gt;, &lt;mieteinnahmen_soll&gt; elements
     * to OpenImmo 1.2.0.
     * <p>
     * The "periode" attribute with the value "JAHR" is added to any
     * &lt;mieteinnahmen_ist&gt; and &lt;mieteinnahmen_soll&gt; elements.
     *
     * @param doc OpenImmo document in version 1.1
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void upgradeMieteinnahmenElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:mieteinnahmen_ist |" +
                "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:mieteinnahmen_soll";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc,
                (element) -> element.setAttribute("periode", "JAHR"));
    }
}