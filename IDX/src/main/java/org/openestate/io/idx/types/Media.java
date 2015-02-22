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

package org.openestate.io.idx.types;

import org.apache.commons.lang3.StringUtils;

/**
 * Media.
 *
 * @author Andreas Rudolph
 */
public class Media
{
  private String fileName;
  private String title;
  private String description;
  private String url;

  public Media()
  {
    this( null, null, null, null );
  }

  public Media( String fileName )
  {
    this( fileName, null, null, null );
  }

  public Media( String fileName, String title )
  {
    this( fileName, title, null, null );
  }

  public Media( String fileName, String title, String description )
  {
    this( fileName, title, description, null );
  }

  public Media( String fileName, String title, String description, String url )
  {
    this.fileName = fileName;
    this.title = title;
    this.description = description;
    this.url = url;
  }

  public String getDescription()
  {
    return this.description;
  }

  public String getFileName()
  {
    return this.fileName;
  }

  public String getTitle()
  {
    return this.title;
  }

  public String getUrl()
  {
    return this.url;
  }

  public void setDescription( String value )
  {
    this.description = StringUtils.trimToNull( value );
  }

  public void setFileName( String value )
  {
    this.fileName = StringUtils.trimToNull( value );
  }

  public void setTitle( String value )
  {
    this.title = StringUtils.trimToNull( value );
  }

  public void setUrl( String value )
  {
    this.url = StringUtils.trimToNull( value );
  }
}