
package org.openestate.io.idealista.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Phase of built for new developments
 * 
 */
public enum BuiltPhaseType {

    LAND_MOVE("land_move"),
    FOUNDATION("foundation"),
    CARPENTRY("carpentry"),
    PILOT("pilot"),
    PAVING("paving"),
    EQUIPMENT("equipment"),
    KEYDELIVERY("keydelivery");
    private final String value;
    private final static Map<String, BuiltPhaseType> CONSTANTS = new HashMap<String, BuiltPhaseType>();

    static {
        for (BuiltPhaseType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    BuiltPhaseType(String value) {
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
    public static BuiltPhaseType fromValue(String value) {
        BuiltPhaseType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
