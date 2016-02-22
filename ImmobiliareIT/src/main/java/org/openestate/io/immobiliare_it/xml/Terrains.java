
package org.openestate.io.immobiliare_it.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for terrains complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="terrains"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="terrain" type="{http://feed.immobiliare.it}terrainType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "terrains", propOrder = {
    "terrain"
})
public class Terrains implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<TerrainType> terrain;

    /**
     * Gets the value of the terrain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the terrain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerrain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerrainType }
     * 
     * 
     */
    public List<TerrainType> getTerrain() {
        if (terrain == null) {
            terrain = new ArrayList<TerrainType>();
        }
        return this.terrain;
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
            List<TerrainType> theTerrain;
            theTerrain = (((this.terrain!= null)&&(!this.terrain.isEmpty()))?this.getTerrain():null);
            strategy.appendField(locator, this, "terrain", buffer, theTerrain, ((this.terrain!= null)&&(!this.terrain.isEmpty())));
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
        if (draftCopy instanceof Terrains) {
            final Terrains copy = ((Terrains) draftCopy);
            {
                Boolean terrainShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.terrain!= null)&&(!this.terrain.isEmpty())));
                if (terrainShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<TerrainType> sourceTerrain;
                    sourceTerrain = (((this.terrain!= null)&&(!this.terrain.isEmpty()))?this.getTerrain():null);
                    @SuppressWarnings("unchecked")
                    List<TerrainType> copyTerrain = ((List<TerrainType> ) strategy.copy(LocatorUtils.property(locator, "terrain", sourceTerrain), sourceTerrain, ((this.terrain!= null)&&(!this.terrain.isEmpty()))));
                    copy.terrain = null;
                    if (copyTerrain!= null) {
                        List<TerrainType> uniqueTerrainl = copy.getTerrain();
                        uniqueTerrainl.addAll(copyTerrain);
                    }
                } else {
                    if (terrainShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.terrain = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Terrains();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Terrains that = ((Terrains) object);
        {
            List<TerrainType> lhsTerrain;
            lhsTerrain = (((this.terrain!= null)&&(!this.terrain.isEmpty()))?this.getTerrain():null);
            List<TerrainType> rhsTerrain;
            rhsTerrain = (((that.terrain!= null)&&(!that.terrain.isEmpty()))?that.getTerrain():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "terrain", lhsTerrain), LocatorUtils.property(thatLocator, "terrain", rhsTerrain), lhsTerrain, rhsTerrain, ((this.terrain!= null)&&(!this.terrain.isEmpty())), ((that.terrain!= null)&&(!that.terrain.isEmpty())))) {
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
