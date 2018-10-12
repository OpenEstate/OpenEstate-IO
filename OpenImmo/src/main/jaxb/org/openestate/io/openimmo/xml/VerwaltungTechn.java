
package org.openestate.io.openimmo.xml;

import java.io.Serializable;
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
 * Java class for &lt;verwaltung_techn&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "objektnrIntern",
    "objektnrExtern",
    "aktion",
    "aktivVon",
    "aktivBis",
    "openimmoObid",
    "kennungUrsprung",
    "standVom",
    "weitergabeGenerell",
    "weitergabePositiv",
    "weitergabeNegativ",
    "gruppenKennung",
    "master",
    "sprache",
    "userDefinedSimplefield",
    "userDefinedAnyfield",
    "userDefinedExtend"
})
@XmlRootElement(name = "verwaltung_techn")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
public class VerwaltungTechn implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "objektnr_intern")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String objektnrIntern;
    @XmlElement(name = "objektnr_extern", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String objektnrExtern;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected Aktion aktion;
    @XmlElement(name = "aktiv_von", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected Calendar aktivVon;
    @XmlElement(name = "aktiv_bis", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected Calendar aktivBis;
    @XmlElement(name = "openimmo_obid", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String openimmoObid;
    @XmlElement(name = "kennung_ursprung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String kennungUrsprung;
    @XmlElement(name = "stand_vom", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected Calendar standVom;
    @XmlElement(name = "weitergabe_generell")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean weitergabeGenerell;
    @XmlElement(name = "weitergabe_positiv")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String weitergabePositiv;
    @XmlElement(name = "weitergabe_negativ")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String weitergabeNegativ;
    @XmlElement(name = "gruppen_kennung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String gruppenKennung;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected Master master;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String sprache;
    @XmlElement(name = "user_defined_simplefield")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected List<UserDefinedSimplefield> userDefinedSimplefield;
    @XmlElement(name = "user_defined_anyfield")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected List<UserDefinedAnyfield> userDefinedAnyfield;
    @XmlElement(name = "user_defined_extend")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected List<UserDefinedExtend> userDefinedExtend;

    /**
     * Gets the value of the objektnrIntern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getObjektnrIntern() {
        return objektnrIntern;
    }

    /**
     * Sets the value of the objektnrIntern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setObjektnrIntern(String value) {
        this.objektnrIntern = value;
    }

    /**
     * Gets the value of the objektnrExtern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getObjektnrExtern() {
        return objektnrExtern;
    }

    /**
     * Sets the value of the objektnrExtern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setObjektnrExtern(String value) {
        this.objektnrExtern = value;
    }

    /**
     * Gets the value of the aktion property.
     * 
     * @return
     *     possible object is
     *     {@link Aktion }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Aktion getAktion() {
        return aktion;
    }

    /**
     * Sets the value of the aktion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Aktion }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setAktion(Aktion value) {
        this.aktion = value;
    }

    /**
     * Gets the value of the aktivVon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Calendar getAktivVon() {
        return aktivVon;
    }

    /**
     * Sets the value of the aktivVon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setAktivVon(Calendar value) {
        this.aktivVon = value;
    }

    /**
     * Gets the value of the aktivBis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Calendar getAktivBis() {
        return aktivBis;
    }

    /**
     * Sets the value of the aktivBis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setAktivBis(Calendar value) {
        this.aktivBis = value;
    }

    /**
     * Gets the value of the openimmoObid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getOpenimmoObid() {
        return openimmoObid;
    }

    /**
     * Sets the value of the openimmoObid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setOpenimmoObid(String value) {
        this.openimmoObid = value;
    }

    /**
     * Gets the value of the kennungUrsprung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getKennungUrsprung() {
        return kennungUrsprung;
    }

    /**
     * Sets the value of the kennungUrsprung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setKennungUrsprung(String value) {
        this.kennungUrsprung = value;
    }

    /**
     * Gets the value of the standVom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Calendar getStandVom() {
        return standVom;
    }

    /**
     * Sets the value of the standVom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setStandVom(Calendar value) {
        this.standVom = value;
    }

    /**
     * Gets the value of the weitergabeGenerell property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getWeitergabeGenerell() {
        return weitergabeGenerell;
    }

    /**
     * Sets the value of the weitergabeGenerell property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setWeitergabeGenerell(Boolean value) {
        this.weitergabeGenerell = value;
    }

    /**
     * Gets the value of the weitergabePositiv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getWeitergabePositiv() {
        return weitergabePositiv;
    }

    /**
     * Sets the value of the weitergabePositiv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setWeitergabePositiv(String value) {
        this.weitergabePositiv = value;
    }

    /**
     * Gets the value of the weitergabeNegativ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getWeitergabeNegativ() {
        return weitergabeNegativ;
    }

    /**
     * Sets the value of the weitergabeNegativ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setWeitergabeNegativ(String value) {
        this.weitergabeNegativ = value;
    }

    /**
     * Gets the value of the gruppenKennung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getGruppenKennung() {
        return gruppenKennung;
    }

    /**
     * Sets the value of the gruppenKennung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setGruppenKennung(String value) {
        this.gruppenKennung = value;
    }

    /**
     * Gets the value of the master property.
     * 
     * @return
     *     possible object is
     *     {@link Master }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Master getMaster() {
        return master;
    }

    /**
     * Sets the value of the master property.
     * 
     * @param value
     *     allowed object is
     *     {@link Master }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setMaster(Master value) {
        this.master = value;
    }

    /**
     * Gets the value of the sprache property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getSprache() {
        return sprache;
    }

    /**
     * Sets the value of the sprache property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setSprache(String value) {
        this.sprache = value;
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public List<UserDefinedExtend> getUserDefinedExtend() {
        if (userDefinedExtend == null) {
            userDefinedExtend = new ArrayList<UserDefinedExtend>();
        }
        return this.userDefinedExtend;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            String theObjektnrIntern;
            theObjektnrIntern = this.getObjektnrIntern();
            strategy.appendField(locator, this, "objektnrIntern", buffer, theObjektnrIntern, (this.objektnrIntern!= null));
        }
        {
            String theObjektnrExtern;
            theObjektnrExtern = this.getObjektnrExtern();
            strategy.appendField(locator, this, "objektnrExtern", buffer, theObjektnrExtern, (this.objektnrExtern!= null));
        }
        {
            Aktion theAktion;
            theAktion = this.getAktion();
            strategy.appendField(locator, this, "aktion", buffer, theAktion, (this.aktion!= null));
        }
        {
            Calendar theAktivVon;
            theAktivVon = this.getAktivVon();
            strategy.appendField(locator, this, "aktivVon", buffer, theAktivVon, (this.aktivVon!= null));
        }
        {
            Calendar theAktivBis;
            theAktivBis = this.getAktivBis();
            strategy.appendField(locator, this, "aktivBis", buffer, theAktivBis, (this.aktivBis!= null));
        }
        {
            String theOpenimmoObid;
            theOpenimmoObid = this.getOpenimmoObid();
            strategy.appendField(locator, this, "openimmoObid", buffer, theOpenimmoObid, (this.openimmoObid!= null));
        }
        {
            String theKennungUrsprung;
            theKennungUrsprung = this.getKennungUrsprung();
            strategy.appendField(locator, this, "kennungUrsprung", buffer, theKennungUrsprung, (this.kennungUrsprung!= null));
        }
        {
            Calendar theStandVom;
            theStandVom = this.getStandVom();
            strategy.appendField(locator, this, "standVom", buffer, theStandVom, (this.standVom!= null));
        }
        {
            Boolean theWeitergabeGenerell;
            theWeitergabeGenerell = this.getWeitergabeGenerell();
            strategy.appendField(locator, this, "weitergabeGenerell", buffer, theWeitergabeGenerell, (this.weitergabeGenerell!= null));
        }
        {
            String theWeitergabePositiv;
            theWeitergabePositiv = this.getWeitergabePositiv();
            strategy.appendField(locator, this, "weitergabePositiv", buffer, theWeitergabePositiv, (this.weitergabePositiv!= null));
        }
        {
            String theWeitergabeNegativ;
            theWeitergabeNegativ = this.getWeitergabeNegativ();
            strategy.appendField(locator, this, "weitergabeNegativ", buffer, theWeitergabeNegativ, (this.weitergabeNegativ!= null));
        }
        {
            String theGruppenKennung;
            theGruppenKennung = this.getGruppenKennung();
            strategy.appendField(locator, this, "gruppenKennung", buffer, theGruppenKennung, (this.gruppenKennung!= null));
        }
        {
            Master theMaster;
            theMaster = this.getMaster();
            strategy.appendField(locator, this, "master", buffer, theMaster, (this.master!= null));
        }
        {
            String theSprache;
            theSprache = this.getSprache();
            strategy.appendField(locator, this, "sprache", buffer, theSprache, (this.sprache!= null));
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
            List<UserDefinedExtend> theUserDefinedExtend;
            theUserDefinedExtend = (((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))?this.getUserDefinedExtend():null);
            strategy.appendField(locator, this, "userDefinedExtend", buffer, theUserDefinedExtend, ((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty())));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof VerwaltungTechn) {
            final VerwaltungTechn copy = ((VerwaltungTechn) draftCopy);
            {
                Boolean objektnrInternShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.objektnrIntern!= null));
                if (objektnrInternShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceObjektnrIntern;
                    sourceObjektnrIntern = this.getObjektnrIntern();
                    String copyObjektnrIntern = ((String) strategy.copy(LocatorUtils.property(locator, "objektnrIntern", sourceObjektnrIntern), sourceObjektnrIntern, (this.objektnrIntern!= null)));
                    copy.setObjektnrIntern(copyObjektnrIntern);
                } else {
                    if (objektnrInternShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.objektnrIntern = null;
                    }
                }
            }
            {
                Boolean objektnrExternShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.objektnrExtern!= null));
                if (objektnrExternShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceObjektnrExtern;
                    sourceObjektnrExtern = this.getObjektnrExtern();
                    String copyObjektnrExtern = ((String) strategy.copy(LocatorUtils.property(locator, "objektnrExtern", sourceObjektnrExtern), sourceObjektnrExtern, (this.objektnrExtern!= null)));
                    copy.setObjektnrExtern(copyObjektnrExtern);
                } else {
                    if (objektnrExternShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.objektnrExtern = null;
                    }
                }
            }
            {
                Boolean aktionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.aktion!= null));
                if (aktionShouldBeCopiedAndSet == Boolean.TRUE) {
                    Aktion sourceAktion;
                    sourceAktion = this.getAktion();
                    Aktion copyAktion = ((Aktion) strategy.copy(LocatorUtils.property(locator, "aktion", sourceAktion), sourceAktion, (this.aktion!= null)));
                    copy.setAktion(copyAktion);
                } else {
                    if (aktionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.aktion = null;
                    }
                }
            }
            {
                Boolean aktivVonShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.aktivVon!= null));
                if (aktivVonShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceAktivVon;
                    sourceAktivVon = this.getAktivVon();
                    Calendar copyAktivVon = ((Calendar) strategy.copy(LocatorUtils.property(locator, "aktivVon", sourceAktivVon), sourceAktivVon, (this.aktivVon!= null)));
                    copy.setAktivVon(copyAktivVon);
                } else {
                    if (aktivVonShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.aktivVon = null;
                    }
                }
            }
            {
                Boolean aktivBisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.aktivBis!= null));
                if (aktivBisShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceAktivBis;
                    sourceAktivBis = this.getAktivBis();
                    Calendar copyAktivBis = ((Calendar) strategy.copy(LocatorUtils.property(locator, "aktivBis", sourceAktivBis), sourceAktivBis, (this.aktivBis!= null)));
                    copy.setAktivBis(copyAktivBis);
                } else {
                    if (aktivBisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.aktivBis = null;
                    }
                }
            }
            {
                Boolean openimmoObidShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.openimmoObid!= null));
                if (openimmoObidShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceOpenimmoObid;
                    sourceOpenimmoObid = this.getOpenimmoObid();
                    String copyOpenimmoObid = ((String) strategy.copy(LocatorUtils.property(locator, "openimmoObid", sourceOpenimmoObid), sourceOpenimmoObid, (this.openimmoObid!= null)));
                    copy.setOpenimmoObid(copyOpenimmoObid);
                } else {
                    if (openimmoObidShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.openimmoObid = null;
                    }
                }
            }
            {
                Boolean kennungUrsprungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kennungUrsprung!= null));
                if (kennungUrsprungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceKennungUrsprung;
                    sourceKennungUrsprung = this.getKennungUrsprung();
                    String copyKennungUrsprung = ((String) strategy.copy(LocatorUtils.property(locator, "kennungUrsprung", sourceKennungUrsprung), sourceKennungUrsprung, (this.kennungUrsprung!= null)));
                    copy.setKennungUrsprung(copyKennungUrsprung);
                } else {
                    if (kennungUrsprungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kennungUrsprung = null;
                    }
                }
            }
            {
                Boolean standVomShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.standVom!= null));
                if (standVomShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceStandVom;
                    sourceStandVom = this.getStandVom();
                    Calendar copyStandVom = ((Calendar) strategy.copy(LocatorUtils.property(locator, "standVom", sourceStandVom), sourceStandVom, (this.standVom!= null)));
                    copy.setStandVom(copyStandVom);
                } else {
                    if (standVomShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.standVom = null;
                    }
                }
            }
            {
                Boolean weitergabeGenerellShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.weitergabeGenerell!= null));
                if (weitergabeGenerellShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceWeitergabeGenerell;
                    sourceWeitergabeGenerell = this.getWeitergabeGenerell();
                    Boolean copyWeitergabeGenerell = ((Boolean) strategy.copy(LocatorUtils.property(locator, "weitergabeGenerell", sourceWeitergabeGenerell), sourceWeitergabeGenerell, (this.weitergabeGenerell!= null)));
                    copy.setWeitergabeGenerell(copyWeitergabeGenerell);
                } else {
                    if (weitergabeGenerellShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.weitergabeGenerell = null;
                    }
                }
            }
            {
                Boolean weitergabePositivShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.weitergabePositiv!= null));
                if (weitergabePositivShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceWeitergabePositiv;
                    sourceWeitergabePositiv = this.getWeitergabePositiv();
                    String copyWeitergabePositiv = ((String) strategy.copy(LocatorUtils.property(locator, "weitergabePositiv", sourceWeitergabePositiv), sourceWeitergabePositiv, (this.weitergabePositiv!= null)));
                    copy.setWeitergabePositiv(copyWeitergabePositiv);
                } else {
                    if (weitergabePositivShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.weitergabePositiv = null;
                    }
                }
            }
            {
                Boolean weitergabeNegativShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.weitergabeNegativ!= null));
                if (weitergabeNegativShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceWeitergabeNegativ;
                    sourceWeitergabeNegativ = this.getWeitergabeNegativ();
                    String copyWeitergabeNegativ = ((String) strategy.copy(LocatorUtils.property(locator, "weitergabeNegativ", sourceWeitergabeNegativ), sourceWeitergabeNegativ, (this.weitergabeNegativ!= null)));
                    copy.setWeitergabeNegativ(copyWeitergabeNegativ);
                } else {
                    if (weitergabeNegativShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.weitergabeNegativ = null;
                    }
                }
            }
            {
                Boolean gruppenKennungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gruppenKennung!= null));
                if (gruppenKennungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceGruppenKennung;
                    sourceGruppenKennung = this.getGruppenKennung();
                    String copyGruppenKennung = ((String) strategy.copy(LocatorUtils.property(locator, "gruppenKennung", sourceGruppenKennung), sourceGruppenKennung, (this.gruppenKennung!= null)));
                    copy.setGruppenKennung(copyGruppenKennung);
                } else {
                    if (gruppenKennungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gruppenKennung = null;
                    }
                }
            }
            {
                Boolean masterShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.master!= null));
                if (masterShouldBeCopiedAndSet == Boolean.TRUE) {
                    Master sourceMaster;
                    sourceMaster = this.getMaster();
                    Master copyMaster = ((Master) strategy.copy(LocatorUtils.property(locator, "master", sourceMaster), sourceMaster, (this.master!= null)));
                    copy.setMaster(copyMaster);
                } else {
                    if (masterShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.master = null;
                    }
                }
            }
            {
                Boolean spracheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sprache!= null));
                if (spracheShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSprache;
                    sourceSprache = this.getSprache();
                    String copySprache = ((String) strategy.copy(LocatorUtils.property(locator, "sprache", sourceSprache), sourceSprache, (this.sprache!= null)));
                    copy.setSprache(copySprache);
                } else {
                    if (spracheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sprache = null;
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
                Boolean userDefinedExtendShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty())));
                if (userDefinedExtendShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<UserDefinedExtend> sourceUserDefinedExtend;
                    sourceUserDefinedExtend = (((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))?this.getUserDefinedExtend():null);
                    @SuppressWarnings("unchecked")
                    List<UserDefinedExtend> copyUserDefinedExtend = ((List<UserDefinedExtend> ) strategy.copy(LocatorUtils.property(locator, "userDefinedExtend", sourceUserDefinedExtend), sourceUserDefinedExtend, ((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))));
                    copy.userDefinedExtend = null;
                    if (copyUserDefinedExtend!= null) {
                        List<UserDefinedExtend> uniqueUserDefinedExtendl = copy.getUserDefinedExtend();
                        uniqueUserDefinedExtendl.addAll(copyUserDefinedExtend);
                    }
                } else {
                    if (userDefinedExtendShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.userDefinedExtend = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new VerwaltungTechn();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final VerwaltungTechn that = ((VerwaltungTechn) object);
        {
            String lhsObjektnrIntern;
            lhsObjektnrIntern = this.getObjektnrIntern();
            String rhsObjektnrIntern;
            rhsObjektnrIntern = that.getObjektnrIntern();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektnrIntern", lhsObjektnrIntern), LocatorUtils.property(thatLocator, "objektnrIntern", rhsObjektnrIntern), lhsObjektnrIntern, rhsObjektnrIntern, (this.objektnrIntern!= null), (that.objektnrIntern!= null))) {
                return false;
            }
        }
        {
            String lhsObjektnrExtern;
            lhsObjektnrExtern = this.getObjektnrExtern();
            String rhsObjektnrExtern;
            rhsObjektnrExtern = that.getObjektnrExtern();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektnrExtern", lhsObjektnrExtern), LocatorUtils.property(thatLocator, "objektnrExtern", rhsObjektnrExtern), lhsObjektnrExtern, rhsObjektnrExtern, (this.objektnrExtern!= null), (that.objektnrExtern!= null))) {
                return false;
            }
        }
        {
            Aktion lhsAktion;
            lhsAktion = this.getAktion();
            Aktion rhsAktion;
            rhsAktion = that.getAktion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aktion", lhsAktion), LocatorUtils.property(thatLocator, "aktion", rhsAktion), lhsAktion, rhsAktion, (this.aktion!= null), (that.aktion!= null))) {
                return false;
            }
        }
        {
            Calendar lhsAktivVon;
            lhsAktivVon = this.getAktivVon();
            Calendar rhsAktivVon;
            rhsAktivVon = that.getAktivVon();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aktivVon", lhsAktivVon), LocatorUtils.property(thatLocator, "aktivVon", rhsAktivVon), lhsAktivVon, rhsAktivVon, (this.aktivVon!= null), (that.aktivVon!= null))) {
                return false;
            }
        }
        {
            Calendar lhsAktivBis;
            lhsAktivBis = this.getAktivBis();
            Calendar rhsAktivBis;
            rhsAktivBis = that.getAktivBis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aktivBis", lhsAktivBis), LocatorUtils.property(thatLocator, "aktivBis", rhsAktivBis), lhsAktivBis, rhsAktivBis, (this.aktivBis!= null), (that.aktivBis!= null))) {
                return false;
            }
        }
        {
            String lhsOpenimmoObid;
            lhsOpenimmoObid = this.getOpenimmoObid();
            String rhsOpenimmoObid;
            rhsOpenimmoObid = that.getOpenimmoObid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "openimmoObid", lhsOpenimmoObid), LocatorUtils.property(thatLocator, "openimmoObid", rhsOpenimmoObid), lhsOpenimmoObid, rhsOpenimmoObid, (this.openimmoObid!= null), (that.openimmoObid!= null))) {
                return false;
            }
        }
        {
            String lhsKennungUrsprung;
            lhsKennungUrsprung = this.getKennungUrsprung();
            String rhsKennungUrsprung;
            rhsKennungUrsprung = that.getKennungUrsprung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kennungUrsprung", lhsKennungUrsprung), LocatorUtils.property(thatLocator, "kennungUrsprung", rhsKennungUrsprung), lhsKennungUrsprung, rhsKennungUrsprung, (this.kennungUrsprung!= null), (that.kennungUrsprung!= null))) {
                return false;
            }
        }
        {
            Calendar lhsStandVom;
            lhsStandVom = this.getStandVom();
            Calendar rhsStandVom;
            rhsStandVom = that.getStandVom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "standVom", lhsStandVom), LocatorUtils.property(thatLocator, "standVom", rhsStandVom), lhsStandVom, rhsStandVom, (this.standVom!= null), (that.standVom!= null))) {
                return false;
            }
        }
        {
            Boolean lhsWeitergabeGenerell;
            lhsWeitergabeGenerell = this.getWeitergabeGenerell();
            Boolean rhsWeitergabeGenerell;
            rhsWeitergabeGenerell = that.getWeitergabeGenerell();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "weitergabeGenerell", lhsWeitergabeGenerell), LocatorUtils.property(thatLocator, "weitergabeGenerell", rhsWeitergabeGenerell), lhsWeitergabeGenerell, rhsWeitergabeGenerell, (this.weitergabeGenerell!= null), (that.weitergabeGenerell!= null))) {
                return false;
            }
        }
        {
            String lhsWeitergabePositiv;
            lhsWeitergabePositiv = this.getWeitergabePositiv();
            String rhsWeitergabePositiv;
            rhsWeitergabePositiv = that.getWeitergabePositiv();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "weitergabePositiv", lhsWeitergabePositiv), LocatorUtils.property(thatLocator, "weitergabePositiv", rhsWeitergabePositiv), lhsWeitergabePositiv, rhsWeitergabePositiv, (this.weitergabePositiv!= null), (that.weitergabePositiv!= null))) {
                return false;
            }
        }
        {
            String lhsWeitergabeNegativ;
            lhsWeitergabeNegativ = this.getWeitergabeNegativ();
            String rhsWeitergabeNegativ;
            rhsWeitergabeNegativ = that.getWeitergabeNegativ();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "weitergabeNegativ", lhsWeitergabeNegativ), LocatorUtils.property(thatLocator, "weitergabeNegativ", rhsWeitergabeNegativ), lhsWeitergabeNegativ, rhsWeitergabeNegativ, (this.weitergabeNegativ!= null), (that.weitergabeNegativ!= null))) {
                return false;
            }
        }
        {
            String lhsGruppenKennung;
            lhsGruppenKennung = this.getGruppenKennung();
            String rhsGruppenKennung;
            rhsGruppenKennung = that.getGruppenKennung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gruppenKennung", lhsGruppenKennung), LocatorUtils.property(thatLocator, "gruppenKennung", rhsGruppenKennung), lhsGruppenKennung, rhsGruppenKennung, (this.gruppenKennung!= null), (that.gruppenKennung!= null))) {
                return false;
            }
        }
        {
            Master lhsMaster;
            lhsMaster = this.getMaster();
            Master rhsMaster;
            rhsMaster = that.getMaster();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "master", lhsMaster), LocatorUtils.property(thatLocator, "master", rhsMaster), lhsMaster, rhsMaster, (this.master!= null), (that.master!= null))) {
                return false;
            }
        }
        {
            String lhsSprache;
            lhsSprache = this.getSprache();
            String rhsSprache;
            rhsSprache = that.getSprache();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sprache", lhsSprache), LocatorUtils.property(thatLocator, "sprache", rhsSprache), lhsSprache, rhsSprache, (this.sprache!= null), (that.sprache!= null))) {
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
            List<UserDefinedExtend> lhsUserDefinedExtend;
            lhsUserDefinedExtend = (((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))?this.getUserDefinedExtend():null);
            List<UserDefinedExtend> rhsUserDefinedExtend;
            rhsUserDefinedExtend = (((that.userDefinedExtend!= null)&&(!that.userDefinedExtend.isEmpty()))?that.getUserDefinedExtend():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefinedExtend", lhsUserDefinedExtend), LocatorUtils.property(thatLocator, "userDefinedExtend", rhsUserDefinedExtend), lhsUserDefinedExtend, rhsUserDefinedExtend, ((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty())), ((that.userDefinedExtend!= null)&&(!that.userDefinedExtend.isEmpty())))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
