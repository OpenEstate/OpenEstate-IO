
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MMAnhangArtenTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MMAnhangArtenTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="bild"/>
 *     &lt;enumeration value="video"/>
 *     &lt;enumeration value="link"/>
 *     &lt;enumeration value="grundrissBild"/>
 *     &lt;enumeration value="grundrissPDF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MMAnhangArtenTyp")
@XmlEnum
public enum MMAnhangArtenTyp {

    @XmlEnumValue("bild")
    BILD("bild"),
    @XmlEnumValue("video")
    VIDEO("video"),
    @XmlEnumValue("link")
    LINK("link"),
    @XmlEnumValue("grundrissBild")
    GRUNDRISS_BILD("grundrissBild"),
    @XmlEnumValue("grundrissPDF")
    GRUNDRISS_PDF("grundrissPDF");
    private final String value;

    MMAnhangArtenTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MMAnhangArtenTyp fromValue(String v) {
        for (MMAnhangArtenTyp c: MMAnhangArtenTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
