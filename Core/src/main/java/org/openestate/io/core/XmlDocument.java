/*
 * Copyright 2015-2021 OpenEstate.org.
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

/**
 * A container for a XML {@link Document}, that provides functions for
 * conversion from / to Java objects.
 *
 * @param <JavaType> the class of a (via JAXB generated) Java object, that the contained
 *                   {@link Document} is mapped to
 * @author Andreas Rudolph
 * @since 1.0
 */
public abstract class XmlDocument<JavaType> {
    private final static Logger LOGGER = LoggerFactory.getLogger(XmlDocument.class);
    private final Document document;
    private boolean textWrittenAsCDATA = false;

    /**
     * Create from a {@link Document}.
     *
     * @param document the contained document
     */
    protected XmlDocument(Document document) {
        this.document = document;
    }

    /**
     * Returns the {@link Document}, that is contained by this object.
     *
     * @return the contained document
     */
    public final Document getDocument() {
        return this.document;
    }

    /**
     * Check, if text elements of generated XML should use CDATA.
     *
     * @return true, if CDATA is used for XML generation
     */
    public final boolean isTextWrittenAsCDATA() {
        return this.textWrittenAsCDATA;
    }

    /**
     * Make some modifications to a {@link Document}, before it is written to XML.
     *
     * @param doc the document, that will be written to XML
     * @throws IOException if an error occurred and XML generation should be stopped
     */
    protected void prepareDocumentBeforeWritingToXml(Document doc) throws IOException {
    }

    /**
     * Enable CDATA for text elements in generated XML.
     *
     * @param textsAsCDATA true, if CDATA is used for XML generation
     */
    public void setTextWrittenAsCDATA(boolean textsAsCDATA) {
        this.textWrittenAsCDATA = textsAsCDATA;
    }

    /**
     * Creates an object from the contained {@link Document}.
     *
     * @return created object, that represents the contained {@link Document}
     * @throws JAXBException if the Java object is not creatable
     */
    public abstract JavaType toObject() throws JAXBException;

    /**
     * Generate XML for the contained {@link Document}.
     *
     * @param xmlFile the file, where the XML code is written to
     * @throws TransformerException if XML transformation failed
     * @throws IOException          if writing failed
     */
    public final void toXml(File xmlFile) throws TransformerException, IOException {
        toXml(xmlFile, true);
    }

    /**
     * Generate XML for the contained {@link Document}.
     *
     * @param xmlFile     the file, where the XML code is written to
     * @param prettyPrint if pretty printing is enabled for the generated XML code
     * @throws TransformerException if XML transformation failed
     * @throws IOException          if writing failed
     */
    public void toXml(File xmlFile, boolean prettyPrint) throws TransformerException, IOException {
        if (this.isTextWrittenAsCDATA()) {
            XmlUtils.replaceTextWithCData(this.getDocument());
        }
        prepareDocumentBeforeWritingToXml(this.getDocument());
        XmlUtils.write(this.getDocument(), xmlFile, prettyPrint);
    }

    /**
     * Generate XML for the contained {@link Document}.
     *
     * @param output the output, where the XML code is written to
     * @throws TransformerException if XML transformation failed
     * @throws IOException          if writing failed
     */
    public final void toXml(OutputStream output) throws TransformerException, IOException {
        toXml(output, true);
    }

    /**
     * Generate XML for the contained {@link Document}.
     *
     * @param output      the output, where the XML code is written to
     * @param prettyPrint if pretty printing is enabled for the generated XML code
     * @throws TransformerException if XML transformation failed
     * @throws IOException          if writing failed
     */
    public void toXml(OutputStream output, boolean prettyPrint) throws TransformerException, IOException {
        if (this.isTextWrittenAsCDATA()) {
            XmlUtils.replaceTextWithCData(this.getDocument());
        }
        prepareDocumentBeforeWritingToXml(this.getDocument());
        XmlUtils.write(this.getDocument(), output, prettyPrint);
    }

    /**
     * Generate XML for the contained {@link Document}.
     *
     * @param output the output, where the XML code is written to
     * @throws TransformerException if XML transformation failed
     * @throws IOException          if writing failed
     */
    public final void toXml(Writer output) throws TransformerException, IOException {
        toXml(output, true);
    }

    /**
     * Generate XML for the contained {@link Document}.
     *
     * @param output      the output, where the XML code is written to
     * @param prettyPrint if pretty printing is enabled for the generated XML code
     * @throws TransformerException if XML transformation failed
     * @throws IOException          if writing failed
     */
    public void toXml(Writer output, boolean prettyPrint) throws TransformerException, IOException {
        if (this.isTextWrittenAsCDATA()) {
            XmlUtils.replaceTextWithCData(this.getDocument());
        }
        prepareDocumentBeforeWritingToXml(this.getDocument());
        XmlUtils.write(this.getDocument(), output, prettyPrint);
    }

    /**
     * Returns XML for the contained {@link Document}.
     *
     * @return the generated XML code
     * @throws TransformerException if XML transformation failed
     * @throws IOException          if writing failed
     */
    public String toXmlString() throws TransformerException, IOException {
        return toXmlString(true);
    }

    /**
     * Returns XML for the contained {@link Document}.
     *
     * @param prettyPrint if pretty printing is enabled for the generated XML code
     * @return the generated XML code
     * @throws TransformerException if XML transformation failed
     * @throws IOException          if writing failed
     */
    public final String toXmlString(boolean prettyPrint) throws TransformerException, IOException {
        try (StringWriter w = new StringWriter()) {
            this.toXml(w, prettyPrint);
            return w.toString();
        }
    }
}