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
 * OpenImmo_1_2_3Test.
 *
 * @author Andreas Rudolph
 */
@RunWith(JUnit4.class)
@SuppressWarnings("SpellCheckingInspection")
public class OpenImmo_1_2_3Test {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(OpenImmo_1_2_3Test.class);

    private static Document buildTransferDocumentForDowngrade() throws Exception {
        return XmlUtils.newDocument(
                OpenImmo_1_2_3Test.class.getResourceAsStream("/openimmo-1-2-3-downgrade.xml"));
    }

    private static Document buildTransferDocumentForUpgrade() throws Exception {
        return XmlUtils.newDocument(
                OpenImmo_1_2_3Test.class.getResourceAsStream("/openimmo-1-2-3-upgrade.xml"));
    }

    @Test
    public void testDowngradeAusrichtBalkonTerrasseElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:ausricht_balkon_terrasse[@NORDOST or @NORDWEST or @SUEDOST or @SUEDWEST]", doc);
            Assert.assertEquals(
                    "3 convertable <ausricht_balkon_terrasse> elements available before conversion.", 3, count);

            new OpenImmo_1_2_3().downgradeAusrichtBalkonTerrasseElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:ausricht_balkon_terrasse[@NORDOST or @NORDWEST or @SUEDOST or @SUEDWEST]", doc);
            Assert.assertEquals(
                    "0 convertable <ausricht_balkon_terrasse> elements available after conversion.", 0, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:ausricht_balkon_terrasse[@NORD='true' and @OST='true']", doc);
            Assert.assertEquals(
                    "1 converted <ausricht_balkon_terrasse> element available after conversion.", 1, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:ausricht_balkon_terrasse[@SUED='true' and @WEST='true']", doc);
            Assert.assertEquals(
                    "1 converted <ausricht_balkon_terrasse> element available after conversion.", 1, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:ausricht_balkon_terrasse[@NORD or @OST or @SUED or @WEST]", doc);
            Assert.assertEquals(
                    "2 converted <ausricht_balkon_terrasse> element available after conversion.", 2, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_3.downgradeAusrichtBalkonTerrasseElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_3.downgradeAusrichtBalkonTerrasseElements failed!");
        }
    }

    @Test
    public void testDowngradeBadElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:bad[@BIDET or @PISSOIR]", doc);
            Assert.assertEquals(
                    "3 convertable <bad> elements available before conversion.", 3, count);

            new OpenImmo_1_2_3().downgradeBadElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:bad[@BIDET or @PISSOIR]", doc);
            Assert.assertEquals(
                    "0 convertable <bad> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_3.downgradeBadElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_3.downgradeBadElements failed!");
        }
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
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:befeuerung[@PELLET]", doc);
            Assert.assertEquals(
                    "3 convertable <befeuerung> elements available before conversion.", 3, count);

            new OpenImmo_1_2_3().downgradeBefeuerungElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:befeuerung[@PELLET]", doc);
            Assert.assertEquals(
                    "0 convertable <befeuerung> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_3.downgradeBefeuerungElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_3.downgradeBefeuerungElements failed!");
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
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:boden[@MARMOR or @TERRAKOTTA]", doc);
            Assert.assertEquals(
                    "3 convertable <boden> elements available before conversion.", 3, count);

            new OpenImmo_1_2_3().downgradeBodenElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:boden[@MARMOR or @TERRAKOTTA]", doc);
            Assert.assertEquals(
                    "0 convertable <boden> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_3.downgradeBodenElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_3.downgradeBodenElements failed!");
        }
    }

    @Test
    public void testDowngradeDachformElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:dachform[@FLACHDACH or @PYRAMIDENDACH]", doc);
            Assert.assertEquals(
                    "3 convertable <dachform> elements available before conversion.", 3, count);

            new OpenImmo_1_2_3().downgradeDachformElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:dachform[@FLACHDACH or @PYRAMIDENDACH]", doc);
            Assert.assertEquals(
                    "0 convertable <dachform> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_3.downgradeDachformElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_3.downgradeDachformElements failed!");
        }
    }

    @Test
    public void testDowngradeFlaechenChildElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:flaechen/io:anzahl_balkone | " +
                            "/io:openimmo/io:anbieter/io:immobilie/io:flaechen/io:anzahl_terrassen", doc);
            Assert.assertEquals(
                    "6 convertable <anzahl_balkone> and <anzahl_terrassen> elements available before conversion.", 6, count);

            new OpenImmo_1_2_3().downgradeFlaechenChildElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:flaechen/io:anzahl_balkone | " +
                            "/io:openimmo/io:anbieter/io:immobilie/io:flaechen/io:anzahl_terrassen", doc);
            Assert.assertEquals(
                    "0 convertable <anzahl_balkone> and <anzahl_terrassen> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_3.downgradeFlaechenChildElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_3.downgradeFlaechenChildElements failed!");
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
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:haus[@haustyp='APARTMENTHAUS' or @haustyp='BURG' or @haustyp='HERRENHAUS' or @haustyp='FINCA' or @haustyp='RUSTICO']", doc);
            Assert.assertEquals(
                    "5 convertable <haus> elements available before conversion.", 5, count);

            new OpenImmo_1_2_3().downgradeHausElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:haus[@haustyp='APARTMENTHAUS' or @haustyp='BURG' or @haustyp='HERRENHAUS' or @haustyp='FINCA' or @haustyp='RUSTICO']", doc);
            Assert.assertEquals(
                    "0 convertable <haus> elements available after conversion.", 0, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:haus[@haustyp='KEINE_ANGABE']", doc);
            Assert.assertEquals(
                    "5 converted <haus> elements available after conversion.", 5, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_3.downgradeHausElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_3.downgradeHausElements failed!");
        }
    }

    @Test
    public void testDowngradeKuecheElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:kueche[@PANTRY]", doc);
            Assert.assertEquals(
                    "3 convertable <kueche> elements available before conversion.", 3, count);

            new OpenImmo_1_2_3().downgradeKuecheElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:kueche[@PANTRY]", doc);
            Assert.assertEquals(
                    "0 convertable <kueche> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_3.downgradeKuecheElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_3.downgradeKuecheElements failed!");
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
                    "2 convertable <parken> elements available before conversion.", 2, count);

            new OpenImmo_1_2_3().downgradeParkenElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:parken", doc);
            Assert.assertEquals(
                    "0 convertable <parken> elements available after conversion.", 0, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:sonstige[@sonstige_typ='PARKFLACHE']", doc);
            Assert.assertEquals(
                    "2 converted <sonstige> elements available after conversion.", 2, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_3.downgradeParkenElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_3.downgradeParkenElements failed!");
        }
    }

    @Test
    public void testDowngradeSonstigeElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:sonstige[@sonstige_typ='KRANKENHAUS']", doc);
            Assert.assertEquals(
                    "1 convertable <sonstige> element available before conversion.", 1, count);

            new OpenImmo_1_2_3().downgradeSonstigeElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:sonstige[@sonstige_typ='KRANKENHAUS']", doc);
            Assert.assertEquals(
                    "0 convertable <sonstige> elements available after conversion.", 0, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:haus[@haustyp='KRANKENHAUS']", doc);
            Assert.assertEquals(
                    "1 converted <haus> elements available after conversion.", 1, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_3.downgradeSonstigeElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_3.downgradeSonstigeElements failed!");
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
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:wohnung[@wohnungtyp='APARTMENT' or @wohnungtyp='FERIENWOHNUNG' or @wohnungtyp='GALERIE']", doc);
            Assert.assertEquals(
                    "3 convertable <wohnung> elements available before conversion.", 3, count);

            new OpenImmo_1_2_3().downgradeWohnungElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:wohnung[@wohnungtyp='APARTMENT' or @wohnungtyp='FERIENWOHNUNG' or @wohnungtyp='GALERIE']", doc);
            Assert.assertEquals(
                    "0 convertable <wohnung> elements available after conversion.", 0, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:wohnung[@wohnungtyp='KEINE_ANGABE']", doc);
            Assert.assertEquals(
                    "3 converted <wohnung> elements available after conversion.", 3, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_3.downgradeWohnungElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_3.downgradeWohnungElements failed!");
        }
    }

    @Test
    public void testDowngradeZinshausRenditeobjektElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:zinshaus_renditeobjekt[@zins_typ='PFLEGEHEIM' or @zins_typ='SANATORIUM' or @zins_typ='SENIORENHEIM' or @zins_typ='BETREUTES-WOHNEN']", doc);
            Assert.assertEquals(
                    "4 convertable <zinshaus_renditeobjekt> elements available before conversion.", 4, count);

            new OpenImmo_1_2_3().downgradeZinshausRenditeobjektElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:zinshaus_renditeobjekt[@zins_typ='PFLEGEHEIM' or @zins_typ='SANATORIUM' or @zins_typ='SENIORENHEIM' or @zins_typ='BETREUTES-WOHNEN']", doc);
            Assert.assertEquals(
                    "0 convertable <zinshaus_renditeobjekt> elements available after conversion.", 0, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:haus[@haustyp='PFLEGEHEIM' or @haustyp='SANATORIUM' or @haustyp='SENIORENHEIM' or @haustyp='BETREUTES-WOHNEN']", doc);
            Assert.assertEquals(
                    "4 converted <haus> elements available after conversion.", 4, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_3.downgradeZinshausRenditeobjektElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_3.downgradeZinshausRenditeobjektElements failed!");
        }
    }

    @Test
    public void testRemoveAusstattungChildElements() {
        String[] elements = new String[]{
                "energietyp", "bibliothek", "dachboden", "gaestewc", "kabelkanaele ",
                "seniorengerecht"
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

            new OpenImmo_1_2_3().removeAusstattungChildElements(doc);

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
            LOGGER.error("Test of OpenImmo_1_2_3.removeAusstattungChildElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_3.removeAusstattungChildElements failed!");
        }
    }

    @Test
    public void testRemoveEmailFeedbackElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:kontaktperson/io:email_feedback", doc);
            Assert.assertEquals(
                    "2 convertable <email_feedback> elements available before conversion.", 2, count);

            new OpenImmo_1_2_3().removeEmailFeedbackElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:kontaktperson/io:email_feedback", doc);
            Assert.assertEquals(
                    "0 convertable <email_feedback> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_3.removeEmailFeedbackElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_3.removeEmailFeedbackElements failed!");
        }
    }

    @Test
    public void testRemovePreiseChildElements() {
        String[] elements = new String[]{
                "courtage_hinweis", "nettorendite_soll", "nettorendite_ist"
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

            new OpenImmo_1_2_3().removePreiseChildElements(doc);

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
            LOGGER.error("Test of OpenImmo_1_2_3.removePreiseChildElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_3.removePreiseChildElements failed!");
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
                    "4 total <user_defined_extend> elements available before conversion.", 4, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:freitexte/io:user_defined_extend | " +
                            "/io:openimmo/io:anbieter/io:immobilie/io:anhaenge/io:user_defined_extend", doc);
            Assert.assertEquals(
                    "2 convertable <user_defined_extend> elements available before conversion.", 2, count);

            new OpenImmo_1_2_3().removeUserDefinedExtendElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:freitexte/io:user_defined_extend | " +
                            "/io:openimmo/io:anbieter/io:immobilie/io:anhaenge/io:user_defined_extend", doc);
            Assert.assertEquals(
                    "0 convertable <user_defined_extend> elements available after conversion.", 0, count);

            count = XmlUtils.countNodes(
                    "//io:user_defined_extend", doc);
            Assert.assertEquals(
                    "2 total <user_defined_extend> elements available before conversion.", 2, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_3.removeUserDefinedExtendElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_3.removeUserDefinedExtendElements failed!");
        }
    }

    @Test
    public void testRemoveZustandAngabenChildElements() {
        String[] elements = new String[]{
                "letztemodernisierung", "verkaufstatus"
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
                        "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:" + element, doc);
                Assert.assertEquals(
                        "1 convertable <" + element + "> element available before conversion.", 1, count);
            }

            new OpenImmo_1_2_3().removeZustandAngabenChildElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            for (String element : elements) {
                count = XmlUtils.countNodes(
                        "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:" + element, doc);
                Assert.assertEquals(
                        "0 convertable <" + element + "> elements available after conversion.", 0, count);
            }
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_3.removeZustandAngabenChildElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_3.removeZustandAngabenChildElements failed!");
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
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:haus[@haustyp='KRANKENHAUS']", doc);
            Assert.assertEquals(
                    "1 convertable <haus> element available before conversion.", 1, count);

            new OpenImmo_1_2_3().upgradeSonstigeElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:haus[@haustyp='KRANKENHAUS']", doc);
            Assert.assertEquals(
                    "0 convertable <haus> elements available after conversion.", 0, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:sonstige[@sonstige_typ='KRANKENHAUS']", doc);
            Assert.assertEquals(
                    "1 converted <sonstige> element available after conversion.", 1, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_3.upgradeSonstigeElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_3.upgradeSonstigeElements failed!");
        }
    }

    @Test
    public void testUpgradeZinshausRenditeobjektElements() {
        try {
            Document doc = buildTransferDocumentForUpgrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:haus[@haustyp='PFLEGEHEIM' or @haustyp='SANATORIUM' or @haustyp='SENIORENHEIM' or @haustyp='BETREUTES-WOHNEN']", doc);
            Assert.assertEquals(
                    "4 convertable <haus> elements available before conversion.", 4, count);

            new OpenImmo_1_2_3().upgradeZinshausRenditeobjektElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:haus[@haustyp='PFLEGEHEIM' or @haustyp='SANATORIUM' or @haustyp='SENIORENHEIM' or @haustyp='BETREUTES-WOHNEN']", doc);
            Assert.assertEquals(
                    "0 convertable <wintergarten> elements available after conversion.", 0, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:zinshaus_renditeobjekt[@zins_typ='PFLEGEHEIM' or @zins_typ='SANATORIUM' or @zins_typ='SENIORENHEIM' or @zins_typ='BETREUTES-WOHNEN']", doc);
            Assert.assertEquals(
                    "4 converted <zinshaus_renditeobjekt> elements available after conversion.", 4, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_3.upgradeZinshausRenditeobjektElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_3.upgradeZinshausRenditeobjektElements failed!");
        }
    }
}