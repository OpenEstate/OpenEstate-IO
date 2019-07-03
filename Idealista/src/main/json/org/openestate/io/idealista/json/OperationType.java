
package org.openestate.io.idealista.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum OperationType {

    RENT("rent"),
    SALE("sale"),
    RENT_TO_OWN("rentToOwn");
    private final String value;
    private final static Map<String, OperationType> CONSTANTS = new HashMap<String, OperationType>();

    static {
        for (OperationType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private OperationType(String value) {
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
    public static OperationType fromValue(String value) {
        OperationType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
