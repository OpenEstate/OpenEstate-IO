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
package org.openestate.io.examples;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.log4j.PropertyConfigurator;
import org.openestate.io.filemaker.FilemakerDocument;
import org.openestate.io.filemaker.FilemakerLayoutDocument;
import org.openestate.io.filemaker.FilemakerResultDocument;
import org.openestate.io.filemaker.FilemakerUtils;
import org.openestate.io.filemaker.xml.layout.FMPXMLLAYOUT;
import org.openestate.io.filemaker.xml.layout.LayoutType;
import org.openestate.io.filemaker.xml.layout.ValueListsType;
import org.openestate.io.filemaker.xml.result.FMPXMLRESULT;
import org.openestate.io.filemaker.xml.result.MetaDataType;
import org.openestate.io.filemaker.xml.result.ResultSetType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

/**
 * FilemakerReadingExample.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public class FilemakerReadingExample
{
  private final static Logger LOGGER = LoggerFactory.getLogger( FilemakerReadingExample.class );
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
      FilemakerReadingExample.class.getResource( PACKAGE + "/log4j.properties" ) );

    // read example files, if no files were specified as command line arguments
    if (args.length<1)
    {
      try
      {
        read( FilemakerReadingExample.class.getResourceAsStream( PACKAGE + "/filemaker-result.xml" ) );
      }
      catch (Exception ex)
      {
        LOGGER.error( "Can't read example result file!" );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
        System.exit( 2 );
      }

      try
      {
        read( FilemakerReadingExample.class.getResourceAsStream( PACKAGE + "/filemaker-layout.xml" ) );
      }
      catch (Exception ex)
      {
        LOGGER.error( "Can't read example layout file!" );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
        System.exit( 2 );
      }
    }

    // read files, that were specified as command line arguments
    else
    {
      for (String arg : args)
      {
        try
        {
          read( new File( arg ) );
        }
        catch (Exception ex)
        {
          LOGGER.error( "Can't read file '" + arg + "'!" );
          LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
          System.exit( 2 );
        }
      }
    }
  }

  /**
   * Read a {@link File} into a {@link FilemakerResultDocument} or
   * {@link FilemakerLayoutDocument} and print some of their content to
   * console.
   *
   * @param xmlFile
   * the file to read
   *
   * @throws SAXException
   * if the file is not readable by the XML parser
   *
   * @throws IOException
   * if the file is not readable
   *
   * @throws ParserConfigurationException
   * if the XML parser is improperly configured
   *
   * @throws JAXBException
   * if XML conversion into Java objects failed
   */
  protected static void read( File xmlFile ) throws SAXException, IOException, ParserConfigurationException, JAXBException
  {
    LOGGER.info( "process file: " + xmlFile.getAbsolutePath() );
    if (!xmlFile.isFile())
    {
      LOGGER.warn( "> provided file is invalid" );
      return;
    }
    FilemakerDocument doc = FilemakerUtils.createDocument( xmlFile );
    if (doc==null)
    {
      LOGGER.warn( "> provided XML is not supported" );
    }
    else if (doc.isResult())
    {
      printToConsole( (FilemakerResultDocument) doc );
    }
    else if (doc.isLayout())
    {
      printToConsole( (FilemakerLayoutDocument) doc );
    }
    else
    {
      LOGGER.warn( "> unsupported type of document: "
        + doc.getClass().getName() );
    }
  }

  /**
   * Read a {@link InputStream} into a {@link FilemakerResultDocument} or
   * {@link FilemakerLayoutDocument} and print some of their content to
   * console.
   *
   * @param xmlInputStream
   * the input stream to read
   *
   * @throws SAXException
   * if the file is not readable by the XML parser
   *
   * @throws IOException
   * if the file is not readable
   *
   * @throws ParserConfigurationException
   * if the XML parser is improperly configured
   *
   * @throws JAXBException
   * if XML conversion into Java objects failed
   */
  protected static void read( InputStream xmlInputStream ) throws SAXException, IOException, ParserConfigurationException, JAXBException
  {
    LOGGER.info( "process example file" );
    FilemakerDocument doc = FilemakerUtils.createDocument( xmlInputStream );
    if (doc==null)
    {
      LOGGER.warn( "> provided XML is not supported" );
    }
    else if (doc.isResult())
    {
      printToConsole( (FilemakerResultDocument) doc );
    }
    else if (doc.isLayout())
    {
      printToConsole( (FilemakerLayoutDocument) doc );
    }
    else
    {
      LOGGER.warn( "> unsupported type of document: "
        + doc.getClass().getName() );
    }
  }

  /**
   * Print some content of a {@link FilemakerLayoutDocument} to console.
   *
   * @param doc
   * the document to process
   *
   * @throws JAXBException
   * if XML conversion into Java objects failed
   */
  protected static void printToConsole( FilemakerLayoutDocument doc ) throws JAXBException
  {
    LOGGER.info( "> process layout document" );
    FMPXMLLAYOUT layout = doc.toObject();

    LOGGER.info( "> error code      : " + layout.getERRORCODE() );
    if (layout.getPRODUCT()!=null)
    {
      LOGGER.info( "> product name    : " + layout.getPRODUCT().getNAME() );
      LOGGER.info( "> product version : " + layout.getPRODUCT().getVERSION() );
      LOGGER.info( "> product build   : " + layout.getPRODUCT().getBUILD() );
    }
    if (layout.getLAYOUT()!=null)
    {
      LOGGER.info( "> database name   : " + layout.getLAYOUT().getDATABASE() );
      LOGGER.info( "> database layout : " + layout.getLAYOUT().getNAME() );
      for (LayoutType.FIELD field : layout.getLAYOUT().getFIELD())
      {
        LOGGER.info( "> database field  : " + field.getNAME() + " / " + field.getSTYLE().getTYPE() + " / " + field.getSTYLE().getVALUELIST() );
      }
    }
    if (layout.getVALUELISTS()!=null)
    {
      for (ValueListsType.VALUELIST valuelist : layout.getVALUELISTS().getVALUELIST())
      {
        LOGGER.info( "> database values : " + valuelist.getNAME() );
        for (String value : valuelist.getVALUE())
        {
          LOGGER.info( ">> " + value );
        }
      }
    }
  }

  /**
   * Print some content of a {@link FilemakerResultDocument} to console.
   *
   * @param doc
   * the document to process
   *
   * @throws JAXBException
   * if XML conversion into Java objects failed
   */
  protected static void printToConsole( FilemakerResultDocument doc ) throws JAXBException
  {
    LOGGER.info( "> process result document" );
    FMPXMLRESULT result = doc.toObject();

    LOGGER.info( "> error code       : " + result.getERRORCODE() );
    if (result.getPRODUCT()!=null)
    {
      LOGGER.info( "> product name     : " + result.getPRODUCT().getNAME() );
      LOGGER.info( "> product version  : " + result.getPRODUCT().getVERSION() );
      LOGGER.info( "> product build    : " + result.getPRODUCT().getBUILD() );
    }
    if (result.getDATABASE()!=null)
    {
      LOGGER.info( "> database name    : " + result.getDATABASE().getNAME() );
      LOGGER.info( "> database layout  : " + result.getDATABASE().getLAYOUT() );
      LOGGER.info( "> database date    : " + result.getDATABASE().getDATEFORMAT() );
      LOGGER.info( "> database time    : " + result.getDATABASE().getTIMEFORMAT() );
      LOGGER.info( "> database records : " + result.getDATABASE().getRECORDS() );
    }
    if (result.getMETADATA()!=null)
    {
      for (MetaDataType.FIELD field : result.getMETADATA().getFIELD())
      {
        LOGGER.info( "> database field   : " + field.getNAME() );
        LOGGER.info( ">> type : " + field.getTYPE() );
        LOGGER.info( ">> max repeat : " + field.getMAXREPEAT() );
      }
    }
    if (result.getRESULTSET()!=null)
    {
      LOGGER.info( "> resultset found  : " + result.getRESULTSET().getFOUND() );
      for (ResultSetType.ROW row : result.getRESULTSET().getROW())
      {
        LOGGER.info( "> resultset row    : " + row.getRECORDID() + " / " + row.getMODID() );
        for (ResultSetType.ROW.COL col : row.getCOL())
        {
          for (String data : col.getDATA())
          {
            LOGGER.info( ">> " + data );
          }
        }
      }
    }
  }
}