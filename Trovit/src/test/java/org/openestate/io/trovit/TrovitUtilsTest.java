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
package org.openestate.io.trovit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Andreas Rudolph
 */
@RunWith(JUnit4.class)
public class TrovitUtilsTest {
    private final static Logger LOGGER = LoggerFactory.getLogger(TrovitUtilsTest.class);

    @Test
    public void testCreateDocument() {
        String transferXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
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
                + "</trovit>";

        TrovitDocument doc;
        try {
            doc = TrovitUtils.createDocument(transferXml);
            Assert.assertNotNull(
                    "Transfer was processed.", doc);
            Assert.assertTrue("Transfer was processed as TransferDocument.", doc instanceof TrovitDocument);
        } catch (Exception ex) {
            LOGGER.error("Test of TrovitUtils.createDocument failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of TrovitUtils.createDocument failed!");
        }
    }

    @Test
    public void testGetContext() {
        try {
            Assert.assertNotNull(
                    "JAXB context must be creatable.", TrovitUtils.getContext());
        } catch (Exception ex) {
            LOGGER.error("Test of TrovitUtils.getContext failed!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            Assert.fail("Test of TrovitUtils.getContext failed!");
        }
    }
}