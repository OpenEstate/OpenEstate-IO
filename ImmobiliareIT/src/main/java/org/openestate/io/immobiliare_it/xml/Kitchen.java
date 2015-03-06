
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kitchen.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="kitchen">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Abitabile"/>
 *     &lt;enumeration value="Semi abitabile"/>
 *     &lt;enumeration value="Cucinotto"/>
 *     &lt;enumeration value="Angolo cottura"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "kitchen")
@XmlEnum
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
