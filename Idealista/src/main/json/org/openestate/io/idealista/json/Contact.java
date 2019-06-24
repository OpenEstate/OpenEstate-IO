
package org.openestate.io.idealista.json;

import java.io.Serializable;
import javax.annotation.Nullable;
import javax.validation.constraints.Pattern;
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
    private String contactName;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("contactEmail")
    @Pattern(regexp = "^(([a-zA-Z0-9-_\\.])+)@((?:[a-zA-Z0-9-_]+\\.)+)([a-zA-Z]{2,5})$")
    private String contactEmail;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("contactPrimaryPhonePrefix")
    @Pattern(regexp = "^[1-9][0-9]{0,2}$")
    private String contactPrimaryPhonePrefix;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("contactPrimaryPhoneNumber")
    @Pattern(regexp = "^[0-9]{5,12}$")
    private String contactPrimaryPhoneNumber;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("contactSecondaryPhonePrefix")
    @Pattern(regexp = "^[1-9][0-9]{0,2}$")
    private String contactSecondaryPhonePrefix;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("contactSecondaryPhoneNumber")
    @Pattern(regexp = "^[0-9]{5,12}$")
    private String contactSecondaryPhoneNumber;
    private final static long serialVersionUID = 8089758367839855648L;

    @JsonProperty("contactName")
    public String getContactName() {
        return contactName;
    }

    @JsonProperty("contactName")
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    @JsonProperty("contactEmail")
    public String getContactEmail() {
        return contactEmail;
    }

    @JsonProperty("contactEmail")
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    @JsonProperty("contactPrimaryPhonePrefix")
    public String getContactPrimaryPhonePrefix() {
        return contactPrimaryPhonePrefix;
    }

    @JsonProperty("contactPrimaryPhonePrefix")
    public void setContactPrimaryPhonePrefix(String contactPrimaryPhonePrefix) {
        this.contactPrimaryPhonePrefix = contactPrimaryPhonePrefix;
    }

    @JsonProperty("contactPrimaryPhoneNumber")
    public String getContactPrimaryPhoneNumber() {
        return contactPrimaryPhoneNumber;
    }

    @JsonProperty("contactPrimaryPhoneNumber")
    public void setContactPrimaryPhoneNumber(String contactPrimaryPhoneNumber) {
        this.contactPrimaryPhoneNumber = contactPrimaryPhoneNumber;
    }

    @JsonProperty("contactSecondaryPhonePrefix")
    public String getContactSecondaryPhonePrefix() {
        return contactSecondaryPhonePrefix;
    }

    @JsonProperty("contactSecondaryPhonePrefix")
    public void setContactSecondaryPhonePrefix(String contactSecondaryPhonePrefix) {
        this.contactSecondaryPhonePrefix = contactSecondaryPhonePrefix;
    }

    @JsonProperty("contactSecondaryPhoneNumber")
    public String getContactSecondaryPhoneNumber() {
        return contactSecondaryPhoneNumber;
    }

    @JsonProperty("contactSecondaryPhoneNumber")
    public void setContactSecondaryPhoneNumber(String contactSecondaryPhoneNumber) {
        this.contactSecondaryPhoneNumber = contactSecondaryPhoneNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Contact.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("contactName");
        sb.append('=');
        sb.append(((this.contactName == null)?"<null>":this.contactName));
        sb.append(',');
        sb.append("contactEmail");
        sb.append('=');
        sb.append(((this.contactEmail == null)?"<null>":this.contactEmail));
        sb.append(',');
        sb.append("contactPrimaryPhonePrefix");
        sb.append('=');
        sb.append(((this.contactPrimaryPhonePrefix == null)?"<null>":this.contactPrimaryPhonePrefix));
        sb.append(',');
        sb.append("contactPrimaryPhoneNumber");
        sb.append('=');
        sb.append(((this.contactPrimaryPhoneNumber == null)?"<null>":this.contactPrimaryPhoneNumber));
        sb.append(',');
        sb.append("contactSecondaryPhonePrefix");
        sb.append('=');
        sb.append(((this.contactSecondaryPhonePrefix == null)?"<null>":this.contactSecondaryPhonePrefix));
        sb.append(',');
        sb.append("contactSecondaryPhoneNumber");
        sb.append('=');
        sb.append(((this.contactSecondaryPhoneNumber == null)?"<null>":this.contactSecondaryPhoneNumber));
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
        result = ((result* 31)+((this.contactPrimaryPhoneNumber == null)? 0 :this.contactPrimaryPhoneNumber.hashCode()));
        result = ((result* 31)+((this.contactEmail == null)? 0 :this.contactEmail.hashCode()));
        result = ((result* 31)+((this.contactName == null)? 0 :this.contactName.hashCode()));
        result = ((result* 31)+((this.contactSecondaryPhonePrefix == null)? 0 :this.contactSecondaryPhonePrefix.hashCode()));
        result = ((result* 31)+((this.contactSecondaryPhoneNumber == null)? 0 :this.contactSecondaryPhoneNumber.hashCode()));
        result = ((result* 31)+((this.contactPrimaryPhonePrefix == null)? 0 :this.contactPrimaryPhonePrefix.hashCode()));
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
        return (((((((this.contactPrimaryPhoneNumber == rhs.contactPrimaryPhoneNumber)||((this.contactPrimaryPhoneNumber!= null)&&this.contactPrimaryPhoneNumber.equals(rhs.contactPrimaryPhoneNumber)))&&((this.contactEmail == rhs.contactEmail)||((this.contactEmail!= null)&&this.contactEmail.equals(rhs.contactEmail))))&&((this.contactName == rhs.contactName)||((this.contactName!= null)&&this.contactName.equals(rhs.contactName))))&&((this.contactSecondaryPhonePrefix == rhs.contactSecondaryPhonePrefix)||((this.contactSecondaryPhonePrefix!= null)&&this.contactSecondaryPhonePrefix.equals(rhs.contactSecondaryPhonePrefix))))&&((this.contactSecondaryPhoneNumber == rhs.contactSecondaryPhoneNumber)||((this.contactSecondaryPhoneNumber!= null)&&this.contactSecondaryPhoneNumber.equals(rhs.contactSecondaryPhoneNumber))))&&((this.contactPrimaryPhonePrefix == rhs.contactPrimaryPhonePrefix)||((this.contactPrimaryPhonePrefix!= null)&&this.contactPrimaryPhonePrefix.equals(rhs.contactPrimaryPhonePrefix))));
    }

}
