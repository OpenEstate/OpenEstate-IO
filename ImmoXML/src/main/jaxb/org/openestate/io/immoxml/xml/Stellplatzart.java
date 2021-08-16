
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
 * Java class for &lt;stellplatzart&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "stellplatzart")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
public class Stellplatzart implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "GARAGE")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean garage;
    @XmlAttribute(name = "TIEFGARAGE")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean tiefgarage;
    @XmlAttribute(name = "CARPORT")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean carport;
    @XmlAttribute(name = "FREIPLATZ")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean freiplatz;
    @XmlAttribute(name = "PARKHAUS")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean parkhaus;
    @XmlAttribute(name = "DUPLEX")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean duplex;

    /**
     * Gets the value of the garage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getGARAGE() {
        return garage;
    }

    /**
     * Sets the value of the garage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setGARAGE(Boolean value) {
        this.garage = value;
    }

    /**
     * Gets the value of the tiefgarage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getTIEFGARAGE() {
        return tiefgarage;
    }

    /**
     * Sets the value of the tiefgarage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setTIEFGARAGE(Boolean value) {
        this.tiefgarage = value;
    }

    /**
     * Gets the value of the carport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getCARPORT() {
        return carport;
    }

    /**
     * Sets the value of the carport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setCARPORT(Boolean value) {
        this.carport = value;
    }

    /**
     * Gets the value of the freiplatz property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getFREIPLATZ() {
        return freiplatz;
    }

    /**
     * Sets the value of the freiplatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setFREIPLATZ(Boolean value) {
        this.freiplatz = value;
    }

    /**
     * Gets the value of the parkhaus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getPARKHAUS() {
        return parkhaus;
    }

    /**
     * Sets the value of the parkhaus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setPARKHAUS(Boolean value) {
        this.parkhaus = value;
    }

    /**
     * Gets the value of the duplex property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getDUPLEX() {
        return duplex;
    }

    /**
     * Sets the value of the duplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setDUPLEX(Boolean value) {
        this.duplex = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            Boolean theGARAGE;
            theGARAGE = this.getGARAGE();
            strategy.appendField(locator, this, "garage", buffer, theGARAGE, (this.garage!= null));
        }
        {
            Boolean theTIEFGARAGE;
            theTIEFGARAGE = this.getTIEFGARAGE();
            strategy.appendField(locator, this, "tiefgarage", buffer, theTIEFGARAGE, (this.tiefgarage!= null));
        }
        {
            Boolean theCARPORT;
            theCARPORT = this.getCARPORT();
            strategy.appendField(locator, this, "carport", buffer, theCARPORT, (this.carport!= null));
        }
        {
            Boolean theFREIPLATZ;
            theFREIPLATZ = this.getFREIPLATZ();
            strategy.appendField(locator, this, "freiplatz", buffer, theFREIPLATZ, (this.freiplatz!= null));
        }
        {
            Boolean thePARKHAUS;
            thePARKHAUS = this.getPARKHAUS();
            strategy.appendField(locator, this, "parkhaus", buffer, thePARKHAUS, (this.parkhaus!= null));
        }
        {
            Boolean theDUPLEX;
            theDUPLEX = this.getDUPLEX();
            strategy.appendField(locator, this, "duplex", buffer, theDUPLEX, (this.duplex!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Stellplatzart) {
            final Stellplatzart copy = ((Stellplatzart) draftCopy);
            {
                Boolean garageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.garage!= null));
                if (garageShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceGARAGE;
                    sourceGARAGE = this.getGARAGE();
                    Boolean copyGARAGE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "garage", sourceGARAGE), sourceGARAGE, (this.garage!= null)));
                    copy.setGARAGE(copyGARAGE);
                } else {
                    if (garageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.garage = null;
                    }
                }
            }
            {
                Boolean tiefgarageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tiefgarage!= null));
                if (tiefgarageShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceTIEFGARAGE;
                    sourceTIEFGARAGE = this.getTIEFGARAGE();
                    Boolean copyTIEFGARAGE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "tiefgarage", sourceTIEFGARAGE), sourceTIEFGARAGE, (this.tiefgarage!= null)));
                    copy.setTIEFGARAGE(copyTIEFGARAGE);
                } else {
                    if (tiefgarageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tiefgarage = null;
                    }
                }
            }
            {
                Boolean carportShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.carport!= null));
                if (carportShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceCARPORT;
                    sourceCARPORT = this.getCARPORT();
                    Boolean copyCARPORT = ((Boolean) strategy.copy(LocatorUtils.property(locator, "carport", sourceCARPORT), sourceCARPORT, (this.carport!= null)));
                    copy.setCARPORT(copyCARPORT);
                } else {
                    if (carportShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.carport = null;
                    }
                }
            }
            {
                Boolean freiplatzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.freiplatz!= null));
                if (freiplatzShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceFREIPLATZ;
                    sourceFREIPLATZ = this.getFREIPLATZ();
                    Boolean copyFREIPLATZ = ((Boolean) strategy.copy(LocatorUtils.property(locator, "freiplatz", sourceFREIPLATZ), sourceFREIPLATZ, (this.freiplatz!= null)));
                    copy.setFREIPLATZ(copyFREIPLATZ);
                } else {
                    if (freiplatzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.freiplatz = null;
                    }
                }
            }
            {
                Boolean parkhausShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.parkhaus!= null));
                if (parkhausShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourcePARKHAUS;
                    sourcePARKHAUS = this.getPARKHAUS();
                    Boolean copyPARKHAUS = ((Boolean) strategy.copy(LocatorUtils.property(locator, "parkhaus", sourcePARKHAUS), sourcePARKHAUS, (this.parkhaus!= null)));
                    copy.setPARKHAUS(copyPARKHAUS);
                } else {
                    if (parkhausShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.parkhaus = null;
                    }
                }
            }
            {
                Boolean duplexShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.duplex!= null));
                if (duplexShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceDUPLEX;
                    sourceDUPLEX = this.getDUPLEX();
                    Boolean copyDUPLEX = ((Boolean) strategy.copy(LocatorUtils.property(locator, "duplex", sourceDUPLEX), sourceDUPLEX, (this.duplex!= null)));
                    copy.setDUPLEX(copyDUPLEX);
                } else {
                    if (duplexShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.duplex = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Stellplatzart();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Stellplatzart that = ((Stellplatzart) object);
        {
            Boolean lhsGARAGE;
            lhsGARAGE = this.getGARAGE();
            Boolean rhsGARAGE;
            rhsGARAGE = that.getGARAGE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "garage", lhsGARAGE), LocatorUtils.property(thatLocator, "garage", rhsGARAGE), lhsGARAGE, rhsGARAGE, (this.garage!= null), (that.garage!= null))) {
                return false;
            }
        }
        {
            Boolean lhsTIEFGARAGE;
            lhsTIEFGARAGE = this.getTIEFGARAGE();
            Boolean rhsTIEFGARAGE;
            rhsTIEFGARAGE = that.getTIEFGARAGE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tiefgarage", lhsTIEFGARAGE), LocatorUtils.property(thatLocator, "tiefgarage", rhsTIEFGARAGE), lhsTIEFGARAGE, rhsTIEFGARAGE, (this.tiefgarage!= null), (that.tiefgarage!= null))) {
                return false;
            }
        }
        {
            Boolean lhsCARPORT;
            lhsCARPORT = this.getCARPORT();
            Boolean rhsCARPORT;
            rhsCARPORT = that.getCARPORT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "carport", lhsCARPORT), LocatorUtils.property(thatLocator, "carport", rhsCARPORT), lhsCARPORT, rhsCARPORT, (this.carport!= null), (that.carport!= null))) {
                return false;
            }
        }
        {
            Boolean lhsFREIPLATZ;
            lhsFREIPLATZ = this.getFREIPLATZ();
            Boolean rhsFREIPLATZ;
            rhsFREIPLATZ = that.getFREIPLATZ();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freiplatz", lhsFREIPLATZ), LocatorUtils.property(thatLocator, "freiplatz", rhsFREIPLATZ), lhsFREIPLATZ, rhsFREIPLATZ, (this.freiplatz!= null), (that.freiplatz!= null))) {
                return false;
            }
        }
        {
            Boolean lhsPARKHAUS;
            lhsPARKHAUS = this.getPARKHAUS();
            Boolean rhsPARKHAUS;
            rhsPARKHAUS = that.getPARKHAUS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parkhaus", lhsPARKHAUS), LocatorUtils.property(thatLocator, "parkhaus", rhsPARKHAUS), lhsPARKHAUS, rhsPARKHAUS, (this.parkhaus!= null), (that.parkhaus!= null))) {
                return false;
            }
        }
        {
            Boolean lhsDUPLEX;
            lhsDUPLEX = this.getDUPLEX();
            Boolean rhsDUPLEX;
            rhsDUPLEX = that.getDUPLEX();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "duplex", lhsDUPLEX), LocatorUtils.property(thatLocator, "duplex", rhsDUPLEX), lhsDUPLEX, rhsDUPLEX, (this.duplex!= null), (that.duplex!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }

}
