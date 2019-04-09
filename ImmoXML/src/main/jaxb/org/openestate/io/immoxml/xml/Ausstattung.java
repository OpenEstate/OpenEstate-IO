
package org.openestate.io.immoxml.xml;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
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
 * Java class for &lt;ausstattung&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "wgGeeignet",
    "raeumeVeraenderbar",
    "bad",
    "kueche",
    "boden",
    "kamin",
    "heizungsart",
    "befeuerung",
    "klimatisiert",
    "fahrstuhl",
    "stellplatzart",
    "gartennutzung",
    "ausrichtBalkonTerrasse",
    "moebliert",
    "rollstuhlgerecht",
    "kabelSatTv",
    "barrierefrei",
    "sauna",
    "swimmingpool",
    "waschTrockenraum",
    "dvVerkabelung",
    "rampe",
    "hebebuehne",
    "kran",
    "gastterrasse",
    "stromanschlusswert",
    "kantineCafeteria",
    "teekueche",
    "hallenhoehe",
    "angeschlGastronomie",
    "brauereibindung",
    "sporteinrichtungen",
    "wellnessbereich",
    "serviceleistungen",
    "telefonFerienimmobilie",
    "sicherheitstechnik",
    "unterkellert",
    "userDefinedSimplefield",
    "userDefinedAnyfield"
})
@XmlRootElement(name = "ausstattung")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
public class Ausstattung implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "wg_geeignet")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean wgGeeignet;
    @XmlElement(name = "raeume_veraenderbar")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean raeumeVeraenderbar;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Bad bad;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Kueche kueche;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boden boden;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean kamin;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Heizungsart heizungsart;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Befeuerung befeuerung;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean klimatisiert;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Fahrstuhl fahrstuhl;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected List<Stellplatzart> stellplatzart;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean gartennutzung;
    @XmlElement(name = "ausricht_balkon_terrasse")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected AusrichtBalkonTerrasse ausrichtBalkonTerrasse;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Moebliert moebliert;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean rollstuhlgerecht;
    @XmlElement(name = "kabel_sat_tv")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean kabelSatTv;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean barrierefrei;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean sauna;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean swimmingpool;
    @XmlElement(name = "wasch_trockenraum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean waschTrockenraum;
    @XmlElement(name = "dv_verkabelung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean dvVerkabelung;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean rampe;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean hebebuehne;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean kran;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean gastterrasse;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal stromanschlusswert;
    @XmlElement(name = "kantine_cafeteria")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean kantineCafeteria;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean teekueche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal hallenhoehe;
    @XmlElement(name = "angeschl_gastronomie")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected AngeschlGastronomie angeschlGastronomie;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean brauereibindung;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean sporteinrichtungen;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean wellnessbereich;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected List<Serviceleistungen> serviceleistungen;
    @XmlElement(name = "telefon_ferienimmobilie")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean telefonFerienimmobilie;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Sicherheitstechnik sicherheitstechnik;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Unterkellert unterkellert;
    @XmlElement(name = "user_defined_simplefield")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected List<UserDefinedSimplefield> userDefinedSimplefield;
    @XmlElement(name = "user_defined_anyfield")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected List<UserDefinedAnyfield> userDefinedAnyfield;

    /**
     * Gets the value of the wgGeeignet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getWgGeeignet() {
        return wgGeeignet;
    }

    /**
     * Sets the value of the wgGeeignet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setWgGeeignet(Boolean value) {
        this.wgGeeignet = value;
    }

    /**
     * Gets the value of the raeumeVeraenderbar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getRaeumeVeraenderbar() {
        return raeumeVeraenderbar;
    }

    /**
     * Sets the value of the raeumeVeraenderbar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setRaeumeVeraenderbar(Boolean value) {
        this.raeumeVeraenderbar = value;
    }

    /**
     * Gets the value of the bad property.
     * 
     * @return
     *     possible object is
     *     {@link Bad }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Bad getBad() {
        return bad;
    }

    /**
     * Sets the value of the bad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bad }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setBad(Bad value) {
        this.bad = value;
    }

    /**
     * Gets the value of the kueche property.
     * 
     * @return
     *     possible object is
     *     {@link Kueche }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Kueche getKueche() {
        return kueche;
    }

    /**
     * Sets the value of the kueche property.
     * 
     * @param value
     *     allowed object is
     *     {@link Kueche }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setKueche(Kueche value) {
        this.kueche = value;
    }

    /**
     * Gets the value of the boden property.
     * 
     * @return
     *     possible object is
     *     {@link Boden }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boden getBoden() {
        return boden;
    }

    /**
     * Sets the value of the boden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boden }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setBoden(Boden value) {
        this.boden = value;
    }

    /**
     * Gets the value of the kamin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getKamin() {
        return kamin;
    }

    /**
     * Sets the value of the kamin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setKamin(Boolean value) {
        this.kamin = value;
    }

    /**
     * Gets the value of the heizungsart property.
     * 
     * @return
     *     possible object is
     *     {@link Heizungsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Heizungsart getHeizungsart() {
        return heizungsart;
    }

    /**
     * Sets the value of the heizungsart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Heizungsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setHeizungsart(Heizungsart value) {
        this.heizungsart = value;
    }

    /**
     * Gets the value of the befeuerung property.
     * 
     * @return
     *     possible object is
     *     {@link Befeuerung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Befeuerung getBefeuerung() {
        return befeuerung;
    }

    /**
     * Sets the value of the befeuerung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Befeuerung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setBefeuerung(Befeuerung value) {
        this.befeuerung = value;
    }

    /**
     * Gets the value of the klimatisiert property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getKlimatisiert() {
        return klimatisiert;
    }

    /**
     * Sets the value of the klimatisiert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setKlimatisiert(Boolean value) {
        this.klimatisiert = value;
    }

    /**
     * Gets the value of the fahrstuhl property.
     * 
     * @return
     *     possible object is
     *     {@link Fahrstuhl }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Fahrstuhl getFahrstuhl() {
        return fahrstuhl;
    }

    /**
     * Sets the value of the fahrstuhl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fahrstuhl }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setFahrstuhl(Fahrstuhl value) {
        this.fahrstuhl = value;
    }

    /**
     * Gets the value of the stellplatzart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stellplatzart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStellplatzart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Stellplatzart }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public List<Stellplatzart> getStellplatzart() {
        if (stellplatzart == null) {
            stellplatzart = new ArrayList<Stellplatzart>();
        }
        return this.stellplatzart;
    }

    /**
     * Gets the value of the gartennutzung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getGartennutzung() {
        return gartennutzung;
    }

    /**
     * Sets the value of the gartennutzung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setGartennutzung(Boolean value) {
        this.gartennutzung = value;
    }

    /**
     * Gets the value of the ausrichtBalkonTerrasse property.
     * 
     * @return
     *     possible object is
     *     {@link AusrichtBalkonTerrasse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public AusrichtBalkonTerrasse getAusrichtBalkonTerrasse() {
        return ausrichtBalkonTerrasse;
    }

    /**
     * Sets the value of the ausrichtBalkonTerrasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AusrichtBalkonTerrasse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setAusrichtBalkonTerrasse(AusrichtBalkonTerrasse value) {
        this.ausrichtBalkonTerrasse = value;
    }

    /**
     * Gets the value of the moebliert property.
     * 
     * @return
     *     possible object is
     *     {@link Moebliert }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Moebliert getMoebliert() {
        return moebliert;
    }

    /**
     * Sets the value of the moebliert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Moebliert }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setMoebliert(Moebliert value) {
        this.moebliert = value;
    }

    /**
     * Gets the value of the rollstuhlgerecht property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getRollstuhlgerecht() {
        return rollstuhlgerecht;
    }

    /**
     * Sets the value of the rollstuhlgerecht property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setRollstuhlgerecht(Boolean value) {
        this.rollstuhlgerecht = value;
    }

    /**
     * Gets the value of the kabelSatTv property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getKabelSatTv() {
        return kabelSatTv;
    }

    /**
     * Sets the value of the kabelSatTv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setKabelSatTv(Boolean value) {
        this.kabelSatTv = value;
    }

    /**
     * Gets the value of the barrierefrei property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getBarrierefrei() {
        return barrierefrei;
    }

    /**
     * Sets the value of the barrierefrei property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setBarrierefrei(Boolean value) {
        this.barrierefrei = value;
    }

    /**
     * Gets the value of the sauna property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getSauna() {
        return sauna;
    }

    /**
     * Sets the value of the sauna property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setSauna(Boolean value) {
        this.sauna = value;
    }

    /**
     * Gets the value of the swimmingpool property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getSwimmingpool() {
        return swimmingpool;
    }

    /**
     * Sets the value of the swimmingpool property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setSwimmingpool(Boolean value) {
        this.swimmingpool = value;
    }

    /**
     * Gets the value of the waschTrockenraum property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getWaschTrockenraum() {
        return waschTrockenraum;
    }

    /**
     * Sets the value of the waschTrockenraum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setWaschTrockenraum(Boolean value) {
        this.waschTrockenraum = value;
    }

    /**
     * Gets the value of the dvVerkabelung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getDvVerkabelung() {
        return dvVerkabelung;
    }

    /**
     * Sets the value of the dvVerkabelung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setDvVerkabelung(Boolean value) {
        this.dvVerkabelung = value;
    }

    /**
     * Gets the value of the rampe property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getRampe() {
        return rampe;
    }

    /**
     * Sets the value of the rampe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setRampe(Boolean value) {
        this.rampe = value;
    }

    /**
     * Gets the value of the hebebuehne property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getHebebuehne() {
        return hebebuehne;
    }

    /**
     * Sets the value of the hebebuehne property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setHebebuehne(Boolean value) {
        this.hebebuehne = value;
    }

    /**
     * Gets the value of the kran property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getKran() {
        return kran;
    }

    /**
     * Sets the value of the kran property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setKran(Boolean value) {
        this.kran = value;
    }

    /**
     * Gets the value of the gastterrasse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getGastterrasse() {
        return gastterrasse;
    }

    /**
     * Sets the value of the gastterrasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setGastterrasse(Boolean value) {
        this.gastterrasse = value;
    }

    /**
     * Gets the value of the stromanschlusswert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public BigDecimal getStromanschlusswert() {
        return stromanschlusswert;
    }

    /**
     * Sets the value of the stromanschlusswert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setStromanschlusswert(BigDecimal value) {
        this.stromanschlusswert = value;
    }

    /**
     * Gets the value of the kantineCafeteria property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getKantineCafeteria() {
        return kantineCafeteria;
    }

    /**
     * Sets the value of the kantineCafeteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setKantineCafeteria(Boolean value) {
        this.kantineCafeteria = value;
    }

    /**
     * Gets the value of the teekueche property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getTeekueche() {
        return teekueche;
    }

    /**
     * Sets the value of the teekueche property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setTeekueche(Boolean value) {
        this.teekueche = value;
    }

    /**
     * Gets the value of the hallenhoehe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public BigDecimal getHallenhoehe() {
        return hallenhoehe;
    }

    /**
     * Sets the value of the hallenhoehe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setHallenhoehe(BigDecimal value) {
        this.hallenhoehe = value;
    }

    /**
     * Gets the value of the angeschlGastronomie property.
     * 
     * @return
     *     possible object is
     *     {@link AngeschlGastronomie }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public AngeschlGastronomie getAngeschlGastronomie() {
        return angeschlGastronomie;
    }

    /**
     * Sets the value of the angeschlGastronomie property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngeschlGastronomie }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setAngeschlGastronomie(AngeschlGastronomie value) {
        this.angeschlGastronomie = value;
    }

    /**
     * Gets the value of the brauereibindung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getBrauereibindung() {
        return brauereibindung;
    }

    /**
     * Sets the value of the brauereibindung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setBrauereibindung(Boolean value) {
        this.brauereibindung = value;
    }

    /**
     * Gets the value of the sporteinrichtungen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getSporteinrichtungen() {
        return sporteinrichtungen;
    }

    /**
     * Sets the value of the sporteinrichtungen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setSporteinrichtungen(Boolean value) {
        this.sporteinrichtungen = value;
    }

    /**
     * Gets the value of the wellnessbereich property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getWellnessbereich() {
        return wellnessbereich;
    }

    /**
     * Sets the value of the wellnessbereich property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setWellnessbereich(Boolean value) {
        this.wellnessbereich = value;
    }

    /**
     * Gets the value of the serviceleistungen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceleistungen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceleistungen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Serviceleistungen }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public List<Serviceleistungen> getServiceleistungen() {
        if (serviceleistungen == null) {
            serviceleistungen = new ArrayList<Serviceleistungen>();
        }
        return this.serviceleistungen;
    }

    /**
     * Gets the value of the telefonFerienimmobilie property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getTelefonFerienimmobilie() {
        return telefonFerienimmobilie;
    }

    /**
     * Sets the value of the telefonFerienimmobilie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setTelefonFerienimmobilie(Boolean value) {
        this.telefonFerienimmobilie = value;
    }

    /**
     * Gets the value of the sicherheitstechnik property.
     * 
     * @return
     *     possible object is
     *     {@link Sicherheitstechnik }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Sicherheitstechnik getSicherheitstechnik() {
        return sicherheitstechnik;
    }

    /**
     * Sets the value of the sicherheitstechnik property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sicherheitstechnik }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setSicherheitstechnik(Sicherheitstechnik value) {
        this.sicherheitstechnik = value;
    }

    /**
     * Gets the value of the unterkellert property.
     * 
     * @return
     *     possible object is
     *     {@link Unterkellert }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Unterkellert getUnterkellert() {
        return unterkellert;
    }

    /**
     * Sets the value of the unterkellert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Unterkellert }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setUnterkellert(Unterkellert value) {
        this.unterkellert = value;
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public List<UserDefinedAnyfield> getUserDefinedAnyfield() {
        if (userDefinedAnyfield == null) {
            userDefinedAnyfield = new ArrayList<UserDefinedAnyfield>();
        }
        return this.userDefinedAnyfield;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            Boolean theWgGeeignet;
            theWgGeeignet = this.getWgGeeignet();
            strategy.appendField(locator, this, "wgGeeignet", buffer, theWgGeeignet, (this.wgGeeignet!= null));
        }
        {
            Boolean theRaeumeVeraenderbar;
            theRaeumeVeraenderbar = this.getRaeumeVeraenderbar();
            strategy.appendField(locator, this, "raeumeVeraenderbar", buffer, theRaeumeVeraenderbar, (this.raeumeVeraenderbar!= null));
        }
        {
            Bad theBad;
            theBad = this.getBad();
            strategy.appendField(locator, this, "bad", buffer, theBad, (this.bad!= null));
        }
        {
            Kueche theKueche;
            theKueche = this.getKueche();
            strategy.appendField(locator, this, "kueche", buffer, theKueche, (this.kueche!= null));
        }
        {
            Boden theBoden;
            theBoden = this.getBoden();
            strategy.appendField(locator, this, "boden", buffer, theBoden, (this.boden!= null));
        }
        {
            Boolean theKamin;
            theKamin = this.getKamin();
            strategy.appendField(locator, this, "kamin", buffer, theKamin, (this.kamin!= null));
        }
        {
            Heizungsart theHeizungsart;
            theHeizungsart = this.getHeizungsart();
            strategy.appendField(locator, this, "heizungsart", buffer, theHeizungsart, (this.heizungsart!= null));
        }
        {
            Befeuerung theBefeuerung;
            theBefeuerung = this.getBefeuerung();
            strategy.appendField(locator, this, "befeuerung", buffer, theBefeuerung, (this.befeuerung!= null));
        }
        {
            Boolean theKlimatisiert;
            theKlimatisiert = this.getKlimatisiert();
            strategy.appendField(locator, this, "klimatisiert", buffer, theKlimatisiert, (this.klimatisiert!= null));
        }
        {
            Fahrstuhl theFahrstuhl;
            theFahrstuhl = this.getFahrstuhl();
            strategy.appendField(locator, this, "fahrstuhl", buffer, theFahrstuhl, (this.fahrstuhl!= null));
        }
        {
            List<Stellplatzart> theStellplatzart;
            theStellplatzart = (((this.stellplatzart!= null)&&(!this.stellplatzart.isEmpty()))?this.getStellplatzart():null);
            strategy.appendField(locator, this, "stellplatzart", buffer, theStellplatzart, ((this.stellplatzart!= null)&&(!this.stellplatzart.isEmpty())));
        }
        {
            Boolean theGartennutzung;
            theGartennutzung = this.getGartennutzung();
            strategy.appendField(locator, this, "gartennutzung", buffer, theGartennutzung, (this.gartennutzung!= null));
        }
        {
            AusrichtBalkonTerrasse theAusrichtBalkonTerrasse;
            theAusrichtBalkonTerrasse = this.getAusrichtBalkonTerrasse();
            strategy.appendField(locator, this, "ausrichtBalkonTerrasse", buffer, theAusrichtBalkonTerrasse, (this.ausrichtBalkonTerrasse!= null));
        }
        {
            Moebliert theMoebliert;
            theMoebliert = this.getMoebliert();
            strategy.appendField(locator, this, "moebliert", buffer, theMoebliert, (this.moebliert!= null));
        }
        {
            Boolean theRollstuhlgerecht;
            theRollstuhlgerecht = this.getRollstuhlgerecht();
            strategy.appendField(locator, this, "rollstuhlgerecht", buffer, theRollstuhlgerecht, (this.rollstuhlgerecht!= null));
        }
        {
            Boolean theKabelSatTv;
            theKabelSatTv = this.getKabelSatTv();
            strategy.appendField(locator, this, "kabelSatTv", buffer, theKabelSatTv, (this.kabelSatTv!= null));
        }
        {
            Boolean theBarrierefrei;
            theBarrierefrei = this.getBarrierefrei();
            strategy.appendField(locator, this, "barrierefrei", buffer, theBarrierefrei, (this.barrierefrei!= null));
        }
        {
            Boolean theSauna;
            theSauna = this.getSauna();
            strategy.appendField(locator, this, "sauna", buffer, theSauna, (this.sauna!= null));
        }
        {
            Boolean theSwimmingpool;
            theSwimmingpool = this.getSwimmingpool();
            strategy.appendField(locator, this, "swimmingpool", buffer, theSwimmingpool, (this.swimmingpool!= null));
        }
        {
            Boolean theWaschTrockenraum;
            theWaschTrockenraum = this.getWaschTrockenraum();
            strategy.appendField(locator, this, "waschTrockenraum", buffer, theWaschTrockenraum, (this.waschTrockenraum!= null));
        }
        {
            Boolean theDvVerkabelung;
            theDvVerkabelung = this.getDvVerkabelung();
            strategy.appendField(locator, this, "dvVerkabelung", buffer, theDvVerkabelung, (this.dvVerkabelung!= null));
        }
        {
            Boolean theRampe;
            theRampe = this.getRampe();
            strategy.appendField(locator, this, "rampe", buffer, theRampe, (this.rampe!= null));
        }
        {
            Boolean theHebebuehne;
            theHebebuehne = this.getHebebuehne();
            strategy.appendField(locator, this, "hebebuehne", buffer, theHebebuehne, (this.hebebuehne!= null));
        }
        {
            Boolean theKran;
            theKran = this.getKran();
            strategy.appendField(locator, this, "kran", buffer, theKran, (this.kran!= null));
        }
        {
            Boolean theGastterrasse;
            theGastterrasse = this.getGastterrasse();
            strategy.appendField(locator, this, "gastterrasse", buffer, theGastterrasse, (this.gastterrasse!= null));
        }
        {
            BigDecimal theStromanschlusswert;
            theStromanschlusswert = this.getStromanschlusswert();
            strategy.appendField(locator, this, "stromanschlusswert", buffer, theStromanschlusswert, (this.stromanschlusswert!= null));
        }
        {
            Boolean theKantineCafeteria;
            theKantineCafeteria = this.getKantineCafeteria();
            strategy.appendField(locator, this, "kantineCafeteria", buffer, theKantineCafeteria, (this.kantineCafeteria!= null));
        }
        {
            Boolean theTeekueche;
            theTeekueche = this.getTeekueche();
            strategy.appendField(locator, this, "teekueche", buffer, theTeekueche, (this.teekueche!= null));
        }
        {
            BigDecimal theHallenhoehe;
            theHallenhoehe = this.getHallenhoehe();
            strategy.appendField(locator, this, "hallenhoehe", buffer, theHallenhoehe, (this.hallenhoehe!= null));
        }
        {
            AngeschlGastronomie theAngeschlGastronomie;
            theAngeschlGastronomie = this.getAngeschlGastronomie();
            strategy.appendField(locator, this, "angeschlGastronomie", buffer, theAngeschlGastronomie, (this.angeschlGastronomie!= null));
        }
        {
            Boolean theBrauereibindung;
            theBrauereibindung = this.getBrauereibindung();
            strategy.appendField(locator, this, "brauereibindung", buffer, theBrauereibindung, (this.brauereibindung!= null));
        }
        {
            Boolean theSporteinrichtungen;
            theSporteinrichtungen = this.getSporteinrichtungen();
            strategy.appendField(locator, this, "sporteinrichtungen", buffer, theSporteinrichtungen, (this.sporteinrichtungen!= null));
        }
        {
            Boolean theWellnessbereich;
            theWellnessbereich = this.getWellnessbereich();
            strategy.appendField(locator, this, "wellnessbereich", buffer, theWellnessbereich, (this.wellnessbereich!= null));
        }
        {
            List<Serviceleistungen> theServiceleistungen;
            theServiceleistungen = (((this.serviceleistungen!= null)&&(!this.serviceleistungen.isEmpty()))?this.getServiceleistungen():null);
            strategy.appendField(locator, this, "serviceleistungen", buffer, theServiceleistungen, ((this.serviceleistungen!= null)&&(!this.serviceleistungen.isEmpty())));
        }
        {
            Boolean theTelefonFerienimmobilie;
            theTelefonFerienimmobilie = this.getTelefonFerienimmobilie();
            strategy.appendField(locator, this, "telefonFerienimmobilie", buffer, theTelefonFerienimmobilie, (this.telefonFerienimmobilie!= null));
        }
        {
            Sicherheitstechnik theSicherheitstechnik;
            theSicherheitstechnik = this.getSicherheitstechnik();
            strategy.appendField(locator, this, "sicherheitstechnik", buffer, theSicherheitstechnik, (this.sicherheitstechnik!= null));
        }
        {
            Unterkellert theUnterkellert;
            theUnterkellert = this.getUnterkellert();
            strategy.appendField(locator, this, "unterkellert", buffer, theUnterkellert, (this.unterkellert!= null));
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
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Ausstattung) {
            final Ausstattung copy = ((Ausstattung) draftCopy);
            {
                Boolean wgGeeignetShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wgGeeignet!= null));
                if (wgGeeignetShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceWgGeeignet;
                    sourceWgGeeignet = this.getWgGeeignet();
                    Boolean copyWgGeeignet = ((Boolean) strategy.copy(LocatorUtils.property(locator, "wgGeeignet", sourceWgGeeignet), sourceWgGeeignet, (this.wgGeeignet!= null)));
                    copy.setWgGeeignet(copyWgGeeignet);
                } else {
                    if (wgGeeignetShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wgGeeignet = null;
                    }
                }
            }
            {
                Boolean raeumeVeraenderbarShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.raeumeVeraenderbar!= null));
                if (raeumeVeraenderbarShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceRaeumeVeraenderbar;
                    sourceRaeumeVeraenderbar = this.getRaeumeVeraenderbar();
                    Boolean copyRaeumeVeraenderbar = ((Boolean) strategy.copy(LocatorUtils.property(locator, "raeumeVeraenderbar", sourceRaeumeVeraenderbar), sourceRaeumeVeraenderbar, (this.raeumeVeraenderbar!= null)));
                    copy.setRaeumeVeraenderbar(copyRaeumeVeraenderbar);
                } else {
                    if (raeumeVeraenderbarShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.raeumeVeraenderbar = null;
                    }
                }
            }
            {
                Boolean badShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bad!= null));
                if (badShouldBeCopiedAndSet == Boolean.TRUE) {
                    Bad sourceBad;
                    sourceBad = this.getBad();
                    Bad copyBad = ((Bad) strategy.copy(LocatorUtils.property(locator, "bad", sourceBad), sourceBad, (this.bad!= null)));
                    copy.setBad(copyBad);
                } else {
                    if (badShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bad = null;
                    }
                }
            }
            {
                Boolean kuecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kueche!= null));
                if (kuecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    Kueche sourceKueche;
                    sourceKueche = this.getKueche();
                    Kueche copyKueche = ((Kueche) strategy.copy(LocatorUtils.property(locator, "kueche", sourceKueche), sourceKueche, (this.kueche!= null)));
                    copy.setKueche(copyKueche);
                } else {
                    if (kuecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kueche = null;
                    }
                }
            }
            {
                Boolean bodenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.boden!= null));
                if (bodenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boden sourceBoden;
                    sourceBoden = this.getBoden();
                    Boden copyBoden = ((Boden) strategy.copy(LocatorUtils.property(locator, "boden", sourceBoden), sourceBoden, (this.boden!= null)));
                    copy.setBoden(copyBoden);
                } else {
                    if (bodenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.boden = null;
                    }
                }
            }
            {
                Boolean kaminShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kamin!= null));
                if (kaminShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceKamin;
                    sourceKamin = this.getKamin();
                    Boolean copyKamin = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kamin", sourceKamin), sourceKamin, (this.kamin!= null)));
                    copy.setKamin(copyKamin);
                } else {
                    if (kaminShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kamin = null;
                    }
                }
            }
            {
                Boolean heizungsartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.heizungsart!= null));
                if (heizungsartShouldBeCopiedAndSet == Boolean.TRUE) {
                    Heizungsart sourceHeizungsart;
                    sourceHeizungsart = this.getHeizungsart();
                    Heizungsart copyHeizungsart = ((Heizungsart) strategy.copy(LocatorUtils.property(locator, "heizungsart", sourceHeizungsart), sourceHeizungsart, (this.heizungsart!= null)));
                    copy.setHeizungsart(copyHeizungsart);
                } else {
                    if (heizungsartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.heizungsart = null;
                    }
                }
            }
            {
                Boolean befeuerungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.befeuerung!= null));
                if (befeuerungShouldBeCopiedAndSet == Boolean.TRUE) {
                    Befeuerung sourceBefeuerung;
                    sourceBefeuerung = this.getBefeuerung();
                    Befeuerung copyBefeuerung = ((Befeuerung) strategy.copy(LocatorUtils.property(locator, "befeuerung", sourceBefeuerung), sourceBefeuerung, (this.befeuerung!= null)));
                    copy.setBefeuerung(copyBefeuerung);
                } else {
                    if (befeuerungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.befeuerung = null;
                    }
                }
            }
            {
                Boolean klimatisiertShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.klimatisiert!= null));
                if (klimatisiertShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceKlimatisiert;
                    sourceKlimatisiert = this.getKlimatisiert();
                    Boolean copyKlimatisiert = ((Boolean) strategy.copy(LocatorUtils.property(locator, "klimatisiert", sourceKlimatisiert), sourceKlimatisiert, (this.klimatisiert!= null)));
                    copy.setKlimatisiert(copyKlimatisiert);
                } else {
                    if (klimatisiertShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.klimatisiert = null;
                    }
                }
            }
            {
                Boolean fahrstuhlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fahrstuhl!= null));
                if (fahrstuhlShouldBeCopiedAndSet == Boolean.TRUE) {
                    Fahrstuhl sourceFahrstuhl;
                    sourceFahrstuhl = this.getFahrstuhl();
                    Fahrstuhl copyFahrstuhl = ((Fahrstuhl) strategy.copy(LocatorUtils.property(locator, "fahrstuhl", sourceFahrstuhl), sourceFahrstuhl, (this.fahrstuhl!= null)));
                    copy.setFahrstuhl(copyFahrstuhl);
                } else {
                    if (fahrstuhlShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fahrstuhl = null;
                    }
                }
            }
            {
                Boolean stellplatzartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.stellplatzart!= null)&&(!this.stellplatzart.isEmpty())));
                if (stellplatzartShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Stellplatzart> sourceStellplatzart;
                    sourceStellplatzart = (((this.stellplatzart!= null)&&(!this.stellplatzart.isEmpty()))?this.getStellplatzart():null);
                    @SuppressWarnings("unchecked")
                    List<Stellplatzart> copyStellplatzart = ((List<Stellplatzart> ) strategy.copy(LocatorUtils.property(locator, "stellplatzart", sourceStellplatzart), sourceStellplatzart, ((this.stellplatzart!= null)&&(!this.stellplatzart.isEmpty()))));
                    copy.stellplatzart = null;
                    if (copyStellplatzart!= null) {
                        List<Stellplatzart> uniqueStellplatzartl = copy.getStellplatzart();
                        uniqueStellplatzartl.addAll(copyStellplatzart);
                    }
                } else {
                    if (stellplatzartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.stellplatzart = null;
                    }
                }
            }
            {
                Boolean gartennutzungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gartennutzung!= null));
                if (gartennutzungShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceGartennutzung;
                    sourceGartennutzung = this.getGartennutzung();
                    Boolean copyGartennutzung = ((Boolean) strategy.copy(LocatorUtils.property(locator, "gartennutzung", sourceGartennutzung), sourceGartennutzung, (this.gartennutzung!= null)));
                    copy.setGartennutzung(copyGartennutzung);
                } else {
                    if (gartennutzungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gartennutzung = null;
                    }
                }
            }
            {
                Boolean ausrichtBalkonTerrasseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ausrichtBalkonTerrasse!= null));
                if (ausrichtBalkonTerrasseShouldBeCopiedAndSet == Boolean.TRUE) {
                    AusrichtBalkonTerrasse sourceAusrichtBalkonTerrasse;
                    sourceAusrichtBalkonTerrasse = this.getAusrichtBalkonTerrasse();
                    AusrichtBalkonTerrasse copyAusrichtBalkonTerrasse = ((AusrichtBalkonTerrasse) strategy.copy(LocatorUtils.property(locator, "ausrichtBalkonTerrasse", sourceAusrichtBalkonTerrasse), sourceAusrichtBalkonTerrasse, (this.ausrichtBalkonTerrasse!= null)));
                    copy.setAusrichtBalkonTerrasse(copyAusrichtBalkonTerrasse);
                } else {
                    if (ausrichtBalkonTerrasseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ausrichtBalkonTerrasse = null;
                    }
                }
            }
            {
                Boolean moebliertShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.moebliert!= null));
                if (moebliertShouldBeCopiedAndSet == Boolean.TRUE) {
                    Moebliert sourceMoebliert;
                    sourceMoebliert = this.getMoebliert();
                    Moebliert copyMoebliert = ((Moebliert) strategy.copy(LocatorUtils.property(locator, "moebliert", sourceMoebliert), sourceMoebliert, (this.moebliert!= null)));
                    copy.setMoebliert(copyMoebliert);
                } else {
                    if (moebliertShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.moebliert = null;
                    }
                }
            }
            {
                Boolean rollstuhlgerechtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.rollstuhlgerecht!= null));
                if (rollstuhlgerechtShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceRollstuhlgerecht;
                    sourceRollstuhlgerecht = this.getRollstuhlgerecht();
                    Boolean copyRollstuhlgerecht = ((Boolean) strategy.copy(LocatorUtils.property(locator, "rollstuhlgerecht", sourceRollstuhlgerecht), sourceRollstuhlgerecht, (this.rollstuhlgerecht!= null)));
                    copy.setRollstuhlgerecht(copyRollstuhlgerecht);
                } else {
                    if (rollstuhlgerechtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.rollstuhlgerecht = null;
                    }
                }
            }
            {
                Boolean kabelSatTvShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kabelSatTv!= null));
                if (kabelSatTvShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceKabelSatTv;
                    sourceKabelSatTv = this.getKabelSatTv();
                    Boolean copyKabelSatTv = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kabelSatTv", sourceKabelSatTv), sourceKabelSatTv, (this.kabelSatTv!= null)));
                    copy.setKabelSatTv(copyKabelSatTv);
                } else {
                    if (kabelSatTvShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kabelSatTv = null;
                    }
                }
            }
            {
                Boolean barrierefreiShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.barrierefrei!= null));
                if (barrierefreiShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceBarrierefrei;
                    sourceBarrierefrei = this.getBarrierefrei();
                    Boolean copyBarrierefrei = ((Boolean) strategy.copy(LocatorUtils.property(locator, "barrierefrei", sourceBarrierefrei), sourceBarrierefrei, (this.barrierefrei!= null)));
                    copy.setBarrierefrei(copyBarrierefrei);
                } else {
                    if (barrierefreiShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.barrierefrei = null;
                    }
                }
            }
            {
                Boolean saunaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sauna!= null));
                if (saunaShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceSauna;
                    sourceSauna = this.getSauna();
                    Boolean copySauna = ((Boolean) strategy.copy(LocatorUtils.property(locator, "sauna", sourceSauna), sourceSauna, (this.sauna!= null)));
                    copy.setSauna(copySauna);
                } else {
                    if (saunaShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sauna = null;
                    }
                }
            }
            {
                Boolean swimmingpoolShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.swimmingpool!= null));
                if (swimmingpoolShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceSwimmingpool;
                    sourceSwimmingpool = this.getSwimmingpool();
                    Boolean copySwimmingpool = ((Boolean) strategy.copy(LocatorUtils.property(locator, "swimmingpool", sourceSwimmingpool), sourceSwimmingpool, (this.swimmingpool!= null)));
                    copy.setSwimmingpool(copySwimmingpool);
                } else {
                    if (swimmingpoolShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.swimmingpool = null;
                    }
                }
            }
            {
                Boolean waschTrockenraumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.waschTrockenraum!= null));
                if (waschTrockenraumShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceWaschTrockenraum;
                    sourceWaschTrockenraum = this.getWaschTrockenraum();
                    Boolean copyWaschTrockenraum = ((Boolean) strategy.copy(LocatorUtils.property(locator, "waschTrockenraum", sourceWaschTrockenraum), sourceWaschTrockenraum, (this.waschTrockenraum!= null)));
                    copy.setWaschTrockenraum(copyWaschTrockenraum);
                } else {
                    if (waschTrockenraumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.waschTrockenraum = null;
                    }
                }
            }
            {
                Boolean dvVerkabelungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dvVerkabelung!= null));
                if (dvVerkabelungShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceDvVerkabelung;
                    sourceDvVerkabelung = this.getDvVerkabelung();
                    Boolean copyDvVerkabelung = ((Boolean) strategy.copy(LocatorUtils.property(locator, "dvVerkabelung", sourceDvVerkabelung), sourceDvVerkabelung, (this.dvVerkabelung!= null)));
                    copy.setDvVerkabelung(copyDvVerkabelung);
                } else {
                    if (dvVerkabelungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dvVerkabelung = null;
                    }
                }
            }
            {
                Boolean rampeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.rampe!= null));
                if (rampeShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceRampe;
                    sourceRampe = this.getRampe();
                    Boolean copyRampe = ((Boolean) strategy.copy(LocatorUtils.property(locator, "rampe", sourceRampe), sourceRampe, (this.rampe!= null)));
                    copy.setRampe(copyRampe);
                } else {
                    if (rampeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.rampe = null;
                    }
                }
            }
            {
                Boolean hebebuehneShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hebebuehne!= null));
                if (hebebuehneShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceHebebuehne;
                    sourceHebebuehne = this.getHebebuehne();
                    Boolean copyHebebuehne = ((Boolean) strategy.copy(LocatorUtils.property(locator, "hebebuehne", sourceHebebuehne), sourceHebebuehne, (this.hebebuehne!= null)));
                    copy.setHebebuehne(copyHebebuehne);
                } else {
                    if (hebebuehneShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hebebuehne = null;
                    }
                }
            }
            {
                Boolean kranShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kran!= null));
                if (kranShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceKran;
                    sourceKran = this.getKran();
                    Boolean copyKran = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kran", sourceKran), sourceKran, (this.kran!= null)));
                    copy.setKran(copyKran);
                } else {
                    if (kranShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kran = null;
                    }
                }
            }
            {
                Boolean gastterrasseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gastterrasse!= null));
                if (gastterrasseShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceGastterrasse;
                    sourceGastterrasse = this.getGastterrasse();
                    Boolean copyGastterrasse = ((Boolean) strategy.copy(LocatorUtils.property(locator, "gastterrasse", sourceGastterrasse), sourceGastterrasse, (this.gastterrasse!= null)));
                    copy.setGastterrasse(copyGastterrasse);
                } else {
                    if (gastterrasseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gastterrasse = null;
                    }
                }
            }
            {
                Boolean stromanschlusswertShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.stromanschlusswert!= null));
                if (stromanschlusswertShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceStromanschlusswert;
                    sourceStromanschlusswert = this.getStromanschlusswert();
                    BigDecimal copyStromanschlusswert = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "stromanschlusswert", sourceStromanschlusswert), sourceStromanschlusswert, (this.stromanschlusswert!= null)));
                    copy.setStromanschlusswert(copyStromanschlusswert);
                } else {
                    if (stromanschlusswertShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.stromanschlusswert = null;
                    }
                }
            }
            {
                Boolean kantineCafeteriaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kantineCafeteria!= null));
                if (kantineCafeteriaShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceKantineCafeteria;
                    sourceKantineCafeteria = this.getKantineCafeteria();
                    Boolean copyKantineCafeteria = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kantineCafeteria", sourceKantineCafeteria), sourceKantineCafeteria, (this.kantineCafeteria!= null)));
                    copy.setKantineCafeteria(copyKantineCafeteria);
                } else {
                    if (kantineCafeteriaShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kantineCafeteria = null;
                    }
                }
            }
            {
                Boolean teekuecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.teekueche!= null));
                if (teekuecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceTeekueche;
                    sourceTeekueche = this.getTeekueche();
                    Boolean copyTeekueche = ((Boolean) strategy.copy(LocatorUtils.property(locator, "teekueche", sourceTeekueche), sourceTeekueche, (this.teekueche!= null)));
                    copy.setTeekueche(copyTeekueche);
                } else {
                    if (teekuecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.teekueche = null;
                    }
                }
            }
            {
                Boolean hallenhoeheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hallenhoehe!= null));
                if (hallenhoeheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceHallenhoehe;
                    sourceHallenhoehe = this.getHallenhoehe();
                    BigDecimal copyHallenhoehe = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "hallenhoehe", sourceHallenhoehe), sourceHallenhoehe, (this.hallenhoehe!= null)));
                    copy.setHallenhoehe(copyHallenhoehe);
                } else {
                    if (hallenhoeheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hallenhoehe = null;
                    }
                }
            }
            {
                Boolean angeschlGastronomieShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.angeschlGastronomie!= null));
                if (angeschlGastronomieShouldBeCopiedAndSet == Boolean.TRUE) {
                    AngeschlGastronomie sourceAngeschlGastronomie;
                    sourceAngeschlGastronomie = this.getAngeschlGastronomie();
                    AngeschlGastronomie copyAngeschlGastronomie = ((AngeschlGastronomie) strategy.copy(LocatorUtils.property(locator, "angeschlGastronomie", sourceAngeschlGastronomie), sourceAngeschlGastronomie, (this.angeschlGastronomie!= null)));
                    copy.setAngeschlGastronomie(copyAngeschlGastronomie);
                } else {
                    if (angeschlGastronomieShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.angeschlGastronomie = null;
                    }
                }
            }
            {
                Boolean brauereibindungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.brauereibindung!= null));
                if (brauereibindungShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceBrauereibindung;
                    sourceBrauereibindung = this.getBrauereibindung();
                    Boolean copyBrauereibindung = ((Boolean) strategy.copy(LocatorUtils.property(locator, "brauereibindung", sourceBrauereibindung), sourceBrauereibindung, (this.brauereibindung!= null)));
                    copy.setBrauereibindung(copyBrauereibindung);
                } else {
                    if (brauereibindungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.brauereibindung = null;
                    }
                }
            }
            {
                Boolean sporteinrichtungenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sporteinrichtungen!= null));
                if (sporteinrichtungenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceSporteinrichtungen;
                    sourceSporteinrichtungen = this.getSporteinrichtungen();
                    Boolean copySporteinrichtungen = ((Boolean) strategy.copy(LocatorUtils.property(locator, "sporteinrichtungen", sourceSporteinrichtungen), sourceSporteinrichtungen, (this.sporteinrichtungen!= null)));
                    copy.setSporteinrichtungen(copySporteinrichtungen);
                } else {
                    if (sporteinrichtungenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sporteinrichtungen = null;
                    }
                }
            }
            {
                Boolean wellnessbereichShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wellnessbereich!= null));
                if (wellnessbereichShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceWellnessbereich;
                    sourceWellnessbereich = this.getWellnessbereich();
                    Boolean copyWellnessbereich = ((Boolean) strategy.copy(LocatorUtils.property(locator, "wellnessbereich", sourceWellnessbereich), sourceWellnessbereich, (this.wellnessbereich!= null)));
                    copy.setWellnessbereich(copyWellnessbereich);
                } else {
                    if (wellnessbereichShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wellnessbereich = null;
                    }
                }
            }
            {
                Boolean serviceleistungenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.serviceleistungen!= null)&&(!this.serviceleistungen.isEmpty())));
                if (serviceleistungenShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Serviceleistungen> sourceServiceleistungen;
                    sourceServiceleistungen = (((this.serviceleistungen!= null)&&(!this.serviceleistungen.isEmpty()))?this.getServiceleistungen():null);
                    @SuppressWarnings("unchecked")
                    List<Serviceleistungen> copyServiceleistungen = ((List<Serviceleistungen> ) strategy.copy(LocatorUtils.property(locator, "serviceleistungen", sourceServiceleistungen), sourceServiceleistungen, ((this.serviceleistungen!= null)&&(!this.serviceleistungen.isEmpty()))));
                    copy.serviceleistungen = null;
                    if (copyServiceleistungen!= null) {
                        List<Serviceleistungen> uniqueServiceleistungenl = copy.getServiceleistungen();
                        uniqueServiceleistungenl.addAll(copyServiceleistungen);
                    }
                } else {
                    if (serviceleistungenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.serviceleistungen = null;
                    }
                }
            }
            {
                Boolean telefonFerienimmobilieShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.telefonFerienimmobilie!= null));
                if (telefonFerienimmobilieShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceTelefonFerienimmobilie;
                    sourceTelefonFerienimmobilie = this.getTelefonFerienimmobilie();
                    Boolean copyTelefonFerienimmobilie = ((Boolean) strategy.copy(LocatorUtils.property(locator, "telefonFerienimmobilie", sourceTelefonFerienimmobilie), sourceTelefonFerienimmobilie, (this.telefonFerienimmobilie!= null)));
                    copy.setTelefonFerienimmobilie(copyTelefonFerienimmobilie);
                } else {
                    if (telefonFerienimmobilieShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.telefonFerienimmobilie = null;
                    }
                }
            }
            {
                Boolean sicherheitstechnikShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sicherheitstechnik!= null));
                if (sicherheitstechnikShouldBeCopiedAndSet == Boolean.TRUE) {
                    Sicherheitstechnik sourceSicherheitstechnik;
                    sourceSicherheitstechnik = this.getSicherheitstechnik();
                    Sicherheitstechnik copySicherheitstechnik = ((Sicherheitstechnik) strategy.copy(LocatorUtils.property(locator, "sicherheitstechnik", sourceSicherheitstechnik), sourceSicherheitstechnik, (this.sicherheitstechnik!= null)));
                    copy.setSicherheitstechnik(copySicherheitstechnik);
                } else {
                    if (sicherheitstechnikShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sicherheitstechnik = null;
                    }
                }
            }
            {
                Boolean unterkellertShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.unterkellert!= null));
                if (unterkellertShouldBeCopiedAndSet == Boolean.TRUE) {
                    Unterkellert sourceUnterkellert;
                    sourceUnterkellert = this.getUnterkellert();
                    Unterkellert copyUnterkellert = ((Unterkellert) strategy.copy(LocatorUtils.property(locator, "unterkellert", sourceUnterkellert), sourceUnterkellert, (this.unterkellert!= null)));
                    copy.setUnterkellert(copyUnterkellert);
                } else {
                    if (unterkellertShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unterkellert = null;
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
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new Ausstattung();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Ausstattung that = ((Ausstattung) object);
        {
            Boolean lhsWgGeeignet;
            lhsWgGeeignet = this.getWgGeeignet();
            Boolean rhsWgGeeignet;
            rhsWgGeeignet = that.getWgGeeignet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wgGeeignet", lhsWgGeeignet), LocatorUtils.property(thatLocator, "wgGeeignet", rhsWgGeeignet), lhsWgGeeignet, rhsWgGeeignet, (this.wgGeeignet!= null), (that.wgGeeignet!= null))) {
                return false;
            }
        }
        {
            Boolean lhsRaeumeVeraenderbar;
            lhsRaeumeVeraenderbar = this.getRaeumeVeraenderbar();
            Boolean rhsRaeumeVeraenderbar;
            rhsRaeumeVeraenderbar = that.getRaeumeVeraenderbar();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "raeumeVeraenderbar", lhsRaeumeVeraenderbar), LocatorUtils.property(thatLocator, "raeumeVeraenderbar", rhsRaeumeVeraenderbar), lhsRaeumeVeraenderbar, rhsRaeumeVeraenderbar, (this.raeumeVeraenderbar!= null), (that.raeumeVeraenderbar!= null))) {
                return false;
            }
        }
        {
            Bad lhsBad;
            lhsBad = this.getBad();
            Bad rhsBad;
            rhsBad = that.getBad();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bad", lhsBad), LocatorUtils.property(thatLocator, "bad", rhsBad), lhsBad, rhsBad, (this.bad!= null), (that.bad!= null))) {
                return false;
            }
        }
        {
            Kueche lhsKueche;
            lhsKueche = this.getKueche();
            Kueche rhsKueche;
            rhsKueche = that.getKueche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kueche", lhsKueche), LocatorUtils.property(thatLocator, "kueche", rhsKueche), lhsKueche, rhsKueche, (this.kueche!= null), (that.kueche!= null))) {
                return false;
            }
        }
        {
            Boden lhsBoden;
            lhsBoden = this.getBoden();
            Boden rhsBoden;
            rhsBoden = that.getBoden();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "boden", lhsBoden), LocatorUtils.property(thatLocator, "boden", rhsBoden), lhsBoden, rhsBoden, (this.boden!= null), (that.boden!= null))) {
                return false;
            }
        }
        {
            Boolean lhsKamin;
            lhsKamin = this.getKamin();
            Boolean rhsKamin;
            rhsKamin = that.getKamin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kamin", lhsKamin), LocatorUtils.property(thatLocator, "kamin", rhsKamin), lhsKamin, rhsKamin, (this.kamin!= null), (that.kamin!= null))) {
                return false;
            }
        }
        {
            Heizungsart lhsHeizungsart;
            lhsHeizungsart = this.getHeizungsart();
            Heizungsart rhsHeizungsart;
            rhsHeizungsart = that.getHeizungsart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heizungsart", lhsHeizungsart), LocatorUtils.property(thatLocator, "heizungsart", rhsHeizungsart), lhsHeizungsart, rhsHeizungsart, (this.heizungsart!= null), (that.heizungsart!= null))) {
                return false;
            }
        }
        {
            Befeuerung lhsBefeuerung;
            lhsBefeuerung = this.getBefeuerung();
            Befeuerung rhsBefeuerung;
            rhsBefeuerung = that.getBefeuerung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "befeuerung", lhsBefeuerung), LocatorUtils.property(thatLocator, "befeuerung", rhsBefeuerung), lhsBefeuerung, rhsBefeuerung, (this.befeuerung!= null), (that.befeuerung!= null))) {
                return false;
            }
        }
        {
            Boolean lhsKlimatisiert;
            lhsKlimatisiert = this.getKlimatisiert();
            Boolean rhsKlimatisiert;
            rhsKlimatisiert = that.getKlimatisiert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "klimatisiert", lhsKlimatisiert), LocatorUtils.property(thatLocator, "klimatisiert", rhsKlimatisiert), lhsKlimatisiert, rhsKlimatisiert, (this.klimatisiert!= null), (that.klimatisiert!= null))) {
                return false;
            }
        }
        {
            Fahrstuhl lhsFahrstuhl;
            lhsFahrstuhl = this.getFahrstuhl();
            Fahrstuhl rhsFahrstuhl;
            rhsFahrstuhl = that.getFahrstuhl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fahrstuhl", lhsFahrstuhl), LocatorUtils.property(thatLocator, "fahrstuhl", rhsFahrstuhl), lhsFahrstuhl, rhsFahrstuhl, (this.fahrstuhl!= null), (that.fahrstuhl!= null))) {
                return false;
            }
        }
        {
            List<Stellplatzart> lhsStellplatzart;
            lhsStellplatzart = (((this.stellplatzart!= null)&&(!this.stellplatzart.isEmpty()))?this.getStellplatzart():null);
            List<Stellplatzart> rhsStellplatzart;
            rhsStellplatzart = (((that.stellplatzart!= null)&&(!that.stellplatzart.isEmpty()))?that.getStellplatzart():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stellplatzart", lhsStellplatzart), LocatorUtils.property(thatLocator, "stellplatzart", rhsStellplatzart), lhsStellplatzart, rhsStellplatzart, ((this.stellplatzart!= null)&&(!this.stellplatzart.isEmpty())), ((that.stellplatzart!= null)&&(!that.stellplatzart.isEmpty())))) {
                return false;
            }
        }
        {
            Boolean lhsGartennutzung;
            lhsGartennutzung = this.getGartennutzung();
            Boolean rhsGartennutzung;
            rhsGartennutzung = that.getGartennutzung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gartennutzung", lhsGartennutzung), LocatorUtils.property(thatLocator, "gartennutzung", rhsGartennutzung), lhsGartennutzung, rhsGartennutzung, (this.gartennutzung!= null), (that.gartennutzung!= null))) {
                return false;
            }
        }
        {
            AusrichtBalkonTerrasse lhsAusrichtBalkonTerrasse;
            lhsAusrichtBalkonTerrasse = this.getAusrichtBalkonTerrasse();
            AusrichtBalkonTerrasse rhsAusrichtBalkonTerrasse;
            rhsAusrichtBalkonTerrasse = that.getAusrichtBalkonTerrasse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ausrichtBalkonTerrasse", lhsAusrichtBalkonTerrasse), LocatorUtils.property(thatLocator, "ausrichtBalkonTerrasse", rhsAusrichtBalkonTerrasse), lhsAusrichtBalkonTerrasse, rhsAusrichtBalkonTerrasse, (this.ausrichtBalkonTerrasse!= null), (that.ausrichtBalkonTerrasse!= null))) {
                return false;
            }
        }
        {
            Moebliert lhsMoebliert;
            lhsMoebliert = this.getMoebliert();
            Moebliert rhsMoebliert;
            rhsMoebliert = that.getMoebliert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "moebliert", lhsMoebliert), LocatorUtils.property(thatLocator, "moebliert", rhsMoebliert), lhsMoebliert, rhsMoebliert, (this.moebliert!= null), (that.moebliert!= null))) {
                return false;
            }
        }
        {
            Boolean lhsRollstuhlgerecht;
            lhsRollstuhlgerecht = this.getRollstuhlgerecht();
            Boolean rhsRollstuhlgerecht;
            rhsRollstuhlgerecht = that.getRollstuhlgerecht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rollstuhlgerecht", lhsRollstuhlgerecht), LocatorUtils.property(thatLocator, "rollstuhlgerecht", rhsRollstuhlgerecht), lhsRollstuhlgerecht, rhsRollstuhlgerecht, (this.rollstuhlgerecht!= null), (that.rollstuhlgerecht!= null))) {
                return false;
            }
        }
        {
            Boolean lhsKabelSatTv;
            lhsKabelSatTv = this.getKabelSatTv();
            Boolean rhsKabelSatTv;
            rhsKabelSatTv = that.getKabelSatTv();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kabelSatTv", lhsKabelSatTv), LocatorUtils.property(thatLocator, "kabelSatTv", rhsKabelSatTv), lhsKabelSatTv, rhsKabelSatTv, (this.kabelSatTv!= null), (that.kabelSatTv!= null))) {
                return false;
            }
        }
        {
            Boolean lhsBarrierefrei;
            lhsBarrierefrei = this.getBarrierefrei();
            Boolean rhsBarrierefrei;
            rhsBarrierefrei = that.getBarrierefrei();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "barrierefrei", lhsBarrierefrei), LocatorUtils.property(thatLocator, "barrierefrei", rhsBarrierefrei), lhsBarrierefrei, rhsBarrierefrei, (this.barrierefrei!= null), (that.barrierefrei!= null))) {
                return false;
            }
        }
        {
            Boolean lhsSauna;
            lhsSauna = this.getSauna();
            Boolean rhsSauna;
            rhsSauna = that.getSauna();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sauna", lhsSauna), LocatorUtils.property(thatLocator, "sauna", rhsSauna), lhsSauna, rhsSauna, (this.sauna!= null), (that.sauna!= null))) {
                return false;
            }
        }
        {
            Boolean lhsSwimmingpool;
            lhsSwimmingpool = this.getSwimmingpool();
            Boolean rhsSwimmingpool;
            rhsSwimmingpool = that.getSwimmingpool();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "swimmingpool", lhsSwimmingpool), LocatorUtils.property(thatLocator, "swimmingpool", rhsSwimmingpool), lhsSwimmingpool, rhsSwimmingpool, (this.swimmingpool!= null), (that.swimmingpool!= null))) {
                return false;
            }
        }
        {
            Boolean lhsWaschTrockenraum;
            lhsWaschTrockenraum = this.getWaschTrockenraum();
            Boolean rhsWaschTrockenraum;
            rhsWaschTrockenraum = that.getWaschTrockenraum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waschTrockenraum", lhsWaschTrockenraum), LocatorUtils.property(thatLocator, "waschTrockenraum", rhsWaschTrockenraum), lhsWaschTrockenraum, rhsWaschTrockenraum, (this.waschTrockenraum!= null), (that.waschTrockenraum!= null))) {
                return false;
            }
        }
        {
            Boolean lhsDvVerkabelung;
            lhsDvVerkabelung = this.getDvVerkabelung();
            Boolean rhsDvVerkabelung;
            rhsDvVerkabelung = that.getDvVerkabelung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dvVerkabelung", lhsDvVerkabelung), LocatorUtils.property(thatLocator, "dvVerkabelung", rhsDvVerkabelung), lhsDvVerkabelung, rhsDvVerkabelung, (this.dvVerkabelung!= null), (that.dvVerkabelung!= null))) {
                return false;
            }
        }
        {
            Boolean lhsRampe;
            lhsRampe = this.getRampe();
            Boolean rhsRampe;
            rhsRampe = that.getRampe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rampe", lhsRampe), LocatorUtils.property(thatLocator, "rampe", rhsRampe), lhsRampe, rhsRampe, (this.rampe!= null), (that.rampe!= null))) {
                return false;
            }
        }
        {
            Boolean lhsHebebuehne;
            lhsHebebuehne = this.getHebebuehne();
            Boolean rhsHebebuehne;
            rhsHebebuehne = that.getHebebuehne();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hebebuehne", lhsHebebuehne), LocatorUtils.property(thatLocator, "hebebuehne", rhsHebebuehne), lhsHebebuehne, rhsHebebuehne, (this.hebebuehne!= null), (that.hebebuehne!= null))) {
                return false;
            }
        }
        {
            Boolean lhsKran;
            lhsKran = this.getKran();
            Boolean rhsKran;
            rhsKran = that.getKran();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kran", lhsKran), LocatorUtils.property(thatLocator, "kran", rhsKran), lhsKran, rhsKran, (this.kran!= null), (that.kran!= null))) {
                return false;
            }
        }
        {
            Boolean lhsGastterrasse;
            lhsGastterrasse = this.getGastterrasse();
            Boolean rhsGastterrasse;
            rhsGastterrasse = that.getGastterrasse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gastterrasse", lhsGastterrasse), LocatorUtils.property(thatLocator, "gastterrasse", rhsGastterrasse), lhsGastterrasse, rhsGastterrasse, (this.gastterrasse!= null), (that.gastterrasse!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsStromanschlusswert;
            lhsStromanschlusswert = this.getStromanschlusswert();
            BigDecimal rhsStromanschlusswert;
            rhsStromanschlusswert = that.getStromanschlusswert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stromanschlusswert", lhsStromanschlusswert), LocatorUtils.property(thatLocator, "stromanschlusswert", rhsStromanschlusswert), lhsStromanschlusswert, rhsStromanschlusswert, (this.stromanschlusswert!= null), (that.stromanschlusswert!= null))) {
                return false;
            }
        }
        {
            Boolean lhsKantineCafeteria;
            lhsKantineCafeteria = this.getKantineCafeteria();
            Boolean rhsKantineCafeteria;
            rhsKantineCafeteria = that.getKantineCafeteria();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kantineCafeteria", lhsKantineCafeteria), LocatorUtils.property(thatLocator, "kantineCafeteria", rhsKantineCafeteria), lhsKantineCafeteria, rhsKantineCafeteria, (this.kantineCafeteria!= null), (that.kantineCafeteria!= null))) {
                return false;
            }
        }
        {
            Boolean lhsTeekueche;
            lhsTeekueche = this.getTeekueche();
            Boolean rhsTeekueche;
            rhsTeekueche = that.getTeekueche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "teekueche", lhsTeekueche), LocatorUtils.property(thatLocator, "teekueche", rhsTeekueche), lhsTeekueche, rhsTeekueche, (this.teekueche!= null), (that.teekueche!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsHallenhoehe;
            lhsHallenhoehe = this.getHallenhoehe();
            BigDecimal rhsHallenhoehe;
            rhsHallenhoehe = that.getHallenhoehe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hallenhoehe", lhsHallenhoehe), LocatorUtils.property(thatLocator, "hallenhoehe", rhsHallenhoehe), lhsHallenhoehe, rhsHallenhoehe, (this.hallenhoehe!= null), (that.hallenhoehe!= null))) {
                return false;
            }
        }
        {
            AngeschlGastronomie lhsAngeschlGastronomie;
            lhsAngeschlGastronomie = this.getAngeschlGastronomie();
            AngeschlGastronomie rhsAngeschlGastronomie;
            rhsAngeschlGastronomie = that.getAngeschlGastronomie();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "angeschlGastronomie", lhsAngeschlGastronomie), LocatorUtils.property(thatLocator, "angeschlGastronomie", rhsAngeschlGastronomie), lhsAngeschlGastronomie, rhsAngeschlGastronomie, (this.angeschlGastronomie!= null), (that.angeschlGastronomie!= null))) {
                return false;
            }
        }
        {
            Boolean lhsBrauereibindung;
            lhsBrauereibindung = this.getBrauereibindung();
            Boolean rhsBrauereibindung;
            rhsBrauereibindung = that.getBrauereibindung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "brauereibindung", lhsBrauereibindung), LocatorUtils.property(thatLocator, "brauereibindung", rhsBrauereibindung), lhsBrauereibindung, rhsBrauereibindung, (this.brauereibindung!= null), (that.brauereibindung!= null))) {
                return false;
            }
        }
        {
            Boolean lhsSporteinrichtungen;
            lhsSporteinrichtungen = this.getSporteinrichtungen();
            Boolean rhsSporteinrichtungen;
            rhsSporteinrichtungen = that.getSporteinrichtungen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sporteinrichtungen", lhsSporteinrichtungen), LocatorUtils.property(thatLocator, "sporteinrichtungen", rhsSporteinrichtungen), lhsSporteinrichtungen, rhsSporteinrichtungen, (this.sporteinrichtungen!= null), (that.sporteinrichtungen!= null))) {
                return false;
            }
        }
        {
            Boolean lhsWellnessbereich;
            lhsWellnessbereich = this.getWellnessbereich();
            Boolean rhsWellnessbereich;
            rhsWellnessbereich = that.getWellnessbereich();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wellnessbereich", lhsWellnessbereich), LocatorUtils.property(thatLocator, "wellnessbereich", rhsWellnessbereich), lhsWellnessbereich, rhsWellnessbereich, (this.wellnessbereich!= null), (that.wellnessbereich!= null))) {
                return false;
            }
        }
        {
            List<Serviceleistungen> lhsServiceleistungen;
            lhsServiceleistungen = (((this.serviceleistungen!= null)&&(!this.serviceleistungen.isEmpty()))?this.getServiceleistungen():null);
            List<Serviceleistungen> rhsServiceleistungen;
            rhsServiceleistungen = (((that.serviceleistungen!= null)&&(!that.serviceleistungen.isEmpty()))?that.getServiceleistungen():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceleistungen", lhsServiceleistungen), LocatorUtils.property(thatLocator, "serviceleistungen", rhsServiceleistungen), lhsServiceleistungen, rhsServiceleistungen, ((this.serviceleistungen!= null)&&(!this.serviceleistungen.isEmpty())), ((that.serviceleistungen!= null)&&(!that.serviceleistungen.isEmpty())))) {
                return false;
            }
        }
        {
            Boolean lhsTelefonFerienimmobilie;
            lhsTelefonFerienimmobilie = this.getTelefonFerienimmobilie();
            Boolean rhsTelefonFerienimmobilie;
            rhsTelefonFerienimmobilie = that.getTelefonFerienimmobilie();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telefonFerienimmobilie", lhsTelefonFerienimmobilie), LocatorUtils.property(thatLocator, "telefonFerienimmobilie", rhsTelefonFerienimmobilie), lhsTelefonFerienimmobilie, rhsTelefonFerienimmobilie, (this.telefonFerienimmobilie!= null), (that.telefonFerienimmobilie!= null))) {
                return false;
            }
        }
        {
            Sicherheitstechnik lhsSicherheitstechnik;
            lhsSicherheitstechnik = this.getSicherheitstechnik();
            Sicherheitstechnik rhsSicherheitstechnik;
            rhsSicherheitstechnik = that.getSicherheitstechnik();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sicherheitstechnik", lhsSicherheitstechnik), LocatorUtils.property(thatLocator, "sicherheitstechnik", rhsSicherheitstechnik), lhsSicherheitstechnik, rhsSicherheitstechnik, (this.sicherheitstechnik!= null), (that.sicherheitstechnik!= null))) {
                return false;
            }
        }
        {
            Unterkellert lhsUnterkellert;
            lhsUnterkellert = this.getUnterkellert();
            Unterkellert rhsUnterkellert;
            rhsUnterkellert = that.getUnterkellert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unterkellert", lhsUnterkellert), LocatorUtils.property(thatLocator, "unterkellert", rhsUnterkellert), lhsUnterkellert, rhsUnterkellert, (this.unterkellert!= null), (that.unterkellert!= null))) {
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
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
