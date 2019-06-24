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

import java.text.NumberFormat;
import java.util.Locale;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * NumberUtilsTest.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
@RunWith(JUnit4.class)
public class NumberUtilsTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(NumberUtilsTest.class);

    @Test
    public void testParseNumber() {
        NumberFormat format = NumberFormat.getNumberInstance(Locale.ENGLISH);
        format.setGroupingUsed(false);
        format.setMinimumFractionDigits(0);

        Assert.assertEquals("1400", format.format(NumberUtils.parseNumber("1400", false)));
        Assert.assertEquals("1400", format.format(NumberUtils.parseNumber("1400", true)));

        Assert.assertEquals("1400", format.format(NumberUtils.parseNumber("1.400", true, Locale.GERMAN)));
        Assert.assertEquals("1400", format.format(NumberUtils.parseNumber("1.400", false, Locale.GERMAN)));
        Assert.assertEquals("1.4", format.format(NumberUtils.parseNumber("1,400", false, Locale.GERMAN)));
        Assert.assertEquals("1400.15", format.format(NumberUtils.parseNumber("1.400,15", false, Locale.GERMAN)));

        Assert.assertEquals("1.4", format.format(NumberUtils.parseNumber("1.400", false, Locale.ENGLISH)));
        Assert.assertEquals("1400", format.format(NumberUtils.parseNumber("1,400", true, Locale.ENGLISH)));
        Assert.assertEquals("1400", format.format(NumberUtils.parseNumber("1,400", false, Locale.ENGLISH)));
        Assert.assertEquals("1400.15", format.format(NumberUtils.parseNumber("1,400.15", false, Locale.ENGLISH)));
    }
}