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
package org.openestate.io.immoxml.converters;

import org.apache.commons.lang3.NotImplementedException;
import org.openestate.io.core.XmlConverter;
import org.openestate.io.immoxml.ImmoXmlDocument;
import org.openestate.io.immoxml.ImmoXmlVersion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Converter for version 3.0.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public class ImmoXML_3_0 extends XmlConverter<ImmoXmlDocument, ImmoXmlVersion> {
    private final static Logger LOGGER = LoggerFactory.getLogger(ImmoXML_3_0.class);

    @Override
    public ImmoXmlVersion getVersion() {
        return ImmoXmlVersion.V3_0;
    }

    /**
     * Downgrade an ImmoXML document from version 3.0.
     * <p>
     * Versions before 3.0 are not supported. Therefore this method always throws
     * a {@link NotImplementedException}.
     *
     * @param doc ImmoXML document in version 3.0
     */
    @Override
    public void downgradeToPreviousVersion(ImmoXmlDocument doc) {
        throw new NotImplementedException(
                "ImmoXML versions before 3.0 are not supported!");
    }

    /**
     * Downgrade an ImmoXML document to version 3.0.
     * <p>
     * Versions before 3.0 are not supported. Therefore this method always throws
     * a {@link NotImplementedException}.
     *
     * @param doc ImmoXML document
     */
    @Override
    public void upgradeFromPreviousVersion(ImmoXmlDocument doc) {
        throw new NotImplementedException(
                "ImmoXML versions before 3.0 are not supported!");
    }
}