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
import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.io.output.NullWriter;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openestate.io.is24_xml.Is24XmlDocument;
import org.openestate.io.is24_xml.Is24XmlUtils;
import org.openestate.io.is24_xml.xml.AktionsTyp;
import org.openestate.io.is24_xml.xml.AusstattungsqualitaetsTyp;
import org.openestate.io.is24_xml.xml.BauphaseTyp;
import org.openestate.io.is24_xml.xml.EnergieausweistypTyp;
import org.openestate.io.is24_xml.xml.GenehmigungTyp;
import org.openestate.io.is24_xml.xml.HausKategorienTyp;
import org.openestate.io.is24_xml.xml.HausKauf;
import org.openestate.io.is24_xml.xml.HausMiete;
import org.openestate.io.is24_xml.xml.HeizungsartTyp;
import org.openestate.io.is24_xml.xml.ISOLaenderCodeTyp;
import org.openestate.io.is24_xml.xml.ImmobilieBaseTyp;
import org.openestate.io.is24_xml.xml.ImmobilienTransferTyp;
import org.openestate.io.is24_xml.xml.ImmobilienTransferTyp.Anbieter;
import org.openestate.io.is24_xml.xml.MMAnhangArtenTyp;
import org.openestate.io.is24_xml.xml.MultimediaAnhangTyp;
import org.openestate.io.is24_xml.xml.ObjectFactory;
import org.openestate.io.is24_xml.xml.ObjektZustandTyp;
import org.openestate.io.is24_xml.xml.StatusTyp;
import org.openestate.io.is24_xml.xml.StellplatzKategorieTyp;
import org.openestate.io.is24_xml.xml.WaehrungTyp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Example for writing IS24-XML files.
 * <p>
 * This example illustrates the programmatic creation of IS24-XML documents and how they are written into XML.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public class Is24XmlWritingExample {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(Is24XmlWritingExample.class);
    private final static ObjectFactory FACTORY = Is24XmlUtils.getFactory();
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
                Is24XmlWritingExample.class.getResource("log4j.properties"));

        // create a ImmobilienTransferTyp object with some example data
        // this object corresponds to the <IS24ImmobilienTransfer> root element in XML
        ImmobilienTransferTyp transfer = FACTORY.createImmobilienTransferTyp();
        transfer.setEmailBeiFehler(RANDOMIZER.getEmail());
        transfer.setErstellerSoftware(RANDOMIZER.getName());
        transfer.setErstellerSoftwareVersion(RandomStringUtils.randomNumeric(2));
        transfer.setAnbieter(createAnbieter());

        // convert the ImmobilienTransferTyp object into a XML document
        Is24XmlDocument doc = null;
        try {
            doc = Is24XmlDocument.newDocument(transfer);
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
     * Create an {@link Anbieter} with some example data.
     *
     * @return created example object
     */
    private static Anbieter createAnbieter() {
        // create an example agency
        Anbieter anbieter = FACTORY.createImmobilienTransferTypAnbieter();
        anbieter.setScoutKundenID(RandomStringUtils.randomAlphanumeric(2, 5));

        // add some real estates to the agency
        int hausKaufCount = RandomUtils.nextInt(1, 5);
        for (int i = 0; i < hausKaufCount; i++) {
            anbieter.getImmobilie().add(createImmobilieHausKauf());
        }

        int hausMieteCount = RandomUtils.nextInt(1, 5);
        for (int i = 0; i < hausMieteCount; i++) {
            anbieter.getImmobilie().add(createImmobilieHausMiete());
        }

        return anbieter;
    }

    /**
     * Create an {@link HausKauf} with some example data.
     *
     * @return created example object
     */
    @SuppressWarnings("Duplicates")
    private static HausKauf createImmobilieHausKauf() {
        // create an example real estate
        HausKauf.Type obj = FACTORY.createHausKaufType();
        initImmobilie(obj);

        obj.setAlsFerienwohnungGeeignet(RandomUtils.nextBoolean());
        obj.setAnzahlBadezimmer(RandomUtils.nextLong(1, 5));
        obj.setAnzahlGaragenStellplaetze(RandomUtils.nextLong(0, 3));
        obj.setAnzahlSchlafzimmer(RandomUtils.nextLong(1, 5));
        obj.setAusstattungsqualitaet(randomValue(AusstattungsqualitaetsTyp.values()));
        obj.setBarrierefrei(RandomUtils.nextBoolean());
        obj.setBaujahr(RandomUtils.nextLong(1900, 2010));
        obj.setBauphase(randomValue(BauphaseTyp.values()));
        obj.setDenkmalschutzobjekt(RandomUtils.nextBoolean());
        obj.setEtagenzahl(RandomUtils.nextLong(1, 10));
        obj.setFreiAb(RANDOMIZER.getWords(3, 10));
        obj.setGaesteWC(RandomUtils.nextBoolean());
        obj.setGrundstuecksFlaeche(BigDecimal.valueOf(RandomUtils.nextDouble(100, 1500)));
        obj.setHausKategorie(randomValue(HausKategorienTyp.values()));
        obj.setHeizungsart(randomValue(HeizungsartTyp.values()));
        obj.setJahrLetzteModernisierung(RandomUtils.nextLong(1980, 2000));
        obj.setKeller(RandomUtils.nextBoolean());
        obj.setMitEinliegerwohnung(RandomUtils.nextBoolean());
        obj.setNutzflaeche(BigDecimal.valueOf(RandomUtils.nextDouble(100, 1000)));
        obj.setObjektzustand(randomValue(ObjektZustandTyp.values()));
        obj.setParkplatz(randomValue(StellplatzKategorieTyp.values()));
        obj.setRollstuhlgerecht(RandomUtils.nextBoolean());
        obj.setVermietet(RandomUtils.nextBoolean());
        obj.setWohnflaeche(BigDecimal.valueOf(RandomUtils.nextDouble(50, 500)));
        obj.setZimmer(BigDecimal.valueOf(RandomUtils.nextDouble(1, 10)));

        obj.setBefeuerungsArt(FACTORY.createBefeuerungsArtTyp());
        obj.getBefeuerungsArt().setOel(
                FACTORY.createBefeuerungsArtTypOel(RandomUtils.nextBoolean()));
        obj.getBefeuerungsArt().setGas(
                FACTORY.createBefeuerungsArtTypGas(RandomUtils.nextBoolean()));

        obj.setEnergieausweis(FACTORY.createEnergieausweisTyp());
        obj.getEnergieausweis().setEnergieausweistyp(randomValue(EnergieausweistypTyp.values()));
        obj.getEnergieausweis().setEnergieverbrauchskennwert(BigDecimal.valueOf(RandomUtils.nextDouble(50, 500)));
        obj.getEnergieausweis().setWarmwasserEnthalten(RandomUtils.nextBoolean());

        obj.setKaufpreise(FACTORY.createVermarktungWohnKaufTyp());
        obj.getKaufpreise().setKaufpreis(BigDecimal.valueOf(RandomUtils.nextDouble(100000, 9999999)));
        obj.getKaufpreise().setMieteinnahmenProMonat(BigDecimal.valueOf(RandomUtils.nextDouble(5000, 50000)));
        obj.getKaufpreise().setStellplatzKaufpreis(BigDecimal.valueOf(RandomUtils.nextDouble(1000, 10000)));
        obj.getKaufpreise().setWohngeld(BigDecimal.valueOf(RandomUtils.nextDouble(500, 5000)));

        return FACTORY.createHausKauf(obj);
    }

    /**
     * Create an {@link HausMiete} with some example data.
     *
     * @return created example object
     */
    @SuppressWarnings("Duplicates")
    private static HausMiete createImmobilieHausMiete() {
        // create an example real estate
        HausMiete.Type obj = FACTORY.createHausMieteType();
        initImmobilie(obj);

        obj.setAnzahlBadezimmer(RandomUtils.nextLong(1, 5));
        obj.setAnzahlGaragenStellplaetze(RandomUtils.nextLong(0, 3));
        obj.setAnzahlSchlafzimmer(RandomUtils.nextLong(1, 5));
        obj.setAusstattungsqualitaet(randomValue(AusstattungsqualitaetsTyp.values()));
        obj.setBarrierefrei(RandomUtils.nextBoolean());
        obj.setBaujahr(RandomUtils.nextLong(1900, 2010));
        obj.setBetreutesWohnen(RandomUtils.nextBoolean());
        obj.setEinbaukueche(RandomUtils.nextBoolean());
        obj.setEtagenzahl(RandomUtils.nextLong(1, 10));
        obj.setFreiAb(RANDOMIZER.getWords(3, 10));
        obj.setGaesteWC(RandomUtils.nextBoolean());
        obj.setGrundstuecksFlaeche(BigDecimal.valueOf(RandomUtils.nextDouble(100, 1500)));
        obj.setHausKategorie(randomValue(HausKategorienTyp.values()));
        obj.setHaustiere(randomValue(GenehmigungTyp.values()));
        obj.setHeizungsart(randomValue(HeizungsartTyp.values()));
        obj.setJahrLetzteModernisierung(RandomUtils.nextLong(1980, 2000));
        obj.setKeller(RandomUtils.nextBoolean());
        obj.setNutzflaeche(BigDecimal.valueOf(RandomUtils.nextDouble(150, 500)));
        obj.setObjektzustand(randomValue(ObjektZustandTyp.values()));
        obj.setParkplatz(randomValue(StellplatzKategorieTyp.values()));
        obj.setRollstuhlgerecht(RandomUtils.nextBoolean());
        obj.setWohnflaeche(BigDecimal.valueOf(RandomUtils.nextDouble(50, 300)));
        obj.setZimmer(BigDecimal.valueOf(RandomUtils.nextDouble(1, 5)));

        obj.setBefeuerungsArt(FACTORY.createBefeuerungsArtTyp());
        obj.getBefeuerungsArt().setErdwaerme(
                FACTORY.createBefeuerungsArtTypErdwaerme(RandomUtils.nextBoolean()));
        obj.getBefeuerungsArt().setPelletheizung(
                FACTORY.createBefeuerungsArtTypPelletheizung(RandomUtils.nextBoolean()));

        obj.setEnergieausweis(FACTORY.createEnergieausweisTyp());
        obj.getEnergieausweis().setEnergieausweistyp(randomValue(EnergieausweistypTyp.values()));
        obj.getEnergieausweis().setEnergieverbrauchskennwert(BigDecimal.valueOf(RandomUtils.nextDouble(50, 500)));
        obj.getEnergieausweis().setWarmwasserEnthalten(RandomUtils.nextBoolean());

        obj.setMietpreise(FACTORY.createVermarktungWohnMieteTyp());
        obj.getMietpreise().setHeizkosten(BigDecimal.valueOf(RandomUtils.nextDouble(100, 500)));
        obj.getMietpreise().setHeizkostenInWarmmieteEnthalten(RandomUtils.nextBoolean());
        obj.getMietpreise().setKaltmiete(BigDecimal.valueOf(RandomUtils.nextDouble(150, 1500)));
        obj.getMietpreise().setKaution(RANDOMIZER.getWords(3, 10));
        obj.getMietpreise().setNebenkosten(BigDecimal.valueOf(RandomUtils.nextDouble(50, 500)));
        obj.getMietpreise().setStellplatzMiete(BigDecimal.valueOf(RandomUtils.nextDouble(50, 500)));
        obj.getMietpreise().setWarmmiete(BigDecimal.valueOf(RandomUtils.nextDouble(250, 2500)));

        return FACTORY.createHausMiete(obj);
    }

    /**
     * Init common values of a property.
     *
     * @param immobilie property object
     */
    private static void initImmobilie(ImmobilieBaseTyp immobilie) {
        immobilie.setAdressdruck(RandomUtils.nextBoolean());
        immobilie.setAktiveGruppen(RANDOMIZER.getWords(1, 5));
        immobilie.setAnbieterObjektID(RandomStringUtils.randomNumeric(2, 5));
        immobilie.setAusstattung(RANDOMIZER.getWords(5, 50));
        immobilie.setGruppierungsID(RandomUtils.nextLong(1, 9999));
        immobilie.setImportmodus(AktionsTyp.AKTUALISIEREN);
        immobilie.setLage(RANDOMIZER.getWords(5, 50));
        immobilie.setObjektbeschreibung(RANDOMIZER.getWords(5, 50));
        immobilie.setProvision(RANDOMIZER.getWords(1, 10));
        immobilie.setProvisionshinweis(RANDOMIZER.getWords(5, 50));
        immobilie.setProvisionspflichtig(RandomUtils.nextBoolean());
        immobilie.setScoutObjektID(BigInteger.valueOf(RandomUtils.nextInt(1, 1000)));
        immobilie.setSonstigeAngaben(RANDOMIZER.getWords(5, 50));
        immobilie.setStatusHP(randomValue(StatusTyp.values()));
        immobilie.setStatusIS24(randomValue(StatusTyp.values()));
        immobilie.setStatusVBM(randomValue(StatusTyp.values()));
        immobilie.setUeberschrift(RANDOMIZER.getWords(1, 5));
        immobilie.setWaehrung(randomValue(WaehrungTyp.values()));

        immobilie.setAdresse(FACTORY.createImmobilienAdresseTyp());
        immobilie.getAdresse().setHausnummer(RandomStringUtils.randomNumeric(1, 4));
        immobilie.getAdresse().setInternationaleRegion(RANDOMIZER.getStateFull());
        immobilie.getAdresse().setLaenderkennzeichen(randomValue(ISOLaenderCodeTyp.values()));
        immobilie.getAdresse().setOrt(RANDOMIZER.getCity());
        immobilie.getAdresse().setPostleitzahl(RANDOMIZER.getZipCode());
        immobilie.getAdresse().setStrasse(RANDOMIZER.getWords(1, 5));

        immobilie.setApiSuchfelder(FACTORY.createImmobilieBaseTypApiSuchfelder(FACTORY.createApiSuchfelderTyp()));
        immobilie.getApiSuchfelder().getValue().setApiSuchfeld1(FACTORY.createApiSuchfelderTypApiSuchfeld1("value1"));
        immobilie.getApiSuchfelder().getValue().setApiSuchfeld2(FACTORY.createApiSuchfelderTypApiSuchfeld2("value2"));
        immobilie.getApiSuchfelder().getValue().setApiSuchfeld3(FACTORY.createApiSuchfelderTypApiSuchfeld3("value3"));

        immobilie.setKontaktperson(FACTORY.createKontaktAdresseTyp());
        immobilie.getKontaktperson().setAnrede(RANDOMIZER.getWords(1));
        immobilie.getKontaktperson().setEMail(RANDOMIZER.getEmail());
        immobilie.getKontaktperson().setHausnummer(RandomStringUtils.randomNumeric(1, 4));
        immobilie.getKontaktperson().setLaenderkennzeichen(randomValue(ISOLaenderCodeTyp.values()));
        immobilie.getKontaktperson().setMobiltelefon(RANDOMIZER.getPhone());
        immobilie.getKontaktperson().setNachname(RANDOMIZER.getLastName());
        immobilie.getKontaktperson().setOrt(RANDOMIZER.getCity());
        immobilie.getKontaktperson().setPostleitzahl(RANDOMIZER.getZipCode());
        immobilie.getKontaktperson().setStrasse(RANDOMIZER.getWords(1, 5));
        immobilie.getKontaktperson().setTelefax(RANDOMIZER.getPhone());
        immobilie.getKontaktperson().setTelefon(RANDOMIZER.getPhone());
        immobilie.getKontaktperson().setVorname(RANDOMIZER.getFirstName());

        //noinspection CatchMayIgnoreException
        try {
            immobilie.getKontaktperson().setHomepage(new URI("https://www.example.com"));
        } catch (URISyntaxException ex) {
        }

        immobilie.setManuelleGeoCodierung(FACTORY.createManuellGeoCodingTyp());
        immobilie.getManuelleGeoCodierung().setTermsRegion(RANDOMIZER.getStateFull());
        immobilie.getManuelleGeoCodierung().setTermsStadt(RANDOMIZER.getCity());
        immobilie.getManuelleGeoCodierung().setTermsStadtTeil(RANDOMIZER.getWords(1, 3));

        int attachmentCount = RandomUtils.nextInt(3, 10);
        for (int i = 0; i < attachmentCount; i++) {
            MultimediaAnhangTyp attachment = FACTORY.createMultimediaAnhangTyp();
            attachment.setAnhangArt(randomValue(MMAnhangArtenTyp.values()));
            attachment.setDateiname("attachment-" + i + ".jpg");
            attachment.setDateityp("jpg");
            attachment.setTitel(RANDOMIZER.getWords(2, 10));
            immobilie.getMultimediaAnhang().add(attachment);
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
     * Write an {@link Is24XmlDocument} into a {@link File}.
     *
     * @param doc  the document to write
     * @param file the file, where the document is written to
     */
    @SuppressWarnings("Duplicates")
    private static void write(Is24XmlDocument doc, File file) {
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
     * Write an {@link Is24XmlDocument} into an {@link OutputStream}.
     *
     * @param doc    the document to write
     * @param output the stream, where the document is written to
     */
    @SuppressWarnings("Duplicates")
    private static void write(Is24XmlDocument doc, OutputStream output) {
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
     * Write an {@link Is24XmlDocument} into a {@link Writer}.
     *
     * @param doc    the document to write
     * @param output the writer, where the document is written to
     */
    @SuppressWarnings("Duplicates")
    private static void write(Is24XmlDocument doc, Writer output) {
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
     * Write an {@link Is24XmlDocument} into a {@link String} and print the
     * results to the console.
     *
     * @param doc the document to write
     */
    @SuppressWarnings("Duplicates")
    private static void writeToConsole(Is24XmlDocument doc) {
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