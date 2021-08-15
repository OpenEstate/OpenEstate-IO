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
package org.openestate.io.filemaker;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openestate.io.filemaker.xml.result.FMPXMLRESULT;
import org.openestate.io.filemaker.xml.result.MetaDataType;
import org.openestate.io.filemaker.xml.result.ResultSetType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class provides high level read access to fields and values from a {@link FMPXMLRESULT}.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public class FilemakerResultMapping {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(FilemakerResultMapping.class);
    private final List<MetaDataType.FIELD> fields;
    private final List<Row> rows;

    /**
     * Create from a {@link FMPXMLRESULT}.
     *
     * @param result the object to create from
     */
    public FilemakerResultMapping(FMPXMLRESULT result) {
        if (result.getMETADATA() == null || result.getMETADATA().getFIELD().isEmpty()) {
            throw new IllegalArgumentException("No metadata is present in the xml result!");
        }
        this.fields = new ArrayList<>();
        this.fields.addAll(result.getMETADATA().getFIELD());

        this.rows = new ArrayList<>();
        if (result.getRESULTSET() != null) {
            for (ResultSetType.ROW row : result.getRESULTSET().getROW()) {
                this.rows.add(new Row(row.getRECORDID(), row.getMODID(), row, this.fields));
            }
        }
    }

    /**
     * Returns the field definition at a certain position.
     *
     * @param index position of the field within the {@link FMPXMLRESULT}, starting with 0
     * @return field definition at the provided index position, or null if not found
     */
    @SuppressWarnings("unused")
    public MetaDataType.FIELD getField(int index) {
        return this.fields.get(index);
    }

    /**
     * Returns the number of specified fields.
     *
     * @return number of fields
     */
    public int getFieldCount() {
        return this.fields.size();
    }

    /**
     * Returns the names of specified fields.
     *
     * @return names of the fields
     */
    @SuppressWarnings("unused")
    public String[] getFieldNames() {
        List<String> names = new ArrayList<>();
        for (MetaDataType.FIELD field : this.fields) {
            names.add(field.getNAME());
        }
        return names.toArray(new String[0]);
    }

    /**
     * Returns the specified fields.
     *
     * @return fields
     */
    @SuppressWarnings("unused")
    public MetaDataType.FIELD[] getFields() {
        return this.fields.toArray(new MetaDataType.FIELD[0]);
    }

    /**
     * Returns the row with its values at a certain position.
     *
     * @param index position of the row within the {@link FMPXMLRESULT}, starting with 0
     * @return row at the provided index position, or null if not found
     */
    public Row getRow(int index) {
        return this.rows.get(index);
    }

    /**
     * Returns the number of available rows.
     *
     * @return number of rows
     */
    public int getRowCount() {
        return this.rows.size();
    }

    /**
     * Returns the specified rows.
     *
     * @return rows
     */
    @SuppressWarnings("unused")
    public Row[] getRows() {
        return this.rows.toArray(new Row[0]);
    }

    /**
     * This class contains the data from a column of a certain row.
     */
    public final static class Column {
        private final MetaDataType.FIELD field;
        private final List<String> data;

        private Column(MetaDataType.FIELD field, List<String> data) {
            this.field = field;
            this.data = data;
        }

        /**
         * Returns the field definition for the column.
         *
         * @return field definition
         */
        public MetaDataType.FIELD getField() {
            return this.field;
        }

        /**
         * Returns the first value within the column.
         *
         * @return first value
         */
        public String getValue() {
            return (!this.data.isEmpty()) ? this.data.get(0) : null;
        }

        /**
         * Returns all values within the column.
         *
         * @return all values
         */
        public String[] getValues() {
            return this.data.toArray(new String[0]);
        }
    }

    /**
     * This class contains the data of a certain row.
     */
    @SuppressWarnings("SpellCheckingInspection")
    public final static class Row {
        private final long recordId;
        private final long modId;
        private final Map<String, Column> columns;

        private Row(BigInteger recordId, BigInteger modId, ResultSetType.ROW row, List<MetaDataType.FIELD> fields) {
            this.recordId = (recordId != null) ? recordId.longValue() : 0;
            this.modId = (modId != null) ? modId.longValue() : 0;
            this.columns = new HashMap<>();

            int i = 0;
            for (ResultSetType.ROW.COL col : row.getCOL()) {
                MetaDataType.FIELD field = fields.get(i);
                if (field == null) {
                    LOGGER.warn("Can't find a field definition for column " + i + "!");
                    continue;
                }
                this.columns.put(field.getNAME(), new Column(field, col.getDATA()));
                i++;
            }
        }

        /**
         * Returns the column for a certain field name.
         *
         * @param name name of the field
         * @return column for the provided field, or null if not found
         */
        @SuppressWarnings("unused")
        public Column getColumn(String name) {
            return this.columns.get(name);
        }

        /**
         * Returns the definition for a certain field name.
         *
         * @param name name of the field
         * @return definition for the provided field, or null if not found
         */
        @SuppressWarnings("unused")
        public MetaDataType.FIELD getField(String name) {
            Column col = this.columns.get(name);
            return (col != null) ? col.getField() : null;
        }

        /**
         * Returns the field names within the row.
         *
         * @return field names
         */
        public String[] getFieldNames() {
            return this.columns.keySet().toArray(new String[0]);
        }

        /**
         * Returns the MODID value of the row.
         *
         * @return MODID value
         */
        public long getModId() {
            return this.modId;
        }

        /**
         * Returns the RECORDID value of the row.
         *
         * @return RECORDID value
         */
        public long getRecordId() {
            return this.recordId;
        }

        /**
         * Returns the first value for a certain field name.
         *
         * @param name name of the field
         * @return first value for the provided field, or null if not found
         */
        public String getValue(String name) {
            Column col = this.columns.get(name);
            return (col != null) ? col.getValue() : null;
        }

        /**
         * Returns all values for a certain field name.
         *
         * @param name name of the field
         * @return all values for the provided field, or null if not found
         */
        @SuppressWarnings("unused")
        public String[] getValues(String name) {
            Column col = this.columns.get(name);
            return (col != null) ? col.getValues() : null;
        }
    }
}