
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
 * Java class for &lt;gesamtbelastungnetto&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "gesamtbelastungnetto")
public class Gesamtbelastungnetto
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlValue
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "decimal")
    protected Double value;
    @XmlAttribute(name = "gesamtbelastungust")
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "decimal")
    protected Double gesamtbelastungust;

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
     * Gets the value of the gesamtbelastungust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getGesamtbelastungust() {
        return gesamtbelastungust;
    }

    /**
     * Sets the value of the gesamtbelastungust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGesamtbelastungust(Double value) {
        this.gesamtbelastungust = value;
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
            Double theGesamtbelastungust;
            theGesamtbelastungust = this.getGesamtbelastungust();
            strategy.appendField(locator, this, "gesamtbelastungust", buffer, theGesamtbelastungust);
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
        if (draftCopy instanceof Gesamtbelastungnetto) {
            final Gesamtbelastungnetto copy = ((Gesamtbelastungnetto) draftCopy);
            if (this.value!= null) {
                Double sourceValue;
                sourceValue = this.getValue();
                Double copyValue = ((Double) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.setValue(copyValue);
            } else {
                copy.value = null;
            }
            if (this.gesamtbelastungust!= null) {
                Double sourceGesamtbelastungust;
                sourceGesamtbelastungust = this.getGesamtbelastungust();
                Double copyGesamtbelastungust = ((Double) strategy.copy(LocatorUtils.property(locator, "gesamtbelastungust", sourceGesamtbelastungust), sourceGesamtbelastungust));
                copy.setGesamtbelastungust(copyGesamtbelastungust);
            } else {
                copy.gesamtbelastungust = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Gesamtbelastungnetto();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Gesamtbelastungnetto)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Gesamtbelastungnetto that = ((Gesamtbelastungnetto) object);
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
            Double lhsGesamtbelastungust;
            lhsGesamtbelastungust = this.getGesamtbelastungust();
            Double rhsGesamtbelastungust;
            rhsGesamtbelastungust = that.getGesamtbelastungust();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gesamtbelastungust", lhsGesamtbelastungust), LocatorUtils.property(thatLocator, "gesamtbelastungust", rhsGesamtbelastungust), lhsGesamtbelastungust, rhsGesamtbelastungust)) {
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
