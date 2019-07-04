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
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Calendar;
import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.io.output.NullWriter;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openestate.io.immobar_it.ImmobarItDocument;
import org.openestate.io.immobar_it.ImmobarItUtils;
import org.openestate.io.immobar_it.xml.CompanyType;
import org.openestate.io.immobar_it.xml.ObjectFactory;
import org.openestate.io.immobar_it.xml.PropertyType;
import org.openestate.io.immobar_it.xml.Realestate;
import org.openestate.io.immobar_it.xml.types.ImmotypeValue;
import org.openestate.io.immobar_it.xml.types.RevenuetypeValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Example for writing XML feeds of <a href="https://www.immobar.it/">immobar.it</a>.
 * <p>
 * This example illustrates the programmatic creation of <a href="https://www.immobar.it/">immobar.it</a> documents and
 * how they are written into XML.
 *
 * @author Andreas Rudolph
 * @since 1.5
 */
public class ImmobarItWritingExample {
    private final static Logger LOGGER = LoggerFactory.getLogger(ImmobarItWritingExample.class);
    private final static ObjectFactory FACTORY = ImmobarItUtils.getFactory();
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
        PropertyConfigurator.configure(ImmobarItWritingExample.class.getResource("log4j.properties"));

        // create a Realestate object with some example data
        // this object corresponds to the <realestate> element in XML
        Realestate realestate = FACTORY.createRealestate();

        // append some example companies to the transfer
        int companyCount = RandomUtils.nextInt(1, 3);
        for (int i = 0; i < companyCount; i++) {
            realestate.getCompany().add(createCompany());
        }

