
package org.openestate.io.is24_xml.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AusbaustufeTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AusbaustufeTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="KeineAngabe"/&gt;
 *     &lt;enumeration value="Bausatzhaus"/&gt;
 *     &lt;enumeration value="Ausbauhaus"/&gt;
 *     &lt;enumeration value="SchluesselfertigMitKeller"/&gt;
 *     &lt;enumeration value="SchluesselfertigOhneBodenplatte"/&gt;
 *     &lt;enumeration value="SchluesselfertigMitBodenplatte"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AusbaustufeTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
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
