
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
 * Java class for &lt;serviceleistungen&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "serviceleistungen")
public class Serviceleistungen
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "BETREUTES_WOHNEN")
    protected Boolean betreuteswohnen;
    @XmlAttribute(name = "CATERING")
    protected Boolean catering;
    @XmlAttribute(name = "REINIGUNG")
    protected Boolean reinigung;
    @XmlAttribute(name = "EINKAUF")
    protected Boolean einkauf;
    @XmlAttribute(name = "WACHDIENST")
    protected Boolean wachdienst;

    /**
     * Gets the value of the betreuteswohnen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBETREUTESWOHNEN() {
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
    public Boolean isCATERING() {
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
    public Boolean isREINIGUNG() {
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
    public Boolean isEINKAUF() {
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
    public Boolean isWACHDIENST() {
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
    public void setWACHDIENST(Boolean value) {
        this.wachdienst = value;
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
            Boolean theBETREUTESWOHNEN;
            theBETREUTESWOHNEN = this.isBETREUTESWOHNEN();
            strategy.appendField(locator, this, "betreuteswohnen", buffer, theBETREUTESWOHNEN);
        }
        {
            Boolean theCATERING;
            theCATERING = this.isCATERING();
            strategy.appendField(locator, this, "catering", buffer, theCATERING);
        }
        {
            Boolean theREINIGUNG;
            theREINIGUNG = this.isREINIGUNG();
            strategy.appendField(locator, this, "reinigung", buffer, theREINIGUNG);
        }
        {
            Boolean theEINKAUF;
            theEINKAUF = this.isEINKAUF();
            strategy.appendField(locator, this, "einkauf", buffer, theEINKAUF);
        }
        {
            Boolean theWACHDIENST;
            theWACHDIENST = this.isWACHDIENST();
            strategy.appendField(locator, this, "wachdienst", buffer, theWACHDIENST);
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
        if (draftCopy instanceof Serviceleistungen) {
            final Serviceleistungen copy = ((Serviceleistungen) draftCopy);
            if (this.betreuteswohnen!= null) {
                Boolean sourceBETREUTESWOHNEN;
                sourceBETREUTESWOHNEN = this.isBETREUTESWOHNEN();
                Boolean copyBETREUTESWOHNEN = ((Boolean) strategy.copy(LocatorUtils.property(locator, "betreuteswohnen", sourceBETREUTESWOHNEN), sourceBETREUTESWOHNEN));
                copy.setBETREUTESWOHNEN(copyBETREUTESWOHNEN);
            } else {
                copy.betreuteswohnen = null;
            }
            if (this.catering!= null) {
                Boolean sourceCATERING;
                sourceCATERING = this.isCATERING();
                Boolean copyCATERING = ((Boolean) strategy.copy(LocatorUtils.property(locator, "catering", sourceCATERING), sourceCATERING));
                copy.setCATERING(copyCATERING);
            } else {
                copy.catering = null;
            }
            if (this.reinigung!= null) {
                Boolean sourceREINIGUNG;
                sourceREINIGUNG = this.isREINIGUNG();
                Boolean copyREINIGUNG = ((Boolean) strategy.copy(LocatorUtils.property(locator, "reinigung", sourceREINIGUNG), sourceREINIGUNG));
                copy.setREINIGUNG(copyREINIGUNG);
            } else {
                copy.reinigung = null;
            }
            if (this.einkauf!= null) {
                Boolean sourceEINKAUF;
                sourceEINKAUF = this.isEINKAUF();
                Boolean copyEINKAUF = ((Boolean) strategy.copy(LocatorUtils.property(locator, "einkauf", sourceEINKAUF), sourceEINKAUF));
                copy.setEINKAUF(copyEINKAUF);
            } else {
                copy.einkauf = null;
            }
            if (this.wachdienst!= null) {
                Boolean sourceWACHDIENST;
                sourceWACHDIENST = this.isWACHDIENST();
                Boolean copyWACHDIENST = ((Boolean) strategy.copy(LocatorUtils.property(locator, "wachdienst", sourceWACHDIENST), sourceWACHDIENST));
                copy.setWACHDIENST(copyWACHDIENST);
            } else {
                copy.wachdienst = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Serviceleistungen();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Serviceleistungen that = ((Serviceleistungen) object);
        {
            Boolean lhsBETREUTESWOHNEN;
            lhsBETREUTESWOHNEN = this.isBETREUTESWOHNEN();
            Boolean rhsBETREUTESWOHNEN;
            rhsBETREUTESWOHNEN = that.isBETREUTESWOHNEN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "betreuteswohnen", lhsBETREUTESWOHNEN), LocatorUtils.property(thatLocator, "betreuteswohnen", rhsBETREUTESWOHNEN), lhsBETREUTESWOHNEN, rhsBETREUTESWOHNEN)) {
                return false;
            }
        }
        {
            Boolean lhsCATERING;
            lhsCATERING = this.isCATERING();
            Boolean rhsCATERING;
            rhsCATERING = that.isCATERING();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "catering", lhsCATERING), LocatorUtils.property(thatLocator, "catering", rhsCATERING), lhsCATERING, rhsCATERING)) {
                return false;
            }
        }
        {
            Boolean lhsREINIGUNG;
            lhsREINIGUNG = this.isREINIGUNG();
            Boolean rhsREINIGUNG;
            rhsREINIGUNG = that.isREINIGUNG();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reinigung", lhsREINIGUNG), LocatorUtils.property(thatLocator, "reinigung", rhsREINIGUNG), lhsREINIGUNG, rhsREINIGUNG)) {
                return false;
            }
        }
        {
            Boolean lhsEINKAUF;
            lhsEINKAUF = this.isEINKAUF();
            Boolean rhsEINKAUF;
            rhsEINKAUF = that.isEINKAUF();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "einkauf", lhsEINKAUF), LocatorUtils.property(thatLocator, "einkauf", rhsEINKAUF), lhsEINKAUF, rhsEINKAUF)) {
                return false;
            }
        }
        {
            Boolean lhsWACHDIENST;
            lhsWACHDIENST = this.isWACHDIENST();
            Boolean rhsWACHDIENST;
            rhsWACHDIENST = that.isWACHDIENST();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wachdienst", lhsWACHDIENST), LocatorUtils.property(thatLocator, "wachdienst", rhsWACHDIENST), lhsWACHDIENST, rhsWACHDIENST)) {
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
