
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
 * Java class for &lt;infrastruktur&gt; element.
 * 
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
    "userDefinedAnyfield"
})
@XmlRootElement(name = "infrastruktur")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
public class Infrastruktur implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean zulieferung;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Ausblick ausblick;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected List<Distanzen> distanzen;
    @XmlElement(name = "distanzen_sport")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected List<DistanzenSport> distanzenSport;
    @XmlElement(name = "user_defined_simplefield")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected List<UserDefinedSimplefield> userDefinedSimplefield;
    @XmlElement(name = "user_defined_anyfield")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected List<UserDefinedAnyfield> userDefinedAnyfield;

    /**
     * Gets the value of the zulieferung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getZulieferung() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
            Boolean theZulieferung;
            theZulieferung = this.getZulieferung();
            strategy.appendField(locator, this, "zulieferung", buffer, theZulieferung, (this.zulieferung!= null));
        }
        {
            Ausblick theAusblick;
            theAusblick = this.getAusblick();
            strategy.appendField(locator, this, "ausblick", buffer, theAusblick, (this.ausblick!= null));
        }
        {
            List<Distanzen> theDistanzen;
            theDistanzen = (((this.distanzen!= null)&&(!this.distanzen.isEmpty()))?this.getDistanzen():null);
            strategy.appendField(locator, this, "distanzen", buffer, theDistanzen, ((this.distanzen!= null)&&(!this.distanzen.isEmpty())));
        }
        {
            List<DistanzenSport> theDistanzenSport;
            theDistanzenSport = (((this.distanzenSport!= null)&&(!this.distanzenSport.isEmpty()))?this.getDistanzenSport():null);
            strategy.appendField(locator, this, "distanzenSport", buffer, theDistanzenSport, ((this.distanzenSport!= null)&&(!this.distanzenSport.isEmpty())));
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
        if (draftCopy instanceof Infrastruktur) {
            final Infrastruktur copy = ((Infrastruktur) draftCopy);
            {
                Boolean zulieferungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zulieferung!= null));
                if (zulieferungShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceZulieferung;
                    sourceZulieferung = this.getZulieferung();
                    Boolean copyZulieferung = ((Boolean) strategy.copy(LocatorUtils.property(locator, "zulieferung", sourceZulieferung), sourceZulieferung, (this.zulieferung!= null)));
                    copy.setZulieferung(copyZulieferung);
                } else {
                    if (zulieferungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zulieferung = null;
                    }
                }
            }
            {
                Boolean ausblickShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ausblick!= null));
                if (ausblickShouldBeCopiedAndSet == Boolean.TRUE) {
                    Ausblick sourceAusblick;
                    sourceAusblick = this.getAusblick();
                    Ausblick copyAusblick = ((Ausblick) strategy.copy(LocatorUtils.property(locator, "ausblick", sourceAusblick), sourceAusblick, (this.ausblick!= null)));
                    copy.setAusblick(copyAusblick);
                } else {
                    if (ausblickShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ausblick = null;
                    }
                }
            }
            {
                Boolean distanzenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.distanzen!= null)&&(!this.distanzen.isEmpty())));
                if (distanzenShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Distanzen> sourceDistanzen;
                    sourceDistanzen = (((this.distanzen!= null)&&(!this.distanzen.isEmpty()))?this.getDistanzen():null);
                    @SuppressWarnings("unchecked")
                    List<Distanzen> copyDistanzen = ((List<Distanzen> ) strategy.copy(LocatorUtils.property(locator, "distanzen", sourceDistanzen), sourceDistanzen, ((this.distanzen!= null)&&(!this.distanzen.isEmpty()))));
                    copy.distanzen = null;
                    if (copyDistanzen!= null) {
                        List<Distanzen> uniqueDistanzenl = copy.getDistanzen();
                        uniqueDistanzenl.addAll(copyDistanzen);
                    }
                } else {
                    if (distanzenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.distanzen = null;
                    }
                }
            }
            {
                Boolean distanzenSportShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.distanzenSport!= null)&&(!this.distanzenSport.isEmpty())));
                if (distanzenSportShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<DistanzenSport> sourceDistanzenSport;
                    sourceDistanzenSport = (((this.distanzenSport!= null)&&(!this.distanzenSport.isEmpty()))?this.getDistanzenSport():null);
                    @SuppressWarnings("unchecked")
                    List<DistanzenSport> copyDistanzenSport = ((List<DistanzenSport> ) strategy.copy(LocatorUtils.property(locator, "distanzenSport", sourceDistanzenSport), sourceDistanzenSport, ((this.distanzenSport!= null)&&(!this.distanzenSport.isEmpty()))));
                    copy.distanzenSport = null;
                    if (copyDistanzenSport!= null) {
                        List<DistanzenSport> uniqueDistanzenSportl = copy.getDistanzenSport();
                        uniqueDistanzenSportl.addAll(copyDistanzenSport);
                    }
                } else {
                    if (distanzenSportShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.distanzenSport = null;
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
        return new Infrastruktur();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Infrastruktur that = ((Infrastruktur) object);
        {
            Boolean lhsZulieferung;
            lhsZulieferung = this.getZulieferung();
            Boolean rhsZulieferung;
            rhsZulieferung = that.getZulieferung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zulieferung", lhsZulieferung), LocatorUtils.property(thatLocator, "zulieferung", rhsZulieferung), lhsZulieferung, rhsZulieferung, (this.zulieferung!= null), (that.zulieferung!= null))) {
                return false;
            }
        }
        {
            Ausblick lhsAusblick;
            lhsAusblick = this.getAusblick();
            Ausblick rhsAusblick;
            rhsAusblick = that.getAusblick();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ausblick", lhsAusblick), LocatorUtils.property(thatLocator, "ausblick", rhsAusblick), lhsAusblick, rhsAusblick, (this.ausblick!= null), (that.ausblick!= null))) {
                return false;
            }
        }
        {
            List<Distanzen> lhsDistanzen;
            lhsDistanzen = (((this.distanzen!= null)&&(!this.distanzen.isEmpty()))?this.getDistanzen():null);
            List<Distanzen> rhsDistanzen;
            rhsDistanzen = (((that.distanzen!= null)&&(!that.distanzen.isEmpty()))?that.getDistanzen():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distanzen", lhsDistanzen), LocatorUtils.property(thatLocator, "distanzen", rhsDistanzen), lhsDistanzen, rhsDistanzen, ((this.distanzen!= null)&&(!this.distanzen.isEmpty())), ((that.distanzen!= null)&&(!that.distanzen.isEmpty())))) {
                return false;
            }
        }
        {
            List<DistanzenSport> lhsDistanzenSport;
            lhsDistanzenSport = (((this.distanzenSport!= null)&&(!this.distanzenSport.isEmpty()))?this.getDistanzenSport():null);
            List<DistanzenSport> rhsDistanzenSport;
            rhsDistanzenSport = (((that.distanzenSport!= null)&&(!that.distanzenSport.isEmpty()))?that.getDistanzenSport():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distanzenSport", lhsDistanzenSport), LocatorUtils.property(thatLocator, "distanzenSport", rhsDistanzenSport), lhsDistanzenSport, rhsDistanzenSport, ((this.distanzenSport!= null)&&(!this.distanzenSport.isEmpty())), ((that.distanzenSport!= null)&&(!that.distanzenSport.isEmpty())))) {
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
