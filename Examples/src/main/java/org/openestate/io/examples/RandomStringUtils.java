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

package org.openestate.io.examples;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.text.CharacterPredicates;
import org.apache.commons.text.RandomStringGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Helper classes for the example classes to generate random strings.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public class RandomStringUtils
{
  private final static Logger LOGGER = LoggerFactory.getLogger( RandomStringUtils.class );

  private RandomStringUtils()
  {
  }

  public static String randomAlphanumeric( int length )
  {
    final RandomStringGenerator generator = new RandomStringGenerator.Builder()
      .filteredBy( CharacterPredicates.DIGITS, CharacterPredicates.LETTERS )
      .build();

    StringBuilder random = new StringBuilder();
    while (random.length()<length)
    {
      random.append( DigestUtils.sha512Hex( generator.generate( length ) ) );
    }
    return random.substring( 0, length );
  }

  public static String randomNumeric( int length )
  {
    final RandomStringGenerator generator = new RandomStringGenerator.Builder()
      .filteredBy( CharacterPredicates.DIGITS )
      .build();

    return generator.generate( length );
  }
}