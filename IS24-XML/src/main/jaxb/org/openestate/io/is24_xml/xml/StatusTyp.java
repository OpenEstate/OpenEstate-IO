
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="aktiv"/&gt;
 *     &lt;enumeration value="inaktiv"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StatusTyp")
@XmlEnum
public enum StatusTyp {

    @XmlEnumValue("aktiv")
    AKTIV("aktiv"),
    @XmlEnumValue("inaktiv")
    INAKTIV("inaktiv");
    private final String value;

    StatusTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusTyp fromValue(String v) {
        for (StatusTyp c: StatusTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
