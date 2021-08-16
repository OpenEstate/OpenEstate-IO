
package org.openestate.io.idealista.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * energy certification rating
 * <p>
 * 
 * 
 */
public enum EnergyCertificateRatingType {

    A("A"),
    A_PLUS("A+"),
    A1("A1"),
    A2("A2"),
    A3("A3"),
    A4("A4"),
    B("B"),
    B_MINUS("B-"),
    C("C"),
    D("D"),
    E("E"),
    F("F"),
    G("G"),
    EXEMPT("exempt"),
    IN_PROCESS("inProcess"),
    UNKNOWN("unknown");
    private final String value;
    private final static Map<String, EnergyCertificateRatingType> CONSTANTS = new HashMap<String, EnergyCertificateRatingType>();

    static {
        for (EnergyCertificateRatingType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    EnergyCertificateRatingType(String value) {
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
    public static EnergyCertificateRatingType fromValue(String value) {
        EnergyCertificateRatingType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
