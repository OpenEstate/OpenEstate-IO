
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnlageobjekteKategorieTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AnlageobjekteKategorieTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Einfamilienhaus"/&gt;
 *     &lt;enumeration value="Mehrfamilienhaus"/&gt;
 *     &lt;enumeration value="Eigentumswohnung"/&gt;
 *     &lt;enumeration value="Einkaufszentrum"/&gt;
 *     &lt;enumeration value="Gaststaette"/&gt;
 *     &lt;enumeration value="Hotel"/&gt;
 *     &lt;enumeration value="Freizeitanlage"/&gt;
 *     &lt;enumeration value="Gewerbeeinheit"/&gt;
 *     &lt;enumeration value="Buerogebaeude"/&gt;
 *     &lt;enumeration value="Geschaeftshaus"/&gt;
 *     &lt;enumeration value="Gewerbeanwesen"/&gt;
 *     &lt;enumeration value="HalleLager"/&gt;
 *     &lt;enumeration value="Industrieanwesen"/&gt;
 *     &lt;enumeration value="LadenVerkaufsflaeche"/&gt;
 *     &lt;enumeration value="Servicecenter"/&gt;
 *     &lt;enumeration value="Sonstige"/&gt;
 *     &lt;enumeration value="Supermarkt"/&gt;
 *     &lt;enumeration value="WohnGeschaeftshaus"/&gt;
 *     &lt;enumeration value="Wohnanlage"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AnlageobjekteKategorieTyp")
@XmlEnum
public enum AnlageobjekteKategorieTyp {

    @XmlEnumValue("Einfamilienhaus")
    EINFAMILIENHAUS("Einfamilienhaus"),
    @XmlEnumValue("Mehrfamilienhaus")
    MEHRFAMILIENHAUS("Mehrfamilienhaus"),
    @XmlEnumValue("Eigentumswohnung")
    EIGENTUMSWOHNUNG("Eigentumswohnung"),
    @XmlEnumValue("Einkaufszentrum")
    EINKAUFSZENTRUM("Einkaufszentrum"),
    @XmlEnumValue("Gaststaette")
    GASTSTAETTE("Gaststaette"),
    @XmlEnumValue("Hotel")
    HOTEL("Hotel"),
    @XmlEnumValue("Freizeitanlage")
    FREIZEITANLAGE("Freizeitanlage"),
    @XmlEnumValue("Gewerbeeinheit")
    GEWERBEEINHEIT("Gewerbeeinheit"),
    @XmlEnumValue("Buerogebaeude")
    BUEROGEBAEUDE("Buerogebaeude"),
    @XmlEnumValue("Geschaeftshaus")
    GESCHAEFTSHAUS("Geschaeftshaus"),
    @XmlEnumValue("Gewerbeanwesen")
    GEWERBEANWESEN("Gewerbeanwesen"),
    @XmlEnumValue("HalleLager")
    HALLE_LAGER("HalleLager"),
    @XmlEnumValue("Industrieanwesen")
    INDUSTRIEANWESEN("Industrieanwesen"),
    @XmlEnumValue("LadenVerkaufsflaeche")
    LADEN_VERKAUFSFLAECHE("LadenVerkaufsflaeche"),
    @XmlEnumValue("Servicecenter")
    SERVICECENTER("Servicecenter"),
    @XmlEnumValue("Sonstige")
    SONSTIGE("Sonstige"),
    @XmlEnumValue("Supermarkt")
    SUPERMARKT("Supermarkt"),
    @XmlEnumValue("WohnGeschaeftshaus")
    WOHN_GESCHAEFTSHAUS("WohnGeschaeftshaus"),
    @XmlEnumValue("Wohnanlage")
    WOHNANLAGE("Wohnanlage");
    private final String value;

    AnlageobjekteKategorieTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AnlageobjekteKategorieTyp fromValue(String v) {
        for (AnlageobjekteKategorieTyp c: AnlageobjekteKategorieTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
