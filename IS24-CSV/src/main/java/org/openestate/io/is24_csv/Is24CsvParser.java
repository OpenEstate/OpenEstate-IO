/*
 * Copyright 2015-2019 OpenEstate.org.
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
package org.openestate.io.is24_csv;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.openestate.io.core.CsvParser;
import org.openestate.io.is24_csv.records.Anlageobjekt;
import org.openestate.io.is24_csv.records.GewerbeBueroPraxis;
import org.openestate.io.is24_csv.records.GewerbeEinzelhandel;
import org.openestate.io.is24_csv.records.GewerbeGastronomieHotel;
import org.openestate.io.is24_csv.records.GewerbeHalleProduktion;
import org.openestate.io.is24_csv.records.GewerbeSonstiges;
import org.openestate.io.is24_csv.records.Grundstueck;
import org.openestate.io.is24_csv.records.GrundstueckGewerbe;
import org.openestate.io.is24_csv.records.GrundstueckWohnen;
import org.openestate.io.is24_csv.records.HausKauf;
import org.openestate.io.is24_csv.records.HausMiete;
import org.openestate.io.is24_csv.records.StellplatzKauf;
import org.openestate.io.is24_csv.records.StellplatzMiete;
import org.openestate.io.is24_csv.records.WohnenAufZeit;
import org.openestate.io.is24_csv.records.WohnungKauf;
import org.openestate.io.is24_csv.records.WohnungMiete;
import org.openestate.io.is24_csv.types.Immobilienart;
import org.openestate.io.is24_csv.types.ObjektkategorieGrundstueck;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Parser for the IS24-CSV format.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
@SuppressWarnings("WeakerAccess")
public class Is24CsvParser extends CsvParser<Is24CsvRecord> {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(Is24CsvParser.class);

    /**
     * Create with specifications of a {@link CSVParser}.
     *
     * @param parser the CSV parser from
     *               <a href="http://commons.apache.org/proper/commons-csv/">commons-csv</a>
     */
    protected Is24CsvParser(CSVParser parser) {
        super(parser);
    }

    /**
     * Creates a {@link Is24CsvParser} from a {@link String} with CSV data.
     *
     * @param csvString CSV string
     * @return created parser
     * @throws IOException if CSV is not readable
     */
    public static Is24CsvParser create(String csvString) throws IOException {
        return new Is24CsvFormat().parse(csvString);
    }

    /**
     * Creates a {@link Is24CsvParser} from a {@link File} with CSV data.
     *
     * @param csvFile CSV file
     * @return created parser
     * @throws IOException if CSV is not readable
     */
    public static Is24CsvParser create(File csvFile) throws IOException {
        return new Is24CsvFormat().parse(csvFile);
    }

    /**
     * Creates a {@link Is24CsvParser} from an {@link InputStream} with CSV data.
     *
     * @param input CSV input
     * @return created parser
     * @throws IOException if CSV is not readable
     */
    public static Is24CsvParser create(InputStream input) throws IOException {
        return new Is24CsvFormat().parse(input);
    }

    /**
     * Creates a {@link Is24CsvParser} from a {@link Reader} with CSV data.
     *
     * @param input CSV input
     * @return created parser
     * @throws IOException if CSV is not readable
     */
    public static Is24CsvParser create(Reader input) throws IOException {
        return new Is24CsvFormat().parse(input);
    }

    /**
     * Creates a record, according to the object category, that is provided in
     * a {@link CSVRecord}.
     *
     * @param record the record to process
     * @return created record or null, if no matching record was found
     */
    public static Is24CsvRecord createRecord(CSVRecord record) {
        Immobilienart art = Is24CsvRecord.getImmobilienart(record);

        if (Immobilienart.ANLAGE.equals(art))
            return Anlageobjekt.newRecord(record);

        else if (Immobilienart.GEWERBE_BUERO_PRAXEN.equals(art))
            return GewerbeBueroPraxis.newRecord(record);

        else if (Immobilienart.GEWERBE_EINZELHANDEL.equals(art))
            return GewerbeEinzelhandel.newRecord(record);

        else if (Immobilienart.GEWERBE_GASTRONOMIE_HOTEL.equals(art))
            return GewerbeGastronomieHotel.newRecord(record);

        else if (Immobilienart.GEWERBE_HALLE_PRODUKTION.equals(art))
            return GewerbeHalleProduktion.newRecord(record);

        else if (Immobilienart.GEWERBE_SONSTIGES.equals(art))
            return GewerbeSonstiges.newRecord(record);

        else if (Immobilienart.HAUS_KAUF.equals(art))
            return HausKauf.newRecord(record);

        else if (Immobilienart.HAUS_MIETE.equals(art))
            return HausMiete.newRecord(record);

        else if (Immobilienart.STELLPLATZ_KAUF.equals(art))
            return StellplatzKauf.newRecord(record);

        else if (Immobilienart.STELLPLATZ_MIETE.equals(art))
            return StellplatzMiete.newRecord(record);

        else if (Immobilienart.WOHNEN_AUF_ZEIT.equals(art))
            return WohnenAufZeit.newRecord(record);

        else if (Immobilienart.WOHNUNG_KAUF.equals(art))
            return WohnungKauf.newRecord(record);

        else if (Immobilienart.WOHNUNG_MIETE.equals(art))
            return WohnungMiete.newRecord(record);

        // Immobilienart für Grundstücke wird abhängig zur Objektkategorie erzeugt
        else if (Immobilienart.GRUNDSTUECKE.equals(art)) {
            ObjektkategorieGrundstueck cat = Grundstueck.getObjektkategorie(record);
            if (ObjektkategorieGrundstueck.WOHNEN.equals(cat))
                return GrundstueckWohnen.newRecord(record);
            else
                return GrundstueckGewerbe.newRecord(record);
        }

        LOGGER.warn("Unsupported 'Immobilienart' value: " + record.get(Is24CsvRecord.FIELD_IMMOBILIENART));
        return null;
    }

    @Override
    protected Is24CsvRecord newRecord(CSVRecord record) {
        return Is24CsvParser.createRecord(record);
    }
}