
package org.openestate.io.trovit.xml;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Currency;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
import org.openestate.io.trovit.xml.types.PricePeriodValue;


/**
 * 
 *                 Der Preis eines Objekts.
 *             
 * 
 * <p>Java class for PriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;&gt;PriceValue"&gt;
 *       &lt;attribute name="period" type="{}PricePeriodValue" /&gt;
 *       &lt;attribute name="currency" type="{}PriceCurrencyValue" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceType", propOrder = {
    "value"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:09:46+02:00", comments = "JAXB RI v2.2.11")
public class PriceType implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlValue
    @XmlJavaTypeAdapter(Adapter4 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:09:46+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal value;
    @XmlAttribute(name = "period")
    @XmlJavaTypeAdapter(Adapter5 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:09:46+02:00", comments = "JAXB RI v2.2.11")
    protected PricePeriodValue period;
    @XmlAttribute(name = "currency")
    @XmlJavaTypeAdapter(Adapter6 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:09:46+02:00", comments = "JAXB RI v2.2.11")
    protected Currency currency;

    /**
     * 
     *                 Der Preis eines Objekts h\u00e4ngt von der gew\u00e4hlten Art ab.
     *                 siehe https://corporate.trovit.com/specs-us-homes/
     *             
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:09:46+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:09:46+02:00", comments = "JAXB RI v2.2.11")
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:09:46+02:00", comments = "JAXB RI v2.2.11")
    public PricePeriodValue getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:09:46+02:00", comments = "JAXB RI v2.2.11")
    public void setPeriod(PricePeriodValue value) {
        this.period = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:09:46+02:00", comments = "JAXB RI v2.2.11")
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:09:46+02:00", comments = "JAXB RI v2.2.11")
    public void setCurrency(Currency value) {
        this.currency = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:09:46+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:09:46+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:09:46+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            BigDecimal theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
        }
        {
            PricePeriodValue thePeriod;
            thePeriod = this.getPeriod();
            strategy.appendField(locator, this, "period", buffer, thePeriod, (this.period!= null));
        }
        {
            Currency theCurrency;
            theCurrency = this.getCurrency();
            strategy.appendField(locator, this, "currency", buffer, theCurrency, (this.currency!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:09:46+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:09:46+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:09:46+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof PriceType) {
            final PriceType copy = ((PriceType) draftCopy);
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
                Boolean periodShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.period!= null));
                if (periodShouldBeCopiedAndSet == Boolean.TRUE) {
                    PricePeriodValue sourcePeriod;
                    sourcePeriod = this.getPeriod();
                    PricePeriodValue copyPeriod = ((PricePeriodValue) strategy.copy(LocatorUtils.property(locator, "period", sourcePeriod), sourcePeriod, (this.period!= null)));
                    copy.setPeriod(copyPeriod);
                } else {
                    if (periodShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.period = null;
                    }
                }
            }
            {
                Boolean currencyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.currency!= null));
                if (currencyShouldBeCopiedAndSet == Boolean.TRUE) {
                    Currency sourceCurrency;
                    sourceCurrency = this.getCurrency();
                    Currency copyCurrency = ((Currency) strategy.copy(LocatorUtils.property(locator, "currency", sourceCurrency), sourceCurrency, (this.currency!= null)));
                    copy.setCurrency(copyCurrency);
                } else {
                    if (currencyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.currency = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:09:46+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new PriceType();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:09:46+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PriceType that = ((PriceType) object);
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
            PricePeriodValue lhsPeriod;
            lhsPeriod = this.getPeriod();
            PricePeriodValue rhsPeriod;
            rhsPeriod = that.getPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "period", lhsPeriod), LocatorUtils.property(thatLocator, "period", rhsPeriod), lhsPeriod, rhsPeriod, (this.period!= null), (that.period!= null))) {
                return false;
            }
        }
        {
            Currency lhsCurrency;
            lhsCurrency = this.getCurrency();
            Currency rhsCurrency;
            rhsCurrency = that.getCurrency();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "currency", lhsCurrency), LocatorUtils.property(thatLocator, "currency", rhsCurrency), lhsCurrency, rhsCurrency, (this.currency!= null), (that.currency!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:09:46+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
