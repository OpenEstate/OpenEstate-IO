
package org.openestate.io.idealista.json;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Customer Object
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customerSendDate",
    "customerCountry",
    "customerCode",
    "customerName",
    "customerReference",
    "customerContact",
    "customerProperties",
    "customerNewDevelopments"
})
public class Customer implements Serializable
{

    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("customerSendDate")
    @Pattern(regexp = "^20[0-9][0-9]/[0-9][0-9]/(([0-2][0-9])|(3[0-1])) (([0-1][0-9])|(2[0-4])):([0-5][0-9]):([0-5][0-9])$")
    private String customerSendDate;
    /**
     * Customer country
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("customerCountry")
    private Customer.CustomerCountry customerCountry;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("customerCode")
    @Pattern(regexp = "^ilc([a-z]|[0-9]){40}$")
    private String customerCode;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("customerName")
    @Pattern(regexp = "^.{0,100}$")
    private String customerName;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("customerReference")
    @Pattern(regexp = "^.{0,50}$")
    private String customerReference;
    /**
     * Contact Object
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("customerContact")
    @Valid
    private Contact customerContact;
    /**
     * Customer Secondhand Properties
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("customerProperties")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @Valid
    private Set<PropertyJson> customerProperties = null;
    /**
     * Customer NewDevelopment Properties
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("customerNewDevelopments")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @Valid
    private Set<NewDevelopmentJson> customerNewDevelopments = null;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2496503998602293962L;

    @JsonProperty("customerSendDate")
    public String getCustomerSendDate() {
        return customerSendDate;
    }

    @JsonProperty("customerSendDate")
    public void setCustomerSendDate(String customerSendDate) {
        this.customerSendDate = customerSendDate;
    }

    /**
     * Customer country
     * <p>
     * 
     * 
     */
    @JsonProperty("customerCountry")
    public Customer.CustomerCountry getCustomerCountry() {
        return customerCountry;
    }

    /**
     * Customer country
     * <p>
     * 
     * 
     */
    @JsonProperty("customerCountry")
    public void setCustomerCountry(Customer.CustomerCountry customerCountry) {
        this.customerCountry = customerCountry;
    }

    @JsonProperty("customerCode")
    public String getCustomerCode() {
        return customerCode;
    }

    @JsonProperty("customerCode")
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    @JsonProperty("customerName")
    public String getCustomerName() {
        return customerName;
    }

    @JsonProperty("customerName")
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @JsonProperty("customerReference")
    public String getCustomerReference() {
        return customerReference;
    }

    @JsonProperty("customerReference")
    public void setCustomerReference(String customerReference) {
        this.customerReference = customerReference;
    }

    /**
     * Contact Object
     * <p>
     * 
     * 
     */
    @JsonProperty("customerContact")
    public Contact getCustomerContact() {
        return customerContact;
    }

    /**
     * Contact Object
     * <p>
     * 
     * 
     */
    @JsonProperty("customerContact")
    public void setCustomerContact(Contact customerContact) {
        this.customerContact = customerContact;
    }

    /**
     * Customer Secondhand Properties
     * <p>
     * 
     * 
     */
    @JsonProperty("customerProperties")
    public Set<PropertyJson> getCustomerProperties() {
        return customerProperties;
    }

    /**
     * Customer Secondhand Properties
     * <p>
     * 
     * 
     */
    @JsonProperty("customerProperties")
    public void setCustomerProperties(Set<PropertyJson> customerProperties) {
        this.customerProperties = customerProperties;
    }

    /**
     * Customer NewDevelopment Properties
     * <p>
     * 
     * 
     */
    @JsonProperty("customerNewDevelopments")
    public Set<NewDevelopmentJson> getCustomerNewDevelopments() {
        return customerNewDevelopments;
    }

