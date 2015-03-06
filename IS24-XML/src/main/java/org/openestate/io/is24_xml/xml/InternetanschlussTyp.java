
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InternetanschlussTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InternetanschlussTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="keineAngabe"/>
 *     &lt;enumeration value="DSLAnschlussVorhanden"/>
 *     &lt;enumeration value="DSLFlatrate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InternetanschlussTyp")
@XmlEnum
public enum InternetanschlussTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("DSLAnschlussVorhanden")
    DSL_ANSCHLUSS_VORHANDEN("DSLAnschlussVorhanden"),
    @XmlEnumValue("DSLFlatrate")
    DSL_FLATRATE("DSLFlatrate");
    private final String value;

    InternetanschlussTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InternetanschlussTyp fromValue(String v) {
        for (InternetanschlussTyp c: InternetanschlussTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
