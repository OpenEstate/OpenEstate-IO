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

import java.math.BigInteger;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.filemaker.xml.result.FMPXMLRESULT;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

/**
 * @author Andreas Rudolph
 */
@RunWith(JUnit4.class)
public class FilemakerResultDocumentTest {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(FilemakerResultDocumentTest.class);

    private static Document buildExampleDocument() throws Exception {
        return XmlUtils.newDocument("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
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
                + "</FMPXMLRESULT>");
    }

    @Test
    public void testToMapping() {
        try {
            FilemakerResultDocument doc = new FilemakerResultDocument(buildExampleDocument());

            FilemakerResultMapping mapping = doc.toMapping();
            Assert.assertNotNull(
                    "Created mapping for transfer document.", mapping);
        } catch (Exception ex) {
            LOGGER.error("Test of FilemakerResultDocument.toMapping failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of FilemakerResultDocument.toMapping failed!");
        }
    }

    @Test
    public void testToObject() {
        try {
            FilemakerResultDocument doc = new FilemakerResultDocument(buildExampleDocument());

            FMPXMLRESULT obj = doc.toObject();
            Assert.assertNotNull(
                    "Created object for transfer document.", obj);
        } catch (Exception ex) {
            LOGGER.error("Test of FilemakerResultDocument.toObject failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of FilemakerResultDocument.toObject failed!");
        }
    }

    @Test
    @Ignore
    public void testToXml() {
        FMPXMLRESULT result = FilemakerUtils.getFactoryForResult().createFMPXMLRESULT();
        result.setERRORCODE("0");
        result.setPRODUCT(FilemakerUtils.getFactoryForResult().createProductType());
        result.getPRODUCT().setNAME("OpenEstate-IO");
        result.getPRODUCT().setVERSION("1.0");
        result.getPRODUCT().setBUILD("123");
        result.setDATABASE(FilemakerUtils.getFactoryForResult().createDatabaseType());
        result.getDATABASE().setNAME("example database");
        result.getDATABASE().setLAYOUT("fmmedia2universal");
        result.getDATABASE().setDATEFORMAT("D.m.yyyy");
        result.getDATABASE().setTIMEFORMAT("k:mm:ss");
        result.getDATABASE().setRECORDS(BigInteger.ZERO);
        result.setMETADATA(FilemakerUtils.getFactoryForResult().createMetaDataType());
        result.setRESULTSET(FilemakerUtils.getFactoryForResult().createResultSetType());
        try {
            FilemakerResultDocument doc = FilemakerResultDocument.newDocument(result);

            String xml = doc.toXmlString(true);
            LOGGER.info("XML: " + xml);
        } catch (Exception ex) {
            LOGGER.error("Test of FilemakerResultDocument.toXml failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of FilemakerResultDocument.toXml failed!");
        }
    }
}