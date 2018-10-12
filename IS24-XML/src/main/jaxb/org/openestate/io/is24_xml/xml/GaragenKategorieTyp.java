
package org.openestate.io.is24_xml.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GaragenKategorieTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GaragenKategorieTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="keineAngabe"/&gt;
 *     &lt;enumeration value="Garage"/&gt;
 *     &lt;enumeration value="Tiefgarage"/&gt;
 *     &lt;enumeration value="Parkhaus"/&gt;
 *     &lt;enumeration value="Carport"/&gt;
 *     &lt;enumeration value="Aussenstellplatz"/&gt;
 *     &lt;enumeration value="Duplex"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GaragenKategorieTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
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
