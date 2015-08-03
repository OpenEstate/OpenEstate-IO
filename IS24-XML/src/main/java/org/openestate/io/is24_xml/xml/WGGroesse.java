
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WGGroesse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WGGroesse"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *     &lt;enumeration value="5"/&gt;
 *     &lt;enumeration value="6"/&gt;
 *     &lt;enumeration value="7"/&gt;
 *     &lt;enumeration value="8"/&gt;
 *     &lt;enumeration value="9"/&gt;
 *     &lt;enumeration value="10"/&gt;
 *     &lt;enumeration value="11+"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WGGroesse")
@XmlEnum
public enum WGGroesse {

    @XmlEnumValue("2")
    PERSONS_02("2"),
    @XmlEnumValue("3")
    PERSONS_03("3"),
    @XmlEnumValue("4")
    PERSONS_04("4"),
    @XmlEnumValue("5")
    PERSONS_05("5"),
    @XmlEnumValue("6")
    PERSONS_06("6"),
    @XmlEnumValue("7")
    PERSONS_07("7"),
    @XmlEnumValue("8")
    PERSONS_08("8"),
    @XmlEnumValue("9")
    PERSONS_09("9"),
    @XmlEnumValue("10")
    PERSONS_10("10"),
    @XmlEnumValue("11+")
    PERSONS_11_PLUS("11+");
    private final String value;

    WGGroesse(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WGGroesse fromValue(String v) {
        for (WGGroesse c: WGGroesse.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
