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
import java.io.OutputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Calendar;
import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.io.output.NullWriter;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openestate.io.examples.utils.RandomStringUtils;
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
 * This example illustrates the programatic creation of Trovit documents and how
 * they are written into XML.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public class TrovitWritingExample {
    private final static Logger LOGGER = LoggerFactory.getLogger(TrovitWritingExample.class);
    private final static String PACKAGE = "/org/openestate/io/examples";
    private final static ObjectFactory FACTORY = TrovitUtils.getFactory();
    private final static boolean PRETTY_PRINT = true;

    /**
     * Start the example application.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // init logging
        PropertyConfigurator.configure(
                TrovitWritingExample.class.getResource(PACKAGE + "/log4j.properties"));

        // create a Trovit object with some example data
        // this object corresponds to the <trovit> element in XML
        Trovit trovit = FACTORY.createTrovit();

        // append some example ads to the transfer
        trovit.getAd().add(createAd());
        trovit.getAd().add(createAd());
        trovit.getAd().add(createAd());

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
        write(doc, new NullOutputStream());

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
    protected static AdType createAd() {
        // create an example real estate
        AdType ad = FACTORY.createAdType();
        ad.setAddress("object address");
        ad.setAgency("name of the agency");
        ad.setBathrooms(BigDecimal.valueOf(RandomUtils.nextDouble(0, 5)));
        ad.setByOwner(RandomUtils.nextInt(0, 2) == 1);
        ad.setCity("name of the city");
        ad.setCityArea("name of the district");
        ad.setCondition("some notes about the condition");
        ad.setContactEmail("test@mywebsite.org");
        ad.setContactName("John Smith");
        ad.setContactTelephone("0049301234567");
        ad.setContent("some more descriptions");
        ad.setCountry("DE");
        ad.setDate(Calendar.getInstance());
        ad.setEcoScore("A");
        ad.setExpirationDate(Calendar.getInstance());
        ad.setFloorNumber("number of floors");
        ad.setForeclosure(RandomUtils.nextInt(0, 2) == 1);
        ad.setForeclosureType(ForeclosureTypeValue.values()[RandomUtils.nextInt(0, ForeclosureTypeValue.values().length)]);
        ad.setId(RandomStringUtils.random(5));
        ad.setIsFurnished(RandomUtils.nextInt(0, 2) == 1);
        ad.setIsNew(RandomUtils.nextInt(0, 2) == 1);
        ad.setIsRentToOwn(RandomUtils.nextInt(0, 2) == 1);
        ad.setLatitude(BigDecimal.valueOf(RandomUtils.nextDouble(0, 180) - 90));
        ad.setLongitude(BigDecimal.valueOf(RandomUtils.nextDouble(0, 360) - 180));
        ad.setMlsDatabase("notes about mls database");
        ad.setNeighborhood("notes about the neighborhood");
        ad.setOrientation(OrientationValue.values()[RandomUtils.nextInt(0, OrientationValue.values().length)]);
        ad.setParking(RandomUtils.nextInt(0, 2) == 1);
        ad.setPostcode("postcode");
        ad.setPropertyType("notes about the property type");
        ad.setRegion("notes about the region");
        ad.setRooms(BigDecimal.valueOf(RandomUtils.nextDouble(1, 10)));
        ad.setTitle("title of the object");
        ad.setType(TypeValue.values()[RandomUtils.nextInt(0, TypeValue.values().length)]);
        ad.setYear(BigInteger.valueOf(RandomUtils.nextInt(1700, 2017)));

        ad.setFloorArea(FACTORY.createFloorAreaType());
        ad.getFloorArea().setUnit(AreaUnitValue.values()[RandomUtils.nextInt(0, AreaUnitValue.values().length)]);
        ad.getFloorArea().setValue(BigInteger.valueOf(RandomUtils.nextInt(10, 10000)));

        ad.setPictures(FACTORY.createAdTypePictures());
        ad.getPictures().getPicture().add(createPicture(0));
        ad.getPictures().getPicture().add(createPicture(1));
        ad.getPictures().getPicture().add(createPicture(2));

        ad.setPlotArea(FACTORY.createPlotAreaType());
        ad.getPlotArea().setUnit(AreaUnitValue.values()[RandomUtils.nextInt(0, AreaUnitValue.values().length)]);
        ad.getPlotArea().setValue(BigInteger.valueOf(RandomUtils.nextInt(10, 10000)));

        ad.setPrice(FACTORY.createPriceType());
        ad.getPrice().setPeriod(PricePeriodValue.values()[RandomUtils.nextInt(0, PricePeriodValue.values().length)]);
        ad.getPrice().setValue(BigDecimal.valueOf(RandomUtils.nextDouble(100, 2000)).setScale(2, RoundingMode.HALF_EVEN));

        try {
            ad.setUrl(new URI("http://mywebsite.org/"));
            ad.setMobileUrl(new URI("http://mobile.mywebsite.org/"));
            ad.setVirtualTour(new URI("http://tour.mywebsite.org/"));
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
    protected static PictureType createPicture(int pos) {
        try {
            PictureType pic = FACTORY.createPictureType();
            pic.setPictureTitle("some descriptive title");
            pic.setPictureUrl(new URI("http://mywebsite.org/image" + pos + ".jpg"));
            pic.setFeatured(pos == 0);
            return pic;
        } catch (URISyntaxException ex) {
            return null;
        }
    }

    /**
     * Write a {@link TrovitDocument} into a {@link File}.
     *
     * @param doc  the document to write
     * @param file the file, where the document is written to
     */
    protected static void write(TrovitDocument doc, File file) {
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
    protected static void write(TrovitDocument doc, OutputStream output) {
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
    protected static void write(TrovitDocument doc, Writer output) {
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
    protected static void writeToConsole(TrovitDocument doc) {
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