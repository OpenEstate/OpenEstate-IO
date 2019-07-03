
package org.openestate.io.idealista.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BathroomType {

    TOILETS("toilets"),
    FULL_EQUIPED("fullEquiped"),
    BOTH("both");
    private final String value;
    private final static Map<String, BathroomType> CONSTANTS = new HashMap<String, BathroomType>();

    static {
        for (BathroomType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private BathroomType(String value) {
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
    public static BathroomType fromValue(String value) {
        BathroomType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
