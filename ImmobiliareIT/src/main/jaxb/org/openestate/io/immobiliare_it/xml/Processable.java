
package org.openestate.io.immobiliare_it.xml;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Calendar;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for processable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="processable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unique-id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="published-on" type="{http://feed.immobiliare.it}dateUpdatedType" minOccurs="0"/&gt;
 *         &lt;element name="date-updated" type="{http://feed.immobiliare.it}dateUpdatedType" minOccurs="0"/&gt;
 *         &lt;element name="agent" type="{http://feed.immobiliare.it}agent"/&gt;
 *         &lt;element name="location" type="{http://feed.immobiliare.it}locationStructure"/&gt;
 *         &lt;element name="pictures" type="{http://feed.immobiliare.it}pictures" minOccurs="0"/&gt;
 *         &lt;element name="videos" type="{http://feed.immobiliare.it}videos" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="operation" type="{http://feed.immobiliare.it}operation" /&gt;
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processable", propOrder = {
    "uniqueId",
    "publishedOn",
    "dateUpdated",
    "agent",
    "location",
    "pictures",
    "videos"
})
@XmlSeeAlso({
    Property.class,
    Project.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
public abstract class Processable implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "unique-id", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected String uniqueId;
    @XmlElement(name = "published-on", type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Calendar publishedOn;
    @XmlElement(name = "date-updated", type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Calendar dateUpdated;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Agent agent;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected LocationStructure location;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Pictures pictures;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Videos videos;
    @XmlAttribute(name = "operation")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected OperationType operation;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "long")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected BigInteger id;

    /**
     * Gets the value of the uniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public String getUniqueId() {
        return uniqueId;
    }

    /**
     * Sets the value of the uniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setUniqueId(String value) {
        this.uniqueId = value;
    }

    /**
     * Gets the value of the publishedOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Calendar getPublishedOn() {
        return publishedOn;
    }

    /**
     * Sets the value of the publishedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setPublishedOn(Calendar value) {
        this.publishedOn = value;
    }

    /**
     * Gets the value of the dateUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Calendar getDateUpdated() {
        return dateUpdated;
    }

    /**
     * Sets the value of the dateUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setDateUpdated(Calendar value) {
        this.dateUpdated = value;
    }

    /**
     * Gets the value of the agent property.
     * 
     * @return
     *     possible object is
     *     {@link Agent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Agent getAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setAgent(Agent value) {
        this.agent = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public LocationStructure getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setLocation(LocationStructure value) {
        this.location = value;
    }

    /**
     * Gets the value of the pictures property.
     * 
     * @return
     *     possible object is
     *     {@link Pictures }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Pictures getPictures() {
        return pictures;
    }

    /**
     * Sets the value of the pictures property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pictures }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setPictures(Pictures value) {
        this.pictures = value;
    }

    /**
     * Gets the value of the videos property.
     * 
     * @return
     *     possible object is
     *     {@link Videos }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Videos getVideos() {
        return videos;
    }

    /**
     * Sets the value of the videos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Videos }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setVideos(Videos value) {
        this.videos = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link OperationType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public OperationType getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setOperation(OperationType value) {
        this.operation = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public BigInteger getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setID(BigInteger value) {
        this.id = value;
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
            String theUniqueId;
            theUniqueId = this.getUniqueId();
            strategy.appendField(locator, this, "uniqueId", buffer, theUniqueId, (this.uniqueId!= null));
        }
        {
            Calendar thePublishedOn;
            thePublishedOn = this.getPublishedOn();
            strategy.appendField(locator, this, "publishedOn", buffer, thePublishedOn, (this.publishedOn!= null));
        }
        {
            Calendar theDateUpdated;
            theDateUpdated = this.getDateUpdated();
            strategy.appendField(locator, this, "dateUpdated", buffer, theDateUpdated, (this.dateUpdated!= null));
        }
        {
            Agent theAgent;
            theAgent = this.getAgent();
            strategy.appendField(locator, this, "agent", buffer, theAgent, (this.agent!= null));
        }
        {
            LocationStructure theLocation;
            theLocation = this.getLocation();
            strategy.appendField(locator, this, "location", buffer, theLocation, (this.location!= null));
        }
        {
            Pictures thePictures;
            thePictures = this.getPictures();
            strategy.appendField(locator, this, "pictures", buffer, thePictures, (this.pictures!= null));
        }
        {
            Videos theVideos;
            theVideos = this.getVideos();
            strategy.appendField(locator, this, "videos", buffer, theVideos, (this.videos!= null));
        }
        {
            OperationType theOperation;
            theOperation = this.getOperation();
            strategy.appendField(locator, this, "operation", buffer, theOperation, (this.operation!= null));
        }
        {
            BigInteger theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID, (this.id!= null));
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        if (target instanceof Processable) {
            final Processable copy = ((Processable) target);
            {
                Boolean uniqueIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.uniqueId!= null));
                if (uniqueIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceUniqueId;
                    sourceUniqueId = this.getUniqueId();
                    String copyUniqueId = ((String) strategy.copy(LocatorUtils.property(locator, "uniqueId", sourceUniqueId), sourceUniqueId, (this.uniqueId!= null)));
                    copy.setUniqueId(copyUniqueId);
                } else {
                    if (uniqueIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.uniqueId = null;
                    }
                }
            }
            {
                Boolean publishedOnShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.publishedOn!= null));
                if (publishedOnShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourcePublishedOn;
                    sourcePublishedOn = this.getPublishedOn();
                    Calendar copyPublishedOn = ((Calendar) strategy.copy(LocatorUtils.property(locator, "publishedOn", sourcePublishedOn), sourcePublishedOn, (this.publishedOn!= null)));
                    copy.setPublishedOn(copyPublishedOn);
                } else {
                    if (publishedOnShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.publishedOn = null;
                    }
                }
            }
            {
                Boolean dateUpdatedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dateUpdated!= null));
                if (dateUpdatedShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceDateUpdated;
                    sourceDateUpdated = this.getDateUpdated();
                    Calendar copyDateUpdated = ((Calendar) strategy.copy(LocatorUtils.property(locator, "dateUpdated", sourceDateUpdated), sourceDateUpdated, (this.dateUpdated!= null)));
                    copy.setDateUpdated(copyDateUpdated);
                } else {
                    if (dateUpdatedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dateUpdated = null;
                    }
                }
            }
            {
                Boolean agentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.agent!= null));
                if (agentShouldBeCopiedAndSet == Boolean.TRUE) {
                    Agent sourceAgent;
                    sourceAgent = this.getAgent();
                    Agent copyAgent = ((Agent) strategy.copy(LocatorUtils.property(locator, "agent", sourceAgent), sourceAgent, (this.agent!= null)));
                    copy.setAgent(copyAgent);
                } else {
                    if (agentShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.agent = null;
                    }
                }
            }
            {
                Boolean locationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.location!= null));
                if (locationShouldBeCopiedAndSet == Boolean.TRUE) {
                    LocationStructure sourceLocation;
                    sourceLocation = this.getLocation();
                    LocationStructure copyLocation = ((LocationStructure) strategy.copy(LocatorUtils.property(locator, "location", sourceLocation), sourceLocation, (this.location!= null)));
                    copy.setLocation(copyLocation);
                } else {
                    if (locationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.location = null;
                    }
                }
            }
            {
                Boolean picturesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pictures!= null));
                if (picturesShouldBeCopiedAndSet == Boolean.TRUE) {
                    Pictures sourcePictures;
                    sourcePictures = this.getPictures();
                    Pictures copyPictures = ((Pictures) strategy.copy(LocatorUtils.property(locator, "pictures", sourcePictures), sourcePictures, (this.pictures!= null)));
                    copy.setPictures(copyPictures);
                } else {
                    if (picturesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pictures = null;
                    }
                }
            }
            {
                Boolean videosShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.videos!= null));
                if (videosShouldBeCopiedAndSet == Boolean.TRUE) {
                    Videos sourceVideos;
                    sourceVideos = this.getVideos();
                    Videos copyVideos = ((Videos) strategy.copy(LocatorUtils.property(locator, "videos", sourceVideos), sourceVideos, (this.videos!= null)));
                    copy.setVideos(copyVideos);
                } else {
                    if (videosShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.videos = null;
                    }
                }
            }
            {
                Boolean operationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.operation!= null));
                if (operationShouldBeCopiedAndSet == Boolean.TRUE) {
                    OperationType sourceOperation;
                    sourceOperation = this.getOperation();
                    OperationType copyOperation = ((OperationType) strategy.copy(LocatorUtils.property(locator, "operation", sourceOperation), sourceOperation, (this.operation!= null)));
                    copy.setOperation(copyOperation);
                } else {
                    if (operationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.operation = null;
                    }
                }
            }
            {
                Boolean idShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.id!= null));
                if (idShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceID;
                    sourceID = this.getID();
                    BigInteger copyID = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "id", sourceID), sourceID, (this.id!= null)));
                    copy.setID(copyID);
                } else {
                    if (idShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.id = null;
                    }
                }
            }
        }
        return target;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Processable that = ((Processable) object);
        {
            String lhsUniqueId;
            lhsUniqueId = this.getUniqueId();
            String rhsUniqueId;
            rhsUniqueId = that.getUniqueId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uniqueId", lhsUniqueId), LocatorUtils.property(thatLocator, "uniqueId", rhsUniqueId), lhsUniqueId, rhsUniqueId, (this.uniqueId!= null), (that.uniqueId!= null))) {
                return false;
            }
        }
        {
            Calendar lhsPublishedOn;
            lhsPublishedOn = this.getPublishedOn();
            Calendar rhsPublishedOn;
            rhsPublishedOn = that.getPublishedOn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "publishedOn", lhsPublishedOn), LocatorUtils.property(thatLocator, "publishedOn", rhsPublishedOn), lhsPublishedOn, rhsPublishedOn, (this.publishedOn!= null), (that.publishedOn!= null))) {
                return false;
            }
        }
        {
            Calendar lhsDateUpdated;
            lhsDateUpdated = this.getDateUpdated();
            Calendar rhsDateUpdated;
            rhsDateUpdated = that.getDateUpdated();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateUpdated", lhsDateUpdated), LocatorUtils.property(thatLocator, "dateUpdated", rhsDateUpdated), lhsDateUpdated, rhsDateUpdated, (this.dateUpdated!= null), (that.dateUpdated!= null))) {
                return false;
            }
        }
        {
            Agent lhsAgent;
            lhsAgent = this.getAgent();
            Agent rhsAgent;
            rhsAgent = that.getAgent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "agent", lhsAgent), LocatorUtils.property(thatLocator, "agent", rhsAgent), lhsAgent, rhsAgent, (this.agent!= null), (that.agent!= null))) {
                return false;
            }
        }
        {
            LocationStructure lhsLocation;
            lhsLocation = this.getLocation();
            LocationStructure rhsLocation;
            rhsLocation = that.getLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "location", lhsLocation), LocatorUtils.property(thatLocator, "location", rhsLocation), lhsLocation, rhsLocation, (this.location!= null), (that.location!= null))) {
                return false;
            }
        }
        {
            Pictures lhsPictures;
            lhsPictures = this.getPictures();
            Pictures rhsPictures;
            rhsPictures = that.getPictures();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pictures", lhsPictures), LocatorUtils.property(thatLocator, "pictures", rhsPictures), lhsPictures, rhsPictures, (this.pictures!= null), (that.pictures!= null))) {
                return false;
            }
        }
        {
            Videos lhsVideos;
            lhsVideos = this.getVideos();
            Videos rhsVideos;
            rhsVideos = that.getVideos();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "videos", lhsVideos), LocatorUtils.property(thatLocator, "videos", rhsVideos), lhsVideos, rhsVideos, (this.videos!= null), (that.videos!= null))) {
                return false;
            }
        }
        {
            OperationType lhsOperation;
            lhsOperation = this.getOperation();
            OperationType rhsOperation;
            rhsOperation = that.getOperation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "operation", lhsOperation), LocatorUtils.property(thatLocator, "operation", rhsOperation), lhsOperation, rhsOperation, (this.operation!= null), (that.operation!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsID;
            lhsID = this.getID();
            BigInteger rhsID;
            rhsID = that.getID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsID), LocatorUtils.property(thatLocator, "id", rhsID), lhsID, rhsID, (this.id!= null), (that.id!= null))) {
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
