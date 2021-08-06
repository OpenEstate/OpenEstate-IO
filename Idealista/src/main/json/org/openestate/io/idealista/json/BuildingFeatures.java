
package org.openestate.io.idealista.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Building Object
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "featuresType",
    "featuresAreaConstructed",
    "featuresAreaTradableMinimum",
    "featuresBuiltProperties",
    "featuresBuiltYear",
    "featuresClassificationChalet",
    "featuresClassificationCommercial",
    "featuresClassificationHotel",
    "featuresClassificationIndustrial",
    "featuresClassificationOffice",
    "featuresClassificationOther",
    "featuresConservation",
    "featuresEnergyCertificateRating",
    "featuresEnergyCertificatePerformance",
    "featuresEnergyCertificateType",
    "featuresEnergyCertificateLaw",
    "featuresFloorsBuilding",
    "featuresLiftNumber",
    "featuresParkingSpacesNumber",
    "featuresPropertyTenants",
    "featuresSecurityPersonnel"
})
public class BuildingFeatures
    extends AbstractFeatures
    implements Serializable
{

    /**
     * property types
     * <p>
     * 
     * Corresponds to the "featuresType" property.
     * (Required)
     * 
     */
    @JsonProperty("featuresType")
    @NotNull
    @Nonnull
    private BuildingFeatures.Type type;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("featuresAreaConstructed")
    @DecimalMin("1")
    @DecimalMax("99999")
    @NotNull
    @Nonnull
    private BigInteger areaConstructed;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresAreaTradableMinimum")
    @DecimalMin("1")
    @DecimalMax("999999")
    private BigInteger areaTradableMinimum;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresBuiltProperties")
    @DecimalMin("1")
    @DecimalMax("99")
    private BigInteger builtProperties;
    /**
     * building year
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresBuiltYear")
    @DecimalMin("1700")
    @DecimalMax("2100")
    private BigInteger builtYear;
    /**
     * chalet classification
     * <p>
     * classified for residential house (detached)
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresClassificationChalet")
    @JsonPropertyDescription("classified for residential house (detached)")
    private Boolean classificationChalet;
    /**
     * commercial classification
     * <p>
     * classified for tertiary commercial properties
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresClassificationCommercial")
    @JsonPropertyDescription("classified for tertiary commercial properties")
    private Boolean classificationCommercial;
    /**
     * hotel classification
     * <p>
     * classified for hotels properties
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresClassificationHotel")
    @JsonPropertyDescription("classified for hotels properties")
    private Boolean classificationHotel;
    /**
     * industrial classification
     * <p>
     * classified for industrial properties
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresClassificationIndustrial")
    @JsonPropertyDescription("classified for industrial properties")
    private Boolean classificationIndustrial;
    /**
     * office classification
     * <p>
     * classified for office properties
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresClassificationOffice")
    @JsonPropertyDescription("classified for office properties")
    private Boolean classificationOffice;
    /**
     * other classification
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresClassificationOther")
    private Boolean classificationOther;
    /**
     * conservation status
     * <p>
     * status new is only available for new development properties, not for secondhand properties
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresConservation")
    @JsonPropertyDescription("status new is only available for new development properties, not for secondhand properties")
    private ConservationType conservation;
    /**
     * energy certification rating
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresEnergyCertificateRating")
    private EnergyCertificateRatingType energyCertificateRating;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresEnergyCertificatePerformance")
    @DecimalMin("1")
    @DecimalMax("999")
    private BigDecimal energyCertificatePerformance;
    /**
     * energy certification type
     * <p>
     * only available for new development properties. project: certification in project phase; completed: certification if the property is finished
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresEnergyCertificateType")
    @JsonPropertyDescription("only available for new development properties. project: certification in project phase; completed: certification if the property is finished")
    private EnergyCertificateType energyCertificateType;
    /**
     * energy certification law
     * <p>
     * only for Italy, indicates the legislation that applies to the energy rating, DL-192(2005) or LEGGE-90(2013)
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresEnergyCertificateLaw")
    @JsonPropertyDescription("only for Italy, indicates the legislation that applies to the energy rating, DL-192(2005) or LEGGE-90(2013)")
    private EnergyCertificateLawType energyCertificateLaw;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresFloorsBuilding")
    @DecimalMin("1")
    @DecimalMax("99")
    private BigInteger floorsBuilding;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresLiftNumber")
    @DecimalMin("1")
    @DecimalMax("9")
    private BigInteger liftNumber;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresParkingSpacesNumber")
    @DecimalMin("1")
    @DecimalMax("99")
    private BigInteger parkingSpacesNumber;
    /**
     * tenants
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresPropertyTenants")
    private Boolean propertyTenants;
    /**
     * security personnel
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresSecurityPersonnel")
    private Boolean securityPersonnel;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 362284814886687707L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BuildingFeatures() {
    }

    /**
     * 
     * @param type
     * @param areaConstructed
     */
    public BuildingFeatures(BuildingFeatures.Type type, BigInteger areaConstructed) {
        super();
        this.type = type;
        this.areaConstructed = areaConstructed;
    }

    /**
     * property types
     * <p>
     * 
     * Corresponds to the "featuresType" property.
     * (Required)
     * 
     */
    @JsonProperty("featuresType")
    public BuildingFeatures.Type getType() {
        return type;
    }

    /**
     * property types
     * <p>
     * 
     * Corresponds to the "featuresType" property.
     * (Required)
     * 
     */
    @JsonProperty("featuresType")
    public void setType(BuildingFeatures.Type type) {
        this.type = type;
    }

    public BuildingFeatures withType(BuildingFeatures.Type type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("featuresAreaConstructed")
    public BigInteger getAreaConstructed() {
        return areaConstructed;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("featuresAreaConstructed")
    public void setAreaConstructed(BigInteger areaConstructed) {
        this.areaConstructed = areaConstructed;
    }

    public BuildingFeatures withAreaConstructed(BigInteger areaConstructed) {
        this.areaConstructed = areaConstructed;
        return this;
    }

    @JsonProperty("featuresAreaTradableMinimum")
    public BigInteger getAreaTradableMinimum() {
        return areaTradableMinimum;
    }

    @JsonProperty("featuresAreaTradableMinimum")
    public void setAreaTradableMinimum(BigInteger areaTradableMinimum) {
        this.areaTradableMinimum = areaTradableMinimum;
    }

    public BuildingFeatures withAreaTradableMinimum(BigInteger areaTradableMinimum) {
        this.areaTradableMinimum = areaTradableMinimum;
        return this;
    }

    @JsonProperty("featuresBuiltProperties")
    public BigInteger getBuiltProperties() {
        return builtProperties;
    }

    @JsonProperty("featuresBuiltProperties")
    public void setBuiltProperties(BigInteger builtProperties) {
        this.builtProperties = builtProperties;
    }

    public BuildingFeatures withBuiltProperties(BigInteger builtProperties) {
        this.builtProperties = builtProperties;
        return this;
    }

    /**
     * building year
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresBuiltYear")
    public BigInteger getBuiltYear() {
        return builtYear;
    }

    /**
     * building year
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresBuiltYear")
    public void setBuiltYear(BigInteger builtYear) {
        this.builtYear = builtYear;
    }

    public BuildingFeatures withBuiltYear(BigInteger builtYear) {
        this.builtYear = builtYear;
        return this;
    }

    /**
     * chalet classification
     * <p>
     * classified for residential house (detached)
     * 
     */
    @JsonProperty("featuresClassificationChalet")
    public Boolean getClassificationChalet() {
        return classificationChalet;
    }

    /**
     * chalet classification
     * <p>
     * classified for residential house (detached)
     * 
     */
    @JsonProperty("featuresClassificationChalet")
    public void setClassificationChalet(Boolean classificationChalet) {
        this.classificationChalet = classificationChalet;
    }

    public BuildingFeatures withClassificationChalet(Boolean classificationChalet) {
        this.classificationChalet = classificationChalet;
        return this;
    }

    /**
     * commercial classification
     * <p>
     * classified for tertiary commercial properties
     * 
     */
    @JsonProperty("featuresClassificationCommercial")
    public Boolean getClassificationCommercial() {
        return classificationCommercial;
    }

    /**
     * commercial classification
     * <p>
     * classified for tertiary commercial properties
     * 
     */
    @JsonProperty("featuresClassificationCommercial")
    public void setClassificationCommercial(Boolean classificationCommercial) {
        this.classificationCommercial = classificationCommercial;
    }

    public BuildingFeatures withClassificationCommercial(Boolean classificationCommercial) {
        this.classificationCommercial = classificationCommercial;
        return this;
    }

    /**
     * hotel classification
     * <p>
     * classified for hotels properties
     * 
     */
    @JsonProperty("featuresClassificationHotel")
    public Boolean getClassificationHotel() {
        return classificationHotel;
    }

    /**
     * hotel classification
     * <p>
     * classified for hotels properties
     * 
     */
    @JsonProperty("featuresClassificationHotel")
    public void setClassificationHotel(Boolean classificationHotel) {
        this.classificationHotel = classificationHotel;
    }

    public BuildingFeatures withClassificationHotel(Boolean classificationHotel) {
        this.classificationHotel = classificationHotel;
        return this;
    }

    /**
     * industrial classification
     * <p>
     * classified for industrial properties
     * 
     */
    @JsonProperty("featuresClassificationIndustrial")
    public Boolean getClassificationIndustrial() {
        return classificationIndustrial;
    }

    /**
     * industrial classification
     * <p>
     * classified for industrial properties
     * 
     */
    @JsonProperty("featuresClassificationIndustrial")
    public void setClassificationIndustrial(Boolean classificationIndustrial) {
        this.classificationIndustrial = classificationIndustrial;
    }

    public BuildingFeatures withClassificationIndustrial(Boolean classificationIndustrial) {
        this.classificationIndustrial = classificationIndustrial;
        return this;
    }

    /**
     * office classification
     * <p>
     * classified for office properties
     * 
     */
    @JsonProperty("featuresClassificationOffice")
    public Boolean getClassificationOffice() {
        return classificationOffice;
    }

    /**
     * office classification
     * <p>
     * classified for office properties
     * 
     */
    @JsonProperty("featuresClassificationOffice")
    public void setClassificationOffice(Boolean classificationOffice) {
        this.classificationOffice = classificationOffice;
    }

    public BuildingFeatures withClassificationOffice(Boolean classificationOffice) {
        this.classificationOffice = classificationOffice;
        return this;
    }

    /**
     * other classification
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresClassificationOther")
    public Boolean getClassificationOther() {
        return classificationOther;
    }

    /**
     * other classification
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresClassificationOther")
    public void setClassificationOther(Boolean classificationOther) {
        this.classificationOther = classificationOther;
    }

    public BuildingFeatures withClassificationOther(Boolean classificationOther) {
        this.classificationOther = classificationOther;
        return this;
    }

    /**
     * conservation status
     * <p>
     * status new is only available for new development properties, not for secondhand properties
     * 
     */
    @JsonProperty("featuresConservation")
    public ConservationType getConservation() {
        return conservation;
    }

    /**
     * conservation status
     * <p>
     * status new is only available for new development properties, not for secondhand properties
     * 
     */
    @JsonProperty("featuresConservation")
    public void setConservation(ConservationType conservation) {
        this.conservation = conservation;
    }

    public BuildingFeatures withConservation(ConservationType conservation) {
        this.conservation = conservation;
        return this;
    }

    /**
     * energy certification rating
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresEnergyCertificateRating")
    public EnergyCertificateRatingType getEnergyCertificateRating() {
        return energyCertificateRating;
    }

    /**
     * energy certification rating
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresEnergyCertificateRating")
    public void setEnergyCertificateRating(EnergyCertificateRatingType energyCertificateRating) {
        this.energyCertificateRating = energyCertificateRating;
    }

    public BuildingFeatures withEnergyCertificateRating(EnergyCertificateRatingType energyCertificateRating) {
        this.energyCertificateRating = energyCertificateRating;
        return this;
    }

    @JsonProperty("featuresEnergyCertificatePerformance")
    public BigDecimal getEnergyCertificatePerformance() {
        return energyCertificatePerformance;
    }

    @JsonProperty("featuresEnergyCertificatePerformance")
    public void setEnergyCertificatePerformance(BigDecimal energyCertificatePerformance) {
        this.energyCertificatePerformance = energyCertificatePerformance;
    }

    public BuildingFeatures withEnergyCertificatePerformance(BigDecimal energyCertificatePerformance) {
        this.energyCertificatePerformance = energyCertificatePerformance;
        return this;
    }

    /**
     * energy certification type
     * <p>
     * only available for new development properties. project: certification in project phase; completed: certification if the property is finished
     * 
     */
    @JsonProperty("featuresEnergyCertificateType")
    public EnergyCertificateType getEnergyCertificateType() {
        return energyCertificateType;
    }

    /**
     * energy certification type
     * <p>
     * only available for new development properties. project: certification in project phase; completed: certification if the property is finished
     * 
     */
    @JsonProperty("featuresEnergyCertificateType")
    public void setEnergyCertificateType(EnergyCertificateType energyCertificateType) {
        this.energyCertificateType = energyCertificateType;
    }

    public BuildingFeatures withEnergyCertificateType(EnergyCertificateType energyCertificateType) {
        this.energyCertificateType = energyCertificateType;
        return this;
    }

    /**
     * energy certification law
     * <p>
     * only for Italy, indicates the legislation that applies to the energy rating, DL-192(2005) or LEGGE-90(2013)
     * 
     */
    @JsonProperty("featuresEnergyCertificateLaw")
    public EnergyCertificateLawType getEnergyCertificateLaw() {
        return energyCertificateLaw;
    }

    /**
     * energy certification law
     * <p>
     * only for Italy, indicates the legislation that applies to the energy rating, DL-192(2005) or LEGGE-90(2013)
     * 
     */
    @JsonProperty("featuresEnergyCertificateLaw")
    public void setEnergyCertificateLaw(EnergyCertificateLawType energyCertificateLaw) {
        this.energyCertificateLaw = energyCertificateLaw;
    }

    public BuildingFeatures withEnergyCertificateLaw(EnergyCertificateLawType energyCertificateLaw) {
        this.energyCertificateLaw = energyCertificateLaw;
        return this;
    }

    @JsonProperty("featuresFloorsBuilding")
    public BigInteger getFloorsBuilding() {
        return floorsBuilding;
    }

    @JsonProperty("featuresFloorsBuilding")
    public void setFloorsBuilding(BigInteger floorsBuilding) {
        this.floorsBuilding = floorsBuilding;
    }

    public BuildingFeatures withFloorsBuilding(BigInteger floorsBuilding) {
        this.floorsBuilding = floorsBuilding;
        return this;
    }

    @JsonProperty("featuresLiftNumber")
    public BigInteger getLiftNumber() {
        return liftNumber;
    }

    @JsonProperty("featuresLiftNumber")
    public void setLiftNumber(BigInteger liftNumber) {
        this.liftNumber = liftNumber;
    }

    public BuildingFeatures withLiftNumber(BigInteger liftNumber) {
        this.liftNumber = liftNumber;
        return this;
    }

    @JsonProperty("featuresParkingSpacesNumber")
    public BigInteger getParkingSpacesNumber() {
        return parkingSpacesNumber;
    }

    @JsonProperty("featuresParkingSpacesNumber")
    public void setParkingSpacesNumber(BigInteger parkingSpacesNumber) {
        this.parkingSpacesNumber = parkingSpacesNumber;
    }

    public BuildingFeatures withParkingSpacesNumber(BigInteger parkingSpacesNumber) {
        this.parkingSpacesNumber = parkingSpacesNumber;
        return this;
    }

    /**
     * tenants
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresPropertyTenants")
    public Boolean getPropertyTenants() {
        return propertyTenants;
    }

    /**
     * tenants
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresPropertyTenants")
    public void setPropertyTenants(Boolean propertyTenants) {
        this.propertyTenants = propertyTenants;
    }

    public BuildingFeatures withPropertyTenants(Boolean propertyTenants) {
        this.propertyTenants = propertyTenants;
        return this;
    }

    /**
     * security personnel
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSecurityPersonnel")
    public Boolean getSecurityPersonnel() {
        return securityPersonnel;
    }

    /**
     * security personnel
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSecurityPersonnel")
    public void setSecurityPersonnel(Boolean securityPersonnel) {
        this.securityPersonnel = securityPersonnel;
    }

    public BuildingFeatures withSecurityPersonnel(Boolean securityPersonnel) {
        this.securityPersonnel = securityPersonnel;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public BuildingFeatures withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BuildingFeatures.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        int baseLength = sb.length();
        String superString = super.toString();
        if (superString!= null) {
            int contentStart = superString.indexOf('[');
            int contentEnd = superString.lastIndexOf(']');
            if ((contentStart >= 0)&&(contentEnd >contentStart)) {
                sb.append(superString, (contentStart + 1), contentEnd);
            } else {
                sb.append(superString);
            }
        }
        if (sb.length()>baseLength) {
            sb.append(',');
        }
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("areaConstructed");
        sb.append('=');
        sb.append(((this.areaConstructed == null)?"<null>":this.areaConstructed));
        sb.append(',');
        sb.append("areaTradableMinimum");
        sb.append('=');
        sb.append(((this.areaTradableMinimum == null)?"<null>":this.areaTradableMinimum));
        sb.append(',');
        sb.append("builtProperties");
        sb.append('=');
        sb.append(((this.builtProperties == null)?"<null>":this.builtProperties));
        sb.append(',');
        sb.append("builtYear");
        sb.append('=');
        sb.append(((this.builtYear == null)?"<null>":this.builtYear));
        sb.append(',');
        sb.append("classificationChalet");
        sb.append('=');
        sb.append(((this.classificationChalet == null)?"<null>":this.classificationChalet));
        sb.append(',');
        sb.append("classificationCommercial");
        sb.append('=');
        sb.append(((this.classificationCommercial == null)?"<null>":this.classificationCommercial));
        sb.append(',');
        sb.append("classificationHotel");
        sb.append('=');
        sb.append(((this.classificationHotel == null)?"<null>":this.classificationHotel));
        sb.append(',');
        sb.append("classificationIndustrial");
        sb.append('=');
        sb.append(((this.classificationIndustrial == null)?"<null>":this.classificationIndustrial));
        sb.append(',');
        sb.append("classificationOffice");
        sb.append('=');
        sb.append(((this.classificationOffice == null)?"<null>":this.classificationOffice));
        sb.append(',');
        sb.append("classificationOther");
        sb.append('=');
        sb.append(((this.classificationOther == null)?"<null>":this.classificationOther));
        sb.append(',');
        sb.append("conservation");
        sb.append('=');
        sb.append(((this.conservation == null)?"<null>":this.conservation));
        sb.append(',');
        sb.append("energyCertificateRating");
        sb.append('=');
        sb.append(((this.energyCertificateRating == null)?"<null>":this.energyCertificateRating));
        sb.append(',');
        sb.append("energyCertificatePerformance");
        sb.append('=');
        sb.append(((this.energyCertificatePerformance == null)?"<null>":this.energyCertificatePerformance));
        sb.append(',');
        sb.append("energyCertificateType");
        sb.append('=');
        sb.append(((this.energyCertificateType == null)?"<null>":this.energyCertificateType));
        sb.append(',');
        sb.append("energyCertificateLaw");
        sb.append('=');
        sb.append(((this.energyCertificateLaw == null)?"<null>":this.energyCertificateLaw));
        sb.append(',');
        sb.append("floorsBuilding");
        sb.append('=');
        sb.append(((this.floorsBuilding == null)?"<null>":this.floorsBuilding));
        sb.append(',');
        sb.append("liftNumber");
        sb.append('=');
        sb.append(((this.liftNumber == null)?"<null>":this.liftNumber));
        sb.append(',');
        sb.append("parkingSpacesNumber");
        sb.append('=');
        sb.append(((this.parkingSpacesNumber == null)?"<null>":this.parkingSpacesNumber));
        sb.append(',');
        sb.append("propertyTenants");
        sb.append('=');
        sb.append(((this.propertyTenants == null)?"<null>":this.propertyTenants));
        sb.append(',');
        sb.append("securityPersonnel");
        sb.append('=');
        sb.append(((this.securityPersonnel == null)?"<null>":this.securityPersonnel));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.floorsBuilding == null)? 0 :this.floorsBuilding.hashCode()));
        result = ((result* 31)+((this.liftNumber == null)? 0 :this.liftNumber.hashCode()));
        result = ((result* 31)+((this.areaTradableMinimum == null)? 0 :this.areaTradableMinimum.hashCode()));
        result = ((result* 31)+((this.classificationIndustrial == null)? 0 :this.classificationIndustrial.hashCode()));
        result = ((result* 31)+((this.energyCertificateRating == null)? 0 :this.energyCertificateRating.hashCode()));
        result = ((result* 31)+((this.classificationChalet == null)? 0 :this.classificationChalet.hashCode()));
        result = ((result* 31)+((this.classificationCommercial == null)? 0 :this.classificationCommercial.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.securityPersonnel == null)? 0 :this.securityPersonnel.hashCode()));
        result = ((result* 31)+((this.areaConstructed == null)? 0 :this.areaConstructed.hashCode()));
        result = ((result* 31)+((this.classificationHotel == null)? 0 :this.classificationHotel.hashCode()));
        result = ((result* 31)+((this.classificationOther == null)? 0 :this.classificationOther.hashCode()));
        result = ((result* 31)+((this.parkingSpacesNumber == null)? 0 :this.parkingSpacesNumber.hashCode()));
        result = ((result* 31)+((this.classificationOffice == null)? 0 :this.classificationOffice.hashCode()));
        result = ((result* 31)+((this.conservation == null)? 0 :this.conservation.hashCode()));
        result = ((result* 31)+((this.energyCertificateLaw == null)? 0 :this.energyCertificateLaw.hashCode()));
        result = ((result* 31)+((this.energyCertificateType == null)? 0 :this.energyCertificateType.hashCode()));
        result = ((result* 31)+((this.builtYear == null)? 0 :this.builtYear.hashCode()));
        result = ((result* 31)+((this.builtProperties == null)? 0 :this.builtProperties.hashCode()));
        result = ((result* 31)+((this.energyCertificatePerformance == null)? 0 :this.energyCertificatePerformance.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.propertyTenants == null)? 0 :this.propertyTenants.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BuildingFeatures) == false) {
            return false;
        }
        BuildingFeatures rhs = ((BuildingFeatures) other);
        return ((((((((((((((((((((((super.equals(rhs)&&((this.floorsBuilding == rhs.floorsBuilding)||((this.floorsBuilding!= null)&&this.floorsBuilding.equals(rhs.floorsBuilding))))&&((this.liftNumber == rhs.liftNumber)||((this.liftNumber!= null)&&this.liftNumber.equals(rhs.liftNumber))))&&((this.areaTradableMinimum == rhs.areaTradableMinimum)||((this.areaTradableMinimum!= null)&&this.areaTradableMinimum.equals(rhs.areaTradableMinimum))))&&((this.classificationIndustrial == rhs.classificationIndustrial)||((this.classificationIndustrial!= null)&&this.classificationIndustrial.equals(rhs.classificationIndustrial))))&&((this.energyCertificateRating == rhs.energyCertificateRating)||((this.energyCertificateRating!= null)&&this.energyCertificateRating.equals(rhs.energyCertificateRating))))&&((this.classificationChalet == rhs.classificationChalet)||((this.classificationChalet!= null)&&this.classificationChalet.equals(rhs.classificationChalet))))&&((this.classificationCommercial == rhs.classificationCommercial)||((this.classificationCommercial!= null)&&this.classificationCommercial.equals(rhs.classificationCommercial))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.securityPersonnel == rhs.securityPersonnel)||((this.securityPersonnel!= null)&&this.securityPersonnel.equals(rhs.securityPersonnel))))&&((this.areaConstructed == rhs.areaConstructed)||((this.areaConstructed!= null)&&this.areaConstructed.equals(rhs.areaConstructed))))&&((this.classificationHotel == rhs.classificationHotel)||((this.classificationHotel!= null)&&this.classificationHotel.equals(rhs.classificationHotel))))&&((this.classificationOther == rhs.classificationOther)||((this.classificationOther!= null)&&this.classificationOther.equals(rhs.classificationOther))))&&((this.parkingSpacesNumber == rhs.parkingSpacesNumber)||((this.parkingSpacesNumber!= null)&&this.parkingSpacesNumber.equals(rhs.parkingSpacesNumber))))&&((this.classificationOffice == rhs.classificationOffice)||((this.classificationOffice!= null)&&this.classificationOffice.equals(rhs.classificationOffice))))&&((this.conservation == rhs.conservation)||((this.conservation!= null)&&this.conservation.equals(rhs.conservation))))&&((this.energyCertificateLaw == rhs.energyCertificateLaw)||((this.energyCertificateLaw!= null)&&this.energyCertificateLaw.equals(rhs.energyCertificateLaw))))&&((this.energyCertificateType == rhs.energyCertificateType)||((this.energyCertificateType!= null)&&this.energyCertificateType.equals(rhs.energyCertificateType))))&&((this.builtYear == rhs.builtYear)||((this.builtYear!= null)&&this.builtYear.equals(rhs.builtYear))))&&((this.builtProperties == rhs.builtProperties)||((this.builtProperties!= null)&&this.builtProperties.equals(rhs.builtProperties))))&&((this.energyCertificatePerformance == rhs.energyCertificatePerformance)||((this.energyCertificatePerformance!= null)&&this.energyCertificatePerformance.equals(rhs.energyCertificatePerformance))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.propertyTenants == rhs.propertyTenants)||((this.propertyTenants!= null)&&this.propertyTenants.equals(rhs.propertyTenants))));
    }


    /**
     * property types
     * <p>
     * 
     * 
     */
    public enum Type {

        BUILDING("building");
        private final String value;
        private final static Map<String, BuildingFeatures.Type> CONSTANTS = new HashMap<String, BuildingFeatures.Type>();

        static {
            for (BuildingFeatures.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static BuildingFeatures.Type fromValue(String value) {
            BuildingFeatures.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
