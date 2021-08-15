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

import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import javax.validation.ConstraintViolation;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openestate.io.idealista.json.Customer;
import org.openestate.io.idealista.json.Property;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Andreas Rudolph
 */
@RunWith(JUnit4.class)
public class IdealistaRootElementTest {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(IdealistaRootElementTest.class);

    private static Reader createReader(String jsonFile) {
        //noinspection ConstantConditions
        return new InputStreamReader(IdealistaRootElementTest.class.getResourceAsStream(jsonFile), StandardCharsets.UTF_8);
    }

    @Test
    public void testParser() {

        try (Reader json = createReader("properties.json")) {
            IdealistaRootElement customer = new IdealistaRootElement(json);

            for (Property p : customer.getObject().getProperties()) {
                LOGGER.debug("found property type {}", p.getFeatures().getClass().getName());
            }

            LOGGER.debug(customer.writeToString());
        } catch (Exception ex) {
            LOGGER.warn("Can't read example properties.json!", ex);
            Assert.fail();
        }

        try (Reader json = createReader("customerNewDevelopments.json")) {
            IdealistaRootElement customer = new IdealistaRootElement(json);
            LOGGER.debug(customer.writeToString());
        } catch (Exception ex) {
            LOGGER.warn("Can't read example customerNewDevelopments.json!", ex);
            Assert.fail();
        }
    }

    @Test
    public void testValidator() {
        try (Reader json = createReader("properties.json")) {
            IdealistaRootElement properties = new IdealistaRootElement(json);

            Set<ConstraintViolation<Customer>> violations = properties.getViolations();
            if (violations.isEmpty()) {
                LOGGER.debug("no violations found");
            } else {
                LOGGER.debug("{} violations found", violations.size());
                for (ConstraintViolation<Customer> violation : violations) {
                    LOGGER.debug("> {}", violation.getMessage());
                }
            }
        } catch (Exception ex) {
            LOGGER.warn("Can't read example properties.json!", ex);
            Assert.fail();
        }
    }
}
