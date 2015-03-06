
package org.openestate.io.openimmo.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *       &lt;attribute name="art" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="speed" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "breitband_zugang")
public class BreitbandZugang
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "art")
    protected String art;
    @XmlAttribute(name = "speed")
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "decimal")
    protected Double speed;

    /**
     * Gets the value of the art property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArt() {
        return art;
    }

    /**
     * Sets the value of the art property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArt(String value) {
        this.art = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeed(Double value) {
        this.speed = value;
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
            String theArt;
            theArt = this.getArt();
            strategy.appendField(locator, this, "art", buffer, theArt);
        }
        {
            Double theSpeed;
            theSpeed = this.getSpeed();
            strategy.appendField(locator, this, "speed", buffer, theSpeed);
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
        if (draftCopy instanceof BreitbandZugang) {
            final BreitbandZugang copy = ((BreitbandZugang) draftCopy);
            if (this.art!= null) {
                String sourceArt;
                sourceArt = this.getArt();
                String copyArt = ((String) strategy.copy(LocatorUtils.property(locator, "art", sourceArt), sourceArt));
                copy.setArt(copyArt);
            } else {
                copy.art = null;
            }
            if (this.speed!= null) {
                Double sourceSpeed;
                sourceSpeed = this.getSpeed();
                Double copySpeed = ((Double) strategy.copy(LocatorUtils.property(locator, "speed", sourceSpeed), sourceSpeed));
                copy.setSpeed(copySpeed);
            } else {
                copy.speed = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new BreitbandZugang();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof BreitbandZugang)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BreitbandZugang that = ((BreitbandZugang) object);
        {
            String lhsArt;
            lhsArt = this.getArt();
            String rhsArt;
            rhsArt = that.getArt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "art", lhsArt), LocatorUtils.property(thatLocator, "art", rhsArt), lhsArt, rhsArt)) {
                return false;
            }
        }
        {
            Double lhsSpeed;
            lhsSpeed = this.getSpeed();
            Double rhsSpeed;
            rhsSpeed = that.getSpeed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "speed", lhsSpeed), LocatorUtils.property(thatLocator, "speed", rhsSpeed), lhsSpeed, rhsSpeed)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
