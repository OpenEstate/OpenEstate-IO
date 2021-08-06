
package org.openestate.io.idealista.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * energy certification type
 * <p>
 * only available for new development properties. project: certification in project phase; completed: certification if the property is finished
 * 
 */
public enum EnergyCertificateType {

    PROJECT("project"),
    COMPLETED("completed");
    private final String value;
    private final static Map<String, EnergyCertificateType> CONSTANTS = new HashMap<String, EnergyCertificateType>();

    static {
        for (EnergyCertificateType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private EnergyCertificateType(String value) {
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
    public static EnergyCertificateType fromValue(String value) {
        EnergyCertificateType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
