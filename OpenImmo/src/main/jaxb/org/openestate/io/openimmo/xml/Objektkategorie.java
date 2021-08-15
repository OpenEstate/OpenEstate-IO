
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
 * Java class for &lt;objektkategorie&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nutzungsart",
    "vermarktungsart",
    "objektart",
    "userDefinedSimplefield",
    "userDefinedAnyfield",
    "userDefinedExtend"
})
@XmlRootElement(name = "objektkategorie")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
public class Objektkategorie implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Nutzungsart nutzungsart;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Vermarktungsart vermarktungsart;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Objektart objektart;
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
     * Gets the value of the nutzungsart property.
     * 
     * @return
     *     possible object is
     *     {@link Nutzungsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Nutzungsart getNutzungsart() {
        return nutzungsart;
    }

    /**
     * Sets the value of the nutzungsart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Nutzungsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setNutzungsart(Nutzungsart value) {
        this.nutzungsart = value;
    }

    /**
     * Gets the value of the vermarktungsart property.
     * 
     * @return
     *     possible object is
     *     {@link Vermarktungsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Vermarktungsart getVermarktungsart() {
        return vermarktungsart;
    }

    /**
     * Sets the value of the vermarktungsart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vermarktungsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setVermarktungsart(Vermarktungsart value) {
        this.vermarktungsart = value;
    }

    /**
     * Gets the value of the objektart property.
     * 
     * @return
     *     possible object is
     *     {@link Objektart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Objektart getObjektart() {
        return objektart;
    }

    /**
     * Sets the value of the objektart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Objektart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setObjektart(Objektart value) {
        this.objektart = value;
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
            Nutzungsart theNutzungsart;
            theNutzungsart = this.getNutzungsart();
            strategy.appendField(locator, this, "nutzungsart", buffer, theNutzungsart, (this.nutzungsart!= null));
        }
        {
            Vermarktungsart theVermarktungsart;
            theVermarktungsart = this.getVermarktungsart();
            strategy.appendField(locator, this, "vermarktungsart", buffer, theVermarktungsart, (this.vermarktungsart!= null));
        }
        {
            Objektart theObjektart;
            theObjektart = this.getObjektart();
            strategy.appendField(locator, this, "objektart", buffer, theObjektart, (this.objektart!= null));
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
        if (draftCopy instanceof Objektkategorie) {
            final Objektkategorie copy = ((Objektkategorie) draftCopy);
            {
                Boolean nutzungsartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nutzungsart!= null));
                if (nutzungsartShouldBeCopiedAndSet == Boolean.TRUE) {
                    Nutzungsart sourceNutzungsart;
                    sourceNutzungsart = this.getNutzungsart();
                    Nutzungsart copyNutzungsart = ((Nutzungsart) strategy.copy(LocatorUtils.property(locator, "nutzungsart", sourceNutzungsart), sourceNutzungsart, (this.nutzungsart!= null)));
                    copy.setNutzungsart(copyNutzungsart);
                } else {
                    if (nutzungsartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nutzungsart = null;
                    }
                }
            }
            {
                Boolean vermarktungsartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vermarktungsart!= null));
                if (vermarktungsartShouldBeCopiedAndSet == Boolean.TRUE) {
                    Vermarktungsart sourceVermarktungsart;
                    sourceVermarktungsart = this.getVermarktungsart();
                    Vermarktungsart copyVermarktungsart = ((Vermarktungsart) strategy.copy(LocatorUtils.property(locator, "vermarktungsart", sourceVermarktungsart), sourceVermarktungsart, (this.vermarktungsart!= null)));
                    copy.setVermarktungsart(copyVermarktungsart);
                } else {
                    if (vermarktungsartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vermarktungsart = null;
                    }
                }
            }
            {
                Boolean objektartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.objektart!= null));
                if (objektartShouldBeCopiedAndSet == Boolean.TRUE) {
                    Objektart sourceObjektart;
                    sourceObjektart = this.getObjektart();
                    Objektart copyObjektart = ((Objektart) strategy.copy(LocatorUtils.property(locator, "objektart", sourceObjektart), sourceObjektart, (this.objektart!= null)));
                    copy.setObjektart(copyObjektart);
                } else {
                    if (objektartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.objektart = null;
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
        return new Objektkategorie();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Objektkategorie that = ((Objektkategorie) object);
        {
            Nutzungsart lhsNutzungsart;
            lhsNutzungsart = this.getNutzungsart();
            Nutzungsart rhsNutzungsart;
            rhsNutzungsart = that.getNutzungsart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nutzungsart", lhsNutzungsart), LocatorUtils.property(thatLocator, "nutzungsart", rhsNutzungsart), lhsNutzungsart, rhsNutzungsart, (this.nutzungsart!= null), (that.nutzungsart!= null))) {
                return false;
            }
        }
        {
            Vermarktungsart lhsVermarktungsart;
            lhsVermarktungsart = this.getVermarktungsart();
            Vermarktungsart rhsVermarktungsart;
            rhsVermarktungsart = that.getVermarktungsart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vermarktungsart", lhsVermarktungsart), LocatorUtils.property(thatLocator, "vermarktungsart", rhsVermarktungsart), lhsVermarktungsart, rhsVermarktungsart, (this.vermarktungsart!= null), (that.vermarktungsart!= null))) {
                return false;
            }
        }
        {
            Objektart lhsObjektart;
            lhsObjektart = this.getObjektart();
            Objektart rhsObjektart;
            rhsObjektart = that.getObjektart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektart", lhsObjektart), LocatorUtils.property(thatLocator, "objektart", rhsObjektart), lhsObjektart, rhsObjektart, (this.objektart!= null), (that.objektart!= null))) {
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
