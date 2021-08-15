
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
 * Java class for &lt;befeuerung&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "befeuerung")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
public class Befeuerung implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "OEL")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean oel;
    @XmlAttribute(name = "GAS")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean gas;
    @XmlAttribute(name = "ELEKTRO")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean elektro;
    @XmlAttribute(name = "ALTERNATIV")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean alternativ;
    @XmlAttribute(name = "SOLAR")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean solar;
    @XmlAttribute(name = "ERDWAERME")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean erdwaerme;
    @XmlAttribute(name = "LUFTWP")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean luftwp;
    @XmlAttribute(name = "FERN")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean fern;
    @XmlAttribute(name = "BLOCK")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean block;
    @XmlAttribute(name = "WASSER-ELEKTRO")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean wasserelektro;
    @XmlAttribute(name = "PELLET")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean pellet;
    @XmlAttribute(name = "KOHLE")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean kohle;
    @XmlAttribute(name = "HOLZ")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean holz;
    @XmlAttribute(name = "FLUESSIGGAS")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean fluessiggas;

    /**
     * Gets the value of the oel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getOEL() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getGAS() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getELEKTRO() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getALTERNATIV() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getSOLAR() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getERDWAERME() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setERDWAERME(Boolean value) {
        this.erdwaerme = value;
    }

    /**
     * Gets the value of the luftwp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getLUFTWP() {
        return luftwp;
    }

    /**
     * Sets the value of the luftwp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setLUFTWP(Boolean value) {
        this.luftwp = value;
    }

    /**
     * Gets the value of the fern property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getFERN() {
        return fern;
    }

    /**
     * Sets the value of the fern property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setFERN(Boolean value) {
        this.fern = value;
    }

    /**
     * Gets the value of the block property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getBLOCK() {
        return block;
    }

    /**
     * Sets the value of the block property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setBLOCK(Boolean value) {
        this.block = value;
    }

    /**
     * Gets the value of the wasserelektro property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getWASSERELEKTRO() {
        return wasserelektro;
    }

    /**
     * Sets the value of the wasserelektro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setWASSERELEKTRO(Boolean value) {
        this.wasserelektro = value;
    }

    /**
     * Gets the value of the pellet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getPELLET() {
        return pellet;
    }

    /**
     * Sets the value of the pellet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setPELLET(Boolean value) {
        this.pellet = value;
    }

    /**
     * Gets the value of the kohle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getKOHLE() {
        return kohle;
    }

    /**
     * Sets the value of the kohle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setKOHLE(Boolean value) {
        this.kohle = value;
    }

    /**
     * Gets the value of the holz property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getHOLZ() {
        return holz;
    }

    /**
     * Sets the value of the holz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setHOLZ(Boolean value) {
        this.holz = value;
    }

    /**
     * Gets the value of the fluessiggas property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getFLUESSIGGAS() {
        return fluessiggas;
    }

    /**
     * Sets the value of the fluessiggas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setFLUESSIGGAS(Boolean value) {
        this.fluessiggas = value;
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
            Boolean theOEL;
            theOEL = this.getOEL();
            strategy.appendField(locator, this, "oel", buffer, theOEL, (this.oel!= null));
        }
        {
            Boolean theGAS;
            theGAS = this.getGAS();
            strategy.appendField(locator, this, "gas", buffer, theGAS, (this.gas!= null));
        }
        {
            Boolean theELEKTRO;
            theELEKTRO = this.getELEKTRO();
            strategy.appendField(locator, this, "elektro", buffer, theELEKTRO, (this.elektro!= null));
        }
        {
            Boolean theALTERNATIV;
            theALTERNATIV = this.getALTERNATIV();
            strategy.appendField(locator, this, "alternativ", buffer, theALTERNATIV, (this.alternativ!= null));
        }
        {
            Boolean theSOLAR;
            theSOLAR = this.getSOLAR();
            strategy.appendField(locator, this, "solar", buffer, theSOLAR, (this.solar!= null));
        }
        {
            Boolean theERDWAERME;
            theERDWAERME = this.getERDWAERME();
            strategy.appendField(locator, this, "erdwaerme", buffer, theERDWAERME, (this.erdwaerme!= null));
        }
        {
            Boolean theLUFTWP;
            theLUFTWP = this.getLUFTWP();
            strategy.appendField(locator, this, "luftwp", buffer, theLUFTWP, (this.luftwp!= null));
        }
        {
            Boolean theFERN;
            theFERN = this.getFERN();
            strategy.appendField(locator, this, "fern", buffer, theFERN, (this.fern!= null));
        }
        {
            Boolean theBLOCK;
            theBLOCK = this.getBLOCK();
            strategy.appendField(locator, this, "block", buffer, theBLOCK, (this.block!= null));
        }
        {
            Boolean theWASSERELEKTRO;
            theWASSERELEKTRO = this.getWASSERELEKTRO();
            strategy.appendField(locator, this, "wasserelektro", buffer, theWASSERELEKTRO, (this.wasserelektro!= null));
        }
        {
            Boolean thePELLET;
            thePELLET = this.getPELLET();
            strategy.appendField(locator, this, "pellet", buffer, thePELLET, (this.pellet!= null));
        }
        {
            Boolean theKOHLE;
            theKOHLE = this.getKOHLE();
            strategy.appendField(locator, this, "kohle", buffer, theKOHLE, (this.kohle!= null));
        }
        {
            Boolean theHOLZ;
            theHOLZ = this.getHOLZ();
            strategy.appendField(locator, this, "holz", buffer, theHOLZ, (this.holz!= null));
        }
        {
            Boolean theFLUESSIGGAS;
            theFLUESSIGGAS = this.getFLUESSIGGAS();
            strategy.appendField(locator, this, "fluessiggas", buffer, theFLUESSIGGAS, (this.fluessiggas!= null));
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
        if (draftCopy instanceof Befeuerung) {
            final Befeuerung copy = ((Befeuerung) draftCopy);
            {
                Boolean oelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.oel!= null));
                if (oelShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceOEL;
                    sourceOEL = this.getOEL();
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
                    sourceGAS = this.getGAS();
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
                    sourceELEKTRO = this.getELEKTRO();
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
                    sourceALTERNATIV = this.getALTERNATIV();
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
                    sourceSOLAR = this.getSOLAR();
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
                    sourceERDWAERME = this.getERDWAERME();
                    Boolean copyERDWAERME = ((Boolean) strategy.copy(LocatorUtils.property(locator, "erdwaerme", sourceERDWAERME), sourceERDWAERME, (this.erdwaerme!= null)));
                    copy.setERDWAERME(copyERDWAERME);
                } else {
                    if (erdwaermeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.erdwaerme = null;
                    }
                }
            }
            {
                Boolean luftwpShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.luftwp!= null));
                if (luftwpShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceLUFTWP;
                    sourceLUFTWP = this.getLUFTWP();
                    Boolean copyLUFTWP = ((Boolean) strategy.copy(LocatorUtils.property(locator, "luftwp", sourceLUFTWP), sourceLUFTWP, (this.luftwp!= null)));
                    copy.setLUFTWP(copyLUFTWP);
                } else {
                    if (luftwpShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.luftwp = null;
                    }
                }
            }
            {
                Boolean fernShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fern!= null));
                if (fernShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceFERN;
                    sourceFERN = this.getFERN();
                    Boolean copyFERN = ((Boolean) strategy.copy(LocatorUtils.property(locator, "fern", sourceFERN), sourceFERN, (this.fern!= null)));
                    copy.setFERN(copyFERN);
                } else {
                    if (fernShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fern = null;
                    }
                }
            }
            {
                Boolean blockShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.block!= null));
                if (blockShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceBLOCK;
                    sourceBLOCK = this.getBLOCK();
                    Boolean copyBLOCK = ((Boolean) strategy.copy(LocatorUtils.property(locator, "block", sourceBLOCK), sourceBLOCK, (this.block!= null)));
                    copy.setBLOCK(copyBLOCK);
                } else {
                    if (blockShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.block = null;
                    }
                }
            }
            {
                Boolean wasserelektroShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wasserelektro!= null));
                if (wasserelektroShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceWASSERELEKTRO;
                    sourceWASSERELEKTRO = this.getWASSERELEKTRO();
                    Boolean copyWASSERELEKTRO = ((Boolean) strategy.copy(LocatorUtils.property(locator, "wasserelektro", sourceWASSERELEKTRO), sourceWASSERELEKTRO, (this.wasserelektro!= null)));
                    copy.setWASSERELEKTRO(copyWASSERELEKTRO);
                } else {
                    if (wasserelektroShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wasserelektro = null;
                    }
                }
            }
            {
                Boolean pelletShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pellet!= null));
                if (pelletShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourcePELLET;
                    sourcePELLET = this.getPELLET();
                    Boolean copyPELLET = ((Boolean) strategy.copy(LocatorUtils.property(locator, "pellet", sourcePELLET), sourcePELLET, (this.pellet!= null)));
                    copy.setPELLET(copyPELLET);
                } else {
                    if (pelletShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pellet = null;
                    }
                }
            }
            {
                Boolean kohleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kohle!= null));
                if (kohleShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceKOHLE;
                    sourceKOHLE = this.getKOHLE();
                    Boolean copyKOHLE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kohle", sourceKOHLE), sourceKOHLE, (this.kohle!= null)));
                    copy.setKOHLE(copyKOHLE);
                } else {
                    if (kohleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kohle = null;
                    }
                }
            }
            {
                Boolean holzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.holz!= null));
                if (holzShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceHOLZ;
                    sourceHOLZ = this.getHOLZ();
                    Boolean copyHOLZ = ((Boolean) strategy.copy(LocatorUtils.property(locator, "holz", sourceHOLZ), sourceHOLZ, (this.holz!= null)));
                    copy.setHOLZ(copyHOLZ);
                } else {
                    if (holzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.holz = null;
                    }
                }
            }
            {
                Boolean fluessiggasShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fluessiggas!= null));
                if (fluessiggasShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceFLUESSIGGAS;
                    sourceFLUESSIGGAS = this.getFLUESSIGGAS();
                    Boolean copyFLUESSIGGAS = ((Boolean) strategy.copy(LocatorUtils.property(locator, "fluessiggas", sourceFLUESSIGGAS), sourceFLUESSIGGAS, (this.fluessiggas!= null)));
                    copy.setFLUESSIGGAS(copyFLUESSIGGAS);
                } else {
                    if (fluessiggasShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fluessiggas = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Befeuerung();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
            lhsOEL = this.getOEL();
            Boolean rhsOEL;
            rhsOEL = that.getOEL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oel", lhsOEL), LocatorUtils.property(thatLocator, "oel", rhsOEL), lhsOEL, rhsOEL, (this.oel!= null), (that.oel!= null))) {
                return false;
            }
        }
        {
            Boolean lhsGAS;
            lhsGAS = this.getGAS();
            Boolean rhsGAS;
            rhsGAS = that.getGAS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gas", lhsGAS), LocatorUtils.property(thatLocator, "gas", rhsGAS), lhsGAS, rhsGAS, (this.gas!= null), (that.gas!= null))) {
                return false;
            }
        }
        {
            Boolean lhsELEKTRO;
            lhsELEKTRO = this.getELEKTRO();
            Boolean rhsELEKTRO;
            rhsELEKTRO = that.getELEKTRO();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "elektro", lhsELEKTRO), LocatorUtils.property(thatLocator, "elektro", rhsELEKTRO), lhsELEKTRO, rhsELEKTRO, (this.elektro!= null), (that.elektro!= null))) {
                return false;
            }
        }
        {
            Boolean lhsALTERNATIV;
            lhsALTERNATIV = this.getALTERNATIV();
            Boolean rhsALTERNATIV;
            rhsALTERNATIV = that.getALTERNATIV();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alternativ", lhsALTERNATIV), LocatorUtils.property(thatLocator, "alternativ", rhsALTERNATIV), lhsALTERNATIV, rhsALTERNATIV, (this.alternativ!= null), (that.alternativ!= null))) {
                return false;
            }
        }
        {
            Boolean lhsSOLAR;
            lhsSOLAR = this.getSOLAR();
            Boolean rhsSOLAR;
            rhsSOLAR = that.getSOLAR();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "solar", lhsSOLAR), LocatorUtils.property(thatLocator, "solar", rhsSOLAR), lhsSOLAR, rhsSOLAR, (this.solar!= null), (that.solar!= null))) {
                return false;
            }
        }
        {
            Boolean lhsERDWAERME;
            lhsERDWAERME = this.getERDWAERME();
            Boolean rhsERDWAERME;
            rhsERDWAERME = that.getERDWAERME();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erdwaerme", lhsERDWAERME), LocatorUtils.property(thatLocator, "erdwaerme", rhsERDWAERME), lhsERDWAERME, rhsERDWAERME, (this.erdwaerme!= null), (that.erdwaerme!= null))) {
                return false;
            }
        }
        {
            Boolean lhsLUFTWP;
            lhsLUFTWP = this.getLUFTWP();
            Boolean rhsLUFTWP;
            rhsLUFTWP = that.getLUFTWP();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "luftwp", lhsLUFTWP), LocatorUtils.property(thatLocator, "luftwp", rhsLUFTWP), lhsLUFTWP, rhsLUFTWP, (this.luftwp!= null), (that.luftwp!= null))) {
                return false;
            }
        }
        {
            Boolean lhsFERN;
            lhsFERN = this.getFERN();
            Boolean rhsFERN;
            rhsFERN = that.getFERN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fern", lhsFERN), LocatorUtils.property(thatLocator, "fern", rhsFERN), lhsFERN, rhsFERN, (this.fern!= null), (that.fern!= null))) {
                return false;
            }
        }
        {
            Boolean lhsBLOCK;
            lhsBLOCK = this.getBLOCK();
            Boolean rhsBLOCK;
            rhsBLOCK = that.getBLOCK();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "block", lhsBLOCK), LocatorUtils.property(thatLocator, "block", rhsBLOCK), lhsBLOCK, rhsBLOCK, (this.block!= null), (that.block!= null))) {
                return false;
            }
        }
        {
            Boolean lhsWASSERELEKTRO;
            lhsWASSERELEKTRO = this.getWASSERELEKTRO();
            Boolean rhsWASSERELEKTRO;
            rhsWASSERELEKTRO = that.getWASSERELEKTRO();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wasserelektro", lhsWASSERELEKTRO), LocatorUtils.property(thatLocator, "wasserelektro", rhsWASSERELEKTRO), lhsWASSERELEKTRO, rhsWASSERELEKTRO, (this.wasserelektro!= null), (that.wasserelektro!= null))) {
                return false;
            }
        }
        {
            Boolean lhsPELLET;
            lhsPELLET = this.getPELLET();
            Boolean rhsPELLET;
            rhsPELLET = that.getPELLET();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pellet", lhsPELLET), LocatorUtils.property(thatLocator, "pellet", rhsPELLET), lhsPELLET, rhsPELLET, (this.pellet!= null), (that.pellet!= null))) {
                return false;
            }
        }
        {
            Boolean lhsKOHLE;
            lhsKOHLE = this.getKOHLE();
            Boolean rhsKOHLE;
            rhsKOHLE = that.getKOHLE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kohle", lhsKOHLE), LocatorUtils.property(thatLocator, "kohle", rhsKOHLE), lhsKOHLE, rhsKOHLE, (this.kohle!= null), (that.kohle!= null))) {
                return false;
            }
        }
        {
            Boolean lhsHOLZ;
            lhsHOLZ = this.getHOLZ();
            Boolean rhsHOLZ;
            rhsHOLZ = that.getHOLZ();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "holz", lhsHOLZ), LocatorUtils.property(thatLocator, "holz", rhsHOLZ), lhsHOLZ, rhsHOLZ, (this.holz!= null), (that.holz!= null))) {
                return false;
            }
        }
        {
            Boolean lhsFLUESSIGGAS;
            lhsFLUESSIGGAS = this.getFLUESSIGGAS();
            Boolean rhsFLUESSIGGAS;
            rhsFLUESSIGGAS = that.getFLUESSIGGAS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fluessiggas", lhsFLUESSIGGAS), LocatorUtils.property(thatLocator, "fluessiggas", rhsFLUESSIGGAS), lhsFLUESSIGGAS, rhsFLUESSIGGAS, (this.fluessiggas!= null), (that.fluessiggas!= null))) {
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
