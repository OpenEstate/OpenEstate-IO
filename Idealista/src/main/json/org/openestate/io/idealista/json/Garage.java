
package org.openestate.io.idealista.json;

import java.io.Serializable;
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
 * Garaje Object
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "featuresType",
    "featuresAreaConstructed",
    "featuresLiftAvailable",
    "featuresParkingAutomaticDoor",
    "featuresParkingPlaceCovered",
    "featuresParkingType",
    "featuresSecurityAlarm",
    "featuresSecurityPersonnel",
    "featuresSecuritySystem"
})
public class Garage implements Serializable
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
    private Garage.FeaturesType featuresType;
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
     * automatic door
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresParkingAutomaticDoor")
    private Boolean featuresParkingAutomaticDoor;
    /**
     * parking covered
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresParkingPlaceCovered")
    private Boolean featuresParkingPlaceCovered;
    /**
     * parking types
     * <p>
     * this feature only applies for Portugal and Italy garages. 'depot' if is a box garage. 'parking_space' if is a regular garage
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresParkingType")
    @JsonPropertyDescription("this feature only applies for Portugal and Italy garages. 'depot' if is a box garage. 'parking_space' if is a regular garage")
    private Garage.FeaturesParkingType featuresParkingType;
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
     * security personnel
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresSecurityPersonnel")
    private Boolean featuresSecurityPersonnel;
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
    private final static long serialVersionUID = 8120452927835036391L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Garage() {
    }

    /**
     * 
     * @param featuresType
     * @param featuresAreaConstructed
     */
    public Garage(Garage.FeaturesType featuresType, BigInteger featuresAreaConstructed) {
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
    public Garage.FeaturesType getFeaturesType() {
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
    public void setFeaturesType(Garage.FeaturesType featuresType) {
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
     * automatic door
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresParkingAutomaticDoor")
    public Boolean getFeaturesParkingAutomaticDoor() {
        return featuresParkingAutomaticDoor;
    }

    /**
     * automatic door
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresParkingAutomaticDoor")
    public void setFeaturesParkingAutomaticDoor(Boolean featuresParkingAutomaticDoor) {
        this.featuresParkingAutomaticDoor = featuresParkingAutomaticDoor;
    }

    /**
     * parking covered
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresParkingPlaceCovered")
    public Boolean getFeaturesParkingPlaceCovered() {
        return featuresParkingPlaceCovered;
    }

    /**
     * parking covered
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresParkingPlaceCovered")
    public void setFeaturesParkingPlaceCovered(Boolean featuresParkingPlaceCovered) {
        this.featuresParkingPlaceCovered = featuresParkingPlaceCovered;
    }

    /**
     * parking types
     * <p>
     * this feature only applies for Portugal and Italy garages. 'depot' if is a box garage. 'parking_space' if is a regular garage
     * 
     */
    @JsonProperty("featuresParkingType")
    public Garage.FeaturesParkingType getFeaturesParkingType() {
        return featuresParkingType;
    }

    /**
     * parking types
     * <p>
     * this feature only applies for Portugal and Italy garages. 'depot' if is a box garage. 'parking_space' if is a regular garage
     * 
     */
    @JsonProperty("featuresParkingType")
    public void setFeaturesParkingType(Garage.FeaturesParkingType featuresParkingType) {
        this.featuresParkingType = featuresParkingType;
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
     * security personnel
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSecurityPersonnel")
    public Boolean getFeaturesSecurityPersonnel() {
        return featuresSecurityPersonnel;
    }

    /**
     * security personnel
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSecurityPersonnel")
    public void setFeaturesSecurityPersonnel(Boolean featuresSecurityPersonnel) {
        this.featuresSecurityPersonnel = featuresSecurityPersonnel;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Garage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("featuresType");
        sb.append('=');
        sb.append(((this.featuresType == null)?"<null>":this.featuresType));
        sb.append(',');
        sb.append("featuresAreaConstructed");
        sb.append('=');
        sb.append(((this.featuresAreaConstructed == null)?"<null>":this.featuresAreaConstructed));
        sb.append(',');
        sb.append("featuresLiftAvailable");
        sb.append('=');
        sb.append(((this.featuresLiftAvailable == null)?"<null>":this.featuresLiftAvailable));
        sb.append(',');
        sb.append("featuresParkingAutomaticDoor");
        sb.append('=');
        sb.append(((this.featuresParkingAutomaticDoor == null)?"<null>":this.featuresParkingAutomaticDoor));
        sb.append(',');
        sb.append("featuresParkingPlaceCovered");
        sb.append('=');
        sb.append(((this.featuresParkingPlaceCovered == null)?"<null>":this.featuresParkingPlaceCovered));
        sb.append(',');
        sb.append("featuresParkingType");
        sb.append('=');
        sb.append(((this.featuresParkingType == null)?"<null>":this.featuresParkingType));
        sb.append(',');
        sb.append("featuresSecurityAlarm");
        sb.append('=');
        sb.append(((this.featuresSecurityAlarm == null)?"<null>":this.featuresSecurityAlarm));
        sb.append(',');
        sb.append("featuresSecurityPersonnel");
        sb.append('=');
        sb.append(((this.featuresSecurityPersonnel == null)?"<null>":this.featuresSecurityPersonnel));
        sb.append(',');
        sb.append("featuresSecuritySystem");
        sb.append('=');
        sb.append(((this.featuresSecuritySystem == null)?"<null>":this.featuresSecuritySystem));
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
        result = ((result* 31)+((this.featuresParkingAutomaticDoor == null)? 0 :this.featuresParkingAutomaticDoor.hashCode()));
        result = ((result* 31)+((this.featuresParkingPlaceCovered == null)? 0 :this.featuresParkingPlaceCovered.hashCode()));
        result = ((result* 31)+((this.featuresSecuritySystem == null)? 0 :this.featuresSecuritySystem.hashCode()));
        result = ((result* 31)+((this.featuresSecurityPersonnel == null)? 0 :this.featuresSecurityPersonnel.hashCode()));
        result = ((result* 31)+((this.featuresType == null)? 0 :this.featuresType.hashCode()));
        result = ((result* 31)+((this.featuresLiftAvailable == null)? 0 :this.featuresLiftAvailable.hashCode()));
        result = ((result* 31)+((this.featuresAreaConstructed == null)? 0 :this.featuresAreaConstructed.hashCode()));
        result = ((result* 31)+((this.featuresSecurityAlarm == null)? 0 :this.featuresSecurityAlarm.hashCode()));
        result = ((result* 31)+((this.featuresParkingType == null)? 0 :this.featuresParkingType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Garage) == false) {
            return false;
        }
        Garage rhs = ((Garage) other);
        return ((((((((((this.featuresParkingAutomaticDoor == rhs.featuresParkingAutomaticDoor)||((this.featuresParkingAutomaticDoor!= null)&&this.featuresParkingAutomaticDoor.equals(rhs.featuresParkingAutomaticDoor)))&&((this.featuresParkingPlaceCovered == rhs.featuresParkingPlaceCovered)||((this.featuresParkingPlaceCovered!= null)&&this.featuresParkingPlaceCovered.equals(rhs.featuresParkingPlaceCovered))))&&((this.featuresSecuritySystem == rhs.featuresSecuritySystem)||((this.featuresSecuritySystem!= null)&&this.featuresSecuritySystem.equals(rhs.featuresSecuritySystem))))&&((this.featuresSecurityPersonnel == rhs.featuresSecurityPersonnel)||((this.featuresSecurityPersonnel!= null)&&this.featuresSecurityPersonnel.equals(rhs.featuresSecurityPersonnel))))&&((this.featuresType == rhs.featuresType)||((this.featuresType!= null)&&this.featuresType.equals(rhs.featuresType))))&&((this.featuresLiftAvailable == rhs.featuresLiftAvailable)||((this.featuresLiftAvailable!= null)&&this.featuresLiftAvailable.equals(rhs.featuresLiftAvailable))))&&((this.featuresAreaConstructed == rhs.featuresAreaConstructed)||((this.featuresAreaConstructed!= null)&&this.featuresAreaConstructed.equals(rhs.featuresAreaConstructed))))&&((this.featuresSecurityAlarm == rhs.featuresSecurityAlarm)||((this.featuresSecurityAlarm!= null)&&this.featuresSecurityAlarm.equals(rhs.featuresSecurityAlarm))))&&((this.featuresParkingType == rhs.featuresParkingType)||((this.featuresParkingType!= null)&&this.featuresParkingType.equals(rhs.featuresParkingType))));
    }

    public enum FeaturesParkingType {

        UNKNOWN("unknown"),
        DEPOT("depot"),
        PARKING_SPACE("parking_space");
        private final String value;
        private final static Map<String, Garage.FeaturesParkingType> CONSTANTS = new HashMap<String, Garage.FeaturesParkingType>();

        static {
            for (Garage.FeaturesParkingType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private FeaturesParkingType(String value) {
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
        public static Garage.FeaturesParkingType fromValue(String value) {
            Garage.FeaturesParkingType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum FeaturesType {

        GARAGE("garage");
        private final String value;
        private final static Map<String, Garage.FeaturesType> CONSTANTS = new HashMap<String, Garage.FeaturesType>();

        static {
            for (Garage.FeaturesType c: values()) {
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
        public static Garage.FeaturesType fromValue(String value) {
            Garage.FeaturesType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
