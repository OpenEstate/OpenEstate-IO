
package org.openestate.io.openimmo.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="portal_unique_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="portal_obj_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anbieter_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oobj_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zusatz_refnr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expose_url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vermarktungsart" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bezeichnung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="etage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="whg_nr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strasse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="land" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stadtbezirk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gebot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wae" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anzahl_zimmer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flaeche" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}interessent" maxOccurs="unbounded"/>
 *         &lt;element ref="{}user_defined_extend" maxOccurs="unbounded" minOccurs="0"/>
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
    "portalUniqueId",
    "portalObjId",
    "anbieterId",
    "oobjId",
    "zusatzRefnr",
    "exposeUrl",
    "vermarktungsart",
    "bezeichnung",
    "etage",
    "whgNr",
    "strasse",
    "ort",
    "land",
    "stadtbezirk",
    "preis",
    "gebot",
    "wae",
    "anzahlZimmer",
    "flaeche",
    "interessent",
    "userDefinedExtend"
})
@XmlRootElement(name = "objekt")
public class Objekt
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "portal_unique_id")
    protected String portalUniqueId;
    @XmlElement(name = "portal_obj_id")
    protected String portalObjId;
    @XmlElement(name = "anbieter_id")
    protected String anbieterId;
    @XmlElement(name = "oobj_id")
    protected String oobjId;
    @XmlElement(name = "zusatz_refnr")
    protected String zusatzRefnr;
    @XmlElement(name = "expose_url")
    protected String exposeUrl;
    protected List<String> vermarktungsart;
    protected String bezeichnung;
    protected String etage;
    @XmlElement(name = "whg_nr")
    protected String whgNr;
    protected String strasse;
    protected String ort;
    protected String land;
    protected String stadtbezirk;
    protected String preis;
    protected String gebot;
    protected String wae;
    @XmlElement(name = "anzahl_zimmer")
    protected String anzahlZimmer;
    protected String flaeche;
    @XmlElement(required = true)
    protected List<Interessent> interessent;
    @XmlElement(name = "user_defined_extend")
    protected List<UserDefinedExtend> userDefinedExtend;

    /**
     * Gets the value of the portalUniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortalUniqueId() {
        return portalUniqueId;
    }

    /**
     * Sets the value of the portalUniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortalUniqueId(String value) {
        this.portalUniqueId = value;
    }

    /**
     * Gets the value of the portalObjId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortalObjId() {
        return portalObjId;
    }

    /**
     * Sets the value of the portalObjId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortalObjId(String value) {
        this.portalObjId = value;
    }

    /**
     * Gets the value of the anbieterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnbieterId() {
        return anbieterId;
    }

    /**
     * Sets the value of the anbieterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnbieterId(String value) {
        this.anbieterId = value;
    }

    /**
     * Gets the value of the oobjId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOobjId() {
        return oobjId;
    }

    /**
     * Sets the value of the oobjId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOobjId(String value) {
        this.oobjId = value;
    }

    /**
     * Gets the value of the zusatzRefnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZusatzRefnr() {
        return zusatzRefnr;
    }

    /**
     * Sets the value of the zusatzRefnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZusatzRefnr(String value) {
        this.zusatzRefnr = value;
    }

    /**
     * Gets the value of the exposeUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExposeUrl() {
        return exposeUrl;
    }

    /**
     * Sets the value of the exposeUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExposeUrl(String value) {
        this.exposeUrl = value;
    }

    /**
     * Gets the value of the vermarktungsart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vermarktungsart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVermarktungsart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVermarktungsart() {
        if (vermarktungsart == null) {
            vermarktungsart = new ArrayList<String>();
        }
        return this.vermarktungsart;
    }

    /**
     * Gets the value of the bezeichnung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Sets the value of the bezeichnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBezeichnung(String value) {
        this.bezeichnung = value;
    }

    /**
     * Gets the value of the etage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtage() {
        return etage;
    }

    /**
     * Sets the value of the etage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtage(String value) {
        this.etage = value;
    }

    /**
     * Gets the value of the whgNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhgNr() {
        return whgNr;
    }

    /**
     * Sets the value of the whgNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhgNr(String value) {
        this.whgNr = value;
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
     * Gets the value of the land property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLand() {
        return land;
    }

    /**
     * Sets the value of the land property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLand(String value) {
        this.land = value;
    }

    /**
     * Gets the value of the stadtbezirk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStadtbezirk() {
        return stadtbezirk;
    }

    /**
     * Sets the value of the stadtbezirk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStadtbezirk(String value) {
        this.stadtbezirk = value;
    }

    /**
     * Gets the value of the preis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreis() {
        return preis;
    }

    /**
     * Sets the value of the preis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreis(String value) {
        this.preis = value;
    }

    /**
     * Gets the value of the gebot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGebot() {
        return gebot;
    }

    /**
     * Sets the value of the gebot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGebot(String value) {
        this.gebot = value;
    }

    /**
     * Gets the value of the wae property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWae() {
        return wae;
    }

    /**
     * Sets the value of the wae property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWae(String value) {
        this.wae = value;
    }

    /**
     * Gets the value of the anzahlZimmer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnzahlZimmer() {
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
    public void setAnzahlZimmer(String value) {
        this.anzahlZimmer = value;
    }

    /**
     * Gets the value of the flaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlaeche() {
        return flaeche;
    }

    /**
     * Sets the value of the flaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlaeche(String value) {
        this.flaeche = value;
    }

    /**
     * Gets the value of the interessent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interessent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInteressent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Interessent }
     * 
     * 
     */
    public List<Interessent> getInteressent() {
        if (interessent == null) {
            interessent = new ArrayList<Interessent>();
        }
        return this.interessent;
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
            String thePortalUniqueId;
            thePortalUniqueId = this.getPortalUniqueId();
            strategy.appendField(locator, this, "portalUniqueId", buffer, thePortalUniqueId);
        }
        {
            String thePortalObjId;
            thePortalObjId = this.getPortalObjId();
            strategy.appendField(locator, this, "portalObjId", buffer, thePortalObjId);
        }
        {
            String theAnbieterId;
            theAnbieterId = this.getAnbieterId();
            strategy.appendField(locator, this, "anbieterId", buffer, theAnbieterId);
        }
        {
            String theOobjId;
            theOobjId = this.getOobjId();
            strategy.appendField(locator, this, "oobjId", buffer, theOobjId);
        }
        {
            String theZusatzRefnr;
            theZusatzRefnr = this.getZusatzRefnr();
            strategy.appendField(locator, this, "zusatzRefnr", buffer, theZusatzRefnr);
        }
        {
            String theExposeUrl;
            theExposeUrl = this.getExposeUrl();
            strategy.appendField(locator, this, "exposeUrl", buffer, theExposeUrl);
        }
        {
            List<String> theVermarktungsart;
            theVermarktungsart = (((this.vermarktungsart!= null)&&(!this.vermarktungsart.isEmpty()))?this.getVermarktungsart():null);
            strategy.appendField(locator, this, "vermarktungsart", buffer, theVermarktungsart);
        }
        {
            String theBezeichnung;
            theBezeichnung = this.getBezeichnung();
            strategy.appendField(locator, this, "bezeichnung", buffer, theBezeichnung);
        }
        {
            String theEtage;
            theEtage = this.getEtage();
            strategy.appendField(locator, this, "etage", buffer, theEtage);
        }
        {
            String theWhgNr;
            theWhgNr = this.getWhgNr();
            strategy.appendField(locator, this, "whgNr", buffer, theWhgNr);
        }
        {
            String theStrasse;
            theStrasse = this.getStrasse();
            strategy.appendField(locator, this, "strasse", buffer, theStrasse);
        }
        {
            String theOrt;
            theOrt = this.getOrt();
            strategy.appendField(locator, this, "ort", buffer, theOrt);
        }
        {
            String theLand;
            theLand = this.getLand();
            strategy.appendField(locator, this, "land", buffer, theLand);
        }
        {
            String theStadtbezirk;
            theStadtbezirk = this.getStadtbezirk();
            strategy.appendField(locator, this, "stadtbezirk", buffer, theStadtbezirk);
        }
        {
            String thePreis;
            thePreis = this.getPreis();
            strategy.appendField(locator, this, "preis", buffer, thePreis);
        }
        {
            String theGebot;
            theGebot = this.getGebot();
            strategy.appendField(locator, this, "gebot", buffer, theGebot);
        }
        {
            String theWae;
            theWae = this.getWae();
            strategy.appendField(locator, this, "wae", buffer, theWae);
        }
        {
            String theAnzahlZimmer;
            theAnzahlZimmer = this.getAnzahlZimmer();
            strategy.appendField(locator, this, "anzahlZimmer", buffer, theAnzahlZimmer);
        }
        {
            String theFlaeche;
            theFlaeche = this.getFlaeche();
            strategy.appendField(locator, this, "flaeche", buffer, theFlaeche);
        }
        {
            List<Interessent> theInteressent;
            theInteressent = (((this.interessent!= null)&&(!this.interessent.isEmpty()))?this.getInteressent():null);
            strategy.appendField(locator, this, "interessent", buffer, theInteressent);
        }
        {
            List<UserDefinedExtend> theUserDefinedExtend;
            theUserDefinedExtend = (((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))?this.getUserDefinedExtend():null);
            strategy.appendField(locator, this, "userDefinedExtend", buffer, theUserDefinedExtend);
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
        if (draftCopy instanceof Objekt) {
            final Objekt copy = ((Objekt) draftCopy);
            if (this.portalUniqueId!= null) {
                String sourcePortalUniqueId;
                sourcePortalUniqueId = this.getPortalUniqueId();
                String copyPortalUniqueId = ((String) strategy.copy(LocatorUtils.property(locator, "portalUniqueId", sourcePortalUniqueId), sourcePortalUniqueId));
                copy.setPortalUniqueId(copyPortalUniqueId);
            } else {
                copy.portalUniqueId = null;
            }
            if (this.portalObjId!= null) {
                String sourcePortalObjId;
                sourcePortalObjId = this.getPortalObjId();
                String copyPortalObjId = ((String) strategy.copy(LocatorUtils.property(locator, "portalObjId", sourcePortalObjId), sourcePortalObjId));
                copy.setPortalObjId(copyPortalObjId);
            } else {
                copy.portalObjId = null;
            }
            if (this.anbieterId!= null) {
                String sourceAnbieterId;
                sourceAnbieterId = this.getAnbieterId();
                String copyAnbieterId = ((String) strategy.copy(LocatorUtils.property(locator, "anbieterId", sourceAnbieterId), sourceAnbieterId));
                copy.setAnbieterId(copyAnbieterId);
            } else {
                copy.anbieterId = null;
            }
            if (this.oobjId!= null) {
                String sourceOobjId;
                sourceOobjId = this.getOobjId();
                String copyOobjId = ((String) strategy.copy(LocatorUtils.property(locator, "oobjId", sourceOobjId), sourceOobjId));
                copy.setOobjId(copyOobjId);
            } else {
                copy.oobjId = null;
            }
            if (this.zusatzRefnr!= null) {
                String sourceZusatzRefnr;
                sourceZusatzRefnr = this.getZusatzRefnr();
                String copyZusatzRefnr = ((String) strategy.copy(LocatorUtils.property(locator, "zusatzRefnr", sourceZusatzRefnr), sourceZusatzRefnr));
                copy.setZusatzRefnr(copyZusatzRefnr);
            } else {
                copy.zusatzRefnr = null;
            }
            if (this.exposeUrl!= null) {
                String sourceExposeUrl;
                sourceExposeUrl = this.getExposeUrl();
                String copyExposeUrl = ((String) strategy.copy(LocatorUtils.property(locator, "exposeUrl", sourceExposeUrl), sourceExposeUrl));
                copy.setExposeUrl(copyExposeUrl);
            } else {
                copy.exposeUrl = null;
            }
            if ((this.vermarktungsart!= null)&&(!this.vermarktungsart.isEmpty())) {
                List<String> sourceVermarktungsart;
                sourceVermarktungsart = (((this.vermarktungsart!= null)&&(!this.vermarktungsart.isEmpty()))?this.getVermarktungsart():null);
                @SuppressWarnings("unchecked")
                List<String> copyVermarktungsart = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "vermarktungsart", sourceVermarktungsart), sourceVermarktungsart));
                copy.vermarktungsart = null;
                if (copyVermarktungsart!= null) {
                    List<String> uniqueVermarktungsartl = copy.getVermarktungsart();
                    uniqueVermarktungsartl.addAll(copyVermarktungsart);
                }
            } else {
                copy.vermarktungsart = null;
            }
            if (this.bezeichnung!= null) {
                String sourceBezeichnung;
                sourceBezeichnung = this.getBezeichnung();
                String copyBezeichnung = ((String) strategy.copy(LocatorUtils.property(locator, "bezeichnung", sourceBezeichnung), sourceBezeichnung));
                copy.setBezeichnung(copyBezeichnung);
            } else {
                copy.bezeichnung = null;
            }
            if (this.etage!= null) {
                String sourceEtage;
                sourceEtage = this.getEtage();
                String copyEtage = ((String) strategy.copy(LocatorUtils.property(locator, "etage", sourceEtage), sourceEtage));
                copy.setEtage(copyEtage);
            } else {
                copy.etage = null;
            }
            if (this.whgNr!= null) {
                String sourceWhgNr;
                sourceWhgNr = this.getWhgNr();
                String copyWhgNr = ((String) strategy.copy(LocatorUtils.property(locator, "whgNr", sourceWhgNr), sourceWhgNr));
                copy.setWhgNr(copyWhgNr);
            } else {
                copy.whgNr = null;
            }
            if (this.strasse!= null) {
                String sourceStrasse;
                sourceStrasse = this.getStrasse();
                String copyStrasse = ((String) strategy.copy(LocatorUtils.property(locator, "strasse", sourceStrasse), sourceStrasse));
                copy.setStrasse(copyStrasse);
            } else {
                copy.strasse = null;
            }
            if (this.ort!= null) {
                String sourceOrt;
                sourceOrt = this.getOrt();
                String copyOrt = ((String) strategy.copy(LocatorUtils.property(locator, "ort", sourceOrt), sourceOrt));
                copy.setOrt(copyOrt);
            } else {
                copy.ort = null;
            }
            if (this.land!= null) {
                String sourceLand;
                sourceLand = this.getLand();
                String copyLand = ((String) strategy.copy(LocatorUtils.property(locator, "land", sourceLand), sourceLand));
                copy.setLand(copyLand);
            } else {
                copy.land = null;
            }
            if (this.stadtbezirk!= null) {
                String sourceStadtbezirk;
                sourceStadtbezirk = this.getStadtbezirk();
                String copyStadtbezirk = ((String) strategy.copy(LocatorUtils.property(locator, "stadtbezirk", sourceStadtbezirk), sourceStadtbezirk));
                copy.setStadtbezirk(copyStadtbezirk);
            } else {
                copy.stadtbezirk = null;
            }
            if (this.preis!= null) {
                String sourcePreis;
                sourcePreis = this.getPreis();
                String copyPreis = ((String) strategy.copy(LocatorUtils.property(locator, "preis", sourcePreis), sourcePreis));
                copy.setPreis(copyPreis);
            } else {
                copy.preis = null;
            }
            if (this.gebot!= null) {
                String sourceGebot;
                sourceGebot = this.getGebot();
                String copyGebot = ((String) strategy.copy(LocatorUtils.property(locator, "gebot", sourceGebot), sourceGebot));
                copy.setGebot(copyGebot);
            } else {
                copy.gebot = null;
            }
            if (this.wae!= null) {
                String sourceWae;
                sourceWae = this.getWae();
                String copyWae = ((String) strategy.copy(LocatorUtils.property(locator, "wae", sourceWae), sourceWae));
                copy.setWae(copyWae);
            } else {
                copy.wae = null;
            }
            if (this.anzahlZimmer!= null) {
                String sourceAnzahlZimmer;
                sourceAnzahlZimmer = this.getAnzahlZimmer();
                String copyAnzahlZimmer = ((String) strategy.copy(LocatorUtils.property(locator, "anzahlZimmer", sourceAnzahlZimmer), sourceAnzahlZimmer));
                copy.setAnzahlZimmer(copyAnzahlZimmer);
            } else {
                copy.anzahlZimmer = null;
            }
            if (this.flaeche!= null) {
                String sourceFlaeche;
                sourceFlaeche = this.getFlaeche();
                String copyFlaeche = ((String) strategy.copy(LocatorUtils.property(locator, "flaeche", sourceFlaeche), sourceFlaeche));
                copy.setFlaeche(copyFlaeche);
            } else {
                copy.flaeche = null;
            }
            if ((this.interessent!= null)&&(!this.interessent.isEmpty())) {
                List<Interessent> sourceInteressent;
                sourceInteressent = (((this.interessent!= null)&&(!this.interessent.isEmpty()))?this.getInteressent():null);
                @SuppressWarnings("unchecked")
                List<Interessent> copyInteressent = ((List<Interessent> ) strategy.copy(LocatorUtils.property(locator, "interessent", sourceInteressent), sourceInteressent));
                copy.interessent = null;
                if (copyInteressent!= null) {
                    List<Interessent> uniqueInteressentl = copy.getInteressent();
                    uniqueInteressentl.addAll(copyInteressent);
                }
            } else {
                copy.interessent = null;
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
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Objekt();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Objekt)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Objekt that = ((Objekt) object);
        {
            String lhsPortalUniqueId;
            lhsPortalUniqueId = this.getPortalUniqueId();
            String rhsPortalUniqueId;
            rhsPortalUniqueId = that.getPortalUniqueId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "portalUniqueId", lhsPortalUniqueId), LocatorUtils.property(thatLocator, "portalUniqueId", rhsPortalUniqueId), lhsPortalUniqueId, rhsPortalUniqueId)) {
                return false;
            }
        }
        {
            String lhsPortalObjId;
            lhsPortalObjId = this.getPortalObjId();
            String rhsPortalObjId;
            rhsPortalObjId = that.getPortalObjId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "portalObjId", lhsPortalObjId), LocatorUtils.property(thatLocator, "portalObjId", rhsPortalObjId), lhsPortalObjId, rhsPortalObjId)) {
                return false;
            }
        }
        {
            String lhsAnbieterId;
            lhsAnbieterId = this.getAnbieterId();
            String rhsAnbieterId;
            rhsAnbieterId = that.getAnbieterId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anbieterId", lhsAnbieterId), LocatorUtils.property(thatLocator, "anbieterId", rhsAnbieterId), lhsAnbieterId, rhsAnbieterId)) {
                return false;
            }
        }
        {
            String lhsOobjId;
            lhsOobjId = this.getOobjId();
            String rhsOobjId;
            rhsOobjId = that.getOobjId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oobjId", lhsOobjId), LocatorUtils.property(thatLocator, "oobjId", rhsOobjId), lhsOobjId, rhsOobjId)) {
                return false;
            }
        }
        {
            String lhsZusatzRefnr;
            lhsZusatzRefnr = this.getZusatzRefnr();
            String rhsZusatzRefnr;
            rhsZusatzRefnr = that.getZusatzRefnr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zusatzRefnr", lhsZusatzRefnr), LocatorUtils.property(thatLocator, "zusatzRefnr", rhsZusatzRefnr), lhsZusatzRefnr, rhsZusatzRefnr)) {
                return false;
            }
        }
        {
            String lhsExposeUrl;
            lhsExposeUrl = this.getExposeUrl();
            String rhsExposeUrl;
            rhsExposeUrl = that.getExposeUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exposeUrl", lhsExposeUrl), LocatorUtils.property(thatLocator, "exposeUrl", rhsExposeUrl), lhsExposeUrl, rhsExposeUrl)) {
                return false;
            }
        }
        {
            List<String> lhsVermarktungsart;
            lhsVermarktungsart = (((this.vermarktungsart!= null)&&(!this.vermarktungsart.isEmpty()))?this.getVermarktungsart():null);
            List<String> rhsVermarktungsart;
            rhsVermarktungsart = (((that.vermarktungsart!= null)&&(!that.vermarktungsart.isEmpty()))?that.getVermarktungsart():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vermarktungsart", lhsVermarktungsart), LocatorUtils.property(thatLocator, "vermarktungsart", rhsVermarktungsart), lhsVermarktungsart, rhsVermarktungsart)) {
                return false;
            }
        }
        {
            String lhsBezeichnung;
            lhsBezeichnung = this.getBezeichnung();
            String rhsBezeichnung;
            rhsBezeichnung = that.getBezeichnung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bezeichnung", lhsBezeichnung), LocatorUtils.property(thatLocator, "bezeichnung", rhsBezeichnung), lhsBezeichnung, rhsBezeichnung)) {
                return false;
            }
        }
        {
            String lhsEtage;
            lhsEtage = this.getEtage();
            String rhsEtage;
            rhsEtage = that.getEtage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "etage", lhsEtage), LocatorUtils.property(thatLocator, "etage", rhsEtage), lhsEtage, rhsEtage)) {
                return false;
            }
        }
        {
            String lhsWhgNr;
            lhsWhgNr = this.getWhgNr();
            String rhsWhgNr;
            rhsWhgNr = that.getWhgNr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "whgNr", lhsWhgNr), LocatorUtils.property(thatLocator, "whgNr", rhsWhgNr), lhsWhgNr, rhsWhgNr)) {
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
            String lhsOrt;
            lhsOrt = this.getOrt();
            String rhsOrt;
            rhsOrt = that.getOrt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ort", lhsOrt), LocatorUtils.property(thatLocator, "ort", rhsOrt), lhsOrt, rhsOrt)) {
                return false;
            }
        }
        {
            String lhsLand;
            lhsLand = this.getLand();
            String rhsLand;
            rhsLand = that.getLand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "land", lhsLand), LocatorUtils.property(thatLocator, "land", rhsLand), lhsLand, rhsLand)) {
                return false;
            }
        }
        {
            String lhsStadtbezirk;
            lhsStadtbezirk = this.getStadtbezirk();
            String rhsStadtbezirk;
            rhsStadtbezirk = that.getStadtbezirk();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stadtbezirk", lhsStadtbezirk), LocatorUtils.property(thatLocator, "stadtbezirk", rhsStadtbezirk), lhsStadtbezirk, rhsStadtbezirk)) {
                return false;
            }
        }
        {
            String lhsPreis;
            lhsPreis = this.getPreis();
            String rhsPreis;
            rhsPreis = that.getPreis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preis", lhsPreis), LocatorUtils.property(thatLocator, "preis", rhsPreis), lhsPreis, rhsPreis)) {
                return false;
            }
        }
        {
            String lhsGebot;
            lhsGebot = this.getGebot();
            String rhsGebot;
            rhsGebot = that.getGebot();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gebot", lhsGebot), LocatorUtils.property(thatLocator, "gebot", rhsGebot), lhsGebot, rhsGebot)) {
                return false;
            }
        }
        {
            String lhsWae;
            lhsWae = this.getWae();
            String rhsWae;
            rhsWae = that.getWae();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wae", lhsWae), LocatorUtils.property(thatLocator, "wae", rhsWae), lhsWae, rhsWae)) {
                return false;
            }
        }
        {
            String lhsAnzahlZimmer;
            lhsAnzahlZimmer = this.getAnzahlZimmer();
            String rhsAnzahlZimmer;
            rhsAnzahlZimmer = that.getAnzahlZimmer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlZimmer", lhsAnzahlZimmer), LocatorUtils.property(thatLocator, "anzahlZimmer", rhsAnzahlZimmer), lhsAnzahlZimmer, rhsAnzahlZimmer)) {
                return false;
            }
        }
        {
            String lhsFlaeche;
            lhsFlaeche = this.getFlaeche();
            String rhsFlaeche;
            rhsFlaeche = that.getFlaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flaeche", lhsFlaeche), LocatorUtils.property(thatLocator, "flaeche", rhsFlaeche), lhsFlaeche, rhsFlaeche)) {
                return false;
            }
        }
        {
            List<Interessent> lhsInteressent;
            lhsInteressent = (((this.interessent!= null)&&(!this.interessent.isEmpty()))?this.getInteressent():null);
            List<Interessent> rhsInteressent;
            rhsInteressent = (((that.interessent!= null)&&(!that.interessent.isEmpty()))?that.getInteressent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "interessent", lhsInteressent), LocatorUtils.property(thatLocator, "interessent", rhsInteressent), lhsInteressent, rhsInteressent)) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
