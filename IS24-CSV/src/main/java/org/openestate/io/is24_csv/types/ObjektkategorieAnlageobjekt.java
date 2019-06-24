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
package org.openestate.io.is24_csv.types;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ObjektkategorieAnlageobjekt.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public enum ObjektkategorieAnlageobjekt {
    EINFAMILIENHAUS(18),
    MEHRFAMILIENHAUS(21),
    EIGENTUMSWOHNUNG(38),
    EINKAUFSZENTRUM(70),
    GASTSTAETTE(82),
    HOTEL(83),
    FREIZEITANLAGE(100),
    GEWERBEEINHEIT(101),
    BUEROGEBAEUDE(106),
    GAESCHAEFTSHAUS(107),
    GEWERBEANWESEN(108),
    HALLE_LAGER(109),
    INDUSTRIEANWESEN(110),
    LADEN_VERKAUFSFLAECHE(111),
    SERVICECENTER(112),
    SONSTIGES(113),
    SUPERMARKT(114),
    WOHN_GESCHAEFTSHAUS(115),
    WOHNANLAGE(116);

    private final static Logger LOGGER = LoggerFactory.getLogger(ObjektkategorieAnlageobjekt.class);
    private final int value;

    private ObjektkategorieAnlageobjekt(int value) {
        this.value = value;
    }

    public static ObjektkategorieAnlageobjekt parse(String value) {
        value = StringUtils.trimToNull(value);
        if (value == null) return null;
        for (ObjektkategorieAnlageobjekt s : ObjektkategorieAnlageobjekt.values()) {
            if (String.valueOf(s.value).equalsIgnoreCase(value)) return s;
        }
        return SONSTIGES;
    }

    public String print() {
        return String.valueOf(this.value);
    }
}