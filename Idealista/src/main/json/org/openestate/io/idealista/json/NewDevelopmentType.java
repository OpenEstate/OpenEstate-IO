
package org.openestate.io.idealista.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum NewDevelopmentType {

    RESTORED_BUILDING("restored_building"),
    NEW_BUILDING("new_building"),
    HOUSE("house"),
    MIXED_PROMOS("mixed_promos");
    private final String value;
    private final static Map<String, NewDevelopmentType> CONSTANTS = new HashMap<String, NewDevelopmentType>();

    static {
        for (NewDevelopmentType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private NewDevelopmentType(String value) {
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
    public static NewDevelopmentType fromValue(String value) {
        NewDevelopmentType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
