
package org.openestate.io.is24_xml.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WazZeiteinheitenTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WazZeiteinheitenTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Tag"/&gt;
 *     &lt;enumeration value="Woche"/&gt;
 *     &lt;enumeration value="Monat"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WazZeiteinheitenTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
public enum WazZeiteinheitenTyp {

    @XmlEnumValue("Tag")
    TAG("Tag"),
    @XmlEnumValue("Woche")
    WOCHE("Woche"),
    @XmlEnumValue("Monat")
    MONAT("Monat");
    private final String value;

    WazZeiteinheitenTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WazZeiteinheitenTyp fromValue(String v) {
        for (WazZeiteinheitenTyp c: WazZeiteinheitenTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
