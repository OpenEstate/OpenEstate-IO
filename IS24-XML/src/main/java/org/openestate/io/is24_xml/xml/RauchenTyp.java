
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RauchenTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RauchenTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="keineAngabe"/&gt;
 *     &lt;enumeration value="erlaubt"/&gt;
 *     &lt;enumeration value="unerwuenscht"/&gt;
 *     &lt;enumeration value="nurImEigenenZimmer"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RauchenTyp")
@XmlEnum
public enum RauchenTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("erlaubt")
    ERLAUBT("erlaubt"),
    @XmlEnumValue("unerwuenscht")
    UNERWUENSCHT("unerwuenscht"),
    @XmlEnumValue("nurImEigenenZimmer")
    NUR_IM_EIGENEN_ZIMMER("nurImEigenenZimmer");
    private final String value;

    RauchenTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RauchenTyp fromValue(String v) {
        for (RauchenTyp c: RauchenTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
