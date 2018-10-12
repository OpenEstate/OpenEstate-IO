
package org.openestate.io.is24_xml.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WohnungKategorienTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WohnungKategorienTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Dachgeschoss"/&gt;
 *     &lt;enumeration value="Maisonette"/&gt;
 *     &lt;enumeration value="keineAngabe"/&gt;
 *     &lt;enumeration value="Penthouse"/&gt;
 *     &lt;enumeration value="Terrassenwohnung"/&gt;
 *     &lt;enumeration value="Sonstige"/&gt;
 *     &lt;enumeration value="Erdgeschoss"/&gt;
 *     &lt;enumeration value="Etagenwohnung"/&gt;
 *     &lt;enumeration value="Loft"/&gt;
 *     &lt;enumeration value="Hochparterre"/&gt;
 *     &lt;enumeration value="Souterrain"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WohnungKategorienTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
public enum WohnungKategorienTyp {

    @XmlEnumValue("Dachgeschoss")
    DACHGESCHOSS("Dachgeschoss"),
    @XmlEnumValue("Maisonette")
    MAISONETTE("Maisonette"),
    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("Penthouse")
    PENTHOUSE("Penthouse"),
    @XmlEnumValue("Terrassenwohnung")
    TERRASSENWOHNUNG("Terrassenwohnung"),
    @XmlEnumValue("Sonstige")
    SONSTIGE("Sonstige"),
    @XmlEnumValue("Erdgeschoss")
    ERDGESCHOSS("Erdgeschoss"),
    @XmlEnumValue("Etagenwohnung")
    ETAGENWOHNUNG("Etagenwohnung"),
    @XmlEnumValue("Loft")
    LOFT("Loft"),
    @XmlEnumValue("Hochparterre")
    HOCHPARTERRE("Hochparterre"),
    @XmlEnumValue("Souterrain")
    SOUTERRAIN("Souterrain");
    private final String value;

    WohnungKategorienTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WohnungKategorienTyp fromValue(String v) {
        for (WohnungKategorienTyp c: WohnungKategorienTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
