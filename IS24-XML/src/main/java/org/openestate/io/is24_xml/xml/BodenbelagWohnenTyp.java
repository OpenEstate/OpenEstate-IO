
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BodenbelagWohnenTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BodenbelagWohnenTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="keineAngabe"/>
 *     &lt;enumeration value="Fliesen"/>
 *     &lt;enumeration value="Dielen"/>
 *     &lt;enumeration value="Laminat"/>
 *     &lt;enumeration value="Parkett"/>
 *     &lt;enumeration value="PVC"/>
 *     &lt;enumeration value="Teppichboden"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BodenbelagWohnenTyp")
@XmlEnum
public enum BodenbelagWohnenTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("Fliesen")
    FLIESEN("Fliesen"),
    @XmlEnumValue("Dielen")
    DIELEN("Dielen"),
    @XmlEnumValue("Laminat")
    LAMINAT("Laminat"),
    @XmlEnumValue("Parkett")
    PARKETT("Parkett"),
    PVC("PVC"),
    @XmlEnumValue("Teppichboden")
    TEPPICHBODEN("Teppichboden");
    private final String value;

    BodenbelagWohnenTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BodenbelagWohnenTyp fromValue(String v) {
        for (BodenbelagWohnenTyp c: BodenbelagWohnenTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
