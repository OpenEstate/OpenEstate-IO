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

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.ValidationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A container for a JSON root element.
 *
 * @param <JavaType> the class of a Java object, that the contained
 *                   JSON string is mapped to
 * @author Andreas Rudolph
 * @since 1.5
 */
public abstract class JsonRootElement<JavaType> {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(JsonRootElement.class);
    private final JavaType object;

    /**
     * Create a JSON root element with a new / empty Java object.
     *
     * @throws IllegalStateException if the empty instance of the Java object can not be created
     */
    protected JsonRootElement() {
        super();

        try {
            this.object = this.getJavaClass().getConstructor().newInstance();
        } catch (Exception ex) {
            throw new IllegalStateException("Can't create an empty instance of " + this.getJavaClass() + "!");
        }
    }

    /**
     * Create a JSON root element from a JSON {@link String}.
     *
     * @param json JSON string to create the object from
     * @throws IOException if the object is not readable
     */
    protected JsonRootElement(String json) throws IOException {
        super();
        this.object = JsonUtils.read(json, getJavaClass(), this.createObjectMapper());
    }

    /**
     * Create a JSON root element from a JSON {@link Reader}.
     *
     * @param json JSON reader to create the object from
     * @throws IOException if the object is not readable
     */
    protected JsonRootElement(Reader json) throws IOException {
        super();
        this.object = JsonUtils.read(json, getJavaClass(), this.createObjectMapper());
    }

    /**
     * Create a JSON root element with the corresponding Java object.
     *
     * @param object Java object to contain
     * @throws IllegalArgumentException if the object parameter is null
     */
    protected JsonRootElement(JavaType object) {
        super();
        if (object == null)
            throw new IllegalArgumentException("The JSON object should not be null!");
        this.object = object;
    }

    /**
     * Create an object mapper instance.
     *
     * @return object mapper
     */
    protected abstract ObjectMapper createObjectMapper();

    /**
     * Returns the class of the contained Java object.
     *
     * @return class
     */
    public abstract Class<? extends JavaType> getJavaClass();

    /**
     * Returns the contained Java object.
     *
     * @return Java object
     */
    public JavaType getObject() {
        return this.object;
    }

    /**
     * Validates all constraints on the contained Java object.
     *
     * @return constraint violations or an empty set if none
     * @throws IllegalArgumentException if object is {@code null}
     *                                  or if {@code null} is passed to the varargs groups
     * @throws ValidationException      if a non-recoverable error happens
     *                                  during the validation process
     */
    public Set<ConstraintViolation<JavaType>> getViolations() {
        return ValidationUtils.getViolations(this.object);
    }

    /**
     * Determines, if the contained Java object contains any validation errors.
     *
     * @return true, if the contained Java object does not contain any validation errors
     */
    public boolean isValid() {
        return ValidationUtils.isValid(this.object);
    }

    /**
     * Write the contained Java object into JSON.
     *
     * @param writer output target
     * @throws IOException if the object is not writable
     */
    public void write(Writer writer) throws IOException {
        JsonUtils.write(writer, this.object, this.getJavaClass(), this.createObjectMapper());
    }

    /**
     * Write the contained Java object into JSON.
     *
     * @param writer      output target
     * @param prettyPrint indent generated JSON
     * @throws IOException if the object is not writable
     */
    public void write(Writer writer, boolean prettyPrint) throws IOException {
        JsonUtils.write(writer, this.object, this.getJavaClass(), this.createObjectMapper(), prettyPrint);
    }

    /**
     * Write the contained Java object into JSON.
     *
     * @throws IOException if the object is not writable
     */
    public String writeToString() throws IOException {
        return JsonUtils.writeToString(this.object, this.getJavaClass(), this.createObjectMapper());
    }

    /**
     * Write the contained Java object into JSON.
     *
     * @param prettyPrint indent generated JSON
     * @throws IOException if the object is not writable
     */
    public String writeToString(boolean prettyPrint) throws IOException {
        return JsonUtils.writeToString(this.object, this.getJavaClass(), this.createObjectMapper(), prettyPrint);
    }
}
