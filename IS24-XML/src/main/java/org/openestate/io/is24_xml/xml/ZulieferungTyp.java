
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZulieferungTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ZulieferungTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="keineAngabe"/>
 *     &lt;enumeration value="DirekterZugang"/>
 *     &lt;enumeration value="KeineDirekteAnfahrt"/>
 *     &lt;enumeration value="PKW-Zufahrt"/>
 *     &lt;enumeration value="VonVorn"/>
 *     &lt;enumeration value="VonHinten"/>
 *     &lt;enumeration value="Ganztaegig"/>
 *     &lt;enumeration value="Vormittags"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ZulieferungTyp")
@XmlEnum
public enum ZulieferungTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("DirekterZugang")
    DIREKTER_ZUGANG("DirekterZugang"),
    @XmlEnumValue("KeineDirekteAnfahrt")
    KEINE_DIREKTE_ANFAHRT("KeineDirekteAnfahrt"),
    @XmlEnumValue("PKW-Zufahrt")
    PKW_ZUFAHRT("PKW-Zufahrt"),
    @XmlEnumValue("VonVorn")
    VON_VORN("VonVorn"),
    @XmlEnumValue("VonHinten")
    VON_HINTEN("VonHinten"),
    @XmlEnumValue("Ganztaegig")
    GANZTAEGIG("Ganztaegig"),
    @XmlEnumValue("Vormittags")
    VORMITTAGS("Vormittags");
    private final String value;

    ZulieferungTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZulieferungTyp fromValue(String v) {
        for (ZulieferungTyp c: ZulieferungTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
