
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
 * Java class for &lt;ausricht_balkon_terrasse&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ausricht_balkon_terrasse")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
public class AusrichtBalkonTerrasse implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "NORD")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean nord;
    @XmlAttribute(name = "OST")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean ost;
    @XmlAttribute(name = "SUED")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean sued;
    @XmlAttribute(name = "WEST")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean west;

    /**
     * Gets the value of the nord property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getNORD() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getOST() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getSUED() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getWEST() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setWEST(Boolean value) {
        this.west = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            Boolean theNORD;
            theNORD = this.getNORD();
            strategy.appendField(locator, this, "nord", buffer, theNORD, (this.nord!= null));
        }
        {
            Boolean theOST;
            theOST = this.getOST();
            strategy.appendField(locator, this, "ost", buffer, theOST, (this.ost!= null));
        }
        {
            Boolean theSUED;
            theSUED = this.getSUED();
            strategy.appendField(locator, this, "sued", buffer, theSUED, (this.sued!= null));
        }
        {
            Boolean theWEST;
            theWEST = this.getWEST();
            strategy.appendField(locator, this, "west", buffer, theWEST, (this.west!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof AusrichtBalkonTerrasse) {
            final AusrichtBalkonTerrasse copy = ((AusrichtBalkonTerrasse) draftCopy);
            {
                Boolean nordShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nord!= null));
                if (nordShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceNORD;
                    sourceNORD = this.getNORD();
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
                    sourceOST = this.getOST();
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
                    sourceSUED = this.getSUED();
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
                    sourceWEST = this.getWEST();
                    Boolean copyWEST = ((Boolean) strategy.copy(LocatorUtils.property(locator, "west", sourceWEST), sourceWEST, (this.west!= null)));
                    copy.setWEST(copyWEST);
                } else {
                    if (westShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.west = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new AusrichtBalkonTerrasse();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
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
            lhsNORD = this.getNORD();
            Boolean rhsNORD;
            rhsNORD = that.getNORD();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nord", lhsNORD), LocatorUtils.property(thatLocator, "nord", rhsNORD), lhsNORD, rhsNORD, (this.nord!= null), (that.nord!= null))) {
                return false;
            }
        }
        {
            Boolean lhsOST;
            lhsOST = this.getOST();
            Boolean rhsOST;
            rhsOST = that.getOST();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ost", lhsOST), LocatorUtils.property(thatLocator, "ost", rhsOST), lhsOST, rhsOST, (this.ost!= null), (that.ost!= null))) {
                return false;
            }
        }
        {
            Boolean lhsSUED;
            lhsSUED = this.getSUED();
            Boolean rhsSUED;
            rhsSUED = that.getSUED();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sued", lhsSUED), LocatorUtils.property(thatLocator, "sued", rhsSUED), lhsSUED, rhsSUED, (this.sued!= null), (that.sued!= null))) {
                return false;
            }
        }
        {
            Boolean lhsWEST;
            lhsWEST = this.getWEST();
            Boolean rhsWEST;
            rhsWEST = that.getWEST();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "west", lhsWEST), LocatorUtils.property(thatLocator, "west", rhsWEST), lhsWEST, rhsWEST, (this.west!= null), (that.west!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
