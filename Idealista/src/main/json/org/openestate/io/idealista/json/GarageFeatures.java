
package org.openestate.io.idealista.json;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
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
public class GarageFeatures
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
    private GarageFeatures.Type type;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("featuresAreaConstructed")
    @DecimalMin("1")
    @DecimalMax("99999")
    @NotNull
    private BigInteger areaConstructed;
    /**
     * lift
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresLiftAvailable")
    private Boolean liftAvailable;
    /**
     * automatic door
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresParkingAutomaticDoor")
    private Boolean parkingAutomaticDoor;
    /**
     * parking covered
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresParkingPlaceCovered")
    private Boolean parkingPlaceCovered;
    /**
     * parking types
     * <p>
     * this feature only applies for Portugal and Italy garages. 'depot' if is a box garage. 'parking_space' if is a regular garage
     * 
     */
    @JsonProperty("featuresParkingType")
    @JsonPropertyDescription("this feature only applies for Portugal and Italy garages. 'depot' if is a box garage. 'parking_space' if is a regular garage")
    private ParkingType parkingType;
    /**
     * security alarm system
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSecurityAlarm")
    private Boolean securityAlarm;
    /**
     * security personnel
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSecurityPersonnel")
    private Boolean securityPersonnel;
    /**
     * security system
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSecuritySystem")
    private Boolean securitySystem;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6666937898394718052L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GarageFeatures() {
    }

    /**
     * 
     * @param type
     * @param areaConstructed
     */
    public GarageFeatures(GarageFeatures.Type type, BigInteger areaConstructed) {
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
    public GarageFeatures.Type getType() {
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
    public void setType(GarageFeatures.Type type) {
        this.type = type;
    }

    public GarageFeatures withType(GarageFeatures.Type type) {
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

    public GarageFeatures withAreaConstructed(BigInteger areaConstructed) {
        this.areaConstructed = areaConstructed;
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

    public GarageFeatures withLiftAvailable(Boolean liftAvailable) {
        this.liftAvailable = liftAvailable;
        return this;
    }

    /**
     * automatic door
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresParkingAutomaticDoor")
    public Boolean getParkingAutomaticDoor() {
        return parkingAutomaticDoor;
    }

    /**
     * automatic door
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresParkingAutomaticDoor")
    public void setParkingAutomaticDoor(Boolean parkingAutomaticDoor) {
        this.parkingAutomaticDoor = parkingAutomaticDoor;
    }

    public GarageFeatures withParkingAutomaticDoor(Boolean parkingAutomaticDoor) {
        this.parkingAutomaticDoor = parkingAutomaticDoor;
        return this;
    }

    /**
     * parking covered
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresParkingPlaceCovered")
    public Boolean getParkingPlaceCovered() {
        return parkingPlaceCovered;
    }

    /**
     * parking covered
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresParkingPlaceCovered")
    public void setParkingPlaceCovered(Boolean parkingPlaceCovered) {
        this.parkingPlaceCovered = parkingPlaceCovered;
    }

    public GarageFeatures withParkingPlaceCovered(Boolean parkingPlaceCovered) {
        this.parkingPlaceCovered = parkingPlaceCovered;
        return this;
    }

    /**
     * parking types
     * <p>
     * this feature only applies for Portugal and Italy garages. 'depot' if is a box garage. 'parking_space' if is a regular garage
     * 
     */
    @JsonProperty("featuresParkingType")
    public ParkingType getParkingType() {
        return parkingType;
    }

    /**
     * parking types
     * <p>
     * this feature only applies for Portugal and Italy garages. 'depot' if is a box garage. 'parking_space' if is a regular garage
     * 
     */
    @JsonProperty("featuresParkingType")
    public void setParkingType(ParkingType parkingType) {
        this.parkingType = parkingType;
    }

    public GarageFeatures withParkingType(ParkingType parkingType) {
        this.parkingType = parkingType;
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

    public GarageFeatures withSecurityAlarm(Boolean securityAlarm) {
        this.securityAlarm = securityAlarm;
        return this;
    }

    /**
     * security personnel
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSecurityPersonnel")
    public Boolean getSecurityPersonnel() {
        return securityPersonnel;
    }

    /**
     * security personnel
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSecurityPersonnel")
    public void setSecurityPersonnel(Boolean securityPersonnel) {
        this.securityPersonnel = securityPersonnel;
    }

    public GarageFeatures withSecurityPersonnel(Boolean securityPersonnel) {
        this.securityPersonnel = securityPersonnel;
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

    public GarageFeatures withSecuritySystem(Boolean securitySystem) {
        this.securitySystem = securitySystem;
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

    public GarageFeatures withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GarageFeatures.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("liftAvailable");
        sb.append('=');
        sb.append(((this.liftAvailable == null)?"<null>":this.liftAvailable));
        sb.append(',');
        sb.append("parkingAutomaticDoor");
        sb.append('=');
        sb.append(((this.parkingAutomaticDoor == null)?"<null>":this.parkingAutomaticDoor));
        sb.append(',');
        sb.append("parkingPlaceCovered");
        sb.append('=');
        sb.append(((this.parkingPlaceCovered == null)?"<null>":this.parkingPlaceCovered));
        sb.append(',');
        sb.append("parkingType");
        sb.append('=');
        sb.append(((this.parkingType == null)?"<null>":this.parkingType));
        sb.append(',');
        sb.append("securityAlarm");
        sb.append('=');
        sb.append(((this.securityAlarm == null)?"<null>":this.securityAlarm));
        sb.append(',');
        sb.append("securityPersonnel");
        sb.append('=');
        sb.append(((this.securityPersonnel == null)?"<null>":this.securityPersonnel));
        sb.append(',');
        sb.append("securitySystem");
        sb.append('=');
        sb.append(((this.securitySystem == null)?"<null>":this.securitySystem));
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
        result = ((result* 31)+((this.parkingType == null)? 0 :this.parkingType.hashCode()));
        result = ((result* 31)+((this.securitySystem == null)? 0 :this.securitySystem.hashCode()));
        result = ((result* 31)+((this.liftAvailable == null)? 0 :this.liftAvailable.hashCode()));
        result = ((result* 31)+((this.parkingAutomaticDoor == null)? 0 :this.parkingAutomaticDoor.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.parkingPlaceCovered == null)? 0 :this.parkingPlaceCovered.hashCode()));
        result = ((result* 31)+((this.securityPersonnel == null)? 0 :this.securityPersonnel.hashCode()));
        result = ((result* 31)+((this.areaConstructed == null)? 0 :this.areaConstructed.hashCode()));
        result = ((result* 31)+((this.securityAlarm == null)? 0 :this.securityAlarm.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GarageFeatures) == false) {
            return false;
        }
        GarageFeatures rhs = ((GarageFeatures) other);
        return ((((((((((super.equals(rhs)&&((this.parkingType == rhs.parkingType)||((this.parkingType!= null)&&this.parkingType.equals(rhs.parkingType))))&&((this.securitySystem == rhs.securitySystem)||((this.securitySystem!= null)&&this.securitySystem.equals(rhs.securitySystem))))&&((this.liftAvailable == rhs.liftAvailable)||((this.liftAvailable!= null)&&this.liftAvailable.equals(rhs.liftAvailable))))&&((this.parkingAutomaticDoor == rhs.parkingAutomaticDoor)||((this.parkingAutomaticDoor!= null)&&this.parkingAutomaticDoor.equals(rhs.parkingAutomaticDoor))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.parkingPlaceCovered == rhs.parkingPlaceCovered)||((this.parkingPlaceCovered!= null)&&this.parkingPlaceCovered.equals(rhs.parkingPlaceCovered))))&&((this.securityPersonnel == rhs.securityPersonnel)||((this.securityPersonnel!= null)&&this.securityPersonnel.equals(rhs.securityPersonnel))))&&((this.areaConstructed == rhs.areaConstructed)||((this.areaConstructed!= null)&&this.areaConstructed.equals(rhs.areaConstructed))))&&((this.securityAlarm == rhs.securityAlarm)||((this.securityAlarm!= null)&&this.securityAlarm.equals(rhs.securityAlarm))));
    }


    /**
     * property types
     * <p>
     * 
     * 
     */
    public enum Type {

        GARAGE("garage");
        private final String value;
        private final static Map<String, GarageFeatures.Type> CONSTANTS = new HashMap<String, GarageFeatures.Type>();

        static {
            for (GarageFeatures.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
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
        public static GarageFeatures.Type fromValue(String value) {
            GarageFeatures.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
