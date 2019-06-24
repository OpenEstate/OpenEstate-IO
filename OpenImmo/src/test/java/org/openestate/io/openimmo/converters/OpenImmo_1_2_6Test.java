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
 * OpenImmo_1_2_6Test.
 *
 * @author Andreas Rudolph
 */
@RunWith(JUnit4.class)
@SuppressWarnings("SpellCheckingInspection")
public class OpenImmo_1_2_6Test {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(OpenImmo_1_2_6Test.class);

    private static Document buildTransferDocumentForDowngrade() throws Exception {
        return XmlUtils.newDocument(
                OpenImmo_1_2_6Test.class.getResourceAsStream("/openimmo-1-2-6-downgrade.xml"));
    }

  /*private static Document buildTransferDocumentForUpgrade() throws Exception
  {
    return DocumentUtils.newDocument(
      OpenImmo_1_2_6Test.class.getResourceAsStream( "/openimmo-1-2-6-upgrade.xml" ) );
  }*/

    @Test
    public void testDowngradeAusblickElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:infrastruktur/io:ausblick[@blick='SEE']", doc);
            Assert.assertEquals(
                    "1 <ausblick blick=\"SEE\"> element available before conversion.", 1, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:infrastruktur/io:ausblick[@blick='MEER']", doc);
            Assert.assertEquals(
                    "1 <ausblick blick=\"MEER\"> element available before conversion.", 1, count);

            new OpenImmo_1_2_6().downgradeAusblickElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:infrastruktur/io:ausblick[@blick='SEE']", doc);
            Assert.assertEquals(
                    "2 <ausblick blick=\"SEE\"> elements available after conversion.", 2, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:infrastruktur/io:ausblick[@blick='MEER']", doc);
            Assert.assertEquals(
                    "0 <ausblick blick=\"MEER\"> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_6.downgradeAusblickElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_6.downgradeAusblickElements failed!");
        }
    }

    @Test
    public void testDowngradeBodenElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:boden", doc);
            Assert.assertEquals(
                    "2 <boden> elements available before conversion.", 2, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:boden[@GRANIT]", doc);
            Assert.assertEquals(
                    "2 convertable <boden> elements available before conversion.", 2, count);

            new OpenImmo_1_2_6().downgradeBodenElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:boden", doc);
            Assert.assertEquals(
                    "2 <boden> elements available after conversion.", 2, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:boden[@GRANIT]", doc);
            Assert.assertEquals(
                    "0 convertable <boden> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_6.downgradeBodenElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_6.downgradeBodenElements failed!");
        }
    }

    @Test
    public void testDowngradeBueroPraxenElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:buero_praxen[@buero_typ='BUEROFLAECHE']", doc);
            Assert.assertEquals(
                    "1 <buero_praxen buero_typ=\"BUEROFLAECHE\"> element available before conversion.", 1, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:buero_praxen[@buero_typ='COWORKING']", doc);
            Assert.assertEquals(
                    "1 convertable <buero_praxen buero_typ=\"COWORKING\"> element available before conversion.", 1, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:buero_praxen[@buero_typ='SHARED_OFFICE']", doc);
            Assert.assertEquals(
                    "1 convertable <buero_praxen buero_typ=\"SHARED_OFFICE\"> element available before conversion.", 1, count);

            new OpenImmo_1_2_6().downgradeBueroPraxenElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:buero_praxen[@buero_typ='BUEROFLAECHE']", doc);
            Assert.assertEquals(
                    "3 <buero_praxen buero_typ=\"BUEROFLAECHE\"> elements available after conversion.", 3, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:buero_praxen[@buero_typ='COWORKING']", doc);
            Assert.assertEquals(
                    "0 <buero_praxen buero_typ=\"COWORKING\"> elements available after conversion.", 0, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:buero_praxen[@buero_typ='SHARED_OFFICE']", doc);
            Assert.assertEquals(
                    "0 <buero_praxen buero_typ=\"SHARED_OFFICE\"> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_6.downgradeBueroPraxenElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_6.downgradeBueroPraxenElements failed!");
        }
    }

    @Test
    public void testDowngradeEnergietypElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:energietyp", doc);
            Assert.assertEquals(
                    "2 <energietyp> elements available before conversion.", 2, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:energietyp[@MINERGIEBAUWEISE or @MINERGIE_ZERTIFIZIERT]", doc);
            Assert.assertEquals(
                    "2 convertable <energietyp> elements available before conversion.", 2, count);

            new OpenImmo_1_2_6().downgradeEnergietypElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:energietyp", doc);
            Assert.assertEquals(
                    "2 <energietyp> elements available after conversion.", 2, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:energietyp[@MINERGIEBAUWEISE or @MINERGIE_ZERTIFIZIERT]", doc);
            Assert.assertEquals(
                    "0 convertable <energietyp> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_6.downgradeEnergietypElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_6.downgradeEnergietypElements failed!");
        }
    }

    @Test
    public void testDowngradeKaufpreisElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:kaufpreis", doc);
            Assert.assertEquals(
                    "2 <kaufpreis> elements available before conversion.", 2, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:kaufpreis[@auf_anfrage]", doc);
            Assert.assertEquals(
                    "2 convertable <kaufpreis> elements available before conversion.", 2, count);

            new OpenImmo_1_2_6().downgradeKaufpreisElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:kaufpreis", doc);
            Assert.assertEquals(
                    "2 <kaufpreis> elements available after conversion.", 2, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:kaufpreis[@auf_anfrage]", doc);
            Assert.assertEquals(
                    "0 convertable <kaufpreis> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_6.downgradeKaufpreisElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_6.downgradeKaufpreisElements failed!");
        }
    }

    @Test
    public void testRemoveBauzoneElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:bauzone", doc);
            Assert.assertEquals(
                    "2 <bauzone> elements available before conversion.", 2, count);

            new OpenImmo_1_2_6().removeBauzoneElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:bauzone", doc);
            Assert.assertEquals(
                    "0 <bauzone> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_6.removeBauzoneElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_6.removeBauzoneElements failed!");
        }
    }

