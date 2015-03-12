
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for garden.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="garden">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Privato"/>
 *     &lt;enumeration value="Comune"/>
 *     &lt;enumeration value="Nessuno"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "garden")
@XmlEnum
public enum Garden {

    @XmlEnumValue("Privato")
    PRIVATO("Privato"),
    @XmlEnumValue("Comune")
    COMUNE("Comune"),
    @XmlEnumValue("Nessuno")
    NESSUNO("Nessuno");
    private final String value;

    Garden(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Garden fromValue(String v) {
        for (Garden c: Garden.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
