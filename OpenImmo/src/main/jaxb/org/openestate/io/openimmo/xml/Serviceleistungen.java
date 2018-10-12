
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
 * Java class for &lt;serviceleistungen&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "serviceleistungen")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
public class Serviceleistungen implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "BETREUTES_WOHNEN")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean betreuteswohnen;
    @XmlAttribute(name = "CATERING")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean catering;
    @XmlAttribute(name = "REINIGUNG")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean reinigung;
    @XmlAttribute(name = "EINKAUF")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean einkauf;
    @XmlAttribute(name = "WACHDIENST")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean wachdienst;

    /**
     * Gets the value of the betreuteswohnen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getBETREUTESWOHNEN() {
        return betreuteswohnen;
    }

    /**
     * Sets the value of the betreuteswohnen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setBETREUTESWOHNEN(Boolean value) {
        this.betreuteswohnen = value;
    }

    /**
     * Gets the value of the catering property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getCATERING() {
        return catering;
    }

    /**
     * Sets the value of the catering property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setCATERING(Boolean value) {
        this.catering = value;
    }

    /**
     * Gets the value of the reinigung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getREINIGUNG() {
        return reinigung;
    }

    /**
     * Sets the value of the reinigung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setREINIGUNG(Boolean value) {
        this.reinigung = value;
    }

    /**
     * Gets the value of the einkauf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getEINKAUF() {
        return einkauf;
    }

    /**
     * Sets the value of the einkauf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setEINKAUF(Boolean value) {
        this.einkauf = value;
    }

    /**
     * Gets the value of the wachdienst property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getWACHDIENST() {
        return wachdienst;
    }

    /**
     * Sets the value of the wachdienst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setWACHDIENST(Boolean value) {
        this.wachdienst = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            Boolean theBETREUTESWOHNEN;
            theBETREUTESWOHNEN = this.getBETREUTESWOHNEN();
            strategy.appendField(locator, this, "betreuteswohnen", buffer, theBETREUTESWOHNEN, (this.betreuteswohnen!= null));
        }
        {
            Boolean theCATERING;
            theCATERING = this.getCATERING();
            strategy.appendField(locator, this, "catering", buffer, theCATERING, (this.catering!= null));
        }
        {
            Boolean theREINIGUNG;
            theREINIGUNG = this.getREINIGUNG();
            strategy.appendField(locator, this, "reinigung", buffer, theREINIGUNG, (this.reinigung!= null));
        }
        {
            Boolean theEINKAUF;
            theEINKAUF = this.getEINKAUF();
            strategy.appendField(locator, this, "einkauf", buffer, theEINKAUF, (this.einkauf!= null));
        }
        {
            Boolean theWACHDIENST;
            theWACHDIENST = this.getWACHDIENST();
            strategy.appendField(locator, this, "wachdienst", buffer, theWACHDIENST, (this.wachdienst!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Serviceleistungen) {
            final Serviceleistungen copy = ((Serviceleistungen) draftCopy);
            {
                Boolean betreuteswohnenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.betreuteswohnen!= null));
                if (betreuteswohnenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceBETREUTESWOHNEN;
                    sourceBETREUTESWOHNEN = this.getBETREUTESWOHNEN();
                    Boolean copyBETREUTESWOHNEN = ((Boolean) strategy.copy(LocatorUtils.property(locator, "betreuteswohnen", sourceBETREUTESWOHNEN), sourceBETREUTESWOHNEN, (this.betreuteswohnen!= null)));
                    copy.setBETREUTESWOHNEN(copyBETREUTESWOHNEN);
                } else {
                    if (betreuteswohnenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.betreuteswohnen = null;
                    }
                }
            }
            {
                Boolean cateringShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.catering!= null));
                if (cateringShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceCATERING;
                    sourceCATERING = this.getCATERING();
                    Boolean copyCATERING = ((Boolean) strategy.copy(LocatorUtils.property(locator, "catering", sourceCATERING), sourceCATERING, (this.catering!= null)));
                    copy.setCATERING(copyCATERING);
                } else {
                    if (cateringShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.catering = null;
                    }
                }
            }
            {
                Boolean reinigungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.reinigung!= null));
                if (reinigungShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceREINIGUNG;
                    sourceREINIGUNG = this.getREINIGUNG();
                    Boolean copyREINIGUNG = ((Boolean) strategy.copy(LocatorUtils.property(locator, "reinigung", sourceREINIGUNG), sourceREINIGUNG, (this.reinigung!= null)));
                    copy.setREINIGUNG(copyREINIGUNG);
                } else {
                    if (reinigungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.reinigung = null;
                    }
                }
            }
            {
                Boolean einkaufShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.einkauf!= null));
                if (einkaufShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceEINKAUF;
                    sourceEINKAUF = this.getEINKAUF();
                    Boolean copyEINKAUF = ((Boolean) strategy.copy(LocatorUtils.property(locator, "einkauf", sourceEINKAUF), sourceEINKAUF, (this.einkauf!= null)));
                    copy.setEINKAUF(copyEINKAUF);
                } else {
                    if (einkaufShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.einkauf = null;
                    }
                }
            }
            {
                Boolean wachdienstShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wachdienst!= null));
                if (wachdienstShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceWACHDIENST;
                    sourceWACHDIENST = this.getWACHDIENST();
                    Boolean copyWACHDIENST = ((Boolean) strategy.copy(LocatorUtils.property(locator, "wachdienst", sourceWACHDIENST), sourceWACHDIENST, (this.wachdienst!= null)));
                    copy.setWACHDIENST(copyWACHDIENST);
                } else {
                    if (wachdienstShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wachdienst = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new Serviceleistungen();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Serviceleistungen that = ((Serviceleistungen) object);
        {
            Boolean lhsBETREUTESWOHNEN;
            lhsBETREUTESWOHNEN = this.getBETREUTESWOHNEN();
            Boolean rhsBETREUTESWOHNEN;
            rhsBETREUTESWOHNEN = that.getBETREUTESWOHNEN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "betreuteswohnen", lhsBETREUTESWOHNEN), LocatorUtils.property(thatLocator, "betreuteswohnen", rhsBETREUTESWOHNEN), lhsBETREUTESWOHNEN, rhsBETREUTESWOHNEN, (this.betreuteswohnen!= null), (that.betreuteswohnen!= null))) {
                return false;
            }
        }
        {
            Boolean lhsCATERING;
            lhsCATERING = this.getCATERING();
            Boolean rhsCATERING;
            rhsCATERING = that.getCATERING();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "catering", lhsCATERING), LocatorUtils.property(thatLocator, "catering", rhsCATERING), lhsCATERING, rhsCATERING, (this.catering!= null), (that.catering!= null))) {
                return false;
            }
        }
        {
            Boolean lhsREINIGUNG;
            lhsREINIGUNG = this.getREINIGUNG();
            Boolean rhsREINIGUNG;
            rhsREINIGUNG = that.getREINIGUNG();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reinigung", lhsREINIGUNG), LocatorUtils.property(thatLocator, "reinigung", rhsREINIGUNG), lhsREINIGUNG, rhsREINIGUNG, (this.reinigung!= null), (that.reinigung!= null))) {
                return false;
            }
        }
        {
            Boolean lhsEINKAUF;
            lhsEINKAUF = this.getEINKAUF();
            Boolean rhsEINKAUF;
            rhsEINKAUF = that.getEINKAUF();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "einkauf", lhsEINKAUF), LocatorUtils.property(thatLocator, "einkauf", rhsEINKAUF), lhsEINKAUF, rhsEINKAUF, (this.einkauf!= null), (that.einkauf!= null))) {
                return false;
            }
        }
        {
            Boolean lhsWACHDIENST;
            lhsWACHDIENST = this.getWACHDIENST();
            Boolean rhsWACHDIENST;
            rhsWACHDIENST = that.getWACHDIENST();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wachdienst", lhsWACHDIENST), LocatorUtils.property(thatLocator, "wachdienst", rhsWACHDIENST), lhsWACHDIENST, rhsWACHDIENST, (this.wachdienst!= null), (that.wachdienst!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
