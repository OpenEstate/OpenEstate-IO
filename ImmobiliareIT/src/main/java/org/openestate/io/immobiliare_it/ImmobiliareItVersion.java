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
package org.openestate.io.immobiliare_it;

import org.apache.commons.lang3.ArrayUtils;
import org.openestate.io.core.XmlVersion;
import org.openestate.io.immobiliare_it.converters.AbstractConverter;
import org.openestate.io.immobiliare_it.converters.ImmobiliareIt_2_8;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implemented versions of the XML format by <a href="https://www.immobiliare.it/">immobiliare.it</a>.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public enum ImmobiliareItVersion implements XmlVersion<ImmobiliareItDocument, ImmobiliareItVersion> {
    /**
     * Version 2.8.
     */
    V2_8(ImmobiliareIt_2_8.class, "2.8", "2.8.0");

    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(ImmobiliareItVersion.class);
    private final Class<? extends AbstractConverter> converterClass;
    private final String readableVersion;
    private final String[] alias;

    ImmobiliareItVersion(Class<? extends AbstractConverter> converterClass, String readableVersion, String... alias) {
        this.converterClass = converterClass;
        this.readableVersion = readableVersion;
        this.alias = alias;
    }

    public static ImmobiliareItVersion detectFromString(String version) {
        if (version != null) {
            for (ImmobiliareItVersion v : ImmobiliareItVersion.values()) {
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
    public AbstractConverter getConverter() {
        try {
            return this.converterClass.getConstructor().newInstance();
        } catch (Exception ex) {
            LOGGER.error("Can't create converter!");
            LOGGER.error("> " + ex.getLocalizedMessage(), ex);
            return null;
        }
    }

    @Override
    public ImmobiliareItVersion getNextVersion() {
        ImmobiliareItVersion[] versions = ImmobiliareItVersion.values();
        int pos = ArrayUtils.indexOf(versions, this);
        pos++;
        return (versions.length > pos) ? versions[pos] : null;
    }

    @Override
    public ImmobiliareItVersion getPreviousVersion() {
        ImmobiliareItVersion[] versions = ImmobiliareItVersion.values();
        int pos = ArrayUtils.indexOf(versions, this);
        pos--;
        return (pos >= 0) ? versions[pos] : null;
    }

    @Override
    public boolean isLatestVersion() {
        return ImmobiliareItUtils.VERSION.equals(this);
    }

    @Override
    public boolean isNewerThen(ImmobiliareItVersion v) {
        ImmobiliareItVersion[] versions = ImmobiliareItVersion.values();
        return ArrayUtils.indexOf(versions, this) > ArrayUtils.indexOf(versions, v);
    }

    @Override
    public boolean isOlderThen(ImmobiliareItVersion v) {
        ImmobiliareItVersion[] versions = ImmobiliareItVersion.values();
        return ArrayUtils.indexOf(versions, this) < ArrayUtils.indexOf(versions, v);
    }

    @Override
    public String toReadableVersion() {
        return this.readableVersion;
    }
}