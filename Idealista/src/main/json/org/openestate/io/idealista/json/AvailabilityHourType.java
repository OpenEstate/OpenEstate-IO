
package org.openestate.io.idealista.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Booth sales availability hour for new developments
 * 
 */
public enum AvailabilityHourType {

    ANY_MORNING("any_morning"),
    MORNINGS("mornings"),
    AT_NOON("at_noon"),
    AFTERNOONS("afternoons"),
    NIGHTS("nights"),
    WEEKENDS("weekends"),
    BUSINESS_HOUR("business_hour");
    private final String value;
    private final static Map<String, AvailabilityHourType> CONSTANTS = new HashMap<String, AvailabilityHourType>();

    static {
        for (AvailabilityHourType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    AvailabilityHourType(String value) {
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
    public static AvailabilityHourType fromValue(String value) {
        AvailabilityHourType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
