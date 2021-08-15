
package org.openestate.io.immobiliare_it.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for class.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="class"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="signorile"/&gt;
 *     &lt;enumeration value="medio"/&gt;
 *     &lt;enumeration value="economico"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "class")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
public enum ClassType {

    @XmlEnumValue("signorile")
    SIGNORILE("signorile"),
    @XmlEnumValue("medio")
    MEDIO("medio"),
    @XmlEnumValue("economico")
    ECONOMICO("economico");
    private final String value;

    ClassType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClassType fromValue(String v) {
        for (ClassType c: ClassType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
