
package org.openestate.io.immoxml.xml;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
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
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
public class Preise implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal kaufpreis;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal nettokaltmiete;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal kaltmiete;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal warmmiete;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal nebenkosten;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal heizkosten;
    @XmlElement(name = "zzg_mehrwertsteuer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean zzgMehrwertsteuer;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal mietzuschlaege;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal pacht;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal erbpacht;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal hausgeld;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal abstand;
    @XmlElement(name = "preis_zeitraum_von", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Calendar preisZeitraumVon;
    @XmlElement(name = "preis_zeitraum_bis", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Calendar preisZeitraumBis;
    @XmlElement(name = "preis_zeiteinheit")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected PreisZeiteinheit preisZeiteinheit;
    @XmlElement(name = "mietpreis_pro_qm", type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal mietpreisProQm;
    @XmlElement(name = "kaufpreis_pro_qm", type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal kaufpreisProQm;
    @XmlElement(name = "innen_courtage")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected InnenCourtage innenCourtage;
    @XmlElement(name = "aussen_courtage")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected AussenCourtage aussenCourtage;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Waehrung waehrung;
    @XmlElement(name = "mwst_satz", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal mwstSatz;
    @XmlElement(name = "freitext_preis")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String freitextPreis;
    @XmlElement(name = "x_fache")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String xFache;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal nettorendite;
    @XmlElement(name = "mieteinnahmen_ist", type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal mieteinnahmenIst;
    @XmlElement(name = "mieteinnahmen_soll", type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal mieteinnahmenSoll;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal erschliessungskosten;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal kaution;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "decimal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal geschaeftsguthaben;
    @XmlElement(name = "stp_carport")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Stellplatz stpCarport;
    @XmlElement(name = "stp_duplex")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Stellplatz stpDuplex;
    @XmlElement(name = "stp_freiplatz")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Stellplatz stpFreiplatz;
    @XmlElement(name = "stp_garage")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Stellplatz stpGarage;
    @XmlElement(name = "stp_parkhaus")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Stellplatz stpParkhaus;
    @XmlElement(name = "stp_tiefgarage")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Stellplatz stpTiefgarage;
    @XmlElement(name = "stp_sonstige")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected List<StpSonstige> stpSonstige;
    @XmlElement(name = "user_defined_simplefield")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected List<UserDefinedSimplefield> userDefinedSimplefield;
    @XmlElement(name = "user_defined_anyfield")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected List<UserDefinedAnyfield> userDefinedAnyfield;

    /**
     * Gets the value of the kaufpreis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getKaufpreis() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setKaufpreis(BigDecimal value) {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getNettokaltmiete() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setNettokaltmiete(BigDecimal value) {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getKaltmiete() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setKaltmiete(BigDecimal value) {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getWarmmiete() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setWarmmiete(BigDecimal value) {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getNebenkosten() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setNebenkosten(BigDecimal value) {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getHeizkosten() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setHeizkosten(BigDecimal value) {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getZzgMehrwertsteuer() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getMietzuschlaege() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setMietzuschlaege(BigDecimal value) {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getPacht() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setPacht(BigDecimal value) {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getErbpacht() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setErbpacht(BigDecimal value) {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getHausgeld() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setHausgeld(BigDecimal value) {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getAbstand() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setAbstand(BigDecimal value) {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getMietpreisProQm() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setMietpreisProQm(BigDecimal value) {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getKaufpreisProQm() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setKaufpreisProQm(BigDecimal value) {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getMwstSatz() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setMwstSatz(BigDecimal value) {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getNettorendite() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setNettorendite(BigDecimal value) {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getMieteinnahmenIst() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setMieteinnahmenIst(BigDecimal value) {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getMieteinnahmenSoll() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setMieteinnahmenSoll(BigDecimal value) {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getErschliessungskosten() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setErschliessungskosten(BigDecimal value) {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getKaution() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setKaution(BigDecimal value) {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getGeschaeftsguthaben() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setGeschaeftsguthaben(BigDecimal value) {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public List<UserDefinedAnyfield> getUserDefinedAnyfield() {
        if (userDefinedAnyfield == null) {
            userDefinedAnyfield = new ArrayList<UserDefinedAnyfield>();
        }
        return this.userDefinedAnyfield;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            BigDecimal theKaufpreis;
            theKaufpreis = this.getKaufpreis();
            strategy.appendField(locator, this, "kaufpreis", buffer, theKaufpreis, (this.kaufpreis!= null));
        }
        {
            BigDecimal theNettokaltmiete;
            theNettokaltmiete = this.getNettokaltmiete();
            strategy.appendField(locator, this, "nettokaltmiete", buffer, theNettokaltmiete, (this.nettokaltmiete!= null));
        }
        {
            BigDecimal theKaltmiete;
            theKaltmiete = this.getKaltmiete();
            strategy.appendField(locator, this, "kaltmiete", buffer, theKaltmiete, (this.kaltmiete!= null));
        }
        {
            BigDecimal theWarmmiete;
            theWarmmiete = this.getWarmmiete();
            strategy.appendField(locator, this, "warmmiete", buffer, theWarmmiete, (this.warmmiete!= null));
        }
        {
            BigDecimal theNebenkosten;
            theNebenkosten = this.getNebenkosten();
            strategy.appendField(locator, this, "nebenkosten", buffer, theNebenkosten, (this.nebenkosten!= null));
        }
        {
            BigDecimal theHeizkosten;
            theHeizkosten = this.getHeizkosten();
            strategy.appendField(locator, this, "heizkosten", buffer, theHeizkosten, (this.heizkosten!= null));
        }
        {
            Boolean theZzgMehrwertsteuer;
            theZzgMehrwertsteuer = this.getZzgMehrwertsteuer();
            strategy.appendField(locator, this, "zzgMehrwertsteuer", buffer, theZzgMehrwertsteuer, (this.zzgMehrwertsteuer!= null));
        }
        {
            BigDecimal theMietzuschlaege;
            theMietzuschlaege = this.getMietzuschlaege();
            strategy.appendField(locator, this, "mietzuschlaege", buffer, theMietzuschlaege, (this.mietzuschlaege!= null));
        }
        {
            BigDecimal thePacht;
            thePacht = this.getPacht();
            strategy.appendField(locator, this, "pacht", buffer, thePacht, (this.pacht!= null));
        }
        {
            BigDecimal theErbpacht;
            theErbpacht = this.getErbpacht();
            strategy.appendField(locator, this, "erbpacht", buffer, theErbpacht, (this.erbpacht!= null));
        }
        {
            BigDecimal theHausgeld;
            theHausgeld = this.getHausgeld();
            strategy.appendField(locator, this, "hausgeld", buffer, theHausgeld, (this.hausgeld!= null));
        }
        {
            BigDecimal theAbstand;
            theAbstand = this.getAbstand();
            strategy.appendField(locator, this, "abstand", buffer, theAbstand, (this.abstand!= null));
        }
        {
            Calendar thePreisZeitraumVon;
            thePreisZeitraumVon = this.getPreisZeitraumVon();
            strategy.appendField(locator, this, "preisZeitraumVon", buffer, thePreisZeitraumVon, (this.preisZeitraumVon!= null));
        }
        {
            Calendar thePreisZeitraumBis;
            thePreisZeitraumBis = this.getPreisZeitraumBis();
            strategy.appendField(locator, this, "preisZeitraumBis", buffer, thePreisZeitraumBis, (this.preisZeitraumBis!= null));
        }
        {
            PreisZeiteinheit thePreisZeiteinheit;
            thePreisZeiteinheit = this.getPreisZeiteinheit();
            strategy.appendField(locator, this, "preisZeiteinheit", buffer, thePreisZeiteinheit, (this.preisZeiteinheit!= null));
        }
        {
            BigDecimal theMietpreisProQm;
            theMietpreisProQm = this.getMietpreisProQm();
            strategy.appendField(locator, this, "mietpreisProQm", buffer, theMietpreisProQm, (this.mietpreisProQm!= null));
        }
        {
            BigDecimal theKaufpreisProQm;
            theKaufpreisProQm = this.getKaufpreisProQm();
            strategy.appendField(locator, this, "kaufpreisProQm", buffer, theKaufpreisProQm, (this.kaufpreisProQm!= null));
        }
        {
            InnenCourtage theInnenCourtage;
            theInnenCourtage = this.getInnenCourtage();
            strategy.appendField(locator, this, "innenCourtage", buffer, theInnenCourtage, (this.innenCourtage!= null));
        }
        {
            AussenCourtage theAussenCourtage;
            theAussenCourtage = this.getAussenCourtage();
            strategy.appendField(locator, this, "aussenCourtage", buffer, theAussenCourtage, (this.aussenCourtage!= null));
        }
        {
            Waehrung theWaehrung;
            theWaehrung = this.getWaehrung();
            strategy.appendField(locator, this, "waehrung", buffer, theWaehrung, (this.waehrung!= null));
        }
        {
            BigDecimal theMwstSatz;
            theMwstSatz = this.getMwstSatz();
            strategy.appendField(locator, this, "mwstSatz", buffer, theMwstSatz, (this.mwstSatz!= null));
        }
        {
            String theFreitextPreis;
            theFreitextPreis = this.getFreitextPreis();
            strategy.appendField(locator, this, "freitextPreis", buffer, theFreitextPreis, (this.freitextPreis!= null));
        }
        {
            String theXFache;
            theXFache = this.getXFache();
            strategy.appendField(locator, this, "xFache", buffer, theXFache, (this.xFache!= null));
        }
        {
            BigDecimal theNettorendite;
            theNettorendite = this.getNettorendite();
            strategy.appendField(locator, this, "nettorendite", buffer, theNettorendite, (this.nettorendite!= null));
        }
        {
            BigDecimal theMieteinnahmenIst;
            theMieteinnahmenIst = this.getMieteinnahmenIst();
            strategy.appendField(locator, this, "mieteinnahmenIst", buffer, theMieteinnahmenIst, (this.mieteinnahmenIst!= null));
        }
        {
            BigDecimal theMieteinnahmenSoll;
            theMieteinnahmenSoll = this.getMieteinnahmenSoll();
            strategy.appendField(locator, this, "mieteinnahmenSoll", buffer, theMieteinnahmenSoll, (this.mieteinnahmenSoll!= null));
        }
        {
            BigDecimal theErschliessungskosten;
            theErschliessungskosten = this.getErschliessungskosten();
            strategy.appendField(locator, this, "erschliessungskosten", buffer, theErschliessungskosten, (this.erschliessungskosten!= null));
        }
        {
            BigDecimal theKaution;
            theKaution = this.getKaution();
            strategy.appendField(locator, this, "kaution", buffer, theKaution, (this.kaution!= null));
        }
        {
            BigDecimal theGeschaeftsguthaben;
            theGeschaeftsguthaben = this.getGeschaeftsguthaben();
            strategy.appendField(locator, this, "geschaeftsguthaben", buffer, theGeschaeftsguthaben, (this.geschaeftsguthaben!= null));
        }
        {
            Stellplatz theStpCarport;
            theStpCarport = this.getStpCarport();
            strategy.appendField(locator, this, "stpCarport", buffer, theStpCarport, (this.stpCarport!= null));
        }
        {
            Stellplatz theStpDuplex;
            theStpDuplex = this.getStpDuplex();
            strategy.appendField(locator, this, "stpDuplex", buffer, theStpDuplex, (this.stpDuplex!= null));
        }
        {
            Stellplatz theStpFreiplatz;
            theStpFreiplatz = this.getStpFreiplatz();
            strategy.appendField(locator, this, "stpFreiplatz", buffer, theStpFreiplatz, (this.stpFreiplatz!= null));
        }
        {
            Stellplatz theStpGarage;
            theStpGarage = this.getStpGarage();
            strategy.appendField(locator, this, "stpGarage", buffer, theStpGarage, (this.stpGarage!= null));
        }
        {
            Stellplatz theStpParkhaus;
            theStpParkhaus = this.getStpParkhaus();
            strategy.appendField(locator, this, "stpParkhaus", buffer, theStpParkhaus, (this.stpParkhaus!= null));
        }
        {
            Stellplatz theStpTiefgarage;
            theStpTiefgarage = this.getStpTiefgarage();
            strategy.appendField(locator, this, "stpTiefgarage", buffer, theStpTiefgarage, (this.stpTiefgarage!= null));
        }
        {
            List<StpSonstige> theStpSonstige;
            theStpSonstige = (((this.stpSonstige!= null)&&(!this.stpSonstige.isEmpty()))?this.getStpSonstige():null);
            strategy.appendField(locator, this, "stpSonstige", buffer, theStpSonstige, ((this.stpSonstige!= null)&&(!this.stpSonstige.isEmpty())));
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

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Preise) {
            final Preise copy = ((Preise) draftCopy);
            {
                Boolean kaufpreisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kaufpreis!= null));
                if (kaufpreisShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceKaufpreis;
                    sourceKaufpreis = this.getKaufpreis();
                    BigDecimal copyKaufpreis = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "kaufpreis", sourceKaufpreis), sourceKaufpreis, (this.kaufpreis!= null)));
                    copy.setKaufpreis(copyKaufpreis);
                } else {
                    if (kaufpreisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kaufpreis = null;
                    }
                }
            }
            {
                Boolean nettokaltmieteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nettokaltmiete!= null));
                if (nettokaltmieteShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceNettokaltmiete;
                    sourceNettokaltmiete = this.getNettokaltmiete();
                    BigDecimal copyNettokaltmiete = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "nettokaltmiete", sourceNettokaltmiete), sourceNettokaltmiete, (this.nettokaltmiete!= null)));
                    copy.setNettokaltmiete(copyNettokaltmiete);
                } else {
                    if (nettokaltmieteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nettokaltmiete = null;
                    }
                }
            }
            {
                Boolean kaltmieteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kaltmiete!= null));
                if (kaltmieteShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceKaltmiete;
                    sourceKaltmiete = this.getKaltmiete();
                    BigDecimal copyKaltmiete = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "kaltmiete", sourceKaltmiete), sourceKaltmiete, (this.kaltmiete!= null)));
                    copy.setKaltmiete(copyKaltmiete);
                } else {
                    if (kaltmieteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kaltmiete = null;
                    }
                }
            }
            {
                Boolean warmmieteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.warmmiete!= null));
                if (warmmieteShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceWarmmiete;
                    sourceWarmmiete = this.getWarmmiete();
                    BigDecimal copyWarmmiete = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "warmmiete", sourceWarmmiete), sourceWarmmiete, (this.warmmiete!= null)));
                    copy.setWarmmiete(copyWarmmiete);
                } else {
                    if (warmmieteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.warmmiete = null;
                    }
                }
            }
            {
                Boolean nebenkostenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nebenkosten!= null));
                if (nebenkostenShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceNebenkosten;
                    sourceNebenkosten = this.getNebenkosten();
                    BigDecimal copyNebenkosten = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "nebenkosten", sourceNebenkosten), sourceNebenkosten, (this.nebenkosten!= null)));
                    copy.setNebenkosten(copyNebenkosten);
                } else {
                    if (nebenkostenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nebenkosten = null;
                    }
                }
            }
            {
                Boolean heizkostenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.heizkosten!= null));
                if (heizkostenShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceHeizkosten;
                    sourceHeizkosten = this.getHeizkosten();
                    BigDecimal copyHeizkosten = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "heizkosten", sourceHeizkosten), sourceHeizkosten, (this.heizkosten!= null)));
                    copy.setHeizkosten(copyHeizkosten);
                } else {
                    if (heizkostenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.heizkosten = null;
                    }
                }
            }
            {
                Boolean zzgMehrwertsteuerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zzgMehrwertsteuer!= null));
                if (zzgMehrwertsteuerShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceZzgMehrwertsteuer;
                    sourceZzgMehrwertsteuer = this.getZzgMehrwertsteuer();
                    Boolean copyZzgMehrwertsteuer = ((Boolean) strategy.copy(LocatorUtils.property(locator, "zzgMehrwertsteuer", sourceZzgMehrwertsteuer), sourceZzgMehrwertsteuer, (this.zzgMehrwertsteuer!= null)));
                    copy.setZzgMehrwertsteuer(copyZzgMehrwertsteuer);
                } else {
                    if (zzgMehrwertsteuerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zzgMehrwertsteuer = null;
                    }
                }
            }
            {
                Boolean mietzuschlaegeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mietzuschlaege!= null));
                if (mietzuschlaegeShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceMietzuschlaege;
                    sourceMietzuschlaege = this.getMietzuschlaege();
                    BigDecimal copyMietzuschlaege = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "mietzuschlaege", sourceMietzuschlaege), sourceMietzuschlaege, (this.mietzuschlaege!= null)));
                    copy.setMietzuschlaege(copyMietzuschlaege);
                } else {
                    if (mietzuschlaegeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mietzuschlaege = null;
                    }
                }
            }
            {
                Boolean pachtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pacht!= null));
                if (pachtShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourcePacht;
                    sourcePacht = this.getPacht();
                    BigDecimal copyPacht = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "pacht", sourcePacht), sourcePacht, (this.pacht!= null)));
                    copy.setPacht(copyPacht);
                } else {
                    if (pachtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pacht = null;
                    }
                }
            }
            {
                Boolean erbpachtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.erbpacht!= null));
                if (erbpachtShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceErbpacht;
                    sourceErbpacht = this.getErbpacht();
                    BigDecimal copyErbpacht = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "erbpacht", sourceErbpacht), sourceErbpacht, (this.erbpacht!= null)));
                    copy.setErbpacht(copyErbpacht);
                } else {
                    if (erbpachtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.erbpacht = null;
                    }
                }
            }
            {
                Boolean hausgeldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hausgeld!= null));
                if (hausgeldShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceHausgeld;
                    sourceHausgeld = this.getHausgeld();
                    BigDecimal copyHausgeld = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "hausgeld", sourceHausgeld), sourceHausgeld, (this.hausgeld!= null)));
                    copy.setHausgeld(copyHausgeld);
                } else {
                    if (hausgeldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hausgeld = null;
                    }
                }
            }
            {
                Boolean abstandShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.abstand!= null));
                if (abstandShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceAbstand;
                    sourceAbstand = this.getAbstand();
                    BigDecimal copyAbstand = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "abstand", sourceAbstand), sourceAbstand, (this.abstand!= null)));
                    copy.setAbstand(copyAbstand);
                } else {
                    if (abstandShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.abstand = null;
                    }
                }
            }
            {
                Boolean preisZeitraumVonShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.preisZeitraumVon!= null));
                if (preisZeitraumVonShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourcePreisZeitraumVon;
                    sourcePreisZeitraumVon = this.getPreisZeitraumVon();
                    Calendar copyPreisZeitraumVon = ((Calendar) strategy.copy(LocatorUtils.property(locator, "preisZeitraumVon", sourcePreisZeitraumVon), sourcePreisZeitraumVon, (this.preisZeitraumVon!= null)));
                    copy.setPreisZeitraumVon(copyPreisZeitraumVon);
                } else {
                    if (preisZeitraumVonShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.preisZeitraumVon = null;
                    }
                }
            }
            {
                Boolean preisZeitraumBisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.preisZeitraumBis!= null));
                if (preisZeitraumBisShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourcePreisZeitraumBis;
                    sourcePreisZeitraumBis = this.getPreisZeitraumBis();
                    Calendar copyPreisZeitraumBis = ((Calendar) strategy.copy(LocatorUtils.property(locator, "preisZeitraumBis", sourcePreisZeitraumBis), sourcePreisZeitraumBis, (this.preisZeitraumBis!= null)));
                    copy.setPreisZeitraumBis(copyPreisZeitraumBis);
                } else {
                    if (preisZeitraumBisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.preisZeitraumBis = null;
                    }
                }
            }
            {
                Boolean preisZeiteinheitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.preisZeiteinheit!= null));
                if (preisZeiteinheitShouldBeCopiedAndSet == Boolean.TRUE) {
                    PreisZeiteinheit sourcePreisZeiteinheit;
                    sourcePreisZeiteinheit = this.getPreisZeiteinheit();
                    PreisZeiteinheit copyPreisZeiteinheit = ((PreisZeiteinheit) strategy.copy(LocatorUtils.property(locator, "preisZeiteinheit", sourcePreisZeiteinheit), sourcePreisZeiteinheit, (this.preisZeiteinheit!= null)));
                    copy.setPreisZeiteinheit(copyPreisZeiteinheit);
                } else {
                    if (preisZeiteinheitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.preisZeiteinheit = null;
                    }
                }
            }
            {
                Boolean mietpreisProQmShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mietpreisProQm!= null));
                if (mietpreisProQmShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceMietpreisProQm;
                    sourceMietpreisProQm = this.getMietpreisProQm();
                    BigDecimal copyMietpreisProQm = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "mietpreisProQm", sourceMietpreisProQm), sourceMietpreisProQm, (this.mietpreisProQm!= null)));
                    copy.setMietpreisProQm(copyMietpreisProQm);
                } else {
                    if (mietpreisProQmShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mietpreisProQm = null;
                    }
                }
            }
            {
                Boolean kaufpreisProQmShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kaufpreisProQm!= null));
                if (kaufpreisProQmShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceKaufpreisProQm;
                    sourceKaufpreisProQm = this.getKaufpreisProQm();
                    BigDecimal copyKaufpreisProQm = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "kaufpreisProQm", sourceKaufpreisProQm), sourceKaufpreisProQm, (this.kaufpreisProQm!= null)));
                    copy.setKaufpreisProQm(copyKaufpreisProQm);
                } else {
                    if (kaufpreisProQmShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kaufpreisProQm = null;
                    }
                }
            }
            {
                Boolean innenCourtageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.innenCourtage!= null));
                if (innenCourtageShouldBeCopiedAndSet == Boolean.TRUE) {
                    InnenCourtage sourceInnenCourtage;
                    sourceInnenCourtage = this.getInnenCourtage();
                    InnenCourtage copyInnenCourtage = ((InnenCourtage) strategy.copy(LocatorUtils.property(locator, "innenCourtage", sourceInnenCourtage), sourceInnenCourtage, (this.innenCourtage!= null)));
                    copy.setInnenCourtage(copyInnenCourtage);
                } else {
                    if (innenCourtageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.innenCourtage = null;
                    }
                }
            }
            {
                Boolean aussenCourtageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.aussenCourtage!= null));
                if (aussenCourtageShouldBeCopiedAndSet == Boolean.TRUE) {
                    AussenCourtage sourceAussenCourtage;
                    sourceAussenCourtage = this.getAussenCourtage();
                    AussenCourtage copyAussenCourtage = ((AussenCourtage) strategy.copy(LocatorUtils.property(locator, "aussenCourtage", sourceAussenCourtage), sourceAussenCourtage, (this.aussenCourtage!= null)));
                    copy.setAussenCourtage(copyAussenCourtage);
                } else {
                    if (aussenCourtageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.aussenCourtage = null;
                    }
                }
            }
            {
                Boolean waehrungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.waehrung!= null));
                if (waehrungShouldBeCopiedAndSet == Boolean.TRUE) {
                    Waehrung sourceWaehrung;
                    sourceWaehrung = this.getWaehrung();
                    Waehrung copyWaehrung = ((Waehrung) strategy.copy(LocatorUtils.property(locator, "waehrung", sourceWaehrung), sourceWaehrung, (this.waehrung!= null)));
                    copy.setWaehrung(copyWaehrung);
                } else {
                    if (waehrungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.waehrung = null;
                    }
                }
            }
            {
                Boolean mwstSatzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mwstSatz!= null));
                if (mwstSatzShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceMwstSatz;
                    sourceMwstSatz = this.getMwstSatz();
                    BigDecimal copyMwstSatz = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "mwstSatz", sourceMwstSatz), sourceMwstSatz, (this.mwstSatz!= null)));
                    copy.setMwstSatz(copyMwstSatz);
                } else {
                    if (mwstSatzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mwstSatz = null;
                    }
                }
            }
            {
                Boolean freitextPreisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.freitextPreis!= null));
                if (freitextPreisShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFreitextPreis;
                    sourceFreitextPreis = this.getFreitextPreis();
                    String copyFreitextPreis = ((String) strategy.copy(LocatorUtils.property(locator, "freitextPreis", sourceFreitextPreis), sourceFreitextPreis, (this.freitextPreis!= null)));
                    copy.setFreitextPreis(copyFreitextPreis);
                } else {
                    if (freitextPreisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.freitextPreis = null;
                    }
                }
            }
            {
                Boolean xFacheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.xFache!= null));
                if (xFacheShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceXFache;
                    sourceXFache = this.getXFache();
                    String copyXFache = ((String) strategy.copy(LocatorUtils.property(locator, "xFache", sourceXFache), sourceXFache, (this.xFache!= null)));
                    copy.setXFache(copyXFache);
                } else {
                    if (xFacheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.xFache = null;
                    }
                }
            }
            {
                Boolean nettorenditeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nettorendite!= null));
                if (nettorenditeShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceNettorendite;
                    sourceNettorendite = this.getNettorendite();
                    BigDecimal copyNettorendite = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "nettorendite", sourceNettorendite), sourceNettorendite, (this.nettorendite!= null)));
                    copy.setNettorendite(copyNettorendite);
                } else {
                    if (nettorenditeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nettorendite = null;
                    }
                }
            }
            {
                Boolean mieteinnahmenIstShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mieteinnahmenIst!= null));
                if (mieteinnahmenIstShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceMieteinnahmenIst;
                    sourceMieteinnahmenIst = this.getMieteinnahmenIst();
                    BigDecimal copyMieteinnahmenIst = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "mieteinnahmenIst", sourceMieteinnahmenIst), sourceMieteinnahmenIst, (this.mieteinnahmenIst!= null)));
                    copy.setMieteinnahmenIst(copyMieteinnahmenIst);
                } else {
                    if (mieteinnahmenIstShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mieteinnahmenIst = null;
                    }
                }
            }
            {
                Boolean mieteinnahmenSollShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mieteinnahmenSoll!= null));
                if (mieteinnahmenSollShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceMieteinnahmenSoll;
                    sourceMieteinnahmenSoll = this.getMieteinnahmenSoll();
                    BigDecimal copyMieteinnahmenSoll = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "mieteinnahmenSoll", sourceMieteinnahmenSoll), sourceMieteinnahmenSoll, (this.mieteinnahmenSoll!= null)));
                    copy.setMieteinnahmenSoll(copyMieteinnahmenSoll);
                } else {
                    if (mieteinnahmenSollShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mieteinnahmenSoll = null;
                    }
                }
            }
            {
                Boolean erschliessungskostenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.erschliessungskosten!= null));
                if (erschliessungskostenShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceErschliessungskosten;
                    sourceErschliessungskosten = this.getErschliessungskosten();
                    BigDecimal copyErschliessungskosten = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "erschliessungskosten", sourceErschliessungskosten), sourceErschliessungskosten, (this.erschliessungskosten!= null)));
                    copy.setErschliessungskosten(copyErschliessungskosten);
                } else {
                    if (erschliessungskostenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.erschliessungskosten = null;
                    }
                }
            }
            {
                Boolean kautionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kaution!= null));
                if (kautionShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceKaution;
                    sourceKaution = this.getKaution();
                    BigDecimal copyKaution = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "kaution", sourceKaution), sourceKaution, (this.kaution!= null)));
                    copy.setKaution(copyKaution);
                } else {
                    if (kautionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kaution = null;
                    }
                }
            }
            {
                Boolean geschaeftsguthabenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.geschaeftsguthaben!= null));
                if (geschaeftsguthabenShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceGeschaeftsguthaben;
                    sourceGeschaeftsguthaben = this.getGeschaeftsguthaben();
                    BigDecimal copyGeschaeftsguthaben = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "geschaeftsguthaben", sourceGeschaeftsguthaben), sourceGeschaeftsguthaben, (this.geschaeftsguthaben!= null)));
                    copy.setGeschaeftsguthaben(copyGeschaeftsguthaben);
                } else {
                    if (geschaeftsguthabenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geschaeftsguthaben = null;
                    }
                }
            }
            {
                Boolean stpCarportShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.stpCarport!= null));
                if (stpCarportShouldBeCopiedAndSet == Boolean.TRUE) {
                    Stellplatz sourceStpCarport;
                    sourceStpCarport = this.getStpCarport();
                    Stellplatz copyStpCarport = ((Stellplatz) strategy.copy(LocatorUtils.property(locator, "stpCarport", sourceStpCarport), sourceStpCarport, (this.stpCarport!= null)));
                    copy.setStpCarport(copyStpCarport);
                } else {
                    if (stpCarportShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.stpCarport = null;
                    }
                }
            }
            {
                Boolean stpDuplexShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.stpDuplex!= null));
                if (stpDuplexShouldBeCopiedAndSet == Boolean.TRUE) {
                    Stellplatz sourceStpDuplex;
                    sourceStpDuplex = this.getStpDuplex();
                    Stellplatz copyStpDuplex = ((Stellplatz) strategy.copy(LocatorUtils.property(locator, "stpDuplex", sourceStpDuplex), sourceStpDuplex, (this.stpDuplex!= null)));
                    copy.setStpDuplex(copyStpDuplex);
                } else {
                    if (stpDuplexShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.stpDuplex = null;
                    }
                }
            }
            {
                Boolean stpFreiplatzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.stpFreiplatz!= null));
                if (stpFreiplatzShouldBeCopiedAndSet == Boolean.TRUE) {
                    Stellplatz sourceStpFreiplatz;
                    sourceStpFreiplatz = this.getStpFreiplatz();
                    Stellplatz copyStpFreiplatz = ((Stellplatz) strategy.copy(LocatorUtils.property(locator, "stpFreiplatz", sourceStpFreiplatz), sourceStpFreiplatz, (this.stpFreiplatz!= null)));
                    copy.setStpFreiplatz(copyStpFreiplatz);
                } else {
                    if (stpFreiplatzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.stpFreiplatz = null;
                    }
                }
            }
            {
                Boolean stpGarageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.stpGarage!= null));
                if (stpGarageShouldBeCopiedAndSet == Boolean.TRUE) {
                    Stellplatz sourceStpGarage;
                    sourceStpGarage = this.getStpGarage();
                    Stellplatz copyStpGarage = ((Stellplatz) strategy.copy(LocatorUtils.property(locator, "stpGarage", sourceStpGarage), sourceStpGarage, (this.stpGarage!= null)));
                    copy.setStpGarage(copyStpGarage);
                } else {
                    if (stpGarageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.stpGarage = null;
                    }
                }
            }
            {
                Boolean stpParkhausShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.stpParkhaus!= null));
                if (stpParkhausShouldBeCopiedAndSet == Boolean.TRUE) {
                    Stellplatz sourceStpParkhaus;
                    sourceStpParkhaus = this.getStpParkhaus();
                    Stellplatz copyStpParkhaus = ((Stellplatz) strategy.copy(LocatorUtils.property(locator, "stpParkhaus", sourceStpParkhaus), sourceStpParkhaus, (this.stpParkhaus!= null)));
                    copy.setStpParkhaus(copyStpParkhaus);
                } else {
                    if (stpParkhausShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.stpParkhaus = null;
                    }
                }
            }
            {
                Boolean stpTiefgarageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.stpTiefgarage!= null));
                if (stpTiefgarageShouldBeCopiedAndSet == Boolean.TRUE) {
                    Stellplatz sourceStpTiefgarage;
                    sourceStpTiefgarage = this.getStpTiefgarage();
                    Stellplatz copyStpTiefgarage = ((Stellplatz) strategy.copy(LocatorUtils.property(locator, "stpTiefgarage", sourceStpTiefgarage), sourceStpTiefgarage, (this.stpTiefgarage!= null)));
                    copy.setStpTiefgarage(copyStpTiefgarage);
                } else {
                    if (stpTiefgarageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.stpTiefgarage = null;
                    }
                }
            }
            {
                Boolean stpSonstigeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.stpSonstige!= null)&&(!this.stpSonstige.isEmpty())));
                if (stpSonstigeShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<StpSonstige> sourceStpSonstige;
                    sourceStpSonstige = (((this.stpSonstige!= null)&&(!this.stpSonstige.isEmpty()))?this.getStpSonstige():null);
                    @SuppressWarnings("unchecked")
                    List<StpSonstige> copyStpSonstige = ((List<StpSonstige> ) strategy.copy(LocatorUtils.property(locator, "stpSonstige", sourceStpSonstige), sourceStpSonstige, ((this.stpSonstige!= null)&&(!this.stpSonstige.isEmpty()))));
                    copy.stpSonstige = null;
                    if (copyStpSonstige!= null) {
                        List<StpSonstige> uniqueStpSonstigel = copy.getStpSonstige();
                        uniqueStpSonstigel.addAll(copyStpSonstige);
                    }
                } else {
                    if (stpSonstigeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.stpSonstige = null;
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

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Preise();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Preise that = ((Preise) object);
        {
            BigDecimal lhsKaufpreis;
            lhsKaufpreis = this.getKaufpreis();
            BigDecimal rhsKaufpreis;
            rhsKaufpreis = that.getKaufpreis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kaufpreis", lhsKaufpreis), LocatorUtils.property(thatLocator, "kaufpreis", rhsKaufpreis), lhsKaufpreis, rhsKaufpreis, (this.kaufpreis!= null), (that.kaufpreis!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsNettokaltmiete;
            lhsNettokaltmiete = this.getNettokaltmiete();
            BigDecimal rhsNettokaltmiete;
            rhsNettokaltmiete = that.getNettokaltmiete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nettokaltmiete", lhsNettokaltmiete), LocatorUtils.property(thatLocator, "nettokaltmiete", rhsNettokaltmiete), lhsNettokaltmiete, rhsNettokaltmiete, (this.nettokaltmiete!= null), (that.nettokaltmiete!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsKaltmiete;
            lhsKaltmiete = this.getKaltmiete();
            BigDecimal rhsKaltmiete;
            rhsKaltmiete = that.getKaltmiete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kaltmiete", lhsKaltmiete), LocatorUtils.property(thatLocator, "kaltmiete", rhsKaltmiete), lhsKaltmiete, rhsKaltmiete, (this.kaltmiete!= null), (that.kaltmiete!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsWarmmiete;
            lhsWarmmiete = this.getWarmmiete();
            BigDecimal rhsWarmmiete;
            rhsWarmmiete = that.getWarmmiete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warmmiete", lhsWarmmiete), LocatorUtils.property(thatLocator, "warmmiete", rhsWarmmiete), lhsWarmmiete, rhsWarmmiete, (this.warmmiete!= null), (that.warmmiete!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsNebenkosten;
            lhsNebenkosten = this.getNebenkosten();
            BigDecimal rhsNebenkosten;
            rhsNebenkosten = that.getNebenkosten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nebenkosten", lhsNebenkosten), LocatorUtils.property(thatLocator, "nebenkosten", rhsNebenkosten), lhsNebenkosten, rhsNebenkosten, (this.nebenkosten!= null), (that.nebenkosten!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsHeizkosten;
            lhsHeizkosten = this.getHeizkosten();
            BigDecimal rhsHeizkosten;
            rhsHeizkosten = that.getHeizkosten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heizkosten", lhsHeizkosten), LocatorUtils.property(thatLocator, "heizkosten", rhsHeizkosten), lhsHeizkosten, rhsHeizkosten, (this.heizkosten!= null), (that.heizkosten!= null))) {
                return false;
            }
        }
        {
            Boolean lhsZzgMehrwertsteuer;
            lhsZzgMehrwertsteuer = this.getZzgMehrwertsteuer();
            Boolean rhsZzgMehrwertsteuer;
            rhsZzgMehrwertsteuer = that.getZzgMehrwertsteuer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zzgMehrwertsteuer", lhsZzgMehrwertsteuer), LocatorUtils.property(thatLocator, "zzgMehrwertsteuer", rhsZzgMehrwertsteuer), lhsZzgMehrwertsteuer, rhsZzgMehrwertsteuer, (this.zzgMehrwertsteuer!= null), (that.zzgMehrwertsteuer!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsMietzuschlaege;
            lhsMietzuschlaege = this.getMietzuschlaege();
            BigDecimal rhsMietzuschlaege;
            rhsMietzuschlaege = that.getMietzuschlaege();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mietzuschlaege", lhsMietzuschlaege), LocatorUtils.property(thatLocator, "mietzuschlaege", rhsMietzuschlaege), lhsMietzuschlaege, rhsMietzuschlaege, (this.mietzuschlaege!= null), (that.mietzuschlaege!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsPacht;
            lhsPacht = this.getPacht();
            BigDecimal rhsPacht;
            rhsPacht = that.getPacht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pacht", lhsPacht), LocatorUtils.property(thatLocator, "pacht", rhsPacht), lhsPacht, rhsPacht, (this.pacht!= null), (that.pacht!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsErbpacht;
            lhsErbpacht = this.getErbpacht();
            BigDecimal rhsErbpacht;
            rhsErbpacht = that.getErbpacht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erbpacht", lhsErbpacht), LocatorUtils.property(thatLocator, "erbpacht", rhsErbpacht), lhsErbpacht, rhsErbpacht, (this.erbpacht!= null), (that.erbpacht!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsHausgeld;
            lhsHausgeld = this.getHausgeld();
            BigDecimal rhsHausgeld;
            rhsHausgeld = that.getHausgeld();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hausgeld", lhsHausgeld), LocatorUtils.property(thatLocator, "hausgeld", rhsHausgeld), lhsHausgeld, rhsHausgeld, (this.hausgeld!= null), (that.hausgeld!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsAbstand;
            lhsAbstand = this.getAbstand();
            BigDecimal rhsAbstand;
            rhsAbstand = that.getAbstand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abstand", lhsAbstand), LocatorUtils.property(thatLocator, "abstand", rhsAbstand), lhsAbstand, rhsAbstand, (this.abstand!= null), (that.abstand!= null))) {
                return false;
            }
        }
        {
            Calendar lhsPreisZeitraumVon;
            lhsPreisZeitraumVon = this.getPreisZeitraumVon();
            Calendar rhsPreisZeitraumVon;
            rhsPreisZeitraumVon = that.getPreisZeitraumVon();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preisZeitraumVon", lhsPreisZeitraumVon), LocatorUtils.property(thatLocator, "preisZeitraumVon", rhsPreisZeitraumVon), lhsPreisZeitraumVon, rhsPreisZeitraumVon, (this.preisZeitraumVon!= null), (that.preisZeitraumVon!= null))) {
                return false;
            }
        }
        {
            Calendar lhsPreisZeitraumBis;
            lhsPreisZeitraumBis = this.getPreisZeitraumBis();
            Calendar rhsPreisZeitraumBis;
            rhsPreisZeitraumBis = that.getPreisZeitraumBis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preisZeitraumBis", lhsPreisZeitraumBis), LocatorUtils.property(thatLocator, "preisZeitraumBis", rhsPreisZeitraumBis), lhsPreisZeitraumBis, rhsPreisZeitraumBis, (this.preisZeitraumBis!= null), (that.preisZeitraumBis!= null))) {
                return false;
            }
        }
        {
            PreisZeiteinheit lhsPreisZeiteinheit;
            lhsPreisZeiteinheit = this.getPreisZeiteinheit();
            PreisZeiteinheit rhsPreisZeiteinheit;
            rhsPreisZeiteinheit = that.getPreisZeiteinheit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preisZeiteinheit", lhsPreisZeiteinheit), LocatorUtils.property(thatLocator, "preisZeiteinheit", rhsPreisZeiteinheit), lhsPreisZeiteinheit, rhsPreisZeiteinheit, (this.preisZeiteinheit!= null), (that.preisZeiteinheit!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsMietpreisProQm;
            lhsMietpreisProQm = this.getMietpreisProQm();
            BigDecimal rhsMietpreisProQm;
            rhsMietpreisProQm = that.getMietpreisProQm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mietpreisProQm", lhsMietpreisProQm), LocatorUtils.property(thatLocator, "mietpreisProQm", rhsMietpreisProQm), lhsMietpreisProQm, rhsMietpreisProQm, (this.mietpreisProQm!= null), (that.mietpreisProQm!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsKaufpreisProQm;
            lhsKaufpreisProQm = this.getKaufpreisProQm();
            BigDecimal rhsKaufpreisProQm;
            rhsKaufpreisProQm = that.getKaufpreisProQm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kaufpreisProQm", lhsKaufpreisProQm), LocatorUtils.property(thatLocator, "kaufpreisProQm", rhsKaufpreisProQm), lhsKaufpreisProQm, rhsKaufpreisProQm, (this.kaufpreisProQm!= null), (that.kaufpreisProQm!= null))) {
                return false;
            }
        }
        {
            InnenCourtage lhsInnenCourtage;
            lhsInnenCourtage = this.getInnenCourtage();
            InnenCourtage rhsInnenCourtage;
            rhsInnenCourtage = that.getInnenCourtage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "innenCourtage", lhsInnenCourtage), LocatorUtils.property(thatLocator, "innenCourtage", rhsInnenCourtage), lhsInnenCourtage, rhsInnenCourtage, (this.innenCourtage!= null), (that.innenCourtage!= null))) {
                return false;
            }
        }
        {
            AussenCourtage lhsAussenCourtage;
            lhsAussenCourtage = this.getAussenCourtage();
            AussenCourtage rhsAussenCourtage;
            rhsAussenCourtage = that.getAussenCourtage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aussenCourtage", lhsAussenCourtage), LocatorUtils.property(thatLocator, "aussenCourtage", rhsAussenCourtage), lhsAussenCourtage, rhsAussenCourtage, (this.aussenCourtage!= null), (that.aussenCourtage!= null))) {
                return false;
            }
        }
        {
            Waehrung lhsWaehrung;
            lhsWaehrung = this.getWaehrung();
            Waehrung rhsWaehrung;
            rhsWaehrung = that.getWaehrung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waehrung", lhsWaehrung), LocatorUtils.property(thatLocator, "waehrung", rhsWaehrung), lhsWaehrung, rhsWaehrung, (this.waehrung!= null), (that.waehrung!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsMwstSatz;
            lhsMwstSatz = this.getMwstSatz();
            BigDecimal rhsMwstSatz;
            rhsMwstSatz = that.getMwstSatz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mwstSatz", lhsMwstSatz), LocatorUtils.property(thatLocator, "mwstSatz", rhsMwstSatz), lhsMwstSatz, rhsMwstSatz, (this.mwstSatz!= null), (that.mwstSatz!= null))) {
                return false;
            }
        }
        {
            String lhsFreitextPreis;
            lhsFreitextPreis = this.getFreitextPreis();
            String rhsFreitextPreis;
            rhsFreitextPreis = that.getFreitextPreis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freitextPreis", lhsFreitextPreis), LocatorUtils.property(thatLocator, "freitextPreis", rhsFreitextPreis), lhsFreitextPreis, rhsFreitextPreis, (this.freitextPreis!= null), (that.freitextPreis!= null))) {
                return false;
            }
        }
        {
            String lhsXFache;
            lhsXFache = this.getXFache();
            String rhsXFache;
            rhsXFache = that.getXFache();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "xFache", lhsXFache), LocatorUtils.property(thatLocator, "xFache", rhsXFache), lhsXFache, rhsXFache, (this.xFache!= null), (that.xFache!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsNettorendite;
            lhsNettorendite = this.getNettorendite();
            BigDecimal rhsNettorendite;
            rhsNettorendite = that.getNettorendite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nettorendite", lhsNettorendite), LocatorUtils.property(thatLocator, "nettorendite", rhsNettorendite), lhsNettorendite, rhsNettorendite, (this.nettorendite!= null), (that.nettorendite!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsMieteinnahmenIst;
            lhsMieteinnahmenIst = this.getMieteinnahmenIst();
            BigDecimal rhsMieteinnahmenIst;
            rhsMieteinnahmenIst = that.getMieteinnahmenIst();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mieteinnahmenIst", lhsMieteinnahmenIst), LocatorUtils.property(thatLocator, "mieteinnahmenIst", rhsMieteinnahmenIst), lhsMieteinnahmenIst, rhsMieteinnahmenIst, (this.mieteinnahmenIst!= null), (that.mieteinnahmenIst!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsMieteinnahmenSoll;
            lhsMieteinnahmenSoll = this.getMieteinnahmenSoll();
            BigDecimal rhsMieteinnahmenSoll;
            rhsMieteinnahmenSoll = that.getMieteinnahmenSoll();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mieteinnahmenSoll", lhsMieteinnahmenSoll), LocatorUtils.property(thatLocator, "mieteinnahmenSoll", rhsMieteinnahmenSoll), lhsMieteinnahmenSoll, rhsMieteinnahmenSoll, (this.mieteinnahmenSoll!= null), (that.mieteinnahmenSoll!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsErschliessungskosten;
            lhsErschliessungskosten = this.getErschliessungskosten();
            BigDecimal rhsErschliessungskosten;
            rhsErschliessungskosten = that.getErschliessungskosten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erschliessungskosten", lhsErschliessungskosten), LocatorUtils.property(thatLocator, "erschliessungskosten", rhsErschliessungskosten), lhsErschliessungskosten, rhsErschliessungskosten, (this.erschliessungskosten!= null), (that.erschliessungskosten!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsKaution;
            lhsKaution = this.getKaution();
            BigDecimal rhsKaution;
            rhsKaution = that.getKaution();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kaution", lhsKaution), LocatorUtils.property(thatLocator, "kaution", rhsKaution), lhsKaution, rhsKaution, (this.kaution!= null), (that.kaution!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsGeschaeftsguthaben;
            lhsGeschaeftsguthaben = this.getGeschaeftsguthaben();
            BigDecimal rhsGeschaeftsguthaben;
            rhsGeschaeftsguthaben = that.getGeschaeftsguthaben();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geschaeftsguthaben", lhsGeschaeftsguthaben), LocatorUtils.property(thatLocator, "geschaeftsguthaben", rhsGeschaeftsguthaben), lhsGeschaeftsguthaben, rhsGeschaeftsguthaben, (this.geschaeftsguthaben!= null), (that.geschaeftsguthaben!= null))) {
                return false;
            }
        }
        {
            Stellplatz lhsStpCarport;
            lhsStpCarport = this.getStpCarport();
            Stellplatz rhsStpCarport;
            rhsStpCarport = that.getStpCarport();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stpCarport", lhsStpCarport), LocatorUtils.property(thatLocator, "stpCarport", rhsStpCarport), lhsStpCarport, rhsStpCarport, (this.stpCarport!= null), (that.stpCarport!= null))) {
                return false;
            }
        }
        {
            Stellplatz lhsStpDuplex;
            lhsStpDuplex = this.getStpDuplex();
            Stellplatz rhsStpDuplex;
            rhsStpDuplex = that.getStpDuplex();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stpDuplex", lhsStpDuplex), LocatorUtils.property(thatLocator, "stpDuplex", rhsStpDuplex), lhsStpDuplex, rhsStpDuplex, (this.stpDuplex!= null), (that.stpDuplex!= null))) {
                return false;
            }
        }
        {
            Stellplatz lhsStpFreiplatz;
            lhsStpFreiplatz = this.getStpFreiplatz();
            Stellplatz rhsStpFreiplatz;
            rhsStpFreiplatz = that.getStpFreiplatz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stpFreiplatz", lhsStpFreiplatz), LocatorUtils.property(thatLocator, "stpFreiplatz", rhsStpFreiplatz), lhsStpFreiplatz, rhsStpFreiplatz, (this.stpFreiplatz!= null), (that.stpFreiplatz!= null))) {
                return false;
            }
        }
        {
            Stellplatz lhsStpGarage;
            lhsStpGarage = this.getStpGarage();
            Stellplatz rhsStpGarage;
            rhsStpGarage = that.getStpGarage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stpGarage", lhsStpGarage), LocatorUtils.property(thatLocator, "stpGarage", rhsStpGarage), lhsStpGarage, rhsStpGarage, (this.stpGarage!= null), (that.stpGarage!= null))) {
                return false;
            }
        }
        {
            Stellplatz lhsStpParkhaus;
            lhsStpParkhaus = this.getStpParkhaus();
            Stellplatz rhsStpParkhaus;
            rhsStpParkhaus = that.getStpParkhaus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stpParkhaus", lhsStpParkhaus), LocatorUtils.property(thatLocator, "stpParkhaus", rhsStpParkhaus), lhsStpParkhaus, rhsStpParkhaus, (this.stpParkhaus!= null), (that.stpParkhaus!= null))) {
                return false;
            }
        }
        {
            Stellplatz lhsStpTiefgarage;
            lhsStpTiefgarage = this.getStpTiefgarage();
            Stellplatz rhsStpTiefgarage;
            rhsStpTiefgarage = that.getStpTiefgarage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stpTiefgarage", lhsStpTiefgarage), LocatorUtils.property(thatLocator, "stpTiefgarage", rhsStpTiefgarage), lhsStpTiefgarage, rhsStpTiefgarage, (this.stpTiefgarage!= null), (that.stpTiefgarage!= null))) {
                return false;
            }
        }
        {
            List<StpSonstige> lhsStpSonstige;
            lhsStpSonstige = (((this.stpSonstige!= null)&&(!this.stpSonstige.isEmpty()))?this.getStpSonstige():null);
            List<StpSonstige> rhsStpSonstige;
            rhsStpSonstige = (((that.stpSonstige!= null)&&(!that.stpSonstige.isEmpty()))?that.getStpSonstige():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stpSonstige", lhsStpSonstige), LocatorUtils.property(thatLocator, "stpSonstige", rhsStpSonstige), lhsStpSonstige, rhsStpSonstige, ((this.stpSonstige!= null)&&(!this.stpSonstige.isEmpty())), ((that.stpSonstige!= null)&&(!that.stpSonstige.isEmpty())))) {
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

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }

}
