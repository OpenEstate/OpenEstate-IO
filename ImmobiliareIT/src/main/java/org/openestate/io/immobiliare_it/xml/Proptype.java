
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for proptype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="proptype"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="type" type="{http://feed.immobiliare.it}propertyTypeSimple"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="business-type" type="{http://feed.immobiliare.it}businessElement"/&gt;
 *           &lt;element name="terrains" type="{http://feed.immobiliare.it}terrains" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "proptype", propOrder = {
    "type",
    "businessType",
    "terrains"
})
public class Proptype
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlSchemaType(name = "string")
    protected PropertyTypeSimple type;
    @XmlElement(name = "business-type")
    protected BusinessElement businessType;
    protected Terrains terrains;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyTypeSimple }
     *     
     */
    public PropertyTypeSimple getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyTypeSimple }
     *     
     */
    public void setType(PropertyTypeSimple value) {
        this.type = value;
    }

    /**
     * Gets the value of the businessType property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessElement }
     *     
     */
    public BusinessElement getBusinessType() {
        return businessType;
    }

    /**
     * Sets the value of the businessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessElement }
     *     
     */
    public void setBusinessType(BusinessElement value) {
        this.businessType = value;
    }

    /**
     * Gets the value of the terrains property.
     * 
     * @return
     *     possible object is
     *     {@link Terrains }
     *     
     */
    public Terrains getTerrains() {
        return terrains;
    }

    /**
     * Sets the value of the terrains property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terrains }
     *     
     */
    public void setTerrains(Terrains value) {
        this.terrains = value;
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
            PropertyTypeSimple theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            BusinessElement theBusinessType;
            theBusinessType = this.getBusinessType();
            strategy.appendField(locator, this, "businessType", buffer, theBusinessType);
        }
        {
            Terrains theTerrains;
            theTerrains = this.getTerrains();
            strategy.appendField(locator, this, "terrains", buffer, theTerrains);
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
        if (draftCopy instanceof Proptype) {
            final Proptype copy = ((Proptype) draftCopy);
            if (this.type!= null) {
                PropertyTypeSimple sourceType;
                sourceType = this.getType();
                PropertyTypeSimple copyType = ((PropertyTypeSimple) strategy.copy(LocatorUtils.property(locator, "type", sourceType), sourceType));
                copy.setType(copyType);
            } else {
                copy.type = null;
            }
            if (this.businessType!= null) {
                BusinessElement sourceBusinessType;
                sourceBusinessType = this.getBusinessType();
                BusinessElement copyBusinessType = ((BusinessElement) strategy.copy(LocatorUtils.property(locator, "businessType", sourceBusinessType), sourceBusinessType));
                copy.setBusinessType(copyBusinessType);
            } else {
                copy.businessType = null;
            }
            if (this.terrains!= null) {
                Terrains sourceTerrains;
                sourceTerrains = this.getTerrains();
                Terrains copyTerrains = ((Terrains) strategy.copy(LocatorUtils.property(locator, "terrains", sourceTerrains), sourceTerrains));
                copy.setTerrains(copyTerrains);
            } else {
                copy.terrains = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Proptype();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Proptype)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Proptype that = ((Proptype) object);
        {
            PropertyTypeSimple lhsType;
            lhsType = this.getType();
            PropertyTypeSimple rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            BusinessElement lhsBusinessType;
            lhsBusinessType = this.getBusinessType();
            BusinessElement rhsBusinessType;
            rhsBusinessType = that.getBusinessType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "businessType", lhsBusinessType), LocatorUtils.property(thatLocator, "businessType", rhsBusinessType), lhsBusinessType, rhsBusinessType)) {
                return false;
            }
        }
        {
            Terrains lhsTerrains;
            lhsTerrains = this.getTerrains();
            Terrains rhsTerrains;
            rhsTerrains = that.getTerrains();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "terrains", lhsTerrains), LocatorUtils.property(thatLocator, "terrains", rhsTerrains), lhsTerrains, rhsTerrains)) {
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
