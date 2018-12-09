
package org.openestate.io.immoxml.xml;

import java.io.Serializable;
import javax.annotation.Generated;
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
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
public class Vermarktungsart implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "KAUF")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean kauf;
    @XmlAttribute(name = "MIETE_PACHT")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean mietepacht;
    @XmlAttribute(name = "ERBPACHT")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean erbpacht;
    @XmlAttribute(name = "LEASING")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean leasing;

    /**
     * Gets the value of the kauf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getKAUF() {
        return kauf;
    }

    /**
     * Sets the value of the kauf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setKAUF(Boolean value) {
        this.kauf = value;
    }

    /**
     * Gets the value of the mietepacht property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getMIETEPACHT() {
        return mietepacht;
    }

    /**
     * Sets the value of the mietepacht property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setMIETEPACHT(Boolean value) {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getERBPACHT() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getLEASING() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setLEASING(Boolean value) {
        this.leasing = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            Boolean theKAUF;
            theKAUF = this.getKAUF();
            strategy.appendField(locator, this, "kauf", buffer, theKAUF, (this.kauf!= null));
        }
        {
            Boolean theMIETEPACHT;
            theMIETEPACHT = this.getMIETEPACHT();
            strategy.appendField(locator, this, "mietepacht", buffer, theMIETEPACHT, (this.mietepacht!= null));
        }
        {
            Boolean theERBPACHT;
            theERBPACHT = this.getERBPACHT();
            strategy.appendField(locator, this, "erbpacht", buffer, theERBPACHT, (this.erbpacht!= null));
        }
        {
            Boolean theLEASING;
            theLEASING = this.getLEASING();
            strategy.appendField(locator, this, "leasing", buffer, theLEASING, (this.leasing!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Vermarktungsart) {
            final Vermarktungsart copy = ((Vermarktungsart) draftCopy);
            {
                Boolean kaufShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kauf!= null));
                if (kaufShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceKAUF;
                    sourceKAUF = this.getKAUF();
                    Boolean copyKAUF = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kauf", sourceKAUF), sourceKAUF, (this.kauf!= null)));
                    copy.setKAUF(copyKAUF);
                } else {
                    if (kaufShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kauf = null;
                    }
                }
            }
            {
                Boolean mietepachtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mietepacht!= null));
                if (mietepachtShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceMIETEPACHT;
                    sourceMIETEPACHT = this.getMIETEPACHT();
                    Boolean copyMIETEPACHT = ((Boolean) strategy.copy(LocatorUtils.property(locator, "mietepacht", sourceMIETEPACHT), sourceMIETEPACHT, (this.mietepacht!= null)));
                    copy.setMIETEPACHT(copyMIETEPACHT);
                } else {
                    if (mietepachtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mietepacht = null;
                    }
                }
            }
            {
                Boolean erbpachtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.erbpacht!= null));
                if (erbpachtShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceERBPACHT;
                    sourceERBPACHT = this.getERBPACHT();
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
                    sourceLEASING = this.getLEASING();
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

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new Vermarktungsart();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Vermarktungsart that = ((Vermarktungsart) object);
        {
            Boolean lhsKAUF;
            lhsKAUF = this.getKAUF();
            Boolean rhsKAUF;
            rhsKAUF = that.getKAUF();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kauf", lhsKAUF), LocatorUtils.property(thatLocator, "kauf", rhsKAUF), lhsKAUF, rhsKAUF, (this.kauf!= null), (that.kauf!= null))) {
                return false;
            }
        }
        {
            Boolean lhsMIETEPACHT;
            lhsMIETEPACHT = this.getMIETEPACHT();
            Boolean rhsMIETEPACHT;
            rhsMIETEPACHT = that.getMIETEPACHT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mietepacht", lhsMIETEPACHT), LocatorUtils.property(thatLocator, "mietepacht", rhsMIETEPACHT), lhsMIETEPACHT, rhsMIETEPACHT, (this.mietepacht!= null), (that.mietepacht!= null))) {
                return false;
            }
        }
        {
            Boolean lhsERBPACHT;
            lhsERBPACHT = this.getERBPACHT();
            Boolean rhsERBPACHT;
            rhsERBPACHT = that.getERBPACHT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erbpacht", lhsERBPACHT), LocatorUtils.property(thatLocator, "erbpacht", rhsERBPACHT), lhsERBPACHT, rhsERBPACHT, (this.erbpacht!= null), (that.erbpacht!= null))) {
                return false;
            }
        }
        {
            Boolean lhsLEASING;
            lhsLEASING = this.getLEASING();
            Boolean rhsLEASING;
            rhsLEASING = that.getLEASING();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leasing", lhsLEASING), LocatorUtils.property(thatLocator, "leasing", rhsLEASING), lhsLEASING, rhsLEASING, (this.leasing!= null), (that.leasing!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
