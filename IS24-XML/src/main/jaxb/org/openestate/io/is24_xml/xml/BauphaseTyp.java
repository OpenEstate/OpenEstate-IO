
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BauphaseTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BauphaseTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="keineAngabe"/&gt;
 *     &lt;enumeration value="HausInPlanung"/&gt;
 *     &lt;enumeration value="HausImBau"/&gt;
 *     &lt;enumeration value="HausFertigGestellt"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BauphaseTyp")
@XmlEnum
public enum BauphaseTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("HausInPlanung")
    HAUS_IN_PLANUNG("HausInPlanung"),
    @XmlEnumValue("HausImBau")
    HAUS_IM_BAU("HausImBau"),
    @XmlEnumValue("HausFertigGestellt")
    HAUS_FERTIG_GESTELLT("HausFertigGestellt");
    private final String value;

    BauphaseTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BauphaseTyp fromValue(String v) {
        for (BauphaseTyp c: BauphaseTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
