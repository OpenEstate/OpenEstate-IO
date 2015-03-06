
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LageartTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LageartTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="keineAngabe"/>
 *     &lt;enumeration value="ALage"/>
 *     &lt;enumeration value="BLage"/>
 *     &lt;enumeration value="Einkaufszentrum"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LageartTyp")
@XmlEnum
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
