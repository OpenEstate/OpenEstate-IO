
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WGZimmerKategorienTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WGZimmerKategorienTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="keineAngabe"/>
 *     &lt;enumeration value="Dachgeschoss"/>
 *     &lt;enumeration value="Loft"/>
 *     &lt;enumeration value="Maisonette"/>
 *     &lt;enumeration value="Penthouse"/>
 *     &lt;enumeration value="Terrassenwohnung"/>
 *     &lt;enumeration value="Erdgeschoss"/>
 *     &lt;enumeration value="Etagenwohnung"/>
 *     &lt;enumeration value="Hochparterre"/>
 *     &lt;enumeration value="Souterrain"/>
 *     &lt;enumeration value="Sonstige"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WGZimmerKategorienTyp")
@XmlEnum
public enum WGZimmerKategorienTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("Dachgeschoss")
    DACHGESCHOSS("Dachgeschoss"),
    @XmlEnumValue("Loft")
    LOFT("Loft"),
    @XmlEnumValue("Maisonette")
    MAISONETTE("Maisonette"),
    @XmlEnumValue("Penthouse")
    PENTHOUSE("Penthouse"),
    @XmlEnumValue("Terrassenwohnung")
    TERRASSENWOHNUNG("Terrassenwohnung"),
    @XmlEnumValue("Erdgeschoss")
    ERDGESCHOSS("Erdgeschoss"),
    @XmlEnumValue("Etagenwohnung")
    ETAGENWOHNUNG("Etagenwohnung"),
    @XmlEnumValue("Hochparterre")
    HOCHPARTERRE("Hochparterre"),
    @XmlEnumValue("Souterrain")
    SOUTERRAIN("Souterrain"),
    @XmlEnumValue("Sonstige")
    SONSTIGE("Sonstige");
    private final String value;

    WGZimmerKategorienTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WGZimmerKategorienTyp fromValue(String v) {
        for (WGZimmerKategorienTyp c: WGZimmerKategorienTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
