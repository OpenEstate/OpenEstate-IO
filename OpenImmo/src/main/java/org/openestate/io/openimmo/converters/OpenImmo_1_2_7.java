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
 * Converter for version 1.2.7.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
@SuppressWarnings("SpellCheckingInspection")
public class OpenImmo_1_2_7 extends AbstractConverter {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(OpenImmo_1_2_7.class);

    @Override
    public OpenImmoVersion getVersion() {
        return OpenImmoVersion.V1_2_7;
    }

    /**
     * Downgrade an {@link OpenImmoDocument} from version 1.2.7 to 1.2.6.
     *
     * @param doc document in version 1.2.7
     */
    @Override
    public void downgradeToPreviousVersion(OpenImmoDocument<?> doc) {
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
     * Upgrade an {@link OpenImmoDocument} from version 1.2.6 to 1.2.7.
     *
     * @param doc document in version 1.2.6
     */
    @Override
    public void upgradeFromPreviousVersion(OpenImmoDocument<?> doc) {
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
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeAktionElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:verwaltung_techn/io:aktion[@aktionart]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final String value = StringUtils.trimToNull(element.getAttribute("aktionart"));

            if ("REFERENZ".equalsIgnoreCase(value))
                element.setAttribute("aktionart", "CHANGE");
        });
    }

    /**
     * Downgrade &lt;anhang&gt; elements to OpenImmo 1.2.6.
     * <p>
     * The options "EPASS-SKALA", "ANBOBJURL" for the "gruppe" attribute of
     * &lt;anhang&gt; elements are not available in version 1.2.6
     *
     * @param doc OpenImmo document in version 1.2.7
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeAnhangElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:anhang[@gruppe] | " +
                "/io:openimmo/io:anbieter/io:immobilie/io:anhaenge/io:anhang[@gruppe]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final String value = StringUtils.trimToNull(element.getAttribute("gruppe"));

            if ("EPASS-SKALA".equalsIgnoreCase(value))
                element.removeAttribute("gruppe");
            else if ("ANBOBJURL".equalsIgnoreCase(value))
                element.removeAttribute("gruppe");
        });
    }

    /**
     * Downgrade &lt;befeuerung&gt; elements to OpenImmo 1.2.6.
     * <p>
     * The attributes "KOHLE", "HOLZ", "FLUESSIGGAS" of &lt;befeuerung&gt;
     * elements are not available in OpenImmo 1.2.6.
     *
     * @param doc OpenImmo document in version 1.2.7
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeBefeuerungElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:befeuerung[@KOHLE or @HOLZ or @FLUESSIGGAS]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            element.removeAttribute("KOHLE");
            element.removeAttribute("HOLZ");
            element.removeAttribute("FLUESSIGGAS");
        });
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
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeEnergiepassElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final Element parent = (Element) element.getParentNode();
            final List<String> options = new ArrayList<>();

            // <primaerenergietraeger> elements are not supported in version 1.2.6
            XmlUtils.xPathElementsProcess(XmlUtils.xPath("io:primaerenergietraeger", doc, "io"), element,
                    element::removeChild);

            // <epasstext> elements are not supported in version 1.2.6
            XmlUtils.xPathElementsProcess(XmlUtils.xPath("io:epasstext", doc, "io"), element,
                    element::removeChild);

            // create a <user_defined_simplefield> for <stromwert> elements
            XmlUtils.xPathElementsProcess(XmlUtils.xPath("io:stromwert", doc, "io"), element, (childElement) -> {
                if (!options.contains("stromwertPassed")) {
                    String value = StringUtils.trimToNull(childElement.getTextContent());
                    if (value != null) {
                        parent.appendChild(OpenImmoUtils.createUserDefinedSimplefield(doc, "epass_stromwert", value));
                        options.add("stromwertPassed");
                    }
                }
                element.removeChild(childElement);
            });

            // create a <user_defined_simplefield> for <waermewert> elements
            XmlUtils.xPathElementsProcess(XmlUtils.xPath("io:waermewert", doc, "io"), element, (childElement) -> {
                if (!options.contains("waermewertPassed")) {
                    String value = StringUtils.trimToNull(childElement.getTextContent());
                    if (value != null) {
                        parent.appendChild(OpenImmoUtils.createUserDefinedSimplefield(doc, "epass_waermewert", value));
                        options.add("waermewertPassed");
                    }
                }
                element.removeChild(childElement);
            });

            // create a <user_defined_simplefield> for <wertklasse> elements
            XmlUtils.xPathElementsProcess(XmlUtils.xPath("io:wertklasse", doc, "io"), element, (childElement) -> {
                if (!options.contains("wertklassePassed")) {
                    String value = StringUtils.trimToNull(childElement.getTextContent());
                    if (value != null) {
                        parent.appendChild(OpenImmoUtils.createUserDefinedSimplefield(doc, "epass_wertklasse", value));
                        options.add("wertklassePassed");
                    }
                }
                element.removeChild(childElement);
            });

            // create a <user_defined_simplefield> for <baujahr> elements
            XmlUtils.xPathElementsProcess(XmlUtils.xPath("io:baujahr", doc, "io"), element, (childElement) -> {
                if (!options.contains("baujahrPassed")) {
                    String value = StringUtils.trimToNull(childElement.getTextContent());
                    if (value != null) {
                        parent.appendChild(OpenImmoUtils.createUserDefinedSimplefield(doc, "epass_baujahr", value));
                        options.add("baujahrPassed");
                    }
                }
                element.removeChild(childElement);
            });

            // create a <user_defined_simplefield> for <ausstelldatum> elements
            XmlUtils.xPathElementsProcess(XmlUtils.xPath("io:ausstelldatum", doc, "io"), element, (childElement) -> {
                if (!options.contains("ausstelldatumPassed")) {
                    String value = StringUtils.trimToNull(childElement.getTextContent());
                    if (value != null) {
                        parent.appendChild(OpenImmoUtils.createUserDefinedSimplefield(doc, "epass_ausstelldatum", value));
                        options.add("ausstelldatumPassed");
                    }
                }
                element.removeChild(childElement);
            });

            // create a <user_defined_simplefield> for <jahrgang> elements
            XmlUtils.xPathElementsProcess(XmlUtils.xPath("io:jahrgang", doc, "io"), element, (childElement) -> {
                if (!options.contains("jahrgangPassed")) {
                    String value = StringUtils.trimToNull(childElement.getTextContent());
                    if ("2008".equalsIgnoreCase(value) || "2014".equalsIgnoreCase(value) || "ohne".equalsIgnoreCase(value)) {
                        parent.appendChild(OpenImmoUtils.createUserDefinedSimplefield(doc, "epass_jahrgang", value));
                        options.add("jahrgangPassed");
                    }
                }
                element.removeChild(childElement);
            });

            // create a <user_defined_simplefield> for <gebaeudeart> elements
            XmlUtils.xPathElementsProcess(XmlUtils.xPath("io:gebaeudeart", doc, "io"), element, (childElement) -> {
                if (!options.contains("gebaeudeartPassed")) {
                    String value = StringUtils.trimToNull(childElement.getTextContent());
                    if ("wohn".equalsIgnoreCase(value) || "nichtwohn".equalsIgnoreCase(value) || "ohne".equalsIgnoreCase(value)) {
                        parent.appendChild(OpenImmoUtils.createUserDefinedSimplefield(doc, "epass_gebaeudeart", value));
                        options.add("gebaeudeartPassed");
                    }
                }
                element.removeChild(childElement);
            });
        });
    }

    /**
     * Downgrade &lt;summemietenetto&gt; elements to OpenImmo 1.2.6.
     * <p>
     * The attribute "summemieteust" of &lt;summemietenetto&gt; elements are
     * renamed to "sonstigemieteust" in OpenImmo 1.2.6.
     *
     * @param doc OpenImmo document in version 1.2.7
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void downgradeSummemietenettoElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:summemietenetto[@summemieteust]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final String value = StringUtils.trimToNull(element.getAttribute("summemieteust"));

            if (value != null)
                element.setAttribute("sonstigemieteust", value);
            element.removeAttribute("summemieteust");
        });
    }

    /**
     * Only use one &lt;energiepass&gt; element for each &lt;immobilie&gt;.
     * <p>
     * OpenImmo 1.2.6 does not allow more than one &lt;energiepass&gt; element
     * for each &lt;immobilie&gt; (maxOccurs=1). Other &lt;energiepass&gt; elements
     * are removed by this function.
     *
     * @param doc OpenImmo document in version 1.2.7
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void removeMultipleEnergiepassElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (parentElement) -> {
            final List<String> options = new ArrayList<>();

            XmlUtils.xPathElementsProcess(XmlUtils.xPath("io:energiepass", doc, "io"), parentElement, (element) -> {
                if (!options.contains("passedFirst")) {
                    options.add("passedFirst");
                    return;
                }
                parentElement.removeChild(element);
            });
        });
    }

    /**
     * Remove &lt;objekt_text&gt; elements.
     * <p>
     * OpenImmo 1.2.6 does not support &lt;objekt_text&gt; elements.
     *
     * @param doc OpenImmo document in version 1.2.7
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void removeObjektTextElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:freitexte/io:objekt_text";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc,
                (element) -> element.getParentNode().removeChild(element));
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
     * @throws XPathExpressionException if xpath evaluation failed
     */
    @SuppressWarnings("Duplicates")
    protected void upgradeEnergiepassElements(Document doc) throws XPathExpressionException {
        final Map<String, String> fields = new HashMap<>();
        fields.put("stromwert", "user_defined_simplefield[@feldname='epass_stromwert']");
        fields.put("waermewert", "user_defined_simplefield[@feldname='epass_waermewert']");
        fields.put("wertklasse", "user_defined_simplefield[@feldname='epass_wertklasse']");
        fields.put("baujahr", "user_defined_simplefield[@feldname='epass_baujahr']");
        fields.put("ausstelldatum", "user_defined_simplefield[@feldname='epass_ausstelldatum']");
        fields.put("jahrgang", "user_defined_simplefield[@feldname='epass_jahrgang']");
        fields.put("gebaeudeart", "user_defined_simplefield[@feldname='epass_gebaeudeart']");

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

    /**
     * Upgrade &lt;summemietenetto&gt; elements to OpenImmo 1.2.7.
     * <p>
     * The attribute "sonstigemieteust" of &lt;summemietenetto&gt; elements is
     * renamed to "summemieteust" in OpenImmo 1.2.7.
     *
     * @param doc OpenImmo document in version 1.2.6
     * @throws XPathExpressionException if xpath evaluation failed
     */
    protected void upgradeSummemietenettoElements(Document doc) throws XPathExpressionException {
        final String xpath = "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:summemietenetto[@sonstigemieteust]";

        XmlUtils.xPathElementsProcess(XmlUtils.xPath(xpath, doc, "io"), doc, (element) -> {
            final String value = StringUtils.trimToNull(element.getAttribute("sonstigemieteust"));

            if (value != null)
                element.setAttribute("summemieteust", value);

            element.removeAttribute("sonstigemieteust");
        });
    }
}