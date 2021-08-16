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
import org.openestate.io.is24_csv.Is24CsvRecord;
import org.openestate.io.is24_csv.types.Ausstattung;
import org.openestate.io.is24_csv.types.Befeuerungsart;
import org.openestate.io.is24_csv.types.Bodenbelag;
import org.openestate.io.is24_csv.types.EnergieausweisTyp;
import org.openestate.io.is24_csv.types.Heizungsart;
import org.openestate.io.is24_csv.types.Immobilienart;
import org.openestate.io.is24_csv.types.ObjektkategorieGewerbeSonstiges;
import org.openestate.io.is24_csv.types.Objektzustand;
import org.openestate.io.is24_csv.types.VermarktungsartGewerbe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Record from the IS24-CSV format for further commercial objects.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
@SuppressWarnings("SpellCheckingInspection")
public class GewerbeSonstiges extends Is24CsvRecord {
    private final static Logger LOGGER = LoggerFactory.getLogger(GewerbeSonstiges.class);

    /**
     * Vermarktungsart, Text 1
     */
    protected final static int FIELD_VERMARKTUNGSART = 60;

    /**
     * Objektkategorie 2, Zahl 3
     */
    protected final static int FIELD_OBJEKTKATEGORIE = 61;

    /**
     * Hauptfläche, Zahl 10,2
     */
    protected final static int FIELD_GEWERBEFLAECHE = 62;

    /**
     * Nebenfläche, Zahl 10,2
     */
    protected final static int FIELD_NEBENFLAECHE = 63;

    /**
     * Gesamtfläche, Zahl 10,2
     */
    protected final static int FIELD_GESAMTFLAECHE = 64;

    /**
     * Fläche teilbar ab (in m²), Zahl 10,2
     */
    protected final static int FIELD_TEILBAR_AB = 65;

    /**
     * Anzahl Parkflächen, Zahl 5
     */
    protected final static int FIELD_ANZAHL_PARKFLAECHEN = 66;

    /**
     * Etage(n), Text 50
     */
    protected final static int FIELD_ETAGEN = 67;

    /**
     * Baujahr, Zahl 4
     */
    protected final static int FIELD_BAUJAHR = 68;

    /**
     * Objektzustand, Zahl 10
     */
    protected final static int FIELD_OBJEKTZUSTAND = 69;

    /**
     * Personenaufzug, Text 1
     */
    protected final static int FIELD_PERSONENAUFZUG = 70;

    /**
     * Fussweg zu öffentlichen Verkehrsmitteln (in Min.), Zahl 2
     */
    protected final static int FIELD_FUSSWEG_NAHVERKEHR = 71;

    /**
     * Fahrzeit zum nächsten Hauptbahnhof (in Min.), Zahl 2
     */
    protected final static int FIELD_FAHRTWEG_HAUPTBAHNHOF = 72;

    /**
     * Fahrzeit zum nächsten BAB (in Min.), Zahl 3
     */
    protected final static int FIELD_FAHRTWEG_AUTOBAHN = 73;

    /**
     * Fahrzeit zum nächsten Flughafen (in Min.), Zahl 3
     */
    protected final static int FIELD_FAHRTWEG_FLUGHAFEN = 74;

    /**
     * frei ab / verfügbar ab / Antrittstermin, Text 50
     */
    protected final static int FIELD_VERFUEGBAR_AB = 75;

    /**
     * Grundstücksfläche, Zahl 10,2
     */
    protected final static int FIELD_GRUNDSTUECKSFLAECHE = 76;

    /**
     * Bodenbelag, Zahl 2
     */
    protected final static int FIELD_BODENBELAG = 77;

    /**
     * Jahr letzte Modernisierung/ Sanierung, Zahl 4
     */
    protected final static int FIELD_SANIERUNGSJAHR = 80;

    /**
     * Qualität der Ausstattung, Zahl 1
     */
    protected final static int FIELD_AUSSTATTUNG = 81;

    /**
     * Befeuerungsart, Zahl 2 (Mehrfachauswahl möglich, wenn Eingaben durch Semikolon getrennt werden. Jeder mögliche Wert darf max. einmal erscheinen.)
     */
    protected final static int FIELD_BEFEUERUNG = 83;

    /**
     * Energieausweistyp, Zahl 1
     */
    protected final static int FIELD_ENERGIEAUSWEIS_TYP = 84;

    /**
     * Kennwert in kWh/(m²*a), Zahl 5,2
     */
    protected final static int FIELD_ENERGIEAUSWEIS_KENNWERT = 85;

