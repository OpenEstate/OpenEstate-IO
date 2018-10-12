
package org.openestate.io.immobiliare_it.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nationcode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="nationcode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="it"/&gt;
 *     &lt;enumeration value="en"/&gt;
 *     &lt;enumeration value="de"/&gt;
 *     &lt;enumeration value="fr"/&gt;
 *     &lt;enumeration value="es"/&gt;
 *     &lt;enumeration value="pt"/&gt;
 *     &lt;enumeration value="ru"/&gt;
 *     &lt;enumeration value="gr"/&gt;
 *     &lt;enumeration value="el"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "nationcode")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:48:12+02:00", comments = "JAXB RI v2.2.11")
public enum NationCode {

    @XmlEnumValue("it")
    IT("it"),
    @XmlEnumValue("en")
    EN("en"),
    @XmlEnumValue("de")
    DE("de"),
    @XmlEnumValue("fr")
    FR("fr"),
    @XmlEnumValue("es")
    ES("es"),
    @XmlEnumValue("pt")
    PT("pt"),
    @XmlEnumValue("ru")
    RU("ru"),
    @XmlEnumValue("gr")
    GR("gr"),
    @XmlEnumValue("el")
    EL("el");
    private final String value;

    NationCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NationCode fromValue(String v) {
        for (NationCode c: NationCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
