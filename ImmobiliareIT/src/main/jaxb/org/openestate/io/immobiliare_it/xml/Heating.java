
package org.openestate.io.immobiliare_it.xml;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
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
 * <p>Java class for heating complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="heating"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="system"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="A radiatori"/&gt;
 *               &lt;enumeration value="A pavimento"/&gt;
 *               &lt;enumeration value="Ad aria"/&gt;
 *               &lt;enumeration value="A stufa"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="source"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Gas"/&gt;
 *               &lt;enumeration value="Metano"/&gt;
 *               &lt;enumeration value="GPL"/&gt;
 *               &lt;enumeration value="Gasolio"/&gt;
 *               &lt;enumeration value="Pellet"/&gt;
 *               &lt;enumeration value="Legna"/&gt;
 *               &lt;enumeration value="Solare"/&gt;
 *               &lt;enumeration value="Fotovoltaico"/&gt;
 *               &lt;enumeration value="Teleriscaldamento"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="type" type="{http://feed.immobiliare.it}heat" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "heating", propOrder = {

})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
public class Heating implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected Heating.System system;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected Heating.Source source;
    @XmlAttribute(name = "type")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected HeatType type;

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link Heating.System }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Heating.System getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link Heating.System }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setSystem(Heating.System value) {
        this.system = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link Heating.Source }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Heating.Source getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link Heating.Source }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setSource(Heating.Source value) {
        this.source = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link HeatType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public HeatType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeatType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setType(HeatType value) {
        this.type = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            Heating.System theSystem;
            theSystem = this.getSystem();
            strategy.appendField(locator, this, "system", buffer, theSystem, (this.system!= null));
        }
        {
            Heating.Source theSource;
            theSource = this.getSource();
            strategy.appendField(locator, this, "source", buffer, theSource, (this.source!= null));
        }
        {
            HeatType theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType, (this.type!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Heating) {
            final Heating copy = ((Heating) draftCopy);
            {
                Boolean systemShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.system!= null));
                if (systemShouldBeCopiedAndSet == Boolean.TRUE) {
                    Heating.System sourceSystem;
                    sourceSystem = this.getSystem();
                    Heating.System copySystem = ((Heating.System) strategy.copy(LocatorUtils.property(locator, "system", sourceSystem), sourceSystem, (this.system!= null)));
                    copy.setSystem(copySystem);
                } else {
                    if (systemShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.system = null;
                    }
                }
            }
            {
                Boolean sourceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.source!= null));
                if (sourceShouldBeCopiedAndSet == Boolean.TRUE) {
                    Heating.Source sourceSource;
                    sourceSource = this.getSource();
                    Heating.Source copySource = ((Heating.Source) strategy.copy(LocatorUtils.property(locator, "source", sourceSource), sourceSource, (this.source!= null)));
                    copy.setSource(copySource);
                } else {
                    if (sourceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.source = null;
                    }
                }
            }
            {
                Boolean typeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.type!= null));
                if (typeShouldBeCopiedAndSet == Boolean.TRUE) {
                    HeatType sourceType;
                    sourceType = this.getType();
                    HeatType copyType = ((HeatType) strategy.copy(LocatorUtils.property(locator, "type", sourceType), sourceType, (this.type!= null)));
                    copy.setType(copyType);
                } else {
                    if (typeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.type = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new Heating();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Heating that = ((Heating) object);
        {
            Heating.System lhsSystem;
            lhsSystem = this.getSystem();
            Heating.System rhsSystem;
            rhsSystem = that.getSystem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "system", lhsSystem), LocatorUtils.property(thatLocator, "system", rhsSystem), lhsSystem, rhsSystem, (this.system!= null), (that.system!= null))) {
                return false;
            }
        }
        {
            Heating.Source lhsSource;
            lhsSource = this.getSource();
            Heating.Source rhsSource;
            rhsSource = that.getSource();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "source", lhsSource), LocatorUtils.property(thatLocator, "source", rhsSource), lhsSource, rhsSource, (this.source!= null), (that.source!= null))) {
                return false;
            }
        }
        {
            HeatType lhsType;
            lhsType = this.getType();
            HeatType rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType, (this.type!= null), (that.type!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="Gas"/&gt;
     *     &lt;enumeration value="Metano"/&gt;
     *     &lt;enumeration value="GPL"/&gt;
     *     &lt;enumeration value="Gasolio"/&gt;
     *     &lt;enumeration value="Pellet"/&gt;
     *     &lt;enumeration value="Legna"/&gt;
     *     &lt;enumeration value="Solare"/&gt;
     *     &lt;enumeration value="Fotovoltaico"/&gt;
     *     &lt;enumeration value="Teleriscaldamento"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public enum Source {

        @XmlEnumValue("Gas")
        GAS("Gas"),
        @XmlEnumValue("Metano")
        METANO("Metano"),
        GPL("GPL"),
        @XmlEnumValue("Gasolio")
        GASOLIO("Gasolio"),
        @XmlEnumValue("Pellet")
        PELLET("Pellet"),
        @XmlEnumValue("Legna")
        LEGNA("Legna"),
        @XmlEnumValue("Solare")
        SOLARE("Solare"),
        @XmlEnumValue("Fotovoltaico")
        FOTOVOLTAICO("Fotovoltaico"),
        @XmlEnumValue("Teleriscaldamento")
        TELERISCALDAMENTO("Teleriscaldamento");
        private final String value;

        Source(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static Heating.Source fromValue(String v) {
            for (Heating.Source c: Heating.Source.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="A radiatori"/&gt;
     *     &lt;enumeration value="A pavimento"/&gt;
     *     &lt;enumeration value="Ad aria"/&gt;
     *     &lt;enumeration value="A stufa"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public enum System {

        @XmlEnumValue("A radiatori")
        A_RADIATORI("A radiatori"),
        @XmlEnumValue("A pavimento")
        A_PAVIMENTO("A pavimento"),
        @XmlEnumValue("Ad aria")
        AD_ARIA("Ad aria"),
        @XmlEnumValue("A stufa")
        A_STUFA("A stufa");
        private final String value;

        System(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static Heating.System fromValue(String v) {
            for (Heating.System c: Heating.System.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
