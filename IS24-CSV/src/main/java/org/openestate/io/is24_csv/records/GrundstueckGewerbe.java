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
import org.apache.commons.csv.CSVRecord;
import org.openestate.io.is24_csv.Is24CsvFormat;
import org.openestate.io.is24_csv.types.BebaubarNach;
import org.openestate.io.is24_csv.types.Erschliessung;
import org.openestate.io.is24_csv.types.Immobilienart;
import org.openestate.io.is24_csv.types.NutzungGrundstueckGewerbe;
import org.openestate.io.is24_csv.types.ObjektkategorieGrundstueck;
import org.openestate.io.is24_csv.types.Vermarktungsart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Record from the IS24-CSV format for plots with commercial use.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
@SuppressWarnings("SpellCheckingInspection")
public class GrundstueckGewerbe extends Grundstueck {
    private final static Logger LOGGER = LoggerFactory.getLogger(GrundstueckGewerbe.class);

    /**
     * Grundstücksfläche, Zahl 10,2
     */
    protected final static int FIELD_GRUNDSTUECKSFLAECHE = 62;

    /**
     * Fläche teilbar ab (in m²), Zahl 8
     */
    protected final static int FIELD_FLAECHE_TEILBAR_AB = 63;

    /**
     * Empfohlene Nutzung, Zahl 2 (Mehrfachauswahl möglich, wenn Eingaben durch Semikolon getrennt werden. Jeder mögliche Wert darf max. einmal erscheinen.)
     */
    protected final static int FIELD_EMPFOHLENE_NUTZUNG = 64;

    /**
     * bebaubar nach, Text 1
     */
    protected final static int FIELD_BEBAUBAR_NACH = 65;

    /**
     * Erbpachtdauer in Jahren (Heimfall nach), Zahl 3
     */
    protected final static int FIELD_ERBPACHTDAUER = 66;

    /**
     * Baugenehmigung vorhanden, Text 1
     */
    protected final static int FIELD_BAUGENEHMIGUNG_VORHANDEN = 67;

    /**
     * Abriss erforderlich, Text 1
     */
    protected final static int FIELD_ABRISS_ERFORDERLICH = 68;

    /**
     * Grundflächenzahl (GRZ), Zahl 3,2
     */
    protected final static int FIELD_GRUNDFLAECHENZAHL = 69;

    /**
     * Geschoßflächenzahl (GFZ), Zahl 3,2
     */
    protected final static int FIELD_GESCHOSSFLAECHENZAHL = 70;

    /**
     * Erschließung, Text 1
     */
    protected final static int FIELD_ERSCHLIESSUNG = 71;

    /**
     * kurzfristig bebaubar, Text 1
     */
    protected final static int FIELD_KURZFRISTIG_BEBAUBAR = 72;

    /**
     * frei ab / verfügbar ab / Antrittstermin, Text 50
     */
    protected final static int FIELD_VERFUEGBAR_AB = 73;

    /**
     * Kaufpreis / Erbpacht pro Jahr / Miete / Pacht, Zahl 15,2
     */
    protected final static int FIELD_PREIS = 90;

    public GrundstueckGewerbe() {
        super();
        this.setImmobilienart(Immobilienart.GRUNDSTUECKE);
        this.setObjektkategorie(ObjektkategorieGrundstueck.GEWERBE);
    }

    @SuppressWarnings("unused")
    public Boolean getAbrissErforderlich() {
        return Is24CsvFormat.parseBoolean(
                this.get(FIELD_ABRISS_ERFORDERLICH));
    }

    @SuppressWarnings("unused")
    public Boolean getBaugenehmigungVorhanden() {
        return Is24CsvFormat.parseBoolean(
                this.get(FIELD_BAUGENEHMIGUNG_VORHANDEN));
    }

    @SuppressWarnings("unused")
    public BebaubarNach getBebaubarNach() {
        return BebaubarNach.parse(
                this.get(FIELD_BEBAUBAR_NACH));
    }

    @SuppressWarnings("unused")
    public NutzungGrundstueckGewerbe[] getEmpfohleneNutzung() {
        return NutzungGrundstueckGewerbe.parseMultiple(
                this.get(FIELD_EMPFOHLENE_NUTZUNG));
    }