        // convert the Realestate object into a XML document
        ImmobarItDocument doc = null;
        try {
            doc = ImmobarItDocument.newDocument(realestate);
        } catch (Exception ex) {
            LOGGER.error("Can't create XML document!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            System.exit(1);
        }

        // write XML document into a java.io.File
        try {
            write(doc, File.createTempFile("output-", ".xml"));
        } catch (IOException ex) {
            LOGGER.error("Can't create temporary file!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            System.exit(1);
        }

        // write XML document into a java.io.OutputStream
        write(doc, new NullOutputStream());

        // write XML document into a java.io.Writer
        write(doc, new NullWriter());

        // write XML document into a string and send it to the console
        writeToConsole(doc);
    }

    /**
     * Create a {@link CompanyType} with some example data.
     *
     * @return created example object
     */
    private static CompanyType createCompany() {
        // create an example company
        CompanyType company = FACTORY.createCompanyType();

        company.setCompanyNameDe(RANDOMIZER.getName());
        company.setCompanyAddressDe(RANDOMIZER.getWords(1, 3));
        company.setCompanyLocationDe(RANDOMIZER.getCity());

        company.setCompanyNameIt(RANDOMIZER.getName());
        company.setCompanyAddressIt(RANDOMIZER.getWords(1, 3));
        company.setCompanyLocationIt(RANDOMIZER.getCity());

        company.setCompanyPostalcode(RANDOMIZER.getZipCode());
        company.setCompanyProvince(RANDOMIZER.getStateAbbr());
        company.setCompanyCountry("IT");

        company.setCompanyEmail(RANDOMIZER.getEmail());
        company.setCompanyPhone(RANDOMIZER.getPhone());
        company.setCompanyMobile(RANDOMIZER.getPhone());
        company.setCompanyFax(RANDOMIZER.getPhone());

        company.setCompanyISTAT(RandomStringUtils.randomNumeric(5));

        //noinspection CatchMayIgnoreException
        try {
            company.setCompanyWebsite(new URI("https://www.example.com"));
        } catch (URISyntaxException ex) {
        }

        // append some example properties to the company
        int propertyCount = RandomUtils.nextInt(3, 5);
        for (int i = 0; i < propertyCount; i++) {
            company.getProperty().add(createProperty());
        }

        return company;
    }

    /**
     * Create an {@link PropertyType} with some example data.
     *
     * @return created example object
     */
    private static PropertyType createProperty() {
        // create an example real estate
        PropertyType property = FACTORY.createPropertyType();

        property.setId(RandomStringUtils.randomAlphanumeric(5));
        property.setReferencenumber(RandomStringUtils.randomAlphanumeric(5));
        property.setISTATcode(RandomStringUtils.randomNumeric(5));

        property.setAddressDe(RANDOMIZER.getWords(1, 3));
        property.setLocationDe(RANDOMIZER.getCity());
        property.setDistrictDe(RANDOMIZER.getCity());

        property.setAddressIt(RANDOMIZER.getWords(1, 3));
        property.setLocationIt(RANDOMIZER.getCity());
        property.setDistrictIt(RANDOMIZER.getCity());

        property.setPostalcode(RandomStringUtils.randomNumeric(5));
        property.setProvince(RANDOMIZER.getStateAbbr());
        property.setCountry("IT");

        property.setLatitude(BigDecimal.valueOf(RandomUtils.nextDouble(0, 180) - 90));
        property.setLongitude(BigDecimal.valueOf(RandomUtils.nextDouble(0, 360) - 180));

        property.setTitleDe(RANDOMIZER.getWords(1, 3));
        property.setDescriptionDe(RANDOMIZER.getWords(10, 50));
        property.setHeatingDe(RANDOMIZER.getWords(1, 3));
        property.setKitchentypeDe(RANDOMIZER.getWords(1, 10));
        property.setParkinglottypeDe(RANDOMIZER.getWords(1, 10));

        property.setTitleIt(RANDOMIZER.getWords(1, 3));
        property.setDescriptionIt(RANDOMIZER.getWords(10, 50));
        property.setHeatingIt(RANDOMIZER.getWords(1, 3));
        property.setKitchentypeIt(RANDOMIZER.getWords(1, 10));
        property.setParkinglottypeIt(RANDOMIZER.getWords(1, 10));

        property.setCellar(RandomUtils.nextBoolean());
        property.setCommission(RandomUtils.nextBoolean());
        property.setContactpersonname(RANDOMIZER.getName());
        property.setConvention(RandomUtils.nextBoolean());
        property.setCountbathrooms(BigInteger.valueOf(RandomUtils.nextLong(0, 10)));
        property.setCountgarage(BigInteger.valueOf(RandomUtils.nextLong(0, 10)));
        property.setCountparkinglot(BigInteger.valueOf(RandomUtils.nextLong(0, 10)));
        property.setCountrooms(BigInteger.valueOf(RandomUtils.nextLong(0, 10)));
        property.setCountterrace(BigInteger.valueOf(RandomUtils.nextLong(0, 10)));
        property.setCreationdate(Calendar.getInstance());
        property.setDuplex(RandomUtils.nextBoolean());
        property.setElevator(RandomUtils.nextBoolean());
        property.setEnergyclass(randomValue(new String[]{"A", "B", "C", "D"}));
        property.setFloor(BigInteger.valueOf(RandomUtils.nextLong(0, 10)));
        property.setFloorisground(RandomUtils.nextBoolean());
        property.setFlooristop(RandomUtils.nextBoolean());
        property.setFurnished(RandomUtils.nextBoolean());
        property.setGarden(RandomUtils.nextBoolean());
        property.setImmotype(randomValue(ImmotypeValue.values()));
        property.setIpe(BigDecimal.valueOf(RandomUtils.nextDouble(0, 1000)));
        property.setLastmoddate(Calendar.getInstance());
        property.setPriceNet(BigDecimal.valueOf(RandomUtils.nextDouble(0, 10000)));
        property.setPriceOnRequest(RandomUtils.nextBoolean());
        property.setRevenuetype(randomValue(RevenuetypeValue.values()));
        property.setSqmCellar(BigDecimal.valueOf(RandomUtils.nextDouble(0, 100)));
        property.setSqmGarden(BigDecimal.valueOf(RandomUtils.nextDouble(0, 100)));
        property.setSqmGross(BigDecimal.valueOf(RandomUtils.nextDouble(0, 100)));
        property.setSqmNet(BigDecimal.valueOf(RandomUtils.nextDouble(0, 100)));
        property.setSqmSale(BigDecimal.valueOf(RandomUtils.nextDouble(0, 100)));
        property.setUsed(RandomUtils.nextBoolean());
        property.setUtilities(BigDecimal.valueOf(RandomUtils.nextDouble(0, 100)));

        int imageCount = RandomUtils.nextInt(1, 9);
        for (int i = 0; i < imageCount; i++) {
            //noinspection CatchMayIgnoreException
            try {
                property.getImage().add(
                        new URI("https://www.example.com/image-" + i + ".jpg"));
            } catch (URISyntaxException ex) {
            }
        }

        int planimetryCount = RandomUtils.nextInt(1, 3);
        for (int i = 0; i < planimetryCount; i++) {
            //noinspection CatchMayIgnoreException
            try {
                property.getPlanimetry().add(
                        new URI("https://www.example.com/plan-" + i + ".jpg"));
            } catch (URISyntaxException ex) {
            }
        }


        return property;
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
     * Write a {@link ImmobarItDocument} into a {@link File}.
     *
     * @param doc  the document to write
     * @param file the file, where the document is written to
     */
    @SuppressWarnings("Duplicates")
    private static void write(ImmobarItDocument doc, File file) {
        LOGGER.info("writing document");
        try {
            doc.toXml(file, PRETTY_PRINT);
            LOGGER.info("> written to: " + file.getAbsolutePath());
        } catch (Exception ex) {
            LOGGER.error("Can't write document into a file!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            System.exit(1);
        }
    }

    /**
     * Write a {@link ImmobarItDocument} into an {@link OutputStream}.
     *
     * @param doc    the document to write
     * @param output the stream, where the document is written to
     */
    @SuppressWarnings("Duplicates")
    private static void write(ImmobarItDocument doc, OutputStream output) {
        LOGGER.info("writing document");
        try {
            doc.toXml(output, PRETTY_PRINT);
            LOGGER.info("> written to a java.io.OutputStream");
        } catch (Exception ex) {
            LOGGER.error("Can't write document into an OutputStream!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            System.exit(1);
        }
    }

    /**
     * Write a {@link ImmobarItDocument} into a {@link Writer}.
     *
     * @param doc    the document to write
     * @param output the writer, where the document is written to
     */
    @SuppressWarnings("Duplicates")
    private static void write(ImmobarItDocument doc, Writer output) {
        LOGGER.info("writing document");
        try {
            doc.toXml(output, PRETTY_PRINT);
            LOGGER.info("> written to a java.io.Writer");
        } catch (Exception ex) {
            LOGGER.error("Can't write document into an OutputStream!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            System.exit(1);
        }
    }

    /**
     * Write a {@link ImmobarItDocument} into a {@link String} and print the
     * results to the console.
     *
     * @param doc the document to write
     */
    @SuppressWarnings("Duplicates")
    private static void writeToConsole(ImmobarItDocument doc) {
        LOGGER.info("writing document");
        try {
            String xml = doc.toXmlString(PRETTY_PRINT);
            LOGGER.info(StringUtils.repeat("-", 50)
                    + System.lineSeparator() + xml);
        } catch (Exception ex) {
            LOGGER.error("Can't write document into a string!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            System.exit(1);
        }
    }
}