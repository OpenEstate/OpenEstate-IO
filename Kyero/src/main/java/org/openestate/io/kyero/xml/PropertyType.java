
package org.openestate.io.kyero.xml;

import java.math.BigInteger;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for propertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="id" type="{}idType"/&gt;
 *         &lt;element name="date" type="{}dateType"/&gt;
 *         &lt;element name="ref" type="{}refType"/&gt;
 *         &lt;element name="price" type="{}priceType"/&gt;
 *         &lt;element name="currency" type="{}currencyType" minOccurs="0"/&gt;
 *         &lt;element name="price_freq" type="{}priceFreqType"/&gt;
 *         &lt;element name="part_ownership" type="{}boolType" minOccurs="0"/&gt;
 *         &lt;element name="leasehold" type="{}boolType" minOccurs="0"/&gt;
 *         &lt;element name="new_build" type="{}boolType" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{}typeDataType"/&gt;
 *         &lt;element name="town" type="{}requiredType"/&gt;
 *         &lt;element name="province" type="{}requiredType"/&gt;
 *         &lt;element name="location" type="{}gpsLocationType" minOccurs="0"/&gt;
 *         &lt;element name="location_detail" type="{}locationType" minOccurs="0"/&gt;
 *         &lt;element name="beds" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="baths" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="pool" type="{}boolType" minOccurs="0"/&gt;
 *         &lt;element name="surface_area" type="{}surfaceType" minOccurs="0"/&gt;
 *         &lt;element name="energy_rating" type="{}energyRatingType" minOccurs="0"/&gt;
 *         &lt;element name="url" type="{}urlType" minOccurs="0"/&gt;
 *         &lt;element name="desc" type="{}langType" minOccurs="0"/&gt;
 *         &lt;element name="features" type="{}featuresType"/&gt;
 *         &lt;element name="images" type="{}imagesType" minOccurs="0"/&gt;
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propertyType", propOrder = {

})
public class PropertyType
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected String id;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter6 .class)
    @XmlSchemaType(name = "token")
    protected Calendar date;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(Adapter7 .class)
    protected String ref;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter8 .class)
    protected Long price;
    @XmlSchemaType(name = "string")
    protected CurrencyType currency;
    @XmlElement(name = "price_freq", required = true)
    @XmlSchemaType(name = "string")
    protected PriceFreqType priceFreq;
    @XmlElement(name = "part_ownership", type = String.class)
    @XmlJavaTypeAdapter(Adapter9 .class)
    protected Boolean partOwnership;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter9 .class)
    protected Boolean leasehold;
    @XmlElement(name = "new_build", type = String.class)
    @XmlJavaTypeAdapter(Adapter9 .class)
    protected Boolean newBuild;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(Adapter10 .class)
    protected String type;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(Adapter5 .class)
    protected String town;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(Adapter5 .class)
    protected String province;
    protected GpsLocationType location;
    @XmlElement(name = "location_detail")
    @XmlJavaTypeAdapter(Adapter11 .class)
    protected String locationDetail;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger beds;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger baths;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter9 .class)
    protected Boolean pool;
    @XmlElement(name = "surface_area")
    protected SurfaceType surfaceArea;
    @XmlElement(name = "energy_rating")
    protected EnergyRatingType energyRating;
    protected UrlType url;
    protected LangType desc;
    @XmlElement(required = true)
    protected FeaturesType features;
    protected ImagesType images;
    protected String notes;

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
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrice(Long value) {
        this.price = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyType }
     *     
     */
    public CurrencyType getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyType }
     *     
     */
    public void setCurrency(CurrencyType value) {
        this.currency = value;
    }

    /**
     * Gets the value of the priceFreq property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFreqType }
     *     
     */
    public PriceFreqType getPriceFreq() {
        return priceFreq;
    }

    /**
     * Sets the value of the priceFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFreqType }
     *     
     */
    public void setPriceFreq(PriceFreqType value) {
        this.priceFreq = value;
    }

    /**
     * Gets the value of the partOwnership property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Boolean isPartOwnership() {
        return partOwnership;
    }

    /**
     * Sets the value of the partOwnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartOwnership(Boolean value) {
        this.partOwnership = value;
    }

    /**
     * Gets the value of the leasehold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Boolean isLeasehold() {
        return leasehold;
    }

    /**
     * Sets the value of the leasehold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeasehold(Boolean value) {
        this.leasehold = value;
    }

    /**
     * Gets the value of the newBuild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Boolean isNewBuild() {
        return newBuild;
    }

    /**
     * Sets the value of the newBuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewBuild(Boolean value) {
        this.newBuild = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
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
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the town property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTown() {
        return town;
    }

    /**
     * Sets the value of the town property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTown(String value) {
        this.town = value;
    }

    /**
     * Gets the value of the province property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    public void setProvince(String value) {
        this.province = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link GpsLocationType }
     *     
     */
    public GpsLocationType getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link GpsLocationType }
     *     
     */
    public void setLocation(GpsLocationType value) {
        this.location = value;
    }

    /**
     * Gets the value of the locationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationDetail() {
        return locationDetail;
    }

    /**
     * Sets the value of the locationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationDetail(String value) {
        this.locationDetail = value;
    }

    /**
     * Gets the value of the beds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigInteger getBeds() {
        return beds;
    }

    /**
     * Sets the value of the beds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeds(BigInteger value) {
        this.beds = value;
    }

    /**
     * Gets the value of the baths property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigInteger getBaths() {
        return baths;
    }

    /**
     * Sets the value of the baths property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaths(BigInteger value) {
        this.baths = value;
    }

    /**
     * Gets the value of the pool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Boolean isPool() {
        return pool;
    }

    /**
     * Sets the value of the pool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPool(Boolean value) {
        this.pool = value;
    }

    /**
     * Gets the value of the surfaceArea property.
     * 
     * @return
     *     possible object is
     *     {@link SurfaceType }
     *     
     */
    public SurfaceType getSurfaceArea() {
        return surfaceArea;
    }

    /**
     * Sets the value of the surfaceArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurfaceType }
     *     
     */
    public void setSurfaceArea(SurfaceType value) {
        this.surfaceArea = value;
    }

    /**
     * Gets the value of the energyRating property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyRatingType }
     *     
     */
    public EnergyRatingType getEnergyRating() {
        return energyRating;
    }

    /**
     * Sets the value of the energyRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyRatingType }
     *     
     */
    public void setEnergyRating(EnergyRatingType value) {
        this.energyRating = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link UrlType }
     *     
     */
    public UrlType getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlType }
     *     
     */
    public void setUrl(UrlType value) {
        this.url = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link LangType }
     *     
     */
    public LangType getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LangType }
     *     
     */
    public void setDesc(LangType value) {
        this.desc = value;
    }

    /**
     * Gets the value of the features property.
     * 
     * @return
     *     possible object is
     *     {@link FeaturesType }
     *     
     */
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
    public void setFeatures(FeaturesType value) {
        this.features = value;
    }

    /**
     * Gets the value of the images property.
     * 
     * @return
     *     possible object is
     *     {@link ImagesType }
     *     
     */
    public ImagesType getImages() {
        return images;
    }

    /**
     * Sets the value of the images property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImagesType }
     *     
     */
    public void setImages(ImagesType value) {
        this.images = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            Calendar theDate;
            theDate = this.getDate();
            strategy.appendField(locator, this, "date", buffer, theDate);
        }
        {
            String theRef;
            theRef = this.getRef();
            strategy.appendField(locator, this, "ref", buffer, theRef);
        }
        {
            Long thePrice;
            thePrice = this.getPrice();
            strategy.appendField(locator, this, "price", buffer, thePrice);
        }
        {
            CurrencyType theCurrency;
            theCurrency = this.getCurrency();
            strategy.appendField(locator, this, "currency", buffer, theCurrency);
        }
        {
            PriceFreqType thePriceFreq;
            thePriceFreq = this.getPriceFreq();
            strategy.appendField(locator, this, "priceFreq", buffer, thePriceFreq);
        }
        {
            Boolean thePartOwnership;
            thePartOwnership = this.isPartOwnership();
            strategy.appendField(locator, this, "partOwnership", buffer, thePartOwnership);
        }
        {
            Boolean theLeasehold;
            theLeasehold = this.isLeasehold();
            strategy.appendField(locator, this, "leasehold", buffer, theLeasehold);
        }
        {
            Boolean theNewBuild;
            theNewBuild = this.isNewBuild();
            strategy.appendField(locator, this, "newBuild", buffer, theNewBuild);
        }
        {
            String theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            String theTown;
            theTown = this.getTown();
            strategy.appendField(locator, this, "town", buffer, theTown);
        }
        {
            String theProvince;
            theProvince = this.getProvince();
            strategy.appendField(locator, this, "province", buffer, theProvince);
        }
        {
            GpsLocationType theLocation;
            theLocation = this.getLocation();
            strategy.appendField(locator, this, "location", buffer, theLocation);
        }
        {
            String theLocationDetail;
            theLocationDetail = this.getLocationDetail();
            strategy.appendField(locator, this, "locationDetail", buffer, theLocationDetail);
        }
        {
            BigInteger theBeds;
            theBeds = this.getBeds();
            strategy.appendField(locator, this, "beds", buffer, theBeds);
        }
        {
            BigInteger theBaths;
            theBaths = this.getBaths();
            strategy.appendField(locator, this, "baths", buffer, theBaths);
        }
        {
            Boolean thePool;
            thePool = this.isPool();
            strategy.appendField(locator, this, "pool", buffer, thePool);
        }
        {
            SurfaceType theSurfaceArea;
            theSurfaceArea = this.getSurfaceArea();
            strategy.appendField(locator, this, "surfaceArea", buffer, theSurfaceArea);
        }
        {
            EnergyRatingType theEnergyRating;
            theEnergyRating = this.getEnergyRating();
            strategy.appendField(locator, this, "energyRating", buffer, theEnergyRating);
        }
        {
            UrlType theUrl;
            theUrl = this.getUrl();
            strategy.appendField(locator, this, "url", buffer, theUrl);
        }
        {
            LangType theDesc;
            theDesc = this.getDesc();
            strategy.appendField(locator, this, "desc", buffer, theDesc);
        }
        {
            FeaturesType theFeatures;
            theFeatures = this.getFeatures();
            strategy.appendField(locator, this, "features", buffer, theFeatures);
        }
        {
            ImagesType theImages;
            theImages = this.getImages();
            strategy.appendField(locator, this, "images", buffer, theImages);
        }
        {
            String theNotes;
            theNotes = this.getNotes();
            strategy.appendField(locator, this, "notes", buffer, theNotes);
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof PropertyType) {
            final PropertyType copy = ((PropertyType) draftCopy);
            if (this.id!= null) {
                String sourceId;
                sourceId = this.getId();
                String copyId = ((String) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId));
                copy.setId(copyId);
            } else {
                copy.id = null;
            }
            if (this.date!= null) {
                Calendar sourceDate;
                sourceDate = this.getDate();
                Calendar copyDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "date", sourceDate), sourceDate));
                copy.setDate(copyDate);
            } else {
                copy.date = null;
            }
            if (this.ref!= null) {
                String sourceRef;
                sourceRef = this.getRef();
                String copyRef = ((String) strategy.copy(LocatorUtils.property(locator, "ref", sourceRef), sourceRef));
                copy.setRef(copyRef);
            } else {
                copy.ref = null;
            }
            if (this.price!= null) {
                Long sourcePrice;
                sourcePrice = this.getPrice();
                Long copyPrice = ((Long) strategy.copy(LocatorUtils.property(locator, "price", sourcePrice), sourcePrice));
                copy.setPrice(copyPrice);
            } else {
                copy.price = null;
            }
            if (this.currency!= null) {
                CurrencyType sourceCurrency;
                sourceCurrency = this.getCurrency();
                CurrencyType copyCurrency = ((CurrencyType) strategy.copy(LocatorUtils.property(locator, "currency", sourceCurrency), sourceCurrency));
                copy.setCurrency(copyCurrency);
            } else {
                copy.currency = null;
            }
            if (this.priceFreq!= null) {
                PriceFreqType sourcePriceFreq;
                sourcePriceFreq = this.getPriceFreq();
                PriceFreqType copyPriceFreq = ((PriceFreqType) strategy.copy(LocatorUtils.property(locator, "priceFreq", sourcePriceFreq), sourcePriceFreq));
                copy.setPriceFreq(copyPriceFreq);
            } else {
                copy.priceFreq = null;
            }
            if (this.partOwnership!= null) {
                Boolean sourcePartOwnership;
                sourcePartOwnership = this.isPartOwnership();
                Boolean copyPartOwnership = ((Boolean) strategy.copy(LocatorUtils.property(locator, "partOwnership", sourcePartOwnership), sourcePartOwnership));
                copy.setPartOwnership(copyPartOwnership);
            } else {
                copy.partOwnership = null;
            }
            if (this.leasehold!= null) {
                Boolean sourceLeasehold;
                sourceLeasehold = this.isLeasehold();
                Boolean copyLeasehold = ((Boolean) strategy.copy(LocatorUtils.property(locator, "leasehold", sourceLeasehold), sourceLeasehold));
                copy.setLeasehold(copyLeasehold);
            } else {
                copy.leasehold = null;
            }
            if (this.newBuild!= null) {
                Boolean sourceNewBuild;
                sourceNewBuild = this.isNewBuild();
                Boolean copyNewBuild = ((Boolean) strategy.copy(LocatorUtils.property(locator, "newBuild", sourceNewBuild), sourceNewBuild));
                copy.setNewBuild(copyNewBuild);
            } else {
                copy.newBuild = null;
            }
            if (this.type!= null) {
                String sourceType;
                sourceType = this.getType();
                String copyType = ((String) strategy.copy(LocatorUtils.property(locator, "type", sourceType), sourceType));
                copy.setType(copyType);
            } else {
                copy.type = null;
            }
            if (this.town!= null) {
                String sourceTown;
                sourceTown = this.getTown();
                String copyTown = ((String) strategy.copy(LocatorUtils.property(locator, "town", sourceTown), sourceTown));
                copy.setTown(copyTown);
            } else {
                copy.town = null;
            }
            if (this.province!= null) {
                String sourceProvince;
                sourceProvince = this.getProvince();
                String copyProvince = ((String) strategy.copy(LocatorUtils.property(locator, "province", sourceProvince), sourceProvince));
                copy.setProvince(copyProvince);
            } else {
                copy.province = null;
            }
            if (this.location!= null) {
                GpsLocationType sourceLocation;
                sourceLocation = this.getLocation();
                GpsLocationType copyLocation = ((GpsLocationType) strategy.copy(LocatorUtils.property(locator, "location", sourceLocation), sourceLocation));
                copy.setLocation(copyLocation);
            } else {
                copy.location = null;
            }
            if (this.locationDetail!= null) {
                String sourceLocationDetail;
                sourceLocationDetail = this.getLocationDetail();
                String copyLocationDetail = ((String) strategy.copy(LocatorUtils.property(locator, "locationDetail", sourceLocationDetail), sourceLocationDetail));
                copy.setLocationDetail(copyLocationDetail);
            } else {
                copy.locationDetail = null;
            }
            if (this.beds!= null) {
                BigInteger sourceBeds;
                sourceBeds = this.getBeds();
                BigInteger copyBeds = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "beds", sourceBeds), sourceBeds));
                copy.setBeds(copyBeds);
            } else {
                copy.beds = null;
            }
            if (this.baths!= null) {
                BigInteger sourceBaths;
                sourceBaths = this.getBaths();
                BigInteger copyBaths = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "baths", sourceBaths), sourceBaths));
                copy.setBaths(copyBaths);
            } else {
                copy.baths = null;
            }
            if (this.pool!= null) {
                Boolean sourcePool;
                sourcePool = this.isPool();
                Boolean copyPool = ((Boolean) strategy.copy(LocatorUtils.property(locator, "pool", sourcePool), sourcePool));
                copy.setPool(copyPool);
            } else {
                copy.pool = null;
            }
            if (this.surfaceArea!= null) {
                SurfaceType sourceSurfaceArea;
                sourceSurfaceArea = this.getSurfaceArea();
                SurfaceType copySurfaceArea = ((SurfaceType) strategy.copy(LocatorUtils.property(locator, "surfaceArea", sourceSurfaceArea), sourceSurfaceArea));
                copy.setSurfaceArea(copySurfaceArea);
            } else {
                copy.surfaceArea = null;
            }
            if (this.energyRating!= null) {
                EnergyRatingType sourceEnergyRating;
                sourceEnergyRating = this.getEnergyRating();
                EnergyRatingType copyEnergyRating = ((EnergyRatingType) strategy.copy(LocatorUtils.property(locator, "energyRating", sourceEnergyRating), sourceEnergyRating));
                copy.setEnergyRating(copyEnergyRating);
            } else {
                copy.energyRating = null;
            }
            if (this.url!= null) {
                UrlType sourceUrl;
                sourceUrl = this.getUrl();
                UrlType copyUrl = ((UrlType) strategy.copy(LocatorUtils.property(locator, "url", sourceUrl), sourceUrl));
                copy.setUrl(copyUrl);
            } else {
                copy.url = null;
            }
            if (this.desc!= null) {
                LangType sourceDesc;
                sourceDesc = this.getDesc();
                LangType copyDesc = ((LangType) strategy.copy(LocatorUtils.property(locator, "desc", sourceDesc), sourceDesc));
                copy.setDesc(copyDesc);
            } else {
                copy.desc = null;
            }
            if (this.features!= null) {
                FeaturesType sourceFeatures;
                sourceFeatures = this.getFeatures();
                FeaturesType copyFeatures = ((FeaturesType) strategy.copy(LocatorUtils.property(locator, "features", sourceFeatures), sourceFeatures));
                copy.setFeatures(copyFeatures);
            } else {
                copy.features = null;
            }
            if (this.images!= null) {
                ImagesType sourceImages;
                sourceImages = this.getImages();
                ImagesType copyImages = ((ImagesType) strategy.copy(LocatorUtils.property(locator, "images", sourceImages), sourceImages));
                copy.setImages(copyImages);
            } else {
                copy.images = null;
            }
            if (this.notes!= null) {
                String sourceNotes;
                sourceNotes = this.getNotes();
                String copyNotes = ((String) strategy.copy(LocatorUtils.property(locator, "notes", sourceNotes), sourceNotes));
                copy.setNotes(copyNotes);
            } else {
                copy.notes = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new PropertyType();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PropertyType)) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            Calendar lhsDate;
            lhsDate = this.getDate();
            Calendar rhsDate;
            rhsDate = that.getDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "date", lhsDate), LocatorUtils.property(thatLocator, "date", rhsDate), lhsDate, rhsDate)) {
                return false;
            }
        }
        {
            String lhsRef;
            lhsRef = this.getRef();
            String rhsRef;
            rhsRef = that.getRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ref", lhsRef), LocatorUtils.property(thatLocator, "ref", rhsRef), lhsRef, rhsRef)) {
                return false;
            }
        }
        {
            Long lhsPrice;
            lhsPrice = this.getPrice();
            Long rhsPrice;
            rhsPrice = that.getPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "price", lhsPrice), LocatorUtils.property(thatLocator, "price", rhsPrice), lhsPrice, rhsPrice)) {
                return false;
            }
        }
        {
            CurrencyType lhsCurrency;
            lhsCurrency = this.getCurrency();
            CurrencyType rhsCurrency;
            rhsCurrency = that.getCurrency();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "currency", lhsCurrency), LocatorUtils.property(thatLocator, "currency", rhsCurrency), lhsCurrency, rhsCurrency)) {
                return false;
            }
        }
        {
            PriceFreqType lhsPriceFreq;
            lhsPriceFreq = this.getPriceFreq();
            PriceFreqType rhsPriceFreq;
            rhsPriceFreq = that.getPriceFreq();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priceFreq", lhsPriceFreq), LocatorUtils.property(thatLocator, "priceFreq", rhsPriceFreq), lhsPriceFreq, rhsPriceFreq)) {
                return false;
            }
        }
        {
            Boolean lhsPartOwnership;
            lhsPartOwnership = this.isPartOwnership();
            Boolean rhsPartOwnership;
            rhsPartOwnership = that.isPartOwnership();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partOwnership", lhsPartOwnership), LocatorUtils.property(thatLocator, "partOwnership", rhsPartOwnership), lhsPartOwnership, rhsPartOwnership)) {
                return false;
            }
        }
        {
            Boolean lhsLeasehold;
            lhsLeasehold = this.isLeasehold();
            Boolean rhsLeasehold;
            rhsLeasehold = that.isLeasehold();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leasehold", lhsLeasehold), LocatorUtils.property(thatLocator, "leasehold", rhsLeasehold), lhsLeasehold, rhsLeasehold)) {
                return false;
            }
        }
        {
            Boolean lhsNewBuild;
            lhsNewBuild = this.isNewBuild();
            Boolean rhsNewBuild;
            rhsNewBuild = that.isNewBuild();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "newBuild", lhsNewBuild), LocatorUtils.property(thatLocator, "newBuild", rhsNewBuild), lhsNewBuild, rhsNewBuild)) {
                return false;
            }
        }
        {
            String lhsType;
            lhsType = this.getType();
            String rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            String lhsTown;
            lhsTown = this.getTown();
            String rhsTown;
            rhsTown = that.getTown();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "town", lhsTown), LocatorUtils.property(thatLocator, "town", rhsTown), lhsTown, rhsTown)) {
                return false;
            }
        }
        {
            String lhsProvince;
            lhsProvince = this.getProvince();
            String rhsProvince;
            rhsProvince = that.getProvince();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "province", lhsProvince), LocatorUtils.property(thatLocator, "province", rhsProvince), lhsProvince, rhsProvince)) {
                return false;
            }
        }
        {
            GpsLocationType lhsLocation;
            lhsLocation = this.getLocation();
            GpsLocationType rhsLocation;
            rhsLocation = that.getLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "location", lhsLocation), LocatorUtils.property(thatLocator, "location", rhsLocation), lhsLocation, rhsLocation)) {
                return false;
            }
        }
        {
            String lhsLocationDetail;
            lhsLocationDetail = this.getLocationDetail();
            String rhsLocationDetail;
            rhsLocationDetail = that.getLocationDetail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "locationDetail", lhsLocationDetail), LocatorUtils.property(thatLocator, "locationDetail", rhsLocationDetail), lhsLocationDetail, rhsLocationDetail)) {
                return false;
            }
        }
        {
            BigInteger lhsBeds;
            lhsBeds = this.getBeds();
            BigInteger rhsBeds;
            rhsBeds = that.getBeds();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beds", lhsBeds), LocatorUtils.property(thatLocator, "beds", rhsBeds), lhsBeds, rhsBeds)) {
                return false;
            }
        }
        {
            BigInteger lhsBaths;
            lhsBaths = this.getBaths();
            BigInteger rhsBaths;
            rhsBaths = that.getBaths();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baths", lhsBaths), LocatorUtils.property(thatLocator, "baths", rhsBaths), lhsBaths, rhsBaths)) {
                return false;
            }
        }
        {
            Boolean lhsPool;
            lhsPool = this.isPool();
            Boolean rhsPool;
            rhsPool = that.isPool();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pool", lhsPool), LocatorUtils.property(thatLocator, "pool", rhsPool), lhsPool, rhsPool)) {
                return false;
            }
        }
        {
            SurfaceType lhsSurfaceArea;
            lhsSurfaceArea = this.getSurfaceArea();
            SurfaceType rhsSurfaceArea;
            rhsSurfaceArea = that.getSurfaceArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "surfaceArea", lhsSurfaceArea), LocatorUtils.property(thatLocator, "surfaceArea", rhsSurfaceArea), lhsSurfaceArea, rhsSurfaceArea)) {
                return false;
            }
        }
        {
            EnergyRatingType lhsEnergyRating;
            lhsEnergyRating = this.getEnergyRating();
            EnergyRatingType rhsEnergyRating;
            rhsEnergyRating = that.getEnergyRating();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energyRating", lhsEnergyRating), LocatorUtils.property(thatLocator, "energyRating", rhsEnergyRating), lhsEnergyRating, rhsEnergyRating)) {
                return false;
            }
        }
        {
            UrlType lhsUrl;
            lhsUrl = this.getUrl();
            UrlType rhsUrl;
            rhsUrl = that.getUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "url", lhsUrl), LocatorUtils.property(thatLocator, "url", rhsUrl), lhsUrl, rhsUrl)) {
                return false;
            }
        }
        {
            LangType lhsDesc;
            lhsDesc = this.getDesc();
            LangType rhsDesc;
            rhsDesc = that.getDesc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "desc", lhsDesc), LocatorUtils.property(thatLocator, "desc", rhsDesc), lhsDesc, rhsDesc)) {
                return false;
            }
        }
        {
            FeaturesType lhsFeatures;
            lhsFeatures = this.getFeatures();
            FeaturesType rhsFeatures;
            rhsFeatures = that.getFeatures();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "features", lhsFeatures), LocatorUtils.property(thatLocator, "features", rhsFeatures), lhsFeatures, rhsFeatures)) {
                return false;
            }
        }
        {
            ImagesType lhsImages;
            lhsImages = this.getImages();
            ImagesType rhsImages;
            rhsImages = that.getImages();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "images", lhsImages), LocatorUtils.property(thatLocator, "images", rhsImages), lhsImages, rhsImages)) {
                return false;
            }
        }
        {
            String lhsNotes;
            lhsNotes = this.getNotes();
            String rhsNotes;
            rhsNotes = that.getNotes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "notes", lhsNotes), LocatorUtils.property(thatLocator, "notes", rhsNotes), lhsNotes, rhsNotes)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
