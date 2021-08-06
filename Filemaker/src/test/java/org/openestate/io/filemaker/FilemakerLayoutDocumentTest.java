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
package org.openestate.io.filemaker;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.filemaker.xml.layout.FMPXMLLAYOUT;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

/**
 * @author Andreas Rudolph
 */
@RunWith(JUnit4.class)
public class FilemakerLayoutDocumentTest {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(FilemakerLayoutDocumentTest.class);

    private static Document buildExampleDocument() throws Exception {
        return XmlUtils.newDocument("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                + "<FMPXMLLAYOUT xmlns=\"http://www.filemaker.com/fmpxmllayout\">\n"
                + "  <ERRORCODE>0</ERRORCODE>\n"
                + "  <PRODUCT BUILD=\"03-20-2006\" NAME=\"FileMaker Pro\" VERSION=\"8.0v3\"/>\n"
                + "</FMPXMLLAYOUT>");
    }

    @Test
    public void testToObject() {
        try {
            FilemakerLayoutDocument doc = new FilemakerLayoutDocument(buildExampleDocument());

            FMPXMLLAYOUT obj = doc.toObject();
            Assert.assertNotNull(
                    "Created object for transfer document.", obj);
        } catch (Exception ex) {
            LOGGER.error("Test of FilemakerLayoutDocument.toObject failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of FilemakerLayoutDocument.toObject failed!");
        }
    }

    @Test
    @Ignore
    public void testToXml() {
        FMPXMLLAYOUT layout = FilemakerUtils.getFactoryForLayout().createFMPXMLLAYOUT();
        layout.setERRORCODE("0");
        layout.setPRODUCT(FilemakerUtils.getFactoryForLayout().createProductType());
        layout.getPRODUCT().setNAME("OpenEstate-IO");
        layout.getPRODUCT().setVERSION("1.0");
        layout.getPRODUCT().setBUILD("123");
        try {
            FilemakerLayoutDocument doc = FilemakerLayoutDocument.newDocument(layout);

            String xml = doc.toXmlString(true);
            LOGGER.info("XML: " + xml);
        } catch (Exception ex) {
            LOGGER.error("Test of FilemakerLayoutDocument.toXml failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of FilemakerLayoutDocument.toXml failed!");
        }
    }
}