
package org.openestate.io.wis_it.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * Java enum for &lt;KLIMAHAUS&gt; elements.
 * 
 * <p>Java class for energyStandard.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="energyStandard"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="B"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "energyStandard")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
public enum EnergyStandard {

    A,
    B;

    public String value() {
        return name();
    }

    public static EnergyStandard fromValue(String v) {
        return valueOf(v);
    }

}
