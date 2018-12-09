
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
 * Java class for &lt;moebliert&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "moebliert")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
public class Moebliert implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "VOLL")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean voll;
    @XmlAttribute(name = "TEIL")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean teil;

    /**
     * Gets the value of the voll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getVOLL() {
        return voll;
    }

    /**
     * Sets the value of the voll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setVOLL(Boolean value) {
        this.voll = value;
    }

    /**
     * Gets the value of the teil property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getTEIL() {
        return teil;
    }

    /**
     * Sets the value of the teil property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setTEIL(Boolean value) {
        this.teil = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            Boolean theVOLL;
            theVOLL = this.getVOLL();
            strategy.appendField(locator, this, "voll", buffer, theVOLL, (this.voll!= null));
        }
        {
            Boolean theTEIL;
            theTEIL = this.getTEIL();
            strategy.appendField(locator, this, "teil", buffer, theTEIL, (this.teil!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Moebliert) {
            final Moebliert copy = ((Moebliert) draftCopy);
            {
                Boolean vollShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.voll!= null));
                if (vollShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceVOLL;
                    sourceVOLL = this.getVOLL();
                    Boolean copyVOLL = ((Boolean) strategy.copy(LocatorUtils.property(locator, "voll", sourceVOLL), sourceVOLL, (this.voll!= null)));
                    copy.setVOLL(copyVOLL);
                } else {
                    if (vollShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.voll = null;
                    }
                }
            }
            {
                Boolean teilShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.teil!= null));
                if (teilShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceTEIL;
                    sourceTEIL = this.getTEIL();
                    Boolean copyTEIL = ((Boolean) strategy.copy(LocatorUtils.property(locator, "teil", sourceTEIL), sourceTEIL, (this.teil!= null)));
                    copy.setTEIL(copyTEIL);
                } else {
                    if (teilShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.teil = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new Moebliert();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Moebliert that = ((Moebliert) object);
        {
            Boolean lhsVOLL;
            lhsVOLL = this.getVOLL();
            Boolean rhsVOLL;
            rhsVOLL = that.getVOLL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "voll", lhsVOLL), LocatorUtils.property(thatLocator, "voll", rhsVOLL), lhsVOLL, rhsVOLL, (this.voll!= null), (that.voll!= null))) {
                return false;
            }
        }
        {
            Boolean lhsTEIL;
            lhsTEIL = this.getTEIL();
            Boolean rhsTEIL;
            rhsTEIL = that.getTEIL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "teil", lhsTEIL), LocatorUtils.property(thatLocator, "teil", rhsTEIL), lhsTEIL, rhsTEIL, (this.teil!= null), (that.teil!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
