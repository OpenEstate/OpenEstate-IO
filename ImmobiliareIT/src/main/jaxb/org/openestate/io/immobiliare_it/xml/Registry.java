
package org.openestate.io.immobiliare_it.xml;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Currency;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
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
 * <p>Java class for registry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="income"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;double"&gt;
 *                 &lt;attribute name="currency" type="{http://feed.immobiliare.it}currency" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="class"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="A/1"/&gt;
 *             &lt;enumeration value="A/2"/&gt;
 *             &lt;enumeration value="A/3"/&gt;
 *             &lt;enumeration value="A/4"/&gt;
 *             &lt;enumeration value="A/5"/&gt;
 *             &lt;enumeration value="A/6"/&gt;
 *             &lt;enumeration value="A/7"/&gt;
 *             &lt;enumeration value="A/8"/&gt;
 *             &lt;enumeration value="A/9"/&gt;
 *             &lt;enumeration value="A/10"/&gt;
 *             &lt;enumeration value="A/11"/&gt;
 *             &lt;enumeration value="B/1"/&gt;
 *             &lt;enumeration value="B/2"/&gt;
 *             &lt;enumeration value="B/3"/&gt;
 *             &lt;enumeration value="B/4"/&gt;
 *             &lt;enumeration value="B/5"/&gt;
 *             &lt;enumeration value="B/6"/&gt;
 *             &lt;enumeration value="B/7"/&gt;
 *             &lt;enumeration value="B/8"/&gt;
 *             &lt;enumeration value="C/1"/&gt;
 *             &lt;enumeration value="C/2"/&gt;
 *             &lt;enumeration value="C/3"/&gt;
 *             &lt;enumeration value="C/4"/&gt;
 *             &lt;enumeration value="C/5"/&gt;
 *             &lt;enumeration value="C/6"/&gt;
 *             &lt;enumeration value="C/7"/&gt;
 *             &lt;enumeration value="D/1"/&gt;
 *             &lt;enumeration value="D/2"/&gt;
 *             &lt;enumeration value="D/3"/&gt;
 *             &lt;enumeration value="D/4"/&gt;
 *             &lt;enumeration value="D/5"/&gt;
 *             &lt;enumeration value="D/6"/&gt;
 *             &lt;enumeration value="D/7"/&gt;
 *             &lt;enumeration value="D/8"/&gt;
 *             &lt;enumeration value="D/9"/&gt;
 *             &lt;enumeration value="D/10"/&gt;
 *             &lt;enumeration value="D/11"/&gt;
 *             &lt;enumeration value="D/12"/&gt;
 *             &lt;enumeration value="E/1"/&gt;
 *             &lt;enumeration value="E/2"/&gt;
 *             &lt;enumeration value="E/3"/&gt;
 *             &lt;enumeration value="E/4"/&gt;
 *             &lt;enumeration value="E/5"/&gt;
 *             &lt;enumeration value="E/6"/&gt;
 *             &lt;enumeration value="E/7"/&gt;
 *             &lt;enumeration value="E/8"/&gt;
 *             &lt;enumeration value="E/9"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registry", propOrder = {

})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
public class Registry implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected Registry.Income income;
    @XmlAttribute(name = "class")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected Registry.Type clazz;

    /**
     * Gets the value of the income property.
     * 
     * @return
     *     possible object is
     *     {@link Registry.Income }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Registry.Income getIncome() {
        return income;
    }

    /**
     * Sets the value of the income property.
     * 
     * @param value
     *     allowed object is
     *     {@link Registry.Income }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setIncome(Registry.Income value) {
        this.income = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link Registry.Type }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Registry.Type getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Registry.Type }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setClazz(Registry.Type value) {
        this.clazz = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            Registry.Income theIncome;
            theIncome = this.getIncome();
            strategy.appendField(locator, this, "income", buffer, theIncome, (this.income!= null));
        }
        {
            Registry.Type theClazz;
            theClazz = this.getClazz();
            strategy.appendField(locator, this, "clazz", buffer, theClazz, (this.clazz!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Registry) {
            final Registry copy = ((Registry) draftCopy);
            {
                Boolean incomeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.income!= null));
                if (incomeShouldBeCopiedAndSet == Boolean.TRUE) {
                    Registry.Income sourceIncome;
                    sourceIncome = this.getIncome();
                    Registry.Income copyIncome = ((Registry.Income) strategy.copy(LocatorUtils.property(locator, "income", sourceIncome), sourceIncome, (this.income!= null)));
                    copy.setIncome(copyIncome);
                } else {
                    if (incomeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.income = null;
                    }
                }
            }
            {
                Boolean clazzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.clazz!= null));
                if (clazzShouldBeCopiedAndSet == Boolean.TRUE) {
                    Registry.Type sourceClazz;
                    sourceClazz = this.getClazz();
                    Registry.Type copyClazz = ((Registry.Type) strategy.copy(LocatorUtils.property(locator, "clazz", sourceClazz), sourceClazz, (this.clazz!= null)));
                    copy.setClazz(copyClazz);
                } else {
                    if (clazzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.clazz = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new Registry();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Registry that = ((Registry) object);
        {
            Registry.Income lhsIncome;
            lhsIncome = this.getIncome();
            Registry.Income rhsIncome;
            rhsIncome = that.getIncome();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "income", lhsIncome), LocatorUtils.property(thatLocator, "income", rhsIncome), lhsIncome, rhsIncome, (this.income!= null), (that.income!= null))) {
                return false;
            }
        }
        {
            Registry.Type lhsClazz;
            lhsClazz = this.getClazz();
            Registry.Type rhsClazz;
            rhsClazz = that.getClazz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clazz", lhsClazz), LocatorUtils.property(thatLocator, "clazz", rhsClazz), lhsClazz, rhsClazz, (this.clazz!= null), (that.clazz!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;double"&gt;
     *       &lt;attribute name="currency" type="{http://feed.immobiliare.it}currency" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public static class Income implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlValue
        @XmlJavaTypeAdapter(Adapter2 .class)
        @XmlSchemaType(name = "double")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        protected BigDecimal value;
        @XmlAttribute(name = "currency")
        @XmlJavaTypeAdapter(Adapter14 .class)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        protected Currency currency;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public void setCurrency(Currency value) {
            this.currency = value;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public String toString() {
            final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            {
                BigDecimal theValue;
                theValue = this.getValue();
                strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
            }
            {
                Currency theCurrency;
                theCurrency = this.getCurrency();
                strategy.appendField(locator, this, "currency", buffer, theCurrency, (this.currency!= null));
            }
            return buffer;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public Object clone() {
            return copyTo(createNewInstance());
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public Object copyTo(Object target) {
            final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
            return copyTo(null, target, strategy);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
            final Object draftCopy = ((target == null)?createNewInstance():target);
            if (draftCopy instanceof Registry.Income) {
                final Registry.Income copy = ((Registry.Income) draftCopy);
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

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public Object createNewInstance() {
            return new Registry.Income();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final Registry.Income that = ((Registry.Income) object);
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

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public boolean equals(Object object) {
            final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="A/1"/&gt;
     *     &lt;enumeration value="A/2"/&gt;
     *     &lt;enumeration value="A/3"/&gt;
     *     &lt;enumeration value="A/4"/&gt;
     *     &lt;enumeration value="A/5"/&gt;
     *     &lt;enumeration value="A/6"/&gt;
     *     &lt;enumeration value="A/7"/&gt;
     *     &lt;enumeration value="A/8"/&gt;
     *     &lt;enumeration value="A/9"/&gt;
     *     &lt;enumeration value="A/10"/&gt;
     *     &lt;enumeration value="A/11"/&gt;
     *     &lt;enumeration value="B/1"/&gt;
     *     &lt;enumeration value="B/2"/&gt;
     *     &lt;enumeration value="B/3"/&gt;
     *     &lt;enumeration value="B/4"/&gt;
     *     &lt;enumeration value="B/5"/&gt;
     *     &lt;enumeration value="B/6"/&gt;
     *     &lt;enumeration value="B/7"/&gt;
     *     &lt;enumeration value="B/8"/&gt;
     *     &lt;enumeration value="C/1"/&gt;
     *     &lt;enumeration value="C/2"/&gt;
     *     &lt;enumeration value="C/3"/&gt;
     *     &lt;enumeration value="C/4"/&gt;
     *     &lt;enumeration value="C/5"/&gt;
     *     &lt;enumeration value="C/6"/&gt;
     *     &lt;enumeration value="C/7"/&gt;
     *     &lt;enumeration value="D/1"/&gt;
     *     &lt;enumeration value="D/2"/&gt;
     *     &lt;enumeration value="D/3"/&gt;
     *     &lt;enumeration value="D/4"/&gt;
     *     &lt;enumeration value="D/5"/&gt;
     *     &lt;enumeration value="D/6"/&gt;
     *     &lt;enumeration value="D/7"/&gt;
     *     &lt;enumeration value="D/8"/&gt;
     *     &lt;enumeration value="D/9"/&gt;
     *     &lt;enumeration value="D/10"/&gt;
     *     &lt;enumeration value="D/11"/&gt;
     *     &lt;enumeration value="D/12"/&gt;
     *     &lt;enumeration value="E/1"/&gt;
     *     &lt;enumeration value="E/2"/&gt;
     *     &lt;enumeration value="E/3"/&gt;
     *     &lt;enumeration value="E/4"/&gt;
     *     &lt;enumeration value="E/5"/&gt;
     *     &lt;enumeration value="E/6"/&gt;
     *     &lt;enumeration value="E/7"/&gt;
     *     &lt;enumeration value="E/8"/&gt;
     *     &lt;enumeration value="E/9"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public enum Type {

        @XmlEnumValue("A/1")
        A_1("A/1"),
        @XmlEnumValue("A/2")
        A_2("A/2"),
        @XmlEnumValue("A/3")
        A_3("A/3"),
        @XmlEnumValue("A/4")
        A_4("A/4"),
        @XmlEnumValue("A/5")
        A_5("A/5"),
        @XmlEnumValue("A/6")
        A_6("A/6"),
        @XmlEnumValue("A/7")
        A_7("A/7"),
        @XmlEnumValue("A/8")
        A_8("A/8"),
        @XmlEnumValue("A/9")
        A_9("A/9"),
        @XmlEnumValue("A/10")
        A_10("A/10"),
        @XmlEnumValue("A/11")
        A_11("A/11"),
        @XmlEnumValue("B/1")
        B_1("B/1"),
        @XmlEnumValue("B/2")
        B_2("B/2"),
        @XmlEnumValue("B/3")
        B_3("B/3"),
        @XmlEnumValue("B/4")
        B_4("B/4"),
        @XmlEnumValue("B/5")
        B_5("B/5"),
        @XmlEnumValue("B/6")
        B_6("B/6"),
        @XmlEnumValue("B/7")
        B_7("B/7"),
        @XmlEnumValue("B/8")
        B_8("B/8"),
        @XmlEnumValue("C/1")
        C_1("C/1"),
        @XmlEnumValue("C/2")
        C_2("C/2"),
        @XmlEnumValue("C/3")
        C_3("C/3"),
        @XmlEnumValue("C/4")
        C_4("C/4"),
        @XmlEnumValue("C/5")
        C_5("C/5"),
        @XmlEnumValue("C/6")
        C_6("C/6"),
        @XmlEnumValue("C/7")
        C_7("C/7"),
        @XmlEnumValue("D/1")
        D_1("D/1"),
        @XmlEnumValue("D/2")
        D_2("D/2"),
        @XmlEnumValue("D/3")
        D_3("D/3"),
        @XmlEnumValue("D/4")
        D_4("D/4"),
        @XmlEnumValue("D/5")
        D_5("D/5"),
        @XmlEnumValue("D/6")
        D_6("D/6"),
        @XmlEnumValue("D/7")
        D_7("D/7"),
        @XmlEnumValue("D/8")
        D_8("D/8"),
        @XmlEnumValue("D/9")
        D_9("D/9"),
        @XmlEnumValue("D/10")
        D_10("D/10"),
        @XmlEnumValue("D/11")
        D_11("D/11"),
        @XmlEnumValue("D/12")
        D_12("D/12"),
        @XmlEnumValue("E/1")
        E_1("E/1"),
        @XmlEnumValue("E/2")
        E_2("E/2"),
        @XmlEnumValue("E/3")
        E_3("E/3"),
        @XmlEnumValue("E/4")
        E_4("E/4"),
        @XmlEnumValue("E/5")
        E_5("E/5"),
        @XmlEnumValue("E/6")
        E_6("E/6"),
        @XmlEnumValue("E/7")
        E_7("E/7"),
        @XmlEnumValue("E/8")
        E_8("E/8"),
        @XmlEnumValue("E/9")
        E_9("E/9");
        private final String value;

        Type(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static Registry.Type fromValue(String v) {
            for (Registry.Type c: Registry.Type.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
