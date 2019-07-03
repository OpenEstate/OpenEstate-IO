
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Operation Object
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "operationDepositMonths",
    "operationPrice",
    "operationPriceCommunity",
    "operationPriceToOwn",
    "operationPriceTransfer",
    "operationPriceParking",
    "operationType"
})
public class Operation implements Serializable
{

    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("operationDepositMonths")
    @DecimalMin("0")
    @DecimalMax("12")
    private BigDecimal depositMonths;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("operationPrice")
    @DecimalMin("1")
    @DecimalMax("99999999")
    @NotNull
    @Nonnull
    private BigInteger price;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("operationPriceCommunity")
    @DecimalMin("1")
    @DecimalMax("9999")
    private BigInteger priceCommunity;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("operationPriceToOwn")
    @DecimalMin("1")
    @DecimalMax("99999999")
    private BigInteger priceToOwn;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("operationPriceTransfer")
    @DecimalMin("1")
    @DecimalMax("99999999")
    private BigInteger priceTransfer;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("operationPriceParking")
    @DecimalMin("1")
    @DecimalMax("99999999")
    private BigInteger priceParking;
    /**
     * 
     * Corresponds to the "operationType" property.
     * (Required)
     * 
     */
    @JsonProperty("operationType")
    @NotNull
    @Nonnull
    private Operation.Type type;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8039840371972681481L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Operation() {
    }

    /**
     * 
     * @param price
     * @param type
     */
    public Operation(BigInteger price, Operation.Type type) {
        super();
        this.price = price;
        this.type = type;
    }

    @JsonProperty("operationDepositMonths")
    public BigDecimal getDepositMonths() {
        return depositMonths;
    }

    @JsonProperty("operationDepositMonths")
    public void setDepositMonths(BigDecimal depositMonths) {
        this.depositMonths = depositMonths;
    }

    public Operation withDepositMonths(BigDecimal depositMonths) {
        this.depositMonths = depositMonths;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("operationPrice")
    public BigInteger getPrice() {
        return price;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("operationPrice")
    public void setPrice(BigInteger price) {
        this.price = price;
    }

    public Operation withPrice(BigInteger price) {
        this.price = price;
        return this;
    }

    @JsonProperty("operationPriceCommunity")
    public BigInteger getPriceCommunity() {
        return priceCommunity;
    }

    @JsonProperty("operationPriceCommunity")
    public void setPriceCommunity(BigInteger priceCommunity) {
        this.priceCommunity = priceCommunity;
    }

    public Operation withPriceCommunity(BigInteger priceCommunity) {
        this.priceCommunity = priceCommunity;
        return this;
    }

    @JsonProperty("operationPriceToOwn")
    public BigInteger getPriceToOwn() {
        return priceToOwn;
    }

    @JsonProperty("operationPriceToOwn")
    public void setPriceToOwn(BigInteger priceToOwn) {
        this.priceToOwn = priceToOwn;
    }

    public Operation withPriceToOwn(BigInteger priceToOwn) {
        this.priceToOwn = priceToOwn;
        return this;
    }

    @JsonProperty("operationPriceTransfer")
    public BigInteger getPriceTransfer() {
        return priceTransfer;
    }

    @JsonProperty("operationPriceTransfer")
    public void setPriceTransfer(BigInteger priceTransfer) {
        this.priceTransfer = priceTransfer;
    }

    public Operation withPriceTransfer(BigInteger priceTransfer) {
        this.priceTransfer = priceTransfer;
        return this;
    }

    @JsonProperty("operationPriceParking")
    public BigInteger getPriceParking() {
        return priceParking;
    }

    @JsonProperty("operationPriceParking")
    public void setPriceParking(BigInteger priceParking) {
        this.priceParking = priceParking;
    }

    public Operation withPriceParking(BigInteger priceParking) {
        this.priceParking = priceParking;
        return this;
    }

    /**
     * 
     * Corresponds to the "operationType" property.
     * (Required)
     * 
     */
    @JsonProperty("operationType")
    public Operation.Type getType() {
        return type;
    }

    /**
     * 
     * Corresponds to the "operationType" property.
     * (Required)
     * 
     */
    @JsonProperty("operationType")
    public void setType(Operation.Type type) {
        this.type = type;
    }

    public Operation withType(Operation.Type type) {
        this.type = type;
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

    public Operation withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Operation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("depositMonths");
        sb.append('=');
        sb.append(((this.depositMonths == null)?"<null>":this.depositMonths));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("priceCommunity");
        sb.append('=');
        sb.append(((this.priceCommunity == null)?"<null>":this.priceCommunity));
        sb.append(',');
        sb.append("priceToOwn");
        sb.append('=');
        sb.append(((this.priceToOwn == null)?"<null>":this.priceToOwn));
        sb.append(',');
        sb.append("priceTransfer");
        sb.append('=');
        sb.append(((this.priceTransfer == null)?"<null>":this.priceTransfer));
        sb.append(',');
        sb.append("priceParking");
        sb.append('=');
        sb.append(((this.priceParking == null)?"<null>":this.priceParking));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        result = ((result* 31)+((this.priceCommunity == null)? 0 :this.priceCommunity.hashCode()));
        result = ((result* 31)+((this.priceTransfer == null)? 0 :this.priceTransfer.hashCode()));
        result = ((result* 31)+((this.priceParking == null)? 0 :this.priceParking.hashCode()));
        result = ((result* 31)+((this.price == null)? 0 :this.price.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.depositMonths == null)? 0 :this.depositMonths.hashCode()));
        result = ((result* 31)+((this.priceToOwn == null)? 0 :this.priceToOwn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Operation) == false) {
            return false;
        }
        Operation rhs = ((Operation) other);
        return (((((((((this.priceCommunity == rhs.priceCommunity)||((this.priceCommunity!= null)&&this.priceCommunity.equals(rhs.priceCommunity)))&&((this.priceTransfer == rhs.priceTransfer)||((this.priceTransfer!= null)&&this.priceTransfer.equals(rhs.priceTransfer))))&&((this.priceParking == rhs.priceParking)||((this.priceParking!= null)&&this.priceParking.equals(rhs.priceParking))))&&((this.price == rhs.price)||((this.price!= null)&&this.price.equals(rhs.price))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.depositMonths == rhs.depositMonths)||((this.depositMonths!= null)&&this.depositMonths.equals(rhs.depositMonths))))&&((this.priceToOwn == rhs.priceToOwn)||((this.priceToOwn!= null)&&this.priceToOwn.equals(rhs.priceToOwn))));
    }

    public enum Type {

        RENT("rent"),
        SALE("sale"),
        RENT_TO_OWN("rentToOwn");
        private final String value;
        private final static Map<String, Operation.Type> CONSTANTS = new HashMap<String, Operation.Type>();

        static {
            for (Operation.Type c: values()) {
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
        public static Operation.Type fromValue(String value) {
            Operation.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
