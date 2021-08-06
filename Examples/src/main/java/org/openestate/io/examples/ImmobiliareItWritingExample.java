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
import org.apache.log4j.PropertyConfigurator;
import org.openestate.io.immobiliare_it.ImmobiliareItDocument;
import org.openestate.io.immobiliare_it.ImmobiliareItUtils;
import org.openestate.io.immobiliare_it.xml.Box;
import org.openestate.io.immobiliare_it.xml.BusinessElement;
import org.openestate.io.immobiliare_it.xml.ClassEnergy;
import org.openestate.io.immobiliare_it.xml.Clazz;
import org.openestate.io.immobiliare_it.xml.Feed;
import org.openestate.io.immobiliare_it.xml.Feed.Properties.Property;
import org.openestate.io.immobiliare_it.xml.Floor;
import org.openestate.io.immobiliare_it.xml.Furniture;
import org.openestate.io.immobiliare_it.xml.Garden;
import org.openestate.io.immobiliare_it.xml.Heat;
import org.openestate.io.immobiliare_it.xml.Kitchen;
import org.openestate.io.immobiliare_it.xml.LocationStructure.Locality.Neighbourhood.LocationNeighbourhoodType;
import org.openestate.io.immobiliare_it.xml.ObjectFactory;
import org.openestate.io.immobiliare_it.xml.Operation;
import org.openestate.io.immobiliare_it.xml.OwnershipType;
import org.openestate.io.immobiliare_it.xml.PictureExtended;
import org.openestate.io.immobiliare_it.xml.PictureProject;
import org.openestate.io.immobiliare_it.xml.PropertyType;
import org.openestate.io.immobiliare_it.xml.PropertyTypeBusiness;
import org.openestate.io.immobiliare_it.xml.PropertyTypeSimple;
import org.openestate.io.immobiliare_it.xml.Rental;
import org.openestate.io.immobiliare_it.xml.Status;
import org.openestate.io.immobiliare_it.xml.TerrainType;
import org.openestate.io.immobiliare_it.xml.VideoProject;
import org.openestate.io.immobiliare_it.xml.VideoType;
import org.openestate.io.immobiliare_it.xml.YesNoReady;
import org.openestate.io.immobiliare_it.xml.types.Category;
import org.openestate.io.immobiliare_it.xml.types.EnergyUnit;
import org.openestate.io.immobiliare_it.xml.types.LandSizeUnit;
import org.openestate.io.immobiliare_it.xml.types.SizeUnit;
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
        // init logging
        PropertyConfigurator.configure(
                ImmobiliareItWritingExample.class.getResource("log4j.properties"));

        // create a Feed object with some example data
        // this object corresponds to the <feed> root element in XML
        Feed feed = FACTORY.createFeed();

        // append some example objects to the Feed object
        feed.setProperties(FACTORY.createFeedProperties());
        int propertyCount = RandomUtils.nextInt(3, 5);
        for (int i = 0; i < propertyCount; i++) {
            feed.getProperties().getProperty().add(createProperty());
        }

        // convert the Feed object into a XML document
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
        write(doc, new NullOutputStream());

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
        Property obj = FACTORY.createFeedPropertiesProperty();
        obj.setBuildingStatus(randomValue(Status.values()));
        obj.setCategory(randomValue(Category.values()));
        obj.setDateExpiration(Calendar.getInstance());
        obj.setDateUpdated(Calendar.getInstance());
        obj.setOperation(randomValue(Operation.values()));
        obj.setUniqueId(RandomStringUtils.randomAlphanumeric(5));

        obj.setAgent(FACTORY.createFeedPropertiesPropertyAgent());
        obj.getAgent().setEmail(RANDOMIZER.getEmail());
        obj.getAgent().setOfficeName(RANDOMIZER.getName());

        obj.setBlueprints(FACTORY.createFeedPropertiesPropertyBlueprints());
        int blueprintCount = RandomUtils.nextInt(2, 5);
        for (int i = 0; i < blueprintCount; i++) {
            obj.getBlueprints().getBlueprint().add(createPictureExtended(i));
        }

        obj.setBuilding(FACTORY.createBuilding());
        obj.getBuilding().setCategory(randomValue(Category.values()));
        obj.getBuilding().setClazz(randomValue(Clazz.values()));
        obj.getBuilding().setDetail(randomValue(PropertyTypeBusiness.values()));
        obj.getBuilding().setStatus(randomValue(Status.values()));
        obj.getBuilding().setType(randomValue(PropertyType.values()));

        obj.setExtraFeatures(FACTORY.createFeedPropertiesPropertyExtraFeatures());
        obj.getExtraFeatures().setAirConditioning(RandomUtils.nextBoolean());
        obj.getExtraFeatures().setBalcony(RandomUtils.nextBoolean());
        obj.getExtraFeatures().setBathrooms(BigInteger.valueOf(RandomUtils.nextLong(1, 5)));
        obj.getExtraFeatures().setBeamHeight(BigInteger.valueOf(RandomUtils.nextLong(1, 10)));
        obj.getExtraFeatures().setBedrooms(BigInteger.valueOf(RandomUtils.nextLong(1, 5)));
        obj.getExtraFeatures().setBuildYear(RandomUtils.nextInt(1900, 2000));
        obj.getExtraFeatures().setDocDescription(RANDOMIZER.getWords(5, 10));
        obj.getExtraFeatures().setDocSpecification(RANDOMIZER.getWords(5, 10));
        obj.getExtraFeatures().setElevator(RandomUtils.nextBoolean());
        obj.getExtraFeatures().setFloorplannerUrl("http://floorplanner-url.it/" + RandomStringUtils.randomAlphanumeric(5));
        obj.getExtraFeatures().setFreeConditions(RANDOMIZER.getWords(5, 10));
        obj.getExtraFeatures().setFurniture(randomValue(Furniture.values()));
        obj.getExtraFeatures().setGarden(randomValue(Garden.values()));
        obj.getExtraFeatures().setHeating(randomValue(Heat.values()));
        obj.getExtraFeatures().setKitchen(randomValue(Kitchen.values()));
        obj.getExtraFeatures().setNet(RandomUtils.nextBoolean());
        obj.getExtraFeatures().setNumFloors(BigInteger.valueOf(RandomUtils.nextLong(1, 5)));
        obj.getExtraFeatures().setOverheadCrane(randomValue(YesNoReady.values()));
        obj.getExtraFeatures().setReception(RandomUtils.nextBoolean());
        obj.getExtraFeatures().setRentContract(randomValue(Rental.values()));
        obj.getExtraFeatures().setSecurityAlarm(RandomUtils.nextBoolean());
        obj.getExtraFeatures().setTerrace(RandomUtils.nextBoolean());
        obj.getExtraFeatures().setVirtualTour(RANDOMIZER.getWords(5, 10));

        obj.getExtraFeatures().setAdditionalCosts(FACTORY.createAdditionalCostsType());
        obj.getExtraFeatures().getAdditionalCosts().setCurrency(Currency.getInstance("EUR"));
        obj.getExtraFeatures().getAdditionalCosts().setValue(BigInteger.valueOf(RandomUtils.nextLong(0, 5000)));

        obj.getExtraFeatures().setExternalArea(FACTORY.createLandSizeType());
        obj.getExtraFeatures().getExternalArea().setUnit(randomValue(LandSizeUnit.values()));
        obj.getExtraFeatures().getExternalArea().setValue(BigInteger.valueOf(RandomUtils.nextLong(50, 5000)));

        obj.getExtraFeatures().setFloor(FACTORY.createFloor());
        obj.getExtraFeatures().getFloor().setType(randomValue(Floor.FloorType.values()));
        obj.getExtraFeatures().getFloor().setValue(BigInteger.valueOf(RandomUtils.nextLong(0, 10)));

        obj.getExtraFeatures().setGarage(FACTORY.createBox());
        obj.getExtraFeatures().getGarage().setType(randomValue(Box.BoxType.values()));
        obj.getExtraFeatures().getGarage().setValue(BigInteger.valueOf(RandomUtils.nextLong(0, 10)));

        obj.getExtraFeatures().setOfficeSize(FACTORY.createSizeType());
        obj.getExtraFeatures().getOfficeSize().setUnit(randomValue(SizeUnit.values()));
        obj.getExtraFeatures().getOfficeSize().setValue(BigInteger.valueOf(RandomUtils.nextLong(5, 50)));

        obj.setFeatures(FACTORY.createFeedPropertiesPropertyFeatures());
        obj.getFeatures().setEnergyClass(randomValue(ClassEnergy.values()));
        obj.getFeatures().setRooms(RandomUtils.nextInt(1, 5));

        obj.getFeatures().setEnergyPerformance(FACTORY.createClassEnergyPerformance());
        obj.getFeatures().getEnergyPerformance().setCertified(RandomUtils.nextBoolean());
        obj.getFeatures().getEnergyPerformance().setUnit(randomValue(EnergyUnit.values()));
        obj.getFeatures().getEnergyPerformance().setValue(RANDOMIZER.getWords(3, 10));

        obj.getFeatures().setPrice(FACTORY.createPriceType());
        obj.getFeatures().getPrice().setCurrency(Currency.getInstance("EUR"));
        obj.getFeatures().getPrice().setReserved(RandomUtils.nextBoolean());
        obj.getFeatures().getPrice().setValue(BigInteger.valueOf(RandomUtils.nextLong(500, 5000000)));

        obj.getFeatures().setSize(FACTORY.createSizeType());
        obj.getFeatures().getSize().setUnit(randomValue(SizeUnit.values()));
        obj.getFeatures().getSize().setValue(BigInteger.valueOf(RandomUtils.nextLong(50, 5000)));

        obj.setLocation(FACTORY.createLocationStructure());
        obj.getLocation().setAdministrativeArea(RANDOMIZER.getWords(3, 5));
        obj.getLocation().setCountryCode(randomValue(new String[]{"DE", "IT", "AT", "CH"}));

        obj.getLocation().setCity(FACTORY.createLocationStructureCity());
        obj.getLocation().getCity().setCode(BigInteger.valueOf(RandomUtils.nextLong(1, 1000)));
        obj.getLocation().getCity().setValue(RANDOMIZER.getCity());

        obj.getLocation().setLocality(FACTORY.createLocationStructureLocality());
        obj.getLocation().getLocality().setLatitude(BigDecimal.valueOf(RandomUtils.nextDouble(0, 90)));
        obj.getLocation().getLocality().setLongitude(BigDecimal.valueOf(RandomUtils.nextDouble(0, 90)));
        obj.getLocation().getLocality().setPostalCode(RANDOMIZER.getZipCode());

        obj.getLocation().getLocality().setNeighbourhood(FACTORY.createLocationStructureLocalityNeighbourhood());
        obj.getLocation().getLocality().getNeighbourhood().setId(BigInteger.valueOf(RandomUtils.nextInt(0, 10)));
        obj.getLocation().getLocality().getNeighbourhood().setType(randomValue(LocationNeighbourhoodType.values()));
        obj.getLocation().getLocality().getNeighbourhood().setValue(RANDOMIZER.getWords(3, 10));

        obj.getLocation().getLocality().setThoroughfare(FACTORY.createLocationStructureLocalityThoroughfare());
        obj.getLocation().getLocality().getThoroughfare().setDisplay(RandomUtils.nextBoolean());
        obj.getLocation().getLocality().getThoroughfare().setValue(RANDOMIZER.getWords(3, 10));

        obj.getLocation().setSubAdministrativeArea(FACTORY.createLocationStructureSubAdministrativeArea());
        obj.getLocation().getSubAdministrativeArea().setCode(RandomStringUtils.randomAlphanumeric(5));
        obj.getLocation().getSubAdministrativeArea().setValue(RANDOMIZER.getCity());

        obj.setPictures(FACTORY.createFeedPropertiesPropertyPictures());
        int pictureCount = RandomUtils.nextInt(2, 10);
        for (int i = 0; i < pictureCount; i++) {
            obj.getPictures().getPictureUrlAndPicture().add(createPicture(i));
        }

        obj.setPropertyType(FACTORY.createProptype());
        obj.getPropertyType().setBusinessType(FACTORY.createBusinessElement());
        obj.getPropertyType().getBusinessType().setCategory(randomValue(BusinessElement.BusinessElementCategory.values()));
        obj.getPropertyType().getBusinessType().setValue(randomValue(PropertyTypeBusiness.values()));
        obj.getPropertyType().setTerrains(FACTORY.createTerrains());
        obj.getPropertyType().getTerrains().getTerrain().add(randomValue(TerrainType.values()));
        obj.getPropertyType().setType(randomValue(PropertyTypeSimple.values()));

        obj.setTransactionType(FACTORY.createTransactionType());
        obj.getTransactionType().setAuction(RandomUtils.nextBoolean());
        obj.getTransactionType().setOwnership(randomValue(OwnershipType.values()));
        obj.getTransactionType().setValue(RANDOMIZER.getWords(3, 10));

        obj.setVideos(FACTORY.createFeedPropertiesPropertyVideos());
        int videoCount = RandomUtils.nextInt(1, 3);
        for (int i = 0; i < videoCount; i++) {
            obj.getVideos().getVideo().add(createVideo());
        }

        return obj;
    }

    /**
     * Create a {@link PictureProject} with some example data.
     *
     * @return created example object
     */
    private static PictureProject createPicture(int position) {
        PictureProject pic = FACTORY.createPictureProject();
        pic.setPosition(BigInteger.valueOf(position));
        pic.setValue("https://www.example.com/image-" + position + ".jpg");
        return pic;
    }

    /**
     * Create a {@link PictureExtended} with some example data.
     *
     * @param position image position
     * @return created example object
     */
    private static PictureExtended createPictureExtended(int position) {
        PictureExtended pic = FACTORY.createPictureExtended();
        pic.setPosition(BigInteger.valueOf(position));
        pic.setValue("image-" + position + ".jpg");
        pic.setUrl("https://www.example.com/" + pic.getValue());
        return pic;
    }

    /**
     * Create a {@link VideoProject} with some example data.
     *
     * @return created example object
     */
    private static VideoProject createVideo() {
        VideoProject video = FACTORY.createVideoProject();
        video.setType(VideoType.REMOTE);
        video.setValue("https://www.example.com/video-" + RandomUtils.nextInt(0, 999) + ".mp4");
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
    @SuppressWarnings("Duplicates")
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
            LOGGER.error("Can't write document into an OutputStream!");
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