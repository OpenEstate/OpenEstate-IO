
package org.openestate.io.is24_xml.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MMAnhangArtenTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MMAnhangArtenTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="bild"/&gt;
 *     &lt;enumeration value="video"/&gt;
 *     &lt;enumeration value="link"/&gt;
 *     &lt;enumeration value="grundrissBild"/&gt;
 *     &lt;enumeration value="grundrissPDF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MMAnhangArtenTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
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
