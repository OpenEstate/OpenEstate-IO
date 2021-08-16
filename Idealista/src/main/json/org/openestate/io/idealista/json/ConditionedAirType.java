
package org.openestate.io.idealista.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * air conditioning type
 * <p>
 * 
 * 
 */
public enum ConditionedAirType {

    NOT_AVAILABLE("notAvailable"),
    COLD("cold"),
    COLD_HEAT("cold/heat"),
    PRE_INSTALLATION("preInstallation");
    private final String value;
    private final static Map<String, ConditionedAirType> CONSTANTS = new HashMap<String, ConditionedAirType>();

    static {
        for (ConditionedAirType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ConditionedAirType(String value) {
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
    public static ConditionedAirType fromValue(String value) {
        ConditionedAirType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
