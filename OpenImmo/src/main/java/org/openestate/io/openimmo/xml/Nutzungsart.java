
package org.openestate.io.openimmo.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 * Java class for &lt;nutzungsart&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "nutzungsart")
public class Nutzungsart
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "WOHNEN", required = true)
    protected boolean wohnen;
    @XmlAttribute(name = "GEWERBE", required = true)
    protected boolean gewerbe;
    @XmlAttribute(name = "ANLAGE")
    protected Boolean anlage;
    @XmlAttribute(name = "WAZ")
    protected Boolean waz;

    /**
     * Gets the value of the wohnen property.
     * 
     */
    public boolean isWOHNEN() {
        return wohnen;
    }

    /**
     * Sets the value of the wohnen property.
     * 
     */
    public void setWOHNEN(boolean value) {
        this.wohnen = value;
    }

    /**
     * Gets the value of the gewerbe property.
     * 
     */
    public boolean isGEWERBE() {
        return gewerbe;
    }

    /**
     * Sets the value of the gewerbe property.
     * 
     */
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
    public Boolean isANLAGE() {
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
    public Boolean isWAZ() {
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
    public void setWAZ(Boolean value) {
        this.waz = value;
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
            boolean theWOHNEN;
            theWOHNEN = this.isWOHNEN();
            strategy.appendField(locator, this, "wohnen", buffer, theWOHNEN);
        }
        {
            boolean theGEWERBE;
            theGEWERBE = this.isGEWERBE();
            strategy.appendField(locator, this, "gewerbe", buffer, theGEWERBE);
        }
        {
            Boolean theANLAGE;
            theANLAGE = this.isANLAGE();
            strategy.appendField(locator, this, "anlage", buffer, theANLAGE);
        }
        {
            Boolean theWAZ;
            theWAZ = this.isWAZ();
            strategy.appendField(locator, this, "waz", buffer, theWAZ);
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
        if (draftCopy instanceof Nutzungsart) {
            final Nutzungsart copy = ((Nutzungsart) draftCopy);
            {
                boolean sourceWOHNEN;
                sourceWOHNEN = this.isWOHNEN();
                boolean copyWOHNEN = strategy.copy(LocatorUtils.property(locator, "wohnen", sourceWOHNEN), sourceWOHNEN);
                copy.setWOHNEN(copyWOHNEN);
            }
            {
                boolean sourceGEWERBE;
                sourceGEWERBE = this.isGEWERBE();
                boolean copyGEWERBE = strategy.copy(LocatorUtils.property(locator, "gewerbe", sourceGEWERBE), sourceGEWERBE);
                copy.setGEWERBE(copyGEWERBE);
            }
            if (this.anlage!= null) {
                Boolean sourceANLAGE;
                sourceANLAGE = this.isANLAGE();
                Boolean copyANLAGE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "anlage", sourceANLAGE), sourceANLAGE));
                copy.setANLAGE(copyANLAGE);
            } else {
                copy.anlage = null;
            }
            if (this.waz!= null) {
                Boolean sourceWAZ;
                sourceWAZ = this.isWAZ();
                Boolean copyWAZ = ((Boolean) strategy.copy(LocatorUtils.property(locator, "waz", sourceWAZ), sourceWAZ));
                copy.setWAZ(copyWAZ);
            } else {
                copy.waz = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Nutzungsart();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wohnen", lhsWOHNEN), LocatorUtils.property(thatLocator, "wohnen", rhsWOHNEN), lhsWOHNEN, rhsWOHNEN)) {
                return false;
            }
        }
        {
            boolean lhsGEWERBE;
            lhsGEWERBE = this.isGEWERBE();
            boolean rhsGEWERBE;
            rhsGEWERBE = that.isGEWERBE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gewerbe", lhsGEWERBE), LocatorUtils.property(thatLocator, "gewerbe", rhsGEWERBE), lhsGEWERBE, rhsGEWERBE)) {
                return false;
            }
        }
        {
            Boolean lhsANLAGE;
            lhsANLAGE = this.isANLAGE();
            Boolean rhsANLAGE;
            rhsANLAGE = that.isANLAGE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anlage", lhsANLAGE), LocatorUtils.property(thatLocator, "anlage", rhsANLAGE), lhsANLAGE, rhsANLAGE)) {
                return false;
            }
        }
        {
            Boolean lhsWAZ;
            lhsWAZ = this.isWAZ();
            Boolean rhsWAZ;
            rhsWAZ = that.isWAZ();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waz", lhsWAZ), LocatorUtils.property(thatLocator, "waz", rhsWAZ), lhsWAZ, rhsWAZ)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
