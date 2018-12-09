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
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.io.output.NullWriter;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openestate.io.examples.utils.RandomStringUtils;
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
 * Example for writing XML files for
 * <a href="http://wohnen-in-suedtirol.it">wohnen-in-suedtirol.it</a>.
 * <p>
 * This example illustrates the programmatic creation of documents for
 * <a href="http://wohnen-in-suedtirol.it">wohnen-in-suedtirol.it</a> and how
 * they are written into XML.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
@SuppressWarnings("WeakerAccess")
public class WisItWritingExample {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(WisItWritingExample.class);
    private final static String PACKAGE = "/org/openestate/io/examples";
    private final static ObjectFactory FACTORY = WisItUtils.getFactory();
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
                WisItWritingExample.class.getResource(PACKAGE + "/log4j.properties"));

        // create a WIS object with some example data
        // this object corresponds to the <WIS> element in XML
        WIS wis = FACTORY.createWIS();
        wis.setBENUTZER(FACTORY.createWISBENUTZER());
        wis.setOBJEKTE(FACTORY.createWISOBJEKTE());

        // append some example ads to the transfer
        wis.getOBJEKTE().getOBJEKT().add(createOBJEKT());
        wis.getOBJEKTE().getOBJEKT().add(createOBJEKT());
        wis.getOBJEKTE().getOBJEKT().add(createOBJEKT());
        wis.getOBJEKTE().setANZAHL(BigInteger.valueOf(wis.getOBJEKTE().getOBJEKT().size()));

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
    protected static ObjectType createOBJEKT() {
        // create an example real estate
        ObjectType obj = FACTORY.createObjectType();
        obj.setABSTELLPLATZ(RandomUtils.nextInt(0, 2) == 1);
        obj.setAUFANFRAGE(RandomUtils.nextInt(0, 2) == 1);
        obj.setAUFZUG(RandomUtils.nextInt(0, 2) == 1);
        obj.setBALKON(RandomUtils.nextInt(0, 2) == 1);
        obj.setBAUJAHR(String.valueOf(RandomUtils.nextInt(1900, 2015)));
        obj.setDACHBODEN(RandomUtils.nextInt(0, 2) == 1);
        obj.setFLAECHEART(AreaType.NETTO);
        obj.setFOERDERBAR(RandomUtils.nextInt(0, 2) == 1);
        obj.setFRAKTION("some notes about the fraction");
        obj.setGARAGE(RandomUtils.nextInt(0, 2) == 1);
        obj.setGRUENFLAECHE(RandomUtils.nextInt(0, 2) == 1);
        obj.setGUELTIGBIS(Calendar.getInstance());
        obj.setHEIZUNG(HeatingType.ZENTRAL);
        obj.setID(RandomStringUtils.random(5));
        obj.setIMMOBILIENART(PropertyType.EINFAMILIENHAUS);
        obj.setINFODE("some description in german language");
        obj.setINFOIT("some description in italian language");
        obj.setKELLER(RandomUtils.nextInt(0, 2) == 1);
        obj.setKLIMAHAUS(EnergyStandard.A);
        obj.setKONVENTIONIERT(RandomUtils.nextInt(0, 2) == 1);
        obj.setKUBATUR(BigDecimal.valueOf(RandomUtils.nextDouble(100, 1000)));
        obj.setLOESCHEN(RandomUtils.nextInt(0, 2) == 1);
        obj.setLOGGIA(RandomUtils.nextInt(0, 2) == 1);
        obj.setMIETEKAUF(MarketingType.MIETE);
        obj.setNUTZFLAECHE(BigDecimal.valueOf(RandomUtils.nextDouble(100, 1000)));
        obj.setORT("Bozen");
        obj.setPREIS(BigDecimal.valueOf(RandomUtils.nextDouble(300, 3000)));
        obj.setSTOCKWERK(BigInteger.valueOf(RandomUtils.nextInt(0, 5)));
        obj.setSTOCKWERKE(BigInteger.valueOf(RandomUtils.nextInt(0, 10)));
        obj.setTERRASSE(RandomUtils.nextInt(0, 2) == 1);
        obj.setUEBERGABEZEITPUNKT("some notes about the time of handover");
        obj.setZIMMER(BigInteger.valueOf(RandomUtils.nextInt(1, 5)));
        obj.setZUSTAND(ConditionType.GEBRAUCHT);

        obj.setBILD1(obj.getID() + "_1.jpg");
        obj.setBILD2(obj.getID() + "_2.jpg");
        obj.setBILD3(obj.getID() + "_3.jpg");
        obj.setBILD4(obj.getID() + "_4.jpg");
        obj.setBILD5(obj.getID() + "_5.jpg");
        obj.setBILD6(obj.getID() + "_6.jpg");
        obj.setBILD7(obj.getID() + "_7.jpg");
        obj.setBILD8(obj.getID() + "_8.jpg");
        obj.setBILD9(obj.getID() + "_9.jpg");
        obj.setBILD10(obj.getID() + "_10.jpg");

        obj.setDOWNLOAD1(obj.getID() + "_1.pdf");
        obj.setDOWNLOAD2(obj.getID() + "_2.pdf");
        obj.setDOWNLOAD3(obj.getID() + "_3.pdf");

        return obj;
    }

    /**
     * Write a {@link WisItDocument} into a {@link File}.
     *
     * @param doc  the document to write
     * @param file the file, where the document is written to
     */
    @SuppressWarnings("Duplicates")
    protected static void write(WisItDocument doc, File file) {
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
    protected static void write(WisItDocument doc, OutputStream output) {
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
    protected static void write(WisItDocument doc, Writer output) {
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
    protected static void writeToConsole(WisItDocument doc) {
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