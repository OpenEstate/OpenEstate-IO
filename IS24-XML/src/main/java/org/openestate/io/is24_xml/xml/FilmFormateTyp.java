
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilmFormateTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FilmFormateTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AVI"/>
 *     &lt;enumeration value="MPG"/>
 *     &lt;enumeration value="MOV"/>
 *     &lt;enumeration value="QT"/>
 *     &lt;enumeration value="QTL"/>
 *     &lt;enumeration value="RM"/>
 *     &lt;enumeration value="RV"/>
 *     &lt;enumeration value="MPE"/>
 *     &lt;enumeration value="MPEG"/>
 *     &lt;enumeration value="MP4"/>
 *     &lt;enumeration value="WMV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FilmFormateTyp")
@XmlEnum
public enum FilmFormateTyp {

    AVI("AVI"),
    MPG("MPG"),
    MOV("MOV"),
    QT("QT"),
    QTL("QTL"),
    RM("RM"),
    RV("RV"),
    MPE("MPE"),
    MPEG("MPEG"),
    @XmlEnumValue("MP4")
    MP_4("MP4"),
    WMV("WMV");
    private final String value;

    FilmFormateTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FilmFormateTyp fromValue(String v) {
        for (FilmFormateTyp c: FilmFormateTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
