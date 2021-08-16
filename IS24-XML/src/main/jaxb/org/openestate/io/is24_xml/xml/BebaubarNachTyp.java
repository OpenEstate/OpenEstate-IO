
package org.openestate.io.is24_xml.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BebaubarNachTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BebaubarNachTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unbekannt"/&gt;
 *     &lt;enumeration value="\u00a730BauGB"/&gt;
 *     &lt;enumeration value="\u00a734BauGB"/&gt;
 *     &lt;enumeration value="\u00a735BauGB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BebaubarNachTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
public enum BebaubarNachTyp {

    @XmlEnumValue("Unbekannt")
    UNBEKANNT("Unbekannt"),

    /**
     * Bebauung nach Bebauungsplan
     * 
     */
    @XmlEnumValue("\u00a730BauGB")
    BAUGB_30("\u00a730BauGB"),

    /**
     * Nachbarbebauung
     * 
     */
    @XmlEnumValue("\u00a734BauGB")
    BAUGB_34("\u00a734BauGB"),

    /**
     * Aussengebiet
     * 
     */
    @XmlEnumValue("\u00a735BauGB")
    BAUGB_35("\u00a735BauGB");
    private final String value;

    BebaubarNachTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BebaubarNachTyp fromValue(String v) {
        for (BebaubarNachTyp c: BebaubarNachTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
