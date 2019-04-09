
package org.openestate.io.immoxml.xml;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
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
 * Java class for &lt;land_und_forstwirtschaft&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "land_und_forstwirtschaft")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
public class LandUndForstwirtschaft implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "land_typ")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected LandUndForstwirtschaft.LandTyp landTyp;

    /**
     * Gets the value of the landTyp property.
     * 
     * @return
     *     possible object is
     *     {@link LandUndForstwirtschaft.LandTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public LandUndForstwirtschaft.LandTyp getLandTyp() {
        return landTyp;
    }

    /**
     * Sets the value of the landTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LandUndForstwirtschaft.LandTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setLandTyp(LandUndForstwirtschaft.LandTyp value) {
        this.landTyp = value;
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
            LandUndForstwirtschaft.LandTyp theLandTyp;
            theLandTyp = this.getLandTyp();
            strategy.appendField(locator, this, "landTyp", buffer, theLandTyp, (this.landTyp!= null));
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
        if (draftCopy instanceof LandUndForstwirtschaft) {
            final LandUndForstwirtschaft copy = ((LandUndForstwirtschaft) draftCopy);
            {
                Boolean landTypShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.landTyp!= null));
                if (landTypShouldBeCopiedAndSet == Boolean.TRUE) {
                    LandUndForstwirtschaft.LandTyp sourceLandTyp;
                    sourceLandTyp = this.getLandTyp();
                    LandUndForstwirtschaft.LandTyp copyLandTyp = ((LandUndForstwirtschaft.LandTyp) strategy.copy(LocatorUtils.property(locator, "landTyp", sourceLandTyp), sourceLandTyp, (this.landTyp!= null)));
                    copy.setLandTyp(copyLandTyp);
                } else {
                    if (landTypShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.landTyp = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new LandUndForstwirtschaft();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LandUndForstwirtschaft that = ((LandUndForstwirtschaft) object);
        {
            LandUndForstwirtschaft.LandTyp lhsLandTyp;
            lhsLandTyp = this.getLandTyp();
            LandUndForstwirtschaft.LandTyp rhsLandTyp;
            rhsLandTyp = that.getLandTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "landTyp", lhsLandTyp), LocatorUtils.property(thatLocator, "landTyp", rhsLandTyp), lhsLandTyp, rhsLandTyp, (this.landTyp!= null), (that.landTyp!= null))) {
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


    /**
     * 
     *                     Java enum for <em>land_typ</em> attribute in &lt;land_und_forstwirtschaft&gt; elements.
     * 
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="LANDWIRTSCHAFTLICHE_BETRIEBE"/&gt;
     *     &lt;enumeration value="BAUERNHOF"/&gt;
     *     &lt;enumeration value="AUSSIEDLERHOF"/&gt;
     *     &lt;enumeration value="GARTENBAU"/&gt;
     *     &lt;enumeration value="ACKERBAU"/&gt;
     *     &lt;enumeration value="WEINBAU"/&gt;
     *     &lt;enumeration value="VIEHWIRTSCHAFT"/&gt;
     *     &lt;enumeration value="JAGD_UND_FORSTWIRTSCHAFT"/&gt;
     *     &lt;enumeration value="TEICH_UND_FISCHWIRTSCHAFT"/&gt;
     *     &lt;enumeration value="SCHEUNEN"/&gt;
     *     &lt;enumeration value="REITERHOEFE"/&gt;
     *     &lt;enumeration value="SONSTIGE_LANDWIRTSCHAFTSIMMOBILIEN"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public enum LandTyp {

        LANDWIRTSCHAFTLICHE_BETRIEBE,
        BAUERNHOF,
        AUSSIEDLERHOF,
        GARTENBAU,
        ACKERBAU,
        WEINBAU,
        VIEHWIRTSCHAFT,
        JAGD_UND_FORSTWIRTSCHAFT,
        TEICH_UND_FISCHWIRTSCHAFT,
        SCHEUNEN,
        REITERHOEFE,
        SONSTIGE_LANDWIRTSCHAFTSIMMOBILIEN;

        public String value() {
            return name();
        }

        public static LandUndForstwirtschaft.LandTyp fromValue(String v) {
            return valueOf(v);
        }

    }

}
