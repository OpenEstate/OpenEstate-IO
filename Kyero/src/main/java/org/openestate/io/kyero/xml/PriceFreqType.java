
package org.openestate.io.kyero.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for priceFreqType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="priceFreqType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="sale"/>
 *     &lt;enumeration value="week"/>
 *     &lt;enumeration value="month"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "priceFreqType")
@XmlEnum
public enum PriceFreqType {

    @XmlEnumValue("sale")
    SALE("sale"),
    @XmlEnumValue("week")
    WEEK("week"),
    @XmlEnumValue("month")
    MONTH("month");
    private final String value;

    PriceFreqType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PriceFreqType fromValue(String v) {
        for (PriceFreqType c: PriceFreqType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
