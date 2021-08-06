
package org.openestate.io.immobiliare_it.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for furniture.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="furniture"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Arredato"/&gt;
 *     &lt;enumeration value="Non Arredato"/&gt;
 *     &lt;enumeration value="Parzialmente Arredato"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "furniture")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
public enum Furniture {

    @XmlEnumValue("Arredato")
    ARREDATO("Arredato"),
    @XmlEnumValue("Non Arredato")
    NON_ARREDATO("Non Arredato"),
    @XmlEnumValue("Parzialmente Arredato")
    PARZIALMENTE_ARREDATO("Parzialmente Arredato");
    private final String value;

    Furniture(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Furniture fromValue(String v) {
        for (Furniture c: Furniture.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
