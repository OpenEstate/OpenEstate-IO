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
 * OpenImmo_1_2_0Test.
 *
 * @author Andreas Rudolph
 */
@RunWith(JUnit4.class)
@SuppressWarnings("SpellCheckingInspection")
public class OpenImmo_1_2_0Test {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(OpenImmo_1_2_0Test.class);

    private static Document buildTransferDocumentForDowngrade() throws Exception {
        return XmlUtils.newDocument(
                OpenImmo_1_2_0Test.class.getResourceAsStream("/openimmo-1-2-0-downgrade.xml"));
    }

    private static Document buildTransferDocumentForUpgrade() throws Exception {
        return XmlUtils.newDocument(
                OpenImmo_1_2_0Test.class.getResourceAsStream("/openimmo-1-2-0-upgrade.xml"));
    }

    @Test
    public void testDowngradeBefeuerungElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:befeuerung[@FERN or @BLOCK or @WASSER-ELEKTRO]", doc);
            Assert.assertEquals(
                    "3 convertable <befeuerung> elements available before conversion.", 3, count);

            new OpenImmo_1_2_0().downgradeBefeuerungElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:befeuerung[@FERN or @BLOCK or @WASSER-ELEKTRO]", doc);
            Assert.assertEquals(
                    "0 convertable <befeuerung> elements available after conversion.", 0, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:befeuerung", doc);
            Assert.assertEquals(
                    "3 converted <befeuerung> elements available after conversion.", 3, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_0.downgradeBefeuerungElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_0.downgradeBefeuerungElements failed!");
        }
    }

    @Test
    public void testDowngradeHausElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:haus[@haustyp='KRANKENHAUS' or @haustyp='PFLEGEHEIM' or @haustyp='SANATORIUM' or @haustyp='SENIORENHEIM' or @haustyp='BETREUTES-WOHNEN']", doc);
            Assert.assertEquals(
                    "5 convertable <haus> element available before conversion.", 5, count);

            new OpenImmo_1_2_0().downgradeHausElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:haus[@haustyp='KRANKENHAUS' or @haustyp='PFLEGEHEIM' or @haustyp='SANATORIUM' or @haustyp='SENIORENHEIM' or @haustyp='BETREUTES-WOHNEN']", doc);
            Assert.assertEquals(
                    "0 convertable <haus> elements available after conversion.", 0, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:haus", doc);
            Assert.assertEquals(
                    "5 converted <haus> elements available after conversion.", 5, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_0.downgradeHausElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_0.downgradeHausElements failed!");
        }
    }

