
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
 * Java class for &lt;erschliessung_umfang&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "erschliessung_umfang")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
public class ErschliessungUmfang implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "erschl_attr")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected ErschliessungUmfang.ErschlAttr erschlAttr;

    /**
     * Gets the value of the erschlAttr property.
     * 
     * @return
     *     possible object is
     *     {@link ErschliessungUmfang.ErschlAttr }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public ErschliessungUmfang.ErschlAttr getErschlAttr() {
        return erschlAttr;
    }

    /**
     * Sets the value of the erschlAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErschliessungUmfang.ErschlAttr }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setErschlAttr(ErschliessungUmfang.ErschlAttr value) {
        this.erschlAttr = value;
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
            ErschliessungUmfang.ErschlAttr theErschlAttr;
            theErschlAttr = this.getErschlAttr();
            strategy.appendField(locator, this, "erschlAttr", buffer, theErschlAttr, (this.erschlAttr!= null));
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
        if (draftCopy instanceof ErschliessungUmfang) {
            final ErschliessungUmfang copy = ((ErschliessungUmfang) draftCopy);
            {
                Boolean erschlAttrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.erschlAttr!= null));
                if (erschlAttrShouldBeCopiedAndSet == Boolean.TRUE) {
                    ErschliessungUmfang.ErschlAttr sourceErschlAttr;
                    sourceErschlAttr = this.getErschlAttr();
                    ErschliessungUmfang.ErschlAttr copyErschlAttr = ((ErschliessungUmfang.ErschlAttr) strategy.copy(LocatorUtils.property(locator, "erschlAttr", sourceErschlAttr), sourceErschlAttr, (this.erschlAttr!= null)));
                    copy.setErschlAttr(copyErschlAttr);
                } else {
                    if (erschlAttrShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.erschlAttr = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new ErschliessungUmfang();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ErschliessungUmfang that = ((ErschliessungUmfang) object);
        {
            ErschliessungUmfang.ErschlAttr lhsErschlAttr;
            lhsErschlAttr = this.getErschlAttr();
            ErschliessungUmfang.ErschlAttr rhsErschlAttr;
            rhsErschlAttr = that.getErschlAttr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erschlAttr", lhsErschlAttr), LocatorUtils.property(thatLocator, "erschlAttr", rhsErschlAttr), lhsErschlAttr, rhsErschlAttr, (this.erschlAttr!= null), (that.erschlAttr!= null))) {
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
     *                     Java enum for <em>erschl_attr</em> attribute in &lt;erschliessung_umfang&gt; elements.
     * 
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="GAS"/&gt;
     *     &lt;enumeration value="WASSER"/&gt;
     *     &lt;enumeration value="STROM"/&gt;
     *     &lt;enumeration value="TK"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public enum ErschlAttr {

        GAS,
        WASSER,
        STROM,
        TK;

        public String value() {
            return name();
        }

        public static ErschliessungUmfang.ErschlAttr fromValue(String v) {
            return valueOf(v);
        }

    }

}
