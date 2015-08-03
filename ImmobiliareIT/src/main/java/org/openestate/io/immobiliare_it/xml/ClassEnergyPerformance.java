
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
import org.openestate.io.immobiliare_it.xml.types.EnergyUnit;


/**
 * <p>Java class for classEnergyPerformance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="classEnergyPerformance"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="certified"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;pattern value="yes|no"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="unit" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;pattern value="kWh/m2anno|kWh/m3anno"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "classEnergyPerformance", propOrder = {
    "value"
})
public class ClassEnergyPerformance
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlValue
    protected String value;
    @XmlAttribute(name = "certified")
    @XmlJavaTypeAdapter(Adapter12 .class)
    protected Boolean certified;
    @XmlAttribute(name = "unit", required = true)
    @XmlJavaTypeAdapter(Adapter13 .class)
    protected EnergyUnit unit;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
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
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the certified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Boolean isCertified() {
        return certified;
    }

    /**
     * Sets the value of the certified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertified(Boolean value) {
        this.certified = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public EnergyUnit getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(EnergyUnit value) {
        this.unit = value;
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
            String theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        {
            Boolean theCertified;
            theCertified = this.isCertified();
            strategy.appendField(locator, this, "certified", buffer, theCertified);
        }
        {
            EnergyUnit theUnit;
            theUnit = this.getUnit();
            strategy.appendField(locator, this, "unit", buffer, theUnit);
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
        if (draftCopy instanceof ClassEnergyPerformance) {
            final ClassEnergyPerformance copy = ((ClassEnergyPerformance) draftCopy);
            if (this.value!= null) {
                String sourceValue;
                sourceValue = this.getValue();
                String copyValue = ((String) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.setValue(copyValue);
            } else {
                copy.value = null;
            }
            if (this.certified!= null) {
                Boolean sourceCertified;
                sourceCertified = this.isCertified();
                Boolean copyCertified = ((Boolean) strategy.copy(LocatorUtils.property(locator, "certified", sourceCertified), sourceCertified));
                copy.setCertified(copyCertified);
            } else {
                copy.certified = null;
            }
            if (this.unit!= null) {
                EnergyUnit sourceUnit;
                sourceUnit = this.getUnit();
                EnergyUnit copyUnit = ((EnergyUnit) strategy.copy(LocatorUtils.property(locator, "unit", sourceUnit), sourceUnit));
                copy.setUnit(copyUnit);
            } else {
                copy.unit = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ClassEnergyPerformance();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ClassEnergyPerformance)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ClassEnergyPerformance that = ((ClassEnergyPerformance) object);
        {
            String lhsValue;
            lhsValue = this.getValue();
            String rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
                return false;
            }
        }
        {
            Boolean lhsCertified;
            lhsCertified = this.isCertified();
            Boolean rhsCertified;
            rhsCertified = that.isCertified();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "certified", lhsCertified), LocatorUtils.property(thatLocator, "certified", rhsCertified), lhsCertified, rhsCertified)) {
                return false;
            }
        }
        {
            EnergyUnit lhsUnit;
            lhsUnit = this.getUnit();
            EnergyUnit rhsUnit;
            rhsUnit = that.getUnit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unit", lhsUnit), LocatorUtils.property(thatLocator, "unit", rhsUnit), lhsUnit, rhsUnit)) {
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
