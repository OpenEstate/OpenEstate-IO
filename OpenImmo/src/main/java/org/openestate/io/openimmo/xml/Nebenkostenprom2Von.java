
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
 * Java class for &lt;nebenkostenprom2von&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "nebenkostenprom2von")
public class Nebenkostenprom2Von
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlValue
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected Double value;
    @XmlAttribute(name = "nebenkostenprom2bis")
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected Double nebenkostenprom2Bis;

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
     * Gets the value of the nebenkostenprom2Bis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getNebenkostenprom2Bis() {
        return nebenkostenprom2Bis;
    }

    /**
     * Sets the value of the nebenkostenprom2Bis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNebenkostenprom2Bis(Double value) {
        this.nebenkostenprom2Bis = value;
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
            Double theNebenkostenprom2Bis;
            theNebenkostenprom2Bis = this.getNebenkostenprom2Bis();
            strategy.appendField(locator, this, "nebenkostenprom2Bis", buffer, theNebenkostenprom2Bis);
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
        if (draftCopy instanceof Nebenkostenprom2Von) {
            final Nebenkostenprom2Von copy = ((Nebenkostenprom2Von) draftCopy);
            if (this.value!= null) {
                Double sourceValue;
                sourceValue = this.getValue();
                Double copyValue = ((Double) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.setValue(copyValue);
            } else {
                copy.value = null;
            }
            if (this.nebenkostenprom2Bis!= null) {
                Double sourceNebenkostenprom2Bis;
                sourceNebenkostenprom2Bis = this.getNebenkostenprom2Bis();
                Double copyNebenkostenprom2Bis = ((Double) strategy.copy(LocatorUtils.property(locator, "nebenkostenprom2Bis", sourceNebenkostenprom2Bis), sourceNebenkostenprom2Bis));
                copy.setNebenkostenprom2Bis(copyNebenkostenprom2Bis);
            } else {
                copy.nebenkostenprom2Bis = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Nebenkostenprom2Von();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Nebenkostenprom2Von)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Nebenkostenprom2Von that = ((Nebenkostenprom2Von) object);
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
            Double lhsNebenkostenprom2Bis;
            lhsNebenkostenprom2Bis = this.getNebenkostenprom2Bis();
            Double rhsNebenkostenprom2Bis;
            rhsNebenkostenprom2Bis = that.getNebenkostenprom2Bis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nebenkostenprom2Bis", lhsNebenkostenprom2Bis), LocatorUtils.property(thatLocator, "nebenkostenprom2Bis", rhsNebenkostenprom2Bis), lhsNebenkostenprom2Bis, rhsNebenkostenprom2Bis)) {
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
