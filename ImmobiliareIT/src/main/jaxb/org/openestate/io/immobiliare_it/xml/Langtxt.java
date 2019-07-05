
package org.openestate.io.immobiliare_it.xml;

import java.io.Serializable;
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


/**
 * <p>Java class for langtxt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="langtxt"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="language" type="{http://feed.immobiliare.it}nationcode" /&gt;
 *       &lt;attribute name="native" type="{http://feed.immobiliare.it}yesonly" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "langtxt", propOrder = {
    "value"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
public class Langtxt implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlValue
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected String value;
    @XmlAttribute(name = "language")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected NationCodeType language;
    @XmlAttribute(name = "native")
    @XmlJavaTypeAdapter(Adapter15 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean _native;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link NationCodeType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public NationCodeType getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link NationCodeType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setLanguage(NationCodeType value) {
        this.language = value;
    }

    /**
     * Gets the value of the native property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getNative() {
        return _native;
    }

    /**
     * Sets the value of the native property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setNative(Boolean value) {
        this._native = value;
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
            String theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
        }
        {
            NationCodeType theLanguage;
            theLanguage = this.getLanguage();
            strategy.appendField(locator, this, "language", buffer, theLanguage, (this.language!= null));
        }
        {
            Boolean theNative;
            theNative = this.getNative();
            strategy.appendField(locator, this, "_native", buffer, theNative, (this._native!= null));
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
        if (draftCopy instanceof Langtxt) {
            final Langtxt copy = ((Langtxt) draftCopy);
            {
                Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.value!= null));
                if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceValue;
                    sourceValue = this.getValue();
                    String copyValue = ((String) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, (this.value!= null)));
                    copy.setValue(copyValue);
                } else {
                    if (valueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.value = null;
                    }
                }
            }
            {
                Boolean languageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.language!= null));
                if (languageShouldBeCopiedAndSet == Boolean.TRUE) {
                    NationCodeType sourceLanguage;
                    sourceLanguage = this.getLanguage();
                    NationCodeType copyLanguage = ((NationCodeType) strategy.copy(LocatorUtils.property(locator, "language", sourceLanguage), sourceLanguage, (this.language!= null)));
                    copy.setLanguage(copyLanguage);
                } else {
                    if (languageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.language = null;
                    }
                }
            }
            {
                Boolean _nativeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this._native!= null));
                if (_nativeShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceNative;
                    sourceNative = this.getNative();
                    Boolean copyNative = ((Boolean) strategy.copy(LocatorUtils.property(locator, "_native", sourceNative), sourceNative, (this._native!= null)));
                    copy.setNative(copyNative);
                } else {
                    if (_nativeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy._native = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new Langtxt();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Langtxt that = ((Langtxt) object);
        {
            String lhsValue;
            lhsValue = this.getValue();
            String rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, (this.value!= null), (that.value!= null))) {
                return false;
            }
        }
        {
            NationCodeType lhsLanguage;
            lhsLanguage = this.getLanguage();
            NationCodeType rhsLanguage;
            rhsLanguage = that.getLanguage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "language", lhsLanguage), LocatorUtils.property(thatLocator, "language", rhsLanguage), lhsLanguage, rhsLanguage, (this.language!= null), (that.language!= null))) {
                return false;
            }
        }
        {
            Boolean lhsNative;
            lhsNative = this.getNative();
            Boolean rhsNative;
            rhsNative = that.getNative();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "_native", lhsNative), LocatorUtils.property(thatLocator, "_native", rhsNative), lhsNative, rhsNative, (this._native!= null), (that._native!= null))) {
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
