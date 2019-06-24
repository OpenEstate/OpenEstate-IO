
package org.openestate.io.idealista.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonCreator;
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
public class Building implements Serializable
{

    /**
     * property types
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("featuresType")
    @NotNull
    @Nonnull
    private Building.FeaturesType featuresType;
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
    private BigInteger featuresAreaConstructed;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresAreaTradableMinimum")
    @DecimalMin("1")
    @DecimalMax("999999")
    private BigInteger featuresAreaTradableMinimum;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresBuiltProperties")
    @DecimalMin("1")
    @DecimalMax("99")
    private BigInteger featuresBuiltProperties;
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
    private BigInteger featuresBuiltYear;
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
    private Boolean featuresClassificationChalet;
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
    private Boolean featuresClassificationCommercial;
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
    private Boolean featuresClassificationHotel;
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
    private Boolean featuresClassificationIndustrial;
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
    private Boolean featuresClassificationOffice;
    /**
     * other classification
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresClassificationOther")
    private Boolean featuresClassificationOther;
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
    private Building.FeaturesConservation featuresConservation;
    /**
     * energy certification rating
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresEnergyCertificateRating")
    private Building.FeaturesEnergyCertificateRating featuresEnergyCertificateRating;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresEnergyCertificatePerformance")
    @DecimalMin("1")
    @DecimalMax("999")
    private BigDecimal featuresEnergyCertificatePerformance;
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
    private Building.FeaturesEnergyCertificateType featuresEnergyCertificateType;
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
    private Building.FeaturesEnergyCertificateLaw featuresEnergyCertificateLaw;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresFloorsBuilding")
    @DecimalMin("1")
    @DecimalMax("99")
    private BigInteger featuresFloorsBuilding;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresLiftNumber")
    @DecimalMin("1")
    @DecimalMax("9")
    private BigInteger featuresLiftNumber;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresParkingSpacesNumber")
    @DecimalMin("1")
    @DecimalMax("99")
    private BigInteger featuresParkingSpacesNumber;
    /**
     * tenants
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresPropertyTenants")
    private Boolean featuresPropertyTenants;
    /**
     * security personnel
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresSecurityPersonnel")
    private Boolean featuresSecurityPersonnel;
    private final static long serialVersionUID = -7684665710889938373L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Building() {
    }

    /**
     * 
     * @param featuresType
     * @param featuresAreaConstructed
     */
    public Building(Building.FeaturesType featuresType, BigInteger featuresAreaConstructed) {
        super();
        this.featuresType = featuresType;
        this.featuresAreaConstructed = featuresAreaConstructed;
    }

    /**
     * property types
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("featuresType")
    public Building.FeaturesType getFeaturesType() {
        return featuresType;
    }

    /**
     * property types
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("featuresType")
    public void setFeaturesType(Building.FeaturesType featuresType) {
        this.featuresType = featuresType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("featuresAreaConstructed")
    public BigInteger getFeaturesAreaConstructed() {
        return featuresAreaConstructed;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("featuresAreaConstructed")
    public void setFeaturesAreaConstructed(BigInteger featuresAreaConstructed) {
        this.featuresAreaConstructed = featuresAreaConstructed;
    }

    @JsonProperty("featuresAreaTradableMinimum")
    public BigInteger getFeaturesAreaTradableMinimum() {
        return featuresAreaTradableMinimum;
    }

    @JsonProperty("featuresAreaTradableMinimum")
    public void setFeaturesAreaTradableMinimum(BigInteger featuresAreaTradableMinimum) {
        this.featuresAreaTradableMinimum = featuresAreaTradableMinimum;
    }

    @JsonProperty("featuresBuiltProperties")
    public BigInteger getFeaturesBuiltProperties() {
        return featuresBuiltProperties;
    }

    @JsonProperty("featuresBuiltProperties")
    public void setFeaturesBuiltProperties(BigInteger featuresBuiltProperties) {
        this.featuresBuiltProperties = featuresBuiltProperties;
    }

    /**
     * building year
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresBuiltYear")
    public BigInteger getFeaturesBuiltYear() {
        return featuresBuiltYear;
    }

    /**
     * building year
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresBuiltYear")
    public void setFeaturesBuiltYear(BigInteger featuresBuiltYear) {
        this.featuresBuiltYear = featuresBuiltYear;
    }

    /**
     * chalet classification
     * <p>
     * classified for residential house (detached)
     * 
     */
    @JsonProperty("featuresClassificationChalet")
    public Boolean getFeaturesClassificationChalet() {
        return featuresClassificationChalet;
    }

