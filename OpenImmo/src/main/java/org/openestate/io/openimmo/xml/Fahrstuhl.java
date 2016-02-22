
package org.openestate.io.openimmo.xml;

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
 * Java class for &lt;fahrstuhl&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "fahrstuhl")
public class Fahrstuhl implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "PERSONEN")
    protected Boolean personen;
    @XmlAttribute(name = "LASTEN")
    protected Boolean lasten;

    /**
     * Gets the value of the personen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPERSONEN() {
        return personen;
    }

    /**
     * Sets the value of the personen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPERSONEN(Boolean value) {
        this.personen = value;
    }

    /**
     * Gets the value of the lasten property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLASTEN() {
        return lasten;
    }

    /**
     * Sets the value of the lasten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLASTEN(Boolean value) {
        this.lasten = value;
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
            Boolean thePERSONEN;
            thePERSONEN = this.isPERSONEN();
            strategy.appendField(locator, this, "personen", buffer, thePERSONEN, (this.personen!= null));
        }
        {
            Boolean theLASTEN;
            theLASTEN = this.isLASTEN();
            strategy.appendField(locator, this, "lasten", buffer, theLASTEN, (this.lasten!= null));
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
        if (draftCopy instanceof Fahrstuhl) {
            final Fahrstuhl copy = ((Fahrstuhl) draftCopy);
            {
                Boolean personenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.personen!= null));
                if (personenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourcePERSONEN;
                    sourcePERSONEN = this.isPERSONEN();
                    Boolean copyPERSONEN = ((Boolean) strategy.copy(LocatorUtils.property(locator, "personen", sourcePERSONEN), sourcePERSONEN, (this.personen!= null)));
                    copy.setPERSONEN(copyPERSONEN);
                } else {
                    if (personenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.personen = null;
                    }
                }
            }
            {
                Boolean lastenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lasten!= null));
                if (lastenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceLASTEN;
                    sourceLASTEN = this.isLASTEN();
                    Boolean copyLASTEN = ((Boolean) strategy.copy(LocatorUtils.property(locator, "lasten", sourceLASTEN), sourceLASTEN, (this.lasten!= null)));
                    copy.setLASTEN(copyLASTEN);
                } else {
                    if (lastenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lasten = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Fahrstuhl();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Fahrstuhl that = ((Fahrstuhl) object);
        {
            Boolean lhsPERSONEN;
            lhsPERSONEN = this.isPERSONEN();
            Boolean rhsPERSONEN;
            rhsPERSONEN = that.isPERSONEN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "personen", lhsPERSONEN), LocatorUtils.property(thatLocator, "personen", rhsPERSONEN), lhsPERSONEN, rhsPERSONEN, (this.personen!= null), (that.personen!= null))) {
                return false;
            }
        }
        {
            Boolean lhsLASTEN;
            lhsLASTEN = this.isLASTEN();
            Boolean rhsLASTEN;
            rhsLASTEN = that.isLASTEN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lasten", lhsLASTEN), LocatorUtils.property(thatLocator, "lasten", rhsLASTEN), lhsLASTEN, rhsLASTEN, (this.lasten!= null), (that.lasten!= null))) {
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
