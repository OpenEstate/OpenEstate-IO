
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MieteEinheitTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MieteEinheitTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Monat"/>
 *     &lt;enumeration value="Quadratmeter"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MieteEinheitTyp")
@XmlEnum
public enum MieteEinheitTyp {

    @XmlEnumValue("Monat")
    MONAT("Monat"),
    @XmlEnumValue("Quadratmeter")
    QUADRATMETER("Quadratmeter");
    private final String value;

    MieteEinheitTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MieteEinheitTyp fromValue(String v) {
        for (MieteEinheitTyp c: MieteEinheitTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
