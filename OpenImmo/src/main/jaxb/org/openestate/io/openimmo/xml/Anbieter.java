
package org.openestate.io.openimmo.xml;

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
 * Java class for &lt;anbieter&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "anbieternr",
    "firma",
    "openimmoAnid",
    "lizenzkennung",
    "anhang",
    "immobilie",
    "impressum",
    "impressumStrukt",
    "userDefinedSimplefield",
    "userDefinedAnyfield",
    "userDefinedExtend"
})
@XmlRootElement(name = "anbieter")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
public class Anbieter implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected String anbieternr;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected String firma;
    @XmlElement(name = "openimmo_anid", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected String openimmoAnid;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected String lizenzkennung;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Anhang anhang;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected List<Immobilie> immobilie;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected String impressum;
    @XmlElement(name = "impressum_strukt")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected ImpressumStrukt impressumStrukt;
    @XmlElement(name = "user_defined_simplefield")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected List<UserDefinedSimplefield> userDefinedSimplefield;
    @XmlElement(name = "user_defined_anyfield")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected List<UserDefinedAnyfield> userDefinedAnyfield;
    @XmlElement(name = "user_defined_extend")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected List<UserDefinedExtend> userDefinedExtend;

    /**
     * Gets the value of the anbieternr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public String getAnbieternr() {
        return anbieternr;
    }

    /**
     * Sets the value of the anbieternr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setAnbieternr(String value) {
        this.anbieternr = value;
    }

    /**
     * Gets the value of the firma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setFirma(String value) {
        this.firma = value;
    }

    /**
     * Gets the value of the openimmoAnid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public String getOpenimmoAnid() {
        return openimmoAnid;
    }

    /**
     * Sets the value of the openimmoAnid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setOpenimmoAnid(String value) {
        this.openimmoAnid = value;
    }

    /**
     * Gets the value of the lizenzkennung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public String getLizenzkennung() {
        return lizenzkennung;
    }

    /**
     * Sets the value of the lizenzkennung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setLizenzkennung(String value) {
        this.lizenzkennung = value;
    }

    /**
     * Gets the value of the anhang property.
     * 
     * @return
     *     possible object is
     *     {@link Anhang }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Anhang getAnhang() {
        return anhang;
    }

    /**
     * Sets the value of the anhang property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anhang }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setAnhang(Anhang value) {
        this.anhang = value;
    }

    /**
     * Gets the value of the immobilie property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the immobilie property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImmobilie().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Immobilie }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public List<Immobilie> getImmobilie() {
        if (immobilie == null) {
            immobilie = new ArrayList<Immobilie>();
        }
        return this.immobilie;
    }

    /**
     * Gets the value of the impressum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public String getImpressum() {
        return impressum;
    }

    /**
     * Sets the value of the impressum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setImpressum(String value) {
        this.impressum = value;
    }

    /**
     * Gets the value of the impressumStrukt property.
     * 
     * @return
     *     possible object is
     *     {@link ImpressumStrukt }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public ImpressumStrukt getImpressumStrukt() {
        return impressumStrukt;
    }

    /**
     * Sets the value of the impressumStrukt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpressumStrukt }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setImpressumStrukt(ImpressumStrukt value) {
        this.impressumStrukt = value;
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public List<UserDefinedExtend> getUserDefinedExtend() {
        if (userDefinedExtend == null) {
            userDefinedExtend = new ArrayList<UserDefinedExtend>();
        }
        return this.userDefinedExtend;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            String theAnbieternr;
            theAnbieternr = this.getAnbieternr();
            strategy.appendField(locator, this, "anbieternr", buffer, theAnbieternr, (this.anbieternr!= null));
        }
        {
            String theFirma;
            theFirma = this.getFirma();
            strategy.appendField(locator, this, "firma", buffer, theFirma, (this.firma!= null));
        }
        {
            String theOpenimmoAnid;
            theOpenimmoAnid = this.getOpenimmoAnid();
            strategy.appendField(locator, this, "openimmoAnid", buffer, theOpenimmoAnid, (this.openimmoAnid!= null));
        }
        {
            String theLizenzkennung;
            theLizenzkennung = this.getLizenzkennung();
            strategy.appendField(locator, this, "lizenzkennung", buffer, theLizenzkennung, (this.lizenzkennung!= null));
        }
        {
            Anhang theAnhang;
            theAnhang = this.getAnhang();
            strategy.appendField(locator, this, "anhang", buffer, theAnhang, (this.anhang!= null));
        }
        {
            List<Immobilie> theImmobilie;
            theImmobilie = (((this.immobilie!= null)&&(!this.immobilie.isEmpty()))?this.getImmobilie():null);
            strategy.appendField(locator, this, "immobilie", buffer, theImmobilie, ((this.immobilie!= null)&&(!this.immobilie.isEmpty())));
        }
        {
            String theImpressum;
            theImpressum = this.getImpressum();
            strategy.appendField(locator, this, "impressum", buffer, theImpressum, (this.impressum!= null));
        }
        {
            ImpressumStrukt theImpressumStrukt;
            theImpressumStrukt = this.getImpressumStrukt();
            strategy.appendField(locator, this, "impressumStrukt", buffer, theImpressumStrukt, (this.impressumStrukt!= null));
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

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Anbieter) {
            final Anbieter copy = ((Anbieter) draftCopy);
            {
                Boolean anbieternrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anbieternr!= null));
                if (anbieternrShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAnbieternr;
                    sourceAnbieternr = this.getAnbieternr();
                    String copyAnbieternr = ((String) strategy.copy(LocatorUtils.property(locator, "anbieternr", sourceAnbieternr), sourceAnbieternr, (this.anbieternr!= null)));
                    copy.setAnbieternr(copyAnbieternr);
                } else {
                    if (anbieternrShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anbieternr = null;
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
                Boolean openimmoAnidShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.openimmoAnid!= null));
                if (openimmoAnidShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceOpenimmoAnid;
                    sourceOpenimmoAnid = this.getOpenimmoAnid();
                    String copyOpenimmoAnid = ((String) strategy.copy(LocatorUtils.property(locator, "openimmoAnid", sourceOpenimmoAnid), sourceOpenimmoAnid, (this.openimmoAnid!= null)));
                    copy.setOpenimmoAnid(copyOpenimmoAnid);
                } else {
                    if (openimmoAnidShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.openimmoAnid = null;
                    }
                }
            }
            {
                Boolean lizenzkennungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lizenzkennung!= null));
                if (lizenzkennungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceLizenzkennung;
                    sourceLizenzkennung = this.getLizenzkennung();
                    String copyLizenzkennung = ((String) strategy.copy(LocatorUtils.property(locator, "lizenzkennung", sourceLizenzkennung), sourceLizenzkennung, (this.lizenzkennung!= null)));
                    copy.setLizenzkennung(copyLizenzkennung);
                } else {
                    if (lizenzkennungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lizenzkennung = null;
                    }
                }
            }
            {
                Boolean anhangShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anhang!= null));
                if (anhangShouldBeCopiedAndSet == Boolean.TRUE) {
                    Anhang sourceAnhang;
                    sourceAnhang = this.getAnhang();
                    Anhang copyAnhang = ((Anhang) strategy.copy(LocatorUtils.property(locator, "anhang", sourceAnhang), sourceAnhang, (this.anhang!= null)));
                    copy.setAnhang(copyAnhang);
                } else {
                    if (anhangShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anhang = null;
                    }
                }
            }
            {
                Boolean immobilieShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.immobilie!= null)&&(!this.immobilie.isEmpty())));
                if (immobilieShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Immobilie> sourceImmobilie;
                    sourceImmobilie = (((this.immobilie!= null)&&(!this.immobilie.isEmpty()))?this.getImmobilie():null);
                    @SuppressWarnings("unchecked")
                    List<Immobilie> copyImmobilie = ((List<Immobilie> ) strategy.copy(LocatorUtils.property(locator, "immobilie", sourceImmobilie), sourceImmobilie, ((this.immobilie!= null)&&(!this.immobilie.isEmpty()))));
                    copy.immobilie = null;
                    if (copyImmobilie!= null) {
                        List<Immobilie> uniqueImmobiliel = copy.getImmobilie();
                        uniqueImmobiliel.addAll(copyImmobilie);
                    }
                } else {
                    if (immobilieShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.immobilie = null;
                    }
                }
            }
            {
                Boolean impressumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.impressum!= null));
                if (impressumShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceImpressum;
                    sourceImpressum = this.getImpressum();
                    String copyImpressum = ((String) strategy.copy(LocatorUtils.property(locator, "impressum", sourceImpressum), sourceImpressum, (this.impressum!= null)));
                    copy.setImpressum(copyImpressum);
                } else {
                    if (impressumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.impressum = null;
                    }
                }
            }
            {
                Boolean impressumStruktShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.impressumStrukt!= null));
                if (impressumStruktShouldBeCopiedAndSet == Boolean.TRUE) {
                    ImpressumStrukt sourceImpressumStrukt;
                    sourceImpressumStrukt = this.getImpressumStrukt();
                    ImpressumStrukt copyImpressumStrukt = ((ImpressumStrukt) strategy.copy(LocatorUtils.property(locator, "impressumStrukt", sourceImpressumStrukt), sourceImpressumStrukt, (this.impressumStrukt!= null)));
                    copy.setImpressumStrukt(copyImpressumStrukt);
                } else {
                    if (impressumStruktShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.impressumStrukt = null;
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

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Anbieter();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Anbieter that = ((Anbieter) object);
        {
            String lhsAnbieternr;
            lhsAnbieternr = this.getAnbieternr();
            String rhsAnbieternr;
            rhsAnbieternr = that.getAnbieternr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anbieternr", lhsAnbieternr), LocatorUtils.property(thatLocator, "anbieternr", rhsAnbieternr), lhsAnbieternr, rhsAnbieternr, (this.anbieternr!= null), (that.anbieternr!= null))) {
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
            String lhsOpenimmoAnid;
            lhsOpenimmoAnid = this.getOpenimmoAnid();
            String rhsOpenimmoAnid;
            rhsOpenimmoAnid = that.getOpenimmoAnid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "openimmoAnid", lhsOpenimmoAnid), LocatorUtils.property(thatLocator, "openimmoAnid", rhsOpenimmoAnid), lhsOpenimmoAnid, rhsOpenimmoAnid, (this.openimmoAnid!= null), (that.openimmoAnid!= null))) {
                return false;
            }
        }
        {
            String lhsLizenzkennung;
            lhsLizenzkennung = this.getLizenzkennung();
            String rhsLizenzkennung;
            rhsLizenzkennung = that.getLizenzkennung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lizenzkennung", lhsLizenzkennung), LocatorUtils.property(thatLocator, "lizenzkennung", rhsLizenzkennung), lhsLizenzkennung, rhsLizenzkennung, (this.lizenzkennung!= null), (that.lizenzkennung!= null))) {
                return false;
            }
        }
        {
            Anhang lhsAnhang;
            lhsAnhang = this.getAnhang();
            Anhang rhsAnhang;
            rhsAnhang = that.getAnhang();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anhang", lhsAnhang), LocatorUtils.property(thatLocator, "anhang", rhsAnhang), lhsAnhang, rhsAnhang, (this.anhang!= null), (that.anhang!= null))) {
                return false;
            }
        }
        {
            List<Immobilie> lhsImmobilie;
            lhsImmobilie = (((this.immobilie!= null)&&(!this.immobilie.isEmpty()))?this.getImmobilie():null);
            List<Immobilie> rhsImmobilie;
            rhsImmobilie = (((that.immobilie!= null)&&(!that.immobilie.isEmpty()))?that.getImmobilie():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "immobilie", lhsImmobilie), LocatorUtils.property(thatLocator, "immobilie", rhsImmobilie), lhsImmobilie, rhsImmobilie, ((this.immobilie!= null)&&(!this.immobilie.isEmpty())), ((that.immobilie!= null)&&(!that.immobilie.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsImpressum;
            lhsImpressum = this.getImpressum();
            String rhsImpressum;
            rhsImpressum = that.getImpressum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "impressum", lhsImpressum), LocatorUtils.property(thatLocator, "impressum", rhsImpressum), lhsImpressum, rhsImpressum, (this.impressum!= null), (that.impressum!= null))) {
                return false;
            }
        }
        {
            ImpressumStrukt lhsImpressumStrukt;
            lhsImpressumStrukt = this.getImpressumStrukt();
            ImpressumStrukt rhsImpressumStrukt;
            rhsImpressumStrukt = that.getImpressumStrukt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "impressumStrukt", lhsImpressumStrukt), LocatorUtils.property(thatLocator, "impressumStrukt", rhsImpressumStrukt), lhsImpressumStrukt, rhsImpressumStrukt, (this.impressumStrukt!= null), (that.impressumStrukt!= null))) {
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

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }

}
