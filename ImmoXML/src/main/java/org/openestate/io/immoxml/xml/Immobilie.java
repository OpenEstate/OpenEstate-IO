
package org.openestate.io.immoxml.xml;

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
 *         &lt;element ref="{http://www.immoxml.de}objektkategorie"/>
 *         &lt;element ref="{http://www.immoxml.de}geo"/>
 *         &lt;element ref="{http://www.immoxml.de}kontaktperson"/>
 *         &lt;element ref="{http://www.immoxml.de}weitere_adresse" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}preise" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}flaechen" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}ausstattung" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}zustand_angaben" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}infrastruktur" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}freitexte" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}anhaenge" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}verwaltung_objekt" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}verwaltung_techn"/>
 *         &lt;element ref="{http://www.immoxml.de}user_defined_simplefield" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.immoxml.de}user_defined_anyfield" maxOccurs="unbounded" minOccurs="0"/>
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
    "objektkategorie",
    "geo",
    "kontaktperson",
    "weitereAdresse",
    "preise",
    "flaechen",
    "ausstattung",
    "zustandAngaben",
    "infrastruktur",
    "freitexte",
    "anhaenge",
    "verwaltungObjekt",
    "verwaltungTechn",
    "userDefinedSimplefield",
    "userDefinedAnyfield"
})
@XmlRootElement(name = "immobilie")
public class Immobilie
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    protected Objektkategorie objektkategorie;
    @XmlElement(required = true)
    protected Geo geo;
    @XmlElement(required = true)
    protected Kontaktperson kontaktperson;
    @XmlElement(name = "weitere_adresse")
    protected List<WeitereAdresse> weitereAdresse;
    protected Preise preise;
    protected Flaechen flaechen;
    protected Ausstattung ausstattung;
    @XmlElement(name = "zustand_angaben")
    protected ZustandAngaben zustandAngaben;
    protected Infrastruktur infrastruktur;
    protected Freitexte freitexte;
    protected Anhaenge anhaenge;
    @XmlElement(name = "verwaltung_objekt")
    protected VerwaltungObjekt verwaltungObjekt;
    @XmlElement(name = "verwaltung_techn", required = true)
    protected VerwaltungTechn verwaltungTechn;
    @XmlElement(name = "user_defined_simplefield")
    protected List<UserDefinedSimplefield> userDefinedSimplefield;
    @XmlElement(name = "user_defined_anyfield")
    protected List<UserDefinedAnyfield> userDefinedAnyfield;

    /**
     * Gets the value of the objektkategorie property.
     * 
     * @return
     *     possible object is
     *     {@link Objektkategorie }
     *     
     */
    public Objektkategorie getObjektkategorie() {
        return objektkategorie;
    }

    /**
     * Sets the value of the objektkategorie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Objektkategorie }
     *     
     */
    public void setObjektkategorie(Objektkategorie value) {
        this.objektkategorie = value;
    }

    /**
     * Gets the value of the geo property.
     * 
     * @return
     *     possible object is
     *     {@link Geo }
     *     
     */
    public Geo getGeo() {
        return geo;
    }

    /**
     * Sets the value of the geo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Geo }
     *     
     */
    public void setGeo(Geo value) {
        this.geo = value;
    }

    /**
     * Gets the value of the kontaktperson property.
     * 
     * @return
     *     possible object is
     *     {@link Kontaktperson }
     *     
     */
    public Kontaktperson getKontaktperson() {
        return kontaktperson;
    }

    /**
     * Sets the value of the kontaktperson property.
     * 
     * @param value
     *     allowed object is
     *     {@link Kontaktperson }
     *     
     */
    public void setKontaktperson(Kontaktperson value) {
        this.kontaktperson = value;
    }

    /**
     * Gets the value of the weitereAdresse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weitereAdresse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeitereAdresse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeitereAdresse }
     * 
     * 
     */
    public List<WeitereAdresse> getWeitereAdresse() {
        if (weitereAdresse == null) {
            weitereAdresse = new ArrayList<WeitereAdresse>();
        }
        return this.weitereAdresse;
    }

    /**
     * Gets the value of the preise property.
     * 
     * @return
     *     possible object is
     *     {@link Preise }
     *     
     */
    public Preise getPreise() {
        return preise;
    }

    /**
     * Sets the value of the preise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preise }
     *     
     */
    public void setPreise(Preise value) {
        this.preise = value;
    }

    /**
     * Gets the value of the flaechen property.
     * 
     * @return
     *     possible object is
     *     {@link Flaechen }
     *     
     */
    public Flaechen getFlaechen() {
        return flaechen;
    }

    /**
     * Sets the value of the flaechen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Flaechen }
     *     
     */
    public void setFlaechen(Flaechen value) {
        this.flaechen = value;
    }

    /**
     * Gets the value of the ausstattung property.
     * 
     * @return
     *     possible object is
     *     {@link Ausstattung }
     *     
     */
    public Ausstattung getAusstattung() {
        return ausstattung;
    }

    /**
     * Sets the value of the ausstattung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ausstattung }
     *     
     */
    public void setAusstattung(Ausstattung value) {
        this.ausstattung = value;
    }

    /**
     * Gets the value of the zustandAngaben property.
     * 
     * @return
     *     possible object is
     *     {@link ZustandAngaben }
     *     
     */
    public ZustandAngaben getZustandAngaben() {
        return zustandAngaben;
    }

    /**
     * Sets the value of the zustandAngaben property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZustandAngaben }
     *     
     */
    public void setZustandAngaben(ZustandAngaben value) {
        this.zustandAngaben = value;
    }

    /**
     * Gets the value of the infrastruktur property.
     * 
     * @return
     *     possible object is
     *     {@link Infrastruktur }
     *     
     */
    public Infrastruktur getInfrastruktur() {
        return infrastruktur;
    }

    /**
     * Sets the value of the infrastruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link Infrastruktur }
     *     
     */
    public void setInfrastruktur(Infrastruktur value) {
        this.infrastruktur = value;
    }

    /**
     * Gets the value of the freitexte property.
     * 
     * @return
     *     possible object is
     *     {@link Freitexte }
     *     
     */
    public Freitexte getFreitexte() {
        return freitexte;
    }

    /**
     * Sets the value of the freitexte property.
     * 
     * @param value
     *     allowed object is
     *     {@link Freitexte }
     *     
     */
    public void setFreitexte(Freitexte value) {
        this.freitexte = value;
    }

    /**
     * Gets the value of the anhaenge property.
     * 
     * @return
     *     possible object is
     *     {@link Anhaenge }
     *     
     */
    public Anhaenge getAnhaenge() {
        return anhaenge;
    }

    /**
     * Sets the value of the anhaenge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anhaenge }
     *     
     */
    public void setAnhaenge(Anhaenge value) {
        this.anhaenge = value;
    }

    /**
     * Gets the value of the verwaltungObjekt property.
     * 
     * @return
     *     possible object is
     *     {@link VerwaltungObjekt }
     *     
     */
    public VerwaltungObjekt getVerwaltungObjekt() {
        return verwaltungObjekt;
    }

    /**
     * Sets the value of the verwaltungObjekt property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerwaltungObjekt }
     *     
     */
    public void setVerwaltungObjekt(VerwaltungObjekt value) {
        this.verwaltungObjekt = value;
    }

    /**
     * Gets the value of the verwaltungTechn property.
     * 
     * @return
     *     possible object is
     *     {@link VerwaltungTechn }
     *     
     */
    public VerwaltungTechn getVerwaltungTechn() {
        return verwaltungTechn;
    }

    /**
     * Sets the value of the verwaltungTechn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerwaltungTechn }
     *     
     */
    public void setVerwaltungTechn(VerwaltungTechn value) {
        this.verwaltungTechn = value;
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
            Objektkategorie theObjektkategorie;
            theObjektkategorie = this.getObjektkategorie();
            strategy.appendField(locator, this, "objektkategorie", buffer, theObjektkategorie);
        }
        {
            Geo theGeo;
            theGeo = this.getGeo();
            strategy.appendField(locator, this, "geo", buffer, theGeo);
        }
        {
            Kontaktperson theKontaktperson;
            theKontaktperson = this.getKontaktperson();
            strategy.appendField(locator, this, "kontaktperson", buffer, theKontaktperson);
        }
        {
            List<WeitereAdresse> theWeitereAdresse;
            theWeitereAdresse = (((this.weitereAdresse!= null)&&(!this.weitereAdresse.isEmpty()))?this.getWeitereAdresse():null);
            strategy.appendField(locator, this, "weitereAdresse", buffer, theWeitereAdresse);
        }
        {
            Preise thePreise;
            thePreise = this.getPreise();
            strategy.appendField(locator, this, "preise", buffer, thePreise);
        }
        {
            Flaechen theFlaechen;
            theFlaechen = this.getFlaechen();
            strategy.appendField(locator, this, "flaechen", buffer, theFlaechen);
        }
        {
            Ausstattung theAusstattung;
            theAusstattung = this.getAusstattung();
            strategy.appendField(locator, this, "ausstattung", buffer, theAusstattung);
        }
        {
            ZustandAngaben theZustandAngaben;
            theZustandAngaben = this.getZustandAngaben();
            strategy.appendField(locator, this, "zustandAngaben", buffer, theZustandAngaben);
        }
        {
            Infrastruktur theInfrastruktur;
            theInfrastruktur = this.getInfrastruktur();
            strategy.appendField(locator, this, "infrastruktur", buffer, theInfrastruktur);
        }
        {
            Freitexte theFreitexte;
            theFreitexte = this.getFreitexte();
            strategy.appendField(locator, this, "freitexte", buffer, theFreitexte);
        }
        {
            Anhaenge theAnhaenge;
            theAnhaenge = this.getAnhaenge();
            strategy.appendField(locator, this, "anhaenge", buffer, theAnhaenge);
        }
        {
            VerwaltungObjekt theVerwaltungObjekt;
            theVerwaltungObjekt = this.getVerwaltungObjekt();
            strategy.appendField(locator, this, "verwaltungObjekt", buffer, theVerwaltungObjekt);
        }
        {
            VerwaltungTechn theVerwaltungTechn;
            theVerwaltungTechn = this.getVerwaltungTechn();
            strategy.appendField(locator, this, "verwaltungTechn", buffer, theVerwaltungTechn);
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
        if (draftCopy instanceof Immobilie) {
            final Immobilie copy = ((Immobilie) draftCopy);
            if (this.objektkategorie!= null) {
                Objektkategorie sourceObjektkategorie;
                sourceObjektkategorie = this.getObjektkategorie();
                Objektkategorie copyObjektkategorie = ((Objektkategorie) strategy.copy(LocatorUtils.property(locator, "objektkategorie", sourceObjektkategorie), sourceObjektkategorie));
                copy.setObjektkategorie(copyObjektkategorie);
            } else {
                copy.objektkategorie = null;
            }
            if (this.geo!= null) {
                Geo sourceGeo;
                sourceGeo = this.getGeo();
                Geo copyGeo = ((Geo) strategy.copy(LocatorUtils.property(locator, "geo", sourceGeo), sourceGeo));
                copy.setGeo(copyGeo);
            } else {
                copy.geo = null;
            }
            if (this.kontaktperson!= null) {
                Kontaktperson sourceKontaktperson;
                sourceKontaktperson = this.getKontaktperson();
                Kontaktperson copyKontaktperson = ((Kontaktperson) strategy.copy(LocatorUtils.property(locator, "kontaktperson", sourceKontaktperson), sourceKontaktperson));
                copy.setKontaktperson(copyKontaktperson);
            } else {
                copy.kontaktperson = null;
            }
            if ((this.weitereAdresse!= null)&&(!this.weitereAdresse.isEmpty())) {
                List<WeitereAdresse> sourceWeitereAdresse;
                sourceWeitereAdresse = (((this.weitereAdresse!= null)&&(!this.weitereAdresse.isEmpty()))?this.getWeitereAdresse():null);
                @SuppressWarnings("unchecked")
                List<WeitereAdresse> copyWeitereAdresse = ((List<WeitereAdresse> ) strategy.copy(LocatorUtils.property(locator, "weitereAdresse", sourceWeitereAdresse), sourceWeitereAdresse));
                copy.weitereAdresse = null;
                if (copyWeitereAdresse!= null) {
                    List<WeitereAdresse> uniqueWeitereAdressel = copy.getWeitereAdresse();
                    uniqueWeitereAdressel.addAll(copyWeitereAdresse);
                }
            } else {
                copy.weitereAdresse = null;
            }
            if (this.preise!= null) {
                Preise sourcePreise;
                sourcePreise = this.getPreise();
                Preise copyPreise = ((Preise) strategy.copy(LocatorUtils.property(locator, "preise", sourcePreise), sourcePreise));
                copy.setPreise(copyPreise);
            } else {
                copy.preise = null;
            }
            if (this.flaechen!= null) {
                Flaechen sourceFlaechen;
                sourceFlaechen = this.getFlaechen();
                Flaechen copyFlaechen = ((Flaechen) strategy.copy(LocatorUtils.property(locator, "flaechen", sourceFlaechen), sourceFlaechen));
                copy.setFlaechen(copyFlaechen);
            } else {
                copy.flaechen = null;
            }
            if (this.ausstattung!= null) {
                Ausstattung sourceAusstattung;
                sourceAusstattung = this.getAusstattung();
                Ausstattung copyAusstattung = ((Ausstattung) strategy.copy(LocatorUtils.property(locator, "ausstattung", sourceAusstattung), sourceAusstattung));
                copy.setAusstattung(copyAusstattung);
            } else {
                copy.ausstattung = null;
            }
            if (this.zustandAngaben!= null) {
                ZustandAngaben sourceZustandAngaben;
                sourceZustandAngaben = this.getZustandAngaben();
                ZustandAngaben copyZustandAngaben = ((ZustandAngaben) strategy.copy(LocatorUtils.property(locator, "zustandAngaben", sourceZustandAngaben), sourceZustandAngaben));
                copy.setZustandAngaben(copyZustandAngaben);
            } else {
                copy.zustandAngaben = null;
            }
            if (this.infrastruktur!= null) {
                Infrastruktur sourceInfrastruktur;
                sourceInfrastruktur = this.getInfrastruktur();
                Infrastruktur copyInfrastruktur = ((Infrastruktur) strategy.copy(LocatorUtils.property(locator, "infrastruktur", sourceInfrastruktur), sourceInfrastruktur));
                copy.setInfrastruktur(copyInfrastruktur);
            } else {
                copy.infrastruktur = null;
            }
            if (this.freitexte!= null) {
                Freitexte sourceFreitexte;
                sourceFreitexte = this.getFreitexte();
                Freitexte copyFreitexte = ((Freitexte) strategy.copy(LocatorUtils.property(locator, "freitexte", sourceFreitexte), sourceFreitexte));
                copy.setFreitexte(copyFreitexte);
            } else {
                copy.freitexte = null;
            }
            if (this.anhaenge!= null) {
                Anhaenge sourceAnhaenge;
                sourceAnhaenge = this.getAnhaenge();
                Anhaenge copyAnhaenge = ((Anhaenge) strategy.copy(LocatorUtils.property(locator, "anhaenge", sourceAnhaenge), sourceAnhaenge));
                copy.setAnhaenge(copyAnhaenge);
            } else {
                copy.anhaenge = null;
            }
            if (this.verwaltungObjekt!= null) {
                VerwaltungObjekt sourceVerwaltungObjekt;
                sourceVerwaltungObjekt = this.getVerwaltungObjekt();
                VerwaltungObjekt copyVerwaltungObjekt = ((VerwaltungObjekt) strategy.copy(LocatorUtils.property(locator, "verwaltungObjekt", sourceVerwaltungObjekt), sourceVerwaltungObjekt));
                copy.setVerwaltungObjekt(copyVerwaltungObjekt);
            } else {
                copy.verwaltungObjekt = null;
            }
            if (this.verwaltungTechn!= null) {
                VerwaltungTechn sourceVerwaltungTechn;
                sourceVerwaltungTechn = this.getVerwaltungTechn();
                VerwaltungTechn copyVerwaltungTechn = ((VerwaltungTechn) strategy.copy(LocatorUtils.property(locator, "verwaltungTechn", sourceVerwaltungTechn), sourceVerwaltungTechn));
                copy.setVerwaltungTechn(copyVerwaltungTechn);
            } else {
                copy.verwaltungTechn = null;
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
        return new Immobilie();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Immobilie)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Immobilie that = ((Immobilie) object);
        {
            Objektkategorie lhsObjektkategorie;
            lhsObjektkategorie = this.getObjektkategorie();
            Objektkategorie rhsObjektkategorie;
            rhsObjektkategorie = that.getObjektkategorie();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektkategorie", lhsObjektkategorie), LocatorUtils.property(thatLocator, "objektkategorie", rhsObjektkategorie), lhsObjektkategorie, rhsObjektkategorie)) {
                return false;
            }
        }
        {
            Geo lhsGeo;
            lhsGeo = this.getGeo();
            Geo rhsGeo;
            rhsGeo = that.getGeo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geo", lhsGeo), LocatorUtils.property(thatLocator, "geo", rhsGeo), lhsGeo, rhsGeo)) {
                return false;
            }
        }
        {
            Kontaktperson lhsKontaktperson;
            lhsKontaktperson = this.getKontaktperson();
            Kontaktperson rhsKontaktperson;
            rhsKontaktperson = that.getKontaktperson();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kontaktperson", lhsKontaktperson), LocatorUtils.property(thatLocator, "kontaktperson", rhsKontaktperson), lhsKontaktperson, rhsKontaktperson)) {
                return false;
            }
        }
        {
            List<WeitereAdresse> lhsWeitereAdresse;
            lhsWeitereAdresse = (((this.weitereAdresse!= null)&&(!this.weitereAdresse.isEmpty()))?this.getWeitereAdresse():null);
            List<WeitereAdresse> rhsWeitereAdresse;
            rhsWeitereAdresse = (((that.weitereAdresse!= null)&&(!that.weitereAdresse.isEmpty()))?that.getWeitereAdresse():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "weitereAdresse", lhsWeitereAdresse), LocatorUtils.property(thatLocator, "weitereAdresse", rhsWeitereAdresse), lhsWeitereAdresse, rhsWeitereAdresse)) {
                return false;
            }
        }
        {
            Preise lhsPreise;
            lhsPreise = this.getPreise();
            Preise rhsPreise;
            rhsPreise = that.getPreise();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preise", lhsPreise), LocatorUtils.property(thatLocator, "preise", rhsPreise), lhsPreise, rhsPreise)) {
                return false;
            }
        }
        {
            Flaechen lhsFlaechen;
            lhsFlaechen = this.getFlaechen();
            Flaechen rhsFlaechen;
            rhsFlaechen = that.getFlaechen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flaechen", lhsFlaechen), LocatorUtils.property(thatLocator, "flaechen", rhsFlaechen), lhsFlaechen, rhsFlaechen)) {
                return false;
            }
        }
        {
            Ausstattung lhsAusstattung;
            lhsAusstattung = this.getAusstattung();
            Ausstattung rhsAusstattung;
            rhsAusstattung = that.getAusstattung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ausstattung", lhsAusstattung), LocatorUtils.property(thatLocator, "ausstattung", rhsAusstattung), lhsAusstattung, rhsAusstattung)) {
                return false;
            }
        }
        {
            ZustandAngaben lhsZustandAngaben;
            lhsZustandAngaben = this.getZustandAngaben();
            ZustandAngaben rhsZustandAngaben;
            rhsZustandAngaben = that.getZustandAngaben();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zustandAngaben", lhsZustandAngaben), LocatorUtils.property(thatLocator, "zustandAngaben", rhsZustandAngaben), lhsZustandAngaben, rhsZustandAngaben)) {
                return false;
            }
        }
        {
            Infrastruktur lhsInfrastruktur;
            lhsInfrastruktur = this.getInfrastruktur();
            Infrastruktur rhsInfrastruktur;
            rhsInfrastruktur = that.getInfrastruktur();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "infrastruktur", lhsInfrastruktur), LocatorUtils.property(thatLocator, "infrastruktur", rhsInfrastruktur), lhsInfrastruktur, rhsInfrastruktur)) {
                return false;
            }
        }
        {
            Freitexte lhsFreitexte;
            lhsFreitexte = this.getFreitexte();
            Freitexte rhsFreitexte;
            rhsFreitexte = that.getFreitexte();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freitexte", lhsFreitexte), LocatorUtils.property(thatLocator, "freitexte", rhsFreitexte), lhsFreitexte, rhsFreitexte)) {
                return false;
            }
        }
        {
            Anhaenge lhsAnhaenge;
            lhsAnhaenge = this.getAnhaenge();
            Anhaenge rhsAnhaenge;
            rhsAnhaenge = that.getAnhaenge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anhaenge", lhsAnhaenge), LocatorUtils.property(thatLocator, "anhaenge", rhsAnhaenge), lhsAnhaenge, rhsAnhaenge)) {
                return false;
            }
        }
        {
            VerwaltungObjekt lhsVerwaltungObjekt;
            lhsVerwaltungObjekt = this.getVerwaltungObjekt();
            VerwaltungObjekt rhsVerwaltungObjekt;
            rhsVerwaltungObjekt = that.getVerwaltungObjekt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verwaltungObjekt", lhsVerwaltungObjekt), LocatorUtils.property(thatLocator, "verwaltungObjekt", rhsVerwaltungObjekt), lhsVerwaltungObjekt, rhsVerwaltungObjekt)) {
                return false;
            }
        }
        {
            VerwaltungTechn lhsVerwaltungTechn;
            lhsVerwaltungTechn = this.getVerwaltungTechn();
            VerwaltungTechn rhsVerwaltungTechn;
            rhsVerwaltungTechn = that.getVerwaltungTechn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verwaltungTechn", lhsVerwaltungTechn), LocatorUtils.property(thatLocator, "verwaltungTechn", rhsVerwaltungTechn), lhsVerwaltungTechn, rhsVerwaltungTechn)) {
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
