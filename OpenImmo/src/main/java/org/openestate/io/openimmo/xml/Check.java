
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
public class Check
    implements Cloneable, CopyTo, Equals, ToString
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
            Calendar theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        {
            Check.Ctype theCtype;
            theCtype = this.getCtype();
            strategy.appendField(locator, this, "ctype", buffer, theCtype);
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
        if (draftCopy instanceof Check) {
            final Check copy = ((Check) draftCopy);
            if (this.value!= null) {
                Calendar sourceValue;
                sourceValue = this.getValue();
                Calendar copyValue = ((Calendar) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.setValue(copyValue);
            } else {
                copy.value = null;
            }
            if (this.ctype!= null) {
                Check.Ctype sourceCtype;
                sourceCtype = this.getCtype();
                Check.Ctype copyCtype = ((Check.Ctype) strategy.copy(LocatorUtils.property(locator, "ctype", sourceCtype), sourceCtype));
                copy.setCtype(copyCtype);
            } else {
                copy.ctype = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Check();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
                return false;
            }
        }
        {
            Check.Ctype lhsCtype;
            lhsCtype = this.getCtype();
            Check.Ctype rhsCtype;
            rhsCtype = that.getCtype();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ctype", lhsCtype), LocatorUtils.property(thatLocator, "ctype", rhsCtype), lhsCtype, rhsCtype)) {
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