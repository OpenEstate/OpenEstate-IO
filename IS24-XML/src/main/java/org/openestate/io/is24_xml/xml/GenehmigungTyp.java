
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenehmigungTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GenehmigungTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="keineAngabe"/>
 *     &lt;enumeration value="erlaubt"/>
 *     &lt;enumeration value="verboten"/>
 *     &lt;enumeration value="nachVereinbarung"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GenehmigungTyp")
@XmlEnum
public enum GenehmigungTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("erlaubt")
    ERLAUBT("erlaubt"),
    @XmlEnumValue("verboten")
    VERBOTEN("verboten"),
    @XmlEnumValue("nachVereinbarung")
    NACH_VEREINBARUNG("nachVereinbarung");
    private final String value;

    GenehmigungTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GenehmigungTyp fromValue(String v) {
        for (GenehmigungTyp c: GenehmigungTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
