
package org.openestate.io.idealista.json;

import java.io.Serializable;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
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
public class Property implements Serializable
{

    /**
     * Address Object
     * <p>
     * the option of (addressPostalCode, addressCountry) is only available for Portugal. If you send only coordinates we will not publish with exact visibility, maximum with street only visibility
     * 
     */
    @JsonProperty("propertyAddress")
    @JsonPropertyDescription("the option of (addressPostalCode, addressCountry) is only available for Portugal. If you send only coordinates we will not publish with exact visibility, maximum with street only visibility")
    @Valid
    private Address address;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("propertyCode")
    @Pattern(regexp = "^.{0,50}$")
    @NotNull
    private String code;
    @JsonProperty("propertyReference")
    @Pattern(regexp = "^.{0,50}$")
    private String reference;
    /**
     * Contact Object
     * <p>
     * 
     * 
     */
    @JsonProperty("propertyContact")
    @Valid
    private Contact contact;
    /**
     * Property descriptions
     * <p>
     * 
     * Corresponds to the "propertyDescriptions" property.
     * 
     */
    @JsonProperty("propertyDescriptions")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @Size(min = 1)
    @Valid
    private Set<Description> descriptions = null;
    /**
     * Property type
     * <p>
     * 
     * Corresponds to the "propertyFeatures" property.
     * 
     */
    @JsonProperty("propertyFeatures")
    private AbstractFeatures features;
    /**
     * Property images
     * <p>
     * 
     * Corresponds to the "propertyImages" property.
     * 
     */
    @JsonProperty("propertyImages")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @Size(min = 1)
    @Valid
    private Set<Image> images = null;
    /**
     * Operation Object
     * <p>
     * 
     * 
     */
    @JsonProperty("propertyOperation")
    @Valid
    private Operation operation;
    @JsonProperty("propertyUrl")
    private URI url;
    /**
     * If the visibility is 'idealista', you can find the property using the idealista's search engine; 'microsite', the property is only published on the real estate agency microsite; 'private', the property is not published and only the customer can see it.
     * 
     */
    @JsonProperty("propertyVisibility")
    @JsonPropertyDescription("If the visibility is 'idealista', you can find the property using the idealista's search engine; 'microsite', the property is only published on the real estate agency microsite; 'private', the property is not published and only the customer can see it.")
    private PropertyVisibilityType visibility;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3965990345321591059L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Property() {
    }

    /**
     * 
     * @param code
     */
    public Property(String code) {
        super();
        this.code = code;
    }

    /**
     * Address Object
     * <p>
     * the option of (addressPostalCode, addressCountry) is only available for Portugal. If you send only coordinates we will not publish with exact visibility, maximum with street only visibility
     * 
     */
    @JsonProperty("propertyAddress")
    public Address getAddress() {
        return address;
    }

    /**
     * Address Object
     * <p>
     * the option of (addressPostalCode, addressCountry) is only available for Portugal. If you send only coordinates we will not publish with exact visibility, maximum with street only visibility
     * 
     */
    @JsonProperty("propertyAddress")
    public void setAddress(Address address) {
        this.address = address;
    }

