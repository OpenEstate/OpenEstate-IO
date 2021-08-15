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
import java.util.Calendar;
import java.util.Locale;
import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.io.output.NullWriter;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.openestate.io.openimmo.OpenImmoTransferDocument;
import org.openestate.io.openimmo.OpenImmoUtils;
import org.openestate.io.openimmo.OpenImmoVersion;
import org.openestate.io.openimmo.xml.Aktion;
import org.openestate.io.openimmo.xml.Anbieter;
import org.openestate.io.openimmo.xml.Anhang;
import org.openestate.io.openimmo.xml.Haus;
import org.openestate.io.openimmo.xml.Immobilie;
import org.openestate.io.openimmo.xml.ObjectFactory;
import org.openestate.io.openimmo.xml.Openimmo;
import org.openestate.io.openimmo.xml.Uebertragung;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Example for writing OpenImmo files.
 * <p>
 * This example illustrates the programmatic creation of OpenImmo documents, how they are written into XML and how they
 * are downgraded to earlier versions.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public class OpenImmoWritingExample {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(OpenImmoWritingExample.class);
    private final static ObjectFactory FACTORY = OpenImmoUtils.getFactory();
    private final static Lorem RANDOMIZER = new LoremIpsum();
    private final static boolean PRETTY_PRINT = true;

    /**
     * Start the example application.
     *
     * @param args command line arguments
     */
    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        // create an Openimmo object with some example data
        // this object corresponds to the <openimmo> root element in XML
        Openimmo openimmo = FACTORY.createOpenimmo();
        openimmo.setUebertragung(createUebertragung());

        int anbieterCount = RandomUtils.nextInt(1, 5);
        for (int i = 0; i < anbieterCount; i++) {
            openimmo.getAnbieter().add(createAnbieter());
        }

        // convert the Openimmo object into an XML document
        OpenImmoTransferDocument doc = null;
        try {
            doc = OpenImmoTransferDocument.newDocument(openimmo);
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

        // downgrade XML document to an earlier version
        // and write it to the console
        doc.downgrade(OpenImmoVersion.V1_2_3);
        writeToConsole(doc);

        // downgrade XML document to the first version
        // and write it to the console
        doc.downgrade(OpenImmoVersion.V1_1);
        writeToConsole(doc);
    }

    /**
     * Create an {@link Anbieter} with some example data.
     *
     * @return created example object
     */
    private static Anbieter createAnbieter() {
        // create an example agency
        Anbieter anbieter = FACTORY.createAnbieter();
        anbieter.setAnbieternr(RandomStringUtils.randomAlphanumeric(5));
        anbieter.setFirma(RANDOMIZER.getName());
        anbieter.setOpenimmoAnid(RandomStringUtils.randomAlphanumeric(5));

        // add some real estates to the agency
        int immobilieCount = RandomUtils.nextInt(1, 6);
        for (int i = 0; i < immobilieCount; i++) {
            anbieter.getImmobilie().add(createImmobilie());
        }

        return anbieter;
    }

    /**
     * Create an {@link Immobilie} with some example data.
     *
     * @return created example object
     */
    @SuppressWarnings("Duplicates")
    private static Immobilie createImmobilie() {
        // create an example real estate
        Immobilie immobilie = FACTORY.createImmobilie();

        // add some administrative information
        immobilie.setVerwaltungTechn(FACTORY.createVerwaltungTechn());
        immobilie.getVerwaltungTechn().setAktion(FACTORY.createAktion());
        immobilie.getVerwaltungTechn().getAktion().setAktionart(randomValue(Aktion.AktionArt.values()));
        immobilie.getVerwaltungTechn().setObjektnrIntern(RandomStringUtils.randomNumeric(10));

        // set categorization
        immobilie.setObjektkategorie(FACTORY.createObjektkategorie());
        immobilie.getObjektkategorie().setNutzungsart(FACTORY.createNutzungsart());
        immobilie.getObjektkategorie().getNutzungsart().setANLAGE(RandomUtils.nextBoolean());
        immobilie.getObjektkategorie().getNutzungsart().setGEWERBE(RandomUtils.nextBoolean());
        immobilie.getObjektkategorie().getNutzungsart().setWAZ(RandomUtils.nextBoolean());
        immobilie.getObjektkategorie().getNutzungsart().setWOHNEN(RandomUtils.nextBoolean());
        immobilie.getObjektkategorie().setVermarktungsart(FACTORY.createVermarktungsart());
        immobilie.getObjektkategorie().getVermarktungsart().setERBPACHT(RandomUtils.nextBoolean());
        immobilie.getObjektkategorie().getVermarktungsart().setKAUF(RandomUtils.nextBoolean());
        immobilie.getObjektkategorie().getVermarktungsart().setLEASING(RandomUtils.nextBoolean());
        immobilie.getObjektkategorie().getVermarktungsart().setMIETEPACHT(RandomUtils.nextBoolean());
        immobilie.getObjektkategorie().setObjektart(FACTORY.createObjektart());

        Haus singleFamilyHouse = FACTORY.createHaus();
        singleFamilyHouse.setHaustyp(randomValue(Haus.Haustyp.values()));
        immobilie.getObjektkategorie().getObjektart().getHaus().add(singleFamilyHouse);

        // add some information about the location
        immobilie.setGeo(FACTORY.createGeo());
        immobilie.getGeo().setPlz(RANDOMIZER.getZipCode());
        immobilie.getGeo().setOrt(RANDOMIZER.getCity());
        immobilie.getGeo().setLand(FACTORY.createLand());
        immobilie.getGeo().getLand().setIsoLand(Locale.GERMANY.getISO3Country());

        // add some information about prices
        immobilie.setPreise(FACTORY.createPreise());
        immobilie.getPreise().setHeizkosten(BigDecimal.valueOf(RandomUtils.nextDouble(100, 1000)));
        immobilie.getPreise().setKaufpreis(FACTORY.createKaufpreis());
        immobilie.getPreise().getKaufpreis().setAufAnfrage(RandomUtils.nextBoolean());
        immobilie.getPreise().getKaufpreis().setValue(BigDecimal.valueOf(RandomUtils.nextDouble(10000, 999999)));

        // add some information about features
        immobilie.setAusstattung(FACTORY.createAusstattung());
        immobilie.getAusstattung().setGaestewc(RandomUtils.nextBoolean());
        immobilie.getAusstattung().setGartennutzung(RandomUtils.nextBoolean());
        immobilie.getAusstattung().setHeizungsart(FACTORY.createHeizungsart());
        immobilie.getAusstattung().getHeizungsart().setZENTRAL(RandomUtils.nextBoolean());
        immobilie.getAusstattung().getHeizungsart().setFUSSBODEN(RandomUtils.nextBoolean());

        // add some descriptions
        immobilie.setFreitexte(FACTORY.createFreitexte());
        immobilie.getFreitexte().setObjekttitel(RANDOMIZER.getWords(1, 10));
        immobilie.getFreitexte().setObjektbeschreibung(RANDOMIZER.getWords(10, 50));

        // set the contact person
        immobilie.setKontaktperson(FACTORY.createKontaktperson());
        immobilie.getKontaktperson().setName(RANDOMIZER.getName());
        immobilie.getKontaktperson().setEmailDirekt(RANDOMIZER.getEmail());
        immobilie.getKontaktperson().setTelDurchw(RANDOMIZER.getPhone());
        immobilie.getKontaktperson().setPlz(RANDOMIZER.getZipCode());
        immobilie.getKontaktperson().setOrt(RANDOMIZER.getCity());
        immobilie.getKontaktperson().setLand(FACTORY.createLand());
        immobilie.getKontaktperson().getLand().setIsoLand(Locale.GERMANY.getISO3Country());

        // add some attachments
        immobilie.setAnhaenge(FACTORY.createAnhaenge());
        int attachmentCount = RandomUtils.nextInt(3, 10);
        for (int i = 0; i < attachmentCount; i++) {
            immobilie.getAnhaenge().getAnhang().add(createAnhang());
        }

        return immobilie;
    }

    /**
     * Create an {@link Anhang} with some example data.
     *
     * @return created example object
     */
    private static Anhang createAnhang() {
        // create an example transfer
        Anhang anhang = FACTORY.createAnhang();
        anhang.setAnhangtitel(RANDOMIZER.getWords(2, 5));
        anhang.setLocation(Anhang.Location.EXTERN);
        anhang.setFormat("image/jpeg");
        anhang.setDaten(FACTORY.createDaten());
        anhang.getDaten().setPfad("image" + RandomStringUtils.randomAlphabetic(3) + ".jpg");
        return anhang;
    }

    /**
     * Create an {@link Uebertragung} with some example data.
     *
     * @return created example object
     */
    private static Uebertragung createUebertragung() {
        // create an example transfer
        Uebertragung uebertragung = FACTORY.createUebertragung();
        uebertragung.setArt(randomValue(Uebertragung.Art.values()));
        uebertragung.setModus(randomValue(Uebertragung.Modus.values()));
        uebertragung.setSendersoftware(RANDOMIZER.getName());
        uebertragung.setSenderversion(RandomStringUtils.randomNumeric(1, 3));
        uebertragung.setTechnEmail(RANDOMIZER.getEmail());
        uebertragung.setTimestamp(Calendar.getInstance());
        uebertragung.setUmfang(randomValue(Uebertragung.Umfang.values()));
        return uebertragung;
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
     * Write an {@link OpenImmoTransferDocument} into a {@link File}.
     *
     * @param doc  the document to write
     * @param file the file, where the document is written to
     */
    @SuppressWarnings("Duplicates")
    private static void write(OpenImmoTransferDocument doc, File file) {
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
     * Write an {@link OpenImmoTransferDocument} into an {@link OutputStream}.
     *
     * @param doc    the document to write
     * @param output the stream, where the document is written to
     */
    @SuppressWarnings({"Duplicates", "SameParameterValue"})
    private static void write(OpenImmoTransferDocument doc, OutputStream output) {
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
     * Write an {@link OpenImmoTransferDocument} into a {@link Writer}.
     *
     * @param doc    the document to write
     * @param output the writer, where the document is written to
     */
    @SuppressWarnings("Duplicates")
    private static void write(OpenImmoTransferDocument doc, Writer output) {
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
     * Write an {@link OpenImmoTransferDocument} into a {@link String} and print the
     * results to the console.
     *
     * @param doc the document to write
     */
    @SuppressWarnings("Duplicates")
    private static void writeToConsole(OpenImmoTransferDocument doc) {
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