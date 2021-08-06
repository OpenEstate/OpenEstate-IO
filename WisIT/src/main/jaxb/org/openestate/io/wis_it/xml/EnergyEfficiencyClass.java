
package org.openestate.io.wis_it.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * Java enum for &lt;ENERGIEEFFIZIENZKLASSE&gt; elements.
 * 
 * <p>Java class for energyEfficiencyClass.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="energyEfficiencyClass"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="A gold"/&gt;
 *     &lt;enumeration value="A Gold"/&gt;
 *     &lt;enumeration value="A+++"/&gt;
 *     &lt;enumeration value="A++"/&gt;
 *     &lt;enumeration value="A+"/&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="G"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "energyEfficiencyClass")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
public enum EnergyEfficiencyClass {

    @XmlEnumValue("A gold")
    A_GOLD("A gold"),
    @XmlEnumValue("A Gold")
    A_GOLD2("A Gold"),
    @XmlEnumValue("A+++")
    A_PLUS_PLUS_PLUS("A+++"),
    @XmlEnumValue("A++")
    A_PLUS_PLUS("A++"),
    @XmlEnumValue("A+")
    A_PLUS("A+"),
    A("A"),
    B("B"),
    C("C"),
    D("D"),
    E("E"),
    F("F"),
    G("G");
    private final String value;

    EnergyEfficiencyClass(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnergyEfficiencyClass fromValue(String v) {
        for (EnergyEfficiencyClass c: EnergyEfficiencyClass.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
