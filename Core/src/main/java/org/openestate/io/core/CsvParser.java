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
package org.openestate.io.core;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.io.IOUtils;

/**
 * A general CSV parser, that is bound to a {@link CsvFormat} and reads CSV data
 * into {@link CsvRecord} objects.
 *
 * @param <Record>
 * the class used for a record, that is parsed from a CSV file
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public abstract class CsvParser<Record extends CsvRecord> implements Closeable
{
  private final CSVParser parser;
  private Iterator<CSVRecord> iterator = null;

  /**
   * Create with specifications of a {@link CSVParser}.
   *
   * @param parser
   * the CSV parser from
   * <a href="http://commons.apache.org/proper/commons-csv/">commons-csv</a>
   */
  protected CsvParser( CSVParser parser )
  {
    this.parser = parser;
  }

  /**
   * Closes the parser instance.
   *
   * @throws IOException
   * if closing failed
   */
  @Override
  public void close() throws IOException
  {
    this.parser.close();
  }

  /**
   * Closes the parser instance without throwing exceptions.
   */
  public final void closeQuietly()
  {
    IOUtils.closeQuietly( this );
  }

  /**
   * Returns the line number, that is currently processed by the parser.
   *
   * @return
   * line number
   */
  public final long getCurrentLineNumber()
  {
    return this.parser.getCurrentLineNumber();
  }

  /**
   * Returns the total number of available records.
   *
   * @return
   * number of records
   */
  public final long getRecordNumber()
  {
    return this.parser.getRecordNumber();
  }

  /**
   * Checks, if another record is available for the parser.
   *
   * @return
   * true, if another record is available, otherwise false
   */
  public final boolean hasNext()
  {
    if (this.iterator==null)
    {
      this.iterator = this.parser.iterator();
    }
    return this.iterator.hasNext();
  }

  /**
   * Checks, if the parser instance was closed.
   *
   * @return
   * true, if the parser was closed, otherwise false
   */
  public final boolean isClosed()
  {
    return this.parser.isClosed();
  }

  /**
   * Creates a new {@link CsvRecord} with parsed CSV data.
   *
   * @param record
   * parsed CSV data from
   * <a href="http://commons.apache.org/proper/commons-csv/">commons-csv</a>
   *
   * @return
   * created record
   */
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