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
package org.openestate.io.immobiliare_it.xml.types;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * MapType.
 *
 * @author Andreas Rudolph
 * @since 1.5
 */
public enum MapType {
    EXACT("exact"),
    NEAR("near"),
    NO("no");

    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(MapType.class);
    private final String xmlValue;

    MapType(String xmlValue) {
        this.xmlValue = xmlValue;
    }

    public String getXmlValue() {
        return xmlValue;
    }

    public static MapType fromXmlValue(String xmlValue) {
        for (MapType val : MapType.values()) {
            if (val.xmlValue.equalsIgnoreCase(xmlValue)) return val;
        }
        return null;
    }
}
