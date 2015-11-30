
package org.openestate.io.openimmo.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
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
 * Java class for &lt;buero_praxen&gt; element.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "buero_praxen")
public class BueroPraxen
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "buero_typ")
    protected BueroPraxen.BueroTyp bueroTyp;

    /**
     * Gets the value of the bueroTyp property.
     *
     * @return
     *     possible object is
     *     {@link BueroPraxen.BueroTyp }
     *
     */
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
    public void setBueroTyp(BueroPraxen.BueroTyp value) {
        this.bueroTyp = value;
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
            BueroPraxen.BueroTyp theBueroTyp;
            theBueroTyp = this.getBueroTyp();
            strategy.appendField(locator, this, "bueroTyp", buffer, theBueroTyp);
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
        if (draftCopy instanceof BueroPraxen) {
            final BueroPraxen copy = ((BueroPraxen) draftCopy);
            if (this.bueroTyp!= null) {
                BueroPraxen.BueroTyp sourceBueroTyp;
                sourceBueroTyp = this.getBueroTyp();
                BueroPraxen.BueroTyp copyBueroTyp = ((BueroPraxen.BueroTyp) strategy.copy(LocatorUtils.property(locator, "bueroTyp", sourceBueroTyp), sourceBueroTyp));
                copy.setBueroTyp(copyBueroTyp);
            } else {
                copy.bueroTyp = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new BueroPraxen();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bueroTyp", lhsBueroTyp), LocatorUtils.property(thatLocator, "bueroTyp", rhsBueroTyp), lhsBueroTyp, rhsBueroTyp)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


    /**
     * Java enum for <em>buero_typ</em> attribute in &lt;buero_praxen&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
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