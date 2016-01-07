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
package org.openestate.io.trovit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.trovit.xml.Ad;
import org.openestate.io.trovit.xml.Trovit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

/**
 *
 * @author Andreas Rudolph
 */
@RunWith( JUnit4.class )
public class TrovitDocumentTest
{
  private final static Logger LOGGER = LoggerFactory.getLogger(TrovitDocumentTest.class );

  private static Document buildExampleDocument() throws Exception
  {
    return XmlUtils.newDocument( "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
      + "<trovit>\n"
      + "  <ad>\n"
      + "    <id><![CDATA[...]]></id>\n"
      + "    <url><![CDATA[...]]></url>\n"
      + "    <title><![CDATA[...]]></title>\n"
      + "    <type><![CDATA[...]]></type>\n"
      + "    <agency><![CDATA[...]]></agency>\n"
      + "    <content><![CDATA[...]]></content>\n"
      + "    <price><![CDATA[...]]></price>\n"
      + "    <property_type><![CDATA[...]]></property_type>\n"
      + "    <floor_area unit=\"feet\"><![CDATA[...]]></floor_area>\n"
      + "    <rooms><![CDATA[...]]></rooms>\n"
      + "    <bathrooms><![CDATA[...]]></bathrooms>\n"
      + "    <parking><![CDATA[...]]></parking>\n"
      + "    <address><![CDATA[...]]></address>\n"
      + "    <city><![CDATA[...]]></city>\n"
      + "    <city_area><![CDATA[...]]></city_area>\n"
      + "    <postcode><![CDATA[...]]></postcode>\n"
      + "    <region><![CDATA[...]]></region>\n"
      + "    <latitude><![CDATA[...]]></latitude>\n"
      + "    <longitude><![CDATA[...]]></longitude>\n"
      + "    <pictures>\n"
      + "      <picture>\n"
      + "        <picture_url><![CDATA[...]]></picture_url>\n"
      + "        <picture_title><![CDATA[...]]></picture_title>\n"
      + "      </picture>\n"
      + "      <picture>\n"
      + "        <picture_url><![CDATA[...]]></picture_url>\n"
      + "        <picture_title><![CDATA[...]]></picture_title>\n"
      + "      </picture>\n"
      + "    </pictures>\n"
      + "    <virtual_tour><![CDATA[...]]></virtual_tour>\n"
      + "    <date><![CDATA[...]]></date>\n"
      + "    <time><![CDATA[...]]></time>\n"
      + "    <expiration_date><![CDATA[...]]></expiration_date>\n"
      + "    <plot_area><![CDATA[...]]></plot_area>\n"
      + "    <floor_number><![CDATA[...]]></floor_number>\n"
      + "    <orientation><![CDATA[...]]></orientation>\n"
      + "    <foreclosure><![CDATA[...]]></foreclosure>\n"
      + "    <is_furnished><![CDATA[...]]></is_furnished>\n"
      + "    <is_new><![CDATA[...]]></is_new>\n"
      + "    <condition><![CDATA[...]]></condition>\n"
      + "    <year><![CDATA[...]]></year>\n"
      + "  </ad>\n"
      + "</trovit>" );
  }

  @Test
  public void testToObject()
  {
    try
    {
      TrovitDocument doc = new TrovitDocument( buildExampleDocument() );

      Trovit obj = doc.toObject();
      Assert.assertNotNull(
        "Created object for transfer document.", obj );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of TrovitDocument.toObject failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of TrovitDocument.toObject failed!" );
    }
  }

  @Test
  @Ignore
  public void testToXml()
  {
    Ad ad = TrovitUtils.getFactory().createAd();
    ad.setTitle( "an example property" );
    ad.setCity( "Berlin" );

    Trovit trovit = TrovitUtils.getFactory().createTrovit();
    trovit.getAd().add( ad );

    try
    {
      TrovitDocument doc = TrovitDocument.newDocument( trovit );

      String xml = doc.toXmlString( true );
      LOGGER.info( "XML: " + xml );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of TrovitDocument.toXml failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of TrovitDocument.toXml failed!" );
    }
  }
}