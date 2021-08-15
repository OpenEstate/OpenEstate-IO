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
 * OrientationValue.
 *
 * @author Andreas Rudolph
 * @since 1.4
 */
@SuppressWarnings("SpellCheckingInspection")
public enum OrientationValue {
    NORTH(new String[]{"North", "Nord", "Norden"}),
    SOUTH(new String[]{"South", "Süd", "Süden"}),
    EAST(new String[]{"East", "Ost", "Osten"}),
    WEST(new String[]{"West", "Westen"});

    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(OrientationValue.class);
    private final String[] aliases;

    OrientationValue(String[] aliases) {
        this.aliases = aliases;
    }

    public static OrientationValue fromXmlValue(String name) {
        name = StringUtils.trimToNull(name);
        if (name == null) return null;
        for (OrientationValue value : OrientationValue.values()) {
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