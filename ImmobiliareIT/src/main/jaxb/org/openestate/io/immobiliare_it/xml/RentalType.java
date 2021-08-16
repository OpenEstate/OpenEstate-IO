
package org.openestate.io.immobiliare_it.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rental.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="rental"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="3+2"/&gt;
 *     &lt;enumeration value="4+4"/&gt;
 *     &lt;enumeration value="6+6"/&gt;
 *     &lt;enumeration value="9+9"/&gt;
 *     &lt;enumeration value="Transitorio"/&gt;
 *     &lt;enumeration value="Concordato"/&gt;
 *     &lt;enumeration value="Libero"/&gt;
 *     &lt;enumeration value="Studenti"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "rental")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
public enum RentalType {

    @XmlEnumValue("3+2")
    RENT_3_PLUS_2("3+2"),
    @XmlEnumValue("4+4")
    RENT_4_PLUS_4("4+4"),
    @XmlEnumValue("6+6")
    RENT_6_PLUS_6("6+6"),
    @XmlEnumValue("9+9")
    RENT_9_PLUS_9("9+9"),
    @XmlEnumValue("Transitorio")
    TRANSITORIO("Transitorio"),
    @XmlEnumValue("Concordato")
    CONCORDATO("Concordato"),
    @XmlEnumValue("Libero")
    LIBERO("Libero"),
    @XmlEnumValue("Studenti")
    STUDENTI("Studenti");
    private final String value;

    RentalType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RentalType fromValue(String v) {
        for (RentalType c: RentalType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
