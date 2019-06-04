
package org.openestate.io.immobar_it.xml;

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
import org.openestate.io.immobar_it.xml.types.ImmotypeValue;
import org.openestate.io.immobar_it.xml.types.RevenuetypeValue;


/**
 * A property to transfer.
 * 
 * <p>Java class for PropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="referencenumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contactpersonname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ISTATcode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="address_de" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="address_it" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="location_de" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="location_it" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="district_de" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="district_it" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postalcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="latitude" type="{}LatitudeValue" minOccurs="0"/&gt;
 *         &lt;element name="longitude" type="{}LongitudeValue" minOccurs="0"/&gt;
 *         &lt;element name="title_de" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="title_it" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="immotype" type="{}ImmotypeValue"/&gt;
 *         &lt;element name="revenuetype" type="{}RevenuetypeValue"/&gt;
 *         &lt;element name="sqm_sale" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="sqm_net" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="sqm_gross" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="floor" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="flooristop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="floorisground" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="duplex" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="countrooms" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="countbathrooms" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="kitchentype_de" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kitchentype_it" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countterrace" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="cellar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="sqm_cellar" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="garden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="sqm_garden" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="countgarage" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="countparkinglot" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="parkinglottype_de" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parkinglottype_it" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="elevator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="description_de" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="description_it" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="used" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="furnished" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="energyclass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ipe" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="heating_de" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="heating_it" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="convention" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="price_on_request" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="price_net" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="commission" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="utilities" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="8" minOccurs="0"/&gt;
 *         &lt;element name="planimetry" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="creationdate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="lastmoddate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyType", propOrder = {
    "id",
    "referencenumber",
    "contactpersonname",
    "istaTcode",
    "addressDe",
    "addressIt",
    "locationDe",
    "locationIt",
    "districtDe",
    "districtIt",
    "postalcode",
    "province",
    "country",
    "latitude",
    "longitude",
    "titleDe",
    "titleIt",
    "immotype",
    "revenuetype",
    "sqmSale",
    "sqmNet",
    "sqmGross",
    "floor",
    "flooristop",
    "floorisground",
    "duplex",
    "countrooms",
    "countbathrooms",
    "kitchentypeDe",
    "kitchentypeIt",
    "countterrace",
    "cellar",
    "sqmCellar",
    "garden",
    "sqmGarden",
    "countgarage",
    "countparkinglot",
    "parkinglottypeDe",
    "parkinglottypeIt",
    "elevator",
    "descriptionDe",
    "descriptionIt",
    "used",
    "furnished",
    "energyclass",
    "ipe",
    "heatingDe",
    "heatingIt",
    "convention",
    "priceOnRequest",
    "priceNet",
    "commission",
    "utilities",
    "image",
    "planimetry",
    "creationdate",
    "lastmoddate"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
public class PropertyType implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String id;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String referencenumber;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String contactpersonname;
    @XmlElement(name = "ISTATcode", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String istaTcode;
    @XmlElement(name = "address_de")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String addressDe;
    @XmlElement(name = "address_it")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String addressIt;
    @XmlElement(name = "location_de")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String locationDe;
    @XmlElement(name = "location_it")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String locationIt;
    @XmlElement(name = "district_de")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String districtDe;
    @XmlElement(name = "district_it")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String districtIt;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String postalcode;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String province;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String country;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "decimal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal latitude;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "decimal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal longitude;
    @XmlElement(name = "title_de", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String titleDe;
    @XmlElement(name = "title_it", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String titleIt;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected ImmotypeValue immotype;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter6 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected RevenuetypeValue revenuetype;
    @XmlElement(name = "sqm_sale")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal sqmSale;
    @XmlElement(name = "sqm_net")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal sqmNet;
    @XmlElement(name = "sqm_gross")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal sqmGross;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected BigInteger floor;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean flooristop;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean floorisground;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean duplex;
    @XmlSchemaType(name = "positiveInteger")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected BigInteger countrooms;
    @XmlSchemaType(name = "positiveInteger")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected BigInteger countbathrooms;
    @XmlElement(name = "kitchentype_de")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String kitchentypeDe;
    @XmlElement(name = "kitchentype_it")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String kitchentypeIt;
    @XmlSchemaType(name = "positiveInteger")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected BigInteger countterrace;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean cellar;
    @XmlElement(name = "sqm_cellar")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal sqmCellar;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean garden;
    @XmlElement(name = "sqm_garden")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal sqmGarden;
    @XmlSchemaType(name = "positiveInteger")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected BigInteger countgarage;
    @XmlSchemaType(name = "positiveInteger")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected BigInteger countparkinglot;
    @XmlElement(name = "parkinglottype_de")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String parkinglottypeDe;
    @XmlElement(name = "parkinglottype_it")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String parkinglottypeIt;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean elevator;
    @XmlElement(name = "description_de", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String descriptionDe;
    @XmlElement(name = "description_it", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String descriptionIt;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean used;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean furnished;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String energyclass;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal ipe;
    @XmlElement(name = "heating_de")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String heatingDe;
    @XmlElement(name = "heating_it")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String heatingIt;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean convention;
    @XmlElement(name = "price_on_request")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected boolean priceOnRequest;
    @XmlElement(name = "price_net", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal priceNet;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean commission;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal utilities;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected List<URI> image;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected List<URI> planimetry;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected Calendar creationdate;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected Calendar lastmoddate;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the referencenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getReferencenumber() {
        return referencenumber;
    }

    /**
     * Sets the value of the referencenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setReferencenumber(String value) {
        this.referencenumber = value;
    }

    /**
     * Gets the value of the contactpersonname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getContactpersonname() {
        return contactpersonname;
    }

    /**
     * Sets the value of the contactpersonname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setContactpersonname(String value) {
        this.contactpersonname = value;
    }

    /**
     * Gets the value of the istaTcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getISTATcode() {
        return istaTcode;
    }

    /**
     * Sets the value of the istaTcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setISTATcode(String value) {
        this.istaTcode = value;
    }

    /**
     * Gets the value of the addressDe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getAddressDe() {
        return addressDe;
    }

    /**
     * Sets the value of the addressDe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setAddressDe(String value) {
        this.addressDe = value;
    }

    /**
     * Gets the value of the addressIt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getAddressIt() {
        return addressIt;
    }

    /**
     * Sets the value of the addressIt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setAddressIt(String value) {
        this.addressIt = value;
    }

    /**
     * Gets the value of the locationDe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getLocationDe() {
        return locationDe;
    }

    /**
     * Sets the value of the locationDe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setLocationDe(String value) {
        this.locationDe = value;
    }

    /**
     * Gets the value of the locationIt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getLocationIt() {
        return locationIt;
    }

    /**
     * Sets the value of the locationIt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setLocationIt(String value) {
        this.locationIt = value;
    }

    /**
     * Gets the value of the districtDe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getDistrictDe() {
        return districtDe;
    }

    /**
     * Sets the value of the districtDe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setDistrictDe(String value) {
        this.districtDe = value;
    }

    /**
     * Gets the value of the districtIt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getDistrictIt() {
        return districtIt;
    }

    /**
     * Sets the value of the districtIt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setDistrictIt(String value) {
        this.districtIt = value;
    }

    /**
     * Gets the value of the postalcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getPostalcode() {
        return postalcode;
    }

    /**
     * Sets the value of the postalcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setPostalcode(String value) {
        this.postalcode = value;
    }

    /**
     * Gets the value of the province property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getProvince() {
        return province;
    }

    /**
     * Sets the value of the province property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setProvince(String value) {
        this.province = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setLongitude(BigDecimal value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the titleDe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getTitleDe() {
        return titleDe;
    }

    /**
     * Sets the value of the titleDe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setTitleDe(String value) {
        this.titleDe = value;
    }

    /**
     * Gets the value of the titleIt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getTitleIt() {
        return titleIt;
    }

    /**
     * Sets the value of the titleIt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setTitleIt(String value) {
        this.titleIt = value;
    }

    /**
     * Gets the value of the immotype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public ImmotypeValue getImmotype() {
        return immotype;
    }

    /**
     * Sets the value of the immotype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setImmotype(ImmotypeValue value) {
        this.immotype = value;
    }

    /**
     * Gets the value of the revenuetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public RevenuetypeValue getRevenuetype() {
        return revenuetype;
    }

    /**
     * Sets the value of the revenuetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setRevenuetype(RevenuetypeValue value) {
        this.revenuetype = value;
    }

    /**
     * Gets the value of the sqmSale property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public BigDecimal getSqmSale() {
        return sqmSale;
    }

    /**
     * Sets the value of the sqmSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setSqmSale(BigDecimal value) {
        this.sqmSale = value;
    }

    /**
     * Gets the value of the sqmNet property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public BigDecimal getSqmNet() {
        return sqmNet;
    }

    /**
     * Sets the value of the sqmNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setSqmNet(BigDecimal value) {
        this.sqmNet = value;
    }

    /**
     * Gets the value of the sqmGross property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public BigDecimal getSqmGross() {
        return sqmGross;
    }

    /**
     * Sets the value of the sqmGross property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setSqmGross(BigDecimal value) {
        this.sqmGross = value;
    }

    /**
     * Gets the value of the floor property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public BigInteger getFloor() {
        return floor;
    }

    /**
     * Sets the value of the floor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setFloor(BigInteger value) {
        this.floor = value;
    }

    /**
     * Gets the value of the flooristop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getFlooristop() {
        return flooristop;
    }

    /**
     * Sets the value of the flooristop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setFlooristop(Boolean value) {
        this.flooristop = value;
    }

    /**
     * Gets the value of the floorisground property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getFloorisground() {
        return floorisground;
    }

    /**
     * Sets the value of the floorisground property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setFloorisground(Boolean value) {
        this.floorisground = value;
    }

    /**
     * Gets the value of the duplex property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getDuplex() {
        return duplex;
    }

    /**
     * Sets the value of the duplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setDuplex(Boolean value) {
        this.duplex = value;
    }

    /**
     * Gets the value of the countrooms property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public BigInteger getCountrooms() {
        return countrooms;
    }

    /**
     * Sets the value of the countrooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setCountrooms(BigInteger value) {
        this.countrooms = value;
    }

    /**
     * Gets the value of the countbathrooms property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public BigInteger getCountbathrooms() {
        return countbathrooms;
    }

    /**
     * Sets the value of the countbathrooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setCountbathrooms(BigInteger value) {
        this.countbathrooms = value;
    }

    /**
     * Gets the value of the kitchentypeDe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getKitchentypeDe() {
        return kitchentypeDe;
    }

    /**
     * Sets the value of the kitchentypeDe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setKitchentypeDe(String value) {
        this.kitchentypeDe = value;
    }

    /**
     * Gets the value of the kitchentypeIt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getKitchentypeIt() {
        return kitchentypeIt;
    }

    /**
     * Sets the value of the kitchentypeIt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setKitchentypeIt(String value) {
        this.kitchentypeIt = value;
    }

    /**
     * Gets the value of the countterrace property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public BigInteger getCountterrace() {
        return countterrace;
    }

    /**
     * Sets the value of the countterrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setCountterrace(BigInteger value) {
        this.countterrace = value;
    }

    /**
     * Gets the value of the cellar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getCellar() {
        return cellar;
    }

    /**
     * Sets the value of the cellar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setCellar(Boolean value) {
        this.cellar = value;
    }

    /**
     * Gets the value of the sqmCellar property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public BigDecimal getSqmCellar() {
        return sqmCellar;
    }

    /**
     * Sets the value of the sqmCellar property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setSqmCellar(BigDecimal value) {
        this.sqmCellar = value;
    }

    /**
     * Gets the value of the garden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getGarden() {
        return garden;
    }

    /**
     * Sets the value of the garden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setGarden(Boolean value) {
        this.garden = value;
    }

    /**
     * Gets the value of the sqmGarden property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public BigDecimal getSqmGarden() {
        return sqmGarden;
    }

    /**
     * Sets the value of the sqmGarden property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setSqmGarden(BigDecimal value) {
        this.sqmGarden = value;
    }

    /**
     * Gets the value of the countgarage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public BigInteger getCountgarage() {
        return countgarage;
    }

    /**
     * Sets the value of the countgarage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setCountgarage(BigInteger value) {
        this.countgarage = value;
    }

    /**
     * Gets the value of the countparkinglot property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public BigInteger getCountparkinglot() {
        return countparkinglot;
    }

    /**
     * Sets the value of the countparkinglot property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setCountparkinglot(BigInteger value) {
        this.countparkinglot = value;
    }

    /**
     * Gets the value of the parkinglottypeDe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getParkinglottypeDe() {
        return parkinglottypeDe;
    }

    /**
     * Sets the value of the parkinglottypeDe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setParkinglottypeDe(String value) {
        this.parkinglottypeDe = value;
    }

    /**
     * Gets the value of the parkinglottypeIt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getParkinglottypeIt() {
        return parkinglottypeIt;
    }

    /**
     * Sets the value of the parkinglottypeIt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setParkinglottypeIt(String value) {
        this.parkinglottypeIt = value;
    }

    /**
     * Gets the value of the elevator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setElevator(Boolean value) {
        this.elevator = value;
    }

    /**
     * Gets the value of the descriptionDe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getDescriptionDe() {
        return descriptionDe;
    }

    /**
     * Sets the value of the descriptionDe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setDescriptionDe(String value) {
        this.descriptionDe = value;
    }

    /**
     * Gets the value of the descriptionIt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getDescriptionIt() {
        return descriptionIt;
    }

    /**
     * Sets the value of the descriptionIt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setDescriptionIt(String value) {
        this.descriptionIt = value;
    }

    /**
     * Gets the value of the used property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getUsed() {
        return used;
    }

    /**
     * Sets the value of the used property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setUsed(Boolean value) {
        this.used = value;
    }

    /**
     * Gets the value of the furnished property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getFurnished() {
        return furnished;
    }

    /**
     * Sets the value of the furnished property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setFurnished(Boolean value) {
        this.furnished = value;
    }

    /**
     * Gets the value of the energyclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getEnergyclass() {
        return energyclass;
    }

    /**
     * Sets the value of the energyclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setEnergyclass(String value) {
        this.energyclass = value;
    }

    /**
     * Gets the value of the ipe property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public BigDecimal getIpe() {
        return ipe;
    }

    /**
     * Sets the value of the ipe property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setIpe(BigDecimal value) {
        this.ipe = value;
    }

    /**
     * Gets the value of the heatingDe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getHeatingDe() {
        return heatingDe;
    }

    /**
     * Sets the value of the heatingDe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setHeatingDe(String value) {
        this.heatingDe = value;
    }

    /**
     * Gets the value of the heatingIt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getHeatingIt() {
        return heatingIt;
    }

    /**
     * Sets the value of the heatingIt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setHeatingIt(String value) {
        this.heatingIt = value;
    }

    /**
     * Gets the value of the convention property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getConvention() {
        return convention;
    }

    /**
     * Sets the value of the convention property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setConvention(Boolean value) {
        this.convention = value;
    }

    /**
     * Gets the value of the priceOnRequest property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public boolean isPriceOnRequest() {
        return priceOnRequest;
    }

    /**
     * Sets the value of the priceOnRequest property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setPriceOnRequest(boolean value) {
        this.priceOnRequest = value;
    }

    /**
     * Gets the value of the priceNet property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public BigDecimal getPriceNet() {
        return priceNet;
    }

    /**
     * Sets the value of the priceNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setPriceNet(BigDecimal value) {
        this.priceNet = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setCommission(Boolean value) {
        this.commission = value;
    }

    /**
     * Gets the value of the utilities property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public BigDecimal getUtilities() {
        return utilities;
    }

    /**
     * Sets the value of the utilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setUtilities(BigDecimal value) {
        this.utilities = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the image property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public List<URI> getImage() {
        if (image == null) {
            image = new ArrayList<URI>();
        }
        return this.image;
    }

    /**
     * Gets the value of the planimetry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the planimetry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlanimetry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public List<URI> getPlanimetry() {
        if (planimetry == null) {
            planimetry = new ArrayList<URI>();
        }
        return this.planimetry;
    }

    /**
     * Gets the value of the creationdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public Calendar getCreationdate() {
        return creationdate;
    }

    /**
     * Sets the value of the creationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setCreationdate(Calendar value) {
        this.creationdate = value;
    }

    /**
     * Gets the value of the lastmoddate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public Calendar getLastmoddate() {
        return lastmoddate;
    }

    /**
     * Sets the value of the lastmoddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setLastmoddate(Calendar value) {
        this.lastmoddate = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId, (this.id!= null));
        }
        {
            String theReferencenumber;
            theReferencenumber = this.getReferencenumber();
            strategy.appendField(locator, this, "referencenumber", buffer, theReferencenumber, (this.referencenumber!= null));
        }
        {
            String theContactpersonname;
            theContactpersonname = this.getContactpersonname();
            strategy.appendField(locator, this, "contactpersonname", buffer, theContactpersonname, (this.contactpersonname!= null));
        }
        {
            String theISTATcode;
            theISTATcode = this.getISTATcode();
            strategy.appendField(locator, this, "istaTcode", buffer, theISTATcode, (this.istaTcode!= null));
        }
        {
            String theAddressDe;
            theAddressDe = this.getAddressDe();
            strategy.appendField(locator, this, "addressDe", buffer, theAddressDe, (this.addressDe!= null));
        }
        {
            String theAddressIt;
            theAddressIt = this.getAddressIt();
            strategy.appendField(locator, this, "addressIt", buffer, theAddressIt, (this.addressIt!= null));
        }
        {
            String theLocationDe;
            theLocationDe = this.getLocationDe();
            strategy.appendField(locator, this, "locationDe", buffer, theLocationDe, (this.locationDe!= null));
        }
        {
            String theLocationIt;
            theLocationIt = this.getLocationIt();
            strategy.appendField(locator, this, "locationIt", buffer, theLocationIt, (this.locationIt!= null));
        }
        {
            String theDistrictDe;
            theDistrictDe = this.getDistrictDe();
            strategy.appendField(locator, this, "districtDe", buffer, theDistrictDe, (this.districtDe!= null));
        }
        {
            String theDistrictIt;
            theDistrictIt = this.getDistrictIt();
            strategy.appendField(locator, this, "districtIt", buffer, theDistrictIt, (this.districtIt!= null));
        }
        {
            String thePostalcode;
            thePostalcode = this.getPostalcode();
            strategy.appendField(locator, this, "postalcode", buffer, thePostalcode, (this.postalcode!= null));
        }
        {
            String theProvince;
            theProvince = this.getProvince();
            strategy.appendField(locator, this, "province", buffer, theProvince, (this.province!= null));
        }
        {
            String theCountry;
            theCountry = this.getCountry();
            strategy.appendField(locator, this, "country", buffer, theCountry, (this.country!= null));
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
            String theTitleDe;
            theTitleDe = this.getTitleDe();
            strategy.appendField(locator, this, "titleDe", buffer, theTitleDe, (this.titleDe!= null));
        }
        {
            String theTitleIt;
            theTitleIt = this.getTitleIt();
            strategy.appendField(locator, this, "titleIt", buffer, theTitleIt, (this.titleIt!= null));
        }
        {
            ImmotypeValue theImmotype;
            theImmotype = this.getImmotype();
            strategy.appendField(locator, this, "immotype", buffer, theImmotype, (this.immotype!= null));
        }
        {
            RevenuetypeValue theRevenuetype;
            theRevenuetype = this.getRevenuetype();
            strategy.appendField(locator, this, "revenuetype", buffer, theRevenuetype, (this.revenuetype!= null));
        }
        {
            BigDecimal theSqmSale;
            theSqmSale = this.getSqmSale();
            strategy.appendField(locator, this, "sqmSale", buffer, theSqmSale, (this.sqmSale!= null));
        }
        {
            BigDecimal theSqmNet;
            theSqmNet = this.getSqmNet();
            strategy.appendField(locator, this, "sqmNet", buffer, theSqmNet, (this.sqmNet!= null));
        }
        {
            BigDecimal theSqmGross;
            theSqmGross = this.getSqmGross();
            strategy.appendField(locator, this, "sqmGross", buffer, theSqmGross, (this.sqmGross!= null));
        }
        {
            BigInteger theFloor;
            theFloor = this.getFloor();
            strategy.appendField(locator, this, "floor", buffer, theFloor, (this.floor!= null));
        }
        {
            Boolean theFlooristop;
            theFlooristop = this.getFlooristop();
            strategy.appendField(locator, this, "flooristop", buffer, theFlooristop, (this.flooristop!= null));
        }
        {
            Boolean theFloorisground;
            theFloorisground = this.getFloorisground();
            strategy.appendField(locator, this, "floorisground", buffer, theFloorisground, (this.floorisground!= null));
        }
        {
            Boolean theDuplex;
            theDuplex = this.getDuplex();
            strategy.appendField(locator, this, "duplex", buffer, theDuplex, (this.duplex!= null));
        }
        {
            BigInteger theCountrooms;
            theCountrooms = this.getCountrooms();
            strategy.appendField(locator, this, "countrooms", buffer, theCountrooms, (this.countrooms!= null));
        }
        {
            BigInteger theCountbathrooms;
            theCountbathrooms = this.getCountbathrooms();
            strategy.appendField(locator, this, "countbathrooms", buffer, theCountbathrooms, (this.countbathrooms!= null));
        }
        {
            String theKitchentypeDe;
            theKitchentypeDe = this.getKitchentypeDe();
            strategy.appendField(locator, this, "kitchentypeDe", buffer, theKitchentypeDe, (this.kitchentypeDe!= null));
        }
        {
            String theKitchentypeIt;
            theKitchentypeIt = this.getKitchentypeIt();
            strategy.appendField(locator, this, "kitchentypeIt", buffer, theKitchentypeIt, (this.kitchentypeIt!= null));
        }
        {
            BigInteger theCountterrace;
            theCountterrace = this.getCountterrace();
            strategy.appendField(locator, this, "countterrace", buffer, theCountterrace, (this.countterrace!= null));
        }
        {
            Boolean theCellar;
            theCellar = this.getCellar();
            strategy.appendField(locator, this, "cellar", buffer, theCellar, (this.cellar!= null));
        }
        {
            BigDecimal theSqmCellar;
            theSqmCellar = this.getSqmCellar();
            strategy.appendField(locator, this, "sqmCellar", buffer, theSqmCellar, (this.sqmCellar!= null));
        }
        {
            Boolean theGarden;
            theGarden = this.getGarden();
            strategy.appendField(locator, this, "garden", buffer, theGarden, (this.garden!= null));
        }
        {
            BigDecimal theSqmGarden;
            theSqmGarden = this.getSqmGarden();
            strategy.appendField(locator, this, "sqmGarden", buffer, theSqmGarden, (this.sqmGarden!= null));
        }
        {
            BigInteger theCountgarage;
            theCountgarage = this.getCountgarage();
            strategy.appendField(locator, this, "countgarage", buffer, theCountgarage, (this.countgarage!= null));
        }
        {
            BigInteger theCountparkinglot;
            theCountparkinglot = this.getCountparkinglot();
            strategy.appendField(locator, this, "countparkinglot", buffer, theCountparkinglot, (this.countparkinglot!= null));
        }
        {
            String theParkinglottypeDe;
            theParkinglottypeDe = this.getParkinglottypeDe();
            strategy.appendField(locator, this, "parkinglottypeDe", buffer, theParkinglottypeDe, (this.parkinglottypeDe!= null));
        }
        {
            String theParkinglottypeIt;
            theParkinglottypeIt = this.getParkinglottypeIt();
            strategy.appendField(locator, this, "parkinglottypeIt", buffer, theParkinglottypeIt, (this.parkinglottypeIt!= null));
        }
        {
            Boolean theElevator;
            theElevator = this.getElevator();
            strategy.appendField(locator, this, "elevator", buffer, theElevator, (this.elevator!= null));
        }
        {
            String theDescriptionDe;
            theDescriptionDe = this.getDescriptionDe();
            strategy.appendField(locator, this, "descriptionDe", buffer, theDescriptionDe, (this.descriptionDe!= null));
        }
        {
            String theDescriptionIt;
            theDescriptionIt = this.getDescriptionIt();
            strategy.appendField(locator, this, "descriptionIt", buffer, theDescriptionIt, (this.descriptionIt!= null));
        }
        {
            Boolean theUsed;
            theUsed = this.getUsed();
            strategy.appendField(locator, this, "used", buffer, theUsed, (this.used!= null));
        }
        {
            Boolean theFurnished;
            theFurnished = this.getFurnished();
            strategy.appendField(locator, this, "furnished", buffer, theFurnished, (this.furnished!= null));
        }
        {
            String theEnergyclass;
            theEnergyclass = this.getEnergyclass();
            strategy.appendField(locator, this, "energyclass", buffer, theEnergyclass, (this.energyclass!= null));
        }
        {
            BigDecimal theIpe;
            theIpe = this.getIpe();
            strategy.appendField(locator, this, "ipe", buffer, theIpe, (this.ipe!= null));
        }
        {
            String theHeatingDe;
            theHeatingDe = this.getHeatingDe();
            strategy.appendField(locator, this, "heatingDe", buffer, theHeatingDe, (this.heatingDe!= null));
        }
        {
            String theHeatingIt;
            theHeatingIt = this.getHeatingIt();
            strategy.appendField(locator, this, "heatingIt", buffer, theHeatingIt, (this.heatingIt!= null));
        }
        {
            Boolean theConvention;
            theConvention = this.getConvention();
            strategy.appendField(locator, this, "convention", buffer, theConvention, (this.convention!= null));
        }
        {
            boolean thePriceOnRequest;
            thePriceOnRequest = this.isPriceOnRequest();
            strategy.appendField(locator, this, "priceOnRequest", buffer, thePriceOnRequest, true);
        }
        {
            BigDecimal thePriceNet;
            thePriceNet = this.getPriceNet();
            strategy.appendField(locator, this, "priceNet", buffer, thePriceNet, (this.priceNet!= null));
        }
        {
            Boolean theCommission;
            theCommission = this.getCommission();
            strategy.appendField(locator, this, "commission", buffer, theCommission, (this.commission!= null));
        }
        {
            BigDecimal theUtilities;
            theUtilities = this.getUtilities();
            strategy.appendField(locator, this, "utilities", buffer, theUtilities, (this.utilities!= null));
        }
        {
            List<URI> theImage;
            theImage = (((this.image!= null)&&(!this.image.isEmpty()))?this.getImage():null);
            strategy.appendField(locator, this, "image", buffer, theImage, ((this.image!= null)&&(!this.image.isEmpty())));
        }
        {
            List<URI> thePlanimetry;
            thePlanimetry = (((this.planimetry!= null)&&(!this.planimetry.isEmpty()))?this.getPlanimetry():null);
            strategy.appendField(locator, this, "planimetry", buffer, thePlanimetry, ((this.planimetry!= null)&&(!this.planimetry.isEmpty())));
        }
        {
            Calendar theCreationdate;
            theCreationdate = this.getCreationdate();
            strategy.appendField(locator, this, "creationdate", buffer, theCreationdate, (this.creationdate!= null));
        }
        {
            Calendar theLastmoddate;
            theLastmoddate = this.getLastmoddate();
            strategy.appendField(locator, this, "lastmoddate", buffer, theLastmoddate, (this.lastmoddate!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof PropertyType) {
            final PropertyType copy = ((PropertyType) draftCopy);
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
                Boolean referencenumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.referencenumber!= null));
                if (referencenumberShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceReferencenumber;
                    sourceReferencenumber = this.getReferencenumber();
                    String copyReferencenumber = ((String) strategy.copy(LocatorUtils.property(locator, "referencenumber", sourceReferencenumber), sourceReferencenumber, (this.referencenumber!= null)));
                    copy.setReferencenumber(copyReferencenumber);
                } else {
                    if (referencenumberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.referencenumber = null;
                    }
                }
            }
            {
                Boolean contactpersonnameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.contactpersonname!= null));
                if (contactpersonnameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceContactpersonname;
                    sourceContactpersonname = this.getContactpersonname();
                    String copyContactpersonname = ((String) strategy.copy(LocatorUtils.property(locator, "contactpersonname", sourceContactpersonname), sourceContactpersonname, (this.contactpersonname!= null)));
                    copy.setContactpersonname(copyContactpersonname);
                } else {
                    if (contactpersonnameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.contactpersonname = null;
                    }
                }
            }
            {
                Boolean istaTcodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.istaTcode!= null));
                if (istaTcodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceISTATcode;
                    sourceISTATcode = this.getISTATcode();
                    String copyISTATcode = ((String) strategy.copy(LocatorUtils.property(locator, "istaTcode", sourceISTATcode), sourceISTATcode, (this.istaTcode!= null)));
                    copy.setISTATcode(copyISTATcode);
                } else {
                    if (istaTcodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.istaTcode = null;
                    }
                }
            }
            {
                Boolean addressDeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.addressDe!= null));
                if (addressDeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAddressDe;
                    sourceAddressDe = this.getAddressDe();
                    String copyAddressDe = ((String) strategy.copy(LocatorUtils.property(locator, "addressDe", sourceAddressDe), sourceAddressDe, (this.addressDe!= null)));
                    copy.setAddressDe(copyAddressDe);
                } else {
                    if (addressDeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.addressDe = null;
                    }
                }
            }
            {
                Boolean addressItShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.addressIt!= null));
                if (addressItShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAddressIt;
                    sourceAddressIt = this.getAddressIt();
                    String copyAddressIt = ((String) strategy.copy(LocatorUtils.property(locator, "addressIt", sourceAddressIt), sourceAddressIt, (this.addressIt!= null)));
                    copy.setAddressIt(copyAddressIt);
                } else {
                    if (addressItShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.addressIt = null;
                    }
                }
            }
            {
                Boolean locationDeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.locationDe!= null));
                if (locationDeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceLocationDe;
                    sourceLocationDe = this.getLocationDe();
                    String copyLocationDe = ((String) strategy.copy(LocatorUtils.property(locator, "locationDe", sourceLocationDe), sourceLocationDe, (this.locationDe!= null)));
                    copy.setLocationDe(copyLocationDe);
                } else {
                    if (locationDeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.locationDe = null;
                    }
                }
            }
            {
                Boolean locationItShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.locationIt!= null));
                if (locationItShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceLocationIt;
                    sourceLocationIt = this.getLocationIt();
                    String copyLocationIt = ((String) strategy.copy(LocatorUtils.property(locator, "locationIt", sourceLocationIt), sourceLocationIt, (this.locationIt!= null)));
                    copy.setLocationIt(copyLocationIt);
                } else {
                    if (locationItShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.locationIt = null;
                    }
                }
            }
            {
                Boolean districtDeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.districtDe!= null));
                if (districtDeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDistrictDe;
                    sourceDistrictDe = this.getDistrictDe();
                    String copyDistrictDe = ((String) strategy.copy(LocatorUtils.property(locator, "districtDe", sourceDistrictDe), sourceDistrictDe, (this.districtDe!= null)));
                    copy.setDistrictDe(copyDistrictDe);
                } else {
                    if (districtDeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.districtDe = null;
                    }
                }
            }
            {
                Boolean districtItShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.districtIt!= null));
                if (districtItShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDistrictIt;
                    sourceDistrictIt = this.getDistrictIt();
                    String copyDistrictIt = ((String) strategy.copy(LocatorUtils.property(locator, "districtIt", sourceDistrictIt), sourceDistrictIt, (this.districtIt!= null)));
                    copy.setDistrictIt(copyDistrictIt);
                } else {
                    if (districtItShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.districtIt = null;
                    }
                }
            }
            {
                Boolean postalcodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.postalcode!= null));
                if (postalcodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePostalcode;
                    sourcePostalcode = this.getPostalcode();
                    String copyPostalcode = ((String) strategy.copy(LocatorUtils.property(locator, "postalcode", sourcePostalcode), sourcePostalcode, (this.postalcode!= null)));
                    copy.setPostalcode(copyPostalcode);
                } else {
                    if (postalcodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.postalcode = null;
                    }
                }
            }
            {
                Boolean provinceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.province!= null));
                if (provinceShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceProvince;
                    sourceProvince = this.getProvince();
                    String copyProvince = ((String) strategy.copy(LocatorUtils.property(locator, "province", sourceProvince), sourceProvince, (this.province!= null)));
                    copy.setProvince(copyProvince);
                } else {
                    if (provinceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.province = null;
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
                Boolean titleDeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.titleDe!= null));
                if (titleDeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTitleDe;
                    sourceTitleDe = this.getTitleDe();
                    String copyTitleDe = ((String) strategy.copy(LocatorUtils.property(locator, "titleDe", sourceTitleDe), sourceTitleDe, (this.titleDe!= null)));
                    copy.setTitleDe(copyTitleDe);
                } else {
                    if (titleDeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.titleDe = null;
                    }
                }
            }
            {
                Boolean titleItShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.titleIt!= null));
                if (titleItShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTitleIt;
                    sourceTitleIt = this.getTitleIt();
                    String copyTitleIt = ((String) strategy.copy(LocatorUtils.property(locator, "titleIt", sourceTitleIt), sourceTitleIt, (this.titleIt!= null)));
                    copy.setTitleIt(copyTitleIt);
                } else {
                    if (titleItShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.titleIt = null;
                    }
                }
            }
            {
                Boolean immotypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.immotype!= null));
                if (immotypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ImmotypeValue sourceImmotype;
                    sourceImmotype = this.getImmotype();
                    ImmotypeValue copyImmotype = ((ImmotypeValue) strategy.copy(LocatorUtils.property(locator, "immotype", sourceImmotype), sourceImmotype, (this.immotype!= null)));
                    copy.setImmotype(copyImmotype);
                } else {
                    if (immotypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.immotype = null;
                    }
                }
            }
            {
                Boolean revenuetypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.revenuetype!= null));
                if (revenuetypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    RevenuetypeValue sourceRevenuetype;
                    sourceRevenuetype = this.getRevenuetype();
                    RevenuetypeValue copyRevenuetype = ((RevenuetypeValue) strategy.copy(LocatorUtils.property(locator, "revenuetype", sourceRevenuetype), sourceRevenuetype, (this.revenuetype!= null)));
                    copy.setRevenuetype(copyRevenuetype);
                } else {
                    if (revenuetypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.revenuetype = null;
                    }
                }
            }
            {
                Boolean sqmSaleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sqmSale!= null));
                if (sqmSaleShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceSqmSale;
                    sourceSqmSale = this.getSqmSale();
                    BigDecimal copySqmSale = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "sqmSale", sourceSqmSale), sourceSqmSale, (this.sqmSale!= null)));
                    copy.setSqmSale(copySqmSale);
                } else {
                    if (sqmSaleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sqmSale = null;
                    }
                }
            }
            {
                Boolean sqmNetShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sqmNet!= null));
                if (sqmNetShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceSqmNet;
                    sourceSqmNet = this.getSqmNet();
                    BigDecimal copySqmNet = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "sqmNet", sourceSqmNet), sourceSqmNet, (this.sqmNet!= null)));
                    copy.setSqmNet(copySqmNet);
                } else {
                    if (sqmNetShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sqmNet = null;
                    }
                }
            }
            {
                Boolean sqmGrossShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sqmGross!= null));
                if (sqmGrossShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceSqmGross;
                    sourceSqmGross = this.getSqmGross();
                    BigDecimal copySqmGross = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "sqmGross", sourceSqmGross), sourceSqmGross, (this.sqmGross!= null)));
                    copy.setSqmGross(copySqmGross);
                } else {
                    if (sqmGrossShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sqmGross = null;
                    }
                }
            }
            {
                Boolean floorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.floor!= null));
                if (floorShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceFloor;
                    sourceFloor = this.getFloor();
                    BigInteger copyFloor = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "floor", sourceFloor), sourceFloor, (this.floor!= null)));
                    copy.setFloor(copyFloor);
                } else {
                    if (floorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.floor = null;
                    }
                }
            }
            {
                Boolean flooristopShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.flooristop!= null));
                if (flooristopShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceFlooristop;
                    sourceFlooristop = this.getFlooristop();
                    Boolean copyFlooristop = ((Boolean) strategy.copy(LocatorUtils.property(locator, "flooristop", sourceFlooristop), sourceFlooristop, (this.flooristop!= null)));
                    copy.setFlooristop(copyFlooristop);
                } else {
                    if (flooristopShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.flooristop = null;
                    }
                }
            }
            {
                Boolean floorisgroundShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.floorisground!= null));
                if (floorisgroundShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceFloorisground;
                    sourceFloorisground = this.getFloorisground();
                    Boolean copyFloorisground = ((Boolean) strategy.copy(LocatorUtils.property(locator, "floorisground", sourceFloorisground), sourceFloorisground, (this.floorisground!= null)));
                    copy.setFloorisground(copyFloorisground);
                } else {
                    if (floorisgroundShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.floorisground = null;
                    }
                }
            }
            {
                Boolean duplexShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.duplex!= null));
                if (duplexShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceDuplex;
                    sourceDuplex = this.getDuplex();
                    Boolean copyDuplex = ((Boolean) strategy.copy(LocatorUtils.property(locator, "duplex", sourceDuplex), sourceDuplex, (this.duplex!= null)));
                    copy.setDuplex(copyDuplex);
                } else {
                    if (duplexShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.duplex = null;
                    }
                }
            }
            {
                Boolean countroomsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.countrooms!= null));
                if (countroomsShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceCountrooms;
                    sourceCountrooms = this.getCountrooms();
                    BigInteger copyCountrooms = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "countrooms", sourceCountrooms), sourceCountrooms, (this.countrooms!= null)));
                    copy.setCountrooms(copyCountrooms);
                } else {
                    if (countroomsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.countrooms = null;
                    }
                }
            }
            {
                Boolean countbathroomsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.countbathrooms!= null));
                if (countbathroomsShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceCountbathrooms;
                    sourceCountbathrooms = this.getCountbathrooms();
                    BigInteger copyCountbathrooms = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "countbathrooms", sourceCountbathrooms), sourceCountbathrooms, (this.countbathrooms!= null)));
                    copy.setCountbathrooms(copyCountbathrooms);
                } else {
                    if (countbathroomsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.countbathrooms = null;
                    }
                }
            }
            {
                Boolean kitchentypeDeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kitchentypeDe!= null));
                if (kitchentypeDeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceKitchentypeDe;
                    sourceKitchentypeDe = this.getKitchentypeDe();
                    String copyKitchentypeDe = ((String) strategy.copy(LocatorUtils.property(locator, "kitchentypeDe", sourceKitchentypeDe), sourceKitchentypeDe, (this.kitchentypeDe!= null)));
                    copy.setKitchentypeDe(copyKitchentypeDe);
                } else {
                    if (kitchentypeDeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kitchentypeDe = null;
                    }
                }
            }
            {
                Boolean kitchentypeItShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kitchentypeIt!= null));
                if (kitchentypeItShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceKitchentypeIt;
                    sourceKitchentypeIt = this.getKitchentypeIt();
                    String copyKitchentypeIt = ((String) strategy.copy(LocatorUtils.property(locator, "kitchentypeIt", sourceKitchentypeIt), sourceKitchentypeIt, (this.kitchentypeIt!= null)));
                    copy.setKitchentypeIt(copyKitchentypeIt);
                } else {
                    if (kitchentypeItShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kitchentypeIt = null;
                    }
                }
            }
            {
                Boolean countterraceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.countterrace!= null));
                if (countterraceShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceCountterrace;
                    sourceCountterrace = this.getCountterrace();
                    BigInteger copyCountterrace = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "countterrace", sourceCountterrace), sourceCountterrace, (this.countterrace!= null)));
                    copy.setCountterrace(copyCountterrace);
                } else {
                    if (countterraceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.countterrace = null;
                    }
                }
            }
            {
                Boolean cellarShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.cellar!= null));
                if (cellarShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceCellar;
                    sourceCellar = this.getCellar();
                    Boolean copyCellar = ((Boolean) strategy.copy(LocatorUtils.property(locator, "cellar", sourceCellar), sourceCellar, (this.cellar!= null)));
                    copy.setCellar(copyCellar);
                } else {
                    if (cellarShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.cellar = null;
                    }
                }
            }
            {
                Boolean sqmCellarShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sqmCellar!= null));
                if (sqmCellarShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceSqmCellar;
                    sourceSqmCellar = this.getSqmCellar();
                    BigDecimal copySqmCellar = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "sqmCellar", sourceSqmCellar), sourceSqmCellar, (this.sqmCellar!= null)));
                    copy.setSqmCellar(copySqmCellar);
                } else {
                    if (sqmCellarShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sqmCellar = null;
                    }
                }
            }
            {
                Boolean gardenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.garden!= null));
                if (gardenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceGarden;
                    sourceGarden = this.getGarden();
                    Boolean copyGarden = ((Boolean) strategy.copy(LocatorUtils.property(locator, "garden", sourceGarden), sourceGarden, (this.garden!= null)));
                    copy.setGarden(copyGarden);
                } else {
                    if (gardenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.garden = null;
                    }
                }
            }
            {
                Boolean sqmGardenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sqmGarden!= null));
                if (sqmGardenShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceSqmGarden;
                    sourceSqmGarden = this.getSqmGarden();
                    BigDecimal copySqmGarden = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "sqmGarden", sourceSqmGarden), sourceSqmGarden, (this.sqmGarden!= null)));
                    copy.setSqmGarden(copySqmGarden);
                } else {
                    if (sqmGardenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sqmGarden = null;
                    }
                }
            }
            {
                Boolean countgarageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.countgarage!= null));
                if (countgarageShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceCountgarage;
                    sourceCountgarage = this.getCountgarage();
                    BigInteger copyCountgarage = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "countgarage", sourceCountgarage), sourceCountgarage, (this.countgarage!= null)));
                    copy.setCountgarage(copyCountgarage);
                } else {
                    if (countgarageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.countgarage = null;
                    }
                }
            }
            {
                Boolean countparkinglotShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.countparkinglot!= null));
                if (countparkinglotShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceCountparkinglot;
                    sourceCountparkinglot = this.getCountparkinglot();
                    BigInteger copyCountparkinglot = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "countparkinglot", sourceCountparkinglot), sourceCountparkinglot, (this.countparkinglot!= null)));
                    copy.setCountparkinglot(copyCountparkinglot);
                } else {
                    if (countparkinglotShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.countparkinglot = null;
                    }
                }
            }
            {
                Boolean parkinglottypeDeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.parkinglottypeDe!= null));
                if (parkinglottypeDeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceParkinglottypeDe;
                    sourceParkinglottypeDe = this.getParkinglottypeDe();
                    String copyParkinglottypeDe = ((String) strategy.copy(LocatorUtils.property(locator, "parkinglottypeDe", sourceParkinglottypeDe), sourceParkinglottypeDe, (this.parkinglottypeDe!= null)));
                    copy.setParkinglottypeDe(copyParkinglottypeDe);
                } else {
                    if (parkinglottypeDeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.parkinglottypeDe = null;
                    }
                }
            }
            {
                Boolean parkinglottypeItShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.parkinglottypeIt!= null));
                if (parkinglottypeItShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceParkinglottypeIt;
                    sourceParkinglottypeIt = this.getParkinglottypeIt();
                    String copyParkinglottypeIt = ((String) strategy.copy(LocatorUtils.property(locator, "parkinglottypeIt", sourceParkinglottypeIt), sourceParkinglottypeIt, (this.parkinglottypeIt!= null)));
                    copy.setParkinglottypeIt(copyParkinglottypeIt);
                } else {
                    if (parkinglottypeItShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.parkinglottypeIt = null;
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
                Boolean descriptionDeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.descriptionDe!= null));
                if (descriptionDeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDescriptionDe;
                    sourceDescriptionDe = this.getDescriptionDe();
                    String copyDescriptionDe = ((String) strategy.copy(LocatorUtils.property(locator, "descriptionDe", sourceDescriptionDe), sourceDescriptionDe, (this.descriptionDe!= null)));
                    copy.setDescriptionDe(copyDescriptionDe);
                } else {
                    if (descriptionDeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.descriptionDe = null;
                    }
                }
            }
            {
                Boolean descriptionItShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.descriptionIt!= null));
                if (descriptionItShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDescriptionIt;
                    sourceDescriptionIt = this.getDescriptionIt();
                    String copyDescriptionIt = ((String) strategy.copy(LocatorUtils.property(locator, "descriptionIt", sourceDescriptionIt), sourceDescriptionIt, (this.descriptionIt!= null)));
                    copy.setDescriptionIt(copyDescriptionIt);
                } else {
                    if (descriptionItShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.descriptionIt = null;
                    }
                }
            }
            {
                Boolean usedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.used!= null));
                if (usedShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceUsed;
                    sourceUsed = this.getUsed();
                    Boolean copyUsed = ((Boolean) strategy.copy(LocatorUtils.property(locator, "used", sourceUsed), sourceUsed, (this.used!= null)));
                    copy.setUsed(copyUsed);
                } else {
                    if (usedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.used = null;
                    }
                }
            }
            {
                Boolean furnishedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.furnished!= null));
                if (furnishedShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceFurnished;
                    sourceFurnished = this.getFurnished();
                    Boolean copyFurnished = ((Boolean) strategy.copy(LocatorUtils.property(locator, "furnished", sourceFurnished), sourceFurnished, (this.furnished!= null)));
                    copy.setFurnished(copyFurnished);
                } else {
                    if (furnishedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.furnished = null;
                    }
                }
            }
            {
                Boolean energyclassShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energyclass!= null));
                if (energyclassShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEnergyclass;
                    sourceEnergyclass = this.getEnergyclass();
                    String copyEnergyclass = ((String) strategy.copy(LocatorUtils.property(locator, "energyclass", sourceEnergyclass), sourceEnergyclass, (this.energyclass!= null)));
                    copy.setEnergyclass(copyEnergyclass);
                } else {
                    if (energyclassShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energyclass = null;
                    }
                }
            }
            {
                Boolean ipeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ipe!= null));
                if (ipeShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceIpe;
                    sourceIpe = this.getIpe();
                    BigDecimal copyIpe = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "ipe", sourceIpe), sourceIpe, (this.ipe!= null)));
                    copy.setIpe(copyIpe);
                } else {
                    if (ipeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ipe = null;
                    }
                }
            }
            {
                Boolean heatingDeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.heatingDe!= null));
                if (heatingDeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceHeatingDe;
                    sourceHeatingDe = this.getHeatingDe();
                    String copyHeatingDe = ((String) strategy.copy(LocatorUtils.property(locator, "heatingDe", sourceHeatingDe), sourceHeatingDe, (this.heatingDe!= null)));
                    copy.setHeatingDe(copyHeatingDe);
                } else {
                    if (heatingDeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.heatingDe = null;
                    }
                }
            }
            {
                Boolean heatingItShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.heatingIt!= null));
                if (heatingItShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceHeatingIt;
                    sourceHeatingIt = this.getHeatingIt();
                    String copyHeatingIt = ((String) strategy.copy(LocatorUtils.property(locator, "heatingIt", sourceHeatingIt), sourceHeatingIt, (this.heatingIt!= null)));
                    copy.setHeatingIt(copyHeatingIt);
                } else {
                    if (heatingItShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.heatingIt = null;
                    }
                }
            }
            {
                Boolean conventionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.convention!= null));
                if (conventionShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceConvention;
                    sourceConvention = this.getConvention();
                    Boolean copyConvention = ((Boolean) strategy.copy(LocatorUtils.property(locator, "convention", sourceConvention), sourceConvention, (this.convention!= null)));
                    copy.setConvention(copyConvention);
                } else {
                    if (conventionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.convention = null;
                    }
                }
            }
            {
                Boolean priceOnRequestShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (priceOnRequestShouldBeCopiedAndSet == Boolean.TRUE) {
                    boolean sourcePriceOnRequest;
                    sourcePriceOnRequest = this.isPriceOnRequest();
                    boolean copyPriceOnRequest = strategy.copy(LocatorUtils.property(locator, "priceOnRequest", sourcePriceOnRequest), sourcePriceOnRequest, true);
                    copy.setPriceOnRequest(copyPriceOnRequest);
                } else {
                    if (priceOnRequestShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
            {
                Boolean priceNetShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.priceNet!= null));
                if (priceNetShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourcePriceNet;
                    sourcePriceNet = this.getPriceNet();
                    BigDecimal copyPriceNet = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "priceNet", sourcePriceNet), sourcePriceNet, (this.priceNet!= null)));
                    copy.setPriceNet(copyPriceNet);
                } else {
                    if (priceNetShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.priceNet = null;
                    }
                }
            }
            {
                Boolean commissionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.commission!= null));
                if (commissionShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceCommission;
                    sourceCommission = this.getCommission();
                    Boolean copyCommission = ((Boolean) strategy.copy(LocatorUtils.property(locator, "commission", sourceCommission), sourceCommission, (this.commission!= null)));
                    copy.setCommission(copyCommission);
                } else {
                    if (commissionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.commission = null;
                    }
                }
            }
            {
                Boolean utilitiesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.utilities!= null));
                if (utilitiesShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceUtilities;
                    sourceUtilities = this.getUtilities();
                    BigDecimal copyUtilities = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "utilities", sourceUtilities), sourceUtilities, (this.utilities!= null)));
                    copy.setUtilities(copyUtilities);
                } else {
                    if (utilitiesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.utilities = null;
                    }
                }
            }
            {
                Boolean imageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.image!= null)&&(!this.image.isEmpty())));
                if (imageShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<URI> sourceImage;
                    sourceImage = (((this.image!= null)&&(!this.image.isEmpty()))?this.getImage():null);
                    @SuppressWarnings("unchecked")
                    List<URI> copyImage = ((List<URI> ) strategy.copy(LocatorUtils.property(locator, "image", sourceImage), sourceImage, ((this.image!= null)&&(!this.image.isEmpty()))));
                    copy.image = null;
                    if (copyImage!= null) {
                        List<URI> uniqueImagel = copy.getImage();
                        uniqueImagel.addAll(copyImage);
                    }
                } else {
                    if (imageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.image = null;
                    }
                }
            }
            {
                Boolean planimetryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.planimetry!= null)&&(!this.planimetry.isEmpty())));
                if (planimetryShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<URI> sourcePlanimetry;
                    sourcePlanimetry = (((this.planimetry!= null)&&(!this.planimetry.isEmpty()))?this.getPlanimetry():null);
                    @SuppressWarnings("unchecked")
                    List<URI> copyPlanimetry = ((List<URI> ) strategy.copy(LocatorUtils.property(locator, "planimetry", sourcePlanimetry), sourcePlanimetry, ((this.planimetry!= null)&&(!this.planimetry.isEmpty()))));
                    copy.planimetry = null;
                    if (copyPlanimetry!= null) {
                        List<URI> uniquePlanimetryl = copy.getPlanimetry();
                        uniquePlanimetryl.addAll(copyPlanimetry);
                    }
                } else {
                    if (planimetryShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.planimetry = null;
                    }
                }
            }
            {
                Boolean creationdateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.creationdate!= null));
                if (creationdateShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceCreationdate;
                    sourceCreationdate = this.getCreationdate();
                    Calendar copyCreationdate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "creationdate", sourceCreationdate), sourceCreationdate, (this.creationdate!= null)));
                    copy.setCreationdate(copyCreationdate);
                } else {
                    if (creationdateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.creationdate = null;
                    }
                }
            }
            {
                Boolean lastmoddateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lastmoddate!= null));
                if (lastmoddateShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceLastmoddate;
                    sourceLastmoddate = this.getLastmoddate();
                    Calendar copyLastmoddate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "lastmoddate", sourceLastmoddate), sourceLastmoddate, (this.lastmoddate!= null)));
                    copy.setLastmoddate(copyLastmoddate);
                } else {
                    if (lastmoddateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lastmoddate = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new PropertyType();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PropertyType that = ((PropertyType) object);
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
            String lhsReferencenumber;
            lhsReferencenumber = this.getReferencenumber();
            String rhsReferencenumber;
            rhsReferencenumber = that.getReferencenumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referencenumber", lhsReferencenumber), LocatorUtils.property(thatLocator, "referencenumber", rhsReferencenumber), lhsReferencenumber, rhsReferencenumber, (this.referencenumber!= null), (that.referencenumber!= null))) {
                return false;
            }
        }
        {
            String lhsContactpersonname;
            lhsContactpersonname = this.getContactpersonname();
            String rhsContactpersonname;
            rhsContactpersonname = that.getContactpersonname();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactpersonname", lhsContactpersonname), LocatorUtils.property(thatLocator, "contactpersonname", rhsContactpersonname), lhsContactpersonname, rhsContactpersonname, (this.contactpersonname!= null), (that.contactpersonname!= null))) {
                return false;
            }
        }
        {
            String lhsISTATcode;
            lhsISTATcode = this.getISTATcode();
            String rhsISTATcode;
            rhsISTATcode = that.getISTATcode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "istaTcode", lhsISTATcode), LocatorUtils.property(thatLocator, "istaTcode", rhsISTATcode), lhsISTATcode, rhsISTATcode, (this.istaTcode!= null), (that.istaTcode!= null))) {
                return false;
            }
        }
        {
            String lhsAddressDe;
            lhsAddressDe = this.getAddressDe();
            String rhsAddressDe;
            rhsAddressDe = that.getAddressDe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "addressDe", lhsAddressDe), LocatorUtils.property(thatLocator, "addressDe", rhsAddressDe), lhsAddressDe, rhsAddressDe, (this.addressDe!= null), (that.addressDe!= null))) {
                return false;
            }
        }
        {
            String lhsAddressIt;
            lhsAddressIt = this.getAddressIt();
            String rhsAddressIt;
            rhsAddressIt = that.getAddressIt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "addressIt", lhsAddressIt), LocatorUtils.property(thatLocator, "addressIt", rhsAddressIt), lhsAddressIt, rhsAddressIt, (this.addressIt!= null), (that.addressIt!= null))) {
                return false;
            }
        }
        {
            String lhsLocationDe;
            lhsLocationDe = this.getLocationDe();
            String rhsLocationDe;
            rhsLocationDe = that.getLocationDe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "locationDe", lhsLocationDe), LocatorUtils.property(thatLocator, "locationDe", rhsLocationDe), lhsLocationDe, rhsLocationDe, (this.locationDe!= null), (that.locationDe!= null))) {
                return false;
            }
        }
        {
            String lhsLocationIt;
            lhsLocationIt = this.getLocationIt();
            String rhsLocationIt;
            rhsLocationIt = that.getLocationIt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "locationIt", lhsLocationIt), LocatorUtils.property(thatLocator, "locationIt", rhsLocationIt), lhsLocationIt, rhsLocationIt, (this.locationIt!= null), (that.locationIt!= null))) {
                return false;
            }
        }
        {
            String lhsDistrictDe;
            lhsDistrictDe = this.getDistrictDe();
            String rhsDistrictDe;
            rhsDistrictDe = that.getDistrictDe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "districtDe", lhsDistrictDe), LocatorUtils.property(thatLocator, "districtDe", rhsDistrictDe), lhsDistrictDe, rhsDistrictDe, (this.districtDe!= null), (that.districtDe!= null))) {
                return false;
            }
        }
        {
            String lhsDistrictIt;
            lhsDistrictIt = this.getDistrictIt();
            String rhsDistrictIt;
            rhsDistrictIt = that.getDistrictIt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "districtIt", lhsDistrictIt), LocatorUtils.property(thatLocator, "districtIt", rhsDistrictIt), lhsDistrictIt, rhsDistrictIt, (this.districtIt!= null), (that.districtIt!= null))) {
                return false;
            }
        }
        {
            String lhsPostalcode;
            lhsPostalcode = this.getPostalcode();
            String rhsPostalcode;
            rhsPostalcode = that.getPostalcode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postalcode", lhsPostalcode), LocatorUtils.property(thatLocator, "postalcode", rhsPostalcode), lhsPostalcode, rhsPostalcode, (this.postalcode!= null), (that.postalcode!= null))) {
                return false;
            }
        }
        {
            String lhsProvince;
            lhsProvince = this.getProvince();
            String rhsProvince;
            rhsProvince = that.getProvince();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "province", lhsProvince), LocatorUtils.property(thatLocator, "province", rhsProvince), lhsProvince, rhsProvince, (this.province!= null), (that.province!= null))) {
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
            String lhsTitleDe;
            lhsTitleDe = this.getTitleDe();
            String rhsTitleDe;
            rhsTitleDe = that.getTitleDe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "titleDe", lhsTitleDe), LocatorUtils.property(thatLocator, "titleDe", rhsTitleDe), lhsTitleDe, rhsTitleDe, (this.titleDe!= null), (that.titleDe!= null))) {
                return false;
            }
        }
        {
            String lhsTitleIt;
            lhsTitleIt = this.getTitleIt();
            String rhsTitleIt;
            rhsTitleIt = that.getTitleIt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "titleIt", lhsTitleIt), LocatorUtils.property(thatLocator, "titleIt", rhsTitleIt), lhsTitleIt, rhsTitleIt, (this.titleIt!= null), (that.titleIt!= null))) {
                return false;
            }
        }
        {
            ImmotypeValue lhsImmotype;
            lhsImmotype = this.getImmotype();
            ImmotypeValue rhsImmotype;
            rhsImmotype = that.getImmotype();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "immotype", lhsImmotype), LocatorUtils.property(thatLocator, "immotype", rhsImmotype), lhsImmotype, rhsImmotype, (this.immotype!= null), (that.immotype!= null))) {
                return false;
            }
        }
        {
            RevenuetypeValue lhsRevenuetype;
            lhsRevenuetype = this.getRevenuetype();
            RevenuetypeValue rhsRevenuetype;
            rhsRevenuetype = that.getRevenuetype();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "revenuetype", lhsRevenuetype), LocatorUtils.property(thatLocator, "revenuetype", rhsRevenuetype), lhsRevenuetype, rhsRevenuetype, (this.revenuetype!= null), (that.revenuetype!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsSqmSale;
            lhsSqmSale = this.getSqmSale();
            BigDecimal rhsSqmSale;
            rhsSqmSale = that.getSqmSale();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sqmSale", lhsSqmSale), LocatorUtils.property(thatLocator, "sqmSale", rhsSqmSale), lhsSqmSale, rhsSqmSale, (this.sqmSale!= null), (that.sqmSale!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsSqmNet;
            lhsSqmNet = this.getSqmNet();
            BigDecimal rhsSqmNet;
            rhsSqmNet = that.getSqmNet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sqmNet", lhsSqmNet), LocatorUtils.property(thatLocator, "sqmNet", rhsSqmNet), lhsSqmNet, rhsSqmNet, (this.sqmNet!= null), (that.sqmNet!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsSqmGross;
            lhsSqmGross = this.getSqmGross();
            BigDecimal rhsSqmGross;
            rhsSqmGross = that.getSqmGross();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sqmGross", lhsSqmGross), LocatorUtils.property(thatLocator, "sqmGross", rhsSqmGross), lhsSqmGross, rhsSqmGross, (this.sqmGross!= null), (that.sqmGross!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsFloor;
            lhsFloor = this.getFloor();
            BigInteger rhsFloor;
            rhsFloor = that.getFloor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "floor", lhsFloor), LocatorUtils.property(thatLocator, "floor", rhsFloor), lhsFloor, rhsFloor, (this.floor!= null), (that.floor!= null))) {
                return false;
            }
        }
        {
            Boolean lhsFlooristop;
            lhsFlooristop = this.getFlooristop();
            Boolean rhsFlooristop;
            rhsFlooristop = that.getFlooristop();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flooristop", lhsFlooristop), LocatorUtils.property(thatLocator, "flooristop", rhsFlooristop), lhsFlooristop, rhsFlooristop, (this.flooristop!= null), (that.flooristop!= null))) {
                return false;
            }
        }
        {
            Boolean lhsFloorisground;
            lhsFloorisground = this.getFloorisground();
            Boolean rhsFloorisground;
            rhsFloorisground = that.getFloorisground();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "floorisground", lhsFloorisground), LocatorUtils.property(thatLocator, "floorisground", rhsFloorisground), lhsFloorisground, rhsFloorisground, (this.floorisground!= null), (that.floorisground!= null))) {
                return false;
            }
        }
        {
            Boolean lhsDuplex;
            lhsDuplex = this.getDuplex();
            Boolean rhsDuplex;
            rhsDuplex = that.getDuplex();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "duplex", lhsDuplex), LocatorUtils.property(thatLocator, "duplex", rhsDuplex), lhsDuplex, rhsDuplex, (this.duplex!= null), (that.duplex!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsCountrooms;
            lhsCountrooms = this.getCountrooms();
            BigInteger rhsCountrooms;
            rhsCountrooms = that.getCountrooms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "countrooms", lhsCountrooms), LocatorUtils.property(thatLocator, "countrooms", rhsCountrooms), lhsCountrooms, rhsCountrooms, (this.countrooms!= null), (that.countrooms!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsCountbathrooms;
            lhsCountbathrooms = this.getCountbathrooms();
            BigInteger rhsCountbathrooms;
            rhsCountbathrooms = that.getCountbathrooms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "countbathrooms", lhsCountbathrooms), LocatorUtils.property(thatLocator, "countbathrooms", rhsCountbathrooms), lhsCountbathrooms, rhsCountbathrooms, (this.countbathrooms!= null), (that.countbathrooms!= null))) {
                return false;
            }
        }
        {
            String lhsKitchentypeDe;
            lhsKitchentypeDe = this.getKitchentypeDe();
            String rhsKitchentypeDe;
            rhsKitchentypeDe = that.getKitchentypeDe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kitchentypeDe", lhsKitchentypeDe), LocatorUtils.property(thatLocator, "kitchentypeDe", rhsKitchentypeDe), lhsKitchentypeDe, rhsKitchentypeDe, (this.kitchentypeDe!= null), (that.kitchentypeDe!= null))) {
                return false;
            }
        }
        {
            String lhsKitchentypeIt;
            lhsKitchentypeIt = this.getKitchentypeIt();
            String rhsKitchentypeIt;
            rhsKitchentypeIt = that.getKitchentypeIt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kitchentypeIt", lhsKitchentypeIt), LocatorUtils.property(thatLocator, "kitchentypeIt", rhsKitchentypeIt), lhsKitchentypeIt, rhsKitchentypeIt, (this.kitchentypeIt!= null), (that.kitchentypeIt!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsCountterrace;
            lhsCountterrace = this.getCountterrace();
            BigInteger rhsCountterrace;
            rhsCountterrace = that.getCountterrace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "countterrace", lhsCountterrace), LocatorUtils.property(thatLocator, "countterrace", rhsCountterrace), lhsCountterrace, rhsCountterrace, (this.countterrace!= null), (that.countterrace!= null))) {
                return false;
            }
        }
        {
            Boolean lhsCellar;
            lhsCellar = this.getCellar();
            Boolean rhsCellar;
            rhsCellar = that.getCellar();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cellar", lhsCellar), LocatorUtils.property(thatLocator, "cellar", rhsCellar), lhsCellar, rhsCellar, (this.cellar!= null), (that.cellar!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsSqmCellar;
            lhsSqmCellar = this.getSqmCellar();
            BigDecimal rhsSqmCellar;
            rhsSqmCellar = that.getSqmCellar();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sqmCellar", lhsSqmCellar), LocatorUtils.property(thatLocator, "sqmCellar", rhsSqmCellar), lhsSqmCellar, rhsSqmCellar, (this.sqmCellar!= null), (that.sqmCellar!= null))) {
                return false;
            }
        }
        {
            Boolean lhsGarden;
            lhsGarden = this.getGarden();
            Boolean rhsGarden;
            rhsGarden = that.getGarden();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "garden", lhsGarden), LocatorUtils.property(thatLocator, "garden", rhsGarden), lhsGarden, rhsGarden, (this.garden!= null), (that.garden!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsSqmGarden;
            lhsSqmGarden = this.getSqmGarden();
            BigDecimal rhsSqmGarden;
            rhsSqmGarden = that.getSqmGarden();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sqmGarden", lhsSqmGarden), LocatorUtils.property(thatLocator, "sqmGarden", rhsSqmGarden), lhsSqmGarden, rhsSqmGarden, (this.sqmGarden!= null), (that.sqmGarden!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsCountgarage;
            lhsCountgarage = this.getCountgarage();
            BigInteger rhsCountgarage;
            rhsCountgarage = that.getCountgarage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "countgarage", lhsCountgarage), LocatorUtils.property(thatLocator, "countgarage", rhsCountgarage), lhsCountgarage, rhsCountgarage, (this.countgarage!= null), (that.countgarage!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsCountparkinglot;
            lhsCountparkinglot = this.getCountparkinglot();
            BigInteger rhsCountparkinglot;
            rhsCountparkinglot = that.getCountparkinglot();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "countparkinglot", lhsCountparkinglot), LocatorUtils.property(thatLocator, "countparkinglot", rhsCountparkinglot), lhsCountparkinglot, rhsCountparkinglot, (this.countparkinglot!= null), (that.countparkinglot!= null))) {
                return false;
            }
        }
        {
            String lhsParkinglottypeDe;
            lhsParkinglottypeDe = this.getParkinglottypeDe();
            String rhsParkinglottypeDe;
            rhsParkinglottypeDe = that.getParkinglottypeDe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parkinglottypeDe", lhsParkinglottypeDe), LocatorUtils.property(thatLocator, "parkinglottypeDe", rhsParkinglottypeDe), lhsParkinglottypeDe, rhsParkinglottypeDe, (this.parkinglottypeDe!= null), (that.parkinglottypeDe!= null))) {
                return false;
            }
        }
        {
            String lhsParkinglottypeIt;
            lhsParkinglottypeIt = this.getParkinglottypeIt();
            String rhsParkinglottypeIt;
            rhsParkinglottypeIt = that.getParkinglottypeIt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parkinglottypeIt", lhsParkinglottypeIt), LocatorUtils.property(thatLocator, "parkinglottypeIt", rhsParkinglottypeIt), lhsParkinglottypeIt, rhsParkinglottypeIt, (this.parkinglottypeIt!= null), (that.parkinglottypeIt!= null))) {
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
            String lhsDescriptionDe;
            lhsDescriptionDe = this.getDescriptionDe();
            String rhsDescriptionDe;
            rhsDescriptionDe = that.getDescriptionDe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "descriptionDe", lhsDescriptionDe), LocatorUtils.property(thatLocator, "descriptionDe", rhsDescriptionDe), lhsDescriptionDe, rhsDescriptionDe, (this.descriptionDe!= null), (that.descriptionDe!= null))) {
                return false;
            }
        }
        {
            String lhsDescriptionIt;
            lhsDescriptionIt = this.getDescriptionIt();
            String rhsDescriptionIt;
            rhsDescriptionIt = that.getDescriptionIt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "descriptionIt", lhsDescriptionIt), LocatorUtils.property(thatLocator, "descriptionIt", rhsDescriptionIt), lhsDescriptionIt, rhsDescriptionIt, (this.descriptionIt!= null), (that.descriptionIt!= null))) {
                return false;
            }
        }
        {
            Boolean lhsUsed;
            lhsUsed = this.getUsed();
            Boolean rhsUsed;
            rhsUsed = that.getUsed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "used", lhsUsed), LocatorUtils.property(thatLocator, "used", rhsUsed), lhsUsed, rhsUsed, (this.used!= null), (that.used!= null))) {
                return false;
            }
        }
        {
            Boolean lhsFurnished;
            lhsFurnished = this.getFurnished();
            Boolean rhsFurnished;
            rhsFurnished = that.getFurnished();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "furnished", lhsFurnished), LocatorUtils.property(thatLocator, "furnished", rhsFurnished), lhsFurnished, rhsFurnished, (this.furnished!= null), (that.furnished!= null))) {
                return false;
            }
        }
        {
            String lhsEnergyclass;
            lhsEnergyclass = this.getEnergyclass();
            String rhsEnergyclass;
            rhsEnergyclass = that.getEnergyclass();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energyclass", lhsEnergyclass), LocatorUtils.property(thatLocator, "energyclass", rhsEnergyclass), lhsEnergyclass, rhsEnergyclass, (this.energyclass!= null), (that.energyclass!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsIpe;
            lhsIpe = this.getIpe();
            BigDecimal rhsIpe;
            rhsIpe = that.getIpe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ipe", lhsIpe), LocatorUtils.property(thatLocator, "ipe", rhsIpe), lhsIpe, rhsIpe, (this.ipe!= null), (that.ipe!= null))) {
                return false;
            }
        }
        {
            String lhsHeatingDe;
            lhsHeatingDe = this.getHeatingDe();
            String rhsHeatingDe;
            rhsHeatingDe = that.getHeatingDe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heatingDe", lhsHeatingDe), LocatorUtils.property(thatLocator, "heatingDe", rhsHeatingDe), lhsHeatingDe, rhsHeatingDe, (this.heatingDe!= null), (that.heatingDe!= null))) {
                return false;
            }
        }
        {
            String lhsHeatingIt;
            lhsHeatingIt = this.getHeatingIt();
            String rhsHeatingIt;
            rhsHeatingIt = that.getHeatingIt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heatingIt", lhsHeatingIt), LocatorUtils.property(thatLocator, "heatingIt", rhsHeatingIt), lhsHeatingIt, rhsHeatingIt, (this.heatingIt!= null), (that.heatingIt!= null))) {
                return false;
            }
        }
        {
            Boolean lhsConvention;
            lhsConvention = this.getConvention();
            Boolean rhsConvention;
            rhsConvention = that.getConvention();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "convention", lhsConvention), LocatorUtils.property(thatLocator, "convention", rhsConvention), lhsConvention, rhsConvention, (this.convention!= null), (that.convention!= null))) {
                return false;
            }
        }
        {
            boolean lhsPriceOnRequest;
            lhsPriceOnRequest = this.isPriceOnRequest();
            boolean rhsPriceOnRequest;
            rhsPriceOnRequest = that.isPriceOnRequest();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priceOnRequest", lhsPriceOnRequest), LocatorUtils.property(thatLocator, "priceOnRequest", rhsPriceOnRequest), lhsPriceOnRequest, rhsPriceOnRequest, true, true)) {
                return false;
            }
        }
        {
            BigDecimal lhsPriceNet;
            lhsPriceNet = this.getPriceNet();
            BigDecimal rhsPriceNet;
            rhsPriceNet = that.getPriceNet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priceNet", lhsPriceNet), LocatorUtils.property(thatLocator, "priceNet", rhsPriceNet), lhsPriceNet, rhsPriceNet, (this.priceNet!= null), (that.priceNet!= null))) {
                return false;
            }
        }
        {
            Boolean lhsCommission;
            lhsCommission = this.getCommission();
            Boolean rhsCommission;
            rhsCommission = that.getCommission();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "commission", lhsCommission), LocatorUtils.property(thatLocator, "commission", rhsCommission), lhsCommission, rhsCommission, (this.commission!= null), (that.commission!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsUtilities;
            lhsUtilities = this.getUtilities();
            BigDecimal rhsUtilities;
            rhsUtilities = that.getUtilities();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "utilities", lhsUtilities), LocatorUtils.property(thatLocator, "utilities", rhsUtilities), lhsUtilities, rhsUtilities, (this.utilities!= null), (that.utilities!= null))) {
                return false;
            }
        }
        {
            List<URI> lhsImage;
            lhsImage = (((this.image!= null)&&(!this.image.isEmpty()))?this.getImage():null);
            List<URI> rhsImage;
            rhsImage = (((that.image!= null)&&(!that.image.isEmpty()))?that.getImage():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "image", lhsImage), LocatorUtils.property(thatLocator, "image", rhsImage), lhsImage, rhsImage, ((this.image!= null)&&(!this.image.isEmpty())), ((that.image!= null)&&(!that.image.isEmpty())))) {
                return false;
            }
        }
        {
            List<URI> lhsPlanimetry;
            lhsPlanimetry = (((this.planimetry!= null)&&(!this.planimetry.isEmpty()))?this.getPlanimetry():null);
            List<URI> rhsPlanimetry;
            rhsPlanimetry = (((that.planimetry!= null)&&(!that.planimetry.isEmpty()))?that.getPlanimetry():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "planimetry", lhsPlanimetry), LocatorUtils.property(thatLocator, "planimetry", rhsPlanimetry), lhsPlanimetry, rhsPlanimetry, ((this.planimetry!= null)&&(!this.planimetry.isEmpty())), ((that.planimetry!= null)&&(!that.planimetry.isEmpty())))) {
                return false;
            }
        }
        {
            Calendar lhsCreationdate;
            lhsCreationdate = this.getCreationdate();
            Calendar rhsCreationdate;
            rhsCreationdate = that.getCreationdate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "creationdate", lhsCreationdate), LocatorUtils.property(thatLocator, "creationdate", rhsCreationdate), lhsCreationdate, rhsCreationdate, (this.creationdate!= null), (that.creationdate!= null))) {
                return false;
            }
        }
        {
            Calendar lhsLastmoddate;
            lhsLastmoddate = this.getLastmoddate();
            Calendar rhsLastmoddate;
            rhsLastmoddate = that.getLastmoddate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastmoddate", lhsLastmoddate), LocatorUtils.property(thatLocator, "lastmoddate", rhsLastmoddate), lhsLastmoddate, rhsLastmoddate, (this.lastmoddate!= null), (that.lastmoddate!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
