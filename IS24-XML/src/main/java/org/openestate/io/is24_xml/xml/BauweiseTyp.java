
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BauweiseTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BauweiseTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Massiv"/>
 *     &lt;enumeration value="Fertigteil"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BauweiseTyp")
@XmlEnum
public enum BauweiseTyp {

    @XmlEnumValue("Massiv")
    MASSIV("Massiv"),
    @XmlEnumValue("Fertigteil")
    FERTIGTEIL("Fertigteil");
    private final String value;

    BauweiseTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BauweiseTyp fromValue(String v) {
        for (BauweiseTyp c: BauweiseTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
