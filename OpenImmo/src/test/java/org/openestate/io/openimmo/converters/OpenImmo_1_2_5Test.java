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
 * OpenImmo_1_2_5Test.
 *
 * @author Andreas Rudolph
 */
@RunWith(JUnit4.class)
@SuppressWarnings("SpellCheckingInspection")
public class OpenImmo_1_2_5Test {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(OpenImmo_1_2_5Test.class);

    private static Document buildFeedbackDocumentForDowngrade() throws Exception {
        return XmlUtils.newDocument(
                OpenImmo_1_2_5Test.class.getResourceAsStream("/openimmo-feedback-1-2-5-downgrade.xml"));
    }

    private static Document buildTransferDocumentForDowngrade() throws Exception {
        return XmlUtils.newDocument(
                OpenImmo_1_2_5Test.class.getResourceAsStream("/openimmo-1-2-5-downgrade.xml"));
    }

    private static Document buildTransferDocumentForUpgrade() throws Exception {
        return XmlUtils.newDocument(
                OpenImmo_1_2_5Test.class.getResourceAsStream("/openimmo-1-2-5-upgrade.xml"));
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
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:bebaubar_nach[@bebaubar_attr='BAULAND_OHNE_B_PLAN']", doc);
            Assert.assertEquals(
                    "1 convertable <bebaubar_nach> element available before conversion.", 1, count);

            new OpenImmo_1_2_5().downgradeBebaubarNachElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:bebaubar_nach[@bebaubar_attr]", doc);
            Assert.assertEquals(
                    "1 <bebaubar_nach> element available after conversion.", 1, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:bebaubar_nach[@bebaubar_attr='BAULAND_OHNE_B_PLAN']", doc);
            Assert.assertEquals(
                    "0 convertable <bebaubar_nach> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_5.downgradeBebaubarNachElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_5.downgradeBebaubarNachElements failed!");
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
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:haus[@haustyp='KEINE_ANGABE']", doc);
            Assert.assertEquals(
                    "1 <haus haustyp=\"KEINE_ANGABE\"> element available before conversion.", 1, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:haus[@haustyp='FERTIGHAUS']", doc);
            Assert.assertEquals(
                    "1 convertable <haus haustyp=\"FERTIGHAUS\"> element available before conversion.", 1, count);

            new OpenImmo_1_2_5().downgradeHausElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:haus[@haustyp='KEINE_ANGABE']", doc);
            Assert.assertEquals(
                    "2 <haus haustyp=\"KEINE_ANGABE\"> elements available after conversion.", 2, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:haus[@haustyp='FERTIGHAUS']", doc);
            Assert.assertEquals(
                    "0 <haus haustyp=\"FERTIGHAUS\"> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_5.downgradeHausElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_5.downgradeHausElements failed!");
        }
    }

    @Test
    public void testDowngradeEnergiepassElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:hwbwert", doc);
            Assert.assertEquals(
                    "1 convertable <hwbwert> element available before conversion.", 1, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:hwbklasse", doc);
            Assert.assertEquals(
                    "1 convertable <hwbklasse> element available before conversion.", 1, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:fgeewert", doc);
            Assert.assertEquals("1 convertable <fgeewert> element available before conversion.", 1, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:fgeeklasse", doc);
            Assert.assertEquals(
                    "1 convertable <fgeeklasse> element available before conversion.", 1, count);

            new OpenImmo_1_2_5().downgradeEnergiepassElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:hwbwert", doc);
            Assert.assertEquals(
                    "0 convertable <hwbwert> elements available after conversion.", 0, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:hwbklasse", doc);
            Assert.assertEquals(
                    "0 convertable <hwbklasse> elements available after conversion.", 0, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:fgeewert", doc);
            Assert.assertEquals(
                    "0 convertable <fgeewert> elements available after conversion.", 0, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:fgeeklasse", doc);
            Assert.assertEquals(
                    "0 convertable <fgeeklasse> elements available after conversion.", 0, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:user_defined_simplefield[@feldname='epass_hwbwert']", doc);
            Assert.assertEquals(
                    "1 converted <user_defined_simplefield feldname=\"epass_hwbwert\"> element available after conversion.", 1, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:user_defined_simplefield[@feldname='epass_hwbklasse']", doc);
            Assert.assertEquals(
                    "1 converted <user_defined_simplefield feldname=\"epass_hwbklasse\"> element available after conversion.", 1, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:user_defined_simplefield[@feldname='epass_fgeewert']", doc);
            Assert.assertEquals(
                    "1 converted <user_defined_simplefield feldname=\"epass_fgeewert\"> element available after conversion.", 1, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:user_defined_simplefield[@feldname='epass_fgeeklasse']", doc);
            Assert.assertEquals(
                    "1 converted <user_defined_simplefield feldname=\"epass_fgeeklasse\"> element available after conversion.", 1, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_5.downgradeEnergiepassElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_5.downgradeEnergiepassElements failed!");
        }
    }

    @Test
    public void testDowngradeErschliessungElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:erschliessung[@erschl_attr]", doc);
            Assert.assertEquals(
                    "2 <erschliessung> elements available before conversion.", 2, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:erschliessung[@erschl_attr='ORTSUEBLICHERSCHLOSSEN']", doc);
            Assert.assertEquals(
                    "1 convertable <erschliessung> element available before conversion.", 1, count);

            new OpenImmo_1_2_5().downgradeErschliessungElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:erschliessung[@erschl_attr]", doc);
            Assert.assertEquals(
                    "1 <erschliessung> element available after conversion.", 1, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:erschliessung[@erschl_attr='ORTSUEBLICHERSCHLOSSEN']", doc);
            Assert.assertEquals(
                    "0 convertable <erschliessung> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_5.downgradeErschliessungElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_5.downgradeErschliessungElements failed!");
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
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:wohnung[@wohnungtyp='KEINE_ANGABE']", doc);
            Assert.assertEquals(
                    "1 <wohnung wohnungtyp==\"KEINE_ANGABE\"> element available before conversion.", 1, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:wohnung[@wohnungtyp='ATTIKAWOHNUNG']", doc);
            Assert.assertEquals(
                    "1 convertable <wohnung wohnungtyp==\"ATTIKAWOHNUNG\"> element available before conversion.", 1, count);

            new OpenImmo_1_2_5().downgradeWohnungElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:wohnung[@wohnungtyp='KEINE_ANGABE']", doc);
            Assert.assertEquals(
                    "2 <wohnung wohnungtyp==\"KEINE_ANGABE\"> elements available after conversion.", 2, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:wohnung[@wohnungtyp='ATTIKAWOHNUNG']", doc);
            Assert.assertEquals(
                    "0 <wohnung wohnungtyp==\"ATTIKAWOHNUNG\"> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_5.downgradeWohnungElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_5.downgradeWohnungElements failed!");
        }
    }

    @Test
    public void testDowngradeZustandElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:zustand[@zustand_art]", doc);
            Assert.assertEquals(
                    "3 <zustand> elements available before conversion.", 3, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:zustand[@zustand_art='TEIL_SANIERT' or @zustand_art='VOLL_SANIERT' or @zustand_art='SANIERUNGSBEDUERFTIG']", doc);
            Assert.assertEquals(
                    "3 convertable <zustand> elements available before conversion.", 3, count);

            new OpenImmo_1_2_5().downgradeZustandElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:zustand[@zustand_art]", doc);
            Assert.assertEquals(
                    "2 <zustand> elements available after conversion.", 2, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:zustand[@zustand_art='TEIL_SANIERT' or @zustand_art='VOLL_SANIERT' or @zustand_art='SANIERUNGSBEDUERFTIG']", doc);
            Assert.assertEquals(
                    "0 convertable <zustand> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_5.downgradeZustandElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_5.downgradeZustandElements failed!");
        }
    }

    @Test
    public void testRemoveAnzahlLogiaElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:flaechen/io:anzahl_logia", doc);
            Assert.assertEquals(
                    "3 <anzahl_logia> elements available before conversion.", 3, count);

            new OpenImmo_1_2_5().removeAnzahlLogiaElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:flaechen/io:anzahl_logia", doc);
            Assert.assertEquals(
                    "0 <anzahl_logia> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_5.removeAnzahlLogiaElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_5.removeAnzahlLogiaElements failed!");
        }
    }

    @Test
    public void testRemoveErschliessungUmfangElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:erschliessung_umfang", doc);
            Assert.assertEquals(
                    "3 <erschliessung_umfang> elements available before conversion.", 3, count);

            new OpenImmo_1_2_5().removeErschliessungUmfangElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:erschliessung_umfang", doc);
            Assert.assertEquals(
                    "0 <erschliessung_umfang> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_5.removeErschliessungUmfangElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_5.removeErschliessungUmfangElements failed!");
        }
    }

    @Test
    public void testRemoveFeedbackObjektChildElements() {
        String[] elements = new String[]{
                "land", "stadtbezirk", "anzahl_zimmer", "flaeche"
        };
        try {
            Document doc = buildFeedbackDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            for (String element : elements) {
                count = XmlUtils.countNodes(
                        "/io:openimmo_feedback/io:objekt/io:" + element, doc);
                Assert.assertEquals(
                        "1 convertable <" + element + "> element available before conversion.", 1, count);
            }

            new OpenImmo_1_2_5().removeFeedbackObjektChildElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            for (String element : elements) {
                count = XmlUtils.countNodes(
                        "/io:openimmo_feedback/io:objekt/io:" + element, doc);
                Assert.assertEquals(
                        "0 convertable <" + element + "> elements available after conversion.", 0, count);
            }
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_5.removeFeedbackObjektChildElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_5.removeFeedbackObjektChildElements failed!");
        }
    }

    @Test
    public void testRemoveKontaktpersonChildElements() {
        String[] elements = new String[]{
                "position", "immobilientreuhaenderid", "foto"
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
                        "/io:openimmo/io:anbieter/io:immobilie/io:kontaktperson/io:" + element, doc);
                Assert.assertEquals(
                        "1 convertable <" + element + "> element available before conversion.", 1, count);
            }

            new OpenImmo_1_2_5().removeKontaktpersonChildElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            for (String element : elements) {
                count = XmlUtils.countNodes(
                        "/io:openimmo/io:anbieter/io:immobilie/io:kontaktperson/io:" + element, doc);
                Assert.assertEquals(
                        "0 convertable <" + element + "> elements available after conversion.", 0, count);
            }
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_5.removeKontaktpersonChildElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_5.removeKontaktpersonChildElements failed!");
        }
    }

    @Test
    public void testRemoveMwstGesamtElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:mwst_gesamt", doc);
            Assert.assertEquals(
                    "3 <mwst_gesamt> elements available before conversion.", 3, count);

            new OpenImmo_1_2_5().removeMwstGesamtElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:mwst_gesamt", doc);
            Assert.assertEquals(
                    "0 <mwst_gesamt> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_5.removeMwstGesamtElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_5.removeMwstGesamtElements failed!");
        }
    }

    @Test
    public void testRemoveVerkehrswertElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:versteigerung/io:verkehrswert", doc);
            Assert.assertEquals(
                    "3 <verkehrswert> elements available before conversion.", 3, count);

            new OpenImmo_1_2_5().removeVerkehrswertElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:versteigerung/io:verkehrswert", doc);
            Assert.assertEquals(
                    "0 <verkehrswert> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_5.removeVerkehrswertElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_5.removeVerkehrswertElements failed!");
        }
    }

    @Test
    public void testRemoveVerwaltungTechnChildElements() {
        String[] elements = new String[]{
                "gruppen_kennung", "master", "sprache"
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
                        "/io:openimmo/io:anbieter/io:immobilie/io:verwaltung_techn/io:" + element, doc);
                Assert.assertEquals(
                        "1 convertable <" + element + "> element available before conversion.", 1, count);
            }

            new OpenImmo_1_2_5().removeVerwaltungTechnChildElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            for (String element : elements) {
                count = XmlUtils.countNodes(
                        "/io:openimmo/io:anbieter/io:immobilie/io:verwaltung_techn/io:" + element, doc);
                Assert.assertEquals(
                        "0 convertable <" + element + "> elements available after conversion.", 0, count);
            }
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_5.removeVerwaltungTechnChildElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_5.removeVerwaltungTechnChildElements failed!");
        }
    }

    @Test
    public void testUpgradeEnergiepassElements() {
        try {
            Document doc = buildTransferDocumentForUpgrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:user_defined_simplefield[@feldname='epass_hwbwert']", doc);
            Assert.assertEquals(
                    "2 convertable <user_defined_simplefield feldname=\"epass_hwbwert\"> elements available before conversion.", 2, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:user_defined_simplefield[@feldname='epass_hwbklasse']", doc);
            Assert.assertEquals(
                    "2 convertable <user_defined_simplefield feldname=\"epass_hwbklasse\"> elements available before conversion.", 2, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:user_defined_simplefield[@feldname='epass_fgeewert']", doc);
            Assert.assertEquals(
                    "2 convertable <user_defined_simplefield feldname=\"epass_fgeewert\"> elements available before conversion.", 2, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:user_defined_simplefield[@feldname='epass_fgeeklasse']", doc);
            Assert.assertEquals(
                    "2 convertable <user_defined_simplefield feldname=\"epass_fgeeklasse\"> elements available before conversion.", 2, count);

            new OpenImmo_1_2_5().upgradeEnergiepassElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:user_defined_simplefield[@feldname='epass_hwbwert']", doc);
            Assert.assertEquals(
                    "0 convertable <user_defined_simplefield feldname=\"epass_hwbwert\"> elements available after conversion.", 0, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:user_defined_simplefield[@feldname='epass_hwbklasse']", doc);
            Assert.assertEquals(
                    "0 convertable <user_defined_simplefield feldname=\"epass_hwbklasse\"> elements available after conversion.", 0, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:user_defined_simplefield[@feldname='epass_fgeewert']", doc);
            Assert.assertEquals(
                    "0 convertable <user_defined_simplefield feldname=\"epass_fgeewert\"> elements available after conversion.", 0, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:user_defined_simplefield[@feldname='epass_fgeeklasse']", doc);
            Assert.assertEquals(
                    "0 convertable <user_defined_simplefield feldname=\"epass_fgeeklasse\"> elements available after conversion.", 0, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:hwbwert", doc);
            Assert.assertEquals(
                    "2 converted <hwbwert> elements available after conversion.", 2, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:hwbklasse", doc);
            Assert.assertEquals(
                    "2 converted <hwbklasse> elements available after conversion.", 2, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:fgeewert", doc);
            Assert.assertEquals(
                    "2 converted <fgeewert> elements available after conversion.", 2, count);

            count = XmlUtils.countNodes(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:fgeeklasse", doc);
            Assert.assertEquals(
                    "2 converted <fgeeklasse> elements available after conversion.", 2, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_5.upgradeEnergiepassElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_5.upgradeEnergiepassElements failed!");
        }
    }
}