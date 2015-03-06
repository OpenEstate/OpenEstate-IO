
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkplatzsituationTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParkplatzsituationTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="keineAngabe"/>
 *     &lt;enumeration value="guteParkmoeglichkeit"/>
 *     &lt;enumeration value="schlechteParkmoeglichkeit"/>
 *     &lt;enumeration value="Bewohnerparken"/>
 *     &lt;enumeration value="eigenerStellplatzGarage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParkplatzsituationTyp")
@XmlEnum
public enum ParkplatzsituationTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("guteParkmoeglichkeit")
    GUTE_PARKMOEGLICHKEIT("guteParkmoeglichkeit"),
    @XmlEnumValue("schlechteParkmoeglichkeit")
    SCHLECHTE_PARKMOEGLICHKEIT("schlechteParkmoeglichkeit"),
    @XmlEnumValue("Bewohnerparken")
    BEWOHNERPARKEN("Bewohnerparken"),
    @XmlEnumValue("eigenerStellplatzGarage")
    EIGENER_STELLPLATZ_GARAGE("eigenerStellplatzGarage");
    private final String value;

    ParkplatzsituationTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkplatzsituationTyp fromValue(String v) {
        for (ParkplatzsituationTyp c: ParkplatzsituationTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
