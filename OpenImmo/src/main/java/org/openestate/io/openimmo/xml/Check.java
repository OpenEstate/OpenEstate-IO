
package org.openestate.io.openimmo.xml;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
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
 * Java class for &lt;check&gt; element.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "check")
public class Check implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlValue
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar value;
    @XmlAttribute(name = "ctype", required = true)
    protected Check.Ctype ctype;

    /**
     * Gets the value of the value property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public Calendar getValue() {
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
    public void setValue(Calendar value) {
        this.value = value;
    }

    /**
     * Gets the value of the ctype property.
     *
     * @return
     *     possible object is
     *     {@link Check.Ctype }
     *
     */
    public Check.Ctype getCtype() {
        return ctype;
    }

    /**
     * Sets the value of the ctype property.
     *
     * @param value
     *     allowed object is
     *     {@link Check.Ctype }
     *
     */
    public void setCtype(Check.Ctype value) {
        this.ctype = value;
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
            Calendar theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
        }
        {
            Check.Ctype theCtype;
            theCtype = this.getCtype();
            strategy.appendField(locator, this, "ctype", buffer, theCtype, (this.ctype!= null));
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
        if (draftCopy instanceof Check) {
            final Check copy = ((Check) draftCopy);
            {
                Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.value!= null));
                if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceValue;
                    sourceValue = this.getValue();
                    Calendar copyValue = ((Calendar) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, (this.value!= null)));
                    copy.setValue(copyValue);
                } else {
                    if (valueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.value = null;
                    }
                }
            }
            {
                Boolean ctypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ctype!= null));
                if (ctypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    Check.Ctype sourceCtype;
                    sourceCtype = this.getCtype();
                    Check.Ctype copyCtype = ((Check.Ctype) strategy.copy(LocatorUtils.property(locator, "ctype", sourceCtype), sourceCtype, (this.ctype!= null)));
                    copy.setCtype(copyCtype);
                } else {
                    if (ctypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ctype = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Check();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Check that = ((Check) object);
        {
            Calendar lhsValue;
            lhsValue = this.getValue();
            Calendar rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, (this.value!= null), (that.value!= null))) {
                return false;
            }
        }
        {
            Check.Ctype lhsCtype;
            lhsCtype = this.getCtype();
            Check.Ctype rhsCtype;
            rhsCtype = that.getCtype();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ctype", lhsCtype), LocatorUtils.property(thatLocator, "ctype", rhsCtype), lhsCtype, rhsCtype, (this.ctype!= null), (that.ctype!= null))) {
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
     * Java enum for <em>ctype</em> attribute in &lt;check&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum Ctype {

        @XmlEnumValue("MD5")
        MD_5("MD5"),
        DATETIME("DATETIME"),
        ETAG("ETAG");
        private final String value;

        Ctype(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static Check.Ctype fromValue(String v) {
            for (Check.Ctype c: Check.Ctype.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}