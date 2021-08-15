
package org.openestate.io.immoxml.xml;

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
 * Java class for &lt;sonstige&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "sonstige")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
public class Sonstige implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "sonstige_typ")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Sonstige.SonstigeTyp sonstigeTyp;

    /**
     * Gets the value of the sonstigeTyp property.
     * 
     * @return
     *     possible object is
     *     {@link Sonstige.SonstigeTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setSonstigeTyp(Sonstige.SonstigeTyp value) {
        this.sonstigeTyp = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            Sonstige.SonstigeTyp theSonstigeTyp;
            theSonstigeTyp = this.getSonstigeTyp();
            strategy.appendField(locator, this, "sonstigeTyp", buffer, theSonstigeTyp, (this.sonstigeTyp!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Sonstige) {
            final Sonstige copy = ((Sonstige) draftCopy);
            {
                Boolean sonstigeTypShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sonstigeTyp!= null));
                if (sonstigeTypShouldBeCopiedAndSet == Boolean.TRUE) {
                    Sonstige.SonstigeTyp sourceSonstigeTyp;
                    sourceSonstigeTyp = this.getSonstigeTyp();
                    Sonstige.SonstigeTyp copySonstigeTyp = ((Sonstige.SonstigeTyp) strategy.copy(LocatorUtils.property(locator, "sonstigeTyp", sourceSonstigeTyp), sourceSonstigeTyp, (this.sonstigeTyp!= null)));
                    copy.setSonstigeTyp(copySonstigeTyp);
                } else {
                    if (sonstigeTypShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sonstigeTyp = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Sonstige();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sonstigeTyp", lhsSonstigeTyp), LocatorUtils.property(thatLocator, "sonstigeTyp", rhsSonstigeTyp), lhsSonstigeTyp, rhsSonstigeTyp, (this.sonstigeTyp!= null), (that.sonstigeTyp!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }


    /**
     * 
     *                     Java enum for <em>sonstige_typ</em> attribute in &lt;sonstige&gt; elements.
     * 
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="PARKHAUS"/&gt;
     *     &lt;enumeration value="TANKSTELLE"/&gt;
     *     &lt;enumeration value="GARAGEN"/&gt;
     *     &lt;enumeration value="PARKFLACHE"/&gt;
     *     &lt;enumeration value="SONSTIGE"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
