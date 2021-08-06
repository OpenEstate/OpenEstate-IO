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
package org.openestate.io.daft_ie;

import org.apache.commons.lang3.ArrayUtils;
import org.openestate.io.core.XmlConverter;
import org.openestate.io.core.XmlVersion;
import org.openestate.io.daft_ie.converters.DaftIe_2_7;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implemented versions of the XML format by
 * <a href="http://daft.ie/">daft.ie</a>.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public enum DaftIeVersion implements XmlVersion {
    /**
     * Version 2.7
     */
    V2_7(DaftIe_2_7.class, "2.7");

    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(DaftIeVersion.class);
    private final Class converterClass;
    private final String readableVersion;
    private final String[] alias;

    DaftIeVersion(Class converterClass, String readableVersion, String... alias) {
        this.converterClass = converterClass;
        this.readableVersion = readableVersion;
        this.alias = alias;
    }

    public static DaftIeVersion detectFromString(String version) {
        if (version != null) {
            for (DaftIeVersion v : DaftIeVersion.values()) {
                if (v.toReadableVersion().equalsIgnoreCase(version)) return v;
                if (v.alias != null) {
                    for (String a : v.alias) {
                        if (a.equalsIgnoreCase(version)) return v;
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
    public DaftIeVersion getNextVersion() {
        DaftIeVersion[] versions = DaftIeVersion.values();
        int pos = ArrayUtils.indexOf(versions, this);
        pos++;
        return (versions.length > pos) ? versions[pos] : null;
    }

    @Override
    public DaftIeVersion getPreviousVersion() {
        DaftIeVersion[] versions = DaftIeVersion.values();
        int pos = ArrayUtils.indexOf(versions, this);
        pos--;
        return (pos >= 0) ? versions[pos] : null;
    }

    @Override
    public boolean isLatestVersion() {
        return DaftIeUtils.VERSION.equals(this);
    }

    @Override
    public boolean isNewerThen(XmlVersion v) {
        DaftIeVersion[] versions = DaftIeVersion.values();
        return ArrayUtils.indexOf(versions, this) > ArrayUtils.indexOf(versions, v);
    }

    @Override
    public boolean isOlderThen(XmlVersion v) {
        DaftIeVersion[] versions = DaftIeVersion.values();
        return ArrayUtils.indexOf(versions, this) < ArrayUtils.indexOf(versions, v);
    }

    @Override
    public String toReadableVersion() {
        return this.readableVersion;
    }
}