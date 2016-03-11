
package org.openestate.io.openimmo.xml;

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
 * Java class for &lt;freizeitimmobilie_gewerblich&gt; element.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "freizeitimmobilie_gewerblich")
public class FreizeitimmobilieGewerblich implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "freizeit_typ")
    protected FreizeitimmobilieGewerblich.FreizeitTyp freizeitTyp;

    /**
     * Gets the value of the freizeitTyp property.
     *
     * @return
     *     possible object is
     *     {@link FreizeitimmobilieGewerblich.FreizeitTyp }
     *
     */
    public FreizeitimmobilieGewerblich.FreizeitTyp getFreizeitTyp() {
        return freizeitTyp;
    }

    /**
     * Sets the value of the freizeitTyp property.
     *
     * @param value
     *     allowed object is
     *     {@link FreizeitimmobilieGewerblich.FreizeitTyp }
     *
     */
    public void setFreizeitTyp(FreizeitimmobilieGewerblich.FreizeitTyp value) {
        this.freizeitTyp = value;
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
            FreizeitimmobilieGewerblich.FreizeitTyp theFreizeitTyp;
            theFreizeitTyp = this.getFreizeitTyp();
            strategy.appendField(locator, this, "freizeitTyp", buffer, theFreizeitTyp, (this.freizeitTyp!= null));
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
        if (draftCopy instanceof FreizeitimmobilieGewerblich) {
            final FreizeitimmobilieGewerblich copy = ((FreizeitimmobilieGewerblich) draftCopy);
            {
                Boolean freizeitTypShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.freizeitTyp!= null));
                if (freizeitTypShouldBeCopiedAndSet == Boolean.TRUE) {
                    FreizeitimmobilieGewerblich.FreizeitTyp sourceFreizeitTyp;
                    sourceFreizeitTyp = this.getFreizeitTyp();
                    FreizeitimmobilieGewerblich.FreizeitTyp copyFreizeitTyp = ((FreizeitimmobilieGewerblich.FreizeitTyp) strategy.copy(LocatorUtils.property(locator, "freizeitTyp", sourceFreizeitTyp), sourceFreizeitTyp, (this.freizeitTyp!= null)));
                    copy.setFreizeitTyp(copyFreizeitTyp);
                } else {
                    if (freizeitTypShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.freizeitTyp = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new FreizeitimmobilieGewerblich();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FreizeitimmobilieGewerblich that = ((FreizeitimmobilieGewerblich) object);
        {
            FreizeitimmobilieGewerblich.FreizeitTyp lhsFreizeitTyp;
            lhsFreizeitTyp = this.getFreizeitTyp();
            FreizeitimmobilieGewerblich.FreizeitTyp rhsFreizeitTyp;
            rhsFreizeitTyp = that.getFreizeitTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freizeitTyp", lhsFreizeitTyp), LocatorUtils.property(thatLocator, "freizeitTyp", rhsFreizeitTyp), lhsFreizeitTyp, rhsFreizeitTyp, (this.freizeitTyp!= null), (that.freizeitTyp!= null))) {
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
     * Java enum for <em>freizeit_typ</em> attribute in &lt;freizeitimmobilie_gewerblich&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum FreizeitTyp {

        SPORTANLAGEN,
        VERGNUEGUNGSPARKS_UND_CENTER,
        FREIZEITANLAGE;

        public String value() {
            return name();
        }

        public static FreizeitimmobilieGewerblich.FreizeitTyp fromValue(String v) {
            return valueOf(v);
        }

    }

}