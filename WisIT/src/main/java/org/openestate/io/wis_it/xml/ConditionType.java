
package org.openestate.io.wis_it.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conditionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="conditionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="neu"/&gt;
 *     &lt;enumeration value="gebraucht"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "conditionType")
@XmlEnum
public enum ConditionType {

    @XmlEnumValue("neu")
    NEU("neu"),
    @XmlEnumValue("gebraucht")
    GEBRAUCHT("gebraucht");
    private final String value;

    ConditionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConditionType fromValue(String v) {
        for (ConditionType c: ConditionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
