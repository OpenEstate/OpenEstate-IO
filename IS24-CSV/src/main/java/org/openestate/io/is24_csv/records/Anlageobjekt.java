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
import org.openestate.io.is24_csv.types.EnergieausweisTyp;
import org.openestate.io.is24_csv.types.Heizungsart;
import org.openestate.io.is24_csv.types.Immobilienart;
import org.openestate.io.is24_csv.types.ObjektkategorieAnlageobjekt;
import org.openestate.io.is24_csv.types.Objektzustand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Record from the IS24-CSV format for investment objects.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
@SuppressWarnings({"WeakerAccess", "unused", "SpellCheckingInspection"})
public class Anlageobjekt extends Is24CsvRecord {
    private final static Logger LOGGER = LoggerFactory.getLogger(Anlageobjekt.class);

    /**
     * Objektkategorie 2, Zahl 3
     */
    protected final static int FIELD_OBJEKTKATEGORIE = 60;

    /**
     * Gesamtfläche (Hauptfläche inkl. Nebenfläche), Zahl 10,2
     */
    protected final static int FIELD_GESAMTFLAECHE = 61;

    /**
     * Vermietbare Fläche, Zahl 10,2
     */
    protected final static int FIELD_VERMIETBARE_FLAECHE = 62;

    /**
     * Wohnflächen, Zahl 10,2
     */
    protected final static int FIELD_WOHNFLAECHE = 63;

    /**
     * Gewerbeflächen, Zahl 10,2
     */
    protected final static int FIELD_GEWERBEFLAECHE = 64;

    /**
     * Grundstücksfläche, Zahl 10,2
     */
    protected final static int FIELD_GRUNDSTUECKSFLAECHE = 65;

    /**
     * Sonstige Flächen, Zahl 10,2
     */
    protected final static int FIELD_SONSTIGE_FLAECHE = 66;

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
     * X-fache (KP/Miete p.a.), Zahl 3,1
     */
    protected final static int FIELD_X_FACHE = 71;

    /**
     * Mieteinnahmen p.a. (IST) Zahl, 15,2
     */
    protected final static int FIELD_MIETEINNAHMEN_IST = 72;

    /**
     * Mieteinnahmen p.a. (SOLL) Zahl, 15,2
     */
    protected final static int FIELD_MIETEINNAHMEN_SOLL = 73;

    /**
     * Anzahl Parkflächen, Zahl 5
     */
    protected final static int FIELD_ANZAHL_PARKFLAECHEN = 74;

    /**
     * Fussweg zu öffentlichen Verkehrsmitteln (in Min.), Zahl 2
     */
    protected final static int FIELD_FUSSWEG_NAHVERKEHR = 75;

    /**
     * Fahrzeit zum nächsten Hauptbahnhof (in Min.), Zahl 2
     */
    protected final static int FIELD_FAHRTWEG_HAUPTBAHNHOF = 76;

    /**
     * Fahrzeit zum nächsten BAB (in Min.), Zahl 3
     */
    protected final static int FIELD_FAHRTWEG_AUTOBAHN = 77;

    /**
     * Fahrzeit zum nächsten Flughafen (in Min.), Zahl 3
     */
    protected final static int FIELD_FAHRTWEG_FLUGHAFEN = 78;

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
     * Preis (Kaufpreis), Zahl 15,2
     */
    protected final static int FIELD_KAUFPREIS = 90;

    /**
     * Kaufpreis pro m², Zahl 15,2
     */
    protected final static int FIELD_KAUFPREIS_PRO_QM = 91;

    /**
     * Betriebskosten umgelegt, Zahl 15,2
     */
    protected final static int FIELD_BETRIEBSKOSTEN_UMGELEGT = 92;

    /**
     * Nicht umgelegte Kosten, Zahl 15,2
     */
    protected final static int FIELD_NICHT_UMGELEGTE_KOSTEN = 93;

    /**
     * Preis pro Parkfläche, Zahl 15,2
     */
    protected final static int FIELD_PREIS_PRO_PARKFLAECHE = 94;


    public Anlageobjekt() {
        super();
        this.setImmobilienart(Immobilienart.ANLAGE);
    }

    @SuppressWarnings("Duplicates")
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

