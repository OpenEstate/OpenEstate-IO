
package org.openestate.io.daft_ie.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for commercialType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="commercialType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="land"/&gt;
 *     &lt;enumeration value="shop"/&gt;
 *     &lt;enumeration value="hotel"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "commercialType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
public enum CommercialType {

    @XmlEnumValue("land")
    LAND("land"),
    @XmlEnumValue("shop")
    SHOP("shop"),
    @XmlEnumValue("hotel")
    HOTEL("hotel");
    private final String value;

    CommercialType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommercialType fromValue(String v) {
        for (CommercialType c: CommercialType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
