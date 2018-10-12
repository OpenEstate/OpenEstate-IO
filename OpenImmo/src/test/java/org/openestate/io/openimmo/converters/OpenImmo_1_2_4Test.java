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
 * OpenImmo_1_2_4Test.
 *
 * @author Andreas Rudolph
 */
@RunWith(JUnit4.class)
@SuppressWarnings("SpellCheckingInspection")
public class OpenImmo_1_2_4Test {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(OpenImmo_1_2_4Test.class);

    private static Document buildFeedbackDocumentForDowngrade() throws Exception {
        return XmlUtils.newDocument(
                OpenImmo_1_2_5Test.class.getResourceAsStream("/openimmo-feedback-1-2-4-downgrade.xml"));
    }

    private static Document buildTransferDocumentForDowngrade() throws Exception {
        return XmlUtils.newDocument(
                OpenImmo_1_2_4Test.class.getResourceAsStream("/openimmo-1-2-4-downgrade.xml"));
    }

    private static Document buildTransferDocumentForUpgrade() throws Exception {
        return XmlUtils.newDocument(
                OpenImmo_1_2_4Test.class.getResourceAsStream("/openimmo-1-2-4-upgrade.xml"));
    }

    @Test
    public void testDowngradeAnhangElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:anhaenge/io:anhang", doc);
            Assert.assertEquals(
                    "5 <anhang> elements available before conversion.", 5, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:anhaenge/io:anhang[@gruppe='QRCODE' or @gruppe='FILM' or @gruppe='FILMLINK' or @location='REMOTE'] | " +
                            "/io:openimmo/io:anbieter/io:immobilie/io:anhaenge/io:anhang/io:check/..", doc);
            Assert.assertEquals(
                    "5 convertable <anhang> elements available before conversion.", 5, count);

