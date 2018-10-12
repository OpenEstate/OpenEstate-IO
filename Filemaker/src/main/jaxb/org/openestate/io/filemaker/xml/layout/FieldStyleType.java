
package org.openestate.io.filemaker.xml.layout;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldStyleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FieldStyleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="POPUPLIST"/&gt;
 *     &lt;enumeration value="POPUPMENU"/&gt;
 *     &lt;enumeration value="CHECKBOX"/&gt;
 *     &lt;enumeration value="RADIOBUTTONS"/&gt;
 *     &lt;enumeration value="SCROLLTEXT"/&gt;
 *     &lt;enumeration value="SELECTIONLIST"/&gt;
 *     &lt;enumeration value="EDITTEXT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FieldStyleType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
public enum FieldStyleType {

    POPUPLIST,
    POPUPMENU,
    CHECKBOX,
    RADIOBUTTONS,
    SCROLLTEXT,
    SELECTIONLIST,
    EDITTEXT;

    public String value() {
        return name();
    }

    public static FieldStyleType fromValue(String v) {
        return valueOf(v);
    }

}
