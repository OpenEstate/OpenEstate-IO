
package org.openestate.io.immoxml.xml;

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
public class Ausstattung
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "wg_geeignet")
    protected Boolean wgGeeignet;
    @XmlElement(name = "raeume_veraenderbar")
    protected Boolean raeumeVeraenderbar;
    protected Bad bad;
    protected Kueche kueche;
    protected Boden boden;
    protected Boolean kamin;
    protected Heizungsart heizungsart;
    protected Befeuerung befeuerung;
    protected Boolean klimatisiert;
    protected Fahrstuhl fahrstuhl;
    protected List<Stellplatzart> stellplatzart;
    protected Boolean gartennutzung;
    @XmlElement(name = "ausricht_balkon_terrasse")
    protected AusrichtBalkonTerrasse ausrichtBalkonTerrasse;
    protected Moebliert moebliert;
    protected Boolean rollstuhlgerecht;
    @XmlElement(name = "kabel_sat_tv")
    protected Boolean kabelSatTv;
    protected Boolean barrierefrei;
    protected Boolean sauna;
    protected Boolean swimmingpool;
    @XmlElement(name = "wasch_trockenraum")
    protected Boolean waschTrockenraum;
    @XmlElement(name = "dv_verkabelung")
    protected Boolean dvVerkabelung;
    protected Boolean rampe;
    protected Boolean hebebuehne;
    protected Boolean kran;
    protected Boolean gastterrasse;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "decimal")
    protected Double stromanschlusswert;
    @XmlElement(name = "kantine_cafeteria")
    protected Boolean kantineCafeteria;
    protected Boolean teekueche;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double hallenhoehe;
    @XmlElement(name = "angeschl_gastronomie")
    protected AngeschlGastronomie angeschlGastronomie;
    protected Boolean brauereibindung;
    protected Boolean sporteinrichtungen;
    protected Boolean wellnessbereich;
    protected List<Serviceleistungen> serviceleistungen;
    @XmlElement(name = "telefon_ferienimmobilie")
    protected Boolean telefonFerienimmobilie;
    protected Sicherheitstechnik sicherheitstechnik;
    protected Unterkellert unterkellert;
    @XmlElement(name = "user_defined_simplefield")
    protected List<UserDefinedSimplefield> userDefinedSimplefield;
    @XmlElement(name = "user_defined_anyfield")
    protected List<UserDefinedAnyfield> userDefinedAnyfield;

    /**
     * Gets the value of the wgGeeignet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWgGeeignet() {
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
    public Boolean isRaeumeVeraenderbar() {
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
    public Boolean isKamin() {
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
    public Boolean isKlimatisiert() {
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
    public Boolean isGartennutzung() {
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
    public Boolean isRollstuhlgerecht() {
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
    public Boolean isKabelSatTv() {
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
    public Boolean isBarrierefrei() {
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
    public Boolean isSauna() {
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
    public Boolean isSwimmingpool() {
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
    public Boolean isWaschTrockenraum() {
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
    public Boolean isDvVerkabelung() {
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
    public Boolean isRampe() {
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
    public Boolean isHebebuehne() {
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
    public Boolean isKran() {
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
    public Boolean isGastterrasse() {
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
    public Double getStromanschlusswert() {
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
    public void setStromanschlusswert(Double value) {
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
    public Boolean isKantineCafeteria() {
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
    public Boolean isTeekueche() {
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
    public Double getHallenhoehe() {
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
    public void setHallenhoehe(Double value) {
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
    public Boolean isBrauereibindung() {
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
    public Boolean isSporteinrichtungen() {
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
    public Boolean isWellnessbereich() {
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
    public Boolean isTelefonFerienimmobilie() {
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
            Boolean theWgGeeignet;
            theWgGeeignet = this.isWgGeeignet();
            strategy.appendField(locator, this, "wgGeeignet", buffer, theWgGeeignet);
        }
        {
            Boolean theRaeumeVeraenderbar;
            theRaeumeVeraenderbar = this.isRaeumeVeraenderbar();
            strategy.appendField(locator, this, "raeumeVeraenderbar", buffer, theRaeumeVeraenderbar);
        }
        {
            Bad theBad;
            theBad = this.getBad();
            strategy.appendField(locator, this, "bad", buffer, theBad);
        }
        {
            Kueche theKueche;
            theKueche = this.getKueche();
            strategy.appendField(locator, this, "kueche", buffer, theKueche);
        }
        {
            Boden theBoden;
            theBoden = this.getBoden();
            strategy.appendField(locator, this, "boden", buffer, theBoden);
        }
        {
            Boolean theKamin;
            theKamin = this.isKamin();
            strategy.appendField(locator, this, "kamin", buffer, theKamin);
        }
        {
            Heizungsart theHeizungsart;
            theHeizungsart = this.getHeizungsart();
            strategy.appendField(locator, this, "heizungsart", buffer, theHeizungsart);
        }
        {
            Befeuerung theBefeuerung;
            theBefeuerung = this.getBefeuerung();
            strategy.appendField(locator, this, "befeuerung", buffer, theBefeuerung);
        }
        {
            Boolean theKlimatisiert;
            theKlimatisiert = this.isKlimatisiert();
            strategy.appendField(locator, this, "klimatisiert", buffer, theKlimatisiert);
        }
        {
            Fahrstuhl theFahrstuhl;
            theFahrstuhl = this.getFahrstuhl();
            strategy.appendField(locator, this, "fahrstuhl", buffer, theFahrstuhl);
        }
        {
            List<Stellplatzart> theStellplatzart;
            theStellplatzart = (((this.stellplatzart!= null)&&(!this.stellplatzart.isEmpty()))?this.getStellplatzart():null);
            strategy.appendField(locator, this, "stellplatzart", buffer, theStellplatzart);
        }
        {
            Boolean theGartennutzung;
            theGartennutzung = this.isGartennutzung();
            strategy.appendField(locator, this, "gartennutzung", buffer, theGartennutzung);
        }
        {
            AusrichtBalkonTerrasse theAusrichtBalkonTerrasse;
            theAusrichtBalkonTerrasse = this.getAusrichtBalkonTerrasse();
            strategy.appendField(locator, this, "ausrichtBalkonTerrasse", buffer, theAusrichtBalkonTerrasse);
        }
        {
            Moebliert theMoebliert;
            theMoebliert = this.getMoebliert();
            strategy.appendField(locator, this, "moebliert", buffer, theMoebliert);
        }
        {
            Boolean theRollstuhlgerecht;
            theRollstuhlgerecht = this.isRollstuhlgerecht();
            strategy.appendField(locator, this, "rollstuhlgerecht", buffer, theRollstuhlgerecht);
        }
        {
            Boolean theKabelSatTv;
            theKabelSatTv = this.isKabelSatTv();
            strategy.appendField(locator, this, "kabelSatTv", buffer, theKabelSatTv);
        }
        {
            Boolean theBarrierefrei;
            theBarrierefrei = this.isBarrierefrei();
            strategy.appendField(locator, this, "barrierefrei", buffer, theBarrierefrei);
        }
        {
            Boolean theSauna;
            theSauna = this.isSauna();
            strategy.appendField(locator, this, "sauna", buffer, theSauna);
        }
        {
            Boolean theSwimmingpool;
            theSwimmingpool = this.isSwimmingpool();
            strategy.appendField(locator, this, "swimmingpool", buffer, theSwimmingpool);
        }
        {
            Boolean theWaschTrockenraum;
            theWaschTrockenraum = this.isWaschTrockenraum();
            strategy.appendField(locator, this, "waschTrockenraum", buffer, theWaschTrockenraum);
        }
        {
            Boolean theDvVerkabelung;
            theDvVerkabelung = this.isDvVerkabelung();
            strategy.appendField(locator, this, "dvVerkabelung", buffer, theDvVerkabelung);
        }
        {
            Boolean theRampe;
            theRampe = this.isRampe();
            strategy.appendField(locator, this, "rampe", buffer, theRampe);
        }
        {
            Boolean theHebebuehne;
            theHebebuehne = this.isHebebuehne();
            strategy.appendField(locator, this, "hebebuehne", buffer, theHebebuehne);
        }
        {
            Boolean theKran;
            theKran = this.isKran();
            strategy.appendField(locator, this, "kran", buffer, theKran);
        }
        {
            Boolean theGastterrasse;
            theGastterrasse = this.isGastterrasse();
            strategy.appendField(locator, this, "gastterrasse", buffer, theGastterrasse);
        }
        {
            Double theStromanschlusswert;
            theStromanschlusswert = this.getStromanschlusswert();
            strategy.appendField(locator, this, "stromanschlusswert", buffer, theStromanschlusswert);
        }
        {
            Boolean theKantineCafeteria;
            theKantineCafeteria = this.isKantineCafeteria();
            strategy.appendField(locator, this, "kantineCafeteria", buffer, theKantineCafeteria);
        }
        {
            Boolean theTeekueche;
            theTeekueche = this.isTeekueche();
            strategy.appendField(locator, this, "teekueche", buffer, theTeekueche);
        }
        {
            Double theHallenhoehe;
            theHallenhoehe = this.getHallenhoehe();
            strategy.appendField(locator, this, "hallenhoehe", buffer, theHallenhoehe);
        }
        {
            AngeschlGastronomie theAngeschlGastronomie;
            theAngeschlGastronomie = this.getAngeschlGastronomie();
            strategy.appendField(locator, this, "angeschlGastronomie", buffer, theAngeschlGastronomie);
        }
        {
            Boolean theBrauereibindung;
            theBrauereibindung = this.isBrauereibindung();
            strategy.appendField(locator, this, "brauereibindung", buffer, theBrauereibindung);
        }
        {
            Boolean theSporteinrichtungen;
            theSporteinrichtungen = this.isSporteinrichtungen();
            strategy.appendField(locator, this, "sporteinrichtungen", buffer, theSporteinrichtungen);
        }
        {
            Boolean theWellnessbereich;
            theWellnessbereich = this.isWellnessbereich();
            strategy.appendField(locator, this, "wellnessbereich", buffer, theWellnessbereich);
        }
        {
            List<Serviceleistungen> theServiceleistungen;
            theServiceleistungen = (((this.serviceleistungen!= null)&&(!this.serviceleistungen.isEmpty()))?this.getServiceleistungen():null);
            strategy.appendField(locator, this, "serviceleistungen", buffer, theServiceleistungen);
        }
        {
            Boolean theTelefonFerienimmobilie;
            theTelefonFerienimmobilie = this.isTelefonFerienimmobilie();
            strategy.appendField(locator, this, "telefonFerienimmobilie", buffer, theTelefonFerienimmobilie);
        }
        {
            Sicherheitstechnik theSicherheitstechnik;
            theSicherheitstechnik = this.getSicherheitstechnik();
            strategy.appendField(locator, this, "sicherheitstechnik", buffer, theSicherheitstechnik);
        }
        {
            Unterkellert theUnterkellert;
            theUnterkellert = this.getUnterkellert();
            strategy.appendField(locator, this, "unterkellert", buffer, theUnterkellert);
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
        if (draftCopy instanceof Ausstattung) {
            final Ausstattung copy = ((Ausstattung) draftCopy);
            if (this.wgGeeignet!= null) {
                Boolean sourceWgGeeignet;
                sourceWgGeeignet = this.isWgGeeignet();
                Boolean copyWgGeeignet = ((Boolean) strategy.copy(LocatorUtils.property(locator, "wgGeeignet", sourceWgGeeignet), sourceWgGeeignet));
                copy.setWgGeeignet(copyWgGeeignet);
            } else {
                copy.wgGeeignet = null;
            }
            if (this.raeumeVeraenderbar!= null) {
                Boolean sourceRaeumeVeraenderbar;
                sourceRaeumeVeraenderbar = this.isRaeumeVeraenderbar();
                Boolean copyRaeumeVeraenderbar = ((Boolean) strategy.copy(LocatorUtils.property(locator, "raeumeVeraenderbar", sourceRaeumeVeraenderbar), sourceRaeumeVeraenderbar));
                copy.setRaeumeVeraenderbar(copyRaeumeVeraenderbar);
            } else {
                copy.raeumeVeraenderbar = null;
            }
            if (this.bad!= null) {
                Bad sourceBad;
                sourceBad = this.getBad();
                Bad copyBad = ((Bad) strategy.copy(LocatorUtils.property(locator, "bad", sourceBad), sourceBad));
                copy.setBad(copyBad);
            } else {
                copy.bad = null;
            }
            if (this.kueche!= null) {
                Kueche sourceKueche;
                sourceKueche = this.getKueche();
                Kueche copyKueche = ((Kueche) strategy.copy(LocatorUtils.property(locator, "kueche", sourceKueche), sourceKueche));
                copy.setKueche(copyKueche);
            } else {
                copy.kueche = null;
            }
            if (this.boden!= null) {
                Boden sourceBoden;
                sourceBoden = this.getBoden();
                Boden copyBoden = ((Boden) strategy.copy(LocatorUtils.property(locator, "boden", sourceBoden), sourceBoden));
                copy.setBoden(copyBoden);
            } else {
                copy.boden = null;
            }
            if (this.kamin!= null) {
                Boolean sourceKamin;
                sourceKamin = this.isKamin();
                Boolean copyKamin = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kamin", sourceKamin), sourceKamin));
                copy.setKamin(copyKamin);
            } else {
                copy.kamin = null;
            }
            if (this.heizungsart!= null) {
                Heizungsart sourceHeizungsart;
                sourceHeizungsart = this.getHeizungsart();
                Heizungsart copyHeizungsart = ((Heizungsart) strategy.copy(LocatorUtils.property(locator, "heizungsart", sourceHeizungsart), sourceHeizungsart));
                copy.setHeizungsart(copyHeizungsart);
            } else {
                copy.heizungsart = null;
            }
            if (this.befeuerung!= null) {
                Befeuerung sourceBefeuerung;
                sourceBefeuerung = this.getBefeuerung();
                Befeuerung copyBefeuerung = ((Befeuerung) strategy.copy(LocatorUtils.property(locator, "befeuerung", sourceBefeuerung), sourceBefeuerung));
                copy.setBefeuerung(copyBefeuerung);
            } else {
                copy.befeuerung = null;
            }
            if (this.klimatisiert!= null) {
                Boolean sourceKlimatisiert;
                sourceKlimatisiert = this.isKlimatisiert();
                Boolean copyKlimatisiert = ((Boolean) strategy.copy(LocatorUtils.property(locator, "klimatisiert", sourceKlimatisiert), sourceKlimatisiert));
                copy.setKlimatisiert(copyKlimatisiert);
            } else {
                copy.klimatisiert = null;
            }
            if (this.fahrstuhl!= null) {
                Fahrstuhl sourceFahrstuhl;
                sourceFahrstuhl = this.getFahrstuhl();
                Fahrstuhl copyFahrstuhl = ((Fahrstuhl) strategy.copy(LocatorUtils.property(locator, "fahrstuhl", sourceFahrstuhl), sourceFahrstuhl));
                copy.setFahrstuhl(copyFahrstuhl);
            } else {
                copy.fahrstuhl = null;
            }
            if ((this.stellplatzart!= null)&&(!this.stellplatzart.isEmpty())) {
                List<Stellplatzart> sourceStellplatzart;
                sourceStellplatzart = (((this.stellplatzart!= null)&&(!this.stellplatzart.isEmpty()))?this.getStellplatzart():null);
                @SuppressWarnings("unchecked")
                List<Stellplatzart> copyStellplatzart = ((List<Stellplatzart> ) strategy.copy(LocatorUtils.property(locator, "stellplatzart", sourceStellplatzart), sourceStellplatzart));
                copy.stellplatzart = null;
                if (copyStellplatzart!= null) {
                    List<Stellplatzart> uniqueStellplatzartl = copy.getStellplatzart();
                    uniqueStellplatzartl.addAll(copyStellplatzart);
                }
            } else {
                copy.stellplatzart = null;
            }
            if (this.gartennutzung!= null) {
                Boolean sourceGartennutzung;
                sourceGartennutzung = this.isGartennutzung();
                Boolean copyGartennutzung = ((Boolean) strategy.copy(LocatorUtils.property(locator, "gartennutzung", sourceGartennutzung), sourceGartennutzung));
                copy.setGartennutzung(copyGartennutzung);
            } else {
                copy.gartennutzung = null;
            }
            if (this.ausrichtBalkonTerrasse!= null) {
                AusrichtBalkonTerrasse sourceAusrichtBalkonTerrasse;
                sourceAusrichtBalkonTerrasse = this.getAusrichtBalkonTerrasse();
                AusrichtBalkonTerrasse copyAusrichtBalkonTerrasse = ((AusrichtBalkonTerrasse) strategy.copy(LocatorUtils.property(locator, "ausrichtBalkonTerrasse", sourceAusrichtBalkonTerrasse), sourceAusrichtBalkonTerrasse));
                copy.setAusrichtBalkonTerrasse(copyAusrichtBalkonTerrasse);
            } else {
                copy.ausrichtBalkonTerrasse = null;
            }
            if (this.moebliert!= null) {
                Moebliert sourceMoebliert;
                sourceMoebliert = this.getMoebliert();
                Moebliert copyMoebliert = ((Moebliert) strategy.copy(LocatorUtils.property(locator, "moebliert", sourceMoebliert), sourceMoebliert));
                copy.setMoebliert(copyMoebliert);
            } else {
                copy.moebliert = null;
            }
            if (this.rollstuhlgerecht!= null) {
                Boolean sourceRollstuhlgerecht;
                sourceRollstuhlgerecht = this.isRollstuhlgerecht();
                Boolean copyRollstuhlgerecht = ((Boolean) strategy.copy(LocatorUtils.property(locator, "rollstuhlgerecht", sourceRollstuhlgerecht), sourceRollstuhlgerecht));
                copy.setRollstuhlgerecht(copyRollstuhlgerecht);
            } else {
                copy.rollstuhlgerecht = null;
            }
            if (this.kabelSatTv!= null) {
                Boolean sourceKabelSatTv;
                sourceKabelSatTv = this.isKabelSatTv();
                Boolean copyKabelSatTv = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kabelSatTv", sourceKabelSatTv), sourceKabelSatTv));
                copy.setKabelSatTv(copyKabelSatTv);
            } else {
                copy.kabelSatTv = null;
            }
            if (this.barrierefrei!= null) {
                Boolean sourceBarrierefrei;
                sourceBarrierefrei = this.isBarrierefrei();
                Boolean copyBarrierefrei = ((Boolean) strategy.copy(LocatorUtils.property(locator, "barrierefrei", sourceBarrierefrei), sourceBarrierefrei));
                copy.setBarrierefrei(copyBarrierefrei);
            } else {
                copy.barrierefrei = null;
            }
            if (this.sauna!= null) {
                Boolean sourceSauna;
                sourceSauna = this.isSauna();
                Boolean copySauna = ((Boolean) strategy.copy(LocatorUtils.property(locator, "sauna", sourceSauna), sourceSauna));
                copy.setSauna(copySauna);
            } else {
                copy.sauna = null;
            }
            if (this.swimmingpool!= null) {
                Boolean sourceSwimmingpool;
                sourceSwimmingpool = this.isSwimmingpool();
                Boolean copySwimmingpool = ((Boolean) strategy.copy(LocatorUtils.property(locator, "swimmingpool", sourceSwimmingpool), sourceSwimmingpool));
                copy.setSwimmingpool(copySwimmingpool);
            } else {
                copy.swimmingpool = null;
            }
            if (this.waschTrockenraum!= null) {
                Boolean sourceWaschTrockenraum;
                sourceWaschTrockenraum = this.isWaschTrockenraum();
                Boolean copyWaschTrockenraum = ((Boolean) strategy.copy(LocatorUtils.property(locator, "waschTrockenraum", sourceWaschTrockenraum), sourceWaschTrockenraum));
                copy.setWaschTrockenraum(copyWaschTrockenraum);
            } else {
                copy.waschTrockenraum = null;
            }
            if (this.dvVerkabelung!= null) {
                Boolean sourceDvVerkabelung;
                sourceDvVerkabelung = this.isDvVerkabelung();
                Boolean copyDvVerkabelung = ((Boolean) strategy.copy(LocatorUtils.property(locator, "dvVerkabelung", sourceDvVerkabelung), sourceDvVerkabelung));
                copy.setDvVerkabelung(copyDvVerkabelung);
            } else {
                copy.dvVerkabelung = null;
            }
            if (this.rampe!= null) {
                Boolean sourceRampe;
                sourceRampe = this.isRampe();
                Boolean copyRampe = ((Boolean) strategy.copy(LocatorUtils.property(locator, "rampe", sourceRampe), sourceRampe));
                copy.setRampe(copyRampe);
            } else {
                copy.rampe = null;
            }
            if (this.hebebuehne!= null) {
                Boolean sourceHebebuehne;
                sourceHebebuehne = this.isHebebuehne();
                Boolean copyHebebuehne = ((Boolean) strategy.copy(LocatorUtils.property(locator, "hebebuehne", sourceHebebuehne), sourceHebebuehne));
                copy.setHebebuehne(copyHebebuehne);
            } else {
                copy.hebebuehne = null;
            }
            if (this.kran!= null) {
                Boolean sourceKran;
                sourceKran = this.isKran();
                Boolean copyKran = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kran", sourceKran), sourceKran));
                copy.setKran(copyKran);
            } else {
                copy.kran = null;
            }
            if (this.gastterrasse!= null) {
                Boolean sourceGastterrasse;
                sourceGastterrasse = this.isGastterrasse();
                Boolean copyGastterrasse = ((Boolean) strategy.copy(LocatorUtils.property(locator, "gastterrasse", sourceGastterrasse), sourceGastterrasse));
                copy.setGastterrasse(copyGastterrasse);
            } else {
                copy.gastterrasse = null;
            }
            if (this.stromanschlusswert!= null) {
                Double sourceStromanschlusswert;
                sourceStromanschlusswert = this.getStromanschlusswert();
                Double copyStromanschlusswert = ((Double) strategy.copy(LocatorUtils.property(locator, "stromanschlusswert", sourceStromanschlusswert), sourceStromanschlusswert));
                copy.setStromanschlusswert(copyStromanschlusswert);
            } else {
                copy.stromanschlusswert = null;
            }
            if (this.kantineCafeteria!= null) {
                Boolean sourceKantineCafeteria;
                sourceKantineCafeteria = this.isKantineCafeteria();
                Boolean copyKantineCafeteria = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kantineCafeteria", sourceKantineCafeteria), sourceKantineCafeteria));
                copy.setKantineCafeteria(copyKantineCafeteria);
            } else {
                copy.kantineCafeteria = null;
            }
            if (this.teekueche!= null) {
                Boolean sourceTeekueche;
                sourceTeekueche = this.isTeekueche();
                Boolean copyTeekueche = ((Boolean) strategy.copy(LocatorUtils.property(locator, "teekueche", sourceTeekueche), sourceTeekueche));
                copy.setTeekueche(copyTeekueche);
            } else {
                copy.teekueche = null;
            }
            if (this.hallenhoehe!= null) {
                Double sourceHallenhoehe;
                sourceHallenhoehe = this.getHallenhoehe();
                Double copyHallenhoehe = ((Double) strategy.copy(LocatorUtils.property(locator, "hallenhoehe", sourceHallenhoehe), sourceHallenhoehe));
                copy.setHallenhoehe(copyHallenhoehe);
            } else {
                copy.hallenhoehe = null;
            }
            if (this.angeschlGastronomie!= null) {
                AngeschlGastronomie sourceAngeschlGastronomie;
                sourceAngeschlGastronomie = this.getAngeschlGastronomie();
                AngeschlGastronomie copyAngeschlGastronomie = ((AngeschlGastronomie) strategy.copy(LocatorUtils.property(locator, "angeschlGastronomie", sourceAngeschlGastronomie), sourceAngeschlGastronomie));
                copy.setAngeschlGastronomie(copyAngeschlGastronomie);
            } else {
                copy.angeschlGastronomie = null;
            }
            if (this.brauereibindung!= null) {
                Boolean sourceBrauereibindung;
                sourceBrauereibindung = this.isBrauereibindung();
                Boolean copyBrauereibindung = ((Boolean) strategy.copy(LocatorUtils.property(locator, "brauereibindung", sourceBrauereibindung), sourceBrauereibindung));
                copy.setBrauereibindung(copyBrauereibindung);
            } else {
                copy.brauereibindung = null;
            }
            if (this.sporteinrichtungen!= null) {
                Boolean sourceSporteinrichtungen;
                sourceSporteinrichtungen = this.isSporteinrichtungen();
                Boolean copySporteinrichtungen = ((Boolean) strategy.copy(LocatorUtils.property(locator, "sporteinrichtungen", sourceSporteinrichtungen), sourceSporteinrichtungen));
                copy.setSporteinrichtungen(copySporteinrichtungen);
            } else {
                copy.sporteinrichtungen = null;
            }
            if (this.wellnessbereich!= null) {
                Boolean sourceWellnessbereich;
                sourceWellnessbereich = this.isWellnessbereich();
                Boolean copyWellnessbereich = ((Boolean) strategy.copy(LocatorUtils.property(locator, "wellnessbereich", sourceWellnessbereich), sourceWellnessbereich));
                copy.setWellnessbereich(copyWellnessbereich);
            } else {
                copy.wellnessbereich = null;
            }
            if ((this.serviceleistungen!= null)&&(!this.serviceleistungen.isEmpty())) {
                List<Serviceleistungen> sourceServiceleistungen;
                sourceServiceleistungen = (((this.serviceleistungen!= null)&&(!this.serviceleistungen.isEmpty()))?this.getServiceleistungen():null);
                @SuppressWarnings("unchecked")
                List<Serviceleistungen> copyServiceleistungen = ((List<Serviceleistungen> ) strategy.copy(LocatorUtils.property(locator, "serviceleistungen", sourceServiceleistungen), sourceServiceleistungen));
                copy.serviceleistungen = null;
                if (copyServiceleistungen!= null) {
                    List<Serviceleistungen> uniqueServiceleistungenl = copy.getServiceleistungen();
                    uniqueServiceleistungenl.addAll(copyServiceleistungen);
                }
            } else {
                copy.serviceleistungen = null;
            }
            if (this.telefonFerienimmobilie!= null) {
                Boolean sourceTelefonFerienimmobilie;
                sourceTelefonFerienimmobilie = this.isTelefonFerienimmobilie();
                Boolean copyTelefonFerienimmobilie = ((Boolean) strategy.copy(LocatorUtils.property(locator, "telefonFerienimmobilie", sourceTelefonFerienimmobilie), sourceTelefonFerienimmobilie));
                copy.setTelefonFerienimmobilie(copyTelefonFerienimmobilie);
            } else {
                copy.telefonFerienimmobilie = null;
            }
            if (this.sicherheitstechnik!= null) {
                Sicherheitstechnik sourceSicherheitstechnik;
                sourceSicherheitstechnik = this.getSicherheitstechnik();
                Sicherheitstechnik copySicherheitstechnik = ((Sicherheitstechnik) strategy.copy(LocatorUtils.property(locator, "sicherheitstechnik", sourceSicherheitstechnik), sourceSicherheitstechnik));
                copy.setSicherheitstechnik(copySicherheitstechnik);
            } else {
                copy.sicherheitstechnik = null;
            }
            if (this.unterkellert!= null) {
                Unterkellert sourceUnterkellert;
                sourceUnterkellert = this.getUnterkellert();
                Unterkellert copyUnterkellert = ((Unterkellert) strategy.copy(LocatorUtils.property(locator, "unterkellert", sourceUnterkellert), sourceUnterkellert));
                copy.setUnterkellert(copyUnterkellert);
            } else {
                copy.unterkellert = null;
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
        return new Ausstattung();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Ausstattung)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Ausstattung that = ((Ausstattung) object);
        {
            Boolean lhsWgGeeignet;
            lhsWgGeeignet = this.isWgGeeignet();
            Boolean rhsWgGeeignet;
            rhsWgGeeignet = that.isWgGeeignet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wgGeeignet", lhsWgGeeignet), LocatorUtils.property(thatLocator, "wgGeeignet", rhsWgGeeignet), lhsWgGeeignet, rhsWgGeeignet)) {
                return false;
            }
        }
        {
            Boolean lhsRaeumeVeraenderbar;
            lhsRaeumeVeraenderbar = this.isRaeumeVeraenderbar();
            Boolean rhsRaeumeVeraenderbar;
            rhsRaeumeVeraenderbar = that.isRaeumeVeraenderbar();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "raeumeVeraenderbar", lhsRaeumeVeraenderbar), LocatorUtils.property(thatLocator, "raeumeVeraenderbar", rhsRaeumeVeraenderbar), lhsRaeumeVeraenderbar, rhsRaeumeVeraenderbar)) {
                return false;
            }
        }
        {
            Bad lhsBad;
            lhsBad = this.getBad();
            Bad rhsBad;
            rhsBad = that.getBad();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bad", lhsBad), LocatorUtils.property(thatLocator, "bad", rhsBad), lhsBad, rhsBad)) {
                return false;
            }
        }
        {
            Kueche lhsKueche;
            lhsKueche = this.getKueche();
            Kueche rhsKueche;
            rhsKueche = that.getKueche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kueche", lhsKueche), LocatorUtils.property(thatLocator, "kueche", rhsKueche), lhsKueche, rhsKueche)) {
                return false;
            }
        }
        {
            Boden lhsBoden;
            lhsBoden = this.getBoden();
            Boden rhsBoden;
            rhsBoden = that.getBoden();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "boden", lhsBoden), LocatorUtils.property(thatLocator, "boden", rhsBoden), lhsBoden, rhsBoden)) {
                return false;
            }
        }
        {
            Boolean lhsKamin;
            lhsKamin = this.isKamin();
            Boolean rhsKamin;
            rhsKamin = that.isKamin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kamin", lhsKamin), LocatorUtils.property(thatLocator, "kamin", rhsKamin), lhsKamin, rhsKamin)) {
                return false;
            }
        }
        {
            Heizungsart lhsHeizungsart;
            lhsHeizungsart = this.getHeizungsart();
            Heizungsart rhsHeizungsart;
            rhsHeizungsart = that.getHeizungsart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heizungsart", lhsHeizungsart), LocatorUtils.property(thatLocator, "heizungsart", rhsHeizungsart), lhsHeizungsart, rhsHeizungsart)) {
                return false;
            }
        }
        {
            Befeuerung lhsBefeuerung;
            lhsBefeuerung = this.getBefeuerung();
            Befeuerung rhsBefeuerung;
            rhsBefeuerung = that.getBefeuerung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "befeuerung", lhsBefeuerung), LocatorUtils.property(thatLocator, "befeuerung", rhsBefeuerung), lhsBefeuerung, rhsBefeuerung)) {
                return false;
            }
        }
        {
            Boolean lhsKlimatisiert;
            lhsKlimatisiert = this.isKlimatisiert();
            Boolean rhsKlimatisiert;
            rhsKlimatisiert = that.isKlimatisiert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "klimatisiert", lhsKlimatisiert), LocatorUtils.property(thatLocator, "klimatisiert", rhsKlimatisiert), lhsKlimatisiert, rhsKlimatisiert)) {
                return false;
            }
        }
        {
            Fahrstuhl lhsFahrstuhl;
            lhsFahrstuhl = this.getFahrstuhl();
            Fahrstuhl rhsFahrstuhl;
            rhsFahrstuhl = that.getFahrstuhl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fahrstuhl", lhsFahrstuhl), LocatorUtils.property(thatLocator, "fahrstuhl", rhsFahrstuhl), lhsFahrstuhl, rhsFahrstuhl)) {
                return false;
            }
        }
        {
            List<Stellplatzart> lhsStellplatzart;
            lhsStellplatzart = (((this.stellplatzart!= null)&&(!this.stellplatzart.isEmpty()))?this.getStellplatzart():null);
            List<Stellplatzart> rhsStellplatzart;
            rhsStellplatzart = (((that.stellplatzart!= null)&&(!that.stellplatzart.isEmpty()))?that.getStellplatzart():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stellplatzart", lhsStellplatzart), LocatorUtils.property(thatLocator, "stellplatzart", rhsStellplatzart), lhsStellplatzart, rhsStellplatzart)) {
                return false;
            }
        }
        {
            Boolean lhsGartennutzung;
            lhsGartennutzung = this.isGartennutzung();
            Boolean rhsGartennutzung;
            rhsGartennutzung = that.isGartennutzung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gartennutzung", lhsGartennutzung), LocatorUtils.property(thatLocator, "gartennutzung", rhsGartennutzung), lhsGartennutzung, rhsGartennutzung)) {
                return false;
            }
        }
        {
            AusrichtBalkonTerrasse lhsAusrichtBalkonTerrasse;
            lhsAusrichtBalkonTerrasse = this.getAusrichtBalkonTerrasse();
            AusrichtBalkonTerrasse rhsAusrichtBalkonTerrasse;
            rhsAusrichtBalkonTerrasse = that.getAusrichtBalkonTerrasse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ausrichtBalkonTerrasse", lhsAusrichtBalkonTerrasse), LocatorUtils.property(thatLocator, "ausrichtBalkonTerrasse", rhsAusrichtBalkonTerrasse), lhsAusrichtBalkonTerrasse, rhsAusrichtBalkonTerrasse)) {
                return false;
            }
        }
        {
            Moebliert lhsMoebliert;
            lhsMoebliert = this.getMoebliert();
            Moebliert rhsMoebliert;
            rhsMoebliert = that.getMoebliert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "moebliert", lhsMoebliert), LocatorUtils.property(thatLocator, "moebliert", rhsMoebliert), lhsMoebliert, rhsMoebliert)) {
                return false;
            }
        }
        {
            Boolean lhsRollstuhlgerecht;
            lhsRollstuhlgerecht = this.isRollstuhlgerecht();
            Boolean rhsRollstuhlgerecht;
            rhsRollstuhlgerecht = that.isRollstuhlgerecht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rollstuhlgerecht", lhsRollstuhlgerecht), LocatorUtils.property(thatLocator, "rollstuhlgerecht", rhsRollstuhlgerecht), lhsRollstuhlgerecht, rhsRollstuhlgerecht)) {
                return false;
            }
        }
        {
            Boolean lhsKabelSatTv;
            lhsKabelSatTv = this.isKabelSatTv();
            Boolean rhsKabelSatTv;
            rhsKabelSatTv = that.isKabelSatTv();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kabelSatTv", lhsKabelSatTv), LocatorUtils.property(thatLocator, "kabelSatTv", rhsKabelSatTv), lhsKabelSatTv, rhsKabelSatTv)) {
                return false;
            }
        }
        {
            Boolean lhsBarrierefrei;
            lhsBarrierefrei = this.isBarrierefrei();
            Boolean rhsBarrierefrei;
            rhsBarrierefrei = that.isBarrierefrei();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "barrierefrei", lhsBarrierefrei), LocatorUtils.property(thatLocator, "barrierefrei", rhsBarrierefrei), lhsBarrierefrei, rhsBarrierefrei)) {
                return false;
            }
        }
        {
            Boolean lhsSauna;
            lhsSauna = this.isSauna();
            Boolean rhsSauna;
            rhsSauna = that.isSauna();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sauna", lhsSauna), LocatorUtils.property(thatLocator, "sauna", rhsSauna), lhsSauna, rhsSauna)) {
                return false;
            }
        }
        {
            Boolean lhsSwimmingpool;
            lhsSwimmingpool = this.isSwimmingpool();
            Boolean rhsSwimmingpool;
            rhsSwimmingpool = that.isSwimmingpool();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "swimmingpool", lhsSwimmingpool), LocatorUtils.property(thatLocator, "swimmingpool", rhsSwimmingpool), lhsSwimmingpool, rhsSwimmingpool)) {
                return false;
            }
        }
        {
            Boolean lhsWaschTrockenraum;
            lhsWaschTrockenraum = this.isWaschTrockenraum();
            Boolean rhsWaschTrockenraum;
            rhsWaschTrockenraum = that.isWaschTrockenraum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waschTrockenraum", lhsWaschTrockenraum), LocatorUtils.property(thatLocator, "waschTrockenraum", rhsWaschTrockenraum), lhsWaschTrockenraum, rhsWaschTrockenraum)) {
                return false;
            }
        }
        {
            Boolean lhsDvVerkabelung;
            lhsDvVerkabelung = this.isDvVerkabelung();
            Boolean rhsDvVerkabelung;
            rhsDvVerkabelung = that.isDvVerkabelung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dvVerkabelung", lhsDvVerkabelung), LocatorUtils.property(thatLocator, "dvVerkabelung", rhsDvVerkabelung), lhsDvVerkabelung, rhsDvVerkabelung)) {
                return false;
            }
        }
        {
            Boolean lhsRampe;
            lhsRampe = this.isRampe();
            Boolean rhsRampe;
            rhsRampe = that.isRampe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rampe", lhsRampe), LocatorUtils.property(thatLocator, "rampe", rhsRampe), lhsRampe, rhsRampe)) {
                return false;
            }
        }
        {
            Boolean lhsHebebuehne;
            lhsHebebuehne = this.isHebebuehne();
            Boolean rhsHebebuehne;
            rhsHebebuehne = that.isHebebuehne();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hebebuehne", lhsHebebuehne), LocatorUtils.property(thatLocator, "hebebuehne", rhsHebebuehne), lhsHebebuehne, rhsHebebuehne)) {
                return false;
            }
        }
        {
            Boolean lhsKran;
            lhsKran = this.isKran();
            Boolean rhsKran;
            rhsKran = that.isKran();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kran", lhsKran), LocatorUtils.property(thatLocator, "kran", rhsKran), lhsKran, rhsKran)) {
                return false;
            }
        }
        {
            Boolean lhsGastterrasse;
            lhsGastterrasse = this.isGastterrasse();
            Boolean rhsGastterrasse;
            rhsGastterrasse = that.isGastterrasse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gastterrasse", lhsGastterrasse), LocatorUtils.property(thatLocator, "gastterrasse", rhsGastterrasse), lhsGastterrasse, rhsGastterrasse)) {
                return false;
            }
        }
        {
            Double lhsStromanschlusswert;
            lhsStromanschlusswert = this.getStromanschlusswert();
            Double rhsStromanschlusswert;
            rhsStromanschlusswert = that.getStromanschlusswert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stromanschlusswert", lhsStromanschlusswert), LocatorUtils.property(thatLocator, "stromanschlusswert", rhsStromanschlusswert), lhsStromanschlusswert, rhsStromanschlusswert)) {
                return false;
            }
        }
        {
            Boolean lhsKantineCafeteria;
            lhsKantineCafeteria = this.isKantineCafeteria();
            Boolean rhsKantineCafeteria;
            rhsKantineCafeteria = that.isKantineCafeteria();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kantineCafeteria", lhsKantineCafeteria), LocatorUtils.property(thatLocator, "kantineCafeteria", rhsKantineCafeteria), lhsKantineCafeteria, rhsKantineCafeteria)) {
                return false;
            }
        }
        {
            Boolean lhsTeekueche;
            lhsTeekueche = this.isTeekueche();
            Boolean rhsTeekueche;
            rhsTeekueche = that.isTeekueche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "teekueche", lhsTeekueche), LocatorUtils.property(thatLocator, "teekueche", rhsTeekueche), lhsTeekueche, rhsTeekueche)) {
                return false;
            }
        }
        {
            Double lhsHallenhoehe;
            lhsHallenhoehe = this.getHallenhoehe();
            Double rhsHallenhoehe;
            rhsHallenhoehe = that.getHallenhoehe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hallenhoehe", lhsHallenhoehe), LocatorUtils.property(thatLocator, "hallenhoehe", rhsHallenhoehe), lhsHallenhoehe, rhsHallenhoehe)) {
                return false;
            }
        }
        {
            AngeschlGastronomie lhsAngeschlGastronomie;
            lhsAngeschlGastronomie = this.getAngeschlGastronomie();
            AngeschlGastronomie rhsAngeschlGastronomie;
            rhsAngeschlGastronomie = that.getAngeschlGastronomie();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "angeschlGastronomie", lhsAngeschlGastronomie), LocatorUtils.property(thatLocator, "angeschlGastronomie", rhsAngeschlGastronomie), lhsAngeschlGastronomie, rhsAngeschlGastronomie)) {
                return false;
            }
        }
        {
            Boolean lhsBrauereibindung;
            lhsBrauereibindung = this.isBrauereibindung();
            Boolean rhsBrauereibindung;
            rhsBrauereibindung = that.isBrauereibindung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "brauereibindung", lhsBrauereibindung), LocatorUtils.property(thatLocator, "brauereibindung", rhsBrauereibindung), lhsBrauereibindung, rhsBrauereibindung)) {
                return false;
            }
        }
        {
            Boolean lhsSporteinrichtungen;
            lhsSporteinrichtungen = this.isSporteinrichtungen();
            Boolean rhsSporteinrichtungen;
            rhsSporteinrichtungen = that.isSporteinrichtungen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sporteinrichtungen", lhsSporteinrichtungen), LocatorUtils.property(thatLocator, "sporteinrichtungen", rhsSporteinrichtungen), lhsSporteinrichtungen, rhsSporteinrichtungen)) {
                return false;
            }
        }
        {
            Boolean lhsWellnessbereich;
            lhsWellnessbereich = this.isWellnessbereich();
            Boolean rhsWellnessbereich;
            rhsWellnessbereich = that.isWellnessbereich();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wellnessbereich", lhsWellnessbereich), LocatorUtils.property(thatLocator, "wellnessbereich", rhsWellnessbereich), lhsWellnessbereich, rhsWellnessbereich)) {
                return false;
            }
        }
        {
            List<Serviceleistungen> lhsServiceleistungen;
            lhsServiceleistungen = (((this.serviceleistungen!= null)&&(!this.serviceleistungen.isEmpty()))?this.getServiceleistungen():null);
            List<Serviceleistungen> rhsServiceleistungen;
            rhsServiceleistungen = (((that.serviceleistungen!= null)&&(!that.serviceleistungen.isEmpty()))?that.getServiceleistungen():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceleistungen", lhsServiceleistungen), LocatorUtils.property(thatLocator, "serviceleistungen", rhsServiceleistungen), lhsServiceleistungen, rhsServiceleistungen)) {
                return false;
            }
        }
        {
            Boolean lhsTelefonFerienimmobilie;
            lhsTelefonFerienimmobilie = this.isTelefonFerienimmobilie();
            Boolean rhsTelefonFerienimmobilie;
            rhsTelefonFerienimmobilie = that.isTelefonFerienimmobilie();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telefonFerienimmobilie", lhsTelefonFerienimmobilie), LocatorUtils.property(thatLocator, "telefonFerienimmobilie", rhsTelefonFerienimmobilie), lhsTelefonFerienimmobilie, rhsTelefonFerienimmobilie)) {
                return false;
            }
        }
        {
            Sicherheitstechnik lhsSicherheitstechnik;
            lhsSicherheitstechnik = this.getSicherheitstechnik();
            Sicherheitstechnik rhsSicherheitstechnik;
            rhsSicherheitstechnik = that.getSicherheitstechnik();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sicherheitstechnik", lhsSicherheitstechnik), LocatorUtils.property(thatLocator, "sicherheitstechnik", rhsSicherheitstechnik), lhsSicherheitstechnik, rhsSicherheitstechnik)) {
                return false;
            }
        }
        {
            Unterkellert lhsUnterkellert;
            lhsUnterkellert = this.getUnterkellert();
            Unterkellert rhsUnterkellert;
            rhsUnterkellert = that.getUnterkellert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unterkellert", lhsUnterkellert), LocatorUtils.property(thatLocator, "unterkellert", rhsUnterkellert), lhsUnterkellert, rhsUnterkellert)) {
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
