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
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openestate.io.kyero.KyeroDocument;
import org.openestate.io.kyero.KyeroUtils;
import org.openestate.io.kyero.xml.PropertyType;
import org.openestate.io.kyero.xml.Root;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

/**
 * Example for reading Kyero XML feeds.
 * <p>
 * This example illustrates how to read Kyero XML feeds.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public class KyeroReadingExample {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(KyeroReadingExample.class);
    private final static String PACKAGE = "/org/openestate/io/examples";

    /**
     * Start the example application.
     *
     * @param args command line arguments
     */
    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        // init logging
        PropertyConfigurator.configure(
                KyeroReadingExample.class.getResource(PACKAGE + "/log4j.properties"));

        // read example files, if no files were specified as command line arguments
        if (args.length < 1) {
            try {
                read(KyeroReadingExample.class.getResourceAsStream(PACKAGE + "/kyero.xml"));
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
                    LOGGER.error("Can't read file '" + arg + "'!");
                    LOGGER.error("> " + ex.getLocalizedMessage(), ex);
                    System.exit(2);
                }
            }
        }
    }

    /**
     * Read a {@link File} into a {@link KyeroDocument} and print some of its
     * content to console.
     *
     * @param xmlFile the file to read
     * @throws SAXException                 if the file is not readable by the XML parser
     * @throws IOException                  if the file is not readable
     * @throws ParserConfigurationException if the XML parser is improperly configured
     * @throws JAXBException                if XML conversion into Java objects failed
     */
    protected static void read(File xmlFile) throws SAXException, IOException, ParserConfigurationException, JAXBException {
        LOGGER.info("process file: " + xmlFile.getAbsolutePath());
        if (!xmlFile.isFile()) {
            LOGGER.warn("> provided file is invalid");
            return;
        }
        KyeroDocument doc = KyeroUtils.createDocument(xmlFile);
        if (doc == null) {
            LOGGER.warn("> provided XML is not supported");
        } else {
            printToConsole(doc);
        }
    }

    /**
     * Read a {@link InputStream} into a {@link KyeroDocument} and print some of
     * its content to console.
     *
     * @param xmlInputStream the input stream to read
     * @throws SAXException                 if the file is not readable by the XML parser
     * @throws IOException                  if the file is not readable
     * @throws ParserConfigurationException if the XML parser is improperly configured
     * @throws JAXBException                if XML conversion into Java objects failed
     */
    protected static void read(InputStream xmlInputStream) throws SAXException, IOException, ParserConfigurationException, JAXBException {
        LOGGER.info("process example file");
        KyeroDocument doc = KyeroUtils.createDocument(xmlInputStream);
        if (doc == null) {
            LOGGER.warn("> provided XML is not supported");
        } else {
            printToConsole(doc);
        }
    }

    /**
     * Print some content of a {@link KyeroDocument} to console.
     *
     * @param doc the document to process
     * @throws JAXBException if XML conversion into Java objects failed
     */
    protected static void printToConsole(KyeroDocument doc) throws JAXBException {
        Root root = doc.toObject();

        // process properties in the document
        for (PropertyType obj : root.getProperty()) {
            // get object nr
            String objectNr = (obj.getId() != null) ?
                    obj.getId() : "???";

            // get object description
            String objectInfo = null;
            if (obj.getDesc() != null) {
                objectInfo = StringUtils.trimToNull(obj.getDesc().getEn());
                if (objectInfo == null)
                    objectInfo = StringUtils.trimToNull(obj.getDesc().getDe());
                if (objectInfo == null)
                    objectInfo = StringUtils.trimToNull(obj.getDesc().getEs());
            }

            // print object information to console
            LOGGER.info("> found object '" + objectNr + "' "
                    + "with title '" + objectInfo + "'");
        }
    }
}