
package org.openestate.io.immobiliare_it.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ownershipType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ownershipType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="intera propriet\u00e0"/&gt;
 *     &lt;enumeration value="nuda propriet\u00e0"/&gt;
 *     &lt;enumeration value="parziale propriet\u00e0"/&gt;
 *     &lt;enumeration value="usufrutto"/&gt;
 *     &lt;enumeration value="multipropriet\u00e0"/&gt;
 *     &lt;enumeration value="diritto di superficie"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ownershipType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
public enum OwnershipType {

    @XmlEnumValue("intera propriet\u00e0")
    INTERA_PROPRIETA("intera propriet\u00e0"),
    @XmlEnumValue("nuda propriet\u00e0")
    NUDA_PROPRIETA("nuda propriet\u00e0"),
    @XmlEnumValue("parziale propriet\u00e0")
    PARZIALE("parziale propriet\u00e0"),
    @XmlEnumValue("usufrutto")
    USUFRUTTO("usufrutto"),
    @XmlEnumValue("multipropriet\u00e0")
    MULTIPROPRIETA("multipropriet\u00e0"),
    @XmlEnumValue("diritto di superficie")
    DIRITTO_DI_SUPERFICIE("diritto di superficie");
    private final String value;

    OwnershipType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OwnershipType fromValue(String v) {
        for (OwnershipType c: OwnershipType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
