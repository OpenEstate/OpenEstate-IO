
package org.openestate.io.wis_it.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for areaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="areaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="netto"/>
 *     &lt;enumeration value="brutto"/>
 *     &lt;enumeration value="verkauf"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "areaType")
@XmlEnum
public enum AreaType {

    @XmlEnumValue("netto")
    NETTO("netto"),
    @XmlEnumValue("brutto")
    BRUTTO("brutto"),
    @XmlEnumValue("verkauf")
    VERKAUF("verkauf");
    private final String value;

    AreaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AreaType fromValue(String v) {
        for (AreaType c: AreaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
