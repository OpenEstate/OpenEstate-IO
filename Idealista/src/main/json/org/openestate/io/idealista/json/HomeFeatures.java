
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
public class HomeFeatures
    extends AbstractFeatures
    implements Serializable
{

    /**
     * property types
     * <p>
     * 
     * Corresponds to the "featuresType" property.Types availability varies between countries. Spain: rustic_rural, rustic_masia, rustic_cortijo, rustic_terrera, rustic_torre, rustic_caseron. Italy: house_villa, rustic_masseria, rustic_trullo, rustic_casalecascina, rustic_baita. Portugal: house_andar_moradia, rustic_quinta, rustic_moinho, rustic_montealentejano, rustic_solar. Spain and Portugal: rustic_palace.  The rest of the types is available in every country.
     * (Required)
     * 
     */
    @JsonProperty("featuresType")
    @JsonPropertyDescription("Types availability varies between countries. Spain: rustic_rural, rustic_masia, rustic_cortijo, rustic_terrera, rustic_torre, rustic_caseron. Italy: house_villa, rustic_masseria, rustic_trullo, rustic_casalecascina, rustic_baita. Portugal: house_andar_moradia, rustic_quinta, rustic_moinho, rustic_montealentejano, rustic_solar. Spain and Portugal: rustic_palace.  The rest of the types is available in every country.")
    @NotNull
    @Nonnull
    private HomeFeatures.Type type;
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
    @JsonProperty("featuresAreaPlot")
    @DecimalMin("1")
    @DecimalMax("99999999")
    private BigInteger areaPlot;
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
     * balcony availability
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresBalcony")
    private Boolean balcony;
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
    private BigInteger bathroomNumber;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresBedroomNumber")
    @DecimalMin("1")
    @DecimalMax("99")
    private BigInteger bedroomNumber;
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
     * chimney availability for rustic houses
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresChimney")
    private Boolean chimney;
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
     * duplex
     * <p>
     * flat on two floors connected by an indoor staircase
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresDuplex")
    @JsonPropertyDescription("flat on two floors connected by an indoor staircase")
    private Boolean duplex;
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
     * equipped with furniture
     * <p>
     * fully furnished
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresEquippedWithFurniture")
    @JsonPropertyDescription("fully furnished")
    private Boolean equippedWithFurniture;
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
     * floor in top
     * <p>
     * flats: indicates if the property is on the last floor / houses: specific field for 'andar de moradia' property type, indicates if the property is the one on the upper floor (true) or the one in the lower floor (false)
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresFloorsInTop")
    @JsonPropertyDescription("flats: indicates if the property is on the last floor / houses: specific field for 'andar de moradia' property type, indicates if the property is the one on the upper floor (true) or the one in the lower floor (false)")
    private Boolean floorsInTop;
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
    private Boolean garden;
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
    private Boolean handicapAdaptedAccess;
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
    private Boolean handicapAdaptedUse;
    /**
     * lift
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresLiftAvailable")
    private Boolean liftAvailable;
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
     * parking availability
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresParkingAvailable")
    private Boolean parkingAvailable;
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
    private Boolean penthouse;
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
    private Boolean petsAllowed;
    /**
     * pool availability
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresPool")
    private Boolean pool;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresRooms")
    @DecimalMin("1")
    @DecimalMax("99")
    private BigInteger rooms;
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
     * studio
     * <p>
     * flat with a single room
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresStudio")
    @JsonPropertyDescription("flat with a single room")
    private Boolean studio;
    /**
     * terrace
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresTerrace")
    private Boolean terrace;
    /**
     * wardrobes availability
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresWardrobes")
    private Boolean wardrobes;
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
    /**
     * heatingType
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresHeatingType")
    private HeatingType heatingType;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7926020788829878587L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public HomeFeatures() {
    }

    /**
     * 
     * @param bathroomNumber
     * @param type
     * @param areaConstructed
     */
    public HomeFeatures(HomeFeatures.Type type, BigInteger areaConstructed, BigInteger bathroomNumber) {
        super();
        this.type = type;
        this.areaConstructed = areaConstructed;
        this.bathroomNumber = bathroomNumber;
    }

    /**
     * property types
     * <p>
     * 
     * Corresponds to the "featuresType" property.Types availability varies between countries. Spain: rustic_rural, rustic_masia, rustic_cortijo, rustic_terrera, rustic_torre, rustic_caseron. Italy: house_villa, rustic_masseria, rustic_trullo, rustic_casalecascina, rustic_baita. Portugal: house_andar_moradia, rustic_quinta, rustic_moinho, rustic_montealentejano, rustic_solar. Spain and Portugal: rustic_palace.  The rest of the types is available in every country.
     * (Required)
     * 
     */
    @JsonProperty("featuresType")
    public HomeFeatures.Type getType() {
        return type;
    }

    /**
     * property types
     * <p>
     * 
     * Corresponds to the "featuresType" property.Types availability varies between countries. Spain: rustic_rural, rustic_masia, rustic_cortijo, rustic_terrera, rustic_torre, rustic_caseron. Italy: house_villa, rustic_masseria, rustic_trullo, rustic_casalecascina, rustic_baita. Portugal: house_andar_moradia, rustic_quinta, rustic_moinho, rustic_montealentejano, rustic_solar. Spain and Portugal: rustic_palace.  The rest of the types is available in every country.
     * (Required)
     * 
     */
    @JsonProperty("featuresType")
    public void setType(HomeFeatures.Type type) {
        this.type = type;
    }

    public HomeFeatures withType(HomeFeatures.Type type) {
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

    public HomeFeatures withAreaConstructed(BigInteger areaConstructed) {
        this.areaConstructed = areaConstructed;
        return this;
    }

    @JsonProperty("featuresAreaPlot")
    public BigInteger getAreaPlot() {
        return areaPlot;
    }

    @JsonProperty("featuresAreaPlot")
    public void setAreaPlot(BigInteger areaPlot) {
        this.areaPlot = areaPlot;
    }

    public HomeFeatures withAreaPlot(BigInteger areaPlot) {
        this.areaPlot = areaPlot;
        return this;
    }

    @JsonProperty("featuresAreaUsable")
    public BigInteger getAreaUsable() {
        return areaUsable;
    }

    @JsonProperty("featuresAreaUsable")
    public void setAreaUsable(BigInteger areaUsable) {
        this.areaUsable = areaUsable;
    }

    public HomeFeatures withAreaUsable(BigInteger areaUsable) {
        this.areaUsable = areaUsable;
        return this;
    }

    /**
     * balcony availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresBalcony")
    public Boolean getBalcony() {
        return balcony;
    }

    /**
     * balcony availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresBalcony")
    public void setBalcony(Boolean balcony) {
        this.balcony = balcony;
    }

    public HomeFeatures withBalcony(Boolean balcony) {
        this.balcony = balcony;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("featuresBathroomNumber")
    public BigInteger getBathroomNumber() {
        return bathroomNumber;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("featuresBathroomNumber")
    public void setBathroomNumber(BigInteger bathroomNumber) {
        this.bathroomNumber = bathroomNumber;
    }

    public HomeFeatures withBathroomNumber(BigInteger bathroomNumber) {
        this.bathroomNumber = bathroomNumber;
        return this;
    }

    @JsonProperty("featuresBedroomNumber")
    public BigInteger getBedroomNumber() {
        return bedroomNumber;
    }

    @JsonProperty("featuresBedroomNumber")
    public void setBedroomNumber(BigInteger bedroomNumber) {
        this.bedroomNumber = bedroomNumber;
    }

    public HomeFeatures withBedroomNumber(BigInteger bedroomNumber) {
        this.bedroomNumber = bedroomNumber;
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

    public HomeFeatures withBuiltYear(BigInteger builtYear) {
        this.builtYear = builtYear;
        return this;
    }

    /**
     * air conditioning
     * <p>
     * has air conditioning
     * 
     */
    @JsonProperty("featuresConditionedAir")
    public Boolean getConditionedAir() {
        return conditionedAir;
    }

    /**
     * air conditioning
     * <p>
     * has air conditioning
     * 
     */
    @JsonProperty("featuresConditionedAir")
    public void setConditionedAir(Boolean conditionedAir) {
        this.conditionedAir = conditionedAir;
    }

    public HomeFeatures withConditionedAir(Boolean conditionedAir) {
        this.conditionedAir = conditionedAir;
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

    public HomeFeatures withConservation(ConservationType conservation) {
        this.conservation = conservation;
        return this;
    }

    /**
     * chimney availability for rustic houses
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresChimney")
    public Boolean getChimney() {
        return chimney;
    }

    /**
     * chimney availability for rustic houses
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresChimney")
    public void setChimney(Boolean chimney) {
        this.chimney = chimney;
    }

    public HomeFeatures withChimney(Boolean chimney) {
        this.chimney = chimney;
        return this;
    }

    /**
     * doorman
     * <p>
     * doorman availability
     * 
     */
    @JsonProperty("featuresDoorman")
    public Boolean getDoorman() {
        return doorman;
    }

    /**
     * doorman
     * <p>
     * doorman availability
     * 
     */
    @JsonProperty("featuresDoorman")
    public void setDoorman(Boolean doorman) {
        this.doorman = doorman;
    }

    public HomeFeatures withDoorman(Boolean doorman) {
        this.doorman = doorman;
        return this;
    }

    /**
     * duplex
     * <p>
     * flat on two floors connected by an indoor staircase
     * 
     */
    @JsonProperty("featuresDuplex")
    public Boolean getDuplex() {
        return duplex;
    }

    /**
     * duplex
     * <p>
     * flat on two floors connected by an indoor staircase
     * 
     */
    @JsonProperty("featuresDuplex")
    public void setDuplex(Boolean duplex) {
        this.duplex = duplex;
    }

    public HomeFeatures withDuplex(Boolean duplex) {
        this.duplex = duplex;
        return this;
    }

    /**
     * equipped with kitchen
     * <p>
     * equipped with kitchen only
     * 
     */
    @JsonProperty("featuresEquippedKitchen")
    public Boolean getEquippedKitchen() {
        return equippedKitchen;
    }

    /**
     * equipped with kitchen
     * <p>
     * equipped with kitchen only
     * 
     */
    @JsonProperty("featuresEquippedKitchen")
    public void setEquippedKitchen(Boolean equippedKitchen) {
        this.equippedKitchen = equippedKitchen;
    }

    public HomeFeatures withEquippedKitchen(Boolean equippedKitchen) {
        this.equippedKitchen = equippedKitchen;
        return this;
    }

    /**
     * equipped with furniture
     * <p>
     * fully furnished
     * 
     */
    @JsonProperty("featuresEquippedWithFurniture")
    public Boolean getEquippedWithFurniture() {
        return equippedWithFurniture;
    }

    /**
     * equipped with furniture
     * <p>
     * fully furnished
     * 
     */
    @JsonProperty("featuresEquippedWithFurniture")
    public void setEquippedWithFurniture(Boolean equippedWithFurniture) {
        this.equippedWithFurniture = equippedWithFurniture;
    }

    public HomeFeatures withEquippedWithFurniture(Boolean equippedWithFurniture) {
        this.equippedWithFurniture = equippedWithFurniture;
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

    public HomeFeatures withEnergyCertificatePerformance(BigDecimal energyCertificatePerformance) {
        this.energyCertificatePerformance = energyCertificatePerformance;
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

    public HomeFeatures withEnergyCertificateLaw(EnergyCertificateLawType energyCertificateLaw) {
        this.energyCertificateLaw = energyCertificateLaw;
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

    public HomeFeatures withEnergyCertificateRating(EnergyCertificateRatingType energyCertificateRating) {
        this.energyCertificateRating = energyCertificateRating;
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

    public HomeFeatures withEnergyCertificateType(EnergyCertificateType energyCertificateType) {
        this.energyCertificateType = energyCertificateType;
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

    public HomeFeatures withFloorsBuilding(BigInteger floorsBuilding) {
        this.floorsBuilding = floorsBuilding;
        return this;
    }

    /**
     * floor in top
     * <p>
     * flats: indicates if the property is on the last floor / houses: specific field for 'andar de moradia' property type, indicates if the property is the one on the upper floor (true) or the one in the lower floor (false)
     * 
     */
    @JsonProperty("featuresFloorsInTop")
    public Boolean getFloorsInTop() {
        return floorsInTop;
    }

    /**
     * floor in top
     * <p>
     * flats: indicates if the property is on the last floor / houses: specific field for 'andar de moradia' property type, indicates if the property is the one on the upper floor (true) or the one in the lower floor (false)
     * 
     */
    @JsonProperty("featuresFloorsInTop")
    public void setFloorsInTop(Boolean floorsInTop) {
        this.floorsInTop = floorsInTop;
    }

    public HomeFeatures withFloorsInTop(Boolean floorsInTop) {
        this.floorsInTop = floorsInTop;
        return this;
    }

    /**
     * garden
     * <p>
     * garden availability
     * 
     */
    @JsonProperty("featuresGarden")
    public Boolean getGarden() {
        return garden;
    }

    /**
     * garden
     * <p>
     * garden availability
     * 
     */
    @JsonProperty("featuresGarden")
    public void setGarden(Boolean garden) {
        this.garden = garden;
    }

    public HomeFeatures withGarden(Boolean garden) {
        this.garden = garden;
        return this;
    }

    /**
     * handicap adapted access availability
     * <p>
     * access adapted to people with reduced mobility
     * 
     */
    @JsonProperty("featuresHandicapAdaptedAccess")
    public Boolean getHandicapAdaptedAccess() {
        return handicapAdaptedAccess;
    }

    /**
     * handicap adapted access availability
     * <p>
     * access adapted to people with reduced mobility
     * 
     */
    @JsonProperty("featuresHandicapAdaptedAccess")
    public void setHandicapAdaptedAccess(Boolean handicapAdaptedAccess) {
        this.handicapAdaptedAccess = handicapAdaptedAccess;
    }

    public HomeFeatures withHandicapAdaptedAccess(Boolean handicapAdaptedAccess) {
        this.handicapAdaptedAccess = handicapAdaptedAccess;
        return this;
    }

    /**
     * handicap adapted use availability
     * <p>
     * property adapted to people with reduced mobility
     * 
     */
    @JsonProperty("featuresHandicapAdaptedUse")
    public Boolean getHandicapAdaptedUse() {
        return handicapAdaptedUse;
    }

    /**
     * handicap adapted use availability
     * <p>
     * property adapted to people with reduced mobility
     * 
     */
    @JsonProperty("featuresHandicapAdaptedUse")
    public void setHandicapAdaptedUse(Boolean handicapAdaptedUse) {
        this.handicapAdaptedUse = handicapAdaptedUse;
    }

    public HomeFeatures withHandicapAdaptedUse(Boolean handicapAdaptedUse) {
        this.handicapAdaptedUse = handicapAdaptedUse;
        return this;
    }

    /**
     * lift
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresLiftAvailable")
    public Boolean getLiftAvailable() {
        return liftAvailable;
    }

    /**
     * lift
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresLiftAvailable")
    public void setLiftAvailable(Boolean liftAvailable) {
        this.liftAvailable = liftAvailable;
    }

    public HomeFeatures withLiftAvailable(Boolean liftAvailable) {
        this.liftAvailable = liftAvailable;
        return this;
    }

    /**
     * north orientation
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresOrientationNorth")
    public Boolean getOrientationNorth() {
        return orientationNorth;
    }

    /**
     * north orientation
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresOrientationNorth")
    public void setOrientationNorth(Boolean orientationNorth) {
        this.orientationNorth = orientationNorth;
    }

    public HomeFeatures withOrientationNorth(Boolean orientationNorth) {
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
    public Boolean getOrientationSouth() {
        return orientationSouth;
    }

    /**
     * south orientation
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresOrientationSouth")
    public void setOrientationSouth(Boolean orientationSouth) {
        this.orientationSouth = orientationSouth;
    }

    public HomeFeatures withOrientationSouth(Boolean orientationSouth) {
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
    public Boolean getOrientationWest() {
        return orientationWest;
    }

    /**
     * west orientation
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresOrientationWest")
    public void setOrientationWest(Boolean orientationWest) {
        this.orientationWest = orientationWest;
    }

    public HomeFeatures withOrientationWest(Boolean orientationWest) {
        this.orientationWest = orientationWest;
        return this;
    }

    /**
     * east orientation
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresOrientationEast")
    public Boolean getOrientationEast() {
        return orientationEast;
    }

    /**
     * east orientation
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresOrientationEast")
    public void setOrientationEast(Boolean orientationEast) {
        this.orientationEast = orientationEast;
    }

    public HomeFeatures withOrientationEast(Boolean orientationEast) {
        this.orientationEast = orientationEast;
        return this;
    }

    /**
     * parking availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresParkingAvailable")
    public Boolean getParkingAvailable() {
        return parkingAvailable;
    }

    /**
     * parking availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresParkingAvailable")
    public void setParkingAvailable(Boolean parkingAvailable) {
        this.parkingAvailable = parkingAvailable;
    }

    public HomeFeatures withParkingAvailable(Boolean parkingAvailable) {
        this.parkingAvailable = parkingAvailable;
        return this;
    }

    /**
     * penthouse
     * <p>
     * flat on the top floor
     * 
     */
    @JsonProperty("featuresPenthouse")
    public Boolean getPenthouse() {
        return penthouse;
    }

    /**
     * penthouse
     * <p>
     * flat on the top floor
     * 
     */
    @JsonProperty("featuresPenthouse")
    public void setPenthouse(Boolean penthouse) {
        this.penthouse = penthouse;
    }

    public HomeFeatures withPenthouse(Boolean penthouse) {
        this.penthouse = penthouse;
        return this;
    }

    /**
     * pets allowed
     * <p>
     * pet friendly flat
     * 
     */
    @JsonProperty("featuresPetsAllowed")
    public Boolean getPetsAllowed() {
        return petsAllowed;
    }

    /**
     * pets allowed
     * <p>
     * pet friendly flat
     * 
     */
    @JsonProperty("featuresPetsAllowed")
    public void setPetsAllowed(Boolean petsAllowed) {
        this.petsAllowed = petsAllowed;
    }

    public HomeFeatures withPetsAllowed(Boolean petsAllowed) {
        this.petsAllowed = petsAllowed;
        return this;
    }

    /**
     * pool availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresPool")
    public Boolean getPool() {
        return pool;
    }

    /**
     * pool availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresPool")
    public void setPool(Boolean pool) {
        this.pool = pool;
    }

    public HomeFeatures withPool(Boolean pool) {
        this.pool = pool;
        return this;
    }

    @JsonProperty("featuresRooms")
    public BigInteger getRooms() {
        return rooms;
    }

    @JsonProperty("featuresRooms")
    public void setRooms(BigInteger rooms) {
        this.rooms = rooms;
    }

    public HomeFeatures withRooms(BigInteger rooms) {
        this.rooms = rooms;
        return this;
    }

    /**
     * storage room
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresStorage")
    public Boolean getStorage() {
        return storage;
    }

    /**
     * storage room
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresStorage")
    public void setStorage(Boolean storage) {
        this.storage = storage;
    }

    public HomeFeatures withStorage(Boolean storage) {
        this.storage = storage;
        return this;
    }

    /**
     * studio
     * <p>
     * flat with a single room
     * 
     */
    @JsonProperty("featuresStudio")
    public Boolean getStudio() {
        return studio;
    }

    /**
     * studio
     * <p>
     * flat with a single room
     * 
     */
    @JsonProperty("featuresStudio")
    public void setStudio(Boolean studio) {
        this.studio = studio;
    }

    public HomeFeatures withStudio(Boolean studio) {
        this.studio = studio;
        return this;
    }

    /**
     * terrace
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresTerrace")
    public Boolean getTerrace() {
        return terrace;
    }

    /**
     * terrace
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresTerrace")
    public void setTerrace(Boolean terrace) {
        this.terrace = terrace;
    }

    public HomeFeatures withTerrace(Boolean terrace) {
        this.terrace = terrace;
        return this;
    }

    /**
     * wardrobes availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresWardrobes")
    public Boolean getWardrobes() {
        return wardrobes;
    }

    /**
     * wardrobes availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresWardrobes")
    public void setWardrobes(Boolean wardrobes) {
        this.wardrobes = wardrobes;
    }

    public HomeFeatures withWardrobes(Boolean wardrobes) {
        this.wardrobes = wardrobes;
        return this;
    }

    /**
     * windows location
     * <p>
     * internal / external flat based on windows view. Only available for Spain.
     * 
     */
    @JsonProperty("featuresWindowsLocation")
    public WindowsLocationType getWindowsLocation() {
        return windowsLocation;
    }

    /**
     * windows location
     * <p>
     * internal / external flat based on windows view. Only available for Spain.
     * 
     */
    @JsonProperty("featuresWindowsLocation")
    public void setWindowsLocation(WindowsLocationType windowsLocation) {
        this.windowsLocation = windowsLocation;
    }

    public HomeFeatures withWindowsLocation(WindowsLocationType windowsLocation) {
        this.windowsLocation = windowsLocation;
        return this;
    }

    /**
     * heatingType
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresHeatingType")
    public HeatingType getHeatingType() {
        return heatingType;
    }

    /**
     * heatingType
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresHeatingType")
    public void setHeatingType(HeatingType heatingType) {
        this.heatingType = heatingType;
    }

    public HomeFeatures withHeatingType(HeatingType heatingType) {
        this.heatingType = heatingType;
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

    public HomeFeatures withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HomeFeatures.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("areaPlot");
        sb.append('=');
        sb.append(((this.areaPlot == null)?"<null>":this.areaPlot));
        sb.append(',');
        sb.append("areaUsable");
        sb.append('=');
        sb.append(((this.areaUsable == null)?"<null>":this.areaUsable));
        sb.append(',');
        sb.append("balcony");
        sb.append('=');
        sb.append(((this.balcony == null)?"<null>":this.balcony));
        sb.append(',');
        sb.append("bathroomNumber");
        sb.append('=');
        sb.append(((this.bathroomNumber == null)?"<null>":this.bathroomNumber));
        sb.append(',');
        sb.append("bedroomNumber");
        sb.append('=');
        sb.append(((this.bedroomNumber == null)?"<null>":this.bedroomNumber));
        sb.append(',');
        sb.append("builtYear");
        sb.append('=');
        sb.append(((this.builtYear == null)?"<null>":this.builtYear));
        sb.append(',');
        sb.append("conditionedAir");
        sb.append('=');
        sb.append(((this.conditionedAir == null)?"<null>":this.conditionedAir));
        sb.append(',');
        sb.append("conservation");
        sb.append('=');
        sb.append(((this.conservation == null)?"<null>":this.conservation));
        sb.append(',');
        sb.append("chimney");
        sb.append('=');
        sb.append(((this.chimney == null)?"<null>":this.chimney));
        sb.append(',');
        sb.append("doorman");
        sb.append('=');
        sb.append(((this.doorman == null)?"<null>":this.doorman));
        sb.append(',');
        sb.append("duplex");
        sb.append('=');
        sb.append(((this.duplex == null)?"<null>":this.duplex));
        sb.append(',');
        sb.append("equippedKitchen");
        sb.append('=');
        sb.append(((this.equippedKitchen == null)?"<null>":this.equippedKitchen));
        sb.append(',');
        sb.append("equippedWithFurniture");
        sb.append('=');
        sb.append(((this.equippedWithFurniture == null)?"<null>":this.equippedWithFurniture));
        sb.append(',');
        sb.append("energyCertificatePerformance");
        sb.append('=');
        sb.append(((this.energyCertificatePerformance == null)?"<null>":this.energyCertificatePerformance));
        sb.append(',');
        sb.append("energyCertificateLaw");
        sb.append('=');
        sb.append(((this.energyCertificateLaw == null)?"<null>":this.energyCertificateLaw));
        sb.append(',');
        sb.append("energyCertificateRating");
        sb.append('=');
        sb.append(((this.energyCertificateRating == null)?"<null>":this.energyCertificateRating));
        sb.append(',');
        sb.append("energyCertificateType");
        sb.append('=');
        sb.append(((this.energyCertificateType == null)?"<null>":this.energyCertificateType));
        sb.append(',');
        sb.append("floorsBuilding");
        sb.append('=');
        sb.append(((this.floorsBuilding == null)?"<null>":this.floorsBuilding));
        sb.append(',');
        sb.append("floorsInTop");
        sb.append('=');
        sb.append(((this.floorsInTop == null)?"<null>":this.floorsInTop));
        sb.append(',');
        sb.append("garden");
        sb.append('=');
        sb.append(((this.garden == null)?"<null>":this.garden));
        sb.append(',');
        sb.append("handicapAdaptedAccess");
        sb.append('=');
        sb.append(((this.handicapAdaptedAccess == null)?"<null>":this.handicapAdaptedAccess));
        sb.append(',');
        sb.append("handicapAdaptedUse");
        sb.append('=');
        sb.append(((this.handicapAdaptedUse == null)?"<null>":this.handicapAdaptedUse));
        sb.append(',');
        sb.append("liftAvailable");
        sb.append('=');
        sb.append(((this.liftAvailable == null)?"<null>":this.liftAvailable));
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
        sb.append("orientationEast");
        sb.append('=');
        sb.append(((this.orientationEast == null)?"<null>":this.orientationEast));
        sb.append(',');
        sb.append("parkingAvailable");
        sb.append('=');
        sb.append(((this.parkingAvailable == null)?"<null>":this.parkingAvailable));
        sb.append(',');
        sb.append("penthouse");
        sb.append('=');
        sb.append(((this.penthouse == null)?"<null>":this.penthouse));
        sb.append(',');
        sb.append("petsAllowed");
        sb.append('=');
        sb.append(((this.petsAllowed == null)?"<null>":this.petsAllowed));
        sb.append(',');
        sb.append("pool");
        sb.append('=');
        sb.append(((this.pool == null)?"<null>":this.pool));
        sb.append(',');
        sb.append("rooms");
        sb.append('=');
        sb.append(((this.rooms == null)?"<null>":this.rooms));
        sb.append(',');
        sb.append("storage");
        sb.append('=');
        sb.append(((this.storage == null)?"<null>":this.storage));
        sb.append(',');
        sb.append("studio");
        sb.append('=');
        sb.append(((this.studio == null)?"<null>":this.studio));
        sb.append(',');
        sb.append("terrace");
        sb.append('=');
        sb.append(((this.terrace == null)?"<null>":this.terrace));
        sb.append(',');
        sb.append("wardrobes");
        sb.append('=');
        sb.append(((this.wardrobes == null)?"<null>":this.wardrobes));
        sb.append(',');
        sb.append("windowsLocation");
        sb.append('=');
        sb.append(((this.windowsLocation == null)?"<null>":this.windowsLocation));
        sb.append(',');
        sb.append("heatingType");
        sb.append('=');
        sb.append(((this.heatingType == null)?"<null>":this.heatingType));
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
        result = ((result* 31)+((this.studio == null)? 0 :this.studio.hashCode()));
        result = ((result* 31)+((this.chimney == null)? 0 :this.chimney.hashCode()));
        result = ((result* 31)+((this.handicapAdaptedAccess == null)? 0 :this.handicapAdaptedAccess.hashCode()));
        result = ((result* 31)+((this.rooms == null)? 0 :this.rooms.hashCode()));
        result = ((result* 31)+((this.liftAvailable == null)? 0 :this.liftAvailable.hashCode()));
        result = ((result* 31)+((this.petsAllowed == null)? 0 :this.petsAllowed.hashCode()));
        result = ((result* 31)+((this.heatingType == null)? 0 :this.heatingType.hashCode()));
        result = ((result* 31)+((this.windowsLocation == null)? 0 :this.windowsLocation.hashCode()));
        result = ((result* 31)+((this.energyCertificateRating == null)? 0 :this.energyCertificateRating.hashCode()));
        result = ((result* 31)+((this.doorman == null)? 0 :this.doorman.hashCode()));
        result = ((result* 31)+((this.duplex == null)? 0 :this.duplex.hashCode()));
        result = ((result* 31)+((this.equippedKitchen == null)? 0 :this.equippedKitchen.hashCode()));
        result = ((result* 31)+((this.orientationSouth == null)? 0 :this.orientationSouth.hashCode()));
        result = ((result* 31)+((this.areaUsable == null)? 0 :this.areaUsable.hashCode()));
        result = ((result* 31)+((this.bathroomNumber == null)? 0 :this.bathroomNumber.hashCode()));
        result = ((result* 31)+((this.storage == null)? 0 :this.storage.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.areaConstructed == null)? 0 :this.areaConstructed.hashCode()));
        result = ((result* 31)+((this.balcony == null)? 0 :this.balcony.hashCode()));
        result = ((result* 31)+((this.penthouse == null)? 0 :this.penthouse.hashCode()));
        result = ((result* 31)+((this.orientationWest == null)? 0 :this.orientationWest.hashCode()));
        result = ((result* 31)+((this.orientationNorth == null)? 0 :this.orientationNorth.hashCode()));
        result = ((result* 31)+((this.bedroomNumber == null)? 0 :this.bedroomNumber.hashCode()));
        result = ((result* 31)+((this.energyCertificatePerformance == null)? 0 :this.energyCertificatePerformance.hashCode()));
        result = ((result* 31)+((this.terrace == null)? 0 :this.terrace.hashCode()));
        result = ((result* 31)+((this.areaPlot == null)? 0 :this.areaPlot.hashCode()));
        result = ((result* 31)+((this.floorsBuilding == null)? 0 :this.floorsBuilding.hashCode()));
        result = ((result* 31)+((this.pool == null)? 0 :this.pool.hashCode()));
        result = ((result* 31)+((this.orientationEast == null)? 0 :this.orientationEast.hashCode()));
        result = ((result* 31)+((this.equippedWithFurniture == null)? 0 :this.equippedWithFurniture.hashCode()));
        result = ((result* 31)+((this.floorsInTop == null)? 0 :this.floorsInTop.hashCode()));
        result = ((result* 31)+((this.parkingAvailable == null)? 0 :this.parkingAvailable.hashCode()));
        result = ((result* 31)+((this.wardrobes == null)? 0 :this.wardrobes.hashCode()));
        result = ((result* 31)+((this.conservation == null)? 0 :this.conservation.hashCode()));
        result = ((result* 31)+((this.energyCertificateLaw == null)? 0 :this.energyCertificateLaw.hashCode()));
        result = ((result* 31)+((this.conditionedAir == null)? 0 :this.conditionedAir.hashCode()));
        result = ((result* 31)+((this.energyCertificateType == null)? 0 :this.energyCertificateType.hashCode()));
        result = ((result* 31)+((this.builtYear == null)? 0 :this.builtYear.hashCode()));
        result = ((result* 31)+((this.garden == null)? 0 :this.garden.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.handicapAdaptedUse == null)? 0 :this.handicapAdaptedUse.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HomeFeatures) == false) {
            return false;
        }
        HomeFeatures rhs = ((HomeFeatures) other);
        return (((((((((((((((((((((((((((((((((((((((((super.equals(rhs)&&((this.studio == rhs.studio)||((this.studio!= null)&&this.studio.equals(rhs.studio))))&&((this.chimney == rhs.chimney)||((this.chimney!= null)&&this.chimney.equals(rhs.chimney))))&&((this.handicapAdaptedAccess == rhs.handicapAdaptedAccess)||((this.handicapAdaptedAccess!= null)&&this.handicapAdaptedAccess.equals(rhs.handicapAdaptedAccess))))&&((this.rooms == rhs.rooms)||((this.rooms!= null)&&this.rooms.equals(rhs.rooms))))&&((this.liftAvailable == rhs.liftAvailable)||((this.liftAvailable!= null)&&this.liftAvailable.equals(rhs.liftAvailable))))&&((this.petsAllowed == rhs.petsAllowed)||((this.petsAllowed!= null)&&this.petsAllowed.equals(rhs.petsAllowed))))&&((this.heatingType == rhs.heatingType)||((this.heatingType!= null)&&this.heatingType.equals(rhs.heatingType))))&&((this.windowsLocation == rhs.windowsLocation)||((this.windowsLocation!= null)&&this.windowsLocation.equals(rhs.windowsLocation))))&&((this.energyCertificateRating == rhs.energyCertificateRating)||((this.energyCertificateRating!= null)&&this.energyCertificateRating.equals(rhs.energyCertificateRating))))&&((this.doorman == rhs.doorman)||((this.doorman!= null)&&this.doorman.equals(rhs.doorman))))&&((this.duplex == rhs.duplex)||((this.duplex!= null)&&this.duplex.equals(rhs.duplex))))&&((this.equippedKitchen == rhs.equippedKitchen)||((this.equippedKitchen!= null)&&this.equippedKitchen.equals(rhs.equippedKitchen))))&&((this.orientationSouth == rhs.orientationSouth)||((this.orientationSouth!= null)&&this.orientationSouth.equals(rhs.orientationSouth))))&&((this.areaUsable == rhs.areaUsable)||((this.areaUsable!= null)&&this.areaUsable.equals(rhs.areaUsable))))&&((this.bathroomNumber == rhs.bathroomNumber)||((this.bathroomNumber!= null)&&this.bathroomNumber.equals(rhs.bathroomNumber))))&&((this.storage == rhs.storage)||((this.storage!= null)&&this.storage.equals(rhs.storage))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.areaConstructed == rhs.areaConstructed)||((this.areaConstructed!= null)&&this.areaConstructed.equals(rhs.areaConstructed))))&&((this.balcony == rhs.balcony)||((this.balcony!= null)&&this.balcony.equals(rhs.balcony))))&&((this.penthouse == rhs.penthouse)||((this.penthouse!= null)&&this.penthouse.equals(rhs.penthouse))))&&((this.orientationWest == rhs.orientationWest)||((this.orientationWest!= null)&&this.orientationWest.equals(rhs.orientationWest))))&&((this.orientationNorth == rhs.orientationNorth)||((this.orientationNorth!= null)&&this.orientationNorth.equals(rhs.orientationNorth))))&&((this.bedroomNumber == rhs.bedroomNumber)||((this.bedroomNumber!= null)&&this.bedroomNumber.equals(rhs.bedroomNumber))))&&((this.energyCertificatePerformance == rhs.energyCertificatePerformance)||((this.energyCertificatePerformance!= null)&&this.energyCertificatePerformance.equals(rhs.energyCertificatePerformance))))&&((this.terrace == rhs.terrace)||((this.terrace!= null)&&this.terrace.equals(rhs.terrace))))&&((this.areaPlot == rhs.areaPlot)||((this.areaPlot!= null)&&this.areaPlot.equals(rhs.areaPlot))))&&((this.floorsBuilding == rhs.floorsBuilding)||((this.floorsBuilding!= null)&&this.floorsBuilding.equals(rhs.floorsBuilding))))&&((this.pool == rhs.pool)||((this.pool!= null)&&this.pool.equals(rhs.pool))))&&((this.orientationEast == rhs.orientationEast)||((this.orientationEast!= null)&&this.orientationEast.equals(rhs.orientationEast))))&&((this.equippedWithFurniture == rhs.equippedWithFurniture)||((this.equippedWithFurniture!= null)&&this.equippedWithFurniture.equals(rhs.equippedWithFurniture))))&&((this.floorsInTop == rhs.floorsInTop)||((this.floorsInTop!= null)&&this.floorsInTop.equals(rhs.floorsInTop))))&&((this.parkingAvailable == rhs.parkingAvailable)||((this.parkingAvailable!= null)&&this.parkingAvailable.equals(rhs.parkingAvailable))))&&((this.wardrobes == rhs.wardrobes)||((this.wardrobes!= null)&&this.wardrobes.equals(rhs.wardrobes))))&&((this.conservation == rhs.conservation)||((this.conservation!= null)&&this.conservation.equals(rhs.conservation))))&&((this.energyCertificateLaw == rhs.energyCertificateLaw)||((this.energyCertificateLaw!= null)&&this.energyCertificateLaw.equals(rhs.energyCertificateLaw))))&&((this.conditionedAir == rhs.conditionedAir)||((this.conditionedAir!= null)&&this.conditionedAir.equals(rhs.conditionedAir))))&&((this.energyCertificateType == rhs.energyCertificateType)||((this.energyCertificateType!= null)&&this.energyCertificateType.equals(rhs.energyCertificateType))))&&((this.builtYear == rhs.builtYear)||((this.builtYear!= null)&&this.builtYear.equals(rhs.builtYear))))&&((this.garden == rhs.garden)||((this.garden!= null)&&this.garden.equals(rhs.garden))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.handicapAdaptedUse == rhs.handicapAdaptedUse)||((this.handicapAdaptedUse!= null)&&this.handicapAdaptedUse.equals(rhs.handicapAdaptedUse))));
    }


    /**
     * property types
     * <p>
     * Types availability varies between countries. Spain: rustic_rural, rustic_masia, rustic_cortijo, rustic_terrera, rustic_torre, rustic_caseron. Italy: house_villa, rustic_masseria, rustic_trullo, rustic_casalecascina, rustic_baita. Portugal: house_andar_moradia, rustic_quinta, rustic_moinho, rustic_montealentejano, rustic_solar. Spain and Portugal: rustic_palace.  The rest of the types is available in every country.
     * 
     */
    public enum Type {

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
        private final static Map<String, HomeFeatures.Type> CONSTANTS = new HashMap<String, HomeFeatures.Type>();

        static {
            for (HomeFeatures.Type c: values()) {
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
        public static HomeFeatures.Type fromValue(String value) {
            HomeFeatures.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
