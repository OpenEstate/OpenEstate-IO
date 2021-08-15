
package org.openestate.io.idealista.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * access type
 * <p>
 * 
 * 
 */
public enum AccessType {

    URBAN("urban"),
    ROAD("road"),
    TRACK("track"),
    HIGHWAY("highway"),
    UNKNOWN("unknown");
    private final String value;
    private final static Map<String, AccessType> CONSTANTS = new HashMap<String, AccessType>();

    static {
        for (AccessType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    AccessType(String value) {
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
    public static AccessType fromValue(String value) {
        AccessType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
