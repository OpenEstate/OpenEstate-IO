
package org.openestate.io.idealista.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * energy certification law
 * <p>
 * only for Italy, indicates the legislation that applies to the energy rating, DL-192(2005) or LEGGE-90(2013)
 * 
 */
public enum EnergyCertificateLawType {

    DL_192_2005("dl-192_2005"),
    LEGGE_90_2013("legge-90_2013");
    private final String value;
    private final static Map<String, EnergyCertificateLawType> CONSTANTS = new HashMap<String, EnergyCertificateLawType>();

    static {
        for (EnergyCertificateLawType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private EnergyCertificateLawType(String value) {
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
    public static EnergyCertificateLawType fromValue(String value) {
        EnergyCertificateLawType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
