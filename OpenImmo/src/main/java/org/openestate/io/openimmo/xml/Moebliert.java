
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
 *       &lt;attribute name="moeb">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="VOLL"/>
 *             &lt;enumeration value="TEIL"/>
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
@XmlRootElement(name = "moebliert")
public class Moebliert
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "moeb")
    protected Moebliert.Moeb moeb;

    /**
     * Gets the value of the moeb property.
     * 
     * @return
     *     possible object is
     *     {@link Moebliert.Moeb }
     *     
     */
    public Moebliert.Moeb getMoeb() {
        return moeb;
    }

    /**
     * Sets the value of the moeb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Moebliert.Moeb }
     *     
     */
    public void setMoeb(Moebliert.Moeb value) {
        this.moeb = value;
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
            Moebliert.Moeb theMoeb;
            theMoeb = this.getMoeb();
            strategy.appendField(locator, this, "moeb", buffer, theMoeb);
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
        if (draftCopy instanceof Moebliert) {
            final Moebliert copy = ((Moebliert) draftCopy);
            if (this.moeb!= null) {
                Moebliert.Moeb sourceMoeb;
                sourceMoeb = this.getMoeb();
                Moebliert.Moeb copyMoeb = ((Moebliert.Moeb) strategy.copy(LocatorUtils.property(locator, "moeb", sourceMoeb), sourceMoeb));
                copy.setMoeb(copyMoeb);
            } else {
                copy.moeb = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Moebliert();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Moebliert)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Moebliert that = ((Moebliert) object);
        {
            Moebliert.Moeb lhsMoeb;
            lhsMoeb = this.getMoeb();
            Moebliert.Moeb rhsMoeb;
            rhsMoeb = that.getMoeb();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "moeb", lhsMoeb), LocatorUtils.property(thatLocator, "moeb", rhsMoeb), lhsMoeb, rhsMoeb)) {
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
     *     &lt;enumeration value="VOLL"/>
     *     &lt;enumeration value="TEIL"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum Moeb {

        VOLL,
        TEIL;

        public String value() {
            return name();
        }

        public static Moebliert.Moeb fromValue(String v) {
            return valueOf(v);
        }

    }

}
