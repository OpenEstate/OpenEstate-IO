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
import java.util.List;
import javax.xml.xpath.XPathExpressionException;
import org.apache.commons.lang3.StringUtils;
import org.openestate.io.core.XmlConverter;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.openimmo.OpenImmoDocument;
import org.openestate.io.openimmo.OpenImmoFeedbackDocument;
import org.openestate.io.openimmo.OpenImmoTransferDocument;
import org.openestate.io.openimmo.OpenImmoVersion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * Converter for version 1.2.4.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
@SuppressWarnings({"SpellCheckingInspection", "WeakerAccess"})
public class OpenImmo_1_2_4 extends XmlConverter<OpenImmoDocument<?>, OpenImmoVersion> {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(OpenImmo_1_2_4.class);

    @Override
    public OpenImmoVersion getVersion() {
        return OpenImmoVersion.V1_2_4;
    }

    /**
     * Downgrade an OpenImmo document from version 1.2.4 to 1.2.3.
     *
     * @param doc OpenImmo document in version 1.2.4
     */
    @Override
    public void downgradeToPreviousVersion(OpenImmoDocument<?> doc) {
        doc.setDocumentVersion(OpenImmoVersion.V1_2_3);

        // downgrade a feedback document
        if (doc instanceof OpenImmoFeedbackDocument) {
            try {
                this.removeFeedbackVersionElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove unsupported <version> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.removeFeedbackInteressentChildElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove unsupported children of <interessent> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }
        }

        // downgrade a transfer document
        else if (doc instanceof OpenImmoTransferDocument) {
            try {
                this.removePreiseChildElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove unsupported children of <preise> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.removeWintergartenElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove unsupported <wintergarten> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeEnergietypElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <energietyp> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeBebaubarNachElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <bebaubar_nach> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeAnhangElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <anhang> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeWohnungElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <wohnung> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeGrundstueckElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <grundstueck> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeLandUndForstwirtschaftElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <land_und_forstwirtschaft> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeParkenElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <parken> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }
        }
    }

