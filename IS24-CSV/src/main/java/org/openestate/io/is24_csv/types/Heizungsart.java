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
 * Heizungsart.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
@SuppressWarnings("SpellCheckingInspection")
public enum Heizungsart {
    KEINE_ANGABE(0),
    ETAGENHEIZUNG(1),
    OFENHEIZUNG(4),
    ZENTRALHEIZUNG(5);

    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(Heizungsart.class);
    private final int value;

    Heizungsart(int value) {
        this.value = value;
    }

    public static Heizungsart parse(String value) {
        value = StringUtils.trimToNull(value);
        if (value == null) return null;
        for (Heizungsart s : Heizungsart.values()) {
            if (String.valueOf(s.value).equalsIgnoreCase(value)) return s;
        }
        return KEINE_ANGABE;
    }

    public String print() {
        return String.valueOf(this.value);
    }
}