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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A general class, that converts a {@link XmlConvertableDocument} into another
 * {@link XmlVersion}.
 *
 * @param <DocumentType> the {@link XmlConvertableDocument} class, this converter applies to
 * @param <VersionType>  the {@link XmlVersion} class to determine different versions of the document
 * @author Andreas Rudolph
 * @since 1.0
 */
public abstract class XmlConverter<DocumentType extends XmlConvertableDocument<?, VersionType>, VersionType extends XmlVersion<DocumentType, VersionType>> {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(XmlConverter.class);

    /**
     * Downgrade a {@link XmlConvertableDocument} from the current version to the
     * previous version.
     *
     * @param doc the document to downgrade
     */
    public abstract void downgradeToPreviousVersion(XmlConvertableDocument<?, VersionType> doc);

    /**
     * Returns the version, that this converter is implemented for.
     *
     * @return version of the converter
     */
    public abstract VersionType getVersion();

    /**
     * Upgrade a {@link XmlConvertableDocument} document from the previous version to
     * the current version.
     *
     * @param doc the document to upgrade
     */
    public abstract void upgradeFromPreviousVersion(XmlConvertableDocument<?, VersionType> doc);
}