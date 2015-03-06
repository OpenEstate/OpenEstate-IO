
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GaragenKategorieTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GaragenKategorieTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="keineAngabe"/>
 *     &lt;enumeration value="Garage"/>
 *     &lt;enumeration value="Tiefgarage"/>
 *     &lt;enumeration value="Parkhaus"/>
 *     &lt;enumeration value="Carport"/>
 *     &lt;enumeration value="Aussenstellplatz"/>
 *     &lt;enumeration value="Duplex"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GaragenKategorieTyp")
@XmlEnum
public enum GaragenKategorieTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("Garage")
    GARAGE("Garage"),
    @XmlEnumValue("Tiefgarage")
    TIEFGARAGE("Tiefgarage"),
    @XmlEnumValue("Parkhaus")
    PARKHAUS("Parkhaus"),
    @XmlEnumValue("Carport")
    CARPORT("Carport"),
    @XmlEnumValue("Aussenstellplatz")
    AUSSENSTELLPLATZ("Aussenstellplatz"),
    @XmlEnumValue("Duplex")
    DUPLEX("Duplex");
    private final String value;

    GaragenKategorieTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GaragenKategorieTyp fromValue(String v) {
        for (GaragenKategorieTyp c: GaragenKategorieTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
