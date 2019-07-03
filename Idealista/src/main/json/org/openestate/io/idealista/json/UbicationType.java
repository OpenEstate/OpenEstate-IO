
package org.openestate.io.idealista.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum UbicationType {

    SHOPPING("shopping"),
    STREET("street"),
    MEZZANINE("mezzanine"),
    BELOW_GROUND("belowGround"),
    OTHER("other"),
    UNKNOWN("unknown");
    private final String value;
    private final static Map<String, UbicationType> CONSTANTS = new HashMap<String, UbicationType>();

    static {
        for (UbicationType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private UbicationType(String value) {
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
    public static UbicationType fromValue(String value) {
        UbicationType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
