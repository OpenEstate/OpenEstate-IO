
package org.openestate.io.trovit.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeNew.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeNew"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="0"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeNew")
@XmlEnum
public enum TypeNew {

    @XmlEnumValue("1")
    NEW("1"),
    @XmlEnumValue("0")
    NOT_NEW("0");
    private final String value;

    TypeNew(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeNew fromValue(String v) {
        for (TypeNew c: TypeNew.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