    /**
     * chalet classification
     * <p>
     * classified for residential house (detached)
     * 
     */
    @JsonProperty("featuresClassificationChalet")
    public void setFeaturesClassificationChalet(Boolean featuresClassificationChalet) {
        this.featuresClassificationChalet = featuresClassificationChalet;
    }

    /**
     * commercial classification
     * <p>
     * classified for tertiary commercial properties
     * 
     */
    @JsonProperty("featuresClassificationCommercial")
    public Boolean getFeaturesClassificationCommercial() {
        return featuresClassificationCommercial;
    }

    /**
     * commercial classification
     * <p>
     * classified for tertiary commercial properties
     * 
     */
    @JsonProperty("featuresClassificationCommercial")
    public void setFeaturesClassificationCommercial(Boolean featuresClassificationCommercial) {
        this.featuresClassificationCommercial = featuresClassificationCommercial;
    }

    /**
     * hotel classification
     * <p>
     * classified for hotels properties
     * 
     */
    @JsonProperty("featuresClassificationHotel")
    public Boolean getFeaturesClassificationHotel() {
        return featuresClassificationHotel;
    }

    /**
     * hotel classification
     * <p>
     * classified for hotels properties
     * 
     */
    @JsonProperty("featuresClassificationHotel")
    public void setFeaturesClassificationHotel(Boolean featuresClassificationHotel) {
        this.featuresClassificationHotel = featuresClassificationHotel;
    }

    /**
     * industrial classification
     * <p>
     * classified for industrial properties
     * 
     */
    @JsonProperty("featuresClassificationIndustrial")
    public Boolean getFeaturesClassificationIndustrial() {
        return featuresClassificationIndustrial;
    }

    /**
     * industrial classification
     * <p>
     * classified for industrial properties
     * 
     */
    @JsonProperty("featuresClassificationIndustrial")
    public void setFeaturesClassificationIndustrial(Boolean featuresClassificationIndustrial) {
        this.featuresClassificationIndustrial = featuresClassificationIndustrial;
    }

    /**
     * office classification
     * <p>
     * classified for office properties
     * 
     */
    @JsonProperty("featuresClassificationOffice")
    public Boolean getFeaturesClassificationOffice() {
        return featuresClassificationOffice;
    }

    /**
     * office classification
     * <p>
     * classified for office properties
     * 
     */
    @JsonProperty("featuresClassificationOffice")
    public void setFeaturesClassificationOffice(Boolean featuresClassificationOffice) {
        this.featuresClassificationOffice = featuresClassificationOffice;
    }

    /**
     * other classification
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresClassificationOther")
    public Boolean getFeaturesClassificationOther() {
        return featuresClassificationOther;
    }

    /**
     * other classification
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresClassificationOther")
    public void setFeaturesClassificationOther(Boolean featuresClassificationOther) {
        this.featuresClassificationOther = featuresClassificationOther;
    }

    /**
     * conservation status
     * <p>
     * status new is only available for new development properties, not for secondhand properties
     * 
     */
    @JsonProperty("featuresConservation")
    public Building.FeaturesConservation getFeaturesConservation() {
        return featuresConservation;
    }

    /**
     * conservation status
     * <p>
     * status new is only available for new development properties, not for secondhand properties
     * 
     */
    @JsonProperty("featuresConservation")
    public void setFeaturesConservation(Building.FeaturesConservation featuresConservation) {
        this.featuresConservation = featuresConservation;
    }

    /**
     * energy certification rating
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresEnergyCertificateRating")
    public Building.FeaturesEnergyCertificateRating getFeaturesEnergyCertificateRating() {
        return featuresEnergyCertificateRating;
    }

    /**
     * energy certification rating
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresEnergyCertificateRating")
    public void setFeaturesEnergyCertificateRating(Building.FeaturesEnergyCertificateRating featuresEnergyCertificateRating) {
        this.featuresEnergyCertificateRating = featuresEnergyCertificateRating;
    }

    @JsonProperty("featuresEnergyCertificatePerformance")
    public BigDecimal getFeaturesEnergyCertificatePerformance() {
        return featuresEnergyCertificatePerformance;
    }

    @JsonProperty("featuresEnergyCertificatePerformance")
    public void setFeaturesEnergyCertificatePerformance(BigDecimal featuresEnergyCertificatePerformance) {
        this.featuresEnergyCertificatePerformance = featuresEnergyCertificatePerformance;
    }

    /**
     * energy certification type
     * <p>
     * only available for new development properties. project: certification in project phase; completed: certification if the property is finished
     * 
     */
    @JsonProperty("featuresEnergyCertificateType")
    public Building.FeaturesEnergyCertificateType getFeaturesEnergyCertificateType() {
        return featuresEnergyCertificateType;
    }

