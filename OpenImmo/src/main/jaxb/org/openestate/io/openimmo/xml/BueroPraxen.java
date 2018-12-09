
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
 * Java class for &lt;buero_praxen&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "buero_praxen")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
public class BueroPraxen implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "buero_typ")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected BueroPraxen.BueroTyp bueroTyp;

    /**
     * Gets the value of the bueroTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BueroPraxen.BueroTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public BueroPraxen.BueroTyp getBueroTyp() {
        return bueroTyp;
    }

    /**
     * Sets the value of the bueroTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BueroPraxen.BueroTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setBueroTyp(BueroPraxen.BueroTyp value) {
        this.bueroTyp = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            BueroPraxen.BueroTyp theBueroTyp;
            theBueroTyp = this.getBueroTyp();
            strategy.appendField(locator, this, "bueroTyp", buffer, theBueroTyp, (this.bueroTyp!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof BueroPraxen) {
            final BueroPraxen copy = ((BueroPraxen) draftCopy);
            {
                Boolean bueroTypShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bueroTyp!= null));
                if (bueroTypShouldBeCopiedAndSet == Boolean.TRUE) {
                    BueroPraxen.BueroTyp sourceBueroTyp;
                    sourceBueroTyp = this.getBueroTyp();
                    BueroPraxen.BueroTyp copyBueroTyp = ((BueroPraxen.BueroTyp) strategy.copy(LocatorUtils.property(locator, "bueroTyp", sourceBueroTyp), sourceBueroTyp, (this.bueroTyp!= null)));
                    copy.setBueroTyp(copyBueroTyp);
                } else {
                    if (bueroTypShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bueroTyp = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new BueroPraxen();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BueroPraxen that = ((BueroPraxen) object);
        {
            BueroPraxen.BueroTyp lhsBueroTyp;
            lhsBueroTyp = this.getBueroTyp();
            BueroPraxen.BueroTyp rhsBueroTyp;
            rhsBueroTyp = that.getBueroTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bueroTyp", lhsBueroTyp), LocatorUtils.property(thatLocator, "bueroTyp", rhsBueroTyp), lhsBueroTyp, rhsBueroTyp, (this.bueroTyp!= null), (that.bueroTyp!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


    /**
     * 
     *                     Java enum for <em>buero_typ</em> attribute in &lt;buero_praxen&gt; elements.
     * 
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="BUEROFLAECHE"/&gt;
     *     &lt;enumeration value="BUEROHAUS"/&gt;
     *     &lt;enumeration value="BUEROZENTRUM"/&gt;
     *     &lt;enumeration value="LOFT_ATELIER"/&gt;
     *     &lt;enumeration value="PRAXIS"/&gt;
     *     &lt;enumeration value="PRAXISFLAECHE"/&gt;
     *     &lt;enumeration value="PRAXISHAUS"/&gt;
     *     &lt;enumeration value="AUSSTELLUNGSFLAECHE"/&gt;
     *     &lt;enumeration value="COWORKING"/&gt;
     *     &lt;enumeration value="SHARED_OFFICE"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public enum BueroTyp {

        BUEROFLAECHE,
        BUEROHAUS,
        BUEROZENTRUM,
        LOFT_ATELIER,
        PRAXIS,
        PRAXISFLAECHE,
        PRAXISHAUS,
        AUSSTELLUNGSFLAECHE,
        COWORKING,
        SHARED_OFFICE;

        public String value() {
            return name();
        }

        public static BueroPraxen.BueroTyp fromValue(String v) {
            return valueOf(v);
        }

    }

}
