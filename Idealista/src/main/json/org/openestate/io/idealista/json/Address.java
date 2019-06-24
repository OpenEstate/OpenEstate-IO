
package org.openestate.io.idealista.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonCreator;
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
     * full address, street name or zone will be shown publicly
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("addressVisibility")
    @JsonPropertyDescription("full address, street name or zone will be shown publicly")
    private Address.AddressVisibility addressVisibility;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("addressStreetName")
    @Pattern(regexp = "^.{0,200}$")
    private String addressStreetName;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("addressStreetNumber")
    @Pattern(regexp = "^.{0,10}$")
    private String addressStreetNumber;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("addressBlock")
    @Pattern(regexp = "^.{0,20}$")
    private String addressBlock;
    /**
     * address floor
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("addressFloor")
    @Pattern(regexp = "^(-[1-2]|[1-9]|[1-5][0-9]|60|bj|en|ss|st)$")
    private String addressFloor;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("addressStair")
    @Pattern(regexp = "^.{0,10}$")
    private String addressStair;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("addressDoor")
    @Pattern(regexp = "^.{0,4}$")
    private String addressDoor;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("addressUrbanization")
    @Pattern(regexp = "^.{0,50}$")
    private String addressUrbanization;
    /**
     * address postal code
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("addressPostalCode")
    @Pattern(regexp = "^[0-9]{5}$|^AD[0-9]{3}$|^[0-9]{4}(-[0-9]{3})?$")
    private String addressPostalCode;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("addressTown")
    @Pattern(regexp = "^.{0,50}$")
    private String addressTown;
    /**
     * address nsi code
     * <p>
     * national institute of statistics town code
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("addressNsiCode")
    @JsonPropertyDescription("national institute of statistics town code")
    @Pattern(regexp = "^[0-9]{6}$")
    private String addressNsiCode;
    /**
     * address country
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("addressCountry")
    private Address.AddressCountry addressCountry;
    /**
     * address coordinates precision
     * <p>
     * if moved, just the property zone will be shown publicly, but not its address
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("addressCoordinatesPrecision")
    @JsonPropertyDescription("if moved, just the property zone will be shown publicly, but not its address")
    private Address.AddressCoordinatesPrecision addressCoordinatesPrecision;
    /**
     * address coordinates latitude
     * <p>
     * to have a good accuracy, latitude need to have at least 4 decimals
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("addressCoordinatesLatitude")
    @JsonPropertyDescription("to have a good accuracy, latitude need to have at least 4 decimals")
    @DecimalMin("-90")
    @DecimalMax("90")
    private BigDecimal addressCoordinatesLatitude;
    /**
     * address coordinates longitude
     * <p>
     * to have a good accuracy, longitude need to have at least 4 decimals
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("addressCoordinatesLongitude")
    @JsonPropertyDescription("to have a good accuracy, longitude need to have at least 4 decimals")
    @DecimalMin("-180")
    @DecimalMax("180")
    private BigDecimal addressCoordinatesLongitude;
    private final static long serialVersionUID = 3320795154613000755L;

    /**
     * address visibility
     * <p>
     * full address, street name or zone will be shown publicly
     * 
     */
    @JsonProperty("addressVisibility")
    public Address.AddressVisibility getAddressVisibility() {
        return addressVisibility;
    }

    /**
     * address visibility
     * <p>
     * full address, street name or zone will be shown publicly
     * 
     */
    @JsonProperty("addressVisibility")
    public void setAddressVisibility(Address.AddressVisibility addressVisibility) {
        this.addressVisibility = addressVisibility;
    }

    @JsonProperty("addressStreetName")
    public String getAddressStreetName() {
        return addressStreetName;
    }

    @JsonProperty("addressStreetName")
    public void setAddressStreetName(String addressStreetName) {
        this.addressStreetName = addressStreetName;
    }

    @JsonProperty("addressStreetNumber")
    public String getAddressStreetNumber() {
        return addressStreetNumber;
    }

    @JsonProperty("addressStreetNumber")
    public void setAddressStreetNumber(String addressStreetNumber) {
        this.addressStreetNumber = addressStreetNumber;
    }

    @JsonProperty("addressBlock")
    public String getAddressBlock() {
        return addressBlock;
    }

    @JsonProperty("addressBlock")
    public void setAddressBlock(String addressBlock) {
        this.addressBlock = addressBlock;
    }

    /**
     * address floor
     * <p>
     * 
     * 
     */
    @JsonProperty("addressFloor")
    public String getAddressFloor() {
        return addressFloor;
    }

    /**
     * address floor
     * <p>
     * 
     * 
     */
    @JsonProperty("addressFloor")
    public void setAddressFloor(String addressFloor) {
        this.addressFloor = addressFloor;
    }

    @JsonProperty("addressStair")
    public String getAddressStair() {
        return addressStair;
    }

    @JsonProperty("addressStair")
    public void setAddressStair(String addressStair) {
        this.addressStair = addressStair;
    }

    @JsonProperty("addressDoor")
    public String getAddressDoor() {
        return addressDoor;
    }

    @JsonProperty("addressDoor")
    public void setAddressDoor(String addressDoor) {
        this.addressDoor = addressDoor;
    }

    @JsonProperty("addressUrbanization")
    public String getAddressUrbanization() {
        return addressUrbanization;
    }

    @JsonProperty("addressUrbanization")
    public void setAddressUrbanization(String addressUrbanization) {
        this.addressUrbanization = addressUrbanization;
    }

    /**
     * address postal code
     * <p>
     * 
     * 
     */
    @JsonProperty("addressPostalCode")
    public String getAddressPostalCode() {
        return addressPostalCode;
    }

    /**
     * address postal code
     * <p>
     * 
     * 
     */
    @JsonProperty("addressPostalCode")
    public void setAddressPostalCode(String addressPostalCode) {
        this.addressPostalCode = addressPostalCode;
    }

    @JsonProperty("addressTown")
    public String getAddressTown() {
        return addressTown;
    }

    @JsonProperty("addressTown")
    public void setAddressTown(String addressTown) {
        this.addressTown = addressTown;
    }

    /**
     * address nsi code
     * <p>
     * national institute of statistics town code
     * 
     */
    @JsonProperty("addressNsiCode")
    public String getAddressNsiCode() {
        return addressNsiCode;
    }

    /**
     * address nsi code
     * <p>
     * national institute of statistics town code
     * 
     */
    @JsonProperty("addressNsiCode")
    public void setAddressNsiCode(String addressNsiCode) {
        this.addressNsiCode = addressNsiCode;
    }

    /**
     * address country
     * <p>
     * 
     * 
     */
    @JsonProperty("addressCountry")
    public Address.AddressCountry getAddressCountry() {
        return addressCountry;
    }

    /**
     * address country
     * <p>
     * 
     * 
     */
    @JsonProperty("addressCountry")
    public void setAddressCountry(Address.AddressCountry addressCountry) {
        this.addressCountry = addressCountry;
    }

    /**
     * address coordinates precision
     * <p>
     * if moved, just the property zone will be shown publicly, but not its address
     * 
     */
    @JsonProperty("addressCoordinatesPrecision")
    public Address.AddressCoordinatesPrecision getAddressCoordinatesPrecision() {
        return addressCoordinatesPrecision;
    }

    /**
     * address coordinates precision
     * <p>
     * if moved, just the property zone will be shown publicly, but not its address
     * 
     */
    @JsonProperty("addressCoordinatesPrecision")
    public void setAddressCoordinatesPrecision(Address.AddressCoordinatesPrecision addressCoordinatesPrecision) {
        this.addressCoordinatesPrecision = addressCoordinatesPrecision;
    }

    /**
     * address coordinates latitude
     * <p>
     * to have a good accuracy, latitude need to have at least 4 decimals
     * 
     */
    @JsonProperty("addressCoordinatesLatitude")
    public BigDecimal getAddressCoordinatesLatitude() {
        return addressCoordinatesLatitude;
    }

    /**
     * address coordinates latitude
     * <p>
     * to have a good accuracy, latitude need to have at least 4 decimals
     * 
     */
    @JsonProperty("addressCoordinatesLatitude")
    public void setAddressCoordinatesLatitude(BigDecimal addressCoordinatesLatitude) {
        this.addressCoordinatesLatitude = addressCoordinatesLatitude;
    }

    /**
     * address coordinates longitude
     * <p>
     * to have a good accuracy, longitude need to have at least 4 decimals
     * 
     */
    @JsonProperty("addressCoordinatesLongitude")
    public BigDecimal getAddressCoordinatesLongitude() {
        return addressCoordinatesLongitude;
    }

    /**
     * address coordinates longitude
     * <p>
     * to have a good accuracy, longitude need to have at least 4 decimals
     * 
     */
    @JsonProperty("addressCoordinatesLongitude")
    public void setAddressCoordinatesLongitude(BigDecimal addressCoordinatesLongitude) {
        this.addressCoordinatesLongitude = addressCoordinatesLongitude;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Address.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("addressVisibility");
        sb.append('=');
        sb.append(((this.addressVisibility == null)?"<null>":this.addressVisibility));
        sb.append(',');
        sb.append("addressStreetName");
        sb.append('=');
        sb.append(((this.addressStreetName == null)?"<null>":this.addressStreetName));
        sb.append(',');
        sb.append("addressStreetNumber");
        sb.append('=');
        sb.append(((this.addressStreetNumber == null)?"<null>":this.addressStreetNumber));
        sb.append(',');
        sb.append("addressBlock");
        sb.append('=');
        sb.append(((this.addressBlock == null)?"<null>":this.addressBlock));
        sb.append(',');
        sb.append("addressFloor");
        sb.append('=');
        sb.append(((this.addressFloor == null)?"<null>":this.addressFloor));
        sb.append(',');
        sb.append("addressStair");
        sb.append('=');
        sb.append(((this.addressStair == null)?"<null>":this.addressStair));
        sb.append(',');
        sb.append("addressDoor");
        sb.append('=');
        sb.append(((this.addressDoor == null)?"<null>":this.addressDoor));
        sb.append(',');
        sb.append("addressUrbanization");
        sb.append('=');
        sb.append(((this.addressUrbanization == null)?"<null>":this.addressUrbanization));
        sb.append(',');
        sb.append("addressPostalCode");
        sb.append('=');
        sb.append(((this.addressPostalCode == null)?"<null>":this.addressPostalCode));
        sb.append(',');
        sb.append("addressTown");
        sb.append('=');
        sb.append(((this.addressTown == null)?"<null>":this.addressTown));
        sb.append(',');
        sb.append("addressNsiCode");
        sb.append('=');
        sb.append(((this.addressNsiCode == null)?"<null>":this.addressNsiCode));
        sb.append(',');
        sb.append("addressCountry");
        sb.append('=');
        sb.append(((this.addressCountry == null)?"<null>":this.addressCountry));
        sb.append(',');
        sb.append("addressCoordinatesPrecision");
        sb.append('=');
        sb.append(((this.addressCoordinatesPrecision == null)?"<null>":this.addressCoordinatesPrecision));
        sb.append(',');
        sb.append("addressCoordinatesLatitude");
        sb.append('=');
        sb.append(((this.addressCoordinatesLatitude == null)?"<null>":this.addressCoordinatesLatitude));
        sb.append(',');
        sb.append("addressCoordinatesLongitude");
        sb.append('=');
        sb.append(((this.addressCoordinatesLongitude == null)?"<null>":this.addressCoordinatesLongitude));
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
        result = ((result* 31)+((this.addressNsiCode == null)? 0 :this.addressNsiCode.hashCode()));
        result = ((result* 31)+((this.addressCountry == null)? 0 :this.addressCountry.hashCode()));
        result = ((result* 31)+((this.addressStair == null)? 0 :this.addressStair.hashCode()));
        result = ((result* 31)+((this.addressCoordinatesPrecision == null)? 0 :this.addressCoordinatesPrecision.hashCode()));
        result = ((result* 31)+((this.addressCoordinatesLatitude == null)? 0 :this.addressCoordinatesLatitude.hashCode()));
        result = ((result* 31)+((this.addressDoor == null)? 0 :this.addressDoor.hashCode()));
        result = ((result* 31)+((this.addressFloor == null)? 0 :this.addressFloor.hashCode()));
        result = ((result* 31)+((this.addressCoordinatesLongitude == null)? 0 :this.addressCoordinatesLongitude.hashCode()));
        result = ((result* 31)+((this.addressTown == null)? 0 :this.addressTown.hashCode()));
        result = ((result* 31)+((this.addressPostalCode == null)? 0 :this.addressPostalCode.hashCode()));
        result = ((result* 31)+((this.addressVisibility == null)? 0 :this.addressVisibility.hashCode()));
        result = ((result* 31)+((this.addressUrbanization == null)? 0 :this.addressUrbanization.hashCode()));
        result = ((result* 31)+((this.addressStreetName == null)? 0 :this.addressStreetName.hashCode()));
        result = ((result* 31)+((this.addressBlock == null)? 0 :this.addressBlock.hashCode()));
        result = ((result* 31)+((this.addressStreetNumber == null)? 0 :this.addressStreetNumber.hashCode()));
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
        return ((((((((((((((((this.addressNsiCode == rhs.addressNsiCode)||((this.addressNsiCode!= null)&&this.addressNsiCode.equals(rhs.addressNsiCode)))&&((this.addressCountry == rhs.addressCountry)||((this.addressCountry!= null)&&this.addressCountry.equals(rhs.addressCountry))))&&((this.addressStair == rhs.addressStair)||((this.addressStair!= null)&&this.addressStair.equals(rhs.addressStair))))&&((this.addressCoordinatesPrecision == rhs.addressCoordinatesPrecision)||((this.addressCoordinatesPrecision!= null)&&this.addressCoordinatesPrecision.equals(rhs.addressCoordinatesPrecision))))&&((this.addressCoordinatesLatitude == rhs.addressCoordinatesLatitude)||((this.addressCoordinatesLatitude!= null)&&this.addressCoordinatesLatitude.equals(rhs.addressCoordinatesLatitude))))&&((this.addressDoor == rhs.addressDoor)||((this.addressDoor!= null)&&this.addressDoor.equals(rhs.addressDoor))))&&((this.addressFloor == rhs.addressFloor)||((this.addressFloor!= null)&&this.addressFloor.equals(rhs.addressFloor))))&&((this.addressCoordinatesLongitude == rhs.addressCoordinatesLongitude)||((this.addressCoordinatesLongitude!= null)&&this.addressCoordinatesLongitude.equals(rhs.addressCoordinatesLongitude))))&&((this.addressTown == rhs.addressTown)||((this.addressTown!= null)&&this.addressTown.equals(rhs.addressTown))))&&((this.addressPostalCode == rhs.addressPostalCode)||((this.addressPostalCode!= null)&&this.addressPostalCode.equals(rhs.addressPostalCode))))&&((this.addressVisibility == rhs.addressVisibility)||((this.addressVisibility!= null)&&this.addressVisibility.equals(rhs.addressVisibility))))&&((this.addressUrbanization == rhs.addressUrbanization)||((this.addressUrbanization!= null)&&this.addressUrbanization.equals(rhs.addressUrbanization))))&&((this.addressStreetName == rhs.addressStreetName)||((this.addressStreetName!= null)&&this.addressStreetName.equals(rhs.addressStreetName))))&&((this.addressBlock == rhs.addressBlock)||((this.addressBlock!= null)&&this.addressBlock.equals(rhs.addressBlock))))&&((this.addressStreetNumber == rhs.addressStreetNumber)||((this.addressStreetNumber!= null)&&this.addressStreetNumber.equals(rhs.addressStreetNumber))));
    }

    public enum AddressCoordinatesPrecision {

        EXACT("exact"),
        MOVED("moved");
        private final String value;
        private final static Map<String, Address.AddressCoordinatesPrecision> CONSTANTS = new HashMap<String, Address.AddressCoordinatesPrecision>();

        static {
            for (Address.AddressCoordinatesPrecision c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private AddressCoordinatesPrecision(String value) {
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
        public static Address.AddressCoordinatesPrecision fromValue(String value) {
            Address.AddressCoordinatesPrecision constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum AddressCountry {

        SPAIN("Spain"),
        ITALY("Italy"),
        PORTUGAL("Portugal"),
        ANDORRA("Andorra"),
        FRANCE("France"),
        SWITZERLAND("Switzerland"),
        SAN_MARINO("San Marino");
        private final String value;
        private final static Map<String, Address.AddressCountry> CONSTANTS = new HashMap<String, Address.AddressCountry>();

        static {
            for (Address.AddressCountry c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private AddressCountry(String value) {
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
        public static Address.AddressCountry fromValue(String value) {
            Address.AddressCountry constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum AddressVisibility {

        FULL("full"),
        STREET("street"),
        HIDDEN("hidden");
        private final String value;
        private final static Map<String, Address.AddressVisibility> CONSTANTS = new HashMap<String, Address.AddressVisibility>();

        static {
            for (Address.AddressVisibility c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private AddressVisibility(String value) {
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
        public static Address.AddressVisibility fromValue(String value) {
            Address.AddressVisibility constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
