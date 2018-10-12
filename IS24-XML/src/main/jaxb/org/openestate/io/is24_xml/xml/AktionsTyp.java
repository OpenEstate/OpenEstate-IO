
package org.openestate.io.is24_xml.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AktionsTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AktionsTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="importieren"/&gt;
 *     &lt;enumeration value="aktualisieren"/&gt;
 *     &lt;enumeration value="loeschen"/&gt;
 *     &lt;enumeration value="ignorieren"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AktionsTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
public enum AktionsTyp {

    @XmlEnumValue("importieren")
    IMPORTIEREN("importieren"),
    @XmlEnumValue("aktualisieren")
    AKTUALISIEREN("aktualisieren"),
    @XmlEnumValue("loeschen")
    LOESCHEN("loeschen"),
    @XmlEnumValue("ignorieren")
    IGNORIEREN("ignorieren");
    private final String value;

    AktionsTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AktionsTyp fromValue(String v) {
        for (AktionsTyp c: AktionsTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
