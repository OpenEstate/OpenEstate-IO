
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
public class OfficeFeatures
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
    private OfficeFeatures.Type type;
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
    private Boolean accessControl;
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
    @JsonProperty("featuresAreaUsable")
    @DecimalMin("1")
    @DecimalMax("99999")
    private BigInteger areaUsable;
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
    private Boolean bathroomInside;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresBathroomNumber")
    @DecimalMin("1")
    @DecimalMax("99")
    private BigInteger bathroomNumber;
    /**
     * bathroom type
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresBathroomType")
    private BathroomType bathroomType;
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
     * adapted building
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresBuildingAdapted")
    private Boolean buildingAdapted;
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
    private Boolean conditionedAir;
    /**
     * air conditioning type
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresConditionedAirType")
    private ConditionedAirType conditionedAirType;
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
     * doorman
     * <p>
     * doorman availability
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresDoorman")
    @JsonPropertyDescription("doorman availability")
    private Boolean doorman;
    /**
     * emergency exit
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresEmergencyExit")
    private Boolean emergencyExit;
    /**
     * emergency lights
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresEmergencyLights")
    private Boolean emergencyLights;
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
     * equipped with kitchen
     * <p>
     * equipped with kitchen only
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresEquippedKitchen")
    @JsonPropertyDescription("equipped with kitchen only")
    private Boolean equippedKitchen;
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
    private Boolean extinguishers;
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
    private Boolean fireDetectors;
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
    private Boolean fireDoors;
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
    @JsonProperty("featuresFloorsProperty")
    @DecimalMin("1")
    @DecimalMax("99")
    private BigInteger floorsProperty;
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
    private Boolean heating;
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
    private Boolean hotWater;
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
     * office building
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresOfficeBuilding")
    private Boolean officeBuilding;
    /**
     * east orientation
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresOrientationEast")
    private Boolean orientationEast;
    /**
     * north orientation
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresOrientationNorth")
    private Boolean orientationNorth;
    /**
     * south orientation
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresOrientationSouth")
    private Boolean orientationSouth;
    /**
     * west orientation
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresOrientationWest")
    private Boolean orientationWest;
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
     * rooms splitted
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresRoomsSplitted")
    private RoomsSplittedType roomsSplitted;
    /**
     * security alarm system
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresSecurityAlarm")
    private Boolean securityAlarm;
    /**
     * security door
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresSecurityDoor")
    private Boolean securityDoor;
    /**
     * security system
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresSecuritySystem")
    private Boolean securitySystem;
    /**
     * sprinklers
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresSprinklers")
    private Boolean sprinklers;
    /**
     * suspending ceiling
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresSuspendedCeiling")
    private Boolean suspendedCeiling;
    /**
     * suspending floor
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresSuspendedFloor")
    private Boolean suspendedFloor;
    /**
     * storage room
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresStorage")
    private Boolean storage;
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
    private Boolean windowsDouble;
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
    private WindowsLocationType windowsLocation;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 894500716077540319L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OfficeFeatures() {
    }

    /**
     * 
     * @param type
     * @param areaConstructed
     */
    public OfficeFeatures(OfficeFeatures.Type type, BigInteger areaConstructed) {
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
    public OfficeFeatures.Type getType() {
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
    public void setType(OfficeFeatures.Type type) {
        this.type = type;
    }

    public OfficeFeatures withType(OfficeFeatures.Type type) {
        this.type = type;
        return this;
    }

    /**
     * access control
     * <p>
     * availability of access control system
     * 
     */
    @JsonProperty("featuresAccessControl")
    public Boolean getFeaturesAccessControl() {
        return accessControl;
    }

    /**
     * access control
     * <p>
     * availability of access control system
     * 
     */
    @JsonProperty("featuresAccessControl")
    public void setFeaturesAccessControl(Boolean accessControl) {
        this.accessControl = accessControl;
    }

    public OfficeFeatures withFeaturesAccessControl(Boolean accessControl) {
        this.accessControl = accessControl;
        return this;
    }

    @JsonProperty("featuresAreaConstructed")
    public BigInteger getFeaturesAreaConstructed() {
        return areaConstructed;
    }

    @JsonProperty("featuresAreaConstructed")
    public void setFeaturesAreaConstructed(BigInteger areaConstructed) {
        this.areaConstructed = areaConstructed;
    }

    public OfficeFeatures withFeaturesAreaConstructed(BigInteger areaConstructed) {
        this.areaConstructed = areaConstructed;
        return this;
    }

    @JsonProperty("featuresAreaUsable")
    public BigInteger getFeaturesAreaUsable() {
        return areaUsable;
    }

    @JsonProperty("featuresAreaUsable")
    public void setFeaturesAreaUsable(BigInteger areaUsable) {
        this.areaUsable = areaUsable;
    }

    public OfficeFeatures withFeaturesAreaUsable(BigInteger areaUsable) {
        this.areaUsable = areaUsable;
        return this;
    }

    /**
     * bathroom inside
     * <p>
     * bathroom inside the property is available
     * 
     */
    @JsonProperty("featuresBathroomInside")
    public Boolean getFeaturesBathroomInside() {
        return bathroomInside;
    }

    /**
     * bathroom inside
     * <p>
     * bathroom inside the property is available
     * 
     */
    @JsonProperty("featuresBathroomInside")
    public void setFeaturesBathroomInside(Boolean bathroomInside) {
        this.bathroomInside = bathroomInside;
    }

    public OfficeFeatures withFeaturesBathroomInside(Boolean bathroomInside) {
        this.bathroomInside = bathroomInside;
        return this;
    }

    @JsonProperty("featuresBathroomNumber")
    public BigInteger getFeaturesBathroomNumber() {
        return bathroomNumber;
    }

    @JsonProperty("featuresBathroomNumber")
    public void setFeaturesBathroomNumber(BigInteger bathroomNumber) {
        this.bathroomNumber = bathroomNumber;
    }

    public OfficeFeatures withFeaturesBathroomNumber(BigInteger bathroomNumber) {
        this.bathroomNumber = bathroomNumber;
        return this;
    }

    /**
     * bathroom type
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresBathroomType")
    public BathroomType getFeaturesBathroomType() {
        return bathroomType;
    }

    /**
     * bathroom type
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresBathroomType")
    public void setFeaturesBathroomType(BathroomType bathroomType) {
        this.bathroomType = bathroomType;
    }

    public OfficeFeatures withFeaturesBathroomType(BathroomType bathroomType) {
        this.bathroomType = bathroomType;
        return this;
    }

    /**
     * building year
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresBuiltYear")
    public BigInteger getFeaturesBuiltYear() {
        return builtYear;
    }

    /**
     * building year
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresBuiltYear")
    public void setFeaturesBuiltYear(BigInteger builtYear) {
        this.builtYear = builtYear;
    }

    public OfficeFeatures withFeaturesBuiltYear(BigInteger builtYear) {
        this.builtYear = builtYear;
        return this;
    }

    /**
     * adapted building
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresBuildingAdapted")
    public Boolean getFeaturesBuildingAdapted() {
        return buildingAdapted;
    }

    /**
     * adapted building
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresBuildingAdapted")
    public void setFeaturesBuildingAdapted(Boolean buildingAdapted) {
        this.buildingAdapted = buildingAdapted;
    }

    public OfficeFeatures withFeaturesBuildingAdapted(Boolean buildingAdapted) {
        this.buildingAdapted = buildingAdapted;
        return this;
    }

    /**
     * air conditioning
     * <p>
     * has air conditioning
     * 
     */
    @JsonProperty("featuresConditionedAir")
    public Boolean getFeaturesConditionedAir() {
        return conditionedAir;
    }

    /**
     * air conditioning
     * <p>
     * has air conditioning
     * 
     */
    @JsonProperty("featuresConditionedAir")
    public void setFeaturesConditionedAir(Boolean conditionedAir) {
        this.conditionedAir = conditionedAir;
    }

    public OfficeFeatures withFeaturesConditionedAir(Boolean conditionedAir) {
        this.conditionedAir = conditionedAir;
        return this;
    }

    /**
     * air conditioning type
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresConditionedAirType")
    public ConditionedAirType getFeaturesConditionedAirType() {
        return conditionedAirType;
    }

    /**
     * air conditioning type
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresConditionedAirType")
    public void setFeaturesConditionedAirType(ConditionedAirType conditionedAirType) {
        this.conditionedAirType = conditionedAirType;
    }

    public OfficeFeatures withFeaturesConditionedAirType(ConditionedAirType conditionedAirType) {
        this.conditionedAirType = conditionedAirType;
        return this;
    }

    /**
     * conservation status
     * <p>
     * status new is only available for new development properties, not for secondhand properties
     * 
     */
    @JsonProperty("featuresConservation")
    public ConservationType getFeaturesConservation() {
        return conservation;
    }

    /**
     * conservation status
     * <p>
     * status new is only available for new development properties, not for secondhand properties
     * 
     */
    @JsonProperty("featuresConservation")
    public void setFeaturesConservation(ConservationType conservation) {
        this.conservation = conservation;
    }

    public OfficeFeatures withFeaturesConservation(ConservationType conservation) {
        this.conservation = conservation;
        return this;
    }

    /**
     * doorman
     * <p>
     * doorman availability
     * 
     */
    @JsonProperty("featuresDoorman")
    public Boolean getFeaturesDoorman() {
        return doorman;
    }

    /**
     * doorman
     * <p>
     * doorman availability
     * 
     */
    @JsonProperty("featuresDoorman")
    public void setFeaturesDoorman(Boolean doorman) {
        this.doorman = doorman;
    }

    public OfficeFeatures withFeaturesDoorman(Boolean doorman) {
        this.doorman = doorman;
        return this;
    }

    /**
     * emergency exit
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresEmergencyExit")
    public Boolean getFeaturesEmergencyExit() {
        return emergencyExit;
    }

    /**
     * emergency exit
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresEmergencyExit")
    public void setFeaturesEmergencyExit(Boolean emergencyExit) {
        this.emergencyExit = emergencyExit;
    }

    public OfficeFeatures withFeaturesEmergencyExit(Boolean emergencyExit) {
        this.emergencyExit = emergencyExit;
        return this;
    }

    /**
     * emergency lights
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresEmergencyLights")
    public Boolean getFeaturesEmergencyLights() {
        return emergencyLights;
    }

    /**
     * emergency lights
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresEmergencyLights")
    public void setFeaturesEmergencyLights(Boolean emergencyLights) {
        this.emergencyLights = emergencyLights;
    }

    public OfficeFeatures withFeaturesEmergencyLights(Boolean emergencyLights) {
        this.emergencyLights = emergencyLights;
        return this;
    }

    /**
     * energy certification rating
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresEnergyCertificateRating")
    public EnergyCertificateRatingType getFeaturesEnergyCertificateRating() {
        return energyCertificateRating;
    }

    /**
     * energy certification rating
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresEnergyCertificateRating")
    public void setFeaturesEnergyCertificateRating(EnergyCertificateRatingType energyCertificateRating) {
        this.energyCertificateRating = energyCertificateRating;
    }

    public OfficeFeatures withFeaturesEnergyCertificateRating(EnergyCertificateRatingType energyCertificateRating) {
        this.energyCertificateRating = energyCertificateRating;
        return this;
    }

    @JsonProperty("featuresEnergyCertificatePerformance")
    public BigDecimal getFeaturesEnergyCertificatePerformance() {
        return energyCertificatePerformance;
    }

    @JsonProperty("featuresEnergyCertificatePerformance")
    public void setFeaturesEnergyCertificatePerformance(BigDecimal energyCertificatePerformance) {
        this.energyCertificatePerformance = energyCertificatePerformance;
    }

    public OfficeFeatures withFeaturesEnergyCertificatePerformance(BigDecimal energyCertificatePerformance) {
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
    public EnergyCertificateType getFeaturesEnergyCertificateType() {
        return energyCertificateType;
    }

    /**
     * energy certification type
     * <p>
     * only available for new development properties. project: certification in project phase; completed: certification if the property is finished
     * 
     */
    @JsonProperty("featuresEnergyCertificateType")
    public void setFeaturesEnergyCertificateType(EnergyCertificateType energyCertificateType) {
        this.energyCertificateType = energyCertificateType;
    }

    public OfficeFeatures withFeaturesEnergyCertificateType(EnergyCertificateType energyCertificateType) {
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
    public EnergyCertificateLawType getFeaturesEnergyCertificateLaw() {
        return energyCertificateLaw;
    }

    /**
     * energy certification law
     * <p>
     * only for Italy, indicates the legislation that applies to the energy rating, DL-192(2005) or LEGGE-90(2013)
     * 
     */
    @JsonProperty("featuresEnergyCertificateLaw")
    public void setFeaturesEnergyCertificateLaw(EnergyCertificateLawType energyCertificateLaw) {
        this.energyCertificateLaw = energyCertificateLaw;
    }

    public OfficeFeatures withFeaturesEnergyCertificateLaw(EnergyCertificateLawType energyCertificateLaw) {
        this.energyCertificateLaw = energyCertificateLaw;
        return this;
    }

    /**
     * equipped with kitchen
     * <p>
     * equipped with kitchen only
     * 
     */
    @JsonProperty("featuresEquippedKitchen")
    public Boolean getFeaturesEquippedKitchen() {
        return equippedKitchen;
    }

    /**
     * equipped with kitchen
     * <p>
     * equipped with kitchen only
     * 
     */
    @JsonProperty("featuresEquippedKitchen")
    public void setFeaturesEquippedKitchen(Boolean equippedKitchen) {
        this.equippedKitchen = equippedKitchen;
    }

    public OfficeFeatures withFeaturesEquippedKitchen(Boolean equippedKitchen) {
        this.equippedKitchen = equippedKitchen;
        return this;
    }

    /**
     * extinguishers
     * <p>
     * extinguishers availability
     * 
     */
    @JsonProperty("featuresExtinguishers")
    public Boolean getFeaturesExtinguishers() {
        return extinguishers;
    }

    /**
     * extinguishers
     * <p>
     * extinguishers availability
     * 
     */
    @JsonProperty("featuresExtinguishers")
    public void setFeaturesExtinguishers(Boolean extinguishers) {
        this.extinguishers = extinguishers;
    }

    public OfficeFeatures withFeaturesExtinguishers(Boolean extinguishers) {
        this.extinguishers = extinguishers;
        return this;
    }

    /**
     * fire detectors
     * <p>
     * availability of fire detectors
     * 
     */
    @JsonProperty("featuresFireDetectors")
    public Boolean getFeaturesFireDetectors() {
        return fireDetectors;
    }

    /**
     * fire detectors
     * <p>
     * availability of fire detectors
     * 
     */
    @JsonProperty("featuresFireDetectors")
    public void setFeaturesFireDetectors(Boolean fireDetectors) {
        this.fireDetectors = fireDetectors;
    }

    public OfficeFeatures withFeaturesFireDetectors(Boolean fireDetectors) {
        this.fireDetectors = fireDetectors;
        return this;
    }

    /**
     * fire doors
     * <p>
     * availability of fire doors
     * 
     */
    @JsonProperty("featuresFireDoors")
    public Boolean getFeaturesFireDoors() {
        return fireDoors;
    }

    /**
     * fire doors
     * <p>
     * availability of fire doors
     * 
     */
    @JsonProperty("featuresFireDoors")
    public void setFeaturesFireDoors(Boolean fireDoors) {
        this.fireDoors = fireDoors;
    }

    public OfficeFeatures withFeaturesFireDoors(Boolean fireDoors) {
        this.fireDoors = fireDoors;
        return this;
    }

    @JsonProperty("featuresFloorsBuilding")
    public BigInteger getFeaturesFloorsBuilding() {
        return floorsBuilding;
    }

    @JsonProperty("featuresFloorsBuilding")
    public void setFeaturesFloorsBuilding(BigInteger floorsBuilding) {
        this.floorsBuilding = floorsBuilding;
    }

    public OfficeFeatures withFeaturesFloorsBuilding(BigInteger floorsBuilding) {
        this.floorsBuilding = floorsBuilding;
        return this;
    }

    @JsonProperty("featuresFloorsProperty")
    public BigInteger getFeaturesFloorsProperty() {
        return floorsProperty;
    }

    @JsonProperty("featuresFloorsProperty")
    public void setFeaturesFloorsProperty(BigInteger floorsProperty) {
        this.floorsProperty = floorsProperty;
    }

    public OfficeFeatures withFeaturesFloorsProperty(BigInteger floorsProperty) {
        this.floorsProperty = floorsProperty;
        return this;
    }

    /**
     * heating
     * <p>
     * heating availability
     * 
     */
    @JsonProperty("featuresHeating")
    public Boolean getFeaturesHeating() {
        return heating;
    }

    /**
     * heating
     * <p>
     * heating availability
     * 
     */
    @JsonProperty("featuresHeating")
    public void setFeaturesHeating(Boolean heating) {
        this.heating = heating;
    }

    public OfficeFeatures withFeaturesHeating(Boolean heating) {
        this.heating = heating;
        return this;
    }

    /**
     * hot water
     * <p>
     * hot water availability
     * 
     */
    @JsonProperty("featuresHotWater")
    public Boolean getFeaturesHotWater() {
        return hotWater;
    }

    /**
     * hot water
     * <p>
     * hot water availability
     * 
     */
    @JsonProperty("featuresHotWater")
    public void setFeaturesHotWater(Boolean hotWater) {
        this.hotWater = hotWater;
    }

    public OfficeFeatures withFeaturesHotWater(Boolean hotWater) {
        this.hotWater = hotWater;
        return this;
    }

    @JsonProperty("featuresLiftNumber")
    public BigInteger getFeaturesLiftNumber() {
        return liftNumber;
    }

    @JsonProperty("featuresLiftNumber")
    public void setFeaturesLiftNumber(BigInteger liftNumber) {
        this.liftNumber = liftNumber;
    }

    public OfficeFeatures withFeaturesLiftNumber(BigInteger liftNumber) {
        this.liftNumber = liftNumber;
        return this;
    }

    /**
     * office building
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresOfficeBuilding")
    public Boolean getFeaturesOfficeBuilding() {
        return officeBuilding;
    }

    /**
     * office building
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresOfficeBuilding")
    public void setFeaturesOfficeBuilding(Boolean officeBuilding) {
        this.officeBuilding = officeBuilding;
    }

    public OfficeFeatures withFeaturesOfficeBuilding(Boolean officeBuilding) {
        this.officeBuilding = officeBuilding;
        return this;
    }

    /**
     * east orientation
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresOrientationEast")
    public Boolean getFeaturesOrientationEast() {
        return orientationEast;
    }

    /**
     * east orientation
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresOrientationEast")
    public void setFeaturesOrientationEast(Boolean orientationEast) {
        this.orientationEast = orientationEast;
    }

    public OfficeFeatures withFeaturesOrientationEast(Boolean orientationEast) {
        this.orientationEast = orientationEast;
        return this;
    }

    /**
     * north orientation
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresOrientationNorth")
    public Boolean getFeaturesOrientationNorth() {
        return orientationNorth;
    }

    /**
     * north orientation
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresOrientationNorth")
    public void setFeaturesOrientationNorth(Boolean orientationNorth) {
        this.orientationNorth = orientationNorth;
    }

    public OfficeFeatures withFeaturesOrientationNorth(Boolean orientationNorth) {
        this.orientationNorth = orientationNorth;
        return this;
    }

    /**
     * south orientation
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresOrientationSouth")
    public Boolean getFeaturesOrientationSouth() {
        return orientationSouth;
    }

    /**
     * south orientation
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresOrientationSouth")
    public void setFeaturesOrientationSouth(Boolean orientationSouth) {
        this.orientationSouth = orientationSouth;
    }

    public OfficeFeatures withFeaturesOrientationSouth(Boolean orientationSouth) {
        this.orientationSouth = orientationSouth;
        return this;
    }

    /**
     * west orientation
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresOrientationWest")
    public Boolean getFeaturesOrientationWest() {
        return orientationWest;
    }

    /**
     * west orientation
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresOrientationWest")
    public void setFeaturesOrientationWest(Boolean orientationWest) {
        this.orientationWest = orientationWest;
    }

    public OfficeFeatures withFeaturesOrientationWest(Boolean orientationWest) {
        this.orientationWest = orientationWest;
        return this;
    }

    @JsonProperty("featuresParkingSpacesNumber")
    public BigInteger getFeaturesParkingSpacesNumber() {
        return parkingSpacesNumber;
    }

    @JsonProperty("featuresParkingSpacesNumber")
    public void setFeaturesParkingSpacesNumber(BigInteger parkingSpacesNumber) {
        this.parkingSpacesNumber = parkingSpacesNumber;
    }

    public OfficeFeatures withFeaturesParkingSpacesNumber(BigInteger parkingSpacesNumber) {
        this.parkingSpacesNumber = parkingSpacesNumber;
        return this;
    }

    /**
     * rooms splitted
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresRoomsSplitted")
    public RoomsSplittedType getFeaturesRoomsSplitted() {
        return roomsSplitted;
    }

    /**
     * rooms splitted
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresRoomsSplitted")
    public void setFeaturesRoomsSplitted(RoomsSplittedType roomsSplitted) {
        this.roomsSplitted = roomsSplitted;
    }

    public OfficeFeatures withFeaturesRoomsSplitted(RoomsSplittedType roomsSplitted) {
        this.roomsSplitted = roomsSplitted;
        return this;
    }

    /**
     * security alarm system
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSecurityAlarm")
    public Boolean getFeaturesSecurityAlarm() {
        return securityAlarm;
    }

    /**
     * security alarm system
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSecurityAlarm")
    public void setFeaturesSecurityAlarm(Boolean securityAlarm) {
        this.securityAlarm = securityAlarm;
    }

    public OfficeFeatures withFeaturesSecurityAlarm(Boolean securityAlarm) {
        this.securityAlarm = securityAlarm;
        return this;
    }

    /**
     * security door
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSecurityDoor")
    public Boolean getFeaturesSecurityDoor() {
        return securityDoor;
    }

    /**
     * security door
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSecurityDoor")
    public void setFeaturesSecurityDoor(Boolean securityDoor) {
        this.securityDoor = securityDoor;
    }

    public OfficeFeatures withFeaturesSecurityDoor(Boolean securityDoor) {
        this.securityDoor = securityDoor;
        return this;
    }

    /**
     * security system
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSecuritySystem")
    public Boolean getFeaturesSecuritySystem() {
        return securitySystem;
    }

    /**
     * security system
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSecuritySystem")
    public void setFeaturesSecuritySystem(Boolean securitySystem) {
        this.securitySystem = securitySystem;
    }

    public OfficeFeatures withFeaturesSecuritySystem(Boolean securitySystem) {
        this.securitySystem = securitySystem;
        return this;
    }

    /**
     * sprinklers
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSprinklers")
    public Boolean getFeaturesSprinklers() {
        return sprinklers;
    }

    /**
     * sprinklers
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSprinklers")
    public void setFeaturesSprinklers(Boolean sprinklers) {
        this.sprinklers = sprinklers;
    }

    public OfficeFeatures withFeaturesSprinklers(Boolean sprinklers) {
        this.sprinklers = sprinklers;
        return this;
    }

    /**
     * suspending ceiling
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSuspendedCeiling")
    public Boolean getFeaturesSuspendedCeiling() {
        return suspendedCeiling;
    }

    /**
     * suspending ceiling
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSuspendedCeiling")
    public void setFeaturesSuspendedCeiling(Boolean suspendedCeiling) {
        this.suspendedCeiling = suspendedCeiling;
    }

    public OfficeFeatures withFeaturesSuspendedCeiling(Boolean suspendedCeiling) {
        this.suspendedCeiling = suspendedCeiling;
        return this;
    }

    /**
     * suspending floor
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSuspendedFloor")
    public Boolean getFeaturesSuspendedFloor() {
        return suspendedFloor;
    }

    /**
     * suspending floor
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSuspendedFloor")
    public void setFeaturesSuspendedFloor(Boolean suspendedFloor) {
        this.suspendedFloor = suspendedFloor;
    }

    public OfficeFeatures withFeaturesSuspendedFloor(Boolean suspendedFloor) {
        this.suspendedFloor = suspendedFloor;
        return this;
    }

    /**
     * storage room
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresStorage")
    public Boolean getFeaturesStorage() {
        return storage;
    }

    /**
     * storage room
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresStorage")
    public void setFeaturesStorage(Boolean storage) {
        this.storage = storage;
    }

    public OfficeFeatures withFeaturesStorage(Boolean storage) {
        this.storage = storage;
        return this;
    }

    /**
     * double windows
     * <p>
     * double pane windows availability
     * 
     */
    @JsonProperty("featuresWindowsDouble")
    public Boolean getFeaturesWindowsDouble() {
        return windowsDouble;
    }

    /**
     * double windows
     * <p>
     * double pane windows availability
     * 
     */
    @JsonProperty("featuresWindowsDouble")
    public void setFeaturesWindowsDouble(Boolean windowsDouble) {
        this.windowsDouble = windowsDouble;
    }

    public OfficeFeatures withFeaturesWindowsDouble(Boolean windowsDouble) {
        this.windowsDouble = windowsDouble;
        return this;
    }

    /**
     * windows location
     * <p>
     * internal / external flat based on windows view. Only available for Spain.
     * 
     */
    @JsonProperty("featuresWindowsLocation")
    public WindowsLocationType getFeaturesWindowsLocation() {
        return windowsLocation;
    }

    /**
     * windows location
     * <p>
     * internal / external flat based on windows view. Only available for Spain.
     * 
     */
    @JsonProperty("featuresWindowsLocation")
    public void setFeaturesWindowsLocation(WindowsLocationType windowsLocation) {
        this.windowsLocation = windowsLocation;
    }

    public OfficeFeatures withFeaturesWindowsLocation(WindowsLocationType windowsLocation) {
        this.windowsLocation = windowsLocation;
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

    public OfficeFeatures withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OfficeFeatures.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("accessControl");
        sb.append('=');
        sb.append(((this.accessControl == null)?"<null>":this.accessControl));
        sb.append(',');
        sb.append("areaConstructed");
        sb.append('=');
        sb.append(((this.areaConstructed == null)?"<null>":this.areaConstructed));
        sb.append(',');
        sb.append("areaUsable");
        sb.append('=');
        sb.append(((this.areaUsable == null)?"<null>":this.areaUsable));
        sb.append(',');
        sb.append("bathroomInside");
        sb.append('=');
        sb.append(((this.bathroomInside == null)?"<null>":this.bathroomInside));
        sb.append(',');
        sb.append("bathroomNumber");
        sb.append('=');
        sb.append(((this.bathroomNumber == null)?"<null>":this.bathroomNumber));
        sb.append(',');
        sb.append("bathroomType");
        sb.append('=');
        sb.append(((this.bathroomType == null)?"<null>":this.bathroomType));
        sb.append(',');
        sb.append("builtYear");
        sb.append('=');
        sb.append(((this.builtYear == null)?"<null>":this.builtYear));
        sb.append(',');
        sb.append("buildingAdapted");
        sb.append('=');
        sb.append(((this.buildingAdapted == null)?"<null>":this.buildingAdapted));
        sb.append(',');
        sb.append("conditionedAir");
        sb.append('=');
        sb.append(((this.conditionedAir == null)?"<null>":this.conditionedAir));
        sb.append(',');
        sb.append("conditionedAirType");
        sb.append('=');
        sb.append(((this.conditionedAirType == null)?"<null>":this.conditionedAirType));
        sb.append(',');
        sb.append("conservation");
        sb.append('=');
        sb.append(((this.conservation == null)?"<null>":this.conservation));
        sb.append(',');
        sb.append("doorman");
        sb.append('=');
        sb.append(((this.doorman == null)?"<null>":this.doorman));
        sb.append(',');
        sb.append("emergencyExit");
        sb.append('=');
        sb.append(((this.emergencyExit == null)?"<null>":this.emergencyExit));
        sb.append(',');
        sb.append("emergencyLights");
        sb.append('=');
        sb.append(((this.emergencyLights == null)?"<null>":this.emergencyLights));
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
        sb.append("equippedKitchen");
        sb.append('=');
        sb.append(((this.equippedKitchen == null)?"<null>":this.equippedKitchen));
        sb.append(',');
        sb.append("extinguishers");
        sb.append('=');
        sb.append(((this.extinguishers == null)?"<null>":this.extinguishers));
        sb.append(',');
        sb.append("fireDetectors");
        sb.append('=');
        sb.append(((this.fireDetectors == null)?"<null>":this.fireDetectors));
        sb.append(',');
        sb.append("fireDoors");
        sb.append('=');
        sb.append(((this.fireDoors == null)?"<null>":this.fireDoors));
        sb.append(',');
        sb.append("floorsBuilding");
        sb.append('=');
        sb.append(((this.floorsBuilding == null)?"<null>":this.floorsBuilding));
        sb.append(',');
        sb.append("floorsProperty");
        sb.append('=');
        sb.append(((this.floorsProperty == null)?"<null>":this.floorsProperty));
        sb.append(',');
        sb.append("heating");
        sb.append('=');
        sb.append(((this.heating == null)?"<null>":this.heating));
        sb.append(',');
        sb.append("hotWater");
        sb.append('=');
        sb.append(((this.hotWater == null)?"<null>":this.hotWater));
        sb.append(',');
        sb.append("liftNumber");
        sb.append('=');
        sb.append(((this.liftNumber == null)?"<null>":this.liftNumber));
        sb.append(',');
        sb.append("officeBuilding");
        sb.append('=');
        sb.append(((this.officeBuilding == null)?"<null>":this.officeBuilding));
        sb.append(',');
        sb.append("orientationEast");
        sb.append('=');
        sb.append(((this.orientationEast == null)?"<null>":this.orientationEast));
        sb.append(',');
        sb.append("orientationNorth");
        sb.append('=');
        sb.append(((this.orientationNorth == null)?"<null>":this.orientationNorth));
        sb.append(',');
        sb.append("orientationSouth");
        sb.append('=');
        sb.append(((this.orientationSouth == null)?"<null>":this.orientationSouth));
        sb.append(',');
        sb.append("orientationWest");
        sb.append('=');
        sb.append(((this.orientationWest == null)?"<null>":this.orientationWest));
        sb.append(',');
        sb.append("parkingSpacesNumber");
        sb.append('=');
        sb.append(((this.parkingSpacesNumber == null)?"<null>":this.parkingSpacesNumber));
        sb.append(',');
        sb.append("roomsSplitted");
        sb.append('=');
        sb.append(((this.roomsSplitted == null)?"<null>":this.roomsSplitted));
        sb.append(',');
        sb.append("securityAlarm");
        sb.append('=');
        sb.append(((this.securityAlarm == null)?"<null>":this.securityAlarm));
        sb.append(',');
        sb.append("securityDoor");
        sb.append('=');
        sb.append(((this.securityDoor == null)?"<null>":this.securityDoor));
        sb.append(',');
        sb.append("securitySystem");
        sb.append('=');
        sb.append(((this.securitySystem == null)?"<null>":this.securitySystem));
        sb.append(',');
        sb.append("sprinklers");
        sb.append('=');
        sb.append(((this.sprinklers == null)?"<null>":this.sprinklers));
        sb.append(',');
        sb.append("suspendedCeiling");
        sb.append('=');
        sb.append(((this.suspendedCeiling == null)?"<null>":this.suspendedCeiling));
        sb.append(',');
        sb.append("suspendedFloor");
        sb.append('=');
        sb.append(((this.suspendedFloor == null)?"<null>":this.suspendedFloor));
        sb.append(',');
        sb.append("storage");
        sb.append('=');
        sb.append(((this.storage == null)?"<null>":this.storage));
        sb.append(',');
        sb.append("windowsDouble");
        sb.append('=');
        sb.append(((this.windowsDouble == null)?"<null>":this.windowsDouble));
        sb.append(',');
        sb.append("windowsLocation");
        sb.append('=');
        sb.append(((this.windowsLocation == null)?"<null>":this.windowsLocation));
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
        result = ((result* 31)+((this.roomsSplitted == null)? 0 :this.roomsSplitted.hashCode()));
        result = ((result* 31)+((this.accessControl == null)? 0 :this.accessControl.hashCode()));
        result = ((result* 31)+((this.bathroomType == null)? 0 :this.bathroomType.hashCode()));
        result = ((result* 31)+((this.windowsLocation == null)? 0 :this.windowsLocation.hashCode()));
        result = ((result* 31)+((this.emergencyExit == null)? 0 :this.emergencyExit.hashCode()));
        result = ((result* 31)+((this.energyCertificateRating == null)? 0 :this.energyCertificateRating.hashCode()));
        result = ((result* 31)+((this.doorman == null)? 0 :this.doorman.hashCode()));
        result = ((result* 31)+((this.equippedKitchen == null)? 0 :this.equippedKitchen.hashCode()));
        result = ((result* 31)+((this.orientationSouth == null)? 0 :this.orientationSouth.hashCode()));
        result = ((result* 31)+((this.areaUsable == null)? 0 :this.areaUsable.hashCode()));
        result = ((result* 31)+((this.bathroomNumber == null)? 0 :this.bathroomNumber.hashCode()));
        result = ((result* 31)+((this.buildingAdapted == null)? 0 :this.buildingAdapted.hashCode()));
        result = ((result* 31)+((this.storage == null)? 0 :this.storage.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.suspendedFloor == null)? 0 :this.suspendedFloor.hashCode()));
        result = ((result* 31)+((this.areaConstructed == null)? 0 :this.areaConstructed.hashCode()));
        result = ((result* 31)+((this.parkingSpacesNumber == null)? 0 :this.parkingSpacesNumber.hashCode()));
        result = ((result* 31)+((this.emergencyLights == null)? 0 :this.emergencyLights.hashCode()));
        result = ((result* 31)+((this.orientationWest == null)? 0 :this.orientationWest.hashCode()));
        result = ((result* 31)+((this.orientationNorth == null)? 0 :this.orientationNorth.hashCode()));
        result = ((result* 31)+((this.energyCertificatePerformance == null)? 0 :this.energyCertificatePerformance.hashCode()));
        result = ((result* 31)+((this.heating == null)? 0 :this.heating.hashCode()));
        result = ((result* 31)+((this.fireDoors == null)? 0 :this.fireDoors.hashCode()));
        result = ((result* 31)+((this.floorsBuilding == null)? 0 :this.floorsBuilding.hashCode()));
        result = ((result* 31)+((this.liftNumber == null)? 0 :this.liftNumber.hashCode()));
        result = ((result* 31)+((this.securitySystem == null)? 0 :this.securitySystem.hashCode()));
        result = ((result* 31)+((this.sprinklers == null)? 0 :this.sprinklers.hashCode()));
        result = ((result* 31)+((this.orientationEast == null)? 0 :this.orientationEast.hashCode()));
        result = ((result* 31)+((this.fireDetectors == null)? 0 :this.fireDetectors.hashCode()));
        result = ((result* 31)+((this.securityDoor == null)? 0 :this.securityDoor.hashCode()));
        result = ((result* 31)+((this.securityAlarm == null)? 0 :this.securityAlarm.hashCode()));
        result = ((result* 31)+((this.windowsDouble == null)? 0 :this.windowsDouble.hashCode()));
        result = ((result* 31)+((this.conditionedAirType == null)? 0 :this.conditionedAirType.hashCode()));
        result = ((result* 31)+((this.conservation == null)? 0 :this.conservation.hashCode()));
        result = ((result* 31)+((this.energyCertificateLaw == null)? 0 :this.energyCertificateLaw.hashCode()));
        result = ((result* 31)+((this.conditionedAir == null)? 0 :this.conditionedAir.hashCode()));
        result = ((result* 31)+((this.floorsProperty == null)? 0 :this.floorsProperty.hashCode()));
        result = ((result* 31)+((this.energyCertificateType == null)? 0 :this.energyCertificateType.hashCode()));
        result = ((result* 31)+((this.builtYear == null)? 0 :this.builtYear.hashCode()));
        result = ((result* 31)+((this.suspendedCeiling == null)? 0 :this.suspendedCeiling.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.hotWater == null)? 0 :this.hotWater.hashCode()));
        result = ((result* 31)+((this.bathroomInside == null)? 0 :this.bathroomInside.hashCode()));
        result = ((result* 31)+((this.extinguishers == null)? 0 :this.extinguishers.hashCode()));
        result = ((result* 31)+((this.officeBuilding == null)? 0 :this.officeBuilding.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OfficeFeatures) == false) {
            return false;
        }
        OfficeFeatures rhs = ((OfficeFeatures) other);
        return (((((((((((((((((((((((((((((((((((((((((((((super.equals(rhs)&&((this.roomsSplitted == rhs.roomsSplitted)||((this.roomsSplitted!= null)&&this.roomsSplitted.equals(rhs.roomsSplitted))))&&((this.accessControl == rhs.accessControl)||((this.accessControl!= null)&&this.accessControl.equals(rhs.accessControl))))&&((this.bathroomType == rhs.bathroomType)||((this.bathroomType!= null)&&this.bathroomType.equals(rhs.bathroomType))))&&((this.windowsLocation == rhs.windowsLocation)||((this.windowsLocation!= null)&&this.windowsLocation.equals(rhs.windowsLocation))))&&((this.emergencyExit == rhs.emergencyExit)||((this.emergencyExit!= null)&&this.emergencyExit.equals(rhs.emergencyExit))))&&((this.energyCertificateRating == rhs.energyCertificateRating)||((this.energyCertificateRating!= null)&&this.energyCertificateRating.equals(rhs.energyCertificateRating))))&&((this.doorman == rhs.doorman)||((this.doorman!= null)&&this.doorman.equals(rhs.doorman))))&&((this.equippedKitchen == rhs.equippedKitchen)||((this.equippedKitchen!= null)&&this.equippedKitchen.equals(rhs.equippedKitchen))))&&((this.orientationSouth == rhs.orientationSouth)||((this.orientationSouth!= null)&&this.orientationSouth.equals(rhs.orientationSouth))))&&((this.areaUsable == rhs.areaUsable)||((this.areaUsable!= null)&&this.areaUsable.equals(rhs.areaUsable))))&&((this.bathroomNumber == rhs.bathroomNumber)||((this.bathroomNumber!= null)&&this.bathroomNumber.equals(rhs.bathroomNumber))))&&((this.buildingAdapted == rhs.buildingAdapted)||((this.buildingAdapted!= null)&&this.buildingAdapted.equals(rhs.buildingAdapted))))&&((this.storage == rhs.storage)||((this.storage!= null)&&this.storage.equals(rhs.storage))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.suspendedFloor == rhs.suspendedFloor)||((this.suspendedFloor!= null)&&this.suspendedFloor.equals(rhs.suspendedFloor))))&&((this.areaConstructed == rhs.areaConstructed)||((this.areaConstructed!= null)&&this.areaConstructed.equals(rhs.areaConstructed))))&&((this.parkingSpacesNumber == rhs.parkingSpacesNumber)||((this.parkingSpacesNumber!= null)&&this.parkingSpacesNumber.equals(rhs.parkingSpacesNumber))))&&((this.emergencyLights == rhs.emergencyLights)||((this.emergencyLights!= null)&&this.emergencyLights.equals(rhs.emergencyLights))))&&((this.orientationWest == rhs.orientationWest)||((this.orientationWest!= null)&&this.orientationWest.equals(rhs.orientationWest))))&&((this.orientationNorth == rhs.orientationNorth)||((this.orientationNorth!= null)&&this.orientationNorth.equals(rhs.orientationNorth))))&&((this.energyCertificatePerformance == rhs.energyCertificatePerformance)||((this.energyCertificatePerformance!= null)&&this.energyCertificatePerformance.equals(rhs.energyCertificatePerformance))))&&((this.heating == rhs.heating)||((this.heating!= null)&&this.heating.equals(rhs.heating))))&&((this.fireDoors == rhs.fireDoors)||((this.fireDoors!= null)&&this.fireDoors.equals(rhs.fireDoors))))&&((this.floorsBuilding == rhs.floorsBuilding)||((this.floorsBuilding!= null)&&this.floorsBuilding.equals(rhs.floorsBuilding))))&&((this.liftNumber == rhs.liftNumber)||((this.liftNumber!= null)&&this.liftNumber.equals(rhs.liftNumber))))&&((this.securitySystem == rhs.securitySystem)||((this.securitySystem!= null)&&this.securitySystem.equals(rhs.securitySystem))))&&((this.sprinklers == rhs.sprinklers)||((this.sprinklers!= null)&&this.sprinklers.equals(rhs.sprinklers))))&&((this.orientationEast == rhs.orientationEast)||((this.orientationEast!= null)&&this.orientationEast.equals(rhs.orientationEast))))&&((this.fireDetectors == rhs.fireDetectors)||((this.fireDetectors!= null)&&this.fireDetectors.equals(rhs.fireDetectors))))&&((this.securityDoor == rhs.securityDoor)||((this.securityDoor!= null)&&this.securityDoor.equals(rhs.securityDoor))))&&((this.securityAlarm == rhs.securityAlarm)||((this.securityAlarm!= null)&&this.securityAlarm.equals(rhs.securityAlarm))))&&((this.windowsDouble == rhs.windowsDouble)||((this.windowsDouble!= null)&&this.windowsDouble.equals(rhs.windowsDouble))))&&((this.conditionedAirType == rhs.conditionedAirType)||((this.conditionedAirType!= null)&&this.conditionedAirType.equals(rhs.conditionedAirType))))&&((this.conservation == rhs.conservation)||((this.conservation!= null)&&this.conservation.equals(rhs.conservation))))&&((this.energyCertificateLaw == rhs.energyCertificateLaw)||((this.energyCertificateLaw!= null)&&this.energyCertificateLaw.equals(rhs.energyCertificateLaw))))&&((this.conditionedAir == rhs.conditionedAir)||((this.conditionedAir!= null)&&this.conditionedAir.equals(rhs.conditionedAir))))&&((this.floorsProperty == rhs.floorsProperty)||((this.floorsProperty!= null)&&this.floorsProperty.equals(rhs.floorsProperty))))&&((this.energyCertificateType == rhs.energyCertificateType)||((this.energyCertificateType!= null)&&this.energyCertificateType.equals(rhs.energyCertificateType))))&&((this.builtYear == rhs.builtYear)||((this.builtYear!= null)&&this.builtYear.equals(rhs.builtYear))))&&((this.suspendedCeiling == rhs.suspendedCeiling)||((this.suspendedCeiling!= null)&&this.suspendedCeiling.equals(rhs.suspendedCeiling))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.hotWater == rhs.hotWater)||((this.hotWater!= null)&&this.hotWater.equals(rhs.hotWater))))&&((this.bathroomInside == rhs.bathroomInside)||((this.bathroomInside!= null)&&this.bathroomInside.equals(rhs.bathroomInside))))&&((this.extinguishers == rhs.extinguishers)||((this.extinguishers!= null)&&this.extinguishers.equals(rhs.extinguishers))))&&((this.officeBuilding == rhs.officeBuilding)||((this.officeBuilding!= null)&&this.officeBuilding.equals(rhs.officeBuilding))));
    }

    public enum Type {

        OFFICE("office");
        private final String value;
        private final static Map<String, OfficeFeatures.Type> CONSTANTS = new HashMap<String, OfficeFeatures.Type>();

        static {
            for (OfficeFeatures.Type c: values()) {
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
        public static OfficeFeatures.Type fromValue(String value) {
            OfficeFeatures.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