    /**
     * Energieverbrauch für Warmwasser enthalten, Text 1 (Nur relevant falls Energieausweistyp=VERBRAUCH. In allen anderen Fällen darf das Feld nicht gesetzt sein.)
     */
    protected final static int FIELD_ENERGIEAUSWEIS_INKL_WARMWASSER = 86;

    /**
     * Heizungsart, Zahl 10
     */
    protected final static int FIELD_HEIZUNGSART = 87;

    /**
     * Denkmalschutzobjekt, Text 1
     */
    protected final static int FIELD_DENKMALSCHUTZ = 88;

    /**
     * Keller, Text 1
     */
    protected final static int FIELD_KELLER = 89;

    /**
     * Preis (Monatsmiete oder Kaufpreis), Zahl 15,2
     */
    protected final static int FIELD_PREIS = 90;

    /**
     * Nebenkosten, Zahl 15,2
     */
    protected final static int FIELD_NEBENKOSTEN = 91;

    /**
     * Preis pro Parkfläche, Zahl 15,2
     */
    protected final static int FIELD_PREIS_PRO_PARKFLAECHE = 92;

    /**
     * Kaution, Text 50
     */
    protected final static int FIELD_KAUTION = 93;

    public GewerbeSonstiges() {
        super();
        this.setImmobilienart(Immobilienart.GEWERBE_SONSTIGES);
    }

