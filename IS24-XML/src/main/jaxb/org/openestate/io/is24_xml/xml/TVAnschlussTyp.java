
package org.openestate.io.is24_xml.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TVAnschlussTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TVAnschlussTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="keineAngabe"/&gt;
 *     &lt;enumeration value="Kabel"/&gt;
 *     &lt;enumeration value="Satellit"/&gt;
 *     &lt;enumeration value="KabelUndSatellit"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TVAnschlussTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
public enum TVAnschlussTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("Kabel")
    KABEL("Kabel"),
    @XmlEnumValue("Satellit")
    SATELLIT("Satellit"),
    @XmlEnumValue("KabelUndSatellit")
    KABEL_UND_SATELLIT("KabelUndSatellit");
    private final String value;

    TVAnschlussTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TVAnschlussTyp fromValue(String v) {
        for (TVAnschlussTyp c: TVAnschlussTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
