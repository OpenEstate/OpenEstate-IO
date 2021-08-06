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
import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.io.output.NullWriter;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openestate.io.wis_it.WisItDocument;
import org.openestate.io.wis_it.WisItUtils;
import org.openestate.io.wis_it.xml.AreaType;
import org.openestate.io.wis_it.xml.ConditionType;
import org.openestate.io.wis_it.xml.EnergyStandard;
import org.openestate.io.wis_it.xml.HeatingType;
import org.openestate.io.wis_it.xml.MarketingType;
import org.openestate.io.wis_it.xml.ObjectFactory;
import org.openestate.io.wis_it.xml.ObjectType;
import org.openestate.io.wis_it.xml.PropertyType;
import org.openestate.io.wis_it.xml.WIS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Example for writing XML files for <a href="http://wohnen-in-suedtirol.it">wohnen-in-suedtirol.it</a>.
 * <p>
 * This example illustrates the programmatic creation of documents for
 * <a href="http://wohnen-in-suedtirol.it">wohnen-in-suedtirol.it</a> and how they are written into XML.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public class WisItWritingExample {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(WisItWritingExample.class);
    private final static ObjectFactory FACTORY = WisItUtils.getFactory();
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
                WisItWritingExample.class.getResource("log4j.properties"));

        // create a WIS object with some example data
        // this object corresponds to the <WIS> element in XML
        WIS wis = FACTORY.createWIS();
        wis.setBENUTZER(FACTORY.createWISBENUTZER());
        wis.setOBJEKTE(FACTORY.createWISOBJEKTE());

        // append some example ads to the transfer
        int objectCount = RandomUtils.nextInt(3, 10);
        for (int i = 0; i < objectCount; i++) {
            wis.getOBJEKTE().getOBJEKT().add(createOBJEKT());
        }
        wis.getOBJEKTE().setANZAHL(BigInteger.valueOf(objectCount));

        // convert the WIS object into a XML document
        WisItDocument doc = null;
        try {
            doc = WisItDocument.newDocument(wis);
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
     * Create an {@link ObjectType} with some example data.
     *
     * @return created example object
     */
    private static ObjectType createOBJEKT() {
        // create an example real estate
        ObjectType obj = FACTORY.createObjectType();
        obj.setABSTELLPLATZ(RandomUtils.nextBoolean());
        obj.setAUFANFRAGE(RandomUtils.nextBoolean());
        obj.setAUFZUG(RandomUtils.nextBoolean());
        obj.setBALKON(RandomUtils.nextBoolean());
        obj.setBAUJAHR(String.valueOf(RandomUtils.nextInt(1900, 2015)));
        obj.setDACHBODEN(RandomUtils.nextBoolean());
        obj.setFLAECHEART(randomValue(AreaType.values()));
        obj.setFOERDERBAR(RandomUtils.nextBoolean());
        obj.setFRAKTION(RANDOMIZER.getWords(1, 5));
        obj.setGARAGE(RandomUtils.nextBoolean());
        obj.setGRUENFLAECHE(RandomUtils.nextBoolean());
        obj.setGUELTIGBIS(Calendar.getInstance());
        obj.setHEIZUNG(randomValue(HeatingType.values()));
        obj.setID(RandomStringUtils.randomAlphanumeric(5));
        obj.setIMMOBILIENART(randomValue(PropertyType.values()));
        obj.setINFODE(RANDOMIZER.getWords(10, 50));
        obj.setINFOIT(RANDOMIZER.getWords(10, 50));
        obj.setKELLER(RandomUtils.nextBoolean());
        obj.setKLIMAHAUS(randomValue(EnergyStandard.values()));
        obj.setKONVENTIONIERT(RandomUtils.nextBoolean());
        obj.setKUBATUR(BigDecimal.valueOf(RandomUtils.nextDouble(100, 1000)));
        obj.setLOESCHEN(RandomUtils.nextBoolean());
        obj.setLOGGIA(RandomUtils.nextBoolean());
        obj.setMIETEKAUF(randomValue(MarketingType.values()));
        obj.setNUTZFLAECHE(BigDecimal.valueOf(RandomUtils.nextDouble(100, 1000)));
        obj.setORT(RANDOMIZER.getCity());
        obj.setPREIS(BigDecimal.valueOf(RandomUtils.nextDouble(300, 3000)));
        obj.setSTOCKWERK(BigInteger.valueOf(RandomUtils.nextInt(1, 5)));
        obj.setSTOCKWERKE(BigInteger.valueOf(RandomUtils.nextInt(1, 10)));
        obj.setTERRASSE(RandomUtils.nextBoolean());
        obj.setUEBERGABEZEITPUNKT(RANDOMIZER.getWords(1, 10));
        obj.setZIMMER(BigInteger.valueOf(RandomUtils.nextInt(1, 5)));
        obj.setZUSTAND(randomValue(ConditionType.values()));

        obj.setBILD1(obj.getID() + "-01.jpg");
        obj.setBILD2(obj.getID() + "-02.jpg");
        obj.setBILD3(obj.getID() + "-03.jpg");
        obj.setBILD4(obj.getID() + "-04.jpg");
        obj.setBILD5(obj.getID() + "-05.jpg");
        obj.setBILD6(obj.getID() + "-06.jpg");
        obj.setBILD7(obj.getID() + "-07.jpg");
        obj.setBILD8(obj.getID() + "-08.jpg");
        obj.setBILD9(obj.getID() + "-09.jpg");
        obj.setBILD10(obj.getID() + "-10.jpg");

        obj.setDOWNLOAD1(obj.getID() + "-01.pdf");
        obj.setDOWNLOAD2(obj.getID() + "-02.pdf");
        obj.setDOWNLOAD3(obj.getID() + "-03.pdf");

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
     * Write a {@link WisItDocument} into a {@link File}.
     *
     * @param doc  the document to write
     * @param file the file, where the document is written to
     */
    @SuppressWarnings("Duplicates")
    private static void write(WisItDocument doc, File file) {
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
     * Write a {@link WisItDocument} into an {@link OutputStream}.
     *
     * @param doc    the document to write
     * @param output the stream, where the document is written to
     */
    @SuppressWarnings("Duplicates")
    private static void write(WisItDocument doc, OutputStream output) {
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
     * Write a {@link WisItDocument} into a {@link Writer}.
     *
     * @param doc    the document to write
     * @param output the writer, where the document is written to
     */
    @SuppressWarnings("Duplicates")
    private static void write(WisItDocument doc, Writer output) {
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
     * Write a {@link WisItDocument} into a {@link String} and print the
     * results to the console.
     *
     * @param doc the document to write
     */
    @SuppressWarnings("Duplicates")
    private static void writeToConsole(WisItDocument doc) {
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