
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
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Storage Room Object
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "featuresType",
    "featuresAccess24h",
    "featuresAreaConstructed",
    "featuresAreaHeight",
    "featuresLoadingDock",
    "featuresSecurity24h"
})
public class StorageFeatures
    extends AbstractFeatures
    implements Serializable
{

    /**
     * property types
     * <p>
     * 
     * Corresponds to the "featuresType" property.
     * (Required)
     * 
     */
    @JsonProperty("featuresType")
    @NotNull
    @Nonnull
    private StorageFeatures.Type type;
    /**
     *  24 hr access
     * <p>
     * availability of 24 hr access
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresAccess24h")
    @JsonPropertyDescription("availability of 24 hr access")
    private Boolean access24h;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("featuresAreaConstructed")
    @DecimalMin("1")
    @DecimalMax("99999")
    @NotNull
    @Nonnull
    private BigInteger areaConstructed;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresAreaHeight")
    @DecimalMin("0")
    @DecimalMax("9")
    private BigDecimal areaHeight;
    /**
     * loading dock
     * <p>
     * loading dock availability
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresLoadingDock")
    @JsonPropertyDescription("loading dock availability")
    private Boolean loadingDock;
    /**
     *  24 hr security service
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresSecurity24h")
    private Boolean security24h;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8142964024066145366L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public StorageFeatures() {
    }

    /**
     * 
     * @param type
     * @param areaConstructed
     */
    public StorageFeatures(StorageFeatures.Type type, BigInteger areaConstructed) {
        super();
        this.type = type;
        this.areaConstructed = areaConstructed;
    }

    /**
     * property types
     * <p>
     * 
     * Corresponds to the "featuresType" property.
     * (Required)
     * 
     */
    @JsonProperty("featuresType")
    public StorageFeatures.Type getType() {
        return type;
    }

    /**
     * property types
     * <p>
     * 
     * Corresponds to the "featuresType" property.
     * (Required)
     * 
     */
    @JsonProperty("featuresType")
    public void setType(StorageFeatures.Type type) {
        this.type = type;
    }

    public StorageFeatures withType(StorageFeatures.Type type) {
        this.type = type;
        return this;
    }

    /**
     *  24 hr access
     * <p>
     * availability of 24 hr access
     * 
     */
    @JsonProperty("featuresAccess24h")
    public Boolean getFeaturesAccess24h() {
        return access24h;
    }

    /**
     *  24 hr access
     * <p>
     * availability of 24 hr access
     * 
     */
    @JsonProperty("featuresAccess24h")
    public void setFeaturesAccess24h(Boolean access24h) {
        this.access24h = access24h;
    }

    public StorageFeatures withFeaturesAccess24h(Boolean access24h) {
        this.access24h = access24h;
        return this;
    }

    @JsonProperty("featuresAreaConstructed")
    public BigInteger getFeaturesAreaConstructed() {
        return areaConstructed;
    }

    @JsonProperty("featuresAreaConstructed")
    public void setFeaturesAreaConstructed(BigInteger areaConstructed) {
        this.areaConstructed = areaConstructed;
    }

    public StorageFeatures withFeaturesAreaConstructed(BigInteger areaConstructed) {
        this.areaConstructed = areaConstructed;
        return this;
    }

    @JsonProperty("featuresAreaHeight")
    public BigDecimal getFeaturesAreaHeight() {
        return areaHeight;
    }

    @JsonProperty("featuresAreaHeight")
    public void setFeaturesAreaHeight(BigDecimal areaHeight) {
        this.areaHeight = areaHeight;
    }

    public StorageFeatures withFeaturesAreaHeight(BigDecimal areaHeight) {
        this.areaHeight = areaHeight;
        return this;
    }

    /**
     * loading dock
     * <p>
     * loading dock availability
     * 
     */
    @JsonProperty("featuresLoadingDock")
    public Boolean getFeaturesLoadingDock() {
        return loadingDock;
    }

    /**
     * loading dock
     * <p>
     * loading dock availability
     * 
     */
    @JsonProperty("featuresLoadingDock")
    public void setFeaturesLoadingDock(Boolean loadingDock) {
        this.loadingDock = loadingDock;
    }

    public StorageFeatures withFeaturesLoadingDock(Boolean loadingDock) {
        this.loadingDock = loadingDock;
        return this;
    }

    /**
     *  24 hr security service
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSecurity24h")
    public Boolean getFeaturesSecurity24h() {
        return security24h;
    }

    /**
     *  24 hr security service
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSecurity24h")
    public void setFeaturesSecurity24h(Boolean security24h) {
        this.security24h = security24h;
    }

    public StorageFeatures withFeaturesSecurity24h(Boolean security24h) {
        this.security24h = security24h;
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

    public StorageFeatures withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StorageFeatures.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        int baseLength = sb.length();
        String superString = super.toString();
        if (superString!= null) {
            int contentStart = superString.indexOf('[');
            int contentEnd = superString.lastIndexOf(']');
            if ((contentStart >= 0)&&(contentEnd >contentStart)) {
                sb.append(superString, (contentStart + 1), contentEnd);
            } else {
                sb.append(superString);
            }
        }
        if (sb.length()>baseLength) {
            sb.append(',');
        }
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("access24h");
        sb.append('=');
        sb.append(((this.access24h == null)?"<null>":this.access24h));
        sb.append(',');
        sb.append("areaConstructed");
        sb.append('=');
        sb.append(((this.areaConstructed == null)?"<null>":this.areaConstructed));
        sb.append(',');
        sb.append("areaHeight");
        sb.append('=');
        sb.append(((this.areaHeight == null)?"<null>":this.areaHeight));
        sb.append(',');
        sb.append("loadingDock");
        sb.append('=');
        sb.append(((this.loadingDock == null)?"<null>":this.loadingDock));
        sb.append(',');
        sb.append("security24h");
        sb.append('=');
        sb.append(((this.security24h == null)?"<null>":this.security24h));
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
        result = ((result* 31)+((this.security24h == null)? 0 :this.security24h.hashCode()));
        result = ((result* 31)+((this.areaHeight == null)? 0 :this.areaHeight.hashCode()));
        result = ((result* 31)+((this.loadingDock == null)? 0 :this.loadingDock.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.access24h == null)? 0 :this.access24h.hashCode()));
        result = ((result* 31)+((this.areaConstructed == null)? 0 :this.areaConstructed.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StorageFeatures) == false) {
            return false;
        }
        StorageFeatures rhs = ((StorageFeatures) other);
        return (((((((super.equals(rhs)&&((this.security24h == rhs.security24h)||((this.security24h!= null)&&this.security24h.equals(rhs.security24h))))&&((this.areaHeight == rhs.areaHeight)||((this.areaHeight!= null)&&this.areaHeight.equals(rhs.areaHeight))))&&((this.loadingDock == rhs.loadingDock)||((this.loadingDock!= null)&&this.loadingDock.equals(rhs.loadingDock))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.access24h == rhs.access24h)||((this.access24h!= null)&&this.access24h.equals(rhs.access24h))))&&((this.areaConstructed == rhs.areaConstructed)||((this.areaConstructed!= null)&&this.areaConstructed.equals(rhs.areaConstructed))));
    }

    public enum Type {

        STORAGE("storage");
        private final String value;
        private final static Map<String, StorageFeatures.Type> CONSTANTS = new HashMap<String, StorageFeatures.Type>();

        static {
            for (StorageFeatures.Type c: values()) {
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
        public static StorageFeatures.Type fromValue(String value) {
            StorageFeatures.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
