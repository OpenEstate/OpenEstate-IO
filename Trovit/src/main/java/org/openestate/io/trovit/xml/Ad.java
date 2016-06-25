
package org.openestate.io.trovit.xml;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
import org.openestate.io.trovit.xml.types.Action;
import org.openestate.io.trovit.xml.types.IntBool;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element ref="{}id"/&gt;
 *         &lt;element ref="{}url"/&gt;
 *         &lt;element ref="{}title"/&gt;
 *         &lt;element ref="{}type"/&gt;
 *         &lt;element ref="{}content"/&gt;
 *         &lt;element ref="{}date"/&gt;
 *         &lt;element ref="{}expiration_date" minOccurs="0"/&gt;
 *         &lt;element ref="{}is_new" minOccurs="0"/&gt;
 *         &lt;element ref="{}city" minOccurs="0"/&gt;
 *         &lt;element ref="{}price" minOccurs="0"/&gt;
 *         &lt;element ref="{}time" minOccurs="0"/&gt;
 *         &lt;element ref="{}agency" minOccurs="0"/&gt;
 *         &lt;element ref="{}property_type" minOccurs="0"/&gt;
 *         &lt;element ref="{}floor_area" minOccurs="0"/&gt;
 *         &lt;element ref="{}rooms" minOccurs="0"/&gt;
 *         &lt;element ref="{}bathrooms" minOccurs="0"/&gt;
 *         &lt;element ref="{}parking" minOccurs="0"/&gt;
 *         &lt;element ref="{}address" minOccurs="0"/&gt;
 *         &lt;element ref="{}city_area" minOccurs="0"/&gt;
 *         &lt;element ref="{}postcode" minOccurs="0"/&gt;
 *         &lt;element ref="{}region" minOccurs="0"/&gt;
 *         &lt;element ref="{}latitude" minOccurs="0"/&gt;
 *         &lt;element ref="{}longitude" minOccurs="0"/&gt;
 *         &lt;element ref="{}virtual_tour" minOccurs="0"/&gt;
 *         &lt;element ref="{}pictures" minOccurs="0"/&gt;
 *         &lt;element ref="{}plot_area" minOccurs="0"/&gt;
 *         &lt;element ref="{}floor_number" minOccurs="0"/&gt;
 *         &lt;element ref="{}orientation" minOccurs="0"/&gt;
 *         &lt;element ref="{}condition" minOccurs="0"/&gt;
 *         &lt;element ref="{}foreclosure" minOccurs="0"/&gt;
 *         &lt;element ref="{}mls_database" minOccurs="0"/&gt;
 *         &lt;element ref="{}is_furnished" minOccurs="0"/&gt;
 *         &lt;element ref="{}year" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "ad")
