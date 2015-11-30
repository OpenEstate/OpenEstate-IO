
package org.openestate.io.openimmo.xml;

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
 * Java class for &lt;vermarktungsart&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "vermarktungsart")
public class Vermarktungsart
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "KAUF", required = true)
    protected boolean kauf;
    @XmlAttribute(name = "MIETE_PACHT", required = true)
    protected boolean mietepacht;
    @XmlAttribute(name = "ERBPACHT")
    protected Boolean erbpacht;
    @XmlAttribute(name = "LEASING")
    protected Boolean leasing;

    /**
     * Gets the value of the kauf property.
     * 
     */
    public boolean isKAUF() {
        return kauf;
    }

    /**
     * Sets the value of the kauf property.
     * 
     */
    public void setKAUF(boolean value) {
        this.kauf = value;
    }

    /**
     * Gets the value of the mietepacht property.
     * 
     */
    public boolean isMIETEPACHT() {
        return mietepacht;
    }

    /**
     * Sets the value of the mietepacht property.
     * 
     */
    public void setMIETEPACHT(boolean value) {
        this.mietepacht = value;
    }

    /**
     * Gets the value of the erbpacht property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isERBPACHT() {
        return erbpacht;
    }

    /**
     * Sets the value of the erbpacht property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setERBPACHT(Boolean value) {
        this.erbpacht = value;
    }

    /**
     * Gets the value of the leasing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLEASING() {
        return leasing;
    }

    /**
     * Sets the value of the leasing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLEASING(Boolean value) {
        this.leasing = value;
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
            boolean theKAUF;
            theKAUF = this.isKAUF();
            strategy.appendField(locator, this, "kauf", buffer, theKAUF);
        }
        {
            boolean theMIETEPACHT;
            theMIETEPACHT = this.isMIETEPACHT();
            strategy.appendField(locator, this, "mietepacht", buffer, theMIETEPACHT);
        }
        {
            Boolean theERBPACHT;
            theERBPACHT = this.isERBPACHT();
            strategy.appendField(locator, this, "erbpacht", buffer, theERBPACHT);
        }
        {
            Boolean theLEASING;
            theLEASING = this.isLEASING();
            strategy.appendField(locator, this, "leasing", buffer, theLEASING);
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
        if (draftCopy instanceof Vermarktungsart) {
            final Vermarktungsart copy = ((Vermarktungsart) draftCopy);
            {
                boolean sourceKAUF;
                sourceKAUF = this.isKAUF();
                boolean copyKAUF = strategy.copy(LocatorUtils.property(locator, "kauf", sourceKAUF), sourceKAUF);
                copy.setKAUF(copyKAUF);
            }
            {
                boolean sourceMIETEPACHT;
                sourceMIETEPACHT = this.isMIETEPACHT();
                boolean copyMIETEPACHT = strategy.copy(LocatorUtils.property(locator, "mietepacht", sourceMIETEPACHT), sourceMIETEPACHT);
                copy.setMIETEPACHT(copyMIETEPACHT);
            }
            if (this.erbpacht!= null) {
                Boolean sourceERBPACHT;
                sourceERBPACHT = this.isERBPACHT();
                Boolean copyERBPACHT = ((Boolean) strategy.copy(LocatorUtils.property(locator, "erbpacht", sourceERBPACHT), sourceERBPACHT));
                copy.setERBPACHT(copyERBPACHT);
            } else {
                copy.erbpacht = null;
            }
            if (this.leasing!= null) {
                Boolean sourceLEASING;
                sourceLEASING = this.isLEASING();
                Boolean copyLEASING = ((Boolean) strategy.copy(LocatorUtils.property(locator, "leasing", sourceLEASING), sourceLEASING));
                copy.setLEASING(copyLEASING);
            } else {
                copy.leasing = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Vermarktungsart();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Vermarktungsart that = ((Vermarktungsart) object);
        {
            boolean lhsKAUF;
            lhsKAUF = this.isKAUF();
            boolean rhsKAUF;
            rhsKAUF = that.isKAUF();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kauf", lhsKAUF), LocatorUtils.property(thatLocator, "kauf", rhsKAUF), lhsKAUF, rhsKAUF)) {
                return false;
            }
        }
        {
            boolean lhsMIETEPACHT;
            lhsMIETEPACHT = this.isMIETEPACHT();
            boolean rhsMIETEPACHT;
            rhsMIETEPACHT = that.isMIETEPACHT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mietepacht", lhsMIETEPACHT), LocatorUtils.property(thatLocator, "mietepacht", rhsMIETEPACHT), lhsMIETEPACHT, rhsMIETEPACHT)) {
                return false;
            }
        }
        {
            Boolean lhsERBPACHT;
            lhsERBPACHT = this.isERBPACHT();
            Boolean rhsERBPACHT;
            rhsERBPACHT = that.isERBPACHT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erbpacht", lhsERBPACHT), LocatorUtils.property(thatLocator, "erbpacht", rhsERBPACHT), lhsERBPACHT, rhsERBPACHT)) {
                return false;
            }
        }
        {
            Boolean lhsLEASING;
            lhsLEASING = this.isLEASING();
            Boolean rhsLEASING;
            rhsLEASING = that.isLEASING();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leasing", lhsLEASING), LocatorUtils.property(thatLocator, "leasing", rhsLEASING), lhsLEASING, rhsLEASING)) {
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
