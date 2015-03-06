
package org.openestate.io.openimmo.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>float">
 *       &lt;attribute name="distanz_zu_sport" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="STRAND"/>
 *             &lt;enumeration value="SEE"/>
 *             &lt;enumeration value="MEER"/>
 *             &lt;enumeration value="SKIGEBIET"/>
 *             &lt;enumeration value="SPORTANLAGEN"/>
 *             &lt;enumeration value="WANDERGEBIETE"/>
 *             &lt;enumeration value="NAHERHOLUNG"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "distanzen_sport")
public class DistanzenSport
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlValue
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "float")
    protected Double value;
    @XmlAttribute(name = "distanz_zu_sport", required = true)
    protected DistanzenSport.DistanzZuSport distanzZuSport;

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
     * Gets the value of the distanzZuSport property.
     * 
     * @return
     *     possible object is
     *     {@link DistanzenSport.DistanzZuSport }
     *     
     */
    public DistanzenSport.DistanzZuSport getDistanzZuSport() {
        return distanzZuSport;
    }

    /**
     * Sets the value of the distanzZuSport property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanzenSport.DistanzZuSport }
     *     
     */
    public void setDistanzZuSport(DistanzenSport.DistanzZuSport value) {
        this.distanzZuSport = value;
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
            DistanzenSport.DistanzZuSport theDistanzZuSport;
            theDistanzZuSport = this.getDistanzZuSport();
            strategy.appendField(locator, this, "distanzZuSport", buffer, theDistanzZuSport);
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
        if (draftCopy instanceof DistanzenSport) {
            final DistanzenSport copy = ((DistanzenSport) draftCopy);
            if (this.value!= null) {
                Double sourceValue;
                sourceValue = this.getValue();
                Double copyValue = ((Double) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.setValue(copyValue);
            } else {
                copy.value = null;
            }
            if (this.distanzZuSport!= null) {
                DistanzenSport.DistanzZuSport sourceDistanzZuSport;
                sourceDistanzZuSport = this.getDistanzZuSport();
                DistanzenSport.DistanzZuSport copyDistanzZuSport = ((DistanzenSport.DistanzZuSport) strategy.copy(LocatorUtils.property(locator, "distanzZuSport", sourceDistanzZuSport), sourceDistanzZuSport));
                copy.setDistanzZuSport(copyDistanzZuSport);
            } else {
                copy.distanzZuSport = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new DistanzenSport();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DistanzenSport)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DistanzenSport that = ((DistanzenSport) object);
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
            DistanzenSport.DistanzZuSport lhsDistanzZuSport;
            lhsDistanzZuSport = this.getDistanzZuSport();
            DistanzenSport.DistanzZuSport rhsDistanzZuSport;
            rhsDistanzZuSport = that.getDistanzZuSport();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distanzZuSport", lhsDistanzZuSport), LocatorUtils.property(thatLocator, "distanzZuSport", rhsDistanzZuSport), lhsDistanzZuSport, rhsDistanzZuSport)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType>
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *     &lt;enumeration value="STRAND"/>
     *     &lt;enumeration value="SEE"/>
     *     &lt;enumeration value="MEER"/>
     *     &lt;enumeration value="SKIGEBIET"/>
     *     &lt;enumeration value="SPORTANLAGEN"/>
     *     &lt;enumeration value="WANDERGEBIETE"/>
     *     &lt;enumeration value="NAHERHOLUNG"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum DistanzZuSport {

        STRAND,
        SEE,
        MEER,
        SKIGEBIET,
        SPORTANLAGEN,
        WANDERGEBIETE,
        NAHERHOLUNG;

        public String value() {
            return name();
        }

        public static DistanzenSport.DistanzZuSport fromValue(String v) {
            return valueOf(v);
        }

    }

}