    @Test
    public void testRemoveFlaechenChildElements() {
        String[] elements = new String[]{
                "kubatur", "ausnuetzungsziffer", "flaechevon", "flaechebis"
        };
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            for (String element : elements) {
                count = XmlUtils.countNodes(
                        "/io:openimmo/io:anbieter/io:immobilie/io:flaechen/io:" + element, doc);
                Assert.assertEquals(
                        "1 convertable <" + element + "> element available before conversion.", 1, count);
            }

            new OpenImmo_1_2_6().removeFlaechenChildElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            for (String element : elements) {
                count = XmlUtils.countNodes(
                        "/io:openimmo/io:anbieter/io:immobilie/io:flaechen/io:" + element, doc);
                Assert.assertEquals(
                        "0 convertable <" + element + "> elements available after conversion.", 0, count);
            }
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_6.removeFlaechenChildElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_6.removeFlaechenChildElements failed!");
        }
    }

    @Test
    public void testRemovePreiseChildElements() {
        String[] elements = new String[]{
                "kaufpreisnetto", "kaufpreisbrutto", "hauptmietzinsnetto",
                "pauschalmiete", "betriebskostennetto", "evbnetto", "gesamtmietenetto",
                "gesamtmietebrutto", "gesamtbelastungnetto", "gesamtbelastungbrutto",
                "gesamtkostenprom2von", "heizkostennetto", "monatlichekostennetto",
                "monatlichekostenbrutto", "nebenkostenprom2von", "ruecklagenetto",
                "sonstigekostennetto", "sonstigemietenetto", "summemietenetto",
                "nettomieteprom2von", "provisionnetto", "provisionbrutto",
                "richtpreisprom2"
        };
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            for (String element : elements) {
                count = XmlUtils.countNodes(
                        "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:" + element, doc);
                Assert.assertEquals(
                        "1 convertable <" + element + "> element available before conversion.", 1, count);
            }

            new OpenImmo_1_2_6().removePreiseChildElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            for (String element : elements) {
                count = XmlUtils.countNodes(
                        "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:" + element, doc);
                Assert.assertEquals(
                        "0 convertable <" + element + "> elements available after conversion.", 0, count);
            }
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_6.removePreiseChildElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_6.removePreiseChildElements failed!");
        }
    }

    @Test
    public void testRemoveZwangsversteigerungElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:versteigerung/io:zwangsversteigerung", doc);
            Assert.assertEquals(
                    "2 <zwangsversteigerung> elements available before conversion.", 2, count);

            new OpenImmo_1_2_6().removeZwangsversteigerungElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:versteigerung/io:zwangsversteigerung", doc);
            Assert.assertEquals(
                    "0 <zwangsversteigerung> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_6.removeZwangsversteigerungElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_6.removeZwangsversteigerungElements failed!");
        }
    }
}