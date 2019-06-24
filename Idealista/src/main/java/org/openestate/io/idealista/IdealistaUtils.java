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
package org.openestate.io.idealista;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Some helper functions for the JSON format of
 * <a href="https://www.idealista.com/">idealista.com</a>.
 *
 * @author Andreas Rudolph
 * @since 1.5
 */
public class IdealistaUtils {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(IdealistaUtils.class);

    /**
     * the implemented version of this format
     */
    @SuppressWarnings("unused")
    public final static String VERSION = "6.0.0";

    private IdealistaUtils() {
    }
}
