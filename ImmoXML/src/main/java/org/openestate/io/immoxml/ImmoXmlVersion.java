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
package org.openestate.io.immoxml;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.openestate.io.core.XmlConverter;
import org.openestate.io.core.XmlVersion;
import org.openestate.io.immoxml.converters.ImmoXML_3_0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implemented versions of the ImmoXML format.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public enum ImmoXmlVersion implements XmlVersion {
    /**
     * Version 3.0
     */
    V3_0(ImmoXML_3_0.class, "3.0", "3");

    private final static Logger LOGGER = LoggerFactory.getLogger(ImmoXmlVersion.class);
    private final Class converterClass;
    private final String readableVersion;
    private final String[] alias;

    private ImmoXmlVersion(Class converterClass, String readableVersion, String... alias) {
        this.converterClass = converterClass;
        this.readableVersion = readableVersion;
        this.alias = alias;
    }

    public static ImmoXmlVersion detectFromString(String version) {
        if (version != null) {
            String[] values = StringUtils.split(version, "/");
            for (ImmoXmlVersion v : ImmoXmlVersion.values()) {
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
    public ImmoXmlVersion getNextVersion() {
        ImmoXmlVersion[] versions = ImmoXmlVersion.values();
        int pos = ArrayUtils.indexOf(versions, this);
        pos++;
        return (versions.length > pos) ? versions[pos] : null;
    }

    @Override
    public ImmoXmlVersion getPreviousVersion() {
        ImmoXmlVersion[] versions = ImmoXmlVersion.values();
        int pos = ArrayUtils.indexOf(versions, this);
        pos--;
        return (pos >= 0) ? versions[pos] : null;
    }

    @Override
    public boolean isLatestVersion() {
        return ImmoXmlUtils.VERSION.equals(this);
    }

    @Override
    public boolean isNewerThen(XmlVersion v) {
        ImmoXmlVersion[] versions = ImmoXmlVersion.values();
        return ArrayUtils.indexOf(versions, this) > ArrayUtils.indexOf(versions, v);
    }

    @Override
    public boolean isOlderThen(XmlVersion v) {
        ImmoXmlVersion[] versions = ImmoXmlVersion.values();
        return ArrayUtils.indexOf(versions, this) < ArrayUtils.indexOf(versions, v);
    }

    @Override
    public String toReadableVersion() {
        return this.readableVersion;
    }
}