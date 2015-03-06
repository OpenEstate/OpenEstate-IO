
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypenHausKategorienTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypenHausKategorienTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Blockhaus"/>
 *     &lt;enumeration value="Bungalow"/>
 *     &lt;enumeration value="Doppelhaus"/>
 *     &lt;enumeration value="Einfamilienhaus"/>
 *     &lt;enumeration value="Fachwerkhaus"/>
 *     &lt;enumeration value="Holzhaus"/>
 *     &lt;enumeration value="Landhaus"/>
 *     &lt;enumeration value="Mehrfamilienhaus"/>
 *     &lt;enumeration value="Villa"/>
 *     &lt;enumeration value="Reihenhaus"/>
 *     &lt;enumeration value="Zweifamilienhaus"/>
 *     &lt;enumeration value="EinfamilienhausMitEinliegerwohnung"/>
 *     &lt;enumeration value="keineAngabe"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypenHausKategorienTyp")
@XmlEnum
public enum TypenHausKategorienTyp {

    @XmlEnumValue("Blockhaus")
    BLOCKHAUS("Blockhaus"),
    @XmlEnumValue("Bungalow")
    BUNGALOW("Bungalow"),
    @XmlEnumValue("Doppelhaus")
    DOPPELHAUS("Doppelhaus"),
    @XmlEnumValue("Einfamilienhaus")
    EINFAMILIENHAUS("Einfamilienhaus"),
    @XmlEnumValue("Fachwerkhaus")
    FACHWERKHAUS("Fachwerkhaus"),
    @XmlEnumValue("Holzhaus")
    HOLZHAUS("Holzhaus"),
    @XmlEnumValue("Landhaus")
    LANDHAUS("Landhaus"),
    @XmlEnumValue("Mehrfamilienhaus")
    MEHRFAMILIENHAUS("Mehrfamilienhaus"),
    @XmlEnumValue("Villa")
    VILLA("Villa"),
    @XmlEnumValue("Reihenhaus")
    REIHENHAUS("Reihenhaus"),
    @XmlEnumValue("Zweifamilienhaus")
    ZWEIFAMILIENHAUS("Zweifamilienhaus"),
    @XmlEnumValue("EinfamilienhausMitEinliegerwohnung")
    EINFAMILIENHAUS_MIT_EINLIEGERWOHNUNG("EinfamilienhausMitEinliegerwohnung"),
    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe");
    private final String value;

    TypenHausKategorienTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypenHausKategorienTyp fromValue(String v) {
        for (TypenHausKategorienTyp c: TypenHausKategorienTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
