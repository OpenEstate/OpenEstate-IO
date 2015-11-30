
package org.openestate.io.kyero.xml;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * <p>Java class for surfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="surfaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="built" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="plot" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "surfaceType", propOrder = {

})
public class SurfaceType
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected BigInteger built;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected BigInteger plot;

    /**
     * Gets the value of the built property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigInteger getBuilt() {
        return built;
    }

    /**
     * Sets the value of the built property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuilt(BigInteger value) {
        this.built = value;
    }

    /**
     * Gets the value of the plot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigInteger getPlot() {
        return plot;
    }

    /**
     * Sets the value of the plot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlot(BigInteger value) {
        this.plot = value;
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
            BigInteger theBuilt;
            theBuilt = this.getBuilt();
            strategy.appendField(locator, this, "built", buffer, theBuilt);
        }
        {
            BigInteger thePlot;
            thePlot = this.getPlot();
            strategy.appendField(locator, this, "plot", buffer, thePlot);
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
        if (draftCopy instanceof SurfaceType) {
            final SurfaceType copy = ((SurfaceType) draftCopy);
            if (this.built!= null) {
                BigInteger sourceBuilt;
                sourceBuilt = this.getBuilt();
                BigInteger copyBuilt = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "built", sourceBuilt), sourceBuilt));
                copy.setBuilt(copyBuilt);
            } else {
                copy.built = null;
            }
            if (this.plot!= null) {
                BigInteger sourcePlot;
                sourcePlot = this.getPlot();
                BigInteger copyPlot = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "plot", sourcePlot), sourcePlot));
                copy.setPlot(copyPlot);
            } else {
                copy.plot = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new SurfaceType();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SurfaceType that = ((SurfaceType) object);
        {
            BigInteger lhsBuilt;
            lhsBuilt = this.getBuilt();
            BigInteger rhsBuilt;
            rhsBuilt = that.getBuilt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "built", lhsBuilt), LocatorUtils.property(thatLocator, "built", rhsBuilt), lhsBuilt, rhsBuilt)) {
                return false;
            }
        }
        {
            BigInteger lhsPlot;
            lhsPlot = this.getPlot();
            BigInteger rhsPlot;
            rhsPlot = that.getPlot();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "plot", lhsPlot), LocatorUtils.property(thatLocator, "plot", rhsPlot), lhsPlot, rhsPlot)) {
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
