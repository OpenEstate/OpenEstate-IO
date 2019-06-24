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
package org.openestate.io.core;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Some helper functions for JSON processing.
 *
 * @author Andreas Rudolph
 * @since 1.5
 */
@SuppressWarnings("WeakerAccess")
public final class JsonUtils {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(JsonUtils.class);

    private JsonUtils() {
    }

    /**
     * Create a Java object from a JSON {@link String}.
     *
     * @param json      JSON string
     * @param javaClass class of the Java object to create
     * @param <T>       type of the Java object to create
     * @return created Java object
     * @throws IOException if the object is not readable
     */
    public static <T> T read(String json, Class<? extends T> javaClass) throws IOException {
        try (Reader r = new StringReader(json)) {
            return read(r, javaClass);
        }
    }

    /**
     * Create a Java object from a JSON {@link Reader}.
     *
     * @param json      JSON string
     * @param javaClass class of the Java object to create
     * @param <T>       type of the Java object to create
     * @return created Java object
     * @throws IOException if the object is not readable
     */
    public static <T> T read(Reader json, Class<? extends T> javaClass) throws IOException {
        return new ObjectMapper()
                .reader(javaClass)
                .readValue(json);
    }

    /**
     * Convert a Java object into JSON.
     *
     * @param output    output target
     * @param object    Java object to write
     * @param javaClass class of the Java object to write
     * @param <T>       type of the Java object to write
     * @throws IOException if the object is not writable
     */
    public static <T> void write(Writer output, T object, Class<? extends T> javaClass) throws IOException {
        write(output, object, javaClass, true);
    }

    /**
     * Convert a Java object into JSON.
     *
     * @param output      output target
     * @param object      Java object to write
     * @param javaClass   class of the Java object to write
     * @param prettyPrint indent generated JSON
     * @param <T>         type of the Java object to write
     * @throws IOException if the object is not writable
     */
    public static <T> void write(Writer output, T object, Class<? extends T> javaClass, boolean prettyPrint) throws IOException {
        new ObjectMapper()
                .configure(SerializationFeature.INDENT_OUTPUT, prettyPrint)
                .writer()
                .forType(javaClass)
                .writeValue(output, object);
    }

    /**
     * Write a Java object into a JSON {@link String}.
     *
     * @param object    Java object to write
     * @param javaClass class of the Java object to write
     * @param <T>       type of the Java object to write
     * @return generated JSON string
     * @throws IOException if the object is not writable
     */
    public static <T> String writeToString(T object, Class<? extends T> javaClass) throws IOException {
        return writeToString(object, javaClass, true);
    }

    /**
     * Write a Java object into a JSON {@link String}.
     *
     * @param object      Java object to write
     * @param javaClass   class of the Java object to write
     * @param prettyPrint indent generated JSON
     * @param <T>         type of the Java object to write
     * @return generated JSON string
     * @throws IOException if the object is not writable
     */
    public static <T> String writeToString(T object, Class<? extends T> javaClass, boolean prettyPrint) throws IOException {
        try (StringWriter writer = new StringWriter()) {
            write(writer, object, javaClass, prettyPrint);
            return writer.toString();
        }
    }
}
