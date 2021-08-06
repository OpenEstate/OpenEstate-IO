
package org.openestate.io.immobiliare_it.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for heat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="heat"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Assente"/&gt;
 *     &lt;enumeration value="Autonomo"/&gt;
 *     &lt;enumeration value="Centralizzato"/&gt;
 *     &lt;enumeration value="Teleriscaldamento"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "heat")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
public enum Heat {

    @XmlEnumValue("Assente")
    ASSENTE("Assente"),
    @XmlEnumValue("Autonomo")
    AUTONOMO("Autonomo"),
    @XmlEnumValue("Centralizzato")
    CENTRALIZZATO("Centralizzato"),
    @XmlEnumValue("Teleriscaldamento")
    TELERISCALDAMENTO("Teleriscaldamento");
    private final String value;

    Heat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Heat fromValue(String v) {
        for (Heat c: Heat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
