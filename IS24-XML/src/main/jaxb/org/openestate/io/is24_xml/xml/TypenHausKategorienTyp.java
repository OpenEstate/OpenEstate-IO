
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
 * &lt;simpleType name="TypenHausKategorienTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Blockhaus"/&gt;
 *     &lt;enumeration value="Bungalow"/&gt;
 *     &lt;enumeration value="Doppelhaus"/&gt;
 *     &lt;enumeration value="Einfamilienhaus"/&gt;
 *     &lt;enumeration value="Fachwerkhaus"/&gt;
 *     &lt;enumeration value="Holzhaus"/&gt;
 *     &lt;enumeration value="Landhaus"/&gt;
 *     &lt;enumeration value="Mehrfamilienhaus"/&gt;
 *     &lt;enumeration value="Villa"/&gt;
 *     &lt;enumeration value="Reihenhaus"/&gt;
 *     &lt;enumeration value="Zweifamilienhaus"/&gt;
 *     &lt;enumeration value="EinfamilienhausMitEinliegerwohnung"/&gt;
 *     &lt;enumeration value="keineAngabe"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
