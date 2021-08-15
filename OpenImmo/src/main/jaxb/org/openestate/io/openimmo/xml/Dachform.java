
package org.openestate.io.openimmo.xml;

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
 * Java class for &lt;dachform&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "dachform")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
public class Dachform implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "KRUEPPELWALMDACH")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean krueppelwalmdach;
    @XmlAttribute(name = "MANSARDDACH")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean mansarddach;
    @XmlAttribute(name = "PULTDACH")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean pultdach;
    @XmlAttribute(name = "SATTELDACH")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean satteldach;
    @XmlAttribute(name = "WALMDACH")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean walmdach;
    @XmlAttribute(name = "FLACHDACH")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean flachdach;
    @XmlAttribute(name = "PYRAMIDENDACH")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean pyramidendach;

    /**
     * Gets the value of the krueppelwalmdach property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getKRUEPPELWALMDACH() {
        return krueppelwalmdach;
    }

    /**
     * Sets the value of the krueppelwalmdach property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setKRUEPPELWALMDACH(Boolean value) {
        this.krueppelwalmdach = value;
    }

    /**
     * Gets the value of the mansarddach property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getMANSARDDACH() {
        return mansarddach;
    }

    /**
     * Sets the value of the mansarddach property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setMANSARDDACH(Boolean value) {
        this.mansarddach = value;
    }

    /**
     * Gets the value of the pultdach property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getPULTDACH() {
        return pultdach;
    }

    /**
     * Sets the value of the pultdach property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setPULTDACH(Boolean value) {
        this.pultdach = value;
    }

    /**
     * Gets the value of the satteldach property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getSATTELDACH() {
        return satteldach;
    }

    /**
     * Sets the value of the satteldach property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setSATTELDACH(Boolean value) {
        this.satteldach = value;
    }

    /**
     * Gets the value of the walmdach property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getWALMDACH() {
        return walmdach;
    }

    /**
     * Sets the value of the walmdach property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setWALMDACH(Boolean value) {
        this.walmdach = value;
    }

    /**
     * Gets the value of the flachdach property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getFLACHDACH() {
        return flachdach;
    }

    /**
     * Sets the value of the flachdach property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setFLACHDACH(Boolean value) {
        this.flachdach = value;
    }

    /**
     * Gets the value of the pyramidendach property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getPYRAMIDENDACH() {
        return pyramidendach;
    }

    /**
     * Sets the value of the pyramidendach property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setPYRAMIDENDACH(Boolean value) {
        this.pyramidendach = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            Boolean theKRUEPPELWALMDACH;
            theKRUEPPELWALMDACH = this.getKRUEPPELWALMDACH();
            strategy.appendField(locator, this, "krueppelwalmdach", buffer, theKRUEPPELWALMDACH, (this.krueppelwalmdach!= null));
        }
        {
            Boolean theMANSARDDACH;
            theMANSARDDACH = this.getMANSARDDACH();
            strategy.appendField(locator, this, "mansarddach", buffer, theMANSARDDACH, (this.mansarddach!= null));
        }
        {
            Boolean thePULTDACH;
            thePULTDACH = this.getPULTDACH();
            strategy.appendField(locator, this, "pultdach", buffer, thePULTDACH, (this.pultdach!= null));
        }
        {
            Boolean theSATTELDACH;
            theSATTELDACH = this.getSATTELDACH();
            strategy.appendField(locator, this, "satteldach", buffer, theSATTELDACH, (this.satteldach!= null));
        }
        {
            Boolean theWALMDACH;
            theWALMDACH = this.getWALMDACH();
            strategy.appendField(locator, this, "walmdach", buffer, theWALMDACH, (this.walmdach!= null));
        }
        {
            Boolean theFLACHDACH;
            theFLACHDACH = this.getFLACHDACH();
            strategy.appendField(locator, this, "flachdach", buffer, theFLACHDACH, (this.flachdach!= null));
        }
        {
            Boolean thePYRAMIDENDACH;
            thePYRAMIDENDACH = this.getPYRAMIDENDACH();
            strategy.appendField(locator, this, "pyramidendach", buffer, thePYRAMIDENDACH, (this.pyramidendach!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Dachform) {
            final Dachform copy = ((Dachform) draftCopy);
            {
                Boolean krueppelwalmdachShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.krueppelwalmdach!= null));
                if (krueppelwalmdachShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceKRUEPPELWALMDACH;
                    sourceKRUEPPELWALMDACH = this.getKRUEPPELWALMDACH();
                    Boolean copyKRUEPPELWALMDACH = ((Boolean) strategy.copy(LocatorUtils.property(locator, "krueppelwalmdach", sourceKRUEPPELWALMDACH), sourceKRUEPPELWALMDACH, (this.krueppelwalmdach!= null)));
                    copy.setKRUEPPELWALMDACH(copyKRUEPPELWALMDACH);
                } else {
                    if (krueppelwalmdachShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.krueppelwalmdach = null;
                    }
                }
            }
            {
                Boolean mansarddachShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mansarddach!= null));
                if (mansarddachShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceMANSARDDACH;
                    sourceMANSARDDACH = this.getMANSARDDACH();
                    Boolean copyMANSARDDACH = ((Boolean) strategy.copy(LocatorUtils.property(locator, "mansarddach", sourceMANSARDDACH), sourceMANSARDDACH, (this.mansarddach!= null)));
                    copy.setMANSARDDACH(copyMANSARDDACH);
                } else {
                    if (mansarddachShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mansarddach = null;
                    }
                }
            }
            {
                Boolean pultdachShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pultdach!= null));
                if (pultdachShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourcePULTDACH;
                    sourcePULTDACH = this.getPULTDACH();
                    Boolean copyPULTDACH = ((Boolean) strategy.copy(LocatorUtils.property(locator, "pultdach", sourcePULTDACH), sourcePULTDACH, (this.pultdach!= null)));
                    copy.setPULTDACH(copyPULTDACH);
                } else {
                    if (pultdachShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pultdach = null;
                    }
                }
            }
            {
                Boolean satteldachShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.satteldach!= null));
                if (satteldachShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceSATTELDACH;
                    sourceSATTELDACH = this.getSATTELDACH();
                    Boolean copySATTELDACH = ((Boolean) strategy.copy(LocatorUtils.property(locator, "satteldach", sourceSATTELDACH), sourceSATTELDACH, (this.satteldach!= null)));
                    copy.setSATTELDACH(copySATTELDACH);
                } else {
                    if (satteldachShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.satteldach = null;
                    }
                }
            }
            {
                Boolean walmdachShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.walmdach!= null));
                if (walmdachShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceWALMDACH;
                    sourceWALMDACH = this.getWALMDACH();
                    Boolean copyWALMDACH = ((Boolean) strategy.copy(LocatorUtils.property(locator, "walmdach", sourceWALMDACH), sourceWALMDACH, (this.walmdach!= null)));
                    copy.setWALMDACH(copyWALMDACH);
                } else {
                    if (walmdachShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.walmdach = null;
                    }
                }
            }
            {
                Boolean flachdachShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.flachdach!= null));
                if (flachdachShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceFLACHDACH;
                    sourceFLACHDACH = this.getFLACHDACH();
                    Boolean copyFLACHDACH = ((Boolean) strategy.copy(LocatorUtils.property(locator, "flachdach", sourceFLACHDACH), sourceFLACHDACH, (this.flachdach!= null)));
                    copy.setFLACHDACH(copyFLACHDACH);
                } else {
                    if (flachdachShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.flachdach = null;
                    }
                }
            }
            {
                Boolean pyramidendachShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pyramidendach!= null));
                if (pyramidendachShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourcePYRAMIDENDACH;
                    sourcePYRAMIDENDACH = this.getPYRAMIDENDACH();
                    Boolean copyPYRAMIDENDACH = ((Boolean) strategy.copy(LocatorUtils.property(locator, "pyramidendach", sourcePYRAMIDENDACH), sourcePYRAMIDENDACH, (this.pyramidendach!= null)));
                    copy.setPYRAMIDENDACH(copyPYRAMIDENDACH);
                } else {
                    if (pyramidendachShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pyramidendach = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Dachform();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Dachform that = ((Dachform) object);
        {
            Boolean lhsKRUEPPELWALMDACH;
            lhsKRUEPPELWALMDACH = this.getKRUEPPELWALMDACH();
            Boolean rhsKRUEPPELWALMDACH;
            rhsKRUEPPELWALMDACH = that.getKRUEPPELWALMDACH();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "krueppelwalmdach", lhsKRUEPPELWALMDACH), LocatorUtils.property(thatLocator, "krueppelwalmdach", rhsKRUEPPELWALMDACH), lhsKRUEPPELWALMDACH, rhsKRUEPPELWALMDACH, (this.krueppelwalmdach!= null), (that.krueppelwalmdach!= null))) {
                return false;
            }
        }
        {
            Boolean lhsMANSARDDACH;
            lhsMANSARDDACH = this.getMANSARDDACH();
            Boolean rhsMANSARDDACH;
            rhsMANSARDDACH = that.getMANSARDDACH();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mansarddach", lhsMANSARDDACH), LocatorUtils.property(thatLocator, "mansarddach", rhsMANSARDDACH), lhsMANSARDDACH, rhsMANSARDDACH, (this.mansarddach!= null), (that.mansarddach!= null))) {
                return false;
            }
        }
        {
            Boolean lhsPULTDACH;
            lhsPULTDACH = this.getPULTDACH();
            Boolean rhsPULTDACH;
            rhsPULTDACH = that.getPULTDACH();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pultdach", lhsPULTDACH), LocatorUtils.property(thatLocator, "pultdach", rhsPULTDACH), lhsPULTDACH, rhsPULTDACH, (this.pultdach!= null), (that.pultdach!= null))) {
                return false;
            }
        }
        {
            Boolean lhsSATTELDACH;
            lhsSATTELDACH = this.getSATTELDACH();
            Boolean rhsSATTELDACH;
            rhsSATTELDACH = that.getSATTELDACH();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "satteldach", lhsSATTELDACH), LocatorUtils.property(thatLocator, "satteldach", rhsSATTELDACH), lhsSATTELDACH, rhsSATTELDACH, (this.satteldach!= null), (that.satteldach!= null))) {
                return false;
            }
        }
        {
            Boolean lhsWALMDACH;
            lhsWALMDACH = this.getWALMDACH();
            Boolean rhsWALMDACH;
            rhsWALMDACH = that.getWALMDACH();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "walmdach", lhsWALMDACH), LocatorUtils.property(thatLocator, "walmdach", rhsWALMDACH), lhsWALMDACH, rhsWALMDACH, (this.walmdach!= null), (that.walmdach!= null))) {
                return false;
            }
        }
        {
            Boolean lhsFLACHDACH;
            lhsFLACHDACH = this.getFLACHDACH();
            Boolean rhsFLACHDACH;
            rhsFLACHDACH = that.getFLACHDACH();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flachdach", lhsFLACHDACH), LocatorUtils.property(thatLocator, "flachdach", rhsFLACHDACH), lhsFLACHDACH, rhsFLACHDACH, (this.flachdach!= null), (that.flachdach!= null))) {
                return false;
            }
        }
        {
            Boolean lhsPYRAMIDENDACH;
            lhsPYRAMIDENDACH = this.getPYRAMIDENDACH();
            Boolean rhsPYRAMIDENDACH;
            rhsPYRAMIDENDACH = that.getPYRAMIDENDACH();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pyramidendach", lhsPYRAMIDENDACH), LocatorUtils.property(thatLocator, "pyramidendach", rhsPYRAMIDENDACH), lhsPYRAMIDENDACH, rhsPYRAMIDENDACH, (this.pyramidendach!= null), (that.pyramidendach!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }

}
