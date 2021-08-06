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
package org.openestate.io.build;

import com.fasterxml.jackson.databind.JsonNode;
import com.sun.codemodel.JType;
import java.util.HashMap;
import java.util.Map;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.rules.RuleFactory;
import org.jsonschema2pojo.util.NameHelper;

/**
 * A customized {@link RuleFactory} for creating Java objects from a JSON schema.
 * <p>
 * This implementation fixes naming problems in generated getter, setter and with methods.
 *
 * @author Andreas Rudolph
 * @since 1.5
 */
@SuppressWarnings("unused")
public class CustomJsonRules extends RuleFactory {
    private NameHelper nameHelper = null;

    @Override
    public synchronized NameHelper getNameHelper() {
        if (this.nameHelper == null) {
            this.nameHelper = new CustomNameHelper(this.getGenerationConfig());
        }
        return this.nameHelper;
    }

    private static class CustomNameHelper extends NameHelper {
        private Map<String, String> names = new HashMap<>();

        private CustomNameHelper(GenerationConfig generationConfig) {
            super(generationConfig);
        }

        @Override
        public String getBuilderName(String propertyName, JsonNode node) {
            if (!node.has("javaName")) {
                //System.out.println("getGetterName => '" + propertyName + "'");
                if (this.names.containsKey(propertyName)) {
                    propertyName = this.names.get(propertyName);
                    //System.out.println("=> '" + propertyName + "'");
                }
                //else {
                //    System.out.println("=> UNKNOWN");
                //}
            }
            //else {
            //    System.out.println(propertyName + " has javaName " + node.get("javaName").asText());
            //}

            return super.getBuilderName(propertyName, node);
        }

        @Override
        public String getPropertyName(String jsonFieldName, JsonNode node) {
            final String name = super.getPropertyName(jsonFieldName, node);

            //System.out.println("getPropertyName '" + jsonFieldName + "' => '" + name + "'");
            this.names.put(jsonFieldName, name);
            return name;
        }

        @Override
        public String getGetterName(String propertyName, JType type, JsonNode node) {
            if (!node.has("javaName")) {
                //System.out.println("getGetterName => '" + propertyName + "'");
                if (this.names.containsKey(propertyName)) {
                    propertyName = this.names.get(propertyName);
                    //System.out.println("=> '" + propertyName + "'");
                }
                //else {
                //    System.out.println("=> UNKNOWN");
                //}
            }
            //else {
            //    System.out.println(propertyName + " has javaName " + node.get("javaName").asText());
            //}

            return super.getGetterName(propertyName, type, node);
        }

        @Override
        public String getSetterName(String propertyName, JsonNode node) {
            if (!node.has("javaName")) {
                //System.out.println("getSetterName => '" + propertyName + "'");
                if (this.names.containsKey(propertyName)) {
                    propertyName = this.names.get(propertyName);
                    //System.out.println("=> '" + propertyName + "'");
                }
                //else {
                //    System.out.println("=> UNKNOWN");
                //}
            }
            //else {
            //    System.out.println(propertyName + " has javaName " + node.get("javaName").asText());
            //}

            return super.getSetterName(propertyName, node);
        }
    }
}