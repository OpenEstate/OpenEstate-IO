
package org.openestate.io.immoxml.xml;

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
 * Java class for &lt;sonstige&gt; element.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "sonstige")
public class Sonstige
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "sonstige_typ")
    protected Sonstige.SonstigeTyp sonstigeTyp;

    /**
     * Gets the value of the sonstigeTyp property.
     *
     * @return
     *     possible object is
     *     {@link Sonstige.SonstigeTyp }
     *
     */
    public Sonstige.SonstigeTyp getSonstigeTyp() {
        return sonstigeTyp;
    }

    /**
     * Sets the value of the sonstigeTyp property.
     *
     * @param value
     *     allowed object is
     *     {@link Sonstige.SonstigeTyp }
     *
     */
    public void setSonstigeTyp(Sonstige.SonstigeTyp value) {
        this.sonstigeTyp = value;
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
            Sonstige.SonstigeTyp theSonstigeTyp;
            theSonstigeTyp = this.getSonstigeTyp();
            strategy.appendField(locator, this, "sonstigeTyp", buffer, theSonstigeTyp);
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
        if (draftCopy instanceof Sonstige) {
            final Sonstige copy = ((Sonstige) draftCopy);
            if (this.sonstigeTyp!= null) {
                Sonstige.SonstigeTyp sourceSonstigeTyp;
                sourceSonstigeTyp = this.getSonstigeTyp();
                Sonstige.SonstigeTyp copySonstigeTyp = ((Sonstige.SonstigeTyp) strategy.copy(LocatorUtils.property(locator, "sonstigeTyp", sourceSonstigeTyp), sourceSonstigeTyp));
                copy.setSonstigeTyp(copySonstigeTyp);
            } else {
                copy.sonstigeTyp = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Sonstige();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Sonstige that = ((Sonstige) object);
        {
            Sonstige.SonstigeTyp lhsSonstigeTyp;
            lhsSonstigeTyp = this.getSonstigeTyp();
            Sonstige.SonstigeTyp rhsSonstigeTyp;
            rhsSonstigeTyp = that.getSonstigeTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sonstigeTyp", lhsSonstigeTyp), LocatorUtils.property(thatLocator, "sonstigeTyp", rhsSonstigeTyp), lhsSonstigeTyp, rhsSonstigeTyp)) {
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
     * Java enum for <em>sonstige_typ</em> attribute in &lt;sonstige&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum SonstigeTyp {

        PARKHAUS,
        TANKSTELLE,
        GARAGEN,
        PARKFLACHE,
        SONSTIGE;

        public String value() {
            return name();
        }

        public static Sonstige.SonstigeTyp fromValue(String v) {
            return valueOf(v);
        }

    }

}