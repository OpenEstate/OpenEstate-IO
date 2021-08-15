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

import javax.xml.xpath.XPathExpressionException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openestate.io.core.XmlUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

/**
 * OpenImmo_1_2_7Test.
 *
 * @author Andreas Rudolph
 */
@RunWith(JUnit4.class)
@SuppressWarnings("SpellCheckingInspection")
public class OpenImmo_1_2_7Test {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(OpenImmo_1_2_7Test.class);

    private static Document buildTransferDocumentForDowngrade() throws Exception {
        return XmlUtils.newDocument(
                OpenImmo_1_2_7Test.class.getResourceAsStream("/openimmo-1-2-7-downgrade.xml"));
    }

    private static Document buildTransferDocumentForUpgrade() throws Exception {
        return XmlUtils.newDocument(
                OpenImmo_1_2_7Test.class.getResourceAsStream("/openimmo-1-2-7-upgrade.xml"));
    }

    @Test
    public void testDowngradeAktionElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:verwaltung_techn/io:aktion[@aktionart='CHANGE']", doc);
            Assert.assertEquals(
                    "2 <aktion> elements with \"CHANGE\" available before conversion.", 2, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:verwaltung_techn/io:aktion[@aktionart='REFERENZ']", doc);
            Assert.assertEquals(
                    "2 <aktion> elements with \"REFERENZ\" available before conversion.", 2, count);

            new OpenImmo_1_2_7().downgradeAktionElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:verwaltung_techn/io:aktion[@aktionart='CHANGE']", doc);
            Assert.assertEquals(
                    "4 <aktion> elements with \"CHANGE\" available after conversion.", 4, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:verwaltung_techn/io:aktion[@aktionart='REFERENZ']", doc);
            Assert.assertEquals(
                    "0 <aktion> elements with \"REFERENZ\" available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_7.downgradeAktionElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_7.downgradeAktionElements failed!");
        }
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

            count = xpathCount(
                    "//io:anhang[@gruppe='EPASS-SKALA'] | //io:anhang[@gruppe='ANBOBJURL']", doc);
            Assert.assertEquals(
                    "4 convertable <anhang> elements available before conversion.", 4, count);

            new OpenImmo_1_2_7().downgradeAnhangElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = xpathCount(
                    "//io:anhang[@gruppe='EPASS-SKALA'] | //io:anhang[@gruppe='ANBOBJURL']", doc);
            Assert.assertEquals(
                    "0 convertable <anhang> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_7.downgradeAnhangElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_7.downgradeAnhangElements failed!");
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

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:befeuerung", doc);
            Assert.assertEquals(
                    "4 <befeuerung> elements available before conversion.", 4, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:befeuerung[@KOHLE or @HOLZ or @FLUESSIGGAS]", doc);
            Assert.assertEquals(
                    "3 convertable <befeuerung> elements available before conversion.", 3, count);

            new OpenImmo_1_2_7().downgradeBefeuerungElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:befeuerung", doc);
            Assert.assertEquals(
                    "4 <befeuerung> elements available after conversion.", 4, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:befeuerung[@KOHLE or @HOLZ or @FLUESSIGGAS]", doc);
            Assert.assertEquals(
                    "0 <befeuerung> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_7.downgradeBefeuerungElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_7.downgradeBefeuerungElements failed!");
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

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:waermewert", doc);
            Assert.assertEquals(
                    "1 convertable <waermewert> element available before conversion.", 1, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:stromwert", doc);
            Assert.assertEquals(
                    "1 convertable <stromwert> element available before conversion.", 1, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:wertklasse", doc);
            Assert.assertEquals(
                    "1 convertable <wertklasse> element available before conversion.", 1, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:baujahr", doc);
            Assert.assertEquals(
                    "1 convertable <baujahr> element available before conversion.", 1, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:ausstelldatum", doc);
            Assert.assertEquals(
                    "1 convertable <ausstelldatum> element available before conversion.", 1, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:jahrgang", doc);
            Assert.assertEquals(
                    "1 convertable <jahrgang> element available before conversion.", 1, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:gebaeudeart", doc);
            Assert.assertEquals(
                    "1 convertable <gebaeudeart> element available before conversion.", 1, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:primaerenergietraeger", doc);
            Assert.assertEquals(
                    "1 convertable <primaerenergietraeger> element available before conversion.", 1, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:epasstext", doc);
            Assert.assertEquals(
                    "1 convertable <epasstext> element available before conversion.", 1, count);

            new OpenImmo_1_2_7().downgradeEnergiepassElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:waermewert", doc);
            Assert.assertEquals(
                    "0 convertable <waermewert> elements available after conversion.", 0, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:stromwert", doc);
            Assert.assertEquals(
                    "0 convertable <stromwert> elements available after conversion.", 0, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:wertklasse", doc);
            Assert.assertEquals(
                    "0 convertable <wertklasse> elements available after conversion.", 0, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:baujahr", doc);
            Assert.assertEquals(
                    "0 convertable <baujahr> elements available after conversion.", 0, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:ausstelldatum", doc);
            Assert.assertEquals(
                    "0 convertable <ausstelldatum> elements available after conversion.", 0, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:jahrgang", doc);
            Assert.assertEquals(
                    "0 convertable <jahrgang> elements available after conversion.", 0, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:gebaeudeart", doc);
            Assert.assertEquals(
                    "0 convertable <gebaeudeart> elements available after conversion.", 0, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:primaerenergietraeger", doc);
            Assert.assertEquals(
                    "0 convertable <primaerenergietraeger> elements available after conversion.", 0, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:epasstext", doc);
            Assert.assertEquals(
                    "0 convertable <epasstext> elements available after conversion.", 0, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:user_defined_simplefield[@feldname='epass_waermewert']", doc);
            Assert.assertEquals(
                    "1 converted <user_defined_simplefield feldname=\"epass_waermewert\"> element available after conversion.", 1, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:user_defined_simplefield[@feldname='epass_stromwert']", doc);
            Assert.assertEquals(
                    "1 converted <user_defined_simplefield feldname=\"epass_stromwert\"> element available after conversion.", 1, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:user_defined_simplefield[@feldname='epass_wertklasse']", doc);
            Assert.assertEquals(
                    "1 converted <user_defined_simplefield feldname=\"epass_wertklasse\"> element available after conversion.", 1, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:user_defined_simplefield[@feldname='epass_baujahr']", doc);
            Assert.assertEquals(
                    "1 converted <user_defined_simplefield feldname=\"epass_baujahr\"> element available after conversion.", 1, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:user_defined_simplefield[@feldname='epass_ausstelldatum']", doc);
            Assert.assertEquals(
                    "1 converted <user_defined_simplefield feldname=\"epass_ausstelldatum\"> element available after conversion.", 1, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:user_defined_simplefield[@feldname='epass_jahrgang']", doc);
            Assert.assertEquals(
                    "1 converted <user_defined_simplefield feldname=\"epass_jahrgang\"> element available after conversion.", 1, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:user_defined_simplefield[@feldname='epass_gebaeudeart']", doc);
            Assert.assertEquals(
                    "1 converted <user_defined_simplefield feldname=\"epass_gebaeudeart\"> element available after conversion.", 1, count);

        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_7.downgradeEnergiepassElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_7.downgradeEnergiepassElements failed!");
        }
    }

    @Test
    public void testDowngradeSummemietenettoElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:summemietenetto[@summemieteust]", doc);
            Assert.assertEquals(
                    "2 convertable <summemietenetto> elements available before conversion.", 2, count);

            new OpenImmo_1_2_7().downgradeSummemietenettoElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:summemietenetto[@summemieteust]", doc);
            Assert.assertEquals(
                    "0 convertable <summemietenetto> elements available after conversion.", 0, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:summemietenetto[@sonstigemieteust]", doc);
            Assert.assertEquals(
                    "2 converted <summemietenetto> elements available after conversion.", 2, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_7.downgradeSummemietenettoElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_7.downgradeSummemietenettoElements failed!");
        }
    }

    @Test
    public void testRemoveMultipleEnergiepassElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            XmlUtils.xPathElementsProcess(
                    XmlUtils.xPath("/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben", doc, "io"),
                    doc, (parent) -> {
                        int childCount = xpathCount("io:energiepass", doc, parent);
                        Assert.assertEquals(
                                "2 <energiepass> elements for each <immobilie> before conversion.", 2, childCount);
                    });

            new OpenImmo_1_2_7().removeMultipleEnergiepassElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            XmlUtils.xPathElementsProcess(
                    XmlUtils.xPath("/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben", doc, "io"),
                    doc, (parent) -> {
                        int childCount = xpathCount("io:energiepass", doc, parent);
                        Assert.assertEquals(
                                "1 <energiepass> element for each <immobilie> after conversion.", 1, childCount);
                    });

        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_7.removeMultipleEnergiepassElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_7.removeMultipleEnergiepassElements failed!");
        }
    }

    @Test
    public void testRemoveObjektTextElements() {
        try {
            Document doc = buildTransferDocumentForDowngrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:freitexte/io:objekt_text", doc);
            Assert.assertEquals(
                    "6 <objekt_text> elements available before conversion.", 6, count);

            new OpenImmo_1_2_7().removeObjektTextElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:freitexte/io:objekt_text", doc);
            Assert.assertEquals(
                    "0 <objekt_text> elements available after conversion.", 0, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_7.removeObjektTextElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_7.removeObjektTextElements failed!");
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

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:user_defined_simplefield[@feldname='epass_waermewert']", doc);
            Assert.assertEquals(
                    "3 convertable <user_defined_simplefield feldname=\"epass_waermewert\"> elements available before conversion.", 3, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:user_defined_simplefield[@feldname='epass_stromwert']", doc);
            Assert.assertEquals(
                    "3 convertable <user_defined_simplefield feldname=\"epass_stromwert\"> elements available before conversion.", 3, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:user_defined_simplefield[@feldname='epass_wertklasse']", doc);
            Assert.assertEquals(
                    "3 convertable <user_defined_simplefield feldname=\"epass_wertklasse\"> elements available before conversion.", 3, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:user_defined_simplefield[@feldname='epass_baujahr']", doc);
            Assert.assertEquals(
                    "3 convertable <user_defined_simplefield feldname=\"epass_baujahr\"> elements available before conversion.", 3, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:user_defined_simplefield[@feldname='epass_ausstelldatum']", doc);
            Assert.assertEquals(
                    "3 convertable <user_defined_simplefield feldname=\"epass_ausstelldatum\"> elements available before conversion.", 3, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:user_defined_simplefield[@feldname='epass_jahrgang']", doc);
            Assert.assertEquals(
                    "3 convertable <user_defined_simplefield feldname=\"epass_jahrgang\"> elements available before conversion.", 3, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:user_defined_simplefield[@feldname='epass_gebaeudeart']", doc);
            Assert.assertEquals(
                    "3 convertable <user_defined_simplefield feldname=\"epass_gebaeudeart\"> elements available before conversion.", 3, count);

            new OpenImmo_1_2_7().upgradeEnergiepassElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:user_defined_simplefield[@feldname='epass_waermewert']", doc);
            Assert.assertEquals(
                    "0 convertable <user_defined_simplefield feldname=\"epass_waermewert\"> elements available after conversion.", 0, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:user_defined_simplefield[@feldname='epass_stromwert']", doc);
            Assert.assertEquals(
                    "0 convertable <user_defined_simplefield feldname=\"epass_stromwert\"> elements available after conversion.", 0, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:user_defined_simplefield[@feldname='epass_wertklasse']", doc);
            Assert.assertEquals(
                    "0 convertable <user_defined_simplefield feldname=\"epass_wertklasse\"> elements available after conversion.", 0, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:user_defined_simplefield[@feldname='epass_baujahr']", doc);
            Assert.assertEquals(
                    "0 convertable <user_defined_simplefield feldname=\"epass_baujahr\"> elements available after conversion.", 0, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:user_defined_simplefield[@feldname='epass_ausstelldatum']", doc);
            Assert.assertEquals(
                    "0 convertable <user_defined_simplefield feldname=\"epass_ausstelldatum\"> elements available after conversion.", 0, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:user_defined_simplefield[@feldname='epass_jahrgang']", doc);
            Assert.assertEquals(
                    "0 convertable <user_defined_simplefield feldname=\"epass_jahrgang\"> elements available after conversion.", 0, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:user_defined_simplefield[@feldname='epass_gebaeudeart']", doc);
            Assert.assertEquals(
                    "0 convertable <user_defined_simplefield feldname=\"epass_gebaeudeart\"> elements available after conversion.", 0, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:waermewert", doc);
            Assert.assertEquals(
                    "3 converted <waermewert> elements available after conversion.", 3, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:stromwert", doc);
            Assert.assertEquals(
                    "3 converted <stromwert> elements available after conversion.", 3, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:wertklasse", doc);
            Assert.assertEquals(
                    "3 converted <wertklasse> elements available after conversion.", 3, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:baujahr", doc);
            Assert.assertEquals(
                    "3 converted <baujahr> elements available after conversion.", 3, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:ausstelldatum", doc);
            Assert.assertEquals(
                    "3 converted <ausstelldatum> elements available after conversion.", 3, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:jahrgang", doc);
            Assert.assertEquals(
                    "3 converted <jahrgang> elements available after conversion.", 3, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:gebaeudeart", doc);
            Assert.assertEquals(
                    "3 converted <gebaeudeart> elements available after conversion.", 3, count);

        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_7.upgradeEnergiepassElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_7.upgradeEnergiepassElements failed!");
        }
    }

    @Test
    public void testUpgradeSummemietenettoElements() {
        try {
            Document doc = buildTransferDocumentForUpgrade();
            int count;

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:summemietenetto[@sonstigemieteust]", doc);
            Assert.assertEquals(
                    "2 convertable <summemietenetto> elements available before conversion.", 2, count);

            new OpenImmo_1_2_7().upgradeSummemietenettoElements(doc);

            //System.out.println( "----------------------------" );
            //System.out.println( "DOCUMENT AFTER CONVERSION:" );
            //DocumentUtils.write( doc, System.out );
            //System.out.println( "----------------------------" );

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:summemietenetto[@sonstigemieteust]", doc);
            Assert.assertEquals(
                    "0 old <summemietenetto> elements available after conversion.", 0, count);

            count = xpathCount(
                    "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:summemietenetto[@summemieteust]", doc);
            Assert.assertEquals(
                    "2 converted <summemietenetto> elements available after conversion.", 2, count);
        } catch (Exception ex) {
            LOGGER.error("Test of OpenImmo_1_2_7.upgradeSummemietenettoElements failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of OpenImmo_1_2_7.upgradeSummemietenettoElements failed!");
        }
    }

    private static int xpathCount(String xpath, Document doc) throws XPathExpressionException {
        return xpathCount(xpath, doc, doc);
    }

    private static int xpathCount(String xpath, Document doc, Object element) throws XPathExpressionException {
        return XmlUtils.xPathNumber(XmlUtils.xPath(
                "count(" + xpath + ")", doc, "io"), element).intValue();
    }
}