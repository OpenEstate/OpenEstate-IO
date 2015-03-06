
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WazKategorienTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WazKategorienTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Zimmer"/>
 *     &lt;enumeration value="Appartment"/>
 *     &lt;enumeration value="Wohnung"/>
 *     &lt;enumeration value="Haus"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WazKategorienTyp")
@XmlEnum
public enum WazKategorienTyp {

    @XmlEnumValue("Zimmer")
    ZIMMER("Zimmer"),
    @XmlEnumValue("Appartment")
    APPARTMENT("Appartment"),
    @XmlEnumValue("Wohnung")
    WOHNUNG("Wohnung"),
    @XmlEnumValue("Haus")
    HAUS("Haus");
    private final String value;

    WazKategorienTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WazKategorienTyp fromValue(String v) {
        for (WazKategorienTyp c: WazKategorienTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
