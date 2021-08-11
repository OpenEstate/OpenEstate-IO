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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Currency;
import java.util.List;
import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.io.output.NullWriter;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.openestate.io.idx.IdxPrinter;
import org.openestate.io.idx.IdxRecord;
import org.openestate.io.idx.types.GrossPremium;
import org.openestate.io.idx.types.Language;
import org.openestate.io.idx.types.Media;
import org.openestate.io.idx.types.ObjectType;
import org.openestate.io.idx.types.OfferType;
import org.openestate.io.idx.types.PriceUnit;
import org.openestate.io.idx.types.Salutation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Example for writing IDX files.
 * <p>
 * This example illustrates the programmatic creation of IDX records and how they are written into CSV.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public class IdxWritingExample {
    private final static Logger LOGGER = LoggerFactory.getLogger(IdxWritingExample.class);
    private final static Lorem RANDOMIZER = new LoremIpsum();

    /**
     * Start the example application.
     *
     * @param args command line arguments
     */
    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        // create some CSV records
        List<IdxRecord> records = new ArrayList<>();
        int recordCount = RandomUtils.nextInt(5, 10);
        for (int i = 0; i < recordCount; i++) {
            records.add(createRecord());
        }

        // write CSV records into a java.io.File
        try {
            write(records, File.createTempFile("output-", ".csv"));
        } catch (IOException ex) {
            LOGGER.error("Can't create temporary file!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            System.exit(1);
        }

        // write CSV records into a java.io.OutputStream
        write(records, NullOutputStream.NULL_OUTPUT_STREAM);

        // write CSV records into a java.io.Writer
        write(records, new NullWriter());

        // write CSV records into a string and send it to the console
        writeToConsole(records);
    }

    /**
     * Create an {@link IdxRecord} with some example data.
     *
     * @return created example object
     */
    @SuppressWarnings("deprecation")
    private static IdxRecord createRecord() {
        // create an example real estate
        IdxRecord obj = new IdxRecord();
        obj.setAdvertisementId(RandomStringUtils.randomAlphanumeric(5));
        obj.setAgencyCity(RANDOMIZER.getCity());
        obj.setAgencyCountry(randomValue(new String[]{"de", "at", "ch"}));
        obj.setAgencyEmail(RANDOMIZER.getEmail());
        obj.setAgencyFax(RANDOMIZER.getPhone());
        obj.setAgencyId(RandomStringUtils.randomAlphanumeric(5));
        obj.setAgencyName(RANDOMIZER.getWords(1, 3));
        obj.setAgencyName2(RANDOMIZER.getWords(3, 5));
        obj.setAgencyPhone(RANDOMIZER.getPhone());
        obj.setAgencyReference(RandomStringUtils.randomAlphanumeric(5));
        obj.setAgencyStreet(RANDOMIZER.getWords(1, 3));
        obj.setAgencyZip(RANDOMIZER.getZipCode());
        obj.setAnimalAllowed(RandomUtils.nextBoolean());
        obj.setAvailableFrom(Calendar.getInstance());
        obj.setBalcony(RandomUtils.nextBoolean());
        obj.setBillingCompany(RANDOMIZER.getWords(1, 3));
        obj.setBillingCountry(RANDOMIZER.getCountry());
        obj.setBillingFirstName(RANDOMIZER.getFirstName());
        obj.setBillingLanguage(Language.GERMAN);
        obj.setBillingMobile(RANDOMIZER.getPhone());
        obj.setBillingName(RANDOMIZER.getLastName());
        obj.setBillingPhone(RANDOMIZER.getPhone());
        obj.setBillingPhone2(RANDOMIZER.getPhone());
        obj.setBillingPlaceName(RANDOMIZER.getCity());
        obj.setBillingPostBox(RANDOMIZER.getWords(1, 10));
        obj.setBillingSalutation(randomValue(Salutation.values()));
        obj.setBillingStreet(RANDOMIZER.getWords(1, 3));
        obj.setBillingZip(RANDOMIZER.getZipCode());
        obj.setBuildingLandConnected(RandomUtils.nextBoolean());
        obj.setCableTv(RandomUtils.nextBoolean());
        obj.setCarryingCapacityCrane(RandomUtils.nextDouble(500, 5000));
        obj.setCarryingCapacityElevator(RandomUtils.nextDouble(500, 5000));
        obj.setCeilingHeight(RandomUtils.nextDouble(2, 10));
        obj.setChildFriendly(RandomUtils.nextBoolean());
        obj.setCornerHouse(RandomUtils.nextBoolean());
        obj.setCurrency(Currency.getInstance("EUR"));
        obj.setDistanceKindergarten(RandomUtils.nextInt(50, 5000));
        obj.setDistanceMotorway(RandomUtils.nextInt(50, 5000));
        obj.setDistancePublicTransport(RandomUtils.nextInt(50, 5000));
        obj.setDistanceSchool1(RandomUtils.nextInt(50, 5000));
        obj.setDistanceSchool2(RandomUtils.nextInt(50, 5000));
        obj.setDistanceShop(RandomUtils.nextInt(50, 5000));
        obj.setElevator(RandomUtils.nextBoolean());
        obj.setFireplace(RandomUtils.nextBoolean());
        obj.setFlatSharingCommunity(RandomUtils.nextBoolean());
        obj.setFloor(RandomUtils.nextInt(0, 10));
        obj.setGarage(RandomUtils.nextBoolean());
        obj.setGardenhouse(RandomUtils.nextBoolean());
        obj.setGasSupply(RandomUtils.nextBoolean());
        obj.setGrossPremium(randomValue(GrossPremium.values()));
        obj.setHallHeight(RandomUtils.nextDouble(3, 15));
        obj.setIsdn(RandomUtils.nextBoolean());
        obj.setLastModified(Calendar.getInstance());
        obj.setLiftingPlatform(RandomUtils.nextBoolean());
        obj.setMaximalFloorLoading(RandomUtils.nextDouble(50, 5000));
        obj.setMiddleHouse(RandomUtils.nextBoolean());
        obj.setMinEnergyCertified(RandomUtils.nextBoolean());
        obj.setMinEnergyGeneral(RandomUtils.nextBoolean());
        obj.setNewBuilding(RandomUtils.nextBoolean());
        obj.setNumberOfApartments(RandomUtils.nextDouble(1, 10));
        obj.setNumberOfFloors(RandomUtils.nextInt(1, 10));
        obj.setNumberOfRooms(RandomUtils.nextDouble(1, 10));
        obj.setObjectCity(RANDOMIZER.getCity());
        obj.setObjectCountry(randomValue(new String[]{"de", "at", "ch"}));
        obj.setObjectDescription(RANDOMIZER.getWords(5, 100));
        obj.setObjectSituation(RANDOMIZER.getWords(3, 10));
        obj.setObjectState(RANDOMIZER.getStateAbbr());
        obj.setObjectStreet(RANDOMIZER.getWords(1, 3));
        obj.setObjectTitle(RANDOMIZER.getWords(3, 6));
        obj.setObjectType(randomValue(ObjectType.values()));
        obj.setObjectZip(RANDOMIZER.getZipCode());
        obj.setOfferType(randomValue(OfferType.values()));
        obj.setOldBuilding(RandomUtils.nextBoolean());
        obj.setOwnObjectUrl("https://www.example.com/object/" + RandomStringUtils.randomAlphanumeric(3));
        obj.setParking(RandomUtils.nextBoolean());
        obj.setPowerSupply(RandomUtils.nextBoolean());
        obj.setPriceUnit(randomValue(PriceUnit.values()));
        obj.setRailwayTerminal(RandomUtils.nextBoolean());
        obj.setRaisedGroundFloor(RandomUtils.nextBoolean());
        obj.setRamp(RandomUtils.nextBoolean());
        obj.setRefHouse(RandomStringUtils.randomAlphanumeric(5));
        obj.setRefObject(RandomStringUtils.randomAlphanumeric(5));
        obj.setRefProperty(RandomStringUtils.randomAlphanumeric(5));
        obj.setRentExtra(RandomUtils.nextLong(100, 1000));
        obj.setRentNet(RandomUtils.nextLong(100, 1000));
        obj.setRestrooms(RandomUtils.nextBoolean());
        obj.setSellingPrice(RandomUtils.nextLong(100, 1000));
        obj.setSenderId(RANDOMIZER.getWords(1, 3));
        obj.setSewageSupply(RandomUtils.nextBoolean());
        obj.setSparefield1(RANDOMIZER.getWords(1, 3));
        obj.setSparefield2(RANDOMIZER.getWords(1, 3));
        obj.setSparefield3(RANDOMIZER.getWords(1, 3));
        obj.setSparefield4(RANDOMIZER.getWords(1, 3));
        obj.setSurfaceLiving(RandomUtils.nextLong(50, 300));
        obj.setSurfaceProperty(RandomUtils.nextLong(100, 1000));
        obj.setSurfaceUsable(RandomUtils.nextLong(100, 1000));
        obj.setSwimmingpool(RandomUtils.nextBoolean());
        obj.setUnderBuildingLaws(RandomUtils.nextBoolean());
        obj.setUnderRoof(RandomUtils.nextBoolean());
        obj.setUrl("https://www.example.com/object/" + RandomStringUtils.randomAlphanumeric(3));
        obj.setView(RandomUtils.nextBoolean());
        obj.setVisitName(RANDOMIZER.getName());
        obj.setVisitPhone(RANDOMIZER.getPhone());
        obj.setVisitRemark(RANDOMIZER.getWords(1, 5));
        obj.setVolume(RandomUtils.nextLong(50, 500));
        obj.setWaterSupply(RandomUtils.nextBoolean());
        obj.setWheelcharAccessible(RandomUtils.nextBoolean());
        obj.setYearBuilt(RandomUtils.nextInt(1900, 1995));
        obj.setYearRenovated(RandomUtils.nextInt(1995, 2010));

        obj.setDocument(new Media(
                "document.pdf",
                "a document about the object"));
        obj.setMovie(new Media(
                "document.mp4",
                "a document about the object"));
        obj.setPicture1(new Media(
                "image1.jpg",
                "title for image 1",
                "description for image 1"));
        obj.setPicture2(new Media(
                "image2.jpg",
                "title for image 2",
                "description for image 2"));
        obj.setPicture3(new Media(
                "image3.jpg",
                "title for image 3",
                "description for image 3"));
        obj.setPicture4(new Media(
                "image4.jpg",
                "title for image 4",
                "description for image 4"));
        obj.setPicture5(new Media(
                "image5.jpg",
                "title for image 5",
                "description for image 5"));
        obj.setPicture6(new Media(
                "image6.jpg",
                "title for image 6",
                "description for image 6"));
        obj.setPicture7(new Media(
                "image7.jpg",
                "title for image 7",
                "description for image 7"));
        obj.setPicture8(new Media(
                "image8.jpg",
                "title for image 8",
                "description for image 8"));
        obj.setPicture9(new Media(
                "image9.jpg",
                "title for image 9",
                "description for image 9"));
        obj.setPicture10(new Media(
                "image10.jpg",
                "title for image 10",
                "description for image 10"));
        obj.setPicture11(new Media(
                "image11.jpg",
                "title for image 11",
                "description for image 11"));
        obj.setPicture12(new Media(
                "image12.jpg",
                "title for image 12",
                "description for image 12"));
        obj.setPicture13(new Media(
                "image13.jpg",
                "title for image 13",
                "description for image 13"));

        return obj;
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
     * Write some {@link IdxRecord} objects into a {@link File}.
     *
     * @param records the CSV records to write
     * @param file    the file, where the document is written to
     */
    private static void write(List<IdxRecord> records, File file) {
        LOGGER.info("writing document");
        try (IdxPrinter printer = IdxPrinter.create(file)) {
            printer.printRecords(records);
            LOGGER.info("> written to: " + file.getAbsolutePath());
        } catch (Exception ex) {
            LOGGER.error("Can't write document into a file!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            System.exit(1);
        }
    }

    /**
     * Write some {@link IdxRecord} objects into an {@link OutputStream}.
     *
     * @param records the CSV records to write
     * @param output  the stream, where the document is written to
     */
    @SuppressWarnings("SameParameterValue")
    private static void write(List<IdxRecord> records, OutputStream output) {
        LOGGER.info("writing document");
        try {
            IdxPrinter printer = IdxPrinter.create(output);
            printer.printRecords(records);
            LOGGER.info("> written to a java.io.OutputStream");
        } catch (Exception ex) {
            LOGGER.error("Can't write document into an OutputStream!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            System.exit(1);
        }
    }

    /**
     * Write some {@link IdxRecord} objects into a {@link Writer}.
     *
     * @param records the CSV records to write
     * @param output  the writer, where the document is written to
     */
    private static void write(List<IdxRecord> records, Writer output) {
        LOGGER.info("writing document");
        try {
            IdxPrinter printer = IdxPrinter.create(output);
            printer.printRecords(records);
            LOGGER.info("> written to a java.io.Writer");
        } catch (Exception ex) {
            LOGGER.error("Can't write document into an OutputStream!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            System.exit(1);
        }
    }

    /**
     * Write some {@link IdxRecord} objects into a {@link String} and print the
     * results to the console.
     *
     * @param records the CSV records to write
     */
    private static void writeToConsole(List<IdxRecord> records) {
        LOGGER.info("writing document");
        StringBuilder csv = new StringBuilder();
        try (IdxPrinter printer = IdxPrinter.create(csv)) {
            printer.printRecords(records);
            LOGGER.info(StringUtils.repeat("-", 50)
                    + System.lineSeparator() + csv);
        } catch (Exception ex) {
            LOGGER.error("Can't write document into a string!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            System.exit(1);
        }
    }
}