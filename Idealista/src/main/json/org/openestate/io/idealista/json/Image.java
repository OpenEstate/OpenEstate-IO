
package org.openestate.io.idealista.json;

import java.io.Serializable;
import java.math.BigInteger;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Images Object
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "imageLabel",
    "imageOrder",
    "imageUrl"
})
public class Image implements Serializable
{

    /**
     * image label
     * <p>
     * 
     * Corresponds to the "imageLabel" property.
     * 
     */
    @JsonProperty("imageLabel")
    private Image.Label label;
    /**
     * image order
     * <p>
     * 
     * Corresponds to the "imageOrder" property.
     * 
     */
    @JsonProperty("imageOrder")
    @DecimalMin("1")
    @DecimalMax("200")
    private BigInteger order;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("imageUrl")
    @NotNull
    private URI url;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7266463362292978492L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Image() {
    }

    /**
     * 
     * @param url
     */
    public Image(URI url) {
        super();
        this.url = url;
    }

    /**
     * image label
     * <p>
     * 
     * Corresponds to the "imageLabel" property.
     * 
     */
    @JsonProperty("imageLabel")
    public Image.Label getLabel() {
        return label;
    }

    /**
     * image label
     * <p>
     * 
     * Corresponds to the "imageLabel" property.
     * 
     */
    @JsonProperty("imageLabel")
    public void setLabel(Image.Label label) {
        this.label = label;
    }

    public Image withLabel(Image.Label label) {
        this.label = label;
        return this;
    }

    /**
     * image order
     * <p>
     * 
     * Corresponds to the "imageOrder" property.
     * 
     */
    @JsonProperty("imageOrder")
    public BigInteger getOrder() {
        return order;
    }

    /**
     * image order
     * <p>
     * 
     * Corresponds to the "imageOrder" property.
     * 
     */
    @JsonProperty("imageOrder")
    public void setOrder(BigInteger order) {
        this.order = order;
    }

    public Image withOrder(BigInteger order) {
        this.order = order;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("imageUrl")
    public URI getUrl() {
        return url;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("imageUrl")
    public void setUrl(URI url) {
        this.url = url;
    }

    public Image withUrl(URI url) {
        this.url = url;
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

    public Image withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Image.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
        sb.append(',');
        sb.append("order");
        sb.append('=');
        sb.append(((this.order == null)?"<null>":this.order));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
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
        result = ((result* 31)+((this.label == null)? 0 :this.label.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.order == null)? 0 :this.order.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Image) == false) {
            return false;
        }
        Image rhs = ((Image) other);
        return (((((this.label == rhs.label)||((this.label!= null)&&this.label.equals(rhs.label)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.order == rhs.order)||((this.order!= null)&&this.order.equals(rhs.order))));
    }


    /**
     * image label
     * <p>
     * 
     * 
     */
    public enum Label {

        APPRAISALPLAN("appraisalplan"),
        ARCHIVE("archive"),
        ATMOSPHERE("atmosphere"),
        BALCONY("balcony"),
        BASEMENT("basement"),
        BATHROOM("bathroom"),
        BEDROOM("bedroom"),
        BUILDINGWORK("buildingwork"),
        CELLAR("cellar"),
        COMMUNALAREAS("communalareas"),
        CORRIDOR("corridor"),
        DETAILS("details"),
        DINING_ROOM("dining_room"),
        ENERGYCERTIFICATE("energycertificate"),
        FACADE("facade"),
        GARAGE("garage"),
        GARDEN("garden"),
        GATEWAY("gateway"),
        HALL("hall"),
        KITCHEN("kitchen"),
        LAND("land"),
        LIFTS("lifts"),
        LIVING("living"),
        LOFT("loft"),
        MATES("mates"),
        MEETING_ROOM("meeting_room"),
        OFFICE("office"),
        OPEN_PLAN("open_plan"),
        PATIO("patio"),
        PENTHOUSE("penthouse"),
        PLAN("plan"),
        POOL("pool"),
        PORCH("porch"),
        PRESSPHOTO("pressphoto"),
        RECEPTION("reception"),
        ROOM("room"),
        SHOP_WINDOW("shop_window"),
        STAIRCASE("staircase"),
        STORAGE("storage"),
        STORAGE_SPACE("storage_space"),
        STUDIO("studio"),
        SURROUNDINGS("surroundings"),
        TERRACE("terrace"),
        UNKNOWN("unknown"),
        VIEWS("views"),
        WAITINGROOM("waitingroom"),
        WALK_IN_WARDROBE("walk_in_wardrobe");
        private final String value;
        private final static Map<String, Image.Label> CONSTANTS = new HashMap<String, Image.Label>();

        static {
            for (Image.Label c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Label(String value) {
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
        public static Image.Label fromValue(String value) {
            Image.Label constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
