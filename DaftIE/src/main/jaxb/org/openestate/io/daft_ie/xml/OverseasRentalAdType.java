
package org.openestate.io.daft_ie.xml;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Calendar;
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
 * <p>Java class for overseasRentalAdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="overseasRentalAdType"&gt;
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
 *         &lt;element name="rent" type="{}positiveInteger"/&gt;
 *         &lt;element name="rent_collection_period"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="weekly"/&gt;
 *               &lt;enumeration value="monthly"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="bathroom_number" type="{}positiveInteger"/&gt;
 *         &lt;element name="bedroom_number" type="{}positiveInteger"/&gt;
 *         &lt;element name="furnished"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="furnished"/&gt;
 *               &lt;enumeration value="unfurnished"/&gt;
 *               &lt;enumeration value="either"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cable_television" type="{}bool"/&gt;
 *         &lt;element name="washing_machine" type="{}bool"/&gt;
 *         &lt;element name="dryer" type="{}bool"/&gt;
 *         &lt;element name="dishwasher" type="{}bool"/&gt;
 *         &lt;element name="microwave" type="{}bool"/&gt;
 *         &lt;element name="single_beds" type="{}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="double_beds" type="{}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="twin_beds" type="{}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="number_people" type="{}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="available_from" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="lease" type="{}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="phone1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="phone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contact_name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="phone_info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="main_email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cc_email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="external_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="agent_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="photos" type="{}photosType" minOccurs="0"/&gt;
 *         &lt;element name="features" type="{}featuresType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "overseasRentalAdType", propOrder = {
    "country",
    "region",
    "area",
    "address",
    "propertyType",
    "houseType",
    "commercialType",
    "description",
    "rent",
    "rentCollectionPeriod",
    "bathroomNumber",
    "bedroomNumber",
    "furnished",
    "cableTelevision",
    "washingMachine",
    "dryer",
    "dishwasher",
    "microwave",
    "singleBeds",
    "doubleBeds",
    "twinBeds",
    "numberPeople",
    "availableFrom",
    "lease",
    "phone1",
    "phone2",
    "contactName",
    "phoneInfo",
    "mainEmail",
    "ccEmail",
    "externalId",
    "agentId",
    "photos",
    "features"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
