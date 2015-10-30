
package org.openestate.io.immoxml.xml;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal wohnflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal nutzflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal gesamtflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal ladenflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal lagerflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal verkaufsflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal freiflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal bueroflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal bueroteilflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal fensterfront;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal verwaltungsflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal gastroflaeche;
    protected String grz;
    protected String gfz;
    protected String bmz;
    protected String bgf;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal grundstuecksflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal sonstflaeche;
    @XmlElement(name = "anzahl_zimmer", type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal anzahlZimmer;
    @XmlElement(name = "anzahl_schlafzimmer", type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal anzahlSchlafzimmer;
    @XmlElement(name = "anzahl_badezimmer", type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal anzahlBadezimmer;
    @XmlElement(name = "anzahl_sep_wc", type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal anzahlSepWc;
    @XmlElement(name = "anzahl_balkon_terrassen", type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal anzahlBalkonTerrassen;
    @XmlElement(name = "balkon_terrasse_flaeche", type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal balkonTerrasseFlaeche;
    @XmlElement(name = "anzahl_wohn_schlafzimmer", type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal anzahlWohnSchlafzimmer;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal gartenflaeche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal kellerflaeche;
    @XmlElement(name = "fensterfront_qm", type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal fensterfrontQm;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal grundstuecksfront;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal dachbodenflaeche;
    @XmlElement(name = "teilbar_ab", type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal teilbarAb;
    @XmlElement(name = "beheizbare_flaeche", type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal beheizbareFlaeche;
    @XmlElement(name = "anzahl_stellplaetze", type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal anzahlStellplaetze;
    @XmlElement(name = "plaetze_gastraum", type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal plaetzeGastraum;
    @XmlElement(name = "anzahl_betten", type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal anzahlBetten;
    @XmlElement(name = "anzahl_tagungsraeume", type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal anzahlTagungsraeume;
    @XmlElement(name = "vermietbare_flaeche", type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal vermietbareFlaeche;
    @XmlElement(name = "anzahl_wohneinheiten", type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal anzahlWohneinheiten;
    @XmlElement(name = "anzahl_gewerbeeinheiten", type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal anzahlGewerbeeinheiten;
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
     * Gets the value of the anzahlBalkonTerrassen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getAnzahlBalkonTerrassen() {
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
    public void setAnzahlBalkonTerrassen(BigDecimal value) {
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
    public BigDecimal getAnzahlStellplaetze() {
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
    public void setAnzahlStellplaetze(BigDecimal value) {
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
            BigDecimal theWohnflaeche;
            theWohnflaeche = this.getWohnflaeche();
            strategy.appendField(locator, this, "wohnflaeche", buffer, theWohnflaeche);
        }
        {
            BigDecimal theNutzflaeche;
            theNutzflaeche = this.getNutzflaeche();
            strategy.appendField(locator, this, "nutzflaeche", buffer, theNutzflaeche);
        }
        {
            BigDecimal theGesamtflaeche;
            theGesamtflaeche = this.getGesamtflaeche();
            strategy.appendField(locator, this, "gesamtflaeche", buffer, theGesamtflaeche);
        }
        {
            BigDecimal theLadenflaeche;
            theLadenflaeche = this.getLadenflaeche();
            strategy.appendField(locator, this, "ladenflaeche", buffer, theLadenflaeche);
        }
        {
            BigDecimal theLagerflaeche;
            theLagerflaeche = this.getLagerflaeche();
            strategy.appendField(locator, this, "lagerflaeche", buffer, theLagerflaeche);
        }
        {
            BigDecimal theVerkaufsflaeche;
            theVerkaufsflaeche = this.getVerkaufsflaeche();
            strategy.appendField(locator, this, "verkaufsflaeche", buffer, theVerkaufsflaeche);
        }
        {
            BigDecimal theFreiflaeche;
            theFreiflaeche = this.getFreiflaeche();
            strategy.appendField(locator, this, "freiflaeche", buffer, theFreiflaeche);
        }
        {
            BigDecimal theBueroflaeche;
            theBueroflaeche = this.getBueroflaeche();
            strategy.appendField(locator, this, "bueroflaeche", buffer, theBueroflaeche);
        }
        {
            BigDecimal theBueroteilflaeche;
            theBueroteilflaeche = this.getBueroteilflaeche();
            strategy.appendField(locator, this, "bueroteilflaeche", buffer, theBueroteilflaeche);
        }
        {
            BigDecimal theFensterfront;
            theFensterfront = this.getFensterfront();
            strategy.appendField(locator, this, "fensterfront", buffer, theFensterfront);
        }
        {
            BigDecimal theVerwaltungsflaeche;
            theVerwaltungsflaeche = this.getVerwaltungsflaeche();
            strategy.appendField(locator, this, "verwaltungsflaeche", buffer, theVerwaltungsflaeche);
        }
        {
            BigDecimal theGastroflaeche;
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
            BigDecimal theGrundstuecksflaeche;
            theGrundstuecksflaeche = this.getGrundstuecksflaeche();
            strategy.appendField(locator, this, "grundstuecksflaeche", buffer, theGrundstuecksflaeche);
        }
        {
            BigDecimal theSonstflaeche;
            theSonstflaeche = this.getSonstflaeche();
            strategy.appendField(locator, this, "sonstflaeche", buffer, theSonstflaeche);
        }
        {
            BigDecimal theAnzahlZimmer;
            theAnzahlZimmer = this.getAnzahlZimmer();
            strategy.appendField(locator, this, "anzahlZimmer", buffer, theAnzahlZimmer);
        }
        {
            BigDecimal theAnzahlSchlafzimmer;
            theAnzahlSchlafzimmer = this.getAnzahlSchlafzimmer();
            strategy.appendField(locator, this, "anzahlSchlafzimmer", buffer, theAnzahlSchlafzimmer);
        }
        {
            BigDecimal theAnzahlBadezimmer;
            theAnzahlBadezimmer = this.getAnzahlBadezimmer();
            strategy.appendField(locator, this, "anzahlBadezimmer", buffer, theAnzahlBadezimmer);
        }
        {
            BigDecimal theAnzahlSepWc;
            theAnzahlSepWc = this.getAnzahlSepWc();
            strategy.appendField(locator, this, "anzahlSepWc", buffer, theAnzahlSepWc);
        }
        {
            BigDecimal theAnzahlBalkonTerrassen;
            theAnzahlBalkonTerrassen = this.getAnzahlBalkonTerrassen();
            strategy.appendField(locator, this, "anzahlBalkonTerrassen", buffer, theAnzahlBalkonTerrassen);
        }
        {
            BigDecimal theBalkonTerrasseFlaeche;
            theBalkonTerrasseFlaeche = this.getBalkonTerrasseFlaeche();
            strategy.appendField(locator, this, "balkonTerrasseFlaeche", buffer, theBalkonTerrasseFlaeche);
        }
        {
            BigDecimal theAnzahlWohnSchlafzimmer;
            theAnzahlWohnSchlafzimmer = this.getAnzahlWohnSchlafzimmer();
            strategy.appendField(locator, this, "anzahlWohnSchlafzimmer", buffer, theAnzahlWohnSchlafzimmer);
        }
        {
            BigDecimal theGartenflaeche;
            theGartenflaeche = this.getGartenflaeche();
            strategy.appendField(locator, this, "gartenflaeche", buffer, theGartenflaeche);
        }
        {
            BigDecimal theKellerflaeche;
            theKellerflaeche = this.getKellerflaeche();
            strategy.appendField(locator, this, "kellerflaeche", buffer, theKellerflaeche);
        }
        {
            BigDecimal theFensterfrontQm;
            theFensterfrontQm = this.getFensterfrontQm();
            strategy.appendField(locator, this, "fensterfrontQm", buffer, theFensterfrontQm);
        }
        {
            BigDecimal theGrundstuecksfront;
            theGrundstuecksfront = this.getGrundstuecksfront();
            strategy.appendField(locator, this, "grundstuecksfront", buffer, theGrundstuecksfront);
        }
        {
            BigDecimal theDachbodenflaeche;
            theDachbodenflaeche = this.getDachbodenflaeche();
            strategy.appendField(locator, this, "dachbodenflaeche", buffer, theDachbodenflaeche);
        }
        {
            BigDecimal theTeilbarAb;
            theTeilbarAb = this.getTeilbarAb();
            strategy.appendField(locator, this, "teilbarAb", buffer, theTeilbarAb);
        }
        {
            BigDecimal theBeheizbareFlaeche;
            theBeheizbareFlaeche = this.getBeheizbareFlaeche();
            strategy.appendField(locator, this, "beheizbareFlaeche", buffer, theBeheizbareFlaeche);
        }
        {
            BigDecimal theAnzahlStellplaetze;
            theAnzahlStellplaetze = this.getAnzahlStellplaetze();
            strategy.appendField(locator, this, "anzahlStellplaetze", buffer, theAnzahlStellplaetze);
        }
        {
            BigDecimal thePlaetzeGastraum;
            thePlaetzeGastraum = this.getPlaetzeGastraum();
            strategy.appendField(locator, this, "plaetzeGastraum", buffer, thePlaetzeGastraum);
        }
        {
            BigDecimal theAnzahlBetten;
            theAnzahlBetten = this.getAnzahlBetten();
            strategy.appendField(locator, this, "anzahlBetten", buffer, theAnzahlBetten);
        }
        {
            BigDecimal theAnzahlTagungsraeume;
            theAnzahlTagungsraeume = this.getAnzahlTagungsraeume();
            strategy.appendField(locator, this, "anzahlTagungsraeume", buffer, theAnzahlTagungsraeume);
        }
        {
            BigDecimal theVermietbareFlaeche;
            theVermietbareFlaeche = this.getVermietbareFlaeche();
            strategy.appendField(locator, this, "vermietbareFlaeche", buffer, theVermietbareFlaeche);
        }
        {
            BigDecimal theAnzahlWohneinheiten;
            theAnzahlWohneinheiten = this.getAnzahlWohneinheiten();
            strategy.appendField(locator, this, "anzahlWohneinheiten", buffer, theAnzahlWohneinheiten);
        }
        {
            BigDecimal theAnzahlGewerbeeinheiten;
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
                BigDecimal sourceWohnflaeche;
                sourceWohnflaeche = this.getWohnflaeche();
                BigDecimal copyWohnflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "wohnflaeche", sourceWohnflaeche), sourceWohnflaeche));
                copy.setWohnflaeche(copyWohnflaeche);
            } else {
                copy.wohnflaeche = null;
            }
            if (this.nutzflaeche!= null) {
                BigDecimal sourceNutzflaeche;
                sourceNutzflaeche = this.getNutzflaeche();
                BigDecimal copyNutzflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "nutzflaeche", sourceNutzflaeche), sourceNutzflaeche));
                copy.setNutzflaeche(copyNutzflaeche);
            } else {
                copy.nutzflaeche = null;
            }
            if (this.gesamtflaeche!= null) {
                BigDecimal sourceGesamtflaeche;
                sourceGesamtflaeche = this.getGesamtflaeche();
                BigDecimal copyGesamtflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "gesamtflaeche", sourceGesamtflaeche), sourceGesamtflaeche));
                copy.setGesamtflaeche(copyGesamtflaeche);
            } else {
                copy.gesamtflaeche = null;
            }
            if (this.ladenflaeche!= null) {
                BigDecimal sourceLadenflaeche;
                sourceLadenflaeche = this.getLadenflaeche();
                BigDecimal copyLadenflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "ladenflaeche", sourceLadenflaeche), sourceLadenflaeche));
                copy.setLadenflaeche(copyLadenflaeche);
            } else {
                copy.ladenflaeche = null;
            }
            if (this.lagerflaeche!= null) {
                BigDecimal sourceLagerflaeche;
                sourceLagerflaeche = this.getLagerflaeche();
                BigDecimal copyLagerflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "lagerflaeche", sourceLagerflaeche), sourceLagerflaeche));
                copy.setLagerflaeche(copyLagerflaeche);
            } else {
                copy.lagerflaeche = null;
            }
            if (this.verkaufsflaeche!= null) {
                BigDecimal sourceVerkaufsflaeche;
                sourceVerkaufsflaeche = this.getVerkaufsflaeche();
                BigDecimal copyVerkaufsflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "verkaufsflaeche", sourceVerkaufsflaeche), sourceVerkaufsflaeche));
                copy.setVerkaufsflaeche(copyVerkaufsflaeche);
            } else {
                copy.verkaufsflaeche = null;
            }
            if (this.freiflaeche!= null) {
                BigDecimal sourceFreiflaeche;
                sourceFreiflaeche = this.getFreiflaeche();
                BigDecimal copyFreiflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "freiflaeche", sourceFreiflaeche), sourceFreiflaeche));
                copy.setFreiflaeche(copyFreiflaeche);
            } else {
                copy.freiflaeche = null;
            }
            if (this.bueroflaeche!= null) {
                BigDecimal sourceBueroflaeche;
                sourceBueroflaeche = this.getBueroflaeche();
                BigDecimal copyBueroflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "bueroflaeche", sourceBueroflaeche), sourceBueroflaeche));
                copy.setBueroflaeche(copyBueroflaeche);
            } else {
                copy.bueroflaeche = null;
            }
            if (this.bueroteilflaeche!= null) {
                BigDecimal sourceBueroteilflaeche;
                sourceBueroteilflaeche = this.getBueroteilflaeche();
                BigDecimal copyBueroteilflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "bueroteilflaeche", sourceBueroteilflaeche), sourceBueroteilflaeche));
                copy.setBueroteilflaeche(copyBueroteilflaeche);
            } else {
                copy.bueroteilflaeche = null;
            }
            if (this.fensterfront!= null) {
                BigDecimal sourceFensterfront;
                sourceFensterfront = this.getFensterfront();
                BigDecimal copyFensterfront = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "fensterfront", sourceFensterfront), sourceFensterfront));
                copy.setFensterfront(copyFensterfront);
            } else {
                copy.fensterfront = null;
            }
            if (this.verwaltungsflaeche!= null) {
                BigDecimal sourceVerwaltungsflaeche;
                sourceVerwaltungsflaeche = this.getVerwaltungsflaeche();
                BigDecimal copyVerwaltungsflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "verwaltungsflaeche", sourceVerwaltungsflaeche), sourceVerwaltungsflaeche));
                copy.setVerwaltungsflaeche(copyVerwaltungsflaeche);
            } else {
                copy.verwaltungsflaeche = null;
            }
            if (this.gastroflaeche!= null) {
                BigDecimal sourceGastroflaeche;
                sourceGastroflaeche = this.getGastroflaeche();
                BigDecimal copyGastroflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "gastroflaeche", sourceGastroflaeche), sourceGastroflaeche));
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
                BigDecimal sourceGrundstuecksflaeche;
                sourceGrundstuecksflaeche = this.getGrundstuecksflaeche();
                BigDecimal copyGrundstuecksflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "grundstuecksflaeche", sourceGrundstuecksflaeche), sourceGrundstuecksflaeche));
                copy.setGrundstuecksflaeche(copyGrundstuecksflaeche);
            } else {
                copy.grundstuecksflaeche = null;
            }
            if (this.sonstflaeche!= null) {
                BigDecimal sourceSonstflaeche;
                sourceSonstflaeche = this.getSonstflaeche();
                BigDecimal copySonstflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "sonstflaeche", sourceSonstflaeche), sourceSonstflaeche));
                copy.setSonstflaeche(copySonstflaeche);
            } else {
                copy.sonstflaeche = null;
            }
            if (this.anzahlZimmer!= null) {
                BigDecimal sourceAnzahlZimmer;
                sourceAnzahlZimmer = this.getAnzahlZimmer();
                BigDecimal copyAnzahlZimmer = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "anzahlZimmer", sourceAnzahlZimmer), sourceAnzahlZimmer));
                copy.setAnzahlZimmer(copyAnzahlZimmer);
            } else {
                copy.anzahlZimmer = null;
            }
            if (this.anzahlSchlafzimmer!= null) {
                BigDecimal sourceAnzahlSchlafzimmer;
                sourceAnzahlSchlafzimmer = this.getAnzahlSchlafzimmer();
                BigDecimal copyAnzahlSchlafzimmer = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "anzahlSchlafzimmer", sourceAnzahlSchlafzimmer), sourceAnzahlSchlafzimmer));
                copy.setAnzahlSchlafzimmer(copyAnzahlSchlafzimmer);
            } else {
                copy.anzahlSchlafzimmer = null;
            }
            if (this.anzahlBadezimmer!= null) {
                BigDecimal sourceAnzahlBadezimmer;
                sourceAnzahlBadezimmer = this.getAnzahlBadezimmer();
                BigDecimal copyAnzahlBadezimmer = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "anzahlBadezimmer", sourceAnzahlBadezimmer), sourceAnzahlBadezimmer));
                copy.setAnzahlBadezimmer(copyAnzahlBadezimmer);
            } else {
                copy.anzahlBadezimmer = null;
            }
            if (this.anzahlSepWc!= null) {
                BigDecimal sourceAnzahlSepWc;
                sourceAnzahlSepWc = this.getAnzahlSepWc();
                BigDecimal copyAnzahlSepWc = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "anzahlSepWc", sourceAnzahlSepWc), sourceAnzahlSepWc));
                copy.setAnzahlSepWc(copyAnzahlSepWc);
            } else {
                copy.anzahlSepWc = null;
            }
            if (this.anzahlBalkonTerrassen!= null) {
                BigDecimal sourceAnzahlBalkonTerrassen;
                sourceAnzahlBalkonTerrassen = this.getAnzahlBalkonTerrassen();
                BigDecimal copyAnzahlBalkonTerrassen = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "anzahlBalkonTerrassen", sourceAnzahlBalkonTerrassen), sourceAnzahlBalkonTerrassen));
                copy.setAnzahlBalkonTerrassen(copyAnzahlBalkonTerrassen);
            } else {
                copy.anzahlBalkonTerrassen = null;
            }
            if (this.balkonTerrasseFlaeche!= null) {
                BigDecimal sourceBalkonTerrasseFlaeche;
                sourceBalkonTerrasseFlaeche = this.getBalkonTerrasseFlaeche();
                BigDecimal copyBalkonTerrasseFlaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "balkonTerrasseFlaeche", sourceBalkonTerrasseFlaeche), sourceBalkonTerrasseFlaeche));
                copy.setBalkonTerrasseFlaeche(copyBalkonTerrasseFlaeche);
            } else {
                copy.balkonTerrasseFlaeche = null;
            }
            if (this.anzahlWohnSchlafzimmer!= null) {
                BigDecimal sourceAnzahlWohnSchlafzimmer;
                sourceAnzahlWohnSchlafzimmer = this.getAnzahlWohnSchlafzimmer();
                BigDecimal copyAnzahlWohnSchlafzimmer = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "anzahlWohnSchlafzimmer", sourceAnzahlWohnSchlafzimmer), sourceAnzahlWohnSchlafzimmer));
                copy.setAnzahlWohnSchlafzimmer(copyAnzahlWohnSchlafzimmer);
            } else {
                copy.anzahlWohnSchlafzimmer = null;
            }
            if (this.gartenflaeche!= null) {
                BigDecimal sourceGartenflaeche;
                sourceGartenflaeche = this.getGartenflaeche();
                BigDecimal copyGartenflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "gartenflaeche", sourceGartenflaeche), sourceGartenflaeche));
                copy.setGartenflaeche(copyGartenflaeche);
            } else {
                copy.gartenflaeche = null;
            }
            if (this.kellerflaeche!= null) {
                BigDecimal sourceKellerflaeche;
                sourceKellerflaeche = this.getKellerflaeche();
                BigDecimal copyKellerflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "kellerflaeche", sourceKellerflaeche), sourceKellerflaeche));
                copy.setKellerflaeche(copyKellerflaeche);
            } else {
                copy.kellerflaeche = null;
            }
            if (this.fensterfrontQm!= null) {
                BigDecimal sourceFensterfrontQm;
                sourceFensterfrontQm = this.getFensterfrontQm();
                BigDecimal copyFensterfrontQm = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "fensterfrontQm", sourceFensterfrontQm), sourceFensterfrontQm));
                copy.setFensterfrontQm(copyFensterfrontQm);
            } else {
                copy.fensterfrontQm = null;
            }
            if (this.grundstuecksfront!= null) {
                BigDecimal sourceGrundstuecksfront;
                sourceGrundstuecksfront = this.getGrundstuecksfront();
                BigDecimal copyGrundstuecksfront = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "grundstuecksfront", sourceGrundstuecksfront), sourceGrundstuecksfront));
                copy.setGrundstuecksfront(copyGrundstuecksfront);
            } else {
                copy.grundstuecksfront = null;
            }
            if (this.dachbodenflaeche!= null) {
                BigDecimal sourceDachbodenflaeche;
                sourceDachbodenflaeche = this.getDachbodenflaeche();
                BigDecimal copyDachbodenflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "dachbodenflaeche", sourceDachbodenflaeche), sourceDachbodenflaeche));
                copy.setDachbodenflaeche(copyDachbodenflaeche);
            } else {
                copy.dachbodenflaeche = null;
            }
            if (this.teilbarAb!= null) {
                BigDecimal sourceTeilbarAb;
                sourceTeilbarAb = this.getTeilbarAb();
                BigDecimal copyTeilbarAb = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "teilbarAb", sourceTeilbarAb), sourceTeilbarAb));
                copy.setTeilbarAb(copyTeilbarAb);
            } else {
                copy.teilbarAb = null;
            }
            if (this.beheizbareFlaeche!= null) {
                BigDecimal sourceBeheizbareFlaeche;
                sourceBeheizbareFlaeche = this.getBeheizbareFlaeche();
                BigDecimal copyBeheizbareFlaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "beheizbareFlaeche", sourceBeheizbareFlaeche), sourceBeheizbareFlaeche));
                copy.setBeheizbareFlaeche(copyBeheizbareFlaeche);
            } else {
                copy.beheizbareFlaeche = null;
            }
            if (this.anzahlStellplaetze!= null) {
                BigDecimal sourceAnzahlStellplaetze;
                sourceAnzahlStellplaetze = this.getAnzahlStellplaetze();
                BigDecimal copyAnzahlStellplaetze = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "anzahlStellplaetze", sourceAnzahlStellplaetze), sourceAnzahlStellplaetze));
                copy.setAnzahlStellplaetze(copyAnzahlStellplaetze);
            } else {
                copy.anzahlStellplaetze = null;
            }
            if (this.plaetzeGastraum!= null) {
                BigDecimal sourcePlaetzeGastraum;
                sourcePlaetzeGastraum = this.getPlaetzeGastraum();
                BigDecimal copyPlaetzeGastraum = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "plaetzeGastraum", sourcePlaetzeGastraum), sourcePlaetzeGastraum));
                copy.setPlaetzeGastraum(copyPlaetzeGastraum);
            } else {
                copy.plaetzeGastraum = null;
            }
            if (this.anzahlBetten!= null) {
                BigDecimal sourceAnzahlBetten;
                sourceAnzahlBetten = this.getAnzahlBetten();
                BigDecimal copyAnzahlBetten = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "anzahlBetten", sourceAnzahlBetten), sourceAnzahlBetten));
                copy.setAnzahlBetten(copyAnzahlBetten);
            } else {
                copy.anzahlBetten = null;
            }
            if (this.anzahlTagungsraeume!= null) {
                BigDecimal sourceAnzahlTagungsraeume;
                sourceAnzahlTagungsraeume = this.getAnzahlTagungsraeume();
                BigDecimal copyAnzahlTagungsraeume = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "anzahlTagungsraeume", sourceAnzahlTagungsraeume), sourceAnzahlTagungsraeume));
                copy.setAnzahlTagungsraeume(copyAnzahlTagungsraeume);
            } else {
                copy.anzahlTagungsraeume = null;
            }
            if (this.vermietbareFlaeche!= null) {
                BigDecimal sourceVermietbareFlaeche;
                sourceVermietbareFlaeche = this.getVermietbareFlaeche();
                BigDecimal copyVermietbareFlaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "vermietbareFlaeche", sourceVermietbareFlaeche), sourceVermietbareFlaeche));
                copy.setVermietbareFlaeche(copyVermietbareFlaeche);
            } else {
                copy.vermietbareFlaeche = null;
            }
            if (this.anzahlWohneinheiten!= null) {
                BigDecimal sourceAnzahlWohneinheiten;
                sourceAnzahlWohneinheiten = this.getAnzahlWohneinheiten();
                BigDecimal copyAnzahlWohneinheiten = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "anzahlWohneinheiten", sourceAnzahlWohneinheiten), sourceAnzahlWohneinheiten));
                copy.setAnzahlWohneinheiten(copyAnzahlWohneinheiten);
            } else {
                copy.anzahlWohneinheiten = null;
            }
            if (this.anzahlGewerbeeinheiten!= null) {
                BigDecimal sourceAnzahlGewerbeeinheiten;
                sourceAnzahlGewerbeeinheiten = this.getAnzahlGewerbeeinheiten();
                BigDecimal copyAnzahlGewerbeeinheiten = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "anzahlGewerbeeinheiten", sourceAnzahlGewerbeeinheiten), sourceAnzahlGewerbeeinheiten));
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
            BigDecimal lhsWohnflaeche;
            lhsWohnflaeche = this.getWohnflaeche();
            BigDecimal rhsWohnflaeche;
            rhsWohnflaeche = that.getWohnflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wohnflaeche", lhsWohnflaeche), LocatorUtils.property(thatLocator, "wohnflaeche", rhsWohnflaeche), lhsWohnflaeche, rhsWohnflaeche)) {
                return false;
            }
        }
        {
            BigDecimal lhsNutzflaeche;
            lhsNutzflaeche = this.getNutzflaeche();
            BigDecimal rhsNutzflaeche;
            rhsNutzflaeche = that.getNutzflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nutzflaeche", lhsNutzflaeche), LocatorUtils.property(thatLocator, "nutzflaeche", rhsNutzflaeche), lhsNutzflaeche, rhsNutzflaeche)) {
                return false;
            }
        }
        {
            BigDecimal lhsGesamtflaeche;
            lhsGesamtflaeche = this.getGesamtflaeche();
            BigDecimal rhsGesamtflaeche;
            rhsGesamtflaeche = that.getGesamtflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gesamtflaeche", lhsGesamtflaeche), LocatorUtils.property(thatLocator, "gesamtflaeche", rhsGesamtflaeche), lhsGesamtflaeche, rhsGesamtflaeche)) {
                return false;
            }
        }
        {
            BigDecimal lhsLadenflaeche;
            lhsLadenflaeche = this.getLadenflaeche();
            BigDecimal rhsLadenflaeche;
            rhsLadenflaeche = that.getLadenflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ladenflaeche", lhsLadenflaeche), LocatorUtils.property(thatLocator, "ladenflaeche", rhsLadenflaeche), lhsLadenflaeche, rhsLadenflaeche)) {
                return false;
            }
        }
        {
            BigDecimal lhsLagerflaeche;
            lhsLagerflaeche = this.getLagerflaeche();
            BigDecimal rhsLagerflaeche;
            rhsLagerflaeche = that.getLagerflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lagerflaeche", lhsLagerflaeche), LocatorUtils.property(thatLocator, "lagerflaeche", rhsLagerflaeche), lhsLagerflaeche, rhsLagerflaeche)) {
                return false;
            }
        }
        {
            BigDecimal lhsVerkaufsflaeche;
            lhsVerkaufsflaeche = this.getVerkaufsflaeche();
            BigDecimal rhsVerkaufsflaeche;
            rhsVerkaufsflaeche = that.getVerkaufsflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verkaufsflaeche", lhsVerkaufsflaeche), LocatorUtils.property(thatLocator, "verkaufsflaeche", rhsVerkaufsflaeche), lhsVerkaufsflaeche, rhsVerkaufsflaeche)) {
                return false;
            }
        }
        {
            BigDecimal lhsFreiflaeche;
            lhsFreiflaeche = this.getFreiflaeche();
            BigDecimal rhsFreiflaeche;
            rhsFreiflaeche = that.getFreiflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freiflaeche", lhsFreiflaeche), LocatorUtils.property(thatLocator, "freiflaeche", rhsFreiflaeche), lhsFreiflaeche, rhsFreiflaeche)) {
                return false;
            }
        }
        {
            BigDecimal lhsBueroflaeche;
            lhsBueroflaeche = this.getBueroflaeche();
            BigDecimal rhsBueroflaeche;
            rhsBueroflaeche = that.getBueroflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bueroflaeche", lhsBueroflaeche), LocatorUtils.property(thatLocator, "bueroflaeche", rhsBueroflaeche), lhsBueroflaeche, rhsBueroflaeche)) {
                return false;
            }
        }
        {
            BigDecimal lhsBueroteilflaeche;
            lhsBueroteilflaeche = this.getBueroteilflaeche();
            BigDecimal rhsBueroteilflaeche;
            rhsBueroteilflaeche = that.getBueroteilflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bueroteilflaeche", lhsBueroteilflaeche), LocatorUtils.property(thatLocator, "bueroteilflaeche", rhsBueroteilflaeche), lhsBueroteilflaeche, rhsBueroteilflaeche)) {
                return false;
            }
        }
        {
            BigDecimal lhsFensterfront;
            lhsFensterfront = this.getFensterfront();
            BigDecimal rhsFensterfront;
            rhsFensterfront = that.getFensterfront();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fensterfront", lhsFensterfront), LocatorUtils.property(thatLocator, "fensterfront", rhsFensterfront), lhsFensterfront, rhsFensterfront)) {
                return false;
            }
        }
        {
            BigDecimal lhsVerwaltungsflaeche;
            lhsVerwaltungsflaeche = this.getVerwaltungsflaeche();
            BigDecimal rhsVerwaltungsflaeche;
            rhsVerwaltungsflaeche = that.getVerwaltungsflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verwaltungsflaeche", lhsVerwaltungsflaeche), LocatorUtils.property(thatLocator, "verwaltungsflaeche", rhsVerwaltungsflaeche), lhsVerwaltungsflaeche, rhsVerwaltungsflaeche)) {
                return false;
            }
        }
        {
            BigDecimal lhsGastroflaeche;
            lhsGastroflaeche = this.getGastroflaeche();
            BigDecimal rhsGastroflaeche;
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
            BigDecimal lhsGrundstuecksflaeche;
            lhsGrundstuecksflaeche = this.getGrundstuecksflaeche();
            BigDecimal rhsGrundstuecksflaeche;
            rhsGrundstuecksflaeche = that.getGrundstuecksflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grundstuecksflaeche", lhsGrundstuecksflaeche), LocatorUtils.property(thatLocator, "grundstuecksflaeche", rhsGrundstuecksflaeche), lhsGrundstuecksflaeche, rhsGrundstuecksflaeche)) {
                return false;
            }
        }
        {
            BigDecimal lhsSonstflaeche;
            lhsSonstflaeche = this.getSonstflaeche();
            BigDecimal rhsSonstflaeche;
            rhsSonstflaeche = that.getSonstflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sonstflaeche", lhsSonstflaeche), LocatorUtils.property(thatLocator, "sonstflaeche", rhsSonstflaeche), lhsSonstflaeche, rhsSonstflaeche)) {
                return false;
            }
        }
        {
            BigDecimal lhsAnzahlZimmer;
            lhsAnzahlZimmer = this.getAnzahlZimmer();
            BigDecimal rhsAnzahlZimmer;
            rhsAnzahlZimmer = that.getAnzahlZimmer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlZimmer", lhsAnzahlZimmer), LocatorUtils.property(thatLocator, "anzahlZimmer", rhsAnzahlZimmer), lhsAnzahlZimmer, rhsAnzahlZimmer)) {
                return false;
            }
        }
        {
            BigDecimal lhsAnzahlSchlafzimmer;
            lhsAnzahlSchlafzimmer = this.getAnzahlSchlafzimmer();
            BigDecimal rhsAnzahlSchlafzimmer;
            rhsAnzahlSchlafzimmer = that.getAnzahlSchlafzimmer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlSchlafzimmer", lhsAnzahlSchlafzimmer), LocatorUtils.property(thatLocator, "anzahlSchlafzimmer", rhsAnzahlSchlafzimmer), lhsAnzahlSchlafzimmer, rhsAnzahlSchlafzimmer)) {
                return false;
            }
        }
        {
            BigDecimal lhsAnzahlBadezimmer;
            lhsAnzahlBadezimmer = this.getAnzahlBadezimmer();
            BigDecimal rhsAnzahlBadezimmer;
            rhsAnzahlBadezimmer = that.getAnzahlBadezimmer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlBadezimmer", lhsAnzahlBadezimmer), LocatorUtils.property(thatLocator, "anzahlBadezimmer", rhsAnzahlBadezimmer), lhsAnzahlBadezimmer, rhsAnzahlBadezimmer)) {
                return false;
            }
        }
        {
            BigDecimal lhsAnzahlSepWc;
            lhsAnzahlSepWc = this.getAnzahlSepWc();
            BigDecimal rhsAnzahlSepWc;
            rhsAnzahlSepWc = that.getAnzahlSepWc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlSepWc", lhsAnzahlSepWc), LocatorUtils.property(thatLocator, "anzahlSepWc", rhsAnzahlSepWc), lhsAnzahlSepWc, rhsAnzahlSepWc)) {
                return false;
            }
        }
        {
            BigDecimal lhsAnzahlBalkonTerrassen;
            lhsAnzahlBalkonTerrassen = this.getAnzahlBalkonTerrassen();
            BigDecimal rhsAnzahlBalkonTerrassen;
            rhsAnzahlBalkonTerrassen = that.getAnzahlBalkonTerrassen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlBalkonTerrassen", lhsAnzahlBalkonTerrassen), LocatorUtils.property(thatLocator, "anzahlBalkonTerrassen", rhsAnzahlBalkonTerrassen), lhsAnzahlBalkonTerrassen, rhsAnzahlBalkonTerrassen)) {
                return false;
            }
        }
        {
            BigDecimal lhsBalkonTerrasseFlaeche;
            lhsBalkonTerrasseFlaeche = this.getBalkonTerrasseFlaeche();
            BigDecimal rhsBalkonTerrasseFlaeche;
            rhsBalkonTerrasseFlaeche = that.getBalkonTerrasseFlaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "balkonTerrasseFlaeche", lhsBalkonTerrasseFlaeche), LocatorUtils.property(thatLocator, "balkonTerrasseFlaeche", rhsBalkonTerrasseFlaeche), lhsBalkonTerrasseFlaeche, rhsBalkonTerrasseFlaeche)) {
                return false;
            }
        }
        {
            BigDecimal lhsAnzahlWohnSchlafzimmer;
            lhsAnzahlWohnSchlafzimmer = this.getAnzahlWohnSchlafzimmer();
            BigDecimal rhsAnzahlWohnSchlafzimmer;
            rhsAnzahlWohnSchlafzimmer = that.getAnzahlWohnSchlafzimmer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlWohnSchlafzimmer", lhsAnzahlWohnSchlafzimmer), LocatorUtils.property(thatLocator, "anzahlWohnSchlafzimmer", rhsAnzahlWohnSchlafzimmer), lhsAnzahlWohnSchlafzimmer, rhsAnzahlWohnSchlafzimmer)) {
                return false;
            }
        }
        {
            BigDecimal lhsGartenflaeche;
            lhsGartenflaeche = this.getGartenflaeche();
            BigDecimal rhsGartenflaeche;
            rhsGartenflaeche = that.getGartenflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gartenflaeche", lhsGartenflaeche), LocatorUtils.property(thatLocator, "gartenflaeche", rhsGartenflaeche), lhsGartenflaeche, rhsGartenflaeche)) {
                return false;
            }
        }
        {
            BigDecimal lhsKellerflaeche;
            lhsKellerflaeche = this.getKellerflaeche();
            BigDecimal rhsKellerflaeche;
            rhsKellerflaeche = that.getKellerflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kellerflaeche", lhsKellerflaeche), LocatorUtils.property(thatLocator, "kellerflaeche", rhsKellerflaeche), lhsKellerflaeche, rhsKellerflaeche)) {
                return false;
            }
        }
        {
            BigDecimal lhsFensterfrontQm;
            lhsFensterfrontQm = this.getFensterfrontQm();
            BigDecimal rhsFensterfrontQm;
            rhsFensterfrontQm = that.getFensterfrontQm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fensterfrontQm", lhsFensterfrontQm), LocatorUtils.property(thatLocator, "fensterfrontQm", rhsFensterfrontQm), lhsFensterfrontQm, rhsFensterfrontQm)) {
                return false;
            }
        }
        {
            BigDecimal lhsGrundstuecksfront;
            lhsGrundstuecksfront = this.getGrundstuecksfront();
            BigDecimal rhsGrundstuecksfront;
            rhsGrundstuecksfront = that.getGrundstuecksfront();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grundstuecksfront", lhsGrundstuecksfront), LocatorUtils.property(thatLocator, "grundstuecksfront", rhsGrundstuecksfront), lhsGrundstuecksfront, rhsGrundstuecksfront)) {
                return false;
            }
        }
        {
            BigDecimal lhsDachbodenflaeche;
            lhsDachbodenflaeche = this.getDachbodenflaeche();
            BigDecimal rhsDachbodenflaeche;
            rhsDachbodenflaeche = that.getDachbodenflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dachbodenflaeche", lhsDachbodenflaeche), LocatorUtils.property(thatLocator, "dachbodenflaeche", rhsDachbodenflaeche), lhsDachbodenflaeche, rhsDachbodenflaeche)) {
                return false;
            }
        }
        {
            BigDecimal lhsTeilbarAb;
            lhsTeilbarAb = this.getTeilbarAb();
            BigDecimal rhsTeilbarAb;
            rhsTeilbarAb = that.getTeilbarAb();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "teilbarAb", lhsTeilbarAb), LocatorUtils.property(thatLocator, "teilbarAb", rhsTeilbarAb), lhsTeilbarAb, rhsTeilbarAb)) {
                return false;
            }
        }
        {
            BigDecimal lhsBeheizbareFlaeche;
            lhsBeheizbareFlaeche = this.getBeheizbareFlaeche();
            BigDecimal rhsBeheizbareFlaeche;
            rhsBeheizbareFlaeche = that.getBeheizbareFlaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beheizbareFlaeche", lhsBeheizbareFlaeche), LocatorUtils.property(thatLocator, "beheizbareFlaeche", rhsBeheizbareFlaeche), lhsBeheizbareFlaeche, rhsBeheizbareFlaeche)) {
                return false;
            }
        }
        {
            BigDecimal lhsAnzahlStellplaetze;
            lhsAnzahlStellplaetze = this.getAnzahlStellplaetze();
            BigDecimal rhsAnzahlStellplaetze;
            rhsAnzahlStellplaetze = that.getAnzahlStellplaetze();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlStellplaetze", lhsAnzahlStellplaetze), LocatorUtils.property(thatLocator, "anzahlStellplaetze", rhsAnzahlStellplaetze), lhsAnzahlStellplaetze, rhsAnzahlStellplaetze)) {
                return false;
            }
        }
        {
            BigDecimal lhsPlaetzeGastraum;
            lhsPlaetzeGastraum = this.getPlaetzeGastraum();
            BigDecimal rhsPlaetzeGastraum;
            rhsPlaetzeGastraum = that.getPlaetzeGastraum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "plaetzeGastraum", lhsPlaetzeGastraum), LocatorUtils.property(thatLocator, "plaetzeGastraum", rhsPlaetzeGastraum), lhsPlaetzeGastraum, rhsPlaetzeGastraum)) {
                return false;
            }
        }
        {
            BigDecimal lhsAnzahlBetten;
            lhsAnzahlBetten = this.getAnzahlBetten();
            BigDecimal rhsAnzahlBetten;
            rhsAnzahlBetten = that.getAnzahlBetten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlBetten", lhsAnzahlBetten), LocatorUtils.property(thatLocator, "anzahlBetten", rhsAnzahlBetten), lhsAnzahlBetten, rhsAnzahlBetten)) {
                return false;
            }
        }
        {
            BigDecimal lhsAnzahlTagungsraeume;
            lhsAnzahlTagungsraeume = this.getAnzahlTagungsraeume();
            BigDecimal rhsAnzahlTagungsraeume;
            rhsAnzahlTagungsraeume = that.getAnzahlTagungsraeume();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlTagungsraeume", lhsAnzahlTagungsraeume), LocatorUtils.property(thatLocator, "anzahlTagungsraeume", rhsAnzahlTagungsraeume), lhsAnzahlTagungsraeume, rhsAnzahlTagungsraeume)) {
                return false;
            }
        }
        {
            BigDecimal lhsVermietbareFlaeche;
            lhsVermietbareFlaeche = this.getVermietbareFlaeche();
            BigDecimal rhsVermietbareFlaeche;
            rhsVermietbareFlaeche = that.getVermietbareFlaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vermietbareFlaeche", lhsVermietbareFlaeche), LocatorUtils.property(thatLocator, "vermietbareFlaeche", rhsVermietbareFlaeche), lhsVermietbareFlaeche, rhsVermietbareFlaeche)) {
                return false;
            }
        }
        {
            BigDecimal lhsAnzahlWohneinheiten;
            lhsAnzahlWohneinheiten = this.getAnzahlWohneinheiten();
            BigDecimal rhsAnzahlWohneinheiten;
            rhsAnzahlWohneinheiten = that.getAnzahlWohneinheiten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlWohneinheiten", lhsAnzahlWohneinheiten), LocatorUtils.property(thatLocator, "anzahlWohneinheiten", rhsAnzahlWohneinheiten), lhsAnzahlWohneinheiten, rhsAnzahlWohneinheiten)) {
                return false;
            }
        }
        {
            BigDecimal lhsAnzahlGewerbeeinheiten;
            lhsAnzahlGewerbeeinheiten = this.getAnzahlGewerbeeinheiten();
            BigDecimal rhsAnzahlGewerbeeinheiten;
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
