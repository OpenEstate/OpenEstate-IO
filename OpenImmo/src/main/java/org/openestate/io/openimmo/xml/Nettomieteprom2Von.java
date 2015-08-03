
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
 * Java class for &lt;nettomieteprom2von&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "nettomieteprom2von")
public class Nettomieteprom2Von
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlValue
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected Double value;
    @XmlAttribute(name = "nettomieteprom2bis")
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected Double nettomieteprom2Bis;

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
     * Gets the value of the nettomieteprom2Bis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getNettomieteprom2Bis() {
        return nettomieteprom2Bis;
    }

    /**
     * Sets the value of the nettomieteprom2Bis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNettomieteprom2Bis(Double value) {
        this.nettomieteprom2Bis = value;
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
            Double theNettomieteprom2Bis;
            theNettomieteprom2Bis = this.getNettomieteprom2Bis();
            strategy.appendField(locator, this, "nettomieteprom2Bis", buffer, theNettomieteprom2Bis);
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
        if (draftCopy instanceof Nettomieteprom2Von) {
            final Nettomieteprom2Von copy = ((Nettomieteprom2Von) draftCopy);
            if (this.value!= null) {
                Double sourceValue;
                sourceValue = this.getValue();
                Double copyValue = ((Double) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.setValue(copyValue);
            } else {
                copy.value = null;
            }
            if (this.nettomieteprom2Bis!= null) {
                Double sourceNettomieteprom2Bis;
                sourceNettomieteprom2Bis = this.getNettomieteprom2Bis();
                Double copyNettomieteprom2Bis = ((Double) strategy.copy(LocatorUtils.property(locator, "nettomieteprom2Bis", sourceNettomieteprom2Bis), sourceNettomieteprom2Bis));
                copy.setNettomieteprom2Bis(copyNettomieteprom2Bis);
            } else {
                copy.nettomieteprom2Bis = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Nettomieteprom2Von();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Nettomieteprom2Von)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Nettomieteprom2Von that = ((Nettomieteprom2Von) object);
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
            Double lhsNettomieteprom2Bis;
            lhsNettomieteprom2Bis = this.getNettomieteprom2Bis();
            Double rhsNettomieteprom2Bis;
            rhsNettomieteprom2Bis = that.getNettomieteprom2Bis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nettomieteprom2Bis", lhsNettomieteprom2Bis), LocatorUtils.property(thatLocator, "nettomieteprom2Bis", rhsNettomieteprom2Bis), lhsNettomieteprom2Bis, rhsNettomieteprom2Bis)) {
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
