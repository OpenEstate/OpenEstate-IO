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
import java.util.Currency;
import java.util.List;
import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.io.output.NullWriter;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openestate.io.examples.utils.RandomStringUtils;
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
 * This example illustrates the programmatic creation of an IS24-CSV document,
 * and how the document is written into CSV.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
@SuppressWarnings("WeakerAccess")
public class Is24CsvWritingExample {
    private final static Logger LOGGER = LoggerFactory.getLogger(Is24CsvWritingExample.class);
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
                Is24CsvWritingExample.class.getResource(PACKAGE + "/log4j.properties"));

        // create some CSV records
        List<Is24CsvRecord> records = new ArrayList<>();
        records.add(createHausKaufRecord());
        records.add(createHausKaufRecord());
        records.add(createWohnungMieteRecord());
        records.add(createWohnungMieteRecord());

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
     * Create an {@link HausKauf} with some example data.
     *
     * @return created example object
     */
    protected static Is24CsvRecord createHausKaufRecord() {
        // create an example real estate
        HausKauf obj = new HausKauf();
        init(obj);

        obj.setAnzahlBadezimmer(RandomUtils.nextInt(1, 5));
        obj.setAnzahlGarageStellplatz(RandomUtils.nextInt(1, 5));
        obj.setAnzahlSchlafzimmer(RandomUtils.nextInt(1, 5));
        obj.setAusstattung(Ausstattung.GEHOBEN);
        obj.setBarrierefrei(RandomUtils.nextInt(0, 2) == 1);
        obj.setBaujahr(RandomUtils.nextInt(1900, 1990));
        obj.setBauphase(Bauphase.FERTIG_GESTELLT);
        obj.setBefeuerungsart(Befeuerungsart.KOHLE);
        obj.setDenkmalschutz(RandomUtils.nextInt(0, 2) == 1);
        obj.setEinliegerwohnung(RandomUtils.nextInt(0, 2) == 1);
        obj.setEnergieausweisInklWarmwasser(RandomUtils.nextInt(0, 2) == 1);
        obj.setEnergieausweisKennwert(RandomUtils.nextDouble(50, 500));
        obj.setEnergieausweisTyp(EnergieausweisTyp.ENERGIEVERBRAUCHSKENNWERT);
        obj.setFerienhaus(RandomUtils.nextInt(0, 2) == 1);
        obj.setGaesteWc(RandomUtils.nextInt(0, 2) == 1);
        obj.setGrundstuecksflaeche(RandomUtils.nextDouble(200, 2000));
        obj.setHeizungsart(Heizungsart.ZENTRALHEIZUNG);
        obj.setKaufpreis(RandomUtils.nextDouble(100000, 1000000));
        obj.setKeller(RandomUtils.nextInt(0, 2) == 1);
        obj.setMieteinnahmenProMonat(RandomUtils.nextDouble(5000, 50000));
        obj.setNutzflaeche(RandomUtils.nextDouble(200, 1000));
        obj.setObjektkategorie(ObjektkategorieHaus.MEHRFAMILIENHAUS);
        obj.setObjektzustand(Objektzustand.GEPFLEGT);
        obj.setSanierungsjahr(RandomUtils.nextInt(1990, 2010));
        obj.setStellplatz(Stellplatz.CARPORT);
        obj.setStellplatzpreis(RandomUtils.nextDouble(1000, 5000));
        obj.setVerfuegbarAb("notes about availability");
        obj.setVermietet(RandomUtils.nextInt(0, 2) == 1);
        obj.setWohnflaeche(RandomUtils.nextDouble(100, 500));
        obj.setZimmer(RandomUtils.nextInt(1, 10));
        return obj;
    }

    /**
     * Create an {@link WohnungMiete} with some example data.
     *
     * @return created example object
     */
    protected static Is24CsvRecord createWohnungMieteRecord() {
        // create an example real estate
        WohnungMiete obj = new WohnungMiete();
        init(obj);

        obj.setAnzahlBadezimmer(RandomUtils.nextInt(1, 5));
        obj.setAnzahlGarageStellplatz(RandomUtils.nextInt(1, 5));
        obj.setAnzahlSchlafzimmer(RandomUtils.nextInt(1, 5));
        obj.setAufzug(RandomUtils.nextInt(0, 2) == 1);
        obj.setAusstattung(Ausstattung.GEHOBEN);
        obj.setBalkonTerrasse(RandomUtils.nextInt(0, 2) == 1);
        obj.setBarrierefrei(RandomUtils.nextInt(0, 2) == 1);
        obj.setBaujahr(RandomUtils.nextInt(1900, 1990));
        obj.setBefeuerungsart(Befeuerungsart.OEL);
        obj.setEinbaukueche(RandomUtils.nextInt(0, 2) == 1);
        obj.setEnergieausweisInklWarmwasser(RandomUtils.nextInt(0, 2) == 1);
        obj.setEnergieausweisKennwert(RandomUtils.nextDouble(50, 500));
        obj.setEnergieausweisTyp(EnergieausweisTyp.ENERGIEVERBRAUCHSKENNWERT);
        obj.setEtage(RandomUtils.nextInt(0, 10));
        obj.setEtagenzahl(RandomUtils.nextInt(0, 10));
        obj.setFoerderung(RandomUtils.nextInt(0, 2) == 1);
        obj.setGaesteWc(RandomUtils.nextInt(0, 2) == 1);
        obj.setGartennutzung(RandomUtils.nextInt(0, 2) == 1);
        obj.setHaustiere(Auswahl.NACH_VEREINBARUNG);
        obj.setHeizkosten(RandomUtils.nextDouble(100, 500));
        obj.setHeizungsart(Heizungsart.OFENHEIZUNG);
        obj.setKaltmiete(RandomUtils.nextDouble(500, 3000));
        obj.setKaution("notes about deposit");
        obj.setKeller(RandomUtils.nextInt(0, 2) == 1);
        obj.setNebenkosten(RandomUtils.nextDouble(100, 500));
        obj.setNebenkostenInklHeizkosten(RandomUtils.nextInt(0, 2) == 1);
        obj.setNutzflaeche(RandomUtils.nextDouble(50, 500));
        obj.setObjektkategorie(ObjektkategorieWohnung.PENTHOUSE);
        obj.setObjektzustand(Objektzustand.MODERNISIERT);
        obj.setSanierungsjahr(RandomUtils.nextInt(1990, 2010));
        obj.setSeniorengerecht(RandomUtils.nextInt(0, 2) == 1);
        obj.setStellplatz(Stellplatz.TIEFGARAGE);
        obj.setStellplatzmiete(RandomUtils.nextDouble(50, 500));
        obj.setVerfuegbarAb("notes about availability");
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
    protected static void init(Is24CsvRecord obj) {
        obj.setAdressdruck(RandomUtils.nextInt(0, 2) == 1);
        obj.setAktiv(RandomUtils.nextInt(0, 2) == 1);
        obj.setAnbieterObjektId(RandomStringUtils.random(5));
        obj.setBeschreibungAusstattung("description about features");
        obj.setBeschreibungLage("description about location");
        obj.setBeschreibungObjekt("description about object");
        obj.setBeschreibungSonstiges("further descriptions");
        obj.setGruppierungId(RandomUtils.nextInt(0, 1000));
        obj.setImportmodus(Importmodus.IMPORTIEREN);
        obj.setInternationaleRegion("name of international region");
        obj.setKontaktAnrede("Mr");
        obj.setKontaktEmail("tester@test.org");
        obj.setKontaktHausNr("123");
        obj.setKontaktLand("DEU");
        obj.setKontaktMobiltelefon("030/123456");
        obj.setKontaktNachname("Mustermann");
        obj.setKontaktOrt("Berlin");
        obj.setKontaktPlz("12345");
        obj.setKontaktStrasse("example street");
        obj.setKontaktTelefax("030/123457");
        obj.setKontaktTelefon("030/123458");
        obj.setKontaktVorname("Max");
        obj.setKontaktWebseite("http://www.test.org/");
        obj.setObjektHausNr("124");
        obj.setObjektLand("DEU");
        obj.setObjektOrt("Berlin");
        obj.setObjektPlz("12345");
        obj.setObjektStrasse("example street");
        obj.setProvision("commission");
        obj.setProvisionpflichtig(RandomUtils.nextInt(0, 2) == 1);
        obj.setProvisionshinweis("notes about commission");
        obj.setScoutKundenId(RandomStringUtils.random(5));
        obj.setScoutObjektId(RandomStringUtils.random(5));
        obj.setUeberschrift("a nice title for the object");
        obj.setWaehrung(Currency.getInstance("EUR"));

        obj.setDatei1(new Datei("test1.jpg", DateiTyp.BILD, DateiSuffix.JPG, "a nice image"));
        obj.setDatei2(new Datei("test2.png", DateiTyp.BILD, DateiSuffix.PNG, "another nice image"));
        obj.setDatei3(new Datei("test3.pdf", DateiTyp.GRUNDRISS_PDF, DateiSuffix.PDF, "a document with groundplan"));
        obj.setDatei4(new Datei("http://www.test.org/", DateiTyp.LINK, null, "agency website"));
    }

    /**
     * Write some {@link Is24CsvRecord} objects into a {@link File}.
     *
     * @param records the CSV records to write
     * @param file    the file, where the document is written to
     */
    protected static void write(List<Is24CsvRecord> records, File file) {
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
    protected static void write(List<Is24CsvRecord> records, OutputStream output) {
        LOGGER.info("writing document");
        try {
            Is24CsvPrinter printer = Is24CsvPrinter.create(output);
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
    protected static void write(List<Is24CsvRecord> records, Writer output) {
        LOGGER.info("writing document");
        try {
            Is24CsvPrinter printer = Is24CsvPrinter.create(output);
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
    protected static void writeToConsole(List<Is24CsvRecord> records) {
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