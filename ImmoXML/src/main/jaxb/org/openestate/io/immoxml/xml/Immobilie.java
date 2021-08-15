
package org.openestate.io.immoxml.xml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * Java class for &lt;immobilie&gt; element.
 * 
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
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
public class Immobilie implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Objektkategorie objektkategorie;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Geo geo;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Kontaktperson kontaktperson;
    @XmlElement(name = "weitere_adresse")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected List<WeitereAdresse> weitereAdresse;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Preise preise;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Flaechen flaechen;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Ausstattung ausstattung;
    @XmlElement(name = "zustand_angaben")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected ZustandAngaben zustandAngaben;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Infrastruktur infrastruktur;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Freitexte freitexte;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Anhaenge anhaenge;
    @XmlElement(name = "verwaltung_objekt")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected VerwaltungObjekt verwaltungObjekt;
    @XmlElement(name = "verwaltung_techn", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected VerwaltungTechn verwaltungTechn;
    @XmlElement(name = "user_defined_simplefield")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected List<UserDefinedSimplefield> userDefinedSimplefield;
    @XmlElement(name = "user_defined_anyfield")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected List<UserDefinedAnyfield> userDefinedAnyfield;

    /**
     * Gets the value of the objektkategorie property.
     * 
     * @return
     *     possible object is
     *     {@link Objektkategorie }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
            Objektkategorie theObjektkategorie;
            theObjektkategorie = this.getObjektkategorie();
            strategy.appendField(locator, this, "objektkategorie", buffer, theObjektkategorie, (this.objektkategorie!= null));
        }
        {
            Geo theGeo;
            theGeo = this.getGeo();
            strategy.appendField(locator, this, "geo", buffer, theGeo, (this.geo!= null));
        }
        {
            Kontaktperson theKontaktperson;
            theKontaktperson = this.getKontaktperson();
            strategy.appendField(locator, this, "kontaktperson", buffer, theKontaktperson, (this.kontaktperson!= null));
        }
        {
            List<WeitereAdresse> theWeitereAdresse;
            theWeitereAdresse = (((this.weitereAdresse!= null)&&(!this.weitereAdresse.isEmpty()))?this.getWeitereAdresse():null);
            strategy.appendField(locator, this, "weitereAdresse", buffer, theWeitereAdresse, ((this.weitereAdresse!= null)&&(!this.weitereAdresse.isEmpty())));
        }
        {
            Preise thePreise;
            thePreise = this.getPreise();
            strategy.appendField(locator, this, "preise", buffer, thePreise, (this.preise!= null));
        }
        {
            Flaechen theFlaechen;
            theFlaechen = this.getFlaechen();
            strategy.appendField(locator, this, "flaechen", buffer, theFlaechen, (this.flaechen!= null));
        }
        {
            Ausstattung theAusstattung;
            theAusstattung = this.getAusstattung();
            strategy.appendField(locator, this, "ausstattung", buffer, theAusstattung, (this.ausstattung!= null));
        }
        {
            ZustandAngaben theZustandAngaben;
            theZustandAngaben = this.getZustandAngaben();
            strategy.appendField(locator, this, "zustandAngaben", buffer, theZustandAngaben, (this.zustandAngaben!= null));
        }
        {
            Infrastruktur theInfrastruktur;
            theInfrastruktur = this.getInfrastruktur();
            strategy.appendField(locator, this, "infrastruktur", buffer, theInfrastruktur, (this.infrastruktur!= null));
        }
        {
            Freitexte theFreitexte;
            theFreitexte = this.getFreitexte();
            strategy.appendField(locator, this, "freitexte", buffer, theFreitexte, (this.freitexte!= null));
        }
        {
            Anhaenge theAnhaenge;
            theAnhaenge = this.getAnhaenge();
            strategy.appendField(locator, this, "anhaenge", buffer, theAnhaenge, (this.anhaenge!= null));
        }
        {
            VerwaltungObjekt theVerwaltungObjekt;
            theVerwaltungObjekt = this.getVerwaltungObjekt();
            strategy.appendField(locator, this, "verwaltungObjekt", buffer, theVerwaltungObjekt, (this.verwaltungObjekt!= null));
        }
        {
            VerwaltungTechn theVerwaltungTechn;
            theVerwaltungTechn = this.getVerwaltungTechn();
            strategy.appendField(locator, this, "verwaltungTechn", buffer, theVerwaltungTechn, (this.verwaltungTechn!= null));
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
        if (draftCopy instanceof Immobilie) {
            final Immobilie copy = ((Immobilie) draftCopy);
            {
                Boolean objektkategorieShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.objektkategorie!= null));
                if (objektkategorieShouldBeCopiedAndSet == Boolean.TRUE) {
                    Objektkategorie sourceObjektkategorie;
                    sourceObjektkategorie = this.getObjektkategorie();
                    Objektkategorie copyObjektkategorie = ((Objektkategorie) strategy.copy(LocatorUtils.property(locator, "objektkategorie", sourceObjektkategorie), sourceObjektkategorie, (this.objektkategorie!= null)));
                    copy.setObjektkategorie(copyObjektkategorie);
                } else {
                    if (objektkategorieShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.objektkategorie = null;
                    }
                }
            }
            {
                Boolean geoShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.geo!= null));
                if (geoShouldBeCopiedAndSet == Boolean.TRUE) {
                    Geo sourceGeo;
                    sourceGeo = this.getGeo();
                    Geo copyGeo = ((Geo) strategy.copy(LocatorUtils.property(locator, "geo", sourceGeo), sourceGeo, (this.geo!= null)));
                    copy.setGeo(copyGeo);
                } else {
                    if (geoShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geo = null;
                    }
                }
            }
            {
                Boolean kontaktpersonShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kontaktperson!= null));
                if (kontaktpersonShouldBeCopiedAndSet == Boolean.TRUE) {
                    Kontaktperson sourceKontaktperson;
                    sourceKontaktperson = this.getKontaktperson();
                    Kontaktperson copyKontaktperson = ((Kontaktperson) strategy.copy(LocatorUtils.property(locator, "kontaktperson", sourceKontaktperson), sourceKontaktperson, (this.kontaktperson!= null)));
                    copy.setKontaktperson(copyKontaktperson);
                } else {
                    if (kontaktpersonShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kontaktperson = null;
                    }
                }
            }
            {
                Boolean weitereAdresseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.weitereAdresse!= null)&&(!this.weitereAdresse.isEmpty())));
                if (weitereAdresseShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<WeitereAdresse> sourceWeitereAdresse;
                    sourceWeitereAdresse = (((this.weitereAdresse!= null)&&(!this.weitereAdresse.isEmpty()))?this.getWeitereAdresse():null);
                    @SuppressWarnings("unchecked")
                    List<WeitereAdresse> copyWeitereAdresse = ((List<WeitereAdresse> ) strategy.copy(LocatorUtils.property(locator, "weitereAdresse", sourceWeitereAdresse), sourceWeitereAdresse, ((this.weitereAdresse!= null)&&(!this.weitereAdresse.isEmpty()))));
                    copy.weitereAdresse = null;
                    if (copyWeitereAdresse!= null) {
                        List<WeitereAdresse> uniqueWeitereAdressel = copy.getWeitereAdresse();
                        uniqueWeitereAdressel.addAll(copyWeitereAdresse);
                    }
                } else {
                    if (weitereAdresseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.weitereAdresse = null;
                    }
                }
            }
            {
                Boolean preiseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.preise!= null));
                if (preiseShouldBeCopiedAndSet == Boolean.TRUE) {
                    Preise sourcePreise;
                    sourcePreise = this.getPreise();
                    Preise copyPreise = ((Preise) strategy.copy(LocatorUtils.property(locator, "preise", sourcePreise), sourcePreise, (this.preise!= null)));
                    copy.setPreise(copyPreise);
                } else {
                    if (preiseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.preise = null;
                    }
                }
            }
            {
                Boolean flaechenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.flaechen!= null));
                if (flaechenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Flaechen sourceFlaechen;
                    sourceFlaechen = this.getFlaechen();
                    Flaechen copyFlaechen = ((Flaechen) strategy.copy(LocatorUtils.property(locator, "flaechen", sourceFlaechen), sourceFlaechen, (this.flaechen!= null)));
                    copy.setFlaechen(copyFlaechen);
                } else {
                    if (flaechenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.flaechen = null;
                    }
                }
            }
            {
                Boolean ausstattungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ausstattung!= null));
                if (ausstattungShouldBeCopiedAndSet == Boolean.TRUE) {
                    Ausstattung sourceAusstattung;
                    sourceAusstattung = this.getAusstattung();
                    Ausstattung copyAusstattung = ((Ausstattung) strategy.copy(LocatorUtils.property(locator, "ausstattung", sourceAusstattung), sourceAusstattung, (this.ausstattung!= null)));
                    copy.setAusstattung(copyAusstattung);
                } else {
                    if (ausstattungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ausstattung = null;
                    }
                }
            }
            {
                Boolean zustandAngabenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zustandAngaben!= null));
                if (zustandAngabenShouldBeCopiedAndSet == Boolean.TRUE) {
                    ZustandAngaben sourceZustandAngaben;
                    sourceZustandAngaben = this.getZustandAngaben();
                    ZustandAngaben copyZustandAngaben = ((ZustandAngaben) strategy.copy(LocatorUtils.property(locator, "zustandAngaben", sourceZustandAngaben), sourceZustandAngaben, (this.zustandAngaben!= null)));
                    copy.setZustandAngaben(copyZustandAngaben);
                } else {
                    if (zustandAngabenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zustandAngaben = null;
                    }
                }
            }
            {
                Boolean infrastrukturShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.infrastruktur!= null));
                if (infrastrukturShouldBeCopiedAndSet == Boolean.TRUE) {
                    Infrastruktur sourceInfrastruktur;
                    sourceInfrastruktur = this.getInfrastruktur();
                    Infrastruktur copyInfrastruktur = ((Infrastruktur) strategy.copy(LocatorUtils.property(locator, "infrastruktur", sourceInfrastruktur), sourceInfrastruktur, (this.infrastruktur!= null)));
                    copy.setInfrastruktur(copyInfrastruktur);
                } else {
                    if (infrastrukturShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.infrastruktur = null;
                    }
                }
            }
            {
                Boolean freitexteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.freitexte!= null));
                if (freitexteShouldBeCopiedAndSet == Boolean.TRUE) {
                    Freitexte sourceFreitexte;
                    sourceFreitexte = this.getFreitexte();
                    Freitexte copyFreitexte = ((Freitexte) strategy.copy(LocatorUtils.property(locator, "freitexte", sourceFreitexte), sourceFreitexte, (this.freitexte!= null)));
                    copy.setFreitexte(copyFreitexte);
                } else {
                    if (freitexteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.freitexte = null;
                    }
                }
            }
            {
                Boolean anhaengeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anhaenge!= null));
                if (anhaengeShouldBeCopiedAndSet == Boolean.TRUE) {
                    Anhaenge sourceAnhaenge;
                    sourceAnhaenge = this.getAnhaenge();
                    Anhaenge copyAnhaenge = ((Anhaenge) strategy.copy(LocatorUtils.property(locator, "anhaenge", sourceAnhaenge), sourceAnhaenge, (this.anhaenge!= null)));
                    copy.setAnhaenge(copyAnhaenge);
                } else {
                    if (anhaengeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anhaenge = null;
                    }
                }
            }
            {
                Boolean verwaltungObjektShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.verwaltungObjekt!= null));
                if (verwaltungObjektShouldBeCopiedAndSet == Boolean.TRUE) {
                    VerwaltungObjekt sourceVerwaltungObjekt;
                    sourceVerwaltungObjekt = this.getVerwaltungObjekt();
                    VerwaltungObjekt copyVerwaltungObjekt = ((VerwaltungObjekt) strategy.copy(LocatorUtils.property(locator, "verwaltungObjekt", sourceVerwaltungObjekt), sourceVerwaltungObjekt, (this.verwaltungObjekt!= null)));
                    copy.setVerwaltungObjekt(copyVerwaltungObjekt);
                } else {
                    if (verwaltungObjektShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.verwaltungObjekt = null;
                    }
                }
            }
            {
                Boolean verwaltungTechnShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.verwaltungTechn!= null));
                if (verwaltungTechnShouldBeCopiedAndSet == Boolean.TRUE) {
                    VerwaltungTechn sourceVerwaltungTechn;
                    sourceVerwaltungTechn = this.getVerwaltungTechn();
                    VerwaltungTechn copyVerwaltungTechn = ((VerwaltungTechn) strategy.copy(LocatorUtils.property(locator, "verwaltungTechn", sourceVerwaltungTechn), sourceVerwaltungTechn, (this.verwaltungTechn!= null)));
                    copy.setVerwaltungTechn(copyVerwaltungTechn);
                } else {
                    if (verwaltungTechnShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.verwaltungTechn = null;
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
        return new Immobilie();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektkategorie", lhsObjektkategorie), LocatorUtils.property(thatLocator, "objektkategorie", rhsObjektkategorie), lhsObjektkategorie, rhsObjektkategorie, (this.objektkategorie!= null), (that.objektkategorie!= null))) {
                return false;
            }
        }
        {
            Geo lhsGeo;
            lhsGeo = this.getGeo();
            Geo rhsGeo;
            rhsGeo = that.getGeo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geo", lhsGeo), LocatorUtils.property(thatLocator, "geo", rhsGeo), lhsGeo, rhsGeo, (this.geo!= null), (that.geo!= null))) {
                return false;
            }
        }
        {
            Kontaktperson lhsKontaktperson;
            lhsKontaktperson = this.getKontaktperson();
            Kontaktperson rhsKontaktperson;
            rhsKontaktperson = that.getKontaktperson();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kontaktperson", lhsKontaktperson), LocatorUtils.property(thatLocator, "kontaktperson", rhsKontaktperson), lhsKontaktperson, rhsKontaktperson, (this.kontaktperson!= null), (that.kontaktperson!= null))) {
                return false;
            }
        }
        {
            List<WeitereAdresse> lhsWeitereAdresse;
            lhsWeitereAdresse = (((this.weitereAdresse!= null)&&(!this.weitereAdresse.isEmpty()))?this.getWeitereAdresse():null);
            List<WeitereAdresse> rhsWeitereAdresse;
            rhsWeitereAdresse = (((that.weitereAdresse!= null)&&(!that.weitereAdresse.isEmpty()))?that.getWeitereAdresse():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "weitereAdresse", lhsWeitereAdresse), LocatorUtils.property(thatLocator, "weitereAdresse", rhsWeitereAdresse), lhsWeitereAdresse, rhsWeitereAdresse, ((this.weitereAdresse!= null)&&(!this.weitereAdresse.isEmpty())), ((that.weitereAdresse!= null)&&(!that.weitereAdresse.isEmpty())))) {
                return false;
            }
        }
        {
            Preise lhsPreise;
            lhsPreise = this.getPreise();
            Preise rhsPreise;
            rhsPreise = that.getPreise();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preise", lhsPreise), LocatorUtils.property(thatLocator, "preise", rhsPreise), lhsPreise, rhsPreise, (this.preise!= null), (that.preise!= null))) {
                return false;
            }
        }
        {
            Flaechen lhsFlaechen;
            lhsFlaechen = this.getFlaechen();
            Flaechen rhsFlaechen;
            rhsFlaechen = that.getFlaechen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flaechen", lhsFlaechen), LocatorUtils.property(thatLocator, "flaechen", rhsFlaechen), lhsFlaechen, rhsFlaechen, (this.flaechen!= null), (that.flaechen!= null))) {
                return false;
            }
        }
        {
            Ausstattung lhsAusstattung;
            lhsAusstattung = this.getAusstattung();
            Ausstattung rhsAusstattung;
            rhsAusstattung = that.getAusstattung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ausstattung", lhsAusstattung), LocatorUtils.property(thatLocator, "ausstattung", rhsAusstattung), lhsAusstattung, rhsAusstattung, (this.ausstattung!= null), (that.ausstattung!= null))) {
                return false;
            }
        }
        {
            ZustandAngaben lhsZustandAngaben;
            lhsZustandAngaben = this.getZustandAngaben();
            ZustandAngaben rhsZustandAngaben;
            rhsZustandAngaben = that.getZustandAngaben();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zustandAngaben", lhsZustandAngaben), LocatorUtils.property(thatLocator, "zustandAngaben", rhsZustandAngaben), lhsZustandAngaben, rhsZustandAngaben, (this.zustandAngaben!= null), (that.zustandAngaben!= null))) {
                return false;
            }
        }
        {
            Infrastruktur lhsInfrastruktur;
            lhsInfrastruktur = this.getInfrastruktur();
            Infrastruktur rhsInfrastruktur;
            rhsInfrastruktur = that.getInfrastruktur();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "infrastruktur", lhsInfrastruktur), LocatorUtils.property(thatLocator, "infrastruktur", rhsInfrastruktur), lhsInfrastruktur, rhsInfrastruktur, (this.infrastruktur!= null), (that.infrastruktur!= null))) {
                return false;
            }
        }
        {
            Freitexte lhsFreitexte;
            lhsFreitexte = this.getFreitexte();
            Freitexte rhsFreitexte;
            rhsFreitexte = that.getFreitexte();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freitexte", lhsFreitexte), LocatorUtils.property(thatLocator, "freitexte", rhsFreitexte), lhsFreitexte, rhsFreitexte, (this.freitexte!= null), (that.freitexte!= null))) {
                return false;
            }
        }
        {
            Anhaenge lhsAnhaenge;
            lhsAnhaenge = this.getAnhaenge();
            Anhaenge rhsAnhaenge;
            rhsAnhaenge = that.getAnhaenge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anhaenge", lhsAnhaenge), LocatorUtils.property(thatLocator, "anhaenge", rhsAnhaenge), lhsAnhaenge, rhsAnhaenge, (this.anhaenge!= null), (that.anhaenge!= null))) {
                return false;
            }
        }
        {
            VerwaltungObjekt lhsVerwaltungObjekt;
            lhsVerwaltungObjekt = this.getVerwaltungObjekt();
            VerwaltungObjekt rhsVerwaltungObjekt;
            rhsVerwaltungObjekt = that.getVerwaltungObjekt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verwaltungObjekt", lhsVerwaltungObjekt), LocatorUtils.property(thatLocator, "verwaltungObjekt", rhsVerwaltungObjekt), lhsVerwaltungObjekt, rhsVerwaltungObjekt, (this.verwaltungObjekt!= null), (that.verwaltungObjekt!= null))) {
                return false;
            }
        }
        {
            VerwaltungTechn lhsVerwaltungTechn;
            lhsVerwaltungTechn = this.getVerwaltungTechn();
            VerwaltungTechn rhsVerwaltungTechn;
            rhsVerwaltungTechn = that.getVerwaltungTechn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verwaltungTechn", lhsVerwaltungTechn), LocatorUtils.property(thatLocator, "verwaltungTechn", rhsVerwaltungTechn), lhsVerwaltungTechn, rhsVerwaltungTechn, (this.verwaltungTechn!= null), (that.verwaltungTechn!= null))) {
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
