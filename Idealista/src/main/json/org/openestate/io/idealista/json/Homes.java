
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
 * Homes Object
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "featuresType",
    "featuresAreaConstructed",
    "featuresAreaPlot",
    "featuresAreaUsable",
    "featuresBalcony",
    "featuresBathroomNumber",
    "featuresBedroomNumber",
    "featuresBuiltYear",
    "featuresConditionedAir",
    "featuresConservation",
    "featuresChimney",
    "featuresDoorman",
    "featuresDuplex",
    "featuresEquippedKitchen",
    "featuresEquippedWithFurniture",
    "featuresEnergyCertificatePerformance",
    "featuresEnergyCertificateLaw",
    "featuresEnergyCertificateRating",
    "featuresEnergyCertificateType",
    "featuresFloorsBuilding",
    "featuresFloorsInTop",
    "featuresGarden",
    "featuresHandicapAdaptedAccess",
    "featuresHandicapAdaptedUse",
    "featuresLiftAvailable",
    "featuresOrientationNorth",
    "featuresOrientationSouth",
    "featuresOrientationWest",
    "featuresOrientationEast",
    "featuresParkingAvailable",
    "featuresPenthouse",
    "featuresPetsAllowed",
    "featuresPool",
    "featuresRooms",
    "featuresStorage",
    "featuresStudio",
    "featuresTerrace",
    "featuresWardrobes",
    "featuresWindowsLocation",
    "featuresHeatingType"
})
public class Homes implements Serializable
{

    /**
     * property types
     * <p>
     * Types availability varies between countries. Spain: rustic_rural, rustic_masia, rustic_cortijo, rustic_terrera, rustic_torre, rustic_caseron. Italy: house_villa, rustic_masseria, rustic_trullo, rustic_casalecascina, rustic_baita. Portugal: house_andar_moradia, rustic_quinta, rustic_moinho, rustic_montealentejano, rustic_solar. Spain and Portugal: rustic_palace.  The rest of the types is available in every country.
     * (Required)
     * 
     */
    @JsonProperty("featuresType")
    @JsonPropertyDescription("Types availability varies between countries. Spain: rustic_rural, rustic_masia, rustic_cortijo, rustic_terrera, rustic_torre, rustic_caseron. Italy: house_villa, rustic_masseria, rustic_trullo, rustic_casalecascina, rustic_baita. Portugal: house_andar_moradia, rustic_quinta, rustic_moinho, rustic_montealentejano, rustic_solar. Spain and Portugal: rustic_palace.  The rest of the types is available in every country.")
    @NotNull
    @Nonnull
    private Homes.FeaturesType featuresType;
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
    @JsonProperty("featuresAreaPlot")
    @DecimalMin("1")
    @DecimalMax("99999999")
    private BigInteger featuresAreaPlot;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresAreaUsable")
    @DecimalMin("1")
    @DecimalMax("99999")
    private BigInteger featuresAreaUsable;
    /**
     * balcony availability
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresBalcony")
    private Boolean featuresBalcony;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("featuresBathroomNumber")
    @DecimalMin("1")
    @DecimalMax("99")
    @NotNull
    @Nonnull
    private BigInteger featuresBathroomNumber;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresBedroomNumber")
    @DecimalMin("1")
    @DecimalMax("99")
    private BigInteger featuresBedroomNumber;
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
     * air conditioning
     * <p>
     * has air conditioning
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresConditionedAir")
    @JsonPropertyDescription("has air conditioning")
    private Boolean featuresConditionedAir;
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
    private org.openestate.io.idealista.json.Building.FeaturesConservation featuresConservation;
    /**
     * chimney availability for rustic houses
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresChimney")
    private Boolean featuresChimney;
    /**
     * doorman
     * <p>
     * doorman availability
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresDoorman")
    @JsonPropertyDescription("doorman availability")
    private Boolean featuresDoorman;
    /**
     * duplex
     * <p>
     * flat on two floors connected by an indoor staircase
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresDuplex")
    @JsonPropertyDescription("flat on two floors connected by an indoor staircase")
    private Boolean featuresDuplex;
    /**
     * equipped with kitchen
     * <p>
     * equipped with kitchen only
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresEquippedKitchen")
    @JsonPropertyDescription("equipped with kitchen only")
    private Boolean featuresEquippedKitchen;
    /**
     * equipped with furniture
     * <p>
     * fully furnished
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresEquippedWithFurniture")
    @JsonPropertyDescription("fully furnished")
    private Boolean featuresEquippedWithFurniture;
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
     * energy certification law
     * <p>
     * only for Italy, indicates the legislation that applies to the energy rating, DL-192(2005) or LEGGE-90(2013)
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresEnergyCertificateLaw")
    @JsonPropertyDescription("only for Italy, indicates the legislation that applies to the energy rating, DL-192(2005) or LEGGE-90(2013)")
    private org.openestate.io.idealista.json.Building.FeaturesEnergyCertificateLaw featuresEnergyCertificateLaw;
    /**
     * energy certification rating
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresEnergyCertificateRating")
    private org.openestate.io.idealista.json.Building.FeaturesEnergyCertificateRating featuresEnergyCertificateRating;
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
    private org.openestate.io.idealista.json.Building.FeaturesEnergyCertificateType featuresEnergyCertificateType;
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
     * floor in top
     * <p>
     * flats: indicates if the property is on the last floor / houses: specific field for 'andar de moradia' property type, indicates if the property is the one on the upper floor (true) or the one in the lower floor (false)
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresFloorsInTop")
    @JsonPropertyDescription("flats: indicates if the property is on the last floor / houses: specific field for 'andar de moradia' property type, indicates if the property is the one on the upper floor (true) or the one in the lower floor (false)")
    private Boolean featuresFloorsInTop;
    /**
     * garden
     * <p>
     * garden availability
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresGarden")
    @JsonPropertyDescription("garden availability")
    private Boolean featuresGarden;
    /**
     * handicap adapted access availability
     * <p>
     * access adapted to people with reduced mobility
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresHandicapAdaptedAccess")
    @JsonPropertyDescription("access adapted to people with reduced mobility")
    private Boolean featuresHandicapAdaptedAccess;
    /**
     * handicap adapted use availability
     * <p>
     * property adapted to people with reduced mobility
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresHandicapAdaptedUse")
    @JsonPropertyDescription("property adapted to people with reduced mobility")
    private Boolean featuresHandicapAdaptedUse;
    /**
     * lift
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresLiftAvailable")
    private Boolean featuresLiftAvailable;
    /**
     * north orientation
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresOrientationNorth")
    private Boolean featuresOrientationNorth;
    /**
     * south orientation
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresOrientationSouth")
    private Boolean featuresOrientationSouth;
    /**
     * west orientation
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresOrientationWest")
    private Boolean featuresOrientationWest;
    /**
     * east orientation
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresOrientationEast")
    private Boolean featuresOrientationEast;
    /**
     * parking availability
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresParkingAvailable")
    private Boolean featuresParkingAvailable;
    /**
     * penthouse
     * <p>
     * flat on the top floor
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresPenthouse")
    @JsonPropertyDescription("flat on the top floor")
    private Boolean featuresPenthouse;
    /**
     * pets allowed
     * <p>
     * pet friendly flat
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresPetsAllowed")
    @JsonPropertyDescription("pet friendly flat")
    private Boolean featuresPetsAllowed;
    /**
     * pool availability
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresPool")
    private Boolean featuresPool;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresRooms")
    @DecimalMin("1")
    @DecimalMax("99")
    private BigInteger featuresRooms;
    /**
     * storage room
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresStorage")
    private Boolean featuresStorage;
    /**
     * studio
     * <p>
     * flat with a single room
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresStudio")
    @JsonPropertyDescription("flat with a single room")
    private Boolean featuresStudio;
    /**
     * terrace
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresTerrace")
    private Boolean featuresTerrace;
    /**
     * wardrobes availability
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresWardrobes")
    private Boolean featuresWardrobes;
    /**
     * windows location
     * <p>
     * internal / external flat based on windows view. Only available for Spain.
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresWindowsLocation")
    @JsonPropertyDescription("internal / external flat based on windows view. Only available for Spain.")
    private Homes.FeaturesWindowsLocation featuresWindowsLocation;
    /**
     * heatingType
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresHeatingType")
    private Homes.FeaturesHeatingType featuresHeatingType;
    private final static long serialVersionUID = 3659222637784238850L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Homes() {
    }

    /**
     * 
     * @param featuresType
     * @param featuresAreaConstructed
     * @param featuresBathroomNumber
     */
    public Homes(Homes.FeaturesType featuresType, BigInteger featuresAreaConstructed, BigInteger featuresBathroomNumber) {
        super();
        this.featuresType = featuresType;
        this.featuresAreaConstructed = featuresAreaConstructed;
        this.featuresBathroomNumber = featuresBathroomNumber;
    }

