
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
 * Java class for &lt;bad&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "bad")
public class Bad implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "DUSCHE")
    protected Boolean dusche;
    @XmlAttribute(name = "WANNE")
    protected Boolean wanne;
    @XmlAttribute(name = "FENSTER")
    protected Boolean fenster;
    @XmlAttribute(name = "BIDET")
    protected Boolean bidet;
    @XmlAttribute(name = "PISSOIR")
    protected Boolean pissoir;

    /**
     * Gets the value of the dusche property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDUSCHE() {
        return dusche;
    }

    /**
     * Sets the value of the dusche property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDUSCHE(Boolean value) {
        this.dusche = value;
    }

    /**
     * Gets the value of the wanne property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWANNE() {
        return wanne;
    }

    /**
     * Sets the value of the wanne property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWANNE(Boolean value) {
        this.wanne = value;
    }

    /**
     * Gets the value of the fenster property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFENSTER() {
        return fenster;
    }

    /**
     * Sets the value of the fenster property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFENSTER(Boolean value) {
        this.fenster = value;
    }

    /**
     * Gets the value of the bidet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBIDET() {
        return bidet;
    }

    /**
     * Sets the value of the bidet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBIDET(Boolean value) {
        this.bidet = value;
    }

    /**
     * Gets the value of the pissoir property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPISSOIR() {
        return pissoir;
    }

    /**
     * Sets the value of the pissoir property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPISSOIR(Boolean value) {
        this.pissoir = value;
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
            Boolean theDUSCHE;
            theDUSCHE = this.isDUSCHE();
            strategy.appendField(locator, this, "dusche", buffer, theDUSCHE, (this.dusche!= null));
        }
        {
            Boolean theWANNE;
            theWANNE = this.isWANNE();
            strategy.appendField(locator, this, "wanne", buffer, theWANNE, (this.wanne!= null));
        }
        {
            Boolean theFENSTER;
            theFENSTER = this.isFENSTER();
            strategy.appendField(locator, this, "fenster", buffer, theFENSTER, (this.fenster!= null));
        }
        {
            Boolean theBIDET;
            theBIDET = this.isBIDET();
            strategy.appendField(locator, this, "bidet", buffer, theBIDET, (this.bidet!= null));
        }
        {
            Boolean thePISSOIR;
            thePISSOIR = this.isPISSOIR();
            strategy.appendField(locator, this, "pissoir", buffer, thePISSOIR, (this.pissoir!= null));
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
        if (draftCopy instanceof Bad) {
            final Bad copy = ((Bad) draftCopy);
            {
                Boolean duscheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dusche!= null));
                if (duscheShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceDUSCHE;
                    sourceDUSCHE = this.isDUSCHE();
                    Boolean copyDUSCHE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "dusche", sourceDUSCHE), sourceDUSCHE, (this.dusche!= null)));
                    copy.setDUSCHE(copyDUSCHE);
                } else {
                    if (duscheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dusche = null;
                    }
                }
            }
            {
                Boolean wanneShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wanne!= null));
                if (wanneShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceWANNE;
                    sourceWANNE = this.isWANNE();
                    Boolean copyWANNE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "wanne", sourceWANNE), sourceWANNE, (this.wanne!= null)));
                    copy.setWANNE(copyWANNE);
                } else {
                    if (wanneShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wanne = null;
                    }
                }
            }
            {
                Boolean fensterShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fenster!= null));
                if (fensterShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceFENSTER;
                    sourceFENSTER = this.isFENSTER();
                    Boolean copyFENSTER = ((Boolean) strategy.copy(LocatorUtils.property(locator, "fenster", sourceFENSTER), sourceFENSTER, (this.fenster!= null)));
                    copy.setFENSTER(copyFENSTER);
                } else {
                    if (fensterShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fenster = null;
                    }
                }
            }
            {
                Boolean bidetShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bidet!= null));
                if (bidetShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceBIDET;
                    sourceBIDET = this.isBIDET();
                    Boolean copyBIDET = ((Boolean) strategy.copy(LocatorUtils.property(locator, "bidet", sourceBIDET), sourceBIDET, (this.bidet!= null)));
                    copy.setBIDET(copyBIDET);
                } else {
                    if (bidetShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bidet = null;
                    }
                }
            }
            {
                Boolean pissoirShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pissoir!= null));
                if (pissoirShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourcePISSOIR;
                    sourcePISSOIR = this.isPISSOIR();
                    Boolean copyPISSOIR = ((Boolean) strategy.copy(LocatorUtils.property(locator, "pissoir", sourcePISSOIR), sourcePISSOIR, (this.pissoir!= null)));
                    copy.setPISSOIR(copyPISSOIR);
                } else {
                    if (pissoirShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pissoir = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Bad();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Bad that = ((Bad) object);
        {
            Boolean lhsDUSCHE;
            lhsDUSCHE = this.isDUSCHE();
            Boolean rhsDUSCHE;
            rhsDUSCHE = that.isDUSCHE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dusche", lhsDUSCHE), LocatorUtils.property(thatLocator, "dusche", rhsDUSCHE), lhsDUSCHE, rhsDUSCHE, (this.dusche!= null), (that.dusche!= null))) {
                return false;
            }
        }
        {
            Boolean lhsWANNE;
            lhsWANNE = this.isWANNE();
            Boolean rhsWANNE;
            rhsWANNE = that.isWANNE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wanne", lhsWANNE), LocatorUtils.property(thatLocator, "wanne", rhsWANNE), lhsWANNE, rhsWANNE, (this.wanne!= null), (that.wanne!= null))) {
                return false;
            }
        }
        {
            Boolean lhsFENSTER;
            lhsFENSTER = this.isFENSTER();
            Boolean rhsFENSTER;
            rhsFENSTER = that.isFENSTER();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fenster", lhsFENSTER), LocatorUtils.property(thatLocator, "fenster", rhsFENSTER), lhsFENSTER, rhsFENSTER, (this.fenster!= null), (that.fenster!= null))) {
                return false;
            }
        }
        {
            Boolean lhsBIDET;
            lhsBIDET = this.isBIDET();
            Boolean rhsBIDET;
            rhsBIDET = that.isBIDET();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bidet", lhsBIDET), LocatorUtils.property(thatLocator, "bidet", rhsBIDET), lhsBIDET, rhsBIDET, (this.bidet!= null), (that.bidet!= null))) {
                return false;
            }
        }
        {
            Boolean lhsPISSOIR;
            lhsPISSOIR = this.isPISSOIR();
            Boolean rhsPISSOIR;
            rhsPISSOIR = that.isPISSOIR();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pissoir", lhsPISSOIR), LocatorUtils.property(thatLocator, "pissoir", rhsPISSOIR), lhsPISSOIR, rhsPISSOIR, (this.pissoir!= null), (that.pissoir!= null))) {
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
