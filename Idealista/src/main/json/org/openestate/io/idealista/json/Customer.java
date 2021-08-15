
package org.openestate.io.idealista.json;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
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

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd HH:mm:ss", timezone = "UTC")
    @JsonProperty("customerSendDate")
    private Date sendDate;
    /**
     * Customer country
     * <p>
     * 
     * Corresponds to the "customerCountry" property.
     * 
     */
    @JsonProperty("customerCountry")
    private Customer.Country country;
    @JsonProperty("customerCode")
    @Pattern(regexp = "^ilc([a-z]|[0-9]){40}$")
    private String code;
    @JsonProperty("customerName")
    @Pattern(regexp = "^.{0,100}$")
    private String name;
    @JsonProperty("customerReference")
    @Pattern(regexp = "^.{0,50}$")
    private String reference;
    /**
     * Contact Object
     * <p>
     * 
     * 
     */
    @JsonProperty("customerContact")
    @Valid
    private Contact contact;
    /**
     * Customer Secondhand Properties
     * <p>
     * 
     * Corresponds to the "customerProperties" property.
     * 
     */
    @JsonProperty("customerProperties")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @Valid
    private Set<Property> properties = null;
    /**
     * Customer NewDevelopment Properties
     * <p>
     * 
     * Corresponds to the "customerNewDevelopments" property.
     * 
     */
    @JsonProperty("customerNewDevelopments")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @Valid
    private Set<NewDevelopment> newDevelopments = null;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8316910889507090679L;

    @JsonProperty("customerSendDate")
    public Date getSendDate() {
        return sendDate;
    }

    @JsonProperty("customerSendDate")
    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public Customer withSendDate(Date sendDate) {
        this.sendDate = sendDate;
        return this;
    }

    /**
     * Customer country
     * <p>
     * 
     * Corresponds to the "customerCountry" property.
     * 
     */
    @JsonProperty("customerCountry")
    public Customer.Country getCountry() {
        return country;
    }

    /**
     * Customer country
     * <p>
     * 
     * Corresponds to the "customerCountry" property.
     * 
     */
    @JsonProperty("customerCountry")
    public void setCountry(Customer.Country country) {
        this.country = country;
    }

    public Customer withCountry(Customer.Country country) {
        this.country = country;
        return this;
    }

    @JsonProperty("customerCode")
    public String getCode() {
        return code;
    }

    @JsonProperty("customerCode")
    public void setCode(String code) {
        this.code = code;
    }

    public Customer withCode(String code) {
        this.code = code;
        return this;
    }

    @JsonProperty("customerName")
    public String getName() {
        return name;
    }

    @JsonProperty("customerName")
    public void setName(String name) {
        this.name = name;
    }

    public Customer withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("customerReference")
    public String getReference() {
        return reference;
    }

    @JsonProperty("customerReference")
    public void setReference(String reference) {
        this.reference = reference;
    }

    public Customer withReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Contact Object
     * <p>
     * 
     * 
     */
    @JsonProperty("customerContact")
    public Contact getContact() {
        return contact;
    }

    /**
     * Contact Object
     * <p>
     * 
     * 
     */
    @JsonProperty("customerContact")
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Customer withContact(Contact contact) {
        this.contact = contact;
        return this;
    }

    /**
     * Customer Secondhand Properties
     * <p>
     * 
     * Corresponds to the "customerProperties" property.
     * 
     */
    @JsonProperty("customerProperties")
    public Set<Property> getProperties() {
        return properties;
    }

    /**
     * Customer Secondhand Properties
     * <p>
     * 
     * Corresponds to the "customerProperties" property.
     * 
     */
    @JsonProperty("customerProperties")
    public void setProperties(Set<Property> properties) {
        this.properties = properties;
    }

    public Customer withProperties(Set<Property> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Customer NewDevelopment Properties
     * <p>
     * 
     * Corresponds to the "customerNewDevelopments" property.
     * 
     */
    @JsonProperty("customerNewDevelopments")
    public Set<NewDevelopment> getNewDevelopments() {
        return newDevelopments;
    }

    /**
     * Customer NewDevelopment Properties
     * <p>
     * 
     * Corresponds to the "customerNewDevelopments" property.
     * 
     */
    @JsonProperty("customerNewDevelopments")
    public void setNewDevelopments(Set<NewDevelopment> newDevelopments) {
        this.newDevelopments = newDevelopments;
    }

    public Customer withNewDevelopments(Set<NewDevelopment> newDevelopments) {
        this.newDevelopments = newDevelopments;
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

    public Customer withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Customer.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sendDate");
        sb.append('=');
        sb.append(((this.sendDate == null)?"<null>":this.sendDate));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("reference");
        sb.append('=');
        sb.append(((this.reference == null)?"<null>":this.reference));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
        sb.append(',');
        sb.append("properties");
        sb.append('=');
        sb.append(((this.properties == null)?"<null>":this.properties));
        sb.append(',');
        sb.append("newDevelopments");
        sb.append('=');
        sb.append(((this.newDevelopments == null)?"<null>":this.newDevelopments));
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
        result = ((result* 31)+((this.reference == null)? 0 :this.reference.hashCode()));
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.sendDate == null)? 0 :this.sendDate.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.newDevelopments == null)? 0 :this.newDevelopments.hashCode()));
        result = ((result* 31)+((this.properties == null)? 0 :this.properties.hashCode()));
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
        return ((((((((((this.reference == rhs.reference)||((this.reference!= null)&&this.reference.equals(rhs.reference)))&&((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.sendDate == rhs.sendDate)||((this.sendDate!= null)&&this.sendDate.equals(rhs.sendDate))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.newDevelopments == rhs.newDevelopments)||((this.newDevelopments!= null)&&this.newDevelopments.equals(rhs.newDevelopments))))&&((this.properties == rhs.properties)||((this.properties!= null)&&this.properties.equals(rhs.properties))));
    }


    /**
     * Customer country
     * <p>
     * 
     * 
     */
    public enum Country {

        SPAIN("Spain"),
        ITALY("Italy"),
        PORTUGAL("Portugal");
        private final String value;
        private final static Map<String, Customer.Country> CONSTANTS = new HashMap<String, Customer.Country>();

        static {
            for (Customer.Country c: values()) {
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
        public static Customer.Country fromValue(String value) {
            Customer.Country constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
