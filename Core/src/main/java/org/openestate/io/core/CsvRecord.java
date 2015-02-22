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
 * CsvRecord.
 *
 * @author Andreas Rudolph
 */
public abstract class CsvRecord
{
  private final Map<Integer,String> values;

  protected CsvRecord()
  {
    this.values = new HashMap<Integer, String>();
  }

  protected final String get( int pos )
  {
    return this.get( pos, null );
  }

  protected final String get( int pos, String defaultValue )
  {
    String value = StringUtils.trimToNull( this.values.get( pos ) );
    return (value!=null)? value: defaultValue;
  }

  protected abstract int getRecordLenth();

  protected void parse( CSVRecord record )
  {
    this.values.clear();
    for (int i=0; i<record.size(); i++)
    {
      this.values.put( i, record.get( i ) );
    }
  }

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

  protected final void set( int pos, String value )
  {
    value = StringUtils.trimToNull( value );
    if (value!=null)
      this.values.put( pos, value );
    else if (this.values.containsKey( pos ))
      this.values.remove( pos );
  }
}