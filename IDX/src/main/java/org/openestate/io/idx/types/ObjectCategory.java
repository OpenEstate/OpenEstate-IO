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
 * ObjectCategory.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public enum ObjectCategory {
    /**
     * Landwirtschaft / Agriculture
     */
    @SuppressWarnings("unused")
    AGRI,

    /**
     * Wohnung / Apartment
     */
    @SuppressWarnings("unused")
    APPT,

    /**
     * Gastronomie / Gastronomy
     */
    @SuppressWarnings("unused")
    GASTRO,

    /**
     * Haus / House
     */
    @SuppressWarnings("unused")
    HOUSE,

    /**
     * Gewerbe/Industrie / Industrial Objects
     */
    @SuppressWarnings("unused")
    INDUS,

    /**
     * Parkplatz / Parking space
     */
    @SuppressWarnings("unused")
    PARK,

    /**
     * Grundstück / Plot
     */
    @SuppressWarnings("unused")
    PROP,

    /**
     * Wohnnebenräume / Secondary rooms
     */
    @SuppressWarnings("unused")
    SECONDARY,

    /**
     * Garten / Garden
     */
    @SuppressWarnings("unused")
    GARDEN;

    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(ObjectCategory.class);

    public static ObjectCategory parse(String value) {
        value = StringUtils.trimToNull(value);
        if (value == null) return null;
        try {
            return ObjectCategory.valueOf(value);
        } catch (Exception ex) {
            return null;
        }
    }

    public String print() {
        return this.name();
    }
}