public class OverseasRentalAdType implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true, type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
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
    protected BigInteger rent;
    @XmlElement(name = "rent_collection_period", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected OverseasRentalAdType.RentPeriod rentCollectionPeriod;
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
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected OverseasRentalAdType.Furnished furnished;
    @XmlElement(name = "cable_television", required = true, type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean cableTelevision;
    @XmlElement(name = "washing_machine", required = true, type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean washingMachine;
    @XmlElement(required = true, type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean dryer;
    @XmlElement(required = true, type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean dishwasher;
    @XmlElement(required = true, type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean microwave;
    @XmlElement(name = "single_beds", type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter6 .class)
    @XmlSchemaType(name = "integer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected BigInteger singleBeds;
    @XmlElement(name = "double_beds", type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter6 .class)
    @XmlSchemaType(name = "integer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected BigInteger doubleBeds;
    @XmlElement(name = "twin_beds", type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter6 .class)
    @XmlSchemaType(name = "integer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected BigInteger twinBeds;
    @XmlElement(name = "number_people", type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter6 .class)
    @XmlSchemaType(name = "integer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected BigInteger numberPeople;
    @XmlElement(name = "available_from", type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected Calendar availableFrom;
    @XmlElement(type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter6 .class)
    @XmlSchemaType(name = "integer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected BigInteger lease;
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected PhotosType photos;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    protected FeaturesType features;

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
     * Gets the value of the rent property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public BigInteger getRent() {
        return rent;
    }

    /**
     * Sets the value of the rent property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setRent(BigInteger value) {
        this.rent = value;
    }

    /**
     * Gets the value of the rentCollectionPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link OverseasRentalAdType.RentPeriod }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public OverseasRentalAdType.RentPeriod getRentCollectionPeriod() {
        return rentCollectionPeriod;
    }

    /**
     * Sets the value of the rentCollectionPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverseasRentalAdType.RentPeriod }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setRentCollectionPeriod(OverseasRentalAdType.RentPeriod value) {
        this.rentCollectionPeriod = value;
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
     * Gets the value of the furnished property.
     * 
     * @return
     *     possible object is
     *     {@link OverseasRentalAdType.Furnished }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public OverseasRentalAdType.Furnished getFurnished() {
        return furnished;
    }

    /**
     * Sets the value of the furnished property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverseasRentalAdType.Furnished }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setFurnished(OverseasRentalAdType.Furnished value) {
        this.furnished = value;
    }

    /**
     * Gets the value of the cableTelevision property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getCableTelevision() {
        return cableTelevision;
    }

    /**
     * Sets the value of the cableTelevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setCableTelevision(Boolean value) {
        this.cableTelevision = value;
    }

    /**
     * Gets the value of the washingMachine property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getWashingMachine() {
        return washingMachine;
    }

    /**
     * Sets the value of the washingMachine property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setWashingMachine(Boolean value) {
        this.washingMachine = value;
    }

    /**
     * Gets the value of the dryer property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getDryer() {
        return dryer;
    }

    /**
     * Sets the value of the dryer property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setDryer(Boolean value) {
        this.dryer = value;
    }

    /**
     * Gets the value of the dishwasher property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getDishwasher() {
        return dishwasher;
    }

    /**
     * Sets the value of the dishwasher property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setDishwasher(Boolean value) {
        this.dishwasher = value;
    }

    /**
     * Gets the value of the microwave property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getMicrowave() {
        return microwave;
    }

    /**
     * Sets the value of the microwave property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setMicrowave(Boolean value) {
        this.microwave = value;
    }

    /**
     * Gets the value of the singleBeds property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public BigInteger getSingleBeds() {
        return singleBeds;
    }

    /**
     * Sets the value of the singleBeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setSingleBeds(BigInteger value) {
        this.singleBeds = value;
    }

    /**
     * Gets the value of the doubleBeds property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public BigInteger getDoubleBeds() {
        return doubleBeds;
    }

    /**
     * Sets the value of the doubleBeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setDoubleBeds(BigInteger value) {
        this.doubleBeds = value;
    }

    /**
     * Gets the value of the twinBeds property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public BigInteger getTwinBeds() {
        return twinBeds;
    }

    /**
     * Sets the value of the twinBeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setTwinBeds(BigInteger value) {
        this.twinBeds = value;
    }

    /**
     * Gets the value of the numberPeople property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public BigInteger getNumberPeople() {
        return numberPeople;
    }

    /**
     * Sets the value of the numberPeople property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setNumberPeople(BigInteger value) {
        this.numberPeople = value;
    }

    /**
     * Gets the value of the availableFrom property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public Calendar getAvailableFrom() {
        return availableFrom;
    }

    /**
     * Sets the value of the availableFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setAvailableFrom(Calendar value) {
        this.availableFrom = value;
    }

    /**
     * Gets the value of the lease property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public BigInteger getLease() {
        return lease;
    }

    /**
     * Sets the value of the lease property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public void setLease(BigInteger value) {
        this.lease = value;
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
            BigInteger theRent;
            theRent = this.getRent();
            strategy.appendField(locator, this, "rent", buffer, theRent, (this.rent!= null));
        }
        {
            OverseasRentalAdType.RentPeriod theRentCollectionPeriod;
            theRentCollectionPeriod = this.getRentCollectionPeriod();
            strategy.appendField(locator, this, "rentCollectionPeriod", buffer, theRentCollectionPeriod, (this.rentCollectionPeriod!= null));
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
            OverseasRentalAdType.Furnished theFurnished;
            theFurnished = this.getFurnished();
            strategy.appendField(locator, this, "furnished", buffer, theFurnished, (this.furnished!= null));
        }
        {
            Boolean theCableTelevision;
            theCableTelevision = this.getCableTelevision();
            strategy.appendField(locator, this, "cableTelevision", buffer, theCableTelevision, (this.cableTelevision!= null));
        }
        {
            Boolean theWashingMachine;
            theWashingMachine = this.getWashingMachine();
            strategy.appendField(locator, this, "washingMachine", buffer, theWashingMachine, (this.washingMachine!= null));
        }
        {
            Boolean theDryer;
            theDryer = this.getDryer();
            strategy.appendField(locator, this, "dryer", buffer, theDryer, (this.dryer!= null));
        }
        {
            Boolean theDishwasher;
            theDishwasher = this.getDishwasher();
            strategy.appendField(locator, this, "dishwasher", buffer, theDishwasher, (this.dishwasher!= null));
        }
        {
            Boolean theMicrowave;
            theMicrowave = this.getMicrowave();
            strategy.appendField(locator, this, "microwave", buffer, theMicrowave, (this.microwave!= null));
        }
        {
            BigInteger theSingleBeds;
            theSingleBeds = this.getSingleBeds();
            strategy.appendField(locator, this, "singleBeds", buffer, theSingleBeds, (this.singleBeds!= null));
        }
        {
            BigInteger theDoubleBeds;
            theDoubleBeds = this.getDoubleBeds();
            strategy.appendField(locator, this, "doubleBeds", buffer, theDoubleBeds, (this.doubleBeds!= null));
        }
        {
            BigInteger theTwinBeds;
            theTwinBeds = this.getTwinBeds();
            strategy.appendField(locator, this, "twinBeds", buffer, theTwinBeds, (this.twinBeds!= null));
        }
        {
            BigInteger theNumberPeople;
            theNumberPeople = this.getNumberPeople();
            strategy.appendField(locator, this, "numberPeople", buffer, theNumberPeople, (this.numberPeople!= null));
        }
        {
            Calendar theAvailableFrom;
            theAvailableFrom = this.getAvailableFrom();
            strategy.appendField(locator, this, "availableFrom", buffer, theAvailableFrom, (this.availableFrom!= null));
        }
        {
            BigInteger theLease;
            theLease = this.getLease();
            strategy.appendField(locator, this, "lease", buffer, theLease, (this.lease!= null));
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
            PhotosType thePhotos;
            thePhotos = this.getPhotos();
            strategy.appendField(locator, this, "photos", buffer, thePhotos, (this.photos!= null));
        }
        {
            FeaturesType theFeatures;
            theFeatures = this.getFeatures();
            strategy.appendField(locator, this, "features", buffer, theFeatures, (this.features!= null));
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
        if (draftCopy instanceof OverseasRentalAdType) {
            final OverseasRentalAdType copy = ((OverseasRentalAdType) draftCopy);
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
                java.lang.Boolean rentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.rent!= null));
                if (rentShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    BigInteger sourceRent;
                    sourceRent = this.getRent();
                    BigInteger copyRent = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "rent", sourceRent), sourceRent, (this.rent!= null)));
                    copy.setRent(copyRent);
                } else {
                    if (rentShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.rent = null;
                    }
                }
            }
            {
                java.lang.Boolean rentCollectionPeriodShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.rentCollectionPeriod!= null));
                if (rentCollectionPeriodShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    OverseasRentalAdType.RentPeriod sourceRentCollectionPeriod;
                    sourceRentCollectionPeriod = this.getRentCollectionPeriod();
                    OverseasRentalAdType.RentPeriod copyRentCollectionPeriod = ((OverseasRentalAdType.RentPeriod) strategy.copy(LocatorUtils.property(locator, "rentCollectionPeriod", sourceRentCollectionPeriod), sourceRentCollectionPeriod, (this.rentCollectionPeriod!= null)));
                    copy.setRentCollectionPeriod(copyRentCollectionPeriod);
                } else {
                    if (rentCollectionPeriodShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.rentCollectionPeriod = null;
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
                java.lang.Boolean furnishedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.furnished!= null));
                if (furnishedShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    OverseasRentalAdType.Furnished sourceFurnished;
                    sourceFurnished = this.getFurnished();
                    OverseasRentalAdType.Furnished copyFurnished = ((OverseasRentalAdType.Furnished) strategy.copy(LocatorUtils.property(locator, "furnished", sourceFurnished), sourceFurnished, (this.furnished!= null)));
                    copy.setFurnished(copyFurnished);
                } else {
                    if (furnishedShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.furnished = null;
                    }
                }
            }
            {
                java.lang.Boolean cableTelevisionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.cableTelevision!= null));
                if (cableTelevisionShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    Boolean sourceCableTelevision;
                    sourceCableTelevision = this.getCableTelevision();
                    Boolean copyCableTelevision = ((Boolean) strategy.copy(LocatorUtils.property(locator, "cableTelevision", sourceCableTelevision), sourceCableTelevision, (this.cableTelevision!= null)));
                    copy.setCableTelevision(copyCableTelevision);
                } else {
                    if (cableTelevisionShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.cableTelevision = null;
                    }
                }
            }
            {
                java.lang.Boolean washingMachineShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.washingMachine!= null));
                if (washingMachineShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    Boolean sourceWashingMachine;
                    sourceWashingMachine = this.getWashingMachine();
                    Boolean copyWashingMachine = ((Boolean) strategy.copy(LocatorUtils.property(locator, "washingMachine", sourceWashingMachine), sourceWashingMachine, (this.washingMachine!= null)));
                    copy.setWashingMachine(copyWashingMachine);
                } else {
                    if (washingMachineShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.washingMachine = null;
                    }
                }
            }
            {
                java.lang.Boolean dryerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dryer!= null));
                if (dryerShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    Boolean sourceDryer;
                    sourceDryer = this.getDryer();
                    Boolean copyDryer = ((Boolean) strategy.copy(LocatorUtils.property(locator, "dryer", sourceDryer), sourceDryer, (this.dryer!= null)));
                    copy.setDryer(copyDryer);
                } else {
                    if (dryerShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.dryer = null;
                    }
                }
            }
            {
                java.lang.Boolean dishwasherShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dishwasher!= null));
                if (dishwasherShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    Boolean sourceDishwasher;
                    sourceDishwasher = this.getDishwasher();
                    Boolean copyDishwasher = ((Boolean) strategy.copy(LocatorUtils.property(locator, "dishwasher", sourceDishwasher), sourceDishwasher, (this.dishwasher!= null)));
                    copy.setDishwasher(copyDishwasher);
                } else {
                    if (dishwasherShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.dishwasher = null;
                    }
                }
            }
            {
                java.lang.Boolean microwaveShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.microwave!= null));
                if (microwaveShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    Boolean sourceMicrowave;
                    sourceMicrowave = this.getMicrowave();
                    Boolean copyMicrowave = ((Boolean) strategy.copy(LocatorUtils.property(locator, "microwave", sourceMicrowave), sourceMicrowave, (this.microwave!= null)));
                    copy.setMicrowave(copyMicrowave);
                } else {
                    if (microwaveShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.microwave = null;
                    }
                }
            }
            {
                java.lang.Boolean singleBedsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.singleBeds!= null));
                if (singleBedsShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    BigInteger sourceSingleBeds;
                    sourceSingleBeds = this.getSingleBeds();
                    BigInteger copySingleBeds = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "singleBeds", sourceSingleBeds), sourceSingleBeds, (this.singleBeds!= null)));
                    copy.setSingleBeds(copySingleBeds);
                } else {
                    if (singleBedsShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.singleBeds = null;
                    }
                }
            }
            {
                java.lang.Boolean doubleBedsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.doubleBeds!= null));
                if (doubleBedsShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    BigInteger sourceDoubleBeds;
                    sourceDoubleBeds = this.getDoubleBeds();
                    BigInteger copyDoubleBeds = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "doubleBeds", sourceDoubleBeds), sourceDoubleBeds, (this.doubleBeds!= null)));
                    copy.setDoubleBeds(copyDoubleBeds);
                } else {
                    if (doubleBedsShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.doubleBeds = null;
                    }
                }
            }
            {
                java.lang.Boolean twinBedsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.twinBeds!= null));
                if (twinBedsShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    BigInteger sourceTwinBeds;
                    sourceTwinBeds = this.getTwinBeds();
                    BigInteger copyTwinBeds = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "twinBeds", sourceTwinBeds), sourceTwinBeds, (this.twinBeds!= null)));
                    copy.setTwinBeds(copyTwinBeds);
                } else {
                    if (twinBedsShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.twinBeds = null;
                    }
                }
            }
            {
                java.lang.Boolean numberPeopleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberPeople!= null));
                if (numberPeopleShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    BigInteger sourceNumberPeople;
                    sourceNumberPeople = this.getNumberPeople();
                    BigInteger copyNumberPeople = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "numberPeople", sourceNumberPeople), sourceNumberPeople, (this.numberPeople!= null)));
                    copy.setNumberPeople(copyNumberPeople);
                } else {
                    if (numberPeopleShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.numberPeople = null;
                    }
                }
            }
            {
                java.lang.Boolean availableFromShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.availableFrom!= null));
                if (availableFromShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    Calendar sourceAvailableFrom;
                    sourceAvailableFrom = this.getAvailableFrom();
                    Calendar copyAvailableFrom = ((Calendar) strategy.copy(LocatorUtils.property(locator, "availableFrom", sourceAvailableFrom), sourceAvailableFrom, (this.availableFrom!= null)));
                    copy.setAvailableFrom(copyAvailableFrom);
                } else {
                    if (availableFromShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.availableFrom = null;
                    }
                }
            }
            {
                java.lang.Boolean leaseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lease!= null));
                if (leaseShouldBeCopiedAndSet == java.lang.Boolean.TRUE) {
                    BigInteger sourceLease;
                    sourceLease = this.getLease();
                    BigInteger copyLease = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "lease", sourceLease), sourceLease, (this.lease!= null)));
                    copy.setLease(copyLease);
                } else {
                    if (leaseShouldBeCopiedAndSet == java.lang.Boolean.FALSE) {
                        copy.lease = null;
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
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new OverseasRentalAdType();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OverseasRentalAdType that = ((OverseasRentalAdType) object);
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
            BigInteger lhsRent;
            lhsRent = this.getRent();
            BigInteger rhsRent;
            rhsRent = that.getRent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rent", lhsRent), LocatorUtils.property(thatLocator, "rent", rhsRent), lhsRent, rhsRent, (this.rent!= null), (that.rent!= null))) {
                return false;
            }
        }
        {
            OverseasRentalAdType.RentPeriod lhsRentCollectionPeriod;
            lhsRentCollectionPeriod = this.getRentCollectionPeriod();
            OverseasRentalAdType.RentPeriod rhsRentCollectionPeriod;
            rhsRentCollectionPeriod = that.getRentCollectionPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rentCollectionPeriod", lhsRentCollectionPeriod), LocatorUtils.property(thatLocator, "rentCollectionPeriod", rhsRentCollectionPeriod), lhsRentCollectionPeriod, rhsRentCollectionPeriod, (this.rentCollectionPeriod!= null), (that.rentCollectionPeriod!= null))) {
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
            OverseasRentalAdType.Furnished lhsFurnished;
            lhsFurnished = this.getFurnished();
            OverseasRentalAdType.Furnished rhsFurnished;
            rhsFurnished = that.getFurnished();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "furnished", lhsFurnished), LocatorUtils.property(thatLocator, "furnished", rhsFurnished), lhsFurnished, rhsFurnished, (this.furnished!= null), (that.furnished!= null))) {
                return false;
            }
        }
        {
            Boolean lhsCableTelevision;
            lhsCableTelevision = this.getCableTelevision();
            Boolean rhsCableTelevision;
            rhsCableTelevision = that.getCableTelevision();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cableTelevision", lhsCableTelevision), LocatorUtils.property(thatLocator, "cableTelevision", rhsCableTelevision), lhsCableTelevision, rhsCableTelevision, (this.cableTelevision!= null), (that.cableTelevision!= null))) {
                return false;
            }
        }
        {
            Boolean lhsWashingMachine;
            lhsWashingMachine = this.getWashingMachine();
            Boolean rhsWashingMachine;
            rhsWashingMachine = that.getWashingMachine();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "washingMachine", lhsWashingMachine), LocatorUtils.property(thatLocator, "washingMachine", rhsWashingMachine), lhsWashingMachine, rhsWashingMachine, (this.washingMachine!= null), (that.washingMachine!= null))) {
                return false;
            }
        }
        {
            Boolean lhsDryer;
            lhsDryer = this.getDryer();
            Boolean rhsDryer;
            rhsDryer = that.getDryer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dryer", lhsDryer), LocatorUtils.property(thatLocator, "dryer", rhsDryer), lhsDryer, rhsDryer, (this.dryer!= null), (that.dryer!= null))) {
                return false;
            }
        }
        {
            Boolean lhsDishwasher;
            lhsDishwasher = this.getDishwasher();
            Boolean rhsDishwasher;
            rhsDishwasher = that.getDishwasher();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dishwasher", lhsDishwasher), LocatorUtils.property(thatLocator, "dishwasher", rhsDishwasher), lhsDishwasher, rhsDishwasher, (this.dishwasher!= null), (that.dishwasher!= null))) {
                return false;
            }
        }
        {
            Boolean lhsMicrowave;
            lhsMicrowave = this.getMicrowave();
            Boolean rhsMicrowave;
            rhsMicrowave = that.getMicrowave();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "microwave", lhsMicrowave), LocatorUtils.property(thatLocator, "microwave", rhsMicrowave), lhsMicrowave, rhsMicrowave, (this.microwave!= null), (that.microwave!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsSingleBeds;
            lhsSingleBeds = this.getSingleBeds();
            BigInteger rhsSingleBeds;
            rhsSingleBeds = that.getSingleBeds();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "singleBeds", lhsSingleBeds), LocatorUtils.property(thatLocator, "singleBeds", rhsSingleBeds), lhsSingleBeds, rhsSingleBeds, (this.singleBeds!= null), (that.singleBeds!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsDoubleBeds;
            lhsDoubleBeds = this.getDoubleBeds();
            BigInteger rhsDoubleBeds;
            rhsDoubleBeds = that.getDoubleBeds();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "doubleBeds", lhsDoubleBeds), LocatorUtils.property(thatLocator, "doubleBeds", rhsDoubleBeds), lhsDoubleBeds, rhsDoubleBeds, (this.doubleBeds!= null), (that.doubleBeds!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsTwinBeds;
            lhsTwinBeds = this.getTwinBeds();
            BigInteger rhsTwinBeds;
            rhsTwinBeds = that.getTwinBeds();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "twinBeds", lhsTwinBeds), LocatorUtils.property(thatLocator, "twinBeds", rhsTwinBeds), lhsTwinBeds, rhsTwinBeds, (this.twinBeds!= null), (that.twinBeds!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsNumberPeople;
            lhsNumberPeople = this.getNumberPeople();
            BigInteger rhsNumberPeople;
            rhsNumberPeople = that.getNumberPeople();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberPeople", lhsNumberPeople), LocatorUtils.property(thatLocator, "numberPeople", rhsNumberPeople), lhsNumberPeople, rhsNumberPeople, (this.numberPeople!= null), (that.numberPeople!= null))) {
                return false;
            }
        }
        {
            Calendar lhsAvailableFrom;
            lhsAvailableFrom = this.getAvailableFrom();
            Calendar rhsAvailableFrom;
            rhsAvailableFrom = that.getAvailableFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "availableFrom", lhsAvailableFrom), LocatorUtils.property(thatLocator, "availableFrom", rhsAvailableFrom), lhsAvailableFrom, rhsAvailableFrom, (this.availableFrom!= null), (that.availableFrom!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsLease;
            lhsLease = this.getLease();
            BigInteger rhsLease;
            rhsLease = that.getLease();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lease", lhsLease), LocatorUtils.property(thatLocator, "lease", rhsLease), lhsLease, rhsLease, (this.lease!= null), (that.lease!= null))) {
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
     *     &lt;enumeration value="furnished"/&gt;
     *     &lt;enumeration value="unfurnished"/&gt;
     *     &lt;enumeration value="either"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public enum Furnished {

        @XmlEnumValue("furnished")
        FURNISHED("furnished"),
        @XmlEnumValue("unfurnished")
        UNFURNISHED("unfurnished"),
        @XmlEnumValue("either")
        EITHER("either");
        private final java.lang.String value;

        Furnished(java.lang.String v) {
            value = v;
        }

        public java.lang.String value() {
            return value;
        }

        public static OverseasRentalAdType.Furnished fromValue(java.lang.String v) {
            for (OverseasRentalAdType.Furnished c: OverseasRentalAdType.Furnished.values()) {
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
     *     &lt;enumeration value="weekly"/&gt;
     *     &lt;enumeration value="monthly"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:29:52+02:00", comments = "JAXB RI v2.3.0")
    public enum RentPeriod {

        @XmlEnumValue("weekly")
        WEEKLY("weekly"),
        @XmlEnumValue("monthly")
        MONTHLY("monthly");
        private final java.lang.String value;

        RentPeriod(java.lang.String v) {
            value = v;
        }

        public java.lang.String value() {
            return value;
        }

        public static OverseasRentalAdType.RentPeriod fromValue(java.lang.String v) {
            for (OverseasRentalAdType.RentPeriod c: OverseasRentalAdType.RentPeriod.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
