
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
 * Java class for &lt;heizungsart&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "heizungsart")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
public class Heizungsart implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "OFEN")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean ofen;
    @XmlAttribute(name = "ETAGE")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean etage;
    @XmlAttribute(name = "ZENTRAL")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean zentral;
    @XmlAttribute(name = "FERN")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean fern;
    @XmlAttribute(name = "FUSSBODEN")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean fussboden;

    /**
     * Gets the value of the ofen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getOFEN() {
        return ofen;
    }

    /**
     * Sets the value of the ofen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setOFEN(Boolean value) {
        this.ofen = value;
    }

    /**
     * Gets the value of the etage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getETAGE() {
        return etage;
    }

    /**
     * Sets the value of the etage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setETAGE(Boolean value) {
        this.etage = value;
    }

    /**
     * Gets the value of the zentral property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getZENTRAL() {
        return zentral;
    }

    /**
     * Sets the value of the zentral property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setZENTRAL(Boolean value) {
        this.zentral = value;
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
     * Gets the value of the fussboden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getFUSSBODEN() {
        return fussboden;
    }

    /**
     * Sets the value of the fussboden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setFUSSBODEN(Boolean value) {
        this.fussboden = value;
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
            Boolean theOFEN;
            theOFEN = this.getOFEN();
            strategy.appendField(locator, this, "ofen", buffer, theOFEN, (this.ofen!= null));
        }
        {
            Boolean theETAGE;
            theETAGE = this.getETAGE();
            strategy.appendField(locator, this, "etage", buffer, theETAGE, (this.etage!= null));
        }
        {
            Boolean theZENTRAL;
            theZENTRAL = this.getZENTRAL();
            strategy.appendField(locator, this, "zentral", buffer, theZENTRAL, (this.zentral!= null));
        }
        {
            Boolean theFERN;
            theFERN = this.getFERN();
            strategy.appendField(locator, this, "fern", buffer, theFERN, (this.fern!= null));
        }
        {
            Boolean theFUSSBODEN;
            theFUSSBODEN = this.getFUSSBODEN();
            strategy.appendField(locator, this, "fussboden", buffer, theFUSSBODEN, (this.fussboden!= null));
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
        if (draftCopy instanceof Heizungsart) {
            final Heizungsart copy = ((Heizungsart) draftCopy);
            {
                Boolean ofenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ofen!= null));
                if (ofenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceOFEN;
                    sourceOFEN = this.getOFEN();
                    Boolean copyOFEN = ((Boolean) strategy.copy(LocatorUtils.property(locator, "ofen", sourceOFEN), sourceOFEN, (this.ofen!= null)));
                    copy.setOFEN(copyOFEN);
                } else {
                    if (ofenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ofen = null;
                    }
                }
            }
            {
                Boolean etageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.etage!= null));
                if (etageShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceETAGE;
                    sourceETAGE = this.getETAGE();
                    Boolean copyETAGE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "etage", sourceETAGE), sourceETAGE, (this.etage!= null)));
                    copy.setETAGE(copyETAGE);
                } else {
                    if (etageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.etage = null;
                    }
                }
            }
            {
                Boolean zentralShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zentral!= null));
                if (zentralShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceZENTRAL;
                    sourceZENTRAL = this.getZENTRAL();
                    Boolean copyZENTRAL = ((Boolean) strategy.copy(LocatorUtils.property(locator, "zentral", sourceZENTRAL), sourceZENTRAL, (this.zentral!= null)));
                    copy.setZENTRAL(copyZENTRAL);
                } else {
                    if (zentralShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zentral = null;
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
                Boolean fussbodenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fussboden!= null));
                if (fussbodenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceFUSSBODEN;
                    sourceFUSSBODEN = this.getFUSSBODEN();
                    Boolean copyFUSSBODEN = ((Boolean) strategy.copy(LocatorUtils.property(locator, "fussboden", sourceFUSSBODEN), sourceFUSSBODEN, (this.fussboden!= null)));
                    copy.setFUSSBODEN(copyFUSSBODEN);
                } else {
                    if (fussbodenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fussboden = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Heizungsart();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Heizungsart that = ((Heizungsart) object);
        {
            Boolean lhsOFEN;
            lhsOFEN = this.getOFEN();
            Boolean rhsOFEN;
            rhsOFEN = that.getOFEN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ofen", lhsOFEN), LocatorUtils.property(thatLocator, "ofen", rhsOFEN), lhsOFEN, rhsOFEN, (this.ofen!= null), (that.ofen!= null))) {
                return false;
            }
        }
        {
            Boolean lhsETAGE;
            lhsETAGE = this.getETAGE();
            Boolean rhsETAGE;
            rhsETAGE = that.getETAGE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "etage", lhsETAGE), LocatorUtils.property(thatLocator, "etage", rhsETAGE), lhsETAGE, rhsETAGE, (this.etage!= null), (that.etage!= null))) {
                return false;
            }
        }
        {
            Boolean lhsZENTRAL;
            lhsZENTRAL = this.getZENTRAL();
            Boolean rhsZENTRAL;
            rhsZENTRAL = that.getZENTRAL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zentral", lhsZENTRAL), LocatorUtils.property(thatLocator, "zentral", rhsZENTRAL), lhsZENTRAL, rhsZENTRAL, (this.zentral!= null), (that.zentral!= null))) {
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
            Boolean lhsFUSSBODEN;
            lhsFUSSBODEN = this.getFUSSBODEN();
            Boolean rhsFUSSBODEN;
            rhsFUSSBODEN = that.getFUSSBODEN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fussboden", lhsFUSSBODEN), LocatorUtils.property(thatLocator, "fussboden", rhsFUSSBODEN), lhsFUSSBODEN, rhsFUSSBODEN, (this.fussboden!= null), (that.fussboden!= null))) {
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
