
package org.openestate.io.is24_xml.xml;

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
 * <p>Java class for AmtsgerichtTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmtsgerichtTyp"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.immobilienscout24.de/immobilientransfer&gt;Text40Typ"&gt;
 *       &lt;attribute name="BundeslandCode" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}ISOBundeslaenderCodeTyp" /&gt;
 *       &lt;attribute name="Telefon" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Text15Typ" /&gt;
 *       &lt;attribute name="Aktenzeichen" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Text15Typ" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmtsgerichtTyp", propOrder = {
    "value"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
public class AmtsgerichtTyp implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlValue
    @XmlJavaTypeAdapter(Adapter6 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected String value;
    @XmlAttribute(name = "BundeslandCode", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected ISOBundeslaenderCodeTyp bundeslandCode;
    @XmlAttribute(name = "Telefon", required = true)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected String telefon;
    @XmlAttribute(name = "Aktenzeichen", required = true)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected String aktenzeichen;

    /**
     * Text, maximal 40 Zeichen
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the bundeslandCode property.
     * 
     * @return
     *     possible object is
     *     {@link ISOBundeslaenderCodeTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public ISOBundeslaenderCodeTyp getBundeslandCode() {
        return bundeslandCode;
    }

    /**
     * Sets the value of the bundeslandCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISOBundeslaenderCodeTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setBundeslandCode(ISOBundeslaenderCodeTyp value) {
        this.bundeslandCode = value;
    }

    /**
     * Gets the value of the telefon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public String getTelefon() {
        return telefon;
    }

    /**
     * Sets the value of the telefon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setTelefon(String value) {
        this.telefon = value;
    }

    /**
     * Gets the value of the aktenzeichen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public String getAktenzeichen() {
        return aktenzeichen;
    }

    /**
     * Sets the value of the aktenzeichen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setAktenzeichen(String value) {
        this.aktenzeichen = value;
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
            String theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
        }
        {
            ISOBundeslaenderCodeTyp theBundeslandCode;
            theBundeslandCode = this.getBundeslandCode();
            strategy.appendField(locator, this, "bundeslandCode", buffer, theBundeslandCode, (this.bundeslandCode!= null));
        }
        {
            String theTelefon;
            theTelefon = this.getTelefon();
            strategy.appendField(locator, this, "telefon", buffer, theTelefon, (this.telefon!= null));
        }
        {
            String theAktenzeichen;
            theAktenzeichen = this.getAktenzeichen();
            strategy.appendField(locator, this, "aktenzeichen", buffer, theAktenzeichen, (this.aktenzeichen!= null));
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
        if (draftCopy instanceof AmtsgerichtTyp) {
            final AmtsgerichtTyp copy = ((AmtsgerichtTyp) draftCopy);
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
                Boolean bundeslandCodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bundeslandCode!= null));
                if (bundeslandCodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ISOBundeslaenderCodeTyp sourceBundeslandCode;
                    sourceBundeslandCode = this.getBundeslandCode();
                    ISOBundeslaenderCodeTyp copyBundeslandCode = ((ISOBundeslaenderCodeTyp) strategy.copy(LocatorUtils.property(locator, "bundeslandCode", sourceBundeslandCode), sourceBundeslandCode, (this.bundeslandCode!= null)));
                    copy.setBundeslandCode(copyBundeslandCode);
                } else {
                    if (bundeslandCodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bundeslandCode = null;
                    }
                }
            }
            {
                Boolean telefonShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.telefon!= null));
                if (telefonShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTelefon;
                    sourceTelefon = this.getTelefon();
                    String copyTelefon = ((String) strategy.copy(LocatorUtils.property(locator, "telefon", sourceTelefon), sourceTelefon, (this.telefon!= null)));
                    copy.setTelefon(copyTelefon);
                } else {
                    if (telefonShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.telefon = null;
                    }
                }
            }
            {
                Boolean aktenzeichenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.aktenzeichen!= null));
                if (aktenzeichenShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAktenzeichen;
                    sourceAktenzeichen = this.getAktenzeichen();
                    String copyAktenzeichen = ((String) strategy.copy(LocatorUtils.property(locator, "aktenzeichen", sourceAktenzeichen), sourceAktenzeichen, (this.aktenzeichen!= null)));
                    copy.setAktenzeichen(copyAktenzeichen);
                } else {
                    if (aktenzeichenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.aktenzeichen = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new AmtsgerichtTyp();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AmtsgerichtTyp that = ((AmtsgerichtTyp) object);
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
            ISOBundeslaenderCodeTyp lhsBundeslandCode;
            lhsBundeslandCode = this.getBundeslandCode();
            ISOBundeslaenderCodeTyp rhsBundeslandCode;
            rhsBundeslandCode = that.getBundeslandCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bundeslandCode", lhsBundeslandCode), LocatorUtils.property(thatLocator, "bundeslandCode", rhsBundeslandCode), lhsBundeslandCode, rhsBundeslandCode, (this.bundeslandCode!= null), (that.bundeslandCode!= null))) {
                return false;
            }
        }
        {
            String lhsTelefon;
            lhsTelefon = this.getTelefon();
            String rhsTelefon;
            rhsTelefon = that.getTelefon();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telefon", lhsTelefon), LocatorUtils.property(thatLocator, "telefon", rhsTelefon), lhsTelefon, rhsTelefon, (this.telefon!= null), (that.telefon!= null))) {
                return false;
            }
        }
        {
            String lhsAktenzeichen;
            lhsAktenzeichen = this.getAktenzeichen();
            String rhsAktenzeichen;
            rhsAktenzeichen = that.getAktenzeichen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aktenzeichen", lhsAktenzeichen), LocatorUtils.property(thatLocator, "aktenzeichen", rhsAktenzeichen), lhsAktenzeichen, rhsAktenzeichen, (this.aktenzeichen!= null), (that.aktenzeichen!= null))) {
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
