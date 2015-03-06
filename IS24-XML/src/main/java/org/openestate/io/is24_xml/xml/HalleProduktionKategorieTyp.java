
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HalleProduktionKategorieTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HalleProduktionKategorieTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="keineAngabe"/>
 *     &lt;enumeration value="Ausstellungsflaeche"/>
 *     &lt;enumeration value="Halle"/>
 *     &lt;enumeration value="Hochregallager"/>
 *     &lt;enumeration value="Industriehalle"/>
 *     &lt;enumeration value="IndustriehalleMitFreiflaeche"/>
 *     &lt;enumeration value="Kuehlhaus"/>
 *     &lt;enumeration value="Kuehlregallager"/>
 *     &lt;enumeration value="LagerMitFreiflaeche"/>
 *     &lt;enumeration value="Lagerflaeche"/>
 *     &lt;enumeration value="Lagerhalle"/>
 *     &lt;enumeration value="Serviceflaeche"/>
 *     &lt;enumeration value="Speditionslager"/>
 *     &lt;enumeration value="Werkstatt"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HalleProduktionKategorieTyp")
@XmlEnum
public enum HalleProduktionKategorieTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("Ausstellungsflaeche")
    AUSSTELLUNGSFLAECHE("Ausstellungsflaeche"),
    @XmlEnumValue("Halle")
    HALLE("Halle"),
    @XmlEnumValue("Hochregallager")
    HOCHREGALLAGER("Hochregallager"),
    @XmlEnumValue("Industriehalle")
    INDUSTRIEHALLE("Industriehalle"),
    @XmlEnumValue("IndustriehalleMitFreiflaeche")
    INDUSTRIEHALLE_MIT_FREIFLAECHE("IndustriehalleMitFreiflaeche"),
    @XmlEnumValue("Kuehlhaus")
    KUEHLHAUS("Kuehlhaus"),
    @XmlEnumValue("Kuehlregallager")
    KUEHLREGALLAGER("Kuehlregallager"),
    @XmlEnumValue("LagerMitFreiflaeche")
    LAGER_MIT_FREIFLAECHE("LagerMitFreiflaeche"),
    @XmlEnumValue("Lagerflaeche")
    LAGERFLAECHE("Lagerflaeche"),
    @XmlEnumValue("Lagerhalle")
    LAGERHALLE("Lagerhalle"),
    @XmlEnumValue("Serviceflaeche")
    SERVICEFLAECHE("Serviceflaeche"),
    @XmlEnumValue("Speditionslager")
    SPEDITIONSLAGER("Speditionslager"),
    @XmlEnumValue("Werkstatt")
    WERKSTATT("Werkstatt");
    private final String value;

    HalleProduktionKategorieTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HalleProduktionKategorieTyp fromValue(String v) {
        for (HalleProduktionKategorieTyp c: HalleProduktionKategorieTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
