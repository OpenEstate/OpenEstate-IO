
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
 *     &lt;enumeration value="1.5"/&gt;
 *     &lt;enumeration value="1.6"/&gt;
 *     &lt;enumeration value="2.0"/&gt;
 *     &lt;enumeration value="2.1"/&gt;
 *     &lt;enumeration value="2.2"/&gt;
 *     &lt;enumeration value="2.4"/&gt;
 *     &lt;enumeration value="2.2.1"/&gt;
 *     &lt;enumeration value="2.5"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "version")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:48:12+02:00", comments = "JAXB RI v2.2.11")
public enum Version {

    @XmlEnumValue("1.5")
    V1_5("1.5"),
    @XmlEnumValue("1.6")
    V1_6("1.6"),
    @XmlEnumValue("2.0")
    V2_0("2.0"),
    @XmlEnumValue("2.1")
    V2_1("2.1"),
    @XmlEnumValue("2.2")
    V2_2("2.2"),
    @XmlEnumValue("2.4")
    V2_4("2.4"),
    @XmlEnumValue("2.2.1")
    V2_2_1("2.2.1"),
    @XmlEnumValue("2.5")
    V2_5("2.5");
    private final String value;

    Version(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Version fromValue(String v) {
        for (Version c: Version.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
