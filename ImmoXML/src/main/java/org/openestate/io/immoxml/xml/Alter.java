
package org.openestate.io.immoxml.xml;

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
 * Java class for &lt;alter&gt; element.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "alter")
public class Alter implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "alter_attr")
    protected Alter.AlterAttr alterAttr;

    /**
     * Gets the value of the alterAttr property.
     *
     * @return
     *     possible object is
     *     {@link Alter.AlterAttr }
     *
     */
    public Alter.AlterAttr getAlterAttr() {
        return alterAttr;
    }

    /**
     * Sets the value of the alterAttr property.
     *
     * @param value
     *     allowed object is
     *     {@link Alter.AlterAttr }
     *
     */
    public void setAlterAttr(Alter.AlterAttr value) {
        this.alterAttr = value;
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            Alter.AlterAttr theAlterAttr;
            theAlterAttr = this.getAlterAttr();
            strategy.appendField(locator, this, "alterAttr", buffer, theAlterAttr, (this.alterAttr!= null));
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Alter) {
            final Alter copy = ((Alter) draftCopy);
            {
                Boolean alterAttrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.alterAttr!= null));
                if (alterAttrShouldBeCopiedAndSet == Boolean.TRUE) {
                    Alter.AlterAttr sourceAlterAttr;
                    sourceAlterAttr = this.getAlterAttr();
                    Alter.AlterAttr copyAlterAttr = ((Alter.AlterAttr) strategy.copy(LocatorUtils.property(locator, "alterAttr", sourceAlterAttr), sourceAlterAttr, (this.alterAttr!= null)));
                    copy.setAlterAttr(copyAlterAttr);
                } else {
                    if (alterAttrShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.alterAttr = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Alter();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Alter that = ((Alter) object);
        {
            Alter.AlterAttr lhsAlterAttr;
            lhsAlterAttr = this.getAlterAttr();
            Alter.AlterAttr rhsAlterAttr;
            rhsAlterAttr = that.getAlterAttr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alterAttr", lhsAlterAttr), LocatorUtils.property(thatLocator, "alterAttr", rhsAlterAttr), lhsAlterAttr, rhsAlterAttr, (this.alterAttr!= null), (that.alterAttr!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


    /**
     * Java enum for <em>alter_attr</em> attribute in &lt;alter&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum AlterAttr {

        ALTBAU,
        NEUBAU;

        public String value() {
            return name();
        }

        public static Alter.AlterAttr fromValue(String v) {
            return valueOf(v);
        }

    }

}