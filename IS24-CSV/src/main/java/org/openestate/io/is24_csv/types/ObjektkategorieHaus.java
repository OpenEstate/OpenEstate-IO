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
 * ObjektkategorieHaus.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public enum ObjektkategorieHaus {
    KEINE_ANGABE(0),
    BAUERNHAUS(14),
    BUNGALOW(15),
    DOPPELHAUSHAELFTE(17),
    EINFAMILIENHAUS(18),
    MEHRFAMILIENHAUS(21),
    VILLA(24),
    @Deprecated
    REIHENHAUS(25),
    @Deprecated
    ZWEIFAMILIENHAUS(43),
    @Deprecated
    SONSTIGES(113),
    BESONDERE_IMMOBILIE(119),
    REIHENMITTELHAUS(123),
    REIHENECKHAUS(124),
    BURG_SCHLOSS(125),
    SONSTIGE_WOHNIMMOBILIE(126);

    private final static Logger LOGGER = LoggerFactory.getLogger(ObjektkategorieHaus.class);
    private final int value;

    private ObjektkategorieHaus(int value) {
        this.value = value;
    }

    public static ObjektkategorieHaus parse(String value) {
        value = StringUtils.trimToNull(value);
        if (value == null) return null;
        for (ObjektkategorieHaus s : ObjektkategorieHaus.values()) {
            if (String.valueOf(s.value).equalsIgnoreCase(value)) return s;
        }
        return KEINE_ANGABE;
    }

    public String print() {
        return String.valueOf(this.value);
    }
}