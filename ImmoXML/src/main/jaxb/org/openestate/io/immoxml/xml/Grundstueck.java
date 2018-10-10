
package org.openestate.io.immoxml.xml;

import java.io.Serializable;
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
 * Java class for &lt;grundstueck&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "grundstueck")
public class Grundstueck implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
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
            Grundstueck.GrundstTyp theGrundstTyp;
            theGrundstTyp = this.getGrundstTyp();
            strategy.appendField(locator, this, "grundstTyp", buffer, theGrundstTyp, (this.grundstTyp!= null));
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
        if (draftCopy instanceof Grundstueck) {
            final Grundstueck copy = ((Grundstueck) draftCopy);
            {
                Boolean grundstTypShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.grundstTyp!= null));
                if (grundstTypShouldBeCopiedAndSet == Boolean.TRUE) {
                    Grundstueck.GrundstTyp sourceGrundstTyp;
                    sourceGrundstTyp = this.getGrundstTyp();
                    Grundstueck.GrundstTyp copyGrundstTyp = ((Grundstueck.GrundstTyp) strategy.copy(LocatorUtils.property(locator, "grundstTyp", sourceGrundstTyp), sourceGrundstTyp, (this.grundstTyp!= null)));
                    copy.setGrundstTyp(copyGrundstTyp);
                } else {
                    if (grundstTypShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.grundstTyp = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Grundstueck();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grundstTyp", lhsGrundstTyp), LocatorUtils.property(thatLocator, "grundstTyp", rhsGrundstTyp), lhsGrundstTyp, rhsGrundstTyp, (this.grundstTyp!= null), (that.grundstTyp!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


    /**
     * 
     *                     Java enum for <em>grundst_typ</em> attribute in &lt;grundstueck&gt; elements.
     * 
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="WOHNEN"/&gt;
     *     &lt;enumeration value="GEWERBE"/&gt;
     *     &lt;enumeration value="INDUSTRIE"/&gt;
     *     &lt;enumeration value="LAND_FORSTWIRSCHAFT"/&gt;
     *     &lt;enumeration value="FREIZEIT"/&gt;
     *     &lt;enumeration value="GEMISCHT"/&gt;
     *     &lt;enumeration value="SONDERNUTZUNG"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
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
        SONDERNUTZUNG;

        public String value() {
            return name();
        }

        public static Grundstueck.GrundstTyp fromValue(String v) {
            return valueOf(v);
        }

    }

}
