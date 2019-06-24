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
package org.openestate.io.openimmo;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.openestate.io.core.XmlConverter;
import org.openestate.io.core.XmlVersion;
import org.openestate.io.openimmo.converters.OpenImmo_1_1;
import org.openestate.io.openimmo.converters.OpenImmo_1_2_0;
import org.openestate.io.openimmo.converters.OpenImmo_1_2_1;
import org.openestate.io.openimmo.converters.OpenImmo_1_2_2;
import org.openestate.io.openimmo.converters.OpenImmo_1_2_3;
import org.openestate.io.openimmo.converters.OpenImmo_1_2_4;
import org.openestate.io.openimmo.converters.OpenImmo_1_2_5;
import org.openestate.io.openimmo.converters.OpenImmo_1_2_6;
import org.openestate.io.openimmo.converters.OpenImmo_1_2_7;
import org.openestate.io.openimmo.converters.OpenImmo_1_2_7b;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implemented versions of the OpenImmo-XML format.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public enum OpenImmoVersion implements XmlVersion {
    /**
     * Version 1.1
     */
    V1_1(OpenImmo_1_1.class, "1.1", "1.1.0"),

    /**
     * Version 1.2.0
     */
    V1_2_0(OpenImmo_1_2_0.class, "1.2", "1.2.0"),

    /**
     * Version 1.2.1
     */
    V1_2_1(OpenImmo_1_2_1.class, "1.2.1"),

    /**
     * Version 1.2.2
     */
    V1_2_2(OpenImmo_1_2_2.class, "1.2.2"),

    /**
     * Version 1.2.3
     */
    V1_2_3(OpenImmo_1_2_3.class, "1.2.3"),

    /**
     * Version 1.2.4
     */
    V1_2_4(OpenImmo_1_2_4.class, "1.2.4"),

    /**
     * Version 1.2.5
     */
    V1_2_5(OpenImmo_1_2_5.class, "1.2.5"),

    /**
     * Version 1.2.6
     */
    V1_2_6(OpenImmo_1_2_6.class, "1.2.6"),

    /**
     * Version 1.2.7
     */
    V1_2_7(OpenImmo_1_2_7.class, "1.2.7"),

    /**
     * Version 1.2.7b
     *
     * @since 1.3
     */
    V1_2_7B(OpenImmo_1_2_7b.class, "1.2.7b", "1.2.7B");

    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(OpenImmoVersion.class);
    private final Class converterClass;
    private final String readableVersion;
    private final String[] alias;

    OpenImmoVersion(Class converterClass, String readableVersion, String... alias) {
        this.converterClass = converterClass;
        this.readableVersion = readableVersion;
        this.alias = alias;
    }

    public static OpenImmoVersion detectFromString(String version) {
        if (version != null) {
            String[] values = StringUtils.split(version, "/");
            for (OpenImmoVersion v : OpenImmoVersion.values()) {
                if (v.toReadableVersion().equalsIgnoreCase(values[0])) return v;
                if (v.alias != null) {
                    for (String a : v.alias) {
                        if (a.equalsIgnoreCase(values[0])) return v;
                    }
                }
            }
        }
        return null;
    }

    @Override
    @SuppressWarnings("Duplicates")
    public XmlConverter getConverter() {
        try {
            return (XmlConverter) this.converterClass.newInstance();
        } catch (Exception ex) {
            LOGGER.error("Can't create converter!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    @Override
    public OpenImmoVersion getNextVersion() {
        OpenImmoVersion[] versions = OpenImmoVersion.values();
        int pos = ArrayUtils.indexOf(versions, this);
        pos++;
        return (versions.length > pos) ? versions[pos] : null;
    }

    @Override
    public OpenImmoVersion getPreviousVersion() {
        OpenImmoVersion[] versions = OpenImmoVersion.values();
        int pos = ArrayUtils.indexOf(versions, this);
        pos--;
        return (pos >= 0) ? versions[pos] : null;
    }

    @Override
    public boolean isLatestVersion() {
        return OpenImmoUtils.VERSION.equals(this);
    }

    @Override
    public boolean isNewerThen(XmlVersion v) {
        OpenImmoVersion[] versions = OpenImmoVersion.values();
        return ArrayUtils.indexOf(versions, this) > ArrayUtils.indexOf(versions, v);
    }

    @Override
    public boolean isOlderThen(XmlVersion v) {
        OpenImmoVersion[] versions = OpenImmoVersion.values();
        return ArrayUtils.indexOf(versions, this) < ArrayUtils.indexOf(versions, v);
    }

    @Override
    public String toReadableVersion() {
        return this.readableVersion;
    }
}