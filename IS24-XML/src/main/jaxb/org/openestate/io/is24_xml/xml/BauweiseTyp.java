
package org.openestate.io.is24_xml.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BauweiseTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BauweiseTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Massiv"/&gt;
 *     &lt;enumeration value="Fertigteil"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BauweiseTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
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
