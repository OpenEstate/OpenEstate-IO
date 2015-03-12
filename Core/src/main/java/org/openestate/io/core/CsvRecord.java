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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.lang3.StringUtils;

/**
 * A general CSV record, that is read by a {@link CsvParser} and written by a
 * {@link CsvPrinter}.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public abstract class CsvRecord
{
  private final Map<Integer,String> values;

  /**
   * Create an empty record.
   */
  protected CsvRecord()
  {
    this.values = new HashMap<Integer, String>();
  }

  /**
   * Returns the value of the record at a certain index position.
   *
   * @param pos
   * index position
   *
   * @return
   * value at index position or null, if not available
   */
  protected final String get( int pos )
  {
    return this.get( pos, null );
  }

  /**
   * Returns the value of the record at a certain index position.
   *
   * @param pos
   * index position
   *
   * @param defaultValue
   * returned default value, if no value is available at the index position
   *
   * @return
   * value at index position or the provided defaultValue, if not available
   */
  protected final String get( int pos, String defaultValue )
  {
    String value = StringUtils.trimToNull( this.values.get( pos ) );
    return (value!=null)? value: defaultValue;
  }

  /**
   * Returns the number of values, that are hold by this record.
   *
   * @return
   * number of values
   */
  protected abstract int getRecordLenth();

  /**
   * Loads data from {@link CsvParser} into the record.
   *
   * @param record
   * the CSV record from
   * <a href="http://commons.apache.org/proper/commons-csv/">commons-csv</a>
   */
  protected void parse( CSVRecord record )
  {
    this.values.clear();
    for (int i=0; i<record.size(); i++)
    {
      this.values.put( i, this.parse( record.get( i ) ) );
    }
  }

  /**
   * Converts a single value before it is assigned to this record.
   *
   * @param value
   * value to convert
   *
   * @return
   * converted value
   */
  protected String parse( String value )
  {
    return value;
  }

  /**
   * Returns a list of values for this record as they are written into CSV.
   *
   * @return
   * CSV values to write
   */
  protected Iterable<String> print()
  {
    final int length = this.getRecordLenth();
    List<String> row = new ArrayList<String>();
    for (int i=0; i<length; i++)
    {
      row.add( this.get( i ) );
    }
    return row;
  }

  /**
   * Sets the value of this record at a certain index position.
   *
   * @param pos
   * index position
   *
   * @param value
   * the value to set
   */
  protected final void set( int pos, String value )
  {
    value = StringUtils.trimToNull( value );
    if (value!=null)
      this.values.put( pos, value );
    else if (this.values.containsKey( pos ))
      this.values.remove( pos );
  }
}