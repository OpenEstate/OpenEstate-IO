
package org.openestate.io.is24_xml.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BodenbelagWohnenTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BodenbelagWohnenTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="keineAngabe"/&gt;
 *     &lt;enumeration value="Fliesen"/&gt;
 *     &lt;enumeration value="Dielen"/&gt;
 *     &lt;enumeration value="Laminat"/&gt;
 *     &lt;enumeration value="Parkett"/&gt;
 *     &lt;enumeration value="PVC"/&gt;
 *     &lt;enumeration value="Teppichboden"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BodenbelagWohnenTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
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
