
package org.openestate.io.is24_xml.xml;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for ImmobilieBaseTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImmobilieBaseTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Adresse" type="{http://www.immobilienscout24.de/immobilientransfer}ImmobilienAdresseTyp"/&gt;
 *         &lt;element name="ManuelleGeoCodierung" type="{http://www.immobilienscout24.de/immobilientransfer}ManuellGeoCodingTyp" minOccurs="0"/&gt;
 *         &lt;element name="Kontaktperson" type="{http://www.immobilienscout24.de/immobilientransfer}KontaktAdresseTyp" minOccurs="0"/&gt;
 *         &lt;element name="ApiSuchfelder" type="{http://www.immobilienscout24.de/immobilientransfer}ApiSuchfelderTyp" minOccurs="0"/&gt;
 *         &lt;element name="Objektbeschreibung" type="{http://www.immobilienscout24.de/immobilientransfer}Freitext2000Typ" minOccurs="0"/&gt;
 *         &lt;element name="Lage" type="{http://www.immobilienscout24.de/immobilientransfer}Freitext2000Typ" minOccurs="0"/&gt;
 *         &lt;element name="Ausstattung" type="{http://www.immobilienscout24.de/immobilientransfer}Freitext2000Typ" minOccurs="0"/&gt;
 *         &lt;element name="SonstigeAngaben" type="{http://www.immobilienscout24.de/immobilientransfer}Freitext2000Typ" minOccurs="0"/&gt;
 *         &lt;element name="MultimediaAnhang" type="{http://www.immobilienscout24.de/immobilientransfer}MultimediaAnhangTyp" maxOccurs="15" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.immobilienscout24.de/immobilientransfer}ImmoAttribute"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImmobilieBaseTyp", propOrder = {
    "adresse",
    "manuelleGeoCodierung",
    "kontaktperson",
    "apiSuchfelder",
    "objektbeschreibung",
    "lage",
    "ausstattung",
    "sonstigeAngaben",
    "multimediaAnhang"
})
@XmlSeeAlso({
    WohnungTyp.class,
    HausTyp.class,
    WazTyp.class,
    GrundstueckTypBase.class,
    GewerbeImmoBaseTyp.class,
    GarageTyp.class,
    ZwangsversteigerungTyp.class,
    WGZimmerTyp.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
public abstract class ImmobilieBaseTyp implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "Adresse", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected ImmobilienAdresseTyp adresse;
    @XmlElement(name = "ManuelleGeoCodierung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected ManuellGeoCodingTyp manuelleGeoCodierung;
    @XmlElement(name = "Kontaktperson")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected KontaktAdresseTyp kontaktperson;
    @XmlElementRef(name = "ApiSuchfelder", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected JAXBElement<ApiSuchfelderTyp> apiSuchfelder;
    @XmlElement(name = "Objektbeschreibung")
    @XmlJavaTypeAdapter(Adapter15 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected String objektbeschreibung;
    @XmlElement(name = "Lage")
    @XmlJavaTypeAdapter(Adapter15 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected String lage;
    @XmlElement(name = "Ausstattung")
    @XmlJavaTypeAdapter(Adapter15 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected String ausstattung;
    @XmlElement(name = "SonstigeAngaben")
    @XmlJavaTypeAdapter(Adapter15 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected String sonstigeAngaben;
    @XmlElement(name = "MultimediaAnhang")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected List<MultimediaAnhangTyp> multimediaAnhang;
    @XmlAttribute(name = "AnbieterObjektID", required = true)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected String anbieterObjektID;
    @XmlAttribute(name = "StatusVBM")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected StatusTyp statusVBM;
    @XmlAttribute(name = "StatusIS24")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected StatusTyp statusIS24;
    @XmlAttribute(name = "StatusHP")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected StatusTyp statusHP;
    @XmlAttribute(name = "AktiveGruppen")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected String aktiveGruppen;
    @XmlAttribute(name = "Importmodus")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected AktionsTyp importmodus;
    @XmlAttribute(name = "ScoutObjektID")
    @XmlJavaTypeAdapter(Adapter26 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected BigInteger scoutObjektID;
    @XmlAttribute(name = "GruppierungsID")
    @XmlJavaTypeAdapter(Adapter25 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected Long gruppierungsID;
    @XmlAttribute(name = "Adressdruck")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean adressdruck;
    @XmlAttribute(name = "Ueberschrift", required = true)
    @XmlJavaTypeAdapter(Adapter9 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected String ueberschrift;
    @XmlAttribute(name = "Provision")
    @XmlJavaTypeAdapter(Adapter7 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected String provision;
    @XmlAttribute(name = "Provisionspflichtig")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean provisionspflichtig;
    @XmlAttribute(name = "Provisionshinweis")
    @XmlJavaTypeAdapter(Adapter14 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected String provisionshinweis;
    @XmlAttribute(name = "Waehrung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected WaehrungTyp waehrung;

    /**
     * Gets the value of the adresse property.
     * 
     * @return
     *     possible object is
     *     {@link ImmobilienAdresseTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public ImmobilienAdresseTyp getAdresse() {
        return adresse;
    }

    /**
     * Sets the value of the adresse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImmobilienAdresseTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setAdresse(ImmobilienAdresseTyp value) {
        this.adresse = value;
    }

    /**
     * Gets the value of the manuelleGeoCodierung property.
     * 
     * @return
     *     possible object is
     *     {@link ManuellGeoCodingTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public ManuellGeoCodingTyp getManuelleGeoCodierung() {
        return manuelleGeoCodierung;
    }

    /**
     * Sets the value of the manuelleGeoCodierung property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManuellGeoCodingTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setManuelleGeoCodierung(ManuellGeoCodingTyp value) {
        this.manuelleGeoCodierung = value;
    }

    /**
     * Gets the value of the kontaktperson property.
     * 
     * @return
     *     possible object is
     *     {@link KontaktAdresseTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public KontaktAdresseTyp getKontaktperson() {
        return kontaktperson;
    }

    /**
     * Sets the value of the kontaktperson property.
     * 
     * @param value
     *     allowed object is
     *     {@link KontaktAdresseTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setKontaktperson(KontaktAdresseTyp value) {
        this.kontaktperson = value;
    }

    /**
     * Gets the value of the apiSuchfelder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ApiSuchfelderTyp }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public JAXBElement<ApiSuchfelderTyp> getApiSuchfelder() {
        return apiSuchfelder;
    }

    /**
     * Sets the value of the apiSuchfelder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ApiSuchfelderTyp }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setApiSuchfelder(JAXBElement<ApiSuchfelderTyp> value) {
        this.apiSuchfelder = value;
    }

    /**
     * Gets the value of the objektbeschreibung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public String getObjektbeschreibung() {
        return objektbeschreibung;
    }

    /**
     * Sets the value of the objektbeschreibung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setObjektbeschreibung(String value) {
        this.objektbeschreibung = value;
    }

    /**
     * Gets the value of the lage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public String getLage() {
        return lage;
    }

    /**
     * Sets the value of the lage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setLage(String value) {
        this.lage = value;
    }

    /**
     * Gets the value of the ausstattung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public String getAusstattung() {
        return ausstattung;
    }

    /**
     * Sets the value of the ausstattung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setAusstattung(String value) {
        this.ausstattung = value;
    }

    /**
     * Gets the value of the sonstigeAngaben property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public String getSonstigeAngaben() {
        return sonstigeAngaben;
    }

    /**
     * Sets the value of the sonstigeAngaben property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setSonstigeAngaben(String value) {
        this.sonstigeAngaben = value;
    }

    /**
     * Gets the value of the multimediaAnhang property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multimediaAnhang property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultimediaAnhang().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultimediaAnhangTyp }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public List<MultimediaAnhangTyp> getMultimediaAnhang() {
        if (multimediaAnhang == null) {
            multimediaAnhang = new ArrayList<MultimediaAnhangTyp>();
        }
        return this.multimediaAnhang;
    }

    /**
     * Gets the value of the anbieterObjektID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public String getAnbieterObjektID() {
        return anbieterObjektID;
    }

    /**
     * Sets the value of the anbieterObjektID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setAnbieterObjektID(String value) {
        this.anbieterObjektID = value;
    }

    /**
     * Gets the value of the statusVBM property.
     * 
     * @return
     *     possible object is
     *     {@link StatusTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public StatusTyp getStatusVBM() {
        if (statusVBM == null) {
            return StatusTyp.AKTIV;
        } else {
            return statusVBM;
        }
    }

    /**
     * Sets the value of the statusVBM property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setStatusVBM(StatusTyp value) {
        this.statusVBM = value;
    }

    /**
     * Gets the value of the statusIS24 property.
     * 
     * @return
     *     possible object is
     *     {@link StatusTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public StatusTyp getStatusIS24() {
        if (statusIS24 == null) {
            return StatusTyp.AKTIV;
        } else {
            return statusIS24;
        }
    }

    /**
     * Sets the value of the statusIS24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setStatusIS24(StatusTyp value) {
        this.statusIS24 = value;
    }

    /**
     * Gets the value of the statusHP property.
     * 
     * @return
     *     possible object is
     *     {@link StatusTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public StatusTyp getStatusHP() {
        if (statusHP == null) {
            return StatusTyp.AKTIV;
        } else {
            return statusHP;
        }
    }

    /**
     * Sets the value of the statusHP property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setStatusHP(StatusTyp value) {
        this.statusHP = value;
    }

    /**
     * Gets the value of the aktiveGruppen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public String getAktiveGruppen() {
        return aktiveGruppen;
    }

    /**
     * Sets the value of the aktiveGruppen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setAktiveGruppen(String value) {
        this.aktiveGruppen = value;
    }

    /**
     * Gets the value of the importmodus property.
     * 
     * @return
     *     possible object is
     *     {@link AktionsTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public AktionsTyp getImportmodus() {
        if (importmodus == null) {
            return AktionsTyp.IMPORTIEREN;
        } else {
            return importmodus;
        }
    }

    /**
     * Sets the value of the importmodus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AktionsTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setImportmodus(AktionsTyp value) {
        this.importmodus = value;
    }

    /**
     * Gets the value of the scoutObjektID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public BigInteger getScoutObjektID() {
        return scoutObjektID;
    }

    /**
     * Sets the value of the scoutObjektID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setScoutObjektID(BigInteger value) {
        this.scoutObjektID = value;
    }

    /**
     * Gets the value of the gruppierungsID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Long getGruppierungsID() {
        return gruppierungsID;
    }

    /**
     * Sets the value of the gruppierungsID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setGruppierungsID(Long value) {
        this.gruppierungsID = value;
    }

    /**
     * Gets the value of the adressdruck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getAdressdruck() {
        if (adressdruck == null) {
            return false;
        } else {
            return adressdruck;
        }
    }

    /**
     * Sets the value of the adressdruck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setAdressdruck(Boolean value) {
        this.adressdruck = value;
    }

    /**
     * Gets the value of the ueberschrift property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public String getUeberschrift() {
        return ueberschrift;
    }

    /**
     * Sets the value of the ueberschrift property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setUeberschrift(String value) {
        this.ueberschrift = value;
    }

    /**
     * Gets the value of the provision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public String getProvision() {
        return provision;
    }

    /**
     * Sets the value of the provision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setProvision(String value) {
        this.provision = value;
    }

    /**
     * Gets the value of the provisionspflichtig property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getProvisionspflichtig() {
        return provisionspflichtig;
    }

    /**
     * Sets the value of the provisionspflichtig property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setProvisionspflichtig(Boolean value) {
        this.provisionspflichtig = value;
    }

    /**
     * Gets the value of the provisionshinweis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public String getProvisionshinweis() {
        return provisionshinweis;
    }

    /**
     * Sets the value of the provisionshinweis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setProvisionshinweis(String value) {
        this.provisionshinweis = value;
    }

    /**
     * Gets the value of the waehrung property.
     * 
     * @return
     *     possible object is
     *     {@link WaehrungTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public WaehrungTyp getWaehrung() {
        if (waehrung == null) {
            return WaehrungTyp.EUR;
        } else {
            return waehrung;
        }
    }

    /**
     * Sets the value of the waehrung property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaehrungTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setWaehrung(WaehrungTyp value) {
        this.waehrung = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            ImmobilienAdresseTyp theAdresse;
            theAdresse = this.getAdresse();
            strategy.appendField(locator, this, "adresse", buffer, theAdresse, (this.adresse!= null));
        }
        {
            ManuellGeoCodingTyp theManuelleGeoCodierung;
            theManuelleGeoCodierung = this.getManuelleGeoCodierung();
            strategy.appendField(locator, this, "manuelleGeoCodierung", buffer, theManuelleGeoCodierung, (this.manuelleGeoCodierung!= null));
        }
        {
            KontaktAdresseTyp theKontaktperson;
            theKontaktperson = this.getKontaktperson();
            strategy.appendField(locator, this, "kontaktperson", buffer, theKontaktperson, (this.kontaktperson!= null));
        }
        {
            JAXBElement<ApiSuchfelderTyp> theApiSuchfelder;
            theApiSuchfelder = this.getApiSuchfelder();
            strategy.appendField(locator, this, "apiSuchfelder", buffer, theApiSuchfelder, (this.apiSuchfelder!= null));
        }
        {
            String theObjektbeschreibung;
            theObjektbeschreibung = this.getObjektbeschreibung();
            strategy.appendField(locator, this, "objektbeschreibung", buffer, theObjektbeschreibung, (this.objektbeschreibung!= null));
        }
        {
            String theLage;
            theLage = this.getLage();
            strategy.appendField(locator, this, "lage", buffer, theLage, (this.lage!= null));
        }
        {
            String theAusstattung;
            theAusstattung = this.getAusstattung();
            strategy.appendField(locator, this, "ausstattung", buffer, theAusstattung, (this.ausstattung!= null));
        }
        {
            String theSonstigeAngaben;
            theSonstigeAngaben = this.getSonstigeAngaben();
            strategy.appendField(locator, this, "sonstigeAngaben", buffer, theSonstigeAngaben, (this.sonstigeAngaben!= null));
        }
        {
            List<MultimediaAnhangTyp> theMultimediaAnhang;
            theMultimediaAnhang = (((this.multimediaAnhang!= null)&&(!this.multimediaAnhang.isEmpty()))?this.getMultimediaAnhang():null);
            strategy.appendField(locator, this, "multimediaAnhang", buffer, theMultimediaAnhang, ((this.multimediaAnhang!= null)&&(!this.multimediaAnhang.isEmpty())));
        }
        {
            String theAnbieterObjektID;
            theAnbieterObjektID = this.getAnbieterObjektID();
            strategy.appendField(locator, this, "anbieterObjektID", buffer, theAnbieterObjektID, (this.anbieterObjektID!= null));
        }
        {
            StatusTyp theStatusVBM;
            theStatusVBM = this.getStatusVBM();
            strategy.appendField(locator, this, "statusVBM", buffer, theStatusVBM, (this.statusVBM!= null));
        }
        {
            StatusTyp theStatusIS24;
            theStatusIS24 = this.getStatusIS24();
            strategy.appendField(locator, this, "statusIS24", buffer, theStatusIS24, (this.statusIS24 != null));
        }
        {
            StatusTyp theStatusHP;
            theStatusHP = this.getStatusHP();
            strategy.appendField(locator, this, "statusHP", buffer, theStatusHP, (this.statusHP!= null));
        }
        {
            String theAktiveGruppen;
            theAktiveGruppen = this.getAktiveGruppen();
            strategy.appendField(locator, this, "aktiveGruppen", buffer, theAktiveGruppen, (this.aktiveGruppen!= null));
        }
        {
            AktionsTyp theImportmodus;
            theImportmodus = this.getImportmodus();
            strategy.appendField(locator, this, "importmodus", buffer, theImportmodus, (this.importmodus!= null));
        }
        {
            BigInteger theScoutObjektID;
            theScoutObjektID = this.getScoutObjektID();
            strategy.appendField(locator, this, "scoutObjektID", buffer, theScoutObjektID, (this.scoutObjektID!= null));
        }
        {
            Long theGruppierungsID;
            theGruppierungsID = this.getGruppierungsID();
            strategy.appendField(locator, this, "gruppierungsID", buffer, theGruppierungsID, (this.gruppierungsID!= null));
        }
        {
            Boolean theAdressdruck;
            theAdressdruck = this.getAdressdruck();
            strategy.appendField(locator, this, "adressdruck", buffer, theAdressdruck, (this.adressdruck!= null));
        }
        {
            String theUeberschrift;
            theUeberschrift = this.getUeberschrift();
            strategy.appendField(locator, this, "ueberschrift", buffer, theUeberschrift, (this.ueberschrift!= null));
        }
        {
            String theProvision;
            theProvision = this.getProvision();
            strategy.appendField(locator, this, "provision", buffer, theProvision, (this.provision!= null));
        }
        {
            Boolean theProvisionspflichtig;
            theProvisionspflichtig = this.getProvisionspflichtig();
            strategy.appendField(locator, this, "provisionspflichtig", buffer, theProvisionspflichtig, (this.provisionspflichtig!= null));
        }
        {
            String theProvisionshinweis;
            theProvisionshinweis = this.getProvisionshinweis();
            strategy.appendField(locator, this, "provisionshinweis", buffer, theProvisionshinweis, (this.provisionshinweis!= null));
        }
        {
            WaehrungTyp theWaehrung;
            theWaehrung = this.getWaehrung();
            strategy.appendField(locator, this, "waehrung", buffer, theWaehrung, (this.waehrung!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        if (target instanceof ImmobilieBaseTyp) {
            final ImmobilieBaseTyp copy = ((ImmobilieBaseTyp) target);
            {
                Boolean adresseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.adresse!= null));
                if (adresseShouldBeCopiedAndSet == Boolean.TRUE) {
                    ImmobilienAdresseTyp sourceAdresse;
                    sourceAdresse = this.getAdresse();
                    ImmobilienAdresseTyp copyAdresse = ((ImmobilienAdresseTyp) strategy.copy(LocatorUtils.property(locator, "adresse", sourceAdresse), sourceAdresse, (this.adresse!= null)));
                    copy.setAdresse(copyAdresse);
                } else {
                    if (adresseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.adresse = null;
                    }
                }
            }
            {
                Boolean manuelleGeoCodierungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.manuelleGeoCodierung!= null));
                if (manuelleGeoCodierungShouldBeCopiedAndSet == Boolean.TRUE) {
                    ManuellGeoCodingTyp sourceManuelleGeoCodierung;
                    sourceManuelleGeoCodierung = this.getManuelleGeoCodierung();
                    ManuellGeoCodingTyp copyManuelleGeoCodierung = ((ManuellGeoCodingTyp) strategy.copy(LocatorUtils.property(locator, "manuelleGeoCodierung", sourceManuelleGeoCodierung), sourceManuelleGeoCodierung, (this.manuelleGeoCodierung!= null)));
                    copy.setManuelleGeoCodierung(copyManuelleGeoCodierung);
                } else {
                    if (manuelleGeoCodierungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.manuelleGeoCodierung = null;
                    }
                }
            }
            {
                Boolean kontaktpersonShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kontaktperson!= null));
                if (kontaktpersonShouldBeCopiedAndSet == Boolean.TRUE) {
                    KontaktAdresseTyp sourceKontaktperson;
                    sourceKontaktperson = this.getKontaktperson();
                    KontaktAdresseTyp copyKontaktperson = ((KontaktAdresseTyp) strategy.copy(LocatorUtils.property(locator, "kontaktperson", sourceKontaktperson), sourceKontaktperson, (this.kontaktperson!= null)));
                    copy.setKontaktperson(copyKontaktperson);
                } else {
                    if (kontaktpersonShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kontaktperson = null;
                    }
                }
            }
            {
                Boolean apiSuchfelderShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.apiSuchfelder!= null));
                if (apiSuchfelderShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<ApiSuchfelderTyp> sourceApiSuchfelder;
                    sourceApiSuchfelder = this.getApiSuchfelder();
                    @SuppressWarnings("unchecked")
                    JAXBElement<ApiSuchfelderTyp> copyApiSuchfelder = ((JAXBElement<ApiSuchfelderTyp> ) strategy.copy(LocatorUtils.property(locator, "apiSuchfelder", sourceApiSuchfelder), sourceApiSuchfelder, (this.apiSuchfelder!= null)));
                    copy.setApiSuchfelder(copyApiSuchfelder);
                } else {
                    if (apiSuchfelderShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.apiSuchfelder = null;
                    }
                }
            }
            {
                Boolean objektbeschreibungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.objektbeschreibung!= null));
                if (objektbeschreibungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceObjektbeschreibung;
                    sourceObjektbeschreibung = this.getObjektbeschreibung();
                    String copyObjektbeschreibung = ((String) strategy.copy(LocatorUtils.property(locator, "objektbeschreibung", sourceObjektbeschreibung), sourceObjektbeschreibung, (this.objektbeschreibung!= null)));
                    copy.setObjektbeschreibung(copyObjektbeschreibung);
                } else {
                    if (objektbeschreibungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.objektbeschreibung = null;
                    }
                }
            }
            {
                Boolean lageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lage!= null));
                if (lageShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceLage;
                    sourceLage = this.getLage();
                    String copyLage = ((String) strategy.copy(LocatorUtils.property(locator, "lage", sourceLage), sourceLage, (this.lage!= null)));
                    copy.setLage(copyLage);
                } else {
                    if (lageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lage = null;
                    }
                }
            }
            {
                Boolean ausstattungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ausstattung!= null));
                if (ausstattungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAusstattung;
                    sourceAusstattung = this.getAusstattung();
                    String copyAusstattung = ((String) strategy.copy(LocatorUtils.property(locator, "ausstattung", sourceAusstattung), sourceAusstattung, (this.ausstattung!= null)));
                    copy.setAusstattung(copyAusstattung);
                } else {
                    if (ausstattungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ausstattung = null;
                    }
                }
            }
            {
                Boolean sonstigeAngabenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sonstigeAngaben!= null));
                if (sonstigeAngabenShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSonstigeAngaben;
                    sourceSonstigeAngaben = this.getSonstigeAngaben();
                    String copySonstigeAngaben = ((String) strategy.copy(LocatorUtils.property(locator, "sonstigeAngaben", sourceSonstigeAngaben), sourceSonstigeAngaben, (this.sonstigeAngaben!= null)));
                    copy.setSonstigeAngaben(copySonstigeAngaben);
                } else {
                    if (sonstigeAngabenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sonstigeAngaben = null;
                    }
                }
            }
            {
                Boolean multimediaAnhangShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.multimediaAnhang!= null)&&(!this.multimediaAnhang.isEmpty())));
                if (multimediaAnhangShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<MultimediaAnhangTyp> sourceMultimediaAnhang;
                    sourceMultimediaAnhang = (((this.multimediaAnhang!= null)&&(!this.multimediaAnhang.isEmpty()))?this.getMultimediaAnhang():null);
                    @SuppressWarnings("unchecked")
                    List<MultimediaAnhangTyp> copyMultimediaAnhang = ((List<MultimediaAnhangTyp> ) strategy.copy(LocatorUtils.property(locator, "multimediaAnhang", sourceMultimediaAnhang), sourceMultimediaAnhang, ((this.multimediaAnhang!= null)&&(!this.multimediaAnhang.isEmpty()))));
                    copy.multimediaAnhang = null;
                    if (copyMultimediaAnhang!= null) {
                        List<MultimediaAnhangTyp> uniqueMultimediaAnhangl = copy.getMultimediaAnhang();
                        uniqueMultimediaAnhangl.addAll(copyMultimediaAnhang);
                    }
                } else {
                    if (multimediaAnhangShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.multimediaAnhang = null;
                    }
                }
            }
            {
                Boolean anbieterObjektIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anbieterObjektID!= null));
                if (anbieterObjektIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAnbieterObjektID;
                    sourceAnbieterObjektID = this.getAnbieterObjektID();
                    String copyAnbieterObjektID = ((String) strategy.copy(LocatorUtils.property(locator, "anbieterObjektID", sourceAnbieterObjektID), sourceAnbieterObjektID, (this.anbieterObjektID!= null)));
                    copy.setAnbieterObjektID(copyAnbieterObjektID);
                } else {
                    if (anbieterObjektIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anbieterObjektID = null;
                    }
                }
            }
            {
                Boolean statusVBMShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.statusVBM!= null));
                if (statusVBMShouldBeCopiedAndSet == Boolean.TRUE) {
                    StatusTyp sourceStatusVBM;
                    sourceStatusVBM = this.getStatusVBM();
                    StatusTyp copyStatusVBM = ((StatusTyp) strategy.copy(LocatorUtils.property(locator, "statusVBM", sourceStatusVBM), sourceStatusVBM, (this.statusVBM!= null)));
                    copy.setStatusVBM(copyStatusVBM);
                } else {
                    if (statusVBMShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.statusVBM = null;
                    }
                }
            }
            {
                Boolean statusIS24ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.statusIS24 != null));
                if (statusIS24ShouldBeCopiedAndSet == Boolean.TRUE) {
                    StatusTyp sourceStatusIS24;
                    sourceStatusIS24 = this.getStatusIS24();
                    StatusTyp copyStatusIS24 = ((StatusTyp) strategy.copy(LocatorUtils.property(locator, "statusIS24", sourceStatusIS24), sourceStatusIS24, (this.statusIS24 != null)));
                    copy.setStatusIS24(copyStatusIS24);
                } else {
                    if (statusIS24ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.statusIS24 = null;
                    }
                }
            }
            {
                Boolean statusHPShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.statusHP!= null));
                if (statusHPShouldBeCopiedAndSet == Boolean.TRUE) {
                    StatusTyp sourceStatusHP;
                    sourceStatusHP = this.getStatusHP();
                    StatusTyp copyStatusHP = ((StatusTyp) strategy.copy(LocatorUtils.property(locator, "statusHP", sourceStatusHP), sourceStatusHP, (this.statusHP!= null)));
                    copy.setStatusHP(copyStatusHP);
                } else {
                    if (statusHPShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.statusHP = null;
                    }
                }
            }
            {
                Boolean aktiveGruppenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.aktiveGruppen!= null));
                if (aktiveGruppenShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAktiveGruppen;
                    sourceAktiveGruppen = this.getAktiveGruppen();
                    String copyAktiveGruppen = ((String) strategy.copy(LocatorUtils.property(locator, "aktiveGruppen", sourceAktiveGruppen), sourceAktiveGruppen, (this.aktiveGruppen!= null)));
                    copy.setAktiveGruppen(copyAktiveGruppen);
                } else {
                    if (aktiveGruppenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.aktiveGruppen = null;
                    }
                }
            }
            {
                Boolean importmodusShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.importmodus!= null));
                if (importmodusShouldBeCopiedAndSet == Boolean.TRUE) {
                    AktionsTyp sourceImportmodus;
                    sourceImportmodus = this.getImportmodus();
                    AktionsTyp copyImportmodus = ((AktionsTyp) strategy.copy(LocatorUtils.property(locator, "importmodus", sourceImportmodus), sourceImportmodus, (this.importmodus!= null)));
                    copy.setImportmodus(copyImportmodus);
                } else {
                    if (importmodusShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.importmodus = null;
                    }
                }
            }
            {
                Boolean scoutObjektIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.scoutObjektID!= null));
                if (scoutObjektIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceScoutObjektID;
                    sourceScoutObjektID = this.getScoutObjektID();
                    BigInteger copyScoutObjektID = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "scoutObjektID", sourceScoutObjektID), sourceScoutObjektID, (this.scoutObjektID!= null)));
                    copy.setScoutObjektID(copyScoutObjektID);
                } else {
                    if (scoutObjektIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.scoutObjektID = null;
                    }
                }
            }
            {
                Boolean gruppierungsIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gruppierungsID!= null));
                if (gruppierungsIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceGruppierungsID;
                    sourceGruppierungsID = this.getGruppierungsID();
                    Long copyGruppierungsID = ((Long) strategy.copy(LocatorUtils.property(locator, "gruppierungsID", sourceGruppierungsID), sourceGruppierungsID, (this.gruppierungsID!= null)));
                    copy.setGruppierungsID(copyGruppierungsID);
                } else {
                    if (gruppierungsIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gruppierungsID = null;
                    }
                }
            }
            {
                Boolean adressdruckShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.adressdruck!= null));
                if (adressdruckShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceAdressdruck;
                    sourceAdressdruck = this.getAdressdruck();
                    Boolean copyAdressdruck = ((Boolean) strategy.copy(LocatorUtils.property(locator, "adressdruck", sourceAdressdruck), sourceAdressdruck, (this.adressdruck!= null)));
                    copy.setAdressdruck(copyAdressdruck);
                } else {
                    if (adressdruckShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.adressdruck = null;
                    }
                }
            }
            {
                Boolean ueberschriftShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ueberschrift!= null));
                if (ueberschriftShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceUeberschrift;
                    sourceUeberschrift = this.getUeberschrift();
                    String copyUeberschrift = ((String) strategy.copy(LocatorUtils.property(locator, "ueberschrift", sourceUeberschrift), sourceUeberschrift, (this.ueberschrift!= null)));
                    copy.setUeberschrift(copyUeberschrift);
                } else {
                    if (ueberschriftShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ueberschrift = null;
                    }
                }
            }
            {
                Boolean provisionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.provision!= null));
                if (provisionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceProvision;
                    sourceProvision = this.getProvision();
                    String copyProvision = ((String) strategy.copy(LocatorUtils.property(locator, "provision", sourceProvision), sourceProvision, (this.provision!= null)));
                    copy.setProvision(copyProvision);
                } else {
                    if (provisionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.provision = null;
                    }
                }
            }
            {
                Boolean provisionspflichtigShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.provisionspflichtig!= null));
                if (provisionspflichtigShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceProvisionspflichtig;
                    sourceProvisionspflichtig = this.getProvisionspflichtig();
                    Boolean copyProvisionspflichtig = ((Boolean) strategy.copy(LocatorUtils.property(locator, "provisionspflichtig", sourceProvisionspflichtig), sourceProvisionspflichtig, (this.provisionspflichtig!= null)));
                    copy.setProvisionspflichtig(copyProvisionspflichtig);
                } else {
                    if (provisionspflichtigShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.provisionspflichtig = null;
                    }
                }
            }
            {
                Boolean provisionshinweisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.provisionshinweis!= null));
                if (provisionshinweisShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceProvisionshinweis;
                    sourceProvisionshinweis = this.getProvisionshinweis();
                    String copyProvisionshinweis = ((String) strategy.copy(LocatorUtils.property(locator, "provisionshinweis", sourceProvisionshinweis), sourceProvisionshinweis, (this.provisionshinweis!= null)));
                    copy.setProvisionshinweis(copyProvisionshinweis);
                } else {
                    if (provisionshinweisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.provisionshinweis = null;
                    }
                }
            }
            {
                Boolean waehrungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.waehrung!= null));
                if (waehrungShouldBeCopiedAndSet == Boolean.TRUE) {
                    WaehrungTyp sourceWaehrung;
                    sourceWaehrung = this.getWaehrung();
                    WaehrungTyp copyWaehrung = ((WaehrungTyp) strategy.copy(LocatorUtils.property(locator, "waehrung", sourceWaehrung), sourceWaehrung, (this.waehrung!= null)));
                    copy.setWaehrung(copyWaehrung);
                } else {
                    if (waehrungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.waehrung = null;
                    }
                }
            }
        }
        return target;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ImmobilieBaseTyp that = ((ImmobilieBaseTyp) object);
        {
            ImmobilienAdresseTyp lhsAdresse;
            lhsAdresse = this.getAdresse();
            ImmobilienAdresseTyp rhsAdresse;
            rhsAdresse = that.getAdresse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adresse", lhsAdresse), LocatorUtils.property(thatLocator, "adresse", rhsAdresse), lhsAdresse, rhsAdresse, (this.adresse!= null), (that.adresse!= null))) {
                return false;
            }
        }
        {
            ManuellGeoCodingTyp lhsManuelleGeoCodierung;
            lhsManuelleGeoCodierung = this.getManuelleGeoCodierung();
            ManuellGeoCodingTyp rhsManuelleGeoCodierung;
            rhsManuelleGeoCodierung = that.getManuelleGeoCodierung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manuelleGeoCodierung", lhsManuelleGeoCodierung), LocatorUtils.property(thatLocator, "manuelleGeoCodierung", rhsManuelleGeoCodierung), lhsManuelleGeoCodierung, rhsManuelleGeoCodierung, (this.manuelleGeoCodierung!= null), (that.manuelleGeoCodierung!= null))) {
                return false;
            }
        }
        {
            KontaktAdresseTyp lhsKontaktperson;
            lhsKontaktperson = this.getKontaktperson();
            KontaktAdresseTyp rhsKontaktperson;
            rhsKontaktperson = that.getKontaktperson();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kontaktperson", lhsKontaktperson), LocatorUtils.property(thatLocator, "kontaktperson", rhsKontaktperson), lhsKontaktperson, rhsKontaktperson, (this.kontaktperson!= null), (that.kontaktperson!= null))) {
                return false;
            }
        }
        {
            JAXBElement<ApiSuchfelderTyp> lhsApiSuchfelder;
            lhsApiSuchfelder = this.getApiSuchfelder();
            JAXBElement<ApiSuchfelderTyp> rhsApiSuchfelder;
            rhsApiSuchfelder = that.getApiSuchfelder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "apiSuchfelder", lhsApiSuchfelder), LocatorUtils.property(thatLocator, "apiSuchfelder", rhsApiSuchfelder), lhsApiSuchfelder, rhsApiSuchfelder, (this.apiSuchfelder!= null), (that.apiSuchfelder!= null))) {
                return false;
            }
        }
        {
            String lhsObjektbeschreibung;
            lhsObjektbeschreibung = this.getObjektbeschreibung();
            String rhsObjektbeschreibung;
            rhsObjektbeschreibung = that.getObjektbeschreibung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektbeschreibung", lhsObjektbeschreibung), LocatorUtils.property(thatLocator, "objektbeschreibung", rhsObjektbeschreibung), lhsObjektbeschreibung, rhsObjektbeschreibung, (this.objektbeschreibung!= null), (that.objektbeschreibung!= null))) {
                return false;
            }
        }
        {
            String lhsLage;
            lhsLage = this.getLage();
            String rhsLage;
            rhsLage = that.getLage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lage", lhsLage), LocatorUtils.property(thatLocator, "lage", rhsLage), lhsLage, rhsLage, (this.lage!= null), (that.lage!= null))) {
                return false;
            }
        }
        {
            String lhsAusstattung;
            lhsAusstattung = this.getAusstattung();
            String rhsAusstattung;
            rhsAusstattung = that.getAusstattung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ausstattung", lhsAusstattung), LocatorUtils.property(thatLocator, "ausstattung", rhsAusstattung), lhsAusstattung, rhsAusstattung, (this.ausstattung!= null), (that.ausstattung!= null))) {
                return false;
            }
        }
        {
            String lhsSonstigeAngaben;
            lhsSonstigeAngaben = this.getSonstigeAngaben();
            String rhsSonstigeAngaben;
            rhsSonstigeAngaben = that.getSonstigeAngaben();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sonstigeAngaben", lhsSonstigeAngaben), LocatorUtils.property(thatLocator, "sonstigeAngaben", rhsSonstigeAngaben), lhsSonstigeAngaben, rhsSonstigeAngaben, (this.sonstigeAngaben!= null), (that.sonstigeAngaben!= null))) {
                return false;
            }
        }
        {
            List<MultimediaAnhangTyp> lhsMultimediaAnhang;
            lhsMultimediaAnhang = (((this.multimediaAnhang!= null)&&(!this.multimediaAnhang.isEmpty()))?this.getMultimediaAnhang():null);
            List<MultimediaAnhangTyp> rhsMultimediaAnhang;
            rhsMultimediaAnhang = (((that.multimediaAnhang!= null)&&(!that.multimediaAnhang.isEmpty()))?that.getMultimediaAnhang():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "multimediaAnhang", lhsMultimediaAnhang), LocatorUtils.property(thatLocator, "multimediaAnhang", rhsMultimediaAnhang), lhsMultimediaAnhang, rhsMultimediaAnhang, ((this.multimediaAnhang!= null)&&(!this.multimediaAnhang.isEmpty())), ((that.multimediaAnhang!= null)&&(!that.multimediaAnhang.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsAnbieterObjektID;
            lhsAnbieterObjektID = this.getAnbieterObjektID();
            String rhsAnbieterObjektID;
            rhsAnbieterObjektID = that.getAnbieterObjektID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anbieterObjektID", lhsAnbieterObjektID), LocatorUtils.property(thatLocator, "anbieterObjektID", rhsAnbieterObjektID), lhsAnbieterObjektID, rhsAnbieterObjektID, (this.anbieterObjektID!= null), (that.anbieterObjektID!= null))) {
                return false;
            }
        }
        {
            StatusTyp lhsStatusVBM;
            lhsStatusVBM = this.getStatusVBM();
            StatusTyp rhsStatusVBM;
            rhsStatusVBM = that.getStatusVBM();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statusVBM", lhsStatusVBM), LocatorUtils.property(thatLocator, "statusVBM", rhsStatusVBM), lhsStatusVBM, rhsStatusVBM, (this.statusVBM!= null), (that.statusVBM!= null))) {
                return false;
            }
        }
        {
            StatusTyp lhsStatusIS24;
            lhsStatusIS24 = this.getStatusIS24();
            StatusTyp rhsStatusIS24;
            rhsStatusIS24 = that.getStatusIS24();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statusIS24", lhsStatusIS24), LocatorUtils.property(thatLocator, "statusIS24", rhsStatusIS24), lhsStatusIS24, rhsStatusIS24, (this.statusIS24 != null), (that.statusIS24 != null))) {
                return false;
            }
        }
        {
            StatusTyp lhsStatusHP;
            lhsStatusHP = this.getStatusHP();
            StatusTyp rhsStatusHP;
            rhsStatusHP = that.getStatusHP();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statusHP", lhsStatusHP), LocatorUtils.property(thatLocator, "statusHP", rhsStatusHP), lhsStatusHP, rhsStatusHP, (this.statusHP!= null), (that.statusHP!= null))) {
                return false;
            }
        }
        {
            String lhsAktiveGruppen;
            lhsAktiveGruppen = this.getAktiveGruppen();
            String rhsAktiveGruppen;
            rhsAktiveGruppen = that.getAktiveGruppen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aktiveGruppen", lhsAktiveGruppen), LocatorUtils.property(thatLocator, "aktiveGruppen", rhsAktiveGruppen), lhsAktiveGruppen, rhsAktiveGruppen, (this.aktiveGruppen!= null), (that.aktiveGruppen!= null))) {
                return false;
            }
        }
        {
            AktionsTyp lhsImportmodus;
            lhsImportmodus = this.getImportmodus();
            AktionsTyp rhsImportmodus;
            rhsImportmodus = that.getImportmodus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "importmodus", lhsImportmodus), LocatorUtils.property(thatLocator, "importmodus", rhsImportmodus), lhsImportmodus, rhsImportmodus, (this.importmodus!= null), (that.importmodus!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsScoutObjektID;
            lhsScoutObjektID = this.getScoutObjektID();
            BigInteger rhsScoutObjektID;
            rhsScoutObjektID = that.getScoutObjektID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scoutObjektID", lhsScoutObjektID), LocatorUtils.property(thatLocator, "scoutObjektID", rhsScoutObjektID), lhsScoutObjektID, rhsScoutObjektID, (this.scoutObjektID!= null), (that.scoutObjektID!= null))) {
                return false;
            }
        }
        {
            Long lhsGruppierungsID;
            lhsGruppierungsID = this.getGruppierungsID();
            Long rhsGruppierungsID;
            rhsGruppierungsID = that.getGruppierungsID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gruppierungsID", lhsGruppierungsID), LocatorUtils.property(thatLocator, "gruppierungsID", rhsGruppierungsID), lhsGruppierungsID, rhsGruppierungsID, (this.gruppierungsID!= null), (that.gruppierungsID!= null))) {
                return false;
            }
        }
        {
            Boolean lhsAdressdruck;
            lhsAdressdruck = this.getAdressdruck();
            Boolean rhsAdressdruck;
            rhsAdressdruck = that.getAdressdruck();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adressdruck", lhsAdressdruck), LocatorUtils.property(thatLocator, "adressdruck", rhsAdressdruck), lhsAdressdruck, rhsAdressdruck, (this.adressdruck!= null), (that.adressdruck!= null))) {
                return false;
            }
        }
        {
            String lhsUeberschrift;
            lhsUeberschrift = this.getUeberschrift();
            String rhsUeberschrift;
            rhsUeberschrift = that.getUeberschrift();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ueberschrift", lhsUeberschrift), LocatorUtils.property(thatLocator, "ueberschrift", rhsUeberschrift), lhsUeberschrift, rhsUeberschrift, (this.ueberschrift!= null), (that.ueberschrift!= null))) {
                return false;
            }
        }
        {
            String lhsProvision;
            lhsProvision = this.getProvision();
            String rhsProvision;
            rhsProvision = that.getProvision();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "provision", lhsProvision), LocatorUtils.property(thatLocator, "provision", rhsProvision), lhsProvision, rhsProvision, (this.provision!= null), (that.provision!= null))) {
                return false;
            }
        }
        {
            Boolean lhsProvisionspflichtig;
            lhsProvisionspflichtig = this.getProvisionspflichtig();
            Boolean rhsProvisionspflichtig;
            rhsProvisionspflichtig = that.getProvisionspflichtig();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "provisionspflichtig", lhsProvisionspflichtig), LocatorUtils.property(thatLocator, "provisionspflichtig", rhsProvisionspflichtig), lhsProvisionspflichtig, rhsProvisionspflichtig, (this.provisionspflichtig!= null), (that.provisionspflichtig!= null))) {
                return false;
            }
        }
        {
            String lhsProvisionshinweis;
            lhsProvisionshinweis = this.getProvisionshinweis();
            String rhsProvisionshinweis;
            rhsProvisionshinweis = that.getProvisionshinweis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "provisionshinweis", lhsProvisionshinweis), LocatorUtils.property(thatLocator, "provisionshinweis", rhsProvisionshinweis), lhsProvisionshinweis, rhsProvisionshinweis, (this.provisionshinweis!= null), (that.provisionshinweis!= null))) {
                return false;
            }
        }
        {
            WaehrungTyp lhsWaehrung;
            lhsWaehrung = this.getWaehrung();
            WaehrungTyp rhsWaehrung;
            rhsWaehrung = that.getWaehrung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waehrung", lhsWaehrung), LocatorUtils.property(thatLocator, "waehrung", rhsWaehrung), lhsWaehrung, rhsWaehrung, (this.waehrung!= null), (that.waehrung!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
