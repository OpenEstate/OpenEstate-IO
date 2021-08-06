
package org.openestate.io.idealista.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * rooms splitted
 * <p>
 * 
 * 
 */
public enum RoomsSplittedType {

    UNKNOWN("unknown"),
    OPEN_PLAN("openPlan"),
    WITH_SCREENS("withScreens"),
    WITH_WALLS("withWalls");
    private final String value;
    private final static Map<String, RoomsSplittedType> CONSTANTS = new HashMap<String, RoomsSplittedType>();

    static {
        for (RoomsSplittedType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private RoomsSplittedType(String value) {
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
    public static RoomsSplittedType fromValue(String value) {
        RoomsSplittedType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
