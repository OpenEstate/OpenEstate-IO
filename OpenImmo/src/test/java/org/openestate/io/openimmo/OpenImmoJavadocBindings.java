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
package org.openestate.io.openimmo;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * OpenImmoJavadocBinding.
 *
 * @author Andreas Rudolph
 */
public class OpenImmoJavadocBindings {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(OpenImmoJavadocBindings.class);

    public static void main(String[] args) {
        String[] feedbackNames = new String[]{
                "fehlerliste",
                "interessent",
                "objekt",
                "openimmo_feedback",
                "sender",
                "status",
        };

        TreeSet<String> elementNames = new TreeSet<>();
        TreeMap<String, String> typeNames = new TreeMap<>();
        for (Class clazz : ClassFinder.find(OpenImmoUtils.PACKAGE)) {
            XmlRootElement element = (XmlRootElement) clazz.getAnnotation(XmlRootElement.class);
            if (element != null) {
                elementNames.add(element.name());
                continue;
            }

            XmlType type = (XmlType) clazz.getAnnotation(XmlType.class);
            if (type != null) {
                typeNames.put(type.name(), clazz.getSimpleName());
            }
        }

        System.out.println(StringUtils.repeat("-", 50));
        System.out.println("XML elements in openimmo.xsd");
        System.out.println(StringUtils.repeat("-", 50));
        for (String name : elementNames) {
            if (ArrayUtils.contains(feedbackNames, name)) continue;
            System.out.println("\n"
                    + "<jaxb:bindings node=\"/xsd:schema/xsd:element[@name='" + name + "']\">\n"
                    + "  <jaxb:class>\n"
                    + "    <jaxb:javadoc><![CDATA[Java class for &lt;" + name + "&gt; element.]]></jaxb:javadoc>\n"
                    + "  </jaxb:class>\n"
                    + "</jaxb:bindings>");
        }
        System.out.println();

        System.out.println(StringUtils.repeat("-", 50));
        System.out.println("XML elements in openimmo_feedback.xsd");
        System.out.println(StringUtils.repeat("-", 50));
        for (String name : elementNames) {
            if (!ArrayUtils.contains(feedbackNames, name)) continue;
            System.out.println("\n"
                    + "<jaxb:bindings node=\"/xsd:schema/xsd:element[@name='" + name + "']\">\n"
                    + "  <jaxb:class>\n"
                    + "    <jaxb:javadoc><![CDATA[Java class for &lt;" + name + "&gt; element.]]></jaxb:javadoc>\n"
                    + "  </jaxb:class>\n"
                    + "</jaxb:bindings>");
        }
        System.out.println();

        System.out.println(StringUtils.repeat("-", 50));
        System.out.println("XML types");
        System.out.println(StringUtils.repeat("-", 50));
        for (String name : typeNames.keySet()) {
            System.out.println("\n"
                    + "<jaxb:bindings node=\"/xsd:schema/xsd:complexType[@name='" + name + "']\">\n"
                    + "  <jaxb:class name=\"" + typeNames.get(name) + "\">\n"
                    + "    <jaxb:javadoc><![CDATA[Java class for \"" + name + "\" complex type.]]></jaxb:javadoc>\n"
                    + "  </jaxb:class>\n"
                    + "</jaxb:bindings>");
        }
        System.out.println();
    }

    @SuppressWarnings("WeakerAccess")
    private final static class ClassFinder {
        private final static char DOT = '.';
        private final static char SLASH = '/';
        private final static String CLASS_SUFFIX = ".class";
        private final static String BAD_PACKAGE_ERROR
                = "Unable to get resources from path '%s'. Are you sure the given '%s' package exists?";

        public static List<Class<?>> find(final String scannedPackage) {
            return find(scannedPackage, Thread.currentThread().getContextClassLoader());
        }

        @SuppressWarnings("Duplicates")
        public static List<Class<?>> find(final String scannedPackage, final ClassLoader classLoader) {
            final String scannedPath = scannedPackage.replace(DOT, SLASH);
            final Enumeration<URL> resources;
            try {
                resources = classLoader.getResources(scannedPath);
            } catch (IOException e) {
                throw new IllegalArgumentException(String.format(BAD_PACKAGE_ERROR, scannedPath, scannedPackage), e);
            }
            final List<Class<?>> classes = new LinkedList<>();
            while (resources.hasMoreElements()) {
                final File file = new File(resources.nextElement().getFile());
                classes.addAll(find(file, scannedPackage));
            }
            return classes;
        }

        @SuppressWarnings("Duplicates")
        private static List<Class<?>> find(final File file, final String scannedPackage) {
            final List<Class<?>> classes = new LinkedList<>();
            if (file.isDirectory()) {
                for (File nestedFile : ObjectUtils.defaultIfNull(file.listFiles(), new File[]{})) {
                    classes.addAll(find(nestedFile, scannedPackage));
                }
                //File names with the $1, $2 holds the anonymous inner classes, we are not interested on them.
            } else if (file.getName().endsWith(CLASS_SUFFIX)
                    && !file.getName().contains("$")) {

                final int beginIndex = 0;
                final int endIndex = file.getName().length() - CLASS_SUFFIX.length();
                final String className
                        = file.getName().substring(beginIndex, endIndex);
                try {
                    final String resource = scannedPackage + DOT + className;
                    classes.add(Class.forName(resource));
                } catch (ClassNotFoundException ignore) {
                }
            }
            return classes;
        }
    }
}