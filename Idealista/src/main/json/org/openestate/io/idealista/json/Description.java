
package org.openestate.io.idealista.json;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Description Object
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "descriptionLanguage",
    "descriptionText"
})
public class Description implements Serializable
{

    /**
     * 
     * Corresponds to the "descriptionLanguage" property.
     * (Required)
     * 
     */
    @JsonProperty("descriptionLanguage")
    @NotNull
    @Nonnull
    private Description.Language language;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("descriptionText")
    @Pattern(regexp = "^.{0,4000}$")
    private String text;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3776003431808735225L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Description() {
    }

    /**
     * 
     * @param language
     */
    public Description(Description.Language language) {
        super();
        this.language = language;
    }

    /**
     * 
     * Corresponds to the "descriptionLanguage" property.
     * (Required)
     * 
     */
    @JsonProperty("descriptionLanguage")
    public Description.Language getLanguage() {
        return language;
    }

    /**
     * 
     * Corresponds to the "descriptionLanguage" property.
     * (Required)
     * 
     */
    @JsonProperty("descriptionLanguage")
    public void setLanguage(Description.Language language) {
        this.language = language;
    }

    public Description withLanguage(Description.Language language) {
        this.language = language;
        return this;
    }

    @JsonProperty("descriptionText")
    public String getDescriptionText() {
        return text;
    }

    @JsonProperty("descriptionText")
    public void setDescriptionText(String text) {
        this.text = text;
    }

    public Description withDescriptionText(String text) {
        this.text = text;
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

    public Description withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Description.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("language");
        sb.append('=');
        sb.append(((this.language == null)?"<null>":this.language));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
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
        result = ((result* 31)+((this.language == null)? 0 :this.language.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Description) == false) {
            return false;
        }
        Description rhs = ((Description) other);
        return ((((this.language == rhs.language)||((this.language!= null)&&this.language.equals(rhs.language)))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

    public enum Language {

        SPANISH("spanish"),
        ITALIAN("italian"),
        PORTUGUESE("portuguese"),
        ENGLISH("english"),
        GERMAN("german"),
        FRENCH("french"),
        RUSSIAN("russian"),
        CHINESE("chinese"),
        CATALAN("catalan"),
        FINNISH("finnish"),
        DUTCH("dutch"),
        POLISH("polish"),
        ROMANIAN("romanian"),
        SWEDISH("swedish"),
        DANISH("danish");
        private final String value;
        private final static Map<String, Description.Language> CONSTANTS = new HashMap<String, Description.Language>();

        static {
            for (Description.Language c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Language(String value) {
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
        public static Description.Language fromValue(String value) {
            Description.Language constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
