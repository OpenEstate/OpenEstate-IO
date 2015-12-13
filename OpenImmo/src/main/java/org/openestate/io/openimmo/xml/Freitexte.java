
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
public class Freitexte
    implements Cloneable, CopyTo, Equals, ToString
{

    protected String objekttitel;
    protected String dreizeiler;
    protected String lage;
    @XmlElement(name = "ausstatt_beschr")
    protected String ausstattBeschr;
    protected String objektbeschreibung;
    @XmlElement(name = "sonstige_angaben")
    protected String sonstigeAngaben;
    @XmlElement(name = "objekt_text")
    protected ObjektText objektText;
    @XmlElement(name = "user_defined_simplefield")
    protected List<UserDefinedSimplefield> userDefinedSimplefield;
    @XmlElement(name = "user_defined_anyfield")
    protected List<UserDefinedAnyfield> userDefinedAnyfield;
    @XmlElement(name = "user_defined_extend")
    protected List<UserDefinedExtend> userDefinedExtend;

    /**
     * Gets the value of the objekttitel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
     * Gets the value of the ausstattBeschr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
     * Gets the value of the objektText property.
     * 
     * @return
     *     possible object is
     *     {@link ObjektText }
     *     
     */
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
            String theObjekttitel;
            theObjekttitel = this.getObjekttitel();
            strategy.appendField(locator, this, "objekttitel", buffer, theObjekttitel);
        }
        {
            String theDreizeiler;
            theDreizeiler = this.getDreizeiler();
            strategy.appendField(locator, this, "dreizeiler", buffer, theDreizeiler);
        }
        {
            String theLage;
            theLage = this.getLage();
            strategy.appendField(locator, this, "lage", buffer, theLage);
        }
        {
            String theAusstattBeschr;
            theAusstattBeschr = this.getAusstattBeschr();
            strategy.appendField(locator, this, "ausstattBeschr", buffer, theAusstattBeschr);
        }
        {
            String theObjektbeschreibung;
            theObjektbeschreibung = this.getObjektbeschreibung();
            strategy.appendField(locator, this, "objektbeschreibung", buffer, theObjektbeschreibung);
        }
        {
            String theSonstigeAngaben;
            theSonstigeAngaben = this.getSonstigeAngaben();
            strategy.appendField(locator, this, "sonstigeAngaben", buffer, theSonstigeAngaben);
        }
        {
            ObjektText theObjektText;
            theObjektText = this.getObjektText();
            strategy.appendField(locator, this, "objektText", buffer, theObjektText);
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
        if (draftCopy instanceof Freitexte) {
            final Freitexte copy = ((Freitexte) draftCopy);
            if (this.objekttitel!= null) {
                String sourceObjekttitel;
                sourceObjekttitel = this.getObjekttitel();
                String copyObjekttitel = ((String) strategy.copy(LocatorUtils.property(locator, "objekttitel", sourceObjekttitel), sourceObjekttitel));
                copy.setObjekttitel(copyObjekttitel);
            } else {
                copy.objekttitel = null;
            }
            if (this.dreizeiler!= null) {
                String sourceDreizeiler;
                sourceDreizeiler = this.getDreizeiler();
                String copyDreizeiler = ((String) strategy.copy(LocatorUtils.property(locator, "dreizeiler", sourceDreizeiler), sourceDreizeiler));
                copy.setDreizeiler(copyDreizeiler);
            } else {
                copy.dreizeiler = null;
            }
            if (this.lage!= null) {
                String sourceLage;
                sourceLage = this.getLage();
                String copyLage = ((String) strategy.copy(LocatorUtils.property(locator, "lage", sourceLage), sourceLage));
                copy.setLage(copyLage);
            } else {
                copy.lage = null;
            }
            if (this.ausstattBeschr!= null) {
                String sourceAusstattBeschr;
                sourceAusstattBeschr = this.getAusstattBeschr();
                String copyAusstattBeschr = ((String) strategy.copy(LocatorUtils.property(locator, "ausstattBeschr", sourceAusstattBeschr), sourceAusstattBeschr));
                copy.setAusstattBeschr(copyAusstattBeschr);
            } else {
                copy.ausstattBeschr = null;
            }
            if (this.objektbeschreibung!= null) {
                String sourceObjektbeschreibung;
                sourceObjektbeschreibung = this.getObjektbeschreibung();
                String copyObjektbeschreibung = ((String) strategy.copy(LocatorUtils.property(locator, "objektbeschreibung", sourceObjektbeschreibung), sourceObjektbeschreibung));
                copy.setObjektbeschreibung(copyObjektbeschreibung);
            } else {
                copy.objektbeschreibung = null;
            }
            if (this.sonstigeAngaben!= null) {
                String sourceSonstigeAngaben;
                sourceSonstigeAngaben = this.getSonstigeAngaben();
                String copySonstigeAngaben = ((String) strategy.copy(LocatorUtils.property(locator, "sonstigeAngaben", sourceSonstigeAngaben), sourceSonstigeAngaben));
                copy.setSonstigeAngaben(copySonstigeAngaben);
            } else {
                copy.sonstigeAngaben = null;
            }
            if (this.objektText!= null) {
                ObjektText sourceObjektText;
                sourceObjektText = this.getObjektText();
                ObjektText copyObjektText = ((ObjektText) strategy.copy(LocatorUtils.property(locator, "objektText", sourceObjektText), sourceObjektText));
                copy.setObjektText(copyObjektText);
            } else {
                copy.objektText = null;
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
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Freitexte();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objekttitel", lhsObjekttitel), LocatorUtils.property(thatLocator, "objekttitel", rhsObjekttitel), lhsObjekttitel, rhsObjekttitel)) {
                return false;
            }
        }
        {
            String lhsDreizeiler;
            lhsDreizeiler = this.getDreizeiler();
            String rhsDreizeiler;
            rhsDreizeiler = that.getDreizeiler();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dreizeiler", lhsDreizeiler), LocatorUtils.property(thatLocator, "dreizeiler", rhsDreizeiler), lhsDreizeiler, rhsDreizeiler)) {
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
            String lhsAusstattBeschr;
            lhsAusstattBeschr = this.getAusstattBeschr();
            String rhsAusstattBeschr;
            rhsAusstattBeschr = that.getAusstattBeschr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ausstattBeschr", lhsAusstattBeschr), LocatorUtils.property(thatLocator, "ausstattBeschr", rhsAusstattBeschr), lhsAusstattBeschr, rhsAusstattBeschr)) {
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
            String lhsSonstigeAngaben;
            lhsSonstigeAngaben = this.getSonstigeAngaben();
            String rhsSonstigeAngaben;
            rhsSonstigeAngaben = that.getSonstigeAngaben();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sonstigeAngaben", lhsSonstigeAngaben), LocatorUtils.property(thatLocator, "sonstigeAngaben", rhsSonstigeAngaben), lhsSonstigeAngaben, rhsSonstigeAngaben)) {
                return false;
            }
        }
        {
            ObjektText lhsObjektText;
            lhsObjektText = this.getObjektText();
            ObjektText rhsObjektText;
            rhsObjektText = that.getObjektText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektText", lhsObjektText), LocatorUtils.property(thatLocator, "objektText", rhsObjektText), lhsObjektText, rhsObjektText)) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
