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

import org.openestate.io.core.XmlConvertableDocument;
import org.openestate.io.core.XmlConverter;
import org.openestate.io.kyero.KyeroDocument;
import org.openestate.io.kyero.KyeroVersion;

/**
 * An abstract base class for Kyero converters.
 *
 * @author Andreas Rudolph
 * @since 1.5
 */
public abstract class AbstractConverter extends XmlConverter<KyeroDocument, KyeroVersion> {
    @Override
    public final void downgradeToPreviousVersion(XmlConvertableDocument<?, KyeroVersion> doc) {
        this.downgradeToPreviousVersion((KyeroDocument) doc);
    }

    /**
     * Downgrade a {@link KyeroDocument} from the current version to the previous version.
     *
     * @param doc the document to downgrade
     */
    public abstract void downgradeToPreviousVersion(KyeroDocument doc);

    @Override
    public final void upgradeFromPreviousVersion(XmlConvertableDocument<?, KyeroVersion> doc) {
        this.upgradeFromPreviousVersion((KyeroDocument) doc);
    }

    /**
     * Upgrade a {@link KyeroDocument} document from the previous version to the current version.
     *
     * @param doc the document to upgrade
     */
    public abstract void upgradeFromPreviousVersion(KyeroDocument doc);
}
