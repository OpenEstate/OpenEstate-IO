
package org.openestate.io.idealista.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * If the visibility is 'idealista', you can find the property using the idealista's search engine; 'microsite', the property is only published on the real estate agency microsite; 'private', the property is not published and only the customer can see it.
 * 
 */
public enum PropertyVisibilityType {

    IDEALISTA("idealista"),
    MICROSITE("microsite"),
    PRIVATE("private");
    private final String value;
    private final static Map<String, PropertyVisibilityType> CONSTANTS = new HashMap<String, PropertyVisibilityType>();

    static {
        for (PropertyVisibilityType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private PropertyVisibilityType(String value) {
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
    public static PropertyVisibilityType fromValue(String value) {
        PropertyVisibilityType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
