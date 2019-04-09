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
package org.openestate.io.openimmo;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringEscapeUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.openimmo.xml.OpenimmoFeedback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

/**
 * @author Andreas Rudolph
 */
@RunWith(JUnit4.class)
public class OpenImmoFeedbackDocumentTest {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(OpenImmoFeedbackDocumentTest.class);

    private static Document buildExampleDocument(String version) throws Exception {
        String xmlns = ("1.2.0".equals(version) || "1.1".equals(version)) ?
                " xmlns=\"" + OpenImmoUtils.OLD_NAMESPACE + "\"" : StringUtils.EMPTY;

        OpenImmoVersion v = OpenImmoVersion.detectFromString(version);
        if (OpenImmoVersion.V1_2_4.isNewerThen(v)) {
            return XmlUtils.newDocument(
                    "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
                            + "<openimmo_feedback" + xmlns + ">\n"
                            + "</openimmo_feedback>");
        } else {
            return XmlUtils.newDocument(
                    "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
                            + "<openimmo_feedback" + xmlns + ">\n"
                            + "  <version>" + StringEscapeUtils.escapeXml10(version) + "</version>\n"
                            + "</openimmo_feedback>");
        }
    }

    @Test
    public void testDowngrade() {
        try {
            String version = OpenImmoUtils.VERSION.toReadableVersion();
            OpenImmoFeedbackDocument doc = new OpenImmoFeedbackDocument(buildExampleDocument(version));

            doc.downgrade(OpenImmoVersion.V1_1);

            // versions older then 1.2.4 do not support the <version> element
            // - version 1.2.3 is assumed, when no <version> element is present and
            //   an empty namespace is used
            // - version 1.2.0 is assumed, when no <version> element is present and
            //   the old namespace is used

            Assert.assertEquals(
                    "downgrade from " + version + " to 1.1", OpenImmoVersion.V1_2_0, doc.getDocumentVersion());
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmoFeedbackDocument.downgrade failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmoFeedbackDocument.downgrade failed!");
        }
    }

    @Test
    public void testGetDocumentVersion() {
        OpenImmoFeedbackDocument doc;
        try {
            doc = new OpenImmoFeedbackDocument(buildExampleDocument("1.2.7"));
            Assert.assertEquals(
                    "1.2.7", OpenImmoVersion.V1_2_7, doc.getDocumentVersion());

            doc = new OpenImmoFeedbackDocument(buildExampleDocument("1.2.6/AT1.0"));
            Assert.assertEquals(
                    "1.2.6/AT1.0", OpenImmoVersion.V1_2_6, doc.getDocumentVersion());

            // versions older then 1.2.4 do not support the <version> element
            // - version 1.2.3 is assumed, when no <version> element is present and
            //   an empty namespace is used
            // - version 1.2.0 is assumed, when no <version> element is present and
            //   the old namespace is used

            doc = new OpenImmoFeedbackDocument(buildExampleDocument("1.2.1"));
            Assert.assertEquals(
                    "1.2.1", OpenImmoVersion.V1_2_3, doc.getDocumentVersion());

            doc = new OpenImmoFeedbackDocument(buildExampleDocument("1.2.0"));
            Assert.assertEquals(
                    "1.2.0", OpenImmoVersion.V1_2_0, doc.getDocumentVersion());
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmoFeedbackDocument.getDocumentVersion failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmoFeedbackDocument.getDocumentVersion failed!");
        }
    }

    @Test
    public void testSetDocumentVersion() {
        try {
            OpenImmoFeedbackDocument doc = new OpenImmoFeedbackDocument(buildExampleDocument("1.2.7"));
            Assert.assertEquals(
                    "1.2.7", OpenImmoVersion.V1_2_7, doc.getDocumentVersion());

            doc.setDocumentVersion(OpenImmoVersion.V1_2_3);
            Assert.assertEquals(
                    "1.2.3", OpenImmoVersion.V1_2_3, doc.getDocumentVersion());

            doc.setDocumentVersion(OpenImmoVersion.V1_2_6);
            Assert.assertEquals(
                    "1.2.6", OpenImmoVersion.V1_2_6, doc.getDocumentVersion());
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmoFeedbackDocument.setDocumentVersion failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmoFeedbackDocument.setDocumentVersion failed!");
        }
    }

    @Test
    public void testToObject() {
        try {
            String version = OpenImmoUtils.VERSION.toReadableVersion();

            OpenImmoFeedbackDocument doc = new OpenImmoFeedbackDocument(buildExampleDocument(version));
            Assert.assertEquals(
                    version, OpenImmoUtils.VERSION, doc.getDocumentVersion());

            OpenimmoFeedback obj = doc.toObject();
            Assert.assertNotNull(
                    "Created object for feedback document.", obj);
            Assert.assertEquals(
                    "Matching version between document and object.", doc.getDocumentVersion().toReadableVersion(), obj.getVersion());
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmoFeedbackDocument.toObject failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmoFeedbackDocument.toObject failed!");
        }
    }

    @Test
    public void testUpgrade() {
        try {
            String version = OpenImmoUtils.VERSION.toReadableVersion();
            OpenImmoFeedbackDocument doc = new OpenImmoFeedbackDocument(buildExampleDocument("1.1"));

            doc.upgrade(OpenImmoUtils.VERSION);
            Assert.assertEquals(
                    "upgrade from 1.1 to " + version, OpenImmoUtils.VERSION, doc.getDocumentVersion());
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmoFeedbackDocument.upgrade failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmoFeedbackDocument.upgrade failed!");
        }
    }
}