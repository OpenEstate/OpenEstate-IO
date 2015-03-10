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

package org.openestate.io.daftie;

import org.openestate.io.daft_ie.DaftIeDocument;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.daft_ie.DaftIeUtils;
import org.openestate.io.daft_ie.DaftIeVersion;
import org.openestate.io.daft_ie.xml.Daft;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

/**
 *
 * @author Andreas Rudolph
 */
@RunWith( JUnit4.class )
public class DaftIeDocumentTest
{
  private final static Logger LOGGER = LoggerFactory.getLogger( DaftIeDocumentTest.class );

  private static Document buildExampleDocument( String version ) throws Exception
  {
    return XmlUtils.newDocument( "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
      + "<daft version=\"" + version + "\">\n"
      + "  <overseas_sales>\n"
      + "  </overseas_sales>\n"
      + "</daft>" );
  }

  @Test
  public void testGetDocumentVersion()
  {
    DaftIeDocument doc;
    try
    {
      doc = new DaftIeDocument( buildExampleDocument( "2.7" ) );
      Assert.assertEquals( "2.7", DaftIeVersion.V2_7, doc.getDocumentVersion() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of DaftIeDocument.getDocumentVersion failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of DaftIeDocument.getDocumentVersion failed!" );
    }
  }

  @Test
  public void testSetDocumentVersion()
  {
    try
    {
      DaftIeDocument doc = new DaftIeDocument( buildExampleDocument( "" ) );
      Assert.assertEquals( "no version", null, doc.getDocumentVersion() );

      doc.setDocumentVersion( DaftIeVersion.V2_7 );
      Assert.assertEquals( "2.7", DaftIeVersion.V2_7, doc.getDocumentVersion() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of DaftIeDocument.setDocumentVersion failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of DaftIeDocument.setDocumentVersion failed!" );
    }
  }

  @Test
  public void testToObject()
  {
    try
    {
      DaftIeDocument doc = new DaftIeDocument( buildExampleDocument(DaftIeUtils.VERSION.toReadableVersion() ) );

      Daft obj = doc.toObject();
      Assert.assertNotNull(
        "Created object for transfer document.", obj );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of DaftIeDocument.toObject failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of DaftIeDocument.toObject failed!" );
    }
  }

  @Test
  @Ignore
  public void testToXml()
  {
    Daft daft = DaftIeUtils.getFactory().createDaft();
    daft.setVersion(DaftIeUtils.VERSION.toReadableVersion() );
    daft.setOverseasRental(DaftIeUtils.getFactory().createDaftOverseasRental() );
    daft.setOverseasSales(DaftIeUtils.getFactory().createDaftOverseasSales() );
    try
    {
      DaftIeDocument doc = DaftIeDocument.newDocument( daft );

      String xml = doc.toXmlString( true );
      LOGGER.info( "XML: " + xml );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of DaftIeDocument.toXml failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of DaftIeDocument.toXml failed!" );
    }
  }
}