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

/**
 * Converter for version 1.2.6.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
@SuppressWarnings({"SpellCheckingInspection", "WeakerAccess"})
public class OpenImmo_1_2_6 extends XmlConverter<OpenImmoDocument, OpenImmoVersion> {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(OpenImmo_1_2_6.class);

    @Override
    public OpenImmoVersion getVersion() {
        return OpenImmoVersion.V1_2_6;
    }

    /**
     * Downgrade an OpenImmo document from version 1.2.6 to 1.2.5.
     *
     * @param doc OpenImmo document in version 1.2.6
     */
    @Override
    public void downgradeToPreviousVersion(OpenImmoDocument doc) {
        doc.setDocumentVersion(OpenImmoVersion.V1_2_5);

        if (doc instanceof OpenImmoTransferDocument) {
            try {
                this.removePreiseChildElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove unsupported children of <preise> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeKaufpreisElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <kaufpreis> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.removeZwangsversteigerungElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove unsupported <zwangsversteigerung> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.removeFlaechenChildElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove unsupported children of <flaechen> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.removeBauzoneElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove unsupported <bauzone> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeBodenElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <boden> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeEnergietypElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <energietyp> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeAusblickElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <ausblick> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeBueroPraxenElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <buero_praxen> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }
        }
    }

    /**
     * Upgrade an OpenImmo document from version 1.2.5 to 1.2.6.
     *
     * @param doc OpenImmo document in version 1.2.5
     */
    @Override
    public void upgradeFromPreviousVersion(OpenImmoDocument doc) {
        doc.setDocumentVersion(OpenImmoVersion.V1_2_6);
    }

    /**
     * Downgrade &lt;ausblick&gt; elements to OpenImmo 1.2.5.
     * <p>
     * The option "MEER" for the "blick" attribute of
     * &lt;ausblick&gt; elements is not available in version 1.2.5.
     * <p>
     * Any occurence of the "MEER" value is replaced by the "SEE" value.
     *
     * @param doc OpenImmo document in version 1.2.6
     * @throws JaxenException if xpath evaluation failed
     */
    protected void downgradeAusblickElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:infrastruktur/io:ausblick[@blick]",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            String value = StringUtils.trimToNull(node.getAttribute("blick"));
            if ("MEER".equalsIgnoreCase(value))
                node.setAttribute("blick", "SEE");
        }
    }

    /**
     * Downgrade &lt;boden&gt; elements to OpenImmo 1.2.5.
     * <p>
     * The attribute "GRANIT" of &lt;boden&gt; elements are not available in
     * OpenImmo 1.2.5.
     *
     * @param doc OpenImmo document in version 1.2.6
     * @throws JaxenException if xpath evaluation failed
     */
    protected void downgradeBodenElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:boden[@GRANIT]",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            node.removeAttribute("GRANIT");
        }
    }

    /**
     * Downgrade &lt;buero_praxen&gt; elements to OpenImmo 1.2.5.
     * <p>
     * The options "COWORKING", "SHARED_OFFICE" for the "buero_typ" attribute of
     * &lt;buero_praxen&gt; elements are not available in version 1.2.5.
     * <p>
     * Any occurence of these values is replaced by the general "BUEROFLAECHE"
     * value.
     *
     * @param doc OpenImmo document in version 1.2.6
     * @throws JaxenException if xpath evaluation failed
     */
    protected void downgradeBueroPraxenElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:buero_praxen[@buero_typ]",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            String value = StringUtils.trimToNull(node.getAttribute("buero_typ"));
            if ("COWORKING".equalsIgnoreCase(value))
                node.setAttribute("buero_typ", "BUEROFLAECHE");
            else if ("SHARED_OFFICE".equalsIgnoreCase(value))
                node.setAttribute("buero_typ", "BUEROFLAECHE");
        }
    }

    /**
     * Downgrade &lt;kaufpreis&gt; elements to OpenImmo 1.2.5.
     * <p>
     * The attribute "auf_anfrage" of &lt;kaufpreis&gt; elements are not available
     * in OpenImmo 1.2.5.
     *
     * @param doc OpenImmo document in version 1.2.6
     * @throws JaxenException if xpath evaluation failed
     */
    protected void downgradeKaufpreisElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:kaufpreis[@auf_anfrage]",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            node.removeAttribute("auf_anfrage");
        }
    }

    /**
     * Remove &lt;bauzone&gt; elements.
     * <p>
     * OpenImmo 1.2.5 does not support &lt;bauzone&gt; elements.
     *
     * @param doc OpenImmo document in version 1.2.6
     * @throws JaxenException if xpath evaluation failed
     */
    protected void removeBauzoneElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:bauzone",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            Element parentNode = (Element) node.getParentNode();
            parentNode.removeChild(node);
        }
    }

    /**
     * Downgrade &lt;energietyp&gt; elements to OpenImmo 1.2.5.
     * <p>
     * The attributes "MINERGIEBAUWEISE", "MINERGIE_ZERTIFIZIERT" of
     * &lt;energietyp&gt; elements are not available in OpenImmo 1.2.5.
     *
     * @param doc OpenImmo document in version 1.2.6
     * @throws JaxenException if xpath evaluation failed
     */
    protected void downgradeEnergietypElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:energietyp[@MINERGIEBAUWEISE or @MINERGIE_ZERTIFIZIERT]",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            node.removeAttribute("MINERGIEBAUWEISE");
            node.removeAttribute("MINERGIE_ZERTIFIZIERT");
        }
    }

    /**
     * Remove unsupported children from all &lt;flaechen&gt; elements.
     * <p>
     * OpenImmo 1.2.5 does not support the following children for
     * &lt;flaechen&gt; elements: &lt;kubatur&gt;, &lt;ausnuetzungsziffer&gt;,
     * &lt;flaechevon&gt;, &lt;flaechebis&gt;
     * <p>
     * These elements are removed by this function.
     *
     * @param doc OpenImmo document in version 1.2.6
     * @throws JaxenException if xpath evaluation failed
     */
    protected void removeFlaechenChildElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:flaechen/io:kubatur | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:flaechen/io:ausnuetzungsziffer | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:flaechen/io:flaechevon | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:flaechen/io:flaechebis",
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
     * OpenImmo 1.2.5 does not support the following children for
     * &lt;preise&gt; elements: &lt;kaufpreisnetto&gt;, &lt;kaufpreisbrutto&gt;,
     * &lt;hauptmietzinsnetto&gt;, &lt;pauschalmiete&gt;,
     * &lt;betriebskostennetto&gt;, &lt;evbnetto&gt;, &lt;gesamtmietenetto&gt;,
     * &lt;gesamtmietebrutto&gt;, &lt;gesamtbelastungnetto&gt;,
     * &lt;gesamtbelastungbrutto&gt;, &lt;gesamtkostenprom2von&gt;,
     * &lt;heizkostennetto&gt;, &lt;monatlichekostennetto&gt;,
     * &lt;monatlichekostenbrutto&gt;, &lt;nebenkostenprom2von&gt;,
     * &lt;ruecklagenetto&gt;, &lt;sonstigekostennetto&gt;,
     * &lt;sonstigemietenetto&gt;, &lt;summemietenetto&gt;,
     * &lt;nettomieteprom2von&gt;, &lt;provisionnetto&gt;,
     * &lt;provisionbrutto&gt;, &lt;richtpreisprom2&gt;
     * <p>
     * These elements are removed by this function.
     *
     * @param doc OpenImmo document in version 1.2.6
     * @throws JaxenException if xpath evaluation failed
     */
    protected void removePreiseChildElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:kaufpreisnetto | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:kaufpreisbrutto | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:hauptmietzinsnetto | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:pauschalmiete | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:betriebskostennetto | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:evbnetto | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:gesamtmietenetto | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:gesamtmietebrutto | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:gesamtbelastungnetto | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:gesamtbelastungbrutto | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:gesamtkostenprom2von | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:heizkostennetto | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:monatlichekostennetto | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:monatlichekostenbrutto | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:nebenkostenprom2von | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:ruecklagenetto | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:sonstigekostennetto | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:sonstigemietenetto | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:summemietenetto | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:nettomieteprom2von | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:provisionnetto | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:provisionbrutto | " +
                        "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:richtpreisprom2",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            Element parentNode = (Element) node.getParentNode();
            parentNode.removeChild(node);
        }
    }

    /**
     * Remove &lt;zwangsversteigerung&gt; elements.
     * <p>
     * OpenImmo 1.2.5 does not support &lt;zwangsversteigerung&gt; elements.
     *
     * @param doc OpenImmo document in version 1.2.6
     * @throws JaxenException if xpath evaluation failed
     */
    protected void removeZwangsversteigerungElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:versteigerung/io:zwangsversteigerung",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            Element parentNode = (Element) node.getParentNode();
            parentNode.removeChild(node);
        }
    }
}