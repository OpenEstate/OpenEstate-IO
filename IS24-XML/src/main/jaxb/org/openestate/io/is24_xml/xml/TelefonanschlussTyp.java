
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelefonanschlussTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TelefonanschlussTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="keineAngabe"/&gt;
 *     &lt;enumeration value="analog"/&gt;
 *     &lt;enumeration value="ISDN"/&gt;
 *     &lt;enumeration value="nichtVorhanden"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TelefonanschlussTyp")
@XmlEnum
public enum TelefonanschlussTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("analog")
    ANALOG("analog"),
    ISDN("ISDN"),
    @XmlEnumValue("nichtVorhanden")
    NICHT_VORHANDEN("nichtVorhanden");
    private final String value;

    TelefonanschlussTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TelefonanschlussTyp fromValue(String v) {
        for (TelefonanschlussTyp c: TelefonanschlussTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
