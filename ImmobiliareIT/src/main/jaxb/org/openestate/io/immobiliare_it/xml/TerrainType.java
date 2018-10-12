
package org.openestate.io.immobiliare_it.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for terrainType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="terrainType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="seminativo"/&gt;
 *     &lt;enumeration value="seminativo irriguo"/&gt;
 *     &lt;enumeration value="seminativo arborato"/&gt;
 *     &lt;enumeration value="seminativo arborato irriguo"/&gt;
 *     &lt;enumeration value="prato"/&gt;
 *     &lt;enumeration value="prato irriguo"/&gt;
 *     &lt;enumeration value="prato arborato"/&gt;
 *     &lt;enumeration value="prato a marcita"/&gt;
 *     &lt;enumeration value="risaia stabile"/&gt;
 *     &lt;enumeration value="pascolo"/&gt;
 *     &lt;enumeration value="pascolo arborato"/&gt;
 *     &lt;enumeration value="pascolo cespugliato"/&gt;
 *     &lt;enumeration value="giardino"/&gt;
 *     &lt;enumeration value="orto"/&gt;
 *     &lt;enumeration value="orto irriguo"/&gt;
 *     &lt;enumeration value="agrumeto"/&gt;
 *     &lt;enumeration value="vigneto"/&gt;
 *     &lt;enumeration value="uliveto"/&gt;
 *     &lt;enumeration value="frutteto"/&gt;
 *     &lt;enumeration value="gelseto"/&gt;
 *     &lt;enumeration value="colture speciali"/&gt;
 *     &lt;enumeration value="castagneto da frutto"/&gt;
 *     &lt;enumeration value="canneto"/&gt;
 *     &lt;enumeration value="bosco alto fusto"/&gt;
 *     &lt;enumeration value="bosco ceduo"/&gt;
 *     &lt;enumeration value="bosco misto"/&gt;
 *     &lt;enumeration value="incolto produttivo"/&gt;
 *     &lt;enumeration value="incolto sterile"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "terrainType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:48:12+02:00", comments = "JAXB RI v2.2.11")
public enum TerrainType {

    @XmlEnumValue("seminativo")
    SEMINATIVO("seminativo"),
    @XmlEnumValue("seminativo irriguo")
    SEMINATIVO_IRRIGUO("seminativo irriguo"),
    @XmlEnumValue("seminativo arborato")
    SEMINATIVO_ARBORATO("seminativo arborato"),
    @XmlEnumValue("seminativo arborato irriguo")
    SEMINATIVO_ARBORATO_IRRIGUO("seminativo arborato irriguo"),
    @XmlEnumValue("prato")
    PRATO("prato"),
    @XmlEnumValue("prato irriguo")
    PRATO_IRRIGUO("prato irriguo"),
    @XmlEnumValue("prato arborato")
    PRATO_ARBORATO("prato arborato"),
    @XmlEnumValue("prato a marcita")
    PRATO_A_MARCITA("prato a marcita"),
    @XmlEnumValue("risaia stabile")
    RISAIA_STABILE("risaia stabile"),
    @XmlEnumValue("pascolo")
    PASCOLO("pascolo"),
    @XmlEnumValue("pascolo arborato")
    PASCOLO_ARBORATO("pascolo arborato"),
    @XmlEnumValue("pascolo cespugliato")
    PASCOLO_CESPUGLIATO("pascolo cespugliato"),
    @XmlEnumValue("giardino")
    GIARDINO("giardino"),
    @XmlEnumValue("orto")
    ORTO("orto"),
    @XmlEnumValue("orto irriguo")
    ORTO_IRRIGUO("orto irriguo"),
    @XmlEnumValue("agrumeto")
    AGRUMETO("agrumeto"),
    @XmlEnumValue("vigneto")
    VIGNETO("vigneto"),
    @XmlEnumValue("uliveto")
    ULIVETO("uliveto"),
    @XmlEnumValue("frutteto")
    FRUTTETO("frutteto"),
    @XmlEnumValue("gelseto")
    GELSETO("gelseto"),
    @XmlEnumValue("colture speciali")
    COLTURE_SPECIALI("colture speciali"),
    @XmlEnumValue("castagneto da frutto")
    CASTAGNETO_DA_FRUTTO("castagneto da frutto"),
    @XmlEnumValue("canneto")
    CANNETO("canneto"),
    @XmlEnumValue("bosco alto fusto")
    BOSCO_ALTO_FUSTO("bosco alto fusto"),
    @XmlEnumValue("bosco ceduo")
    BOSCO_CEDUO("bosco ceduo"),
    @XmlEnumValue("bosco misto")
    BOSCO_MISTO("bosco misto"),
    @XmlEnumValue("incolto produttivo")
    INCOLTO_PRODUTTIVO("incolto produttivo"),
    @XmlEnumValue("incolto sterile")
    INCOLTO_STERILE("incolto sterile");
    private final String value;

    TerrainType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TerrainType fromValue(String v) {
        for (TerrainType c: TerrainType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
