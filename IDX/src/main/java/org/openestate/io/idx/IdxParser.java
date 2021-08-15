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
package org.openestate.io.idx;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.openestate.io.core.CsvParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Parser for the IDX format.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public class IdxParser extends CsvParser<IdxRecord> {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(IdxParser.class);

    /**
     * Create with specifications of a {@link CSVParser}.
     *
     * @param parser the CSV parser from <a href="https://commons.apache.org/proper/commons-csv/">commons-csv</a>
     */
    protected IdxParser(CSVParser parser) {
        super(parser);
    }

    /**
     * Creates a {@link IdxParser} from a {@link String} with CSV data.
     *
     * @param csvString CSV string
     * @return created parser
     * @throws IOException if CSV is not readable
     */
    public static IdxParser create(String csvString) throws IOException {
        return new IdxFormat().parse(csvString);
    }

    /**
     * Creates a {@link IdxParser} from a {@link File} with CSV data.
     *
     * @param csvFile CSV file
     * @return created parser
     * @throws IOException if CSV is not readable
     */
    public static IdxParser create(File csvFile) throws IOException {
        return new IdxFormat().parse(csvFile);
    }

    /**
     * Creates a {@link IdxParser} from an {@link InputStream} with CSV data.
     *
     * @param input CSV input
     * @return created parser
     * @throws IOException if CSV is not readable
     */
    public static IdxParser create(InputStream input) throws IOException {
        return new IdxFormat().parse(input);
    }

    /**
     * Creates a {@link IdxParser} from a {@link Reader} with CSV data.
     *
     * @param input CSV input
     * @return created parser
     * @throws IOException if CSV is not readable
     */
    public static IdxParser create(Reader input) throws IOException {
        return new IdxFormat().parse(input);
    }

    @Override
    protected IdxRecord newRecord(CSVRecord record) {
        return IdxRecord.newRecord(record);
    }
}