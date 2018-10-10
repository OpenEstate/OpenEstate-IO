
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StellplatzKategorieTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StellplatzKategorieTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="keineAngabe"/&gt;
 *     &lt;enumeration value="Garage"/&gt;
 *     &lt;enumeration value="AussenStellplatz"/&gt;
 *     &lt;enumeration value="Carport"/&gt;
 *     &lt;enumeration value="Duplex"/&gt;
 *     &lt;enumeration value="Parkhaus"/&gt;
 *     &lt;enumeration value="Tiefgarage"/&gt;
 *     &lt;enumeration value="true"/&gt;
 *     &lt;enumeration value="false"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StellplatzKategorieTyp")
@XmlEnum
public enum StellplatzKategorieTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("Garage")
    GARAGE("Garage"),
    @XmlEnumValue("AussenStellplatz")
    AUSSEN_STELLPLATZ("AussenStellplatz"),
    @XmlEnumValue("Carport")
    CARPORT("Carport"),
    @XmlEnumValue("Duplex")
    DUPLEX("Duplex"),
    @XmlEnumValue("Parkhaus")
    PARKHAUS("Parkhaus"),
    @XmlEnumValue("Tiefgarage")
    TIEFGARAGE("Tiefgarage"),

    /**
     * entspricht 'keineAngabe' = Kategorie nicht naeher definiert
     *                         (aus Kompatibilitaetsgruenden, wird in zukuenftigen Versionen nicht mehr unterstuetzt)
     *                     
     * 
     */
    @XmlEnumValue("true")
    TRUE("true"),

    /**
     * entspricht 'keineAngabe' = kein Garage vorhanden
     *                         (aus Kompatibilitaetsgruenden, wird in zukuenftigen Versionen nicht mehr unterstuetzt)
     *                     
     * 
     */
    @XmlEnumValue("false")
    FALSE("false");
    private final String value;

    StellplatzKategorieTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StellplatzKategorieTyp fromValue(String v) {
        for (StellplatzKategorieTyp c: StellplatzKategorieTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
