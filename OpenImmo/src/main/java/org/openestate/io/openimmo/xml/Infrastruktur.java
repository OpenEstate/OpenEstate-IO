
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}zulieferung" minOccurs="0"/>
 *         &lt;element ref="{}ausblick" minOccurs="0"/>
 *         &lt;element ref="{}distanzen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}distanzen_sport" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}user_defined_simplefield" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}user_defined_anyfield" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}user_defined_extend" maxOccurs="unbounded" minOccurs="0"/>
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
    "zulieferung",
    "ausblick",
    "distanzen",
    "distanzenSport",
    "userDefinedSimplefield",
    "userDefinedAnyfield",
    "userDefinedExtend"
})
@XmlRootElement(name = "infrastruktur")
public class Infrastruktur
    implements Cloneable, CopyTo, Equals, ToString
{

    protected Boolean zulieferung;
    protected Ausblick ausblick;
    protected List<Distanzen> distanzen;
    @XmlElement(name = "distanzen_sport")
    protected List<DistanzenSport> distanzenSport;
    @XmlElement(name = "user_defined_simplefield")
    protected List<UserDefinedSimplefield> userDefinedSimplefield;
    @XmlElement(name = "user_defined_anyfield")
    protected List<UserDefinedAnyfield> userDefinedAnyfield;
    @XmlElement(name = "user_defined_extend")
    protected List<UserDefinedExtend> userDefinedExtend;

    /**
     * Gets the value of the zulieferung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZulieferung() {
        return zulieferung;
    }

    /**
     * Sets the value of the zulieferung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZulieferung(Boolean value) {
        this.zulieferung = value;
    }

    /**
     * Gets the value of the ausblick property.
     * 
     * @return
     *     possible object is
     *     {@link Ausblick }
     *     
     */
    public Ausblick getAusblick() {
        return ausblick;
    }

    /**
     * Sets the value of the ausblick property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ausblick }
     *     
     */
    public void setAusblick(Ausblick value) {
        this.ausblick = value;
    }

    /**
     * Gets the value of the distanzen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distanzen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistanzen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Distanzen }
     * 
     * 
     */
    public List<Distanzen> getDistanzen() {
        if (distanzen == null) {
            distanzen = new ArrayList<Distanzen>();
        }
        return this.distanzen;
    }

    /**
     * Gets the value of the distanzenSport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distanzenSport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistanzenSport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistanzenSport }
     * 
     * 
     */
    public List<DistanzenSport> getDistanzenSport() {
        if (distanzenSport == null) {
            distanzenSport = new ArrayList<DistanzenSport>();
        }
        return this.distanzenSport;
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
            Boolean theZulieferung;
            theZulieferung = this.isZulieferung();
            strategy.appendField(locator, this, "zulieferung", buffer, theZulieferung);
        }
        {
            Ausblick theAusblick;
            theAusblick = this.getAusblick();
            strategy.appendField(locator, this, "ausblick", buffer, theAusblick);
        }
        {
            List<Distanzen> theDistanzen;
            theDistanzen = (((this.distanzen!= null)&&(!this.distanzen.isEmpty()))?this.getDistanzen():null);
            strategy.appendField(locator, this, "distanzen", buffer, theDistanzen);
        }
        {
            List<DistanzenSport> theDistanzenSport;
            theDistanzenSport = (((this.distanzenSport!= null)&&(!this.distanzenSport.isEmpty()))?this.getDistanzenSport():null);
            strategy.appendField(locator, this, "distanzenSport", buffer, theDistanzenSport);
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
        if (draftCopy instanceof Infrastruktur) {
            final Infrastruktur copy = ((Infrastruktur) draftCopy);
            if (this.zulieferung!= null) {
                Boolean sourceZulieferung;
                sourceZulieferung = this.isZulieferung();
                Boolean copyZulieferung = ((Boolean) strategy.copy(LocatorUtils.property(locator, "zulieferung", sourceZulieferung), sourceZulieferung));
                copy.setZulieferung(copyZulieferung);
            } else {
                copy.zulieferung = null;
            }
            if (this.ausblick!= null) {
                Ausblick sourceAusblick;
                sourceAusblick = this.getAusblick();
                Ausblick copyAusblick = ((Ausblick) strategy.copy(LocatorUtils.property(locator, "ausblick", sourceAusblick), sourceAusblick));
                copy.setAusblick(copyAusblick);
            } else {
                copy.ausblick = null;
            }
            if ((this.distanzen!= null)&&(!this.distanzen.isEmpty())) {
                List<Distanzen> sourceDistanzen;
                sourceDistanzen = (((this.distanzen!= null)&&(!this.distanzen.isEmpty()))?this.getDistanzen():null);
                @SuppressWarnings("unchecked")
                List<Distanzen> copyDistanzen = ((List<Distanzen> ) strategy.copy(LocatorUtils.property(locator, "distanzen", sourceDistanzen), sourceDistanzen));
                copy.distanzen = null;
                if (copyDistanzen!= null) {
                    List<Distanzen> uniqueDistanzenl = copy.getDistanzen();
                    uniqueDistanzenl.addAll(copyDistanzen);
                }
            } else {
                copy.distanzen = null;
            }
            if ((this.distanzenSport!= null)&&(!this.distanzenSport.isEmpty())) {
                List<DistanzenSport> sourceDistanzenSport;
                sourceDistanzenSport = (((this.distanzenSport!= null)&&(!this.distanzenSport.isEmpty()))?this.getDistanzenSport():null);
                @SuppressWarnings("unchecked")
                List<DistanzenSport> copyDistanzenSport = ((List<DistanzenSport> ) strategy.copy(LocatorUtils.property(locator, "distanzenSport", sourceDistanzenSport), sourceDistanzenSport));
                copy.distanzenSport = null;
                if (copyDistanzenSport!= null) {
                    List<DistanzenSport> uniqueDistanzenSportl = copy.getDistanzenSport();
                    uniqueDistanzenSportl.addAll(copyDistanzenSport);
                }
            } else {
                copy.distanzenSport = null;
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
        return new Infrastruktur();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Infrastruktur)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Infrastruktur that = ((Infrastruktur) object);
        {
            Boolean lhsZulieferung;
            lhsZulieferung = this.isZulieferung();
            Boolean rhsZulieferung;
            rhsZulieferung = that.isZulieferung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zulieferung", lhsZulieferung), LocatorUtils.property(thatLocator, "zulieferung", rhsZulieferung), lhsZulieferung, rhsZulieferung)) {
                return false;
            }
        }
        {
            Ausblick lhsAusblick;
            lhsAusblick = this.getAusblick();
            Ausblick rhsAusblick;
            rhsAusblick = that.getAusblick();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ausblick", lhsAusblick), LocatorUtils.property(thatLocator, "ausblick", rhsAusblick), lhsAusblick, rhsAusblick)) {
                return false;
            }
        }
        {
            List<Distanzen> lhsDistanzen;
            lhsDistanzen = (((this.distanzen!= null)&&(!this.distanzen.isEmpty()))?this.getDistanzen():null);
            List<Distanzen> rhsDistanzen;
            rhsDistanzen = (((that.distanzen!= null)&&(!that.distanzen.isEmpty()))?that.getDistanzen():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distanzen", lhsDistanzen), LocatorUtils.property(thatLocator, "distanzen", rhsDistanzen), lhsDistanzen, rhsDistanzen)) {
                return false;
            }
        }
        {
            List<DistanzenSport> lhsDistanzenSport;
            lhsDistanzenSport = (((this.distanzenSport!= null)&&(!this.distanzenSport.isEmpty()))?this.getDistanzenSport():null);
            List<DistanzenSport> rhsDistanzenSport;
            rhsDistanzenSport = (((that.distanzenSport!= null)&&(!that.distanzenSport.isEmpty()))?that.getDistanzenSport():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distanzenSport", lhsDistanzenSport), LocatorUtils.property(thatLocator, "distanzenSport", rhsDistanzenSport), lhsDistanzenSport, rhsDistanzenSport)) {
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
