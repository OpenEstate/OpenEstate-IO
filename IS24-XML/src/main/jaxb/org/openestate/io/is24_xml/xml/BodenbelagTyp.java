
package org.openestate.io.is24_xml.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BodenbelagTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BodenbelagTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="keineAngabe"/&gt;
 *     &lt;enumeration value="Beton"/&gt;
 *     &lt;enumeration value="Epoxidharz"/&gt;
 *     &lt;enumeration value="Fliesen"/&gt;
 *     &lt;enumeration value="Laminat"/&gt;
 *     &lt;enumeration value="Dielen"/&gt;
 *     &lt;enumeration value="Parkett"/&gt;
 *     &lt;enumeration value="PVC"/&gt;
 *     &lt;enumeration value="Teppichboden"/&gt;
 *     &lt;enumeration value="TeppichbodenAntistatisch"/&gt;
 *     &lt;enumeration value="TeppichfliesenStuhlrollenfest"/&gt;
 *     &lt;enumeration value="Stein"/&gt;
 *     &lt;enumeration value="NachWunsch"/&gt;
 *     &lt;enumeration value="OhneBodenbelag"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BodenbelagTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
public enum BodenbelagTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("Beton")
    BETON("Beton"),
    @XmlEnumValue("Epoxidharz")
    EPOXIDHARZ("Epoxidharz"),
    @XmlEnumValue("Fliesen")
    FLIESEN("Fliesen"),
    @XmlEnumValue("Laminat")
    LAMINAT("Laminat"),
    @XmlEnumValue("Dielen")
    DIELEN("Dielen"),
    @XmlEnumValue("Parkett")
    PARKETT("Parkett"),
    PVC("PVC"),
    @XmlEnumValue("Teppichboden")
    TEPPICHBODEN("Teppichboden"),
    @XmlEnumValue("TeppichbodenAntistatisch")
    TEPPICHBODEN_ANTISTATISCH("TeppichbodenAntistatisch"),
    @XmlEnumValue("TeppichfliesenStuhlrollenfest")
    TEPPICHFLIESEN_STUHLROLLENFEST("TeppichfliesenStuhlrollenfest"),
    @XmlEnumValue("Stein")
    STEIN("Stein"),
    @XmlEnumValue("NachWunsch")
    NACH_WUNSCH("NachWunsch"),
    @XmlEnumValue("OhneBodenbelag")
    OHNE_BODENBELAG("OhneBodenbelag");
    private final String value;

    BodenbelagTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BodenbelagTyp fromValue(String v) {
        for (BodenbelagTyp c: BodenbelagTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
