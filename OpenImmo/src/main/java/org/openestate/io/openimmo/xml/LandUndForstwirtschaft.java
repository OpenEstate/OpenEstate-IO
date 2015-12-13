
package org.openestate.io.openimmo.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
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
 * Java class for &lt;land_und_forstwirtschaft&gt; element.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "land_und_forstwirtschaft")
public class LandUndForstwirtschaft
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "land_typ")
    protected LandUndForstwirtschaft.LandTyp landTyp;

    /**
     * Gets the value of the landTyp property.
     *
     * @return
     *     possible object is
     *     {@link LandUndForstwirtschaft.LandTyp }
     *
     */
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
    public void setLandTyp(LandUndForstwirtschaft.LandTyp value) {
        this.landTyp = value;
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
            LandUndForstwirtschaft.LandTyp theLandTyp;
            theLandTyp = this.getLandTyp();
            strategy.appendField(locator, this, "landTyp", buffer, theLandTyp);
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
        if (draftCopy instanceof LandUndForstwirtschaft) {
            final LandUndForstwirtschaft copy = ((LandUndForstwirtschaft) draftCopy);
            if (this.landTyp!= null) {
                LandUndForstwirtschaft.LandTyp sourceLandTyp;
                sourceLandTyp = this.getLandTyp();
                LandUndForstwirtschaft.LandTyp copyLandTyp = ((LandUndForstwirtschaft.LandTyp) strategy.copy(LocatorUtils.property(locator, "landTyp", sourceLandTyp), sourceLandTyp));
                copy.setLandTyp(copyLandTyp);
            } else {
                copy.landTyp = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new LandUndForstwirtschaft();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "landTyp", lhsLandTyp), LocatorUtils.property(thatLocator, "landTyp", rhsLandTyp), lhsLandTyp, rhsLandTyp)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


    /**
     * Java enum for <em>land_typ</em> attribute in &lt;land_und_forstwirtschaft&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
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
        SONSTIGE_LANDWIRTSCHAFTSIMMOBILIEN,
        ANWESEN,
        JAGDREVIER;

        public String value() {
            return name();
        }

        public static LandUndForstwirtschaft.LandTyp fromValue(String v) {
            return valueOf(v);
        }

    }

}