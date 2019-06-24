
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
 * Land Object
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "featuresType",
    "featuresAreaPlot",
    "featuresAreaBuildable",
    "featuresAreaTradableMinimum",
    "featuresClassificationBlocks",
    "featuresClassificationChalet",
    "featuresClassificationCommercial",
    "featuresClassificationHotel",
    "featuresClassificationIndustrial",
    "featuresClassificationOffice",
    "featuresClassificationOther",
    "featuresClassificationPublic",
    "featuresFloorsBuildable",
    "featuresNearestLocationKm",
    "featuresUtilitiesElectricity",
    "featuresUtilitiesNaturalGas",
    "featuresUtilitiesRoadAccess",
    "featuresUtilitiesSewerage",
    "featuresUtilitiesSidewalk",
    "featuresUtilitiesStreetLighting",
    "featuresUtilitiesWater",
    "featuresAccessType"
})
public class Land implements Serializable
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
    private Land.FeaturesType featuresType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("featuresAreaPlot")
    @DecimalMin("1")
    @DecimalMax("99999999")
    @NotNull
    @Nonnull
    private BigInteger featuresAreaPlot;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresAreaBuildable")
    @DecimalMin("1")
    @DecimalMax("99999")
    private BigInteger featuresAreaBuildable;
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
     * blocks classification
     * <p>
     * certified for high-rise residential properties
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresClassificationBlocks")
    @JsonPropertyDescription("certified for high-rise residential properties")
    private Boolean featuresClassificationBlocks;
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
     * public classification
     * <p>
     * classified for amenities (hospitals, schools, museums)
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresClassificationPublic")
    @JsonPropertyDescription("classified for amenities (hospitals, schools, museums)")
    private Boolean featuresClassificationPublic;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresFloorsBuildable")
    @DecimalMin("1")
    @DecimalMax("99")
    private BigInteger featuresFloorsBuildable;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresNearestLocationKm")
    @DecimalMin("0")
    @DecimalMax("99")
    private BigDecimal featuresNearestLocationKm;
    /**
     * electricity availability
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresUtilitiesElectricity")
    private Boolean featuresUtilitiesElectricity;
    /**
     * natural gas availability
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresUtilitiesNaturalGas")
    private Boolean featuresUtilitiesNaturalGas;
    /**
     * road access availability
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresUtilitiesRoadAccess")
    private Boolean featuresUtilitiesRoadAccess;
    /**
     * sewerage availability
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresUtilitiesSewerage")
    private Boolean featuresUtilitiesSewerage;
    /**
     * sidewalk availability
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresUtilitiesSidewalk")
    private Boolean featuresUtilitiesSidewalk;
    /**
     * street lighting availability
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresUtilitiesStreetLighting")
    private Boolean featuresUtilitiesStreetLighting;
    /**
     * water availability
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresUtilitiesWater")
    private Boolean featuresUtilitiesWater;
    /**
     * access type
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresAccessType")
    private Land.FeaturesAccessType featuresAccessType;
    private final static long serialVersionUID = -3244244380334808203L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Land() {
    }

    /**
     * 
     * @param featuresType
     * @param featuresAreaPlot
     */
    public Land(Land.FeaturesType featuresType, BigInteger featuresAreaPlot) {
        super();
        this.featuresType = featuresType;
        this.featuresAreaPlot = featuresAreaPlot;
    }

    /**
     * property types
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("featuresType")
    public Land.FeaturesType getFeaturesType() {
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
    public void setFeaturesType(Land.FeaturesType featuresType) {
        this.featuresType = featuresType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("featuresAreaPlot")
    public BigInteger getFeaturesAreaPlot() {
        return featuresAreaPlot;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("featuresAreaPlot")
    public void setFeaturesAreaPlot(BigInteger featuresAreaPlot) {
        this.featuresAreaPlot = featuresAreaPlot;
    }

    @JsonProperty("featuresAreaBuildable")
    public BigInteger getFeaturesAreaBuildable() {
        return featuresAreaBuildable;
    }

    @JsonProperty("featuresAreaBuildable")
    public void setFeaturesAreaBuildable(BigInteger featuresAreaBuildable) {
        this.featuresAreaBuildable = featuresAreaBuildable;
    }

    @JsonProperty("featuresAreaTradableMinimum")
    public BigInteger getFeaturesAreaTradableMinimum() {
        return featuresAreaTradableMinimum;
    }

    @JsonProperty("featuresAreaTradableMinimum")
    public void setFeaturesAreaTradableMinimum(BigInteger featuresAreaTradableMinimum) {
        this.featuresAreaTradableMinimum = featuresAreaTradableMinimum;
    }

    /**
     * blocks classification
     * <p>
     * certified for high-rise residential properties
     * 
     */
    @JsonProperty("featuresClassificationBlocks")
    public Boolean getFeaturesClassificationBlocks() {
        return featuresClassificationBlocks;
    }

    /**
     * blocks classification
     * <p>
     * certified for high-rise residential properties
     * 
     */
    @JsonProperty("featuresClassificationBlocks")
    public void setFeaturesClassificationBlocks(Boolean featuresClassificationBlocks) {
        this.featuresClassificationBlocks = featuresClassificationBlocks;
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
     * public classification
     * <p>
     * classified for amenities (hospitals, schools, museums)
     * 
     */
    @JsonProperty("featuresClassificationPublic")
    public Boolean getFeaturesClassificationPublic() {
        return featuresClassificationPublic;
    }

    /**
     * public classification
     * <p>
     * classified for amenities (hospitals, schools, museums)
     * 
     */
    @JsonProperty("featuresClassificationPublic")
    public void setFeaturesClassificationPublic(Boolean featuresClassificationPublic) {
        this.featuresClassificationPublic = featuresClassificationPublic;
    }

    @JsonProperty("featuresFloorsBuildable")
    public BigInteger getFeaturesFloorsBuildable() {
        return featuresFloorsBuildable;
    }

    @JsonProperty("featuresFloorsBuildable")
    public void setFeaturesFloorsBuildable(BigInteger featuresFloorsBuildable) {
        this.featuresFloorsBuildable = featuresFloorsBuildable;
    }

    @JsonProperty("featuresNearestLocationKm")
    public BigDecimal getFeaturesNearestLocationKm() {
        return featuresNearestLocationKm;
    }

    @JsonProperty("featuresNearestLocationKm")
    public void setFeaturesNearestLocationKm(BigDecimal featuresNearestLocationKm) {
        this.featuresNearestLocationKm = featuresNearestLocationKm;
    }

    /**
     * electricity availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresUtilitiesElectricity")
    public Boolean getFeaturesUtilitiesElectricity() {
        return featuresUtilitiesElectricity;
    }

    /**
     * electricity availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresUtilitiesElectricity")
    public void setFeaturesUtilitiesElectricity(Boolean featuresUtilitiesElectricity) {
        this.featuresUtilitiesElectricity = featuresUtilitiesElectricity;
    }

    /**
     * natural gas availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresUtilitiesNaturalGas")
    public Boolean getFeaturesUtilitiesNaturalGas() {
        return featuresUtilitiesNaturalGas;
    }

    /**
     * natural gas availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresUtilitiesNaturalGas")
    public void setFeaturesUtilitiesNaturalGas(Boolean featuresUtilitiesNaturalGas) {
        this.featuresUtilitiesNaturalGas = featuresUtilitiesNaturalGas;
    }

    /**
     * road access availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresUtilitiesRoadAccess")
    public Boolean getFeaturesUtilitiesRoadAccess() {
        return featuresUtilitiesRoadAccess;
    }

    /**
     * road access availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresUtilitiesRoadAccess")
    public void setFeaturesUtilitiesRoadAccess(Boolean featuresUtilitiesRoadAccess) {
        this.featuresUtilitiesRoadAccess = featuresUtilitiesRoadAccess;
    }

    /**
     * sewerage availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresUtilitiesSewerage")
    public Boolean getFeaturesUtilitiesSewerage() {
        return featuresUtilitiesSewerage;
    }

    /**
     * sewerage availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresUtilitiesSewerage")
    public void setFeaturesUtilitiesSewerage(Boolean featuresUtilitiesSewerage) {
        this.featuresUtilitiesSewerage = featuresUtilitiesSewerage;
    }

    /**
     * sidewalk availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresUtilitiesSidewalk")
    public Boolean getFeaturesUtilitiesSidewalk() {
        return featuresUtilitiesSidewalk;
    }

    /**
     * sidewalk availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresUtilitiesSidewalk")
    public void setFeaturesUtilitiesSidewalk(Boolean featuresUtilitiesSidewalk) {
        this.featuresUtilitiesSidewalk = featuresUtilitiesSidewalk;
    }

    /**
     * street lighting availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresUtilitiesStreetLighting")
    public Boolean getFeaturesUtilitiesStreetLighting() {
        return featuresUtilitiesStreetLighting;
    }

    /**
     * street lighting availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresUtilitiesStreetLighting")
    public void setFeaturesUtilitiesStreetLighting(Boolean featuresUtilitiesStreetLighting) {
        this.featuresUtilitiesStreetLighting = featuresUtilitiesStreetLighting;
    }

    /**
     * water availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresUtilitiesWater")
    public Boolean getFeaturesUtilitiesWater() {
        return featuresUtilitiesWater;
    }

    /**
     * water availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresUtilitiesWater")
    public void setFeaturesUtilitiesWater(Boolean featuresUtilitiesWater) {
        this.featuresUtilitiesWater = featuresUtilitiesWater;
    }

    /**
     * access type
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresAccessType")
    public Land.FeaturesAccessType getFeaturesAccessType() {
        return featuresAccessType;
    }

    /**
     * access type
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresAccessType")
    public void setFeaturesAccessType(Land.FeaturesAccessType featuresAccessType) {
        this.featuresAccessType = featuresAccessType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Land.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("featuresType");
        sb.append('=');
        sb.append(((this.featuresType == null)?"<null>":this.featuresType));
        sb.append(',');
        sb.append("featuresAreaPlot");
        sb.append('=');
        sb.append(((this.featuresAreaPlot == null)?"<null>":this.featuresAreaPlot));
        sb.append(',');
        sb.append("featuresAreaBuildable");
        sb.append('=');
        sb.append(((this.featuresAreaBuildable == null)?"<null>":this.featuresAreaBuildable));
        sb.append(',');
        sb.append("featuresAreaTradableMinimum");
        sb.append('=');
        sb.append(((this.featuresAreaTradableMinimum == null)?"<null>":this.featuresAreaTradableMinimum));
        sb.append(',');
        sb.append("featuresClassificationBlocks");
        sb.append('=');
        sb.append(((this.featuresClassificationBlocks == null)?"<null>":this.featuresClassificationBlocks));
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
        sb.append("featuresClassificationPublic");
        sb.append('=');
        sb.append(((this.featuresClassificationPublic == null)?"<null>":this.featuresClassificationPublic));
        sb.append(',');
        sb.append("featuresFloorsBuildable");
        sb.append('=');
        sb.append(((this.featuresFloorsBuildable == null)?"<null>":this.featuresFloorsBuildable));
        sb.append(',');
        sb.append("featuresNearestLocationKm");
        sb.append('=');
        sb.append(((this.featuresNearestLocationKm == null)?"<null>":this.featuresNearestLocationKm));
        sb.append(',');
        sb.append("featuresUtilitiesElectricity");
        sb.append('=');
        sb.append(((this.featuresUtilitiesElectricity == null)?"<null>":this.featuresUtilitiesElectricity));
        sb.append(',');
        sb.append("featuresUtilitiesNaturalGas");
        sb.append('=');
        sb.append(((this.featuresUtilitiesNaturalGas == null)?"<null>":this.featuresUtilitiesNaturalGas));
        sb.append(',');
        sb.append("featuresUtilitiesRoadAccess");
        sb.append('=');
        sb.append(((this.featuresUtilitiesRoadAccess == null)?"<null>":this.featuresUtilitiesRoadAccess));
        sb.append(',');
        sb.append("featuresUtilitiesSewerage");
        sb.append('=');
        sb.append(((this.featuresUtilitiesSewerage == null)?"<null>":this.featuresUtilitiesSewerage));
        sb.append(',');
        sb.append("featuresUtilitiesSidewalk");
        sb.append('=');
        sb.append(((this.featuresUtilitiesSidewalk == null)?"<null>":this.featuresUtilitiesSidewalk));
        sb.append(',');
        sb.append("featuresUtilitiesStreetLighting");
        sb.append('=');
        sb.append(((this.featuresUtilitiesStreetLighting == null)?"<null>":this.featuresUtilitiesStreetLighting));
        sb.append(',');
        sb.append("featuresUtilitiesWater");
        sb.append('=');
        sb.append(((this.featuresUtilitiesWater == null)?"<null>":this.featuresUtilitiesWater));
        sb.append(',');
        sb.append("featuresAccessType");
        sb.append('=');
        sb.append(((this.featuresAccessType == null)?"<null>":this.featuresAccessType));
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
        result = ((result* 31)+((this.featuresClassificationOther == null)? 0 :this.featuresClassificationOther.hashCode()));
        result = ((result* 31)+((this.featuresUtilitiesStreetLighting == null)? 0 :this.featuresUtilitiesStreetLighting.hashCode()));
        result = ((result* 31)+((this.featuresAccessType == null)? 0 :this.featuresAccessType.hashCode()));
        result = ((result* 31)+((this.featuresClassificationCommercial == null)? 0 :this.featuresClassificationCommercial.hashCode()));
        result = ((result* 31)+((this.featuresFloorsBuildable == null)? 0 :this.featuresFloorsBuildable.hashCode()));
        result = ((result* 31)+((this.featuresClassificationBlocks == null)? 0 :this.featuresClassificationBlocks.hashCode()));
        result = ((result* 31)+((this.featuresClassificationOffice == null)? 0 :this.featuresClassificationOffice.hashCode()));
        result = ((result* 31)+((this.featuresType == null)? 0 :this.featuresType.hashCode()));
        result = ((result* 31)+((this.featuresAreaPlot == null)? 0 :this.featuresAreaPlot.hashCode()));
        result = ((result* 31)+((this.featuresUtilitiesSidewalk == null)? 0 :this.featuresUtilitiesSidewalk.hashCode()));
        result = ((result* 31)+((this.featuresUtilitiesSewerage == null)? 0 :this.featuresUtilitiesSewerage.hashCode()));
        result = ((result* 31)+((this.featuresAreaTradableMinimum == null)? 0 :this.featuresAreaTradableMinimum.hashCode()));
        result = ((result* 31)+((this.featuresUtilitiesRoadAccess == null)? 0 :this.featuresUtilitiesRoadAccess.hashCode()));
        result = ((result* 31)+((this.featuresClassificationIndustrial == null)? 0 :this.featuresClassificationIndustrial.hashCode()));
        result = ((result* 31)+((this.featuresClassificationPublic == null)? 0 :this.featuresClassificationPublic.hashCode()));
        result = ((result* 31)+((this.featuresUtilitiesWater == null)? 0 :this.featuresUtilitiesWater.hashCode()));
        result = ((result* 31)+((this.featuresClassificationChalet == null)? 0 :this.featuresClassificationChalet.hashCode()));
        result = ((result* 31)+((this.featuresUtilitiesElectricity == null)? 0 :this.featuresUtilitiesElectricity.hashCode()));
        result = ((result* 31)+((this.featuresClassificationHotel == null)? 0 :this.featuresClassificationHotel.hashCode()));
        result = ((result* 31)+((this.featuresAreaBuildable == null)? 0 :this.featuresAreaBuildable.hashCode()));
        result = ((result* 31)+((this.featuresNearestLocationKm == null)? 0 :this.featuresNearestLocationKm.hashCode()));
        result = ((result* 31)+((this.featuresUtilitiesNaturalGas == null)? 0 :this.featuresUtilitiesNaturalGas.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Land) == false) {
            return false;
        }
        Land rhs = ((Land) other);
        return (((((((((((((((((((((((this.featuresClassificationOther == rhs.featuresClassificationOther)||((this.featuresClassificationOther!= null)&&this.featuresClassificationOther.equals(rhs.featuresClassificationOther)))&&((this.featuresUtilitiesStreetLighting == rhs.featuresUtilitiesStreetLighting)||((this.featuresUtilitiesStreetLighting!= null)&&this.featuresUtilitiesStreetLighting.equals(rhs.featuresUtilitiesStreetLighting))))&&((this.featuresAccessType == rhs.featuresAccessType)||((this.featuresAccessType!= null)&&this.featuresAccessType.equals(rhs.featuresAccessType))))&&((this.featuresClassificationCommercial == rhs.featuresClassificationCommercial)||((this.featuresClassificationCommercial!= null)&&this.featuresClassificationCommercial.equals(rhs.featuresClassificationCommercial))))&&((this.featuresFloorsBuildable == rhs.featuresFloorsBuildable)||((this.featuresFloorsBuildable!= null)&&this.featuresFloorsBuildable.equals(rhs.featuresFloorsBuildable))))&&((this.featuresClassificationBlocks == rhs.featuresClassificationBlocks)||((this.featuresClassificationBlocks!= null)&&this.featuresClassificationBlocks.equals(rhs.featuresClassificationBlocks))))&&((this.featuresClassificationOffice == rhs.featuresClassificationOffice)||((this.featuresClassificationOffice!= null)&&this.featuresClassificationOffice.equals(rhs.featuresClassificationOffice))))&&((this.featuresType == rhs.featuresType)||((this.featuresType!= null)&&this.featuresType.equals(rhs.featuresType))))&&((this.featuresAreaPlot == rhs.featuresAreaPlot)||((this.featuresAreaPlot!= null)&&this.featuresAreaPlot.equals(rhs.featuresAreaPlot))))&&((this.featuresUtilitiesSidewalk == rhs.featuresUtilitiesSidewalk)||((this.featuresUtilitiesSidewalk!= null)&&this.featuresUtilitiesSidewalk.equals(rhs.featuresUtilitiesSidewalk))))&&((this.featuresUtilitiesSewerage == rhs.featuresUtilitiesSewerage)||((this.featuresUtilitiesSewerage!= null)&&this.featuresUtilitiesSewerage.equals(rhs.featuresUtilitiesSewerage))))&&((this.featuresAreaTradableMinimum == rhs.featuresAreaTradableMinimum)||((this.featuresAreaTradableMinimum!= null)&&this.featuresAreaTradableMinimum.equals(rhs.featuresAreaTradableMinimum))))&&((this.featuresUtilitiesRoadAccess == rhs.featuresUtilitiesRoadAccess)||((this.featuresUtilitiesRoadAccess!= null)&&this.featuresUtilitiesRoadAccess.equals(rhs.featuresUtilitiesRoadAccess))))&&((this.featuresClassificationIndustrial == rhs.featuresClassificationIndustrial)||((this.featuresClassificationIndustrial!= null)&&this.featuresClassificationIndustrial.equals(rhs.featuresClassificationIndustrial))))&&((this.featuresClassificationPublic == rhs.featuresClassificationPublic)||((this.featuresClassificationPublic!= null)&&this.featuresClassificationPublic.equals(rhs.featuresClassificationPublic))))&&((this.featuresUtilitiesWater == rhs.featuresUtilitiesWater)||((this.featuresUtilitiesWater!= null)&&this.featuresUtilitiesWater.equals(rhs.featuresUtilitiesWater))))&&((this.featuresClassificationChalet == rhs.featuresClassificationChalet)||((this.featuresClassificationChalet!= null)&&this.featuresClassificationChalet.equals(rhs.featuresClassificationChalet))))&&((this.featuresUtilitiesElectricity == rhs.featuresUtilitiesElectricity)||((this.featuresUtilitiesElectricity!= null)&&this.featuresUtilitiesElectricity.equals(rhs.featuresUtilitiesElectricity))))&&((this.featuresClassificationHotel == rhs.featuresClassificationHotel)||((this.featuresClassificationHotel!= null)&&this.featuresClassificationHotel.equals(rhs.featuresClassificationHotel))))&&((this.featuresAreaBuildable == rhs.featuresAreaBuildable)||((this.featuresAreaBuildable!= null)&&this.featuresAreaBuildable.equals(rhs.featuresAreaBuildable))))&&((this.featuresNearestLocationKm == rhs.featuresNearestLocationKm)||((this.featuresNearestLocationKm!= null)&&this.featuresNearestLocationKm.equals(rhs.featuresNearestLocationKm))))&&((this.featuresUtilitiesNaturalGas == rhs.featuresUtilitiesNaturalGas)||((this.featuresUtilitiesNaturalGas!= null)&&this.featuresUtilitiesNaturalGas.equals(rhs.featuresUtilitiesNaturalGas))));
    }

    public enum FeaturesAccessType {

        URBAN("urban"),
        ROAD("road"),
        TRACK("track"),
        HIGHWAY("highway"),
        UNKNOWN("unknown");
        private final String value;
        private final static Map<String, Land.FeaturesAccessType> CONSTANTS = new HashMap<String, Land.FeaturesAccessType>();

        static {
            for (Land.FeaturesAccessType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private FeaturesAccessType(String value) {
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
        public static Land.FeaturesAccessType fromValue(String value) {
            Land.FeaturesAccessType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum FeaturesType {

        LAND("land"),
        LAND_URBAN("land_urban"),
        LAND_COUNTRYBUILDABLE("land_countrybuildable"),
        LAND_COUNTRYNONBUILDABLE("land_countrynonbuildable");
        private final String value;
        private final static Map<String, Land.FeaturesType> CONSTANTS = new HashMap<String, Land.FeaturesType>();

        static {
            for (Land.FeaturesType c: values()) {
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
        public static Land.FeaturesType fromValue(String value) {
            Land.FeaturesType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
