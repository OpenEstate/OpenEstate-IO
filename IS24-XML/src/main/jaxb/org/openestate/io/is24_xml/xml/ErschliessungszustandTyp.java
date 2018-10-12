
package org.openestate.io.is24_xml.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErschliessungszustandTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ErschliessungszustandTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Erschlossen"/&gt;
 *     &lt;enumeration value="Teilerschlossen"/&gt;
 *     &lt;enumeration value="Unerschlossen"/&gt;
 *     &lt;enumeration value="Unbekannt"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ErschliessungszustandTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
public enum ErschliessungszustandTyp {

    @XmlEnumValue("Erschlossen")
    ERSCHLOSSEN("Erschlossen"),
    @XmlEnumValue("Teilerschlossen")
    TEILERSCHLOSSEN("Teilerschlossen"),
    @XmlEnumValue("Unerschlossen")
    UNERSCHLOSSEN("Unerschlossen"),
    @XmlEnumValue("Unbekannt")
    UNBEKANNT("Unbekannt");
    private final String value;

    ErschliessungszustandTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErschliessungszustandTyp fromValue(String v) {
        for (ErschliessungszustandTyp c: ErschliessungszustandTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
