/*
 * Copyright 2015 OpenEstate.org.
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

package org.openestate.io.trovit.xml.types;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * IntBool.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public class IntBool implements Serializable
{
  private final static long serialVersionUID = 425176874298955006L;
  public BigInteger intValue;
  public Boolean boolValue;

  public IntBool( BigInteger intValue )
  {
    this.boolValue = null;
    this.intValue = intValue;
  }

  public IntBool( Boolean boolValue )
  {
    this.intValue = null;
    this.boolValue = boolValue;
  }

  public Boolean getBoolValue()
  {
    return boolValue;
  }

  public BigInteger getIntValue()
  {
    return intValue;
  }

  public void setBoolValue( Boolean boolValue )
  {
    this.intValue = null;
    this.boolValue = boolValue;
  }

  public void setIntValue( BigInteger intValue )
  {
    this.boolValue = null;
    this.intValue = intValue;
  }
}