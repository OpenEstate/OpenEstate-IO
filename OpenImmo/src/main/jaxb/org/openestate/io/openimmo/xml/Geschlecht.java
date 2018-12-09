
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
 * Java class for &lt;geschlecht&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "geschlecht")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
public class Geschlecht implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "geschl_attr")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected Geschlecht.GeschlAttr geschlAttr;

    /**
     * Gets the value of the geschlAttr property.
     * 
     * @return
     *     possible object is
     *     {@link Geschlecht.GeschlAttr }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Geschlecht.GeschlAttr getGeschlAttr() {
        return geschlAttr;
    }

    /**
     * Sets the value of the geschlAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Geschlecht.GeschlAttr }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setGeschlAttr(Geschlecht.GeschlAttr value) {
        this.geschlAttr = value;
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
            Geschlecht.GeschlAttr theGeschlAttr;
            theGeschlAttr = this.getGeschlAttr();
            strategy.appendField(locator, this, "geschlAttr", buffer, theGeschlAttr, (this.geschlAttr!= null));
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
        if (draftCopy instanceof Geschlecht) {
            final Geschlecht copy = ((Geschlecht) draftCopy);
            {
                Boolean geschlAttrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.geschlAttr!= null));
                if (geschlAttrShouldBeCopiedAndSet == Boolean.TRUE) {
                    Geschlecht.GeschlAttr sourceGeschlAttr;
                    sourceGeschlAttr = this.getGeschlAttr();
                    Geschlecht.GeschlAttr copyGeschlAttr = ((Geschlecht.GeschlAttr) strategy.copy(LocatorUtils.property(locator, "geschlAttr", sourceGeschlAttr), sourceGeschlAttr, (this.geschlAttr!= null)));
                    copy.setGeschlAttr(copyGeschlAttr);
                } else {
                    if (geschlAttrShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geschlAttr = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new Geschlecht();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Geschlecht that = ((Geschlecht) object);
        {
            Geschlecht.GeschlAttr lhsGeschlAttr;
            lhsGeschlAttr = this.getGeschlAttr();
            Geschlecht.GeschlAttr rhsGeschlAttr;
            rhsGeschlAttr = that.getGeschlAttr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geschlAttr", lhsGeschlAttr), LocatorUtils.property(thatLocator, "geschlAttr", rhsGeschlAttr), lhsGeschlAttr, rhsGeschlAttr, (this.geschlAttr!= null), (that.geschlAttr!= null))) {
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
     *                     Java enum for <em>geschl_attr</em> attribute in &lt;geschlecht&gt; elements.
     * 
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="EGAL"/&gt;
     *     &lt;enumeration value="NUR_MANN"/&gt;
     *     &lt;enumeration value="NUR_FRAU"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public enum GeschlAttr {

        EGAL,
        NUR_MANN,
        NUR_FRAU;

        public String value() {
            return name();
        }

        public static Geschlecht.GeschlAttr fromValue(String v) {
            return valueOf(v);
        }

    }

}
