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

import org.apache.commons.text.CharacterPredicate;
import org.apache.commons.text.RandomStringGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Helper methods to generate random strings.
 *
 * @since 1.3
 * @author Andreas Rudolph
 */
public class RandomStringUtils
{
  private final static Logger LOGGER = LoggerFactory.getLogger( RandomStringUtils.class );
  private final static CharacterPredicate NUMBERS = new CharacterPredicate()
  {
    @Override
    public boolean test( int codePoint )
    {
      // Accept codepoint from 0x30 to 0x39,
      // which represents a decimal digit in Unicode.
      return codePoint >= 0x30 && codePoint <= 0x39;
    }
  };
  private final static CharacterPredicate LETTERS = new CharacterPredicate()
  {
    @Override
    public boolean test( int codePoint )
    {
      // Accept codepoint from 0x41 to 0x5a or 0x61 to 0x7a,
      // which represents latin-1 characters in Unicode.
      return (codePoint >= 0x41 && codePoint <= 0x5a)
        || (codePoint >= 0x61 && codePoint <= 0x7a);
    }
  };

  private RandomStringUtils()
  {
    super();
  }

  /**
   * Generate a random string with ASCII letters and digits.
   *
   * @param length
   * length of the generated string
   *
   * @return
   * generated string
   */
  public static String random( int length )
  {
    return new RandomStringGenerator.Builder()
      .filteredBy( NUMBERS, LETTERS )
      .build().generate( length );
  }

  /**
   * Generate a random string with ASCII letters.
   *
   * @param length
   * length of the generated string
   *
   * @return
   * generated string
   */
  public static String randomLetters( int length )
  {
    return new RandomStringGenerator.Builder()
      .filteredBy( LETTERS )
      .build().generate( length );
  }

  /**
   * Generate a random string with ASCII digits.
   *
   * @param length
   * length of the generated string
   *
   * @return
   * generated string
   */
  public static String randomNumeric( int length )
  {
    return new RandomStringGenerator.Builder()
      .filteredBy( NUMBERS )
      .build().generate( length );
  }
}