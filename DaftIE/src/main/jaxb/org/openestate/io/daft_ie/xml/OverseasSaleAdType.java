
package org.openestate.io.daft_ie.xml;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
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
 * <p>Java class for overseasSaleAdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="overseasSaleAdType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="area" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="property_type" type="{}propertyType"/&gt;
 *         &lt;element name="house_type" type="{}houseType"/&gt;
 *         &lt;element name="commercial_type" type="{}commercialType"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="price" type="{}positiveInteger"/&gt;
 *         &lt;element name="price_type"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="region"/&gt;
 *               &lt;enumeration value="excess"/&gt;
 *               &lt;enumeration value="from"/&gt;
 *               &lt;enumeration value="on application"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="bathroom_number" type="{}positiveInteger"/&gt;
 *         &lt;element name="bedroom_number" type="{}positiveInteger"/&gt;
 *         &lt;element name="is_new_development" type="{}bool" minOccurs="0"/&gt;
 *         &lt;element name="units_available" type="{}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="new_development_availability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="square_metres" type="{}positiveDecimal" minOccurs="0"/&gt;
 *         &lt;element name="acres" type="{}positiveDecimal" minOccurs="0"/&gt;
 *         &lt;element name="directions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="co2_rating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="energy_rating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="viewing_details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phone1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="phone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contact_name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="phone_info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="main_email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cc_email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="external_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="agent_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="property_status"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="for-sale"/&gt;
 *               &lt;enumeration value="sale-agreed"/&gt;
 *               &lt;enumeration value="sold"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="photos" type="{}photosType" minOccurs="0"/&gt;
 *         &lt;element name="features" type="{}featuresType" minOccurs="0"/&gt;
 *         &lt;element name="pdfs" type="{}pdfsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "overseasSaleAdType", propOrder = {
    "country",
    "region",
    "area",
    "address",
    "propertyType",
    "houseType",
    "commercialType",
    "description",
    "price",
    "priceType",
    "bathroomNumber",
    "bedroomNumber",
    "isNewDevelopment",
    "unitsAvailable",
    "newDevelopmentAvailability",
    "squareMetres",
    "acres",
    "directions",
    "co2Rating",
    "energyRating",
    "viewingDetails",
    "phone1",
    "phone2",
    "contactName",
    "phoneInfo",
    "mainEmail",
    "ccEmail",
    "externalId",
    "agentId",
    "propertyStatus",
    "photos",
    "features",
    "pdfs"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
