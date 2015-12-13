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

package org.openestate.io.examples;

import java.io.File;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.filemaker.FilemakerResultDocument;
import org.openestate.io.filemaker.FilemakerResultMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

/**
 * FilemakerResultMappingExample.
 *
 * @since 1.0
 * @author Andreas Rudolph<andy@openindex.de>
 */
public class FilemakerResultMappingExample
{
  private final static Logger LOGGER = LoggerFactory.getLogger( FilemakerResultMappingExample.class );
  private final static String PACKAGE = "/org/openestate/io/examples";

  /**
   * Start the example application.
   *
   * @param args
   * command line arguments
   */
  public static void main( String[] args )
  {
    // init logging
    PropertyConfigurator.configure(
      FilemakerWritingExample.class.getResource( PACKAGE + "/log4j.properties" ) );

    // create a mapping from the example document, if no files were specified as command line arguments
    FilemakerResultMapping mapping = null;
    if (args.length<1)
    {
      try
      {
        mapping = new FilemakerResultDocument( buildExampleDocument() ).toMapping();
      }
      catch (Exception ex)
      {
        LOGGER.error( "Can't create mapping!" );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
        System.exit( 1 );
      }
    }

    // read file, that was specified as command line argument
    else
    {
      try
      {
        mapping = new FilemakerResultDocument( XmlUtils.newDocument( new File( args[0] ) ) ).toMapping();
      }
      catch (Exception ex)
      {
        LOGGER.error( "Can't create mapping from file '" + args[0] + "'!" );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
        System.exit( 1 );
      }
    }

    if (mapping==null)
    {
      LOGGER.error( "No mapping was created!" );
      System.exit( 1 );
    }

    // loop through available rows and access their values through the field name
    for (int i=0; i<mapping.getRowCount(); i++)
    {
      FilemakerResultMapping.Row row = mapping.getRow( i );
      LOGGER.info( StringUtils.repeat( "-", 50 ) );
      LOGGER.info( "record at row " + i );
      LOGGER.info( "> recordId = " + row.getRecordId() );
      LOGGER.info( "> modId = " + row.getModId() );

      // access record values through their field name
      for (String field : row.getFieldNames())
      {
        LOGGER.info( "> " + field + " = " + row.getValue( field ) );
      }
    }
  }

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
}