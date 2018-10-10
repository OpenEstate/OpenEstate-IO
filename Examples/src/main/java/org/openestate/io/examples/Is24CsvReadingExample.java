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
package org.openestate.io.examples;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.PropertyConfigurator;
import org.openestate.io.is24_csv.Is24CsvParser;
import org.openestate.io.is24_csv.Is24CsvRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Example for reading IS24-CSV files.
 * <p>
 * This example illustrates the programatic creation of IS24-CSV records and how
 * they are written into CSV.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public class Is24CsvReadingExample {
    private final static Logger LOGGER = LoggerFactory.getLogger(Is24CsvReadingExample.class);
    private final static String PACKAGE = "/org/openestate/io/examples";

    /**
     * Start the example application.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // init logging
        PropertyConfigurator.configure(
                Is24CsvReadingExample.class.getResource(PACKAGE + "/log4j.properties"));

        // read example file, if no files were specified as command line arguments
        if (args.length < 1) {
            try {
                read(Is24CsvReadingExample.class.getResourceAsStream(PACKAGE + "/is24.csv"));
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
     * Read a {@link File} into an {@link Is24CsvParser} and print some of its
     * content to console.
     *
     * @param csvFile the CSV file to read
     * @throws IOException if the file is not readable
     */
    protected static void read(File csvFile) throws IOException {
        LOGGER.info("process file: " + csvFile.getAbsolutePath());
        if (!csvFile.isFile()) {
            LOGGER.warn("> The provided file is invalid!");
            return;
        }
        try (Is24CsvParser parser = Is24CsvParser.create(csvFile)) {
            if (parser == null)
                LOGGER.warn("> Can't create parser!");
            else
                printToConsole(parser);
        }
    }

    /**
     * Read an {@link InputStream} into an {@link Is24CsvParser} and print some of
     * its content to console.
     *
     * @param csvInputStream the input stream to read
     * @throws IOException if the file is not readable
     */
    protected static void read(InputStream csvInputStream) throws IOException {
        LOGGER.info("process example file");
        try (Is24CsvParser parser = Is24CsvParser.create(csvInputStream)) {
            if (parser == null)
                LOGGER.warn("> Can't create parser!");
            else
                printToConsole(parser);
        }
    }

    /**
     * Print some content of an {@link Is24CsvParser} to console.
     *
     * @param parser parser instance
     */
    protected static void printToConsole(Is24CsvParser parser) {
        // process records
        while (parser.hasNext()) {
            Is24CsvRecord record = parser.next();

            // get object nr
            String objectNr = record.getAnbieterObjektId();
            if (objectNr == null) objectNr = "???";

            // get object title
            String objectTitle = record.getUeberschrift();
            if (objectTitle == null) objectTitle = "???";

            // print object informations to console
            LOGGER.info("> found object '" + objectNr + "' "
                    + "with title '" + objectTitle + "'");
        }
    }
}