public class Ad implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String id;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String url;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String title;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Action type;
    @XmlElement(required = true)
    protected String content;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected Calendar date;
    @XmlElement(name = "expiration_date", type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected Calendar expirationDate;
    @XmlElement(name = "is_new")
    @XmlSchemaType(name = "string")
    protected TypeNew isNew;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String city;
    protected Price price;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter6 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected Calendar time;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String agency;
    @XmlElement(name = "property_type")
    @XmlJavaTypeAdapter(Adapter7 .class)
    protected String propertyType;
    @XmlElement(name = "floor_area")
    protected FloorArea floorArea;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected BigDecimal rooms;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected BigDecimal bathrooms;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter10 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected IntBool parking;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String address;
    @XmlElement(name = "city_area")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String cityArea;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String postcode;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String region;
    @XmlElement(type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter11 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected BigDecimal latitude;
    @XmlElement(type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter11 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected BigDecimal longitude;
    @XmlElement(name = "virtual_tour")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String virtualTour;
    protected Pictures pictures;
    @XmlElement(name = "plot_area", type = String.class)
    @XmlJavaTypeAdapter(Adapter8 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected BigInteger plotArea;
    @XmlElement(name = "floor_number")
    @XmlJavaTypeAdapter(Adapter7 .class)
    protected String floorNumber;
    @XmlJavaTypeAdapter(Adapter7 .class)
    protected String orientation;
    @XmlJavaTypeAdapter(Adapter7 .class)
    protected String condition;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String foreclosure;
    @XmlElement(name = "mls_database")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String mlsDatabase;
    @XmlElement(name = "is_furnished", type = String.class)
    @XmlJavaTypeAdapter(Adapter10 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected IntBool isFurnished;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected Integer year;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
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
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Action getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(Action value) {
        this.type = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(Calendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(Calendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the isNew property.
     * 
     * @return
     *     possible object is
     *     {@link TypeNew }
     *     
     */
    public TypeNew getIsNew() {
        return isNew;
    }

    /**
     * Sets the value of the isNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeNew }
     *     
     */
    public void setIsNew(TypeNew value) {
        this.isNew = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setPrice(Price value) {
        this.price = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(Calendar value) {
        this.time = value;
    }

    /**
     * Gets the value of the agency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgency() {
        return agency;
    }

    /**
     * Sets the value of the agency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgency(String value) {
        this.agency = value;
    }

    /**
     * Gets the value of the propertyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyType() {
        return propertyType;
    }

    /**
     * Sets the value of the propertyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyType(String value) {
        this.propertyType = value;
    }

    /**
     * Gets the value of the floorArea property.
     * 
     * @return
     *     possible object is
     *     {@link FloorArea }
     *     
     */
    public FloorArea getFloorArea() {
        return floorArea;
    }

    /**
     * Sets the value of the floorArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloorArea }
     *     
     */
    public void setFloorArea(FloorArea value) {
        this.floorArea = value;
    }

    /**
     * Gets the value of the rooms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getRooms() {
        return rooms;
    }

    /**
     * Sets the value of the rooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRooms(BigDecimal value) {
        this.rooms = value;
    }

    /**
     * Gets the value of the bathrooms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getBathrooms() {
        return bathrooms;
    }

    /**
     * Sets the value of the bathrooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBathrooms(BigDecimal value) {
        this.bathrooms = value;
    }

    /**
     * Gets the value of the parking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public IntBool getParking() {
        return parking;
    }

    /**
     * Sets the value of the parking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParking(IntBool value) {
        this.parking = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the cityArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityArea() {
        return cityArea;
    }

    /**
     * Sets the value of the cityArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityArea(String value) {
        this.cityArea = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(BigDecimal value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(BigDecimal value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the virtualTour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    public void setVirtualTour(String value) {
        this.virtualTour = value;
    }

    /**
     * Gets the value of the pictures property.
     * 
     * @return
     *     possible object is
     *     {@link Pictures }
     *     
     */
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
    public void setPictures(Pictures value) {
        this.pictures = value;
    }

    /**
     * Gets the value of the plotArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigInteger getPlotArea() {
        return plotArea;
    }

    /**
     * Sets the value of the plotArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlotArea(BigInteger value) {
        this.plotArea = value;
    }

    /**
     * Gets the value of the floorNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorNumber() {
        return floorNumber;
    }

    /**
     * Sets the value of the floorNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorNumber(String value) {
        this.floorNumber = value;
    }

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientation(String value) {
        this.orientation = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

    /**
     * Gets the value of the foreclosure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeclosure() {
        return foreclosure;
    }

    /**
     * Sets the value of the foreclosure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeclosure(String value) {
        this.foreclosure = value;
    }

    /**
     * Gets the value of the mlsDatabase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMlsDatabase() {
        return mlsDatabase;
    }

    /**
     * Sets the value of the mlsDatabase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMlsDatabase(String value) {
        this.mlsDatabase = value;
    }

    /**
     * Gets the value of the isFurnished property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public IntBool getIsFurnished() {
        return isFurnished;
    }

    /**
     * Sets the value of the isFurnished property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsFurnished(IntBool value) {
        this.isFurnished = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(Integer value) {
        this.year = value;
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
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId, (this.id!= null));
        }
        {
            String theUrl;
            theUrl = this.getUrl();
            strategy.appendField(locator, this, "url", buffer, theUrl, (this.url!= null));
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theTitle, (this.title!= null));
        }
        {
            Action theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType, (this.type!= null));
        }
        {
            String theContent;
            theContent = this.getContent();
            strategy.appendField(locator, this, "content", buffer, theContent, (this.content!= null));
        }
        {
            Calendar theDate;
            theDate = this.getDate();
            strategy.appendField(locator, this, "date", buffer, theDate, (this.date!= null));
        }
        {
            Calendar theExpirationDate;
            theExpirationDate = this.getExpirationDate();
            strategy.appendField(locator, this, "expirationDate", buffer, theExpirationDate, (this.expirationDate!= null));
        }
        {
            TypeNew theIsNew;
            theIsNew = this.getIsNew();
            strategy.appendField(locator, this, "isNew", buffer, theIsNew, (this.isNew!= null));
        }
        {
            String theCity;
            theCity = this.getCity();
            strategy.appendField(locator, this, "city", buffer, theCity, (this.city!= null));
        }
        {
            Price thePrice;
            thePrice = this.getPrice();
            strategy.appendField(locator, this, "price", buffer, thePrice, (this.price!= null));
        }
        {
            Calendar theTime;
            theTime = this.getTime();
            strategy.appendField(locator, this, "time", buffer, theTime, (this.time!= null));
        }
        {
            String theAgency;
            theAgency = this.getAgency();
            strategy.appendField(locator, this, "agency", buffer, theAgency, (this.agency!= null));
        }
        {
            String thePropertyType;
            thePropertyType = this.getPropertyType();
            strategy.appendField(locator, this, "propertyType", buffer, thePropertyType, (this.propertyType!= null));
        }
        {
            FloorArea theFloorArea;
            theFloorArea = this.getFloorArea();
            strategy.appendField(locator, this, "floorArea", buffer, theFloorArea, (this.floorArea!= null));
        }
        {
            BigDecimal theRooms;
            theRooms = this.getRooms();
            strategy.appendField(locator, this, "rooms", buffer, theRooms, (this.rooms!= null));
        }
        {
            BigDecimal theBathrooms;
            theBathrooms = this.getBathrooms();
            strategy.appendField(locator, this, "bathrooms", buffer, theBathrooms, (this.bathrooms!= null));
        }
        {
            IntBool theParking;
            theParking = this.getParking();
            strategy.appendField(locator, this, "parking", buffer, theParking, (this.parking!= null));
        }
        {
            String theAddress;
            theAddress = this.getAddress();
            strategy.appendField(locator, this, "address", buffer, theAddress, (this.address!= null));
        }
        {
            String theCityArea;
            theCityArea = this.getCityArea();
            strategy.appendField(locator, this, "cityArea", buffer, theCityArea, (this.cityArea!= null));
        }
        {
            String thePostcode;
            thePostcode = this.getPostcode();
            strategy.appendField(locator, this, "postcode", buffer, thePostcode, (this.postcode!= null));
        }
        {
            String theRegion;
            theRegion = this.getRegion();
            strategy.appendField(locator, this, "region", buffer, theRegion, (this.region!= null));
        }
        {
            BigDecimal theLatitude;
            theLatitude = this.getLatitude();
            strategy.appendField(locator, this, "latitude", buffer, theLatitude, (this.latitude!= null));
        }
        {
            BigDecimal theLongitude;
            theLongitude = this.getLongitude();
            strategy.appendField(locator, this, "longitude", buffer, theLongitude, (this.longitude!= null));
        }
        {
            String theVirtualTour;
            theVirtualTour = this.getVirtualTour();
            strategy.appendField(locator, this, "virtualTour", buffer, theVirtualTour, (this.virtualTour!= null));
        }
        {
            Pictures thePictures;
            thePictures = this.getPictures();
            strategy.appendField(locator, this, "pictures", buffer, thePictures, (this.pictures!= null));
        }
        {
            BigInteger thePlotArea;
            thePlotArea = this.getPlotArea();
            strategy.appendField(locator, this, "plotArea", buffer, thePlotArea, (this.plotArea!= null));
        }
        {
            String theFloorNumber;
            theFloorNumber = this.getFloorNumber();
            strategy.appendField(locator, this, "floorNumber", buffer, theFloorNumber, (this.floorNumber!= null));
        }
        {
            String theOrientation;
            theOrientation = this.getOrientation();
            strategy.appendField(locator, this, "orientation", buffer, theOrientation, (this.orientation!= null));
        }
        {
            String theCondition;
            theCondition = this.getCondition();
            strategy.appendField(locator, this, "condition", buffer, theCondition, (this.condition!= null));
        }
        {
            String theForeclosure;
            theForeclosure = this.getForeclosure();
            strategy.appendField(locator, this, "foreclosure", buffer, theForeclosure, (this.foreclosure!= null));
        }
        {
            String theMlsDatabase;
            theMlsDatabase = this.getMlsDatabase();
            strategy.appendField(locator, this, "mlsDatabase", buffer, theMlsDatabase, (this.mlsDatabase!= null));
        }
        {
            IntBool theIsFurnished;
            theIsFurnished = this.getIsFurnished();
            strategy.appendField(locator, this, "isFurnished", buffer, theIsFurnished, (this.isFurnished!= null));
        }
        {
            Integer theYear;
            theYear = this.getYear();
            strategy.appendField(locator, this, "year", buffer, theYear, (this.year!= null));
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
        if (draftCopy instanceof Ad) {
            final Ad copy = ((Ad) draftCopy);
            {
                Boolean idShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.id!= null));
                if (idShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceId;
                    sourceId = this.getId();
                    String copyId = ((String) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId, (this.id!= null)));
                    copy.setId(copyId);
                } else {
                    if (idShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.id = null;
                    }
                }
            }
            {
                Boolean urlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.url!= null));
                if (urlShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceUrl;
                    sourceUrl = this.getUrl();
                    String copyUrl = ((String) strategy.copy(LocatorUtils.property(locator, "url", sourceUrl), sourceUrl, (this.url!= null)));
                    copy.setUrl(copyUrl);
                } else {
                    if (urlShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.url = null;
                    }
                }
            }
            {
                Boolean titleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.title!= null));
                if (titleShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTitle;
                    sourceTitle = this.getTitle();
                    String copyTitle = ((String) strategy.copy(LocatorUtils.property(locator, "title", sourceTitle), sourceTitle, (this.title!= null)));
                    copy.setTitle(copyTitle);
                } else {
                    if (titleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.title = null;
                    }
                }
            }
            {
                Boolean typeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.type!= null));
                if (typeShouldBeCopiedAndSet == Boolean.TRUE) {
                    Action sourceType;
                    sourceType = this.getType();
                    Action copyType = ((Action) strategy.copy(LocatorUtils.property(locator, "type", sourceType), sourceType, (this.type!= null)));
                    copy.setType(copyType);
                } else {
                    if (typeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.type = null;
                    }
                }
            }
            {
                Boolean contentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.content!= null));
                if (contentShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceContent;
                    sourceContent = this.getContent();
                    String copyContent = ((String) strategy.copy(LocatorUtils.property(locator, "content", sourceContent), sourceContent, (this.content!= null)));
                    copy.setContent(copyContent);
                } else {
                    if (contentShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.content = null;
                    }
                }
            }
            {
                Boolean dateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.date!= null));
                if (dateShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceDate;
                    sourceDate = this.getDate();
                    Calendar copyDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "date", sourceDate), sourceDate, (this.date!= null)));
                    copy.setDate(copyDate);
                } else {
                    if (dateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.date = null;
                    }
                }
            }
            {
                Boolean expirationDateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.expirationDate!= null));
                if (expirationDateShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceExpirationDate;
                    sourceExpirationDate = this.getExpirationDate();
                    Calendar copyExpirationDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "expirationDate", sourceExpirationDate), sourceExpirationDate, (this.expirationDate!= null)));
                    copy.setExpirationDate(copyExpirationDate);
                } else {
                    if (expirationDateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.expirationDate = null;
                    }
                }
            }
            {
                Boolean isNewShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isNew!= null));
                if (isNewShouldBeCopiedAndSet == Boolean.TRUE) {
                    TypeNew sourceIsNew;
                    sourceIsNew = this.getIsNew();
                    TypeNew copyIsNew = ((TypeNew) strategy.copy(LocatorUtils.property(locator, "isNew", sourceIsNew), sourceIsNew, (this.isNew!= null)));
                    copy.setIsNew(copyIsNew);
                } else {
                    if (isNewShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.isNew = null;
                    }
                }
            }
            {
                Boolean cityShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.city!= null));
                if (cityShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCity;
                    sourceCity = this.getCity();
                    String copyCity = ((String) strategy.copy(LocatorUtils.property(locator, "city", sourceCity), sourceCity, (this.city!= null)));
                    copy.setCity(copyCity);
                } else {
                    if (cityShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.city = null;
                    }
                }
            }
            {
                Boolean priceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.price!= null));
                if (priceShouldBeCopiedAndSet == Boolean.TRUE) {
                    Price sourcePrice;
                    sourcePrice = this.getPrice();
                    Price copyPrice = ((Price) strategy.copy(LocatorUtils.property(locator, "price", sourcePrice), sourcePrice, (this.price!= null)));
                    copy.setPrice(copyPrice);
                } else {
                    if (priceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.price = null;
                    }
                }
            }
            {
                Boolean timeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.time!= null));
                if (timeShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceTime;
                    sourceTime = this.getTime();
                    Calendar copyTime = ((Calendar) strategy.copy(LocatorUtils.property(locator, "time", sourceTime), sourceTime, (this.time!= null)));
                    copy.setTime(copyTime);
                } else {
                    if (timeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.time = null;
                    }
                }
            }
            {
                Boolean agencyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.agency!= null));
                if (agencyShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAgency;
                    sourceAgency = this.getAgency();
                    String copyAgency = ((String) strategy.copy(LocatorUtils.property(locator, "agency", sourceAgency), sourceAgency, (this.agency!= null)));
                    copy.setAgency(copyAgency);
                } else {
                    if (agencyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.agency = null;
                    }
                }
            }
            {
                Boolean propertyTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.propertyType!= null));
                if (propertyTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePropertyType;
                    sourcePropertyType = this.getPropertyType();
                    String copyPropertyType = ((String) strategy.copy(LocatorUtils.property(locator, "propertyType", sourcePropertyType), sourcePropertyType, (this.propertyType!= null)));
                    copy.setPropertyType(copyPropertyType);
                } else {
                    if (propertyTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.propertyType = null;
                    }
                }
            }
            {
                Boolean floorAreaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.floorArea!= null));
                if (floorAreaShouldBeCopiedAndSet == Boolean.TRUE) {
                    FloorArea sourceFloorArea;
                    sourceFloorArea = this.getFloorArea();
                    FloorArea copyFloorArea = ((FloorArea) strategy.copy(LocatorUtils.property(locator, "floorArea", sourceFloorArea), sourceFloorArea, (this.floorArea!= null)));
                    copy.setFloorArea(copyFloorArea);
                } else {
                    if (floorAreaShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.floorArea = null;
                    }
                }
            }
            {
                Boolean roomsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.rooms!= null));
                if (roomsShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceRooms;
                    sourceRooms = this.getRooms();
                    BigDecimal copyRooms = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "rooms", sourceRooms), sourceRooms, (this.rooms!= null)));
                    copy.setRooms(copyRooms);
                } else {
                    if (roomsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.rooms = null;
                    }
                }
            }
            {
                Boolean bathroomsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bathrooms!= null));
                if (bathroomsShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceBathrooms;
                    sourceBathrooms = this.getBathrooms();
                    BigDecimal copyBathrooms = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "bathrooms", sourceBathrooms), sourceBathrooms, (this.bathrooms!= null)));
                    copy.setBathrooms(copyBathrooms);
                } else {
                    if (bathroomsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bathrooms = null;
                    }
                }
            }
            {
                Boolean parkingShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.parking!= null));
                if (parkingShouldBeCopiedAndSet == Boolean.TRUE) {
                    IntBool sourceParking;
                    sourceParking = this.getParking();
                    IntBool copyParking = ((IntBool) strategy.copy(LocatorUtils.property(locator, "parking", sourceParking), sourceParking, (this.parking!= null)));
                    copy.setParking(copyParking);
                } else {
                    if (parkingShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.parking = null;
                    }
                }
            }
            {
                Boolean addressShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.address!= null));
                if (addressShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAddress;
                    sourceAddress = this.getAddress();
                    String copyAddress = ((String) strategy.copy(LocatorUtils.property(locator, "address", sourceAddress), sourceAddress, (this.address!= null)));
                    copy.setAddress(copyAddress);
                } else {
                    if (addressShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.address = null;
                    }
                }
            }
            {
                Boolean cityAreaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.cityArea!= null));
                if (cityAreaShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCityArea;
                    sourceCityArea = this.getCityArea();
                    String copyCityArea = ((String) strategy.copy(LocatorUtils.property(locator, "cityArea", sourceCityArea), sourceCityArea, (this.cityArea!= null)));
                    copy.setCityArea(copyCityArea);
                } else {
                    if (cityAreaShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.cityArea = null;
                    }
                }
            }
            {
                Boolean postcodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.postcode!= null));
                if (postcodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePostcode;
                    sourcePostcode = this.getPostcode();
                    String copyPostcode = ((String) strategy.copy(LocatorUtils.property(locator, "postcode", sourcePostcode), sourcePostcode, (this.postcode!= null)));
                    copy.setPostcode(copyPostcode);
                } else {
                    if (postcodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.postcode = null;
                    }
                }
            }
            {
                Boolean regionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.region!= null));
                if (regionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceRegion;
                    sourceRegion = this.getRegion();
                    String copyRegion = ((String) strategy.copy(LocatorUtils.property(locator, "region", sourceRegion), sourceRegion, (this.region!= null)));
                    copy.setRegion(copyRegion);
                } else {
                    if (regionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.region = null;
                    }
                }
            }
            {
                Boolean latitudeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.latitude!= null));
                if (latitudeShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceLatitude;
                    sourceLatitude = this.getLatitude();
                    BigDecimal copyLatitude = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "latitude", sourceLatitude), sourceLatitude, (this.latitude!= null)));
                    copy.setLatitude(copyLatitude);
                } else {
                    if (latitudeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.latitude = null;
                    }
                }
            }
            {
                Boolean longitudeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.longitude!= null));
                if (longitudeShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceLongitude;
                    sourceLongitude = this.getLongitude();
                    BigDecimal copyLongitude = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "longitude", sourceLongitude), sourceLongitude, (this.longitude!= null)));
                    copy.setLongitude(copyLongitude);
                } else {
                    if (longitudeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.longitude = null;
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
                Boolean plotAreaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.plotArea!= null));
                if (plotAreaShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourcePlotArea;
                    sourcePlotArea = this.getPlotArea();
                    BigInteger copyPlotArea = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "plotArea", sourcePlotArea), sourcePlotArea, (this.plotArea!= null)));
                    copy.setPlotArea(copyPlotArea);
                } else {
                    if (plotAreaShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.plotArea = null;
                    }
                }
            }
            {
                Boolean floorNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.floorNumber!= null));
                if (floorNumberShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFloorNumber;
                    sourceFloorNumber = this.getFloorNumber();
                    String copyFloorNumber = ((String) strategy.copy(LocatorUtils.property(locator, "floorNumber", sourceFloorNumber), sourceFloorNumber, (this.floorNumber!= null)));
                    copy.setFloorNumber(copyFloorNumber);
                } else {
                    if (floorNumberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.floorNumber = null;
                    }
                }
            }
            {
                Boolean orientationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.orientation!= null));
                if (orientationShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceOrientation;
                    sourceOrientation = this.getOrientation();
                    String copyOrientation = ((String) strategy.copy(LocatorUtils.property(locator, "orientation", sourceOrientation), sourceOrientation, (this.orientation!= null)));
                    copy.setOrientation(copyOrientation);
                } else {
                    if (orientationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.orientation = null;
                    }
                }
            }
            {
                Boolean conditionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.condition!= null));
                if (conditionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCondition;
                    sourceCondition = this.getCondition();
                    String copyCondition = ((String) strategy.copy(LocatorUtils.property(locator, "condition", sourceCondition), sourceCondition, (this.condition!= null)));
                    copy.setCondition(copyCondition);
                } else {
                    if (conditionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.condition = null;
                    }
                }
            }
            {
                Boolean foreclosureShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.foreclosure!= null));
                if (foreclosureShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceForeclosure;
                    sourceForeclosure = this.getForeclosure();
                    String copyForeclosure = ((String) strategy.copy(LocatorUtils.property(locator, "foreclosure", sourceForeclosure), sourceForeclosure, (this.foreclosure!= null)));
                    copy.setForeclosure(copyForeclosure);
                } else {
                    if (foreclosureShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.foreclosure = null;
                    }
                }
            }
            {
                Boolean mlsDatabaseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mlsDatabase!= null));
                if (mlsDatabaseShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceMlsDatabase;
                    sourceMlsDatabase = this.getMlsDatabase();
                    String copyMlsDatabase = ((String) strategy.copy(LocatorUtils.property(locator, "mlsDatabase", sourceMlsDatabase), sourceMlsDatabase, (this.mlsDatabase!= null)));
                    copy.setMlsDatabase(copyMlsDatabase);
                } else {
                    if (mlsDatabaseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mlsDatabase = null;
                    }
                }
            }
            {
                Boolean isFurnishedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isFurnished!= null));
                if (isFurnishedShouldBeCopiedAndSet == Boolean.TRUE) {
                    IntBool sourceIsFurnished;
                    sourceIsFurnished = this.getIsFurnished();
                    IntBool copyIsFurnished = ((IntBool) strategy.copy(LocatorUtils.property(locator, "isFurnished", sourceIsFurnished), sourceIsFurnished, (this.isFurnished!= null)));
                    copy.setIsFurnished(copyIsFurnished);
                } else {
                    if (isFurnishedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.isFurnished = null;
                    }
                }
            }
            {
                Boolean yearShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.year!= null));
                if (yearShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceYear;
                    sourceYear = this.getYear();
                    Integer copyYear = ((Integer) strategy.copy(LocatorUtils.property(locator, "year", sourceYear), sourceYear, (this.year!= null)));
                    copy.setYear(copyYear);
                } else {
                    if (yearShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.year = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Ad();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Ad that = ((Ad) object);
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId, (this.id!= null), (that.id!= null))) {
                return false;
            }
        }
        {
            String lhsUrl;
            lhsUrl = this.getUrl();
            String rhsUrl;
            rhsUrl = that.getUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "url", lhsUrl), LocatorUtils.property(thatLocator, "url", rhsUrl), lhsUrl, rhsUrl, (this.url!= null), (that.url!= null))) {
                return false;
            }
        }
        {
            String lhsTitle;
            lhsTitle = this.getTitle();
            String rhsTitle;
            rhsTitle = that.getTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "title", lhsTitle), LocatorUtils.property(thatLocator, "title", rhsTitle), lhsTitle, rhsTitle, (this.title!= null), (that.title!= null))) {
                return false;
            }
        }
        {
            Action lhsType;
            lhsType = this.getType();
            Action rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType, (this.type!= null), (that.type!= null))) {
                return false;
            }
        }
        {
            String lhsContent;
            lhsContent = this.getContent();
            String rhsContent;
            rhsContent = that.getContent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "content", lhsContent), LocatorUtils.property(thatLocator, "content", rhsContent), lhsContent, rhsContent, (this.content!= null), (that.content!= null))) {
                return false;
            }
        }
        {
            Calendar lhsDate;
            lhsDate = this.getDate();
            Calendar rhsDate;
            rhsDate = that.getDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "date", lhsDate), LocatorUtils.property(thatLocator, "date", rhsDate), lhsDate, rhsDate, (this.date!= null), (that.date!= null))) {
                return false;
            }
        }
        {
            Calendar lhsExpirationDate;
            lhsExpirationDate = this.getExpirationDate();
            Calendar rhsExpirationDate;
            rhsExpirationDate = that.getExpirationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expirationDate", lhsExpirationDate), LocatorUtils.property(thatLocator, "expirationDate", rhsExpirationDate), lhsExpirationDate, rhsExpirationDate, (this.expirationDate!= null), (that.expirationDate!= null))) {
                return false;
            }
        }
        {
            TypeNew lhsIsNew;
            lhsIsNew = this.getIsNew();
            TypeNew rhsIsNew;
            rhsIsNew = that.getIsNew();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isNew", lhsIsNew), LocatorUtils.property(thatLocator, "isNew", rhsIsNew), lhsIsNew, rhsIsNew, (this.isNew!= null), (that.isNew!= null))) {
                return false;
            }
        }
        {
            String lhsCity;
            lhsCity = this.getCity();
            String rhsCity;
            rhsCity = that.getCity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "city", lhsCity), LocatorUtils.property(thatLocator, "city", rhsCity), lhsCity, rhsCity, (this.city!= null), (that.city!= null))) {
                return false;
            }
        }
        {
            Price lhsPrice;
            lhsPrice = this.getPrice();
            Price rhsPrice;
            rhsPrice = that.getPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "price", lhsPrice), LocatorUtils.property(thatLocator, "price", rhsPrice), lhsPrice, rhsPrice, (this.price!= null), (that.price!= null))) {
                return false;
            }
        }
        {
            Calendar lhsTime;
            lhsTime = this.getTime();
            Calendar rhsTime;
            rhsTime = that.getTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "time", lhsTime), LocatorUtils.property(thatLocator, "time", rhsTime), lhsTime, rhsTime, (this.time!= null), (that.time!= null))) {
                return false;
            }
        }
        {
            String lhsAgency;
            lhsAgency = this.getAgency();
            String rhsAgency;
            rhsAgency = that.getAgency();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "agency", lhsAgency), LocatorUtils.property(thatLocator, "agency", rhsAgency), lhsAgency, rhsAgency, (this.agency!= null), (that.agency!= null))) {
                return false;
            }
        }
        {
            String lhsPropertyType;
            lhsPropertyType = this.getPropertyType();
            String rhsPropertyType;
            rhsPropertyType = that.getPropertyType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "propertyType", lhsPropertyType), LocatorUtils.property(thatLocator, "propertyType", rhsPropertyType), lhsPropertyType, rhsPropertyType, (this.propertyType!= null), (that.propertyType!= null))) {
                return false;
            }
        }
        {
            FloorArea lhsFloorArea;
            lhsFloorArea = this.getFloorArea();
            FloorArea rhsFloorArea;
            rhsFloorArea = that.getFloorArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "floorArea", lhsFloorArea), LocatorUtils.property(thatLocator, "floorArea", rhsFloorArea), lhsFloorArea, rhsFloorArea, (this.floorArea!= null), (that.floorArea!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsRooms;
            lhsRooms = this.getRooms();
            BigDecimal rhsRooms;
            rhsRooms = that.getRooms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rooms", lhsRooms), LocatorUtils.property(thatLocator, "rooms", rhsRooms), lhsRooms, rhsRooms, (this.rooms!= null), (that.rooms!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsBathrooms;
            lhsBathrooms = this.getBathrooms();
            BigDecimal rhsBathrooms;
            rhsBathrooms = that.getBathrooms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bathrooms", lhsBathrooms), LocatorUtils.property(thatLocator, "bathrooms", rhsBathrooms), lhsBathrooms, rhsBathrooms, (this.bathrooms!= null), (that.bathrooms!= null))) {
                return false;
            }
        }
        {
            IntBool lhsParking;
            lhsParking = this.getParking();
            IntBool rhsParking;
            rhsParking = that.getParking();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parking", lhsParking), LocatorUtils.property(thatLocator, "parking", rhsParking), lhsParking, rhsParking, (this.parking!= null), (that.parking!= null))) {
                return false;
            }
        }
        {
            String lhsAddress;
            lhsAddress = this.getAddress();
            String rhsAddress;
            rhsAddress = that.getAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "address", lhsAddress), LocatorUtils.property(thatLocator, "address", rhsAddress), lhsAddress, rhsAddress, (this.address!= null), (that.address!= null))) {
                return false;
            }
        }
        {
            String lhsCityArea;
            lhsCityArea = this.getCityArea();
            String rhsCityArea;
            rhsCityArea = that.getCityArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cityArea", lhsCityArea), LocatorUtils.property(thatLocator, "cityArea", rhsCityArea), lhsCityArea, rhsCityArea, (this.cityArea!= null), (that.cityArea!= null))) {
                return false;
            }
        }
        {
            String lhsPostcode;
            lhsPostcode = this.getPostcode();
            String rhsPostcode;
            rhsPostcode = that.getPostcode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postcode", lhsPostcode), LocatorUtils.property(thatLocator, "postcode", rhsPostcode), lhsPostcode, rhsPostcode, (this.postcode!= null), (that.postcode!= null))) {
                return false;
            }
        }
        {
            String lhsRegion;
            lhsRegion = this.getRegion();
            String rhsRegion;
            rhsRegion = that.getRegion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "region", lhsRegion), LocatorUtils.property(thatLocator, "region", rhsRegion), lhsRegion, rhsRegion, (this.region!= null), (that.region!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsLatitude;
            lhsLatitude = this.getLatitude();
            BigDecimal rhsLatitude;
            rhsLatitude = that.getLatitude();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "latitude", lhsLatitude), LocatorUtils.property(thatLocator, "latitude", rhsLatitude), lhsLatitude, rhsLatitude, (this.latitude!= null), (that.latitude!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsLongitude;
            lhsLongitude = this.getLongitude();
            BigDecimal rhsLongitude;
            rhsLongitude = that.getLongitude();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "longitude", lhsLongitude), LocatorUtils.property(thatLocator, "longitude", rhsLongitude), lhsLongitude, rhsLongitude, (this.longitude!= null), (that.longitude!= null))) {
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
            Pictures lhsPictures;
            lhsPictures = this.getPictures();
            Pictures rhsPictures;
            rhsPictures = that.getPictures();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pictures", lhsPictures), LocatorUtils.property(thatLocator, "pictures", rhsPictures), lhsPictures, rhsPictures, (this.pictures!= null), (that.pictures!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsPlotArea;
            lhsPlotArea = this.getPlotArea();
            BigInteger rhsPlotArea;
            rhsPlotArea = that.getPlotArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "plotArea", lhsPlotArea), LocatorUtils.property(thatLocator, "plotArea", rhsPlotArea), lhsPlotArea, rhsPlotArea, (this.plotArea!= null), (that.plotArea!= null))) {
                return false;
            }
        }
        {
            String lhsFloorNumber;
            lhsFloorNumber = this.getFloorNumber();
            String rhsFloorNumber;
            rhsFloorNumber = that.getFloorNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "floorNumber", lhsFloorNumber), LocatorUtils.property(thatLocator, "floorNumber", rhsFloorNumber), lhsFloorNumber, rhsFloorNumber, (this.floorNumber!= null), (that.floorNumber!= null))) {
                return false;
            }
        }
        {
            String lhsOrientation;
            lhsOrientation = this.getOrientation();
            String rhsOrientation;
            rhsOrientation = that.getOrientation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orientation", lhsOrientation), LocatorUtils.property(thatLocator, "orientation", rhsOrientation), lhsOrientation, rhsOrientation, (this.orientation!= null), (that.orientation!= null))) {
                return false;
            }
        }
        {
            String lhsCondition;
            lhsCondition = this.getCondition();
            String rhsCondition;
            rhsCondition = that.getCondition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "condition", lhsCondition), LocatorUtils.property(thatLocator, "condition", rhsCondition), lhsCondition, rhsCondition, (this.condition!= null), (that.condition!= null))) {
                return false;
            }
        }
        {
            String lhsForeclosure;
            lhsForeclosure = this.getForeclosure();
            String rhsForeclosure;
            rhsForeclosure = that.getForeclosure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "foreclosure", lhsForeclosure), LocatorUtils.property(thatLocator, "foreclosure", rhsForeclosure), lhsForeclosure, rhsForeclosure, (this.foreclosure!= null), (that.foreclosure!= null))) {
                return false;
            }
        }
        {
            String lhsMlsDatabase;
            lhsMlsDatabase = this.getMlsDatabase();
            String rhsMlsDatabase;
            rhsMlsDatabase = that.getMlsDatabase();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mlsDatabase", lhsMlsDatabase), LocatorUtils.property(thatLocator, "mlsDatabase", rhsMlsDatabase), lhsMlsDatabase, rhsMlsDatabase, (this.mlsDatabase!= null), (that.mlsDatabase!= null))) {
                return false;
            }
        }
        {
            IntBool lhsIsFurnished;
            lhsIsFurnished = this.getIsFurnished();
            IntBool rhsIsFurnished;
            rhsIsFurnished = that.getIsFurnished();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isFurnished", lhsIsFurnished), LocatorUtils.property(thatLocator, "isFurnished", rhsIsFurnished), lhsIsFurnished, rhsIsFurnished, (this.isFurnished!= null), (that.isFurnished!= null))) {
                return false;
            }
        }
        {
            Integer lhsYear;
            lhsYear = this.getYear();
            Integer rhsYear;
            rhsYear = that.getYear();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "year", lhsYear), LocatorUtils.property(thatLocator, "year", rhsYear), lhsYear, rhsYear, (this.year!= null), (that.year!= null))) {
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