    public BigDecimal getBetriebskostenUmgelegt() {
        try {
            return Is24CsvFormat.parseDecimal(
                    this.get(FIELD_BETRIEBSKOSTEN_UMGELEGT));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'Betriebskosten umgelegt'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

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

    public String getEtagen() {
        return this.get(FIELD_ETAGEN);
    }

    @SuppressWarnings("Duplicates")
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

    @SuppressWarnings("Duplicates")
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

    @SuppressWarnings("Duplicates")
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

    @SuppressWarnings("Duplicates")
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

    @SuppressWarnings("Duplicates")
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

    @SuppressWarnings("Duplicates")
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

    @SuppressWarnings("Duplicates")
    public BigDecimal getKaufpreis() {
        try {
            return Is24CsvFormat.parseDecimal(
                    this.get(FIELD_KAUFPREIS));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'Kaufpreis'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    public BigDecimal getKaufpreisProQm() {
        try {
            return Is24CsvFormat.parseDecimal(
                    this.get(FIELD_KAUFPREIS_PRO_QM));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'Kaufpreis pro qm'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    public BigDecimal getMieteinnahmenIst() {
        try {
            return Is24CsvFormat.parseDecimal(
                    this.get(FIELD_MIETEINNAHMEN_IST));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'IST-Mieteinnahmen'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    public BigDecimal getMieteinnahmenSoll() {
        try {
            return Is24CsvFormat.parseDecimal(
                    this.get(FIELD_MIETEINNAHMEN_SOLL));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'SOLL-Mieteinnahmen'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    public BigDecimal getNichtUmgelegteKosten() {
        try {
            return Is24CsvFormat.parseDecimal(
                    this.get(FIELD_NICHT_UMGELEGTE_KOSTEN));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'nicht umgelegte eKosten'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    public ObjektkategorieAnlageobjekt getObjektkategorie() {
        return ObjektkategorieAnlageobjekt.parse(
                this.get(FIELD_OBJEKTKATEGORIE));
    }

    public Objektzustand getObjektzustand() {
        return Objektzustand.parse(
                this.get(FIELD_OBJEKTZUSTAND));
    }

    public Boolean getPersonenaufzug() {
        return Is24CsvFormat.parseBoolean(
                this.get(FIELD_PERSONENAUFZUG));
    }

    @SuppressWarnings("Duplicates")
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

    public BigDecimal getSonstigeFlaeche() {
        try {
            return Is24CsvFormat.parseDecimal(
                    this.get(FIELD_SONSTIGE_FLAECHE));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'sonstige Flaeche'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    public BigDecimal getVermietbareFlaeche() {
        try {
            return Is24CsvFormat.parseDecimal(
                    this.get(FIELD_VERMIETBARE_FLAECHE));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'vermietbare Flaeche'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    @SuppressWarnings("Duplicates")
    public BigDecimal getWohnflaeche() {
        try {
            return Is24CsvFormat.parseDecimal(
                    this.get(FIELD_WOHNFLAECHE));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'Wohnflaeche'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    public BigDecimal getXFache() {
        try {
            return Is24CsvFormat.parseDecimal(
                    this.get(FIELD_X_FACHE));
        } catch (NumberFormatException ex) {
            LOGGER.warn("Can't read 'X-fache'!");
            LOGGER.warn("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    public static Anlageobjekt newRecord(CSVRecord record) {
        Anlageobjekt is24Record = new Anlageobjekt();
        is24Record.parse(record);
        return is24Record;
    }

    @Override
    protected Iterable<String> print() {
        this.setImmobilienart(Immobilienart.ANLAGE);
        return super.print();
    }

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

    public void setBetriebskostenUmgelegt(Number value) {
        this.set(FIELD_BETRIEBSKOSTEN_UMGELEGT,
                Is24CsvFormat.printNumber(value, 15, 2));
    }

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

    public void setFahrtwegAutobahn(Number value) {
        this.set(FIELD_FAHRTWEG_AUTOBAHN,
                Is24CsvFormat.printNumber(value, 3));
    }

    public void setFahrtwegFlughafen(Number value) {
        this.set(FIELD_FAHRTWEG_FLUGHAFEN,
                Is24CsvFormat.printNumber(value, 3));
    }

    public void setFahrtwegHauptbahnhof(Number value) {
        this.set(FIELD_FAHRTWEG_HAUPTBAHNHOF,
                Is24CsvFormat.printNumber(value, 2));
    }

    public void setFusswegNahverkehr(Number value) {
        this.set(FIELD_FUSSWEG_NAHVERKEHR,
                Is24CsvFormat.printNumber(value, 2));
    }

    public void setGesamtflaeche(Number value) {
        this.set(FIELD_GESAMTFLAECHE,
                Is24CsvFormat.printNumber(value, 10, 2));
    }

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

    public void setKaufpreis(Number value) {
        this.set(FIELD_KAUFPREIS,
                Is24CsvFormat.printNumber(value, 15, 2));
    }

    public void setKaufpreisProQm(Number value) {
        this.set(FIELD_KAUFPREIS_PRO_QM,
                Is24CsvFormat.printNumber(value, 15, 2));
    }

    public void setMieteinnahmenIst(Number value) {
        this.set(FIELD_MIETEINNAHMEN_IST,
                Is24CsvFormat.printNumber(value, 15, 2));
    }

    public void setMieteinnahmenSoll(Number value) {
        this.set(FIELD_MIETEINNAHMEN_SOLL,
                Is24CsvFormat.printNumber(value, 15, 2));
    }

    public void setNichtUmgelegteKosten(Number value) {
        this.set(FIELD_NICHT_UMGELEGTE_KOSTEN,
                Is24CsvFormat.printNumber(value, 15, 2));
    }

    public void setObjektkategorie(ObjektkategorieAnlageobjekt value) {
        this.set(FIELD_OBJEKTKATEGORIE,
                (value != null) ? value.print() : null);
    }

    public void setObjektzustand(Objektzustand value) {
        this.set(FIELD_OBJEKTZUSTAND,
                (value != null) ? value.print() : null);
    }

    public void setPersonenaufzug(Boolean value) {
        this.set(FIELD_PERSONENAUFZUG,
                Is24CsvFormat.printBoolean(value));
    }

    public void setPreisProParkflaeche(Number value) {
        this.set(FIELD_PREIS_PRO_PARKFLAECHE,
                Is24CsvFormat.printNumber(value, 15, 2));
    }

    public void setSanierungsjahr(Number value) {
        this.set(FIELD_SANIERUNGSJAHR,
                Is24CsvFormat.printNumber(value, 4));
    }

    public void setSonstigeFlaeche(Number value) {
        this.set(FIELD_SONSTIGE_FLAECHE,
                Is24CsvFormat.printNumber(value, 10, 2));
    }

    public void setVermietbareFlaeche(Number value) {
        this.set(FIELD_VERMIETBARE_FLAECHE,
                Is24CsvFormat.printNumber(value, 10, 2));
    }

    public void setWohnflaeche(Number value) {
        this.set(FIELD_WOHNFLAECHE,
                Is24CsvFormat.printNumber(value, 10, 2));
    }

    public void setXFache(Number value) {
        this.set(FIELD_X_FACHE,
                Is24CsvFormat.printNumber(value, 3, 1));
    }
}