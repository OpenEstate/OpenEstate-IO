
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GastroKategorieTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GastroKategorieTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Barbetrieb"/>
 *     &lt;enumeration value="Caffee"/>
 *     &lt;enumeration value="Diskothek"/>
 *     &lt;enumeration value="Gaestehaus"/>
 *     &lt;enumeration value="Gaststaette"/>
 *     &lt;enumeration value="Hotel"/>
 *     &lt;enumeration value="Hotelanwesen"/>
 *     &lt;enumeration value="HotelGarni"/>
 *     &lt;enumeration value="Pension"/>
 *     &lt;enumeration value="Restaurant"/>
 *     &lt;enumeration value="Ferienbungalow"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GastroKategorieTyp")
@XmlEnum
public enum GastroKategorieTyp {


    /**
     * umfasst: Barbetrieb/Lounge
     * 
     */
    @XmlEnumValue("Barbetrieb")
    BARBETRIEB("Barbetrieb"),
    @XmlEnumValue("Caffee")
    CAFFEE("Caffee"),

    /**
     * umfasst: Club/Diskothek
     * 
     */
    @XmlEnumValue("Diskothek")
    DISKOTHEK("Diskothek"),
    @XmlEnumValue("Gaestehaus")
    GAESTEHAUS("Gaestehaus"),
    @XmlEnumValue("Gaststaette")
    GASTSTAETTE("Gaststaette"),
    @XmlEnumValue("Hotel")
    HOTEL("Hotel"),
    @XmlEnumValue("Hotelanwesen")
    HOTELANWESEN("Hotelanwesen"),
    @XmlEnumValue("HotelGarni")
    HOTEL_GARNI("HotelGarni"),
    @XmlEnumValue("Pension")
    PENSION("Pension"),
    @XmlEnumValue("Restaurant")
    RESTAURANT("Restaurant"),
    @XmlEnumValue("Ferienbungalow")
    FERIENBUNGALOW("Ferienbungalow");
    private final String value;

    GastroKategorieTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GastroKategorieTyp fromValue(String v) {
        for (GastroKategorieTyp c: GastroKategorieTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
