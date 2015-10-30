
package org.openestate.io.immoxml.xml;

import java.math.BigDecimal;
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
 * Java class for &lt;distanzen_sport&gt; element.
 *
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
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "float")
    protected BigDecimal value;
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
    public BigDecimal getValue() {
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
    public void setValue(BigDecimal value) {
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
            BigDecimal theValue;
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
                BigDecimal sourceValue;
                sourceValue = this.getValue();
                BigDecimal copyValue = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
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
            BigDecimal lhsValue;
            lhsValue = this.getValue();
            BigDecimal rhsValue;
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
     * Java enum for <em>distanz_zu_sport</em> attribute in &lt;distanzen_sport&gt; elements.

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