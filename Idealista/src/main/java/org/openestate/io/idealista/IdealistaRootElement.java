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
package org.openestate.io.idealista;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import org.openestate.io.core.JsonRootElement;
import org.openestate.io.idealista.json.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Container for the {@link Customer} root element.
 *
 * @author Andreas Rudolph
 * @since 1.5
 */
public class IdealistaRootElement extends JsonRootElement<Customer> {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(IdealistaRootElement.class);

    /**
     * Create an {@link IdealistaRootElement} with a new / empty Java object.
     *
     * @throws IllegalStateException if the empty instance of the Java object can not be created
     */
    @SuppressWarnings("unused")
    public IdealistaRootElement() {
        super();
    }

    /**
     * Create an {@link IdealistaRootElement} from a JSON {@link String}.
     *
     * @param json JSON string to create the object from
     * @throws IOException if the object is not readable
     */
    public IdealistaRootElement(String json) throws IOException {
        super(json);
    }

    /**
     * Create an {@link IdealistaRootElement} from a JSON {@link Reader}.
     *
     * @param json JSON reader to create the object from
     * @throws IOException if the object is not readable
     */
    public IdealistaRootElement(Reader json) throws IOException {
        super(json);
    }

    @Override
    protected ObjectMapper createObjectMapper() {
        return IdealistaUtils.createObjectMapper();
    }

    /**
     * Create an {@link IdealistaRootElement} with the corresponding Java object.
     *
     * @param object Java object to contain
     * @throws IllegalArgumentException if the object parameter is null
     */
    public IdealistaRootElement(Customer object) {
        super(object);
    }

    @Override
    public Class<Customer> getJavaClass() {
        return Customer.class;
    }

    /**
     * Write the contained Java object into JSON.
     *
     * @param output output target
     * @throws IOException if the object is not writable
     */
    public void write(OutputStream output) throws IOException {
        this.write(output, true);
    }

    /**
     * Write the contained Java object into JSON.
     *
     * @param output      output target
     * @param prettyPrint indent generated JSON
     * @throws IOException if the object is not writable
     */
    public void write(OutputStream output, boolean prettyPrint) throws IOException {
        try (Writer w = new OutputStreamWriter(output, IdealistaUtils.CHARSET)) {
            this.write(w, prettyPrint);
        }
    }

    /**
     * Write the contained Java object into JSON.
     *
     * @param output output target
     * @throws IOException if the object is not writable
     */
    public void write(File output) throws IOException {
        this.write(output, true);
    }

    /**
     * Write the contained Java object into JSON.
     *
     * @param output      output target
     * @param prettyPrint indent generated JSON
     * @throws IOException if the object is not writable
     */
    public void write(File output, boolean prettyPrint) throws IOException {
        try (Writer w = new OutputStreamWriter(new FileOutputStream(output), IdealistaUtils.CHARSET)) {
            this.write(w, prettyPrint);
        }
    }
}
