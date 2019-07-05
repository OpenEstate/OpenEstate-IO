/*
 * Copyright 2015-2019 OpenEstate.org.
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
import org.apache.log4j.PropertyConfigurator;
import org.openestate.io.trovit.TrovitDocument;
import org.openestate.io.trovit.TrovitUtils;
import org.openestate.io.trovit.xml.AdType;
import org.openestate.io.trovit.xml.Trovit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

/**
 * Example for reading Trovit XML feeds.
 * <p>
 * This example illustrates how to read Trovit XML feeds.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public class TrovitReadingExample {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(TrovitReadingExample.class);

    /**
     * Start the example application.
     *
     * @param args command line arguments
     */
    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        // init logging
        PropertyConfigurator.configure(
                TrovitReadingExample.class.getResource("log4j.properties"));

        // read example files, if no files were specified as command line arguments
        if (args.length < 1) {
            try {
                read(TrovitReadingExample.class.getResourceAsStream("trovit.xml"));
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
     * Read a {@link File} into a {@link TrovitDocument} and print some of its
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
        TrovitDocument doc = TrovitUtils.createDocument(xmlFile);
        if (doc == null) {
            LOGGER.warn("> provided XML is not supported");
        } else {
            printToConsole(doc);
        }
    }

    /**
     * Read a {@link InputStream} into a {@link TrovitDocument} and print some of
     * its content to console.
     *
     * @param xmlInputStream the input stream to read
     * @throws SAXException                 if the file is not readable by the XML parser
     * @throws IOException                  if the file is not readable
     * @throws ParserConfigurationException if the XML parser is improperly configured
     * @throws JAXBException                if XML conversion into Java objects failed
     */
    protected static void read(InputStream xmlInputStream) throws SAXException, IOException, ParserConfigurationException, JAXBException {
        LOGGER.info("processing example file");
        TrovitDocument doc = TrovitUtils.createDocument(xmlInputStream);
        if (doc == null) {
            LOGGER.warn("> provided XML is not supported");
        } else {
            printToConsole(doc);
        }
    }

    /**
     * Print some content of a {@link TrovitDocument} to console.
     *
     * @param doc the document to process
     * @throws JAXBException if XML conversion into Java objects failed
     */
    protected static void printToConsole(TrovitDocument doc) throws JAXBException {
        Trovit trovit = doc.toObject();

        // process ads
        for (AdType ad : trovit.getAd()) {
            // get object nr
            String objectNr = ad.getId();

            // get object title
            String objectTitle = ad.getTitle();

            // print object information to console
            LOGGER.info("> found object '{}': {}",
                    objectNr, objectTitle);
        }
    }
}