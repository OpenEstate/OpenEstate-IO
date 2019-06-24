
package org.openestate.io.idealista.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Promo Object
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "featuresType",
    "featuresEnergyCertificatePerformance",
    "featuresEnergyCertificateLaw",
    "featuresEnergyCertificateRating",
    "featuresEnergyCertificateType",
    "featuresLiftAvailable",
    "featuresDoorman",
    "featuresConservation",
    "featuresPool",
    "featuresGarden",
    "featuresSecurityDoor",
    "featuresSecurityAlarm",
    "featuresNewDevelopmentType",
    "featuresNewDevelopmentName",
    "featuresFinished",
    "featuresStartDate",
    "featuresKeyDeliveryYear",
    "featuresKeyDeliveryMonth",
    "featuresBuiltPhase",
    "featuresAvailabilityHour",
    "featuresAccessComments",
    "featuresOnSite",
    "featuresMortgageStateSubsidized",
    "featuresMortgageBankName",
    "featuresMortgagePercentage",
    "featuresMortgageEntryPercentage",
    "featuresMortgageLettersPercentage",
    "featuresMortgageInterestRate",
    "featuresMortgageYears"
})
public class PromoJson implements Serializable
{

    /**
     * property types
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresType")
    private PromoJson.FeaturesType featuresType;
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
     * Typing for new developments
     * (Required)
     * 
     */
    @JsonProperty("featuresNewDevelopmentType")
    @JsonPropertyDescription("Typing for new developments")
    @NotNull
    @Nonnull
    private PromoJson.EnumNewDevelopmentType featuresNewDevelopmentType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("featuresNewDevelopmentName")
    @Pattern(regexp = "^.{0,100}$")
    @NotNull
    @Nonnull
    private String featuresNewDevelopmentName;
    /**
     * is finished
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresFinished")
    private Boolean featuresFinished;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd", timezone = "UTC")
    @JsonProperty("featuresStartDate")
    private Date featuresStartDate;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresKeyDeliveryYear")
    @DecimalMin("1")
    @DecimalMax("9999")
    private BigInteger featuresKeyDeliveryYear;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresKeyDeliveryMonth")
    @DecimalMin("1")
    @DecimalMax("12")
    private BigDecimal featuresKeyDeliveryMonth;
    /**
     * Phase of built for new developments
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresBuiltPhase")
    @JsonPropertyDescription("Phase of built for new developments")
    private PromoJson.EnumFeaturesBuiltPhase featuresBuiltPhase;
    /**
     * Booth sales availability hour for new developments
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresAvailabilityHour")
    @JsonPropertyDescription("Booth sales availability hour for new developments")
    private PromoJson.EnumFeaturesAvailabilityHour featuresAvailabilityHour;
    /**
     * Access comments
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresAccessComments")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @Valid
    private Set<Object> featuresAccessComments = null;
    /**
     * Booth sale on side
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresOnSite")
    private Boolean featuresOnSite;
    /**
     * Mortgage state subsidized
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresMortgageStateSubsidized")
    private Boolean featuresMortgageStateSubsidized;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresMortgageBankName")
    @Pattern(regexp = "^.{0,100}$")
    private String featuresMortgageBankName;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresMortgagePercentage")
    @DecimalMin("1")
    @DecimalMax("999")
    private BigDecimal featuresMortgagePercentage;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresMortgageEntryPercentage")
    @DecimalMin("1")
    @DecimalMax("999")
    private BigDecimal featuresMortgageEntryPercentage;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresMortgageLettersPercentage")
    @DecimalMin("1")
    @DecimalMax("999")
    private BigDecimal featuresMortgageLettersPercentage;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresMortgageInterestRate")
    @DecimalMin("1")
    @DecimalMax("999")
    private BigDecimal featuresMortgageInterestRate;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresMortgageYears")
    @DecimalMin("1")
    @DecimalMax("9999")
    private BigDecimal featuresMortgageYears;
    private final static long serialVersionUID = 1539656525204470024L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PromoJson() {
    }

    /**
     * 
     * @param featuresNewDevelopmentName
     * @param featuresNewDevelopmentType
     */
    public PromoJson(PromoJson.EnumNewDevelopmentType featuresNewDevelopmentType, String featuresNewDevelopmentName) {
        super();
        this.featuresNewDevelopmentType = featuresNewDevelopmentType;
        this.featuresNewDevelopmentName = featuresNewDevelopmentName;
    }

