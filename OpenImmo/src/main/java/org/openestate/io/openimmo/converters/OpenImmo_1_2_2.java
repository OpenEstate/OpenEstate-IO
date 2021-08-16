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
import java.util.Map;
import javax.xml.xpath.XPathExpressionException;
import org.apache.commons.lang3.StringUtils;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.openimmo.OpenImmoDocument;
import org.openestate.io.openimmo.OpenImmoTransferDocument;
import org.openestate.io.openimmo.OpenImmoVersion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * Converter for version 1.2.2.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
@SuppressWarnings("SpellCheckingInspection")
public class OpenImmo_1_2_2 extends AbstractConverter {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(OpenImmo_1_2_2.class);

    @Override
    public OpenImmoVersion getVersion() {
        return OpenImmoVersion.V1_2_2;
    }

    /**
     * Downgrade an {@link OpenImmoDocument} from version 1.2.2 to 1.2.1.
     *
     * @param doc document in version 1.2.2
     */
    @Override
    public void downgradeToPreviousVersion(OpenImmoDocument<?> doc) {
        doc.setDocumentVersion(OpenImmoVersion.V1_2_1);

        if (doc instanceof OpenImmoTransferDocument) {
            try {
                this.downgradeUebertragungElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <uebertragung> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.removeVersteigerungElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove <versteigerung> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.removeProvisionspflichtigElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove <provisionspflichtig> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.removeAusstattungChildElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove unsupported children of <ausstattung> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeObjektartElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <objektart> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeEnergiepassElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <energiepass> elements!");
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
                this.downgradeGrundstueckElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <grundstueck> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeBueroPraxenElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <buero_praxen> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeEinzelhandelElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <einzelhandel> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeGastgewerbeElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <gastgewerbe> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeHallenLagerProdElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <hallen_lager_prod> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeLandUndForstwirtschaftElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <land_und_forstwirtschaft> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeFreizeitimmobilieGewerblichElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <freizeitimmobilie_gewerblich> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }
        }
    }

