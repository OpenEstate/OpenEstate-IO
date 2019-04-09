
package org.openestate.io.is24_xml.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkplatzsituationTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParkplatzsituationTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="keineAngabe"/&gt;
 *     &lt;enumeration value="guteParkmoeglichkeit"/&gt;
 *     &lt;enumeration value="schlechteParkmoeglichkeit"/&gt;
 *     &lt;enumeration value="Bewohnerparken"/&gt;
 *     &lt;enumeration value="eigenerStellplatzGarage"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkplatzsituationTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
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
