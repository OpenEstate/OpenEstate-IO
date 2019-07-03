
package org.openestate.io.idealista.json;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * An abstract property type
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

})
public abstract class AbstractFeatures implements Serializable
{

    private final static long serialVersionUID = -3750189815996399863L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractFeatures.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AbstractFeatures) == false) {
            return false;
        }
        AbstractFeatures rhs = ((AbstractFeatures) other);
        return true;
    }

}
