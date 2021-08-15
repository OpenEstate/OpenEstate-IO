
package org.openestate.io.immoxml.xml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 * Java class for &lt;weitere_adresse&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vorname",
    "name",
    "titel",
    "anrede",
    "anredeBrief",
    "firma",
    "zusatzfeld",
    "strasse",
    "hausnummer",
    "plz",
    "ort",
    "postfach",
    "postfPlz",
    "postfOrt",
    "land",
    "emailZentrale",
    "emailDirekt",
    "emailPrivat",
    "emailSonstige",
    "telDurchw",
    "telZentrale",
    "telHandy",
    "telFax",
    "telPrivat",
    "telSonstige",
    "url",
    "adressfreigabe",
    "personennummer",
    "freitextfeld",
    "userDefinedSimplefield",
    "userDefinedAnyfield"
})
@XmlRootElement(name = "weitere_adresse")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
public class WeitereAdresse implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String vorname;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String name;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String titel;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String anrede;
    @XmlElement(name = "anrede_brief")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String anredeBrief;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String firma;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Object zusatzfeld;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String strasse;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String hausnummer;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String plz;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String ort;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String postfach;
    @XmlElement(name = "postf_plz")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String postfPlz;
    @XmlElement(name = "postf_ort")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String postfOrt;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Land land;
    @XmlElement(name = "email_zentrale")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String emailZentrale;
    @XmlElement(name = "email_direkt")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String emailDirekt;
    @XmlElement(name = "email_privat")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String emailPrivat;
    @XmlElement(name = "email_sonstige")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected List<EmailSonstige> emailSonstige;
    @XmlElement(name = "tel_durchw")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String telDurchw;
    @XmlElement(name = "tel_zentrale")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String telZentrale;
    @XmlElement(name = "tel_handy")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String telHandy;
    @XmlElement(name = "tel_fax")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String telFax;
    @XmlElement(name = "tel_privat")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String telPrivat;
    @XmlElement(name = "tel_sonstige")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected List<TelSonstige> telSonstige;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String url;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean adressfreigabe;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String personennummer;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String freitextfeld;
    @XmlElement(name = "user_defined_simplefield")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected List<UserDefinedSimplefield> userDefinedSimplefield;
    @XmlElement(name = "user_defined_anyfield")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected List<UserDefinedAnyfield> userDefinedAnyfield;
    @XmlAttribute(name = "adressart", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String adressart;

    /**
     * Gets the value of the vorname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String getVorname() {
        return vorname;
    }

    /**
     * Sets the value of the vorname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setVorname(String value) {
        this.vorname = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the titel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String getTitel() {
        return titel;
    }

    /**
     * Sets the value of the titel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setTitel(String value) {
        this.titel = value;
    }

    /**
     * Gets the value of the anrede property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String getAnrede() {
        return anrede;
    }

    /**
     * Sets the value of the anrede property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setAnrede(String value) {
        this.anrede = value;
    }

    /**
     * Gets the value of the anredeBrief property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String getAnredeBrief() {
        return anredeBrief;
    }

    /**
     * Sets the value of the anredeBrief property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setAnredeBrief(String value) {
        this.anredeBrief = value;
    }

    /**
     * Gets the value of the firma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String getFirma() {
        return firma;
    }

    /**
     * Sets the value of the firma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setFirma(String value) {
        this.firma = value;
    }

    /**
     * Gets the value of the zusatzfeld property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object getZusatzfeld() {
        return zusatzfeld;
    }

    /**
     * Sets the value of the zusatzfeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setZusatzfeld(Object value) {
        this.zusatzfeld = value;
    }

    /**
     * Gets the value of the strasse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String getStrasse() {
        return strasse;
    }

    /**
     * Sets the value of the strasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setStrasse(String value) {
        this.strasse = value;
    }

    /**
     * Gets the value of the hausnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String getHausnummer() {
        return hausnummer;
    }

    /**
     * Sets the value of the hausnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setHausnummer(String value) {
        this.hausnummer = value;
    }

    /**
     * Gets the value of the plz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String getPlz() {
        return plz;
    }

    /**
     * Sets the value of the plz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setPlz(String value) {
        this.plz = value;
    }

    /**
     * Gets the value of the ort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String getOrt() {
        return ort;
    }

    /**
     * Sets the value of the ort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setOrt(String value) {
        this.ort = value;
    }

    /**
     * Gets the value of the postfach property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String getPostfach() {
        return postfach;
    }

    /**
     * Sets the value of the postfach property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setPostfach(String value) {
        this.postfach = value;
    }

    /**
     * Gets the value of the postfPlz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String getPostfPlz() {
        return postfPlz;
    }

    /**
     * Sets the value of the postfPlz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setPostfPlz(String value) {
        this.postfPlz = value;
    }

    /**
     * Gets the value of the postfOrt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String getPostfOrt() {
        return postfOrt;
    }

    /**
     * Sets the value of the postfOrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setPostfOrt(String value) {
        this.postfOrt = value;
    }

    /**
     * Gets the value of the land property.
     * 
     * @return
     *     possible object is
     *     {@link Land }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Land getLand() {
        return land;
    }

    /**
     * Sets the value of the land property.
     * 
     * @param value
     *     allowed object is
     *     {@link Land }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setLand(Land value) {
        this.land = value;
    }

    /**
     * Gets the value of the emailZentrale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String getEmailZentrale() {
        return emailZentrale;
    }

    /**
     * Sets the value of the emailZentrale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setEmailZentrale(String value) {
        this.emailZentrale = value;
    }

    /**
     * Gets the value of the emailDirekt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String getEmailDirekt() {
        return emailDirekt;
    }

    /**
     * Sets the value of the emailDirekt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setEmailDirekt(String value) {
        this.emailDirekt = value;
    }

    /**
     * Gets the value of the emailPrivat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String getEmailPrivat() {
        return emailPrivat;
    }

    /**
     * Sets the value of the emailPrivat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setEmailPrivat(String value) {
        this.emailPrivat = value;
    }

    /**
     * Gets the value of the emailSonstige property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailSonstige property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailSonstige().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailSonstige }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public List<EmailSonstige> getEmailSonstige() {
        if (emailSonstige == null) {
            emailSonstige = new ArrayList<EmailSonstige>();
        }
        return this.emailSonstige;
    }

    /**
     * Gets the value of the telDurchw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String getTelDurchw() {
        return telDurchw;
    }

    /**
     * Sets the value of the telDurchw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setTelDurchw(String value) {
        this.telDurchw = value;
    }

    /**
     * Gets the value of the telZentrale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String getTelZentrale() {
        return telZentrale;
    }

    /**
     * Sets the value of the telZentrale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setTelZentrale(String value) {
        this.telZentrale = value;
    }

    /**
     * Gets the value of the telHandy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String getTelHandy() {
        return telHandy;
    }

    /**
     * Sets the value of the telHandy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setTelHandy(String value) {
        this.telHandy = value;
    }

    /**
     * Gets the value of the telFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String getTelFax() {
        return telFax;
    }

    /**
     * Sets the value of the telFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setTelFax(String value) {
        this.telFax = value;
    }

    /**
     * Gets the value of the telPrivat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String getTelPrivat() {
        return telPrivat;
    }

    /**
     * Sets the value of the telPrivat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setTelPrivat(String value) {
        this.telPrivat = value;
    }

    /**
     * Gets the value of the telSonstige property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telSonstige property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelSonstige().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TelSonstige }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public List<TelSonstige> getTelSonstige() {
        if (telSonstige == null) {
            telSonstige = new ArrayList<TelSonstige>();
        }
        return this.telSonstige;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the adressfreigabe property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getAdressfreigabe() {
        return adressfreigabe;
    }

    /**
     * Sets the value of the adressfreigabe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setAdressfreigabe(Boolean value) {
        this.adressfreigabe = value;
    }

    /**
     * Gets the value of the personennummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String getPersonennummer() {
        return personennummer;
    }

    /**
     * Sets the value of the personennummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setPersonennummer(String value) {
        this.personennummer = value;
    }

    /**
     * Gets the value of the freitextfeld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String getFreitextfeld() {
        return freitextfeld;
    }

    /**
     * Sets the value of the freitextfeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setFreitextfeld(String value) {
        this.freitextfeld = value;
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

    /**
     * Gets the value of the adressart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String getAdressart() {
        return adressart;
    }

    /**
     * Sets the value of the adressart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setAdressart(String value) {
        this.adressart = value;
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
            String theVorname;
            theVorname = this.getVorname();
            strategy.appendField(locator, this, "vorname", buffer, theVorname, (this.vorname!= null));
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            String theTitel;
            theTitel = this.getTitel();
            strategy.appendField(locator, this, "titel", buffer, theTitel, (this.titel!= null));
        }
        {
            String theAnrede;
            theAnrede = this.getAnrede();
            strategy.appendField(locator, this, "anrede", buffer, theAnrede, (this.anrede!= null));
        }
        {
            String theAnredeBrief;
            theAnredeBrief = this.getAnredeBrief();
            strategy.appendField(locator, this, "anredeBrief", buffer, theAnredeBrief, (this.anredeBrief!= null));
        }
        {
            String theFirma;
            theFirma = this.getFirma();
            strategy.appendField(locator, this, "firma", buffer, theFirma, (this.firma!= null));
        }
        {
            Object theZusatzfeld;
            theZusatzfeld = this.getZusatzfeld();
            strategy.appendField(locator, this, "zusatzfeld", buffer, theZusatzfeld, (this.zusatzfeld!= null));
        }
        {
            String theStrasse;
            theStrasse = this.getStrasse();
            strategy.appendField(locator, this, "strasse", buffer, theStrasse, (this.strasse!= null));
        }
        {
            String theHausnummer;
            theHausnummer = this.getHausnummer();
            strategy.appendField(locator, this, "hausnummer", buffer, theHausnummer, (this.hausnummer!= null));
        }
        {
            String thePlz;
            thePlz = this.getPlz();
            strategy.appendField(locator, this, "plz", buffer, thePlz, (this.plz!= null));
        }
        {
            String theOrt;
            theOrt = this.getOrt();
            strategy.appendField(locator, this, "ort", buffer, theOrt, (this.ort!= null));
        }
        {
            String thePostfach;
            thePostfach = this.getPostfach();
            strategy.appendField(locator, this, "postfach", buffer, thePostfach, (this.postfach!= null));
        }
        {
            String thePostfPlz;
            thePostfPlz = this.getPostfPlz();
            strategy.appendField(locator, this, "postfPlz", buffer, thePostfPlz, (this.postfPlz!= null));
        }
        {
            String thePostfOrt;
            thePostfOrt = this.getPostfOrt();
            strategy.appendField(locator, this, "postfOrt", buffer, thePostfOrt, (this.postfOrt!= null));
        }
        {
            Land theLand;
            theLand = this.getLand();
            strategy.appendField(locator, this, "land", buffer, theLand, (this.land!= null));
        }
        {
            String theEmailZentrale;
            theEmailZentrale = this.getEmailZentrale();
            strategy.appendField(locator, this, "emailZentrale", buffer, theEmailZentrale, (this.emailZentrale!= null));
        }
        {
            String theEmailDirekt;
            theEmailDirekt = this.getEmailDirekt();
            strategy.appendField(locator, this, "emailDirekt", buffer, theEmailDirekt, (this.emailDirekt!= null));
        }
        {
            String theEmailPrivat;
            theEmailPrivat = this.getEmailPrivat();
            strategy.appendField(locator, this, "emailPrivat", buffer, theEmailPrivat, (this.emailPrivat!= null));
        }
        {
            List<EmailSonstige> theEmailSonstige;
            theEmailSonstige = (((this.emailSonstige!= null)&&(!this.emailSonstige.isEmpty()))?this.getEmailSonstige():null);
            strategy.appendField(locator, this, "emailSonstige", buffer, theEmailSonstige, ((this.emailSonstige!= null)&&(!this.emailSonstige.isEmpty())));
        }
        {
            String theTelDurchw;
            theTelDurchw = this.getTelDurchw();
            strategy.appendField(locator, this, "telDurchw", buffer, theTelDurchw, (this.telDurchw!= null));
        }
        {
            String theTelZentrale;
            theTelZentrale = this.getTelZentrale();
            strategy.appendField(locator, this, "telZentrale", buffer, theTelZentrale, (this.telZentrale!= null));
        }
        {
            String theTelHandy;
            theTelHandy = this.getTelHandy();
            strategy.appendField(locator, this, "telHandy", buffer, theTelHandy, (this.telHandy!= null));
        }
        {
            String theTelFax;
            theTelFax = this.getTelFax();
            strategy.appendField(locator, this, "telFax", buffer, theTelFax, (this.telFax!= null));
        }
        {
            String theTelPrivat;
            theTelPrivat = this.getTelPrivat();
            strategy.appendField(locator, this, "telPrivat", buffer, theTelPrivat, (this.telPrivat!= null));
        }
        {
            List<TelSonstige> theTelSonstige;
            theTelSonstige = (((this.telSonstige!= null)&&(!this.telSonstige.isEmpty()))?this.getTelSonstige():null);
            strategy.appendField(locator, this, "telSonstige", buffer, theTelSonstige, ((this.telSonstige!= null)&&(!this.telSonstige.isEmpty())));
        }
        {
            String theUrl;
            theUrl = this.getUrl();
            strategy.appendField(locator, this, "url", buffer, theUrl, (this.url!= null));
        }
        {
            Boolean theAdressfreigabe;
            theAdressfreigabe = this.getAdressfreigabe();
            strategy.appendField(locator, this, "adressfreigabe", buffer, theAdressfreigabe, (this.adressfreigabe!= null));
        }
        {
            String thePersonennummer;
            thePersonennummer = this.getPersonennummer();
            strategy.appendField(locator, this, "personennummer", buffer, thePersonennummer, (this.personennummer!= null));
        }
        {
            String theFreitextfeld;
            theFreitextfeld = this.getFreitextfeld();
            strategy.appendField(locator, this, "freitextfeld", buffer, theFreitextfeld, (this.freitextfeld!= null));
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
            String theAdressart;
            theAdressart = this.getAdressart();
            strategy.appendField(locator, this, "adressart", buffer, theAdressart, (this.adressart!= null));
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
        if (draftCopy instanceof WeitereAdresse) {
            final WeitereAdresse copy = ((WeitereAdresse) draftCopy);
            {
                Boolean vornameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vorname!= null));
                if (vornameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVorname;
                    sourceVorname = this.getVorname();
                    String copyVorname = ((String) strategy.copy(LocatorUtils.property(locator, "vorname", sourceVorname), sourceVorname, (this.vorname!= null)));
                    copy.setVorname(copyVorname);
                } else {
                    if (vornameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vorname = null;
                    }
                }
            }
            {
                Boolean nameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.name!= null));
                if (nameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceName;
                    sourceName = this.getName();
                    String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName, (this.name!= null)));
                    copy.setName(copyName);
                } else {
                    if (nameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.name = null;
                    }
                }
            }
            {
                Boolean titelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.titel!= null));
                if (titelShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTitel;
                    sourceTitel = this.getTitel();
                    String copyTitel = ((String) strategy.copy(LocatorUtils.property(locator, "titel", sourceTitel), sourceTitel, (this.titel!= null)));
                    copy.setTitel(copyTitel);
                } else {
                    if (titelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.titel = null;
                    }
                }
            }
            {
                Boolean anredeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anrede!= null));
                if (anredeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAnrede;
                    sourceAnrede = this.getAnrede();
                    String copyAnrede = ((String) strategy.copy(LocatorUtils.property(locator, "anrede", sourceAnrede), sourceAnrede, (this.anrede!= null)));
                    copy.setAnrede(copyAnrede);
                } else {
                    if (anredeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anrede = null;
                    }
                }
            }
            {
                Boolean anredeBriefShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anredeBrief!= null));
                if (anredeBriefShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAnredeBrief;
                    sourceAnredeBrief = this.getAnredeBrief();
                    String copyAnredeBrief = ((String) strategy.copy(LocatorUtils.property(locator, "anredeBrief", sourceAnredeBrief), sourceAnredeBrief, (this.anredeBrief!= null)));
                    copy.setAnredeBrief(copyAnredeBrief);
                } else {
                    if (anredeBriefShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anredeBrief = null;
                    }
                }
            }
            {
                Boolean firmaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.firma!= null));
                if (firmaShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFirma;
                    sourceFirma = this.getFirma();
                    String copyFirma = ((String) strategy.copy(LocatorUtils.property(locator, "firma", sourceFirma), sourceFirma, (this.firma!= null)));
                    copy.setFirma(copyFirma);
                } else {
                    if (firmaShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.firma = null;
                    }
                }
            }
            {
                Boolean zusatzfeldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zusatzfeld!= null));
                if (zusatzfeldShouldBeCopiedAndSet == Boolean.TRUE) {
                    Object sourceZusatzfeld;
                    sourceZusatzfeld = this.getZusatzfeld();
                    Object copyZusatzfeld = ((Object) strategy.copy(LocatorUtils.property(locator, "zusatzfeld", sourceZusatzfeld), sourceZusatzfeld, (this.zusatzfeld!= null)));
                    copy.setZusatzfeld(copyZusatzfeld);
                } else {
                    if (zusatzfeldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zusatzfeld = null;
                    }
                }
            }
            {
                Boolean strasseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.strasse!= null));
                if (strasseShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceStrasse;
                    sourceStrasse = this.getStrasse();
                    String copyStrasse = ((String) strategy.copy(LocatorUtils.property(locator, "strasse", sourceStrasse), sourceStrasse, (this.strasse!= null)));
                    copy.setStrasse(copyStrasse);
                } else {
                    if (strasseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.strasse = null;
                    }
                }
            }
            {
                Boolean hausnummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hausnummer!= null));
                if (hausnummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceHausnummer;
                    sourceHausnummer = this.getHausnummer();
                    String copyHausnummer = ((String) strategy.copy(LocatorUtils.property(locator, "hausnummer", sourceHausnummer), sourceHausnummer, (this.hausnummer!= null)));
                    copy.setHausnummer(copyHausnummer);
                } else {
                    if (hausnummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hausnummer = null;
                    }
                }
            }
            {
                Boolean plzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.plz!= null));
                if (plzShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePlz;
                    sourcePlz = this.getPlz();
                    String copyPlz = ((String) strategy.copy(LocatorUtils.property(locator, "plz", sourcePlz), sourcePlz, (this.plz!= null)));
                    copy.setPlz(copyPlz);
                } else {
                    if (plzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.plz = null;
                    }
                }
            }
            {
                Boolean ortShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ort!= null));
                if (ortShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceOrt;
                    sourceOrt = this.getOrt();
                    String copyOrt = ((String) strategy.copy(LocatorUtils.property(locator, "ort", sourceOrt), sourceOrt, (this.ort!= null)));
                    copy.setOrt(copyOrt);
                } else {
                    if (ortShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ort = null;
                    }
                }
            }
            {
                Boolean postfachShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.postfach!= null));
                if (postfachShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePostfach;
                    sourcePostfach = this.getPostfach();
                    String copyPostfach = ((String) strategy.copy(LocatorUtils.property(locator, "postfach", sourcePostfach), sourcePostfach, (this.postfach!= null)));
                    copy.setPostfach(copyPostfach);
                } else {
                    if (postfachShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.postfach = null;
                    }
                }
            }
            {
                Boolean postfPlzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.postfPlz!= null));
                if (postfPlzShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePostfPlz;
                    sourcePostfPlz = this.getPostfPlz();
                    String copyPostfPlz = ((String) strategy.copy(LocatorUtils.property(locator, "postfPlz", sourcePostfPlz), sourcePostfPlz, (this.postfPlz!= null)));
                    copy.setPostfPlz(copyPostfPlz);
                } else {
                    if (postfPlzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.postfPlz = null;
                    }
                }
            }
            {
                Boolean postfOrtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.postfOrt!= null));
                if (postfOrtShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePostfOrt;
                    sourcePostfOrt = this.getPostfOrt();
                    String copyPostfOrt = ((String) strategy.copy(LocatorUtils.property(locator, "postfOrt", sourcePostfOrt), sourcePostfOrt, (this.postfOrt!= null)));
                    copy.setPostfOrt(copyPostfOrt);
                } else {
                    if (postfOrtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.postfOrt = null;
                    }
                }
            }
            {
                Boolean landShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.land!= null));
                if (landShouldBeCopiedAndSet == Boolean.TRUE) {
                    Land sourceLand;
                    sourceLand = this.getLand();
                    Land copyLand = ((Land) strategy.copy(LocatorUtils.property(locator, "land", sourceLand), sourceLand, (this.land!= null)));
                    copy.setLand(copyLand);
                } else {
                    if (landShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.land = null;
                    }
                }
            }
            {
                Boolean emailZentraleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.emailZentrale!= null));
                if (emailZentraleShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEmailZentrale;
                    sourceEmailZentrale = this.getEmailZentrale();
                    String copyEmailZentrale = ((String) strategy.copy(LocatorUtils.property(locator, "emailZentrale", sourceEmailZentrale), sourceEmailZentrale, (this.emailZentrale!= null)));
                    copy.setEmailZentrale(copyEmailZentrale);
                } else {
                    if (emailZentraleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.emailZentrale = null;
                    }
                }
            }
            {
                Boolean emailDirektShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.emailDirekt!= null));
                if (emailDirektShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEmailDirekt;
                    sourceEmailDirekt = this.getEmailDirekt();
                    String copyEmailDirekt = ((String) strategy.copy(LocatorUtils.property(locator, "emailDirekt", sourceEmailDirekt), sourceEmailDirekt, (this.emailDirekt!= null)));
                    copy.setEmailDirekt(copyEmailDirekt);
                } else {
                    if (emailDirektShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.emailDirekt = null;
                    }
                }
            }
            {
                Boolean emailPrivatShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.emailPrivat!= null));
                if (emailPrivatShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEmailPrivat;
                    sourceEmailPrivat = this.getEmailPrivat();
                    String copyEmailPrivat = ((String) strategy.copy(LocatorUtils.property(locator, "emailPrivat", sourceEmailPrivat), sourceEmailPrivat, (this.emailPrivat!= null)));
                    copy.setEmailPrivat(copyEmailPrivat);
                } else {
                    if (emailPrivatShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.emailPrivat = null;
                    }
                }
            }
            {
                Boolean emailSonstigeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.emailSonstige!= null)&&(!this.emailSonstige.isEmpty())));
                if (emailSonstigeShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<EmailSonstige> sourceEmailSonstige;
                    sourceEmailSonstige = (((this.emailSonstige!= null)&&(!this.emailSonstige.isEmpty()))?this.getEmailSonstige():null);
                    @SuppressWarnings("unchecked")
                    List<EmailSonstige> copyEmailSonstige = ((List<EmailSonstige> ) strategy.copy(LocatorUtils.property(locator, "emailSonstige", sourceEmailSonstige), sourceEmailSonstige, ((this.emailSonstige!= null)&&(!this.emailSonstige.isEmpty()))));
                    copy.emailSonstige = null;
                    if (copyEmailSonstige!= null) {
                        List<EmailSonstige> uniqueEmailSonstigel = copy.getEmailSonstige();
                        uniqueEmailSonstigel.addAll(copyEmailSonstige);
                    }
                } else {
                    if (emailSonstigeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.emailSonstige = null;
                    }
                }
            }
            {
                Boolean telDurchwShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.telDurchw!= null));
                if (telDurchwShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTelDurchw;
                    sourceTelDurchw = this.getTelDurchw();
                    String copyTelDurchw = ((String) strategy.copy(LocatorUtils.property(locator, "telDurchw", sourceTelDurchw), sourceTelDurchw, (this.telDurchw!= null)));
                    copy.setTelDurchw(copyTelDurchw);
                } else {
                    if (telDurchwShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.telDurchw = null;
                    }
                }
            }
            {
                Boolean telZentraleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.telZentrale!= null));
                if (telZentraleShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTelZentrale;
                    sourceTelZentrale = this.getTelZentrale();
                    String copyTelZentrale = ((String) strategy.copy(LocatorUtils.property(locator, "telZentrale", sourceTelZentrale), sourceTelZentrale, (this.telZentrale!= null)));
                    copy.setTelZentrale(copyTelZentrale);
                } else {
                    if (telZentraleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.telZentrale = null;
                    }
                }
            }
            {
                Boolean telHandyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.telHandy!= null));
                if (telHandyShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTelHandy;
                    sourceTelHandy = this.getTelHandy();
                    String copyTelHandy = ((String) strategy.copy(LocatorUtils.property(locator, "telHandy", sourceTelHandy), sourceTelHandy, (this.telHandy!= null)));
                    copy.setTelHandy(copyTelHandy);
                } else {
                    if (telHandyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.telHandy = null;
                    }
                }
            }
            {
                Boolean telFaxShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.telFax!= null));
                if (telFaxShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTelFax;
                    sourceTelFax = this.getTelFax();
                    String copyTelFax = ((String) strategy.copy(LocatorUtils.property(locator, "telFax", sourceTelFax), sourceTelFax, (this.telFax!= null)));
                    copy.setTelFax(copyTelFax);
                } else {
                    if (telFaxShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.telFax = null;
                    }
                }
            }
            {
                Boolean telPrivatShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.telPrivat!= null));
                if (telPrivatShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTelPrivat;
                    sourceTelPrivat = this.getTelPrivat();
                    String copyTelPrivat = ((String) strategy.copy(LocatorUtils.property(locator, "telPrivat", sourceTelPrivat), sourceTelPrivat, (this.telPrivat!= null)));
                    copy.setTelPrivat(copyTelPrivat);
                } else {
                    if (telPrivatShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.telPrivat = null;
                    }
                }
            }
            {
                Boolean telSonstigeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.telSonstige!= null)&&(!this.telSonstige.isEmpty())));
                if (telSonstigeShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<TelSonstige> sourceTelSonstige;
                    sourceTelSonstige = (((this.telSonstige!= null)&&(!this.telSonstige.isEmpty()))?this.getTelSonstige():null);
                    @SuppressWarnings("unchecked")
                    List<TelSonstige> copyTelSonstige = ((List<TelSonstige> ) strategy.copy(LocatorUtils.property(locator, "telSonstige", sourceTelSonstige), sourceTelSonstige, ((this.telSonstige!= null)&&(!this.telSonstige.isEmpty()))));
                    copy.telSonstige = null;
                    if (copyTelSonstige!= null) {
                        List<TelSonstige> uniqueTelSonstigel = copy.getTelSonstige();
                        uniqueTelSonstigel.addAll(copyTelSonstige);
                    }
                } else {
                    if (telSonstigeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.telSonstige = null;
                    }
                }
            }
            {
                Boolean urlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.url!= null));
                if (urlShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceUrl;
                    sourceUrl = this.getUrl();
                    String copyUrl = ((String) strategy.copy(LocatorUtils.property(locator, "url", sourceUrl), sourceUrl, (this.url!= null)));
                    copy.setUrl(copyUrl);
                } else {
                    if (urlShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.url = null;
                    }
                }
            }
            {
                Boolean adressfreigabeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.adressfreigabe!= null));
                if (adressfreigabeShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceAdressfreigabe;
                    sourceAdressfreigabe = this.getAdressfreigabe();
                    Boolean copyAdressfreigabe = ((Boolean) strategy.copy(LocatorUtils.property(locator, "adressfreigabe", sourceAdressfreigabe), sourceAdressfreigabe, (this.adressfreigabe!= null)));
                    copy.setAdressfreigabe(copyAdressfreigabe);
                } else {
                    if (adressfreigabeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.adressfreigabe = null;
                    }
                }
            }
            {
                Boolean personennummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.personennummer!= null));
                if (personennummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePersonennummer;
                    sourcePersonennummer = this.getPersonennummer();
                    String copyPersonennummer = ((String) strategy.copy(LocatorUtils.property(locator, "personennummer", sourcePersonennummer), sourcePersonennummer, (this.personennummer!= null)));
                    copy.setPersonennummer(copyPersonennummer);
                } else {
                    if (personennummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.personennummer = null;
                    }
                }
            }
            {
                Boolean freitextfeldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.freitextfeld!= null));
                if (freitextfeldShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFreitextfeld;
                    sourceFreitextfeld = this.getFreitextfeld();
                    String copyFreitextfeld = ((String) strategy.copy(LocatorUtils.property(locator, "freitextfeld", sourceFreitextfeld), sourceFreitextfeld, (this.freitextfeld!= null)));
                    copy.setFreitextfeld(copyFreitextfeld);
                } else {
                    if (freitextfeldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.freitextfeld = null;
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
                Boolean adressartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.adressart!= null));
                if (adressartShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAdressart;
                    sourceAdressart = this.getAdressart();
                    String copyAdressart = ((String) strategy.copy(LocatorUtils.property(locator, "adressart", sourceAdressart), sourceAdressart, (this.adressart!= null)));
                    copy.setAdressart(copyAdressart);
                } else {
                    if (adressartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.adressart = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new WeitereAdresse();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final WeitereAdresse that = ((WeitereAdresse) object);
        {
            String lhsVorname;
            lhsVorname = this.getVorname();
            String rhsVorname;
            rhsVorname = that.getVorname();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vorname", lhsVorname), LocatorUtils.property(thatLocator, "vorname", rhsVorname), lhsVorname, rhsVorname, (this.vorname!= null), (that.vorname!= null))) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            String lhsTitel;
            lhsTitel = this.getTitel();
            String rhsTitel;
            rhsTitel = that.getTitel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "titel", lhsTitel), LocatorUtils.property(thatLocator, "titel", rhsTitel), lhsTitel, rhsTitel, (this.titel!= null), (that.titel!= null))) {
                return false;
            }
        }
        {
            String lhsAnrede;
            lhsAnrede = this.getAnrede();
            String rhsAnrede;
            rhsAnrede = that.getAnrede();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anrede", lhsAnrede), LocatorUtils.property(thatLocator, "anrede", rhsAnrede), lhsAnrede, rhsAnrede, (this.anrede!= null), (that.anrede!= null))) {
                return false;
            }
        }
        {
            String lhsAnredeBrief;
            lhsAnredeBrief = this.getAnredeBrief();
            String rhsAnredeBrief;
            rhsAnredeBrief = that.getAnredeBrief();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anredeBrief", lhsAnredeBrief), LocatorUtils.property(thatLocator, "anredeBrief", rhsAnredeBrief), lhsAnredeBrief, rhsAnredeBrief, (this.anredeBrief!= null), (that.anredeBrief!= null))) {
                return false;
            }
        }
        {
            String lhsFirma;
            lhsFirma = this.getFirma();
            String rhsFirma;
            rhsFirma = that.getFirma();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firma", lhsFirma), LocatorUtils.property(thatLocator, "firma", rhsFirma), lhsFirma, rhsFirma, (this.firma!= null), (that.firma!= null))) {
                return false;
            }
        }
        {
            Object lhsZusatzfeld;
            lhsZusatzfeld = this.getZusatzfeld();
            Object rhsZusatzfeld;
            rhsZusatzfeld = that.getZusatzfeld();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zusatzfeld", lhsZusatzfeld), LocatorUtils.property(thatLocator, "zusatzfeld", rhsZusatzfeld), lhsZusatzfeld, rhsZusatzfeld, (this.zusatzfeld!= null), (that.zusatzfeld!= null))) {
                return false;
            }
        }
        {
            String lhsStrasse;
            lhsStrasse = this.getStrasse();
            String rhsStrasse;
            rhsStrasse = that.getStrasse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "strasse", lhsStrasse), LocatorUtils.property(thatLocator, "strasse", rhsStrasse), lhsStrasse, rhsStrasse, (this.strasse!= null), (that.strasse!= null))) {
                return false;
            }
        }
        {
            String lhsHausnummer;
            lhsHausnummer = this.getHausnummer();
            String rhsHausnummer;
            rhsHausnummer = that.getHausnummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hausnummer", lhsHausnummer), LocatorUtils.property(thatLocator, "hausnummer", rhsHausnummer), lhsHausnummer, rhsHausnummer, (this.hausnummer!= null), (that.hausnummer!= null))) {
                return false;
            }
        }
        {
            String lhsPlz;
            lhsPlz = this.getPlz();
            String rhsPlz;
            rhsPlz = that.getPlz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "plz", lhsPlz), LocatorUtils.property(thatLocator, "plz", rhsPlz), lhsPlz, rhsPlz, (this.plz!= null), (that.plz!= null))) {
                return false;
            }
        }
        {
            String lhsOrt;
            lhsOrt = this.getOrt();
            String rhsOrt;
            rhsOrt = that.getOrt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ort", lhsOrt), LocatorUtils.property(thatLocator, "ort", rhsOrt), lhsOrt, rhsOrt, (this.ort!= null), (that.ort!= null))) {
                return false;
            }
        }
        {
            String lhsPostfach;
            lhsPostfach = this.getPostfach();
            String rhsPostfach;
            rhsPostfach = that.getPostfach();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postfach", lhsPostfach), LocatorUtils.property(thatLocator, "postfach", rhsPostfach), lhsPostfach, rhsPostfach, (this.postfach!= null), (that.postfach!= null))) {
                return false;
            }
        }
        {
            String lhsPostfPlz;
            lhsPostfPlz = this.getPostfPlz();
            String rhsPostfPlz;
            rhsPostfPlz = that.getPostfPlz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postfPlz", lhsPostfPlz), LocatorUtils.property(thatLocator, "postfPlz", rhsPostfPlz), lhsPostfPlz, rhsPostfPlz, (this.postfPlz!= null), (that.postfPlz!= null))) {
                return false;
            }
        }
        {
            String lhsPostfOrt;
            lhsPostfOrt = this.getPostfOrt();
            String rhsPostfOrt;
            rhsPostfOrt = that.getPostfOrt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postfOrt", lhsPostfOrt), LocatorUtils.property(thatLocator, "postfOrt", rhsPostfOrt), lhsPostfOrt, rhsPostfOrt, (this.postfOrt!= null), (that.postfOrt!= null))) {
                return false;
            }
        }
        {
            Land lhsLand;
            lhsLand = this.getLand();
            Land rhsLand;
            rhsLand = that.getLand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "land", lhsLand), LocatorUtils.property(thatLocator, "land", rhsLand), lhsLand, rhsLand, (this.land!= null), (that.land!= null))) {
                return false;
            }
        }
        {
            String lhsEmailZentrale;
            lhsEmailZentrale = this.getEmailZentrale();
            String rhsEmailZentrale;
            rhsEmailZentrale = that.getEmailZentrale();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emailZentrale", lhsEmailZentrale), LocatorUtils.property(thatLocator, "emailZentrale", rhsEmailZentrale), lhsEmailZentrale, rhsEmailZentrale, (this.emailZentrale!= null), (that.emailZentrale!= null))) {
                return false;
            }
        }
        {
            String lhsEmailDirekt;
            lhsEmailDirekt = this.getEmailDirekt();
            String rhsEmailDirekt;
            rhsEmailDirekt = that.getEmailDirekt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emailDirekt", lhsEmailDirekt), LocatorUtils.property(thatLocator, "emailDirekt", rhsEmailDirekt), lhsEmailDirekt, rhsEmailDirekt, (this.emailDirekt!= null), (that.emailDirekt!= null))) {
                return false;
            }
        }
        {
            String lhsEmailPrivat;
            lhsEmailPrivat = this.getEmailPrivat();
            String rhsEmailPrivat;
            rhsEmailPrivat = that.getEmailPrivat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emailPrivat", lhsEmailPrivat), LocatorUtils.property(thatLocator, "emailPrivat", rhsEmailPrivat), lhsEmailPrivat, rhsEmailPrivat, (this.emailPrivat!= null), (that.emailPrivat!= null))) {
                return false;
            }
        }
        {
            List<EmailSonstige> lhsEmailSonstige;
            lhsEmailSonstige = (((this.emailSonstige!= null)&&(!this.emailSonstige.isEmpty()))?this.getEmailSonstige():null);
            List<EmailSonstige> rhsEmailSonstige;
            rhsEmailSonstige = (((that.emailSonstige!= null)&&(!that.emailSonstige.isEmpty()))?that.getEmailSonstige():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emailSonstige", lhsEmailSonstige), LocatorUtils.property(thatLocator, "emailSonstige", rhsEmailSonstige), lhsEmailSonstige, rhsEmailSonstige, ((this.emailSonstige!= null)&&(!this.emailSonstige.isEmpty())), ((that.emailSonstige!= null)&&(!that.emailSonstige.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsTelDurchw;
            lhsTelDurchw = this.getTelDurchw();
            String rhsTelDurchw;
            rhsTelDurchw = that.getTelDurchw();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telDurchw", lhsTelDurchw), LocatorUtils.property(thatLocator, "telDurchw", rhsTelDurchw), lhsTelDurchw, rhsTelDurchw, (this.telDurchw!= null), (that.telDurchw!= null))) {
                return false;
            }
        }
        {
            String lhsTelZentrale;
            lhsTelZentrale = this.getTelZentrale();
            String rhsTelZentrale;
            rhsTelZentrale = that.getTelZentrale();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telZentrale", lhsTelZentrale), LocatorUtils.property(thatLocator, "telZentrale", rhsTelZentrale), lhsTelZentrale, rhsTelZentrale, (this.telZentrale!= null), (that.telZentrale!= null))) {
                return false;
            }
        }
        {
            String lhsTelHandy;
            lhsTelHandy = this.getTelHandy();
            String rhsTelHandy;
            rhsTelHandy = that.getTelHandy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telHandy", lhsTelHandy), LocatorUtils.property(thatLocator, "telHandy", rhsTelHandy), lhsTelHandy, rhsTelHandy, (this.telHandy!= null), (that.telHandy!= null))) {
                return false;
            }
        }
        {
            String lhsTelFax;
            lhsTelFax = this.getTelFax();
            String rhsTelFax;
            rhsTelFax = that.getTelFax();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telFax", lhsTelFax), LocatorUtils.property(thatLocator, "telFax", rhsTelFax), lhsTelFax, rhsTelFax, (this.telFax!= null), (that.telFax!= null))) {
                return false;
            }
        }
        {
            String lhsTelPrivat;
            lhsTelPrivat = this.getTelPrivat();
            String rhsTelPrivat;
            rhsTelPrivat = that.getTelPrivat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telPrivat", lhsTelPrivat), LocatorUtils.property(thatLocator, "telPrivat", rhsTelPrivat), lhsTelPrivat, rhsTelPrivat, (this.telPrivat!= null), (that.telPrivat!= null))) {
                return false;
            }
        }
        {
            List<TelSonstige> lhsTelSonstige;
            lhsTelSonstige = (((this.telSonstige!= null)&&(!this.telSonstige.isEmpty()))?this.getTelSonstige():null);
            List<TelSonstige> rhsTelSonstige;
            rhsTelSonstige = (((that.telSonstige!= null)&&(!that.telSonstige.isEmpty()))?that.getTelSonstige():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telSonstige", lhsTelSonstige), LocatorUtils.property(thatLocator, "telSonstige", rhsTelSonstige), lhsTelSonstige, rhsTelSonstige, ((this.telSonstige!= null)&&(!this.telSonstige.isEmpty())), ((that.telSonstige!= null)&&(!that.telSonstige.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsUrl;
            lhsUrl = this.getUrl();
            String rhsUrl;
            rhsUrl = that.getUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "url", lhsUrl), LocatorUtils.property(thatLocator, "url", rhsUrl), lhsUrl, rhsUrl, (this.url!= null), (that.url!= null))) {
                return false;
            }
        }
        {
            Boolean lhsAdressfreigabe;
            lhsAdressfreigabe = this.getAdressfreigabe();
            Boolean rhsAdressfreigabe;
            rhsAdressfreigabe = that.getAdressfreigabe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adressfreigabe", lhsAdressfreigabe), LocatorUtils.property(thatLocator, "adressfreigabe", rhsAdressfreigabe), lhsAdressfreigabe, rhsAdressfreigabe, (this.adressfreigabe!= null), (that.adressfreigabe!= null))) {
                return false;
            }
        }
        {
            String lhsPersonennummer;
            lhsPersonennummer = this.getPersonennummer();
            String rhsPersonennummer;
            rhsPersonennummer = that.getPersonennummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "personennummer", lhsPersonennummer), LocatorUtils.property(thatLocator, "personennummer", rhsPersonennummer), lhsPersonennummer, rhsPersonennummer, (this.personennummer!= null), (that.personennummer!= null))) {
                return false;
            }
        }
        {
            String lhsFreitextfeld;
            lhsFreitextfeld = this.getFreitextfeld();
            String rhsFreitextfeld;
            rhsFreitextfeld = that.getFreitextfeld();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freitextfeld", lhsFreitextfeld), LocatorUtils.property(thatLocator, "freitextfeld", rhsFreitextfeld), lhsFreitextfeld, rhsFreitextfeld, (this.freitextfeld!= null), (that.freitextfeld!= null))) {
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
            String lhsAdressart;
            lhsAdressart = this.getAdressart();
            String rhsAdressart;
            rhsAdressart = that.getAdressart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adressart", lhsAdressart), LocatorUtils.property(thatLocator, "adressart", rhsAdressart), lhsAdressart, rhsAdressart, (this.adressart!= null), (that.adressart!= null))) {
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
