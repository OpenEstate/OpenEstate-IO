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

package org.openestate.io.immoxml;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.immoxml.xml.Immoxml;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

/**
 *
 * @author Andreas Rudolph
 */
@RunWith( JUnit4.class )
public class ImmoXmlDocumentTest
{
  private final static Logger LOGGER = LoggerFactory.getLogger(ImmoXmlDocumentTest.class );

  private static Document buildExampleDocument( String version ) throws Exception
  {
    return XmlUtils.newDocument("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
      + "<immoxml xmlns=\"" + ImmoXmlUtils.NAMESPACE + "\">\n"
      + "  <uebertragung version=\"" + ImmoXmlUtils.VERSION.toReadableVersion() + "\" "
      + "                sendersoftware=\"OpenEstate.org\" "
      + "                techn_email=\"test@openestate.org\" "
      + "                umfang=\"VOLL\" art=\"OFFLINE\"/>\n"
      + "  <anbieter>\n"
      + "  </anbieter>\n"
      + "</immoxml>" );
  }

  @Test
  public void testDowngrade()
  {
    try
    {
      String version = ImmoXmlUtils.VERSION.toReadableVersion();
      ImmoXmlDocument doc = new ImmoXmlDocument( buildExampleDocument( version ) );

      doc.downgrade(ImmoXmlVersion.V1_1 );
      Assert.assertEquals("downgrade from "+version+" to 1.1", ImmoXmlVersion.V1_1, doc.getDocumentVersion() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of ImmoXmlDocument.downgrade failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of ImmoXmlDocument.downgrade failed!" );
    }
  }

  /*@Test
  public void testGetDocumentVersion()
  {
    ImmoXmlDocument doc;
    try
    {
      doc = new ImmoXmlDocument( buildExampleDocument( "1.2.7" ) );
      Assert.assertEquals(
        "1.2.7", ImmoXMLVersion.V1_2_7, doc.getDocumentVersion() );

      doc = new ImmoXmlDocument( buildExampleDocument( "1.2.6/AT1.0" ) );
      Assert.assertEquals(
        "1.2.6/AT1.0", ImmoXMLVersion.V1_2_6, doc.getDocumentVersion() );

      doc = new ImmoXmlDocument( buildExampleDocument( "1.2.0" ) );
      Assert.assertEquals(
        "1.2.0", ImmoXMLVersion.V1_2_0, doc.getDocumentVersion() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of ImmoXmlDocument.getDocumentVersion failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of ImmoXmlDocument.getDocumentVersion failed!" );
    }
  }*/

  /*@Test
  public void testSetDocumentVersion()
  {
    try
    {
      ImmoXmlDocument doc = new ImmoXmlDocument( buildExampleDocument( "1.2.7" ) );
      Assert.assertEquals(
        "1.2.7", ImmoXMLVersion.V1_2_7, doc.getDocumentVersion() );

      doc.setDocumentVersion( ImmoXMLVersion.V1_2_6 );
      Assert.assertEquals(
        "1.2.6/AT1.0", ImmoXMLVersion.V1_2_6, doc.getDocumentVersion() );

      doc.setDocumentVersion( ImmoXMLVersion.V1_2_0 );
      Assert.assertEquals(
        "1.2.0", ImmoXMLVersion.V1_2_0, doc.getDocumentVersion() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of ImmoXmlDocument.setDocumentVersion failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of ImmoXmlDocument.setDocumentVersion failed!" );
    }
  }*/

  @Test
  public void testToObject()
  {
    try
    {
      String version = ImmoXmlUtils.VERSION.toReadableVersion();

      ImmoXmlDocument doc = new ImmoXmlDocument( buildExampleDocument( version ) );
      Assert.assertEquals(version, ImmoXmlUtils.VERSION, doc.getDocumentVersion() );

      Immoxml obj = doc.toObject();
      Assert.assertNotNull(
        "Created object for transfer document.", obj );
      Assert.assertEquals(
        "Matching version between document and object.", doc.getDocumentVersion().toReadableVersion(), obj.getUebertragung().getVersion() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of ImmoXmlDocument.toObject failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of ImmoXmlDocument.toObject failed!" );
    }
  }

  @Test
  public void testUpgrade()
  {
    try
    {
      String version = ImmoXmlUtils.VERSION.toReadableVersion();
      ImmoXmlDocument doc = new ImmoXmlDocument( buildExampleDocument( "1.1" ) );

      doc.upgrade( ImmoXmlUtils.VERSION );
      Assert.assertEquals("upgrade from 1.1 to "+version, ImmoXmlUtils.VERSION, doc.getDocumentVersion() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of ImmoXmlDocument.upgrade failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of ImmoXmlDocument.upgrade failed!" );
    }
  }
}