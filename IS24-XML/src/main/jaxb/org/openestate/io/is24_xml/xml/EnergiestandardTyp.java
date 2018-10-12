
package org.openestate.io.is24_xml.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnergiestandardTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnergiestandardTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="KeineAngabe"/&gt;
 *     &lt;enumeration value="NiedrigenergiehausKfW40"/&gt;
 *     &lt;enumeration value="NiedriegenergiehausKfW60"/&gt;
 *     &lt;enumeration value="Passivhaus"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnergiestandardTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
public enum EnergiestandardTyp {

    @XmlEnumValue("KeineAngabe")
    KEINE_ANGABE("KeineAngabe"),
    @XmlEnumValue("NiedrigenergiehausKfW40")
    NIEDRIGENERGIEHAUS_KF_W_40("NiedrigenergiehausKfW40"),
    @XmlEnumValue("NiedriegenergiehausKfW60")
    NIEDRIEGENERGIEHAUS_KF_W_60("NiedriegenergiehausKfW60"),
    @XmlEnumValue("Passivhaus")
    PASSIVHAUS("Passivhaus");
    private final String value;

    EnergiestandardTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnergiestandardTyp fromValue(String v) {
        for (EnergiestandardTyp c: EnergiestandardTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
