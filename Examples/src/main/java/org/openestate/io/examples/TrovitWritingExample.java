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
import org.openestate.io.trovit.TrovitDocument;
import org.openestate.io.trovit.TrovitUtils;
import org.openestate.io.trovit.xml.AdType;
import org.openestate.io.trovit.xml.ObjectFactory;
import org.openestate.io.trovit.xml.PictureType;
import org.openestate.io.trovit.xml.Trovit;
import org.openestate.io.trovit.xml.types.AreaUnitValue;
import org.openestate.io.trovit.xml.types.ForeclosureTypeValue;
import org.openestate.io.trovit.xml.types.OrientationValue;
import org.openestate.io.trovit.xml.types.PricePeriodValue;
import org.openestate.io.trovit.xml.types.TypeValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Example for writing Trovit XML feeds.
 * <p>
 * This example illustrates the programmatic creation of Trovit documents and how they are written into XML.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public class TrovitWritingExample {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(TrovitWritingExample.class);
    private final static ObjectFactory FACTORY = TrovitUtils.getFactory();
    private final static Lorem RANDOMIZER = new LoremIpsum();
    private final static boolean PRETTY_PRINT = true;

    /**
     * Start the example application.
     *
     * @param args command line arguments
     */
    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        // create a Trovit object with some example data
        // this object corresponds to the <trovit> element in XML
        Trovit trovit = FACTORY.createTrovit();

        // append some example ads to the transfer
        int adCount = RandomUtils.nextInt(3, 10);
        for (int i = 0; i < adCount; i++) {
            trovit.getAd().add(createAd());
        }

        // convert the Trovit object into a XML document
        TrovitDocument doc = null;
        try {
            doc = TrovitDocument.newDocument(trovit);
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
        write(doc, NullOutputStream.NULL_OUTPUT_STREAM);

        // write XML document into a java.io.Writer
        write(doc, new NullWriter());

        // write XML document into a string and send it to the console
        writeToConsole(doc);
    }

    /**
     * Create an {@link AdType} with some example data.
     *
     * @return created example object
     */
    private static AdType createAd() {
        // create an example real estate
        AdType ad = FACTORY.createAdType();
        ad.setAddress(RANDOMIZER.getWords(1, 4));
        ad.setAgency(RANDOMIZER.getName());
        ad.setBathrooms(BigDecimal.valueOf(RandomUtils.nextDouble(0, 5)));
        ad.setByOwner(RandomUtils.nextBoolean());
        ad.setCity(RANDOMIZER.getCity());
        ad.setCityArea(RANDOMIZER.getWords(1, 3));
        ad.setCondition(RANDOMIZER.getWords(3, 10));
        ad.setContactEmail(RANDOMIZER.getEmail());
        ad.setContactName(RANDOMIZER.getName());
        ad.setContactTelephone(RANDOMIZER.getPhone());
        ad.setContent(RANDOMIZER.getWords(10, 50));
        ad.setCountry(randomValue(new String[]{"DE", "AT", "CH", "ES"}));
        ad.setDate(Calendar.getInstance());
        ad.setEcoScore(randomValue(new String[]{"A", "B", "C", "D"}));
        ad.setExpirationDate(Calendar.getInstance());
        ad.setFloorNumber(RandomStringUtils.randomNumeric(1));
        ad.setForeclosure(RandomUtils.nextBoolean());
        ad.setForeclosureType(randomValue(ForeclosureTypeValue.values()));
        ad.setId(RandomStringUtils.randomAlphanumeric(5));
        ad.setIsFurnished(RandomUtils.nextBoolean());
        ad.setIsNew(RandomUtils.nextBoolean());
        ad.setIsRentToOwn(RandomUtils.nextBoolean());
        ad.setLatitude(BigDecimal.valueOf(RandomUtils.nextDouble(0, 180) - 90));
        ad.setLongitude(BigDecimal.valueOf(RandomUtils.nextDouble(0, 360) - 180));
        ad.setMlsDatabase(RANDOMIZER.getWords(2, 5));
        ad.setNeighborhood(RANDOMIZER.getWords(10, 30));
        ad.setOrientation(randomValue(OrientationValue.values()));
        ad.setParking(RandomUtils.nextBoolean());
        ad.setPostcode(RANDOMIZER.getZipCode());
        ad.setPropertyType(RANDOMIZER.getWords(1, 5));
        ad.setRegion(RANDOMIZER.getStateFull());
        ad.setRooms(BigDecimal.valueOf(RandomUtils.nextDouble(1, 10)));
        ad.setTitle(RANDOMIZER.getWords(2, 6));
        ad.setType(randomValue(TypeValue.values()));
        ad.setYear(BigInteger.valueOf(RandomUtils.nextInt(1700, 2017)));

        ad.setFloorArea(FACTORY.createFloorAreaType());
        ad.getFloorArea().setUnit(randomValue(AreaUnitValue.values()));
        ad.getFloorArea().setValue(BigInteger.valueOf(RandomUtils.nextInt(10, 10000)));

        ad.setPictures(FACTORY.createAdTypePictures());
        int pictureCount = RandomUtils.nextInt(3, 10);
        for (int i = 0; i < pictureCount; i++) {
            ad.getPictures().getPicture().add(createPicture(i));
        }

        ad.setPlotArea(FACTORY.createPlotAreaType());
        ad.getPlotArea().setUnit(randomValue(AreaUnitValue.values()));
        ad.getPlotArea().setValue(BigInteger.valueOf(RandomUtils.nextInt(10, 10000)));

        ad.setPrice(FACTORY.createPriceType());
        ad.getPrice().setPeriod(randomValue(PricePeriodValue.values()));
        ad.getPrice().setValue(BigDecimal.valueOf(RandomUtils.nextDouble(100, 2000)));

        //noinspection CatchMayIgnoreException
        try {
            ad.setUrl(new URI("https://www.example.com/" + ad.getId()));
            ad.setMobileUrl(new URI("https://mobile.example.com/" + ad.getId()));
            ad.setVirtualTour(new URI("https://tour.example.com/" + ad.getId()));
        } catch (URISyntaxException ex) {
        }

        return ad;
    }

    /**
     * Create a {@link PictureType} with some example data.
     *
     * @param pos image position
     * @return created example object
     */
    private static PictureType createPicture(int pos) {
        try {
            PictureType pic = FACTORY.createPictureType();
            pic.setPictureTitle(RANDOMIZER.getWords(2, 5));
            pic.setPictureUrl(new URI("https://www.example.com/image" + pos + ".jpg"));
            pic.setFeatured(pos == 0);
            return pic;
        } catch (URISyntaxException ex) {
            return null;
        }
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
     * Write a {@link TrovitDocument} into a {@link File}.
     *
     * @param doc  the document to write
     * @param file the file, where the document is written to
     */
    @SuppressWarnings("Duplicates")
    private static void write(TrovitDocument doc, File file) {
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
     * Write a {@link TrovitDocument} into an {@link OutputStream}.
     *
     * @param doc    the document to write
     * @param output the stream, where the document is written to
     */
    @SuppressWarnings({"Duplicates", "SameParameterValue"})
    private static void write(TrovitDocument doc, OutputStream output) {
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
     * Write a {@link TrovitDocument} into a {@link Writer}.
     *
     * @param doc    the document to write
     * @param output the writer, where the document is written to
     */
    @SuppressWarnings("Duplicates")
    private static void write(TrovitDocument doc, Writer output) {
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
     * Write a {@link TrovitDocument} into a {@link String} and print the
     * results to the console.
     *
     * @param doc the document to write
     */
    @SuppressWarnings("Duplicates")
    private static void writeToConsole(TrovitDocument doc) {
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