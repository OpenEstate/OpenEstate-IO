
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
 * Java class for &lt;zustand&gt; element.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "zustand")
public class Zustand
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "zustand_art")
    protected Zustand.ZustandArt zustandArt;

    /**
     * Gets the value of the zustandArt property.
     *
     * @return
     *     possible object is
     *     {@link Zustand.ZustandArt }
     *
     */
    public Zustand.ZustandArt getZustandArt() {
        return zustandArt;
    }

    /**
     * Sets the value of the zustandArt property.
     *
     * @param value
     *     allowed object is
     *     {@link Zustand.ZustandArt }
     *
     */
    public void setZustandArt(Zustand.ZustandArt value) {
        this.zustandArt = value;
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
            Zustand.ZustandArt theZustandArt;
            theZustandArt = this.getZustandArt();
            strategy.appendField(locator, this, "zustandArt", buffer, theZustandArt);
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
        if (draftCopy instanceof Zustand) {
            final Zustand copy = ((Zustand) draftCopy);
            if (this.zustandArt!= null) {
                Zustand.ZustandArt sourceZustandArt;
                sourceZustandArt = this.getZustandArt();
                Zustand.ZustandArt copyZustandArt = ((Zustand.ZustandArt) strategy.copy(LocatorUtils.property(locator, "zustandArt", sourceZustandArt), sourceZustandArt));
                copy.setZustandArt(copyZustandArt);
            } else {
                copy.zustandArt = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Zustand();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Zustand that = ((Zustand) object);
        {
            Zustand.ZustandArt lhsZustandArt;
            lhsZustandArt = this.getZustandArt();
            Zustand.ZustandArt rhsZustandArt;
            rhsZustandArt = that.getZustandArt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zustandArt", lhsZustandArt), LocatorUtils.property(thatLocator, "zustandArt", rhsZustandArt), lhsZustandArt, rhsZustandArt)) {
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
     * Java enum for <em>zustand</em> attribute in &lt;zustand_art&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum ZustandArt {

        ERSTBEZUG,
        TEIL_VOLLRENOVIERUNGSBED,
        NEUWERTIG,
        TEIL_VOLLSANIERT,
        TEIL_VOLLRENOVIERT,
        BAUFAELLIG,
        NACH_VEREINBARUNG,
        MODERNISIERT,
        GEPFLEGT,
        ROHBAU,
        ENTKERNT,
        ABRISSOBJEKT,
        PROJEKTIERT;

        public String value() {
            return name();
        }

        public static Zustand.ZustandArt fromValue(String v) {
            return valueOf(v);
        }

    }

}