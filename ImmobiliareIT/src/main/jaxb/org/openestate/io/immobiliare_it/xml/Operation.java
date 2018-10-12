
package org.openestate.io.immobiliare_it.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="operation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="write"/&gt;
 *     &lt;enumeration value="force"/&gt;
 *     &lt;enumeration value="delete"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "operation")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:48:12+02:00", comments = "JAXB RI v2.2.11")
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
