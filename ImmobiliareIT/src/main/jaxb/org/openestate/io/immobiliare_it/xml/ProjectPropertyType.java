
package org.openestate.io.immobiliare_it.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propertyTypeProject.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="propertyTypeProject"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Attico"/&gt;
 *     &lt;enumeration value="Appartamento"/&gt;
 *     &lt;enumeration value="Negozio"/&gt;
 *     &lt;enumeration value="Ufficio"/&gt;
 *     &lt;enumeration value="Box Auto"/&gt;
 *     &lt;enumeration value="Villa"/&gt;
 *     &lt;enumeration value="Villetta"/&gt;
 *     &lt;enumeration value="Capannone"/&gt;
 *     &lt;enumeration value="Loft"/&gt;
 *     &lt;enumeration value="Magazzino"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "propertyTypeProject")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
public enum ProjectPropertyType {

    @XmlEnumValue("Attico")
    ATTICO("Attico"),
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

    ProjectPropertyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProjectPropertyType fromValue(String v) {
        for (ProjectPropertyType c: ProjectPropertyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
