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
import org.openestate.io.immobar_it.ImmobarItDocument;
import org.openestate.io.immobar_it.ImmobarItUtils;
import org.openestate.io.immobar_it.xml.CompanyType;
import org.openestate.io.immobar_it.xml.PropertyType;
import org.openestate.io.immobar_it.xml.Realestate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

/**
 * Example for reading XML feeds of <a href="https://www.immobar.it/">immobar.it</a>.
 * <p>
 * This example illustrates how to read XML feeds of <a href="https://www.immobar.it/">immobar.it</a>.
 *
 * @author Andreas Rudolph
 * @since 1.5
 */
public class ImmobarItReadingExample {
    private final static Logger LOGGER = LoggerFactory.getLogger(ImmobarItReadingExample.class);

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
                read(ImmobarItReadingExample.class.getResourceAsStream("immobar_it.xml"));
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
     * Read a {@link File} into a {@link ImmobarItDocument} and print some of its
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
        ImmobarItDocument doc = ImmobarItUtils.createDocument(xmlFile);
        if (doc == null) {
            LOGGER.warn("> provided XML is not supported");
        } else {
            printToConsole(doc);
        }
    }

    /**
     * Read a {@link InputStream} into a {@link ImmobarItDocument} and print some of
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
        ImmobarItDocument doc = ImmobarItUtils.createDocument(xmlInputStream);
        if (doc == null) {
            LOGGER.warn("> provided XML is not supported");
        } else {
            printToConsole(doc);
        }
    }

    /**
     * Print some content of a {@link ImmobarItDocument} to console.
     *
     * @param doc the document to process
     * @throws JAXBException if XML conversion into Java objects failed
     */
    protected static void printToConsole(ImmobarItDocument doc) throws JAXBException {
        Realestate realestate = doc.toObject();

        // process companies
        for (CompanyType company : realestate.getCompany()) {

            // get german company name
            String companyNameDe = company.getCompanyNameDe();

            // get italian company name
            String companyNameIt = company.getCompanyNameIt();

            // print company information to console
            LOGGER.info("> found company '{}' / '{}'",
                    companyNameDe, companyNameIt);

            // process company properties
            for (PropertyType property : company.getProperty()) {
                // get object nr
                String objectNr = property.getId();

                // get german title
                String titleDe = property.getTitleDe();

                // get italian title
                String titleIt = property.getTitleIt();

                // print object information to console
                LOGGER.info(">> found object '{}': '{}' / '{}'",
                        objectNr, titleDe, titleIt);
            }
        }
    }
}