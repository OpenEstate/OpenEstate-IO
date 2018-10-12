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
package org.openestate.io.wis_it;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.wis_it.xml.ObjectType;
import org.openestate.io.wis_it.xml.WIS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

/**
 * @author Andreas Rudolph
 */
@RunWith(JUnit4.class)
public class WisItDocumentTest {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(WisItDocumentTest.class);

    private static Document buildExampleDocument() throws Exception {
        return XmlUtils.newDocument("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
                + "<WIS>\n"
                + "  <OBJEKTE>\n"
                + "    <ANZAHL>2</ANZAHL>\n"
                + "    <OBJEKT>\n"
                + "    </OBJEKT>\n"
                + "    <OBJEKT>\n"
                + "    </OBJEKT>\n"
                + "  </OBJEKTE>\n"
                + "</WIS>");
    }

    @Test
    public void testToObject() {
        try {
            WisItDocument doc = new WisItDocument(buildExampleDocument());

            WIS obj = doc.toObject();
            Assert.assertNotNull(
                    "Created object for transfer document.", obj);
        } catch (Exception ex) {
            LOGGER.error("Test of WisItDocument.toObject failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of WisItDocument.toObject failed!");
        }
    }

    @Test
    @Ignore
    public void testToXml() {
        ObjectType obj = WisItUtils.getFactory().createObjectType();
        obj.setINFODE("an example property");
        obj.setORT("Berlin");

        WIS wis = WisItUtils.getFactory().createWIS();
        wis.setBENUTZER(WisItUtils.getFactory().createWISBENUTZER());
        wis.getBENUTZER().setKDNR("123");
        wis.setOBJEKTE(WisItUtils.getFactory().createWISOBJEKTE());
        wis.getOBJEKTE().getOBJEKT().add(obj);

        try {
            WisItDocument doc = WisItDocument.newDocument(wis);

            String xml = doc.toXmlString(true);
            LOGGER.info("XML: " + xml);
        } catch (Exception ex) {
            LOGGER.error("Test of WisItDocument.toXml failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of WisItDocument.toXml failed!");
        }
    }
}