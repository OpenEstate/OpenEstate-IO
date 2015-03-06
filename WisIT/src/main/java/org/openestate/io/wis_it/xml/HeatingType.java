
package org.openestate.io.wis_it.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for heatingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="heatingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="zentral"/>
 *     &lt;enumeration value="autonom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "heatingType")
@XmlEnum
public enum HeatingType {

    @XmlEnumValue("zentral")
    ZENTRAL("zentral"),
    @XmlEnumValue("autonom")
    AUTONOM("autonom");
    private final String value;

    HeatingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HeatingType fromValue(String v) {
        for (HeatingType c: HeatingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
