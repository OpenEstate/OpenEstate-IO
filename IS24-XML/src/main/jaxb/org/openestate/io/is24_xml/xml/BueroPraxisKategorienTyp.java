
package org.openestate.io.is24_xml.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BueroPraxisKategorienTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BueroPraxisKategorienTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="keineAngabe"/&gt;
 *     &lt;enumeration value="Loft"/&gt;
 *     &lt;enumeration value="Atelier"/&gt;
 *     &lt;enumeration value="Buero"/&gt;
 *     &lt;enumeration value="BueroEtage"/&gt;
 *     &lt;enumeration value="Buerohaus"/&gt;
 *     &lt;enumeration value="Buerozentrum"/&gt;
 *     &lt;enumeration value="BueroUndLagerGebaeude"/&gt;
 *     &lt;enumeration value="Praxis"/&gt;
 *     &lt;enumeration value="PraxisEtage"/&gt;
 *     &lt;enumeration value="PraxisHaus"/&gt;
 *     &lt;enumeration value="GewerbeZentrum"/&gt;
 *     &lt;enumeration value="WohnUndGeschaeftsgebaeude"/&gt;
 *     &lt;enumeration value="BueroUndGeschaeftsgebaeude"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BueroPraxisKategorienTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
public enum BueroPraxisKategorienTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("Loft")
    LOFT("Loft"),
    @XmlEnumValue("Atelier")
    ATELIER("Atelier"),
    @XmlEnumValue("Buero")
    BUERO("Buero"),
    @XmlEnumValue("BueroEtage")
    BUERO_ETAGE("BueroEtage"),
    @XmlEnumValue("Buerohaus")
    BUEROHAUS("Buerohaus"),
    @XmlEnumValue("Buerozentrum")
    BUEROZENTRUM("Buerozentrum"),
    @XmlEnumValue("BueroUndLagerGebaeude")
    BUERO_UND_LAGER_GEBAEUDE("BueroUndLagerGebaeude"),
    @XmlEnumValue("Praxis")
    PRAXIS("Praxis"),
    @XmlEnumValue("PraxisEtage")
    PRAXIS_ETAGE("PraxisEtage"),
    @XmlEnumValue("PraxisHaus")
    PRAXIS_HAUS("PraxisHaus"),
    @XmlEnumValue("GewerbeZentrum")
    GEWERBE_ZENTRUM("GewerbeZentrum"),
    @XmlEnumValue("WohnUndGeschaeftsgebaeude")
    WOHN_UND_GESCHAEFTSGEBAEUDE("WohnUndGeschaeftsgebaeude"),
    @XmlEnumValue("BueroUndGeschaeftsgebaeude")
    BUERO_UND_GESCHAEFTSGEBAEUDE("BueroUndGeschaeftsgebaeude");
    private final String value;

    BueroPraxisKategorienTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BueroPraxisKategorienTyp fromValue(String v) {
        for (BueroPraxisKategorienTyp c: BueroPraxisKategorienTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
