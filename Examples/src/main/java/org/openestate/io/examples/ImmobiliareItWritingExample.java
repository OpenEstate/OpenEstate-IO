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
import java.util.Calendar;
import java.util.Currency;
import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.io.output.NullWriter;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.openestate.io.immobiliare_it.ImmobiliareItDocument;
import org.openestate.io.immobiliare_it.ImmobiliareItUtils;
import org.openestate.io.immobiliare_it.xml.ClassType;
import org.openestate.io.immobiliare_it.xml.DescriptionType;
import org.openestate.io.immobiliare_it.xml.Document;
import org.openestate.io.immobiliare_it.xml.Extended;
import org.openestate.io.immobiliare_it.xml.Feed;
import org.openestate.io.immobiliare_it.xml.FurnitureType;
import org.openestate.io.immobiliare_it.xml.GardenType;
import org.openestate.io.immobiliare_it.xml.KitchenType;
import org.openestate.io.immobiliare_it.xml.NationCodeType;
import org.openestate.io.immobiliare_it.xml.ObjectFactory;
import org.openestate.io.immobiliare_it.xml.OperationType;
import org.openestate.io.immobiliare_it.xml.OwnershipType;
import org.openestate.io.immobiliare_it.xml.Picture;
import org.openestate.io.immobiliare_it.xml.Property;
import org.openestate.io.immobiliare_it.xml.RentalType;
import org.openestate.io.immobiliare_it.xml.StatusType;
import org.openestate.io.immobiliare_it.xml.TerrainType;
import org.openestate.io.immobiliare_it.xml.Transaction;
import org.openestate.io.immobiliare_it.xml.Video;
import org.openestate.io.immobiliare_it.xml.YesNoReadyType;
import org.openestate.io.immobiliare_it.xml.types.SizeUnitType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Example for writing XML files for <a href="https://www.immobiliare.it/">immobiliare.it</a>.
 * <p>
 * This example illustrates the programmatic creation of documents for
 * <a href="https://www.immobiliare.it/">immobiliare.it</a> and how they are written into XML.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public class ImmobiliareItWritingExample {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(ImmobiliareItWritingExample.class);
    private final static ObjectFactory FACTORY = ImmobiliareItUtils.getFactory();
    private final static Lorem RANDOMIZER = new LoremIpsum();
    private final static boolean PRETTY_PRINT = true;

    /**
     * Start the example application.
     *
     * @param args command line arguments
     */
    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        // create a Feed object with some example data
        // this object corresponds to the <feed> root element in XML
        Feed feed = FACTORY.createFeed();

        // append some example objects to the Feed object
        feed.setProperties(FACTORY.createProperties());
        int propertyCount = RandomUtils.nextInt(3, 5);
        for (int i = 0; i < propertyCount; i++) {
            feed.getProperties().getProperty().add(createProperty());
        }

        // convert the Feed object into an XML document
        ImmobiliareItDocument doc = null;
        try {
            doc = ImmobiliareItDocument.newDocument(feed);
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
     * Create a {@link Property} with some example data.
     *
     * @return created example object
     */
    private static Property createProperty() {
        // create an example real estate for rent
        Property obj = FACTORY.createProperty();
        obj.setUniqueId(RandomStringUtils.randomAlphanumeric(5));
        obj.setDateUpdated(Calendar.getInstance());
        obj.setDateExpiration(Calendar.getInstance());
        obj.setOperation(randomValue(OperationType.values()));

        // add agent
        obj.setAgent(FACTORY.createAgent());
        obj.getAgent().setEmail(RANDOMIZER.getEmail());
        obj.getAgent().setOfficeName(RANDOMIZER.getName());

        // add a transaction
        obj.setTransactions(FACTORY.createTransactions());
        Transaction transaction = FACTORY.createTransaction();
        transaction.setAuction(RandomUtils.nextBoolean());
        transaction.setForRevenue(RandomUtils.nextBoolean());
        transaction.setOwnership(randomValue(OwnershipType.values()));
        transaction.setPrice(FACTORY.createPriceType());
        transaction.getPrice().setCurrency(Currency.getInstance("EUR"));
        transaction.getPrice().setReserved(RandomUtils.nextBoolean());
        transaction.getPrice().setValue(BigInteger.valueOf(RandomUtils.nextLong(100, 10000)));
        transaction.setType(RANDOMIZER.getWords(1, 3));
        obj.getTransactions().getTransaction().add(transaction);

        // add information about the building
        obj.setBuilding(FACTORY.createBuilding());
        obj.getBuilding().setClazz(randomValue(ClassType.values()));
        obj.getBuilding().setStatus(randomValue(StatusType.values()));

        // add some terrains to the building
        obj.getBuilding().setTerrains(FACTORY.createTerrains());
        int terrainCount = RandomUtils.nextInt(2, 5);
        for (int i = 0; i < terrainCount; i++) {
            obj.getBuilding().getTerrains().getTerrain().add(randomValue(TerrainType.values()));
        }

        // add some features
        obj.setFeatures(FACTORY.createFeaturesProperty());
        obj.getFeatures().setDescriptions(FACTORY.createDescriptions());
        for (NationCodeType lang : NationCodeType.values()) {
            obj.getFeatures().getDescriptions().getDescription().add(createDescription(lang));
        }
        obj.getFeatures().setSize(FACTORY.createSizeType());
        obj.getFeatures().getSize().setUnit(randomValue(SizeUnitType.values()));
        obj.getFeatures().getSize().setValue(BigInteger.valueOf(RandomUtils.nextLong(100, 1000)));

        // add some extra features
        obj.setExtraFeatures(FACTORY.createExtraFeatures());
        obj.getExtraFeatures().setAdditionalCosts(FACTORY.createAdditionalCostsType());
        obj.getExtraFeatures().getAdditionalCosts().setCurrency(Currency.getInstance("EUR"));
        obj.getExtraFeatures().getAdditionalCosts().setValue(BigDecimal.valueOf(RandomUtils.nextDouble(50, 1000)));
        obj.getExtraFeatures().setBalcony(RandomUtils.nextBoolean());
        obj.getExtraFeatures().setBedrooms(BigInteger.valueOf(RandomUtils.nextLong(1, 5)));
        obj.getExtraFeatures().setBuildYear(RandomUtils.nextInt(1990, 2020));
        obj.getExtraFeatures().setElevator(RandomUtils.nextBoolean());
        obj.getExtraFeatures().setFloorplannerUrl("https://floorplanner-url.it/" + RandomStringUtils.randomAlphanumeric(5));
        obj.getExtraFeatures().setFreeConditions(RANDOMIZER.getWords(5, 10));
        obj.getExtraFeatures().setFurniture(randomValue(FurnitureType.values()));
        obj.getExtraFeatures().setGarden(randomValue(GardenType.values()));
        obj.getExtraFeatures().setKitchen(randomValue(KitchenType.values()));
        obj.getExtraFeatures().setNet(RandomUtils.nextBoolean());
        obj.getExtraFeatures().setNumFloors(BigInteger.valueOf(RandomUtils.nextLong(1, 5)));
        obj.getExtraFeatures().setOverheadCrane(randomValue(YesNoReadyType.values()));
        obj.getExtraFeatures().setReception(RandomUtils.nextBoolean());
        obj.getExtraFeatures().setRentContract(randomValue(RentalType.values()));
        obj.getExtraFeatures().setSecurityAlarm(RandomUtils.nextBoolean());
        obj.getExtraFeatures().setTerrace(RandomUtils.nextBoolean());

        // add some extended attributes
        obj.setExtended(FACTORY.createExtended());
        obj.getExtended().setAmountBalcony(BigInteger.valueOf(RandomUtils.nextLong(1, 5)));
        obj.getExtended().setAmountBedrooms(BigInteger.valueOf(RandomUtils.nextLong(1, 5)));
        obj.getExtended().setAmountOtherRooms(BigInteger.valueOf(RandomUtils.nextLong(1, 5)));
        obj.getExtended().setAmountParking(BigInteger.valueOf(RandomUtils.nextLong(1, 5)));
        obj.getExtended().setAmountTerrace(BigInteger.valueOf(RandomUtils.nextLong(1, 5)));
        obj.getExtended().setBasement(RandomUtils.nextBoolean());
        obj.getExtended().setCloset(RandomUtils.nextBoolean());
        obj.getExtended().setExternalFrames(randomValue(Extended.ExternalFrames.values()));
        obj.getExtended().setFireplace(RandomUtils.nextBoolean());
        obj.getExtended().setSwimmingPool(RandomUtils.nextBoolean());
        obj.getExtended().setTv(randomValue(Extended.Tv.values()));

        // add some pictures
        obj.setPictures(FACTORY.createPictures());
        int pictureCount = RandomUtils.nextInt(2, 5);
        for (int i = 0; i < pictureCount; i++) {
            obj.getPictures().getPicture().add(createPicture(i));
        }

        // add some blueprints
        obj.setBlueprints(FACTORY.createBlueprints());
        int blueprintCount = RandomUtils.nextInt(2, 5);
        for (int i = 0; i < blueprintCount; i++) {
            obj.getBlueprints().getBlueprint().add(createPicture(i));
        }

        // add some videos
        obj.setVideos(FACTORY.createVideos());
        int videoCount = RandomUtils.nextInt(2, 5);
        for (int i = 0; i < videoCount; i++) {
            obj.getVideos().getVideo().add(createVideo(i));
        }

        // add some documents
        obj.setDocuments(FACTORY.createDocuments());
        int documentCount = RandomUtils.nextInt(2, 5);
        for (int i = 0; i < documentCount; i++) {
            obj.getDocuments().getDocument().add(createDocument(i));
        }

        return obj;
    }

    /**
     * Create a {@link DescriptionType} with some example data.
     *
     * @return created example object
     */
    private static DescriptionType createDescription(NationCodeType lang) {
        DescriptionType description = FACTORY.createDescriptionType();
        description.setNative(RandomUtils.nextBoolean());
        description.setLanguage(lang);
        description.setContent(RANDOMIZER.getWords(10, 100));
        description.setTitle(RANDOMIZER.getWords(2, 10));
        return description;
    }

    /**
     * Create a {@link Document} with some example data.
     *
     * @return created example object
     */
    private static Document createDocument(int position) {
        Document doc = FACTORY.createDocument();
        doc.setPosition(BigInteger.valueOf(position));
        doc.setUrl("https://www.example.com/document-" + position + ".pdf");
        doc.setMimetype("application/pdf");
        return doc;
    }

    /**
     * Create a {@link Picture} with some example data.
     *
     * @return created example object
     */
    private static Picture createPicture(int position) {
        Picture pic = FACTORY.createPicture();
        pic.setPosition(BigInteger.valueOf(position));
        pic.setUrl("https://www.example.com/image-" + position + ".jpg");
        return pic;
    }

    /**
     * Create a {@link Video} with some example data.
     *
     * @return created example object
     */
    private static Video createVideo(int position) {
        Video video = FACTORY.createVideo();
        video.setType(Video.Type.REMOTE);
        video.setValue("https://www.example.com/video-" + position + ".mp4");
        return video;
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
     * Write an {@link ImmobiliareItDocument} into a {@link File}.
     *
     * @param doc  the document to write
     * @param file the file, where the document is written to
     */
    @SuppressWarnings("Duplicates")
    private static void write(ImmobiliareItDocument doc, File file) {
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
     * Write an {@link ImmobiliareItDocument} into an {@link OutputStream}.
     *
     * @param doc    the document to write
     * @param output the stream, where the document is written to
     */
    @SuppressWarnings({"Duplicates", "SameParameterValue"})
    private static void write(ImmobiliareItDocument doc, OutputStream output) {
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
     * Write an {@link ImmobiliareItDocument} into a {@link Writer}.
     *
     * @param doc    the document to write
     * @param output the writer, where the document is written to
     */
    @SuppressWarnings("Duplicates")
    private static void write(ImmobiliareItDocument doc, Writer output) {
        LOGGER.info("writing document with version " + doc.getDocumentVersion());
        try {
            doc.toXml(output, PRETTY_PRINT);
            LOGGER.info("> written to a java.io.Writer");
        } catch (Exception ex) {
            LOGGER.error("Can't write document into a Writer!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            System.exit(1);
        }
    }

    /**
     * Write an {@link ImmobiliareItDocument} into a {@link String} and print the
     * results to the console.
     *
     * @param doc the document to write
     */
    @SuppressWarnings("Duplicates")
    private static void writeToConsole(ImmobiliareItDocument doc) {
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