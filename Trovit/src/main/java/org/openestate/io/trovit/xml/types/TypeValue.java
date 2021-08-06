/*
 * Copyright 2015-2021 OpenEstate.org.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openestate.io.trovit.xml.types;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TypeValue.
 *
 * @author Andreas Rudolph
 * @since 1.4
 */
public enum TypeValue {
    FOR_RENT(new String[]{"For Rent", "Alquiler"}),
    FOR_SALE(new String[]{"For Sale", "Venta"}),
    RENTALS(new String[]{"Rentals"}),
    ROOMMATE(new String[]{"Roommate"}),
    PARKING_FOR_RENT(new String[]{"Parking For Rent"}),
    PARKING_FOR_SALE(new String[]{"Parking For Sale"}),
    OFFICE_FOR_RENT(new String[]{"Office For Rent"}),
    OFFICE_FOR_SALE(new String[]{"Office For Sale"}),
    LAND_FOR_SALE(new String[]{"Land For Sale"}),
    LOCAL_FOR_RENT(new String[]{"For Rent Local"}),
    LOCAL_FOR_SALE(new String[]{"For Sale Local"}),
    LOCAL_FOR_TRANSFER(new String[]{"Transfer Local"}),
    COUNTRY_HOUSE_RENTALS(new String[]{"Country House Rentals"}),
    WAREHOUSE_FOR_RENT(new String[]{"Warehouse For Rent"}),
    WAREHOUSE_FOR_SALE(new String[]{"Warehouse For Sale"}),
    OVERSEAS(new String[]{"Overseas"}),
    SHORT_TERM_RENTALS(new String[]{"Short Term Rentals"}),
    UNLISTED_FORECLOSURE(new String[]{"Unlisted Foreclosure"});

    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(TypeValue.class);
    private final String[] aliases;

    TypeValue(String[] aliases) {
        this.aliases = aliases;
    }

    public static TypeValue fromXmlValue(String name) {
        name = StringUtils.trimToNull(name);
        if (name == null) return null;
        for (TypeValue value : TypeValue.values()) {
            if (value.name().equalsIgnoreCase(name)) return value;
            for (String alias : value.aliases) {
                if (alias.equalsIgnoreCase(name)) return value;
            }
        }
        return null;
    }

    public String write() {
        return this.aliases[0];
    }
}