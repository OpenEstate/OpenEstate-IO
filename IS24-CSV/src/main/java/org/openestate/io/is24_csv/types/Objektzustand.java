/*
 * Copyright 2015-2018 OpenEstate.org.
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
 * Objektzustand.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public enum Objektzustand {
    KEINE_ANGABE(0),
    ERSTBEZUG(1),
    NEUWERTIG(2),
    VOLLSTAENDIG_RENOVIERT(3),
    RENOVIERUNGSBEDARF(4),
    MODERNISIERT(5),
    NACH_VEREINBARUNG(6),
    GEPFLEGT(7),
    ERSTBEZUG_NACH_SANIERUNG(8),
    SANIERT(9),
    @Deprecated
    UNRENOVIERT(10),
    ABBRUCHREIF(11);

    private final static Logger LOGGER = LoggerFactory.getLogger(Objektzustand.class);
    private final int value;

    private Objektzustand(int value) {
        this.value = value;
    }

    public static Objektzustand parse(String value) {
        value = StringUtils.trimToNull(value);
        if (value == null) return null;
        for (Objektzustand s : Objektzustand.values()) {
            if (String.valueOf(s.value).equalsIgnoreCase(value)) return s;
        }
        return KEINE_ANGABE;
    }

    public String print() {
        return String.valueOf(this.value);
    }
}