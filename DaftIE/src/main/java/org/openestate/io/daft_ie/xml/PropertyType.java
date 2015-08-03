
package org.openestate.io.daft_ie.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propertyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="propertyType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="house"/&gt;
 *     &lt;enumeration value="apartment"/&gt;
 *     &lt;enumeration value="duplex"/&gt;
 *     &lt;enumeration value="bungalow"/&gt;
 *     &lt;enumeration value="site"/&gt;
 *     &lt;enumeration value="commercial"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "propertyType")
@XmlEnum
public enum PropertyType {

    @XmlEnumValue("house")
    HOUSE("house"),
    @XmlEnumValue("apartment")
    APARTMENT("apartment"),
    @XmlEnumValue("duplex")
    DUPLEX("duplex"),
    @XmlEnumValue("bungalow")
    BUNGALOW("bungalow"),
    @XmlEnumValue("site")
    SITE("site"),
    @XmlEnumValue("commercial")
    COMMERCIAL("commercial");
    private final String value;

    PropertyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PropertyType fromValue(String v) {
        for (PropertyType c: PropertyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
