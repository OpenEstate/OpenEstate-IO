
package org.openestate.io.openimmo.xml;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * Java class for &lt;vermarktungsart&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "vermarktungsart")
public class Vermarktungsart implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
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
            boolean theKAUF;
            theKAUF = this.isKAUF();
            strategy.appendField(locator, this, "kauf", buffer, theKAUF, true);
        }
        {
            boolean theMIETEPACHT;
            theMIETEPACHT = this.isMIETEPACHT();
            strategy.appendField(locator, this, "mietepacht", buffer, theMIETEPACHT, true);
        }
        {
            Boolean theERBPACHT;
            theERBPACHT = this.isERBPACHT();
            strategy.appendField(locator, this, "erbpacht", buffer, theERBPACHT, (this.erbpacht!= null));
        }
        {
            Boolean theLEASING;
            theLEASING = this.isLEASING();
            strategy.appendField(locator, this, "leasing", buffer, theLEASING, (this.leasing!= null));
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
        if (draftCopy instanceof Vermarktungsart) {
            final Vermarktungsart copy = ((Vermarktungsart) draftCopy);
            {
                Boolean kaufShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (kaufShouldBeCopiedAndSet == Boolean.TRUE) {
                    boolean sourceKAUF;
                    sourceKAUF = this.isKAUF();
                    boolean copyKAUF = strategy.copy(LocatorUtils.property(locator, "kauf", sourceKAUF), sourceKAUF, true);
                    copy.setKAUF(copyKAUF);
                } else {
                    if (kaufShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
            {
                Boolean mietepachtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (mietepachtShouldBeCopiedAndSet == Boolean.TRUE) {
                    boolean sourceMIETEPACHT;
                    sourceMIETEPACHT = this.isMIETEPACHT();
                    boolean copyMIETEPACHT = strategy.copy(LocatorUtils.property(locator, "mietepacht", sourceMIETEPACHT), sourceMIETEPACHT, true);
                    copy.setMIETEPACHT(copyMIETEPACHT);
                } else {
                    if (mietepachtShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
            {
                Boolean erbpachtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.erbpacht!= null));
                if (erbpachtShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceERBPACHT;
                    sourceERBPACHT = this.isERBPACHT();
                    Boolean copyERBPACHT = ((Boolean) strategy.copy(LocatorUtils.property(locator, "erbpacht", sourceERBPACHT), sourceERBPACHT, (this.erbpacht!= null)));
                    copy.setERBPACHT(copyERBPACHT);
                } else {
                    if (erbpachtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.erbpacht = null;
                    }
                }
            }
            {
                Boolean leasingShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.leasing!= null));
                if (leasingShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceLEASING;
                    sourceLEASING = this.isLEASING();
                    Boolean copyLEASING = ((Boolean) strategy.copy(LocatorUtils.property(locator, "leasing", sourceLEASING), sourceLEASING, (this.leasing!= null)));
                    copy.setLEASING(copyLEASING);
                } else {
                    if (leasingShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.leasing = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Vermarktungsart();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kauf", lhsKAUF), LocatorUtils.property(thatLocator, "kauf", rhsKAUF), lhsKAUF, rhsKAUF, true, true)) {
                return false;
            }
        }
        {
            boolean lhsMIETEPACHT;
            lhsMIETEPACHT = this.isMIETEPACHT();
            boolean rhsMIETEPACHT;
            rhsMIETEPACHT = that.isMIETEPACHT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mietepacht", lhsMIETEPACHT), LocatorUtils.property(thatLocator, "mietepacht", rhsMIETEPACHT), lhsMIETEPACHT, rhsMIETEPACHT, true, true)) {
                return false;
            }
        }
        {
            Boolean lhsERBPACHT;
            lhsERBPACHT = this.isERBPACHT();
            Boolean rhsERBPACHT;
            rhsERBPACHT = that.isERBPACHT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erbpacht", lhsERBPACHT), LocatorUtils.property(thatLocator, "erbpacht", rhsERBPACHT), lhsERBPACHT, rhsERBPACHT, (this.erbpacht!= null), (that.erbpacht!= null))) {
                return false;
            }
        }
        {
            Boolean lhsLEASING;
            lhsLEASING = this.isLEASING();
            Boolean rhsLEASING;
            rhsLEASING = that.isLEASING();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leasing", lhsLEASING), LocatorUtils.property(thatLocator, "leasing", rhsLEASING), lhsLEASING, rhsLEASING, (this.leasing!= null), (that.leasing!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
