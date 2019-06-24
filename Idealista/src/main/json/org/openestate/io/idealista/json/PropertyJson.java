
package org.openestate.io.idealista.json;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Property Object
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "propertyAddress",
    "propertyCode",
    "propertyReference",
    "propertyContact",
    "propertyDescriptions",
    "propertyFeatures",
    "propertyImages",
    "propertyOperation",
    "propertyUrl",
    "propertyVisibility"
})
public class PropertyJson implements Serializable
{

    /**
     * Address Object
     * <p>
     * the option of (addressPostalCode, addressCountry) is only available for Portugal. If you send only coordinates we will not publish with exact visibility, maximum with street only visibility
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("propertyAddress")
    @JsonPropertyDescription("the option of (addressPostalCode, addressCountry) is only available for Portugal. If you send only coordinates we will not publish with exact visibility, maximum with street only visibility")
    @Valid
    private Address propertyAddress;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("propertyCode")
    @Pattern(regexp = "^.{0,50}$")
    @NotNull
    @Nonnull
    private String propertyCode;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("propertyReference")
    @Pattern(regexp = "^.{0,50}$")
    private String propertyReference;
    /**
     * Contact Object
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("propertyContact")
    @Valid
    private Contact propertyContact;
    /**
     * Property descriptions
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("propertyDescriptions")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @Size(min = 1)
    @Valid
    private Set<Object> propertyDescriptions = null;
    /**
     * Property type
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("propertyFeatures")
    private Object propertyFeatures;
    /**
     * Property images
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("propertyImages")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @Size(min = 1)
    @Valid
    private Set<Object> propertyImages = null;
    /**
     * Operation Object
     * <p>
     * 
     * 
     */
    @Nullable
    @JsonProperty("propertyOperation")
    @Valid
    private OperationJson propertyOperation;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("propertyUrl")
    @Pattern(regexp = "^(http)(s?)://.*$")
    private String propertyUrl;
    /**
     * If the visibility is 'idealista', you can find the property using the idealista's search engine; 'microsite', the property is only published on the real estate agency microsite; 'private', the property is not published and only the customer can see it.
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("propertyVisibility")
    @JsonPropertyDescription("If the visibility is 'idealista', you can find the property using the idealista's search engine; 'microsite', the property is only published on the real estate agency microsite; 'private', the property is not published and only the customer can see it.")
    private PropertyJson.EnumPropertyVisibility propertyVisibility;
    private final static long serialVersionUID = 3697051010846714735L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PropertyJson() {
    }

    /**
     * 
     * @param propertyCode
     */
    public PropertyJson(String propertyCode) {
        super();
        this.propertyCode = propertyCode;
    }

    /**
     * Address Object
     * <p>
     * the option of (addressPostalCode, addressCountry) is only available for Portugal. If you send only coordinates we will not publish with exact visibility, maximum with street only visibility
     * 
     */
    @JsonProperty("propertyAddress")
    public Address getPropertyAddress() {
        return propertyAddress;
    }

