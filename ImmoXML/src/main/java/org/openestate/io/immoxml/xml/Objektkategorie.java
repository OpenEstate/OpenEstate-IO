
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
    "userDefinedAnyfield"
})
@XmlRootElement(name = "objektkategorie")
public class Objektkategorie
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    protected Nutzungsart nutzungsart;
    @XmlElement(required = true)
    protected Vermarktungsart vermarktungsart;
    @XmlElement(required = true)
    protected Objektart objektart;
    @XmlElement(name = "user_defined_simplefield")
    protected List<UserDefinedSimplefield> userDefinedSimplefield;
    @XmlElement(name = "user_defined_anyfield")
    protected List<UserDefinedAnyfield> userDefinedAnyfield;

    /**
     * Gets the value of the nutzungsart property.
     * 
     * @return
     *     possible object is
     *     {@link Nutzungsart }
     *     
     */
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
            Nutzungsart theNutzungsart;
            theNutzungsart = this.getNutzungsart();
            strategy.appendField(locator, this, "nutzungsart", buffer, theNutzungsart);
        }
        {
            Vermarktungsart theVermarktungsart;
            theVermarktungsart = this.getVermarktungsart();
            strategy.appendField(locator, this, "vermarktungsart", buffer, theVermarktungsart);
        }
        {
            Objektart theObjektart;
            theObjektart = this.getObjektart();
            strategy.appendField(locator, this, "objektart", buffer, theObjektart);
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
        if (draftCopy instanceof Objektkategorie) {
            final Objektkategorie copy = ((Objektkategorie) draftCopy);
            if (this.nutzungsart!= null) {
                Nutzungsart sourceNutzungsart;
                sourceNutzungsart = this.getNutzungsart();
                Nutzungsart copyNutzungsart = ((Nutzungsart) strategy.copy(LocatorUtils.property(locator, "nutzungsart", sourceNutzungsart), sourceNutzungsart));
                copy.setNutzungsart(copyNutzungsart);
            } else {
                copy.nutzungsart = null;
            }
            if (this.vermarktungsart!= null) {
                Vermarktungsart sourceVermarktungsart;
                sourceVermarktungsart = this.getVermarktungsart();
                Vermarktungsart copyVermarktungsart = ((Vermarktungsart) strategy.copy(LocatorUtils.property(locator, "vermarktungsart", sourceVermarktungsart), sourceVermarktungsart));
                copy.setVermarktungsart(copyVermarktungsart);
            } else {
                copy.vermarktungsart = null;
            }
            if (this.objektart!= null) {
                Objektart sourceObjektart;
                sourceObjektart = this.getObjektart();
                Objektart copyObjektart = ((Objektart) strategy.copy(LocatorUtils.property(locator, "objektart", sourceObjektart), sourceObjektart));
                copy.setObjektart(copyObjektart);
            } else {
                copy.objektart = null;
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
        return new Objektkategorie();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nutzungsart", lhsNutzungsart), LocatorUtils.property(thatLocator, "nutzungsart", rhsNutzungsart), lhsNutzungsart, rhsNutzungsart)) {
                return false;
            }
        }
        {
            Vermarktungsart lhsVermarktungsart;
            lhsVermarktungsart = this.getVermarktungsart();
            Vermarktungsart rhsVermarktungsart;
            rhsVermarktungsart = that.getVermarktungsart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vermarktungsart", lhsVermarktungsart), LocatorUtils.property(thatLocator, "vermarktungsart", rhsVermarktungsart), lhsVermarktungsart, rhsVermarktungsart)) {
                return false;
            }
        }
        {
            Objektart lhsObjektart;
            lhsObjektart = this.getObjektart();
            Objektart rhsObjektart;
            rhsObjektart = that.getObjektart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektart", lhsObjektart), LocatorUtils.property(thatLocator, "objektart", rhsObjektart), lhsObjektart, rhsObjektart)) {
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
