
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AusbaustufeTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AusbaustufeTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="KeineAngabe"/>
 *     &lt;enumeration value="Bausatzhaus"/>
 *     &lt;enumeration value="Ausbauhaus"/>
 *     &lt;enumeration value="SchluesselfertigMitKeller"/>
 *     &lt;enumeration value="SchluesselfertigOhneBodenplatte"/>
 *     &lt;enumeration value="SchluesselfertigMitBodenplatte"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AusbaustufeTyp")
@XmlEnum
public enum AusbaustufeTyp {

    @XmlEnumValue("KeineAngabe")
    KEINE_ANGABE("KeineAngabe"),
    @XmlEnumValue("Bausatzhaus")
    BAUSATZHAUS("Bausatzhaus"),
    @XmlEnumValue("Ausbauhaus")
    AUSBAUHAUS("Ausbauhaus"),
    @XmlEnumValue("SchluesselfertigMitKeller")
    SCHLUESSELFERTIG_MIT_KELLER("SchluesselfertigMitKeller"),
    @XmlEnumValue("SchluesselfertigOhneBodenplatte")
    SCHLUESSELFERTIG_OHNE_BODENPLATTE("SchluesselfertigOhneBodenplatte"),
    @XmlEnumValue("SchluesselfertigMitBodenplatte")
    SCHLUESSELFERTIG_MIT_BODENPLATTE("SchluesselfertigMitBodenplatte");
    private final String value;

    AusbaustufeTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AusbaustufeTyp fromValue(String v) {
        for (AusbaustufeTyp c: AusbaustufeTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
