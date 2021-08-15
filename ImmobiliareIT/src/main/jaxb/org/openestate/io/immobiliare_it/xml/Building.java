
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
import org.openestate.io.immobiliare_it.xml.types.Category;


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
 *         &lt;element name="status" type="{http://feed.immobiliare.it}status"/&gt;
 *         &lt;element name="terrains" type="{http://feed.immobiliare.it}terrains" minOccurs="0"/&gt;
 *         &lt;element name="class" type="{http://feed.immobiliare.it}class" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="category" type="{http://feed.immobiliare.it}cat" /&gt;
 *       &lt;attribute name="type" type="{http://feed.immobiliare.it}allPropertyTypeSimple" /&gt;
 *       &lt;attribute name="detail" type="{http://feed.immobiliare.it}PropertyTypeBusiness" /&gt;
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
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
public class Building implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    protected Status status;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    protected Terrains terrains;
    @XmlElement(name = "class")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    protected Clazz clazz;
    @XmlAttribute(name = "category")
    @XmlJavaTypeAdapter(Adapter5 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    protected Category category;
    @XmlAttribute(name = "type")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    protected PropertyType type;
    @XmlAttribute(name = "detail")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    protected PropertyTypeBusiness detail;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public void setStatus(Status value) {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public void setTerrains(Terrains value) {
        this.terrains = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link Clazz }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public Clazz getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Clazz }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public void setClazz(Clazz value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public Category getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public void setCategory(Category value) {
        this.category = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public PropertyType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public void setType(PropertyType value) {
        this.type = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyTypeBusiness }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public PropertyTypeBusiness getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyTypeBusiness }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public void setDetail(PropertyTypeBusiness value) {
        this.detail = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            Status theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus, (this.status!= null));
        }
        {
            Terrains theTerrains;
            theTerrains = this.getTerrains();
            strategy.appendField(locator, this, "terrains", buffer, theTerrains, (this.terrains!= null));
        }
        {
            Clazz theClazz;
            theClazz = this.getClazz();
            strategy.appendField(locator, this, "clazz", buffer, theClazz, (this.clazz!= null));
        }
        {
            Category theCategory;
            theCategory = this.getCategory();
            strategy.appendField(locator, this, "category", buffer, theCategory, (this.category!= null));
        }
        {
            PropertyType theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType, (this.type!= null));
        }
        {
            PropertyTypeBusiness theDetail;
            theDetail = this.getDetail();
            strategy.appendField(locator, this, "detail", buffer, theDetail, (this.detail!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Building) {
            final Building copy = ((Building) draftCopy);
            {
                Boolean statusShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.status!= null));
                if (statusShouldBeCopiedAndSet == Boolean.TRUE) {
                    Status sourceStatus;
                    sourceStatus = this.getStatus();
                    Status copyStatus = ((Status) strategy.copy(LocatorUtils.property(locator, "status", sourceStatus), sourceStatus, (this.status!= null)));
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
                    Clazz sourceClazz;
                    sourceClazz = this.getClazz();
                    Clazz copyClazz = ((Clazz) strategy.copy(LocatorUtils.property(locator, "clazz", sourceClazz), sourceClazz, (this.clazz!= null)));
                    copy.setClazz(copyClazz);
                } else {
                    if (clazzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.clazz = null;
                    }
                }
            }
            {
                Boolean categoryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.category!= null));
                if (categoryShouldBeCopiedAndSet == Boolean.TRUE) {
                    Category sourceCategory;
                    sourceCategory = this.getCategory();
                    Category copyCategory = ((Category) strategy.copy(LocatorUtils.property(locator, "category", sourceCategory), sourceCategory, (this.category!= null)));
                    copy.setCategory(copyCategory);
                } else {
                    if (categoryShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.category = null;
                    }
                }
            }
            {
                Boolean typeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.type!= null));
                if (typeShouldBeCopiedAndSet == Boolean.TRUE) {
                    PropertyType sourceType;
                    sourceType = this.getType();
                    PropertyType copyType = ((PropertyType) strategy.copy(LocatorUtils.property(locator, "type", sourceType), sourceType, (this.type!= null)));
                    copy.setType(copyType);
                } else {
                    if (typeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.type = null;
                    }
                }
            }
            {
                Boolean detailShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.detail!= null));
                if (detailShouldBeCopiedAndSet == Boolean.TRUE) {
                    PropertyTypeBusiness sourceDetail;
                    sourceDetail = this.getDetail();
                    PropertyTypeBusiness copyDetail = ((PropertyTypeBusiness) strategy.copy(LocatorUtils.property(locator, "detail", sourceDetail), sourceDetail, (this.detail!= null)));
                    copy.setDetail(copyDetail);
                } else {
                    if (detailShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.detail = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Building();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Building that = ((Building) object);
        {
            Status lhsStatus;
            lhsStatus = this.getStatus();
            Status rhsStatus;
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
            Clazz lhsClazz;
            lhsClazz = this.getClazz();
            Clazz rhsClazz;
            rhsClazz = that.getClazz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clazz", lhsClazz), LocatorUtils.property(thatLocator, "clazz", rhsClazz), lhsClazz, rhsClazz, (this.clazz!= null), (that.clazz!= null))) {
                return false;
            }
        }
        {
            Category lhsCategory;
            lhsCategory = this.getCategory();
            Category rhsCategory;
            rhsCategory = that.getCategory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "category", lhsCategory), LocatorUtils.property(thatLocator, "category", rhsCategory), lhsCategory, rhsCategory, (this.category!= null), (that.category!= null))) {
                return false;
            }
        }
        {
            PropertyType lhsType;
            lhsType = this.getType();
            PropertyType rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType, (this.type!= null), (that.type!= null))) {
                return false;
            }
        }
        {
            PropertyTypeBusiness lhsDetail;
            lhsDetail = this.getDetail();
            PropertyTypeBusiness rhsDetail;
            rhsDetail = that.getDetail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "detail", lhsDetail), LocatorUtils.property(thatLocator, "detail", rhsDetail), lhsDetail, rhsDetail, (this.detail!= null), (that.detail!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }

}