    @SuppressWarnings({"Duplicates", "unused"})
    public Integer getErbpachtdauer() {
        try {
            return Is24CsvFormat.parseInteger(
                    this.get(FIELD_ERBPACHTDAUER));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'Erbpachtdauer'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    @SuppressWarnings("unused")
    public Erschliessung getErschliessung() {
        return Erschliessung.parse(
                this.get(FIELD_ERSCHLIESSUNG));
    }

    @SuppressWarnings({"Duplicates", "unused"})
    public Long getFlaecheTeilbarAb() {
        try {
            return Is24CsvFormat.parseLong(
                    this.get(FIELD_FLAECHE_TEILBAR_AB));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'Flaeche teilbar ab'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    @SuppressWarnings({"Duplicates", "unused"})
    public BigDecimal getGeschossflaechenzahl() {
        try {
            return Is24CsvFormat.parseDecimal(
                    this.get(FIELD_GESCHOSSFLAECHENZAHL));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'Geschossflaechenzahl'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    @SuppressWarnings({"Duplicates", "unused"})
    public BigDecimal getGrundflaechenzahl() {
        try {
            return Is24CsvFormat.parseDecimal(
                    this.get(FIELD_GRUNDFLAECHENZAHL));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'Grundflaechenzahl'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    @SuppressWarnings("Duplicates")
    public BigDecimal getGrundstuecksflaeche() {
        try {
            return Is24CsvFormat.parseDecimal(
                    this.get(FIELD_GRUNDSTUECKSFLAECHE));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'Grundstuecksflaeche'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    @SuppressWarnings("unused")
    public Boolean getKurzfristigBebaubar() {
        return Is24CsvFormat.parseBoolean(
                this.get(FIELD_KURZFRISTIG_BEBAUBAR));
    }

    @SuppressWarnings("Duplicates")
    public BigDecimal getPreis() {
        try {
            return Is24CsvFormat.parseDecimal(
                    this.get(FIELD_PREIS));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'Preis'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    public String getVerfuegbarAb() {
        return this.get(FIELD_VERFUEGBAR_AB);
    }

    public static GrundstueckGewerbe newRecord(CSVRecord record) {
        GrundstueckGewerbe is24Record = new GrundstueckGewerbe();
        is24Record.parse(record);
        return is24Record;
    }

    @Override
    protected Iterable<String> print() {
        this.setImmobilienart(Immobilienart.GRUNDSTUECKE);

        ObjektkategorieGrundstueck kat = this.getObjektkategorie();
        if (kat == null) this.setObjektkategorie(ObjektkategorieGrundstueck.GEWERBE);

        Vermarktungsart art = this.getVermarktungsart();
        if (!Vermarktungsart.ERBPACHT.equals(art)) this.setErbpachtdauer(null);

        return super.print();
    }

    @SuppressWarnings("unused")
    public void setAbrissErforderlich(Boolean value) {
        this.set(FIELD_ABRISS_ERFORDERLICH,
                Is24CsvFormat.printBoolean(value));
    }

    @SuppressWarnings("unused")
    public void setBaugenehmigungVorhanden(Boolean value) {
        this.set(FIELD_BAUGENEHMIGUNG_VORHANDEN,
                Is24CsvFormat.printBoolean(value));
    }

    @SuppressWarnings("unused")
    public void setBebaubarNach(BebaubarNach value) {
        this.set(FIELD_BEBAUBAR_NACH,
                (value != null) ? value.print() : null);
    }

    @SuppressWarnings("unused")
    public void setEmpfohleneNutzung(NutzungGrundstueckGewerbe value) {
        this.set(FIELD_EMPFOHLENE_NUTZUNG,
                (value != null) ? value.print() : null);
    }

    @SuppressWarnings("unused")
    public void setEmpfohleneNutzung(Iterable<NutzungGrundstueckGewerbe> values) {
        this.set(FIELD_EMPFOHLENE_NUTZUNG,
                NutzungGrundstueckGewerbe.printMultiple(values));
    }

    public void setErbpachtdauer(Number value) {
        this.set(FIELD_ERBPACHTDAUER,
                Is24CsvFormat.printNumber(value, 3));
    }

    @SuppressWarnings("unused")
    public void setErschliessung(Erschliessung value) {
        this.set(FIELD_ERSCHLIESSUNG,
                (value != null) ? value.print() : null);
    }

    @SuppressWarnings("unused")
    public void setFlaecheTeilbarAb(Number value) {
        this.set(FIELD_FLAECHE_TEILBAR_AB,
                Is24CsvFormat.printNumber(value, 8));
    }

    @SuppressWarnings("unused")
    public void setGeschossflaechenzahl(Number value) {
        this.set(FIELD_GESCHOSSFLAECHENZAHL,
                Is24CsvFormat.printNumber(value, 3, 2));
    }

    @SuppressWarnings("unused")
    public void setGrundflaechenzahl(Number value) {
        this.set(FIELD_GRUNDFLAECHENZAHL,
                Is24CsvFormat.printNumber(value, 3, 2));
    }

    public void setGrundstuecksflaeche(Number value) {
        this.set(FIELD_GRUNDSTUECKSFLAECHE,
                Is24CsvFormat.printNumber(value, 10, 2));
    }

    @SuppressWarnings("unused")
    public void setKurzfristigBebaubar(Boolean value) {
        this.set(FIELD_KURZFRISTIG_BEBAUBAR,
                Is24CsvFormat.printBoolean(value));
    }

    @Override
    public void setObjektkategorie(ObjektkategorieGrundstueck value) {
        if (ObjektkategorieGrundstueck.WOHNEN.equals(value))
            throw new IllegalArgumentException("The provided value (" + value + ") is not supported by this record.");

        super.setObjektkategorie((value != null) ? value : ObjektkategorieGrundstueck.GEWERBE);
    }

    public void setPreis(Number value) {
        this.set(FIELD_PREIS,
                Is24CsvFormat.printNumber(value, 15, 2));
    }

    public void setVerfuegbarAb(String value) {
        this.set(FIELD_VERFUEGBAR_AB,
                Is24CsvFormat.printString(value, 50));
    }
}