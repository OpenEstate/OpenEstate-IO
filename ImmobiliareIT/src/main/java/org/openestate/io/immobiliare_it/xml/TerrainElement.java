
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for terrainElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="terrainElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="terrain" type="{http://feed.immobiliare.it}terrainType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "terrainElement", propOrder = {

})
public class TerrainElement
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    protected TerrainType terrain;

    /**
     * Gets the value of the terrain property.
     * 
     * @return
     *     possible object is
     *     {@link TerrainType }
     *     
     */
    public TerrainType getTerrain() {
        return terrain;
    }

    /**
     * Sets the value of the terrain property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerrainType }
     *     
     */
    public void setTerrain(TerrainType value) {
        this.terrain = value;
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
            TerrainType theTerrain;
            theTerrain = this.getTerrain();
            strategy.appendField(locator, this, "terrain", buffer, theTerrain);
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
        if (draftCopy instanceof TerrainElement) {
            final TerrainElement copy = ((TerrainElement) draftCopy);
            if (this.terrain!= null) {
                TerrainType sourceTerrain;
                sourceTerrain = this.getTerrain();
                TerrainType copyTerrain = ((TerrainType) strategy.copy(LocatorUtils.property(locator, "terrain", sourceTerrain), sourceTerrain));
                copy.setTerrain(copyTerrain);
            } else {
                copy.terrain = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TerrainElement();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TerrainElement)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TerrainElement that = ((TerrainElement) object);
        {
            TerrainType lhsTerrain;
            lhsTerrain = this.getTerrain();
            TerrainType rhsTerrain;
            rhsTerrain = that.getTerrain();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "terrain", lhsTerrain), LocatorUtils.property(thatLocator, "terrain", rhsTerrain), lhsTerrain, rhsTerrain)) {
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
