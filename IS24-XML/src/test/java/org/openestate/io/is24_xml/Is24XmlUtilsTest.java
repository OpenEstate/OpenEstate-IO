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
public class Is24XmlUtilsTest
{
  private final static Logger LOGGER = LoggerFactory.getLogger( Is24XmlUtilsTest.class );

  @Test
  public void testCreateDocument()
  {
    Is24XmlDocument doc;
    try
    {
      doc = Is24XmlUtils.createDocument( Is24XmlUtilsTest.class.getResourceAsStream( "/is24.xml" ) );
      Assert.assertNotNull(
        "Transfer was processed.", doc );
      Assert.assertTrue(
        "Transfer was processed as Is24XmlDocument.", doc instanceof Is24XmlDocument );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of Is24XmlUtils.createDocument failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of Is24XmlUtils.createDocument failed!" );
    }
  }

  @Test
  public void testGetContext()
  {
    try
    {
      Assert.assertNotNull(
        "JAXB context must be creatable.", Is24XmlUtils.getContext() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of Is24XmlUtils.getContext failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of Is24XmlUtils.getContext failed!" );
    }
  }
}