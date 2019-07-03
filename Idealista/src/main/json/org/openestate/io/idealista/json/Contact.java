
package org.openestate.io.idealista.json;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Contact Object
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "contactName",
    "contactEmail",
    "contactPrimaryPhonePrefix",
    "contactPrimaryPhoneNumber",
    "contactSecondaryPhonePrefix",
    "contactSecondaryPhoneNumber"
})
public class Contact implements Serializable
{

    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("contactName")
    @Pattern(regexp = "^.{0,60}$")
    private String name;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("contactEmail")
    @Pattern(regexp = "^(([a-zA-Z0-9-_\\.])+)@((?:[a-zA-Z0-9-_]+\\.)+)([a-zA-Z]{2,5})$")
    private String email;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("contactPrimaryPhonePrefix")
    @Pattern(regexp = "^[1-9][0-9]{0,2}$")
    private String primaryPhonePrefix;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("contactPrimaryPhoneNumber")
    @Pattern(regexp = "^[0-9]{5,12}$")
    private String primaryPhoneNumber;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("contactSecondaryPhonePrefix")
    @Pattern(regexp = "^[1-9][0-9]{0,2}$")
    private String secondaryPhonePrefix;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("contactSecondaryPhoneNumber")
    @Pattern(regexp = "^[0-9]{5,12}$")
    private String secondaryPhoneNumber;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3433591450038418896L;

    @JsonProperty("contactName")
    public String getName() {
        return name;
    }

    @JsonProperty("contactName")
    public void setName(String name) {
        this.name = name;
    }

    public Contact withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("contactEmail")
    public String getEmail() {
        return email;
    }

    @JsonProperty("contactEmail")
    public void setEmail(String email) {
        this.email = email;
    }

    public Contact withEmail(String email) {
        this.email = email;
        return this;
    }

    @JsonProperty("contactPrimaryPhonePrefix")
    public String getPrimaryPhonePrefix() {
        return primaryPhonePrefix;
    }

    @JsonProperty("contactPrimaryPhonePrefix")
    public void setPrimaryPhonePrefix(String primaryPhonePrefix) {
        this.primaryPhonePrefix = primaryPhonePrefix;
    }

    public Contact withPrimaryPhonePrefix(String primaryPhonePrefix) {
        this.primaryPhonePrefix = primaryPhonePrefix;
        return this;
    }

    @JsonProperty("contactPrimaryPhoneNumber")
    public String getPrimaryPhoneNumber() {
        return primaryPhoneNumber;
    }

    @JsonProperty("contactPrimaryPhoneNumber")
    public void setPrimaryPhoneNumber(String primaryPhoneNumber) {
        this.primaryPhoneNumber = primaryPhoneNumber;
    }

    public Contact withPrimaryPhoneNumber(String primaryPhoneNumber) {
        this.primaryPhoneNumber = primaryPhoneNumber;
        return this;
    }

    @JsonProperty("contactSecondaryPhonePrefix")
    public String getSecondaryPhonePrefix() {
        return secondaryPhonePrefix;
    }

    @JsonProperty("contactSecondaryPhonePrefix")
    public void setSecondaryPhonePrefix(String secondaryPhonePrefix) {
        this.secondaryPhonePrefix = secondaryPhonePrefix;
    }

    public Contact withSecondaryPhonePrefix(String secondaryPhonePrefix) {
        this.secondaryPhonePrefix = secondaryPhonePrefix;
        return this;
    }

    @JsonProperty("contactSecondaryPhoneNumber")
    public String getSecondaryPhoneNumber() {
        return secondaryPhoneNumber;
    }

    @JsonProperty("contactSecondaryPhoneNumber")
    public void setSecondaryPhoneNumber(String secondaryPhoneNumber) {
        this.secondaryPhoneNumber = secondaryPhoneNumber;
    }

    public Contact withSecondaryPhoneNumber(String secondaryPhoneNumber) {
        this.secondaryPhoneNumber = secondaryPhoneNumber;
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

    public Contact withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Contact.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("primaryPhonePrefix");
        sb.append('=');
        sb.append(((this.primaryPhonePrefix == null)?"<null>":this.primaryPhonePrefix));
        sb.append(',');
        sb.append("primaryPhoneNumber");
        sb.append('=');
        sb.append(((this.primaryPhoneNumber == null)?"<null>":this.primaryPhoneNumber));
        sb.append(',');
        sb.append("secondaryPhonePrefix");
        sb.append('=');
        sb.append(((this.secondaryPhonePrefix == null)?"<null>":this.secondaryPhonePrefix));
        sb.append(',');
        sb.append("secondaryPhoneNumber");
        sb.append('=');
        sb.append(((this.secondaryPhoneNumber == null)?"<null>":this.secondaryPhoneNumber));
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
        result = ((result* 31)+((this.primaryPhonePrefix == null)? 0 :this.primaryPhonePrefix.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.secondaryPhonePrefix == null)? 0 :this.secondaryPhonePrefix.hashCode()));
        result = ((result* 31)+((this.primaryPhoneNumber == null)? 0 :this.primaryPhoneNumber.hashCode()));
        result = ((result* 31)+((this.secondaryPhoneNumber == null)? 0 :this.secondaryPhoneNumber.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Contact) == false) {
            return false;
        }
        Contact rhs = ((Contact) other);
        return ((((((((this.primaryPhonePrefix == rhs.primaryPhonePrefix)||((this.primaryPhonePrefix!= null)&&this.primaryPhonePrefix.equals(rhs.primaryPhonePrefix)))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.secondaryPhonePrefix == rhs.secondaryPhonePrefix)||((this.secondaryPhonePrefix!= null)&&this.secondaryPhonePrefix.equals(rhs.secondaryPhonePrefix))))&&((this.primaryPhoneNumber == rhs.primaryPhoneNumber)||((this.primaryPhoneNumber!= null)&&this.primaryPhoneNumber.equals(rhs.primaryPhoneNumber))))&&((this.secondaryPhoneNumber == rhs.secondaryPhoneNumber)||((this.secondaryPhoneNumber!= null)&&this.secondaryPhoneNumber.equals(rhs.secondaryPhoneNumber))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))));
    }

}
