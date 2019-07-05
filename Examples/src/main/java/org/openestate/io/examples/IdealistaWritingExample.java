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

import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.LinkedHashSet;
import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.io.output.NullWriter;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openestate.io.idealista.IdealistaCustomer;
import org.openestate.io.idealista.IdealistaUtils;
import org.openestate.io.idealista.json.Address;
import org.openestate.io.idealista.json.BathroomType;
import org.openestate.io.idealista.json.BuildingFeatures;
import org.openestate.io.idealista.json.ConditionedAirType;
import org.openestate.io.idealista.json.Contact;
import org.openestate.io.idealista.json.Customer;
import org.openestate.io.idealista.json.Description;
import org.openestate.io.idealista.json.HeatingType;
import org.openestate.io.idealista.json.HomeFeatures;
import org.openestate.io.idealista.json.Image;
import org.openestate.io.idealista.json.OfficeFeatures;
import org.openestate.io.idealista.json.Operation;
import org.openestate.io.idealista.json.Property;
import org.openestate.io.idealista.json.PropertyVisibilityType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Example for writing JSON files for <a href="https://www.idealista.com/">idealista.com</a>.
 * <p>
 * This example illustrates how to write JSON files for <a href="https://www.idealista.com/">idealista.com</a>.
 *
 * @author Andreas Rudolph
 * @since 1.5
 */
public class IdealistaWritingExample {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(IdealistaWritingExample.class);
    private final static Lorem RANDOMIZER = new LoremIpsum();
    private final static boolean PRETTY_PRINT = true;

    /**
     * Start the example application.
     *
     * @param args command line arguments
     */
    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        // init logging
        PropertyConfigurator.configure(
                ImmobiliareItWritingExample.class.getResource("log4j.properties"));

        // create a customer root object with some example data
        Customer customer = new Customer();
        customer.setReference(RandomStringUtils.randomAlphanumeric(5));
        customer.setSendDate(new Date());
        customer.setCountry(randomValue(Customer.Country.values()));

        // add global customer contact
        customer.setContact(createContact());

        // append some example properties to the customer object
        customer.setProperties(new LinkedHashSet<Property>());
        int propertyCount = RandomUtils.nextInt(5, 10);
        for (int i = 0; i < propertyCount; i++) {
            customer.getProperties().add(createProperty());
        }

        // wrap customer object into a JSON root element
        IdealistaCustomer root = new IdealistaCustomer(customer);

        // write JSON root element into a java.io.File
        try {
            write(root, File.createTempFile("output-", ".xml"));
        } catch (IOException ex) {
            LOGGER.error("Can't create temporary file!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            System.exit(1);
        }

        // write JSON root element into a java.io.OutputStream
        write(root, new NullOutputStream());

        // write JSON root element into a java.io.Writer
        write(root, new NullWriter());

        // write JSON root element into a string and send it to the console
        writeToConsole(root);
    }

    /**
     * Create a {@link Contact} with some example data.
     *
     * @return created example object
     */
    private static Contact createContact() {
        Contact contact = new Contact();
        contact.setName(RANDOMIZER.getName());
        contact.setEmail(RANDOMIZER.getEmail());
        contact.setPrimaryPhonePrefix(RandomStringUtils.randomNumeric(2));
        contact.setPrimaryPhoneNumber(RandomStringUtils.randomNumeric(5, 10));
        contact.setSecondaryPhonePrefix(RandomStringUtils.randomNumeric(2));
        contact.setSecondaryPhoneNumber(RandomStringUtils.randomNumeric(5, 10));
        return contact;
    }

    /**
     * Create a {@link Property} with some example data.
     *
     * @return created example object
     */
    private static Property createProperty() {
        // create an example real estate for rent
        Property obj = new Property();

        obj.setCode(RandomStringUtils.randomAlphanumeric(5));
        obj.setReference(RandomStringUtils.randomAlphanumeric(5));
        obj.setVisibility(randomValue(PropertyVisibilityType.values()));

        // add address
        obj.setAddress(new Address());
        obj.getAddress().setPostalCode(RandomStringUtils.randomNumeric(5));
        obj.getAddress().setTown(RANDOMIZER.getCity());
        obj.getAddress().setCountry(randomValue(Address.Country.values()));

        // add contact
        obj.setContact(createContact());

        // add operation (sale / rent)
        obj.setOperation(new Operation());
        obj.getOperation().setType(randomValue(Operation.Type.values()));
        obj.getOperation().setPrice(BigInteger.valueOf(RandomUtils.nextLong(1000, 99999)));

        //noinspection CatchMayIgnoreException
        try {
            obj.setUrl(new URI("https://example.com/property-"
                    + obj.getCode() + ".html"));
        } catch (URISyntaxException ex) {
        }

        // add random number of images
        obj.setImages(new LinkedHashSet<Image>());
        int imageCount = RandomUtils.nextInt(5, 10);
        for (int i = 0; i < imageCount; i++) {
            obj.getImages().add(createImage(i));
        }

        // add random descriptions
        obj.setDescriptions(new LinkedHashSet<Description>());
        for (Description.Language lang : Description.Language.values()) {
            Description d = new Description();
            d.setLanguage(lang);
            d.setText(RANDOMIZER.getWords(RandomUtils.nextInt(100, 200)));
            obj.getDescriptions().add(d);
        }

        // add random property type
        // idealista supports more property types, but for the sake of readability
        // we're just showing three variations here
        switch (RandomUtils.nextInt(0, 3)) {
            case 0:
                obj.setFeatures(createPropertyBuilding());
                break;
            case 1:
                obj.setFeatures(createPropertyHome());
                break;
            case 2:
                obj.setFeatures(createPropertyOffice());
                break;
        }

        return obj;
    }

