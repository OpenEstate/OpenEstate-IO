
package org.openestate.io.openimmo.xml;

import java.io.Serializable;
import javax.annotation.Generated;
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
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
public class FreizeitimmobilieGewerblich implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "freizeit_typ")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected FreizeitimmobilieGewerblich.FreizeitTyp freizeitTyp;

    /**
     * Gets the value of the freizeitTyp property.
     * 
     * @return
     *     possible object is
     *     {@link FreizeitimmobilieGewerblich.FreizeitTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setFreizeitTyp(FreizeitimmobilieGewerblich.FreizeitTyp value) {
        this.freizeitTyp = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            FreizeitimmobilieGewerblich.FreizeitTyp theFreizeitTyp;
            theFreizeitTyp = this.getFreizeitTyp();
            strategy.appendField(locator, this, "freizeitTyp", buffer, theFreizeitTyp, (this.freizeitTyp!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new FreizeitimmobilieGewerblich();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }


    /**
     * 
     *                     Java enum for <em>freizeit_typ</em> attribute in &lt;freizeitimmobilie_gewerblich&gt; elements.
     * 
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="SPORTANLAGEN"/&gt;
     *     &lt;enumeration value="VERGNUEGUNGSPARKS_UND_CENTER"/&gt;
     *     &lt;enumeration value="FREIZEITANLAGE"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
