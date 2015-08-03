
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZwangsversteigerungKategorieTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ZwangsversteigerungKategorieTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Eigentumswohnung"/&gt;
 *     &lt;enumeration value="Ein/Mehrfamilienhaus"/&gt;
 *     &lt;enumeration value="Gewerbe/Anlage"/&gt;
 *     &lt;enumeration value="Grundstueck"/&gt;
 *     &lt;enumeration value="Garage/Sonstige"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ZwangsversteigerungKategorieTyp")
@XmlEnum
public enum ZwangsversteigerungKategorieTyp {

    @XmlEnumValue("Eigentumswohnung")
    EIGENTUMSWOHNUNG("Eigentumswohnung"),
    @XmlEnumValue("Ein/Mehrfamilienhaus")
    EFH_MFH("Ein/Mehrfamilienhaus"),
    @XmlEnumValue("Gewerbe/Anlage")
    GEWERBE_ANLAGE("Gewerbe/Anlage"),
    @XmlEnumValue("Grundstueck")
    GRUNDSTUECK("Grundstueck"),
    @XmlEnumValue("Garage/Sonstige")
    GARAGE_SONSTIGES("Garage/Sonstige");
    private final String value;

    ZwangsversteigerungKategorieTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZwangsversteigerungKategorieTyp fromValue(String v) {
        for (ZwangsversteigerungKategorieTyp c: ZwangsversteigerungKategorieTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