    /**
     * Upgrade an OpenImmo document from version 1.2.3 to 1.2.4.
     *
     * @param doc OpenImmo document in version 1.2.3
     */
    @Override
    public void upgradeFromPreviousVersion(OpenImmoDocument<?> doc) {
        doc.setDocumentVersion(OpenImmoVersion.V1_2_4);

        if (doc instanceof OpenImmoTransferDocument) {
            try {
                this.upgradeAnzahlBalkonTerrassenElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't upgrade <anzahl_balkon_terrassen> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.upgradeAnhangElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't upgrade <anhang> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.upgradeSonstigeElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't upgrade <sonstige> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }
        }
    }

    /**
     * Downgrade &lt;anhang&gt; elements to OpenImmo 1.2.3.
     * <p>
     * The options "QRCODE", "FILM", "FILMLINK" for the "gruppe" attribute of
     * &lt;anhang&gt; elements are not available in version 1.2.3.
     * <p>
     * The option "REMOTE" for the "location" attribute of
     * &lt;anhang&gt; elements is not available in version 1.2.3.
     * <p>
     * The child element &lt;check&gt; of &lt;anhang&gt; elements is not
     * available in version 1.2.3.
     *
     * @param doc OpenImmo document in version 1.2.4
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeAnhangElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:anhang | " +
                "/io:openimmo/io:anbieter/io:immobilie/io:anhaenge/io:anhang";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final String gruppe = StringUtils.trimToNull(element.getAttribute("gruppe"));
            final String location = StringUtils.trimToNull(element.getAttribute("location"));

            if ("QRCODE".equalsIgnoreCase(gruppe))
                element.removeAttribute("gruppe");
            else if ("FILM".equalsIgnoreCase(gruppe))
                element.removeAttribute("gruppe");
            else if ("FILMLINK".equalsIgnoreCase(gruppe))
                element.removeAttribute("gruppe");

            if ("REMOTE".equalsIgnoreCase(location))
                element.setAttribute("location", "EXTERN");

            XmlUtils.xPathElementsProcess(XmlUtils.xPath("io:check", doc, "io"), element,
                    element::removeChild);
        });
    }

    /**
     * Downgrade &lt;bebaubar_nach&gt; elements to OpenImmo 1.2.3.
     * <p>
     * The option "LAENDERSPEZIFISCH" for the "bebaubar_attr" attribute of
     * &lt;bebaubar_nach&gt; elements is not available in version 1.2.3.
     * <p>
     * Any occurences of these values are removed.
     *
     * @param doc OpenImmo document in version 1.2.4
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeBebaubarNachElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:bebaubar_nach[@bebaubar_attr]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final String value = StringUtils.trimToNull(element.getAttribute("bebaubar_attr"));

            if ("LAENDERSPEZIFISCH".equalsIgnoreCase(value))
                element.removeAttribute("bebaubar_attr");
        });
    }

    /**
     * Downgrade &lt;energietyp&gt; elements to OpenImmo 1.2.3.
     * <p>
     * The attributes "KFW55", "KFW70" of &lt;energietyp&gt; elements are not
     * available in OpenImmo 1.2.3.
     *
     * @param doc OpenImmo document in version 1.2.4
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeEnergietypElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:energietyp[@KFW55 or @KFW70]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            element.removeAttribute("KFW55");
            element.removeAttribute("KFW70");
        });
    }

    /**
     * Downgrade &lt;grundstueck&gt; elements to OpenImmo 1.2.3.
     * <p>
     * The option "SEELIEGENSCHAFT" for the "grundst_typ" attribute of
     * &lt;grundstueck&gt; elements is not available in version 1.2.3.
     * <p>
     * Any occurence of these values is removed.
     *
     * @param doc OpenImmo document in version 1.2.4
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeGrundstueckElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:grundstueck[@grundst_typ]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final String value = StringUtils.trimToNull(element.getAttribute("grundst_typ"));

            if ("SEELIEGENSCHAFT".equalsIgnoreCase(value))
                element.removeAttribute("grundst_typ");
        });
    }

    /**
     * Downgrade &lt;land_und_forstwirtschaft&gt; elements to OpenImmo 1.2.3.
     * <p>
     * The option "JAGDREVIER" for the "land_typ" attribute of
     * &lt;land_und_forstwirtschaft&gt; elements is not available in version
     * 1.2.3.
     * <p>
     * Any occurence of these values is replaced by the
     * "SONSTIGE_LANDWIRTSCHAFTSIMMOBILIEN" value.
     *
     * @param doc OpenImmo document in version 1.2.4
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeLandUndForstwirtschaftElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:land_und_forstwirtschaft[@land_typ]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final String value = StringUtils.trimToNull(element.getAttribute("land_typ"));

            if ("JAGDREVIER".equalsIgnoreCase(value))
                element.setAttribute("land_typ", "SONSTIGE_LANDWIRTSCHAFTSIMMOBILIEN");
        });
    }

    /**
     * Downgrade &lt;parken&gt; elements to OpenImmo 1.2.3.
     * <p>
     * The options "EINZELGARAGE", "PARKHAUS", "TIEFGARAGENSTELLPLATZ",
     * "PARKPLATZ_STROM" for the "parken_typ" attribute of
     * &lt;parken&gt; elements are not available in version 1.2.3.
     * <p>
     * Any occurence of these values is replaced by the "STELLPLATZ" value.
     *
     * @param doc OpenImmo document in version 1.2.4
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeParkenElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:parken[@parken_typ]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final String value = StringUtils.trimToNull(element.getAttribute("parken_typ"));

            if ("EINZELGARAGE".equalsIgnoreCase(value))
                element.setAttribute("parken_typ", "STELLPLATZ");
            else if ("PARKHAUS".equalsIgnoreCase(value))
                element.setAttribute("parken_typ", "STELLPLATZ");
            else if ("TIEFGARAGENSTELLPLATZ".equalsIgnoreCase(value))
                element.setAttribute("parken_typ", "STELLPLATZ");
            else if ("PARKPLATZ_STROM".equalsIgnoreCase(value))
                element.setAttribute("parken_typ", "STELLPLATZ");
        });
    }

    /**
     * Downgrade &lt;wohnung&gt; elements to OpenImmo 1.2.3.
     * <p>
     * The option "ROHDACHBODEN" for the "wohnungtyp" attribute of
     * &lt;wohnung&gt; elements is not available in version 1.2.3.
     * <p>
     * Any occurence of these values is replaced by the "KEINE_ANGABE" value.
     *
     * @param doc OpenImmo document in version 1.2.4
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeWohnungElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:wohnung[@wohnungtyp]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final String value = StringUtils.trimToNull(element.getAttribute("wohnungtyp"));

            if ("ROHDACHBODEN".equalsIgnoreCase(value))
                element.setAttribute("wohnungtyp", "KEINE_ANGABE");
        });
    }

    /**
     * Remove unsupported children from all &lt;interessent&gt; elements in
     * feedback XML.
     * <p>
     * OpenImmo 1.2.3 does not support more then one &lt;bevorzugt&gt;,
     * &lt;wunsch&gt; elements in feedback XML.
     *
     * @param doc OpenImmo document in version 1.2.4
     * @throws XPathExpressionException if xpath evaluation failed
     */
    @SuppressWarnings("Duplicates")
    protected void removeFeedbackInteressentChildElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo_feedback/io:objekt/io:interessent";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (parentElement) -> {
            final List<String> options = new ArrayList<>();

            XmlUtils.xPathElementsProcess(XmlUtils.xPath("io:bevorzugt", doc, "io"), parentElement, (childElement) -> {
                if (!options.contains("bevorzugtPassed"))
                    options.add("bevorzugtPassed");
                else
                    parentElement.removeChild(childElement);
            });

            XmlUtils.xPathElementsProcess(XmlUtils.xPath("io:wunsch", doc, "io"), parentElement, (childElement) -> {
                if (!options.contains("wunschPassed"))
                    options.add("wunschPassed");
                else
                    parentElement.removeChild(childElement);
            });
        });
    }

    /**
     * Remove &lt;version&gt; elements in feedback XML.
     * <p>
     * OpenImmo 1.2.3 does not support &lt;version&gt; elements in feedback XML.
     *
     * @param doc OpenImmo document in version 1.2.4
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void removeFeedbackVersionElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo_feedback/io:version";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc,
                (element) -> element.getParentNode().removeChild(element));
    }

    /**
     * Remove unsupported children from all &lt;preise&gt; elements.
     * <p>
     * OpenImmo 1.2.3 does not support the following children for
     * &lt;preise&gt; elements: &lt;provision_teilen&gt;, &lt;kaution_text&gt;,
     * &lt;richtpreis&gt;
     * <p>
     * These elements are removed by this function.
     *
     * @param doc OpenImmo document in version 1.2.4
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void removePreiseChildElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:provision_teilen | " +
                "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:kaution_text | " +
                "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:richtpreis";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc,
                (element) -> element.getParentNode().removeChild(element));
    }

    /**
     * Remove &lt;wintergarten&gt; elements.
     * <p>
     * OpenImmo 1.2.3 does not support &lt;wintergarten&gt; elements.
     *
     * @param doc OpenImmo document in version 1.2.4
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void removeWintergartenElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:wintergarten";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc,
                (element) -> element.getParentNode().removeChild(element));
    }

    /**
     * Upgrade &lt;anhang&gt; elements to OpenImmo 1.2.4.
     * <p>
     * The option "REMOTE" for the "location" attribute of &lt;anhang&gt; elements
     * is introduced with OpenImmo 1.2.4.
     * <p>
     * If the &lt;pfad&gt; element of an &lt;anhang&gt; element contains an URL
     * (beginning with "http://" / "https://" / "ftp://" / "ftps://"), the value
     * of the "location" attribute is changed to "REMOTE".
     *
     * @param doc OpenImmo document in version 1.2.3
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void upgradeAnhangElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:anhang/io:daten/io:pfad | " +
                "/io:openimmo/io:anbieter/io:immobilie/io:anhaenge/io:anhang/io:daten/io:pfad";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final Element parent = (Element) element.getParentNode().getParentNode();
            final String value = StringUtils.trimToEmpty(element.getTextContent()).toLowerCase();

            //noinspection HttpUrlsUsage
            if (value.startsWith("http://"))
                parent.setAttribute("location", "REMOTE");
            else if (value.startsWith("https://"))
                parent.setAttribute("location", "REMOTE");
            else if (value.startsWith("ftp://"))
                parent.setAttribute("location", "REMOTE");
            else if (value.startsWith("ftps://"))
                parent.setAttribute("location", "REMOTE");
        });
    }

    /**
     * Upgrade &lt;anzahl_balkon_terrassen&gt; elements to OpenImmo 1.2.4.
     * <p>
     * The &lt;anzahl_balkon_terrassen&gt; is not supported anymore in version
     * 1.2.4. The element is replaced by &lt;anzahl_balkone&gt; and
     * &lt;anzahl_terrassen&gt;.
     * <p>
     * Any &lt;anzahl_balkon_terrassen&gt; element is removed. Its content is
     * copied into &lt;anzahl_balkone&gt;, if this element is not already present.
     *
     * @param doc OpenImmo document in version 1.2.3
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void upgradeAnzahlBalkonTerrassenElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:flaechen/io:anzahl_balkon_terrassen";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final Element parent = (Element) element.getParentNode();
            final String value = StringUtils.trimToNull(element.getTextContent());

            if (value != null) {
                Element newElement = XmlUtils.xPathElement(
                        XmlUtils.xPath("io:anzahl_balkone", doc, "io"), parent);

                if (newElement == null) {
                    newElement = doc.createElementNS(StringUtils.EMPTY, "anzahl_balkone");
                    newElement.setTextContent(value);
                    parent.appendChild(newElement);
                } else if (StringUtils.isBlank(newElement.getTextContent())) {
                    newElement.setTextContent(value);
                }
            }

            parent.removeChild(element);
        });
    }

    /**
     * Upgrade &lt;sonstige&gt; elements to OpenImmo 1.2.4.
     * <p>
     * The options "GARAGEN", "PARKFLACHE" for the "sonstige_typ" attribute of
     * &lt;sonstige&gt; elements were removed with OpenImmo 1.2.4.
     * <p>
     * For any occurence of these values the corresponding &lt;sonstige&gt;
     * element is replaced with a &lt;parken&gt; element.
     *
     * @param doc OpenImmo document in version 1.2.3
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void upgradeSonstigeElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:sonstige[@sonstige_typ]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final Element parent = (Element) element.getParentNode();
            final String value = StringUtils.trimToNull(element.getAttribute("sonstige_typ"));

            if ("GARAGEN".equalsIgnoreCase(value) || "PARKFLACHE".equalsIgnoreCase(value)) {
                final Element newElement = doc.createElementNS(StringUtils.EMPTY, "parken");
                newElement.setAttribute("parken_typ", "STELLPLATZ");

                parent.removeChild(element);
                parent.appendChild(newElement);
            }
        });
    }
}