    /**
     * Create a {@link BuildingFeatures} property type with some example data.
     *
     * @return created example object
     */
    private static BuildingFeatures createPropertyBuilding() {
        // This is just a selection of attributes, supported for buildings.
        BuildingFeatures building = new BuildingFeatures();
        building.setType(randomValue(BuildingFeatures.Type.values()));
        building.setAreaConstructed(BigInteger.valueOf(RandomUtils.nextLong(50, 1000)));
        building.setAreaTradableMinimum(BigInteger.valueOf(RandomUtils.nextLong(50, 1000)));
        building.setBuiltYear(BigInteger.valueOf(RandomUtils.nextLong(1990, 2020)));
        building.setClassificationChalet(RandomUtils.nextBoolean());
        building.setClassificationCommercial(RandomUtils.nextBoolean());
        building.setClassificationHotel(RandomUtils.nextBoolean());
        building.setClassificationIndustrial(RandomUtils.nextBoolean());
        building.setClassificationOffice(RandomUtils.nextBoolean());
        building.setClassificationOther(RandomUtils.nextBoolean());
        building.setFloorsBuilding(BigInteger.valueOf(RandomUtils.nextLong(1, 10)));
        building.setLiftNumber(BigInteger.valueOf(RandomUtils.nextLong(1, 5)));
        building.setParkingSpacesNumber(BigInteger.valueOf(RandomUtils.nextLong(1, 10)));
        building.setPropertyTenants(RandomUtils.nextBoolean());
        building.setSecurityPersonnel(RandomUtils.nextBoolean());
        return building;
    }

    /**
     * Create a {@link HomeFeatures} property type with some example data.
     *
     * @return created example object
     */
    private static HomeFeatures createPropertyHome() {
        // This is just a selection of attributes, supported for homes.
        HomeFeatures home = new HomeFeatures();
        home.setType(randomValue(HomeFeatures.Type.values()));
        home.setAreaConstructed(BigInteger.valueOf(RandomUtils.nextLong(50, 1000)));
        home.setAreaPlot(BigInteger.valueOf(RandomUtils.nextLong(200, 2000)));
        home.setAreaUsable(BigInteger.valueOf(RandomUtils.nextLong(200, 2000)));
        home.setBuiltYear(BigInteger.valueOf(RandomUtils.nextLong(1990, 2020)));
        home.setBathroomNumber(BigInteger.valueOf(RandomUtils.nextLong(1, 5)));
        home.setBedroomNumber(BigInteger.valueOf(RandomUtils.nextLong(1, 5)));
        home.setBalcony(RandomUtils.nextBoolean());
        home.setChimney(RandomUtils.nextBoolean());
        home.setConditionedAir(RandomUtils.nextBoolean());
        home.setDoorman(RandomUtils.nextBoolean());
        home.setDuplex(RandomUtils.nextBoolean());
        home.setHeatingType(randomValue(HeatingType.values()));
        home.setLiftAvailable(RandomUtils.nextBoolean());
        home.setEquippedKitchen(RandomUtils.nextBoolean());
        home.setEquippedWithFurniture(RandomUtils.nextBoolean());
        home.setFloorsInTop(RandomUtils.nextBoolean());
        home.setOrientationEast(RandomUtils.nextBoolean());
        home.setOrientationNorth(RandomUtils.nextBoolean());
        home.setOrientationSouth(RandomUtils.nextBoolean());
        home.setOrientationWest(RandomUtils.nextBoolean());
        return home;
    }

