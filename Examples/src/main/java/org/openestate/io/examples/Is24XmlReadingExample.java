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
package org.openestate.io.examples;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import org.openestate.io.is24_xml.Is24XmlDocument;
import org.openestate.io.is24_xml.Is24XmlUtils;
import org.openestate.io.is24_xml.xml.ImmobilieBaseTyp;
import org.openestate.io.is24_xml.xml.ImmobilienTransferTyp;
import org.openestate.io.is24_xml.xml.VirtuelleImmobilieBaseTyp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

/**
 * Example for reading IS24-XML files.
 * <p>
 * This example illustrates how to read IS24-XML files.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public class Is24XmlReadingExample {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(Is24XmlReadingExample.class);

    /**
     * Start the example application.
     *
     * @param args command line arguments
     */
    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        // read example file, if no files were specified as command line arguments
        if (args.length < 1) {
            try {
                read(Is24XmlReadingExample.class.getResourceAsStream("is24.xml"));
            } catch (Exception ex) {
                LOGGER.error("Can't read example file!");
                LOGGER.error("> " + ex.getLocalizedMessage(), ex);
                System.exit(2);
            }
        }

        // read files, that were specified as command line arguments
        else {
            for (String arg : args) {
                try {
                    read(new File(arg));
                } catch (Exception ex) {
                    LOGGER.error("Can't read file '{}'!", arg);
                    LOGGER.error("> " + ex.getLocalizedMessage(), ex);
                    System.exit(2);
                }
            }
        }
    }

    /**
     * Read a {@link File} into an {@link Is24XmlDocument} and print some of its
     * content to console.
     *
     * @param xmlFile the file to read
     * @throws SAXException                 if the file is not readable by the XML parser
     * @throws IOException                  if the file is not readable
     * @throws ParserConfigurationException if the XML parser is improperly configured
     * @throws JAXBException                if XML conversion into Java objects failed
     */
    protected static void read(File xmlFile) throws SAXException, IOException, ParserConfigurationException, JAXBException {
        LOGGER.info("processing file '{}'", xmlFile.getAbsolutePath());
        if (!xmlFile.isFile()) {
            LOGGER.warn("> provided file is invalid");
            return;
        }
        Is24XmlDocument doc = Is24XmlUtils.createDocument(xmlFile);
        if (doc == null) {
            LOGGER.warn("> provided XML is not supported");
        } else {
            printToConsole(doc);
        }
    }

    /**
     * Read an {@link InputStream} into an {@link Is24XmlDocument} and print some
     * of its content to console.
     *
     * @param xmlInputStream the input stream to read
     * @throws SAXException                 if the file is not readable by the XML parser
     * @throws IOException                  if the file is not readable
     * @throws ParserConfigurationException if the XML parser is improperly configured
     * @throws JAXBException                if XML conversion into Java objects failed
     */
    protected static void read(InputStream xmlInputStream) throws SAXException, IOException, ParserConfigurationException, JAXBException {
        LOGGER.info("processing example file");
        Is24XmlDocument doc = Is24XmlUtils.createDocument(xmlInputStream);
        if (doc == null) {
            LOGGER.warn("> provided XML is not supported");
        } else {
            printToConsole(doc);
        }
    }

    /**
     * Print some content of an {@link Is24XmlDocument} to console.
     *
     * @param doc the document to process
     * @throws JAXBException if XML conversion into Java objects failed
     */
    protected static void printToConsole(Is24XmlDocument doc) throws JAXBException {
        ImmobilienTransferTyp transfer = doc.toObject();

        // process agency in the document
        if (transfer.getAnbieter() != null) {
            // process objects
            for (JAXBElement<? extends ImmobilieBaseTyp> i : transfer.getAnbieter().getImmobilie()) {
                ImmobilieBaseTyp obj = i.getValue();

                // get object nr
                String objectNr = obj.getAnbieterObjektID();

                // get object title
                String objectTitle = obj.getUeberschrift();

                // print object information to console
                LOGGER.info("> found object '{}': {}",
                        objectNr, objectTitle);
            }

            // process virtual objects
            for (JAXBElement<? extends VirtuelleImmobilieBaseTyp> i : transfer.getAnbieter().getVirtuelleImmobilie()) {
                VirtuelleImmobilieBaseTyp obj = i.getValue();

                // get object nr
                String objectNr = obj.getAnbieterObjektID();

                // get object title
                String objectTitle = obj.getUeberschrift();

                // print object information to console
                LOGGER.info("> found virtual object '{}': {}",
                        objectNr, objectTitle);
            }
        }
    }
}