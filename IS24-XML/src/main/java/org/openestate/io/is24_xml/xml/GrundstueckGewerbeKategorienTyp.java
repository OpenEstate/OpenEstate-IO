
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrundstueckGewerbeKategorienTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GrundstueckGewerbeKategorienTyp"&gt;
 *   &lt;restriction base="{http://www.immobilienscout24.de/immobilientransfer}GrundstueckKategorienTyp"&gt;
 *     &lt;enumeration value="Gewerbe"/&gt;
 *     &lt;enumeration value="LandForstwirtschaft"/&gt;
 *     &lt;enumeration value="Freizeit"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GrundstueckGewerbeKategorienTyp")
@XmlEnum(GrundstueckKategorienTyp.class)
public enum GrundstueckGewerbeKategorienTyp {

    @XmlEnumValue("Gewerbe")
    GEWERBE(GrundstueckKategorienTyp.GEWERBE),
    @XmlEnumValue("LandForstwirtschaft")
    LAND_FORSTWIRTSCHAFT(GrundstueckKategorienTyp.LAND_FORSTWIRTSCHAFT),
    @XmlEnumValue("Freizeit")
    FREIZEIT(GrundstueckKategorienTyp.FREIZEIT);
    private final GrundstueckKategorienTyp value;

    GrundstueckGewerbeKategorienTyp(GrundstueckKategorienTyp v) {
        value = v;
    }

    public GrundstueckKategorienTyp value() {
        return value;
    }

    public static GrundstueckGewerbeKategorienTyp fromValue(GrundstueckKategorienTyp v) {
        for (GrundstueckGewerbeKategorienTyp c: GrundstueckGewerbeKategorienTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
