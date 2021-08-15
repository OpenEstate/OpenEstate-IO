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
 * GenderType.
 *
 * @author Andreas Rudolph
 * @since 1.5
 */
public enum GenderType {
    DOESNT_MATTER("DoesntMatter"),
    MALE("Male"),
    FEMALE("Female");

    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(GenderType.class);
    private final String xmlValue;

    GenderType(String xmlValue) {
        this.xmlValue = xmlValue;
    }

    public String getXmlValue() {
        return xmlValue;
    }

    public static GenderType fromXmlValue(String xmlValue) {
        for (GenderType val : GenderType.values()) {
            if (val.xmlValue.equalsIgnoreCase(xmlValue)) return val;
        }
        return null;
    }
}
