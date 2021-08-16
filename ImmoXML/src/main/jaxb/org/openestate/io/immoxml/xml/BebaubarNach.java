
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
 * Java class for &lt;bebaubar_nach&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "bebaubar_nach")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
public class BebaubarNach implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "bebaubar_attr")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected BebaubarNach.BebaubarAttr bebaubarAttr;

    /**
     * Gets the value of the bebaubarAttr property.
     * 
     * @return
     *     possible object is
     *     {@link BebaubarNach.BebaubarAttr }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public BebaubarNach.BebaubarAttr getBebaubarAttr() {
        return bebaubarAttr;
    }

    /**
     * Sets the value of the bebaubarAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BebaubarNach.BebaubarAttr }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setBebaubarAttr(BebaubarNach.BebaubarAttr value) {
        this.bebaubarAttr = value;
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
            BebaubarNach.BebaubarAttr theBebaubarAttr;
            theBebaubarAttr = this.getBebaubarAttr();
            strategy.appendField(locator, this, "bebaubarAttr", buffer, theBebaubarAttr, (this.bebaubarAttr!= null));
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
        if (draftCopy instanceof BebaubarNach) {
            final BebaubarNach copy = ((BebaubarNach) draftCopy);
            {
                Boolean bebaubarAttrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bebaubarAttr!= null));
                if (bebaubarAttrShouldBeCopiedAndSet == Boolean.TRUE) {
                    BebaubarNach.BebaubarAttr sourceBebaubarAttr;
                    sourceBebaubarAttr = this.getBebaubarAttr();
                    BebaubarNach.BebaubarAttr copyBebaubarAttr = ((BebaubarNach.BebaubarAttr) strategy.copy(LocatorUtils.property(locator, "bebaubarAttr", sourceBebaubarAttr), sourceBebaubarAttr, (this.bebaubarAttr!= null)));
                    copy.setBebaubarAttr(copyBebaubarAttr);
                } else {
                    if (bebaubarAttrShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bebaubarAttr = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new BebaubarNach();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BebaubarNach that = ((BebaubarNach) object);
        {
            BebaubarNach.BebaubarAttr lhsBebaubarAttr;
            lhsBebaubarAttr = this.getBebaubarAttr();
            BebaubarNach.BebaubarAttr rhsBebaubarAttr;
            rhsBebaubarAttr = that.getBebaubarAttr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bebaubarAttr", lhsBebaubarAttr), LocatorUtils.property(thatLocator, "bebaubarAttr", rhsBebaubarAttr), lhsBebaubarAttr, rhsBebaubarAttr, (this.bebaubarAttr!= null), (that.bebaubarAttr!= null))) {
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
     *                     Java enum for <em>bebaubar_attr</em> attribute in &lt;bebaubar_nach&gt; elements.
     * 
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="34_NACHBARSCHAFT"/&gt;
     *     &lt;enumeration value="35_AUSSENGEBIET"/&gt;
     *     &lt;enumeration value="B_PLAN"/&gt;
     *     &lt;enumeration value="KEIN BAULAND"/&gt;
     *     &lt;enumeration value="BAUERWARTUNGSLAND"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public enum BebaubarAttr {

        @XmlEnumValue("34_NACHBARSCHAFT")
        NACHBARSCHAFT("34_NACHBARSCHAFT"),
        @XmlEnumValue("35_AUSSENGEBIET")
        AUSSENGEBIET("35_AUSSENGEBIET"),
        B_PLAN("B_PLAN"),
        @XmlEnumValue("KEIN BAULAND")
        KEIN_BAULAND("KEIN BAULAND"),
        BAUERWARTUNGSLAND("BAUERWARTUNGSLAND");
        private final String value;

        BebaubarAttr(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static BebaubarNach.BebaubarAttr fromValue(String v) {
            for (BebaubarNach.BebaubarAttr c: BebaubarNach.BebaubarAttr.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
