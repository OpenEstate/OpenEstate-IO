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
package org.openestate.io.openimmo;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringEscapeUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.openimmo.xml.Openimmo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

/**
 * @author Andreas Rudolph
 */
@RunWith(JUnit4.class)
public class OpenImmoTransferDocumentNamespaceTest {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(OpenImmoTransferDocumentNamespaceTest.class);

    private static Document buildExampleDocument(String version) throws Exception {
        String xmlns = ("1.2".equals(version) || "1.2.0".equals(version) || "1.1".equals(version)) ?
                " xmlns:imo=\"" + OpenImmoUtils.OLD_NAMESPACE + "\"" : StringUtils.EMPTY;
        return XmlUtils.newDocument(
                "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
                        + "<imo:openimmo" + xmlns + " xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.openimmo.de openimmo.xsd\">\n"
                        + "  <imo:uebertragung version=\"" + StringEscapeUtils.escapeXml10(version) + "\" "
                        + "                    sendersoftware=\"OpenEstate.org\" "
                        + "                    senderversion=\"1.0\" "
                        + "                    techn_email=\"test@openestate.org\" "
                        + "                    modus=\"NEW\" umfang=\"VOLL\" art=\"OFFLINE\"/>\n"
                        + "  <imo:anbieter>\n"
                        + "  </imo:anbieter>\n"
                        + "</imo:openimmo>");
    }

    @Test
    public void testDowngrade() {
        try {
            String version = OpenImmoVersion.V1_2_0.toReadableVersion();
            OpenImmoTransferDocument doc = new OpenImmoTransferDocument(buildExampleDocument(version));

            doc.downgrade(OpenImmoVersion.V1_1);
            Assert.assertEquals(
                    "downgrade from " + version + " to 1.1", OpenImmoVersion.V1_1, doc.getDocumentVersion());
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmoTransferDocument.downgrade failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmoTransferDocument.downgrade failed!");
        }
    }

    @Test
    public void testGetDocumentVersion() {
        OpenImmoTransferDocument doc;
        try {
            doc = new OpenImmoTransferDocument(buildExampleDocument("1.2.0"));
            Assert.assertEquals(
                    "1.2.0", OpenImmoVersion.V1_2_0, doc.getDocumentVersion());

            doc = new OpenImmoTransferDocument(buildExampleDocument("1.1"));
            Assert.assertEquals(
                    "1.1", OpenImmoVersion.V1_1, doc.getDocumentVersion());
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmoTransferDocument.getDocumentVersion failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmoTransferDocument.getDocumentVersion failed!");
        }
    }

    @Test
    public void testSetDocumentVersion() {
        try {
            OpenImmoTransferDocument doc = new OpenImmoTransferDocument(buildExampleDocument("1.2.0"));
            Assert.assertEquals(
                    "1.2.0", OpenImmoVersion.V1_2_0, doc.getDocumentVersion());

            doc.setDocumentVersion(OpenImmoVersion.V1_1);
            Assert.assertEquals(
                    "1.1", OpenImmoVersion.V1_1, doc.getDocumentVersion());

            doc.setDocumentVersion(OpenImmoVersion.V1_2_0);
            Assert.assertEquals(
                    "1.2.0", OpenImmoVersion.V1_2_0, doc.getDocumentVersion());
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmoTransferDocument.setDocumentVersion failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmoTransferDocument.setDocumentVersion failed!");
        }
    }

    @Test
    public void testToObject() {
        try {
            String version = OpenImmoVersion.V1_2_0.toReadableVersion();

            OpenImmoTransferDocument doc = new OpenImmoTransferDocument(buildExampleDocument(version));
            Assert.assertEquals(
                    version, OpenImmoVersion.V1_2_0, doc.getDocumentVersion());

            Openimmo obj = doc.toObject();
            Assert.assertNotNull(
                    "Created object for transfer document.", obj);
            Assert.assertEquals(
                    "Matching version between document and object.", doc.getDocumentVersion().toReadableVersion(), obj.getUebertragung().getVersion());
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmoTransferDocument.toObject failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmoTransferDocument.toObject failed!");
        }
    }

    @Test
    public void testUpgrade() {
        try {
            String version = OpenImmoVersion.V1_2_0.toReadableVersion();
            OpenImmoTransferDocument doc = new OpenImmoTransferDocument(buildExampleDocument("1.1"));

            doc.upgrade(OpenImmoVersion.V1_2_0);
            Assert.assertEquals(
                    "upgrade from 1.1 to " + version, OpenImmoVersion.V1_2_0, doc.getDocumentVersion());
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmoTransferDocument.upgrade failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmoTransferDocument.upgrade failed!");
        }
    }
}