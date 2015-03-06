
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propertyTypeProject.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="propertyTypeProject">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Appartamento"/>
 *     &lt;enumeration value="Negozio"/>
 *     &lt;enumeration value="Ufficio"/>
 *     &lt;enumeration value="Box Auto"/>
 *     &lt;enumeration value="Villa"/>
 *     &lt;enumeration value="Villetta"/>
 *     &lt;enumeration value="Capannone"/>
 *     &lt;enumeration value="Loft"/>
 *     &lt;enumeration value="Magazzino"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "propertyTypeProject")
@XmlEnum
public enum PropertyTypeProject {

    @XmlEnumValue("Appartamento")
    APPARTAMENTO("Appartamento"),
    @XmlEnumValue("Negozio")
    NEGOZIO("Negozio"),
    @XmlEnumValue("Ufficio")
    UFFICIO("Ufficio"),
    @XmlEnumValue("Box Auto")
    BOX_AUTO("Box Auto"),
    @XmlEnumValue("Villa")
    VILLA("Villa"),
    @XmlEnumValue("Villetta")
    VILLETTA("Villetta"),
    @XmlEnumValue("Capannone")
    CAPANNONE("Capannone"),
    @XmlEnumValue("Loft")
    LOFT("Loft"),
    @XmlEnumValue("Magazzino")
    MAGAZZINO("Magazzino");
    private final String value;

    PropertyTypeProject(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PropertyTypeProject fromValue(String v) {
        for (PropertyTypeProject c: PropertyTypeProject.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
