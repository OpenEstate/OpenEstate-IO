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
import org.openestate.io.openimmo.OpenImmoVersion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * Converter for version 1.2.3.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public class OpenImmo_1_2_3 extends XmlConverter<OpenImmoDocument, OpenImmoVersion> {
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
    public void downgradeToPreviousVersion(OpenImmoDocument doc) {
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
    public void upgradeFromPreviousVersion(OpenImmoDocument doc) {
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
     * @throws JaxenException
     */
    protected void downgradeAusrichtBalkonTerrasseElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:ausricht_balkon_terrasse[@NORDOST or @NORDWEST or @SUEDOST or @SUEDWEST]",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            if (node.hasAttribute("NORDOST")) {
                String value = StringUtils.trimToEmpty(node.getAttribute("NORDOST")).toLowerCase();
                if (value.equals("1") || value.equals("true")) {
                    node.setAttribute("NORD", "true");
                    node.setAttribute("OST", "true");
                }
                node.removeAttribute("NORDOST");
            }
            if (node.hasAttribute("NORDWEST")) {
                String value = StringUtils.trimToEmpty(node.getAttribute("NORDWEST")).toLowerCase();
                if (value.equals("1") || value.equals("true")) {
                    node.setAttribute("NORD", "true");
                    node.setAttribute("WEST", "true");
                }
                node.removeAttribute("NORDWEST");
            }
            if (node.hasAttribute("SUEDOST")) {
                String value = StringUtils.trimToEmpty(node.getAttribute("SUEDOST")).toLowerCase();
                if (value.equals("1") || value.equals("true")) {
                    node.setAttribute("SUED", "true");
                    node.setAttribute("OST", "true");
                }
                node.removeAttribute("SUEDOST");
            }
            if (node.hasAttribute("SUEDWEST")) {
                String value = StringUtils.trimToEmpty(node.getAttribute("SUEDWEST")).toLowerCase();
                if (value.equals("1") || value.equals("true")) {
                    node.setAttribute("SUED", "true");
                    node.setAttribute("WEST", "true");
                }
                node.removeAttribute("SUEDWEST");
            }
        }
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
     * @throws JaxenException
     */
    protected void downgradeBadElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:bad[@BIDET or @PISSOIR]",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            node.removeAttribute("BIDET");
            node.removeAttribute("PISSOIR");
        }
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
     * @throws JaxenException
     */
    protected void downgradeBefeuerungElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:befeuerung[@PELLET]",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            node.removeAttribute("PELLET");
        }
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
     * @throws JaxenException
     */
    protected void downgradeBodenElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:boden[@MARMOR or @TERRAKOTTA]",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            node.removeAttribute("MARMOR");
            node.removeAttribute("TERRAKOTTA");
        }
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
     * @throws JaxenException
     */
    protected void downgradeDachformElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:dachform[@FLACHDACH or @PYRAMIDENDACH]",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            node.removeAttribute("FLACHDACH");
            node.removeAttribute("PYRAMIDENDACH");
        }
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
     * @throws JaxenException
     */
    protected void downgradeFlaechenChildElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:flaechen",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element parentNode = (Element) item;
            boolean passedAnzahlBalkone = false;
            boolean passedAnzahlTerrassen = false;
            double sum = 0;

            List childNodes = XmlUtils.newXPath("io:anzahl_balkone", doc)
                    .selectNodes(parentNode);
            for (Object childItem : childNodes) {
                Node node = (Node) childItem;
                if (!passedAnzahlBalkone) {
                    passedAnzahlBalkone = true;
                    String value = StringUtils.trimToNull(node.getTextContent());
                    try {
                        sum += (value != null) ? Double.parseDouble(value) : 0;
                    } catch (NumberFormatException ex) {
                        LOGGER.warn("Can't parse <anzahl_balkone>" + value + "</anzahl_balkone> into a numeric value!");
                        LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
                    }
                }
                parentNode.removeChild(node);
            }

            childNodes = XmlUtils.newXPath("io:anzahl_terrassen", doc)
                    .selectNodes(parentNode);
            for (Object childItem : childNodes) {
                Node node = (Node) childItem;
                if (!passedAnzahlTerrassen) {
                    passedAnzahlTerrassen = true;
                    String value = StringUtils.trimToNull(node.getTextContent());
                    try {
                        sum += (value != null) ? Double.parseDouble(value) : 0;
                    } catch (NumberFormatException ex) {
                        LOGGER.warn("Can't parse <anzahl_terrassen>" + value + "</anzahl_terrassen> into a numeric value!");
                        LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
                    }
                }
                parentNode.removeChild(node);
            }

            if (sum > 0) {
                Element node = (Element) XmlUtils.newXPath("io:anzahl_balkon_terrassen", doc)
                        .selectSingleNode(parentNode);
                if (node == null) {
                    node = doc.createElementNS(StringUtils.EMPTY, "anzahl_balkon_terrassen");
                    node.setTextContent(String.valueOf(sum));
                    parentNode.appendChild(node);
                } else if (StringUtils.isBlank(node.getTextContent())) {
                    node.setTextContent(String.valueOf(sum));
                }
            }
        }
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
     * @throws JaxenException
     */
    protected void downgradeHausElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:haus[@haustyp]",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            String value = StringUtils.trimToNull(node.getAttribute("haustyp"));
            if ("APARTMENTHAUS".equalsIgnoreCase(value))
                node.setAttribute("haustyp", "KEINE_ANGABE");
            else if ("BURG".equalsIgnoreCase(value))
                node.setAttribute("haustyp", "KEINE_ANGABE");
            else if ("HERRENHAUS".equalsIgnoreCase(value))
                node.setAttribute("haustyp", "KEINE_ANGABE");
            else if ("FINCA".equalsIgnoreCase(value))
                node.setAttribute("haustyp", "KEINE_ANGABE");
            else if ("RUSTICO".equalsIgnoreCase(value))
                node.setAttribute("haustyp", "KEINE_ANGABE");
        }
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
     * @throws JaxenException
     */
    protected void downgradeKuecheElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:kueche[@PANTRY]",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            node.removeAttribute("PANTRY");
        }
    }

    /**
     * Replace &lt;parken&gt; elements with &lt;sonstige&gt; elements.
     * <p>
     * OpenImmo 1.2.2 does not support &lt;parken&gt; elements. Any occurence is
     * converted into &lt;sonstige&gt; elements.
     *
     * @param doc OpenImmo document in version 1.2.3
     * @throws JaxenException
     */
    protected void downgradeParkenElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:parken",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            Element parentNode = (Element) node.getParentNode();
            parentNode.removeChild(node);

            Element newNode = doc.createElementNS(StringUtils.EMPTY, "sonstige");
            newNode.setAttribute("sonstige_typ", "PARKFLACHE");
            parentNode.appendChild(newNode);
        }
    }

    /**
     * Downgrade &lt;sonstige&gt; elements to OpenImmo 1.2.2.
     * <p>
     * The option "KRANKENHAUS" for the "sonstige_typ"
     * attribute of &lt;sonstige&gt; elements is placed in the &lt;haus&gt;
     * element in version 1.2.2.
     *
     * @param doc OpenImmo document in version 1.2.3
     * @throws JaxenException
     */
    protected void downgradeSonstigeElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:sonstige[@sonstige_typ]",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            Element parent = (Element) node.getParentNode();
            String value = StringUtils.trimToNull(node.getAttribute("sonstige_typ"));
            if ("KRANKENHAUS".equalsIgnoreCase(value)) {
                parent.removeChild(node);
                Element newNode = doc.createElementNS(StringUtils.EMPTY, "haus");
                newNode.setAttribute("haustyp", "KRANKENHAUS");
                parent.appendChild(newNode);
            }
        }
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
     * @throws JaxenException
     */
    protected void downgradeWohnungElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:wohnung[@wohnungtyp]",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            String value = StringUtils.trimToNull(node.getAttribute("wohnungtyp"));
            if ("APARTMENT".equalsIgnoreCase(value))
                node.setAttribute("wohnungtyp", "KEINE_ANGABE");
            else if ("FERIENWOHNUNG".equalsIgnoreCase(value))
                node.setAttribute("wohnungtyp", "KEINE_ANGABE");
            else if ("GALERIE".equalsIgnoreCase(value))
                node.setAttribute("wohnungtyp", "KEINE_ANGABE");
        }
    }

    /**
     * Downgrade &lt;zinshaus_renditeobjekt&gt; elements to OpenImmo 1.2.2.
     * <p>
     * The options "PFLEGEHEIM", "SANATORIUM", "SENIORENHEIM", "BETREUTES-WOHNEN"
     * for the "zins_typ" attribute of &lt;zinshaus_renditeobjekt&gt; elements are
     * placed in the &lt;haus&gt; element in version 1.2.2.
     *
     * @param doc OpenImmo document in version 1.2.3
     * @throws JaxenException
     */
    protected void downgradeZinshausRenditeobjektElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:zinshaus_renditeobjekt[@zins_typ]",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            Element parent = (Element) node.getParentNode();
            String value = StringUtils.trimToNull(node.getAttribute("zins_typ"));
            if ("PFLEGEHEIM".equalsIgnoreCase(value)) {
                parent.removeChild(node);
                Element newNode = doc.createElementNS(StringUtils.EMPTY, "haus");
                newNode.setAttribute("haustyp", "PFLEGEHEIM");
                parent.appendChild(newNode);
            } else if ("SANATORIUM".equalsIgnoreCase(value)) {
                parent.removeChild(node);
                Element newNode = doc.createElementNS(StringUtils.EMPTY, "haus");
                newNode.setAttribute("haustyp", "SANATORIUM");
                parent.appendChild(newNode);
            } else if ("SENIORENHEIM".equalsIgnoreCase(value)) {
                parent.removeChild(node);
                Element newNode = doc.createElementNS(StringUtils.EMPTY, "haus");
                newNode.setAttribute("haustyp", "SENIORENHEIM");
                parent.appendChild(newNode);
            } else if ("BETREUTES-WOHNEN".equalsIgnoreCase(value)) {
                parent.removeChild(node);
                Element newNode = doc.createElementNS(StringUtils.EMPTY, "haus");
                newNode.setAttribute("haustyp", "BETREUTES-WOHNEN");
                parent.appendChild(newNode);
            }
        }
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
     * @throws JaxenException
     */
    protected void removeAusstattungChildElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:energietyp | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:bibliothek | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:dachboden | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:gaestewc | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:kabelkanaele | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:seniorengerecht",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            Element parentNode = (Element) node.getParentNode();
            parentNode.removeChild(node);
        }
    }

    /**
     * Remove &lt;email_feedback&gt; elements.
     * <p>
     * OpenImmo 1.2.2 does not support &lt;email_feedback&gt; elements.
     *
     * @param doc OpenImmo document in version 1.2.3
     * @throws JaxenException
     */
    protected void removeEmailFeedbackElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:kontaktperson/io:email_feedback",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            Element parentNode = (Element) node.getParentNode();
            parentNode.removeChild(node);
        }
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
     * @throws JaxenException
     */
    protected void removePreiseChildElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:courtage_hinweis | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:nettorendite_soll | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:nettorendite_ist",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            Element parentNode = (Element) node.getParentNode();
            parentNode.removeChild(node);
        }
    }

    /**
     * Remove &lt;user_defined_extend&gt; elements.
     * <p>
     * OpenImmo 1.2.2 does not support &lt;user_defined_extend&gt; elements in
     * &lt;freitexte&gt; and &lt;anhaenge&gt; elements.
     *
     * @param doc OpenImmo document in version 1.2.3
     * @throws JaxenException
     */
    protected void removeUserDefinedExtendElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:freitexte/io:user_defined_extend | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:anhaenge/io:user_defined_extend",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            Element parentNode = (Element) node.getParentNode();
            parentNode.removeChild(node);
        }
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
     * @throws JaxenException
     */
    protected void removeZustandAngabenChildElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:letztemodernisierung | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:verkaufstatus",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            Element parentNode = (Element) node.getParentNode();
            parentNode.removeChild(node);
        }
    }

    /**
     * Upgrade &lt;sonstige&gt; elements to OpenImmo 1.2.3.
     * <p>
     * The option "KRANKENHAUS" for the "haustyp" attribute of &lt;haus&gt;
     * elements is placed in the &lt;sonstige&gt; element in version 1.2.3.
     *
     * @param doc OpenImmo document in version 1.2.2
     * @throws JaxenException
     */
    protected void upgradeSonstigeElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:haus[@haustyp]",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            Element parent = (Element) node.getParentNode();
            String value = StringUtils.trimToNull(node.getAttribute("haustyp"));
            if ("KRANKENHAUS".equalsIgnoreCase(value)) {
                parent.removeChild(node);
                Element newNode = doc.createElementNS(StringUtils.EMPTY, "sonstige");
                newNode.setAttribute("sonstige_typ", "KRANKENHAUS");
                parent.appendChild(newNode);
            }
        }
    }

    /**
     * Upgrade &lt;zinshaus_renditeobjekt&gt; elements to OpenImmo 1.2.3.
     * <p>
     * The options "PFLEGEHEIM", "SANATORIUM", "SENIORENHEIM", "BETREUTES-WOHNEN"
     * for the "haustyp" attribute of &lt;haus&gt; elements are placed in the
     * &lt;zinshaus_renditeobjekt&gt; element in version 1.2.3.
     *
     * @param doc OpenImmo document in version 1.2.2
     * @throws JaxenException
     */
    protected void upgradeZinshausRenditeobjektElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:haus[@haustyp]",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            Element parent = (Element) node.getParentNode();
            String value = StringUtils.trimToNull(node.getAttribute("haustyp"));
            if ("PFLEGEHEIM".equalsIgnoreCase(value)) {
                parent.removeChild(node);
                Element newNode = doc.createElementNS(StringUtils.EMPTY, "zinshaus_renditeobjekt");
                newNode.setAttribute("zins_typ", "PFLEGEHEIM");
                parent.appendChild(newNode);
            } else if ("SANATORIUM".equalsIgnoreCase(value)) {
                parent.removeChild(node);
                Element newNode = doc.createElementNS(StringUtils.EMPTY, "zinshaus_renditeobjekt");
                newNode.setAttribute("zins_typ", "SANATORIUM");
                parent.appendChild(newNode);
            } else if ("SENIORENHEIM".equalsIgnoreCase(value)) {
                parent.removeChild(node);
                Element newNode = doc.createElementNS(StringUtils.EMPTY, "zinshaus_renditeobjekt");
                newNode.setAttribute("zins_typ", "SENIORENHEIM");
                parent.appendChild(newNode);
            } else if ("BETREUTES-WOHNEN".equalsIgnoreCase(value)) {
                parent.removeChild(node);
                Element newNode = doc.createElementNS(StringUtils.EMPTY, "zinshaus_renditeobjekt");
                newNode.setAttribute("zins_typ", "BETREUTES-WOHNEN");
                parent.appendChild(newNode);
            }
        }
    }
}