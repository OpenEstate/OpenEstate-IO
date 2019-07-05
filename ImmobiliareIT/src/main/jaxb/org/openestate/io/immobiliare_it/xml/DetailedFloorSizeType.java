
package org.openestate.io.immobiliare_it.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for detailedSizeFloorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="detailedSizeFloorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Intermedio"/&gt;
 *     &lt;enumeration value="Interrato"/&gt;
 *     &lt;enumeration value="Seminterrato"/&gt;
 *     &lt;enumeration value="PianoTerra"/&gt;
 *     &lt;enumeration value="Rialzato"/&gt;
 *     &lt;enumeration value="Multipiano"/&gt;
 *     &lt;enumeration value="Ultimo"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "detailedSizeFloorType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
public enum DetailedFloorSizeType {

    @XmlEnumValue("Intermedio")
    INTERMEDIO("Intermedio"),
    @XmlEnumValue("Interrato")
    INTERRATO("Interrato"),
    @XmlEnumValue("Seminterrato")
    SEMINTERRATO("Seminterrato"),
    @XmlEnumValue("PianoTerra")
    PIANO_TERRA("PianoTerra"),
    @XmlEnumValue("Rialzato")
    RIALZATO("Rialzato"),
    @XmlEnumValue("Multipiano")
    MULTIPIANO("Multipiano"),
    @XmlEnumValue("Ultimo")
    ULTIMO("Ultimo");
    private final String value;

    DetailedFloorSizeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DetailedFloorSizeType fromValue(String v) {
        for (DetailedFloorSizeType c: DetailedFloorSizeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