    public Property withAddress(Address address) {
        this.address = address;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("propertyCode")
    public String getCode() {
        return code;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("propertyCode")
    public void setCode(String code) {
        this.code = code;
    }

    public Property withCode(String code) {
        this.code = code;
        return this;
    }

    @JsonProperty("propertyReference")
    public String getReference() {
        return reference;
    }

    @JsonProperty("propertyReference")
    public void setReference(String reference) {
        this.reference = reference;
    }

    public Property withReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Contact Object
     * <p>
     * 
     * 
     */
    @JsonProperty("propertyContact")
    public Contact getContact() {
        return contact;
    }

    /**
     * Contact Object
     * <p>
     * 
     * 
     */
    @JsonProperty("propertyContact")
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Property withContact(Contact contact) {
        this.contact = contact;
        return this;
    }

    /**
     * Property descriptions
     * <p>
     * 
     * Corresponds to the "propertyDescriptions" property.
     * 
     */
    @JsonProperty("propertyDescriptions")
    public Set<Description> getDescriptions() {
        return descriptions;
    }

    /**
     * Property descriptions
     * <p>
     * 
     * Corresponds to the "propertyDescriptions" property.
     * 
     */
    @JsonProperty("propertyDescriptions")
    public void setDescriptions(Set<Description> descriptions) {
        this.descriptions = descriptions;
    }

    public Property withDescriptions(Set<Description> descriptions) {
        this.descriptions = descriptions;
        return this;
    }

    /**
     * Property type
     * <p>
     * 
     * Corresponds to the "propertyFeatures" property.
     * 
     */
    @JsonProperty("propertyFeatures")
    public AbstractFeatures getFeatures() {
        return features;
    }

    /**
     * Property type
     * <p>
     * 
     * Corresponds to the "propertyFeatures" property.
     * 
     */
    @JsonProperty("propertyFeatures")
    public void setFeatures(AbstractFeatures features) {
        this.features = features;
    }

    public Property withFeatures(AbstractFeatures features) {
        this.features = features;
        return this;
    }

    /**
     * Property images
     * <p>
     * 
     * Corresponds to the "propertyImages" property.
     * 
     */
    @JsonProperty("propertyImages")
    public Set<Image> getImages() {
        return images;
    }

    /**
     * Property images
     * <p>
     * 
     * Corresponds to the "propertyImages" property.
     * 
     */
    @JsonProperty("propertyImages")
    public void setImages(Set<Image> images) {
        this.images = images;
    }

    public Property withImages(Set<Image> images) {
        this.images = images;
        return this;
    }

    /**
     * Operation Object
     * <p>
     * 
     * 
     */
    @JsonProperty("propertyOperation")
    public Operation getOperation() {
        return operation;
    }

    /**
     * Operation Object
     * <p>
     * 
     * 
     */
    @JsonProperty("propertyOperation")
    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public Property withOperation(Operation operation) {
        this.operation = operation;
        return this;
    }

    @JsonProperty("propertyUrl")
    public URI getUrl() {
        return url;
    }

    @JsonProperty("propertyUrl")
    public void setUrl(URI url) {
        this.url = url;
    }

    public Property withUrl(URI url) {
        this.url = url;
        return this;
    }

    /**
     * If the visibility is 'idealista', you can find the property using the idealista's search engine; 'microsite', the property is only published on the real estate agency microsite; 'private', the property is not published and only the customer can see it.
     * 
     */
    @JsonProperty("propertyVisibility")
    public PropertyVisibilityType getVisibility() {
        return visibility;
    }

    /**
     * If the visibility is 'idealista', you can find the property using the idealista's search engine; 'microsite', the property is only published on the real estate agency microsite; 'private', the property is not published and only the customer can see it.
     * 
     */
    @JsonProperty("propertyVisibility")
    public void setVisibility(PropertyVisibilityType visibility) {
        this.visibility = visibility;
    }

    public Property withVisibility(PropertyVisibilityType visibility) {
        this.visibility = visibility;
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

    public Property withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Property.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("reference");
        sb.append('=');
        sb.append(((this.reference == null)?"<null>":this.reference));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
        sb.append(',');
        sb.append("descriptions");
        sb.append('=');
        sb.append(((this.descriptions == null)?"<null>":this.descriptions));
        sb.append(',');
        sb.append("features");
        sb.append('=');
        sb.append(((this.features == null)?"<null>":this.features));
        sb.append(',');
        sb.append("images");
        sb.append('=');
        sb.append(((this.images == null)?"<null>":this.images));
        sb.append(',');
        sb.append("operation");
        sb.append('=');
        sb.append(((this.operation == null)?"<null>":this.operation));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("visibility");
        sb.append('=');
        sb.append(((this.visibility == null)?"<null>":this.visibility));
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
        result = ((result* 31)+((this.features == null)? 0 :this.features.hashCode()));
        result = ((result* 31)+((this.images == null)? 0 :this.images.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.visibility == null)? 0 :this.visibility.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.descriptions == null)? 0 :this.descriptions.hashCode()));
        result = ((result* 31)+((this.operation == null)? 0 :this.operation.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Property) == false) {
            return false;
        }
        Property rhs = ((Property) other);
        return ((((((((((((this.reference == rhs.reference)||((this.reference!= null)&&this.reference.equals(rhs.reference)))&&((this.features == rhs.features)||((this.features!= null)&&this.features.equals(rhs.features))))&&((this.images == rhs.images)||((this.images!= null)&&this.images.equals(rhs.images))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.visibility == rhs.visibility)||((this.visibility!= null)&&this.visibility.equals(rhs.visibility))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.descriptions == rhs.descriptions)||((this.descriptions!= null)&&this.descriptions.equals(rhs.descriptions))))&&((this.operation == rhs.operation)||((this.operation!= null)&&this.operation.equals(rhs.operation))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))));
    }

}
