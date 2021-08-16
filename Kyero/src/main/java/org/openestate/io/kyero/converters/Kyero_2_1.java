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
package org.openestate.io.kyero.converters;

import org.apache.commons.lang3.NotImplementedException;
import org.openestate.io.core.XmlConverter;
import org.openestate.io.kyero.KyeroDocument;
import org.openestate.io.kyero.KyeroVersion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Converter for version 2.1.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public class Kyero_2_1 extends AbstractConverter {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(Kyero_2_1.class);

    @Override
    public KyeroVersion getVersion() {
        return KyeroVersion.V2_1;
    }

    /**
     * Downgrade a {@link KyeroDocument} from version 2.1.
     * <p>
     * Versions before 2.1 are not supported. Therefore, this method always throws a {@link NotImplementedException}.
     *
     * @param doc document in version 2.1
     */
    @Override
    public void downgradeToPreviousVersion(KyeroDocument doc) {
        throw new NotImplementedException(
                "Kyero versions before 2.1 are not supported!");
    }

    /**
     * Upgrade a {@link KyeroDocument} to version 2.1.
     * <p>
     * Versions before 2.1 are not supported. Therefore, this method always throws a {@link NotImplementedException}.
     *
     * @param doc document
     */
    @Override
    public void upgradeFromPreviousVersion(KyeroDocument doc) {
        throw new NotImplementedException(
                "Kyero versions before 2.1 are not supported!");
    }
}