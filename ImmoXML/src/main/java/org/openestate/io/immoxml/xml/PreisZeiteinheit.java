
package org.openestate.io.immoxml.xml;

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
 *       &lt;attribute name="zeiteinheit">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="TAG"/>
 *             &lt;enumeration value="WOCHE"/>
 *             &lt;enumeration value="MONAT"/>
 *             &lt;enumeration value="JAHR"/>
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
@XmlRootElement(name = "preis_zeiteinheit")
public class PreisZeiteinheit
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "zeiteinheit")
    protected PreisZeiteinheit.Zeiteinheit zeiteinheit;

    /**
     * Gets the value of the zeiteinheit property.
     * 
     * @return
     *     possible object is
     *     {@link PreisZeiteinheit.Zeiteinheit }
     *     
     */
    public PreisZeiteinheit.Zeiteinheit getZeiteinheit() {
        return zeiteinheit;
    }

    /**
     * Sets the value of the zeiteinheit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreisZeiteinheit.Zeiteinheit }
     *     
     */
    public void setZeiteinheit(PreisZeiteinheit.Zeiteinheit value) {
        this.zeiteinheit = value;
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
            PreisZeiteinheit.Zeiteinheit theZeiteinheit;
            theZeiteinheit = this.getZeiteinheit();
            strategy.appendField(locator, this, "zeiteinheit", buffer, theZeiteinheit);
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
        if (draftCopy instanceof PreisZeiteinheit) {
            final PreisZeiteinheit copy = ((PreisZeiteinheit) draftCopy);
            if (this.zeiteinheit!= null) {
                PreisZeiteinheit.Zeiteinheit sourceZeiteinheit;
                sourceZeiteinheit = this.getZeiteinheit();
                PreisZeiteinheit.Zeiteinheit copyZeiteinheit = ((PreisZeiteinheit.Zeiteinheit) strategy.copy(LocatorUtils.property(locator, "zeiteinheit", sourceZeiteinheit), sourceZeiteinheit));
                copy.setZeiteinheit(copyZeiteinheit);
            } else {
                copy.zeiteinheit = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new PreisZeiteinheit();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PreisZeiteinheit)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PreisZeiteinheit that = ((PreisZeiteinheit) object);
        {
            PreisZeiteinheit.Zeiteinheit lhsZeiteinheit;
            lhsZeiteinheit = this.getZeiteinheit();
            PreisZeiteinheit.Zeiteinheit rhsZeiteinheit;
            rhsZeiteinheit = that.getZeiteinheit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeiteinheit", lhsZeiteinheit), LocatorUtils.property(thatLocator, "zeiteinheit", rhsZeiteinheit), lhsZeiteinheit, rhsZeiteinheit)) {
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
     *     &lt;enumeration value="TAG"/>
     *     &lt;enumeration value="WOCHE"/>
     *     &lt;enumeration value="MONAT"/>
     *     &lt;enumeration value="JAHR"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum Zeiteinheit {

        TAG,
        WOCHE,
        MONAT,
        JAHR;

        public String value() {
            return name();
        }

        public static PreisZeiteinheit.Zeiteinheit fromValue(String v) {
            return valueOf(v);
        }

    }

}
