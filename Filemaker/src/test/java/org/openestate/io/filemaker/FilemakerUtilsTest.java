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
package org.openestate.io.filemaker;

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
public class FilemakerUtilsTest {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(FilemakerUtilsTest.class);

    @Test
    public void testCreateDocument() {
        String transferXml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                + "<FMPXMLRESULT xmlns=\"http://www.filemaker.com/fmpxmlresult\">\n"
                + "  <ERRORCODE>0</ERRORCODE>\n"
                + "  <PRODUCT BUILD=\"03-20-2006\" NAME=\"FileMaker Pro\" VERSION=\"8.0v3\"/>\n"
                + "  <DATABASE DATEFORMAT=\"D.m.yyyy\" LAYOUT=\"fmmedia2universal\" NAME=\"AngGes\" RECORDS=\"13723\" TIMEFORMAT=\"k:mm:ss \"/>\n"
                + "  <METADATA>\n"
                + "    <FIELD EMPTYOK=\"YES\" MAXREPEAT=\"1\" NAME=\"aNumericField\" TYPE=\"NUMBER\"/>\n"
                + "    <FIELD EMPTYOK=\"YES\" MAXREPEAT=\"1\" NAME=\"aTextField\" TYPE=\"TEXT\"/>\n"
                + "  </METADATA>\n"
                + "  <RESULTSET FOUND=\"2\">\n"
                + "    <ROW MODID=\"1\" RECORDID=\"1\">\n"
                + "      <COL>\n"
                + "        <DATA>123</DATA>\n"
                + "      </COL>\n"
                + "      <COL>\n"
                + "        <DATA>this is a text</DATA>\n"
                + "      </COL>\n"
                + "    </ROW>\n"
                + "    <ROW MODID=\"2\" RECORDID=\"2\">\n"
                + "      <COL>\n"
                + "        <DATA>456</DATA>\n"
                + "      </COL>\n"
                + "      <COL>\n"
                + "        <DATA>this is another text</DATA>\n"
                + "      </COL>\n"
                + "    </ROW>\n"
                + "  </RESULTSET>\n"
                + "</FMPXMLRESULT>";

        FilemakerDocument doc;
        try {
            doc = FilemakerUtils.createDocument(transferXml);
            Assert.assertNotNull(
                    "Transfer was processed.", doc);
            Assert.assertTrue(
                    "Transfer was processed as FilemakerDocument.", doc instanceof FilemakerResultDocument);
        } catch (Exception ex) {
            LOGGER.error("Test of FilemakerUtils.createDocument failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of FilemakerUtils.createDocument failed!");
        }
    }

    @Test
    public void testGetContext() {
        try {
            Assert.assertNotNull(
                    "JAXB context must be creatable.", FilemakerUtils.getContext());
        } catch (Exception ex) {
            LOGGER.error("Test of FilemakerUtils.getContext failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of FilemakerUtils.getContext failed!");
        }
    }
}