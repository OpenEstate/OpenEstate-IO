
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
 *     &lt;enumeration value="Angolo cottura"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "kitchen")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:48:12+02:00", comments = "JAXB RI v2.2.11")
public enum Kitchen {

    @XmlEnumValue("Abitabile")
    ABITABILE("Abitabile"),
    @XmlEnumValue("Semi abitabile")
    SEMI_ABITABILE("Semi abitabile"),
    @XmlEnumValue("Cucinotto")
    CUCINOTTO("Cucinotto"),
    @XmlEnumValue("Angolo cottura")
    ANGOLO_COTTURA("Angolo cottura");
    private final String value;

    Kitchen(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Kitchen fromValue(String v) {
        for (Kitchen c: Kitchen.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
