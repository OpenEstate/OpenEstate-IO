
package org.openestate.io.immoxml.xml;

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
    "immoxmlObid",
    "kennungUrsprung",
    "standVom",
    "weitergabeGenerell",
    "weitergabePositiv",
    "weitergabeNegativ",
    "userDefinedSimplefield",
    "userDefinedAnyfield"
})
@XmlRootElement(name = "verwaltung_techn")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
public class VerwaltungTechn implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "objektnr_intern")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String objektnrIntern;
    @XmlElement(name = "objektnr_extern", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String objektnrExtern;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Aktion aktion;
    @XmlElement(name = "aktiv_von", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Calendar aktivVon;
    @XmlElement(name = "aktiv_bis", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Calendar aktivBis;
    @XmlElement(name = "immoxml_obid", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String immoxmlObid;
    @XmlElement(name = "kennung_ursprung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String kennungUrsprung;
    @XmlElement(name = "stand_vom", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Calendar standVom;
    @XmlElement(name = "weitergabe_generell")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean weitergabeGenerell;
    @XmlElement(name = "weitergabe_positiv")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String weitergabePositiv;
    @XmlElement(name = "weitergabe_negativ")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String weitergabeNegativ;
    @XmlElement(name = "user_defined_simplefield")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected List<UserDefinedSimplefield> userDefinedSimplefield;
    @XmlElement(name = "user_defined_anyfield")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected List<UserDefinedAnyfield> userDefinedAnyfield;

    /**
     * Gets the value of the objektnrIntern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setAktivBis(Calendar value) {
        this.aktivBis = value;
    }

    /**
     * Gets the value of the immoxmlObid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String getImmoxmlObid() {
        return immoxmlObid;
    }

    /**
     * Sets the value of the immoxmlObid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setImmoxmlObid(String value) {
        this.immoxmlObid = value;
    }

    /**
     * Gets the value of the kennungUrsprung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setWeitergabeNegativ(String value) {
        this.weitergabeNegativ = value;
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
            String theImmoxmlObid;
            theImmoxmlObid = this.getImmoxmlObid();
            strategy.appendField(locator, this, "immoxmlObid", buffer, theImmoxmlObid, (this.immoxmlObid!= null));
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
                Boolean immoxmlObidShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.immoxmlObid!= null));
                if (immoxmlObidShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceImmoxmlObid;
                    sourceImmoxmlObid = this.getImmoxmlObid();
                    String copyImmoxmlObid = ((String) strategy.copy(LocatorUtils.property(locator, "immoxmlObid", sourceImmoxmlObid), sourceImmoxmlObid, (this.immoxmlObid!= null)));
                    copy.setImmoxmlObid(copyImmoxmlObid);
                } else {
                    if (immoxmlObidShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.immoxmlObid = null;
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
        return new VerwaltungTechn();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
            String lhsImmoxmlObid;
            lhsImmoxmlObid = this.getImmoxmlObid();
            String rhsImmoxmlObid;
            rhsImmoxmlObid = that.getImmoxmlObid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "immoxmlObid", lhsImmoxmlObid), LocatorUtils.property(thatLocator, "immoxmlObid", rhsImmoxmlObid), lhsImmoxmlObid, rhsImmoxmlObid, (this.immoxmlObid!= null), (that.immoxmlObid!= null))) {
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
