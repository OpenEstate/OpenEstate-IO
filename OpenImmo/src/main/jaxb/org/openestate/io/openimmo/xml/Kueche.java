
package org.openestate.io.openimmo.xml;

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
 * Java class for &lt;kueche&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "kueche")
public class Kueche implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "EBK")
    protected Boolean ebk;
    @XmlAttribute(name = "OFFEN")
    protected Boolean offen;
    @XmlAttribute(name = "PANTRY")
    protected Boolean pantry;

    /**
     * Gets the value of the ebk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEBK() {
        return ebk;
    }

    /**
     * Sets the value of the ebk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEBK(Boolean value) {
        this.ebk = value;
    }

    /**
     * Gets the value of the offen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOFFEN() {
        return offen;
    }

    /**
     * Sets the value of the offen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOFFEN(Boolean value) {
        this.offen = value;
    }

    /**
     * Gets the value of the pantry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPANTRY() {
        return pantry;
    }

    /**
     * Sets the value of the pantry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPANTRY(Boolean value) {
        this.pantry = value;
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
            Boolean theEBK;
            theEBK = this.isEBK();
            strategy.appendField(locator, this, "ebk", buffer, theEBK, (this.ebk!= null));
        }
        {
            Boolean theOFFEN;
            theOFFEN = this.isOFFEN();
            strategy.appendField(locator, this, "offen", buffer, theOFFEN, (this.offen!= null));
        }
        {
            Boolean thePANTRY;
            thePANTRY = this.isPANTRY();
            strategy.appendField(locator, this, "pantry", buffer, thePANTRY, (this.pantry!= null));
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
        if (draftCopy instanceof Kueche) {
            final Kueche copy = ((Kueche) draftCopy);
            {
                Boolean ebkShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ebk!= null));
                if (ebkShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceEBK;
                    sourceEBK = this.isEBK();
                    Boolean copyEBK = ((Boolean) strategy.copy(LocatorUtils.property(locator, "ebk", sourceEBK), sourceEBK, (this.ebk!= null)));
                    copy.setEBK(copyEBK);
                } else {
                    if (ebkShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ebk = null;
                    }
                }
            }
            {
                Boolean offenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.offen!= null));
                if (offenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceOFFEN;
                    sourceOFFEN = this.isOFFEN();
                    Boolean copyOFFEN = ((Boolean) strategy.copy(LocatorUtils.property(locator, "offen", sourceOFFEN), sourceOFFEN, (this.offen!= null)));
                    copy.setOFFEN(copyOFFEN);
                } else {
                    if (offenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.offen = null;
                    }
                }
            }
            {
                Boolean pantryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pantry!= null));
                if (pantryShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourcePANTRY;
                    sourcePANTRY = this.isPANTRY();
                    Boolean copyPANTRY = ((Boolean) strategy.copy(LocatorUtils.property(locator, "pantry", sourcePANTRY), sourcePANTRY, (this.pantry!= null)));
                    copy.setPANTRY(copyPANTRY);
                } else {
                    if (pantryShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pantry = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Kueche();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Kueche that = ((Kueche) object);
        {
            Boolean lhsEBK;
            lhsEBK = this.isEBK();
            Boolean rhsEBK;
            rhsEBK = that.isEBK();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ebk", lhsEBK), LocatorUtils.property(thatLocator, "ebk", rhsEBK), lhsEBK, rhsEBK, (this.ebk!= null), (that.ebk!= null))) {
                return false;
            }
        }
        {
            Boolean lhsOFFEN;
            lhsOFFEN = this.isOFFEN();
            Boolean rhsOFFEN;
            rhsOFFEN = that.isOFFEN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "offen", lhsOFFEN), LocatorUtils.property(thatLocator, "offen", rhsOFFEN), lhsOFFEN, rhsOFFEN, (this.offen!= null), (that.offen!= null))) {
                return false;
            }
        }
        {
            Boolean lhsPANTRY;
            lhsPANTRY = this.isPANTRY();
            Boolean rhsPANTRY;
            rhsPANTRY = that.isPANTRY();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pantry", lhsPANTRY), LocatorUtils.property(thatLocator, "pantry", rhsPANTRY), lhsPANTRY, rhsPANTRY, (this.pantry!= null), (that.pantry!= null))) {
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
