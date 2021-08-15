
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
 * Java class for &lt;bad&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "bad")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
public class Bad implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "DUSCHE")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean dusche;
    @XmlAttribute(name = "WANNE")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean wanne;
    @XmlAttribute(name = "FENSTER")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean fenster;

    /**
     * Gets the value of the dusche property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getDUSCHE() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getWANNE() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getFENSTER() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setFENSTER(Boolean value) {
        this.fenster = value;
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
            Boolean theDUSCHE;
            theDUSCHE = this.getDUSCHE();
            strategy.appendField(locator, this, "dusche", buffer, theDUSCHE, (this.dusche!= null));
        }
        {
            Boolean theWANNE;
            theWANNE = this.getWANNE();
            strategy.appendField(locator, this, "wanne", buffer, theWANNE, (this.wanne!= null));
        }
        {
            Boolean theFENSTER;
            theFENSTER = this.getFENSTER();
            strategy.appendField(locator, this, "fenster", buffer, theFENSTER, (this.fenster!= null));
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
        if (draftCopy instanceof Bad) {
            final Bad copy = ((Bad) draftCopy);
            {
                Boolean duscheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dusche!= null));
                if (duscheShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceDUSCHE;
                    sourceDUSCHE = this.getDUSCHE();
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
                    sourceWANNE = this.getWANNE();
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
                    sourceFENSTER = this.getFENSTER();
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

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Bad();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
            lhsDUSCHE = this.getDUSCHE();
            Boolean rhsDUSCHE;
            rhsDUSCHE = that.getDUSCHE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dusche", lhsDUSCHE), LocatorUtils.property(thatLocator, "dusche", rhsDUSCHE), lhsDUSCHE, rhsDUSCHE, (this.dusche!= null), (that.dusche!= null))) {
                return false;
            }
        }
        {
            Boolean lhsWANNE;
            lhsWANNE = this.getWANNE();
            Boolean rhsWANNE;
            rhsWANNE = that.getWANNE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wanne", lhsWANNE), LocatorUtils.property(thatLocator, "wanne", rhsWANNE), lhsWANNE, rhsWANNE, (this.wanne!= null), (that.wanne!= null))) {
                return false;
            }
        }
        {
            Boolean lhsFENSTER;
            lhsFENSTER = this.getFENSTER();
            Boolean rhsFENSTER;
            rhsFENSTER = that.getFENSTER();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fenster", lhsFENSTER), LocatorUtils.property(thatLocator, "fenster", rhsFENSTER), lhsFENSTER, rhsFENSTER, (this.fenster!= null), (that.fenster!= null))) {
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
