
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
 * &lt;simpleType name="AnlageobjekteKategorieTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Einfamilienhaus"/>
 *     &lt;enumeration value="Mehrfamilienhaus"/>
 *     &lt;enumeration value="Eigentumswohnung"/>
 *     &lt;enumeration value="Einkaufszentrum"/>
 *     &lt;enumeration value="Gaststaette"/>
 *     &lt;enumeration value="Hotel"/>
 *     &lt;enumeration value="Freizeitanlage"/>
 *     &lt;enumeration value="Gewerbeeinheit"/>
 *     &lt;enumeration value="Buerogebaeude"/>
 *     &lt;enumeration value="Geschaeftshaus"/>
 *     &lt;enumeration value="Gewerbeanwesen"/>
 *     &lt;enumeration value="HalleLager"/>
 *     &lt;enumeration value="Industrieanwesen"/>
 *     &lt;enumeration value="LadenVerkaufsflaeche"/>
 *     &lt;enumeration value="Servicecenter"/>
 *     &lt;enumeration value="Sonstige"/>
 *     &lt;enumeration value="Supermarkt"/>
 *     &lt;enumeration value="WohnGeschaeftshaus"/>
 *     &lt;enumeration value="Wohnanlage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
