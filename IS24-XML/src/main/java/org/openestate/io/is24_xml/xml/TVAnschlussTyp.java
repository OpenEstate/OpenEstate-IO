
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TVAnschlussTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TVAnschlussTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="keineAngabe"/>
 *     &lt;enumeration value="Kabel"/>
 *     &lt;enumeration value="Satellit"/>
 *     &lt;enumeration value="KabelUndSatellit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TVAnschlussTyp")
@XmlEnum
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
