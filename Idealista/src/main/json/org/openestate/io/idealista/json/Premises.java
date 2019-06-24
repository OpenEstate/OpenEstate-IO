
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
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonCreator;
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
public class Premises implements Serializable
{

    /**
     * premise types
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("featuresType")
    @NotNull
    @Nonnull
    private Premises.FeaturesType featuresType;
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
     * adapted bathroom
     * <p>
     * availability of adapted bathroom for disabled people
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresBathroomAdapted")
    @JsonPropertyDescription("availability of adapted bathroom for disabled people")
    private Boolean featuresBathroomAdapted;
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
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresFacadeArea")
    @DecimalMin("1")
    @DecimalMax("999")
    private BigInteger featuresFacadeArea;
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
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresLastActivity")
    @Pattern(regexp = "^.{0,100}$")
    private String featuresLastActivity;
    /**
     * located at corner
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresLocatedAtCorner")
    private Boolean featuresLocatedAtCorner;
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
     * smoke extraction
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresSmokeExtraction")
    private Boolean featuresSmokeExtraction;
    /**
     * ubication
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresUbication")
    private Premises.FeaturesUbication featuresUbication;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresWindowsNumber")
    @DecimalMin("1")
    @DecimalMax("999")
    private BigDecimal featuresWindowsNumber;
    private final static long serialVersionUID = -5227069705279300991L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Premises() {
    }

    /**
     * 
     * @param featuresType
     * @param featuresAreaConstructed
     */
    public Premises(Premises.FeaturesType featuresType, BigInteger featuresAreaConstructed) {
        super();
        this.featuresType = featuresType;
        this.featuresAreaConstructed = featuresAreaConstructed;
    }

    /**
     * premise types
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("featuresType")
    public Premises.FeaturesType getFeaturesType() {
        return featuresType;
    }

    /**
     * premise types
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("featuresType")
    public void setFeaturesType(Premises.FeaturesType featuresType) {
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
     * adapted bathroom
     * <p>
     * availability of adapted bathroom for disabled people
     * 
     */
    @JsonProperty("featuresBathroomAdapted")
    public Boolean getFeaturesBathroomAdapted() {
        return featuresBathroomAdapted;
    }

