
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
 * Java class for &lt;parken&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "parken")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
public class Parken implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "parken_typ")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected Parken.ParkenTyp parkenTyp;

    /**
     * Gets the value of the parkenTyp property.
     * 
     * @return
     *     possible object is
     *     {@link Parken.ParkenTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Parken.ParkenTyp getParkenTyp() {
        return parkenTyp;
    }

    /**
     * Sets the value of the parkenTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parken.ParkenTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setParkenTyp(Parken.ParkenTyp value) {
        this.parkenTyp = value;
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
            Parken.ParkenTyp theParkenTyp;
            theParkenTyp = this.getParkenTyp();
            strategy.appendField(locator, this, "parkenTyp", buffer, theParkenTyp, (this.parkenTyp!= null));
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
        if (draftCopy instanceof Parken) {
            final Parken copy = ((Parken) draftCopy);
            {
                Boolean parkenTypShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.parkenTyp!= null));
                if (parkenTypShouldBeCopiedAndSet == Boolean.TRUE) {
                    Parken.ParkenTyp sourceParkenTyp;
                    sourceParkenTyp = this.getParkenTyp();
                    Parken.ParkenTyp copyParkenTyp = ((Parken.ParkenTyp) strategy.copy(LocatorUtils.property(locator, "parkenTyp", sourceParkenTyp), sourceParkenTyp, (this.parkenTyp!= null)));
                    copy.setParkenTyp(copyParkenTyp);
                } else {
                    if (parkenTypShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.parkenTyp = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new Parken();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Parken that = ((Parken) object);
        {
            Parken.ParkenTyp lhsParkenTyp;
            lhsParkenTyp = this.getParkenTyp();
            Parken.ParkenTyp rhsParkenTyp;
            rhsParkenTyp = that.getParkenTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parkenTyp", lhsParkenTyp), LocatorUtils.property(thatLocator, "parkenTyp", rhsParkenTyp), lhsParkenTyp, rhsParkenTyp, (this.parkenTyp!= null), (that.parkenTyp!= null))) {
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
     *                     Java enum for <em>parken_typ</em> attribute in &lt;parken&gt; elements.
     * 
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="STELLPLATZ"/&gt;
     *     &lt;enumeration value="CARPORT"/&gt;
     *     &lt;enumeration value="DOPPELGARAGE"/&gt;
     *     &lt;enumeration value="DUPLEX"/&gt;
     *     &lt;enumeration value="TIEFGARAGE"/&gt;
     *     &lt;enumeration value="BOOTSLIEGEPLATZ"/&gt;
     *     &lt;enumeration value="EINZELGARAGE"/&gt;
     *     &lt;enumeration value="PARKHAUS"/&gt;
     *     &lt;enumeration value="TIEFGARAGENSTELLPLATZ"/&gt;
     *     &lt;enumeration value="PARKPLATZ_STROM"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public enum ParkenTyp {

        STELLPLATZ,
        CARPORT,
        DOPPELGARAGE,
        DUPLEX,
        TIEFGARAGE,
        BOOTSLIEGEPLATZ,
        EINZELGARAGE,
        PARKHAUS,
        TIEFGARAGENSTELLPLATZ,
        PARKPLATZ_STROM;

        public String value() {
            return name();
        }

        public static Parken.ParkenTyp fromValue(String v) {
            return valueOf(v);
        }

    }

}
