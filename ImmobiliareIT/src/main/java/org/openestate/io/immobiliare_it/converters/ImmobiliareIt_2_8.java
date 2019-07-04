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
package org.openestate.io.immobiliare_it.converters;

import org.apache.commons.lang3.NotImplementedException;
import org.openestate.io.core.XmlConverter;
import org.openestate.io.immobiliare_it.ImmobiliareItDocument;
import org.openestate.io.immobiliare_it.ImmobiliareItVersion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Converter for version 2.8.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public class ImmobiliareIt_2_8 extends XmlConverter<ImmobiliareItDocument, ImmobiliareItVersion> {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(ImmobiliareIt_2_8.class);

    @Override
    public ImmobiliareItVersion getVersion() {
        return ImmobiliareItVersion.V2_8;
    }

    /**
     * Downgrade an Immobiliare document from version 2.8.
     * <p>
     * Versions before 2.8 are not supported. Therefore this method always throws
     * a {@link NotImplementedException}.
     *
     * @param doc Immobiliare document in version 2.8
     */
    @Override
    public void downgradeToPreviousVersion(ImmobiliareItDocument doc) {
        throw new NotImplementedException(
                "Immobiliare-XML versions before 2.8 are not supported!");
    }

    /**
     * Downgrade an Immobiliare document to version 2.8.
     * <p>
     * Versions before 2.8 are not supported. Therefore this method always throws
     * a {@link NotImplementedException}.
     *
     * @param doc OpenImmo document
     */
    @Override
    public void upgradeFromPreviousVersion(ImmobiliareItDocument doc) {
        throw new NotImplementedException(
                "Immobiliare-XML versions before 2.8 are not supported!");
    }
}