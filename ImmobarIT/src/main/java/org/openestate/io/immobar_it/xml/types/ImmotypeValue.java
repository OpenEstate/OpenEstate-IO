/*
 * Copyright 2015-2019 OpenEstate.org.
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
package org.openestate.io.immobar_it.xml.types;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ImmotypeValue.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
@SuppressWarnings("SpellCheckingInspection")
public enum ImmotypeValue {
    APARTMENT(new String[]{"1"}),
    DETACHED_HOUSE(new String[]{"2"}),
    ROW_HOUSE(new String[]{"3"}),
    PLOT_AREA(new String[]{"4"}),
    AGRICULTURE_FORESTRY(new String[]{"5"}),
    PLOT_AREA_COMMERCIAL(new String[]{"6"}),
    GASTRONOMY(new String[]{"7"}),
    STORE(new String[]{"8"}),
    OFFICE_SURGERY(new String[]{"9"}),
    INDUSTRIAL_PROPERTY(new String[]{"10"}),
    PARKING_SPACE(new String[]{"11"}),
    HOLIDAY_PROPERTY(new String[]{"12"}),
    INVESTMENT_PROPERTY(new String[]{"13"}),
    WAREHOUSE(new String[]{"14"}),
    OTHER(new String[]{"100"});

    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(ImmotypeValue.class);
    private final String[] aliases;

    ImmotypeValue(String[] aliases) {
        this.aliases = aliases;
    }

    public static ImmotypeValue fromXmlValue(String name) {
        name = StringUtils.trimToNull(name);
        if (name == null) return null;
        for (ImmotypeValue value : ImmotypeValue.values()) {
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