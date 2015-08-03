
package org.openestate.io.kyero.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
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
public class EnergyRatingType
    implements Cloneable, CopyTo, Equals, ToString
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
            EnergyRatingMarkType theConsumption;
            theConsumption = this.getConsumption();
            strategy.appendField(locator, this, "consumption", buffer, theConsumption);
        }
        {
            EnergyRatingMarkType theEmissions;
            theEmissions = this.getEmissions();
            strategy.appendField(locator, this, "emissions", buffer, theEmissions);
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
        if (draftCopy instanceof EnergyRatingType) {
            final EnergyRatingType copy = ((EnergyRatingType) draftCopy);
            if (this.consumption!= null) {
                EnergyRatingMarkType sourceConsumption;
                sourceConsumption = this.getConsumption();
                EnergyRatingMarkType copyConsumption = ((EnergyRatingMarkType) strategy.copy(LocatorUtils.property(locator, "consumption", sourceConsumption), sourceConsumption));
                copy.setConsumption(copyConsumption);
            } else {
                copy.consumption = null;
            }
            if (this.emissions!= null) {
                EnergyRatingMarkType sourceEmissions;
                sourceEmissions = this.getEmissions();
                EnergyRatingMarkType copyEmissions = ((EnergyRatingMarkType) strategy.copy(LocatorUtils.property(locator, "emissions", sourceEmissions), sourceEmissions));
                copy.setEmissions(copyEmissions);
            } else {
                copy.emissions = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new EnergyRatingType();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EnergyRatingType)) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumption", lhsConsumption), LocatorUtils.property(thatLocator, "consumption", rhsConsumption), lhsConsumption, rhsConsumption)) {
                return false;
            }
        }
        {
            EnergyRatingMarkType lhsEmissions;
            lhsEmissions = this.getEmissions();
            EnergyRatingMarkType rhsEmissions;
            rhsEmissions = that.getEmissions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emissions", lhsEmissions), LocatorUtils.property(thatLocator, "emissions", rhsEmissions), lhsEmissions, rhsEmissions)) {
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