            new OpenImmo_1_2_4().downgradeAnhangElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:anhaenge/io:anhang", doc);
            Assert.assertEquals(
                    "5 <anhang> elements available after conversion.", 5, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:anhaenge/io:anhang[@gruppe='QRCODE' or @gruppe='FILM' or @gruppe='FILMLINK' or @location='REMOTE'] | " +
                            "/io:openimmo/io:anbieter/io:immobilie/io:anhaenge/io:anhang/io:check/..", doc);
            Assert.assertEquals(
                    "0 convertable <anhang> elements available before conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_4.downgradeAnhangElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_4.downgradeAnhangElements failed!");
        }
    }

    @Test
    public void testDowngradeBebaubarNachElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:bebaubar_nach[@bebaubar_attr]", doc);
            Assert.assertEquals(
                    "2 <bebaubar_nach> elements available before conversion.", 2, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:bebaubar_nach[@bebaubar_attr='LAENDERSPEZIFISCH']", doc);
            Assert.assertEquals(
                    "1 convertable <bebaubar_nach> element available before conversion.", 1, count);

            new OpenImmo_1_2_4().downgradeBebaubarNachElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:bebaubar_nach[@bebaubar_attr]", doc);
            Assert.assertEquals(
                    "1 <bebaubar_nach> element available after conversion.", 1, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:bebaubar_nach[@bebaubar_attr='LAENDERSPEZIFISCH']", doc);
            Assert.assertEquals(
                    "0 convertable <bebaubar_nach> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_4.downgradeBebaubarNachElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_4.downgradeBebaubarNachElements failed!");
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
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:energietyp[@KFW55 or @KFW70]", doc);
            Assert.assertEquals(
                    "2 convertable <energietyp> elements available before conversion.", 2, count);

            new OpenImmo_1_2_4().downgradeEnergietypElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:energietyp", doc);
            Assert.assertEquals(
                    "2 <energietyp> elements available after conversion.", 2, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:energietyp[@KFW55 or @KFW70]", doc);
            Assert.assertEquals(
                    "0 convertable <energietyp> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_4.downgradeEnergietypElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_4.downgradeEnergietypElements failed!");
        }
    }

    @Test
    public void testDowngradeGrundstueckElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:grundstueck", doc);
            Assert.assertEquals(
                    "2 <grundstueck> elements available before conversion.", 2, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:grundstueck[@grundst_typ='SEELIEGENSCHAFT']", doc);
            Assert.assertEquals(
                    "1 convertable <grundstueck> element available before conversion.", 1, count);

            new OpenImmo_1_2_4().downgradeGrundstueckElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:grundstueck", doc);
            Assert.assertEquals(
                    "2 <grundstueck> elements available after conversion.", 2, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:grundstueck[@grundst_typ='SEELIEGENSCHAFT']", doc);
            Assert.assertEquals(
                    "0 convertable <grundstueck> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_4.downgradeGrundstueckElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_4.downgradeGrundstueckElements failed!");
        }
    }

    @Test
    public void testDowngradeLandUndForstwirtschaftElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:land_und_forstwirtschaft", doc);
            Assert.assertEquals(
                    "2 <land_und_forstwirtschaft> elements available before conversion.", 2, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:land_und_forstwirtschaft[@land_typ='JAGDREVIER']", doc);
            Assert.assertEquals(
                    "1 convertable <land_und_forstwirtschaft> element available before conversion.", 1, count);

            new OpenImmo_1_2_4().downgradeLandUndForstwirtschaftElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:land_und_forstwirtschaft", doc);
            Assert.assertEquals(
                    "2 <land_und_forstwirtschaft> elements available after conversion.", 2, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/land_und_forstwirtschaft[@land_typ='JAGDREVIER']", doc);
            Assert.assertEquals(
                    "0 convertable <land_und_forstwirtschaft> elements available after conversion.", 0, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:land_und_forstwirtschaft[@land_typ='SONSTIGE_LANDWIRTSCHAFTSIMMOBILIEN']", doc);
            Assert.assertEquals(
                    "1 converted <land_und_forstwirtschaft> element available after conversion.", 1, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_4.downgradeLandUndForstwirtschaftElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_4.downgradeLandUndForstwirtschaftElements failed!");
        }
    }

    @Test
    public void testDowngradeParkenElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:parken", doc);
            Assert.assertEquals(
                    "5 <parken> elements available before conversion.", 5, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:parken[@parken_typ='EINZELGARAGE' or @parken_typ='PARKHAUS' or @parken_typ='TIEFGARAGENSTELLPLATZ' or @parken_typ='PARKPLATZ_STROM']", doc);
            Assert.assertEquals(
                    "4 convertable <parken> elements available before conversion.", 4, count);

            new OpenImmo_1_2_4().downgradeParkenElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:parken", doc);
            Assert.assertEquals(
                    "5 <parken> elements available after conversion.", 5, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:parken[@parken_typ='EINZELGARAGE' or @parken_typ='PARKHAUS' or @parken_typ='TIEFGARAGENSTELLPLATZ' or @parken_typ='PARKPLATZ_STROM']", doc);
            Assert.assertEquals(
                    "0 convertable <parken> elements available after conversion.", 0, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:parken[@parken_typ='STELLPLATZ']", doc);
            Assert.assertEquals(
                    "4 converted <parken> elements available after conversion.", 4, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_4.downgradeParkenElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_4.downgradeParkenElements failed!");
        }
    }

    @Test
    public void testDowngradeWohnungElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:wohnung", doc);
            Assert.assertEquals(
                    "2 <wohnung> elements available before conversion.", 2, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:wohnung[@wohnungtyp='ROHDACHBODEN']", doc);
            Assert.assertEquals(
                    "1 convertable <wohnung> element available before conversion.", 1, count);

            new OpenImmo_1_2_4().downgradeWohnungElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:wohnung", doc);
            Assert.assertEquals(
                    "2 <wohnung> elements available after conversion.", 2, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:wohnung[@wohnungtyp='ROHDACHBODEN']", doc);
            Assert.assertEquals(
                    "0 convertable <wohnung> elements available after conversion.", 0, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:wohnung[@wohnungtyp='KEINE_ANGABE']", doc);
            Assert.assertEquals("1 converted <wohnung> element available after conversion.", 1, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_4.downgradeWohnungElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_4.downgradeWohnungElements failed!");
        }
    }

    @Test
    public void testRemoveFeedbackInteressentChildElements() {
        try {
            Document doc = buildFeedbackDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo_feedback/io:objekt/io:interessent/io:bevorzugt | " +
                            "/io:openimmo_feedback/io:objekt/io:interessent/io:wunsch", doc);
            Assert.assertEquals(
                    "4 convertable element available before conversion.", 4, count);

            new OpenImmo_1_2_4().removeFeedbackInteressentChildElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo_feedback/io:objekt/io:interessent/io:bevorzugt | " +
                            "/io:openimmo_feedback/io:objekt/io:interessent/io:wunsch", doc);
            Assert.assertEquals(
                    "2 elements available after conversion.", 2, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_4.removeFeedbackInteressentChildElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_4.removeFeedbackInteressentChildElements failed!");
        }
    }

    @Test
    public void testRemoveFeedbackVersionElements() {
        try {
            Document doc = buildFeedbackDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo_feedback/io:version", doc);
            Assert.assertEquals(
                    "1 convertable <version> element available before conversion.", 1, count);

            new OpenImmo_1_2_4().removeFeedbackVersionElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo_feedback/io:version", doc);
            Assert.assertEquals(
                    "0 convertable <version> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_4.removeFeedbackVersionElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_4.removeFeedbackVersionElements failed!");
        }
    }

    @Test
    public void testRemovePreiseChildElements() {
        String[] elements = new String[]{
                "provision_teilen", "kaution_text", "richtpreis"
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
                        "One convertable <" + element + "> element available before conversion.", 1, count);
            }

            new OpenImmo_1_2_4().removePreiseChildElements(doc);

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
            LOGGER.error("Test of OpenImmo_1_2_4.removePreiseChildElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_4.removePreiseChildElements failed!");
        }
    }

    @Test
    public void testRemoveWintergartenElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:wintergarten", doc);
            Assert.assertEquals(
                    "2 convertable <wintergarten> elements available before conversion.", 2, count);

            new OpenImmo_1_2_4().removeWintergartenElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:wintergarten", doc);
            Assert.assertEquals(
                    "0 convertable <wintergarten> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_4.removeWintergartenElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_4.removeWintergartenElements failed!");
        }
    }

    @Test
    public void testUpgradeAnhangElements() {
        try {
            Document doc = buildTransferDocumentForUpgrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:anhaenge/io:anhang", doc);
            Assert.assertEquals(
                    "5 <anhang> elements available before conversion.", 5, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:anhaenge/io:anhang[@location='REMOTE']", doc);
            Assert.assertEquals(
                    "0 remote <anhang> elements available before conversion.", 0, count);

            new OpenImmo_1_2_4().upgradeAnhangElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:anhaenge/io:anhang", doc);
            Assert.assertEquals(
                    "5 <anhang> elements available after conversion.", 5, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:anhaenge/io:anhang[@location='REMOTE']", doc);
            Assert.assertEquals(
                    "4 converted <anhang> elements available after conversion.", 4, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_4.upgradeAnhangElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_4.upgradeAnhangElements failed!");
        }
    }

    @Test
    public void testUpgradeAnzahlBalkonTerrassenElements() {
        try {
            Document doc = buildTransferDocumentForUpgrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:flaechen/io:anzahl_balkon_terrassen", doc);
            Assert.assertEquals(
                    "2 convertable <anzahl_balkon_terrassen> elements available before conversion.", 2, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:flaechen/io:anzahl_balkone", doc);
            Assert.assertEquals(
                    "1 <anzahl_balkone> element available before conversion.", 1, count);

            new OpenImmo_1_2_4().upgradeAnzahlBalkonTerrassenElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:flaechen/io:anzahl_balkon_terrassen", doc);
            Assert.assertEquals(
                    "0 convertable <anzahl_balkon_terrassen> elements available after conversion.", 0, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:flaechen/io:anzahl_balkone", doc);
            Assert.assertEquals(
                    "2 <anzahl_balkone> elements available after conversion.", 2, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_4.upgradeAnzahlBalkonTerrassenElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_4.upgradeAnzahlBalkonTerrassenElements failed!");
        }
    }

    @Test
    public void testUpgradeSonstigeElements() {
        try {
            Document doc = buildTransferDocumentForUpgrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:sonstige", doc);
            Assert.assertEquals(
                    "3 <sonstige> elements available before conversion.", 3, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:sonstige[@sonstige_typ='GARAGEN' or @sonstige_typ='PARKFLACHE']", doc);
            Assert.assertEquals(
                    "2 convertable <sonstige> elements available before conversion.", 2, count);

            new OpenImmo_1_2_4().upgradeSonstigeElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:sonstige", doc);
            Assert.assertEquals(
                    "1 <sonstige> element available after conversion.", 1, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:sonstige[@sonstige_typ='GARAGEN' or @sonstige_typ='PARKFLACHE']", doc);
            Assert.assertEquals(
                    "0 convertable <sonstige> elements available before conversion.", 0, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:parken[@parken_typ='STELLPLATZ']", doc);
            Assert.assertEquals(
                    "2 converted <parken> elements available after conversion.", 2, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_4.upgradeSonstigeElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_4.upgradeSonstigeElements failed!");
        }
    }
}