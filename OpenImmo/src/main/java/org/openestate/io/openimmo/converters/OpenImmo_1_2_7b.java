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
 * Converter for version 1.2.7b.
 *
 * @author Andreas Rudolph
 * @since 1.3
 */
@SuppressWarnings({"SpellCheckingInspection", "WeakerAccess"})
public class OpenImmo_1_2_7b extends XmlConverter<OpenImmoDocument, OpenImmoVersion> {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(OpenImmo_1_2_7b.class);

    @Override
    public OpenImmoVersion getVersion() {
        return OpenImmoVersion.V1_2_7B;
    }

    @Override
    public void downgradeToPreviousVersion(OpenImmoDocument doc) {
        doc.setDocumentVersion(OpenImmoVersion.V1_2_7);

        if (doc instanceof OpenImmoTransferDocument) {
            try {
                this.removeReferenzIdElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove unsupported <referenz_id> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.removeGeg2018Elements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't remove unsupported <geg2018> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }

            try {
                this.downgradeEnergiepassJahrgangElements(doc.getDocument());
            } catch (Exception ex) {
                LOGGER.error("Can't downgrade <jahrgang> in <energiepass> elements!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            }
        }
    }

    @Override
    public void upgradeFromPreviousVersion(OpenImmoDocument doc) {
        doc.setDocumentVersion(OpenImmoVersion.V1_2_7B);
    }

    /**
     * Remove &lt;referenz_id&gt; elements.
     * <p>
     * OpenImmo 1.2.7 does not support &lt;referenz_id&gt; elements.
     *
     * @param doc OpenImmo document in version 1.2.7b
     * @throws JaxenException if xpath evaluation failed
     */
    protected void removeReferenzIdElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:kontaktperson/io:referenz_id",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            Element parentNode = (Element) node.getParentNode();
            parentNode.removeChild(node);
        }
    }

    /**
     * Remove &lt;geg2018&gt; elements.
     * <p>
     * OpenImmo 1.2.7 does not support &lt;geg2018&gt; elements.
     *
     * @param doc OpenImmo document in version 1.2.7b
     * @throws JaxenException if xpath evaluation failed
     */
    protected void removeGeg2018Elements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:geg2018",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            Element parentNode = (Element) node.getParentNode();
            parentNode.removeChild(node);
        }
    }

    /**
     * Downgrade &lt;jahrgang&gt; elements in &lt;energiepass&gt;
     * to OpenImmo 1.2.7.
     * <p>
     * The value "bei_besichtigung" of &lt;jahrgang&gt; elements in
     * &lt;energiepass&gt; is not available in OpenImmo 1.2.7.
     *
     * @param doc OpenImmo document in version 1.2.7b
     * @throws JaxenException if xpath evaluation failed
     */
    protected void downgradeEnergiepassJahrgangElements(Document doc) throws JaxenException {
        List nodes = XmlUtils.newXPath(
                "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:jahrgang",
                doc).selectNodes(doc);
        for (Object item : nodes) {
            Element node = (Element) item;
            String value = StringUtils.trimToNull(node.getTextContent());
            if (value == null || value.equalsIgnoreCase("bei_besichtigung")) {
                Element parentNode = (Element) node.getParentNode();
                parentNode.removeChild(node);
            }
        }
    }
}