    /**
     * Customer NewDevelopment Properties
     * <p>
     * 
     * 
     */
    @JsonProperty("customerNewDevelopments")
    public void setCustomerNewDevelopments(Set<NewDevelopmentJson> customerNewDevelopments) {
        this.customerNewDevelopments = customerNewDevelopments;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Customer.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customerSendDate");
        sb.append('=');
        sb.append(((this.customerSendDate == null)?"<null>":this.customerSendDate));
        sb.append(',');
        sb.append("customerCountry");
        sb.append('=');
        sb.append(((this.customerCountry == null)?"<null>":this.customerCountry));
        sb.append(',');
        sb.append("customerCode");
        sb.append('=');
        sb.append(((this.customerCode == null)?"<null>":this.customerCode));
        sb.append(',');
        sb.append("customerName");
        sb.append('=');
        sb.append(((this.customerName == null)?"<null>":this.customerName));
        sb.append(',');
        sb.append("customerReference");
        sb.append('=');
        sb.append(((this.customerReference == null)?"<null>":this.customerReference));
        sb.append(',');
        sb.append("customerContact");
        sb.append('=');
        sb.append(((this.customerContact == null)?"<null>":this.customerContact));
        sb.append(',');
        sb.append("customerProperties");
        sb.append('=');
        sb.append(((this.customerProperties == null)?"<null>":this.customerProperties));
        sb.append(',');
        sb.append("customerNewDevelopments");
        sb.append('=');
        sb.append(((this.customerNewDevelopments == null)?"<null>":this.customerNewDevelopments));
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
        result = ((result* 31)+((this.customerProperties == null)? 0 :this.customerProperties.hashCode()));
        result = ((result* 31)+((this.customerContact == null)? 0 :this.customerContact.hashCode()));
        result = ((result* 31)+((this.customerReference == null)? 0 :this.customerReference.hashCode()));
        result = ((result* 31)+((this.customerCode == null)? 0 :this.customerCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.customerSendDate == null)? 0 :this.customerSendDate.hashCode()));
        result = ((result* 31)+((this.customerNewDevelopments == null)? 0 :this.customerNewDevelopments.hashCode()));
        result = ((result* 31)+((this.customerCountry == null)? 0 :this.customerCountry.hashCode()));
        result = ((result* 31)+((this.customerName == null)? 0 :this.customerName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Customer) == false) {
            return false;
        }
        Customer rhs = ((Customer) other);
        return ((((((((((this.customerProperties == rhs.customerProperties)||((this.customerProperties!= null)&&this.customerProperties.equals(rhs.customerProperties)))&&((this.customerContact == rhs.customerContact)||((this.customerContact!= null)&&this.customerContact.equals(rhs.customerContact))))&&((this.customerReference == rhs.customerReference)||((this.customerReference!= null)&&this.customerReference.equals(rhs.customerReference))))&&((this.customerCode == rhs.customerCode)||((this.customerCode!= null)&&this.customerCode.equals(rhs.customerCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.customerSendDate == rhs.customerSendDate)||((this.customerSendDate!= null)&&this.customerSendDate.equals(rhs.customerSendDate))))&&((this.customerNewDevelopments == rhs.customerNewDevelopments)||((this.customerNewDevelopments!= null)&&this.customerNewDevelopments.equals(rhs.customerNewDevelopments))))&&((this.customerCountry == rhs.customerCountry)||((this.customerCountry!= null)&&this.customerCountry.equals(rhs.customerCountry))))&&((this.customerName == rhs.customerName)||((this.customerName!= null)&&this.customerName.equals(rhs.customerName))));
    }

    public enum CustomerCountry {

        SPAIN("Spain"),
        ITALY("Italy"),
        PORTUGAL("Portugal");
        private final String value;
        private final static Map<String, Customer.CustomerCountry> CONSTANTS = new HashMap<String, Customer.CustomerCountry>();

        static {
            for (Customer.CustomerCountry c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CustomerCountry(String value) {
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
        public static Customer.CustomerCountry fromValue(String value) {
            Customer.CustomerCountry constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
