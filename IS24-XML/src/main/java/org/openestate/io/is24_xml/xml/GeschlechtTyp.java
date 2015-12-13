
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeschlechtTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeschlechtTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="nurMaenner"/&gt;
 *     &lt;enumeration value="nurFrauen"/&gt;
 *     &lt;enumeration value="keineEinschraenkung"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GeschlechtTyp")
@XmlEnum
public enum GeschlechtTyp {

    @XmlEnumValue("nurMaenner")
    NUR_MAENNER("nurMaenner"),
    @XmlEnumValue("nurFrauen")
    NUR_FRAUEN("nurFrauen"),
    @XmlEnumValue("keineEinschraenkung")
    KEINE_EINSCHRAENKUNG("keineEinschraenkung");
    private final String value;

    GeschlechtTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeschlechtTyp fromValue(String v) {
        for (GeschlechtTyp c: GeschlechtTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
