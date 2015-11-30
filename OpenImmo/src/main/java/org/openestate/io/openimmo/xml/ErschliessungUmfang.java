
package org.openestate.io.openimmo.xml;

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
 * Java class for &lt;erschliessung_umfang&gt; element.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "erschliessung_umfang")
public class ErschliessungUmfang
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "erschl_attr")
    protected ErschliessungUmfang.ErschlAttr erschlAttr;

    /**
     * Gets the value of the erschlAttr property.
     *
     * @return
     *     possible object is
     *     {@link ErschliessungUmfang.ErschlAttr }
     *
     */
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
    public void setErschlAttr(ErschliessungUmfang.ErschlAttr value) {
        this.erschlAttr = value;
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
            ErschliessungUmfang.ErschlAttr theErschlAttr;
            theErschlAttr = this.getErschlAttr();
            strategy.appendField(locator, this, "erschlAttr", buffer, theErschlAttr);
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
        if (draftCopy instanceof ErschliessungUmfang) {
            final ErschliessungUmfang copy = ((ErschliessungUmfang) draftCopy);
            if (this.erschlAttr!= null) {
                ErschliessungUmfang.ErschlAttr sourceErschlAttr;
                sourceErschlAttr = this.getErschlAttr();
                ErschliessungUmfang.ErschlAttr copyErschlAttr = ((ErschliessungUmfang.ErschlAttr) strategy.copy(LocatorUtils.property(locator, "erschlAttr", sourceErschlAttr), sourceErschlAttr));
                copy.setErschlAttr(copyErschlAttr);
            } else {
                copy.erschlAttr = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ErschliessungUmfang();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erschlAttr", lhsErschlAttr), LocatorUtils.property(thatLocator, "erschlAttr", rhsErschlAttr), lhsErschlAttr, rhsErschlAttr)) {
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
     * Java enum for <em>erschl_attr</em> attribute in &lt;erschliessung_umfang&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
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