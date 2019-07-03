
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
import javax.validation.constraints.Pattern;
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
 * Premises Object
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
    "featuresBathroomAdapted",
    "featuresBathroomNumber",
    "featuresConditionedAir",
    "featuresConservation",
    "featuresEnergyCertificateRating",
    "featuresEnergyCertificatePerformance",
    "featuresEnergyCertificateType",
    "featuresEnergyCertificateLaw",
    "featuresEquippedKitchen",
    "featuresFacadeArea",
    "featuresFloorsBuilding",
    "featuresHeating",
    "featuresLastActivity",
    "featuresLocatedAtCorner",
    "featuresRooms",
    "featuresSecurityAlarm",
    "featuresSecurityDoor",
    "featuresSecuritySystem",
    "featuresStorage",
    "featuresSmokeExtraction",
    "featuresUbication",
    "featuresWindowsNumber"
})
public class PremiseFeatures
    extends AbstractFeatures
    implements Serializable
{

    /**
     * premise types
     * <p>
     * 
     * Corresponds to the "featuresType" property.
     * (Required)
     * 
     */
    @JsonProperty("featuresType")
    @NotNull
    @Nonnull
    private PremiseFeatures.Type type;
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
     * adapted bathroom
     * <p>
     * availability of adapted bathroom for disabled people
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresBathroomAdapted")
    @JsonPropertyDescription("availability of adapted bathroom for disabled people")
    private Boolean bathroomAdapted;
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
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresFacadeArea")
    @DecimalMin("1")
    @DecimalMax("999")
    private BigInteger facadeArea;
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
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresLastActivity")
    @Pattern(regexp = "^.{0,100}$")
    private String lastActivity;
    /**
     * located at corner
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresLocatedAtCorner")
    private Boolean locatedAtCorner;
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
     * smoke extraction
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresSmokeExtraction")
    private Boolean smokeExtraction;
    /**
     * ubication
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresUbication")
    private UbicationType ubication;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresWindowsNumber")
    @DecimalMin("1")
    @DecimalMax("999")
    private BigDecimal windowsNumber;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4696725558880422646L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PremiseFeatures() {
    }

    /**
     * 
     * @param type
     * @param areaConstructed
     */
    public PremiseFeatures(PremiseFeatures.Type type, BigInteger areaConstructed) {
        super();
        this.type = type;
        this.areaConstructed = areaConstructed;
    }

    /**
     * premise types
     * <p>
     * 
     * Corresponds to the "featuresType" property.
     * (Required)
     * 
     */
    @JsonProperty("featuresType")
    public PremiseFeatures.Type getType() {
        return type;
    }

    /**
     * premise types
     * <p>
     * 
     * Corresponds to the "featuresType" property.
     * (Required)
     * 
     */
    @JsonProperty("featuresType")
    public void setType(PremiseFeatures.Type type) {
        this.type = type;
    }

    public PremiseFeatures withType(PremiseFeatures.Type type) {
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

    public PremiseFeatures withAreaConstructed(BigInteger areaConstructed) {
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

    public PremiseFeatures withAreaPlot(BigInteger areaPlot) {
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

    public PremiseFeatures withAreaUsable(BigInteger areaUsable) {
        this.areaUsable = areaUsable;
        return this;
    }

    /**
     * adapted bathroom
     * <p>
     * availability of adapted bathroom for disabled people
     * 
     */
    @JsonProperty("featuresBathroomAdapted")
    public Boolean getBathroomAdapted() {
        return bathroomAdapted;
    }

    /**
     * adapted bathroom
     * <p>
     * availability of adapted bathroom for disabled people
     * 
     */
    @JsonProperty("featuresBathroomAdapted")
    public void setBathroomAdapted(Boolean bathroomAdapted) {
        this.bathroomAdapted = bathroomAdapted;
    }

    public PremiseFeatures withBathroomAdapted(Boolean bathroomAdapted) {
        this.bathroomAdapted = bathroomAdapted;
        return this;
    }

    @JsonProperty("featuresBathroomNumber")
    public BigInteger getBathroomNumber() {
        return bathroomNumber;
    }

    @JsonProperty("featuresBathroomNumber")
    public void setBathroomNumber(BigInteger bathroomNumber) {
        this.bathroomNumber = bathroomNumber;
    }

    public PremiseFeatures withBathroomNumber(BigInteger bathroomNumber) {
        this.bathroomNumber = bathroomNumber;
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

    public PremiseFeatures withConditionedAir(Boolean conditionedAir) {
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

    public PremiseFeatures withConservation(ConservationType conservation) {
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

    public PremiseFeatures withEnergyCertificateRating(EnergyCertificateRatingType energyCertificateRating) {
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

    public PremiseFeatures withEnergyCertificatePerformance(BigDecimal energyCertificatePerformance) {
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

    public PremiseFeatures withEnergyCertificateType(EnergyCertificateType energyCertificateType) {
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

    public PremiseFeatures withEnergyCertificateLaw(EnergyCertificateLawType energyCertificateLaw) {
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

    public PremiseFeatures withEquippedKitchen(Boolean equippedKitchen) {
        this.equippedKitchen = equippedKitchen;
        return this;
    }

    @JsonProperty("featuresFacadeArea")
    public BigInteger getFacadeArea() {
        return facadeArea;
    }

    @JsonProperty("featuresFacadeArea")
    public void setFacadeArea(BigInteger facadeArea) {
        this.facadeArea = facadeArea;
    }

    public PremiseFeatures withFacadeArea(BigInteger facadeArea) {
        this.facadeArea = facadeArea;
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

    public PremiseFeatures withFloorsBuilding(BigInteger floorsBuilding) {
        this.floorsBuilding = floorsBuilding;
        return this;
    }

    /**
     * heating
     * <p>
     * heating availability
     * 
     */
    @JsonProperty("featuresHeating")
    public Boolean getHeating() {
        return heating;
    }

    /**
     * heating
     * <p>
     * heating availability
     * 
     */
    @JsonProperty("featuresHeating")
    public void setHeating(Boolean heating) {
        this.heating = heating;
    }

    public PremiseFeatures withHeating(Boolean heating) {
        this.heating = heating;
        return this;
    }

    @JsonProperty("featuresLastActivity")
    public String getLastActivity() {
        return lastActivity;
    }

    @JsonProperty("featuresLastActivity")
    public void setLastActivity(String lastActivity) {
        this.lastActivity = lastActivity;
    }

    public PremiseFeatures withLastActivity(String lastActivity) {
        this.lastActivity = lastActivity;
        return this;
    }

    /**
     * located at corner
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresLocatedAtCorner")
    public Boolean getLocatedAtCorner() {
        return locatedAtCorner;
    }

    /**
     * located at corner
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresLocatedAtCorner")
    public void setLocatedAtCorner(Boolean locatedAtCorner) {
        this.locatedAtCorner = locatedAtCorner;
    }

    public PremiseFeatures withLocatedAtCorner(Boolean locatedAtCorner) {
        this.locatedAtCorner = locatedAtCorner;
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

    public PremiseFeatures withRooms(BigInteger rooms) {
        this.rooms = rooms;
        return this;
    }

    /**
     * security alarm system
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSecurityAlarm")
    public Boolean getSecurityAlarm() {
        return securityAlarm;
    }

    /**
     * security alarm system
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSecurityAlarm")
    public void setSecurityAlarm(Boolean securityAlarm) {
        this.securityAlarm = securityAlarm;
    }

    public PremiseFeatures withSecurityAlarm(Boolean securityAlarm) {
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
    public Boolean getSecurityDoor() {
        return securityDoor;
    }

    /**
     * security door
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSecurityDoor")
    public void setSecurityDoor(Boolean securityDoor) {
        this.securityDoor = securityDoor;
    }

    public PremiseFeatures withSecurityDoor(Boolean securityDoor) {
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
    public Boolean getSecuritySystem() {
        return securitySystem;
    }

    /**
     * security system
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSecuritySystem")
    public void setSecuritySystem(Boolean securitySystem) {
        this.securitySystem = securitySystem;
    }

    public PremiseFeatures withSecuritySystem(Boolean securitySystem) {
        this.securitySystem = securitySystem;
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

    public PremiseFeatures withStorage(Boolean storage) {
        this.storage = storage;
        return this;
    }

    /**
     * smoke extraction
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSmokeExtraction")
    public Boolean getSmokeExtraction() {
        return smokeExtraction;
    }

    /**
     * smoke extraction
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSmokeExtraction")
    public void setSmokeExtraction(Boolean smokeExtraction) {
        this.smokeExtraction = smokeExtraction;
    }

    public PremiseFeatures withSmokeExtraction(Boolean smokeExtraction) {
        this.smokeExtraction = smokeExtraction;
        return this;
    }

    /**
     * ubication
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresUbication")
    public UbicationType getUbication() {
        return ubication;
    }

    /**
     * ubication
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresUbication")
    public void setUbication(UbicationType ubication) {
        this.ubication = ubication;
    }

    public PremiseFeatures withUbication(UbicationType ubication) {
        this.ubication = ubication;
        return this;
    }

    @JsonProperty("featuresWindowsNumber")
    public BigDecimal getWindowsNumber() {
        return windowsNumber;
    }

    @JsonProperty("featuresWindowsNumber")
    public void setWindowsNumber(BigDecimal windowsNumber) {
        this.windowsNumber = windowsNumber;
    }

    public PremiseFeatures withWindowsNumber(BigDecimal windowsNumber) {
        this.windowsNumber = windowsNumber;
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

    public PremiseFeatures withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PremiseFeatures.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("bathroomAdapted");
        sb.append('=');
        sb.append(((this.bathroomAdapted == null)?"<null>":this.bathroomAdapted));
        sb.append(',');
        sb.append("bathroomNumber");
        sb.append('=');
        sb.append(((this.bathroomNumber == null)?"<null>":this.bathroomNumber));
        sb.append(',');
        sb.append("conditionedAir");
        sb.append('=');
        sb.append(((this.conditionedAir == null)?"<null>":this.conditionedAir));
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
        sb.append("equippedKitchen");
        sb.append('=');
        sb.append(((this.equippedKitchen == null)?"<null>":this.equippedKitchen));
        sb.append(',');
        sb.append("facadeArea");
        sb.append('=');
        sb.append(((this.facadeArea == null)?"<null>":this.facadeArea));
        sb.append(',');
        sb.append("floorsBuilding");
        sb.append('=');
        sb.append(((this.floorsBuilding == null)?"<null>":this.floorsBuilding));
        sb.append(',');
        sb.append("heating");
        sb.append('=');
        sb.append(((this.heating == null)?"<null>":this.heating));
        sb.append(',');
        sb.append("lastActivity");
        sb.append('=');
        sb.append(((this.lastActivity == null)?"<null>":this.lastActivity));
        sb.append(',');
        sb.append("locatedAtCorner");
        sb.append('=');
        sb.append(((this.locatedAtCorner == null)?"<null>":this.locatedAtCorner));
        sb.append(',');
        sb.append("rooms");
        sb.append('=');
        sb.append(((this.rooms == null)?"<null>":this.rooms));
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
        sb.append("storage");
        sb.append('=');
        sb.append(((this.storage == null)?"<null>":this.storage));
        sb.append(',');
        sb.append("smokeExtraction");
        sb.append('=');
        sb.append(((this.smokeExtraction == null)?"<null>":this.smokeExtraction));
        sb.append(',');
        sb.append("ubication");
        sb.append('=');
        sb.append(((this.ubication == null)?"<null>":this.ubication));
        sb.append(',');
        sb.append("windowsNumber");
        sb.append('=');
        sb.append(((this.windowsNumber == null)?"<null>":this.windowsNumber));
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
        result = ((result* 31)+((this.rooms == null)? 0 :this.rooms.hashCode()));
        result = ((result* 31)+((this.energyCertificateRating == null)? 0 :this.energyCertificateRating.hashCode()));
        result = ((result* 31)+((this.equippedKitchen == null)? 0 :this.equippedKitchen.hashCode()));
        result = ((result* 31)+((this.areaUsable == null)? 0 :this.areaUsable.hashCode()));
        result = ((result* 31)+((this.bathroomNumber == null)? 0 :this.bathroomNumber.hashCode()));
        result = ((result* 31)+((this.storage == null)? 0 :this.storage.hashCode()));
        result = ((result* 31)+((this.ubication == null)? 0 :this.ubication.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.areaConstructed == null)? 0 :this.areaConstructed.hashCode()));
        result = ((result* 31)+((this.windowsNumber == null)? 0 :this.windowsNumber.hashCode()));
        result = ((result* 31)+((this.smokeExtraction == null)? 0 :this.smokeExtraction.hashCode()));
        result = ((result* 31)+((this.facadeArea == null)? 0 :this.facadeArea.hashCode()));
        result = ((result* 31)+((this.energyCertificatePerformance == null)? 0 :this.energyCertificatePerformance.hashCode()));
        result = ((result* 31)+((this.heating == null)? 0 :this.heating.hashCode()));
        result = ((result* 31)+((this.areaPlot == null)? 0 :this.areaPlot.hashCode()));
        result = ((result* 31)+((this.bathroomAdapted == null)? 0 :this.bathroomAdapted.hashCode()));
        result = ((result* 31)+((this.floorsBuilding == null)? 0 :this.floorsBuilding.hashCode()));
        result = ((result* 31)+((this.securitySystem == null)? 0 :this.securitySystem.hashCode()));
        result = ((result* 31)+((this.locatedAtCorner == null)? 0 :this.locatedAtCorner.hashCode()));
        result = ((result* 31)+((this.securityDoor == null)? 0 :this.securityDoor.hashCode()));
        result = ((result* 31)+((this.securityAlarm == null)? 0 :this.securityAlarm.hashCode()));
        result = ((result* 31)+((this.conservation == null)? 0 :this.conservation.hashCode()));
        result = ((result* 31)+((this.energyCertificateLaw == null)? 0 :this.energyCertificateLaw.hashCode()));
        result = ((result* 31)+((this.conditionedAir == null)? 0 :this.conditionedAir.hashCode()));
        result = ((result* 31)+((this.energyCertificateType == null)? 0 :this.energyCertificateType.hashCode()));
        result = ((result* 31)+((this.lastActivity == null)? 0 :this.lastActivity.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PremiseFeatures) == false) {
            return false;
        }
        PremiseFeatures rhs = ((PremiseFeatures) other);
        return (((((((((((((((((((((((((((super.equals(rhs)&&((this.rooms == rhs.rooms)||((this.rooms!= null)&&this.rooms.equals(rhs.rooms))))&&((this.energyCertificateRating == rhs.energyCertificateRating)||((this.energyCertificateRating!= null)&&this.energyCertificateRating.equals(rhs.energyCertificateRating))))&&((this.equippedKitchen == rhs.equippedKitchen)||((this.equippedKitchen!= null)&&this.equippedKitchen.equals(rhs.equippedKitchen))))&&((this.areaUsable == rhs.areaUsable)||((this.areaUsable!= null)&&this.areaUsable.equals(rhs.areaUsable))))&&((this.bathroomNumber == rhs.bathroomNumber)||((this.bathroomNumber!= null)&&this.bathroomNumber.equals(rhs.bathroomNumber))))&&((this.storage == rhs.storage)||((this.storage!= null)&&this.storage.equals(rhs.storage))))&&((this.ubication == rhs.ubication)||((this.ubication!= null)&&this.ubication.equals(rhs.ubication))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.areaConstructed == rhs.areaConstructed)||((this.areaConstructed!= null)&&this.areaConstructed.equals(rhs.areaConstructed))))&&((this.windowsNumber == rhs.windowsNumber)||((this.windowsNumber!= null)&&this.windowsNumber.equals(rhs.windowsNumber))))&&((this.smokeExtraction == rhs.smokeExtraction)||((this.smokeExtraction!= null)&&this.smokeExtraction.equals(rhs.smokeExtraction))))&&((this.facadeArea == rhs.facadeArea)||((this.facadeArea!= null)&&this.facadeArea.equals(rhs.facadeArea))))&&((this.energyCertificatePerformance == rhs.energyCertificatePerformance)||((this.energyCertificatePerformance!= null)&&this.energyCertificatePerformance.equals(rhs.energyCertificatePerformance))))&&((this.heating == rhs.heating)||((this.heating!= null)&&this.heating.equals(rhs.heating))))&&((this.areaPlot == rhs.areaPlot)||((this.areaPlot!= null)&&this.areaPlot.equals(rhs.areaPlot))))&&((this.bathroomAdapted == rhs.bathroomAdapted)||((this.bathroomAdapted!= null)&&this.bathroomAdapted.equals(rhs.bathroomAdapted))))&&((this.floorsBuilding == rhs.floorsBuilding)||((this.floorsBuilding!= null)&&this.floorsBuilding.equals(rhs.floorsBuilding))))&&((this.securitySystem == rhs.securitySystem)||((this.securitySystem!= null)&&this.securitySystem.equals(rhs.securitySystem))))&&((this.locatedAtCorner == rhs.locatedAtCorner)||((this.locatedAtCorner!= null)&&this.locatedAtCorner.equals(rhs.locatedAtCorner))))&&((this.securityDoor == rhs.securityDoor)||((this.securityDoor!= null)&&this.securityDoor.equals(rhs.securityDoor))))&&((this.securityAlarm == rhs.securityAlarm)||((this.securityAlarm!= null)&&this.securityAlarm.equals(rhs.securityAlarm))))&&((this.conservation == rhs.conservation)||((this.conservation!= null)&&this.conservation.equals(rhs.conservation))))&&((this.energyCertificateLaw == rhs.energyCertificateLaw)||((this.energyCertificateLaw!= null)&&this.energyCertificateLaw.equals(rhs.energyCertificateLaw))))&&((this.conditionedAir == rhs.conditionedAir)||((this.conditionedAir!= null)&&this.conditionedAir.equals(rhs.conditionedAir))))&&((this.energyCertificateType == rhs.energyCertificateType)||((this.energyCertificateType!= null)&&this.energyCertificateType.equals(rhs.energyCertificateType))))&&((this.lastActivity == rhs.lastActivity)||((this.lastActivity!= null)&&this.lastActivity.equals(rhs.lastActivity))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

    public enum Type {

        PREMISES("premises"),
        PREMISES_COMMERCIAL("premises_commercial"),
        PREMISES_INDUSTRIAL("premises_industrial");
        private final String value;
        private final static Map<String, PremiseFeatures.Type> CONSTANTS = new HashMap<String, PremiseFeatures.Type>();

        static {
            for (PremiseFeatures.Type c: values()) {
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
        public static PremiseFeatures.Type fromValue(String value) {
            PremiseFeatures.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
