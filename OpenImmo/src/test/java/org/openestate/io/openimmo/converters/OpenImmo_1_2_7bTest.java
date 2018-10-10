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
package org.openestate.io.openimmo.converters;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openestate.io.core.XmlUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

/**
 * OpenImmo_1_2_7bTest.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
@RunWith(JUnit4.class)
public class OpenImmo_1_2_7bTest {
    private final static Logger LOGGER = LoggerFactory.getLogger(OpenImmo_1_2_7bTest.class);

    private static Document buildTransferDocumentForDowngrade() throws Exception {
        return XmlUtils.newDocument(
                OpenImmo_1_2_7bTest.class.getResourceAsStream("/openimmo-1-2-7b-downgrade.xml"));
    }

    @Test
    public void testDowngradeEnergiepassJahrgangElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:jahrgang", doc);
            Assert.assertEquals(
                    "4 <jahrgang> element available before conversion.", 4, count);

            new OpenImmo_1_2_7b().downgradeEnergiepassJahrgangElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:jahrgang", doc);
            Assert.assertEquals(
                    "1 <jahrgang> elements available after conversion.", 1, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_7b.downgradeEnergiepassJahrgangElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_7b.downgradeEnergiepassJahrgangElements failed!");
        }
    }

    @Test
    public void testRemoveGeg2018Elements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:geg2018", doc);
            Assert.assertEquals(
                    "3 <geg2018> element available before conversion.", 3, count);

            new OpenImmo_1_2_7b().removeGeg2018Elements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:geg2018", doc);
            Assert.assertEquals(
                    "0 <geg2018> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_7b.removeGeg2018Elements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_7b.removeGeg2018Elements failed!");
        }
    }

    @Test
    public void testRemoveReferenzIdElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:kontaktperson/io:referenz_id", doc);
            Assert.assertEquals(
                    "3 <referenz_id> element available before conversion.", 3, count);

            new OpenImmo_1_2_7b().removeReferenzIdElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:kontaktperson/io:referenz_id", doc);
            Assert.assertEquals(
                    "0 <referenz_id> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_7b.removeReferenzIdElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_7b.removeReferenzIdElements failed!");
        }
    }
}