
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
import com.fasterxml.jackson.annotation.JsonCreator;
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
public class OperationJson implements Serializable
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
    private BigDecimal operationDepositMonths;
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
    private BigInteger operationPrice;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("operationPriceCommunity")
    @DecimalMin("1")
    @DecimalMax("9999")
    private BigInteger operationPriceCommunity;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("operationPriceToOwn")
    @DecimalMin("1")
    @DecimalMax("99999999")
    private BigInteger operationPriceToOwn;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("operationPriceTransfer")
    @DecimalMin("1")
    @DecimalMax("99999999")
    private BigInteger operationPriceTransfer;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("operationPriceParking")
    @DecimalMin("1")
    @DecimalMax("99999999")
    private BigInteger operationPriceParking;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("operationType")
    @NotNull
    @Nonnull
    private OperationJson.EnumOperationType operationType;
    private final static long serialVersionUID = 7236801709111525606L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OperationJson() {
    }

    /**
     * 
     * @param operationPrice
     * @param operationType
     */
    public OperationJson(BigInteger operationPrice, OperationJson.EnumOperationType operationType) {
        super();
        this.operationPrice = operationPrice;
        this.operationType = operationType;
    }

    @JsonProperty("operationDepositMonths")
    public BigDecimal getOperationDepositMonths() {
        return operationDepositMonths;
    }

    @JsonProperty("operationDepositMonths")
    public void setOperationDepositMonths(BigDecimal operationDepositMonths) {
        this.operationDepositMonths = operationDepositMonths;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("operationPrice")
    public BigInteger getOperationPrice() {
        return operationPrice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("operationPrice")
    public void setOperationPrice(BigInteger operationPrice) {
        this.operationPrice = operationPrice;
    }

    @JsonProperty("operationPriceCommunity")
    public BigInteger getOperationPriceCommunity() {
        return operationPriceCommunity;
    }

    @JsonProperty("operationPriceCommunity")
    public void setOperationPriceCommunity(BigInteger operationPriceCommunity) {
        this.operationPriceCommunity = operationPriceCommunity;
    }

    @JsonProperty("operationPriceToOwn")
    public BigInteger getOperationPriceToOwn() {
        return operationPriceToOwn;
    }

    @JsonProperty("operationPriceToOwn")
    public void setOperationPriceToOwn(BigInteger operationPriceToOwn) {
        this.operationPriceToOwn = operationPriceToOwn;
    }

    @JsonProperty("operationPriceTransfer")
    public BigInteger getOperationPriceTransfer() {
        return operationPriceTransfer;
    }

    @JsonProperty("operationPriceTransfer")
    public void setOperationPriceTransfer(BigInteger operationPriceTransfer) {
        this.operationPriceTransfer = operationPriceTransfer;
    }

    @JsonProperty("operationPriceParking")
    public BigInteger getOperationPriceParking() {
        return operationPriceParking;
    }

    @JsonProperty("operationPriceParking")
    public void setOperationPriceParking(BigInteger operationPriceParking) {
        this.operationPriceParking = operationPriceParking;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("operationType")
    public OperationJson.EnumOperationType getOperationType() {
        return operationType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("operationType")
    public void setOperationType(OperationJson.EnumOperationType operationType) {
        this.operationType = operationType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OperationJson.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("operationDepositMonths");
        sb.append('=');
        sb.append(((this.operationDepositMonths == null)?"<null>":this.operationDepositMonths));
        sb.append(',');
        sb.append("operationPrice");
        sb.append('=');
        sb.append(((this.operationPrice == null)?"<null>":this.operationPrice));
        sb.append(',');
        sb.append("operationPriceCommunity");
        sb.append('=');
        sb.append(((this.operationPriceCommunity == null)?"<null>":this.operationPriceCommunity));
        sb.append(',');
        sb.append("operationPriceToOwn");
        sb.append('=');
        sb.append(((this.operationPriceToOwn == null)?"<null>":this.operationPriceToOwn));
        sb.append(',');
        sb.append("operationPriceTransfer");
        sb.append('=');
        sb.append(((this.operationPriceTransfer == null)?"<null>":this.operationPriceTransfer));
        sb.append(',');
        sb.append("operationPriceParking");
        sb.append('=');
        sb.append(((this.operationPriceParking == null)?"<null>":this.operationPriceParking));
        sb.append(',');
        sb.append("operationType");
        sb.append('=');
        sb.append(((this.operationType == null)?"<null>":this.operationType));
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
        result = ((result* 31)+((this.operationPrice == null)? 0 :this.operationPrice.hashCode()));
        result = ((result* 31)+((this.operationPriceParking == null)? 0 :this.operationPriceParking.hashCode()));
        result = ((result* 31)+((this.operationDepositMonths == null)? 0 :this.operationDepositMonths.hashCode()));
        result = ((result* 31)+((this.operationPriceTransfer == null)? 0 :this.operationPriceTransfer.hashCode()));
        result = ((result* 31)+((this.operationPriceCommunity == null)? 0 :this.operationPriceCommunity.hashCode()));
        result = ((result* 31)+((this.operationType == null)? 0 :this.operationType.hashCode()));
        result = ((result* 31)+((this.operationPriceToOwn == null)? 0 :this.operationPriceToOwn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OperationJson) == false) {
            return false;
        }
        OperationJson rhs = ((OperationJson) other);
        return ((((((((this.operationPrice == rhs.operationPrice)||((this.operationPrice!= null)&&this.operationPrice.equals(rhs.operationPrice)))&&((this.operationPriceParking == rhs.operationPriceParking)||((this.operationPriceParking!= null)&&this.operationPriceParking.equals(rhs.operationPriceParking))))&&((this.operationDepositMonths == rhs.operationDepositMonths)||((this.operationDepositMonths!= null)&&this.operationDepositMonths.equals(rhs.operationDepositMonths))))&&((this.operationPriceTransfer == rhs.operationPriceTransfer)||((this.operationPriceTransfer!= null)&&this.operationPriceTransfer.equals(rhs.operationPriceTransfer))))&&((this.operationPriceCommunity == rhs.operationPriceCommunity)||((this.operationPriceCommunity!= null)&&this.operationPriceCommunity.equals(rhs.operationPriceCommunity))))&&((this.operationType == rhs.operationType)||((this.operationType!= null)&&this.operationType.equals(rhs.operationType))))&&((this.operationPriceToOwn == rhs.operationPriceToOwn)||((this.operationPriceToOwn!= null)&&this.operationPriceToOwn.equals(rhs.operationPriceToOwn))));
    }

    public enum EnumOperationType {

        RENT("rent"),
        SALE("sale"),
        RENT_TO_OWN("rentToOwn");
        private final String value;
        private final static Map<String, OperationJson.EnumOperationType> CONSTANTS = new HashMap<String, OperationJson.EnumOperationType>();

        static {
            for (OperationJson.EnumOperationType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private EnumOperationType(String value) {
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
        public static OperationJson.EnumOperationType fromValue(String value) {
            OperationJson.EnumOperationType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
