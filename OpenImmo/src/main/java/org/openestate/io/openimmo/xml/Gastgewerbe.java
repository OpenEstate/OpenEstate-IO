
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
 * Java class for &lt;gastgewerbe&gt; element.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "gastgewerbe")
public class Gastgewerbe
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "gastgew_typ")
    protected Gastgewerbe.GastgewTyp gastgewTyp;

    /**
     * Gets the value of the gastgewTyp property.
     *
     * @return
     *     possible object is
     *     {@link Gastgewerbe.GastgewTyp }
     *
     */
    public Gastgewerbe.GastgewTyp getGastgewTyp() {
        return gastgewTyp;
    }

    /**
     * Sets the value of the gastgewTyp property.
     *
     * @param value
     *     allowed object is
     *     {@link Gastgewerbe.GastgewTyp }
     *
     */
    public void setGastgewTyp(Gastgewerbe.GastgewTyp value) {
        this.gastgewTyp = value;
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
            Gastgewerbe.GastgewTyp theGastgewTyp;
            theGastgewTyp = this.getGastgewTyp();
            strategy.appendField(locator, this, "gastgewTyp", buffer, theGastgewTyp);
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
        if (draftCopy instanceof Gastgewerbe) {
            final Gastgewerbe copy = ((Gastgewerbe) draftCopy);
            if (this.gastgewTyp!= null) {
                Gastgewerbe.GastgewTyp sourceGastgewTyp;
                sourceGastgewTyp = this.getGastgewTyp();
                Gastgewerbe.GastgewTyp copyGastgewTyp = ((Gastgewerbe.GastgewTyp) strategy.copy(LocatorUtils.property(locator, "gastgewTyp", sourceGastgewTyp), sourceGastgewTyp));
                copy.setGastgewTyp(copyGastgewTyp);
            } else {
                copy.gastgewTyp = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Gastgewerbe();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Gastgewerbe that = ((Gastgewerbe) object);
        {
            Gastgewerbe.GastgewTyp lhsGastgewTyp;
            lhsGastgewTyp = this.getGastgewTyp();
            Gastgewerbe.GastgewTyp rhsGastgewTyp;
            rhsGastgewTyp = that.getGastgewTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gastgewTyp", lhsGastgewTyp), LocatorUtils.property(thatLocator, "gastgewTyp", rhsGastgewTyp), lhsGastgewTyp, rhsGastgewTyp)) {
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
     * Java enum for <em>gastgew_typ</em> attribute in &lt;gastgewerbe&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum GastgewTyp {

        GASTRONOMIE,
        GASTRONOMIE_UND_WOHNUNG,
        PENSIONEN,
        HOTELS,
        WEITERE_BEHERBERGUNGSBETRIEBE,
        BAR,
        CAFE,
        DISCOTHEK,
        RESTAURANT,
        RAUCHERLOKAL,
        EINRAUMLOKAL;

        public String value() {
            return name();
        }

        public static Gastgewerbe.GastgewTyp fromValue(String v) {
            return valueOf(v);
        }

    }

}