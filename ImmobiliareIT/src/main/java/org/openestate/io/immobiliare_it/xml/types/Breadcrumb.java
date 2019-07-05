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
package org.openestate.io.immobiliare_it.xml.types;

import org.apache.commons.lang3.StringUtils;

/**
 * Breadcrumb.
 *
 * @author Andreas Rudolph
 * @since 1.5
 */
@SuppressWarnings("WeakerAccess")
public class Breadcrumb {
    private String level1;
    private String level2;
    private String level3;

    public Breadcrumb() {
        this(null, null, null);
    }

    public Breadcrumb(String level1, String level2, String level3) {
        this.level1 = StringUtils.trimToEmpty(level1);
        this.level2 = StringUtils.trimToEmpty(level2);
        this.level3 = StringUtils.trimToEmpty(level3);
    }

    public String getLevel1() {
        return this.level1;
    }

    public String getLevel2() {
        return this.level2;
    }

    public String getLevel3() {
        return this.level3;
    }

    public static Breadcrumb read(String xmlValue) {
        String[] levels = StringUtils.split(xmlValue, "/");
        return (levels != null && levels.length == 3) ?
                new Breadcrumb(levels[0], levels[1], levels[2]) :
                null;
    }

    public void setLevel1(String level1) {
        this.level1 = StringUtils.trimToEmpty(level1);
    }

    public void setLevel2(String level2) {
        this.level2 = StringUtils.trimToEmpty(level2);
    }

    public void setLevel3(String level3) {
        this.level3 = StringUtils.trimToEmpty(level3);
    }

    public String write() {
        return StringUtils.replace(this.level1, "/", "-") + "/"
                + StringUtils.replace(this.level2, "/", "-") + "/"
                + StringUtils.replace(this.level3, "/", "-");
    }
}
