
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
public class LandFeatures
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
    private LandFeatures.Type type;
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
    private BigInteger areaPlot;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresAreaBuildable")
    @DecimalMin("1")
    @DecimalMax("99999")
    private BigInteger areaBuildable;
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
     * blocks classification
     * <p>
     * certified for high-rise residential properties
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresClassificationBlocks")
    @JsonPropertyDescription("certified for high-rise residential properties")
    private Boolean classificationBlocks;
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
     * public classification
     * <p>
     * classified for amenities (hospitals, schools, museums)
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresClassificationPublic")
    @JsonPropertyDescription("classified for amenities (hospitals, schools, museums)")
    private Boolean classificationPublic;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresFloorsBuildable")
    @DecimalMin("1")
    @DecimalMax("99")
    private BigInteger floorsBuildable;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresNearestLocationKm")
    @DecimalMin("0")
    @DecimalMax("99")
    private BigDecimal nearestLocationKm;
    /**
     * electricity availability
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresUtilitiesElectricity")
    private Boolean utilitiesElectricity;
    /**
     * natural gas availability
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresUtilitiesNaturalGas")
    private Boolean utilitiesNaturalGas;
    /**
     * road access availability
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresUtilitiesRoadAccess")
    private Boolean utilitiesRoadAccess;
    /**
     * sewerage availability
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresUtilitiesSewerage")
    private Boolean utilitiesSewerage;
    /**
     * sidewalk availability
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresUtilitiesSidewalk")
    private Boolean utilitiesSidewalk;
    /**
     * street lighting availability
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresUtilitiesStreetLighting")
    private Boolean utilitiesStreetLighting;
    /**
     * water availability
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresUtilitiesWater")
    private Boolean utilitiesWater;
    /**
     * access type
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresAccessType")
    private AccessType accessType;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4732398260832080151L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LandFeatures() {
    }

    /**
     * 
     * @param areaPlot
     * @param type
     */
    public LandFeatures(LandFeatures.Type type, BigInteger areaPlot) {
        super();
        this.type = type;
        this.areaPlot = areaPlot;
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
    public LandFeatures.Type getType() {
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
    public void setType(LandFeatures.Type type) {
        this.type = type;
    }

    public LandFeatures withType(LandFeatures.Type type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("featuresAreaPlot")
    public BigInteger getAreaPlot() {
        return areaPlot;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("featuresAreaPlot")
    public void setAreaPlot(BigInteger areaPlot) {
        this.areaPlot = areaPlot;
    }

    public LandFeatures withAreaPlot(BigInteger areaPlot) {
        this.areaPlot = areaPlot;
        return this;
    }

    @JsonProperty("featuresAreaBuildable")
    public BigInteger getAreaBuildable() {
        return areaBuildable;
    }

    @JsonProperty("featuresAreaBuildable")
    public void setAreaBuildable(BigInteger areaBuildable) {
        this.areaBuildable = areaBuildable;
    }

    public LandFeatures withAreaBuildable(BigInteger areaBuildable) {
        this.areaBuildable = areaBuildable;
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

    public LandFeatures withAreaTradableMinimum(BigInteger areaTradableMinimum) {
        this.areaTradableMinimum = areaTradableMinimum;
        return this;
    }

    /**
     * blocks classification
     * <p>
     * certified for high-rise residential properties
     * 
     */
    @JsonProperty("featuresClassificationBlocks")
    public Boolean getClassificationBlocks() {
        return classificationBlocks;
    }

    /**
     * blocks classification
     * <p>
     * certified for high-rise residential properties
     * 
     */
    @JsonProperty("featuresClassificationBlocks")
    public void setClassificationBlocks(Boolean classificationBlocks) {
        this.classificationBlocks = classificationBlocks;
    }

    public LandFeatures withClassificationBlocks(Boolean classificationBlocks) {
        this.classificationBlocks = classificationBlocks;
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

    public LandFeatures withClassificationChalet(Boolean classificationChalet) {
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

    public LandFeatures withClassificationCommercial(Boolean classificationCommercial) {
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

    public LandFeatures withClassificationHotel(Boolean classificationHotel) {
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

    public LandFeatures withClassificationIndustrial(Boolean classificationIndustrial) {
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

    public LandFeatures withClassificationOffice(Boolean classificationOffice) {
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

    public LandFeatures withClassificationOther(Boolean classificationOther) {
        this.classificationOther = classificationOther;
        return this;
    }

    /**
     * public classification
     * <p>
     * classified for amenities (hospitals, schools, museums)
     * 
     */
    @JsonProperty("featuresClassificationPublic")
    public Boolean getClassificationPublic() {
        return classificationPublic;
    }

    /**
     * public classification
     * <p>
     * classified for amenities (hospitals, schools, museums)
     * 
     */
    @JsonProperty("featuresClassificationPublic")
    public void setClassificationPublic(Boolean classificationPublic) {
        this.classificationPublic = classificationPublic;
    }

    public LandFeatures withClassificationPublic(Boolean classificationPublic) {
        this.classificationPublic = classificationPublic;
        return this;
    }

    @JsonProperty("featuresFloorsBuildable")
    public BigInteger getFloorsBuildable() {
        return floorsBuildable;
    }

    @JsonProperty("featuresFloorsBuildable")
    public void setFloorsBuildable(BigInteger floorsBuildable) {
        this.floorsBuildable = floorsBuildable;
    }

    public LandFeatures withFloorsBuildable(BigInteger floorsBuildable) {
        this.floorsBuildable = floorsBuildable;
        return this;
    }

    @JsonProperty("featuresNearestLocationKm")
    public BigDecimal getNearestLocationKm() {
        return nearestLocationKm;
    }

    @JsonProperty("featuresNearestLocationKm")
    public void setNearestLocationKm(BigDecimal nearestLocationKm) {
        this.nearestLocationKm = nearestLocationKm;
    }

    public LandFeatures withNearestLocationKm(BigDecimal nearestLocationKm) {
        this.nearestLocationKm = nearestLocationKm;
        return this;
    }

    /**
     * electricity availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresUtilitiesElectricity")
    public Boolean getUtilitiesElectricity() {
        return utilitiesElectricity;
    }

    /**
     * electricity availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresUtilitiesElectricity")
    public void setUtilitiesElectricity(Boolean utilitiesElectricity) {
        this.utilitiesElectricity = utilitiesElectricity;
    }

    public LandFeatures withUtilitiesElectricity(Boolean utilitiesElectricity) {
        this.utilitiesElectricity = utilitiesElectricity;
        return this;
    }

    /**
     * natural gas availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresUtilitiesNaturalGas")
    public Boolean getUtilitiesNaturalGas() {
        return utilitiesNaturalGas;
    }

    /**
     * natural gas availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresUtilitiesNaturalGas")
    public void setUtilitiesNaturalGas(Boolean utilitiesNaturalGas) {
        this.utilitiesNaturalGas = utilitiesNaturalGas;
    }

    public LandFeatures withUtilitiesNaturalGas(Boolean utilitiesNaturalGas) {
        this.utilitiesNaturalGas = utilitiesNaturalGas;
        return this;
    }

    /**
     * road access availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresUtilitiesRoadAccess")
    public Boolean getUtilitiesRoadAccess() {
        return utilitiesRoadAccess;
    }

    /**
     * road access availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresUtilitiesRoadAccess")
    public void setUtilitiesRoadAccess(Boolean utilitiesRoadAccess) {
        this.utilitiesRoadAccess = utilitiesRoadAccess;
    }

    public LandFeatures withUtilitiesRoadAccess(Boolean utilitiesRoadAccess) {
        this.utilitiesRoadAccess = utilitiesRoadAccess;
        return this;
    }

    /**
     * sewerage availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresUtilitiesSewerage")
    public Boolean getUtilitiesSewerage() {
        return utilitiesSewerage;
    }

    /**
     * sewerage availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresUtilitiesSewerage")
    public void setUtilitiesSewerage(Boolean utilitiesSewerage) {
        this.utilitiesSewerage = utilitiesSewerage;
    }

    public LandFeatures withUtilitiesSewerage(Boolean utilitiesSewerage) {
        this.utilitiesSewerage = utilitiesSewerage;
        return this;
    }

    /**
     * sidewalk availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresUtilitiesSidewalk")
    public Boolean getUtilitiesSidewalk() {
        return utilitiesSidewalk;
    }

    /**
     * sidewalk availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresUtilitiesSidewalk")
    public void setUtilitiesSidewalk(Boolean utilitiesSidewalk) {
        this.utilitiesSidewalk = utilitiesSidewalk;
    }

    public LandFeatures withUtilitiesSidewalk(Boolean utilitiesSidewalk) {
        this.utilitiesSidewalk = utilitiesSidewalk;
        return this;
    }

    /**
     * street lighting availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresUtilitiesStreetLighting")
    public Boolean getUtilitiesStreetLighting() {
        return utilitiesStreetLighting;
    }

    /**
     * street lighting availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresUtilitiesStreetLighting")
    public void setUtilitiesStreetLighting(Boolean utilitiesStreetLighting) {
        this.utilitiesStreetLighting = utilitiesStreetLighting;
    }

    public LandFeatures withUtilitiesStreetLighting(Boolean utilitiesStreetLighting) {
        this.utilitiesStreetLighting = utilitiesStreetLighting;
        return this;
    }

    /**
     * water availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresUtilitiesWater")
    public Boolean getUtilitiesWater() {
        return utilitiesWater;
    }

    /**
     * water availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresUtilitiesWater")
    public void setUtilitiesWater(Boolean utilitiesWater) {
        this.utilitiesWater = utilitiesWater;
    }

    public LandFeatures withUtilitiesWater(Boolean utilitiesWater) {
        this.utilitiesWater = utilitiesWater;
        return this;
    }

    /**
     * access type
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresAccessType")
    public AccessType getAccessType() {
        return accessType;
    }

    /**
     * access type
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresAccessType")
    public void setAccessType(AccessType accessType) {
        this.accessType = accessType;
    }

    public LandFeatures withAccessType(AccessType accessType) {
        this.accessType = accessType;
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

    public LandFeatures withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LandFeatures.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("areaPlot");
        sb.append('=');
        sb.append(((this.areaPlot == null)?"<null>":this.areaPlot));
        sb.append(',');
        sb.append("areaBuildable");
        sb.append('=');
        sb.append(((this.areaBuildable == null)?"<null>":this.areaBuildable));
        sb.append(',');
        sb.append("areaTradableMinimum");
        sb.append('=');
        sb.append(((this.areaTradableMinimum == null)?"<null>":this.areaTradableMinimum));
        sb.append(',');
        sb.append("classificationBlocks");
        sb.append('=');
        sb.append(((this.classificationBlocks == null)?"<null>":this.classificationBlocks));
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
        sb.append("classificationPublic");
        sb.append('=');
        sb.append(((this.classificationPublic == null)?"<null>":this.classificationPublic));
        sb.append(',');
        sb.append("floorsBuildable");
        sb.append('=');
        sb.append(((this.floorsBuildable == null)?"<null>":this.floorsBuildable));
        sb.append(',');
        sb.append("nearestLocationKm");
        sb.append('=');
        sb.append(((this.nearestLocationKm == null)?"<null>":this.nearestLocationKm));
        sb.append(',');
        sb.append("utilitiesElectricity");
        sb.append('=');
        sb.append(((this.utilitiesElectricity == null)?"<null>":this.utilitiesElectricity));
        sb.append(',');
        sb.append("utilitiesNaturalGas");
        sb.append('=');
        sb.append(((this.utilitiesNaturalGas == null)?"<null>":this.utilitiesNaturalGas));
        sb.append(',');
        sb.append("utilitiesRoadAccess");
        sb.append('=');
        sb.append(((this.utilitiesRoadAccess == null)?"<null>":this.utilitiesRoadAccess));
        sb.append(',');
        sb.append("utilitiesSewerage");
        sb.append('=');
        sb.append(((this.utilitiesSewerage == null)?"<null>":this.utilitiesSewerage));
        sb.append(',');
        sb.append("utilitiesSidewalk");
        sb.append('=');
        sb.append(((this.utilitiesSidewalk == null)?"<null>":this.utilitiesSidewalk));
        sb.append(',');
        sb.append("utilitiesStreetLighting");
        sb.append('=');
        sb.append(((this.utilitiesStreetLighting == null)?"<null>":this.utilitiesStreetLighting));
        sb.append(',');
        sb.append("utilitiesWater");
        sb.append('=');
        sb.append(((this.utilitiesWater == null)?"<null>":this.utilitiesWater));
        sb.append(',');
        sb.append("accessType");
        sb.append('=');
        sb.append(((this.accessType == null)?"<null>":this.accessType));
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
        result = ((result* 31)+((this.areaPlot == null)? 0 :this.areaPlot.hashCode()));
        result = ((result* 31)+((this.utilitiesElectricity == null)? 0 :this.utilitiesElectricity.hashCode()));
        result = ((result* 31)+((this.areaTradableMinimum == null)? 0 :this.areaTradableMinimum.hashCode()));
        result = ((result* 31)+((this.classificationIndustrial == null)? 0 :this.classificationIndustrial.hashCode()));
        result = ((result* 31)+((this.utilitiesNaturalGas == null)? 0 :this.utilitiesNaturalGas.hashCode()));
        result = ((result* 31)+((this.classificationChalet == null)? 0 :this.classificationChalet.hashCode()));
        result = ((result* 31)+((this.classificationCommercial == null)? 0 :this.classificationCommercial.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.classificationHotel == null)? 0 :this.classificationHotel.hashCode()));
        result = ((result* 31)+((this.classificationOther == null)? 0 :this.classificationOther.hashCode()));
        result = ((result* 31)+((this.utilitiesSidewalk == null)? 0 :this.utilitiesSidewalk.hashCode()));
        result = ((result* 31)+((this.classificationOffice == null)? 0 :this.classificationOffice.hashCode()));
        result = ((result* 31)+((this.utilitiesSewerage == null)? 0 :this.utilitiesSewerage.hashCode()));
        result = ((result* 31)+((this.accessType == null)? 0 :this.accessType.hashCode()));
        result = ((result* 31)+((this.utilitiesRoadAccess == null)? 0 :this.utilitiesRoadAccess.hashCode()));
        result = ((result* 31)+((this.utilitiesWater == null)? 0 :this.utilitiesWater.hashCode()));
        result = ((result* 31)+((this.utilitiesStreetLighting == null)? 0 :this.utilitiesStreetLighting.hashCode()));
        result = ((result* 31)+((this.classificationBlocks == null)? 0 :this.classificationBlocks.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.classificationPublic == null)? 0 :this.classificationPublic.hashCode()));
        result = ((result* 31)+((this.nearestLocationKm == null)? 0 :this.nearestLocationKm.hashCode()));
        result = ((result* 31)+((this.areaBuildable == null)? 0 :this.areaBuildable.hashCode()));
        result = ((result* 31)+((this.floorsBuildable == null)? 0 :this.floorsBuildable.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LandFeatures) == false) {
            return false;
        }
        LandFeatures rhs = ((LandFeatures) other);
        return (((((((((((((((((((((((super.equals(rhs)&&((this.areaPlot == rhs.areaPlot)||((this.areaPlot!= null)&&this.areaPlot.equals(rhs.areaPlot))))&&((this.utilitiesElectricity == rhs.utilitiesElectricity)||((this.utilitiesElectricity!= null)&&this.utilitiesElectricity.equals(rhs.utilitiesElectricity))))&&((this.areaTradableMinimum == rhs.areaTradableMinimum)||((this.areaTradableMinimum!= null)&&this.areaTradableMinimum.equals(rhs.areaTradableMinimum))))&&((this.classificationIndustrial == rhs.classificationIndustrial)||((this.classificationIndustrial!= null)&&this.classificationIndustrial.equals(rhs.classificationIndustrial))))&&((this.utilitiesNaturalGas == rhs.utilitiesNaturalGas)||((this.utilitiesNaturalGas!= null)&&this.utilitiesNaturalGas.equals(rhs.utilitiesNaturalGas))))&&((this.classificationChalet == rhs.classificationChalet)||((this.classificationChalet!= null)&&this.classificationChalet.equals(rhs.classificationChalet))))&&((this.classificationCommercial == rhs.classificationCommercial)||((this.classificationCommercial!= null)&&this.classificationCommercial.equals(rhs.classificationCommercial))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.classificationHotel == rhs.classificationHotel)||((this.classificationHotel!= null)&&this.classificationHotel.equals(rhs.classificationHotel))))&&((this.classificationOther == rhs.classificationOther)||((this.classificationOther!= null)&&this.classificationOther.equals(rhs.classificationOther))))&&((this.utilitiesSidewalk == rhs.utilitiesSidewalk)||((this.utilitiesSidewalk!= null)&&this.utilitiesSidewalk.equals(rhs.utilitiesSidewalk))))&&((this.classificationOffice == rhs.classificationOffice)||((this.classificationOffice!= null)&&this.classificationOffice.equals(rhs.classificationOffice))))&&((this.utilitiesSewerage == rhs.utilitiesSewerage)||((this.utilitiesSewerage!= null)&&this.utilitiesSewerage.equals(rhs.utilitiesSewerage))))&&((this.accessType == rhs.accessType)||((this.accessType!= null)&&this.accessType.equals(rhs.accessType))))&&((this.utilitiesRoadAccess == rhs.utilitiesRoadAccess)||((this.utilitiesRoadAccess!= null)&&this.utilitiesRoadAccess.equals(rhs.utilitiesRoadAccess))))&&((this.utilitiesWater == rhs.utilitiesWater)||((this.utilitiesWater!= null)&&this.utilitiesWater.equals(rhs.utilitiesWater))))&&((this.utilitiesStreetLighting == rhs.utilitiesStreetLighting)||((this.utilitiesStreetLighting!= null)&&this.utilitiesStreetLighting.equals(rhs.utilitiesStreetLighting))))&&((this.classificationBlocks == rhs.classificationBlocks)||((this.classificationBlocks!= null)&&this.classificationBlocks.equals(rhs.classificationBlocks))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.classificationPublic == rhs.classificationPublic)||((this.classificationPublic!= null)&&this.classificationPublic.equals(rhs.classificationPublic))))&&((this.nearestLocationKm == rhs.nearestLocationKm)||((this.nearestLocationKm!= null)&&this.nearestLocationKm.equals(rhs.nearestLocationKm))))&&((this.areaBuildable == rhs.areaBuildable)||((this.areaBuildable!= null)&&this.areaBuildable.equals(rhs.areaBuildable))))&&((this.floorsBuildable == rhs.floorsBuildable)||((this.floorsBuildable!= null)&&this.floorsBuildable.equals(rhs.floorsBuildable))));
    }

    public enum Type {

        LAND("land"),
        LAND_URBAN("land_urban"),
        LAND_COUNTRY_BUILDABLE("land_countrybuildable"),
        LAND_COUNTRY_NON_BUILDABLE("land_countrynonbuildable");
        private final String value;
        private final static Map<String, LandFeatures.Type> CONSTANTS = new HashMap<String, LandFeatures.Type>();

        static {
            for (LandFeatures.Type c: values()) {
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
        public static LandFeatures.Type fromValue(String value) {
            LandFeatures.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
