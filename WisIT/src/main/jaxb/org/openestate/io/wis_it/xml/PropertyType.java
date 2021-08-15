
package org.openestate.io.wis_it.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * Java enum for &lt;IMMOBILIENART&gt; elements.
 * 
 * <p>Java class for propertyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="propertyType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="bauernhof"/&gt;
 *     &lt;enumeration value="baugrund"/&gt;
 *     &lt;enumeration value="buero"/&gt;
 *     &lt;enumeration value="einfamilienhaus"/&gt;
 *     &lt;enumeration value="garage"/&gt;
 *     &lt;enumeration value="gastgewerbeobjekt"/&gt;
 *     &lt;enumeration value="geschaeft"/&gt;
 *     &lt;enumeration value="gewerbehalle"/&gt;
 *     &lt;enumeration value="kulturgrund"/&gt;
 *     &lt;enumeration value="reihenhaus"/&gt;
 *     &lt;enumeration value="wald"/&gt;
 *     &lt;enumeration value="wohnung"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "propertyType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
public enum PropertyType {

    @XmlEnumValue("bauernhof")
    BAUERNHOF("bauernhof"),
    @XmlEnumValue("baugrund")
    BAUGRUND("baugrund"),
    @XmlEnumValue("buero")
    BUERO("buero"),
    @XmlEnumValue("einfamilienhaus")
    EINFAMILIENHAUS("einfamilienhaus"),
    @XmlEnumValue("garage")
    GARAGE("garage"),
    @XmlEnumValue("gastgewerbeobjekt")
    GASTGEWERBEOBJEKT("gastgewerbeobjekt"),
    @XmlEnumValue("geschaeft")
    GESCHAEFT("geschaeft"),
    @XmlEnumValue("gewerbehalle")
    GEWERBEHALLE("gewerbehalle"),
    @XmlEnumValue("kulturgrund")
    KULTURGRUND("kulturgrund"),
    @XmlEnumValue("reihenhaus")
    REIHENHAUS("reihenhaus"),
    @XmlEnumValue("wald")
    WALD("wald"),
    @XmlEnumValue("wohnung")
    WOHNUNG("wohnung");
    private final String value;

    PropertyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PropertyType fromValue(String v) {
        for (PropertyType c: PropertyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
