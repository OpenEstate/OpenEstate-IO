
package org.openestate.io.is24_xml.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EinzelhandelKategorienTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EinzelhandelKategorienTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="keineAngabe"/&gt;
 *     &lt;enumeration value="Ausstellungsflaeche"/&gt;
 *     &lt;enumeration value="Einkaufszentrum"/&gt;
 *     &lt;enumeration value="FactoryOutlet"/&gt;
 *     &lt;enumeration value="Kaufhaus"/&gt;
 *     &lt;enumeration value="Kiosk"/&gt;
 *     &lt;enumeration value="Laden"/&gt;
 *     &lt;enumeration value="SBMarkt"/&gt;
 *     &lt;enumeration value="Verkaufsflaeche"/&gt;
 *     &lt;enumeration value="Verkaufshalle"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EinzelhandelKategorienTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
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
