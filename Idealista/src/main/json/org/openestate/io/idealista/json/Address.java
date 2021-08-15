
package org.openestate.io.idealista.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
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
 * Address Object
 * <p>
 * the option of (addressPostalCode, addressCountry) is only available for Portugal. If you send only coordinates we will not publish with exact visibility, maximum with street only visibility
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "addressVisibility",
    "addressStreetName",
    "addressStreetNumber",
    "addressBlock",
    "addressFloor",
    "addressStair",
    "addressDoor",
    "addressUrbanization",
    "addressPostalCode",
    "addressTown",
    "addressNsiCode",
    "addressCountry",
    "addressCoordinatesPrecision",
    "addressCoordinatesLatitude",
    "addressCoordinatesLongitude"
})
public class Address implements Serializable
{

    /**
     * address visibility
     * <p>
     * 
     * Corresponds to the "addressVisibility" property.full address, street name or zone will be shown publicly
     * 
     */
    @JsonProperty("addressVisibility")
    @JsonPropertyDescription("full address, street name or zone will be shown publicly")
    private Address.Visibility visibility;
    @JsonProperty("addressStreetName")
    @Pattern(regexp = "^.{0,200}$")
    private String streetName;
    @JsonProperty("addressStreetNumber")
    @Pattern(regexp = "^.{0,10}$")
    private String streetNumber;
    @JsonProperty("addressBlock")
    @Pattern(regexp = "^.{0,20}$")
    private String block;
    /**
     * address floor
     * <p>
     * 
     * Corresponds to the "addressFloor" property.
     * 
     */
    @JsonProperty("addressFloor")
    @Pattern(regexp = "^(-[1-2]|[1-9]|[1-5][0-9]|60|bj|en|ss|st)$")
    private String floor;
    @JsonProperty("addressStair")
    @Pattern(regexp = "^.{0,10}$")
    private String stair;
    @JsonProperty("addressDoor")
    @Pattern(regexp = "^.{0,4}$")
    private String door;
    @JsonProperty("addressUrbanization")
    @Pattern(regexp = "^.{0,50}$")
    private String urbanization;
    /**
     * address postal code
     * <p>
     * 
     * Corresponds to the "addressPostalCode" property.
     * 
     */
    @JsonProperty("addressPostalCode")
    @Pattern(regexp = "^[0-9]{5}$|^AD[0-9]{3}$|^[0-9]{4}(-[0-9]{3})?$")
    private String postalCode;
    @JsonProperty("addressTown")
    @Pattern(regexp = "^.{0,50}$")
    private String town;
    /**
     * address nsi code
     * <p>
     * 
     * Corresponds to the "addressNsiCode" property.national institute of statistics town code
     * 
     */
    @JsonProperty("addressNsiCode")
    @JsonPropertyDescription("national institute of statistics town code")
    @Pattern(regexp = "^[0-9]{6}$")
    private String nsiCode;
    /**
     * address country
     * <p>
     * 
     * Corresponds to the "addressCountry" property.
     * 
     */
    @JsonProperty("addressCountry")
    private Address.Country country;
    /**
     * address coordinates precision
     * <p>
     * 
     * Corresponds to the "addressCoordinatesPrecision" property.if moved, just the property zone will be shown publicly, but not its address
     * 
     */
    @JsonProperty("addressCoordinatesPrecision")
    @JsonPropertyDescription("if moved, just the property zone will be shown publicly, but not its address")
    private Address.CoordinatesPrecision coordinatesPrecision;
    /**
     * address coordinates latitude
     * <p>
     * 
     * Corresponds to the "addressCoordinatesLatitude" property.to have a good accuracy, latitude need to have at least 4 decimals
     * 
     */
    @JsonProperty("addressCoordinatesLatitude")
    @JsonPropertyDescription("to have a good accuracy, latitude need to have at least 4 decimals")
    @DecimalMin("-90")
    @DecimalMax("90")
    private BigDecimal coordinatesLatitude;
    /**
     * address coordinates longitude
     * <p>
     * 
     * Corresponds to the "addressCoordinatesLongitude" property.to have a good accuracy, longitude need to have at least 4 decimals
     * 
     */
    @JsonProperty("addressCoordinatesLongitude")
    @JsonPropertyDescription("to have a good accuracy, longitude need to have at least 4 decimals")
    @DecimalMin("-180")
    @DecimalMax("180")
    private BigDecimal coordinatesLongitude;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 9024735423331326534L;

    /**
     * address visibility
     * <p>
     * 
     * Corresponds to the "addressVisibility" property.full address, street name or zone will be shown publicly
     * 
     */
    @JsonProperty("addressVisibility")
    public Address.Visibility getVisibility() {
        return visibility;
    }

