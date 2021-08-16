
package org.openestate.io.idealista.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * windows location
 * <p>
 * internal / external flat based on windows view. Only available for Spain.
 * 
 */
public enum WindowsLocationType {

    INTERIOR("interior"),
    EXTERIOR("exterior");
    private final String value;
    private final static Map<String, WindowsLocationType> CONSTANTS = new HashMap<String, WindowsLocationType>();

    static {
        for (WindowsLocationType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    WindowsLocationType(String value) {
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
    public static WindowsLocationType fromValue(String value) {
        WindowsLocationType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
