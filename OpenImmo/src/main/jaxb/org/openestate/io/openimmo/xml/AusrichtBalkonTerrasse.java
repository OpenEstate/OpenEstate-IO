
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
 * Java class for &lt;ausricht_balkon_terrasse&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ausricht_balkon_terrasse")
public class AusrichtBalkonTerrasse implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
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
            Boolean theNORD;
            theNORD = this.isNORD();
            strategy.appendField(locator, this, "nord", buffer, theNORD, (this.nord!= null));
        }
        {
            Boolean theOST;
            theOST = this.isOST();
            strategy.appendField(locator, this, "ost", buffer, theOST, (this.ost!= null));
        }
        {
            Boolean theSUED;
            theSUED = this.isSUED();
            strategy.appendField(locator, this, "sued", buffer, theSUED, (this.sued!= null));
        }
        {
            Boolean theWEST;
            theWEST = this.isWEST();
            strategy.appendField(locator, this, "west", buffer, theWEST, (this.west!= null));
        }
        {
            Boolean theNORDOST;
            theNORDOST = this.isNORDOST();
            strategy.appendField(locator, this, "nordost", buffer, theNORDOST, (this.nordost!= null));
        }
        {
            Boolean theNORDWEST;
            theNORDWEST = this.isNORDWEST();
            strategy.appendField(locator, this, "nordwest", buffer, theNORDWEST, (this.nordwest!= null));
        }
        {
            Boolean theSUEDOST;
            theSUEDOST = this.isSUEDOST();
            strategy.appendField(locator, this, "suedost", buffer, theSUEDOST, (this.suedost!= null));
        }
        {
            Boolean theSUEDWEST;
            theSUEDWEST = this.isSUEDWEST();
            strategy.appendField(locator, this, "suedwest", buffer, theSUEDWEST, (this.suedwest!= null));
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
        if (draftCopy instanceof AusrichtBalkonTerrasse) {
            final AusrichtBalkonTerrasse copy = ((AusrichtBalkonTerrasse) draftCopy);
            {
                Boolean nordShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nord!= null));
                if (nordShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceNORD;
                    sourceNORD = this.isNORD();
                    Boolean copyNORD = ((Boolean) strategy.copy(LocatorUtils.property(locator, "nord", sourceNORD), sourceNORD, (this.nord!= null)));
                    copy.setNORD(copyNORD);
                } else {
                    if (nordShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nord = null;
                    }
                }
            }
            {
                Boolean ostShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ost!= null));
                if (ostShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceOST;
                    sourceOST = this.isOST();
                    Boolean copyOST = ((Boolean) strategy.copy(LocatorUtils.property(locator, "ost", sourceOST), sourceOST, (this.ost!= null)));
                    copy.setOST(copyOST);
                } else {
                    if (ostShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ost = null;
                    }
                }
            }
            {
                Boolean suedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sued!= null));
                if (suedShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceSUED;
                    sourceSUED = this.isSUED();
                    Boolean copySUED = ((Boolean) strategy.copy(LocatorUtils.property(locator, "sued", sourceSUED), sourceSUED, (this.sued!= null)));
                    copy.setSUED(copySUED);
                } else {
                    if (suedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sued = null;
                    }
                }
            }
            {
                Boolean westShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.west!= null));
                if (westShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceWEST;
                    sourceWEST = this.isWEST();
                    Boolean copyWEST = ((Boolean) strategy.copy(LocatorUtils.property(locator, "west", sourceWEST), sourceWEST, (this.west!= null)));
                    copy.setWEST(copyWEST);
                } else {
                    if (westShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.west = null;
                    }
                }
            }
            {
                Boolean nordostShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nordost!= null));
                if (nordostShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceNORDOST;
                    sourceNORDOST = this.isNORDOST();
                    Boolean copyNORDOST = ((Boolean) strategy.copy(LocatorUtils.property(locator, "nordost", sourceNORDOST), sourceNORDOST, (this.nordost!= null)));
                    copy.setNORDOST(copyNORDOST);
                } else {
                    if (nordostShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nordost = null;
                    }
                }
            }
            {
                Boolean nordwestShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nordwest!= null));
                if (nordwestShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceNORDWEST;
                    sourceNORDWEST = this.isNORDWEST();
                    Boolean copyNORDWEST = ((Boolean) strategy.copy(LocatorUtils.property(locator, "nordwest", sourceNORDWEST), sourceNORDWEST, (this.nordwest!= null)));
                    copy.setNORDWEST(copyNORDWEST);
                } else {
                    if (nordwestShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nordwest = null;
                    }
                }
            }
            {
                Boolean suedostShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.suedost!= null));
                if (suedostShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceSUEDOST;
                    sourceSUEDOST = this.isSUEDOST();
                    Boolean copySUEDOST = ((Boolean) strategy.copy(LocatorUtils.property(locator, "suedost", sourceSUEDOST), sourceSUEDOST, (this.suedost!= null)));
                    copy.setSUEDOST(copySUEDOST);
                } else {
                    if (suedostShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.suedost = null;
                    }
                }
            }
            {
                Boolean suedwestShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.suedwest!= null));
                if (suedwestShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceSUEDWEST;
                    sourceSUEDWEST = this.isSUEDWEST();
                    Boolean copySUEDWEST = ((Boolean) strategy.copy(LocatorUtils.property(locator, "suedwest", sourceSUEDWEST), sourceSUEDWEST, (this.suedwest!= null)));
                    copy.setSUEDWEST(copySUEDWEST);
                } else {
                    if (suedwestShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.suedwest = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new AusrichtBalkonTerrasse();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nord", lhsNORD), LocatorUtils.property(thatLocator, "nord", rhsNORD), lhsNORD, rhsNORD, (this.nord!= null), (that.nord!= null))) {
                return false;
            }
        }
        {
            Boolean lhsOST;
            lhsOST = this.isOST();
            Boolean rhsOST;
            rhsOST = that.isOST();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ost", lhsOST), LocatorUtils.property(thatLocator, "ost", rhsOST), lhsOST, rhsOST, (this.ost!= null), (that.ost!= null))) {
                return false;
            }
        }
        {
            Boolean lhsSUED;
            lhsSUED = this.isSUED();
            Boolean rhsSUED;
            rhsSUED = that.isSUED();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sued", lhsSUED), LocatorUtils.property(thatLocator, "sued", rhsSUED), lhsSUED, rhsSUED, (this.sued!= null), (that.sued!= null))) {
                return false;
            }
        }
        {
            Boolean lhsWEST;
            lhsWEST = this.isWEST();
            Boolean rhsWEST;
            rhsWEST = that.isWEST();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "west", lhsWEST), LocatorUtils.property(thatLocator, "west", rhsWEST), lhsWEST, rhsWEST, (this.west!= null), (that.west!= null))) {
                return false;
            }
        }
        {
            Boolean lhsNORDOST;
            lhsNORDOST = this.isNORDOST();
            Boolean rhsNORDOST;
            rhsNORDOST = that.isNORDOST();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nordost", lhsNORDOST), LocatorUtils.property(thatLocator, "nordost", rhsNORDOST), lhsNORDOST, rhsNORDOST, (this.nordost!= null), (that.nordost!= null))) {
                return false;
            }
        }
        {
            Boolean lhsNORDWEST;
            lhsNORDWEST = this.isNORDWEST();
            Boolean rhsNORDWEST;
            rhsNORDWEST = that.isNORDWEST();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nordwest", lhsNORDWEST), LocatorUtils.property(thatLocator, "nordwest", rhsNORDWEST), lhsNORDWEST, rhsNORDWEST, (this.nordwest!= null), (that.nordwest!= null))) {
                return false;
            }
        }
        {
            Boolean lhsSUEDOST;
            lhsSUEDOST = this.isSUEDOST();
            Boolean rhsSUEDOST;
            rhsSUEDOST = that.isSUEDOST();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "suedost", lhsSUEDOST), LocatorUtils.property(thatLocator, "suedost", rhsSUEDOST), lhsSUEDOST, rhsSUEDOST, (this.suedost!= null), (that.suedost!= null))) {
                return false;
            }
        }
        {
            Boolean lhsSUEDWEST;
            lhsSUEDWEST = this.isSUEDWEST();
            Boolean rhsSUEDWEST;
            rhsSUEDWEST = that.isSUEDWEST();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "suedwest", lhsSUEDWEST), LocatorUtils.property(thatLocator, "suedwest", rhsSUEDWEST), lhsSUEDWEST, rhsSUEDWEST, (this.suedwest!= null), (that.suedwest!= null))) {
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
