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

import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.Calendar;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * OpenImmoUtilsTest.
 *
 * @author Andreas Rudolph
 */
@RunWith(JUnit4.class)
public class OpenImmoUtilsTest {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(OpenImmoUtilsTest.class);

    @Test
    public void testCreateDocument() {
        @SuppressWarnings("SpellCheckingInspection")
        String transferXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
                + "<openimmo>\n"
                + "  <uebertragung version=\"" + OpenImmoUtils.VERSION.toReadableVersion() + "\" "
                + "                sendersoftware=\"OpenEstate.org\" "
                + "                senderversion=\"1.0\" "
                + "                techn_email=\"test@openestate.org\" "
                + "                modus=\"NEW\" umfang=\"VOLL\" art=\"OFFLINE\"/>\n"
                + "  <anbieter>\n"
                + "  </anbieter>\n"
                + "</openimmo>";

        String feedbackXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
                + "<openimmo_feedback>\n"
                + "  <version>" + OpenImmoUtils.VERSION.toReadableVersion() + "</version>\n"
                + "</openimmo_feedback>";

        OpenImmoDocument<?> doc;
        try {
            doc = OpenImmoUtils.createDocument(transferXml);
            Assert.assertNotNull(
                    "Transfer was processed.", doc);
            Assert.assertTrue("Transfer was processed as TransferDocument.", doc instanceof OpenImmoTransferDocument);

            doc = OpenImmoUtils.createDocument(feedbackXml);
            Assert.assertNotNull(
                    "Feedback was processed.", doc);
            Assert.assertTrue("Feedback was processed as FeedbackDocument.", doc instanceof OpenImmoFeedbackDocument);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmoUtils.createDocument failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmoUtils.createDocument failed!");
        }
    }

    @Test
    public void testGetContext() {
        try {
            Assert.assertNotNull(
                    "JAXB context must be creatable.", OpenImmoUtils.getContext());
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmoUtils.getContext failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmoUtils.getContext failed!");
        }
    }

    @Test
    public void testParseDate() {
        DateFormat formatter = DateFormat.getDateInstance(DateFormat.MEDIUM);
        Calendar target = Calendar.getInstance();
        target.set(2015, Calendar.JANUARY, 30, 0, 0, 0);

        Assert.assertEquals(
                formatter.format(target.getTime()),
                formatter.format(OpenImmoUtils.parseDate("30.01.2015").getTime()));

        Assert.assertEquals(
                formatter.format(target.getTime()),
                formatter.format(OpenImmoUtils.parseDate("30-01-2015").getTime()));

        Assert.assertEquals(
                formatter.format(target.getTime()),
                formatter.format(OpenImmoUtils.parseDate("2015-01-30").getTime()));

        Assert.assertEquals(
                formatter.format(target.getTime()),
                formatter.format(OpenImmoUtils.parseDate("2015-01-30T05:06:07").getTime()));

        Assert.assertEquals(
                formatter.format(target.getTime()),
                formatter.format(OpenImmoUtils.parseDate("2015-01-30 05:06:07").getTime()));

        Assert.assertNotNull(
                OpenImmoUtils.parseDate("2015-03-17 19:05:00"));
    }

    @Test
    @SuppressWarnings("CatchMayIgnoreException")
    public void testParseDecimal() {
        Assert.assertEquals(
                new BigDecimal("2"), OpenImmoUtils.parseDecimal("2"));
        Assert.assertEquals(
                new BigDecimal("2.5"), OpenImmoUtils.parseDecimal("2.5"));
        Assert.assertEquals(
                new BigDecimal("2.5"), OpenImmoUtils.parseDecimal("2,5"));
        Assert.assertNull(OpenImmoUtils.parseDecimal(""));

        try {
            Assert.assertNull(OpenImmoUtils.parseDecimal(","));
            Assert.fail("An exception should have been thrown.");
        } catch (IllegalArgumentException ex) {
        }

        try {
            Assert.assertNull(OpenImmoUtils.parseDecimal("."));
            Assert.fail("An exception should have been thrown.");
        } catch (IllegalArgumentException ex) {
        }

        try {
            OpenImmoUtils.parseDecimal("2 MM");
            Assert.fail("An exception should have been thrown.");
        } catch (IllegalArgumentException ex) {
        }
    }
}