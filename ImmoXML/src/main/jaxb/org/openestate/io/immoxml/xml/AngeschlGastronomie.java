
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
 * Java class for &lt;angeschl_gastronomie&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "angeschl_gastronomie")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
public class AngeschlGastronomie implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "HOTELRESTAURANT")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean hotelrestaurant;
    @XmlAttribute(name = "BAR")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean bar;

    /**
     * Gets the value of the hotelrestaurant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getHOTELRESTAURANT() {
        return hotelrestaurant;
    }

    /**
     * Sets the value of the hotelrestaurant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setHOTELRESTAURANT(Boolean value) {
        this.hotelrestaurant = value;
    }

    /**
     * Gets the value of the bar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getBAR() {
        return bar;
    }

    /**
     * Sets the value of the bar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setBAR(Boolean value) {
        this.bar = value;
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
            Boolean theHOTELRESTAURANT;
            theHOTELRESTAURANT = this.getHOTELRESTAURANT();
            strategy.appendField(locator, this, "hotelrestaurant", buffer, theHOTELRESTAURANT, (this.hotelrestaurant!= null));
        }
        {
            Boolean theBAR;
            theBAR = this.getBAR();
            strategy.appendField(locator, this, "bar", buffer, theBAR, (this.bar!= null));
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
        if (draftCopy instanceof AngeschlGastronomie) {
            final AngeschlGastronomie copy = ((AngeschlGastronomie) draftCopy);
            {
                Boolean hotelrestaurantShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hotelrestaurant!= null));
                if (hotelrestaurantShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceHOTELRESTAURANT;
                    sourceHOTELRESTAURANT = this.getHOTELRESTAURANT();
                    Boolean copyHOTELRESTAURANT = ((Boolean) strategy.copy(LocatorUtils.property(locator, "hotelrestaurant", sourceHOTELRESTAURANT), sourceHOTELRESTAURANT, (this.hotelrestaurant!= null)));
                    copy.setHOTELRESTAURANT(copyHOTELRESTAURANT);
                } else {
                    if (hotelrestaurantShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hotelrestaurant = null;
                    }
                }
            }
            {
                Boolean barShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bar!= null));
                if (barShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceBAR;
                    sourceBAR = this.getBAR();
                    Boolean copyBAR = ((Boolean) strategy.copy(LocatorUtils.property(locator, "bar", sourceBAR), sourceBAR, (this.bar!= null)));
                    copy.setBAR(copyBAR);
                } else {
                    if (barShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bar = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new AngeschlGastronomie();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AngeschlGastronomie that = ((AngeschlGastronomie) object);
        {
            Boolean lhsHOTELRESTAURANT;
            lhsHOTELRESTAURANT = this.getHOTELRESTAURANT();
            Boolean rhsHOTELRESTAURANT;
            rhsHOTELRESTAURANT = that.getHOTELRESTAURANT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hotelrestaurant", lhsHOTELRESTAURANT), LocatorUtils.property(thatLocator, "hotelrestaurant", rhsHOTELRESTAURANT), lhsHOTELRESTAURANT, rhsHOTELRESTAURANT, (this.hotelrestaurant!= null), (that.hotelrestaurant!= null))) {
                return false;
            }
        }
        {
            Boolean lhsBAR;
            lhsBAR = this.getBAR();
            Boolean rhsBAR;
            rhsBAR = that.getBAR();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bar", lhsBAR), LocatorUtils.property(thatLocator, "bar", rhsBAR), lhsBAR, rhsBAR, (this.bar!= null), (that.bar!= null))) {
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