public class OverseasSaleAdType implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true, type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter8 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected String country;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected java.lang.String region;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected java.lang.String area;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected java.lang.String address;
    @XmlElement(name = "property_type", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected PropertyType propertyType;
    @XmlElement(name = "house_type", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected HouseType houseType;
    @XmlElement(name = "commercial_type", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected CommercialType commercialType;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected java.lang.String description;
    @XmlElement(required = true, type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter6 .class)
    @XmlSchemaType(name = "integer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected BigInteger price;
    @XmlElement(name = "price_type", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected OverseasSaleAdType.PriceType priceType;
    @XmlElement(name = "bathroom_number", required = true, type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter6 .class)
    @XmlSchemaType(name = "integer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected BigInteger bathroomNumber;
    @XmlElement(name = "bedroom_number", required = true, type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter6 .class)
    @XmlSchemaType(name = "integer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected BigInteger bedroomNumber;
    @XmlElement(name = "is_new_development", type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean isNewDevelopment;
    @XmlElement(name = "units_available", type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter6 .class)
    @XmlSchemaType(name = "integer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected BigInteger unitsAvailable;
    @XmlElement(name = "new_development_availability")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected java.lang.String newDevelopmentAvailability;
    @XmlElement(name = "square_metres", type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "decimal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal squareMetres;
    @XmlElement(type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "decimal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal acres;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected java.lang.String directions;
    @XmlElement(name = "co2_rating")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected java.lang.String co2Rating;
    @XmlElement(name = "energy_rating")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected java.lang.String energyRating;
    @XmlElement(name = "viewing_details")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected java.lang.String viewingDetails;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected java.lang.String phone1;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected java.lang.String phone2;
    @XmlElement(name = "contact_name", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected java.lang.String contactName;
    @XmlElement(name = "phone_info")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected java.lang.String phoneInfo;
    @XmlElement(name = "main_email", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected java.lang.String mainEmail;
    @XmlElement(name = "cc_email")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected java.lang.String ccEmail;
    @XmlElement(name = "external_id", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected java.lang.String externalId;
    @XmlElement(name = "agent_id", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected java.lang.String agentId;
    @XmlElement(name = "property_status", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected OverseasSaleAdType.PropertyStatus propertyStatus;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected PhotosType photos;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected FeaturesType features;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected PdfsType pdfs;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public java.lang.String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setRegion(java.lang.String value) {
        this.region = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public java.lang.String getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setArea(java.lang.String value) {
        this.area = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public java.lang.String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setAddress(java.lang.String value) {
        this.address = value;
    }

    /**
     * Gets the value of the propertyType property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public PropertyType getPropertyType() {
        return propertyType;
    }

    /**
     * Sets the value of the propertyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setPropertyType(PropertyType value) {
        this.propertyType = value;
    }

    /**
     * Gets the value of the houseType property.
     * 
     * @return
     *     possible object is
     *     {@link HouseType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public HouseType getHouseType() {
        return houseType;
    }

    /**
     * Sets the value of the houseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setHouseType(HouseType value) {
        this.houseType = value;
    }

    /**
     * Gets the value of the commercialType property.
     * 
     * @return
     *     possible object is
     *     {@link CommercialType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public CommercialType getCommercialType() {
        return commercialType;
    }

    /**
     * Sets the value of the commercialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercialType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setCommercialType(CommercialType value) {
        this.commercialType = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public java.lang.String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setDescription(java.lang.String value) {
        this.description = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public BigInteger getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setPrice(BigInteger value) {
        this.price = value;
    }

    /**
     * Gets the value of the priceType property.
     * 
     * @return
     *     possible object is
     *     {@link OverseasSaleAdType.PriceType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public OverseasSaleAdType.PriceType getPriceType() {
        return priceType;
    }

    /**
     * Sets the value of the priceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverseasSaleAdType.PriceType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setPriceType(OverseasSaleAdType.PriceType value) {
        this.priceType = value;
    }

    /**
     * Gets the value of the bathroomNumber property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public BigInteger getBathroomNumber() {
        return bathroomNumber;
    }

    /**
     * Sets the value of the bathroomNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setBathroomNumber(BigInteger value) {
        this.bathroomNumber = value;
    }

    /**
     * Gets the value of the bedroomNumber property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public BigInteger getBedroomNumber() {
        return bedroomNumber;
    }

    /**
     * Sets the value of the bedroomNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setBedroomNumber(BigInteger value) {
        this.bedroomNumber = value;
    }

    /**
     * Gets the value of the isNewDevelopment property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getIsNewDevelopment() {
        return isNewDevelopment;
    }

    /**
     * Sets the value of the isNewDevelopment property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setIsNewDevelopment(Boolean value) {
        this.isNewDevelopment = value;
    }

    /**
     * Gets the value of the unitsAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public BigInteger getUnitsAvailable() {
        return unitsAvailable;
    }

    /**
     * Sets the value of the unitsAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setUnitsAvailable(BigInteger value) {
        this.unitsAvailable = value;
    }

    /**
     * Gets the value of the newDevelopmentAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public java.lang.String getNewDevelopmentAvailability() {
        return newDevelopmentAvailability;
    }

    /**
     * Sets the value of the newDevelopmentAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setNewDevelopmentAvailability(java.lang.String value) {
        this.newDevelopmentAvailability = value;
    }

    /**
     * Gets the value of the squareMetres property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getSquareMetres() {
        return squareMetres;
    }

    /**
     * Sets the value of the squareMetres property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setSquareMetres(BigDecimal value) {
        this.squareMetres = value;
    }

    /**
     * Gets the value of the acres property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getAcres() {
        return acres;
    }

    /**
     * Sets the value of the acres property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setAcres(BigDecimal value) {
        this.acres = value;
    }

    /**
     * Gets the value of the directions property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public java.lang.String getDirections() {
        return directions;
    }

    /**
     * Sets the value of the directions property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setDirections(java.lang.String value) {
        this.directions = value;
    }

    /**
     * Gets the value of the co2Rating property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public java.lang.String getCo2Rating() {
        return co2Rating;
    }

    /**
     * Sets the value of the co2Rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setCo2Rating(java.lang.String value) {
        this.co2Rating = value;
    }

    /**
     * Gets the value of the energyRating property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public java.lang.String getEnergyRating() {
        return energyRating;
    }

    /**
     * Sets the value of the energyRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setEnergyRating(java.lang.String value) {
        this.energyRating = value;
    }

    /**
     * Gets the value of the viewingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public java.lang.String getViewingDetails() {
        return viewingDetails;
    }

    /**
     * Sets the value of the viewingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setViewingDetails(java.lang.String value) {
        this.viewingDetails = value;
    }

    /**
     * Gets the value of the phone1 property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public java.lang.String getPhone1() {
        return phone1;
    }

    /**
     * Sets the value of the phone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setPhone1(java.lang.String value) {
        this.phone1 = value;
    }

    /**
     * Gets the value of the phone2 property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public java.lang.String getPhone2() {
        return phone2;
    }

    /**
     * Sets the value of the phone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setPhone2(java.lang.String value) {
        this.phone2 = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public java.lang.String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setContactName(java.lang.String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the phoneInfo property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public java.lang.String getPhoneInfo() {
        return phoneInfo;
    }

    /**
     * Sets the value of the phoneInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setPhoneInfo(java.lang.String value) {
        this.phoneInfo = value;
    }

    /**
     * Gets the value of the mainEmail property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public java.lang.String getMainEmail() {
        return mainEmail;
    }

    /**
     * Sets the value of the mainEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setMainEmail(java.lang.String value) {
        this.mainEmail = value;
    }

    /**
     * Gets the value of the ccEmail property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public java.lang.String getCcEmail() {
        return ccEmail;
    }

    /**
     * Sets the value of the ccEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setCcEmail(java.lang.String value) {
        this.ccEmail = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public java.lang.String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setExternalId(java.lang.String value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the agentId property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public java.lang.String getAgentId() {
        return agentId;
    }

    /**
     * Sets the value of the agentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setAgentId(java.lang.String value) {
        this.agentId = value;
    }

    /**
     * Gets the value of the propertyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OverseasSaleAdType.PropertyStatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public OverseasSaleAdType.PropertyStatus getPropertyStatus() {
        return propertyStatus;
    }

    /**
     * Sets the value of the propertyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverseasSaleAdType.PropertyStatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setPropertyStatus(OverseasSaleAdType.PropertyStatus value) {
        this.propertyStatus = value;
    }

    /**
     * Gets the value of the photos property.
     * 
     * @return
     *     possible object is
     *     {@link PhotosType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public PhotosType getPhotos() {
        return photos;
    }

    /**
     * Sets the value of the photos property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhotosType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setPhotos(PhotosType value) {
        this.photos = value;
    }

    /**
     * Gets the value of the features property.
     * 
     * @return
     *     possible object is
     *     {@link FeaturesType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public FeaturesType getFeatures() {
        return features;
    }

    /**
     * Sets the value of the features property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeaturesType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setFeatures(FeaturesType value) {
        this.features = value;
    }

    /**
     * Gets the value of the pdfs property.
     * 
     * @return
     *     possible object is
     *     {@link PdfsType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public PdfsType getPdfs() {
        return pdfs;
    }

    /**
     * Sets the value of the pdfs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PdfsType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setPdfs(PdfsType value) {
        this.pdfs = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public java.lang.String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            String theCountry;
            theCountry = this.getCountry();
            strategy.appendField(locator, this, "country", buffer, theCountry, (this.country!= null));
        }
        {
            java.lang.String theRegion;
            theRegion = this.getRegion();
            strategy.appendField(locator, this, "region", buffer, theRegion, (this.region!= null));
        }
        {
            java.lang.String theArea;
            theArea = this.getArea();
            strategy.appendField(locator, this, "area", buffer, theArea, (this.area!= null));
        }
        {
            java.lang.String theAddress;
            theAddress = this.getAddress();
            strategy.appendField(locator, this, "address", buffer, theAddress, (this.address!= null));
        }
        {
            PropertyType thePropertyType;
            thePropertyType = this.getPropertyType();
            strategy.appendField(locator, this, "propertyType", buffer, thePropertyType, (this.propertyType!= null));
        }
        {
            HouseType theHouseType;
            theHouseType = this.getHouseType();
            strategy.appendField(locator, this, "houseType", buffer, theHouseType, (this.houseType!= null));
        }
        {
            CommercialType theCommercialType;
            theCommercialType = this.getCommercialType();
            strategy.appendField(locator, this, "commercialType", buffer, theCommercialType, (this.commercialType!= null));
        }
        {
            java.lang.String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        {
            BigInteger thePrice;
            thePrice = this.getPrice();
            strategy.appendField(locator, this, "price", buffer, thePrice, (this.price!= null));
        }
        {
            OverseasSaleAdType.PriceType thePriceType;
            thePriceType = this.getPriceType();
            strategy.appendField(locator, this, "priceType", buffer, thePriceType, (this.priceType!= null));
        }
        {
            BigInteger theBathroomNumber;
            theBathroomNumber = this.getBathroomNumber();
            strategy.appendField(locator, this, "bathroomNumber", buffer, theBathroomNumber, (this.bathroomNumber!= null));
        }
        {
            BigInteger theBedroomNumber;
            theBedroomNumber = this.getBedroomNumber();
            strategy.appendField(locator, this, "bedroomNumber", buffer, theBedroomNumber, (this.bedroomNumber!= null));
        }
        {
            Boolean theIsNewDevelopment;
            theIsNewDevelopment = this.getIsNewDevelopment();
            strategy.appendField(locator, this, "isNewDevelopment", buffer, theIsNewDevelopment, (this.isNewDevelopment!= null));
        }
        {
            BigInteger theUnitsAvailable;
            theUnitsAvailable = this.getUnitsAvailable();
            strategy.appendField(locator, this, "unitsAvailable", buffer, theUnitsAvailable, (this.unitsAvailable!= null));
        }
        {
            java.lang.String theNewDevelopmentAvailability;
            theNewDevelopmentAvailability = this.getNewDevelopmentAvailability();
            strategy.appendField(locator, this, "newDevelopmentAvailability", buffer, theNewDevelopmentAvailability, (this.newDevelopmentAvailability!= null));
        }
        {
            BigDecimal theSquareMetres;
            theSquareMetres = this.getSquareMetres();
            strategy.appendField(locator, this, "squareMetres", buffer, theSquareMetres, (this.squareMetres!= null));
        }
        {
            BigDecimal theAcres;
            theAcres = this.getAcres();
            strategy.appendField(locator, this, "acres", buffer, theAcres, (this.acres!= null));
        }
        {
            java.lang.String theDirections;
            theDirections = this.getDirections();
            strategy.appendField(locator, this, "directions", buffer, theDirections, (this.directions!= null));
        }
        {
            java.lang.String theCo2Rating;
            theCo2Rating = this.getCo2Rating();
            strategy.appendField(locator, this, "co2Rating", buffer, theCo2Rating, (this.co2Rating!= null));
        }
        {
            java.lang.String theEnergyRating;
            theEnergyRating = this.getEnergyRating();
            strategy.appendField(locator, this, "energyRating", buffer, theEnergyRating, (this.energyRating!= null));
        }
        {
            java.lang.String theViewingDetails;
            theViewingDetails = this.getViewingDetails();
            strategy.appendField(locator, this, "viewingDetails", buffer, theViewingDetails, (this.viewingDetails!= null));
        }
        {
            java.lang.String thePhone1;
            thePhone1 = this.getPhone1();
            strategy.appendField(locator, this, "phone1", buffer, thePhone1, (this.phone1 != null));
        }
        {
            java.lang.String thePhone2;
            thePhone2 = this.getPhone2();
            strategy.appendField(locator, this, "phone2", buffer, thePhone2, (this.phone2 != null));
        }
        {
            java.lang.String theContactName;
            theContactName = this.getContactName();
            strategy.appendField(locator, this, "contactName", buffer, theContactName, (this.contactName!= null));
        }
        {
            java.lang.String thePhoneInfo;
            thePhoneInfo = this.getPhoneInfo();
            strategy.appendField(locator, this, "phoneInfo", buffer, thePhoneInfo, (this.phoneInfo!= null));
        }
        {
            java.lang.String theMainEmail;
            theMainEmail = this.getMainEmail();
            strategy.appendField(locator, this, "mainEmail", buffer, theMainEmail, (this.mainEmail!= null));
        }
        {
            java.lang.String theCcEmail;
            theCcEmail = this.getCcEmail();
            strategy.appendField(locator, this, "ccEmail", buffer, theCcEmail, (this.ccEmail!= null));
        }
        {
            java.lang.String theExternalId;
            theExternalId = this.getExternalId();
            strategy.appendField(locator, this, "externalId", buffer, theExternalId, (this.externalId!= null));
        }
        {
            java.lang.String theAgentId;
            theAgentId = this.getAgentId();
            strategy.appendField(locator, this, "agentId", buffer, theAgentId, (this.agentId!= null));
        }
        {
            OverseasSaleAdType.PropertyStatus thePropertyStatus;
            thePropertyStatus = this.getPropertyStatus();
            strategy.appendField(locator, this, "propertyStatus", buffer, thePropertyStatus, (this.propertyStatus!= null));
        }
        {
            PhotosType thePhotos;
            thePhotos = this.getPhotos();
            strategy.appendField(locator, this, "photos", buffer, thePhotos, (this.photos!= null));
        }
        {
            FeaturesType theFeatures;
            theFeatures = this.getFeatures();
            strategy.appendField(locator, this, "features", buffer, theFeatures, (this.features!= null));
        }
        {
            PdfsType thePdfs;
            thePdfs = this.getPdfs();
            strategy.appendField(locator, this, "pdfs", buffer, thePdfs, (this.pdfs!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof OverseasSaleAdType) {
            final OverseasSaleAdType copy = ((OverseasSaleAdType) draftCopy);
            {
                java.lang.Boolean countryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.country!= null));
                if (countryShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    String sourceCountry;
                    sourceCountry = this.getCountry();
                    String copyCountry = ((String) strategy.copy(LocatorUtils.property(locator, "country", sourceCountry), sourceCountry, (this.country!= null)));
                    copy.setCountry(copyCountry);
                } else {
                    if (countryShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.country = null;
                    }
                }
            }
            {
                java.lang.Boolean regionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.region!= null));
                if (regionShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    java.lang.String sourceRegion;
                    sourceRegion = this.getRegion();
                    java.lang.String copyRegion = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "region", sourceRegion), sourceRegion, (this.region!= null)));
                    copy.setRegion(copyRegion);
                } else {
                    if (regionShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.region = null;
                    }
                }
            }
            {
                java.lang.Boolean areaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.area!= null));
                if (areaShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    java.lang.String sourceArea;
                    sourceArea = this.getArea();
                    java.lang.String copyArea = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "area", sourceArea), sourceArea, (this.area!= null)));
                    copy.setArea(copyArea);
                } else {
                    if (areaShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.area = null;
                    }
                }
            }
            {
                java.lang.Boolean addressShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.address!= null));
                if (addressShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    java.lang.String sourceAddress;
                    sourceAddress = this.getAddress();
                    java.lang.String copyAddress = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "address", sourceAddress), sourceAddress, (this.address!= null)));
                    copy.setAddress(copyAddress);
                } else {
                    if (addressShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.address = null;
                    }
                }
            }
            {
                java.lang.Boolean propertyTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.propertyType!= null));
                if (propertyTypeShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    PropertyType sourcePropertyType;
                    sourcePropertyType = this.getPropertyType();
                    PropertyType copyPropertyType = ((PropertyType) strategy.copy(LocatorUtils.property(locator, "propertyType", sourcePropertyType), sourcePropertyType, (this.propertyType!= null)));
                    copy.setPropertyType(copyPropertyType);
                } else {
                    if (propertyTypeShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.propertyType = null;
                    }
                }
            }
            {
                java.lang.Boolean houseTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.houseType!= null));
                if (houseTypeShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    HouseType sourceHouseType;
                    sourceHouseType = this.getHouseType();
                    HouseType copyHouseType = ((HouseType) strategy.copy(LocatorUtils.property(locator, "houseType", sourceHouseType), sourceHouseType, (this.houseType!= null)));
                    copy.setHouseType(copyHouseType);
                } else {
                    if (houseTypeShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.houseType = null;
                    }
                }
            }
            {
                java.lang.Boolean commercialTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.commercialType!= null));
                if (commercialTypeShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    CommercialType sourceCommercialType;
                    sourceCommercialType = this.getCommercialType();
                    CommercialType copyCommercialType = ((CommercialType) strategy.copy(LocatorUtils.property(locator, "commercialType", sourceCommercialType), sourceCommercialType, (this.commercialType!= null)));
                    copy.setCommercialType(copyCommercialType);
                } else {
                    if (commercialTypeShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.commercialType = null;
                    }
                }
            }
            {
                java.lang.Boolean descriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.description!= null));
                if (descriptionShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    java.lang.String sourceDescription;
                    sourceDescription = this.getDescription();
                    java.lang.String copyDescription = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription, (this.description!= null)));
                    copy.setDescription(copyDescription);
                } else {
                    if (descriptionShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.description = null;
                    }
                }
            }
            {
                java.lang.Boolean priceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.price!= null));
                if (priceShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    BigInteger sourcePrice;
                    sourcePrice = this.getPrice();
                    BigInteger copyPrice = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "price", sourcePrice), sourcePrice, (this.price!= null)));
                    copy.setPrice(copyPrice);
                } else {
                    if (priceShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.price = null;
                    }
                }
            }
            {
                java.lang.Boolean priceTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.priceType!= null));
                if (priceTypeShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    OverseasSaleAdType.PriceType sourcePriceType;
                    sourcePriceType = this.getPriceType();
                    OverseasSaleAdType.PriceType copyPriceType = ((OverseasSaleAdType.PriceType) strategy.copy(LocatorUtils.property(locator, "priceType", sourcePriceType), sourcePriceType, (this.priceType!= null)));
                    copy.setPriceType(copyPriceType);
                } else {
                    if (priceTypeShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.priceType = null;
                    }
                }
            }
            {
                java.lang.Boolean bathroomNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bathroomNumber!= null));
                if (bathroomNumberShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    BigInteger sourceBathroomNumber;
                    sourceBathroomNumber = this.getBathroomNumber();
                    BigInteger copyBathroomNumber = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "bathroomNumber", sourceBathroomNumber), sourceBathroomNumber, (this.bathroomNumber!= null)));
                    copy.setBathroomNumber(copyBathroomNumber);
                } else {
                    if (bathroomNumberShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.bathroomNumber = null;
                    }
                }
            }
            {
                java.lang.Boolean bedroomNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bedroomNumber!= null));
                if (bedroomNumberShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    BigInteger sourceBedroomNumber;
                    sourceBedroomNumber = this.getBedroomNumber();
                    BigInteger copyBedroomNumber = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "bedroomNumber", sourceBedroomNumber), sourceBedroomNumber, (this.bedroomNumber!= null)));
                    copy.setBedroomNumber(copyBedroomNumber);
                } else {
                    if (bedroomNumberShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.bedroomNumber = null;
                    }
                }
            }
            {
                java.lang.Boolean isNewDevelopmentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isNewDevelopment!= null));
                if (isNewDevelopmentShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    Boolean sourceIsNewDevelopment;
                    sourceIsNewDevelopment = this.getIsNewDevelopment();
                    Boolean copyIsNewDevelopment = ((Boolean) strategy.copy(LocatorUtils.property(locator, "isNewDevelopment", sourceIsNewDevelopment), sourceIsNewDevelopment, (this.isNewDevelopment!= null)));
                    copy.setIsNewDevelopment(copyIsNewDevelopment);
                } else {
                    if (isNewDevelopmentShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.isNewDevelopment = null;
                    }
                }
            }
            {
                java.lang.Boolean unitsAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.unitsAvailable!= null));
                if (unitsAvailableShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    BigInteger sourceUnitsAvailable;
                    sourceUnitsAvailable = this.getUnitsAvailable();
                    BigInteger copyUnitsAvailable = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "unitsAvailable", sourceUnitsAvailable), sourceUnitsAvailable, (this.unitsAvailable!= null)));
                    copy.setUnitsAvailable(copyUnitsAvailable);
                } else {
                    if (unitsAvailableShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.unitsAvailable = null;
                    }
                }
            }
            {
                java.lang.Boolean newDevelopmentAvailabilityShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.newDevelopmentAvailability!= null));
                if (newDevelopmentAvailabilityShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    java.lang.String sourceNewDevelopmentAvailability;
                    sourceNewDevelopmentAvailability = this.getNewDevelopmentAvailability();
                    java.lang.String copyNewDevelopmentAvailability = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "newDevelopmentAvailability", sourceNewDevelopmentAvailability), sourceNewDevelopmentAvailability, (this.newDevelopmentAvailability!= null)));
                    copy.setNewDevelopmentAvailability(copyNewDevelopmentAvailability);
                } else {
                    if (newDevelopmentAvailabilityShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.newDevelopmentAvailability = null;
                    }
                }
            }
            {
                java.lang.Boolean squareMetresShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.squareMetres!= null));
                if (squareMetresShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    BigDecimal sourceSquareMetres;
                    sourceSquareMetres = this.getSquareMetres();
                    BigDecimal copySquareMetres = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "squareMetres", sourceSquareMetres), sourceSquareMetres, (this.squareMetres!= null)));
                    copy.setSquareMetres(copySquareMetres);
                } else {
                    if (squareMetresShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.squareMetres = null;
                    }
                }
            }
            {
                java.lang.Boolean acresShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.acres!= null));
                if (acresShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    BigDecimal sourceAcres;
                    sourceAcres = this.getAcres();
                    BigDecimal copyAcres = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "acres", sourceAcres), sourceAcres, (this.acres!= null)));
                    copy.setAcres(copyAcres);
                } else {
                    if (acresShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.acres = null;
                    }
                }
            }
            {
                java.lang.Boolean directionsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.directions!= null));
                if (directionsShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    java.lang.String sourceDirections;
                    sourceDirections = this.getDirections();
                    java.lang.String copyDirections = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "directions", sourceDirections), sourceDirections, (this.directions!= null)));
                    copy.setDirections(copyDirections);
                } else {
                    if (directionsShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.directions = null;
                    }
                }
            }
            {
                java.lang.Boolean co2RatingShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.co2Rating!= null));
                if (co2RatingShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    java.lang.String sourceCo2Rating;
                    sourceCo2Rating = this.getCo2Rating();
                    java.lang.String copyCo2Rating = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "co2Rating", sourceCo2Rating), sourceCo2Rating, (this.co2Rating!= null)));
                    copy.setCo2Rating(copyCo2Rating);
                } else {
                    if (co2RatingShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.co2Rating = null;
                    }
                }
            }
            {
                java.lang.Boolean energyRatingShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energyRating!= null));
                if (energyRatingShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    java.lang.String sourceEnergyRating;
                    sourceEnergyRating = this.getEnergyRating();
                    java.lang.String copyEnergyRating = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "energyRating", sourceEnergyRating), sourceEnergyRating, (this.energyRating!= null)));
                    copy.setEnergyRating(copyEnergyRating);
                } else {
                    if (energyRatingShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.energyRating = null;
                    }
                }
            }
            {
                java.lang.Boolean viewingDetailsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.viewingDetails!= null));
                if (viewingDetailsShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    java.lang.String sourceViewingDetails;
                    sourceViewingDetails = this.getViewingDetails();
                    java.lang.String copyViewingDetails = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "viewingDetails", sourceViewingDetails), sourceViewingDetails, (this.viewingDetails!= null)));
                    copy.setViewingDetails(copyViewingDetails);
                } else {
                    if (viewingDetailsShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.viewingDetails = null;
                    }
                }
            }
            {
                java.lang.Boolean phone1ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.phone1 != null));
                if (phone1ShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    java.lang.String sourcePhone1;
                    sourcePhone1 = this.getPhone1();
                    java.lang.String copyPhone1 = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "phone1", sourcePhone1), sourcePhone1, (this.phone1 != null)));
                    copy.setPhone1(copyPhone1);
                } else {
                    if (phone1ShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.phone1 = null;
                    }
                }
            }
            {
                java.lang.Boolean phone2ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.phone2 != null));
                if (phone2ShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    java.lang.String sourcePhone2;
                    sourcePhone2 = this.getPhone2();
                    java.lang.String copyPhone2 = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "phone2", sourcePhone2), sourcePhone2, (this.phone2 != null)));
                    copy.setPhone2(copyPhone2);
                } else {
                    if (phone2ShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.phone2 = null;
                    }
                }
            }
            {
                java.lang.Boolean contactNameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.contactName!= null));
                if (contactNameShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    java.lang.String sourceContactName;
                    sourceContactName = this.getContactName();
                    java.lang.String copyContactName = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "contactName", sourceContactName), sourceContactName, (this.contactName!= null)));
                    copy.setContactName(copyContactName);
                } else {
                    if (contactNameShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.contactName = null;
                    }
                }
            }
            {
                java.lang.Boolean phoneInfoShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.phoneInfo!= null));
                if (phoneInfoShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    java.lang.String sourcePhoneInfo;
                    sourcePhoneInfo = this.getPhoneInfo();
                    java.lang.String copyPhoneInfo = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "phoneInfo", sourcePhoneInfo), sourcePhoneInfo, (this.phoneInfo!= null)));
                    copy.setPhoneInfo(copyPhoneInfo);
                } else {
                    if (phoneInfoShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.phoneInfo = null;
                    }
                }
            }
            {
                java.lang.Boolean mainEmailShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mainEmail!= null));
                if (mainEmailShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    java.lang.String sourceMainEmail;
                    sourceMainEmail = this.getMainEmail();
                    java.lang.String copyMainEmail = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "mainEmail", sourceMainEmail), sourceMainEmail, (this.mainEmail!= null)));
                    copy.setMainEmail(copyMainEmail);
                } else {
                    if (mainEmailShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.mainEmail = null;
                    }
                }
            }
            {
                java.lang.Boolean ccEmailShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ccEmail!= null));
                if (ccEmailShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    java.lang.String sourceCcEmail;
                    sourceCcEmail = this.getCcEmail();
                    java.lang.String copyCcEmail = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "ccEmail", sourceCcEmail), sourceCcEmail, (this.ccEmail!= null)));
                    copy.setCcEmail(copyCcEmail);
                } else {
                    if (ccEmailShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.ccEmail = null;
                    }
                }
            }
            {
                java.lang.Boolean externalIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.externalId!= null));
                if (externalIdShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    java.lang.String sourceExternalId;
                    sourceExternalId = this.getExternalId();
                    java.lang.String copyExternalId = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "externalId", sourceExternalId), sourceExternalId, (this.externalId!= null)));
                    copy.setExternalId(copyExternalId);
                } else {
                    if (externalIdShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.externalId = null;
                    }
                }
            }
            {
                java.lang.Boolean agentIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.agentId!= null));
                if (agentIdShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    java.lang.String sourceAgentId;
                    sourceAgentId = this.getAgentId();
                    java.lang.String copyAgentId = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "agentId", sourceAgentId), sourceAgentId, (this.agentId!= null)));
                    copy.setAgentId(copyAgentId);
                } else {
                    if (agentIdShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.agentId = null;
                    }
                }
            }
            {
                java.lang.Boolean propertyStatusShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.propertyStatus!= null));
                if (propertyStatusShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    OverseasSaleAdType.PropertyStatus sourcePropertyStatus;
                    sourcePropertyStatus = this.getPropertyStatus();
                    OverseasSaleAdType.PropertyStatus copyPropertyStatus = ((OverseasSaleAdType.PropertyStatus) strategy.copy(LocatorUtils.property(locator, "propertyStatus", sourcePropertyStatus), sourcePropertyStatus, (this.propertyStatus!= null)));
                    copy.setPropertyStatus(copyPropertyStatus);
                } else {
                    if (propertyStatusShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.propertyStatus = null;
                    }
                }
            }
            {
                java.lang.Boolean photosShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.photos!= null));
                if (photosShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    PhotosType sourcePhotos;
                    sourcePhotos = this.getPhotos();
                    PhotosType copyPhotos = ((PhotosType) strategy.copy(LocatorUtils.property(locator, "photos", sourcePhotos), sourcePhotos, (this.photos!= null)));
                    copy.setPhotos(copyPhotos);
                } else {
                    if (photosShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.photos = null;
                    }
                }
            }
            {
                java.lang.Boolean featuresShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.features!= null));
                if (featuresShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    FeaturesType sourceFeatures;
                    sourceFeatures = this.getFeatures();
                    FeaturesType copyFeatures = ((FeaturesType) strategy.copy(LocatorUtils.property(locator, "features", sourceFeatures), sourceFeatures, (this.features!= null)));
                    copy.setFeatures(copyFeatures);
                } else {
                    if (featuresShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.features = null;
                    }
                }
            }
            {
                java.lang.Boolean pdfsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pdfs!= null));
                if (pdfsShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    PdfsType sourcePdfs;
                    sourcePdfs = this.getPdfs();
                    PdfsType copyPdfs = ((PdfsType) strategy.copy(LocatorUtils.property(locator, "pdfs", sourcePdfs), sourcePdfs, (this.pdfs!= null)));
                    copy.setPdfs(copyPdfs);
                } else {
                    if (pdfsShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.pdfs = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new OverseasSaleAdType();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OverseasSaleAdType that = ((OverseasSaleAdType) object);
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
            java.lang.String lhsRegion;
            lhsRegion = this.getRegion();
            java.lang.String rhsRegion;
            rhsRegion = that.getRegion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "region", lhsRegion), LocatorUtils.property(thatLocator, "region", rhsRegion), lhsRegion, rhsRegion, (this.region!= null), (that.region!= null))) {
                return false;
            }
        }
        {
            java.lang.String lhsArea;
            lhsArea = this.getArea();
            java.lang.String rhsArea;
            rhsArea = that.getArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "area", lhsArea), LocatorUtils.property(thatLocator, "area", rhsArea), lhsArea, rhsArea, (this.area!= null), (that.area!= null))) {
                return false;
            }
        }
        {
            java.lang.String lhsAddress;
            lhsAddress = this.getAddress();
            java.lang.String rhsAddress;
            rhsAddress = that.getAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "address", lhsAddress), LocatorUtils.property(thatLocator, "address", rhsAddress), lhsAddress, rhsAddress, (this.address!= null), (that.address!= null))) {
                return false;
            }
        }
        {
            PropertyType lhsPropertyType;
            lhsPropertyType = this.getPropertyType();
            PropertyType rhsPropertyType;
            rhsPropertyType = that.getPropertyType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "propertyType", lhsPropertyType), LocatorUtils.property(thatLocator, "propertyType", rhsPropertyType), lhsPropertyType, rhsPropertyType, (this.propertyType!= null), (that.propertyType!= null))) {
                return false;
            }
        }
        {
            HouseType lhsHouseType;
            lhsHouseType = this.getHouseType();
            HouseType rhsHouseType;
            rhsHouseType = that.getHouseType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "houseType", lhsHouseType), LocatorUtils.property(thatLocator, "houseType", rhsHouseType), lhsHouseType, rhsHouseType, (this.houseType!= null), (that.houseType!= null))) {
                return false;
            }
        }
        {
            CommercialType lhsCommercialType;
            lhsCommercialType = this.getCommercialType();
            CommercialType rhsCommercialType;
            rhsCommercialType = that.getCommercialType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "commercialType", lhsCommercialType), LocatorUtils.property(thatLocator, "commercialType", rhsCommercialType), lhsCommercialType, rhsCommercialType, (this.commercialType!= null), (that.commercialType!= null))) {
                return false;
            }
        }
        {
            java.lang.String lhsDescription;
            lhsDescription = this.getDescription();
            java.lang.String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, (this.description!= null), (that.description!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsPrice;
            lhsPrice = this.getPrice();
            BigInteger rhsPrice;
            rhsPrice = that.getPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "price", lhsPrice), LocatorUtils.property(thatLocator, "price", rhsPrice), lhsPrice, rhsPrice, (this.price!= null), (that.price!= null))) {
                return false;
            }
        }
        {
            OverseasSaleAdType.PriceType lhsPriceType;
            lhsPriceType = this.getPriceType();
            OverseasSaleAdType.PriceType rhsPriceType;
            rhsPriceType = that.getPriceType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priceType", lhsPriceType), LocatorUtils.property(thatLocator, "priceType", rhsPriceType), lhsPriceType, rhsPriceType, (this.priceType!= null), (that.priceType!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsBathroomNumber;
            lhsBathroomNumber = this.getBathroomNumber();
            BigInteger rhsBathroomNumber;
            rhsBathroomNumber = that.getBathroomNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bathroomNumber", lhsBathroomNumber), LocatorUtils.property(thatLocator, "bathroomNumber", rhsBathroomNumber), lhsBathroomNumber, rhsBathroomNumber, (this.bathroomNumber!= null), (that.bathroomNumber!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsBedroomNumber;
            lhsBedroomNumber = this.getBedroomNumber();
            BigInteger rhsBedroomNumber;
            rhsBedroomNumber = that.getBedroomNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bedroomNumber", lhsBedroomNumber), LocatorUtils.property(thatLocator, "bedroomNumber", rhsBedroomNumber), lhsBedroomNumber, rhsBedroomNumber, (this.bedroomNumber!= null), (that.bedroomNumber!= null))) {
                return false;
            }
        }
        {
            Boolean lhsIsNewDevelopment;
            lhsIsNewDevelopment = this.getIsNewDevelopment();
            Boolean rhsIsNewDevelopment;
            rhsIsNewDevelopment = that.getIsNewDevelopment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isNewDevelopment", lhsIsNewDevelopment), LocatorUtils.property(thatLocator, "isNewDevelopment", rhsIsNewDevelopment), lhsIsNewDevelopment, rhsIsNewDevelopment, (this.isNewDevelopment!= null), (that.isNewDevelopment!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsUnitsAvailable;
            lhsUnitsAvailable = this.getUnitsAvailable();
            BigInteger rhsUnitsAvailable;
            rhsUnitsAvailable = that.getUnitsAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitsAvailable", lhsUnitsAvailable), LocatorUtils.property(thatLocator, "unitsAvailable", rhsUnitsAvailable), lhsUnitsAvailable, rhsUnitsAvailable, (this.unitsAvailable!= null), (that.unitsAvailable!= null))) {
                return false;
            }
        }
        {
            java.lang.String lhsNewDevelopmentAvailability;
            lhsNewDevelopmentAvailability = this.getNewDevelopmentAvailability();
            java.lang.String rhsNewDevelopmentAvailability;
            rhsNewDevelopmentAvailability = that.getNewDevelopmentAvailability();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "newDevelopmentAvailability", lhsNewDevelopmentAvailability), LocatorUtils.property(thatLocator, "newDevelopmentAvailability", rhsNewDevelopmentAvailability), lhsNewDevelopmentAvailability, rhsNewDevelopmentAvailability, (this.newDevelopmentAvailability!= null), (that.newDevelopmentAvailability!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsSquareMetres;
            lhsSquareMetres = this.getSquareMetres();
            BigDecimal rhsSquareMetres;
            rhsSquareMetres = that.getSquareMetres();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "squareMetres", lhsSquareMetres), LocatorUtils.property(thatLocator, "squareMetres", rhsSquareMetres), lhsSquareMetres, rhsSquareMetres, (this.squareMetres!= null), (that.squareMetres!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsAcres;
            lhsAcres = this.getAcres();
            BigDecimal rhsAcres;
            rhsAcres = that.getAcres();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "acres", lhsAcres), LocatorUtils.property(thatLocator, "acres", rhsAcres), lhsAcres, rhsAcres, (this.acres!= null), (that.acres!= null))) {
                return false;
            }
        }
        {
            java.lang.String lhsDirections;
            lhsDirections = this.getDirections();
            java.lang.String rhsDirections;
            rhsDirections = that.getDirections();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "directions", lhsDirections), LocatorUtils.property(thatLocator, "directions", rhsDirections), lhsDirections, rhsDirections, (this.directions!= null), (that.directions!= null))) {
                return false;
            }
        }
        {
            java.lang.String lhsCo2Rating;
            lhsCo2Rating = this.getCo2Rating();
            java.lang.String rhsCo2Rating;
            rhsCo2Rating = that.getCo2Rating();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "co2Rating", lhsCo2Rating), LocatorUtils.property(thatLocator, "co2Rating", rhsCo2Rating), lhsCo2Rating, rhsCo2Rating, (this.co2Rating!= null), (that.co2Rating!= null))) {
                return false;
            }
        }
        {
            java.lang.String lhsEnergyRating;
            lhsEnergyRating = this.getEnergyRating();
            java.lang.String rhsEnergyRating;
            rhsEnergyRating = that.getEnergyRating();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energyRating", lhsEnergyRating), LocatorUtils.property(thatLocator, "energyRating", rhsEnergyRating), lhsEnergyRating, rhsEnergyRating, (this.energyRating!= null), (that.energyRating!= null))) {
                return false;
            }
        }
        {
            java.lang.String lhsViewingDetails;
            lhsViewingDetails = this.getViewingDetails();
            java.lang.String rhsViewingDetails;
            rhsViewingDetails = that.getViewingDetails();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "viewingDetails", lhsViewingDetails), LocatorUtils.property(thatLocator, "viewingDetails", rhsViewingDetails), lhsViewingDetails, rhsViewingDetails, (this.viewingDetails!= null), (that.viewingDetails!= null))) {
                return false;
            }
        }
        {
            java.lang.String lhsPhone1;
            lhsPhone1 = this.getPhone1();
            java.lang.String rhsPhone1;
            rhsPhone1 = that.getPhone1();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "phone1", lhsPhone1), LocatorUtils.property(thatLocator, "phone1", rhsPhone1), lhsPhone1, rhsPhone1, (this.phone1 != null), (that.phone1 != null))) {
                return false;
            }
        }
        {
            java.lang.String lhsPhone2;
            lhsPhone2 = this.getPhone2();
            java.lang.String rhsPhone2;
            rhsPhone2 = that.getPhone2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "phone2", lhsPhone2), LocatorUtils.property(thatLocator, "phone2", rhsPhone2), lhsPhone2, rhsPhone2, (this.phone2 != null), (that.phone2 != null))) {
                return false;
            }
        }
        {
            java.lang.String lhsContactName;
            lhsContactName = this.getContactName();
            java.lang.String rhsContactName;
            rhsContactName = that.getContactName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactName", lhsContactName), LocatorUtils.property(thatLocator, "contactName", rhsContactName), lhsContactName, rhsContactName, (this.contactName!= null), (that.contactName!= null))) {
                return false;
            }
        }
        {
            java.lang.String lhsPhoneInfo;
            lhsPhoneInfo = this.getPhoneInfo();
            java.lang.String rhsPhoneInfo;
            rhsPhoneInfo = that.getPhoneInfo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "phoneInfo", lhsPhoneInfo), LocatorUtils.property(thatLocator, "phoneInfo", rhsPhoneInfo), lhsPhoneInfo, rhsPhoneInfo, (this.phoneInfo!= null), (that.phoneInfo!= null))) {
                return false;
            }
        }
        {
            java.lang.String lhsMainEmail;
            lhsMainEmail = this.getMainEmail();
            java.lang.String rhsMainEmail;
            rhsMainEmail = that.getMainEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mainEmail", lhsMainEmail), LocatorUtils.property(thatLocator, "mainEmail", rhsMainEmail), lhsMainEmail, rhsMainEmail, (this.mainEmail!= null), (that.mainEmail!= null))) {
                return false;
            }
        }
        {
            java.lang.String lhsCcEmail;
            lhsCcEmail = this.getCcEmail();
            java.lang.String rhsCcEmail;
            rhsCcEmail = that.getCcEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ccEmail", lhsCcEmail), LocatorUtils.property(thatLocator, "ccEmail", rhsCcEmail), lhsCcEmail, rhsCcEmail, (this.ccEmail!= null), (that.ccEmail!= null))) {
                return false;
            }
        }
        {
            java.lang.String lhsExternalId;
            lhsExternalId = this.getExternalId();
            java.lang.String rhsExternalId;
            rhsExternalId = that.getExternalId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "externalId", lhsExternalId), LocatorUtils.property(thatLocator, "externalId", rhsExternalId), lhsExternalId, rhsExternalId, (this.externalId!= null), (that.externalId!= null))) {
                return false;
            }
        }
        {
            java.lang.String lhsAgentId;
            lhsAgentId = this.getAgentId();
            java.lang.String rhsAgentId;
            rhsAgentId = that.getAgentId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "agentId", lhsAgentId), LocatorUtils.property(thatLocator, "agentId", rhsAgentId), lhsAgentId, rhsAgentId, (this.agentId!= null), (that.agentId!= null))) {
                return false;
            }
        }
        {
            OverseasSaleAdType.PropertyStatus lhsPropertyStatus;
            lhsPropertyStatus = this.getPropertyStatus();
            OverseasSaleAdType.PropertyStatus rhsPropertyStatus;
            rhsPropertyStatus = that.getPropertyStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "propertyStatus", lhsPropertyStatus), LocatorUtils.property(thatLocator, "propertyStatus", rhsPropertyStatus), lhsPropertyStatus, rhsPropertyStatus, (this.propertyStatus!= null), (that.propertyStatus!= null))) {
                return false;
            }
        }
        {
            PhotosType lhsPhotos;
            lhsPhotos = this.getPhotos();
            PhotosType rhsPhotos;
            rhsPhotos = that.getPhotos();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "photos", lhsPhotos), LocatorUtils.property(thatLocator, "photos", rhsPhotos), lhsPhotos, rhsPhotos, (this.photos!= null), (that.photos!= null))) {
                return false;
            }
        }
        {
            FeaturesType lhsFeatures;
            lhsFeatures = this.getFeatures();
            FeaturesType rhsFeatures;
            rhsFeatures = that.getFeatures();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "features", lhsFeatures), LocatorUtils.property(thatLocator, "features", rhsFeatures), lhsFeatures, rhsFeatures, (this.features!= null), (that.features!= null))) {
                return false;
            }
        }
        {
            PdfsType lhsPdfs;
            lhsPdfs = this.getPdfs();
            PdfsType rhsPdfs;
            rhsPdfs = that.getPdfs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pdfs", lhsPdfs), LocatorUtils.property(thatLocator, "pdfs", rhsPdfs), lhsPdfs, rhsPdfs, (this.pdfs!= null), (that.pdfs!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="region"/&gt;
     *     &lt;enumeration value="excess"/&gt;
     *     &lt;enumeration value="from"/&gt;
     *     &lt;enumeration value="on application"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public enum PriceType {

        @XmlEnumValue("region")
        REGION("region"),
        @XmlEnumValue("excess")
        EXCESS("excess"),
        @XmlEnumValue("from")
        FROM("from"),
        @XmlEnumValue("on application")
        ON_APPLICATION("on application");
        private final java.lang.String value;

        PriceType(java.lang.String v) {
            value = v;
        }

        public java.lang.String value() {
            return value;
        }

        public static OverseasSaleAdType.PriceType fromValue(java.lang.String v) {
            for (OverseasSaleAdType.PriceType c: OverseasSaleAdType.PriceType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="for-sale"/&gt;
     *     &lt;enumeration value="sale-agreed"/&gt;
     *     &lt;enumeration value="sold"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public enum PropertyStatus {

        @XmlEnumValue("for-sale")
        FOR_SALE("for-sale"),
        @XmlEnumValue("sale-agreed")
        SALE_AGREED("sale-agreed"),
        @XmlEnumValue("sold")
        SOLD("sold");
        private final java.lang.String value;

        PropertyStatus(java.lang.String v) {
            value = v;
        }

        public java.lang.String value() {
            return value;
        }

        public static OverseasSaleAdType.PropertyStatus fromValue(java.lang.String v) {
            for (OverseasSaleAdType.PropertyStatus c: OverseasSaleAdType.PropertyStatus.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
