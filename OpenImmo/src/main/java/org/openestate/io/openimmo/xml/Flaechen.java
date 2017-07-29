
package org.openestate.io.openimmo.xml;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.jaxb2_commons.lang.CopyStrategy2;
import org.jvnet.jaxb2_commons.lang.CopyTo2;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Java class for &lt;flaechen&gt; element.
 * 
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
    "anzahlBalkone",
    "anzahlTerrassen",
    "anzahlLogia",
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
    "kubatur",
    "ausnuetzungsziffer",
    "flaechevon",
    "flaechebis",
    "userDefinedSimplefield",
    "userDefinedAnyfield",
    "userDefinedExtend"
})
@XmlRootElement(name = "flaechen")
public class Flaechen implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal wohnflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal nutzflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal gesamtflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal ladenflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal lagerflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal verkaufsflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal freiflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal bueroflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal bueroteilflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal fensterfront;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal verwaltungsflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal gastroflaeche;
    protected String grz;
    protected String gfz;
    protected String bmz;
    protected String bgf;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal grundstuecksflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal sonstflaeche;
    @XmlElement(name = "anzahl_zimmer", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal anzahlZimmer;
    @XmlElement(name = "anzahl_schlafzimmer", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal anzahlSchlafzimmer;
    @XmlElement(name = "anzahl_badezimmer", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal anzahlBadezimmer;
    @XmlElement(name = "anzahl_sep_wc", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal anzahlSepWc;
    @XmlElement(name = "anzahl_balkone", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal anzahlBalkone;
    @XmlElement(name = "anzahl_terrassen", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal anzahlTerrassen;
    @XmlElement(name = "anzahl_logia", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal anzahlLogia;
    @XmlElement(name = "balkon_terrasse_flaeche", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal balkonTerrasseFlaeche;
    @XmlElement(name = "anzahl_wohn_schlafzimmer", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal anzahlWohnSchlafzimmer;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal gartenflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal kellerflaeche;
    @XmlElement(name = "fensterfront_qm", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal fensterfrontQm;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal grundstuecksfront;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal dachbodenflaeche;
    @XmlElement(name = "teilbar_ab", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal teilbarAb;
    @XmlElement(name = "beheizbare_flaeche", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal beheizbareFlaeche;
    @XmlElement(name = "anzahl_stellplaetze", type = String.class)
    @XmlJavaTypeAdapter(Adapter6 .class)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger anzahlStellplaetze;
    @XmlElement(name = "plaetze_gastraum", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal plaetzeGastraum;
    @XmlElement(name = "anzahl_betten", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal anzahlBetten;
    @XmlElement(name = "anzahl_tagungsraeume", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal anzahlTagungsraeume;
    @XmlElement(name = "vermietbare_flaeche", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal vermietbareFlaeche;
    @XmlElement(name = "anzahl_wohneinheiten", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal anzahlWohneinheiten;
    @XmlElement(name = "anzahl_gewerbeeinheiten", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal anzahlGewerbeeinheiten;
    protected Boolean einliegerwohnung;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal kubatur;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal ausnuetzungsziffer;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal flaechevon;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal flaechebis;
    @XmlElement(name = "user_defined_simplefield")
    protected List<UserDefinedSimplefield> userDefinedSimplefield;
    @XmlElement(name = "user_defined_anyfield")
    protected List<UserDefinedAnyfield> userDefinedAnyfield;
    @XmlElement(name = "user_defined_extend")
    protected List<UserDefinedExtend> userDefinedExtend;

    /**
     * Gets the value of the wohnflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getWohnflaeche() {
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
    public void setWohnflaeche(BigDecimal value) {
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
    public BigDecimal getNutzflaeche() {
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
    public void setNutzflaeche(BigDecimal value) {
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
    public BigDecimal getGesamtflaeche() {
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
    public void setGesamtflaeche(BigDecimal value) {
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
    public BigDecimal getLadenflaeche() {
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
    public void setLadenflaeche(BigDecimal value) {
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
    public BigDecimal getLagerflaeche() {
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
    public void setLagerflaeche(BigDecimal value) {
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
    public BigDecimal getVerkaufsflaeche() {
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
    public void setVerkaufsflaeche(BigDecimal value) {
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
    public BigDecimal getFreiflaeche() {
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
    public void setFreiflaeche(BigDecimal value) {
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
    public BigDecimal getBueroflaeche() {
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
    public void setBueroflaeche(BigDecimal value) {
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
    public BigDecimal getBueroteilflaeche() {
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
    public void setBueroteilflaeche(BigDecimal value) {
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
    public BigDecimal getFensterfront() {
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
    public void setFensterfront(BigDecimal value) {
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
    public BigDecimal getVerwaltungsflaeche() {
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
    public void setVerwaltungsflaeche(BigDecimal value) {
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
    public BigDecimal getGastroflaeche() {
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
    public void setGastroflaeche(BigDecimal value) {
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
    public BigDecimal getGrundstuecksflaeche() {
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
    public void setGrundstuecksflaeche(BigDecimal value) {
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
    public BigDecimal getSonstflaeche() {
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
    public void setSonstflaeche(BigDecimal value) {
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
    public BigDecimal getAnzahlZimmer() {
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
    public void setAnzahlZimmer(BigDecimal value) {
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
    public BigDecimal getAnzahlSchlafzimmer() {
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
    public void setAnzahlSchlafzimmer(BigDecimal value) {
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
    public BigDecimal getAnzahlBadezimmer() {
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
    public void setAnzahlBadezimmer(BigDecimal value) {
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
    public BigDecimal getAnzahlSepWc() {
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
    public void setAnzahlSepWc(BigDecimal value) {
        this.anzahlSepWc = value;
    }

    /**
     * Gets the value of the anzahlBalkone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getAnzahlBalkone() {
        return anzahlBalkone;
    }

    /**
     * Sets the value of the anzahlBalkone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnzahlBalkone(BigDecimal value) {
        this.anzahlBalkone = value;
    }

    /**
     * Gets the value of the anzahlTerrassen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getAnzahlTerrassen() {
        return anzahlTerrassen;
    }

    /**
     * Sets the value of the anzahlTerrassen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnzahlTerrassen(BigDecimal value) {
        this.anzahlTerrassen = value;
    }

    /**
     * Gets the value of the anzahlLogia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getAnzahlLogia() {
        return anzahlLogia;
    }

    /**
     * Sets the value of the anzahlLogia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnzahlLogia(BigDecimal value) {
        this.anzahlLogia = value;
    }

    /**
     * Gets the value of the balkonTerrasseFlaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getBalkonTerrasseFlaeche() {
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
    public void setBalkonTerrasseFlaeche(BigDecimal value) {
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
    public BigDecimal getAnzahlWohnSchlafzimmer() {
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
    public void setAnzahlWohnSchlafzimmer(BigDecimal value) {
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
    public BigDecimal getGartenflaeche() {
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
    public void setGartenflaeche(BigDecimal value) {
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
    public BigDecimal getKellerflaeche() {
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
    public void setKellerflaeche(BigDecimal value) {
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
    public BigDecimal getFensterfrontQm() {
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
    public void setFensterfrontQm(BigDecimal value) {
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
    public BigDecimal getGrundstuecksfront() {
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
    public void setGrundstuecksfront(BigDecimal value) {
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
    public BigDecimal getDachbodenflaeche() {
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
    public void setDachbodenflaeche(BigDecimal value) {
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
    public BigDecimal getTeilbarAb() {
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
    public void setTeilbarAb(BigDecimal value) {
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
    public BigDecimal getBeheizbareFlaeche() {
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
    public void setBeheizbareFlaeche(BigDecimal value) {
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
    public BigInteger getAnzahlStellplaetze() {
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
    public void setAnzahlStellplaetze(BigInteger value) {
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
    public BigDecimal getPlaetzeGastraum() {
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
    public void setPlaetzeGastraum(BigDecimal value) {
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
    public BigDecimal getAnzahlBetten() {
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
    public void setAnzahlBetten(BigDecimal value) {
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
    public BigDecimal getAnzahlTagungsraeume() {
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
    public void setAnzahlTagungsraeume(BigDecimal value) {
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
    public BigDecimal getVermietbareFlaeche() {
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
    public void setVermietbareFlaeche(BigDecimal value) {
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
    public BigDecimal getAnzahlWohneinheiten() {
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
    public void setAnzahlWohneinheiten(BigDecimal value) {
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
    public BigDecimal getAnzahlGewerbeeinheiten() {
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
    public void setAnzahlGewerbeeinheiten(BigDecimal value) {
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
     * Gets the value of the kubatur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getKubatur() {
        return kubatur;
    }

    /**
     * Sets the value of the kubatur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKubatur(BigDecimal value) {
        this.kubatur = value;
    }

    /**
     * Gets the value of the ausnuetzungsziffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getAusnuetzungsziffer() {
        return ausnuetzungsziffer;
    }

    /**
     * Sets the value of the ausnuetzungsziffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAusnuetzungsziffer(BigDecimal value) {
        this.ausnuetzungsziffer = value;
    }

    /**
     * Gets the value of the flaechevon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getFlaechevon() {
        return flaechevon;
    }

    /**
     * Sets the value of the flaechevon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlaechevon(BigDecimal value) {
        this.flaechevon = value;
    }

    /**
     * Gets the value of the flaechebis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getFlaechebis() {
        return flaechebis;
    }

    /**
     * Sets the value of the flaechebis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlaechebis(BigDecimal value) {
        this.flaechebis = value;
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

    /**
     * Gets the value of the userDefinedExtend property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userDefinedExtend property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserDefinedExtend().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedExtend }
     * 
     * 
     */
    public List<UserDefinedExtend> getUserDefinedExtend() {
        if (userDefinedExtend == null) {
            userDefinedExtend = new ArrayList<UserDefinedExtend>();
        }
        return this.userDefinedExtend;
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            BigDecimal theWohnflaeche;
            theWohnflaeche = this.getWohnflaeche();
            strategy.appendField(locator, this, "wohnflaeche", buffer, theWohnflaeche, (this.wohnflaeche!= null));
        }
        {
            BigDecimal theNutzflaeche;
            theNutzflaeche = this.getNutzflaeche();
            strategy.appendField(locator, this, "nutzflaeche", buffer, theNutzflaeche, (this.nutzflaeche!= null));
        }
        {
            BigDecimal theGesamtflaeche;
            theGesamtflaeche = this.getGesamtflaeche();
            strategy.appendField(locator, this, "gesamtflaeche", buffer, theGesamtflaeche, (this.gesamtflaeche!= null));
        }
        {
            BigDecimal theLadenflaeche;
            theLadenflaeche = this.getLadenflaeche();
            strategy.appendField(locator, this, "ladenflaeche", buffer, theLadenflaeche, (this.ladenflaeche!= null));
        }
        {
            BigDecimal theLagerflaeche;
            theLagerflaeche = this.getLagerflaeche();
            strategy.appendField(locator, this, "lagerflaeche", buffer, theLagerflaeche, (this.lagerflaeche!= null));
        }
        {
            BigDecimal theVerkaufsflaeche;
            theVerkaufsflaeche = this.getVerkaufsflaeche();
            strategy.appendField(locator, this, "verkaufsflaeche", buffer, theVerkaufsflaeche, (this.verkaufsflaeche!= null));
        }
        {
            BigDecimal theFreiflaeche;
            theFreiflaeche = this.getFreiflaeche();
            strategy.appendField(locator, this, "freiflaeche", buffer, theFreiflaeche, (this.freiflaeche!= null));
        }
        {
            BigDecimal theBueroflaeche;
            theBueroflaeche = this.getBueroflaeche();
            strategy.appendField(locator, this, "bueroflaeche", buffer, theBueroflaeche, (this.bueroflaeche!= null));
        }
        {
            BigDecimal theBueroteilflaeche;
            theBueroteilflaeche = this.getBueroteilflaeche();
            strategy.appendField(locator, this, "bueroteilflaeche", buffer, theBueroteilflaeche, (this.bueroteilflaeche!= null));
        }
        {
            BigDecimal theFensterfront;
            theFensterfront = this.getFensterfront();
            strategy.appendField(locator, this, "fensterfront", buffer, theFensterfront, (this.fensterfront!= null));
        }
        {
            BigDecimal theVerwaltungsflaeche;
            theVerwaltungsflaeche = this.getVerwaltungsflaeche();
            strategy.appendField(locator, this, "verwaltungsflaeche", buffer, theVerwaltungsflaeche, (this.verwaltungsflaeche!= null));
        }
        {
            BigDecimal theGastroflaeche;
            theGastroflaeche = this.getGastroflaeche();
            strategy.appendField(locator, this, "gastroflaeche", buffer, theGastroflaeche, (this.gastroflaeche!= null));
        }
        {
            String theGrz;
            theGrz = this.getGrz();
            strategy.appendField(locator, this, "grz", buffer, theGrz, (this.grz!= null));
        }
        {
            String theGfz;
            theGfz = this.getGfz();
            strategy.appendField(locator, this, "gfz", buffer, theGfz, (this.gfz!= null));
        }
        {
            String theBmz;
            theBmz = this.getBmz();
            strategy.appendField(locator, this, "bmz", buffer, theBmz, (this.bmz!= null));
        }
        {
            String theBgf;
            theBgf = this.getBgf();
            strategy.appendField(locator, this, "bgf", buffer, theBgf, (this.bgf!= null));
        }
        {
            BigDecimal theGrundstuecksflaeche;
            theGrundstuecksflaeche = this.getGrundstuecksflaeche();
            strategy.appendField(locator, this, "grundstuecksflaeche", buffer, theGrundstuecksflaeche, (this.grundstuecksflaeche!= null));
        }
        {
            BigDecimal theSonstflaeche;
            theSonstflaeche = this.getSonstflaeche();
            strategy.appendField(locator, this, "sonstflaeche", buffer, theSonstflaeche, (this.sonstflaeche!= null));
        }
        {
            BigDecimal theAnzahlZimmer;
            theAnzahlZimmer = this.getAnzahlZimmer();
            strategy.appendField(locator, this, "anzahlZimmer", buffer, theAnzahlZimmer, (this.anzahlZimmer!= null));
        }
        {
            BigDecimal theAnzahlSchlafzimmer;
            theAnzahlSchlafzimmer = this.getAnzahlSchlafzimmer();
            strategy.appendField(locator, this, "anzahlSchlafzimmer", buffer, theAnzahlSchlafzimmer, (this.anzahlSchlafzimmer!= null));
        }
        {
            BigDecimal theAnzahlBadezimmer;
            theAnzahlBadezimmer = this.getAnzahlBadezimmer();
            strategy.appendField(locator, this, "anzahlBadezimmer", buffer, theAnzahlBadezimmer, (this.anzahlBadezimmer!= null));
        }
        {
            BigDecimal theAnzahlSepWc;
            theAnzahlSepWc = this.getAnzahlSepWc();
            strategy.appendField(locator, this, "anzahlSepWc", buffer, theAnzahlSepWc, (this.anzahlSepWc!= null));
        }
        {
            BigDecimal theAnzahlBalkone;
            theAnzahlBalkone = this.getAnzahlBalkone();
            strategy.appendField(locator, this, "anzahlBalkone", buffer, theAnzahlBalkone, (this.anzahlBalkone!= null));
        }
        {
            BigDecimal theAnzahlTerrassen;
            theAnzahlTerrassen = this.getAnzahlTerrassen();
            strategy.appendField(locator, this, "anzahlTerrassen", buffer, theAnzahlTerrassen, (this.anzahlTerrassen!= null));
        }
        {
            BigDecimal theAnzahlLogia;
            theAnzahlLogia = this.getAnzahlLogia();
            strategy.appendField(locator, this, "anzahlLogia", buffer, theAnzahlLogia, (this.anzahlLogia!= null));
        }
        {
            BigDecimal theBalkonTerrasseFlaeche;
            theBalkonTerrasseFlaeche = this.getBalkonTerrasseFlaeche();
            strategy.appendField(locator, this, "balkonTerrasseFlaeche", buffer, theBalkonTerrasseFlaeche, (this.balkonTerrasseFlaeche!= null));
        }
        {
            BigDecimal theAnzahlWohnSchlafzimmer;
            theAnzahlWohnSchlafzimmer = this.getAnzahlWohnSchlafzimmer();
            strategy.appendField(locator, this, "anzahlWohnSchlafzimmer", buffer, theAnzahlWohnSchlafzimmer, (this.anzahlWohnSchlafzimmer!= null));
        }
        {
            BigDecimal theGartenflaeche;
            theGartenflaeche = this.getGartenflaeche();
            strategy.appendField(locator, this, "gartenflaeche", buffer, theGartenflaeche, (this.gartenflaeche!= null));
        }
        {
            BigDecimal theKellerflaeche;
            theKellerflaeche = this.getKellerflaeche();
            strategy.appendField(locator, this, "kellerflaeche", buffer, theKellerflaeche, (this.kellerflaeche!= null));
        }
        {
            BigDecimal theFensterfrontQm;
            theFensterfrontQm = this.getFensterfrontQm();
            strategy.appendField(locator, this, "fensterfrontQm", buffer, theFensterfrontQm, (this.fensterfrontQm!= null));
        }
        {
            BigDecimal theGrundstuecksfront;
            theGrundstuecksfront = this.getGrundstuecksfront();
            strategy.appendField(locator, this, "grundstuecksfront", buffer, theGrundstuecksfront, (this.grundstuecksfront!= null));
        }
        {
            BigDecimal theDachbodenflaeche;
            theDachbodenflaeche = this.getDachbodenflaeche();
            strategy.appendField(locator, this, "dachbodenflaeche", buffer, theDachbodenflaeche, (this.dachbodenflaeche!= null));
        }
        {
            BigDecimal theTeilbarAb;
            theTeilbarAb = this.getTeilbarAb();
            strategy.appendField(locator, this, "teilbarAb", buffer, theTeilbarAb, (this.teilbarAb!= null));
        }
        {
            BigDecimal theBeheizbareFlaeche;
            theBeheizbareFlaeche = this.getBeheizbareFlaeche();
            strategy.appendField(locator, this, "beheizbareFlaeche", buffer, theBeheizbareFlaeche, (this.beheizbareFlaeche!= null));
        }
        {
            BigInteger theAnzahlStellplaetze;
            theAnzahlStellplaetze = this.getAnzahlStellplaetze();
            strategy.appendField(locator, this, "anzahlStellplaetze", buffer, theAnzahlStellplaetze, (this.anzahlStellplaetze!= null));
        }
        {
            BigDecimal thePlaetzeGastraum;
            thePlaetzeGastraum = this.getPlaetzeGastraum();
            strategy.appendField(locator, this, "plaetzeGastraum", buffer, thePlaetzeGastraum, (this.plaetzeGastraum!= null));
        }
        {
            BigDecimal theAnzahlBetten;
            theAnzahlBetten = this.getAnzahlBetten();
            strategy.appendField(locator, this, "anzahlBetten", buffer, theAnzahlBetten, (this.anzahlBetten!= null));
        }
        {
            BigDecimal theAnzahlTagungsraeume;
            theAnzahlTagungsraeume = this.getAnzahlTagungsraeume();
            strategy.appendField(locator, this, "anzahlTagungsraeume", buffer, theAnzahlTagungsraeume, (this.anzahlTagungsraeume!= null));
        }
        {
            BigDecimal theVermietbareFlaeche;
            theVermietbareFlaeche = this.getVermietbareFlaeche();
            strategy.appendField(locator, this, "vermietbareFlaeche", buffer, theVermietbareFlaeche, (this.vermietbareFlaeche!= null));
        }
        {
            BigDecimal theAnzahlWohneinheiten;
            theAnzahlWohneinheiten = this.getAnzahlWohneinheiten();
            strategy.appendField(locator, this, "anzahlWohneinheiten", buffer, theAnzahlWohneinheiten, (this.anzahlWohneinheiten!= null));
        }
        {
            BigDecimal theAnzahlGewerbeeinheiten;
            theAnzahlGewerbeeinheiten = this.getAnzahlGewerbeeinheiten();
            strategy.appendField(locator, this, "anzahlGewerbeeinheiten", buffer, theAnzahlGewerbeeinheiten, (this.anzahlGewerbeeinheiten!= null));
        }
        {
            Boolean theEinliegerwohnung;
            theEinliegerwohnung = this.isEinliegerwohnung();
            strategy.appendField(locator, this, "einliegerwohnung", buffer, theEinliegerwohnung, (this.einliegerwohnung!= null));
        }
        {
            BigDecimal theKubatur;
            theKubatur = this.getKubatur();
            strategy.appendField(locator, this, "kubatur", buffer, theKubatur, (this.kubatur!= null));
        }
        {
            BigDecimal theAusnuetzungsziffer;
            theAusnuetzungsziffer = this.getAusnuetzungsziffer();
            strategy.appendField(locator, this, "ausnuetzungsziffer", buffer, theAusnuetzungsziffer, (this.ausnuetzungsziffer!= null));
        }
        {
            BigDecimal theFlaechevon;
            theFlaechevon = this.getFlaechevon();
            strategy.appendField(locator, this, "flaechevon", buffer, theFlaechevon, (this.flaechevon!= null));
        }
        {
            BigDecimal theFlaechebis;
            theFlaechebis = this.getFlaechebis();
            strategy.appendField(locator, this, "flaechebis", buffer, theFlaechebis, (this.flaechebis!= null));
        }
        {
            List<UserDefinedSimplefield> theUserDefinedSimplefield;
            theUserDefinedSimplefield = (((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))?this.getUserDefinedSimplefield():null);
            strategy.appendField(locator, this, "userDefinedSimplefield", buffer, theUserDefinedSimplefield, ((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty())));
        }
        {
            List<UserDefinedAnyfield> theUserDefinedAnyfield;
            theUserDefinedAnyfield = (((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))?this.getUserDefinedAnyfield():null);
            strategy.appendField(locator, this, "userDefinedAnyfield", buffer, theUserDefinedAnyfield, ((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty())));
        }
        {
            List<UserDefinedExtend> theUserDefinedExtend;
            theUserDefinedExtend = (((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))?this.getUserDefinedExtend():null);
            strategy.appendField(locator, this, "userDefinedExtend", buffer, theUserDefinedExtend, ((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty())));
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Flaechen) {
            final Flaechen copy = ((Flaechen) draftCopy);
            {
                Boolean wohnflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wohnflaeche!= null));
                if (wohnflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceWohnflaeche;
                    sourceWohnflaeche = this.getWohnflaeche();
                    BigDecimal copyWohnflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "wohnflaeche", sourceWohnflaeche), sourceWohnflaeche, (this.wohnflaeche!= null)));
                    copy.setWohnflaeche(copyWohnflaeche);
                } else {
                    if (wohnflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wohnflaeche = null;
                    }
                }
            }
            {
                Boolean nutzflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nutzflaeche!= null));
                if (nutzflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceNutzflaeche;
                    sourceNutzflaeche = this.getNutzflaeche();
                    BigDecimal copyNutzflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "nutzflaeche", sourceNutzflaeche), sourceNutzflaeche, (this.nutzflaeche!= null)));
                    copy.setNutzflaeche(copyNutzflaeche);
                } else {
                    if (nutzflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nutzflaeche = null;
                    }
                }
            }
            {
                Boolean gesamtflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gesamtflaeche!= null));
                if (gesamtflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceGesamtflaeche;
                    sourceGesamtflaeche = this.getGesamtflaeche();
                    BigDecimal copyGesamtflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "gesamtflaeche", sourceGesamtflaeche), sourceGesamtflaeche, (this.gesamtflaeche!= null)));
                    copy.setGesamtflaeche(copyGesamtflaeche);
                } else {
                    if (gesamtflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gesamtflaeche = null;
                    }
                }
            }
            {
                Boolean ladenflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ladenflaeche!= null));
                if (ladenflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceLadenflaeche;
                    sourceLadenflaeche = this.getLadenflaeche();
                    BigDecimal copyLadenflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "ladenflaeche", sourceLadenflaeche), sourceLadenflaeche, (this.ladenflaeche!= null)));
                    copy.setLadenflaeche(copyLadenflaeche);
                } else {
                    if (ladenflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ladenflaeche = null;
                    }
                }
            }
            {
                Boolean lagerflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lagerflaeche!= null));
                if (lagerflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceLagerflaeche;
                    sourceLagerflaeche = this.getLagerflaeche();
                    BigDecimal copyLagerflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "lagerflaeche", sourceLagerflaeche), sourceLagerflaeche, (this.lagerflaeche!= null)));
                    copy.setLagerflaeche(copyLagerflaeche);
                } else {
                    if (lagerflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lagerflaeche = null;
                    }
                }
            }
            {
                Boolean verkaufsflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.verkaufsflaeche!= null));
                if (verkaufsflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceVerkaufsflaeche;
                    sourceVerkaufsflaeche = this.getVerkaufsflaeche();
                    BigDecimal copyVerkaufsflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "verkaufsflaeche", sourceVerkaufsflaeche), sourceVerkaufsflaeche, (this.verkaufsflaeche!= null)));
                    copy.setVerkaufsflaeche(copyVerkaufsflaeche);
                } else {
                    if (verkaufsflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.verkaufsflaeche = null;
                    }
                }
            }
            {
                Boolean freiflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.freiflaeche!= null));
                if (freiflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceFreiflaeche;
                    sourceFreiflaeche = this.getFreiflaeche();
                    BigDecimal copyFreiflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "freiflaeche", sourceFreiflaeche), sourceFreiflaeche, (this.freiflaeche!= null)));
                    copy.setFreiflaeche(copyFreiflaeche);
                } else {
                    if (freiflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.freiflaeche = null;
                    }
                }
            }
            {
                Boolean bueroflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bueroflaeche!= null));
                if (bueroflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceBueroflaeche;
                    sourceBueroflaeche = this.getBueroflaeche();
                    BigDecimal copyBueroflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "bueroflaeche", sourceBueroflaeche), sourceBueroflaeche, (this.bueroflaeche!= null)));
                    copy.setBueroflaeche(copyBueroflaeche);
                } else {
                    if (bueroflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bueroflaeche = null;
                    }
                }
            }
            {
                Boolean bueroteilflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bueroteilflaeche!= null));
                if (bueroteilflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceBueroteilflaeche;
                    sourceBueroteilflaeche = this.getBueroteilflaeche();
                    BigDecimal copyBueroteilflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "bueroteilflaeche", sourceBueroteilflaeche), sourceBueroteilflaeche, (this.bueroteilflaeche!= null)));
                    copy.setBueroteilflaeche(copyBueroteilflaeche);
                } else {
                    if (bueroteilflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bueroteilflaeche = null;
                    }
                }
            }
            {
                Boolean fensterfrontShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fensterfront!= null));
                if (fensterfrontShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceFensterfront;
                    sourceFensterfront = this.getFensterfront();
                    BigDecimal copyFensterfront = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "fensterfront", sourceFensterfront), sourceFensterfront, (this.fensterfront!= null)));
                    copy.setFensterfront(copyFensterfront);
                } else {
                    if (fensterfrontShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fensterfront = null;
                    }
                }
            }
            {
                Boolean verwaltungsflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.verwaltungsflaeche!= null));
                if (verwaltungsflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceVerwaltungsflaeche;
                    sourceVerwaltungsflaeche = this.getVerwaltungsflaeche();
                    BigDecimal copyVerwaltungsflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "verwaltungsflaeche", sourceVerwaltungsflaeche), sourceVerwaltungsflaeche, (this.verwaltungsflaeche!= null)));
                    copy.setVerwaltungsflaeche(copyVerwaltungsflaeche);
                } else {
                    if (verwaltungsflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.verwaltungsflaeche = null;
                    }
                }
            }
            {
                Boolean gastroflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gastroflaeche!= null));
                if (gastroflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceGastroflaeche;
                    sourceGastroflaeche = this.getGastroflaeche();
                    BigDecimal copyGastroflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "gastroflaeche", sourceGastroflaeche), sourceGastroflaeche, (this.gastroflaeche!= null)));
                    copy.setGastroflaeche(copyGastroflaeche);
                } else {
                    if (gastroflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gastroflaeche = null;
                    }
                }
            }
            {
                Boolean grzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.grz!= null));
                if (grzShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceGrz;
                    sourceGrz = this.getGrz();
                    String copyGrz = ((String) strategy.copy(LocatorUtils.property(locator, "grz", sourceGrz), sourceGrz, (this.grz!= null)));
                    copy.setGrz(copyGrz);
                } else {
                    if (grzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.grz = null;
                    }
                }
            }
            {
                Boolean gfzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gfz!= null));
                if (gfzShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceGfz;
                    sourceGfz = this.getGfz();
                    String copyGfz = ((String) strategy.copy(LocatorUtils.property(locator, "gfz", sourceGfz), sourceGfz, (this.gfz!= null)));
                    copy.setGfz(copyGfz);
                } else {
                    if (gfzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gfz = null;
                    }
                }
            }
            {
                Boolean bmzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bmz!= null));
                if (bmzShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBmz;
                    sourceBmz = this.getBmz();
                    String copyBmz = ((String) strategy.copy(LocatorUtils.property(locator, "bmz", sourceBmz), sourceBmz, (this.bmz!= null)));
                    copy.setBmz(copyBmz);
                } else {
                    if (bmzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bmz = null;
                    }
                }
            }
            {
                Boolean bgfShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bgf!= null));
                if (bgfShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBgf;
                    sourceBgf = this.getBgf();
                    String copyBgf = ((String) strategy.copy(LocatorUtils.property(locator, "bgf", sourceBgf), sourceBgf, (this.bgf!= null)));
                    copy.setBgf(copyBgf);
                } else {
                    if (bgfShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bgf = null;
                    }
                }
            }
            {
                Boolean grundstuecksflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.grundstuecksflaeche!= null));
                if (grundstuecksflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceGrundstuecksflaeche;
                    sourceGrundstuecksflaeche = this.getGrundstuecksflaeche();
                    BigDecimal copyGrundstuecksflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "grundstuecksflaeche", sourceGrundstuecksflaeche), sourceGrundstuecksflaeche, (this.grundstuecksflaeche!= null)));
                    copy.setGrundstuecksflaeche(copyGrundstuecksflaeche);
                } else {
                    if (grundstuecksflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.grundstuecksflaeche = null;
                    }
                }
            }
            {
                Boolean sonstflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sonstflaeche!= null));
                if (sonstflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceSonstflaeche;
                    sourceSonstflaeche = this.getSonstflaeche();
                    BigDecimal copySonstflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "sonstflaeche", sourceSonstflaeche), sourceSonstflaeche, (this.sonstflaeche!= null)));
                    copy.setSonstflaeche(copySonstflaeche);
                } else {
                    if (sonstflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sonstflaeche = null;
                    }
                }
            }
            {
                Boolean anzahlZimmerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlZimmer!= null));
                if (anzahlZimmerShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceAnzahlZimmer;
                    sourceAnzahlZimmer = this.getAnzahlZimmer();
                    BigDecimal copyAnzahlZimmer = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "anzahlZimmer", sourceAnzahlZimmer), sourceAnzahlZimmer, (this.anzahlZimmer!= null)));
                    copy.setAnzahlZimmer(copyAnzahlZimmer);
                } else {
                    if (anzahlZimmerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlZimmer = null;
                    }
                }
            }
            {
                Boolean anzahlSchlafzimmerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlSchlafzimmer!= null));
                if (anzahlSchlafzimmerShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceAnzahlSchlafzimmer;
                    sourceAnzahlSchlafzimmer = this.getAnzahlSchlafzimmer();
                    BigDecimal copyAnzahlSchlafzimmer = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "anzahlSchlafzimmer", sourceAnzahlSchlafzimmer), sourceAnzahlSchlafzimmer, (this.anzahlSchlafzimmer!= null)));
                    copy.setAnzahlSchlafzimmer(copyAnzahlSchlafzimmer);
                } else {
                    if (anzahlSchlafzimmerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlSchlafzimmer = null;
                    }
                }
            }
            {
                Boolean anzahlBadezimmerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlBadezimmer!= null));
                if (anzahlBadezimmerShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceAnzahlBadezimmer;
                    sourceAnzahlBadezimmer = this.getAnzahlBadezimmer();
                    BigDecimal copyAnzahlBadezimmer = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "anzahlBadezimmer", sourceAnzahlBadezimmer), sourceAnzahlBadezimmer, (this.anzahlBadezimmer!= null)));
                    copy.setAnzahlBadezimmer(copyAnzahlBadezimmer);
                } else {
                    if (anzahlBadezimmerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlBadezimmer = null;
                    }
                }
            }
            {
                Boolean anzahlSepWcShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlSepWc!= null));
                if (anzahlSepWcShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceAnzahlSepWc;
                    sourceAnzahlSepWc = this.getAnzahlSepWc();
                    BigDecimal copyAnzahlSepWc = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "anzahlSepWc", sourceAnzahlSepWc), sourceAnzahlSepWc, (this.anzahlSepWc!= null)));
                    copy.setAnzahlSepWc(copyAnzahlSepWc);
                } else {
                    if (anzahlSepWcShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlSepWc = null;
                    }
                }
            }
            {
                Boolean anzahlBalkoneShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlBalkone!= null));
                if (anzahlBalkoneShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceAnzahlBalkone;
                    sourceAnzahlBalkone = this.getAnzahlBalkone();
                    BigDecimal copyAnzahlBalkone = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "anzahlBalkone", sourceAnzahlBalkone), sourceAnzahlBalkone, (this.anzahlBalkone!= null)));
                    copy.setAnzahlBalkone(copyAnzahlBalkone);
                } else {
                    if (anzahlBalkoneShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlBalkone = null;
                    }
                }
            }
            {
                Boolean anzahlTerrassenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlTerrassen!= null));
                if (anzahlTerrassenShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceAnzahlTerrassen;
                    sourceAnzahlTerrassen = this.getAnzahlTerrassen();
                    BigDecimal copyAnzahlTerrassen = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "anzahlTerrassen", sourceAnzahlTerrassen), sourceAnzahlTerrassen, (this.anzahlTerrassen!= null)));
                    copy.setAnzahlTerrassen(copyAnzahlTerrassen);
                } else {
                    if (anzahlTerrassenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlTerrassen = null;
                    }
                }
            }
            {
                Boolean anzahlLogiaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlLogia!= null));
                if (anzahlLogiaShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceAnzahlLogia;
                    sourceAnzahlLogia = this.getAnzahlLogia();
                    BigDecimal copyAnzahlLogia = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "anzahlLogia", sourceAnzahlLogia), sourceAnzahlLogia, (this.anzahlLogia!= null)));
                    copy.setAnzahlLogia(copyAnzahlLogia);
                } else {
                    if (anzahlLogiaShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlLogia = null;
                    }
                }
            }
            {
                Boolean balkonTerrasseFlaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.balkonTerrasseFlaeche!= null));
                if (balkonTerrasseFlaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceBalkonTerrasseFlaeche;
                    sourceBalkonTerrasseFlaeche = this.getBalkonTerrasseFlaeche();
                    BigDecimal copyBalkonTerrasseFlaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "balkonTerrasseFlaeche", sourceBalkonTerrasseFlaeche), sourceBalkonTerrasseFlaeche, (this.balkonTerrasseFlaeche!= null)));
                    copy.setBalkonTerrasseFlaeche(copyBalkonTerrasseFlaeche);
                } else {
                    if (balkonTerrasseFlaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.balkonTerrasseFlaeche = null;
                    }
                }
            }
            {
                Boolean anzahlWohnSchlafzimmerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlWohnSchlafzimmer!= null));
                if (anzahlWohnSchlafzimmerShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceAnzahlWohnSchlafzimmer;
                    sourceAnzahlWohnSchlafzimmer = this.getAnzahlWohnSchlafzimmer();
                    BigDecimal copyAnzahlWohnSchlafzimmer = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "anzahlWohnSchlafzimmer", sourceAnzahlWohnSchlafzimmer), sourceAnzahlWohnSchlafzimmer, (this.anzahlWohnSchlafzimmer!= null)));
                    copy.setAnzahlWohnSchlafzimmer(copyAnzahlWohnSchlafzimmer);
                } else {
                    if (anzahlWohnSchlafzimmerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlWohnSchlafzimmer = null;
                    }
                }
            }
            {
                Boolean gartenflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gartenflaeche!= null));
                if (gartenflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceGartenflaeche;
                    sourceGartenflaeche = this.getGartenflaeche();
                    BigDecimal copyGartenflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "gartenflaeche", sourceGartenflaeche), sourceGartenflaeche, (this.gartenflaeche!= null)));
                    copy.setGartenflaeche(copyGartenflaeche);
                } else {
                    if (gartenflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gartenflaeche = null;
                    }
                }
            }
            {
                Boolean kellerflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kellerflaeche!= null));
                if (kellerflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceKellerflaeche;
                    sourceKellerflaeche = this.getKellerflaeche();
                    BigDecimal copyKellerflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "kellerflaeche", sourceKellerflaeche), sourceKellerflaeche, (this.kellerflaeche!= null)));
                    copy.setKellerflaeche(copyKellerflaeche);
                } else {
                    if (kellerflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kellerflaeche = null;
                    }
                }
            }
            {
                Boolean fensterfrontQmShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fensterfrontQm!= null));
                if (fensterfrontQmShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceFensterfrontQm;
                    sourceFensterfrontQm = this.getFensterfrontQm();
                    BigDecimal copyFensterfrontQm = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "fensterfrontQm", sourceFensterfrontQm), sourceFensterfrontQm, (this.fensterfrontQm!= null)));
                    copy.setFensterfrontQm(copyFensterfrontQm);
                } else {
                    if (fensterfrontQmShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fensterfrontQm = null;
                    }
                }
            }
            {
                Boolean grundstuecksfrontShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.grundstuecksfront!= null));
                if (grundstuecksfrontShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceGrundstuecksfront;
                    sourceGrundstuecksfront = this.getGrundstuecksfront();
                    BigDecimal copyGrundstuecksfront = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "grundstuecksfront", sourceGrundstuecksfront), sourceGrundstuecksfront, (this.grundstuecksfront!= null)));
                    copy.setGrundstuecksfront(copyGrundstuecksfront);
                } else {
                    if (grundstuecksfrontShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.grundstuecksfront = null;
                    }
                }
            }
            {
                Boolean dachbodenflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dachbodenflaeche!= null));
                if (dachbodenflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceDachbodenflaeche;
                    sourceDachbodenflaeche = this.getDachbodenflaeche();
                    BigDecimal copyDachbodenflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "dachbodenflaeche", sourceDachbodenflaeche), sourceDachbodenflaeche, (this.dachbodenflaeche!= null)));
                    copy.setDachbodenflaeche(copyDachbodenflaeche);
                } else {
                    if (dachbodenflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dachbodenflaeche = null;
                    }
                }
            }
            {
                Boolean teilbarAbShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.teilbarAb!= null));
                if (teilbarAbShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceTeilbarAb;
                    sourceTeilbarAb = this.getTeilbarAb();
                    BigDecimal copyTeilbarAb = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "teilbarAb", sourceTeilbarAb), sourceTeilbarAb, (this.teilbarAb!= null)));
                    copy.setTeilbarAb(copyTeilbarAb);
                } else {
                    if (teilbarAbShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.teilbarAb = null;
                    }
                }
            }
            {
                Boolean beheizbareFlaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.beheizbareFlaeche!= null));
                if (beheizbareFlaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceBeheizbareFlaeche;
                    sourceBeheizbareFlaeche = this.getBeheizbareFlaeche();
                    BigDecimal copyBeheizbareFlaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "beheizbareFlaeche", sourceBeheizbareFlaeche), sourceBeheizbareFlaeche, (this.beheizbareFlaeche!= null)));
                    copy.setBeheizbareFlaeche(copyBeheizbareFlaeche);
                } else {
                    if (beheizbareFlaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.beheizbareFlaeche = null;
                    }
                }
            }
            {
                Boolean anzahlStellplaetzeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlStellplaetze!= null));
                if (anzahlStellplaetzeShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceAnzahlStellplaetze;
                    sourceAnzahlStellplaetze = this.getAnzahlStellplaetze();
                    BigInteger copyAnzahlStellplaetze = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "anzahlStellplaetze", sourceAnzahlStellplaetze), sourceAnzahlStellplaetze, (this.anzahlStellplaetze!= null)));
                    copy.setAnzahlStellplaetze(copyAnzahlStellplaetze);
                } else {
                    if (anzahlStellplaetzeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlStellplaetze = null;
                    }
                }
            }
            {
                Boolean plaetzeGastraumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.plaetzeGastraum!= null));
                if (plaetzeGastraumShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourcePlaetzeGastraum;
                    sourcePlaetzeGastraum = this.getPlaetzeGastraum();
                    BigDecimal copyPlaetzeGastraum = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "plaetzeGastraum", sourcePlaetzeGastraum), sourcePlaetzeGastraum, (this.plaetzeGastraum!= null)));
                    copy.setPlaetzeGastraum(copyPlaetzeGastraum);
                } else {
                    if (plaetzeGastraumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.plaetzeGastraum = null;
                    }
                }
            }
            {
                Boolean anzahlBettenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlBetten!= null));
                if (anzahlBettenShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceAnzahlBetten;
                    sourceAnzahlBetten = this.getAnzahlBetten();
                    BigDecimal copyAnzahlBetten = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "anzahlBetten", sourceAnzahlBetten), sourceAnzahlBetten, (this.anzahlBetten!= null)));
                    copy.setAnzahlBetten(copyAnzahlBetten);
                } else {
                    if (anzahlBettenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlBetten = null;
                    }
                }
            }
            {
                Boolean anzahlTagungsraeumeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlTagungsraeume!= null));
                if (anzahlTagungsraeumeShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceAnzahlTagungsraeume;
                    sourceAnzahlTagungsraeume = this.getAnzahlTagungsraeume();
                    BigDecimal copyAnzahlTagungsraeume = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "anzahlTagungsraeume", sourceAnzahlTagungsraeume), sourceAnzahlTagungsraeume, (this.anzahlTagungsraeume!= null)));
                    copy.setAnzahlTagungsraeume(copyAnzahlTagungsraeume);
                } else {
                    if (anzahlTagungsraeumeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlTagungsraeume = null;
                    }
                }
            }
            {
                Boolean vermietbareFlaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vermietbareFlaeche!= null));
                if (vermietbareFlaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceVermietbareFlaeche;
                    sourceVermietbareFlaeche = this.getVermietbareFlaeche();
                    BigDecimal copyVermietbareFlaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "vermietbareFlaeche", sourceVermietbareFlaeche), sourceVermietbareFlaeche, (this.vermietbareFlaeche!= null)));
                    copy.setVermietbareFlaeche(copyVermietbareFlaeche);
                } else {
                    if (vermietbareFlaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vermietbareFlaeche = null;
                    }
                }
            }
            {
                Boolean anzahlWohneinheitenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlWohneinheiten!= null));
                if (anzahlWohneinheitenShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceAnzahlWohneinheiten;
                    sourceAnzahlWohneinheiten = this.getAnzahlWohneinheiten();
                    BigDecimal copyAnzahlWohneinheiten = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "anzahlWohneinheiten", sourceAnzahlWohneinheiten), sourceAnzahlWohneinheiten, (this.anzahlWohneinheiten!= null)));
                    copy.setAnzahlWohneinheiten(copyAnzahlWohneinheiten);
                } else {
                    if (anzahlWohneinheitenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlWohneinheiten = null;
                    }
                }
            }
            {
                Boolean anzahlGewerbeeinheitenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlGewerbeeinheiten!= null));
                if (anzahlGewerbeeinheitenShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceAnzahlGewerbeeinheiten;
                    sourceAnzahlGewerbeeinheiten = this.getAnzahlGewerbeeinheiten();
                    BigDecimal copyAnzahlGewerbeeinheiten = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "anzahlGewerbeeinheiten", sourceAnzahlGewerbeeinheiten), sourceAnzahlGewerbeeinheiten, (this.anzahlGewerbeeinheiten!= null)));
                    copy.setAnzahlGewerbeeinheiten(copyAnzahlGewerbeeinheiten);
                } else {
                    if (anzahlGewerbeeinheitenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlGewerbeeinheiten = null;
                    }
                }
            }
            {
                Boolean einliegerwohnungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.einliegerwohnung!= null));
                if (einliegerwohnungShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceEinliegerwohnung;
                    sourceEinliegerwohnung = this.isEinliegerwohnung();
                    Boolean copyEinliegerwohnung = ((Boolean) strategy.copy(LocatorUtils.property(locator, "einliegerwohnung", sourceEinliegerwohnung), sourceEinliegerwohnung, (this.einliegerwohnung!= null)));
                    copy.setEinliegerwohnung(copyEinliegerwohnung);
                } else {
                    if (einliegerwohnungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.einliegerwohnung = null;
                    }
                }
            }
            {
                Boolean kubaturShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kubatur!= null));
                if (kubaturShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceKubatur;
                    sourceKubatur = this.getKubatur();
                    BigDecimal copyKubatur = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "kubatur", sourceKubatur), sourceKubatur, (this.kubatur!= null)));
                    copy.setKubatur(copyKubatur);
                } else {
                    if (kubaturShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kubatur = null;
                    }
                }
            }
            {
                Boolean ausnuetzungszifferShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ausnuetzungsziffer!= null));
                if (ausnuetzungszifferShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceAusnuetzungsziffer;
                    sourceAusnuetzungsziffer = this.getAusnuetzungsziffer();
                    BigDecimal copyAusnuetzungsziffer = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "ausnuetzungsziffer", sourceAusnuetzungsziffer), sourceAusnuetzungsziffer, (this.ausnuetzungsziffer!= null)));
                    copy.setAusnuetzungsziffer(copyAusnuetzungsziffer);
                } else {
                    if (ausnuetzungszifferShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ausnuetzungsziffer = null;
                    }
                }
            }
            {
                Boolean flaechevonShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.flaechevon!= null));
                if (flaechevonShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceFlaechevon;
                    sourceFlaechevon = this.getFlaechevon();
                    BigDecimal copyFlaechevon = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "flaechevon", sourceFlaechevon), sourceFlaechevon, (this.flaechevon!= null)));
                    copy.setFlaechevon(copyFlaechevon);
                } else {
                    if (flaechevonShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.flaechevon = null;
                    }
                }
            }
            {
                Boolean flaechebisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.flaechebis!= null));
                if (flaechebisShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceFlaechebis;
                    sourceFlaechebis = this.getFlaechebis();
                    BigDecimal copyFlaechebis = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "flaechebis", sourceFlaechebis), sourceFlaechebis, (this.flaechebis!= null)));
                    copy.setFlaechebis(copyFlaechebis);
                } else {
                    if (flaechebisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.flaechebis = null;
                    }
                }
            }
            {
                Boolean userDefinedSimplefieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty())));
                if (userDefinedSimplefieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<UserDefinedSimplefield> sourceUserDefinedSimplefield;
                    sourceUserDefinedSimplefield = (((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))?this.getUserDefinedSimplefield():null);
                    @SuppressWarnings("unchecked")
                    List<UserDefinedSimplefield> copyUserDefinedSimplefield = ((List<UserDefinedSimplefield> ) strategy.copy(LocatorUtils.property(locator, "userDefinedSimplefield", sourceUserDefinedSimplefield), sourceUserDefinedSimplefield, ((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))));
                    copy.userDefinedSimplefield = null;
                    if (copyUserDefinedSimplefield!= null) {
                        List<UserDefinedSimplefield> uniqueUserDefinedSimplefieldl = copy.getUserDefinedSimplefield();
                        uniqueUserDefinedSimplefieldl.addAll(copyUserDefinedSimplefield);
                    }
                } else {
                    if (userDefinedSimplefieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.userDefinedSimplefield = null;
                    }
                }
            }
            {
                Boolean userDefinedAnyfieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty())));
                if (userDefinedAnyfieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<UserDefinedAnyfield> sourceUserDefinedAnyfield;
                    sourceUserDefinedAnyfield = (((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))?this.getUserDefinedAnyfield():null);
                    @SuppressWarnings("unchecked")
                    List<UserDefinedAnyfield> copyUserDefinedAnyfield = ((List<UserDefinedAnyfield> ) strategy.copy(LocatorUtils.property(locator, "userDefinedAnyfield", sourceUserDefinedAnyfield), sourceUserDefinedAnyfield, ((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))));
                    copy.userDefinedAnyfield = null;
                    if (copyUserDefinedAnyfield!= null) {
                        List<UserDefinedAnyfield> uniqueUserDefinedAnyfieldl = copy.getUserDefinedAnyfield();
                        uniqueUserDefinedAnyfieldl.addAll(copyUserDefinedAnyfield);
                    }
                } else {
                    if (userDefinedAnyfieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.userDefinedAnyfield = null;
                    }
                }
            }
            {
                Boolean userDefinedExtendShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty())));
                if (userDefinedExtendShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<UserDefinedExtend> sourceUserDefinedExtend;
                    sourceUserDefinedExtend = (((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))?this.getUserDefinedExtend():null);
                    @SuppressWarnings("unchecked")
                    List<UserDefinedExtend> copyUserDefinedExtend = ((List<UserDefinedExtend> ) strategy.copy(LocatorUtils.property(locator, "userDefinedExtend", sourceUserDefinedExtend), sourceUserDefinedExtend, ((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))));
                    copy.userDefinedExtend = null;
                    if (copyUserDefinedExtend!= null) {
                        List<UserDefinedExtend> uniqueUserDefinedExtendl = copy.getUserDefinedExtend();
                        uniqueUserDefinedExtendl.addAll(copyUserDefinedExtend);
                    }
                } else {
                    if (userDefinedExtendShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.userDefinedExtend = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Flaechen();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Flaechen that = ((Flaechen) object);
        {
            BigDecimal lhsWohnflaeche;
            lhsWohnflaeche = this.getWohnflaeche();
            BigDecimal rhsWohnflaeche;
            rhsWohnflaeche = that.getWohnflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wohnflaeche", lhsWohnflaeche), LocatorUtils.property(thatLocator, "wohnflaeche", rhsWohnflaeche), lhsWohnflaeche, rhsWohnflaeche, (this.wohnflaeche!= null), (that.wohnflaeche!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsNutzflaeche;
            lhsNutzflaeche = this.getNutzflaeche();
            BigDecimal rhsNutzflaeche;
            rhsNutzflaeche = that.getNutzflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nutzflaeche", lhsNutzflaeche), LocatorUtils.property(thatLocator, "nutzflaeche", rhsNutzflaeche), lhsNutzflaeche, rhsNutzflaeche, (this.nutzflaeche!= null), (that.nutzflaeche!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsGesamtflaeche;
            lhsGesamtflaeche = this.getGesamtflaeche();
            BigDecimal rhsGesamtflaeche;
            rhsGesamtflaeche = that.getGesamtflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gesamtflaeche", lhsGesamtflaeche), LocatorUtils.property(thatLocator, "gesamtflaeche", rhsGesamtflaeche), lhsGesamtflaeche, rhsGesamtflaeche, (this.gesamtflaeche!= null), (that.gesamtflaeche!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsLadenflaeche;
            lhsLadenflaeche = this.getLadenflaeche();
            BigDecimal rhsLadenflaeche;
            rhsLadenflaeche = that.getLadenflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ladenflaeche", lhsLadenflaeche), LocatorUtils.property(thatLocator, "ladenflaeche", rhsLadenflaeche), lhsLadenflaeche, rhsLadenflaeche, (this.ladenflaeche!= null), (that.ladenflaeche!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsLagerflaeche;
            lhsLagerflaeche = this.getLagerflaeche();
            BigDecimal rhsLagerflaeche;
            rhsLagerflaeche = that.getLagerflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lagerflaeche", lhsLagerflaeche), LocatorUtils.property(thatLocator, "lagerflaeche", rhsLagerflaeche), lhsLagerflaeche, rhsLagerflaeche, (this.lagerflaeche!= null), (that.lagerflaeche!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsVerkaufsflaeche;
            lhsVerkaufsflaeche = this.getVerkaufsflaeche();
            BigDecimal rhsVerkaufsflaeche;
            rhsVerkaufsflaeche = that.getVerkaufsflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verkaufsflaeche", lhsVerkaufsflaeche), LocatorUtils.property(thatLocator, "verkaufsflaeche", rhsVerkaufsflaeche), lhsVerkaufsflaeche, rhsVerkaufsflaeche, (this.verkaufsflaeche!= null), (that.verkaufsflaeche!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsFreiflaeche;
            lhsFreiflaeche = this.getFreiflaeche();
            BigDecimal rhsFreiflaeche;
            rhsFreiflaeche = that.getFreiflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freiflaeche", lhsFreiflaeche), LocatorUtils.property(thatLocator, "freiflaeche", rhsFreiflaeche), lhsFreiflaeche, rhsFreiflaeche, (this.freiflaeche!= null), (that.freiflaeche!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsBueroflaeche;
            lhsBueroflaeche = this.getBueroflaeche();
            BigDecimal rhsBueroflaeche;
            rhsBueroflaeche = that.getBueroflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bueroflaeche", lhsBueroflaeche), LocatorUtils.property(thatLocator, "bueroflaeche", rhsBueroflaeche), lhsBueroflaeche, rhsBueroflaeche, (this.bueroflaeche!= null), (that.bueroflaeche!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsBueroteilflaeche;
            lhsBueroteilflaeche = this.getBueroteilflaeche();
            BigDecimal rhsBueroteilflaeche;
            rhsBueroteilflaeche = that.getBueroteilflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bueroteilflaeche", lhsBueroteilflaeche), LocatorUtils.property(thatLocator, "bueroteilflaeche", rhsBueroteilflaeche), lhsBueroteilflaeche, rhsBueroteilflaeche, (this.bueroteilflaeche!= null), (that.bueroteilflaeche!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsFensterfront;
            lhsFensterfront = this.getFensterfront();
            BigDecimal rhsFensterfront;
            rhsFensterfront = that.getFensterfront();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fensterfront", lhsFensterfront), LocatorUtils.property(thatLocator, "fensterfront", rhsFensterfront), lhsFensterfront, rhsFensterfront, (this.fensterfront!= null), (that.fensterfront!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsVerwaltungsflaeche;
            lhsVerwaltungsflaeche = this.getVerwaltungsflaeche();
            BigDecimal rhsVerwaltungsflaeche;
            rhsVerwaltungsflaeche = that.getVerwaltungsflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verwaltungsflaeche", lhsVerwaltungsflaeche), LocatorUtils.property(thatLocator, "verwaltungsflaeche", rhsVerwaltungsflaeche), lhsVerwaltungsflaeche, rhsVerwaltungsflaeche, (this.verwaltungsflaeche!= null), (that.verwaltungsflaeche!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsGastroflaeche;
            lhsGastroflaeche = this.getGastroflaeche();
            BigDecimal rhsGastroflaeche;
            rhsGastroflaeche = that.getGastroflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gastroflaeche", lhsGastroflaeche), LocatorUtils.property(thatLocator, "gastroflaeche", rhsGastroflaeche), lhsGastroflaeche, rhsGastroflaeche, (this.gastroflaeche!= null), (that.gastroflaeche!= null))) {
                return false;
            }
        }
        {
            String lhsGrz;
            lhsGrz = this.getGrz();
            String rhsGrz;
            rhsGrz = that.getGrz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grz", lhsGrz), LocatorUtils.property(thatLocator, "grz", rhsGrz), lhsGrz, rhsGrz, (this.grz!= null), (that.grz!= null))) {
                return false;
            }
        }
        {
            String lhsGfz;
            lhsGfz = this.getGfz();
            String rhsGfz;
            rhsGfz = that.getGfz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gfz", lhsGfz), LocatorUtils.property(thatLocator, "gfz", rhsGfz), lhsGfz, rhsGfz, (this.gfz!= null), (that.gfz!= null))) {
                return false;
            }
        }
        {
            String lhsBmz;
            lhsBmz = this.getBmz();
            String rhsBmz;
            rhsBmz = that.getBmz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bmz", lhsBmz), LocatorUtils.property(thatLocator, "bmz", rhsBmz), lhsBmz, rhsBmz, (this.bmz!= null), (that.bmz!= null))) {
                return false;
            }
        }
        {
            String lhsBgf;
            lhsBgf = this.getBgf();
            String rhsBgf;
            rhsBgf = that.getBgf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bgf", lhsBgf), LocatorUtils.property(thatLocator, "bgf", rhsBgf), lhsBgf, rhsBgf, (this.bgf!= null), (that.bgf!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsGrundstuecksflaeche;
            lhsGrundstuecksflaeche = this.getGrundstuecksflaeche();
            BigDecimal rhsGrundstuecksflaeche;
            rhsGrundstuecksflaeche = that.getGrundstuecksflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grundstuecksflaeche", lhsGrundstuecksflaeche), LocatorUtils.property(thatLocator, "grundstuecksflaeche", rhsGrundstuecksflaeche), lhsGrundstuecksflaeche, rhsGrundstuecksflaeche, (this.grundstuecksflaeche!= null), (that.grundstuecksflaeche!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsSonstflaeche;
            lhsSonstflaeche = this.getSonstflaeche();
            BigDecimal rhsSonstflaeche;
            rhsSonstflaeche = that.getSonstflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sonstflaeche", lhsSonstflaeche), LocatorUtils.property(thatLocator, "sonstflaeche", rhsSonstflaeche), lhsSonstflaeche, rhsSonstflaeche, (this.sonstflaeche!= null), (that.sonstflaeche!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsAnzahlZimmer;
            lhsAnzahlZimmer = this.getAnzahlZimmer();
            BigDecimal rhsAnzahlZimmer;
            rhsAnzahlZimmer = that.getAnzahlZimmer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlZimmer", lhsAnzahlZimmer), LocatorUtils.property(thatLocator, "anzahlZimmer", rhsAnzahlZimmer), lhsAnzahlZimmer, rhsAnzahlZimmer, (this.anzahlZimmer!= null), (that.anzahlZimmer!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsAnzahlSchlafzimmer;
            lhsAnzahlSchlafzimmer = this.getAnzahlSchlafzimmer();
            BigDecimal rhsAnzahlSchlafzimmer;
            rhsAnzahlSchlafzimmer = that.getAnzahlSchlafzimmer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlSchlafzimmer", lhsAnzahlSchlafzimmer), LocatorUtils.property(thatLocator, "anzahlSchlafzimmer", rhsAnzahlSchlafzimmer), lhsAnzahlSchlafzimmer, rhsAnzahlSchlafzimmer, (this.anzahlSchlafzimmer!= null), (that.anzahlSchlafzimmer!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsAnzahlBadezimmer;
            lhsAnzahlBadezimmer = this.getAnzahlBadezimmer();
            BigDecimal rhsAnzahlBadezimmer;
            rhsAnzahlBadezimmer = that.getAnzahlBadezimmer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlBadezimmer", lhsAnzahlBadezimmer), LocatorUtils.property(thatLocator, "anzahlBadezimmer", rhsAnzahlBadezimmer), lhsAnzahlBadezimmer, rhsAnzahlBadezimmer, (this.anzahlBadezimmer!= null), (that.anzahlBadezimmer!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsAnzahlSepWc;
            lhsAnzahlSepWc = this.getAnzahlSepWc();
            BigDecimal rhsAnzahlSepWc;
            rhsAnzahlSepWc = that.getAnzahlSepWc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlSepWc", lhsAnzahlSepWc), LocatorUtils.property(thatLocator, "anzahlSepWc", rhsAnzahlSepWc), lhsAnzahlSepWc, rhsAnzahlSepWc, (this.anzahlSepWc!= null), (that.anzahlSepWc!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsAnzahlBalkone;
            lhsAnzahlBalkone = this.getAnzahlBalkone();
            BigDecimal rhsAnzahlBalkone;
            rhsAnzahlBalkone = that.getAnzahlBalkone();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlBalkone", lhsAnzahlBalkone), LocatorUtils.property(thatLocator, "anzahlBalkone", rhsAnzahlBalkone), lhsAnzahlBalkone, rhsAnzahlBalkone, (this.anzahlBalkone!= null), (that.anzahlBalkone!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsAnzahlTerrassen;
            lhsAnzahlTerrassen = this.getAnzahlTerrassen();
            BigDecimal rhsAnzahlTerrassen;
            rhsAnzahlTerrassen = that.getAnzahlTerrassen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlTerrassen", lhsAnzahlTerrassen), LocatorUtils.property(thatLocator, "anzahlTerrassen", rhsAnzahlTerrassen), lhsAnzahlTerrassen, rhsAnzahlTerrassen, (this.anzahlTerrassen!= null), (that.anzahlTerrassen!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsAnzahlLogia;
            lhsAnzahlLogia = this.getAnzahlLogia();
            BigDecimal rhsAnzahlLogia;
            rhsAnzahlLogia = that.getAnzahlLogia();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlLogia", lhsAnzahlLogia), LocatorUtils.property(thatLocator, "anzahlLogia", rhsAnzahlLogia), lhsAnzahlLogia, rhsAnzahlLogia, (this.anzahlLogia!= null), (that.anzahlLogia!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsBalkonTerrasseFlaeche;
            lhsBalkonTerrasseFlaeche = this.getBalkonTerrasseFlaeche();
            BigDecimal rhsBalkonTerrasseFlaeche;
            rhsBalkonTerrasseFlaeche = that.getBalkonTerrasseFlaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "balkonTerrasseFlaeche", lhsBalkonTerrasseFlaeche), LocatorUtils.property(thatLocator, "balkonTerrasseFlaeche", rhsBalkonTerrasseFlaeche), lhsBalkonTerrasseFlaeche, rhsBalkonTerrasseFlaeche, (this.balkonTerrasseFlaeche!= null), (that.balkonTerrasseFlaeche!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsAnzahlWohnSchlafzimmer;
            lhsAnzahlWohnSchlafzimmer = this.getAnzahlWohnSchlafzimmer();
            BigDecimal rhsAnzahlWohnSchlafzimmer;
            rhsAnzahlWohnSchlafzimmer = that.getAnzahlWohnSchlafzimmer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlWohnSchlafzimmer", lhsAnzahlWohnSchlafzimmer), LocatorUtils.property(thatLocator, "anzahlWohnSchlafzimmer", rhsAnzahlWohnSchlafzimmer), lhsAnzahlWohnSchlafzimmer, rhsAnzahlWohnSchlafzimmer, (this.anzahlWohnSchlafzimmer!= null), (that.anzahlWohnSchlafzimmer!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsGartenflaeche;
            lhsGartenflaeche = this.getGartenflaeche();
            BigDecimal rhsGartenflaeche;
            rhsGartenflaeche = that.getGartenflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gartenflaeche", lhsGartenflaeche), LocatorUtils.property(thatLocator, "gartenflaeche", rhsGartenflaeche), lhsGartenflaeche, rhsGartenflaeche, (this.gartenflaeche!= null), (that.gartenflaeche!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsKellerflaeche;
            lhsKellerflaeche = this.getKellerflaeche();
            BigDecimal rhsKellerflaeche;
            rhsKellerflaeche = that.getKellerflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kellerflaeche", lhsKellerflaeche), LocatorUtils.property(thatLocator, "kellerflaeche", rhsKellerflaeche), lhsKellerflaeche, rhsKellerflaeche, (this.kellerflaeche!= null), (that.kellerflaeche!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsFensterfrontQm;
            lhsFensterfrontQm = this.getFensterfrontQm();
            BigDecimal rhsFensterfrontQm;
            rhsFensterfrontQm = that.getFensterfrontQm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fensterfrontQm", lhsFensterfrontQm), LocatorUtils.property(thatLocator, "fensterfrontQm", rhsFensterfrontQm), lhsFensterfrontQm, rhsFensterfrontQm, (this.fensterfrontQm!= null), (that.fensterfrontQm!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsGrundstuecksfront;
            lhsGrundstuecksfront = this.getGrundstuecksfront();
            BigDecimal rhsGrundstuecksfront;
            rhsGrundstuecksfront = that.getGrundstuecksfront();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grundstuecksfront", lhsGrundstuecksfront), LocatorUtils.property(thatLocator, "grundstuecksfront", rhsGrundstuecksfront), lhsGrundstuecksfront, rhsGrundstuecksfront, (this.grundstuecksfront!= null), (that.grundstuecksfront!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsDachbodenflaeche;
            lhsDachbodenflaeche = this.getDachbodenflaeche();
            BigDecimal rhsDachbodenflaeche;
            rhsDachbodenflaeche = that.getDachbodenflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dachbodenflaeche", lhsDachbodenflaeche), LocatorUtils.property(thatLocator, "dachbodenflaeche", rhsDachbodenflaeche), lhsDachbodenflaeche, rhsDachbodenflaeche, (this.dachbodenflaeche!= null), (that.dachbodenflaeche!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsTeilbarAb;
            lhsTeilbarAb = this.getTeilbarAb();
            BigDecimal rhsTeilbarAb;
            rhsTeilbarAb = that.getTeilbarAb();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "teilbarAb", lhsTeilbarAb), LocatorUtils.property(thatLocator, "teilbarAb", rhsTeilbarAb), lhsTeilbarAb, rhsTeilbarAb, (this.teilbarAb!= null), (that.teilbarAb!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsBeheizbareFlaeche;
            lhsBeheizbareFlaeche = this.getBeheizbareFlaeche();
            BigDecimal rhsBeheizbareFlaeche;
            rhsBeheizbareFlaeche = that.getBeheizbareFlaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beheizbareFlaeche", lhsBeheizbareFlaeche), LocatorUtils.property(thatLocator, "beheizbareFlaeche", rhsBeheizbareFlaeche), lhsBeheizbareFlaeche, rhsBeheizbareFlaeche, (this.beheizbareFlaeche!= null), (that.beheizbareFlaeche!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsAnzahlStellplaetze;
            lhsAnzahlStellplaetze = this.getAnzahlStellplaetze();
            BigInteger rhsAnzahlStellplaetze;
            rhsAnzahlStellplaetze = that.getAnzahlStellplaetze();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlStellplaetze", lhsAnzahlStellplaetze), LocatorUtils.property(thatLocator, "anzahlStellplaetze", rhsAnzahlStellplaetze), lhsAnzahlStellplaetze, rhsAnzahlStellplaetze, (this.anzahlStellplaetze!= null), (that.anzahlStellplaetze!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsPlaetzeGastraum;
            lhsPlaetzeGastraum = this.getPlaetzeGastraum();
            BigDecimal rhsPlaetzeGastraum;
            rhsPlaetzeGastraum = that.getPlaetzeGastraum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "plaetzeGastraum", lhsPlaetzeGastraum), LocatorUtils.property(thatLocator, "plaetzeGastraum", rhsPlaetzeGastraum), lhsPlaetzeGastraum, rhsPlaetzeGastraum, (this.plaetzeGastraum!= null), (that.plaetzeGastraum!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsAnzahlBetten;
            lhsAnzahlBetten = this.getAnzahlBetten();
            BigDecimal rhsAnzahlBetten;
            rhsAnzahlBetten = that.getAnzahlBetten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlBetten", lhsAnzahlBetten), LocatorUtils.property(thatLocator, "anzahlBetten", rhsAnzahlBetten), lhsAnzahlBetten, rhsAnzahlBetten, (this.anzahlBetten!= null), (that.anzahlBetten!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsAnzahlTagungsraeume;
            lhsAnzahlTagungsraeume = this.getAnzahlTagungsraeume();
            BigDecimal rhsAnzahlTagungsraeume;
            rhsAnzahlTagungsraeume = that.getAnzahlTagungsraeume();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlTagungsraeume", lhsAnzahlTagungsraeume), LocatorUtils.property(thatLocator, "anzahlTagungsraeume", rhsAnzahlTagungsraeume), lhsAnzahlTagungsraeume, rhsAnzahlTagungsraeume, (this.anzahlTagungsraeume!= null), (that.anzahlTagungsraeume!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsVermietbareFlaeche;
            lhsVermietbareFlaeche = this.getVermietbareFlaeche();
            BigDecimal rhsVermietbareFlaeche;
            rhsVermietbareFlaeche = that.getVermietbareFlaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vermietbareFlaeche", lhsVermietbareFlaeche), LocatorUtils.property(thatLocator, "vermietbareFlaeche", rhsVermietbareFlaeche), lhsVermietbareFlaeche, rhsVermietbareFlaeche, (this.vermietbareFlaeche!= null), (that.vermietbareFlaeche!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsAnzahlWohneinheiten;
            lhsAnzahlWohneinheiten = this.getAnzahlWohneinheiten();
            BigDecimal rhsAnzahlWohneinheiten;
            rhsAnzahlWohneinheiten = that.getAnzahlWohneinheiten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlWohneinheiten", lhsAnzahlWohneinheiten), LocatorUtils.property(thatLocator, "anzahlWohneinheiten", rhsAnzahlWohneinheiten), lhsAnzahlWohneinheiten, rhsAnzahlWohneinheiten, (this.anzahlWohneinheiten!= null), (that.anzahlWohneinheiten!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsAnzahlGewerbeeinheiten;
            lhsAnzahlGewerbeeinheiten = this.getAnzahlGewerbeeinheiten();
            BigDecimal rhsAnzahlGewerbeeinheiten;
            rhsAnzahlGewerbeeinheiten = that.getAnzahlGewerbeeinheiten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlGewerbeeinheiten", lhsAnzahlGewerbeeinheiten), LocatorUtils.property(thatLocator, "anzahlGewerbeeinheiten", rhsAnzahlGewerbeeinheiten), lhsAnzahlGewerbeeinheiten, rhsAnzahlGewerbeeinheiten, (this.anzahlGewerbeeinheiten!= null), (that.anzahlGewerbeeinheiten!= null))) {
                return false;
            }
        }
        {
            Boolean lhsEinliegerwohnung;
            lhsEinliegerwohnung = this.isEinliegerwohnung();
            Boolean rhsEinliegerwohnung;
            rhsEinliegerwohnung = that.isEinliegerwohnung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "einliegerwohnung", lhsEinliegerwohnung), LocatorUtils.property(thatLocator, "einliegerwohnung", rhsEinliegerwohnung), lhsEinliegerwohnung, rhsEinliegerwohnung, (this.einliegerwohnung!= null), (that.einliegerwohnung!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsKubatur;
            lhsKubatur = this.getKubatur();
            BigDecimal rhsKubatur;
            rhsKubatur = that.getKubatur();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kubatur", lhsKubatur), LocatorUtils.property(thatLocator, "kubatur", rhsKubatur), lhsKubatur, rhsKubatur, (this.kubatur!= null), (that.kubatur!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsAusnuetzungsziffer;
            lhsAusnuetzungsziffer = this.getAusnuetzungsziffer();
            BigDecimal rhsAusnuetzungsziffer;
            rhsAusnuetzungsziffer = that.getAusnuetzungsziffer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ausnuetzungsziffer", lhsAusnuetzungsziffer), LocatorUtils.property(thatLocator, "ausnuetzungsziffer", rhsAusnuetzungsziffer), lhsAusnuetzungsziffer, rhsAusnuetzungsziffer, (this.ausnuetzungsziffer!= null), (that.ausnuetzungsziffer!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsFlaechevon;
            lhsFlaechevon = this.getFlaechevon();
            BigDecimal rhsFlaechevon;
            rhsFlaechevon = that.getFlaechevon();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flaechevon", lhsFlaechevon), LocatorUtils.property(thatLocator, "flaechevon", rhsFlaechevon), lhsFlaechevon, rhsFlaechevon, (this.flaechevon!= null), (that.flaechevon!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsFlaechebis;
            lhsFlaechebis = this.getFlaechebis();
            BigDecimal rhsFlaechebis;
            rhsFlaechebis = that.getFlaechebis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flaechebis", lhsFlaechebis), LocatorUtils.property(thatLocator, "flaechebis", rhsFlaechebis), lhsFlaechebis, rhsFlaechebis, (this.flaechebis!= null), (that.flaechebis!= null))) {
                return false;
            }
        }
        {
            List<UserDefinedSimplefield> lhsUserDefinedSimplefield;
            lhsUserDefinedSimplefield = (((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))?this.getUserDefinedSimplefield():null);
            List<UserDefinedSimplefield> rhsUserDefinedSimplefield;
            rhsUserDefinedSimplefield = (((that.userDefinedSimplefield!= null)&&(!that.userDefinedSimplefield.isEmpty()))?that.getUserDefinedSimplefield():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefinedSimplefield", lhsUserDefinedSimplefield), LocatorUtils.property(thatLocator, "userDefinedSimplefield", rhsUserDefinedSimplefield), lhsUserDefinedSimplefield, rhsUserDefinedSimplefield, ((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty())), ((that.userDefinedSimplefield!= null)&&(!that.userDefinedSimplefield.isEmpty())))) {
                return false;
            }
        }
        {
            List<UserDefinedAnyfield> lhsUserDefinedAnyfield;
            lhsUserDefinedAnyfield = (((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))?this.getUserDefinedAnyfield():null);
            List<UserDefinedAnyfield> rhsUserDefinedAnyfield;
            rhsUserDefinedAnyfield = (((that.userDefinedAnyfield!= null)&&(!that.userDefinedAnyfield.isEmpty()))?that.getUserDefinedAnyfield():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefinedAnyfield", lhsUserDefinedAnyfield), LocatorUtils.property(thatLocator, "userDefinedAnyfield", rhsUserDefinedAnyfield), lhsUserDefinedAnyfield, rhsUserDefinedAnyfield, ((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty())), ((that.userDefinedAnyfield!= null)&&(!that.userDefinedAnyfield.isEmpty())))) {
                return false;
            }
        }
        {
            List<UserDefinedExtend> lhsUserDefinedExtend;
            lhsUserDefinedExtend = (((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))?this.getUserDefinedExtend():null);
            List<UserDefinedExtend> rhsUserDefinedExtend;
            rhsUserDefinedExtend = (((that.userDefinedExtend!= null)&&(!that.userDefinedExtend.isEmpty()))?that.getUserDefinedExtend():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefinedExtend", lhsUserDefinedExtend), LocatorUtils.property(thatLocator, "userDefinedExtend", rhsUserDefinedExtend), lhsUserDefinedExtend, rhsUserDefinedExtend, ((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty())), ((that.userDefinedExtend!= null)&&(!that.userDefinedExtend.isEmpty())))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
