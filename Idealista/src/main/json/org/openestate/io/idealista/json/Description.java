
package org.openestate.io.idealista.json;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonCreator;
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
     * (Required)
     * 
     */
    @JsonProperty("descriptionLanguage")
    @NotNull
    @Nonnull
    private Description.DescriptionLanguage descriptionLanguage;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("descriptionText")
    @Pattern(regexp = "^.{0,4000}$")
    private String descriptionText;
    private final static long serialVersionUID = 3419090462860047724L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Description() {
    }

    /**
     * 
     * @param descriptionLanguage
     */
    public Description(Description.DescriptionLanguage descriptionLanguage) {
        super();
        this.descriptionLanguage = descriptionLanguage;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("descriptionLanguage")
    public Description.DescriptionLanguage getDescriptionLanguage() {
        return descriptionLanguage;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("descriptionLanguage")
    public void setDescriptionLanguage(Description.DescriptionLanguage descriptionLanguage) {
        this.descriptionLanguage = descriptionLanguage;
    }

    @JsonProperty("descriptionText")
    public String getDescriptionText() {
        return descriptionText;
    }

    @JsonProperty("descriptionText")
    public void setDescriptionText(String descriptionText) {
        this.descriptionText = descriptionText;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Description.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("descriptionLanguage");
        sb.append('=');
        sb.append(((this.descriptionLanguage == null)?"<null>":this.descriptionLanguage));
        sb.append(',');
        sb.append("descriptionText");
        sb.append('=');
        sb.append(((this.descriptionText == null)?"<null>":this.descriptionText));
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
        result = ((result* 31)+((this.descriptionLanguage == null)? 0 :this.descriptionLanguage.hashCode()));
        result = ((result* 31)+((this.descriptionText == null)? 0 :this.descriptionText.hashCode()));
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
        return (((this.descriptionLanguage == rhs.descriptionLanguage)||((this.descriptionLanguage!= null)&&this.descriptionLanguage.equals(rhs.descriptionLanguage)))&&((this.descriptionText == rhs.descriptionText)||((this.descriptionText!= null)&&this.descriptionText.equals(rhs.descriptionText))));
    }

    public enum DescriptionLanguage {

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
        private final static Map<String, Description.DescriptionLanguage> CONSTANTS = new HashMap<String, Description.DescriptionLanguage>();

        static {
            for (Description.DescriptionLanguage c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private DescriptionLanguage(String value) {
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
        public static Description.DescriptionLanguage fromValue(String value) {
            Description.DescriptionLanguage constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
