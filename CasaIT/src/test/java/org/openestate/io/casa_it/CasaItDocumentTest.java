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

package org.openestate.io.casa_it;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openestate.io.casa_it.xml.Container;
import org.openestate.io.core.DocumentUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

/**
 *
 * @author Andreas Rudolph
 */
@RunWith( JUnit4.class )
public class CasaItDocumentTest
{
  private final static Logger LOGGER = LoggerFactory.getLogger(CasaItDocumentTest.class );

  private static Document buildExampleDocument() throws Exception
  {
    return DocumentUtils.newDocument( "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
      + "<container>\n"
      + "  <realestateitems>\n"
      + "    <realestate>\n"
      + "    </realestate>\n"
      + "  </realestateitems>\n"
      + "</container>" );
  }

  @Test
  public void testToObject()
  {
    try
    {
      CasaItDocument doc = new CasaItDocument( buildExampleDocument() );

      Container obj = doc.toObject();
      Assert.assertNotNull(
        "Created object for transfer document.", obj );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of CasaITDocument.toObject failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of CasaITDocument.toObject failed!" );
    }
  }

  @Test
  @Ignore
  public void testToXml()
  {
    Container.Realestateitems.Realestate obj = CasaItUtils.getFactory().createContainerRealestateitemsRealestate();
    obj.setDescription( CasaItUtils.getFactory().createContainerRealestateitemsRealestateDescription() );
    obj.getDescription().setValue( "an example property" );

    Container containier = CasaItUtils.getFactory().createContainer();
    containier.setRealestateitems( CasaItUtils.getFactory().createContainerRealestateitems() );
    containier.getRealestateitems().getRealestate().add( obj );

    try
    {
      CasaItDocument doc = CasaItDocument.newDocument( containier );

      String xml = doc.toXmlString( true );
      LOGGER.info( "XML: " + xml );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of CasaITDocument.toXml failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of CasaITDocument.toXml failed!" );
    }
  }
}