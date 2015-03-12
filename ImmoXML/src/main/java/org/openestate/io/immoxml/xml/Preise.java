
package org.openestate.io.immoxml.xml;

import java.util.ArrayList;
import java.util.Calendar;
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
 * Java class for &lt;preise&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "kaufpreis",
    "nettokaltmiete",
    "kaltmiete",
    "warmmiete",
    "nebenkosten",
    "heizkosten",
    "zzgMehrwertsteuer",
    "mietzuschlaege",
    "pacht",
    "erbpacht",
    "hausgeld",
    "abstand",
    "preisZeitraumVon",
    "preisZeitraumBis",
    "preisZeiteinheit",
    "mietpreisProQm",
    "kaufpreisProQm",
    "innenCourtage",
    "aussenCourtage",
    "waehrung",
    "mwstSatz",
    "freitextPreis",
    "xFache",
    "nettorendite",
    "mieteinnahmenIst",
    "mieteinnahmenSoll",
    "erschliessungskosten",
    "kaution",
    "geschaeftsguthaben",
    "stpCarport",
    "stpDuplex",
    "stpFreiplatz",
    "stpGarage",
    "stpParkhaus",
    "stpTiefgarage",
    "stpSonstige",
    "userDefinedSimplefield",
    "userDefinedAnyfield"
})
@XmlRootElement(name = "preise")
public class Preise
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double kaufpreis;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double nettokaltmiete;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double kaltmiete;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double warmmiete;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double nebenkosten;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double heizkosten;
    @XmlElement(name = "zzg_mehrwertsteuer")
    protected Boolean zzgMehrwertsteuer;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double mietzuschlaege;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double pacht;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double erbpacht;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double hausgeld;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double abstand;
    @XmlElement(name = "preis_zeitraum_von", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar preisZeitraumVon;
    @XmlElement(name = "preis_zeitraum_bis", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar preisZeitraumBis;
    @XmlElement(name = "preis_zeiteinheit")
    protected PreisZeiteinheit preisZeiteinheit;
    @XmlElement(name = "mietpreis_pro_qm", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double mietpreisProQm;
    @XmlElement(name = "kaufpreis_pro_qm", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double kaufpreisProQm;
    @XmlElement(name = "innen_courtage")
    protected InnenCourtage innenCourtage;
    @XmlElement(name = "aussen_courtage")
    protected AussenCourtage aussenCourtage;
    protected Waehrung waehrung;
    @XmlElement(name = "mwst_satz", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double mwstSatz;
    @XmlElement(name = "freitext_preis")
    protected String freitextPreis;
    @XmlElement(name = "x_fache")
    protected String xFache;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double nettorendite;
    @XmlElement(name = "mieteinnahmen_ist", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double mieteinnahmenIst;
    @XmlElement(name = "mieteinnahmen_soll", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double mieteinnahmenSoll;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double erschliessungskosten;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double kaution;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double geschaeftsguthaben;
    @XmlElement(name = "stp_carport")
    protected Stellplatz stpCarport;
    @XmlElement(name = "stp_duplex")
    protected Stellplatz stpDuplex;
    @XmlElement(name = "stp_freiplatz")
    protected Stellplatz stpFreiplatz;
    @XmlElement(name = "stp_garage")
    protected Stellplatz stpGarage;
    @XmlElement(name = "stp_parkhaus")
    protected Stellplatz stpParkhaus;
    @XmlElement(name = "stp_tiefgarage")
    protected Stellplatz stpTiefgarage;
    @XmlElement(name = "stp_sonstige")
    protected List<StpSonstige> stpSonstige;
    @XmlElement(name = "user_defined_simplefield")
    protected List<UserDefinedSimplefield> userDefinedSimplefield;
    @XmlElement(name = "user_defined_anyfield")
    protected List<UserDefinedAnyfield> userDefinedAnyfield;

    /**
     * Gets the value of the kaufpreis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getKaufpreis() {
        return kaufpreis;
    }

    /**
     * Sets the value of the kaufpreis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKaufpreis(Double value) {
        this.kaufpreis = value;
    }

    /**
     * Gets the value of the nettokaltmiete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getNettokaltmiete() {
        return nettokaltmiete;
    }

    /**
     * Sets the value of the nettokaltmiete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNettokaltmiete(Double value) {
        this.nettokaltmiete = value;
    }

    /**
     * Gets the value of the kaltmiete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getKaltmiete() {
        return kaltmiete;
    }

    /**
     * Sets the value of the kaltmiete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKaltmiete(Double value) {
        this.kaltmiete = value;
    }

    /**
     * Gets the value of the warmmiete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getWarmmiete() {
        return warmmiete;
    }

    /**
     * Sets the value of the warmmiete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarmmiete(Double value) {
        this.warmmiete = value;
    }

    /**
     * Gets the value of the nebenkosten property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getNebenkosten() {
        return nebenkosten;
    }

    /**
     * Sets the value of the nebenkosten property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNebenkosten(Double value) {
        this.nebenkosten = value;
    }

    /**
     * Gets the value of the heizkosten property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getHeizkosten() {
        return heizkosten;
    }

    /**
     * Sets the value of the heizkosten property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeizkosten(Double value) {
        this.heizkosten = value;
    }

    /**
     * Gets the value of the zzgMehrwertsteuer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZzgMehrwertsteuer() {
        return zzgMehrwertsteuer;
    }

    /**
     * Sets the value of the zzgMehrwertsteuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZzgMehrwertsteuer(Boolean value) {
        this.zzgMehrwertsteuer = value;
    }

    /**
     * Gets the value of the mietzuschlaege property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getMietzuschlaege() {
        return mietzuschlaege;
    }

    /**
     * Sets the value of the mietzuschlaege property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMietzuschlaege(Double value) {
        this.mietzuschlaege = value;
    }

    /**
     * Gets the value of the pacht property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getPacht() {
        return pacht;
    }

    /**
     * Sets the value of the pacht property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacht(Double value) {
        this.pacht = value;
    }

    /**
     * Gets the value of the erbpacht property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getErbpacht() {
        return erbpacht;
    }

    /**
     * Sets the value of the erbpacht property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErbpacht(Double value) {
        this.erbpacht = value;
    }

    /**
     * Gets the value of the hausgeld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getHausgeld() {
        return hausgeld;
    }

    /**
     * Sets the value of the hausgeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHausgeld(Double value) {
        this.hausgeld = value;
    }

    /**
     * Gets the value of the abstand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getAbstand() {
        return abstand;
    }

    /**
     * Sets the value of the abstand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbstand(Double value) {
        this.abstand = value;
    }

    /**
     * Gets the value of the preisZeitraumVon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getPreisZeitraumVon() {
        return preisZeitraumVon;
    }

    /**
     * Sets the value of the preisZeitraumVon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreisZeitraumVon(Calendar value) {
        this.preisZeitraumVon = value;
    }

    /**
     * Gets the value of the preisZeitraumBis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getPreisZeitraumBis() {
        return preisZeitraumBis;
    }

    /**
     * Sets the value of the preisZeitraumBis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreisZeitraumBis(Calendar value) {
        this.preisZeitraumBis = value;
    }

    /**
     * Gets the value of the preisZeiteinheit property.
     * 
     * @return
     *     possible object is
     *     {@link PreisZeiteinheit }
     *     
     */
    public PreisZeiteinheit getPreisZeiteinheit() {
        return preisZeiteinheit;
    }

    /**
     * Sets the value of the preisZeiteinheit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreisZeiteinheit }
     *     
     */
    public void setPreisZeiteinheit(PreisZeiteinheit value) {
        this.preisZeiteinheit = value;
    }

    /**
     * Gets the value of the mietpreisProQm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getMietpreisProQm() {
        return mietpreisProQm;
    }

    /**
     * Sets the value of the mietpreisProQm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMietpreisProQm(Double value) {
        this.mietpreisProQm = value;
    }

    /**
     * Gets the value of the kaufpreisProQm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getKaufpreisProQm() {
        return kaufpreisProQm;
    }

    /**
     * Sets the value of the kaufpreisProQm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKaufpreisProQm(Double value) {
        this.kaufpreisProQm = value;
    }

    /**
     * Gets the value of the innenCourtage property.
     * 
     * @return
     *     possible object is
     *     {@link InnenCourtage }
     *     
     */
    public InnenCourtage getInnenCourtage() {
        return innenCourtage;
    }

    /**
     * Sets the value of the innenCourtage property.
     * 
     * @param value
     *     allowed object is
     *     {@link InnenCourtage }
     *     
     */
    public void setInnenCourtage(InnenCourtage value) {
        this.innenCourtage = value;
    }

    /**
     * Gets the value of the aussenCourtage property.
     * 
     * @return
     *     possible object is
     *     {@link AussenCourtage }
     *     
     */
    public AussenCourtage getAussenCourtage() {
        return aussenCourtage;
    }

    /**
     * Sets the value of the aussenCourtage property.
     * 
     * @param value
     *     allowed object is
     *     {@link AussenCourtage }
     *     
     */
    public void setAussenCourtage(AussenCourtage value) {
        this.aussenCourtage = value;
    }

    /**
     * Gets the value of the waehrung property.
     * 
     * @return
     *     possible object is
     *     {@link Waehrung }
     *     
     */
    public Waehrung getWaehrung() {
        return waehrung;
    }

    /**
     * Sets the value of the waehrung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Waehrung }
     *     
     */
    public void setWaehrung(Waehrung value) {
        this.waehrung = value;
    }

    /**
     * Gets the value of the mwstSatz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getMwstSatz() {
        return mwstSatz;
    }

    /**
     * Sets the value of the mwstSatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMwstSatz(Double value) {
        this.mwstSatz = value;
    }

    /**
     * Gets the value of the freitextPreis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreitextPreis() {
        return freitextPreis;
    }

    /**
     * Sets the value of the freitextPreis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreitextPreis(String value) {
        this.freitextPreis = value;
    }

    /**
     * Gets the value of the xFache property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFache() {
        return xFache;
    }

    /**
     * Sets the value of the xFache property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFache(String value) {
        this.xFache = value;
    }

    /**
     * Gets the value of the nettorendite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getNettorendite() {
        return nettorendite;
    }

    /**
     * Sets the value of the nettorendite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNettorendite(Double value) {
        this.nettorendite = value;
    }

    /**
     * Gets the value of the mieteinnahmenIst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getMieteinnahmenIst() {
        return mieteinnahmenIst;
    }

    /**
     * Sets the value of the mieteinnahmenIst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMieteinnahmenIst(Double value) {
        this.mieteinnahmenIst = value;
    }

    /**
     * Gets the value of the mieteinnahmenSoll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getMieteinnahmenSoll() {
        return mieteinnahmenSoll;
    }

    /**
     * Sets the value of the mieteinnahmenSoll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMieteinnahmenSoll(Double value) {
        this.mieteinnahmenSoll = value;
    }

    /**
     * Gets the value of the erschliessungskosten property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getErschliessungskosten() {
        return erschliessungskosten;
    }

    /**
     * Sets the value of the erschliessungskosten property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErschliessungskosten(Double value) {
        this.erschliessungskosten = value;
    }

    /**
     * Gets the value of the kaution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getKaution() {
        return kaution;
    }

    /**
     * Sets the value of the kaution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKaution(Double value) {
        this.kaution = value;
    }

    /**
     * Gets the value of the geschaeftsguthaben property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getGeschaeftsguthaben() {
        return geschaeftsguthaben;
    }

    /**
     * Sets the value of the geschaeftsguthaben property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeschaeftsguthaben(Double value) {
        this.geschaeftsguthaben = value;
    }

    /**
     * Gets the value of the stpCarport property.
     * 
     * @return
     *     possible object is
     *     {@link Stellplatz }
     *     
     */
    public Stellplatz getStpCarport() {
        return stpCarport;
    }

    /**
     * Sets the value of the stpCarport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stellplatz }
     *     
     */
    public void setStpCarport(Stellplatz value) {
        this.stpCarport = value;
    }

    /**
     * Gets the value of the stpDuplex property.
     * 
     * @return
     *     possible object is
     *     {@link Stellplatz }
     *     
     */
    public Stellplatz getStpDuplex() {
        return stpDuplex;
    }

    /**
     * Sets the value of the stpDuplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stellplatz }
     *     
     */
    public void setStpDuplex(Stellplatz value) {
        this.stpDuplex = value;
    }

    /**
     * Gets the value of the stpFreiplatz property.
     * 
     * @return
     *     possible object is
     *     {@link Stellplatz }
     *     
     */
    public Stellplatz getStpFreiplatz() {
        return stpFreiplatz;
    }

    /**
     * Sets the value of the stpFreiplatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stellplatz }
     *     
     */
    public void setStpFreiplatz(Stellplatz value) {
        this.stpFreiplatz = value;
    }

    /**
     * Gets the value of the stpGarage property.
     * 
     * @return
     *     possible object is
     *     {@link Stellplatz }
     *     
     */
    public Stellplatz getStpGarage() {
        return stpGarage;
    }

    /**
     * Sets the value of the stpGarage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stellplatz }
     *     
     */
    public void setStpGarage(Stellplatz value) {
        this.stpGarage = value;
    }

    /**
     * Gets the value of the stpParkhaus property.
     * 
     * @return
     *     possible object is
     *     {@link Stellplatz }
     *     
     */
    public Stellplatz getStpParkhaus() {
        return stpParkhaus;
    }

    /**
     * Sets the value of the stpParkhaus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stellplatz }
     *     
     */
    public void setStpParkhaus(Stellplatz value) {
        this.stpParkhaus = value;
    }

    /**
     * Gets the value of the stpTiefgarage property.
     * 
     * @return
     *     possible object is
     *     {@link Stellplatz }
     *     
     */
    public Stellplatz getStpTiefgarage() {
        return stpTiefgarage;
    }

    /**
     * Sets the value of the stpTiefgarage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stellplatz }
     *     
     */
    public void setStpTiefgarage(Stellplatz value) {
        this.stpTiefgarage = value;
    }

    /**
     * Gets the value of the stpSonstige property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stpSonstige property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStpSonstige().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StpSonstige }
     * 
     * 
     */
    public List<StpSonstige> getStpSonstige() {
        if (stpSonstige == null) {
            stpSonstige = new ArrayList<StpSonstige>();
        }
        return this.stpSonstige;
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
            Double theKaufpreis;
            theKaufpreis = this.getKaufpreis();
            strategy.appendField(locator, this, "kaufpreis", buffer, theKaufpreis);
        }
        {
            Double theNettokaltmiete;
            theNettokaltmiete = this.getNettokaltmiete();
            strategy.appendField(locator, this, "nettokaltmiete", buffer, theNettokaltmiete);
        }
        {
            Double theKaltmiete;
            theKaltmiete = this.getKaltmiete();
            strategy.appendField(locator, this, "kaltmiete", buffer, theKaltmiete);
        }
        {
            Double theWarmmiete;
            theWarmmiete = this.getWarmmiete();
            strategy.appendField(locator, this, "warmmiete", buffer, theWarmmiete);
        }
        {
            Double theNebenkosten;
            theNebenkosten = this.getNebenkosten();
            strategy.appendField(locator, this, "nebenkosten", buffer, theNebenkosten);
        }
        {
            Double theHeizkosten;
            theHeizkosten = this.getHeizkosten();
            strategy.appendField(locator, this, "heizkosten", buffer, theHeizkosten);
        }
        {
            Boolean theZzgMehrwertsteuer;
            theZzgMehrwertsteuer = this.isZzgMehrwertsteuer();
            strategy.appendField(locator, this, "zzgMehrwertsteuer", buffer, theZzgMehrwertsteuer);
        }
        {
            Double theMietzuschlaege;
            theMietzuschlaege = this.getMietzuschlaege();
            strategy.appendField(locator, this, "mietzuschlaege", buffer, theMietzuschlaege);
        }
        {
            Double thePacht;
            thePacht = this.getPacht();
            strategy.appendField(locator, this, "pacht", buffer, thePacht);
        }
        {
            Double theErbpacht;
            theErbpacht = this.getErbpacht();
            strategy.appendField(locator, this, "erbpacht", buffer, theErbpacht);
        }
        {
            Double theHausgeld;
            theHausgeld = this.getHausgeld();
            strategy.appendField(locator, this, "hausgeld", buffer, theHausgeld);
        }
        {
            Double theAbstand;
            theAbstand = this.getAbstand();
            strategy.appendField(locator, this, "abstand", buffer, theAbstand);
        }
        {
            Calendar thePreisZeitraumVon;
            thePreisZeitraumVon = this.getPreisZeitraumVon();
            strategy.appendField(locator, this, "preisZeitraumVon", buffer, thePreisZeitraumVon);
        }
        {
            Calendar thePreisZeitraumBis;
            thePreisZeitraumBis = this.getPreisZeitraumBis();
            strategy.appendField(locator, this, "preisZeitraumBis", buffer, thePreisZeitraumBis);
        }
        {
            PreisZeiteinheit thePreisZeiteinheit;
            thePreisZeiteinheit = this.getPreisZeiteinheit();
            strategy.appendField(locator, this, "preisZeiteinheit", buffer, thePreisZeiteinheit);
        }
        {
            Double theMietpreisProQm;
            theMietpreisProQm = this.getMietpreisProQm();
            strategy.appendField(locator, this, "mietpreisProQm", buffer, theMietpreisProQm);
        }
        {
            Double theKaufpreisProQm;
            theKaufpreisProQm = this.getKaufpreisProQm();
            strategy.appendField(locator, this, "kaufpreisProQm", buffer, theKaufpreisProQm);
        }
        {
            InnenCourtage theInnenCourtage;
            theInnenCourtage = this.getInnenCourtage();
            strategy.appendField(locator, this, "innenCourtage", buffer, theInnenCourtage);
        }
        {
            AussenCourtage theAussenCourtage;
            theAussenCourtage = this.getAussenCourtage();
            strategy.appendField(locator, this, "aussenCourtage", buffer, theAussenCourtage);
        }
        {
            Waehrung theWaehrung;
            theWaehrung = this.getWaehrung();
            strategy.appendField(locator, this, "waehrung", buffer, theWaehrung);
        }
        {
            Double theMwstSatz;
            theMwstSatz = this.getMwstSatz();
            strategy.appendField(locator, this, "mwstSatz", buffer, theMwstSatz);
        }
        {
            String theFreitextPreis;
            theFreitextPreis = this.getFreitextPreis();
            strategy.appendField(locator, this, "freitextPreis", buffer, theFreitextPreis);
        }
        {
            String theXFache;
            theXFache = this.getXFache();
            strategy.appendField(locator, this, "xFache", buffer, theXFache);
        }
        {
            Double theNettorendite;
            theNettorendite = this.getNettorendite();
            strategy.appendField(locator, this, "nettorendite", buffer, theNettorendite);
        }
        {
            Double theMieteinnahmenIst;
            theMieteinnahmenIst = this.getMieteinnahmenIst();
            strategy.appendField(locator, this, "mieteinnahmenIst", buffer, theMieteinnahmenIst);
        }
        {
            Double theMieteinnahmenSoll;
            theMieteinnahmenSoll = this.getMieteinnahmenSoll();
            strategy.appendField(locator, this, "mieteinnahmenSoll", buffer, theMieteinnahmenSoll);
        }
        {
            Double theErschliessungskosten;
            theErschliessungskosten = this.getErschliessungskosten();
            strategy.appendField(locator, this, "erschliessungskosten", buffer, theErschliessungskosten);
        }
        {
            Double theKaution;
            theKaution = this.getKaution();
            strategy.appendField(locator, this, "kaution", buffer, theKaution);
        }
        {
            Double theGeschaeftsguthaben;
            theGeschaeftsguthaben = this.getGeschaeftsguthaben();
            strategy.appendField(locator, this, "geschaeftsguthaben", buffer, theGeschaeftsguthaben);
        }
        {
            Stellplatz theStpCarport;
            theStpCarport = this.getStpCarport();
            strategy.appendField(locator, this, "stpCarport", buffer, theStpCarport);
        }
        {
            Stellplatz theStpDuplex;
            theStpDuplex = this.getStpDuplex();
            strategy.appendField(locator, this, "stpDuplex", buffer, theStpDuplex);
        }
        {
            Stellplatz theStpFreiplatz;
            theStpFreiplatz = this.getStpFreiplatz();
            strategy.appendField(locator, this, "stpFreiplatz", buffer, theStpFreiplatz);
        }
        {
            Stellplatz theStpGarage;
            theStpGarage = this.getStpGarage();
            strategy.appendField(locator, this, "stpGarage", buffer, theStpGarage);
        }
        {
            Stellplatz theStpParkhaus;
            theStpParkhaus = this.getStpParkhaus();
            strategy.appendField(locator, this, "stpParkhaus", buffer, theStpParkhaus);
        }
        {
            Stellplatz theStpTiefgarage;
            theStpTiefgarage = this.getStpTiefgarage();
            strategy.appendField(locator, this, "stpTiefgarage", buffer, theStpTiefgarage);
        }
        {
            List<StpSonstige> theStpSonstige;
            theStpSonstige = (((this.stpSonstige!= null)&&(!this.stpSonstige.isEmpty()))?this.getStpSonstige():null);
            strategy.appendField(locator, this, "stpSonstige", buffer, theStpSonstige);
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
        if (draftCopy instanceof Preise) {
            final Preise copy = ((Preise) draftCopy);
            if (this.kaufpreis!= null) {
                Double sourceKaufpreis;
                sourceKaufpreis = this.getKaufpreis();
                Double copyKaufpreis = ((Double) strategy.copy(LocatorUtils.property(locator, "kaufpreis", sourceKaufpreis), sourceKaufpreis));
                copy.setKaufpreis(copyKaufpreis);
            } else {
                copy.kaufpreis = null;
            }
            if (this.nettokaltmiete!= null) {
                Double sourceNettokaltmiete;
                sourceNettokaltmiete = this.getNettokaltmiete();
                Double copyNettokaltmiete = ((Double) strategy.copy(LocatorUtils.property(locator, "nettokaltmiete", sourceNettokaltmiete), sourceNettokaltmiete));
                copy.setNettokaltmiete(copyNettokaltmiete);
            } else {
                copy.nettokaltmiete = null;
            }
            if (this.kaltmiete!= null) {
                Double sourceKaltmiete;
                sourceKaltmiete = this.getKaltmiete();
                Double copyKaltmiete = ((Double) strategy.copy(LocatorUtils.property(locator, "kaltmiete", sourceKaltmiete), sourceKaltmiete));
                copy.setKaltmiete(copyKaltmiete);
            } else {
                copy.kaltmiete = null;
            }
            if (this.warmmiete!= null) {
                Double sourceWarmmiete;
                sourceWarmmiete = this.getWarmmiete();
                Double copyWarmmiete = ((Double) strategy.copy(LocatorUtils.property(locator, "warmmiete", sourceWarmmiete), sourceWarmmiete));
                copy.setWarmmiete(copyWarmmiete);
            } else {
                copy.warmmiete = null;
            }
            if (this.nebenkosten!= null) {
                Double sourceNebenkosten;
                sourceNebenkosten = this.getNebenkosten();
                Double copyNebenkosten = ((Double) strategy.copy(LocatorUtils.property(locator, "nebenkosten", sourceNebenkosten), sourceNebenkosten));
                copy.setNebenkosten(copyNebenkosten);
            } else {
                copy.nebenkosten = null;
            }
            if (this.heizkosten!= null) {
                Double sourceHeizkosten;
                sourceHeizkosten = this.getHeizkosten();
                Double copyHeizkosten = ((Double) strategy.copy(LocatorUtils.property(locator, "heizkosten", sourceHeizkosten), sourceHeizkosten));
                copy.setHeizkosten(copyHeizkosten);
            } else {
                copy.heizkosten = null;
            }
            if (this.zzgMehrwertsteuer!= null) {
                Boolean sourceZzgMehrwertsteuer;
                sourceZzgMehrwertsteuer = this.isZzgMehrwertsteuer();
                Boolean copyZzgMehrwertsteuer = ((Boolean) strategy.copy(LocatorUtils.property(locator, "zzgMehrwertsteuer", sourceZzgMehrwertsteuer), sourceZzgMehrwertsteuer));
                copy.setZzgMehrwertsteuer(copyZzgMehrwertsteuer);
            } else {
                copy.zzgMehrwertsteuer = null;
            }
            if (this.mietzuschlaege!= null) {
                Double sourceMietzuschlaege;
                sourceMietzuschlaege = this.getMietzuschlaege();
                Double copyMietzuschlaege = ((Double) strategy.copy(LocatorUtils.property(locator, "mietzuschlaege", sourceMietzuschlaege), sourceMietzuschlaege));
                copy.setMietzuschlaege(copyMietzuschlaege);
            } else {
                copy.mietzuschlaege = null;
            }
            if (this.pacht!= null) {
                Double sourcePacht;
                sourcePacht = this.getPacht();
                Double copyPacht = ((Double) strategy.copy(LocatorUtils.property(locator, "pacht", sourcePacht), sourcePacht));
                copy.setPacht(copyPacht);
            } else {
                copy.pacht = null;
            }
            if (this.erbpacht!= null) {
                Double sourceErbpacht;
                sourceErbpacht = this.getErbpacht();
                Double copyErbpacht = ((Double) strategy.copy(LocatorUtils.property(locator, "erbpacht", sourceErbpacht), sourceErbpacht));
                copy.setErbpacht(copyErbpacht);
            } else {
                copy.erbpacht = null;
            }
            if (this.hausgeld!= null) {
                Double sourceHausgeld;
                sourceHausgeld = this.getHausgeld();
                Double copyHausgeld = ((Double) strategy.copy(LocatorUtils.property(locator, "hausgeld", sourceHausgeld), sourceHausgeld));
                copy.setHausgeld(copyHausgeld);
            } else {
                copy.hausgeld = null;
            }
            if (this.abstand!= null) {
                Double sourceAbstand;
                sourceAbstand = this.getAbstand();
                Double copyAbstand = ((Double) strategy.copy(LocatorUtils.property(locator, "abstand", sourceAbstand), sourceAbstand));
                copy.setAbstand(copyAbstand);
            } else {
                copy.abstand = null;
            }
            if (this.preisZeitraumVon!= null) {
                Calendar sourcePreisZeitraumVon;
                sourcePreisZeitraumVon = this.getPreisZeitraumVon();
                Calendar copyPreisZeitraumVon = ((Calendar) strategy.copy(LocatorUtils.property(locator, "preisZeitraumVon", sourcePreisZeitraumVon), sourcePreisZeitraumVon));
                copy.setPreisZeitraumVon(copyPreisZeitraumVon);
            } else {
                copy.preisZeitraumVon = null;
            }
            if (this.preisZeitraumBis!= null) {
                Calendar sourcePreisZeitraumBis;
                sourcePreisZeitraumBis = this.getPreisZeitraumBis();
                Calendar copyPreisZeitraumBis = ((Calendar) strategy.copy(LocatorUtils.property(locator, "preisZeitraumBis", sourcePreisZeitraumBis), sourcePreisZeitraumBis));
                copy.setPreisZeitraumBis(copyPreisZeitraumBis);
            } else {
                copy.preisZeitraumBis = null;
            }
            if (this.preisZeiteinheit!= null) {
                PreisZeiteinheit sourcePreisZeiteinheit;
                sourcePreisZeiteinheit = this.getPreisZeiteinheit();
                PreisZeiteinheit copyPreisZeiteinheit = ((PreisZeiteinheit) strategy.copy(LocatorUtils.property(locator, "preisZeiteinheit", sourcePreisZeiteinheit), sourcePreisZeiteinheit));
                copy.setPreisZeiteinheit(copyPreisZeiteinheit);
            } else {
                copy.preisZeiteinheit = null;
            }
            if (this.mietpreisProQm!= null) {
                Double sourceMietpreisProQm;
                sourceMietpreisProQm = this.getMietpreisProQm();
                Double copyMietpreisProQm = ((Double) strategy.copy(LocatorUtils.property(locator, "mietpreisProQm", sourceMietpreisProQm), sourceMietpreisProQm));
                copy.setMietpreisProQm(copyMietpreisProQm);
            } else {
                copy.mietpreisProQm = null;
            }
            if (this.kaufpreisProQm!= null) {
                Double sourceKaufpreisProQm;
                sourceKaufpreisProQm = this.getKaufpreisProQm();
                Double copyKaufpreisProQm = ((Double) strategy.copy(LocatorUtils.property(locator, "kaufpreisProQm", sourceKaufpreisProQm), sourceKaufpreisProQm));
                copy.setKaufpreisProQm(copyKaufpreisProQm);
            } else {
                copy.kaufpreisProQm = null;
            }
            if (this.innenCourtage!= null) {
                InnenCourtage sourceInnenCourtage;
                sourceInnenCourtage = this.getInnenCourtage();
                InnenCourtage copyInnenCourtage = ((InnenCourtage) strategy.copy(LocatorUtils.property(locator, "innenCourtage", sourceInnenCourtage), sourceInnenCourtage));
                copy.setInnenCourtage(copyInnenCourtage);
            } else {
                copy.innenCourtage = null;
            }
            if (this.aussenCourtage!= null) {
                AussenCourtage sourceAussenCourtage;
                sourceAussenCourtage = this.getAussenCourtage();
                AussenCourtage copyAussenCourtage = ((AussenCourtage) strategy.copy(LocatorUtils.property(locator, "aussenCourtage", sourceAussenCourtage), sourceAussenCourtage));
                copy.setAussenCourtage(copyAussenCourtage);
            } else {
                copy.aussenCourtage = null;
            }
            if (this.waehrung!= null) {
                Waehrung sourceWaehrung;
                sourceWaehrung = this.getWaehrung();
                Waehrung copyWaehrung = ((Waehrung) strategy.copy(LocatorUtils.property(locator, "waehrung", sourceWaehrung), sourceWaehrung));
                copy.setWaehrung(copyWaehrung);
            } else {
                copy.waehrung = null;
            }
            if (this.mwstSatz!= null) {
                Double sourceMwstSatz;
                sourceMwstSatz = this.getMwstSatz();
                Double copyMwstSatz = ((Double) strategy.copy(LocatorUtils.property(locator, "mwstSatz", sourceMwstSatz), sourceMwstSatz));
                copy.setMwstSatz(copyMwstSatz);
            } else {
                copy.mwstSatz = null;
            }
            if (this.freitextPreis!= null) {
                String sourceFreitextPreis;
                sourceFreitextPreis = this.getFreitextPreis();
                String copyFreitextPreis = ((String) strategy.copy(LocatorUtils.property(locator, "freitextPreis", sourceFreitextPreis), sourceFreitextPreis));
                copy.setFreitextPreis(copyFreitextPreis);
            } else {
                copy.freitextPreis = null;
            }
            if (this.xFache!= null) {
                String sourceXFache;
                sourceXFache = this.getXFache();
                String copyXFache = ((String) strategy.copy(LocatorUtils.property(locator, "xFache", sourceXFache), sourceXFache));
                copy.setXFache(copyXFache);
            } else {
                copy.xFache = null;
            }
            if (this.nettorendite!= null) {
                Double sourceNettorendite;
                sourceNettorendite = this.getNettorendite();
                Double copyNettorendite = ((Double) strategy.copy(LocatorUtils.property(locator, "nettorendite", sourceNettorendite), sourceNettorendite));
                copy.setNettorendite(copyNettorendite);
            } else {
                copy.nettorendite = null;
            }
            if (this.mieteinnahmenIst!= null) {
                Double sourceMieteinnahmenIst;
                sourceMieteinnahmenIst = this.getMieteinnahmenIst();
                Double copyMieteinnahmenIst = ((Double) strategy.copy(LocatorUtils.property(locator, "mieteinnahmenIst", sourceMieteinnahmenIst), sourceMieteinnahmenIst));
                copy.setMieteinnahmenIst(copyMieteinnahmenIst);
            } else {
                copy.mieteinnahmenIst = null;
            }
            if (this.mieteinnahmenSoll!= null) {
                Double sourceMieteinnahmenSoll;
                sourceMieteinnahmenSoll = this.getMieteinnahmenSoll();
                Double copyMieteinnahmenSoll = ((Double) strategy.copy(LocatorUtils.property(locator, "mieteinnahmenSoll", sourceMieteinnahmenSoll), sourceMieteinnahmenSoll));
                copy.setMieteinnahmenSoll(copyMieteinnahmenSoll);
            } else {
                copy.mieteinnahmenSoll = null;
            }
            if (this.erschliessungskosten!= null) {
                Double sourceErschliessungskosten;
                sourceErschliessungskosten = this.getErschliessungskosten();
                Double copyErschliessungskosten = ((Double) strategy.copy(LocatorUtils.property(locator, "erschliessungskosten", sourceErschliessungskosten), sourceErschliessungskosten));
                copy.setErschliessungskosten(copyErschliessungskosten);
            } else {
                copy.erschliessungskosten = null;
            }
            if (this.kaution!= null) {
                Double sourceKaution;
                sourceKaution = this.getKaution();
                Double copyKaution = ((Double) strategy.copy(LocatorUtils.property(locator, "kaution", sourceKaution), sourceKaution));
                copy.setKaution(copyKaution);
            } else {
                copy.kaution = null;
            }
            if (this.geschaeftsguthaben!= null) {
                Double sourceGeschaeftsguthaben;
                sourceGeschaeftsguthaben = this.getGeschaeftsguthaben();
                Double copyGeschaeftsguthaben = ((Double) strategy.copy(LocatorUtils.property(locator, "geschaeftsguthaben", sourceGeschaeftsguthaben), sourceGeschaeftsguthaben));
                copy.setGeschaeftsguthaben(copyGeschaeftsguthaben);
            } else {
                copy.geschaeftsguthaben = null;
            }
            if (this.stpCarport!= null) {
                Stellplatz sourceStpCarport;
                sourceStpCarport = this.getStpCarport();
                Stellplatz copyStpCarport = ((Stellplatz) strategy.copy(LocatorUtils.property(locator, "stpCarport", sourceStpCarport), sourceStpCarport));
                copy.setStpCarport(copyStpCarport);
            } else {
                copy.stpCarport = null;
            }
            if (this.stpDuplex!= null) {
                Stellplatz sourceStpDuplex;
                sourceStpDuplex = this.getStpDuplex();
                Stellplatz copyStpDuplex = ((Stellplatz) strategy.copy(LocatorUtils.property(locator, "stpDuplex", sourceStpDuplex), sourceStpDuplex));
                copy.setStpDuplex(copyStpDuplex);
            } else {
                copy.stpDuplex = null;
            }
            if (this.stpFreiplatz!= null) {
                Stellplatz sourceStpFreiplatz;
                sourceStpFreiplatz = this.getStpFreiplatz();
                Stellplatz copyStpFreiplatz = ((Stellplatz) strategy.copy(LocatorUtils.property(locator, "stpFreiplatz", sourceStpFreiplatz), sourceStpFreiplatz));
                copy.setStpFreiplatz(copyStpFreiplatz);
            } else {
                copy.stpFreiplatz = null;
            }
            if (this.stpGarage!= null) {
                Stellplatz sourceStpGarage;
                sourceStpGarage = this.getStpGarage();
                Stellplatz copyStpGarage = ((Stellplatz) strategy.copy(LocatorUtils.property(locator, "stpGarage", sourceStpGarage), sourceStpGarage));
                copy.setStpGarage(copyStpGarage);
            } else {
                copy.stpGarage = null;
            }
            if (this.stpParkhaus!= null) {
                Stellplatz sourceStpParkhaus;
                sourceStpParkhaus = this.getStpParkhaus();
                Stellplatz copyStpParkhaus = ((Stellplatz) strategy.copy(LocatorUtils.property(locator, "stpParkhaus", sourceStpParkhaus), sourceStpParkhaus));
                copy.setStpParkhaus(copyStpParkhaus);
            } else {
                copy.stpParkhaus = null;
            }
            if (this.stpTiefgarage!= null) {
                Stellplatz sourceStpTiefgarage;
                sourceStpTiefgarage = this.getStpTiefgarage();
                Stellplatz copyStpTiefgarage = ((Stellplatz) strategy.copy(LocatorUtils.property(locator, "stpTiefgarage", sourceStpTiefgarage), sourceStpTiefgarage));
                copy.setStpTiefgarage(copyStpTiefgarage);
            } else {
                copy.stpTiefgarage = null;
            }
            if ((this.stpSonstige!= null)&&(!this.stpSonstige.isEmpty())) {
                List<StpSonstige> sourceStpSonstige;
                sourceStpSonstige = (((this.stpSonstige!= null)&&(!this.stpSonstige.isEmpty()))?this.getStpSonstige():null);
                @SuppressWarnings("unchecked")
                List<StpSonstige> copyStpSonstige = ((List<StpSonstige> ) strategy.copy(LocatorUtils.property(locator, "stpSonstige", sourceStpSonstige), sourceStpSonstige));
                copy.stpSonstige = null;
                if (copyStpSonstige!= null) {
                    List<StpSonstige> uniqueStpSonstigel = copy.getStpSonstige();
                    uniqueStpSonstigel.addAll(copyStpSonstige);
                }
            } else {
                copy.stpSonstige = null;
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
        return new Preise();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Preise)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Preise that = ((Preise) object);
        {
            Double lhsKaufpreis;
            lhsKaufpreis = this.getKaufpreis();
            Double rhsKaufpreis;
            rhsKaufpreis = that.getKaufpreis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kaufpreis", lhsKaufpreis), LocatorUtils.property(thatLocator, "kaufpreis", rhsKaufpreis), lhsKaufpreis, rhsKaufpreis)) {
                return false;
            }
        }
        {
            Double lhsNettokaltmiete;
            lhsNettokaltmiete = this.getNettokaltmiete();
            Double rhsNettokaltmiete;
            rhsNettokaltmiete = that.getNettokaltmiete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nettokaltmiete", lhsNettokaltmiete), LocatorUtils.property(thatLocator, "nettokaltmiete", rhsNettokaltmiete), lhsNettokaltmiete, rhsNettokaltmiete)) {
                return false;
            }
        }
        {
            Double lhsKaltmiete;
            lhsKaltmiete = this.getKaltmiete();
            Double rhsKaltmiete;
            rhsKaltmiete = that.getKaltmiete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kaltmiete", lhsKaltmiete), LocatorUtils.property(thatLocator, "kaltmiete", rhsKaltmiete), lhsKaltmiete, rhsKaltmiete)) {
                return false;
            }
        }
        {
            Double lhsWarmmiete;
            lhsWarmmiete = this.getWarmmiete();
            Double rhsWarmmiete;
            rhsWarmmiete = that.getWarmmiete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warmmiete", lhsWarmmiete), LocatorUtils.property(thatLocator, "warmmiete", rhsWarmmiete), lhsWarmmiete, rhsWarmmiete)) {
                return false;
            }
        }
        {
            Double lhsNebenkosten;
            lhsNebenkosten = this.getNebenkosten();
            Double rhsNebenkosten;
            rhsNebenkosten = that.getNebenkosten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nebenkosten", lhsNebenkosten), LocatorUtils.property(thatLocator, "nebenkosten", rhsNebenkosten), lhsNebenkosten, rhsNebenkosten)) {
                return false;
            }
        }
        {
            Double lhsHeizkosten;
            lhsHeizkosten = this.getHeizkosten();
            Double rhsHeizkosten;
            rhsHeizkosten = that.getHeizkosten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heizkosten", lhsHeizkosten), LocatorUtils.property(thatLocator, "heizkosten", rhsHeizkosten), lhsHeizkosten, rhsHeizkosten)) {
                return false;
            }
        }
        {
            Boolean lhsZzgMehrwertsteuer;
            lhsZzgMehrwertsteuer = this.isZzgMehrwertsteuer();
            Boolean rhsZzgMehrwertsteuer;
            rhsZzgMehrwertsteuer = that.isZzgMehrwertsteuer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zzgMehrwertsteuer", lhsZzgMehrwertsteuer), LocatorUtils.property(thatLocator, "zzgMehrwertsteuer", rhsZzgMehrwertsteuer), lhsZzgMehrwertsteuer, rhsZzgMehrwertsteuer)) {
                return false;
            }
        }
        {
            Double lhsMietzuschlaege;
            lhsMietzuschlaege = this.getMietzuschlaege();
            Double rhsMietzuschlaege;
            rhsMietzuschlaege = that.getMietzuschlaege();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mietzuschlaege", lhsMietzuschlaege), LocatorUtils.property(thatLocator, "mietzuschlaege", rhsMietzuschlaege), lhsMietzuschlaege, rhsMietzuschlaege)) {
                return false;
            }
        }
        {
            Double lhsPacht;
            lhsPacht = this.getPacht();
            Double rhsPacht;
            rhsPacht = that.getPacht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pacht", lhsPacht), LocatorUtils.property(thatLocator, "pacht", rhsPacht), lhsPacht, rhsPacht)) {
                return false;
            }
        }
        {
            Double lhsErbpacht;
            lhsErbpacht = this.getErbpacht();
            Double rhsErbpacht;
            rhsErbpacht = that.getErbpacht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erbpacht", lhsErbpacht), LocatorUtils.property(thatLocator, "erbpacht", rhsErbpacht), lhsErbpacht, rhsErbpacht)) {
                return false;
            }
        }
        {
            Double lhsHausgeld;
            lhsHausgeld = this.getHausgeld();
            Double rhsHausgeld;
            rhsHausgeld = that.getHausgeld();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hausgeld", lhsHausgeld), LocatorUtils.property(thatLocator, "hausgeld", rhsHausgeld), lhsHausgeld, rhsHausgeld)) {
                return false;
            }
        }
        {
            Double lhsAbstand;
            lhsAbstand = this.getAbstand();
            Double rhsAbstand;
            rhsAbstand = that.getAbstand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abstand", lhsAbstand), LocatorUtils.property(thatLocator, "abstand", rhsAbstand), lhsAbstand, rhsAbstand)) {
                return false;
            }
        }
        {
            Calendar lhsPreisZeitraumVon;
            lhsPreisZeitraumVon = this.getPreisZeitraumVon();
            Calendar rhsPreisZeitraumVon;
            rhsPreisZeitraumVon = that.getPreisZeitraumVon();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preisZeitraumVon", lhsPreisZeitraumVon), LocatorUtils.property(thatLocator, "preisZeitraumVon", rhsPreisZeitraumVon), lhsPreisZeitraumVon, rhsPreisZeitraumVon)) {
                return false;
            }
        }
        {
            Calendar lhsPreisZeitraumBis;
            lhsPreisZeitraumBis = this.getPreisZeitraumBis();
            Calendar rhsPreisZeitraumBis;
            rhsPreisZeitraumBis = that.getPreisZeitraumBis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preisZeitraumBis", lhsPreisZeitraumBis), LocatorUtils.property(thatLocator, "preisZeitraumBis", rhsPreisZeitraumBis), lhsPreisZeitraumBis, rhsPreisZeitraumBis)) {
                return false;
            }
        }
        {
            PreisZeiteinheit lhsPreisZeiteinheit;
            lhsPreisZeiteinheit = this.getPreisZeiteinheit();
            PreisZeiteinheit rhsPreisZeiteinheit;
            rhsPreisZeiteinheit = that.getPreisZeiteinheit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preisZeiteinheit", lhsPreisZeiteinheit), LocatorUtils.property(thatLocator, "preisZeiteinheit", rhsPreisZeiteinheit), lhsPreisZeiteinheit, rhsPreisZeiteinheit)) {
                return false;
            }
        }
        {
            Double lhsMietpreisProQm;
            lhsMietpreisProQm = this.getMietpreisProQm();
            Double rhsMietpreisProQm;
            rhsMietpreisProQm = that.getMietpreisProQm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mietpreisProQm", lhsMietpreisProQm), LocatorUtils.property(thatLocator, "mietpreisProQm", rhsMietpreisProQm), lhsMietpreisProQm, rhsMietpreisProQm)) {
                return false;
            }
        }
        {
            Double lhsKaufpreisProQm;
            lhsKaufpreisProQm = this.getKaufpreisProQm();
            Double rhsKaufpreisProQm;
            rhsKaufpreisProQm = that.getKaufpreisProQm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kaufpreisProQm", lhsKaufpreisProQm), LocatorUtils.property(thatLocator, "kaufpreisProQm", rhsKaufpreisProQm), lhsKaufpreisProQm, rhsKaufpreisProQm)) {
                return false;
            }
        }
        {
            InnenCourtage lhsInnenCourtage;
            lhsInnenCourtage = this.getInnenCourtage();
            InnenCourtage rhsInnenCourtage;
            rhsInnenCourtage = that.getInnenCourtage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "innenCourtage", lhsInnenCourtage), LocatorUtils.property(thatLocator, "innenCourtage", rhsInnenCourtage), lhsInnenCourtage, rhsInnenCourtage)) {
                return false;
            }
        }
        {
            AussenCourtage lhsAussenCourtage;
            lhsAussenCourtage = this.getAussenCourtage();
            AussenCourtage rhsAussenCourtage;
            rhsAussenCourtage = that.getAussenCourtage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aussenCourtage", lhsAussenCourtage), LocatorUtils.property(thatLocator, "aussenCourtage", rhsAussenCourtage), lhsAussenCourtage, rhsAussenCourtage)) {
                return false;
            }
        }
        {
            Waehrung lhsWaehrung;
            lhsWaehrung = this.getWaehrung();
            Waehrung rhsWaehrung;
            rhsWaehrung = that.getWaehrung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waehrung", lhsWaehrung), LocatorUtils.property(thatLocator, "waehrung", rhsWaehrung), lhsWaehrung, rhsWaehrung)) {
                return false;
            }
        }
        {
            Double lhsMwstSatz;
            lhsMwstSatz = this.getMwstSatz();
            Double rhsMwstSatz;
            rhsMwstSatz = that.getMwstSatz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mwstSatz", lhsMwstSatz), LocatorUtils.property(thatLocator, "mwstSatz", rhsMwstSatz), lhsMwstSatz, rhsMwstSatz)) {
                return false;
            }
        }
        {
            String lhsFreitextPreis;
            lhsFreitextPreis = this.getFreitextPreis();
            String rhsFreitextPreis;
            rhsFreitextPreis = that.getFreitextPreis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freitextPreis", lhsFreitextPreis), LocatorUtils.property(thatLocator, "freitextPreis", rhsFreitextPreis), lhsFreitextPreis, rhsFreitextPreis)) {
                return false;
            }
        }
        {
            String lhsXFache;
            lhsXFache = this.getXFache();
            String rhsXFache;
            rhsXFache = that.getXFache();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "xFache", lhsXFache), LocatorUtils.property(thatLocator, "xFache", rhsXFache), lhsXFache, rhsXFache)) {
                return false;
            }
        }
        {
            Double lhsNettorendite;
            lhsNettorendite = this.getNettorendite();
            Double rhsNettorendite;
            rhsNettorendite = that.getNettorendite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nettorendite", lhsNettorendite), LocatorUtils.property(thatLocator, "nettorendite", rhsNettorendite), lhsNettorendite, rhsNettorendite)) {
                return false;
            }
        }
        {
            Double lhsMieteinnahmenIst;
            lhsMieteinnahmenIst = this.getMieteinnahmenIst();
            Double rhsMieteinnahmenIst;
            rhsMieteinnahmenIst = that.getMieteinnahmenIst();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mieteinnahmenIst", lhsMieteinnahmenIst), LocatorUtils.property(thatLocator, "mieteinnahmenIst", rhsMieteinnahmenIst), lhsMieteinnahmenIst, rhsMieteinnahmenIst)) {
                return false;
            }
        }
        {
            Double lhsMieteinnahmenSoll;
            lhsMieteinnahmenSoll = this.getMieteinnahmenSoll();
            Double rhsMieteinnahmenSoll;
            rhsMieteinnahmenSoll = that.getMieteinnahmenSoll();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mieteinnahmenSoll", lhsMieteinnahmenSoll), LocatorUtils.property(thatLocator, "mieteinnahmenSoll", rhsMieteinnahmenSoll), lhsMieteinnahmenSoll, rhsMieteinnahmenSoll)) {
                return false;
            }
        }
        {
            Double lhsErschliessungskosten;
            lhsErschliessungskosten = this.getErschliessungskosten();
            Double rhsErschliessungskosten;
            rhsErschliessungskosten = that.getErschliessungskosten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erschliessungskosten", lhsErschliessungskosten), LocatorUtils.property(thatLocator, "erschliessungskosten", rhsErschliessungskosten), lhsErschliessungskosten, rhsErschliessungskosten)) {
                return false;
            }
        }
        {
            Double lhsKaution;
            lhsKaution = this.getKaution();
            Double rhsKaution;
            rhsKaution = that.getKaution();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kaution", lhsKaution), LocatorUtils.property(thatLocator, "kaution", rhsKaution), lhsKaution, rhsKaution)) {
                return false;
            }
        }
        {
            Double lhsGeschaeftsguthaben;
            lhsGeschaeftsguthaben = this.getGeschaeftsguthaben();
            Double rhsGeschaeftsguthaben;
            rhsGeschaeftsguthaben = that.getGeschaeftsguthaben();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geschaeftsguthaben", lhsGeschaeftsguthaben), LocatorUtils.property(thatLocator, "geschaeftsguthaben", rhsGeschaeftsguthaben), lhsGeschaeftsguthaben, rhsGeschaeftsguthaben)) {
                return false;
            }
        }
        {
            Stellplatz lhsStpCarport;
            lhsStpCarport = this.getStpCarport();
            Stellplatz rhsStpCarport;
            rhsStpCarport = that.getStpCarport();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stpCarport", lhsStpCarport), LocatorUtils.property(thatLocator, "stpCarport", rhsStpCarport), lhsStpCarport, rhsStpCarport)) {
                return false;
            }
        }
        {
            Stellplatz lhsStpDuplex;
            lhsStpDuplex = this.getStpDuplex();
            Stellplatz rhsStpDuplex;
            rhsStpDuplex = that.getStpDuplex();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stpDuplex", lhsStpDuplex), LocatorUtils.property(thatLocator, "stpDuplex", rhsStpDuplex), lhsStpDuplex, rhsStpDuplex)) {
                return false;
            }
        }
        {
            Stellplatz lhsStpFreiplatz;
            lhsStpFreiplatz = this.getStpFreiplatz();
            Stellplatz rhsStpFreiplatz;
            rhsStpFreiplatz = that.getStpFreiplatz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stpFreiplatz", lhsStpFreiplatz), LocatorUtils.property(thatLocator, "stpFreiplatz", rhsStpFreiplatz), lhsStpFreiplatz, rhsStpFreiplatz)) {
                return false;
            }
        }
        {
            Stellplatz lhsStpGarage;
            lhsStpGarage = this.getStpGarage();
            Stellplatz rhsStpGarage;
            rhsStpGarage = that.getStpGarage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stpGarage", lhsStpGarage), LocatorUtils.property(thatLocator, "stpGarage", rhsStpGarage), lhsStpGarage, rhsStpGarage)) {
                return false;
            }
        }
        {
            Stellplatz lhsStpParkhaus;
            lhsStpParkhaus = this.getStpParkhaus();
            Stellplatz rhsStpParkhaus;
            rhsStpParkhaus = that.getStpParkhaus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stpParkhaus", lhsStpParkhaus), LocatorUtils.property(thatLocator, "stpParkhaus", rhsStpParkhaus), lhsStpParkhaus, rhsStpParkhaus)) {
                return false;
            }
        }
        {
            Stellplatz lhsStpTiefgarage;
            lhsStpTiefgarage = this.getStpTiefgarage();
            Stellplatz rhsStpTiefgarage;
            rhsStpTiefgarage = that.getStpTiefgarage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stpTiefgarage", lhsStpTiefgarage), LocatorUtils.property(thatLocator, "stpTiefgarage", rhsStpTiefgarage), lhsStpTiefgarage, rhsStpTiefgarage)) {
                return false;
            }
        }
        {
            List<StpSonstige> lhsStpSonstige;
            lhsStpSonstige = (((this.stpSonstige!= null)&&(!this.stpSonstige.isEmpty()))?this.getStpSonstige():null);
            List<StpSonstige> rhsStpSonstige;
            rhsStpSonstige = (((that.stpSonstige!= null)&&(!that.stpSonstige.isEmpty()))?that.getStpSonstige():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stpSonstige", lhsStpSonstige), LocatorUtils.property(thatLocator, "stpSonstige", rhsStpSonstige), lhsStpSonstige, rhsStpSonstige)) {
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
