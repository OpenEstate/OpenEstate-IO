
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="OEL" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="GAS" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ELEKTRO" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ALTERNATIV" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="SOLAR" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ERDWAERME" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "befeuerung")
public class Befeuerung
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "OEL")
    protected Boolean oel;
    @XmlAttribute(name = "GAS")
    protected Boolean gas;
    @XmlAttribute(name = "ELEKTRO")
    protected Boolean elektro;
    @XmlAttribute(name = "ALTERNATIV")
    protected Boolean alternativ;
    @XmlAttribute(name = "SOLAR")
    protected Boolean solar;
    @XmlAttribute(name = "ERDWAERME")
    protected Boolean erdwaerme;

    /**
     * Gets the value of the oel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOEL() {
        return oel;
    }

    /**
     * Sets the value of the oel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOEL(Boolean value) {
        this.oel = value;
    }

    /**
     * Gets the value of the gas property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGAS() {
        return gas;
    }

    /**
     * Sets the value of the gas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGAS(Boolean value) {
        this.gas = value;
    }

    /**
     * Gets the value of the elektro property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isELEKTRO() {
        return elektro;
    }

    /**
     * Sets the value of the elektro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setELEKTRO(Boolean value) {
        this.elektro = value;
    }

    /**
     * Gets the value of the alternativ property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isALTERNATIV() {
        return alternativ;
    }

    /**
     * Sets the value of the alternativ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setALTERNATIV(Boolean value) {
        this.alternativ = value;
    }

    /**
     * Gets the value of the solar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOLAR() {
        return solar;
    }

    /**
     * Sets the value of the solar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOLAR(Boolean value) {
        this.solar = value;
    }

    /**
     * Gets the value of the erdwaerme property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isERDWAERME() {
        return erdwaerme;
    }

    /**
     * Sets the value of the erdwaerme property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setERDWAERME(Boolean value) {
        this.erdwaerme = value;
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
            Boolean theOEL;
            theOEL = this.isOEL();
            strategy.appendField(locator, this, "oel", buffer, theOEL);
        }
        {
            Boolean theGAS;
            theGAS = this.isGAS();
            strategy.appendField(locator, this, "gas", buffer, theGAS);
        }
        {
            Boolean theELEKTRO;
            theELEKTRO = this.isELEKTRO();
            strategy.appendField(locator, this, "elektro", buffer, theELEKTRO);
        }
        {
            Boolean theALTERNATIV;
            theALTERNATIV = this.isALTERNATIV();
            strategy.appendField(locator, this, "alternativ", buffer, theALTERNATIV);
        }
        {
            Boolean theSOLAR;
            theSOLAR = this.isSOLAR();
            strategy.appendField(locator, this, "solar", buffer, theSOLAR);
        }
        {
            Boolean theERDWAERME;
            theERDWAERME = this.isERDWAERME();
            strategy.appendField(locator, this, "erdwaerme", buffer, theERDWAERME);
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
        if (draftCopy instanceof Befeuerung) {
            final Befeuerung copy = ((Befeuerung) draftCopy);
            if (this.oel!= null) {
                Boolean sourceOEL;
                sourceOEL = this.isOEL();
                Boolean copyOEL = ((Boolean) strategy.copy(LocatorUtils.property(locator, "oel", sourceOEL), sourceOEL));
                copy.setOEL(copyOEL);
            } else {
                copy.oel = null;
            }
            if (this.gas!= null) {
                Boolean sourceGAS;
                sourceGAS = this.isGAS();
                Boolean copyGAS = ((Boolean) strategy.copy(LocatorUtils.property(locator, "gas", sourceGAS), sourceGAS));
                copy.setGAS(copyGAS);
            } else {
                copy.gas = null;
            }
            if (this.elektro!= null) {
                Boolean sourceELEKTRO;
                sourceELEKTRO = this.isELEKTRO();
                Boolean copyELEKTRO = ((Boolean) strategy.copy(LocatorUtils.property(locator, "elektro", sourceELEKTRO), sourceELEKTRO));
                copy.setELEKTRO(copyELEKTRO);
            } else {
                copy.elektro = null;
            }
            if (this.alternativ!= null) {
                Boolean sourceALTERNATIV;
                sourceALTERNATIV = this.isALTERNATIV();
                Boolean copyALTERNATIV = ((Boolean) strategy.copy(LocatorUtils.property(locator, "alternativ", sourceALTERNATIV), sourceALTERNATIV));
                copy.setALTERNATIV(copyALTERNATIV);
            } else {
                copy.alternativ = null;
            }
            if (this.solar!= null) {
                Boolean sourceSOLAR;
                sourceSOLAR = this.isSOLAR();
                Boolean copySOLAR = ((Boolean) strategy.copy(LocatorUtils.property(locator, "solar", sourceSOLAR), sourceSOLAR));
                copy.setSOLAR(copySOLAR);
            } else {
                copy.solar = null;
            }
            if (this.erdwaerme!= null) {
                Boolean sourceERDWAERME;
                sourceERDWAERME = this.isERDWAERME();
                Boolean copyERDWAERME = ((Boolean) strategy.copy(LocatorUtils.property(locator, "erdwaerme", sourceERDWAERME), sourceERDWAERME));
                copy.setERDWAERME(copyERDWAERME);
            } else {
                copy.erdwaerme = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Befeuerung();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Befeuerung)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Befeuerung that = ((Befeuerung) object);
        {
            Boolean lhsOEL;
            lhsOEL = this.isOEL();
            Boolean rhsOEL;
            rhsOEL = that.isOEL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oel", lhsOEL), LocatorUtils.property(thatLocator, "oel", rhsOEL), lhsOEL, rhsOEL)) {
                return false;
            }
        }
        {
            Boolean lhsGAS;
            lhsGAS = this.isGAS();
            Boolean rhsGAS;
            rhsGAS = that.isGAS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gas", lhsGAS), LocatorUtils.property(thatLocator, "gas", rhsGAS), lhsGAS, rhsGAS)) {
                return false;
            }
        }
        {
            Boolean lhsELEKTRO;
            lhsELEKTRO = this.isELEKTRO();
            Boolean rhsELEKTRO;
            rhsELEKTRO = that.isELEKTRO();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "elektro", lhsELEKTRO), LocatorUtils.property(thatLocator, "elektro", rhsELEKTRO), lhsELEKTRO, rhsELEKTRO)) {
                return false;
            }
        }
        {
            Boolean lhsALTERNATIV;
            lhsALTERNATIV = this.isALTERNATIV();
            Boolean rhsALTERNATIV;
            rhsALTERNATIV = that.isALTERNATIV();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alternativ", lhsALTERNATIV), LocatorUtils.property(thatLocator, "alternativ", rhsALTERNATIV), lhsALTERNATIV, rhsALTERNATIV)) {
                return false;
            }
        }
        {
            Boolean lhsSOLAR;
            lhsSOLAR = this.isSOLAR();
            Boolean rhsSOLAR;
            rhsSOLAR = that.isSOLAR();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "solar", lhsSOLAR), LocatorUtils.property(thatLocator, "solar", rhsSOLAR), lhsSOLAR, rhsSOLAR)) {
                return false;
            }
        }
        {
            Boolean lhsERDWAERME;
            lhsERDWAERME = this.isERDWAERME();
            Boolean rhsERDWAERME;
            rhsERDWAERME = that.isERDWAERME();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erdwaerme", lhsERDWAERME), LocatorUtils.property(thatLocator, "erdwaerme", rhsERDWAERME), lhsERDWAERME, rhsERDWAERME)) {
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
