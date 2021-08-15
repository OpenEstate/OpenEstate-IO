
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
import org.openestate.io.immobiliare_it.xml.types.GenderType;


/**
 * <p>Java class for extra-features complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="extra-features"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="bedrooms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="bathrooms" type="{http://feed.immobiliare.it}roomsType" minOccurs="0"/&gt;
 *         &lt;element name="garage" type="{http://feed.immobiliare.it}box" minOccurs="0"/&gt;
 *         &lt;element name="kitchen" type="{http://feed.immobiliare.it}kitchen" minOccurs="0"/&gt;
 *         &lt;element name="ambience" type="{http://feed.immobiliare.it}ambience" minOccurs="0"/&gt;
 *         &lt;element name="garden" type="{http://feed.immobiliare.it}garden" minOccurs="0"/&gt;
 *         &lt;element name="terrace" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="balcony" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="elevator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="floor" type="{http://feed.immobiliare.it}floor" minOccurs="0"/&gt;
 *         &lt;element name="num-floors" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="for-revenue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="available-now" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="virtual-tour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rent-contract" type="{http://feed.immobiliare.it}rental" minOccurs="0"/&gt;
 *         &lt;element name="additional-costs" type="{http://feed.immobiliare.it}additionalCostsType" minOccurs="0"/&gt;
 *         &lt;element name="furniture" type="{http://feed.immobiliare.it}furniture" minOccurs="0"/&gt;
 *         &lt;element name="security-alarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="reception" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="net" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="external-area" type="{http://feed.immobiliare.it}landSizeType" minOccurs="0"/&gt;
 *         &lt;element name="build-year" type="{http://feed.immobiliare.it}year" minOccurs="0"/&gt;
 *         &lt;element name="free-conditions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="overhead-crane" type="{http://feed.immobiliare.it}yesnoready" minOccurs="0"/&gt;
 *         &lt;element name="beam-height" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="office-size" type="{http://feed.immobiliare.it}sizeType" minOccurs="0"/&gt;
 *         &lt;element name="floorplanner-url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="doc-specification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="doc-description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="available-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="minimum-stay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="bills-included" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="powerline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="gas" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="internet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="costs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="services" type="{http://feed.immobiliare.it}priceType" minOccurs="0"/&gt;
 *                   &lt;element name="other" type="{http://feed.immobiliare.it}priceType" minOccurs="0"/&gt;
 *                   &lt;element name="deposit" type="{http://feed.immobiliare.it}priceType" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="flatmate" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="gender" type="{http://feed.immobiliare.it}genderType" minOccurs="0"/&gt;
 *                   &lt;element name="couples" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="smoker" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="pets" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="age" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="from" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                           &lt;attribute name="to" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extra-features", propOrder = {

})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
public class ExtraFeatures implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected BigInteger bedrooms;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected RoomsType bathrooms;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Box garage;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected KitchenType kitchen;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Ambience ambience;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected GardenType garden;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean terrace;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean balcony;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean elevator;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Floor floor;
    @XmlElement(name = "num-floors", type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected BigInteger numFloors;
    @XmlElement(name = "for-revenue")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean forRevenue;
    @XmlElement(name = "available-now")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean availableNow;
    @XmlElement(name = "virtual-tour")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected String virtualTour;
    @XmlElement(name = "rent-contract")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected RentalType rentContract;
    @XmlElement(name = "additional-costs")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected AdditionalCostsType additionalCosts;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected FurnitureType furniture;
    @XmlElement(name = "security-alarm")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean securityAlarm;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean reception;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean net;
    @XmlElement(name = "external-area")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected LandSizeType externalArea;
    @XmlElement(name = "build-year", type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Integer buildYear;
    @XmlElement(name = "free-conditions")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected String freeConditions;
    @XmlElement(name = "overhead-crane")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected YesNoReadyType overheadCrane;
    @XmlElement(name = "beam-height", type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected BigInteger beamHeight;
    @XmlElement(name = "office-size")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected SizeType officeSize;
    @XmlElement(name = "floorplanner-url")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected String floorplannerUrl;
    @XmlElement(name = "doc-specification")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected String docSpecification;
    @XmlElement(name = "doc-description")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected String docDescription;
    @XmlElement(name = "available-date", type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Calendar availableDate;
    @XmlElement(name = "minimum-stay", type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected BigInteger minimumStay;
    @XmlElement(name = "bills-included")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected ExtraFeatures.BillsIncluded billsIncluded;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected ExtraFeatures.Costs costs;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected ExtraFeatures.Flatmate flatmate;

    /**
     * Gets the value of the bedrooms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public BigInteger getBedrooms() {
        return bedrooms;
    }

    /**
     * Sets the value of the bedrooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setBedrooms(BigInteger value) {
        this.bedrooms = value;
    }

    /**
     * Gets the value of the bathrooms property.
     * 
     * @return
     *     possible object is
     *     {@link RoomsType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public RoomsType getBathrooms() {
        return bathrooms;
    }

    /**
     * Sets the value of the bathrooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomsType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setBathrooms(RoomsType value) {
        this.bathrooms = value;
    }

    /**
     * Gets the value of the garage property.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Box getGarage() {
        return garage;
    }

    /**
     * Sets the value of the garage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setGarage(Box value) {
        this.garage = value;
    }

    /**
     * Gets the value of the kitchen property.
     * 
     * @return
     *     possible object is
     *     {@link KitchenType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public KitchenType getKitchen() {
        return kitchen;
    }

    /**
     * Sets the value of the kitchen property.
     * 
     * @param value
     *     allowed object is
     *     {@link KitchenType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setKitchen(KitchenType value) {
        this.kitchen = value;
    }

    /**
     * Gets the value of the ambience property.
     * 
     * @return
     *     possible object is
     *     {@link Ambience }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Ambience getAmbience() {
        return ambience;
    }

    /**
     * Sets the value of the ambience property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ambience }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setAmbience(Ambience value) {
        this.ambience = value;
    }

    /**
     * Gets the value of the garden property.
     * 
     * @return
     *     possible object is
     *     {@link GardenType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public GardenType getGarden() {
        return garden;
    }

    /**
     * Sets the value of the garden property.
     * 
     * @param value
     *     allowed object is
     *     {@link GardenType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setGarden(GardenType value) {
        this.garden = value;
    }

    /**
     * Gets the value of the terrace property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getTerrace() {
        return terrace;
    }

    /**
     * Sets the value of the terrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setTerrace(Boolean value) {
        this.terrace = value;
    }

    /**
     * Gets the value of the balcony property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getBalcony() {
        return balcony;
    }

    /**
     * Sets the value of the balcony property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setBalcony(Boolean value) {
        this.balcony = value;
    }

    /**
     * Gets the value of the elevator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getElevator() {
        return elevator;
    }

    /**
     * Sets the value of the elevator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setElevator(Boolean value) {
        this.elevator = value;
    }

    /**
     * Gets the value of the floor property.
     * 
     * @return
     *     possible object is
     *     {@link Floor }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Floor getFloor() {
        return floor;
    }

    /**
     * Sets the value of the floor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Floor }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setFloor(Floor value) {
        this.floor = value;
    }

    /**
     * Gets the value of the numFloors property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public BigInteger getNumFloors() {
        return numFloors;
    }

    /**
     * Sets the value of the numFloors property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setNumFloors(BigInteger value) {
        this.numFloors = value;
    }

    /**
     * Gets the value of the forRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getForRevenue() {
        return forRevenue;
    }

    /**
     * Sets the value of the forRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setForRevenue(Boolean value) {
        this.forRevenue = value;
    }

    /**
     * Gets the value of the availableNow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getAvailableNow() {
        return availableNow;
    }

    /**
     * Sets the value of the availableNow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setAvailableNow(Boolean value) {
        this.availableNow = value;
    }

    /**
     * Gets the value of the virtualTour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setVirtualTour(String value) {
        this.virtualTour = value;
    }

    /**
     * Gets the value of the rentContract property.
     * 
     * @return
     *     possible object is
     *     {@link RentalType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public RentalType getRentContract() {
        return rentContract;
    }

    /**
     * Sets the value of the rentContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link RentalType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setRentContract(RentalType value) {
        this.rentContract = value;
    }

    /**
     * Gets the value of the additionalCosts property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalCostsType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public AdditionalCostsType getAdditionalCosts() {
        return additionalCosts;
    }

    /**
     * Sets the value of the additionalCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalCostsType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setAdditionalCosts(AdditionalCostsType value) {
        this.additionalCosts = value;
    }

    /**
     * Gets the value of the furniture property.
     * 
     * @return
     *     possible object is
     *     {@link FurnitureType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public FurnitureType getFurniture() {
        return furniture;
    }

    /**
     * Sets the value of the furniture property.
     * 
     * @param value
     *     allowed object is
     *     {@link FurnitureType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setFurniture(FurnitureType value) {
        this.furniture = value;
    }

    /**
     * Gets the value of the securityAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getSecurityAlarm() {
        return securityAlarm;
    }

    /**
     * Sets the value of the securityAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setSecurityAlarm(Boolean value) {
        this.securityAlarm = value;
    }

    /**
     * Gets the value of the reception property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getReception() {
        return reception;
    }

    /**
     * Sets the value of the reception property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setReception(Boolean value) {
        this.reception = value;
    }

    /**
     * Gets the value of the net property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getNet() {
        return net;
    }

    /**
     * Sets the value of the net property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setNet(Boolean value) {
        this.net = value;
    }

    /**
     * Gets the value of the externalArea property.
     * 
     * @return
     *     possible object is
     *     {@link LandSizeType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public LandSizeType getExternalArea() {
        return externalArea;
    }

    /**
     * Sets the value of the externalArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link LandSizeType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setExternalArea(LandSizeType value) {
        this.externalArea = value;
    }

    /**
     * Gets the value of the buildYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Integer getBuildYear() {
        return buildYear;
    }

    /**
     * Sets the value of the buildYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setBuildYear(Integer value) {
        this.buildYear = value;
    }

    /**
     * Gets the value of the freeConditions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public String getFreeConditions() {
        return freeConditions;
    }

    /**
     * Sets the value of the freeConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setFreeConditions(String value) {
        this.freeConditions = value;
    }

    /**
     * Gets the value of the overheadCrane property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoReadyType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public YesNoReadyType getOverheadCrane() {
        return overheadCrane;
    }

    /**
     * Sets the value of the overheadCrane property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoReadyType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setOverheadCrane(YesNoReadyType value) {
        this.overheadCrane = value;
    }

    /**
     * Gets the value of the beamHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public BigInteger getBeamHeight() {
        return beamHeight;
    }

    /**
     * Sets the value of the beamHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setBeamHeight(BigInteger value) {
        this.beamHeight = value;
    }

    /**
     * Gets the value of the officeSize property.
     * 
     * @return
     *     possible object is
     *     {@link SizeType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public SizeType getOfficeSize() {
        return officeSize;
    }

    /**
     * Sets the value of the officeSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setOfficeSize(SizeType value) {
        this.officeSize = value;
    }

    /**
     * Gets the value of the floorplannerUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setFloorplannerUrl(String value) {
        this.floorplannerUrl = value;
    }

    /**
     * Gets the value of the docSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public String getDocSpecification() {
        return docSpecification;
    }

    /**
     * Sets the value of the docSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setDocSpecification(String value) {
        this.docSpecification = value;
    }

    /**
     * Gets the value of the docDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public String getDocDescription() {
        return docDescription;
    }

    /**
     * Sets the value of the docDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setDocDescription(String value) {
        this.docDescription = value;
    }

    /**
     * Gets the value of the availableDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Calendar getAvailableDate() {
        return availableDate;
    }

    /**
     * Sets the value of the availableDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setAvailableDate(Calendar value) {
        this.availableDate = value;
    }

    /**
     * Gets the value of the minimumStay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public BigInteger getMinimumStay() {
        return minimumStay;
    }

    /**
     * Sets the value of the minimumStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setMinimumStay(BigInteger value) {
        this.minimumStay = value;
    }

    /**
     * Gets the value of the billsIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link ExtraFeatures.BillsIncluded }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public ExtraFeatures.BillsIncluded getBillsIncluded() {
        return billsIncluded;
    }

    /**
     * Sets the value of the billsIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraFeatures.BillsIncluded }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setBillsIncluded(ExtraFeatures.BillsIncluded value) {
        this.billsIncluded = value;
    }

    /**
     * Gets the value of the costs property.
     * 
     * @return
     *     possible object is
     *     {@link ExtraFeatures.Costs }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public ExtraFeatures.Costs getCosts() {
        return costs;
    }

    /**
     * Sets the value of the costs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraFeatures.Costs }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setCosts(ExtraFeatures.Costs value) {
        this.costs = value;
    }

    /**
     * Gets the value of the flatmate property.
     * 
     * @return
     *     possible object is
     *     {@link ExtraFeatures.Flatmate }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public ExtraFeatures.Flatmate getFlatmate() {
        return flatmate;
    }

    /**
     * Sets the value of the flatmate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraFeatures.Flatmate }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setFlatmate(ExtraFeatures.Flatmate value) {
        this.flatmate = value;
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
            BigInteger theBedrooms;
            theBedrooms = this.getBedrooms();
            strategy.appendField(locator, this, "bedrooms", buffer, theBedrooms, (this.bedrooms!= null));
        }
        {
            RoomsType theBathrooms;
            theBathrooms = this.getBathrooms();
            strategy.appendField(locator, this, "bathrooms", buffer, theBathrooms, (this.bathrooms!= null));
        }
        {
            Box theGarage;
            theGarage = this.getGarage();
            strategy.appendField(locator, this, "garage", buffer, theGarage, (this.garage!= null));
        }
        {
            KitchenType theKitchen;
            theKitchen = this.getKitchen();
            strategy.appendField(locator, this, "kitchen", buffer, theKitchen, (this.kitchen!= null));
        }
        {
            Ambience theAmbience;
            theAmbience = this.getAmbience();
            strategy.appendField(locator, this, "ambience", buffer, theAmbience, (this.ambience!= null));
        }
        {
            GardenType theGarden;
            theGarden = this.getGarden();
            strategy.appendField(locator, this, "garden", buffer, theGarden, (this.garden!= null));
        }
        {
            Boolean theTerrace;
            theTerrace = this.getTerrace();
            strategy.appendField(locator, this, "terrace", buffer, theTerrace, (this.terrace!= null));
        }
        {
            Boolean theBalcony;
            theBalcony = this.getBalcony();
            strategy.appendField(locator, this, "balcony", buffer, theBalcony, (this.balcony!= null));
        }
        {
            Boolean theElevator;
            theElevator = this.getElevator();
            strategy.appendField(locator, this, "elevator", buffer, theElevator, (this.elevator!= null));
        }
        {
            Floor theFloor;
            theFloor = this.getFloor();
            strategy.appendField(locator, this, "floor", buffer, theFloor, (this.floor!= null));
        }
        {
            BigInteger theNumFloors;
            theNumFloors = this.getNumFloors();
            strategy.appendField(locator, this, "numFloors", buffer, theNumFloors, (this.numFloors!= null));
        }
        {
            Boolean theForRevenue;
            theForRevenue = this.getForRevenue();
            strategy.appendField(locator, this, "forRevenue", buffer, theForRevenue, (this.forRevenue!= null));
        }
        {
            Boolean theAvailableNow;
            theAvailableNow = this.getAvailableNow();
            strategy.appendField(locator, this, "availableNow", buffer, theAvailableNow, (this.availableNow!= null));
        }
        {
            String theVirtualTour;
            theVirtualTour = this.getVirtualTour();
            strategy.appendField(locator, this, "virtualTour", buffer, theVirtualTour, (this.virtualTour!= null));
        }
        {
            RentalType theRentContract;
            theRentContract = this.getRentContract();
            strategy.appendField(locator, this, "rentContract", buffer, theRentContract, (this.rentContract!= null));
        }
        {
            AdditionalCostsType theAdditionalCosts;
            theAdditionalCosts = this.getAdditionalCosts();
            strategy.appendField(locator, this, "additionalCosts", buffer, theAdditionalCosts, (this.additionalCosts!= null));
        }
        {
            FurnitureType theFurniture;
            theFurniture = this.getFurniture();
            strategy.appendField(locator, this, "furniture", buffer, theFurniture, (this.furniture!= null));
        }
        {
            Boolean theSecurityAlarm;
            theSecurityAlarm = this.getSecurityAlarm();
            strategy.appendField(locator, this, "securityAlarm", buffer, theSecurityAlarm, (this.securityAlarm!= null));
        }
        {
            Boolean theReception;
            theReception = this.getReception();
            strategy.appendField(locator, this, "reception", buffer, theReception, (this.reception!= null));
        }
        {
            Boolean theNet;
            theNet = this.getNet();
            strategy.appendField(locator, this, "net", buffer, theNet, (this.net!= null));
        }
        {
            LandSizeType theExternalArea;
            theExternalArea = this.getExternalArea();
            strategy.appendField(locator, this, "externalArea", buffer, theExternalArea, (this.externalArea!= null));
        }
        {
            Integer theBuildYear;
            theBuildYear = this.getBuildYear();
            strategy.appendField(locator, this, "buildYear", buffer, theBuildYear, (this.buildYear!= null));
        }
        {
            String theFreeConditions;
            theFreeConditions = this.getFreeConditions();
            strategy.appendField(locator, this, "freeConditions", buffer, theFreeConditions, (this.freeConditions!= null));
        }
        {
            YesNoReadyType theOverheadCrane;
            theOverheadCrane = this.getOverheadCrane();
            strategy.appendField(locator, this, "overheadCrane", buffer, theOverheadCrane, (this.overheadCrane!= null));
        }
        {
            BigInteger theBeamHeight;
            theBeamHeight = this.getBeamHeight();
            strategy.appendField(locator, this, "beamHeight", buffer, theBeamHeight, (this.beamHeight!= null));
        }
        {
            SizeType theOfficeSize;
            theOfficeSize = this.getOfficeSize();
            strategy.appendField(locator, this, "officeSize", buffer, theOfficeSize, (this.officeSize!= null));
        }
        {
            String theFloorplannerUrl;
            theFloorplannerUrl = this.getFloorplannerUrl();
            strategy.appendField(locator, this, "floorplannerUrl", buffer, theFloorplannerUrl, (this.floorplannerUrl!= null));
        }
        {
            String theDocSpecification;
            theDocSpecification = this.getDocSpecification();
            strategy.appendField(locator, this, "docSpecification", buffer, theDocSpecification, (this.docSpecification!= null));
        }
        {
            String theDocDescription;
            theDocDescription = this.getDocDescription();
            strategy.appendField(locator, this, "docDescription", buffer, theDocDescription, (this.docDescription!= null));
        }
        {
            Calendar theAvailableDate;
            theAvailableDate = this.getAvailableDate();
            strategy.appendField(locator, this, "availableDate", buffer, theAvailableDate, (this.availableDate!= null));
        }
        {
            BigInteger theMinimumStay;
            theMinimumStay = this.getMinimumStay();
            strategy.appendField(locator, this, "minimumStay", buffer, theMinimumStay, (this.minimumStay!= null));
        }
        {
            ExtraFeatures.BillsIncluded theBillsIncluded;
            theBillsIncluded = this.getBillsIncluded();
            strategy.appendField(locator, this, "billsIncluded", buffer, theBillsIncluded, (this.billsIncluded!= null));
        }
        {
            ExtraFeatures.Costs theCosts;
            theCosts = this.getCosts();
            strategy.appendField(locator, this, "costs", buffer, theCosts, (this.costs!= null));
        }
        {
            ExtraFeatures.Flatmate theFlatmate;
            theFlatmate = this.getFlatmate();
            strategy.appendField(locator, this, "flatmate", buffer, theFlatmate, (this.flatmate!= null));
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
        if (draftCopy instanceof ExtraFeatures) {
            final ExtraFeatures copy = ((ExtraFeatures) draftCopy);
            {
                Boolean bedroomsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bedrooms!= null));
                if (bedroomsShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceBedrooms;
                    sourceBedrooms = this.getBedrooms();
                    BigInteger copyBedrooms = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "bedrooms", sourceBedrooms), sourceBedrooms, (this.bedrooms!= null)));
                    copy.setBedrooms(copyBedrooms);
                } else {
                    if (bedroomsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bedrooms = null;
                    }
                }
            }
            {
                Boolean bathroomsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bathrooms!= null));
                if (bathroomsShouldBeCopiedAndSet == Boolean.TRUE) {
                    RoomsType sourceBathrooms;
                    sourceBathrooms = this.getBathrooms();
                    RoomsType copyBathrooms = ((RoomsType) strategy.copy(LocatorUtils.property(locator, "bathrooms", sourceBathrooms), sourceBathrooms, (this.bathrooms!= null)));
                    copy.setBathrooms(copyBathrooms);
                } else {
                    if (bathroomsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bathrooms = null;
                    }
                }
            }
            {
                Boolean garageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.garage!= null));
                if (garageShouldBeCopiedAndSet == Boolean.TRUE) {
                    Box sourceGarage;
                    sourceGarage = this.getGarage();
                    Box copyGarage = ((Box) strategy.copy(LocatorUtils.property(locator, "garage", sourceGarage), sourceGarage, (this.garage!= null)));
                    copy.setGarage(copyGarage);
                } else {
                    if (garageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.garage = null;
                    }
                }
            }
            {
                Boolean kitchenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kitchen!= null));
                if (kitchenShouldBeCopiedAndSet == Boolean.TRUE) {
                    KitchenType sourceKitchen;
                    sourceKitchen = this.getKitchen();
                    KitchenType copyKitchen = ((KitchenType) strategy.copy(LocatorUtils.property(locator, "kitchen", sourceKitchen), sourceKitchen, (this.kitchen!= null)));
                    copy.setKitchen(copyKitchen);
                } else {
                    if (kitchenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kitchen = null;
                    }
                }
            }
            {
                Boolean ambienceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ambience!= null));
                if (ambienceShouldBeCopiedAndSet == Boolean.TRUE) {
                    Ambience sourceAmbience;
                    sourceAmbience = this.getAmbience();
                    Ambience copyAmbience = ((Ambience) strategy.copy(LocatorUtils.property(locator, "ambience", sourceAmbience), sourceAmbience, (this.ambience!= null)));
                    copy.setAmbience(copyAmbience);
                } else {
                    if (ambienceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ambience = null;
                    }
                }
            }
            {
                Boolean gardenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.garden!= null));
                if (gardenShouldBeCopiedAndSet == Boolean.TRUE) {
                    GardenType sourceGarden;
                    sourceGarden = this.getGarden();
                    GardenType copyGarden = ((GardenType) strategy.copy(LocatorUtils.property(locator, "garden", sourceGarden), sourceGarden, (this.garden!= null)));
                    copy.setGarden(copyGarden);
                } else {
                    if (gardenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.garden = null;
                    }
                }
            }
            {
                Boolean terraceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.terrace!= null));
                if (terraceShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceTerrace;
                    sourceTerrace = this.getTerrace();
                    Boolean copyTerrace = ((Boolean) strategy.copy(LocatorUtils.property(locator, "terrace", sourceTerrace), sourceTerrace, (this.terrace!= null)));
                    copy.setTerrace(copyTerrace);
                } else {
                    if (terraceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.terrace = null;
                    }
                }
            }
            {
                Boolean balconyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.balcony!= null));
                if (balconyShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceBalcony;
                    sourceBalcony = this.getBalcony();
                    Boolean copyBalcony = ((Boolean) strategy.copy(LocatorUtils.property(locator, "balcony", sourceBalcony), sourceBalcony, (this.balcony!= null)));
                    copy.setBalcony(copyBalcony);
                } else {
                    if (balconyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.balcony = null;
                    }
                }
            }
            {
                Boolean elevatorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.elevator!= null));
                if (elevatorShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceElevator;
                    sourceElevator = this.getElevator();
                    Boolean copyElevator = ((Boolean) strategy.copy(LocatorUtils.property(locator, "elevator", sourceElevator), sourceElevator, (this.elevator!= null)));
                    copy.setElevator(copyElevator);
                } else {
                    if (elevatorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.elevator = null;
                    }
                }
            }
            {
                Boolean floorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.floor!= null));
                if (floorShouldBeCopiedAndSet == Boolean.TRUE) {
                    Floor sourceFloor;
                    sourceFloor = this.getFloor();
                    Floor copyFloor = ((Floor) strategy.copy(LocatorUtils.property(locator, "floor", sourceFloor), sourceFloor, (this.floor!= null)));
                    copy.setFloor(copyFloor);
                } else {
                    if (floorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.floor = null;
                    }
                }
            }
            {
                Boolean numFloorsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numFloors!= null));
                if (numFloorsShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceNumFloors;
                    sourceNumFloors = this.getNumFloors();
                    BigInteger copyNumFloors = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "numFloors", sourceNumFloors), sourceNumFloors, (this.numFloors!= null)));
                    copy.setNumFloors(copyNumFloors);
                } else {
                    if (numFloorsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numFloors = null;
                    }
                }
            }
            {
                Boolean forRevenueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.forRevenue!= null));
                if (forRevenueShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceForRevenue;
                    sourceForRevenue = this.getForRevenue();
                    Boolean copyForRevenue = ((Boolean) strategy.copy(LocatorUtils.property(locator, "forRevenue", sourceForRevenue), sourceForRevenue, (this.forRevenue!= null)));
                    copy.setForRevenue(copyForRevenue);
                } else {
                    if (forRevenueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.forRevenue = null;
                    }
                }
            }
            {
                Boolean availableNowShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.availableNow!= null));
                if (availableNowShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceAvailableNow;
                    sourceAvailableNow = this.getAvailableNow();
                    Boolean copyAvailableNow = ((Boolean) strategy.copy(LocatorUtils.property(locator, "availableNow", sourceAvailableNow), sourceAvailableNow, (this.availableNow!= null)));
                    copy.setAvailableNow(copyAvailableNow);
                } else {
                    if (availableNowShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.availableNow = null;
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
                Boolean rentContractShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.rentContract!= null));
                if (rentContractShouldBeCopiedAndSet == Boolean.TRUE) {
                    RentalType sourceRentContract;
                    sourceRentContract = this.getRentContract();
                    RentalType copyRentContract = ((RentalType) strategy.copy(LocatorUtils.property(locator, "rentContract", sourceRentContract), sourceRentContract, (this.rentContract!= null)));
                    copy.setRentContract(copyRentContract);
                } else {
                    if (rentContractShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.rentContract = null;
                    }
                }
            }
            {
                Boolean additionalCostsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.additionalCosts!= null));
                if (additionalCostsShouldBeCopiedAndSet == Boolean.TRUE) {
                    AdditionalCostsType sourceAdditionalCosts;
                    sourceAdditionalCosts = this.getAdditionalCosts();
                    AdditionalCostsType copyAdditionalCosts = ((AdditionalCostsType) strategy.copy(LocatorUtils.property(locator, "additionalCosts", sourceAdditionalCosts), sourceAdditionalCosts, (this.additionalCosts!= null)));
                    copy.setAdditionalCosts(copyAdditionalCosts);
                } else {
                    if (additionalCostsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.additionalCosts = null;
                    }
                }
            }
            {
                Boolean furnitureShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.furniture!= null));
                if (furnitureShouldBeCopiedAndSet == Boolean.TRUE) {
                    FurnitureType sourceFurniture;
                    sourceFurniture = this.getFurniture();
                    FurnitureType copyFurniture = ((FurnitureType) strategy.copy(LocatorUtils.property(locator, "furniture", sourceFurniture), sourceFurniture, (this.furniture!= null)));
                    copy.setFurniture(copyFurniture);
                } else {
                    if (furnitureShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.furniture = null;
                    }
                }
            }
            {
                Boolean securityAlarmShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.securityAlarm!= null));
                if (securityAlarmShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceSecurityAlarm;
                    sourceSecurityAlarm = this.getSecurityAlarm();
                    Boolean copySecurityAlarm = ((Boolean) strategy.copy(LocatorUtils.property(locator, "securityAlarm", sourceSecurityAlarm), sourceSecurityAlarm, (this.securityAlarm!= null)));
                    copy.setSecurityAlarm(copySecurityAlarm);
                } else {
                    if (securityAlarmShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.securityAlarm = null;
                    }
                }
            }
            {
                Boolean receptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.reception!= null));
                if (receptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceReception;
                    sourceReception = this.getReception();
                    Boolean copyReception = ((Boolean) strategy.copy(LocatorUtils.property(locator, "reception", sourceReception), sourceReception, (this.reception!= null)));
                    copy.setReception(copyReception);
                } else {
                    if (receptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.reception = null;
                    }
                }
            }
            {
                Boolean netShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.net!= null));
                if (netShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceNet;
                    sourceNet = this.getNet();
                    Boolean copyNet = ((Boolean) strategy.copy(LocatorUtils.property(locator, "net", sourceNet), sourceNet, (this.net!= null)));
                    copy.setNet(copyNet);
                } else {
                    if (netShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.net = null;
                    }
                }
            }
            {
                Boolean externalAreaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.externalArea!= null));
                if (externalAreaShouldBeCopiedAndSet == Boolean.TRUE) {
                    LandSizeType sourceExternalArea;
                    sourceExternalArea = this.getExternalArea();
                    LandSizeType copyExternalArea = ((LandSizeType) strategy.copy(LocatorUtils.property(locator, "externalArea", sourceExternalArea), sourceExternalArea, (this.externalArea!= null)));
                    copy.setExternalArea(copyExternalArea);
                } else {
                    if (externalAreaShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.externalArea = null;
                    }
                }
            }
            {
                Boolean buildYearShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.buildYear!= null));
                if (buildYearShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceBuildYear;
                    sourceBuildYear = this.getBuildYear();
                    Integer copyBuildYear = ((Integer) strategy.copy(LocatorUtils.property(locator, "buildYear", sourceBuildYear), sourceBuildYear, (this.buildYear!= null)));
                    copy.setBuildYear(copyBuildYear);
                } else {
                    if (buildYearShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.buildYear = null;
                    }
                }
            }
            {
                Boolean freeConditionsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.freeConditions!= null));
                if (freeConditionsShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFreeConditions;
                    sourceFreeConditions = this.getFreeConditions();
                    String copyFreeConditions = ((String) strategy.copy(LocatorUtils.property(locator, "freeConditions", sourceFreeConditions), sourceFreeConditions, (this.freeConditions!= null)));
                    copy.setFreeConditions(copyFreeConditions);
                } else {
                    if (freeConditionsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.freeConditions = null;
                    }
                }
            }
            {
                Boolean overheadCraneShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.overheadCrane!= null));
                if (overheadCraneShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNoReadyType sourceOverheadCrane;
                    sourceOverheadCrane = this.getOverheadCrane();
                    YesNoReadyType copyOverheadCrane = ((YesNoReadyType) strategy.copy(LocatorUtils.property(locator, "overheadCrane", sourceOverheadCrane), sourceOverheadCrane, (this.overheadCrane!= null)));
                    copy.setOverheadCrane(copyOverheadCrane);
                } else {
                    if (overheadCraneShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.overheadCrane = null;
                    }
                }
            }
            {
                Boolean beamHeightShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.beamHeight!= null));
                if (beamHeightShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceBeamHeight;
                    sourceBeamHeight = this.getBeamHeight();
                    BigInteger copyBeamHeight = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "beamHeight", sourceBeamHeight), sourceBeamHeight, (this.beamHeight!= null)));
                    copy.setBeamHeight(copyBeamHeight);
                } else {
                    if (beamHeightShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.beamHeight = null;
                    }
                }
            }
            {
                Boolean officeSizeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.officeSize!= null));
                if (officeSizeShouldBeCopiedAndSet == Boolean.TRUE) {
                    SizeType sourceOfficeSize;
                    sourceOfficeSize = this.getOfficeSize();
                    SizeType copyOfficeSize = ((SizeType) strategy.copy(LocatorUtils.property(locator, "officeSize", sourceOfficeSize), sourceOfficeSize, (this.officeSize!= null)));
                    copy.setOfficeSize(copyOfficeSize);
                } else {
                    if (officeSizeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.officeSize = null;
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
                Boolean docSpecificationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.docSpecification!= null));
                if (docSpecificationShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDocSpecification;
                    sourceDocSpecification = this.getDocSpecification();
                    String copyDocSpecification = ((String) strategy.copy(LocatorUtils.property(locator, "docSpecification", sourceDocSpecification), sourceDocSpecification, (this.docSpecification!= null)));
                    copy.setDocSpecification(copyDocSpecification);
                } else {
                    if (docSpecificationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.docSpecification = null;
                    }
                }
            }
            {
                Boolean docDescriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.docDescription!= null));
                if (docDescriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDocDescription;
                    sourceDocDescription = this.getDocDescription();
                    String copyDocDescription = ((String) strategy.copy(LocatorUtils.property(locator, "docDescription", sourceDocDescription), sourceDocDescription, (this.docDescription!= null)));
                    copy.setDocDescription(copyDocDescription);
                } else {
                    if (docDescriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.docDescription = null;
                    }
                }
            }
            {
                Boolean availableDateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.availableDate!= null));
                if (availableDateShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceAvailableDate;
                    sourceAvailableDate = this.getAvailableDate();
                    Calendar copyAvailableDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "availableDate", sourceAvailableDate), sourceAvailableDate, (this.availableDate!= null)));
                    copy.setAvailableDate(copyAvailableDate);
                } else {
                    if (availableDateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.availableDate = null;
                    }
                }
            }
            {
                Boolean minimumStayShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.minimumStay!= null));
                if (minimumStayShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceMinimumStay;
                    sourceMinimumStay = this.getMinimumStay();
                    BigInteger copyMinimumStay = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "minimumStay", sourceMinimumStay), sourceMinimumStay, (this.minimumStay!= null)));
                    copy.setMinimumStay(copyMinimumStay);
                } else {
                    if (minimumStayShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.minimumStay = null;
                    }
                }
            }
            {
                Boolean billsIncludedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.billsIncluded!= null));
                if (billsIncludedShouldBeCopiedAndSet == Boolean.TRUE) {
                    ExtraFeatures.BillsIncluded sourceBillsIncluded;
                    sourceBillsIncluded = this.getBillsIncluded();
                    ExtraFeatures.BillsIncluded copyBillsIncluded = ((ExtraFeatures.BillsIncluded) strategy.copy(LocatorUtils.property(locator, "billsIncluded", sourceBillsIncluded), sourceBillsIncluded, (this.billsIncluded!= null)));
                    copy.setBillsIncluded(copyBillsIncluded);
                } else {
                    if (billsIncludedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.billsIncluded = null;
                    }
                }
            }
            {
                Boolean costsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.costs!= null));
                if (costsShouldBeCopiedAndSet == Boolean.TRUE) {
                    ExtraFeatures.Costs sourceCosts;
                    sourceCosts = this.getCosts();
                    ExtraFeatures.Costs copyCosts = ((ExtraFeatures.Costs) strategy.copy(LocatorUtils.property(locator, "costs", sourceCosts), sourceCosts, (this.costs!= null)));
                    copy.setCosts(copyCosts);
                } else {
                    if (costsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.costs = null;
                    }
                }
            }
            {
                Boolean flatmateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.flatmate!= null));
                if (flatmateShouldBeCopiedAndSet == Boolean.TRUE) {
                    ExtraFeatures.Flatmate sourceFlatmate;
                    sourceFlatmate = this.getFlatmate();
                    ExtraFeatures.Flatmate copyFlatmate = ((ExtraFeatures.Flatmate) strategy.copy(LocatorUtils.property(locator, "flatmate", sourceFlatmate), sourceFlatmate, (this.flatmate!= null)));
                    copy.setFlatmate(copyFlatmate);
                } else {
                    if (flatmateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.flatmate = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new ExtraFeatures();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ExtraFeatures that = ((ExtraFeatures) object);
        {
            BigInteger lhsBedrooms;
            lhsBedrooms = this.getBedrooms();
            BigInteger rhsBedrooms;
            rhsBedrooms = that.getBedrooms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bedrooms", lhsBedrooms), LocatorUtils.property(thatLocator, "bedrooms", rhsBedrooms), lhsBedrooms, rhsBedrooms, (this.bedrooms!= null), (that.bedrooms!= null))) {
                return false;
            }
        }
        {
            RoomsType lhsBathrooms;
            lhsBathrooms = this.getBathrooms();
            RoomsType rhsBathrooms;
            rhsBathrooms = that.getBathrooms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bathrooms", lhsBathrooms), LocatorUtils.property(thatLocator, "bathrooms", rhsBathrooms), lhsBathrooms, rhsBathrooms, (this.bathrooms!= null), (that.bathrooms!= null))) {
                return false;
            }
        }
        {
            Box lhsGarage;
            lhsGarage = this.getGarage();
            Box rhsGarage;
            rhsGarage = that.getGarage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "garage", lhsGarage), LocatorUtils.property(thatLocator, "garage", rhsGarage), lhsGarage, rhsGarage, (this.garage!= null), (that.garage!= null))) {
                return false;
            }
        }
        {
            KitchenType lhsKitchen;
            lhsKitchen = this.getKitchen();
            KitchenType rhsKitchen;
            rhsKitchen = that.getKitchen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kitchen", lhsKitchen), LocatorUtils.property(thatLocator, "kitchen", rhsKitchen), lhsKitchen, rhsKitchen, (this.kitchen!= null), (that.kitchen!= null))) {
                return false;
            }
        }
        {
            Ambience lhsAmbience;
            lhsAmbience = this.getAmbience();
            Ambience rhsAmbience;
            rhsAmbience = that.getAmbience();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ambience", lhsAmbience), LocatorUtils.property(thatLocator, "ambience", rhsAmbience), lhsAmbience, rhsAmbience, (this.ambience!= null), (that.ambience!= null))) {
                return false;
            }
        }
        {
            GardenType lhsGarden;
            lhsGarden = this.getGarden();
            GardenType rhsGarden;
            rhsGarden = that.getGarden();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "garden", lhsGarden), LocatorUtils.property(thatLocator, "garden", rhsGarden), lhsGarden, rhsGarden, (this.garden!= null), (that.garden!= null))) {
                return false;
            }
        }
        {
            Boolean lhsTerrace;
            lhsTerrace = this.getTerrace();
            Boolean rhsTerrace;
            rhsTerrace = that.getTerrace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "terrace", lhsTerrace), LocatorUtils.property(thatLocator, "terrace", rhsTerrace), lhsTerrace, rhsTerrace, (this.terrace!= null), (that.terrace!= null))) {
                return false;
            }
        }
        {
            Boolean lhsBalcony;
            lhsBalcony = this.getBalcony();
            Boolean rhsBalcony;
            rhsBalcony = that.getBalcony();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "balcony", lhsBalcony), LocatorUtils.property(thatLocator, "balcony", rhsBalcony), lhsBalcony, rhsBalcony, (this.balcony!= null), (that.balcony!= null))) {
                return false;
            }
        }
        {
            Boolean lhsElevator;
            lhsElevator = this.getElevator();
            Boolean rhsElevator;
            rhsElevator = that.getElevator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "elevator", lhsElevator), LocatorUtils.property(thatLocator, "elevator", rhsElevator), lhsElevator, rhsElevator, (this.elevator!= null), (that.elevator!= null))) {
                return false;
            }
        }
        {
            Floor lhsFloor;
            lhsFloor = this.getFloor();
            Floor rhsFloor;
            rhsFloor = that.getFloor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "floor", lhsFloor), LocatorUtils.property(thatLocator, "floor", rhsFloor), lhsFloor, rhsFloor, (this.floor!= null), (that.floor!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsNumFloors;
            lhsNumFloors = this.getNumFloors();
            BigInteger rhsNumFloors;
            rhsNumFloors = that.getNumFloors();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numFloors", lhsNumFloors), LocatorUtils.property(thatLocator, "numFloors", rhsNumFloors), lhsNumFloors, rhsNumFloors, (this.numFloors!= null), (that.numFloors!= null))) {
                return false;
            }
        }
        {
            Boolean lhsForRevenue;
            lhsForRevenue = this.getForRevenue();
            Boolean rhsForRevenue;
            rhsForRevenue = that.getForRevenue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "forRevenue", lhsForRevenue), LocatorUtils.property(thatLocator, "forRevenue", rhsForRevenue), lhsForRevenue, rhsForRevenue, (this.forRevenue!= null), (that.forRevenue!= null))) {
                return false;
            }
        }
        {
            Boolean lhsAvailableNow;
            lhsAvailableNow = this.getAvailableNow();
            Boolean rhsAvailableNow;
            rhsAvailableNow = that.getAvailableNow();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "availableNow", lhsAvailableNow), LocatorUtils.property(thatLocator, "availableNow", rhsAvailableNow), lhsAvailableNow, rhsAvailableNow, (this.availableNow!= null), (that.availableNow!= null))) {
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
            RentalType lhsRentContract;
            lhsRentContract = this.getRentContract();
            RentalType rhsRentContract;
            rhsRentContract = that.getRentContract();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rentContract", lhsRentContract), LocatorUtils.property(thatLocator, "rentContract", rhsRentContract), lhsRentContract, rhsRentContract, (this.rentContract!= null), (that.rentContract!= null))) {
                return false;
            }
        }
        {
            AdditionalCostsType lhsAdditionalCosts;
            lhsAdditionalCosts = this.getAdditionalCosts();
            AdditionalCostsType rhsAdditionalCosts;
            rhsAdditionalCosts = that.getAdditionalCosts();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalCosts", lhsAdditionalCosts), LocatorUtils.property(thatLocator, "additionalCosts", rhsAdditionalCosts), lhsAdditionalCosts, rhsAdditionalCosts, (this.additionalCosts!= null), (that.additionalCosts!= null))) {
                return false;
            }
        }
        {
            FurnitureType lhsFurniture;
            lhsFurniture = this.getFurniture();
            FurnitureType rhsFurniture;
            rhsFurniture = that.getFurniture();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "furniture", lhsFurniture), LocatorUtils.property(thatLocator, "furniture", rhsFurniture), lhsFurniture, rhsFurniture, (this.furniture!= null), (that.furniture!= null))) {
                return false;
            }
        }
        {
            Boolean lhsSecurityAlarm;
            lhsSecurityAlarm = this.getSecurityAlarm();
            Boolean rhsSecurityAlarm;
            rhsSecurityAlarm = that.getSecurityAlarm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "securityAlarm", lhsSecurityAlarm), LocatorUtils.property(thatLocator, "securityAlarm", rhsSecurityAlarm), lhsSecurityAlarm, rhsSecurityAlarm, (this.securityAlarm!= null), (that.securityAlarm!= null))) {
                return false;
            }
        }
        {
            Boolean lhsReception;
            lhsReception = this.getReception();
            Boolean rhsReception;
            rhsReception = that.getReception();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reception", lhsReception), LocatorUtils.property(thatLocator, "reception", rhsReception), lhsReception, rhsReception, (this.reception!= null), (that.reception!= null))) {
                return false;
            }
        }
        {
            Boolean lhsNet;
            lhsNet = this.getNet();
            Boolean rhsNet;
            rhsNet = that.getNet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "net", lhsNet), LocatorUtils.property(thatLocator, "net", rhsNet), lhsNet, rhsNet, (this.net!= null), (that.net!= null))) {
                return false;
            }
        }
        {
            LandSizeType lhsExternalArea;
            lhsExternalArea = this.getExternalArea();
            LandSizeType rhsExternalArea;
            rhsExternalArea = that.getExternalArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "externalArea", lhsExternalArea), LocatorUtils.property(thatLocator, "externalArea", rhsExternalArea), lhsExternalArea, rhsExternalArea, (this.externalArea!= null), (that.externalArea!= null))) {
                return false;
            }
        }
        {
            Integer lhsBuildYear;
            lhsBuildYear = this.getBuildYear();
            Integer rhsBuildYear;
            rhsBuildYear = that.getBuildYear();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buildYear", lhsBuildYear), LocatorUtils.property(thatLocator, "buildYear", rhsBuildYear), lhsBuildYear, rhsBuildYear, (this.buildYear!= null), (that.buildYear!= null))) {
                return false;
            }
        }
        {
            String lhsFreeConditions;
            lhsFreeConditions = this.getFreeConditions();
            String rhsFreeConditions;
            rhsFreeConditions = that.getFreeConditions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freeConditions", lhsFreeConditions), LocatorUtils.property(thatLocator, "freeConditions", rhsFreeConditions), lhsFreeConditions, rhsFreeConditions, (this.freeConditions!= null), (that.freeConditions!= null))) {
                return false;
            }
        }
        {
            YesNoReadyType lhsOverheadCrane;
            lhsOverheadCrane = this.getOverheadCrane();
            YesNoReadyType rhsOverheadCrane;
            rhsOverheadCrane = that.getOverheadCrane();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "overheadCrane", lhsOverheadCrane), LocatorUtils.property(thatLocator, "overheadCrane", rhsOverheadCrane), lhsOverheadCrane, rhsOverheadCrane, (this.overheadCrane!= null), (that.overheadCrane!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsBeamHeight;
            lhsBeamHeight = this.getBeamHeight();
            BigInteger rhsBeamHeight;
            rhsBeamHeight = that.getBeamHeight();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beamHeight", lhsBeamHeight), LocatorUtils.property(thatLocator, "beamHeight", rhsBeamHeight), lhsBeamHeight, rhsBeamHeight, (this.beamHeight!= null), (that.beamHeight!= null))) {
                return false;
            }
        }
        {
            SizeType lhsOfficeSize;
            lhsOfficeSize = this.getOfficeSize();
            SizeType rhsOfficeSize;
            rhsOfficeSize = that.getOfficeSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "officeSize", lhsOfficeSize), LocatorUtils.property(thatLocator, "officeSize", rhsOfficeSize), lhsOfficeSize, rhsOfficeSize, (this.officeSize!= null), (that.officeSize!= null))) {
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
            String lhsDocSpecification;
            lhsDocSpecification = this.getDocSpecification();
            String rhsDocSpecification;
            rhsDocSpecification = that.getDocSpecification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "docSpecification", lhsDocSpecification), LocatorUtils.property(thatLocator, "docSpecification", rhsDocSpecification), lhsDocSpecification, rhsDocSpecification, (this.docSpecification!= null), (that.docSpecification!= null))) {
                return false;
            }
        }
        {
            String lhsDocDescription;
            lhsDocDescription = this.getDocDescription();
            String rhsDocDescription;
            rhsDocDescription = that.getDocDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "docDescription", lhsDocDescription), LocatorUtils.property(thatLocator, "docDescription", rhsDocDescription), lhsDocDescription, rhsDocDescription, (this.docDescription!= null), (that.docDescription!= null))) {
                return false;
            }
        }
        {
            Calendar lhsAvailableDate;
            lhsAvailableDate = this.getAvailableDate();
            Calendar rhsAvailableDate;
            rhsAvailableDate = that.getAvailableDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "availableDate", lhsAvailableDate), LocatorUtils.property(thatLocator, "availableDate", rhsAvailableDate), lhsAvailableDate, rhsAvailableDate, (this.availableDate!= null), (that.availableDate!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsMinimumStay;
            lhsMinimumStay = this.getMinimumStay();
            BigInteger rhsMinimumStay;
            rhsMinimumStay = that.getMinimumStay();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimumStay", lhsMinimumStay), LocatorUtils.property(thatLocator, "minimumStay", rhsMinimumStay), lhsMinimumStay, rhsMinimumStay, (this.minimumStay!= null), (that.minimumStay!= null))) {
                return false;
            }
        }
        {
            ExtraFeatures.BillsIncluded lhsBillsIncluded;
            lhsBillsIncluded = this.getBillsIncluded();
            ExtraFeatures.BillsIncluded rhsBillsIncluded;
            rhsBillsIncluded = that.getBillsIncluded();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billsIncluded", lhsBillsIncluded), LocatorUtils.property(thatLocator, "billsIncluded", rhsBillsIncluded), lhsBillsIncluded, rhsBillsIncluded, (this.billsIncluded!= null), (that.billsIncluded!= null))) {
                return false;
            }
        }
        {
            ExtraFeatures.Costs lhsCosts;
            lhsCosts = this.getCosts();
            ExtraFeatures.Costs rhsCosts;
            rhsCosts = that.getCosts();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "costs", lhsCosts), LocatorUtils.property(thatLocator, "costs", rhsCosts), lhsCosts, rhsCosts, (this.costs!= null), (that.costs!= null))) {
                return false;
            }
        }
        {
            ExtraFeatures.Flatmate lhsFlatmate;
            lhsFlatmate = this.getFlatmate();
            ExtraFeatures.Flatmate rhsFlatmate;
            rhsFlatmate = that.getFlatmate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flatmate", lhsFlatmate), LocatorUtils.property(thatLocator, "flatmate", rhsFlatmate), lhsFlatmate, rhsFlatmate, (this.flatmate!= null), (that.flatmate!= null))) {
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
     *         &lt;element name="powerline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="gas" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="internet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public static class BillsIncluded implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        protected Boolean powerline;
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        protected Boolean gas;
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        protected Boolean phone;
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        protected Boolean internet;

        /**
         * Gets the value of the powerline property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public Boolean getPowerline() {
            return powerline;
        }

        /**
         * Sets the value of the powerline property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public void setPowerline(Boolean value) {
            this.powerline = value;
        }

        /**
         * Gets the value of the gas property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public Boolean getGas() {
            return gas;
        }

        /**
         * Sets the value of the gas property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public void setGas(Boolean value) {
            this.gas = value;
        }

        /**
         * Gets the value of the phone property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public Boolean getPhone() {
            return phone;
        }

        /**
         * Sets the value of the phone property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public void setPhone(Boolean value) {
            this.phone = value;
        }

        /**
         * Gets the value of the internet property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public Boolean getInternet() {
            return internet;
        }

        /**
         * Sets the value of the internet property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public void setInternet(Boolean value) {
            this.internet = value;
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
                Boolean thePowerline;
                thePowerline = this.getPowerline();
                strategy.appendField(locator, this, "powerline", buffer, thePowerline, (this.powerline!= null));
            }
            {
                Boolean theGas;
                theGas = this.getGas();
                strategy.appendField(locator, this, "gas", buffer, theGas, (this.gas!= null));
            }
            {
                Boolean thePhone;
                thePhone = this.getPhone();
                strategy.appendField(locator, this, "phone", buffer, thePhone, (this.phone!= null));
            }
            {
                Boolean theInternet;
                theInternet = this.getInternet();
                strategy.appendField(locator, this, "internet", buffer, theInternet, (this.internet!= null));
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
            if (draftCopy instanceof ExtraFeatures.BillsIncluded) {
                final ExtraFeatures.BillsIncluded copy = ((ExtraFeatures.BillsIncluded) draftCopy);
                {
                    Boolean powerlineShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.powerline!= null));
                    if (powerlineShouldBeCopiedAndSet == Boolean.TRUE) {
                        Boolean sourcePowerline;
                        sourcePowerline = this.getPowerline();
                        Boolean copyPowerline = ((Boolean) strategy.copy(LocatorUtils.property(locator, "powerline", sourcePowerline), sourcePowerline, (this.powerline!= null)));
                        copy.setPowerline(copyPowerline);
                    } else {
                        if (powerlineShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.powerline = null;
                        }
                    }
                }
                {
                    Boolean gasShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gas!= null));
                    if (gasShouldBeCopiedAndSet == Boolean.TRUE) {
                        Boolean sourceGas;
                        sourceGas = this.getGas();
                        Boolean copyGas = ((Boolean) strategy.copy(LocatorUtils.property(locator, "gas", sourceGas), sourceGas, (this.gas!= null)));
                        copy.setGas(copyGas);
                    } else {
                        if (gasShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.gas = null;
                        }
                    }
                }
                {
                    Boolean phoneShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.phone!= null));
                    if (phoneShouldBeCopiedAndSet == Boolean.TRUE) {
                        Boolean sourcePhone;
                        sourcePhone = this.getPhone();
                        Boolean copyPhone = ((Boolean) strategy.copy(LocatorUtils.property(locator, "phone", sourcePhone), sourcePhone, (this.phone!= null)));
                        copy.setPhone(copyPhone);
                    } else {
                        if (phoneShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.phone = null;
                        }
                    }
                }
                {
                    Boolean internetShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.internet!= null));
                    if (internetShouldBeCopiedAndSet == Boolean.TRUE) {
                        Boolean sourceInternet;
                        sourceInternet = this.getInternet();
                        Boolean copyInternet = ((Boolean) strategy.copy(LocatorUtils.property(locator, "internet", sourceInternet), sourceInternet, (this.internet!= null)));
                        copy.setInternet(copyInternet);
                    } else {
                        if (internetShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.internet = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public Object createNewInstance() {
            return new ExtraFeatures.BillsIncluded();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final ExtraFeatures.BillsIncluded that = ((ExtraFeatures.BillsIncluded) object);
            {
                Boolean lhsPowerline;
                lhsPowerline = this.getPowerline();
                Boolean rhsPowerline;
                rhsPowerline = that.getPowerline();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "powerline", lhsPowerline), LocatorUtils.property(thatLocator, "powerline", rhsPowerline), lhsPowerline, rhsPowerline, (this.powerline!= null), (that.powerline!= null))) {
                    return false;
                }
            }
            {
                Boolean lhsGas;
                lhsGas = this.getGas();
                Boolean rhsGas;
                rhsGas = that.getGas();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "gas", lhsGas), LocatorUtils.property(thatLocator, "gas", rhsGas), lhsGas, rhsGas, (this.gas!= null), (that.gas!= null))) {
                    return false;
                }
            }
            {
                Boolean lhsPhone;
                lhsPhone = this.getPhone();
                Boolean rhsPhone;
                rhsPhone = that.getPhone();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "phone", lhsPhone), LocatorUtils.property(thatLocator, "phone", rhsPhone), lhsPhone, rhsPhone, (this.phone!= null), (that.phone!= null))) {
                    return false;
                }
            }
            {
                Boolean lhsInternet;
                lhsInternet = this.getInternet();
                Boolean rhsInternet;
                rhsInternet = that.getInternet();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "internet", lhsInternet), LocatorUtils.property(thatLocator, "internet", rhsInternet), lhsInternet, rhsInternet, (this.internet!= null), (that.internet!= null))) {
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
     *         &lt;element name="services" type="{http://feed.immobiliare.it}priceType" minOccurs="0"/&gt;
     *         &lt;element name="other" type="{http://feed.immobiliare.it}priceType" minOccurs="0"/&gt;
     *         &lt;element name="deposit" type="{http://feed.immobiliare.it}priceType" minOccurs="0"/&gt;
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public static class Costs implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        protected PriceType services;
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        protected PriceType other;
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        protected PriceType deposit;

        /**
         * Gets the value of the services property.
         * 
         * @return
         *     possible object is
         *     {@link PriceType }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public PriceType getServices() {
            return services;
        }

        /**
         * Sets the value of the services property.
         * 
         * @param value
         *     allowed object is
         *     {@link PriceType }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public void setServices(PriceType value) {
            this.services = value;
        }

        /**
         * Gets the value of the other property.
         * 
         * @return
         *     possible object is
         *     {@link PriceType }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public PriceType getOther() {
            return other;
        }

        /**
         * Sets the value of the other property.
         * 
         * @param value
         *     allowed object is
         *     {@link PriceType }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public void setOther(PriceType value) {
            this.other = value;
        }

        /**
         * Gets the value of the deposit property.
         * 
         * @return
         *     possible object is
         *     {@link PriceType }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public PriceType getDeposit() {
            return deposit;
        }

        /**
         * Sets the value of the deposit property.
         * 
         * @param value
         *     allowed object is
         *     {@link PriceType }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public void setDeposit(PriceType value) {
            this.deposit = value;
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
                PriceType theServices;
                theServices = this.getServices();
                strategy.appendField(locator, this, "services", buffer, theServices, (this.services!= null));
            }
            {
                PriceType theOther;
                theOther = this.getOther();
                strategy.appendField(locator, this, "other", buffer, theOther, (this.other!= null));
            }
            {
                PriceType theDeposit;
                theDeposit = this.getDeposit();
                strategy.appendField(locator, this, "deposit", buffer, theDeposit, (this.deposit!= null));
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
            if (draftCopy instanceof ExtraFeatures.Costs) {
                final ExtraFeatures.Costs copy = ((ExtraFeatures.Costs) draftCopy);
                {
                    Boolean servicesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.services!= null));
                    if (servicesShouldBeCopiedAndSet == Boolean.TRUE) {
                        PriceType sourceServices;
                        sourceServices = this.getServices();
                        PriceType copyServices = ((PriceType) strategy.copy(LocatorUtils.property(locator, "services", sourceServices), sourceServices, (this.services!= null)));
                        copy.setServices(copyServices);
                    } else {
                        if (servicesShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.services = null;
                        }
                    }
                }
                {
                    Boolean otherShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.other!= null));
                    if (otherShouldBeCopiedAndSet == Boolean.TRUE) {
                        PriceType sourceOther;
                        sourceOther = this.getOther();
                        PriceType copyOther = ((PriceType) strategy.copy(LocatorUtils.property(locator, "other", sourceOther), sourceOther, (this.other!= null)));
                        copy.setOther(copyOther);
                    } else {
                        if (otherShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.other = null;
                        }
                    }
                }
                {
                    Boolean depositShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.deposit!= null));
                    if (depositShouldBeCopiedAndSet == Boolean.TRUE) {
                        PriceType sourceDeposit;
                        sourceDeposit = this.getDeposit();
                        PriceType copyDeposit = ((PriceType) strategy.copy(LocatorUtils.property(locator, "deposit", sourceDeposit), sourceDeposit, (this.deposit!= null)));
                        copy.setDeposit(copyDeposit);
                    } else {
                        if (depositShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.deposit = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public Object createNewInstance() {
            return new ExtraFeatures.Costs();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final ExtraFeatures.Costs that = ((ExtraFeatures.Costs) object);
            {
                PriceType lhsServices;
                lhsServices = this.getServices();
                PriceType rhsServices;
                rhsServices = that.getServices();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "services", lhsServices), LocatorUtils.property(thatLocator, "services", rhsServices), lhsServices, rhsServices, (this.services!= null), (that.services!= null))) {
                    return false;
                }
            }
            {
                PriceType lhsOther;
                lhsOther = this.getOther();
                PriceType rhsOther;
                rhsOther = that.getOther();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "other", lhsOther), LocatorUtils.property(thatLocator, "other", rhsOther), lhsOther, rhsOther, (this.other!= null), (that.other!= null))) {
                    return false;
                }
            }
            {
                PriceType lhsDeposit;
                lhsDeposit = this.getDeposit();
                PriceType rhsDeposit;
                rhsDeposit = that.getDeposit();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "deposit", lhsDeposit), LocatorUtils.property(thatLocator, "deposit", rhsDeposit), lhsDeposit, rhsDeposit, (this.deposit!= null), (that.deposit!= null))) {
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
     *         &lt;element name="gender" type="{http://feed.immobiliare.it}genderType" minOccurs="0"/&gt;
     *         &lt;element name="couples" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="smoker" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="pets" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="age" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="from" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                 &lt;attribute name="to" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public static class Flatmate implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlElement(type = String.class)
        @XmlJavaTypeAdapter(Adapter19 .class)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        protected GenderType gender;
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        protected Boolean couples;
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        protected Boolean smoker;
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        protected Boolean pets;
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        protected ExtraFeatures.Flatmate.Age age;

        /**
         * Gets the value of the gender property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public GenderType getGender() {
            return gender;
        }

        /**
         * Sets the value of the gender property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public void setGender(GenderType value) {
            this.gender = value;
        }

        /**
         * Gets the value of the couples property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public Boolean getCouples() {
            return couples;
        }

        /**
         * Sets the value of the couples property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public void setCouples(Boolean value) {
            this.couples = value;
        }

        /**
         * Gets the value of the smoker property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public Boolean getSmoker() {
            return smoker;
        }

        /**
         * Sets the value of the smoker property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public void setSmoker(Boolean value) {
            this.smoker = value;
        }

        /**
         * Gets the value of the pets property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public Boolean getPets() {
            return pets;
        }

        /**
         * Sets the value of the pets property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public void setPets(Boolean value) {
            this.pets = value;
        }

        /**
         * Gets the value of the age property.
         * 
         * @return
         *     possible object is
         *     {@link ExtraFeatures.Flatmate.Age }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public ExtraFeatures.Flatmate.Age getAge() {
            return age;
        }

        /**
         * Sets the value of the age property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExtraFeatures.Flatmate.Age }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public void setAge(ExtraFeatures.Flatmate.Age value) {
            this.age = value;
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
                GenderType theGender;
                theGender = this.getGender();
                strategy.appendField(locator, this, "gender", buffer, theGender, (this.gender!= null));
            }
            {
                Boolean theCouples;
                theCouples = this.getCouples();
                strategy.appendField(locator, this, "couples", buffer, theCouples, (this.couples!= null));
            }
            {
                Boolean theSmoker;
                theSmoker = this.getSmoker();
                strategy.appendField(locator, this, "smoker", buffer, theSmoker, (this.smoker!= null));
            }
            {
                Boolean thePets;
                thePets = this.getPets();
                strategy.appendField(locator, this, "pets", buffer, thePets, (this.pets!= null));
            }
            {
                ExtraFeatures.Flatmate.Age theAge;
                theAge = this.getAge();
                strategy.appendField(locator, this, "age", buffer, theAge, (this.age!= null));
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
            if (draftCopy instanceof ExtraFeatures.Flatmate) {
                final ExtraFeatures.Flatmate copy = ((ExtraFeatures.Flatmate) draftCopy);
                {
                    Boolean genderShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gender!= null));
                    if (genderShouldBeCopiedAndSet == Boolean.TRUE) {
                        GenderType sourceGender;
                        sourceGender = this.getGender();
                        GenderType copyGender = ((GenderType) strategy.copy(LocatorUtils.property(locator, "gender", sourceGender), sourceGender, (this.gender!= null)));
                        copy.setGender(copyGender);
                    } else {
                        if (genderShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.gender = null;
                        }
                    }
                }
                {
                    Boolean couplesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.couples!= null));
                    if (couplesShouldBeCopiedAndSet == Boolean.TRUE) {
                        Boolean sourceCouples;
                        sourceCouples = this.getCouples();
                        Boolean copyCouples = ((Boolean) strategy.copy(LocatorUtils.property(locator, "couples", sourceCouples), sourceCouples, (this.couples!= null)));
                        copy.setCouples(copyCouples);
                    } else {
                        if (couplesShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.couples = null;
                        }
                    }
                }
                {
                    Boolean smokerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.smoker!= null));
                    if (smokerShouldBeCopiedAndSet == Boolean.TRUE) {
                        Boolean sourceSmoker;
                        sourceSmoker = this.getSmoker();
                        Boolean copySmoker = ((Boolean) strategy.copy(LocatorUtils.property(locator, "smoker", sourceSmoker), sourceSmoker, (this.smoker!= null)));
                        copy.setSmoker(copySmoker);
                    } else {
                        if (smokerShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.smoker = null;
                        }
                    }
                }
                {
                    Boolean petsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pets!= null));
                    if (petsShouldBeCopiedAndSet == Boolean.TRUE) {
                        Boolean sourcePets;
                        sourcePets = this.getPets();
                        Boolean copyPets = ((Boolean) strategy.copy(LocatorUtils.property(locator, "pets", sourcePets), sourcePets, (this.pets!= null)));
                        copy.setPets(copyPets);
                    } else {
                        if (petsShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.pets = null;
                        }
                    }
                }
                {
                    Boolean ageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.age!= null));
                    if (ageShouldBeCopiedAndSet == Boolean.TRUE) {
                        ExtraFeatures.Flatmate.Age sourceAge;
                        sourceAge = this.getAge();
                        ExtraFeatures.Flatmate.Age copyAge = ((ExtraFeatures.Flatmate.Age) strategy.copy(LocatorUtils.property(locator, "age", sourceAge), sourceAge, (this.age!= null)));
                        copy.setAge(copyAge);
                    } else {
                        if (ageShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.age = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public Object createNewInstance() {
            return new ExtraFeatures.Flatmate();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final ExtraFeatures.Flatmate that = ((ExtraFeatures.Flatmate) object);
            {
                GenderType lhsGender;
                lhsGender = this.getGender();
                GenderType rhsGender;
                rhsGender = that.getGender();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "gender", lhsGender), LocatorUtils.property(thatLocator, "gender", rhsGender), lhsGender, rhsGender, (this.gender!= null), (that.gender!= null))) {
                    return false;
                }
            }
            {
                Boolean lhsCouples;
                lhsCouples = this.getCouples();
                Boolean rhsCouples;
                rhsCouples = that.getCouples();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "couples", lhsCouples), LocatorUtils.property(thatLocator, "couples", rhsCouples), lhsCouples, rhsCouples, (this.couples!= null), (that.couples!= null))) {
                    return false;
                }
            }
            {
                Boolean lhsSmoker;
                lhsSmoker = this.getSmoker();
                Boolean rhsSmoker;
                rhsSmoker = that.getSmoker();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "smoker", lhsSmoker), LocatorUtils.property(thatLocator, "smoker", rhsSmoker), lhsSmoker, rhsSmoker, (this.smoker!= null), (that.smoker!= null))) {
                    return false;
                }
            }
            {
                Boolean lhsPets;
                lhsPets = this.getPets();
                Boolean rhsPets;
                rhsPets = that.getPets();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "pets", lhsPets), LocatorUtils.property(thatLocator, "pets", rhsPets), lhsPets, rhsPets, (this.pets!= null), (that.pets!= null))) {
                    return false;
                }
            }
            {
                ExtraFeatures.Flatmate.Age lhsAge;
                lhsAge = this.getAge();
                ExtraFeatures.Flatmate.Age rhsAge;
                rhsAge = that.getAge();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "age", lhsAge), LocatorUtils.property(thatLocator, "age", rhsAge), lhsAge, rhsAge, (this.age!= null), (that.age!= null))) {
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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attribute name="from" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *       &lt;attribute name="to" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public static class Age implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
        {

            @XmlAttribute(name = "from")
            @XmlJavaTypeAdapter(Adapter5 .class)
            @XmlSchemaType(name = "int")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
            protected BigInteger from;
            @XmlAttribute(name = "to")
            @XmlJavaTypeAdapter(Adapter5 .class)
            @XmlSchemaType(name = "int")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
            protected BigInteger to;

            /**
             * Gets the value of the from property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
            public BigInteger getFrom() {
                return from;
            }

            /**
             * Sets the value of the from property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
            public void setFrom(BigInteger value) {
                this.from = value;
            }

            /**
             * Gets the value of the to property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
            public BigInteger getTo() {
                return to;
            }

            /**
             * Sets the value of the to property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
            public void setTo(BigInteger value) {
                this.to = value;
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
                    BigInteger theFrom;
                    theFrom = this.getFrom();
                    strategy.appendField(locator, this, "from", buffer, theFrom, (this.from!= null));
                }
                {
                    BigInteger theTo;
                    theTo = this.getTo();
                    strategy.appendField(locator, this, "to", buffer, theTo, (this.to!= null));
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
                if (draftCopy instanceof ExtraFeatures.Flatmate.Age) {
                    final ExtraFeatures.Flatmate.Age copy = ((ExtraFeatures.Flatmate.Age) draftCopy);
                    {
                        Boolean fromShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.from!= null));
                        if (fromShouldBeCopiedAndSet == Boolean.TRUE) {
                            BigInteger sourceFrom;
                            sourceFrom = this.getFrom();
                            BigInteger copyFrom = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "from", sourceFrom), sourceFrom, (this.from!= null)));
                            copy.setFrom(copyFrom);
                        } else {
                            if (fromShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.from = null;
                            }
                        }
                    }
                    {
                        Boolean toShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.to!= null));
                        if (toShouldBeCopiedAndSet == Boolean.TRUE) {
                            BigInteger sourceTo;
                            sourceTo = this.getTo();
                            BigInteger copyTo = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "to", sourceTo), sourceTo, (this.to!= null)));
                            copy.setTo(copyTo);
                        } else {
                            if (toShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.to = null;
                            }
                        }
                    }
                }
                return draftCopy;
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
            public Object createNewInstance() {
                return new ExtraFeatures.Flatmate.Age();
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
            public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                if ((object == null)||(this.getClass()!= object.getClass())) {
                    return false;
                }
                if (this == object) {
                    return true;
                }
                final ExtraFeatures.Flatmate.Age that = ((ExtraFeatures.Flatmate.Age) object);
                {
                    BigInteger lhsFrom;
                    lhsFrom = this.getFrom();
                    BigInteger rhsFrom;
                    rhsFrom = that.getFrom();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "from", lhsFrom), LocatorUtils.property(thatLocator, "from", rhsFrom), lhsFrom, rhsFrom, (this.from!= null), (that.from!= null))) {
                        return false;
                    }
                }
                {
                    BigInteger lhsTo;
                    lhsTo = this.getTo();
                    BigInteger rhsTo;
                    rhsTo = that.getTo();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "to", lhsTo), LocatorUtils.property(thatLocator, "to", rhsTo), lhsTo, rhsTo, (this.to!= null), (that.to!= null))) {
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

    }

}
