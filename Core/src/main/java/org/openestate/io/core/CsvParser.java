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

package org.openestate.io.core;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.io.IOUtils;

/**
 * CsvParser.
 *
 * @param <Record>
 * ...
 *
 * @author Andreas Rudolph
 */
public abstract class CsvParser<Record extends CsvRecord> implements Closeable
{
  private final CSVParser parser;
  private Iterator<CSVRecord> iterator = null;

  protected CsvParser( CSVParser parser )
  {
    this.parser = parser;
  }

  @Override
  public void close() throws IOException
  {
    this.parser.close();
  }

  public final void closeQuietly()
  {
    IOUtils.closeQuietly( this );
  }

  public final long getCurrentLineNumber()
  {
    return this.parser.getCurrentLineNumber();
  }

  public final long getRecordNumber()
  {
    return this.parser.getRecordNumber();
  }

  public final boolean hasNext()
  {
    if (this.iterator==null)
    {
      this.iterator = this.parser.iterator();
    }
    return this.iterator.hasNext();
  }

  public final boolean isClosed()
  {
    return this.parser.isClosed();
  }

  protected abstract Record newRecord( CSVRecord record );

  public final Record next()
  {
    if (this.iterator==null)
    {
      this.iterator = this.parser.iterator();
    }
    return this.newRecord( this.iterator.next() );
  }
}