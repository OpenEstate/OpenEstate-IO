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

import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidationException;
import javax.validation.ValidatorFactory;
import javax.validation.groups.Default;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Some helper functions for validation.
 *
 * @author Andreas Rudolph
 * @since 1.5
 */
@SuppressWarnings("WeakerAccess")
public class ValidationUtils {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(ValidationUtils.class);
    private final static ValidatorFactory FACTORY = Validation.buildDefaultValidatorFactory();

    private ValidationUtils() {
    }

    /**
     * Validates all constraints on {@code object}.
     *
     * @param object object to validate
     * @param groups the group or list of groups targeted for validation (defaults to {@link Default})
     * @param <T>    the type of the object to validate
     * @return constraint violations or an empty set if none
     * @throws IllegalArgumentException if object is {@code null}
     *                                  or if {@code null} is passed to the varargs groups
     * @throws ValidationException      if a non recoverable error happens
     *                                  during the validation process
     */
    public static <T> Set<ConstraintViolation<T>> getViolations(T object, Class<?>... groups) {
        return FACTORY.getValidator()
                .validate(object, groups);
    }

    /**
     * Determines, if an {@code object} contains any validation errors.
     *
     * @param object object to validate
     * @param groups the group or list of groups targeted for validation (defaults to {@link Default})
     * @param <T>    the type of the object to validate
     * @return true, if the {@code object} does not contain any validation errors
     */
    public static <T> boolean isValid(T object, Class<?>... groups) {
        try {
            return getViolations(object, groups).isEmpty();
        } catch (Exception ex) {
            LOGGER.warn("An internal validation error occurred!", ex);
            return false;
        }
    }
}
