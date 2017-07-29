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
package org.openestate.io.openimmo;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringEscapeUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.openimmo.xml.Openimmo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

/**
 *
 * @author Andreas Rudolph
 */
@RunWith( JUnit4.class )
public class OpenImmoTransferDocumentTest
{
  private final static Logger LOGGER = LoggerFactory.getLogger(OpenImmoTransferDocumentTest.class );

  private static Document buildExampleDocument( String version ) throws Exception
  {
    String xmlns = ("1.2.0".equals( version ) || "1.1".equals( version ))?
      " xmlns=\"" + OpenImmoUtils.OLD_NAMESPACE + "\"": StringUtils.EMPTY;
    return XmlUtils.newDocument(
      "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
      + "<openimmo"+xmlns+">\n"
      + "  <uebertragung version=\"" + StringEscapeUtils.escapeXml10( version ) + "\" "
      + "                sendersoftware=\"OpenEstate.org\" "
      + "                senderversion=\"1.0\" "
      + "                techn_email=\"test@openestate.org\" "
      + "                modus=\"NEW\" umfang=\"VOLL\" art=\"OFFLINE\"/>\n"
      + "  <anbieter>\n"
      + "  </anbieter>\n"
      + "</openimmo>" );
  }

  @Test
  public void testDowngrade()
  {
    try
    {
      String version = OpenImmoUtils.VERSION.toReadableVersion();
      OpenImmoTransferDocument doc = new OpenImmoTransferDocument( buildExampleDocument( version ) );

      doc.downgrade( OpenImmoVersion.V1_1 );
      Assert.assertEquals(
        "downgrade from "+version+" to 1.1", OpenImmoVersion.V1_1, doc.getDocumentVersion() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of OpenImmoTransferDocument.downgrade failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of OpenImmoTransferDocument.downgrade failed!" );
    }
  }

  @Test
  public void testGetDocumentVersion()
  {
    OpenImmoTransferDocument doc;
    try
    {
      doc = new OpenImmoTransferDocument( buildExampleDocument( "1.2.7" ) );
      Assert.assertEquals(
        "1.2.7", OpenImmoVersion.V1_2_7, doc.getDocumentVersion() );

      doc = new OpenImmoTransferDocument( buildExampleDocument( "1.2.6/AT1.0" ) );
      Assert.assertEquals(
        "1.2.6/AT1.0", OpenImmoVersion.V1_2_6, doc.getDocumentVersion() );

      doc = new OpenImmoTransferDocument( buildExampleDocument( "1.2.0" ) );
      Assert.assertEquals(
        "1.2.0", OpenImmoVersion.V1_2_0, doc.getDocumentVersion() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of OpenImmoTransferDocument.getDocumentVersion failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of OpenImmoTransferDocument.getDocumentVersion failed!" );
    }
  }

  @Test
  public void testSetDocumentVersion()
  {
    try
    {
      OpenImmoTransferDocument doc = new OpenImmoTransferDocument( buildExampleDocument( "1.2.7" ) );
      Assert.assertEquals(
        "1.2.7", OpenImmoVersion.V1_2_7, doc.getDocumentVersion() );

      doc.setDocumentVersion( OpenImmoVersion.V1_2_6 );
      Assert.assertEquals(
        "1.2.6/AT1.0", OpenImmoVersion.V1_2_6, doc.getDocumentVersion() );

      doc.setDocumentVersion( OpenImmoVersion.V1_2_0 );
      Assert.assertEquals(
        "1.2.0", OpenImmoVersion.V1_2_0, doc.getDocumentVersion() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of OpenImmoTransferDocument.setDocumentVersion failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of OpenImmoTransferDocument.setDocumentVersion failed!" );
    }
  }

  @Test
  public void testToObject()
  {
    try
    {
      String version = OpenImmoUtils.VERSION.toReadableVersion();

      OpenImmoTransferDocument doc = new OpenImmoTransferDocument( buildExampleDocument( version ) );
      Assert.assertEquals(
        version, OpenImmoUtils.VERSION, doc.getDocumentVersion() );

      Openimmo obj = doc.toObject();
      Assert.assertNotNull(
        "Created object for transfer document.", obj );
      Assert.assertEquals(
        "Matching version between document and object.", doc.getDocumentVersion().toReadableVersion(), obj.getUebertragung().getVersion() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of OpenImmoTransferDocument.toObject failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of OpenImmoTransferDocument.toObject failed!" );
    }
  }

  @Test
  public void testUpgrade()
  {
    try
    {
      String version = OpenImmoUtils.VERSION.toReadableVersion();
      OpenImmoTransferDocument doc = new OpenImmoTransferDocument( buildExampleDocument( "1.1" ) );

      doc.upgrade( OpenImmoUtils.VERSION );
      Assert.assertEquals(
        "upgrade from 1.1 to "+version, OpenImmoUtils.VERSION, doc.getDocumentVersion() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of OpenImmoTransferDocument.upgrade failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of OpenImmoTransferDocument.upgrade failed!" );
    }
  }
}