
package org.openestate.io.immobiliare_it.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kitchen.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="kitchen"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Abitabile"/&gt;
 *     &lt;enumeration value="Semi abitabile"/&gt;
 *     &lt;enumeration value="Cucinotto"/&gt;
 *     &lt;enumeration value="Angolo Cottura"/&gt;
 *     &lt;enumeration value="A vista"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "kitchen")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
public enum KitchenType {

    @XmlEnumValue("Abitabile")
    ABITABILE("Abitabile"),
    @XmlEnumValue("Semi abitabile")
    SEMI_ABITABILE("Semi abitabile"),
    @XmlEnumValue("Cucinotto")
    CUCINOTTO("Cucinotto"),
    @XmlEnumValue("Angolo Cottura")
    ANGOLO_COTTURA("Angolo Cottura"),
    @XmlEnumValue("A vista")
    A_VISTA("A vista");
    private final String value;

    KitchenType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KitchenType fromValue(String v) {
        for (KitchenType c: KitchenType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
