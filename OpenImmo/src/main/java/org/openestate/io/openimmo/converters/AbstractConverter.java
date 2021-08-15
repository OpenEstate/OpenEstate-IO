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
package org.openestate.io.openimmo.converters;

import org.openestate.io.core.XmlConvertableDocument;
import org.openestate.io.core.XmlConverter;
import org.openestate.io.openimmo.OpenImmoDocument;
import org.openestate.io.openimmo.OpenImmoVersion;

/**
 * An abstract base class for OpenImmo converters.
 *
 * @author Andreas Rudolph
 * @since 1.5
 */
public abstract class AbstractConverter extends XmlConverter<OpenImmoDocument<?>, OpenImmoVersion> {
    @Override
    public final void downgradeToPreviousVersion(XmlConvertableDocument<?, OpenImmoVersion> doc) {
        this.downgradeToPreviousVersion((OpenImmoDocument<?>) doc);
    }

    /**
     * Downgrade a {@link OpenImmoDocument} from the current version to the previous version.
     *
     * @param doc the document to downgrade
     */
    public abstract void downgradeToPreviousVersion(OpenImmoDocument<?> doc);

    @Override
    public final void upgradeFromPreviousVersion(XmlConvertableDocument<?, OpenImmoVersion> doc) {
        this.upgradeFromPreviousVersion((OpenImmoDocument<?>) doc);
    }

    /**
     * Upgrade a {@link OpenImmoDocument} document from the previous version to the current version.
     *
     * @param doc the document to upgrade
     */
    public abstract void upgradeFromPreviousVersion(OpenImmoDocument<?> doc);
}
