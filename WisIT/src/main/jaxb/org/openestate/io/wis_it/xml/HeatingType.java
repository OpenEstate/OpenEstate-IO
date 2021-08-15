
package org.openestate.io.wis_it.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * Java enum for &lt;HEIZUNG&gt; elements.
 * 
 * <p>Java class for heatingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="heatingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="zentral"/&gt;
 *     &lt;enumeration value="autonom"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "heatingType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
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
