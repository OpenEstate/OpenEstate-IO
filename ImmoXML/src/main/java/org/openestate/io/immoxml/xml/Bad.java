
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
 * Java class for &lt;bad&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "bad")
public class Bad implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "DUSCHE")
    protected Boolean dusche;
    @XmlAttribute(name = "WANNE")
    protected Boolean wanne;
    @XmlAttribute(name = "FENSTER")
    protected Boolean fenster;

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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
