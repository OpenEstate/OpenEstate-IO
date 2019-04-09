/*
 * Copyright 2015-2019 OpenEstate.org.
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
package org.openestate.io.immobar_it;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.immobar_it.xml.CompanyType;
import org.openestate.io.immobar_it.xml.PropertyType;
import org.openestate.io.immobar_it.xml.Realestate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

/**
 * ImmobarItDocumentTest.
 *
 * @author Andreas Rudolph
 */
@RunWith(JUnit4.class)
public class ImmobarItDocumentTest {
    private final static Logger LOGGER = LoggerFactory.getLogger(ImmobarItDocumentTest.class);

    private static Document buildExampleDocument() throws Exception {
        //noinspection SpellCheckingInspection
        return XmlUtils.newDocument("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
                + "<realestate>\n"
                + "  <company_name_de>test</company_name_de>\n"
                + "  <property>\n"
                + "  </property>\n"
                + "</realestate>");
    }

    @Test
    public void testToObject() {
        try {
            ImmobarItDocument doc = new ImmobarItDocument(buildExampleDocument());

            Realestate obj = doc.toObject();
            Assert.assertNotNull(
                    "Created object for transfer document.", obj);
        } catch (Exception ex) {
            LOGGER.error("Test of CasaITDocument.toObject failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of CasaITDocument.toObject failed!");
        }
    }

    @Test
    public void testToXml() {
        PropertyType obj = ImmobarItUtils.getFactory().createPropertyType();
        obj.setDescriptionDe("an example property");

        CompanyType company = ImmobarItUtils.getFactory().createCompanyType();
        company.setCompanyNameDe("an example company");
        company.getProperty().add(obj);

        Realestate realestate = ImmobarItUtils.getFactory().createRealestate();
        realestate.getCompany().add(company);

        try {
            ImmobarItDocument doc = ImmobarItDocument.newDocument(realestate);

            String xml = doc.toXmlString(true);
            LOGGER.info("XML: " + xml);
        } catch (Exception ex) {
            LOGGER.error("Test of ImmobarITDocument.toXml failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of ImmobarITDocument.toXml failed!");
        }
    }
}