
package org.openestate.io.is24_xml.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AusstattungsqualitaetsTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AusstattungsqualitaetsTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="KeineAngabe"/&gt;
 *     &lt;enumeration value="Luxus"/&gt;
 *     &lt;enumeration value="Gehoben"/&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="Einfach"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AusstattungsqualitaetsTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
public enum AusstattungsqualitaetsTyp {

    @XmlEnumValue("KeineAngabe")
    KEINE_ANGABE("KeineAngabe"),
    @XmlEnumValue("Luxus")
    LUXUS("Luxus"),
    @XmlEnumValue("Gehoben")
    GEHOBEN("Gehoben"),
    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Einfach")
    EINFACH("Einfach");
    private final String value;

    AusstattungsqualitaetsTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AusstattungsqualitaetsTyp fromValue(String v) {
        for (AusstattungsqualitaetsTyp c: AusstattungsqualitaetsTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
