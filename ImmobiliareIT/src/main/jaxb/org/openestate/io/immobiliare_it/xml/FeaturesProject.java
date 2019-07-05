
package org.openestate.io.immobiliare_it.xml;

import java.io.Serializable;
import java.util.Calendar;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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


/**
 * <p>Java class for features-project complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="features-project"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="building-status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="start-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="end-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="specification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="floorplanner-url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="virtual-tour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descriptions" type="{http://feed.immobiliare.it}descriptions" minOccurs="0"/&gt;
 *         &lt;element name="energy-class" type="{http://feed.immobiliare.it}classEnergy"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "features-project", propOrder = {

})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
public class FeaturesProject implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "building-status")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected String buildingStatus;
    @XmlElement(name = "start-date", type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected Calendar startDate;
    @XmlElement(name = "end-date", type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected Calendar endDate;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected String name;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected String specification;
    @XmlElement(name = "floorplanner-url")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected String floorplannerUrl;
    @XmlElement(name = "virtual-tour")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected String virtualTour;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected Descriptions descriptions;
    @XmlElement(name = "energy-class", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected ClassEnergy energyClass;

    /**
     * Gets the value of the buildingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public String getBuildingStatus() {
        return buildingStatus;
    }

    /**
     * Sets the value of the buildingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setBuildingStatus(String value) {
        this.buildingStatus = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Calendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setStartDate(Calendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Calendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setEndDate(Calendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the specification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public String getSpecification() {
        return specification;
    }

    /**
     * Sets the value of the specification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setSpecification(String value) {
        this.specification = value;
    }

    /**
     * Gets the value of the floorplannerUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public String getFloorplannerUrl() {
        return floorplannerUrl;
    }

    /**
     * Sets the value of the floorplannerUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setFloorplannerUrl(String value) {
        this.floorplannerUrl = value;
    }

    /**
     * Gets the value of the virtualTour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public String getVirtualTour() {
        return virtualTour;
    }

    /**
     * Sets the value of the virtualTour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setVirtualTour(String value) {
        this.virtualTour = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link Descriptions }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Descriptions getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Descriptions }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setDescriptions(Descriptions value) {
        this.descriptions = value;
    }

    /**
     * Gets the value of the energyClass property.
     * 
     * @return
     *     possible object is
     *     {@link ClassEnergy }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public ClassEnergy getEnergyClass() {
        return energyClass;
    }

    /**
     * Sets the value of the energyClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassEnergy }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setEnergyClass(ClassEnergy value) {
        this.energyClass = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            String theBuildingStatus;
            theBuildingStatus = this.getBuildingStatus();
            strategy.appendField(locator, this, "buildingStatus", buffer, theBuildingStatus, (this.buildingStatus!= null));
        }
        {
            Calendar theStartDate;
            theStartDate = this.getStartDate();
            strategy.appendField(locator, this, "startDate", buffer, theStartDate, (this.startDate!= null));
        }
        {
            Calendar theEndDate;
            theEndDate = this.getEndDate();
            strategy.appendField(locator, this, "endDate", buffer, theEndDate, (this.endDate!= null));
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            String theSpecification;
            theSpecification = this.getSpecification();
            strategy.appendField(locator, this, "specification", buffer, theSpecification, (this.specification!= null));
        }
        {
            String theFloorplannerUrl;
            theFloorplannerUrl = this.getFloorplannerUrl();
            strategy.appendField(locator, this, "floorplannerUrl", buffer, theFloorplannerUrl, (this.floorplannerUrl!= null));
        }
        {
            String theVirtualTour;
            theVirtualTour = this.getVirtualTour();
            strategy.appendField(locator, this, "virtualTour", buffer, theVirtualTour, (this.virtualTour!= null));
        }
        {
            Descriptions theDescriptions;
            theDescriptions = this.getDescriptions();
            strategy.appendField(locator, this, "descriptions", buffer, theDescriptions, (this.descriptions!= null));
        }
        {
            ClassEnergy theEnergyClass;
            theEnergyClass = this.getEnergyClass();
            strategy.appendField(locator, this, "energyClass", buffer, theEnergyClass, (this.energyClass!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof FeaturesProject) {
            final FeaturesProject copy = ((FeaturesProject) draftCopy);
            {
                Boolean buildingStatusShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.buildingStatus!= null));
                if (buildingStatusShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBuildingStatus;
                    sourceBuildingStatus = this.getBuildingStatus();
                    String copyBuildingStatus = ((String) strategy.copy(LocatorUtils.property(locator, "buildingStatus", sourceBuildingStatus), sourceBuildingStatus, (this.buildingStatus!= null)));
                    copy.setBuildingStatus(copyBuildingStatus);
                } else {
                    if (buildingStatusShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.buildingStatus = null;
                    }
                }
            }
            {
                Boolean startDateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.startDate!= null));
                if (startDateShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceStartDate;
                    sourceStartDate = this.getStartDate();
                    Calendar copyStartDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "startDate", sourceStartDate), sourceStartDate, (this.startDate!= null)));
                    copy.setStartDate(copyStartDate);
                } else {
                    if (startDateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.startDate = null;
                    }
                }
            }
            {
                Boolean endDateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.endDate!= null));
                if (endDateShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceEndDate;
                    sourceEndDate = this.getEndDate();
                    Calendar copyEndDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "endDate", sourceEndDate), sourceEndDate, (this.endDate!= null)));
                    copy.setEndDate(copyEndDate);
                } else {
                    if (endDateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.endDate = null;
                    }
                }
            }
            {
                Boolean nameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.name!= null));
                if (nameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceName;
                    sourceName = this.getName();
                    String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName, (this.name!= null)));
                    copy.setName(copyName);
                } else {
                    if (nameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.name = null;
                    }
                }
            }
            {
                Boolean specificationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.specification!= null));
                if (specificationShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSpecification;
                    sourceSpecification = this.getSpecification();
                    String copySpecification = ((String) strategy.copy(LocatorUtils.property(locator, "specification", sourceSpecification), sourceSpecification, (this.specification!= null)));
                    copy.setSpecification(copySpecification);
                } else {
                    if (specificationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.specification = null;
                    }
                }
            }
            {
                Boolean floorplannerUrlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.floorplannerUrl!= null));
                if (floorplannerUrlShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFloorplannerUrl;
                    sourceFloorplannerUrl = this.getFloorplannerUrl();
                    String copyFloorplannerUrl = ((String) strategy.copy(LocatorUtils.property(locator, "floorplannerUrl", sourceFloorplannerUrl), sourceFloorplannerUrl, (this.floorplannerUrl!= null)));
                    copy.setFloorplannerUrl(copyFloorplannerUrl);
                } else {
                    if (floorplannerUrlShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.floorplannerUrl = null;
                    }
                }
            }
            {
                Boolean virtualTourShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.virtualTour!= null));
                if (virtualTourShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVirtualTour;
                    sourceVirtualTour = this.getVirtualTour();
                    String copyVirtualTour = ((String) strategy.copy(LocatorUtils.property(locator, "virtualTour", sourceVirtualTour), sourceVirtualTour, (this.virtualTour!= null)));
                    copy.setVirtualTour(copyVirtualTour);
                } else {
                    if (virtualTourShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.virtualTour = null;
                    }
                }
            }
            {
                Boolean descriptionsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.descriptions!= null));
                if (descriptionsShouldBeCopiedAndSet == Boolean.TRUE) {
                    Descriptions sourceDescriptions;
                    sourceDescriptions = this.getDescriptions();
                    Descriptions copyDescriptions = ((Descriptions) strategy.copy(LocatorUtils.property(locator, "descriptions", sourceDescriptions), sourceDescriptions, (this.descriptions!= null)));
                    copy.setDescriptions(copyDescriptions);
                } else {
                    if (descriptionsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.descriptions = null;
                    }
                }
            }
            {
                Boolean energyClassShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energyClass!= null));
                if (energyClassShouldBeCopiedAndSet == Boolean.TRUE) {
                    ClassEnergy sourceEnergyClass;
                    sourceEnergyClass = this.getEnergyClass();
                    ClassEnergy copyEnergyClass = ((ClassEnergy) strategy.copy(LocatorUtils.property(locator, "energyClass", sourceEnergyClass), sourceEnergyClass, (this.energyClass!= null)));
                    copy.setEnergyClass(copyEnergyClass);
                } else {
                    if (energyClassShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energyClass = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new FeaturesProject();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FeaturesProject that = ((FeaturesProject) object);
        {
            String lhsBuildingStatus;
            lhsBuildingStatus = this.getBuildingStatus();
            String rhsBuildingStatus;
            rhsBuildingStatus = that.getBuildingStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buildingStatus", lhsBuildingStatus), LocatorUtils.property(thatLocator, "buildingStatus", rhsBuildingStatus), lhsBuildingStatus, rhsBuildingStatus, (this.buildingStatus!= null), (that.buildingStatus!= null))) {
                return false;
            }
        }
        {
            Calendar lhsStartDate;
            lhsStartDate = this.getStartDate();
            Calendar rhsStartDate;
            rhsStartDate = that.getStartDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startDate", lhsStartDate), LocatorUtils.property(thatLocator, "startDate", rhsStartDate), lhsStartDate, rhsStartDate, (this.startDate!= null), (that.startDate!= null))) {
                return false;
            }
        }
        {
            Calendar lhsEndDate;
            lhsEndDate = this.getEndDate();
            Calendar rhsEndDate;
            rhsEndDate = that.getEndDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endDate", lhsEndDate), LocatorUtils.property(thatLocator, "endDate", rhsEndDate), lhsEndDate, rhsEndDate, (this.endDate!= null), (that.endDate!= null))) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            String lhsSpecification;
            lhsSpecification = this.getSpecification();
            String rhsSpecification;
            rhsSpecification = that.getSpecification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specification", lhsSpecification), LocatorUtils.property(thatLocator, "specification", rhsSpecification), lhsSpecification, rhsSpecification, (this.specification!= null), (that.specification!= null))) {
                return false;
            }
        }
        {
            String lhsFloorplannerUrl;
            lhsFloorplannerUrl = this.getFloorplannerUrl();
            String rhsFloorplannerUrl;
            rhsFloorplannerUrl = that.getFloorplannerUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "floorplannerUrl", lhsFloorplannerUrl), LocatorUtils.property(thatLocator, "floorplannerUrl", rhsFloorplannerUrl), lhsFloorplannerUrl, rhsFloorplannerUrl, (this.floorplannerUrl!= null), (that.floorplannerUrl!= null))) {
                return false;
            }
        }
        {
            String lhsVirtualTour;
            lhsVirtualTour = this.getVirtualTour();
            String rhsVirtualTour;
            rhsVirtualTour = that.getVirtualTour();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "virtualTour", lhsVirtualTour), LocatorUtils.property(thatLocator, "virtualTour", rhsVirtualTour), lhsVirtualTour, rhsVirtualTour, (this.virtualTour!= null), (that.virtualTour!= null))) {
                return false;
            }
        }
        {
            Descriptions lhsDescriptions;
            lhsDescriptions = this.getDescriptions();
            Descriptions rhsDescriptions;
            rhsDescriptions = that.getDescriptions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "descriptions", lhsDescriptions), LocatorUtils.property(thatLocator, "descriptions", rhsDescriptions), lhsDescriptions, rhsDescriptions, (this.descriptions!= null), (that.descriptions!= null))) {
                return false;
            }
        }
        {
            ClassEnergy lhsEnergyClass;
            lhsEnergyClass = this.getEnergyClass();
            ClassEnergy rhsEnergyClass;
            rhsEnergyClass = that.getEnergyClass();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energyClass", lhsEnergyClass), LocatorUtils.property(thatLocator, "energyClass", rhsEnergyClass), lhsEnergyClass, rhsEnergyClass, (this.energyClass!= null), (that.energyClass!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
