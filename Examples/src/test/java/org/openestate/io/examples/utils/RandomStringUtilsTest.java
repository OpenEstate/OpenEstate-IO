/*
 * Copyright 2015-2017 OpenEstate.org.
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
package org.openestate.io.examples.utils;

import org.apache.commons.lang3.CharUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * RandomStringUtilsTest.
 *
 * @since 1.3
 * @author Andreas Rudolph
 */
@RunWith( JUnit4.class )
public class RandomStringUtilsTest
{
  private static final Logger LOGGER = LoggerFactory.getLogger( RandomStringUtilsTest.class );

  private static boolean isAsciiAlpha( String value )
  {
    for (char c : value.toCharArray())
    {
      if (!CharUtils.isAsciiAlpha( c ))
        return false;
    }
    return true;
  }

  private static boolean isAsciiAlphanumeric( String value )
  {
    for (char c : value.toCharArray())
    {
      if (!CharUtils.isAsciiAlphanumeric( c ))
        return false;
    }
    return true;
  }

  private static boolean isAsciiNumeric( String value )
  {
    for (char c : value.toCharArray())
    {
      if (!CharUtils.isAsciiNumeric( c ))
        return false;
    }
    return true;
  }

  @Test
  public void testRandom() throws Exception
  {
    for (int length=1; length<10; length++)
    {
      String value = RandomStringUtils.random( length );
      //LOGGER.debug( "random alphanumeric string: " + value );

      Assert.assertEquals(
        "random string has a length of " + length,
        length, value.length() );

      Assert.assertEquals(
        "random string is alphanumeric",
        true, isAsciiAlphanumeric( value ) );
    }
  }

  @Test
  public void testRandomLetters() throws Exception
  {
    for (int length=1; length<10; length++)
    {
      String value = RandomStringUtils.randomLetters( length );
      //LOGGER.debug( "random alpha string: " + value );

      Assert.assertEquals(
        "random string has a length of " + length,
        length, value.length() );

      Assert.assertEquals(
        "random string is alpha",
        true, isAsciiAlpha( value ) );
    }
  }

  @Test
  public void testRandomNumbers() throws Exception
  {
    for (int length=1; length<10; length++)
    {
      String value = RandomStringUtils.randomNumeric( length );
      //LOGGER.debug( "random numeric string: " + value );

      Assert.assertEquals(
        "random string has a length of " + length,
        length, value.length() );

      Assert.assertEquals(
        "random string is numeric",
        true, isAsciiNumeric( value ) );
    }
  }
}