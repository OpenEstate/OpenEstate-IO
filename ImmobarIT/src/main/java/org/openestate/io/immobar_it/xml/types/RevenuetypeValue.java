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
 * RevenuetypeValue.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
@SuppressWarnings("SpellCheckingInspection")
public enum RevenuetypeValue {
    SALE(new String[]{"1"}),
    RENT(new String[]{"2"});

    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(RevenuetypeValue.class);
    private final String[] aliases;

    RevenuetypeValue(String[] aliases) {
        this.aliases = aliases;
    }

    public static RevenuetypeValue fromXmlValue(String name) {
        name = StringUtils.trimToNull(name);
        if (name == null) return null;
        for (RevenuetypeValue value : RevenuetypeValue.values()) {
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