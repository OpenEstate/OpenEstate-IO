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

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.Writer;
import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import org.apache.commons.io.IOUtils;
import org.w3c.dom.Document;

/**
 * AbstractDocument.
 *
 * @param <JavaType>
 * ...
 *
 * @author Andreas Rudolph
 */
public abstract class BaseDocument<JavaType>
{
  //private final static Logger LOGGER = LoggerFactory.getLogger( AbstractDocument.class );
  private final Document document;
  private boolean textWrittenAsCDATA = false;

  protected BaseDocument( Document document )
  {
    this.document = document;
  }

  public final Document getDocument()
  {
    return this.document;
  }

  public final boolean isTextWrittenAsCDATA()
  {
    return this.textWrittenAsCDATA;
  }

  protected void prepareDocumentBeforeWritingToXml( Document doc ) throws IOException
  {
  }

  public void setTextWrittenAsCDATA( boolean textsAsCDATA )
  {
    this.textWrittenAsCDATA = textsAsCDATA;
  }

  public abstract JavaType toObject() throws JAXBException;

  public final void toXml( File xmlFile ) throws TransformerException, IOException
  {
    toXml( xmlFile, true );
  }

  public void toXml( File xmlFile, boolean prettyPrint ) throws TransformerException, IOException
  {
    if (this.isTextWrittenAsCDATA())
    {
      DocumentUtils.replaceTextWithCData( this.getDocument() );
    }
    prepareDocumentBeforeWritingToXml( this.getDocument() );
    DocumentUtils.write( this.getDocument(), xmlFile, prettyPrint );
  }

  public final void toXml( OutputStream output ) throws TransformerException, IOException
  {
    toXml( output, true );
  }

  public void toXml( OutputStream output, boolean prettyPrint ) throws TransformerException, IOException
  {
    if (this.isTextWrittenAsCDATA())
    {
      DocumentUtils.replaceTextWithCData( this.getDocument() );
    }
    prepareDocumentBeforeWritingToXml( this.getDocument() );
    DocumentUtils.write( this.getDocument(), output, prettyPrint );
  }

  public final void toXml( Writer output ) throws TransformerException, IOException
  {
    toXml( output, true );
  }

  public void toXml( Writer output, boolean prettyPrint ) throws TransformerException, IOException
  {
    if (this.isTextWrittenAsCDATA())
    {
      DocumentUtils.replaceTextWithCData( this.getDocument() );
    }
    prepareDocumentBeforeWritingToXml( this.getDocument() );
    DocumentUtils.write( this.getDocument(), output, prettyPrint );
  }

  public String toXmlString() throws TransformerException, IOException
  {
    return toXmlString( true );
  }

  public final String toXmlString( boolean prettyPrint ) throws TransformerException, IOException
  {
    StringWriter w = null;
    try
    {
      w = new StringWriter();
      this.toXml( w, prettyPrint );
      return w.toString();
    }
    finally
    {
      IOUtils.closeQuietly( w );
    }
  }
}