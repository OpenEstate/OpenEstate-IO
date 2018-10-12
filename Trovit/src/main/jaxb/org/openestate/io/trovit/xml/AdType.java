
package org.openestate.io.trovit.xml;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
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
import org.openestate.io.trovit.xml.types.ForeclosureTypeValue;
import org.openestate.io.trovit.xml.types.OrientationValue;
import org.openestate.io.trovit.xml.types.TypeValue;


/**
 * 
 *                 Ein einzuf\u00fcgendes oder zu aktualisierendes Objekt.
 *             
 * 
 * <p>Java class for AdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="mobile_url" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="type" type="{}TypeValue"/&gt;
 *         &lt;element name="content" type="{}ContentValue"/&gt;
 *         &lt;element name="price" type="{}PriceType" minOccurs="0"/&gt;
 *         &lt;element name="property_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="foreclosure_type" type="{}ForeclosureTypeValue" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="floor_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="neighborhood" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="city_area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="country" type="{}CountryValue" minOccurs="0"/&gt;
 *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="latitude" type="{}LatitudeValue" minOccurs="0"/&gt;
 *         &lt;element name="longitude" type="{}LongitudeValue" minOccurs="0"/&gt;
 *         &lt;element name="orientation" type="{}OrientationValue" minOccurs="0"/&gt;
 *         &lt;element name="agency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mls_database" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="floor_area" type="{}FloorAreaType" minOccurs="0"/&gt;
 *         &lt;element name="plot_area" type="{}PlotAreaType" minOccurs="0"/&gt;
 *         &lt;element name="rooms" type="{}RoomsValue" minOccurs="0"/&gt;
 *         &lt;element name="bathrooms" type="{}RoomsValue" minOccurs="0"/&gt;
 *         &lt;element name="condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="year" type="{}YearValue" minOccurs="0"/&gt;
 *         &lt;element name="virtual_tour" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="eco_score" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pictures" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="picture" type="{}PictureType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="date" type="{}DateValue" minOccurs="0"/&gt;
 *         &lt;element name="expiration_date" type="{}DateValue" minOccurs="0"/&gt;
 *         &lt;element name="by_owner" type="{}BooleanValue" minOccurs="0"/&gt;
 *         &lt;element name="is_rent_to_own" type="{}BooleanValue" minOccurs="0"/&gt;
 *         &lt;element name="parking" type="{}BooleanValue" minOccurs="0"/&gt;
 *         &lt;element name="foreclosure" type="{}BooleanValue" minOccurs="0"/&gt;
 *         &lt;element name="is_furnished" type="{}BooleanValue" minOccurs="0"/&gt;
 *         &lt;element name="is_new" type="{}BooleanValue" minOccurs="0"/&gt;
 *         &lt;element name="contact_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contact_email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contact_telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdType", propOrder = {

})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
public class AdType implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected String id;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected URI url;
    @XmlElement(name = "mobile_url", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected URI mobileUrl;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected String title;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected TypeValue type;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected String content;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected PriceType price;
    @XmlElement(name = "property_type")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected String propertyType;
    @XmlElement(name = "foreclosure_type", type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected ForeclosureTypeValue foreclosureType;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected String address;
    @XmlElement(name = "floor_number")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected String floorNumber;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected String neighborhood;
    @XmlElement(name = "city_area")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected String cityArea;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected String city;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected String region;
    @XmlJavaTypeAdapter(Adapter17 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected String country;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected String postcode;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter8 .class)
    @XmlSchemaType(name = "decimal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal latitude;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter9 .class)
    @XmlSchemaType(name = "decimal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal longitude;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter18 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected OrientationValue orientation;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected String agency;
    @XmlElement(name = "mls_database")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected String mlsDatabase;
    @XmlElement(name = "floor_area")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected FloorAreaType floorArea;
    @XmlElement(name = "plot_area")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected PlotAreaType plotArea;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter13 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal rooms;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter13 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal bathrooms;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected String condition;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter14 .class)
    @XmlSchemaType(name = "integer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected BigInteger year;
    @XmlElement(name = "virtual_tour", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected URI virtualTour;
    @XmlElement(name = "eco_score")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected String ecoScore;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected AdType.Pictures pictures;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter15 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected Calendar date;
    @XmlElement(name = "expiration_date", type = String.class)
    @XmlJavaTypeAdapter(Adapter15 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected Calendar expirationDate;
    @XmlElement(name = "by_owner", type = String.class)
    @XmlJavaTypeAdapter(Adapter16 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean byOwner;
    @XmlElement(name = "is_rent_to_own", type = String.class)
    @XmlJavaTypeAdapter(Adapter16 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean isRentToOwn;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter16 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean parking;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter16 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean foreclosure;
    @XmlElement(name = "is_furnished", type = String.class)
    @XmlJavaTypeAdapter(Adapter16 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean isFurnished;
    @XmlElement(name = "is_new", type = String.class)
    @XmlJavaTypeAdapter(Adapter16 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean isNew;
    @XmlElement(name = "contact_name")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected String contactName;
    @XmlElement(name = "contact_email")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected String contactEmail;
    @XmlElement(name = "contact_telephone")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    protected String contactTelephone;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public URI getUrl() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setUrl(URI value) {
        this.url = value;
    }

    /**
     * Gets the value of the mobileUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public URI getMobileUrl() {
        return mobileUrl;
    }

    /**
     * Sets the value of the mobileUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setMobileUrl(URI value) {
        this.mobileUrl = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public TypeValue getType() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setType(TypeValue value) {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public PriceType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setPrice(PriceType value) {
        this.price = value;
    }

    /**
     * Gets the value of the propertyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setPropertyType(String value) {
        this.propertyType = value;
    }

    /**
     * Gets the value of the foreclosureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public ForeclosureTypeValue getForeclosureType() {
        return foreclosureType;
    }

    /**
     * Sets the value of the foreclosureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setForeclosureType(ForeclosureTypeValue value) {
        this.foreclosureType = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the floorNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setFloorNumber(String value) {
        this.floorNumber = value;
    }

    /**
     * Gets the value of the neighborhood property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public String getNeighborhood() {
        return neighborhood;
    }

    /**
     * Sets the value of the neighborhood property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setNeighborhood(String value) {
        this.neighborhood = value;
    }

    /**
     * Gets the value of the cityArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setCityArea(String value) {
        this.cityArea = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setLongitude(BigDecimal value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public OrientationValue getOrientation() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setOrientation(OrientationValue value) {
        this.orientation = value;
    }

    /**
     * Gets the value of the agency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setAgency(String value) {
        this.agency = value;
    }

    /**
     * Gets the value of the mlsDatabase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setMlsDatabase(String value) {
        this.mlsDatabase = value;
    }

    /**
     * Gets the value of the floorArea property.
     * 
     * @return
     *     possible object is
     *     {@link FloorAreaType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public FloorAreaType getFloorArea() {
        return floorArea;
    }

    /**
     * Sets the value of the floorArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloorAreaType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setFloorArea(FloorAreaType value) {
        this.floorArea = value;
    }

    /**
     * Gets the value of the plotArea property.
     * 
     * @return
     *     possible object is
     *     {@link PlotAreaType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public PlotAreaType getPlotArea() {
        return plotArea;
    }

    /**
     * Sets the value of the plotArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlotAreaType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setPlotArea(PlotAreaType value) {
        this.plotArea = value;
    }

    /**
     * Gets the value of the rooms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setBathrooms(BigDecimal value) {
        this.bathrooms = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setCondition(String value) {
        this.condition = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public BigInteger getYear() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setYear(BigInteger value) {
        this.year = value;
    }

    /**
     * Gets the value of the virtualTour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public URI getVirtualTour() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setVirtualTour(URI value) {
        this.virtualTour = value;
    }

    /**
     * Gets the value of the ecoScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public String getEcoScore() {
        return ecoScore;
    }

    /**
     * Sets the value of the ecoScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setEcoScore(String value) {
        this.ecoScore = value;
    }

    /**
     * Gets the value of the pictures property.
     * 
     * @return
     *     possible object is
     *     {@link AdType.Pictures }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public AdType.Pictures getPictures() {
        return pictures;
    }

    /**
     * Sets the value of the pictures property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdType.Pictures }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setPictures(AdType.Pictures value) {
        this.pictures = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setExpirationDate(Calendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the byOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getByOwner() {
        return byOwner;
    }

    /**
     * Sets the value of the byOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setByOwner(Boolean value) {
        this.byOwner = value;
    }

    /**
     * Gets the value of the isRentToOwn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getIsRentToOwn() {
        return isRentToOwn;
    }

    /**
     * Sets the value of the isRentToOwn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setIsRentToOwn(Boolean value) {
        this.isRentToOwn = value;
    }

    /**
     * Gets the value of the parking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getParking() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setParking(Boolean value) {
        this.parking = value;
    }

    /**
     * Gets the value of the foreclosure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getForeclosure() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setForeclosure(Boolean value) {
        this.foreclosure = value;
    }

    /**
     * Gets the value of the isFurnished property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getIsFurnished() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setIsFurnished(Boolean value) {
        this.isFurnished = value;
    }

    /**
     * Gets the value of the isNew property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getIsNew() {
        return isNew;
    }

    /**
     * Sets the value of the isNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setIsNew(Boolean value) {
        this.isNew = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the contactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Sets the value of the contactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setContactEmail(String value) {
        this.contactEmail = value;
    }

    /**
     * Gets the value of the contactTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public String getContactTelephone() {
        return contactTelephone;
    }

    /**
     * Sets the value of the contactTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public void setContactTelephone(String value) {
        this.contactTelephone = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId, (this.id!= null));
        }
        {
            URI theUrl;
            theUrl = this.getUrl();
            strategy.appendField(locator, this, "url", buffer, theUrl, (this.url!= null));
        }
        {
            URI theMobileUrl;
            theMobileUrl = this.getMobileUrl();
            strategy.appendField(locator, this, "mobileUrl", buffer, theMobileUrl, (this.mobileUrl!= null));
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theTitle, (this.title!= null));
        }
        {
            TypeValue theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType, (this.type!= null));
        }
        {
            String theContent;
            theContent = this.getContent();
            strategy.appendField(locator, this, "content", buffer, theContent, (this.content!= null));
        }
        {
            PriceType thePrice;
            thePrice = this.getPrice();
            strategy.appendField(locator, this, "price", buffer, thePrice, (this.price!= null));
        }
        {
            String thePropertyType;
            thePropertyType = this.getPropertyType();
            strategy.appendField(locator, this, "propertyType", buffer, thePropertyType, (this.propertyType!= null));
        }
        {
            ForeclosureTypeValue theForeclosureType;
            theForeclosureType = this.getForeclosureType();
            strategy.appendField(locator, this, "foreclosureType", buffer, theForeclosureType, (this.foreclosureType!= null));
        }
        {
            String theAddress;
            theAddress = this.getAddress();
            strategy.appendField(locator, this, "address", buffer, theAddress, (this.address!= null));
        }
        {
            String theFloorNumber;
            theFloorNumber = this.getFloorNumber();
            strategy.appendField(locator, this, "floorNumber", buffer, theFloorNumber, (this.floorNumber!= null));
        }
        {
            String theNeighborhood;
            theNeighborhood = this.getNeighborhood();
            strategy.appendField(locator, this, "neighborhood", buffer, theNeighborhood, (this.neighborhood!= null));
        }
        {
            String theCityArea;
            theCityArea = this.getCityArea();
            strategy.appendField(locator, this, "cityArea", buffer, theCityArea, (this.cityArea!= null));
        }
        {
            String theCity;
            theCity = this.getCity();
            strategy.appendField(locator, this, "city", buffer, theCity, (this.city!= null));
        }
        {
            String theRegion;
            theRegion = this.getRegion();
            strategy.appendField(locator, this, "region", buffer, theRegion, (this.region!= null));
        }
        {
            String theCountry;
            theCountry = this.getCountry();
            strategy.appendField(locator, this, "country", buffer, theCountry, (this.country!= null));
        }
        {
            String thePostcode;
            thePostcode = this.getPostcode();
            strategy.appendField(locator, this, "postcode", buffer, thePostcode, (this.postcode!= null));
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
            OrientationValue theOrientation;
            theOrientation = this.getOrientation();
            strategy.appendField(locator, this, "orientation", buffer, theOrientation, (this.orientation!= null));
        }
        {
            String theAgency;
            theAgency = this.getAgency();
            strategy.appendField(locator, this, "agency", buffer, theAgency, (this.agency!= null));
        }
        {
            String theMlsDatabase;
            theMlsDatabase = this.getMlsDatabase();
            strategy.appendField(locator, this, "mlsDatabase", buffer, theMlsDatabase, (this.mlsDatabase!= null));
        }
        {
            FloorAreaType theFloorArea;
            theFloorArea = this.getFloorArea();
            strategy.appendField(locator, this, "floorArea", buffer, theFloorArea, (this.floorArea!= null));
        }
        {
            PlotAreaType thePlotArea;
            thePlotArea = this.getPlotArea();
            strategy.appendField(locator, this, "plotArea", buffer, thePlotArea, (this.plotArea!= null));
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
            String theCondition;
            theCondition = this.getCondition();
            strategy.appendField(locator, this, "condition", buffer, theCondition, (this.condition!= null));
        }
        {
            BigInteger theYear;
            theYear = this.getYear();
            strategy.appendField(locator, this, "year", buffer, theYear, (this.year!= null));
        }
        {
            URI theVirtualTour;
            theVirtualTour = this.getVirtualTour();
            strategy.appendField(locator, this, "virtualTour", buffer, theVirtualTour, (this.virtualTour!= null));
        }
        {
            String theEcoScore;
            theEcoScore = this.getEcoScore();
            strategy.appendField(locator, this, "ecoScore", buffer, theEcoScore, (this.ecoScore!= null));
        }
        {
            AdType.Pictures thePictures;
            thePictures = this.getPictures();
            strategy.appendField(locator, this, "pictures", buffer, thePictures, (this.pictures!= null));
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
            Boolean theByOwner;
            theByOwner = this.getByOwner();
            strategy.appendField(locator, this, "byOwner", buffer, theByOwner, (this.byOwner!= null));
        }
        {
            Boolean theIsRentToOwn;
            theIsRentToOwn = this.getIsRentToOwn();
            strategy.appendField(locator, this, "isRentToOwn", buffer, theIsRentToOwn, (this.isRentToOwn!= null));
        }
        {
            Boolean theParking;
            theParking = this.getParking();
            strategy.appendField(locator, this, "parking", buffer, theParking, (this.parking!= null));
        }
        {
            Boolean theForeclosure;
            theForeclosure = this.getForeclosure();
            strategy.appendField(locator, this, "foreclosure", buffer, theForeclosure, (this.foreclosure!= null));
        }
        {
            Boolean theIsFurnished;
            theIsFurnished = this.getIsFurnished();
            strategy.appendField(locator, this, "isFurnished", buffer, theIsFurnished, (this.isFurnished!= null));
        }
        {
            Boolean theIsNew;
            theIsNew = this.getIsNew();
            strategy.appendField(locator, this, "isNew", buffer, theIsNew, (this.isNew!= null));
        }
        {
            String theContactName;
            theContactName = this.getContactName();
            strategy.appendField(locator, this, "contactName", buffer, theContactName, (this.contactName!= null));
        }
        {
            String theContactEmail;
            theContactEmail = this.getContactEmail();
            strategy.appendField(locator, this, "contactEmail", buffer, theContactEmail, (this.contactEmail!= null));
        }
        {
            String theContactTelephone;
            theContactTelephone = this.getContactTelephone();
            strategy.appendField(locator, this, "contactTelephone", buffer, theContactTelephone, (this.contactTelephone!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof AdType) {
            final AdType copy = ((AdType) draftCopy);
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
                    URI sourceUrl;
                    sourceUrl = this.getUrl();
                    URI copyUrl = ((URI) strategy.copy(LocatorUtils.property(locator, "url", sourceUrl), sourceUrl, (this.url!= null)));
                    copy.setUrl(copyUrl);
                } else {
                    if (urlShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.url = null;
                    }
                }
            }
            {
                Boolean mobileUrlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mobileUrl!= null));
                if (mobileUrlShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourceMobileUrl;
                    sourceMobileUrl = this.getMobileUrl();
                    URI copyMobileUrl = ((URI) strategy.copy(LocatorUtils.property(locator, "mobileUrl", sourceMobileUrl), sourceMobileUrl, (this.mobileUrl!= null)));
                    copy.setMobileUrl(copyMobileUrl);
                } else {
                    if (mobileUrlShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mobileUrl = null;
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
                    TypeValue sourceType;
                    sourceType = this.getType();
                    TypeValue copyType = ((TypeValue) strategy.copy(LocatorUtils.property(locator, "type", sourceType), sourceType, (this.type!= null)));
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
                Boolean priceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.price!= null));
                if (priceShouldBeCopiedAndSet == Boolean.TRUE) {
                    PriceType sourcePrice;
                    sourcePrice = this.getPrice();
                    PriceType copyPrice = ((PriceType) strategy.copy(LocatorUtils.property(locator, "price", sourcePrice), sourcePrice, (this.price!= null)));
                    copy.setPrice(copyPrice);
                } else {
                    if (priceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.price = null;
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
                Boolean foreclosureTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.foreclosureType!= null));
                if (foreclosureTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ForeclosureTypeValue sourceForeclosureType;
                    sourceForeclosureType = this.getForeclosureType();
                    ForeclosureTypeValue copyForeclosureType = ((ForeclosureTypeValue) strategy.copy(LocatorUtils.property(locator, "foreclosureType", sourceForeclosureType), sourceForeclosureType, (this.foreclosureType!= null)));
                    copy.setForeclosureType(copyForeclosureType);
                } else {
                    if (foreclosureTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.foreclosureType = null;
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
                Boolean neighborhoodShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.neighborhood!= null));
                if (neighborhoodShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceNeighborhood;
                    sourceNeighborhood = this.getNeighborhood();
                    String copyNeighborhood = ((String) strategy.copy(LocatorUtils.property(locator, "neighborhood", sourceNeighborhood), sourceNeighborhood, (this.neighborhood!= null)));
                    copy.setNeighborhood(copyNeighborhood);
                } else {
                    if (neighborhoodShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.neighborhood = null;
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
                Boolean countryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.country!= null));
                if (countryShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCountry;
                    sourceCountry = this.getCountry();
                    String copyCountry = ((String) strategy.copy(LocatorUtils.property(locator, "country", sourceCountry), sourceCountry, (this.country!= null)));
                    copy.setCountry(copyCountry);
                } else {
                    if (countryShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.country = null;
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
                Boolean orientationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.orientation!= null));
                if (orientationShouldBeCopiedAndSet == Boolean.TRUE) {
                    OrientationValue sourceOrientation;
                    sourceOrientation = this.getOrientation();
                    OrientationValue copyOrientation = ((OrientationValue) strategy.copy(LocatorUtils.property(locator, "orientation", sourceOrientation), sourceOrientation, (this.orientation!= null)));
                    copy.setOrientation(copyOrientation);
                } else {
                    if (orientationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.orientation = null;
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
                Boolean floorAreaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.floorArea!= null));
                if (floorAreaShouldBeCopiedAndSet == Boolean.TRUE) {
                    FloorAreaType sourceFloorArea;
                    sourceFloorArea = this.getFloorArea();
                    FloorAreaType copyFloorArea = ((FloorAreaType) strategy.copy(LocatorUtils.property(locator, "floorArea", sourceFloorArea), sourceFloorArea, (this.floorArea!= null)));
                    copy.setFloorArea(copyFloorArea);
                } else {
                    if (floorAreaShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.floorArea = null;
                    }
                }
            }
            {
                Boolean plotAreaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.plotArea!= null));
                if (plotAreaShouldBeCopiedAndSet == Boolean.TRUE) {
                    PlotAreaType sourcePlotArea;
                    sourcePlotArea = this.getPlotArea();
                    PlotAreaType copyPlotArea = ((PlotAreaType) strategy.copy(LocatorUtils.property(locator, "plotArea", sourcePlotArea), sourcePlotArea, (this.plotArea!= null)));
                    copy.setPlotArea(copyPlotArea);
                } else {
                    if (plotAreaShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.plotArea = null;
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
                Boolean yearShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.year!= null));
                if (yearShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceYear;
                    sourceYear = this.getYear();
                    BigInteger copyYear = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "year", sourceYear), sourceYear, (this.year!= null)));
                    copy.setYear(copyYear);
                } else {
                    if (yearShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.year = null;
                    }
                }
            }
            {
                Boolean virtualTourShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.virtualTour!= null));
                if (virtualTourShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourceVirtualTour;
                    sourceVirtualTour = this.getVirtualTour();
                    URI copyVirtualTour = ((URI) strategy.copy(LocatorUtils.property(locator, "virtualTour", sourceVirtualTour), sourceVirtualTour, (this.virtualTour!= null)));
                    copy.setVirtualTour(copyVirtualTour);
                } else {
                    if (virtualTourShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.virtualTour = null;
                    }
                }
            }
            {
                Boolean ecoScoreShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ecoScore!= null));
                if (ecoScoreShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEcoScore;
                    sourceEcoScore = this.getEcoScore();
                    String copyEcoScore = ((String) strategy.copy(LocatorUtils.property(locator, "ecoScore", sourceEcoScore), sourceEcoScore, (this.ecoScore!= null)));
                    copy.setEcoScore(copyEcoScore);
                } else {
                    if (ecoScoreShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ecoScore = null;
                    }
                }
            }
            {
                Boolean picturesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pictures!= null));
                if (picturesShouldBeCopiedAndSet == Boolean.TRUE) {
                    AdType.Pictures sourcePictures;
                    sourcePictures = this.getPictures();
                    AdType.Pictures copyPictures = ((AdType.Pictures) strategy.copy(LocatorUtils.property(locator, "pictures", sourcePictures), sourcePictures, (this.pictures!= null)));
                    copy.setPictures(copyPictures);
                } else {
                    if (picturesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pictures = null;
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
                Boolean byOwnerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.byOwner!= null));
                if (byOwnerShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceByOwner;
                    sourceByOwner = this.getByOwner();
                    Boolean copyByOwner = ((Boolean) strategy.copy(LocatorUtils.property(locator, "byOwner", sourceByOwner), sourceByOwner, (this.byOwner!= null)));
                    copy.setByOwner(copyByOwner);
                } else {
                    if (byOwnerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.byOwner = null;
                    }
                }
            }
            {
                Boolean isRentToOwnShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isRentToOwn!= null));
                if (isRentToOwnShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceIsRentToOwn;
                    sourceIsRentToOwn = this.getIsRentToOwn();
                    Boolean copyIsRentToOwn = ((Boolean) strategy.copy(LocatorUtils.property(locator, "isRentToOwn", sourceIsRentToOwn), sourceIsRentToOwn, (this.isRentToOwn!= null)));
                    copy.setIsRentToOwn(copyIsRentToOwn);
                } else {
                    if (isRentToOwnShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.isRentToOwn = null;
                    }
                }
            }
            {
                Boolean parkingShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.parking!= null));
                if (parkingShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceParking;
                    sourceParking = this.getParking();
                    Boolean copyParking = ((Boolean) strategy.copy(LocatorUtils.property(locator, "parking", sourceParking), sourceParking, (this.parking!= null)));
                    copy.setParking(copyParking);
                } else {
                    if (parkingShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.parking = null;
                    }
                }
            }
            {
                Boolean foreclosureShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.foreclosure!= null));
                if (foreclosureShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceForeclosure;
                    sourceForeclosure = this.getForeclosure();
                    Boolean copyForeclosure = ((Boolean) strategy.copy(LocatorUtils.property(locator, "foreclosure", sourceForeclosure), sourceForeclosure, (this.foreclosure!= null)));
                    copy.setForeclosure(copyForeclosure);
                } else {
                    if (foreclosureShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.foreclosure = null;
                    }
                }
            }
            {
                Boolean isFurnishedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isFurnished!= null));
                if (isFurnishedShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceIsFurnished;
                    sourceIsFurnished = this.getIsFurnished();
                    Boolean copyIsFurnished = ((Boolean) strategy.copy(LocatorUtils.property(locator, "isFurnished", sourceIsFurnished), sourceIsFurnished, (this.isFurnished!= null)));
                    copy.setIsFurnished(copyIsFurnished);
                } else {
                    if (isFurnishedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.isFurnished = null;
                    }
                }
            }
            {
                Boolean isNewShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isNew!= null));
                if (isNewShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceIsNew;
                    sourceIsNew = this.getIsNew();
                    Boolean copyIsNew = ((Boolean) strategy.copy(LocatorUtils.property(locator, "isNew", sourceIsNew), sourceIsNew, (this.isNew!= null)));
                    copy.setIsNew(copyIsNew);
                } else {
                    if (isNewShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.isNew = null;
                    }
                }
            }
            {
                Boolean contactNameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.contactName!= null));
                if (contactNameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceContactName;
                    sourceContactName = this.getContactName();
                    String copyContactName = ((String) strategy.copy(LocatorUtils.property(locator, "contactName", sourceContactName), sourceContactName, (this.contactName!= null)));
                    copy.setContactName(copyContactName);
                } else {
                    if (contactNameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.contactName = null;
                    }
                }
            }
            {
                Boolean contactEmailShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.contactEmail!= null));
                if (contactEmailShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceContactEmail;
                    sourceContactEmail = this.getContactEmail();
                    String copyContactEmail = ((String) strategy.copy(LocatorUtils.property(locator, "contactEmail", sourceContactEmail), sourceContactEmail, (this.contactEmail!= null)));
                    copy.setContactEmail(copyContactEmail);
                } else {
                    if (contactEmailShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.contactEmail = null;
                    }
                }
            }
            {
                Boolean contactTelephoneShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.contactTelephone!= null));
                if (contactTelephoneShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceContactTelephone;
                    sourceContactTelephone = this.getContactTelephone();
                    String copyContactTelephone = ((String) strategy.copy(LocatorUtils.property(locator, "contactTelephone", sourceContactTelephone), sourceContactTelephone, (this.contactTelephone!= null)));
                    copy.setContactTelephone(copyContactTelephone);
                } else {
                    if (contactTelephoneShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.contactTelephone = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new AdType();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AdType that = ((AdType) object);
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
            URI lhsUrl;
            lhsUrl = this.getUrl();
            URI rhsUrl;
            rhsUrl = that.getUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "url", lhsUrl), LocatorUtils.property(thatLocator, "url", rhsUrl), lhsUrl, rhsUrl, (this.url!= null), (that.url!= null))) {
                return false;
            }
        }
        {
            URI lhsMobileUrl;
            lhsMobileUrl = this.getMobileUrl();
            URI rhsMobileUrl;
            rhsMobileUrl = that.getMobileUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mobileUrl", lhsMobileUrl), LocatorUtils.property(thatLocator, "mobileUrl", rhsMobileUrl), lhsMobileUrl, rhsMobileUrl, (this.mobileUrl!= null), (that.mobileUrl!= null))) {
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
            TypeValue lhsType;
            lhsType = this.getType();
            TypeValue rhsType;
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
            PriceType lhsPrice;
            lhsPrice = this.getPrice();
            PriceType rhsPrice;
            rhsPrice = that.getPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "price", lhsPrice), LocatorUtils.property(thatLocator, "price", rhsPrice), lhsPrice, rhsPrice, (this.price!= null), (that.price!= null))) {
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
            ForeclosureTypeValue lhsForeclosureType;
            lhsForeclosureType = this.getForeclosureType();
            ForeclosureTypeValue rhsForeclosureType;
            rhsForeclosureType = that.getForeclosureType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "foreclosureType", lhsForeclosureType), LocatorUtils.property(thatLocator, "foreclosureType", rhsForeclosureType), lhsForeclosureType, rhsForeclosureType, (this.foreclosureType!= null), (that.foreclosureType!= null))) {
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
            String lhsFloorNumber;
            lhsFloorNumber = this.getFloorNumber();
            String rhsFloorNumber;
            rhsFloorNumber = that.getFloorNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "floorNumber", lhsFloorNumber), LocatorUtils.property(thatLocator, "floorNumber", rhsFloorNumber), lhsFloorNumber, rhsFloorNumber, (this.floorNumber!= null), (that.floorNumber!= null))) {
                return false;
            }
        }
        {
            String lhsNeighborhood;
            lhsNeighborhood = this.getNeighborhood();
            String rhsNeighborhood;
            rhsNeighborhood = that.getNeighborhood();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "neighborhood", lhsNeighborhood), LocatorUtils.property(thatLocator, "neighborhood", rhsNeighborhood), lhsNeighborhood, rhsNeighborhood, (this.neighborhood!= null), (that.neighborhood!= null))) {
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
            String lhsCity;
            lhsCity = this.getCity();
            String rhsCity;
            rhsCity = that.getCity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "city", lhsCity), LocatorUtils.property(thatLocator, "city", rhsCity), lhsCity, rhsCity, (this.city!= null), (that.city!= null))) {
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
            String lhsCountry;
            lhsCountry = this.getCountry();
            String rhsCountry;
            rhsCountry = that.getCountry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "country", lhsCountry), LocatorUtils.property(thatLocator, "country", rhsCountry), lhsCountry, rhsCountry, (this.country!= null), (that.country!= null))) {
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
            OrientationValue lhsOrientation;
            lhsOrientation = this.getOrientation();
            OrientationValue rhsOrientation;
            rhsOrientation = that.getOrientation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orientation", lhsOrientation), LocatorUtils.property(thatLocator, "orientation", rhsOrientation), lhsOrientation, rhsOrientation, (this.orientation!= null), (that.orientation!= null))) {
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
            String lhsMlsDatabase;
            lhsMlsDatabase = this.getMlsDatabase();
            String rhsMlsDatabase;
            rhsMlsDatabase = that.getMlsDatabase();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mlsDatabase", lhsMlsDatabase), LocatorUtils.property(thatLocator, "mlsDatabase", rhsMlsDatabase), lhsMlsDatabase, rhsMlsDatabase, (this.mlsDatabase!= null), (that.mlsDatabase!= null))) {
                return false;
            }
        }
        {
            FloorAreaType lhsFloorArea;
            lhsFloorArea = this.getFloorArea();
            FloorAreaType rhsFloorArea;
            rhsFloorArea = that.getFloorArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "floorArea", lhsFloorArea), LocatorUtils.property(thatLocator, "floorArea", rhsFloorArea), lhsFloorArea, rhsFloorArea, (this.floorArea!= null), (that.floorArea!= null))) {
                return false;
            }
        }
        {
            PlotAreaType lhsPlotArea;
            lhsPlotArea = this.getPlotArea();
            PlotAreaType rhsPlotArea;
            rhsPlotArea = that.getPlotArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "plotArea", lhsPlotArea), LocatorUtils.property(thatLocator, "plotArea", rhsPlotArea), lhsPlotArea, rhsPlotArea, (this.plotArea!= null), (that.plotArea!= null))) {
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
            String lhsCondition;
            lhsCondition = this.getCondition();
            String rhsCondition;
            rhsCondition = that.getCondition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "condition", lhsCondition), LocatorUtils.property(thatLocator, "condition", rhsCondition), lhsCondition, rhsCondition, (this.condition!= null), (that.condition!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsYear;
            lhsYear = this.getYear();
            BigInteger rhsYear;
            rhsYear = that.getYear();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "year", lhsYear), LocatorUtils.property(thatLocator, "year", rhsYear), lhsYear, rhsYear, (this.year!= null), (that.year!= null))) {
                return false;
            }
        }
        {
            URI lhsVirtualTour;
            lhsVirtualTour = this.getVirtualTour();
            URI rhsVirtualTour;
            rhsVirtualTour = that.getVirtualTour();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "virtualTour", lhsVirtualTour), LocatorUtils.property(thatLocator, "virtualTour", rhsVirtualTour), lhsVirtualTour, rhsVirtualTour, (this.virtualTour!= null), (that.virtualTour!= null))) {
                return false;
            }
        }
        {
            String lhsEcoScore;
            lhsEcoScore = this.getEcoScore();
            String rhsEcoScore;
            rhsEcoScore = that.getEcoScore();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ecoScore", lhsEcoScore), LocatorUtils.property(thatLocator, "ecoScore", rhsEcoScore), lhsEcoScore, rhsEcoScore, (this.ecoScore!= null), (that.ecoScore!= null))) {
                return false;
            }
        }
        {
            AdType.Pictures lhsPictures;
            lhsPictures = this.getPictures();
            AdType.Pictures rhsPictures;
            rhsPictures = that.getPictures();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pictures", lhsPictures), LocatorUtils.property(thatLocator, "pictures", rhsPictures), lhsPictures, rhsPictures, (this.pictures!= null), (that.pictures!= null))) {
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
            Boolean lhsByOwner;
            lhsByOwner = this.getByOwner();
            Boolean rhsByOwner;
            rhsByOwner = that.getByOwner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "byOwner", lhsByOwner), LocatorUtils.property(thatLocator, "byOwner", rhsByOwner), lhsByOwner, rhsByOwner, (this.byOwner!= null), (that.byOwner!= null))) {
                return false;
            }
        }
        {
            Boolean lhsIsRentToOwn;
            lhsIsRentToOwn = this.getIsRentToOwn();
            Boolean rhsIsRentToOwn;
            rhsIsRentToOwn = that.getIsRentToOwn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isRentToOwn", lhsIsRentToOwn), LocatorUtils.property(thatLocator, "isRentToOwn", rhsIsRentToOwn), lhsIsRentToOwn, rhsIsRentToOwn, (this.isRentToOwn!= null), (that.isRentToOwn!= null))) {
                return false;
            }
        }
        {
            Boolean lhsParking;
            lhsParking = this.getParking();
            Boolean rhsParking;
            rhsParking = that.getParking();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parking", lhsParking), LocatorUtils.property(thatLocator, "parking", rhsParking), lhsParking, rhsParking, (this.parking!= null), (that.parking!= null))) {
                return false;
            }
        }
        {
            Boolean lhsForeclosure;
            lhsForeclosure = this.getForeclosure();
            Boolean rhsForeclosure;
            rhsForeclosure = that.getForeclosure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "foreclosure", lhsForeclosure), LocatorUtils.property(thatLocator, "foreclosure", rhsForeclosure), lhsForeclosure, rhsForeclosure, (this.foreclosure!= null), (that.foreclosure!= null))) {
                return false;
            }
        }
        {
            Boolean lhsIsFurnished;
            lhsIsFurnished = this.getIsFurnished();
            Boolean rhsIsFurnished;
            rhsIsFurnished = that.getIsFurnished();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isFurnished", lhsIsFurnished), LocatorUtils.property(thatLocator, "isFurnished", rhsIsFurnished), lhsIsFurnished, rhsIsFurnished, (this.isFurnished!= null), (that.isFurnished!= null))) {
                return false;
            }
        }
        {
            Boolean lhsIsNew;
            lhsIsNew = this.getIsNew();
            Boolean rhsIsNew;
            rhsIsNew = that.getIsNew();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isNew", lhsIsNew), LocatorUtils.property(thatLocator, "isNew", rhsIsNew), lhsIsNew, rhsIsNew, (this.isNew!= null), (that.isNew!= null))) {
                return false;
            }
        }
        {
            String lhsContactName;
            lhsContactName = this.getContactName();
            String rhsContactName;
            rhsContactName = that.getContactName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactName", lhsContactName), LocatorUtils.property(thatLocator, "contactName", rhsContactName), lhsContactName, rhsContactName, (this.contactName!= null), (that.contactName!= null))) {
                return false;
            }
        }
        {
            String lhsContactEmail;
            lhsContactEmail = this.getContactEmail();
            String rhsContactEmail;
            rhsContactEmail = that.getContactEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactEmail", lhsContactEmail), LocatorUtils.property(thatLocator, "contactEmail", rhsContactEmail), lhsContactEmail, rhsContactEmail, (this.contactEmail!= null), (that.contactEmail!= null))) {
                return false;
            }
        }
        {
            String lhsContactTelephone;
            lhsContactTelephone = this.getContactTelephone();
            String rhsContactTelephone;
            rhsContactTelephone = that.getContactTelephone();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactTelephone", lhsContactTelephone), LocatorUtils.property(thatLocator, "contactTelephone", rhsContactTelephone), lhsContactTelephone, rhsContactTelephone, (this.contactTelephone!= null), (that.contactTelephone!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="picture" type="{}PictureType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "picture"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
    public static class Pictures implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
        protected List<PictureType> picture;

        /**
         * Gets the value of the picture property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the picture property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPicture().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PictureType }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
        public List<PictureType> getPicture() {
            if (picture == null) {
                picture = new ArrayList<PictureType>();
            }
            return this.picture;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
        public String toString() {
            final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            {
                List<PictureType> thePicture;
                thePicture = (((this.picture!= null)&&(!this.picture.isEmpty()))?this.getPicture():null);
                strategy.appendField(locator, this, "picture", buffer, thePicture, ((this.picture!= null)&&(!this.picture.isEmpty())));
            }
            return buffer;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
        public Object clone() {
            return copyTo(createNewInstance());
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
        public Object copyTo(Object target) {
            final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
            return copyTo(null, target, strategy);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
        public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
            final Object draftCopy = ((target == null)?createNewInstance():target);
            if (draftCopy instanceof AdType.Pictures) {
                final AdType.Pictures copy = ((AdType.Pictures) draftCopy);
                {
                    Boolean pictureShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.picture!= null)&&(!this.picture.isEmpty())));
                    if (pictureShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<PictureType> sourcePicture;
                        sourcePicture = (((this.picture!= null)&&(!this.picture.isEmpty()))?this.getPicture():null);
                        @SuppressWarnings("unchecked")
                        List<PictureType> copyPicture = ((List<PictureType> ) strategy.copy(LocatorUtils.property(locator, "picture", sourcePicture), sourcePicture, ((this.picture!= null)&&(!this.picture.isEmpty()))));
                        copy.picture = null;
                        if (copyPicture!= null) {
                            List<PictureType> uniquePicturel = copy.getPicture();
                            uniquePicturel.addAll(copyPicture);
                        }
                    } else {
                        if (pictureShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.picture = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
        public Object createNewInstance() {
            return new AdType.Pictures();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final AdType.Pictures that = ((AdType.Pictures) object);
            {
                List<PictureType> lhsPicture;
                lhsPicture = (((this.picture!= null)&&(!this.picture.isEmpty()))?this.getPicture():null);
                List<PictureType> rhsPicture;
                rhsPicture = (((that.picture!= null)&&(!that.picture.isEmpty()))?that.getPicture():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "picture", lhsPicture), LocatorUtils.property(thatLocator, "picture", rhsPicture), lhsPicture, rhsPicture, ((this.picture!= null)&&(!this.picture.isEmpty())), ((that.picture!= null)&&(!that.picture.isEmpty())))) {
                    return false;
                }
            }
            return true;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:55:25+02:00", comments = "JAXB RI v2.2.11")
        public boolean equals(Object object) {
            final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
            return equals(null, null, object, strategy);
        }

    }

}
