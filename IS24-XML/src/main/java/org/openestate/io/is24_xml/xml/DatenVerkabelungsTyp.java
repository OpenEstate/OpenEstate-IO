
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatenVerkabelungsTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DatenVerkabelungsTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="keineAngabe"/&gt;
 *     &lt;enumeration value="ja"/&gt;
 *     &lt;enumeration value="true"/&gt;
 *     &lt;enumeration value="nein"/&gt;
 *     &lt;enumeration value="false"/&gt;
 *     &lt;enumeration value="nachVereinbarung"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DatenVerkabelungsTyp")
@XmlEnum
public enum DatenVerkabelungsTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("ja")
    JA("ja"),

    /**
     * entspricht 'ja'
     *             (aus Kompatibilitaetsgruenden, wird in zukuenftigen Versionen nicht mehr unterstuetzt)
     *           
     * 
     */
    @XmlEnumValue("true")
    TRUE("true"),
    @XmlEnumValue("nein")
    NEIN("nein"),

    /**
     * entspricht 'nein'
     *             (aus Kompatibilitaetsgruenden, wird in zukuenftigen Versionen nicht mehr unterstuetzt)
     *           
     * 
     */
    @XmlEnumValue("false")
    FALSE("false"),
    @XmlEnumValue("nachVereinbarung")
    NACH_VEREINBARUNG("nachVereinbarung");
    private final String value;

    DatenVerkabelungsTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DatenVerkabelungsTyp fromValue(String v) {
        for (DatenVerkabelungsTyp c: DatenVerkabelungsTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
