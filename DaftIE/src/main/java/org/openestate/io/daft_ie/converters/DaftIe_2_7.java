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
package org.openestate.io.daft_ie.converters;

import org.apache.commons.lang3.NotImplementedException;
import org.openestate.io.daft_ie.DaftIeDocument;
import org.openestate.io.daft_ie.DaftIeVersion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Converter for version 2.7.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public class DaftIe_2_7 extends AbstractConverter {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(DaftIe_2_7.class);

    @Override
    public DaftIeVersion getVersion() {
        return DaftIeVersion.V2_7;
    }

    /**
     * Downgrade a {@link DaftIeDocument} from version 2.7.
     * <p>
     * Versions before 2.7 are not supported. Therefore, this method always throws a {@link NotImplementedException}.
     *
     * @param doc document in version 2.7
     */
    @Override
    public void downgradeToPreviousVersion(DaftIeDocument doc) {
        throw new NotImplementedException(
                "Daft-XML versions before 2.7 are not supported!");
    }

    /**
     * Upgrade a {@link DaftIeDocument} to version 2.7.
     * <p>
     * Versions before 2.7 are not supported. Therefore, this method always throws a {@link NotImplementedException}.
     *
     * @param doc document
     */
    @Override
    public void upgradeFromPreviousVersion(DaftIeDocument doc) {
        throw new NotImplementedException(
                "Daft-XML versions before 2.7 are not supported!");
    }
}