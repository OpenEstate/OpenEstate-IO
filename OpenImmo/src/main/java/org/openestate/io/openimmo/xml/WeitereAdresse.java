
package org.openestate.io.openimmo.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
    "userDefinedAnyfield",
    "userDefinedExtend"
})
@XmlRootElement(name = "weitere_adresse")
public class WeitereAdresse
    implements Cloneable, CopyTo, Equals, ToString
{

    protected String vorname;
    protected String name;
    protected String titel;
    protected String anrede;
    @XmlElement(name = "anrede_brief")
    protected String anredeBrief;
    protected String firma;
    protected Object zusatzfeld;
    protected String strasse;
    protected String hausnummer;
    protected String plz;
    protected String ort;
    protected String postfach;
    @XmlElement(name = "postf_plz")
    protected String postfPlz;
    @XmlElement(name = "postf_ort")
    protected String postfOrt;
    protected Land land;
    @XmlElement(name = "email_zentrale")
    protected String emailZentrale;
    @XmlElement(name = "email_direkt")
    protected String emailDirekt;
    @XmlElement(name = "email_privat")
    protected String emailPrivat;
    @XmlElement(name = "email_sonstige")
    protected List<EmailSonstige> emailSonstige;
    @XmlElement(name = "tel_durchw")
    protected String telDurchw;
    @XmlElement(name = "tel_zentrale")
    protected String telZentrale;
    @XmlElement(name = "tel_handy")
    protected String telHandy;
    @XmlElement(name = "tel_fax")
    protected String telFax;
    @XmlElement(name = "tel_privat")
    protected String telPrivat;
    @XmlElement(name = "tel_sonstige")
    protected List<TelSonstige> telSonstige;
    protected String url;
    protected Boolean adressfreigabe;
    protected String personennummer;
    protected String freitextfeld;
    @XmlElement(name = "user_defined_simplefield")
    protected List<UserDefinedSimplefield> userDefinedSimplefield;
    @XmlElement(name = "user_defined_anyfield")
    protected List<UserDefinedAnyfield> userDefinedAnyfield;
    @XmlElement(name = "user_defined_extend")
    protected List<UserDefinedExtend> userDefinedExtend;
    @XmlAttribute(name = "adressart", required = true)
    protected String adressart;

    /**
     * Gets the value of the vorname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    public Boolean isAdressfreigabe() {
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

    /**
     * Gets the value of the adressart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    public void setAdressart(String value) {
        this.adressart = value;
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
            String theVorname;
            theVorname = this.getVorname();
            strategy.appendField(locator, this, "vorname", buffer, theVorname);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String theTitel;
            theTitel = this.getTitel();
            strategy.appendField(locator, this, "titel", buffer, theTitel);
        }
        {
            String theAnrede;
            theAnrede = this.getAnrede();
            strategy.appendField(locator, this, "anrede", buffer, theAnrede);
        }
        {
            String theAnredeBrief;
            theAnredeBrief = this.getAnredeBrief();
            strategy.appendField(locator, this, "anredeBrief", buffer, theAnredeBrief);
        }
        {
            String theFirma;
            theFirma = this.getFirma();
            strategy.appendField(locator, this, "firma", buffer, theFirma);
        }
        {
            Object theZusatzfeld;
            theZusatzfeld = this.getZusatzfeld();
            strategy.appendField(locator, this, "zusatzfeld", buffer, theZusatzfeld);
        }
        {
            String theStrasse;
            theStrasse = this.getStrasse();
            strategy.appendField(locator, this, "strasse", buffer, theStrasse);
        }
        {
            String theHausnummer;
            theHausnummer = this.getHausnummer();
            strategy.appendField(locator, this, "hausnummer", buffer, theHausnummer);
        }
        {
            String thePlz;
            thePlz = this.getPlz();
            strategy.appendField(locator, this, "plz", buffer, thePlz);
        }
        {
            String theOrt;
            theOrt = this.getOrt();
            strategy.appendField(locator, this, "ort", buffer, theOrt);
        }
        {
            String thePostfach;
            thePostfach = this.getPostfach();
            strategy.appendField(locator, this, "postfach", buffer, thePostfach);
        }
        {
            String thePostfPlz;
            thePostfPlz = this.getPostfPlz();
            strategy.appendField(locator, this, "postfPlz", buffer, thePostfPlz);
        }
        {
            String thePostfOrt;
            thePostfOrt = this.getPostfOrt();
            strategy.appendField(locator, this, "postfOrt", buffer, thePostfOrt);
        }
        {
            Land theLand;
            theLand = this.getLand();
            strategy.appendField(locator, this, "land", buffer, theLand);
        }
        {
            String theEmailZentrale;
            theEmailZentrale = this.getEmailZentrale();
            strategy.appendField(locator, this, "emailZentrale", buffer, theEmailZentrale);
        }
        {
            String theEmailDirekt;
            theEmailDirekt = this.getEmailDirekt();
            strategy.appendField(locator, this, "emailDirekt", buffer, theEmailDirekt);
        }
        {
            String theEmailPrivat;
            theEmailPrivat = this.getEmailPrivat();
            strategy.appendField(locator, this, "emailPrivat", buffer, theEmailPrivat);
        }
        {
            List<EmailSonstige> theEmailSonstige;
            theEmailSonstige = (((this.emailSonstige!= null)&&(!this.emailSonstige.isEmpty()))?this.getEmailSonstige():null);
            strategy.appendField(locator, this, "emailSonstige", buffer, theEmailSonstige);
        }
        {
            String theTelDurchw;
            theTelDurchw = this.getTelDurchw();
            strategy.appendField(locator, this, "telDurchw", buffer, theTelDurchw);
        }
        {
            String theTelZentrale;
            theTelZentrale = this.getTelZentrale();
            strategy.appendField(locator, this, "telZentrale", buffer, theTelZentrale);
        }
        {
            String theTelHandy;
            theTelHandy = this.getTelHandy();
            strategy.appendField(locator, this, "telHandy", buffer, theTelHandy);
        }
        {
            String theTelFax;
            theTelFax = this.getTelFax();
            strategy.appendField(locator, this, "telFax", buffer, theTelFax);
        }
        {
            String theTelPrivat;
            theTelPrivat = this.getTelPrivat();
            strategy.appendField(locator, this, "telPrivat", buffer, theTelPrivat);
        }
        {
            List<TelSonstige> theTelSonstige;
            theTelSonstige = (((this.telSonstige!= null)&&(!this.telSonstige.isEmpty()))?this.getTelSonstige():null);
            strategy.appendField(locator, this, "telSonstige", buffer, theTelSonstige);
        }
        {
            String theUrl;
            theUrl = this.getUrl();
            strategy.appendField(locator, this, "url", buffer, theUrl);
        }
        {
            Boolean theAdressfreigabe;
            theAdressfreigabe = this.isAdressfreigabe();
            strategy.appendField(locator, this, "adressfreigabe", buffer, theAdressfreigabe);
        }
        {
            String thePersonennummer;
            thePersonennummer = this.getPersonennummer();
            strategy.appendField(locator, this, "personennummer", buffer, thePersonennummer);
        }
        {
            String theFreitextfeld;
            theFreitextfeld = this.getFreitextfeld();
            strategy.appendField(locator, this, "freitextfeld", buffer, theFreitextfeld);
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
        {
            List<UserDefinedExtend> theUserDefinedExtend;
            theUserDefinedExtend = (((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))?this.getUserDefinedExtend():null);
            strategy.appendField(locator, this, "userDefinedExtend", buffer, theUserDefinedExtend);
        }
        {
            String theAdressart;
            theAdressart = this.getAdressart();
            strategy.appendField(locator, this, "adressart", buffer, theAdressart);
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
        if (draftCopy instanceof WeitereAdresse) {
            final WeitereAdresse copy = ((WeitereAdresse) draftCopy);
            if (this.vorname!= null) {
                String sourceVorname;
                sourceVorname = this.getVorname();
                String copyVorname = ((String) strategy.copy(LocatorUtils.property(locator, "vorname", sourceVorname), sourceVorname));
                copy.setVorname(copyVorname);
            } else {
                copy.vorname = null;
            }
            if (this.name!= null) {
                String sourceName;
                sourceName = this.getName();
                String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName));
                copy.setName(copyName);
            } else {
                copy.name = null;
            }
            if (this.titel!= null) {
                String sourceTitel;
                sourceTitel = this.getTitel();
                String copyTitel = ((String) strategy.copy(LocatorUtils.property(locator, "titel", sourceTitel), sourceTitel));
                copy.setTitel(copyTitel);
            } else {
                copy.titel = null;
            }
            if (this.anrede!= null) {
                String sourceAnrede;
                sourceAnrede = this.getAnrede();
                String copyAnrede = ((String) strategy.copy(LocatorUtils.property(locator, "anrede", sourceAnrede), sourceAnrede));
                copy.setAnrede(copyAnrede);
            } else {
                copy.anrede = null;
            }
            if (this.anredeBrief!= null) {
                String sourceAnredeBrief;
                sourceAnredeBrief = this.getAnredeBrief();
                String copyAnredeBrief = ((String) strategy.copy(LocatorUtils.property(locator, "anredeBrief", sourceAnredeBrief), sourceAnredeBrief));
                copy.setAnredeBrief(copyAnredeBrief);
            } else {
                copy.anredeBrief = null;
            }
            if (this.firma!= null) {
                String sourceFirma;
                sourceFirma = this.getFirma();
                String copyFirma = ((String) strategy.copy(LocatorUtils.property(locator, "firma", sourceFirma), sourceFirma));
                copy.setFirma(copyFirma);
            } else {
                copy.firma = null;
            }
            if (this.zusatzfeld!= null) {
                Object sourceZusatzfeld;
                sourceZusatzfeld = this.getZusatzfeld();
                Object copyZusatzfeld = ((Object) strategy.copy(LocatorUtils.property(locator, "zusatzfeld", sourceZusatzfeld), sourceZusatzfeld));
                copy.setZusatzfeld(copyZusatzfeld);
            } else {
                copy.zusatzfeld = null;
            }
            if (this.strasse!= null) {
                String sourceStrasse;
                sourceStrasse = this.getStrasse();
                String copyStrasse = ((String) strategy.copy(LocatorUtils.property(locator, "strasse", sourceStrasse), sourceStrasse));
                copy.setStrasse(copyStrasse);
            } else {
                copy.strasse = null;
            }
            if (this.hausnummer!= null) {
                String sourceHausnummer;
                sourceHausnummer = this.getHausnummer();
                String copyHausnummer = ((String) strategy.copy(LocatorUtils.property(locator, "hausnummer", sourceHausnummer), sourceHausnummer));
                copy.setHausnummer(copyHausnummer);
            } else {
                copy.hausnummer = null;
            }
            if (this.plz!= null) {
                String sourcePlz;
                sourcePlz = this.getPlz();
                String copyPlz = ((String) strategy.copy(LocatorUtils.property(locator, "plz", sourcePlz), sourcePlz));
                copy.setPlz(copyPlz);
            } else {
                copy.plz = null;
            }
            if (this.ort!= null) {
                String sourceOrt;
                sourceOrt = this.getOrt();
                String copyOrt = ((String) strategy.copy(LocatorUtils.property(locator, "ort", sourceOrt), sourceOrt));
                copy.setOrt(copyOrt);
            } else {
                copy.ort = null;
            }
            if (this.postfach!= null) {
                String sourcePostfach;
                sourcePostfach = this.getPostfach();
                String copyPostfach = ((String) strategy.copy(LocatorUtils.property(locator, "postfach", sourcePostfach), sourcePostfach));
                copy.setPostfach(copyPostfach);
            } else {
                copy.postfach = null;
            }
            if (this.postfPlz!= null) {
                String sourcePostfPlz;
                sourcePostfPlz = this.getPostfPlz();
                String copyPostfPlz = ((String) strategy.copy(LocatorUtils.property(locator, "postfPlz", sourcePostfPlz), sourcePostfPlz));
                copy.setPostfPlz(copyPostfPlz);
            } else {
                copy.postfPlz = null;
            }
            if (this.postfOrt!= null) {
                String sourcePostfOrt;
                sourcePostfOrt = this.getPostfOrt();
                String copyPostfOrt = ((String) strategy.copy(LocatorUtils.property(locator, "postfOrt", sourcePostfOrt), sourcePostfOrt));
                copy.setPostfOrt(copyPostfOrt);
            } else {
                copy.postfOrt = null;
            }
            if (this.land!= null) {
                Land sourceLand;
                sourceLand = this.getLand();
                Land copyLand = ((Land) strategy.copy(LocatorUtils.property(locator, "land", sourceLand), sourceLand));
                copy.setLand(copyLand);
            } else {
                copy.land = null;
            }
            if (this.emailZentrale!= null) {
                String sourceEmailZentrale;
                sourceEmailZentrale = this.getEmailZentrale();
                String copyEmailZentrale = ((String) strategy.copy(LocatorUtils.property(locator, "emailZentrale", sourceEmailZentrale), sourceEmailZentrale));
                copy.setEmailZentrale(copyEmailZentrale);
            } else {
                copy.emailZentrale = null;
            }
            if (this.emailDirekt!= null) {
                String sourceEmailDirekt;
                sourceEmailDirekt = this.getEmailDirekt();
                String copyEmailDirekt = ((String) strategy.copy(LocatorUtils.property(locator, "emailDirekt", sourceEmailDirekt), sourceEmailDirekt));
                copy.setEmailDirekt(copyEmailDirekt);
            } else {
                copy.emailDirekt = null;
            }
            if (this.emailPrivat!= null) {
                String sourceEmailPrivat;
                sourceEmailPrivat = this.getEmailPrivat();
                String copyEmailPrivat = ((String) strategy.copy(LocatorUtils.property(locator, "emailPrivat", sourceEmailPrivat), sourceEmailPrivat));
                copy.setEmailPrivat(copyEmailPrivat);
            } else {
                copy.emailPrivat = null;
            }
            if ((this.emailSonstige!= null)&&(!this.emailSonstige.isEmpty())) {
                List<EmailSonstige> sourceEmailSonstige;
                sourceEmailSonstige = (((this.emailSonstige!= null)&&(!this.emailSonstige.isEmpty()))?this.getEmailSonstige():null);
                @SuppressWarnings("unchecked")
                List<EmailSonstige> copyEmailSonstige = ((List<EmailSonstige> ) strategy.copy(LocatorUtils.property(locator, "emailSonstige", sourceEmailSonstige), sourceEmailSonstige));
                copy.emailSonstige = null;
                if (copyEmailSonstige!= null) {
                    List<EmailSonstige> uniqueEmailSonstigel = copy.getEmailSonstige();
                    uniqueEmailSonstigel.addAll(copyEmailSonstige);
                }
            } else {
                copy.emailSonstige = null;
            }
            if (this.telDurchw!= null) {
                String sourceTelDurchw;
                sourceTelDurchw = this.getTelDurchw();
                String copyTelDurchw = ((String) strategy.copy(LocatorUtils.property(locator, "telDurchw", sourceTelDurchw), sourceTelDurchw));
                copy.setTelDurchw(copyTelDurchw);
            } else {
                copy.telDurchw = null;
            }
            if (this.telZentrale!= null) {
                String sourceTelZentrale;
                sourceTelZentrale = this.getTelZentrale();
                String copyTelZentrale = ((String) strategy.copy(LocatorUtils.property(locator, "telZentrale", sourceTelZentrale), sourceTelZentrale));
                copy.setTelZentrale(copyTelZentrale);
            } else {
                copy.telZentrale = null;
            }
            if (this.telHandy!= null) {
                String sourceTelHandy;
                sourceTelHandy = this.getTelHandy();
                String copyTelHandy = ((String) strategy.copy(LocatorUtils.property(locator, "telHandy", sourceTelHandy), sourceTelHandy));
                copy.setTelHandy(copyTelHandy);
            } else {
                copy.telHandy = null;
            }
            if (this.telFax!= null) {
                String sourceTelFax;
                sourceTelFax = this.getTelFax();
                String copyTelFax = ((String) strategy.copy(LocatorUtils.property(locator, "telFax", sourceTelFax), sourceTelFax));
                copy.setTelFax(copyTelFax);
            } else {
                copy.telFax = null;
            }
            if (this.telPrivat!= null) {
                String sourceTelPrivat;
                sourceTelPrivat = this.getTelPrivat();
                String copyTelPrivat = ((String) strategy.copy(LocatorUtils.property(locator, "telPrivat", sourceTelPrivat), sourceTelPrivat));
                copy.setTelPrivat(copyTelPrivat);
            } else {
                copy.telPrivat = null;
            }
            if ((this.telSonstige!= null)&&(!this.telSonstige.isEmpty())) {
                List<TelSonstige> sourceTelSonstige;
                sourceTelSonstige = (((this.telSonstige!= null)&&(!this.telSonstige.isEmpty()))?this.getTelSonstige():null);
                @SuppressWarnings("unchecked")
                List<TelSonstige> copyTelSonstige = ((List<TelSonstige> ) strategy.copy(LocatorUtils.property(locator, "telSonstige", sourceTelSonstige), sourceTelSonstige));
                copy.telSonstige = null;
                if (copyTelSonstige!= null) {
                    List<TelSonstige> uniqueTelSonstigel = copy.getTelSonstige();
                    uniqueTelSonstigel.addAll(copyTelSonstige);
                }
            } else {
                copy.telSonstige = null;
            }
            if (this.url!= null) {
                String sourceUrl;
                sourceUrl = this.getUrl();
                String copyUrl = ((String) strategy.copy(LocatorUtils.property(locator, "url", sourceUrl), sourceUrl));
                copy.setUrl(copyUrl);
            } else {
                copy.url = null;
            }
            if (this.adressfreigabe!= null) {
                Boolean sourceAdressfreigabe;
                sourceAdressfreigabe = this.isAdressfreigabe();
                Boolean copyAdressfreigabe = ((Boolean) strategy.copy(LocatorUtils.property(locator, "adressfreigabe", sourceAdressfreigabe), sourceAdressfreigabe));
                copy.setAdressfreigabe(copyAdressfreigabe);
            } else {
                copy.adressfreigabe = null;
            }
            if (this.personennummer!= null) {
                String sourcePersonennummer;
                sourcePersonennummer = this.getPersonennummer();
                String copyPersonennummer = ((String) strategy.copy(LocatorUtils.property(locator, "personennummer", sourcePersonennummer), sourcePersonennummer));
                copy.setPersonennummer(copyPersonennummer);
            } else {
                copy.personennummer = null;
            }
            if (this.freitextfeld!= null) {
                String sourceFreitextfeld;
                sourceFreitextfeld = this.getFreitextfeld();
                String copyFreitextfeld = ((String) strategy.copy(LocatorUtils.property(locator, "freitextfeld", sourceFreitextfeld), sourceFreitextfeld));
                copy.setFreitextfeld(copyFreitextfeld);
            } else {
                copy.freitextfeld = null;
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
            if ((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty())) {
                List<UserDefinedExtend> sourceUserDefinedExtend;
                sourceUserDefinedExtend = (((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))?this.getUserDefinedExtend():null);
                @SuppressWarnings("unchecked")
                List<UserDefinedExtend> copyUserDefinedExtend = ((List<UserDefinedExtend> ) strategy.copy(LocatorUtils.property(locator, "userDefinedExtend", sourceUserDefinedExtend), sourceUserDefinedExtend));
                copy.userDefinedExtend = null;
                if (copyUserDefinedExtend!= null) {
                    List<UserDefinedExtend> uniqueUserDefinedExtendl = copy.getUserDefinedExtend();
                    uniqueUserDefinedExtendl.addAll(copyUserDefinedExtend);
                }
            } else {
                copy.userDefinedExtend = null;
            }
            if (this.adressart!= null) {
                String sourceAdressart;
                sourceAdressart = this.getAdressart();
                String copyAdressart = ((String) strategy.copy(LocatorUtils.property(locator, "adressart", sourceAdressart), sourceAdressart));
                copy.setAdressart(copyAdressart);
            } else {
                copy.adressart = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new WeitereAdresse();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vorname", lhsVorname), LocatorUtils.property(thatLocator, "vorname", rhsVorname), lhsVorname, rhsVorname)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            String lhsTitel;
            lhsTitel = this.getTitel();
            String rhsTitel;
            rhsTitel = that.getTitel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "titel", lhsTitel), LocatorUtils.property(thatLocator, "titel", rhsTitel), lhsTitel, rhsTitel)) {
                return false;
            }
        }
        {
            String lhsAnrede;
            lhsAnrede = this.getAnrede();
            String rhsAnrede;
            rhsAnrede = that.getAnrede();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anrede", lhsAnrede), LocatorUtils.property(thatLocator, "anrede", rhsAnrede), lhsAnrede, rhsAnrede)) {
                return false;
            }
        }
        {
            String lhsAnredeBrief;
            lhsAnredeBrief = this.getAnredeBrief();
            String rhsAnredeBrief;
            rhsAnredeBrief = that.getAnredeBrief();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anredeBrief", lhsAnredeBrief), LocatorUtils.property(thatLocator, "anredeBrief", rhsAnredeBrief), lhsAnredeBrief, rhsAnredeBrief)) {
                return false;
            }
        }
        {
            String lhsFirma;
            lhsFirma = this.getFirma();
            String rhsFirma;
            rhsFirma = that.getFirma();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firma", lhsFirma), LocatorUtils.property(thatLocator, "firma", rhsFirma), lhsFirma, rhsFirma)) {
                return false;
            }
        }
        {
            Object lhsZusatzfeld;
            lhsZusatzfeld = this.getZusatzfeld();
            Object rhsZusatzfeld;
            rhsZusatzfeld = that.getZusatzfeld();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zusatzfeld", lhsZusatzfeld), LocatorUtils.property(thatLocator, "zusatzfeld", rhsZusatzfeld), lhsZusatzfeld, rhsZusatzfeld)) {
                return false;
            }
        }
        {
            String lhsStrasse;
            lhsStrasse = this.getStrasse();
            String rhsStrasse;
            rhsStrasse = that.getStrasse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "strasse", lhsStrasse), LocatorUtils.property(thatLocator, "strasse", rhsStrasse), lhsStrasse, rhsStrasse)) {
                return false;
            }
        }
        {
            String lhsHausnummer;
            lhsHausnummer = this.getHausnummer();
            String rhsHausnummer;
            rhsHausnummer = that.getHausnummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hausnummer", lhsHausnummer), LocatorUtils.property(thatLocator, "hausnummer", rhsHausnummer), lhsHausnummer, rhsHausnummer)) {
                return false;
            }
        }
        {
            String lhsPlz;
            lhsPlz = this.getPlz();
            String rhsPlz;
            rhsPlz = that.getPlz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "plz", lhsPlz), LocatorUtils.property(thatLocator, "plz", rhsPlz), lhsPlz, rhsPlz)) {
                return false;
            }
        }
        {
            String lhsOrt;
            lhsOrt = this.getOrt();
            String rhsOrt;
            rhsOrt = that.getOrt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ort", lhsOrt), LocatorUtils.property(thatLocator, "ort", rhsOrt), lhsOrt, rhsOrt)) {
                return false;
            }
        }
        {
            String lhsPostfach;
            lhsPostfach = this.getPostfach();
            String rhsPostfach;
            rhsPostfach = that.getPostfach();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postfach", lhsPostfach), LocatorUtils.property(thatLocator, "postfach", rhsPostfach), lhsPostfach, rhsPostfach)) {
                return false;
            }
        }
        {
            String lhsPostfPlz;
            lhsPostfPlz = this.getPostfPlz();
            String rhsPostfPlz;
            rhsPostfPlz = that.getPostfPlz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postfPlz", lhsPostfPlz), LocatorUtils.property(thatLocator, "postfPlz", rhsPostfPlz), lhsPostfPlz, rhsPostfPlz)) {
                return false;
            }
        }
        {
            String lhsPostfOrt;
            lhsPostfOrt = this.getPostfOrt();
            String rhsPostfOrt;
            rhsPostfOrt = that.getPostfOrt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postfOrt", lhsPostfOrt), LocatorUtils.property(thatLocator, "postfOrt", rhsPostfOrt), lhsPostfOrt, rhsPostfOrt)) {
                return false;
            }
        }
        {
            Land lhsLand;
            lhsLand = this.getLand();
            Land rhsLand;
            rhsLand = that.getLand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "land", lhsLand), LocatorUtils.property(thatLocator, "land", rhsLand), lhsLand, rhsLand)) {
                return false;
            }
        }
        {
            String lhsEmailZentrale;
            lhsEmailZentrale = this.getEmailZentrale();
            String rhsEmailZentrale;
            rhsEmailZentrale = that.getEmailZentrale();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emailZentrale", lhsEmailZentrale), LocatorUtils.property(thatLocator, "emailZentrale", rhsEmailZentrale), lhsEmailZentrale, rhsEmailZentrale)) {
                return false;
            }
        }
        {
            String lhsEmailDirekt;
            lhsEmailDirekt = this.getEmailDirekt();
            String rhsEmailDirekt;
            rhsEmailDirekt = that.getEmailDirekt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emailDirekt", lhsEmailDirekt), LocatorUtils.property(thatLocator, "emailDirekt", rhsEmailDirekt), lhsEmailDirekt, rhsEmailDirekt)) {
                return false;
            }
        }
        {
            String lhsEmailPrivat;
            lhsEmailPrivat = this.getEmailPrivat();
            String rhsEmailPrivat;
            rhsEmailPrivat = that.getEmailPrivat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emailPrivat", lhsEmailPrivat), LocatorUtils.property(thatLocator, "emailPrivat", rhsEmailPrivat), lhsEmailPrivat, rhsEmailPrivat)) {
                return false;
            }
        }
        {
            List<EmailSonstige> lhsEmailSonstige;
            lhsEmailSonstige = (((this.emailSonstige!= null)&&(!this.emailSonstige.isEmpty()))?this.getEmailSonstige():null);
            List<EmailSonstige> rhsEmailSonstige;
            rhsEmailSonstige = (((that.emailSonstige!= null)&&(!that.emailSonstige.isEmpty()))?that.getEmailSonstige():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emailSonstige", lhsEmailSonstige), LocatorUtils.property(thatLocator, "emailSonstige", rhsEmailSonstige), lhsEmailSonstige, rhsEmailSonstige)) {
                return false;
            }
        }
        {
            String lhsTelDurchw;
            lhsTelDurchw = this.getTelDurchw();
            String rhsTelDurchw;
            rhsTelDurchw = that.getTelDurchw();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telDurchw", lhsTelDurchw), LocatorUtils.property(thatLocator, "telDurchw", rhsTelDurchw), lhsTelDurchw, rhsTelDurchw)) {
                return false;
            }
        }
        {
            String lhsTelZentrale;
            lhsTelZentrale = this.getTelZentrale();
            String rhsTelZentrale;
            rhsTelZentrale = that.getTelZentrale();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telZentrale", lhsTelZentrale), LocatorUtils.property(thatLocator, "telZentrale", rhsTelZentrale), lhsTelZentrale, rhsTelZentrale)) {
                return false;
            }
        }
        {
            String lhsTelHandy;
            lhsTelHandy = this.getTelHandy();
            String rhsTelHandy;
            rhsTelHandy = that.getTelHandy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telHandy", lhsTelHandy), LocatorUtils.property(thatLocator, "telHandy", rhsTelHandy), lhsTelHandy, rhsTelHandy)) {
                return false;
            }
        }
        {
            String lhsTelFax;
            lhsTelFax = this.getTelFax();
            String rhsTelFax;
            rhsTelFax = that.getTelFax();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telFax", lhsTelFax), LocatorUtils.property(thatLocator, "telFax", rhsTelFax), lhsTelFax, rhsTelFax)) {
                return false;
            }
        }
        {
            String lhsTelPrivat;
            lhsTelPrivat = this.getTelPrivat();
            String rhsTelPrivat;
            rhsTelPrivat = that.getTelPrivat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telPrivat", lhsTelPrivat), LocatorUtils.property(thatLocator, "telPrivat", rhsTelPrivat), lhsTelPrivat, rhsTelPrivat)) {
                return false;
            }
        }
        {
            List<TelSonstige> lhsTelSonstige;
            lhsTelSonstige = (((this.telSonstige!= null)&&(!this.telSonstige.isEmpty()))?this.getTelSonstige():null);
            List<TelSonstige> rhsTelSonstige;
            rhsTelSonstige = (((that.telSonstige!= null)&&(!that.telSonstige.isEmpty()))?that.getTelSonstige():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telSonstige", lhsTelSonstige), LocatorUtils.property(thatLocator, "telSonstige", rhsTelSonstige), lhsTelSonstige, rhsTelSonstige)) {
                return false;
            }
        }
        {
            String lhsUrl;
            lhsUrl = this.getUrl();
            String rhsUrl;
            rhsUrl = that.getUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "url", lhsUrl), LocatorUtils.property(thatLocator, "url", rhsUrl), lhsUrl, rhsUrl)) {
                return false;
            }
        }
        {
            Boolean lhsAdressfreigabe;
            lhsAdressfreigabe = this.isAdressfreigabe();
            Boolean rhsAdressfreigabe;
            rhsAdressfreigabe = that.isAdressfreigabe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adressfreigabe", lhsAdressfreigabe), LocatorUtils.property(thatLocator, "adressfreigabe", rhsAdressfreigabe), lhsAdressfreigabe, rhsAdressfreigabe)) {
                return false;
            }
        }
        {
            String lhsPersonennummer;
            lhsPersonennummer = this.getPersonennummer();
            String rhsPersonennummer;
            rhsPersonennummer = that.getPersonennummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "personennummer", lhsPersonennummer), LocatorUtils.property(thatLocator, "personennummer", rhsPersonennummer), lhsPersonennummer, rhsPersonennummer)) {
                return false;
            }
        }
        {
            String lhsFreitextfeld;
            lhsFreitextfeld = this.getFreitextfeld();
            String rhsFreitextfeld;
            rhsFreitextfeld = that.getFreitextfeld();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freitextfeld", lhsFreitextfeld), LocatorUtils.property(thatLocator, "freitextfeld", rhsFreitextfeld), lhsFreitextfeld, rhsFreitextfeld)) {
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
        {
            List<UserDefinedExtend> lhsUserDefinedExtend;
            lhsUserDefinedExtend = (((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))?this.getUserDefinedExtend():null);
            List<UserDefinedExtend> rhsUserDefinedExtend;
            rhsUserDefinedExtend = (((that.userDefinedExtend!= null)&&(!that.userDefinedExtend.isEmpty()))?that.getUserDefinedExtend():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefinedExtend", lhsUserDefinedExtend), LocatorUtils.property(thatLocator, "userDefinedExtend", rhsUserDefinedExtend), lhsUserDefinedExtend, rhsUserDefinedExtend)) {
                return false;
            }
        }
        {
            String lhsAdressart;
            lhsAdressart = this.getAdressart();
            String rhsAdressart;
            rhsAdressart = that.getAdressart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adressart", lhsAdressart), LocatorUtils.property(thatLocator, "adressart", rhsAdressart), lhsAdressart, rhsAdressart)) {
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
