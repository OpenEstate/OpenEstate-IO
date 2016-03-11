
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
 * Java class for &lt;distanzen&gt; element.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "distanzen")
public class Distanzen implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlValue
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "float")
    protected BigDecimal value;
    @XmlAttribute(name = "distanz_zu", required = true)
    protected Distanzen.DistanzZu distanzZu;

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
     * Gets the value of the distanzZu property.
     *
     * @return
     *     possible object is
     *     {@link Distanzen.DistanzZu }
     *
     */
    public Distanzen.DistanzZu getDistanzZu() {
        return distanzZu;
    }

    /**
     * Sets the value of the distanzZu property.
     *
     * @param value
     *     allowed object is
     *     {@link Distanzen.DistanzZu }
     *
     */
    public void setDistanzZu(Distanzen.DistanzZu value) {
        this.distanzZu = value;
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
            Distanzen.DistanzZu theDistanzZu;
            theDistanzZu = this.getDistanzZu();
            strategy.appendField(locator, this, "distanzZu", buffer, theDistanzZu, (this.distanzZu!= null));
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
        if (draftCopy instanceof Distanzen) {
            final Distanzen copy = ((Distanzen) draftCopy);
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
                Boolean distanzZuShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.distanzZu!= null));
                if (distanzZuShouldBeCopiedAndSet == Boolean.TRUE) {
                    Distanzen.DistanzZu sourceDistanzZu;
                    sourceDistanzZu = this.getDistanzZu();
                    Distanzen.DistanzZu copyDistanzZu = ((Distanzen.DistanzZu) strategy.copy(LocatorUtils.property(locator, "distanzZu", sourceDistanzZu), sourceDistanzZu, (this.distanzZu!= null)));
                    copy.setDistanzZu(copyDistanzZu);
                } else {
                    if (distanzZuShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.distanzZu = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Distanzen();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Distanzen that = ((Distanzen) object);
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
            Distanzen.DistanzZu lhsDistanzZu;
            lhsDistanzZu = this.getDistanzZu();
            Distanzen.DistanzZu rhsDistanzZu;
            rhsDistanzZu = that.getDistanzZu();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distanzZu", lhsDistanzZu), LocatorUtils.property(thatLocator, "distanzZu", rhsDistanzZu), lhsDistanzZu, rhsDistanzZu, (this.distanzZu!= null), (that.distanzZu!= null))) {
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
     * Java enum for <em>distanz_zu</em> attribute in &lt;distanzen&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum DistanzZu {

        FLUGHAFEN,
        FERNBAHNHOF,
        AUTOBAHN,
        US_BAHN,
        BUS,
        KINDERGAERTEN,
        GRUNDSCHULE,
        HAUPTSCHULE,
        REALSCHULE,
        GESAMTSCHULE,
        GYMNASIUM,
        ZENTRUM,
        EINKAUFSMOEGLICHKEITEN,
        GASTSTAETTEN;

        public String value() {
            return name();
        }

        public static Distanzen.DistanzZu fromValue(String v) {
            return valueOf(v);
        }

    }

}