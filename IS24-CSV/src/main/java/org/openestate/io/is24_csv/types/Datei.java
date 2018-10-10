/*
 * Copyright 2015-2018 OpenEstate.org.
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
package org.openestate.io.is24_csv.types;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Datei.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public class Datei
{
  private final static Logger LOGGER = LoggerFactory.getLogger( Datei.class );
  private String name;
  private String text;
  private DateiSuffix suffix;
  private DateiTyp typ;
  private int abspieldauer;

  public Datei( String name, DateiTyp art, DateiSuffix typ )
  {
    this( name, art, typ, null, 0 );
  }

  public Datei( String name, DateiTyp art, DateiSuffix typ, String text )
  {
    this( name, art, typ, text, 0 );
  }

  public Datei( String name, DateiTyp art, DateiSuffix typ, String text, int abspieldauer )
  {
    this.name = name;
    this.suffix = typ;
    this.typ = art;
    this.text = text;
    this.abspieldauer = abspieldauer;
  }

  public int getAbspieldauer()
  {
    return this.abspieldauer;
  }

  public String getName()
  {
    return this.name;
  }

  public DateiSuffix getSuffix()
  {
    return this.suffix;
  }

  public String getText()
  {
    return this.text;
  }

  public DateiTyp getTyp()
  {
    return this.typ;
  }

  public String guessMimeType()
  {
    DateiSuffix suffixToLookup = this.suffix;
    if (suffixToLookup==null)
      suffixToLookup = DateiSuffix.fromFileName( this.name );
    return (suffixToLookup!=null)?
      suffixToLookup.getMimeType(): "application/octet-stream";
  }

  public void setAbspieldauer( int value )
  {
    this.abspieldauer = value;
  }

  public void setName( String value )
  {
    this.name = value;
  }

  public void setSuffix( DateiSuffix value )
  {
    this.suffix = value;
  }

  public void setText( String value )
  {
    this.text = value;
  }

  public void setTyp( DateiTyp value )
  {
    this.typ = value;
  }
}