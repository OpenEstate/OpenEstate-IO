
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="operation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="write"/>
 *     &lt;enumeration value="force"/>
 *     &lt;enumeration value="delete"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "operation")
@XmlEnum
public enum Operation {

    @XmlEnumValue("write")
    WRITE("write"),
    @XmlEnumValue("force")
    FORCE("force"),
    @XmlEnumValue("delete")
    DELETE("delete");
    private final String value;

    Operation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Operation fromValue(String v) {
        for (Operation c: Operation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
