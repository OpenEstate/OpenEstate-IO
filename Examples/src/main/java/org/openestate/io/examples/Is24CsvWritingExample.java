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
import java.util.Currency;
import java.util.List;
import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.io.output.NullWriter;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openestate.io.is24_csv.Is24CsvPrinter;
import org.openestate.io.is24_csv.Is24CsvRecord;
import org.openestate.io.is24_csv.records.HausKauf;
import org.openestate.io.is24_csv.records.WohnungMiete;
import org.openestate.io.is24_csv.types.Ausstattung;
import org.openestate.io.is24_csv.types.Auswahl;
import org.openestate.io.is24_csv.types.Bauphase;
import org.openestate.io.is24_csv.types.Befeuerungsart;
import org.openestate.io.is24_csv.types.Datei;
import org.openestate.io.is24_csv.types.DateiSuffix;
import org.openestate.io.is24_csv.types.DateiTyp;
import org.openestate.io.is24_csv.types.EnergieausweisTyp;
import org.openestate.io.is24_csv.types.Heizungsart;
import org.openestate.io.is24_csv.types.Importmodus;
import org.openestate.io.is24_csv.types.ObjektkategorieHaus;
import org.openestate.io.is24_csv.types.ObjektkategorieWohnung;
import org.openestate.io.is24_csv.types.Objektzustand;
import org.openestate.io.is24_csv.types.Stellplatz;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Example for writing IS24-CSV files.
 * <p>
 * This example illustrates the programmatic creation of an IS24-CSV document, and how the document is written into CSV.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public class Is24CsvWritingExample {
    private final static Logger LOGGER = LoggerFactory.getLogger(Is24CsvWritingExample.class);
    private final static Lorem RANDOMIZER = new LoremIpsum();

    /**
     * Start the example application.
     *
     * @param args command line arguments
     */
    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        // init logging
        PropertyConfigurator.configure(
                Is24CsvWritingExample.class.getResource("log4j.properties"));

        // create some CSV records
        List<Is24CsvRecord> records = new ArrayList<>();
        int hausKaufCount = RandomUtils.nextInt(1, 5);
        for (int i = 0; i < hausKaufCount; i++) {
            records.add(createHausKaufRecord());
        }
        int wohnungMieteCount = RandomUtils.nextInt(1, 5);
        for (int i = 0; i < wohnungMieteCount; i++) {
            records.add(createWohnungMieteRecord());
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
        write(records, new NullOutputStream());

        // write CSV records into a java.io.Writer
        write(records, new NullWriter());

        // write CSV records into a string and send it to the console
        writeToConsole(records);
    }

    /**
     * Create a {@link HausKauf} record with some example data.
     *
     * @return created example record
     */
    private static Is24CsvRecord createHausKaufRecord() {
        // create an example real estate
        HausKauf obj = new HausKauf();
        init(obj);

        obj.setAnzahlBadezimmer(RandomUtils.nextInt(1, 5));
        obj.setAnzahlGarageStellplatz(RandomUtils.nextInt(1, 5));
        obj.setAnzahlSchlafzimmer(RandomUtils.nextInt(1, 5));
        obj.setAusstattung(randomValue(Ausstattung.values()));
        obj.setBarrierefrei(RandomUtils.nextBoolean());
        obj.setBaujahr(RandomUtils.nextInt(1900, 1990));
        obj.setBauphase(randomValue(Bauphase.values()));
        obj.setBefeuerungsart(randomValue(Befeuerungsart.values()));
        obj.setDenkmalschutz(RandomUtils.nextBoolean());
        obj.setEinliegerwohnung(RandomUtils.nextBoolean());
        obj.setEnergieausweisInklWarmwasser(RandomUtils.nextBoolean());
        obj.setEnergieausweisKennwert(RandomUtils.nextDouble(50, 500));
        obj.setEnergieausweisTyp(randomValue(EnergieausweisTyp.values()));
        obj.setFerienhaus(RandomUtils.nextBoolean());
        obj.setGaesteWc(RandomUtils.nextBoolean());
        obj.setGrundstuecksflaeche(RandomUtils.nextDouble(200, 2000));
        obj.setHeizungsart(randomValue(Heizungsart.values()));
        obj.setKaufpreis(RandomUtils.nextDouble(100000, 1000000));
        obj.setKeller(RandomUtils.nextBoolean());
        obj.setMieteinnahmenProMonat(RandomUtils.nextDouble(5000, 50000));
        obj.setNutzflaeche(RandomUtils.nextDouble(200, 1000));
        obj.setObjektkategorie(randomValue(ObjektkategorieHaus.values()));
        obj.setObjektzustand(randomValue(Objektzustand.values()));
        obj.setSanierungsjahr(RandomUtils.nextInt(1990, 2010));
        obj.setStellplatz(randomValue(Stellplatz.values()));
        obj.setStellplatzpreis(RandomUtils.nextDouble(1000, 5000));
        obj.setVerfuegbarAb(RANDOMIZER.getWords(2, 5));
        obj.setVermietet(RandomUtils.nextBoolean());
        obj.setWohnflaeche(RandomUtils.nextDouble(100, 500));
        obj.setZimmer(RandomUtils.nextInt(1, 10));
        return obj;
    }

    /**
     * Create a {@link WohnungMiete} record with some example data.
     *
     * @return created example record
     */
    private static Is24CsvRecord createWohnungMieteRecord() {
        // create an example real estate
        WohnungMiete obj = new WohnungMiete();
        init(obj);

        obj.setAnzahlBadezimmer(RandomUtils.nextInt(1, 5));
        obj.setAnzahlGarageStellplatz(RandomUtils.nextInt(1, 5));
        obj.setAnzahlSchlafzimmer(RandomUtils.nextInt(1, 5));
        obj.setAufzug(RandomUtils.nextBoolean());
        obj.setAusstattung(randomValue(Ausstattung.values()));
        obj.setBalkonTerrasse(RandomUtils.nextBoolean());
        obj.setBarrierefrei(RandomUtils.nextBoolean());
        obj.setBaujahr(RandomUtils.nextInt(1900, 1990));
        obj.setBefeuerungsart(randomValue(Befeuerungsart.values()));
        obj.setEinbaukueche(RandomUtils.nextBoolean());
        obj.setEnergieausweisInklWarmwasser(RandomUtils.nextBoolean());
        obj.setEnergieausweisKennwert(RandomUtils.nextDouble(50, 500));
        obj.setEnergieausweisTyp(randomValue(EnergieausweisTyp.values()));
        obj.setEtage(RandomUtils.nextInt(0, 10));
        obj.setEtagenzahl(RandomUtils.nextInt(0, 10));
        obj.setFoerderung(RandomUtils.nextBoolean());
        obj.setGaesteWc(RandomUtils.nextBoolean());
        obj.setGartennutzung(RandomUtils.nextBoolean());
        obj.setHaustiere(randomValue(Auswahl.values()));
        obj.setHeizkosten(RandomUtils.nextDouble(100, 500));
        obj.setHeizungsart(randomValue(Heizungsart.values()));
        obj.setKaltmiete(RandomUtils.nextDouble(500, 3000));
        obj.setKaution(RANDOMIZER.getWords(2, 5));
        obj.setKeller(RandomUtils.nextBoolean());
        obj.setNebenkosten(RandomUtils.nextDouble(100, 500));
        obj.setNebenkostenInklHeizkosten(RandomUtils.nextBoolean());
        obj.setNutzflaeche(RandomUtils.nextDouble(50, 500));
        obj.setObjektkategorie(randomValue(ObjektkategorieWohnung.values()));
        obj.setObjektzustand(randomValue(Objektzustand.values()));
        obj.setSanierungsjahr(RandomUtils.nextInt(1990, 2010));
        obj.setSeniorengerecht(RandomUtils.nextBoolean());
        obj.setStellplatz(randomValue(Stellplatz.values()));
        obj.setStellplatzmiete(RandomUtils.nextDouble(50, 500));
        obj.setVerfuegbarAb(RANDOMIZER.getWords(2, 5));
        obj.setWarmmiete(RandomUtils.nextDouble(500, 2000));
        obj.setWohnflaeche(RandomUtils.nextDouble(50, 250));
        obj.setZimmer(RandomUtils.nextInt(1, 10));
        return obj;
    }

    /**
     * Init common values of an {@link Is24CsvRecord}.
     *
     * @param obj record to init
     */
    private static void init(Is24CsvRecord obj) {
        obj.setAdressdruck(RandomUtils.nextBoolean());
        obj.setAktiv(RandomUtils.nextBoolean());
        obj.setAnbieterObjektId(RandomStringUtils.randomAlphanumeric(5));
        obj.setBeschreibungAusstattung(RANDOMIZER.getWords(10, 50));
        obj.setBeschreibungLage(RANDOMIZER.getWords(10, 50));
        obj.setBeschreibungObjekt(RANDOMIZER.getWords(10, 50));
        obj.setBeschreibungSonstiges(RANDOMIZER.getWords(10, 50));
        obj.setGruppierungId(RandomUtils.nextInt(0, 1000));
        obj.setImportmodus(randomValue(Importmodus.values()));
        obj.setInternationaleRegion(RANDOMIZER.getStateFull());
        obj.setKontaktAnrede(randomValue(new String[]{"Mr", "Ms"}));
        obj.setKontaktEmail(RANDOMIZER.getEmail());
        obj.setKontaktHausNr(RandomStringUtils.randomNumeric(1, 4));
        obj.setKontaktLand(randomValue(new String[]{"DEU", "ESP", "AUT"}));
        obj.setKontaktMobiltelefon(RANDOMIZER.getPhone());
        obj.setKontaktNachname(RANDOMIZER.getLastName());
        obj.setKontaktOrt(RANDOMIZER.getCity());
        obj.setKontaktPlz(RANDOMIZER.getZipCode());
        obj.setKontaktStrasse(RANDOMIZER.getWords(1, 5));
        obj.setKontaktTelefax(RANDOMIZER.getPhone());
        obj.setKontaktTelefon(RANDOMIZER.getPhone());
        obj.setKontaktVorname(RANDOMIZER.getFirstName());
        obj.setKontaktWebseite("https://www.example.com/");
        obj.setObjektHausNr(RandomStringUtils.randomNumeric(1, 4));
        obj.setObjektLand(randomValue(new String[]{"DEU", "ESP", "AUT"}));
        obj.setObjektOrt(RANDOMIZER.getCity());
        obj.setObjektPlz(RANDOMIZER.getZipCode());
        obj.setObjektStrasse(RANDOMIZER.getWords(1, 5));
        obj.setProvision(RANDOMIZER.getWords(1, 5));
        obj.setProvisionpflichtig(RandomUtils.nextBoolean());
        obj.setProvisionshinweis(RANDOMIZER.getWords(2, 10));
        obj.setScoutKundenId(RandomStringUtils.randomAlphanumeric(5));
        obj.setScoutObjektId(RandomStringUtils.randomAlphanumeric(5));
        obj.setUeberschrift(RANDOMIZER.getWords(2, 10));
        obj.setWaehrung(Currency.getInstance("EUR"));

        obj.setDatei1(new Datei(
                "test1.jpg", DateiTyp.BILD, DateiSuffix.JPG, "example jpg image"));
        obj.setDatei2(new Datei(
                "test2.png", DateiTyp.BILD, DateiSuffix.PNG, "example png image"));
        obj.setDatei3(new Datei(
                "test3.pdf", DateiTyp.GRUNDRISS_PDF, DateiSuffix.PDF, "example pdf groundplan"));
        obj.setDatei4(new Datei(
                "https://www.example.com/", DateiTyp.LINK, null, "agency website"));
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
     * Write some {@link Is24CsvRecord} objects into a {@link File}.
     *
     * @param records the CSV records to write
     * @param file    the file, where the document is written to
     */
    private static void write(List<Is24CsvRecord> records, File file) {
        LOGGER.info("writing document");
        try (Is24CsvPrinter printer = Is24CsvPrinter.create(file)) {
            printer.printRecords(records);
            LOGGER.info("> written to: " + file.getAbsolutePath());
        } catch (Exception ex) {
            LOGGER.error("Can't write document into a file!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            System.exit(1);
        }
    }

    /**
     * Write some {@link Is24CsvRecord} objects into an {@link OutputStream}.
     *
     * @param records the CSV records to write
     * @param output  the stream, where the document is written to
     */
    private static void write(List<Is24CsvRecord> records, OutputStream output) {
        LOGGER.info("writing document");
        try (Is24CsvPrinter printer = Is24CsvPrinter.create(output)) {
            printer.printRecords(records);
            LOGGER.info("> written to a java.io.OutputStream");
        } catch (Exception ex) {
            LOGGER.error("Can't write document into an OutputStream!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            System.exit(1);
        }
    }

    /**
     * Write some {@link Is24CsvRecord} objects into a {@link Writer}.
     *
     * @param records the CSV records to write
     * @param output  the writer, where the document is written to
     */
    private static void write(List<Is24CsvRecord> records, Writer output) {
        LOGGER.info("writing document");
        try (Is24CsvPrinter printer = Is24CsvPrinter.create(output)) {
            printer.printRecords(records);
            LOGGER.info("> written to a java.io.Writer");
        } catch (Exception ex) {
            LOGGER.error("Can't write document into an OutputStream!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            System.exit(1);
        }
    }

    /**
     * Write some {@link Is24CsvRecord} objects into a {@link String} and print the
     * results to the console.
     *
     * @param records the CSV records to write
     */
    private static void writeToConsole(List<Is24CsvRecord> records) {
        LOGGER.info("writing document");
        StringBuilder csv = new StringBuilder();
        try (Is24CsvPrinter printer = Is24CsvPrinter.create(csv)) {
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