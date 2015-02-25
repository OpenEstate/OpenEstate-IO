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

package org.openestate.io.idx;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.openestate.io.core.CsvParser;

/**
 * IdxParser.
 *
 * @author Andreas Rudolph
 */
public class IdxParser extends CsvParser<IdxRecord>
{
  protected IdxParser( CSVParser parser )
  {
    super( parser );
  }

  public static IdxParser create( String csvString ) throws IOException
  {
    return new IdxFormat().parse( csvString );
  }

  public static IdxParser create( File csvFile ) throws IOException
  {
    return new IdxFormat().parse( csvFile );
  }

  public static IdxParser create( InputStream input ) throws IOException
  {
    return new IdxFormat().parse( input );
  }

  public static IdxParser create( Reader input ) throws IOException
  {
    return new IdxFormat().parse( input );
  }

  @Override
  protected IdxRecord newRecord( CSVRecord record )
  {
    return IdxRecord.newRecord( record );
  }
}