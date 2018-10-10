
package org.openestate.io.immoxml.xml;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * Java class for &lt;geokoordinaten&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "geokoordinaten")
public class Geokoordinaten implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "breitengrad", required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "float")
    protected BigDecimal breitengrad;
    @XmlAttribute(name = "laengengrad", required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "float")
    protected BigDecimal laengengrad;

    /**
     * Gets the value of the breitengrad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getBreitengrad() {
        return breitengrad;
    }

    /**
     * Sets the value of the breitengrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBreitengrad(BigDecimal value) {
        this.breitengrad = value;
    }

    /**
     * Gets the value of the laengengrad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getLaengengrad() {
        return laengengrad;
    }

    /**
     * Sets the value of the laengengrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaengengrad(BigDecimal value) {
        this.laengengrad = value;
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
            BigDecimal theBreitengrad;
            theBreitengrad = this.getBreitengrad();
            strategy.appendField(locator, this, "breitengrad", buffer, theBreitengrad, (this.breitengrad!= null));
        }
        {
            BigDecimal theLaengengrad;
            theLaengengrad = this.getLaengengrad();
            strategy.appendField(locator, this, "laengengrad", buffer, theLaengengrad, (this.laengengrad!= null));
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
        if (draftCopy instanceof Geokoordinaten) {
            final Geokoordinaten copy = ((Geokoordinaten) draftCopy);
            {
                Boolean breitengradShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.breitengrad!= null));
                if (breitengradShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceBreitengrad;
                    sourceBreitengrad = this.getBreitengrad();
                    BigDecimal copyBreitengrad = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "breitengrad", sourceBreitengrad), sourceBreitengrad, (this.breitengrad!= null)));
                    copy.setBreitengrad(copyBreitengrad);
                } else {
                    if (breitengradShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.breitengrad = null;
                    }
                }
            }
            {
                Boolean laengengradShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.laengengrad!= null));
                if (laengengradShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceLaengengrad;
                    sourceLaengengrad = this.getLaengengrad();
                    BigDecimal copyLaengengrad = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "laengengrad", sourceLaengengrad), sourceLaengengrad, (this.laengengrad!= null)));
                    copy.setLaengengrad(copyLaengengrad);
                } else {
                    if (laengengradShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.laengengrad = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Geokoordinaten();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Geokoordinaten that = ((Geokoordinaten) object);
        {
            BigDecimal lhsBreitengrad;
            lhsBreitengrad = this.getBreitengrad();
            BigDecimal rhsBreitengrad;
            rhsBreitengrad = that.getBreitengrad();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "breitengrad", lhsBreitengrad), LocatorUtils.property(thatLocator, "breitengrad", rhsBreitengrad), lhsBreitengrad, rhsBreitengrad, (this.breitengrad!= null), (that.breitengrad!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsLaengengrad;
            lhsLaengengrad = this.getLaengengrad();
            BigDecimal rhsLaengengrad;
            rhsLaengengrad = that.getLaengengrad();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "laengengrad", lhsLaengengrad), LocatorUtils.property(thatLocator, "laengengrad", rhsLaengengrad), lhsLaengengrad, rhsLaengengrad, (this.laengengrad!= null), (that.laengengrad!= null))) {
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
