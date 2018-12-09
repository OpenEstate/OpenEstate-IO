
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
 * Java class for &lt;freitexte&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "objekttitel",
    "dreizeiler",
    "lage",
    "ausstattBeschr",
    "objektbeschreibung",
    "sonstigeAngaben",
    "objektText",
    "userDefinedSimplefield",
    "userDefinedAnyfield",
    "userDefinedExtend"
})
@XmlRootElement(name = "freitexte")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
public class Freitexte implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String objekttitel;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String dreizeiler;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String lage;
    @XmlElement(name = "ausstatt_beschr")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String ausstattBeschr;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String objektbeschreibung;
    @XmlElement(name = "sonstige_angaben")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String sonstigeAngaben;
    @XmlElement(name = "objekt_text")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected ObjektText objektText;
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
     * Gets the value of the objekttitel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getObjekttitel() {
        return objekttitel;
    }

    /**
     * Sets the value of the objekttitel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setObjekttitel(String value) {
        this.objekttitel = value;
    }

    /**
     * Gets the value of the dreizeiler property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getDreizeiler() {
        return dreizeiler;
    }

    /**
     * Sets the value of the dreizeiler property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setDreizeiler(String value) {
        this.dreizeiler = value;
    }

    /**
     * Gets the value of the lage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setLage(String value) {
        this.lage = value;
    }

    /**
     * Gets the value of the ausstattBeschr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getAusstattBeschr() {
        return ausstattBeschr;
    }

    /**
     * Sets the value of the ausstattBeschr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setAusstattBeschr(String value) {
        this.ausstattBeschr = value;
    }

    /**
     * Gets the value of the objektbeschreibung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setObjektbeschreibung(String value) {
        this.objektbeschreibung = value;
    }

    /**
     * Gets the value of the sonstigeAngaben property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setSonstigeAngaben(String value) {
        this.sonstigeAngaben = value;
    }

    /**
     * Gets the value of the objektText property.
     * 
     * @return
     *     possible object is
     *     {@link ObjektText }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public ObjektText getObjektText() {
        return objektText;
    }

    /**
     * Sets the value of the objektText property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjektText }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setObjektText(ObjektText value) {
        this.objektText = value;
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
            String theObjekttitel;
            theObjekttitel = this.getObjekttitel();
            strategy.appendField(locator, this, "objekttitel", buffer, theObjekttitel, (this.objekttitel!= null));
        }
        {
            String theDreizeiler;
            theDreizeiler = this.getDreizeiler();
            strategy.appendField(locator, this, "dreizeiler", buffer, theDreizeiler, (this.dreizeiler!= null));
        }
        {
            String theLage;
            theLage = this.getLage();
            strategy.appendField(locator, this, "lage", buffer, theLage, (this.lage!= null));
        }
        {
            String theAusstattBeschr;
            theAusstattBeschr = this.getAusstattBeschr();
            strategy.appendField(locator, this, "ausstattBeschr", buffer, theAusstattBeschr, (this.ausstattBeschr!= null));
        }
        {
            String theObjektbeschreibung;
            theObjektbeschreibung = this.getObjektbeschreibung();
            strategy.appendField(locator, this, "objektbeschreibung", buffer, theObjektbeschreibung, (this.objektbeschreibung!= null));
        }
        {
            String theSonstigeAngaben;
            theSonstigeAngaben = this.getSonstigeAngaben();
            strategy.appendField(locator, this, "sonstigeAngaben", buffer, theSonstigeAngaben, (this.sonstigeAngaben!= null));
        }
        {
            ObjektText theObjektText;
            theObjektText = this.getObjektText();
            strategy.appendField(locator, this, "objektText", buffer, theObjektText, (this.objektText!= null));
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
        if (draftCopy instanceof Freitexte) {
            final Freitexte copy = ((Freitexte) draftCopy);
            {
                Boolean objekttitelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.objekttitel!= null));
                if (objekttitelShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceObjekttitel;
                    sourceObjekttitel = this.getObjekttitel();
                    String copyObjekttitel = ((String) strategy.copy(LocatorUtils.property(locator, "objekttitel", sourceObjekttitel), sourceObjekttitel, (this.objekttitel!= null)));
                    copy.setObjekttitel(copyObjekttitel);
                } else {
                    if (objekttitelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.objekttitel = null;
                    }
                }
            }
            {
                Boolean dreizeilerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dreizeiler!= null));
                if (dreizeilerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDreizeiler;
                    sourceDreizeiler = this.getDreizeiler();
                    String copyDreizeiler = ((String) strategy.copy(LocatorUtils.property(locator, "dreizeiler", sourceDreizeiler), sourceDreizeiler, (this.dreizeiler!= null)));
                    copy.setDreizeiler(copyDreizeiler);
                } else {
                    if (dreizeilerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dreizeiler = null;
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
                Boolean ausstattBeschrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ausstattBeschr!= null));
                if (ausstattBeschrShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAusstattBeschr;
                    sourceAusstattBeschr = this.getAusstattBeschr();
                    String copyAusstattBeschr = ((String) strategy.copy(LocatorUtils.property(locator, "ausstattBeschr", sourceAusstattBeschr), sourceAusstattBeschr, (this.ausstattBeschr!= null)));
                    copy.setAusstattBeschr(copyAusstattBeschr);
                } else {
                    if (ausstattBeschrShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ausstattBeschr = null;
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
                Boolean objektTextShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.objektText!= null));
                if (objektTextShouldBeCopiedAndSet == Boolean.TRUE) {
                    ObjektText sourceObjektText;
                    sourceObjektText = this.getObjektText();
                    ObjektText copyObjektText = ((ObjektText) strategy.copy(LocatorUtils.property(locator, "objektText", sourceObjektText), sourceObjektText, (this.objektText!= null)));
                    copy.setObjektText(copyObjektText);
                } else {
                    if (objektTextShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.objektText = null;
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
        return new Freitexte();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Freitexte that = ((Freitexte) object);
        {
            String lhsObjekttitel;
            lhsObjekttitel = this.getObjekttitel();
            String rhsObjekttitel;
            rhsObjekttitel = that.getObjekttitel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objekttitel", lhsObjekttitel), LocatorUtils.property(thatLocator, "objekttitel", rhsObjekttitel), lhsObjekttitel, rhsObjekttitel, (this.objekttitel!= null), (that.objekttitel!= null))) {
                return false;
            }
        }
        {
            String lhsDreizeiler;
            lhsDreizeiler = this.getDreizeiler();
            String rhsDreizeiler;
            rhsDreizeiler = that.getDreizeiler();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dreizeiler", lhsDreizeiler), LocatorUtils.property(thatLocator, "dreizeiler", rhsDreizeiler), lhsDreizeiler, rhsDreizeiler, (this.dreizeiler!= null), (that.dreizeiler!= null))) {
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
            String lhsAusstattBeschr;
            lhsAusstattBeschr = this.getAusstattBeschr();
            String rhsAusstattBeschr;
            rhsAusstattBeschr = that.getAusstattBeschr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ausstattBeschr", lhsAusstattBeschr), LocatorUtils.property(thatLocator, "ausstattBeschr", rhsAusstattBeschr), lhsAusstattBeschr, rhsAusstattBeschr, (this.ausstattBeschr!= null), (that.ausstattBeschr!= null))) {
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
            String lhsSonstigeAngaben;
            lhsSonstigeAngaben = this.getSonstigeAngaben();
            String rhsSonstigeAngaben;
            rhsSonstigeAngaben = that.getSonstigeAngaben();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sonstigeAngaben", lhsSonstigeAngaben), LocatorUtils.property(thatLocator, "sonstigeAngaben", rhsSonstigeAngaben), lhsSonstigeAngaben, rhsSonstigeAngaben, (this.sonstigeAngaben!= null), (that.sonstigeAngaben!= null))) {
                return false;
            }
        }
        {
            ObjektText lhsObjektText;
            lhsObjektText = this.getObjektText();
            ObjektText rhsObjektText;
            rhsObjektText = that.getObjektText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektText", lhsObjektText), LocatorUtils.property(thatLocator, "objektText", rhsObjektText), lhsObjektText, rhsObjektText, (this.objektText!= null), (that.objektText!= null))) {
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