    /**
     * energy certification type
     * <p>
     * only available for new development properties. project: certification in project phase; completed: certification if the property is finished
     * 
     */
    @JsonProperty("featuresEnergyCertificateType")
    public void setFeaturesEnergyCertificateType(Building.FeaturesEnergyCertificateType featuresEnergyCertificateType) {
        this.featuresEnergyCertificateType = featuresEnergyCertificateType;
    }

    /**
     * energy certification law
     * <p>
     * only for Italy, indicates the legislation that applies to the energy rating, DL-192(2005) or LEGGE-90(2013)
     * 
     */
    @JsonProperty("featuresEnergyCertificateLaw")
    public Building.FeaturesEnergyCertificateLaw getFeaturesEnergyCertificateLaw() {
        return featuresEnergyCertificateLaw;
    }

    /**
     * energy certification law
     * <p>
     * only for Italy, indicates the legislation that applies to the energy rating, DL-192(2005) or LEGGE-90(2013)
     * 
     */
    @JsonProperty("featuresEnergyCertificateLaw")
    public void setFeaturesEnergyCertificateLaw(Building.FeaturesEnergyCertificateLaw featuresEnergyCertificateLaw) {
        this.featuresEnergyCertificateLaw = featuresEnergyCertificateLaw;
    }

    @JsonProperty("featuresFloorsBuilding")
    public BigInteger getFeaturesFloorsBuilding() {
        return featuresFloorsBuilding;
    }

    @JsonProperty("featuresFloorsBuilding")
    public void setFeaturesFloorsBuilding(BigInteger featuresFloorsBuilding) {
        this.featuresFloorsBuilding = featuresFloorsBuilding;
    }

    @JsonProperty("featuresLiftNumber")
    public BigInteger getFeaturesLiftNumber() {
        return featuresLiftNumber;
    }

    @JsonProperty("featuresLiftNumber")
    public void setFeaturesLiftNumber(BigInteger featuresLiftNumber) {
        this.featuresLiftNumber = featuresLiftNumber;
    }

    @JsonProperty("featuresParkingSpacesNumber")
    public BigInteger getFeaturesParkingSpacesNumber() {
        return featuresParkingSpacesNumber;
    }

    @JsonProperty("featuresParkingSpacesNumber")
    public void setFeaturesParkingSpacesNumber(BigInteger featuresParkingSpacesNumber) {
        this.featuresParkingSpacesNumber = featuresParkingSpacesNumber;
    }

