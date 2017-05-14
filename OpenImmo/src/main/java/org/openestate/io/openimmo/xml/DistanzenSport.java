
package org.openestate.io.openimmo.xml;

import java.io.Serializable;
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
public class DistanzenSport implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
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
            BigDecimal theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
        }
        {
            DistanzenSport.DistanzZuSport theDistanzZuSport;
            theDistanzZuSport = this.getDistanzZuSport();
            strategy.appendField(locator, this, "distanzZuSport", buffer, theDistanzZuSport, (this.distanzZuSport!= null));
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
        if (draftCopy instanceof DistanzenSport) {
            final DistanzenSport copy = ((DistanzenSport) draftCopy);
            {
                Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.value!= null));
                if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceValue;
                    sourceValue = this.getValue();
                    BigDecimal copyValue = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, (this.value!= null)));
                    copy.setValue(copyValue);
                } else {
                    if (valueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.value = null;
                    }
                }
            }
            {
                Boolean distanzZuSportShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.distanzZuSport!= null));
                if (distanzZuSportShouldBeCopiedAndSet == Boolean.TRUE) {
                    DistanzenSport.DistanzZuSport sourceDistanzZuSport;
                    sourceDistanzZuSport = this.getDistanzZuSport();
                    DistanzenSport.DistanzZuSport copyDistanzZuSport = ((DistanzenSport.DistanzZuSport) strategy.copy(LocatorUtils.property(locator, "distanzZuSport", sourceDistanzZuSport), sourceDistanzZuSport, (this.distanzZuSport!= null)));
                    copy.setDistanzZuSport(copyDistanzZuSport);
                } else {
                    if (distanzZuSportShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.distanzZuSport = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new DistanzenSport();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, (this.value!= null), (that.value!= null))) {
                return false;
            }
        }
        {
            DistanzenSport.DistanzZuSport lhsDistanzZuSport;
            lhsDistanzZuSport = this.getDistanzZuSport();
            DistanzenSport.DistanzZuSport rhsDistanzZuSport;
            rhsDistanzZuSport = that.getDistanzZuSport();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distanzZuSport", lhsDistanzZuSport), LocatorUtils.property(thatLocator, "distanzZuSport", rhsDistanzZuSport), lhsDistanzZuSport, rhsDistanzZuSport, (this.distanzZuSport!= null), (that.distanzZuSport!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
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