
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
public class Storage implements Serializable
{

    /**
     * property types
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("featuresType")
    @NotNull
    @Nonnull
    private Storage.FeaturesType featuresType;
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
    private Boolean featuresAccess24h;
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
    private BigInteger featuresAreaConstructed;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresAreaHeight")
    @DecimalMin("0")
    @DecimalMax("9")
    private BigDecimal featuresAreaHeight;
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
    private Boolean featuresLoadingDock;
    /**
     *  24 hr security service
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("featuresSecurity24h")
    private Boolean featuresSecurity24h;
    private final static long serialVersionUID = -1369286069885330285L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Storage() {
    }

    /**
     * 
     * @param featuresType
     * @param featuresAreaConstructed
     */
    public Storage(Storage.FeaturesType featuresType, BigInteger featuresAreaConstructed) {
        super();
        this.featuresType = featuresType;
        this.featuresAreaConstructed = featuresAreaConstructed;
    }

    /**
     * property types
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("featuresType")
    public Storage.FeaturesType getFeaturesType() {
        return featuresType;
    }

    /**
     * property types
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("featuresType")
    public void setFeaturesType(Storage.FeaturesType featuresType) {
        this.featuresType = featuresType;
    }

    /**
     *  24 hr access
     * <p>
     * availability of 24 hr access
     * 
     */
    @JsonProperty("featuresAccess24h")
    public Boolean getFeaturesAccess24h() {
        return featuresAccess24h;
    }

    /**
     *  24 hr access
     * <p>
     * availability of 24 hr access
     * 
     */
    @JsonProperty("featuresAccess24h")
    public void setFeaturesAccess24h(Boolean featuresAccess24h) {
        this.featuresAccess24h = featuresAccess24h;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("featuresAreaConstructed")
    public BigInteger getFeaturesAreaConstructed() {
        return featuresAreaConstructed;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("featuresAreaConstructed")
    public void setFeaturesAreaConstructed(BigInteger featuresAreaConstructed) {
        this.featuresAreaConstructed = featuresAreaConstructed;
    }

    @JsonProperty("featuresAreaHeight")
    public BigDecimal getFeaturesAreaHeight() {
        return featuresAreaHeight;
    }

    @JsonProperty("featuresAreaHeight")
    public void setFeaturesAreaHeight(BigDecimal featuresAreaHeight) {
        this.featuresAreaHeight = featuresAreaHeight;
    }

    /**
     * loading dock
     * <p>
     * loading dock availability
     * 
     */
    @JsonProperty("featuresLoadingDock")
    public Boolean getFeaturesLoadingDock() {
        return featuresLoadingDock;
    }

    /**
     * loading dock
     * <p>
     * loading dock availability
     * 
     */
    @JsonProperty("featuresLoadingDock")
    public void setFeaturesLoadingDock(Boolean featuresLoadingDock) {
        this.featuresLoadingDock = featuresLoadingDock;
    }

    /**
     *  24 hr security service
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSecurity24h")
    public Boolean getFeaturesSecurity24h() {
        return featuresSecurity24h;
    }

    /**
     *  24 hr security service
     * <p>
     * 
     * 
     */
    @JsonProperty("featuresSecurity24h")
    public void setFeaturesSecurity24h(Boolean featuresSecurity24h) {
        this.featuresSecurity24h = featuresSecurity24h;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Storage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("featuresType");
        sb.append('=');
        sb.append(((this.featuresType == null)?"<null>":this.featuresType));
        sb.append(',');
        sb.append("featuresAccess24h");
        sb.append('=');
        sb.append(((this.featuresAccess24h == null)?"<null>":this.featuresAccess24h));
        sb.append(',');
        sb.append("featuresAreaConstructed");
        sb.append('=');
        sb.append(((this.featuresAreaConstructed == null)?"<null>":this.featuresAreaConstructed));
        sb.append(',');
        sb.append("featuresAreaHeight");
        sb.append('=');
        sb.append(((this.featuresAreaHeight == null)?"<null>":this.featuresAreaHeight));
        sb.append(',');
        sb.append("featuresLoadingDock");
        sb.append('=');
        sb.append(((this.featuresLoadingDock == null)?"<null>":this.featuresLoadingDock));
        sb.append(',');
        sb.append("featuresSecurity24h");
        sb.append('=');
        sb.append(((this.featuresSecurity24h == null)?"<null>":this.featuresSecurity24h));
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
        result = ((result* 31)+((this.featuresAccess24h == null)? 0 :this.featuresAccess24h.hashCode()));
        result = ((result* 31)+((this.featuresLoadingDock == null)? 0 :this.featuresLoadingDock.hashCode()));
        result = ((result* 31)+((this.featuresSecurity24h == null)? 0 :this.featuresSecurity24h.hashCode()));
        result = ((result* 31)+((this.featuresType == null)? 0 :this.featuresType.hashCode()));
        result = ((result* 31)+((this.featuresAreaConstructed == null)? 0 :this.featuresAreaConstructed.hashCode()));
        result = ((result* 31)+((this.featuresAreaHeight == null)? 0 :this.featuresAreaHeight.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Storage) == false) {
            return false;
        }
        Storage rhs = ((Storage) other);
        return (((((((this.featuresAccess24h == rhs.featuresAccess24h)||((this.featuresAccess24h!= null)&&this.featuresAccess24h.equals(rhs.featuresAccess24h)))&&((this.featuresLoadingDock == rhs.featuresLoadingDock)||((this.featuresLoadingDock!= null)&&this.featuresLoadingDock.equals(rhs.featuresLoadingDock))))&&((this.featuresSecurity24h == rhs.featuresSecurity24h)||((this.featuresSecurity24h!= null)&&this.featuresSecurity24h.equals(rhs.featuresSecurity24h))))&&((this.featuresType == rhs.featuresType)||((this.featuresType!= null)&&this.featuresType.equals(rhs.featuresType))))&&((this.featuresAreaConstructed == rhs.featuresAreaConstructed)||((this.featuresAreaConstructed!= null)&&this.featuresAreaConstructed.equals(rhs.featuresAreaConstructed))))&&((this.featuresAreaHeight == rhs.featuresAreaHeight)||((this.featuresAreaHeight!= null)&&this.featuresAreaHeight.equals(rhs.featuresAreaHeight))));
    }

    public enum FeaturesType {

        STORAGE("storage");
        private final String value;
        private final static Map<String, Storage.FeaturesType> CONSTANTS = new HashMap<String, Storage.FeaturesType>();

        static {
            for (Storage.FeaturesType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private FeaturesType(String value) {
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
        public static Storage.FeaturesType fromValue(String value) {
            Storage.FeaturesType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
