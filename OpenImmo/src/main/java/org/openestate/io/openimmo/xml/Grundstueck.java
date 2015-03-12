
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
 * Java class for &lt;grundstueck&gt; element.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "grundstueck")
public class Grundstueck
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "grundst_typ")
    protected Grundstueck.GrundstTyp grundstTyp;

    /**
     * Gets the value of the grundstTyp property.
     *
     * @return
     *     possible object is
     *     {@link Grundstueck.GrundstTyp }
     *
     */
    public Grundstueck.GrundstTyp getGrundstTyp() {
        return grundstTyp;
    }

    /**
     * Sets the value of the grundstTyp property.
     *
     * @param value
     *     allowed object is
     *     {@link Grundstueck.GrundstTyp }
     *
     */
    public void setGrundstTyp(Grundstueck.GrundstTyp value) {
        this.grundstTyp = value;
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
            Grundstueck.GrundstTyp theGrundstTyp;
            theGrundstTyp = this.getGrundstTyp();
            strategy.appendField(locator, this, "grundstTyp", buffer, theGrundstTyp);
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
        if (draftCopy instanceof Grundstueck) {
            final Grundstueck copy = ((Grundstueck) draftCopy);
            if (this.grundstTyp!= null) {
                Grundstueck.GrundstTyp sourceGrundstTyp;
                sourceGrundstTyp = this.getGrundstTyp();
                Grundstueck.GrundstTyp copyGrundstTyp = ((Grundstueck.GrundstTyp) strategy.copy(LocatorUtils.property(locator, "grundstTyp", sourceGrundstTyp), sourceGrundstTyp));
                copy.setGrundstTyp(copyGrundstTyp);
            } else {
                copy.grundstTyp = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Grundstueck();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Grundstueck)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Grundstueck that = ((Grundstueck) object);
        {
            Grundstueck.GrundstTyp lhsGrundstTyp;
            lhsGrundstTyp = this.getGrundstTyp();
            Grundstueck.GrundstTyp rhsGrundstTyp;
            rhsGrundstTyp = that.getGrundstTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grundstTyp", lhsGrundstTyp), LocatorUtils.property(thatLocator, "grundstTyp", rhsGrundstTyp), lhsGrundstTyp, rhsGrundstTyp)) {
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
     * Java enum for <em>grundst_typ</em> attribute in &lt;grundstueck&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum GrundstTyp {

        WOHNEN,
        GEWERBE,
        INDUSTRIE,
        LAND_FORSTWIRSCHAFT,
        FREIZEIT,
        GEMISCHT,
        GEWERBEPARK,
        SONDERNUTZUNG,
        SEELIEGENSCHAFT;

        public String value() {
            return name();
        }

        public static Grundstueck.GrundstTyp fromValue(String v) {
            return valueOf(v);
        }

    }

}