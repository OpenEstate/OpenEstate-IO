
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
 *       &lt;attribute name="LUFTWP" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="FERN" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="BLOCK" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="WASSER-ELEKTRO" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="PELLET" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="KOHLE" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="HOLZ" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="FLUESSIGGAS" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    @XmlAttribute(name = "LUFTWP")
    protected Boolean luftwp;
    @XmlAttribute(name = "FERN")
    protected Boolean fern;
    @XmlAttribute(name = "BLOCK")
    protected Boolean block;
    @XmlAttribute(name = "WASSER-ELEKTRO")
    protected Boolean wasserelektro;
    @XmlAttribute(name = "PELLET")
    protected Boolean pellet;
    @XmlAttribute(name = "KOHLE")
    protected Boolean kohle;
    @XmlAttribute(name = "HOLZ")
    protected Boolean holz;
    @XmlAttribute(name = "FLUESSIGGAS")
    protected Boolean fluessiggas;

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

    /**
     * Gets the value of the luftwp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLUFTWP() {
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
    public Boolean isFERN() {
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
    public Boolean isBLOCK() {
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
    public Boolean isWASSERELEKTRO() {
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
    public Boolean isPELLET() {
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
    public Boolean isKOHLE() {
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
    public Boolean isHOLZ() {
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
    public Boolean isFLUESSIGGAS() {
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
    public void setFLUESSIGGAS(Boolean value) {
        this.fluessiggas = value;
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
        {
            Boolean theLUFTWP;
            theLUFTWP = this.isLUFTWP();
            strategy.appendField(locator, this, "luftwp", buffer, theLUFTWP);
        }
        {
            Boolean theFERN;
            theFERN = this.isFERN();
            strategy.appendField(locator, this, "fern", buffer, theFERN);
        }
        {
            Boolean theBLOCK;
            theBLOCK = this.isBLOCK();
            strategy.appendField(locator, this, "block", buffer, theBLOCK);
        }
        {
            Boolean theWASSERELEKTRO;
            theWASSERELEKTRO = this.isWASSERELEKTRO();
            strategy.appendField(locator, this, "wasserelektro", buffer, theWASSERELEKTRO);
        }
        {
            Boolean thePELLET;
            thePELLET = this.isPELLET();
            strategy.appendField(locator, this, "pellet", buffer, thePELLET);
        }
        {
            Boolean theKOHLE;
            theKOHLE = this.isKOHLE();
            strategy.appendField(locator, this, "kohle", buffer, theKOHLE);
        }
        {
            Boolean theHOLZ;
            theHOLZ = this.isHOLZ();
            strategy.appendField(locator, this, "holz", buffer, theHOLZ);
        }
        {
            Boolean theFLUESSIGGAS;
            theFLUESSIGGAS = this.isFLUESSIGGAS();
            strategy.appendField(locator, this, "fluessiggas", buffer, theFLUESSIGGAS);
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
            if (this.luftwp!= null) {
                Boolean sourceLUFTWP;
                sourceLUFTWP = this.isLUFTWP();
                Boolean copyLUFTWP = ((Boolean) strategy.copy(LocatorUtils.property(locator, "luftwp", sourceLUFTWP), sourceLUFTWP));
                copy.setLUFTWP(copyLUFTWP);
            } else {
                copy.luftwp = null;
            }
            if (this.fern!= null) {
                Boolean sourceFERN;
                sourceFERN = this.isFERN();
                Boolean copyFERN = ((Boolean) strategy.copy(LocatorUtils.property(locator, "fern", sourceFERN), sourceFERN));
                copy.setFERN(copyFERN);
            } else {
                copy.fern = null;
            }
            if (this.block!= null) {
                Boolean sourceBLOCK;
                sourceBLOCK = this.isBLOCK();
                Boolean copyBLOCK = ((Boolean) strategy.copy(LocatorUtils.property(locator, "block", sourceBLOCK), sourceBLOCK));
                copy.setBLOCK(copyBLOCK);
            } else {
                copy.block = null;
            }
            if (this.wasserelektro!= null) {
                Boolean sourceWASSERELEKTRO;
                sourceWASSERELEKTRO = this.isWASSERELEKTRO();
                Boolean copyWASSERELEKTRO = ((Boolean) strategy.copy(LocatorUtils.property(locator, "wasserelektro", sourceWASSERELEKTRO), sourceWASSERELEKTRO));
                copy.setWASSERELEKTRO(copyWASSERELEKTRO);
            } else {
                copy.wasserelektro = null;
            }
            if (this.pellet!= null) {
                Boolean sourcePELLET;
                sourcePELLET = this.isPELLET();
                Boolean copyPELLET = ((Boolean) strategy.copy(LocatorUtils.property(locator, "pellet", sourcePELLET), sourcePELLET));
                copy.setPELLET(copyPELLET);
            } else {
                copy.pellet = null;
            }
            if (this.kohle!= null) {
                Boolean sourceKOHLE;
                sourceKOHLE = this.isKOHLE();
                Boolean copyKOHLE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kohle", sourceKOHLE), sourceKOHLE));
                copy.setKOHLE(copyKOHLE);
            } else {
                copy.kohle = null;
            }
            if (this.holz!= null) {
                Boolean sourceHOLZ;
                sourceHOLZ = this.isHOLZ();
                Boolean copyHOLZ = ((Boolean) strategy.copy(LocatorUtils.property(locator, "holz", sourceHOLZ), sourceHOLZ));
                copy.setHOLZ(copyHOLZ);
            } else {
                copy.holz = null;
            }
            if (this.fluessiggas!= null) {
                Boolean sourceFLUESSIGGAS;
                sourceFLUESSIGGAS = this.isFLUESSIGGAS();
                Boolean copyFLUESSIGGAS = ((Boolean) strategy.copy(LocatorUtils.property(locator, "fluessiggas", sourceFLUESSIGGAS), sourceFLUESSIGGAS));
                copy.setFLUESSIGGAS(copyFLUESSIGGAS);
            } else {
                copy.fluessiggas = null;
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
        {
            Boolean lhsLUFTWP;
            lhsLUFTWP = this.isLUFTWP();
            Boolean rhsLUFTWP;
            rhsLUFTWP = that.isLUFTWP();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "luftwp", lhsLUFTWP), LocatorUtils.property(thatLocator, "luftwp", rhsLUFTWP), lhsLUFTWP, rhsLUFTWP)) {
                return false;
            }
        }
        {
            Boolean lhsFERN;
            lhsFERN = this.isFERN();
            Boolean rhsFERN;
            rhsFERN = that.isFERN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fern", lhsFERN), LocatorUtils.property(thatLocator, "fern", rhsFERN), lhsFERN, rhsFERN)) {
                return false;
            }
        }
        {
            Boolean lhsBLOCK;
            lhsBLOCK = this.isBLOCK();
            Boolean rhsBLOCK;
            rhsBLOCK = that.isBLOCK();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "block", lhsBLOCK), LocatorUtils.property(thatLocator, "block", rhsBLOCK), lhsBLOCK, rhsBLOCK)) {
                return false;
            }
        }
        {
            Boolean lhsWASSERELEKTRO;
            lhsWASSERELEKTRO = this.isWASSERELEKTRO();
            Boolean rhsWASSERELEKTRO;
            rhsWASSERELEKTRO = that.isWASSERELEKTRO();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wasserelektro", lhsWASSERELEKTRO), LocatorUtils.property(thatLocator, "wasserelektro", rhsWASSERELEKTRO), lhsWASSERELEKTRO, rhsWASSERELEKTRO)) {
                return false;
            }
        }
        {
            Boolean lhsPELLET;
            lhsPELLET = this.isPELLET();
            Boolean rhsPELLET;
            rhsPELLET = that.isPELLET();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pellet", lhsPELLET), LocatorUtils.property(thatLocator, "pellet", rhsPELLET), lhsPELLET, rhsPELLET)) {
                return false;
            }
        }
        {
            Boolean lhsKOHLE;
            lhsKOHLE = this.isKOHLE();
            Boolean rhsKOHLE;
            rhsKOHLE = that.isKOHLE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kohle", lhsKOHLE), LocatorUtils.property(thatLocator, "kohle", rhsKOHLE), lhsKOHLE, rhsKOHLE)) {
                return false;
            }
        }
        {
            Boolean lhsHOLZ;
            lhsHOLZ = this.isHOLZ();
            Boolean rhsHOLZ;
            rhsHOLZ = that.isHOLZ();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "holz", lhsHOLZ), LocatorUtils.property(thatLocator, "holz", rhsHOLZ), lhsHOLZ, rhsHOLZ)) {
                return false;
            }
        }
        {
            Boolean lhsFLUESSIGGAS;
            lhsFLUESSIGGAS = this.isFLUESSIGGAS();
            Boolean rhsFLUESSIGGAS;
            rhsFLUESSIGGAS = that.isFLUESSIGGAS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fluessiggas", lhsFLUESSIGGAS), LocatorUtils.property(thatLocator, "fluessiggas", rhsFLUESSIGGAS), lhsFLUESSIGGAS, rhsFLUESSIGGAS)) {
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
