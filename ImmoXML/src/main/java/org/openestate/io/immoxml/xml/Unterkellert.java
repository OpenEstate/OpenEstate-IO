
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
 * Java class for &lt;unterkellert&gt; element.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "unterkellert")
public class Unterkellert implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "keller")
    protected Unterkellert.Keller keller;

    /**
     * Gets the value of the keller property.
     *
     * @return
     *     possible object is
     *     {@link Unterkellert.Keller }
     *
     */
    public Unterkellert.Keller getKeller() {
        return keller;
    }

    /**
     * Sets the value of the keller property.
     *
     * @param value
     *     allowed object is
     *     {@link Unterkellert.Keller }
     *
     */
    public void setKeller(Unterkellert.Keller value) {
        this.keller = value;
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
            Unterkellert.Keller theKeller;
            theKeller = this.getKeller();
            strategy.appendField(locator, this, "keller", buffer, theKeller, (this.keller!= null));
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
        if (draftCopy instanceof Unterkellert) {
            final Unterkellert copy = ((Unterkellert) draftCopy);
            {
                Boolean kellerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.keller!= null));
                if (kellerShouldBeCopiedAndSet == Boolean.TRUE) {
                    Unterkellert.Keller sourceKeller;
                    sourceKeller = this.getKeller();
                    Unterkellert.Keller copyKeller = ((Unterkellert.Keller) strategy.copy(LocatorUtils.property(locator, "keller", sourceKeller), sourceKeller, (this.keller!= null)));
                    copy.setKeller(copyKeller);
                } else {
                    if (kellerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.keller = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Unterkellert();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Unterkellert that = ((Unterkellert) object);
        {
            Unterkellert.Keller lhsKeller;
            lhsKeller = this.getKeller();
            Unterkellert.Keller rhsKeller;
            rhsKeller = that.getKeller();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "keller", lhsKeller), LocatorUtils.property(thatLocator, "keller", rhsKeller), lhsKeller, rhsKeller, (this.keller!= null), (that.keller!= null))) {
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
     * Java enum for <em>keller</em> attribute in &lt;unterkellert&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum Keller {

        JA,
        NEIN,
        TEIL;

        public String value() {
            return name();
        }

        public static Unterkellert.Keller fromValue(String v) {
            return valueOf(v);
        }

    }

}