    @Test
    public void testDowngradeMieteinnahmenElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:mieteinnahmen_ist[@periode] |" +
                            "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:mieteinnahmen_soll[@periode]", doc);
            Assert.assertEquals(
                    "2 convertable <mieteinnahmen_ist> and <mieteinnahmen_soll> elements available before conversion.", 2, count);

            new OpenImmo_1_2_0().downgradeMieteinnahmenElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:mieteinnahmen_ist[@periode] |" +
                            "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:mieteinnahmen_soll[@periode]", doc);
            Assert.assertEquals(
                    "0 convertable <mieteinnahmen_ist> and <mieteinnahmen_soll> elements available after conversion.", 0, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:mieteinnahmen_ist |" +
                            "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:mieteinnahmen_soll", doc);
            Assert.assertEquals(
                    "2 converted <mieteinnahmen_ist> and <mieteinnahmen_soll> elements available after conversion.", 2, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_0.downgradeMieteinnahmenElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_0.downgradeMieteinnahmenElements failed!");
        }
    }

    @Test
    public void testDowngradeUebertragungElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:uebertragung[@senderversion or @regi_id or @modus]", doc);
            Assert.assertEquals(
                    "1 convertable <uebertragung> element available before conversion.", 1, count);

            new OpenImmo_1_2_0().downgradeUebertragungElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:uebertragung[@senderversion or @regi_id or @modus]", doc);
            Assert.assertEquals(
                    "0 convertable <uebertragung> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_0.downgradeUebertragungElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_0.downgradeUebertragungElements failed!");
        }
    }

    @Test
    public void testRemoveAnbieterChildElements() {
        String[] elements = new String[]{
                "lizenzkennung", "impressum_strukt"
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
                        "/io:openimmo/io:anbieter/io:" + element, doc);
                Assert.assertEquals(
                        "1 convertable <" + element + "> element available before conversion.", 1, count);
            }

            new OpenImmo_1_2_0().removeAnbieterChildElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            for (String element : elements) {
                count = XmlUtils.countNodes(
                        "/io:openimmo/io:anbieter/io:" + element, doc);
                Assert.assertEquals(
                        "0 convertable <" + element + "> elements available after conversion.", 0, count);
            }
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_0.removeAnbieterChildElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_0.removeAnbieterChildElements failed!");
        }
    }

    @Test
    public void testRemoveAusstattungChildElements() {
        String[] elements = new String[]{
                "dvbt", "breitband_zugang", "umts_empfang", "abstellraum", "fahrradraum",
                "rolladen"
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
                        "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:" + element, doc);
                Assert.assertEquals(
                        "1 convertable <" + element + "> element available before conversion.", 1, count);
            }

            new OpenImmo_1_2_0().removeAusstattungChildElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            for (String element : elements) {
                count = XmlUtils.countNodes(
                        "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:" + element, doc);
                Assert.assertEquals(
                        "0 convertable <" + element + "> elements available after conversion.", 0, count);
            }
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_0.removeAusstattungChildElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_0.removeAusstattungChildElements failed!");
        }
    }

    @Test
    public void testRemoveBewertungElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:bewertung", doc);
            Assert.assertEquals(
                    "1 convertable <bewertung> element available before conversion.", 1, count);

            new OpenImmo_1_2_0().removeBewertungElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:bewertung", doc);
            Assert.assertEquals(
                    "0 convertable <bewertung> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_0.removeBewertungElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_0.removeBewertungElements failed!");
        }
    }

    @Test
    public void testRemoveBieterverfahrenElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:bieterverfahren", doc);
            Assert.assertEquals(
                    "1 convertable <bieterverfahren> element available before conversion.", 1, count);

            new OpenImmo_1_2_0().removeBieterverfahrenElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:bieterverfahren", doc);
            Assert.assertEquals(
                    "0 convertable <bieterverfahren> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_0.removeBieterverfahrenElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_0.removeBieterverfahrenElements failed!");
        }
    }

    @Test
    public void testRemoveEnergiepassElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass", doc);
            Assert.assertEquals(
                    "2 convertable <energiepass> elements available before conversion.", 2, count);

            new OpenImmo_1_2_0().removeEnergiepassElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass", doc);
            Assert.assertEquals(
                    "0 convertable <energiepass> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_0.removeEnergiepassElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_0.removeEnergiepassElements failed!");
        }
    }

    @Test
    public void testRemoveGeoChildElements() {
        String[] elements = new String[]{
                "anzahl_etagen", "karten_makro", "karten_mikro", "virtuelletour",
                "luftbildern"
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
                        "/io:openimmo/io:anbieter/io:immobilie/io:geo/io:" + element, doc);
                Assert.assertEquals(
                        "1 convertable <" + element + "> element available before conversion.", 1, count);
            }

            new OpenImmo_1_2_0().removeGeoChildElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            for (String element : elements) {
                count = XmlUtils.countNodes(
                        "/io:openimmo/io:anbieter/io:immobilie/io:geo/io:" + element, doc);
                Assert.assertEquals(
                        "0 convertable <" + element + "> elements available after conversion.", 0, count);
            }
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_0.removeGeoChildElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_0.removeGeoChildElements failed!");
        }
    }

    @Test
    public void testRemoveHeizkostenEnthaltenElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:heizkosten_enthalten", doc);
            Assert.assertEquals(
                    "1 convertable <heizkosten_enthalten> element available before conversion.", 1, count);

            new OpenImmo_1_2_0().removeHeizkostenEnthaltenElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:heizkosten_enthalten", doc);
            Assert.assertEquals(
                    "0 convertable <heizkosten_enthalten> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_0.removeHeizkostenEnthaltenElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_0.removeHeizkostenEnthaltenElements failed!");
        }
    }

    @Test
    public void testRemoveUserDefinedExtendElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "//io:user_defined_extend", doc);
            Assert.assertEquals(
                    "4 convertable <user_defined_extend> elements available before conversion.", 4, count);

            new OpenImmo_1_2_0().removeUserDefinedExtendElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "//io:user_defined_extend", doc);
            Assert.assertEquals(
                    "0 convertable <user_defined_extend> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_0.removeUserDefinedExtendElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_0.removeUserDefinedExtendElements failed!");
        }
    }

    @Test
    public void testUpgradeMieteinnahmenElements() {
        try {
            Document doc = buildTransferDocumentForUpgrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:mieteinnahmen_ist |" +
                            "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:mieteinnahmen_soll", doc);
            Assert.assertEquals(
                    "2 convertable <mieteinnahmen_ist> and <mieteinnahmen_soll> elements available after conversion.", 2, count);

            new OpenImmo_1_2_0().upgradeMieteinnahmenElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:mieteinnahmen_ist[@periode='JAHR'] |" +
                            "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:mieteinnahmen_soll[@periode='JAHR']", doc);
            Assert.assertEquals(
                    "2 converted <mieteinnahmen_ist> and <mieteinnahmen_soll> elements available after conversion.", 2, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_0.upgradeMieteinnahmenElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_0.upgradeMieteinnahmenElements failed!");
        }
    }
}