
package org.openestate.io.openimmo.xml;

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
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
public class Nutzungsart implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "WOHNEN", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected boolean wohnen;
    @XmlAttribute(name = "GEWERBE", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected boolean gewerbe;
    @XmlAttribute(name = "ANLAGE")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean anlage;
    @XmlAttribute(name = "WAZ")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean waz;

    /**
     * Gets the value of the wohnen property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public boolean isWOHNEN() {
        return wohnen;
    }

    /**
     * Sets the value of the wohnen property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setWOHNEN(boolean value) {
        this.wohnen = value;
    }

    /**
     * Gets the value of the gewerbe property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public boolean isGEWERBE() {
        return gewerbe;
    }

    /**
     * Sets the value of the gewerbe property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setGEWERBE(boolean value) {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setWAZ(Boolean value) {
        this.waz = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            boolean theWOHNEN;
            theWOHNEN = this.isWOHNEN();
            strategy.appendField(locator, this, "wohnen", buffer, theWOHNEN, true);
        }
        {
            boolean theGEWERBE;
            theGEWERBE = this.isGEWERBE();
            strategy.appendField(locator, this, "gewerbe", buffer, theGEWERBE, true);
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

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Nutzungsart) {
            final Nutzungsart copy = ((Nutzungsart) draftCopy);
            {
                Boolean wohnenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (wohnenShouldBeCopiedAndSet == Boolean.TRUE) {
                    boolean sourceWOHNEN;
                    sourceWOHNEN = this.isWOHNEN();
                    boolean copyWOHNEN = strategy.copy(LocatorUtils.property(locator, "wohnen", sourceWOHNEN), sourceWOHNEN, true);
                    copy.setWOHNEN(copyWOHNEN);
                } else {
                    if (wohnenShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
            {
                Boolean gewerbeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (gewerbeShouldBeCopiedAndSet == Boolean.TRUE) {
                    boolean sourceGEWERBE;
                    sourceGEWERBE = this.isGEWERBE();
                    boolean copyGEWERBE = strategy.copy(LocatorUtils.property(locator, "gewerbe", sourceGEWERBE), sourceGEWERBE, true);
                    copy.setGEWERBE(copyGEWERBE);
                } else {
                    if (gewerbeShouldBeCopiedAndSet == Boolean.FALSE) {
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

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Nutzungsart();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Nutzungsart that = ((Nutzungsart) object);
        {
            boolean lhsWOHNEN;
            lhsWOHNEN = this.isWOHNEN();
            boolean rhsWOHNEN;
            rhsWOHNEN = that.isWOHNEN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wohnen", lhsWOHNEN), LocatorUtils.property(thatLocator, "wohnen", rhsWOHNEN), lhsWOHNEN, rhsWOHNEN, true, true)) {
                return false;
            }
        }
        {
            boolean lhsGEWERBE;
            lhsGEWERBE = this.isGEWERBE();
            boolean rhsGEWERBE;
            rhsGEWERBE = that.isGEWERBE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gewerbe", lhsGEWERBE), LocatorUtils.property(thatLocator, "gewerbe", rhsGEWERBE), lhsGEWERBE, rhsGEWERBE, true, true)) {
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

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }

}
