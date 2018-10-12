
package org.openestate.io.is24_xml.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrundstueckKategorienTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GrundstueckKategorienTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="keineAngabe"/&gt;
 *     &lt;enumeration value="Wohnen"/&gt;
 *     &lt;enumeration value="Gewerbe"/&gt;
 *     &lt;enumeration value="LandForstwirtschaft"/&gt;
 *     &lt;enumeration value="Freizeit"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GrundstueckKategorienTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
public enum GrundstueckKategorienTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("Wohnen")
    WOHNEN("Wohnen"),
    @XmlEnumValue("Gewerbe")
    GEWERBE("Gewerbe"),
    @XmlEnumValue("LandForstwirtschaft")
    LAND_FORSTWIRTSCHAFT("LandForstwirtschaft"),
    @XmlEnumValue("Freizeit")
    FREIZEIT("Freizeit");
    private final String value;

    GrundstueckKategorienTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GrundstueckKategorienTyp fromValue(String v) {
        for (GrundstueckKategorienTyp c: GrundstueckKategorienTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