    /**
     * Address Object
     * <p>
     * the option of (addressPostalCode, addressCountry) is only available for Portugal. If you send only coordinates we will not publish with exact visibility, maximum with street only visibility
     * 
     */
    @JsonProperty("propertyAddress")
    public void setPropertyAddress(Address propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("propertyCode")
    public String getPropertyCode() {
        return propertyCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("propertyCode")
    public void setPropertyCode(String propertyCode) {
        this.propertyCode = propertyCode;
    }

    @JsonProperty("propertyReference")
    public String getPropertyReference() {
        return propertyReference;
    }

    @JsonProperty("propertyReference")
    public void setPropertyReference(String propertyReference) {
        this.propertyReference = propertyReference;
    }

    /**
     * Contact Object
     * <p>
     * 
     * 
     */
    @JsonProperty("propertyContact")
    public Contact getPropertyContact() {
        return propertyContact;
    }

    /**
     * Contact Object
     * <p>
     * 
     * 
     */
    @JsonProperty("propertyContact")
    public void setPropertyContact(Contact propertyContact) {
        this.propertyContact = propertyContact;
    }

    /**
     * Property descriptions
     * <p>
     * 
     * 
     */
    @JsonProperty("propertyDescriptions")
    public Set<Object> getPropertyDescriptions() {
        return propertyDescriptions;
    }

    /**
     * Property descriptions
     * <p>
     * 
     * 
     */
    @JsonProperty("propertyDescriptions")
    public void setPropertyDescriptions(Set<Object> propertyDescriptions) {
        this.propertyDescriptions = propertyDescriptions;
    }

    /**
     * Property type
     * <p>
     * 
     * 
     */
    @JsonProperty("propertyFeatures")
    public Object getPropertyFeatures() {
        return propertyFeatures;
    }

    /**
     * Property type
     * <p>
     * 
     * 
     */
    @JsonProperty("propertyFeatures")
    public void setPropertyFeatures(Object propertyFeatures) {
        this.propertyFeatures = propertyFeatures;
    }

    /**
     * Property images
     * <p>
     * 
     * 
     */
    @JsonProperty("propertyImages")
    public Set<Object> getPropertyImages() {
        return propertyImages;
    }

    /**
     * Property images
     * <p>
     * 
     * 
     */
    @JsonProperty("propertyImages")
    public void setPropertyImages(Set<Object> propertyImages) {
        this.propertyImages = propertyImages;
    }

    /**
     * Operation Object
     * <p>
     * 
     * 
     */
    @JsonProperty("propertyOperation")
    public OperationJson getPropertyOperation() {
        return propertyOperation;
    }

    /**
     * Operation Object
     * <p>
     * 
     * 
     */
    @JsonProperty("propertyOperation")
    public void setPropertyOperation(OperationJson propertyOperation) {
        this.propertyOperation = propertyOperation;
    }

    @JsonProperty("propertyUrl")
    public String getPropertyUrl() {
        return propertyUrl;
    }

    @JsonProperty("propertyUrl")
    public void setPropertyUrl(String propertyUrl) {
        this.propertyUrl = propertyUrl;
    }

    /**
     * If the visibility is 'idealista', you can find the property using the idealista's search engine; 'microsite', the property is only published on the real estate agency microsite; 'private', the property is not published and only the customer can see it.
     * 
     */
    @JsonProperty("propertyVisibility")
    public PropertyJson.EnumPropertyVisibility getPropertyVisibility() {
        return propertyVisibility;
    }

    /**
     * If the visibility is 'idealista', you can find the property using the idealista's search engine; 'microsite', the property is only published on the real estate agency microsite; 'private', the property is not published and only the customer can see it.
     * 
     */
    @JsonProperty("propertyVisibility")
    public void setPropertyVisibility(PropertyJson.EnumPropertyVisibility propertyVisibility) {
        this.propertyVisibility = propertyVisibility;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PropertyJson.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("propertyAddress");
        sb.append('=');
        sb.append(((this.propertyAddress == null)?"<null>":this.propertyAddress));
        sb.append(',');
        sb.append("propertyCode");
        sb.append('=');
        sb.append(((this.propertyCode == null)?"<null>":this.propertyCode));
        sb.append(',');
        sb.append("propertyReference");
        sb.append('=');
        sb.append(((this.propertyReference == null)?"<null>":this.propertyReference));
        sb.append(',');
        sb.append("propertyContact");
        sb.append('=');
        sb.append(((this.propertyContact == null)?"<null>":this.propertyContact));
        sb.append(',');
        sb.append("propertyDescriptions");
        sb.append('=');
        sb.append(((this.propertyDescriptions == null)?"<null>":this.propertyDescriptions));
        sb.append(',');
        sb.append("propertyFeatures");
        sb.append('=');
        sb.append(((this.propertyFeatures == null)?"<null>":this.propertyFeatures));
        sb.append(',');
        sb.append("propertyImages");
        sb.append('=');
        sb.append(((this.propertyImages == null)?"<null>":this.propertyImages));
        sb.append(',');
        sb.append("propertyOperation");
        sb.append('=');
        sb.append(((this.propertyOperation == null)?"<null>":this.propertyOperation));
        sb.append(',');
        sb.append("propertyUrl");
        sb.append('=');
        sb.append(((this.propertyUrl == null)?"<null>":this.propertyUrl));
        sb.append(',');
        sb.append("propertyVisibility");
        sb.append('=');
        sb.append(((this.propertyVisibility == null)?"<null>":this.propertyVisibility));
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
        result = ((result* 31)+((this.propertyOperation == null)? 0 :this.propertyOperation.hashCode()));
        result = ((result* 31)+((this.propertyUrl == null)? 0 :this.propertyUrl.hashCode()));
        result = ((result* 31)+((this.propertyContact == null)? 0 :this.propertyContact.hashCode()));
        result = ((result* 31)+((this.propertyCode == null)? 0 :this.propertyCode.hashCode()));
        result = ((result* 31)+((this.propertyAddress == null)? 0 :this.propertyAddress.hashCode()));
        result = ((result* 31)+((this.propertyReference == null)? 0 :this.propertyReference.hashCode()));
        result = ((result* 31)+((this.propertyDescriptions == null)? 0 :this.propertyDescriptions.hashCode()));
        result = ((result* 31)+((this.propertyVisibility == null)? 0 :this.propertyVisibility.hashCode()));
        result = ((result* 31)+((this.propertyFeatures == null)? 0 :this.propertyFeatures.hashCode()));
        result = ((result* 31)+((this.propertyImages == null)? 0 :this.propertyImages.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PropertyJson) == false) {
            return false;
        }
        PropertyJson rhs = ((PropertyJson) other);
        return (((((((((((this.propertyOperation == rhs.propertyOperation)||((this.propertyOperation!= null)&&this.propertyOperation.equals(rhs.propertyOperation)))&&((this.propertyUrl == rhs.propertyUrl)||((this.propertyUrl!= null)&&this.propertyUrl.equals(rhs.propertyUrl))))&&((this.propertyContact == rhs.propertyContact)||((this.propertyContact!= null)&&this.propertyContact.equals(rhs.propertyContact))))&&((this.propertyCode == rhs.propertyCode)||((this.propertyCode!= null)&&this.propertyCode.equals(rhs.propertyCode))))&&((this.propertyAddress == rhs.propertyAddress)||((this.propertyAddress!= null)&&this.propertyAddress.equals(rhs.propertyAddress))))&&((this.propertyReference == rhs.propertyReference)||((this.propertyReference!= null)&&this.propertyReference.equals(rhs.propertyReference))))&&((this.propertyDescriptions == rhs.propertyDescriptions)||((this.propertyDescriptions!= null)&&this.propertyDescriptions.equals(rhs.propertyDescriptions))))&&((this.propertyVisibility == rhs.propertyVisibility)||((this.propertyVisibility!= null)&&this.propertyVisibility.equals(rhs.propertyVisibility))))&&((this.propertyFeatures == rhs.propertyFeatures)||((this.propertyFeatures!= null)&&this.propertyFeatures.equals(rhs.propertyFeatures))))&&((this.propertyImages == rhs.propertyImages)||((this.propertyImages!= null)&&this.propertyImages.equals(rhs.propertyImages))));
    }

    public enum EnumPropertyVisibility {

        IDEALISTA("idealista"),
        MICROSITE("microsite"),
        PRIVATE("private");
        private final String value;
        private final static Map<String, PropertyJson.EnumPropertyVisibility> CONSTANTS = new HashMap<String, PropertyJson.EnumPropertyVisibility>();

        static {
            for (PropertyJson.EnumPropertyVisibility c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private EnumPropertyVisibility(String value) {
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
        public static PropertyJson.EnumPropertyVisibility fromValue(String value) {
            PropertyJson.EnumPropertyVisibility constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
