
package org.openestate.io.immobiliare_it.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for visibility.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="visibility"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="basic"/&gt;
 *     &lt;enumeration value="premium"/&gt;
 *     &lt;enumeration value="top"/&gt;
 *     &lt;enumeration value="showcase"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "visibility")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
public enum VisibilityType {

    @XmlEnumValue("basic")
    BASIC("basic"),
    @XmlEnumValue("premium")
    PREMIUM("premium"),
    @XmlEnumValue("top")
    TOP("top"),
    @XmlEnumValue("showcase")
    SHOWCASE("showcase");
    private final String value;

    VisibilityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VisibilityType fromValue(String v) {
        for (VisibilityType c: VisibilityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