    @SuppressWarnings({"Duplicates", "unused"})
    public Integer getAnzahlParkflaechen() {
        try {
            return Is24CsvFormat.parseInteger(
                    this.get(FIELD_ANZAHL_PARKFLAECHEN));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'Anzahl Parkflaechen'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    public Ausstattung getAusstattung() {
        return Ausstattung.parse(
                this.get(FIELD_AUSSTATTUNG));
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

    public Befeuerungsart[] getBefeuerungsart() {
        return Befeuerungsart.parseMultiple(
                this.get(FIELD_BEFEUERUNG));
    }

    @SuppressWarnings("unused")
    public Bodenbelag getBodenbelag() {
        return Bodenbelag.parse(
                this.get(FIELD_BODENBELAG));
    }

    @SuppressWarnings("unused")
    public Boolean getDenkmalschutz() {
        return Is24CsvFormat.parseBoolean(
                this.get(FIELD_DENKMALSCHUTZ));
    }

    public Boolean getEnergieausweisInklWarmwasser() {
        return Is24CsvFormat.parseBoolean(
                this.get(FIELD_ENERGIEAUSWEIS_INKL_WARMWASSER));
    }

    @SuppressWarnings("Duplicates")
    public BigDecimal getEnergieausweisKennwert() {
        try {
            return Is24CsvFormat.parseDecimal(
                    this.get(FIELD_ENERGIEAUSWEIS_KENNWERT));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'Energieausweis-Kennwert'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    public EnergieausweisTyp getEnergieausweisTyp() {
        return EnergieausweisTyp.parse(
                this.get(FIELD_ENERGIEAUSWEIS_TYP));
    }

    @SuppressWarnings("unused")
    public String getEtagen() {
        return this.get(FIELD_ETAGEN);
    }

    @SuppressWarnings({"Duplicates", "unused"})
    public Integer getFahrtwegAutobahn() {
        try {
            return Is24CsvFormat.parseInteger(
                    this.get(FIELD_FAHRTWEG_AUTOBAHN));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'Fahrtweg zur Autobahn'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    @SuppressWarnings({"Duplicates", "unused"})
    public Integer getFahrtwegFlughafen() {
        try {
            return Is24CsvFormat.parseInteger(
                    this.get(FIELD_FAHRTWEG_FLUGHAFEN));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'Fahrtweg zum Flughafen'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    @SuppressWarnings({"Duplicates", "unused"})
    public Integer getFahrtwegHauptbahnhof() {
        try {
            return Is24CsvFormat.parseInteger(
                    this.get(FIELD_FAHRTWEG_HAUPTBAHNHOF));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'Fahrtweg zum Hauptbahnhof'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    @SuppressWarnings({"Duplicates", "unused"})
    public Integer getFusswegNahverkehr() {
        try {
            return Is24CsvFormat.parseInteger(
                    this.get(FIELD_FUSSWEG_NAHVERKEHR));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'Fussweg zum Nahverkehr'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    @SuppressWarnings({"Duplicates", "unused"})
    public BigDecimal getGesamtflaeche() {
        try {
            return Is24CsvFormat.parseDecimal(
                    this.get(FIELD_GESAMTFLAECHE));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'Gesamtflaeche'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    @SuppressWarnings({"Duplicates", "unused"})
    public BigDecimal getGewerbeflaeche() {
        try {
            return Is24CsvFormat.parseDecimal(
                    this.get(FIELD_GEWERBEFLAECHE));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'Gewerbeflaeche'!");
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

    public Heizungsart getHeizungsart() {
        return Heizungsart.parse(
                this.get(FIELD_HEIZUNGSART));
    }

    public String getKaution() {
        return this.get(FIELD_KAUTION);
    }

    public Boolean getKeller() {
        return Is24CsvFormat.parseBoolean(
                this.get(FIELD_KELLER));
    }

    @SuppressWarnings({"Duplicates", "unused"})
    public BigDecimal getNebenflaeche() {
        try {
            return Is24CsvFormat.parseDecimal(
                    this.get(FIELD_NEBENFLAECHE));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'Nebenflaeche'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    @SuppressWarnings("Duplicates")
    public BigDecimal getNebenkosten() {
        try {
            return Is24CsvFormat.parseDecimal(
                    this.get(FIELD_NEBENKOSTEN));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'Nebenkosten'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    public ObjektkategorieGewerbeSonstiges getObjektkategorie() {
        return ObjektkategorieGewerbeSonstiges.parse(
                this.get(FIELD_OBJEKTKATEGORIE));
    }

    public Objektzustand getObjektzustand() {
        return Objektzustand.parse(
                this.get(FIELD_OBJEKTZUSTAND));
    }

    @SuppressWarnings("unused")
    public Boolean getPersonenaufzug() {
        return Is24CsvFormat.parseBoolean(
                this.get(FIELD_PERSONENAUFZUG));
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

    @SuppressWarnings({"Duplicates", "unused"})
    public BigDecimal getPreisProParkflaeche() {
        try {
            return Is24CsvFormat.parseDecimal(
                    this.get(FIELD_PREIS_PRO_PARKFLAECHE));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'Preis pro Parkflaeche'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
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

    @SuppressWarnings({"Duplicates", "unused"})
    public BigDecimal getTeilbarAb() {
        try {
            return Is24CsvFormat.parseDecimal(
                    this.get(FIELD_TEILBAR_AB));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'teilbar ab'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    public String getVerfuegbarAb() {
        return this.get(FIELD_VERFUEGBAR_AB);
    }

    public VermarktungsartGewerbe getVermarktungsart() {
        return VermarktungsartGewerbe.parse(
                this.get(FIELD_VERMARKTUNGSART));
    }

    public static GewerbeSonstiges newRecord(CSVRecord record) {
        GewerbeSonstiges is24Record = new GewerbeSonstiges();
        is24Record.parse(record);
        return is24Record;
    }

    @Override
    protected Iterable<String> print() {
        this.setImmobilienart(Immobilienart.GEWERBE_SONSTIGES);
        return super.print();
    }

    @SuppressWarnings("unused")
    public void setAnzahlParkflaechen(Number value) {
        this.set(FIELD_ANZAHL_PARKFLAECHEN,
                Is24CsvFormat.printNumber(value, 5));
    }

    public void setAusstattung(Ausstattung value) {
        this.set(FIELD_AUSSTATTUNG,
                (value != null) ? value.print() : null);
    }

    public void setBaujahr(Number value) {
        this.set(FIELD_BAUJAHR,
                Is24CsvFormat.printNumber(value, 4));
    }

    public void setBefeuerungsart(Befeuerungsart value) {
        this.set(FIELD_BEFEUERUNG,
                (value != null) ? value.print() : null);
    }

    public void setBefeuerungsart(Iterable<Befeuerungsart> values) {
        this.set(FIELD_BEFEUERUNG,
                Befeuerungsart.printMultiple(values));
    }

    @SuppressWarnings("unused")
    public void setBodenbelag(Bodenbelag value) {
        this.set(FIELD_BODENBELAG,
                (value != null) ? value.print() : null);
    }

    @SuppressWarnings("unused")
    public void setDenkmalschutz(Boolean value) {
        this.set(FIELD_DENKMALSCHUTZ,
                Is24CsvFormat.printBoolean(value));
    }

    public void setEnergieausweisInklWarmwasser(Boolean value) {
        this.set(FIELD_ENERGIEAUSWEIS_INKL_WARMWASSER,
                Is24CsvFormat.printBoolean(value));
    }

    public void setEnergieausweisKennwert(Number value) {
        this.set(FIELD_ENERGIEAUSWEIS_KENNWERT,
                Is24CsvFormat.printNumber(value, 5, 2));
    }

    public void setEnergieausweisTyp(EnergieausweisTyp value) {
        this.set(FIELD_ENERGIEAUSWEIS_TYP,
                (value != null) ? value.print() : null);
    }

    public void setEtagen(String value) {
        this.set(FIELD_ETAGEN,
                Is24CsvFormat.printString(value, 50));
    }

    @SuppressWarnings("unused")
    public void setFahrtwegAutobahn(Number value) {
        this.set(FIELD_FAHRTWEG_AUTOBAHN,
                Is24CsvFormat.printNumber(value, 3));
    }

    @SuppressWarnings("unused")
    public void setFahrtwegFlughafen(Number value) {
        this.set(FIELD_FAHRTWEG_FLUGHAFEN,
                Is24CsvFormat.printNumber(value, 3));
    }

    @SuppressWarnings("unused")
    public void setFahrtwegHauptbahnhof(Number value) {
        this.set(FIELD_FAHRTWEG_HAUPTBAHNHOF,
                Is24CsvFormat.printNumber(value, 2));
    }

    @SuppressWarnings("unused")
    public void setFusswegNahverkehr(Number value) {
        this.set(FIELD_FUSSWEG_NAHVERKEHR,
                Is24CsvFormat.printNumber(value, 2));
    }

    @SuppressWarnings("unused")
    public void setGesamtflaeche(Number value) {
        this.set(FIELD_GESAMTFLAECHE,
                Is24CsvFormat.printNumber(value, 10, 2));
    }

    @SuppressWarnings("unused")
    public void setGewerbeflaeche(Number value) {
        this.set(FIELD_GEWERBEFLAECHE,
                Is24CsvFormat.printNumber(value, 10, 2));
    }

    public void setGrundstuecksflaeche(Number value) {
        this.set(FIELD_GRUNDSTUECKSFLAECHE,
                Is24CsvFormat.printNumber(value, 10, 2));
    }

    public void setHeizungsart(Heizungsart value) {
        this.set(FIELD_HEIZUNGSART,
                (value != null) ? value.print() : null);
    }

    public void setKaution(String value) {
        this.set(FIELD_KAUTION,
                Is24CsvFormat.printString(value, 50));
    }

    public void setKeller(Boolean value) {
        this.set(FIELD_KELLER,
                Is24CsvFormat.printBoolean(value));
    }

    @SuppressWarnings("unused")
    public void setNebenflaeche(Number value) {
        this.set(FIELD_NEBENFLAECHE,
                Is24CsvFormat.printNumber(value, 10, 2));
    }

    public void setNebenkosten(Number value) {
        this.set(FIELD_NEBENKOSTEN,
                Is24CsvFormat.printNumber(value, 15, 2));
    }

    public void setObjektkategorie(ObjektkategorieGewerbeSonstiges value) {
        this.set(FIELD_OBJEKTKATEGORIE,
                (value != null) ? value.print() : null);
    }

    public void setObjektzustand(Objektzustand value) {
        this.set(FIELD_OBJEKTZUSTAND,
                (value != null) ? value.print() : null);
    }

    @SuppressWarnings("unused")
    public void setPersonenaufzug(Boolean value) {
        this.set(FIELD_PERSONENAUFZUG,
                Is24CsvFormat.printBoolean(value));
    }

    public void setPreis(Number value) {
        this.set(FIELD_PREIS,
                Is24CsvFormat.printNumber(value, 15, 2));
    }

    @SuppressWarnings("unused")
    public void setPreisProParkflaeche(Number value) {
        this.set(FIELD_PREIS_PRO_PARKFLAECHE,
                Is24CsvFormat.printNumber(value, 15, 2));
    }

    public void setSanierungsjahr(Number value) {
        this.set(FIELD_SANIERUNGSJAHR,
                Is24CsvFormat.printNumber(value, 4));
    }

    @SuppressWarnings("unused")
    public void setTeilbarAb(Number value) {
        this.set(FIELD_TEILBAR_AB,
                Is24CsvFormat.printNumber(value, 10, 2));
    }

    public void setVerfuegbarAb(String value) {
        this.set(FIELD_VERFUEGBAR_AB,
                Is24CsvFormat.printString(value, 50));
    }

    public void setVermarktungsart(VermarktungsartGewerbe value) {
        this.set(FIELD_VERMARKTUNGSART,
                (value != null) ? value.print() : null);
    }
}