    /**
     * adapted bathroom
     * <p>
     * availability of adapted bathroom for disabled people
     * 
     */
    @JsonProperty("featuresBathroomAdapted")
    public void setFeaturesBathroomAdapted(Boolean featuresBathroomAdapted) {
        this.featuresBathroomAdapted = featuresBathroomAdapted;
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

    @JsonProperty("featuresFacadeArea")
    public BigInteger getFeaturesFacadeArea() {
        return featuresFacadeArea;
    }

    @JsonProperty("featuresFacadeArea")
    public void setFeaturesFacadeArea(BigInteger featuresFacadeArea) {
        this.featuresFacadeArea = featuresFacadeArea;
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

    @JsonProperty("featuresLastActivity")
    public String getFeaturesLastActivity() {
        return featuresLastActivity;
    }

    @JsonProperty("featuresLastActivity")
    public void setFeaturesLastActivity(String featuresLastActivity) {
        this.featuresLastActivity = featuresLastActivity;
    }

    /**
     * located at corner
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresLocatedAtCorner")
    public Boolean getFeaturesLocatedAtCorner() {
        return featuresLocatedAtCorner;
    }

    /**
     * located at corner
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresLocatedAtCorner")
    public void setFeaturesLocatedAtCorner(Boolean featuresLocatedAtCorner) {
        this.featuresLocatedAtCorner = featuresLocatedAtCorner;
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
     * smoke extraction
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSmokeExtraction")
    public Boolean getFeaturesSmokeExtraction() {
        return featuresSmokeExtraction;
    }

    /**
     * smoke extraction
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSmokeExtraction")
    public void setFeaturesSmokeExtraction(Boolean featuresSmokeExtraction) {
        this.featuresSmokeExtraction = featuresSmokeExtraction;
    }

    /**
     * ubication
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresUbication")
    public Premises.FeaturesUbication getFeaturesUbication() {
        return featuresUbication;
    }

    /**
     * ubication
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresUbication")
    public void setFeaturesUbication(Premises.FeaturesUbication featuresUbication) {
        this.featuresUbication = featuresUbication;
    }

    @JsonProperty("featuresWindowsNumber")
    public BigDecimal getFeaturesWindowsNumber() {
        return featuresWindowsNumber;
    }

    @JsonProperty("featuresWindowsNumber")
    public void setFeaturesWindowsNumber(BigDecimal featuresWindowsNumber) {
        this.featuresWindowsNumber = featuresWindowsNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Premises.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("featuresBathroomAdapted");
        sb.append('=');
        sb.append(((this.featuresBathroomAdapted == null)?"<null>":this.featuresBathroomAdapted));
        sb.append(',');
        sb.append("featuresBathroomNumber");
        sb.append('=');
        sb.append(((this.featuresBathroomNumber == null)?"<null>":this.featuresBathroomNumber));
        sb.append(',');
        sb.append("featuresConditionedAir");
        sb.append('=');
        sb.append(((this.featuresConditionedAir == null)?"<null>":this.featuresConditionedAir));
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
        sb.append("featuresEquippedKitchen");
        sb.append('=');
        sb.append(((this.featuresEquippedKitchen == null)?"<null>":this.featuresEquippedKitchen));
        sb.append(',');
        sb.append("featuresFacadeArea");
        sb.append('=');
        sb.append(((this.featuresFacadeArea == null)?"<null>":this.featuresFacadeArea));
        sb.append(',');
        sb.append("featuresFloorsBuilding");
        sb.append('=');
        sb.append(((this.featuresFloorsBuilding == null)?"<null>":this.featuresFloorsBuilding));
        sb.append(',');
        sb.append("featuresHeating");
        sb.append('=');
        sb.append(((this.featuresHeating == null)?"<null>":this.featuresHeating));
        sb.append(',');
        sb.append("featuresLastActivity");
        sb.append('=');
        sb.append(((this.featuresLastActivity == null)?"<null>":this.featuresLastActivity));
        sb.append(',');
        sb.append("featuresLocatedAtCorner");
        sb.append('=');
        sb.append(((this.featuresLocatedAtCorner == null)?"<null>":this.featuresLocatedAtCorner));
        sb.append(',');
        sb.append("featuresRooms");
        sb.append('=');
        sb.append(((this.featuresRooms == null)?"<null>":this.featuresRooms));
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
        sb.append("featuresStorage");
        sb.append('=');
        sb.append(((this.featuresStorage == null)?"<null>":this.featuresStorage));
        sb.append(',');
        sb.append("featuresSmokeExtraction");
        sb.append('=');
        sb.append(((this.featuresSmokeExtraction == null)?"<null>":this.featuresSmokeExtraction));
        sb.append(',');
        sb.append("featuresUbication");
        sb.append('=');
        sb.append(((this.featuresUbication == null)?"<null>":this.featuresUbication));
        sb.append(',');
        sb.append("featuresWindowsNumber");
        sb.append('=');
        sb.append(((this.featuresWindowsNumber == null)?"<null>":this.featuresWindowsNumber));
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
        result = ((result* 31)+((this.featuresEquippedKitchen == null)? 0 :this.featuresEquippedKitchen.hashCode()));
        result = ((result* 31)+((this.featuresEnergyCertificateRating == null)? 0 :this.featuresEnergyCertificateRating.hashCode()));
        result = ((result* 31)+((this.featuresType == null)? 0 :this.featuresType.hashCode()));
        result = ((result* 31)+((this.featuresEnergyCertificateType == null)? 0 :this.featuresEnergyCertificateType.hashCode()));
        result = ((result* 31)+((this.featuresAreaConstructed == null)? 0 :this.featuresAreaConstructed.hashCode()));
        result = ((result* 31)+((this.featuresAreaPlot == null)? 0 :this.featuresAreaPlot.hashCode()));
        result = ((result* 31)+((this.featuresSecurityDoor == null)? 0 :this.featuresSecurityDoor.hashCode()));
        result = ((result* 31)+((this.featuresBathroomNumber == null)? 0 :this.featuresBathroomNumber.hashCode()));
        result = ((result* 31)+((this.featuresSecurityAlarm == null)? 0 :this.featuresSecurityAlarm.hashCode()));
        result = ((result* 31)+((this.featuresConservation == null)? 0 :this.featuresConservation.hashCode()));
        result = ((result* 31)+((this.featuresSmokeExtraction == null)? 0 :this.featuresSmokeExtraction.hashCode()));
        result = ((result* 31)+((this.featuresLastActivity == null)? 0 :this.featuresLastActivity.hashCode()));
        result = ((result* 31)+((this.featuresUbication == null)? 0 :this.featuresUbication.hashCode()));
        result = ((result* 31)+((this.featuresAreaUsable == null)? 0 :this.featuresAreaUsable.hashCode()));
        result = ((result* 31)+((this.featuresEnergyCertificateLaw == null)? 0 :this.featuresEnergyCertificateLaw.hashCode()));
        result = ((result* 31)+((this.featuresBathroomAdapted == null)? 0 :this.featuresBathroomAdapted.hashCode()));
        result = ((result* 31)+((this.featuresFloorsBuilding == null)? 0 :this.featuresFloorsBuilding.hashCode()));
        result = ((result* 31)+((this.featuresFacadeArea == null)? 0 :this.featuresFacadeArea.hashCode()));
        result = ((result* 31)+((this.featuresStorage == null)? 0 :this.featuresStorage.hashCode()));
        result = ((result* 31)+((this.featuresSecuritySystem == null)? 0 :this.featuresSecuritySystem.hashCode()));
        result = ((result* 31)+((this.featuresLocatedAtCorner == null)? 0 :this.featuresLocatedAtCorner.hashCode()));
        result = ((result* 31)+((this.featuresRooms == null)? 0 :this.featuresRooms.hashCode()));
        result = ((result* 31)+((this.featuresEnergyCertificatePerformance == null)? 0 :this.featuresEnergyCertificatePerformance.hashCode()));
        result = ((result* 31)+((this.featuresHeating == null)? 0 :this.featuresHeating.hashCode()));
        result = ((result* 31)+((this.featuresConditionedAir == null)? 0 :this.featuresConditionedAir.hashCode()));
        result = ((result* 31)+((this.featuresWindowsNumber == null)? 0 :this.featuresWindowsNumber.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Premises) == false) {
            return false;
        }
        Premises rhs = ((Premises) other);
        return (((((((((((((((((((((((((((this.featuresEquippedKitchen == rhs.featuresEquippedKitchen)||((this.featuresEquippedKitchen!= null)&&this.featuresEquippedKitchen.equals(rhs.featuresEquippedKitchen)))&&((this.featuresEnergyCertificateRating == rhs.featuresEnergyCertificateRating)||((this.featuresEnergyCertificateRating!= null)&&this.featuresEnergyCertificateRating.equals(rhs.featuresEnergyCertificateRating))))&&((this.featuresType == rhs.featuresType)||((this.featuresType!= null)&&this.featuresType.equals(rhs.featuresType))))&&((this.featuresEnergyCertificateType == rhs.featuresEnergyCertificateType)||((this.featuresEnergyCertificateType!= null)&&this.featuresEnergyCertificateType.equals(rhs.featuresEnergyCertificateType))))&&((this.featuresAreaConstructed == rhs.featuresAreaConstructed)||((this.featuresAreaConstructed!= null)&&this.featuresAreaConstructed.equals(rhs.featuresAreaConstructed))))&&((this.featuresAreaPlot == rhs.featuresAreaPlot)||((this.featuresAreaPlot!= null)&&this.featuresAreaPlot.equals(rhs.featuresAreaPlot))))&&((this.featuresSecurityDoor == rhs.featuresSecurityDoor)||((this.featuresSecurityDoor!= null)&&this.featuresSecurityDoor.equals(rhs.featuresSecurityDoor))))&&((this.featuresBathroomNumber == rhs.featuresBathroomNumber)||((this.featuresBathroomNumber!= null)&&this.featuresBathroomNumber.equals(rhs.featuresBathroomNumber))))&&((this.featuresSecurityAlarm == rhs.featuresSecurityAlarm)||((this.featuresSecurityAlarm!= null)&&this.featuresSecurityAlarm.equals(rhs.featuresSecurityAlarm))))&&((this.featuresConservation == rhs.featuresConservation)||((this.featuresConservation!= null)&&this.featuresConservation.equals(rhs.featuresConservation))))&&((this.featuresSmokeExtraction == rhs.featuresSmokeExtraction)||((this.featuresSmokeExtraction!= null)&&this.featuresSmokeExtraction.equals(rhs.featuresSmokeExtraction))))&&((this.featuresLastActivity == rhs.featuresLastActivity)||((this.featuresLastActivity!= null)&&this.featuresLastActivity.equals(rhs.featuresLastActivity))))&&((this.featuresUbication == rhs.featuresUbication)||((this.featuresUbication!= null)&&this.featuresUbication.equals(rhs.featuresUbication))))&&((this.featuresAreaUsable == rhs.featuresAreaUsable)||((this.featuresAreaUsable!= null)&&this.featuresAreaUsable.equals(rhs.featuresAreaUsable))))&&((this.featuresEnergyCertificateLaw == rhs.featuresEnergyCertificateLaw)||((this.featuresEnergyCertificateLaw!= null)&&this.featuresEnergyCertificateLaw.equals(rhs.featuresEnergyCertificateLaw))))&&((this.featuresBathroomAdapted == rhs.featuresBathroomAdapted)||((this.featuresBathroomAdapted!= null)&&this.featuresBathroomAdapted.equals(rhs.featuresBathroomAdapted))))&&((this.featuresFloorsBuilding == rhs.featuresFloorsBuilding)||((this.featuresFloorsBuilding!= null)&&this.featuresFloorsBuilding.equals(rhs.featuresFloorsBuilding))))&&((this.featuresFacadeArea == rhs.featuresFacadeArea)||((this.featuresFacadeArea!= null)&&this.featuresFacadeArea.equals(rhs.featuresFacadeArea))))&&((this.featuresStorage == rhs.featuresStorage)||((this.featuresStorage!= null)&&this.featuresStorage.equals(rhs.featuresStorage))))&&((this.featuresSecuritySystem == rhs.featuresSecuritySystem)||((this.featuresSecuritySystem!= null)&&this.featuresSecuritySystem.equals(rhs.featuresSecuritySystem))))&&((this.featuresLocatedAtCorner == rhs.featuresLocatedAtCorner)||((this.featuresLocatedAtCorner!= null)&&this.featuresLocatedAtCorner.equals(rhs.featuresLocatedAtCorner))))&&((this.featuresRooms == rhs.featuresRooms)||((this.featuresRooms!= null)&&this.featuresRooms.equals(rhs.featuresRooms))))&&((this.featuresEnergyCertificatePerformance == rhs.featuresEnergyCertificatePerformance)||((this.featuresEnergyCertificatePerformance!= null)&&this.featuresEnergyCertificatePerformance.equals(rhs.featuresEnergyCertificatePerformance))))&&((this.featuresHeating == rhs.featuresHeating)||((this.featuresHeating!= null)&&this.featuresHeating.equals(rhs.featuresHeating))))&&((this.featuresConditionedAir == rhs.featuresConditionedAir)||((this.featuresConditionedAir!= null)&&this.featuresConditionedAir.equals(rhs.featuresConditionedAir))))&&((this.featuresWindowsNumber == rhs.featuresWindowsNumber)||((this.featuresWindowsNumber!= null)&&this.featuresWindowsNumber.equals(rhs.featuresWindowsNumber))));
    }

    public enum FeaturesType {

        PREMISES("premises"),
        PREMISES_COMMERCIAL("premises_commercial"),
        PREMISES_INDUSTRIAL("premises_industrial");
        private final String value;
        private final static Map<String, Premises.FeaturesType> CONSTANTS = new HashMap<String, Premises.FeaturesType>();

        static {
            for (Premises.FeaturesType c: values()) {
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
        public static Premises.FeaturesType fromValue(String value) {
            Premises.FeaturesType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum FeaturesUbication {

        SHOPPING("shopping"),
        STREET("street"),
        MEZZANINE("mezzanine"),
        BELOW_GROUND("belowGround"),
        OTHER("other"),
        UNKNOWN("unknown");
        private final String value;
        private final static Map<String, Premises.FeaturesUbication> CONSTANTS = new HashMap<String, Premises.FeaturesUbication>();

        static {
            for (Premises.FeaturesUbication c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private FeaturesUbication(String value) {
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
        public static Premises.FeaturesUbication fromValue(String value) {
            Premises.FeaturesUbication constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
