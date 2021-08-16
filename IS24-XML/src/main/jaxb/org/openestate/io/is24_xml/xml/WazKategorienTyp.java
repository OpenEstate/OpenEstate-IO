
package org.openestate.io.is24_xml.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WazKategorienTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WazKategorienTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Zimmer"/&gt;
 *     &lt;enumeration value="Appartment"/&gt;
 *     &lt;enumeration value="Wohnung"/&gt;
 *     &lt;enumeration value="Haus"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WazKategorienTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
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
