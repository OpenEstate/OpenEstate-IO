
package org.openestate.io.is24_xml.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WGZimmerKategorienTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WGZimmerKategorienTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="keineAngabe"/&gt;
 *     &lt;enumeration value="Dachgeschoss"/&gt;
 *     &lt;enumeration value="Loft"/&gt;
 *     &lt;enumeration value="Maisonette"/&gt;
 *     &lt;enumeration value="Penthouse"/&gt;
 *     &lt;enumeration value="Terrassenwohnung"/&gt;
 *     &lt;enumeration value="Erdgeschoss"/&gt;
 *     &lt;enumeration value="Etagenwohnung"/&gt;
 *     &lt;enumeration value="Hochparterre"/&gt;
 *     &lt;enumeration value="Souterrain"/&gt;
 *     &lt;enumeration value="Sonstige"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WGZimmerKategorienTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
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
