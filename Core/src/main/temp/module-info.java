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

/**
 * General classes for OpenEstate-IO.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
module org.openestate.io.core {
    exports org.openestate.io.core;
    requires commons.csv;
    requires org.slf4j;
    requires org.apache.commons.io;
    requires org.apache.commons.lang3;
    requires validation.api;
    requires java.xml;
    requires java.xml.bind;
    requires jaxen;
    requires com.fasterxml.jackson.databind;

}
