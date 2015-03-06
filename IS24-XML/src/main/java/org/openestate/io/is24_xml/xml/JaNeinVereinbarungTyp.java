
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JaNeinVereinbarungTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="JaNeinVereinbarungTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="keineAngabe"/>
 *     &lt;enumeration value="ja"/>
 *     &lt;enumeration value="nein"/>
 *     &lt;enumeration value="nachVereinbarung"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "JaNeinVereinbarungTyp")
@XmlEnum
public enum JaNeinVereinbarungTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("ja")
    JA("ja"),
    @XmlEnumValue("nein")
    NEIN("nein"),
    @XmlEnumValue("nachVereinbarung")
    NACH_VEREINBARUNG("nachVereinbarung");
    private final String value;

    JaNeinVereinbarungTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JaNeinVereinbarungTyp fromValue(String v) {
        for (JaNeinVereinbarungTyp c: JaNeinVereinbarungTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
