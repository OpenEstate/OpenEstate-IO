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
package org.openestate.io.immobiliare_it;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.immobiliare_it.xml.Feed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

/**
 * @author Andreas Rudolph
 */
@RunWith(JUnit4.class)
public class ImmobiliareItDocumentTest {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(ImmobiliareItDocumentTest.class);

    private static Document buildExampleDocument(String version) throws Exception {
        return XmlUtils.newDocument("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
                + "<feed xmlns=\"" + ImmobiliareItUtils.NAMESPACE + "\">\n"
                + "  <version>" + version + "</version>\n"
                + "</feed>");
    }

    @Test
    @SuppressWarnings("Duplicates")
    public void testGetDocumentVersion() {
        ImmobiliareItDocument doc;
        try {
            doc = new ImmobiliareItDocument(buildExampleDocument("2.8"));
            Assert.assertEquals("2.8", ImmobiliareItVersion.V2_8, doc.getDocumentVersion());
        } catch (Exception ex) {
            LOGGER.error("Test of ImmobiliareItDocument.getDocumentVersion failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of ImmobiliareItDocument.getDocumentVersion failed!");
        }
    }

    @Test
    @SuppressWarnings("Duplicates")
    public void testSetDocumentVersion() {
        try {
            ImmobiliareItDocument doc = new ImmobiliareItDocument(buildExampleDocument(""));

            doc.setDocumentVersion(ImmobiliareItVersion.V2_8);
            Assert.assertEquals("2.8", ImmobiliareItVersion.V2_8, doc.getDocumentVersion());
        } catch (Exception ex) {
            LOGGER.error("Test of ImmobiliareItDocument.setDocumentVersion failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of ImmobiliareItDocument.setDocumentVersion failed!");
        }
    }

    @Test
    @SuppressWarnings("Duplicates")
    public void testToObject() {
        try {
            ImmobiliareItDocument doc = new ImmobiliareItDocument(buildExampleDocument(ImmobiliareItUtils.VERSION.toReadableVersion()));
            Feed obj = doc.toObject();
            Assert.assertNotNull(
                    "Created object for transfer document.", obj);
        } catch (Exception ex) {
            LOGGER.error("Test of ImmobiliareItDocument.toObject failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of ImmobiliareItDocument.toObject failed!");
        }
    }

    @Test
    @Ignore
    @SuppressWarnings("Duplicates")
    public void testToXml() {
        Feed feed = ImmobiliareItUtils.getFactory().createFeed();
        //feed.setVersion( DaftIEUtils.VERSION.getReadableVersion() );
        //feed.setOverseasRental( DaftIEUtils.getFactory().createDaftOverseasRental() );
        //feed.setOverseasSales( DaftIEUtils.getFactory().createDaftOverseasSales() );
        try {
            ImmobiliareItDocument doc = ImmobiliareItDocument.newDocument(feed);
            String xml = doc.toXmlString(true);
            LOGGER.info("XML: " + xml);
        } catch (Exception ex) {
            LOGGER.error("Test of ImmobiliareItDocument.toXml failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of ImmobiliareItDocument.toXml failed!");
        }
    }
}