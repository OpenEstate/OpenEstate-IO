
package org.openestate.io.kyero.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for energyRatingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="energyRatingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="consumption" type="{}energyRatingMarkType" minOccurs="0"/&gt;
 *         &lt;element name="emissions" type="{}energyRatingMarkType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "energyRatingType", propOrder = {

})
public class EnergyRatingType implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlSchemaType(name = "string")
    protected EnergyRatingMarkType consumption;
    @XmlSchemaType(name = "string")
    protected EnergyRatingMarkType emissions;

    /**
     * Gets the value of the consumption property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyRatingMarkType }
     *     
     */
    public EnergyRatingMarkType getConsumption() {
        return consumption;
    }

    /**
     * Sets the value of the consumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyRatingMarkType }
     *     
     */
    public void setConsumption(EnergyRatingMarkType value) {
        this.consumption = value;
    }

    /**
     * Gets the value of the emissions property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyRatingMarkType }
     *     
     */
    public EnergyRatingMarkType getEmissions() {
        return emissions;
    }

    /**
     * Sets the value of the emissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyRatingMarkType }
     *     
     */
    public void setEmissions(EnergyRatingMarkType value) {
        this.emissions = value;
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            EnergyRatingMarkType theConsumption;
            theConsumption = this.getConsumption();
            strategy.appendField(locator, this, "consumption", buffer, theConsumption, (this.consumption!= null));
        }
        {
            EnergyRatingMarkType theEmissions;
            theEmissions = this.getEmissions();
            strategy.appendField(locator, this, "emissions", buffer, theEmissions, (this.emissions!= null));
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof EnergyRatingType) {
            final EnergyRatingType copy = ((EnergyRatingType) draftCopy);
            {
                Boolean consumptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.consumption!= null));
                if (consumptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    EnergyRatingMarkType sourceConsumption;
                    sourceConsumption = this.getConsumption();
                    EnergyRatingMarkType copyConsumption = ((EnergyRatingMarkType) strategy.copy(LocatorUtils.property(locator, "consumption", sourceConsumption), sourceConsumption, (this.consumption!= null)));
                    copy.setConsumption(copyConsumption);
                } else {
                    if (consumptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.consumption = null;
                    }
                }
            }
            {
                Boolean emissionsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.emissions!= null));
                if (emissionsShouldBeCopiedAndSet == Boolean.TRUE) {
                    EnergyRatingMarkType sourceEmissions;
                    sourceEmissions = this.getEmissions();
                    EnergyRatingMarkType copyEmissions = ((EnergyRatingMarkType) strategy.copy(LocatorUtils.property(locator, "emissions", sourceEmissions), sourceEmissions, (this.emissions!= null)));
                    copy.setEmissions(copyEmissions);
                } else {
                    if (emissionsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.emissions = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new EnergyRatingType();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EnergyRatingType that = ((EnergyRatingType) object);
        {
            EnergyRatingMarkType lhsConsumption;
            lhsConsumption = this.getConsumption();
            EnergyRatingMarkType rhsConsumption;
            rhsConsumption = that.getConsumption();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumption", lhsConsumption), LocatorUtils.property(thatLocator, "consumption", rhsConsumption), lhsConsumption, rhsConsumption, (this.consumption!= null), (that.consumption!= null))) {
                return false;
            }
        }
        {
            EnergyRatingMarkType lhsEmissions;
            lhsEmissions = this.getEmissions();
            EnergyRatingMarkType rhsEmissions;
            rhsEmissions = that.getEmissions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emissions", lhsEmissions), LocatorUtils.property(thatLocator, "emissions", rhsEmissions), lhsEmissions, rhsEmissions, (this.emissions!= null), (that.emissions!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
