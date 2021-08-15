
package org.openestate.io.immobiliare_it.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for garden.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="garden"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Privato"/&gt;
 *     &lt;enumeration value="Comune"/&gt;
 *     &lt;enumeration value="Nessuno"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "garden")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
