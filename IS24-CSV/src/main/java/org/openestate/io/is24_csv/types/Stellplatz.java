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
 * Stellplatz.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public enum Stellplatz {
    KEINE_ANGABE('1'),
    GARAGE('2'),
    AUSSEN_STELLPLATZ('3'),
    CARPORT('4'),
    DUPLEX('5'),
    PARKHAUS('6'),
    TIEFGARAGE('7'),
    @Deprecated
    JA('J'),
    @Deprecated
    NEIN('N');

    private final static Logger LOGGER = LoggerFactory.getLogger(Stellplatz.class);
    private final char value;

    private Stellplatz(char value) {
        this.value = value;
    }

    public static Stellplatz parse(String value) {
        value = StringUtils.trimToNull(value);
        if (value == null) return null;
        for (Stellplatz s : Stellplatz.values()) {
            if (String.valueOf(s.value).equalsIgnoreCase(value)) return s;
        }
        return KEINE_ANGABE;
    }

    public String print() {
        return String.valueOf(this.value);
    }
}