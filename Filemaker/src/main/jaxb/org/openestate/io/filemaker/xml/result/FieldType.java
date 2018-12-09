
package org.openestate.io.filemaker.xml.result;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FieldType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TEXT"/&gt;
 *     &lt;enumeration value="NUMBER"/&gt;
 *     &lt;enumeration value="DATE"/&gt;
 *     &lt;enumeration value="TIME"/&gt;
 *     &lt;enumeration value="CONTAINER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FieldType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
public enum FieldType {

    TEXT,
    NUMBER,
    DATE,
    TIME,
    CONTAINER;

    public String value() {
        return name();
    }

    public static FieldType fromValue(String v) {
        return valueOf(v);
    }

}
