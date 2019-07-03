
package org.openestate.io.idealista.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ConservationType {

    NEW("new"),
    GOOD("good"),
    TO_RESTORE("toRestore");
    private final String value;
    private final static Map<String, ConservationType> CONSTANTS = new HashMap<String, ConservationType>();

    static {
        for (ConservationType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ConservationType(String value) {
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
    public static ConservationType fromValue(String value) {
        ConservationType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
