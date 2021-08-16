
package org.openestate.io.is24_xml.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HausKategorienTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HausKategorienTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="keineAngabe"/&gt;
 *     &lt;enumeration value="Bungalow"/&gt;
 *     &lt;enumeration value="Doppelhaushaelfte"/&gt;
 *     &lt;enumeration value="Einfamilienhaus"/&gt;
 *     &lt;enumeration value="Mehrfamilienhaus"/&gt;
 *     &lt;enumeration value="Villa"/&gt;
 *     &lt;enumeration value="Reihenhaus"/&gt;
 *     &lt;enumeration value="Reihenmittelhaus"/&gt;
 *     &lt;enumeration value="Reiheneckhaus"/&gt;
 *     &lt;enumeration value="Zweifamilienhaus"/&gt;
 *     &lt;enumeration value="Bauernhaus"/&gt;
 *     &lt;enumeration value="Sonstiges"/&gt;
 *     &lt;enumeration value="BesondereImmobilie"/&gt;
 *     &lt;enumeration value="BurgSchloss"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HausKategorienTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
public enum HausKategorienTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("Bungalow")
    BUNGALOW("Bungalow"),
    @XmlEnumValue("Doppelhaushaelfte")
    DOPPELHAUSHAELFTE("Doppelhaushaelfte"),
    @XmlEnumValue("Einfamilienhaus")
    EINFAMILIENHAUS("Einfamilienhaus"),
    @XmlEnumValue("Mehrfamilienhaus")
    MEHRFAMILIENHAUS("Mehrfamilienhaus"),
    @XmlEnumValue("Villa")
    VILLA("Villa"),

    /**
     * aus Kompatibilitaetsgruenden weiter vorhanden: Benutze stattdessen
     *                         'Reihenmittelhaus' oder 'Reiheneckhaus'
     *                         (wird in zukuenftigen Versionen nicht mehr unterstuetzt)
     *                     
     * 
     */
    @XmlEnumValue("Reihenhaus")
    REIHENHAUS("Reihenhaus"),
    @XmlEnumValue("Reihenmittelhaus")
    REIHENMITTELHAUS("Reihenmittelhaus"),
    @XmlEnumValue("Reiheneckhaus")
    REIHENECKHAUS("Reiheneckhaus"),

    /**
     * aus Kompatibilitaetsgruenden weiter vorhanden: Benutze stattdessen
     *                         'Mehrfamilienhaus'
     *                         (wird in zukuenftigen Versionen nicht mehr unterstuetzt)
     *                     
     * 
     */
    @XmlEnumValue("Zweifamilienhaus")
    ZWEIFAMILIENHAUS("Zweifamilienhaus"),
    @XmlEnumValue("Bauernhaus")
    BAUERNHAUS("Bauernhaus"),

    /**
     * Umfasst: Wohnimmobilie (sonstige)
     * 
     */
    @XmlEnumValue("Sonstiges")
    SONSTIGES("Sonstiges"),
    @XmlEnumValue("BesondereImmobilie")
    BESONDERE_IMMOBILIE("BesondereImmobilie"),
    @XmlEnumValue("BurgSchloss")
    BURG_SCHLOSS("BurgSchloss");
    private final String value;

    HausKategorienTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HausKategorienTyp fromValue(String v) {
        for (HausKategorienTyp c: HausKategorienTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
