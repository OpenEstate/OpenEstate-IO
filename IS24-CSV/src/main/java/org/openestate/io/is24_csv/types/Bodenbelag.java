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
package org.openestate.io.is24_csv.types;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Bodenbelag.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public enum Bodenbelag {
    KEINE_ANGABE(0),
    BETON(1),
    EPOXIDHARZBODEN(2),
    FLIESEN(3),
    LAMINAT(4),
    PARKETT(5),
    PVC(6),
    TEPPICHBODEN(7),
    ANTISTATISCHER_TEPPICHBODEN(8),
    STUHLROLLENFESTE_TEPPICHFLIESEN(9),
    STEIN(10),
    NACH_MIETERWUNSCH(11),
    OHNE_BELAG(12);

    private final static Logger LOGGER = LoggerFactory.getLogger(Bodenbelag.class);
    private final int value;

    private Bodenbelag(int value) {
        this.value = value;
    }

    public static Bodenbelag parse(String value) {
        value = StringUtils.trimToNull(value);
        if (value == null) return null;
        for (Bodenbelag s : Bodenbelag.values()) {
            if (String.valueOf(s.value).equalsIgnoreCase(value)) return s;
        }
        return KEINE_ANGABE;
    }

    public String print() {
        return String.valueOf(this.value);
    }
}