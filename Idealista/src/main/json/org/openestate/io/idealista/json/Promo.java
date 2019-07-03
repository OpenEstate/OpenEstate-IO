
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
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Promo implements Serializable
{

    /**
     * property types
     * <p>
     * 
     * Corresponds to the "featuresType" property.
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresType")
    private Promo.Type type;
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
     * Typing for new developments
     * (Required)
     * 
     */
    @JsonProperty("featuresNewDevelopmentType")
    @JsonPropertyDescription("Typing for new developments")
    @NotNull
    @Nonnull
    private NewDevelopmentType newDevelopmentType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("featuresNewDevelopmentName")
    @Pattern(regexp = "^.{0,100}$")
    @NotNull
    @Nonnull
    private String newDevelopmentName;
    /**
     * is finished
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresFinished")
    private Boolean finished;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd", timezone = "UTC")
    @JsonProperty("featuresStartDate")
    private Date startDate;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresKeyDeliveryYear")
    @DecimalMin("1")
    @DecimalMax("9999")
    private BigInteger keyDeliveryYear;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresKeyDeliveryMonth")
    @DecimalMin("1")
    @DecimalMax("12")
    private BigDecimal keyDeliveryMonth;
    /**
     * Phase of built for new developments
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresBuiltPhase")
    @JsonPropertyDescription("Phase of built for new developments")
    private BuiltPhaseType builtPhase;
    /**
     * Booth sales availability hour for new developments
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresAvailabilityHour")
    @JsonPropertyDescription("Booth sales availability hour for new developments")
    private AvailabilityHourType availabilityHour;
    /**
     * Access comments
     * <p>
     * 
     * Corresponds to the "featuresAccessComments" property.
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresAccessComments")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @Valid
    private Set<Description> accessComments = null;
    /**
     * Booth sale on side
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresOnSite")
    private Boolean onSite;
    /**
     * Mortgage state subsidized
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresMortgageStateSubsidized")
    private Boolean mortgageStateSubsidized;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresMortgageBankName")
    @Pattern(regexp = "^.{0,100}$")
    private String mortgageBankName;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresMortgagePercentage")
    @DecimalMin("1")
    @DecimalMax("999")
    private BigDecimal mortgagePercentage;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresMortgageEntryPercentage")
    @DecimalMin("1")
    @DecimalMax("999")
    private BigDecimal mortgageEntryPercentage;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresMortgageLettersPercentage")
    @DecimalMin("1")
    @DecimalMax("999")
    private BigDecimal mortgageLettersPercentage;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresMortgageInterestRate")
    @DecimalMin("1")
    @DecimalMax("999")
    private BigDecimal mortgageInterestRate;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresMortgageYears")
    @DecimalMin("1")
    @DecimalMax("9999")
    private BigDecimal mortgageYears;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6230046902058755137L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Promo() {
    }

    /**
     * 
     * @param newDevelopmentType
     * @param newDevelopmentName
     */
    public Promo(NewDevelopmentType newDevelopmentType, String newDevelopmentName) {
        super();
        this.newDevelopmentType = newDevelopmentType;
        this.newDevelopmentName = newDevelopmentName;
    }

    /**
     * property types
     * <p>
     * 
     * Corresponds to the "featuresType" property.
     * 
     */
    @JsonProperty("featuresType")
    public Promo.Type getType() {
        return type;
    }

    /**
     * property types
     * <p>
     * 
     * Corresponds to the "featuresType" property.
     * 
     */
    @JsonProperty("featuresType")
    public void setType(Promo.Type type) {
        this.type = type;
    }

    public Promo withType(Promo.Type type) {
        this.type = type;
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

    public Promo withFeaturesEnergyCertificatePerformance(BigDecimal energyCertificatePerformance) {
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

    public Promo withFeaturesEnergyCertificateLaw(EnergyCertificateLawType energyCertificateLaw) {
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

    public Promo withFeaturesEnergyCertificateRating(EnergyCertificateRatingType energyCertificateRating) {
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

    public Promo withFeaturesEnergyCertificateType(EnergyCertificateType energyCertificateType) {
        this.energyCertificateType = energyCertificateType;
        return this;
    }

    /**
     * lift
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresLiftAvailable")
    public Boolean getFeaturesLiftAvailable() {
        return liftAvailable;
    }

    /**
     * lift
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresLiftAvailable")
    public void setFeaturesLiftAvailable(Boolean liftAvailable) {
        this.liftAvailable = liftAvailable;
    }

    public Promo withFeaturesLiftAvailable(Boolean liftAvailable) {
        this.liftAvailable = liftAvailable;
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

    public Promo withFeaturesDoorman(Boolean doorman) {
        this.doorman = doorman;
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

    public Promo withFeaturesConservation(ConservationType conservation) {
        this.conservation = conservation;
        return this;
    }

    /**
     * pool availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresPool")
    public Boolean getFeaturesPool() {
        return pool;
    }

    /**
     * pool availability
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresPool")
    public void setFeaturesPool(Boolean pool) {
        this.pool = pool;
    }

    public Promo withFeaturesPool(Boolean pool) {
        this.pool = pool;
        return this;
    }

    /**
     * garden
     * <p>
     * garden availability
     * 
     */
    @JsonProperty("featuresGarden")
    public Boolean getFeaturesGarden() {
        return garden;
    }

    /**
     * garden
     * <p>
     * garden availability
     * 
     */
    @JsonProperty("featuresGarden")
    public void setFeaturesGarden(Boolean garden) {
        this.garden = garden;
    }

    public Promo withFeaturesGarden(Boolean garden) {
        this.garden = garden;
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

    public Promo withFeaturesSecurityDoor(Boolean securityDoor) {
        this.securityDoor = securityDoor;
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

    public Promo withFeaturesSecurityAlarm(Boolean securityAlarm) {
        this.securityAlarm = securityAlarm;
        return this;
    }

    /**
     * Typing for new developments
     * 
     */
    @JsonProperty("featuresNewDevelopmentType")
    public NewDevelopmentType getFeaturesNewDevelopmentType() {
        return newDevelopmentType;
    }

    /**
     * Typing for new developments
     * 
     */
    @JsonProperty("featuresNewDevelopmentType")
    public void setFeaturesNewDevelopmentType(NewDevelopmentType newDevelopmentType) {
        this.newDevelopmentType = newDevelopmentType;
    }

    public Promo withFeaturesNewDevelopmentType(NewDevelopmentType newDevelopmentType) {
        this.newDevelopmentType = newDevelopmentType;
        return this;
    }

    @JsonProperty("featuresNewDevelopmentName")
    public String getFeaturesNewDevelopmentName() {
        return newDevelopmentName;
    }

    @JsonProperty("featuresNewDevelopmentName")
    public void setFeaturesNewDevelopmentName(String newDevelopmentName) {
        this.newDevelopmentName = newDevelopmentName;
    }

    public Promo withFeaturesNewDevelopmentName(String newDevelopmentName) {
        this.newDevelopmentName = newDevelopmentName;
        return this;
    }

    /**
     * is finished
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresFinished")
    public Boolean getFeaturesFinished() {
        return finished;
    }

    /**
     * is finished
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresFinished")
    public void setFeaturesFinished(Boolean finished) {
        this.finished = finished;
    }

    public Promo withFeaturesFinished(Boolean finished) {
        this.finished = finished;
        return this;
    }

    @JsonProperty("featuresStartDate")
    public Date getFeaturesStartDate() {
        return startDate;
    }

    @JsonProperty("featuresStartDate")
    public void setFeaturesStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Promo withFeaturesStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    @JsonProperty("featuresKeyDeliveryYear")
    public BigInteger getFeaturesKeyDeliveryYear() {
        return keyDeliveryYear;
    }

    @JsonProperty("featuresKeyDeliveryYear")
    public void setFeaturesKeyDeliveryYear(BigInteger keyDeliveryYear) {
        this.keyDeliveryYear = keyDeliveryYear;
    }

    public Promo withFeaturesKeyDeliveryYear(BigInteger keyDeliveryYear) {
        this.keyDeliveryYear = keyDeliveryYear;
        return this;
    }

    @JsonProperty("featuresKeyDeliveryMonth")
    public BigDecimal getFeaturesKeyDeliveryMonth() {
        return keyDeliveryMonth;
    }

    @JsonProperty("featuresKeyDeliveryMonth")
    public void setFeaturesKeyDeliveryMonth(BigDecimal keyDeliveryMonth) {
        this.keyDeliveryMonth = keyDeliveryMonth;
    }

    public Promo withFeaturesKeyDeliveryMonth(BigDecimal keyDeliveryMonth) {
        this.keyDeliveryMonth = keyDeliveryMonth;
        return this;
    }

    /**
     * Phase of built for new developments
     * 
     */
    @JsonProperty("featuresBuiltPhase")
    public BuiltPhaseType getFeaturesBuiltPhase() {
        return builtPhase;
    }

    /**
     * Phase of built for new developments
     * 
     */
    @JsonProperty("featuresBuiltPhase")
    public void setFeaturesBuiltPhase(BuiltPhaseType builtPhase) {
        this.builtPhase = builtPhase;
    }

    public Promo withFeaturesBuiltPhase(BuiltPhaseType builtPhase) {
        this.builtPhase = builtPhase;
        return this;
    }

    /**
     * Booth sales availability hour for new developments
     * 
     */
    @JsonProperty("featuresAvailabilityHour")
    public AvailabilityHourType getFeaturesAvailabilityHour() {
        return availabilityHour;
    }

    /**
     * Booth sales availability hour for new developments
     * 
     */
    @JsonProperty("featuresAvailabilityHour")
    public void setFeaturesAvailabilityHour(AvailabilityHourType availabilityHour) {
        this.availabilityHour = availabilityHour;
    }

    public Promo withFeaturesAvailabilityHour(AvailabilityHourType availabilityHour) {
        this.availabilityHour = availabilityHour;
        return this;
    }

    /**
     * Access comments
     * <p>
     * 
     * Corresponds to the "featuresAccessComments" property.
     * 
     */
    @JsonProperty("featuresAccessComments")
    public Set<Description> getAccessComments() {
        return accessComments;
    }

    /**
     * Access comments
     * <p>
     * 
     * Corresponds to the "featuresAccessComments" property.
     * 
     */
    @JsonProperty("featuresAccessComments")
    public void setAccessComments(Set<Description> accessComments) {
        this.accessComments = accessComments;
    }

    public Promo withAccessComments(Set<Description> accessComments) {
        this.accessComments = accessComments;
        return this;
    }

    /**
     * Booth sale on side
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresOnSite")
    public Boolean getFeaturesOnSite() {
        return onSite;
    }

    /**
     * Booth sale on side
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresOnSite")
    public void setFeaturesOnSite(Boolean onSite) {
        this.onSite = onSite;
    }

    public Promo withFeaturesOnSite(Boolean onSite) {
        this.onSite = onSite;
        return this;
    }

    /**
     * Mortgage state subsidized
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresMortgageStateSubsidized")
    public Boolean getFeaturesMortgageStateSubsidized() {
        return mortgageStateSubsidized;
    }

    /**
     * Mortgage state subsidized
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresMortgageStateSubsidized")
    public void setFeaturesMortgageStateSubsidized(Boolean mortgageStateSubsidized) {
        this.mortgageStateSubsidized = mortgageStateSubsidized;
    }

    public Promo withFeaturesMortgageStateSubsidized(Boolean mortgageStateSubsidized) {
        this.mortgageStateSubsidized = mortgageStateSubsidized;
        return this;
    }

    @JsonProperty("featuresMortgageBankName")
    public String getFeaturesMortgageBankName() {
        return mortgageBankName;
    }

    @JsonProperty("featuresMortgageBankName")
    public void setFeaturesMortgageBankName(String mortgageBankName) {
        this.mortgageBankName = mortgageBankName;
    }

    public Promo withFeaturesMortgageBankName(String mortgageBankName) {
        this.mortgageBankName = mortgageBankName;
        return this;
    }

    @JsonProperty("featuresMortgagePercentage")
    public BigDecimal getFeaturesMortgagePercentage() {
        return mortgagePercentage;
    }

    @JsonProperty("featuresMortgagePercentage")
    public void setFeaturesMortgagePercentage(BigDecimal mortgagePercentage) {
        this.mortgagePercentage = mortgagePercentage;
    }

    public Promo withFeaturesMortgagePercentage(BigDecimal mortgagePercentage) {
        this.mortgagePercentage = mortgagePercentage;
        return this;
    }

    @JsonProperty("featuresMortgageEntryPercentage")
    public BigDecimal getFeaturesMortgageEntryPercentage() {
        return mortgageEntryPercentage;
    }

    @JsonProperty("featuresMortgageEntryPercentage")
    public void setFeaturesMortgageEntryPercentage(BigDecimal mortgageEntryPercentage) {
        this.mortgageEntryPercentage = mortgageEntryPercentage;
    }

    public Promo withFeaturesMortgageEntryPercentage(BigDecimal mortgageEntryPercentage) {
        this.mortgageEntryPercentage = mortgageEntryPercentage;
        return this;
    }

    @JsonProperty("featuresMortgageLettersPercentage")
    public BigDecimal getFeaturesMortgageLettersPercentage() {
        return mortgageLettersPercentage;
    }

    @JsonProperty("featuresMortgageLettersPercentage")
    public void setFeaturesMortgageLettersPercentage(BigDecimal mortgageLettersPercentage) {
        this.mortgageLettersPercentage = mortgageLettersPercentage;
    }

    public Promo withFeaturesMortgageLettersPercentage(BigDecimal mortgageLettersPercentage) {
        this.mortgageLettersPercentage = mortgageLettersPercentage;
        return this;
    }

    @JsonProperty("featuresMortgageInterestRate")
    public BigDecimal getFeaturesMortgageInterestRate() {
        return mortgageInterestRate;
    }

    @JsonProperty("featuresMortgageInterestRate")
    public void setFeaturesMortgageInterestRate(BigDecimal mortgageInterestRate) {
        this.mortgageInterestRate = mortgageInterestRate;
    }

    public Promo withFeaturesMortgageInterestRate(BigDecimal mortgageInterestRate) {
        this.mortgageInterestRate = mortgageInterestRate;
        return this;
    }

    @JsonProperty("featuresMortgageYears")
    public BigDecimal getFeaturesMortgageYears() {
        return mortgageYears;
    }

    @JsonProperty("featuresMortgageYears")
    public void setFeaturesMortgageYears(BigDecimal mortgageYears) {
        this.mortgageYears = mortgageYears;
    }

    public Promo withFeaturesMortgageYears(BigDecimal mortgageYears) {
        this.mortgageYears = mortgageYears;
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

    public Promo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Promo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        sb.append("liftAvailable");
        sb.append('=');
        sb.append(((this.liftAvailable == null)?"<null>":this.liftAvailable));
        sb.append(',');
        sb.append("doorman");
        sb.append('=');
        sb.append(((this.doorman == null)?"<null>":this.doorman));
        sb.append(',');
        sb.append("conservation");
        sb.append('=');
        sb.append(((this.conservation == null)?"<null>":this.conservation));
        sb.append(',');
        sb.append("pool");
        sb.append('=');
        sb.append(((this.pool == null)?"<null>":this.pool));
        sb.append(',');
        sb.append("garden");
        sb.append('=');
        sb.append(((this.garden == null)?"<null>":this.garden));
        sb.append(',');
        sb.append("securityDoor");
        sb.append('=');
        sb.append(((this.securityDoor == null)?"<null>":this.securityDoor));
        sb.append(',');
        sb.append("securityAlarm");
        sb.append('=');
        sb.append(((this.securityAlarm == null)?"<null>":this.securityAlarm));
        sb.append(',');
        sb.append("newDevelopmentType");
        sb.append('=');
        sb.append(((this.newDevelopmentType == null)?"<null>":this.newDevelopmentType));
        sb.append(',');
        sb.append("newDevelopmentName");
        sb.append('=');
        sb.append(((this.newDevelopmentName == null)?"<null>":this.newDevelopmentName));
        sb.append(',');
        sb.append("finished");
        sb.append('=');
        sb.append(((this.finished == null)?"<null>":this.finished));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("keyDeliveryYear");
        sb.append('=');
        sb.append(((this.keyDeliveryYear == null)?"<null>":this.keyDeliveryYear));
        sb.append(',');
        sb.append("keyDeliveryMonth");
        sb.append('=');
        sb.append(((this.keyDeliveryMonth == null)?"<null>":this.keyDeliveryMonth));
        sb.append(',');
        sb.append("builtPhase");
        sb.append('=');
        sb.append(((this.builtPhase == null)?"<null>":this.builtPhase));
        sb.append(',');
        sb.append("availabilityHour");
        sb.append('=');
        sb.append(((this.availabilityHour == null)?"<null>":this.availabilityHour));
        sb.append(',');
        sb.append("accessComments");
        sb.append('=');
        sb.append(((this.accessComments == null)?"<null>":this.accessComments));
        sb.append(',');
        sb.append("onSite");
        sb.append('=');
        sb.append(((this.onSite == null)?"<null>":this.onSite));
        sb.append(',');
        sb.append("mortgageStateSubsidized");
        sb.append('=');
        sb.append(((this.mortgageStateSubsidized == null)?"<null>":this.mortgageStateSubsidized));
        sb.append(',');
        sb.append("mortgageBankName");
        sb.append('=');
        sb.append(((this.mortgageBankName == null)?"<null>":this.mortgageBankName));
        sb.append(',');
        sb.append("mortgagePercentage");
        sb.append('=');
        sb.append(((this.mortgagePercentage == null)?"<null>":this.mortgagePercentage));
        sb.append(',');
        sb.append("mortgageEntryPercentage");
        sb.append('=');
        sb.append(((this.mortgageEntryPercentage == null)?"<null>":this.mortgageEntryPercentage));
        sb.append(',');
        sb.append("mortgageLettersPercentage");
        sb.append('=');
        sb.append(((this.mortgageLettersPercentage == null)?"<null>":this.mortgageLettersPercentage));
        sb.append(',');
        sb.append("mortgageInterestRate");
        sb.append('=');
        sb.append(((this.mortgageInterestRate == null)?"<null>":this.mortgageInterestRate));
        sb.append(',');
        sb.append("mortgageYears");
        sb.append('=');
        sb.append(((this.mortgageYears == null)?"<null>":this.mortgageYears));
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
        result = ((result* 31)+((this.mortgageYears == null)? 0 :this.mortgageYears.hashCode()));
        result = ((result* 31)+((this.liftAvailable == null)? 0 :this.liftAvailable.hashCode()));
        result = ((result* 31)+((this.energyCertificateRating == null)? 0 :this.energyCertificateRating.hashCode()));
        result = ((result* 31)+((this.doorman == null)? 0 :this.doorman.hashCode()));
        result = ((result* 31)+((this.keyDeliveryYear == null)? 0 :this.keyDeliveryYear.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.mortgagePercentage == null)? 0 :this.mortgagePercentage.hashCode()));
        result = ((result* 31)+((this.mortgageStateSubsidized == null)? 0 :this.mortgageStateSubsidized.hashCode()));
        result = ((result* 31)+((this.mortgageEntryPercentage == null)? 0 :this.mortgageEntryPercentage.hashCode()));
        result = ((result* 31)+((this.onSite == null)? 0 :this.onSite.hashCode()));
        result = ((result* 31)+((this.energyCertificatePerformance == null)? 0 :this.energyCertificatePerformance.hashCode()));
        result = ((result* 31)+((this.newDevelopmentName == null)? 0 :this.newDevelopmentName.hashCode()));
        result = ((result* 31)+((this.keyDeliveryMonth == null)? 0 :this.keyDeliveryMonth.hashCode()));
        result = ((result* 31)+((this.pool == null)? 0 :this.pool.hashCode()));
        result = ((result* 31)+((this.accessComments == null)? 0 :this.accessComments.hashCode()));
        result = ((result* 31)+((this.mortgageInterestRate == null)? 0 :this.mortgageInterestRate.hashCode()));
        result = ((result* 31)+((this.newDevelopmentType == null)? 0 :this.newDevelopmentType.hashCode()));
        result = ((result* 31)+((this.finished == null)? 0 :this.finished.hashCode()));
        result = ((result* 31)+((this.securityDoor == null)? 0 :this.securityDoor.hashCode()));
        result = ((result* 31)+((this.securityAlarm == null)? 0 :this.securityAlarm.hashCode()));
        result = ((result* 31)+((this.energyCertificateLaw == null)? 0 :this.energyCertificateLaw.hashCode()));
        result = ((result* 31)+((this.conservation == null)? 0 :this.conservation.hashCode()));
        result = ((result* 31)+((this.energyCertificateType == null)? 0 :this.energyCertificateType.hashCode()));
        result = ((result* 31)+((this.mortgageBankName == null)? 0 :this.mortgageBankName.hashCode()));
        result = ((result* 31)+((this.builtPhase == null)? 0 :this.builtPhase.hashCode()));
        result = ((result* 31)+((this.garden == null)? 0 :this.garden.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.availabilityHour == null)? 0 :this.availabilityHour.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.mortgageLettersPercentage == null)? 0 :this.mortgageLettersPercentage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Promo) == false) {
            return false;
        }
        Promo rhs = ((Promo) other);
        return (((((((((((((((((((((((((((((((this.mortgageYears == rhs.mortgageYears)||((this.mortgageYears!= null)&&this.mortgageYears.equals(rhs.mortgageYears)))&&((this.liftAvailable == rhs.liftAvailable)||((this.liftAvailable!= null)&&this.liftAvailable.equals(rhs.liftAvailable))))&&((this.energyCertificateRating == rhs.energyCertificateRating)||((this.energyCertificateRating!= null)&&this.energyCertificateRating.equals(rhs.energyCertificateRating))))&&((this.doorman == rhs.doorman)||((this.doorman!= null)&&this.doorman.equals(rhs.doorman))))&&((this.keyDeliveryYear == rhs.keyDeliveryYear)||((this.keyDeliveryYear!= null)&&this.keyDeliveryYear.equals(rhs.keyDeliveryYear))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.mortgagePercentage == rhs.mortgagePercentage)||((this.mortgagePercentage!= null)&&this.mortgagePercentage.equals(rhs.mortgagePercentage))))&&((this.mortgageStateSubsidized == rhs.mortgageStateSubsidized)||((this.mortgageStateSubsidized!= null)&&this.mortgageStateSubsidized.equals(rhs.mortgageStateSubsidized))))&&((this.mortgageEntryPercentage == rhs.mortgageEntryPercentage)||((this.mortgageEntryPercentage!= null)&&this.mortgageEntryPercentage.equals(rhs.mortgageEntryPercentage))))&&((this.onSite == rhs.onSite)||((this.onSite!= null)&&this.onSite.equals(rhs.onSite))))&&((this.energyCertificatePerformance == rhs.energyCertificatePerformance)||((this.energyCertificatePerformance!= null)&&this.energyCertificatePerformance.equals(rhs.energyCertificatePerformance))))&&((this.newDevelopmentName == rhs.newDevelopmentName)||((this.newDevelopmentName!= null)&&this.newDevelopmentName.equals(rhs.newDevelopmentName))))&&((this.keyDeliveryMonth == rhs.keyDeliveryMonth)||((this.keyDeliveryMonth!= null)&&this.keyDeliveryMonth.equals(rhs.keyDeliveryMonth))))&&((this.pool == rhs.pool)||((this.pool!= null)&&this.pool.equals(rhs.pool))))&&((this.accessComments == rhs.accessComments)||((this.accessComments!= null)&&this.accessComments.equals(rhs.accessComments))))&&((this.mortgageInterestRate == rhs.mortgageInterestRate)||((this.mortgageInterestRate!= null)&&this.mortgageInterestRate.equals(rhs.mortgageInterestRate))))&&((this.newDevelopmentType == rhs.newDevelopmentType)||((this.newDevelopmentType!= null)&&this.newDevelopmentType.equals(rhs.newDevelopmentType))))&&((this.finished == rhs.finished)||((this.finished!= null)&&this.finished.equals(rhs.finished))))&&((this.securityDoor == rhs.securityDoor)||((this.securityDoor!= null)&&this.securityDoor.equals(rhs.securityDoor))))&&((this.securityAlarm == rhs.securityAlarm)||((this.securityAlarm!= null)&&this.securityAlarm.equals(rhs.securityAlarm))))&&((this.energyCertificateLaw == rhs.energyCertificateLaw)||((this.energyCertificateLaw!= null)&&this.energyCertificateLaw.equals(rhs.energyCertificateLaw))))&&((this.conservation == rhs.conservation)||((this.conservation!= null)&&this.conservation.equals(rhs.conservation))))&&((this.energyCertificateType == rhs.energyCertificateType)||((this.energyCertificateType!= null)&&this.energyCertificateType.equals(rhs.energyCertificateType))))&&((this.mortgageBankName == rhs.mortgageBankName)||((this.mortgageBankName!= null)&&this.mortgageBankName.equals(rhs.mortgageBankName))))&&((this.builtPhase == rhs.builtPhase)||((this.builtPhase!= null)&&this.builtPhase.equals(rhs.builtPhase))))&&((this.garden == rhs.garden)||((this.garden!= null)&&this.garden.equals(rhs.garden))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.availabilityHour == rhs.availabilityHour)||((this.availabilityHour!= null)&&this.availabilityHour.equals(rhs.availabilityHour))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.mortgageLettersPercentage == rhs.mortgageLettersPercentage)||((this.mortgageLettersPercentage!= null)&&this.mortgageLettersPercentage.equals(rhs.mortgageLettersPercentage))));
    }

    public enum Type {

        PROMO("promo");
        private final String value;
        private final static Map<String, Promo.Type> CONSTANTS = new HashMap<String, Promo.Type>();

        static {
            for (Promo.Type c: values()) {
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
        public static Promo.Type fromValue(String value) {
            Promo.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
