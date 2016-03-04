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
package org.openestate.io.immoxml;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.Calendar;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Andreas Rudolph
 */
@RunWith( JUnit4.class )
public class ImmoXmlUtilsTest
{
  private final static Logger LOGGER = LoggerFactory.getLogger(ImmoXmlUtilsTest.class );

  @Test
  public void testCreateDocument()
  {
    String transferXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
      + "<immoxml xmlns=\"" + ImmoXmlUtils.NAMESPACE + "\">\n"
      + "  <uebertragung version=\"" + ImmoXmlUtils.VERSION.toReadableVersion() + "\" "
      + "                sendersoftware=\"OpenEstate.org\" "
      + "                techn_email=\"test@openestate.org\" "
      + "                umfang=\"VOLL\" art=\"OFFLINE\"/>\n"
      + "  <anbieter>\n"
      + "  </anbieter>\n"
      + "</immoxml>";

    ImmoXmlDocument doc;
    try
    {
      doc = ImmoXmlUtils.createDocument( transferXml );
      Assert.assertNotNull(
        "Transfer was processed.", doc );
      Assert.assertTrue("Transfer was processed as TransferDocument.", doc instanceof ImmoXmlDocument );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of ImmoXMLUtils.createDocument failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of ImmoXMLUtils.createDocument failed!" );
    }
  }

  @Test
  public void testGetContext()
  {
    try
    {
      Assert.assertNotNull(
        "JAXB context must be creatable.", ImmoXmlUtils.getContext() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of ImmoXMLUtils.getContext failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of ImmoXMLUtils.getContext failed!" );
    }
  }

  @Test
  public void testParseDate()
  {
    DateFormat formatter = DateFormat.getDateInstance( DateFormat.SHORT );
    Calendar cal1 = Calendar.getInstance();
    cal1.set( 2015, Calendar.JANUARY, 3, 0, 0, 0 );
    Calendar cal2 = ImmoXmlUtils.parseDate( "03.01.2015" );
    //LOGGER.info( formatter.format( cal1.getTime()) + " == " + formatter.format( cal2.getTime() ) );
    Assert.assertEquals(
      formatter.format( cal1.getTime() ),
      formatter.format( cal2.getTime() ) );
  }

  @Test
  public void testParseDecimal()
  {
    Assert.assertEquals(
      new BigDecimal( "2" ), ImmoXmlUtils.parseDecimal( "2" ) );
    Assert.assertEquals(
      new BigDecimal( "2.5" ), ImmoXmlUtils.parseDecimal( "2.5" ) );
    Assert.assertEquals(
      new BigDecimal( "2.5" ), ImmoXmlUtils.parseDecimal( "2,5" ) );
    Assert.assertEquals(
      null, ImmoXmlUtils.parseDecimal( "" ) );

    try
    {
      Assert.assertEquals(
        null, ImmoXmlUtils.parseDecimal( "," ) );
      Assert.fail( "An exception should have been thrown." );
    }
    catch (IllegalArgumentException ex)
    {
    }

    try
    {
      Assert.assertEquals(
        null, ImmoXmlUtils.parseDecimal( "." ) );
      Assert.fail( "An exception should have been thrown." );
    }
    catch (IllegalArgumentException ex)
    {
    }

    try
    {
      ImmoXmlUtils.parseDecimal( "2 MM" );
      Assert.fail( "An exception should have been thrown." );
    }
    catch (IllegalArgumentException ex)
    {
    }
  }
}