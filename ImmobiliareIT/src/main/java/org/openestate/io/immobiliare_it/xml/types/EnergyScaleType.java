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
 * EnergyScaleType.
 *
 * @author Andreas Rudolph
 * @since 1.5
 */
@SuppressWarnings("SpellCheckingInspection")
public enum EnergyScaleType {
    /**
     * Certificazione IPE antecedente al 1 Ottobre 2015.
     */
    IPE("1"),

    /**
     * Certificazione APE (raccomandato).
     */
    APE("2");

    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(EnergyScaleType.class);
    private final String xmlValue;

    EnergyScaleType(String xmlValue) {
        this.xmlValue = xmlValue;
    }

    public String getXmlValue() {
        return xmlValue;
    }

    public static EnergyScaleType fromXmlValue(String xmlValue) {
        for (EnergyScaleType val : EnergyScaleType.values()) {
            if (val.xmlValue.equalsIgnoreCase(xmlValue)) return val;
        }
        return null;
    }
}
