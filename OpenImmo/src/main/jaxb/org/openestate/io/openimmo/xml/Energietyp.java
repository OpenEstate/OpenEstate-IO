
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
 * Java class for &lt;energietyp&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "energietyp")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
public class Energietyp implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "PASSIVHAUS")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean passivhaus;
    @XmlAttribute(name = "NIEDRIGENERGIE")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean niedrigenergie;
    @XmlAttribute(name = "NEUBAUSTANDARD")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean neubaustandard;
    @XmlAttribute(name = "KFW40")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean kfw40;
    @XmlAttribute(name = "KFW60")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean kfw60;
    @XmlAttribute(name = "KFW55")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean kfw55;
    @XmlAttribute(name = "KFW70")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean kfw70;
    @XmlAttribute(name = "MINERGIEBAUWEISE")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean minergiebauweise;
    @XmlAttribute(name = "MINERGIE_ZERTIFIZIERT")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean minergiezertifiziert;

    /**
     * Gets the value of the passivhaus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getPASSIVHAUS() {
        return passivhaus;
    }

    /**
     * Sets the value of the passivhaus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setPASSIVHAUS(Boolean value) {
        this.passivhaus = value;
    }

    /**
     * Gets the value of the niedrigenergie property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getNIEDRIGENERGIE() {
        return niedrigenergie;
    }

    /**
     * Sets the value of the niedrigenergie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setNIEDRIGENERGIE(Boolean value) {
        this.niedrigenergie = value;
    }

    /**
     * Gets the value of the neubaustandard property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getNEUBAUSTANDARD() {
        return neubaustandard;
    }

    /**
     * Sets the value of the neubaustandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setNEUBAUSTANDARD(Boolean value) {
        this.neubaustandard = value;
    }

    /**
     * Gets the value of the kfw40 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getKFW40() {
        return kfw40;
    }

    /**
     * Sets the value of the kfw40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setKFW40(Boolean value) {
        this.kfw40 = value;
    }

    /**
     * Gets the value of the kfw60 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getKFW60() {
        return kfw60;
    }

    /**
     * Sets the value of the kfw60 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setKFW60(Boolean value) {
        this.kfw60 = value;
    }

    /**
     * Gets the value of the kfw55 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getKFW55() {
        return kfw55;
    }

    /**
     * Sets the value of the kfw55 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setKFW55(Boolean value) {
        this.kfw55 = value;
    }

    /**
     * Gets the value of the kfw70 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getKFW70() {
        return kfw70;
    }

    /**
     * Sets the value of the kfw70 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setKFW70(Boolean value) {
        this.kfw70 = value;
    }

    /**
     * Gets the value of the minergiebauweise property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getMINERGIEBAUWEISE() {
        return minergiebauweise;
    }

    /**
     * Sets the value of the minergiebauweise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setMINERGIEBAUWEISE(Boolean value) {
        this.minergiebauweise = value;
    }

    /**
     * Gets the value of the minergiezertifiziert property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getMINERGIEZERTIFIZIERT() {
        return minergiezertifiziert;
    }

    /**
     * Sets the value of the minergiezertifiziert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setMINERGIEZERTIFIZIERT(Boolean value) {
        this.minergiezertifiziert = value;
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
            Boolean thePASSIVHAUS;
            thePASSIVHAUS = this.getPASSIVHAUS();
            strategy.appendField(locator, this, "passivhaus", buffer, thePASSIVHAUS, (this.passivhaus!= null));
        }
        {
            Boolean theNIEDRIGENERGIE;
            theNIEDRIGENERGIE = this.getNIEDRIGENERGIE();
            strategy.appendField(locator, this, "niedrigenergie", buffer, theNIEDRIGENERGIE, (this.niedrigenergie!= null));
        }
        {
            Boolean theNEUBAUSTANDARD;
            theNEUBAUSTANDARD = this.getNEUBAUSTANDARD();
            strategy.appendField(locator, this, "neubaustandard", buffer, theNEUBAUSTANDARD, (this.neubaustandard!= null));
        }
        {
            Boolean theKFW40;
            theKFW40 = this.getKFW40();
            strategy.appendField(locator, this, "kfw40", buffer, theKFW40, (this.kfw40 != null));
        }
        {
            Boolean theKFW60;
            theKFW60 = this.getKFW60();
            strategy.appendField(locator, this, "kfw60", buffer, theKFW60, (this.kfw60 != null));
        }
        {
            Boolean theKFW55;
            theKFW55 = this.getKFW55();
            strategy.appendField(locator, this, "kfw55", buffer, theKFW55, (this.kfw55 != null));
        }
        {
            Boolean theKFW70;
            theKFW70 = this.getKFW70();
            strategy.appendField(locator, this, "kfw70", buffer, theKFW70, (this.kfw70 != null));
        }
        {
            Boolean theMINERGIEBAUWEISE;
            theMINERGIEBAUWEISE = this.getMINERGIEBAUWEISE();
            strategy.appendField(locator, this, "minergiebauweise", buffer, theMINERGIEBAUWEISE, (this.minergiebauweise!= null));
        }
        {
            Boolean theMINERGIEZERTIFIZIERT;
            theMINERGIEZERTIFIZIERT = this.getMINERGIEZERTIFIZIERT();
            strategy.appendField(locator, this, "minergiezertifiziert", buffer, theMINERGIEZERTIFIZIERT, (this.minergiezertifiziert!= null));
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
        if (draftCopy instanceof Energietyp) {
            final Energietyp copy = ((Energietyp) draftCopy);
            {
                Boolean passivhausShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.passivhaus!= null));
                if (passivhausShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourcePASSIVHAUS;
                    sourcePASSIVHAUS = this.getPASSIVHAUS();
                    Boolean copyPASSIVHAUS = ((Boolean) strategy.copy(LocatorUtils.property(locator, "passivhaus", sourcePASSIVHAUS), sourcePASSIVHAUS, (this.passivhaus!= null)));
                    copy.setPASSIVHAUS(copyPASSIVHAUS);
                } else {
                    if (passivhausShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.passivhaus = null;
                    }
                }
            }
            {
                Boolean niedrigenergieShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.niedrigenergie!= null));
                if (niedrigenergieShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceNIEDRIGENERGIE;
                    sourceNIEDRIGENERGIE = this.getNIEDRIGENERGIE();
                    Boolean copyNIEDRIGENERGIE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "niedrigenergie", sourceNIEDRIGENERGIE), sourceNIEDRIGENERGIE, (this.niedrigenergie!= null)));
                    copy.setNIEDRIGENERGIE(copyNIEDRIGENERGIE);
                } else {
                    if (niedrigenergieShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.niedrigenergie = null;
                    }
                }
            }
            {
                Boolean neubaustandardShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.neubaustandard!= null));
                if (neubaustandardShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceNEUBAUSTANDARD;
                    sourceNEUBAUSTANDARD = this.getNEUBAUSTANDARD();
                    Boolean copyNEUBAUSTANDARD = ((Boolean) strategy.copy(LocatorUtils.property(locator, "neubaustandard", sourceNEUBAUSTANDARD), sourceNEUBAUSTANDARD, (this.neubaustandard!= null)));
                    copy.setNEUBAUSTANDARD(copyNEUBAUSTANDARD);
                } else {
                    if (neubaustandardShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.neubaustandard = null;
                    }
                }
            }
            {
                Boolean kfw40ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kfw40 != null));
                if (kfw40ShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceKFW40;
                    sourceKFW40 = this.getKFW40();
                    Boolean copyKFW40 = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kfw40", sourceKFW40), sourceKFW40, (this.kfw40 != null)));
                    copy.setKFW40(copyKFW40);
                } else {
                    if (kfw40ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kfw40 = null;
                    }
                }
            }
            {
                Boolean kfw60ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kfw60 != null));
                if (kfw60ShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceKFW60;
                    sourceKFW60 = this.getKFW60();
                    Boolean copyKFW60 = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kfw60", sourceKFW60), sourceKFW60, (this.kfw60 != null)));
                    copy.setKFW60(copyKFW60);
                } else {
                    if (kfw60ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kfw60 = null;
                    }
                }
            }
            {
                Boolean kfw55ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kfw55 != null));
                if (kfw55ShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceKFW55;
                    sourceKFW55 = this.getKFW55();
                    Boolean copyKFW55 = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kfw55", sourceKFW55), sourceKFW55, (this.kfw55 != null)));
                    copy.setKFW55(copyKFW55);
                } else {
                    if (kfw55ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kfw55 = null;
                    }
                }
            }
            {
                Boolean kfw70ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kfw70 != null));
                if (kfw70ShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceKFW70;
                    sourceKFW70 = this.getKFW70();
                    Boolean copyKFW70 = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kfw70", sourceKFW70), sourceKFW70, (this.kfw70 != null)));
                    copy.setKFW70(copyKFW70);
                } else {
                    if (kfw70ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kfw70 = null;
                    }
                }
            }
            {
                Boolean minergiebauweiseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.minergiebauweise!= null));
                if (minergiebauweiseShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceMINERGIEBAUWEISE;
                    sourceMINERGIEBAUWEISE = this.getMINERGIEBAUWEISE();
                    Boolean copyMINERGIEBAUWEISE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "minergiebauweise", sourceMINERGIEBAUWEISE), sourceMINERGIEBAUWEISE, (this.minergiebauweise!= null)));
                    copy.setMINERGIEBAUWEISE(copyMINERGIEBAUWEISE);
                } else {
                    if (minergiebauweiseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.minergiebauweise = null;
                    }
                }
            }
            {
                Boolean minergiezertifiziertShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.minergiezertifiziert!= null));
                if (minergiezertifiziertShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceMINERGIEZERTIFIZIERT;
                    sourceMINERGIEZERTIFIZIERT = this.getMINERGIEZERTIFIZIERT();
                    Boolean copyMINERGIEZERTIFIZIERT = ((Boolean) strategy.copy(LocatorUtils.property(locator, "minergiezertifiziert", sourceMINERGIEZERTIFIZIERT), sourceMINERGIEZERTIFIZIERT, (this.minergiezertifiziert!= null)));
                    copy.setMINERGIEZERTIFIZIERT(copyMINERGIEZERTIFIZIERT);
                } else {
                    if (minergiezertifiziertShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.minergiezertifiziert = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Energietyp();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Energietyp that = ((Energietyp) object);
        {
            Boolean lhsPASSIVHAUS;
            lhsPASSIVHAUS = this.getPASSIVHAUS();
            Boolean rhsPASSIVHAUS;
            rhsPASSIVHAUS = that.getPASSIVHAUS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "passivhaus", lhsPASSIVHAUS), LocatorUtils.property(thatLocator, "passivhaus", rhsPASSIVHAUS), lhsPASSIVHAUS, rhsPASSIVHAUS, (this.passivhaus!= null), (that.passivhaus!= null))) {
                return false;
            }
        }
        {
            Boolean lhsNIEDRIGENERGIE;
            lhsNIEDRIGENERGIE = this.getNIEDRIGENERGIE();
            Boolean rhsNIEDRIGENERGIE;
            rhsNIEDRIGENERGIE = that.getNIEDRIGENERGIE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "niedrigenergie", lhsNIEDRIGENERGIE), LocatorUtils.property(thatLocator, "niedrigenergie", rhsNIEDRIGENERGIE), lhsNIEDRIGENERGIE, rhsNIEDRIGENERGIE, (this.niedrigenergie!= null), (that.niedrigenergie!= null))) {
                return false;
            }
        }
        {
            Boolean lhsNEUBAUSTANDARD;
            lhsNEUBAUSTANDARD = this.getNEUBAUSTANDARD();
            Boolean rhsNEUBAUSTANDARD;
            rhsNEUBAUSTANDARD = that.getNEUBAUSTANDARD();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "neubaustandard", lhsNEUBAUSTANDARD), LocatorUtils.property(thatLocator, "neubaustandard", rhsNEUBAUSTANDARD), lhsNEUBAUSTANDARD, rhsNEUBAUSTANDARD, (this.neubaustandard!= null), (that.neubaustandard!= null))) {
                return false;
            }
        }
        {
            Boolean lhsKFW40;
            lhsKFW40 = this.getKFW40();
            Boolean rhsKFW40;
            rhsKFW40 = that.getKFW40();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kfw40", lhsKFW40), LocatorUtils.property(thatLocator, "kfw40", rhsKFW40), lhsKFW40, rhsKFW40, (this.kfw40 != null), (that.kfw40 != null))) {
                return false;
            }
        }
        {
            Boolean lhsKFW60;
            lhsKFW60 = this.getKFW60();
            Boolean rhsKFW60;
            rhsKFW60 = that.getKFW60();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kfw60", lhsKFW60), LocatorUtils.property(thatLocator, "kfw60", rhsKFW60), lhsKFW60, rhsKFW60, (this.kfw60 != null), (that.kfw60 != null))) {
                return false;
            }
        }
        {
            Boolean lhsKFW55;
            lhsKFW55 = this.getKFW55();
            Boolean rhsKFW55;
            rhsKFW55 = that.getKFW55();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kfw55", lhsKFW55), LocatorUtils.property(thatLocator, "kfw55", rhsKFW55), lhsKFW55, rhsKFW55, (this.kfw55 != null), (that.kfw55 != null))) {
                return false;
            }
        }
        {
            Boolean lhsKFW70;
            lhsKFW70 = this.getKFW70();
            Boolean rhsKFW70;
            rhsKFW70 = that.getKFW70();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kfw70", lhsKFW70), LocatorUtils.property(thatLocator, "kfw70", rhsKFW70), lhsKFW70, rhsKFW70, (this.kfw70 != null), (that.kfw70 != null))) {
                return false;
            }
        }
        {
            Boolean lhsMINERGIEBAUWEISE;
            lhsMINERGIEBAUWEISE = this.getMINERGIEBAUWEISE();
            Boolean rhsMINERGIEBAUWEISE;
            rhsMINERGIEBAUWEISE = that.getMINERGIEBAUWEISE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minergiebauweise", lhsMINERGIEBAUWEISE), LocatorUtils.property(thatLocator, "minergiebauweise", rhsMINERGIEBAUWEISE), lhsMINERGIEBAUWEISE, rhsMINERGIEBAUWEISE, (this.minergiebauweise!= null), (that.minergiebauweise!= null))) {
                return false;
            }
        }
        {
            Boolean lhsMINERGIEZERTIFIZIERT;
            lhsMINERGIEZERTIFIZIERT = this.getMINERGIEZERTIFIZIERT();
            Boolean rhsMINERGIEZERTIFIZIERT;
            rhsMINERGIEZERTIFIZIERT = that.getMINERGIEZERTIFIZIERT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minergiezertifiziert", lhsMINERGIEZERTIFIZIERT), LocatorUtils.property(thatLocator, "minergiezertifiziert", rhsMINERGIEZERTIFIZIERT), lhsMINERGIEZERTIFIZIERT, rhsMINERGIEZERTIFIZIERT, (this.minergiezertifiziert!= null), (that.minergiezertifiziert!= null))) {
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
