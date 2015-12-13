
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
 * Java class for &lt;bad&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "bad")
public class Bad
    implements Cloneable, CopyTo, Equals, ToString
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
            Boolean theDUSCHE;
            theDUSCHE = this.isDUSCHE();
            strategy.appendField(locator, this, "dusche", buffer, theDUSCHE);
        }
        {
            Boolean theWANNE;
            theWANNE = this.isWANNE();
            strategy.appendField(locator, this, "wanne", buffer, theWANNE);
        }
        {
            Boolean theFENSTER;
            theFENSTER = this.isFENSTER();
            strategy.appendField(locator, this, "fenster", buffer, theFENSTER);
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
        if (draftCopy instanceof Bad) {
            final Bad copy = ((Bad) draftCopy);
            if (this.dusche!= null) {
                Boolean sourceDUSCHE;
                sourceDUSCHE = this.isDUSCHE();
                Boolean copyDUSCHE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "dusche", sourceDUSCHE), sourceDUSCHE));
                copy.setDUSCHE(copyDUSCHE);
            } else {
                copy.dusche = null;
            }
            if (this.wanne!= null) {
                Boolean sourceWANNE;
                sourceWANNE = this.isWANNE();
                Boolean copyWANNE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "wanne", sourceWANNE), sourceWANNE));
                copy.setWANNE(copyWANNE);
            } else {
                copy.wanne = null;
            }
            if (this.fenster!= null) {
                Boolean sourceFENSTER;
                sourceFENSTER = this.isFENSTER();
                Boolean copyFENSTER = ((Boolean) strategy.copy(LocatorUtils.property(locator, "fenster", sourceFENSTER), sourceFENSTER));
                copy.setFENSTER(copyFENSTER);
            } else {
                copy.fenster = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Bad();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dusche", lhsDUSCHE), LocatorUtils.property(thatLocator, "dusche", rhsDUSCHE), lhsDUSCHE, rhsDUSCHE)) {
                return false;
            }
        }
        {
            Boolean lhsWANNE;
            lhsWANNE = this.isWANNE();
            Boolean rhsWANNE;
            rhsWANNE = that.isWANNE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wanne", lhsWANNE), LocatorUtils.property(thatLocator, "wanne", rhsWANNE), lhsWANNE, rhsWANNE)) {
                return false;
            }
        }
        {
            Boolean lhsFENSTER;
            lhsFENSTER = this.isFENSTER();
            Boolean rhsFENSTER;
            rhsFENSTER = that.isFENSTER();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fenster", lhsFENSTER), LocatorUtils.property(thatLocator, "fenster", rhsFENSTER), lhsFENSTER, rhsFENSTER)) {
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
