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
import org.apache.log4j.PropertyConfigurator;
import org.openestate.io.kyero.KyeroDocument;
import org.openestate.io.kyero.KyeroUtils;
import org.openestate.io.kyero.KyeroVersion;
import org.openestate.io.kyero.xml.CurrencyType;
import org.openestate.io.kyero.xml.EnergyRatingMarkType;
import org.openestate.io.kyero.xml.ImagesType.Image;
import org.openestate.io.kyero.xml.KyeroType;
import org.openestate.io.kyero.xml.ObjectFactory;
import org.openestate.io.kyero.xml.PriceFreqType;
import org.openestate.io.kyero.xml.PropertyType;
import org.openestate.io.kyero.xml.Root;
import org.openestate.io.kyero.xml.Root.Agent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Example for writing Kyero XML feeds.
 * <p>
 * This example illustrates the programmatic creation of Kyero documents, how they are written into XML and how they are
 * downgraded to earlier versions.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public class KyeroWritingExample {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(KyeroWritingExample.class);
    private final static ObjectFactory FACTORY = KyeroUtils.getFactory();
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
                KyeroWritingExample.class.getResource("log4j.properties"));

        // create a Root object with some example data
        // this object corresponds to the <root> element in XML
        Root root = FACTORY.createRoot();
        root.setKyero(createKyero());
        root.setAgent(createAgent());

        int propertyCount = RandomUtils.nextInt(3, 10);
        for (int i = 0; i < propertyCount; i++) {
            root.getProperty().add(createProperty());
        }

        // convert the Root object into a XML document
        KyeroDocument doc = null;
        try {
            doc = KyeroDocument.newDocument(root);
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

        // downgrade XML document to an earlier version
        // and write it to the console
        doc.downgrade(KyeroVersion.V2_1);
        writeToConsole(doc);
    }

    /**
     * Create an {@link Agent} object with some example data.
     *
     * @return created example object
     */
    private static Agent createAgent() {
        Agent agent = FACTORY.createRootAgent();
        agent.setAddr1(RANDOMIZER.getWords(1, 5));
        agent.setAddr2(RANDOMIZER.getWords(1, 5));
        agent.setCountry(RANDOMIZER.getCountry());
        agent.setEmail(RANDOMIZER.getEmail());
        agent.setFax(RANDOMIZER.getPhone());
        agent.setId(BigInteger.valueOf(RandomUtils.nextLong(1, 10000)));
        agent.setMob(RANDOMIZER.getPhone());
        agent.setName(RANDOMIZER.getName());
        agent.setPostcode(RANDOMIZER.getZipCode());
        agent.setRegion(RANDOMIZER.getStateFull());
        agent.setTel(RANDOMIZER.getPhone());
        agent.setTown(RANDOMIZER.getCity());
        return agent;
    }

    /**
     * Create a {@link KyeroType} object with some example data.
     *
     * @return created example object
     */
    private static KyeroType createKyero() {
        KyeroType kyero = FACTORY.createKyeroType();
        kyero.setFeedGenerated(Calendar.getInstance());
        kyero.setFeedVersion(KyeroUtils.VERSION.toXmlVersion());
        return kyero;
    }

    /**
     * Create a {@link PropertyType} object with some example data.
     *
     * @return created example object
     */
    private static PropertyType createProperty() {
        // create an example real estate
        PropertyType obj = FACTORY.createPropertyType();
        obj.setBaths(BigInteger.valueOf(RandomUtils.nextLong(0, 5)));
        obj.setBeds(BigInteger.valueOf(RandomUtils.nextLong(0, 5)));
        obj.setCountry(RANDOMIZER.getCountry());
        obj.setCurrency(randomValue(CurrencyType.values()));
        obj.setDate(Calendar.getInstance());
        obj.setId(RandomStringUtils.randomAlphanumeric(5));
        obj.setLeasehold(RandomUtils.nextBoolean());
        obj.setLocationDetail(RANDOMIZER.getWords(2, 10));
        obj.setNewBuild(RandomUtils.nextBoolean());
        obj.setNotes(RANDOMIZER.getWords(10, 50));
        obj.setPartOwnership(RandomUtils.nextBoolean());
        obj.setPool(RandomUtils.nextBoolean());
        obj.setPrice(RandomUtils.nextLong(10000, 9999999));
        obj.setPriceFreq(randomValue(PriceFreqType.values()));
        obj.setProvince(RANDOMIZER.getStateFull());
        obj.setRef(RandomStringUtils.randomAlphanumeric(5));
        obj.setTown(RANDOMIZER.getCity());
        obj.setType(RANDOMIZER.getWords(1));

        obj.setDesc(FACTORY.createLangType());
        obj.getDesc().setCa(RANDOMIZER.getWords(10, 50));
        obj.getDesc().setDa(RANDOMIZER.getWords(10, 50));
        obj.getDesc().setDe(RANDOMIZER.getWords(10, 50));
        obj.getDesc().setEn(RANDOMIZER.getWords(10, 50));
        obj.getDesc().setEs(RANDOMIZER.getWords(10, 50));
        obj.getDesc().setFi(RANDOMIZER.getWords(10, 50));
        obj.getDesc().setFr(RANDOMIZER.getWords(10, 50));
        obj.getDesc().setIt(RANDOMIZER.getWords(10, 50));
        obj.getDesc().setNl(RANDOMIZER.getWords(10, 50));
        obj.getDesc().setNo(RANDOMIZER.getWords(10, 50));
        obj.getDesc().setPt(RANDOMIZER.getWords(10, 50));
        obj.getDesc().setRu(RANDOMIZER.getWords(10, 50));
        obj.getDesc().setSv(RANDOMIZER.getWords(10, 50));

        obj.setEnergyRating(FACTORY.createEnergyRatingType());
        obj.getEnergyRating().setConsumption(randomValue(EnergyRatingMarkType.values()));
        obj.getEnergyRating().setEmissions(randomValue(EnergyRatingMarkType.values()));

        obj.setFeatures(FACTORY.createFeaturesType());
        int featureCount = RandomUtils.nextInt(1, 10);
        for (int i = 0; i < featureCount; i++) {
            obj.getFeatures().getFeature().add(RANDOMIZER.getWords(1, 5));
        }

        obj.setImages(FACTORY.createImagesType());
        int imageCount = RandomUtils.nextInt(1, 10);
        for (int i = 0; i < imageCount; i++) {
            obj.getImages().getImage().add(createPropertyImage(i));
        }

        obj.setLocation(FACTORY.createGpsLocationType());
        obj.getLocation().setLatitude(BigDecimal.valueOf(RandomUtils.nextDouble(0, 90)));
        obj.getLocation().setLongitude(BigDecimal.valueOf(RandomUtils.nextDouble(0, 90)));

        obj.setSurfaceArea(FACTORY.createSurfaceType());
        obj.getSurfaceArea().setBuilt(BigInteger.valueOf(RandomUtils.nextLong(50, 250)));
        obj.getSurfaceArea().setPlot(BigInteger.valueOf(RandomUtils.nextLong(100, 1500)));

        obj.setUrl(FACTORY.createUrlType());
        //noinspection CatchMayIgnoreException
        try {
            obj.getUrl().setCa(new URI("https://www.example.com/catalan/" + obj.getId() + ".html"));
            obj.getUrl().setDa(new URI("https://www.example.com/danish/" + obj.getId() + ".html"));
            obj.getUrl().setDe(new URI("https://www.example.com/german/" + obj.getId() + ".html"));
            obj.getUrl().setEn(new URI("https://www.example.com/english/" + obj.getId() + ".html"));
            obj.getUrl().setEs(new URI("https://www.example.com/spanish/" + obj.getId() + ".html"));
            obj.getUrl().setFi(new URI("https://www.example.com/finnish/" + obj.getId() + ".html"));
            obj.getUrl().setFr(new URI("https://www.example.com/french/" + obj.getId() + ".html"));
            obj.getUrl().setIt(new URI("https://www.example.com/italian/" + obj.getId() + ".html"));
            obj.getUrl().setNl(new URI("https://www.example.com/dutch/" + obj.getId() + ".html"));
            obj.getUrl().setNo(new URI("https://www.example.com/norwegian/" + obj.getId() + ".html"));
            obj.getUrl().setPt(new URI("https://www.example.com/portuguese/" + obj.getId() + ".html"));
            obj.getUrl().setRu(new URI("https://www.example.com/russian/" + obj.getId() + ".html"));
            obj.getUrl().setSv(new URI("https://www.example.com/swedish/" + obj.getId() + ".html"));
        } catch (URISyntaxException ex) {
        }

        return obj;
    }

    /**
     * Create an {@link Image} object with some example data.
     *
     * @param pos index position within the property images
     * @return created example object
     */
    private static Image createPropertyImage(int pos) {
        // create an example image
        Image img = FACTORY.createImagesTypeImage();
        img.setId(pos);
        //noinspection CatchMayIgnoreException
        try {
            img.setUrl(new URI("https://www.example.com/image-" + pos + ".jpg"));
        } catch (URISyntaxException ex) {
        }
        return img;
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
     * Write a {@link KyeroDocument} into a {@link File}.
     *
     * @param doc  the document to write
     * @param file the file, where the document is written to
     */
    @SuppressWarnings("Duplicates")
    private static void write(KyeroDocument doc, File file) {
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
     * Write a {@link KyeroDocument} into an {@link OutputStream}.
     *
     * @param doc    the document to write
     * @param output the stream, where the document is written to
     */
    @SuppressWarnings("Duplicates")
    private static void write(KyeroDocument doc, OutputStream output) {
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
     * Write a {@link KyeroDocument} into a {@link Writer}.
     *
     * @param doc    the document to write
     * @param output the writer, where the document is written to
     */
    @SuppressWarnings("Duplicates")
    private static void write(KyeroDocument doc, Writer output) {
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
     * Write a {@link KyeroDocument} into a {@link String} and print the
     * results to the console.
     *
     * @param doc the document to write
     */
    @SuppressWarnings("Duplicates")
    private static void writeToConsole(KyeroDocument doc) {
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