
package org.openestate.io.idealista.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * parking types
 * <p>
 * this feature only applies for Portugal and Italy garages. 'depot' if is a box garage. 'parking_space' if is a regular garage
 * 
 */
public enum ParkingType {

    UNKNOWN("unknown"),
    DEPOT("depot"),
    PARKING_SPACE("parking_space");
    private final String value;
    private final static Map<String, ParkingType> CONSTANTS = new HashMap<String, ParkingType>();

    static {
        for (ParkingType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ParkingType(String value) {
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
    public static ParkingType fromValue(String value) {
        ParkingType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
