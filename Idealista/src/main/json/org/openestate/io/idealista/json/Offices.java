
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
 * Offices Object
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "featuresType",
    "featuresAccessControl",
    "featuresAreaConstructed",
    "featuresAreaUsable",
    "featuresBathroomInside",
    "featuresBathroomNumber",
    "featuresBathroomType",
    "featuresBuiltYear",
    "featuresBuildingAdapted",
    "featuresConditionedAir",
    "featuresConditionedAirType",
    "featuresConservation",
    "featuresDoorman",
    "featuresEmergencyExit",
    "featuresEmergencyLights",
    "featuresEnergyCertificateRating",
    "featuresEnergyCertificatePerformance",
    "featuresEnergyCertificateType",
    "featuresEnergyCertificateLaw",
    "featuresEquippedKitchen",
    "featuresExtinguishers",
    "featuresFireDetectors",
    "featuresFireDoors",
    "featuresFloorsBuilding",
    "featuresFloorsProperty",
    "featuresHeating",
    "featuresHotWater",
    "featuresLiftNumber",
    "featuresOfficeBuilding",
    "featuresOrientationEast",
    "featuresOrientationNorth",
    "featuresOrientationSouth",
    "featuresOrientationWest",
    "featuresParkingSpacesNumber",
    "featuresRoomsSplitted",
    "featuresSecurityAlarm",
    "featuresSecurityDoor",
    "featuresSecuritySystem",
    "featuresSprinklers",
    "featuresSuspendedCeiling",
    "featuresSuspendedFloor",
    "featuresStorage",
    "featuresWindowsDouble",
    "featuresWindowsLocation"
})
public class Offices implements Serializable
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
    private Offices.FeaturesType featuresType;
    /**
     * access control
     * <p>
     * availability of access control system
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresAccessControl")
    @JsonPropertyDescription("availability of access control system")
    private Boolean featuresAccessControl;
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
    @JsonProperty("featuresAreaUsable")
    @DecimalMin("1")
    @DecimalMax("99999")
    private BigInteger featuresAreaUsable;
    /**
     * bathroom inside
     * <p>
     * bathroom inside the property is available
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresBathroomInside")
    @JsonPropertyDescription("bathroom inside the property is available")
    private Boolean featuresBathroomInside;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresBathroomNumber")
    @DecimalMin("1")
    @DecimalMax("99")
    private BigInteger featuresBathroomNumber;
    /**
     * bathroom type
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresBathroomType")
    private Offices.FeaturesBathroomType featuresBathroomType;
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
     * adapted building
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresBuildingAdapted")
    private Boolean featuresBuildingAdapted;
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
     * air conditioning type
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresConditionedAirType")
    private Offices.FeaturesConditionedAirType featuresConditionedAirType;
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
     * emergency exit
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresEmergencyExit")
    private Boolean featuresEmergencyExit;
    /**
     * emergency lights
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresEmergencyLights")
    private Boolean featuresEmergencyLights;
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
    private org.openestate.io.idealista.json.Building.FeaturesEnergyCertificateType featuresEnergyCertificateType;
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
     * extinguishers
     * <p>
     * extinguishers availability
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresExtinguishers")
    @JsonPropertyDescription("extinguishers availability")
    private Boolean featuresExtinguishers;
    /**
     * fire detectors
     * <p>
     * availability of fire detectors
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresFireDetectors")
    @JsonPropertyDescription("availability of fire detectors")
    private Boolean featuresFireDetectors;
    /**
     * fire doors
     * <p>
     * availability of fire doors
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresFireDoors")
    @JsonPropertyDescription("availability of fire doors")
    private Boolean featuresFireDoors;
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
    @JsonProperty("featuresFloorsProperty")
    @DecimalMin("1")
    @DecimalMax("99")
    private BigInteger featuresFloorsProperty;
    /**
     * heating
     * <p>
     * heating availability
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresHeating")
    @JsonPropertyDescription("heating availability")
    private Boolean featuresHeating;
    /**
     * hot water
     * <p>
     * hot water availability
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresHotWater")
    @JsonPropertyDescription("hot water availability")
    private Boolean featuresHotWater;
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
     * office building
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresOfficeBuilding")
    private Boolean featuresOfficeBuilding;
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
     * rooms splitted
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresRoomsSplitted")
    private Offices.FeaturesRoomsSplitted featuresRoomsSplitted;
    /**
     * security alarm system
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresSecurityAlarm")
    private Boolean featuresSecurityAlarm;
    /**
     * security door
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresSecurityDoor")
    private Boolean featuresSecurityDoor;
    /**
     * security system
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresSecuritySystem")
    private Boolean featuresSecuritySystem;
    /**
     * sprinklers
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresSprinklers")
    private Boolean featuresSprinklers;
    /**
     * suspending ceiling
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresSuspendedCeiling")
    private Boolean featuresSuspendedCeiling;
    /**
     * suspending floor
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresSuspendedFloor")
    private Boolean featuresSuspendedFloor;
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
     * double windows
     * <p>
     * double pane windows availability
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresWindowsDouble")
    @JsonPropertyDescription("double pane windows availability")
    private Boolean featuresWindowsDouble;
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
    private org.openestate.io.idealista.json.Homes.FeaturesWindowsLocation featuresWindowsLocation;
    private final static long serialVersionUID = -8658410298712750153L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Offices() {
    }

    /**
     * 
     * @param featuresType
     * @param featuresAreaConstructed
     */
    public Offices(Offices.FeaturesType featuresType, BigInteger featuresAreaConstructed) {
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
    public Offices.FeaturesType getFeaturesType() {
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
    public void setFeaturesType(Offices.FeaturesType featuresType) {
        this.featuresType = featuresType;
    }

    /**
     * access control
     * <p>
     * availability of access control system
     * 
     */
    @JsonProperty("featuresAccessControl")
    public Boolean getFeaturesAccessControl() {
        return featuresAccessControl;
    }

    /**
     * access control
     * <p>
     * availability of access control system
     * 
     */
    @JsonProperty("featuresAccessControl")
    public void setFeaturesAccessControl(Boolean featuresAccessControl) {
        this.featuresAccessControl = featuresAccessControl;
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

    @JsonProperty("featuresAreaUsable")
    public BigInteger getFeaturesAreaUsable() {
        return featuresAreaUsable;
    }

    @JsonProperty("featuresAreaUsable")
    public void setFeaturesAreaUsable(BigInteger featuresAreaUsable) {
        this.featuresAreaUsable = featuresAreaUsable;
    }

    /**
     * bathroom inside
     * <p>
     * bathroom inside the property is available
     * 
     */
    @JsonProperty("featuresBathroomInside")
    public Boolean getFeaturesBathroomInside() {
        return featuresBathroomInside;
    }

    /**
     * bathroom inside
     * <p>
     * bathroom inside the property is available
     * 
     */
    @JsonProperty("featuresBathroomInside")
    public void setFeaturesBathroomInside(Boolean featuresBathroomInside) {
        this.featuresBathroomInside = featuresBathroomInside;
    }

    @JsonProperty("featuresBathroomNumber")
    public BigInteger getFeaturesBathroomNumber() {
        return featuresBathroomNumber;
    }

    @JsonProperty("featuresBathroomNumber")
    public void setFeaturesBathroomNumber(BigInteger featuresBathroomNumber) {
        this.featuresBathroomNumber = featuresBathroomNumber;
    }

    /**
     * bathroom type
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresBathroomType")
    public Offices.FeaturesBathroomType getFeaturesBathroomType() {
        return featuresBathroomType;
    }

    /**
     * bathroom type
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresBathroomType")
    public void setFeaturesBathroomType(Offices.FeaturesBathroomType featuresBathroomType) {
        this.featuresBathroomType = featuresBathroomType;
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
     * adapted building
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresBuildingAdapted")
    public Boolean getFeaturesBuildingAdapted() {
        return featuresBuildingAdapted;
    }

    /**
     * adapted building
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresBuildingAdapted")
    public void setFeaturesBuildingAdapted(Boolean featuresBuildingAdapted) {
        this.featuresBuildingAdapted = featuresBuildingAdapted;
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
     * air conditioning type
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresConditionedAirType")
    public Offices.FeaturesConditionedAirType getFeaturesConditionedAirType() {
        return featuresConditionedAirType;
    }

    /**
     * air conditioning type
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresConditionedAirType")
    public void setFeaturesConditionedAirType(Offices.FeaturesConditionedAirType featuresConditionedAirType) {
        this.featuresConditionedAirType = featuresConditionedAirType;
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
     * emergency exit
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresEmergencyExit")
    public Boolean getFeaturesEmergencyExit() {
        return featuresEmergencyExit;
    }

    /**
     * emergency exit
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresEmergencyExit")
    public void setFeaturesEmergencyExit(Boolean featuresEmergencyExit) {
        this.featuresEmergencyExit = featuresEmergencyExit;
    }

    /**
     * emergency lights
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresEmergencyLights")
    public Boolean getFeaturesEmergencyLights() {
        return featuresEmergencyLights;
    }

    /**
     * emergency lights
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresEmergencyLights")
    public void setFeaturesEmergencyLights(Boolean featuresEmergencyLights) {
        this.featuresEmergencyLights = featuresEmergencyLights;
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
     * extinguishers
     * <p>
     * extinguishers availability
     * 
     */
    @JsonProperty("featuresExtinguishers")
    public Boolean getFeaturesExtinguishers() {
        return featuresExtinguishers;
    }

    /**
     * extinguishers
     * <p>
     * extinguishers availability
     * 
     */
    @JsonProperty("featuresExtinguishers")
    public void setFeaturesExtinguishers(Boolean featuresExtinguishers) {
        this.featuresExtinguishers = featuresExtinguishers;
    }

    /**
     * fire detectors
     * <p>
     * availability of fire detectors
     * 
     */
    @JsonProperty("featuresFireDetectors")
    public Boolean getFeaturesFireDetectors() {
        return featuresFireDetectors;
    }

    /**
     * fire detectors
     * <p>
     * availability of fire detectors
     * 
     */
    @JsonProperty("featuresFireDetectors")
    public void setFeaturesFireDetectors(Boolean featuresFireDetectors) {
        this.featuresFireDetectors = featuresFireDetectors;
    }

    /**
     * fire doors
     * <p>
     * availability of fire doors
     * 
     */
    @JsonProperty("featuresFireDoors")
    public Boolean getFeaturesFireDoors() {
        return featuresFireDoors;
    }

    /**
     * fire doors
     * <p>
     * availability of fire doors
     * 
     */
    @JsonProperty("featuresFireDoors")
    public void setFeaturesFireDoors(Boolean featuresFireDoors) {
        this.featuresFireDoors = featuresFireDoors;
    }

    @JsonProperty("featuresFloorsBuilding")
    public BigInteger getFeaturesFloorsBuilding() {
        return featuresFloorsBuilding;
    }

    @JsonProperty("featuresFloorsBuilding")
    public void setFeaturesFloorsBuilding(BigInteger featuresFloorsBuilding) {
        this.featuresFloorsBuilding = featuresFloorsBuilding;
    }

    @JsonProperty("featuresFloorsProperty")
    public BigInteger getFeaturesFloorsProperty() {
        return featuresFloorsProperty;
    }

    @JsonProperty("featuresFloorsProperty")
    public void setFeaturesFloorsProperty(BigInteger featuresFloorsProperty) {
        this.featuresFloorsProperty = featuresFloorsProperty;
    }

    /**
     * heating
     * <p>
     * heating availability
     * 
     */
    @JsonProperty("featuresHeating")
    public Boolean getFeaturesHeating() {
        return featuresHeating;
    }

    /**
     * heating
     * <p>
     * heating availability
     * 
     */
    @JsonProperty("featuresHeating")
    public void setFeaturesHeating(Boolean featuresHeating) {
        this.featuresHeating = featuresHeating;
    }

    /**
     * hot water
     * <p>
     * hot water availability
     * 
     */
    @JsonProperty("featuresHotWater")
    public Boolean getFeaturesHotWater() {
        return featuresHotWater;
    }

    /**
     * hot water
     * <p>
     * hot water availability
     * 
     */
    @JsonProperty("featuresHotWater")
    public void setFeaturesHotWater(Boolean featuresHotWater) {
        this.featuresHotWater = featuresHotWater;
    }

    @JsonProperty("featuresLiftNumber")
    public BigInteger getFeaturesLiftNumber() {
        return featuresLiftNumber;
    }

    @JsonProperty("featuresLiftNumber")
    public void setFeaturesLiftNumber(BigInteger featuresLiftNumber) {
        this.featuresLiftNumber = featuresLiftNumber;
    }

    /**
     * office building
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresOfficeBuilding")
    public Boolean getFeaturesOfficeBuilding() {
        return featuresOfficeBuilding;
    }

    /**
     * office building
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresOfficeBuilding")
    public void setFeaturesOfficeBuilding(Boolean featuresOfficeBuilding) {
        this.featuresOfficeBuilding = featuresOfficeBuilding;
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

    @JsonProperty("featuresParkingSpacesNumber")
    public BigInteger getFeaturesParkingSpacesNumber() {
        return featuresParkingSpacesNumber;
    }

    @JsonProperty("featuresParkingSpacesNumber")
    public void setFeaturesParkingSpacesNumber(BigInteger featuresParkingSpacesNumber) {
        this.featuresParkingSpacesNumber = featuresParkingSpacesNumber;
    }

    /**
     * rooms splitted
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresRoomsSplitted")
    public Offices.FeaturesRoomsSplitted getFeaturesRoomsSplitted() {
        return featuresRoomsSplitted;
    }

    /**
     * rooms splitted
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresRoomsSplitted")
    public void setFeaturesRoomsSplitted(Offices.FeaturesRoomsSplitted featuresRoomsSplitted) {
        this.featuresRoomsSplitted = featuresRoomsSplitted;
    }

    /**
     * security alarm system
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSecurityAlarm")
    public Boolean getFeaturesSecurityAlarm() {
        return featuresSecurityAlarm;
    }

    /**
     * security alarm system
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSecurityAlarm")
    public void setFeaturesSecurityAlarm(Boolean featuresSecurityAlarm) {
        this.featuresSecurityAlarm = featuresSecurityAlarm;
    }

    /**
     * security door
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSecurityDoor")
    public Boolean getFeaturesSecurityDoor() {
        return featuresSecurityDoor;
    }

    /**
     * security door
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSecurityDoor")
    public void setFeaturesSecurityDoor(Boolean featuresSecurityDoor) {
        this.featuresSecurityDoor = featuresSecurityDoor;
    }

    /**
     * security system
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSecuritySystem")
    public Boolean getFeaturesSecuritySystem() {
        return featuresSecuritySystem;
    }

    /**
     * security system
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSecuritySystem")
    public void setFeaturesSecuritySystem(Boolean featuresSecuritySystem) {
        this.featuresSecuritySystem = featuresSecuritySystem;
    }

    /**
     * sprinklers
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSprinklers")
    public Boolean getFeaturesSprinklers() {
        return featuresSprinklers;
    }

    /**
     * sprinklers
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSprinklers")
    public void setFeaturesSprinklers(Boolean featuresSprinklers) {
        this.featuresSprinklers = featuresSprinklers;
    }

    /**
     * suspending ceiling
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSuspendedCeiling")
    public Boolean getFeaturesSuspendedCeiling() {
        return featuresSuspendedCeiling;
    }

    /**
     * suspending ceiling
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSuspendedCeiling")
    public void setFeaturesSuspendedCeiling(Boolean featuresSuspendedCeiling) {
        this.featuresSuspendedCeiling = featuresSuspendedCeiling;
    }

    /**
     * suspending floor
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSuspendedFloor")
    public Boolean getFeaturesSuspendedFloor() {
        return featuresSuspendedFloor;
    }

    /**
     * suspending floor
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSuspendedFloor")
    public void setFeaturesSuspendedFloor(Boolean featuresSuspendedFloor) {
        this.featuresSuspendedFloor = featuresSuspendedFloor;
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
     * double windows
     * <p>
     * double pane windows availability
     * 
     */
    @JsonProperty("featuresWindowsDouble")
    public Boolean getFeaturesWindowsDouble() {
        return featuresWindowsDouble;
    }

    /**
     * double windows
     * <p>
     * double pane windows availability
     * 
     */
    @JsonProperty("featuresWindowsDouble")
    public void setFeaturesWindowsDouble(Boolean featuresWindowsDouble) {
        this.featuresWindowsDouble = featuresWindowsDouble;
    }

    /**
     * windows location
     * <p>
     * internal / external flat based on windows view. Only available for Spain.
     * 
     */
    @JsonProperty("featuresWindowsLocation")
    public org.openestate.io.idealista.json.Homes.FeaturesWindowsLocation getFeaturesWindowsLocation() {
        return featuresWindowsLocation;
    }

    /**
     * windows location
     * <p>
     * internal / external flat based on windows view. Only available for Spain.
     * 
     */
    @JsonProperty("featuresWindowsLocation")
    public void setFeaturesWindowsLocation(org.openestate.io.idealista.json.Homes.FeaturesWindowsLocation featuresWindowsLocation) {
        this.featuresWindowsLocation = featuresWindowsLocation;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Offices.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("featuresType");
        sb.append('=');
        sb.append(((this.featuresType == null)?"<null>":this.featuresType));
        sb.append(',');
        sb.append("featuresAccessControl");
        sb.append('=');
        sb.append(((this.featuresAccessControl == null)?"<null>":this.featuresAccessControl));
        sb.append(',');
        sb.append("featuresAreaConstructed");
        sb.append('=');
        sb.append(((this.featuresAreaConstructed == null)?"<null>":this.featuresAreaConstructed));
        sb.append(',');
        sb.append("featuresAreaUsable");
        sb.append('=');
        sb.append(((this.featuresAreaUsable == null)?"<null>":this.featuresAreaUsable));
        sb.append(',');
        sb.append("featuresBathroomInside");
        sb.append('=');
        sb.append(((this.featuresBathroomInside == null)?"<null>":this.featuresBathroomInside));
        sb.append(',');
        sb.append("featuresBathroomNumber");
        sb.append('=');
        sb.append(((this.featuresBathroomNumber == null)?"<null>":this.featuresBathroomNumber));
        sb.append(',');
        sb.append("featuresBathroomType");
        sb.append('=');
        sb.append(((this.featuresBathroomType == null)?"<null>":this.featuresBathroomType));
        sb.append(',');
        sb.append("featuresBuiltYear");
        sb.append('=');
        sb.append(((this.featuresBuiltYear == null)?"<null>":this.featuresBuiltYear));
        sb.append(',');
        sb.append("featuresBuildingAdapted");
        sb.append('=');
        sb.append(((this.featuresBuildingAdapted == null)?"<null>":this.featuresBuildingAdapted));
        sb.append(',');
        sb.append("featuresConditionedAir");
        sb.append('=');
        sb.append(((this.featuresConditionedAir == null)?"<null>":this.featuresConditionedAir));
        sb.append(',');
        sb.append("featuresConditionedAirType");
        sb.append('=');
        sb.append(((this.featuresConditionedAirType == null)?"<null>":this.featuresConditionedAirType));
        sb.append(',');
        sb.append("featuresConservation");
        sb.append('=');
        sb.append(((this.featuresConservation == null)?"<null>":this.featuresConservation));
        sb.append(',');
        sb.append("featuresDoorman");
        sb.append('=');
        sb.append(((this.featuresDoorman == null)?"<null>":this.featuresDoorman));
        sb.append(',');
        sb.append("featuresEmergencyExit");
        sb.append('=');
        sb.append(((this.featuresEmergencyExit == null)?"<null>":this.featuresEmergencyExit));
        sb.append(',');
        sb.append("featuresEmergencyLights");
        sb.append('=');
        sb.append(((this.featuresEmergencyLights == null)?"<null>":this.featuresEmergencyLights));
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
        sb.append("featuresEquippedKitchen");
        sb.append('=');
        sb.append(((this.featuresEquippedKitchen == null)?"<null>":this.featuresEquippedKitchen));
        sb.append(',');
        sb.append("featuresExtinguishers");
        sb.append('=');
        sb.append(((this.featuresExtinguishers == null)?"<null>":this.featuresExtinguishers));
        sb.append(',');
        sb.append("featuresFireDetectors");
        sb.append('=');
        sb.append(((this.featuresFireDetectors == null)?"<null>":this.featuresFireDetectors));
        sb.append(',');
        sb.append("featuresFireDoors");
        sb.append('=');
        sb.append(((this.featuresFireDoors == null)?"<null>":this.featuresFireDoors));
        sb.append(',');
        sb.append("featuresFloorsBuilding");
        sb.append('=');
        sb.append(((this.featuresFloorsBuilding == null)?"<null>":this.featuresFloorsBuilding));
        sb.append(',');
        sb.append("featuresFloorsProperty");
        sb.append('=');
        sb.append(((this.featuresFloorsProperty == null)?"<null>":this.featuresFloorsProperty));
        sb.append(',');
        sb.append("featuresHeating");
        sb.append('=');
        sb.append(((this.featuresHeating == null)?"<null>":this.featuresHeating));
        sb.append(',');
        sb.append("featuresHotWater");
        sb.append('=');
        sb.append(((this.featuresHotWater == null)?"<null>":this.featuresHotWater));
        sb.append(',');
        sb.append("featuresLiftNumber");
        sb.append('=');
        sb.append(((this.featuresLiftNumber == null)?"<null>":this.featuresLiftNumber));
        sb.append(',');
        sb.append("featuresOfficeBuilding");
        sb.append('=');
        sb.append(((this.featuresOfficeBuilding == null)?"<null>":this.featuresOfficeBuilding));
        sb.append(',');
        sb.append("featuresOrientationEast");
        sb.append('=');
        sb.append(((this.featuresOrientationEast == null)?"<null>":this.featuresOrientationEast));
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
        sb.append("featuresParkingSpacesNumber");
        sb.append('=');
        sb.append(((this.featuresParkingSpacesNumber == null)?"<null>":this.featuresParkingSpacesNumber));
        sb.append(',');
        sb.append("featuresRoomsSplitted");
        sb.append('=');
        sb.append(((this.featuresRoomsSplitted == null)?"<null>":this.featuresRoomsSplitted));
        sb.append(',');
        sb.append("featuresSecurityAlarm");
        sb.append('=');
        sb.append(((this.featuresSecurityAlarm == null)?"<null>":this.featuresSecurityAlarm));
        sb.append(',');
        sb.append("featuresSecurityDoor");
        sb.append('=');
        sb.append(((this.featuresSecurityDoor == null)?"<null>":this.featuresSecurityDoor));
        sb.append(',');
        sb.append("featuresSecuritySystem");
        sb.append('=');
        sb.append(((this.featuresSecuritySystem == null)?"<null>":this.featuresSecuritySystem));
        sb.append(',');
        sb.append("featuresSprinklers");
        sb.append('=');
        sb.append(((this.featuresSprinklers == null)?"<null>":this.featuresSprinklers));
        sb.append(',');
        sb.append("featuresSuspendedCeiling");
        sb.append('=');
        sb.append(((this.featuresSuspendedCeiling == null)?"<null>":this.featuresSuspendedCeiling));
        sb.append(',');
        sb.append("featuresSuspendedFloor");
        sb.append('=');
        sb.append(((this.featuresSuspendedFloor == null)?"<null>":this.featuresSuspendedFloor));
        sb.append(',');
        sb.append("featuresStorage");
        sb.append('=');
        sb.append(((this.featuresStorage == null)?"<null>":this.featuresStorage));
        sb.append(',');
        sb.append("featuresWindowsDouble");
        sb.append('=');
        sb.append(((this.featuresWindowsDouble == null)?"<null>":this.featuresWindowsDouble));
        sb.append(',');
        sb.append("featuresWindowsLocation");
        sb.append('=');
        sb.append(((this.featuresWindowsLocation == null)?"<null>":this.featuresWindowsLocation));
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
        result = ((result* 31)+((this.featuresFireDetectors == null)? 0 :this.featuresFireDetectors.hashCode()));
        result = ((result* 31)+((this.featuresOrientationNorth == null)? 0 :this.featuresOrientationNorth.hashCode()));
        result = ((result* 31)+((this.featuresSuspendedCeiling == null)? 0 :this.featuresSuspendedCeiling.hashCode()));
        result = ((result* 31)+((this.featuresWindowsLocation == null)? 0 :this.featuresWindowsLocation.hashCode()));
        result = ((result* 31)+((this.featuresFireDoors == null)? 0 :this.featuresFireDoors.hashCode()));
        result = ((result* 31)+((this.featuresEquippedKitchen == null)? 0 :this.featuresEquippedKitchen.hashCode()));
        result = ((result* 31)+((this.featuresEnergyCertificateRating == null)? 0 :this.featuresEnergyCertificateRating.hashCode()));
        result = ((result* 31)+((this.featuresType == null)? 0 :this.featuresType.hashCode()));
        result = ((result* 31)+((this.featuresEnergyCertificateType == null)? 0 :this.featuresEnergyCertificateType.hashCode()));
        result = ((result* 31)+((this.featuresAreaConstructed == null)? 0 :this.featuresAreaConstructed.hashCode()));
        result = ((result* 31)+((this.featuresSecurityDoor == null)? 0 :this.featuresSecurityDoor.hashCode()));
        result = ((result* 31)+((this.featuresBathroomNumber == null)? 0 :this.featuresBathroomNumber.hashCode()));
        result = ((result* 31)+((this.featuresOrientationSouth == null)? 0 :this.featuresOrientationSouth.hashCode()));
        result = ((result* 31)+((this.featuresHotWater == null)? 0 :this.featuresHotWater.hashCode()));
        result = ((result* 31)+((this.featuresSecurityAlarm == null)? 0 :this.featuresSecurityAlarm.hashCode()));
        result = ((result* 31)+((this.featuresWindowsDouble == null)? 0 :this.featuresWindowsDouble.hashCode()));
        result = ((result* 31)+((this.featuresConservation == null)? 0 :this.featuresConservation.hashCode()));
        result = ((result* 31)+((this.featuresSuspendedFloor == null)? 0 :this.featuresSuspendedFloor.hashCode()));
        result = ((result* 31)+((this.featuresEmergencyLights == null)? 0 :this.featuresEmergencyLights.hashCode()));
        result = ((result* 31)+((this.featuresLiftNumber == null)? 0 :this.featuresLiftNumber.hashCode()));
        result = ((result* 31)+((this.featuresBuildingAdapted == null)? 0 :this.featuresBuildingAdapted.hashCode()));
        result = ((result* 31)+((this.featuresConditionedAirType == null)? 0 :this.featuresConditionedAirType.hashCode()));
        result = ((result* 31)+((this.featuresParkingSpacesNumber == null)? 0 :this.featuresParkingSpacesNumber.hashCode()));
        result = ((result* 31)+((this.featuresAreaUsable == null)? 0 :this.featuresAreaUsable.hashCode()));
        result = ((result* 31)+((this.featuresEnergyCertificateLaw == null)? 0 :this.featuresEnergyCertificateLaw.hashCode()));
        result = ((result* 31)+((this.featuresExtinguishers == null)? 0 :this.featuresExtinguishers.hashCode()));
        result = ((result* 31)+((this.featuresFloorsBuilding == null)? 0 :this.featuresFloorsBuilding.hashCode()));
        result = ((result* 31)+((this.featuresOfficeBuilding == null)? 0 :this.featuresOfficeBuilding.hashCode()));
        result = ((result* 31)+((this.featuresStorage == null)? 0 :this.featuresStorage.hashCode()));
        result = ((result* 31)+((this.featuresBathroomType == null)? 0 :this.featuresBathroomType.hashCode()));
        result = ((result* 31)+((this.featuresSecuritySystem == null)? 0 :this.featuresSecuritySystem.hashCode()));
        result = ((result* 31)+((this.featuresAccessControl == null)? 0 :this.featuresAccessControl.hashCode()));
        result = ((result* 31)+((this.featuresEnergyCertificatePerformance == null)? 0 :this.featuresEnergyCertificatePerformance.hashCode()));
        result = ((result* 31)+((this.featuresHeating == null)? 0 :this.featuresHeating.hashCode()));
        result = ((result* 31)+((this.featuresConditionedAir == null)? 0 :this.featuresConditionedAir.hashCode()));
        result = ((result* 31)+((this.featuresOrientationWest == null)? 0 :this.featuresOrientationWest.hashCode()));
        result = ((result* 31)+((this.featuresFloorsProperty == null)? 0 :this.featuresFloorsProperty.hashCode()));
        result = ((result* 31)+((this.featuresBathroomInside == null)? 0 :this.featuresBathroomInside.hashCode()));
        result = ((result* 31)+((this.featuresBuiltYear == null)? 0 :this.featuresBuiltYear.hashCode()));
        result = ((result* 31)+((this.featuresSprinklers == null)? 0 :this.featuresSprinklers.hashCode()));
        result = ((result* 31)+((this.featuresOrientationEast == null)? 0 :this.featuresOrientationEast.hashCode()));
        result = ((result* 31)+((this.featuresDoorman == null)? 0 :this.featuresDoorman.hashCode()));
        result = ((result* 31)+((this.featuresEmergencyExit == null)? 0 :this.featuresEmergencyExit.hashCode()));
        result = ((result* 31)+((this.featuresRoomsSplitted == null)? 0 :this.featuresRoomsSplitted.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Offices) == false) {
            return false;
        }
        Offices rhs = ((Offices) other);
        return (((((((((((((((((((((((((((((((((((((((((((((this.featuresFireDetectors == rhs.featuresFireDetectors)||((this.featuresFireDetectors!= null)&&this.featuresFireDetectors.equals(rhs.featuresFireDetectors)))&&((this.featuresOrientationNorth == rhs.featuresOrientationNorth)||((this.featuresOrientationNorth!= null)&&this.featuresOrientationNorth.equals(rhs.featuresOrientationNorth))))&&((this.featuresSuspendedCeiling == rhs.featuresSuspendedCeiling)||((this.featuresSuspendedCeiling!= null)&&this.featuresSuspendedCeiling.equals(rhs.featuresSuspendedCeiling))))&&((this.featuresWindowsLocation == rhs.featuresWindowsLocation)||((this.featuresWindowsLocation!= null)&&this.featuresWindowsLocation.equals(rhs.featuresWindowsLocation))))&&((this.featuresFireDoors == rhs.featuresFireDoors)||((this.featuresFireDoors!= null)&&this.featuresFireDoors.equals(rhs.featuresFireDoors))))&&((this.featuresEquippedKitchen == rhs.featuresEquippedKitchen)||((this.featuresEquippedKitchen!= null)&&this.featuresEquippedKitchen.equals(rhs.featuresEquippedKitchen))))&&((this.featuresEnergyCertificateRating == rhs.featuresEnergyCertificateRating)||((this.featuresEnergyCertificateRating!= null)&&this.featuresEnergyCertificateRating.equals(rhs.featuresEnergyCertificateRating))))&&((this.featuresType == rhs.featuresType)||((this.featuresType!= null)&&this.featuresType.equals(rhs.featuresType))))&&((this.featuresEnergyCertificateType == rhs.featuresEnergyCertificateType)||((this.featuresEnergyCertificateType!= null)&&this.featuresEnergyCertificateType.equals(rhs.featuresEnergyCertificateType))))&&((this.featuresAreaConstructed == rhs.featuresAreaConstructed)||((this.featuresAreaConstructed!= null)&&this.featuresAreaConstructed.equals(rhs.featuresAreaConstructed))))&&((this.featuresSecurityDoor == rhs.featuresSecurityDoor)||((this.featuresSecurityDoor!= null)&&this.featuresSecurityDoor.equals(rhs.featuresSecurityDoor))))&&((this.featuresBathroomNumber == rhs.featuresBathroomNumber)||((this.featuresBathroomNumber!= null)&&this.featuresBathroomNumber.equals(rhs.featuresBathroomNumber))))&&((this.featuresOrientationSouth == rhs.featuresOrientationSouth)||((this.featuresOrientationSouth!= null)&&this.featuresOrientationSouth.equals(rhs.featuresOrientationSouth))))&&((this.featuresHotWater == rhs.featuresHotWater)||((this.featuresHotWater!= null)&&this.featuresHotWater.equals(rhs.featuresHotWater))))&&((this.featuresSecurityAlarm == rhs.featuresSecurityAlarm)||((this.featuresSecurityAlarm!= null)&&this.featuresSecurityAlarm.equals(rhs.featuresSecurityAlarm))))&&((this.featuresWindowsDouble == rhs.featuresWindowsDouble)||((this.featuresWindowsDouble!= null)&&this.featuresWindowsDouble.equals(rhs.featuresWindowsDouble))))&&((this.featuresConservation == rhs.featuresConservation)||((this.featuresConservation!= null)&&this.featuresConservation.equals(rhs.featuresConservation))))&&((this.featuresSuspendedFloor == rhs.featuresSuspendedFloor)||((this.featuresSuspendedFloor!= null)&&this.featuresSuspendedFloor.equals(rhs.featuresSuspendedFloor))))&&((this.featuresEmergencyLights == rhs.featuresEmergencyLights)||((this.featuresEmergencyLights!= null)&&this.featuresEmergencyLights.equals(rhs.featuresEmergencyLights))))&&((this.featuresLiftNumber == rhs.featuresLiftNumber)||((this.featuresLiftNumber!= null)&&this.featuresLiftNumber.equals(rhs.featuresLiftNumber))))&&((this.featuresBuildingAdapted == rhs.featuresBuildingAdapted)||((this.featuresBuildingAdapted!= null)&&this.featuresBuildingAdapted.equals(rhs.featuresBuildingAdapted))))&&((this.featuresConditionedAirType == rhs.featuresConditionedAirType)||((this.featuresConditionedAirType!= null)&&this.featuresConditionedAirType.equals(rhs.featuresConditionedAirType))))&&((this.featuresParkingSpacesNumber == rhs.featuresParkingSpacesNumber)||((this.featuresParkingSpacesNumber!= null)&&this.featuresParkingSpacesNumber.equals(rhs.featuresParkingSpacesNumber))))&&((this.featuresAreaUsable == rhs.featuresAreaUsable)||((this.featuresAreaUsable!= null)&&this.featuresAreaUsable.equals(rhs.featuresAreaUsable))))&&((this.featuresEnergyCertificateLaw == rhs.featuresEnergyCertificateLaw)||((this.featuresEnergyCertificateLaw!= null)&&this.featuresEnergyCertificateLaw.equals(rhs.featuresEnergyCertificateLaw))))&&((this.featuresExtinguishers == rhs.featuresExtinguishers)||((this.featuresExtinguishers!= null)&&this.featuresExtinguishers.equals(rhs.featuresExtinguishers))))&&((this.featuresFloorsBuilding == rhs.featuresFloorsBuilding)||((this.featuresFloorsBuilding!= null)&&this.featuresFloorsBuilding.equals(rhs.featuresFloorsBuilding))))&&((this.featuresOfficeBuilding == rhs.featuresOfficeBuilding)||((this.featuresOfficeBuilding!= null)&&this.featuresOfficeBuilding.equals(rhs.featuresOfficeBuilding))))&&((this.featuresStorage == rhs.featuresStorage)||((this.featuresStorage!= null)&&this.featuresStorage.equals(rhs.featuresStorage))))&&((this.featuresBathroomType == rhs.featuresBathroomType)||((this.featuresBathroomType!= null)&&this.featuresBathroomType.equals(rhs.featuresBathroomType))))&&((this.featuresSecuritySystem == rhs.featuresSecuritySystem)||((this.featuresSecuritySystem!= null)&&this.featuresSecuritySystem.equals(rhs.featuresSecuritySystem))))&&((this.featuresAccessControl == rhs.featuresAccessControl)||((this.featuresAccessControl!= null)&&this.featuresAccessControl.equals(rhs.featuresAccessControl))))&&((this.featuresEnergyCertificatePerformance == rhs.featuresEnergyCertificatePerformance)||((this.featuresEnergyCertificatePerformance!= null)&&this.featuresEnergyCertificatePerformance.equals(rhs.featuresEnergyCertificatePerformance))))&&((this.featuresHeating == rhs.featuresHeating)||((this.featuresHeating!= null)&&this.featuresHeating.equals(rhs.featuresHeating))))&&((this.featuresConditionedAir == rhs.featuresConditionedAir)||((this.featuresConditionedAir!= null)&&this.featuresConditionedAir.equals(rhs.featuresConditionedAir))))&&((this.featuresOrientationWest == rhs.featuresOrientationWest)||((this.featuresOrientationWest!= null)&&this.featuresOrientationWest.equals(rhs.featuresOrientationWest))))&&((this.featuresFloorsProperty == rhs.featuresFloorsProperty)||((this.featuresFloorsProperty!= null)&&this.featuresFloorsProperty.equals(rhs.featuresFloorsProperty))))&&((this.featuresBathroomInside == rhs.featuresBathroomInside)||((this.featuresBathroomInside!= null)&&this.featuresBathroomInside.equals(rhs.featuresBathroomInside))))&&((this.featuresBuiltYear == rhs.featuresBuiltYear)||((this.featuresBuiltYear!= null)&&this.featuresBuiltYear.equals(rhs.featuresBuiltYear))))&&((this.featuresSprinklers == rhs.featuresSprinklers)||((this.featuresSprinklers!= null)&&this.featuresSprinklers.equals(rhs.featuresSprinklers))))&&((this.featuresOrientationEast == rhs.featuresOrientationEast)||((this.featuresOrientationEast!= null)&&this.featuresOrientationEast.equals(rhs.featuresOrientationEast))))&&((this.featuresDoorman == rhs.featuresDoorman)||((this.featuresDoorman!= null)&&this.featuresDoorman.equals(rhs.featuresDoorman))))&&((this.featuresEmergencyExit == rhs.featuresEmergencyExit)||((this.featuresEmergencyExit!= null)&&this.featuresEmergencyExit.equals(rhs.featuresEmergencyExit))))&&((this.featuresRoomsSplitted == rhs.featuresRoomsSplitted)||((this.featuresRoomsSplitted!= null)&&this.featuresRoomsSplitted.equals(rhs.featuresRoomsSplitted))));
    }

    public enum FeaturesBathroomType {

        TOILETS("toilets"),
        FULL_EQUIPED("fullEquiped"),
        BOTH("both");
        private final String value;
        private final static Map<String, Offices.FeaturesBathroomType> CONSTANTS = new HashMap<String, Offices.FeaturesBathroomType>();

        static {
            for (Offices.FeaturesBathroomType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private FeaturesBathroomType(String value) {
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
        public static Offices.FeaturesBathroomType fromValue(String value) {
            Offices.FeaturesBathroomType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum FeaturesConditionedAirType {

        NOT_AVAILABLE("notAvailable"),
        COLD("cold"),
        COLD_HEAT("cold/heat"),
        PRE_INSTALLATION("preInstallation");
        private final String value;
        private final static Map<String, Offices.FeaturesConditionedAirType> CONSTANTS = new HashMap<String, Offices.FeaturesConditionedAirType>();

        static {
            for (Offices.FeaturesConditionedAirType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private FeaturesConditionedAirType(String value) {
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
        public static Offices.FeaturesConditionedAirType fromValue(String value) {
            Offices.FeaturesConditionedAirType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum FeaturesRoomsSplitted {

        UNKNOWN("unknown"),
        OPEN_PLAN("openPlan"),
        WITH_SCREENS("withScreens"),
        WITH_WALLS("withWalls");
        private final String value;
        private final static Map<String, Offices.FeaturesRoomsSplitted> CONSTANTS = new HashMap<String, Offices.FeaturesRoomsSplitted>();

        static {
            for (Offices.FeaturesRoomsSplitted c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private FeaturesRoomsSplitted(String value) {
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
        public static Offices.FeaturesRoomsSplitted fromValue(String value) {
            Offices.FeaturesRoomsSplitted constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum FeaturesType {

        OFFICE("office");
        private final String value;
        private final static Map<String, Offices.FeaturesType> CONSTANTS = new HashMap<String, Offices.FeaturesType>();

        static {
            for (Offices.FeaturesType c: values()) {
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
        public static Offices.FeaturesType fromValue(String value) {
            Offices.FeaturesType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
