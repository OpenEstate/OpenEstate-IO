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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.io.output.NullWriter;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openestate.io.examples.utils.RandomStringUtils;
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
 * This example illustrates the programmatic creation of IDX records and how they
 * are written into CSV.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
@SuppressWarnings("WeakerAccess")
public class IdxWritingExample {
    private final static Logger LOGGER = LoggerFactory.getLogger(IdxWritingExample.class);
    private final static String PACKAGE = "/org/openestate/io/examples";

    /**
     * Start the example application.
     *
     * @param args command line arguments
     */
    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        // init logging
        PropertyConfigurator.configure(
                IdxWritingExample.class.getResource(PACKAGE + "/log4j.properties"));

        // create some CSV records
        List<IdxRecord> records = new ArrayList<>();
        records.add(createRecord());
        records.add(createRecord());
        records.add(createRecord());
        records.add(createRecord());

        // write CSV records into a java.io.File
        try {
            write(records, File.createTempFile("output-", ".csv"));
        } catch (IOException ex) {
            LOGGER.error("Can't create temporary file!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            System.exit(1);
        }

        // write CSV records into a java.io.OutputStream
        write(records, new NullOutputStream());

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
    protected static IdxRecord createRecord() {
        // create an example real estate
        IdxRecord obj = new IdxRecord();
        obj.setAdvertisementId(RandomStringUtils.random(5));
        obj.setAgencyCity("Berlin");
        obj.setAgencyCountry(Locale.GERMANY.getCountry());
        obj.setAgencyEmail("tester@test.org");
        obj.setAgencyFax("030/123456");
        obj.setAgencyId(RandomStringUtils.random(5));
        obj.setAgencyName("agency name");
        obj.setAgencyName2("additional agency name");
        obj.setAgencyPhone("030/123457");
        obj.setAgencyReference(RandomStringUtils.random(5));
        obj.setAgencyStreet("example street 123");
        obj.setAgencyZip("12345");
        obj.setAnimalAllowed(RandomUtils.nextInt(0, 2) == 1);
        obj.setAvailableFrom(Calendar.getInstance());
        obj.setBalcony(RandomUtils.nextInt(0, 2) == 1);
        obj.setBillingCompany("agency name");
        obj.setBillingCountry("Germany");
        obj.setBillingFirstName("Max");
        obj.setBillingLanguage(Language.GERMAN);
        obj.setBillingMobile("030/132456");
        obj.setBillingName("Mustermann");
        obj.setBillingPhone("030/123457");
        obj.setBillingPhone2("030/123458");
        obj.setBillingPlaceName("Berlin");
        obj.setBillingPostBox("additional address notes");
        obj.setBillingSalutation(Salutation.MALE);
        obj.setBillingStreet("example street 123");
        obj.setBillingZip("12345");
        obj.setBuildingLandConnected(RandomUtils.nextInt(0, 2) == 1);
        obj.setCableTv(RandomUtils.nextInt(0, 2) == 1);
        obj.setCarryingCapacityCrane(RandomUtils.nextDouble(500, 5000));
        obj.setCarryingCapacityElevator(RandomUtils.nextDouble(500, 5000));
        obj.setCeilingHeight(RandomUtils.nextDouble(2, 10));
        obj.setChildFriendly(RandomUtils.nextInt(0, 2) == 1);
        obj.setCornerHouse(RandomUtils.nextInt(0, 2) == 1);
        obj.setCurrency(Currency.getInstance("EUR"));
        obj.setDistanceKindergarten(RandomUtils.nextInt(50, 5000));
        obj.setDistanceMotorway(RandomUtils.nextInt(50, 5000));
        obj.setDistancePublicTransport(RandomUtils.nextInt(50, 5000));
        obj.setDistanceSchool1(RandomUtils.nextInt(50, 5000));
        obj.setDistanceSchool2(RandomUtils.nextInt(50, 5000));
        obj.setDistanceShop(RandomUtils.nextInt(50, 5000));
        obj.setElevator(RandomUtils.nextInt(0, 2) == 1);
        obj.setFireplace(RandomUtils.nextInt(0, 2) == 1);
        obj.setFlatSharingCommunity(RandomUtils.nextInt(0, 2) == 1);
        obj.setFloor(RandomUtils.nextInt(0, 10));
        obj.setGarage(RandomUtils.nextInt(0, 2) == 1);
        obj.setGardenhouse(RandomUtils.nextInt(0, 2) == 1);
        obj.setGasSupply(RandomUtils.nextInt(0, 2) == 1);
        obj.setGrossPremium(GrossPremium.FROM_4_UNTIL_5);
        obj.setHallHeight(RandomUtils.nextDouble(3, 15));
        obj.setIsdn(RandomUtils.nextInt(0, 2) == 1);
        obj.setLastModified(Calendar.getInstance());
        obj.setLiftingPlatform(RandomUtils.nextInt(0, 2) == 1);
        obj.setMaximalFloorLoading(RandomUtils.nextDouble(50, 5000));
        obj.setMiddleHouse(RandomUtils.nextInt(0, 2) == 1);
        obj.setMinEnergyCertified(RandomUtils.nextInt(0, 2) == 1);
        obj.setMinEnergyGeneral(RandomUtils.nextInt(0, 2) == 1);
        obj.setNewBuilding(RandomUtils.nextInt(0, 2) == 1);
        obj.setNumberOfApartments(RandomUtils.nextDouble(1, 10));
        obj.setNumberOfFloors(RandomUtils.nextInt(1, 10));
        obj.setNumberOfRooms(RandomUtils.nextDouble(1, 10));
        obj.setObjectCity("Berlin");
        obj.setObjectCountry(Locale.GERMANY.getCountry());
        obj.setObjectDescription("some description" + System.lineSeparator() + " about the object");
        obj.setObjectSituation("some description about the location");
        obj.setObjectState("BE");
        obj.setObjectStreet("example street 124");
        obj.setObjectTitle("title of object");
        obj.setObjectType(ObjectType.HOUSE_VILLA);
        obj.setObjectZip("12345");
        obj.setOfferType(OfferType.SALE);
        obj.setOldBuilding(RandomUtils.nextInt(0, 2) == 1);
        obj.setOwnObjectUrl("http://test.org/object/123");
        obj.setParking(RandomUtils.nextInt(0, 2) == 1);
        obj.setPowerSupply(RandomUtils.nextInt(0, 2) == 1);
        obj.setPriceUnit(PriceUnit.MONTHLY);
        obj.setRailwayTerminal(RandomUtils.nextInt(0, 2) == 1);
        obj.setRaisedGroundFloor(RandomUtils.nextInt(0, 2) == 1);
        obj.setRamp(RandomUtils.nextInt(0, 2) == 1);
        obj.setRefHouse(RandomStringUtils.random(5));
        obj.setRefObject(RandomStringUtils.random(5));
        obj.setRefProperty(RandomStringUtils.random(5));
        obj.setRentExtra(RandomUtils.nextLong(100, 1000));
        obj.setRentNet(RandomUtils.nextLong(100, 1000));
        obj.setRestrooms(RandomUtils.nextInt(0, 2) == 1);
        obj.setSellingPrice(RandomUtils.nextLong(100, 1000));
        obj.setSenderId("OpenEstate.org");
        obj.setSewageSupply(RandomUtils.nextInt(0, 2) == 1);
        obj.setSparefield1("spare field 1");
        obj.setSparefield2("spare field 2");
        obj.setSparefield3("spare field 3");
        obj.setSparefield4("spare field 4");
        obj.setSurfaceLiving(RandomUtils.nextLong(50, 300));
        obj.setSurfaceProperty(RandomUtils.nextLong(100, 1000));
        obj.setSurfaceUsable(RandomUtils.nextLong(100, 1000));
        obj.setSwimmingpool(RandomUtils.nextInt(0, 2) == 1);
        obj.setUnderBuildingLaws(RandomUtils.nextInt(0, 2) == 1);
        obj.setUnderRoof(RandomUtils.nextInt(0, 2) == 1);
        obj.setUrl("http://test.org/object/123");
        obj.setView(RandomUtils.nextInt(0, 2) == 1);
        obj.setVisitName("Max Mustermann");
        obj.setVisitPhone("030/123456");
        obj.setVisitRemark("notes about the contact person");
        obj.setVolume(RandomUtils.nextLong(50, 500));
        obj.setWaterSupply(RandomUtils.nextInt(0, 2) == 1);
        obj.setWheelcharAccessible(RandomUtils.nextInt(0, 2) == 1);
        obj.setYearBuilt(RandomUtils.nextInt(1900, 1995));
        obj.setYearRenovated(RandomUtils.nextInt(1995, 2010));

        obj.setDocument(
                new Media("document.pdf", "a document about the object"));
        obj.setMovie(
                new Media("document.mp4", "a document about the object"));
        obj.setPicture1(
                new Media("image1.jpg", "title for image 1", "description for image 1"));
        obj.setPicture2(
                new Media("image2.jpg", "title for image 2", "description for image 2"));
        obj.setPicture3(
                new Media("image3.jpg", "title for image 3", "description for image 3"));
        obj.setPicture4(
                new Media("image4.jpg", "title for image 4", "description for image 4"));
        obj.setPicture5(
                new Media("image5.jpg", "title for image 5", "description for image 5"));
        obj.setPicture6(
                new Media("image6.jpg", "title for image 6", "description for image 6"));
        obj.setPicture7(
                new Media("image7.jpg", "title for image 7", "description for image 7"));
        obj.setPicture8(
                new Media("image8.jpg", "title for image 8", "description for image 8"));
        obj.setPicture9(
                new Media("image9.jpg", "title for image 9", "description for image 9"));
        obj.setPicture10(
                new Media("image10.jpg", "title for image 10", "description for image 10"));
        obj.setPicture11(
                new Media("image11.jpg", "title for image 11", "description for image 11"));
        obj.setPicture12(
                new Media("image12.jpg", "title for image 12", "description for image 12"));
        obj.setPicture13(
                new Media("image13.jpg", "title for image 13", "description for image 13"));

        return obj;
    }

    /**
     * Write some {@link IdxRecord} objects into a {@link File}.
     *
     * @param records the CSV records to write
     * @param file    the file, where the document is written to
     */
    protected static void write(List<IdxRecord> records, File file) {
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
    protected static void write(List<IdxRecord> records, OutputStream output) {
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
    protected static void write(List<IdxRecord> records, Writer output) {
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
    protected static void writeToConsole(List<IdxRecord> records) {
        LOGGER.info("writing document");
        StringBuilder csv = new StringBuilder();
        try (IdxPrinter printer = IdxPrinter.create(csv)) {
            printer.printRecords(records);
            LOGGER.info(StringUtils.repeat("-", 50)
                    + System.lineSeparator() + csv.toString());
        } catch (Exception ex) {
            LOGGER.error("Can't write document into a string!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            System.exit(1);
        }
    }
}