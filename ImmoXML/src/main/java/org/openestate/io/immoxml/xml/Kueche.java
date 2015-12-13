
package org.openestate.io.immoxml.xml;

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
 * Java class for &lt;kueche&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "kueche")
public class Kueche
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "EBK")
    protected Boolean ebk;
    @XmlAttribute(name = "OFFEN")
    protected Boolean offen;

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
            Boolean theEBK;
            theEBK = this.isEBK();
            strategy.appendField(locator, this, "ebk", buffer, theEBK);
        }
        {
            Boolean theOFFEN;
            theOFFEN = this.isOFFEN();
            strategy.appendField(locator, this, "offen", buffer, theOFFEN);
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
        if (draftCopy instanceof Kueche) {
            final Kueche copy = ((Kueche) draftCopy);
            if (this.ebk!= null) {
                Boolean sourceEBK;
                sourceEBK = this.isEBK();
                Boolean copyEBK = ((Boolean) strategy.copy(LocatorUtils.property(locator, "ebk", sourceEBK), sourceEBK));
                copy.setEBK(copyEBK);
            } else {
                copy.ebk = null;
            }
            if (this.offen!= null) {
                Boolean sourceOFFEN;
                sourceOFFEN = this.isOFFEN();
                Boolean copyOFFEN = ((Boolean) strategy.copy(LocatorUtils.property(locator, "offen", sourceOFFEN), sourceOFFEN));
                copy.setOFFEN(copyOFFEN);
            } else {
                copy.offen = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Kueche();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ebk", lhsEBK), LocatorUtils.property(thatLocator, "ebk", rhsEBK), lhsEBK, rhsEBK)) {
                return false;
            }
        }
        {
            Boolean lhsOFFEN;
            lhsOFFEN = this.isOFFEN();
            Boolean rhsOFFEN;
            rhsOFFEN = that.isOFFEN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "offen", lhsOFFEN), LocatorUtils.property(thatLocator, "offen", rhsOFFEN), lhsOFFEN, rhsOFFEN)) {
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
