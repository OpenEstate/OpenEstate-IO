
package org.openestate.io.wis_it.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * Java enum for &lt;FLAECHEART&gt; elements.
 * 
 * <p>Java class for areaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="areaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="netto"/&gt;
 *     &lt;enumeration value="brutto"/&gt;
 *     &lt;enumeration value="verkauf"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "areaType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
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
