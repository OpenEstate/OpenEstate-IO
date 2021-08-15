
package org.openestate.io.kyero.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for priceFreqType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="priceFreqType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="sale"/&gt;
 *     &lt;enumeration value="week"/&gt;
 *     &lt;enumeration value="month"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "priceFreqType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
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
