
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WGZimmerGeschlechtTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WGZimmerGeschlechtTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Maennlich"/&gt;
 *     &lt;enumeration value="Weiblich"/&gt;
 *     &lt;enumeration value="MaennlichOderWeiblich"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WGZimmerGeschlechtTyp")
@XmlEnum
public enum WGZimmerGeschlechtTyp {

    @XmlEnumValue("Maennlich")
    MAENNLICH("Maennlich"),
    @XmlEnumValue("Weiblich")
    WEIBLICH("Weiblich"),
    @XmlEnumValue("MaennlichOderWeiblich")
    MAENNLICH_ODER_WEIBLICH("MaennlichOderWeiblich");
    private final String value;

    WGZimmerGeschlechtTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WGZimmerGeschlechtTyp fromValue(String v) {
        for (WGZimmerGeschlechtTyp c: WGZimmerGeschlechtTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
