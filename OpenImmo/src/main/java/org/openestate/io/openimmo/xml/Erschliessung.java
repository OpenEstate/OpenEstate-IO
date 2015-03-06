
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
 *       &lt;attribute name="erschl_attr">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="UNERSCHLOSSEN"/>
 *             &lt;enumeration value="TEILERSCHLOSSEN"/>
 *             &lt;enumeration value="VOLLERSCHLOSSEN"/>
 *             &lt;enumeration value="ORTSUEBLICHERSCHLOSSEN"/>
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
@XmlRootElement(name = "erschliessung")
public class Erschliessung
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "erschl_attr")
    protected Erschliessung.ErschlAttr erschlAttr;

    /**
     * Gets the value of the erschlAttr property.
     * 
     * @return
     *     possible object is
     *     {@link Erschliessung.ErschlAttr }
     *     
     */
    public Erschliessung.ErschlAttr getErschlAttr() {
        return erschlAttr;
    }

    /**
     * Sets the value of the erschlAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Erschliessung.ErschlAttr }
     *     
     */
    public void setErschlAttr(Erschliessung.ErschlAttr value) {
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
            Erschliessung.ErschlAttr theErschlAttr;
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
        if (draftCopy instanceof Erschliessung) {
            final Erschliessung copy = ((Erschliessung) draftCopy);
            if (this.erschlAttr!= null) {
                Erschliessung.ErschlAttr sourceErschlAttr;
                sourceErschlAttr = this.getErschlAttr();
                Erschliessung.ErschlAttr copyErschlAttr = ((Erschliessung.ErschlAttr) strategy.copy(LocatorUtils.property(locator, "erschlAttr", sourceErschlAttr), sourceErschlAttr));
                copy.setErschlAttr(copyErschlAttr);
            } else {
                copy.erschlAttr = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Erschliessung();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Erschliessung)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Erschliessung that = ((Erschliessung) object);
        {
            Erschliessung.ErschlAttr lhsErschlAttr;
            lhsErschlAttr = this.getErschlAttr();
            Erschliessung.ErschlAttr rhsErschlAttr;
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
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType>
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *     &lt;enumeration value="UNERSCHLOSSEN"/>
     *     &lt;enumeration value="TEILERSCHLOSSEN"/>
     *     &lt;enumeration value="VOLLERSCHLOSSEN"/>
     *     &lt;enumeration value="ORTSUEBLICHERSCHLOSSEN"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum ErschlAttr {

        UNERSCHLOSSEN,
        TEILERSCHLOSSEN,
        VOLLERSCHLOSSEN,
        ORTSUEBLICHERSCHLOSSEN;

        public String value() {
            return name();
        }

        public static Erschliessung.ErschlAttr fromValue(String v) {
            return valueOf(v);
        }

    }

}
