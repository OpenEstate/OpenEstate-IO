
package org.openestate.io.openimmo.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 * Java class for &lt;betriebskostennetto&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "betriebskostennetto")
public class Betriebskostennetto
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlValue
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected Double value;
    @XmlAttribute(name = "betriebskostenust")
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected Double betriebskostenust;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * Gets the value of the betriebskostenust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getBetriebskostenust() {
        return betriebskostenust;
    }

    /**
     * Sets the value of the betriebskostenust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBetriebskostenust(Double value) {
        this.betriebskostenust = value;
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
            Double theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        {
            Double theBetriebskostenust;
            theBetriebskostenust = this.getBetriebskostenust();
            strategy.appendField(locator, this, "betriebskostenust", buffer, theBetriebskostenust);
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
        if (draftCopy instanceof Betriebskostennetto) {
            final Betriebskostennetto copy = ((Betriebskostennetto) draftCopy);
            if (this.value!= null) {
                Double sourceValue;
                sourceValue = this.getValue();
                Double copyValue = ((Double) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.setValue(copyValue);
            } else {
                copy.value = null;
            }
            if (this.betriebskostenust!= null) {
                Double sourceBetriebskostenust;
                sourceBetriebskostenust = this.getBetriebskostenust();
                Double copyBetriebskostenust = ((Double) strategy.copy(LocatorUtils.property(locator, "betriebskostenust", sourceBetriebskostenust), sourceBetriebskostenust));
                copy.setBetriebskostenust(copyBetriebskostenust);
            } else {
                copy.betriebskostenust = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Betriebskostennetto();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Betriebskostennetto)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Betriebskostennetto that = ((Betriebskostennetto) object);
        {
            Double lhsValue;
            lhsValue = this.getValue();
            Double rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
                return false;
            }
        }
        {
            Double lhsBetriebskostenust;
            lhsBetriebskostenust = this.getBetriebskostenust();
            Double rhsBetriebskostenust;
            rhsBetriebskostenust = that.getBetriebskostenust();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "betriebskostenust", lhsBetriebskostenust), LocatorUtils.property(thatLocator, "betriebskostenust", rhsBetriebskostenust), lhsBetriebskostenust, rhsBetriebskostenust)) {
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
