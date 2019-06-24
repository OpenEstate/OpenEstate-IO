
package org.openestate.io.idealista.json;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonCreator;
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
public class Images implements Serializable
{

    /**
     * image label
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("imageLabel")
    private Images.ImageLabel imageLabel;
    /**
     * image order
     * <p>
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("imageOrder")
    @DecimalMin("1")
    @DecimalMax("200")
    private BigInteger imageOrder;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("imageUrl")
    @Pattern(regexp = "^(http)(s?)://.*$")
    @NotNull
    @Nonnull
    private String imageUrl;
    private final static long serialVersionUID = -648802483294099831L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Images() {
    }

    /**
     * 
     * @param imageUrl
     */
    public Images(String imageUrl) {
        super();
        this.imageUrl = imageUrl;
    }

    /**
     * image label
     * <p>
     * 
     * 
     */
    @JsonProperty("imageLabel")
    public Images.ImageLabel getImageLabel() {
        return imageLabel;
    }

    /**
     * image label
     * <p>
     * 
     * 
     */
    @JsonProperty("imageLabel")
    public void setImageLabel(Images.ImageLabel imageLabel) {
        this.imageLabel = imageLabel;
    }

    /**
     * image order
     * <p>
     * 
     * 
     */
    @JsonProperty("imageOrder")
    public BigInteger getImageOrder() {
        return imageOrder;
    }

    /**
     * image order
     * <p>
     * 
     * 
     */
    @JsonProperty("imageOrder")
    public void setImageOrder(BigInteger imageOrder) {
        this.imageOrder = imageOrder;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("imageUrl")
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("imageUrl")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Images.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("imageLabel");
        sb.append('=');
        sb.append(((this.imageLabel == null)?"<null>":this.imageLabel));
        sb.append(',');
        sb.append("imageOrder");
        sb.append('=');
        sb.append(((this.imageOrder == null)?"<null>":this.imageOrder));
        sb.append(',');
        sb.append("imageUrl");
        sb.append('=');
        sb.append(((this.imageUrl == null)?"<null>":this.imageUrl));
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
        result = ((result* 31)+((this.imageLabel == null)? 0 :this.imageLabel.hashCode()));
        result = ((result* 31)+((this.imageOrder == null)? 0 :this.imageOrder.hashCode()));
        result = ((result* 31)+((this.imageUrl == null)? 0 :this.imageUrl.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Images) == false) {
            return false;
        }
        Images rhs = ((Images) other);
        return ((((this.imageLabel == rhs.imageLabel)||((this.imageLabel!= null)&&this.imageLabel.equals(rhs.imageLabel)))&&((this.imageOrder == rhs.imageOrder)||((this.imageOrder!= null)&&this.imageOrder.equals(rhs.imageOrder))))&&((this.imageUrl == rhs.imageUrl)||((this.imageUrl!= null)&&this.imageUrl.equals(rhs.imageUrl))));
    }

    public enum ImageLabel {

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
        private final static Map<String, Images.ImageLabel> CONSTANTS = new HashMap<String, Images.ImageLabel>();

        static {
            for (Images.ImageLabel c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ImageLabel(String value) {
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
        public static Images.ImageLabel fromValue(String value) {
            Images.ImageLabel constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
