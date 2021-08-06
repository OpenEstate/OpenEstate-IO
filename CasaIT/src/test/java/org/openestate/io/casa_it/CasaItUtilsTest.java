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
package org.openestate.io.casa_it;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Andreas Rudolph
 */
@RunWith(JUnit4.class)
public class CasaItUtilsTest {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(CasaItUtilsTest.class);

    @Test
    public void testCreateDocument() {
        String transferXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
                + "<container>\n"
                + "  <realestateitems>\n"
                + "    <realestate>\n"
                + "    </realestate>\n"
                + "  </realestateitems>\n"
                + "</container>";

        CasaItDocument doc;
        try {
            doc = CasaItUtils.createDocument(transferXml);
            Assert.assertNotNull(
                    "Transfer was processed.", doc);
            Assert.assertTrue(
                    "Transfer was processed as CasaITDocument.", doc instanceof CasaItDocument);
        } catch (Exception ex) {
            LOGGER.error("Test of CasaITUtils.createDocument failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of CasaITUtils.createDocument failed!");
        }
    }

    @Test
    public void testGetContext() {
        try {
            Assert.assertNotNull(
                    "JAXB context must be creatable.", CasaItUtils.getContext());
        } catch (Exception ex) {
            LOGGER.error("Test of CasaITUtils.getContext failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of CasaITUtils.getContext failed!");
        }
    }
}