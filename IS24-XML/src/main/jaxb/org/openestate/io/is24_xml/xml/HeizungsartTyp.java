
package org.openestate.io.is24_xml.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeizungsartTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HeizungsartTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="keineAngabe"/&gt;
 *     &lt;enumeration value="Etagenheizung"/&gt;
 *     &lt;enumeration value="Ofenheizung"/&gt;
 *     &lt;enumeration value="Zentralheizung"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HeizungsartTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
public enum HeizungsartTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("Etagenheizung")
    ETAGENHEIZUNG("Etagenheizung"),
    @XmlEnumValue("Ofenheizung")
    OFENHEIZUNG("Ofenheizung"),
    @XmlEnumValue("Zentralheizung")
    ZENTRALHEIZUNG("Zentralheizung");
    private final String value;

    HeizungsartTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HeizungsartTyp fromValue(String v) {
        for (HeizungsartTyp c: HeizungsartTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
