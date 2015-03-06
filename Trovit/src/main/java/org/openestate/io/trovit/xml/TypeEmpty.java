
package org.openestate.io.trovit.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeEmpty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeEmpty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value=""/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeEmpty")
@XmlEnum
public enum TypeEmpty {

    @XmlEnumValue("")
    EMPTY("");
    private final String value;

    TypeEmpty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeEmpty fromValue(String v) {
        for (TypeEmpty c: TypeEmpty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
