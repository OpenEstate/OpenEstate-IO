/*
 * Copyright 2015 OpenEstate.org.
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

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.openimmo.OpenImmoUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author Andreas Rudolph
 */
@RunWith( JUnit4.class )
public class OpenImmo_1_2_1Test
{
  private final static Logger LOGGER = LoggerFactory.getLogger( OpenImmo_1_2_1Test.class );

  private static Document buildTransferDocumentForDowngrade() throws Exception
  {
    return XmlUtils.newDocument(
      OpenImmo_1_2_1Test.class.getResourceAsStream( "/openimmo-1-2-1-downgrade.xml" ) );
  }

  private static Document buildTransferDocumentForUpgrade() throws Exception
  {
    return XmlUtils.newDocument(
      OpenImmo_1_2_1Test.class.getResourceAsStream( "/openimmo-1-2-1-upgrade.xml" ) );
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
        "/oi:openimmo/oi:anbieter/oi:immobilie/oi:zustand_angaben/oi:energiepass", doc );
      Assert.assertEquals(
        "2 <energiepass> elements available before conversion.", 2, count );

      count = XmlUtils.countNodes(
        "/oi:openimmo/oi:anbieter/oi:immobilie/oi:zustand_angaben/oi:energiepass/oi:mitwarmwasser", doc );
      Assert.assertEquals(
        "1 convertable <mitwarmwasser> element available before conversion.", 1, count );

      count = XmlUtils.countNodes(
        "/oi:openimmo/oi:anbieter/oi:immobilie/oi:zustand_angaben/oi:energiepass/oi:energieverbrauchkennwert", doc );
      Assert.assertEquals(
        "1 convertable <energieverbrauchkennwert> element available before conversion.", 1, count );

      count = XmlUtils.countNodes(
        "/oi:openimmo/oi:anbieter/oi:immobilie/oi:zustand_angaben/oi:energiepass/oi:endenergiebedarf", doc );
      Assert.assertEquals(
        "1 convertable <endenergiebedarf> element available before conversion.", 1, count );

      new OpenImmo_1_2_1().downgradeEnergiepassElements( doc );
      new OpenImmo_1_2_1().downgradeXmlNamespace( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );
      //DocumentUtils.printNodes( doc );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/oi:openimmo/oi:anbieter/oi:immobilie/oi:zustand_angaben/oi:energiepass", doc );
      Assert.assertEquals(
        "2 <energiepass> elements available after conversion.", 2, count );

      count = XmlUtils.countNodes(
        "/oi:openimmo/oi:anbieter/oi:immobilie/oi:zustand_angaben/oi:energiepass/oi:mitwarmwasser", doc );
      Assert.assertEquals(
        "0 convertable <mitwarmwasser> elements available before conversion.", 0, count );

      count = XmlUtils.countNodes(
        "/oi:openimmo/oi:anbieter/oi:immobilie/oi:zustand_angaben/oi:energiepass/oi:energieverbrauchkennwert", doc );
      Assert.assertEquals(
        "0 convertable <energieverbrauchkennwert> elements available before conversion.", 0, count );

      count = XmlUtils.countNodes(
        "/oi:openimmo/oi:anbieter/oi:immobilie/oi:zustand_angaben/oi:energiepass/oi:endenergiebedarf", doc );
      Assert.assertEquals(
        "0 convertable <endenergiebedarf> elements available before conversion.", 0, count );

      count = XmlUtils.countNodes(
        "/oi:openimmo/oi:anbieter/oi:immobilie/oi:zustand_angaben/oi:energiepass/oi:energiebedarf", doc );
      Assert.assertEquals(
        "1 converted <energiebedarf> element available before conversion.", 1, count );

