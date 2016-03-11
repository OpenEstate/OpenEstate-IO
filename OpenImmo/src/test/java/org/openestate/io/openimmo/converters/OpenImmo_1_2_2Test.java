/*
 * Copyright 2015-2016 OpenEstate.org.
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
 *
 * @author Andreas Rudolph
 */
@RunWith( JUnit4.class )
public class OpenImmo_1_2_2Test
{
  private final static Logger LOGGER = LoggerFactory.getLogger( OpenImmo_1_2_2Test.class );

  private static Document buildTransferDocumentForDowngrade() throws Exception
  {
    return XmlUtils.newDocument(
      OpenImmo_1_2_2Test.class.getResourceAsStream( "/openimmo-1-2-2-downgrade.xml" ) );
  }

  private static Document buildTransferDocumentForUpgrade() throws Exception
  {
    return XmlUtils.newDocument(
      OpenImmo_1_2_2Test.class.getResourceAsStream( "/openimmo-1-2-2-upgrade.xml" ) );
  }

  @Test
  public void testDowngradeBefeuerungElements()
  {
    try
    {
      Document doc = buildTransferDocumentForDowngrade();
      int count;

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:befeuerung[@LUFTWP]", doc );
      Assert.assertEquals(
        "3 convertable <befeuerung> elements available before conversion.", 3, count );

      new OpenImmo_1_2_2().downgradeBefeuerungElements( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:befeuerung[@LUFTWP]", doc );
      Assert.assertEquals(
        "0 convertable <befeuerung> elements available after conversion.", 0, count );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of OpenImmo_1_2_2.downgradeBefeuerungElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of OpenImmo_1_2_2.downgradeBefeuerungElements failed!" );
    }
  }

  @Test
  public void testDowngradeBodenElements()
  {
    try
    {
      Document doc = buildTransferDocumentForDowngrade();
      int count;

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:boden[@FERTIGPARKETT or @LAMINAT or @LINOLEUM]", doc );
      Assert.assertEquals(
        "3 convertable <boden> elements available before conversion.", 3, count );

      new OpenImmo_1_2_2().downgradeBodenElements( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:boden[@FERTIGPARKETT or @LAMINAT or @LINOLEUM]", doc );
      Assert.assertEquals(
        "0 convertable <boden> elements available after conversion.", 0, count );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of OpenImmo_1_2_2.downgradeBodenElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of OpenImmo_1_2_2.downgradeBodenElements failed!" );
    }
  }

  @Test
  public void testDowngradeBueroPraxenElements()
  {
    try
    {
      Document doc = buildTransferDocumentForDowngrade();
      int count;

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:buero_praxen[@buero_typ='BUEROZENTRUM' or @buero_typ='LOFT_ATELIER' or @buero_typ='PRAXISFLAECHE' or @buero_typ='PRAXISHAUS']", doc );
      Assert.assertEquals(
        "4 convertable <buero_praxen> elements available before conversion.", 4, count );

      new OpenImmo_1_2_2().downgradeBueroPraxenElements( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:buero_praxen[@buero_typ='BUEROZENTRUM' or @buero_typ='LOFT_ATELIER' or @buero_typ='PRAXISFLAECHE' or @buero_typ='PRAXISHAUS']", doc );
      Assert.assertEquals(
        "0 convertable <buero_praxen> elements available after conversion.", 0, count );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:buero_praxen[@buero_typ='BUEROFLAECHE']", doc );
      Assert.assertEquals(
        "4 converted <buero_praxen> elements available after conversion.", 4, count );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of OpenImmo_1_2_2.downgradeBueroPraxenElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of OpenImmo_1_2_2.downgradeBueroPraxenElements failed!" );
    }
  }

  @Test
  public void testDowngradeEinzelhandelElements()
  {
    try
    {
      Document doc = buildTransferDocumentForDowngrade();
      int count;

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:einzelhandel[@handel_typ='KAUFHAUS' or @handel_typ='FACTORY_OUTLET' or @handel_typ='KIOSK' or @handel_typ='VERKAUFSFLAECHE' or @handel_typ='AUSSTELLUNGSFLAECHE']", doc );
      Assert.assertEquals(
        "5 convertable <einzelhandel> elements available before conversion.", 5, count );

      new OpenImmo_1_2_2().downgradeEinzelhandelElements( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:einzelhandel[@handel_typ='KAUFHAUS' or @handel_typ='FACTORY_OUTLET' or @handel_typ='KIOSK' or @handel_typ='VERKAUFSFLAECHE' or @handel_typ='AUSSTELLUNGSFLAECHE']", doc );
      Assert.assertEquals(
        "0 convertable <einzelhandel> elements available after conversion.", 0, count );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:einzelhandel", doc );
      Assert.assertEquals(
        "5 converted <einzelhandel> elements available after conversion.", 5, count );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of OpenImmo_1_2_2.downgradeEinzelhandelElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of OpenImmo_1_2_2.downgradeEinzelhandelElements failed!" );
    }
  }

  @Test
  public void testDowngradeEnergiepassElements()
  {
    try
    {
      Document doc = buildTransferDocumentForDowngrade();
      int count;

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:epart", doc );
      Assert.assertEquals(
        "3 convertable <epart> elements available before conversion.", 3, count );

      new OpenImmo_1_2_2().downgradeEnergiepassElements( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:epart", doc );
      Assert.assertEquals(
        "0 convertable <epart> elements available after conversion.", 0, count );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:art", doc );
      Assert.assertEquals(
        "3 converted <art> elements available after conversion.", 3, count );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of OpenImmo_1_2_2.downgradeEnergiepassElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of OpenImmo_1_2_2.downgradeEnergiepassElements failed!" );
    }
  }

  @Test
  public void testDowngradeFreizeitimmobilieGewerblichElements()
  {
    try
    {
      Document doc = buildTransferDocumentForDowngrade();
      int count;

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:freizeitimmobilie_gewerblich[@freizeit_typ='FREIZEITANLAGE']", doc );
      Assert.assertEquals(
        "1 convertable <freizeitimmobilie_gewerblich> element available before conversion.", 1, count );

      new OpenImmo_1_2_2().downgradeFreizeitimmobilieGewerblichElements( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:freizeitimmobilie_gewerblich[@freizeit_typ='FREIZEITANLAGE']", doc );
      Assert.assertEquals(
        "0 convertable <freizeitimmobilie_gewerblich> elements available after conversion.", 0, count );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:freizeitimmobilie_gewerblich", doc );
      Assert.assertEquals(
        "1 converted <freizeitimmobilie_gewerblich> element available after conversion.", 1, count );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of OpenImmo_1_2_2.downgradeFreizeitimmobilieGewerblichElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of OpenImmo_1_2_2.downgradeFreizeitimmobilieGewerblichElements failed!" );
    }
  }

  @Test
  public void testDowngradeGastgewerbeElements()
  {
    try
    {
      Document doc = buildTransferDocumentForDowngrade();
      int count;

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:gastgewerbe[@gastgew_typ='BAR' or @gastgew_typ='CAFE' or @gastgew_typ='DISCOTHEK' or @gastgew_typ='RESTAURANT' or @gastgew_typ='RAUCHERLOKAL' or @gastgew_typ='EINRAUMLOKAL']", doc );
      Assert.assertEquals(
        "6 convertable <gastgewerbe> elements available before conversion.", 6, count );

      new OpenImmo_1_2_2().downgradeGastgewerbeElements( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:gastgewerbe[@gastgew_typ='BAR' or @gastgew_typ='CAFE' or @gastgew_typ='DISCOTHEK' or @gastgew_typ='RESTAURANT' or @gastgew_typ='RAUCHERLOKAL' or @gastgew_typ='EINRAUMLOKAL']", doc );
      Assert.assertEquals(
        "0 convertable <gastgewerbe> elements available after conversion.", 0, count );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:gastgewerbe", doc );
      Assert.assertEquals(
        "6 converted <gastgewerbe> elements available after conversion.", 6, count );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of OpenImmo_1_2_2.downgradeGastgewerbeElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of OpenImmo_1_2_2.downgradeGastgewerbeElements failed!" );
    }
  }

  @Test
  public void testDowngradeGrundstueckElements()
  {
    try
    {
      Document doc = buildTransferDocumentForDowngrade();
      int count;

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:grundstueck[@grundst_typ='GEWERBEPARK']", doc );
      Assert.assertEquals(
        "1 convertable <grundstueck> element available before conversion.", 1, count );

      new OpenImmo_1_2_2().downgradeGrundstueckElements( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:grundstueck[@grundst_typ='GEWERBEPARK']", doc );
      Assert.assertEquals(
        "0 convertable <grundstueck> elements available after conversion.", 0, count );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:grundstueck", doc );
      Assert.assertEquals(
        "1 converted <grundstueck> elements available after conversion.", 1, count );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of OpenImmo_1_2_2.downgradeGrundstueckElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of OpenImmo_1_2_2.downgradeGrundstueckElements failed!" );
    }
  }

  @Test
  public void testDowngradeHallenLagerProdElements()
  {
    try
    {
      Document doc = buildTransferDocumentForDowngrade();
      int count;

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:hallen_lager_prod[@hallen_typ='INDUSTRIEHALLE' or @hallen_typ='LAGERFLAECHEN' or @hallen_typ='LAGER_MIT_FREIFLAECHE' or @hallen_typ='SPEDITIONSLAGER' or @hallen_typ='KUEHLHAUS']", doc );
      Assert.assertEquals(
        "5 convertable <hallen_lager_prod> elements available before conversion.", 5, count );

      new OpenImmo_1_2_2().downgradeHallenLagerProdElements( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:hallen_lager_prod[@hallen_typ='INDUSTRIEHALLE' or @hallen_typ='LAGERFLAECHEN' or @hallen_typ='LAGER_MIT_FREIFLAECHE' or @hallen_typ='SPEDITIONSLAGER' or @hallen_typ='KUEHLHAUS']", doc );
      Assert.assertEquals(
        "0 convertable <hallen_lager_prod> elements available after conversion.", 0, count );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:hallen_lager_prod[@hallen_typ='HALLE' or @hallen_typ='LAGER']", doc );
      Assert.assertEquals(
        "4 converted <hallen_lager_prod> elements available after conversion.", 4, count );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of OpenImmo_1_2_2.downgradeHallenLagerProdElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of OpenImmo_1_2_2.downgradeHallenLagerProdElements failed!" );
    }
  }

  @Test
  public void testDowngradeHausElements()
  {
    try
    {
      Document doc = buildTransferDocumentForDowngrade();
      int count;

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:haus[@haustyp='KEINE_ANGABE']", doc );
      Assert.assertEquals(
        "1 convertable <haus> element available before conversion.", 1, count );

      new OpenImmo_1_2_2().downgradeHausElements( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:haus[@haustyp='KEINE_ANGABE']", doc );
      Assert.assertEquals(
        "0 convertable <haus> elements available after conversion.", 0, count );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:haus", doc );
      Assert.assertEquals(
        "1 converted <haus> element available after conversion.", 1, count );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of OpenImmo_1_2_2.downgradeHausElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of OpenImmo_1_2_2.downgradeHausElements failed!" );
    }
  }

  @Test
  public void testDowngradeLandUndForstwirtschaftElements()
  {
    try
    {
      Document doc = buildTransferDocumentForDowngrade();
      int count;

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:land_und_forstwirtschaft[@land_typ='ANWESEN']", doc );
      Assert.assertEquals(
        "1 convertable <land_und_forstwirtschaft> element available before conversion.", 1, count );

      new OpenImmo_1_2_2().downgradeLandUndForstwirtschaftElements( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:land_und_forstwirtschaft[@land_typ='ANWESEN']", doc );
      Assert.assertEquals(
        "0 convertable <land_und_forstwirtschaft> elements available after conversion.", 0, count );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:land_und_forstwirtschaft[@land_typ='SONSTIGE_LANDWIRTSCHAFTSIMMOBILIEN']", doc );
      Assert.assertEquals(
        "1 converted <land_und_forstwirtschaft> element available after conversion.", 1, count );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of OpenImmo_1_2_2.downgradeLandUndForstwirtschaftElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of OpenImmo_1_2_2.downgradeLandUndForstwirtschaftElements failed!" );
    }
  }

  @Test
  public void testDowngradeObjektartElements()
  {
    try
    {
      Document doc = buildTransferDocumentForDowngrade();
      int count;

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie[@class='multicat']/io:objektkategorie/io:objektart/*", doc );
      Assert.assertEquals(
        "5 convertable children of the <objektart> element available before conversion.", 5, count );

      new OpenImmo_1_2_2().downgradeObjektartElements( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie[@class='multicat']/io:objektkategorie/io:objektart/*", doc );
      Assert.assertEquals(
        "3 converted children of the <objektart> element available after conversion.", 3, count );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of OpenImmo_1_2_2.downgradeObjektartElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of OpenImmo_1_2_2.downgradeObjektartElements failed!" );
    }
  }

  @Test
  public void testDowngradeUebertragungElements()
  {
    try
    {
      Document doc = buildTransferDocumentForDowngrade();
      int count;

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:uebertragung[@timestamp]", doc );
      Assert.assertEquals(
        "1 convertable <uebertragung> element available before conversion.", 1, count );

      new OpenImmo_1_2_2().downgradeUebertragungElements( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:uebertragung[@timestamp]", doc );
      Assert.assertEquals(
        "0 convertable <uebertragung> elements available after conversion.", 0, count );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of OpenImmo_1_2_2.downgradeUebertragungElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of OpenImmo_1_2_2.downgradeUebertragungElements failed!" );
    }
  }

  @Test
  public void testDowngradeWohnungElements()
  {
    try
    {
      Document doc = buildTransferDocumentForDowngrade();
      int count;

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:wohnung[@wohnungtyp='KEINE_ANGABE']", doc );
      Assert.assertEquals(
        "1 convertable <wohnung> element available before conversion.", 1, count );

      new OpenImmo_1_2_2().downgradeWohnungElements( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:wohnung[@wohnungtyp='KEINE_ANGABE']", doc );
      Assert.assertEquals(
        "0 convertable <wohnung> elements available after conversion.", 0, count );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:wohnung", doc );
      Assert.assertEquals(
        "1 converted <wohnung> element available after conversion.", 1, count );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of OpenImmo_1_2_2.downgradeWohnungElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of OpenImmo_1_2_2.downgradeWohnungElements failed!" );
    }
  }

  @Test
  public void testRemoveAusstattungChildElements()
  {
    String[] elements = new String[]{
      "ausstatt_kategorie", "dachform", "bauweise", "ausbaustufe"
    };
    try
    {
      Document doc = buildTransferDocumentForDowngrade();
      int count;

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      for (String element : elements)
      {
        count = XmlUtils.countNodes(
          "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:" + element, doc );
        Assert.assertEquals(
          "1 convertable <"+element+"> element available before conversion.", 1, count );
      }

      new OpenImmo_1_2_2().removeAusstattungChildElements( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      for (String element : elements)
      {
        count = XmlUtils.countNodes(
          "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:" + element, doc );
        Assert.assertEquals(
          "0 convertable <"+element+"> elements available after conversion.", 0, count );
      }
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of OpenImmo_1_2_2.removeAusstattungChildElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of OpenImmo_1_2_2.removeAusstattungChildElements failed!" );
    }
  }

  @Test
  public void testRemoveProvisionspflichtigElements()
  {
    try
    {
      Document doc = buildTransferDocumentForDowngrade();
      int count;

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:provisionspflichtig", doc );
      Assert.assertEquals(
        "1 convertable <provisionspflichtig> element available before conversion.", 1, count );

      new OpenImmo_1_2_2().removeProvisionspflichtigElements( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:provisionspflichtig", doc );
      Assert.assertEquals(
        "0 convertable <provisionspflichtig> elements available after conversion.", 0, count );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of OpenImmo_1_2_2.removeProvisionspflichtigElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of OpenImmo_1_2_2.removeProvisionspflichtigElements failed!" );
    }
  }

  @Test
  public void testRemoveVersteigerungElements()
  {
    try
    {
      Document doc = buildTransferDocumentForDowngrade();
      int count;

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:versteigerung", doc );
      Assert.assertEquals(
        "1 convertable <versteigerung> element available before conversion.", 1, count );

      new OpenImmo_1_2_2().removeVersteigerungElements( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:versteigerung", doc );
      Assert.assertEquals(
        "0 convertable <versteigerung> elements available after conversion.", 0, count );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of OpenImmo_1_2_2.removeVersteigerungElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of OpenImmo_1_2_2.removeVersteigerungElements failed!" );
    }
  }

  @Test
  public void testUpgradeEnergiepassElements()
  {
    try
    {
      Document doc = buildTransferDocumentForUpgrade();
      int count;

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:art", doc );
      Assert.assertEquals(
        "3 convertable <art> elements available before conversion.", 3, count );

      new OpenImmo_1_2_2().upgradeEnergiepassElements( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:art", doc );
      Assert.assertEquals(
        "0 convertable <art> elements available after conversion.", 0, count );

      count = XmlUtils.countNodes(
        "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:energiepass/io:epart", doc );
      Assert.assertEquals(
        "3 converted <epart> elements available after conversion.", 3, count );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of OpenImmo_1_2_2.upgradeEnergiepassElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of OpenImmo_1_2_2.upgradeEnergiepassElements failed!" );
    }
  }
}