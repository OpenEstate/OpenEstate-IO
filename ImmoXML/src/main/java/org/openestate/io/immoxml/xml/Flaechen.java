
package org.openestate.io.immoxml.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.immoxml.de}wohnflaeche" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}nutzflaeche" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}gesamtflaeche" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}ladenflaeche" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}lagerflaeche" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}verkaufsflaeche" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}freiflaeche" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}bueroflaeche" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}bueroteilflaeche" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}fensterfront" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}verwaltungsflaeche" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}gastroflaeche" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}grz" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}gfz" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}bmz" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}bgf" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}grundstuecksflaeche" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}sonstflaeche" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}anzahl_zimmer" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}anzahl_schlafzimmer" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}anzahl_badezimmer" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}anzahl_sep_wc" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}anzahl_balkon_terrassen" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}balkon_terrasse_flaeche" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}anzahl_wohn_schlafzimmer" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}gartenflaeche" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}kellerflaeche" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}fensterfront_qm" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}grundstuecksfront" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}dachbodenflaeche" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}teilbar_ab" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}beheizbare_flaeche" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}anzahl_stellplaetze" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}plaetze_gastraum" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}anzahl_betten" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}anzahl_tagungsraeume" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}vermietbare_flaeche" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}anzahl_wohneinheiten" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}anzahl_gewerbeeinheiten" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}einliegerwohnung" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}user_defined_simplefield" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}user_defined_anyfield" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "wohnflaeche",
    "nutzflaeche",
    "gesamtflaeche",
    "ladenflaeche",
    "lagerflaeche",
    "verkaufsflaeche",
    "freiflaeche",
    "bueroflaeche",
    "bueroteilflaeche",
    "fensterfront",
    "verwaltungsflaeche",
    "gastroflaeche",
    "grz",
    "gfz",
    "bmz",
    "bgf",
    "grundstuecksflaeche",
    "sonstflaeche",
    "anzahlZimmer",
    "anzahlSchlafzimmer",
    "anzahlBadezimmer",
    "anzahlSepWc",
    "anzahlBalkonTerrassen",
    "balkonTerrasseFlaeche",
    "anzahlWohnSchlafzimmer",
    "gartenflaeche",
    "kellerflaeche",
    "fensterfrontQm",
    "grundstuecksfront",
    "dachbodenflaeche",
    "teilbarAb",
    "beheizbareFlaeche",
    "anzahlStellplaetze",
    "plaetzeGastraum",
    "anzahlBetten",
    "anzahlTagungsraeume",
    "vermietbareFlaeche",
    "anzahlWohneinheiten",
    "anzahlGewerbeeinheiten",
    "einliegerwohnung",
    "userDefinedSimplefield",
    "userDefinedAnyfield"
})
@XmlRootElement(name = "flaechen")
public class Flaechen
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double wohnflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double nutzflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double gesamtflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double ladenflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double lagerflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double verkaufsflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double freiflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double bueroflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double bueroteilflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double fensterfront;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double verwaltungsflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double gastroflaeche;
    protected String grz;
    protected String gfz;
    protected String bmz;
    protected String bgf;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double grundstuecksflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double sonstflaeche;
    @XmlElement(name = "anzahl_zimmer", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double anzahlZimmer;
    @XmlElement(name = "anzahl_schlafzimmer", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double anzahlSchlafzimmer;
    @XmlElement(name = "anzahl_badezimmer", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double anzahlBadezimmer;
    @XmlElement(name = "anzahl_sep_wc", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double anzahlSepWc;
    @XmlElement(name = "anzahl_balkon_terrassen", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double anzahlBalkonTerrassen;
    @XmlElement(name = "balkon_terrasse_flaeche", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double balkonTerrasseFlaeche;
    @XmlElement(name = "anzahl_wohn_schlafzimmer", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double anzahlWohnSchlafzimmer;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double gartenflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double kellerflaeche;
    @XmlElement(name = "fensterfront_qm", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double fensterfrontQm;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double grundstuecksfront;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double dachbodenflaeche;
    @XmlElement(name = "teilbar_ab", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double teilbarAb;
    @XmlElement(name = "beheizbare_flaeche", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double beheizbareFlaeche;
    @XmlElement(name = "anzahl_stellplaetze", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double anzahlStellplaetze;
    @XmlElement(name = "plaetze_gastraum", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double plaetzeGastraum;
    @XmlElement(name = "anzahl_betten", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double anzahlBetten;
    @XmlElement(name = "anzahl_tagungsraeume", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double anzahlTagungsraeume;
    @XmlElement(name = "vermietbare_flaeche", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double vermietbareFlaeche;
    @XmlElement(name = "anzahl_wohneinheiten", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double anzahlWohneinheiten;
    @XmlElement(name = "anzahl_gewerbeeinheiten", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double anzahlGewerbeeinheiten;
    protected Boolean einliegerwohnung;
    @XmlElement(name = "user_defined_simplefield")
    protected List<UserDefinedSimplefield> userDefinedSimplefield;
    @XmlElement(name = "user_defined_anyfield")
    protected List<UserDefinedAnyfield> userDefinedAnyfield;

    /**
     * Gets the value of the wohnflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getWohnflaeche() {
        return wohnflaeche;
    }

    /**
     * Sets the value of the wohnflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWohnflaeche(Double value) {
        this.wohnflaeche = value;
    }

    /**
     * Gets the value of the nutzflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getNutzflaeche() {
        return nutzflaeche;
    }

    /**
     * Sets the value of the nutzflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNutzflaeche(Double value) {
        this.nutzflaeche = value;
    }

    /**
     * Gets the value of the gesamtflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getGesamtflaeche() {
        return gesamtflaeche;
    }

    /**
     * Sets the value of the gesamtflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGesamtflaeche(Double value) {
        this.gesamtflaeche = value;
    }

    /**
     * Gets the value of the ladenflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getLadenflaeche() {
        return ladenflaeche;
    }

    /**
     * Sets the value of the ladenflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLadenflaeche(Double value) {
        this.ladenflaeche = value;
    }

    /**
     * Gets the value of the lagerflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getLagerflaeche() {
        return lagerflaeche;
    }

    /**
     * Sets the value of the lagerflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLagerflaeche(Double value) {
        this.lagerflaeche = value;
    }

    /**
     * Gets the value of the verkaufsflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getVerkaufsflaeche() {
        return verkaufsflaeche;
    }

    /**
     * Sets the value of the verkaufsflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerkaufsflaeche(Double value) {
        this.verkaufsflaeche = value;
    }

    /**
     * Gets the value of the freiflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getFreiflaeche() {
        return freiflaeche;
    }

    /**
     * Sets the value of the freiflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreiflaeche(Double value) {
        this.freiflaeche = value;
    }

    /**
     * Gets the value of the bueroflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getBueroflaeche() {
        return bueroflaeche;
    }

    /**
     * Sets the value of the bueroflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBueroflaeche(Double value) {
        this.bueroflaeche = value;
    }

    /**
     * Gets the value of the bueroteilflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getBueroteilflaeche() {
        return bueroteilflaeche;
    }

    /**
     * Sets the value of the bueroteilflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBueroteilflaeche(Double value) {
        this.bueroteilflaeche = value;
    }

    /**
     * Gets the value of the fensterfront property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getFensterfront() {
        return fensterfront;
    }

    /**
     * Sets the value of the fensterfront property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFensterfront(Double value) {
        this.fensterfront = value;
    }

    /**
     * Gets the value of the verwaltungsflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getVerwaltungsflaeche() {
        return verwaltungsflaeche;
    }

    /**
     * Sets the value of the verwaltungsflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerwaltungsflaeche(Double value) {
        this.verwaltungsflaeche = value;
    }

    /**
     * Gets the value of the gastroflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getGastroflaeche() {
        return gastroflaeche;
    }

    /**
     * Sets the value of the gastroflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGastroflaeche(Double value) {
        this.gastroflaeche = value;
    }

    /**
     * Gets the value of the grz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrz() {
        return grz;
    }

    /**
     * Sets the value of the grz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrz(String value) {
        this.grz = value;
    }

    /**
     * Gets the value of the gfz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGfz() {
        return gfz;
    }

    /**
     * Sets the value of the gfz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGfz(String value) {
        this.gfz = value;
    }

    /**
     * Gets the value of the bmz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBmz() {
        return bmz;
    }

    /**
     * Sets the value of the bmz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBmz(String value) {
        this.bmz = value;
    }

    /**
     * Gets the value of the bgf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBgf() {
        return bgf;
    }

    /**
     * Sets the value of the bgf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBgf(String value) {
        this.bgf = value;
    }

    /**
     * Gets the value of the grundstuecksflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getGrundstuecksflaeche() {
        return grundstuecksflaeche;
    }

    /**
     * Sets the value of the grundstuecksflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrundstuecksflaeche(Double value) {
        this.grundstuecksflaeche = value;
    }

    /**
     * Gets the value of the sonstflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getSonstflaeche() {
        return sonstflaeche;
    }

    /**
     * Sets the value of the sonstflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonstflaeche(Double value) {
        this.sonstflaeche = value;
    }

    /**
     * Gets the value of the anzahlZimmer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getAnzahlZimmer() {
        return anzahlZimmer;
    }

    /**
     * Sets the value of the anzahlZimmer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnzahlZimmer(Double value) {
        this.anzahlZimmer = value;
    }

    /**
     * Gets the value of the anzahlSchlafzimmer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getAnzahlSchlafzimmer() {
        return anzahlSchlafzimmer;
    }

    /**
     * Sets the value of the anzahlSchlafzimmer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnzahlSchlafzimmer(Double value) {
        this.anzahlSchlafzimmer = value;
    }

    /**
     * Gets the value of the anzahlBadezimmer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getAnzahlBadezimmer() {
        return anzahlBadezimmer;
    }

    /**
     * Sets the value of the anzahlBadezimmer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnzahlBadezimmer(Double value) {
        this.anzahlBadezimmer = value;
    }

    /**
     * Gets the value of the anzahlSepWc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getAnzahlSepWc() {
        return anzahlSepWc;
    }

    /**
     * Sets the value of the anzahlSepWc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnzahlSepWc(Double value) {
        this.anzahlSepWc = value;
    }

    /**
     * Gets the value of the anzahlBalkonTerrassen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getAnzahlBalkonTerrassen() {
        return anzahlBalkonTerrassen;
    }

    /**
     * Sets the value of the anzahlBalkonTerrassen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnzahlBalkonTerrassen(Double value) {
        this.anzahlBalkonTerrassen = value;
    }

    /**
     * Gets the value of the balkonTerrasseFlaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getBalkonTerrasseFlaeche() {
        return balkonTerrasseFlaeche;
    }

    /**
     * Sets the value of the balkonTerrasseFlaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalkonTerrasseFlaeche(Double value) {
        this.balkonTerrasseFlaeche = value;
    }

    /**
     * Gets the value of the anzahlWohnSchlafzimmer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getAnzahlWohnSchlafzimmer() {
        return anzahlWohnSchlafzimmer;
    }

    /**
     * Sets the value of the anzahlWohnSchlafzimmer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnzahlWohnSchlafzimmer(Double value) {
        this.anzahlWohnSchlafzimmer = value;
    }

    /**
     * Gets the value of the gartenflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getGartenflaeche() {
        return gartenflaeche;
    }

    /**
     * Sets the value of the gartenflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGartenflaeche(Double value) {
        this.gartenflaeche = value;
    }

    /**
     * Gets the value of the kellerflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getKellerflaeche() {
        return kellerflaeche;
    }

    /**
     * Sets the value of the kellerflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKellerflaeche(Double value) {
        this.kellerflaeche = value;
    }

    /**
     * Gets the value of the fensterfrontQm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getFensterfrontQm() {
        return fensterfrontQm;
    }

    /**
     * Sets the value of the fensterfrontQm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFensterfrontQm(Double value) {
        this.fensterfrontQm = value;
    }

    /**
     * Gets the value of the grundstuecksfront property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getGrundstuecksfront() {
        return grundstuecksfront;
    }

    /**
     * Sets the value of the grundstuecksfront property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrundstuecksfront(Double value) {
        this.grundstuecksfront = value;
    }

    /**
     * Gets the value of the dachbodenflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getDachbodenflaeche() {
        return dachbodenflaeche;
    }

    /**
     * Sets the value of the dachbodenflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDachbodenflaeche(Double value) {
        this.dachbodenflaeche = value;
    }

    /**
     * Gets the value of the teilbarAb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getTeilbarAb() {
        return teilbarAb;
    }

    /**
     * Sets the value of the teilbarAb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeilbarAb(Double value) {
        this.teilbarAb = value;
    }

    /**
     * Gets the value of the beheizbareFlaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getBeheizbareFlaeche() {
        return beheizbareFlaeche;
    }

    /**
     * Sets the value of the beheizbareFlaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeheizbareFlaeche(Double value) {
        this.beheizbareFlaeche = value;
    }

    /**
     * Gets the value of the anzahlStellplaetze property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getAnzahlStellplaetze() {
        return anzahlStellplaetze;
    }

    /**
     * Sets the value of the anzahlStellplaetze property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnzahlStellplaetze(Double value) {
        this.anzahlStellplaetze = value;
    }

    /**
     * Gets the value of the plaetzeGastraum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getPlaetzeGastraum() {
        return plaetzeGastraum;
    }

    /**
     * Sets the value of the plaetzeGastraum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaetzeGastraum(Double value) {
        this.plaetzeGastraum = value;
    }

    /**
     * Gets the value of the anzahlBetten property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getAnzahlBetten() {
        return anzahlBetten;
    }

    /**
     * Sets the value of the anzahlBetten property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnzahlBetten(Double value) {
        this.anzahlBetten = value;
    }

    /**
     * Gets the value of the anzahlTagungsraeume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getAnzahlTagungsraeume() {
        return anzahlTagungsraeume;
    }

    /**
     * Sets the value of the anzahlTagungsraeume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnzahlTagungsraeume(Double value) {
        this.anzahlTagungsraeume = value;
    }

    /**
     * Gets the value of the vermietbareFlaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getVermietbareFlaeche() {
        return vermietbareFlaeche;
    }

    /**
     * Sets the value of the vermietbareFlaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVermietbareFlaeche(Double value) {
        this.vermietbareFlaeche = value;
    }

    /**
     * Gets the value of the anzahlWohneinheiten property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getAnzahlWohneinheiten() {
        return anzahlWohneinheiten;
    }

    /**
     * Sets the value of the anzahlWohneinheiten property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnzahlWohneinheiten(Double value) {
        this.anzahlWohneinheiten = value;
    }

    /**
     * Gets the value of the anzahlGewerbeeinheiten property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getAnzahlGewerbeeinheiten() {
        return anzahlGewerbeeinheiten;
    }

    /**
     * Sets the value of the anzahlGewerbeeinheiten property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnzahlGewerbeeinheiten(Double value) {
        this.anzahlGewerbeeinheiten = value;
    }

    /**
     * Gets the value of the einliegerwohnung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEinliegerwohnung() {
        return einliegerwohnung;
    }

    /**
     * Sets the value of the einliegerwohnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEinliegerwohnung(Boolean value) {
        this.einliegerwohnung = value;
    }

    /**
     * Gets the value of the userDefinedSimplefield property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userDefinedSimplefield property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserDefinedSimplefield().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedSimplefield }
     * 
     * 
     */
    public List<UserDefinedSimplefield> getUserDefinedSimplefield() {
        if (userDefinedSimplefield == null) {
            userDefinedSimplefield = new ArrayList<UserDefinedSimplefield>();
        }
        return this.userDefinedSimplefield;
    }

    /**
     * Gets the value of the userDefinedAnyfield property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userDefinedAnyfield property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserDefinedAnyfield().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedAnyfield }
     * 
     * 
     */
    public List<UserDefinedAnyfield> getUserDefinedAnyfield() {
        if (userDefinedAnyfield == null) {
            userDefinedAnyfield = new ArrayList<UserDefinedAnyfield>();
        }
        return this.userDefinedAnyfield;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            Double theWohnflaeche;
            theWohnflaeche = this.getWohnflaeche();
            strategy.appendField(locator, this, "wohnflaeche", buffer, theWohnflaeche);
        }
        {
            Double theNutzflaeche;
            theNutzflaeche = this.getNutzflaeche();
            strategy.appendField(locator, this, "nutzflaeche", buffer, theNutzflaeche);
        }
        {
            Double theGesamtflaeche;
            theGesamtflaeche = this.getGesamtflaeche();
            strategy.appendField(locator, this, "gesamtflaeche", buffer, theGesamtflaeche);
        }
        {
            Double theLadenflaeche;
            theLadenflaeche = this.getLadenflaeche();
            strategy.appendField(locator, this, "ladenflaeche", buffer, theLadenflaeche);
        }
        {
            Double theLagerflaeche;
            theLagerflaeche = this.getLagerflaeche();
            strategy.appendField(locator, this, "lagerflaeche", buffer, theLagerflaeche);
        }
        {
            Double theVerkaufsflaeche;
            theVerkaufsflaeche = this.getVerkaufsflaeche();
            strategy.appendField(locator, this, "verkaufsflaeche", buffer, theVerkaufsflaeche);
        }
        {
            Double theFreiflaeche;
            theFreiflaeche = this.getFreiflaeche();
            strategy.appendField(locator, this, "freiflaeche", buffer, theFreiflaeche);
        }
        {
            Double theBueroflaeche;
            theBueroflaeche = this.getBueroflaeche();
            strategy.appendField(locator, this, "bueroflaeche", buffer, theBueroflaeche);
        }
        {
            Double theBueroteilflaeche;
            theBueroteilflaeche = this.getBueroteilflaeche();
            strategy.appendField(locator, this, "bueroteilflaeche", buffer, theBueroteilflaeche);
        }
        {
            Double theFensterfront;
            theFensterfront = this.getFensterfront();
            strategy.appendField(locator, this, "fensterfront", buffer, theFensterfront);
        }
        {
            Double theVerwaltungsflaeche;
            theVerwaltungsflaeche = this.getVerwaltungsflaeche();
            strategy.appendField(locator, this, "verwaltungsflaeche", buffer, theVerwaltungsflaeche);
        }
        {
            Double theGastroflaeche;
            theGastroflaeche = this.getGastroflaeche();
            strategy.appendField(locator, this, "gastroflaeche", buffer, theGastroflaeche);
        }
        {
            String theGrz;
            theGrz = this.getGrz();
            strategy.appendField(locator, this, "grz", buffer, theGrz);
        }
        {
            String theGfz;
            theGfz = this.getGfz();
            strategy.appendField(locator, this, "gfz", buffer, theGfz);
        }
        {
            String theBmz;
            theBmz = this.getBmz();
            strategy.appendField(locator, this, "bmz", buffer, theBmz);
        }
        {
            String theBgf;
            theBgf = this.getBgf();
            strategy.appendField(locator, this, "bgf", buffer, theBgf);
        }
        {
            Double theGrundstuecksflaeche;
            theGrundstuecksflaeche = this.getGrundstuecksflaeche();
            strategy.appendField(locator, this, "grundstuecksflaeche", buffer, theGrundstuecksflaeche);
        }
        {
            Double theSonstflaeche;
            theSonstflaeche = this.getSonstflaeche();
            strategy.appendField(locator, this, "sonstflaeche", buffer, theSonstflaeche);
        }
        {
            Double theAnzahlZimmer;
            theAnzahlZimmer = this.getAnzahlZimmer();
            strategy.appendField(locator, this, "anzahlZimmer", buffer, theAnzahlZimmer);
        }
        {
            Double theAnzahlSchlafzimmer;
            theAnzahlSchlafzimmer = this.getAnzahlSchlafzimmer();
            strategy.appendField(locator, this, "anzahlSchlafzimmer", buffer, theAnzahlSchlafzimmer);
        }
        {
            Double theAnzahlBadezimmer;
            theAnzahlBadezimmer = this.getAnzahlBadezimmer();
            strategy.appendField(locator, this, "anzahlBadezimmer", buffer, theAnzahlBadezimmer);
        }
        {
            Double theAnzahlSepWc;
            theAnzahlSepWc = this.getAnzahlSepWc();
            strategy.appendField(locator, this, "anzahlSepWc", buffer, theAnzahlSepWc);
        }
        {
            Double theAnzahlBalkonTerrassen;
            theAnzahlBalkonTerrassen = this.getAnzahlBalkonTerrassen();
            strategy.appendField(locator, this, "anzahlBalkonTerrassen", buffer, theAnzahlBalkonTerrassen);
        }
        {
            Double theBalkonTerrasseFlaeche;
            theBalkonTerrasseFlaeche = this.getBalkonTerrasseFlaeche();
            strategy.appendField(locator, this, "balkonTerrasseFlaeche", buffer, theBalkonTerrasseFlaeche);
        }
        {
            Double theAnzahlWohnSchlafzimmer;
            theAnzahlWohnSchlafzimmer = this.getAnzahlWohnSchlafzimmer();
            strategy.appendField(locator, this, "anzahlWohnSchlafzimmer", buffer, theAnzahlWohnSchlafzimmer);
        }
        {
            Double theGartenflaeche;
            theGartenflaeche = this.getGartenflaeche();
            strategy.appendField(locator, this, "gartenflaeche", buffer, theGartenflaeche);
        }
        {
            Double theKellerflaeche;
            theKellerflaeche = this.getKellerflaeche();
            strategy.appendField(locator, this, "kellerflaeche", buffer, theKellerflaeche);
        }
        {
            Double theFensterfrontQm;
            theFensterfrontQm = this.getFensterfrontQm();
            strategy.appendField(locator, this, "fensterfrontQm", buffer, theFensterfrontQm);
        }
        {
            Double theGrundstuecksfront;
            theGrundstuecksfront = this.getGrundstuecksfront();
            strategy.appendField(locator, this, "grundstuecksfront", buffer, theGrundstuecksfront);
        }
        {
            Double theDachbodenflaeche;
            theDachbodenflaeche = this.getDachbodenflaeche();
            strategy.appendField(locator, this, "dachbodenflaeche", buffer, theDachbodenflaeche);
        }
        {
            Double theTeilbarAb;
            theTeilbarAb = this.getTeilbarAb();
            strategy.appendField(locator, this, "teilbarAb", buffer, theTeilbarAb);
        }
        {
            Double theBeheizbareFlaeche;
            theBeheizbareFlaeche = this.getBeheizbareFlaeche();
            strategy.appendField(locator, this, "beheizbareFlaeche", buffer, theBeheizbareFlaeche);
        }
        {
            Double theAnzahlStellplaetze;
            theAnzahlStellplaetze = this.getAnzahlStellplaetze();
            strategy.appendField(locator, this, "anzahlStellplaetze", buffer, theAnzahlStellplaetze);
        }
        {
            Double thePlaetzeGastraum;
            thePlaetzeGastraum = this.getPlaetzeGastraum();
            strategy.appendField(locator, this, "plaetzeGastraum", buffer, thePlaetzeGastraum);
        }
        {
            Double theAnzahlBetten;
            theAnzahlBetten = this.getAnzahlBetten();
            strategy.appendField(locator, this, "anzahlBetten", buffer, theAnzahlBetten);
        }
        {
            Double theAnzahlTagungsraeume;
            theAnzahlTagungsraeume = this.getAnzahlTagungsraeume();
            strategy.appendField(locator, this, "anzahlTagungsraeume", buffer, theAnzahlTagungsraeume);
        }
        {
            Double theVermietbareFlaeche;
            theVermietbareFlaeche = this.getVermietbareFlaeche();
            strategy.appendField(locator, this, "vermietbareFlaeche", buffer, theVermietbareFlaeche);
        }
        {
            Double theAnzahlWohneinheiten;
            theAnzahlWohneinheiten = this.getAnzahlWohneinheiten();
            strategy.appendField(locator, this, "anzahlWohneinheiten", buffer, theAnzahlWohneinheiten);
        }
        {
            Double theAnzahlGewerbeeinheiten;
            theAnzahlGewerbeeinheiten = this.getAnzahlGewerbeeinheiten();
            strategy.appendField(locator, this, "anzahlGewerbeeinheiten", buffer, theAnzahlGewerbeeinheiten);
        }
        {
            Boolean theEinliegerwohnung;
            theEinliegerwohnung = this.isEinliegerwohnung();
            strategy.appendField(locator, this, "einliegerwohnung", buffer, theEinliegerwohnung);
        }
        {
            List<UserDefinedSimplefield> theUserDefinedSimplefield;
            theUserDefinedSimplefield = (((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))?this.getUserDefinedSimplefield():null);
            strategy.appendField(locator, this, "userDefinedSimplefield", buffer, theUserDefinedSimplefield);
        }
        {
            List<UserDefinedAnyfield> theUserDefinedAnyfield;
            theUserDefinedAnyfield = (((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))?this.getUserDefinedAnyfield():null);
            strategy.appendField(locator, this, "userDefinedAnyfield", buffer, theUserDefinedAnyfield);
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Flaechen) {
            final Flaechen copy = ((Flaechen) draftCopy);
            if (this.wohnflaeche!= null) {
                Double sourceWohnflaeche;
                sourceWohnflaeche = this.getWohnflaeche();
                Double copyWohnflaeche = ((Double) strategy.copy(LocatorUtils.property(locator, "wohnflaeche", sourceWohnflaeche), sourceWohnflaeche));
                copy.setWohnflaeche(copyWohnflaeche);
            } else {
                copy.wohnflaeche = null;
            }
            if (this.nutzflaeche!= null) {
                Double sourceNutzflaeche;
                sourceNutzflaeche = this.getNutzflaeche();
                Double copyNutzflaeche = ((Double) strategy.copy(LocatorUtils.property(locator, "nutzflaeche", sourceNutzflaeche), sourceNutzflaeche));
                copy.setNutzflaeche(copyNutzflaeche);
            } else {
                copy.nutzflaeche = null;
            }
            if (this.gesamtflaeche!= null) {
                Double sourceGesamtflaeche;
                sourceGesamtflaeche = this.getGesamtflaeche();
                Double copyGesamtflaeche = ((Double) strategy.copy(LocatorUtils.property(locator, "gesamtflaeche", sourceGesamtflaeche), sourceGesamtflaeche));
                copy.setGesamtflaeche(copyGesamtflaeche);
            } else {
                copy.gesamtflaeche = null;
            }
            if (this.ladenflaeche!= null) {
                Double sourceLadenflaeche;
                sourceLadenflaeche = this.getLadenflaeche();
                Double copyLadenflaeche = ((Double) strategy.copy(LocatorUtils.property(locator, "ladenflaeche", sourceLadenflaeche), sourceLadenflaeche));
                copy.setLadenflaeche(copyLadenflaeche);
            } else {
                copy.ladenflaeche = null;
            }
            if (this.lagerflaeche!= null) {
                Double sourceLagerflaeche;
                sourceLagerflaeche = this.getLagerflaeche();
                Double copyLagerflaeche = ((Double) strategy.copy(LocatorUtils.property(locator, "lagerflaeche", sourceLagerflaeche), sourceLagerflaeche));
                copy.setLagerflaeche(copyLagerflaeche);
            } else {
                copy.lagerflaeche = null;
            }
            if (this.verkaufsflaeche!= null) {
                Double sourceVerkaufsflaeche;
                sourceVerkaufsflaeche = this.getVerkaufsflaeche();
                Double copyVerkaufsflaeche = ((Double) strategy.copy(LocatorUtils.property(locator, "verkaufsflaeche", sourceVerkaufsflaeche), sourceVerkaufsflaeche));
                copy.setVerkaufsflaeche(copyVerkaufsflaeche);
            } else {
                copy.verkaufsflaeche = null;
            }
            if (this.freiflaeche!= null) {
                Double sourceFreiflaeche;
                sourceFreiflaeche = this.getFreiflaeche();
                Double copyFreiflaeche = ((Double) strategy.copy(LocatorUtils.property(locator, "freiflaeche", sourceFreiflaeche), sourceFreiflaeche));
                copy.setFreiflaeche(copyFreiflaeche);
            } else {
                copy.freiflaeche = null;
            }
            if (this.bueroflaeche!= null) {
                Double sourceBueroflaeche;
                sourceBueroflaeche = this.getBueroflaeche();
                Double copyBueroflaeche = ((Double) strategy.copy(LocatorUtils.property(locator, "bueroflaeche", sourceBueroflaeche), sourceBueroflaeche));
                copy.setBueroflaeche(copyBueroflaeche);
            } else {
                copy.bueroflaeche = null;
            }
            if (this.bueroteilflaeche!= null) {
                Double sourceBueroteilflaeche;
                sourceBueroteilflaeche = this.getBueroteilflaeche();
                Double copyBueroteilflaeche = ((Double) strategy.copy(LocatorUtils.property(locator, "bueroteilflaeche", sourceBueroteilflaeche), sourceBueroteilflaeche));
                copy.setBueroteilflaeche(copyBueroteilflaeche);
            } else {
                copy.bueroteilflaeche = null;
            }
            if (this.fensterfront!= null) {
                Double sourceFensterfront;
                sourceFensterfront = this.getFensterfront();
                Double copyFensterfront = ((Double) strategy.copy(LocatorUtils.property(locator, "fensterfront", sourceFensterfront), sourceFensterfront));
                copy.setFensterfront(copyFensterfront);
            } else {
                copy.fensterfront = null;
            }
            if (this.verwaltungsflaeche!= null) {
                Double sourceVerwaltungsflaeche;
                sourceVerwaltungsflaeche = this.getVerwaltungsflaeche();
                Double copyVerwaltungsflaeche = ((Double) strategy.copy(LocatorUtils.property(locator, "verwaltungsflaeche", sourceVerwaltungsflaeche), sourceVerwaltungsflaeche));
                copy.setVerwaltungsflaeche(copyVerwaltungsflaeche);
            } else {
                copy.verwaltungsflaeche = null;
            }
            if (this.gastroflaeche!= null) {
                Double sourceGastroflaeche;
                sourceGastroflaeche = this.getGastroflaeche();
                Double copyGastroflaeche = ((Double) strategy.copy(LocatorUtils.property(locator, "gastroflaeche", sourceGastroflaeche), sourceGastroflaeche));
                copy.setGastroflaeche(copyGastroflaeche);
            } else {
                copy.gastroflaeche = null;
            }
            if (this.grz!= null) {
                String sourceGrz;
                sourceGrz = this.getGrz();
                String copyGrz = ((String) strategy.copy(LocatorUtils.property(locator, "grz", sourceGrz), sourceGrz));
                copy.setGrz(copyGrz);
            } else {
                copy.grz = null;
            }
            if (this.gfz!= null) {
                String sourceGfz;
                sourceGfz = this.getGfz();
                String copyGfz = ((String) strategy.copy(LocatorUtils.property(locator, "gfz", sourceGfz), sourceGfz));
                copy.setGfz(copyGfz);
            } else {
                copy.gfz = null;
            }
            if (this.bmz!= null) {
                String sourceBmz;
                sourceBmz = this.getBmz();
                String copyBmz = ((String) strategy.copy(LocatorUtils.property(locator, "bmz", sourceBmz), sourceBmz));
                copy.setBmz(copyBmz);
            } else {
                copy.bmz = null;
            }
            if (this.bgf!= null) {
                String sourceBgf;
                sourceBgf = this.getBgf();
                String copyBgf = ((String) strategy.copy(LocatorUtils.property(locator, "bgf", sourceBgf), sourceBgf));
                copy.setBgf(copyBgf);
            } else {
                copy.bgf = null;
            }
            if (this.grundstuecksflaeche!= null) {
                Double sourceGrundstuecksflaeche;
                sourceGrundstuecksflaeche = this.getGrundstuecksflaeche();
                Double copyGrundstuecksflaeche = ((Double) strategy.copy(LocatorUtils.property(locator, "grundstuecksflaeche", sourceGrundstuecksflaeche), sourceGrundstuecksflaeche));
                copy.setGrundstuecksflaeche(copyGrundstuecksflaeche);
            } else {
                copy.grundstuecksflaeche = null;
            }
            if (this.sonstflaeche!= null) {
                Double sourceSonstflaeche;
                sourceSonstflaeche = this.getSonstflaeche();
                Double copySonstflaeche = ((Double) strategy.copy(LocatorUtils.property(locator, "sonstflaeche", sourceSonstflaeche), sourceSonstflaeche));
                copy.setSonstflaeche(copySonstflaeche);
            } else {
                copy.sonstflaeche = null;
            }
            if (this.anzahlZimmer!= null) {
                Double sourceAnzahlZimmer;
                sourceAnzahlZimmer = this.getAnzahlZimmer();
                Double copyAnzahlZimmer = ((Double) strategy.copy(LocatorUtils.property(locator, "anzahlZimmer", sourceAnzahlZimmer), sourceAnzahlZimmer));
                copy.setAnzahlZimmer(copyAnzahlZimmer);
            } else {
                copy.anzahlZimmer = null;
            }
            if (this.anzahlSchlafzimmer!= null) {
                Double sourceAnzahlSchlafzimmer;
                sourceAnzahlSchlafzimmer = this.getAnzahlSchlafzimmer();
                Double copyAnzahlSchlafzimmer = ((Double) strategy.copy(LocatorUtils.property(locator, "anzahlSchlafzimmer", sourceAnzahlSchlafzimmer), sourceAnzahlSchlafzimmer));
                copy.setAnzahlSchlafzimmer(copyAnzahlSchlafzimmer);
            } else {
                copy.anzahlSchlafzimmer = null;
            }
            if (this.anzahlBadezimmer!= null) {
                Double sourceAnzahlBadezimmer;
                sourceAnzahlBadezimmer = this.getAnzahlBadezimmer();
                Double copyAnzahlBadezimmer = ((Double) strategy.copy(LocatorUtils.property(locator, "anzahlBadezimmer", sourceAnzahlBadezimmer), sourceAnzahlBadezimmer));
                copy.setAnzahlBadezimmer(copyAnzahlBadezimmer);
            } else {
                copy.anzahlBadezimmer = null;
            }
            if (this.anzahlSepWc!= null) {
                Double sourceAnzahlSepWc;
                sourceAnzahlSepWc = this.getAnzahlSepWc();
                Double copyAnzahlSepWc = ((Double) strategy.copy(LocatorUtils.property(locator, "anzahlSepWc", sourceAnzahlSepWc), sourceAnzahlSepWc));
                copy.setAnzahlSepWc(copyAnzahlSepWc);
            } else {
                copy.anzahlSepWc = null;
            }
            if (this.anzahlBalkonTerrassen!= null) {
                Double sourceAnzahlBalkonTerrassen;
                sourceAnzahlBalkonTerrassen = this.getAnzahlBalkonTerrassen();
                Double copyAnzahlBalkonTerrassen = ((Double) strategy.copy(LocatorUtils.property(locator, "anzahlBalkonTerrassen", sourceAnzahlBalkonTerrassen), sourceAnzahlBalkonTerrassen));
                copy.setAnzahlBalkonTerrassen(copyAnzahlBalkonTerrassen);
            } else {
                copy.anzahlBalkonTerrassen = null;
            }
            if (this.balkonTerrasseFlaeche!= null) {
                Double sourceBalkonTerrasseFlaeche;
                sourceBalkonTerrasseFlaeche = this.getBalkonTerrasseFlaeche();
                Double copyBalkonTerrasseFlaeche = ((Double) strategy.copy(LocatorUtils.property(locator, "balkonTerrasseFlaeche", sourceBalkonTerrasseFlaeche), sourceBalkonTerrasseFlaeche));
                copy.setBalkonTerrasseFlaeche(copyBalkonTerrasseFlaeche);
            } else {
                copy.balkonTerrasseFlaeche = null;
            }
            if (this.anzahlWohnSchlafzimmer!= null) {
                Double sourceAnzahlWohnSchlafzimmer;
                sourceAnzahlWohnSchlafzimmer = this.getAnzahlWohnSchlafzimmer();
                Double copyAnzahlWohnSchlafzimmer = ((Double) strategy.copy(LocatorUtils.property(locator, "anzahlWohnSchlafzimmer", sourceAnzahlWohnSchlafzimmer), sourceAnzahlWohnSchlafzimmer));
                copy.setAnzahlWohnSchlafzimmer(copyAnzahlWohnSchlafzimmer);
            } else {
                copy.anzahlWohnSchlafzimmer = null;
            }
            if (this.gartenflaeche!= null) {
                Double sourceGartenflaeche;
                sourceGartenflaeche = this.getGartenflaeche();
                Double copyGartenflaeche = ((Double) strategy.copy(LocatorUtils.property(locator, "gartenflaeche", sourceGartenflaeche), sourceGartenflaeche));
                copy.setGartenflaeche(copyGartenflaeche);
            } else {
                copy.gartenflaeche = null;
            }
            if (this.kellerflaeche!= null) {
                Double sourceKellerflaeche;
                sourceKellerflaeche = this.getKellerflaeche();
                Double copyKellerflaeche = ((Double) strategy.copy(LocatorUtils.property(locator, "kellerflaeche", sourceKellerflaeche), sourceKellerflaeche));
                copy.setKellerflaeche(copyKellerflaeche);
            } else {
                copy.kellerflaeche = null;
            }
            if (this.fensterfrontQm!= null) {
                Double sourceFensterfrontQm;
                sourceFensterfrontQm = this.getFensterfrontQm();
                Double copyFensterfrontQm = ((Double) strategy.copy(LocatorUtils.property(locator, "fensterfrontQm", sourceFensterfrontQm), sourceFensterfrontQm));
                copy.setFensterfrontQm(copyFensterfrontQm);
            } else {
                copy.fensterfrontQm = null;
            }
            if (this.grundstuecksfront!= null) {
                Double sourceGrundstuecksfront;
                sourceGrundstuecksfront = this.getGrundstuecksfront();
                Double copyGrundstuecksfront = ((Double) strategy.copy(LocatorUtils.property(locator, "grundstuecksfront", sourceGrundstuecksfront), sourceGrundstuecksfront));
                copy.setGrundstuecksfront(copyGrundstuecksfront);
            } else {
                copy.grundstuecksfront = null;
            }
            if (this.dachbodenflaeche!= null) {
                Double sourceDachbodenflaeche;
                sourceDachbodenflaeche = this.getDachbodenflaeche();
                Double copyDachbodenflaeche = ((Double) strategy.copy(LocatorUtils.property(locator, "dachbodenflaeche", sourceDachbodenflaeche), sourceDachbodenflaeche));
                copy.setDachbodenflaeche(copyDachbodenflaeche);
            } else {
                copy.dachbodenflaeche = null;
            }
            if (this.teilbarAb!= null) {
                Double sourceTeilbarAb;
                sourceTeilbarAb = this.getTeilbarAb();
                Double copyTeilbarAb = ((Double) strategy.copy(LocatorUtils.property(locator, "teilbarAb", sourceTeilbarAb), sourceTeilbarAb));
                copy.setTeilbarAb(copyTeilbarAb);
            } else {
                copy.teilbarAb = null;
            }
            if (this.beheizbareFlaeche!= null) {
                Double sourceBeheizbareFlaeche;
                sourceBeheizbareFlaeche = this.getBeheizbareFlaeche();
                Double copyBeheizbareFlaeche = ((Double) strategy.copy(LocatorUtils.property(locator, "beheizbareFlaeche", sourceBeheizbareFlaeche), sourceBeheizbareFlaeche));
                copy.setBeheizbareFlaeche(copyBeheizbareFlaeche);
            } else {
                copy.beheizbareFlaeche = null;
            }
            if (this.anzahlStellplaetze!= null) {
                Double sourceAnzahlStellplaetze;
                sourceAnzahlStellplaetze = this.getAnzahlStellplaetze();
                Double copyAnzahlStellplaetze = ((Double) strategy.copy(LocatorUtils.property(locator, "anzahlStellplaetze", sourceAnzahlStellplaetze), sourceAnzahlStellplaetze));
                copy.setAnzahlStellplaetze(copyAnzahlStellplaetze);
            } else {
                copy.anzahlStellplaetze = null;
            }
            if (this.plaetzeGastraum!= null) {
                Double sourcePlaetzeGastraum;
                sourcePlaetzeGastraum = this.getPlaetzeGastraum();
                Double copyPlaetzeGastraum = ((Double) strategy.copy(LocatorUtils.property(locator, "plaetzeGastraum", sourcePlaetzeGastraum), sourcePlaetzeGastraum));
                copy.setPlaetzeGastraum(copyPlaetzeGastraum);
            } else {
                copy.plaetzeGastraum = null;
            }
            if (this.anzahlBetten!= null) {
                Double sourceAnzahlBetten;
                sourceAnzahlBetten = this.getAnzahlBetten();
                Double copyAnzahlBetten = ((Double) strategy.copy(LocatorUtils.property(locator, "anzahlBetten", sourceAnzahlBetten), sourceAnzahlBetten));
                copy.setAnzahlBetten(copyAnzahlBetten);
            } else {
                copy.anzahlBetten = null;
            }
            if (this.anzahlTagungsraeume!= null) {
                Double sourceAnzahlTagungsraeume;
                sourceAnzahlTagungsraeume = this.getAnzahlTagungsraeume();
                Double copyAnzahlTagungsraeume = ((Double) strategy.copy(LocatorUtils.property(locator, "anzahlTagungsraeume", sourceAnzahlTagungsraeume), sourceAnzahlTagungsraeume));
                copy.setAnzahlTagungsraeume(copyAnzahlTagungsraeume);
            } else {
                copy.anzahlTagungsraeume = null;
            }
            if (this.vermietbareFlaeche!= null) {
                Double sourceVermietbareFlaeche;
                sourceVermietbareFlaeche = this.getVermietbareFlaeche();
                Double copyVermietbareFlaeche = ((Double) strategy.copy(LocatorUtils.property(locator, "vermietbareFlaeche", sourceVermietbareFlaeche), sourceVermietbareFlaeche));
                copy.setVermietbareFlaeche(copyVermietbareFlaeche);
            } else {
                copy.vermietbareFlaeche = null;
            }
            if (this.anzahlWohneinheiten!= null) {
                Double sourceAnzahlWohneinheiten;
                sourceAnzahlWohneinheiten = this.getAnzahlWohneinheiten();
                Double copyAnzahlWohneinheiten = ((Double) strategy.copy(LocatorUtils.property(locator, "anzahlWohneinheiten", sourceAnzahlWohneinheiten), sourceAnzahlWohneinheiten));
                copy.setAnzahlWohneinheiten(copyAnzahlWohneinheiten);
            } else {
                copy.anzahlWohneinheiten = null;
            }
            if (this.anzahlGewerbeeinheiten!= null) {
                Double sourceAnzahlGewerbeeinheiten;
                sourceAnzahlGewerbeeinheiten = this.getAnzahlGewerbeeinheiten();
                Double copyAnzahlGewerbeeinheiten = ((Double) strategy.copy(LocatorUtils.property(locator, "anzahlGewerbeeinheiten", sourceAnzahlGewerbeeinheiten), sourceAnzahlGewerbeeinheiten));
                copy.setAnzahlGewerbeeinheiten(copyAnzahlGewerbeeinheiten);
            } else {
                copy.anzahlGewerbeeinheiten = null;
            }
            if (this.einliegerwohnung!= null) {
                Boolean sourceEinliegerwohnung;
                sourceEinliegerwohnung = this.isEinliegerwohnung();
                Boolean copyEinliegerwohnung = ((Boolean) strategy.copy(LocatorUtils.property(locator, "einliegerwohnung", sourceEinliegerwohnung), sourceEinliegerwohnung));
                copy.setEinliegerwohnung(copyEinliegerwohnung);
            } else {
                copy.einliegerwohnung = null;
            }
            if ((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty())) {
                List<UserDefinedSimplefield> sourceUserDefinedSimplefield;
                sourceUserDefinedSimplefield = (((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))?this.getUserDefinedSimplefield():null);
                @SuppressWarnings("unchecked")
                List<UserDefinedSimplefield> copyUserDefinedSimplefield = ((List<UserDefinedSimplefield> ) strategy.copy(LocatorUtils.property(locator, "userDefinedSimplefield", sourceUserDefinedSimplefield), sourceUserDefinedSimplefield));
                copy.userDefinedSimplefield = null;
                if (copyUserDefinedSimplefield!= null) {
                    List<UserDefinedSimplefield> uniqueUserDefinedSimplefieldl = copy.getUserDefinedSimplefield();
                    uniqueUserDefinedSimplefieldl.addAll(copyUserDefinedSimplefield);
                }
            } else {
                copy.userDefinedSimplefield = null;
            }
            if ((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty())) {
                List<UserDefinedAnyfield> sourceUserDefinedAnyfield;
                sourceUserDefinedAnyfield = (((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))?this.getUserDefinedAnyfield():null);
                @SuppressWarnings("unchecked")
                List<UserDefinedAnyfield> copyUserDefinedAnyfield = ((List<UserDefinedAnyfield> ) strategy.copy(LocatorUtils.property(locator, "userDefinedAnyfield", sourceUserDefinedAnyfield), sourceUserDefinedAnyfield));
                copy.userDefinedAnyfield = null;
                if (copyUserDefinedAnyfield!= null) {
                    List<UserDefinedAnyfield> uniqueUserDefinedAnyfieldl = copy.getUserDefinedAnyfield();
                    uniqueUserDefinedAnyfieldl.addAll(copyUserDefinedAnyfield);
                }
            } else {
                copy.userDefinedAnyfield = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Flaechen();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Flaechen)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Flaechen that = ((Flaechen) object);
        {
            Double lhsWohnflaeche;
            lhsWohnflaeche = this.getWohnflaeche();
            Double rhsWohnflaeche;
            rhsWohnflaeche = that.getWohnflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wohnflaeche", lhsWohnflaeche), LocatorUtils.property(thatLocator, "wohnflaeche", rhsWohnflaeche), lhsWohnflaeche, rhsWohnflaeche)) {
                return false;
            }
        }
        {
            Double lhsNutzflaeche;
            lhsNutzflaeche = this.getNutzflaeche();
            Double rhsNutzflaeche;
            rhsNutzflaeche = that.getNutzflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nutzflaeche", lhsNutzflaeche), LocatorUtils.property(thatLocator, "nutzflaeche", rhsNutzflaeche), lhsNutzflaeche, rhsNutzflaeche)) {
                return false;
            }
        }
        {
            Double lhsGesamtflaeche;
            lhsGesamtflaeche = this.getGesamtflaeche();
            Double rhsGesamtflaeche;
            rhsGesamtflaeche = that.getGesamtflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gesamtflaeche", lhsGesamtflaeche), LocatorUtils.property(thatLocator, "gesamtflaeche", rhsGesamtflaeche), lhsGesamtflaeche, rhsGesamtflaeche)) {
                return false;
            }
        }
        {
            Double lhsLadenflaeche;
            lhsLadenflaeche = this.getLadenflaeche();
            Double rhsLadenflaeche;
            rhsLadenflaeche = that.getLadenflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ladenflaeche", lhsLadenflaeche), LocatorUtils.property(thatLocator, "ladenflaeche", rhsLadenflaeche), lhsLadenflaeche, rhsLadenflaeche)) {
                return false;
            }
        }
        {
            Double lhsLagerflaeche;
            lhsLagerflaeche = this.getLagerflaeche();
            Double rhsLagerflaeche;
            rhsLagerflaeche = that.getLagerflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lagerflaeche", lhsLagerflaeche), LocatorUtils.property(thatLocator, "lagerflaeche", rhsLagerflaeche), lhsLagerflaeche, rhsLagerflaeche)) {
                return false;
            }
        }
        {
            Double lhsVerkaufsflaeche;
            lhsVerkaufsflaeche = this.getVerkaufsflaeche();
            Double rhsVerkaufsflaeche;
            rhsVerkaufsflaeche = that.getVerkaufsflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verkaufsflaeche", lhsVerkaufsflaeche), LocatorUtils.property(thatLocator, "verkaufsflaeche", rhsVerkaufsflaeche), lhsVerkaufsflaeche, rhsVerkaufsflaeche)) {
                return false;
            }
        }
        {
            Double lhsFreiflaeche;
            lhsFreiflaeche = this.getFreiflaeche();
            Double rhsFreiflaeche;
            rhsFreiflaeche = that.getFreiflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freiflaeche", lhsFreiflaeche), LocatorUtils.property(thatLocator, "freiflaeche", rhsFreiflaeche), lhsFreiflaeche, rhsFreiflaeche)) {
                return false;
            }
        }
        {
            Double lhsBueroflaeche;
            lhsBueroflaeche = this.getBueroflaeche();
            Double rhsBueroflaeche;
            rhsBueroflaeche = that.getBueroflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bueroflaeche", lhsBueroflaeche), LocatorUtils.property(thatLocator, "bueroflaeche", rhsBueroflaeche), lhsBueroflaeche, rhsBueroflaeche)) {
                return false;
            }
        }
        {
            Double lhsBueroteilflaeche;
            lhsBueroteilflaeche = this.getBueroteilflaeche();
            Double rhsBueroteilflaeche;
            rhsBueroteilflaeche = that.getBueroteilflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bueroteilflaeche", lhsBueroteilflaeche), LocatorUtils.property(thatLocator, "bueroteilflaeche", rhsBueroteilflaeche), lhsBueroteilflaeche, rhsBueroteilflaeche)) {
                return false;
            }
        }
        {
            Double lhsFensterfront;
            lhsFensterfront = this.getFensterfront();
            Double rhsFensterfront;
            rhsFensterfront = that.getFensterfront();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fensterfront", lhsFensterfront), LocatorUtils.property(thatLocator, "fensterfront", rhsFensterfront), lhsFensterfront, rhsFensterfront)) {
                return false;
            }
        }
        {
            Double lhsVerwaltungsflaeche;
            lhsVerwaltungsflaeche = this.getVerwaltungsflaeche();
            Double rhsVerwaltungsflaeche;
            rhsVerwaltungsflaeche = that.getVerwaltungsflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verwaltungsflaeche", lhsVerwaltungsflaeche), LocatorUtils.property(thatLocator, "verwaltungsflaeche", rhsVerwaltungsflaeche), lhsVerwaltungsflaeche, rhsVerwaltungsflaeche)) {
                return false;
            }
        }
        {
            Double lhsGastroflaeche;
            lhsGastroflaeche = this.getGastroflaeche();
            Double rhsGastroflaeche;
            rhsGastroflaeche = that.getGastroflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gastroflaeche", lhsGastroflaeche), LocatorUtils.property(thatLocator, "gastroflaeche", rhsGastroflaeche), lhsGastroflaeche, rhsGastroflaeche)) {
                return false;
            }
        }
        {
            String lhsGrz;
            lhsGrz = this.getGrz();
            String rhsGrz;
            rhsGrz = that.getGrz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grz", lhsGrz), LocatorUtils.property(thatLocator, "grz", rhsGrz), lhsGrz, rhsGrz)) {
                return false;
            }
        }
        {
            String lhsGfz;
            lhsGfz = this.getGfz();
            String rhsGfz;
            rhsGfz = that.getGfz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gfz", lhsGfz), LocatorUtils.property(thatLocator, "gfz", rhsGfz), lhsGfz, rhsGfz)) {
                return false;
            }
        }
        {
            String lhsBmz;
            lhsBmz = this.getBmz();
            String rhsBmz;
            rhsBmz = that.getBmz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bmz", lhsBmz), LocatorUtils.property(thatLocator, "bmz", rhsBmz), lhsBmz, rhsBmz)) {
                return false;
            }
        }
        {
            String lhsBgf;
            lhsBgf = this.getBgf();
            String rhsBgf;
            rhsBgf = that.getBgf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bgf", lhsBgf), LocatorUtils.property(thatLocator, "bgf", rhsBgf), lhsBgf, rhsBgf)) {
                return false;
            }
        }
        {
            Double lhsGrundstuecksflaeche;
            lhsGrundstuecksflaeche = this.getGrundstuecksflaeche();
            Double rhsGrundstuecksflaeche;
            rhsGrundstuecksflaeche = that.getGrundstuecksflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grundstuecksflaeche", lhsGrundstuecksflaeche), LocatorUtils.property(thatLocator, "grundstuecksflaeche", rhsGrundstuecksflaeche), lhsGrundstuecksflaeche, rhsGrundstuecksflaeche)) {
                return false;
            }
        }
        {
            Double lhsSonstflaeche;
            lhsSonstflaeche = this.getSonstflaeche();
            Double rhsSonstflaeche;
            rhsSonstflaeche = that.getSonstflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sonstflaeche", lhsSonstflaeche), LocatorUtils.property(thatLocator, "sonstflaeche", rhsSonstflaeche), lhsSonstflaeche, rhsSonstflaeche)) {
                return false;
            }
        }
        {
            Double lhsAnzahlZimmer;
            lhsAnzahlZimmer = this.getAnzahlZimmer();
            Double rhsAnzahlZimmer;
            rhsAnzahlZimmer = that.getAnzahlZimmer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlZimmer", lhsAnzahlZimmer), LocatorUtils.property(thatLocator, "anzahlZimmer", rhsAnzahlZimmer), lhsAnzahlZimmer, rhsAnzahlZimmer)) {
                return false;
            }
        }
        {
            Double lhsAnzahlSchlafzimmer;
            lhsAnzahlSchlafzimmer = this.getAnzahlSchlafzimmer();
            Double rhsAnzahlSchlafzimmer;
            rhsAnzahlSchlafzimmer = that.getAnzahlSchlafzimmer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlSchlafzimmer", lhsAnzahlSchlafzimmer), LocatorUtils.property(thatLocator, "anzahlSchlafzimmer", rhsAnzahlSchlafzimmer), lhsAnzahlSchlafzimmer, rhsAnzahlSchlafzimmer)) {
                return false;
            }
        }
        {
            Double lhsAnzahlBadezimmer;
            lhsAnzahlBadezimmer = this.getAnzahlBadezimmer();
            Double rhsAnzahlBadezimmer;
            rhsAnzahlBadezimmer = that.getAnzahlBadezimmer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlBadezimmer", lhsAnzahlBadezimmer), LocatorUtils.property(thatLocator, "anzahlBadezimmer", rhsAnzahlBadezimmer), lhsAnzahlBadezimmer, rhsAnzahlBadezimmer)) {
                return false;
            }
        }
        {
            Double lhsAnzahlSepWc;
            lhsAnzahlSepWc = this.getAnzahlSepWc();
            Double rhsAnzahlSepWc;
            rhsAnzahlSepWc = that.getAnzahlSepWc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlSepWc", lhsAnzahlSepWc), LocatorUtils.property(thatLocator, "anzahlSepWc", rhsAnzahlSepWc), lhsAnzahlSepWc, rhsAnzahlSepWc)) {
                return false;
            }
        }
        {
            Double lhsAnzahlBalkonTerrassen;
            lhsAnzahlBalkonTerrassen = this.getAnzahlBalkonTerrassen();
            Double rhsAnzahlBalkonTerrassen;
            rhsAnzahlBalkonTerrassen = that.getAnzahlBalkonTerrassen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlBalkonTerrassen", lhsAnzahlBalkonTerrassen), LocatorUtils.property(thatLocator, "anzahlBalkonTerrassen", rhsAnzahlBalkonTerrassen), lhsAnzahlBalkonTerrassen, rhsAnzahlBalkonTerrassen)) {
                return false;
            }
        }
        {
            Double lhsBalkonTerrasseFlaeche;
            lhsBalkonTerrasseFlaeche = this.getBalkonTerrasseFlaeche();
            Double rhsBalkonTerrasseFlaeche;
            rhsBalkonTerrasseFlaeche = that.getBalkonTerrasseFlaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "balkonTerrasseFlaeche", lhsBalkonTerrasseFlaeche), LocatorUtils.property(thatLocator, "balkonTerrasseFlaeche", rhsBalkonTerrasseFlaeche), lhsBalkonTerrasseFlaeche, rhsBalkonTerrasseFlaeche)) {
                return false;
            }
        }
        {
            Double lhsAnzahlWohnSchlafzimmer;
            lhsAnzahlWohnSchlafzimmer = this.getAnzahlWohnSchlafzimmer();
            Double rhsAnzahlWohnSchlafzimmer;
            rhsAnzahlWohnSchlafzimmer = that.getAnzahlWohnSchlafzimmer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlWohnSchlafzimmer", lhsAnzahlWohnSchlafzimmer), LocatorUtils.property(thatLocator, "anzahlWohnSchlafzimmer", rhsAnzahlWohnSchlafzimmer), lhsAnzahlWohnSchlafzimmer, rhsAnzahlWohnSchlafzimmer)) {
                return false;
            }
        }
        {
            Double lhsGartenflaeche;
            lhsGartenflaeche = this.getGartenflaeche();
            Double rhsGartenflaeche;
            rhsGartenflaeche = that.getGartenflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gartenflaeche", lhsGartenflaeche), LocatorUtils.property(thatLocator, "gartenflaeche", rhsGartenflaeche), lhsGartenflaeche, rhsGartenflaeche)) {
                return false;
            }
        }
        {
            Double lhsKellerflaeche;
            lhsKellerflaeche = this.getKellerflaeche();
            Double rhsKellerflaeche;
            rhsKellerflaeche = that.getKellerflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kellerflaeche", lhsKellerflaeche), LocatorUtils.property(thatLocator, "kellerflaeche", rhsKellerflaeche), lhsKellerflaeche, rhsKellerflaeche)) {
                return false;
            }
        }
        {
            Double lhsFensterfrontQm;
            lhsFensterfrontQm = this.getFensterfrontQm();
            Double rhsFensterfrontQm;
            rhsFensterfrontQm = that.getFensterfrontQm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fensterfrontQm", lhsFensterfrontQm), LocatorUtils.property(thatLocator, "fensterfrontQm", rhsFensterfrontQm), lhsFensterfrontQm, rhsFensterfrontQm)) {
                return false;
            }
        }
        {
            Double lhsGrundstuecksfront;
            lhsGrundstuecksfront = this.getGrundstuecksfront();
            Double rhsGrundstuecksfront;
            rhsGrundstuecksfront = that.getGrundstuecksfront();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grundstuecksfront", lhsGrundstuecksfront), LocatorUtils.property(thatLocator, "grundstuecksfront", rhsGrundstuecksfront), lhsGrundstuecksfront, rhsGrundstuecksfront)) {
                return false;
            }
        }
        {
            Double lhsDachbodenflaeche;
            lhsDachbodenflaeche = this.getDachbodenflaeche();
            Double rhsDachbodenflaeche;
            rhsDachbodenflaeche = that.getDachbodenflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dachbodenflaeche", lhsDachbodenflaeche), LocatorUtils.property(thatLocator, "dachbodenflaeche", rhsDachbodenflaeche), lhsDachbodenflaeche, rhsDachbodenflaeche)) {
                return false;
            }
        }
        {
            Double lhsTeilbarAb;
            lhsTeilbarAb = this.getTeilbarAb();
            Double rhsTeilbarAb;
            rhsTeilbarAb = that.getTeilbarAb();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "teilbarAb", lhsTeilbarAb), LocatorUtils.property(thatLocator, "teilbarAb", rhsTeilbarAb), lhsTeilbarAb, rhsTeilbarAb)) {
                return false;
            }
        }
        {
            Double lhsBeheizbareFlaeche;
            lhsBeheizbareFlaeche = this.getBeheizbareFlaeche();
            Double rhsBeheizbareFlaeche;
            rhsBeheizbareFlaeche = that.getBeheizbareFlaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beheizbareFlaeche", lhsBeheizbareFlaeche), LocatorUtils.property(thatLocator, "beheizbareFlaeche", rhsBeheizbareFlaeche), lhsBeheizbareFlaeche, rhsBeheizbareFlaeche)) {
                return false;
            }
        }
        {
            Double lhsAnzahlStellplaetze;
            lhsAnzahlStellplaetze = this.getAnzahlStellplaetze();
            Double rhsAnzahlStellplaetze;
            rhsAnzahlStellplaetze = that.getAnzahlStellplaetze();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlStellplaetze", lhsAnzahlStellplaetze), LocatorUtils.property(thatLocator, "anzahlStellplaetze", rhsAnzahlStellplaetze), lhsAnzahlStellplaetze, rhsAnzahlStellplaetze)) {
                return false;
            }
        }
        {
            Double lhsPlaetzeGastraum;
            lhsPlaetzeGastraum = this.getPlaetzeGastraum();
            Double rhsPlaetzeGastraum;
            rhsPlaetzeGastraum = that.getPlaetzeGastraum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "plaetzeGastraum", lhsPlaetzeGastraum), LocatorUtils.property(thatLocator, "plaetzeGastraum", rhsPlaetzeGastraum), lhsPlaetzeGastraum, rhsPlaetzeGastraum)) {
                return false;
            }
        }
        {
            Double lhsAnzahlBetten;
            lhsAnzahlBetten = this.getAnzahlBetten();
            Double rhsAnzahlBetten;
            rhsAnzahlBetten = that.getAnzahlBetten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlBetten", lhsAnzahlBetten), LocatorUtils.property(thatLocator, "anzahlBetten", rhsAnzahlBetten), lhsAnzahlBetten, rhsAnzahlBetten)) {
                return false;
            }
        }
        {
            Double lhsAnzahlTagungsraeume;
            lhsAnzahlTagungsraeume = this.getAnzahlTagungsraeume();
            Double rhsAnzahlTagungsraeume;
            rhsAnzahlTagungsraeume = that.getAnzahlTagungsraeume();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlTagungsraeume", lhsAnzahlTagungsraeume), LocatorUtils.property(thatLocator, "anzahlTagungsraeume", rhsAnzahlTagungsraeume), lhsAnzahlTagungsraeume, rhsAnzahlTagungsraeume)) {
                return false;
            }
        }
        {
            Double lhsVermietbareFlaeche;
            lhsVermietbareFlaeche = this.getVermietbareFlaeche();
            Double rhsVermietbareFlaeche;
            rhsVermietbareFlaeche = that.getVermietbareFlaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vermietbareFlaeche", lhsVermietbareFlaeche), LocatorUtils.property(thatLocator, "vermietbareFlaeche", rhsVermietbareFlaeche), lhsVermietbareFlaeche, rhsVermietbareFlaeche)) {
                return false;
            }
        }
        {
            Double lhsAnzahlWohneinheiten;
            lhsAnzahlWohneinheiten = this.getAnzahlWohneinheiten();
            Double rhsAnzahlWohneinheiten;
            rhsAnzahlWohneinheiten = that.getAnzahlWohneinheiten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlWohneinheiten", lhsAnzahlWohneinheiten), LocatorUtils.property(thatLocator, "anzahlWohneinheiten", rhsAnzahlWohneinheiten), lhsAnzahlWohneinheiten, rhsAnzahlWohneinheiten)) {
                return false;
            }
        }
        {
            Double lhsAnzahlGewerbeeinheiten;
            lhsAnzahlGewerbeeinheiten = this.getAnzahlGewerbeeinheiten();
            Double rhsAnzahlGewerbeeinheiten;
            rhsAnzahlGewerbeeinheiten = that.getAnzahlGewerbeeinheiten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlGewerbeeinheiten", lhsAnzahlGewerbeeinheiten), LocatorUtils.property(thatLocator, "anzahlGewerbeeinheiten", rhsAnzahlGewerbeeinheiten), lhsAnzahlGewerbeeinheiten, rhsAnzahlGewerbeeinheiten)) {
                return false;
            }
        }
        {
            Boolean lhsEinliegerwohnung;
            lhsEinliegerwohnung = this.isEinliegerwohnung();
            Boolean rhsEinliegerwohnung;
            rhsEinliegerwohnung = that.isEinliegerwohnung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "einliegerwohnung", lhsEinliegerwohnung), LocatorUtils.property(thatLocator, "einliegerwohnung", rhsEinliegerwohnung), lhsEinliegerwohnung, rhsEinliegerwohnung)) {
                return false;
            }
        }
        {
            List<UserDefinedSimplefield> lhsUserDefinedSimplefield;
            lhsUserDefinedSimplefield = (((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))?this.getUserDefinedSimplefield():null);
            List<UserDefinedSimplefield> rhsUserDefinedSimplefield;
            rhsUserDefinedSimplefield = (((that.userDefinedSimplefield!= null)&&(!that.userDefinedSimplefield.isEmpty()))?that.getUserDefinedSimplefield():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefinedSimplefield", lhsUserDefinedSimplefield), LocatorUtils.property(thatLocator, "userDefinedSimplefield", rhsUserDefinedSimplefield), lhsUserDefinedSimplefield, rhsUserDefinedSimplefield)) {
                return false;
            }
        }
        {
            List<UserDefinedAnyfield> lhsUserDefinedAnyfield;
            lhsUserDefinedAnyfield = (((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))?this.getUserDefinedAnyfield():null);
            List<UserDefinedAnyfield> rhsUserDefinedAnyfield;
            rhsUserDefinedAnyfield = (((that.userDefinedAnyfield!= null)&&(!that.userDefinedAnyfield.isEmpty()))?that.getUserDefinedAnyfield():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefinedAnyfield", lhsUserDefinedAnyfield), LocatorUtils.property(thatLocator, "userDefinedAnyfield", rhsUserDefinedAnyfield), lhsUserDefinedAnyfield, rhsUserDefinedAnyfield)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
