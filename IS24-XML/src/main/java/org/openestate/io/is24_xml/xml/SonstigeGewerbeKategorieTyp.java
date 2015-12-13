
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SonstigeGewerbeKategorieTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SonstigeGewerbeKategorieTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Anwesen"/&gt;
 *     &lt;enumeration value="Bauernhof"/&gt;
 *     &lt;enumeration value="Reiterhof"/&gt;
 *     &lt;enumeration value="Weingut"/&gt;
 *     &lt;enumeration value="Werkstatt"/&gt;
 *     &lt;enumeration value="Freizeitanlage"/&gt;
 *     &lt;enumeration value="Gewerbeflaeche"/&gt;
 *     &lt;enumeration value="Spezialobjekt"/&gt;
 *     &lt;enumeration value="Gewerbepark"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SonstigeGewerbeKategorieTyp")
@XmlEnum
public enum SonstigeGewerbeKategorieTyp {

    @XmlEnumValue("Anwesen")
    ANWESEN("Anwesen"),
    @XmlEnumValue("Bauernhof")
    BAUERNHOF("Bauernhof"),
    @XmlEnumValue("Reiterhof")
    REITERHOF("Reiterhof"),
    @XmlEnumValue("Weingut")
    WEINGUT("Weingut"),
    @XmlEnumValue("Werkstatt")
    WERKSTATT("Werkstatt"),
    @XmlEnumValue("Freizeitanlage")
    FREIZEITANLAGE("Freizeitanlage"),
    @XmlEnumValue("Gewerbeflaeche")
    GEWERBEFLAECHE("Gewerbeflaeche"),
    @XmlEnumValue("Spezialobjekt")
    SPEZIALOBJEKT("Spezialobjekt"),
    @XmlEnumValue("Gewerbepark")
    GEWERBEPARK("Gewerbepark");
    private final String value;

    SonstigeGewerbeKategorieTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SonstigeGewerbeKategorieTyp fromValue(String v) {
        for (SonstigeGewerbeKategorieTyp c: SonstigeGewerbeKategorieTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
