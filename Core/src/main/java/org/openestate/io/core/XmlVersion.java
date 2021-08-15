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
package org.openestate.io.core;

/**
 * A general interface for versions of XML documents.
 *
 * @param <DocumentType> the {@link XmlConvertableDocument} class, this version applies to
 * @param <VersionType>  this version class
 * @author Andreas Rudolph
 * @since 1.0
 */
public interface XmlVersion<DocumentType extends XmlConvertableDocument<?, VersionType>, VersionType extends XmlVersion<DocumentType, VersionType>> {
    /**
     * Returns the converter for this version.
     *
     * @return the converter for this version
     */
    XmlConverter<DocumentType, VersionType> getConverter();

    /**
     * Returns the next version relative to this version.
     *
     * @return the next version or null, if no next version is present
     */
    VersionType getNextVersion();

    /**
     * Returns the previous version relative to this version.
     *
     * @return the previous version or null, if no previous version is present
     */
    VersionType getPreviousVersion();

    /**
     * Returns the newest / latest version, that is currently supported.
     *
     * @return the latest version
     */
    boolean isLatestVersion();

    /**
     * Check, if this version is newer then another version.
     *
     * @param v the other version to compare
     * @return true, if this version is newer then the other version, otherwise false
     */
    boolean isNewerThen(VersionType v);

    /**
     * Check, if this version is older than another version.
     *
     * @param v the other version to compare
     * @return true, if this version is older than the other version, otherwise false
     */
    boolean isOlderThen(VersionType v);

    /**
     * Convert this version to a readable string.
     *
     * @return the readable string for this version
     */
    String toReadableVersion();
}