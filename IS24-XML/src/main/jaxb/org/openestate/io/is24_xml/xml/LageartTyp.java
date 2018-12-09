
package org.openestate.io.is24_xml.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LageartTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LageartTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="keineAngabe"/&gt;
 *     &lt;enumeration value="ALage"/&gt;
 *     &lt;enumeration value="BLage"/&gt;
 *     &lt;enumeration value="Einkaufszentrum"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LageartTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
public enum LageartTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("ALage")
    A_LAGE("ALage"),
    @XmlEnumValue("BLage")
    B_LAGE("BLage"),
    @XmlEnumValue("Einkaufszentrum")
    EINKAUFSZENTRUM("Einkaufszentrum");
    private final String value;

    LageartTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LageartTyp fromValue(String v) {
        for (LageartTyp c: LageartTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
