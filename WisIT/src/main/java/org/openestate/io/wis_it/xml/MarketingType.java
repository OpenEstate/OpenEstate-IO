
package org.openestate.io.wis_it.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for marketingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="marketingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="miete"/&gt;
 *     &lt;enumeration value="kauf"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "marketingType")
@XmlEnum
public enum MarketingType {

    @XmlEnumValue("miete")
    MIETE("miete"),
    @XmlEnumValue("kauf")
    KAUF("kauf");
    private final String value;

    MarketingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MarketingType fromValue(String v) {
        for (MarketingType c: MarketingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
