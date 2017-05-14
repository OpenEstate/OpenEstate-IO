
package org.openestate.io.openimmo.xml;

import java.io.Serializable;
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

    @XmlAttribute(name = "moeb")
    protected Moebliert.Moeb moeb;

    /**
     * Gets the value of the moeb property.
     *
     * @return
     *     possible object is
     *     {@link Moebliert.Moeb }
     *
     */
    public Moebliert.Moeb getMoeb() {
        return moeb;
    }

    /**
     * Sets the value of the moeb property.
     *
     * @param value
     *     allowed object is
     *     {@link Moebliert.Moeb }
     *
     */
    public void setMoeb(Moebliert.Moeb value) {
        this.moeb = value;
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
            Moebliert.Moeb theMoeb;
            theMoeb = this.getMoeb();
            strategy.appendField(locator, this, "moeb", buffer, theMoeb, (this.moeb!= null));
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
                Boolean moebShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.moeb!= null));
                if (moebShouldBeCopiedAndSet == Boolean.TRUE) {
                    Moebliert.Moeb sourceMoeb;
                    sourceMoeb = this.getMoeb();
                    Moebliert.Moeb copyMoeb = ((Moebliert.Moeb) strategy.copy(LocatorUtils.property(locator, "moeb", sourceMoeb), sourceMoeb, (this.moeb!= null)));
                    copy.setMoeb(copyMoeb);
                } else {
                    if (moebShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.moeb = null;
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
            Moebliert.Moeb lhsMoeb;
            lhsMoeb = this.getMoeb();
            Moebliert.Moeb rhsMoeb;
            rhsMoeb = that.getMoeb();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "moeb", lhsMoeb), LocatorUtils.property(thatLocator, "moeb", rhsMoeb), lhsMoeb, rhsMoeb, (this.moeb!= null), (that.moeb!= null))) {
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
     * Java enum for <em>moeb</em> attribute in &lt;moebliert&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum Moeb {

        VOLL,
        TEIL;

        public String value() {
            return name();
        }

        public static Moebliert.Moeb fromValue(String v) {
            return valueOf(v);
        }

    }

}