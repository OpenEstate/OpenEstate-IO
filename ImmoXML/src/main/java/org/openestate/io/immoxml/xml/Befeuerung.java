
package org.openestate.io.immoxml.xml;

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
 * Java class for &lt;befeuerung&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "befeuerung")
public class Befeuerung implements Cloneable, CopyTo2, Equals2, ToString2
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
            Boolean theOEL;
            theOEL = this.isOEL();
            strategy.appendField(locator, this, "oel", buffer, theOEL, (this.oel!= null));
        }
        {
            Boolean theGAS;
            theGAS = this.isGAS();
            strategy.appendField(locator, this, "gas", buffer, theGAS, (this.gas!= null));
        }
        {
            Boolean theELEKTRO;
            theELEKTRO = this.isELEKTRO();
            strategy.appendField(locator, this, "elektro", buffer, theELEKTRO, (this.elektro!= null));
        }
        {
            Boolean theALTERNATIV;
            theALTERNATIV = this.isALTERNATIV();
            strategy.appendField(locator, this, "alternativ", buffer, theALTERNATIV, (this.alternativ!= null));
        }
        {
            Boolean theSOLAR;
            theSOLAR = this.isSOLAR();
            strategy.appendField(locator, this, "solar", buffer, theSOLAR, (this.solar!= null));
        }
        {
            Boolean theERDWAERME;
            theERDWAERME = this.isERDWAERME();
            strategy.appendField(locator, this, "erdwaerme", buffer, theERDWAERME, (this.erdwaerme!= null));
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
        if (draftCopy instanceof Befeuerung) {
            final Befeuerung copy = ((Befeuerung) draftCopy);
            {
                Boolean oelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.oel!= null));
                if (oelShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceOEL;
                    sourceOEL = this.isOEL();
                    Boolean copyOEL = ((Boolean) strategy.copy(LocatorUtils.property(locator, "oel", sourceOEL), sourceOEL, (this.oel!= null)));
                    copy.setOEL(copyOEL);
                } else {
                    if (oelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.oel = null;
                    }
                }
            }
            {
                Boolean gasShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gas!= null));
                if (gasShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceGAS;
                    sourceGAS = this.isGAS();
                    Boolean copyGAS = ((Boolean) strategy.copy(LocatorUtils.property(locator, "gas", sourceGAS), sourceGAS, (this.gas!= null)));
                    copy.setGAS(copyGAS);
                } else {
                    if (gasShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gas = null;
                    }
                }
            }
            {
                Boolean elektroShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.elektro!= null));
                if (elektroShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceELEKTRO;
                    sourceELEKTRO = this.isELEKTRO();
                    Boolean copyELEKTRO = ((Boolean) strategy.copy(LocatorUtils.property(locator, "elektro", sourceELEKTRO), sourceELEKTRO, (this.elektro!= null)));
                    copy.setELEKTRO(copyELEKTRO);
                } else {
                    if (elektroShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.elektro = null;
                    }
                }
            }
            {
                Boolean alternativShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.alternativ!= null));
                if (alternativShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceALTERNATIV;
                    sourceALTERNATIV = this.isALTERNATIV();
                    Boolean copyALTERNATIV = ((Boolean) strategy.copy(LocatorUtils.property(locator, "alternativ", sourceALTERNATIV), sourceALTERNATIV, (this.alternativ!= null)));
                    copy.setALTERNATIV(copyALTERNATIV);
                } else {
                    if (alternativShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.alternativ = null;
                    }
                }
            }
            {
                Boolean solarShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.solar!= null));
                if (solarShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceSOLAR;
                    sourceSOLAR = this.isSOLAR();
                    Boolean copySOLAR = ((Boolean) strategy.copy(LocatorUtils.property(locator, "solar", sourceSOLAR), sourceSOLAR, (this.solar!= null)));
                    copy.setSOLAR(copySOLAR);
                } else {
                    if (solarShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.solar = null;
                    }
                }
            }
            {
                Boolean erdwaermeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.erdwaerme!= null));
                if (erdwaermeShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceERDWAERME;
                    sourceERDWAERME = this.isERDWAERME();
                    Boolean copyERDWAERME = ((Boolean) strategy.copy(LocatorUtils.property(locator, "erdwaerme", sourceERDWAERME), sourceERDWAERME, (this.erdwaerme!= null)));
                    copy.setERDWAERME(copyERDWAERME);
                } else {
                    if (erdwaermeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.erdwaerme = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Befeuerung();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oel", lhsOEL), LocatorUtils.property(thatLocator, "oel", rhsOEL), lhsOEL, rhsOEL, (this.oel!= null), (that.oel!= null))) {
                return false;
            }
        }
        {
            Boolean lhsGAS;
            lhsGAS = this.isGAS();
            Boolean rhsGAS;
            rhsGAS = that.isGAS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gas", lhsGAS), LocatorUtils.property(thatLocator, "gas", rhsGAS), lhsGAS, rhsGAS, (this.gas!= null), (that.gas!= null))) {
                return false;
            }
        }
        {
            Boolean lhsELEKTRO;
            lhsELEKTRO = this.isELEKTRO();
            Boolean rhsELEKTRO;
            rhsELEKTRO = that.isELEKTRO();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "elektro", lhsELEKTRO), LocatorUtils.property(thatLocator, "elektro", rhsELEKTRO), lhsELEKTRO, rhsELEKTRO, (this.elektro!= null), (that.elektro!= null))) {
                return false;
            }
        }
        {
            Boolean lhsALTERNATIV;
            lhsALTERNATIV = this.isALTERNATIV();
            Boolean rhsALTERNATIV;
            rhsALTERNATIV = that.isALTERNATIV();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alternativ", lhsALTERNATIV), LocatorUtils.property(thatLocator, "alternativ", rhsALTERNATIV), lhsALTERNATIV, rhsALTERNATIV, (this.alternativ!= null), (that.alternativ!= null))) {
                return false;
            }
        }
        {
            Boolean lhsSOLAR;
            lhsSOLAR = this.isSOLAR();
            Boolean rhsSOLAR;
            rhsSOLAR = that.isSOLAR();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "solar", lhsSOLAR), LocatorUtils.property(thatLocator, "solar", rhsSOLAR), lhsSOLAR, rhsSOLAR, (this.solar!= null), (that.solar!= null))) {
                return false;
            }
        }
        {
            Boolean lhsERDWAERME;
            lhsERDWAERME = this.isERDWAERME();
            Boolean rhsERDWAERME;
            rhsERDWAERME = that.isERDWAERME();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erdwaerme", lhsERDWAERME), LocatorUtils.property(thatLocator, "erdwaerme", rhsERDWAERME), lhsERDWAERME, rhsERDWAERME, (this.erdwaerme!= null), (that.erdwaerme!= null))) {
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
