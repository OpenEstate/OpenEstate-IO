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

package org.openestate.io.core;

import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A {@link ValidationEventHandler} that handles validation events during XML
 * processing.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public class XmlValidationHandler implements ValidationEventHandler
{
  private final static Logger LOGGER = LoggerFactory.getLogger( XmlValidationHandler.class );

  /**
   * Receive notification of a validation warning or error.
   *
   * The ValidationEvent will have a
   * {@link javax.xml.bind.ValidationEventLocator} embedded in it that
   * indicates where the error or warning occurred.
   *
   * <p>
   * If an unchecked runtime exception is thrown from this method, the JAXB
   * provider will treat it as if the method returned false and interrupt
   * the current unmarshal, validate, or marshal operation.
   *
   * @param event the encapsulated validation event information.  It is a
   * provider error if this parameter is null.
   * @return true if the JAXB Provider should attempt to continue the current
   *         unmarshal, validate, or marshal operation after handling this
   *         warning/error, false if the provider should terminate the current
   *         operation with the appropriate <tt>UnmarshalException</tt>,
   *         <tt>ValidationException</tt>, or <tt>MarshalException</tt>.
   * @throws IllegalArgumentException if the event object is null.
   */
  @Override
  public boolean handleEvent( ValidationEvent event )
  {
    int line = -1;
    int col = -1;
    if (event.getLocator()!=null)
    {
      line = event.getLocator().getLineNumber();
      col = event.getLocator().getColumnNumber();
    }

    if (ValidationEvent.FATAL_ERROR==event.getSeverity())
    {
      LOGGER.warn( "fatal validation error" );
      if (line>-1 && col>-1) LOGGER.warn( "> at line " + line + " / column " + col );
      LOGGER.warn( "> " + event.getMessage() );
      return false;
    }

    if (ValidationEvent.WARNING==event.getSeverity())
    {
      LOGGER.warn( "validation warning" );
      if (line>-1 && col>-1) LOGGER.warn( "> at line " + line + " / column " + col );
      LOGGER.warn( "> " + event.getMessage() );
    }
    else
    {
      LOGGER.warn( "validation error" );
      if (line>-1 && col>-1) LOGGER.warn( "> at line " + line + " / column " + col );
      LOGGER.warn( "> " + event.getMessage() );
    }

    return true;
  }
}