    /**
     * property types
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresType")
    public PromoJson.FeaturesType getFeaturesType() {
        return featuresType;
    }

    /**
     * property types
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresType")
    public void setFeaturesType(PromoJson.FeaturesType featuresType) {
        this.featuresType = featuresType;
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
     * Typing for new developments
     * (Required)
     * 
     */
    @JsonProperty("featuresNewDevelopmentType")
    public PromoJson.EnumNewDevelopmentType getFeaturesNewDevelopmentType() {
        return featuresNewDevelopmentType;
    }

    /**
     * Typing for new developments
     * (Required)
     * 
     */
    @JsonProperty("featuresNewDevelopmentType")
    public void setFeaturesNewDevelopmentType(PromoJson.EnumNewDevelopmentType featuresNewDevelopmentType) {
        this.featuresNewDevelopmentType = featuresNewDevelopmentType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("featuresNewDevelopmentName")
    public String getFeaturesNewDevelopmentName() {
        return featuresNewDevelopmentName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("featuresNewDevelopmentName")
    public void setFeaturesNewDevelopmentName(String featuresNewDevelopmentName) {
        this.featuresNewDevelopmentName = featuresNewDevelopmentName;
    }

    /**
     * is finished
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresFinished")
    public Boolean getFeaturesFinished() {
        return featuresFinished;
    }

    /**
     * is finished
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresFinished")
    public void setFeaturesFinished(Boolean featuresFinished) {
        this.featuresFinished = featuresFinished;
    }

    @JsonProperty("featuresStartDate")
    public Date getFeaturesStartDate() {
        return featuresStartDate;
    }

    @JsonProperty("featuresStartDate")
    public void setFeaturesStartDate(Date featuresStartDate) {
        this.featuresStartDate = featuresStartDate;
    }

    @JsonProperty("featuresKeyDeliveryYear")
    public BigInteger getFeaturesKeyDeliveryYear() {
        return featuresKeyDeliveryYear;
    }

    @JsonProperty("featuresKeyDeliveryYear")
    public void setFeaturesKeyDeliveryYear(BigInteger featuresKeyDeliveryYear) {
        this.featuresKeyDeliveryYear = featuresKeyDeliveryYear;
    }

    @JsonProperty("featuresKeyDeliveryMonth")
    public BigDecimal getFeaturesKeyDeliveryMonth() {
        return featuresKeyDeliveryMonth;
    }

    @JsonProperty("featuresKeyDeliveryMonth")
    public void setFeaturesKeyDeliveryMonth(BigDecimal featuresKeyDeliveryMonth) {
        this.featuresKeyDeliveryMonth = featuresKeyDeliveryMonth;
    }

    /**
     * Phase of built for new developments
     * 
     */
    @JsonProperty("featuresBuiltPhase")
    public PromoJson.EnumFeaturesBuiltPhase getFeaturesBuiltPhase() {
        return featuresBuiltPhase;
    }

    /**
     * Phase of built for new developments
     * 
     */
    @JsonProperty("featuresBuiltPhase")
    public void setFeaturesBuiltPhase(PromoJson.EnumFeaturesBuiltPhase featuresBuiltPhase) {
        this.featuresBuiltPhase = featuresBuiltPhase;
    }

    /**
     * Booth sales availability hour for new developments
     * 
     */
    @JsonProperty("featuresAvailabilityHour")
    public PromoJson.EnumFeaturesAvailabilityHour getFeaturesAvailabilityHour() {
        return featuresAvailabilityHour;
    }

    /**
     * Booth sales availability hour for new developments
     * 
     */
    @JsonProperty("featuresAvailabilityHour")
    public void setFeaturesAvailabilityHour(PromoJson.EnumFeaturesAvailabilityHour featuresAvailabilityHour) {
        this.featuresAvailabilityHour = featuresAvailabilityHour;
    }

    /**
     * Access comments
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresAccessComments")
    public Set<Object> getFeaturesAccessComments() {
        return featuresAccessComments;
    }

    /**
     * Access comments
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresAccessComments")
    public void setFeaturesAccessComments(Set<Object> featuresAccessComments) {
        this.featuresAccessComments = featuresAccessComments;
    }

    /**
     * Booth sale on side
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresOnSite")
    public Boolean getFeaturesOnSite() {
        return featuresOnSite;
    }

    /**
     * Booth sale on side
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresOnSite")
    public void setFeaturesOnSite(Boolean featuresOnSite) {
        this.featuresOnSite = featuresOnSite;
    }

    /**
     * Mortgage state subsidized
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresMortgageStateSubsidized")
    public Boolean getFeaturesMortgageStateSubsidized() {
        return featuresMortgageStateSubsidized;
    }

    /**
     * Mortgage state subsidized
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresMortgageStateSubsidized")
    public void setFeaturesMortgageStateSubsidized(Boolean featuresMortgageStateSubsidized) {
        this.featuresMortgageStateSubsidized = featuresMortgageStateSubsidized;
    }

    @JsonProperty("featuresMortgageBankName")
    public String getFeaturesMortgageBankName() {
        return featuresMortgageBankName;
    }

    @JsonProperty("featuresMortgageBankName")
    public void setFeaturesMortgageBankName(String featuresMortgageBankName) {
        this.featuresMortgageBankName = featuresMortgageBankName;
    }

    @JsonProperty("featuresMortgagePercentage")
    public BigDecimal getFeaturesMortgagePercentage() {
        return featuresMortgagePercentage;
    }

    @JsonProperty("featuresMortgagePercentage")
    public void setFeaturesMortgagePercentage(BigDecimal featuresMortgagePercentage) {
        this.featuresMortgagePercentage = featuresMortgagePercentage;
    }

    @JsonProperty("featuresMortgageEntryPercentage")
    public BigDecimal getFeaturesMortgageEntryPercentage() {
        return featuresMortgageEntryPercentage;
    }

    @JsonProperty("featuresMortgageEntryPercentage")
    public void setFeaturesMortgageEntryPercentage(BigDecimal featuresMortgageEntryPercentage) {
        this.featuresMortgageEntryPercentage = featuresMortgageEntryPercentage;
    }

    @JsonProperty("featuresMortgageLettersPercentage")
    public BigDecimal getFeaturesMortgageLettersPercentage() {
        return featuresMortgageLettersPercentage;
    }

    @JsonProperty("featuresMortgageLettersPercentage")
    public void setFeaturesMortgageLettersPercentage(BigDecimal featuresMortgageLettersPercentage) {
        this.featuresMortgageLettersPercentage = featuresMortgageLettersPercentage;
    }

    @JsonProperty("featuresMortgageInterestRate")
    public BigDecimal getFeaturesMortgageInterestRate() {
        return featuresMortgageInterestRate;
    }

    @JsonProperty("featuresMortgageInterestRate")
    public void setFeaturesMortgageInterestRate(BigDecimal featuresMortgageInterestRate) {
        this.featuresMortgageInterestRate = featuresMortgageInterestRate;
    }

    @JsonProperty("featuresMortgageYears")
    public BigDecimal getFeaturesMortgageYears() {
        return featuresMortgageYears;
    }

    @JsonProperty("featuresMortgageYears")
    public void setFeaturesMortgageYears(BigDecimal featuresMortgageYears) {
        this.featuresMortgageYears = featuresMortgageYears;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PromoJson.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("featuresType");
        sb.append('=');
        sb.append(((this.featuresType == null)?"<null>":this.featuresType));
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
        sb.append("featuresLiftAvailable");
        sb.append('=');
        sb.append(((this.featuresLiftAvailable == null)?"<null>":this.featuresLiftAvailable));
        sb.append(',');
        sb.append("featuresDoorman");
        sb.append('=');
        sb.append(((this.featuresDoorman == null)?"<null>":this.featuresDoorman));
        sb.append(',');
        sb.append("featuresConservation");
        sb.append('=');
        sb.append(((this.featuresConservation == null)?"<null>":this.featuresConservation));
        sb.append(',');
        sb.append("featuresPool");
        sb.append('=');
        sb.append(((this.featuresPool == null)?"<null>":this.featuresPool));
        sb.append(',');
        sb.append("featuresGarden");
        sb.append('=');
        sb.append(((this.featuresGarden == null)?"<null>":this.featuresGarden));
        sb.append(',');
        sb.append("featuresSecurityDoor");
        sb.append('=');
        sb.append(((this.featuresSecurityDoor == null)?"<null>":this.featuresSecurityDoor));
        sb.append(',');
        sb.append("featuresSecurityAlarm");
        sb.append('=');
        sb.append(((this.featuresSecurityAlarm == null)?"<null>":this.featuresSecurityAlarm));
        sb.append(',');
        sb.append("featuresNewDevelopmentType");
        sb.append('=');
        sb.append(((this.featuresNewDevelopmentType == null)?"<null>":this.featuresNewDevelopmentType));
        sb.append(',');
        sb.append("featuresNewDevelopmentName");
        sb.append('=');
        sb.append(((this.featuresNewDevelopmentName == null)?"<null>":this.featuresNewDevelopmentName));
        sb.append(',');
        sb.append("featuresFinished");
        sb.append('=');
        sb.append(((this.featuresFinished == null)?"<null>":this.featuresFinished));
        sb.append(',');
        sb.append("featuresStartDate");
        sb.append('=');
        sb.append(((this.featuresStartDate == null)?"<null>":this.featuresStartDate));
        sb.append(',');
        sb.append("featuresKeyDeliveryYear");
        sb.append('=');
        sb.append(((this.featuresKeyDeliveryYear == null)?"<null>":this.featuresKeyDeliveryYear));
        sb.append(',');
        sb.append("featuresKeyDeliveryMonth");
        sb.append('=');
        sb.append(((this.featuresKeyDeliveryMonth == null)?"<null>":this.featuresKeyDeliveryMonth));
        sb.append(',');
        sb.append("featuresBuiltPhase");
        sb.append('=');
        sb.append(((this.featuresBuiltPhase == null)?"<null>":this.featuresBuiltPhase));
        sb.append(',');
        sb.append("featuresAvailabilityHour");
        sb.append('=');
        sb.append(((this.featuresAvailabilityHour == null)?"<null>":this.featuresAvailabilityHour));
        sb.append(',');
        sb.append("featuresAccessComments");
        sb.append('=');
        sb.append(((this.featuresAccessComments == null)?"<null>":this.featuresAccessComments));
        sb.append(',');
        sb.append("featuresOnSite");
        sb.append('=');
        sb.append(((this.featuresOnSite == null)?"<null>":this.featuresOnSite));
        sb.append(',');
        sb.append("featuresMortgageStateSubsidized");
        sb.append('=');
        sb.append(((this.featuresMortgageStateSubsidized == null)?"<null>":this.featuresMortgageStateSubsidized));
        sb.append(',');
        sb.append("featuresMortgageBankName");
        sb.append('=');
        sb.append(((this.featuresMortgageBankName == null)?"<null>":this.featuresMortgageBankName));
        sb.append(',');
        sb.append("featuresMortgagePercentage");
        sb.append('=');
        sb.append(((this.featuresMortgagePercentage == null)?"<null>":this.featuresMortgagePercentage));
        sb.append(',');
        sb.append("featuresMortgageEntryPercentage");
        sb.append('=');
        sb.append(((this.featuresMortgageEntryPercentage == null)?"<null>":this.featuresMortgageEntryPercentage));
        sb.append(',');
        sb.append("featuresMortgageLettersPercentage");
        sb.append('=');
        sb.append(((this.featuresMortgageLettersPercentage == null)?"<null>":this.featuresMortgageLettersPercentage));
        sb.append(',');
        sb.append("featuresMortgageInterestRate");
        sb.append('=');
        sb.append(((this.featuresMortgageInterestRate == null)?"<null>":this.featuresMortgageInterestRate));
        sb.append(',');
        sb.append("featuresMortgageYears");
        sb.append('=');
        sb.append(((this.featuresMortgageYears == null)?"<null>":this.featuresMortgageYears));
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
        result = ((result* 31)+((this.featuresMortgagePercentage == null)? 0 :this.featuresMortgagePercentage.hashCode()));
        result = ((result* 31)+((this.featuresMortgageLettersPercentage == null)? 0 :this.featuresMortgageLettersPercentage.hashCode()));
        result = ((result* 31)+((this.featuresFinished == null)? 0 :this.featuresFinished.hashCode()));
        result = ((result* 31)+((this.featuresEnergyCertificateRating == null)? 0 :this.featuresEnergyCertificateRating.hashCode()));
        result = ((result* 31)+((this.featuresType == null)? 0 :this.featuresType.hashCode()));
        result = ((result* 31)+((this.featuresKeyDeliveryYear == null)? 0 :this.featuresKeyDeliveryYear.hashCode()));
        result = ((result* 31)+((this.featuresEnergyCertificateType == null)? 0 :this.featuresEnergyCertificateType.hashCode()));
        result = ((result* 31)+((this.featuresSecurityDoor == null)? 0 :this.featuresSecurityDoor.hashCode()));
        result = ((result* 31)+((this.featuresMortgageStateSubsidized == null)? 0 :this.featuresMortgageStateSubsidized.hashCode()));
        result = ((result* 31)+((this.featuresSecurityAlarm == null)? 0 :this.featuresSecurityAlarm.hashCode()));
        result = ((result* 31)+((this.featuresGarden == null)? 0 :this.featuresGarden.hashCode()));
        result = ((result* 31)+((this.featuresConservation == null)? 0 :this.featuresConservation.hashCode()));
        result = ((result* 31)+((this.featuresMortgageEntryPercentage == null)? 0 :this.featuresMortgageEntryPercentage.hashCode()));
        result = ((result* 31)+((this.featuresNewDevelopmentName == null)? 0 :this.featuresNewDevelopmentName.hashCode()));
        result = ((result* 31)+((this.featuresLiftAvailable == null)? 0 :this.featuresLiftAvailable.hashCode()));
        result = ((result* 31)+((this.featuresMortgageInterestRate == null)? 0 :this.featuresMortgageInterestRate.hashCode()));
        result = ((result* 31)+((this.featuresEnergyCertificateLaw == null)? 0 :this.featuresEnergyCertificateLaw.hashCode()));
        result = ((result* 31)+((this.featuresStartDate == null)? 0 :this.featuresStartDate.hashCode()));
        result = ((result* 31)+((this.featuresBuiltPhase == null)? 0 :this.featuresBuiltPhase.hashCode()));
        result = ((result* 31)+((this.featuresPool == null)? 0 :this.featuresPool.hashCode()));
        result = ((result* 31)+((this.featuresMortgageYears == null)? 0 :this.featuresMortgageYears.hashCode()));
        result = ((result* 31)+((this.featuresNewDevelopmentType == null)? 0 :this.featuresNewDevelopmentType.hashCode()));
        result = ((result* 31)+((this.featuresEnergyCertificatePerformance == null)? 0 :this.featuresEnergyCertificatePerformance.hashCode()));
        result = ((result* 31)+((this.featuresOnSite == null)? 0 :this.featuresOnSite.hashCode()));
        result = ((result* 31)+((this.featuresKeyDeliveryMonth == null)? 0 :this.featuresKeyDeliveryMonth.hashCode()));
        result = ((result* 31)+((this.featuresAccessComments == null)? 0 :this.featuresAccessComments.hashCode()));
        result = ((result* 31)+((this.featuresAvailabilityHour == null)? 0 :this.featuresAvailabilityHour.hashCode()));
        result = ((result* 31)+((this.featuresMortgageBankName == null)? 0 :this.featuresMortgageBankName.hashCode()));
        result = ((result* 31)+((this.featuresDoorman == null)? 0 :this.featuresDoorman.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PromoJson) == false) {
            return false;
        }
        PromoJson rhs = ((PromoJson) other);
        return ((((((((((((((((((((((((((((((this.featuresMortgagePercentage == rhs.featuresMortgagePercentage)||((this.featuresMortgagePercentage!= null)&&this.featuresMortgagePercentage.equals(rhs.featuresMortgagePercentage)))&&((this.featuresMortgageLettersPercentage == rhs.featuresMortgageLettersPercentage)||((this.featuresMortgageLettersPercentage!= null)&&this.featuresMortgageLettersPercentage.equals(rhs.featuresMortgageLettersPercentage))))&&((this.featuresFinished == rhs.featuresFinished)||((this.featuresFinished!= null)&&this.featuresFinished.equals(rhs.featuresFinished))))&&((this.featuresEnergyCertificateRating == rhs.featuresEnergyCertificateRating)||((this.featuresEnergyCertificateRating!= null)&&this.featuresEnergyCertificateRating.equals(rhs.featuresEnergyCertificateRating))))&&((this.featuresType == rhs.featuresType)||((this.featuresType!= null)&&this.featuresType.equals(rhs.featuresType))))&&((this.featuresKeyDeliveryYear == rhs.featuresKeyDeliveryYear)||((this.featuresKeyDeliveryYear!= null)&&this.featuresKeyDeliveryYear.equals(rhs.featuresKeyDeliveryYear))))&&((this.featuresEnergyCertificateType == rhs.featuresEnergyCertificateType)||((this.featuresEnergyCertificateType!= null)&&this.featuresEnergyCertificateType.equals(rhs.featuresEnergyCertificateType))))&&((this.featuresSecurityDoor == rhs.featuresSecurityDoor)||((this.featuresSecurityDoor!= null)&&this.featuresSecurityDoor.equals(rhs.featuresSecurityDoor))))&&((this.featuresMortgageStateSubsidized == rhs.featuresMortgageStateSubsidized)||((this.featuresMortgageStateSubsidized!= null)&&this.featuresMortgageStateSubsidized.equals(rhs.featuresMortgageStateSubsidized))))&&((this.featuresSecurityAlarm == rhs.featuresSecurityAlarm)||((this.featuresSecurityAlarm!= null)&&this.featuresSecurityAlarm.equals(rhs.featuresSecurityAlarm))))&&((this.featuresGarden == rhs.featuresGarden)||((this.featuresGarden!= null)&&this.featuresGarden.equals(rhs.featuresGarden))))&&((this.featuresConservation == rhs.featuresConservation)||((this.featuresConservation!= null)&&this.featuresConservation.equals(rhs.featuresConservation))))&&((this.featuresMortgageEntryPercentage == rhs.featuresMortgageEntryPercentage)||((this.featuresMortgageEntryPercentage!= null)&&this.featuresMortgageEntryPercentage.equals(rhs.featuresMortgageEntryPercentage))))&&((this.featuresNewDevelopmentName == rhs.featuresNewDevelopmentName)||((this.featuresNewDevelopmentName!= null)&&this.featuresNewDevelopmentName.equals(rhs.featuresNewDevelopmentName))))&&((this.featuresLiftAvailable == rhs.featuresLiftAvailable)||((this.featuresLiftAvailable!= null)&&this.featuresLiftAvailable.equals(rhs.featuresLiftAvailable))))&&((this.featuresMortgageInterestRate == rhs.featuresMortgageInterestRate)||((this.featuresMortgageInterestRate!= null)&&this.featuresMortgageInterestRate.equals(rhs.featuresMortgageInterestRate))))&&((this.featuresEnergyCertificateLaw == rhs.featuresEnergyCertificateLaw)||((this.featuresEnergyCertificateLaw!= null)&&this.featuresEnergyCertificateLaw.equals(rhs.featuresEnergyCertificateLaw))))&&((this.featuresStartDate == rhs.featuresStartDate)||((this.featuresStartDate!= null)&&this.featuresStartDate.equals(rhs.featuresStartDate))))&&((this.featuresBuiltPhase == rhs.featuresBuiltPhase)||((this.featuresBuiltPhase!= null)&&this.featuresBuiltPhase.equals(rhs.featuresBuiltPhase))))&&((this.featuresPool == rhs.featuresPool)||((this.featuresPool!= null)&&this.featuresPool.equals(rhs.featuresPool))))&&((this.featuresMortgageYears == rhs.featuresMortgageYears)||((this.featuresMortgageYears!= null)&&this.featuresMortgageYears.equals(rhs.featuresMortgageYears))))&&((this.featuresNewDevelopmentType == rhs.featuresNewDevelopmentType)||((this.featuresNewDevelopmentType!= null)&&this.featuresNewDevelopmentType.equals(rhs.featuresNewDevelopmentType))))&&((this.featuresEnergyCertificatePerformance == rhs.featuresEnergyCertificatePerformance)||((this.featuresEnergyCertificatePerformance!= null)&&this.featuresEnergyCertificatePerformance.equals(rhs.featuresEnergyCertificatePerformance))))&&((this.featuresOnSite == rhs.featuresOnSite)||((this.featuresOnSite!= null)&&this.featuresOnSite.equals(rhs.featuresOnSite))))&&((this.featuresKeyDeliveryMonth == rhs.featuresKeyDeliveryMonth)||((this.featuresKeyDeliveryMonth!= null)&&this.featuresKeyDeliveryMonth.equals(rhs.featuresKeyDeliveryMonth))))&&((this.featuresAccessComments == rhs.featuresAccessComments)||((this.featuresAccessComments!= null)&&this.featuresAccessComments.equals(rhs.featuresAccessComments))))&&((this.featuresAvailabilityHour == rhs.featuresAvailabilityHour)||((this.featuresAvailabilityHour!= null)&&this.featuresAvailabilityHour.equals(rhs.featuresAvailabilityHour))))&&((this.featuresMortgageBankName == rhs.featuresMortgageBankName)||((this.featuresMortgageBankName!= null)&&this.featuresMortgageBankName.equals(rhs.featuresMortgageBankName))))&&((this.featuresDoorman == rhs.featuresDoorman)||((this.featuresDoorman!= null)&&this.featuresDoorman.equals(rhs.featuresDoorman))));
    }

    public enum EnumFeaturesAvailabilityHour {

        ANY_MORNING("any_morning"),
        MORNINGS("mornings"),
        AT_NOON("at_noon"),
        AFTERNOONS("afternoons"),
        NIGHTS("nights"),
        WEEKENDS("weekends"),
        BUSINESS_HOUR("business_hour");
        private final String value;
        private final static Map<String, PromoJson.EnumFeaturesAvailabilityHour> CONSTANTS = new HashMap<String, PromoJson.EnumFeaturesAvailabilityHour>();

        static {
            for (PromoJson.EnumFeaturesAvailabilityHour c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private EnumFeaturesAvailabilityHour(String value) {
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
        public static PromoJson.EnumFeaturesAvailabilityHour fromValue(String value) {
            PromoJson.EnumFeaturesAvailabilityHour constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum EnumFeaturesBuiltPhase {

        LAND_MOVE("land_move"),
        FOUNDATION("foundation"),
        CARPENTRY("carpentry"),
        PILOT("pilot"),
        PAVING("paving"),
        EQUIPMENT("equipment"),
        KEYDELIVERY("keydelivery");
        private final String value;
        private final static Map<String, PromoJson.EnumFeaturesBuiltPhase> CONSTANTS = new HashMap<String, PromoJson.EnumFeaturesBuiltPhase>();

        static {
            for (PromoJson.EnumFeaturesBuiltPhase c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private EnumFeaturesBuiltPhase(String value) {
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
        public static PromoJson.EnumFeaturesBuiltPhase fromValue(String value) {
            PromoJson.EnumFeaturesBuiltPhase constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum EnumNewDevelopmentType {

        RESTORED_BUILDING("restored_building"),
        NEW_BUILDING("new_building"),
        HOUSE("house"),
        MIXED_PROMOS("mixed_promos");
        private final String value;
        private final static Map<String, PromoJson.EnumNewDevelopmentType> CONSTANTS = new HashMap<String, PromoJson.EnumNewDevelopmentType>();

        static {
            for (PromoJson.EnumNewDevelopmentType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private EnumNewDevelopmentType(String value) {
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
        public static PromoJson.EnumNewDevelopmentType fromValue(String value) {
            PromoJson.EnumNewDevelopmentType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum FeaturesType {

        PROMO("promo");
        private final String value;
        private final static Map<String, PromoJson.FeaturesType> CONSTANTS = new HashMap<String, PromoJson.FeaturesType>();

        static {
            for (PromoJson.FeaturesType c: values()) {
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
        public static PromoJson.FeaturesType fromValue(String value) {
            PromoJson.FeaturesType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