    /**
     * property types
     * <p>
     * Types availability varies between countries. Spain: rustic_rural, rustic_masia, rustic_cortijo, rustic_terrera, rustic_torre, rustic_caseron. Italy: house_villa, rustic_masseria, rustic_trullo, rustic_casalecascina, rustic_baita. Portugal: house_andar_moradia, rustic_quinta, rustic_moinho, rustic_montealentejano, rustic_solar. Spain and Portugal: rustic_palace.  The rest of the types is available in every country.
     * (Required)
     * 
     */
    @JsonProperty("featuresType")
    public Homes.FeaturesType getFeaturesType() {
        return featuresType;
    }

    /**
     * property types
     * <p>
     * Types availability varies between countries. Spain: rustic_rural, rustic_masia, rustic_cortijo, rustic_terrera, rustic_torre, rustic_caseron. Italy: house_villa, rustic_masseria, rustic_trullo, rustic_casalecascina, rustic_baita. Portugal: house_andar_moradia, rustic_quinta, rustic_moinho, rustic_montealentejano, rustic_solar. Spain and Portugal: rustic_palace.  The rest of the types is available in every country.
     * (Required)
     * 
     */
    @JsonProperty("featuresType")
    public void setFeaturesType(Homes.FeaturesType featuresType) {
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

    @JsonProperty("featuresAreaPlot")
    public BigInteger getFeaturesAreaPlot() {
        return featuresAreaPlot;
    }

    @JsonProperty("featuresAreaPlot")
    public void setFeaturesAreaPlot(BigInteger featuresAreaPlot) {
        this.featuresAreaPlot = featuresAreaPlot;
    }

    @JsonProperty("featuresAreaUsable")
    public BigInteger getFeaturesAreaUsable() {
        return featuresAreaUsable;
    }

    @JsonProperty("featuresAreaUsable")
    public void setFeaturesAreaUsable(BigInteger featuresAreaUsable) {
        this.featuresAreaUsable = featuresAreaUsable;
    }

    /**
     * balcony availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresBalcony")
    public Boolean getFeaturesBalcony() {
        return featuresBalcony;
    }

    /**
     * balcony availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresBalcony")
    public void setFeaturesBalcony(Boolean featuresBalcony) {
        this.featuresBalcony = featuresBalcony;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("featuresBathroomNumber")
    public BigInteger getFeaturesBathroomNumber() {
        return featuresBathroomNumber;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("featuresBathroomNumber")
    public void setFeaturesBathroomNumber(BigInteger featuresBathroomNumber) {
        this.featuresBathroomNumber = featuresBathroomNumber;
    }

    @JsonProperty("featuresBedroomNumber")
    public BigInteger getFeaturesBedroomNumber() {
        return featuresBedroomNumber;
    }

    @JsonProperty("featuresBedroomNumber")
    public void setFeaturesBedroomNumber(BigInteger featuresBedroomNumber) {
        this.featuresBedroomNumber = featuresBedroomNumber;
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
     * air conditioning
     * <p>
     * has air conditioning
     * 
     */
    @JsonProperty("featuresConditionedAir")
    public Boolean getFeaturesConditionedAir() {
        return featuresConditionedAir;
    }

    /**
     * air conditioning
     * <p>
     * has air conditioning
     * 
     */
    @JsonProperty("featuresConditionedAir")
    public void setFeaturesConditionedAir(Boolean featuresConditionedAir) {
        this.featuresConditionedAir = featuresConditionedAir;
    }

    /**
     * conservation status
     * <p>
     * status new is only available for new development properties, not for secondhand properties
     * 
     */
    @JsonProperty("featuresConservation")
    public org.openestate.io.idealista.json.Building.FeaturesConservation getFeaturesConservation() {
        return featuresConservation;
    }

    /**
     * conservation status
     * <p>
     * status new is only available for new development properties, not for secondhand properties
     * 
     */
    @JsonProperty("featuresConservation")
    public void setFeaturesConservation(org.openestate.io.idealista.json.Building.FeaturesConservation featuresConservation) {
        this.featuresConservation = featuresConservation;
    }

    /**
     * chimney availability for rustic houses
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresChimney")
    public Boolean getFeaturesChimney() {
        return featuresChimney;
    }

    /**
     * chimney availability for rustic houses
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresChimney")
    public void setFeaturesChimney(Boolean featuresChimney) {
        this.featuresChimney = featuresChimney;
    }

    /**
     * doorman
     * <p>
     * doorman availability
     * 
     */
    @JsonProperty("featuresDoorman")
    public Boolean getFeaturesDoorman() {
        return featuresDoorman;
    }

    /**
     * doorman
     * <p>
     * doorman availability
     * 
     */
    @JsonProperty("featuresDoorman")
    public void setFeaturesDoorman(Boolean featuresDoorman) {
        this.featuresDoorman = featuresDoorman;
    }

    /**
     * duplex
     * <p>
     * flat on two floors connected by an indoor staircase
     * 
     */
    @JsonProperty("featuresDuplex")
    public Boolean getFeaturesDuplex() {
        return featuresDuplex;
    }

    /**
     * duplex
     * <p>
     * flat on two floors connected by an indoor staircase
     * 
     */
    @JsonProperty("featuresDuplex")
    public void setFeaturesDuplex(Boolean featuresDuplex) {
        this.featuresDuplex = featuresDuplex;
    }

    /**
     * equipped with kitchen
     * <p>
     * equipped with kitchen only
     * 
     */
    @JsonProperty("featuresEquippedKitchen")
    public Boolean getFeaturesEquippedKitchen() {
        return featuresEquippedKitchen;
    }

    /**
     * equipped with kitchen
     * <p>
     * equipped with kitchen only
     * 
     */
    @JsonProperty("featuresEquippedKitchen")
    public void setFeaturesEquippedKitchen(Boolean featuresEquippedKitchen) {
        this.featuresEquippedKitchen = featuresEquippedKitchen;
    }

    /**
     * equipped with furniture
     * <p>
     * fully furnished
     * 
     */
    @JsonProperty("featuresEquippedWithFurniture")
    public Boolean getFeaturesEquippedWithFurniture() {
        return featuresEquippedWithFurniture;
    }

    /**
     * equipped with furniture
     * <p>
     * fully furnished
     * 
     */
    @JsonProperty("featuresEquippedWithFurniture")
    public void setFeaturesEquippedWithFurniture(Boolean featuresEquippedWithFurniture) {
        this.featuresEquippedWithFurniture = featuresEquippedWithFurniture;
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
     * energy certification law
     * <p>
     * only for Italy, indicates the legislation that applies to the energy rating, DL-192(2005) or LEGGE-90(2013)
     * 
     */
    @JsonProperty("featuresEnergyCertificateLaw")
    public org.openestate.io.idealista.json.Building.FeaturesEnergyCertificateLaw getFeaturesEnergyCertificateLaw() {
        return featuresEnergyCertificateLaw;
    }

    /**
     * energy certification law
     * <p>
     * only for Italy, indicates the legislation that applies to the energy rating, DL-192(2005) or LEGGE-90(2013)
     * 
     */
    @JsonProperty("featuresEnergyCertificateLaw")
    public void setFeaturesEnergyCertificateLaw(org.openestate.io.idealista.json.Building.FeaturesEnergyCertificateLaw featuresEnergyCertificateLaw) {
        this.featuresEnergyCertificateLaw = featuresEnergyCertificateLaw;
    }

    /**
     * energy certification rating
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresEnergyCertificateRating")
    public org.openestate.io.idealista.json.Building.FeaturesEnergyCertificateRating getFeaturesEnergyCertificateRating() {
        return featuresEnergyCertificateRating;
    }

    /**
     * energy certification rating
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresEnergyCertificateRating")
    public void setFeaturesEnergyCertificateRating(org.openestate.io.idealista.json.Building.FeaturesEnergyCertificateRating featuresEnergyCertificateRating) {
        this.featuresEnergyCertificateRating = featuresEnergyCertificateRating;
    }

    /**
     * energy certification type
     * <p>
     * only available for new development properties. project: certification in project phase; completed: certification if the property is finished
     * 
     */
    @JsonProperty("featuresEnergyCertificateType")
    public org.openestate.io.idealista.json.Building.FeaturesEnergyCertificateType getFeaturesEnergyCertificateType() {
        return featuresEnergyCertificateType;
    }

    /**
     * energy certification type
     * <p>
     * only available for new development properties. project: certification in project phase; completed: certification if the property is finished
     * 
     */
    @JsonProperty("featuresEnergyCertificateType")
    public void setFeaturesEnergyCertificateType(org.openestate.io.idealista.json.Building.FeaturesEnergyCertificateType featuresEnergyCertificateType) {
        this.featuresEnergyCertificateType = featuresEnergyCertificateType;
    }

    @JsonProperty("featuresFloorsBuilding")
    public BigInteger getFeaturesFloorsBuilding() {
        return featuresFloorsBuilding;
    }

    @JsonProperty("featuresFloorsBuilding")
    public void setFeaturesFloorsBuilding(BigInteger featuresFloorsBuilding) {
        this.featuresFloorsBuilding = featuresFloorsBuilding;
    }

    /**
     * floor in top
     * <p>
     * flats: indicates if the property is on the last floor / houses: specific field for 'andar de moradia' property type, indicates if the property is the one on the upper floor (true) or the one in the lower floor (false)
     * 
     */
    @JsonProperty("featuresFloorsInTop")
    public Boolean getFeaturesFloorsInTop() {
        return featuresFloorsInTop;
    }

    /**
     * floor in top
     * <p>
     * flats: indicates if the property is on the last floor / houses: specific field for 'andar de moradia' property type, indicates if the property is the one on the upper floor (true) or the one in the lower floor (false)
     * 
     */
    @JsonProperty("featuresFloorsInTop")
    public void setFeaturesFloorsInTop(Boolean featuresFloorsInTop) {
        this.featuresFloorsInTop = featuresFloorsInTop;
    }

    /**
     * garden
     * <p>
     * garden availability
     * 
     */
    @JsonProperty("featuresGarden")
    public Boolean getFeaturesGarden() {
        return featuresGarden;
    }

    /**
     * garden
     * <p>
     * garden availability
     * 
     */
    @JsonProperty("featuresGarden")
    public void setFeaturesGarden(Boolean featuresGarden) {
        this.featuresGarden = featuresGarden;
    }

    /**
     * handicap adapted access availability
     * <p>
     * access adapted to people with reduced mobility
     * 
     */
    @JsonProperty("featuresHandicapAdaptedAccess")
    public Boolean getFeaturesHandicapAdaptedAccess() {
        return featuresHandicapAdaptedAccess;
    }

    /**
     * handicap adapted access availability
     * <p>
     * access adapted to people with reduced mobility
     * 
     */
    @JsonProperty("featuresHandicapAdaptedAccess")
    public void setFeaturesHandicapAdaptedAccess(Boolean featuresHandicapAdaptedAccess) {
        this.featuresHandicapAdaptedAccess = featuresHandicapAdaptedAccess;
    }

    /**
     * handicap adapted use availability
     * <p>
     * property adapted to people with reduced mobility
     * 
     */
    @JsonProperty("featuresHandicapAdaptedUse")
    public Boolean getFeaturesHandicapAdaptedUse() {
        return featuresHandicapAdaptedUse;
    }

    /**
     * handicap adapted use availability
     * <p>
     * property adapted to people with reduced mobility
     * 
     */
    @JsonProperty("featuresHandicapAdaptedUse")
    public void setFeaturesHandicapAdaptedUse(Boolean featuresHandicapAdaptedUse) {
        this.featuresHandicapAdaptedUse = featuresHandicapAdaptedUse;
    }

    /**
     * lift
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresLiftAvailable")
    public Boolean getFeaturesLiftAvailable() {
        return featuresLiftAvailable;
    }

    /**
     * lift
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresLiftAvailable")
    public void setFeaturesLiftAvailable(Boolean featuresLiftAvailable) {
        this.featuresLiftAvailable = featuresLiftAvailable;
    }

    /**
     * north orientation
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresOrientationNorth")
    public Boolean getFeaturesOrientationNorth() {
        return featuresOrientationNorth;
    }

    /**
     * north orientation
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresOrientationNorth")
    public void setFeaturesOrientationNorth(Boolean featuresOrientationNorth) {
        this.featuresOrientationNorth = featuresOrientationNorth;
    }

    /**
     * south orientation
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresOrientationSouth")
    public Boolean getFeaturesOrientationSouth() {
        return featuresOrientationSouth;
    }

    /**
     * south orientation
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresOrientationSouth")
    public void setFeaturesOrientationSouth(Boolean featuresOrientationSouth) {
        this.featuresOrientationSouth = featuresOrientationSouth;
    }

    /**
     * west orientation
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresOrientationWest")
    public Boolean getFeaturesOrientationWest() {
        return featuresOrientationWest;
    }

    /**
     * west orientation
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresOrientationWest")
    public void setFeaturesOrientationWest(Boolean featuresOrientationWest) {
        this.featuresOrientationWest = featuresOrientationWest;
    }

    /**
     * east orientation
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresOrientationEast")
    public Boolean getFeaturesOrientationEast() {
        return featuresOrientationEast;
    }

    /**
     * east orientation
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresOrientationEast")
    public void setFeaturesOrientationEast(Boolean featuresOrientationEast) {
        this.featuresOrientationEast = featuresOrientationEast;
    }

    /**
     * parking availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresParkingAvailable")
    public Boolean getFeaturesParkingAvailable() {
        return featuresParkingAvailable;
    }

    /**
     * parking availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresParkingAvailable")
    public void setFeaturesParkingAvailable(Boolean featuresParkingAvailable) {
        this.featuresParkingAvailable = featuresParkingAvailable;
    }

    /**
     * penthouse
     * <p>
     * flat on the top floor
     * 
     */
    @JsonProperty("featuresPenthouse")
    public Boolean getFeaturesPenthouse() {
        return featuresPenthouse;
    }

    /**
     * penthouse
     * <p>
     * flat on the top floor
     * 
     */
    @JsonProperty("featuresPenthouse")
    public void setFeaturesPenthouse(Boolean featuresPenthouse) {
        this.featuresPenthouse = featuresPenthouse;
    }

    /**
     * pets allowed
     * <p>
     * pet friendly flat
     * 
     */
    @JsonProperty("featuresPetsAllowed")
    public Boolean getFeaturesPetsAllowed() {
        return featuresPetsAllowed;
    }

    /**
     * pets allowed
     * <p>
     * pet friendly flat
     * 
     */
    @JsonProperty("featuresPetsAllowed")
    public void setFeaturesPetsAllowed(Boolean featuresPetsAllowed) {
        this.featuresPetsAllowed = featuresPetsAllowed;
    }

    /**
     * pool availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresPool")
    public Boolean getFeaturesPool() {
        return featuresPool;
    }

    /**
     * pool availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresPool")
    public void setFeaturesPool(Boolean featuresPool) {
        this.featuresPool = featuresPool;
    }

    @JsonProperty("featuresRooms")
    public BigInteger getFeaturesRooms() {
        return featuresRooms;
    }

    @JsonProperty("featuresRooms")
    public void setFeaturesRooms(BigInteger featuresRooms) {
        this.featuresRooms = featuresRooms;
    }

    /**
     * storage room
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresStorage")
    public Boolean getFeaturesStorage() {
        return featuresStorage;
    }

    /**
     * storage room
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresStorage")
    public void setFeaturesStorage(Boolean featuresStorage) {
        this.featuresStorage = featuresStorage;
    }

    /**
     * studio
     * <p>
     * flat with a single room
     * 
     */
    @JsonProperty("featuresStudio")
    public Boolean getFeaturesStudio() {
        return featuresStudio;
    }

    /**
     * studio
     * <p>
     * flat with a single room
     * 
     */
    @JsonProperty("featuresStudio")
    public void setFeaturesStudio(Boolean featuresStudio) {
        this.featuresStudio = featuresStudio;
    }

    /**
     * terrace
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresTerrace")
    public Boolean getFeaturesTerrace() {
        return featuresTerrace;
    }

    /**
     * terrace
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresTerrace")
    public void setFeaturesTerrace(Boolean featuresTerrace) {
        this.featuresTerrace = featuresTerrace;
    }

    /**
     * wardrobes availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresWardrobes")
    public Boolean getFeaturesWardrobes() {
        return featuresWardrobes;
    }

    /**
     * wardrobes availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresWardrobes")
    public void setFeaturesWardrobes(Boolean featuresWardrobes) {
        this.featuresWardrobes = featuresWardrobes;
    }

    /**
     * windows location
     * <p>
     * internal / external flat based on windows view. Only available for Spain.
     * 
     */
    @JsonProperty("featuresWindowsLocation")
    public Homes.FeaturesWindowsLocation getFeaturesWindowsLocation() {
        return featuresWindowsLocation;
    }

    /**
     * windows location
     * <p>
     * internal / external flat based on windows view. Only available for Spain.
     * 
     */
    @JsonProperty("featuresWindowsLocation")
    public void setFeaturesWindowsLocation(Homes.FeaturesWindowsLocation featuresWindowsLocation) {
        this.featuresWindowsLocation = featuresWindowsLocation;
    }

    /**
     * heatingType
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresHeatingType")
    public Homes.FeaturesHeatingType getFeaturesHeatingType() {
        return featuresHeatingType;
    }

    /**
     * heatingType
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresHeatingType")
    public void setFeaturesHeatingType(Homes.FeaturesHeatingType featuresHeatingType) {
        this.featuresHeatingType = featuresHeatingType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Homes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("featuresType");
        sb.append('=');
        sb.append(((this.featuresType == null)?"<null>":this.featuresType));
        sb.append(',');
        sb.append("featuresAreaConstructed");
        sb.append('=');
        sb.append(((this.featuresAreaConstructed == null)?"<null>":this.featuresAreaConstructed));
        sb.append(',');
        sb.append("featuresAreaPlot");
        sb.append('=');
        sb.append(((this.featuresAreaPlot == null)?"<null>":this.featuresAreaPlot));
        sb.append(',');
        sb.append("featuresAreaUsable");
        sb.append('=');
        sb.append(((this.featuresAreaUsable == null)?"<null>":this.featuresAreaUsable));
        sb.append(',');
        sb.append("featuresBalcony");
        sb.append('=');
        sb.append(((this.featuresBalcony == null)?"<null>":this.featuresBalcony));
        sb.append(',');
        sb.append("featuresBathroomNumber");
        sb.append('=');
        sb.append(((this.featuresBathroomNumber == null)?"<null>":this.featuresBathroomNumber));
        sb.append(',');
        sb.append("featuresBedroomNumber");
        sb.append('=');
        sb.append(((this.featuresBedroomNumber == null)?"<null>":this.featuresBedroomNumber));
        sb.append(',');
        sb.append("featuresBuiltYear");
        sb.append('=');
        sb.append(((this.featuresBuiltYear == null)?"<null>":this.featuresBuiltYear));
        sb.append(',');
        sb.append("featuresConditionedAir");
        sb.append('=');
        sb.append(((this.featuresConditionedAir == null)?"<null>":this.featuresConditionedAir));
        sb.append(',');
        sb.append("featuresConservation");
        sb.append('=');
        sb.append(((this.featuresConservation == null)?"<null>":this.featuresConservation));
        sb.append(',');
        sb.append("featuresChimney");
        sb.append('=');
        sb.append(((this.featuresChimney == null)?"<null>":this.featuresChimney));
        sb.append(',');
        sb.append("featuresDoorman");
        sb.append('=');
        sb.append(((this.featuresDoorman == null)?"<null>":this.featuresDoorman));
        sb.append(',');
        sb.append("featuresDuplex");
        sb.append('=');
        sb.append(((this.featuresDuplex == null)?"<null>":this.featuresDuplex));
        sb.append(',');
        sb.append("featuresEquippedKitchen");
        sb.append('=');
        sb.append(((this.featuresEquippedKitchen == null)?"<null>":this.featuresEquippedKitchen));
        sb.append(',');
        sb.append("featuresEquippedWithFurniture");
        sb.append('=');
        sb.append(((this.featuresEquippedWithFurniture == null)?"<null>":this.featuresEquippedWithFurniture));
        sb.append(',');
        sb.append("featuresEnergyCertificatePerformance");
        sb.append('=');
        sb.append(((this.featuresEnergyCertificatePerformance == null)?"<null>":this.featuresEnergyCertificatePerformance));
        sb.append(',');
        sb.append("featuresEnergyCertificateLaw");
        sb.append('=');
        sb.append(((this.featuresEnergyCertificateLaw == null)?"<null>":this.featuresEnergyCertificateLaw));
        sb.append(',');
        sb.append("featuresEnergyCertificateRating");
        sb.append('=');
        sb.append(((this.featuresEnergyCertificateRating == null)?"<null>":this.featuresEnergyCertificateRating));
        sb.append(',');
        sb.append("featuresEnergyCertificateType");
        sb.append('=');
        sb.append(((this.featuresEnergyCertificateType == null)?"<null>":this.featuresEnergyCertificateType));
        sb.append(',');
        sb.append("featuresFloorsBuilding");
        sb.append('=');
        sb.append(((this.featuresFloorsBuilding == null)?"<null>":this.featuresFloorsBuilding));
        sb.append(',');
        sb.append("featuresFloorsInTop");
        sb.append('=');
        sb.append(((this.featuresFloorsInTop == null)?"<null>":this.featuresFloorsInTop));
        sb.append(',');
        sb.append("featuresGarden");
        sb.append('=');
        sb.append(((this.featuresGarden == null)?"<null>":this.featuresGarden));
        sb.append(',');
        sb.append("featuresHandicapAdaptedAccess");
        sb.append('=');
        sb.append(((this.featuresHandicapAdaptedAccess == null)?"<null>":this.featuresHandicapAdaptedAccess));
        sb.append(',');
        sb.append("featuresHandicapAdaptedUse");
        sb.append('=');
        sb.append(((this.featuresHandicapAdaptedUse == null)?"<null>":this.featuresHandicapAdaptedUse));
        sb.append(',');
        sb.append("featuresLiftAvailable");
        sb.append('=');
        sb.append(((this.featuresLiftAvailable == null)?"<null>":this.featuresLiftAvailable));
        sb.append(',');
        sb.append("featuresOrientationNorth");
        sb.append('=');
        sb.append(((this.featuresOrientationNorth == null)?"<null>":this.featuresOrientationNorth));
        sb.append(',');
        sb.append("featuresOrientationSouth");
        sb.append('=');
        sb.append(((this.featuresOrientationSouth == null)?"<null>":this.featuresOrientationSouth));
        sb.append(',');
        sb.append("featuresOrientationWest");
        sb.append('=');
        sb.append(((this.featuresOrientationWest == null)?"<null>":this.featuresOrientationWest));
        sb.append(',');
        sb.append("featuresOrientationEast");
        sb.append('=');
        sb.append(((this.featuresOrientationEast == null)?"<null>":this.featuresOrientationEast));
        sb.append(',');
        sb.append("featuresParkingAvailable");
        sb.append('=');
        sb.append(((this.featuresParkingAvailable == null)?"<null>":this.featuresParkingAvailable));
        sb.append(',');
        sb.append("featuresPenthouse");
        sb.append('=');
        sb.append(((this.featuresPenthouse == null)?"<null>":this.featuresPenthouse));
        sb.append(',');
        sb.append("featuresPetsAllowed");
        sb.append('=');
        sb.append(((this.featuresPetsAllowed == null)?"<null>":this.featuresPetsAllowed));
        sb.append(',');
        sb.append("featuresPool");
        sb.append('=');
        sb.append(((this.featuresPool == null)?"<null>":this.featuresPool));
        sb.append(',');
        sb.append("featuresRooms");
        sb.append('=');
        sb.append(((this.featuresRooms == null)?"<null>":this.featuresRooms));
        sb.append(',');
        sb.append("featuresStorage");
        sb.append('=');
        sb.append(((this.featuresStorage == null)?"<null>":this.featuresStorage));
        sb.append(',');
        sb.append("featuresStudio");
        sb.append('=');
        sb.append(((this.featuresStudio == null)?"<null>":this.featuresStudio));
        sb.append(',');
        sb.append("featuresTerrace");
        sb.append('=');
        sb.append(((this.featuresTerrace == null)?"<null>":this.featuresTerrace));
        sb.append(',');
        sb.append("featuresWardrobes");
        sb.append('=');
        sb.append(((this.featuresWardrobes == null)?"<null>":this.featuresWardrobes));
        sb.append(',');
        sb.append("featuresWindowsLocation");
        sb.append('=');
        sb.append(((this.featuresWindowsLocation == null)?"<null>":this.featuresWindowsLocation));
        sb.append(',');
        sb.append("featuresHeatingType");
        sb.append('=');
        sb.append(((this.featuresHeatingType == null)?"<null>":this.featuresHeatingType));
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
        result = ((result* 31)+((this.featuresHandicapAdaptedUse == null)? 0 :this.featuresHandicapAdaptedUse.hashCode()));
        result = ((result* 31)+((this.featuresOrientationNorth == null)? 0 :this.featuresOrientationNorth.hashCode()));
        result = ((result* 31)+((this.featuresWindowsLocation == null)? 0 :this.featuresWindowsLocation.hashCode()));
        result = ((result* 31)+((this.featuresEquippedKitchen == null)? 0 :this.featuresEquippedKitchen.hashCode()));
        result = ((result* 31)+((this.featuresEnergyCertificateRating == null)? 0 :this.featuresEnergyCertificateRating.hashCode()));
        result = ((result* 31)+((this.featuresHandicapAdaptedAccess == null)? 0 :this.featuresHandicapAdaptedAccess.hashCode()));
        result = ((result* 31)+((this.featuresType == null)? 0 :this.featuresType.hashCode()));
        result = ((result* 31)+((this.featuresEnergyCertificateType == null)? 0 :this.featuresEnergyCertificateType.hashCode()));
        result = ((result* 31)+((this.featuresAreaConstructed == null)? 0 :this.featuresAreaConstructed.hashCode()));
        result = ((result* 31)+((this.featuresAreaPlot == null)? 0 :this.featuresAreaPlot.hashCode()));
        result = ((result* 31)+((this.featuresBathroomNumber == null)? 0 :this.featuresBathroomNumber.hashCode()));
        result = ((result* 31)+((this.featuresOrientationSouth == null)? 0 :this.featuresOrientationSouth.hashCode()));
        result = ((result* 31)+((this.featuresParkingAvailable == null)? 0 :this.featuresParkingAvailable.hashCode()));
        result = ((result* 31)+((this.featuresGarden == null)? 0 :this.featuresGarden.hashCode()));
        result = ((result* 31)+((this.featuresPenthouse == null)? 0 :this.featuresPenthouse.hashCode()));
        result = ((result* 31)+((this.featuresConservation == null)? 0 :this.featuresConservation.hashCode()));
        result = ((result* 31)+((this.featuresChimney == null)? 0 :this.featuresChimney.hashCode()));
        result = ((result* 31)+((this.featuresLiftAvailable == null)? 0 :this.featuresLiftAvailable.hashCode()));
        result = ((result* 31)+((this.featuresAreaUsable == null)? 0 :this.featuresAreaUsable.hashCode()));
        result = ((result* 31)+((this.featuresEnergyCertificateLaw == null)? 0 :this.featuresEnergyCertificateLaw.hashCode()));
        result = ((result* 31)+((this.featuresFloorsBuilding == null)? 0 :this.featuresFloorsBuilding.hashCode()));
        result = ((result* 31)+((this.featuresDuplex == null)? 0 :this.featuresDuplex.hashCode()));
        result = ((result* 31)+((this.featuresPetsAllowed == null)? 0 :this.featuresPetsAllowed.hashCode()));
        result = ((result* 31)+((this.featuresPool == null)? 0 :this.featuresPool.hashCode()));
        result = ((result* 31)+((this.featuresStorage == null)? 0 :this.featuresStorage.hashCode()));
        result = ((result* 31)+((this.featuresHeatingType == null)? 0 :this.featuresHeatingType.hashCode()));
        result = ((result* 31)+((this.featuresTerrace == null)? 0 :this.featuresTerrace.hashCode()));
        result = ((result* 31)+((this.featuresRooms == null)? 0 :this.featuresRooms.hashCode()));
        result = ((result* 31)+((this.featuresEnergyCertificatePerformance == null)? 0 :this.featuresEnergyCertificatePerformance.hashCode()));
        result = ((result* 31)+((this.featuresConditionedAir == null)? 0 :this.featuresConditionedAir.hashCode()));
        result = ((result* 31)+((this.featuresOrientationWest == null)? 0 :this.featuresOrientationWest.hashCode()));
        result = ((result* 31)+((this.featuresBedroomNumber == null)? 0 :this.featuresBedroomNumber.hashCode()));
        result = ((result* 31)+((this.featuresBalcony == null)? 0 :this.featuresBalcony.hashCode()));
        result = ((result* 31)+((this.featuresFloorsInTop == null)? 0 :this.featuresFloorsInTop.hashCode()));
        result = ((result* 31)+((this.featuresBuiltYear == null)? 0 :this.featuresBuiltYear.hashCode()));
        result = ((result* 31)+((this.featuresWardrobes == null)? 0 :this.featuresWardrobes.hashCode()));
        result = ((result* 31)+((this.featuresOrientationEast == null)? 0 :this.featuresOrientationEast.hashCode()));
        result = ((result* 31)+((this.featuresDoorman == null)? 0 :this.featuresDoorman.hashCode()));
        result = ((result* 31)+((this.featuresStudio == null)? 0 :this.featuresStudio.hashCode()));
        result = ((result* 31)+((this.featuresEquippedWithFurniture == null)? 0 :this.featuresEquippedWithFurniture.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Homes) == false) {
            return false;
        }
        Homes rhs = ((Homes) other);
        return (((((((((((((((((((((((((((((((((((((((((this.featuresHandicapAdaptedUse == rhs.featuresHandicapAdaptedUse)||((this.featuresHandicapAdaptedUse!= null)&&this.featuresHandicapAdaptedUse.equals(rhs.featuresHandicapAdaptedUse)))&&((this.featuresOrientationNorth == rhs.featuresOrientationNorth)||((this.featuresOrientationNorth!= null)&&this.featuresOrientationNorth.equals(rhs.featuresOrientationNorth))))&&((this.featuresWindowsLocation == rhs.featuresWindowsLocation)||((this.featuresWindowsLocation!= null)&&this.featuresWindowsLocation.equals(rhs.featuresWindowsLocation))))&&((this.featuresEquippedKitchen == rhs.featuresEquippedKitchen)||((this.featuresEquippedKitchen!= null)&&this.featuresEquippedKitchen.equals(rhs.featuresEquippedKitchen))))&&((this.featuresEnergyCertificateRating == rhs.featuresEnergyCertificateRating)||((this.featuresEnergyCertificateRating!= null)&&this.featuresEnergyCertificateRating.equals(rhs.featuresEnergyCertificateRating))))&&((this.featuresHandicapAdaptedAccess == rhs.featuresHandicapAdaptedAccess)||((this.featuresHandicapAdaptedAccess!= null)&&this.featuresHandicapAdaptedAccess.equals(rhs.featuresHandicapAdaptedAccess))))&&((this.featuresType == rhs.featuresType)||((this.featuresType!= null)&&this.featuresType.equals(rhs.featuresType))))&&((this.featuresEnergyCertificateType == rhs.featuresEnergyCertificateType)||((this.featuresEnergyCertificateType!= null)&&this.featuresEnergyCertificateType.equals(rhs.featuresEnergyCertificateType))))&&((this.featuresAreaConstructed == rhs.featuresAreaConstructed)||((this.featuresAreaConstructed!= null)&&this.featuresAreaConstructed.equals(rhs.featuresAreaConstructed))))&&((this.featuresAreaPlot == rhs.featuresAreaPlot)||((this.featuresAreaPlot!= null)&&this.featuresAreaPlot.equals(rhs.featuresAreaPlot))))&&((this.featuresBathroomNumber == rhs.featuresBathroomNumber)||((this.featuresBathroomNumber!= null)&&this.featuresBathroomNumber.equals(rhs.featuresBathroomNumber))))&&((this.featuresOrientationSouth == rhs.featuresOrientationSouth)||((this.featuresOrientationSouth!= null)&&this.featuresOrientationSouth.equals(rhs.featuresOrientationSouth))))&&((this.featuresParkingAvailable == rhs.featuresParkingAvailable)||((this.featuresParkingAvailable!= null)&&this.featuresParkingAvailable.equals(rhs.featuresParkingAvailable))))&&((this.featuresGarden == rhs.featuresGarden)||((this.featuresGarden!= null)&&this.featuresGarden.equals(rhs.featuresGarden))))&&((this.featuresPenthouse == rhs.featuresPenthouse)||((this.featuresPenthouse!= null)&&this.featuresPenthouse.equals(rhs.featuresPenthouse))))&&((this.featuresConservation == rhs.featuresConservation)||((this.featuresConservation!= null)&&this.featuresConservation.equals(rhs.featuresConservation))))&&((this.featuresChimney == rhs.featuresChimney)||((this.featuresChimney!= null)&&this.featuresChimney.equals(rhs.featuresChimney))))&&((this.featuresLiftAvailable == rhs.featuresLiftAvailable)||((this.featuresLiftAvailable!= null)&&this.featuresLiftAvailable.equals(rhs.featuresLiftAvailable))))&&((this.featuresAreaUsable == rhs.featuresAreaUsable)||((this.featuresAreaUsable!= null)&&this.featuresAreaUsable.equals(rhs.featuresAreaUsable))))&&((this.featuresEnergyCertificateLaw == rhs.featuresEnergyCertificateLaw)||((this.featuresEnergyCertificateLaw!= null)&&this.featuresEnergyCertificateLaw.equals(rhs.featuresEnergyCertificateLaw))))&&((this.featuresFloorsBuilding == rhs.featuresFloorsBuilding)||((this.featuresFloorsBuilding!= null)&&this.featuresFloorsBuilding.equals(rhs.featuresFloorsBuilding))))&&((this.featuresDuplex == rhs.featuresDuplex)||((this.featuresDuplex!= null)&&this.featuresDuplex.equals(rhs.featuresDuplex))))&&((this.featuresPetsAllowed == rhs.featuresPetsAllowed)||((this.featuresPetsAllowed!= null)&&this.featuresPetsAllowed.equals(rhs.featuresPetsAllowed))))&&((this.featuresPool == rhs.featuresPool)||((this.featuresPool!= null)&&this.featuresPool.equals(rhs.featuresPool))))&&((this.featuresStorage == rhs.featuresStorage)||((this.featuresStorage!= null)&&this.featuresStorage.equals(rhs.featuresStorage))))&&((this.featuresHeatingType == rhs.featuresHeatingType)||((this.featuresHeatingType!= null)&&this.featuresHeatingType.equals(rhs.featuresHeatingType))))&&((this.featuresTerrace == rhs.featuresTerrace)||((this.featuresTerrace!= null)&&this.featuresTerrace.equals(rhs.featuresTerrace))))&&((this.featuresRooms == rhs.featuresRooms)||((this.featuresRooms!= null)&&this.featuresRooms.equals(rhs.featuresRooms))))&&((this.featuresEnergyCertificatePerformance == rhs.featuresEnergyCertificatePerformance)||((this.featuresEnergyCertificatePerformance!= null)&&this.featuresEnergyCertificatePerformance.equals(rhs.featuresEnergyCertificatePerformance))))&&((this.featuresConditionedAir == rhs.featuresConditionedAir)||((this.featuresConditionedAir!= null)&&this.featuresConditionedAir.equals(rhs.featuresConditionedAir))))&&((this.featuresOrientationWest == rhs.featuresOrientationWest)||((this.featuresOrientationWest!= null)&&this.featuresOrientationWest.equals(rhs.featuresOrientationWest))))&&((this.featuresBedroomNumber == rhs.featuresBedroomNumber)||((this.featuresBedroomNumber!= null)&&this.featuresBedroomNumber.equals(rhs.featuresBedroomNumber))))&&((this.featuresBalcony == rhs.featuresBalcony)||((this.featuresBalcony!= null)&&this.featuresBalcony.equals(rhs.featuresBalcony))))&&((this.featuresFloorsInTop == rhs.featuresFloorsInTop)||((this.featuresFloorsInTop!= null)&&this.featuresFloorsInTop.equals(rhs.featuresFloorsInTop))))&&((this.featuresBuiltYear == rhs.featuresBuiltYear)||((this.featuresBuiltYear!= null)&&this.featuresBuiltYear.equals(rhs.featuresBuiltYear))))&&((this.featuresWardrobes == rhs.featuresWardrobes)||((this.featuresWardrobes!= null)&&this.featuresWardrobes.equals(rhs.featuresWardrobes))))&&((this.featuresOrientationEast == rhs.featuresOrientationEast)||((this.featuresOrientationEast!= null)&&this.featuresOrientationEast.equals(rhs.featuresOrientationEast))))&&((this.featuresDoorman == rhs.featuresDoorman)||((this.featuresDoorman!= null)&&this.featuresDoorman.equals(rhs.featuresDoorman))))&&((this.featuresStudio == rhs.featuresStudio)||((this.featuresStudio!= null)&&this.featuresStudio.equals(rhs.featuresStudio))))&&((this.featuresEquippedWithFurniture == rhs.featuresEquippedWithFurniture)||((this.featuresEquippedWithFurniture!= null)&&this.featuresEquippedWithFurniture.equals(rhs.featuresEquippedWithFurniture))));
    }

    public enum FeaturesHeatingType {

        CENTRAL_GAS("centralGas"),
        CENTRAL_FUEL_OIL("centralFuelOil"),
        CENTRAL_OTHER("centralOther"),
        INDIVIDUAL_GAS("individualGas"),
        INDIVIDUAL_PROPANE_BUTANE("individualPropaneButane"),
        INDIVIDUAL_ELECTRIC("individualElectric"),
        INDIVIDUAL_AIR_CONDITIONING_HEAT_PUMP("individualAirConditioningHeatPump"),
        INDIVIDUAL_OTHER("individualOther"),
        NO_HEATING("noHeating");
        private final String value;
        private final static Map<String, Homes.FeaturesHeatingType> CONSTANTS = new HashMap<String, Homes.FeaturesHeatingType>();

        static {
            for (Homes.FeaturesHeatingType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private FeaturesHeatingType(String value) {
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
        public static Homes.FeaturesHeatingType fromValue(String value) {
            Homes.FeaturesHeatingType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum FeaturesType {

        FLAT("flat"),
        HOUSE("house"),
        HOUSE_ANDAR_MORADIA("house_andar_moradia"),
        HOUSE_INDEPENDENT("house_independent"),
        HOUSE_SEMIDETACHED("house_semidetached"),
        HOUSE_TERRACED("house_terraced"),
        HOUSE_VILLA("house_villa"),
        RUSTIC("rustic"),
        RUSTIC_HOUSE("rustic_house"),
        RUSTIC_VILLAGE("rustic_village"),
        RUSTIC_CASTLE("rustic_castle"),
        RUSTIC_PALACE("rustic_palace"),
        RUSTIC_BAITA("rustic_baita"),
        RUSTIC_RURAL("rustic_rural"),
        RUSTIC_CASALECASCINA("rustic_casalecascina"),
        RUSTIC_CASERON("rustic_caseron"),
        RUSTIC_CORTIJO("rustic_cortijo"),
        RUSTIC_MASIA("rustic_masia"),
        RUSTIC_MASSERIA("rustic_masseria"),
        RUSTIC_MOINHO("rustic_moinho"),
        RUSTIC_MONTEALENTEJANO("rustic_montealentejano"),
        RUSTIC_QUINTA("rustic_quinta"),
        RUSTIC_SOLAR("rustic_solar"),
        RUSTIC_TERRERA("rustic_terrera"),
        RUSTIC_TORRE("rustic_torre"),
        RUSTIC_TRULLO("rustic_trullo");
        private final String value;
        private final static Map<String, Homes.FeaturesType> CONSTANTS = new HashMap<String, Homes.FeaturesType>();

        static {
            for (Homes.FeaturesType c: values()) {
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
        public static Homes.FeaturesType fromValue(String value) {
            Homes.FeaturesType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum FeaturesWindowsLocation {

        INTERIOR("interior"),
        EXTERIOR("exterior");
        private final String value;
        private final static Map<String, Homes.FeaturesWindowsLocation> CONSTANTS = new HashMap<String, Homes.FeaturesWindowsLocation>();

        static {
            for (Homes.FeaturesWindowsLocation c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private FeaturesWindowsLocation(String value) {
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
        public static Homes.FeaturesWindowsLocation fromValue(String value) {
            Homes.FeaturesWindowsLocation constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
