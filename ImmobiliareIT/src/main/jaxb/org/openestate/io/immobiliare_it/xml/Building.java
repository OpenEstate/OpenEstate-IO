
package org.openestate.io.immobiliare_it.xml;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
import org.openestate.io.immobiliare_it.xml.types.Breadcrumb;


/**
 * <p>Java class for building complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="building"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="maps" type="{http://feed.immobiliare.it}buildingMaps" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://feed.immobiliare.it}status" minOccurs="0"/&gt;
 *         &lt;element name="terrains" type="{http://feed.immobiliare.it}terrains" minOccurs="0"/&gt;
 *         &lt;element name="class" type="{http://feed.immobiliare.it}class" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="map" type="{http://feed.immobiliare.it}breadcrumb3" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "building", propOrder = {

})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
public class Building implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected BuildingMaps maps;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected StatusType status;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Terrains terrains;
    @XmlElement(name = "class")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected ClassType clazz;
    @XmlAttribute(name = "map")
    @XmlJavaTypeAdapter(Adapter11 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Breadcrumb map;

    /**
     * Gets the value of the maps property.
     * 
     * @return
     *     possible object is
     *     {@link BuildingMaps }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public BuildingMaps getMaps() {
        return maps;
    }

    /**
     * Sets the value of the maps property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildingMaps }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setMaps(BuildingMaps value) {
        this.maps = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the terrains property.
     * 
     * @return
     *     possible object is
     *     {@link Terrains }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setTerrains(Terrains value) {
        this.terrains = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link ClassType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public ClassType getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setClazz(ClassType value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the map property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Breadcrumb getMap() {
        return map;
    }

    /**
     * Sets the value of the map property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setMap(Breadcrumb value) {
        this.map = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            BuildingMaps theMaps;
            theMaps = this.getMaps();
            strategy.appendField(locator, this, "maps", buffer, theMaps, (this.maps!= null));
        }
        {
            StatusType theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus, (this.status!= null));
        }
        {
            Terrains theTerrains;
            theTerrains = this.getTerrains();
            strategy.appendField(locator, this, "terrains", buffer, theTerrains, (this.terrains!= null));
        }
        {
            ClassType theClazz;
            theClazz = this.getClazz();
            strategy.appendField(locator, this, "clazz", buffer, theClazz, (this.clazz!= null));
        }
        {
            Breadcrumb theMap;
            theMap = this.getMap();
            strategy.appendField(locator, this, "map", buffer, theMap, (this.map!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Building) {
            final Building copy = ((Building) draftCopy);
            {
                Boolean mapsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maps!= null));
                if (mapsShouldBeCopiedAndSet == Boolean.TRUE) {
                    BuildingMaps sourceMaps;
                    sourceMaps = this.getMaps();
                    BuildingMaps copyMaps = ((BuildingMaps) strategy.copy(LocatorUtils.property(locator, "maps", sourceMaps), sourceMaps, (this.maps!= null)));
                    copy.setMaps(copyMaps);
                } else {
                    if (mapsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.maps = null;
                    }
                }
            }
            {
                Boolean statusShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.status!= null));
                if (statusShouldBeCopiedAndSet == Boolean.TRUE) {
                    StatusType sourceStatus;
                    sourceStatus = this.getStatus();
                    StatusType copyStatus = ((StatusType) strategy.copy(LocatorUtils.property(locator, "status", sourceStatus), sourceStatus, (this.status!= null)));
                    copy.setStatus(copyStatus);
                } else {
                    if (statusShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.status = null;
                    }
                }
            }
            {
                Boolean terrainsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.terrains!= null));
                if (terrainsShouldBeCopiedAndSet == Boolean.TRUE) {
                    Terrains sourceTerrains;
                    sourceTerrains = this.getTerrains();
                    Terrains copyTerrains = ((Terrains) strategy.copy(LocatorUtils.property(locator, "terrains", sourceTerrains), sourceTerrains, (this.terrains!= null)));
                    copy.setTerrains(copyTerrains);
                } else {
                    if (terrainsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.terrains = null;
                    }
                }
            }
            {
                Boolean clazzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.clazz!= null));
                if (clazzShouldBeCopiedAndSet == Boolean.TRUE) {
                    ClassType sourceClazz;
                    sourceClazz = this.getClazz();
                    ClassType copyClazz = ((ClassType) strategy.copy(LocatorUtils.property(locator, "clazz", sourceClazz), sourceClazz, (this.clazz!= null)));
                    copy.setClazz(copyClazz);
                } else {
                    if (clazzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.clazz = null;
                    }
                }
            }
            {
                Boolean mapShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.map!= null));
                if (mapShouldBeCopiedAndSet == Boolean.TRUE) {
                    Breadcrumb sourceMap;
                    sourceMap = this.getMap();
                    Breadcrumb copyMap = ((Breadcrumb) strategy.copy(LocatorUtils.property(locator, "map", sourceMap), sourceMap, (this.map!= null)));
                    copy.setMap(copyMap);
                } else {
                    if (mapShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.map = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Building();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Building that = ((Building) object);
        {
            BuildingMaps lhsMaps;
            lhsMaps = this.getMaps();
            BuildingMaps rhsMaps;
            rhsMaps = that.getMaps();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maps", lhsMaps), LocatorUtils.property(thatLocator, "maps", rhsMaps), lhsMaps, rhsMaps, (this.maps!= null), (that.maps!= null))) {
                return false;
            }
        }
        {
            StatusType lhsStatus;
            lhsStatus = this.getStatus();
            StatusType rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus, (this.status!= null), (that.status!= null))) {
                return false;
            }
        }
        {
            Terrains lhsTerrains;
            lhsTerrains = this.getTerrains();
            Terrains rhsTerrains;
            rhsTerrains = that.getTerrains();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "terrains", lhsTerrains), LocatorUtils.property(thatLocator, "terrains", rhsTerrains), lhsTerrains, rhsTerrains, (this.terrains!= null), (that.terrains!= null))) {
                return false;
            }
        }
        {
            ClassType lhsClazz;
            lhsClazz = this.getClazz();
            ClassType rhsClazz;
            rhsClazz = that.getClazz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clazz", lhsClazz), LocatorUtils.property(thatLocator, "clazz", rhsClazz), lhsClazz, rhsClazz, (this.clazz!= null), (that.clazz!= null))) {
                return false;
            }
        }
        {
            Breadcrumb lhsMap;
            lhsMap = this.getMap();
            Breadcrumb rhsMap;
            rhsMap = that.getMap();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "map", lhsMap), LocatorUtils.property(thatLocator, "map", rhsMap), lhsMap, rhsMap, (this.map!= null), (that.map!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }

}
