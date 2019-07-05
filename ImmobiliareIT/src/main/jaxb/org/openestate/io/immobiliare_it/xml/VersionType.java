
package org.openestate.io.immobiliare_it.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for version.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="version"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="2.8"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "version")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
public enum VersionType {

    @XmlEnumValue("2.8")
    V2_8("2.8");
    private final String value;

    VersionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VersionType fromValue(String v) {
        for (VersionType c: VersionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