    /**
     * address visibility
     * <p>
     * 
     * Corresponds to the "addressVisibility" property.full address, street name or zone will be shown publicly
     * 
     */
    @JsonProperty("addressVisibility")
    public void setVisibility(Address.Visibility visibility) {
        this.visibility = visibility;
    }

    public Address withVisibility(Address.Visibility visibility) {
        this.visibility = visibility;
        return this;
    }

    @JsonProperty("addressStreetName")
    public String getStreetName() {
        return streetName;
    }

    @JsonProperty("addressStreetName")
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Address withStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    @JsonProperty("addressStreetNumber")
    public String getStreetNumber() {
        return streetNumber;
    }

    @JsonProperty("addressStreetNumber")
    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public Address withStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
        return this;
    }

    @JsonProperty("addressBlock")
    public String getBlock() {
        return block;
    }

    @JsonProperty("addressBlock")
    public void setBlock(String block) {
        this.block = block;
    }

    public Address withBlock(String block) {
        this.block = block;
        return this;
    }

    /**
     * address floor
     * <p>
     * 
     * Corresponds to the "addressFloor" property.
     * 
     */
    @JsonProperty("addressFloor")
    public String getFloor() {
        return floor;
    }

    /**
     * address floor
     * <p>
     * 
     * Corresponds to the "addressFloor" property.
     * 
     */
    @JsonProperty("addressFloor")
    public void setFloor(String floor) {
        this.floor = floor;
    }

    public Address withFloor(String floor) {
        this.floor = floor;
        return this;
    }

    @JsonProperty("addressStair")
    public String getStair() {
        return stair;
    }

    @JsonProperty("addressStair")
    public void setStair(String stair) {
        this.stair = stair;
    }

    public Address withStair(String stair) {
        this.stair = stair;
        return this;
    }

    @JsonProperty("addressDoor")
    public String getDoor() {
        return door;
    }

    @JsonProperty("addressDoor")
    public void setDoor(String door) {
        this.door = door;
    }

    public Address withDoor(String door) {
        this.door = door;
        return this;
    }

    @JsonProperty("addressUrbanization")
    public String getUrbanization() {
        return urbanization;
    }

    @JsonProperty("addressUrbanization")
    public void setUrbanization(String urbanization) {
        this.urbanization = urbanization;
    }

    public Address withUrbanization(String urbanization) {
        this.urbanization = urbanization;
        return this;
    }

    /**
     * address postal code
     * <p>
     * 
     * Corresponds to the "addressPostalCode" property.
     * 
     */
    @JsonProperty("addressPostalCode")
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * address postal code
     * <p>
     * 
     * Corresponds to the "addressPostalCode" property.
     * 
     */
    @JsonProperty("addressPostalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Address withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    @JsonProperty("addressTown")
    public String getTown() {
        return town;
    }

    @JsonProperty("addressTown")
    public void setTown(String town) {
        this.town = town;
    }

    public Address withTown(String town) {
        this.town = town;
        return this;
    }

    /**
     * address nsi code
     * <p>
     * 
     * Corresponds to the "addressNsiCode" property.national institute of statistics town code
     * 
     */
    @JsonProperty("addressNsiCode")
    public String getNsiCode() {
        return nsiCode;
    }

    /**
     * address nsi code
     * <p>
     * 
     * Corresponds to the "addressNsiCode" property.national institute of statistics town code
     * 
     */
    @JsonProperty("addressNsiCode")
    public void setNsiCode(String nsiCode) {
        this.nsiCode = nsiCode;
    }

    public Address withNsiCode(String nsiCode) {
        this.nsiCode = nsiCode;
        return this;
    }

    /**
     * address country
     * <p>
     * 
     * Corresponds to the "addressCountry" property.
     * 
     */
    @JsonProperty("addressCountry")
    public Address.Country getCountry() {
        return country;
    }

    /**
     * address country
     * <p>
     * 
     * Corresponds to the "addressCountry" property.
     * 
     */
    @JsonProperty("addressCountry")
    public void setCountry(Address.Country country) {
        this.country = country;
    }

    public Address withCountry(Address.Country country) {
        this.country = country;
        return this;
    }

    /**
     * address coordinates precision
     * <p>
     * 
     * Corresponds to the "addressCoordinatesPrecision" property.if moved, just the property zone will be shown publicly, but not its address
     * 
     */
    @JsonProperty("addressCoordinatesPrecision")
    public Address.CoordinatesPrecision getCoordinatesPrecision() {
        return coordinatesPrecision;
    }

    /**
     * address coordinates precision
     * <p>
     * 
     * Corresponds to the "addressCoordinatesPrecision" property.if moved, just the property zone will be shown publicly, but not its address
     * 
     */
    @JsonProperty("addressCoordinatesPrecision")
    public void setCoordinatesPrecision(Address.CoordinatesPrecision coordinatesPrecision) {
        this.coordinatesPrecision = coordinatesPrecision;
    }

    public Address withCoordinatesPrecision(Address.CoordinatesPrecision coordinatesPrecision) {
        this.coordinatesPrecision = coordinatesPrecision;
        return this;
    }

    /**
     * address coordinates latitude
     * <p>
     * 
     * Corresponds to the "addressCoordinatesLatitude" property.to have a good accuracy, latitude need to have at least 4 decimals
     * 
     */
    @JsonProperty("addressCoordinatesLatitude")
    public BigDecimal getCoordinatesLatitude() {
        return coordinatesLatitude;
    }

    /**
     * address coordinates latitude
     * <p>
     * 
     * Corresponds to the "addressCoordinatesLatitude" property.to have a good accuracy, latitude need to have at least 4 decimals
     * 
     */
    @JsonProperty("addressCoordinatesLatitude")
    public void setCoordinatesLatitude(BigDecimal coordinatesLatitude) {
        this.coordinatesLatitude = coordinatesLatitude;
    }

    public Address withCoordinatesLatitude(BigDecimal coordinatesLatitude) {
        this.coordinatesLatitude = coordinatesLatitude;
        return this;
    }

    /**
     * address coordinates longitude
     * <p>
     * 
     * Corresponds to the "addressCoordinatesLongitude" property.to have a good accuracy, longitude need to have at least 4 decimals
     * 
     */
    @JsonProperty("addressCoordinatesLongitude")
    public BigDecimal getCoordinatesLongitude() {
        return coordinatesLongitude;
    }

    /**
     * address coordinates longitude
     * <p>
     * 
     * Corresponds to the "addressCoordinatesLongitude" property.to have a good accuracy, longitude need to have at least 4 decimals
     * 
     */
    @JsonProperty("addressCoordinatesLongitude")
    public void setCoordinatesLongitude(BigDecimal coordinatesLongitude) {
        this.coordinatesLongitude = coordinatesLongitude;
    }

    public Address withCoordinatesLongitude(BigDecimal coordinatesLongitude) {
        this.coordinatesLongitude = coordinatesLongitude;
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

    public Address withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Address.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("visibility");
        sb.append('=');
        sb.append(((this.visibility == null)?"<null>":this.visibility));
        sb.append(',');
        sb.append("streetName");
        sb.append('=');
        sb.append(((this.streetName == null)?"<null>":this.streetName));
        sb.append(',');
        sb.append("streetNumber");
        sb.append('=');
        sb.append(((this.streetNumber == null)?"<null>":this.streetNumber));
        sb.append(',');
        sb.append("block");
        sb.append('=');
        sb.append(((this.block == null)?"<null>":this.block));
        sb.append(',');
        sb.append("floor");
        sb.append('=');
        sb.append(((this.floor == null)?"<null>":this.floor));
        sb.append(',');
        sb.append("stair");
        sb.append('=');
        sb.append(((this.stair == null)?"<null>":this.stair));
        sb.append(',');
        sb.append("door");
        sb.append('=');
        sb.append(((this.door == null)?"<null>":this.door));
        sb.append(',');
        sb.append("urbanization");
        sb.append('=');
        sb.append(((this.urbanization == null)?"<null>":this.urbanization));
        sb.append(',');
        sb.append("postalCode");
        sb.append('=');
        sb.append(((this.postalCode == null)?"<null>":this.postalCode));
        sb.append(',');
        sb.append("town");
        sb.append('=');
        sb.append(((this.town == null)?"<null>":this.town));
        sb.append(',');
        sb.append("nsiCode");
        sb.append('=');
        sb.append(((this.nsiCode == null)?"<null>":this.nsiCode));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("coordinatesPrecision");
        sb.append('=');
        sb.append(((this.coordinatesPrecision == null)?"<null>":this.coordinatesPrecision));
        sb.append(',');
        sb.append("coordinatesLatitude");
        sb.append('=');
        sb.append(((this.coordinatesLatitude == null)?"<null>":this.coordinatesLatitude));
        sb.append(',');
        sb.append("coordinatesLongitude");
        sb.append('=');
        sb.append(((this.coordinatesLongitude == null)?"<null>":this.coordinatesLongitude));
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
        result = ((result* 31)+((this.door == null)? 0 :this.door.hashCode()));
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.stair == null)? 0 :this.stair.hashCode()));
        result = ((result* 31)+((this.nsiCode == null)? 0 :this.nsiCode.hashCode()));
        result = ((result* 31)+((this.visibility == null)? 0 :this.visibility.hashCode()));
        result = ((result* 31)+((this.town == null)? 0 :this.town.hashCode()));
        result = ((result* 31)+((this.streetNumber == null)? 0 :this.streetNumber.hashCode()));
        result = ((result* 31)+((this.postalCode == null)? 0 :this.postalCode.hashCode()));
        result = ((result* 31)+((this.coordinatesPrecision == null)? 0 :this.coordinatesPrecision.hashCode()));
        result = ((result* 31)+((this.urbanization == null)? 0 :this.urbanization.hashCode()));
        result = ((result* 31)+((this.coordinatesLatitude == null)? 0 :this.coordinatesLatitude.hashCode()));
        result = ((result* 31)+((this.streetName == null)? 0 :this.streetName.hashCode()));
        result = ((result* 31)+((this.coordinatesLongitude == null)? 0 :this.coordinatesLongitude.hashCode()));
        result = ((result* 31)+((this.block == null)? 0 :this.block.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.floor == null)? 0 :this.floor.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Address) == false) {
            return false;
        }
        Address rhs = ((Address) other);
        return (((((((((((((((((this.door == rhs.door)||((this.door!= null)&&this.door.equals(rhs.door)))&&((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country))))&&((this.stair == rhs.stair)||((this.stair!= null)&&this.stair.equals(rhs.stair))))&&((this.nsiCode == rhs.nsiCode)||((this.nsiCode!= null)&&this.nsiCode.equals(rhs.nsiCode))))&&((this.visibility == rhs.visibility)||((this.visibility!= null)&&this.visibility.equals(rhs.visibility))))&&((this.town == rhs.town)||((this.town!= null)&&this.town.equals(rhs.town))))&&((this.streetNumber == rhs.streetNumber)||((this.streetNumber!= null)&&this.streetNumber.equals(rhs.streetNumber))))&&((this.postalCode == rhs.postalCode)||((this.postalCode!= null)&&this.postalCode.equals(rhs.postalCode))))&&((this.coordinatesPrecision == rhs.coordinatesPrecision)||((this.coordinatesPrecision!= null)&&this.coordinatesPrecision.equals(rhs.coordinatesPrecision))))&&((this.urbanization == rhs.urbanization)||((this.urbanization!= null)&&this.urbanization.equals(rhs.urbanization))))&&((this.coordinatesLatitude == rhs.coordinatesLatitude)||((this.coordinatesLatitude!= null)&&this.coordinatesLatitude.equals(rhs.coordinatesLatitude))))&&((this.streetName == rhs.streetName)||((this.streetName!= null)&&this.streetName.equals(rhs.streetName))))&&((this.coordinatesLongitude == rhs.coordinatesLongitude)||((this.coordinatesLongitude!= null)&&this.coordinatesLongitude.equals(rhs.coordinatesLongitude))))&&((this.block == rhs.block)||((this.block!= null)&&this.block.equals(rhs.block))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.floor == rhs.floor)||((this.floor!= null)&&this.floor.equals(rhs.floor))));
    }


    /**
     * address coordinates precision
     * <p>
     * if moved, just the property zone will be shown publicly, but not its address
     * 
     */
    public enum CoordinatesPrecision {

        EXACT("exact"),
        MOVED("moved");
        private final String value;
        private final static Map<String, Address.CoordinatesPrecision> CONSTANTS = new HashMap<String, Address.CoordinatesPrecision>();

        static {
            for (Address.CoordinatesPrecision c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        CoordinatesPrecision(String value) {
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
        public static Address.CoordinatesPrecision fromValue(String value) {
            Address.CoordinatesPrecision constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * address country
     * <p>
     * 
     * 
     */
    public enum Country {

        SPAIN("Spain"),
        ITALY("Italy"),
        PORTUGAL("Portugal"),
        ANDORRA("Andorra"),
        FRANCE("France"),
        SWITZERLAND("Switzerland"),
        SAN_MARINO("San Marino");
        private final String value;
        private final static Map<String, Address.Country> CONSTANTS = new HashMap<String, Address.Country>();

        static {
            for (Address.Country c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Country(String value) {
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
        public static Address.Country fromValue(String value) {
            Address.Country constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * address visibility
     * <p>
     * full address, street name or zone will be shown publicly
     * 
     */
    public enum Visibility {

        FULL("full"),
        STREET("street"),
        HIDDEN("hidden");
        private final String value;
        private final static Map<String, Address.Visibility> CONSTANTS = new HashMap<String, Address.Visibility>();

        static {
            for (Address.Visibility c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Visibility(String value) {
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
        public static Address.Visibility fromValue(String value) {
            Address.Visibility constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
