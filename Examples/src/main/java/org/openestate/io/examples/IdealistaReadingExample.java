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
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openestate.io.idealista.IdealistaRootElement;
import org.openestate.io.idealista.IdealistaUtils;
import org.openestate.io.idealista.json.AbstractFeatures;
import org.openestate.io.idealista.json.BuildingFeatures;
import org.openestate.io.idealista.json.Customer;
import org.openestate.io.idealista.json.GarageFeatures;
import org.openestate.io.idealista.json.HomeFeatures;
import org.openestate.io.idealista.json.LandFeatures;
import org.openestate.io.idealista.json.NewDevelopment;
import org.openestate.io.idealista.json.OfficeFeatures;
import org.openestate.io.idealista.json.Operation;
import org.openestate.io.idealista.json.PremiseFeatures;
import org.openestate.io.idealista.json.Property;
import org.openestate.io.idealista.json.StorageFeatures;
import org.openestate.io.idealista.json.Typology;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Example for reading JSON files for <a href="https://www.idealista.com/">idealista.com</a>.
 * <p>
 * This example illustrates how to read JSON files for <a href="https://www.idealista.com/">idealista.com</a>.
 *
 * @author Andreas Rudolph
 * @since 1.5
 */
public class IdealistaReadingExample {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(IdealistaReadingExample.class);

    /**
     * Start the example application.
     *
     * @param args command line arguments
     */
    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        // init logging
        PropertyConfigurator.configure(
                IdealistaReadingExample.class.getResource("log4j.properties"));

        // read example files, if no files were specified as command line arguments
        if (args.length < 1) {
            try {
                read(IdealistaReadingExample.class.getResourceAsStream("idealista-properties.json"));
                read(IdealistaReadingExample.class.getResourceAsStream("idealista-new-developments.json"));
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
     * Read a {@link File} into an {@link IdealistaRootElement} and print some
     * of its content to console.
     *
     * @param jsonFile the file to read
     * @throws IOException if the file is not readable
     */
    private static void read(File jsonFile) throws IOException {
        LOGGER.info("processing file '{}'", jsonFile.getAbsolutePath());
        if (!jsonFile.isFile()) {
            LOGGER.warn("> provided file is invalid");
            return;
        }
        printToConsole(IdealistaUtils.read(jsonFile));
    }

    /**
     * Read a {@link InputStream} into an {@link IdealistaRootElement} and print
     * some of its content to console.
     *
     * @param jsonInputStream the input stream to read
     * @throws IOException if the file is not readable
     */
    private static void read(InputStream jsonInputStream) throws IOException {
        LOGGER.info("processing example file");
        printToConsole(IdealistaUtils.read(jsonInputStream));
    }

    /**
     * Print some content of an {@link IdealistaRootElement} to console.
     *
     * @param root JSON root element
     */
    private static void printToConsole(IdealistaRootElement root) {
        Customer customer = root.getObject();
        LOGGER.info("> processing customer '{}' ({})",
                customer.getReference(), customer.getName());

        // process properties
        if (customer.getProperties() != null) {
            for (Property property : customer.getProperties()) {
                // get property nr
                String objectNr = StringUtils.defaultIfBlank(
                        property.getReference(),
                        property.getCode());

                // get operation type
                Operation.Type operationType = (property.getOperation() != null) ?
                        property.getOperation().getType() : null;

                // get property type
                Enum objectType;
                AbstractFeatures features = property.getFeatures();
                if (features instanceof BuildingFeatures) {
                    BuildingFeatures building = (BuildingFeatures) features;
                    objectType = building.getType();
                } else if (features instanceof GarageFeatures) {
                    GarageFeatures garage = (GarageFeatures) features;
                    objectType = garage.getType();
                } else if (features instanceof HomeFeatures) {
                    HomeFeatures home = (HomeFeatures) features;
                    objectType = home.getType();
                } else if (features instanceof LandFeatures) {
                    LandFeatures land = (LandFeatures) features;
                    objectType = land.getType();
                } else if (features instanceof OfficeFeatures) {
                    OfficeFeatures office = (OfficeFeatures) features;
                    objectType = office.getType();
                } else if (features instanceof PremiseFeatures) {
                    PremiseFeatures premise = (PremiseFeatures) features;
                    objectType = premise.getType();
                } else if (features instanceof StorageFeatures) {
                    StorageFeatures storage = (StorageFeatures) features;
                    objectType = storage.getType();
                } else {
                    if (features == null) {
                        LOGGER.warn("Property type is not set!");
                    } else {
                        LOGGER.warn("Unknown property type '{}'!",
                                features.getClass().getName());
                    }
                    continue;
                }

                // print object information to console
                LOGGER.info("> found property '{}' ({} / {})",
                        objectNr, objectType, operationType);
            }
        }

        // process new developments
        if (customer.getNewDevelopments() != null) {
            for (NewDevelopment newDevelopment : customer.getNewDevelopments()) {
                // get development nr
                String objectNr = StringUtils.defaultIfBlank(
                        newDevelopment.getReference(),
                        newDevelopment.getCode());

                // get typology types
                List<Enum> objectTypes = new ArrayList<>();
                if (newDevelopment.getTypologies() != null) {
                    for (Typology typology : newDevelopment.getTypologies()) {
                        AbstractFeatures features = typology.getFeatures();
                        if (features instanceof BuildingFeatures) {
                            BuildingFeatures building = (BuildingFeatures) features;
                            objectTypes.add(building.getType());
                        } else if (features instanceof GarageFeatures) {
                            GarageFeatures garage = (GarageFeatures) features;
                            objectTypes.add(garage.getType());
                        } else if (features instanceof HomeFeatures) {
                            HomeFeatures home = (HomeFeatures) features;
                            objectTypes.add(home.getType());
                        } else if (features instanceof LandFeatures) {
                            LandFeatures land = (LandFeatures) features;
                            objectTypes.add(land.getType());
                        } else if (features instanceof OfficeFeatures) {
                            OfficeFeatures office = (OfficeFeatures) features;
                            objectTypes.add(office.getType());
                        } else if (features instanceof PremiseFeatures) {
                            PremiseFeatures premise = (PremiseFeatures) features;
                            objectTypes.add(premise.getType());
                        } else if (features instanceof StorageFeatures) {
                            StorageFeatures storage = (StorageFeatures) features;
                            objectTypes.add(storage.getType());
                        } else {
                            if (features == null) {
                                LOGGER.warn("Property type is not set!");
                            } else {
                                LOGGER.warn("Unknown property type '{}'!",
                                        features.getClass().getName());
                            }
                        }
                    }
                }

                // print object information to console
                LOGGER.info("> found new development '{}' ({})",
                        objectNr, StringUtils.join(objectTypes, " / "));
            }
        }
    }
}
