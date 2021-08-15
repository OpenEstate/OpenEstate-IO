
package org.openestate.io.immobiliare_it.xml;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for ambience complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ambience"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="heating" type="{http://feed.immobiliare.it}heating" minOccurs="0"/&gt;
 *         &lt;element name="air-conditioning" type="{http://feed.immobiliare.it}air-conditioning" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ambience", propOrder = {

})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
public class Ambience implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Heating heating;
    @XmlElement(name = "air-conditioning")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected AirConditioning airConditioning;

    /**
     * Gets the value of the heating property.
     * 
     * @return
     *     possible object is
     *     {@link Heating }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Heating getHeating() {
        return heating;
    }

    /**
     * Sets the value of the heating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Heating }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setHeating(Heating value) {
        this.heating = value;
    }

    /**
     * Gets the value of the airConditioning property.
     * 
     * @return
     *     possible object is
     *     {@link AirConditioning }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public AirConditioning getAirConditioning() {
        return airConditioning;
    }

    /**
     * Sets the value of the airConditioning property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirConditioning }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setAirConditioning(AirConditioning value) {
        this.airConditioning = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            Heating theHeating;
            theHeating = this.getHeating();
            strategy.appendField(locator, this, "heating", buffer, theHeating, (this.heating!= null));
        }
        {
            AirConditioning theAirConditioning;
            theAirConditioning = this.getAirConditioning();
            strategy.appendField(locator, this, "airConditioning", buffer, theAirConditioning, (this.airConditioning!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Ambience) {
            final Ambience copy = ((Ambience) draftCopy);
            {
                Boolean heatingShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.heating!= null));
                if (heatingShouldBeCopiedAndSet == Boolean.TRUE) {
                    Heating sourceHeating;
                    sourceHeating = this.getHeating();
                    Heating copyHeating = ((Heating) strategy.copy(LocatorUtils.property(locator, "heating", sourceHeating), sourceHeating, (this.heating!= null)));
                    copy.setHeating(copyHeating);
                } else {
                    if (heatingShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.heating = null;
                    }
                }
            }
            {
                Boolean airConditioningShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.airConditioning!= null));
                if (airConditioningShouldBeCopiedAndSet == Boolean.TRUE) {
                    AirConditioning sourceAirConditioning;
                    sourceAirConditioning = this.getAirConditioning();
                    AirConditioning copyAirConditioning = ((AirConditioning) strategy.copy(LocatorUtils.property(locator, "airConditioning", sourceAirConditioning), sourceAirConditioning, (this.airConditioning!= null)));
                    copy.setAirConditioning(copyAirConditioning);
                } else {
                    if (airConditioningShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.airConditioning = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Ambience();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Ambience that = ((Ambience) object);
        {
            Heating lhsHeating;
            lhsHeating = this.getHeating();
            Heating rhsHeating;
            rhsHeating = that.getHeating();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heating", lhsHeating), LocatorUtils.property(thatLocator, "heating", rhsHeating), lhsHeating, rhsHeating, (this.heating!= null), (that.heating!= null))) {
                return false;
            }
        }
        {
            AirConditioning lhsAirConditioning;
            lhsAirConditioning = this.getAirConditioning();
            AirConditioning rhsAirConditioning;
            rhsAirConditioning = that.getAirConditioning();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "airConditioning", lhsAirConditioning), LocatorUtils.property(thatLocator, "airConditioning", rhsAirConditioning), lhsAirConditioning, rhsAirConditioning, (this.airConditioning!= null), (that.airConditioning!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }

}
