
package org.openestate.io.immoxml.xml;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
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
 * Java class for &lt;lage_gebiet&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "lage_gebiet")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
public class LageGebiet implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "gebiete")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected LageGebiet.Gebiete gebiete;

    /**
     * Gets the value of the gebiete property.
     * 
     * @return
     *     possible object is
     *     {@link LageGebiet.Gebiete }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public LageGebiet.Gebiete getGebiete() {
        return gebiete;
    }

    /**
     * Sets the value of the gebiete property.
     * 
     * @param value
     *     allowed object is
     *     {@link LageGebiet.Gebiete }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setGebiete(LageGebiet.Gebiete value) {
        this.gebiete = value;
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
            LageGebiet.Gebiete theGebiete;
            theGebiete = this.getGebiete();
            strategy.appendField(locator, this, "gebiete", buffer, theGebiete, (this.gebiete!= null));
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
        if (draftCopy instanceof LageGebiet) {
            final LageGebiet copy = ((LageGebiet) draftCopy);
            {
                Boolean gebieteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gebiete!= null));
                if (gebieteShouldBeCopiedAndSet == Boolean.TRUE) {
                    LageGebiet.Gebiete sourceGebiete;
                    sourceGebiete = this.getGebiete();
                    LageGebiet.Gebiete copyGebiete = ((LageGebiet.Gebiete) strategy.copy(LocatorUtils.property(locator, "gebiete", sourceGebiete), sourceGebiete, (this.gebiete!= null)));
                    copy.setGebiete(copyGebiete);
                } else {
                    if (gebieteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gebiete = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new LageGebiet();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LageGebiet that = ((LageGebiet) object);
        {
            LageGebiet.Gebiete lhsGebiete;
            lhsGebiete = this.getGebiete();
            LageGebiet.Gebiete rhsGebiete;
            rhsGebiete = that.getGebiete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gebiete", lhsGebiete), LocatorUtils.property(thatLocator, "gebiete", rhsGebiete), lhsGebiete, rhsGebiete, (this.gebiete!= null), (that.gebiete!= null))) {
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
     *                     Java enum for <em>gebiete</em> attribute in &lt;lage_gebiet&gt; elements.
     * 
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="WOHN"/&gt;
     *     &lt;enumeration value="GEWERBE"/&gt;
     *     &lt;enumeration value="INDUSTRIE"/&gt;
     *     &lt;enumeration value="MISCH"/&gt;
     *     &lt;enumeration value="NEUBAU"/&gt;
     *     &lt;enumeration value="ORTSLAGE"/&gt;
     *     &lt;enumeration value="SIEDLUNG"/&gt;
     *     &lt;enumeration value="STADTRAND"/&gt;
     *     &lt;enumeration value="STADTTEIL"/&gt;
     *     &lt;enumeration value="STADTZENTRUM"/&gt;
     *     &lt;enumeration value="NEBENZENTRUM"/&gt;
     *     &lt;enumeration value="1A"/&gt;
     *     &lt;enumeration value="1B"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public enum Gebiete {

        WOHN("WOHN"),
        GEWERBE("GEWERBE"),
        INDUSTRIE("INDUSTRIE"),
        MISCH("MISCH"),
        NEUBAU("NEUBAU"),
        ORTSLAGE("ORTSLAGE"),
        SIEDLUNG("SIEDLUNG"),
        STADTRAND("STADTRAND"),
        STADTTEIL("STADTTEIL"),
        STADTZENTRUM("STADTZENTRUM"),
        NEBENZENTRUM("NEBENZENTRUM"),
        @XmlEnumValue("1A")
        A_LAGE("1A"),
        @XmlEnumValue("1B")
        B_LAGE("1B");
        private final String value;

        Gebiete(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static LageGebiet.Gebiete fromValue(String v) {
            for (LageGebiet.Gebiete c: LageGebiet.Gebiete.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
