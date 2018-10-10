
package org.openestate.io.immoxml.xml;

import java.io.Serializable;
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
public class Moebliert implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "VOLL")
    protected Boolean voll;
    @XmlAttribute(name = "TEIL")
    protected Boolean teil;

    /**
     * Gets the value of the voll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVOLL() {
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
    public Boolean isTEIL() {
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
    public void setTEIL(Boolean value) {
        this.teil = value;
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
            Boolean theVOLL;
            theVOLL = this.isVOLL();
            strategy.appendField(locator, this, "voll", buffer, theVOLL, (this.voll!= null));
        }
        {
            Boolean theTEIL;
            theTEIL = this.isTEIL();
            strategy.appendField(locator, this, "teil", buffer, theTEIL, (this.teil!= null));
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
        if (draftCopy instanceof Moebliert) {
            final Moebliert copy = ((Moebliert) draftCopy);
            {
                Boolean vollShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.voll!= null));
                if (vollShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceVOLL;
                    sourceVOLL = this.isVOLL();
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
                    sourceTEIL = this.isTEIL();
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

    public Object createNewInstance() {
        return new Moebliert();
    }

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
            lhsVOLL = this.isVOLL();
            Boolean rhsVOLL;
            rhsVOLL = that.isVOLL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "voll", lhsVOLL), LocatorUtils.property(thatLocator, "voll", rhsVOLL), lhsVOLL, rhsVOLL, (this.voll!= null), (that.voll!= null))) {
                return false;
            }
        }
        {
            Boolean lhsTEIL;
            lhsTEIL = this.isTEIL();
            Boolean rhsTEIL;
            rhsTEIL = that.isTEIL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "teil", lhsTEIL), LocatorUtils.property(thatLocator, "teil", rhsTEIL), lhsTEIL, rhsTEIL, (this.teil!= null), (that.teil!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
