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
 * SilentValidationHandler.
 *
 * @author Andreas Rudolph
 */
public class SilentValidationHandler implements ValidationEventHandler
{
  private final static Logger LOGGER = LoggerFactory.getLogger( SilentValidationHandler.class );

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
      LOGGER.error( "fatal validation error" );
      if (line>-1 && col>-1) LOGGER.error( "> at line " + line + " / column " + col );
      LOGGER.error( "> " + event.getMessage() );
      return false;
    }

    if (ValidationEvent.WARNING==event.getSeverity())
    {
      LOGGER.warn( "validation warning" );
      if (line>-1 && col>-1) LOGGER.error( "> at line " + line + " / column " + col );
      LOGGER.warn( "> " + event.getMessage() );
    }
    else
    {
      LOGGER.error( "validation error" );
      if (line>-1 && col>-1) LOGGER.error( "> at line " + line + " / column " + col );
      LOGGER.error( "> " + event.getMessage() );
    }

    return true;
  }
}