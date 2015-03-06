
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="alter_attr">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="ALTBAU"/>
 *             &lt;enumeration value="NEUBAU"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "alter")
public class Alter
    implements Cloneable, CopyTo, Equals, ToString
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
            Alter.AlterAttr theAlterAttr;
            theAlterAttr = this.getAlterAttr();
            strategy.appendField(locator, this, "alterAttr", buffer, theAlterAttr);
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
        if (draftCopy instanceof Alter) {
            final Alter copy = ((Alter) draftCopy);
            if (this.alterAttr!= null) {
                Alter.AlterAttr sourceAlterAttr;
                sourceAlterAttr = this.getAlterAttr();
                Alter.AlterAttr copyAlterAttr = ((Alter.AlterAttr) strategy.copy(LocatorUtils.property(locator, "alterAttr", sourceAlterAttr), sourceAlterAttr));
                copy.setAlterAttr(copyAlterAttr);
            } else {
                copy.alterAttr = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Alter();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Alter)) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alterAttr", lhsAlterAttr), LocatorUtils.property(thatLocator, "alterAttr", rhsAlterAttr), lhsAlterAttr, rhsAlterAttr)) {
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
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType>
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *     &lt;enumeration value="ALTBAU"/>
     *     &lt;enumeration value="NEUBAU"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
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
