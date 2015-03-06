
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EinzelhandelKategorienTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EinzelhandelKategorienTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="keineAngabe"/>
 *     &lt;enumeration value="Ausstellungsflaeche"/>
 *     &lt;enumeration value="Einkaufszentrum"/>
 *     &lt;enumeration value="FactoryOutlet"/>
 *     &lt;enumeration value="Kaufhaus"/>
 *     &lt;enumeration value="Kiosk"/>
 *     &lt;enumeration value="Laden"/>
 *     &lt;enumeration value="SBMarkt"/>
 *     &lt;enumeration value="Verkaufsflaeche"/>
 *     &lt;enumeration value="Verkaufshalle"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EinzelhandelKategorienTyp")
@XmlEnum
public enum EinzelhandelKategorienTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("Ausstellungsflaeche")
    AUSSTELLUNGSFLAECHE("Ausstellungsflaeche"),
    @XmlEnumValue("Einkaufszentrum")
    EINKAUFSZENTRUM("Einkaufszentrum"),
    @XmlEnumValue("FactoryOutlet")
    FACTORY_OUTLET("FactoryOutlet"),
    @XmlEnumValue("Kaufhaus")
    KAUFHAUS("Kaufhaus"),
    @XmlEnumValue("Kiosk")
    KIOSK("Kiosk"),
    @XmlEnumValue("Laden")
    LADEN("Laden"),
    @XmlEnumValue("SBMarkt")
    SB_MARKT("SBMarkt"),
    @XmlEnumValue("Verkaufsflaeche")
    VERKAUFSFLAECHE("Verkaufsflaeche"),
    @XmlEnumValue("Verkaufshalle")
    VERKAUFSHALLE("Verkaufshalle");
    private final String value;

    EinzelhandelKategorienTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EinzelhandelKategorienTyp fromValue(String v) {
        for (EinzelhandelKategorienTyp c: EinzelhandelKategorienTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
