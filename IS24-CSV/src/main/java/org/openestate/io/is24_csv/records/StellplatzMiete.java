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
package org.openestate.io.is24_csv.records;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import org.apache.commons.csv.CSVRecord;
import org.openestate.io.is24_csv.Is24CsvFormat;
import org.openestate.io.is24_csv.Is24CsvRecord;
import org.openestate.io.is24_csv.types.Immobilienart;
import org.openestate.io.is24_csv.types.ObjektkategorieStellplatz;
import org.openestate.io.is24_csv.types.Objektzustand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Record from the IS24-CSV format for parking spaces to rent.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
@SuppressWarnings("SpellCheckingInspection")
public class StellplatzMiete extends Is24CsvRecord {
    private final static Logger LOGGER = LoggerFactory.getLogger(StellplatzMiete.class);

    /**
     * Objektkategorie 2, Zahl 3
     */
    protected final static int FIELD_OBJEKTKATEGORIE = 60;

    /**
     * Länge, Zahl 5,2
     */
    protected final static int FIELD_LAENGE = 61;

    /**
     * Breite, Zahl 5,2
     */
    protected final static int FIELD_BREITE = 62;

    /**
     * Höhe, Zahl 4,2
     */
    protected final static int FIELD_HOEHE = 63;

    /**
     * Fläche, Zahl 10,2
     */
    protected final static int FIELD_FLAECHE = 64;

    /**
     * Verfügbar ab (TT.MM.JJJJ), Datum 10
     */
    protected final static int FIELD_FREI_AB = 65;

    /**
     * Verfügbar bis (TT.MM.JJJJ), Datum 10
     */
    protected final static int FIELD_FREI_BIS = 66;

    /**
     * Jahr letzte Modernisierung/ Sanierung, Zahl 4
     */
    protected final static int FIELD_SANIERUNGSJAHR = 67;

    /**
     * Baujahr, Zahl 4
     */
    protected final static int FIELD_BAUJAHR = 68;

    /**
     * Objektzustand, Zahl 10
     */
    protected final static int FIELD_OBJEKTZUSTAND = 69;

    /**
     * Preis (Miete), Zahl 6,2
     */
    protected final static int FIELD_MIETE = 90;


    public StellplatzMiete() {
        super();
        this.setImmobilienart(Immobilienart.STELLPLATZ_MIETE);
    }

    @SuppressWarnings("Duplicates")
    public Integer getBaujahr() {
        try {
            return Is24CsvFormat.parseInteger(
                    this.get(FIELD_BAUJAHR));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'Baujahr'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    @SuppressWarnings({"Duplicates", "unused"})
    public BigDecimal getBreite() {
        try {
            return Is24CsvFormat.parseDecimal(
                    this.get(FIELD_BREITE));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'Breite'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    @SuppressWarnings({"Duplicates", "unused"})
    public BigDecimal getFlaeche() {
        try {
            return Is24CsvFormat.parseDecimal(
                    this.get(FIELD_FLAECHE));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'Flaeche'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    @SuppressWarnings({"Duplicates", "unused"})
    public Calendar getFreiAb() {
        try {
            return Is24CsvFormat.parseDateAsCalendar(
                    this.get(FIELD_FREI_AB));
        } catch (ParseException ex) {
            LOGGER.warn("Can't read 'frei ab'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    @SuppressWarnings({"Duplicates", "unused"})
    public Calendar getFreiBis() {
        try {
            return Is24CsvFormat.parseDateAsCalendar(
                    this.get(FIELD_FREI_BIS));
        } catch (ParseException ex) {
            LOGGER.warn("Can't read 'frei bis'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    @SuppressWarnings({"Duplicates", "unused"})
    public BigDecimal getHoehe() {
        try {
            return Is24CsvFormat.parseDecimal(
                    this.get(FIELD_HOEHE));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'Hoehe'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    @SuppressWarnings({"Duplicates", "unused"})
    public BigDecimal getLaenge() {
        try {
            return Is24CsvFormat.parseDecimal(
                    this.get(FIELD_LAENGE));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'Laenge'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    @SuppressWarnings("unused")
    public BigDecimal getMiete() {
        try {
            return Is24CsvFormat.parseDecimal(
                    this.get(FIELD_MIETE));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'Miete'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    public ObjektkategorieStellplatz getObjektkategorie() {
        return ObjektkategorieStellplatz.parse(
                this.get(FIELD_OBJEKTKATEGORIE));
    }

    public Objektzustand getObjektzustand() {
        return Objektzustand.parse(
                this.get(FIELD_OBJEKTZUSTAND));
    }

    @SuppressWarnings("Duplicates")
    public Integer getSanierungsjahr() {
        try {
            return Is24CsvFormat.parseInteger(
                    this.get(FIELD_SANIERUNGSJAHR));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'Sanierungsjahr'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    public static StellplatzMiete newRecord(CSVRecord record) {
        StellplatzMiete is24Record = new StellplatzMiete();
        is24Record.parse(record);
        return is24Record;
    }

    @Override
    protected Iterable<String> print() {
        this.setImmobilienart(Immobilienart.STELLPLATZ_MIETE);
        return super.print();
    }

    public void setBaujahr(Number value) {
        this.set(FIELD_BAUJAHR,
                Is24CsvFormat.printNumber(value, 4));
    }

    @SuppressWarnings("unused")
    public void setBreite(Number value) {
        this.set(FIELD_BREITE,
                Is24CsvFormat.printNumber(value, 5, 2));
    }

    @SuppressWarnings("unused")
    public void setFlaeche(Number value) {
        this.set(FIELD_FLAECHE,
                Is24CsvFormat.printNumber(value, 10, 2));
    }

    @SuppressWarnings("unused")
    public void setFreiAb(Calendar value) {
        this.set(FIELD_FREI_AB,
                Is24CsvFormat.printDate(value));
    }

    @SuppressWarnings("unused")
    public void setFreiAb(Date value) {
        this.set(FIELD_FREI_AB,
                Is24CsvFormat.printDate(value));
    }

    @SuppressWarnings("unused")
    public void setFreiBis(Calendar value) {
        this.set(FIELD_FREI_BIS,
                Is24CsvFormat.printDate(value));
    }

    @SuppressWarnings("unused")
    public void setFreiBis(Date value) {
        this.set(FIELD_FREI_BIS,
                Is24CsvFormat.printDate(value));
    }

    @SuppressWarnings("unused")
    public void setHoehe(Number value) {
        this.set(FIELD_HOEHE,
                Is24CsvFormat.printNumber(value, 5, 2));
    }

    @SuppressWarnings("unused")
    public void setLaenge(Number value) {
        this.set(FIELD_LAENGE,
                Is24CsvFormat.printNumber(value, 5, 2));
    }

    @SuppressWarnings("unused")
    public void setMiete(Number value) {
        this.set(FIELD_MIETE,
                Is24CsvFormat.printNumber(value, 6, 2));
    }

    public void setObjektkategorie(ObjektkategorieStellplatz value) {
        this.set(FIELD_OBJEKTKATEGORIE,
                (value != null) ? value.print() : null);
    }

    public void setObjektzustand(Objektzustand value) {
        this.set(FIELD_OBJEKTZUSTAND,
                (value != null) ? value.print() : null);
    }

    public void setSanierungsjahr(Number value) {
        this.set(FIELD_SANIERUNGSJAHR,
                Is24CsvFormat.printNumber(value, 4));
    }
}