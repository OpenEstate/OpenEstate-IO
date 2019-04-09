
package org.openestate.io.is24_xml.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HalleProduktionKategorieTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HalleProduktionKategorieTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="keineAngabe"/&gt;
 *     &lt;enumeration value="Ausstellungsflaeche"/&gt;
 *     &lt;enumeration value="Halle"/&gt;
 *     &lt;enumeration value="Hochregallager"/&gt;
 *     &lt;enumeration value="Industriehalle"/&gt;
 *     &lt;enumeration value="IndustriehalleMitFreiflaeche"/&gt;
 *     &lt;enumeration value="Kuehlhaus"/&gt;
 *     &lt;enumeration value="Kuehlregallager"/&gt;
 *     &lt;enumeration value="LagerMitFreiflaeche"/&gt;
 *     &lt;enumeration value="Lagerflaeche"/&gt;
 *     &lt;enumeration value="Lagerhalle"/&gt;
 *     &lt;enumeration value="Serviceflaeche"/&gt;
 *     &lt;enumeration value="Speditionslager"/&gt;
 *     &lt;enumeration value="Werkstatt"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HalleProduktionKategorieTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
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
