
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
 * Java class for &lt;ausricht_balkon_terrasse&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ausricht_balkon_terrasse")
public class AusrichtBalkonTerrasse
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "NORD")
    protected Boolean nord;
    @XmlAttribute(name = "OST")
    protected Boolean ost;
    @XmlAttribute(name = "SUED")
    protected Boolean sued;
    @XmlAttribute(name = "WEST")
    protected Boolean west;
    @XmlAttribute(name = "NORDOST")
    protected Boolean nordost;
    @XmlAttribute(name = "NORDWEST")
    protected Boolean nordwest;
    @XmlAttribute(name = "SUEDOST")
    protected Boolean suedost;
    @XmlAttribute(name = "SUEDWEST")
    protected Boolean suedwest;

    /**
     * Gets the value of the nord property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNORD() {
        return nord;
    }

    /**
     * Sets the value of the nord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNORD(Boolean value) {
        this.nord = value;
    }

    /**
     * Gets the value of the ost property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOST() {
        return ost;
    }

    /**
     * Sets the value of the ost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOST(Boolean value) {
        this.ost = value;
    }

    /**
     * Gets the value of the sued property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSUED() {
        return sued;
    }

    /**
     * Sets the value of the sued property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSUED(Boolean value) {
        this.sued = value;
    }

    /**
     * Gets the value of the west property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWEST() {
        return west;
    }

    /**
     * Sets the value of the west property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWEST(Boolean value) {
        this.west = value;
    }

    /**
     * Gets the value of the nordost property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNORDOST() {
        return nordost;
    }

    /**
     * Sets the value of the nordost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNORDOST(Boolean value) {
        this.nordost = value;
    }

    /**
     * Gets the value of the nordwest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNORDWEST() {
        return nordwest;
    }

    /**
     * Sets the value of the nordwest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNORDWEST(Boolean value) {
        this.nordwest = value;
    }

    /**
     * Gets the value of the suedost property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSUEDOST() {
        return suedost;
    }

    /**
     * Sets the value of the suedost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSUEDOST(Boolean value) {
        this.suedost = value;
    }

    /**
     * Gets the value of the suedwest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSUEDWEST() {
        return suedwest;
    }

    /**
     * Sets the value of the suedwest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSUEDWEST(Boolean value) {
        this.suedwest = value;
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
            Boolean theNORD;
            theNORD = this.isNORD();
            strategy.appendField(locator, this, "nord", buffer, theNORD);
        }
        {
            Boolean theOST;
            theOST = this.isOST();
            strategy.appendField(locator, this, "ost", buffer, theOST);
        }
        {
            Boolean theSUED;
            theSUED = this.isSUED();
            strategy.appendField(locator, this, "sued", buffer, theSUED);
        }
        {
            Boolean theWEST;
            theWEST = this.isWEST();
            strategy.appendField(locator, this, "west", buffer, theWEST);
        }
        {
            Boolean theNORDOST;
            theNORDOST = this.isNORDOST();
            strategy.appendField(locator, this, "nordost", buffer, theNORDOST);
        }
        {
            Boolean theNORDWEST;
            theNORDWEST = this.isNORDWEST();
            strategy.appendField(locator, this, "nordwest", buffer, theNORDWEST);
        }
        {
            Boolean theSUEDOST;
            theSUEDOST = this.isSUEDOST();
            strategy.appendField(locator, this, "suedost", buffer, theSUEDOST);
        }
        {
            Boolean theSUEDWEST;
            theSUEDWEST = this.isSUEDWEST();
            strategy.appendField(locator, this, "suedwest", buffer, theSUEDWEST);
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
        if (draftCopy instanceof AusrichtBalkonTerrasse) {
            final AusrichtBalkonTerrasse copy = ((AusrichtBalkonTerrasse) draftCopy);
            if (this.nord!= null) {
                Boolean sourceNORD;
                sourceNORD = this.isNORD();
                Boolean copyNORD = ((Boolean) strategy.copy(LocatorUtils.property(locator, "nord", sourceNORD), sourceNORD));
                copy.setNORD(copyNORD);
            } else {
                copy.nord = null;
            }
            if (this.ost!= null) {
                Boolean sourceOST;
                sourceOST = this.isOST();
                Boolean copyOST = ((Boolean) strategy.copy(LocatorUtils.property(locator, "ost", sourceOST), sourceOST));
                copy.setOST(copyOST);
            } else {
                copy.ost = null;
            }
            if (this.sued!= null) {
                Boolean sourceSUED;
                sourceSUED = this.isSUED();
                Boolean copySUED = ((Boolean) strategy.copy(LocatorUtils.property(locator, "sued", sourceSUED), sourceSUED));
                copy.setSUED(copySUED);
            } else {
                copy.sued = null;
            }
            if (this.west!= null) {
                Boolean sourceWEST;
                sourceWEST = this.isWEST();
                Boolean copyWEST = ((Boolean) strategy.copy(LocatorUtils.property(locator, "west", sourceWEST), sourceWEST));
                copy.setWEST(copyWEST);
            } else {
                copy.west = null;
            }
            if (this.nordost!= null) {
                Boolean sourceNORDOST;
                sourceNORDOST = this.isNORDOST();
                Boolean copyNORDOST = ((Boolean) strategy.copy(LocatorUtils.property(locator, "nordost", sourceNORDOST), sourceNORDOST));
                copy.setNORDOST(copyNORDOST);
            } else {
                copy.nordost = null;
            }
            if (this.nordwest!= null) {
                Boolean sourceNORDWEST;
                sourceNORDWEST = this.isNORDWEST();
                Boolean copyNORDWEST = ((Boolean) strategy.copy(LocatorUtils.property(locator, "nordwest", sourceNORDWEST), sourceNORDWEST));
                copy.setNORDWEST(copyNORDWEST);
            } else {
                copy.nordwest = null;
            }
            if (this.suedost!= null) {
                Boolean sourceSUEDOST;
                sourceSUEDOST = this.isSUEDOST();
                Boolean copySUEDOST = ((Boolean) strategy.copy(LocatorUtils.property(locator, "suedost", sourceSUEDOST), sourceSUEDOST));
                copy.setSUEDOST(copySUEDOST);
            } else {
                copy.suedost = null;
            }
            if (this.suedwest!= null) {
                Boolean sourceSUEDWEST;
                sourceSUEDWEST = this.isSUEDWEST();
                Boolean copySUEDWEST = ((Boolean) strategy.copy(LocatorUtils.property(locator, "suedwest", sourceSUEDWEST), sourceSUEDWEST));
                copy.setSUEDWEST(copySUEDWEST);
            } else {
                copy.suedwest = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new AusrichtBalkonTerrasse();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AusrichtBalkonTerrasse)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AusrichtBalkonTerrasse that = ((AusrichtBalkonTerrasse) object);
        {
            Boolean lhsNORD;
            lhsNORD = this.isNORD();
            Boolean rhsNORD;
            rhsNORD = that.isNORD();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nord", lhsNORD), LocatorUtils.property(thatLocator, "nord", rhsNORD), lhsNORD, rhsNORD)) {
                return false;
            }
        }
        {
            Boolean lhsOST;
            lhsOST = this.isOST();
            Boolean rhsOST;
            rhsOST = that.isOST();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ost", lhsOST), LocatorUtils.property(thatLocator, "ost", rhsOST), lhsOST, rhsOST)) {
                return false;
            }
        }
        {
            Boolean lhsSUED;
            lhsSUED = this.isSUED();
            Boolean rhsSUED;
            rhsSUED = that.isSUED();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sued", lhsSUED), LocatorUtils.property(thatLocator, "sued", rhsSUED), lhsSUED, rhsSUED)) {
                return false;
            }
        }
        {
            Boolean lhsWEST;
            lhsWEST = this.isWEST();
            Boolean rhsWEST;
            rhsWEST = that.isWEST();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "west", lhsWEST), LocatorUtils.property(thatLocator, "west", rhsWEST), lhsWEST, rhsWEST)) {
                return false;
            }
        }
        {
            Boolean lhsNORDOST;
            lhsNORDOST = this.isNORDOST();
            Boolean rhsNORDOST;
            rhsNORDOST = that.isNORDOST();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nordost", lhsNORDOST), LocatorUtils.property(thatLocator, "nordost", rhsNORDOST), lhsNORDOST, rhsNORDOST)) {
                return false;
            }
        }
        {
            Boolean lhsNORDWEST;
            lhsNORDWEST = this.isNORDWEST();
            Boolean rhsNORDWEST;
            rhsNORDWEST = that.isNORDWEST();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nordwest", lhsNORDWEST), LocatorUtils.property(thatLocator, "nordwest", rhsNORDWEST), lhsNORDWEST, rhsNORDWEST)) {
                return false;
            }
        }
        {
            Boolean lhsSUEDOST;
            lhsSUEDOST = this.isSUEDOST();
            Boolean rhsSUEDOST;
            rhsSUEDOST = that.isSUEDOST();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "suedost", lhsSUEDOST), LocatorUtils.property(thatLocator, "suedost", rhsSUEDOST), lhsSUEDOST, rhsSUEDOST)) {
                return false;
            }
        }
        {
            Boolean lhsSUEDWEST;
            lhsSUEDWEST = this.isSUEDWEST();
            Boolean rhsSUEDWEST;
            rhsSUEDWEST = that.isSUEDWEST();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "suedwest", lhsSUEDWEST), LocatorUtils.property(thatLocator, "suedwest", rhsSUEDWEST), lhsSUEDWEST, rhsSUEDWEST)) {
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
