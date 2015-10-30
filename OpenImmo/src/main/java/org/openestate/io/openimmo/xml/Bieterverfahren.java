
package org.openestate.io.openimmo.xml;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * Java class for &lt;bieterverfahren&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "beginnAngebotsphase",
    "besichtigungstermin",
    "besichtigungstermin2",
    "beginnBietzeit",
    "endeBietzeit",
    "hoechstgebotZeigen",
    "mindestpreis",
    "userDefinedSimplefield",
    "userDefinedAnyfield",
    "userDefinedExtend"
})
@XmlRootElement(name = "bieterverfahren")
public class Bieterverfahren
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "beginn_angebotsphase", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "date")
    protected Calendar beginnAngebotsphase;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "date")
    protected Calendar besichtigungstermin;
    @XmlElement(name = "besichtigungstermin_2", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "date")
    protected Calendar besichtigungstermin2;
    @XmlElement(name = "beginn_bietzeit", type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar beginnBietzeit;
    @XmlElement(name = "ende_bietzeit", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "date")
    protected Calendar endeBietzeit;
    @XmlElement(name = "hoechstgebot_zeigen")
    protected Boolean hoechstgebotZeigen;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal mindestpreis;
    @XmlElement(name = "user_defined_simplefield")
    protected List<UserDefinedSimplefield> userDefinedSimplefield;
    @XmlElement(name = "user_defined_anyfield")
    protected List<UserDefinedAnyfield> userDefinedAnyfield;
    @XmlElement(name = "user_defined_extend")
    protected List<UserDefinedExtend> userDefinedExtend;

    /**
     * Gets the value of the beginnAngebotsphase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getBeginnAngebotsphase() {
        return beginnAngebotsphase;
    }

    /**
     * Sets the value of the beginnAngebotsphase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginnAngebotsphase(Calendar value) {
        this.beginnAngebotsphase = value;
    }

    /**
     * Gets the value of the besichtigungstermin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getBesichtigungstermin() {
        return besichtigungstermin;
    }

    /**
     * Sets the value of the besichtigungstermin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBesichtigungstermin(Calendar value) {
        this.besichtigungstermin = value;
    }

    /**
     * Gets the value of the besichtigungstermin2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getBesichtigungstermin2() {
        return besichtigungstermin2;
    }

    /**
     * Sets the value of the besichtigungstermin2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBesichtigungstermin2(Calendar value) {
        this.besichtigungstermin2 = value;
    }

    /**
     * Gets the value of the beginnBietzeit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getBeginnBietzeit() {
        return beginnBietzeit;
    }

    /**
     * Sets the value of the beginnBietzeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginnBietzeit(Calendar value) {
        this.beginnBietzeit = value;
    }

    /**
     * Gets the value of the endeBietzeit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getEndeBietzeit() {
        return endeBietzeit;
    }

    /**
     * Sets the value of the endeBietzeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndeBietzeit(Calendar value) {
        this.endeBietzeit = value;
    }

    /**
     * Gets the value of the hoechstgebotZeigen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHoechstgebotZeigen() {
        return hoechstgebotZeigen;
    }

    /**
     * Sets the value of the hoechstgebotZeigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHoechstgebotZeigen(Boolean value) {
        this.hoechstgebotZeigen = value;
    }

    /**
     * Gets the value of the mindestpreis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getMindestpreis() {
        return mindestpreis;
    }

    /**
     * Sets the value of the mindestpreis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMindestpreis(BigDecimal value) {
        this.mindestpreis = value;
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
            Calendar theBeginnAngebotsphase;
            theBeginnAngebotsphase = this.getBeginnAngebotsphase();
            strategy.appendField(locator, this, "beginnAngebotsphase", buffer, theBeginnAngebotsphase);
        }
        {
            Calendar theBesichtigungstermin;
            theBesichtigungstermin = this.getBesichtigungstermin();
            strategy.appendField(locator, this, "besichtigungstermin", buffer, theBesichtigungstermin);
        }
        {
            Calendar theBesichtigungstermin2;
            theBesichtigungstermin2 = this.getBesichtigungstermin2();
            strategy.appendField(locator, this, "besichtigungstermin2", buffer, theBesichtigungstermin2);
        }
        {
            Calendar theBeginnBietzeit;
            theBeginnBietzeit = this.getBeginnBietzeit();
            strategy.appendField(locator, this, "beginnBietzeit", buffer, theBeginnBietzeit);
        }
        {
            Calendar theEndeBietzeit;
            theEndeBietzeit = this.getEndeBietzeit();
            strategy.appendField(locator, this, "endeBietzeit", buffer, theEndeBietzeit);
        }
        {
            Boolean theHoechstgebotZeigen;
            theHoechstgebotZeigen = this.isHoechstgebotZeigen();
            strategy.appendField(locator, this, "hoechstgebotZeigen", buffer, theHoechstgebotZeigen);
        }
        {
            BigDecimal theMindestpreis;
            theMindestpreis = this.getMindestpreis();
            strategy.appendField(locator, this, "mindestpreis", buffer, theMindestpreis);
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
        if (draftCopy instanceof Bieterverfahren) {
            final Bieterverfahren copy = ((Bieterverfahren) draftCopy);
            if (this.beginnAngebotsphase!= null) {
                Calendar sourceBeginnAngebotsphase;
                sourceBeginnAngebotsphase = this.getBeginnAngebotsphase();
                Calendar copyBeginnAngebotsphase = ((Calendar) strategy.copy(LocatorUtils.property(locator, "beginnAngebotsphase", sourceBeginnAngebotsphase), sourceBeginnAngebotsphase));
                copy.setBeginnAngebotsphase(copyBeginnAngebotsphase);
            } else {
                copy.beginnAngebotsphase = null;
            }
            if (this.besichtigungstermin!= null) {
                Calendar sourceBesichtigungstermin;
                sourceBesichtigungstermin = this.getBesichtigungstermin();
                Calendar copyBesichtigungstermin = ((Calendar) strategy.copy(LocatorUtils.property(locator, "besichtigungstermin", sourceBesichtigungstermin), sourceBesichtigungstermin));
                copy.setBesichtigungstermin(copyBesichtigungstermin);
            } else {
                copy.besichtigungstermin = null;
            }
            if (this.besichtigungstermin2 != null) {
                Calendar sourceBesichtigungstermin2;
                sourceBesichtigungstermin2 = this.getBesichtigungstermin2();
                Calendar copyBesichtigungstermin2 = ((Calendar) strategy.copy(LocatorUtils.property(locator, "besichtigungstermin2", sourceBesichtigungstermin2), sourceBesichtigungstermin2));
                copy.setBesichtigungstermin2(copyBesichtigungstermin2);
            } else {
                copy.besichtigungstermin2 = null;
            }
            if (this.beginnBietzeit!= null) {
                Calendar sourceBeginnBietzeit;
                sourceBeginnBietzeit = this.getBeginnBietzeit();
                Calendar copyBeginnBietzeit = ((Calendar) strategy.copy(LocatorUtils.property(locator, "beginnBietzeit", sourceBeginnBietzeit), sourceBeginnBietzeit));
                copy.setBeginnBietzeit(copyBeginnBietzeit);
            } else {
                copy.beginnBietzeit = null;
            }
            if (this.endeBietzeit!= null) {
                Calendar sourceEndeBietzeit;
                sourceEndeBietzeit = this.getEndeBietzeit();
                Calendar copyEndeBietzeit = ((Calendar) strategy.copy(LocatorUtils.property(locator, "endeBietzeit", sourceEndeBietzeit), sourceEndeBietzeit));
                copy.setEndeBietzeit(copyEndeBietzeit);
            } else {
                copy.endeBietzeit = null;
            }
            if (this.hoechstgebotZeigen!= null) {
                Boolean sourceHoechstgebotZeigen;
                sourceHoechstgebotZeigen = this.isHoechstgebotZeigen();
                Boolean copyHoechstgebotZeigen = ((Boolean) strategy.copy(LocatorUtils.property(locator, "hoechstgebotZeigen", sourceHoechstgebotZeigen), sourceHoechstgebotZeigen));
                copy.setHoechstgebotZeigen(copyHoechstgebotZeigen);
            } else {
                copy.hoechstgebotZeigen = null;
            }
            if (this.mindestpreis!= null) {
                BigDecimal sourceMindestpreis;
                sourceMindestpreis = this.getMindestpreis();
                BigDecimal copyMindestpreis = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "mindestpreis", sourceMindestpreis), sourceMindestpreis));
                copy.setMindestpreis(copyMindestpreis);
            } else {
                copy.mindestpreis = null;
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
        return new Bieterverfahren();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Bieterverfahren)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Bieterverfahren that = ((Bieterverfahren) object);
        {
            Calendar lhsBeginnAngebotsphase;
            lhsBeginnAngebotsphase = this.getBeginnAngebotsphase();
            Calendar rhsBeginnAngebotsphase;
            rhsBeginnAngebotsphase = that.getBeginnAngebotsphase();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beginnAngebotsphase", lhsBeginnAngebotsphase), LocatorUtils.property(thatLocator, "beginnAngebotsphase", rhsBeginnAngebotsphase), lhsBeginnAngebotsphase, rhsBeginnAngebotsphase)) {
                return false;
            }
        }
        {
            Calendar lhsBesichtigungstermin;
            lhsBesichtigungstermin = this.getBesichtigungstermin();
            Calendar rhsBesichtigungstermin;
            rhsBesichtigungstermin = that.getBesichtigungstermin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "besichtigungstermin", lhsBesichtigungstermin), LocatorUtils.property(thatLocator, "besichtigungstermin", rhsBesichtigungstermin), lhsBesichtigungstermin, rhsBesichtigungstermin)) {
                return false;
            }
        }
        {
            Calendar lhsBesichtigungstermin2;
            lhsBesichtigungstermin2 = this.getBesichtigungstermin2();
            Calendar rhsBesichtigungstermin2;
            rhsBesichtigungstermin2 = that.getBesichtigungstermin2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "besichtigungstermin2", lhsBesichtigungstermin2), LocatorUtils.property(thatLocator, "besichtigungstermin2", rhsBesichtigungstermin2), lhsBesichtigungstermin2, rhsBesichtigungstermin2)) {
                return false;
            }
        }
        {
            Calendar lhsBeginnBietzeit;
            lhsBeginnBietzeit = this.getBeginnBietzeit();
            Calendar rhsBeginnBietzeit;
            rhsBeginnBietzeit = that.getBeginnBietzeit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beginnBietzeit", lhsBeginnBietzeit), LocatorUtils.property(thatLocator, "beginnBietzeit", rhsBeginnBietzeit), lhsBeginnBietzeit, rhsBeginnBietzeit)) {
                return false;
            }
        }
        {
            Calendar lhsEndeBietzeit;
            lhsEndeBietzeit = this.getEndeBietzeit();
            Calendar rhsEndeBietzeit;
            rhsEndeBietzeit = that.getEndeBietzeit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endeBietzeit", lhsEndeBietzeit), LocatorUtils.property(thatLocator, "endeBietzeit", rhsEndeBietzeit), lhsEndeBietzeit, rhsEndeBietzeit)) {
                return false;
            }
        }
        {
            Boolean lhsHoechstgebotZeigen;
            lhsHoechstgebotZeigen = this.isHoechstgebotZeigen();
            Boolean rhsHoechstgebotZeigen;
            rhsHoechstgebotZeigen = that.isHoechstgebotZeigen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hoechstgebotZeigen", lhsHoechstgebotZeigen), LocatorUtils.property(thatLocator, "hoechstgebotZeigen", rhsHoechstgebotZeigen), lhsHoechstgebotZeigen, rhsHoechstgebotZeigen)) {
                return false;
            }
        }
        {
            BigDecimal lhsMindestpreis;
            lhsMindestpreis = this.getMindestpreis();
            BigDecimal rhsMindestpreis;
            rhsMindestpreis = that.getMindestpreis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mindestpreis", lhsMindestpreis), LocatorUtils.property(thatLocator, "mindestpreis", rhsMindestpreis), lhsMindestpreis, rhsMindestpreis)) {
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
