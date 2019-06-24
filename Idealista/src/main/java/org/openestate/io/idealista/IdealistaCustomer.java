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

import java.io.IOException;
import java.io.Reader;
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
public class IdealistaCustomer extends JsonRootElement<Customer> {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(IdealistaCustomer.class);

    /**
     * Create an {@link IdealistaCustomer} with a new / empty Java object.
     *
     * @throws IllegalStateException if the empty instance of the Java object can not be created
     */
    public IdealistaCustomer() {
        super();
    }

    /**
     * Create an {@link IdealistaCustomer} from a JSON {@link String}.
     *
     * @param json JSON string to create the object from
     * @throws IOException if the object is not readable
     */
    public IdealistaCustomer(String json) throws IOException {
        super(json);
    }

    /**
     * Create an {@link IdealistaCustomer} from a JSON {@link Reader}.
     *
     * @param json JSON reader to create the object from
     * @throws IOException if the object is not readable
     */
    public IdealistaCustomer(Reader json) throws IOException {
        super(json);
    }

    /**
     * Create an {@link IdealistaCustomer} with the corresponding Java object.
     *
     * @param object Java object to contain
     * @throws IllegalArgumentException if the object parameter is null
     */
    public IdealistaCustomer(Customer object) {
        super(object);
    }

    @Override
    public Class<Customer> getJavaClass() {
        return Customer.class;
    }
}
