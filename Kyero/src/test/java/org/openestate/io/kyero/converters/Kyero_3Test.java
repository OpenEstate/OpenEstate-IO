/*
 * Copyright 2015-2017 OpenEstate.org.
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
package org.openestate.io.kyero.converters;

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
public class Kyero_3Test
{
  private final static Logger LOGGER = LoggerFactory.getLogger( Kyero_3Test.class );

  private static Document buildDocumentForDowngrade() throws Exception
  {
    return XmlUtils.newDocument(
      Kyero_3Test.class.getResourceAsStream( "/kyero-3-downgrade.xml" ) );
  }

  private static Document buildDocumentForUpgrade() throws Exception
  {
    return XmlUtils.newDocument(
      Kyero_3Test.class.getResourceAsStream( "/kyero-3-upgrade.xml" ) );
  }

  @Test
  public void testDowngradeNewBuildElements()
  {
    try
    {
      Document doc = buildDocumentForDowngrade();
      int count;

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:root/io:property/io:new_build", doc );
      Assert.assertEquals(
        "3 <new_build> elements available before conversion.", 3, count );

      count = XmlUtils.countNodes(
        "/io:root/io:property/io:price_freq[text()='sale']", doc );
      Assert.assertEquals(
        "2 <price_freq>sale</price_freq> elements available before conversion.", 2, count );

      count = XmlUtils.countNodes(
        "/io:root/io:property/io:price_freq[text()='new_build']", doc );
      Assert.assertEquals(
        "0 <price_freq>new_build</price_freq> elements available before conversion.", 0, count );

      new Kyero_3().downgradeNewBuildElements( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:root/io:property/io:new_build", doc );
      Assert.assertEquals(
        "0 <new_build> elements available after conversion.", 0, count );

      count = XmlUtils.countNodes(
        "/io:root/io:property/io:price_freq[text()='sale']", doc );
      Assert.assertEquals(
        "1 <price_freq>sale</price_freq> element available after conversion.", 1, count );

      count = XmlUtils.countNodes(
        "/io:root/io:property/io:price_freq[text()='new_build']", doc );
      Assert.assertEquals(
        "1 <price_freq>new_build</price_freq> element available after conversion.", 1, count );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of Kyero_3.downgradeNewBuildElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of Kyero_3.downgradeNewBuildElements failed!" );
    }
  }

  @Test
  public void testDowngradeTypeElements()
  {
    try
    {
      Document doc = buildDocumentForDowngrade();
      int count;

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:root/io:property/io:type", doc );
      Assert.assertEquals(
        "3 <type> elements available before conversion.", 3, count );

      count = XmlUtils.countNodes(
        "/io:root/io:property/io:type[not(*)]", doc );
      Assert.assertEquals(
        "3 <type> elements without children available before conversion.", 3, count );

      new Kyero_3().downgradeTypeElements( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:root/io:property/io:type[not(*)]", doc );
      Assert.assertEquals(
        "0 <type> elements without children available after conversion.", 0, count );

      count = XmlUtils.countNodes(
        "/io:root/io:property/io:type/io:en", doc );
      Assert.assertEquals(
        "3 converted <type> elements available after conversion.", 3, count );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of Kyero_3.downgradeTypeElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of Kyero_3.downgradeTypeElements failed!" );
    }
  }

  @Test
  public void testDowngradeUrlElements()
  {
    try
    {
      Document doc = buildDocumentForDowngrade();
      int count;

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:root/io:property/io:url[not(*)]", doc );
      Assert.assertEquals(
        "0 <url> elements without children available before conversion.", 0, count );

      count = XmlUtils.countNodes(
        "/io:root/io:property/io:url/*", doc );
      Assert.assertEquals(
        "6 children of <url> elements available before conversion.", 6, count );

      new Kyero_3().downgradeUrlElements( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:root/io:property/io:url[not(*)]", doc );
      Assert.assertEquals(
        "3 <url> elements without children available after conversion.", 3, count );

      count = XmlUtils.countNodes(
        "/io:root/io:property/io:url/*", doc );
      Assert.assertEquals(
        "0 children of <url> elements available after conversion.", 0, count );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of Kyero_3.downgradeUrlElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of Kyero_3.downgradeUrlElements failed!" );
    }
  }

  @Test
  public void testRemoveCustomElements()
  {
    try
    {
      Document doc = buildDocumentForUpgrade();
      int count;

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:root/io:property/io:custom  | " +
        "/io:root/io:agent/io:custom", doc );
      Assert.assertEquals(
        "6 <custom> elements available before conversion.", 6, count );

      new Kyero_3().removeCustomElements( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:root/io:property/io:custom  | " +
        "/io:root/io:agent/io:custom", doc );
      Assert.assertEquals(
        "0 <custom> elements available after conversion.", 0, count );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of Kyero_3.removeCustomElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of Kyero_3.removeCustomElements failed!" );
    }
  }

  @Test
  public void testRemoveEnergyRatingElements()
  {
    try
    {
      Document doc = buildDocumentForDowngrade();
      int count;

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:root/io:property/io:energy_rating", doc );
      Assert.assertEquals(
        "3 <energy_rating> elements available before conversion.", 3, count );

      new Kyero_3().removeEnergyRatingElements( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:root/io:property/io:energy_rating", doc );
      Assert.assertEquals(
        "0 <energy_rating> elements available after conversion.", 0, count );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of Kyero_3.removeEnergyRatingElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of Kyero_3.removeEnergyRatingElements failed!" );
    }
  }

  @Test
  public void testRemoveLocationElements()
  {
    try
    {
      Document doc = buildDocumentForDowngrade();
      int count;

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:root/io:property/io:location", doc );
      Assert.assertEquals(
        "3 <location> elements available before conversion.", 3, count );

      new Kyero_3().removeLocationElements( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:root/io:property/io:location", doc );
      Assert.assertEquals(
        "0 <location> elements available after conversion.", 0, count );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of Kyero_3.removeLocationElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of Kyero_3.removeLocationElements failed!" );
    }
  }

  @Test
  public void testRemoveNotesElements()
  {
    try
    {
      Document doc = buildDocumentForDowngrade();
      int count;

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:root/io:property/io:notes", doc );
      Assert.assertEquals(
        "3 <notes> elements available before conversion.", 3, count );

      new Kyero_3().removeNotesElements( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:root/io:property/io:notes", doc );
      Assert.assertEquals(
        "0 <notes> elements available after conversion.", 0, count );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of Kyero_3.removeNotesElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of Kyero_3.removeNotesElements failed!" );
    }
  }

  @Test
  public void testRemoveUnsupportedLanguageElements()
  {
    String[] unsupportedLanguages = new String[]{
      "ar", "bg", "ca", "cs", "da", "el", "et", "fa", "fi", "he", "hi", "hu",
      "id", "it", "ja", "ko", "lt", "lv", "no", "pl", "pt", "ro", "ru", "sk",
      "sl", "sv", "th", "tr", "uk", "vi", "zh",
    };
    try
    {
      Document doc = buildDocumentForDowngrade();
      int count;

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      for (String lang : unsupportedLanguages)
      {
        count = XmlUtils.countNodes(
          "/io:root/io:property/io:desc/io:"+lang+" | " +
          "/io:root/io:property/io:images/io:image/io:title/io:"+lang, doc );
        Assert.assertEquals(
          "2 translations in \"" + lang + "\" available before conversion.", 2, count );
      }

      new Kyero_3().removeUnsupportedLanguageElements( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      for (String lang : unsupportedLanguages)
      {
        count = XmlUtils.countNodes(
          "/io:root/io:property/io:desc/io:"+lang+" | " +
          "/io:root/io:property/io:images/io:image/io:title/io:"+lang, doc );
        Assert.assertEquals(
          "0 translations in \"" + lang + "\" available after conversion.", 0, count );
      }
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of Kyero_3.removeUnsupportedLanguageElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of Kyero_3.removeUnsupportedLanguageElements failed!" );
    }
  }

  @Test
  public void testUpgradeCurrencyElements()
  {
    try
    {
      Document doc = buildDocumentForUpgrade();
      int count;

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:root/io:property/io:currency", doc );
      Assert.assertEquals(
        "3 <currency> elements available before conversion.", 3, count );

      new Kyero_3().upgradeCurrencyElements( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:root/io:property/io:currency", doc );
      Assert.assertEquals(
        "1 <currency> element available after conversion.", 1, count );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of Kyero_3.upgradeCurrencyElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of Kyero_3.upgradeCurrencyElements failed!" );
    }
  }

  @Test
  public void testUpgradeNewBuildElements()
  {
    try
    {
      Document doc = buildDocumentForUpgrade();
      int count;

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:root/io:property/io:new_build", doc );
      Assert.assertEquals(
        "0 <new_build> elements available before conversion.", 0, count );

      count = XmlUtils.countNodes(
        "/io:root/io:property/io:price_freq[text()='sale']", doc );
      Assert.assertEquals(
        "1 <price_freq>sale</price_freq> elements available before conversion.", 1, count );

      new Kyero_3().upgradeNewBuildElements( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:root/io:property/io:new_build", doc );
      Assert.assertEquals(
        "1 <new_build> elements available after conversion.", 1, count );

      count = XmlUtils.countNodes(
        "/io:root/io:property/io:price_freq[text()='sale']", doc );
      Assert.assertEquals(
        "2 <price_freq>sale</price_freq> elements available before conversion.", 2, count );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of Kyero_3.upgradeNewBuildElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of Kyero_3.upgradeNewBuildElements failed!" );
    }
  }

  @Test
  public void testUpgradeTypeElements()
  {
    try
    {
      Document doc = buildDocumentForUpgrade();
      int count;

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:root/io:property/io:type[not(*)]", doc );
      Assert.assertEquals(
        "0 <type> elements without children available before conversion.", 0, count );

      new Kyero_3().upgradeTypeElements( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:root/io:property/io:type[not(*)]", doc );
      Assert.assertEquals(
        "3 <type> elements without children available after conversion.", 3, count );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of Kyero_3.upgradeTypeElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of Kyero_3.upgradeTypeElements failed!" );
    }
  }

  @Test
  public void testUpgradeUrlElements()
  {
    try
    {
      Document doc = buildDocumentForUpgrade();
      int count;

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT BEFORE CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:root/io:property/io:url[not(*)]", doc );
      Assert.assertEquals(
        "3 <url> elements without children available before conversion.", 3, count );

      new Kyero_3().upgradeUrlElements( doc );

      //System.out.println( "----------------------------" );
      //System.out.println( "DOCUMENT AFTER CONVERSION:" );
      //DocumentUtils.write( doc, System.out );
      //System.out.println( "----------------------------" );

      count = XmlUtils.countNodes(
        "/io:root/io:property/io:url[not(*)]", doc );
      Assert.assertEquals(
        "0 <url> elements without children available after conversion.", 0, count );

      count = XmlUtils.countNodes(
        "/io:root/io:property/io:url/io:en", doc );
      Assert.assertEquals(
        "2 conveted <url> elements available after conversion.", 2, count );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of Kyero_3.upgradeUrlElements failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of Kyero_3.upgradeUrlElements failed!" );
    }
  }
}