
package org.openestate.io.is24_xml.xml;

import java.io.Serializable;
import java.util.Calendar;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * <p>Java class for VersteigerungsterminTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VersteigerungsterminTyp"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;date"&gt;
 *       &lt;attribute name="Wiederholungstermin" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="Teilungsversteigerung" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VersteigerungsterminTyp", propOrder = {
    "value"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
public class VersteigerungsterminTyp implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlValue
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected Calendar value;
    @XmlAttribute(name = "Wiederholungstermin")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean wiederholungstermin;
    @XmlAttribute(name = "Teilungsversteigerung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean teilungsversteigerung;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setValue(Calendar value) {
        this.value = value;
    }

    /**
     * Gets the value of the wiederholungstermin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getWiederholungstermin() {
        if (wiederholungstermin == null) {
            return false;
        } else {
            return wiederholungstermin;
        }
    }

    /**
     * Sets the value of the wiederholungstermin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setWiederholungstermin(Boolean value) {
        this.wiederholungstermin = value;
    }

    /**
     * Gets the value of the teilungsversteigerung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getTeilungsversteigerung() {
        if (teilungsversteigerung == null) {
            return false;
        } else {
            return teilungsversteigerung;
        }
    }

    /**
     * Sets the value of the teilungsversteigerung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setTeilungsversteigerung(Boolean value) {
        this.teilungsversteigerung = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            Calendar theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
        }
        {
            Boolean theWiederholungstermin;
            theWiederholungstermin = this.getWiederholungstermin();
            strategy.appendField(locator, this, "wiederholungstermin", buffer, theWiederholungstermin, (this.wiederholungstermin!= null));
        }
        {
            Boolean theTeilungsversteigerung;
            theTeilungsversteigerung = this.getTeilungsversteigerung();
            strategy.appendField(locator, this, "teilungsversteigerung", buffer, theTeilungsversteigerung, (this.teilungsversteigerung!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof VersteigerungsterminTyp) {
            final VersteigerungsterminTyp copy = ((VersteigerungsterminTyp) draftCopy);
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
                Boolean wiederholungsterminShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wiederholungstermin!= null));
                if (wiederholungsterminShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceWiederholungstermin;
                    sourceWiederholungstermin = this.getWiederholungstermin();
                    Boolean copyWiederholungstermin = ((Boolean) strategy.copy(LocatorUtils.property(locator, "wiederholungstermin", sourceWiederholungstermin), sourceWiederholungstermin, (this.wiederholungstermin!= null)));
                    copy.setWiederholungstermin(copyWiederholungstermin);
                } else {
                    if (wiederholungsterminShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wiederholungstermin = null;
                    }
                }
            }
            {
                Boolean teilungsversteigerungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.teilungsversteigerung!= null));
                if (teilungsversteigerungShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceTeilungsversteigerung;
                    sourceTeilungsversteigerung = this.getTeilungsversteigerung();
                    Boolean copyTeilungsversteigerung = ((Boolean) strategy.copy(LocatorUtils.property(locator, "teilungsversteigerung", sourceTeilungsversteigerung), sourceTeilungsversteigerung, (this.teilungsversteigerung!= null)));
                    copy.setTeilungsversteigerung(copyTeilungsversteigerung);
                } else {
                    if (teilungsversteigerungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.teilungsversteigerung = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new VersteigerungsterminTyp();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final VersteigerungsterminTyp that = ((VersteigerungsterminTyp) object);
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
            Boolean lhsWiederholungstermin;
            lhsWiederholungstermin = this.getWiederholungstermin();
            Boolean rhsWiederholungstermin;
            rhsWiederholungstermin = that.getWiederholungstermin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wiederholungstermin", lhsWiederholungstermin), LocatorUtils.property(thatLocator, "wiederholungstermin", rhsWiederholungstermin), lhsWiederholungstermin, rhsWiederholungstermin, (this.wiederholungstermin!= null), (that.wiederholungstermin!= null))) {
                return false;
            }
        }
        {
            Boolean lhsTeilungsversteigerung;
            lhsTeilungsversteigerung = this.getTeilungsversteigerung();
            Boolean rhsTeilungsversteigerung;
            rhsTeilungsversteigerung = that.getTeilungsversteigerung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "teilungsversteigerung", lhsTeilungsversteigerung), LocatorUtils.property(thatLocator, "teilungsversteigerung", rhsTeilungsversteigerung), lhsTeilungsversteigerung, rhsTeilungsversteigerung, (this.teilungsversteigerung!= null), (that.teilungsversteigerung!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
