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

package org.openestate.io.kyero;

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
public class KyeroUtilsTest
{
  private final static Logger LOGGER = LoggerFactory.getLogger(KyeroUtilsTest.class );

  @Test
  public void testCreateDocument()
  {
    KyeroDocument doc;
    try
    {
      doc = KyeroUtils.createDocument( KyeroUtilsTest.class.getResourceAsStream( "/kyero.xml" ) );
      Assert.assertNotNull(
        "Transfer was processed.", doc );
      Assert.assertTrue("Transfer was processed as TransferDocument.", doc instanceof KyeroDocument );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of KyeroUtils.createDocument failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of KyeroUtils.createDocument failed!" );
    }
  }

  @Test
  public void testGetContext()
  {
    try
    {
      Assert.assertNotNull("JAXB context must be creatable.", KyeroUtils.getContext() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of KyeroUtils.getContext failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of KyeroUtils.getContext failed!" );
    }
  }
}