
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
 * Java class for &lt;stellplatzart&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "stellplatzart")
public class Stellplatzart
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "GARAGE")
    protected Boolean garage;
    @XmlAttribute(name = "TIEFGARAGE")
    protected Boolean tiefgarage;
    @XmlAttribute(name = "CARPORT")
    protected Boolean carport;
    @XmlAttribute(name = "FREIPLATZ")
    protected Boolean freiplatz;
    @XmlAttribute(name = "PARKHAUS")
    protected Boolean parkhaus;
    @XmlAttribute(name = "DUPLEX")
    protected Boolean duplex;

    /**
     * Gets the value of the garage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGARAGE() {
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
    public Boolean isTIEFGARAGE() {
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
    public Boolean isCARPORT() {
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
    public Boolean isFREIPLATZ() {
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
    public Boolean isPARKHAUS() {
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
    public Boolean isDUPLEX() {
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
    public void setDUPLEX(Boolean value) {
        this.duplex = value;
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
            Boolean theGARAGE;
            theGARAGE = this.isGARAGE();
            strategy.appendField(locator, this, "garage", buffer, theGARAGE);
        }
        {
            Boolean theTIEFGARAGE;
            theTIEFGARAGE = this.isTIEFGARAGE();
            strategy.appendField(locator, this, "tiefgarage", buffer, theTIEFGARAGE);
        }
        {
            Boolean theCARPORT;
            theCARPORT = this.isCARPORT();
            strategy.appendField(locator, this, "carport", buffer, theCARPORT);
        }
        {
            Boolean theFREIPLATZ;
            theFREIPLATZ = this.isFREIPLATZ();
            strategy.appendField(locator, this, "freiplatz", buffer, theFREIPLATZ);
        }
        {
            Boolean thePARKHAUS;
            thePARKHAUS = this.isPARKHAUS();
            strategy.appendField(locator, this, "parkhaus", buffer, thePARKHAUS);
        }
        {
            Boolean theDUPLEX;
            theDUPLEX = this.isDUPLEX();
            strategy.appendField(locator, this, "duplex", buffer, theDUPLEX);
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
        if (draftCopy instanceof Stellplatzart) {
            final Stellplatzart copy = ((Stellplatzart) draftCopy);
            if (this.garage!= null) {
                Boolean sourceGARAGE;
                sourceGARAGE = this.isGARAGE();
                Boolean copyGARAGE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "garage", sourceGARAGE), sourceGARAGE));
                copy.setGARAGE(copyGARAGE);
            } else {
                copy.garage = null;
            }
            if (this.tiefgarage!= null) {
                Boolean sourceTIEFGARAGE;
                sourceTIEFGARAGE = this.isTIEFGARAGE();
                Boolean copyTIEFGARAGE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "tiefgarage", sourceTIEFGARAGE), sourceTIEFGARAGE));
                copy.setTIEFGARAGE(copyTIEFGARAGE);
            } else {
                copy.tiefgarage = null;
            }
            if (this.carport!= null) {
                Boolean sourceCARPORT;
                sourceCARPORT = this.isCARPORT();
                Boolean copyCARPORT = ((Boolean) strategy.copy(LocatorUtils.property(locator, "carport", sourceCARPORT), sourceCARPORT));
                copy.setCARPORT(copyCARPORT);
            } else {
                copy.carport = null;
            }
            if (this.freiplatz!= null) {
                Boolean sourceFREIPLATZ;
                sourceFREIPLATZ = this.isFREIPLATZ();
                Boolean copyFREIPLATZ = ((Boolean) strategy.copy(LocatorUtils.property(locator, "freiplatz", sourceFREIPLATZ), sourceFREIPLATZ));
                copy.setFREIPLATZ(copyFREIPLATZ);
            } else {
                copy.freiplatz = null;
            }
            if (this.parkhaus!= null) {
                Boolean sourcePARKHAUS;
                sourcePARKHAUS = this.isPARKHAUS();
                Boolean copyPARKHAUS = ((Boolean) strategy.copy(LocatorUtils.property(locator, "parkhaus", sourcePARKHAUS), sourcePARKHAUS));
                copy.setPARKHAUS(copyPARKHAUS);
            } else {
                copy.parkhaus = null;
            }
            if (this.duplex!= null) {
                Boolean sourceDUPLEX;
                sourceDUPLEX = this.isDUPLEX();
                Boolean copyDUPLEX = ((Boolean) strategy.copy(LocatorUtils.property(locator, "duplex", sourceDUPLEX), sourceDUPLEX));
                copy.setDUPLEX(copyDUPLEX);
            } else {
                copy.duplex = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Stellplatzart();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Stellplatzart)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Stellplatzart that = ((Stellplatzart) object);
        {
            Boolean lhsGARAGE;
            lhsGARAGE = this.isGARAGE();
            Boolean rhsGARAGE;
            rhsGARAGE = that.isGARAGE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "garage", lhsGARAGE), LocatorUtils.property(thatLocator, "garage", rhsGARAGE), lhsGARAGE, rhsGARAGE)) {
                return false;
            }
        }
        {
            Boolean lhsTIEFGARAGE;
            lhsTIEFGARAGE = this.isTIEFGARAGE();
            Boolean rhsTIEFGARAGE;
            rhsTIEFGARAGE = that.isTIEFGARAGE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tiefgarage", lhsTIEFGARAGE), LocatorUtils.property(thatLocator, "tiefgarage", rhsTIEFGARAGE), lhsTIEFGARAGE, rhsTIEFGARAGE)) {
                return false;
            }
        }
        {
            Boolean lhsCARPORT;
            lhsCARPORT = this.isCARPORT();
            Boolean rhsCARPORT;
            rhsCARPORT = that.isCARPORT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "carport", lhsCARPORT), LocatorUtils.property(thatLocator, "carport", rhsCARPORT), lhsCARPORT, rhsCARPORT)) {
                return false;
            }
        }
        {
            Boolean lhsFREIPLATZ;
            lhsFREIPLATZ = this.isFREIPLATZ();
            Boolean rhsFREIPLATZ;
            rhsFREIPLATZ = that.isFREIPLATZ();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freiplatz", lhsFREIPLATZ), LocatorUtils.property(thatLocator, "freiplatz", rhsFREIPLATZ), lhsFREIPLATZ, rhsFREIPLATZ)) {
                return false;
            }
        }
        {
            Boolean lhsPARKHAUS;
            lhsPARKHAUS = this.isPARKHAUS();
            Boolean rhsPARKHAUS;
            rhsPARKHAUS = that.isPARKHAUS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parkhaus", lhsPARKHAUS), LocatorUtils.property(thatLocator, "parkhaus", rhsPARKHAUS), lhsPARKHAUS, rhsPARKHAUS)) {
                return false;
            }
        }
        {
            Boolean lhsDUPLEX;
            lhsDUPLEX = this.isDUPLEX();
            Boolean rhsDUPLEX;
            rhsDUPLEX = that.isDUPLEX();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "duplex", lhsDUPLEX), LocatorUtils.property(thatLocator, "duplex", rhsDUPLEX), lhsDUPLEX, rhsDUPLEX)) {
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
