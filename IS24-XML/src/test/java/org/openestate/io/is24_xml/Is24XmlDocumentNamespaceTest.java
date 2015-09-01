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

package org.openestate.io.is24_xml;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.is24_xml.xml.ImmobilienTransferTyp;
import org.openestate.io.is24_xml.xml.ImmobilienTransferTyp.Anbieter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

/**
 *
 * @author Andreas Rudolph
 */
@RunWith( JUnit4.class )
public class Is24XmlDocumentNamespaceTest
{
  private final static Logger LOGGER = LoggerFactory.getLogger( Is24XmlDocumentNamespaceTest.class );

  private static Document buildExampleDocument() throws Exception
  {
    return XmlUtils.newDocument(Is24XmlDocumentNamespaceTest.class.getResourceAsStream( "/is24-namespace.xml" ) );
  }

  @Test
  public void testToObject()
  {
    try
    {
      Is24XmlDocument doc = new Is24XmlDocument( buildExampleDocument() );

      ImmobilienTransferTyp obj = doc.toObject();
      Assert.assertNotNull(
        "Created object for transfer document.", obj );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of Is24XmlDocument.toObject failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of Is24XmlDocument.toObject failed!" );
    }
  }

  @Test
  @Ignore
  public void testToXml()
  {
    //ObjectType obj = Is24XmlUtils.getFactory().createObjectType();
    //obj.setINFODE( "an example property" );
    //obj.setORT( "Berlin" );

    Anbieter agent = Is24XmlUtils.getFactory().createImmobilienTransferTypAnbieter();
    agent.setScoutKundenID( "123456" );
    //agent.getImmobilien().add( e );

    ImmobilienTransferTyp transfer = Is24XmlUtils.getFactory().createImmobilienTransferTyp();
    transfer.setAnbieter( agent );
    transfer.setEmailBeiFehler( "test@test.org" );
    transfer.setErstellerSoftware( "OpenEstate.org" );
    transfer.setErstellerSoftwareVersion( "1.0" );

    try
    {
      Is24XmlDocument doc = Is24XmlDocument.newDocument( transfer );

      String xml = doc.toXmlString( true );
      LOGGER.info( "XML: " + xml );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of Is24XmlDocument.toXml failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of Is24XmlDocument.toXml failed!" );
    }
  }
}