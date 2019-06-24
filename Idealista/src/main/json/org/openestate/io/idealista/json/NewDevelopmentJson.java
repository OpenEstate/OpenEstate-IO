
package org.openestate.io.idealista.json;

import java.io.Serializable;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * New Development Object
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "propertyCode",
    "propertyReference",
    "propertyVisibility",
    "propertyAddress",
    "propertyFeatures",
    "propertyContact",
    "propertyDescriptions",
    "propertyImages",
    "newDevelopmentTypologies"
})
public class NewDevelopmentJson implements Serializable
{

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
     * If the visibility is 'idealista', you can find the property using the idealista's search engine; 'microsite', the property is only published on the real estate agency microsite; 'private', the property is not published and only the customer can see it.
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("propertyVisibility")
    @JsonPropertyDescription("If the visibility is 'idealista', you can find the property using the idealista's search engine; 'microsite', the property is only published on the real estate agency microsite; 'private', the property is not published and only the customer can see it.")
    private org.openestate.io.idealista.json.PropertyJson.EnumPropertyVisibility propertyVisibility;
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
     * Promo Object
     * <p>
     * 
     * 
     */
    @Nullable
    @JsonProperty("propertyFeatures")
    @Valid
    private PromoJson propertyFeatures;
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
     * New Development descriptions
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("propertyDescriptions")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @Valid
    private Set<Object> propertyDescriptions = null;
    /**
     * New Development images
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("propertyImages")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @Valid
    private Set<Object> propertyImages = null;
    /**
     * New Development typologies
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("newDevelopmentTypologies")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @Valid
    private Set<Object> newDevelopmentTypologies = null;
    private final static long serialVersionUID = -1457586483501492767L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public NewDevelopmentJson() {
    }

    /**
     * 
     * @param propertyCode
     */
    public NewDevelopmentJson(String propertyCode) {
        super();
        this.propertyCode = propertyCode;
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
     * If the visibility is 'idealista', you can find the property using the idealista's search engine; 'microsite', the property is only published on the real estate agency microsite; 'private', the property is not published and only the customer can see it.
     * 
     */
    @JsonProperty("propertyVisibility")
    public org.openestate.io.idealista.json.PropertyJson.EnumPropertyVisibility getPropertyVisibility() {
        return propertyVisibility;
    }

    /**
     * If the visibility is 'idealista', you can find the property using the idealista's search engine; 'microsite', the property is only published on the real estate agency microsite; 'private', the property is not published and only the customer can see it.
     * 
     */
    @JsonProperty("propertyVisibility")
    public void setPropertyVisibility(org.openestate.io.idealista.json.PropertyJson.EnumPropertyVisibility propertyVisibility) {
        this.propertyVisibility = propertyVisibility;
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
     * Promo Object
     * <p>
     * 
     * 
     */
    @JsonProperty("propertyFeatures")
    public PromoJson getPropertyFeatures() {
        return propertyFeatures;
    }

    /**
     * Promo Object
     * <p>
     * 
     * 
     */
    @JsonProperty("propertyFeatures")
    public void setPropertyFeatures(PromoJson propertyFeatures) {
        this.propertyFeatures = propertyFeatures;
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
     * New Development descriptions
     * <p>
     * 
     * 
     */
    @JsonProperty("propertyDescriptions")
    public Set<Object> getPropertyDescriptions() {
        return propertyDescriptions;
    }

    /**
     * New Development descriptions
     * <p>
     * 
     * 
     */
    @JsonProperty("propertyDescriptions")
    public void setPropertyDescriptions(Set<Object> propertyDescriptions) {
        this.propertyDescriptions = propertyDescriptions;
    }

    /**
     * New Development images
     * <p>
     * 
     * 
     */
    @JsonProperty("propertyImages")
    public Set<Object> getPropertyImages() {
        return propertyImages;
    }

    /**
     * New Development images
     * <p>
     * 
     * 
     */
    @JsonProperty("propertyImages")
    public void setPropertyImages(Set<Object> propertyImages) {
        this.propertyImages = propertyImages;
    }

    /**
     * New Development typologies
     * <p>
     * 
     * 
     */
    @JsonProperty("newDevelopmentTypologies")
    public Set<Object> getNewDevelopmentTypologies() {
        return newDevelopmentTypologies;
    }

    /**
     * New Development typologies
     * <p>
     * 
     * 
     */
    @JsonProperty("newDevelopmentTypologies")
    public void setNewDevelopmentTypologies(Set<Object> newDevelopmentTypologies) {
        this.newDevelopmentTypologies = newDevelopmentTypologies;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NewDevelopmentJson.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("propertyCode");
        sb.append('=');
        sb.append(((this.propertyCode == null)?"<null>":this.propertyCode));
        sb.append(',');
        sb.append("propertyReference");
        sb.append('=');
        sb.append(((this.propertyReference == null)?"<null>":this.propertyReference));
        sb.append(',');
        sb.append("propertyVisibility");
        sb.append('=');
        sb.append(((this.propertyVisibility == null)?"<null>":this.propertyVisibility));
        sb.append(',');
        sb.append("propertyAddress");
        sb.append('=');
        sb.append(((this.propertyAddress == null)?"<null>":this.propertyAddress));
        sb.append(',');
        sb.append("propertyFeatures");
        sb.append('=');
        sb.append(((this.propertyFeatures == null)?"<null>":this.propertyFeatures));
        sb.append(',');
        sb.append("propertyContact");
        sb.append('=');
        sb.append(((this.propertyContact == null)?"<null>":this.propertyContact));
        sb.append(',');
        sb.append("propertyDescriptions");
        sb.append('=');
        sb.append(((this.propertyDescriptions == null)?"<null>":this.propertyDescriptions));
        sb.append(',');
        sb.append("propertyImages");
        sb.append('=');
        sb.append(((this.propertyImages == null)?"<null>":this.propertyImages));
        sb.append(',');
        sb.append("newDevelopmentTypologies");
        sb.append('=');
        sb.append(((this.newDevelopmentTypologies == null)?"<null>":this.newDevelopmentTypologies));
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
        result = ((result* 31)+((this.propertyContact == null)? 0 :this.propertyContact.hashCode()));
        result = ((result* 31)+((this.propertyCode == null)? 0 :this.propertyCode.hashCode()));
        result = ((result* 31)+((this.propertyReference == null)? 0 :this.propertyReference.hashCode()));
        result = ((result* 31)+((this.propertyAddress == null)? 0 :this.propertyAddress.hashCode()));
        result = ((result* 31)+((this.newDevelopmentTypologies == null)? 0 :this.newDevelopmentTypologies.hashCode()));
        result = ((result* 31)+((this.propertyVisibility == null)? 0 :this.propertyVisibility.hashCode()));
        result = ((result* 31)+((this.propertyDescriptions == null)? 0 :this.propertyDescriptions.hashCode()));
        result = ((result* 31)+((this.propertyFeatures == null)? 0 :this.propertyFeatures.hashCode()));
        result = ((result* 31)+((this.propertyImages == null)? 0 :this.propertyImages.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NewDevelopmentJson) == false) {
            return false;
        }
        NewDevelopmentJson rhs = ((NewDevelopmentJson) other);
        return ((((((((((this.propertyContact == rhs.propertyContact)||((this.propertyContact!= null)&&this.propertyContact.equals(rhs.propertyContact)))&&((this.propertyCode == rhs.propertyCode)||((this.propertyCode!= null)&&this.propertyCode.equals(rhs.propertyCode))))&&((this.propertyReference == rhs.propertyReference)||((this.propertyReference!= null)&&this.propertyReference.equals(rhs.propertyReference))))&&((this.propertyAddress == rhs.propertyAddress)||((this.propertyAddress!= null)&&this.propertyAddress.equals(rhs.propertyAddress))))&&((this.newDevelopmentTypologies == rhs.newDevelopmentTypologies)||((this.newDevelopmentTypologies!= null)&&this.newDevelopmentTypologies.equals(rhs.newDevelopmentTypologies))))&&((this.propertyVisibility == rhs.propertyVisibility)||((this.propertyVisibility!= null)&&this.propertyVisibility.equals(rhs.propertyVisibility))))&&((this.propertyDescriptions == rhs.propertyDescriptions)||((this.propertyDescriptions!= null)&&this.propertyDescriptions.equals(rhs.propertyDescriptions))))&&((this.propertyFeatures == rhs.propertyFeatures)||((this.propertyFeatures!= null)&&this.propertyFeatures.equals(rhs.propertyFeatures))))&&((this.propertyImages == rhs.propertyImages)||((this.propertyImages!= null)&&this.propertyImages.equals(rhs.propertyImages))));
    }

}
