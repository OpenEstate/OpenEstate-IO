
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MindestmietdauerTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MindestmietdauerTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="1"/>
 *     &lt;enumeration value="2"/>
 *     &lt;enumeration value="3"/>
 *     &lt;enumeration value="4"/>
 *     &lt;enumeration value="5"/>
 *     &lt;enumeration value="6"/>
 *     &lt;enumeration value="7"/>
 *     &lt;enumeration value="8"/>
 *     &lt;enumeration value="9"/>
 *     &lt;enumeration value="10"/>
 *     &lt;enumeration value="11"/>
 *     &lt;enumeration value="12+"/>
 *     &lt;enumeration value="Unbefristet"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MindestmietdauerTyp")
@XmlEnum
public enum MindestmietdauerTyp {

    @XmlEnumValue("1")
    MONTHS_01("1"),
    @XmlEnumValue("2")
    MONTHS_02("2"),
    @XmlEnumValue("3")
    MONTHS_03("3"),
    @XmlEnumValue("4")
    MONTHS_04("4"),
    @XmlEnumValue("5")
    MONTHS_05("5"),
    @XmlEnumValue("6")
    MONTHS_06("6"),
    @XmlEnumValue("7")
    MONTHS_07("7"),
    @XmlEnumValue("8")
    MONTHS_08("8"),
    @XmlEnumValue("9")
    MONTHS_09("9"),
    @XmlEnumValue("10")
    MONTHS_10("10"),
    @XmlEnumValue("11")
    MONTHS_11("11"),
    @XmlEnumValue("12+")
    MONTHS_12_PLUS("12+"),
    @XmlEnumValue("Unbefristet")
    UNBEFRISTET("Unbefristet");
    private final String value;

    MindestmietdauerTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MindestmietdauerTyp fromValue(String v) {
        for (MindestmietdauerTyp c: MindestmietdauerTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
