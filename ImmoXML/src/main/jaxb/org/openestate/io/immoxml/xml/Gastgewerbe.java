
package org.openestate.io.immoxml.xml;

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
 * Java class for &lt;gastgewerbe&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "gastgewerbe")
public class Gastgewerbe implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
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
            Gastgewerbe.GastgewTyp theGastgewTyp;
            theGastgewTyp = this.getGastgewTyp();
            strategy.appendField(locator, this, "gastgewTyp", buffer, theGastgewTyp, (this.gastgewTyp!= null));
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
        if (draftCopy instanceof Gastgewerbe) {
            final Gastgewerbe copy = ((Gastgewerbe) draftCopy);
            {
                Boolean gastgewTypShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gastgewTyp!= null));
                if (gastgewTypShouldBeCopiedAndSet == Boolean.TRUE) {
                    Gastgewerbe.GastgewTyp sourceGastgewTyp;
                    sourceGastgewTyp = this.getGastgewTyp();
                    Gastgewerbe.GastgewTyp copyGastgewTyp = ((Gastgewerbe.GastgewTyp) strategy.copy(LocatorUtils.property(locator, "gastgewTyp", sourceGastgewTyp), sourceGastgewTyp, (this.gastgewTyp!= null)));
                    copy.setGastgewTyp(copyGastgewTyp);
                } else {
                    if (gastgewTypShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gastgewTyp = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Gastgewerbe();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gastgewTyp", lhsGastgewTyp), LocatorUtils.property(thatLocator, "gastgewTyp", rhsGastgewTyp), lhsGastgewTyp, rhsGastgewTyp, (this.gastgewTyp!= null), (that.gastgewTyp!= null))) {
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
     * 
     *                     Java enum for <em>gastgew_typ</em> attribute in &lt;gastgewerbe&gt; elements.
     * 
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="GASTRONOMIE"/&gt;
     *     &lt;enumeration value="GASTRONOMIE_UND_WOHNUNG"/&gt;
     *     &lt;enumeration value="PENSIONEN"/&gt;
     *     &lt;enumeration value="HOTELS"/&gt;
     *     &lt;enumeration value="WEITERE_BEHERBERGUNGSBETRIEBE"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum GastgewTyp {

        GASTRONOMIE,
        GASTRONOMIE_UND_WOHNUNG,
        PENSIONEN,
        HOTELS,
        WEITERE_BEHERBERGUNGSBETRIEBE;

        public String value() {
            return name();
        }

        public static Gastgewerbe.GastgewTyp fromValue(String v) {
            return valueOf(v);
        }

    }

}
