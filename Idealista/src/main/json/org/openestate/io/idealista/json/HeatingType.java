
package org.openestate.io.idealista.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * heatingType
 * <p>
 * 
 * 
 */
public enum HeatingType {

    CENTRAL_GAS("centralGas"),
    CENTRAL_FUEL_OIL("centralFuelOil"),
    CENTRAL_OTHER("centralOther"),
    INDIVIDUAL_GAS("individualGas"),
    INDIVIDUAL_PROPANE_BUTANE("individualPropaneButane"),
    INDIVIDUAL_ELECTRIC("individualElectric"),
    INDIVIDUAL_AIR_CONDITIONING_HEAT_PUMP("individualAirConditioningHeatPump"),
    INDIVIDUAL_OTHER("individualOther"),
    NO_HEATING("noHeating");
    private final String value;
    private final static Map<String, HeatingType> CONSTANTS = new HashMap<String, HeatingType>();

    static {
        for (HeatingType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private HeatingType(String value) {
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
    public static HeatingType fromValue(String value) {
        HeatingType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