    /**
     * tenants
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresPropertyTenants")
    public Boolean getFeaturesPropertyTenants() {
        return featuresPropertyTenants;
    }

    /**
     * tenants
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresPropertyTenants")
    public void setFeaturesPropertyTenants(Boolean featuresPropertyTenants) {
        this.featuresPropertyTenants = featuresPropertyTenants;
    }

    /**
     * security personnel
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSecurityPersonnel")
    public Boolean getFeaturesSecurityPersonnel() {
        return featuresSecurityPersonnel;
    }

    /**
     * security personnel
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSecurityPersonnel")
    public void setFeaturesSecurityPersonnel(Boolean featuresSecurityPersonnel) {
        this.featuresSecurityPersonnel = featuresSecurityPersonnel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Building.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("featuresType");
        sb.append('=');
        sb.append(((this.featuresType == null)?"<null>":this.featuresType));
        sb.append(',');
        sb.append("featuresAreaConstructed");
        sb.append('=');
        sb.append(((this.featuresAreaConstructed == null)?"<null>":this.featuresAreaConstructed));
        sb.append(',');
        sb.append("featuresAreaTradableMinimum");
        sb.append('=');
        sb.append(((this.featuresAreaTradableMinimum == null)?"<null>":this.featuresAreaTradableMinimum));
        sb.append(',');
        sb.append("featuresBuiltProperties");
        sb.append('=');
        sb.append(((this.featuresBuiltProperties == null)?"<null>":this.featuresBuiltProperties));
        sb.append(',');
        sb.append("featuresBuiltYear");
        sb.append('=');
        sb.append(((this.featuresBuiltYear == null)?"<null>":this.featuresBuiltYear));
        sb.append(',');
        sb.append("featuresClassificationChalet");
        sb.append('=');
        sb.append(((this.featuresClassificationChalet == null)?"<null>":this.featuresClassificationChalet));
        sb.append(',');
        sb.append("featuresClassificationCommercial");
        sb.append('=');
        sb.append(((this.featuresClassificationCommercial == null)?"<null>":this.featuresClassificationCommercial));
        sb.append(',');
        sb.append("featuresClassificationHotel");
        sb.append('=');
        sb.append(((this.featuresClassificationHotel == null)?"<null>":this.featuresClassificationHotel));
        sb.append(',');
        sb.append("featuresClassificationIndustrial");
        sb.append('=');
        sb.append(((this.featuresClassificationIndustrial == null)?"<null>":this.featuresClassificationIndustrial));
        sb.append(',');
        sb.append("featuresClassificationOffice");
        sb.append('=');
        sb.append(((this.featuresClassificationOffice == null)?"<null>":this.featuresClassificationOffice));
        sb.append(',');
        sb.append("featuresClassificationOther");
        sb.append('=');
        sb.append(((this.featuresClassificationOther == null)?"<null>":this.featuresClassificationOther));
        sb.append(',');
        sb.append("featuresConservation");
        sb.append('=');
        sb.append(((this.featuresConservation == null)?"<null>":this.featuresConservation));
        sb.append(',');
        sb.append("featuresEnergyCertificateRating");
        sb.append('=');
        sb.append(((this.featuresEnergyCertificateRating == null)?"<null>":this.featuresEnergyCertificateRating));
        sb.append(',');
        sb.append("featuresEnergyCertificatePerformance");
        sb.append('=');
        sb.append(((this.featuresEnergyCertificatePerformance == null)?"<null>":this.featuresEnergyCertificatePerformance));
        sb.append(',');
        sb.append("featuresEnergyCertificateType");
        sb.append('=');
        sb.append(((this.featuresEnergyCertificateType == null)?"<null>":this.featuresEnergyCertificateType));
        sb.append(',');
        sb.append("featuresEnergyCertificateLaw");
        sb.append('=');
        sb.append(((this.featuresEnergyCertificateLaw == null)?"<null>":this.featuresEnergyCertificateLaw));
        sb.append(',');
        sb.append("featuresFloorsBuilding");
        sb.append('=');
        sb.append(((this.featuresFloorsBuilding == null)?"<null>":this.featuresFloorsBuilding));
        sb.append(',');
        sb.append("featuresLiftNumber");
        sb.append('=');
        sb.append(((this.featuresLiftNumber == null)?"<null>":this.featuresLiftNumber));
        sb.append(',');
        sb.append("featuresParkingSpacesNumber");
        sb.append('=');
        sb.append(((this.featuresParkingSpacesNumber == null)?"<null>":this.featuresParkingSpacesNumber));
        sb.append(',');
        sb.append("featuresPropertyTenants");
        sb.append('=');
        sb.append(((this.featuresPropertyTenants == null)?"<null>":this.featuresPropertyTenants));
        sb.append(',');
        sb.append("featuresSecurityPersonnel");
        sb.append('=');
        sb.append(((this.featuresSecurityPersonnel == null)?"<null>":this.featuresSecurityPersonnel));
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
        result = ((result* 31)+((this.featuresFloorsBuilding == null)? 0 :this.featuresFloorsBuilding.hashCode()));
        result = ((result* 31)+((this.featuresClassificationOther == null)? 0 :this.featuresClassificationOther.hashCode()));
        result = ((result* 31)+((this.featuresClassificationCommercial == null)? 0 :this.featuresClassificationCommercial.hashCode()));
        result = ((result* 31)+((this.featuresClassificationOffice == null)? 0 :this.featuresClassificationOffice.hashCode()));
        result = ((result* 31)+((this.featuresEnergyCertificateRating == null)? 0 :this.featuresEnergyCertificateRating.hashCode()));
        result = ((result* 31)+((this.featuresSecurityPersonnel == null)? 0 :this.featuresSecurityPersonnel.hashCode()));
        result = ((result* 31)+((this.featuresType == null)? 0 :this.featuresType.hashCode()));
        result = ((result* 31)+((this.featuresEnergyCertificateType == null)? 0 :this.featuresEnergyCertificateType.hashCode()));
        result = ((result* 31)+((this.featuresAreaConstructed == null)? 0 :this.featuresAreaConstructed.hashCode()));
        result = ((result* 31)+((this.featuresEnergyCertificatePerformance == null)? 0 :this.featuresEnergyCertificatePerformance.hashCode()));
        result = ((result* 31)+((this.featuresAreaTradableMinimum == null)? 0 :this.featuresAreaTradableMinimum.hashCode()));
        result = ((result* 31)+((this.featuresClassificationIndustrial == null)? 0 :this.featuresClassificationIndustrial.hashCode()));
        result = ((result* 31)+((this.featuresConservation == null)? 0 :this.featuresConservation.hashCode()));
        result = ((result* 31)+((this.featuresClassificationChalet == null)? 0 :this.featuresClassificationChalet.hashCode()));
        result = ((result* 31)+((this.featuresBuiltYear == null)? 0 :this.featuresBuiltYear.hashCode()));
        result = ((result* 31)+((this.featuresClassificationHotel == null)? 0 :this.featuresClassificationHotel.hashCode()));
        result = ((result* 31)+((this.featuresLiftNumber == null)? 0 :this.featuresLiftNumber.hashCode()));
        result = ((result* 31)+((this.featuresParkingSpacesNumber == null)? 0 :this.featuresParkingSpacesNumber.hashCode()));
        result = ((result* 31)+((this.featuresBuiltProperties == null)? 0 :this.featuresBuiltProperties.hashCode()));
        result = ((result* 31)+((this.featuresPropertyTenants == null)? 0 :this.featuresPropertyTenants.hashCode()));
        result = ((result* 31)+((this.featuresEnergyCertificateLaw == null)? 0 :this.featuresEnergyCertificateLaw.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Building) == false) {
            return false;
        }
        Building rhs = ((Building) other);
        return ((((((((((((((((((((((this.featuresFloorsBuilding == rhs.featuresFloorsBuilding)||((this.featuresFloorsBuilding!= null)&&this.featuresFloorsBuilding.equals(rhs.featuresFloorsBuilding)))&&((this.featuresClassificationOther == rhs.featuresClassificationOther)||((this.featuresClassificationOther!= null)&&this.featuresClassificationOther.equals(rhs.featuresClassificationOther))))&&((this.featuresClassificationCommercial == rhs.featuresClassificationCommercial)||((this.featuresClassificationCommercial!= null)&&this.featuresClassificationCommercial.equals(rhs.featuresClassificationCommercial))))&&((this.featuresClassificationOffice == rhs.featuresClassificationOffice)||((this.featuresClassificationOffice!= null)&&this.featuresClassificationOffice.equals(rhs.featuresClassificationOffice))))&&((this.featuresEnergyCertificateRating == rhs.featuresEnergyCertificateRating)||((this.featuresEnergyCertificateRating!= null)&&this.featuresEnergyCertificateRating.equals(rhs.featuresEnergyCertificateRating))))&&((this.featuresSecurityPersonnel == rhs.featuresSecurityPersonnel)||((this.featuresSecurityPersonnel!= null)&&this.featuresSecurityPersonnel.equals(rhs.featuresSecurityPersonnel))))&&((this.featuresType == rhs.featuresType)||((this.featuresType!= null)&&this.featuresType.equals(rhs.featuresType))))&&((this.featuresEnergyCertificateType == rhs.featuresEnergyCertificateType)||((this.featuresEnergyCertificateType!= null)&&this.featuresEnergyCertificateType.equals(rhs.featuresEnergyCertificateType))))&&((this.featuresAreaConstructed == rhs.featuresAreaConstructed)||((this.featuresAreaConstructed!= null)&&this.featuresAreaConstructed.equals(rhs.featuresAreaConstructed))))&&((this.featuresEnergyCertificatePerformance == rhs.featuresEnergyCertificatePerformance)||((this.featuresEnergyCertificatePerformance!= null)&&this.featuresEnergyCertificatePerformance.equals(rhs.featuresEnergyCertificatePerformance))))&&((this.featuresAreaTradableMinimum == rhs.featuresAreaTradableMinimum)||((this.featuresAreaTradableMinimum!= null)&&this.featuresAreaTradableMinimum.equals(rhs.featuresAreaTradableMinimum))))&&((this.featuresClassificationIndustrial == rhs.featuresClassificationIndustrial)||((this.featuresClassificationIndustrial!= null)&&this.featuresClassificationIndustrial.equals(rhs.featuresClassificationIndustrial))))&&((this.featuresConservation == rhs.featuresConservation)||((this.featuresConservation!= null)&&this.featuresConservation.equals(rhs.featuresConservation))))&&((this.featuresClassificationChalet == rhs.featuresClassificationChalet)||((this.featuresClassificationChalet!= null)&&this.featuresClassificationChalet.equals(rhs.featuresClassificationChalet))))&&((this.featuresBuiltYear == rhs.featuresBuiltYear)||((this.featuresBuiltYear!= null)&&this.featuresBuiltYear.equals(rhs.featuresBuiltYear))))&&((this.featuresClassificationHotel == rhs.featuresClassificationHotel)||((this.featuresClassificationHotel!= null)&&this.featuresClassificationHotel.equals(rhs.featuresClassificationHotel))))&&((this.featuresLiftNumber == rhs.featuresLiftNumber)||((this.featuresLiftNumber!= null)&&this.featuresLiftNumber.equals(rhs.featuresLiftNumber))))&&((this.featuresParkingSpacesNumber == rhs.featuresParkingSpacesNumber)||((this.featuresParkingSpacesNumber!= null)&&this.featuresParkingSpacesNumber.equals(rhs.featuresParkingSpacesNumber))))&&((this.featuresBuiltProperties == rhs.featuresBuiltProperties)||((this.featuresBuiltProperties!= null)&&this.featuresBuiltProperties.equals(rhs.featuresBuiltProperties))))&&((this.featuresPropertyTenants == rhs.featuresPropertyTenants)||((this.featuresPropertyTenants!= null)&&this.featuresPropertyTenants.equals(rhs.featuresPropertyTenants))))&&((this.featuresEnergyCertificateLaw == rhs.featuresEnergyCertificateLaw)||((this.featuresEnergyCertificateLaw!= null)&&this.featuresEnergyCertificateLaw.equals(rhs.featuresEnergyCertificateLaw))));
    }

    public enum FeaturesConservation {

        NEW("new"),
        GOOD("good"),
        TO_RESTORE("toRestore");
        private final String value;
        private final static Map<String, Building.FeaturesConservation> CONSTANTS = new HashMap<String, Building.FeaturesConservation>();

        static {
            for (Building.FeaturesConservation c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private FeaturesConservation(String value) {
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
        public static Building.FeaturesConservation fromValue(String value) {
            Building.FeaturesConservation constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum FeaturesEnergyCertificateLaw {

        DL_192_2005("dl-192_2005"),
        LEGGE_90_2013("legge-90_2013");
        private final String value;
        private final static Map<String, Building.FeaturesEnergyCertificateLaw> CONSTANTS = new HashMap<String, Building.FeaturesEnergyCertificateLaw>();

        static {
            for (Building.FeaturesEnergyCertificateLaw c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private FeaturesEnergyCertificateLaw(String value) {
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
        public static Building.FeaturesEnergyCertificateLaw fromValue(String value) {
            Building.FeaturesEnergyCertificateLaw constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum FeaturesEnergyCertificateRating {

        A("A"),
        A_("A+"),
        A_1("A1"),
        A_2("A2"),
        A_3("A3"),
        A_4("A4"),
        B("B"),
        B_("B-"),
        C("C"),
        D("D"),
        E("E"),
        F("F"),
        G("G"),
        EXEMPT("exempt"),
        IN_PROCESS("inProcess"),
        UNKNOWN("unknown");
        private final String value;
        private final static Map<String, Building.FeaturesEnergyCertificateRating> CONSTANTS = new HashMap<String, Building.FeaturesEnergyCertificateRating>();

        static {
            for (Building.FeaturesEnergyCertificateRating c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private FeaturesEnergyCertificateRating(String value) {
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
        public static Building.FeaturesEnergyCertificateRating fromValue(String value) {
            Building.FeaturesEnergyCertificateRating constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum FeaturesEnergyCertificateType {

        PROJECT("project"),
        COMPLETED("completed");
        private final String value;
        private final static Map<String, Building.FeaturesEnergyCertificateType> CONSTANTS = new HashMap<String, Building.FeaturesEnergyCertificateType>();

        static {
            for (Building.FeaturesEnergyCertificateType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private FeaturesEnergyCertificateType(String value) {
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
        public static Building.FeaturesEnergyCertificateType fromValue(String value) {
            Building.FeaturesEnergyCertificateType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum FeaturesType {

        BUILDING("building");
        private final String value;
        private final static Map<String, Building.FeaturesType> CONSTANTS = new HashMap<String, Building.FeaturesType>();

        static {
            for (Building.FeaturesType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private FeaturesType(String value) {
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
        public static Building.FeaturesType fromValue(String value) {
            Building.FeaturesType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
