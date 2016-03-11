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
package org.openestate.io.filemaker;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openestate.io.core.XmlUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

/**
 *
 * @author Andreas Rudolph
 */
@RunWith( JUnit4.class )
public class FilemakerResultMappingTest
{
  private final static Logger LOGGER = LoggerFactory.getLogger( FilemakerResultMappingTest.class );

  private static Document buildExampleDocument() throws Exception
  {
    return XmlUtils.newDocument( "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
      + "<FMPXMLRESULT xmlns=\"http://www.filemaker.com/fmpxmlresult\">\n"
      + "  <ERRORCODE>0</ERRORCODE>\n"
      + "  <PRODUCT BUILD=\"03-20-2006\" NAME=\"FileMaker Pro\" VERSION=\"8.0v3\"/>\n"
      + "  <DATABASE DATEFORMAT=\"D.m.yyyy\" LAYOUT=\"fmmedia2universal\" NAME=\"AngGes\" RECORDS=\"13723\" TIMEFORMAT=\"k:mm:ss \"/>\n"
      + "  <METADATA>\n"
      + "    <FIELD EMPTYOK=\"YES\" MAXREPEAT=\"1\" NAME=\"aNumericField\" TYPE=\"NUMBER\"/>\n"
      + "    <FIELD EMPTYOK=\"YES\" MAXREPEAT=\"1\" NAME=\"aTextField\" TYPE=\"TEXT\"/>\n"
      + "  </METADATA>\n"
      + "  <RESULTSET FOUND=\"2\">\n"
      + "    <ROW MODID=\"1\" RECORDID=\"2\">\n"
      + "      <COL>\n"
      + "        <DATA>123</DATA>\n"
      + "      </COL>\n"
      + "      <COL>\n"
      + "        <DATA>this is a text</DATA>\n"
      + "      </COL>\n"
      + "    </ROW>\n"
      + "    <ROW MODID=\"3\" RECORDID=\"4\">\n"
      + "      <COL>\n"
      + "        <DATA>456</DATA>\n"
      + "      </COL>\n"
      + "      <COL>\n"
      + "        <DATA>this is another text</DATA>\n"
      + "      </COL>\n"
      + "    </ROW>\n"
      + "  </RESULTSET>\n"
      + "</FMPXMLRESULT>" );
  }

  @Test
  public void testMapping()
  {
    FilemakerResultMapping mapping = null;
    try
    {
      FilemakerResultDocument doc = new FilemakerResultDocument( buildExampleDocument() );
      mapping = doc.toMapping();
      Assert.assertNotNull(
        "Created mapping for transfer document.", mapping );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Test of FilemakerResultMapping failed!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      Assert.fail( "Test of FilemakerResultMapping failed!" );
    }

    Assert.assertTrue( "test number of fields", mapping.getFieldCount()==2 );
    Assert.assertTrue( "test number of rows", mapping.getRowCount()==2 );

    FilemakerResultMapping.Row row = mapping.getRow( 0 );
    Assert.assertTrue( "test modId of the first row", row.getModId()==1 );
    Assert.assertTrue( "test recoirdId of the first row", row.getRecordId()==2 );
    Assert.assertTrue( "test first value of the first row", "123".equals( row.getValue( "aNumericField" ) ) );
    Assert.assertTrue( "test second value of the first row", "this is a text".equals( row.getValue( "aTextField" ) ) );

    row = mapping.getRow( 1 );
    Assert.assertTrue( "test modId of the second row", row.getModId()==3 );
    Assert.assertTrue( "test recoirdId of the second row", row.getRecordId()==4 );
    Assert.assertTrue( "test first value of the second row", "456".equals( row.getValue( "aNumericField" ) ) );
    Assert.assertTrue( "test second value of the second row", "this is another text".equals( row.getValue( "aTextField" ) ) );
  }
}