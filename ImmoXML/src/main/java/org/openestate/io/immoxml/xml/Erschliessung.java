
package org.openestate.io.immoxml.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
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
 * Java class for &lt;erschliessung&gt; element.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "erschliessung")
public class Erschliessung implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "erschl_attr")
    protected Erschliessung.ErschlAttr erschlAttr;

    /**
     * Gets the value of the erschlAttr property.
     *
     * @return
     *     possible object is
     *     {@link Erschliessung.ErschlAttr }
     *
     */
    public Erschliessung.ErschlAttr getErschlAttr() {
        return erschlAttr;
    }

    /**
     * Sets the value of the erschlAttr property.
     *
     * @param value
     *     allowed object is
     *     {@link Erschliessung.ErschlAttr }
     *
     */
    public void setErschlAttr(Erschliessung.ErschlAttr value) {
        this.erschlAttr = value;
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
            Erschliessung.ErschlAttr theErschlAttr;
            theErschlAttr = this.getErschlAttr();
            strategy.appendField(locator, this, "erschlAttr", buffer, theErschlAttr, (this.erschlAttr!= null));
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
        if (draftCopy instanceof Erschliessung) {
            final Erschliessung copy = ((Erschliessung) draftCopy);
            {
                Boolean erschlAttrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.erschlAttr!= null));
                if (erschlAttrShouldBeCopiedAndSet == Boolean.TRUE) {
                    Erschliessung.ErschlAttr sourceErschlAttr;
                    sourceErschlAttr = this.getErschlAttr();
                    Erschliessung.ErschlAttr copyErschlAttr = ((Erschliessung.ErschlAttr) strategy.copy(LocatorUtils.property(locator, "erschlAttr", sourceErschlAttr), sourceErschlAttr, (this.erschlAttr!= null)));
                    copy.setErschlAttr(copyErschlAttr);
                } else {
                    if (erschlAttrShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.erschlAttr = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Erschliessung();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Erschliessung that = ((Erschliessung) object);
        {
            Erschliessung.ErschlAttr lhsErschlAttr;
            lhsErschlAttr = this.getErschlAttr();
            Erschliessung.ErschlAttr rhsErschlAttr;
            rhsErschlAttr = that.getErschlAttr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erschlAttr", lhsErschlAttr), LocatorUtils.property(thatLocator, "erschlAttr", rhsErschlAttr), lhsErschlAttr, rhsErschlAttr, (this.erschlAttr!= null), (that.erschlAttr!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


    /**
     * Java enum for <em>erschl_attr</em> attribute in &lt;erschliessung&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum ErschlAttr {

        UNERSCHLOSSEN,
        TEILERSCHLOSSEN,
        VOLLERSCHLOSSEN;

        public String value() {
            return name();
        }

        public static Erschliessung.ErschlAttr fromValue(String v) {
            return valueOf(v);
        }

    }

}