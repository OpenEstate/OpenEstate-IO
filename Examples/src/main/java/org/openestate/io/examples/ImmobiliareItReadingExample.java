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
import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
<<<<<<< HEAD
import org.apache.log4j.PropertyConfigurator;
=======
>>>>>>> develop
import org.openestate.io.immobiliare_it.ImmobiliareItDocument;
import org.openestate.io.immobiliare_it.ImmobiliareItUtils;
import org.openestate.io.immobiliare_it.xml.Descriptions;
import org.openestate.io.immobiliare_it.xml.Feed;
import org.openestate.io.immobiliare_it.xml.Property;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

/**
 * Example for reading XML files for <a href="https://www.immobiliare.it/">immobiliare.it</a>.
 * <p>
 * This example illustrates how to read XML files for <a href="https://www.immobiliare.it/">immobiliare.it</a>.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public class ImmobiliareItReadingExample {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(ImmobiliareItReadingExample.class);

    /**
     * Start the example application.
     *
     * @param args command line arguments
     */
    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        // read example files, if no files were specified as command line arguments
        if (args.length < 1) {
            try {
                read(ImmobiliareItReadingExample.class.getResourceAsStream("immobiliare_it.xml"));
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
     * Read a {@link File} into an {@link ImmobiliareItDocument} and print some
     * of its content to console.
     *
     * @param xmlFile the file to read
     * @throws SAXException                 if the file is not readable by the XML parser
     * @throws IOException                  if the file is not readable
     * @throws ParserConfigurationException if the XML parser is improperly configured
     * @throws JAXBException                if XML conversion into Java objects failed
     */
    private static void read(File xmlFile) throws SAXException, IOException, ParserConfigurationException, JAXBException {
        LOGGER.info("processing file '{}'", xmlFile.getAbsolutePath());
        if (!xmlFile.isFile()) {
            LOGGER.warn("> provided file is invalid");
            return;
        }
        ImmobiliareItDocument doc = ImmobiliareItUtils.createDocument(xmlFile);
        if (doc == null) {
            LOGGER.warn("> provided XML is not supported");
        } else {
            printToConsole(doc);
        }
    }

    /**
     * Read a {@link InputStream} into an {@link ImmobiliareItDocument} and print
     * some of its content to console.
     *
     * @param xmlInputStream the input stream to read
     * @throws SAXException                 if the file is not readable by the XML parser
     * @throws IOException                  if the file is not readable
     * @throws ParserConfigurationException if the XML parser is improperly configured
     * @throws JAXBException                if XML conversion into Java objects failed
     */
    private static void read(InputStream xmlInputStream) throws SAXException, IOException, ParserConfigurationException, JAXBException {
        LOGGER.info("processing example file");
        ImmobiliareItDocument doc = ImmobiliareItUtils.createDocument(xmlInputStream);
        if (doc == null) {
            LOGGER.warn("> provided XML is not supported");
        } else {
            printToConsole(doc);
        }
    }

    /**
     * Print some content of an {@link ImmobiliareItDocument} to console.
     *
     * @param doc the document to process
     * @throws JAXBException if XML conversion into Java objects failed
     */
    private static void printToConsole(ImmobiliareItDocument doc) throws JAXBException {
        LOGGER.info("> processing document in version {}", doc.getDocumentVersion());

        Feed feed = doc.toObject();

        // process properties
        if (feed.getProperties() != null) {
            for (Property object : feed.getProperties().getProperty()) {
                // get object nr
                String objectNr = object.getUniqueId();

                // get object description
                Descriptions descriptions = (object.getFeatures() != null) ?
                        object.getFeatures().getDescriptions() :
                        null;
                String objectInfo = (descriptions != null && !descriptions.getDescription().isEmpty()) ?
                        descriptions.getDescription().get(0).getContent() : null;

                // print object information to console
                LOGGER.info("> found object '{}': {}",
                        objectNr, objectInfo);
            }
        }
    }
}