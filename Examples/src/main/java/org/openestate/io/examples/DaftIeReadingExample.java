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
import org.openestate.io.daft_ie.DaftIeDocument;
import org.openestate.io.daft_ie.DaftIeUtils;
import org.openestate.io.daft_ie.xml.Daft;
import org.openestate.io.daft_ie.xml.OverseasRentalAdType;
import org.openestate.io.daft_ie.xml.OverseasSaleAdType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

/**
 * Example for reading XML files for <a href="http://daft.ie">daft.ie</a>.
 * <p>
 * This example illustrates how to read XML files for
 * <a href="http://daft.ie">daft.ie</a>.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public class DaftIeReadingExample {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(DaftIeReadingExample.class);
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
                DaftIeReadingExample.class.getResource(PACKAGE + "/log4j.properties"));

        // read example files, if no files were specified as command line arguments
        if (args.length < 1) {
            try {
                read(DaftIeReadingExample.class.getResourceAsStream(PACKAGE + "/daft_ie.xml"));
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
     * Read a {@link File} into a {@link DaftIeDocument} and print some of its
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
        DaftIeDocument doc = DaftIeUtils.createDocument(xmlFile);
        if (doc == null) {
            LOGGER.warn("> provided XML is not supported");
        } else {
            printToConsole(doc);
        }
    }

    /**
     * Read a {@link InputStream} into an {@link DaftIeDocument} and print some
     * of its content to console.
     *
     * @param xmlInputStream the input stream to read
     * @throws SAXException                 if the file is not readable by the XML parser
     * @throws IOException                  if the file is not readable
     * @throws ParserConfigurationException if the XML parser is improperly configured
     * @throws JAXBException                if XML conversion into Java objects failed
     */
    protected static void read(InputStream xmlInputStream) throws SAXException, IOException, ParserConfigurationException, JAXBException {
        LOGGER.info("process example file");
        DaftIeDocument doc = DaftIeUtils.createDocument(xmlInputStream);
        if (doc == null) {
            LOGGER.warn("> provided XML is not supported");
        } else {
            printToConsole(doc);
        }
    }

    /**
     * Print some content of a {@link DaftIeDocument} to console.
     *
     * @param doc the document to process
     * @throws JAXBException if XML conversion into Java objects failed
     */
    protected static void printToConsole(DaftIeDocument doc) throws JAXBException {
        LOGGER.info("> process document in version "
                + doc.getDocumentVersion());

        Daft daft = doc.toObject();

        // process overseas rental
        if (daft.getOverseasRental() != null) {
            for (OverseasRentalAdType ad : daft.getOverseasRental().getOverseasRentalAd()) {
                // get object nr
                String objectNr = StringUtils.trimToNull(ad.getExternalId());
                if (objectNr == null) objectNr = "???";

                // get object description
                String objectInfo = StringUtils.trimToNull(ad.getDescription());
                if (objectInfo == null) objectInfo = "???";

                // print object information to console
                LOGGER.info("> found object "
                        + "'" + objectNr + "' for rent: " + objectInfo);
            }
        }

        // process overseas sales
        if (daft.getOverseasSales() != null) {
            for (OverseasSaleAdType ad : daft.getOverseasSales().getOverseasSaleAd()) {
                // get object nr
                String objectNr = StringUtils.trimToNull(ad.getExternalId());
                if (objectNr == null) objectNr = "???";

                // get object description
                String objectInfo = StringUtils.trimToNull(ad.getDescription());
                if (objectInfo == null) objectInfo = "???";

                // print object information to console
                LOGGER.info("> found object "
                        + "'" + objectNr + "' for sale: " + objectInfo);
            }
        }
    }
}