      count = XmlUtils.countNodes(
        "/oi:openimmo/oi:anbieter/oi:immobilie/oi:zustand_angaben/oi:energiepass/oi:skala[@type='ZAHL']", doc );
      Assert.assertEquals(
        "2 converted <skala> elements available before conversion.", 2, count );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of OpenImmo_1_2_1.downgradeEnergiepassElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of OpenImmo_1_2_1.downgradeEnergiepassElements failed!" );
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
        "/oi:openimmo/oi:anbieter/oi:immobilie/oi:objektkategorie/oi:objektart/oi:haus[@haustyp='BUNGALOW']", doc );
      Assert.assertEquals(
        "1 convertable <haus> element available before conversion.", 1, count );

      new OpenImmo_1_2_1().downgradeHausElements( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/oi:openimmo/oi:anbieter/oi:immobilie/oi:objektkategorie/oi:objektart/oi:haus[@haustyp='BUNGALOW']", doc );
      Assert.assertEquals(
        "0 convertable <haus> elements available after conversion.", 0, count );

      count = XmlUtils.countNodes(
        "/oi:openimmo/oi:anbieter/oi:immobilie/oi:objektkategorie/oi:objektart/oi:haus", doc );
      Assert.assertEquals(
        "1 converted <haus> element available after conversion.", 1, count );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of OpenImmo_1_2_1.downgradeHausElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of OpenImmo_1_2_1.downgradeHausElements failed!" );
    }
  }

  @Test
  public void testDowngradeXmlNamespace()
  {
    try
    {
      Document doc = buildTransferDocumentForDowngrade();
      Element root;
      String ns;

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      root = XmlUtils.getRootElement( doc );
      ns = (root!=null)? StringUtils.trimToEmpty( root.getNamespaceURI() ): null;
      Assert.assertEquals(
        "XML namespace before conversion.", StringUtils.EMPTY, ns );

      new OpenImmo_1_2_1().downgradeXmlNamespace( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      root = XmlUtils.getRootElement( doc );
      ns = (root!=null)? StringUtils.trimToEmpty( root.getNamespaceURI() ): null;
      Assert.assertEquals(
        "XML namespace after conversion.", OpenImmoUtils.OLD_NAMESPACE, ns );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of OpenImmo_1_2_1.downgradeXmlNamespace failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of OpenImmo_1_2_1.downgradeXmlNamespace failed!" );
    }
  }

  @Test
  public void testRemoveObjektartZusatzElements()
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
        "/oi:openimmo/oi:anbieter/oi:immobilie/oi:objektkategorie/oi:objektart/oi:objektart_zusatz", doc );
      Assert.assertEquals(
        "2 convertable <objektart_zusatz> elements available before conversion.", 2, count );

      new OpenImmo_1_2_1().removeObjektartZusatzElements( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/oi:openimmo/oi:anbieter/oi:immobilie/oi:objektkategorie/oi:objektart/oi:objektart_zusatz", doc );
      Assert.assertEquals(
        "0 convertable <objektart_zusatz> elements available after conversion.", 0, count );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of OpenImmo_1_2_1.removeObjektartZusatzElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of OpenImmo_1_2_1.removeObjektartZusatzElements failed!" );
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
        "/oi:openimmo/oi:anbieter/oi:immobilie/oi:zustand_angaben/oi:energiepass/oi:skala", doc );
      Assert.assertEquals(
        "2 convertable <energiepass> elements available before conversion.", 2, count );

      new OpenImmo_1_2_1().upgradeEnergiepassElements( doc );
      new OpenImmo_1_2_1().upgradeXmlNamespace( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );
      //DocumentUtils.printNodes( doc );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/oi:openimmo/oi:anbieter/oi:immobilie/oi:zustand_angaben/oi:energiepass/oi:skala", doc );
      Assert.assertEquals(
        "0 convertable <energiepass> elements available after conversion.", 0, count );

      count = XmlUtils.countNodes(
        "/oi:openimmo/oi:anbieter/oi:immobilie/oi:zustand_angaben/oi:energiepass/oi:energieverbrauchkennwert | " +
        "/oi:openimmo/oi:anbieter/oi:immobilie/oi:zustand_angaben/oi:energiepass/oi:endenergiebedarf", doc );
      Assert.assertEquals(
        "2 converted <energiepass> elements available after conversion.", 2, count );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of OpenImmo_1_2_1.upgradeEnergiepassElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of OpenImmo_1_2_1.upgradeEnergiepassElements failed!" );
    }
  }

  @Test
  public void testUpgradeXmlNamespace()
  {
    try
    {
      Document doc = buildTransferDocumentForUpgrade();
      Element root;
      String ns;

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      root = XmlUtils.getRootElement( doc );
      ns = (root!=null)? StringUtils.trimToEmpty( root.getNamespaceURI() ): null;
      Assert.assertEquals(
        "XML namespace before conversion.", OpenImmoUtils.OLD_NAMESPACE, ns );

      new OpenImmo_1_2_1().upgradeXmlNamespace( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      root = XmlUtils.getRootElement( doc );
      ns = (root!=null)? StringUtils.trimToEmpty( root.getNamespaceURI() ): null;
      Assert.assertEquals(
        "XML namespace after conversion.", StringUtils.EMPTY, ns );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of OpenImmo_1_2_1.upgradeXmlNamespace failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of OpenImmo_1_2_1.upgradeXmlNamespace failed!" );
    }
  }
}