
package org.openestate.io.is24_xml.xml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
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
public abstract class ImmobilieBaseTyp implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "Adresse", required = true)
    protected ImmobilienAdresseTyp adresse;
    @XmlElement(name = "ManuelleGeoCodierung")
    protected ManuellGeoCodingTyp manuelleGeoCodierung;
    @XmlElement(name = "Kontaktperson")
    protected KontaktAdresseTyp kontaktperson;
    @XmlElementRef(name = "ApiSuchfelder", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class)
    protected JAXBElement<ApiSuchfelderTyp> apiSuchfelder;
    @XmlElement(name = "Objektbeschreibung")
    @XmlJavaTypeAdapter(Adapter15 .class)
    protected String objektbeschreibung;
    @XmlElement(name = "Lage")
    @XmlJavaTypeAdapter(Adapter15 .class)
    protected String lage;
    @XmlElement(name = "Ausstattung")
    @XmlJavaTypeAdapter(Adapter15 .class)
    protected String ausstattung;
    @XmlElement(name = "SonstigeAngaben")
    @XmlJavaTypeAdapter(Adapter15 .class)
    protected String sonstigeAngaben;
    @XmlElement(name = "MultimediaAnhang")
    protected List<MultimediaAnhangTyp> multimediaAnhang;
    @XmlAttribute(name = "AnbieterObjektID", required = true)
    @XmlJavaTypeAdapter(Adapter7 .class)
    protected String anbieterObjektID;
    @XmlAttribute(name = "StatusVBM")
    protected StatusTyp statusVBM;
    @XmlAttribute(name = "StatusIS24")
    protected StatusTyp statusIS24;
    @XmlAttribute(name = "StatusHP")
    protected StatusTyp statusHP;
    @XmlAttribute(name = "AktiveGruppen")
    protected String aktiveGruppen;
    @XmlAttribute(name = "Importmodus")
    protected AktionsTyp importmodus;
    @XmlAttribute(name = "ScoutObjektID")
    @XmlJavaTypeAdapter(Adapter26 .class)
    protected BigInteger scoutObjektID;
    @XmlAttribute(name = "GruppierungsID")
    @XmlJavaTypeAdapter(Adapter25 .class)
    protected Long gruppierungsID;
    @XmlAttribute(name = "Adressdruck")
    protected Boolean adressdruck;
    @XmlAttribute(name = "Ueberschrift", required = true)
    @XmlJavaTypeAdapter(Adapter9 .class)
    protected String ueberschrift;
    @XmlAttribute(name = "Provision")
    @XmlJavaTypeAdapter(Adapter7 .class)
    protected String provision;
    @XmlAttribute(name = "Provisionspflichtig")
    protected Boolean provisionspflichtig;
    @XmlAttribute(name = "Provisionshinweis")
    @XmlJavaTypeAdapter(Adapter14 .class)
    protected String provisionshinweis;
    @XmlAttribute(name = "Waehrung")
    protected WaehrungTyp waehrung;

    /**
     * Gets the value of the adresse property.
     * 
     * @return
     *     possible object is
     *     {@link ImmobilienAdresseTyp }
     *     
     */
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
    public boolean isAdressdruck() {
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
    public Boolean isProvisionspflichtig() {
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
    public void setWaehrung(WaehrungTyp value) {
        this.waehrung = value;
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
            ImmobilienAdresseTyp theAdresse;
            theAdresse = this.getAdresse();
            strategy.appendField(locator, this, "adresse", buffer, theAdresse);
        }
        {
            ManuellGeoCodingTyp theManuelleGeoCodierung;
            theManuelleGeoCodierung = this.getManuelleGeoCodierung();
            strategy.appendField(locator, this, "manuelleGeoCodierung", buffer, theManuelleGeoCodierung);
        }
        {
            KontaktAdresseTyp theKontaktperson;
            theKontaktperson = this.getKontaktperson();
            strategy.appendField(locator, this, "kontaktperson", buffer, theKontaktperson);
        }
        {
            JAXBElement<ApiSuchfelderTyp> theApiSuchfelder;
            theApiSuchfelder = this.getApiSuchfelder();
            strategy.appendField(locator, this, "apiSuchfelder", buffer, theApiSuchfelder);
        }
        {
            String theObjektbeschreibung;
            theObjektbeschreibung = this.getObjektbeschreibung();
            strategy.appendField(locator, this, "objektbeschreibung", buffer, theObjektbeschreibung);
        }
        {
            String theLage;
            theLage = this.getLage();
            strategy.appendField(locator, this, "lage", buffer, theLage);
        }
        {
            String theAusstattung;
            theAusstattung = this.getAusstattung();
            strategy.appendField(locator, this, "ausstattung", buffer, theAusstattung);
        }
        {
            String theSonstigeAngaben;
            theSonstigeAngaben = this.getSonstigeAngaben();
            strategy.appendField(locator, this, "sonstigeAngaben", buffer, theSonstigeAngaben);
        }
        {
            List<MultimediaAnhangTyp> theMultimediaAnhang;
            theMultimediaAnhang = (((this.multimediaAnhang!= null)&&(!this.multimediaAnhang.isEmpty()))?this.getMultimediaAnhang():null);
            strategy.appendField(locator, this, "multimediaAnhang", buffer, theMultimediaAnhang);
        }
        {
            String theAnbieterObjektID;
            theAnbieterObjektID = this.getAnbieterObjektID();
            strategy.appendField(locator, this, "anbieterObjektID", buffer, theAnbieterObjektID);
        }
        {
            StatusTyp theStatusVBM;
            theStatusVBM = this.getStatusVBM();
            strategy.appendField(locator, this, "statusVBM", buffer, theStatusVBM);
        }
        {
            StatusTyp theStatusIS24;
            theStatusIS24 = this.getStatusIS24();
            strategy.appendField(locator, this, "statusIS24", buffer, theStatusIS24);
        }
        {
            StatusTyp theStatusHP;
            theStatusHP = this.getStatusHP();
            strategy.appendField(locator, this, "statusHP", buffer, theStatusHP);
        }
        {
            String theAktiveGruppen;
            theAktiveGruppen = this.getAktiveGruppen();
            strategy.appendField(locator, this, "aktiveGruppen", buffer, theAktiveGruppen);
        }
        {
            AktionsTyp theImportmodus;
            theImportmodus = this.getImportmodus();
            strategy.appendField(locator, this, "importmodus", buffer, theImportmodus);
        }
        {
            BigInteger theScoutObjektID;
            theScoutObjektID = this.getScoutObjektID();
            strategy.appendField(locator, this, "scoutObjektID", buffer, theScoutObjektID);
        }
        {
            Long theGruppierungsID;
            theGruppierungsID = this.getGruppierungsID();
            strategy.appendField(locator, this, "gruppierungsID", buffer, theGruppierungsID);
        }
        {
            boolean theAdressdruck;
            theAdressdruck = ((this.adressdruck!= null)?this.isAdressdruck():false);
            strategy.appendField(locator, this, "adressdruck", buffer, theAdressdruck);
        }
        {
            String theUeberschrift;
            theUeberschrift = this.getUeberschrift();
            strategy.appendField(locator, this, "ueberschrift", buffer, theUeberschrift);
        }
        {
            String theProvision;
            theProvision = this.getProvision();
            strategy.appendField(locator, this, "provision", buffer, theProvision);
        }
        {
            Boolean theProvisionspflichtig;
            theProvisionspflichtig = this.isProvisionspflichtig();
            strategy.appendField(locator, this, "provisionspflichtig", buffer, theProvisionspflichtig);
        }
        {
            String theProvisionshinweis;
            theProvisionshinweis = this.getProvisionshinweis();
            strategy.appendField(locator, this, "provisionshinweis", buffer, theProvisionshinweis);
        }
        {
            WaehrungTyp theWaehrung;
            theWaehrung = this.getWaehrung();
            strategy.appendField(locator, this, "waehrung", buffer, theWaehrung);
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        if (target instanceof ImmobilieBaseTyp) {
            final ImmobilieBaseTyp copy = ((ImmobilieBaseTyp) target);
            if (this.adresse!= null) {
                ImmobilienAdresseTyp sourceAdresse;
                sourceAdresse = this.getAdresse();
                ImmobilienAdresseTyp copyAdresse = ((ImmobilienAdresseTyp) strategy.copy(LocatorUtils.property(locator, "adresse", sourceAdresse), sourceAdresse));
                copy.setAdresse(copyAdresse);
            } else {
                copy.adresse = null;
            }
            if (this.manuelleGeoCodierung!= null) {
                ManuellGeoCodingTyp sourceManuelleGeoCodierung;
                sourceManuelleGeoCodierung = this.getManuelleGeoCodierung();
                ManuellGeoCodingTyp copyManuelleGeoCodierung = ((ManuellGeoCodingTyp) strategy.copy(LocatorUtils.property(locator, "manuelleGeoCodierung", sourceManuelleGeoCodierung), sourceManuelleGeoCodierung));
                copy.setManuelleGeoCodierung(copyManuelleGeoCodierung);
            } else {
                copy.manuelleGeoCodierung = null;
            }
            if (this.kontaktperson!= null) {
                KontaktAdresseTyp sourceKontaktperson;
                sourceKontaktperson = this.getKontaktperson();
                KontaktAdresseTyp copyKontaktperson = ((KontaktAdresseTyp) strategy.copy(LocatorUtils.property(locator, "kontaktperson", sourceKontaktperson), sourceKontaktperson));
                copy.setKontaktperson(copyKontaktperson);
            } else {
                copy.kontaktperson = null;
            }
            if (this.apiSuchfelder!= null) {
                JAXBElement<ApiSuchfelderTyp> sourceApiSuchfelder;
                sourceApiSuchfelder = this.getApiSuchfelder();
                @SuppressWarnings("unchecked")
                JAXBElement<ApiSuchfelderTyp> copyApiSuchfelder = ((JAXBElement<ApiSuchfelderTyp> ) strategy.copy(LocatorUtils.property(locator, "apiSuchfelder", sourceApiSuchfelder), sourceApiSuchfelder));
                copy.setApiSuchfelder(copyApiSuchfelder);
            } else {
                copy.apiSuchfelder = null;
            }
            if (this.objektbeschreibung!= null) {
                String sourceObjektbeschreibung;
                sourceObjektbeschreibung = this.getObjektbeschreibung();
                String copyObjektbeschreibung = ((String) strategy.copy(LocatorUtils.property(locator, "objektbeschreibung", sourceObjektbeschreibung), sourceObjektbeschreibung));
                copy.setObjektbeschreibung(copyObjektbeschreibung);
            } else {
                copy.objektbeschreibung = null;
            }
            if (this.lage!= null) {
                String sourceLage;
                sourceLage = this.getLage();
                String copyLage = ((String) strategy.copy(LocatorUtils.property(locator, "lage", sourceLage), sourceLage));
                copy.setLage(copyLage);
            } else {
                copy.lage = null;
            }
            if (this.ausstattung!= null) {
                String sourceAusstattung;
                sourceAusstattung = this.getAusstattung();
                String copyAusstattung = ((String) strategy.copy(LocatorUtils.property(locator, "ausstattung", sourceAusstattung), sourceAusstattung));
                copy.setAusstattung(copyAusstattung);
            } else {
                copy.ausstattung = null;
            }
            if (this.sonstigeAngaben!= null) {
                String sourceSonstigeAngaben;
                sourceSonstigeAngaben = this.getSonstigeAngaben();
                String copySonstigeAngaben = ((String) strategy.copy(LocatorUtils.property(locator, "sonstigeAngaben", sourceSonstigeAngaben), sourceSonstigeAngaben));
                copy.setSonstigeAngaben(copySonstigeAngaben);
            } else {
                copy.sonstigeAngaben = null;
            }
            if ((this.multimediaAnhang!= null)&&(!this.multimediaAnhang.isEmpty())) {
                List<MultimediaAnhangTyp> sourceMultimediaAnhang;
                sourceMultimediaAnhang = (((this.multimediaAnhang!= null)&&(!this.multimediaAnhang.isEmpty()))?this.getMultimediaAnhang():null);
                @SuppressWarnings("unchecked")
                List<MultimediaAnhangTyp> copyMultimediaAnhang = ((List<MultimediaAnhangTyp> ) strategy.copy(LocatorUtils.property(locator, "multimediaAnhang", sourceMultimediaAnhang), sourceMultimediaAnhang));
                copy.multimediaAnhang = null;
                if (copyMultimediaAnhang!= null) {
                    List<MultimediaAnhangTyp> uniqueMultimediaAnhangl = copy.getMultimediaAnhang();
                    uniqueMultimediaAnhangl.addAll(copyMultimediaAnhang);
                }
            } else {
                copy.multimediaAnhang = null;
            }
            if (this.anbieterObjektID!= null) {
                String sourceAnbieterObjektID;
                sourceAnbieterObjektID = this.getAnbieterObjektID();
                String copyAnbieterObjektID = ((String) strategy.copy(LocatorUtils.property(locator, "anbieterObjektID", sourceAnbieterObjektID), sourceAnbieterObjektID));
                copy.setAnbieterObjektID(copyAnbieterObjektID);
            } else {
                copy.anbieterObjektID = null;
            }
            if (this.statusVBM!= null) {
                StatusTyp sourceStatusVBM;
                sourceStatusVBM = this.getStatusVBM();
                StatusTyp copyStatusVBM = ((StatusTyp) strategy.copy(LocatorUtils.property(locator, "statusVBM", sourceStatusVBM), sourceStatusVBM));
                copy.setStatusVBM(copyStatusVBM);
            } else {
                copy.statusVBM = null;
            }
            if (this.statusIS24 != null) {
                StatusTyp sourceStatusIS24;
                sourceStatusIS24 = this.getStatusIS24();
                StatusTyp copyStatusIS24 = ((StatusTyp) strategy.copy(LocatorUtils.property(locator, "statusIS24", sourceStatusIS24), sourceStatusIS24));
                copy.setStatusIS24(copyStatusIS24);
            } else {
                copy.statusIS24 = null;
            }
            if (this.statusHP!= null) {
                StatusTyp sourceStatusHP;
                sourceStatusHP = this.getStatusHP();
                StatusTyp copyStatusHP = ((StatusTyp) strategy.copy(LocatorUtils.property(locator, "statusHP", sourceStatusHP), sourceStatusHP));
                copy.setStatusHP(copyStatusHP);
            } else {
                copy.statusHP = null;
            }
            if (this.aktiveGruppen!= null) {
                String sourceAktiveGruppen;
                sourceAktiveGruppen = this.getAktiveGruppen();
                String copyAktiveGruppen = ((String) strategy.copy(LocatorUtils.property(locator, "aktiveGruppen", sourceAktiveGruppen), sourceAktiveGruppen));
                copy.setAktiveGruppen(copyAktiveGruppen);
            } else {
                copy.aktiveGruppen = null;
            }
            if (this.importmodus!= null) {
                AktionsTyp sourceImportmodus;
                sourceImportmodus = this.getImportmodus();
                AktionsTyp copyImportmodus = ((AktionsTyp) strategy.copy(LocatorUtils.property(locator, "importmodus", sourceImportmodus), sourceImportmodus));
                copy.setImportmodus(copyImportmodus);
            } else {
                copy.importmodus = null;
            }
            if (this.scoutObjektID!= null) {
                BigInteger sourceScoutObjektID;
                sourceScoutObjektID = this.getScoutObjektID();
                BigInteger copyScoutObjektID = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "scoutObjektID", sourceScoutObjektID), sourceScoutObjektID));
                copy.setScoutObjektID(copyScoutObjektID);
            } else {
                copy.scoutObjektID = null;
            }
            if (this.gruppierungsID!= null) {
                Long sourceGruppierungsID;
                sourceGruppierungsID = this.getGruppierungsID();
                Long copyGruppierungsID = ((Long) strategy.copy(LocatorUtils.property(locator, "gruppierungsID", sourceGruppierungsID), sourceGruppierungsID));
                copy.setGruppierungsID(copyGruppierungsID);
            } else {
                copy.gruppierungsID = null;
            }
            if (this.adressdruck!= null) {
                boolean sourceAdressdruck;
                sourceAdressdruck = ((this.adressdruck!= null)?this.isAdressdruck():false);
                boolean copyAdressdruck = strategy.copy(LocatorUtils.property(locator, "adressdruck", sourceAdressdruck), sourceAdressdruck);
                copy.setAdressdruck(copyAdressdruck);
            } else {
                copy.adressdruck = null;
            }
            if (this.ueberschrift!= null) {
                String sourceUeberschrift;
                sourceUeberschrift = this.getUeberschrift();
                String copyUeberschrift = ((String) strategy.copy(LocatorUtils.property(locator, "ueberschrift", sourceUeberschrift), sourceUeberschrift));
                copy.setUeberschrift(copyUeberschrift);
            } else {
                copy.ueberschrift = null;
            }
            if (this.provision!= null) {
                String sourceProvision;
                sourceProvision = this.getProvision();
                String copyProvision = ((String) strategy.copy(LocatorUtils.property(locator, "provision", sourceProvision), sourceProvision));
                copy.setProvision(copyProvision);
            } else {
                copy.provision = null;
            }
            if (this.provisionspflichtig!= null) {
                Boolean sourceProvisionspflichtig;
                sourceProvisionspflichtig = this.isProvisionspflichtig();
                Boolean copyProvisionspflichtig = ((Boolean) strategy.copy(LocatorUtils.property(locator, "provisionspflichtig", sourceProvisionspflichtig), sourceProvisionspflichtig));
                copy.setProvisionspflichtig(copyProvisionspflichtig);
            } else {
                copy.provisionspflichtig = null;
            }
            if (this.provisionshinweis!= null) {
                String sourceProvisionshinweis;
                sourceProvisionshinweis = this.getProvisionshinweis();
                String copyProvisionshinweis = ((String) strategy.copy(LocatorUtils.property(locator, "provisionshinweis", sourceProvisionshinweis), sourceProvisionshinweis));
                copy.setProvisionshinweis(copyProvisionshinweis);
            } else {
                copy.provisionshinweis = null;
            }
            if (this.waehrung!= null) {
                WaehrungTyp sourceWaehrung;
                sourceWaehrung = this.getWaehrung();
                WaehrungTyp copyWaehrung = ((WaehrungTyp) strategy.copy(LocatorUtils.property(locator, "waehrung", sourceWaehrung), sourceWaehrung));
                copy.setWaehrung(copyWaehrung);
            } else {
                copy.waehrung = null;
            }
        }
        return target;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adresse", lhsAdresse), LocatorUtils.property(thatLocator, "adresse", rhsAdresse), lhsAdresse, rhsAdresse)) {
                return false;
            }
        }
        {
            ManuellGeoCodingTyp lhsManuelleGeoCodierung;
            lhsManuelleGeoCodierung = this.getManuelleGeoCodierung();
            ManuellGeoCodingTyp rhsManuelleGeoCodierung;
            rhsManuelleGeoCodierung = that.getManuelleGeoCodierung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manuelleGeoCodierung", lhsManuelleGeoCodierung), LocatorUtils.property(thatLocator, "manuelleGeoCodierung", rhsManuelleGeoCodierung), lhsManuelleGeoCodierung, rhsManuelleGeoCodierung)) {
                return false;
            }
        }
        {
            KontaktAdresseTyp lhsKontaktperson;
            lhsKontaktperson = this.getKontaktperson();
            KontaktAdresseTyp rhsKontaktperson;
            rhsKontaktperson = that.getKontaktperson();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kontaktperson", lhsKontaktperson), LocatorUtils.property(thatLocator, "kontaktperson", rhsKontaktperson), lhsKontaktperson, rhsKontaktperson)) {
                return false;
            }
        }
        {
            JAXBElement<ApiSuchfelderTyp> lhsApiSuchfelder;
            lhsApiSuchfelder = this.getApiSuchfelder();
            JAXBElement<ApiSuchfelderTyp> rhsApiSuchfelder;
            rhsApiSuchfelder = that.getApiSuchfelder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "apiSuchfelder", lhsApiSuchfelder), LocatorUtils.property(thatLocator, "apiSuchfelder", rhsApiSuchfelder), lhsApiSuchfelder, rhsApiSuchfelder)) {
                return false;
            }
        }
        {
            String lhsObjektbeschreibung;
            lhsObjektbeschreibung = this.getObjektbeschreibung();
            String rhsObjektbeschreibung;
            rhsObjektbeschreibung = that.getObjektbeschreibung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektbeschreibung", lhsObjektbeschreibung), LocatorUtils.property(thatLocator, "objektbeschreibung", rhsObjektbeschreibung), lhsObjektbeschreibung, rhsObjektbeschreibung)) {
                return false;
            }
        }
        {
            String lhsLage;
            lhsLage = this.getLage();
            String rhsLage;
            rhsLage = that.getLage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lage", lhsLage), LocatorUtils.property(thatLocator, "lage", rhsLage), lhsLage, rhsLage)) {
                return false;
            }
        }
        {
            String lhsAusstattung;
            lhsAusstattung = this.getAusstattung();
            String rhsAusstattung;
            rhsAusstattung = that.getAusstattung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ausstattung", lhsAusstattung), LocatorUtils.property(thatLocator, "ausstattung", rhsAusstattung), lhsAusstattung, rhsAusstattung)) {
                return false;
            }
        }
        {
            String lhsSonstigeAngaben;
            lhsSonstigeAngaben = this.getSonstigeAngaben();
            String rhsSonstigeAngaben;
            rhsSonstigeAngaben = that.getSonstigeAngaben();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sonstigeAngaben", lhsSonstigeAngaben), LocatorUtils.property(thatLocator, "sonstigeAngaben", rhsSonstigeAngaben), lhsSonstigeAngaben, rhsSonstigeAngaben)) {
                return false;
            }
        }
        {
            List<MultimediaAnhangTyp> lhsMultimediaAnhang;
            lhsMultimediaAnhang = (((this.multimediaAnhang!= null)&&(!this.multimediaAnhang.isEmpty()))?this.getMultimediaAnhang():null);
            List<MultimediaAnhangTyp> rhsMultimediaAnhang;
            rhsMultimediaAnhang = (((that.multimediaAnhang!= null)&&(!that.multimediaAnhang.isEmpty()))?that.getMultimediaAnhang():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "multimediaAnhang", lhsMultimediaAnhang), LocatorUtils.property(thatLocator, "multimediaAnhang", rhsMultimediaAnhang), lhsMultimediaAnhang, rhsMultimediaAnhang)) {
                return false;
            }
        }
        {
            String lhsAnbieterObjektID;
            lhsAnbieterObjektID = this.getAnbieterObjektID();
            String rhsAnbieterObjektID;
            rhsAnbieterObjektID = that.getAnbieterObjektID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anbieterObjektID", lhsAnbieterObjektID), LocatorUtils.property(thatLocator, "anbieterObjektID", rhsAnbieterObjektID), lhsAnbieterObjektID, rhsAnbieterObjektID)) {
                return false;
            }
        }
        {
            StatusTyp lhsStatusVBM;
            lhsStatusVBM = this.getStatusVBM();
            StatusTyp rhsStatusVBM;
            rhsStatusVBM = that.getStatusVBM();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statusVBM", lhsStatusVBM), LocatorUtils.property(thatLocator, "statusVBM", rhsStatusVBM), lhsStatusVBM, rhsStatusVBM)) {
                return false;
            }
        }
        {
            StatusTyp lhsStatusIS24;
            lhsStatusIS24 = this.getStatusIS24();
            StatusTyp rhsStatusIS24;
            rhsStatusIS24 = that.getStatusIS24();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statusIS24", lhsStatusIS24), LocatorUtils.property(thatLocator, "statusIS24", rhsStatusIS24), lhsStatusIS24, rhsStatusIS24)) {
                return false;
            }
        }
        {
            StatusTyp lhsStatusHP;
            lhsStatusHP = this.getStatusHP();
            StatusTyp rhsStatusHP;
            rhsStatusHP = that.getStatusHP();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statusHP", lhsStatusHP), LocatorUtils.property(thatLocator, "statusHP", rhsStatusHP), lhsStatusHP, rhsStatusHP)) {
                return false;
            }
        }
        {
            String lhsAktiveGruppen;
            lhsAktiveGruppen = this.getAktiveGruppen();
            String rhsAktiveGruppen;
            rhsAktiveGruppen = that.getAktiveGruppen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aktiveGruppen", lhsAktiveGruppen), LocatorUtils.property(thatLocator, "aktiveGruppen", rhsAktiveGruppen), lhsAktiveGruppen, rhsAktiveGruppen)) {
                return false;
            }
        }
        {
            AktionsTyp lhsImportmodus;
            lhsImportmodus = this.getImportmodus();
            AktionsTyp rhsImportmodus;
            rhsImportmodus = that.getImportmodus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "importmodus", lhsImportmodus), LocatorUtils.property(thatLocator, "importmodus", rhsImportmodus), lhsImportmodus, rhsImportmodus)) {
                return false;
            }
        }
        {
            BigInteger lhsScoutObjektID;
            lhsScoutObjektID = this.getScoutObjektID();
            BigInteger rhsScoutObjektID;
            rhsScoutObjektID = that.getScoutObjektID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scoutObjektID", lhsScoutObjektID), LocatorUtils.property(thatLocator, "scoutObjektID", rhsScoutObjektID), lhsScoutObjektID, rhsScoutObjektID)) {
                return false;
            }
        }
        {
            Long lhsGruppierungsID;
            lhsGruppierungsID = this.getGruppierungsID();
            Long rhsGruppierungsID;
            rhsGruppierungsID = that.getGruppierungsID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gruppierungsID", lhsGruppierungsID), LocatorUtils.property(thatLocator, "gruppierungsID", rhsGruppierungsID), lhsGruppierungsID, rhsGruppierungsID)) {
                return false;
            }
        }
        {
            boolean lhsAdressdruck;
            lhsAdressdruck = ((this.adressdruck!= null)?this.isAdressdruck():false);
            boolean rhsAdressdruck;
            rhsAdressdruck = ((that.adressdruck!= null)?that.isAdressdruck():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adressdruck", lhsAdressdruck), LocatorUtils.property(thatLocator, "adressdruck", rhsAdressdruck), lhsAdressdruck, rhsAdressdruck)) {
                return false;
            }
        }
        {
            String lhsUeberschrift;
            lhsUeberschrift = this.getUeberschrift();
            String rhsUeberschrift;
            rhsUeberschrift = that.getUeberschrift();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ueberschrift", lhsUeberschrift), LocatorUtils.property(thatLocator, "ueberschrift", rhsUeberschrift), lhsUeberschrift, rhsUeberschrift)) {
                return false;
            }
        }
        {
            String lhsProvision;
            lhsProvision = this.getProvision();
            String rhsProvision;
            rhsProvision = that.getProvision();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "provision", lhsProvision), LocatorUtils.property(thatLocator, "provision", rhsProvision), lhsProvision, rhsProvision)) {
                return false;
            }
        }
        {
            Boolean lhsProvisionspflichtig;
            lhsProvisionspflichtig = this.isProvisionspflichtig();
            Boolean rhsProvisionspflichtig;
            rhsProvisionspflichtig = that.isProvisionspflichtig();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "provisionspflichtig", lhsProvisionspflichtig), LocatorUtils.property(thatLocator, "provisionspflichtig", rhsProvisionspflichtig), lhsProvisionspflichtig, rhsProvisionspflichtig)) {
                return false;
            }
        }
        {
            String lhsProvisionshinweis;
            lhsProvisionshinweis = this.getProvisionshinweis();
            String rhsProvisionshinweis;
            rhsProvisionshinweis = that.getProvisionshinweis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "provisionshinweis", lhsProvisionshinweis), LocatorUtils.property(thatLocator, "provisionshinweis", rhsProvisionshinweis), lhsProvisionshinweis, rhsProvisionshinweis)) {
                return false;
            }
        }
        {
            WaehrungTyp lhsWaehrung;
            lhsWaehrung = this.getWaehrung();
            WaehrungTyp rhsWaehrung;
            rhsWaehrung = that.getWaehrung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waehrung", lhsWaehrung), LocatorUtils.property(thatLocator, "waehrung", rhsWaehrung), lhsWaehrung, rhsWaehrung)) {
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
