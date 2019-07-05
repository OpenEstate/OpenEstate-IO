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
import org.openestate.io.daft_ie.DaftIeDocument;
import org.openestate.io.daft_ie.DaftIeUtils;
import org.openestate.io.daft_ie.xml.CommercialType;
import org.openestate.io.daft_ie.xml.Daft;
import org.openestate.io.daft_ie.xml.HouseType;
import org.openestate.io.daft_ie.xml.ObjectFactory;
import org.openestate.io.daft_ie.xml.OverseasRentalAdType;
import org.openestate.io.daft_ie.xml.OverseasSaleAdType;
import org.openestate.io.daft_ie.xml.PropertyType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Example for writing XML files for <a href="https://www.daft.ie/">daft.ie</a>.
 * <p>
 * This example illustrates the programmatic creation of documents for <a href="https://www.daft.ie/">daft.ie</a> and
 * how they are written into XML.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public class DaftIeWritingExample {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(DaftIeWritingExample.class);
    private final static ObjectFactory FACTORY = DaftIeUtils.getFactory();
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
                DaftIeWritingExample.class.getResource("log4j.properties"));

        // create a Daft object with some example data
        // this object corresponds to the <daft> root element in XML
        Daft daft = FACTORY.createDaft();

        // append some example objects for rent to the Daft object
        daft.setOverseasRental(FACTORY.createDaftOverseasRental());
        int rentalCount = RandomUtils.nextInt(5, 10);
        for (int i = 0; i < rentalCount; i++) {
            daft.getOverseasRental().getOverseasRentalAd().add(createAdForRent());
        }

        // append some example objects for sale to the Daft object
        daft.setOverseasSales(FACTORY.createDaftOverseasSales());
        int saleCount = RandomUtils.nextInt(5, 10);
        for (int i = 0; i < saleCount; i++) {
            daft.getOverseasSales().getOverseasSaleAd().add(createAdForSale());
        }

        // convert the Daft object into a XML document
        DaftIeDocument doc = null;
        try {
            doc = DaftIeDocument.newDocument(daft);
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
     * Create an {@link OverseasRentalAdType} with some example data.
     *
     * @return created example object
     */
    @SuppressWarnings("Duplicates")
    private static OverseasRentalAdType createAdForRent() {
        // create an example real estate for rent
        OverseasRentalAdType ad = FACTORY.createOverseasRentalAdType();
        ad.setAddress(RANDOMIZER.getWords(1, 3));
        ad.setAgentId(RandomStringUtils.randomAlphanumeric(1, 5));
        ad.setArea(RANDOMIZER.getCity());
        ad.setAvailableFrom(Calendar.getInstance());
        ad.setBathroomNumber(BigInteger.valueOf(RandomUtils.nextInt(1, 5)));
        ad.setBedroomNumber(BigInteger.valueOf(RandomUtils.nextInt(1, 5)));
        ad.setCableTelevision(RandomUtils.nextBoolean());
        ad.setCcEmail(RANDOMIZER.getEmail());
        ad.setCommercialType(randomValue(CommercialType.values()));
        ad.setContactName(RANDOMIZER.getName());
        ad.setCountry(randomValue(new String[]{"DE", "UK", "ES"}));
        ad.setDescription(RANDOMIZER.getWords(10, 50));
        ad.setDishwasher(RandomUtils.nextBoolean());
        ad.setDoubleBeds(BigInteger.valueOf(RandomUtils.nextInt(1, 5)));
        ad.setDryer(RandomUtils.nextBoolean());
        ad.setExternalId(RandomStringUtils.randomAlphanumeric(1, 4));
        ad.setFurnished(randomValue(OverseasRentalAdType.Furnished.values()));
        ad.setHouseType(randomValue(HouseType.values()));
        ad.setLease(BigInteger.valueOf(RandomUtils.nextInt(100, 1000)));
        ad.setMainEmail(RANDOMIZER.getEmail());
        ad.setMicrowave(RandomUtils.nextBoolean());
        ad.setNumberPeople(BigInteger.valueOf(RandomUtils.nextInt(1, 5)));
        ad.setPhone1(RANDOMIZER.getPhone());
        ad.setPhone2(RANDOMIZER.getPhone());
        ad.setPhoneInfo(RANDOMIZER.getWords(2, 10));
        ad.setPropertyType(randomValue(PropertyType.values()));
        ad.setRegion(RANDOMIZER.getCity());
        ad.setRent(BigInteger.valueOf(RandomUtils.nextInt(100, 1000)));
        ad.setRentCollectionPeriod(OverseasRentalAdType.RentPeriod.MONTHLY);
        ad.setSingleBeds(BigInteger.valueOf(RandomUtils.nextInt(1, 5)));
        ad.setTwinBeds(BigInteger.valueOf(RandomUtils.nextInt(1, 5)));
        ad.setWashingMachine(RandomUtils.nextBoolean());

        // add some features
        ad.setFeatures(FACTORY.createFeaturesType());
        int featureCount = RandomUtils.nextInt(3, 10);
        for (int i = 0; i < featureCount; i++) {
            ad.getFeatures().getFeature().add(RANDOMIZER.getWords(1, 4));
        }

        // add some photos
        ad.setPhotos(FACTORY.createPhotosType());
        int photoCount = RandomUtils.nextInt(5, 10);
        for (int i = 0; i < photoCount; i++) {
            //noinspection CatchMayIgnoreException
            try {
                ad.getPhotos().getPhoto().add(new URI("https://www.example.com/image-" + i + ".jpg"));
            } catch (URISyntaxException ex) {
            }
        }

        return ad;
    }

    /**
     * Create an {@link OverseasRentalAdType} with some example data.
     *
     * @return created example object
     */
    @SuppressWarnings("Duplicates")
    private static OverseasSaleAdType createAdForSale() {
        // create an example real estate for sale
        OverseasSaleAdType ad = FACTORY.createOverseasSaleAdType();
        ad.setAcres(BigDecimal.valueOf(RandomUtils.nextDouble(10, 1000)));
        ad.setAddress(RANDOMIZER.getWords(1, 3));
        ad.setAgentId(RandomStringUtils.randomAlphanumeric(1, 5));
        ad.setArea(RANDOMIZER.getCity());
        ad.setBathroomNumber(BigInteger.valueOf(RandomUtils.nextInt(1, 5)));
        ad.setBedroomNumber(BigInteger.valueOf(RandomUtils.nextInt(1, 5)));
        ad.setCcEmail(RANDOMIZER.getEmail());
        ad.setCo2Rating(RANDOMIZER.getWords(1, 3));
        ad.setCommercialType(CommercialType.SHOP);
        ad.setContactName(RANDOMIZER.getName());
        ad.setCountry(randomValue(new String[]{"DE", "UK", "ES"}));
        ad.setDescription(RANDOMIZER.getWords(10, 50));
        ad.setDirections(RANDOMIZER.getWords(3, 10));
        ad.setEnergyRating(RANDOMIZER.getWords(3, 10));
        ad.setExternalId(RandomStringUtils.randomAlphanumeric(1, 4));
        ad.setHouseType(randomValue(HouseType.values()));
        ad.setIsNewDevelopment(RandomUtils.nextBoolean());
        ad.setMainEmail(RANDOMIZER.getEmail());
        ad.setNewDevelopmentAvailability(RANDOMIZER.getWords(3, 10));
        ad.setPhone1(RANDOMIZER.getPhone());
        ad.setPhone2(RANDOMIZER.getPhone());
        ad.setPhoneInfo(RANDOMIZER.getWords(2, 10));
        ad.setPrice(BigInteger.valueOf(RandomUtils.nextInt(100, 1000000)));
        ad.setPriceType(randomValue(OverseasSaleAdType.PriceType.values()));
        ad.setPropertyStatus(randomValue(OverseasSaleAdType.PropertyStatus.values()));
        ad.setPropertyType(randomValue(PropertyType.values()));
        ad.setRegion(RANDOMIZER.getCity());
        ad.setSquareMetres(BigDecimal.valueOf(RandomUtils.nextDouble(10, 1000)));
        ad.setUnitsAvailable(BigInteger.valueOf(RandomUtils.nextInt(1, 50)));
        ad.setViewingDetails(RANDOMIZER.getWords(3, 10));

        // add some features
        ad.setFeatures(FACTORY.createFeaturesType());
        int featureCount = RandomUtils.nextInt(3, 10);
        for (int i = 0; i < featureCount; i++) {
            ad.getFeatures().getFeature().add(RANDOMIZER.getWords(1, 4));
        }

        // add some pdf documents
        ad.setPdfs(FACTORY.createPdfsType());
        int pdfCount = RandomUtils.nextInt(1, 3);
        for (int i = 0; i < pdfCount; i++) {
            //noinspection CatchMayIgnoreException
            try {
                ad.getPdfs().getPdf().add(new URI("https://www.example.com/document-" + i + ".pdf"));
            } catch (URISyntaxException ex) {
            }
        }

        // add some photos
        ad.setPhotos(FACTORY.createPhotosType());
        int photoCount = RandomUtils.nextInt(5, 10);
        for (int i = 0; i < photoCount; i++) {
            //noinspection CatchMayIgnoreException
            try {
                ad.getPhotos().getPhoto().add(new URI("https://www.example.com/image-" + i + ".jpg"));
            } catch (URISyntaxException ex) {
            }
        }

        return ad;
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
     * Write a {@link DaftIeDocument} into a {@link File}.
     *
     * @param doc  the document to write
     * @param file the file, where the document is written to
     */
    @SuppressWarnings("Duplicates")
    private static void write(DaftIeDocument doc, File file) {
        LOGGER.info("writing document with version " + doc.getDocumentVersion());
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
     * Write a {@link DaftIeDocument} into an {@link OutputStream}.
     *
     * @param doc    the document to write
     * @param output the stream, where the document is written to
     */
    @SuppressWarnings("Duplicates")
    private static void write(DaftIeDocument doc, OutputStream output) {
        LOGGER.info("writing document with version " + doc.getDocumentVersion());
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
     * Write a {@link DaftIeDocument} into a {@link Writer}.
     *
     * @param doc    the document to write
     * @param output the writer, where the document is written to
     */
    @SuppressWarnings("Duplicates")
    private static void write(DaftIeDocument doc, Writer output) {
        LOGGER.info("writing document with version " + doc.getDocumentVersion());
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
     * Write a {@link DaftIeDocument} into a {@link String} and print the
     * results to the console.
     *
     * @param doc the document to write
     */
    @SuppressWarnings("Duplicates")
    private static void writeToConsole(DaftIeDocument doc) {
        LOGGER.info("writing document with version " + doc.getDocumentVersion());
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