    /**
     * Upgrade an {@link OpenImmoDocument} from version 1.2.1 to 1.2.2.
     *
     * @param doc document in version 1.2.1
     */
    @Override
    @SuppressWarnings("Duplicates")
    public void upgradeFromPreviousVersion(OpenImmoDocument<?> doc) {
        doc.setDocumentVersion(OpenImmoVersion.V1_2_2);

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
     * Downgrade &lt;befeuerung&gt; elements to OpenImmo 1.2.1.
     * <p>
     * The attribute "LUFTWP" for &lt;befeuerung&gt; elements is not available in
     * version 1.2.1.
     * <p>
     * Any occurences of these values are removed.
     *
     * @param doc OpenImmo document in version 1.2.2
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeBefeuerungElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:befeuerung[@LUFTWP]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc,
                (element) -> element.removeAttribute("LUFTWP"));
    }

    /**
     * Downgrade &lt;boden&gt; elements to OpenImmo 1.2.1.
     * <p>
     * The attributes "FERTIGPARKETT", "LAMINAT", "LINOLEUM" for &lt;boden&gt;
     * elements are not available in version 1.2.1.
     * <p>
     * Any occurences of these values are removed.
     *
     * @param doc OpenImmo document in version 1.2.2
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeBodenElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:boden[@FERTIGPARKETT or @LAMINAT or @LINOLEUM]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            element.removeAttribute("FERTIGPARKETT");
            element.removeAttribute("LAMINAT");
            element.removeAttribute("LINOLEUM");
        });
    }

    /**
     * Downgrade &lt;buero_praxen&gt; elements to OpenImmo 1.2.1.
     * <p>
     * The options "BUEROZENTRUM", "LOFT_ATELIER", "PRAXISFLAECHE", "PRAXISHAUS"
     * for the "buero_typ" attribute of &lt;buero_praxen&gt; elements are not
     * available in version 1.2.1.
     * <p>
     * Any occurence of these values is replaced by the general "BUEROFLAECHE"
     * value.
     *
     * @param doc OpenImmo document in version 1.2.2
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeBueroPraxenElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:buero_praxen[@buero_typ]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final String value = StringUtils.trimToNull(element.getAttribute("buero_typ"));

            if ("BUEROZENTRUM".equalsIgnoreCase(value))
                element.setAttribute("buero_typ", "BUEROFLAECHE");
            else if ("LOFT_ATELIER".equalsIgnoreCase(value))
                element.setAttribute("buero_typ", "BUEROFLAECHE");
            else if ("PRAXISFLAECHE".equalsIgnoreCase(value))
                element.setAttribute("buero_typ", "BUEROFLAECHE");
            else if ("PRAXISHAUS".equalsIgnoreCase(value))
                element.setAttribute("buero_typ", "BUEROFLAECHE");
        });
    }

    /**
     * Downgrade &lt;einzelhandel&gt; elements to OpenImmo 1.2.1.
     * <p>
     * The options "KAUFHAUS", "FACTORY_OUTLET", "KIOSK", "VERKAUFSFLAECHE",
     * "AUSSTELLUNGSFLAECHE" for the "handel_typ" attribute of
     * &lt;einzelhandel&gt; elements are not available in version 1.2.1.
     * <p>
     * Any occurence of these values is removed.
     *
     * @param doc OpenImmo document in version 1.2.2
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeEinzelhandelElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:einzelhandel[@handel_typ]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final String value = StringUtils.trimToNull(element.getAttribute("handel_typ"));

            if ("KAUFHAUS".equalsIgnoreCase(value))
                element.removeAttribute("handel_typ");
            else if ("FACTORY_OUTLET".equalsIgnoreCase(value))
                element.removeAttribute("handel_typ");
            else if ("KIOSK".equalsIgnoreCase(value))
                element.removeAttribute("handel_typ");
            else if ("VERKAUFSFLAECHE".equalsIgnoreCase(value))
                element.removeAttribute("handel_typ");
            else if ("AUSSTELLUNGSFLAECHE".equalsIgnoreCase(value))
                element.removeAttribute("handel_typ");
        });
    }

    /**
     * Downgrade &lt;energiepass&gt; elements to OpenImmo 1.2.1.
     * <p>
     * The &lt;epart&gt; child element of the &lt;energiepass&gt; element is
     * renamed to &lt;art&gt; in version 1.2.1.
     *
     * @param doc OpenImmo document in version 1.2.2
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeEnergiepassElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:epart";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final Element parent = (Element) element.getParentNode();
            final Element newElement = doc.createElementNS(StringUtils.EMPTY, "art");

            newElement.setTextContent(element.getTextContent());
            parent.replaceChild(newElement, element);
        });
    }

    /**
     * Downgrade &lt;freizeitimmobilie_gewerblich&gt; elements to OpenImmo 1.2.1.
     * <p>
     * The option "FREIZEITANLAGE" for the "freizeit_typ" attribute of
     * &lt;freizeitimmobilie_gewerblich&gt; elements is not available in version
     * 1.2.1.
     * <p>
     * Any occurence of these values is removed.
     *
     * @param doc OpenImmo document in version 1.2.2
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeFreizeitimmobilieGewerblichElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:freizeitimmobilie_gewerblich[@freizeit_typ]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final String value = StringUtils.trimToNull(element.getAttribute("freizeit_typ"));

            if ("FREIZEITANLAGE".equalsIgnoreCase(value))
                element.removeAttribute("freizeit_typ");
        });
    }

    /**
     * Downgrade &lt;einzelhandel&gt; elements to OpenImmo 1.2.1.
     * <p>
     * The options "BAR", "CAFE", "DISCOTHEK", "RESTAURANT", "RAUCHERLOKAL",
     * "EINRAUMLOKAL" for the "gastgew_typ" attribute of
     * &lt;gastgewerbe&gt; elements are not available in version 1.2.1.
     * <p>
     * Any occurence of these values is removed.
     *
     * @param doc OpenImmo document in version 1.2.2
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeGastgewerbeElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:gastgewerbe[@gastgew_typ]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final String value = StringUtils.trimToNull(element.getAttribute("gastgew_typ"));

            if ("BAR".equalsIgnoreCase(value))
                element.removeAttribute("gastgew_typ");
            else if ("CAFE".equalsIgnoreCase(value))
                element.removeAttribute("gastgew_typ");
            else if ("DISCOTHEK".equalsIgnoreCase(value))
                element.removeAttribute("gastgew_typ");
            else if ("RESTAURANT".equalsIgnoreCase(value))
                element.removeAttribute("gastgew_typ");
            else if ("RAUCHERLOKAL".equalsIgnoreCase(value))
                element.removeAttribute("gastgew_typ");
            else if ("EINRAUMLOKAL".equalsIgnoreCase(value))
                element.removeAttribute("gastgew_typ");
        });
    }

    /**
     * Downgrade &lt;grundstueck&gt; elements to OpenImmo 1.2.1.
     * <p>
     * The option "GEWERBEPARK" for the "grundst_typ" attribute of
     * &lt;grundstueck&gt; elements is not available in version 1.2.1.
     * <p>
     * Any occurence of these values is removed.
     *
     * @param doc OpenImmo document in version 1.2.2
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeGrundstueckElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:grundstueck[@grundst_typ]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final String value = StringUtils.trimToNull(element.getAttribute("grundst_typ"));

            if ("GEWERBEPARK".equalsIgnoreCase(value))
                element.removeAttribute("grundst_typ");
        });
    }

    /**
     * Downgrade &lt;hallen_lager_prod&gt; elements to OpenImmo 1.2.1.
     * <p>
     * The options "INDUSTRIEHALLE", "LAGERFLAECHEN", "LAGER_MIT_FREIFLAECHE",
     * "SPEDITIONSLAGER", "KUEHLHAUS" for the "hallen_typ" attribute of
     * &lt;hallen_lager_prod&gt; elements are not available in version 1.2.1.
     * <p>
     * Any occurence of "KUEHLHAUS" is removed. Other unsupported options are
     * replaced by "HALLE" or "LAGER".
     *
     * @param doc OpenImmo document in version 1.2.2
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeHallenLagerProdElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:hallen_lager_prod[@hallen_typ]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final String value = StringUtils.trimToNull(element.getAttribute("hallen_typ"));

            if ("INDUSTRIEHALLE".equalsIgnoreCase(value))
                element.setAttribute("hallen_typ", "HALLE");
            else if ("LAGERFLAECHEN".equalsIgnoreCase(value))
                element.setAttribute("hallen_typ", "LAGER");
            else if ("LAGER_MIT_FREIFLAECHE".equalsIgnoreCase(value))
                element.setAttribute("hallen_typ", "LAGER");
            else if ("SPEDITIONSLAGER".equalsIgnoreCase(value))
                element.setAttribute("hallen_typ", "LAGER");
            else if ("KUEHLHAUS".equalsIgnoreCase(value))
                element.removeAttribute("hallen_typ");
        });
    }

    /**
     * Downgrade &lt;haus&gt; elements to OpenImmo 1.2.1.
     * <p>
     * The option "KEINE_ANGABE" for the "haustyp" attribute of &lt;haus&gt;
     * elements are not available in version 1.2.1.
     * <p>
     * Any occurence of these values is removed.
     *
     * @param doc OpenImmo document in version 1.2.2
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeHausElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:haus[@haustyp]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final String value = StringUtils.trimToNull(element.getAttribute("haustyp"));

            if ("KEINE_ANGABE".equalsIgnoreCase(value))
                element.removeAttribute("haustyp");
        });
    }

    /**
     * Downgrade &lt;land_und_forstwirtschaft&gt; elements to OpenImmo 1.2.1.
     * <p>
     * The option "ANWESEN" for the "land_typ" attribute of
     * &lt;land_und_forstwirtschaft&gt; elements is not available in version
     * 1.2.1.
     * <p>
     * Any occurence of these values is replaced by the
     * "SONSTIGE_LANDWIRTSCHAFTSIMMOBILIEN" value.
     *
     * @param doc OpenImmo document in version 1.2.2
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeLandUndForstwirtschaftElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:land_und_forstwirtschaft[@land_typ]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final String value = StringUtils.trimToNull(element.getAttribute("land_typ"));

            if ("ANWESEN".equalsIgnoreCase(value))
                element.setAttribute("land_typ", "SONSTIGE_LANDWIRTSCHAFTSIMMOBILIEN");
        });
    }

    /**
     * Downgrade &lt;objektart&gt; elements to OpenImmo 1.2.1.
     * <p>
     * The &lt;objektart&gt; element does only allow the same type of child
     * element in version 1.2.1.
     * <p>
     * Any child type, that differs from the first child type, is removed.
     *
     * @param doc OpenImmo document in version 1.2.2
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeObjektartElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final Map<String, String> options = new HashMap<>();
            options.put("type", null);

            XmlUtils.xPathElementsProcess(XmlUtils.xPath("*", doc), element, (childElement) -> {
                if (options.get("type") == null) {
                    //LOGGER.debug( "PRIMARY TYPE: " + childElement.getLocalName() );
                    options.put("type", childElement.getLocalName());
                } else if (!options.get("type").equalsIgnoreCase(childElement.getLocalName())) {
                    //LOGGER.debug( "REMOVE SECONDARY TYPE: " + childElement.getLocalName() );
                    element.removeChild(childElement);
                }
            });
        });
    }

    /**
     * Downgrade &lt;uebertragung&gt; elements to OpenImmo 1.2.1.
     * <p>
     * The attribute "timestamp" for &lt;uebertragung&gt; elements is not
     * available in version 1.2.1.
     * <p>
     * Any occurences of these values are removed.
     *
     * @param doc OpenImmo document in version 1.2.2
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeUebertragungElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:uebertragung[@timestamp]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc,
                (element) -> element.removeAttribute("timestamp"));
    }

    /**
     * Downgrade &lt;wohnung&gt; elements to OpenImmo 1.2.1.
     * <p>
     * The option "KEINE_ANGABE" for the "wohnungtyp" attribute of &lt;wohnung&gt;
     * elements is not available in version 1.2.1.
     * <p>
     * Any occurence of these values is removed.
     *
     * @param doc OpenImmo document in version 1.2.2
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeWohnungElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:wohnung[@wohnungtyp]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final String value = StringUtils.trimToNull(element.getAttribute("wohnungtyp"));

            if ("KEINE_ANGABE".equalsIgnoreCase(value))
                element.removeAttribute("wohnungtyp");
        });
    }

    /**
     * Remove unsupported children from all &lt;ausstattung&gt; elements.
     * <p>
     * OpenImmo 1.2.1 does not support the following children for
     * &lt;ausstattung&gt; elements: &lt;ausstatt_kategorie&gt;, &lt;dachform&gt;,
     * &lt;bauweise&gt;, &lt;ausbaustufe&gt;
     * <p>
     * These elements are removed by this function.
     *
     * @param doc OpenImmo document in version 1.2.2
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void removeAusstattungChildElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:ausstatt_kategorie | " +
                "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:dachform | " +
                "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:bauweise | " +
                "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:ausbaustufe";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc,
                (element) -> element.getParentNode().removeChild(element));
    }

    /**
     * Remove &lt;provisionspflichtig&gt; elements.
     * <p>
     * OpenImmo 1.2.1 does not support &lt;provisionspflichtig&gt; elements.
     *
     * @param doc OpenImmo document in version 1.2.2
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void removeProvisionspflichtigElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:provisionspflichtig";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc,
                (element) -> element.getParentNode().removeChild(element));
    }

    /**
     * Remove &lt;versteigerung&gt; elements.
     * <p>
     * OpenImmo 1.2.1 does not support &lt;versteigerung&gt; elements.
     *
     * @param doc OpenImmo document in version 1.2.2
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void removeVersteigerungElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:versteigerung";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc,
                (element) -> element.getParentNode().removeChild(element));
    }

    /**
     * Upgrade &lt;energiepass&gt; elements to OpenImmo 1.2.2.
     * <p>
     * The &lt;art&gt; child element of the &lt;energiepass&gt; element is
     * renamed to &lt;epart&gt; in version 1.2.2.
     *
     * @param doc OpenImmo document in version 1.2.1
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void upgradeEnergiepassElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:art";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final Element parent = (Element) element.getParentNode();
            final Element newElement = doc.createElementNS(StringUtils.EMPTY, "epart");

            newElement.setTextContent(element.getTextContent());
            parent.replaceChild(newElement, element);
        });
    }
}