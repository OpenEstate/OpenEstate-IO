
package org.openestate.io.is24_xml.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilmFormateTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FilmFormateTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AVI"/&gt;
 *     &lt;enumeration value="MPG"/&gt;
 *     &lt;enumeration value="MOV"/&gt;
 *     &lt;enumeration value="QT"/&gt;
 *     &lt;enumeration value="QTL"/&gt;
 *     &lt;enumeration value="RM"/&gt;
 *     &lt;enumeration value="RV"/&gt;
 *     &lt;enumeration value="MPE"/&gt;
 *     &lt;enumeration value="MPEG"/&gt;
 *     &lt;enumeration value="MP4"/&gt;
 *     &lt;enumeration value="WMV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FilmFormateTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
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
