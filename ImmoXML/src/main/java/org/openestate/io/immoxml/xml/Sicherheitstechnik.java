
package org.openestate.io.immoxml.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * Java class for &lt;sicherheitstechnik&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "sicherheitstechnik")
public class Sicherheitstechnik
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "ALARMANLAGE")
    protected Boolean alarmanlage;
    @XmlAttribute(name = "KAMERA")
    protected Boolean kamera;
    @XmlAttribute(name = "POLIZEIRUF")
    protected Boolean polizeiruf;

    /**
     * Gets the value of the alarmanlage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isALARMANLAGE() {
        return alarmanlage;
    }

    /**
     * Sets the value of the alarmanlage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setALARMANLAGE(Boolean value) {
        this.alarmanlage = value;
    }

    /**
     * Gets the value of the kamera property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKAMERA() {
        return kamera;
    }

    /**
     * Sets the value of the kamera property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKAMERA(Boolean value) {
        this.kamera = value;
    }

    /**
     * Gets the value of the polizeiruf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPOLIZEIRUF() {
        return polizeiruf;
    }

    /**
     * Sets the value of the polizeiruf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPOLIZEIRUF(Boolean value) {
        this.polizeiruf = value;
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
            Boolean theALARMANLAGE;
            theALARMANLAGE = this.isALARMANLAGE();
            strategy.appendField(locator, this, "alarmanlage", buffer, theALARMANLAGE);
        }
        {
            Boolean theKAMERA;
            theKAMERA = this.isKAMERA();
            strategy.appendField(locator, this, "kamera", buffer, theKAMERA);
        }
        {
            Boolean thePOLIZEIRUF;
            thePOLIZEIRUF = this.isPOLIZEIRUF();
            strategy.appendField(locator, this, "polizeiruf", buffer, thePOLIZEIRUF);
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
        if (draftCopy instanceof Sicherheitstechnik) {
            final Sicherheitstechnik copy = ((Sicherheitstechnik) draftCopy);
            if (this.alarmanlage!= null) {
                Boolean sourceALARMANLAGE;
                sourceALARMANLAGE = this.isALARMANLAGE();
                Boolean copyALARMANLAGE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "alarmanlage", sourceALARMANLAGE), sourceALARMANLAGE));
                copy.setALARMANLAGE(copyALARMANLAGE);
            } else {
                copy.alarmanlage = null;
            }
            if (this.kamera!= null) {
                Boolean sourceKAMERA;
                sourceKAMERA = this.isKAMERA();
                Boolean copyKAMERA = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kamera", sourceKAMERA), sourceKAMERA));
                copy.setKAMERA(copyKAMERA);
            } else {
                copy.kamera = null;
            }
            if (this.polizeiruf!= null) {
                Boolean sourcePOLIZEIRUF;
                sourcePOLIZEIRUF = this.isPOLIZEIRUF();
                Boolean copyPOLIZEIRUF = ((Boolean) strategy.copy(LocatorUtils.property(locator, "polizeiruf", sourcePOLIZEIRUF), sourcePOLIZEIRUF));
                copy.setPOLIZEIRUF(copyPOLIZEIRUF);
            } else {
                copy.polizeiruf = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Sicherheitstechnik();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Sicherheitstechnik that = ((Sicherheitstechnik) object);
        {
            Boolean lhsALARMANLAGE;
            lhsALARMANLAGE = this.isALARMANLAGE();
            Boolean rhsALARMANLAGE;
            rhsALARMANLAGE = that.isALARMANLAGE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alarmanlage", lhsALARMANLAGE), LocatorUtils.property(thatLocator, "alarmanlage", rhsALARMANLAGE), lhsALARMANLAGE, rhsALARMANLAGE)) {
                return false;
            }
        }
        {
            Boolean lhsKAMERA;
            lhsKAMERA = this.isKAMERA();
            Boolean rhsKAMERA;
            rhsKAMERA = that.isKAMERA();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kamera", lhsKAMERA), LocatorUtils.property(thatLocator, "kamera", rhsKAMERA), lhsKAMERA, rhsKAMERA)) {
                return false;
            }
        }
        {
            Boolean lhsPOLIZEIRUF;
            lhsPOLIZEIRUF = this.isPOLIZEIRUF();
            Boolean rhsPOLIZEIRUF;
            rhsPOLIZEIRUF = that.isPOLIZEIRUF();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "polizeiruf", lhsPOLIZEIRUF), LocatorUtils.property(thatLocator, "polizeiruf", rhsPOLIZEIRUF), lhsPOLIZEIRUF, rhsPOLIZEIRUF)) {
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
