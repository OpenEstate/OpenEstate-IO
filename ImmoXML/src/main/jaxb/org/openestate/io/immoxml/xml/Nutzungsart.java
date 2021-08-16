
package org.openestate.io.immoxml.xml;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 * Java class for &lt;nutzungsart&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "nutzungsart")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
public class Nutzungsart implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "WOHNEN")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean wohnen;
    @XmlAttribute(name = "GEWERBE")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean gewerbe;
    @XmlAttribute(name = "ANLAGE")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean anlage;
    @XmlAttribute(name = "WAZ")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean waz;

    /**
     * Gets the value of the wohnen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getWOHNEN() {
        return wohnen;
    }

    /**
     * Sets the value of the wohnen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setWOHNEN(Boolean value) {
        this.wohnen = value;
    }

    /**
     * Gets the value of the gewerbe property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getGEWERBE() {
        return gewerbe;
    }

    /**
     * Sets the value of the gewerbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setGEWERBE(Boolean value) {
        this.gewerbe = value;
    }

    /**
     * Gets the value of the anlage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getANLAGE() {
        return anlage;
    }

    /**
     * Sets the value of the anlage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setANLAGE(Boolean value) {
        this.anlage = value;
    }

    /**
     * Gets the value of the waz property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getWAZ() {
        return waz;
    }

    /**
     * Sets the value of the waz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setWAZ(Boolean value) {
        this.waz = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            Boolean theWOHNEN;
            theWOHNEN = this.getWOHNEN();
            strategy.appendField(locator, this, "wohnen", buffer, theWOHNEN, (this.wohnen!= null));
        }
        {
            Boolean theGEWERBE;
            theGEWERBE = this.getGEWERBE();
            strategy.appendField(locator, this, "gewerbe", buffer, theGEWERBE, (this.gewerbe!= null));
        }
        {
            Boolean theANLAGE;
            theANLAGE = this.getANLAGE();
            strategy.appendField(locator, this, "anlage", buffer, theANLAGE, (this.anlage!= null));
        }
        {
            Boolean theWAZ;
            theWAZ = this.getWAZ();
            strategy.appendField(locator, this, "waz", buffer, theWAZ, (this.waz!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Nutzungsart) {
            final Nutzungsart copy = ((Nutzungsart) draftCopy);
            {
                Boolean wohnenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wohnen!= null));
                if (wohnenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceWOHNEN;
                    sourceWOHNEN = this.getWOHNEN();
                    Boolean copyWOHNEN = ((Boolean) strategy.copy(LocatorUtils.property(locator, "wohnen", sourceWOHNEN), sourceWOHNEN, (this.wohnen!= null)));
                    copy.setWOHNEN(copyWOHNEN);
                } else {
                    if (wohnenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wohnen = null;
                    }
                }
            }
            {
                Boolean gewerbeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gewerbe!= null));
                if (gewerbeShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceGEWERBE;
                    sourceGEWERBE = this.getGEWERBE();
                    Boolean copyGEWERBE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "gewerbe", sourceGEWERBE), sourceGEWERBE, (this.gewerbe!= null)));
                    copy.setGEWERBE(copyGEWERBE);
                } else {
                    if (gewerbeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gewerbe = null;
                    }
                }
            }
            {
                Boolean anlageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anlage!= null));
                if (anlageShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceANLAGE;
                    sourceANLAGE = this.getANLAGE();
                    Boolean copyANLAGE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "anlage", sourceANLAGE), sourceANLAGE, (this.anlage!= null)));
                    copy.setANLAGE(copyANLAGE);
                } else {
                    if (anlageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anlage = null;
                    }
                }
            }
            {
                Boolean wazShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.waz!= null));
                if (wazShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceWAZ;
                    sourceWAZ = this.getWAZ();
                    Boolean copyWAZ = ((Boolean) strategy.copy(LocatorUtils.property(locator, "waz", sourceWAZ), sourceWAZ, (this.waz!= null)));
                    copy.setWAZ(copyWAZ);
                } else {
                    if (wazShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.waz = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Nutzungsart();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Nutzungsart that = ((Nutzungsart) object);
        {
            Boolean lhsWOHNEN;
            lhsWOHNEN = this.getWOHNEN();
            Boolean rhsWOHNEN;
            rhsWOHNEN = that.getWOHNEN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wohnen", lhsWOHNEN), LocatorUtils.property(thatLocator, "wohnen", rhsWOHNEN), lhsWOHNEN, rhsWOHNEN, (this.wohnen!= null), (that.wohnen!= null))) {
                return false;
            }
        }
        {
            Boolean lhsGEWERBE;
            lhsGEWERBE = this.getGEWERBE();
            Boolean rhsGEWERBE;
            rhsGEWERBE = that.getGEWERBE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gewerbe", lhsGEWERBE), LocatorUtils.property(thatLocator, "gewerbe", rhsGEWERBE), lhsGEWERBE, rhsGEWERBE, (this.gewerbe!= null), (that.gewerbe!= null))) {
                return false;
            }
        }
        {
            Boolean lhsANLAGE;
            lhsANLAGE = this.getANLAGE();
            Boolean rhsANLAGE;
            rhsANLAGE = that.getANLAGE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anlage", lhsANLAGE), LocatorUtils.property(thatLocator, "anlage", rhsANLAGE), lhsANLAGE, rhsANLAGE, (this.anlage!= null), (that.anlage!= null))) {
                return false;
            }
        }
        {
            Boolean lhsWAZ;
            lhsWAZ = this.getWAZ();
            Boolean rhsWAZ;
            rhsWAZ = that.getWAZ();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waz", lhsWAZ), LocatorUtils.property(thatLocator, "waz", rhsWAZ), lhsWAZ, rhsWAZ, (this.waz!= null), (that.waz!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }

}
