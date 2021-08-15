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
package org.openestate.io.idx.types;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * GrossPremium.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public enum GrossPremium {
    @SuppressWarnings("unused")
    FROM_2_UNTIL_3("2-3"),

    @SuppressWarnings("unused")
    FROM_3_UNTIL_4("3-4"),

    @SuppressWarnings("unused")
    FROM_4_UNTIL_5("4-5"),

    @SuppressWarnings("unused")
    FROM_5_UNTIL_6("5-6"),

    @SuppressWarnings("unused")
    FROM_6_UNTIL_7("6-7"),

    @SuppressWarnings("unused")
    FROM_7_UNTIL_8("7-8"),

    @SuppressWarnings("unused")
    FROM_8("8+");

    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(GrossPremium.class);
    private final String value;

    GrossPremium(String value) {
        this.value = value;
    }

    public static GrossPremium parse(String value) {
        value = StringUtils.trimToNull(value);
        if (value == null) return null;
        for (GrossPremium g : GrossPremium.values()) {
            if (g.value.equalsIgnoreCase(value)) return g;
        }
        return null;
    }

    public String print() {
        return this.value;
    }
}