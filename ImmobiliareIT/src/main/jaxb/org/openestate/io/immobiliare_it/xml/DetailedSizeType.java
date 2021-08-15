
package org.openestate.io.immobiliare_it.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for detailedSizeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="detailedSizeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Abitazione"/&gt;
 *     &lt;enumeration value="Ufficio"/&gt;
 *     &lt;enumeration value="Studio"/&gt;
 *     &lt;enumeration value="Negozio"/&gt;
 *     &lt;enumeration value="Magazzino"/&gt;
 *     &lt;enumeration value="Garage"/&gt;
 *     &lt;enumeration value="Cantina"/&gt;
 *     &lt;enumeration value="Soffitta"/&gt;
 *     &lt;enumeration value="Balcone"/&gt;
 *     &lt;enumeration value="Terrazzo"/&gt;
 *     &lt;enumeration value="Giardino"/&gt;
 *     &lt;enumeration value="Terreno"/&gt;
 *     &lt;enumeration value="Parti comuni"/&gt;
 *     &lt;enumeration value="Altro"/&gt;
 *     &lt;enumeration value="Mansarda"/&gt;
 *     &lt;enumeration value="Capannone"/&gt;
 *     &lt;enumeration value="Laboratorio"/&gt;
 *     &lt;enumeration value="Posti auto"/&gt;
 *     &lt;enumeration value="Soppalco"/&gt;
 *     &lt;enumeration value="Esterno"/&gt;
 *     &lt;enumeration value="Parcheggio"/&gt;
 *     &lt;enumeration value="Albergo/hotel"/&gt;
 *     &lt;enumeration value="Posto moto"/&gt;
 *     &lt;enumeration value="Posto barca"/&gt;
 *     &lt;enumeration value="Posto camper o roulotte"/&gt;
 *     &lt;enumeration value="Autorimessa"/&gt;
 *     &lt;enumeration value="Centralina"/&gt;
 *     &lt;enumeration value="Podere o tenuta"/&gt;
 *     &lt;enumeration value="Filiale bancaria"/&gt;
 *     &lt;enumeration value="Scuderia"/&gt;
 *     &lt;enumeration value="Casa di cura"/&gt;
 *     &lt;enumeration value="Stabilimento balneare"/&gt;
 *     &lt;enumeration value="Azienda agricola"/&gt;
 *     &lt;enumeration value="Impianti sportivi"/&gt;
 *     &lt;enumeration value="Stazione di servizio"/&gt;
 *     &lt;enumeration value="Autorimessa"/&gt;
 *     &lt;enumeration value="Autolavaggio"/&gt;
 *     &lt;enumeration value="Impianti sportivi"/&gt;
 *     &lt;enumeration value="Stabilimento balneare"/&gt;
 *     &lt;enumeration value="Campeggio"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "detailedSizeType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
public enum DetailedSizeType {

    @XmlEnumValue("Abitazione")
    ABITAZIONE("Abitazione"),
    @XmlEnumValue("Ufficio")
    UFFICIO("Ufficio"),
    @XmlEnumValue("Studio")
    STUDIO("Studio"),
    @XmlEnumValue("Negozio")
    NEGOZIO("Negozio"),
    @XmlEnumValue("Magazzino")
    MAGAZZINO("Magazzino"),
    @XmlEnumValue("Garage")
    GARAGE("Garage"),
    @XmlEnumValue("Cantina")
    CANTINA("Cantina"),
    @XmlEnumValue("Soffitta")
    SOFFITTA("Soffitta"),
    @XmlEnumValue("Balcone")
    BALCONE("Balcone"),
    @XmlEnumValue("Terrazzo")
    TERRAZZO("Terrazzo"),
    @XmlEnumValue("Giardino")
    GIARDINO("Giardino"),
    @XmlEnumValue("Terreno")
    TERRENO("Terreno"),
    @XmlEnumValue("Parti comuni")
    PARTI_COMUNI("Parti comuni"),
    @XmlEnumValue("Altro")
    ALTRO("Altro"),
    @XmlEnumValue("Mansarda")
    MANSARDA("Mansarda"),
    @XmlEnumValue("Capannone")
    CAPANNONE("Capannone"),
    @XmlEnumValue("Laboratorio")
    LABORATORIO("Laboratorio"),
    @XmlEnumValue("Posti auto")
    POSTI_AUTO("Posti auto"),
    @XmlEnumValue("Soppalco")
    SOPPALCO("Soppalco"),
    @XmlEnumValue("Esterno")
    ESTERNO("Esterno"),
    @XmlEnumValue("Parcheggio")
    PARCHEGGIO("Parcheggio"),
    @XmlEnumValue("Albergo/hotel")
    ALBERGO_HOTEL("Albergo/hotel"),
    @XmlEnumValue("Posto moto")
    POSTO_MOTO("Posto moto"),
    @XmlEnumValue("Posto barca")
    POSTO_BARCA("Posto barca"),
    @XmlEnumValue("Posto camper o roulotte")
    POSTO_CAMPER_O_ROULOTTE("Posto camper o roulotte"),
    @XmlEnumValue("Autorimessa")
    AUTORIMESSA("Autorimessa"),
    @XmlEnumValue("Centralina")
    CENTRALINA("Centralina"),
    @XmlEnumValue("Podere o tenuta")
    PODERE_O_TENUTA("Podere o tenuta"),
    @XmlEnumValue("Filiale bancaria")
    FILIALE_BANCARIA("Filiale bancaria"),
    @XmlEnumValue("Scuderia")
    SCUDERIA("Scuderia"),
    @XmlEnumValue("Casa di cura")
    CASA_DI_CURA("Casa di cura"),
    @XmlEnumValue("Stabilimento balneare")
    STABILIMENTO_BALNEARE("Stabilimento balneare"),
    @XmlEnumValue("Azienda agricola")
    AZIENDA_AGRICOLA("Azienda agricola"),
    @XmlEnumValue("Impianti sportivi")
    IMPIANTI_SPORTIVI("Impianti sportivi"),
    @XmlEnumValue("Stazione di servizio")
    STAZIONE_DI_SERVIZIO("Stazione di servizio"),
    @XmlEnumValue("Autolavaggio")
    AUTOLAVAGGIO("Autolavaggio"),
    @XmlEnumValue("Campeggio")
    CAMPEGGIO("Campeggio");
    private final String value;

    DetailedSizeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DetailedSizeType fromValue(String v) {
        for (DetailedSizeType c: DetailedSizeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
