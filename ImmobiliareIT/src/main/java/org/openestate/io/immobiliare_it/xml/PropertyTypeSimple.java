
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propertyTypeSimple.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="propertyTypeSimple"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Appartamento"/&gt;
 *     &lt;enumeration value="Attico"/&gt;
 *     &lt;enumeration value="Mansarda"/&gt;
 *     &lt;enumeration value="Garage"/&gt;
 *     &lt;enumeration value="Casa Indipendente"/&gt;
 *     &lt;enumeration value="Palazzo"/&gt;
 *     &lt;enumeration value="Stabile"/&gt;
 *     &lt;enumeration value="Rustico"/&gt;
 *     &lt;enumeration value="Casale"/&gt;
 *     &lt;enumeration value="Villa"/&gt;
 *     &lt;enumeration value="Villetta a schiera"/&gt;
 *     &lt;enumeration value="Loft"/&gt;
 *     &lt;enumeration value="Open Space"/&gt;
 *     &lt;enumeration value="Multipropriet\u00e0"/&gt;
 *     &lt;enumeration value="Villetta"/&gt;
 *     &lt;enumeration value="Agriturismo"/&gt;
 *     &lt;enumeration value="Bed and Breakfast"/&gt;
 *     &lt;enumeration value="Barca"/&gt;
 *     &lt;enumeration value="Bungalow"/&gt;
 *     &lt;enumeration value="Chalet"/&gt;
 *     &lt;enumeration value="Baita"/&gt;
 *     &lt;enumeration value="Hotel"/&gt;
 *     &lt;enumeration value="Parco Vacanze"/&gt;
 *     &lt;enumeration value="Residence"/&gt;
 *     &lt;enumeration value="Roulotte"/&gt;
 *     &lt;enumeration value="Stanza"/&gt;
 *     &lt;enumeration value="Camera"/&gt;
 *     &lt;enumeration value="Casa per ferie (gruppi)"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "propertyTypeSimple")
@XmlEnum
public enum PropertyTypeSimple {

    @XmlEnumValue("Appartamento")
    APPARTAMENTO("Appartamento"),
    @XmlEnumValue("Attico")
    ATTICO("Attico"),
    @XmlEnumValue("Mansarda")
    MANSARDA("Mansarda"),
    @XmlEnumValue("Garage")
    GARAGE("Garage"),
    @XmlEnumValue("Casa Indipendente")
    CASA_INDIPENDENTE("Casa Indipendente"),
    @XmlEnumValue("Palazzo")
    PALAZZO("Palazzo"),
    @XmlEnumValue("Stabile")
    STABILE("Stabile"),
    @XmlEnumValue("Rustico")
    RUSTICO("Rustico"),
    @XmlEnumValue("Casale")
    CASALE("Casale"),
    @XmlEnumValue("Villa")
    VILLA("Villa"),
    @XmlEnumValue("Villetta a schiera")
    VILLETTA_A_SCHIERA("Villetta a schiera"),
    @XmlEnumValue("Loft")
    LOFT("Loft"),
    @XmlEnumValue("Open Space")
    OPEN_SPACE("Open Space"),
    @XmlEnumValue("Multipropriet\u00e0")
    MULTIPROPRIET\u00c0("Multipropriet\u00e0"),
    @XmlEnumValue("Villetta")
    VILLETTA("Villetta"),
    @XmlEnumValue("Agriturismo")
    AGRITURISMO("Agriturismo"),
    @XmlEnumValue("Bed and Breakfast")
    BED_AND_BREAKFAST("Bed and Breakfast"),
    @XmlEnumValue("Barca")
    BARCA("Barca"),
    @XmlEnumValue("Bungalow")
    BUNGALOW("Bungalow"),
    @XmlEnumValue("Chalet")
    CHALET("Chalet"),
    @XmlEnumValue("Baita")
    BAITA("Baita"),
    @XmlEnumValue("Hotel")
    HOTEL("Hotel"),
    @XmlEnumValue("Parco Vacanze")
    PARCO_VACANZE("Parco Vacanze"),
    @XmlEnumValue("Residence")
    RESIDENCE("Residence"),
    @XmlEnumValue("Roulotte")
    ROULOTTE("Roulotte"),
    @XmlEnumValue("Stanza")
    STANZA("Stanza"),
    @XmlEnumValue("Camera")
    CAMERA("Camera"),
    @XmlEnumValue("Casa per ferie (gruppi)")
    CASA_PER_FERIE_GRUPPI("Casa per ferie (gruppi)"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PropertyTypeSimple(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PropertyTypeSimple fromValue(String v) {
        for (PropertyTypeSimple c: PropertyTypeSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
