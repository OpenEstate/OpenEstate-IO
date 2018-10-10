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
package org.openestate.io.kyero;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.kyero.xml.Root;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

/**
 *
 * @author Andreas Rudolph
 */
@RunWith( JUnit4.class )
public class KyeroDocumentTest
{
  private final static Logger LOGGER = LoggerFactory.getLogger(KyeroDocumentTest.class );

  private static Document buildExampleDocument( String version ) throws Exception
  {
    return XmlUtils.newDocument("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
      + "<root xmlns=\"" + KyeroUtils.NAMESPACE + "\">\n"
      + "  <kyero>\n"
      + "    <feed_version>" + version + "</feed_version>\n"
      + "  </kyero>\n"
      + "  <property>\n"
      + "  </property>\n"
      + "</root>" );
  }

  @Test
  public void testDowngrade()
  {
    try
    {
      KyeroDocument doc = new KyeroDocument( buildExampleDocument( KyeroUtils.VERSION.toXmlVersion() ) );

      doc.downgrade( KyeroVersion.V2_1 );
      Assert.assertEquals( "downgrade from "+KyeroUtils.VERSION.toReadableVersion()+" to 2.1", KyeroVersion.V2_1, doc.getDocumentVersion() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of KyeroDocument.downgrade failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of KyeroDocument.downgrade failed!" );
    }
  }

  @Test
  public void testGetDocumentVersion()
  {
    KyeroDocument doc;
    try
    {
      doc = new KyeroDocument( buildExampleDocument( "" ) );
      Assert.assertEquals(
        "no version", null, doc.getDocumentVersion() );

      doc = new KyeroDocument( buildExampleDocument( "3" ) );
      Assert.assertEquals(
        "3", KyeroVersion.V3, doc.getDocumentVersion() );

      doc = new KyeroDocument( buildExampleDocument( "3.1" ) );
      Assert.assertEquals(
        "3", KyeroVersion.V3, doc.getDocumentVersion() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of KyeroDocument.getDocumentVersion failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of KyeroDocument.getDocumentVersion failed!" );
    }
  }

  @Test
  public void testSetDocumentVersion()
  {
    KyeroDocument doc;
    try
    {
      doc = new KyeroDocument( buildExampleDocument( "" ) );
      Assert.assertEquals(
        "no version", null, doc.getDocumentVersion() );

      doc.setDocumentVersion( KyeroVersion.V3 );
      Assert.assertEquals(
        "version 3", KyeroVersion.V3, doc.getDocumentVersion() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of KyeroDocument.setDocumentVersion failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of KyeroDocument.setDocumentVersion failed!" );
    }
  }

  @Test
  public void testToObject()
  {
    try
    {
      String version = KyeroUtils.VERSION.toXmlVersion();

      KyeroDocument doc = new KyeroDocument( buildExampleDocument( version ) );
      Assert.assertEquals(version, KyeroUtils.VERSION, doc.getDocumentVersion() );

      Root obj = doc.toObject();
      Assert.assertNotNull(
        "Created object for transfer document.", obj );
      Assert.assertEquals(
        "Matching version between document and object.", doc.getDocumentVersion().toXmlVersion(), obj.getKyero().getFeedVersion() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of KyeroDocument.toObject failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of KyeroDocument.toObject failed!" );
    }
  }

  @Test
  public void testUpgrade()
  {
    try
    {
      KyeroDocument doc = new KyeroDocument( buildExampleDocument( KyeroVersion.V2_1.toXmlVersion() ) );
      doc.upgrade( KyeroUtils.VERSION );
      Assert.assertEquals("upgrade from 2.1 to "+KyeroUtils.VERSION.toReadableVersion(), KyeroUtils.VERSION, doc.getDocumentVersion() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of KyeroDocument.upgrade failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of KyeroDocument.upgrade failed!" );
    }
  }
}