    /**
     * Create a {@link OfficeFeatures} property type with some example data.
     *
     * @return created example object
     */
    private static OfficeFeatures createPropertyOffice() {
        // This is just a selection of attributes, supported for offices.
        OfficeFeatures office = new OfficeFeatures();
        office.setType(randomValue(OfficeFeatures.Type.values()));
        office.setAreaConstructed(BigInteger.valueOf(RandomUtils.nextLong(50, 1000)));
        office.setAreaUsable(BigInteger.valueOf(RandomUtils.nextLong(50, 1000)));
        office.setBuiltYear(BigInteger.valueOf(RandomUtils.nextLong(1990, 2020)));
        office.setAccessControl(RandomUtils.nextBoolean());
        office.setBathroomInside(RandomUtils.nextBoolean());
        office.setBathroomNumber(BigInteger.valueOf(RandomUtils.nextLong(0, 5)));
        office.setBathroomType(randomValue(BathroomType.values()));
        office.setConditionedAir(RandomUtils.nextBoolean());
        office.setConditionedAirType(randomValue(ConditionedAirType.values()));
        office.setEmergencyExit(RandomUtils.nextBoolean());
        office.setEmergencyLights(RandomUtils.nextBoolean());
        office.setEquippedKitchen(RandomUtils.nextBoolean());
        office.setExtinguishers(RandomUtils.nextBoolean());
        office.setFireDetectors(RandomUtils.nextBoolean());
        office.setFireDoors(RandomUtils.nextBoolean());
        office.setFloorsBuilding(BigInteger.valueOf(RandomUtils.nextLong(1, 10)));
        office.setSuspendedFloor(RandomUtils.nextBoolean());
        office.setOrientationEast(RandomUtils.nextBoolean());
        office.setOrientationNorth(RandomUtils.nextBoolean());
        office.setOrientationSouth(RandomUtils.nextBoolean());
        office.setOrientationWest(RandomUtils.nextBoolean());
        return office;
    }

    /**
     * Create an {@link Image} with some example data.
     *
     * @param order image position
     * @return created example object
     */
    private static Image createImage(int order) {
        Image image = new Image();
        image.setOrder(BigInteger.valueOf(order));
        image.setLabel(randomValue(Image.Label.values()));

        //noinspection CatchMayIgnoreException
        try {
            image.setUrl(new URI("https://example.com/image-"
                    + RandomUtils.nextInt(0, 999) + ".jpg"));
        } catch (URISyntaxException ex) {
        }

        return image;
    }

    /**
     * Get a random value from an array.
     *
     * @param values array containing values to select from
     * @param <T>    type of contained values
     * @return randomly selected value
     */
    private static <T> T randomValue(T[] values) {
        return (values != null && values.length > 0) ?
                values[RandomUtils.nextInt(0, values.length)] :
                null;
    }

    /**
     * Write an {@link IdealistaCustomer} into a {@link File}.
     *
     * @param root the root element to write
     * @param file the file, where the document is written to
     */
    @SuppressWarnings("Duplicates")
    private static void write(IdealistaCustomer root, File file) {
        LOGGER.info("writing document");
        try (Writer w = new OutputStreamWriter(new FileOutputStream(file), IdealistaUtils.CHARSET)) {
            root.write(w, PRETTY_PRINT);
            LOGGER.info("> written to: " + file.getAbsolutePath());
        } catch (Exception ex) {
            LOGGER.error("Can't write document into a file!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            System.exit(1);
        }
    }

    /**
     * Write an {@link IdealistaCustomer} into an {@link OutputStream}.
     *
     * @param root   the root element to write
     * @param output the stream, where the document is written to
     */
    @SuppressWarnings("Duplicates")
    private static void write(IdealistaCustomer root, OutputStream output) {
        LOGGER.info("writing document");
        try (Writer w = new OutputStreamWriter(output, IdealistaUtils.CHARSET)) {
            root.write(w, PRETTY_PRINT);
            LOGGER.info("> written to a java.io.OutputStream");
        } catch (Exception ex) {
            LOGGER.error("Can't write document into an OutputStream!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            System.exit(1);
        }
    }

    /**
     * Write an {@link IdealistaCustomer} into a {@link Writer}.
     *
     * @param root   the root element to write
     * @param output the writer, where the document is written to
     */
    @SuppressWarnings("Duplicates")
    private static void write(IdealistaCustomer root, Writer output) {
        LOGGER.info("writing document");
        try {
            root.write(output, PRETTY_PRINT);
            LOGGER.info("> written to a java.io.Writer");
        } catch (Exception ex) {
            LOGGER.error("Can't write document into an OutputStream!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            System.exit(1);
        }
    }

    /**
     * Write an {@link IdealistaCustomer} into a {@link String} and print the
     * results to the console.
     *
     * @param doc the document to write
     */
    @SuppressWarnings("Duplicates")
    private static void writeToConsole(IdealistaCustomer doc) {
        LOGGER.info("writing document");
        try {
            String xml = doc.writeToString(PRETTY_PRINT);
            LOGGER.info(StringUtils.repeat("-", 50)
                    + System.lineSeparator() + xml);
        } catch (Exception ex) {
            LOGGER.error("Can't write document into a string!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            System.exit(1);
        }
    }
}
